.class public final Lo/qm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private a:I

.field private b:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lo/qm;->a:I

    .line 33
    const/4 v0, 0x1

    new-array v0, v0, [I

    iput-object v0, p0, Lo/qm;->b:[I

    .line 34
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput p1, p0, Lo/qm;->a:I

    .line 38
    invoke-static {p1}, Lo/qm;->h(I)[I

    move-result-object v0

    iput-object v0, p0, Lo/qm;->b:[I

    .line 39
    return-void
.end method

.method constructor <init>([II)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lo/qm;->b:[I

    .line 44
    iput p2, p0, Lo/qm;->a:I

    .line 45
    return-void
.end method

.method private e(I)V
    .locals 5

    .line 56
    iget-object v0, p0, Lo/qm;->b:[I

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x20

    if-le p1, v0, :cond_0

    .line 57
    invoke-static {p1}, Lo/qm;->h(I)[I

    move-result-object v4

    .line 58
    iget-object v0, p0, Lo/qm;->b:[I

    iget-object v1, p0, Lo/qm;->b:[I

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v4, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    iput-object v4, p0, Lo/qm;->b:[I

    .line 61
    :cond_0
    return-void
.end method

.method private static h(I)[I
    .locals 2

    .line 341
    add-int/lit8 v0, p0, 0x1f

    div-int/lit8 v0, v0, 0x20

    new-array v0, v0, [I

    return-object v0
.end method


# virtual methods
.method public a(I)I
    .locals 5

    .line 96
    iget v0, p0, Lo/qm;->a:I

    if-lt p1, v0, :cond_0

    .line 97
    iget v0, p0, Lo/qm;->a:I

    return v0

    .line 99
    :cond_0
    div-int/lit8 v2, p1, 0x20

    .line 100
    iget-object v0, p0, Lo/qm;->b:[I

    aget v3, v0, v2

    .line 102
    and-int/lit8 v0, p1, 0x1f

    const/4 v1, 0x1

    shl-int v0, v1, v0

    add-int/lit8 v0, v0, -0x1

    xor-int/lit8 v0, v0, -0x1

    and-int/2addr v3, v0

    .line 103
    :goto_0
    if-nez v3, :cond_2

    .line 104
    add-int/lit8 v2, v2, 0x1

    iget-object v0, p0, Lo/qm;->b:[I

    array-length v0, v0

    if-ne v2, v0, :cond_1

    .line 105
    iget v0, p0, Lo/qm;->a:I

    return v0

    .line 107
    :cond_1
    iget-object v0, p0, Lo/qm;->b:[I

    aget v3, v0, v2

    goto :goto_0

    .line 109
    :cond_2
    mul-int/lit8 v0, v2, 0x20

    invoke-static {v3}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result v1

    add-int v4, v0, v1

    .line 110
    iget v0, p0, Lo/qm;->a:I

    if-le v4, v0, :cond_3

    iget v0, p0, Lo/qm;->a:I

    goto :goto_1

    :cond_3
    move v0, v4

    :goto_1
    return v0
.end method

.method public a()V
    .locals 13

    .line 308
    iget-object v0, p0, Lo/qm;->b:[I

    array-length v0, v0

    new-array v5, v0, [I

    .line 310
    iget v0, p0, Lo/qm;->a:I

    add-int/lit8 v0, v0, -0x1

    div-int/lit8 v6, v0, 0x20

    .line 311
    add-int/lit8 v7, v6, 0x1

    .line 312
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_0

    .line 313
    iget-object v0, p0, Lo/qm;->b:[I

    aget v0, v0, v8

    int-to-long v9, v0

    .line 314
    const/4 v0, 0x1

    shr-long v0, v9, v0

    const-wide/32 v2, 0x55555555

    and-long/2addr v0, v2

    const-wide/32 v2, 0x55555555

    and-long/2addr v2, v9

    const/4 v4, 0x1

    shl-long/2addr v2, v4

    or-long v9, v0, v2

    .line 315
    const/4 v0, 0x2

    shr-long v0, v9, v0

    const-wide/32 v2, 0x33333333

    and-long/2addr v0, v2

    const-wide/32 v2, 0x33333333

    and-long/2addr v2, v9

    const/4 v4, 0x2

    shl-long/2addr v2, v4

    or-long v9, v0, v2

    .line 316
    const/4 v0, 0x4

    shr-long v0, v9, v0

    const-wide/32 v2, 0xf0f0f0f

    and-long/2addr v0, v2

    const-wide/32 v2, 0xf0f0f0f

    and-long/2addr v2, v9

    const/4 v4, 0x4

    shl-long/2addr v2, v4

    or-long v9, v0, v2

    .line 317
    const/16 v0, 0x8

    shr-long v0, v9, v0

    const-wide/32 v2, 0xff00ff

    and-long/2addr v0, v2

    const-wide/32 v2, 0xff00ff

    and-long/2addr v2, v9

    const/16 v4, 0x8

    shl-long/2addr v2, v4

    or-long v9, v0, v2

    .line 318
    const/16 v0, 0x10

    shr-long v0, v9, v0

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    const-wide/32 v2, 0xffff

    and-long/2addr v2, v9

    const/16 v4, 0x10

    shl-long/2addr v2, v4

    or-long v9, v0, v2

    .line 319
    sub-int v0, v6, v8

    long-to-int v1, v9

    aput v1, v5, v0

    .line 312
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 322
    :cond_0
    iget v0, p0, Lo/qm;->a:I

    mul-int/lit8 v1, v7, 0x20

    if-eq v0, v1, :cond_3

    .line 323
    mul-int/lit8 v0, v7, 0x20

    iget v1, p0, Lo/qm;->a:I

    sub-int v8, v0, v1

    .line 324
    const/4 v9, 0x1

    .line 325
    const/4 v10, 0x0

    :goto_1
    rsub-int/lit8 v0, v8, 0x1f

    if-ge v10, v0, :cond_1

    .line 326
    shl-int/lit8 v0, v9, 0x1

    or-int/lit8 v9, v0, 0x1

    .line 325
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 328
    :cond_1
    const/4 v0, 0x0

    aget v0, v5, v0

    shr-int/2addr v0, v8

    and-int v10, v0, v9

    .line 329
    const/4 v11, 0x1

    :goto_2
    if-ge v11, v7, :cond_2

    .line 330
    aget v12, v5, v11

    .line 331
    rsub-int/lit8 v0, v8, 0x20

    shl-int v0, v12, v0

    or-int/2addr v10, v0

    .line 332
    add-int/lit8 v0, v11, -0x1

    aput v10, v5, v0

    .line 333
    shr-int v0, v12, v8

    and-int v10, v0, v9

    .line 329
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 335
    :cond_2
    add-int/lit8 v0, v7, -0x1

    aput v10, v5, v0

    .line 337
    :cond_3
    iput-object v5, p0, Lo/qm;->b:[I

    .line 338
    return-void
.end method

.method public a(Z)V
    .locals 5

    .line 231
    iget v0, p0, Lo/qm;->a:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lo/qm;->e(I)V

    .line 232
    if-eqz p1, :cond_0

    .line 233
    iget-object v0, p0, Lo/qm;->b:[I

    iget v1, p0, Lo/qm;->a:I

    div-int/lit8 v1, v1, 0x20

    aget v2, v0, v1

    iget v3, p0, Lo/qm;->a:I

    and-int/lit8 v3, v3, 0x1f

    const/4 v4, 0x1

    shl-int v3, v4, v3

    or-int/2addr v2, v3

    aput v2, v0, v1

    .line 235
    :cond_0
    iget v0, p0, Lo/qm;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/qm;->a:I

    .line 236
    return-void
.end method

.method public a(IIZ)Z
    .locals 9

    .line 199
    if-ge p2, p1, :cond_0

    .line 200
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 202
    :cond_0
    if-ne p2, p1, :cond_1

    .line 203
    const/4 v0, 0x1

    return v0

    .line 205
    :cond_1
    add-int/lit8 p2, p2, -0x1

    .line 206
    div-int/lit8 v2, p1, 0x20

    .line 207
    div-int/lit8 v3, p2, 0x20

    .line 208
    move v4, v2

    :goto_0
    if-gt v4, v3, :cond_8

    .line 209
    if-le v4, v2, :cond_2

    const/4 v5, 0x0

    goto :goto_1

    :cond_2
    and-int/lit8 v5, p1, 0x1f

    .line 210
    :goto_1
    if-ge v4, v3, :cond_3

    const/16 v6, 0x1f

    goto :goto_2

    :cond_3
    and-int/lit8 v6, p2, 0x1f

    .line 212
    :goto_2
    if-nez v5, :cond_4

    const/16 v0, 0x1f

    if-ne v6, v0, :cond_4

    .line 213
    const/4 v7, -0x1

    goto :goto_4

    .line 215
    :cond_4
    const/4 v7, 0x0

    .line 216
    move v8, v5

    :goto_3
    if-gt v8, v6, :cond_5

    .line 217
    const/4 v0, 0x1

    shl-int/2addr v0, v8

    or-int/2addr v7, v0

    .line 216
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 223
    :cond_5
    :goto_4
    iget-object v0, p0, Lo/qm;->b:[I

    aget v0, v0, v4

    and-int/2addr v0, v7

    if-eqz p3, :cond_6

    move v1, v7

    goto :goto_5

    :cond_6
    const/4 v1, 0x0

    :goto_5
    if-eq v0, v1, :cond_7

    .line 224
    const/4 v0, 0x0

    return v0

    .line 208
    :cond_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 227
    :cond_8
    const/4 v0, 0x1

    return v0
.end method

.method public b()I
    .locals 2

    .line 52
    iget v0, p0, Lo/qm;->a:I

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    return v0
.end method

.method public b(I)I
    .locals 5

    .line 119
    iget v0, p0, Lo/qm;->a:I

    if-lt p1, v0, :cond_0

    .line 120
    iget v0, p0, Lo/qm;->a:I

    return v0

    .line 122
    :cond_0
    div-int/lit8 v2, p1, 0x20

    .line 123
    iget-object v0, p0, Lo/qm;->b:[I

    aget v0, v0, v2

    xor-int/lit8 v3, v0, -0x1

    .line 125
    and-int/lit8 v0, p1, 0x1f

    const/4 v1, 0x1

    shl-int v0, v1, v0

    add-int/lit8 v0, v0, -0x1

    xor-int/lit8 v0, v0, -0x1

    and-int/2addr v3, v0

    .line 126
    :goto_0
    if-nez v3, :cond_2

    .line 127
    add-int/lit8 v2, v2, 0x1

    iget-object v0, p0, Lo/qm;->b:[I

    array-length v0, v0

    if-ne v2, v0, :cond_1

    .line 128
    iget v0, p0, Lo/qm;->a:I

    return v0

    .line 130
    :cond_1
    iget-object v0, p0, Lo/qm;->b:[I

    aget v0, v0, v2

    xor-int/lit8 v3, v0, -0x1

    goto :goto_0

    .line 132
    :cond_2
    mul-int/lit8 v0, v2, 0x20

    invoke-static {v3}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result v1

    add-int v4, v0, v1

    .line 133
    iget v0, p0, Lo/qm;->a:I

    if-le v4, v0, :cond_3

    iget v0, p0, Lo/qm;->a:I

    goto :goto_1

    :cond_3
    move v0, v4

    :goto_1
    return v0
.end method

.method public b(II)V
    .locals 3

    .line 247
    if-ltz p2, :cond_0

    const/16 v0, 0x20

    if-le p2, v0, :cond_1

    .line 248
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Num bits must be between 0 and 32"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 250
    :cond_1
    iget v0, p0, Lo/qm;->a:I

    add-int/2addr v0, p2

    invoke-direct {p0, v0}, Lo/qm;->e(I)V

    .line 251
    move v2, p2

    :goto_0
    if-lez v2, :cond_3

    .line 252
    add-int/lit8 v0, v2, -0x1

    shr-int v0, p1, v0

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0, v0}, Lo/qm;->a(Z)V

    .line 251
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 254
    :cond_3
    return-void
.end method

.method public b(Lo/qm;)V
    .locals 3

    .line 257
    iget v1, p1, Lo/qm;->a:I

    .line 258
    iget v0, p0, Lo/qm;->a:I

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Lo/qm;->e(I)V

    .line 259
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 260
    invoke-virtual {p1, v2}, Lo/qm;->d(I)Z

    move-result v0

    invoke-virtual {p0, v0}, Lo/qm;->a(Z)V

    .line 259
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 262
    :cond_0
    return-void
.end method

.method public c()V
    .locals 4

    .line 183
    iget-object v0, p0, Lo/qm;->b:[I

    array-length v2, v0

    .line 184
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 185
    iget-object v0, p0, Lo/qm;->b:[I

    const/4 v1, 0x0

    aput v1, v0, v3

    .line 184
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 187
    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 5

    .line 77
    iget-object v0, p0, Lo/qm;->b:[I

    div-int/lit8 v1, p1, 0x20

    aget v2, v0, v1

    and-int/lit8 v3, p1, 0x1f

    const/4 v4, 0x1

    shl-int v3, v4, v3

    or-int/2addr v2, v3

    aput v2, v0, v1

    .line 78
    return-void
.end method

.method public c(I[BII)V
    .locals 5

    .line 284
    const/4 v2, 0x0

    :goto_0
    if-ge v2, p4, :cond_2

    .line 285
    const/4 v3, 0x0

    .line 286
    const/4 v4, 0x0

    :goto_1
    const/16 v0, 0x8

    if-ge v4, v0, :cond_1

    .line 287
    invoke-virtual {p0, p1}, Lo/qm;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 288
    rsub-int/lit8 v0, v4, 0x7

    const/4 v1, 0x1

    shl-int v0, v1, v0

    or-int/2addr v3, v0

    .line 290
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 286
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 292
    :cond_1
    add-int v0, p3, v2

    int-to-byte v1, v3

    aput-byte v1, p2, v0

    .line 284
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 294
    :cond_2
    return-void
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 26
    invoke-virtual {p0}, Lo/qm;->k()Lo/qm;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 48
    iget v0, p0, Lo/qm;->a:I

    return v0
.end method

.method public d(II)V
    .locals 2

    .line 144
    iget-object v0, p0, Lo/qm;->b:[I

    div-int/lit8 v1, p1, 0x20

    aput p2, v0, v1

    .line 145
    return-void
.end method

.method public d(I)Z
    .locals 3

    .line 68
    iget-object v0, p0, Lo/qm;->b:[I

    div-int/lit8 v1, p1, 0x20

    aget v0, v0, v1

    and-int/lit8 v1, p1, 0x1f

    const/4 v2, 0x1

    shl-int v1, v2, v1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(Lo/qm;)V
    .locals 4

    .line 265
    iget-object v0, p0, Lo/qm;->b:[I

    array-length v0, v0

    iget-object v1, p1, Lo/qm;->b:[I

    array-length v1, v1

    if-eq v0, v1, :cond_0

    .line 266
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Sizes don\'t match"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 268
    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lo/qm;->b:[I

    array-length v0, v0

    if-ge v3, v0, :cond_1

    .line 271
    iget-object v0, p0, Lo/qm;->b:[I

    aget v1, v0, v3

    iget-object v2, p1, Lo/qm;->b:[I

    aget v2, v2, v3

    xor-int/2addr v1, v2

    aput v1, v0, v3

    .line 268
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 273
    :cond_1
    return-void
.end method

.method public e()[I
    .locals 1

    .line 301
    iget-object v0, p0, Lo/qm;->b:[I

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 346
    instance-of v0, p1, Lo/qm;

    if-nez v0, :cond_0

    .line 347
    const/4 v0, 0x0

    return v0

    .line 349
    :cond_0
    move-object v2, p1

    check-cast v2, Lo/qm;

    .line 350
    iget v0, p0, Lo/qm;->a:I

    iget v1, v2, Lo/qm;->a:I

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lo/qm;->b:[I

    iget-object v1, v2, Lo/qm;->b:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 355
    iget v0, p0, Lo/qm;->a:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lo/qm;->b:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public k()Lo/qm;
    .locals 3

    .line 372
    new-instance v0, Lo/qm;

    iget-object v1, p0, Lo/qm;->b:[I

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iget v2, p0, Lo/qm;->a:I

    invoke-direct {v0, v1, v2}, Lo/qm;-><init>([II)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 360
    new-instance v1, Ljava/lang/StringBuilder;

    iget v0, p0, Lo/qm;->a:I

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 361
    const/4 v2, 0x0

    :goto_0
    iget v0, p0, Lo/qm;->a:I

    if-ge v2, v0, :cond_2

    .line 362
    and-int/lit8 v0, v2, 0x7

    if-nez v0, :cond_0

    .line 363
    const/16 v0, 0x20

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 365
    :cond_0
    invoke-virtual {p0, v2}, Lo/qm;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x58

    goto :goto_1

    :cond_1
    const/16 v0, 0x2e

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 361
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 367
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
