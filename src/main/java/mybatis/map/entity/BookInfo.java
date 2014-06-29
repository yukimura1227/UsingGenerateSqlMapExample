package mybatis.map.entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class BookInfo {
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publish;
    private String publishedDate;
    private String isbn4Where;
    private String title4Where;
    private String author4Where;
    private String price4Where;
    private String publish4Where;
    private String publishedDate4Where;

    @Override
    public int hashCode() {
        return java.util.Objects.hash(isbn,title,author,price,publish,publishedDate,isbn4Where,title4Where,author4Where,price4Where,publish4Where,publishedDate4Where);
    }

    @Override
    public boolean equals(Object obj) {
        if( this == obj) {
            return true;
        }
        if( obj == null ) {
            return false;
        }
        if( this.hashCode() == obj.hashCode() ) {
            return true;
        }
        return false;
    }
}