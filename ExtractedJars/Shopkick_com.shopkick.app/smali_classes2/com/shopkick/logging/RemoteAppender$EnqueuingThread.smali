.class Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;
.super Ljava/lang/Thread;
.source "RemoteAppender.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/logging/RemoteAppender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "EnqueuingThread"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/logging/RemoteAppender;


# direct methods
.method private constructor <init>(Lcom/shopkick/logging/RemoteAppender;)V
    .locals 0

    .line 402
    iput-object p1, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/logging/RemoteAppender;Lcom/shopkick/logging/RemoteAppender$1;)V
    .locals 0

    .line 402
    invoke-direct {p0, p1}, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;-><init>(Lcom/shopkick/logging/RemoteAppender;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 406
    :try_start_0
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    sget-object v3, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STARTED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    invoke-static {v2, v3}, Lcom/shopkick/logging/RemoteAppender;->access$602(Lcom/shopkick/logging/RemoteAppender;Lcom/shopkick/logging/RemoteAppender$ThreadState;)Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 407
    invoke-static {}, Lcom/shopkick/logging/RemoteAppender;->access$300()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "Enqueuing consumer running [thread:%1$d]"

    new-array v5, v1, [Ljava/lang/Object;

    .line 410
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v5, v0

    .line 408
    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 407
    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 412
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v2}, Lcom/shopkick/logging/RemoteAppender;->access$700(Lcom/shopkick/logging/RemoteAppender;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 414
    :cond_1
    :goto_1
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v2}, Lcom/shopkick/logging/RemoteAppender;->access$700(Lcom/shopkick/logging/RemoteAppender;)Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v2}, Lcom/shopkick/logging/RemoteAppender;->access$800(Lcom/shopkick/logging/RemoteAppender;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    .line 417
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v2}, Lcom/shopkick/logging/RemoteAppender;->access$800(Lcom/shopkick/logging/RemoteAppender;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/logging/Message;

    .line 418
    iget-object v3, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v3}, Lcom/shopkick/logging/RemoteAppender;->access$900(Lcom/shopkick/logging/RemoteAppender;)J

    move-result-wide v3

    const-wide/16 v5, 0x2710

    cmp-long v3, v3, v5

    if-gez v3, :cond_2

    .line 420
    invoke-static {}, Lcom/shopkick/logging/DbMessagePersistence;->getInstance()Lcom/shopkick/logging/DbMessagePersistence;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/shopkick/logging/DbMessagePersistence;->add(Lcom/shopkick/logging/Message;)Z

    .line 421
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v2}, Lcom/shopkick/logging/RemoteAppender;->access$908(Lcom/shopkick/logging/RemoteAppender;)J

    goto :goto_2

    .line 424
    :cond_2
    invoke-static {}, Lcom/shopkick/logging/RemoteAppender;->access$300()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "Sending queue of length %1$d exceeds max of %2$d, dropping message [thread:%3$d]"

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    .line 427
    invoke-static {v6}, Lcom/shopkick/logging/RemoteAppender;->access$900(Lcom/shopkick/logging/RemoteAppender;)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v5, v0

    const/16 v6, 0x2710

    .line 428
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v1

    const/4 v6, 0x2

    .line 429
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Thread;->getId()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    aput-object v7, v5, v6

    .line 425
    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 424
    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 433
    :goto_2
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v2}, Lcom/shopkick/logging/RemoteAppender;->access$1000(Lcom/shopkick/logging/RemoteAppender;)Lcom/shopkick/logging/RemoteAppender$ThreadState;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    if-ne v2, v3, :cond_3

    .line 434
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-virtual {v2}, Lcom/shopkick/logging/RemoteAppender;->startLogging()Z

    .line 438
    :cond_3
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v2}, Lcom/shopkick/logging/RemoteAppender;->access$900(Lcom/shopkick/logging/RemoteAppender;)J

    move-result-wide v2

    const-wide/16 v4, 0x64

    cmp-long v2, v2, v4

    if-ltz v2, :cond_1

    .line 439
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v2}, Lcom/shopkick/logging/RemoteAppender;->access$200(Lcom/shopkick/logging/RemoteAppender;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 440
    :try_start_1
    iget-object v3, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v3}, Lcom/shopkick/logging/RemoteAppender;->access$200(Lcom/shopkick/logging/RemoteAppender;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->notify()V

    .line 441
    monitor-exit v2

    goto/16 :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v3

    .line 445
    :cond_4
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v2}, Lcom/shopkick/logging/RemoteAppender;->access$700(Lcom/shopkick/logging/RemoteAppender;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v2}, Lcom/shopkick/logging/RemoteAppender;->access$800(Lcom/shopkick/logging/RemoteAppender;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v2

    if-gtz v2, :cond_0

    .line 446
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v2}, Lcom/shopkick/logging/RemoteAppender;->access$1100(Lcom/shopkick/logging/RemoteAppender;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 447
    :try_start_3
    iget-object v3, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v3}, Lcom/shopkick/logging/RemoteAppender;->access$1100(Lcom/shopkick/logging/RemoteAppender;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v4}, Lcom/shopkick/logging/RemoteAppender;->access$1200(Lcom/shopkick/logging/RemoteAppender;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/Object;->wait(J)V

    .line 448
    monitor-exit v2

    goto/16 :goto_0

    :catchall_1
    move-exception v3

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 459
    :cond_5
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    sget-object v3, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    invoke-static {v2, v3}, Lcom/shopkick/logging/RemoteAppender;->access$602(Lcom/shopkick/logging/RemoteAppender;Lcom/shopkick/logging/RemoteAppender$ThreadState;)Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 460
    invoke-static {}, Lcom/shopkick/logging/RemoteAppender;->access$300()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "Enqueuing consumer exiting [thread:%1$d]"

    new-array v1, v1, [Ljava/lang/Object;

    .line 463
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v1, v0

    goto :goto_3

    :catchall_2
    move-exception v2

    goto :goto_4

    :catch_0
    move-exception v2

    .line 453
    :try_start_5
    invoke-static {}, Lcom/shopkick/logging/RemoteAppender;->access$300()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "Enqueuing consumer failed [thread:%1$d]"

    new-array v6, v1, [Ljava/lang/Object;

    .line 456
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Thread;->getId()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    aput-object v7, v6, v0

    .line 454
    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 453
    invoke-static {v3, v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 459
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    sget-object v3, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    invoke-static {v2, v3}, Lcom/shopkick/logging/RemoteAppender;->access$602(Lcom/shopkick/logging/RemoteAppender;Lcom/shopkick/logging/RemoteAppender$ThreadState;)Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 460
    invoke-static {}, Lcom/shopkick/logging/RemoteAppender;->access$300()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "Enqueuing consumer exiting [thread:%1$d]"

    new-array v1, v1, [Ljava/lang/Object;

    .line 463
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v1, v0

    .line 461
    :goto_3
    invoke-static {v3, v4, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 460
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 459
    :goto_4
    iget-object v3, p0, Lcom/shopkick/logging/RemoteAppender$EnqueuingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    sget-object v4, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    invoke-static {v3, v4}, Lcom/shopkick/logging/RemoteAppender;->access$602(Lcom/shopkick/logging/RemoteAppender;Lcom/shopkick/logging/RemoteAppender$ThreadState;)Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 460
    invoke-static {}, Lcom/shopkick/logging/RemoteAppender;->access$300()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v1, v1, [Ljava/lang/Object;

    .line 463
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v1, v0

    const-string v0, "Enqueuing consumer exiting [thread:%1$d]"

    .line 461
    invoke-static {v4, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 460
    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    throw v2
.end method
