.class public final Lo/boq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static d()Ljava/lang/String;
    .locals 1

    .line 81
    const-string v0, "6F62F05EF5090ACF54"

    return-object v0
.end method

.method public static d(Ljava/lang/String;)[B
    .locals 4

    .line 40
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 47
    :cond_0
    const-string v0, "SHA-512"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    .line 48
    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 49
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    .line 51
    if-eqz v3, :cond_1

    .line 53
    return-object v3

    .line 63
    :cond_1
    goto :goto_0

    .line 56
    :catch_0
    move-exception v2

    .line 58
    const-string v0, "SHA512"

    const-string v1, "NoSuchAlgorithmException in SHA512 class"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    goto :goto_0

    .line 60
    :catch_1
    move-exception v2

    .line 62
    const-string v0, "SHA512"

    const-string v1, "UnsupportedEncodingException in SHA512 class"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    :goto_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 76
    invoke-static {p0}, Lo/boq;->d(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lo/boo;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
