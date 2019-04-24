.class public Lcom/huawei/up/request/ServiceTokenAuthRequest;
.super Lcom/huawei/up/request/HttpRequestBase;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "ServiceTokenAuthRequest"

.field public static final TAG_ACCTCHANGEDFLAG:Ljava/lang/String; = "acctChangedFlag"

.field public static final TAG_AGRFLAGS:Ljava/lang/String; = "agrFlags"

.field private static final TAG_APP_ID:Ljava/lang/String; = "app"

.field private static final TAG_CHKACCTCHANGE:Ljava/lang/String; = "chg"

.field private static final TAG_DEVICE_ID:Ljava/lang/String; = "dvID"

.field private static final TAG_DEVICE_TYPE:Ljava/lang/String; = "dvT"

.field private static final TAG_ISGETACCOUNT:Ljava/lang/String; = "gAc"

.field private static final TAG_ISGETAGRVERS:Ljava/lang/String; = "agr"

.field private static final TAG_REGISTERCHANNEL:Ljava/lang/String; = "cn"

.field private static final TAG_REQCLIENT_TYPE:Ljava/lang/String; = "clT"

.field public static final TAG_RESULT_COOKIE:Ljava/lang/String; = "Set-Cookie"

.field private static final TAG_SERVICE_TOKEN:Ljava/lang/String; = "st"

.field private static final TAG_TERMINAL_TYPE:Ljava/lang/String; = "tmT"

.field public static final TAG_USER_ID:Ljava/lang/String; = "userID"

.field private static final TAG_VERSION:Ljava/lang/String; = "ver"


# instance fields
.field private mAppId:Ljava/lang/String;

.field private mChannel:Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field private mDeviceId:Ljava/lang/String;

.field private mDeviceType:Ljava/lang/String;

.field private mErrorCode:I

.field private mErrorDesc:Ljava/lang/String;

.field private mIsGetAgrVers:Ljava/lang/String;

.field private mResultCode:I

.field private mServiceToken:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 59
    invoke-direct {p0, p1}, Lcom/huawei/up/request/HttpRequestBase;-><init>(Landroid/content/Context;)V

    .line 33
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mIsGetAgrVers:Ljava/lang/String;

    .line 35
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mAppId:Ljava/lang/String;

    .line 36
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mDeviceType:Ljava/lang/String;

    .line 37
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mDeviceId:Ljava/lang/String;

    .line 38
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mChannel:Ljava/lang/String;

    .line 60
    iput-object p1, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mContext:Landroid/content/Context;

    .line 61
    iput-object p2, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mServiceToken:Ljava/lang/String;

    .line 62
    iput-object p3, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mAppId:Ljava/lang/String;

    .line 63
    iput-object p4, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mDeviceType:Ljava/lang/String;

    .line 64
    iput-object p5, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mDeviceId:Ljava/lang/String;

    .line 65
    iput-object p6, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mChannel:Ljava/lang/String;

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/huawei/up/request/ServiceTokenAuthRequest;->baseURL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/IUserInfoMng/stAuth"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->requestURL:Ljava/lang/String;

    .line 67
    return-void
.end method


