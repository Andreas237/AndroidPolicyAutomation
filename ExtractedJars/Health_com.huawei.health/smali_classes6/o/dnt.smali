.class public Lo/dnt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dnr;
.implements Lo/dnx;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dnt$d;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/huawei/up/model/UserInfomation;

.field private c:Z

.field private d:Ljava/lang/Object;

.field private e:Lo/dnt$d;

.field private f:Lo/dor;

.field private g:Lo/dod$b;

.field private h:Lo/dod$b;

.field private i:Lo/dod$e;

.field private k:Lo/dod$e;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dnt;->c:Z

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnt;->b:Lcom/huawei/up/model/UserInfomation;

    .line 62
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/dnt;->d:Ljava/lang/Object;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnt;->e:Lo/dnt$d;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnt;->a:Landroid/content/Context;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnt;->i:Lo/dod$e;

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnt;->g:Lo/dod$b;

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnt;->k:Lo/dod$e;

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnt;->h:Lo/dod$b;

    .line 74
    new-instance v0, Lo/dor;

    invoke-direct {v0}, Lo/dor;-><init>()V

    iput-object v0, p0, Lo/dnt;->f:Lo/dor;

    return-void
.end method

.method static synthetic a(Lo/dnt;)Lo/dor;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/dnt;->f:Lo/dor;

    return-object v0
.end method

.method private a(Ljava/lang/String;)V
    .locals 6

    .line 649
    iget-object v4, p0, Lo/dnt;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 650
    :try_start_0
    iget-object v0, p0, Lo/dnt;->b:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 651
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "could not modify Name by account Name when get UserInfo from account"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 653
    monitor-exit v4

    return-void

    .line 655
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/dnt;->b:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0, p1}, Lcom/huawei/up/model/UserInfomation;->setName(Ljava/lang/String;)V

    .line 656
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyNameByAccount write memory(refresh):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnt;->b:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 658
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 659
    :goto_0
    iget-object v0, p0, Lo/dnt;->a:Landroid/content/Context;

    const-string v1, "com.huawei.bone.action.FITNESS_USERINFO_UPDATED"

    invoke-static {v0, v1}, Lo/dol;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 660
    return-void
.end method

.method static synthetic b(Lo/dnt;)Lo/dnt$d;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/dnt;->e:Lo/dnt$d;

    return-object v0
.end method

.method private b(Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/model/UserInfomation;)Z
    .locals 5

    .line 390
    if-nez p1, :cond_0

    if-nez p2, :cond_0

    .line 391
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userInfo1 and userInfo2 null,equals"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    const/4 v0, 0x1

    return v0

    .line 395
    :cond_0
    if-eqz p1, :cond_1

    if-nez p2, :cond_2

    .line 396
    :cond_1
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userInfo1 or userInfo2 null,no equals"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    const/4 v0, 0x0

    return v0

    .line 400
    :cond_2
    const/4 v4, 0x1

    .line 402
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 403
    const/4 v4, 0x0

    .line 406
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getLanguageCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->getLanguageCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 407
    const/4 v4, 0x0

    .line 414
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 415
    const/4 v4, 0x0

    .line 418
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v1

    if-eq v0, v1, :cond_6

    .line 419
    const/4 v4, 0x0

    .line 422
    :cond_6
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 423
    const/4 v4, 0x0

    .line 425
    :cond_7
    return v4
.end method

