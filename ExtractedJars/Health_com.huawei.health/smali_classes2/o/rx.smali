.class public final Lo/rx;
.super Lo/rw;
.source "SourceFile"


# static fields
.field private static final a:[I

.field private static final c:[I

.field static final d:[[I

.field private static final e:[I


# instance fields
.field private b:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 54
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/rx;->e:[I

    .line 65
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lo/rx;->c:[I

    .line 66
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    sput-object v0, Lo/rx;->a:[I

    .line 71
    const/16 v0, 0xa

    new-array v0, v0, [[I

    const/4 v1, 0x5

    new-array v1, v1, [I

    fill-array-data v1, :array_3

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x5

    new-array v1, v1, [I

    fill-array-data v1, :array_4

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x5

    new-array v1, v1, [I

    fill-array-data v1, :array_5

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v1, 0x5

    new-array v1, v1, [I

    fill-array-data v1, :array_6

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/4 v1, 0x5

    new-array v1, v1, [I

    fill-array-data v1, :array_7

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/4 v1, 0x5

    new-array v1, v1, [I

    fill-array-data v1, :array_8

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/4 v1, 0x5

    new-array v1, v1, [I

    fill-array-data v1, :array_9

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v1, 0x5

    new-array v1, v1, [I

    fill-array-data v1, :array_a

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const/4 v1, 0x5

    new-array v1, v1, [I

    fill-array-data v1, :array_b

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const/4 v1, 0x5

    new-array v1, v1, [I

    fill-array-data v1, :array_c

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sput-object v0, Lo/rx;->d:[[I

    return-void

    nop

    :array_0
    .array-data 4
        0x6
        0x8
        0xa
        0xc
        0xe
    .end array-data

    :array_1
    .array-data 4
        0x1
        0x1
        0x1
        0x1
    .end array-data

    :array_2
    .array-data 4
        0x1
        0x1
        0x3
    .end array-data

    :array_3
    .array-data 4
        0x1
        0x1
        0x3
        0x3
        0x1
    .end array-data

    :array_4
    .array-data 4
        0x3
        0x1
        0x1
        0x1
        0x3
    .end array-data

    :array_5
    .array-data 4
        0x1
        0x3
        0x1
        0x1
        0x3
    .end array-data

    :array_6
    .array-data 4
        0x3
        0x3
        0x1
        0x1
        0x1
    .end array-data

    :array_7
    .array-data 4
        0x1
        0x1
        0x3
        0x1
        0x3
    .end array-data

    :array_8
    .array-data 4
        0x3
        0x1
        0x3
        0x1
        0x1
    .end array-data

    :array_9
    .array-data 4
        0x1
        0x3
        0x3
        0x1
        0x1
    .end array-data

    :array_a
    .array-data 4
        0x1
        0x1
        0x1
        0x3
        0x3
    .end array-data

    :array_b
    .array-data 4
        0x3
        0x1
        0x1
        0x3
        0x1
    .end array-data

    :array_c
    .array-data 4
        0x1
        0x3
        0x1
        0x3
        0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Lo/rw;-><init>()V

    .line 57
    const/4 v0, -0x1

    iput v0, p0, Lo/rx;->b:I

    return-void
.end method

.method private static a(Lo/qm;I[I)[I
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 297
    array-length v3, p2

    .line 298
    new-array v4, v3, [I

    .line 299
    invoke-virtual {p0}, Lo/qm;->d()I

    move-result v5

    .line 300
    const/4 v6, 0x0

    .line 302
    const/4 v7, 0x0

    .line 303
    move v8, p1

    .line 304
    move v9, p1

    :goto_0
    if-ge v9, v5, :cond_4

    .line 305
    invoke-virtual {p0, v9}, Lo/qm;->d(I)Z

    move-result v0

    xor-int/2addr v0, v6

    if-eqz v0, :cond_0

    .line 306
    aget v0, v4, v7

    add-int/lit8 v0, v0, 0x1

    aput v0, v4, v7

    goto :goto_2

    .line 308
    :cond_0
    add-int/lit8 v0, v3, -0x1

    if-ne v7, v0, :cond_2

    .line 309
    const v0, 0x3f47ae14    # 0.78f

    invoke-static {v4, p2, v0}, Lo/rx;->b([I[IF)F

    move-result v0

    const v1, 0x3ec28f5c    # 0.38f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 310
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput v8, v0, v1

    const/4 v1, 0x1

    aput v9, v0, v1

    return-object v0

    .line 312
    :cond_1
    const/4 v0, 0x0

    aget v0, v4, v0

    const/4 v1, 0x1

    aget v1, v4, v1

    add-int/2addr v0, v1

    add-int/2addr v8, v0

    .line 313
    add-int/lit8 v0, v3, -0x2

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v4, v1, v4, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 314
    add-int/lit8 v0, v3, -0x2

    const/4 v1, 0x0

    aput v1, v4, v0

    .line 315
    add-int/lit8 v0, v3, -0x1

    const/4 v1, 0x0

    aput v1, v4, v0

    .line 316
    add-int/lit8 v7, v7, -0x1

    goto :goto_1

    .line 318
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 320
    :goto_1
    const/4 v0, 0x1

    aput v0, v4, v7

    .line 321
    if-nez v6, :cond_3

    const/4 v6, 0x1

    goto :goto_2

    :cond_3
    const/4 v6, 0x0

    .line 304
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 324
    :cond_4
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method

.method private static b([I)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 336
    const v1, 0x3ec28f5c    # 0.38f

    .line 337
    const/4 v2, -0x1

    .line 338
    sget-object v0, Lo/rx;->d:[[I

    array-length v3, v0

    .line 339
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    .line 340
    sget-object v0, Lo/rx;->d:[[I

    aget-object v5, v0, v4

    .line 341
    const v0, 0x3f47ae14    # 0.78f

    invoke-static {p0, v5, v0}, Lo/rx;->b([I[IF)F

    move-result v6

    .line 342
    cmpg-float v0, v6, v1

    if-gez v0, :cond_0

    .line 343
    move v1, v6

    .line 344
    move v2, v4

    .line 339
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 347
    :cond_1
    if-ltz v2, :cond_2

    .line 348
    return v2

    .line 350
    :cond_2
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method

.method private static d(Lo/qm;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 240
    invoke-virtual {p0}, Lo/qm;->d()I

    move-result v1

    .line 241
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/qm;->a(I)I

    move-result v2

    .line 242
    if-ne v2, v1, :cond_0

    .line 243
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 246
    :cond_0
    return v2
.end method

.method private e(Lo/qm;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 215
    iget v0, p0, Lo/rx;->b:I

    mul-int/lit8 v2, v0, 0xa

    .line 218
    if-ge v2, p2, :cond_0

    goto :goto_0

    :cond_0
    move v2, p2

    .line 220
    :goto_0
    add-int/lit8 v3, p2, -0x1

    :goto_1
    if-lez v2, :cond_2

    if-ltz v3, :cond_2

    .line 221
    invoke-virtual {p1, v3}, Lo/qm;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 222
    goto :goto_2

    .line 224
    :cond_1
    add-int/lit8 v2, v2, -0x1

    .line 220
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    .line 226
    :cond_2
    :goto_2
    if-eqz v2, :cond_3

    .line 228
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 230
    :cond_3
    return-void
.end method

.method private static e(Lo/qm;IILjava/lang/StringBuilder;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 150
    const/16 v0, 0xa

    new-array v1, v0, [I

    .line 151
    const/4 v0, 0x5

    new-array v2, v0, [I

    .line 152
    const/4 v0, 0x5

    new-array v3, v0, [I

    .line 154
    :goto_0
    if-ge p1, p2, :cond_2

    .line 157
    invoke-static {p0, p1, v1}, Lo/rx;->c(Lo/qm;I[I)V

    .line 159
    const/4 v4, 0x0

    :goto_1
    const/4 v0, 0x5

    if-ge v4, v0, :cond_0

    .line 160
    mul-int/lit8 v5, v4, 0x2

    .line 161
    aget v0, v1, v5

    aput v0, v2, v4

    .line 162
    add-int/lit8 v0, v5, 0x1

    aget v0, v1, v0

    aput v0, v3, v4

    .line 159
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 165
    :cond_0
    invoke-static {v2}, Lo/rx;->b([I)I

    move-result v4

    .line 166
    add-int/lit8 v0, v4, 0x30

    int-to-char v0, v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 167
    invoke-static {v3}, Lo/rx;->b([I)I

    move-result v4

    .line 168
    add-int/lit8 v0, v4, 0x30

    int-to-char v0, v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 170
    move-object v5, v1

    array-length v6, v5

    const/16 v6, 0xa

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_1

    aget v8, v5, v7

    .line 171
    add-int/2addr p1, v8

    .line 170
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 173
    :cond_1
    goto :goto_0

    .line 174
    :cond_2
    return-void
.end method


# virtual methods
.method public a(ILo/qm;Ljava/util/Map;)Lo/or;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/qm;Ljava/util/Map<Lo/og;*>;)Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;,
            Lo/oo;
        }
    .end annotation

    .line 89
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/rx;->b(Lo/qm;)[I

    move-result-object v5

    .line 90
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/rx;->e(Lo/qm;)[I

    move-result-object v6

    .line 92
    new-instance v7, Ljava/lang/StringBuilder;

    const/16 v0, 0x14

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 93
    const/4 v0, 0x1

    aget v0, v5, v0

    const/4 v1, 0x0

    aget v1, v6, v1

    move-object/from16 v2, p2

    invoke-static {v2, v0, v1, v7}, Lo/rx;->e(Lo/qm;IILjava/lang/StringBuilder;)V

    .line 94
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 96
    const/4 v9, 0x0

    .line 97
    if-eqz p3, :cond_0

    .line 98
    sget-object v0, Lo/og;->g:Lo/og;

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    move-object v9, v0

    check-cast v9, [I

    .line 101
    :cond_0
    if-nez v9, :cond_1

    .line 102
    sget-object v9, Lo/rx;->e:[I

    .line 107
    :cond_1
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v10

    .line 108
    const/4 v11, 0x0

    .line 109
    const/4 v12, 0x0

    .line 110
    move-object v13, v9

    array-length v14, v13

    const/4 v15, 0x0

    :goto_0
    if-ge v15, v14, :cond_4

    aget v16, v13, v15

    .line 111
    move/from16 v0, v16

    if-ne v10, v0, :cond_2

    .line 112
    const/4 v11, 0x1

    .line 113
    goto :goto_1

    .line 115
    :cond_2
    move/from16 v0, v16

    if-le v0, v12, :cond_3

    .line 116
    move/from16 v12, v16

    .line 110
    :cond_3
    add-int/lit8 v15, v15, 0x1

    goto :goto_0

    .line 119
    :cond_4
    :goto_1
    if-nez v11, :cond_5

    if-le v10, v12, :cond_5

    .line 120
    const/4 v11, 0x1

    .line 122
    :cond_5
    if-nez v11, :cond_6

    .line 123
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 126
    :cond_6
    new-instance v0, Lo/or;

    const/4 v1, 0x2

    new-array v1, v1, [Lo/ou;

    new-instance v2, Lo/ou;

    const/4 v3, 0x1

    aget v3, v5, v3

    int-to-float v3, v3

    move/from16 v4, p1

    int-to-float v4, v4

    invoke-direct {v2, v3, v4}, Lo/ou;-><init>(FF)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Lo/ou;

    const/4 v3, 0x0

    aget v3, v6, v3

    int-to-float v3, v3

    move/from16 v4, p1

    int-to-float v4, v4

    invoke-direct {v2, v3, v4}, Lo/ou;-><init>(FF)V

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, Lo/od;->f:Lo/od;

    const/4 v3, 0x0

    invoke-direct {v0, v8, v3, v1, v2}, Lo/or;-><init>(Ljava/lang/String;[B[Lo/ou;Lo/od;)V

    return-object v0
.end method

.method b(Lo/qm;)[I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 185
    invoke-static {p1}, Lo/rx;->d(Lo/qm;)I

    move-result v2

    .line 186
    sget-object v0, Lo/rx;->c:[I

    invoke-static {p1, v2, v0}, Lo/rx;->a(Lo/qm;I[I)[I

    move-result-object v3

    .line 191
    const/4 v0, 0x1

    aget v0, v3, v0

    const/4 v1, 0x0

    aget v1, v3, v1

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x4

    iput v0, p0, Lo/rx;->b:I

    .line 193
    const/4 v0, 0x0

    aget v0, v3, v0

    invoke-direct {p0, p1, v0}, Lo/rx;->e(Lo/qm;I)V

    .line 195
    return-object v3
.end method

.method e(Lo/qm;)[I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 261
    invoke-virtual {p1}, Lo/qm;->a()V

    .line 263
    :try_start_0
    invoke-static {p1}, Lo/rx;->d(Lo/qm;)I

    move-result v2

    .line 264
    sget-object v0, Lo/rx;->a:[I

    invoke-static {p1, v2, v0}, Lo/rx;->a(Lo/qm;I[I)[I

    move-result-object v3

    .line 269
    const/4 v0, 0x0

    aget v0, v3, v0

    invoke-direct {p0, p1, v0}, Lo/rx;->e(Lo/qm;I)V

    .line 274
    const/4 v0, 0x0

    aget v4, v3, v0

    .line 275
    invoke-virtual {p1}, Lo/qm;->d()I

    move-result v0

    const/4 v1, 0x1

    aget v1, v3, v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    aput v0, v3, v1

    .line 276
    invoke-virtual {p1}, Lo/qm;->d()I

    move-result v0

    sub-int/2addr v0, v4

    const/4 v1, 0x1

    aput v0, v3, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 278
    move-object v5, v3

    .line 281
    invoke-virtual {p1}, Lo/qm;->a()V

    return-object v5

    :catchall_0
    move-exception v6

    invoke-virtual {p1}, Lo/qm;->a()V

    throw v6
.end method
