.class public Lcom/huawei/hihealthservice/old/util/EncodeUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final base64Chars:[C

.field public static final codeLenth:I = 0x10


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const/16 v0, 0x40

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/hihealthservice/old/util/EncodeUtil;->base64Chars:[C

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
        0x23s
        0x7es
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final base642bin(Ljava/lang/String;)[B
    .locals 8

    .line 71
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 72
    mul-int/lit8 v0, v2, 0x6

    div-int/lit8 v0, v0, 0x8

    new-array v3, v0, [B

    .line 73
    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 74
    const/4 v7, 0x0

    .line 76
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    .line 78
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/util/EncodeUtil;->getBase64CharVal(C)I

    move-result v0

    shl-int/2addr v0, v7

    or-int/2addr v6, v0

    .line 79
    add-int/lit8 v7, v7, 0x6

    .line 80
    :goto_1
    const/16 v0, 0x8

    if-lt v7, v0, :cond_0

    .line 82
    and-int/lit16 v0, v6, 0xff

    int-to-byte v0, v0

    aput-byte v0, v3, v5

    .line 83
    ushr-int/lit8 v6, v6, 0x8

    .line 84
    add-int/lit8 v7, v7, -0x8

    .line 85
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 76
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 89
    :cond_1
    return-object v3
.end method

.method public static final bin2base64([B)Ljava/lang/String;
    .locals 2

    .line 66
    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lcom/huawei/hihealthservice/old/util/EncodeUtil;->bin2base64([BII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final bin2base64([BII)Ljava/lang/String;
    .locals 7

    .line 39
    const/4 v2, 0x0

    .line 40
    add-int v3, p1, p2

    .line 41
    const/4 v5, 0x0

    .line 42
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    move v4, p1

    :goto_0
    if-ge v4, v3, :cond_1

    .line 46
    aget-byte v0, p0, v4

    and-int/lit16 v0, v0, 0xff

    shl-int/2addr v0, v2

    or-int/2addr v5, v0

    .line 47
    add-int/lit8 v2, v2, 0x8

    .line 48
    :goto_1
    const/4 v0, 0x6

    if-lt v2, v0, :cond_0

    .line 50
    sget-object v0, Lcom/huawei/hihealthservice/old/util/EncodeUtil;->base64Chars:[C

    and-int/lit8 v1, v5, 0x3f

    aget-char v0, v0, v1

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    ushr-int/lit8 v5, v5, 0x6

    .line 52
    add-int/lit8 v2, v2, -0x6

    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 56
    :cond_1
    if-lez v2, :cond_2

    .line 58
    sget-object v0, Lcom/huawei/hihealthservice/old/util/EncodeUtil;->base64Chars:[C

    and-int/lit8 v1, v5, 0x3f

    aget-char v0, v0, v1

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    :cond_2
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static genRand16Bytes()[B
    .locals 3

    .line 141
    const/16 v0, 0x10

    new-array v1, v0, [B

    .line 142
    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    .line 143
    invoke-virtual {v2, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 144
    return-object v1
.end method

.method private static final getBase64CharVal(C)I
    .locals 2

    .line 94
    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v0, 0x39

    if-gt p0, v0, :cond_0

    .line 96
    add-int/lit8 v0, p0, -0x30

    return v0

    .line 98
    :cond_0
    const/16 v0, 0x41

    if-lt p0, v0, :cond_1

    const/16 v0, 0x5a

    if-gt p0, v0, :cond_1

    .line 100
    add-int/lit8 v0, p0, -0x41

    add-int/lit8 v0, v0, 0xa

    return v0

    .line 102
    :cond_1
    const/16 v0, 0x61

    if-lt p0, v0, :cond_2

    const/16 v0, 0x7a

    if-gt p0, v0, :cond_2

    .line 104
    add-int/lit8 v0, p0, -0x61

    add-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x1a

    return v0

    .line 106
    :cond_2
    const/16 v0, 0x23

    if-ne p0, v0, :cond_3

    .line 108
    const/16 v0, 0x3e

    return v0

    .line 112
    :cond_3
    const/16 v0, 0x3f

    return v0
.end method

.method public static getXorBytes([B[B)[B
    .locals 8

    .line 150
    if-eqz p0, :cond_0

    array-length v0, p0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    if-eqz p1, :cond_0

    array-length v0, p1

    const/16 v1, 0x10

    if-ge v0, v1, :cond_1

    .line 153
    :cond_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/util/EncodeUtil;->genRand16Bytes()[B

    move-result-object v0

    return-object v0

    .line 155
    :cond_1
    invoke-static {}, Lcom/huawei/hihealthservice/old/util/EncodeUtil;->genRand16Bytes()[B

    move-result-object v2

    .line 157
    const/16 v0, 0x10

    new-array v3, v0, [B

    .line 158
    const/4 v4, 0x0

    :goto_0
    const/16 v0, 0x10

    if-ge v4, v0, :cond_2

    .line 160
    aget-byte v5, p0, v4

    .line 161
    aget-byte v6, p1, v4

    .line 162
    aget-byte v7, v2, v4

    .line 163
    xor-int v0, v5, v6

    xor-int/2addr v0, v7

    int-to-byte v0, v0

    aput-byte v0, v3, v4

    .line 158
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 165
    :cond_2
    return-object v3
.end method

.method public static sha(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 126
    const-string v0, "SHA-256"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    .line 127
    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 128
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/util/DataConvertUtil;->bin2hex([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
