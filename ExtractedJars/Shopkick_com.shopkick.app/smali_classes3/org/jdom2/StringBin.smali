.class final Lorg/jdom2/StringBin;
.super Ljava/lang/Object;
.source "StringBin.java"


# static fields
.field private static final DEFAULTCAP:I = 0x3ff

.field private static final GROW:I = 0x4

.field private static final MAXBUCKET:I = 0x40


# instance fields
.field private buckets:[[Ljava/lang/String;

.field private lengths:[I

.field private mask:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x3ff

    .line 124
    invoke-direct {p0, v0}, Lorg/jdom2/StringBin;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 118
    iput v0, p0, Lorg/jdom2/StringBin;->mask:I

    if-ltz p1, :cond_2

    add-int/lit8 p1, p1, -0x1

    const/16 v1, 0x3ff

    if-ge p1, v1, :cond_0

    move p1, v1

    .line 140
    :cond_0
    div-int/lit8 p1, p1, 0x3

    :goto_0
    if-eqz p1, :cond_1

    ushr-int/lit8 p1, p1, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    shl-int v0, p1, v0

    sub-int/2addr v0, p1

    .line 146
    iput v0, p0, Lorg/jdom2/StringBin;->mask:I

    .line 147
    iget v0, p0, Lorg/jdom2/StringBin;->mask:I

    add-int/2addr v0, p1

    new-array p1, v0, [[Ljava/lang/String;

    iput-object p1, p0, Lorg/jdom2/StringBin;->buckets:[[Ljava/lang/String;

    .line 148
    iget-object p1, p0, Lorg/jdom2/StringBin;->buckets:[[Ljava/lang/String;

    array-length p1, p1

    new-array p1, p1, [I

    iput-object p1, p0, Lorg/jdom2/StringBin;->lengths:[I

    return-void

    .line 133
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can not have a negative capacity"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static final compact(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 374
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method private final locate(ILjava/lang/String;[Ljava/lang/String;I)I
    .locals 3

    add-int/lit8 p4, p4, -0x1

    const/4 v0, 0x0

    :goto_0
    if-gt v0, p4, :cond_9

    add-int v1, v0, p4

    ushr-int/lit8 v1, v1, 0x1

    .line 167
    aget-object v2, p3, v1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    if-le v2, p1, :cond_0

    add-int/lit8 p4, v1, -0x1

    goto :goto_0

    .line 169
    :cond_0
    aget-object v2, p3, v1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    if-ge v2, p1, :cond_1

    add-int/lit8 v0, v1, 0x1

    goto :goto_0

    .line 174
    :cond_1
    aget-object v2, p3, v1

    invoke-virtual {p2, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    if-gez v2, :cond_6

    :cond_3
    add-int/lit8 v1, v1, -0x1

    if-lt v1, v0, :cond_5

    .line 181
    aget-object p4, p3, v1

    invoke-virtual {p4}, Ljava/lang/String;->hashCode()I

    move-result p4

    if-ne p4, p1, :cond_5

    .line 184
    aget-object p4, p3, v1

    invoke-virtual {p2, p4}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p4

    if-nez p4, :cond_4

    return v1

    :cond_4
    if-lez p4, :cond_3

    add-int/lit8 v1, v1, 0x1

    neg-int p1, v1

    add-int/lit8 p1, p1, -0x1

    return p1

    :cond_5
    add-int/lit8 v1, v1, 0x1

    neg-int p1, v1

    add-int/lit8 p1, p1, -0x1

    return p1

    :cond_6
    add-int/lit8 v1, v1, 0x1

    if-gt v1, p4, :cond_8

    .line 204
    aget-object v0, p3, v1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    if-ne v0, p1, :cond_8

    .line 206
    aget-object v0, p3, v1

    invoke-virtual {p2, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_7

    return v1

    :cond_7
    if-gez v0, :cond_6

    neg-int p1, v1

    add-int/lit8 p1, p1, -0x1

    return p1

    :cond_8
    neg-int p1, v1

    add-int/lit8 p1, p1, -0x1

    return p1

    :cond_9
    neg-int p1, v0

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method private rehash()V
    .locals 13

    .line 329
    iget-object v0, p0, Lorg/jdom2/StringBin;->buckets:[[Ljava/lang/String;

    .line 331
    iget v1, p0, Lorg/jdom2/StringBin;->mask:I

    add-int/lit8 v1, v1, 0x1

    shl-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lorg/jdom2/StringBin;->mask:I

    .line 332
    iget v1, p0, Lorg/jdom2/StringBin;->mask:I

    add-int/lit8 v1, v1, 0x1

    new-array v1, v1, [[Ljava/lang/String;

    iput-object v1, p0, Lorg/jdom2/StringBin;->buckets:[[Ljava/lang/String;

    .line 333
    iget-object v1, p0, Lorg/jdom2/StringBin;->buckets:[[Ljava/lang/String;

    array-length v1, v1

    new-array v1, v1, [I

    iput-object v1, p0, Lorg/jdom2/StringBin;->lengths:[I

    .line 335
    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_5

    aget-object v4, v0, v3

    if-nez v4, :cond_0

    goto :goto_3

    .line 340
    :cond_0
    array-length v5, v4

    move v6, v2

    :goto_1
    if-ge v6, v5, :cond_4

    aget-object v7, v4, v6

    if-nez v7, :cond_1

    goto :goto_3

    .line 345
    :cond_1
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    ushr-int/lit8 v9, v8, 0x10

    xor-int/2addr v8, v9

    .line 346
    iget v9, p0, Lorg/jdom2/StringBin;->mask:I

    and-int/2addr v8, v9

    .line 347
    iget-object v9, p0, Lorg/jdom2/StringBin;->lengths:[I

    aget v10, v9, v8

    if-nez v10, :cond_2

    .line 349
    iget-object v9, p0, Lorg/jdom2/StringBin;->buckets:[[Ljava/lang/String;

    array-length v10, v4

    add-int/lit8 v10, v10, 0x4

    div-int/lit8 v10, v10, 0x4

    new-array v10, v10, [Ljava/lang/String;

    aput-object v10, v9, v8

    .line 350
    aget-object v9, v9, v8

    aput-object v7, v9, v2

    goto :goto_2

    .line 352
    :cond_2
    iget-object v11, p0, Lorg/jdom2/StringBin;->buckets:[[Ljava/lang/String;

    aget-object v12, v11, v8

    array-length v12, v12

    if-ne v12, v10, :cond_3

    .line 353
    aget-object v12, v11, v8

    aget v9, v9, v8

    add-int/lit8 v9, v9, 0x4

    invoke-static {v12, v9}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [Ljava/lang/String;

    aput-object v9, v11, v8

    .line 356
    :cond_3
    iget-object v9, p0, Lorg/jdom2/StringBin;->buckets:[[Ljava/lang/String;

    aget-object v9, v9, v8

    aput-object v7, v9, v10

    .line 358
    :goto_2
    iget-object v7, p0, Lorg/jdom2/StringBin;->lengths:[I

    aget v9, v7, v8

    add-int/lit8 v9, v9, 0x1

    aput v9, v7, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method


# virtual methods
.method public reuse(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 242
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    ushr-int/lit8 v1, v0, 0x10

    xor-int/2addr v1, v0

    .line 273
    iget v2, p0, Lorg/jdom2/StringBin;->mask:I

    and-int/2addr v1, v2

    .line 275
    iget-object v2, p0, Lorg/jdom2/StringBin;->lengths:[I

    aget v2, v2, v1

    const/4 v3, 0x1

    if-nez v2, :cond_1

    .line 278
    invoke-static {p1}, Lorg/jdom2/StringBin;->compact(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 279
    iget-object v0, p0, Lorg/jdom2/StringBin;->buckets:[[Ljava/lang/String;

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/String;

    aput-object v2, v0, v1

    .line 280
    aget-object v0, v0, v1

    const/4 v2, 0x0

    aput-object p1, v0, v2

    .line 281
    iget-object v0, p0, Lorg/jdom2/StringBin;->lengths:[I

    aput v3, v0, v1

    return-object p1

    .line 286
    :cond_1
    iget-object v4, p0, Lorg/jdom2/StringBin;->buckets:[[Ljava/lang/String;

    aget-object v4, v4, v1

    .line 289
    invoke-direct {p0, v0, p1, v4, v2}, Lorg/jdom2/StringBin;->locate(ILjava/lang/String;[Ljava/lang/String;I)I

    move-result v0

    neg-int v0, v0

    sub-int/2addr v0, v3

    if-gez v0, :cond_2

    neg-int p1, v0

    sub-int/2addr p1, v3

    .line 292
    aget-object p1, v4, p1

    return-object p1

    :cond_2
    const/16 v5, 0x40

    if-lt v2, v5, :cond_3

    .line 296
    invoke-direct {p0}, Lorg/jdom2/StringBin;->rehash()V

    .line 297
    invoke-virtual {p0, p1}, Lorg/jdom2/StringBin;->reuse(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 299
    :cond_3
    array-length v5, v4

    if-ne v2, v5, :cond_4

    add-int/lit8 v5, v2, 0x4

    .line 301
    invoke-static {v4, v5}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/String;

    .line 302
    iget-object v5, p0, Lorg/jdom2/StringBin;->buckets:[[Ljava/lang/String;

    aput-object v4, v5, v1

    :cond_4
    add-int/lit8 v5, v0, 0x1

    sub-int/2addr v2, v0

    .line 304
    invoke-static {v4, v0, v4, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 305
    invoke-static {p1}, Lorg/jdom2/StringBin;->compact(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 306
    aput-object p1, v4, v0

    .line 307
    iget-object v0, p0, Lorg/jdom2/StringBin;->lengths:[I

    aget v2, v0, v1

    add-int/2addr v2, v3

    aput v2, v0, v1

    return-object p1
.end method

.method public size()I
    .locals 5

    .line 383
    iget-object v0, p0, Lorg/jdom2/StringBin;->lengths:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget v4, v0, v2

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method
