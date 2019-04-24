.class public Lcom/shopkick/sdk/scanner/Percentile;
.super Ljava/lang/Object;
.source "Percentile.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field static final serialVersionUID:J = -0x7049c6862ae14530L


# instance fields
.field private quantile:D


# direct methods
.method public constructor <init>()V
    .locals 2

    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    .line 86
    invoke-direct {p0, v0, v1}, Lcom/shopkick/sdk/scanner/Percentile;-><init>(D)V

    return-void
.end method

.method public constructor <init>(D)V
    .locals 2

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 79
    iput-wide v0, p0, Lcom/shopkick/sdk/scanner/Percentile;->quantile:D

    .line 97
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/sdk/scanner/Percentile;->setQuantile(D)V

    return-void
.end method

.method private evaluateSorted([DD)D
    .locals 7

    .line 215
    array-length v0, p1

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double v4, v0, v2

    mul-double/2addr p2, v4

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    div-double/2addr p2, v4

    .line 217
    invoke-static {p2, p3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-int v6, v4

    sub-double v4, p2, v4

    cmpg-double v2, p2, v2

    if-gez v2, :cond_0

    const/4 p2, 0x0

    .line 222
    aget-wide p2, p1, p2

    return-wide p2

    :cond_0
    cmpl-double p2, p2, v0

    if-ltz p2, :cond_1

    .line 225
    array-length p2, p1

    add-int/lit8 p2, p2, -0x1

    aget-wide p2, p1, p2

    return-wide p2

    :cond_1
    add-int/lit8 p2, v6, -0x1

    .line 227
    aget-wide p2, p1, p2

    .line 228
    aget-wide v0, p1, v6

    sub-double/2addr v0, p2

    mul-double/2addr v4, v0

    add-double/2addr p2, v4

    return-wide p2
.end method

.method private test([DII)V
    .locals 1

    if-ltz p2, :cond_0

    .line 101
    array-length v0, p1

    if-gt p2, v0, :cond_0

    if-lt p3, p2, :cond_0

    array-length p1, p1

    if-gt p3, p1, :cond_0

    return-void

    .line 102
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "This is not a valid subrange"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public evaluate(Ljava/util/List;I)D
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;I)D"
        }
    .end annotation

    const/16 v0, 0x64

    if-gt p2, v0, :cond_3

    if-lez p2, :cond_3

    .line 237
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const-wide/high16 p1, 0x7ff8000000000000L    # Double.NaN

    return-wide p1

    .line 240
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    .line 241
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    return-wide p1

    .line 246
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [D

    .line 247
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 248
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 250
    :cond_2
    invoke-static {v0}, Ljava/util/Arrays;->sort([D)V

    int-to-double p1, p2

    .line 252
    invoke-direct {p0, v0, p1, p2}, Lcom/shopkick/sdk/scanner/Percentile;->evaluateSorted([DD)D

    move-result-wide p1

    return-wide p1

    .line 234
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "invalid quantile value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public evaluate([DD)D
    .locals 7

    const/4 v0, 0x0

    .line 131
    invoke-direct {p0, p1, v0, v0}, Lcom/shopkick/sdk/scanner/Percentile;->test([DII)V

    .line 132
    array-length v4, p1

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move-wide v5, p2

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/sdk/scanner/Percentile;->evaluate([DIID)D

    move-result-wide p1

    return-wide p1
.end method

.method public evaluate([DII)D
    .locals 6

    .line 159
    iget-wide v4, p0, Lcom/shopkick/sdk/scanner/Percentile;->quantile:D

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/sdk/scanner/Percentile;->evaluate([DIID)D

    move-result-wide p1

    return-wide p1
.end method

.method public evaluate([DIID)D
    .locals 2

    .line 194
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/sdk/scanner/Percentile;->test([DII)V

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    cmpl-double v0, p4, v0

    if-gtz v0, :cond_2

    const-wide/16 v0, 0x0

    cmpg-double v0, p4, v0

    if-lez v0, :cond_2

    if-nez p3, :cond_0

    const-wide/high16 p1, 0x7ff8000000000000L    # Double.NaN

    return-wide p1

    :cond_0
    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    .line 203
    aget-wide p2, p1, p2

    return-wide p2

    .line 207
    :cond_1
    new-array v0, p3, [D

    const/4 v1, 0x0

    .line 208
    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 209
    invoke-static {v0}, Ljava/util/Arrays;->sort([D)V

    .line 211
    invoke-direct {p0, v0, p4, p5}, Lcom/shopkick/sdk/scanner/Percentile;->evaluateSorted([DD)D

    move-result-wide p1

    return-wide p1

    .line 197
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "invalid quantile value: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4, p5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getQuantile()D
    .locals 2

    .line 263
    iget-wide v0, p0, Lcom/shopkick/sdk/scanner/Percentile;->quantile:D

    return-wide v0
.end method

.method public setQuantile(D)V
    .locals 3

    const-wide/16 v0, 0x0

    cmpg-double v0, p1, v0

    if-lez v0, :cond_0

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    cmpl-double v0, p1, v0

    if-gtz v0, :cond_0

    .line 278
    iput-wide p1, p0, Lcom/shopkick/sdk/scanner/Percentile;->quantile:D

    return-void

    .line 276
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal quantile value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
