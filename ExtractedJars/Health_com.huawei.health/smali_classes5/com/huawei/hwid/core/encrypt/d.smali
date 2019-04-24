.class public Lcom/huawei/hwid/core/encrypt/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 19
    const/4 v2, 0x0

    .line 40
    :try_start_0
    new-instance v3, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    const-string v1, "HmacSHA256"

    invoke-direct {v3, v0, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 41
    invoke-virtual {v3}, Ljavax/crypto/spec/SecretKeySpec;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v4

    .line 42
    invoke-virtual {v4, v3}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 43
    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v5

    .line 45
    new-instance v0, Lorg/apache/commons/codec/binary/Hex;

    invoke-direct {v0}, Lorg/apache/commons/codec/binary/Hex;-><init>()V

    invoke-virtual {v0, v5}, Lorg/apache/commons/codec/binary/Hex;->encode([B)[B

    move-result-object v6

    .line 46
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v6, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_2

    return-object v0

    .line 48
    :catch_0
    move-exception v3

    .line 49
    const-string v0, "HMACSHA256"

    const-string v1, "UnsupportedEncodingException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    goto :goto_0

    .line 50
    :catch_1
    move-exception v3

    .line 51
    const-string v0, "HMACSHA256"

    const-string v1, "InvalidKeyException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    goto :goto_0

    .line 52
    :catch_2
    move-exception v3

    .line 53
    const-string v0, "HMACSHA256"

    const-string v1, "NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    :goto_0
    return-object v2
.end method
