Book gina = new Book('Groovy in Action')

assert gina.getTitle()         == 'Groovy in Action'
assert getTitleBackwards(gina) == 'noitcA ni yvoorG'

println "konec"

String getTitleBackwards(book) {
    
    title = book.getTitle()
    return title.reverse()
}