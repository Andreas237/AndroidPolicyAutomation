.class public Lcom/squareup/haha/trove/THashMap;
.super Lcom/squareup/haha/trove/TObjectHash;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/haha/trove/THashMap$Entry;,
        Lcom/squareup/haha/trove/THashMap$KeyView;,
        Lcom/squareup/haha/trove/THashMap$MapBackedView;,
        Lcom/squareup/haha/trove/THashMap$EntryView;,
        Lcom/squareup/haha/trove/THashMap$ValueView;,
        Lcom/squareup/haha/trove/THashMap$EqProcedure;,
        Lcom/squareup/haha/trove/THashMap$HashProcedure;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Lcom/squareup/haha/trove/TObjectHash<TK;>;Ljava/util/Map<TK;TV;>;"
    }
.end annotation


# instance fields
.field protected transient _values:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TV;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/squareup/haha/trove/TObjectHash;-><init>()V

    .line 46
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcom/squareup/haha/trove/TObjectHash;-><init>(I)V

    .line 66
    return-void
.end method

.method public constructor <init>(IF)V
    .locals 0

    .line 89
    invoke-direct {p0, p1, p2}, Lcom/squareup/haha/trove/TObjectHash;-><init>(IF)V

    .line 90
    return-void
.end method

.method public constructor <init>(IFLcom/squareup/haha/trove/TObjectHashingStrategy;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IFLcom/squareup/haha/trove/TObjectHashingStrategy<TK;>;)V"
        }
    .end annotation

    .line 102
    invoke-direct {p0, p1, p2, p3}, Lcom/squareup/haha/trove/TObjectHash;-><init>(IFLcom/squareup/haha/trove/TObjectHashingStrategy;)V

    .line 103
    return-void
.end method

.method public constructor <init>(ILcom/squareup/haha/trove/TObjectHashingStrategy;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/squareup/haha/trove/TObjectHashingStrategy<TK;>;)V"
        }
    .end annotation

    .line 77
    invoke-direct {p0, p1, p2}, Lcom/squareup/haha/trove/TObjectHash;-><init>(ILcom/squareup/haha/trove/TObjectHashingStrategy;)V

    .line 78
    return-void
.end method

