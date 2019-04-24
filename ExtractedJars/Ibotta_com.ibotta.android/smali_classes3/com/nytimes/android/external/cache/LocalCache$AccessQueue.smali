.class final Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;
.super Ljava/util/AbstractQueue;
.source "LocalCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "AccessQueue"
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

    .line 3764
    invoke-direct {p0}, Ljava/util/AbstractQueue;-><init>()V

    .line 3765
    new-instance v0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue$1;

    invoke-direct {v0, p0}, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue$1;-><init>(Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;)V

    iput-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 3868
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInAccessQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    .line 3869
    :goto_0
    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    if-eq v0, v1, :cond_0

    .line 3870
    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInAccessQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v1

    .line 3871
    invoke-static {v0}, Lcom/nytimes/android/external/cache/LocalCache;->nullifyAccessOrder(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    move-object v0, v1

    goto :goto_0

    .line 3875
    :cond_0
    invoke-interface {v1, v1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->setNextInAccessQueue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    .line 3876
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-interface {v0, v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->setPreviousInAccessQueue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 3847
    check-cast p1, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    .line 3848
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInAccessQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

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

    .line 3853
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInAccessQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

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

    .line 3882
    new-instance v0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue$2;

    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->peek()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue$2;-><init>(Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

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

    .line 3806
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getPreviousInAccessQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInAccessQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/nytimes/android/external/cache/LocalCache;->connectAccessOrder(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    .line 3809
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getPreviousInAccessQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/nytimes/android/external/cache/LocalCache;->connectAccessOrder(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    .line 3810
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-static {p1, v0}, Lcom/nytimes/android/external/cache/LocalCache;->connectAccessOrder(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic offer(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 3764
    check-cast p1, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-virtual {p0, p1}, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->offer(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Z

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

    .line 3817
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInAccessQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    .line 3818
    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic peek()Ljava/lang/Object;
    .locals 1

    .line 3764
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->peek()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

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

    .line 3823
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInAccessQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    .line 3824
    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 3828
    :cond_0
    invoke-virtual {p0, v0}, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->remove(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public bridge synthetic poll()Ljava/lang/Object;
    .locals 1

    .line 3764
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->poll()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    .line 3835
    check-cast p1, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    .line 3836
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getPreviousInAccessQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    .line 3837
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInAccessQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v1

    .line 3838
    invoke-static {v0, v1}, Lcom/nytimes/android/external/cache/LocalCache;->connectAccessOrder(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    .line 3839
    invoke-static {p1}, Lcom/nytimes/android/external/cache/LocalCache;->nullifyAccessOrder(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    .line 3841
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

    .line 3859
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInAccessQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    if-eq v0, v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 3860
    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInAccessQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    goto :goto_0

    :cond_0
    return v1
.end method
