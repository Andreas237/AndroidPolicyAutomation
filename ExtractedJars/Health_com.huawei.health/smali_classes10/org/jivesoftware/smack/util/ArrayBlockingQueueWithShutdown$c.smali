.class Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Iterator<TE;>;"
    }
.end annotation


# instance fields
.field private b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field final synthetic c:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

.field private d:I

.field private e:I


# direct methods
.method constructor <init>(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)V
    .locals 2

    .line 445
    iput-object p1, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->c:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 446
    const/4 v0, -0x1

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->d:I

    .line 447
    invoke-static {p1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->access$000(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)I

    move-result v0

    if-nez v0, :cond_0

    .line 448
    const/4 v0, -0x1

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->e:I

    goto :goto_0

    .line 451
    :cond_0
    invoke-static {p1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->access$100(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)I

    move-result v0

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->e:I

    .line 452
    invoke-static {p1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->access$200(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->access$100(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)I

    move-result v1

    aget-object v0, v0, v1

    iput-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->b:Ljava/lang/Object;

    .line 454
    :goto_0
    return-void
.end method

.method private e()V
    .locals 2

    .line 462
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->e:I

    iget-object v1, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->c:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-static {v1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->access$300(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 463
    const/4 v0, -0x1

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->e:I

    .line 464
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->b:Ljava/lang/Object;

    goto :goto_0

    .line 467
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->c:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-static {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->access$200(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->e:I

    aget-object v0, v0, v1

    iput-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->b:Ljava/lang/Object;

    .line 468
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->b:Ljava/lang/Object;

    if-nez v0, :cond_1

    .line 469
    const/4 v0, -0x1

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->e:I

    .line 472
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 458
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->e:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 476
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->c:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-static {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->access$400(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 478
    :try_start_0
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->e:I

    if-gez v0, :cond_0

    .line 479
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 481
    :cond_0
    iget v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->e:I

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->d:I

    .line 482
    iget-object v2, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->b:Ljava/lang/Object;

    .line 483
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->c:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    iget v1, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->e:I

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->access$500(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;I)I

    move-result v0

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->e:I

    .line 484
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 485
    move-object v3, v2

    .line 488
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->c:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-static {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->access$400(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 485
    return-object v3

    .line 488
    :catchall_0
    move-exception v4

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->c:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-static {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->access$400(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 489
    throw v4
.end method

.method public remove()V
    .locals 4

    .line 494
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->c:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-static {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->access$400(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 496
    :try_start_0
    iget v1, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->d:I

    .line 497
    if-gez v1, :cond_0

    .line 498
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 500
    :cond_0
    const/4 v0, -0x1

    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->d:I

    .line 501
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->c:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-static {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->access$100(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)I

    move-result v2

    .line 502
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->c:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->access$600(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;I)V

    .line 503
    if-ne v1, v2, :cond_1

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->c:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-static {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->access$100(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    iput v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->e:I

    .line 504
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 507
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->c:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-static {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->access$400(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 508
    goto :goto_1

    .line 507
    :catchall_0
    move-exception v3

    iget-object v0, p0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown$c;->c:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-static {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->access$400(Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 508
    throw v3

    .line 509
    :goto_1
    return-void
.end method
