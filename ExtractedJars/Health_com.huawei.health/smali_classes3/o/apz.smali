.class public final Lo/apz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/apo;


# static fields
.field private static b:Lo/apz;


# instance fields
.field private a:Lo/aqb;

.field private c:Lo/apx;

.field private d:Lo/aqa;

.field private e:Lo/apy;

.field private f:Z

.field private h:Lo/aqf;

.field private i:Z

.field private k:Landroid/os/Handler;


# direct methods
.method private constructor <init>()V
    .locals 4

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lo/apz;->e:Lo/apy;

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/apz;->d:Lo/aqa;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lo/apz;->c:Lo/apx;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/apz;->a:Lo/aqb;

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lo/apz;->h:Lo/aqf;

    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lo/apz;->k:Landroid/os/Handler;

    .line 102
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/apz;->f:Z

    .line 107
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/apz;->i:Z

    .line 114
    invoke-static {}, Lo/aph;->d()Landroid/os/HandlerThread;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    .line 115
    if-nez v2, :cond_0

    .line 117
    const-string v0, "MessageSendManager"

    const-string v1, "MessageSendManager:looper is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    return-void

    .line 120
    :cond_0
    new-instance v0, Lo/apz$5;

    invoke-direct {v0, p0, v2}, Lo/apz$5;-><init>(Lo/apz;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/apz;->k:Landroid/os/Handler;

    .line 134
    new-instance v3, Lo/bca;

    invoke-direct {v3}, Lo/bca;-><init>()V

    .line 135
    invoke-virtual {v3}, Lo/bca;->p()Z

    move-result v0

    iput-boolean v0, p0, Lo/apz;->f:Z

    .line 136
    return-void
.end method

.method private c(ILcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 3

    .line 283
    const-string v0, "MessageSendManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doHandlerMessage msgType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " item:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 288
    :pswitch_0
    invoke-direct {p0}, Lo/apz;->i()Lo/apy;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/apy;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 289
    goto :goto_0

    .line 293
    :pswitch_1
    invoke-direct {p0}, Lo/apz;->i()Lo/apy;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/apy;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 294
    goto :goto_0

    .line 298
    :pswitch_2
    invoke-direct {p0}, Lo/apz;->i()Lo/apy;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p2, v1}, Lo/apy;->d(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 299
    goto :goto_0

    .line 303
    :pswitch_3
    invoke-direct {p0}, Lo/apz;->i()Lo/apy;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1}, Lo/apy;->d(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 304
    goto :goto_0

    .line 308
    :pswitch_4
    invoke-direct {p0}, Lo/apz;->i()Lo/apy;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/apy;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 309
    goto :goto_0

    .line 313
    :pswitch_5
    invoke-direct {p0}, Lo/apz;->g()Lo/aqa;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/aqa;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 314
    goto :goto_0

    .line 318
    :pswitch_6
    invoke-direct {p0}, Lo/apz;->i()Lo/apy;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/apy;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 319
    .line 324
    :goto_0
    :pswitch_7
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_7
        :pswitch_5
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method static synthetic c(Lo/apz;ILcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Lo/apz;->c(ILcom/huawei/health/sns/model/chat/MessageItem;)V

    return-void
.end method

.method public static declared-synchronized d()Lo/apz;
    .locals 4

    const-class v2, Lo/apz;

    monitor-enter v2

    .line 145
    :try_start_0
    sget-object v0, Lo/apz;->b:Lo/apz;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 147
    new-instance v0, Lo/apz;

    invoke-direct {v0}, Lo/apz;-><init>()V

    sput-object v0, Lo/apz;->b:Lo/apz;

    .line 149
    :cond_0
    sget-object v0, Lo/apz;->b:Lo/apz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method static synthetic d(Lo/apz;)Lo/aqb;
    .locals 1

    .line 25
    invoke-direct {p0}, Lo/apz;->f()Lo/aqb;

    move-result-object v0

    return-object v0
.end method

.method private d(ILcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 509
    iget-object v0, p0, Lo/apz;->k:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 511
    const-string v0, "MessageSendManager"

    const-string v1, "handlerSendMessage handler is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 515
    :cond_0
    iget-object v0, p0, Lo/apz;->k:Landroid/os/Handler;

    iget-object v1, p0, Lo/apz;->k:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 517
    :goto_0
    return-void
.end method

.method private f()Lo/aqb;
    .locals 1

    .line 254
    iget-object v0, p0, Lo/apz;->a:Lo/aqb;

    if-nez v0, :cond_0

    .line 256
    new-instance v0, Lo/aqb;

    invoke-direct {v0, p0}, Lo/aqb;-><init>(Lo/apo;)V

    iput-object v0, p0, Lo/apz;->a:Lo/aqb;

    .line 258
    :cond_0
    iget-object v0, p0, Lo/apz;->a:Lo/aqb;

    return-object v0
.end method

.method private g()Lo/aqa;
    .locals 1

    .line 226
    iget-object v0, p0, Lo/apz;->d:Lo/aqa;

    if-nez v0, :cond_0

    .line 228
    new-instance v0, Lo/aqa;

    invoke-direct {v0, p0}, Lo/aqa;-><init>(Lo/apo;)V

    iput-object v0, p0, Lo/apz;->d:Lo/aqa;

    .line 230
    :cond_0
    iget-object v0, p0, Lo/apz;->d:Lo/aqa;

    return-object v0
.end method

.method private i()Lo/apy;
    .locals 1

    .line 212
    iget-object v0, p0, Lo/apz;->e:Lo/apy;

    if-nez v0, :cond_0

    .line 214
    new-instance v0, Lo/apy;

    invoke-direct {v0}, Lo/apy;-><init>()V

    iput-object v0, p0, Lo/apz;->e:Lo/apy;

    .line 216
    :cond_0
    iget-object v0, p0, Lo/apz;->e:Lo/apy;

    return-object v0
.end method

.method private k()Lo/apx;
    .locals 1

    .line 240
    iget-object v0, p0, Lo/apz;->c:Lo/apx;

    if-nez v0, :cond_0

    .line 242
    new-instance v0, Lo/apx;

    invoke-direct {v0, p0}, Lo/apx;-><init>(Lo/apo;)V

    iput-object v0, p0, Lo/apz;->c:Lo/apx;

    .line 244
    :cond_0
    iget-object v0, p0, Lo/apz;->c:Lo/apx;

    return-object v0
.end method

.method private k(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 389
    const/4 v0, 0x7

    invoke-direct {p0, v0, p1}, Lo/apz;->d(ILcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 390
    return-void
.end method

.method private l()Lo/aqf;
    .locals 1

    .line 268
    iget-object v0, p0, Lo/apz;->h:Lo/aqf;

    if-nez v0, :cond_0

    .line 270
    new-instance v0, Lo/aqf;

    invoke-direct {v0}, Lo/aqf;-><init>()V

    iput-object v0, p0, Lo/apz;->h:Lo/aqf;

    .line 272
    :cond_0
    iget-object v0, p0, Lo/apz;->h:Lo/aqf;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 157
    iget-boolean v0, p0, Lo/apz;->f:Z

    if-nez v0, :cond_0

    .line 159
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/apz;->f:Z

    .line 160
    new-instance v1, Lo/bca;

    invoke-direct {v1}, Lo/bca;-><init>()V

    .line 161
    iget-boolean v0, p0, Lo/apz;->f:Z

    invoke-virtual {v1, v0}, Lo/bca;->e(Z)V

    .line 163
    :cond_0
    return-void
.end method

.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 356
    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lo/apz;->d(ILcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 357
    return-void
.end method

.method public b(JILjava/lang/String;Z)V
    .locals 3

    .line 460
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 462
    new-instance v0, Lo/aqg;

    invoke-direct {v0}, Lo/aqg;-><init>()V

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/aqg;->a(JILjava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v1

    .line 463
    invoke-virtual {v1, p5}, Lcom/huawei/health/sns/model/chat/MessageItem;->setCanSend(Z)V

    .line 464
    const/4 v2, 0x0

    .line 465
    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    .line 467
    const/4 v2, 0x1

    .line 469
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v1, v0, v2}, Lo/apz;->d(Lcom/huawei/health/sns/model/chat/MessageItem;IZ)V

    .line 471
    :cond_1
    return-void
.end method

.method public b(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 345
    const/16 v0, 0x9

    invoke-direct {p0, v0, p1}, Lo/apz;->d(ILcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 346
    return-void
.end method

.method public b()Z
    .locals 1

    .line 172
    iget-boolean v0, p0, Lo/apz;->f:Z

    return v0
.end method

.method public c(JLcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;Ljava/lang/String;I)V
    .locals 8

    .line 426
    invoke-virtual {p0}, Lo/apz;->e()V

    .line 429
    const/4 v0, 0x1

    if-ne p5, v0, :cond_0

    .line 431
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/apz$3;

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move v6, p5

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Lo/apz$3;-><init>(Lo/apz;JLcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    goto :goto_0

    .line 443
    :cond_0
    const/4 v0, 0x2

    if-ne p5, v0, :cond_1

    .line 445
    invoke-direct {p0}, Lo/apz;->f()Lo/aqb;

    move-result-object v0

    move-wide v1, p1

    move-object v3, p3

    move v4, p5

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/aqb;->e(JLcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;IZ)V

    .line 446
    move-object v0, p0

    move-wide v1, p1

    move v3, p5

    move-object v4, p4

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/apz;->b(JILjava/lang/String;Z)V

    .line 448
    :cond_1
    :goto_0
    return-void
.end method

.method public c(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7

    .line 413
    invoke-virtual {p0}, Lo/apz;->e()V

    .line 414
    invoke-direct {p0}, Lo/apz;->k()Lo/apx;

    move-result-object v0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/apx;->c(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 415
    return-void
.end method

.method public c(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 334
    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lo/apz;->d(ILcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 335
    return-void
.end method

.method public c()Z
    .locals 1

    .line 194
    iget-boolean v0, p0, Lo/apz;->i:Z

    return v0
.end method

.method public d(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 367
    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lo/apz;->d(ILcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 368
    return-void
.end method

.method public d(Lcom/huawei/health/sns/model/chat/MessageItem;IZ)V
    .locals 1

    .line 522
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 524
    invoke-direct {p0, p1}, Lo/apz;->k(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_0

    .line 526
    :cond_0
    if-nez p2, :cond_2

    .line 528
    if-eqz p3, :cond_1

    .line 530
    invoke-virtual {p0, p1}, Lo/apz;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_0

    .line 534
    :cond_1
    invoke-virtual {p0, p1}, Lo/apz;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 537
    :cond_2
    :goto_0
    return-void
.end method

.method public d(Ljava/lang/String;Lcom/huawei/health/sns/model/chat/ShareMessageParams;)V
    .locals 1

    .line 547
    invoke-virtual {p0}, Lo/apz;->e()V

    .line 548
    invoke-direct {p0}, Lo/apz;->l()Lo/aqf;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/aqf;->d(Ljava/lang/String;Lcom/huawei/health/sns/model/chat/ShareMessageParams;)V

    .line 549
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;JI)V
    .locals 6

    .line 498
    invoke-direct {p0}, Lo/apz;->g()Lo/aqa;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/aqa;->c(Ljava/lang/String;Ljava/lang/String;JI)V

    .line 499
    return-void
.end method

.method public d(Ljava/lang/String;[Ljava/lang/String;JI)V
    .locals 6

    .line 483
    invoke-virtual {p0}, Lo/apz;->e()V

    .line 484
    invoke-direct {p0}, Lo/apz;->g()Lo/aqa;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/aqa;->a(Ljava/lang/String;[Ljava/lang/String;JI)V

    .line 485
    return-void
.end method

.method public e()V
    .locals 1

    .line 180
    iget-boolean v0, p0, Lo/apz;->f:Z

    if-nez v0, :cond_0

    .line 182
    invoke-virtual {p0}, Lo/apz;->a()V

    .line 183
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/apz;->i:Z

    .line 185
    :cond_0
    return-void
.end method

.method public e(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 378
    const/4 v0, 0x4

    invoke-direct {p0, v0, p1}, Lo/apz;->d(ILcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 379
    return-void
.end method

.method public g(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 399
    const/4 v0, 0x5

    invoke-direct {p0, v0, p1}, Lo/apz;->d(ILcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 400
    return-void
.end method

.method public h()V
    .locals 1

    .line 202
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/apz;->i:Z

    .line 203
    return-void
.end method
