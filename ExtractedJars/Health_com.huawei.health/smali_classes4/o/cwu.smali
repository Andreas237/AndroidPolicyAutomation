.class public final Lo/cwu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:[C

.field private static final d:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 8
    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lo/cwu;->c:[C

    .line 15
    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_1

    sput-object v0, Lo/cwu;->d:[C

    return-void

    nop

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
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data

    :array_1
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
    .end array-data
.end method

.method public static a([BZ)Ljava/lang/String;
    .locals 2

    .line 75
    new-instance v0, Ljava/lang/String;

    invoke-static {p0, p1}, Lo/cwu;->e([BZ)[C

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method private static b([B[C)[C
    .locals 7

    .line 56
    array-length v3, p0

    .line 57
    shl-int/lit8 v0, v3, 0x1

    new-array v4, v0, [C

    .line 59
    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v5, v3, :cond_0

    .line 60
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    aget-byte v1, p0, v5

    and-int/lit16 v1, v1, 0xf0

    ushr-int/lit8 v1, v1, 0x4

    aget-char v1, p1, v1

    aput-char v1, v4, v0

    .line 61
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    aget-byte v1, p0, v5

    and-int/lit8 v1, v1, 0xf

    aget-char v1, p1, v1

    aput-char v1, v4, v0

    .line 59
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 63
    :cond_0
    return-object v4
.end method

.method public static e([BZ)[C
    .locals 1

    .line 45
    if-eqz p1, :cond_0

    sget-object v0, Lo/cwu;->d:[C

    goto :goto_0

    :cond_0
    sget-object v0, Lo/cwu;->c:[C

    :goto_0
    invoke-static {p0, v0}, Lo/cwu;->b([B[C)[C

    move-result-object v0

    return-object v0
.end method
