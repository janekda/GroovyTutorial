package cz.chodura


class Systemout {
    
    def today = new Date()
    
    public static void main(String[] args) {
        
        Systemout systemout = new Systemout()
        systemout.decrements()
    }
    
    /**
     * Vypis podle Javy a podle groovy.
     */
    public void sayHello() {
        
        System.out.println("Hello world!")
        println today
    }
    
    /**
     * Prace se souborem a closures.
     * 
     * @return
     */
    private printLinesCount(){
        
        def number = 0
        new File('D:\\dotazy.sql').eachLine {line ->
            number++
            println "$number : $line"
        }
    }
    
    /**
     * Prace s kolekcemi a seznamy, s vlastnostmi beany.
     * @return
     */
    private workWithCollection(){
        
        def classes = [String, List, File]
        for (clazz in classes) {
            
            // vypis balicku v jednotlivych tridach ze seznamu
            println clazz.'package'.name
        }
        
        //jeste rychlejsi zapis
        println( [String, List, File].'package'.name )
        
        
    }
    
    /**
     * Prace s XML a dynamickymi vlastnostmi.
     * 
     * @return
     */
    private workWithXml(){
        
        String currentDirectory = System.getProperty("user.dir")
        println (currentDirectory)
        
        //kdyz je promenna uvnitr reteze, musi byt retezec v uvozovkach. Slozene zavorky byt nemusi
        def customers = new XmlSlurper().parse(new File("$currentDirectory\\src\\customers.xml"))
        for (customer in customers.corporate.customer) {
            
            println "${customer.@name} works for ${customer.@company}"
        }
        
        
    }
    
    
    private showFiles(){
        
        String currentDirectory = System.getProperty("user.dir")
        new File(".").eachFileRecurse {println it}
    }
    
    private operatorsWithCollection(){
        
        def x = 1..3
        def y = 10..12
        
        println x.plus(y)
        println x.minus(y)
        
        def z = ["a", "b", "c"]
        println ""
        println x.plus(z)
        println x.minus(z)
        
        def a = ["a", "b", 1]
        println ""
        println x.plus(a)
        println x.minus(a)
        
        def b = ["a", "b"]
        println ""
        println x.plus(b)
        println x.minus(b)
    }
    
    
    private decrements(){
        
        def a = 10
        
        assert (++a == 11)
        assert (a-- == 11)
        assert (a == 10)
    }
}
