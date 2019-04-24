.class public Lcom/huawei/hwid/core/encrypt/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 20
    const/16 v2, 0xff

    .line 21
    const-string v3, "UTF-8"

    .line 22
    const-string v0, "SHA-256"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v4

    .line 23
    invoke-virtual {p0, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 24
    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v5

    .line 27
    new-instance v6, Ljava/lang/StringBuffer;

    const/16 v0, 0x28

    invoke-direct {v6, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 28
    const/4 v7, 0x0

    :goto_0
    array-length v0, v5

    if-ge v7, v0, :cond_1

    .line 29
    aget-byte v0, v5, v7

    and-int/lit16 v8, v0, 0xff

    .line 30
    const/16 v0, 0x10

    if-ge v8, v0, :cond_0

    const/16 v0, 0xff

    if-ne v2, v0, :cond_0

    .line 31
    const/16 v0, 0x30

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 33
    :cond_0
    invoke-static {v8}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 28
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    return-object v0

    .line 36
    :catch_0
    move-exception v2

    .line 37
    const-string v0, "SHA256"

    const-string v1, "NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    goto :goto_1

    .line 38
    :catch_1
    move-exception v2

    .line 39
    const-string v0, "SHA256"

    const-string v1, "UnsupportedEncodingException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    goto :goto_1

    .line 40
    :catch_2
    move-exception v2

    .line 41
    const-string v0, "SHA256"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method
