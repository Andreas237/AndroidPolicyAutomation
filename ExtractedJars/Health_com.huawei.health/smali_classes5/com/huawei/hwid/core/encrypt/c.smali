.class public Lcom/huawei/hwid/core/encrypt/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a()Ljava/lang/String;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "TrulyRandom"
        }
    .end annotation

    .line 20
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 21
    const/16 v0, 0x10

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->generateSeed(I)[B

    move-result-object v2

    .line 22
    array-length v0, v2

    invoke-static {v2, v0}, Lcom/huawei/hwid/core/encrypt/HEX;->encode([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a([B[B)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/InvalidKeyException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljavax/crypto/NoSuchPaddingException;,
            Ljava/security/InvalidAlgorithmParameterException;,
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljavax/crypto/BadPaddingException;
        }
    .end annotation

    .line 51
    invoke-static {}, Lcom/huawei/hwid/core/encrypt/c;->a()Ljava/lang/String;

    move-result-object v3

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v3}, Lcom/huawei/hwid/core/encrypt/HEX;->decode(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p1, v2}, Lcom/huawei/hwid/core/encrypt/c;->a([BI)Ljavax/crypto/spec/SecretKeySpec;

    move-result-object v2

    invoke-static {p0, v1, v2}, Lcom/huawei/hwid/core/encrypt/b;->a([B[BLjavax/crypto/spec/SecretKeySpec;)[B

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/hwid/core/encrypt/HEX;->encode([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a([BI)Ljavax/crypto/spec/SecretKeySpec;
    .locals 6

    .line 27
    if-lez p1, :cond_0

    array-length v0, p0

    if-le p1, v0, :cond_1

    .line 28
    :cond_0
    array-length p1, p0

    .line 31
    :cond_1
    const/16 v0, 0x10

    if-le p1, v0, :cond_2

    .line 33
    const/16 p1, 0x10

    .line 36
    :cond_2
    const/16 v0, 0x10

    new-array v5, v0, [B

    .line 38
    const/4 v4, 0x0

    :goto_0
    const/16 v0, 0x10

    if-ge v4, v0, :cond_3

    .line 39
    const/4 v0, 0x0

    aput-byte v0, v5, v4

    .line 38
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 42
    :cond_3
    const/4 v4, 0x0

    :goto_1
    if-ge v4, p1, :cond_4

    .line 43
    aget-byte v0, p0, v4

    aput-byte v0, v5, v4

    .line 42
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 45
    :cond_4
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES/CBC/PKCS5Padding"

    const/4 v2, 0x0

    const/16 v3, 0x10

    invoke-direct {v0, v5, v2, v3, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;[B)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/InvalidKeyException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljavax/crypto/NoSuchPaddingException;,
            Ljava/security/InvalidAlgorithmParameterException;,
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljavax/crypto/BadPaddingException;
        }
    .end annotation

    .line 60
    invoke-static {p1}, Lcom/huawei/hwid/core/encrypt/HEX;->decode(Ljava/lang/String;)[B

    move-result-object v1

    .line 61
    const/4 v0, 0x0

    invoke-static {p2, v0}, Lcom/huawei/hwid/core/encrypt/c;->a([BI)Ljavax/crypto/spec/SecretKeySpec;

    move-result-object v0

    invoke-static {p0, v1, v0}, Lcom/huawei/hwid/core/encrypt/b;->a(Ljava/lang/String;[BLjavax/crypto/spec/SecretKeySpec;)[B

    move-result-object v0

    return-object v0
.end method
