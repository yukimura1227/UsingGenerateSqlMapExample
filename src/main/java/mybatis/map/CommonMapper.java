package mybatis.map;

public interface CommonMapper<T> extends CommonSelectMapper<T> {
	public void insert(T param);
	public void updateByValue(T param);
	public void deleteByValue(T param);
}
