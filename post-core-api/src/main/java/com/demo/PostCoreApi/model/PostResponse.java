package com.demo.PostCoreApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostResponse {
    String postid;
    String postRecipientId;
    String postItem;
    String status;
}