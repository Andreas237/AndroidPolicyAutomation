.class public Lcom/huawei/up/request/SetUserInfoRequest;
.super Lcom/huawei/up/request/HttpRequestBase;
.source "SourceFile"


# static fields
.field public static final DUPLICATE_NAME_ERROR:I = 0x42c310a

.field private static final TAG:Ljava/lang/String; = "SetUserInfoRequest"

.field private static final TAG_REQUESTNAME:Ljava/lang/String; = "UpdateUserInfoReq"

.field private static final TAG_REQ_CLIENT_TYPE:Ljava/lang/String; = "reqClientType"

.field private static final TAG_USER_ID:Ljava/lang/String; = "userID"

.field private static final TAG_USER_INFO:Ljava/lang/String; = "userInfo"

.field private static final TAG_VERSION:Ljava/lang/String; = "version"


# instance fields
.field private authorization:Ljava/lang/String;

.field private cookie:Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field private mResultCode:Ljava/lang/Integer;

.field private mUserID:Ljava/lang/String;

.field private mUserInfo:Lcom/huawei/up/model/UserInfomation;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 59
    invoke-direct {p0, p1}, Lcom/huawei/up/request/HttpRequestBase;-><init>(Landroid/content/Context;)V

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/up/request/SetUserInfoRequest;->mUserInfo:Lcom/huawei/up/model/UserInfomation;

    .line 60
    iput-object p1, p0, Lcom/huawei/up/request/SetUserInfoRequest;->mContext:Landroid/content/Context;

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/huawei/up/request/SetUserInfoRequest;->baseURL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/IUserInfoMng/updateUserInfo?Version=10001"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/up/request/SetUserInfoRequest;->requestURL:Ljava/lang/String;

    .line 62
    return-void
.end method

