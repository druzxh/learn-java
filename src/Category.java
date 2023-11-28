public class Category {
    private String id;
    // Getter
    public String getId(){
        return id;
    }
    // Setter
    public void setId(String id){
        // Validation
        if(id != null){
            this.id = id;
        }
    }
}
