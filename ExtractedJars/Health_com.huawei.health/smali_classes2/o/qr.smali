.class public final Lo/qr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private final a:I

.field private final b:I

.field private final d:[I

.field private final e:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p1}, Lo/qr;-><init>(II)V

    .line 46
    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    const/4 v0, 0x1

    if-ge p2, v0, :cond_1

    .line 50
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Both dimensions must be greater than 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 52
    :cond_1
    iput p1, p0, Lo/qr;->b:I

    .line 53
    iput p2, p0, Lo/qr;->a:I

    .line 54
    add-int/lit8 v0, p1, 0x1f

    div-int/lit8 v0, v0, 0x20

    iput v0, p0, Lo/qr;->e:I

    .line 55
    iget v0, p0, Lo/qr;->e:I

    mul-int/2addr v0, p2

    new-array v0, v0, [I

    iput-object v0, p0, Lo/qr;->d:[I

    .line 56
    return-void
.end method

.method private constructor <init>(III[I)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput p1, p0, Lo/qr;->b:I

    .line 60
    iput p2, p0, Lo/qr;->a:I

    .line 61
    iput p3, p0, Lo/qr;->e:I

    .line 62
    iput-object p4, p0, Lo/qr;->d:[I

    .line 63
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 371
    iget v0, p0, Lo/qr;->b:I

    return v0
.end method

.method public a(II)V
    .locals 5

    .line 141
    iget v0, p0, Lo/qr;->e:I

    mul-int/2addr v0, p2

    div-int/lit8 v1, p1, 0x20

    add-int v4, v0, v1

    .line 142
    iget-object v0, p0, Lo/qr;->d:[I

    aget v1, v0, v4

    and-int/lit8 v2, p1, 0x1f

    const/4 v3, 0x1

    shl-int v2, v3, v2

    or-int/2addr v1, v2

    aput v1, v0, v4

    .line 143
    return-void
.end method

.method public b()[I
    .locals 10

    .line 273
    iget v2, p0, Lo/qr;->b:I

    .line 274
    iget v3, p0, Lo/qr;->a:I

    .line 275
    const/4 v4, -0x1

    .line 276
    const/4 v5, -0x1

    .line 278
    const/4 v6, 0x0

    :goto_0
    iget v0, p0, Lo/qr;->a:I

    if-ge v6, v0, :cond_7

    .line 279
    const/4 v7, 0x0

    :goto_1
    iget v0, p0, Lo/qr;->e:I

    if-ge v7, v0, :cond_6

    .line 280
    iget-object v0, p0, Lo/qr;->d:[I

    iget v1, p0, Lo/qr;->e:I

    mul-int/2addr v1, v6

    add-int/2addr v1, v7

    aget v8, v0, v1

    .line 281
    if-eqz v8, :cond_5

    .line 282
    if-ge v6, v3, :cond_0

    .line 283
    move v3, v6

    .line 285
    :cond_0
    if-le v6, v5, :cond_1

    .line 286
    move v5, v6

    .line 288
    :cond_1
    mul-int/lit8 v0, v7, 0x20

    if-ge v0, v2, :cond_3

    .line 289
    const/4 v9, 0x0

    .line 290
    :goto_2
    rsub-int/lit8 v0, v9, 0x1f

    shl-int v0, v8, v0

    if-nez v0, :cond_2

    .line 291
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 293
    :cond_2
    mul-int/lit8 v0, v7, 0x20

    add-int/2addr v0, v9

    if-ge v0, v2, :cond_3

    .line 294
    mul-int/lit8 v0, v7, 0x20

    add-int v2, v0, v9

    .line 297
    :cond_3
    mul-int/lit8 v0, v7, 0x20

    add-int/lit8 v0, v0, 0x1f

    if-le v0, v4, :cond_5

    .line 298
    const/16 v9, 0x1f

    .line 299
    :goto_3
    ushr-int v0, v8, v9

    if-nez v0, :cond_4

    .line 300
    add-int/lit8 v9, v9, -0x1

    goto :goto_3

    .line 302
    :cond_4
    mul-int/lit8 v0, v7, 0x20

    add-int/2addr v0, v9

    if-le v0, v4, :cond_5

    .line 303
    mul-int/lit8 v0, v7, 0x20

    add-int v4, v0, v9

    .line 279
    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_1

    .line 278
    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 310
    :cond_7
    sub-int v6, v4, v2

    .line 311
    sub-int v7, v5, v3

    .line 313
    if-ltz v6, :cond_8

    if-gez v7, :cond_9

    .line 314
    :cond_8
    const/4 v0, 0x0

    return-object v0

    .line 317
    :cond_9
    const/4 v0, 0x4

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput v2, v0, v1

    const/4 v1, 0x1

    aput v3, v0, v1

    const/4 v1, 0x2

    aput v6, v0, v1

    const/4 v1, 0x3

    aput v7, v0, v1

    return-object v0
.end method

.method public c(IIII)V
    .locals 10

    .line 201
    if-ltz p2, :cond_0

    if-gez p1, :cond_1

    .line 202
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Left and top must be nonnegative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 204
    :cond_1
    const/4 v0, 0x1

    if-lt p4, v0, :cond_2

    const/4 v0, 0x1

    if-ge p3, v0, :cond_3

    .line 205
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Height and width must be at least 1"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 207
    :cond_3
    add-int v5, p1, p3

    .line 208
    add-int v6, p2, p4

    .line 209
    iget v0, p0, Lo/qr;->a:I

    if-gt v6, v0, :cond_4

    iget v0, p0, Lo/qr;->b:I

    if-le v5, v0, :cond_5

    .line 210
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The region must fit inside the matrix"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 212
    :cond_5
    move v7, p2

    :goto_0
    if-ge v7, v6, :cond_7

    .line 213
    iget v0, p0, Lo/qr;->e:I

    mul-int v8, v7, v0

    .line 214
    move v9, p1

    :goto_1
    if-ge v9, v5, :cond_6

    .line 215
    iget-object v0, p0, Lo/qr;->d:[I

    div-int/lit8 v1, v9, 0x20

    add-int/2addr v1, v8

    aget v2, v0, v1

    and-int/lit8 v3, v9, 0x1f

    const/4 v4, 0x1

    shl-int v3, v4, v3

    or-int/2addr v2, v3

    aput v2, v0, v1

    .line 214
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 212
    :cond_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 218
    :cond_7
    return-void
.end method

.method public c(ILo/qm;)V
    .locals 5

    .line 246
    invoke-virtual {p2}, Lo/qm;->e()[I

    move-result-object v0

    iget-object v1, p0, Lo/qr;->d:[I

    iget v2, p0, Lo/qr;->e:I

    mul-int/2addr v2, p1

    iget v3, p0, Lo/qr;->e:I

    const/4 v4, 0x0

    invoke-static {v0, v4, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 247
    return-void
.end method

.method public c()[I
    .locals 7

    .line 346
    iget-object v0, p0, Lo/qr;->d:[I

    array-length v0, v0

    add-int/lit8 v2, v0, -0x1

    .line 347
    :goto_0
    if-ltz v2, :cond_0

    iget-object v0, p0, Lo/qr;->d:[I

    aget v0, v0, v2

    if-nez v0, :cond_0

    .line 348
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 350
    :cond_0
    if-gez v2, :cond_1

    .line 351
    const/4 v0, 0x0

    return-object v0

    .line 354
    :cond_1
    iget v0, p0, Lo/qr;->e:I

    div-int v3, v2, v0

    .line 355
    iget v0, p0, Lo/qr;->e:I

    rem-int v0, v2, v0

    mul-int/lit8 v4, v0, 0x20

    .line 357
    iget-object v0, p0, Lo/qr;->d:[I

    aget v5, v0, v2

    .line 358
    const/16 v6, 0x1f

    .line 359
    :goto_1
    ushr-int v0, v5, v6

    if-nez v0, :cond_2

    .line 360
    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    .line 362
    :cond_2
    add-int/2addr v4, v6

    .line 364
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput v4, v0, v1

    const/4 v1, 0x1

    aput v3, v0, v1

    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 36
    invoke-virtual {p0}, Lo/qr;->g()Lo/qr;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 422
    const-string v0, "\n"

    invoke-virtual {p0, p1, p2, v0}, Lo/qr;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(ILo/qm;)Lo/qm;
    .locals 5

    .line 229
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lo/qm;->d()I

    move-result v0

    iget v1, p0, Lo/qr;->b:I

    if-ge v0, v1, :cond_1

    .line 230
    :cond_0
    new-instance p2, Lo/qm;

    iget v0, p0, Lo/qr;->b:I

    invoke-direct {p2, v0}, Lo/qm;-><init>(I)V

    goto :goto_0

    .line 232
    :cond_1
    invoke-virtual {p2}, Lo/qm;->c()V

    .line 234
    :goto_0
    iget v0, p0, Lo/qr;->e:I

    mul-int v3, p1, v0

    .line 235
    const/4 v4, 0x0

    :goto_1
    iget v0, p0, Lo/qr;->e:I

    if-ge v4, v0, :cond_2

    .line 236
    mul-int/lit8 v0, v4, 0x20

    iget-object v1, p0, Lo/qr;->d:[I

    add-int v2, v3, v4

    aget v1, v1, v2

    invoke-virtual {p2, v0, v1}, Lo/qm;->d(II)V

    .line 235
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 238
    :cond_2
    return-object p2
.end method

.method public d(II)V
    .locals 5

    .line 157
    iget v0, p0, Lo/qr;->e:I

    mul-int/2addr v0, p2

    div-int/lit8 v1, p1, 0x20

    add-int v4, v0, v1

    .line 158
    iget-object v0, p0, Lo/qr;->d:[I

    aget v1, v0, v4

    and-int/lit8 v2, p1, 0x1f

    const/4 v3, 0x1

    shl-int v2, v3, v2

    xor-int/2addr v1, v2

    aput v1, v0, v4

    .line 159
    return-void
.end method

.method public d()[I
    .locals 7

    .line 326
    const/4 v2, 0x0

    .line 327
    :goto_0
    iget-object v0, p0, Lo/qr;->d:[I

    array-length v0, v0

    if-ge v2, v0, :cond_0

    iget-object v0, p0, Lo/qr;->d:[I

    aget v0, v0, v2

    if-nez v0, :cond_0

    .line 328
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 330
    :cond_0
    iget-object v0, p0, Lo/qr;->d:[I

    array-length v0, v0

    if-ne v2, v0, :cond_1

    .line 331
    const/4 v0, 0x0

    return-object v0

    .line 333
    :cond_1
    iget v0, p0, Lo/qr;->e:I

    div-int v3, v2, v0

    .line 334
    iget v0, p0, Lo/qr;->e:I

    rem-int v0, v2, v0

    mul-int/lit8 v4, v0, 0x20

    .line 336
    iget-object v0, p0, Lo/qr;->d:[I

    aget v5, v0, v2

    .line 337
    const/4 v6, 0x0

    .line 338
    :goto_1
    rsub-int/lit8 v0, v6, 0x1f

    shl-int v0, v5, v0

    if-nez v0, :cond_2

    .line 339
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 341
    :cond_2
    add-int/2addr v4, v6

    .line 342
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput v4, v0, v1

    const/4 v1, 0x1

    aput v3, v0, v1

    return-object v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 434
    new-instance v3, Ljava/lang/StringBuilder;

    iget v0, p0, Lo/qr;->a:I

    iget v1, p0, Lo/qr;->b:I

    add-int/lit8 v1, v1, 0x1

    mul-int/2addr v0, v1

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 435
    const/4 v4, 0x0

    :goto_0
    iget v0, p0, Lo/qr;->a:I

    if-ge v4, v0, :cond_2

    .line 436
    const/4 v5, 0x0

    :goto_1
    iget v0, p0, Lo/qr;->b:I

    if-ge v5, v0, :cond_1

    .line 437
    invoke-virtual {p0, v5, v4}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    goto :goto_2

    :cond_0
    move-object v0, p2

    :goto_2
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 439
    :cond_1
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 441
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 7

    .line 253
    invoke-virtual {p0}, Lo/qr;->a()I

    move-result v2

    .line 254
    invoke-virtual {p0}, Lo/qr;->h()I

    move-result v3

    .line 255
    new-instance v4, Lo/qm;

    invoke-direct {v4, v2}, Lo/qm;-><init>(I)V

    .line 256
    new-instance v5, Lo/qm;

    invoke-direct {v5, v2}, Lo/qm;-><init>(I)V

    .line 257
    const/4 v6, 0x0

    :goto_0
    add-int/lit8 v0, v3, 0x1

    div-int/lit8 v0, v0, 0x2

    if-ge v6, v0, :cond_0

    .line 258
    invoke-virtual {p0, v6, v4}, Lo/qr;->d(ILo/qm;)Lo/qm;

    move-result-object v4

    .line 259
    add-int/lit8 v0, v3, -0x1

    sub-int/2addr v0, v6

    invoke-virtual {p0, v0, v5}, Lo/qr;->d(ILo/qm;)Lo/qm;

    move-result-object v5

    .line 260
    invoke-virtual {v4}, Lo/qm;->a()V

    .line 261
    invoke-virtual {v5}, Lo/qm;->a()V

    .line 262
    invoke-virtual {p0, v6, v5}, Lo/qr;->c(ILo/qm;)V

    .line 263
    add-int/lit8 v0, v3, -0x1

    sub-int/2addr v0, v6

    invoke-virtual {p0, v0, v4}, Lo/qr;->c(ILo/qm;)V

    .line 257
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 265
    :cond_0
    return-void
.end method

.method public e(II)Z
    .locals 3

    .line 130
    iget v0, p0, Lo/qr;->e:I

    mul-int/2addr v0, p2

    div-int/lit8 v1, p1, 0x20

    add-int v2, v0, v1

    .line 131
    iget-object v0, p0, Lo/qr;->d:[I

    aget v0, v0, v2

    and-int/lit8 v1, p1, 0x1f

    ushr-int/2addr v0, v1

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 390
    instance-of v0, p1, Lo/qr;

    if-nez v0, :cond_0

    .line 391
    const/4 v0, 0x0

    return v0

    .line 393
    :cond_0
    move-object v2, p1

    check-cast v2, Lo/qr;

    .line 394
    iget v0, p0, Lo/qr;->b:I

    iget v1, v2, Lo/qr;->b:I

    if-ne v0, v1, :cond_1

    iget v0, p0, Lo/qr;->a:I

    iget v1, v2, Lo/qr;->a:I

    if-ne v0, v1, :cond_1

    iget v0, p0, Lo/qr;->e:I

    iget v1, v2, Lo/qr;->e:I

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lo/qr;->d:[I

    iget-object v1, v2, Lo/qr;->d:[I

    .line 395
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

.method public g()Lo/qr;
    .locals 5

    .line 446
    new-instance v0, Lo/qr;

    iget v1, p0, Lo/qr;->b:I

    iget v2, p0, Lo/qr;->a:I

    iget v3, p0, Lo/qr;->e:I

    iget-object v4, p0, Lo/qr;->d:[I

    invoke-virtual {v4}, [I->clone()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [I

    invoke-direct {v0, v1, v2, v3, v4}, Lo/qr;-><init>(III[I)V

    return-object v0
.end method

.method public h()I
    .locals 1

    .line 378
    iget v0, p0, Lo/qr;->a:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 400
    iget v2, p0, Lo/qr;->b:I

    .line 401
    mul-int/lit8 v0, v2, 0x1f

    iget v1, p0, Lo/qr;->b:I

    add-int v2, v0, v1

    .line 402
    mul-int/lit8 v0, v2, 0x1f

    iget v1, p0, Lo/qr;->a:I

    add-int v2, v0, v1

    .line 403
    mul-int/lit8 v0, v2, 0x1f

    iget v1, p0, Lo/qr;->e:I

    add-int v2, v0, v1

    .line 404
    mul-int/lit8 v0, v2, 0x1f

    iget-object v1, p0, Lo/qr;->d:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int v2, v0, v1

    .line 405
    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 413
    const-string v0, "X "

    const-string v1, "  "

    invoke-virtual {p0, v0, v1}, Lo/qr;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
