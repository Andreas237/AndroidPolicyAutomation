.class Lnet/toddm/comm/CommManager$WorkManagementRunnable;
.super Ljava/lang/Object;
.source "CommManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/toddm/comm/CommManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "WorkManagementRunnable"
.end annotation


# instance fields
.field final synthetic this$0:Lnet/toddm/comm/CommManager;


# direct methods
.method private constructor <init>(Lnet/toddm/comm/CommManager;)V
    .locals 0

    .line 592
    iput-object p1, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/CommManager$WorkManagementRunnable;)V
    .locals 0

    .line 592
    invoke-direct {p0, p1}, Lnet/toddm/comm/CommManager$WorkManagementRunnable;-><init>(Lnet/toddm/comm/CommManager;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 598
    :catch_0
    :cond_0
    :goto_0
    iget-object v0, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$1(Lnet/toddm/comm/CommManager;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    goto/16 :goto_6

    .line 601
    :cond_1
    :try_start_0
    iget-object v0, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$1(Lnet/toddm/comm/CommManager;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_6

    .line 604
    :cond_2
    iget-object v0, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$2(Lnet/toddm/comm/CommManager;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 605
    :try_start_1
    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v3

    const/4 v4, 0x2

    if-eqz v3, :cond_3

    .line 606
    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v3

    const-string v5, "[thread:%1$d] queued:{%2$d} active:{%3$d} retry:{%4$d}"

    const/4 v6, 0x4

    .line 607
    new-array v6, v6, [Ljava/lang/Object;

    .line 608
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Thread;->getId()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    aput-object v7, v6, v1

    .line 609
    iget-object v7, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v7}, Lnet/toddm/comm/CommManager;->access$4(Lnet/toddm/comm/CommManager;)Ljava/util/LinkedList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/LinkedList;->size()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v2

    .line 610
    iget-object v7, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v7}, Lnet/toddm/comm/CommManager;->access$5(Lnet/toddm/comm/CommManager;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v4

    const/4 v7, 0x3

    .line 611
    iget-object v8, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v8}, Lnet/toddm/comm/CommManager;->access$6(Lnet/toddm/comm/CommManager;)Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v6, v7

    .line 606
    invoke-interface {v3, v5, v6}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 615
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 616
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 617
    iget-object v7, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v7}, Lnet/toddm/comm/CommManager;->access$6(Lnet/toddm/comm/CommManager;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_e

    .line 622
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_d

    .line 631
    :cond_6
    :goto_3
    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$5(Lnet/toddm/comm/CommManager;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    iget-object v5, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v5}, Lnet/toddm/comm/CommManager;->access$8(Lnet/toddm/comm/CommManager;)I

    move-result v5

    if-ge v3, v5, :cond_9

    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$4(Lnet/toddm/comm/CommManager;)Ljava/util/LinkedList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    move-result v3

    if-gtz v3, :cond_7

    goto :goto_5

    .line 634
    :cond_7
    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$4(Lnet/toddm/comm/CommManager;)Ljava/util/LinkedList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_8

    .line 637
    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$4(Lnet/toddm/comm/CommManager;)Ljava/util/LinkedList;

    move-result-object v3

    iget-object v5, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v5}, Lnet/toddm/comm/CommManager;->access$9(Lnet/toddm/comm/CommManager;)Ljava/util/Comparator;

    move-result-object v5

    invoke-static {v3, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 640
    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$4(Lnet/toddm/comm/CommManager;)Ljava/util/LinkedList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnet/toddm/comm/CommWork;

    .line 641
    invoke-virtual {v3}, Lnet/toddm/comm/CommWork;->isDone()Z

    move-result v5

    if-nez v5, :cond_6

    .line 642
    iget-object v5, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    sget-object v6, Lnet/toddm/comm/CommManager$ManagedQueue;->ACTIVE:Lnet/toddm/comm/CommManager$ManagedQueue;

    invoke-static {v5, v3, v6}, Lnet/toddm/comm/CommManager;->access$7(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/CommWork;Lnet/toddm/comm/CommManager$ManagedQueue;)V

    .line 643
    sget-object v5, Lnet/toddm/comm/Work$Status;->RUNNING:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v3, v5}, Lnet/toddm/comm/CommWork;->setState(Lnet/toddm/comm/Work$Status;)V

    .line 644
    iget-object v5, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v5}, Lnet/toddm/comm/CommManager;->access$10(Lnet/toddm/comm/CommManager;)Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    invoke-virtual {v3}, Lnet/toddm/comm/CommWork;->getFutureTask()Ljava/util/concurrent/FutureTask;

    move-result-object v3

    invoke-interface {v5, v3}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_3

    .line 634
    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnet/toddm/comm/CommWork;

    iget-object v6, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v6}, Lnet/toddm/comm/CommManager;->access$0(Lnet/toddm/comm/CommManager;)Lnet/toddm/comm/PriorityManagementProvider;

    move-result-object v6

    invoke-virtual {v5}, Lnet/toddm/comm/CommWork;->getRequestPriority()Lnet/toddm/comm/Priority;

    move-result-object v5

    invoke-interface {v6, v5}, Lnet/toddm/comm/PriorityManagementProvider;->promotePriority(Lnet/toddm/comm/Priority;)V

    goto :goto_4

    .line 649
    :cond_9
    :goto_5
    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$11(Lnet/toddm/comm/CommManager;)J

    move-result-wide v5

    .line 652
    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v3

    if-eqz v3, :cond_a

    .line 653
    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v3

    const-string v7, "[thread:%1$d] Work thread is waiting to be notified [sleepTime:%2$d]"

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Thread;->getId()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v4, v1

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v4, v2

    invoke-interface {v3, v7, v4}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 655
    :cond_a
    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$2(Lnet/toddm/comm/CommManager;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3, v5, v6}, Ljava/lang/Object;->wait(J)V

    .line 656
    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v3

    if-eqz v3, :cond_b

    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v3

    const-string v4, "[thread:%1$d] Work thread is awake"

    new-array v5, v2, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-interface {v3, v4, v5}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 604
    :cond_b
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 659
    :try_start_2
    iget-object v0, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$1(Lnet/toddm/comm/CommManager;)Z

    move-result v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    if-eqz v0, :cond_0

    .line 666
    :goto_6
    iget-object v0, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v0

    const-string v3, "[thread:%1$d] Work Thread exited"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->getId()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v1

    invoke-interface {v0, v3, v2}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_c
    return-void

    .line 622
    :cond_d
    :try_start_3
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnet/toddm/comm/CommWork;

    .line 623
    invoke-virtual {v5}, Lnet/toddm/comm/CommWork;->isDone()Z

    move-result v6

    if-nez v6, :cond_5

    .line 624
    iget-object v6, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    sget-object v7, Lnet/toddm/comm/CommManager$ManagedQueue;->QUEUED:Lnet/toddm/comm/CommManager$ManagedQueue;

    invoke-static {v6, v5, v7}, Lnet/toddm/comm/CommManager;->access$7(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/CommWork;Lnet/toddm/comm/CommManager$ManagedQueue;)V

    .line 625
    sget-object v6, Lnet/toddm/comm/Work$Status;->WAITING:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v5, v6}, Lnet/toddm/comm/CommWork;->setState(Lnet/toddm/comm/Work$Status;)V

    .line 626
    iget-object v6, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v6}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v6

    if-eqz v6, :cond_5

    iget-object v6, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v6}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v6

    const-string v7, "[thread:%1$d] Request %2$d moved from retry to queue"

    new-array v8, v4, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Thread;->getId()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v8, v1

    invoke-virtual {v5}, Lnet/toddm/comm/CommWork;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v8, v2

    invoke-interface {v6, v7, v8}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_2

    .line 617
    :cond_e
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lnet/toddm/comm/CommWork;

    .line 618
    invoke-virtual {v8}, Lnet/toddm/comm/CommWork;->getRetryAfterTimestamp()J

    move-result-wide v9

    cmp-long v9, v9, v5

    if-gtz v9, :cond_4

    .line 619
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :catchall_0
    move-exception v3

    .line 604
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    move-exception v0

    .line 662
    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v3

    if-eqz v3, :cond_f

    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkManagementRunnable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v3

    const-string v4, "[thread:%1$d] failure"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v2, v1

    invoke-interface {v3, v0, v4, v2}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_f
    const-wide/16 v0, 0x1388

    .line 663
    :try_start_5
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto/16 :goto_0
.end method
