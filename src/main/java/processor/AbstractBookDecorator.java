package processor;

import model.Article;
import model.Book;
import org.mapstruct.factory.Mappers;

public abstract class AbstractBookDecorator implements BookMapper{

	@Override
	public Book convert(Article article) {
		BookMapper mapper = Mappers.getMapper(BookMapper.class);
		Book convert = mapper.convert(article);
		//Do something else
		return convert;
	}
}
