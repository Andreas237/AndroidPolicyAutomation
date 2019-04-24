.class Lcom/huawei/wallet/logic/down/AppDownManager$AppInstallReceive;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/logic/down/AppDownManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AppInstallReceive"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/wallet/logic/down/AppDownManager;


# direct methods
.method private constructor <init>(Lcom/huawei/wallet/logic/down/AppDownManager;)V
    .locals 0

    .line 461
    iput-object p1, p0, Lcom/huawei/wallet/logic/down/AppDownManager$AppInstallReceive;->a:Lcom/huawei/wallet/logic/down/AppDownManager;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/wallet/logic/down/AppDownManager;Lcom/huawei/wallet/logic/down/AppDownManager$1;)V
    .locals 0

    .line 461
    invoke-direct {p0, p1}, Lcom/huawei/wallet/logic/down/AppDownManager$AppInstallReceive;-><init>(Lcom/huawei/wallet/logic/down/AppDownManager;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 467
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 468
    return-void

    .line 470
    :cond_0
    const-string v0, "android.intent.action.PACKAGE_ADDED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 471
    return-void

    .line 474
    :cond_1
    const/4 v2, 0x0

    .line 475
    invoke-virtual {p2}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v3

    .line 476
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 477
    const-string v0, "intentData is not null"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 478
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 480
    :cond_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 481
    return-void

    .line 483
    :cond_3
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager$AppInstallReceive;->a:Lcom/huawei/wallet/logic/down/AppDownManager;

    invoke-static {v0}, Lcom/huawei/wallet/logic/down/AppDownManager;->c(Lcom/huawei/wallet/logic/down/AppDownManager;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 484
    return-void

    .line 487
    :cond_4
    const-string v0, "AppDownManager onReceive install package success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 488
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager$AppInstallReceive;->a:Lcom/huawei/wallet/logic/down/AppDownManager;

    invoke-static {v0}, Lcom/huawei/wallet/logic/down/AppDownManager;->b(Lcom/huawei/wallet/logic/down/AppDownManager;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 489
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager$AppInstallReceive;->a:Lcom/huawei/wallet/logic/down/AppDownManager;

    invoke-static {v0}, Lcom/huawei/wallet/logic/down/AppDownManager;->b(Lcom/huawei/wallet/logic/down/AppDownManager;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x14d

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 491
    :cond_5
    const-string v0, "AppDownManager onReceive mHandler is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 493
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager$AppInstallReceive;->a:Lcom/huawei/wallet/logic/down/AppDownManager;

    invoke-virtual {v0}, Lcom/huawei/wallet/logic/down/AppDownManager;->a()V

    .line 494
    return-void
.end method
