.class public abstract Lcom/huawei/openalliance/ad/utils/aa;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/io/File;)Ljava/lang/String;
    .locals 9

    const/4 v2, 0x0

    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/i;->d(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object v2

    :cond_0
    const/4 v3, 0x0

    const-string v0, "SHA-256"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v4

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v3, v0

    const/16 v0, 0x2000

    new-array v5, v0, [B

    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v3, v5}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    move v6, v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {v4, v5, v0, v6}, Ljava/security/MessageDigest;->update([BII)V

    const/4 v7, 0x1

    goto :goto_0

    :cond_1
    if-eqz v7, :cond_2

    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/l;->a([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v2, v0

    :cond_2
    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_1

    :catch_0
    move-exception v4

    const-string v0, "Sha256Util"

    const-string v1, "fail to get file sha256"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_1

    :catch_1
    move-exception v4

    const-string v0, "Sha256Util"

    const-string v1, "fail to get file sha256"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_1

    :catch_2
    move-exception v4

    const-string v0, "Sha256Util"

    const-string v1, "fail to get file sha256"

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_1

    :catchall_0
    move-exception v8

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    throw v8

    :goto_1
    return-object v2
.end method
