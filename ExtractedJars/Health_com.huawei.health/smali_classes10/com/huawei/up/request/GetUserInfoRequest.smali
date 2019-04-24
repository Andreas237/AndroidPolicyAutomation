.class public Lcom/huawei/up/request/GetUserInfoRequest;
.super Lcom/huawei/up/request/HttpRequestBase;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "GetUserInfoRequest"

.field public static final TAG_GET_USER_INFO:Ljava/lang/String; = "getUserInfoTag"

.field private static final TAG_QUERY_RANGE_FLAG:Ljava/lang/String; = "queryRangeFlag"

.field private static final TAG_REQUESTNAME:Ljava/lang/String; = "GetUserInfoReq"

.field private static final TAG_USER_ID:Ljava/lang/String; = "userID"

.field private static final TAG_USER_INFO:Ljava/lang/String; = "userInfo"

.field private static final TAG_VERSION:Ljava/lang/String; = "version"


# instance fields
.field private authorization:Ljava/lang/String;

.field private cookie:Ljava/lang/String;

.field private mAttributeValue:Ljava/lang/Integer;

.field private mContext:Landroid/content/Context;

.field private mQueryRangeFlag:Ljava/lang/String;

.field private mUserID:Ljava/lang/String;

.field private mUserInfo:Lcom/huawei/hwid/core/datatype/UserInfo;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 49
    invoke-direct {p0, p1}, Lcom/huawei/up/request/HttpRequestBase;-><init>(Landroid/content/Context;)V

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/up/request/GetUserInfoRequest;->mUserInfo:Lcom/huawei/hwid/core/datatype/UserInfo;

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/huawei/up/request/GetUserInfoRequest;->baseURL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/IUserInfoMng/getUserInfo?Version=10001"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/up/request/GetUserInfoRequest;->requestURL:Ljava/lang/String;

    .line 51
    iput-object p1, p0, Lcom/huawei/up/request/GetUserInfoRequest;->mContext:Landroid/content/Context;

    .line 52
    return-void
.end method

