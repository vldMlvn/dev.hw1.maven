package dto;

import com.google.gson.Gson;

public class UserEntity {
    private String firsName;
    private String lastName;

    public UserEntity(String firsName,String lastName){
        this.firsName = firsName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
