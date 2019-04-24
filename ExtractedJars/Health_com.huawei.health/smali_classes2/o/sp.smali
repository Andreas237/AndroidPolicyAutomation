.class public final Lo/sp;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a([IIZ)I
    .locals 12

    .line 67
    array-length v3, p0

    .line 68
    const/4 v4, 0x0

    .line 69
    move-object v5, p0

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_0

    aget v8, v5, v7

    .line 70
    add-int/2addr v4, v8

    .line 69
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 72
    :cond_0
    const/4 v5, 0x0

    .line 73
    const/4 v6, 0x0

    .line 74
    const/4 v7, 0x0

    :goto_1
    add-int/lit8 v0, v3, -0x1

    if-ge v7, v0, :cond_6

    .line 76
    const/4 v8, 0x1

    const/4 v0, 0x1

    shl-int/2addr v0, v7

    or-int/2addr v6, v0

    .line 77
    :goto_2
    aget v0, p0, v7

    if-ge v8, v0, :cond_5

    .line 79
    sub-int v0, v4, v8

    add-int/lit8 v0, v0, -0x1

    sub-int v1, v3, v7

    add-int/lit8 v1, v1, -0x2

    invoke-static {v0, v1}, Lo/sp;->e(II)I

    move-result v9

    .line 80
    if-eqz p2, :cond_1

    if-nez v6, :cond_1

    sub-int v0, v4, v8

    sub-int v1, v3, v7

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v0, v1

    sub-int v1, v3, v7

    add-int/lit8 v1, v1, -0x1

    if-lt v0, v1, :cond_1

    .line 82
    sub-int v0, v4, v8

    sub-int v1, v3, v7

    sub-int/2addr v0, v1

    sub-int v1, v3, v7

    add-int/lit8 v1, v1, -0x2

    invoke-static {v0, v1}, Lo/sp;->e(II)I

    move-result v0

    sub-int/2addr v9, v0

    .line 85
    :cond_1
    sub-int v0, v3, v7

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x1

    if-le v0, v1, :cond_3

    .line 86
    const/4 v10, 0x0

    .line 87
    sub-int v0, v4, v8

    sub-int v1, v3, v7

    add-int/lit8 v1, v1, -0x2

    sub-int v11, v0, v1

    .line 88
    :goto_3
    if-le v11, p1, :cond_2

    .line 89
    sub-int v0, v4, v8

    sub-int/2addr v0, v11

    add-int/lit8 v0, v0, -0x1

    sub-int v1, v3, v7

    add-int/lit8 v1, v1, -0x3

    invoke-static {v0, v1}, Lo/sp;->e(II)I

    move-result v0

    add-int/2addr v10, v0

    .line 88
    add-int/lit8 v11, v11, -0x1

    goto :goto_3

    .line 92
    :cond_2
    add-int/lit8 v0, v3, -0x1

    sub-int/2addr v0, v7

    mul-int/2addr v0, v10

    sub-int/2addr v9, v0

    .line 93
    goto :goto_4

    :cond_3
    sub-int v0, v4, v8

    if-le v0, p1, :cond_4

    .line 94
    add-int/lit8 v9, v9, -0x1

    .line 96
    :cond_4
    :goto_4
    add-int/2addr v5, v9

    .line 78
    add-int/lit8 v8, v8, 0x1

    const/4 v0, 0x1

    shl-int/2addr v0, v7

    xor-int/lit8 v0, v0, -0x1

    and-int/2addr v6, v0

    goto/16 :goto_2

    .line 98
    :cond_5
    sub-int/2addr v4, v8

    .line 74
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_1

    .line 100
    :cond_6
    return v5
.end method

.method private static e(II)I
    .locals 6

    .line 106
    sub-int v0, p0, p1

    if-le v0, p1, :cond_0

    .line 107
    move v2, p1

    .line 108
    sub-int v1, p0, p1

    goto :goto_0

    .line 110
    :cond_0
    sub-int v2, p0, p1

    .line 111
    move v1, p1

    .line 113
    :goto_0
    const/4 v3, 0x1

    .line 114
    const/4 v4, 0x1

    .line 115
    move v5, p0

    :goto_1
    if-le v5, v1, :cond_2

    .line 116
    mul-int/2addr v3, v5

    .line 117
    if-gt v4, v2, :cond_1

    .line 118
    div-int/2addr v3, v4

    .line 119
    add-int/lit8 v4, v4, 0x1

    .line 115
    :cond_1
    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    .line 122
    :cond_2
    :goto_2
    if-gt v4, v2, :cond_3

    .line 123
    div-int/2addr v3, v4

    .line 124
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 126
    :cond_3
    return v3
.end method
