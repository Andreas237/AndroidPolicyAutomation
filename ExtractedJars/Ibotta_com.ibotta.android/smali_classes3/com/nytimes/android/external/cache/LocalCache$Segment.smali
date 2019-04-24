.class Lcom/nytimes/android/external/cache/LocalCache$Segment;
.super Ljava/util/concurrent/locks/ReentrantLock;
.source "LocalCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Segment"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/locks/ReentrantLock;"
    }
.end annotation


# instance fields
.field final accessQueue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field volatile count:I

.field final keyReferenceQueue:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "TK;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final map:Lcom/nytimes/android/external/cache/LocalCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/LocalCache<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final maxSegmentWeight:J

.field modCount:I

.field final readCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field final recencyQueue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field volatile table:Ljava/util/concurrent/atomic/AtomicReferenceArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceArray<",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field

.field threshold:I

.field totalWeight:J

.field final valueReferenceQueue:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final writeQueue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/nytimes/android/external/cache/LocalCache;IJ)V
    .locals 1
    .param p1    # Lcom/nytimes/android/external/cache/LocalCache;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache<",
            "TK;TV;>;IJ)V"
        }
    .end annotation

    .line 2132
    invoke-direct {p0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 2114
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->readCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2133
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    .line 2134
    iput-wide p3, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->maxSegmentWeight:J

    .line 2135
    invoke-virtual {p0, p2}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->newEntryArray(I)Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->initTable(Ljava/util/concurrent/atomic/AtomicReferenceArray;)V

    .line 2137
    invoke-virtual {p1}, Lcom/nytimes/android/external/cache/LocalCache;->usesKeyReferences()Z

    move-result p2

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    .line 2138
    new-instance p2, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p2}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    goto :goto_0

    :cond_0
    move-object p2, p3

    :goto_0
    iput-object p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->keyReferenceQueue:Ljava/lang/ref/ReferenceQueue;

    .line 2140
    invoke-virtual {p1}, Lcom/nytimes/android/external/cache/LocalCache;->usesValueReferences()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 2141
    new-instance p3, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p3}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    :cond_1
    iput-object p3, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->valueReferenceQueue:Ljava/lang/ref/ReferenceQueue;

    .line 2143
    invoke-virtual {p1}, Lcom/nytimes/android/external/cache/LocalCache;->usesAccessQueue()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 2144
    new-instance p2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    goto :goto_1

    .line 2145
    :cond_2
    invoke-static {}, Lcom/nytimes/android/external/cache/LocalCache;->discardingQueue()Ljava/util/Queue;

    move-result-object p2

    :goto_1
    iput-object p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->recencyQueue:Ljava/util/Queue;

    .line 2147
    invoke-virtual {p1}, Lcom/nytimes/android/external/cache/LocalCache;->usesWriteQueue()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 2148
    new-instance p2, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;

    invoke-direct {p2}, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;-><init>()V

    goto :goto_2

    .line 2149
    :cond_3
    invoke-static {}, Lcom/nytimes/android/external/cache/LocalCache;->discardingQueue()Ljava/util/Queue;

    move-result-object p2

    :goto_2
    iput-object p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->writeQueue:Ljava/util/Queue;

    .line 2151
    invoke-virtual {p1}, Lcom/nytimes/android/external/cache/LocalCache;->usesAccessQueue()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 2152
    new-instance p1, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;

    invoke-direct {p1}, Lcom/nytimes/android/external/cache/LocalCache$AccessQueue;-><init>()V

    goto :goto_3

    .line 2153
    :cond_4
    invoke-static {}, Lcom/nytimes/android/external/cache/LocalCache;->discardingQueue()Ljava/util/Queue;

    move-result-object p1

    :goto_3
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->accessQueue:Ljava/util/Queue;

    return-void
.end method


# virtual methods
.method cleanUp()V
    .locals 2

    .line 3465
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v0, v0, Lcom/nytimes/android/external/cache/LocalCache;->ticker:Lcom/nytimes/android/external/cache/Ticker;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/Ticker;->read()J

    move-result-wide v0

    .line 3466
    invoke-virtual {p0, v0, v1}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->runLockedCleanup(J)V

    .line 3467
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->runUnlockedCleanup()V

    return-void
.end method

.method clear()V
    .locals 5

    .line 3240
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    if-eqz v0, :cond_4

    .line 3241
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->lock()V

    .line 3243
    :try_start_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 3244
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 3245
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    :goto_1
    if-eqz v3, :cond_1

    .line 3247
    invoke-interface {v3}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v4

    invoke-interface {v4}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->isActive()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 3248
    sget-object v4, Lcom/nytimes/android/external/cache/RemovalCause;->EXPLICIT:Lcom/nytimes/android/external/cache/RemovalCause;

    invoke-virtual {p0, v3, v4}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->enqueueNotification(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/RemovalCause;)V

    .line 3245
    :cond_0
    invoke-interface {v3}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v3

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 3252
    :goto_2
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_3

    const/4 v3, 0x0

    .line 3253
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 3255
    :cond_3
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->clearReferenceQueues()V

    .line 3256
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->writeQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    .line 3257
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->accessQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    .line 3258
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->readCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 3260
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    .line 3261
    iput v1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3263
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3264
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    goto :goto_3

    :catchall_0
    move-exception v0

    .line 3263
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3264
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    throw v0

    :cond_4
    :goto_3
    return-void
.end method

.method clearKeyReferenceQueue()V
    .locals 1

    .line 2565
    :goto_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->keyReferenceQueue:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void
.end method

.method clearReferenceQueues()V
    .locals 1

    .line 2556
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/LocalCache;->usesKeyReferences()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2557
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->clearKeyReferenceQueue()V

    .line 2559
    :cond_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/LocalCache;->usesValueReferences()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2560
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->clearValueReferenceQueue()V

    :cond_1
    return-void
.end method

.method clearValueReferenceQueue()V
    .locals 1

    .line 2570
    :goto_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->valueReferenceQueue:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void
.end method

.method containsKey(Ljava/lang/Object;I)Z
    .locals 4

    .line 2827
    :try_start_0
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 2828
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v0, v0, Lcom/nytimes/android/external/cache/LocalCache;->ticker:Lcom/nytimes/android/external/cache/Ticker;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/Ticker;->read()J

    move-result-wide v2

    .line 2829
    invoke-virtual {p0, p1, p2, v2, v3}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->getLiveEntry(Ljava/lang/Object;IJ)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 2838
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postReadCleanup()V

    return v1

    .line 2833
    :cond_0
    :try_start_1
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object p1

    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->get()Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    .line 2838
    :cond_1
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postReadCleanup()V

    return v1

    :cond_2
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postReadCleanup()V

    return v1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postReadCleanup()V

    throw p1
.end method

.method copyEntry(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 4
    .param p1    # Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 2181
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2186
    :cond_0
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v0

    .line 2187
    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    .line 2188
    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->isActive()Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v1

    .line 2193
    :cond_1
    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v1, v1, Lcom/nytimes/android/external/cache/LocalCache;->entryFactory:Lcom/nytimes/android/external/cache/LocalCache$EntryFactory;

    invoke-virtual {v1, p0, p1, p2}, Lcom/nytimes/android/external/cache/LocalCache$EntryFactory;->copyEntry(Lcom/nytimes/android/external/cache/LocalCache$Segment;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    .line 2194
    iget-object p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->valueReferenceQueue:Ljava/lang/ref/ReferenceQueue;

    invoke-interface {v0, p2, v2, p1}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->copyFor(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->setValueReference(Lcom/nytimes/android/external/cache/LocalCache$ValueReference;)V

    return-object p1
.end method

.method drainKeyReferenceQueue()V
    .locals 3

    const/4 v0, 0x0

    .line 2529
    :cond_0
    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->keyReferenceQueue:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v1}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 2531
    check-cast v1, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    .line 2532
    iget-object v2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v2, v1}, Lcom/nytimes/android/external/cache/LocalCache;->reclaimKey(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    :cond_1
    return-void
.end method

.method drainRecencyQueue()V
    .locals 2

    .line 2631
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->recencyQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    if-eqz v0, :cond_1

    .line 2636
    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->accessQueue:Ljava/util/Queue;

    invoke-interface {v1, v0}, Ljava/util/Queue;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2637
    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->accessQueue:Ljava/util/Queue;

    invoke-interface {v1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method drainReferenceQueues()V
    .locals 1

    .line 2518
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/LocalCache;->usesKeyReferences()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2519
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->drainKeyReferenceQueue()V

    .line 2521
    :cond_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/LocalCache;->usesValueReferences()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2522
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->drainValueReferenceQueue()V

    :cond_1
    return-void
.end method

.method drainValueReferenceQueue()V
    .locals 3

    const/4 v0, 0x0

    .line 2542
    :cond_0
    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->valueReferenceQueue:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v1}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 2544
    check-cast v1, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    .line 2545
    iget-object v2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v2, v1}, Lcom/nytimes/android/external/cache/LocalCache;->reclaimValue(Lcom/nytimes/android/external/cache/LocalCache$ValueReference;)V

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    :cond_1
    return-void
.end method

.method enqueueNotification(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/RemovalCause;)V
    .locals 2
    .param p1    # Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;",
            "Lcom/nytimes/android/external/cache/RemovalCause;",
            ")V"
        }
    .end annotation

    .line 2677
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v1

    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object p1

    invoke-virtual {p0, v0, v1, p1, p2}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->enqueueNotification(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)V

    return-void
