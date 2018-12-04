package processor;

import model.AbstractNameEntity;

public interface Converter<T extends AbstractNameEntity, T2> {
	T2 convert(T t);
	T convert(T2 t2);
}
