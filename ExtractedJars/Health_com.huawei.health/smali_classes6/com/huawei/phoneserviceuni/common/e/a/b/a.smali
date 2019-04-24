.class public Lcom/huawei/phoneserviceuni/common/e/a/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 7
    const/16 v0, 0x41

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/e/a/b/a;->a:[C

    return-void

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
        0x24s
        0x3ds
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)Ljava/lang/String;
    .locals 10

    .line 13
    array-length v3, p0

    .line 14
    const/4 v4, 0x3

    new-array v4, v4, [B

    fill-array-data v4, :array_0

    .line 15
    const/4 v5, 0x4

    new-array v5, v5, [B

    fill-array-data v5, :array_1

    .line 16
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, 0x0

    .line 21
    :cond_0
    :goto_0
    if-lez v3, :cond_2

    .line 22
    add-int/lit8 v3, v3, -0x1

    .line 23
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    move v1, v9

    add-int/lit8 v9, v9, 0x1

    aget-byte v1, p0, v1

    aput-byte v1, v4, v0

    .line 24
    const/4 v0, 0x3

    if-ne v7, v0, :cond_0

    .line 25
    const/4 v0, 0x0

    aget-byte v0, v4, v0

    and-int/lit16 v0, v0, 0xfc

    shr-int/lit8 v0, v0, 0x2

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v5, v1

    .line 28
    const/4 v0, 0x0

    aget-byte v0, v4, v0

    and-int/lit8 v0, v0, 0x3

    shl-int/lit8 v0, v0, 0x4

    const/4 v1, 0x1

    aget-byte v1, v4, v1

    and-int/lit16 v1, v1, 0xf0

    shr-int/lit8 v1, v1, 0x4

    add-int/2addr v0, v1

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput-byte v0, v5, v1

    .line 29
    const/4 v0, 0x1

    aget-byte v0, v4, v0

    and-int/lit8 v0, v0, 0xf

    shl-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    aget-byte v1, v4, v1

    and-int/lit16 v1, v1, 0xc0

    shr-int/lit8 v1, v1, 0x6

    add-int/2addr v0, v1

    int-to-byte v0, v0

    const/4 v1, 0x2

    aput-byte v0, v5, v1

    .line 30
    const/4 v0, 0x2

    aget-byte v0, v4, v0

    and-int/lit8 v0, v0, 0x3f

    int-to-byte v0, v0

    const/4 v1, 0x3

    aput-byte v0, v5, v1

    .line 31
    const/4 v7, 0x0

    :goto_1
    const/4 v0, 0x4

    if-ge v7, v0, :cond_1

    .line 32
    sget-object v0, Lcom/huawei/phoneserviceuni/common/e/a/b/a;->a:[C

    aget-byte v1, v5, v7

    aget-char v0, v0, v1

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 34
    :cond_1
    const/4 v7, 0x0

    goto :goto_0

    .line 39
    :cond_2
    if-lez v7, :cond_5

    .line 40
    move v8, v7

    :goto_2
    const/4 v0, 0x3

    if-ge v8, v0, :cond_3

    .line 41
    const/4 v0, 0x0

    aput-byte v0, v4, v8

    .line 40
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 43
    :cond_3
    const/4 v0, 0x0

    aget-byte v0, v4, v0

    and-int/lit16 v0, v0, 0xfc

    shr-int/lit8 v0, v0, 0x2

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v5, v1

    .line 44
    const/4 v0, 0x0

    aget-byte v0, v4, v0

    and-int/lit8 v0, v0, 0x3

    shl-int/lit8 v0, v0, 0x4

    const/4 v1, 0x1

    aget-byte v1, v4, v1

    and-int/lit16 v1, v1, 0xf0

    shr-int/lit8 v1, v1, 0x4

    add-int/2addr v0, v1

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput-byte v0, v5, v1

    .line 45
    const/4 v0, 0x1

    aget-byte v0, v4, v0

    and-int/lit8 v0, v0, 0xf

    shl-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    aget-byte v1, v4, v1

    and-int/lit16 v1, v1, 0xc0

    shr-int/lit8 v1, v1, 0x6

    add-int/2addr v0, v1

    int-to-byte v0, v0

    const/4 v1, 0x2

    aput-byte v0, v5, v1

    .line 46
    const/4 v0, 0x2

    aget-byte v0, v4, v0

    and-int/lit8 v0, v0, 0x3f

    int-to-byte v0, v0

    const/4 v1, 0x3

    aput-byte v0, v5, v1

    .line 48
    const/4 v8, 0x0

    :goto_3
    add-int/lit8 v0, v7, 0x1

    if-ge v8, v0, :cond_4

    .line 49
    sget-object v0, Lcom/huawei/phoneserviceuni/common/e/a/b/a;->a:[C

    aget-byte v1, v5, v8

    aget-char v0, v0, v1

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 51
    :cond_4
    :goto_4
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    const/4 v1, 0x3

    if-ge v0, v1, :cond_5

    .line 53
    const/16 v0, 0x3d

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_4

    .line 56
    :cond_5
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_1
    .array-data 1
        0x3dt
        0x3dt
        0x3dt
        0x3dt
    .end array-data
.end method

.method public static a(C)Z
    .locals 3

    .line 110
    const/4 v1, 0x0

    .line 111
    const/4 v2, 0x0

    :goto_0
    const/16 v0, 0x40

    if-ge v2, v0, :cond_1

    .line 112
    sget-object v0, Lcom/huawei/phoneserviceuni/common/e/a/b/a;->a:[C

    aget-char v0, v0, v2

    if-ne p0, v0, :cond_0

    .line 113
    const/4 v1, 0x1

    .line 114
    goto :goto_1

    .line 111
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 117
    :cond_1
    :goto_1
    return v1
.end method

.method public static b(C)B
    .locals 3

    .line 121
    const/16 v1, 0x40

    .line 122
    const/4 v2, 0x0

    :goto_0
    const/16 v0, 0x40

    if-ge v2, v0, :cond_1

    .line 123
    sget-object v0, Lcom/huawei/phoneserviceuni/common/e/a/b/a;->a:[C

    aget-char v0, v0, v2

    if-ne p0, v0, :cond_0

    .line 124
    int-to-byte v1, v2

    .line 125
    goto :goto_1

    .line 122
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 128
    :cond_1
    :goto_1
    return v1
.end method

.method public static b([B)[B
    .locals 11

    .line 60
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 61
    array-length v6, p0

    .line 62
    const/4 v0, 0x4

    new-array v7, v0, [B

    .line 63
    const/4 v0, 0x3

    new-array v8, v0, [B

    .line 65
    new-array v0, v6, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v9

    .line 68
    :cond_0
    :goto_0
    if-lez v6, :cond_3

    aget-byte v0, p0, v5

    int-to-char v0, v0

    const/16 v1, 0x3d

    if-eq v0, v1, :cond_3

    aget-byte v0, p0, v5

    int-to-char v0, v0

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/a/b/a;->a(C)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 69
    add-int/lit8 v6, v6, -0x1

    .line 70
    move v0, v3

    add-int/lit8 v3, v3, 0x1

    move v1, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v1, p0, v1

    aput-byte v1, v7, v0

    .line 71
    const/4 v0, 0x4

    if-ne v3, v0, :cond_0

    .line 72
    const/4 v3, 0x0

    :goto_1
    const/4 v0, 0x4

    if-ge v3, v0, :cond_1

    .line 73
    aget-byte v0, v7, v3

    int-to-char v0, v0

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/a/b/a;->b(C)B

    move-result v0

    aput-byte v0, v7, v3

    .line 72
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 75
    :cond_1
    const/4 v0, 0x0

    aget-byte v0, v7, v0

    shl-int/lit8 v0, v0, 0x2

    const/4 v1, 0x1

    aget-byte v1, v7, v1

    and-int/lit8 v1, v1, 0x30

    shr-int/lit8 v1, v1, 0x4

    add-int/2addr v0, v1

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v8, v1

    .line 76
    const/4 v0, 0x1

    aget-byte v0, v7, v0

    and-int/lit8 v0, v0, 0xf

    shl-int/lit8 v0, v0, 0x4

    const/4 v1, 0x2

    aget-byte v1, v7, v1

    and-int/lit8 v1, v1, 0x3c

    shr-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput-byte v0, v8, v1

    .line 77
    const/4 v0, 0x2

    aget-byte v0, v7, v0

    and-int/lit8 v0, v0, 0x3

    shl-int/lit8 v0, v0, 0x6

    const/4 v1, 0x3

    aget-byte v1, v7, v1

    add-int/2addr v0, v1

    int-to-byte v0, v0

    const/4 v1, 0x2

    aput-byte v0, v8, v1

    .line 79
    const/4 v3, 0x0

    :goto_2
    const/4 v0, 0x3

    if-ge v3, v0, :cond_2

    .line 80
    aget-byte v0, v8, v3

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 79
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 82
    :cond_2
    const/4 v3, 0x0

    goto/16 :goto_0

    .line 87
    :cond_3
    if-lez v3, :cond_6

    .line 88
    move v4, v3

    :goto_3
    const/4 v0, 0x4

    if-ge v4, v0, :cond_4

    .line 89
    const/4 v0, 0x0

    aput-byte v0, v7, v4

    .line 88
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 91
    :cond_4
    const/4 v4, 0x0

    :goto_4
    const/4 v0, 0x4

    if-ge v4, v0, :cond_5

    .line 92
    aget-byte v0, v7, v4

    int-to-char v0, v0

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/a/b/a;->b(C)B

    move-result v0

    aput-byte v0, v7, v4

    .line 91
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 94
    :cond_5
    const/4 v0, 0x0

    aget-byte v0, v7, v0

    shl-int/lit8 v0, v0, 0x2

    const/4 v1, 0x1

    aget-byte v1, v7, v1

    and-int/lit8 v1, v1, 0x30

    shr-int/lit8 v1, v1, 0x4

    add-int/2addr v0, v1

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v8, v1

    .line 95
    const/4 v0, 0x1

    aget-byte v0, v7, v0

    and-int/lit8 v0, v0, 0xf

    shl-int/lit8 v0, v0, 0x4

    const/4 v1, 0x2

    aget-byte v1, v7, v1

    and-int/lit8 v1, v1, 0x3c

    shr-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput-byte v0, v8, v1

    .line 96
    const/4 v0, 0x2

    aget-byte v0, v7, v0

    and-int/lit8 v0, v0, 0x3

    shl-int/lit8 v0, v0, 0x6

    const/4 v1, 0x3

    aget-byte v1, v7, v1

    add-int/2addr v0, v1

    int-to-byte v0, v0

    const/4 v1, 0x2

    aput-byte v0, v8, v1

    .line 98
    const/4 v4, 0x0

    :goto_5
    add-int/lit8 v0, v3, -0x1

    if-ge v4, v0, :cond_6

    .line 99
    aget-byte v0, v8, v4

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 98
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 102
    :cond_6
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 104
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    new-array v10, v0, [B

    .line 105
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v9, v10, v1, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 106
    return-object v10
.end method
