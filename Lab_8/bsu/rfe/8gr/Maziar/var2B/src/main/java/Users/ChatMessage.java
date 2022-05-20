package Users;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ChatMessage {
    // Текст сообщения
    private String message;
    // Автор сообщения
    private ChatUser author;
    Calendar calendar = new GregorianCalendar();
    SimpleDateFormat formattedDate = new SimpleDateFormat("dd.MM.yyyy");
    SimpleDateFormat formattedTime = new SimpleDateFormat("hh.mm.ss a");

    // Временная метка сообщения (в микросекундах)
    private long timestamp;
    // Отображенпя сообщения за х последних секунд
    private long sek = 30;

    public ChatMessage(String message, ChatUser author, long timestamp) {
        super();
        this.message = message;
        this.author = author;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ChatUser getAuthor() {
        return author;
    }
    public String getData()
    {
        return formattedDate.format(calendar.getTime()).toString();
    }
    public String getTime()
    {
        return formattedTime.format((calendar.getTime())).toString();
    }

    public void setAuthor(ChatUser author) {
        this.author = author;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getSek() {
        return sek;
    }

}