.method public constructor <init>(Lcom/squareup/haha/trove/TObjectHashingStrategy;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/trove/TObjectHashingStrategy<TK;>;)V"
        }
    .end annotation

    .line 54
    invoke-direct {p0, p1}, Lcom/squareup/haha/trove/TObjectHash;-><init>(Lcom/squareup/haha/trove/TObjectHashingStrategy;)V

    .line 55
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<TK;TV;>;)V"
        }
    .end annotation

    .line 112
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/squareup/haha/trove/THashMap;-><init>(I)V

    .line 113
    invoke-virtual {p0, p1}, Lcom/squareup/haha/trove/THashMap;->putAll(Ljava/util/Map;)V

    .line 114
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Lcom/squareup/haha/trove/TObjectHashingStrategy;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<TK;TV;>;Lcom/squareup/haha/trove/TObjectHashingStrategy<TK;>;)V"
        }
    .end annotation

    .line 124
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lcom/squareup/haha/trove/THashMap;-><init>(ILcom/squareup/haha/trove/TObjectHashingStrategy;)V

    .line 125
    invoke-virtual {p0, p1}, Lcom/squareup/haha/trove/THashMap;->putAll(Ljava/util/Map;)V

    .line 126
    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 790
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 792
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v1

    .line 793
    invoke-virtual {p0, v1}, Lcom/squareup/haha/trove/THashMap;->setUp(I)I

    .line 794
    :goto_0
    move v0, v1

    add-int/lit8 v1, v1, -0x1

    if-lez v0, :cond_0

    .line 795
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v2

    .line 796
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v3

    .line 797
    invoke-virtual {p0, v2, v3}, Lcom/squareup/haha/trove/THashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 798
    goto :goto_0

    .line 799
    :cond_0
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 777
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 780
    iget v0, p0, Lcom/squareup/haha/trove/THashMap;->_size:I

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 782
    new-instance v1, Lcom/squareup/haha/trove/SerializationProcedure;

    invoke-direct {v1, p1}, Lcom/squareup/haha/trove/SerializationProcedure;-><init>(Ljava/io/ObjectOutputStream;)V

    .line 783
    invoke-virtual {p0, v1}, Lcom/squareup/haha/trove/THashMap;->forEachEntry(Lcom/squareup/haha/trove/TObjectObjectProcedure;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 784
    iget-object v0, v1, Lcom/squareup/haha/trove/SerializationProcedure;->exception:Ljava/io/IOException;

    throw v0

    .line 786
    :cond_0
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 4

    .line 377
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THashMap;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 378
    invoke-super {p0}, Lcom/squareup/haha/trove/TObjectHash;->clear()V

    .line 379
    iget-object v1, p0, Lcom/squareup/haha/trove/THashMap;->_set:[Ljava/lang/Object;

    .line 380
    iget-object v2, p0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    .line 382
    array-length v3, v1

    :goto_0
    move v0, v3

    add-int/lit8 v3, v3, -0x1

    if-lez v0, :cond_0

    .line 383
    const/4 v0, 0x0

    aput-object v0, v1, v3

    .line 384
    const/4 v0, 0x0

    aput-object v0, v2, v3

    goto :goto_0

    .line 387
    :cond_0
    return-void
.end method

.method public clone()Lcom/squareup/haha/trove/THashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/squareup/haha/trove/THashMap<TK;TV;>;"
        }
    .end annotation

    .line 133
    invoke-super {p0}, Lcom/squareup/haha/trove/TObjectHash;->clone()Lcom/squareup/haha/trove/TObjectHash;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/squareup/haha/trove/THashMap;

    .line 134
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    iput-object v0, v1, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    .line 135
    return-object v1
.end method

.method public bridge synthetic clone()Lcom/squareup/haha/trove/TObjectHash;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THashMap;->clone()Lcom/squareup/haha/trove/THashMap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THashMap;->clone()Lcom/squareup/haha/trove/THashMap;

    move-result-object v0

    return-object v0
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 486
    invoke-virtual {p0, p1}, Lcom/squareup/haha/trove/THashMap;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 5

    .line 455
    iget-object v2, p0, Lcom/squareup/haha/trove/THashMap;->_set:[Ljava/lang/Object;

    .line 456
    iget-object v3, p0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    .line 460
    if-nez p1, :cond_2

    .line 461
    array-length v4, v3

    :cond_0
    move v0, v4

    add-int/lit8 v4, v4, -0x1

    if-lez v0, :cond_1

    .line 462
    aget-object v0, v2, v4

    if-eqz v0, :cond_0

    aget-object v0, v2, v4

    sget-object v1, Lcom/squareup/haha/trove/THashMap;->REMOVED:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    aget-object v0, v3, v4

    if-ne p1, v0, :cond_0

    .line 464
    const/4 v0, 0x1

    return v0

    :cond_1
    goto :goto_0

    .line 468
    :cond_2
    array-length v4, v3

    :cond_3
    move v0, v4

    add-int/lit8 v4, v4, -0x1

    if-lez v0, :cond_5

    .line 469
    aget-object v0, v2, v4

    if-eqz v0, :cond_3

    aget-object v0, v2, v4

    sget-object v1, Lcom/squareup/haha/trove/THashMap;->REMOVED:Ljava/lang/Object;

    if-eq v0, v1, :cond_3

    aget-object v0, v3, v4

    if-eq p1, v0, :cond_4

    aget-object v0, v3, v4

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 471
    :cond_4
    const/4 v0, 0x1

    return v0

    .line 475
    :cond_5
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Ljava/util/Map$Entry<TK;TV;>;>;"
        }
    .end annotation

    .line 444
    new-instance v0, Lcom/squareup/haha/trove/THashMap$EntryView;

    invoke-direct {v0, p0}, Lcom/squareup/haha/trove/THashMap$EntryView;-><init>(Lcom/squareup/haha/trove/THashMap;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 189
    instance-of v0, p1, Ljava/util/Map;

    if-nez v0, :cond_0

    .line 190
    const/4 v0, 0x0

    return v0

    .line 192
    :cond_0
    move-object v2, p1

    check-cast v2, Ljava/util/Map;

    .line 193
    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {p0}, Lcom/squareup/haha/trove/THashMap;->size()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 194
    const/4 v0, 0x0

    return v0

    .line 196
    :cond_1
    new-instance v0, Lcom/squareup/haha/trove/THashMap$EqProcedure;

    invoke-direct {v0, v2}, Lcom/squareup/haha/trove/THashMap$EqProcedure;-><init>(Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lcom/squareup/haha/trove/THashMap;->forEachEntry(Lcom/squareup/haha/trove/TObjectObjectProcedure;)Z

    move-result v0

    return v0
.end method

.method public forEachEntry(Lcom/squareup/haha/trove/TObjectObjectProcedure;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/trove/TObjectObjectProcedure<TK;TV;>;)Z"
        }
    .end annotation

    .line 276
    iget-object v2, p0, Lcom/squareup/haha/trove/THashMap;->_set:[Ljava/lang/Object;

    .line 277
    iget-object v3, p0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    .line 278
    array-length v4, v2

    :cond_0
    move v0, v4

    add-int/lit8 v4, v4, -0x1

    if-lez v0, :cond_1

    .line 279
    aget-object v0, v2, v4

    if-eqz v0, :cond_0

    aget-object v0, v2, v4

    sget-object v1, Lcom/squareup/haha/trove/THashMap;->REMOVED:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    aget-object v0, v2, v4

    aget-object v1, v3, v4

    invoke-interface {p1, v0, v1}, Lcom/squareup/haha/trove/TObjectObjectProcedure;->execute(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 282
    const/4 v0, 0x0

    return v0

    .line 285
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public forEachKey(Lcom/squareup/haha/trove/TObjectProcedure;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/trove/TObjectProcedure<TK;>;)Z"
        }
    .end annotation

    .line 244
    invoke-virtual {p0, p1}, Lcom/squareup/haha/trove/THashMap;->forEach(Lcom/squareup/haha/trove/TObjectProcedure;)Z

    move-result v0

    return v0
.end method

.method public forEachValue(Lcom/squareup/haha/trove/TObjectProcedure;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/trove/TObjectProcedure<TV;>;)Z"
        }
    .end annotation

    .line 255
    iget-object v2, p0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    .line 256
    iget-object v3, p0, Lcom/squareup/haha/trove/THashMap;->_set:[Ljava/lang/Object;

    .line 257
    array-length v4, v2

    :cond_0
    move v0, v4

    add-int/lit8 v4, v4, -0x1

    if-lez v0, :cond_1

    .line 258
    aget-object v0, v3, v4

    if-eqz v0, :cond_0

    aget-object v0, v3, v4

    sget-object v1, Lcom/squareup/haha/trove/THashMap;->REMOVED:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    aget-object v0, v2, v4

    invoke-interface {p1, v0}, Lcom/squareup/haha/trove/TObjectProcedure;->execute(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 261
    const/4 v0, 0x0

    return v0

    .line 264
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;)TV;"
        }
    .end annotation

    .line 366
    invoke-virtual {p0, p1}, Lcom/squareup/haha/trove/THashMap;->index(Ljava/lang/Object;)I

    move-result v0

    .line 367
    move v1, v0

    if-gez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    aget-object v0, v0, v1

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 200
    new-instance v1, Lcom/squareup/haha/trove/THashMap$HashProcedure;

    invoke-direct {v1, p0}, Lcom/squareup/haha/trove/THashMap$HashProcedure;-><init>(Lcom/squareup/haha/trove/THashMap;)V

    .line 201
    invoke-virtual {p0, v1}, Lcom/squareup/haha/trove/THashMap;->forEachEntry(Lcom/squareup/haha/trove/TObjectObjectProcedure;)Z

    .line 202
    .line 1212
    move-object v2, v1

    iget v0, v1, Lcom/squareup/haha/trove/THashMap$HashProcedure;->h:I

    .line 202
    return v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<TK;>;"
        }
    .end annotation

    .line 434
    new-instance v0, Lcom/squareup/haha/trove/THashMap$KeyView;

    invoke-direct {v0, p0}, Lcom/squareup/haha/trove/THashMap$KeyView;-><init>(Lcom/squareup/haha/trove/THashMap;)V

    return-object v0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .line 161
    if-nez p1, :cond_0

    .line 162
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null keys not supported"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 164
    :cond_0
    const/4 v2, 0x0

    .line 165
    invoke-virtual {p0, p1}, Lcom/squareup/haha/trove/THashMap;->insertionIndex(Ljava/lang/Object;)I

    move-result v0

    .line 166
    move v3, v0

    if-gez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 167
    :goto_0
    move v4, v0

    if-eqz v0, :cond_2

    .line 168
    neg-int v0, v3

    add-int/lit8 v3, v0, -0x1

    .line 169
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    aget-object v2, v0, v3

    .line 171
    :cond_2
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap;->_set:[Ljava/lang/Object;

    aget-object v5, v0, v3

    .line 172
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap;->_set:[Ljava/lang/Object;

    aput-object p1, v0, v3

    .line 173
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    aput-object p2, v0, v3

    .line 174
    if-nez v4, :cond_4

    .line 175
    if-nez v5, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0, v0}, Lcom/squareup/haha/trove/THashMap;->postInsertHook(Z)V

    .line 178
    :cond_4
    return-object v2
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<+TK;+TV;>;)V"
        }
    .end annotation

    .line 496
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/squareup/haha/trove/THashMap;->ensureCapacity(I)V

    .line 498
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    .line 499
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/squareup/haha/trove/THashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    goto :goto_0

    .line 501
    :cond_0
    return-void
