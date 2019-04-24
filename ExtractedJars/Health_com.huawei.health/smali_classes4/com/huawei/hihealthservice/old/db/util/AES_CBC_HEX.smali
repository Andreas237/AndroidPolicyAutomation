.class public Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final TRAMSFORMATION:Ljava/lang/String; = "AES/CBC/ISO10126Padding"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static desEncrypt(Ljava/lang/String;[B[B)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 39
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/util/HEX;->decode(Ljava/lang/String;)[B

    move-result-object v1

    .line 41
    const-string v0, "AES/CBC/ISO10126Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v2

    .line 42
    new-instance v3, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v3, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 43
    new-instance v4, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v4, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 45
    const/4 v0, 0x2

    invoke-virtual {v2, v0, v3, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 47
    invoke-virtual {v2, v1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v5

    .line 48
    new-instance v6, Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-direct {v6, v5, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 49
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static encrypt(Ljava/lang/String;[B[B)Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 14
    const-string v0, "AES/CBC/ISO10126Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 15
    invoke-virtual {v3}, Ljavax/crypto/Cipher;->getBlockSize()I

    move-result v4

    .line 17
    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v5

    .line 18
    array-length v6, v5

    .line 19
    rem-int v0, v6, v4

    if-eqz v0, :cond_0

    .line 21
    rem-int v0, v6, v4

    sub-int v0, v4, v0

    add-int/2addr v6, v0

    .line 24
    :cond_0
    new-array v7, v6, [B

    .line 25
    array-length v0, v5

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v5, v1, v7, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    new-instance v8, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v8, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 28
    new-instance v9, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v9, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 29
    const/4 v0, 0x1

    invoke-virtual {v3, v0, v8, v9}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 30
    invoke-virtual {v3, v7}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v10

    .line 32
    const/4 v0, 0x0

    invoke-static {v10, v0}, Lcom/huawei/hihealthservice/old/util/HEX;->encode([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
