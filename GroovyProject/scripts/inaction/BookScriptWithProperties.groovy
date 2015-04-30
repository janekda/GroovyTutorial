class Book {
    String title
}

def groovyBook = new Book()

groovyBook.setTitle('Groovy conquers the world')
assert groovyBook.getTitle() == 'Groovy conquers the world'

groovyBook.title = 'Groovy in Action'
assert groovyBook.title == 'Groovy in Action'
