.class public final Lrx/internal/operators/CompletableOnSubscribeMergeDelayErrorArray;
.super Ljava/lang/Object;
.source "CompletableOnSubscribeMergeDelayErrorArray.java"

# interfaces
.implements Lrx/Completable$CompletableOnSubscribe;


# instance fields
.field final sources:[Lrx/Completable;


# direct methods
.method public constructor <init>([Lrx/Completable;)V
    .locals 0
    .param p1, "sources"    # [Lrx/Completable;

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lrx/internal/operators/CompletableOnSubscribeMergeDelayErrorArray;->sources:[Lrx/Completable;

    .line 32
    return-void
.end method


# virtual methods
.method public bridge synthetic call(Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 27
    check-cast p1, Lrx/Completable$CompletableSubscriber;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lrx/internal/operators/CompletableOnSubscribeMergeDelayErrorArray;->call(Lrx/Completable$CompletableSubscriber;)V

    return-void
.end method

.method public call(Lrx/Completable$CompletableSubscriber;)V
    .locals 10
    .param p1, "s"    # Lrx/Completable$CompletableSubscriber;

    .prologue
    .line 36
    new-instance v2, Lrx/subscriptions/CompositeSubscription;

    invoke-direct {v2}, Lrx/subscriptions/CompositeSubscription;-><init>()V

    .line 37
    .local v2, "set":Lrx/subscriptions/CompositeSubscription;
    new-instance v4, Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v0, p0, Lrx/internal/operators/CompletableOnSubscribeMergeDelayErrorArray;->sources:[Lrx/Completable;

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    invoke-direct {v4, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 39
    .local v4, "wip":Ljava/util/concurrent/atomic/AtomicInteger;
    new-instance v3, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 41
    .local v3, "q":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Throwable;>;"
    invoke-interface {p1, v2}, Lrx/Completable$CompletableSubscriber;->onSubscribe(Lrx/Subscription;)V

    .line 43
    iget-object v6, p0, Lrx/internal/operators/CompletableOnSubscribeMergeDelayErrorArray;->sources:[Lrx/Completable;

    .local v6, "arr$":[Lrx/Completable;
    array-length v9, v6

    .local v9, "len$":I
    const/4 v8, 0x0

    .local v8, "i$":I
    :goto_0
    if-ge v8, v9, :cond_3

    aget-object v7, v6, v8

    .line 44
    .local v7, "c":Lrx/Completable;
    invoke-virtual {v2}, Lrx/subscriptions/CompositeSubscription;->isUnsubscribed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 92
    .end local v7    # "c":Lrx/Completable;
    :cond_0
    :goto_1
    return-void

    .line 48
    .restart local v7    # "c":Lrx/Completable;
    :cond_1
    if-nez v7, :cond_2

    .line 49
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "A completable source is null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v0}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 50
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 43
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 54
    :cond_2
    new-instance v0, Lrx/internal/operators/CompletableOnSubscribeMergeDelayErrorArray$1;

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lrx/internal/operators/CompletableOnSubscribeMergeDelayErrorArray$1;-><init>(Lrx/internal/operators/CompletableOnSubscribeMergeDelayErrorArray;Lrx/subscriptions/CompositeSubscription;Ljava/util/Queue;Ljava/util/concurrent/atomic/AtomicInteger;Lrx/Completable$CompletableSubscriber;)V

    invoke-virtual {v7, v0}, Lrx/Completable;->subscribe(Lrx/Completable$CompletableSubscriber;)V

    goto :goto_2

    .line 84
    .end local v7    # "c":Lrx/Completable;
    :cond_3
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    .line 85
    invoke-interface {v3}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 86
    invoke-interface {p1}, Lrx/Completable$CompletableSubscriber;->onCompleted()V

    goto :goto_1

    .line 88
    :cond_4
    invoke-static {v3}, Lrx/internal/operators/CompletableOnSubscribeMerge;->collectErrors(Ljava/util/Queue;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {p1, v0}, Lrx/Completable$CompletableSubscriber;->onError(Ljava/lang/Throwable;)V

    goto :goto_1
.end method
