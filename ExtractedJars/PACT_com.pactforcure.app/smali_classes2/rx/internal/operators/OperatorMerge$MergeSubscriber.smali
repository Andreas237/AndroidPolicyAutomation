.class final Lrx/internal/operators/OperatorMerge$MergeSubscriber;
.super Lrx/Subscriber;
.source "OperatorMerge.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrx/internal/operators/OperatorMerge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "MergeSubscriber"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lrx/Subscriber",
        "<",
        "Lrx/Observable",
        "<+TT;>;>;"
    }
.end annotation


# static fields
.field static final EMPTY:[Lrx/internal/operators/OperatorMerge$InnerSubscriber;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lrx/internal/operators/OperatorMerge$InnerSubscriber",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field final child:Lrx/Subscriber;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrx/Subscriber",
            "<-TT;>;"
        }
    .end annotation
.end field

.field final delayErrors:Z

.field volatile done:Z

.field emitting:Z

.field volatile errors:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue",
            "<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field final innerGuard:Ljava/lang/Object;

.field volatile innerSubscribers:[Lrx/internal/operators/OperatorMerge$InnerSubscriber;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lrx/internal/operators/OperatorMerge$InnerSubscriber",
            "<*>;"
        }
    .end annotation
.end field

.field lastId:J

.field lastIndex:I

.field final maxConcurrent:I

.field missed:Z

.field final nl:Lrx/internal/operators/NotificationLite;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrx/internal/operators/NotificationLite",
            "<TT;>;"
        }
    .end annotation
.end field

.field producer:Lrx/internal/operators/OperatorMerge$MergeProducer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrx/internal/operators/OperatorMerge$MergeProducer",
            "<TT;>;"
        }
    .end annotation
.end field

.field volatile queue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field scalarEmissionCount:I

.field final scalarEmissionLimit:I

.field volatile subscriptions:Lrx/subscriptions/CompositeSubscription;

