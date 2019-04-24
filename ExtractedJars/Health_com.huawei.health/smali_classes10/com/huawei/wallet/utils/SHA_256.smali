.class public Lcom/huawei/wallet/utils/SHA_256;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 33
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 38
    goto :goto_0

    .line 34
    :catch_0
    move-exception v7

    .line 36
    const-string v0, "encrypt error."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 37
    const/4 v0, 0x0

    return-object v0

    .line 40
    :goto_0
    :try_start_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    const-string v0, "SHA-256"

    move-object p1, v0

    .line 43
    :cond_0
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v4

    .line 44
    invoke-virtual {v4, v6}, Ljava/security/MessageDigest;->update([B)V

    .line 45
    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/wallet/utils/SHA_256;->e([B)Ljava/lang/String;
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v5

    .line 52
    goto :goto_1

    .line 46
    :catch_1
    move-exception v7

    .line 48
    const-string v0, "no algorith"

    const-string v1, "SHA_256.encrypt"

    .line 49
    invoke-static {v1, p1}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 48
    const v2, 0x36118622

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;ILjava/util/Map;Z)V

    .line 51
    const/4 v0, 0x0

    return-object v0

    .line 53
    :goto_1
    return-object v5
.end method

.method public static e([B)Ljava/lang/String;
    .locals 5

    .line 117
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 118
    const/4 v3, 0x0

    .line 119
    const/4 v4, 0x0

    :goto_0
    array-length v0, p0

    if-ge v4, v0, :cond_1

    .line 120
    aget-byte v0, p0, v4

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    .line 121
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 122
    const-string v0, "0"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 124
    :cond_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 119
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 126
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