# virtual methods
.method public packageRequest()Ljava/util/HashMap;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 71
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 72
    const-string v0, "ver"

    const-string v1, "10000"

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    const-string v5, ""

    .line 75
    :try_start_0
    iget-object v0, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mServiceToken:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mContext:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/huawei/up/utils/Utils;->encrypter4Srv(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7

    move-result-object v0

    move-object v5, v0

    .line 92
    goto/16 :goto_0

    .line 76
    :catch_0
    move-exception v6

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " error ,e="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    goto/16 :goto_0

    .line 78
    :catch_1
    move-exception v6

    .line 79
    const-string v0, "ServiceTokenAuthRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " error ,e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljavax/crypto/IllegalBlockSizeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    goto/16 :goto_0

    .line 80
    :catch_2
    move-exception v6

    .line 81
    const-string v0, "ServiceTokenAuthRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " error ,e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/security/InvalidKeyException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    goto/16 :goto_0

    .line 82
    :catch_3
    move-exception v6

    .line 83
    const-string v0, "ServiceTokenAuthRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " error ,e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    goto/16 :goto_0

    .line 84
    :catch_4
    move-exception v6

    .line 85
    const-string v0, "ServiceTokenAuthRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " error ,e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljavax/crypto/BadPaddingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    goto :goto_0

    .line 86
    :catch_5
    move-exception v6

    .line 87
    const-string v0, "ServiceTokenAuthRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " error ,e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljavax/crypto/NoSuchPaddingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    goto :goto_0

    .line 88
    :catch_6
    move-exception v6

    .line 89
    const-string v0, "ServiceTokenAuthRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " error ,e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/security/InvalidAlgorithmParameterException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    goto :goto_0

    .line 90
    :catch_7
    move-exception v6

    .line 91
    const-string v0, "ServiceTokenAuthRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " error ,e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    :goto_0
    const-string v0, "st"

    invoke-virtual {v4, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    const-string v0, "app"

    iget-object v1, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mAppId:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    const-string v0, "dvT"

    iget-object v1, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mDeviceType:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    const-string v0, "dvID"

    iget-object v1, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mDeviceId:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    const-string v0, "tmT"

    iget-object v1, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/up/utils/Utils;->getTerminalType(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    const-string v0, "clT"

    const-string v1, "42"

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    const-string v0, "cn"

    iget-object v1, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mChannel:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    const-string v0, "chg"

    const-string v1, "0"

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    const-string v0, "gAc"

    const-string v1, "0"

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    const-string v0, "agr"

    iget-object v1, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mIsGetAgrVers:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    return-object v4
.end method

.method public packageXML()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 163
    const/4 v0, 0x0

    return-object v0
.end method

.method public unPackageRequest(Lorg/apache/http/HttpResponse;)Landroid/os/Bundle;
    .locals 14

    .line 108
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 110
    const-string v6, ""

    .line 112
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 113
    :try_start_0
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 114
    const-string v0, "ServiceTokenAuthRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unPackageRequest() responseContent="

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
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    :cond_0
    goto :goto_0

    .line 116
    :catch_0
    move-exception v7

    .line 117
    return-object v4

    .line 119
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 120
    const-string v0, "&"

    invoke-virtual {v6, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    .line 122
    :cond_1
    return-object v4

    .line 124
    :goto_1
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 126
    const-string v9, ""

    .line 127
    move-object v10, v5

    array-length v11, v10

    const/4 v12, 0x0

    :goto_2
    if-ge v12, v11, :cond_2

    aget-object v13, v10, v12

    .line 128
    const-string v0, "="

    invoke-virtual {v13, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 129
    const/4 v0, 0x0

    aget-object v0, v8, v0

    const/4 v1, 0x1

    aget-object v1, v8, v1

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    const/4 v0, 0x0

    aget-object v9, v8, v0

    .line 127
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 134
    :cond_2
    const-string v0, "resultCode"

    invoke-virtual {v7, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 135
    const-string v0, "resultCode"

    invoke-virtual {v7, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mResultCode:I

    .line 137
    :cond_3
    iget v0, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mResultCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 138
    const-string v0, "userID"

    const-string v1, "userID"

    invoke-virtual {v7, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    const-string v0, "acctChangedFlag"

    const-string v1, "acctChangedFlag"

    invoke-virtual {v7, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    const-string v0, "agrFlags"

    const-string v1, "agrFlags"

    invoke-virtual {v7, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    const/4 v0, 0x0

    if-eq v0, p1, :cond_6

    .line 142
    const-string v0, "Set-Cookie"

    invoke-interface {p1, v0}, Lorg/apache/http/HttpResponse;->getHeaders(Ljava/lang/String;)[Lorg/apache/http/Header;

    move-result-object v10

    .line 143
    array-length v0, v10

    if-lez v0, :cond_4

    .line 144
    const/4 v0, 0x0

    aget-object v0, v10, v0

    invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v11

    .line 145
    const-string v0, "Set-Cookie"

    invoke-virtual {v4, v0, v11}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    const-string v0, "COOKS"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "COOKS="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    aget-object v3, v10, v3

    invoke-interface {v3}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    :cond_4
    goto :goto_3

    .line 153
    :cond_5
    iget v0, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mResultCode:I

    iput v0, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mErrorCode:I

    .line 154
    invoke-virtual {v7, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mErrorDesc:Ljava/lang/String;

    .line 155
    const-string v0, "errorDesc"

    iget-object v1, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mErrorDesc:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    :cond_6
    :goto_3
    const-string v0, "resultCode"

    iget v1, p0, Lcom/huawei/up/request/ServiceTokenAuthRequest;->mErrorCode:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 158
    return-object v4
.end method

.method public unPackageXML(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 168
    const/4 v0, 0x0

    return-object v0
.end method
