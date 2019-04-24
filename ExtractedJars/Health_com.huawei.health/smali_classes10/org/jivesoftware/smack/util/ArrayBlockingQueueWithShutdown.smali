.class public Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;
.super Ljava/util/AbstractQueue;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/BlockingQueue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:Ljava/lang/Object;>Ljava/util/AbstractQueue<TE;>;Ljava/util/concurrent/BlockingQueue<TE;>;"
    }
.end annotation


# instance fields
.field private count:I

.field private volatile isShutdown:Z

.field private final items:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TE;"
        }
    .end annotation
.end field

.field private final lock:Ljava/util/concurrent/locks/ReentrantLock;

.field private final notEmpty:Ljava/util/concurrent/locks/Condition;

.field private final notFull:Ljava/util/concurrent/locks/Condition;

.field private putIndex:I

.field private takeIndex:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 128
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;-><init>(IZ)V

    .line 129
    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 1

    .line 132
    invoke-direct {p0}, Ljava/util/AbstractQueue;-><init>()V

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->isShutdown:Z

    .line 133
    if-gtz p1, :cond_0

    .line 134
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 135
    :cond_0
    new-array v0, p1, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iput-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->items:[Ljava/lang/Object;

    .line 136
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0, p2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>(Z)V

    iput-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 137
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->notEmpty:Ljava/util/concurrent/locks/Condition;

    .line 138
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->notFull:Ljava/util/concurrent/locks/Condition;

    .line 139
    return-void
.end method

.method static synthetic access$000(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)I
    .locals 1

    .line 38
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->count:I

    return v0
.end method

.method static synthetic access$100(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)I
    .locals 1

    .line 38
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->takeIndex:I

    return v0
.end method

.method static synthetic access$200(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)[Ljava/lang/Object;
    .locals 1

    .line 38
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->items:[Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$300(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)I
    .locals 1

    .line 38
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->putIndex:I

    return v0
.end method

.method static synthetic access$400(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    .line 38
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method

.method static synthetic access$500(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;I)I
    .locals 1

    .line 38
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->inc(I)I

    move-result v0

    return v0
.end method

.method static synthetic access$600(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;I)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->removeAt(I)V

    return-void
.end method

.method private static final checkNotNull(Ljava/lang/Object;)V
    .locals 1

    .line 100
    if-nez p0, :cond_0

    .line 101
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 103
    :cond_0
    return-void
.end method

.method private final checkNotShutdown()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 106
    iget-boolean v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->isShutdown:Z

    if-eqz v0, :cond_0

    .line 107
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0

    .line 109
    :cond_0
    return-void
.end method

.method private final extract()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 68
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->items:[Ljava/lang/Object;

    iget v1, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->takeIndex:I

    aget-object v3, v0, v1

    .line 69
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->items:[Ljava/lang/Object;

    iget v1, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->takeIndex:I

    const/4 v2, 0x0

    aput-object v2, v0, v1

    .line 70
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->takeIndex:I

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->inc(I)I

    move-result v0

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->takeIndex:I

    .line 71
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->count:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->count:I

    .line 72
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->notFull:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signal()V

    .line 73
    return-object v3
.end method

.method private final hasElements()Z
    .locals 1

    .line 116
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->hasNoElements()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final hasNoElements()Z
    .locals 1

    .line 112
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->count:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final inc(I)I
    .locals 1

    .line 57
    add-int/lit8 p1, p1, 0x1

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->items:[Ljava/lang/Object;

    array-length v0, v0

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    return v0
.end method

.method private final insert(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .line 61
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->items:[Ljava/lang/Object;

    iget v1, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->putIndex:I

    aput-object p1, v0, v1

    .line 62
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->putIndex:I

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->inc(I)I

    move-result v0

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->putIndex:I

    .line 63
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->count:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->count:I

    .line 64
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->notEmpty:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signal()V

    .line 65
    return-void
.end method

.method private final isFull()Z
    .locals 2

    .line 120
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->count:I

    iget-object v1, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->items:[Ljava/lang/Object;

    array-length v1, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final isNotFull()Z
    .locals 1

    .line 124
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->isFull()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final removeAt(I)V
    .locals 4

    .line 77
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->takeIndex:I

    if-ne p1, v0, :cond_0

    .line 78
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->items:[Ljava/lang/Object;

    iget v1, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->takeIndex:I

    const/4 v2, 0x0

    aput-object v2, v0, v1

    .line 79
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->takeIndex:I

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->inc(I)I

    move-result v0

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->takeIndex:I

    goto :goto_2

    .line 83
    :cond_0
    :goto_0
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->inc(I)I

    move-result v3

    .line 84
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->putIndex:I

    if-eq v3, v0, :cond_1

    .line 85
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->items:[Ljava/lang/Object;

    iget-object v1, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->items:[Ljava/lang/Object;

    aget-object v1, v1, v3

    aput-object v1, v0, p1

    .line 86
    move p1, v3

    goto :goto_1

    .line 89
    :cond_1
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->items:[Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v1, v0, p1

    .line 90
    iput p1, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->putIndex:I

    .line 91
    goto :goto_2

    .line 93
    :goto_1
    goto :goto_0

    .line 95
    :goto_2
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->count:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->count:I

    .line 96
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->notFull:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signal()V

    .line 97
    return-void
.end method


# virtual methods
.method public drainTo(Ljava/util/Collection;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<-TE;>;)I"
        }
    .end annotation

    .line 361
    invoke-static {p1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->checkNotNull(Ljava/lang/Object;)V

    .line 362
    if-ne p1, p0, :cond_0

    .line 363
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 365
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 367
    :try_start_0
    iget v2, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->takeIndex:I

    .line 368
    const/4 v3, 0x0

    .line 369
    :goto_0
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->count:I

    if-ge v3, v0, :cond_1

    .line 370
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->items:[Ljava/lang/Object;

    aget-object v0, v0, v2

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 371
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->items:[Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v1, v0, v2

    .line 372
    invoke-direct {p0, v2}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->inc(I)I

    move-result v2

    .line 369
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 374
    :cond_1
    if-lez v3, :cond_2

    .line 375
    const/4 v0, 0x0

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->count:I

    .line 376
    const/4 v0, 0x0

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->putIndex:I

    .line 377
    const/4 v0, 0x0

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->takeIndex:I

    .line 378
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->notFull:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 380
    :cond_2
    move v4, v3

    .line 383
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 380
    return v4

    .line 383
    :catchall_0
    move-exception v5

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 384
    throw v5
.end method

.method public drainTo(Ljava/util/Collection;I)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<-TE;>;I)I"
        }
    .end annotation

    .line 389
    invoke-static {p1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->checkNotNull(Ljava/lang/Object;)V

    .line 390
    if-ne p1, p0, :cond_0

    .line 391
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 393
    :cond_0
    if-gtz p2, :cond_1

    .line 394
    const/4 v0, 0x0

    return v0

    .line 396
    :cond_1
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 398
    :try_start_0
    iget v2, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->takeIndex:I

    .line 399
    const/4 v3, 0x0

    .line 400
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->count:I

    if-ge p2, v0, :cond_2

    move v4, p2

    goto :goto_0

    :cond_2
    iget v4, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->count:I

    .line 401
    :goto_0
    if-ge v3, v4, :cond_3

    .line 402
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->items:[Ljava/lang/Object;

    aget-object v0, v0, v2

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 403
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->items:[Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v1, v0, v2

    .line 404
    invoke-direct {p0, v2}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->inc(I)I

    move-result v2

    .line 401
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 406
    :cond_3
    if-lez v3, :cond_4

    .line 407
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->count:I

    sub-int/2addr v0, v3

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->count:I

    .line 408
    iput v2, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->takeIndex:I

    .line 409
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->notFull:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 411
    :cond_4
    move v5, v3

    .line 414
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 411
    return v5

    .line 414
    :catchall_0
    move-exception v6

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 415
    throw v6
.end method

.method public isShutdown()Z
    .locals 3

    .line 177
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 179
    :try_start_0
    iget-boolean v1, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->isShutdown:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 179
    return v1

    .line 181
    :catchall_0
    move-exception v2

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 182
    throw v2
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<TE;>;"
        }
    .end annotation

    .line 431
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 433
    :try_start_0
    new-instance v1, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;

    invoke-direct {v1, p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;-><init>(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 436
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 433
    return-object v1

    .line 436
    :catchall_0
    move-exception v2

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 437
    throw v2
.end method

.method public offer(Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .line 213
    invoke-static {p1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->checkNotNull(Ljava/lang/Object;)V

    .line 214
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 216
    :try_start_0
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->isFull()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->isShutdown:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    .line 217
    :cond_0
    const/4 v1, 0x0

    .line 225
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 217
    return v1

    .line 220
    :cond_1
    :try_start_1
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->insert(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 221
    const/4 v1, 0x1

    .line 225
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 221
    return v1

    .line 225
    :catchall_0
    move-exception v2

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 226
    throw v2
.end method

.method public offer(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;JLjava/util/concurrent/TimeUnit;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 268
    invoke-static {p1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->checkNotNull(Ljava/lang/Object;)V

    .line 269
    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    .line 270
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lockInterruptibly()V

    .line 273
    :goto_0
    :try_start_0
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->isNotFull()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 274
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->insert(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 275
    const/4 v4, 0x1

    .line 291
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 275
    return v4

    .line 277
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-gtz v0, :cond_1

    .line 278
    const/4 v4, 0x0

    .line 291
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 278
    return v4

    .line 281
    :cond_1
    :try_start_1
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->notFull:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0, v2, v3}, Ljava/util/concurrent/locks/Condition;->awaitNanos(J)J

    move-result-wide v2

    .line 282
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->checkNotShutdown()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 287
    goto :goto_0

    .line 284
    :catch_0
    move-exception v4

    .line 285
    :try_start_2
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->notFull:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signal()V

    .line 286
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 291
    :catchall_0
    move-exception v5

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 292
    throw v5
.end method

.method public peek()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 202
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 204
    :try_start_0
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->hasNoElements()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->items:[Ljava/lang/Object;

    iget v1, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->takeIndex:I

    aget-object v2, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 207
    :goto_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 204
    return-object v2

    .line 207
    :catchall_0
    move-exception v3

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 208
    throw v3
.end method

.method public poll()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 187
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 189
    :try_start_0
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->hasNoElements()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 190
    const/4 v1, 0x0

    .line 196
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 190
    return-object v1

    .line 192
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->extract()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    .line 193
    move-object v2, v1

    .line 196
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 193
    return-object v2

    .line 196
    :catchall_0
    move-exception v3

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 197
    throw v3
.end method

.method public poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/concurrent/TimeUnit;)TE;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 321
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    .line 322
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lockInterruptibly()V

    .line 324
    :try_start_0
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->checkNotShutdown()V

    .line 326
    :goto_0
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->hasElements()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 327
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->extract()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 328
    move-object v5, v4

    .line 344
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 328
    return-object v5

    .line 330
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-gtz v0, :cond_1

    .line 331
    const/4 v4, 0x0

    .line 344
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 331
    return-object v4

    .line 334
    :cond_1
    :try_start_1
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->notEmpty:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0, v2, v3}, Ljava/util/concurrent/locks/Condition;->awaitNanos(J)J

    move-result-wide v2

    .line 335
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->checkNotShutdown()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 340
    goto :goto_0

    .line 337
    :catch_0
    move-exception v4

    .line 338
    :try_start_2
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->notEmpty:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signal()V

    .line 339
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 344
    :catchall_0
    move-exception v6

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 345
    throw v6
.end method

.method public put(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 245
    invoke-static {p1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->checkNotNull(Ljava/lang/Object;)V

    .line 246
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lockInterruptibly()V

    .line 249
    :goto_0
    :try_start_0
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->isFull()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 251
    :try_start_1
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->notFull:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->await()V

    .line 252
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->checkNotShutdown()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 257
    goto :goto_0

    .line 254
    :catch_0
    move-exception v1

    .line 255
    :try_start_2
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->notFull:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signal()V

    .line 256
    throw v1

    .line 259
    :cond_0
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->insert(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 262
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 263
    goto :goto_1

    .line 262
    :catchall_0
    move-exception v2

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 263
    throw v2

    .line 264
    :goto_1
    return-void
.end method

.method public remainingCapacity()I
    .locals 4

    .line 350
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 352
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->items:[Ljava/lang/Object;

    array-length v0, v0

    iget v1, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->count:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-int v2, v0, v1

    .line 355
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 352
    return v2

    .line 355
    :catchall_0
    move-exception v3

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 356
    throw v3
.end method

.method public shutdown()V
    .locals 2

    .line 146
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 148
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->isShutdown:Z

    .line 149
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->notEmpty:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V

    .line 150
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->notFull:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 154
    goto :goto_0

    .line 153
    :catchall_0
    move-exception v1

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 154
    throw v1

    .line 155
    :goto_0
    return-void
.end method

.method public size()I
    .locals 3

    .line 420
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 422
    :try_start_0
    iget v1, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->count:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 425
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 422
    return v1

    .line 425
    :catchall_0
    move-exception v2

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 426
    throw v2
.end method

.method public start()V
    .locals 2

    .line 162
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 164
    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->isShutdown:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 168
    goto :goto_0

    .line 167
    :catchall_0
    move-exception v1

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 168
    throw v1

    .line 169
    :goto_0
    return-void
.end method

.method public take()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 298
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lockInterruptibly()V

    .line 300
    :try_start_0
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->checkNotShutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 302
    :goto_0
    :try_start_1
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->hasNoElements()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 303
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->notEmpty:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->await()V

    .line 304
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->checkNotShutdown()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 310
    :cond_0
    goto :goto_1

    .line 307
    :catch_0
    move-exception v1

    .line 308
    :try_start_2
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->notEmpty:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signal()V

    .line 309
    throw v1

    .line 311
    :goto_1
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->extract()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v1

    .line 312
    move-object v2, v1

    .line 315
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 312
    return-object v2

    .line 315
    :catchall_0
    move-exception v3

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 316
    throw v3
.end method
