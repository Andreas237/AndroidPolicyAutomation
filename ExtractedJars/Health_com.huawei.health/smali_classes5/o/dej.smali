.class public Lo/dej;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a(Ljava/lang/String;[B[B)Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-class v11, Lo/dej;

    monitor-enter v11

    .line 20
    const-string v0, "AES/CBC/PKCS7Padding"

    :try_start_0
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 21
    invoke-virtual {v3}, Ljavax/crypto/Cipher;->getBlockSize()I

    move-result v4

    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v5

    .line 24
    array-length v6, v5

    .line 25
    rem-int v0, v6, v4

    if-eqz v0, :cond_0

    .line 26
    rem-int v0, v6, v4

    sub-int v0, v4, v0

    add-int/2addr v6, v0

    .line 29
    :cond_0
    new-array v7, v6, [B

    .line 30
    array-length v0, v5

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v5, v1, v7, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    new-instance v8, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v8, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 33
    new-instance v9, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v9, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 35
    const/4 v0, 0x1

    invoke-virtual {v3, v0, v8, v9}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 36
    invoke-virtual {v3, v7}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v10

    .line 37
    invoke-static {v10}, Lo/deg;->a([B)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v11

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v11

    throw p0
.end method

.method public static declared-synchronized d(Ljava/lang/String;[B[B)Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-class v8, Lo/dej;

    monitor-enter v8

    .line 52
    :try_start_0
    invoke-static {p0}, Lo/deg;->d(Ljava/lang/String;)[B

    move-result-object v2

    .line 53
    const-string v0, "AES/CBC/PKCS7Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 54
    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v4, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 55
    new-instance v5, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v5, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 56
    const/4 v0, 0x2

    invoke-virtual {v3, v0, v4, v5}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 57
    invoke-virtual {v3, v2}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v6

    .line 58
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v6, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v7

    .line 59
    monitor-exit v8

    return-object v7

    :catchall_0
    move-exception p0

    monitor-exit v8

    throw p0
.end method
