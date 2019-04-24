.class final Lo/us;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Lo/qr;

.field private final c:I

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ur;>;"
        }
    .end annotation
.end field

.field private final e:I

.field private final f:F

.field private final g:[I

.field private final i:I

.field private final k:Lo/oy;


# direct methods
.method constructor <init>(Lo/qr;IIIIFLo/oy;)V
    .locals 2

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Lo/us;->b:Lo/qr;

    .line 70
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lo/us;->d:Ljava/util/List;

    .line 71
    iput p2, p0, Lo/us;->c:I

    .line 72
    iput p3, p0, Lo/us;->a:I

    .line 73
    iput p4, p0, Lo/us;->e:I

    .line 74
    iput p5, p0, Lo/us;->i:I

    .line 75
    iput p6, p0, Lo/us;->f:F

    .line 76
    const/4 v0, 0x3

    new-array v0, v0, [I

    iput-object v0, p0, Lo/us;->g:[I

    .line 77
    iput-object p7, p0, Lo/us;->k:Lo/oy;

    .line 78
    return-void
.end method

.method private a([III)Lo/ur;
    .locals 9

    .line 256
    const/4 v0, 0x0

    aget v0, p1, v0

    const/4 v1, 0x1

    aget v1, p1, v1

    add-int/2addr v0, v1

    const/4 v1, 0x2

    aget v1, p1, v1

    add-int v3, v0, v1

    .line 257
    invoke-static {p1, p3}, Lo/us;->b([II)F

    move-result v4

    .line 258
    float-to-int v0, v4

    const/4 v1, 0x1

    aget v1, p1, v1

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {p0, p2, v0, v1, v3}, Lo/us;->b(IIII)F

    move-result v5

    .line 259
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2

    .line 260
    const/4 v0, 0x0

    aget v0, p1, v0

    const/4 v1, 0x1

    aget v1, p1, v1

    add-int/2addr v0, v1

    const/4 v1, 0x2

    aget v1, p1, v1

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40400000    # 3.0f

    div-float v6, v0, v1

    .line 261
    iget-object v0, p0, Lo/us;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/ur;

    .line 263
    invoke-virtual {v8, v6, v5, v4}, Lo/ur;->c(FFF)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 264
    invoke-virtual {v8, v5, v4, v6}, Lo/ur;->d(FFF)Lo/ur;

    move-result-object v0

    return-object v0

    .line 266
    :cond_0
    goto :goto_0

    .line 268
    :cond_1
    new-instance v7, Lo/ur;

    invoke-direct {v7, v4, v5, v6}, Lo/ur;-><init>(FFF)V

    .line 269
    iget-object v0, p0, Lo/us;->d:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 270
    iget-object v0, p0, Lo/us;->k:Lo/oy;

    if-eqz v0, :cond_2

    .line 271
    iget-object v0, p0, Lo/us;->k:Lo/oy;

    invoke-interface {v0, v7}, Lo/oy;->foundPossibleResultPoint(Lo/ou;)V

    .line 274
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private b(IIII)F
    .locals 7

    .line 193
    iget-object v2, p0, Lo/us;->b:Lo/qr;

    .line 195
    invoke-virtual {v2}, Lo/qr;->h()I

    move-result v3

    .line 196
    iget-object v4, p0, Lo/us;->g:[I

    .line 197
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v4, v1

    .line 198
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 199
    const/4 v0, 0x0

    const/4 v1, 0x2

    aput v0, v4, v1

    .line 202
    move v5, p1

    .line 203
    :goto_0
    if-ltz v5, :cond_0

    invoke-virtual {v2, p2, v5}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    aget v0, v4, v0

    if-gt v0, p3, :cond_0

    .line 204
    const/4 v0, 0x1

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 205
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    .line 208
    :cond_0
    if-ltz v5, :cond_1

    const/4 v0, 0x1

    aget v0, v4, v0

    if-le v0, p3, :cond_2

    .line 209
    :cond_1
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 211
    :cond_2
    :goto_1
    if-ltz v5, :cond_3

    invoke-virtual {v2, p2, v5}, Lo/qr;->e(II)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    aget v0, v4, v0

    if-gt v0, p3, :cond_3

    .line 212
    const/4 v0, 0x0

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    aput v0, v4, v1

    .line 213
    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    .line 215
    :cond_3
    const/4 v0, 0x0

    aget v0, v4, v0

    if-le v0, p3, :cond_4

    .line 216
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 220
    :cond_4
    add-int/lit8 v5, p1, 0x1

    .line 221
    :goto_2
    if-ge v5, v3, :cond_5

    invoke-virtual {v2, p2, v5}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    aget v0, v4, v0

    if-gt v0, p3, :cond_5

    .line 222
    const/4 v0, 0x1

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 223
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 225
    :cond_5
    if-eq v5, v3, :cond_6

    const/4 v0, 0x1

    aget v0, v4, v0

    if-le v0, p3, :cond_7

    .line 226
    :cond_6
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 228
    :cond_7
    :goto_3
    if-ge v5, v3, :cond_8

    invoke-virtual {v2, p2, v5}, Lo/qr;->e(II)Z

    move-result v0

    if-nez v0, :cond_8

    const/4 v0, 0x2

    aget v0, v4, v0

    if-gt v0, p3, :cond_8

    .line 229
    const/4 v0, 0x2

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x2

    aput v0, v4, v1

    .line 230
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 232
    :cond_8
    const/4 v0, 0x2

    aget v0, v4, v0

    if-le v0, p3, :cond_9

    .line 233
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 236
    :cond_9
    const/4 v0, 0x0

    aget v0, v4, v0

    const/4 v1, 0x1

    aget v1, v4, v1

    add-int/2addr v0, v1

    const/4 v1, 0x2

    aget v1, v4, v1

    add-int v6, v0, v1

    .line 237
    sub-int v0, v6, p4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x5

    mul-int/lit8 v1, p4, 0x2

    if-lt v0, v1, :cond_a

    .line 238
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 241
    :cond_a
    invoke-direct {p0, v4}, Lo/us;->d([I)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {v4, v5}, Lo/us;->b([II)F

    move-result v0

    goto :goto_4

    :cond_b
    const/high16 v0, 0x7fc00000    # Float.NaN

    :goto_4
    return v0
.end method

.method private static b([II)F
    .locals 3

    .line 161
    const/4 v0, 0x2

    aget v0, p0, v0

    sub-int v0, p1, v0

    int-to-float v0, v0

    const/4 v1, 0x1

    aget v1, p0, v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    return v0
.end method

.method private d([I)Z
    .locals 4

    .line 170
    iget v1, p0, Lo/us;->f:F

    .line 171
    const/high16 v0, 0x40000000    # 2.0f

    div-float v2, v1, v0

    .line 172
    const/4 v3, 0x0

    :goto_0
    const/4 v0, 0x3

    if-ge v3, v0, :cond_1

    .line 173
    aget v0, p1, v3

    int-to-float v0, v0

    sub-float v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_0

    .line 174
    const/4 v0, 0x0

    return v0

    .line 172
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 177
    :cond_1
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method d()Lo/ur;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 88
    iget v2, p0, Lo/us;->c:I

    .line 89
    iget v3, p0, Lo/us;->i:I

    .line 90
    iget v0, p0, Lo/us;->e:I

    add-int v4, v2, v0

    .line 91
    iget v0, p0, Lo/us;->a:I

    div-int/lit8 v1, v3, 0x2

    add-int v5, v0, v1

    .line 94
    const/4 v0, 0x3

    new-array v6, v0, [I

    .line 95
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v3, :cond_9

    .line 97
    and-int/lit8 v0, v7, 0x1

    if-nez v0, :cond_0

    add-int/lit8 v0, v7, 0x1

    div-int/lit8 v0, v0, 0x2

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v7, 0x1

    div-int/lit8 v0, v0, 0x2

    neg-int v0, v0

    :goto_1
    add-int v8, v5, v0

    .line 98
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v6, v1

    .line 99
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v6, v1

    .line 100
    const/4 v0, 0x0

    const/4 v1, 0x2

    aput v0, v6, v1

    .line 101
    move v9, v2

    .line 105
    :goto_2
    if-ge v9, v4, :cond_1

    iget-object v0, p0, Lo/us;->b:Lo/qr;

    invoke-virtual {v0, v9, v8}, Lo/qr;->e(II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 106
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 108
    :cond_1
    const/4 v10, 0x0

    .line 109
    :goto_3
    if-ge v9, v4, :cond_7

    .line 110
    iget-object v0, p0, Lo/us;->b:Lo/qr;

    invoke-virtual {v0, v9, v8}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 112
    const/4 v0, 0x1

    if-ne v10, v0, :cond_2

    .line 113
    aget v0, v6, v10

    add-int/lit8 v0, v0, 0x1

    aput v0, v6, v10

    goto :goto_4

    .line 115
    :cond_2
    const/4 v0, 0x2

    if-ne v10, v0, :cond_4

    .line 116
    invoke-direct {p0, v6}, Lo/us;->d([I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 117
    invoke-direct {p0, v6, v8, v9}, Lo/us;->a([III)Lo/ur;

    move-result-object v11

    .line 118
    if-eqz v11, :cond_3

    .line 119
    return-object v11

    .line 122
    :cond_3
    const/4 v0, 0x2

    aget v0, v6, v0

    const/4 v1, 0x0

    aput v0, v6, v1

    .line 123
    const/4 v0, 0x1

    const/4 v1, 0x1

    aput v0, v6, v1

    .line 124
    const/4 v0, 0x0

    const/4 v1, 0x2

    aput v0, v6, v1

    .line 125
    const/4 v10, 0x1

    goto :goto_4

    .line 127
    :cond_4
    add-int/lit8 v10, v10, 0x1

    aget v0, v6, v10

    add-int/lit8 v0, v0, 0x1

    aput v0, v6, v10

    goto :goto_4

    .line 131
    :cond_5
    const/4 v0, 0x1

    if-ne v10, v0, :cond_6

    .line 132
    add-int/lit8 v10, v10, 0x1

    .line 134
    :cond_6
    aget v0, v6, v10

    add-int/lit8 v0, v0, 0x1

    aput v0, v6, v10

    .line 136
    :goto_4
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_3

    .line 138
    :cond_7
    invoke-direct {p0, v6}, Lo/us;->d([I)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 139
    invoke-direct {p0, v6, v8, v4}, Lo/us;->a([III)Lo/ur;

    move-result-object v11

    .line 140
    if-eqz v11, :cond_8

    .line 141
    return-object v11

    .line 95
    :cond_8
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 149
    :cond_9
    iget-object v0, p0, Lo/us;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    .line 150
    iget-object v0, p0, Lo/us;->d:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ur;

    return-object v0

    .line 153
    :cond_a
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method
