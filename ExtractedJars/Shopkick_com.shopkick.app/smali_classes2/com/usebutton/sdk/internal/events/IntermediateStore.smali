.class public Lcom/usebutton/sdk/internal/events/IntermediateStore;
.super Ljava/lang/Object;
.source "IntermediateStore.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/events/EventsStore;


# instance fields
.field private final mQueue:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;",
            ">;"
        }
    .end annotation
.end field

.field private mSequenceGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final mTarget:Lcom/usebutton/sdk/internal/events/EventsStore;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/events/EventsStore;)V
    .locals 2
    .param p1    # Lcom/usebutton/sdk/internal/events/EventsStore;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    .line 19
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mSequenceGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    iput-object p1, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mTarget:Lcom/usebutton/sdk/internal/events/EventsStore;

    return-void
.end method

.method private addToMemoryQueue(Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;)Z
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mSequenceGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->setSequenceNumber(I)V

    .line 64
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public add(Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;)Z
    .locals 6

    .line 27
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    monitor-enter v0

    .line 28
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 30
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mTarget:Lcom/usebutton/sdk/internal/events/EventsStore;

    invoke-interface {v1, p1}, Lcom/usebutton/sdk/internal/events/EventsStore;->add(Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 33
    :cond_0
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/events/IntermediateStore;->addToMemoryQueue(Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;)Z

    goto :goto_2

    .line 36
    :cond_1
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/events/IntermediateStore;->addToMemoryQueue(Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;)Z

    .line 40
    iget-object p1, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v3, v1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;

    .line 41
    iget-object v5, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mTarget:Lcom/usebutton/sdk/internal/events/EventsStore;

    invoke-interface {v5, v4}, Lcom/usebutton/sdk/internal/events/EventsStore;->add(Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;)Z

    move-result v4

    if-nez v4, :cond_4

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    move v3, v1

    goto :goto_1

    :cond_4
    :goto_0
    move v3, v2

    :goto_1
    if-nez v3, :cond_2

    :cond_5
    if-eqz v3, :cond_6

    .line 53
    iget-object p1, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 56
    :cond_6
    :goto_2
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public peek(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;",
            ">;"
        }
    .end annotation

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    monitor-enter v1

    .line 71
    :try_start_0
    iget-object v2, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 72
    iget-object v2, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mTarget:Lcom/usebutton/sdk/internal/events/EventsStore;

    invoke-interface {v2, p1}, Lcom/usebutton/sdk/internal/events/EventsStore;->peek(I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 74
    :cond_0
    iget-object v2, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 76
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    .line 77
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-interface {v0, v1, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 76
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public remove(I)V
    .locals 4

    .line 83
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    monitor-enter v0

    .line 84
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 85
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mTarget:Lcom/usebutton/sdk/internal/events/EventsStore;

    invoke-interface {v1, p1}, Lcom/usebutton/sdk/internal/events/EventsStore;->remove(I)V

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    move v2, v1

    .line 87
    :goto_0
    iget-object v3, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 88
    iget-object v3, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 91
    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public size()I
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    monitor-enter v0

    .line 97
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mTarget:Lcom/usebutton/sdk/internal/events/EventsStore;

    invoke-interface {v1}, Lcom/usebutton/sdk/internal/events/EventsStore;->size()I

    move-result v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 98
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public trimToSize(I)V
    .locals 3

    .line 103
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    monitor-enter v0

    .line 104
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 105
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mTarget:Lcom/usebutton/sdk/internal/events/EventsStore;

    invoke-interface {v1, p1}, Lcom/usebutton/sdk/internal/events/EventsStore;->trimToSize(I)V

    goto :goto_1

    .line 107
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, p1, :cond_1

    .line 108
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/IntermediateStore;->mQueue:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 111
    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
