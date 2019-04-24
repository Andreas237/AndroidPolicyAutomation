.class public abstract Lcom/huawei/hms/c/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/io/File;)[B
    .locals 9

    .line 54
    const/4 v2, 0x0

    .line 56
    const-string v0, "SHA-256"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v3

    .line 59
    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v2, v0

    .line 61
    const/16 v0, 0x1000

    new-array v4, v0, [B

    .line 63
    const/4 v5, 0x0

    .line 65
    :goto_0
    invoke-virtual {v2, v4}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v6, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 66
    add-int/2addr v5, v6

    .line 67
    const/4 v0, 0x0

    invoke-virtual {v3, v4, v0, v6}, Ljava/security/MessageDigest;->update([BII)V

    goto :goto_0

    .line 70
    :cond_0
    if-lez v5, :cond_1

    .line 71
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v7

    .line 77
    invoke-static {v2}, Lcom/huawei/hms/c/e;->a(Ljava/io/InputStream;)V

    .line 71
    return-object v7

    .line 77
    :cond_1
    invoke-static {v2}, Lcom/huawei/hms/c/e;->a(Ljava/io/InputStream;)V

    .line 78
    goto :goto_1

    .line 74
    :catch_0
    move-exception v3

    .line 75
    const-string v0, "SHA256"

    const-string v1, "An exception occurred while computing file \'SHA-256\'."

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    invoke-static {v2}, Lcom/huawei/hms/c/e;->a(Ljava/io/InputStream;)V

    .line 78
    goto :goto_1

    .line 77
    :catchall_0
    move-exception v8

    invoke-static {v2}, Lcom/huawei/hms/c/e;->a(Ljava/io/InputStream;)V

    throw v8

    .line 80
    :goto_1
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public static a([B)[B
    .locals 4

    .line 39
    const-string v0, "SHA-256"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v3

    .line 40
    invoke-virtual {v3, p0}, Ljava/security/MessageDigest;->digest([B)[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 41
    :catch_0
    move-exception v3

    .line 42
    const-string v0, "SHA256"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NoSuchAlgorithmException"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method
