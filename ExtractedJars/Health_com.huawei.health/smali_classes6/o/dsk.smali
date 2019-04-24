.class public Lo/dsk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    const-class v0, Lo/dsk;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dsk;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 31
    invoke-static {p0}, Lo/dsi;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 32
    invoke-static {p1, v1}, Lo/dsk;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 97
    const/4 v1, 0x0

    .line 99
    if-eqz p1, :cond_0

    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    new-array v1, v0, [B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    :goto_0
    goto :goto_1

    .line 100
    :catch_0
    move-exception v2

    .line 101
    const/4 v0, 0x0

    new-array v1, v0, [B

    .line 103
    :goto_1
    array-length v0, v1

    if-nez v0, :cond_1

    .line 104
    const/4 v0, 0x0

    return-object v0

    .line 106
    :cond_1
    invoke-static {p0, v1}, Lo/dsk;->c(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a([B)Ljava/lang/String;
    .locals 6

    .line 140
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 141
    const/4 v0, 0x0

    return-object v0

    .line 143
    :cond_0
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 144
    const/4 v3, 0x0

    .line 145
    array-length v4, p0

    .line 146
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_3

    .line 147
    aget-byte v0, p0, v5

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    .line 148
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 151
    :cond_1
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 152
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 153
    const/4 v3, 0x0

    .line 146
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 156
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;)[B
    .locals 8

    .line 166
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    .line 167
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 168
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v3, v0, 0x2

    .line 169
    new-array v4, v3, [B

    .line 170
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    .line 171
    mul-int/lit8 v0, v5, 0x2

    mul-int/lit8 v1, v5, 0x2

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v6

    .line 172
    mul-int/lit8 v0, v5, 0x2

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v1, v5, 0x2

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v7

    .line 174
    mul-int/lit8 v0, v6, 0x10

    add-int/2addr v0, v7

    int-to-byte v0, v0

    aput-byte v0, v4, v5

    .line 170
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 176
    :cond_1
    return-object v4
.end method

.method public static b()[B
    .locals 4

    .line 42
    const-string v0, "AES"

    :try_start_0
    invoke-static {v0}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v2

    .line 43
    const/16 v0, 0x80

    invoke-virtual {v2, v0}, Ljavax/crypto/KeyGenerator;->init(I)V

    .line 44
    invoke-virtual {v2}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    move-result-object v3

    .line 45
    invoke-interface {v3}, Ljavax/crypto/SecretKey;->getEncoded()[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 46
    :catch_0
    move-exception v2

    .line 47
    sget-object v0, Lo/dsk;->b:Ljava/lang/String;

    const-string v1, " AESSecureKey is exception"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public static c(Ljava/lang/String;[B)Ljava/lang/String;
    .locals 7

    .line 110
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    if-nez v0, :cond_1

    .line 111
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 114
    :cond_1
    :try_start_0
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v2, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 115
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 117
    const/4 v0, 0x0

    const/16 v1, 0x20

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 119
    new-instance v5, Ljavax/crypto/spec/IvParameterSpec;

    .line 120
    invoke-static {v4}, Lo/dsk;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-direct {v5, v0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 121
    const/4 v0, 0x2

    invoke-virtual {v3, v0, v2, v5}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 122
    .line 123
    const/16 v0, 0x20

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 122
    invoke-static {v0}, Lo/dsk;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v6

    .line 124
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v6, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 125
    :catch_0
    move-exception v2

    .line 128
    sget-object v0, Lo/dsk;->b:Ljava/lang/String;

    const-string v1, " aesDncrypt is exception"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    const/4 v0, 0x0

    return-object v0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 36
    invoke-static {p0}, Lo/dsi;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 37
    invoke-static {p1, v1}, Lo/dsk;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 53
    const/4 v1, 0x0

    .line 55
    if-eqz p1, :cond_0

    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    new-array v1, v0, [B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    :goto_0
    goto :goto_1

    .line 56
    :catch_0
    move-exception v2

    .line 57
    const/4 v0, 0x0

    new-array v1, v0, [B

    .line 59
    :goto_1
    array-length v0, v1

    if-nez v0, :cond_1

    .line 60
    const/4 v0, 0x0

    return-object v0

    .line 62
    :cond_1
    invoke-static {p0, v1}, Lo/dsk;->e(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Ljava/lang/String;[B)Ljava/lang/String;
    .locals 9

    .line 66
    const/4 v2, 0x0

    .line 69
    :try_start_0
    new-instance v3, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v3, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 71
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v4

    .line 74
    new-instance v5, Ljava/security/SecureRandom;

    invoke-direct {v5}, Ljava/security/SecureRandom;-><init>()V

    .line 75
    const/16 v0, 0x10

    new-array v6, v0, [B

    .line 76
    invoke-virtual {v5, v6}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 78
    new-instance v7, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v7, v6}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 79
    const/4 v0, 0x1

    invoke-virtual {v4, v0, v3, v7}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 81
    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v8

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6}, Lo/dsk;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v8}, Lo/dsk;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v2

    .line 91
    goto :goto_0

    .line 85
    :catch_0
    move-exception v3

    .line 86
    sget-object v0, Lo/dsk;->b:Ljava/lang/String;

    const-string v1, " aesEncrypt is RuntimeException "

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    const/4 v2, 0x0

    .line 91
    goto :goto_0

    .line 88
    :catch_1
    move-exception v3

    .line 89
    sget-object v0, Lo/dsk;->b:Ljava/lang/String;

    const-string v1, " aesEncrypt is exception"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    const/4 v2, 0x0

    .line 92
    :goto_0
    return-object v2
.end method
