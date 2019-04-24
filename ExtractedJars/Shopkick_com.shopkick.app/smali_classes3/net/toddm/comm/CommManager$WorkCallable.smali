.class Lnet/toddm/comm/CommManager$WorkCallable;
.super Ljava/lang/Object;
.source "CommManager.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/toddm/comm/CommManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "WorkCallable"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lnet/toddm/comm/Response;",
        ">;"
    }
.end annotation


# static fields
.field private static synthetic $SWITCH_TABLE$net$toddm$comm$Work$Status:[I


# instance fields
.field private _logPrefix:Ljava/lang/String;

.field private final _work:Lnet/toddm/comm/CommWork;

.field final synthetic this$0:Lnet/toddm/comm/CommManager;


# direct methods
.method static synthetic $SWITCH_TABLE$net$toddm$comm$Work$Status()[I
    .locals 3

    .line 682
    sget-object v0, Lnet/toddm/comm/CommManager$WorkCallable;->$SWITCH_TABLE$net$toddm$comm$Work$Status:[I

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Lnet/toddm/comm/Work$Status;->values()[Lnet/toddm/comm/Work$Status;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lnet/toddm/comm/Work$Status;->CANCELLED:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v1}, Lnet/toddm/comm/Work$Status;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v1, Lnet/toddm/comm/Work$Status;->COMPLETED:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v1}, Lnet/toddm/comm/Work$Status;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v1, Lnet/toddm/comm/Work$Status;->CREATED:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v1}, Lnet/toddm/comm/Work$Status;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v1, Lnet/toddm/comm/Work$Status;->REDIRECTING:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v1}, Lnet/toddm/comm/Work$Status;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v1, Lnet/toddm/comm/Work$Status;->RETRYING:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v1}, Lnet/toddm/comm/Work$Status;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v1, Lnet/toddm/comm/Work$Status;->RUNNING:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v1}, Lnet/toddm/comm/Work$Status;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v1, Lnet/toddm/comm/Work$Status;->WAITING:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v1}, Lnet/toddm/comm/Work$Status;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    sput-object v0, Lnet/toddm/comm/CommManager$WorkCallable;->$SWITCH_TABLE$net$toddm$comm$Work$Status:[I

    return-object v0
.end method

.method private constructor <init>(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/CommWork;)V
    .locals 0

    .line 687
    iput-object p1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 685
    iput-object p1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 689
    iput-object p2, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    return-void

    .line 688
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'work\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method synthetic constructor <init>(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/CommWork;Lnet/toddm/comm/CommManager$WorkCallable;)V
    .locals 0

    .line 687
    invoke-direct {p0, p1, p2}, Lnet/toddm/comm/CommManager$WorkCallable;-><init>(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/CommWork;)V

    return-void
.end method

.method private cleanup()V
    .locals 7

    .line 1140
    iget-object v0, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$2(Lnet/toddm/comm/CommManager;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 1142
    :try_start_0
    iget-object v1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v1}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v1}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v1

    const-string v4, "%1$s Work completed, doing cleanup [state:%2$s]"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v6, v5, v3

    iget-object v6, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v6}, Lnet/toddm/comm/CommWork;->getState()Lnet/toddm/comm/Work$Status;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-interface {v1, v4, v5}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1146
    :cond_0
    invoke-static {}, Lnet/toddm/comm/CommManager$WorkCallable;->$SWITCH_TABLE$net$toddm$comm$Work$Status()[I

    move-result-object v1

    iget-object v4, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v4}, Lnet/toddm/comm/CommWork;->getState()Lnet/toddm/comm/Work$Status;

    move-result-object v4

    invoke-virtual {v4}, Lnet/toddm/comm/Work$Status;->ordinal()I

    move-result v4

    aget v1, v1, v4

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 1160
    :pswitch_0
    iget-object v1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    iget-object v4, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-static {v1, v4}, Lnet/toddm/comm/CommManager;->access$22(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/Work;)V

    .line 1161
    iget-object v1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v1}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v1}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v1

    const-string v4, "[thread:%1$d] Kicking work thread"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v2, v3

    invoke-interface {v1, v4, v2}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1162
    :cond_1
    iget-object v1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v1}, Lnet/toddm/comm/CommManager;->access$2(Lnet/toddm/comm/CommManager;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 1140
    :goto_0
    :pswitch_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private handleWorkUpdatesOnException(Ljava/lang/Exception;)V
    .locals 5

    .line 973
    iget-object v0, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v0, p1}, Lnet/toddm/comm/CommWork;->setException(Ljava/lang/Exception;)V

    .line 976
    iget-object v0, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$18(Lnet/toddm/comm/CommManager;)Lnet/toddm/comm/RetryPolicyProvider;

    move-result-object v0

    iget-object v1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-interface {v0, v1, p1}, Lnet/toddm/comm/RetryPolicyProvider;->shouldRetry(Lnet/toddm/comm/Work;Ljava/lang/Exception;)Lnet/toddm/comm/RetryProfile;

    move-result-object p1

    .line 977
    iget-object v0, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$2(Lnet/toddm/comm/CommManager;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 978
    :try_start_0
    iget-object v1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v1}, Lnet/toddm/comm/CommWork;->isDone()Z

    move-result v1

    if-nez v1, :cond_1

    .line 979
    invoke-virtual {p1}, Lnet/toddm/comm/RetryProfile;->shouldRetry()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 982
    iget-object v1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {p1}, Lnet/toddm/comm/RetryProfile;->getRetryAfterMilliseconds()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lnet/toddm/comm/CommWork;->updateRetryAfterTimestamp(J)V

    .line 983
    iget-object p1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {p1}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object p1

    invoke-virtual {p1}, Lnet/toddm/comm/Request;->incrementRetryCountFromFailure()V

    .line 984
    iget-object p1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    sget-object v1, Lnet/toddm/comm/Work$Status;->RETRYING:Lnet/toddm/comm/Work$Status;

    invoke-virtual {p1, v1}, Lnet/toddm/comm/CommWork;->setState(Lnet/toddm/comm/Work$Status;)V

    .line 987
    iget-object p1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    iget-object v1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    sget-object v2, Lnet/toddm/comm/CommManager$ManagedQueue;->RETRY:Lnet/toddm/comm/CommManager$ManagedQueue;

    invoke-static {p1, v1, v2}, Lnet/toddm/comm/CommManager;->access$7(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/CommWork;Lnet/toddm/comm/CommManager$ManagedQueue;)V

    .line 990
    iget-object p1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    new-instance v1, Ljava/util/concurrent/FutureTask;

    new-instance v2, Lnet/toddm/comm/CommManager$WorkCallable;

    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    iget-object v4, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-direct {v2, v3, v4}, Lnet/toddm/comm/CommManager$WorkCallable;-><init>(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/CommWork;)V

    invoke-direct {v1, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-virtual {p1, v1}, Lnet/toddm/comm/CommWork;->addFutureTask(Ljava/util/concurrent/FutureTask;)V

    .line 991
    iget-object p1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {p1}, Lnet/toddm/comm/CommManager;->access$2(Lnet/toddm/comm/CommManager;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    goto :goto_0

    .line 994
    :cond_0
    iget-object p1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    sget-object v1, Lnet/toddm/comm/Work$Status;->COMPLETED:Lnet/toddm/comm/Work$Status;

    invoke-virtual {p1, v1}, Lnet/toddm/comm/CommWork;->setState(Lnet/toddm/comm/Work$Status;)V

    .line 977
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private handleWorkUpdatesOnResponse(Lnet/toddm/comm/Response;Ljava/net/HttpURLConnection;)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 1010
    iget-object v2, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v2}, Lnet/toddm/comm/CommManager;->access$18(Lnet/toddm/comm/CommManager;)Lnet/toddm/comm/RetryPolicyProvider;

    move-result-object v2

    iget-object v3, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-interface {v2, v3, v0}, Lnet/toddm/comm/RetryPolicyProvider;->shouldRetry(Lnet/toddm/comm/Work;Lnet/toddm/comm/Response;)Lnet/toddm/comm/RetryProfile;

    move-result-object v2

    .line 1011
    invoke-virtual {v2}, Lnet/toddm/comm/RetryProfile;->shouldRetry()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1015
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$2(Lnet/toddm/comm/CommManager;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    .line 1016
    :try_start_0
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v0}, Lnet/toddm/comm/CommWork;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1017
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v2}, Lnet/toddm/comm/RetryProfile;->getRetryAfterMilliseconds()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lnet/toddm/comm/CommWork;->updateRetryAfterTimestamp(J)V

    .line 1018
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v0}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/Request;->incrementRetryCountFromResponse()V

    .line 1019
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    sget-object v2, Lnet/toddm/comm/Work$Status;->RETRYING:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v0, v2}, Lnet/toddm/comm/CommWork;->setState(Lnet/toddm/comm/Work$Status;)V

    .line 1022
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    new-instance v2, Ljava/util/concurrent/FutureTask;

    new-instance v4, Lnet/toddm/comm/CommManager$WorkCallable;

    iget-object v5, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    iget-object v6, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-direct {v4, v5, v6}, Lnet/toddm/comm/CommManager$WorkCallable;-><init>(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/CommWork;)V

    invoke-direct {v2, v4}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-virtual {v0, v2}, Lnet/toddm/comm/CommWork;->addFutureTask(Ljava/util/concurrent/FutureTask;)V

    .line 1023
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    iget-object v2, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    sget-object v4, Lnet/toddm/comm/CommManager$ManagedQueue;->RETRY:Lnet/toddm/comm/CommManager$ManagedQueue;

    invoke-static {v0, v2, v4}, Lnet/toddm/comm/CommManager;->access$7(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/CommWork;Lnet/toddm/comm/CommManager$ManagedQueue;)V

    .line 1024
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$2(Lnet/toddm/comm/CommManager;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 1015
    :cond_0
    monitor-exit v3

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1028
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x12d

    const-wide/16 v4, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-eq v2, v3, :cond_2

    invoke-virtual/range {p1 .. p1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x12e

    if-eq v2, v3, :cond_2

    invoke-virtual/range {p1 .. p1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x12f

    if-ne v2, v3, :cond_5

    .line 1029
    :cond_2
    iget-object v2, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v2}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v2

    invoke-virtual {v2}, Lnet/toddm/comm/Request;->getRedirectCount()I

    move-result v2

    iget-object v3, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$19(Lnet/toddm/comm/CommManager;)I

    move-result v3

    if-ge v2, v3, :cond_5

    .line 1030
    invoke-virtual/range {p2 .. p2}, Ljava/net/HttpURLConnection;->getInstanceFollowRedirects()Z

    move-result v2

    if-nez v2, :cond_5

    .line 1035
    iget-object v2, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v2}, Lnet/toddm/comm/CommManager;->access$2(Lnet/toddm/comm/CommManager;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 1036
    :try_start_1
    iget-object v3, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v3}, Lnet/toddm/comm/CommWork;->isCancelled()Z

    move-result v3

    if-nez v3, :cond_4

    .line 1037
    iget-object v3, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v3}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v3

    invoke-virtual {v0, v3}, Lnet/toddm/comm/Response;->getLocationFromHeaders(Lnet/toddm/comm/Request;)Ljava/net/URI;

    move-result-object v0

    .line 1038
    iget-object v3, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-object v3, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v3

    const-string v9, "%1$s Redirecting from %2$s to %3$s"

    const/4 v10, 0x3

    new-array v10, v10, [Ljava/lang/Object;

    iget-object v11, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v11, v10, v8

    iget-object v8, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v8}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v8

    invoke-virtual {v8}, Lnet/toddm/comm/Request;->getUri()Ljava/net/URI;

    move-result-object v8

    invoke-virtual {v8}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v10, v6

    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v10, v7

    invoke-interface {v3, v9, v10}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1039
    :cond_3
    iget-object v3, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v3}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v3

    invoke-virtual {v3, v0}, Lnet/toddm/comm/Request;->redirect(Ljava/net/URI;)Z

    .line 1042
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v0, v4, v5}, Lnet/toddm/comm/CommWork;->updateRetryAfterTimestamp(J)V

    .line 1043
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    sget-object v3, Lnet/toddm/comm/Work$Status;->REDIRECTING:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v0, v3}, Lnet/toddm/comm/CommWork;->setState(Lnet/toddm/comm/Work$Status;)V

    .line 1044
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    new-instance v3, Ljava/util/concurrent/FutureTask;

    new-instance v4, Lnet/toddm/comm/CommManager$WorkCallable;

    iget-object v5, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    iget-object v6, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-direct {v4, v5, v6}, Lnet/toddm/comm/CommManager$WorkCallable;-><init>(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/CommWork;)V

    invoke-direct {v3, v4}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-virtual {v0, v3}, Lnet/toddm/comm/CommWork;->addFutureTask(Ljava/util/concurrent/FutureTask;)V

    .line 1045
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    iget-object v3, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    sget-object v4, Lnet/toddm/comm/CommManager$ManagedQueue;->RETRY:Lnet/toddm/comm/CommManager$ManagedQueue;

    invoke-static {v0, v3, v4}, Lnet/toddm/comm/CommManager;->access$7(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/CommWork;Lnet/toddm/comm/CommManager$ManagedQueue;)V

    .line 1046
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$2(Lnet/toddm/comm/CommManager;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 1035
    :cond_4
    monitor-exit v2

    goto/16 :goto_4

    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0

    .line 1050
    :cond_5
    iget-object v2, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v2}, Lnet/toddm/comm/CommWork;->shouldCache()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 1051
    iget-object v2, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v2}, Lnet/toddm/comm/CommWork;->getCachedResponse()Lnet/toddm/cache/CacheEntry;

    move-result-object v2

    if-eqz v2, :cond_a

    .line 1052
    iget-object v2, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v2}, Lnet/toddm/comm/CommManager;->access$20(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/CacheProvider;

    move-result-object v2

    if-eqz v2, :cond_a

    .line 1053
    invoke-virtual/range {p1 .. p1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x130

    if-ne v2, v3, :cond_a

    .line 1058
    iget-object v2, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v2}, Lnet/toddm/comm/CommWork;->getCachedResponse()Lnet/toddm/cache/CacheEntry;

    move-result-object v2

    .line 1061
    invoke-virtual/range {p1 .. p1}, Lnet/toddm/comm/Response;->getTtlFromHeaders()Ljava/lang/Long;

    move-result-object v3

    if-nez v3, :cond_6

    .line 1062
    invoke-virtual {v2}, Lnet/toddm/cache/CacheEntry;->getTtl()Ljava/lang/Long;

    move-result-object v3

    .line 1065
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lnet/toddm/comm/Response;->getETagFromHeaders()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_7

    .line 1066
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-gtz v5, :cond_8

    :cond_7
    invoke-virtual {v2}, Lnet/toddm/cache/CacheEntry;->getEtag()Ljava/lang/String;

    move-result-object v4

    :cond_8
    move-object/from16 v16, v4

    .line 1069
    invoke-virtual/range {p1 .. p1}, Lnet/toddm/comm/Response;->getMaxStaleFromHeaders()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_9

    .line 1070
    invoke-virtual {v2}, Lnet/toddm/cache/CacheEntry;->getMaxStale()Ljava/lang/Long;

    move-result-object v0

    .line 1074
    :cond_9
    iget-object v4, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v4}, Lnet/toddm/comm/CommManager;->access$20(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/CacheProvider;

    move-result-object v4

    invoke-virtual {v2}, Lnet/toddm/cache/CacheEntry;->getKey()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Lnet/toddm/cache/CacheProvider;->remove(Ljava/lang/String;)Z

    .line 1075
    iget-object v4, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v4}, Lnet/toddm/comm/CommManager;->access$20(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/CacheProvider;

    move-result-object v9

    invoke-virtual {v2}, Lnet/toddm/cache/CacheEntry;->getKey()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lnet/toddm/cache/CacheEntry;->getBytesValue()[B

    move-result-object v11

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    invoke-virtual {v2}, Lnet/toddm/cache/CacheEntry;->getUri()Ljava/net/URI;

    move-result-object v17

    invoke-virtual {v2}, Lnet/toddm/cache/CacheEntry;->getPriority()Lnet/toddm/cache/CachePriority;

    move-result-object v18

    invoke-interface/range {v9 .. v18}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    .line 1078
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0, v2}, Lnet/toddm/comm/CommManager;->access$21(Lnet/toddm/comm/CommManager;Lnet/toddm/cache/CacheEntry;)Lnet/toddm/comm/Response;

    move-result-object v0

    .line 1079
    iget-object v2, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v2, v0}, Lnet/toddm/comm/CommWork;->setResponse(Lnet/toddm/comm/Response;)V

    .line 1080
    iget-object v2, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    new-instance v3, Lnet/toddm/comm/CachedResponseFuture;

    invoke-direct {v3, v0}, Lnet/toddm/comm/CachedResponseFuture;-><init>(Lnet/toddm/comm/Response;)V

    invoke-virtual {v2, v3}, Lnet/toddm/comm/CommWork;->addFutureTask(Ljava/util/concurrent/FutureTask;)V

    .line 1081
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    sget-object v2, Lnet/toddm/comm/Work$Status;->COMPLETED:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v0, v2}, Lnet/toddm/comm/CommWork;->setState(Lnet/toddm/comm/Work$Status;)V

    .line 1082
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v0

    if-eqz v0, :cond_15

    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v0

    const-string v2, "[thread:%1$d] handleWorkUpdatesOnResponse() Returning cached results post 304 [id:%2$d]"

    new-array v3, v7, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->getId()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v8

    iget-object v4, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v4}, Lnet/toddm/comm/CommWork;->getId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-interface {v0, v2, v3}, Lnet/toddm/cache/LoggingProvider;->info(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 1084
    :cond_a
    iget-object v2, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v2}, Lnet/toddm/comm/CommWork;->shouldCache()Z

    move-result v2

    if-eqz v2, :cond_14

    iget-object v2, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v2}, Lnet/toddm/comm/CommManager;->access$20(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/CacheProvider;

    move-result-object v2

    if-eqz v2, :cond_14

    invoke-virtual/range {p1 .. p1}, Lnet/toddm/comm/Response;->isSuccessful()Z

    move-result v2

    if-eqz v2, :cond_14

    const/4 v2, 0x0

    .line 1092
    :try_start_2
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 1093
    :try_start_3
    new-instance v9, Ljava/io/ObjectOutputStream;

    invoke-direct {v9, v3}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1094
    :try_start_4
    invoke-interface {v9, v0}, Ljava/io/ObjectOutput;->writeObject(Ljava/lang/Object;)V

    .line 1095
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v12

    if-eqz v12, :cond_e

    .line 1096
    array-length v2, v12

    if-lez v2, :cond_e

    .line 1099
    invoke-virtual/range {p1 .. p1}, Lnet/toddm/comm/Response;->getTtlFromHeaders()Ljava/lang/Long;

    move-result-object v2

    if-nez v2, :cond_b

    const-wide v10, 0x7fffffffffffffffL

    .line 1100
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 1103
    :cond_b
    invoke-virtual/range {p1 .. p1}, Lnet/toddm/comm/Response;->getETagFromHeaders()Ljava/lang/String;

    move-result-object v17

    .line 1106
    invoke-virtual/range {p1 .. p1}, Lnet/toddm/comm/Response;->getMaxStaleFromHeaders()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_c

    .line 1107
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 1109
    :cond_c
    iget-object v4, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v4}, Lnet/toddm/comm/CommManager;->access$20(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/CacheProvider;

    move-result-object v10

    .line 1110
    iget-object v4, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v4}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v4

    invoke-virtual {v4}, Lnet/toddm/comm/Request;->getId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v11

    .line 1112
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    .line 1113
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v15

    .line 1115
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v0}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/Request;->getUri()Ljava/net/URI;

    move-result-object v18

    .line 1116
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v0}, Lnet/toddm/comm/CommWork;->getCachingPriority()Lnet/toddm/cache/CachePriority;

    move-result-object v19

    .line 1109
    invoke-interface/range {v10 .. v19}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    .line 1117
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v0

    if-eqz v0, :cond_d

    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v0

    const-string v2, "%1$s Response for request %2$d added to cache"

    new-array v4, v7, [Ljava/lang/Object;

    iget-object v5, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v5, v4, v8

    iget-object v5, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v5}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v5

    invoke-virtual {v5}, Lnet/toddm/comm/Request;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-interface {v0, v2, v4}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1120
    :cond_d
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$20(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/CacheProvider;

    move-result-object v0

    invoke-interface {v0}, Lnet/toddm/cache/CacheProvider;->trimLru()Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1125
    :cond_e
    :try_start_5
    invoke-interface {v9}, Ljava/io/ObjectOutput;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 1126
    :catch_0
    :try_start_6
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    goto :goto_2

    :catchall_2
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_0

    :catchall_3
    move-exception v0

    move-object v9, v2

    goto :goto_3

    :catch_2
    move-exception v0

    move-object v9, v2

    :goto_0
    move-object v2, v3

    goto :goto_1

    :catchall_4
    move-exception v0

    move-object v3, v2

    move-object v9, v3

    goto :goto_3

    :catch_3
    move-exception v0

    move-object v9, v2

    .line 1123
    :goto_1
    :try_start_7
    iget-object v3, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v3

    if-eqz v3, :cond_f

    iget-object v3, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v3

    const-string v4, "Response serialization to cache failed"

    new-array v5, v8, [Ljava/lang/Object;

    invoke-interface {v3, v0, v4, v5}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    :cond_f
    if-eqz v9, :cond_10

    .line 1125
    :try_start_8
    invoke-interface {v9}, Ljava/io/ObjectOutput;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    :catch_4
    :cond_10
    if-eqz v2, :cond_11

    .line 1126
    :try_start_9
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    .line 1128
    :catch_5
    :cond_11
    :goto_2
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    sget-object v2, Lnet/toddm/comm/Work$Status;->COMPLETED:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v0, v2}, Lnet/toddm/comm/CommWork;->setState(Lnet/toddm/comm/Work$Status;)V

    goto :goto_4

    :catchall_5
    move-exception v0

    move-object v3, v2

    :goto_3
    if-eqz v9, :cond_12

    .line 1125
    :try_start_a
    invoke-interface {v9}, Ljava/io/ObjectOutput;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6

    :catch_6
    :cond_12
    if-eqz v3, :cond_13

    .line 1126
    :try_start_b
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_7

    .line 1127
    :catch_7
    :cond_13
    throw v0

    .line 1133
    :cond_14
    iget-object v0, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    sget-object v2, Lnet/toddm/comm/Work$Status;->COMPLETED:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v0, v2}, Lnet/toddm/comm/CommWork;->setState(Lnet/toddm/comm/Work$Status;)V

    :cond_15
    :goto_4
    return-void
