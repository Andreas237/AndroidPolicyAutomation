.class Lcom/google/protobuf/MapField$MutatabilityAwareMap;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/MapField;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MutatabilityAwareMap"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/MapField$MutatabilityAwareMap$MutatabilityAwareIterator;,
        Lcom/google/protobuf/MapField$MutatabilityAwareMap$MutatabilityAwareSet;,
        Lcom/google/protobuf/MapField$MutatabilityAwareMap$MutatabilityAwareCollection;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/Map<TK;TV;>;"
    }
.end annotation


# instance fields
.field private final delegate:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<TK;TV;>;"
        }
    .end annotation
.end field

.field private final mutabilityOracle:Lcom/google/protobuf/MutabilityOracle;


# direct methods
.method constructor <init>(Lcom/google/protobuf/MutabilityOracle;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/MutabilityOracle;Ljava/util/Map<TK;TV;>;)V"
        }
    .end annotation

    .line 301
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 302
    iput-object p1, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->mutabilityOracle:Lcom/google/protobuf/MutabilityOracle;

    .line 303
    iput-object p2, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->delegate:Ljava/util/Map;

    .line 304
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 357
    iget-object v0, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->mutabilityOracle:Lcom/google/protobuf/MutabilityOracle;

    invoke-interface {v0}, Lcom/google/protobuf/MutabilityOracle;->ensureMutable()V

    .line 358
    iget-object v0, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->delegate:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 359
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 318
    iget-object v0, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->delegate:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 323
    iget-object v0, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->delegate:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public entrySet()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Ljava/util/Map$Entry<TK;TV;>;>;"
        }
    .end annotation

    .line 373
    new-instance v0, Lcom/google/protobuf/MapField$MutatabilityAwareMap$MutatabilityAwareSet;

    iget-object v1, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->mutabilityOracle:Lcom/google/protobuf/MutabilityOracle;

    iget-object v2, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->delegate:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/MapField$MutatabilityAwareMap$MutatabilityAwareSet;-><init>(Lcom/google/protobuf/MutabilityOracle;Ljava/util/Set;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 378
    iget-object v0, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->delegate:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;)TV;"
        }
    .end annotation

    .line 328
    iget-object v0, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->delegate:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 383
    iget-object v0, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->delegate:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 313
    iget-object v0, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->delegate:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<TK;>;"
        }
    .end annotation

    .line 363
    new-instance v0, Lcom/google/protobuf/MapField$MutatabilityAwareMap$MutatabilityAwareSet;

    iget-object v1, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->mutabilityOracle:Lcom/google/protobuf/MutabilityOracle;

    iget-object v2, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->delegate:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/MapField$MutatabilityAwareMap$MutatabilityAwareSet;-><init>(Lcom/google/protobuf/MutabilityOracle;Ljava/util/Set;)V

    return-object v0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .line 333
    iget-object v0, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->mutabilityOracle:Lcom/google/protobuf/MutabilityOracle;

    invoke-interface {v0}, Lcom/google/protobuf/MutabilityOracle;->ensureMutable()V

    .line 334
    invoke-static {p1}, Lcom/google/protobuf/Internal;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    invoke-static {p2}, Lcom/google/protobuf/Internal;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    iget-object v0, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->delegate:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<+TK;+TV;>;)V"
        }
    .end annotation

    .line 347
    iget-object v0, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->mutabilityOracle:Lcom/google/protobuf/MutabilityOracle;

    invoke-interface {v0}, Lcom/google/protobuf/MutabilityOracle;->ensureMutable()V

    .line 348
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 349
    invoke-static {v2}, Lcom/google/protobuf/Internal;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/protobuf/Internal;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    goto :goto_0

    .line 352
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->delegate:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 353
    return-void
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;)TV;"
        }
    .end annotation

    .line 341
    iget-object v0, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->mutabilityOracle:Lcom/google/protobuf/MutabilityOracle;

    invoke-interface {v0}, Lcom/google/protobuf/MutabilityOracle;->ensureMutable()V

    .line 342
    iget-object v0, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->delegate:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 308
    iget-object v0, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->delegate:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 388
    iget-object v0, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->delegate:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public values()Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Collection<TV;>;"
        }
    .end annotation

    .line 368
    new-instance v0, Lcom/google/protobuf/MapField$MutatabilityAwareMap$MutatabilityAwareCollection;

    iget-object v1, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->mutabilityOracle:Lcom/google/protobuf/MutabilityOracle;

    iget-object v2, p0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->delegate:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/MapField$MutatabilityAwareMap$MutatabilityAwareCollection;-><init>(Lcom/google/protobuf/MutabilityOracle;Ljava/util/Collection;)V

    return-object v0
.end method
