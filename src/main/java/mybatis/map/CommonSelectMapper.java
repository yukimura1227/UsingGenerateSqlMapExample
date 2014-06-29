package mybatis.map;

import java.util.List;

public interface CommonSelectMapper<T> {
	public List<T> selectAll();
	public List<T> selectByValue(T param);
}
