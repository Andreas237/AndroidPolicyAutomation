.class public final Lo/rp;
.super Lo/rw;
.source "SourceFile"


# static fields
.field private static final b:[C

.field static final c:[I

.field static final e:[C


# instance fields
.field private final a:Ljava/lang/StringBuilder;

.field private d:[I

.field private g:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    const-string v0, "0123456789-$:/.+ABCD"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lo/rp;->e:[C

    .line 50
    const/16 v0, 0x14

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/rp;->c:[I

    .line 61
    const/4 v0, 0x4

    new-array v0, v0, [C

    fill-array-data v0, :array_1

    sput-object v0, Lo/rp;->b:[C

    return-void

    :array_0
    .array-data 4
        0x3
        0x6
        0x9
        0x60
        0x12
        0x42
        0x21
        0x24
        0x30
        0x48
        0xc
        0x18
        0x45
        0x51
        0x54
        0x15
        0x1a
        0x29
        0xb
        0xe
    .end array-data

    :array_1
    .array-data 2
        0x41s
        0x42s
        0x43s
        0x44s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 73
    invoke-direct {p0}, Lo/rw;-><init>()V

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    .line 75
    const/16 v0, 0x50

    new-array v0, v0, [I

    iput-object v0, p0, Lo/rp;->d:[I

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lo/rp;->g:I

    .line 77
    return-void
.end method

.method private c(I)V
    .locals 5

    .line 254
    iget-object v0, p0, Lo/rp;->d:[I

    iget v1, p0, Lo/rp;->g:I

    aput p1, v0, v1

    .line 255
    iget v0, p0, Lo/rp;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/rp;->g:I

    .line 256
    iget v0, p0, Lo/rp;->g:I

    iget-object v1, p0, Lo/rp;->d:[I

    array-length v1, v1

    if-lt v0, v1, :cond_0

    .line 257
    iget v0, p0, Lo/rp;->g:I

    mul-int/lit8 v0, v0, 0x2

    new-array v4, v0, [I

    .line 258
    iget-object v0, p0, Lo/rp;->d:[I

    iget v1, p0, Lo/rp;->g:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v4, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 259
    iput-object v4, p0, Lo/rp;->d:[I

    .line 261
    :cond_0
    return-void
.end method

.method private c(Lo/qm;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 231
    const/4 v0, 0x0

    iput v0, p0, Lo/rp;->g:I

    .line 233
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/qm;->b(I)I

    move-result v1

    .line 234
    invoke-virtual {p1}, Lo/qm;->d()I

    move-result v2

    .line 235
    if-lt v1, v2, :cond_0

    .line 236
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 238
    :cond_0
    const/4 v3, 0x1

    .line 239
    const/4 v4, 0x0

    .line 240
    :goto_0
    if-ge v1, v2, :cond_3

    .line 241
    invoke-virtual {p1, v1}, Lo/qm;->d(I)Z

    move-result v0

    xor-int/2addr v0, v3

    if-eqz v0, :cond_1

    .line 242
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 244
    :cond_1
    invoke-direct {p0, v4}, Lo/rp;->c(I)V

    .line 245
    const/4 v4, 0x1

    .line 246
    if-nez v3, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 248
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 250
    :cond_3
    invoke-direct {p0, v4}, Lo/rp;->c(I)V

    .line 251
    return-void
.end method

.method private d(I)I
    .locals 14

    .line 294
    add-int/lit8 v2, p1, 0x7

    .line 295
    iget v0, p0, Lo/rp;->g:I

    if-lt v2, v0, :cond_0

    .line 296
    const/4 v0, -0x1

    return v0

    .line 299
    :cond_0
    iget-object v3, p0, Lo/rp;->d:[I

    .line 301
    const/4 v4, 0x0

    .line 302
    const v5, 0x7fffffff

    .line 303
    move v6, p1

    :goto_0
    if-ge v6, v2, :cond_3

    .line 304
    aget v7, v3, v6

    .line 305
    if-ge v7, v5, :cond_1

    .line 306
    move v5, v7

    .line 308
    :cond_1
    if-le v7, v4, :cond_2

    .line 309
    move v4, v7

    .line 303
    :cond_2
    add-int/lit8 v6, v6, 0x2

    goto :goto_0

    .line 312
    :cond_3
    add-int v0, v5, v4

    div-int/lit8 v6, v0, 0x2

    .line 314
    const/4 v7, 0x0

    .line 315
    const v8, 0x7fffffff

    .line 316
    add-int/lit8 v9, p1, 0x1

    :goto_1
    if-ge v9, v2, :cond_6

    .line 317
    aget v10, v3, v9

    .line 318
    if-ge v10, v8, :cond_4

    .line 319
    move v8, v10

    .line 321
    :cond_4
    if-le v10, v7, :cond_5

    .line 322
    move v7, v10

    .line 316
    :cond_5
    add-int/lit8 v9, v9, 0x2

    goto :goto_1

    .line 325
    :cond_6
    add-int v0, v8, v7

    div-int/lit8 v9, v0, 0x2

    .line 327
    const/16 v10, 0x80

    .line 328
    const/4 v11, 0x0

    .line 329
    const/4 v12, 0x0

    :goto_2
    const/4 v0, 0x7

    if-ge v12, v0, :cond_9

    .line 330
    and-int/lit8 v0, v12, 0x1

    if-nez v0, :cond_7

    move v13, v6

    goto :goto_3

    :cond_7
    move v13, v9

    .line 331
    :goto_3
    shr-int/lit8 v10, v10, 0x1

    .line 332
    add-int v0, p1, v12

    aget v0, v3, v0

    if-le v0, v13, :cond_8

    .line 333
    or-int/2addr v11, v10

    .line 329
    :cond_8
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 337
    :cond_9
    const/4 v12, 0x0

    :goto_4
    sget-object v0, Lo/rp;->c:[I

    array-length v0, v0

    if-ge v12, v0, :cond_b

    .line 338
    sget-object v0, Lo/rp;->c:[I

    aget v0, v0, v12

    if-ne v0, v11, :cond_a

    .line 339
    return v12

    .line 337
    :cond_a
    add-int/lit8 v12, v12, 0x1

    goto :goto_4

    .line 342
    :cond_b
    const/4 v0, -0x1

    return v0
.end method

.method static d([CC)Z
    .locals 5

    .line 282
    if-eqz p0, :cond_1

    .line 283
    move-object v1, p0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-char v4, v1, v3

    .line 284
    if-ne v4, p1, :cond_0

    .line 285
    const/4 v0, 0x1

    return v0

    .line 283
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 289
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private e()I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 264
    const/4 v2, 0x1

    :goto_0
    iget v0, p0, Lo/rp;->g:I

    if-ge v2, v0, :cond_3

    .line 265
    invoke-direct {p0, v2}, Lo/rp;->d(I)I

    move-result v3

    .line 266
    const/4 v0, -0x1

    if-eq v3, v0, :cond_2

    sget-object v0, Lo/rp;->b:[C

    sget-object v1, Lo/rp;->e:[C

    aget-char v1, v1, v3

    invoke-static {v0, v1}, Lo/rp;->d([CC)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 269
    const/4 v4, 0x0

    .line 270
    move v5, v2

    :goto_1
    add-int/lit8 v0, v2, 0x7

    if-ge v5, v0, :cond_0

    .line 271
    iget-object v0, p0, Lo/rp;->d:[I

    aget v0, v0, v5

    add-int/2addr v4, v0

    .line 270
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 273
    :cond_0
    const/4 v0, 0x1

    if-eq v2, v0, :cond_1

    iget-object v0, p0, Lo/rp;->d:[I

    add-int/lit8 v1, v2, -0x1

    aget v0, v0, v1

    div-int/lit8 v1, v4, 0x2

    if-lt v0, v1, :cond_2

    .line 274
    :cond_1
    return v2

    .line 264
    :cond_2
    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    .line 278
    :cond_3
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public a(ILo/qm;Ljava/util/Map;)Lo/or;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/qm;Ljava/util/Map<Lo/og;*>;)Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lo/rp;->d:[I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 83
    move-object/from16 v0, p2

    invoke-direct {p0, v0}, Lo/rp;->c(Lo/qm;)V

    .line 84
    invoke-direct {p0}, Lo/rp;->e()I

    move-result v5

    .line 85
    move v6, v5

    .line 87
    iget-object v0, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 89
    :cond_0
    invoke-direct {p0, v6}, Lo/rp;->d(I)I

    move-result v7

    .line 90
    const/4 v0, -0x1

    if-ne v7, v0, :cond_1

    .line 91
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 96
    :cond_1
    iget-object v0, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    int-to-char v1, v7

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 97
    add-int/lit8 v6, v6, 0x8

    .line 99
    iget-object v0, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    sget-object v0, Lo/rp;->b:[C

    sget-object v1, Lo/rp;->e:[C

    aget-char v1, v1, v7

    .line 100
    invoke-static {v0, v1}, Lo/rp;->d([CC)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 101
    goto :goto_0

    .line 103
    :cond_2
    iget v0, p0, Lo/rp;->g:I

    if-lt v6, v0, :cond_0

    .line 106
    :goto_0
    iget-object v0, p0, Lo/rp;->d:[I

    add-int/lit8 v1, v6, -0x1

    aget v7, v0, v1

    .line 107
    const/4 v8, 0x0

    .line 108
    const/4 v9, -0x8

    :goto_1
    const/4 v0, -0x1

    if-ge v9, v0, :cond_3

    .line 109
    iget-object v0, p0, Lo/rp;->d:[I

    add-int v1, v6, v9

    aget v0, v0, v1

    add-int/2addr v8, v0

    .line 108
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 115
    :cond_3
    iget v0, p0, Lo/rp;->g:I

    if-ge v6, v0, :cond_4

    div-int/lit8 v0, v8, 0x2

    if-ge v7, v0, :cond_4

    .line 116
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 119
    :cond_4
    invoke-virtual {p0, v5}, Lo/rp;->e(I)V

    .line 122
    const/4 v9, 0x0

    :goto_2
    iget-object v0, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-ge v9, v0, :cond_5

    .line 123
    iget-object v0, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    sget-object v1, Lo/rp;->e:[C

    iget-object v2, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v2

    aget-char v1, v1, v2

    invoke-virtual {v0, v9, v1}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    .line 122
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 126
    :cond_5
    iget-object v0, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v9

    .line 127
    sget-object v0, Lo/rp;->b:[C

    invoke-static {v0, v9}, Lo/rp;->d([CC)Z

    move-result v0

    if-nez v0, :cond_6

    .line 128
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 130
    :cond_6
    iget-object v0, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    iget-object v1, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v10

    .line 131
    sget-object v0, Lo/rp;->b:[C

    invoke-static {v0, v10}, Lo/rp;->d([CC)Z

    move-result v0

    if-nez v0, :cond_7

    .line 132
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 136
    :cond_7
    iget-object v0, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v1, 0x3

    if-gt v0, v1, :cond_8

    .line 138
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 141
    :cond_8
    if-eqz p3, :cond_9

    sget-object v0, Lo/og;->f:Lo/og;

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 142
    :cond_9
    iget-object v0, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    iget-object v1, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 143
    iget-object v0, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 146
    :cond_a
    const/4 v11, 0x0

    .line 147
    const/4 v12, 0x0

    :goto_3
    if-ge v12, v5, :cond_b

    .line 148
    iget-object v0, p0, Lo/rp;->d:[I

    aget v0, v0, v12

    add-int/2addr v11, v0

    .line 147
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    .line 150
    :cond_b
    int-to-float v12, v11

    .line 151
    move v13, v5

    :goto_4
    add-int/lit8 v0, v6, -0x1

    if-ge v13, v0, :cond_c

    .line 152
    iget-object v0, p0, Lo/rp;->d:[I

    aget v0, v0, v13

    add-int/2addr v11, v0

    .line 151
    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    .line 154
    :cond_c
    int-to-float v13, v11

    .line 155
    new-instance v0, Lo/or;

    iget-object v1, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    .line 156
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lo/ou;

    new-instance v3, Lo/ou;

    int-to-float v4, p1

    invoke-direct {v3, v12, v4}, Lo/ou;-><init>(FF)V

    const/4 v4, 0x0

    aput-object v3, v2, v4

    new-instance v3, Lo/ou;

    int-to-float v4, p1

    invoke-direct {v3, v13, v4}, Lo/ou;-><init>(FF)V

    const/4 v4, 0x1

    aput-object v3, v2, v4

    sget-object v3, Lo/od;->c:Lo/od;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lo/or;-><init>(Ljava/lang/String;[B[Lo/ou;Lo/od;)V

    return-object v0
.end method

.method e(I)V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 166
    const/4 v4, 0x4

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    .line 167
    const/4 v5, 0x4

    new-array v5, v5, [I

    fill-array-data v5, :array_1

    .line 168
    iget-object v0, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v6, v0, -0x1

    .line 172
    move/from16 v7, p1

    .line 173
    const/4 v8, 0x0

    .line 174
    :goto_0
    sget-object v0, Lo/rp;->c:[I

    iget-object v1, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v1

    aget v9, v0, v1

    .line 175
    const/4 v10, 0x6

    :goto_1
    if-ltz v10, :cond_0

    .line 178
    and-int/lit8 v0, v10, 0x1

    and-int/lit8 v1, v9, 0x1

    mul-int/lit8 v1, v1, 0x2

    add-int v11, v0, v1

    .line 179
    aget v0, v4, v11

    iget-object v1, p0, Lo/rp;->d:[I

    add-int v2, v7, v10

    aget v1, v1, v2

    add-int/2addr v0, v1

    aput v0, v4, v11

    .line 180
    aget v0, v5, v11

    add-int/lit8 v0, v0, 0x1

    aput v0, v5, v11

    .line 181
    shr-int/lit8 v9, v9, 0x1

    .line 175
    add-int/lit8 v10, v10, -0x1

    goto :goto_1

    .line 183
    :cond_0
    if-lt v8, v6, :cond_1

    .line 184
    goto :goto_2

    .line 187
    :cond_1
    add-int/lit8 v7, v7, 0x8

    .line 173
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 191
    :goto_2
    const/4 v0, 0x4

    new-array v8, v0, [F

    .line 192
    const/4 v0, 0x4

    new-array v9, v0, [F

    .line 196
    const/4 v10, 0x0

    :goto_3
    const/4 v0, 0x2

    if-ge v10, v0, :cond_2

    .line 197
    const/4 v0, 0x0

    aput v0, v9, v10

    .line 198
    add-int/lit8 v0, v10, 0x2

    aget v1, v4, v10

    int-to-float v1, v1

    aget v2, v5, v10

    int-to-float v2, v2

    div-float/2addr v1, v2

    add-int/lit8 v2, v10, 0x2

    aget v2, v4, v2

    int-to-float v2, v2

    add-int/lit8 v3, v10, 0x2

    aget v3, v5, v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    aput v1, v9, v0

    .line 199
    add-int/lit8 v0, v10, 0x2

    aget v0, v9, v0

    aput v0, v8, v10

    .line 200
    add-int/lit8 v0, v10, 0x2

    add-int/lit8 v1, v10, 0x2

    aget v1, v4, v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    const/high16 v2, 0x3fc00000    # 1.5f

    add-float/2addr v1, v2

    add-int/lit8 v2, v10, 0x2

    aget v2, v5, v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    aput v1, v8, v0

    .line 196
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 204
    :cond_2
    move/from16 v7, p1

    .line 205
    const/4 v10, 0x0

    .line 206
    :goto_4
    sget-object v0, Lo/rp;->c:[I

    iget-object v1, p0, Lo/rp;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v1

    aget v11, v0, v1

    .line 207
    const/4 v12, 0x6

    :goto_5
    if-ltz v12, :cond_5

    .line 210
    and-int/lit8 v0, v12, 0x1

    and-int/lit8 v1, v11, 0x1

    mul-int/lit8 v1, v1, 0x2

    add-int v13, v0, v1

    .line 211
    iget-object v0, p0, Lo/rp;->d:[I

    add-int v1, v7, v12

    aget v14, v0, v1

    .line 212
    int-to-float v0, v14

    aget v1, v9, v13

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_3

    int-to-float v0, v14

    aget v1, v8, v13

    cmpl-float v0, v0, v1

    if-lez v0, :cond_4

    .line 213
    :cond_3
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 215
    :cond_4
    shr-int/lit8 v11, v11, 0x1

    .line 207
    add-int/lit8 v12, v12, -0x1

    goto :goto_5

    .line 217
    :cond_5
    if-lt v10, v6, :cond_6

    .line 218
    goto :goto_6

    .line 220
    :cond_6
    add-int/lit8 v7, v7, 0x8

    .line 205
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    .line 222
    :goto_6
    return-void

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method
