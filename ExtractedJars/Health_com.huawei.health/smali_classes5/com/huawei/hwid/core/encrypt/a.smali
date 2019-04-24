.class public Lcom/huawei/hwid/core/encrypt/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    const-string v0, ""

    sput-object v0, Lcom/huawei/hwid/core/encrypt/a;->a:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "TrulyRandom"
        }
    .end annotation

    .line 48
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    const-string v0, ""

    return-object v0

    .line 52
    :cond_0
    :try_start_0
    sget-object v0, Lcom/huawei/hwid/core/encrypt/a;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 54
    invoke-static {}, Lcom/huawei/hwid/core/d/a;->b()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/core/encrypt/a;->a:Ljava/lang/String;

    .line 55
    invoke-static {p0}, Lcom/huawei/hwid/core/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/c/a;

    move-result-object v0

    const-string v1, "rkey"

    sget-object v2, Lcom/huawei/hwid/core/encrypt/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwid/core/c/a;->a(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 57
    :cond_1
    sget-object v0, Lcom/huawei/hwid/core/encrypt/a;->a:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/encrypt/a;->f(Landroid/content/Context;Ljava/lang/String;)[B

    move-result-object v3

    .line 59
    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v4, v3, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 60
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v5

    .line 63
    new-instance v6, Ljava/security/SecureRandom;

    invoke-direct {v6}, Ljava/security/SecureRandom;-><init>()V

    .line 64
    const/16 v0, 0x10

    new-array v7, v0, [B

    .line 65
    invoke-virtual {v6, v7}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 67
    new-instance v8, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v8, v7}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 68
    const/4 v0, 0x1

    invoke-virtual {v5, v0, v4, v8}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 69
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v9

    .line 72
    invoke-static {v7}, Lcom/huawei/hwid/core/d/b;->a([B)Ljava/lang/String;

    move-result-object v10

    .line 73
    invoke-static {v9}, Lcom/huawei/hwid/core/d/b;->a([B)Ljava/lang/String;

    move-result-object v11

    .line 74
    invoke-static {v10, v11}, Lcom/huawei/hwid/core/encrypt/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 75
    :catch_0
    move-exception v3

    .line 76
    const-string v0, "AES128_CBC"

    const-string v1, "aes cbc encrypter data error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    goto :goto_0

    .line 77
    :catch_1
    move-exception v3

    .line 78
    const-string v0, "AES128_CBC"

    const-string v1, "aes cbc encrypter data error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    :goto_0
    const-string v0, ""

    return-object v0
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;[B)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljavax/crypto/NoSuchPaddingException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/InvalidAlgorithmParameterException;,
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljavax/crypto/BadPaddingException;,
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 147
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v2, p2, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 148
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 151
    invoke-static {p1}, Lcom/huawei/hwid/core/encrypt/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 152
    invoke-static {p1}, Lcom/huawei/hwid/core/encrypt/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 153
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 154
    :cond_0
    const-string v0, "AES128_CBC"

    const-string v1, "ivParameter or encrypedWord is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    const-string v0, ""

    return-object v0

    .line 157
    :cond_1
    new-instance v6, Ljavax/crypto/spec/IvParameterSpec;

    invoke-static {v4}, Lcom/huawei/hwid/core/d/b;->b(Ljava/lang/String;)[B

    move-result-object v0

    invoke-direct {v6, v0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 159
    const/4 v0, 0x2

    invoke-virtual {v3, v0, v2, v6}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 160
    invoke-static {v5}, Lcom/huawei/hwid/core/d/b;->b(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v7

    .line 162
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v7, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object v0
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 313
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 314
    const-string v0, ""

    return-object v0

    .line 317
    :cond_0
    :try_start_0
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 318
    const/4 v0, 0x6

    const/16 v1, 0xc

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 319
    const/16 v0, 0x10

    const/16 v1, 0x1a

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 320
    const/16 v0, 0x20

    const/16 v1, 0x30

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 321
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 322
    :catch_0
    move-exception v2

    .line 323
    const-string v0, "AES128_CBC"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    const-string v0, ""

    return-object v0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 283
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 284
    :cond_0
    const-string v0, ""

    return-object v0

    .line 287
    :cond_1
    :try_start_0
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 288
    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 289
    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 291
    const/4 v0, 0x6

    const/16 v1, 0xa

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 292
    const/4 v0, 0x6

    const/16 v1, 0x10

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 294
    const/16 v0, 0xa

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 295
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 297
    const/16 v0, 0x10

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 298
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 299
    :catch_0
    move-exception v2

    .line 300
    const-string v0, "AES128_CBC"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    const-string v0, ""

    return-object v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 3

    .line 43
    invoke-static {p0}, Lcom/huawei/hwid/core/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/c/a;

    move-result-object v0

    const-string v1, "rkey"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwid/core/c/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/core/encrypt/a;->a:Ljava/lang/String;

    .line 44
    return-void
.end method

.method private static a([B)[B
    .locals 3

    .line 213
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 214
    return-object p0

    .line 217
    :cond_0
    const/4 v2, 0x0

    :goto_0
    array-length v0, p0

    if-ge v2, v0, :cond_1

    .line 218
    aget-byte v0, p0, v2

    shr-int/lit8 v0, v0, 0x2

    int-to-byte v0, v0

    aput-byte v0, p0, v2

    .line 217
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 220
    :cond_1
    return-object p0
.end method

.method private static a([BI)[B
    .locals 3

    .line 259
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 260
    return-object p0

    .line 263
    :cond_0
    const/4 v2, 0x0

    :goto_0
    array-length v0, p0

    if-ge v2, v0, :cond_2

    .line 264
    if-gez p1, :cond_1

    .line 265
    aget-byte v0, p0, v2

    neg-int v1, p1

    shl-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, p0, v2

    goto :goto_1

    .line 267
    :cond_1
    aget-byte v0, p0, v2

    shr-int/2addr v0, p1

    int-to-byte v0, v0

    aput-byte v0, p0, v2

    .line 263
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 271
    :cond_2
    return-object p0
.end method

.method private static a([B[B)[B
    .locals 6

    .line 231
    const/4 v2, 0x0

    .line 232
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 233
    :cond_0
    return-object v2

    .line 236
    :cond_1
    array-length v3, p0

    .line 237
    array-length v4, p1

    .line 238
    if-eq v3, v4, :cond_2

    .line 239
    return-object v2

    .line 242
    :cond_2
    new-array v2, v3, [B

    .line 243
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_3

    .line 244
    aget-byte v0, p0, v5

    aget-byte v1, p1, v5

    xor-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v2, v5

    .line 243
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 247
    :cond_3
    return-object v2
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 86
    sget-object v0, Lcom/huawei/hwid/core/encrypt/a;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/encrypt/a;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 89
    :cond_0
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/encrypt/a;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 336
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 337
    const-string v0, ""

    return-object v0

    .line 340
    :cond_0
    :try_start_0
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 341
    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 342
    const/16 v0, 0xc

    const/16 v1, 0x10

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 343
    const/16 v0, 0x1a

    const/16 v1, 0x20

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 344
    const/16 v0, 0x30

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 345
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 346
    :catch_0
    move-exception v2

    .line 347
    const-string v0, "AES128_CBC"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    const-string v0, ""

    return-object v0
.end method

.method public static b(Landroid/content/Context;)[B
    .locals 6

    .line 172
    invoke-static {}, Lcom/huawei/hwid/core/constants/HwAccountConstants;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->b(Ljava/lang/String;)[B

    move-result-object v2

    .line 173
    invoke-static {}, Lcom/huawei/hwid/core/d/b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->b(Ljava/lang/String;)[B

    move-result-object v3

    .line 174
    invoke-static {}, Lcom/huawei/hwid/core/d/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->b(Ljava/lang/String;)[B

    move-result-object v4

    .line 177
    const/4 v0, -0x4

    invoke-static {v2, v0}, Lcom/huawei/hwid/core/encrypt/a;->a([BI)[B

    move-result-object v0

    invoke-static {v0, v3}, Lcom/huawei/hwid/core/encrypt/a;->a([B[B)[B

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/encrypt/a;->a([BI)[B

    move-result-object v0

    invoke-static {v0, v4}, Lcom/huawei/hwid/core/encrypt/a;->a([B[B)[B

    move-result-object v5

    .line 179
    return-object v5
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 94
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    const-string v0, ""

    return-object v0

    .line 98
    :cond_0
    :try_start_0
    sget-object v0, Lcom/huawei/hwid/core/encrypt/a;->a:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/encrypt/a;->f(Landroid/content/Context;Ljava/lang/String;)[B

    move-result-object v2

    .line 100
    invoke-static {p0, p1, v2}, Lcom/huawei/hwid/core/encrypt/a;->a(Landroid/content/Context;Ljava/lang/String;[B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 102
    :catch_0
    move-exception v2

    .line 103
    const-string v0, "AES128_CBC"

    const-string v1, "Random decrypter data error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/encrypt/a;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(Landroid/content/Context;)[B
    .locals 5

    .line 203
    invoke-static {}, Lcom/huawei/hwid/core/constants/HwAccountConstants;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->b(Ljava/lang/String;)[B

    move-result-object v1

    .line 204
    invoke-static {}, Lcom/huawei/hwid/core/d/b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->b(Ljava/lang/String;)[B

    move-result-object v2

    .line 205
    invoke-static {}, Lcom/huawei/hwid/core/d/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->b(Ljava/lang/String;)[B

    move-result-object v3

    .line 207
    invoke-static {v1, v2}, Lcom/huawei/hwid/core/encrypt/a;->a([B[B)[B

    move-result-object v0

    invoke-static {v0, v3}, Lcom/huawei/hwid/core/encrypt/a;->a([B[B)[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/encrypt/a;->a([B)[B

    move-result-object v4

    .line 209
    return-object v4
.end method

.method private static d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 112
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    const-string v0, ""

    return-object v0

    .line 116
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/huawei/hwid/core/encrypt/a;->b(Landroid/content/Context;)[B

    move-result-object v2

    .line 118
    invoke-static {p0, p1, v2}, Lcom/huawei/hwid/core/encrypt/a;->a(Landroid/content/Context;Ljava/lang/String;[B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 120
    :catch_0
    move-exception v2

    .line 121
    const-string v0, "AES128_CBC"

    const-string v1, "decrypter data error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/encrypt/a;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 130
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 131
    const-string v0, ""

    return-object v0

    .line 134
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/huawei/hwid/core/encrypt/a;->c(Landroid/content/Context;)[B

    move-result-object v2

    .line 136
    invoke-static {p0, p1, v2}, Lcom/huawei/hwid/core/encrypt/a;->a(Landroid/content/Context;Ljava/lang/String;[B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 138
    :catch_0
    move-exception v2

    .line 139
    const-string v0, "AES128_CBC"

    const-string v1, "OLDKEY decrypter data error again"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    const-string v0, ""

    return-object v0
.end method

.method private static f(Landroid/content/Context;Ljava/lang/String;)[B
    .locals 6

    .line 188
    invoke-static {}, Lcom/huawei/hwid/core/constants/HwAccountConstants;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->b(Ljava/lang/String;)[B

    move-result-object v2

    .line 189
    invoke-static {}, Lcom/huawei/hwid/core/d/b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->b(Ljava/lang/String;)[B

    move-result-object v3

    .line 190
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/d/a;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->b(Ljava/lang/String;)[B

    move-result-object v4

    .line 191
    const/4 v0, -0x4

    invoke-static {v2, v0}, Lcom/huawei/hwid/core/encrypt/a;->a([BI)[B

    move-result-object v0

    invoke-static {v0, v3}, Lcom/huawei/hwid/core/encrypt/a;->a([B[B)[B

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/encrypt/a;->a([BI)[B

    move-result-object v0

    invoke-static {v0, v4}, Lcom/huawei/hwid/core/encrypt/a;->a([B[B)[B

    move-result-object v5

    .line 193
    return-object v5
.end method
