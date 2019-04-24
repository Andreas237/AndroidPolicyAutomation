.class public final Lo/bor;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static b(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 1

    .line 137
    invoke-static {p0}, Lo/bor;->c(Ljava/io/InputStream;)[B

    move-result-object v0

    invoke-static {v0}, Lo/boo;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;)[B
    .locals 4

    .line 47
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 54
    :cond_0
    const-string v0, "SHA-256"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    .line 55
    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 57
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    .line 58
    if-eqz v3, :cond_1

    .line 60
    return-object v3

    .line 70
    :cond_1
    goto :goto_0

    .line 63
    :catch_0
    move-exception v2

    .line 65
    const-string v0, "SHA256"

    const-string v1, "NoSuchAlgorithmException in SHA256 class"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    goto :goto_0

    .line 67
    :catch_1
    move-exception v2

    .line 69
    const-string v0, "SHA256"

    const-string v1, "UnsupportedEncodingException in SHA256 class"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    :goto_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public static c(Ljava/io/InputStream;)[B
    .locals 6

    .line 94
    if-nez p0, :cond_0

    .line 96
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 99
    :cond_0
    const/16 v0, 0x1000

    new-array v2, v0, [B

    .line 103
    const-string v0, "SHA-256"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v3

    .line 105
    const/4 v4, 0x0

    .line 106
    :goto_0
    invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v4, v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_1

    .line 108
    const/4 v0, 0x0

    invoke-virtual {v3, v2, v0, v4}, Ljava/security/MessageDigest;->update([BII)V

    goto :goto_0

    .line 111
    :cond_1
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v5

    .line 112
    if-eqz v5, :cond_2

    .line 114
    return-object v5

    .line 124
    :cond_2
    goto :goto_1

    .line 117
    :catch_0
    move-exception v3

    .line 119
    const-string v0, "SHA256"

    const-string v1, "digestBytes NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    goto :goto_1

    .line 121
    :catch_1
    move-exception v3

    .line 123
    const-string v0, "SHA256"

    const-string v1, "digestBytes IOException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    :goto_1
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 83
    invoke-static {p0}, Lo/bor;->b(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lo/boo;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
