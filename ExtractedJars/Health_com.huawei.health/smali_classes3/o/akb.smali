.class public Lo/akb;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Ljavax/crypto/Mac;[BI[BII)V
    .locals 6

    .line 32
    invoke-virtual {p0}, Ljavax/crypto/Mac;->getMacLength()I

    move-result v3

    .line 33
    array-length v0, p3

    add-int/lit8 v0, v0, 0x4

    new-array v4, v0, [B

    .line 38
    array-length v0, p3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p3, v1, v4, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    array-length v0, p3

    invoke-static {v4, v0, p5}, Lo/akb;->b([BII)V

    .line 44
    const/4 v5, 0x0

    :goto_0
    if-ge v5, p4, :cond_0

    .line 45
    invoke-virtual {p0, v4}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v4

    .line 46
    invoke-static {p1, p2, v4, v3}, Lo/akb;->e([BI[BI)V

    .line 44
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 48
    :cond_0
    return-void
.end method

.method public static a([B[BII)[B
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/InvalidKeyException;
        }
    .end annotation

    .line 72
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 73
    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 76
    :cond_1
    if-lez p3, :cond_2

    if-nez p2, :cond_3

    .line 77
    :cond_2
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 80
    :cond_3
    new-instance v6, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "HmacSHA256"

    invoke-direct {v6, p0, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 81
    const-string v0, "HmacSHA256"

    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v7

    .line 82
    invoke-virtual {v7, v6}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 84
    invoke-virtual {v7}, Ljavax/crypto/Mac;->getMacLength()I

    move-result v8

    .line 85
    add-int/lit8 v0, v8, -0x1

    add-int v0, v0, p3

    div-int v9, v0, v8

    .line 86
    mul-int v0, v9, v8

    new-array v10, v0, [B

    .line 91
    const/4 v11, 0x0

    .line 92
    const/4 v12, 0x1

    :goto_0
    if-gt v12, v9, :cond_4

    .line 93
    move-object v0, v7

    move-object v1, v10

    move v2, v11

    move-object v3, p1

    move v4, p2

    move v5, v12

    invoke-static/range {v0 .. v5}, Lo/akb;->a(Ljavax/crypto/Mac;[BI[BII)V

    .line 94
    add-int/2addr v11, v8

    .line 92
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 100
    :cond_4
    rem-int v0, p3, v8

    if-eqz v0, :cond_5

    .line 101
    move/from16 v0, p3

    new-array v12, v0, [B

    .line 102
    const/4 v0, 0x0

    const/4 v1, 0x0

    move/from16 v2, p3

    invoke-static {v10, v0, v12, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 103
    return-object v12

    .line 106
    :cond_5
    return-object v10
.end method

.method private static final b([BII)V
    .locals 2

    .line 25
    add-int/lit8 v0, p1, 0x0

    shr-int/lit8 v1, p2, 0x18

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 26
    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p2, 0x10

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 27
    add-int/lit8 v0, p1, 0x2

    shr-int/lit8 v1, p2, 0x8

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 28
    add-int/lit8 v0, p1, 0x3

    shr-int/lit8 v1, p2, 0x0

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 29
    return-void
.end method

.method private static final e([BI[BI)V
    .locals 4

    .line 19
    const/4 v3, 0x0

    :goto_0
    if-ge v3, p3, :cond_0

    .line 20
    add-int v0, v3, p1

    aget-byte v1, p0, v0

    aget-byte v2, p2, v3

    xor-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 19
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public static e([B[B)[B
    .locals 6

    .line 116
    const-string v0, "HmacSHA256"

    :try_start_0
    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v4

    .line 117
    new-instance v5, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "HMACSHA256"

    invoke-direct {v5, p0, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 118
    invoke-virtual {v4, v5}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 120
    invoke-virtual {v4, p1}, Ljavax/crypto/Mac;->doFinal([B)[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 121
    :catch_0
    move-exception v4

    .line 122
    const-string v0, "PBKDF2CipherUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 125
    goto :goto_0

    .line 123
    :catch_1
    move-exception v4

    .line 124
    const-string v0, "PBKDF2CipherUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/security/InvalidKeyException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 127
    :goto_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method