.method private static getUserInfoCase1(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 224
    const-string v0, "nickName"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 225
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setNickName(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 226
    :cond_0
    const-string v0, "languageCode"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 227
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setLanguageCode(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 228
    :cond_1
    const-string v0, "firstName"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 229
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setFirstName(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 230
    :cond_2
    const-string v0, "lastName"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 231
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setLastName(Ljava/lang/String;)V

    goto :goto_0

    .line 232
    :cond_3
    const-string v0, "userState"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 233
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setUserState(Ljava/lang/String;)V

    goto :goto_0

    .line 234
    :cond_4
    const-string v0, "gender"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 235
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setGender(Ljava/lang/String;)V

    goto :goto_0

    .line 236
    :cond_5
    const-string v0, "birthDate"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 237
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setBirthDate(Ljava/lang/String;)V

    goto :goto_0

    .line 238
    :cond_6
    const-string v0, "address"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 239
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setAddress(Ljava/lang/String;)V

    goto :goto_0

    .line 240
    :cond_7
    const-string v0, "occupation"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 241
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setOccupation(Ljava/lang/String;)V

    .line 243
    :cond_8
    :goto_0
    return-void
.end method

.method private static getUserInfoCase2(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 248
    const-string v0, "headPictureURL"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 249
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setHeadPictureURL(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 250
    :cond_0
    const-string v0, "nationalCode"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 251
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setNationalCode(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 252
    :cond_1
    const-string v0, "province"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 253
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setProvince(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 254
    :cond_2
    const-string v0, "city"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 255
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setCity(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 256
    :cond_3
    const-string v0, "passwordPrompt"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 257
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setPasswordPrompt(Ljava/lang/String;)V

    goto :goto_0

    .line 258
    :cond_4
    const-string v0, "passwordAnswer"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 259
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setPasswordAnwser(Ljava/lang/String;)V

    goto :goto_0

    .line 260
    :cond_5
    const-string v0, "cloudAccount"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 261
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setCloudAccount(Ljava/lang/String;)V

    goto :goto_0

    .line 262
    :cond_6
    const-string v0, "ServiceFlag"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 263
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setServiceFlag(Ljava/lang/String;)V

    goto :goto_0

    .line 264
    :cond_7
    const-string v0, "userValidStatus"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 265
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setUserValidStatus(Ljava/lang/String;)V

    goto :goto_0

    .line 266
    :cond_8
    const-string v0, "InviterUserID"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 267
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setInviterUserID(Ljava/lang/String;)V

    .line 269
    :cond_9
    :goto_0
    return-void
.end method

.method private static getUserInfoCase3(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 274
    const-string v0, "Inviter"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 275
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setInviter(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 276
    :cond_0
    const-string v0, "updateTime"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 277
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setUpdateTime(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 278
    :cond_1
    const-string v0, "loginUserName"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 279
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setLoginUserName(Ljava/lang/String;)V

    goto :goto_0

    .line 280
    :cond_2
    const-string v0, "loginUserNameFlag"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 281
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setLoginUserNameFlag(Ljava/lang/String;)V

    goto :goto_0

    .line 282
    :cond_3
    const-string v0, "userStatusFlags"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 283
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setuserStatusFlags(Ljava/lang/String;)V

    goto :goto_0

    .line 284
    :cond_4
    const-string v0, "twoStepVerify"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 285
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->settwoStepVerify(Ljava/lang/String;)V

    goto :goto_0

    .line 286
    :cond_5
    const-string v0, "twoStepTime"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 287
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->settwoStepTime(Ljava/lang/String;)V

    goto :goto_0

    .line 288
    :cond_6
    const-string v0, "resetPasswdMode"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 289
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setResetPasswdMode(Ljava/lang/String;)V

    .line 291
    :cond_7
    :goto_0
    return-void
.end method

.method public static getUserInfoIntag(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 212
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 213
    :cond_0
    return-void

    .line 216
    :cond_1
    invoke-static {p0, p1, p2}, Lcom/huawei/up/request/GetUserInfoRequest;->getUserInfoCase1(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)V

    .line 217
    invoke-static {p0, p1, p2}, Lcom/huawei/up/request/GetUserInfoRequest;->getUserInfoCase2(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)V

    .line 218
    invoke-static {p0, p1, p2}, Lcom/huawei/up/request/GetUserInfoRequest;->getUserInfoCase3(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)V

    .line 219
    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 295
    iget-object v0, p0, Lcom/huawei/up/request/GetUserInfoRequest;->requestURL:Ljava/lang/String;

    const/16 v1, 0x1e

    const/16 v2, 0x1e

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->getHttpPost(Ljava/lang/String;IIZ)Lorg/apache/http/client/methods/HttpPost;

    move-result-object v4

    .line 296
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 297
    const-string v0, "GetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == httpPost!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    const-string v0, ""

    return-object v0

    .line 300
    :cond_0
    const-string v0, "Content-Type"

    const-string v1, "text/xml"

    invoke-virtual {v4, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    iget-object v0, p0, Lcom/huawei/up/request/GetUserInfoRequest;->authorization:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/up/utils/Utils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 302
    const-string v0, "Authorization"

    iget-object v1, p0, Lcom/huawei/up/request/GetUserInfoRequest;->authorization:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    :cond_1
    iget-object v0, p0, Lcom/huawei/up/request/GetUserInfoRequest;->cookie:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/up/utils/Utils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 305
    const-string v0, "Cookie"

    iget-object v1, p0, Lcom/huawei/up/request/GetUserInfoRequest;->cookie:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    :cond_2
    :try_start_0
    new-instance v0, Lorg/apache/http/entity/StringEntity;

    invoke-direct {v0, p1}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 311
    goto :goto_0

    .line 309
    :catch_0
    move-exception v5

    .line 310
    const-string v0, "GetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UnsupportedEncodingException error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    :goto_0
    const/4 v5, 0x0

    .line 314
    :try_start_1
    iget-object v0, p0, Lcom/huawei/up/request/GetUserInfoRequest;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/up/request/GetUserInfoRequest;->requestURL:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->getHttpClient(Landroid/content/Context;Ljava/lang/String;)Lorg/apache/http/client/HttpClient;
    :try_end_1
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v5, v0

    .line 317
    goto :goto_1

    .line 315
    :catch_1
    move-exception v6

    .line 316
    const-string v0, "GetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NSPException error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    :goto_1
    const/4 v0, 0x0

    if-ne v0, v5, :cond_3

    .line 319
    const-string v0, "GetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == httpClient1!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    const-string v0, ""

    return-object v0

    .line 322
    :cond_3
    const/4 v6, 0x0

    .line 324
    :try_start_2
    invoke-interface {v5, v4}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v0

    move-object v6, v0

    .line 327
    goto :goto_2

    .line 325
    :catch_2
    move-exception v7

    .line 326
    const-string v0, "GetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException error ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    :goto_2
    const/4 v7, 0x0

    .line 330
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 331
    :try_start_3
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    move-result-object v0

    move-object v7, v0

    .line 336
    :cond_4
    goto :goto_3

    .line 334
    :catch_3
    move-exception v8

    .line 335
    const-string v0, "GetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException error, e1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    :goto_3
    return-object v7
.end method

.method public getmQueryRangeFlag()Ljava/lang/String;
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/huawei/up/request/GetUserInfoRequest;->mQueryRangeFlag:Ljava/lang/String;

    return-object v0
.end method

.method public getmUserID()Ljava/lang/String;
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/huawei/up/request/GetUserInfoRequest;->mUserID:Ljava/lang/String;

    return-object v0
.end method

.method public packageRequest()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 57
    const/4 v0, 0x0

    return-object v0
.end method

.method public packageXML()Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 77
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 79
    :try_start_0
    invoke-static {v4}, Lcom/huawei/up/utils/XMLPackUtil;->createXmlSerializer(Ljava/io/OutputStream;)Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v5

    .line 80
    const-string v0, "UTF-8"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 81
    const-string v0, "GetUserInfoReq"

    const/4 v1, 0x0

    invoke-interface {v5, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 83
    const-string v0, "version"

    const-string v1, "10001"

    invoke-static {v5, v0, v1}, Lcom/huawei/up/utils/XMLPackUtil;->setTextIntag(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    const-string v0, "userID"

    iget-object v1, p0, Lcom/huawei/up/request/GetUserInfoRequest;->mUserID:Ljava/lang/String;

    invoke-static {v5, v0, v1}, Lcom/huawei/up/utils/XMLPackUtil;->setTextIntag(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    const-string v0, "queryRangeFlag"

    iget-object v1, p0, Lcom/huawei/up/request/GetUserInfoRequest;->mQueryRangeFlag:Ljava/lang/String;

    invoke-static {v5, v0, v1}, Lcom/huawei/up/utils/XMLPackUtil;->setTextIntag(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    const-string v0, "GetUserInfoReq"

    const/4 v1, 0x0

    invoke-interface {v5, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 87
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 88
    const-string v0, "UTF-8"

    invoke-virtual {v4, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 89
    const-string v0, "?>"

    invoke-virtual {v6, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    .line 90
    const/4 v0, -0x1

    if-eq v0, v7, :cond_0

    .line 91
    add-int/lit8 v0, v7, 0x2

    invoke-virtual {v6, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 93
    :cond_0
    const-string v0, "GetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "request is packedStr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    move-object v8, v6

    .line 97
    :try_start_1
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 100
    goto :goto_0

    .line 98
    :catch_0
    move-exception v9

    .line 99
    const-string v0, "GetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "byteArrayOutputStream.close() error ,e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    :goto_0
    return-object v8

    .line 96
    :catchall_0
    move-exception v10

    .line 97
    :try_start_2
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 100
    goto :goto_1

    .line 98
    :catch_1
    move-exception v11

    .line 99
    const-string v0, "GetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "byteArrayOutputStream.close() error ,e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    :goto_1
    throw v10
.end method

.method public setAuthorization(Ljava/lang/String;)V
    .locals 0

    .line 341
    iput-object p1, p0, Lcom/huawei/up/request/GetUserInfoRequest;->authorization:Ljava/lang/String;

    .line 342
    return-void
.end method

.method public setCookie(Ljava/lang/String;)V
    .locals 0

    .line 345
    iput-object p1, p0, Lcom/huawei/up/request/GetUserInfoRequest;->cookie:Ljava/lang/String;

    .line 346
    return-void
.end method

.method public setmQueryRangeFlag(Ljava/lang/String;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/huawei/up/request/GetUserInfoRequest;->mQueryRangeFlag:Ljava/lang/String;

    .line 198
    return-void
.end method

.method public setmUserID(Ljava/lang/String;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lcom/huawei/up/request/GetUserInfoRequest;->mUserID:Ljava/lang/String;

    .line 194
    return-void
.end method

.method public unPackageRequest(Lorg/apache/http/HttpResponse;)Landroid/os/Bundle;
    .locals 1

    .line 62
    const/4 v0, 0x0

    return-object v0
.end method

.method public unPackageXML(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 143
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 144
    const-string v0, "GetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "response="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 146
    return-object v4

    .line 148
    :cond_0
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/up/utils/XMLPackUtil;->createXmlPullParser([B)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v5

    .line 149
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v6

    .line 150
    const/4 v7, 0x0

    .line 151
    :goto_0
    const/4 v0, 0x1

    if-eq v0, v6, :cond_5

    .line 152
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v8

    .line 153
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_1

    .line 155
    :pswitch_0
    goto/16 :goto_1

    .line 157
    :pswitch_1
    const-string v0, "result"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 158
    const-string v0, "resultCode"

    const/4 v1, 0x0

    invoke-interface {v5, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/up/request/GetUserInfoRequest;->mAttributeValue:Ljava/lang/Integer;

    .line 161
    :cond_1
    iget-object v0, p0, Lcom/huawei/up/request/GetUserInfoRequest;->mAttributeValue:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 163
    const-string v0, "userID"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 164
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/up/request/GetUserInfoRequest;->mUserID:Ljava/lang/String;

    goto :goto_1

    .line 168
    :cond_2
    const-string v0, "userInfo"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 169
    new-instance v0, Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/UserInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/up/request/GetUserInfoRequest;->mUserInfo:Lcom/huawei/hwid/core/datatype/UserInfo;

    .line 170
    const/4 v7, 0x1

    goto :goto_1

    .line 171
    :cond_3
    if-eqz v7, :cond_4

    iget-object v0, p0, Lcom/huawei/up/request/GetUserInfoRequest;->mUserInfo:Lcom/huawei/hwid/core/datatype/UserInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 172
    iget-object v0, p0, Lcom/huawei/up/request/GetUserInfoRequest;->mUserInfo:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-static {v5, v0, v8}, Lcom/huawei/up/request/GetUserInfoRequest;->getUserInfoIntag(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;)V

    goto :goto_1

    .line 178
    :pswitch_2
    const-string v0, "userInfo"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 179
    const/4 v7, 0x0

    .line 186
    :cond_4
    :goto_1
    :pswitch_3
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v6

    .line 187
    goto/16 :goto_0

    .line 188
    :cond_5
    const-string v0, "resultCode"

    iget-object v1, p0, Lcom/huawei/up/request/GetUserInfoRequest;->mAttributeValue:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 189
    const-string v0, "getUserInfoTag"

    iget-object v1, p0, Lcom/huawei/up/request/GetUserInfoRequest;->mUserInfo:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 190
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
