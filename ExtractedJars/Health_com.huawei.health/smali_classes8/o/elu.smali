.class public Lo/elu;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([FIF)F
    .locals 7

    .line 83
    array-length v4, p0

    .line 84
    float-to-double v0, p2

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    .line 86
    const/4 v0, 0x6

    if-lt v4, v0, :cond_0

    const/4 v0, 0x4

    if-ge v5, v0, :cond_1

    .line 87
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 90
    :cond_1
    invoke-static {p0, p1}, Lo/elu;->e([FI)I

    move-result v6

    .line 93
    const/4 v0, 0x4

    if-ne v6, v0, :cond_3

    .line 94
    const/4 v0, 0x4

    invoke-static {p0, p1, v0}, Lo/elu;->c([FII)F

    move-result v0

    const v1, 0x3f19999a    # 0.6f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 95
    const/high16 v0, 0x41b00000    # 22.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    return v0

    .line 97
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 100
    :cond_3
    const/4 v0, 0x0

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    return v0
.end method

.method public static a(II)I
    .locals 8

    .line 21
    if-nez p0, :cond_0

    .line 23
    const/16 v0, 0x2ee0

    return v0

    .line 25
    :cond_0
    const/4 v0, 0x1

    if-gt p1, v0, :cond_1

    .line 26
    return p0

    .line 44
    :cond_1
    add-int/lit8 v4, p1, -0x1

    .line 45
    invoke-static {p0}, Lo/elu;->d(I)I

    move-result v5

    .line 46
    const/4 v0, 0x1

    if-ge v5, v0, :cond_2

    .line 48
    const/4 v5, 0x1

    .line 51
    :cond_2
    add-int/lit8 v0, v5, -0x1

    int-to-double v0, v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-int v0, v0

    mul-int v6, v4, v0

    .line 53
    const/4 v7, 0x0

    .line 54
    :goto_0
    if-ge v7, p0, :cond_3

    .line 55
    add-int/2addr v7, v6

    goto :goto_0

    .line 58
    :cond_3
    return v7
.end method

.method private static b(I)F
    .locals 3

    .line 178
    const/high16 v2, 0x3f800000    # 1.0f

    .line 179
    add-int/lit8 v0, p0, -0x4

    if-lez v0, :cond_0

    .line 180
    add-int/lit8 v0, p0, -0x4

    int-to-float v0, v0

    const v1, 0x3e4ccccd    # 0.2f

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v2, v1, v0

    .line 182
    :cond_0
    const/4 v0, 0x0

    cmpl-float v0, v2, v0

    if-lez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    const v0, 0x3e4ccccd    # 0.2f

    :goto_0
    return v0
.end method

.method public static b([FIF)F
    .locals 9

    .line 112
    array-length v4, p0

    .line 113
    const/4 v0, 0x4

    if-ge v4, v0, :cond_0

    .line 114
    const/4 v0, 0x0

    return v0

    .line 116
    :cond_0
    invoke-static {p0, p1}, Lo/elu;->e([FI)I

    move-result v5

    .line 118
    const/4 v0, 0x3

    if-eq v5, v0, :cond_1

    const/4 v0, 0x4

    if-ne v5, v0, :cond_2

    .line 119
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 123
    :cond_2
    float-to-double v0, p2

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    .line 124
    invoke-static {v6}, Lo/elu;->b(I)F

    move-result v7

    .line 125
    invoke-static {p0, p1, v5}, Lo/elu;->c([FII)F

    move-result v8

    .line 126
    cmpl-float v0, v8, v7

    if-lez v0, :cond_6

    .line 127
    const/4 v0, 0x1

    if-eq v5, v0, :cond_3

    const/4 v0, 0x5

    if-ne v5, v0, :cond_4

    .line 128
    :cond_3
    int-to-float v0, v6

    const/high16 v1, 0x40800000    # 4.0f

    add-float/2addr v0, v1

    neg-float v0, v0

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    return v0

    .line 129
    :cond_4
    const/4 v0, 0x6

    if-ne v5, v0, :cond_5

    .line 130
    int-to-float v0, v6

    const/high16 v1, 0x40800000    # 4.0f

    add-float/2addr v0, v1

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    return v0

    .line 131
    :cond_5
    const/4 v0, 0x2

    if-ne v5, v0, :cond_6

    .line 132
    const/4 v0, 0x0

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    return v0

    .line 136
    :cond_6
    const/4 v0, 0x0

    return v0
.end method

.method private static c([FII)F
    .locals 5

    .line 194
    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    const/4 v0, 0x5

    if-ne p2, v0, :cond_1

    .line 195
    :cond_0
    add-int/lit8 v0, p1, 0x1

    aget v0, p0, v0

    add-int/lit8 v1, p1, 0x3

    aget v1, p0, v1

    sub-float/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget v1, p0, v1

    aget v2, p0, p1

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    return v0

    .line 196
    :cond_1
    const/4 v0, 0x2

    if-eq p2, v0, :cond_2

    const/4 v0, 0x6

    if-ne p2, v0, :cond_3

    .line 197
    :cond_2
    add-int/lit8 v0, p1, 0x1

    aget v0, p0, v0

    add-int/lit8 v1, p1, -0x1

    aget v1, p0, v1

    sub-float/2addr v0, v1

    aget v1, p0, p1

    add-int/lit8 v2, p1, -0x2

    aget v2, p0, v2

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    return v0

    .line 198
    :cond_3
    const/4 v0, 0x4

    if-ne p2, v0, :cond_6

    .line 199
    add-int/lit8 v0, p1, 0x1

    aget v0, p0, v0

    add-int/lit8 v1, p1, -0x1

    aget v1, p0, v1

    sub-float/2addr v0, v1

    aget v1, p0, p1

    add-int/lit8 v2, p1, -0x2

    aget v2, p0, v2

    sub-float/2addr v1, v2

    div-float v3, v0, v1

    .line 200
    add-int/lit8 v0, p1, 0x1

    aget v0, p0, v0

    add-int/lit8 v1, p1, 0x3

    aget v1, p0, v1

    sub-float/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget v1, p0, v1

    aget v2, p0, p1

    sub-float/2addr v1, v2

    div-float v4, v0, v1

    .line 201
    const v0, 0x3f19999a    # 0.6f

    cmpl-float v0, v3, v0

    if-gtz v0, :cond_4

    const v0, 0x3f19999a    # 0.6f

    cmpl-float v0, v4, v0

    if-lez v0, :cond_5

    .line 202
    :cond_4
    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    .line 204
    :cond_5
    const/4 v0, 0x0

    return v0

    .line 207
    :cond_6
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method private static c(II)Z
    .locals 1

    .line 148
    add-int/lit8 v0, p1, -0x2

    if-ltz v0, :cond_0

    add-int/lit8 v0, p1, 0x3

    if-gt v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static d(I)I
    .locals 2

    .line 65
    const/4 v1, 0x0

    .line 67
    :cond_0
    div-int/lit8 p0, p0, 0xa

    .line 68
    if-eqz p0, :cond_1

    .line 69
    add-int/lit8 v1, v1, 0x1

    .line 71
    :cond_1
    if-nez p0, :cond_0

    .line 73
    return v1
.end method

.method private static e([FI)I
    .locals 5

    .line 157
    array-length v2, p0

    .line 158
    invoke-static {v2, p1}, Lo/elu;->c(II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 159
    add-int/lit8 v0, p1, -0x2

    if-ltz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 161
    :cond_1
    add-int/lit8 v0, p1, -0x1

    aget v0, p0, v0

    add-int/lit8 v1, p1, 0x1

    aget v1, p0, v1

    sub-float v3, v0, v1

    .line 162
    add-int/lit8 v0, p1, 0x3

    aget v0, p0, v0

    add-int/lit8 v1, p1, 0x1

    aget v1, p0, v1

    sub-float v4, v0, v1

    .line 163
    const/4 v0, 0x0

    cmpl-float v0, v3, v0

    if-lez v0, :cond_3

    .line 164
    const/4 v0, 0x0

    cmpl-float v0, v4, v0

    if-lez v0, :cond_2

    const/4 v0, 0x3

    goto :goto_1

    :cond_2
    const/4 v0, 0x5

    :goto_1
    return v0

    .line 166
    :cond_3
    const/4 v0, 0x0

    cmpg-float v0, v4, v0

    if-gez v0, :cond_4

    const/4 v0, 0x4

    goto :goto_2

    :cond_4
    const/4 v0, 0x6

    :goto_2
    return v0
.end method
