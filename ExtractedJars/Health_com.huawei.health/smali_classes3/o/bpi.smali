.class Lo/bpi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[I

.field private static final b:[I

.field private static final c:[I

.field private static final d:[I

.field private static final e:[I

.field private static final h:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/bpi;->e:[I

    .line 30
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lo/bpi;->b:[I

    .line 40
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    sput-object v0, Lo/bpi;->c:[I

    .line 48
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_3

    sput-object v0, Lo/bpi;->d:[I

    .line 56
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_4

    sput-object v0, Lo/bpi;->a:[I

    .line 65
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_5

    sput-object v0, Lo/bpi;->h:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x3e9
        0x3eb
        0x3f9
        0x3fe
        0x401
    .end array-data

    :array_1
    .array-data 4
        0x3e9
        0x3ed
        0x3ee
        0x927c01
    .end array-data

    :array_2
    .array-data 4
        0x3e9
        0x3ed
    .end array-data

    :array_3
    .array-data 4
        0x3e9
        0x3ea
    .end array-data

    :array_4
    .array-data 4
        0x191
        0x193
        0x194
    .end array-data

    :array_5
    .array-data 4
        0x1
        0x2717
    .end array-data
.end method

.method constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(I)Z
    .locals 1

    .line 100
    sget-object v0, Lo/bpi;->c:[I

    invoke-static {v0, p0}, Lo/bpi;->a([II)Z

    move-result v0

    return v0
.end method

.method private static a([II)Z
    .locals 6

    .line 145
    const/4 v1, 0x0

    .line 147
    const v0, 0x14ffe

    if-ne p1, v0, :cond_0

    .line 150
    const/4 v1, 0x1

    goto :goto_1

    .line 154
    :cond_0
    move-object v2, p0

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget v5, v2, v4

    .line 156
    if-ne v5, p1, :cond_1

    .line 158
    const/4 v1, 0x1

    .line 159
    goto :goto_1

    .line 154
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 163
    :cond_2
    :goto_1
    return v1
.end method

.method static b(I)Z
    .locals 1

    .line 89
    sget-object v0, Lo/bpi;->b:[I

    invoke-static {v0, p0}, Lo/bpi;->a([II)Z

    move-result v0

    return v0
.end method

.method static c(I)Z
    .locals 1

    .line 122
    sget-object v0, Lo/bpi;->a:[I

    invoke-static {v0, p0}, Lo/bpi;->a([II)Z

    move-result v0

    return v0
.end method

.method static d(I)Z
    .locals 1

    .line 111
    sget-object v0, Lo/bpi;->d:[I

    invoke-static {v0, p0}, Lo/bpi;->a([II)Z

    move-result v0

    return v0
.end method

.method static e(I)Z
    .locals 1

    .line 78
    sget-object v0, Lo/bpi;->e:[I

    invoke-static {v0, p0}, Lo/bpi;->a([II)Z

    move-result v0

    return v0
.end method

.method static h(I)Z
    .locals 1

    .line 133
    sget-object v0, Lo/bpi;->h:[I

    invoke-static {v0, p0}, Lo/bpi;->a([II)Z

    move-result v0

    return v0
.end method