.method private insertUserInfoNode(Lorg/xmlpull/v1/XmlSerializer;Lcom/huawei/up/model/UserInfomation;)V
    .locals 5

    .line 169
    const-string v0, "nickName"

    :try_start_0
    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/huawei/up/utils/XMLPackUtil;->setTextIntag(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    const-string v0, "languageCode"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/huawei/up/utils/XMLPackUtil;->setTextIntag(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    const-string v0, "gender"

    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/huawei/up/utils/XMLPackUtil;->setTextIntag(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    const-string v0, "birthDate"

    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/huawei/up/utils/XMLPackUtil;->setTextIntag(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    goto :goto_0

    .line 173
    :catch_0
    move-exception v4

    .line 174
    const-string v0, "SetUserInfoRequest"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertuserInfoNode exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    :goto_0
    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 180
    iget-object v0, p0, Lcom/huawei/up/request/SetUserInfoRequest;->requestURL:Ljava/lang/String;

    const/16 v1, 0x1e

    const/16 v2, 0x1e

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->getHttpPost(Ljava/lang/String;IIZ)Lorg/apache/http/client/methods/HttpPost;

    move-result-object v4

    .line 181
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 182
    const-string v0, "SetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == httpPost"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    const-string v0, ""

    return-object v0

    .line 185
    :cond_0
    const-string v0, "Content-Type"

    const-string v1, "text/xml;charset=utf-8"

    invoke-virtual {v4, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lcom/huawei/up/request/SetUserInfoRequest;->authorization:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/up/utils/Utils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 187
    const-string v0, "Authorization"

    iget-object v1, p0, Lcom/huawei/up/request/SetUserInfoRequest;->authorization:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    :cond_1
    iget-object v0, p0, Lcom/huawei/up/request/SetUserInfoRequest;->cookie:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/up/utils/Utils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 190
    const-string v0, "Cookie"

    iget-object v1, p0, Lcom/huawei/up/request/SetUserInfoRequest;->cookie:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    :cond_2
    :try_start_0
    new-instance v0, Lorg/apache/http/entity/StringEntity;

    const-string v1, "UTF-8"

    invoke-direct {v0, p1, v1}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 196
    goto :goto_0

    .line 194
    :catch_0
    move-exception v5

    .line 195
    const-string v0, "SetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UnsupportedEncodingException e="

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

    .line 197
    :goto_0
    const/4 v5, 0x0

    .line 199
    :try_start_1
    iget-object v0, p0, Lcom/huawei/up/request/SetUserInfoRequest;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/up/request/SetUserInfoRequest;->requestURL:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->getHttpClient(Landroid/content/Context;Ljava/lang/String;)Lorg/apache/http/client/HttpClient;
    :try_end_1
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v5, v0

    .line 202
    goto :goto_1

    .line 200
    :catch_1
    move-exception v6

    .line 201
    const-string v0, "SetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NSPException e="

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

    .line 203
    :goto_1
    const/4 v0, 0x0

    if-ne v0, v5, :cond_3

    .line 204
    const-string v0, "SetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == httpClient"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    const-string v0, ""

    return-object v0

    .line 207
    :cond_3
    const/4 v6, 0x0

    .line 209
    :try_start_2
    invoke-interface {v5, v4}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v0

    move-object v6, v0

    .line 212
    goto :goto_2

    .line 210
    :catch_2
    move-exception v7

    .line 211
    const-string v0, "SetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException e="

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

    .line 213
    :goto_2
    const/4 v7, 0x0

    .line 215
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 216
    :try_start_3
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    move-result-object v0

    move-object v7, v0

    .line 221
    :cond_4
    goto :goto_3

    .line 219
    :catch_3
    move-exception v8

    .line 220
    const-string v0, "SetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException e1="

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

    .line 222
    :goto_3
    return-object v7
.end method

.method public getUserInfo()Lcom/huawei/up/model/UserInfomation;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/up/request/SetUserInfoRequest;->mUserInfo:Lcom/huawei/up/model/UserInfomation;

    return-object v0
.end method

.method public getmUserID()Ljava/lang/String;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/huawei/up/request/SetUserInfoRequest;->mUserID:Ljava/lang/String;

    return-object v0
.end method

.method public packageRequest()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 109
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

    .line 69
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 71
    :try_start_0
    invoke-static {v4}, Lcom/huawei/up/utils/XMLPackUtil;->createXmlSerializer(Ljava/io/OutputStream;)Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v5

    .line 72
    const-string v0, "UTF-8"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 73
    const-string v0, "UpdateUserInfoReq"

    const/4 v1, 0x0

    invoke-interface {v5, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 75
    const-string v0, "version"

    const-string v1, "10001"

    invoke-static {v5, v0, v1}, Lcom/huawei/up/utils/XMLPackUtil;->setTextIntag(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    const-string v0, "userID"

    iget-object v1, p0, Lcom/huawei/up/request/SetUserInfoRequest;->mUserID:Ljava/lang/String;

    invoke-static {v5, v0, v1}, Lcom/huawei/up/utils/XMLPackUtil;->setTextIntag(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    const-string v0, "reqClientType"

    const-string v1, "39"

    invoke-static {v5, v0, v1}, Lcom/huawei/up/utils/XMLPackUtil;->setTextIntag(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    const-string v0, "userInfo"

    const/4 v1, 0x0

    invoke-interface {v5, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 80
    iget-object v0, p0, Lcom/huawei/up/request/SetUserInfoRequest;->mUserInfo:Lcom/huawei/up/model/UserInfomation;

    invoke-direct {p0, v5, v0}, Lcom/huawei/up/request/SetUserInfoRequest;->insertUserInfoNode(Lorg/xmlpull/v1/XmlSerializer;Lcom/huawei/up/model/UserInfomation;)V

    .line 82
    const-string v0, "userInfo"

    const/4 v1, 0x0

    invoke-interface {v5, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 83
    const-string v0, "UpdateUserInfoReq"

    const/4 v1, 0x0

    invoke-interface {v5, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 84
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 85
    const-string v0, "UTF-8"

    invoke-virtual {v4, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 86
    const-string v0, "?>"

    invoke-virtual {v6, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    .line 87
    const/4 v0, -0x1

    if-eq v0, v7, :cond_0

    .line 88
    add-int/lit8 v0, v7, 0x2

    invoke-virtual {v6, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 90
    :cond_0
    const-string v0, "SetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "request is packedString="

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

    .line 91
    move-object v8, v6

    .line 94
    :try_start_1
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 97
    goto :goto_0

    .line 95
    :catch_0
    move-exception v9

    .line 96
    const-string v0, "SetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "outputStream.close() error ,e="

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

    .line 91
    :goto_0
    return-object v8

    .line 93
    :catchall_0
    move-exception v10

    .line 94
    :try_start_2
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 97
    goto :goto_1

    .line 95
    :catch_1
    move-exception v11

    .line 96
    const-string v0, "SetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "outputStream.close() error ,e="

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

    .line 98
    :goto_1
    throw v10
.end method

.method public setAuthorization(Ljava/lang/String;)V
    .locals 0

    .line 226
    iput-object p1, p0, Lcom/huawei/up/request/SetUserInfoRequest;->authorization:Ljava/lang/String;

    .line 227
    return-void
.end method

.method public setCookie(Ljava/lang/String;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/huawei/up/request/SetUserInfoRequest;->cookie:Ljava/lang/String;

    .line 231
    return-void
.end method

.method public setUserInfo(Lcom/huawei/up/model/UserInfomation;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/up/request/SetUserInfoRequest;->mUserInfo:Lcom/huawei/up/model/UserInfomation;

    .line 56
    return-void
.end method

.method public setmUserID(Ljava/lang/String;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/huawei/up/request/SetUserInfoRequest;->mUserID:Ljava/lang/String;

    .line 161
    return-void
.end method

.method public unPackageRequest(Lorg/apache/http/HttpResponse;)Landroid/os/Bundle;
    .locals 1

    .line 105
    const/4 v0, 0x0

    return-object v0
.end method

.method public unPackageXML(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 123
    const-string v0, "SetUserInfoRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unPackageXML(), response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 125
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 126
    return-object v4

    .line 128
    :cond_0
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/up/utils/XMLPackUtil;->createXmlPullParser([B)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v5

    .line 129
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v6

    .line 131
    :goto_0
    const/4 v0, 0x1

    if-eq v0, v6, :cond_3

    .line 132
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v7

    .line 133
    packed-switch v6, :pswitch_data_0

    goto :goto_1

    .line 135
    :pswitch_0
    goto :goto_1

    .line 137
    :pswitch_1
    const-string v0, "result"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 138
    const-string v0, "resultCode"

    const/4 v1, 0x0

    invoke-interface {v5, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/up/request/SetUserInfoRequest;->mResultCode:Ljava/lang/Integer;

    .line 141
    :cond_1
    iget-object v0, p0, Lcom/huawei/up/request/SetUserInfoRequest;->mResultCode:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 142
    const-string v0, "userID"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 143
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/up/request/SetUserInfoRequest;->mUserID:Ljava/lang/String;

    nop

    .line 149
    .line 154
    :cond_2
    :goto_1
    :pswitch_2
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v6

    .line 155
    goto :goto_0

    .line 156
    :cond_3
    const-string v0, "resultCode"

    iget-object v1, p0, Lcom/huawei/up/request/SetUserInfoRequest;->mResultCode:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 157
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