.end method

.method private processesRequest()Lnet/toddm/comm/Response;
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    move-object/from16 v1, p0

    .line 737
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 745
    :try_start_0
    iget-object v8, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v8}, Lnet/toddm/comm/CommWork;->getDependentWork()Lnet/toddm/comm/CommWork;

    move-result-object v8
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_22
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_21
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_20
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    if-eqz v8, :cond_8

    .line 748
    :try_start_1
    iget-object v9, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v9}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v9

    const-string v10, "%1$s Dependent Work found [dependentWork:%2$d]"

    new-array v11, v5, [Ljava/lang/Object;

    iget-object v12, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v12, v11, v7

    invoke-virtual {v8}, Lnet/toddm/comm/CommWork;->getId()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v11, v6

    invoke-interface {v9, v10, v11}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 749
    sget-object v9, Lnet/toddm/comm/Work$Status;->CREATED:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v8}, Lnet/toddm/comm/CommWork;->getState()Lnet/toddm/comm/Work$Status;

    move-result-object v10

    invoke-virtual {v9, v10}, Lnet/toddm/comm/Work$Status;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 752
    iget-object v9, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v9}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v9

    const-string v10, "%1$s Starting Dependent Work, re-enqueuing current work [dependentWork:%2$d]"

    new-array v11, v5, [Ljava/lang/Object;

    iget-object v12, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v12, v11, v7

    invoke-virtual {v8}, Lnet/toddm/comm/CommWork;->getId()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v11, v6

    invoke-interface {v9, v10, v11}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 753
    iget-object v9, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-virtual {v9, v8}, Lnet/toddm/comm/CommManager;->enqueueWork(Lnet/toddm/comm/SubmittableWork;)Lnet/toddm/comm/Work;

    .line 754
    invoke-direct/range {p0 .. p0}, Lnet/toddm/comm/CommManager$WorkCallable;->reEnqueueWorkForDependentWork()V
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 948
    iget-object v8, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v8}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v8

    if-eqz v8, :cond_0

    iget-object v8, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v8}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v8

    const-string v9, "%1$s Processing took %2$d milliseconds"

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v10, v5, v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sub-long/2addr v10, v2

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v5, v6

    invoke-interface {v8, v9, v5}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-object v4

    .line 756
    :cond_1
    :try_start_2
    invoke-virtual {v8}, Lnet/toddm/comm/CommWork;->isPending()Z

    move-result v9

    if-eqz v9, :cond_3

    .line 759
    iget-object v9, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v9}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v9

    const-string v10, "%1$s Re-enqueuing current work [dependentWork:%2$d]"

    new-array v11, v5, [Ljava/lang/Object;

    iget-object v12, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v12, v11, v7

    invoke-virtual {v8}, Lnet/toddm/comm/CommWork;->getId()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v11, v6

    invoke-interface {v9, v10, v11}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 760
    invoke-direct/range {p0 .. p0}, Lnet/toddm/comm/CommManager$WorkCallable;->reEnqueueWorkForDependentWork()V
    :try_end_2
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 948
    iget-object v8, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v8}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v8

    if-eqz v8, :cond_2

    iget-object v8, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v8}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v8

    const-string v9, "%1$s Processing took %2$d milliseconds"

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v10, v5, v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sub-long/2addr v10, v2

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v5, v6

    invoke-interface {v8, v9, v5}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return-object v4

    .line 762
    :cond_3
    :try_start_3
    sget-object v9, Lnet/toddm/comm/Work$Status;->RUNNING:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v8}, Lnet/toddm/comm/CommWork;->getState()Lnet/toddm/comm/Work$Status;

    move-result-object v10

    invoke-virtual {v9, v10}, Lnet/toddm/comm/Work$Status;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 765
    iget-object v9, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v9}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v9

    const-string v10, "%1$s Blocking on Dependent Work [dependentWork:%2$d]"

    new-array v11, v5, [Ljava/lang/Object;

    iget-object v12, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v12, v11, v7

    invoke-virtual {v8}, Lnet/toddm/comm/CommWork;->getId()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v11, v6

    invoke-interface {v9, v10, v11}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 766
    invoke-virtual {v8}, Lnet/toddm/comm/CommWork;->get()Lnet/toddm/comm/Response;

    .line 770
    :cond_4
    invoke-virtual {v8}, Lnet/toddm/comm/CommWork;->isDone()Z

    move-result v9

    if-eqz v9, :cond_7

    .line 775
    iget-object v9, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v9}, Lnet/toddm/comm/CommWork;->getDependentWorkListener()Lnet/toddm/comm/DependentWorkListener;

    move-result-object v9

    if-eqz v9, :cond_6

    .line 776
    iget-object v9, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v9}, Lnet/toddm/comm/CommWork;->getDependentWorkListener()Lnet/toddm/comm/DependentWorkListener;

    move-result-object v9

    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-interface {v9, v8, v10}, Lnet/toddm/comm/DependentWorkListener;->onDependentWorkCompleted(Lnet/toddm/comm/Work;Lnet/toddm/comm/Work;)Z

    move-result v9

    if-nez v9, :cond_6

    .line 777
    iget-object v9, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v9}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v9

    const-string v10, "%1$s Cancelling current work due to Dependent Work results [dependentWork:%2$d]"

    new-array v11, v5, [Ljava/lang/Object;

    iget-object v12, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v12, v11, v7

    invoke-virtual {v8}, Lnet/toddm/comm/CommWork;->getId()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v11, v6

    invoke-interface {v9, v10, v11}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 778
    iget-object v8, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    sget-object v9, Lnet/toddm/comm/Work$Status;->CANCELLED:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v8, v9}, Lnet/toddm/comm/CommWork;->setState(Lnet/toddm/comm/Work$Status;)V
    :try_end_3
    .catch Ljava/net/MalformedURLException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 948
    iget-object v8, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v8}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v8

    if-eqz v8, :cond_5

    iget-object v8, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v8}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v8

    const-string v9, "%1$s Processing took %2$d milliseconds"

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v10, v5, v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sub-long/2addr v10, v2

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v5, v6

    invoke-interface {v8, v9, v5}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_5
    return-object v4

    .line 782
    :cond_6
    :try_start_4
    iget-object v9, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v9}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v9

    const-string v10, "%1$s Dependent Work completed [dependentWork:%2$d]"

    new-array v11, v5, [Ljava/lang/Object;

    iget-object v12, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v12, v11, v7

    invoke-virtual {v8}, Lnet/toddm/comm/CommWork;->getId()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v11, v6

    invoke-interface {v9, v10, v11}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 771
    :cond_7
    new-instance v8, Ljava/lang/IllegalStateException;

    const-string v9, "Work should have been re-enqueued or blocked on until finished"

    invoke-direct {v8, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v8
    :try_end_4
    .catch Ljava/net/MalformedURLException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception v0

    move-object v6, v0

    move-object v9, v4

    move-object v10, v9

    goto/16 :goto_15

    :catch_0
    move-exception v0

    move-object v6, v0

    move-object v9, v4

    move-object v10, v9

    goto/16 :goto_11

    :catch_1
    move-exception v0

    move-object v6, v0

    move-object v9, v4

    move-object v10, v9

    goto/16 :goto_12

    :catch_2
    move-exception v0

    move-object v6, v0

    move-object v9, v4

    move-object v10, v9

    goto/16 :goto_13

    .line 786
    :cond_8
    :goto_0
    :try_start_5
    iget-object v8, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v8}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v8

    invoke-virtual {v8}, Lnet/toddm/comm/Request;->getUri()Ljava/net/URI;

    move-result-object v8

    invoke-virtual {v8}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object v8

    .line 787
    invoke-virtual {v8}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v9

    check-cast v9, Ljava/net/HttpURLConnection;
    :try_end_5
    .catch Ljava/net/MalformedURLException; {:try_start_5 .. :try_end_5} :catch_22
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_21
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_20
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    .line 790
    :try_start_6
    instance-of v10, v9, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_6
    .catch Ljava/net/MalformedURLException; {:try_start_6 .. :try_end_6} :catch_1f
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1e
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1d
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    if-eqz v10, :cond_9

    :try_start_7
    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v10}, Lnet/toddm/comm/CommManager;->access$12(Lnet/toddm/comm/CommManager;)Z

    move-result v10
    :try_end_7
    .catch Ljava/net/MalformedURLException; {:try_start_7 .. :try_end_7} :catch_6
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-eqz v10, :cond_9

    :try_start_8
    const-string v10, "SSL"

    .line 792
    invoke-static {v10}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v10

    .line 793
    invoke-static {}, Lnet/toddm/comm/CommManager;->access$13()[Ljavax/net/ssl/TrustManager;

    move-result-object v11

    new-instance v12, Ljava/security/SecureRandom;

    invoke-direct {v12}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v10, v4, v11, v12}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 794
    move-object v11, v9

    check-cast v11, Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v10}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v10

    invoke-virtual {v11, v10}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 795
    move-object v10, v9

    check-cast v10, Ljavax/net/ssl/HttpsURLConnection;

    invoke-static {}, Lnet/toddm/comm/CommManager;->access$14()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/net/MalformedURLException; {:try_start_8 .. :try_end_8} :catch_6
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_1

    :catch_3
    move-exception v0

    move-object v10, v0

    .line 797
    :try_start_9
    iget-object v11, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v11}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v11

    if-eqz v11, :cond_9

    iget-object v11, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v11}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v11

    const-string v12, "%1$s Disabling SSL cert checking failed"

    new-array v13, v6, [Ljava/lang/Object;

    iget-object v14, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v14, v13, v7

    invoke-interface {v11, v10, v12, v13}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/net/MalformedURLException; {:try_start_9 .. :try_end_9} :catch_6
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v6, v0

    move-object v10, v4

    goto/16 :goto_15

    :catch_4
    move-exception v0

    move-object v6, v0

    move-object v10, v4

    goto/16 :goto_11

    :catch_5
    move-exception v0

    move-object v6, v0

    move-object v10, v4

    goto/16 :goto_12

    :catch_6
    move-exception v0

    move-object v6, v0

    move-object v10, v4

    goto/16 :goto_13

    .line 802
    :cond_9
    :goto_1
    :try_start_a
    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v10}, Lnet/toddm/comm/CommManager;->access$15(Lnet/toddm/comm/CommManager;)Z

    move-result v10

    invoke-virtual {v9, v10}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 803
    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v10}, Lnet/toddm/comm/CommManager;->access$16(Lnet/toddm/comm/CommManager;)I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 804
    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v10}, Lnet/toddm/comm/CommManager;->access$17(Lnet/toddm/comm/CommManager;)I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 805
    invoke-virtual {v9, v6}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 806
    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v10}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v10

    invoke-virtual {v10}, Lnet/toddm/comm/Request;->getMethod()Lnet/toddm/comm/Request$RequestMethod;

    move-result-object v10

    invoke-virtual {v10}, Lnet/toddm/comm/Request$RequestMethod;->name()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const-string v10, "Accept-Encoding"

    const-string v11, "gzip"

    .line 809
    invoke-virtual {v9, v10, v11}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v10, "Cache-Control"

    const-string v11, "no-transform"

    .line 810
    invoke-virtual {v9, v10, v11}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 813
    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v10}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v10

    invoke-virtual {v10}, Lnet/toddm/comm/Request;->getHeaders()Ljava/util/Map;

    move-result-object v10
    :try_end_a
    .catch Ljava/net/MalformedURLException; {:try_start_a .. :try_end_a} :catch_1f
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_1e
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1d
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    if-eqz v10, :cond_b

    .line 814
    :try_start_b
    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v10}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v10

    invoke-virtual {v10}, Lnet/toddm/comm/Request;->getHeaders()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-nez v11, :cond_a

    goto :goto_3

    :cond_a
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 815
    iget-object v12, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v12}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v12

    invoke-virtual {v12}, Lnet/toddm/comm/Request;->getHeaders()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v9, v11, v12}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/net/MalformedURLException; {:try_start_b .. :try_end_b} :catch_6
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    goto :goto_2

    .line 820
    :cond_b
    :goto_3
    :try_start_c
    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v10}, Lnet/toddm/comm/CommWork;->getCachedResponse()Lnet/toddm/cache/CacheEntry;

    move-result-object v10
    :try_end_c
    .catch Ljava/net/MalformedURLException; {:try_start_c .. :try_end_c} :catch_1f
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_1e
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1d
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    if-eqz v10, :cond_c

    .line 821
    :try_start_d
    invoke-virtual {v10}, Lnet/toddm/cache/CacheEntry;->getEtag()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_c

    invoke-virtual {v10}, Lnet/toddm/cache/CacheEntry;->getEtag()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v11

    if-lez v11, :cond_c

    const-string v11, "If-None-Match"

    .line 822
    invoke-virtual {v10}, Lnet/toddm/cache/CacheEntry;->getEtag()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v11, v10}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_d
    .catch Ljava/net/MalformedURLException; {:try_start_d .. :try_end_d} :catch_6
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_5
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_4
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 826
    :cond_c
    :try_start_e
    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v10}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v10
    :try_end_e
    .catch Ljava/net/MalformedURLException; {:try_start_e .. :try_end_e} :catch_1f
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_1e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1d
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    if-eqz v10, :cond_f

    .line 827
    :try_start_f
    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v10}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v10

    const-string v11, "%1$s Making an HTTP %2$s request to %3$s"

    const/4 v12, 0x3

    new-array v12, v12, [Ljava/lang/Object;

    iget-object v13, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v13, v12, v7

    iget-object v13, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v13}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v13

    invoke-virtual {v13}, Lnet/toddm/comm/Request;->getMethod()Lnet/toddm/comm/Request$RequestMethod;

    move-result-object v13

    invoke-virtual {v13}, Lnet/toddm/comm/Request$RequestMethod;->name()Ljava/lang/String;

    move-result-object v13

    aput-object v13, v12, v6

    invoke-virtual {v8}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v12, v5

    invoke-interface {v10, v11, v12}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getRequestProperties()Ljava/util/Map;

    move-result-object v8

    if-eqz v8, :cond_f

    .line 830
    invoke-interface {v8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-nez v11, :cond_d

    goto :goto_6

    :cond_d
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 831
    new-instance v12, Ljava/lang/StringBuilder;

    sget-object v13, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v14, "%1$s    Request header \'%2$s\':"

    new-array v15, v5, [Ljava/lang/Object;

    iget-object v4, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v4, v15, v7

    aput-object v11, v15, v6

    invoke-static {v13, v14, v15}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v12, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 832
    invoke-interface {v8, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-nez v11, :cond_e

    .line 835
    iget-object v4, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v4}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v4

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    new-array v12, v7, [Ljava/lang/Object;

    invoke-interface {v4, v11, v12}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v4, 0x0

    goto :goto_4

    .line 832
    :cond_e
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 833
    sget-object v13, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v14, " \'%1$s\'"

    new-array v15, v6, [Ljava/lang/Object;

    aput-object v11, v15, v7

    invoke-static {v13, v14, v15}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_f
    .catch Ljava/net/MalformedURLException; {:try_start_f .. :try_end_f} :catch_9
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_8
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_7
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object v6, v0

    const/4 v10, 0x0

    goto/16 :goto_15

    :catch_7
    move-exception v0

    move-object v6, v0

    const/4 v10, 0x0

    goto/16 :goto_11

    :catch_8
    move-exception v0

    move-object v6, v0

    const/4 v10, 0x0

    goto/16 :goto_12

    :catch_9
    move-exception v0

    move-object v6, v0

    const/4 v10, 0x0

    goto/16 :goto_13

    .line 841
    :cond_f
    :goto_6
    :try_start_10
    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->POST:Lnet/toddm/comm/Request$RequestMethod;

    iget-object v8, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v8}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v8

    invoke-virtual {v8}, Lnet/toddm/comm/Request;->getMethod()Lnet/toddm/comm/Request$RequestMethod;

    move-result-object v8

    invoke-virtual {v4, v8}, Lnet/toddm/comm/Request$RequestMethod;->equals(Ljava/lang/Object;)Z

    move-result v4
    :try_end_10
    .catch Ljava/net/MalformedURLException; {:try_start_10 .. :try_end_10} :catch_1c
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_1b
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1a
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    if-eqz v4, :cond_12

    .line 842
    :try_start_11
    iget-object v4, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v4}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v4

    invoke-virtual {v4}, Lnet/toddm/comm/Request;->getPostData()[B

    move-result-object v4

    if-eqz v4, :cond_12

    .line 843
    iget-object v4, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v4}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v4

    invoke-virtual {v4}, Lnet/toddm/comm/Request;->getPostData()[B

    move-result-object v4

    array-length v4, v4

    if-lez v4, :cond_12

    .line 847
    invoke-virtual {v9, v6}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
    :try_end_11
    .catch Ljava/net/MalformedURLException; {:try_start_11 .. :try_end_11} :catch_9
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_8
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_7
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    .line 850
    :try_start_12
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v4
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    .line 851
    :try_start_13
    iget-object v8, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v8}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v8

    invoke-virtual {v8}, Lnet/toddm/comm/Request;->getPostData()[B

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/io/OutputStream;->write([B)V

    .line 852
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    .line 853
    iget-object v8, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v8}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v8

    if-eqz v8, :cond_10

    iget-object v8, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v8}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v8

    const-string v10, "%1$s Sending %2$d bytes of POST body data"

    new-array v11, v5, [Ljava/lang/Object;

    iget-object v12, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v12, v11, v7

    iget-object v12, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v12}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v12

    invoke-virtual {v12}, Lnet/toddm/comm/Request;->getPostData()[B

    move-result-object v12

    array-length v12, v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v11, v6

    invoke-interface {v8, v10, v11}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    :cond_10
    if-eqz v4, :cond_12

    .line 855
    :try_start_14
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_b
    .catch Ljava/net/MalformedURLException; {:try_start_14 .. :try_end_14} :catch_9
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_8
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    goto :goto_8

    :catchall_3
    move-exception v0

    move-object v8, v4

    move-object v4, v0

    goto :goto_7

    :catchall_4
    move-exception v0

    move-object v4, v0

    const/4 v8, 0x0

    :goto_7
    if-eqz v8, :cond_11

    :try_start_15
    invoke-virtual {v8}, Ljava/io/OutputStream;->close()V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_a
    .catch Ljava/net/MalformedURLException; {:try_start_15 .. :try_end_15} :catch_9
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_8
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    .line 856
    :catch_a
    :cond_11
    :try_start_16
    throw v4
    :try_end_16
    .catch Ljava/net/MalformedURLException; {:try_start_16 .. :try_end_16} :catch_9
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_8
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_7
    .catchall {:try_start_16 .. :try_end_16} :catchall_2

    .line 860
    :catch_b
    :cond_12
    :goto_8
    :try_start_17
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_17
    .catch Ljava/net/MalformedURLException; {:try_start_17 .. :try_end_17} :catch_1c
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_1b
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_1a
    .catchall {:try_start_17 .. :try_end_17} :catchall_6

    .line 865
    :try_start_18
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->connect()V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_18
    .catch Ljava/net/MalformedURLException; {:try_start_18 .. :try_end_18} :catch_9
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_8
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    .line 882
    :try_start_19
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v8

    if-lez v8, :cond_19

    const/16 v8, 0x200

    .line 884
    new-array v8, v8, [B
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_12
    .catch Ljava/net/MalformedURLException; {:try_start_19 .. :try_end_19} :catch_9
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_8
    .catchall {:try_start_19 .. :try_end_19} :catchall_2

    .line 888
    :try_start_1a
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v10
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_c
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_12
    .catch Ljava/net/MalformedURLException; {:try_start_1a .. :try_end_1a} :catch_9
    .catchall {:try_start_1a .. :try_end_1a} :catchall_2

    goto :goto_9

    .line 890
    :catch_c
    :try_start_1b
    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v10}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v10

    if-eqz v10, :cond_13

    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v10}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v10

    const-string v11, "%1$s getInputStream() failed, trying getErrorStream()"

    new-array v12, v6, [Ljava/lang/Object;

    iget-object v13, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v13, v12, v7

    invoke-interface {v10, v11, v12}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 891
    :cond_13
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v10
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_12
    .catch Ljava/net/MalformedURLException; {:try_start_1b .. :try_end_1b} :catch_9
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1b} :catch_8
    .catchall {:try_start_1b .. :try_end_1b} :catchall_2

    .line 895
    :goto_9
    :try_start_1c
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v11

    invoke-static {v11}, Lnet/toddm/comm/Response;->getContentEncoding(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v11
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_d
    .catch Ljava/net/MalformedURLException; {:try_start_1c .. :try_end_1c} :catch_17
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_16
    .catchall {:try_start_1c .. :try_end_1c} :catchall_9

    goto :goto_a

    :catch_d
    move-exception v0

    move-object v11, v0

    .line 897
    :try_start_1d
    iget-object v12, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v12}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v12

    if-eqz v12, :cond_14

    iget-object v12, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v12}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v12

    const-string v13, "%1$s Failed to parse value from \'Content-Encoding\' header"

    new-array v14, v6, [Ljava/lang/Object;

    iget-object v15, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v15, v14, v7

    invoke-interface {v12, v11, v13, v14}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_14
    const/4 v11, 0x0

    :goto_a
    if-eqz v11, :cond_16

    .line 899
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v12

    if-lez v12, :cond_16

    const-string v12, "gzip"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_16

    .line 900
    new-instance v11, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v11, v10}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_11
    .catch Ljava/net/MalformedURLException; {:try_start_1d .. :try_end_1d} :catch_17
    .catch Ljava/io/IOException; {:try_start_1d .. :try_end_1d} :catch_16
    .catchall {:try_start_1d .. :try_end_1d} :catchall_9

    .line 901
    :try_start_1e
    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v10}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v10

    if-eqz v10, :cond_15

    iget-object v10, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v10}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v10

    const-string v12, "%1$s Received gzipped data"

    new-array v13, v6, [Ljava/lang/Object;

    iget-object v14, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v14, v13, v7

    invoke-interface {v10, v12, v13}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_10
    .catch Ljava/net/MalformedURLException; {:try_start_1e .. :try_end_1e} :catch_f
    .catch Ljava/io/IOException; {:try_start_1e .. :try_end_1e} :catch_e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_5

    :cond_15
    move-object v10, v11

    goto :goto_b

    :catchall_5
    move-exception v0

    move-object v6, v0

    move-object v10, v11

    goto/16 :goto_15

    :catch_e
    move-exception v0

    move-object v6, v0

    move-object v10, v11

    goto/16 :goto_12

    :catch_f
    move-exception v0

    move-object v6, v0

    move-object v10, v11

    goto/16 :goto_13

    :catch_10
    move-exception v0

    move-object v8, v0

    move-object v10, v11

    goto :goto_c

    .line 904
    :cond_16
    :try_start_1f
    iget-object v11, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v11}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v11

    if-eqz v11, :cond_17

    iget-object v11, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v11}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v11

    const-string v12, "%1$s Received non-gzipped data"

    new-array v13, v6, [Ljava/lang/Object;

    iget-object v14, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v14, v13, v7

    invoke-interface {v11, v12, v13}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 907
    :cond_17
    :goto_b
    array-length v11, v8

    invoke-virtual {v10, v8, v7, v11}, Ljava/io/InputStream;->read([BII)I

    move-result v11

    const/4 v12, -0x1

    if-ne v11, v12, :cond_18

    .line 910
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->flush()V

    goto :goto_d

    .line 908
    :cond_18
    invoke-virtual {v4, v8, v7, v11}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_11
    .catch Ljava/net/MalformedURLException; {:try_start_1f .. :try_end_1f} :catch_17
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_1f} :catch_16
    .catchall {:try_start_1f .. :try_end_1f} :catchall_9

    goto :goto_b

    :catch_11
    move-exception v0

    move-object v8, v0

    goto :goto_c

    :cond_19
    const/4 v10, 0x0

    goto :goto_d

    :catch_12
    move-exception v0

    move-object v8, v0

    const/4 v10, 0x0

    .line 917
    :goto_c
    :try_start_20
    iget-object v11, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v11}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v11

    if-eqz v11, :cond_1a

    iget-object v11, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v11}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v11

    iget-object v12, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    new-array v13, v7, [Ljava/lang/Object;

    invoke-interface {v11, v8, v12, v13}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 921
    :cond_1a
    :goto_d
    new-instance v8, Lnet/toddm/comm/Response;

    .line 922
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v12

    .line 923
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v13

    .line 924
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v14

    .line 925
    iget-object v4, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v4}, Lnet/toddm/comm/CommWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v4

    invoke-virtual {v4}, Lnet/toddm/comm/Request;->getId()I

    move-result v15

    .line 926
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    sub-long v6, v16, v2

    long-to-int v6, v6

    .line 927
    iget-object v7, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v7}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v17

    move-object v11, v8

    move/from16 v16, v6

    .line 921
    invoke-direct/range {v11 .. v17}, Lnet/toddm/comm/Response;-><init>([BLjava/util/Map;IIILnet/toddm/cache/LoggingProvider;)V

    .line 928
    iget-object v6, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v6, v8}, Lnet/toddm/comm/CommWork;->setResponse(Lnet/toddm/comm/Response;)V

    .line 929
    iget-object v6, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v6}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v6

    if-eqz v6, :cond_1b

    iget-object v6, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v6}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v6

    const-string v7, "%1$s Request finished with a %2$d response code"

    new-array v11, v5, [Ljava/lang/Object;

    iget-object v12, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    const/4 v13, 0x0

    aput-object v12, v11, v13

    iget-object v12, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v12}, Lnet/toddm/comm/CommWork;->getResponse()Lnet/toddm/comm/Response;

    move-result-object v12

    invoke-virtual {v12}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v12

    const/4 v4, 0x1

    aput-object v12, v11, v4

    invoke-interface {v6, v7, v11}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 932
    :cond_1b
    invoke-direct {v1, v8, v9}, Lnet/toddm/comm/CommManager$WorkCallable;->handleWorkUpdatesOnResponse(Lnet/toddm/comm/Response;Ljava/net/HttpURLConnection;)V
    :try_end_20
    .catch Ljava/net/MalformedURLException; {:try_start_20 .. :try_end_20} :catch_17
    .catch Ljava/io/IOException; {:try_start_20 .. :try_end_20} :catch_16
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_15
    .catchall {:try_start_20 .. :try_end_20} :catchall_9

    if-eqz v10, :cond_1c

    .line 946
    :try_start_21
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_13

    :catch_13
    :cond_1c
    if-eqz v9, :cond_1d

    .line 947
    :try_start_22
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_14

    .line 948
    :catch_14
    :cond_1d
    iget-object v6, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v6}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v6

    if-eqz v6, :cond_1e

    iget-object v6, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v6}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v6

    const-string v7, "%1$s Processing took %2$d milliseconds"

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v9, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    const/4 v10, 0x0

    aput-object v9, v5, v10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    sub-long/2addr v9, v2

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v5, v3

    invoke-interface {v6, v7, v5}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1e
    return-object v8

    :catch_15
    move-exception v0

    goto :goto_e

    :catch_16
    move-exception v0

    goto :goto_f

    :catch_17
    move-exception v0

    goto/16 :goto_10

    :catch_18
    move-exception v0

    move-object v6, v0

    .line 870
    :try_start_23
    iget-object v7, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v7}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v7
    :try_end_23
    .catch Ljava/net/MalformedURLException; {:try_start_23 .. :try_end_23} :catch_1c
    .catch Ljava/io/IOException; {:try_start_23 .. :try_end_23} :catch_1b
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_1a
    .catchall {:try_start_23 .. :try_end_23} :catchall_6

    if-eqz v7, :cond_1f

    :try_start_24
    iget-object v7, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v7}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v7

    iget-object v8, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    const/4 v10, 0x0

    new-array v11, v10, [Ljava/lang/Object;

    invoke-interface {v7, v6, v8, v11}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_24
    .catch Ljava/net/MalformedURLException; {:try_start_24 .. :try_end_24} :catch_9
    .catch Ljava/io/IOException; {:try_start_24 .. :try_end_24} :catch_8
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_7
    .catchall {:try_start_24 .. :try_end_24} :catchall_2

    .line 873
    :cond_1f
    :try_start_25
    invoke-direct {v1, v6}, Lnet/toddm/comm/CommManager$WorkCallable;->handleWorkUpdatesOnException(Ljava/lang/Exception;)V
    :try_end_25
    .catch Ljava/net/MalformedURLException; {:try_start_25 .. :try_end_25} :catch_1c
    .catch Ljava/io/IOException; {:try_start_25 .. :try_end_25} :catch_1b
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_1a
    .catchall {:try_start_25 .. :try_end_25} :catchall_6

    if-eqz v9, :cond_20

    .line 947
    :try_start_26
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_19

    .line 948
    :catch_19
    :cond_20
    iget-object v6, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v6}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v6

    if-eqz v6, :cond_21

    iget-object v6, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v6}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v6

    const-string v7, "%1$s Processing took %2$d milliseconds"

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v8, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    const/4 v9, 0x0

    aput-object v8, v5, v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long/2addr v8, v2

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v5, v3

    invoke-interface {v6, v7, v5}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_21
    const/4 v10, 0x0

    return-object v10

    :catchall_6
    move-exception v0

    const/4 v10, 0x0

    goto :goto_14

    :catch_1a
    move-exception v0

    const/4 v10, 0x0

    goto :goto_e

    :catch_1b
    move-exception v0

    const/4 v10, 0x0

    goto :goto_f

    :catch_1c
    move-exception v0

    const/4 v10, 0x0

    goto :goto_10

    :catchall_7
    move-exception v0

    move-object v10, v4

    goto :goto_14

    :catch_1d
    move-exception v0

    move-object v10, v4

    :goto_e
    move-object v6, v0

    goto :goto_11

    :catch_1e
    move-exception v0

    move-object v10, v4

    :goto_f
    move-object v6, v0

    goto :goto_12

    :catch_1f
    move-exception v0

    move-object v10, v4

    :goto_10
    move-object v6, v0

    goto :goto_13

    :catchall_8
    move-exception v0

    move-object v10, v4

    move-object v6, v0

    move-object v9, v10

    goto :goto_15

    :catch_20
    move-exception v0

    move-object v10, v4

    move-object v6, v0

    move-object v9, v10

    .line 941
    :goto_11
    :try_start_27
    iget-object v7, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v7, v6}, Lnet/toddm/comm/CommWork;->setException(Ljava/lang/Exception;)V

    .line 942
    throw v6

    :catch_21
    move-exception v0

    move-object v10, v4

    move-object v6, v0

    move-object v9, v10

    .line 938
    :goto_12
    iget-object v7, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v7, v6}, Lnet/toddm/comm/CommWork;->setException(Ljava/lang/Exception;)V

    .line 939
    new-instance v7, Lnet/toddm/comm/CommException;

    invoke-direct {v7, v6}, Lnet/toddm/comm/CommException;-><init>(Ljava/lang/Throwable;)V

    throw v7

    :catch_22
    move-exception v0

    move-object v10, v4

    move-object v6, v0

    move-object v9, v10

    .line 935
    :goto_13
    iget-object v7, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v7, v6}, Lnet/toddm/comm/CommWork;->setException(Ljava/lang/Exception;)V

    .line 936
    new-instance v7, Lnet/toddm/comm/CommException;

    invoke-direct {v7, v6}, Lnet/toddm/comm/CommException;-><init>(Ljava/lang/Throwable;)V

    throw v7
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_9

    :catchall_9
    move-exception v0

    :goto_14
    move-object v6, v0

    :goto_15
    if-eqz v10, :cond_22

    .line 946
    :try_start_28
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_28} :catch_23

    :catch_23
    :cond_22
    if-eqz v9, :cond_23

    .line 947
    :try_start_29
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_29} :catch_24

    .line 948
    :catch_24
    :cond_23
    iget-object v7, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v7}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v7

    if-eqz v7, :cond_24

    iget-object v7, v1, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v7}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v7

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v8, v1, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    const/4 v9, 0x0

    aput-object v8, v5, v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long/2addr v8, v2

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v5, v3

    const-string v2, "%1$s Processing took %2$d milliseconds"

    invoke-interface {v7, v2, v5}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 949
    :cond_24
    throw v6