.end method

.method protected rehash(I)V
    .locals 9

    .line 338
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap;->_set:[Ljava/lang/Object;

    array-length v3, v0

    .line 339
    iget-object v4, p0, Lcom/squareup/haha/trove/THashMap;->_set:[Ljava/lang/Object;

    .line 340
    iget-object v5, p0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    .line 342
    new-array v0, p1, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/squareup/haha/trove/THashMap;->_set:[Ljava/lang/Object;

    .line 343
    new-array v0, p1, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    .line 345
    move v6, v3

    :cond_0
    :goto_0
    move v0, v6

    add-int/lit8 v6, v6, -0x1

    if-lez v0, :cond_2

    .line 346
    aget-object v0, v4, v6

    if-eqz v0, :cond_0

    aget-object v0, v4, v6

    sget-object v1, Lcom/squareup/haha/trove/THashMap;->REMOVED:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    .line 347
    aget-object v7, v4, v6

    .line 348
    invoke-virtual {p0, v7}, Lcom/squareup/haha/trove/THashMap;->insertionIndex(Ljava/lang/Object;)I

    move-result v0

    .line 349
    move v8, v0

    if-gez v0, :cond_1

    .line 350
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap;->_set:[Ljava/lang/Object;

    neg-int v1, v8

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    invoke-virtual {p0, v0, v7}, Lcom/squareup/haha/trove/THashMap;->throwObjectContractViolation(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 352
    :cond_1
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap;->_set:[Ljava/lang/Object;

    aput-object v7, v0, v8

    .line 353
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    aget-object v1, v5, v6

    aput-object v1, v0, v8

    .line 354
    goto :goto_0

    .line 356
    :cond_2
    return-void
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;)TV;"
        }
    .end annotation

    .line 397
    const/4 v1, 0x0

    .line 398
    invoke-virtual {p0, p1}, Lcom/squareup/haha/trove/THashMap;->index(Ljava/lang/Object;)I

    move-result v0

    .line 399
    move v2, v0

    if-ltz v0, :cond_0

    .line 400
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    aget-object v1, v0, v2

    .line 401
    invoke-virtual {p0, v2}, Lcom/squareup/haha/trove/THashMap;->removeAt(I)V

    .line 403
    :cond_0
    return-object v1
.end method

.method protected removeAt(I)V
    .locals 2

    .line 413
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v1, v0, p1

    .line 414
    invoke-super {p0, p1}, Lcom/squareup/haha/trove/TObjectHash;->removeAt(I)V

    .line 415
    return-void
.end method

.method public retainEntries(Lcom/squareup/haha/trove/TObjectObjectProcedure;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/trove/TObjectObjectProcedure<TK;TV;>;)Z"
        }
    .end annotation

    .line 296
    iget-object v2, p0, Lcom/squareup/haha/trove/THashMap;->_set:[Ljava/lang/Object;

    .line 297
    iget-object v3, p0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    .line 298
    invoke-virtual {p0}, Lcom/squareup/haha/trove/THashMap;->stopCompactingOnRemove()V

    .line 299
    const/4 v4, 0x0

    .line 301
    :try_start_0
    array-length v5, v2

    :cond_0
    :goto_0
    move v0, v5

    add-int/lit8 v5, v5, -0x1

    if-lez v0, :cond_1

    .line 302
    aget-object v0, v2, v5

    if-eqz v0, :cond_0

    aget-object v0, v2, v5

    sget-object v1, Lcom/squareup/haha/trove/THashMap;->REMOVED:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    aget-object v0, v2, v5

    aget-object v1, v3, v5

    invoke-interface {p1, v0, v1}, Lcom/squareup/haha/trove/TObjectObjectProcedure;->execute(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 305
    invoke-virtual {p0, v5}, Lcom/squareup/haha/trove/THashMap;->removeAt(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 306
    const/4 v4, 0x1

    goto :goto_0

    .line 311
    :cond_1
    invoke-virtual {p0, v4}, Lcom/squareup/haha/trove/THashMap;->startCompactingOnRemove(Z)V

    .line 312
    goto :goto_1

    .line 311
    :catchall_0
    move-exception v6

    invoke-virtual {p0, v4}, Lcom/squareup/haha/trove/THashMap;->startCompactingOnRemove(Z)V

    throw v6

    .line 313
    :goto_1
    return v4
.end method

.method protected setUp(I)I
    .locals 2

    .line 146
    invoke-super {p0, p1}, Lcom/squareup/haha/trove/TObjectHash;->setUp(I)I

    move-result v1

    .line 147
    new-array v0, v1, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    .line 148
    return v1
.end method

.method public transformValues(Lcom/squareup/haha/trove/TObjectFunction;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/trove/TObjectFunction<TV;TV;>;)V"
        }
    .end annotation

    .line 322
    iget-object v2, p0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    .line 323
    iget-object v3, p0, Lcom/squareup/haha/trove/THashMap;->_set:[Ljava/lang/Object;

    .line 324
    array-length v4, v2

    :cond_0
    :goto_0
    move v0, v4

    add-int/lit8 v4, v4, -0x1

    if-lez v0, :cond_1

    .line 325
    aget-object v0, v3, v4

    if-eqz v0, :cond_0

    aget-object v0, v3, v4

    sget-object v1, Lcom/squareup/haha/trove/THashMap;->REMOVED:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    .line 326
    invoke-interface {p1}, Lcom/squareup/haha/trove/TObjectFunction;->execute$7713a341()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v2, v4

    goto :goto_0

    .line 329
    :cond_1
    return-void
.end method

.method public values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Collection<TV;>;"
        }
    .end annotation

    .line 424
    new-instance v0, Lcom/squareup/haha/trove/THashMap$ValueView;

    invoke-direct {v0, p0}, Lcom/squareup/haha/trove/THashMap$ValueView;-><init>(Lcom/squareup/haha/trove/THashMap;)V

    return-object v0
.end method
