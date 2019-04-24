.class abstract Lcom/nytimes/android/external/cache/LocalCache$HashIterator;
.super Ljava/lang/Object;
.source "LocalCache.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "HashIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field currentSegment:Lcom/nytimes/android/external/cache/LocalCache$Segment;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/LocalCache$Segment<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field currentTable:Ljava/util/concurrent/atomic/AtomicReferenceArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceArray<",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field

.field lastReturned:Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/LocalCache<",
            "TK;TV;>.WriteThroughEntry;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field nextEntry:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field nextExternal:Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/LocalCache<",
            "TK;TV;>.WriteThroughEntry;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field nextSegmentIndex:I

.field nextTableIndex:I

.field final synthetic this$0:Lcom/nytimes/android/external/cache/LocalCache;


# direct methods
.method constructor <init>(Lcom/nytimes/android/external/cache/LocalCache;)V
    .locals 0

    .line 4308
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->this$0:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4309
    iget-object p1, p1, Lcom/nytimes/android/external/cache/LocalCache;->segments:[Lcom/nytimes/android/external/cache/LocalCache$Segment;

    array-length p1, p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextSegmentIndex:I

    const/4 p1, -0x1

    .line 4310
    iput p1, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextTableIndex:I

    .line 4311
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->advance()V

    return-void
.end method


# virtual methods
.method final advance()V
    .locals 3

    const/4 v0, 0x0

    .line 4319
    iput-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextExternal:Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;

    .line 4321
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextInChain()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 4325
    :cond_0
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextInTable()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 4329
    :cond_1
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextSegmentIndex:I

    if-ltz v0, :cond_2

    .line 4330
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->this$0:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v0, v0, Lcom/nytimes/android/external/cache/LocalCache;->segments:[Lcom/nytimes/android/external/cache/LocalCache$Segment;

    iget v1, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextSegmentIndex:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextSegmentIndex:I

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->currentSegment:Lcom/nytimes/android/external/cache/LocalCache$Segment;

    .line 4331
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->currentSegment:Lcom/nytimes/android/external/cache/LocalCache$Segment;

    iget v0, v0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->count:I

    if-eqz v0, :cond_1

    .line 4332
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->currentSegment:Lcom/nytimes/android/external/cache/LocalCache$Segment;

    iget-object v0, v0, Lcom/nytimes/android/external/cache/LocalCache$Segment;->table:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iput-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->currentTable:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 4333
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->currentTable:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextTableIndex:I

    .line 4334
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextInTable()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_2
    return-void
.end method

.method advanceTo(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Z
    .locals 4
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

    .line 4375
    :try_start_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->this$0:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v0, v0, Lcom/nytimes/android/external/cache/LocalCache;->ticker:Lcom/nytimes/android/external/cache/Ticker;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/Ticker;->read()J

    move-result-wide v0

    .line 4376
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 4377
    iget-object v3, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->this$0:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-virtual {v3, p1, v0, v1}, Lcom/nytimes/android/external/cache/LocalCache;->getLiveValue(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4379
    new-instance v0, Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;

    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->this$0:Lcom/nytimes/android/external/cache/LocalCache;

    invoke-direct {v0, v1, v2, p1}, Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;-><init>(Lcom/nytimes/android/external/cache/LocalCache;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextExternal:Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 4386
    :goto_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->currentSegment:Lcom/nytimes/android/external/cache/LocalCache$Segment;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postReadCleanup()V

    return p1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->currentSegment:Lcom/nytimes/android/external/cache/LocalCache$Segment;

    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/LocalCache$Segment;->postReadCleanup()V

    throw p1
.end method

.method public hasNext()Z
    .locals 1

    .line 4392
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextExternal:Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method nextEntry()Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/LocalCache<",
            "TK;TV;>.WriteThroughEntry;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 4397
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextExternal:Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;

    if-eqz v0, :cond_0

    .line 4400
    iput-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->lastReturned:Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;

    .line 4401
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->advance()V

    .line 4402
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->lastReturned:Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;

    return-object v0

    .line 4398
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method nextInChain()Z
    .locals 1

    .line 4345
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextEntry:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    if-eqz v0, :cond_1

    .line 4346
    :goto_0
    invoke-interface {v0}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object v0

    iput-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextEntry:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextEntry:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    if-eqz v0, :cond_1

    .line 4347
    invoke-virtual {p0, v0}, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->advanceTo(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 4346
    :cond_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextEntry:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method nextInTable()Z
    .locals 3

    .line 4359
    :cond_0
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextTableIndex:I

    if-ltz v0, :cond_2

    .line 4360
    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->currentTable:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextTableIndex:I

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    iput-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextEntry:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    if-eqz v0, :cond_0

    .line 4361
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextEntry:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-virtual {p0, v0}, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->advanceTo(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->nextInChain()Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public remove()V
    .locals 2

    .line 4407
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->lastReturned:Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/nytimes/android/external/cache/Preconditions;->checkState(Z)V

    .line 4408
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->this$0:Lcom/nytimes/android/external/cache/LocalCache;

    iget-object v1, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->lastReturned:Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;

    invoke-virtual {v1}, Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/nytimes/android/external/cache/LocalCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 4409
    iput-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$HashIterator;->lastReturned:Lcom/nytimes/android/external/cache/LocalCache$WriteThroughEntry;

    return-void
.end method
