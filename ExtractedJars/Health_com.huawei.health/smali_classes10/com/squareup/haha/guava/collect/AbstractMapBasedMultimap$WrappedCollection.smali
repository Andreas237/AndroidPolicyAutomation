.class Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;
.super Ljava/util/AbstractCollection;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "WrappedCollection"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection$WrappedIterator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractCollection<TV;>;"
    }
.end annotation


# instance fields
.field final ancestor:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap<TK;TV;>.WrappedCollection;"
        }
    .end annotation
.end field

.field private ancestorDelegate:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<TV;>;"
        }
    .end annotation
.end field

.field delegate:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<TV;>;"
        }
    .end annotation
.end field

.field final key:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;


# direct methods
.method constructor <init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;Ljava/lang/Object;Ljava/util/Collection;Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;)V
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;Ljava/util/Collection<TV;>;Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap<TK;TV;>.WrappedCollection;)V"
        }
    .end annotation

    .line 361
    iput-object p1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 362
    iput-object p2, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->key:Ljava/lang/Object;

    .line 363
    iput-object p3, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    .line 364
    iput-object p4, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestor:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;

    .line 365
    if-nez p4, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 1445
    :cond_0
    move-object v1, p4

    iget-object v0, p4, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    .line 365
    :goto_0
    iput-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestorDelegate:Ljava/util/Collection;

    .line 367
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    .line 503
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->refreshIfEmpty()V

    .line 504
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    .line 505
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result v0

    .line 506
    move v2, v0

    if-eqz v0, :cond_0

    .line 507
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$208(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;)I

    .line 508
    if-eqz v1, :cond_0

    .line 509
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->addToMap()V

    .line 512
    :cond_0
    return v2
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<+TV;>;)Z"
        }
    .end annotation

    .line 522
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 523
    const/4 v0, 0x0

    return v0

    .line 525
    :cond_0
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->size()I

    move-result v2

    .line 526
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    move-result v0

    .line 527
    move v3, v0

    if-eqz v0, :cond_1

    .line 528
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v4

    .line 529
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    sub-int v1, v4, v2

    invoke-static {v0, v1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$212(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;I)I

    .line 530
    if-nez v2, :cond_1

    .line 531
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->addToMap()V

    .line 534
    :cond_1
    return v3
.end method

.method final addToMap()V
    .locals 3

    .line 414
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestor:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;

    if-eqz v0, :cond_0

    .line 415
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestor:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;

    invoke-virtual {v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->addToMap()V

    return-void

    .line 417
    :cond_0
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$000(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->key:Ljava/lang/Object;

    iget-object v2, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    return-void
.end method

.method public clear()V
    .locals 2

    .line 548
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->size()I

    move-result v0

    .line 549
    move v1, v0

    if-nez v0, :cond_0

    .line 550
    return-void

    .line 552
    :cond_0
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    .line 553
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-static {v0, v1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$220(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;I)I

    .line 554
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->removeIfEmpty()V

    .line 555
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 538
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->refreshIfEmpty()V

    .line 539
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<*>;)Z"
        }
    .end annotation

    .line 543
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->refreshIfEmpty()V

    .line 544
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 427
    if-ne p1, p0, :cond_0

    .line 428
    const/4 v0, 0x1

    return v0

    .line 430
    :cond_0
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->refreshIfEmpty()V

    .line 431
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 435
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->refreshIfEmpty()V

    .line 436
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->hashCode()I

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<TV;>;"
        }
    .end annotation

    .line 449
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->refreshIfEmpty()V

    .line 450
    new-instance v0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection$WrappedIterator;

    invoke-direct {v0, p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection$WrappedIterator;-><init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;)V

    return-object v0
.end method

.method final refreshIfEmpty()V
    .locals 4

    .line 377
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestor:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;

    if-eqz v0, :cond_0

    .line 378
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestor:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;

    invoke-virtual {v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->refreshIfEmpty()V

    .line 379
    iget-object v3, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestor:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;

    .line 2445
    iget-object v0, v3, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    .line 379
    iget-object v1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestorDelegate:Ljava/util/Collection;

    if-eq v0, v1, :cond_1

    .line 380
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    .line 382
    :cond_0
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 383
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$000(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->key:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    .line 384
    if-eqz v2, :cond_1

    .line 385
    iput-object v2, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    .line 388
    :cond_1
    return-void
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    .line 558
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->refreshIfEmpty()V

    .line 559
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result v0

    .line 560
    move v1, v0

    if-eqz v0, :cond_0

    .line 561
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$210(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;)I

    .line 562
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->removeIfEmpty()V

    .line 564
    :cond_0
    return v1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<*>;)Z"
        }
    .end annotation

    .line 568
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 569
    const/4 v0, 0x0

    return v0

    .line 571
    :cond_0
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->size()I

    move-result v2

    .line 572
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    move-result v0

    .line 573
    move v3, v0

    if-eqz v0, :cond_1

    .line 574
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v4

    .line 575
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    sub-int v1, v4, v2

    invoke-static {v0, v1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$212(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;I)I

    .line 576
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->removeIfEmpty()V

    .line 578
    :cond_1
    return v3
.end method

.method final removeIfEmpty()V
    .locals 2

    .line 395
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestor:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;

    if-eqz v0, :cond_0

    .line 396
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->ancestor:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;

    invoke-virtual {v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->removeIfEmpty()V

    return-void

    .line 397
    :cond_0
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 398
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$000(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->key:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    :cond_1
    return-void
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<*>;)Z"
        }
    .end annotation

    .line 582
    invoke-static {p1}, Lcom/squareup/haha/guava/base/Joiner;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 583
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->size()I

    move-result v2

    .line 584
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->retainAll(Ljava/util/Collection;)Z

    move-result v0

    .line 585
    move v3, v0

    if-eqz v0, :cond_0

    .line 586
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v4

    .line 587
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->this$0:Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;

    sub-int v1, v4, v2

    invoke-static {v0, v1}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;->access$212(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;I)I

    .line 588
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->removeIfEmpty()V

    .line 590
    :cond_0
    return v3
.end method

.method public size()I
    .locals 1

    .line 422
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->refreshIfEmpty()V

    .line 423
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 440
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->refreshIfEmpty()V

    .line 441
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;->delegate:Ljava/util/Collection;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
