.class final Lo/eek;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;
.implements Lo/eef;


# static fields
.field private static final f:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private final a:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<Lo/een;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/Object;

.field private c:Ljava/lang/Object;

.field private d:Lo/eef;

.field private e:Landroid/content/Context;

.field private g:Ljava/util/Timer;

.field private h:Ljava/util/TimerTask;

.field private i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 98
    new-instance v0, Lo/eek$2;

    invoke-direct {v0}, Lo/eek$2;-><init>()V

    const/4 v1, 0x4

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/eek;->f:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lo/eek;->a:Ljava/util/Queue;

    .line 78
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/eek;->b:Ljava/lang/Object;

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eek;->d:Lo/eef;

    .line 88
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/eek;->c:Ljava/lang/Object;

    .line 113
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lo/eek;->g:Ljava/util/Timer;

    .line 118
    new-instance v0, Lo/eek$4;

    invoke-direct {v0, p0}, Lo/eek$4;-><init>(Lo/eek;)V

    iput-object v0, p0, Lo/eek;->h:Ljava/util/TimerTask;

    .line 154
    iput-object p1, p0, Lo/eek;->e:Landroid/content/Context;

    .line 155
    iput-object p2, p0, Lo/eek;->i:Ljava/lang/String;

    .line 157
    iget-object v0, p0, Lo/eek;->g:Ljava/util/Timer;

    iget-object v1, p0, Lo/eek;->h:Ljava/util/TimerTask;

    const-wide/16 v2, 0x3e8

    const-wide/16 v4, 0x3e8

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 158
    return-void
.end method

