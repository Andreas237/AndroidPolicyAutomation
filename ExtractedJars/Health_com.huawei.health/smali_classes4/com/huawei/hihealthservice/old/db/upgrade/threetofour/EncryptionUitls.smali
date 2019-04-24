.class public Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptionUitls;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static MD5Encrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 12
    const-string v0, "MD5"

    invoke-static {p0, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptionUitls;->encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static bytes2Hex([B)Ljava/lang/String;
    .locals 8

    .line 44
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 46
    move-object v4, p0

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-byte v7, v4, v6

    .line 47
    and-int/lit16 v0, v7, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    .line 48
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 49
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 51
    :cond_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 46
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 19
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 20
    const-string v0, "EncryptionUitls"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Encrypt() strSrc is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    const-string v0, ""

    return-object v0

    .line 28
    :cond_0
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v6

    .line 29
    if-eqz p1, :cond_1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 30
    :cond_1
    const-string p1, "SHA-256"

    .line 32
    :cond_2
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v4

    .line 33
    invoke-virtual {v4, v6}, Ljava/security/MessageDigest;->update([B)V

    .line 34
    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptionUitls;->bytes2Hex([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v5

    .line 39
    goto :goto_0

    .line 35
    :catch_0
    move-exception v6

    .line 36
    const-string v0, ""

    return-object v0

    .line 37
    :catch_1
    move-exception v6

    .line 38
    const-string v0, ""

    return-object v0

    .line 40
    :goto_0
    return-object v5
.end method
