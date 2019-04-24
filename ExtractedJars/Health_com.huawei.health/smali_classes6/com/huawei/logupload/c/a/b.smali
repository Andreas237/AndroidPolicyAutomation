.class public final Lcom/huawei/logupload/c/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "LogUpload Service"

.field private static final b:I = 0x10

.field private static final c:I = 0x10


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 163
    return-void
.end method

.method private static a()Ljava/security/SecureRandom;
    .locals 4

    .line 147
    const/4 v2, 0x0

    .line 149
    const-string v0, "SHA1PRNG"

    :try_start_0
    invoke-static {v0}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;)Ljava/security/SecureRandom;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 150
    goto :goto_0

    :catch_0
    move-exception v3

    .line 151
    const-string v0, "LogUpload Service"

    const-string v1, "NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    :goto_0
    if-nez v2, :cond_0

    .line 155
    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    .line 158
    :cond_0
    invoke-virtual {v2}, Ljava/security/SecureRandom;->nextInt()I

    .line 159
    return-object v2
.end method

.method private static a([B)V
    .locals 1

    .line 141
    invoke-static {}, Lcom/huawei/logupload/c/a/b;->a()Ljava/security/SecureRandom;

    move-result-object v0

    .line 142
    invoke-virtual {v0, p0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 143
    return-void
.end method

.method public static a([BI[BI)[B
    .locals 1

    .line 41
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, p3, v0}, Lcom/huawei/logupload/c/a/b;->a([BI[BII)[B

    move-result-object v0

    return-object v0
.end method

.method private static a([BI[BII)[B
    .locals 13

    .line 69
    const/4 v6, 0x0

    .line 70
    const/4 v7, 0x0

    .line 72
    if-eqz p0, :cond_0

    if-nez p2, :cond_1

    .line 73
    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 76
    :cond_1
    if-lez p1, :cond_2

    array-length v0, p0

    if-le p1, v0, :cond_3

    .line 77
    :cond_2
    array-length p1, p0

    .line 80
    :cond_3
    if-lez p3, :cond_4

    array-length v0, p2

    move/from16 v1, p3

    if-le v1, v0, :cond_5

    .line 81
    :cond_4
    array-length v0, p2

    move/from16 p3, v0

    .line 84
    :cond_5
    move/from16 v0, p3

    const/16 v1, 0x10

    if-le v0, v1, :cond_6

    .line 86
    const/16 p3, 0x10

    .line 89
    :cond_6
    const/16 v0, 0x10

    new-array v6, v0, [B

    .line 91
    const/4 v4, 0x0

    goto :goto_0

    .line 92
    :cond_7
    const/4 v0, 0x0

    aput-byte v0, v6, v4

    .line 91
    add-int/lit8 v4, v4, 0x1

    :goto_0
    const/16 v0, 0x10

    if-lt v4, v0, :cond_7

    .line 95
    const/4 v4, 0x0

    goto :goto_1

    .line 96
    :cond_8
    aget-byte v0, p2, v4

    aput-byte v0, v6, v4

    .line 95
    add-int/lit8 v4, v4, 0x1

    :goto_1
    move/from16 v0, p3

    if-lt v4, v0, :cond_8

    .line 99
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v7

    .line 101
    const/16 v0, 0x10

    new-array v8, v0, [B

    .line 102
    const/4 v9, 0x0

    .line 103
    if-nez p4, :cond_9

    .line 104
    const/4 v5, 0x1

    .line 105
    invoke-static {v8}, Lcom/huawei/logupload/c/a/b;->a([B)V

    .line 106
    goto :goto_3

    .line 107
    :cond_9
    const/4 v5, 0x2

    .line 108
    const/4 v10, 0x0

    goto :goto_2

    .line 109
    :cond_a
    aget-byte v0, p0, v10

    aput-byte v0, v8, v10

    .line 108
    add-int/lit8 v10, v10, 0x1

    :goto_2
    const/16 v0, 0x10

    if-ge v10, v0, :cond_b

    array-length v0, p0

    if-lt v10, v0, :cond_a

    .line 111
    :cond_b
    const/16 v9, 0x10

    .line 113
    :goto_3
    new-instance v10, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v10, v8}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 116
    :try_start_0
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    const/4 v2, 0x0

    const/16 v3, 0x10

    invoke-direct {v0, v6, v2, v3, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    invoke-virtual {v7, v5, v0, v10}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    goto :goto_4

    :catch_0
    move-exception v11

    .line 120
    :goto_4
    const/4 v11, 0x0

    .line 122
    sub-int v0, p1, v9

    :try_start_1
    invoke-virtual {v7, p0, v9, v0}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object v12

    .line 123
    if-nez p4, :cond_c

    .line 124
    array-length v0, v8

    array-length v1, v12

    add-int/lit8 v0, v1, 0x10

    invoke-static {v8, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    move-object v11, v0

    .line 125
    array-length v0, v8

    array-length v1, v12

    const/4 v2, 0x0

    const/16 v0, 0x10

    invoke-static {v12, v2, v11, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 126
    goto :goto_5

    .line 128
    :cond_c
    move-object v11, v12

    .line 131
    goto :goto_5

    :catch_1
    move-exception v12

    .line 132
    const-string v0, "LogUpload Service"

    const-string v1, "RuntimeException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    .line 133
    :catch_2
    move-exception v12

    .line 134
    const-string v0, "LogUpload Service"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    :goto_5
    return-object v11
.end method

.method public static b([BI[BI)[B
    .locals 1

    .line 60
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, p3, v0}, Lcom/huawei/logupload/c/a/b;->a([BI[BII)[B

    move-result-object v0

    return-object v0
.end method
