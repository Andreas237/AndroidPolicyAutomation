.class public abstract Lo/rw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/op;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lo/oj;Ljava/util/Map;)Lo/or;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/oj;Ljava/util/Map<Lo/og;*>;)Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 105
    invoke-virtual/range {p1 .. p1}, Lo/oj;->c()I

    move-result v3

    .line 106
    invoke-virtual/range {p1 .. p1}, Lo/oj;->e()I

    move-result v4

    .line 107
    new-instance v5, Lo/qm;

    invoke-direct {v5, v3}, Lo/qm;-><init>(I)V

    .line 109
    shr-int/lit8 v6, v4, 0x1

    .line 110
    if-eqz p2, :cond_0

    sget-object v0, Lo/og;->b:Lo/og;

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    .line 111
    :goto_0
    if-eqz v7, :cond_1

    const/16 v0, 0x8

    goto :goto_1

    :cond_1
    const/4 v0, 0x5

    :goto_1
    shr-int v0, v4, v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v8

    .line 113
    if-eqz v7, :cond_2

    .line 114
    move v9, v4

    goto :goto_2

    .line 116
    :cond_2
    const/16 v9, 0xf

    .line 119
    :goto_2
    const/4 v10, 0x0

    :goto_3
    if-ge v10, v9, :cond_9

    .line 122
    add-int/lit8 v0, v10, 0x1

    div-int/lit8 v11, v0, 0x2

    .line 123
    and-int/lit8 v0, v10, 0x1

    if-nez v0, :cond_3

    const/4 v12, 0x1

    goto :goto_4

    :cond_3
    const/4 v12, 0x0

    .line 124
    :goto_4
    if-eqz v12, :cond_4

    move v0, v11

    goto :goto_5

    :cond_4
    neg-int v0, v11

    :goto_5
    mul-int/2addr v0, v8

    add-int v13, v6, v0

    .line 125
    if-ltz v13, :cond_9

    if-lt v13, v4, :cond_5

    .line 127
    goto/16 :goto_9

    .line 132
    :cond_5
    move-object/from16 v0, p1

    :try_start_0
    invoke-virtual {v0, v13, v5}, Lo/oj;->a(ILo/qm;)Lo/qm;
    :try_end_0
    .catch Lo/oo; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 135
    goto :goto_6

    .line 133
    :catch_0
    move-exception v14

    .line 134
    goto/16 :goto_8

    .line 139
    :goto_6
    const/4 v14, 0x0

    :goto_7
    const/4 v0, 0x2

    if-ge v14, v0, :cond_8

    .line 140
    const/4 v0, 0x1

    if-ne v14, v0, :cond_6

    .line 141
    invoke-virtual {v5}, Lo/qm;->a()V

    .line 146
    if-eqz p2, :cond_6

    sget-object v0, Lo/og;->h:Lo/og;

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 147
    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lo/og;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    move-object v15, v0

    .line 148
    move-object/from16 v0, p2

    invoke-interface {v15, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 149
    sget-object v0, Lo/og;->h:Lo/og;

    invoke-interface {v15, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    move-object/from16 p2, v15

    .line 155
    :cond_6
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    :try_start_1
    invoke-virtual {v0, v13, v5, v1}, Lo/rw;->a(ILo/qm;Ljava/util/Map;)Lo/or;

    move-result-object v15

    .line 157
    const/4 v0, 0x1

    if-ne v14, v0, :cond_7

    .line 159
    sget-object v0, Lo/oq;->d:Lo/oq;

    const/16 v1, 0xb4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v15, v0, v1}, Lo/or;->e(Lo/oq;Ljava/lang/Object;)V

    .line 161
    invoke-virtual {v15}, Lo/or;->c()[Lo/ou;

    move-result-object v16

    .line 162
    if-eqz v16, :cond_7

    .line 163
    new-instance v0, Lo/ou;

    int-to-float v1, v3

    const/4 v2, 0x0

    aget-object v2, v16, v2

    invoke-virtual {v2}, Lo/ou;->b()F

    move-result v2

    sub-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    aget-object v2, v16, v2

    invoke-virtual {v2}, Lo/ou;->e()F

    move-result v2

    invoke-direct {v0, v1, v2}, Lo/ou;-><init>(FF)V

    const/4 v1, 0x0

    aput-object v0, v16, v1

    .line 164
    new-instance v0, Lo/ou;

    int-to-float v1, v3

    const/4 v2, 0x1

    aget-object v2, v16, v2

    invoke-virtual {v2}, Lo/ou;->b()F

    move-result v2

    sub-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v1, v2

    const/4 v2, 0x1

    aget-object v2, v16, v2

    invoke-virtual {v2}, Lo/ou;->e()F

    move-result v2

    invoke-direct {v0, v1, v2}, Lo/ou;-><init>(FF)V

    const/4 v1, 0x1

    aput-object v0, v16, v1
    :try_end_1
    .catch Lo/os; {:try_start_1 .. :try_end_1} :catch_1

    .line 167
    :cond_7
    return-object v15

    .line 168
    :catch_1
    move-exception v15

    .line 139
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_7

    .line 119
    :cond_8
    :goto_8
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_3

    .line 174
    :cond_9
    :goto_9
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method

.method protected static b([I[IF)F
    .locals 11

    .line 253
    array-length v2, p0

    .line 254
    const/4 v3, 0x0

    .line 255
    const/4 v4, 0x0

    .line 256
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_0

    .line 257
    aget v0, p0, v5

    add-int/2addr v3, v0

    .line 258
    aget v0, p1, v5

    add-int/2addr v4, v0

    .line 256
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 260
    :cond_0
    if-ge v3, v4, :cond_1

    .line 263
    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    return v0

    .line 266
    :cond_1
    int-to-float v0, v3

    int-to-float v1, v4

    div-float v5, v0, v1

    .line 267
    mul-float/2addr p2, v5

    .line 269
    const/4 v6, 0x0

    .line 270
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v2, :cond_4

    .line 271
    aget v8, p0, v7

    .line 272
    aget v0, p1, v7

    int-to-float v0, v0

    mul-float v9, v0, v5

    .line 273
    int-to-float v0, v8

    cmpl-float v0, v0, v9

    if-lez v0, :cond_2

    int-to-float v0, v8

    sub-float v10, v0, v9

    goto :goto_2

    :cond_2
    int-to-float v0, v8

    sub-float v10, v9, v0

    .line 274
    :goto_2
    cmpl-float v0, v10, p2

    if-lez v0, :cond_3

    .line 275
    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    return v0

    .line 277
    :cond_3
    add-float/2addr v6, v10

    .line 270
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 279
    :cond_4
    int-to-float v0, v3

    div-float v0, v6, v0

    return v0
.end method

.method protected static c(Lo/qm;I[I)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 193
    array-length v2, p2

    .line 194
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p2, v0, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 195
    invoke-virtual {p0}, Lo/qm;->d()I

    move-result v3

    .line 196
    if-lt p1, v3, :cond_0

    .line 197
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 199
    :cond_0
    invoke-virtual {p0, p1}, Lo/qm;->d(I)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    .line 200
    :goto_0
    const/4 v5, 0x0

    .line 201
    move v6, p1

    .line 202
    :goto_1
    if-ge v6, v3, :cond_5

    .line 203
    invoke-virtual {p0, v6}, Lo/qm;->d(I)Z

    move-result v0

    xor-int/2addr v0, v4

    if-eqz v0, :cond_2

    .line 204
    aget v0, p2, v5

    add-int/lit8 v0, v0, 0x1

    aput v0, p2, v5

    goto :goto_2

    .line 206
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 207
    if-ne v5, v2, :cond_3

    .line 208
    goto :goto_3

    .line 210
    :cond_3
    const/4 v0, 0x1

    aput v0, p2, v5

    .line 211
    if-nez v4, :cond_4

    const/4 v4, 0x1

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    .line 214
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 218
    :cond_5
    :goto_3
    if-eq v5, v2, :cond_7

    add-int/lit8 v0, v2, -0x1

    if-ne v5, v0, :cond_6

    if-eq v6, v3, :cond_7

    .line 219
    :cond_6
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 221
    :cond_7
    return-void
.end method

.method protected static d(Lo/qm;I[I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 226
    array-length v1, p2

    .line 227
    invoke-virtual {p0, p1}, Lo/qm;->d(I)Z

    move-result v2

    .line 228
    :cond_0
    :goto_0
    if-lez p1, :cond_2

    if-ltz v1, :cond_2

    .line 229
    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, Lo/qm;->d(I)Z

    move-result v0

    if-eq v0, v2, :cond_0

    .line 230
    add-int/lit8 v1, v1, -0x1

    .line 231
    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    goto :goto_0

    .line 234
    :cond_2
    if-ltz v1, :cond_3

    .line 235
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 237
    :cond_3
    add-int/lit8 v0, p1, 0x1

    invoke-static {p0, v0, p2}, Lo/rw;->c(Lo/qm;I[I)V

    .line 238
    return-void
.end method


# virtual methods
.method public abstract a(ILo/qm;Ljava/util/Map;)Lo/or;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/qm;Ljava/util/Map<Lo/og;*>;)Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/oh;,
            Lo/of;
        }
    .end annotation
.end method

.method public c()V
    .locals 0

    .line 87
    return-void
.end method

.method public e(Lo/oj;Ljava/util/Map;)Lo/or;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/oj;Ljava/util/Map<Lo/og;*>;)Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/of;
        }
    .end annotation

    .line 54
    :try_start_0
    invoke-direct {p0, p1, p2}, Lo/rw;->a(Lo/oj;Ljava/util/Map;)Lo/or;
    :try_end_0
    .catch Lo/oo; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 55
    :catch_0
    move-exception v3

    .line 56
    if-eqz p2, :cond_0

    sget-object v0, Lo/og;->b:Lo/og;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 57
    :goto_0
    if-eqz v4, :cond_3

    invoke-virtual {p1}, Lo/oj;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 58
    invoke-virtual {p1}, Lo/oj;->b()Lo/oj;

    move-result-object v5

    .line 59
    invoke-direct {p0, v5, p2}, Lo/rw;->a(Lo/oj;Ljava/util/Map;)Lo/or;

    move-result-object v6

    .line 61
    invoke-virtual {v6}, Lo/or;->a()Ljava/util/Map;

    move-result-object v7

    .line 62
    const/16 v8, 0x10e

    .line 63
    if-eqz v7, :cond_1

    sget-object v0, Lo/oq;->d:Lo/oq;

    invoke-interface {v7, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    sget-object v0, Lo/oq;->d:Lo/oq;

    .line 66
    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit16 v0, v0, 0x10e

    rem-int/lit16 v8, v0, 0x168

    .line 68
    :cond_1
    sget-object v0, Lo/oq;->d:Lo/oq;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lo/or;->e(Lo/oq;Ljava/lang/Object;)V

    .line 70
    invoke-virtual {v6}, Lo/or;->c()[Lo/ou;

    move-result-object v9

    .line 71
    if-eqz v9, :cond_2

    .line 72
    invoke-virtual {v5}, Lo/oj;->e()I

    move-result v10

    .line 73
    const/4 v11, 0x0

    :goto_1
    array-length v0, v9

    if-ge v11, v0, :cond_2

    .line 74
    new-instance v0, Lo/ou;

    int-to-float v1, v10

    aget-object v2, v9, v11

    invoke-virtual {v2}, Lo/ou;->e()F

    move-result v2

    sub-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v1, v2

    aget-object v2, v9, v11

    invoke-virtual {v2}, Lo/ou;->b()F

    move-result v2

    invoke-direct {v0, v1, v2}, Lo/ou;-><init>(FF)V

    aput-object v0, v9, v11

    .line 73
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 77
    :cond_2
    return-object v6

    .line 79
    :cond_3
    throw v3
.end method
