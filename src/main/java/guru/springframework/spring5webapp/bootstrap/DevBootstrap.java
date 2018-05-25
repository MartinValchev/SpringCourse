package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository,BookRepository bookRepository,PublisherRepository publisherRepository){
        this.authorRepository=authorRepository;
        this.bookRepository= bookRepository;
        this.publisherRepository = publisherRepository;
    }
private void initData(){
    //Eric
    Author eric = new Author("Eric", "Evans");
    Publisher dddPublisher =  new Publisher("Harper Collins", "New York,USA");
    Book ddd = new Book("Domain Driven Design","1234",dddPublisher);
    eric.getBooks().add(ddd);
    authorRepository.save(eric);
    publisherRepository.save(dddPublisher);
    bookRepository.save(ddd);

    //ROD
    Author rod  = new Author("Rod","Johnson");
    Publisher noEJBPublisher  = new Publisher("Worx","California, USA");
    Book noEJB = new Book("J2EE Developer without EJB","2234",noEJBPublisher);
    rod.getBooks().add(noEJB);
    authorRepository.save(rod);
    publisherRepository.save(noEJBPublisher);
    bookRepository.save(noEJB);


}

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
