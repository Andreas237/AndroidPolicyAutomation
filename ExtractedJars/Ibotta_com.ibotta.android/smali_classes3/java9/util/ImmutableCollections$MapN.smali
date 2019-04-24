.class final Ljava9/util/ImmutableCollections$MapN;
.super Ljava9/util/ImmutableCollections$AbstractImmutableMap;
.source "ImmutableCollections.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/ImmutableCollections;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "MapN"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava9/util/ImmutableCollections$AbstractImmutableMap<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field final size:I

.field final table:[Ljava/lang/Object;


# direct methods
.method varargs constructor <init>([Ljava/lang/Object;)V
    .locals 5

    .line 640
    invoke-direct {p0}, Ljava9/util/ImmutableCollections$AbstractImmutableMap;-><init>()V

    .line 641
    array-length v0, p1

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_2

    .line 644
    array-length v0, p1

    shr-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava9/util/ImmutableCollections$MapN;->size:I

    .line 646
    array-length v0, p1

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    and-int/lit8 v0, v0, -0x2

    .line 648
    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Ljava9/util/ImmutableCollections$MapN;->table:[Ljava/lang/Object;

    const/4 v0, 0x0

    .line 650
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    .line 651
    aget-object v1, p1, v0

    invoke-static {v1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, v0, 0x1

    .line 652
    aget-object v2, p1, v2

    invoke-static {v2}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 653
    invoke-direct {p0, v1}, Ljava9/util/ImmutableCollections$MapN;->probe(Ljava/lang/Object;)I

    move-result v3

    if-gez v3, :cond_0

    add-int/lit8 v3, v3, 0x1

    neg-int v3, v3

    .line 658
    iget-object v4, p0, Ljava9/util/ImmutableCollections$MapN;->table:[Ljava/lang/Object;

    aput-object v1, v4, v3

    add-int/lit8 v3, v3, 0x1

    .line 659
    aput-object v2, v4, v3

    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 655
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "duplicate key: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void

    .line 642
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "length is odd"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method private probe(Ljava/lang/Object;)I
    .locals 2

    .line 753
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    sget v1, Ljava9/util/ImmutableCollections;->SALT:I

    xor-int/2addr v0, v1

    iget-object v1, p0, Ljava9/util/ImmutableCollections$MapN;->table:[Ljava/lang/Object;

    array-length v1, v1

    shr-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Ljava9/util/ImmutableCollections;->access$000(II)I

    move-result v0

    shl-int/lit8 v0, v0, 0x1

    .line 755
    :cond_0
    :goto_0
    iget-object v1, p0, Ljava9/util/ImmutableCollections$MapN;->table:[Ljava/lang/Object;

    aget-object v1, v1, v0

    if-nez v1, :cond_1

    neg-int p1, v0

    add-int/lit8 p1, p1, -0x1

    return p1

    .line 758
    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return v0

    :cond_2
    add-int/lit8 v0, v0, 0x2

    .line 760
    iget-object v1, p0, Ljava9/util/ImmutableCollections$MapN;->table:[Ljava/lang/Object;

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

    .line 767
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "not serial proxy"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 7

    .line 771
    iget v0, p0, Ljava9/util/ImmutableCollections$MapN;->size:I

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 772
    iget-object v1, p0, Ljava9/util/ImmutableCollections$MapN;->table:[Ljava/lang/Object;

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 775
    iget-object v4, p0, Ljava9/util/ImmutableCollections$MapN;->table:[Ljava/lang/Object;

    aget-object v5, v4, v2

    if-eqz v5, :cond_0

    add-int/lit8 v5, v3, 0x1

    .line 776
    aget-object v6, v4, v2

    aput-object v6, v0, v3

    add-int/lit8 v3, v5, 0x1

    add-int/lit8 v6, v2, 0x1

    .line 777
    aget-object v4, v4, v6

    aput-object v4, v0, v5

    :cond_0
    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    .line 780
    :cond_1
    new-instance v1, Ljava9/util/CollSer;

    const/4 v2, 0x3

    invoke-direct {v1, v2, v0}, Ljava9/util/CollSer;-><init>(I[Ljava/lang/Object;)V

    return-object v1
.end method


# virtual methods
.method public containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 666
    invoke-direct {p0, p1}, Ljava9/util/ImmutableCollections$MapN;->probe(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x1

    .line 671
    :goto_0
    iget-object v2, p0, Ljava9/util/ImmutableCollections$MapN;->table:[Ljava/lang/Object;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    .line 672
    aget-object v2, v2, v1

    if-eqz v2, :cond_0

    .line 673
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 710
    new-instance v0, Ljava9/util/ImmutableCollections$MapN$1;

    invoke-direct {v0, p0}, Ljava9/util/ImmutableCollections$MapN$1;-><init>(Ljava9/util/ImmutableCollections$MapN;)V

    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .line 695
    invoke-direct {p0, p1}, Ljava9/util/ImmutableCollections$MapN;->probe(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 697
    iget-object v0, p0, Ljava9/util/ImmutableCollections$MapN;->table:[Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public hashCode()I
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 683
    :goto_0
    iget-object v2, p0, Ljava9/util/ImmutableCollections$MapN;->table:[Ljava/lang/Object;

    array-length v3, v2

    if-ge v0, v3, :cond_1

    .line 684
    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    .line 686
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    iget-object v3, p0, Ljava9/util/ImmutableCollections$MapN;->table:[Ljava/lang/Object;

    add-int/lit8 v4, v0, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    xor-int/2addr v2, v3

    add-int/2addr v1, v2

    :cond_0
    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_1
    return v1
.end method

.method public size()I
    .locals 1

    .line 705
    iget v0, p0, Ljava9/util/ImmutableCollections$MapN;->size:I

    return v0
.end method
