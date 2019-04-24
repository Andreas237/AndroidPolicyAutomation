.class public Lcom/huawei/up/utils/Utils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DEVICE_ID:Ljava/lang/String; = "6824CF96-FFE5-4C7D-B376-91918C8F570D"

.field private static final TAG:Ljava/lang/String; = "Utils"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static encrypter4Srv(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;,
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljavax/crypto/BadPaddingException;,
            Ljavax/crypto/NoSuchPaddingException;,
            Ljava/security/InvalidAlgorithmParameterException;
        }
    .end annotation

    .line 38
    invoke-static {}, Lcom/huawei/common/util/EncryptUtil;->getUpServiceToken()Ljava/lang/String;

    move-result-object v3

    .line 39
    invoke-static {}, Lcom/huawei/up/utils/Utils;->getIvStr()Ljava/lang/String;

    move-result-object v4

    .line 40
    const-string v5, ""

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-virtual {v3, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    invoke-static {v1, v2, v4}, Lo/deh;->c([B[BLjava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 42
    return-object v5
.end method

.method public static getDeviceID(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 74
    invoke-static {p0}, Lcom/huawei/up/utils/Utils;->getIMEI(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 75
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    const-string v0, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 76
    :cond_0
    const-string v1, "6824CF96-FFE5-4C7D-B376-91918C8F570D"

    .line 78
    :cond_1
    return-object v1
.end method

.method public static getIMEI(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 82
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 83
    const-string v0, ""

    return-object v0

    .line 86
    :cond_0
    const-string v0, "phone"

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/telephony/TelephonyManager;

    .line 87
    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v5

    .line 88
    return-object v5

    .line 89
    :catch_0
    move-exception v4

    .line 90
    const-string v0, "Utils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceType() SecurityException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    const-string v0, ""

    return-object v0

    .line 92
    :catch_1
    move-exception v4

    .line 93
    const-string v0, "Utils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceType() Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    const-string v0, ""

    return-object v0
.end method

.method private static getIvStr()Ljava/lang/String;
    .locals 3

    .line 60
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 61
    const/16 v0, 0x10

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->generateSeed(I)[B

    move-result-object v2

    .line 62
    invoke-static {v2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getTerminalType(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 49
    const-string v4, ""

    .line 50
    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 52
    const-string v0, "UTF-8"

    :try_start_0
    invoke-static {v4, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 53
    :catch_0
    move-exception v5

    .line 54
    const-string v0, "Utils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "exception e="

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

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    return-object v4
.end method

.method public static getUserInfo(Lcom/huawei/hwid/core/datatype/UserInfo;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/hwid/core/datatype/UserInfo;
    .locals 2

    .line 105
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->e:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    if-ne v0, v1, :cond_0

    .line 106
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 108
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setNickName(Ljava/lang/String;)V

    .line 112
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 114
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setBirthDate(Ljava/lang/String;)V

    .line 116
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    const/16 v1, -0x3e8

    if-eq v1, v0, :cond_2

    .line 118
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setGender(Ljava/lang/String;)V

    .line 120
    :cond_2
    return-object p0
.end method

.method public static isEmpty(Ljava/lang/String;)Z
    .locals 2

    .line 66
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    .line 67
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 69
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static isUserInfoChanged(Lcom/huawei/up/model/UserInfomation;)Z
    .locals 3

    .line 129
    const/4 v2, 0x0

    .line 130
    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 132
    const/4 v0, 0x1

    return v0

    .line 134
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    const/16 v1, -0x3e8

    if-eq v1, v0, :cond_2

    .line 136
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 138
    :cond_2
    return v2
.end method