.field uniqueId:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 181
    const/4 v0, 0x0

    new-array v0, v0, [Lrx/internal/operators/OperatorMerge$InnerSubscriber;

    sput-object v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->EMPTY:[Lrx/internal/operators/OperatorMerge$InnerSubscriber;

    return-void
.end method

.method public constructor <init>(Lrx/Subscriber;ZI)V
    .locals 2
    .param p2, "delayErrors"    # Z
    .param p3, "maxConcurrent"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrx/Subscriber",
            "<-TT;>;ZI)V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    .local p1, "child":Lrx/Subscriber;, "Lrx/Subscriber<-TT;>;"
    const v1, 0x7fffffff

    .line 187
    invoke-direct {p0}, Lrx/Subscriber;-><init>()V

    .line 188
    iput-object p1, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->child:Lrx/Subscriber;

    .line 189
    iput-boolean p2, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->delayErrors:Z

    .line 190
    iput p3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->maxConcurrent:I

    .line 191
    invoke-static {}, Lrx/internal/operators/NotificationLite;->instance()Lrx/internal/operators/NotificationLite;

    move-result-object v0

    iput-object v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->nl:Lrx/internal/operators/NotificationLite;

    .line 192
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->innerGuard:Ljava/lang/Object;

    .line 193
    sget-object v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->EMPTY:[Lrx/internal/operators/OperatorMerge$InnerSubscriber;

    iput-object v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->innerSubscribers:[Lrx/internal/operators/OperatorMerge$InnerSubscriber;

    .line 194
    if-ne p3, v1, :cond_0

    .line 195
    iput v1, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->scalarEmissionLimit:I

    .line 196
    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->request(J)V

    .line 201
    :goto_0
    return-void

    .line 198
    :cond_0
    const/4 v0, 0x1

    shr-int/lit8 v1, p3, 0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->scalarEmissionLimit:I

    .line 199
    int-to-long v0, p3

    invoke-virtual {p0, v0, v1}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->request(J)V

    goto :goto_0
.end method

.method private reportError()V
    .locals 3

    .prologue
    .line 251
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->errors:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 252
    .local v0, "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Throwable;>;"
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 253
    iget-object v2, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->child:Lrx/Subscriber;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    invoke-virtual {v2, v1}, Lrx/Subscriber;->onError(Ljava/lang/Throwable;)V

    .line 257
    :goto_0
    return-void

    .line 255
    :cond_0
    iget-object v1, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->child:Lrx/Subscriber;

    new-instance v2, Lrx/exceptions/CompositeException;

    invoke-direct {v2, v0}, Lrx/exceptions/CompositeException;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v2}, Lrx/Subscriber;->onError(Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method addInner(Lrx/internal/operators/OperatorMerge$InnerSubscriber;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrx/internal/operators/OperatorMerge$InnerSubscriber",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 272
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    .local p1, "inner":Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "Lrx/internal/operators/OperatorMerge$InnerSubscriber<TT;>;"
    invoke-virtual {p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->getOrCreateComposite()Lrx/subscriptions/CompositeSubscription;

    move-result-object v3

    invoke-virtual {v3, p1}, Lrx/subscriptions/CompositeSubscription;->add(Lrx/Subscription;)V

    .line 273
    iget-object v4, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->innerGuard:Ljava/lang/Object;

    monitor-enter v4

    .line 274
    :try_start_0
    iget-object v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->innerSubscribers:[Lrx/internal/operators/OperatorMerge$InnerSubscriber;

    .line 275
    .local v0, "a":[Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "[Lrx/internal/operators/OperatorMerge$InnerSubscriber<*>;"
    array-length v2, v0

    .line 276
    .local v2, "n":I
    add-int/lit8 v3, v2, 0x1

    new-array v1, v3, [Lrx/internal/operators/OperatorMerge$InnerSubscriber;

    .line 277
    .local v1, "b":[Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "[Lrx/internal/operators/OperatorMerge$InnerSubscriber<*>;"
    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static {v0, v3, v1, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 278
    aput-object p1, v1, v2

    .line 279
    iput-object v1, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->innerSubscribers:[Lrx/internal/operators/OperatorMerge$InnerSubscriber;

    .line 280
    monitor-exit v4

    .line 281
    return-void

    .line 280
    .end local v0    # "a":[Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "[Lrx/internal/operators/OperatorMerge$InnerSubscriber<*>;"
    .end local v1    # "b":[Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "[Lrx/internal/operators/OperatorMerge$InnerSubscriber<*>;"
    .end local v2    # "n":I
    :catchall_0
    move-exception v3

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3
.end method

.method checkTerminate()Z
    .locals 3

    .prologue
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    const/4 v1, 0x1

    .line 791
    iget-object v2, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->child:Lrx/Subscriber;

    invoke-virtual {v2}, Lrx/Subscriber;->isUnsubscribed()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 803
    :goto_0
    return v1

    .line 794
    :cond_0
    iget-object v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->errors:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 795
    .local v0, "e":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Throwable;>;"
    iget-boolean v2, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->delayErrors:Z

    if-nez v2, :cond_1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 797
    :try_start_0
    invoke-direct {p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->reportError()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 799
    invoke-virtual {p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->unsubscribe()V

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-virtual {p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->unsubscribe()V

    throw v1

    .line 803
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method emit()V
    .locals 1

    .prologue
    .line 540
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    monitor-enter p0

    .line 541
    :try_start_0
    iget-boolean v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    if-eqz v0, :cond_0

    .line 542
    const/4 v0, 0x1

    iput-boolean v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->missed:Z

    .line 543
    monitor-exit p0

    .line 548
    :goto_0
    return-void

    .line 545
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 546
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 547
    invoke-virtual {p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitLoop()V

    goto :goto_0

    .line 546
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method emitLoop()V
    .locals 32

    .prologue
    .line 553
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    const/16 v23, 0x0

    .line 555
    .local v23, "skipFinal":Z
    :try_start_0
    move-object/from16 v0, p0

    iget-object v4, v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->child:Lrx/Subscriber;

    .line 558
    .local v4, "child":Lrx/Subscriber;, "Lrx/Subscriber<-TT;>;"
    :cond_0
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->checkTerminate()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    move-result v30

    if-eqz v30, :cond_2

    .line 559
    const/16 v23, 0x1

    .line 777
    if-nez v23, :cond_1

    .line 778
    monitor-enter p0

    .line 779
    const/16 v30, 0x0

    :try_start_1
    move/from16 v0, v30

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 780
    monitor-exit p0

    .line 783
    :cond_1
    :goto_1
    return-void

    .line 780
    :catchall_0
    move-exception v30

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v30

    .line 562
    :cond_2
    :try_start_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->queue:Ljava/util/Queue;

    move-object/from16 v26, v0

    .line 564
    .local v26, "svq":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Object;>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->producer:Lrx/internal/operators/OperatorMerge$MergeProducer;

    move-object/from16 v30, v0

    invoke-virtual/range {v30 .. v30}, Lrx/internal/operators/OperatorMerge$MergeProducer;->get()J

    move-result-wide v20

    .line 565
    .local v20, "r":J
    const-wide v30, 0x7fffffffffffffffL

    cmp-long v30, v20, v30

    if-nez v30, :cond_4

    const/16 v28, 0x1

    .line 568
    .local v28, "unbounded":Z
    :goto_2
    const/16 v19, 0x0

    .line 571
    .local v19, "replenishMain":I
    if-eqz v26, :cond_8

    .line 573
    :cond_3
    const/16 v22, 0x0

    .line 574
    .local v22, "scalarEmission":I
    const/16 v16, 0x0

    .line 575
    :goto_3
    const-wide/16 v30, 0x0

    cmp-long v30, v20, v30

    if-lez v30, :cond_6

    .line 576
    invoke-interface/range {v26 .. v26}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v16

    .line 578
    .local v16, "o":Ljava/lang/Object;
    invoke-virtual/range {p0 .. p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->checkTerminate()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    move-result v30

    if-eqz v30, :cond_5

    .line 579
    const/16 v23, 0x1

    .line 777
    if-nez v23, :cond_1

    .line 778
    monitor-enter p0

    .line 779
    const/16 v30, 0x0

    :try_start_3
    move/from16 v0, v30

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 780
    monitor-exit p0

    goto :goto_1

    :catchall_1
    move-exception v30

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v30

    .line 565
    .end local v16    # "o":Ljava/lang/Object;
    .end local v19    # "replenishMain":I
    .end local v22    # "scalarEmission":I
    .end local v28    # "unbounded":Z
    :cond_4
    const/16 v28, 0x0

    goto :goto_2

    .line 582
    .restart local v16    # "o":Ljava/lang/Object;
    .restart local v19    # "replenishMain":I
    .restart local v22    # "scalarEmission":I
    .restart local v28    # "unbounded":Z
    :cond_5
    if-nez v16, :cond_b

    .line 603
    .end local v16    # "o":Ljava/lang/Object;
    :cond_6
    if-lez v22, :cond_7

    .line 604
    if-eqz v28, :cond_e

    .line 605
    const-wide v20, 0x7fffffffffffffffL

    .line 610
    :cond_7
    :goto_4
    const-wide/16 v30, 0x0

    cmp-long v30, v20, v30

    if-eqz v30, :cond_8

    if-nez v16, :cond_3

    .line 622
    .end local v22    # "scalarEmission":I
    :cond_8
    :try_start_4
    move-object/from16 v0, p0

    iget-boolean v5, v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->done:Z

    .line 625
    .local v5, "d":Z
    move-object/from16 v0, p0

    iget-object v0, v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->queue:Ljava/util/Queue;

    move-object/from16 v26, v0

    .line 627
    move-object/from16 v0, p0

    iget-object v9, v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->innerSubscribers:[Lrx/internal/operators/OperatorMerge$InnerSubscriber;

    .line 628
    .local v9, "inner":[Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "[Lrx/internal/operators/OperatorMerge$InnerSubscriber<*>;"
    array-length v15, v9

    .line 632
    .local v15, "n":I
    if-eqz v5, :cond_10

    if-eqz v26, :cond_9

    invoke-interface/range {v26 .. v26}, Ljava/util/Queue;->isEmpty()Z

    move-result v30

    if-eqz v30, :cond_10

    :cond_9
    if-nez v15, :cond_10

    .line 633
    move-object/from16 v0, p0

    iget-object v6, v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->errors:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 634
    .local v6, "e":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Throwable;>;"
    if-eqz v6, :cond_a

    invoke-interface {v6}, Ljava/util/Queue;->isEmpty()Z

    move-result v30

    if-eqz v30, :cond_f

    .line 635
    :cond_a
    invoke-virtual {v4}, Lrx/Subscriber;->onCompleted()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 639
    :goto_5
    const/16 v23, 0x1

    .line 777
    if-nez v23, :cond_1

    .line 778
    monitor-enter p0

    .line 779
    const/16 v30, 0x0

    :try_start_5
    move/from16 v0, v30

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 780
    monitor-exit p0

    goto/16 :goto_1

    :catchall_2
    move-exception v30

    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v30

    .line 585
    .end local v5    # "d":Z
    .end local v6    # "e":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Throwable;>;"
    .end local v9    # "inner":[Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "[Lrx/internal/operators/OperatorMerge$InnerSubscriber<*>;"
    .end local v15    # "n":I
    .restart local v16    # "o":Ljava/lang/Object;
    .restart local v22    # "scalarEmission":I
    :cond_b
    :try_start_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->nl:Lrx/internal/operators/NotificationLite;

    move-object/from16 v30, v0

    move-object/from16 v0, v30

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lrx/internal/operators/NotificationLite;->getValue(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    move-result-object v29

    .line 588
    .local v29, "v":Ljava/lang/Object;, "TT;"
    :try_start_7
    move-object/from16 v0, v29

    invoke-virtual {v4, v0}, Lrx/Subscriber;->onNext(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 599
    :goto_6
    add-int/lit8 v19, v19, 0x1

    .line 600
    add-int/lit8 v22, v22, 0x1

    .line 601
    const-wide/16 v30, 0x1

    sub-long v20, v20, v30

    .line 602
    goto/16 :goto_3

    .line 589
    :catch_0
    move-exception v27

    .line 590
    .local v27, "t":Ljava/lang/Throwable;
    :try_start_8
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->delayErrors:Z

    move/from16 v30, v0

    if-nez v30, :cond_c

    .line 591
    invoke-static/range {v27 .. v27}, Lrx/exceptions/Exceptions;->throwIfFatal(Ljava/lang/Throwable;)V

    .line 592
    const/16 v23, 0x1

    .line 593
    invoke-virtual/range {p0 .. p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->unsubscribe()V

    .line 594
    move-object/from16 v0, v27

    invoke-virtual {v4, v0}, Lrx/Subscriber;->onError(Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 777
    if-nez v23, :cond_1

    .line 778
    monitor-enter p0

    .line 779
    const/16 v30, 0x0

    :try_start_9
    move/from16 v0, v30

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 780
    monitor-exit p0

    goto/16 :goto_1

    :catchall_3
    move-exception v30

    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    throw v30

    .line 597
    :cond_c
    :try_start_a
    invoke-virtual/range {p0 .. p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->getOrCreateErrorQueue()Ljava/util/Queue;

    move-result-object v30

    move-object/from16 v0, v30

    move-object/from16 v1, v27

    invoke-interface {v0, v1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    goto :goto_6

    .line 777
    .end local v4    # "child":Lrx/Subscriber;, "Lrx/Subscriber<-TT;>;"
    .end local v16    # "o":Ljava/lang/Object;
    .end local v19    # "replenishMain":I
    .end local v20    # "r":J
    .end local v22    # "scalarEmission":I
    .end local v26    # "svq":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Object;>;"
    .end local v27    # "t":Ljava/lang/Throwable;
    .end local v28    # "unbounded":Z
    .end local v29    # "v":Ljava/lang/Object;, "TT;"
    :catchall_4
    move-exception v30

    if-nez v23, :cond_d

    .line 778
    monitor-enter p0

    .line 779
    const/16 v31, 0x0

    :try_start_b
    move/from16 v0, v31

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 780
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_c

    :cond_d
    throw v30

    .line 607
    .restart local v4    # "child":Lrx/Subscriber;, "Lrx/Subscriber<-TT;>;"
    .restart local v19    # "replenishMain":I
    .restart local v20    # "r":J
    .restart local v22    # "scalarEmission":I
    .restart local v26    # "svq":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Object;>;"
    .restart local v28    # "unbounded":Z
    :cond_e
    :try_start_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->producer:Lrx/internal/operators/OperatorMerge$MergeProducer;

    move-object/from16 v30, v0

    move-object/from16 v0, v30

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lrx/internal/operators/OperatorMerge$MergeProducer;->produced(I)J

    move-result-wide v20

    goto/16 :goto_4

    .line 637
    .end local v22    # "scalarEmission":I
    .restart local v5    # "d":Z
    .restart local v6    # "e":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Throwable;>;"
    .restart local v9    # "inner":[Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "[Lrx/internal/operators/OperatorMerge$InnerSubscriber<*>;"
    .restart local v15    # "n":I
    :cond_f
    invoke-direct/range {p0 .. p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->reportError()V

    goto/16 :goto_5

    .line 643
    .end local v6    # "e":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Throwable;>;"
    :cond_10
    const/4 v10, 0x0

    .line 644
    .local v10, "innerCompleted":Z
    if-lez v15, :cond_23

    .line 646
    move-object/from16 v0, p0

    iget-wide v0, v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->lastId:J

    move-wide/from16 v24, v0

    .line 647
    .local v24, "startId":J
    move-object/from16 v0, p0

    iget v8, v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->lastIndex:I

    .line 651
    .local v8, "index":I
    if-le v15, v8, :cond_11

    aget-object v30, v9, v8

    move-object/from16 v0, v30

    iget-wide v0, v0, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->id:J

    move-wide/from16 v30, v0

    cmp-long v30, v30, v24

    if-eqz v30, :cond_14

    .line 652
    :cond_11
    if-gt v15, v8, :cond_12

    .line 653
    const/4 v8, 0x0

    .line 656
    :cond_12
    move v14, v8

    .line 657
    .local v14, "j":I
    const/4 v7, 0x0

    .local v7, "i":I
    :goto_7
    if-ge v7, v15, :cond_13

    .line 658
    aget-object v30, v9, v14

    move-object/from16 v0, v30

    iget-wide v0, v0, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->id:J

    move-wide/from16 v30, v0

    cmp-long v30, v30, v24

    if-nez v30, :cond_15

    .line 669
    :cond_13
    move v8, v14

    .line 670
    move-object/from16 v0, p0

    iput v14, v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->lastIndex:I

    .line 671
    aget-object v30, v9, v14

    move-object/from16 v0, v30

    iget-wide v0, v0, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->id:J

    move-wide/from16 v30, v0

    move-wide/from16 v0, v30

    move-object/from16 v2, p0

    iput-wide v0, v2, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->lastId:J

    .line 674
    .end local v7    # "i":I
    .end local v14    # "j":I
    :cond_14
    move v14, v8

    .line 676
    .restart local v14    # "j":I
    const/4 v7, 0x0

    .restart local v7    # "i":I
    :goto_8
    if-ge v7, v15, :cond_22

    .line 678
    invoke-virtual/range {p0 .. p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->checkTerminate()Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    move-result v30

    if-eqz v30, :cond_17

    .line 679
    const/16 v23, 0x1

    .line 777
    if-nez v23, :cond_1

    .line 778
    monitor-enter p0

    .line 779
    const/16 v30, 0x0

    :try_start_d
    move/from16 v0, v30

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 780
    monitor-exit p0

    goto/16 :goto_1

    :catchall_5
    move-exception v30

    monitor-exit p0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    throw v30

    .line 662
    :cond_15
    add-int/lit8 v14, v14, 0x1

    .line 663
    if-ne v14, v15, :cond_16

    .line 664
    const/4 v14, 0x0

    .line 657
    :cond_16
    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    .line 683
    :cond_17
    :try_start_e
    aget-object v13, v9, v14

    .line 685
    .local v13, "is":Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "Lrx/internal/operators/OperatorMerge$InnerSubscriber<TT;>;"
    const/16 v16, 0x0

    .line 687
    :cond_18
    const/16 v17, 0x0

    .line 688
    .local v17, "produced":I
    :goto_9
    const-wide/16 v30, 0x0

    cmp-long v30, v20, v30

    if-lez v30, :cond_1a

    .line 690
    invoke-virtual/range {p0 .. p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->checkTerminate()Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    move-result v30

    if-eqz v30, :cond_19

    .line 691
    const/16 v23, 0x1

    .line 777
    if-nez v23, :cond_1

    .line 778
    monitor-enter p0

    .line 779
    const/16 v30, 0x0

    :try_start_f
    move/from16 v0, v30

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 780
    monitor-exit p0

    goto/16 :goto_1

    :catchall_6
    move-exception v30

    monitor-exit p0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    throw v30

    .line 694
    :cond_19
    :try_start_10
    iget-object v0, v13, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->queue:Lrx/internal/util/RxRingBuffer;

    move-object/from16 v18, v0

    .line 695
    .local v18, "q":Lrx/internal/util/RxRingBuffer;
    if-nez v18, :cond_1e

    .line 719
    .end local v18    # "q":Lrx/internal/util/RxRingBuffer;
    :cond_1a
    if-lez v17, :cond_1b

    .line 720
    if-nez v28, :cond_1f

    .line 721
    move-object/from16 v0, p0

    iget-object v0, v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->producer:Lrx/internal/operators/OperatorMerge$MergeProducer;

    move-object/from16 v30, v0

    move-object/from16 v0, v30

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Lrx/internal/operators/OperatorMerge$MergeProducer;->produced(I)J

    move-result-wide v20

    .line 725
    :goto_a
    move/from16 v0, v17

    int-to-long v0, v0

    move-wide/from16 v30, v0

    move-wide/from16 v0, v30

    invoke-virtual {v13, v0, v1}, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->requestMore(J)V

    .line 728
    :cond_1b
    const-wide/16 v30, 0x0

    cmp-long v30, v20, v30

    if-eqz v30, :cond_1c

    if-nez v16, :cond_18

    .line 732
    :cond_1c
    iget-boolean v11, v13, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->done:Z

    .line 733
    .local v11, "innerDone":Z
    iget-object v12, v13, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->queue:Lrx/internal/util/RxRingBuffer;

    .line 734
    .local v12, "innerQueue":Lrx/internal/util/RxRingBuffer;
    if-eqz v11, :cond_21

    if-eqz v12, :cond_1d

    invoke-virtual {v12}, Lrx/internal/util/RxRingBuffer;->isEmpty()Z

    move-result v30

    if-eqz v30, :cond_21

    .line 735
    :cond_1d
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->removeInner(Lrx/internal/operators/OperatorMerge$InnerSubscriber;)V

    .line 736
    invoke-virtual/range {p0 .. p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->checkTerminate()Z
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    move-result v30

    if-eqz v30, :cond_20

    .line 737
    const/16 v23, 0x1

    .line 777
    if-nez v23, :cond_1

    .line 778
    monitor-enter p0

    .line 779
    const/16 v30, 0x0

    :try_start_11
    move/from16 v0, v30

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 780
    monitor-exit p0

    goto/16 :goto_1

    :catchall_7
    move-exception v30

    monitor-exit p0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    throw v30

    .line 698
    .end local v11    # "innerDone":Z
    .end local v12    # "innerQueue":Lrx/internal/util/RxRingBuffer;
    .restart local v18    # "q":Lrx/internal/util/RxRingBuffer;
    :cond_1e
    :try_start_12
    invoke-virtual/range {v18 .. v18}, Lrx/internal/util/RxRingBuffer;->poll()Ljava/lang/Object;

    move-result-object v16

    .line 699
    .restart local v16    # "o":Ljava/lang/Object;
    if-eqz v16, :cond_1a

    .line 702
    move-object/from16 v0, p0

    iget-object v0, v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->nl:Lrx/internal/operators/NotificationLite;

    move-object/from16 v30, v0

    move-object/from16 v0, v30

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lrx/internal/operators/NotificationLite;->getValue(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    move-result-object v29

    .line 705
    .restart local v29    # "v":Ljava/lang/Object;, "TT;"
    :try_start_13
    move-object/from16 v0, v29

    invoke-virtual {v4, v0}, Lrx/Subscriber;->onNext(Ljava/lang/Object;)V
    :try_end_13
    .catch Ljava/lang/Throwable; {:try_start_13 .. :try_end_13} :catch_1
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    .line 716
    const-wide/16 v30, 0x1

    sub-long v20, v20, v30

    .line 717
    add-int/lit8 v17, v17, 0x1

    .line 718
    goto/16 :goto_9

    .line 706
    :catch_1
    move-exception v27

    .line 707
    .restart local v27    # "t":Ljava/lang/Throwable;
    const/16 v23, 0x1

    .line 708
    :try_start_14
    invoke-static/range {v27 .. v27}, Lrx/exceptions/Exceptions;->throwIfFatal(Ljava/lang/Throwable;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    .line 710
    :try_start_15
    move-object/from16 v0, v27

    invoke-virtual {v4, v0}, Lrx/Subscriber;->onError(Ljava/lang/Throwable;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_9

    .line 712
    :try_start_16
    invoke-virtual/range {p0 .. p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->unsubscribe()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    .line 777
    if-nez v23, :cond_1

    .line 778
    monitor-enter p0

    .line 779
    const/16 v30, 0x0

    :try_start_17
    move/from16 v0, v30

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 780
    monitor-exit p0

    goto/16 :goto_1

    :catchall_8
    move-exception v30

    monitor-exit p0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_8

    throw v30

    .line 712
    :catchall_9
    move-exception v30

    :try_start_18
    invoke-virtual/range {p0 .. p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->unsubscribe()V

    throw v30

    .line 723
    .end local v16    # "o":Ljava/lang/Object;
    .end local v18    # "q":Lrx/internal/util/RxRingBuffer;
    .end local v27    # "t":Ljava/lang/Throwable;
    .end local v29    # "v":Ljava/lang/Object;, "TT;"
    :cond_1f
    const-wide v20, 0x7fffffffffffffffL

    goto/16 :goto_a

    .line 740
    .restart local v11    # "innerDone":Z
    .restart local v12    # "innerQueue":Lrx/internal/util/RxRingBuffer;
    :cond_20
    add-int/lit8 v19, v19, 0x1

    .line 741
    const/4 v10, 0x1

    .line 744
    :cond_21
    const-wide/16 v30, 0x0

    cmp-long v30, v20, v30

    if-nez v30, :cond_25

    .line 755
    .end local v11    # "innerDone":Z
    .end local v12    # "innerQueue":Lrx/internal/util/RxRingBuffer;
    .end local v13    # "is":Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "Lrx/internal/operators/OperatorMerge$InnerSubscriber<TT;>;"
    .end local v17    # "produced":I
    :cond_22
    move-object/from16 v0, p0

    iput v14, v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->lastIndex:I

    .line 756
    aget-object v30, v9, v14

    move-object/from16 v0, v30

    iget-wide v0, v0, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->id:J

    move-wide/from16 v30, v0

    move-wide/from16 v0, v30

    move-object/from16 v2, p0

    iput-wide v0, v2, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->lastId:J

    .line 759
    .end local v7    # "i":I
    .end local v8    # "index":I
    .end local v14    # "j":I
    .end local v24    # "startId":J
    :cond_23
    if-lez v19, :cond_24

    .line 760
    move/from16 v0, v19

    int-to-long v0, v0

    move-wide/from16 v30, v0

    move-object/from16 v0, p0

    move-wide/from16 v1, v30

    invoke-virtual {v0, v1, v2}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->request(J)V

    .line 763
    :cond_24
    if-nez v10, :cond_0

    .line 767
    monitor-enter p0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_4

    .line 768
    :try_start_19
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->missed:Z

    move/from16 v30, v0

    if-nez v30, :cond_27

    .line 769
    const/16 v23, 0x1

    .line 770
    const/16 v30, 0x0

    move/from16 v0, v30

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 771
    monitor-exit p0
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_b

    .line 777
    if-nez v23, :cond_1

    .line 778
    monitor-enter p0

    .line 779
    const/16 v30, 0x0

    :try_start_1a
    move/from16 v0, v30

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 780
    monitor-exit p0

    goto/16 :goto_1

    :catchall_a
    move-exception v30

    monitor-exit p0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_a

    throw v30

    .line 749
    .restart local v7    # "i":I
    .restart local v8    # "index":I
    .restart local v11    # "innerDone":Z
    .restart local v12    # "innerQueue":Lrx/internal/util/RxRingBuffer;
    .restart local v13    # "is":Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "Lrx/internal/operators/OperatorMerge$InnerSubscriber<TT;>;"
    .restart local v14    # "j":I
    .restart local v17    # "produced":I
    .restart local v24    # "startId":J
    :cond_25
    add-int/lit8 v14, v14, 0x1

    .line 750
    if-ne v14, v15, :cond_26

    .line 751
    const/4 v14, 0x0

    .line 676
    :cond_26
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_8

    .line 773
    .end local v7    # "i":I
    .end local v8    # "index":I
    .end local v11    # "innerDone":Z
    .end local v12    # "innerQueue":Lrx/internal/util/RxRingBuffer;
    .end local v13    # "is":Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "Lrx/internal/operators/OperatorMerge$InnerSubscriber<TT;>;"
    .end local v14    # "j":I
    .end local v17    # "produced":I
    .end local v24    # "startId":J
    :cond_27
    const/16 v30, 0x0

    :try_start_1b
    move/from16 v0, v30

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->missed:Z

    .line 774
    monitor-exit p0

    goto/16 :goto_0

    :catchall_b
    move-exception v30

    monitor-exit p0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_b

    :try_start_1c
    throw v30
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_4

    .line 780
    .end local v4    # "child":Lrx/Subscriber;, "Lrx/Subscriber<-TT;>;"
    .end local v5    # "d":Z
    .end local v9    # "inner":[Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "[Lrx/internal/operators/OperatorMerge$InnerSubscriber<*>;"
    .end local v10    # "innerCompleted":Z
    .end local v15    # "n":I
    .end local v19    # "replenishMain":I
    .end local v20    # "r":J
    .end local v26    # "svq":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Object;>;"
    .end local v28    # "unbounded":Z
    :catchall_c
    move-exception v30

    :try_start_1d
    monitor-exit p0
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_c

    throw v30
.end method

.method protected emitScalar(Ljava/lang/Object;J)V
    .locals 6
    .param p2, "r"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;J)V"
        }
    .end annotation

    .prologue
    .line 487
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    .local p1, "value":Ljava/lang/Object;, "TT;"
    const/4 v1, 0x0

    .line 490
    .local v1, "skipFinal":Z
    :try_start_0
    iget-object v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->child:Lrx/Subscriber;

    invoke-virtual {v3, p1}, Lrx/Subscriber;->onNext(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 501
    :goto_0
    const-wide v4, 0x7fffffffffffffffL

    cmp-long v3, p2, v4

    if-eqz v3, :cond_0

    .line 502
    :try_start_1
    iget-object v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->producer:Lrx/internal/operators/OperatorMerge$MergeProducer;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lrx/internal/operators/OperatorMerge$MergeProducer;->produced(I)J

    .line 505
    :cond_0
    iget v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->scalarEmissionCount:I

    add-int/lit8 v0, v3, 0x1

    .line 506
    .local v0, "produced":I
    iget v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->scalarEmissionLimit:I

    if-ne v0, v3, :cond_4

    .line 507
    const/4 v3, 0x0

    iput v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->scalarEmissionCount:I

    .line 508
    int-to-long v4, v0

    invoke-virtual {p0, v4, v5}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->requestMore(J)V

    .line 514
    :goto_1
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 515
    const/4 v1, 0x1

    .line 516
    :try_start_2
    iget-boolean v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->missed:Z

    if-nez v3, :cond_5

    .line 517
    const/4 v3, 0x0

    iput-boolean v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 518
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 523
    if-nez v1, :cond_1

    .line 524
    monitor-enter p0

    .line 525
    const/4 v3, 0x0

    :try_start_3
    iput-boolean v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 526
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 537
    .end local v0    # "produced":I
    :cond_1
    :goto_2
    return-void

    .line 491
    :catch_0
    move-exception v2

    .line 492
    .local v2, "t":Ljava/lang/Throwable;
    :try_start_4
    iget-boolean v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->delayErrors:Z

    if-nez v3, :cond_2

    .line 493
    invoke-static {v2}, Lrx/exceptions/Exceptions;->throwIfFatal(Ljava/lang/Throwable;)V

    .line 494
    const/4 v1, 0x1

    .line 495
    invoke-virtual {p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->unsubscribe()V

    .line 496
    invoke-virtual {p0, v2}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->onError(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 523
    if-nez v1, :cond_1

    .line 524
    monitor-enter p0

    .line 525
    const/4 v3, 0x0

    :try_start_5
    iput-boolean v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 526
    monitor-exit p0

    goto :goto_2

    :catchall_0
    move-exception v3

    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v3

    .line 499
    :cond_2
    :try_start_6
    invoke-virtual {p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->getOrCreateErrorQueue()Ljava/util/Queue;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_0

    .line 523
    .end local v2    # "t":Ljava/lang/Throwable;
    :catchall_1
    move-exception v3

    if-nez v1, :cond_3

    .line 524
    monitor-enter p0

    .line 525
    const/4 v4, 0x0

    :try_start_7
    iput-boolean v4, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 526
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    :cond_3
    throw v3

    .line 510
    .restart local v0    # "produced":I
    :cond_4
    :try_start_8
    iput v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->scalarEmissionCount:I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_1

    .line 526
    :catchall_2
    move-exception v3

    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    throw v3

    .line 520
    :cond_5
    const/4 v3, 0x0

    :try_start_a
    iput-boolean v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->missed:Z

    .line 521
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 523
    if-nez v1, :cond_6

    .line 524
    monitor-enter p0

    .line 525
    const/4 v3, 0x0

    :try_start_b
    iput-boolean v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 526
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 536
    :cond_6
    invoke-virtual {p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitLoop()V

    goto :goto_2

    .line 521
    :catchall_3
    move-exception v3

    :try_start_c
    monitor-exit p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :try_start_d
    throw v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 526
    :catchall_4
    move-exception v3

    :try_start_e
    monitor-exit p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    throw v3

    .end local v0    # "produced":I
    :catchall_5
    move-exception v3

    :try_start_f
    monitor-exit p0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    throw v3
.end method

.method protected emitScalar(Lrx/internal/operators/OperatorMerge$InnerSubscriber;Ljava/lang/Object;J)V
    .locals 5
    .param p3, "r"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrx/internal/operators/OperatorMerge$InnerSubscriber",
            "<TT;>;TT;J)V"
        }
    .end annotation

    .prologue
    .line 375
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    .local p1, "subscriber":Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "Lrx/internal/operators/OperatorMerge$InnerSubscriber<TT;>;"
    .local p2, "value":Ljava/lang/Object;, "TT;"
    const/4 v0, 0x0

    .line 378
    .local v0, "skipFinal":Z
    :try_start_0
    iget-object v2, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->child:Lrx/Subscriber;

    invoke-virtual {v2, p2}, Lrx/Subscriber;->onNext(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 389
    :goto_0
    const-wide v2, 0x7fffffffffffffffL

    cmp-long v2, p3, v2

    if-eqz v2, :cond_0

    .line 390
    :try_start_1
    iget-object v2, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->producer:Lrx/internal/operators/OperatorMerge$MergeProducer;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lrx/internal/operators/OperatorMerge$MergeProducer;->produced(I)J

    .line 392
    :cond_0
    const-wide/16 v2, 0x1

    invoke-virtual {p1, v2, v3}, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->requestMore(J)V

    .line 394
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 395
    const/4 v0, 0x1

    .line 396
    :try_start_2
    iget-boolean v2, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->missed:Z

    if-nez v2, :cond_4

    .line 397
    const/4 v2, 0x0

    iput-boolean v2, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 398
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 403
    if-nez v0, :cond_1

    .line 404
    monitor-enter p0

    .line 405
    const/4 v2, 0x0

    :try_start_3
    iput-boolean v2, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 406
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 417
    :cond_1
    :goto_1
    return-void

    .line 379
    :catch_0
    move-exception v1

    .line 380
    .local v1, "t":Ljava/lang/Throwable;
    :try_start_4
    iget-boolean v2, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->delayErrors:Z

    if-nez v2, :cond_2

    .line 381
    invoke-static {v1}, Lrx/exceptions/Exceptions;->throwIfFatal(Ljava/lang/Throwable;)V

    .line 382
    const/4 v0, 0x1

    .line 383
    invoke-virtual {p1}, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->unsubscribe()V

    .line 384
    invoke-virtual {p1, v1}, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->onError(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 403
    if-nez v0, :cond_1

    .line 404
    monitor-enter p0

    .line 405
    const/4 v2, 0x0

    :try_start_5
    iput-boolean v2, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 406
    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception v2

    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v2

    .line 387
    :cond_2
    :try_start_6
    invoke-virtual {p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->getOrCreateErrorQueue()Ljava/util/Queue;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_0

    .line 403
    .end local v1    # "t":Ljava/lang/Throwable;
    :catchall_1
    move-exception v2

    if-nez v0, :cond_3

    .line 404
    monitor-enter p0

    .line 405
    const/4 v3, 0x0

    :try_start_7
    iput-boolean v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 406
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    :cond_3
    throw v2

    :catchall_2
    move-exception v2

    :try_start_8
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    throw v2

    .line 400
    :cond_4
    const/4 v2, 0x0

    :try_start_9
    iput-boolean v2, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->missed:Z

    .line 401
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 403
    if-nez v0, :cond_5

    .line 404
    monitor-enter p0

    .line 405
    const/4 v2, 0x0

    :try_start_a
    iput-boolean v2, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 406
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 416
    :cond_5
    invoke-virtual {p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitLoop()V

    goto :goto_1

    .line 401
    :catchall_3
    move-exception v2

    :try_start_b
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :try_start_c
    throw v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 406
    :catchall_4
    move-exception v2

    :try_start_d
    monitor-exit p0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    throw v2

    :catchall_5
    move-exception v2

    :try_start_e
    monitor-exit p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    throw v2
.end method

.method getOrCreateComposite()Lrx/subscriptions/CompositeSubscription;
    .locals 4

    .prologue
    .line 217
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    iget-object v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->subscriptions:Lrx/subscriptions/CompositeSubscription;

    .line 218
    .local v0, "c":Lrx/subscriptions/CompositeSubscription;
    if-nez v0, :cond_1

    .line 219
    const/4 v2, 0x0

    .line 220
    .local v2, "shouldAdd":Z
    monitor-enter p0

    .line 221
    :try_start_0
    iget-object v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->subscriptions:Lrx/subscriptions/CompositeSubscription;

    .line 222
    if-nez v0, :cond_0

    .line 223
    new-instance v1, Lrx/subscriptions/CompositeSubscription;

    invoke-direct {v1}, Lrx/subscriptions/CompositeSubscription;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 224
    .end local v0    # "c":Lrx/subscriptions/CompositeSubscription;
    .local v1, "c":Lrx/subscriptions/CompositeSubscription;
    :try_start_1
    iput-object v1, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->subscriptions:Lrx/subscriptions/CompositeSubscription;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 225
    const/4 v2, 0x1

    move-object v0, v1

    .line 227
    .end local v1    # "c":Lrx/subscriptions/CompositeSubscription;
    .restart local v0    # "c":Lrx/subscriptions/CompositeSubscription;
    :cond_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 228
    if-eqz v2, :cond_1

    .line 229
    invoke-virtual {p0, v0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->add(Lrx/Subscription;)V

    .line 232
    .end local v2    # "shouldAdd":Z
    :cond_1
    return-object v0

    .line 227
    .restart local v2    # "shouldAdd":Z
    :catchall_0
    move-exception v3

    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v3

    .end local v0    # "c":Lrx/subscriptions/CompositeSubscription;
    .restart local v1    # "c":Lrx/subscriptions/CompositeSubscription;
    :catchall_1
    move-exception v3

    move-object v0, v1

    .end local v1    # "c":Lrx/subscriptions/CompositeSubscription;
    .restart local v0    # "c":Lrx/subscriptions/CompositeSubscription;
    goto :goto_0
.end method

.method getOrCreateErrorQueue()Ljava/util/Queue;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Queue",
            "<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    .prologue
    .line 204
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    iget-object v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->errors:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 205
    .local v0, "q":Ljava/util/concurrent/ConcurrentLinkedQueue;, "Ljava/util/concurrent/ConcurrentLinkedQueue<Ljava/lang/Throwable;>;"
    if-nez v0, :cond_1

    .line 206
    monitor-enter p0

    .line 207
    :try_start_0
    iget-object v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->errors:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 208
    if-nez v0, :cond_0

    .line 209
    new-instance v1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 210
    .end local v0    # "q":Ljava/util/concurrent/ConcurrentLinkedQueue;, "Ljava/util/concurrent/ConcurrentLinkedQueue<Ljava/lang/Throwable;>;"
    .local v1, "q":Ljava/util/concurrent/ConcurrentLinkedQueue;, "Ljava/util/concurrent/ConcurrentLinkedQueue<Ljava/lang/Throwable;>;"
    :try_start_1
    iput-object v1, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->errors:Ljava/util/concurrent/ConcurrentLinkedQueue;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v0, v1

    .line 212
    .end local v1    # "q":Ljava/util/concurrent/ConcurrentLinkedQueue;, "Ljava/util/concurrent/ConcurrentLinkedQueue<Ljava/lang/Throwable;>;"
    .restart local v0    # "q":Ljava/util/concurrent/ConcurrentLinkedQueue;, "Ljava/util/concurrent/ConcurrentLinkedQueue<Ljava/lang/Throwable;>;"
    :cond_0
    :try_start_2
    monitor-exit p0

    .line 214
    :cond_1
    return-object v0

    .line 212
    :catchall_0
    move-exception v2

    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v2

    .end local v0    # "q":Ljava/util/concurrent/ConcurrentLinkedQueue;, "Ljava/util/concurrent/ConcurrentLinkedQueue<Ljava/lang/Throwable;>;"
    .restart local v1    # "q":Ljava/util/concurrent/ConcurrentLinkedQueue;, "Ljava/util/concurrent/ConcurrentLinkedQueue<Ljava/lang/Throwable;>;"
    :catchall_1
    move-exception v2

    move-object v0, v1

    .end local v1    # "q":Ljava/util/concurrent/ConcurrentLinkedQueue;, "Ljava/util/concurrent/ConcurrentLinkedQueue<Ljava/lang/Throwable;>;"
    .restart local v0    # "q":Ljava/util/concurrent/ConcurrentLinkedQueue;, "Ljava/util/concurrent/ConcurrentLinkedQueue<Ljava/lang/Throwable;>;"
    goto :goto_0
.end method

.method public onCompleted()V
    .locals 1

    .prologue
    .line 267
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    const/4 v0, 0x1

    iput-boolean v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->done:Z

    .line 268
    invoke-virtual {p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emit()V

    .line 269
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1
    .param p1, "e"    # Ljava/lang/Throwable;

    .prologue
    .line 261
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    invoke-virtual {p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->getOrCreateErrorQueue()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 262
    const/4 v0, 0x1

    iput-boolean v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->done:Z

    .line 263
    invoke-virtual {p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emit()V

    .line 264
    return-void
.end method

.method public bridge synthetic onNext(Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 145
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    check-cast p1, Lrx/Observable;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->onNext(Lrx/Observable;)V

    return-void
.end method

.method public onNext(Lrx/Observable;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrx/Observable",
            "<+TT;>;)V"
        }
    .end annotation

    .prologue
    .line 237
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    .local p1, "t":Lrx/Observable;, "Lrx/Observable<+TT;>;"
    if-nez p1, :cond_0

    .line 248
    .end local p1    # "t":Lrx/Observable;, "Lrx/Observable<+TT;>;"
    :goto_0
    return-void

    .line 240
    .restart local p1    # "t":Lrx/Observable;, "Lrx/Observable<+TT;>;"
    :cond_0
    instance-of v1, p1, Lrx/internal/util/ScalarSynchronousObservable;

    if-eqz v1, :cond_1

    .line 241
    check-cast p1, Lrx/internal/util/ScalarSynchronousObservable;

    .end local p1    # "t":Lrx/Observable;, "Lrx/Observable<+TT;>;"
    invoke-virtual {p1}, Lrx/internal/util/ScalarSynchronousObservable;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->tryEmit(Ljava/lang/Object;)V

    goto :goto_0

    .line 243
    .restart local p1    # "t":Lrx/Observable;, "Lrx/Observable<+TT;>;"
    :cond_1
    new-instance v0, Lrx/internal/operators/OperatorMerge$InnerSubscriber;

    iget-wide v2, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->uniqueId:J

    const-wide/16 v4, 0x1

    add-long/2addr v4, v2

    iput-wide v4, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->uniqueId:J

    invoke-direct {v0, p0, v2, v3}, Lrx/internal/operators/OperatorMerge$InnerSubscriber;-><init>(Lrx/internal/operators/OperatorMerge$MergeSubscriber;J)V

    .line 244
    .local v0, "inner":Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "Lrx/internal/operators/OperatorMerge$InnerSubscriber<TT;>;"
    invoke-virtual {p0, v0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->addInner(Lrx/internal/operators/OperatorMerge$InnerSubscriber;)V

    .line 245
    invoke-virtual {p1, v0}, Lrx/Observable;->unsafeSubscribe(Lrx/Subscriber;)Lrx/Subscription;

    .line 246
    invoke-virtual {p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emit()V

    goto :goto_0
.end method

.method protected queueScalar(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 460
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    .local p1, "value":Ljava/lang/Object;, "TT;"
    iget-object v1, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->queue:Ljava/util/Queue;

    .line 461
    .local v1, "q":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Object;>;"
    if-nez v1, :cond_0

    .line 462
    iget v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->maxConcurrent:I

    .line 463
    .local v0, "mc":I
    const v2, 0x7fffffff

    if-ne v0, v2, :cond_1

    .line 464
    new-instance v1, Lrx/internal/util/atomic/SpscUnboundedAtomicArrayQueue;

    .end local v1    # "q":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Object;>;"
    sget v2, Lrx/internal/util/RxRingBuffer;->SIZE:I

    invoke-direct {v1, v2}, Lrx/internal/util/atomic/SpscUnboundedAtomicArrayQueue;-><init>(I)V

    .line 476
    .restart local v1    # "q":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Object;>;"
    :goto_0
    iput-object v1, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->queue:Ljava/util/Queue;

    .line 478
    .end local v0    # "mc":I
    :cond_0
    iget-object v2, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->nl:Lrx/internal/operators/NotificationLite;

    invoke-virtual {v2, p1}, Lrx/internal/operators/NotificationLite;->next(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 479
    invoke-virtual {p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->unsubscribe()V

    .line 480
    new-instance v2, Lrx/exceptions/MissingBackpressureException;

    invoke-direct {v2}, Lrx/exceptions/MissingBackpressureException;-><init>()V

    invoke-static {v2, p1}, Lrx/exceptions/OnErrorThrowable;->addValueAsLastCause(Ljava/lang/Throwable;Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {p0, v2}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->onError(Ljava/lang/Throwable;)V

    .line 484
    :goto_1
    return-void

    .line 466
    .restart local v0    # "mc":I
    :cond_1
    invoke-static {v0}, Lrx/internal/util/unsafe/Pow2;->isPowerOfTwo(I)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 467
    invoke-static {}, Lrx/internal/util/unsafe/UnsafeAccess;->isUnsafeAvailable()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 468
    new-instance v1, Lrx/internal/util/unsafe/SpscArrayQueue;

    .end local v1    # "q":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Object;>;"
    invoke-direct {v1, v0}, Lrx/internal/util/unsafe/SpscArrayQueue;-><init>(I)V

    .restart local v1    # "q":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Object;>;"
    goto :goto_0

    .line 470
    :cond_2
    new-instance v1, Lrx/internal/util/atomic/SpscAtomicArrayQueue;

    .end local v1    # "q":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Object;>;"
    invoke-direct {v1, v0}, Lrx/internal/util/atomic/SpscAtomicArrayQueue;-><init>(I)V

    .restart local v1    # "q":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Object;>;"
    goto :goto_0

    .line 473
    :cond_3
    new-instance v1, Lrx/internal/util/atomic/SpscExactAtomicArrayQueue;

    .end local v1    # "q":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Object;>;"
    invoke-direct {v1, v0}, Lrx/internal/util/atomic/SpscExactAtomicArrayQueue;-><init>(I)V

    .restart local v1    # "q":Ljava/util/Queue;, "Ljava/util/Queue<Ljava/lang/Object;>;"
    goto :goto_0

    .line 483
    .end local v0    # "mc":I
    :cond_4
    invoke-virtual {p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emit()V

    goto :goto_1
.end method

.method protected queueScalar(Lrx/internal/operators/OperatorMerge$InnerSubscriber;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrx/internal/operators/OperatorMerge$InnerSubscriber",
            "<TT;>;TT;)V"
        }
    .end annotation

    .prologue
    .line 352
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    .local p1, "subscriber":Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "Lrx/internal/operators/OperatorMerge$InnerSubscriber<TT;>;"
    .local p2, "value":Ljava/lang/Object;, "TT;"
    iget-object v1, p1, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->queue:Lrx/internal/util/RxRingBuffer;

    .line 353
    .local v1, "q":Lrx/internal/util/RxRingBuffer;
    if-nez v1, :cond_0

    .line 354
    invoke-static {}, Lrx/internal/util/RxRingBuffer;->getSpscInstance()Lrx/internal/util/RxRingBuffer;

    move-result-object v1

    .line 355
    invoke-virtual {p1, v1}, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->add(Lrx/Subscription;)V

    .line 356
    iput-object v1, p1, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->queue:Lrx/internal/util/RxRingBuffer;

    .line 359
    :cond_0
    :try_start_0
    iget-object v2, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->nl:Lrx/internal/operators/NotificationLite;

    invoke-virtual {v2, p2}, Lrx/internal/operators/NotificationLite;->next(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lrx/internal/util/RxRingBuffer;->onNext(Ljava/lang/Object;)V
    :try_end_0
    .catch Lrx/exceptions/MissingBackpressureException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 371
    invoke-virtual {p0}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emit()V

    .line 372
    :cond_1
    :goto_0
    return-void

    .line 360
    :catch_0
    move-exception v0

    .line 361
    .local v0, "ex":Lrx/exceptions/MissingBackpressureException;
    invoke-virtual {p1}, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->unsubscribe()V

    .line 362
    invoke-virtual {p1, v0}, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 364
    .end local v0    # "ex":Lrx/exceptions/MissingBackpressureException;
    :catch_1
    move-exception v0

    .line 365
    .local v0, "ex":Ljava/lang/IllegalStateException;
    invoke-virtual {p1}, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->isUnsubscribed()Z

    move-result v2

    if-nez v2, :cond_1

    .line 366
    invoke-virtual {p1}, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->unsubscribe()V

    .line 367
    invoke-virtual {p1, v0}, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->onError(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method removeInner(Lrx/internal/operators/OperatorMerge$InnerSubscriber;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrx/internal/operators/OperatorMerge$InnerSubscriber",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 283
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    .local p1, "inner":Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "Lrx/internal/operators/OperatorMerge$InnerSubscriber<TT;>;"
    iget-object v5, p1, Lrx/internal/operators/OperatorMerge$InnerSubscriber;->queue:Lrx/internal/util/RxRingBuffer;

    .line 284
    .local v5, "q":Lrx/internal/util/RxRingBuffer;
    if-eqz v5, :cond_0

    .line 285
    invoke-virtual {v5}, Lrx/internal/util/RxRingBuffer;->release()V

    .line 289
    :cond_0
    iget-object v6, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->subscriptions:Lrx/subscriptions/CompositeSubscription;

    invoke-virtual {v6, p1}, Lrx/subscriptions/CompositeSubscription;->remove(Lrx/Subscription;)V

    .line 290
    iget-object v7, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->innerGuard:Ljava/lang/Object;

    monitor-enter v7

    .line 291
    :try_start_0
    iget-object v0, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->innerSubscribers:[Lrx/internal/operators/OperatorMerge$InnerSubscriber;

    .line 292
    .local v0, "a":[Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "[Lrx/internal/operators/OperatorMerge$InnerSubscriber<*>;"
    array-length v4, v0

    .line 293
    .local v4, "n":I
    const/4 v3, -0x1

    .line 295
    .local v3, "j":I
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    if-ge v2, v4, :cond_1

    .line 296
    aget-object v6, v0, v2

    invoke-virtual {p1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 297
    move v3, v2

    .line 301
    :cond_1
    if-gez v3, :cond_3

    .line 302
    monitor-exit v7

    .line 313
    :goto_1
    return-void

    .line 295
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 304
    :cond_3
    const/4 v6, 0x1

    if-ne v4, v6, :cond_4

    .line 305
    sget-object v6, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->EMPTY:[Lrx/internal/operators/OperatorMerge$InnerSubscriber;

    iput-object v6, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->innerSubscribers:[Lrx/internal/operators/OperatorMerge$InnerSubscriber;

    .line 306
    monitor-exit v7

    goto :goto_1

    .line 312
    .end local v0    # "a":[Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "[Lrx/internal/operators/OperatorMerge$InnerSubscriber<*>;"
    .end local v2    # "i":I
    .end local v3    # "j":I
    .end local v4    # "n":I
    :catchall_0
    move-exception v6

    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v6

    .line 308
    .restart local v0    # "a":[Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "[Lrx/internal/operators/OperatorMerge$InnerSubscriber<*>;"
    .restart local v2    # "i":I
    .restart local v3    # "j":I
    .restart local v4    # "n":I
    :cond_4
    add-int/lit8 v6, v4, -0x1

    :try_start_1
    new-array v1, v6, [Lrx/internal/operators/OperatorMerge$InnerSubscriber;

    .line 309
    .local v1, "b":[Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "[Lrx/internal/operators/OperatorMerge$InnerSubscriber<*>;"
    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static {v0, v6, v1, v8, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 310
    add-int/lit8 v6, v3, 0x1

    sub-int v8, v4, v3

    add-int/lit8 v8, v8, -0x1

    invoke-static {v0, v6, v1, v3, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 311
    iput-object v1, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->innerSubscribers:[Lrx/internal/operators/OperatorMerge$InnerSubscriber;

    .line 312
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method

.method public requestMore(J)V
    .locals 1
    .param p1, "n"    # J

    .prologue
    .line 420
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    invoke-virtual {p0, p1, p2}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->request(J)V

    .line 421
    return-void
.end method

.method tryEmit(Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    .local p1, "value":Ljava/lang/Object;, "TT;"
    const-wide/16 v4, 0x0

    .line 435
    const/4 v2, 0x0

    .line 436
    .local v2, "success":Z
    iget-object v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->producer:Lrx/internal/operators/OperatorMerge$MergeProducer;

    invoke-virtual {v3}, Lrx/internal/operators/OperatorMerge$MergeProducer;->get()J

    move-result-wide v0

    .line 437
    .local v0, "r":J
    cmp-long v3, v0, v4

    if-eqz v3, :cond_1

    .line 438
    monitor-enter p0

    .line 440
    :try_start_0
    iget-object v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->producer:Lrx/internal/operators/OperatorMerge$MergeProducer;

    invoke-virtual {v3}, Lrx/internal/operators/OperatorMerge$MergeProducer;->get()J

    move-result-wide v0

    .line 441
    iget-boolean v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    if-nez v3, :cond_0

    cmp-long v3, v0, v4

    if-eqz v3, :cond_0

    .line 442
    const/4 v3, 0x1

    iput-boolean v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 443
    const/4 v2, 0x1

    .line 445
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 447
    :cond_1
    if-eqz v2, :cond_2

    .line 448
    invoke-virtual {p0, p1, v0, v1}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitScalar(Ljava/lang/Object;J)V

    .line 452
    :goto_0
    return-void

    .line 445
    :catchall_0
    move-exception v3

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v3

    .line 450
    :cond_2
    invoke-virtual {p0, p1}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->queueScalar(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method tryEmit(Lrx/internal/operators/OperatorMerge$InnerSubscriber;Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrx/internal/operators/OperatorMerge$InnerSubscriber",
            "<TT;>;TT;)V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lrx/internal/operators/OperatorMerge$MergeSubscriber;, "Lrx/internal/operators/OperatorMerge$MergeSubscriber<TT;>;"
    .local p1, "subscriber":Lrx/internal/operators/OperatorMerge$InnerSubscriber;, "Lrx/internal/operators/OperatorMerge$InnerSubscriber<TT;>;"
    .local p2, "value":Ljava/lang/Object;, "TT;"
    const-wide/16 v4, 0x0

    .line 327
    const/4 v2, 0x0

    .line 328
    .local v2, "success":Z
    iget-object v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->producer:Lrx/internal/operators/OperatorMerge$MergeProducer;

    invoke-virtual {v3}, Lrx/internal/operators/OperatorMerge$MergeProducer;->get()J

    move-result-wide v0

    .line 329
    .local v0, "r":J
    cmp-long v3, v0, v4

    if-eqz v3, :cond_1

    .line 330
    monitor-enter p0

    .line 332
    :try_start_0
    iget-object v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->producer:Lrx/internal/operators/OperatorMerge$MergeProducer;

    invoke-virtual {v3}, Lrx/internal/operators/OperatorMerge$MergeProducer;->get()J

    move-result-wide v0

    .line 333
    iget-boolean v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    if-nez v3, :cond_0

    cmp-long v3, v0, v4

    if-eqz v3, :cond_0

    .line 334
    const/4 v3, 0x1

    iput-boolean v3, p0, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitting:Z

    .line 335
    const/4 v2, 0x1

    .line 337
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 339
    :cond_1
    if-eqz v2, :cond_2

    .line 340
    invoke-virtual {p0, p1, p2, v0, v1}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->emitScalar(Lrx/internal/operators/OperatorMerge$InnerSubscriber;Ljava/lang/Object;J)V

    .line 344
    :goto_0
    return-void

    .line 337
    :catchall_0
    move-exception v3

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v3

    .line 342
    :cond_2
    invoke-virtual {p0, p1, p2}, Lrx/internal/operators/OperatorMerge$MergeSubscriber;->queueScalar(Lrx/internal/operators/OperatorMerge$InnerSubscriber;Ljava/lang/Object;)V

    goto :goto_0
.end method
