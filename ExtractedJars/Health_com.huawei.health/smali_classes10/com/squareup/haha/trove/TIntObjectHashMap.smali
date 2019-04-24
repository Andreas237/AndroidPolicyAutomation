.class public Lcom/squareup/haha/trove/TIntObjectHashMap;
.super Lcom/squareup/haha/trove/THash;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/trove/TIntHashingStrategy;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/haha/trove/TIntObjectHashMap$EqProcedure;,
        Lcom/squareup/haha/trove/TIntObjectHashMap$HashProcedure;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:Ljava/lang/Object;>Lcom/squareup/haha/trove/THash;Lcom/squareup/haha/trove/TIntHashingStrategy;"
    }
.end annotation


# instance fields
.field protected final _hashingStrategy:Lcom/squareup/haha/trove/TIntHashingStrategy;

.field private transient _set:[I

.field private transient _values:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TV;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/squareup/haha/trove/THash;-><init>()V

    .line 48
    iput-object p0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_hashingStrategy:Lcom/squareup/haha/trove/TIntHashingStrategy;

    .line 49
    return-void
.end method

.method private forEachEntry(Lcom/squareup/haha/trove/TIntObjectProcedure;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/trove/TIntObjectProcedure<TV;>;)Z"
        }
    .end annotation

    .line 578
    iget-object v2, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_set:[I

    .line 579
    iget-object v3, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    .line 580
    array-length v4, v2

    :cond_0
    move v0, v4

    add-int/lit8 v4, v4, -0x1

    if-lez v0, :cond_1

    .line 581
    invoke-static {v3, v4}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isFull([Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    aget v0, v2, v4

    aget-object v1, v3, v4

    invoke-static {v1}, Lcom/squareup/haha/trove/TIntObjectHashMap;->unwrapNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/squareup/haha/trove/TIntObjectProcedure;->execute(ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 582
    const/4 v0, 0x0

    return v0

    .line 585
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private insertionIndex(I)I
    .locals 9

    .line 328
    iget-object v2, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    .line 329
    iget-object v3, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_set:[I

    .line 330
    array-length v4, v3

    .line 331
    iget-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_hashingStrategy:Lcom/squareup/haha/trove/TIntHashingStrategy;

    invoke-interface {v0, p1}, Lcom/squareup/haha/trove/TIntHashingStrategy;->computeHashCode(I)I

    move-result v0

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    .line 332
    move v5, v0

    rem-int v6, v0, v4

    .line 334
    invoke-static {v2, v6}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isFree([Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 335
    return v6

    .line 337
    :cond_0
    invoke-static {v2, v6}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isFull([Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_1

    aget v0, v3, v6

    if-ne v0, p1, :cond_1

    .line 338
    neg-int v0, v6

    add-int/lit8 v0, v0, -0x1

    return v0

    .line 343
    :cond_1
    add-int/lit8 v0, v4, -0x2

    rem-int v0, v5, v0

    add-int/lit8 v7, v0, 0x1

    .line 348
    invoke-static {v2, v6}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isRemoved([Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_2

    move v8, v6

    goto :goto_0

    :cond_2
    const/4 v8, -0x1

    .line 351
    :cond_3
    :goto_0
    sub-int v0, v6, v7

    .line 352
    move v6, v0

    if-gez v0, :cond_4

    .line 353
    add-int/2addr v6, v4

    .line 355
    :cond_4
    const/4 v0, -0x1

    if-ne v8, v0, :cond_5

    invoke-static {v2, v6}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isRemoved([Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 356
    move v8, v6

    .line 359
    :cond_5
    invoke-static {v2, v6}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isFull([Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_6

    aget v0, v3, v6

    if-ne v0, p1, :cond_3

    .line 364
    :cond_6
    invoke-static {v2, v6}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isRemoved([Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 365
    :cond_7
    :goto_1
    invoke-static {v2, v6}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isFree([Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-static {v2, v6}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isRemoved([Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_8

    aget v0, v3, v6

    if-eq v0, p1, :cond_9

    .line 367
    :cond_8
    sub-int v0, v6, v7

    .line 368
    move v6, v0

    if-gez v0, :cond_7

    .line 369
    add-int/2addr v6, v4

    goto :goto_1

    .line 374
    :cond_9
    invoke-static {v2, v6}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isFull([Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 375
    neg-int v0, v6

    add-int/lit8 v0, v0, -0x1

    return v0

    .line 378
    :cond_a
    const/4 v0, -0x1

    if-ne v8, v0, :cond_b

    return v6

    :cond_b
    return v8
.end method

.method private static isFree([Ljava/lang/Object;I)Z
    .locals 1

    .line 391
    aget-object v0, p0, p1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static isFull([Ljava/lang/Object;I)Z
    .locals 2

    .line 382
    aget-object v1, p0, p1

    .line 383
    if-eqz v1, :cond_0

    sget-object v0, Lcom/squareup/haha/trove/TObjectHash;->REMOVED:Ljava/lang/Object;

    if-eq v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static isRemoved([Ljava/lang/Object;I)Z
    .locals 2

    .line 387
    aget-object v0, p0, p1

    sget-object v1, Lcom/squareup/haha/trove/TObjectHash;->REMOVED:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static unwrapNull(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:Ljava/lang/Object;>(TV;)TV;"
        }
    .end annotation

    .line 251
    sget-object v0, Lcom/squareup/haha/trove/TObjectHash;->NULL:Lcom/squareup/haha/trove/TObjectHash$NULL;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    return-object p0
.end method


# virtual methods
.method protected capacity()I
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method

.method public clear()V
    .locals 4

    .line 263
    invoke-super {p0}, Lcom/squareup/haha/trove/THash;->clear()V

    .line 264
    iget-object v1, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_set:[I

    .line 265
    iget-object v2, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    .line 267
    array-length v3, v1

    :goto_0
    move v0, v3

    add-int/lit8 v3, v3, -0x1

    if-lez v0, :cond_0

    .line 268
    const/4 v0, 0x0

    aput v0, v1, v3

    .line 269
    const/4 v0, 0x0

    aput-object v0, v2, v3

    goto :goto_0

    .line 271
    :cond_0
    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 3

    .line 32
    .line 2117
    move-object v1, p0

    invoke-super {p0}, Lcom/squareup/haha/trove/THash;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/squareup/haha/trove/TIntObjectHashMap;

    .line 2118
    iget-object v0, v1, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    iput-object v0, v2, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    .line 32
    .line 2119
    return-object v2
.end method

.method public final computeHashCode(I)I
    .locals 1

    .line 665
    .line 2060
    move v0, p1

    .line 665
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 402
    instance-of v0, p1, Lcom/squareup/haha/trove/TIntObjectHashMap;

    if-nez v0, :cond_0

    .line 403
    const/4 v0, 0x0

    return v0

    .line 405
    :cond_0
    move-object v2, p1

    check-cast v2, Lcom/squareup/haha/trove/TIntObjectHashMap;

    .line 406
    invoke-virtual {v2}, Lcom/squareup/haha/trove/TIntObjectHashMap;->size()I

    move-result v0

    invoke-virtual {p0}, Lcom/squareup/haha/trove/TIntObjectHashMap;->size()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 407
    const/4 v0, 0x0

    return v0

    .line 409
    :cond_1
    new-instance v0, Lcom/squareup/haha/trove/TIntObjectHashMap$EqProcedure;

    invoke-direct {v0, v2}, Lcom/squareup/haha/trove/TIntObjectHashMap$EqProcedure;-><init>(Lcom/squareup/haha/trove/TIntObjectHashMap;)V

    invoke-direct {p0, v0}, Lcom/squareup/haha/trove/TIntObjectHashMap;->forEachEntry(Lcom/squareup/haha/trove/TIntObjectProcedure;)Z

    move-result v0

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .line 246
    invoke-virtual {p0, p1}, Lcom/squareup/haha/trove/TIntObjectHashMap;->index(I)I

    move-result v0

    .line 247
    move v1, v0

    if-gez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/squareup/haha/trove/TIntObjectHashMap;->unwrapNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getValues()[Ljava/lang/Object;
    .locals 6

    .line 473
    invoke-virtual {p0}, Lcom/squareup/haha/trove/TIntObjectHashMap;->size()I

    move-result v0

    new-array v2, v0, [Ljava/lang/Object;

    .line 474
    iget-object v3, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    .line 476
    array-length v4, v3

    const/4 v5, 0x0

    :cond_0
    :goto_0
    move v0, v4

    add-int/lit8 v4, v4, -0x1

    if-lez v0, :cond_1

    .line 477
    invoke-static {v3, v4}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isFull([Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 478
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-object v1, v3, v4

    invoke-static {v1}, Lcom/squareup/haha/trove/TIntObjectHashMap;->unwrapNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    aput-object v1, v2, v0

    goto :goto_0

    .line 481
    :cond_1
    return-object v2
.end method

.method public hashCode()I
    .locals 3

    .line 413
    new-instance v1, Lcom/squareup/haha/trove/TIntObjectHashMap$HashProcedure;

    invoke-direct {v1, p0}, Lcom/squareup/haha/trove/TIntObjectHashMap$HashProcedure;-><init>(Lcom/squareup/haha/trove/TIntObjectHashMap;)V

    .line 414
    invoke-direct {p0, v1}, Lcom/squareup/haha/trove/TIntObjectHashMap;->forEachEntry(Lcom/squareup/haha/trove/TIntObjectProcedure;)Z

    .line 415
    .line 1425
    move-object v2, v1

    iget v0, v1, Lcom/squareup/haha/trove/TIntObjectHashMap$HashProcedure;->h:I

    .line 415
    return v0
.end method

.method protected final index(I)I
    .locals 8

    .line 296
    iget-object v2, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_set:[I

    .line 297
    iget-object v3, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    .line 298
    array-length v4, v2

    .line 299
    iget-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_hashingStrategy:Lcom/squareup/haha/trove/TIntHashingStrategy;

    invoke-interface {v0, p1}, Lcom/squareup/haha/trove/TIntHashingStrategy;->computeHashCode(I)I

    move-result v0

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    .line 300
    move v5, v0

    rem-int v6, v0, v4

    .line 302
    invoke-static {v3, v6}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isFree([Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {v3, v6}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isRemoved([Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_0

    aget v0, v2, v6

    if-eq v0, p1, :cond_3

    .line 305
    :cond_0
    add-int/lit8 v0, v4, -0x2

    rem-int v0, v5, v0

    add-int/lit8 v7, v0, 0x1

    .line 308
    :cond_1
    sub-int v0, v6, v7

    .line 309
    move v6, v0

    if-gez v0, :cond_2

    .line 310
    add-int/2addr v6, v4

    .line 312
    :cond_2
    invoke-static {v3, v6}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isFree([Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {v3, v6}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isRemoved([Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_1

    aget v0, v2, v6

    if-ne v0, p1, :cond_1

    .line 316
    :cond_3
    invoke-static {v3, v6}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isFree([Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    return v0

    :cond_4
    return v6
.end method

.method public final keys()[I
    .locals 7

    .line 490
    invoke-virtual {p0}, Lcom/squareup/haha/trove/TIntObjectHashMap;->size()I

    move-result v0

    new-array v2, v0, [I

    .line 491
    iget-object v3, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_set:[I

    .line 492
    iget-object v4, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    .line 494
    array-length v5, v3

    const/4 v6, 0x0

    :cond_0
    :goto_0
    move v0, v5

    add-int/lit8 v5, v5, -0x1

    if-lez v0, :cond_1

    .line 495
    invoke-static {v4, v5}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isFull([Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 496
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    aget v1, v3, v5

    aput v1, v2, v0

    goto :goto_0

    .line 499
    :cond_1
    return-object v2
.end method

.method public final put(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)TV;"
        }
    .end annotation

    .line 194
    const/4 v2, 0x0

    .line 195
    const/4 v3, 0x0

    .line 196
    invoke-direct {p0, p1}, Lcom/squareup/haha/trove/TIntObjectHashMap;->insertionIndex(I)I

    move-result v4

    .line 197
    const/4 v5, 0x1

    .line 198
    if-gez v4, :cond_0

    .line 199
    neg-int v0, v4

    add-int/lit8 v4, v0, -0x1

    .line 200
    iget-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    aget-object v0, v0, v4

    invoke-static {v0}, Lcom/squareup/haha/trove/TIntObjectHashMap;->unwrapNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 201
    const/4 v5, 0x0

    goto :goto_0

    .line 204
    :cond_0
    iget-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    invoke-static {v0, v4}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isFree([Ljava/lang/Object;I)Z

    move-result v2

    .line 206
    :goto_0
    iget-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_set:[I

    aput p1, v0, v4

    .line 207
    iget-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    .line 1254
    move-object v6, p2

    if-nez p2, :cond_1

    sget-object v1, Lcom/squareup/haha/trove/TObjectHash;->NULL:Lcom/squareup/haha/trove/TObjectHash$NULL;

    goto :goto_1

    :cond_1
    move-object v1, v6

    .line 207
    :goto_1
    aput-object v1, v0, v4

    .line 208
    if-eqz v5, :cond_2

    .line 209
    invoke-virtual {p0, v2}, Lcom/squareup/haha/trove/TIntObjectHashMap;->postInsertHook(Z)V

    .line 212
    :cond_2
    return-object v3
.end method

.method protected rehash(I)V
    .locals 8

    .line 222
    iget-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_set:[I

    array-length v2, v0

    .line 223
    iget-object v3, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_set:[I

    .line 224
    iget-object v4, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    .line 226
    new-array v0, p1, [I

    iput-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_set:[I

    .line 227
    new-array v0, p1, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    .line 229
    move v5, v2

    :cond_0
    :goto_0
    move v0, v5

    add-int/lit8 v5, v5, -0x1

    if-lez v0, :cond_1

    .line 230
    invoke-static {v4, v5}, Lcom/squareup/haha/trove/TIntObjectHashMap;->isFull([Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 231
    aget v6, v3, v5

    .line 232
    invoke-direct {p0, v6}, Lcom/squareup/haha/trove/TIntObjectHashMap;->insertionIndex(I)I

    move-result v7

    .line 233
    iget-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_set:[I

    aput v6, v0, v7

    .line 234
    iget-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    aget-object v1, v4, v5

    aput-object v1, v0, v7

    .line 235
    goto :goto_0

    .line 237
    :cond_1
    return-void
.end method

.method protected removeAt(I)V
    .locals 2

    .line 463
    iget-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    sget-object v1, Lcom/squareup/haha/trove/TObjectHash;->REMOVED:Ljava/lang/Object;

    aput-object v1, v0, p1

    .line 464
    invoke-super {p0, p1}, Lcom/squareup/haha/trove/THash;->removeAt(I)V

    .line 465
    return-void
.end method

.method protected setUp(I)I
    .locals 2

    .line 138
    invoke-super {p0, p1}, Lcom/squareup/haha/trove/THash;->setUp(I)I

    move-result v1

    .line 139
    new-array v0, v1, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_values:[Ljava/lang/Object;

    .line 140
    new-array v0, v1, [I

    iput-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap;->_set:[I

    .line 142
    return v1
.end method
