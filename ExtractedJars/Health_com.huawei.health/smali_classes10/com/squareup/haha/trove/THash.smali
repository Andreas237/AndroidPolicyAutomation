.class public abstract Lcom/squareup/haha/trove/THash;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field protected static final DEFAULT_INITIAL_CAPACITY:I = 0x4

.field protected static final DEFAULT_LOAD_FACTOR:F = 0.8f


# instance fields
.field protected transient _deadkeys:I

.field protected transient _free:I

.field protected final _loadFactor:F

.field protected _maxSize:I

.field protected transient _size:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 75
    const/4 v0, 0x4

    const v1, 0x3f4ccccd    # 0.8f

    invoke-direct {p0, v0, v1}, Lcom/squareup/haha/trove/THash;-><init>(IF)V

    .line 76
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 86
    const v0, 0x3f4ccccd    # 0.8f

    invoke-direct {p0, p1, v0}, Lcom/squareup/haha/trove/THash;-><init>(IF)V

    .line 87
    return-void
.end method

.method public constructor <init>(IF)V
    .locals 2

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    iput p2, p0, Lcom/squareup/haha/trove/THash;->_loadFactor:F

    .line 101
    int-to-float v0, p1

    div-float/2addr v0, p2

    float-to-int v0, v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/squareup/haha/trove/THash;->setUp(I)I

    .line 102
    return-void
.end method

.method private compactIfNecessary()V
    .locals 2

    .line 202
    iget v0, p0, Lcom/squareup/haha/trove/THash;->_deadkeys:I

    iget v1, p0, Lcom/squareup/haha/trove/THash;->_size:I

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/squareup/haha/trove/THash;->capacity()I

    move-result v0

    const/16 v1, 0x2a

    if-le v0, v1, :cond_0

    .line 204
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THash;->compact()V

    .line 206
    :cond_0
    return-void
.end method

.method private computeMaxSize(I)V
    .locals 3

    .line 264
    add-int/lit8 v0, p1, -0x1

    int-to-float v1, p1

    iget v2, p0, Lcom/squareup/haha/trove/THash;->_loadFactor:F

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/squareup/haha/trove/THash;->_maxSize:I

    .line 265
    iget v0, p0, Lcom/squareup/haha/trove/THash;->_size:I

    sub-int v0, p1, v0

    iput v0, p0, Lcom/squareup/haha/trove/THash;->_free:I

    .line 266
    const/4 v0, 0x0

    iput v0, p0, Lcom/squareup/haha/trove/THash;->_deadkeys:I

    .line 267
    return-void
.end method


# virtual methods
.method protected calculateGrownCapacity()I
    .locals 2

    .line 289
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THash;->capacity()I

    move-result v0

    shl-int/lit8 v0, v0, 0x1

    return v0
.end method

.method protected abstract capacity()I
.end method

