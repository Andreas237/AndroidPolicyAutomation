.class public Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_6_7;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static desEncryptHex(Ljava/lang/String;[B[B)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 41
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/util/HEX;->decode(Ljava/lang/String;)[B

    move-result-object v2

    .line 42
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 43
    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v4, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 44
    new-instance v5, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v5, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 45
    const/4 v0, 0x2

    invoke-virtual {v3, v0, v4, v5}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 46
    invoke-virtual {v3, v2}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v6

    .line 47
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v6, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static encryptHex(Ljava/lang/String;[B[B)Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 24
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 25
    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v4, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 26
    new-instance v5, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v5, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 27
    invoke-virtual {v3}, Ljavax/crypto/Cipher;->getBlockSize()I

    move-result v6

    .line 28
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v7

    .line 29
    array-length v8, v7

    .line 30
    rem-int v0, v8, v6

    if-eqz v0, :cond_0

    .line 31
    rem-int v0, v8, v6

    sub-int v0, v6, v0

    add-int/2addr v8, v0

    .line 33
    :cond_0
    new-array v9, v8, [B

    .line 34
    array-length v0, v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v7, v1, v9, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    const/4 v0, 0x1

    invoke-virtual {v3, v0, v4, v5}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 36
    invoke-virtual {v3, v9}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v10

    .line 37
    const/4 v0, 0x0

    invoke-static {v10, v0}, Lcom/huawei/hihealthservice/old/util/HEX;->encode([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
