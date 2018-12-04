package processor;

import model.AbstractNameEntity;

public interface Processor<T extends AbstractNameEntity,T2> {
	Converter<T,T2> getConverter();
	boolean accept(T t);
}
