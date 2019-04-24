.class final Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;
.super Ljava/util/AbstractQueue;
.source "LocalCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "WriteQueue"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractQueue<",
        "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 3624
    invoke-direct {p0}, Ljava/util/AbstractQueue;-><init>()V

    .line 3625
    new-instance v0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue$1;

    invoke-direct {v0, p0}, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue$1;-><init>(Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;)V

    iput-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 3728
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInWriteQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    .line 3729
    :goto_0
    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    if-eq v0, v1, :cond_0

    .line 3730
    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInWriteQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v1

    .line 3731
    invoke-static {v0}, Lcom/nytimes/android/external/cache/LocalCache;->nullifyWriteOrder(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    move-object v0, v1

    goto :goto_0

    .line 3735
    :cond_0
    invoke-interface {v1, v1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->setNextInWriteQueue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    .line 3736
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-interface {v0, v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->setPreviousInWriteQueue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 3707
    check-cast p1, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    .line 3708
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInWriteQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    sget-object v0, Lcom/nytimes/android/external/cache/LocalCache$NullEntry;->INSTANCE:Lcom/nytimes/android/external/cache/LocalCache$NullEntry;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isEmpty()Z
    .locals 2

    .line 3713
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInWriteQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 3742
    new-instance v0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue$2;

    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->peek()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue$2;-><init>(Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    return-object v0
.end method

.method public offer(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Z
    .locals 2
    .param p1    # Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)Z"
        }
    .end annotation

    .line 3666
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getPreviousInWriteQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInWriteQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/nytimes/android/external/cache/LocalCache;->connectWriteOrder(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    .line 3669
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getPreviousInWriteQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/nytimes/android/external/cache/LocalCache;->connectWriteOrder(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    .line 3670
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-static {p1, v0}, Lcom/nytimes/android/external/cache/LocalCache;->connectWriteOrder(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic offer(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 3624
    check-cast p1, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-virtual {p0, p1}, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->offer(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Z

    move-result p1

    return p1
.end method

.method public peek()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 3677
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInWriteQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    .line 3678
    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic peek()Ljava/lang/Object;
    .locals 1

    .line 3624
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->peek()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    return-object v0
.end method

.method public poll()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 3683
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInWriteQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    .line 3684
    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 3688
    :cond_0
    invoke-virtual {p0, v0}, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->remove(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public bridge synthetic poll()Ljava/lang/Object;
    .locals 1

    .line 3624
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->poll()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    .line 3695
    check-cast p1, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    .line 3696
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getPreviousInWriteQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    .line 3697
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInWriteQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v1

    .line 3698
    invoke-static {v0, v1}, Lcom/nytimes/android/external/cache/LocalCache;->connectWriteOrder(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    .line 3699
    invoke-static {p1}, Lcom/nytimes/android/external/cache/LocalCache;->nullifyWriteOrder(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    .line 3701
    sget-object p1, Lcom/nytimes/android/external/cache/LocalCache$NullEntry;->INSTANCE:Lcom/nytimes/android/external/cache/LocalCache$NullEntry;

    if-eq v1, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public size()I
    .locals 3

    .line 3719
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInWriteQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    if-eq v0, v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 3720
    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInWriteQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    goto :goto_0

    :cond_0
    return v1
.end method
