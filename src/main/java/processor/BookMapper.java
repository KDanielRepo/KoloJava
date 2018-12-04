package processor;

import model.Article;
import model.Book;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper
@DecoratedWith(AbstractBookDecorator.class)
public interface BookMapper {
	Book convert(Article article);
	Article convert(Book book);
}
