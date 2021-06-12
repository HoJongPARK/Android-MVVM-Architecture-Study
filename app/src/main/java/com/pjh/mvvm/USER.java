package com.pjh.mvvm;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
@Getter
public class USER {

    public @NonNull String mUserName;
    public int mUserAge;
    public @NonNull String mPhoneNumber;


}
