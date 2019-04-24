.class public Lcom/huawei/hwid/core/encrypt/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 38
    const/4 v0, 0x0

    new-array v3, v0, [B

    .line 40
    const-string v0, "AES/CBC/PKCS7Padding"

    :try_start_0
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v4

    .line 41
    invoke-static {p0}, Lcom/huawei/hwid/core/encrypt/f;->a(Ljava/lang/String;)Ljavax/crypto/SecretKey;

    move-result-object v5

    .line 42
    const/4 v0, 0x1

    invoke-virtual {v4, v0, v5}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 43
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v6

    .line 46
    invoke-virtual {v4}, Ljavax/crypto/Cipher;->getIV()[B

    move-result-object v7

    .line 47
    if-eqz v7, :cond_0

    array-length v0, v7

    const/16 v1, 0x10

    if-eq v0, v1, :cond_1

    .line 48
    :cond_0
    const-string v0, "KeyStoreEncryptAndDecrypt"

    const-string v1, "IV is invalid."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 49
    const-string v0, ""

    return-object v0

    .line 51
    :cond_1
    :try_start_1
    array-length v0, v7

    array-length v1, v6

    add-int/2addr v0, v1

    invoke-static {v7, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    move-object v3, v0

    .line 52
    array-length v0, v7

    array-length v1, v6

    const/4 v2, 0x0

    invoke-static {v6, v2, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 57
    goto :goto_0

    .line 53
    :catch_0
    move-exception v4

    .line 54
    const-string v0, "KeyStoreEncryptAndDecrypt"

    const-string v1, "RuntimeException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    goto :goto_0

    .line 55
    :catch_1
    move-exception v4

    .line 56
    const-string v0, "KeyStoreEncryptAndDecrypt"

    const-string v1, "Encrypt exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    :goto_0
    invoke-static {v3}, Lcom/huawei/hwid/core/encrypt/HEX;->encode([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;)Ljavax/crypto/SecretKey;
    .locals 8
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 96
    const/4 v4, 0x0

    .line 98
    const-string v0, "AndroidKeyStore"

    :try_start_0
    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v5

    .line 99
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    .line 100
    const/4 v0, 0x0

    invoke-virtual {v5, p0, v0}, Ljava/security/KeyStore;->getKey(Ljava/lang/String;[C)Ljava/security/Key;

    move-result-object v6

    .line 101
    if-eqz v6, :cond_0

    instance-of v0, v6, Ljavax/crypto/SecretKey;

    if-eqz v0, :cond_0

    .line 102
    move-object v0, v6

    check-cast v0, Ljavax/crypto/SecretKey;

    move-object v4, v0

    goto :goto_0

    .line 104
    :cond_0
    const-string v0, "AES"

    const-string v1, "AndroidKeyStore"

    invoke-static {v0, v1}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v7

    .line 106
    new-instance v0, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "CBC"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 108
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setBlockModes([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "PKCS7Padding"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 109
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    .line 110
    const/16 v1, 0x100

    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeySize(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    .line 111
    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    move-result-object v0

    .line 106
    invoke-virtual {v7, v0}, Ljavax/crypto/KeyGenerator;->init(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 112
    invoke-virtual {v7}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v4, v0

    .line 118
    :goto_0
    goto :goto_1

    .line 114
    :catch_0
    move-exception v5

    .line 115
    const-string v0, "KeyStoreEncryptAndDecrypt"

    const-string v1, "RuntimeException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    goto :goto_1

    .line 116
    :catch_1
    move-exception v5

    .line 117
    const-string v0, "KeyStoreEncryptAndDecrypt"

    const-string v1, "Generate key exception "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    :goto_1
    return-object v4
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 68
    invoke-static {p1}, Lcom/huawei/hwid/core/encrypt/HEX;->decode(Ljava/lang/String;)[B

    move-result-object v2

    .line 69
    array-length v0, v2

    const/16 v1, 0x10

    if-gt v0, v1, :cond_0

    .line 70
    const-string v0, "KeyStoreEncryptAndDecrypt"

    const-string v1, "Decrypt source data is invalid."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    const-string v0, ""

    return-object v0

    .line 74
    :cond_0
    const/4 v0, 0x0

    new-array v3, v0, [B

    .line 76
    :try_start_0
    invoke-static {p0}, Lcom/huawei/hwid/core/encrypt/f;->a(Ljava/lang/String;)Ljavax/crypto/SecretKey;

    move-result-object v4

    .line 77
    const/16 v0, 0x10

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v5

    .line 78
    const-string v0, "AES/CBC/PKCS7Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v6

    .line 79
    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v0, v5}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const/4 v1, 0x2

    invoke-virtual {v6, v1, v4, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 80
    array-length v0, v2

    add-int/lit8 v0, v0, -0x10

    const/16 v1, 0x10

    invoke-virtual {v6, v2, v1, v0}, Ljavax/crypto/Cipher;->doFinal([BII)[B
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v3, v0

    .line 85
    goto :goto_0

    .line 81
    :catch_0
    move-exception v4

    .line 82
    const-string v0, "KeyStoreEncryptAndDecrypt"

    const-string v1, "RuntimeException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    goto :goto_0

    .line 83
    :catch_1
    move-exception v4

    .line 84
    const-string v0, "KeyStoreEncryptAndDecrypt"

    const-string v1, "Decrypt exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    :goto_0
    :try_start_1
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v3, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_2

    return-object v0

    .line 88
    :catch_2
    move-exception v4

    .line 89
    const-string v0, "KeyStoreEncryptAndDecrypt"

    const-string v1, "unreachable UnsupportedEncodingException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    const-string v0, ""

    return-object v0
.end method
