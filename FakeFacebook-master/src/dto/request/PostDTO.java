package dto.request;


public class PostDTO {

    private int id;
    private String content;
    private String status;

    public PostDTO() {
    }

    public PostDTO(int id, String content, String status) {
        this.id = id;
        this.content = content;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
