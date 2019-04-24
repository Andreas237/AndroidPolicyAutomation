.class public final Lcom/sina/weibo/sdk/utils/Base64;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static alphabet:[C

.field private static codes:[B


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 3
    const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="

    .line 4
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/utils/Base64;->alphabet:[C

    .line 6
    const/16 v0, 0x100

    new-array v0, v0, [B

    sput-object v0, Lcom/sina/weibo/sdk/utils/Base64;->codes:[B

    .line 9
    const/4 v3, 0x0

    :goto_0
    const/16 v0, 0x100

    if-ge v3, v0, :cond_0

    .line 10
    sget-object v0, Lcom/sina/weibo/sdk/utils/Base64;->codes:[B

    const/4 v1, -0x1

    aput-byte v1, v0, v3

    .line 9
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 12
    :cond_0
    const/16 v3, 0x41

    :goto_1
    const/16 v0, 0x5a

    if-gt v3, v0, :cond_1

    .line 13
    sget-object v0, Lcom/sina/weibo/sdk/utils/Base64;->codes:[B

    add-int/lit8 v1, v3, -0x41

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    .line 12
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 15
    :cond_1
    const/16 v3, 0x61

    :goto_2
    const/16 v0, 0x7a

    if-gt v3, v0, :cond_2

    .line 16
    sget-object v0, Lcom/sina/weibo/sdk/utils/Base64;->codes:[B

    add-int/lit8 v1, v3, 0x1a

    add-int/lit8 v1, v1, -0x61

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    .line 15
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 18
    :cond_2
    const/16 v3, 0x30

    :goto_3
    const/16 v0, 0x39

    if-gt v3, v0, :cond_3

    .line 19
    sget-object v0, Lcom/sina/weibo/sdk/utils/Base64;->codes:[B

    add-int/lit8 v1, v3, 0x34

    add-int/lit8 v1, v1, -0x30

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    .line 18
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 21
    :cond_3
    sget-object v0, Lcom/sina/weibo/sdk/utils/Base64;->codes:[B

    const/16 v1, 0x3e

    const/16 v2, 0x2b

    aput-byte v1, v0, v2

    .line 22
    sget-object v0, Lcom/sina/weibo/sdk/utils/Base64;->codes:[B

    const/16 v1, 0x3f

    const/16 v2, 0x2f

    aput-byte v1, v0, v2

    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static decode([B)[B
    .locals 10

    .line 29
    array-length v0, p0

    add-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x4

    mul-int/lit8 v3, v0, 0x3

    .line 30
    array-length v0, p0

    if-lez v0, :cond_0

    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    aget-byte v0, p0, v0

    const/16 v1, 0x3d

    if-ne v0, v1, :cond_0

    .line 31
    add-int/lit8 v3, v3, -0x1

    .line 33
    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    array-length v0, p0

    add-int/lit8 v0, v0, -0x2

    aget-byte v0, p0, v0

    const/16 v1, 0x3d

    if-ne v0, v1, :cond_1

    .line 34
    add-int/lit8 v3, v3, -0x1

    .line 36
    :cond_1
    new-array v4, v3, [B

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    :goto_0
    array-length v0, p0

    if-ge v8, v0, :cond_3

    .line 41
    sget-object v0, Lcom/sina/weibo/sdk/utils/Base64;->codes:[B

    aget-byte v1, p0, v8

    and-int/lit16 v1, v1, 0xff

    aget-byte v9, v0, v1

    .line 42
    if-ltz v9, :cond_2

    .line 43
    shl-int/lit8 v6, v6, 0x6

    .line 44
    add-int/lit8 v5, v5, 0x6

    .line 45
    or-int/2addr v6, v9

    .line 46
    const/16 v0, 0x8

    if-lt v5, v0, :cond_2

    .line 47
    add-int/lit8 v5, v5, -0x8

    .line 48
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    shr-int v1, v6, v5

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v4, v0

    .line 40
    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 52
    :cond_3
    array-length v0, v4

    if-eq v7, v0, :cond_4

    .line 53
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "miscalculated data length!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 55
    :cond_4
    return-object v4
.end method

.method public static encode([B)[C
    .locals 9

    .line 62
    array-length v0, p0

    add-int/lit8 v0, v0, 0x2

    div-int/lit8 v0, v0, 0x3

    mul-int/lit8 v0, v0, 0x4

    new-array v3, v0, [C

    .line 64
    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    array-length v0, p0

    if-ge v4, v0, :cond_4

    .line 65
    const/4 v6, 0x0

    .line 66
    const/4 v7, 0x0

    .line 67
    aget-byte v0, p0, v4

    and-int/lit16 v8, v0, 0xff

    .line 68
    shl-int/lit8 v8, v8, 0x8

    .line 69
    add-int/lit8 v0, v4, 0x1

    array-length v1, p0

    if-ge v0, v1, :cond_0

    .line 70
    add-int/lit8 v0, v4, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v8, v0

    .line 71
    const/4 v7, 0x1

    .line 73
    :cond_0
    shl-int/lit8 v8, v8, 0x8

    .line 74
    add-int/lit8 v0, v4, 0x2

    array-length v1, p0

    if-ge v0, v1, :cond_1

    .line 75
    add-int/lit8 v0, v4, 0x2

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v8, v0

    .line 76
    const/4 v6, 0x1

    .line 78
    :cond_1
    add-int/lit8 v0, v5, 0x3

    sget-object v1, Lcom/sina/weibo/sdk/utils/Base64;->alphabet:[C

    if-eqz v6, :cond_2

    and-int/lit8 v2, v8, 0x3f

    goto :goto_1

    :cond_2
    const/16 v2, 0x40

    :goto_1
    aget-char v1, v1, v2

    aput-char v1, v3, v0

    .line 79
    shr-int/lit8 v8, v8, 0x6

    .line 80
    add-int/lit8 v0, v5, 0x2

    sget-object v1, Lcom/sina/weibo/sdk/utils/Base64;->alphabet:[C

    if-eqz v7, :cond_3

    and-int/lit8 v2, v8, 0x3f

    goto :goto_2

    :cond_3
    const/16 v2, 0x40

    :goto_2
    aget-char v1, v1, v2

    aput-char v1, v3, v0

    .line 81
    shr-int/lit8 v8, v8, 0x6

    .line 82
    add-int/lit8 v0, v5, 0x1

    sget-object v1, Lcom/sina/weibo/sdk/utils/Base64;->alphabet:[C

    and-int/lit8 v2, v8, 0x3f

    aget-char v1, v1, v2

    aput-char v1, v3, v0

    .line 83
    shr-int/lit8 v8, v8, 0x6

    .line 84
    add-int/lit8 v0, v5, 0x0

    sget-object v1, Lcom/sina/weibo/sdk/utils/Base64;->alphabet:[C

    and-int/lit8 v2, v8, 0x3f

    aget-char v1, v1, v2

    aput-char v1, v3, v0

    .line 64
    add-int/lit8 v4, v4, 0x3

    add-int/lit8 v5, v5, 0x4

    goto/16 :goto_0

    .line 86
    :cond_4
    return-object v3
.end method

.method public static encodebyte([B)[B
    .locals 9

    .line 93
    array-length v0, p0

    add-int/lit8 v0, v0, 0x2

    div-int/lit8 v0, v0, 0x3

    mul-int/lit8 v0, v0, 0x4

    new-array v3, v0, [B

    .line 95
    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    array-length v0, p0

    if-ge v4, v0, :cond_4

    .line 96
    const/4 v6, 0x0

    .line 97
    const/4 v7, 0x0

    .line 98
    aget-byte v0, p0, v4

    and-int/lit16 v8, v0, 0xff

    .line 99
    shl-int/lit8 v8, v8, 0x8

    .line 100
    add-int/lit8 v0, v4, 0x1

    array-length v1, p0

    if-ge v0, v1, :cond_0

    .line 101
    add-int/lit8 v0, v4, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v8, v0

    .line 102
    const/4 v7, 0x1

    .line 104
    :cond_0
    shl-int/lit8 v8, v8, 0x8

    .line 105
    add-int/lit8 v0, v4, 0x2

    array-length v1, p0

    if-ge v0, v1, :cond_1

    .line 106
    add-int/lit8 v0, v4, 0x2

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v8, v0

    .line 107
    const/4 v6, 0x1

    .line 109
    :cond_1
    add-int/lit8 v0, v5, 0x3

    sget-object v1, Lcom/sina/weibo/sdk/utils/Base64;->alphabet:[C

    if-eqz v6, :cond_2

    and-int/lit8 v2, v8, 0x3f

    goto :goto_1

    :cond_2
    const/16 v2, 0x40

    :goto_1
    aget-char v1, v1, v2

    int-to-byte v1, v1

    aput-byte v1, v3, v0

    .line 110
    shr-int/lit8 v8, v8, 0x6

    .line 111
    add-int/lit8 v0, v5, 0x2

    sget-object v1, Lcom/sina/weibo/sdk/utils/Base64;->alphabet:[C

    if-eqz v7, :cond_3

    and-int/lit8 v2, v8, 0x3f

    goto :goto_2

    :cond_3
    const/16 v2, 0x40

    :goto_2
    aget-char v1, v1, v2

    int-to-byte v1, v1

    aput-byte v1, v3, v0

    .line 112
    shr-int/lit8 v8, v8, 0x6

    .line 113
    add-int/lit8 v0, v5, 0x1

    sget-object v1, Lcom/sina/weibo/sdk/utils/Base64;->alphabet:[C

    and-int/lit8 v2, v8, 0x3f

    aget-char v1, v1, v2

    int-to-byte v1, v1

    aput-byte v1, v3, v0

    .line 114
    shr-int/lit8 v8, v8, 0x6

    .line 115
    add-int/lit8 v0, v5, 0x0

    sget-object v1, Lcom/sina/weibo/sdk/utils/Base64;->alphabet:[C

    and-int/lit8 v2, v8, 0x3f

    aget-char v1, v1, v2

    int-to-byte v1, v1

    aput-byte v1, v3, v0

    .line 95
    add-int/lit8 v4, v4, 0x3

    add-int/lit8 v5, v5, 0x4

    goto/16 :goto_0

    .line 117
    :cond_4
    return-object v3
.end method
