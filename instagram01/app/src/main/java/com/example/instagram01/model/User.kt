package com.example.instagram01.model

import android.net.Uri
import com.example.instagram01.R
import com.example.instagram01.reusable_classes.DataTest

class User {
    private var email: String = "" // khóa chính
    private var phoneNumber: Short = 0
    private var sex: Boolean = true
    private var birthday: String = ""
    private var fullName: String = ""
    private var userName: String = "" // độc nhất
    private var desc: String = ""
    private var avt: Uri = DataTest().imageUriTest(R.drawable.avt_test)

    constructor()
    constructor(
        email: String,
        phoneNumber: Short,
        sex: Boolean,
        birthday: String,
        fullName: String,
        userName: String,
        desc: String,
        avt: Uri
    ) {
        this.email = email
        this.phoneNumber = phoneNumber
        this.sex = sex
        this.birthday = birthday
        this.fullName = fullName
        this.userName = userName
        this.desc = desc
        this.avt = avt
    }

    public var Email: String
        get() { return email}
        set(value) { email = value}
    public var PhoneNumber: Short
        get() { return phoneNumber}
        set(value) { phoneNumber = value}

    public var Sex: Boolean
        get() { return sex}
        set(value) { sex = value}

    public var Birthday: String
        get() { return birthday}
        set(value) { birthday = value}

    public var FullName: String
        get() { return fullName}
        set(value) { fullName = value}

    public var UserName: String
        get() { return userName}
        set(value) { userName = value}

    public var Desc: String
        get() { return desc}
        set(value) { desc = value}

    public var Avt: Uri
        get() { return avt}
        set(value) { avt = value}

    override fun toString(): String {
        return "User(email='$email', phoneNumber=$phoneNumber, sex=$sex, birthday='$birthday', fullName='$fullName', userName='$userName', desc='$desc', avt=$avt)"
    }


}