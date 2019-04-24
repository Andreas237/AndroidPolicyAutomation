.class final Ljava9/util/LBQSpliterator;
.super Ljava/lang/Object;
.source "LBQSpliterator.java"

# interfaces
.implements Ljava9/util/Spliterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava9/util/Spliterator<",
        "TE;>;"
    }
.end annotation


# static fields
.field private static final HEAD_OFF:J

.field private static final NODE_ITEM_OFF:J

.field private static final NODE_NEXT_OFF:J

.field private static final PUT_LOCK_OFF:J

.field private static final TAKE_LOCK_OFF:J

.field private static final U:Lsun/misc/Unsafe;


# instance fields
.field private batch:I

.field private current:Ljava/lang/Object;

.field private est:J

.field private exhausted:Z

.field private final putLock:Ljava/util/concurrent/locks/ReentrantLock;

.field private final queue:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "TE;>;"
        }
    .end annotation
.end field

.field private final takeLock:Ljava/util/concurrent/locks/ReentrantLock;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 217
    sget-object v0, Ljava9/util/UnsafeAccess;->unsafe:Lsun/misc/Unsafe;

    sput-object v0, Ljava9/util/LBQSpliterator;->U:Lsun/misc/Unsafe;

    :try_start_0
    const-string v0, "java.util.concurrent.LinkedBlockingQueue$Node"

    .line 226
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 227
    sget-object v1, Ljava9/util/LBQSpliterator;->U:Lsun/misc/Unsafe;

    const-class v2, Ljava/util/concurrent/LinkedBlockingQueue;

    const-string v3, "head"

    .line 228
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 227
    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v1

    sput-wide v1, Ljava9/util/LBQSpliterator;->HEAD_OFF:J

    .line 229
    sget-object v1, Ljava9/util/LBQSpliterator;->U:Lsun/misc/Unsafe;

    const-string v2, "item"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v1

    sput-wide v1, Ljava9/util/LBQSpliterator;->NODE_ITEM_OFF:J

    .line 230
    sget-object v1, Ljava9/util/LBQSpliterator;->U:Lsun/misc/Unsafe;

    const-string v2, "next"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    sput-wide v0, Ljava9/util/LBQSpliterator;->NODE_NEXT_OFF:J

    .line 231
    sget-object v0, Ljava9/util/LBQSpliterator;->U:Lsun/misc/Unsafe;

    const-class v1, Ljava/util/concurrent/LinkedBlockingQueue;

    const-string v2, "putLock"

    .line 232
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 231
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    sput-wide v0, Ljava9/util/LBQSpliterator;->PUT_LOCK_OFF:J

    .line 233
    sget-object v0, Ljava9/util/LBQSpliterator;->U:Lsun/misc/Unsafe;

    const-class v1, Ljava/util/concurrent/LinkedBlockingQueue;

    const-string v2, "takeLock"

    .line 234
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 233
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    sput-wide v0, Ljava9/util/LBQSpliterator;->TAKE_LOCK_OFF:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 236
    new-instance v1, Ljava/lang/Error;

    invoke-direct {v1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private constructor <init>(Ljava/util/concurrent/LinkedBlockingQueue;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "TE;>;)V"
        }
    .end annotation

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Ljava9/util/LBQSpliterator;->queue:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 41
    invoke-virtual {p1}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Ljava9/util/LBQSpliterator;->est:J

    .line 42
    invoke-static {p1}, Ljava9/util/LBQSpliterator;->getPutLock(Ljava/util/concurrent/LinkedBlockingQueue;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    iput-object v0, p0, Ljava9/util/LBQSpliterator;->putLock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 43
    invoke-static {p1}, Ljava9/util/LBQSpliterator;->getTakeLock(Ljava/util/concurrent/LinkedBlockingQueue;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object p1

    iput-object p1, p0, Ljava9/util/LBQSpliterator;->takeLock:Ljava/util/concurrent/locks/ReentrantLock;

    return-void
.end method

.method private fullyLock()V
    .locals 1

    .line 175
    iget-object v0, p0, Ljava9/util/LBQSpliterator;->putLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 176
    iget-object v0, p0, Ljava9/util/LBQSpliterator;->takeLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    return-void
.end method

.method private fullyUnlock()V
    .locals 1

    .line 183
    iget-object v0, p0, Ljava9/util/LBQSpliterator;->takeLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 184
    iget-object v0, p0, Ljava9/util/LBQSpliterator;->putLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void
.end method

.method private static getHeadNext(Ljava/util/concurrent/LinkedBlockingQueue;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 199
    sget-object v0, Ljava9/util/LBQSpliterator;->U:Lsun/misc/Unsafe;

    sget-wide v1, Ljava9/util/LBQSpliterator;->HEAD_OFF:J

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava9/util/LBQSpliterator;->getNextNode(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static getNextNode(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 206
    sget-object v0, Ljava9/util/LBQSpliterator;->U:Lsun/misc/Unsafe;

    sget-wide v1, Ljava9/util/LBQSpliterator;->NODE_NEXT_OFF:J

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static getNodeItem(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .line 213
    sget-object v0, Ljava9/util/LBQSpliterator;->U:Lsun/misc/Unsafe;

    sget-wide v1, Ljava9/util/LBQSpliterator;->NODE_ITEM_OFF:J

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static getPutLock(Ljava/util/concurrent/LinkedBlockingQueue;)Ljava/util/concurrent/locks/ReentrantLock;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "*>;)",
            "Ljava/util/concurrent/locks/ReentrantLock;"
        }
    .end annotation

    .line 188
    sget-object v0, Ljava9/util/LBQSpliterator;->U:Lsun/misc/Unsafe;

    sget-wide v1, Ljava9/util/LBQSpliterator;->PUT_LOCK_OFF:J

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/locks/ReentrantLock;

    return-object p0
.end method

.method private static getTakeLock(Ljava/util/concurrent/LinkedBlockingQueue;)Ljava/util/concurrent/locks/ReentrantLock;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "*>;)",
            "Ljava/util/concurrent/locks/ReentrantLock;"
        }
    .end annotation

    .line 192
    sget-object v0, Ljava9/util/LBQSpliterator;->U:Lsun/misc/Unsafe;

    sget-wide v1, Ljava9/util/LBQSpliterator;->TAKE_LOCK_OFF:J

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/locks/ReentrantLock;

    return-object p0
.end method

.method static spliterator(Ljava/util/concurrent/LinkedBlockingQueue;)Ljava9/util/Spliterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "TT;>;)",
            "Ljava9/util/Spliterator<",
            "TT;>;"
        }
    .end annotation

    .line 47
    new-instance v0, Ljava9/util/LBQSpliterator;

    invoke-direct {v0, p0}, Ljava9/util/LBQSpliterator;-><init>(Ljava/util/concurrent/LinkedBlockingQueue;)V

    return-object v0
.end method


# virtual methods
.method public characteristics()I
    .locals 1

    const/16 v0, 0x1110

    return v0
.end method

.method public estimateSize()J
    .locals 2

    .line 63
    iget-wide v0, p0, Ljava9/util/LBQSpliterator;->est:J

    return-wide v0
.end method

.method forEachFrom(Ljava9/util/function/Consumer;Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TE;>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 149
    :cond_0
    invoke-direct {p0}, Ljava9/util/LBQSpliterator;->fullyLock()V

    if-nez v1, :cond_4

    if-nez p2, :cond_1

    .line 152
    :try_start_0
    iget-object p2, p0, Ljava9/util/LBQSpliterator;->queue:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-static {p2}, Ljava9/util/LBQSpliterator;->getHeadNext(Ljava/util/concurrent/LinkedBlockingQueue;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    :goto_0
    move-object v1, p2

    :goto_1
    if-eqz v1, :cond_3

    .line 154
    invoke-static {v1}, Ljava9/util/LBQSpliterator;->getNodeItem(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    const/16 v3, 0x40

    if-ne v2, v3, :cond_2

    goto :goto_2

    .line 153
    :cond_2
    invoke-virtual {p0, v1}, Ljava9/util/LBQSpliterator;->succ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    .line 156
    :cond_3
    :goto_2
    new-array v1, v2, [Ljava/lang/Object;

    :cond_4
    const/4 v3, 0x0

    :goto_3
    if-eqz p2, :cond_6

    if-ge v3, v2, :cond_6

    .line 159
    invoke-static {p2}, Ljava9/util/LBQSpliterator;->getNodeItem(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v3

    if-eqz v4, :cond_5

    add-int/lit8 v3, v3, 0x1

    .line 158
    :cond_5
    invoke-virtual {p0, p2}, Ljava9/util/LBQSpliterator;->succ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    .line 162
    :goto_4
    invoke-direct {p0}, Ljava9/util/LBQSpliterator;->fullyUnlock()V

    throw p1

    :cond_6
    invoke-direct {p0}, Ljava9/util/LBQSpliterator;->fullyUnlock()V

    const/4 v4, 0x0

    :goto_5
    if-ge v4, v3, :cond_7

    .line 165
    aget-object v5, v1, v4

    .line 166
    invoke-interface {p1, v5}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_7
    if-lez v3, :cond_8

    if-nez p2, :cond_0

    :cond_8
    return-void
.end method

.method public forEachRemaining(Ljava9/util/function/Consumer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TE;>;)V"
        }
    .end annotation

    .line 68
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    iget-boolean v0, p0, Ljava9/util/LBQSpliterator;->exhausted:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 70
    iput-boolean v0, p0, Ljava9/util/LBQSpliterator;->exhausted:Z

    .line 71
    iget-object v0, p0, Ljava9/util/LBQSpliterator;->current:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 72
    iput-object v1, p0, Ljava9/util/LBQSpliterator;->current:Ljava/lang/Object;

    .line 73
    invoke-virtual {p0, p1, v0}, Ljava9/util/LBQSpliterator;->forEachFrom(Ljava9/util/function/Consumer;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public synthetic getComparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "-TT;>;"
        }
    .end annotation

    invoke-static {p0}, Ljava9/util/Spliterator$-CC;->$default$getComparator(Ljava9/util/Spliterator;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic getExactSizeIfKnown()J
    .locals 2

    invoke-static {p0}, Ljava9/util/Spliterator$-CC;->$default$getExactSizeIfKnown(Ljava9/util/Spliterator;)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic hasCharacteristics(I)Z
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/Spliterator$-CC;->$default$hasCharacteristics(Ljava9/util/Spliterator;I)Z

    move-result p1

    return p1
.end method

.method succ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 51
    invoke-static {p1}, Ljava9/util/LBQSpliterator;->getNextNode(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ljava9/util/LBQSpliterator;->queue:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-static {p1}, Ljava9/util/LBQSpliterator;->getHeadNext(Ljava/util/concurrent/LinkedBlockingQueue;)Ljava/lang/Object;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public tryAdvance(Ljava9/util/function/Consumer;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TE;>;)Z"
        }
    .end annotation

    .line 79
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    iget-boolean v0, p0, Ljava9/util/LBQSpliterator;->exhausted:Z

    if-nez v0, :cond_3

    const/4 v0, 0x0

    .line 82
    invoke-direct {p0}, Ljava9/util/LBQSpliterator;->fullyLock()V

    .line 85
    :try_start_0
    iget-object v1, p0, Ljava9/util/LBQSpliterator;->current:Ljava/lang/Object;

    if-nez v1, :cond_0

    iget-object v1, p0, Ljava9/util/LBQSpliterator;->queue:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-static {v1}, Ljava9/util/LBQSpliterator;->getHeadNext(Ljava/util/concurrent/LinkedBlockingQueue;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 87
    :cond_0
    invoke-static {v1}, Ljava9/util/LBQSpliterator;->getNodeItem(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 88
    invoke-virtual {p0, v1}, Ljava9/util/LBQSpliterator;->succ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    if-nez v1, :cond_0

    .line 90
    :cond_1
    iput-object v1, p0, Ljava9/util/LBQSpliterator;->current:Ljava/lang/Object;

    const/4 v2, 0x1

    if-nez v1, :cond_2

    .line 91
    iput-boolean v2, p0, Ljava9/util/LBQSpliterator;->exhausted:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    :cond_2
    invoke-direct {p0}, Ljava9/util/LBQSpliterator;->fullyUnlock()V

    if-eqz v0, :cond_3

    .line 96
    invoke-interface {p1, v0}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return v2

    :catchall_0
    move-exception p1

    .line 93
    invoke-direct {p0}, Ljava9/util/LBQSpliterator;->fullyUnlock()V

    throw p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public trySplit()Ljava9/util/Spliterator;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/Spliterator<",
            "TE;>;"
        }
    .end annotation

    .line 106
    iget-object v0, p0, Ljava9/util/LBQSpliterator;->queue:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 107
    iget-boolean v1, p0, Ljava9/util/LBQSpliterator;->exhausted:Z

    if-nez v1, :cond_7

    iget-object v1, p0, Ljava9/util/LBQSpliterator;->current:Ljava/lang/Object;

    if-nez v1, :cond_0

    .line 108
    invoke-static {v0}, Ljava9/util/LBQSpliterator;->getHeadNext(Ljava/util/concurrent/LinkedBlockingQueue;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 109
    :cond_0
    invoke-static {v1}, Ljava9/util/LBQSpliterator;->getNextNode(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 110
    iget v1, p0, Ljava9/util/LBQSpliterator;->batch:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    const/high16 v3, 0x2000000

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, p0, Ljava9/util/LBQSpliterator;->batch:I

    .line 111
    new-array v3, v1, [Ljava/lang/Object;

    .line 113
    iget-object v4, p0, Ljava9/util/LBQSpliterator;->current:Ljava/lang/Object;

    .line 114
    invoke-direct {p0}, Ljava9/util/LBQSpliterator;->fullyLock()V

    const/4 v5, 0x0

    if-nez v4, :cond_2

    .line 116
    :try_start_0
    invoke-static {v0}, Ljava9/util/LBQSpliterator;->getHeadNext(Ljava/util/concurrent/LinkedBlockingQueue;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    :goto_0
    const/4 v0, 0x0

    :goto_1
    if-eqz v4, :cond_4

    if-ge v0, v1, :cond_4

    .line 118
    invoke-static {v4}, Ljava9/util/LBQSpliterator;->getNodeItem(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v3, v0

    if-eqz v6, :cond_3

    add-int/lit8 v0, v0, 0x1

    .line 117
    :cond_3
    invoke-virtual {p0, v4}, Ljava9/util/LBQSpliterator;->succ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 121
    :goto_2
    invoke-direct {p0}, Ljava9/util/LBQSpliterator;->fullyUnlock()V

    throw v0

    :cond_4
    :goto_3
    invoke-direct {p0}, Ljava9/util/LBQSpliterator;->fullyUnlock()V

    .line 123
    iput-object v4, p0, Ljava9/util/LBQSpliterator;->current:Ljava/lang/Object;

    const-wide/16 v6, 0x0

    if-nez v4, :cond_5

    .line 124
    iput-wide v6, p0, Ljava9/util/LBQSpliterator;->est:J

    .line 125
    iput-boolean v2, p0, Ljava9/util/LBQSpliterator;->exhausted:Z

    goto :goto_4

    .line 127
    :cond_5
    iget-wide v1, p0, Ljava9/util/LBQSpliterator;->est:J

    int-to-long v8, v0

    sub-long/2addr v1, v8

    iput-wide v1, p0, Ljava9/util/LBQSpliterator;->est:J

    cmp-long v4, v1, v6

    if-gez v4, :cond_6

    .line 128
    iput-wide v6, p0, Ljava9/util/LBQSpliterator;->est:J

    :cond_6
    :goto_4
    if-lez v0, :cond_7

    const/16 v1, 0x1110

    .line 131
    invoke-static {v3, v5, v0, v1}, Ljava9/util/Spliterators;->spliterator([Ljava/lang/Object;III)Ljava9/util/Spliterator;

    move-result-object v0

    return-object v0

    :cond_7
    const/4 v0, 0x0

    return-object v0
.end method
