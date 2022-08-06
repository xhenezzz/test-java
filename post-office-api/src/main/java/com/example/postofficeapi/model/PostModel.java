package com.example.postofficeapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostModel {
    String postid;
    String clientid;
    String postRecipientId;
    String postItem;
    String status;
}
