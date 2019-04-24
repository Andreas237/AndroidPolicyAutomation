.class final Lo/ty;
.super Lo/tr;
.source "SourceFile"


# instance fields
.field private final d:Z


# direct methods
.method constructor <init>(Lo/tq;Z)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lo/tr;-><init>(Lo/tq;)V

    .line 32
    iput-boolean p2, p0, Lo/ty;->d:Z

    .line 33
    return-void
.end method

.method private b([Lo/tp;Lo/tm;)V
    .locals 6

    .line 223
    const/4 v2, 0x0

    :goto_0
    array-length v0, p1

    if-ge v2, v0, :cond_5

    .line 224
    aget-object v3, p1, v2

    .line 225
    aget-object v0, p1, v2

    if-nez v0, :cond_0

    .line 226
    goto/16 :goto_1

    .line 228
    :cond_0
    invoke-virtual {v3}, Lo/tp;->h()I

    move-result v0

    rem-int/lit8 v4, v0, 0x1e

    .line 229
    invoke-virtual {v3}, Lo/tp;->g()I

    move-result v5

    .line 230
    invoke-virtual {p2}, Lo/tm;->a()I

    move-result v0

    if-le v5, v0, :cond_1

    .line 231
    const/4 v0, 0x0

    aput-object v0, p1, v2

    .line 232
    goto :goto_1

    .line 234
    :cond_1
    iget-boolean v0, p0, Lo/ty;->d:Z

    if-nez v0, :cond_2

    .line 235
    add-int/lit8 v5, v5, 0x2

    .line 237
    :cond_2
    rem-int/lit8 v0, v5, 0x3

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 239
    :pswitch_0
    mul-int/lit8 v0, v4, 0x3

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2}, Lo/tm;->d()I

    move-result v1

    if-eq v0, v1, :cond_4

    .line 240
    const/4 v0, 0x0

    aput-object v0, p1, v2

    goto :goto_1

    .line 244
    :pswitch_1
    div-int/lit8 v0, v4, 0x3

    invoke-virtual {p2}, Lo/tm;->c()I

    move-result v1

    if-ne v0, v1, :cond_3

    rem-int/lit8 v0, v4, 0x3

    .line 245
    invoke-virtual {p2}, Lo/tm;->b()I

    move-result v1

    if-eq v0, v1, :cond_4

    .line 246
    :cond_3
    const/4 v0, 0x0

    aput-object v0, p1, v2

    goto :goto_1

    .line 250
    :pswitch_2
    add-int/lit8 v0, v4, 0x1

    invoke-virtual {p2}, Lo/tm;->e()I

    move-result v1

    if-eq v0, v1, :cond_4

    .line 251
    const/4 v0, 0x0

    aput-object v0, p1, v2

    .line 223
    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 256
    :cond_5
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method a(Lo/tm;)I
    .locals 17

    .line 137
    invoke-virtual/range {p0 .. p0}, Lo/ty;->a()Lo/tq;

    move-result-object v4

    .line 138
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/ty;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {v4}, Lo/tq;->d()Lo/ou;

    move-result-object v5

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Lo/tq;->g()Lo/ou;

    move-result-object v5

    .line 139
    :goto_0
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/ty;->d:Z

    if-eqz v0, :cond_1

    invoke-virtual {v4}, Lo/tq;->i()Lo/ou;

    move-result-object v6

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lo/tq;->f()Lo/ou;

    move-result-object v6

    .line 140
    :goto_1
    invoke-virtual {v5}, Lo/ou;->e()F

    move-result v0

    float-to-int v0, v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/ty;->b(I)I

    move-result v7

    .line 141
    invoke-virtual {v6}, Lo/ou;->e()F

    move-result v0

    float-to-int v0, v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/ty;->b(I)I

    move-result v8

    .line 142
    sub-int v0, v8, v7

    int-to-float v0, v0

    invoke-virtual/range {p1 .. p1}, Lo/tm;->a()I

    move-result v1

    int-to-float v1, v1

    div-float v9, v0, v1

    .line 143
    invoke-virtual/range {p0 .. p0}, Lo/ty;->e()[Lo/tp;

    move-result-object v10

    .line 144
    const/4 v11, -0x1

    .line 145
    const/4 v12, 0x1

    .line 146
    const/4 v13, 0x0

    .line 147
    move v14, v7

    :goto_2
    if-ge v14, v8, :cond_6

    .line 148
    aget-object v0, v10, v14

    if-nez v0, :cond_2

    .line 149
    goto :goto_3

    .line 151
    :cond_2
    aget-object v15, v10, v14

    .line 153
    invoke-virtual {v15}, Lo/tp;->e()V

    .line 155
    invoke-virtual {v15}, Lo/tp;->g()I

    move-result v0

    sub-int v16, v0, v11

    .line 159
    if-nez v16, :cond_3

    .line 160
    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    .line 161
    :cond_3
    move/from16 v0, v16

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 162
    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    move-result v12

    .line 163
    const/4 v13, 0x1

    .line 164
    invoke-virtual {v15}, Lo/tp;->g()I

    move-result v11

    goto :goto_3

    .line 165
    :cond_4
    invoke-virtual {v15}, Lo/tp;->g()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lo/tm;->a()I

    move-result v1

    if-lt v0, v1, :cond_5

    .line 166
    const/4 v0, 0x0

    aput-object v0, v10, v14

    goto :goto_3

    .line 168
    :cond_5
    invoke-virtual {v15}, Lo/tp;->g()I

    move-result v11

    .line 169
    const/4 v13, 0x1

    .line 147
    :goto_3
    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    .line 172
    :cond_6
    float-to-double v0, v9

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method b()V
    .locals 5

    .line 36
    invoke-virtual {p0}, Lo/ty;->e()[Lo/tp;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 37
    if-eqz v4, :cond_0

    .line 38
    invoke-virtual {v4}, Lo/tp;->e()V

    .line 36
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method c()Lo/tm;
    .locals 16

    .line 176
    invoke-virtual/range {p0 .. p0}, Lo/ty;->e()[Lo/tp;

    move-result-object v5

    .line 177
    new-instance v6, Lo/tn;

    invoke-direct {v6}, Lo/tn;-><init>()V

    .line 178
    new-instance v7, Lo/tn;

    invoke-direct {v7}, Lo/tn;-><init>()V

    .line 179
    new-instance v8, Lo/tn;

    invoke-direct {v8}, Lo/tn;-><init>()V

    .line 180
    new-instance v9, Lo/tn;

    invoke-direct {v9}, Lo/tn;-><init>()V

    .line 181
    move-object v10, v5

    array-length v11, v10

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v11, :cond_2

    aget-object v13, v10, v12

    .line 182
    if-nez v13, :cond_0

    .line 183
    goto :goto_1

    .line 185
    :cond_0
    invoke-virtual {v13}, Lo/tp;->e()V

    .line 186
    invoke-virtual {v13}, Lo/tp;->h()I

    move-result v0

    rem-int/lit8 v14, v0, 0x1e

    .line 187
    invoke-virtual {v13}, Lo/tp;->g()I

    move-result v15

    .line 188
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/ty;->d:Z

    if-nez v0, :cond_1

    .line 189
    add-int/lit8 v15, v15, 0x2

    .line 191
    :cond_1
    rem-int/lit8 v0, v15, 0x3

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 193
    :pswitch_0
    mul-int/lit8 v0, v14, 0x3

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v7, v0}, Lo/tn;->d(I)V

    .line 194
    goto :goto_1

    .line 196
    :pswitch_1
    div-int/lit8 v0, v14, 0x3

    invoke-virtual {v9, v0}, Lo/tn;->d(I)V

    .line 197
    rem-int/lit8 v0, v14, 0x3

    invoke-virtual {v8, v0}, Lo/tn;->d(I)V

    .line 198
    goto :goto_1

    .line 200
    :pswitch_2
    add-int/lit8 v0, v14, 0x1

    invoke-virtual {v6, v0}, Lo/tn;->d(I)V

    .line 181
    :goto_1
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 205
    :cond_2
    invoke-virtual {v6}, Lo/tn;->a()[I

    move-result-object v0

    array-length v0, v0

    if-eqz v0, :cond_3

    .line 206
    invoke-virtual {v7}, Lo/tn;->a()[I

    move-result-object v0

    array-length v0, v0

    if-eqz v0, :cond_3

    .line 207
    invoke-virtual {v8}, Lo/tn;->a()[I

    move-result-object v0

    array-length v0, v0

    if-eqz v0, :cond_3

    .line 208
    invoke-virtual {v9}, Lo/tn;->a()[I

    move-result-object v0

    array-length v0, v0

    if-eqz v0, :cond_3

    .line 209
    invoke-virtual {v6}, Lo/tn;->a()[I

    move-result-object v0

    const/4 v1, 0x0

    aget v0, v0, v1

    const/4 v1, 0x1

    if-lt v0, v1, :cond_3

    .line 210
    invoke-virtual {v7}, Lo/tn;->a()[I

    move-result-object v0

    const/4 v1, 0x0

    aget v0, v0, v1

    invoke-virtual {v8}, Lo/tn;->a()[I

    move-result-object v1

    const/4 v2, 0x0

    aget v1, v1, v2

    add-int/2addr v0, v1

    const/4 v1, 0x3

    if-lt v0, v1, :cond_3

    .line 211
    invoke-virtual {v7}, Lo/tn;->a()[I

    move-result-object v0

    const/4 v1, 0x0

    aget v0, v0, v1

    invoke-virtual {v8}, Lo/tn;->a()[I

    move-result-object v1

    const/4 v2, 0x0

    aget v1, v1, v2

    add-int/2addr v0, v1

    const/16 v1, 0x5a

    if-le v0, v1, :cond_4

    .line 212
    :cond_3
    const/4 v0, 0x0

    return-object v0

    .line 214
    :cond_4
    new-instance v10, Lo/tm;

    invoke-virtual {v6}, Lo/tn;->a()[I

    move-result-object v0

    const/4 v1, 0x0

    aget v0, v0, v1

    .line 215
    invoke-virtual {v7}, Lo/tn;->a()[I

    move-result-object v1

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v8}, Lo/tn;->a()[I

    move-result-object v2

    const/4 v3, 0x0

    aget v2, v2, v3

    invoke-virtual {v9}, Lo/tn;->a()[I

    move-result-object v3

    const/4 v4, 0x0

    aget v3, v3, v4

    invoke-direct {v10, v0, v1, v2, v3}, Lo/tm;-><init>(IIII)V

    .line 216
    move-object/from16 v0, p0

    invoke-direct {v0, v5, v10}, Lo/ty;->b([Lo/tp;Lo/tm;)V

    .line 217
    return-object v10

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method d()[I
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 115
    invoke-virtual {p0}, Lo/ty;->c()Lo/tm;

    move-result-object v2

    .line 116
    if-nez v2, :cond_0

    .line 117
    const/4 v0, 0x0

    return-object v0

    .line 119
    :cond_0
    invoke-virtual {p0, v2}, Lo/ty;->a(Lo/tm;)I

    .line 120
    invoke-virtual {v2}, Lo/tm;->a()I

    move-result v0

    new-array v3, v0, [I

    .line 121
    invoke-virtual {p0}, Lo/ty;->e()[Lo/tp;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_3

    aget-object v7, v4, v6

    .line 122
    if-eqz v7, :cond_2

    .line 123
    invoke-virtual {v7}, Lo/tp;->g()I

    move-result v8

    .line 124
    array-length v0, v3

    if-lt v8, v0, :cond_1

    .line 125
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 127
    :cond_1
    aget v0, v3, v8

    add-int/lit8 v0, v0, 0x1

    aput v0, v3, v8

    .line 121
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 130
    :cond_3
    return-object v3
.end method

.method e(Lo/tm;)I
    .locals 20

    .line 48
    invoke-virtual/range {p0 .. p0}, Lo/ty;->e()[Lo/tp;

    move-result-object v4

    .line 49
    invoke-virtual/range {p0 .. p0}, Lo/ty;->b()V

    .line 50
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v4, v1}, Lo/ty;->b([Lo/tp;Lo/tm;)V

    .line 51
    invoke-virtual/range {p0 .. p0}, Lo/ty;->a()Lo/tq;

    move-result-object v5

    .line 52
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/ty;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {v5}, Lo/tq;->d()Lo/ou;

    move-result-object v6

    goto :goto_0

    :cond_0
    invoke-virtual {v5}, Lo/tq;->g()Lo/ou;

    move-result-object v6

    .line 53
    :goto_0
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/ty;->d:Z

    if-eqz v0, :cond_1

    invoke-virtual {v5}, Lo/tq;->i()Lo/ou;

    move-result-object v7

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lo/tq;->f()Lo/ou;

    move-result-object v7

    .line 54
    :goto_1
    invoke-virtual {v6}, Lo/ou;->e()F

    move-result v0

    float-to-int v0, v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/ty;->b(I)I

    move-result v8

    .line 55
    invoke-virtual {v7}, Lo/ou;->e()F

    move-result v0

    float-to-int v0, v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/ty;->b(I)I

    move-result v9

    .line 58
    sub-int v0, v9, v8

    int-to-float v0, v0

    invoke-virtual/range {p1 .. p1}, Lo/tm;->a()I

    move-result v1

    int-to-float v1, v1

    div-float v10, v0, v1

    .line 59
    const/4 v11, -0x1

    .line 60
    const/4 v12, 0x1

    .line 61
    const/4 v13, 0x0

    .line 62
    move v14, v8

    :goto_2
    if-ge v14, v9, :cond_c

    .line 63
    aget-object v0, v4, v14

    if-nez v0, :cond_2

    .line 64
    goto/16 :goto_7

    .line 66
    :cond_2
    aget-object v15, v4, v14

    .line 76
    invoke-virtual {v15}, Lo/tp;->g()I

    move-result v0

    sub-int v16, v0, v11

    .line 80
    if-nez v16, :cond_3

    .line 81
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_7

    .line 82
    :cond_3
    move/from16 v0, v16

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 83
    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    move-result v12

    .line 84
    const/4 v13, 0x1

    .line 85
    invoke-virtual {v15}, Lo/tp;->g()I

    move-result v11

    goto/16 :goto_7

    .line 86
    :cond_4
    if-ltz v16, :cond_5

    .line 87
    invoke-virtual {v15}, Lo/tp;->g()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lo/tm;->a()I

    move-result v1

    if-ge v0, v1, :cond_5

    move/from16 v0, v16

    if-le v0, v14, :cond_6

    .line 89
    :cond_5
    const/4 v0, 0x0

    aput-object v0, v4, v14

    goto :goto_7

    .line 92
    :cond_6
    const/4 v0, 0x2

    if-le v12, v0, :cond_7

    .line 93
    add-int/lit8 v0, v12, -0x2

    mul-int v17, v0, v16

    goto :goto_3

    .line 95
    :cond_7
    move/from16 v17, v16

    .line 97
    :goto_3
    move/from16 v0, v17

    if-lt v0, v14, :cond_8

    const/16 v18, 0x1

    goto :goto_4

    :cond_8
    const/16 v18, 0x0

    .line 98
    :goto_4
    const/16 v19, 0x1

    :goto_5
    move/from16 v0, v19

    move/from16 v1, v17

    if-gt v0, v1, :cond_a

    if-nez v18, :cond_a

    .line 101
    sub-int v0, v14, v19

    aget-object v0, v4, v0

    if-eqz v0, :cond_9

    const/16 v18, 0x1

    goto :goto_6

    :cond_9
    const/16 v18, 0x0

    .line 98
    :goto_6
    add-int/lit8 v19, v19, 0x1

    goto :goto_5

    .line 103
    :cond_a
    if-eqz v18, :cond_b

    .line 104
    const/4 v0, 0x0

    aput-object v0, v4, v14

    goto :goto_7

    .line 106
    :cond_b
    invoke-virtual {v15}, Lo/tp;->g()I

    move-result v11

    .line 107
    const/4 v13, 0x1

    .line 62
    :goto_7
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_2

    .line 111
    :cond_c
    float-to-double v0, v10

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method i()Z
    .locals 1

    .line 259
    iget-boolean v0, p0, Lo/ty;->d:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 264
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IsLeft: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lo/ty;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lo/tr;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
