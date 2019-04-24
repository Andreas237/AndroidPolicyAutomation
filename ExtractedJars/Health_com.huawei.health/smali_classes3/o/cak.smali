.class public final Lo/cak;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static b(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 1

    .line 135
    invoke-static {p0}, Lo/cak;->e(Ljava/io/InputStream;)[B

    move-result-object v0

    invoke-static {v0}, Lo/caf;->d([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Ljava/io/InputStream;)[B
    .locals 8

    .line 92
    if-nez p0, :cond_0

    .line 94
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 97
    :cond_0
    const/16 v0, 0x1000

    new-array v4, v0, [B

    .line 101
    const-string v0, "SHA-256"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v5

    .line 103
    const/4 v6, 0x0

    .line 104
    :goto_0
    invoke-virtual {p0, v4}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v6, v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_1

    .line 106
    const/4 v0, 0x0

    invoke-virtual {v5, v4, v0, v6}, Ljava/security/MessageDigest;->update([BII)V

    goto :goto_0

    .line 109
    :cond_1
    invoke-virtual {v5}, Ljava/security/MessageDigest;->digest()[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v7

    .line 110
    if-eqz v7, :cond_2

    .line 112
    return-object v7

    .line 122
    :cond_2
    goto :goto_1

    .line 115
    :catch_0
    move-exception v5

    .line 117
    const-string v0, "SHA256"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NoSuchAlgorithmException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    goto :goto_1

    .line 119
    :catch_1
    move-exception v5

    .line 121
    const-string v0, "SHA256"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    :goto_1
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method
