.class public final Lcom/huawei/hwid/d/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/io/File;)[B
    .locals 9

    .line 60
    const/4 v2, 0x0

    .line 62
    const-string v0, "SHA-256"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v3

    .line 65
    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v2, v0

    .line 67
    const/16 v0, 0x1000

    new-array v4, v0, [B

    .line 69
    const/4 v5, 0x0

    .line 71
    :goto_0
    invoke-virtual {v2, v4}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v6, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 72
    add-int/2addr v5, v6

    .line 73
    const/4 v0, 0x0

    invoke-virtual {v3, v4, v0, v6}, Ljava/security/MessageDigest;->update([BII)V

    goto :goto_0

    .line 76
    :cond_0
    if-lez v5, :cond_1

    .line 77
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v7

    .line 85
    invoke-static {v2}, Lcom/huawei/hwid/d/c;->a(Ljava/io/InputStream;)V

    .line 77
    return-object v7

    .line 85
    :cond_1
    invoke-static {v2}, Lcom/huawei/hwid/d/c;->a(Ljava/io/InputStream;)V

    .line 86
    goto :goto_1

    .line 80
    :catch_0
    move-exception v3

    .line 81
    const-string v0, "SHA256"

    const-string v1, "NoSuchAlgorithmException An exception occurred while computing file \'SHA-256\'."

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    invoke-static {v2}, Lcom/huawei/hwid/d/c;->a(Ljava/io/InputStream;)V

    .line 86
    goto :goto_1

    .line 82
    :catch_1
    move-exception v3

    .line 83
    const-string v0, "SHA256"

    const-string v1, "IOException An exception occurred while computing file \'SHA-256\'."

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    invoke-static {v2}, Lcom/huawei/hwid/d/c;->a(Ljava/io/InputStream;)V

    .line 86
    goto :goto_1

    .line 85
    :catchall_0
    move-exception v8

    invoke-static {v2}, Lcom/huawei/hwid/d/c;->a(Ljava/io/InputStream;)V

    throw v8

    .line 88
    :goto_1
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method
