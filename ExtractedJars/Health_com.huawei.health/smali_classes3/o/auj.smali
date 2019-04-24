.class public final Lo/auj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aue;


# static fields
.field private static a:Ljava/lang/Object;

.field private static e:Lo/auj;

.field private static final i:Ljava/util/concurrent/Executor;


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/aud;>;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/Object;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/aud;>;"
        }
    .end annotation
.end field

.field private f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private g:Ljava/lang/String;

.field private h:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Lo/auj;

    invoke-direct {v0}, Lo/auj;-><init>()V

    sput-object v0, Lo/auj;->e:Lo/auj;

    .line 47
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/auj;->a:Ljava/lang/Object;

    .line 79
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/auj;->i:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/auj;->c:Ljava/lang/Object;

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/auj;->b:Ljava/util/List;

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/auj;->d:Ljava/util/List;

    .line 67
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/auj;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 72
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/auj;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 74
    const-string v0, "com.huawei.health"

    iput-object v0, p0, Lo/auj;->g:Ljava/lang/String;

    .line 83
    return-void
.end method

.method private a()V
    .locals 6

    .line 468
    const/4 v2, 0x1

    .line 469
    sget-object v3, Lo/auj;->a:Ljava/lang/Object;

    monitor-enter v3

    .line 471
    :goto_0
    if-eqz v2, :cond_0

    .line 475
    :try_start_0
    sget-object v0, Lo/auj;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 476
    const/4 v2, 0x0

    .line 482
    goto :goto_0

    .line 478
    :catch_0
    move-exception v4

    .line 480
    const/4 v2, 0x0

    .line 481
    const-string v0, "SocialLoginRequest"

    const-string v1, "waitSync timeout!"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 482
    goto :goto_0

    .line 484
    :cond_0
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    .line 485
    :goto_1
    return-void
.end method

