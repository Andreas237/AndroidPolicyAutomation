.class public Lnet/toddm/comm/Base64;
.super Ljava/lang/Object;
.source "Base64.java"


# static fields
.field private static final encodingMap:[C


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x40

    .line 29
    new-array v0, v0, [C

    sput-object v0, Lnet/toddm/comm/Base64;->encodingMap:[C

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_2

    :goto_1
    const/16 v0, 0x34

    if-lt v1, v0, :cond_1

    :goto_2
    const/16 v1, 0x3e

    if-lt v0, v1, :cond_0

    .line 34
    sget-object v0, Lnet/toddm/comm/Base64;->encodingMap:[C

    const/16 v2, 0x2b

    aput-char v2, v0, v1

    const/16 v1, 0x3f

    const/16 v2, 0x2f

    .line 35
    aput-char v2, v0, v1

    return-void

    .line 33
    :cond_0
    sget-object v1, Lnet/toddm/comm/Base64;->encodingMap:[C

    add-int/lit8 v2, v0, -0x34

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 32
    :cond_1
    sget-object v0, Lnet/toddm/comm/Base64;->encodingMap:[C

    add-int/lit8 v2, v1, -0x1a

    add-int/lit8 v2, v2, 0x61

    int-to-char v2, v2

    aput-char v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 31
    :cond_2
    sget-object v1, Lnet/toddm/comm/Base64;->encodingMap:[C

    add-int/lit8 v2, v0, 0x41

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static encode([B)Ljava/lang/String;
    .locals 8

    if-eqz p0, :cond_2

    .line 44
    array-length v0, p0

    if-lez v0, :cond_2

    .line 46
    array-length v0, p0

    add-int/lit8 v0, v0, 0x2

    div-int/lit8 v0, v0, 0x3

    mul-int/lit8 v0, v0, 0x4

    new-array v0, v0, [C

    const/4 v1, 0x0

    move v2, v1

    .line 49
    :goto_0
    array-length v3, p0

    if-lt v1, v3, :cond_1

    .line 72
    array-length p0, v0

    if-ne v2, p0, :cond_0

    .line 75
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    return-object p0

    .line 73
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Base64 encoding failed"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 50
    :cond_1
    array-length v3, p0

    sub-int/2addr v3, v1

    const/16 v4, 0x3d

    packed-switch v3, :pswitch_data_0

    add-int/lit8 v3, v2, 0x1

    .line 64
    aget-byte v4, p0, v1

    shr-int/lit8 v4, v4, 0x2

    invoke-static {v4}, Lnet/toddm/comm/Base64;->encodeByteAsChar(I)C

    move-result v4

    aput-char v4, v0, v2

    add-int/lit8 v2, v3, 0x1

    .line 65
    aget-byte v4, p0, v1

    and-int/lit8 v4, v4, 0x3

    shl-int/lit8 v4, v4, 0x4

    add-int/lit8 v5, v1, 0x1

    aget-byte v6, p0, v5

    shr-int/lit8 v6, v6, 0x4

    and-int/lit8 v6, v6, 0xf

    or-int/2addr v4, v6

    invoke-static {v4}, Lnet/toddm/comm/Base64;->encodeByteAsChar(I)C

    move-result v4

    aput-char v4, v0, v3

    add-int/lit8 v3, v2, 0x1

    .line 66
    aget-byte v4, p0, v5

    and-int/lit8 v4, v4, 0xf

    shl-int/lit8 v4, v4, 0x2

    add-int/lit8 v5, v1, 0x2

    aget-byte v6, p0, v5

    shr-int/lit8 v6, v6, 0x6

    and-int/lit8 v6, v6, 0x3

    or-int/2addr v4, v6

    invoke-static {v4}, Lnet/toddm/comm/Base64;->encodeByteAsChar(I)C

    move-result v4

    aput-char v4, v0, v2

    add-int/lit8 v2, v3, 0x1

    .line 67
    aget-byte v4, p0, v5

    and-int/lit8 v4, v4, 0x3f

    invoke-static {v4}, Lnet/toddm/comm/Base64;->encodeByteAsChar(I)C

    move-result v4

    aput-char v4, v0, v3

    goto :goto_1

    :pswitch_0
    add-int/lit8 v3, v2, 0x1

    .line 58
    aget-byte v5, p0, v1

    shr-int/lit8 v5, v5, 0x2

    invoke-static {v5}, Lnet/toddm/comm/Base64;->encodeByteAsChar(I)C

    move-result v5

    aput-char v5, v0, v2

    add-int/lit8 v2, v3, 0x1

    .line 59
    aget-byte v5, p0, v1

    and-int/lit8 v5, v5, 0x3

    shl-int/lit8 v5, v5, 0x4

    add-int/lit8 v6, v1, 0x1

    aget-byte v7, p0, v6

    shr-int/lit8 v7, v7, 0x4

    and-int/lit8 v7, v7, 0xf

    or-int/2addr v5, v7

    invoke-static {v5}, Lnet/toddm/comm/Base64;->encodeByteAsChar(I)C

    move-result v5

    aput-char v5, v0, v3

    add-int/lit8 v3, v2, 0x1

    .line 60
    aget-byte v5, p0, v6

    and-int/lit8 v5, v5, 0xf

    shl-int/lit8 v5, v5, 0x2

    invoke-static {v5}, Lnet/toddm/comm/Base64;->encodeByteAsChar(I)C

    move-result v5

    aput-char v5, v0, v2

    add-int/lit8 v2, v3, 0x1

    .line 61
    aput-char v4, v0, v3

    goto :goto_1

    :pswitch_1
    add-int/lit8 v3, v2, 0x1

    .line 52
    aget-byte v5, p0, v1

    shr-int/lit8 v5, v5, 0x2

    invoke-static {v5}, Lnet/toddm/comm/Base64;->encodeByteAsChar(I)C

    move-result v5

    aput-char v5, v0, v2

    add-int/lit8 v2, v3, 0x1

    .line 53
    aget-byte v5, p0, v1

    and-int/lit8 v5, v5, 0x3

    shl-int/lit8 v5, v5, 0x4

    invoke-static {v5}, Lnet/toddm/comm/Base64;->encodeByteAsChar(I)C

    move-result v5

    aput-char v5, v0, v3

    add-int/lit8 v3, v2, 0x1

    .line 54
    aput-char v4, v0, v2

    add-int/lit8 v2, v3, 0x1

    .line 55
    aput-char v4, v0, v3

    :goto_1
    add-int/lit8 v1, v1, 0x3

    goto/16 :goto_0

    .line 44
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'input\' can not be NULL or empty"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static encodeByteAsChar(I)C
    .locals 1

    .line 39
    sget-object v0, Lnet/toddm/comm/Base64;->encodingMap:[C

    and-int/lit8 p0, p0, 0x3f

    aget-char p0, v0, p0

    return p0
.end method
