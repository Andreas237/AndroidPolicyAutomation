.class Lcom/shopkick/logging/RemoteAppender$SendingThread;
.super Ljava/lang/Thread;
.source "RemoteAppender.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/logging/RemoteAppender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SendingThread"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/logging/RemoteAppender;


# direct methods
.method private constructor <init>(Lcom/shopkick/logging/RemoteAppender;)V
    .locals 0

    .line 469
    iput-object p1, p0, Lcom/shopkick/logging/RemoteAppender$SendingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/logging/RemoteAppender;Lcom/shopkick/logging/RemoteAppender$1;)V
    .locals 0

    .line 469
    invoke-direct {p0, p1}, Lcom/shopkick/logging/RemoteAppender$SendingThread;-><init>(Lcom/shopkick/logging/RemoteAppender;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 473
    :try_start_0
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$SendingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    sget-object v3, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STARTED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    invoke-static {v2, v3}, Lcom/shopkick/logging/RemoteAppender;->access$1002(Lcom/shopkick/logging/RemoteAppender;Lcom/shopkick/logging/RemoteAppender$ThreadState;)Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 474
    invoke-static {}, Lcom/shopkick/logging/RemoteAppender;->access$300()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "Sending consumer running [thread:%1$d]"

    new-array v5, v1, [Ljava/lang/Object;

    .line 477
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v5, v0

    .line 475
    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 474
    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 479
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$SendingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v2}, Lcom/shopkick/logging/RemoteAppender;->access$1300(Lcom/shopkick/logging/RemoteAppender;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 482
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$SendingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v2}, Lcom/shopkick/logging/RemoteAppender;->access$900(Lcom/shopkick/logging/RemoteAppender;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    .line 493
    invoke-static {}, Lcom/shopkick/logging/DbMessagePersistence;->getInstance()Lcom/shopkick/logging/DbMessagePersistence;

    move-result-object v2

    const/16 v3, 0x64

    .line 495
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 494
    invoke-virtual {v2, v3}, Lcom/shopkick/logging/DbMessagePersistence;->getUnsyncedMessages(Ljava/lang/Integer;)Ljava/util/TreeMap;

    move-result-object v2

    .line 496
    iget-object v3, p0, Lcom/shopkick/logging/RemoteAppender$SendingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    iget-object v4, p0, Lcom/shopkick/logging/RemoteAppender$SendingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v4}, Lcom/shopkick/logging/RemoteAppender;->access$900(Lcom/shopkick/logging/RemoteAppender;)J

    move-result-wide v4

    invoke-virtual {v2}, Ljava/util/TreeMap;->size()I

    move-result v6

    int-to-long v6, v6

    sub-long/2addr v4, v6

    invoke-static {v3, v4, v5}, Lcom/shopkick/logging/RemoteAppender;->access$902(Lcom/shopkick/logging/RemoteAppender;J)J

    .line 499
    invoke-virtual {v2}, Ljava/util/TreeMap;->size()I

    move-result v3

    if-lez v3, :cond_1

    .line 500
    iget-object v3, p0, Lcom/shopkick/logging/RemoteAppender$SendingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v3, v2}, Lcom/shopkick/logging/RemoteAppender;->access$1400(Lcom/shopkick/logging/RemoteAppender;Ljava/util/TreeMap;)Z

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    .line 505
    :goto_1
    iget-object v3, p0, Lcom/shopkick/logging/RemoteAppender$SendingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {}, Lcom/shopkick/logging/DbMessagePersistence;->getInstance()Lcom/shopkick/logging/DbMessagePersistence;

    move-result-object v4

    invoke-virtual {v4}, Lcom/shopkick/logging/DbMessagePersistence;->getUnsyncedMessageCount()J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Lcom/shopkick/logging/RemoteAppender;->access$902(Lcom/shopkick/logging/RemoteAppender;J)J

    .line 509
    iget-object v3, p0, Lcom/shopkick/logging/RemoteAppender$SendingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v3}, Lcom/shopkick/logging/RemoteAppender;->access$1300(Lcom/shopkick/logging/RemoteAppender;)Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/shopkick/logging/RemoteAppender$SendingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    .line 510
    invoke-static {v3}, Lcom/shopkick/logging/RemoteAppender;->access$900(Lcom/shopkick/logging/RemoteAppender;)J

    move-result-wide v3

    const-wide/16 v5, 0x64

    cmp-long v3, v3, v5

    if-ltz v3, :cond_2

    if-nez v2, :cond_0

    .line 512
    :cond_2
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$SendingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v2}, Lcom/shopkick/logging/RemoteAppender;->access$200(Lcom/shopkick/logging/RemoteAppender;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 513
    :try_start_1
    iget-object v3, p0, Lcom/shopkick/logging/RemoteAppender$SendingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v3}, Lcom/shopkick/logging/RemoteAppender;->access$200(Lcom/shopkick/logging/RemoteAppender;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/logging/RemoteAppender$SendingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    invoke-static {v4}, Lcom/shopkick/logging/RemoteAppender;->access$1500(Lcom/shopkick/logging/RemoteAppender;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/Object;->wait(J)V

    .line 514
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 525
    :cond_3
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$SendingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    sget-object v3, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    invoke-static {v2, v3}, Lcom/shopkick/logging/RemoteAppender;->access$1002(Lcom/shopkick/logging/RemoteAppender;Lcom/shopkick/logging/RemoteAppender$ThreadState;)Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 526
    invoke-static {}, Lcom/shopkick/logging/RemoteAppender;->access$300()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "Sending consumer exiting [thread:%1$d]"

    new-array v1, v1, [Ljava/lang/Object;

    .line 529
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v1, v0

    goto :goto_2

    :catchall_1
    move-exception v2

    goto :goto_3

    :catch_0
    move-exception v2

    .line 519
    :try_start_3
    invoke-static {}, Lcom/shopkick/logging/RemoteAppender;->access$300()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "Sending consumer failed [thread:%1$d]"

    new-array v6, v1, [Ljava/lang/Object;

    .line 522
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Thread;->getId()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    aput-object v7, v6, v0

    .line 520
    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 519
    invoke-static {v3, v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 525
    iget-object v2, p0, Lcom/shopkick/logging/RemoteAppender$SendingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    sget-object v3, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    invoke-static {v2, v3}, Lcom/shopkick/logging/RemoteAppender;->access$1002(Lcom/shopkick/logging/RemoteAppender;Lcom/shopkick/logging/RemoteAppender$ThreadState;)Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 526
    invoke-static {}, Lcom/shopkick/logging/RemoteAppender;->access$300()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "Sending consumer exiting [thread:%1$d]"

    new-array v1, v1, [Ljava/lang/Object;

    .line 529
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v1, v0

    .line 527
    :goto_2
    invoke-static {v3, v4, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 526
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 525
    :goto_3
    iget-object v3, p0, Lcom/shopkick/logging/RemoteAppender$SendingThread;->this$0:Lcom/shopkick/logging/RemoteAppender;

    sget-object v4, Lcom/shopkick/logging/RemoteAppender$ThreadState;->STOPPED:Lcom/shopkick/logging/RemoteAppender$ThreadState;

    invoke-static {v3, v4}, Lcom/shopkick/logging/RemoteAppender;->access$1002(Lcom/shopkick/logging/RemoteAppender;Lcom/shopkick/logging/RemoteAppender$ThreadState;)Lcom/shopkick/logging/RemoteAppender$ThreadState;

    .line 526
    invoke-static {}, Lcom/shopkick/logging/RemoteAppender;->access$300()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v1, v1, [Ljava/lang/Object;

    .line 529
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v1, v0

    const-string v0, "Sending consumer exiting [thread:%1$d]"

    .line 527
    invoke-static {v4, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 526
    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    throw v2
.end method
