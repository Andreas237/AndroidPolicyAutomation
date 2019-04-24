.class public Lcom/huawei/hihealthservice/old/util/Base64;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CHARS:[C

.field private static decodingValue:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 10
    const/16 v0, 0x40

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/hihealthservice/old/util/Base64;->CHARS:[C

    .line 21
    const/16 v0, 0x80

    new-array v0, v0, [I

    sput-object v0, Lcom/huawei/hihealthservice/old/util/Base64;->decodingValue:[I

    .line 24
    const/4 v2, 0x0

    :goto_0
    sget-object v0, Lcom/huawei/hihealthservice/old/util/Base64;->decodingValue:[I

    array-length v0, v0

    if-ge v2, v0, :cond_0

    .line 25
    sget-object v0, Lcom/huawei/hihealthservice/old/util/Base64;->decodingValue:[I

    const/4 v1, -0x1

    aput v1, v0, v2

    .line 24
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 28
    :cond_0
    const/4 v2, 0x0

    :goto_1
    sget-object v0, Lcom/huawei/hihealthservice/old/util/Base64;->CHARS:[C

    array-length v0, v0

    if-ge v2, v0, :cond_1

    .line 29
    sget-object v0, Lcom/huawei/hihealthservice/old/util/Base64;->decodingValue:[I

    sget-object v1, Lcom/huawei/hihealthservice/old/util/Base64;->CHARS:[C

    aget-char v1, v1, v2

    aput v2, v0, v1

    .line 28
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 31
    :cond_1
    return-void

    nop

    :array_0
    .array-data 2
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
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x2bs
        0x2fs
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
.end method

.method private static decodeQuan(CCCC[BI)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 106
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 107
    const/4 v8, 0x0

    .line 109
    sget-object v0, Lcom/huawei/hihealthservice/old/util/Base64;->decodingValue:[I

    and-int/lit8 v1, p0, 0x7f

    aget v4, v0, v1

    .line 110
    sget-object v0, Lcom/huawei/hihealthservice/old/util/Base64;->decodingValue:[I

    and-int/lit8 v1, p1, 0x7f

    aget v5, v0, v1

    .line 112
    const/16 v0, 0x3d

    if-ne p3, v0, :cond_1

    .line 113
    add-int/lit8 v8, v8, 0x1

    .line 114
    const/16 v0, 0x3d

    if-ne p2, v0, :cond_0

    .line 115
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 117
    :cond_0
    sget-object v0, Lcom/huawei/hihealthservice/old/util/Base64;->decodingValue:[I

    and-int/lit8 v1, p2, 0x7f

    aget v6, v0, v1

    goto :goto_0

    .line 120
    :cond_1
    sget-object v0, Lcom/huawei/hihealthservice/old/util/Base64;->decodingValue:[I

    and-int/lit8 v1, p2, 0x7f

    aget v6, v0, v1

    .line 121
    sget-object v0, Lcom/huawei/hihealthservice/old/util/Base64;->decodingValue:[I

    and-int/lit8 v1, p3, 0x7f

    aget v7, v0, v1

    .line 124
    :goto_0
    if-ltz v4, :cond_2

    if-ltz v5, :cond_2

    if-ltz v6, :cond_2

    if-gez v7, :cond_3

    .line 125
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid character in Base64 string"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 128
    :cond_3
    shl-int/lit8 v0, v4, 0x2

    and-int/lit16 v0, v0, 0xfc

    ushr-int/lit8 v1, v5, 0x4

    and-int/lit8 v1, v1, 0x3

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, p4, p5

    .line 130
    const/4 v0, 0x2

    if-ge v8, v0, :cond_4

    .line 131
    add-int/lit8 v0, p5, 0x1

    shl-int/lit8 v1, v5, 0x4

    and-int/lit16 v1, v1, 0xf0

    ushr-int/lit8 v2, v6, 0x2

    and-int/lit8 v2, v2, 0xf

    or-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p4, v0

    .line 133
    const/4 v0, 0x1

    if-ge v8, v0, :cond_4

    .line 134
    add-int/lit8 v0, p5, 0x2

    shl-int/lit8 v1, v6, 0x6

    and-int/lit16 v1, v1, 0xc0

    and-int/lit8 v2, v7, 0x3f

    or-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p4, v0

    .line 137
    :cond_4
    return-void
.end method

.method public static decoding(Ljava/lang/String;)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 73
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lcom/huawei/hihealthservice/old/util/Base64;->decoding(Ljava/lang/String;II)[B

    move-result-object v0

    return-object v0
.end method

.method public static decoding(Ljava/lang/String;II)[B
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 81
    rem-int/lit8 v0, p2, 0x4

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 82
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Base64 string len is not multiple of 4"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 85
    :cond_0
    div-int/lit8 v0, p2, 0x4

    mul-int/lit8 v7, v0, 0x3

    .line 86
    add-int v0, p1, p2

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x3d

    if-ne v0, v1, :cond_1

    .line 87
    add-int/lit8 v7, v7, -0x1

    .line 88
    add-int v0, p1, p2

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x3d

    if-ne v0, v1, :cond_1

    .line 89
    add-int/lit8 v7, v7, -0x1

    .line 93
    :cond_1
    new-array v8, v7, [B

    .line 94
    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v6, p2, :cond_2

    .line 95
    add-int v0, p1, v6

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    add-int v1, p1, v6

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    add-int v2, p1, v6

    add-int/lit8 v2, v2, 0x2

    .line 96
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    add-int v3, p1, v6

    add-int/lit8 v3, v3, 0x3

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    move-object v4, v8

    move v5, v7

    .line 95
    invoke-static/range {v0 .. v5}, Lcom/huawei/hihealthservice/old/util/Base64;->decodeQuan(CCCC[BI)V

    .line 94
    add-int/lit8 v6, v6, 0x4

    add-int/lit8 v7, v7, 0x3

    goto :goto_0

    .line 100
    :cond_2
    return-object v8
.end method

.method private static encodeQuan([BII[CI)V
    .locals 8

    .line 49
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 51
    aget-byte v5, p0, p1

    .line 52
    sget-object v0, Lcom/huawei/hihealthservice/old/util/Base64;->CHARS:[C

    ushr-int/lit8 v1, v5, 0x2

    and-int/lit8 v1, v1, 0x3f

    aget-char v0, v0, v1

    aput-char v0, p3, p4

    .line 54
    const/4 v0, 0x2

    if-le p2, v0, :cond_0

    .line 55
    add-int/lit8 v0, p1, 0x1

    aget-byte v6, p0, v0

    .line 56
    add-int/lit8 v0, p1, 0x2

    aget-byte v7, p0, v0

    .line 57
    add-int/lit8 v0, p4, 0x1

    sget-object v1, Lcom/huawei/hihealthservice/old/util/Base64;->CHARS:[C

    shl-int/lit8 v2, v5, 0x4

    and-int/lit8 v2, v2, 0x30

    ushr-int/lit8 v3, v6, 0x4

    and-int/lit8 v3, v3, 0xf

    add-int/2addr v2, v3

    aget-char v1, v1, v2

    aput-char v1, p3, v0

    .line 58
    add-int/lit8 v0, p4, 0x2

    sget-object v1, Lcom/huawei/hihealthservice/old/util/Base64;->CHARS:[C

    shl-int/lit8 v2, v6, 0x2

    and-int/lit8 v2, v2, 0x3c

    ushr-int/lit8 v3, v7, 0x6

    and-int/lit8 v3, v3, 0x3

    add-int/2addr v2, v3

    aget-char v1, v1, v2

    aput-char v1, p3, v0

    .line 59
    add-int/lit8 v0, p4, 0x3

    sget-object v1, Lcom/huawei/hihealthservice/old/util/Base64;->CHARS:[C

    and-int/lit8 v2, v7, 0x3f

    aget-char v1, v1, v2

    aput-char v1, p3, v0

    goto :goto_0

    .line 60
    :cond_0
    const/4 v0, 0x1

    if-le p2, v0, :cond_1

    .line 61
    add-int/lit8 v0, p1, 0x1

    aget-byte v6, p0, v0

    .line 62
    add-int/lit8 v0, p4, 0x1

    sget-object v1, Lcom/huawei/hihealthservice/old/util/Base64;->CHARS:[C

    shl-int/lit8 v2, v5, 0x4

    and-int/lit8 v2, v2, 0x30

    ushr-int/lit8 v3, v6, 0x4

    and-int/lit8 v3, v3, 0xf

    add-int/2addr v2, v3

    aget-char v1, v1, v2

    aput-char v1, p3, v0

    .line 63
    add-int/lit8 v0, p4, 0x2

    sget-object v1, Lcom/huawei/hihealthservice/old/util/Base64;->CHARS:[C

    shl-int/lit8 v2, v6, 0x2

    and-int/lit8 v2, v2, 0x3c

    add-int/lit8 v2, v2, 0x0

    aget-char v1, v1, v2

    aput-char v1, p3, v0

    .line 64
    add-int/lit8 v0, p4, 0x3

    const/16 v1, 0x3d

    aput-char v1, p3, v0

    goto :goto_0

    .line 66
    :cond_1
    add-int/lit8 v0, p4, 0x1

    sget-object v1, Lcom/huawei/hihealthservice/old/util/Base64;->CHARS:[C

    shl-int/lit8 v2, v5, 0x4

    and-int/lit8 v2, v2, 0x30

    add-int/lit8 v2, v2, 0x0

    aget-char v1, v1, v2

    aput-char v1, p3, v0

    .line 67
    add-int/lit8 v0, p4, 0x2

    const/16 v1, 0x3d

    aput-char v1, p3, v0

    .line 68
    add-int/lit8 v0, p4, 0x3

    const/16 v1, 0x3d

    aput-char v1, p3, v0

    .line 70
    :goto_0
    return-void
.end method

.method public static encoding([BII)Ljava/lang/String;
    .locals 5

    .line 38
    add-int/lit8 v0, p2, 0x2

    div-int/lit8 v0, v0, 0x3

    mul-int/lit8 v3, v0, 0x4

    .line 39
    new-array v4, v3, [C

    .line 41
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    array-length v0, v4

    if-ge v3, v0, :cond_0

    .line 42
    add-int v0, p1, v2

    sub-int v1, p2, v2

    invoke-static {p0, v0, v1, v4, v3}, Lcom/huawei/hihealthservice/old/util/Base64;->encodeQuan([BII[CI)V

    .line 41
    add-int/lit8 v2, v2, 0x3

    add-int/lit8 v3, v3, 0x4

    goto :goto_0

    .line 45
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method
