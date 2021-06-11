package com.pjh.mvvm;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
@Getter
public class USER {

    @NonNull String mUserName;
    int mUserAge;
    @NonNull String mPhoneNumber;


}
