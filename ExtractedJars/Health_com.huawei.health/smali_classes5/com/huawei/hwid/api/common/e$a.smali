.class Lcom/huawei/hwid/api/common/e$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/api/common/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Z

.field private c:Lcom/huawei/cloudservice/LoginHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/cloudservice/LoginHandler;Lcom/huawei/hwid/core/a/b;)V
    .locals 1

    .line 489
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 484
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/e$a;->a:Landroid/content/Context;

    .line 485
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/e$a;->b:Z

    .line 486
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/e$a;->c:Lcom/huawei/cloudservice/LoginHandler;

    .line 490
    iput-object p1, p0, Lcom/huawei/hwid/api/common/e$a;->a:Landroid/content/Context;

    .line 491
    iput-object p2, p0, Lcom/huawei/hwid/api/common/e$a;->c:Lcom/huawei/cloudservice/LoginHandler;

    .line 494
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 529
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$a;->c:Lcom/huawei/cloudservice/LoginHandler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 552
    invoke-static {p1, p2}, Lcom/huawei/hwid/api/common/e;->b(Landroid/content/Context;Landroid/content/Intent;)Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v2

    .line 553
    invoke-direct {p0, p1, v2}, Lcom/huawei/hwid/api/common/e$a;->a(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/HwAccount;)V

    .line 563
    goto :goto_0

    .line 564
    :cond_0
    const-string v0, "CloudAccountImpl"

    const-string v1, "handler is null,so cannot handler message"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 566
    :goto_0
    return-void
.end method

.method private a(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/HwAccount;)V
    .locals 5

    .line 498
    const-string v0, "CloudAccountImpl"

    const-string v1, "handleApkLogin"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 499
    const-string v3, ""

    .line 500
    if-nez p2, :cond_0

    .line 502
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$a;->c:Lcom/huawei/cloudservice/LoginHandler;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/cloudservice/LoginHandler;->onLogin([Lcom/huawei/cloudservice/CloudAccount;I)V

    goto :goto_0

    .line 508
    :cond_0
    invoke-static {p2, p1}, Lcom/huawei/hwid/api/common/e;->a(Lcom/huawei/hwid/core/datatype/HwAccount;Landroid/content/Context;)V

    .line 510
    invoke-static {p1}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/hwid/c/a;->a(Lcom/huawei/hwid/core/datatype/HwAccount;)V

    .line 511
    invoke-static {p1}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;)[Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v4

    .line 512
    invoke-virtual {p2}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 513
    invoke-virtual {p2}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v3

    .line 516
    :cond_1
    const-string v0, "CloudAccountImpl"

    const-string v1, "onLogin"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 517
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$a;->c:Lcom/huawei/cloudservice/LoginHandler;

    invoke-static {v4, v3}, Lcom/huawei/hwid/api/common/e;->a([Lcom/huawei/cloudservice/CloudAccount;Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v4, v1}, Lcom/huawei/cloudservice/LoginHandler;->onLogin([Lcom/huawei/cloudservice/CloudAccount;I)V

    .line 518
    invoke-static {p1}, Lcom/huawei/hwid/b/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/b/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/huawei/hwid/b/b;->a(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/HwAccount;)Z

    .line 520
    :goto_0
    return-void
.end method

.method private b(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 569
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "use the sdk: press back key"

    const/16 v1, 0xbba

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 572
    const-string v0, "isUseSDK"

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    .line 573
    const-string v0, "bundle"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    .line 574
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    if-nez v3, :cond_0

    .line 575
    const-string v0, "errorcode"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 576
    const-string v0, "errorreason"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 577
    if-eqz v5, :cond_0

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 578
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    invoke-direct {v2, v5, v6}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 581
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$a;->c:Lcom/huawei/cloudservice/LoginHandler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 582
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$a;->c:Lcom/huawei/cloudservice/LoginHandler;

    invoke-interface {v0, v2}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 586
    :cond_1
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 594
    invoke-static {}, Lcom/huawei/hwid/api/common/e;->e()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 595
    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/hwid/api/common/e$a;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 596
    monitor-exit v2

    return-void

    .line 600
    :cond_0
    :try_start_1
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 601
    const-string v0, "LoginBroadcastReceiver"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 602
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$a;->a:Landroid/content/Context;

    invoke-static {v0, v3}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Landroid/os/Bundle;)V

    .line 603
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/e$a;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 605
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 607
    :goto_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 608
    return-void

    .line 612
    :cond_1
    :try_start_2
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 613
    invoke-static {p1}, Lcom/huawei/hwid/api/common/e;->e(Landroid/content/Context;)V

    .line 614
    const-string v0, "com.huawei.cloudserive.loginSuccess"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 615
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwid/api/common/e$a;->a(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_1

    .line 616
    :cond_2
    const-string v0, "com.huawei.cloudserive.loginFailed"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 617
    const-string v0, "parce"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    .line 618
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$a;->c:Lcom/huawei/cloudservice/LoginHandler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 619
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$a;->c:Lcom/huawei/cloudservice/LoginHandler;

    invoke-interface {v0, v3}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 621
    :cond_3
    goto :goto_1

    :cond_4
    const-string v0, "com.huawei.cloudserive.loginCancel"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 622
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwid/api/common/e$a;->b(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    .line 626
    :cond_5
    :goto_1
    goto :goto_2

    .line 624
    :catch_0
    move-exception v2

    .line 625
    const-string v0, "CloudAccountImpl"

    const-string v1, "Unhandle exception because of Intent to prevent DDOS"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 627
    :goto_2
    return-void
.end method