.method public clear()V
    .locals 1

    .line 231
    const/4 v0, 0x0

    iput v0, p0, Lcom/squareup/haha/trove/THash;->_size:I

    .line 232
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THash;->capacity()I

    move-result v0

    iput v0, p0, Lcom/squareup/haha/trove/THash;->_free:I

    .line 233
    const/4 v0, 0x0

    iput v0, p0, Lcom/squareup/haha/trove/THash;->_deadkeys:I

    .line 234
    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    .line 107
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 108
    .line 109
    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public compact()V
    .locals 2

    .line 171
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THash;->size()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/squareup/haha/trove/THash;->_loadFactor:F

    div-float/2addr v0, v1

    float-to-int v0, v0

    add-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lcom/squareup/haha/trove/PrimeFinder;->nextPrime(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/squareup/haha/trove/THash;->rehash(I)V

    .line 172
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THash;->capacity()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/squareup/haha/trove/THash;->computeMaxSize(I)V

    .line 173
    return-void
.end method

.method public ensureCapacity(I)V
    .locals 3

    .line 145
    iget v0, p0, Lcom/squareup/haha/trove/THash;->_maxSize:I

    invoke-virtual {p0}, Lcom/squareup/haha/trove/THash;->size()I

    move-result v1

    sub-int/2addr v0, v1

    if-le p1, v0, :cond_0

    .line 146
    int-to-float v0, p1

    invoke-virtual {p0}, Lcom/squareup/haha/trove/THash;->size()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/squareup/haha/trove/THash;->_loadFactor:F

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-int v0, v0

    add-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lcom/squareup/haha/trove/PrimeFinder;->nextPrime(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/squareup/haha/trove/THash;->rehash(I)V

    .line 148
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THash;->capacity()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/squareup/haha/trove/THash;->computeMaxSize(I)V

    .line 150
    :cond_0
    return-void
.end method

.method public isEmpty()Z
    .locals 1

    .line 119
    iget v0, p0, Lcom/squareup/haha/trove/THash;->_size:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected final postInsertHook(Z)V
    .locals 2

    .line 274
    if-eqz p1, :cond_0

    .line 275
    iget v0, p0, Lcom/squareup/haha/trove/THash;->_free:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/squareup/haha/trove/THash;->_free:I

    goto :goto_0

    .line 278
    :cond_0
    iget v0, p0, Lcom/squareup/haha/trove/THash;->_deadkeys:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/squareup/haha/trove/THash;->_deadkeys:I

    .line 282
    :goto_0
    iget v0, p0, Lcom/squareup/haha/trove/THash;->_size:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/squareup/haha/trove/THash;->_size:I

    iget v1, p0, Lcom/squareup/haha/trove/THash;->_maxSize:I

    if-gt v0, v1, :cond_1

    iget v0, p0, Lcom/squareup/haha/trove/THash;->_free:I

    if-nez v0, :cond_2

    .line 283
    :cond_1
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THash;->calculateGrownCapacity()I

    move-result v0

    invoke-static {v0}, Lcom/squareup/haha/trove/PrimeFinder;->nextPrime(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/squareup/haha/trove/THash;->rehash(I)V

    .line 284
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THash;->capacity()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/squareup/haha/trove/THash;->computeMaxSize(I)V

    .line 286
    :cond_2
    return-void
.end method

.method protected abstract rehash(I)V
.end method

.method protected removeAt(I)V
    .locals 2

    .line 195
    iget v0, p0, Lcom/squareup/haha/trove/THash;->_size:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/squareup/haha/trove/THash;->_size:I

    .line 196
    iget v0, p0, Lcom/squareup/haha/trove/THash;->_deadkeys:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/squareup/haha/trove/THash;->_deadkeys:I

    .line 198
    invoke-direct {p0}, Lcom/squareup/haha/trove/THash;->compactIfNecessary()V

    .line 199
    return-void
.end method

.method protected setUp(I)I
    .locals 1

    .line 244
    invoke-static {p1}, Lcom/squareup/haha/trove/PrimeFinder;->nextPrime(I)I

    move-result v0

    .line 245
    invoke-direct {p0, v0}, Lcom/squareup/haha/trove/THash;->computeMaxSize(I)V

    .line 246
    return v0
.end method

.method public size()I
    .locals 1

    .line 128
    iget v0, p0, Lcom/squareup/haha/trove/THash;->_size:I

    return v0
.end method

.method public final startCompactingOnRemove(Z)V
    .locals 2

    .line 217
    iget v0, p0, Lcom/squareup/haha/trove/THash;->_deadkeys:I

    if-ltz v0, :cond_0

    .line 218
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unpaired stop/startCompactingOnRemove"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :cond_0
    iget v0, p0, Lcom/squareup/haha/trove/THash;->_deadkeys:I

    invoke-virtual {p0}, Lcom/squareup/haha/trove/THash;->capacity()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/squareup/haha/trove/THash;->_deadkeys:I

    .line 222
    if-eqz p1, :cond_1

    .line 223
    invoke-direct {p0}, Lcom/squareup/haha/trove/THash;->compactIfNecessary()V

    .line 225
    :cond_1
    return-void
.end method

.method public final stopCompactingOnRemove()V
    .locals 2

    .line 209
    iget v0, p0, Lcom/squareup/haha/trove/THash;->_deadkeys:I

    if-gez v0, :cond_0

    .line 210
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unpaired stop/startCompactingOnRemove"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 213
    :cond_0
    iget v0, p0, Lcom/squareup/haha/trove/THash;->_deadkeys:I

    invoke-virtual {p0}, Lcom/squareup/haha/trove/THash;->capacity()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/squareup/haha/trove/THash;->_deadkeys:I

    .line 214
    return-void
.end method

.method public final trimToSize()V
    .locals 0

    .line 185
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THash;->compact()V

    .line 186
    return-void
.end method