.end method

.method enqueueNotification(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)V
    .locals 4
    .param p3    # Lcom/nytimes/android/external/cache/LocalCache$ValueReference;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/nytimes/android/external/cache/LocalCache$ValueReference<",
            "TK;TV;>;",
            "Lcom/nytimes/android/external/cache/RemovalCause;",
            ")V"
        }
    .end annotation

    .line 2682
    iget-wide v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->totalWeight:J

    invoke-interface {p3}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->getWeight()I

    move-result p2

    int-to-long v2, p2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->totalWeight:J

    .line 2684
    iget-object p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object p2, p2, Lcom/nytimes/android/external/cache/LocalCache;->removalNotificationQueue:Ljava/util/Queue;

    sget-object v0, Lcom/nytimes/android/external/cache/LocalCache;->DISCARDING_QUEUE:Ljava/util/Queue;

    if-eq p2, v0, :cond_0

    .line 2685
    invoke-interface {p3}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->get()Ljava/lang/Object;

    move-result-object p2

    .line 2686
    invoke-static {p1, p2, p4}, Lcom/nytimes/android/external/cache/RemovalNotification;->create(Ljava/lang/Object;Ljava/lang/Object;Lcom/nytimes/android/external/cache/RemovalCause;)Lcom/nytimes/android/external/cache/RemovalNotification;

    move-result-object p1

    .line 2687
    iget-object p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object p2, p2, Lcom/nytimes/android/external/cache/LocalCache;->removalNotificationQueue:Ljava/util/Queue;

    invoke-interface {p2, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method evictEntries(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    .locals 5
    .param p1    # Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 2698
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/LocalCache;->evictsBySize()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2702
    :cond_0
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->drainRecencyQueue()V

    .line 2706
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v0

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->getWeight()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->maxSegmentWeight:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_2

    .line 2707
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v0

    sget-object v1, Lcom/nytimes/android/external/cache/RemovalCause;->SIZE:Lcom/nytimes/android/external/cache/RemovalCause;

    invoke-virtual {p0, p1, v0, v1}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->removeEntry(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;ILcom/nytimes/android/external/cache/RemovalCause;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 2708
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 2712
    :cond_2
    :goto_0
    iget-wide v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->totalWeight:J

    iget-wide v2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->maxSegmentWeight:J

    cmp-long p1, v0, v2

    if-lez p1, :cond_4

    .line 2713
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->getNextEvictable()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    .line 2714
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v0

    sget-object v1, Lcom/nytimes/android/external/cache/RemovalCause;->SIZE:Lcom/nytimes/android/external/cache/RemovalCause;

    invoke-virtual {p0, p1, v0, v1}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->removeEntry(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;ILcom/nytimes/android/external/cache/RemovalCause;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    .line 2715
    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_4
    return-void
.end method

.method expand()V
    .locals 11

    .line 2921
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2922
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    if-lt v1, v2, :cond_0

    return-void

    .line 2937
    :cond_0
    iget v2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    shl-int/lit8 v3, v1, 0x1

    .line 2938
    invoke-virtual {p0, v3}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->newEntryArray(I)Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v3

    .line 2939
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v4

    mul-int/lit8 v4, v4, 0x3

    div-int/lit8 v4, v4, 0x4

    iput v4, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->threshold:I

    .line 2940
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_6

    .line 2944
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    if-eqz v6, :cond_5

    .line 2947
    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v7

    .line 2948
    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v8

    and-int/2addr v8, v4

    if-nez v7, :cond_1

    .line 2952
    invoke-virtual {v3, v8, v6}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    goto :goto_4

    :cond_1
    move-object v9, v6

    :goto_1
    if-eqz v7, :cond_3

    .line 2960
    invoke-interface {v7}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v10

    and-int/2addr v10, v4

    if-eq v10, v8, :cond_2

    move-object v9, v7

    move v8, v10

    .line 2959
    :cond_2
    invoke-interface {v7}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v7

    goto :goto_1

    .line 2967
    :cond_3
    invoke-virtual {v3, v8, v9}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    :goto_2
    if-eq v6, v9, :cond_5

    .line 2971
    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v7

    and-int/2addr v7, v4

    .line 2972
    invoke-virtual {v3, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    .line 2973
    invoke-virtual {p0, v6, v8}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->copyEntry(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v8

    if-eqz v8, :cond_4

    .line 2975
    invoke-virtual {v3, v7, v8}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    goto :goto_3

    .line 2977
    :cond_4
    invoke-virtual {p0, v6}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->removeCollectedEntry(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    add-int/lit8 v2, v2, -0x1

    .line 2970
    :goto_3
    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v6

    goto :goto_2

    :cond_5
    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 2984
    :cond_6
    iput-object v3, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2985
    iput v2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    return-void
.end method

.method expireEntries(J)V
    .locals 3

    .line 2659
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->drainRecencyQueue()V

    .line 2662
    :goto_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->writeQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v1, v0, p1, p2}, Lcom/nytimes/android/external/cache/LocalCache;->isExpired(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;J)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2663
    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v1

    sget-object v2, Lcom/nytimes/android/external/cache/RemovalCause;->EXPIRED:Lcom/nytimes/android/external/cache/RemovalCause;

    invoke-virtual {p0, v0, v1, v2}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->removeEntry(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;ILcom/nytimes/android/external/cache/RemovalCause;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2664
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 2667
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->accessQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v1, v0, p1, p2}, Lcom/nytimes/android/external/cache/LocalCache;->isExpired(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;J)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 2668
    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v1

    sget-object v2, Lcom/nytimes/android/external/cache/RemovalCause;->EXPIRED:Lcom/nytimes/android/external/cache/RemovalCause;

    invoke-virtual {p0, v0, v1, v2}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->removeEntry(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;ILcom/nytimes/android/external/cache/RemovalCause;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 2669
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    return-void
.end method

.method get(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I)TV;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 2805
    :try_start_0
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 2806
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v0, v0, Lcom/nytimes/android/external/cache/LocalCache;->ticker:Lcom/nytimes/android/external/cache/Ticker;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/Ticker;->read()J

    move-result-wide v7

    .line 2807
    invoke-virtual {p0, p1, p2, v7, v8}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->getLiveEntry(Ljava/lang/Object;IJ)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_0

    .line 2821
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postReadCleanup()V

    return-object v1

    .line 2812
    :cond_0
    :try_start_1
    invoke-interface {v3}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object p1

    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->get()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 2814
    invoke-virtual {p0, v3, v7, v8}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->recordRead(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;J)V

    .line 2815
    invoke-interface {v3}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v4

    iget-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v9, p1, Lcom/nytimes/android/external/cache/LocalCache;->defaultLoader:Lcom/nytimes/android/external/cache/CacheLoader;

    move-object v2, p0

    move v5, p2

    invoke-virtual/range {v2 .. v9}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->scheduleRefresh(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;ILjava/lang/Object;JLcom/nytimes/android/external/cache/CacheLoader;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2821
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postReadCleanup()V

    return-object p1

    .line 2817
    :cond_1
    :try_start_2
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->tryDrainReferenceQueues()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 2821
    :cond_2
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postReadCleanup()V

    return-object v1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postReadCleanup()V

    throw p1
.end method

.method get(Ljava/lang/Object;ILcom/nytimes/android/external/cache/CacheLoader;)Ljava/lang/Object;
    .locals 9
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Lcom/nytimes/android/external/cache/CacheLoader;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/nytimes/android/external/cache/CacheLoader<",
            "-TK;TV;>;)TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 2217
    invoke-static {p1}, Lcom/nytimes/android/external/cache/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2218
    invoke-static {p3}, Lcom/nytimes/android/external/cache/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2220
    :try_start_0
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    if-eqz v0, :cond_1

    .line 2222
    invoke-virtual {p0, p1, p2}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->getEntry(Ljava/lang/Object;I)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 2224
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v0, v0, Lcom/nytimes/android/external/cache/LocalCache;->ticker:Lcom/nytimes/android/external/cache/Ticker;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/Ticker;->read()J

    move-result-wide v6

    .line 2225
    invoke-virtual {p0, v2, v6, v7}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->getLiveValue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 2227
    invoke-virtual {p0, v2, v6, v7}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->recordRead(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;J)V

    move-object v1, p0

    move-object v3, p1

    move v4, p2

    move-object v8, p3

    .line 2228
    invoke-virtual/range {v1 .. v8}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->scheduleRefresh(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;ILjava/lang/Object;JLcom/nytimes/android/external/cache/CacheLoader;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2248
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postReadCleanup()V

    return-object p1

    .line 2230
    :cond_0
    :try_start_1
    invoke-interface {v2}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v0

    .line 2231
    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->isLoading()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2232
    invoke-virtual {p0, v2, p1, v0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->waitForLoadingValue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;Lcom/nytimes/android/external/cache/LocalCache$ValueReference;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2248
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postReadCleanup()V

    return-object p1

    .line 2238
    :cond_1
    :try_start_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->lockedGetOrLoad(Ljava/lang/Object;ILcom/nytimes/android/external/cache/CacheLoader;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 2248
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postReadCleanup()V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 2240
    :try_start_3
    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    .line 2241
    instance-of p3, p2, Ljava/lang/Error;

    if-nez p3, :cond_3

    .line 2243
    instance-of p3, p2, Ljava/lang/RuntimeException;

    if-eqz p3, :cond_2

    .line 2244
    new-instance p1, Lcom/nytimes/android/external/cache/UncheckedExecutionException;

    invoke-direct {p1, p2}, Lcom/nytimes/android/external/cache/UncheckedExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    .line 2246
    :cond_2
    throw p1

    .line 2242
    :cond_3
    new-instance p1, Lcom/nytimes/android/external/cache/ExecutionError;

    check-cast p2, Ljava/lang/Error;

    invoke-direct {p1, p2}, Lcom/nytimes/android/external/cache/ExecutionError;-><init>(Ljava/lang/Error;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 2248
    :goto_0
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postReadCleanup()V

    throw p1
.end method

.method getAndRecordStats(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;Lcom/nytimes/android/external/cache/ListenableFuture;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p4    # Lcom/nytimes/android/external/cache/ListenableFuture;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference<",
            "TK;TV;>;",
            "Lcom/nytimes/android/external/cache/ListenableFuture<",
            "TV;>;)TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 2391
    :try_start_0
    invoke-static {p4}, Lcom/nytimes/android/external/cache/Uninterruptibles;->getUninterruptibly(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p4, :cond_1

    .line 2395
    :try_start_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->storeLoadedValue(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p4, :cond_0

    .line 2399
    invoke-virtual {p0, p1, p2, p3}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->removeLoadingValue(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;)Z

    :cond_0
    return-object p4

    :catchall_0
    move-exception v0

    goto :goto_0

    .line 2393
    :cond_1
    :try_start_2
    new-instance v0, Lcom/nytimes/android/external/cache/CacheLoader$InvalidCacheLoadException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CacheLoader returned null for key "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/nytimes/android/external/cache/CacheLoader$InvalidCacheLoadException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_1
    move-exception v0

    const/4 p4, 0x0

    :goto_0
    if-nez p4, :cond_2

    .line 2399
    invoke-virtual {p0, p1, p2, p3}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->removeLoadingValue(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;)Z

    :cond_2
    throw v0
.end method

.method getEntry(Ljava/lang/Object;I)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I)",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 2746
    invoke-virtual {p0, p2}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->getFirst(I)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_3

    .line 2747
    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v1

    if-eq v1, p2, :cond_0

    goto :goto_1

    .line 2751
    :cond_0
    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    .line 2753
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->tryDrainReferenceQueues()V

    goto :goto_1

    .line 2757
    :cond_1
    iget-object v2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v2, v2, Lcom/nytimes/android/external/cache/LocalCache;->keyEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    invoke-virtual {v2, p1, v1}, Lcom/nytimes/android/external/cache/Equivalence;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    .line 2746
    :cond_2
    :goto_1
    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method getFirst(I)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 2737
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2738
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr p1, v1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-object p1
.end method

.method getLiveEntry(Ljava/lang/Object;IJ)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "IJ)",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 2768
    invoke-virtual {p0, p1, p2}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->getEntry(Ljava/lang/Object;I)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return-object p2

    .line 2771
    :cond_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0, p1, p3, p4}, Lcom/nytimes/android/external/cache/LocalCache;->isExpired(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;J)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2772
    invoke-virtual {p0, p3, p4}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->tryExpireEntries(J)V

    return-object p2

    :cond_1
    return-object p1
.end method

.method getLiveValue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;J)Ljava/lang/Object;
    .locals 3
    .param p1    # Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;J)TV;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 2784
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2785
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->tryDrainReferenceQueues()V

    return-object v1

    .line 2788
    :cond_0
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v0

    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2790
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->tryDrainReferenceQueues()V

    return-object v1

    .line 2794
    :cond_1
    iget-object v2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v2, p1, p2, p3}, Lcom/nytimes/android/external/cache/LocalCache;->isExpired(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;J)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 2795
    invoke-virtual {p0, p2, p3}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->tryExpireEntries(J)V

    return-object v1

    :cond_2
    return-object v0
.end method

.method getNextEvictable()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 2723
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->accessQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    .line 2724
    invoke-interface {v1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v2

    invoke-interface {v2}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->getWeight()I

    move-result v2

    if-lez v2, :cond_0

    return-object v1

    .line 2729
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method initTable(Ljava/util/concurrent/atomic/AtomicReferenceArray;)V
    .locals 6
    .param p1    # Ljava/util/concurrent/atomic/AtomicReferenceArray;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReferenceArray<",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;>;)V"
        }
    .end annotation

    .line 2162
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->threshold:I

    .line 2163
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/LocalCache;->customWeigher()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->threshold:I

    int-to-long v1, v0

    iget-wide v3, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->maxSegmentWeight:J

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 2165
    iput v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->threshold:I

    .line 2167
    :cond_0
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    return-void
.end method

.method insertLoadingValueReference(Ljava/lang/Object;IZ)Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;
    .locals 8
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;IZ)",
            "Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 2452
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->lock()V

    .line 2454
    :try_start_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v0, v0, Lcom/nytimes/android/external/cache/LocalCache;->ticker:Lcom/nytimes/android/external/cache/Ticker;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/Ticker;->read()J

    move-result-wide v0

    .line 2455
    invoke-virtual {p0, v0, v1}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->preWriteCleanup(J)V

    .line 2457
    iget-object v2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2458
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    and-int/2addr v3, p2

    .line 2459
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-object v5, v4

    :goto_0
    if-eqz v5, :cond_3

    .line 2463
    invoke-interface {v5}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v6

    .line 2464
    invoke-interface {v5}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v7

    if-ne v7, p2, :cond_2

    if-eqz v6, :cond_2

    iget-object v7, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v7, v7, Lcom/nytimes/android/external/cache/LocalCache;->keyEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    .line 2465
    invoke-virtual {v7, p1, v6}, Lcom/nytimes/android/external/cache/Equivalence;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 2468
    invoke-interface {v5}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object p1

    .line 2469
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->isLoading()Z

    move-result p2

    if-nez p2, :cond_1

    if-eqz p3, :cond_0

    .line 2470
    invoke-interface {v5}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getWriteTime()J

    move-result-wide p2

    sub-long/2addr v0, p2

    iget-object p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-wide p2, p2, Lcom/nytimes/android/external/cache/LocalCache;->refreshNanos:J

    cmp-long v2, v0, p2

    if-gez v2, :cond_0

    goto :goto_1

    .line 2478
    :cond_0
    iget p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    .line 2479
    new-instance p2, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;

    invoke-direct {p2, p1}, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;-><init>(Lcom/nytimes/android/external/cache/LocalCache$ValueReference;)V

    .line 2481
    invoke-interface {v5, p2}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->setValueReference(Lcom/nytimes/android/external/cache/LocalCache$ValueReference;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2493
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 2494
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return-object p2

    :cond_1
    :goto_1
    const/4 p1, 0x0

    .line 2493
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 2494
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return-object p1

    .line 2462
    :cond_2
    :try_start_1
    invoke-interface {v5}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v5

    goto :goto_0

    .line 2486
    :cond_3
    iget p3, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    add-int/lit8 p3, p3, 0x1

    iput p3, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    .line 2487
    new-instance p3, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;

    invoke-direct {p3}, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;-><init>()V

    .line 2488
    invoke-virtual {p0, p1, p2, v4}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->newEntry(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    .line 2489
    invoke-interface {p1, p3}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->setValueReference(Lcom/nytimes/android/external/cache/LocalCache$ValueReference;)V

    .line 2490
    invoke-virtual {v2, v3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2493
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 2494
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return-object p3

    :catchall_0
    move-exception p1

    .line 2493
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 2494
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    throw p1
.end method

.method loadAsync(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;Lcom/nytimes/android/external/cache/CacheLoader;)Lcom/nytimes/android/external/cache/ListenableFuture;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p4    # Lcom/nytimes/android/external/cache/CacheLoader;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference<",
            "TK;TV;>;",
            "Lcom/nytimes/android/external/cache/CacheLoader<",
            "-TK;TV;>;)",
            "Lcom/nytimes/android/external/cache/ListenableFuture<",
            "TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 2367
    invoke-virtual {p3, p1, p4}, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->loadFuture(Ljava/lang/Object;Lcom/nytimes/android/external/cache/CacheLoader;)Lcom/nytimes/android/external/cache/ListenableFuture;

    move-result-object p4

    .line 2368
    new-instance v6, Lcom/nytimes/android/external/cache/LocalCache$Segment$1;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/nytimes/android/external/cache/LocalCache$Segment$1;-><init>(Lcom/nytimes/android/external/cache/LocalCache$Segment;Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;Lcom/nytimes/android/external/cache/ListenableFuture;)V

    sget-object p1, Lcom/nytimes/android/external/cache/DirectExecutor;->INSTANCE:Lcom/nytimes/android/external/cache/DirectExecutor;

    invoke-interface {p4, v6, p1}, Lcom/nytimes/android/external/cache/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object p4
.end method

.method loadSync(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;Lcom/nytimes/android/external/cache/CacheLoader;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p4    # Lcom/nytimes/android/external/cache/CacheLoader;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference<",
            "TK;TV;>;",
            "Lcom/nytimes/android/external/cache/CacheLoader<",
            "-TK;TV;>;)TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 2360
    invoke-virtual {p3, p1, p4}, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->loadFuture(Ljava/lang/Object;Lcom/nytimes/android/external/cache/CacheLoader;)Lcom/nytimes/android/external/cache/ListenableFuture;

    move-result-object p4

    .line 2361
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->getAndRecordStats(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;Lcom/nytimes/android/external/cache/ListenableFuture;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method lockedGetOrLoad(Ljava/lang/Object;ILcom/nytimes/android/external/cache/CacheLoader;)Ljava/lang/Object;
    .locals 16
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Lcom/nytimes/android/external/cache/CacheLoader;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/nytimes/android/external/cache/CacheLoader<",
            "-TK;TV;>;)TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p2

    .line 2260
    invoke-virtual/range {p0 .. p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->lock()V

    .line 2263
    :try_start_0
    iget-object v3, v1, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v3, v3, Lcom/nytimes/android/external/cache/LocalCache;->ticker:Lcom/nytimes/android/external/cache/Ticker;

    invoke-virtual {v3}, Lcom/nytimes/android/external/cache/Ticker;->read()J

    move-result-wide v3

    .line 2264
    invoke-virtual {v1, v3, v4}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->preWriteCleanup(J)V

    .line 2266
    iget v5, v1, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    const/4 v6, 0x1

    sub-int/2addr v5, v6

    .line 2267
    iget-object v7, v1, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2268
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v8

    sub-int/2addr v8, v6

    and-int/2addr v8, v2

    .line 2269
    invoke-virtual {v7, v8}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-object v10, v9

    :goto_0
    const/4 v11, 0x0

    if-eqz v10, :cond_4

    .line 2272
    invoke-interface {v10}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v12

    .line 2273
    invoke-interface {v10}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v13

    if-ne v13, v2, :cond_3

    if-eqz v12, :cond_3

    iget-object v13, v1, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v13, v13, Lcom/nytimes/android/external/cache/LocalCache;->keyEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    .line 2274
    invoke-virtual {v13, v0, v12}, Lcom/nytimes/android/external/cache/Equivalence;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3

    .line 2275
    invoke-interface {v10}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v13

    .line 2276
    invoke-interface {v13}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->isLoading()Z

    move-result v14

    if-eqz v14, :cond_0

    const/4 v6, 0x0

    goto :goto_2

    .line 2279
    :cond_0
    invoke-interface {v13}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->get()Ljava/lang/Object;

    move-result-object v14

    if-nez v14, :cond_1

    .line 2281
    sget-object v3, Lcom/nytimes/android/external/cache/RemovalCause;->COLLECTED:Lcom/nytimes/android/external/cache/RemovalCause;

    invoke-virtual {v1, v12, v2, v13, v3}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->enqueueNotification(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)V

    goto :goto_1

    .line 2282
    :cond_1
    iget-object v15, v1, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v15, v10, v3, v4}, Lcom/nytimes/android/external/cache/LocalCache;->isExpired(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;J)Z

    move-result v15

    if-eqz v15, :cond_2

    .line 2285
    sget-object v3, Lcom/nytimes/android/external/cache/RemovalCause;->EXPIRED:Lcom/nytimes/android/external/cache/RemovalCause;

    invoke-virtual {v1, v12, v2, v13, v3}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->enqueueNotification(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)V

    .line 2293
    :goto_1
    iget-object v3, v1, Lcom/nytimes/android/external/cache/LocalCache$Segment;->writeQueue:Ljava/util/Queue;

    invoke-interface {v3, v10}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    .line 2294
    iget-object v3, v1, Lcom/nytimes/android/external/cache/LocalCache$Segment;->accessQueue:Ljava/util/Queue;

    invoke-interface {v3, v10}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    .line 2295
    iput v5, v1, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    goto :goto_2

    .line 2287
    :cond_2
    invoke-virtual {v1, v10, v3, v4}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->recordLockedRead(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2313
    invoke-virtual/range {p0 .. p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 2314
    invoke-virtual/range {p0 .. p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return-object v14

    .line 2271
    :cond_3
    :try_start_1
    invoke-interface {v10}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v10

    goto :goto_0

    :cond_4
    move-object v13, v11

    :goto_2
    if-eqz v6, :cond_6

    .line 2302
    new-instance v11, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;

    invoke-direct {v11}, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;-><init>()V

    if-nez v10, :cond_5

    .line 2305
    invoke-virtual {v1, v0, v2, v9}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->newEntry(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v10

    .line 2306
    invoke-interface {v10, v11}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->setValueReference(Lcom/nytimes/android/external/cache/LocalCache$ValueReference;)V

    .line 2307
    invoke-virtual {v7, v8, v10}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    goto :goto_3

    .line 2309
    :cond_5
    invoke-interface {v10, v11}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->setValueReference(Lcom/nytimes/android/external/cache/LocalCache$ValueReference;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 2313
    :cond_6
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 2314
    invoke-virtual/range {p0 .. p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    if-eqz v6, :cond_7

    .line 2322
    monitor-enter v10

    move-object/from16 v3, p3

    .line 2323
    :try_start_2
    invoke-virtual {v1, v0, v2, v11, v3}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->loadSync(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;Lcom/nytimes/android/external/cache/CacheLoader;)Ljava/lang/Object;

    move-result-object v0

    monitor-exit v10

    return-object v0

    :catchall_0
    move-exception v0

    .line 2324
    monitor-exit v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 2329
    :cond_7
    invoke-virtual {v1, v10, v0, v13}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->waitForLoadingValue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;Lcom/nytimes/android/external/cache/LocalCache$ValueReference;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :catchall_1
    move-exception v0

    .line 2313
    invoke-virtual/range {p0 .. p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 2314
    invoke-virtual/range {p0 .. p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    throw v0
.end method

.method newEntry(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 2172
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v0, v0, Lcom/nytimes/android/external/cache/LocalCache;->entryFactory:Lcom/nytimes/android/external/cache/LocalCache$EntryFactory;

    invoke-static {p1}, Lcom/nytimes/android/external/cache/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/nytimes/android/external/cache/LocalCache$EntryFactory;->newEntry(Lcom/nytimes/android/external/cache/LocalCache$Segment;Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    return-object p1
.end method

.method newEntryArray(I)Ljava/util/concurrent/atomic/AtomicReferenceArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/concurrent/atomic/AtomicReferenceArray<",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 2158
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    return-object v0
.end method

.method postReadCleanup()V
    .locals 1

    .line 3441
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->readCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    and-int/lit8 v0, v0, 0x3f

    if-nez v0, :cond_0

    .line 3442
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->cleanUp()V

    :cond_0
    return-void
.end method

.method postWriteCleanup()V
    .locals 0

    .line 3461
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->runUnlockedCleanup()V

    return-void
.end method

.method preWriteCleanup(J)V
    .locals 0

    .line 3454
    invoke-virtual {p0, p1, p2}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->runLockedCleanup(J)V

    return-void
.end method

.method put(Ljava/lang/Object;ILjava/lang/Object;Z)Ljava/lang/Object;
    .locals 10
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;ITV;Z)TV;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 2846
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->lock()V

    .line 2848
    :try_start_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v0, v0, Lcom/nytimes/android/external/cache/LocalCache;->ticker:Lcom/nytimes/android/external/cache/Ticker;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/Ticker;->read()J

    move-result-wide v5

    .line 2849
    invoke-virtual {p0, v5, v6}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->preWriteCleanup(J)V

    .line 2851
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    add-int/lit8 v0, v0, 0x1

    .line 2852
    iget v1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->threshold:I

    if-le v0, v1, :cond_0

    .line 2853
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->expand()V

    .line 2854
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    .line 2857
    :cond_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2858
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    and-int v7, p2, v1

    .line 2859
    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-object v8, v1

    :goto_0
    const/4 v9, 0x0

    if-eqz v8, :cond_5

    .line 2863
    invoke-interface {v8}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 2864
    invoke-interface {v8}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v3

    if-ne v3, p2, :cond_4

    if-eqz v2, :cond_4

    iget-object v3, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v3, v3, Lcom/nytimes/android/external/cache/LocalCache;->keyEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    .line 2865
    invoke-virtual {v3, p1, v2}, Lcom/nytimes/android/external/cache/Equivalence;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 2868
    invoke-interface {v8}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v0

    .line 2869
    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->get()Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_2

    .line 2872
    iget p4, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    add-int/lit8 p4, p4, 0x1

    iput p4, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    .line 2873
    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->isActive()Z

    move-result p4

    if-eqz p4, :cond_1

    .line 2874
    sget-object p4, Lcom/nytimes/android/external/cache/RemovalCause;->COLLECTED:Lcom/nytimes/android/external/cache/RemovalCause;

    invoke-virtual {p0, p1, p2, v0, p4}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->enqueueNotification(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)V

    move-object v1, p0

    move-object v2, v8

    move-object v3, p1

    move-object v4, p3

    .line 2875
    invoke-virtual/range {v1 .. v6}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->setValue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 2876
    iget p1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    goto :goto_1

    :cond_1
    move-object v1, p0

    move-object v2, v8

    move-object v3, p1

    move-object v4, p3

    .line 2878
    invoke-virtual/range {v1 .. v6}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->setValue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 2879
    iget p1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    add-int/lit8 p1, p1, 0x1

    .line 2881
    :goto_1
    iput p1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    .line 2882
    invoke-virtual {p0, v8}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->evictEntries(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2911
    :goto_2
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 2912
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return-object v9

    :cond_2
    if-eqz p4, :cond_3

    .line 2888
    :try_start_1
    invoke-virtual {p0, v8, v5, v6}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->recordLockedRead(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2911
    :goto_3
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 2912
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return-object v7

    .line 2892
    :cond_3
    :try_start_2
    iget p4, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    add-int/lit8 p4, p4, 0x1

    iput p4, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    .line 2893
    sget-object p4, Lcom/nytimes/android/external/cache/RemovalCause;->REPLACED:Lcom/nytimes/android/external/cache/RemovalCause;

    invoke-virtual {p0, p1, p2, v0, p4}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->enqueueNotification(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)V

    move-object v1, p0

    move-object v2, v8

    move-object v3, p1

    move-object v4, p3

    .line 2894
    invoke-virtual/range {v1 .. v6}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->setValue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 2895
    invoke-virtual {p0, v8}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->evictEntries(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    goto :goto_3

    .line 2862
    :cond_4
    invoke-interface {v8}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v8

    goto :goto_0

    .line 2902
    :cond_5
    iget p4, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    add-int/lit8 p4, p4, 0x1

    iput p4, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    .line 2903
    invoke-virtual {p0, p1, p2, v1}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->newEntry(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p2

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    move-object v4, p3

    .line 2904
    invoke-virtual/range {v1 .. v6}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->setValue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 2905
    invoke-virtual {v0, v7, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 2906
    iget p1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    add-int/lit8 p1, p1, 0x1

    .line 2907
    iput p1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    .line 2908
    invoke-virtual {p0, p2}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->evictEntries(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    .line 2911
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 2912
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    throw p1
.end method

.method reclaimKey(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;I)Z
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;I)Z"
        }
    .end annotation

    .line 3318
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->lock()V

    .line 3320
    :try_start_0
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    .line 3321
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 3322
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    and-int/2addr v1, p2

    .line 3323
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-object v6, v5

    :goto_0
    if-eqz v6, :cond_1

    if-ne v6, p1, :cond_0

    .line 3327
    iget p1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    add-int/2addr p1, v2

    iput p1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    .line 3329
    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v9

    sget-object v10, Lcom/nytimes/android/external/cache/RemovalCause;->COLLECTED:Lcom/nytimes/android/external/cache/RemovalCause;

    move-object v4, p0

    move v8, p2

    .line 3328
    invoke-virtual/range {v4 .. v10}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->removeValueFromChain(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    .line 3330
    iget p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    sub-int/2addr p2, v2

    .line 3331
    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 3332
    iput p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3339
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3340
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return v2

    .line 3325
    :cond_0
    :try_start_1
    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 3339
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3340
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return p1

    :catchall_0
    move-exception p1

    .line 3339
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3340
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    throw p1
.end method

.method reclaimValue(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;)Z
    .locals 11
    .param p3    # Lcom/nytimes/android/external/cache/LocalCache$ValueReference;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/nytimes/android/external/cache/LocalCache$ValueReference<",
            "TK;TV;>;)Z"
        }
    .end annotation

    .line 3348
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->lock()V

    .line 3350
    :try_start_0
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    .line 3351
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 3352
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    and-int/2addr v1, p2

    .line 3353
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-object v6, v5

    :goto_0
    const/4 v3, 0x0

    if-eqz v6, :cond_4

    .line 3356
    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v7

    .line 3357
    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v4

    if-ne v4, p2, :cond_3

    if-eqz v7, :cond_3

    iget-object v4, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v4, v4, Lcom/nytimes/android/external/cache/LocalCache;->keyEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    .line 3358
    invoke-virtual {v4, p1, v7}, Lcom/nytimes/android/external/cache/Equivalence;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 3359
    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object p1

    if-ne p1, p3, :cond_1

    .line 3361
    iget p1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    add-int/2addr p1, v2

    iput p1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    .line 3362
    sget-object v10, Lcom/nytimes/android/external/cache/RemovalCause;->COLLECTED:Lcom/nytimes/android/external/cache/RemovalCause;

    move-object v4, p0

    move v8, p2

    move-object v9, p3

    invoke-virtual/range {v4 .. v10}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->removeValueFromChain(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    .line 3364
    iget p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    sub-int/2addr p2, v2

    .line 3365
    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 3366
    iput p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3375
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3376
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->isHeldByCurrentThread()Z

    move-result p1

    if-nez p1, :cond_0

    .line 3377
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    :cond_0
    return v2

    .line 3375
    :cond_1
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3376
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->isHeldByCurrentThread()Z

    move-result p1

    if-nez p1, :cond_2

    .line 3377
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    :cond_2
    return v3

    .line 3355
    :cond_3
    :try_start_1
    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 3375
    :cond_4
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3376
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->isHeldByCurrentThread()Z

    move-result p1

    if-nez p1, :cond_5

    .line 3377
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    :cond_5
    return v3

    :catchall_0
    move-exception p1

    .line 3375
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3376
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->isHeldByCurrentThread()Z

    move-result p2

    if-nez p2, :cond_6

    .line 3377
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    :cond_6
    throw p1
.end method

.method recordLockedRead(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;J)V
    .locals 1
    .param p1    # Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;J)V"
        }
    .end annotation

    .line 2598
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/LocalCache;->recordsAccess()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2599
    invoke-interface {p1, p2, p3}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->setAccessTime(J)V

    .line 2601
    :cond_0
    iget-object p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->accessQueue:Ljava/util/Queue;

    invoke-interface {p2, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method recordRead(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;J)V
    .locals 1
    .param p1    # Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;J)V"
        }
    .end annotation

    .line 2584
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/LocalCache;->recordsAccess()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2585
    invoke-interface {p1, p2, p3}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->setAccessTime(J)V

    .line 2587
    :cond_0
    iget-object p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->recencyQueue:Ljava/util/Queue;

    invoke-interface {p2, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method recordWrite(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;IJ)V
    .locals 4
    .param p1    # Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;IJ)V"
        }
    .end annotation

    .line 2610
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->drainRecencyQueue()V

    .line 2611
    iget-wide v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->totalWeight:J

    int-to-long v2, p2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->totalWeight:J

    .line 2613
    iget-object p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {p2}, Lcom/nytimes/android/external/cache/LocalCache;->recordsAccess()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2614
    invoke-interface {p1, p3, p4}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->setAccessTime(J)V

    .line 2616
    :cond_0
    iget-object p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {p2}, Lcom/nytimes/android/external/cache/LocalCache;->recordsWrite()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 2617
    invoke-interface {p1, p3, p4}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->setWriteTime(J)V

    .line 2619
    :cond_1
    iget-object p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->accessQueue:Ljava/util/Queue;

    invoke-interface {p2, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 2620
    iget-object p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->writeQueue:Ljava/util/Queue;

    invoke-interface {p2, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method refresh(Ljava/lang/Object;ILcom/nytimes/android/external/cache/CacheLoader;Z)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Lcom/nytimes/android/external/cache/CacheLoader;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/nytimes/android/external/cache/CacheLoader<",
            "-TK;TV;>;Z)TV;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 2427
    invoke-virtual {p0, p1, p2, p4}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->insertLoadingValueReference(Ljava/lang/Object;IZ)Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;

    move-result-object p4

    const/4 v0, 0x0

    if-nez p4, :cond_0

    return-object v0

    .line 2432
    :cond_0
    invoke-virtual {p0, p1, p2, p4, p3}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->loadAsync(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;Lcom/nytimes/android/external/cache/CacheLoader;)Lcom/nytimes/android/external/cache/ListenableFuture;

    move-result-object p1

    .line 2433
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/ListenableFuture;->isDone()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 2435
    :try_start_0
    invoke-static {p1}, Lcom/nytimes/android/external/cache/Uninterruptibles;->getUninterruptibly(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :cond_1
    return-object v0
.end method

.method remove(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I)TV;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 3090
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->lock()V

    .line 3092
    :try_start_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v0, v0, Lcom/nytimes/android/external/cache/LocalCache;->ticker:Lcom/nytimes/android/external/cache/Ticker;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/Ticker;->read()J

    move-result-wide v0

    .line 3093
    invoke-virtual {p0, v0, v1}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->preWriteCleanup(J)V

    .line 3095
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    .line 3096
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 3097
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v1, p2

    .line 3098
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-object v5, v4

    :goto_0
    const/4 v2, 0x0

    if-eqz v5, :cond_1

    .line 3101
    invoke-interface {v5}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v6

    .line 3102
    invoke-interface {v5}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v3

    if-ne v3, p2, :cond_2

    if-eqz v6, :cond_2

    iget-object v3, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v3, v3, Lcom/nytimes/android/external/cache/LocalCache;->keyEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    .line 3103
    invoke-virtual {v3, p1, v6}, Lcom/nytimes/android/external/cache/Equivalence;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 3104
    invoke-interface {v5}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v8

    .line 3105
    invoke-interface {v8}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3109
    sget-object v2, Lcom/nytimes/android/external/cache/RemovalCause;->EXPLICIT:Lcom/nytimes/android/external/cache/RemovalCause;

    move-object v9, v2

    goto :goto_1

    .line 3110
    :cond_0
    invoke-interface {v8}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->isActive()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 3111
    sget-object v2, Lcom/nytimes/android/external/cache/RemovalCause;->COLLECTED:Lcom/nytimes/android/external/cache/RemovalCause;

    move-object v9, v2

    .line 3117
    :goto_1
    iget v2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    move-object v3, p0

    move v7, p2

    .line 3118
    invoke-virtual/range {v3 .. v9}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->removeValueFromChain(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p2

    .line 3120
    iget v2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    add-int/lit8 v2, v2, -0x1

    .line 3121
    invoke-virtual {v0, v1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 3122
    iput v2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3129
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3130
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return-object p1

    .line 3129
    :cond_1
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3130
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return-object v2

    .line 3100
    :cond_2
    :try_start_1
    invoke-interface {v5}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 3129
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3130
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    throw p1
.end method

.method remove(Ljava/lang/Object;ILjava/lang/Object;)Z
    .locals 11

    .line 3195
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->lock()V

    .line 3197
    :try_start_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v0, v0, Lcom/nytimes/android/external/cache/LocalCache;->ticker:Lcom/nytimes/android/external/cache/Ticker;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/Ticker;->read()J

    move-result-wide v0

    .line 3198
    invoke-virtual {p0, v0, v1}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->preWriteCleanup(J)V

    .line 3200
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    .line 3201
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 3202
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    and-int/2addr v1, p2

    .line 3203
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-object v6, v5

    :goto_0
    const/4 v3, 0x0

    if-eqz v6, :cond_2

    .line 3206
    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v7

    .line 3207
    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v4

    if-ne v4, p2, :cond_3

    if-eqz v7, :cond_3

    iget-object v4, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v4, v4, Lcom/nytimes/android/external/cache/LocalCache;->keyEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    .line 3208
    invoke-virtual {v4, p1, v7}, Lcom/nytimes/android/external/cache/Equivalence;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 3209
    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v9

    .line 3210
    invoke-interface {v9}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->get()Ljava/lang/Object;

    move-result-object p1

    .line 3213
    iget-object v4, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v4, v4, Lcom/nytimes/android/external/cache/LocalCache;->valueEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    invoke-virtual {v4, p3, p1}, Lcom/nytimes/android/external/cache/Equivalence;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 3214
    sget-object p1, Lcom/nytimes/android/external/cache/RemovalCause;->EXPLICIT:Lcom/nytimes/android/external/cache/RemovalCause;

    goto :goto_1

    :cond_0
    if-nez p1, :cond_2

    .line 3215
    invoke-interface {v9}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->isActive()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 3216
    sget-object p1, Lcom/nytimes/android/external/cache/RemovalCause;->COLLECTED:Lcom/nytimes/android/external/cache/RemovalCause;

    .line 3222
    :goto_1
    iget p3, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    add-int/2addr p3, v2

    iput p3, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    move-object v4, p0

    move v8, p2

    move-object v10, p1

    .line 3223
    invoke-virtual/range {v4 .. v10}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->removeValueFromChain(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p2

    .line 3225
    iget p3, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    sub-int/2addr p3, v2

    .line 3226
    invoke-virtual {v0, v1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 3227
    iput p3, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    .line 3228
    sget-object p2, Lcom/nytimes/android/external/cache/RemovalCause;->EXPLICIT:Lcom/nytimes/android/external/cache/RemovalCause;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_1

    goto :goto_2

    :cond_1
    const/4 v2, 0x0

    .line 3234
    :goto_2
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3235
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return v2

    .line 3234
    :cond_2
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3235
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return v3

    .line 3205
    :cond_3
    :try_start_1
    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 3234
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3235
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    throw p1
.end method

.method removeCollectedEntry(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    .locals 1
    .param p1    # Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 3309
    sget-object v0, Lcom/nytimes/android/external/cache/RemovalCause;->COLLECTED:Lcom/nytimes/android/external/cache/RemovalCause;

    invoke-virtual {p0, p1, v0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->enqueueNotification(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/RemovalCause;)V

    .line 3310
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->writeQueue:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    .line 3311
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->accessQueue:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method removeEntry(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;ILcom/nytimes/android/external/cache/RemovalCause;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;I",
            "Lcom/nytimes/android/external/cache/RemovalCause;",
            ")Z"
        }
    .end annotation

    .line 3416
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    .line 3417
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 3418
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    and-int/2addr v1, p2

    .line 3419
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-object v6, v5

    :goto_0
    if-eqz v6, :cond_1

    if-ne v6, p1, :cond_0

    .line 3423
    iget p1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    add-int/2addr p1, v2

    iput p1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    .line 3425
    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v9

    move-object v4, p0

    move v8, p2

    move-object v10, p3

    .line 3424
    invoke-virtual/range {v4 .. v10}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->removeValueFromChain(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    .line 3426
    iget p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    sub-int/2addr p2, v2

    .line 3427
    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 3428
    iput p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    return v2

    .line 3421
    :cond_0
    invoke-interface {v6}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v6

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method removeEntryFromChain(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 3
    .param p2    # Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 3292
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    .line 3293
    invoke-interface {p2}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v1

    :goto_0
    if-eq p1, p2, :cond_1

    .line 3295
    invoke-virtual {p0, p1, v1}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->copyEntry(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v2

    if-eqz v2, :cond_0

    move-object v1, v2

    goto :goto_1

    .line 3299
    :cond_0
    invoke-virtual {p0, p1}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->removeCollectedEntry(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V

    add-int/lit8 v0, v0, -0x1

    .line 3294
    :goto_1
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    goto :goto_0

    .line 3303
    :cond_1
    iput v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    return-object v1
.end method

.method removeLoadingValue(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;)Z
    .locals 8
    .param p3    # Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference<",
            "TK;TV;>;)Z"
        }
    .end annotation

    .line 3383
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->lock()V

    .line 3385
    :try_start_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 3386
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    and-int/2addr v1, p2

    .line 3387
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-object v4, v3

    :goto_0
    const/4 v5, 0x0

    if-eqz v4, :cond_1

    .line 3390
    invoke-interface {v4}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v6

    .line 3391
    invoke-interface {v4}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v7

    if-ne v7, p2, :cond_2

    if-eqz v6, :cond_2

    iget-object v7, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v7, v7, Lcom/nytimes/android/external/cache/LocalCache;->keyEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    .line 3392
    invoke-virtual {v7, p1, v6}, Lcom/nytimes/android/external/cache/Equivalence;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 3393
    invoke-interface {v4}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object p1

    if-ne p1, p3, :cond_1

    .line 3395
    invoke-virtual {p3}, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->isActive()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3396
    invoke-virtual {p3}, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->getOldValue()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object p1

    invoke-interface {v4, p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->setValueReference(Lcom/nytimes/android/external/cache/LocalCache$ValueReference;)V

    goto :goto_1

    .line 3398
    :cond_0
    invoke-virtual {p0, v3, v4}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->removeEntryFromChain(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    .line 3399
    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3409
    :goto_1
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3410
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return v2

    .line 3409
    :cond_1
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3410
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return v5

    .line 3389
    :cond_2
    :try_start_1
    invoke-interface {v4}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 3409
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3410
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    throw p1
.end method

.method removeValueFromChain(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 0
    .param p2    # Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p5    # Lcom/nytimes/android/external/cache/LocalCache$ValueReference;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;TK;I",
            "Lcom/nytimes/android/external/cache/LocalCache$ValueReference<",
            "TK;TV;>;",
            "Lcom/nytimes/android/external/cache/RemovalCause;",
            ")",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 3275
    invoke-virtual {p0, p3, p4, p5, p6}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->enqueueNotification(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)V

    .line 3276
    iget-object p3, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->writeQueue:Ljava/util/Queue;

    invoke-interface {p3, p2}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    .line 3277
    iget-object p3, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->accessQueue:Ljava/util/Queue;

    invoke-interface {p3, p2}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    .line 3279
    invoke-interface {p5}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->isLoading()Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 3280
    invoke-interface {p5, p2}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->notifyNewValue(Ljava/lang/Object;)V

    return-object p1

    .line 3283
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->removeEntryFromChain(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    return-object p1
.end method

.method replace(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;ITV;)TV;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    move-object v8, p0

    move-object/from16 v0, p1

    move/from16 v5, p2

    .line 3043
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->lock()V

    .line 3045
    :try_start_0
    iget-object v1, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v1, v1, Lcom/nytimes/android/external/cache/LocalCache;->ticker:Lcom/nytimes/android/external/cache/Ticker;

    invoke-virtual {v1}, Lcom/nytimes/android/external/cache/Ticker;->read()J

    move-result-wide v6

    .line 3046
    invoke-virtual {p0, v6, v7}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->preWriteCleanup(J)V

    .line 3048
    iget-object v9, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 3049
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    and-int v10, v5, v1

    .line 3050
    invoke-virtual {v9, v10}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-object v11, v2

    :goto_0
    const/4 v12, 0x0

    if-eqz v11, :cond_0

    .line 3053
    invoke-interface {v11}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v4

    .line 3054
    invoke-interface {v11}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v1

    if-ne v1, v5, :cond_2

    if-eqz v4, :cond_2

    iget-object v1, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v1, v1, Lcom/nytimes/android/external/cache/LocalCache;->keyEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    .line 3055
    invoke-virtual {v1, v0, v4}, Lcom/nytimes/android/external/cache/Equivalence;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 3056
    invoke-interface {v11}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v13

    .line 3057
    invoke-interface {v13}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->get()Ljava/lang/Object;

    move-result-object v14

    if-nez v14, :cond_1

    .line 3059
    invoke-interface {v13}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3061
    iget v0, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    .line 3062
    iget v0, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    .line 3063
    sget-object v7, Lcom/nytimes/android/external/cache/RemovalCause;->COLLECTED:Lcom/nytimes/android/external/cache/RemovalCause;

    move-object v1, p0

    move-object v3, v11

    move/from16 v5, p2

    move-object v6, v13

    invoke-virtual/range {v1 .. v7}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->removeValueFromChain(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    .line 3065
    iget v1, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    add-int/lit8 v1, v1, -0x1

    .line 3066
    invoke-virtual {v9, v10, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 3067
    iput v1, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3082
    :cond_0
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3083
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return-object v12

    .line 3072
    :cond_1
    :try_start_1
    iget v1, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    .line 3073
    sget-object v1, Lcom/nytimes/android/external/cache/RemovalCause;->REPLACED:Lcom/nytimes/android/external/cache/RemovalCause;

    invoke-virtual {p0, v0, v5, v13, v1}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->enqueueNotification(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)V

    move-object v1, p0

    move-object v2, v11

    move-object/from16 v3, p1

    move-object/from16 v4, p3

    move-wide v5, v6

    .line 3074
    invoke-virtual/range {v1 .. v6}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->setValue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 3075
    invoke-virtual {p0, v11}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->evictEntries(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 3082
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3083
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return-object v14

    .line 3052
    :cond_2
    :try_start_2
    invoke-interface {v11}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 3082
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3083
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    throw v0
.end method

.method replace(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Z
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;ITV;TV;)Z"
        }
    .end annotation

    move-object v8, p0

    move-object/from16 v0, p1

    move/from16 v5, p2

    .line 2989
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->lock()V

    .line 2991
    :try_start_0
    iget-object v1, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v1, v1, Lcom/nytimes/android/external/cache/LocalCache;->ticker:Lcom/nytimes/android/external/cache/Ticker;

    invoke-virtual {v1}, Lcom/nytimes/android/external/cache/Ticker;->read()J

    move-result-wide v6

    .line 2992
    invoke-virtual {p0, v6, v7}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->preWriteCleanup(J)V

    .line 2994
    iget-object v9, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2995
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    const/4 v10, 0x1

    sub-int/2addr v1, v10

    and-int v11, v5, v1

    .line 2996
    invoke-virtual {v9, v11}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-object v12, v2

    :goto_0
    const/4 v13, 0x0

    if-eqz v12, :cond_0

    .line 2999
    invoke-interface {v12}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v4

    .line 3000
    invoke-interface {v12}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v1

    if-ne v1, v5, :cond_4

    if-eqz v4, :cond_4

    iget-object v1, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v1, v1, Lcom/nytimes/android/external/cache/LocalCache;->keyEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    .line 3001
    invoke-virtual {v1, v0, v4}, Lcom/nytimes/android/external/cache/Equivalence;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 3002
    invoke-interface {v12}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v14

    .line 3003
    invoke-interface {v14}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    .line 3005
    invoke-interface {v14}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3007
    iget v0, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    .line 3008
    iget v0, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    add-int/2addr v0, v10

    iput v0, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    .line 3009
    sget-object v7, Lcom/nytimes/android/external/cache/RemovalCause;->COLLECTED:Lcom/nytimes/android/external/cache/RemovalCause;

    move-object v1, p0

    move-object v3, v12

    move/from16 v5, p2

    move-object v6, v14

    invoke-virtual/range {v1 .. v7}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->removeValueFromChain(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    .line 3011
    iget v1, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    sub-int/2addr v1, v10

    .line 3012
    invoke-virtual {v9, v11, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 3013
    iput v1, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3035
    :cond_0
    :goto_1
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3036
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return v13

    .line 3018
    :cond_1
    :try_start_1
    iget-object v2, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v2, v2, Lcom/nytimes/android/external/cache/LocalCache;->valueEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    move-object/from16 v3, p3

    invoke-virtual {v2, v3, v1}, Lcom/nytimes/android/external/cache/Equivalence;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 3019
    iget v1, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    add-int/2addr v1, v10

    iput v1, v8, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    .line 3020
    sget-object v1, Lcom/nytimes/android/external/cache/RemovalCause;->REPLACED:Lcom/nytimes/android/external/cache/RemovalCause;

    invoke-virtual {p0, v0, v5, v14, v1}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->enqueueNotification(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)V

    move-object v1, p0

    move-object v2, v12

    move-object/from16 v3, p1

    move-object/from16 v4, p4

    move-wide v5, v6

    .line 3021
    invoke-virtual/range {v1 .. v6}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->setValue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 3022
    invoke-virtual {p0, v12}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->evictEntries(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 3035
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3036
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return v10

    .line 3027
    :cond_2
    :try_start_2
    invoke-virtual {p0, v12, v6, v7}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->recordLockedRead(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;J)V

    goto :goto_1

    :cond_3
    move-object/from16 v3, p3

    goto :goto_2

    :cond_4
    move-object/from16 v3, p3

    .line 2998
    :goto_2
    invoke-interface {v12}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    .line 3035
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3036
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    throw v0
.end method

.method runLockedCleanup(J)V
    .locals 1

    .line 3471
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->tryLock()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3473
    :try_start_0
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->drainReferenceQueues()V

    .line 3474
    invoke-virtual {p0, p1, p2}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->expireEntries(J)V

    .line 3475
    iget-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->readCount:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3477
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    throw p1

    :cond_0
    :goto_0
    return-void
.end method

.method runUnlockedCleanup()V
    .locals 1

    .line 3484
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->isHeldByCurrentThread()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3485
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/LocalCache;->processPendingNotifications()V

    :cond_0
    return-void
.end method

.method scheduleRefresh(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;ILjava/lang/Object;JLcom/nytimes/android/external/cache/CacheLoader;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p7    # Lcom/nytimes/android/external/cache/CacheLoader;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;TK;ITV;J",
            "Lcom/nytimes/android/external/cache/CacheLoader<",
            "-TK;TV;>;)TV;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 2407
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/LocalCache;->refreshes()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getWriteTime()J

    move-result-wide v0

    sub-long/2addr p5, v0

    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-wide v0, v0, Lcom/nytimes/android/external/cache/LocalCache;->refreshNanos:J

    cmp-long v2, p5, v0

    if-lez v2, :cond_0

    .line 2408
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object p1

    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->isLoading()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 2409
    invoke-virtual {p0, p2, p3, p7, p1}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->refresh(Ljava/lang/Object;ILcom/nytimes/android/external/cache/CacheLoader;Z)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    return-object p4
.end method

.method setValue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;Ljava/lang/Object;J)V
    .locals 3
    .param p1    # Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;TK;TV;J)V"
        }
    .end annotation

    .line 2202
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v0

    .line 2203
    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v1, v1, Lcom/nytimes/android/external/cache/LocalCache;->weigher:Lcom/nytimes/android/external/cache/Weigher;

    invoke-interface {v1, p2, p3}, Lcom/nytimes/android/external/cache/Weigher;->weigh(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p2

    if-ltz p2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Weights must be non-negative"

    .line 2204
    invoke-static {v1, v2}, Lcom/nytimes/android/external/cache/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 2206
    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v1, v1, Lcom/nytimes/android/external/cache/LocalCache;->valueStrength:Lcom/nytimes/android/external/cache/LocalCache$Strength;

    .line 2207
    invoke-virtual {v1, p0, p1, p3, p2}, Lcom/nytimes/android/external/cache/LocalCache$Strength;->referenceValue(Lcom/nytimes/android/external/cache/LocalCache$Segment;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;I)Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v1

    .line 2208
    invoke-interface {p1, v1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->setValueReference(Lcom/nytimes/android/external/cache/LocalCache$ValueReference;)V

    .line 2209
    invoke-virtual {p0, p1, p2, p4, p5}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->recordWrite(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;IJ)V

    .line 2210
    invoke-interface {v0, p3}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->notifyNewValue(Ljava/lang/Object;)V

    return-void
.end method

.method storeLoadedValue(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;Ljava/lang/Object;)Z
    .locals 11
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference<",
            "TK;TV;>;TV;)Z"
        }
    .end annotation

    .line 3136
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->lock()V

    .line 3138
    :try_start_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v0, v0, Lcom/nytimes/android/external/cache/LocalCache;->ticker:Lcom/nytimes/android/external/cache/Ticker;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/Ticker;->read()J

    move-result-wide v5

    .line 3139
    invoke-virtual {p0, v5, v6}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->preWriteCleanup(J)V

    .line 3141
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    const/4 v7, 0x1

    add-int/2addr v0, v7

    .line 3142
    iget v1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->threshold:I

    if-le v0, v1, :cond_0

    .line 3143
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->expand()V

    .line 3144
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    add-int/2addr v0, v7

    .line 3147
    :cond_0
    iget-object v8, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 3148
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    sub-int/2addr v1, v7

    and-int v9, p2, v1

    .line 3149
    invoke-virtual {v8, v9}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-object v10, v1

    :goto_0
    if-eqz v10, :cond_6

    .line 3152
    invoke-interface {v10}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 3153
    invoke-interface {v10}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getHash()I

    move-result v3

    if-ne v3, p2, :cond_5

    if-eqz v2, :cond_5

    iget-object v3, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v3, v3, Lcom/nytimes/android/external/cache/LocalCache;->keyEquivalence:Lcom/nytimes/android/external/cache/Equivalence;

    .line 3154
    invoke-virtual {v3, p1, v2}, Lcom/nytimes/android/external/cache/Equivalence;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 3155
    invoke-interface {v10}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v1

    .line 3156
    invoke-interface {v1}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eq p3, v1, :cond_2

    if-nez v2, :cond_1

    .line 3159
    sget-object v3, Lcom/nytimes/android/external/cache/LocalCache;->UNSET:Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    if-eq v1, v3, :cond_1

    goto :goto_1

    .line 3175
    :cond_1
    new-instance p3, Lcom/nytimes/android/external/cache/LocalCache$WeightedStrongValueReference;

    const/4 v0, 0x0

    invoke-direct {p3, p4, v0}, Lcom/nytimes/android/external/cache/LocalCache$WeightedStrongValueReference;-><init>(Ljava/lang/Object;I)V

    .line 3176
    sget-object p4, Lcom/nytimes/android/external/cache/RemovalCause;->REPLACED:Lcom/nytimes/android/external/cache/RemovalCause;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->enqueueNotification(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3189
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3190
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return v0

    .line 3161
    :cond_2
    :goto_1
    :try_start_1
    iget v1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    add-int/2addr v1, v7

    iput v1, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    .line 3162
    invoke-virtual {p3}, Lcom/nytimes/android/external/cache/LocalCache$LoadingValueReference;->isActive()Z

    move-result v1

    if-eqz v1, :cond_4

    if-nez v2, :cond_3

    .line 3164
    sget-object v1, Lcom/nytimes/android/external/cache/RemovalCause;->COLLECTED:Lcom/nytimes/android/external/cache/RemovalCause;

    goto :goto_2

    :cond_3
    sget-object v1, Lcom/nytimes/android/external/cache/RemovalCause;->REPLACED:Lcom/nytimes/android/external/cache/RemovalCause;

    .line 3165
    :goto_2
    invoke-virtual {p0, p1, p2, p3, v1}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->enqueueNotification(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ValueReference;Lcom/nytimes/android/external/cache/RemovalCause;)V

    add-int/lit8 v0, v0, -0x1

    :cond_4
    move-object v1, p0

    move-object v2, v10

    move-object v3, p1

    move-object v4, p4

    .line 3168
    invoke-virtual/range {v1 .. v6}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->setValue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 3169
    iput v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    .line 3170
    invoke-virtual {p0, v10}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->evictEntries(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 3189
    :goto_3
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3190
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    return v7

    .line 3151
    :cond_5
    :try_start_2
    invoke-interface {v10}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v10

    goto :goto_0

    .line 3181
    :cond_6
    iget p3, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    add-int/2addr p3, v7

    iput p3, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->modCount:I

    .line 3182
    invoke-virtual {p0, p1, p2, v1}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->newEntry(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p2

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    move-object v4, p4

    .line 3183
    invoke-virtual/range {v1 .. v6}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->setValue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 3184
    invoke-virtual {v8, v9, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 3185
    iput v0, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    .line 3186
    invoke-virtual {p0, p2}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->evictEntries(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    .line 3189
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    .line 3190
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postWriteCleanup()V

    throw p1
.end method

.method tryDrainReferenceQueues()V
    .locals 1

    .line 2504
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->tryLock()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2506
    :try_start_0
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->drainReferenceQueues()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2508
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method tryExpireEntries(J)V
    .locals 1

    .line 2648
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->tryLock()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2650
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->expireEntries(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2652
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->unlock()V

    throw p1

    :cond_0
    :goto_0
    return-void
.end method

.method waitForLoadingValue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;Lcom/nytimes/android/external/cache/LocalCache$ValueReference;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Lcom/nytimes/android/external/cache/LocalCache$ValueReference;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;TK;",
            "Lcom/nytimes/android/external/cache/LocalCache$ValueReference<",
            "TK;TV;>;)TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 2336
    invoke-interface {p3}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2340
    invoke-static {p1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "Recursive load of: %s"

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v1, v3

    invoke-static {v0, v2, v1}, Lcom/nytimes/android/external/cache/Preconditions;->checkState(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 2343
    invoke-interface {p3}, Lcom/nytimes/android/external/cache/LocalCache$ValueReference;->waitForValue()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 2348
    iget-object p2, p0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->map:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object p2, p2, Lcom/nytimes/android/external/cache/LocalCache;->ticker:Lcom/nytimes/android/external/cache/Ticker;

    invoke-virtual {p2}, Lcom/nytimes/android/external/cache/Ticker;->read()J

    move-result-wide v0

    .line 2349
    invoke-virtual {p0, p1, v0, v1}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->recordRead(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;J)V

    return-object p3

    .line 2345
    :cond_0
    new-instance p1, Lcom/nytimes/android/external/cache/CacheLoader$InvalidCacheLoadException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "CacheLoader returned null for key "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/nytimes/android/external/cache/CacheLoader$InvalidCacheLoadException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2337
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method