.method private a(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 7

    .line 327
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 328
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 330
    iget-object v4, p0, Lo/auj;->c:Ljava/lang/Object;

    monitor-enter v4

    .line 333
    :try_start_0
    iget-object v0, p0, Lo/auj;->b:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 334
    iget-object v0, p0, Lo/auj;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 337
    iget-object v0, p0, Lo/auj;->d:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 338
    iget-object v0, p0, Lo/auj;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 339
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 345
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/aud;

    .line 347
    const/4 v0, 0x0

    invoke-direct {p0, v5, p1, v0}, Lo/auj;->e(Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V

    .line 348
    goto :goto_1

    .line 352
    :cond_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 354
    const/4 v0, 0x1

    invoke-direct {p0, v3, p1, v0}, Lo/auj;->b(Ljava/util/List;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V

    .line 359
    :cond_1
    iget-object v0, p0, Lo/auj;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 362
    sget-object v4, Lo/auj;->a:Ljava/lang/Object;

    monitor-enter v4

    .line 365
    const/4 v5, 0x1

    .line 366
    :goto_2
    if-eqz v5, :cond_2

    .line 369
    :try_start_1
    sget-object v0, Lo/auj;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 370
    const/4 v5, 0x0

    goto :goto_2

    .line 372
    :cond_2
    monitor-exit v4

    goto :goto_3

    :catchall_1
    move-exception v6

    monitor-exit v4

    throw v6

    .line 373
    :goto_3
    return-void
.end method

.method static synthetic a(Lo/auj;Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2, p3}, Lo/auj;->c(Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V

    return-void
.end method

.method public static b()Lo/auj;
    .locals 1

    .line 87
    sget-object v0, Lo/auj;->e:Lo/auj;

    return-object v0
.end method

.method private b(Ljava/util/List;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/aud;>;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V"
        }
    .end annotation

    .line 207
    const-string v0, "SocialLoginRequest"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleAsyncLoginResp. isSyncLoginReq:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/auj;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    iget-object v0, p0, Lo/auj;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    new-instance v0, Lo/auj$3;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/auj$3;-><init>(Lo/auj;Ljava/util/List;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V

    sget-object v1, Lo/auj;->i:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    .line 230
    invoke-virtual {v0, v1, v2}, Lo/auj$3;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_1

    .line 234
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aud;

    .line 236
    invoke-direct {p0, v4, p2, p3}, Lo/auj;->c(Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V

    .line 237
    goto :goto_0

    .line 239
    :cond_1
    :goto_1
    return-void
.end method

.method private declared-synchronized b(Lo/aud;)V
    .locals 10

    monitor-enter p0

    .line 394
    :try_start_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 395
    const-string v0, "SocialLoginRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OverSea cant not connect,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    monitor-exit p0

    return-void

    .line 398
    :cond_0
    if-nez p1, :cond_1

    .line 400
    monitor-exit p0

    return-void

    .line 404
    :cond_1
    invoke-static {}, Lo/azc;->c()Lo/azc;

    move-result-object v0

    invoke-virtual {v0}, Lo/azc;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 406
    invoke-interface {p1}, Lo/aud;->a()V

    .line 407
    const-string v0, "SocialLoginRequest"

    const-string v1, "doRequestSync has login sns session valid"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 411
    :cond_2
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 413
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->g()Lo/axr;

    move-result-object v6

    .line 414
    if-nez v6, :cond_3

    .line 416
    const-string v0, "SocialLoginRequest"

    const-string v1, "doRequestSync accountInfo is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 417
    const v0, 0x14ffc

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/aud;->e(II)V

    .line 418
    monitor-exit p0

    return-void

    .line 420
    :cond_3
    invoke-static {v6}, Lo/aug;->b(Lo/axr;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 422
    const v0, 0x14ffc

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/aud;->e(II)V

    .line 423
    monitor-exit p0

    return-void

    .line 426
    :cond_4
    invoke-static {v6}, Lo/aug;->c(Lo/axr;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 428
    const v0, 0x14ffb

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/aud;->e(II)V

    .line 429
    monitor-exit p0

    return-void

    .line 432
    :cond_5
    iget-object v0, p0, Lo/auj;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 434
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lo/auj;->c(Lo/aud;Z)V

    .line 435
    invoke-direct {p0}, Lo/auj;->a()V

    .line 436
    monitor-exit p0

    return-void

    .line 440
    :cond_6
    iget-object v0, p0, Lo/auj;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 442
    const-string v0, "SocialLoginRequest"

    const-string v1, "Social login synchronized. doRequestSynchronized."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 444
    iget-object v0, p0, Lo/auj;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 446
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    invoke-virtual {v0}, Lo/ave;->e()Ljava/lang/String;

    move-result-object v7

    .line 448
    new-instance v0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;

    invoke-virtual {v6}, Lo/axr;->e()I

    move-result v1

    .line 449
    invoke-virtual {v6}, Lo/axr;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Lo/axr;->d()Ljava/lang/String;

    move-result-object v3

    move-object v4, v7

    iget-object v5, p0, Lo/auj;->g:Ljava/lang/String;

    invoke-direct/range {v0 .. v5}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v8, v0

    .line 450
    invoke-static {v8}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v9

    .line 452
    const-string v0, "SocialLoginRequest"

    const-string v1, "call [loginSNS Sync]"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 455
    const/4 v0, 0x0

    invoke-direct {p0, p1, v9, v0}, Lo/auj;->c(Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V

    .line 457
    invoke-direct {p0, v9}, Lo/auj;->a(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 460
    :cond_7
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic b(Lo/auj;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lo/auj;->a(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    return-void
.end method

.method private c(Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V
    .locals 3

    .line 283
    if-eqz p2, :cond_4

    instance-of v0, p2, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;

    if-eqz v0, :cond_4

    .line 285
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 287
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_0

    .line 289
    invoke-interface {p1}, Lo/aud;->a()V

    .line 290
    const-string v0, "SocialLoginRequest"

    const-string v1, "login sns success"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 293
    :cond_0
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3ec

    if-ne v0, v1, :cond_2

    .line 295
    const-string v0, "SocialLoginRequest"

    const-string v1, "st error."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    if-eqz p3, :cond_1

    .line 298
    invoke-static {p0, p1}, Lo/aug;->d(Lo/aue;Lo/aud;)V

    goto :goto_0

    .line 302
    :cond_1
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lo/aud;->e(II)V

    goto :goto_0

    .line 307
    :cond_2
    const-string v0, "SocialLoginRequest"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "login error resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lo/aud;->e(II)V

    goto :goto_0

    .line 313
    :cond_3
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/aud;->e(II)V

    .line 314
    const-string v0, "SocialLoginRequest"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    :cond_4
    :goto_0
    return-void
.end method

.method private c(Lo/aud;Z)V
    .locals 3

    .line 184
    iget-object v1, p0, Lo/auj;->c:Ljava/lang/Object;

    monitor-enter v1

    .line 186
    if-eqz p2, :cond_0

    .line 188
    :try_start_0
    iget-object v0, p0, Lo/auj;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 192
    :cond_0
    iget-object v0, p0, Lo/auj;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 194
    :goto_0
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 195
    :goto_1
    return-void
.end method

.method private d(Lo/aud;)V
    .locals 9

    .line 121
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 123
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->g()Lo/axr;

    move-result-object v6

    .line 124
    if-nez v6, :cond_0

    .line 126
    const-string v0, "SocialLoginRequest"

    const-string v1, "doRequest accountInfo is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    invoke-static {p0, p1}, Lo/aug;->d(Lo/aue;Lo/aud;)V

    .line 128
    return-void

    .line 130
    :cond_0
    invoke-static {v6}, Lo/aug;->b(Lo/axr;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 132
    const v0, 0x14ffc

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/aud;->e(II)V

    .line 133
    return-void

    .line 136
    :cond_1
    invoke-static {v6}, Lo/aug;->c(Lo/axr;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 138
    const v0, 0x14ffb

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/aud;->e(II)V

    .line 139
    return-void

    .line 143
    :cond_2
    iget-object v0, p0, Lo/auj;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 145
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/auj;->c(Lo/aud;Z)V

    .line 146
    return-void

    .line 150
    :cond_3
    iget-object v0, p0, Lo/auj;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 152
    iget-object v0, p0, Lo/auj;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 154
    const-string v0, "SocialLoginRequest"

    const-string v1, "Social login asynchronous. doLogin."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    invoke-virtual {v0}, Lo/ave;->e()Ljava/lang/String;

    move-result-object v7

    .line 158
    new-instance v0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;

    invoke-virtual {v6}, Lo/axr;->e()I

    move-result v1

    .line 159
    invoke-virtual {v6}, Lo/axr;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Lo/axr;->d()Ljava/lang/String;

    move-result-object v3

    move-object v4, v7

    const-string v5, "com.huawei.health"

    invoke-direct/range {v0 .. v5}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v8, v0

    .line 160
    new-instance v0, Lo/auj$1;

    invoke-direct {v0, p0, p1}, Lo/auj$1;-><init>(Lo/auj;Lo/aud;)V

    invoke-static {v8, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->c(Lcom/huawei/health/sns/server/SNSRequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;

    .line 169
    goto :goto_0

    .line 172
    :cond_4
    invoke-static {p0, p1}, Lo/aug;->d(Lo/aue;Lo/aud;)V

    .line 173
    const-string v0, "SocialLoginRequest"

    const-string v1, "RequestUtil: has not login hwaccount!"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    :goto_0
    return-void
.end method

.method private e(Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V
    .locals 3

    .line 251
    const-string v0, "SocialLoginRequest"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleSyncLoginResp. isSyncLoginReq:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/auj;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    iget-object v0, p0, Lo/auj;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 258
    invoke-direct {p0, p1, p2, p3}, Lo/auj;->c(Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V

    goto :goto_0

    .line 263
    :cond_0
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/auj$5;

    invoke-direct {v1, p0, p1, p2, p3}, Lo/auj$5;-><init>(Lo/auj;Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V

    invoke-virtual {v0, v1}, Lo/brb;->d(Ljava/lang/Runnable;)V

    .line 272
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lo/aud;)V
    .locals 4

    .line 379
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 380
    const-string v0, "SocialLoginRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OverSea cant not connect,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    return-void

    .line 383
    :cond_0
    invoke-direct {p0, p1}, Lo/auj;->b(Lo/aud;)V

    .line 384
    return-void
.end method

.method public c(Lo/aud;)V
    .locals 4

    .line 94
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    const-string v0, "SocialLoginRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OverSea cant not connect,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    return-void

    .line 98
    :cond_0
    if-nez p1, :cond_1

    .line 100
    return-void

    .line 103
    :cond_1
    invoke-static {}, Lo/azc;->c()Lo/azc;

    move-result-object v0

    invoke-virtual {v0}, Lo/azc;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 105
    invoke-interface {p1}, Lo/aud;->a()V

    .line 106
    const-string v0, "SocialLoginRequest"

    const-string v1, "has login sns session valid"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 110
    :cond_2
    invoke-direct {p0, p1}, Lo/auj;->d(Lo/aud;)V

    .line 112
    :goto_0
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 3

    .line 489
    const-string v0, "SocialLoginRequest"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setFromPkg !"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 491
    return-void
.end method
