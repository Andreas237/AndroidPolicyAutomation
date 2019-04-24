.class final Lo/tw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:[[F


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 27
    sget-object v0, Lo/to;->e:[I

    array-length v0, v0

    const/16 v1, 0x8

    filled-new-array {v0, v1}, [I

    move-result-object v1

    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v2, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[F

    sput-object v0, Lo/tw;->e:[[F

    .line 32
    const/4 v4, 0x0

    :goto_0
    sget-object v0, Lo/to;->e:[I

    array-length v0, v0

    if-ge v4, v0, :cond_2

    .line 33
    sget-object v0, Lo/to;->e:[I

    aget v5, v0, v4

    .line 34
    and-int/lit8 v6, v5, 0x1

    .line 35
    const/4 v7, 0x0

    :goto_1
    const/16 v0, 0x8

    if-ge v7, v0, :cond_1

    .line 36
    const/4 v8, 0x0

    .line 37
    :goto_2
    and-int/lit8 v0, v5, 0x1

    if-ne v0, v6, :cond_0

    .line 38
    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr v8, v0

    .line 39
    shr-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 41
    :cond_0
    and-int/lit8 v6, v5, 0x1

    .line 42
    sget-object v0, Lo/tw;->e:[[F

    aget-object v0, v0, v4

    rsub-int/lit8 v1, v7, 0x8

    add-int/lit8 v1, v1, -0x1

    const/high16 v2, 0x41880000    # 17.0f

    div-float v2, v8, v2

    aput v2, v0, v1

    .line 35
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 32
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 45
    :cond_2
    return-void
.end method

.method private static a([I)I
    .locals 8

    .line 82
    const-wide/16 v4, 0x0

    .line 83
    const/4 v6, 0x0

    :goto_0
    array-length v0, p0

    if-ge v6, v0, :cond_2

    .line 84
    const/4 v7, 0x0

    :goto_1
    aget v0, p0, v6

    if-ge v7, v0, :cond_1

    .line 85
    const/4 v0, 0x1

    shl-long v0, v4, v0

    rem-int/lit8 v2, v6, 0x2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_2

    :cond_0
    const/4 v2, 0x0

    :goto_2
    int-to-long v2, v2

    or-long v4, v0, v2

    .line 84
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 83
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 88
    :cond_2
    long-to-int v0, v4

    return v0
.end method

.method private static b([I)I
    .locals 11

    .line 92
    invoke-static {p0}, Lo/to;->c([I)I

    move-result v2

    .line 93
    const/16 v0, 0x8

    new-array v3, v0, [F

    .line 94
    const/4 v4, 0x0

    :goto_0
    array-length v0, v3

    const/16 v0, 0x8

    if-ge v4, v0, :cond_0

    .line 95
    aget v0, p0, v4

    int-to-float v0, v0

    int-to-float v1, v2

    div-float/2addr v0, v1

    aput v0, v3, v4

    .line 94
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 97
    :cond_0
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 98
    const/4 v5, -0x1

    .line 99
    const/4 v6, 0x0

    :goto_1
    sget-object v0, Lo/tw;->e:[[F

    array-length v0, v0

    if-ge v6, v0, :cond_4

    .line 100
    const/4 v7, 0x0

    .line 101
    sget-object v0, Lo/tw;->e:[[F

    aget-object v8, v0, v6

    .line 102
    const/4 v9, 0x0

    :goto_2
    const/16 v0, 0x8

    if-ge v9, v0, :cond_2

    .line 103
    aget v0, v8, v9

    aget v1, v3, v9

    sub-float v10, v0, v1

    .line 104
    mul-float v0, v10, v10

    add-float/2addr v7, v0

    .line 105
    cmpl-float v0, v7, v4

    if-ltz v0, :cond_1

    .line 106
    goto :goto_3

    .line 102
    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 109
    :cond_2
    :goto_3
    cmpg-float v0, v7, v4

    if-gez v0, :cond_3

    .line 110
    move v4, v7

    .line 111
    sget-object v0, Lo/to;->e:[I

    aget v5, v0, v6

    .line 99
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 114
    :cond_4
    return v5
.end method

.method static c([I)I
    .locals 2

    .line 51
    invoke-static {p0}, Lo/tw;->d([I)[I

    move-result-object v0

    invoke-static {v0}, Lo/tw;->e([I)I

    move-result v1

    .line 52
    const/4 v0, -0x1

    if-eq v1, v0, :cond_0

    .line 53
    return v1

    .line 55
    :cond_0
    invoke-static {p0}, Lo/tw;->b([I)I

    move-result v0

    return v0
.end method

.method private static d([I)[I
    .locals 9

    .line 59
    invoke-static {p0}, Lo/to;->c([I)I

    move-result v0

    int-to-float v3, v0

    .line 60
    const/16 v0, 0x8

    new-array v4, v0, [I

    .line 61
    const/4 v5, 0x0

    .line 62
    const/4 v6, 0x0

    .line 63
    const/4 v7, 0x0

    :goto_0
    const/16 v0, 0x11

    if-ge v7, v0, :cond_1

    .line 64
    const/high16 v0, 0x42080000    # 34.0f

    div-float v0, v3, v0

    int-to-float v1, v7

    mul-float/2addr v1, v3

    const/high16 v2, 0x41880000    # 17.0f

    div-float/2addr v1, v2

    add-float v8, v0, v1

    .line 67
    aget v0, p0, v5

    add-int/2addr v0, v6

    int-to-float v0, v0

    cmpg-float v0, v0, v8

    if-gtz v0, :cond_0

    .line 68
    aget v0, p0, v5

    add-int/2addr v6, v0

    .line 69
    add-int/lit8 v5, v5, 0x1

    .line 71
    :cond_0
    aget v0, v4, v5

    add-int/lit8 v0, v0, 0x1

    aput v0, v4, v5

    .line 63
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 73
    :cond_1
    return-object v4
.end method

.method private static e([I)I
    .locals 3

    .line 77
    invoke-static {p0}, Lo/tw;->a([I)I

    move-result v2

    .line 78
    invoke-static {v2}, Lo/to;->e(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    return v0
.end method