.end method

.method private reEnqueueWorkForDependentWork()V
    .locals 6

    .line 956
    iget-object v0, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$2(Lnet/toddm/comm/CommManager;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 957
    :try_start_0
    iget-object v1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v1}, Lnet/toddm/comm/CommWork;->isDone()Z

    move-result v1

    if-nez v1, :cond_0

    .line 958
    iget-object v1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    const-wide/16 v2, 0x14d

    invoke-virtual {v1, v2, v3}, Lnet/toddm/comm/CommWork;->updateRetryAfterTimestamp(J)V

    .line 959
    iget-object v1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    sget-object v2, Lnet/toddm/comm/Work$Status;->RETRYING:Lnet/toddm/comm/Work$Status;

    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommWork;->setState(Lnet/toddm/comm/Work$Status;)V

    .line 962
    iget-object v1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    new-instance v2, Ljava/util/concurrent/FutureTask;

    new-instance v3, Lnet/toddm/comm/CommManager$WorkCallable;

    iget-object v4, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    iget-object v5, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-direct {v3, v4, v5}, Lnet/toddm/comm/CommManager$WorkCallable;-><init>(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/CommWork;)V

    invoke-direct {v2, v3}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommWork;->addFutureTask(Ljava/util/concurrent/FutureTask;)V

    .line 963
    iget-object v1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    iget-object v2, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    sget-object v3, Lnet/toddm/comm/CommManager$ManagedQueue;->RETRY:Lnet/toddm/comm/CommManager$ManagedQueue;

    invoke-static {v1, v2, v3}, Lnet/toddm/comm/CommManager;->access$7(Lnet/toddm/comm/CommManager;Lnet/toddm/comm/CommWork;Lnet/toddm/comm/CommManager$ManagedQueue;)V

    .line 964
    iget-object v1, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v1}, Lnet/toddm/comm/CommManager;->access$2(Lnet/toddm/comm/CommManager;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 956
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/toddm/comm/CommManager$WorkCallable;->call()Lnet/toddm/comm/Response;

    move-result-object v0

    return-object v0
.end method

.method public call()Lnet/toddm/comm/Response;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 697
    :try_start_0
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "[thread:%1$d][request:%2$d]"

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v5, v0

    iget-object v6, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_work:Lnet/toddm/comm/CommWork;

    invoke-virtual {v6}, Lnet/toddm/comm/CommWork;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x1

    aput-object v6, v5, v7

    invoke-static {v2, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    .line 700
    invoke-direct {p0}, Lnet/toddm/comm/CommManager$WorkCallable;->processesRequest()Lnet/toddm/comm/Response;

    move-result-object v1

    if-nez v1, :cond_0

    .line 704
    iget-object v2, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v2}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v2}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v2

    const-string v3, "%1$s Received a NULL result"

    new-array v4, v7, [Ljava/lang/Object;

    iget-object v5, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v5, v4, v0

    invoke-interface {v2, v3, v4}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_2

    .line 706
    :cond_0
    iget-object v2, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v2}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 707
    iget-object v2, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v2}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v2

    const-string v3, "%1$s Response code: %2$d"

    new-array v5, v4, [Ljava/lang/Object;

    iget-object v6, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v6, v5, v0

    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-interface {v2, v3, v5}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 708
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseBody()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseBody()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    .line 709
    iget-object v2, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v2}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v2

    const-string v3, "%1$s Response body: %2$s"

    new-array v5, v4, [Ljava/lang/Object;

    iget-object v6, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v6, v5, v0

    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseBody()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-interface {v2, v3, v5}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 711
    :cond_1
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getHeaders()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getHeaders()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    if-lez v2, :cond_4

    .line 712
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getHeaders()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 713
    new-instance v5, Ljava/lang/StringBuilder;

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v8, "%1$s    Response header \'%2$s\':"

    new-array v9, v4, [Ljava/lang/Object;

    iget-object v10, p0, Lnet/toddm/comm/CommManager$WorkCallable;->_logPrefix:Ljava/lang/String;

    aput-object v10, v9, v0

    aput-object v3, v9, v7

    invoke-static {v6, v8, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 714
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getHeaders()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_3

    .line 717
    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v3

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v6, v0, [Ljava/lang/Object;

    invoke-interface {v3, v5, v6}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 714
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 715
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v9, " \'%1$s\'"

    new-array v10, v7, [Ljava/lang/Object;

    aput-object v6, v10, v0

    invoke-static {v8, v9, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 724
    :cond_4
    :goto_2
    invoke-direct {p0}, Lnet/toddm/comm/CommManager$WorkCallable;->cleanup()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v2

    .line 730
    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v3

    const-string v4, "WorkCallable.call() failed"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {v3, v2, v4, v0}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    :catch_1
    move-exception v2

    .line 728
    iget-object v3, p0, Lnet/toddm/comm/CommManager$WorkCallable;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v3}, Lnet/toddm/comm/CommManager;->access$3(Lnet/toddm/comm/CommManager;)Lnet/toddm/cache/LoggingProvider;

    move-result-object v3

    const-string v4, "WorkCallable.call() failed"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {v3, v2, v4, v0}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_3
    return-object v1
.end method
