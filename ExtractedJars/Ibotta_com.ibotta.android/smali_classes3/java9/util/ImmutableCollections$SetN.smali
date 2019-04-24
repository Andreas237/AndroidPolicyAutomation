.class final Ljava9/util/ImmutableCollections$SetN;
.super Ljava9/util/ImmutableCollections$AbstractImmutableSet;
.source "ImmutableCollections.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/ImmutableCollections;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "SetN"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava9/util/ImmutableCollections$AbstractImmutableSet<",
        "TE;>;"
    }
.end annotation


# instance fields
.field final elements:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TE;"
        }
    .end annotation
.end field

.field private final size:I


# direct methods
.method varargs constructor <init>([Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)V"
        }
    .end annotation

    .line 444
    invoke-direct {p0}, Ljava9/util/ImmutableCollections$AbstractImmutableSet;-><init>()V

    .line 445
    array-length v0, p1

    iput v0, p0, Ljava9/util/ImmutableCollections$SetN;->size:I

    .line 447
    array-length v0, p1

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iput-object v0, p0, Ljava9/util/ImmutableCollections$SetN;->elements:[Ljava/lang/Object;

    const/4 v0, 0x0

    .line 448
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    .line 449
    aget-object v1, p1, v0

    .line 450
    invoke-direct {p0, v1}, Ljava9/util/ImmutableCollections$SetN;->probe(Ljava/lang/Object;)I

    move-result v2

    if-gez v2, :cond_0

    .line 454
    iget-object v3, p0, Ljava9/util/ImmutableCollections$SetN;->elements:[Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    neg-int v2, v2

    aput-object v1, v3, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 452
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "duplicate element: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method private probe(Ljava/lang/Object;)I
    .locals 2

    .line 510
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    sget v1, Ljava9/util/ImmutableCollections;->SALT:I

    xor-int/2addr v0, v1

    iget-object v1, p0, Ljava9/util/ImmutableCollections$SetN;->elements:[Ljava/lang/Object;

    array-length v1, v1

    invoke-static {v0, v1}, Ljava9/util/ImmutableCollections;->access$000(II)I

    move-result v0

    .line 512
    :cond_0
    :goto_0
    iget-object v1, p0, Ljava9/util/ImmutableCollections$SetN;->elements:[Ljava/lang/Object;

    aget-object v1, v1, v0

    if-nez v1, :cond_1

    neg-int p1, v0

    add-int/lit8 p1, p1, -0x1

    return p1

    .line 515
    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return v0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 517
    iget-object v1, p0, Ljava9/util/ImmutableCollections$SetN;->elements:[Ljava/lang/Object;

    array-length v1, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 524
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "not serial proxy"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 7

    .line 528
    iget v0, p0, Ljava9/util/ImmutableCollections$SetN;->size:I

    new-array v0, v0, [Ljava/lang/Object;

    .line 530
    iget-object v1, p0, Ljava9/util/ImmutableCollections$SetN;->elements:[Ljava/lang/Object;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v5, v1, v3

    if-eqz v5, :cond_0

    add-int/lit8 v6, v4, 0x1

    .line 532
    aput-object v5, v0, v4

    move v4, v6

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 535
    :cond_1
    new-instance v1, Ljava9/util/CollSer;

    const/4 v2, 0x2

    invoke-direct {v1, v2, v0}, Ljava9/util/CollSer;-><init>(I[Ljava/lang/Object;)V

    return-object v1
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 0

    .line 466
    invoke-direct {p0, p1}, Ljava9/util/ImmutableCollections$SetN;->probe(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 5

    .line 497
    iget-object v0, p0, Ljava9/util/ImmutableCollections$SetN;->elements:[Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    if-eqz v4, :cond_0

    .line 499
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    add-int/2addr v3, v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v3
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    .line 471
    new-instance v0, Ljava9/util/ImmutableCollections$SetN$1;

    invoke-direct {v0, p0}, Ljava9/util/ImmutableCollections$SetN$1;-><init>(Ljava9/util/ImmutableCollections$SetN;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 461
    iget v0, p0, Ljava9/util/ImmutableCollections$SetN;->size:I

    return v0
.end method
