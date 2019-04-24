.class Lo/awh;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static c(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)Ljava/lang/String;
    .locals 5

    .line 25
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 28
    const-string v0, "Id"

    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getUserID_()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 29
    const-string v0, "Gender"

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getGender_()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 30
    const-string v0, "ImageURL"

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getImageURL_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 31
    const-string v0, "ImageURLDownload"

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getImageURLDownload_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    const-string v0, "NickName"

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getNickName_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 33
    const-string v0, "PhoneDigest"

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getPhoneDigest_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    const-string v0, "PrivacySetFlags"

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getPrivacySetFlags_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    const-string v0, "QrCode"

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getQrCode_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 37
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getRegion_()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    move-result-object v4

    .line 38
    if-eqz v4, :cond_0

    .line 40
    const-string v0, "Province"

    invoke-virtual {v4}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->getProvince_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    const-string v0, "City"

    invoke-virtual {v4}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->getCity_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 42
    const-string v0, "NationalCode"

    invoke-virtual {v4}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->getNationalCode_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 45
    :cond_0
    const-string v0, "Signature"

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getSignature_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    const-string v0, "UserAccount"

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getUserAccount_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 47
    const-string v0, "UserType"

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getUserType_()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    goto :goto_0

    .line 49
    :catch_0
    move-exception v4

    .line 51
    const-string v0, "SettingUtil"

    const-string v1, "convert UserSNSInfo to json data meet JSONException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static e(Ljava/lang/String;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;
    .locals 6

    .line 64
    const/4 v3, 0x0

    .line 67
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 68
    new-instance v0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;-><init>()V

    move-object v3, v0

    .line 69
    const-string v0, "Id"

    const-wide/16 v1, 0x0

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->setUserID_(J)V

    .line 70
    const-string v0, "Gender"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->setGender_(I)V

    .line 71
    const-string v0, "ImageURL"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->setImageURL_(Ljava/lang/String;)V

    .line 72
    const-string v0, "ImageURLDownload"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->setImageURLDownload_(Ljava/lang/String;)V

    .line 73
    const-string v0, "NickName"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->setNickName_(Ljava/lang/String;)V

    .line 74
    const-string v0, "PhoneDigest"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->setPhoneDigest_(Ljava/lang/String;)V

    .line 75
    const-string v0, "PrivacySetFlags"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->setPrivacySetFlags_(Ljava/lang/String;)V

    .line 76
    const-string v0, "QrCode"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->setQrCode_(Ljava/lang/String;)V

    .line 78
    const-string v0, "Province"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "City"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "NationalCode"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    :cond_0
    new-instance v5, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    invoke-direct {v5}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;-><init>()V

    .line 81
    const-string v0, "Province"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->setProvince_(Ljava/lang/String;)V

    .line 82
    const-string v0, "City"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->setCity_(Ljava/lang/String;)V

    .line 83
    const-string v0, "NationalCode"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->setNationalCode_(Ljava/lang/String;)V

    .line 84
    invoke-virtual {v3, v5}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->setRegion_(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;)V

    .line 87
    :cond_1
    const-string v0, "Signature"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->setSignature_(Ljava/lang/String;)V

    .line 88
    const-string v0, "UserAccount"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->setUserAccount_(Ljava/lang/String;)V

    .line 89
    const-string v0, "UserType"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->setUserType_(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    goto :goto_0

    .line 91
    :catch_0
    move-exception v4

    .line 93
    const-string v0, "SettingUtil"

    const-string v1, "convert json data to UserSNSInfo meet JSONException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    :goto_0
    return-object v3
.end method
