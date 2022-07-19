package com.demo.PostCoreApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

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
