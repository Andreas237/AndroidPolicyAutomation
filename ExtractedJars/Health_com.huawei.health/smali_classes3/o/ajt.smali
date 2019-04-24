.class public Lo/ajt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const/16 v0, 0x11

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lo/ajt;->b:[B

    return-void

    :array_0
    .array-data 1
        -0x6bt
        0xct
        0x5bt
        0xat
        -0x7bt
        -0x75t
        -0x61t
        0x71t
        -0x63t
        -0x75t
        -0x2dt
        0x33t
        -0xat
        -0x42t
        -0x5ct
        0x27t
        0x59t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Ljava/lang/String;[B[B)[B
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljavax/crypto/NoSuchPaddingException;,
            Ljava/security/InvalidAlgorithmParameterException;,
            Ljava/security/InvalidKeyException;,
            Ljavax/crypto/BadPaddingException;,
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 103
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 104
    :cond_0
    const-string v0, "AesCryptUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Input Argument illegal ..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 105
    const/4 v0, 0x0

    return-object v0

    .line 107
    :cond_1
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v4

    .line 108
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v5

    .line 109
    array-length v6, v5

    .line 110
    new-array v7, v6, [B

    .line 111
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v5, v0, v7, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 113
    new-instance v8, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v8, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 114
    new-instance v9, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v9, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 116
    const/4 v0, 0x1

    invoke-virtual {v4, v0, v8, v9}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 117
    invoke-virtual {v4, v7}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static d([B[B[B)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljavax/crypto/NoSuchPaddingException;,
            Ljava/security/InvalidAlgorithmParameterException;,
            Ljava/security/InvalidKeyException;,
            Ljavax/crypto/BadPaddingException;,
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 125
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 126
    :cond_0
    const-string v0, "AesCryptUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Input Argument illegal ..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 127
    const-string v0, ""

    return-object v0

    .line 129
    :cond_1
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v4

    .line 130
    new-instance v5, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v5, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 131
    new-instance v6, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v6, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 133
    const/4 v0, 0x2

    invoke-virtual {v4, v0, v5, v6}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 135
    invoke-virtual {v4, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v7

    .line 136
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v7, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d()[B
    .locals 3

    .line 88
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 89
    const/16 v0, 0x8

    new-array v2, v0, [B

    .line 90
    invoke-virtual {v1, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 91
    return-object v2
.end method

.method public static d([BLjava/lang/String;[B)[B
    .locals 5

    .line 40
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 41
    :cond_0
    const-string v0, "AesCryptUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "encrypt content or key or iv is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 42
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 46
    :cond_1
    :try_start_0
    invoke-static {p1}, Lo/deg;->d(Ljava/lang/String;)[B

    move-result-object v4

    .line 47
    const/4 v0, 0x2

    invoke-static {v0, v4, p2, p0}, Lo/ddy;->e(I[B[B[B)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 48
    :catch_0
    move-exception v4

    .line 49
    const-string v0, "AesCryptUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 51
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public static e()[B
    .locals 1

    .line 95
    sget-object v0, Lo/ajt;->b:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public static e([B)[B
    .locals 5

    .line 61
    if-eqz p0, :cond_0

    array-length v0, p0

    if-eqz v0, :cond_0

    array-length v0, p0

    const/16 v1, 0x40

    if-le v0, v1, :cond_1

    .line 62
    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 65
    :cond_1
    const/16 v0, 0x400

    invoke-static {v0}, Lo/akc;->d(I)[B

    move-result-object v2

    .line 68
    const/4 v3, 0x0

    :goto_0
    array-length v0, p0

    div-int/lit8 v0, v0, 0x2

    if-ge v3, v0, :cond_2

    .line 69
    aget-byte v4, p0, v3

    .line 70
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, v3

    aget-byte v0, p0, v0

    aput-byte v0, p0, v3

    .line 71
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, v3

    aput-byte v4, p0, v0

    .line 68
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 75
    :cond_2
    const/4 v3, 0x0

    :goto_1
    array-length v0, p0

    if-ge v3, v0, :cond_3

    .line 76
    array-length v0, p0

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, -0x2

    aget-byte v1, p0, v3

    aput-byte v1, v2, v0

    .line 75
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 79
    :cond_3
    array-length v0, p0

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v2, v1

    .line 80
    return-object v2
.end method
