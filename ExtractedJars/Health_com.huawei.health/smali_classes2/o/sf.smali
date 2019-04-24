.class public abstract Lo/sf;
.super Lo/rw;
.source "SourceFile"


# static fields
.field static final a:[I

.field static final b:[[I

.field static final d:[I

.field static final e:[[I


# instance fields
.field private final c:Ljava/lang/StringBuilder;

.field private final g:Lo/rz;

.field private final i:Lo/se;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 53
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/sf;->a:[I

    .line 58
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lo/sf;->d:[I

    .line 63
    const/16 v0, 0xa

    new-array v0, v0, [[I

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_2

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_3

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_4

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_5

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_6

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_7

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_8

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_9

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_a

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_b

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sput-object v0, Lo/sf;->e:[[I

    .line 82
    const/16 v0, 0x14

    new-array v0, v0, [[I

    sput-object v0, Lo/sf;->b:[[I

    .line 83
    sget-object v0, Lo/sf;->e:[[I

    sget-object v1, Lo/sf;->b:[[I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v4, 0xa

    invoke-static {v0, v2, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 84
    const/16 v5, 0xa

    :goto_0
    const/16 v0, 0x14

    if-ge v5, v0, :cond_1

    .line 85
    sget-object v0, Lo/sf;->e:[[I

    add-int/lit8 v1, v5, -0xa

    aget-object v6, v0, v1

    .line 86
    array-length v0, v6

    new-array v7, v0, [I

    .line 87
    const/4 v8, 0x0

    :goto_1
    array-length v0, v6

    if-ge v8, v0, :cond_0

    .line 88
    array-length v0, v6

    sub-int/2addr v0, v8

    add-int/lit8 v0, v0, -0x1

    aget v0, v6, v0

    aput v0, v7, v8

    .line 87
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 90
    :cond_0
    sget-object v0, Lo/sf;->b:[[I

    aput-object v7, v0, v5

    .line 84
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 92
    :cond_1
    return-void

    nop

    :array_0
    .array-data 4
        0x1
        0x1
        0x1
    .end array-data

    :array_1
    .array-data 4
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data

    :array_2
    .array-data 4
        0x3
        0x2
        0x1
        0x1
    .end array-data

    :array_3
    .array-data 4
        0x2
        0x2
        0x2
        0x1
    .end array-data

    :array_4
    .array-data 4
        0x2
        0x1
        0x2
        0x2
    .end array-data

    :array_5
    .array-data 4
        0x1
        0x4
        0x1
        0x1
    .end array-data

    :array_6
    .array-data 4
        0x1
        0x1
        0x3
        0x2
    .end array-data

    :array_7
    .array-data 4
        0x1
        0x2
        0x3
        0x1
    .end array-data

    :array_8
    .array-data 4
        0x1
        0x1
        0x1
        0x4
    .end array-data

    :array_9
    .array-data 4
        0x1
        0x3
        0x1
        0x2
    .end array-data

    :array_a
    .array-data 4
        0x1
        0x2
        0x1
        0x3
    .end array-data

    :array_b
    .array-data 4
        0x3
        0x1
        0x1
        0x2
    .end array-data
.end method

.method protected constructor <init>()V
    .locals 2

    .line 98
    invoke-direct {p0}, Lo/rw;-><init>()V

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lo/sf;->c:Ljava/lang/StringBuilder;

    .line 100
    new-instance v0, Lo/se;

    invoke-direct {v0}, Lo/se;-><init>()V

    iput-object v0, p0, Lo/sf;->i:Lo/se;

    .line 101
    new-instance v0, Lo/rz;

    invoke-direct {v0}, Lo/rz;-><init>()V

    iput-object v0, p0, Lo/sf;->g:Lo/rz;

    .line 102
    return-void
.end method

.method static a(Lo/qm;)[I
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 105
    const/4 v3, 0x0

    .line 106
    const/4 v4, 0x0

    .line 107
    const/4 v5, 0x0

    .line 108
    sget-object v0, Lo/sf;->a:[I

    array-length v0, v0

    new-array v6, v0, [I

    .line 109
    :goto_0
    if-nez v3, :cond_1

    .line 110
    sget-object v0, Lo/sf;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v6, v1, v0, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 111
    sget-object v0, Lo/sf;->a:[I

    const/4 v1, 0x0

    invoke-static {p0, v5, v1, v0, v6}, Lo/sf;->d(Lo/qm;IZ[I[I)[I

    move-result-object v4

    .line 112
    const/4 v0, 0x0

    aget v7, v4, v0

    .line 113
    const/4 v0, 0x1

    aget v5, v4, v0

    .line 117
    sub-int v0, v5, v7

    sub-int v8, v7, v0

    .line 118
    if-ltz v8, :cond_0

    .line 119
    const/4 v0, 0x0

    invoke-virtual {p0, v8, v7, v0}, Lo/qm;->a(IIZ)Z

    move-result v3

    .line 121
    :cond_0
    goto :goto_0

    .line 122
    :cond_1
    return-object v4
.end method

.method static c(Ljava/lang/CharSequence;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 261
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    .line 262
    if-nez v2, :cond_0

    .line 263
    const/4 v0, 0x0

    return v0

    .line 266
    :cond_0
    const/4 v3, 0x0

    .line 267
    add-int/lit8 v4, v2, -0x2

    :goto_0
    if-ltz v4, :cond_3

    .line 268
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    add-int/lit8 v5, v0, -0x30

    .line 269
    if-ltz v5, :cond_1

    const/16 v0, 0x9

    if-le v5, v0, :cond_2

    .line 270
    :cond_1
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 272
    :cond_2
    add-int/2addr v3, v5

    .line 267
    add-int/lit8 v4, v4, -0x2

    goto :goto_0

    .line 274
    :cond_3
    mul-int/lit8 v3, v3, 0x3

    .line 275
    add-int/lit8 v4, v2, -0x1

    :goto_1
    if-ltz v4, :cond_6

    .line 276
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    add-int/lit8 v5, v0, -0x30

    .line 277
    if-ltz v5, :cond_4

    const/16 v0, 0x9

    if-le v5, v0, :cond_5

    .line 278
    :cond_4
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 280
    :cond_5
    add-int/2addr v3, v5

    .line 275
    add-int/lit8 v4, v4, -0x2

    goto :goto_1

    .line 282
    :cond_6
    rem-int/lit8 v0, v3, 0xa

    if-nez v0, :cond_7

    const/4 v0, 0x1

    goto :goto_2

    :cond_7
    const/4 v0, 0x0

    :goto_2
    return v0
.end method

.method static d(Lo/qm;IZ[I)[I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 293
    array-length v0, p3

    new-array v0, v0, [I

    invoke-static {p0, p1, p2, p3, v0}, Lo/sf;->d(Lo/qm;IZ[I[I)[I

    move-result-object v0

    return-object v0
.end method

.method private static d(Lo/qm;IZ[I[I)[I
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 312
    array-length v3, p3

    .line 313
    invoke-virtual {p0}, Lo/qm;->d()I

    move-result v4

    .line 314
    move v5, p2

    .line 315
    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lo/qm;->b(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lo/qm;->a(I)I

    move-result p1

    .line 316
    :goto_0
    const/4 v6, 0x0

    .line 317
    move v7, p1

    .line 318
    move v8, p1

    :goto_1
    if-ge v8, v4, :cond_5

    .line 319
    invoke-virtual {p0, v8}, Lo/qm;->d(I)Z

    move-result v0

    xor-int/2addr v0, v5

    if-eqz v0, :cond_1

    .line 320
    aget v0, p4, v6

    add-int/lit8 v0, v0, 0x1

    aput v0, p4, v6

    goto :goto_3

    .line 322
    :cond_1
    add-int/lit8 v0, v3, -0x1

    if-ne v6, v0, :cond_3

    .line 323
    const v0, 0x3f333333    # 0.7f

    invoke-static {p4, p3, v0}, Lo/sf;->b([I[IF)F

    move-result v0

    const v1, 0x3ef5c28f    # 0.48f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 324
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput v7, v0, v1

    const/4 v1, 0x1

    aput v8, v0, v1

    return-object v0

    .line 326
    :cond_2
    const/4 v0, 0x0

    aget v0, p4, v0

    const/4 v1, 0x1

    aget v1, p4, v1

    add-int/2addr v0, v1

    add-int/2addr v7, v0

    .line 327
    add-int/lit8 v0, v3, -0x2

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p4, v1, p4, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 328
    add-int/lit8 v0, v3, -0x2

    const/4 v1, 0x0

    aput v1, p4, v0

    .line 329
    add-int/lit8 v0, v3, -0x1

    const/4 v1, 0x0

    aput v1, p4, v0

    .line 330
    add-int/lit8 v6, v6, -0x1

    goto :goto_2

    .line 332
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 334
    :goto_2
    const/4 v0, 0x1

    aput v0, p4, v6

    .line 335
    if-nez v5, :cond_4

    const/4 v5, 0x1

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    .line 318
    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_1

    .line 338
    :cond_5
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method

.method static e(Lo/qm;[II[[I)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 355
    invoke-static {p0, p2, p1}, Lo/sf;->c(Lo/qm;I[I)V

    .line 356
    const v1, 0x3ef5c28f    # 0.48f

    .line 357
    const/4 v2, -0x1

    .line 358
    array-length v3, p3

    .line 359
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    .line 360
    aget-object v5, p3, v4

    .line 361
    const v0, 0x3f333333    # 0.7f

    invoke-static {p1, v5, v0}, Lo/sf;->b([I[IF)F

    move-result v6

    .line 362
    cmpg-float v0, v6, v1

    if-gez v0, :cond_0

    .line 363
    move v1, v6

    .line 364
    move v2, v4

    .line 359
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 367
    :cond_1
    if-ltz v2, :cond_2

    .line 368
    return v2

    .line 370
    :cond_2
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public a(ILo/qm;Ljava/util/Map;)Lo/or;
    .locals 1
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

    .line 128
    invoke-static {p2}, Lo/sf;->a(Lo/qm;)[I

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0, p3}, Lo/sf;->b(ILo/qm;[ILjava/util/Map;)Lo/or;

    move-result-object v0

    return-object v0
.end method

.method a(Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 249
    invoke-static {p1}, Lo/sf;->c(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method protected abstract b(Lo/qm;[ILjava/lang/StringBuilder;)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation
.end method

.method public b(ILo/qm;[ILjava/util/Map;)Lo/or;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/qm;[ILjava/util/Map<Lo/og;*>;)Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/oh;,
            Lo/of;
        }
    .end annotation

    .line 151
    if-nez p4, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lo/og;->h:Lo/og;

    .line 152
    move-object/from16 v1, p4

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/oy;

    .line 154
    :goto_0
    if-eqz v5, :cond_1

    .line 155
    new-instance v0, Lo/ou;

    const/4 v1, 0x0

    aget v1, p3, v1

    const/4 v2, 0x1

    aget v2, p3, v2

    add-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    move/from16 v2, p1

    int-to-float v2, v2

    invoke-direct {v0, v1, v2}, Lo/ou;-><init>(FF)V

    invoke-interface {v5, v0}, Lo/oy;->foundPossibleResultPoint(Lo/ou;)V

    .line 160
    :cond_1
    move-object/from16 v0, p0

    iget-object v6, v0, Lo/sf;->c:Ljava/lang/StringBuilder;

    .line 161
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 162
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual {v0, v1, v2, v6}, Lo/sf;->b(Lo/qm;[ILjava/lang/StringBuilder;)I

    move-result v7

    .line 164
    if-eqz v5, :cond_2

    .line 165
    new-instance v0, Lo/ou;

    int-to-float v1, v7

    move/from16 v2, p1

    int-to-float v2, v2

    invoke-direct {v0, v1, v2}, Lo/ou;-><init>(FF)V

    invoke-interface {v5, v0}, Lo/oy;->foundPossibleResultPoint(Lo/ou;)V

    .line 170
    :cond_2
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1, v7}, Lo/sf;->c(Lo/qm;I)[I

    move-result-object v8

    .line 172
    if-eqz v5, :cond_3

    .line 173
    new-instance v0, Lo/ou;

    const/4 v1, 0x0

    aget v1, v8, v1

    const/4 v2, 0x1

    aget v2, v8, v2

    add-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    move/from16 v2, p1

    int-to-float v2, v2

    invoke-direct {v0, v1, v2}, Lo/ou;-><init>(FF)V

    invoke-interface {v5, v0}, Lo/oy;->foundPossibleResultPoint(Lo/ou;)V

    .line 181
    :cond_3
    const/4 v0, 0x1

    aget v9, v8, v0

    .line 182
    const/4 v0, 0x0

    aget v0, v8, v0

    sub-int v0, v9, v0

    add-int v10, v9, v0

    .line 183
    invoke-virtual/range {p2 .. p2}, Lo/qm;->d()I

    move-result v0

    if-ge v10, v0, :cond_4

    move-object/from16 v0, p2

    const/4 v1, 0x0

    invoke-virtual {v0, v9, v10, v1}, Lo/qm;->a(IIZ)Z

    move-result v0

    if-nez v0, :cond_5

    .line 184
    :cond_4
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 187
    :cond_5
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 189
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-ge v0, v1, :cond_6

    .line 190
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 192
    :cond_6
    move-object/from16 v0, p0

    invoke-virtual {v0, v11}, Lo/sf;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 193
    invoke-static {}, Lo/oh;->d()Lo/oh;

    move-result-object v0

    throw v0

    .line 196
    :cond_7
    const/4 v0, 0x1

    aget v0, p3, v0

    const/4 v1, 0x0

    aget v1, p3, v1

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v12, v0, v1

    .line 197
    const/4 v0, 0x1

    aget v0, v8, v0

    const/4 v1, 0x0

    aget v1, v8, v1

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v13, v0, v1

    .line 198
    invoke-virtual/range {p0 .. p0}, Lo/sf;->e()Lo/od;

    move-result-object v14

    .line 199
    new-instance v0, Lo/or;

    move-object v1, v11

    const/4 v2, 0x2

    new-array v3, v2, [Lo/ou;

    new-instance v2, Lo/ou;

    move/from16 v4, p1

    int-to-float v4, v4

    invoke-direct {v2, v12, v4}, Lo/ou;-><init>(FF)V

    const/4 v4, 0x0

    aput-object v2, v3, v4

    new-instance v2, Lo/ou;

    move/from16 v4, p1

    int-to-float v4, v4

    invoke-direct {v2, v13, v4}, Lo/ou;-><init>(FF)V

    const/4 v4, 0x1

    aput-object v2, v3, v4

    move-object v4, v14

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lo/or;-><init>(Ljava/lang/String;[B[Lo/ou;Lo/od;)V

    move-object v15, v0

    .line 206
    const/16 v16, 0x0

    .line 209
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/sf;->i:Lo/se;

    const/4 v1, 0x1

    aget v1, v8, v1

    move/from16 v2, p1

    move-object/from16 v3, p2

    invoke-virtual {v0, v2, v3, v1}, Lo/se;->a(ILo/qm;I)Lo/or;

    move-result-object v17

    .line 210
    sget-object v0, Lo/oq;->h:Lo/oq;

    invoke-virtual/range {v17 .. v17}, Lo/or;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15, v0, v1}, Lo/or;->e(Lo/oq;Ljava/lang/Object;)V

    .line 211
    invoke-virtual/range {v17 .. v17}, Lo/or;->a()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v15, v0}, Lo/or;->a(Ljava/util/Map;)V

    .line 212
    invoke-virtual/range {v17 .. v17}, Lo/or;->c()[Lo/ou;

    move-result-object v0

    invoke-virtual {v15, v0}, Lo/or;->c([Lo/ou;)V

    .line 213
    invoke-virtual/range {v17 .. v17}, Lo/or;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I
    :try_end_0
    .catch Lo/os; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move/from16 v16, v0

    .line 216
    goto :goto_1

    .line 214
    :catch_0
    move-exception v17

    .line 218
    :goto_1
    if-nez p4, :cond_8

    const/16 v17, 0x0

    goto :goto_2

    :cond_8
    sget-object v0, Lo/og;->p:Lo/og;

    .line 219
    move-object/from16 v1, p4

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    move-object/from16 v17, v0

    check-cast v17, [I

    .line 220
    :goto_2
    if-eqz v17, :cond_b

    .line 221
    const/16 v18, 0x0

    .line 222
    move-object/from16 v19, v17

    move-object/from16 v0, v19

    array-length v0, v0

    move/from16 v20, v0

    const/16 v21, 0x0

    :goto_3
    move/from16 v0, v21

    move/from16 v1, v20

    if-ge v0, v1, :cond_a

    aget v22, v19, v21

    .line 223
    move/from16 v0, v16

    move/from16 v1, v22

    if-ne v0, v1, :cond_9

    .line 224
    const/16 v18, 0x1

    .line 225
    goto :goto_4

    .line 222
    :cond_9
    add-int/lit8 v21, v21, 0x1

    goto :goto_3

    .line 228
    :cond_a
    :goto_4
    if-nez v18, :cond_b

    .line 229
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 233
    :cond_b
    sget-object v0, Lo/od;->k:Lo/od;

    if-eq v14, v0, :cond_c

    sget-object v0, Lo/od;->m:Lo/od;

    if-ne v14, v0, :cond_d

    .line 234
    :cond_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/sf;->g:Lo/rz;

    invoke-virtual {v0, v11}, Lo/rz;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 235
    if-eqz v18, :cond_d

    .line 236
    sget-object v0, Lo/oq;->i:Lo/oq;

    move-object/from16 v1, v18

    invoke-virtual {v15, v0, v1}, Lo/or;->e(Lo/oq;Ljava/lang/Object;)V

    .line 240
    :cond_d
    return-object v15
.end method

.method c(Lo/qm;I)[I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 286
    sget-object v0, Lo/sf;->a:[I

    const/4 v1, 0x0

    invoke-static {p1, p2, v1, v0}, Lo/sf;->d(Lo/qm;IZ[I)[I

    move-result-object v0

    return-object v0
.end method

.method abstract e()Lo/od;
.end method
