.class public final Lcom/huawei/wallet/utils/crypto/AES;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 253
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {p0, p1, v0}, Lcom/huawei/wallet/utils/crypto/AES;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 302
    const/4 v0, 0x2

    :try_start_0
    invoke-static {p0, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v3

    .line 303
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v3, v0, p2}, Lcom/huawei/wallet/utils/crypto/AES;->b([B[BLjava/lang/String;)[B

    move-result-object v4

    .line 304
    if-nez v4, :cond_0

    .line 306
    const-string v0, "baselib"

    const-string v1, "decryptFromBase64 decrypt data is null"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 307
    const/4 v0, 0x0

    return-object v0

    .line 311
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v4, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    .line 314
    :catch_0
    move-exception v3

    .line 316
    const-string v0, "decryptFromBase64 UnsupportedEncodingException"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 318
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a([B)Ljava/lang/String;
    .locals 5

    .line 329
    new-instance v3, Ljava/lang/StringBuffer;

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 332
    const/4 v4, 0x0

    :goto_0
    array-length v0, p0

    if-ge v4, v0, :cond_1

    .line 334
    aget-byte v0, p0, v4

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 336
    const/16 v0, 0x30

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 339
    :cond_0
    aget-byte v0, p0, v4

    and-int/lit16 v0, v0, 0xff

    int-to-long v0, v0

    const/16 v2, 0x10

    invoke-static {v0, v1, v2}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 332
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 342
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 287
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {p0, p1, v0}, Lcom/huawei/wallet/utils/crypto/AES;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static b([B[BLjava/lang/String;)[B
    .locals 8

    .line 182
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_3

    .line 184
    :cond_0
    const-string v0, "baselib"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AES decrypt data: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez p0, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " key: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez p1, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 185
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 188
    :cond_3
    array-length v0, p1

    const/16 v1, 0x10

    if-eq v0, v1, :cond_4

    .line 190
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 194
    :cond_4
    :try_start_0
    new-instance v3, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v3, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 195
    invoke-virtual {v3}, Ljavax/crypto/spec/SecretKeySpec;->getEncoded()[B

    move-result-object v4

    .line 196
    new-instance v5, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v5, v4, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 199
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 201
    :cond_5
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v6

    .line 202
    new-instance v7, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v7, p1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 203
    const/4 v0, 0x2

    invoke-virtual {v6, v0, v5, v7}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 204
    goto :goto_2

    .line 207
    :cond_6
    invoke-static {p2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v6

    .line 208
    const/4 v0, 0x2

    invoke-virtual {v6, v0, v5}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 210
    :goto_2
    invoke-virtual {v6, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_6

    move-result-object v0

    return-object v0

    .line 212
    :catch_0
    move-exception v3

    .line 214
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "decrypt IllegalArgumentException::"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 239
    goto/16 :goto_3

    .line 216
    :catch_1
    move-exception v3

    .line 218
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "decrypt NoSuchPaddingException::"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 239
    goto/16 :goto_3

    .line 220
    :catch_2
    move-exception v3

    .line 222
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "decrypt NoSuchAlgorithmException::"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 239
    goto :goto_3

    .line 224
    :catch_3
    move-exception v3

    .line 226
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "decrypt InvalidKeyException::"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 239
    goto :goto_3

    .line 228
    :catch_4
    move-exception v3

    .line 230
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "decrypt BadPaddingException::"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 239
    goto :goto_3

    .line 232
    :catch_5
    move-exception v3

    .line 234
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "decrypt IllegalBlockSizeException::"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 239
    goto :goto_3

    .line 236
    :catch_6
    move-exception v3

    .line 238
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "decrypt InvalidAlgorithmParameterException::"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 241
    :goto_3
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 268
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v0, v1, p2}, Lcom/huawei/wallet/utils/crypto/AES;->e([B[BLjava/lang/String;)[B

    move-result-object v2

    .line 269
    const/4 v0, 0x2

    invoke-static {v2, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 271
    :catch_0
    move-exception v2

    .line 273
    const-string v0, "encrypt UnsupportedEncodingException."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 275
    const/4 v0, 0x0

    return-object v0
.end method

.method public static e(Ljava/lang/String;)[B
    .locals 7

    .line 353
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    .line 355
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 358
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-array v3, v0, [B

    .line 360
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    if-ge v4, v0, :cond_1

    .line 362
    mul-int/lit8 v0, v4, 0x2

    mul-int/lit8 v1, v4, 0x2

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    .line 363
    mul-int/lit8 v0, v4, 0x2

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v1, v4, 0x2

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v6

    .line 365
    mul-int/lit8 v0, v5, 0x10

    add-int/2addr v0, v6

    int-to-byte v0, v0

    aput-byte v0, v3, v4

    .line 360
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 368
    :cond_1
    return-object v3
.end method

.method private static e([B[BLjava/lang/String;)[B
    .locals 7

    .line 100
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 102
    :cond_0
    const-string v0, "The data or key to be encrypted is empty!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 103
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 106
    :cond_1
    array-length v0, p1

    const/16 v1, 0x10

    if-eq v0, v1, :cond_2

    .line 108
    const-string v0, "Invalid AES key length (must be 16 bytes)"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 109
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 114
    :cond_2
    :try_start_0
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v2, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 115
    invoke-virtual {v2}, Ljavax/crypto/spec/SecretKeySpec;->getEncoded()[B

    move-result-object v3

    .line 116
    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v4, v3, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 119
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 121
    :cond_3
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v5

    .line 122
    new-instance v6, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v6, p1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 123
    const/4 v0, 0x1

    invoke-virtual {v5, v0, v4, v6}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 124
    goto :goto_0

    .line 128
    :cond_4
    invoke-static {p2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v5

    .line 129
    const/4 v0, 0x1

    invoke-virtual {v5, v0, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 132
    :goto_0
    invoke-virtual {v5, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B
    :try_end_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_5

    move-result-object v0

    return-object v0

    .line 134
    :catch_0
    move-exception v2

    .line 136
    const-string v0, "encrypt NoSuchPaddingException."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 157
    goto :goto_1

    .line 138
    :catch_1
    move-exception v2

    .line 140
    const-string v0, "encrypt NoSuchAlgorithmException."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 157
    goto :goto_1

    .line 142
    :catch_2
    move-exception v2

    .line 144
    const-string v0, "encrypt InvalidAlgorithmParameterException."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 157
    goto :goto_1

    .line 146
    :catch_3
    move-exception v2

    .line 148
    const-string v0, "encrypt InvalidKeyException."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 157
    goto :goto_1

    .line 150
    :catch_4
    move-exception v2

    .line 152
    const-string v0, "encrypt BadPaddingException."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 157
    goto :goto_1

    .line 154
    :catch_5
    move-exception v2

    .line 156
    const-string v0, "encrypt IllegalBlockSizeException."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 159
    :goto_1
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method