.method private a(Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;
    .locals 4

    .line 391
    const/4 v2, 0x0

    .line 392
    iget-object v0, p0, Lo/eek;->d:Lo/eef;

    if-eqz v0, :cond_0

    .line 396
    const-string v0, "SNS_SDK"

    const-string v1, "AIDL interface begin to sync GroupMemList"

    :try_start_0
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 397
    iget-object v0, p0, Lo/eek;->d:Lo/eef;

    invoke-interface {v0, p1, p2}, Lo/eef;->e(Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 407
    goto :goto_0

    .line 399
    :catch_0
    move-exception v3

    .line 401
    invoke-virtual {v3}, Landroid/os/RemoteException;->printStackTrace()V

    .line 403
    new-instance v2, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;

    invoke-direct {v2}, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;-><init>()V

    .line 404
    iget-object v0, p1, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->transaction:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->transaction:Ljava/lang/String;

    .line 405
    const/4 v0, 0x2

    iput v0, v2, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->errorCode:I

    .line 406
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/ees;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " AIDL RemoteException!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->errorReason:Ljava/lang/String;

    .line 407
    goto :goto_0

    .line 411
    :cond_0
    const-string v3, "AIDL null! failed to to sync GroupMemList"

    .line 412
    const-string v0, "SNS_SDK"

    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 414
    new-instance v2, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;

    invoke-direct {v2}, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;-><init>()V

    .line 415
    iget-object v0, p1, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;->transaction:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->transaction:Ljava/lang/String;

    .line 416
    const/4 v0, 0x2

    iput v0, v2, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->errorCode:I

    .line 417
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/ees;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->errorReason:Ljava/lang/String;

    .line 419
    :goto_0
    return-object v2
.end method

.method private a()V
    .locals 6

    .line 454
    iget-object v2, p0, Lo/eek;->b:Ljava/lang/Object;

    monitor-enter v2

    .line 457
    :goto_0
    :try_start_0
    iget-object v0, p0, Lo/eek;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/een;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    .line 461
    :try_start_1
    sget-object v0, Lo/eek;->f:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 466
    goto :goto_0

    .line 463
    :catch_0
    move-exception v4

    .line 465
    const-string v0, "SNS_SDK"

    const-string v1, "Execute submit task failed !"

    :try_start_2
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 466
    goto :goto_0

    .line 468
    :cond_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 469
    :goto_1
    return-void
.end method

.method private c(Lcom/huawei/sns/sdk/modelmsg/GroupReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/GroupListResp;
    .locals 4

    .line 328
    const/4 v2, 0x0

    .line 329
    iget-object v0, p0, Lo/eek;->d:Lo/eef;

    if-eqz v0, :cond_0

    .line 333
    const-string v0, "SNS_SDK"

    const-string v1, "AIDL interface begin to sync GroupList"

    :try_start_0
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 334
    iget-object v0, p0, Lo/eek;->d:Lo/eef;

    invoke-interface {v0, p1, p2}, Lo/eef;->a(Lcom/huawei/sns/sdk/modelmsg/GroupReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/GroupListResp;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 343
    goto :goto_0

    .line 336
    :catch_0
    move-exception v3

    .line 338
    invoke-virtual {v3}, Landroid/os/RemoteException;->printStackTrace()V

    .line 339
    new-instance v2, Lcom/huawei/sns/sdk/modelmsg/GroupListResp;

    invoke-direct {v2}, Lcom/huawei/sns/sdk/modelmsg/GroupListResp;-><init>()V

    .line 340
    iget-object v0, p1, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->transaction:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/sns/sdk/modelmsg/GroupListResp;->transaction:Ljava/lang/String;

    .line 341
    const/4 v0, 0x2

    iput v0, v2, Lcom/huawei/sns/sdk/modelmsg/GroupListResp;->errorCode:I

    .line 342
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/ees;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " AIDL RemoteException!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/sns/sdk/modelmsg/GroupListResp;->errorReason:Ljava/lang/String;

    .line 343
    goto :goto_0

    .line 347
    :cond_0
    const-string v3, "AIDL null! failed to to sync GroupList"

    .line 348
    const-string v0, "SNS_SDK"

    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 349
    new-instance v2, Lcom/huawei/sns/sdk/modelmsg/GroupListResp;

    invoke-direct {v2}, Lcom/huawei/sns/sdk/modelmsg/GroupListResp;-><init>()V

    .line 350
    iget-object v0, p1, Lcom/huawei/sns/sdk/modelmsg/GroupReq;->transaction:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/sns/sdk/modelmsg/GroupListResp;->transaction:Ljava/lang/String;

    .line 351
    const/4 v0, 0x2

    iput v0, v2, Lcom/huawei/sns/sdk/modelmsg/GroupListResp;->errorCode:I

    .line 352
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/ees;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/sns/sdk/modelmsg/GroupListResp;->errorReason:Ljava/lang/String;

    .line 354
    :goto_0
    return-object v2
.end method

.method static synthetic c(Lo/eek;)Ljava/lang/Object;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/eek;->b:Ljava/lang/Object;

    return-object v0
.end method

.method private e(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/FriendListResp;
    .locals 4

    .line 291
    const/4 v2, 0x0

    .line 292
    iget-object v0, p0, Lo/eek;->d:Lo/eef;

    if-eqz v0, :cond_0

    .line 296
    const-string v0, "SNS_SDK"

    const-string v1, "AIDL interface begin to sync FriendList"

    :try_start_0
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 297
    iget-object v0, p0, Lo/eek;->d:Lo/eef;

    invoke-interface {v0, p1, p2}, Lo/eef;->c(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/FriendListResp;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 305
    goto :goto_0

    .line 299
    :catch_0
    move-exception v3

    .line 301
    invoke-virtual {v3}, Landroid/os/RemoteException;->printStackTrace()V

    .line 302
    new-instance v2, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;

    invoke-direct {v2}, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;-><init>()V

    .line 303
    const/4 v0, 0x2

    iput v0, v2, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;->errorCode:I

    .line 304
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/ees;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " AIDL RemoteException!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;->errorReason:Ljava/lang/String;

    .line 305
    goto :goto_0

    .line 309
    :cond_0
    const-string v0, "SNS_SDK"

    const-string v1, "AIDL null! failed to to sync FriendList"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 310
    new-instance v2, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;

    invoke-direct {v2}, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;-><init>()V

    .line 311
    iget-object v0, p1, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->transaction:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;->transaction:Ljava/lang/String;

    .line 312
    const/4 v0, 0x2

    iput v0, v2, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;->errorCode:I

    .line 313
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/ees;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "AIDL bind failed!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;->errorReason:Ljava/lang/String;

    .line 315
    :goto_0
    return-object v2
.end method

.method static synthetic e(Lo/eek;)Ljava/util/Queue;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/eek;->a:Ljava/util/Queue;

    return-object v0
.end method

.method private e()V
    .locals 5

    .line 476
    invoke-virtual {p0}, Lo/eek;->d()V

    .line 479
    :try_start_0
    iget-object v3, p0, Lo/eek;->c:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 481
    :try_start_1
    iget-object v0, p0, Lo/eek;->c:Ljava/lang/Object;

    const-wide/16 v1, 0x1388

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 482
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    :try_start_2
    throw v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 487
    :goto_0
    goto :goto_1

    .line 484
    :catch_0
    move-exception v3

    .line 486
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 488
    :goto_1
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;Lo/eed;Ljava/lang/String;)I
    .locals 2

    .line 513
    new-instance v1, Lo/een;

    invoke-direct {v1, p0, p2, p1, p3}, Lo/een;-><init>(Lo/eek;Ljava/lang/Object;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 514
    invoke-virtual {p0, v1}, Lo/eek;->d(Lo/een;)I

    move-result v0

    return v0
.end method

.method public a(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Lo/eee;Ljava/lang/String;)I
    .locals 7

    .line 520
    new-instance v0, Lo/een;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    sget-object v4, Lo/edx$b;->h:Lo/edx$b;

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/een;-><init>(Lo/eek;Ljava/lang/Object;Lo/edw;Lo/edx$b;Ljava/lang/String;)V

    move-object v6, v0

    .line 521
    invoke-virtual {p0, v6}, Lo/eek;->d(Lo/een;)I

    move-result v0

    return v0
.end method

.method public a(Lcom/huawei/sns/sdk/modelmsg/UserReq;Lo/edy;Ljava/lang/String;)I
    .locals 7

    .line 534
    new-instance v0, Lo/een;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    sget-object v4, Lo/edx$b;->k:Lo/edx$b;

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/een;-><init>(Lo/eek;Ljava/lang/Object;Lo/edw;Lo/edx$b;Ljava/lang/String;)V

    move-object v6, v0

    .line 535
    invoke-virtual {p0, v6}, Lo/eek;->d(Lo/een;)I

    move-result v0

    return v0
.end method

.method public a(Lcom/huawei/sns/sdk/modelmsg/GroupReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/GroupListResp;
    .locals 3

    .line 587
    const/4 v2, 0x0

    .line 588
    iget-object v0, p0, Lo/eek;->d:Lo/eef;

    if-eqz v0, :cond_0

    .line 590
    invoke-direct {p0, p1, p2}, Lo/eek;->c(Lcom/huawei/sns/sdk/modelmsg/GroupReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/GroupListResp;

    move-result-object v2

    goto :goto_0

    .line 594
    :cond_0
    const-string v0, "SNS_SDK"

    const-string v1, "execute syncQueryGroupList! AIDL is not connected! will block!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 596
    invoke-direct {p0}, Lo/eek;->e()V

    .line 597
    invoke-direct {p0, p1, p2}, Lo/eek;->c(Lcom/huawei/sns/sdk/modelmsg/GroupReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/GroupListResp;

    move-result-object v2

    .line 599
    :goto_0
    return-object v2
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 493
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Lo/eei;Ljava/lang/String;)I
    .locals 7

    .line 506
    new-instance v0, Lo/een;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    sget-object v4, Lo/edx$b;->i:Lo/edx$b;

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/een;-><init>(Lo/eek;Ljava/lang/Object;Lo/edw;Lo/edx$b;Ljava/lang/String;)V

    move-object v6, v0

    .line 507
    invoke-virtual {p0, v6}, Lo/eek;->d(Lo/een;)I

    move-result v0

    return v0
.end method

.method public b(Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;Lo/eec;Ljava/lang/String;)I
    .locals 7

    .line 555
    new-instance v0, Lo/een;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    sget-object v4, Lo/edx$b;->p:Lo/edx$b;

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/een;-><init>(Lo/eek;Ljava/lang/Object;Lo/edw;Lo/edx$b;Ljava/lang/String;)V

    move-object v6, v0

    .line 556
    invoke-virtual {p0, v6}, Lo/eek;->d(Lo/een;)I

    move-result v0

    return v0
.end method

.method public b(Lcom/huawei/sns/sdk/modelmsg/UserReq;Lo/edy;Ljava/lang/String;)I
    .locals 7

    .line 527
    new-instance v0, Lo/een;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    sget-object v4, Lo/edx$b;->g:Lo/edx$b;

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/een;-><init>(Lo/eek;Ljava/lang/Object;Lo/edw;Lo/edx$b;Ljava/lang/String;)V

    move-object v6, v0

    .line 528
    invoke-virtual {p0, v6}, Lo/eek;->d(Lo/een;)I

    move-result v0

    return v0
.end method

.method public b(Lcom/huawei/sns/sdk/modelmsg/UserReq;Lo/eeg;Ljava/lang/String;)I
    .locals 7

    .line 499
    new-instance v0, Lo/een;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    sget-object v4, Lo/edx$b;->f:Lo/edx$b;

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/een;-><init>(Lo/eek;Ljava/lang/Object;Lo/edw;Lo/edx$b;Ljava/lang/String;)V

    move-object v6, v0

    .line 500
    invoke-virtual {p0, v6}, Lo/eek;->d(Lo/een;)I

    move-result v0

    return v0
.end method

.method b()Lo/eef;
    .locals 1

    .line 650
    iget-object v0, p0, Lo/eek;->d:Lo/eef;

    return-object v0
.end method

.method public c(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/FriendListResp;
    .locals 3

    .line 569
    const/4 v2, 0x0

    .line 570
    iget-object v0, p0, Lo/eek;->d:Lo/eef;

    if-eqz v0, :cond_0

    .line 572
    invoke-direct {p0, p1, p2}, Lo/eek;->e(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/FriendListResp;

    move-result-object v2

    goto :goto_0

    .line 576
    :cond_0
    const-string v0, "SNS_SDK"

    const-string v1, "execute syncQueryFriendList! AIDL is not connected! will block!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 578
    invoke-direct {p0}, Lo/eek;->e()V

    .line 579
    invoke-direct {p0, p1, p2}, Lo/eek;->e(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/FriendListResp;

    move-result-object v2

    .line 581
    :goto_0
    return-object v2
.end method

.method public d(Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;Lo/eea;Ljava/lang/String;)I
    .locals 7

    .line 562
    new-instance v0, Lo/een;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    sget-object v4, Lo/edx$b;->n:Lo/edx$b;

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/een;-><init>(Lo/eek;Ljava/lang/Object;Lo/edw;Lo/edx$b;Ljava/lang/String;)V

    move-object v6, v0

    .line 563
    invoke-virtual {p0, v6}, Lo/eek;->d(Lo/een;)I

    move-result v0

    return v0
.end method

.method public d(Lcom/huawei/sns/sdk/modelmsg/GroupReq;Lo/eeb;Ljava/lang/String;)I
    .locals 7

    .line 548
    new-instance v0, Lo/een;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    sget-object v4, Lo/edx$b;->l:Lo/edx$b;

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/een;-><init>(Lo/eek;Ljava/lang/Object;Lo/edw;Lo/edx$b;Ljava/lang/String;)V

    move-object v6, v0

    .line 549
    invoke-virtual {p0, v6}, Lo/eek;->d(Lo/een;)I

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;)I
    .locals 3

    .line 623
    invoke-static {p1}, Lo/ees;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/eek;->d:Lo/eef;

    if-eqz v0, :cond_0

    .line 628
    :try_start_0
    iget-object v0, p0, Lo/eek;->d:Lo/eef;

    invoke-interface {v0, p1}, Lo/eef;->d(Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 633
    goto :goto_0

    .line 630
    :catch_0
    move-exception v2

    .line 632
    const-string v0, "SNS_SDK"

    const-string v1, "api.auth() exception."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 633
    goto :goto_0

    .line 637
    :cond_0
    const-string v0, "SNS_SDK"

    const-string v1, "auth() packageName is invalid"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 639
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method d(Lo/een;)I
    .locals 5

    .line 224
    const/4 v2, 0x0

    .line 225
    iget-object v0, p0, Lo/eek;->d:Lo/eef;

    if-eqz v0, :cond_0

    .line 230
    :try_start_0
    sget-object v0, Lo/eek;->f:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 235
    goto :goto_1

    .line 232
    :catch_0
    move-exception v3

    .line 234
    const-string v0, "SNS_SDK"

    const-string v1, "Execute SDK data task failed !"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 235
    goto :goto_1

    .line 240
    :cond_0
    iget-object v3, p0, Lo/eek;->b:Ljava/lang/Object;

    monitor-enter v3

    .line 242
    :try_start_1
    iget-object v0, p0, Lo/eek;->a:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 245
    const/4 v2, 0x2

    .line 246
    const-string v0, "SNS_SDK"

    const-string v1, "execute SDKDataTask,AIDL is not connected! add task in Queue failed!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 248
    :cond_1
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 249
    :goto_0
    const-string v0, "SNS_SDK"

    const-string v1, "AIDL null, add SDKDataTask in Queue and wait for AIDL connect!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 250
    invoke-virtual {p0}, Lo/eek;->d()V

    .line 252
    :goto_1
    return v2
.end method

.method d()V
    .locals 3

    .line 167
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.sns.sdk.api.SNS_SDK_OPENAPI"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 168
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 169
    const-string v0, "SNS_SDK"

    const-string v1, "connect to bindService()"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 170
    iget-object v0, p0, Lo/eek;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v2, p0, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 171
    return-void
.end method

.method public e(Lcom/huawei/sns/sdk/modelmsg/UserReq;Lo/edy;Ljava/lang/String;)I
    .locals 7

    .line 541
    new-instance v0, Lo/een;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    sget-object v4, Lo/edx$b;->m:Lo/edx$b;

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/een;-><init>(Lo/eek;Ljava/lang/Object;Lo/edw;Lo/edx$b;Ljava/lang/String;)V

    move-object v6, v0

    .line 542
    invoke-virtual {p0, v6}, Lo/eek;->d(Lo/een;)I

    move-result v0

    return v0
.end method

.method public e(Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;
    .locals 3

    .line 605
    const/4 v2, 0x0

    .line 606
    iget-object v0, p0, Lo/eek;->d:Lo/eef;

    if-eqz v0, :cond_0

    .line 608
    invoke-direct {p0, p1, p2}, Lo/eek;->a(Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;

    move-result-object v2

    goto :goto_0

    .line 612
    :cond_0
    const-string v0, "SNS_SDK"

    const-string v1, "execute syncQueryGroupMemList! AIDL is not connected! will block!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 614
    invoke-direct {p0}, Lo/eek;->e()V

    .line 615
    invoke-direct {p0, p1, p2}, Lo/eek;->a(Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;

    move-result-object v2

    .line 617
    :goto_0
    return-object v2
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 4

    .line 192
    invoke-static {p2}, Lo/eef$e;->e(Landroid/os/IBinder;)Lo/eef;

    move-result-object v0

    iput-object v0, p0, Lo/eek;->d:Lo/eef;

    .line 193
    const-string v0, "SNS_SDK"

    const-string v1, "onServiceConnected()"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 196
    iget-object v0, p0, Lo/eek;->i:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lo/eek;->d(Ljava/lang/String;)I

    .line 199
    iget-object v2, p0, Lo/eek;->c:Ljava/lang/Object;

    monitor-enter v2

    .line 201
    :try_start_0
    iget-object v0, p0, Lo/eek;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 205
    :goto_0
    invoke-direct {p0}, Lo/eek;->a()V

    .line 206
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 211
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eek;->d:Lo/eef;

    .line 212
    const-string v0, "SNS_SDK"

    const-string v1, "onServiceDisconnected()"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    return-void
.end method
