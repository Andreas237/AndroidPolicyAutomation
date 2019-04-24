.class public Lo/akc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 19
    const/16 v0, 0x40

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lo/akc;->e:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
        0x47s
        0x48s
        0x49s
        0x4as
        0x4bs
        0x4cs
        0x4ds
        0x4es
        0x4fs
        0x50s
        0x51s
        0x52s
        0x53s
        0x54s
        0x55s
        0x56s
        0x57s
        0x58s
        0x59s
        0x5as
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
        0x67s
        0x68s
        0x69s
        0x6as
        0x6bs
        0x6cs
        0x6ds
        0x6es
        0x6fs
        0x70s
        0x71s
        0x72s
        0x73s
        0x74s
        0x75s
        0x76s
        0x77s
        0x78s
        0x79s
        0x7as
        0x30s
        0x31s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(II)I
    .locals 4

    .line 106
    shr-int/lit8 v0, p1, 0x4

    add-int/lit8 v2, v0, -0x1

    .line 107
    add-int/lit8 v3, p0, -0x1

    .line 108
    shl-int/lit8 v0, v2, 0x5

    or-int/2addr v0, v3

    return v0
.end method

.method public static b()Ljava/lang/String;
    .locals 9

    .line 42
    const/16 v4, 0x80

    .line 44
    :try_start_0
    new-instance v5, Ljava/security/SecureRandom;

    invoke-direct {v5}, Ljava/security/SecureRandom;-><init>()V

    .line 47
    const-string v0, "AES"

    invoke-static {v0}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v6

    .line 48
    const/16 v0, 0x80

    invoke-virtual {v6, v0, v5}, Ljavax/crypto/KeyGenerator;->init(ILjava/security/SecureRandom;)V

    .line 49
    invoke-virtual {v6}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    move-result-object v7

    .line 50
    invoke-interface {v7}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v8

    .line 51
    const/4 v0, 0x0

    invoke-static {v8, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 52
    :catch_0
    move-exception v4

    .line 53
    const-string v0, "GenerateUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 54
    const-string v0, ""

    return-object v0
.end method

.method public static b(I)Ljava/lang/String;
    .locals 10

    .line 130
    if-gtz p0, :cond_0

    .line 131
    const-string v0, "GenerateUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parameter is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 132
    const-string v0, ""

    return-object v0

    .line 134
    :cond_0
    new-instance v4, Ljava/security/SecureRandom;

    invoke-direct {v4}, Ljava/security/SecureRandom;-><init>()V

    .line 135
    const/4 v5, 0x0

    .line 136
    new-array v6, p0, [C

    .line 137
    invoke-virtual {v4}, Ljava/security/SecureRandom;->nextInt()I

    move-result v7

    .line 138
    const/4 v8, 0x0

    :goto_0
    rem-int/lit8 v0, p0, 0x5

    if-ge v8, v0, :cond_1

    .line 139
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    sget-object v1, Lo/akc;->e:[C

    and-int/lit8 v2, v7, 0x3f

    aget-char v1, v1, v2

    aput-char v1, v6, v0

    .line 140
    shr-int/lit8 v7, v7, 0x6

    .line 138
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 143
    :cond_1
    const/4 v8, 0x0

    :goto_1
    div-int/lit8 v0, p0, 0x5

    if-ge v8, v0, :cond_3

    .line 144
    invoke-virtual {v4}, Ljava/security/SecureRandom;->nextInt()I

    move-result v7

    .line 145
    const/4 v9, 0x0

    :goto_2
    const/4 v0, 0x5

    if-ge v9, v0, :cond_2

    .line 146
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    sget-object v1, Lo/akc;->e:[C

    and-int/lit8 v2, v7, 0x3f

    aget-char v1, v1, v2

    aput-char v1, v6, v0

    .line 147
    shr-int/lit8 v7, v7, 0x6

    .line 145
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 143
    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 150
    :cond_3
    new-instance v0, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-direct {v0, v6, v1, p0}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method public static d([B)I
    .locals 6

    .line 71
    const/16 v2, 0xff

    .line 72
    const/4 v3, 0x0

    .line 73
    if-nez p0, :cond_0

    .line 74
    return v2

    .line 76
    :cond_0
    array-length v3, p0

    .line 78
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    .line 80
    aget-byte v0, p0, v4

    and-int/lit16 v0, v0, 0xff

    xor-int/2addr v2, v0

    .line 81
    const/4 v5, 0x0

    :goto_1
    const/16 v0, 0x8

    if-ge v5, v0, :cond_2

    .line 83
    and-int/lit8 v0, v2, 0x1

    if-eqz v0, :cond_1

    .line 85
    shr-int/lit8 v2, v2, 0x1

    .line 86
    xor-int/lit16 v2, v2, 0xb8

    goto :goto_2

    .line 90
    :cond_1
    shr-int/lit8 v2, v2, 0x1

    .line 81
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 78
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 94
    :cond_3
    return v2
.end method

.method public static d()[B
    .locals 2

    .line 31
    const/16 v0, 0x10

    new-array v1, v0, [B

    .line 32
    return-object v1
.end method

.method public static d(I)[B
    .locals 2

    .line 59
    new-array v0, p0, [B

    .line 60
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 61
    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 62
    return-object v0
.end method

.method public static e()I
    .locals 3

    .line 117
    const v1, 0xe2e0

    .line 118
    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    .line 119
    const/16 v0, 0x398

    invoke-virtual {v2, v0}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v0

    add-int/2addr v1, v0

    .line 120
    return v1
.end method