.method static synthetic b(Lo/dnt;Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/model/UserInfomation;)Z
    .locals 1

    .line 44
    invoke-direct {p0, p1, p2}, Lo/dnt;->b(Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/model/UserInfomation;)Z

    move-result v0

    return v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 2

    .line 708
    invoke-static {}, Lo/doa;->e()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/dnt$6;

    invoke-direct {v1, p0, p1}, Lo/dnt$6;-><init>(Lo/dnt;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 719
    return-void
.end method

.method static synthetic c(Lo/dnt;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lo/dnt;->g()V

    return-void
.end method

.method static synthetic c(Lo/dnt;Ljava/lang/String;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lo/dnt;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lo/dnt;)Landroid/content/Context;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/dnt;->a:Landroid/content/Context;

    return-object v0
.end method

.method private d()V
    .locals 5

    .line 249
    iget-boolean v0, p0, Lo/dnt;->c:Z

    if-eqz v0, :cond_0

    .line 250
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "k scence read account error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    return-void

    .line 253
    :cond_0
    new-instance v4, Lo/dnt$8;

    iget-object v0, p0, Lo/dnt;->e:Lo/dnt$d;

    invoke-direct {v4, p0, v0}, Lo/dnt$8;-><init>(Lo/dnt;Landroid/os/Handler;)V

    .line 270
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 271
    new-instance v0, Lo/dnt$12;

    invoke-direct {v0, p0, v4}, Lo/dnt$12;-><init>(Lo/dnt;Lo/doi;)V

    invoke-virtual {v4, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 294
    :cond_1
    new-instance v0, Lo/dnt$13;

    invoke-direct {v0, p0, v4}, Lo/dnt$13;-><init>(Lo/dnt;Lo/doi;)V

    invoke-virtual {v4, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 365
    new-instance v0, Lo/dnt$11;

    invoke-direct {v0, p0, v4}, Lo/dnt$11;-><init>(Lo/dnt;Lo/doi;)V

    invoke-virtual {v4, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 386
    invoke-virtual {v4}, Lo/doi;->b()V

    .line 387
    return-void
.end method

.method static synthetic e(Lo/dnt;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lo/dnt;->d()V

    return-void
.end method

.method static synthetic e(Lo/dnt;Ljava/lang/String;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lo/dnt;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic f(Lo/dnt;)Lo/dod$e;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/dnt;->i:Lo/dod$e;

    return-object v0
.end method

.method static synthetic g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/dnt;->b:Lcom/huawei/up/model/UserInfomation;

    return-object v0
.end method

.method private g()V
    .locals 10

    .line 431
    iget-object v4, p0, Lo/dnt;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 432
    :try_start_0
    iget-object v0, p0, Lo/dnt;->b:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 433
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userInfo portraitUrl empty,force default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    const-string v5, ""

    .line 435
    iget-object v6, p0, Lo/dnt;->d:Ljava/lang/Object;

    monitor-enter v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 436
    :try_start_1
    iget-object v0, p0, Lo/dnt;->b:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v5

    .line 437
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    :try_start_2
    throw v7

    .line 439
    :goto_0
    iget-object v6, p0, Lo/dnt;->d:Ljava/lang/Object;

    monitor-enter v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 440
    :try_start_3
    iget-object v0, p0, Lo/dnt;->b:Lcom/huawei/up/model/UserInfomation;

    const-string v1, "default"

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setPicPath(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 441
    monitor-exit v6

    goto :goto_1

    :catchall_1
    move-exception v8

    monitor-exit v6

    :try_start_4
    throw v8

    .line 442
    :goto_1
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 443
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processCheckHeadPic AllowLogin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 446
    :cond_0
    invoke-direct {p0, v5}, Lo/dnt;->c(Ljava/lang/String;)V

    .line 447
    iget-object v0, p0, Lo/dnt;->a:Landroid/content/Context;

    const-string v1, ""

    invoke-static {v0, v1}, Lo/dou;->c(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 449
    :goto_2
    monitor-exit v4

    return-void

    .line 452
    :cond_1
    const/4 v5, 0x1

    .line 453
    :try_start_5
    iget-object v0, p0, Lo/dnt;->b:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 454
    const/4 v5, 0x0

    goto :goto_3

    .line 455
    :cond_2
    iget-object v0, p0, Lo/dnt;->b:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "default"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lo/dnt;->b:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "defaultPic"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 456
    :cond_3
    const/4 v5, 0x0

    goto :goto_3

    .line 457
    :cond_4
    iget-object v0, p0, Lo/dnt;->b:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "files"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 458
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "picPath name not contains \'files\',means no saved to /com.huawei.health/files,need re download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    const/4 v5, 0x0

    .line 462
    :cond_5
    :goto_3
    if-eqz v5, :cond_6

    .line 463
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userInfo picPath validate,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    iget-object v0, p0, Lo/dnt;->e:Lo/dnt$d;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v1}, Lo/dnt$d;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 465
    monitor-exit v4

    return-void

    .line 467
    :cond_6
    monitor-exit v4

    goto :goto_4

    :catchall_2
    move-exception v9

    monitor-exit v4

    throw v9

    .line 468
    :goto_4
    new-instance v4, Lo/dnt$15;

    iget-object v0, p0, Lo/dnt;->e:Lo/dnt$d;

    invoke-direct {v4, p0, v0}, Lo/dnt$15;-><init>(Lo/dnt;Landroid/os/Handler;)V

    .line 480
    new-instance v0, Lo/dnt$14;

    invoke-direct {v0, p0, v4}, Lo/dnt$14;-><init>(Lo/dnt;Lo/doi;)V

    invoke-virtual {v4, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 506
    new-instance v0, Lo/dnt$5;

    invoke-direct {v0, p0, v4}, Lo/dnt$5;-><init>(Lo/dnt;Lo/doi;)V

    invoke-virtual {v4, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 528
    invoke-virtual {v4}, Lo/doi;->b()V

    .line 529
    return-void
.end method

.method static synthetic h(Lo/dnt;)Lo/dod$b;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/dnt;->h:Lo/dod$b;

    return-object v0
.end method

.method static synthetic i(Lo/dnt;)Lo/dod$e;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/dnt;->k:Lo/dod$e;

    return-object v0
.end method

.method static synthetic k(Lo/dnt;)Ljava/lang/Object;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/dnt;->d:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic o(Lo/dnt;)Lo/dod$b;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/dnt;->g:Lo/dod$b;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 240
    iget-boolean v0, p0, Lo/dnt;->c:Z

    if-eqz v0, :cond_0

    .line 241
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "k scence read account error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    return-void

    .line 244
    :cond_0
    iget-object v0, p0, Lo/dnt;->e:Lo/dnt$d;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lo/dnt$d;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 245
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 4

    .line 132
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    new-instance v0, Lo/dnt$d;

    invoke-direct {v0, p0, p1}, Lo/dnt$d;-><init>(Lo/dnt;Landroid/content/Context;)V

    iput-object v0, p0, Lo/dnt;->e:Lo/dnt$d;

    .line 134
    iget-object v0, p0, Lo/dnt;->e:Lo/dnt$d;

    invoke-virtual {v0, p1}, Lo/dnt$d;->c(Landroid/content/Context;)V

    .line 135
    return-void
.end method

.method public b()Lcom/huawei/up/model/UserInfomation;
    .locals 2

    .line 533
    iget-object v0, p0, Lo/dnt;->d:Ljava/lang/Object;

    iget-object v1, p0, Lo/dnt;->b:Lcom/huawei/up/model/UserInfomation;

    invoke-static {v0, v1}, Lo/dos;->e(Ljava/lang/Object;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/content/Context;)V
    .locals 7

    .line 673
    :try_start_0
    invoke-static {p1}, Lo/dou;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 675
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "default"

    invoke-static {v4, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 676
    invoke-direct {p0, v4}, Lo/dnt;->c(Ljava/lang/String;)V

    .line 680
    :cond_0
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 681
    iget-object v0, p0, Lo/dnt;->a:Landroid/content/Context;

    const-string v1, ""

    invoke-static {v0, v1}, Lo/dou;->b(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 683
    :cond_1
    iget-object v0, p0, Lo/dnt;->a:Landroid/content/Context;

    const-string v1, ""

    invoke-static {v0, v1}, Lo/dou;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 686
    :goto_0
    iget-object v5, p0, Lo/dnt;->d:Ljava/lang/Object;

    monitor-enter v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 687
    :try_start_1
    iget-object v0, p0, Lo/dnt;->b:Lcom/huawei/up/model/UserInfomation;

    if-eqz v0, :cond_2

    .line 688
    iget-object v0, p0, Lo/dnt;->b:Lcom/huawei/up/model/UserInfomation;

    const-string v1, "default"

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setPicPath(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 690
    :cond_2
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v5

    :try_start_2
    throw v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 693
    :goto_1
    goto :goto_2

    .line 691
    :catch_0
    move-exception v4

    .line 692
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 697
    :goto_2
    return-void
.end method

.method public b(Lo/dod$e$b;)V
    .locals 4

    .line 538
    if-nez p1, :cond_0

    .line 539
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not allow get data by account with no callback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 540
    return-void

    .line 542
    :cond_0
    iget-boolean v0, p0, Lo/dnt;->c:Z

    if-eqz v0, :cond_1

    .line 543
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "k scence read account error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 544
    return-void

    .line 546
    :cond_1
    iget-object v0, p0, Lo/dnt;->e:Lo/dnt$d;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lo/dnt$d;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 547
    iget-object v0, p0, Lo/dnt;->e:Lo/dnt$d;

    const/4 v1, 0x7

    invoke-virtual {v0, v1, p1}, Lo/dnt$d;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 548
    return-void
.end method

.method public c()V
    .locals 2

    .line 700
    iget-object v0, p0, Lo/dnt;->f:Lo/dor;

    invoke-virtual {v0}, Lo/dor;->b()V

    .line 701
    const/4 v1, 0x5

    :goto_0
    const/16 v0, 0xa

    if-ge v1, v0, :cond_0

    .line 702
    iget-object v0, p0, Lo/dnt;->e:Lo/dnt$d;

    invoke-virtual {v0, v1}, Lo/dnt$d;->removeMessages(I)V

    .line 701
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 705
    :cond_0
    return-void
.end method

.method public c(Landroid/os/Message;)V
    .locals 7

    .line 138
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processInit what:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    iget-object v0, p0, Lo/dnt;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->isLoginedByWear()Z

    move-result v0

    iput-boolean v0, p0, Lo/dnt;->c:Z

    .line 141
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroid/content/Context;

    .line 142
    iput-object v4, p0, Lo/dnt;->a:Landroid/content/Context;

    .line 143
    new-instance v0, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v0}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    iput-object v0, p0, Lo/dnt;->b:Lcom/huawei/up/model/UserInfomation;

    .line 144
    iget-object v0, p0, Lo/dnt;->b:Lcom/huawei/up/model/UserInfomation;

    const-string v1, "default"

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setPicPath(Ljava/lang/String;)V

    .line 146
    invoke-static {v4}, Lo/dob;->e(Landroid/content/Context;)Lo/dob;

    move-result-object v0

    invoke-virtual {v0}, Lo/dob;->a()Lo/dod$e;

    move-result-object v0

    iput-object v0, p0, Lo/dnt;->i:Lo/dod$e;

    .line 147
    invoke-static {v4}, Lo/dob;->e(Landroid/content/Context;)Lo/dob;

    move-result-object v0

    invoke-virtual {v0}, Lo/dob;->c()Lo/dod$b;

    move-result-object v0

    iput-object v0, p0, Lo/dnt;->g:Lo/dod$b;

    .line 148
    invoke-static {v4}, Lo/dog;->c(Landroid/content/Context;)Lo/dog;

    move-result-object v0

    invoke-virtual {v0}, Lo/dog;->c()Lo/dod$e;

    move-result-object v0

    iput-object v0, p0, Lo/dnt;->k:Lo/dod$e;

    .line 149
    invoke-static {v4}, Lo/dog;->c(Landroid/content/Context;)Lo/dog;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dog;->d(I)Lo/dod$b;

    move-result-object v0

    iput-object v0, p0, Lo/dnt;->h:Lo/dod$b;

    .line 151
    iget-object v0, p0, Lo/dnt;->i:Lo/dod$e;

    invoke-interface {v0}, Lo/dod$e;->c()V

    .line 152
    iget-object v0, p0, Lo/dnt;->g:Lo/dod$b;

    invoke-interface {v0}, Lo/dod$b;->e()V

    .line 153
    iget-object v0, p0, Lo/dnt;->k:Lo/dod$e;

    invoke-interface {v0}, Lo/dod$e;->c()V

    .line 154
    iget-object v0, p0, Lo/dnt;->h:Lo/dod$b;

    invoke-interface {v0}, Lo/dod$b;->e()V

    .line 156
    iget v5, p1, Landroid/os/Message;->what:I

    .line 157
    new-instance v6, Lo/dnt$2;

    iget-object v0, p0, Lo/dnt;->e:Lo/dnt$d;

    invoke-direct {v6, p0, v0, v5}, Lo/dnt$2;-><init>(Lo/dnt;Landroid/os/Handler;I)V

    .line 173
    new-instance v0, Lo/dnt$9;

    invoke-direct {v0, p0, v6}, Lo/dnt$9;-><init>(Lo/dnt;Lo/doi;)V

    invoke-virtual {v6, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 202
    new-instance v0, Lo/dnt$10;

    invoke-direct {v0, p0, v6}, Lo/dnt$10;-><init>(Lo/dnt;Lo/doi;)V

    invoke-virtual {v6, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 230
    invoke-virtual {v6}, Lo/doi;->b()V

    .line 231
    return-void
.end method

.method public d(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
    .locals 4

    .line 552
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfo enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 553
    iget-object v0, p0, Lo/dnt;->e:Lo/dnt$d;

    invoke-virtual {v0, p1, p2}, Lo/dnt$d;->c(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V

    .line 554
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 3

    .line 643
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 644
    const-string v0, "accountName"

    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 645
    iget-object v0, p0, Lo/dnt;->e:Lo/dnt$d;

    const/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Lo/dnt$d;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 646
    return-void
.end method

.method public e(Landroid/os/Message;Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
    .locals 4

    .line 557
    iget v1, p1, Landroid/os/Message;->what:I

    .line 558
    new-instance v2, Lo/dnt$3;

    iget-object v0, p0, Lo/dnt;->e:Lo/dnt$d;

    invoke-direct {v2, p0, v0, v1, p3}, Lo/dnt$3;-><init>(Lo/dnt;Landroid/os/Handler;ILo/dod$b$d;)V

    .line 574
    const/4 v3, 0x1

    .line 575
    iget-boolean v0, p0, Lo/dnt;->c:Z

    if-eqz v0, :cond_0

    const/4 v3, 0x0

    .line 577
    :cond_0
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz v3, :cond_1

    .line 578
    new-instance v0, Lo/dnt$1;

    invoke-direct {v0, p0, p2, v2}, Lo/dnt$1;-><init>(Lo/dnt;Lcom/huawei/up/model/UserInfomation;Lo/doi;)V

    invoke-virtual {v2, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 601
    :cond_1
    new-instance v0, Lo/dnt$4;

    invoke-direct {v0, p0, p2, v2}, Lo/dnt$4;-><init>(Lo/dnt;Lcom/huawei/up/model/UserInfomation;Lo/doi;)V

    invoke-virtual {v2, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 622
    new-instance v0, Lo/dnt$7;

    invoke-direct {v0, p0, p2, v2}, Lo/dnt$7;-><init>(Lo/dnt;Lcom/huawei/up/model/UserInfomation;Lo/doi;)V

    invoke-virtual {v2, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 638
    invoke-virtual {v2}, Lo/doi;->b()V

    .line 639
    return-void
.end method

.method public e()Z
    .locals 1

    .line 235
    iget-object v0, p0, Lo/dnt;->e:Lo/dnt$d;

    invoke-virtual {v0}, Lo/dnt$d;->c()Z

    move-result v0

    return v0
.end method
