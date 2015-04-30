package cz.chodura

@Grab(group='org.codehaus.groovy.modules.http-builder',
module='http-builder', version='0.5.2')
// import of HttpBuilder related stuff
import groovyx.net.http.*

class HtmlParser {
    
    static main(args) {
        
    }
    
    private parse(){
        
        def http = new HTTPBuilder("http://www.gumtree.com/cgi-bin/" +
                "list_postings.pl?search_terms=car&search_location=London&ubercat=1")
        
        def html = http.get([:])
        
        html."**".findAll { it.@class.toString().contains("hlisting")}.each {
            // doSomething with each entry
        }
        
        def ads = html."**".findAll { it.@class.toString().contains("hlisting")}
        .collect {
            [
                link : it.A[0].@href.text(),
                title : it.A[0].@title.text(),
                imgUrl : it.A[0].IMG[0].@src.text()
            ]
        }
    }
}
