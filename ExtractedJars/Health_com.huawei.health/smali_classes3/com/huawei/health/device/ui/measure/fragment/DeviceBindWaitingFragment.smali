.class public Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler;,
        Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$MyTimerTask;
    }
.end annotation


# static fields
.field private static final CONNECT_TIMEOUT:I = 0x1

.field private static final HEALTH_DATA_STATUS_REMIND:Ljava/lang/String; = "health_data_status_remind"


# instance fields
.field private bleDeviceHelper:Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

.field private health_data_status:Z

.field private interactors:Lo/dnm;

.field private isJump:Z

.field private item:Lo/acl;

.field mBindingStatusCallback:Lo/aby;

.field private mConnectTimer:Ljava/util/Timer;

.field private mCustomAlertDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

.field private mDialog:Lo/egy;

.field private mHandler:Landroid/os/Handler;

.field private mIsBingTimeout:Z

.field private mProductId:Ljava/lang/String;

.field private mTitle:Ljava/lang/String;

.field private measure_kit:Ljava/lang/String;

.field private position:I

.field private productInfo:Lo/afj;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 71
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->bleDeviceHelper:Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

    .line 79
    const-string v0, "74e12d04-cf14-4ce8-9e42-7a085f79b708"

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->measure_kit:Ljava/lang/String;

    .line 81
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->health_data_status:Z

    .line 83
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mIsBingTimeout:Z

    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->isJump:Z

    .line 283
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mBindingStatusCallback:Lo/aby;

    .line 522
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mConnectTimer:Ljava/util/Timer;

    .line 525
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mDialog:Lo/egy;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mIsBingTimeout:Z

    return v0
.end method

.method static synthetic access$002(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mIsBingTimeout:Z

    return p1
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->cancelTimer()V

    return-void
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 71
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method static synthetic access$1200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->health_data_status:Z

    return v0
.end method

.method static synthetic access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lo/dnm;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->interactors:Lo/dnm;

    return-object v0
.end method

.method static synthetic access$1400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->bleDeviceHelper:Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

    return-object v0
.end method

.method static synthetic access$1500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Landroid/os/Handler;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$1600(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Landroid/app/Activity;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$1700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Landroid/app/Activity;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$1800(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lo/egy;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mDialog:Lo/egy;

    return-object v0
.end method

.method static synthetic access$1802(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;Lo/egy;)Lo/egy;
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mDialog:Lo/egy;

    return-object p1
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;Z)V
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->jumpToCompUserInfo(Z)V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lo/afj;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lo/acl;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->item:Lo/acl;

    return-object v0
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Z
    .locals 1

    .line 71
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->getDataStatus()Z

    move-result v0

    return v0
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Z
    .locals 1

    .line 71
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->isShowAuthorizeDialog()Z

    move-result v0

    return v0
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->showAuthorizeAlertDialog()V

    return-void
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->jumpToActivity()V

    return-void
.end method

.method private bindWeightDevice()V
    .locals 5

    .line 162
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->item:Lo/acl;

    instance-of v0, v0, Lo/acp;

    if-eqz v0, :cond_0

    .line 163
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->item:Lo/acl;

    move-object v3, v0

    check-cast v3, Lo/acp;

    .line 164
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/acp;->a(Ljava/lang/String;)V

    .line 165
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 166
    const-string v0, "type"

    const/4 v1, -0x2

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 167
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$1;

    invoke-direct {v2, p0, v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;Lo/acp;)V

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/afd;->a(Ljava/lang/String;Lo/abx;Landroid/os/Bundle;Lo/acp;)Z

    .line 216
    :cond_0
    return-void
.end method

.method private declared-synchronized cancelTimer()V
    .locals 5

    monitor-enter p0

    .line 531
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mConnectTimer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 532
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mConnectTimer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 533
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mConnectTimer:Ljava/util/Timer;

    .line 534
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cancel the timer connected devices"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 536
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Connection timer has been canceled"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 538
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method private getDataStatus()Z
    .locals 4

    .line 371
    const/4 v3, 0x0

    .line 372
    const-string v0, "true"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->interactors:Lo/dnm;

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lo/dnm;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 373
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->health_data_status:Z

    goto :goto_0

    .line 375
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->health_data_status:Z

    .line 378
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->health_data_status:Z

    if-nez v0, :cond_1

    .line 379
    const/4 v3, 0x1

    .line 381
    :cond_1
    return v3
.end method

.method private isShowAuthorizeDialog()Z
    .locals 4

    .line 454
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/16 v1, 0x2729

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_manual_record_sync_agree"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 456
    const-string v0, "true"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 457
    const/4 v0, 0x1

    return v0

    .line 459
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private jumpToActivity()V
    .locals 8

    .line 386
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->k()Lo/acl$a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->saveDeviceKind(Lo/acl$a;)V

    .line 388
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->f()Z

    .line 390
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/acd;->d(Ljava/lang/String;)Lo/acp;

    move-result-object v4

    .line 395
    const-string v0, "01"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    .line 397
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lo/acp;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz v5, :cond_0

    .line 398
    new-instance v6, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;

    invoke-direct {v6}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;-><init>()V

    .line 399
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 400
    const-string v0, "view"

    const-string v1, "bond"

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 401
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 402
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mTitle:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 403
    const-string v0, "isBindSuccess"

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 404
    invoke-virtual {v6, v7}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 405
    invoke-virtual {p0, v6}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 406
    goto/16 :goto_0

    :cond_0
    if-eqz v4, :cond_1

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->k()Lo/acl$a;

    move-result-object v0

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    invoke-virtual {v0, v1}, Lo/acl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 407
    new-instance v6, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;

    invoke-direct {v6}, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;-><init>()V

    .line 408
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 409
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 410
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mTitle:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    const-string v0, "isBindSuccess"

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 412
    invoke-virtual {v6, v7}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 413
    invoke-virtual {p0, v6}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 414
    goto :goto_0

    .line 415
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "------------ is honour new device> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    invoke-static {v3}, Lo/ahd;->e(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 417
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->bindWeightDevice()V

    goto :goto_0

    .line 419
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 420
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->jumpToCompUserInfo(Z)V

    goto :goto_0

    .line 422
    :cond_3
    new-instance v6, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-direct {v6}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;-><init>()V

    .line 423
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 424
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    const-string v0, "isBindSuccess"

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 426
    invoke-virtual {v6, v7}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 427
    invoke-virtual {p0, v6}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 451
    :goto_0
    return-void
.end method

.method private jumpToCompUserInfo(Z)V
    .locals 4

    .line 219
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->isJump:Z

    if-eqz v0, :cond_0

    .line 221
    return-void

    .line 223
    :cond_0
    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-direct {v2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;-><init>()V

    .line 224
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 225
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    const-string v0, "goto"

    const-string v1, "devicebind"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mTitle:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    const-string v0, "isBleScale"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 230
    const-string v0, "isHonourDevice"

    invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 231
    invoke-virtual {v2, v3}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 232
    invoke-virtual {p0, v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 233
    sget-object v0, Lo/acs;->c:Lo/acs;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/acs;->d(Z)V

    .line 234
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->isJump:Z

    .line 235
    return-void
.end method

.method private saveDeviceKind(Lo/acl$a;)V
    .locals 5

    .line 348
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDeviceKind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 351
    sget-object v0, Lo/acl$a;->c:Lo/acl$a;

    invoke-virtual {v0, p1}, Lo/acl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 352
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "BIND_WEIGHT"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 355
    :cond_0
    sget-object v0, Lo/acl$a;->a:Lo/acl$a;

    invoke-virtual {v0, p1}, Lo/acl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 356
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "BIND_BLOOD_PRESSURE"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 359
    :cond_1
    sget-object v0, Lo/acl$a;->d:Lo/acl$a;

    invoke-virtual {v0, p1}, Lo/acl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 360
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "BIND_BLOOD_SUGAR"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 363
    :cond_2
    sget-object v0, Lo/acl$a;->g:Lo/acl$a;

    invoke-virtual {v0, p1}, Lo/acl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 364
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "BIND_HEART_RATE"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 368
    :cond_3
    :goto_0
    return-void
.end method

.method private showAuthorizeAlertDialog()V
    .locals 11

    .line 463
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mCustomAlertDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mCustomAlertDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 465
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CustomAlertDialog, is showing."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    return-void

    .line 469
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/dom;->a(Landroid/content/Context;)Lo/dom;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "privacy_health_data_num"

    invoke-virtual {v0, v1, v2}, Lo/dom;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    .line 470
    const/4 v0, 0x3

    if-lt v4, v0, :cond_1

    .line 471
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->jumpToActivity()V

    .line 472
    return-void

    .line 474
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/dom;->a(Landroid/content/Context;)Lo/dom;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "privacy_health_data_num"

    invoke-virtual {v0, v1, v2}, Lo/dom;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 476
    new-instance v5, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;-><init>(Landroid/content/Context;)V

    .line 477
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$layout;->commonui_dialog_health_tip:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 478
    sget v0, Lcom/huawei/plugindevice/R$id;->remind_layout:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    .line 479
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 480
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_health_service_item_one:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 481
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_hwh_privacy_dialog_common_text_one:I

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(I)V

    .line 482
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->health_data_status:Z

    if-nez v0, :cond_3

    .line 483
    sget v0, Lcom/huawei/plugindevice/R$id;->health_status_layout:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/LinearLayout;

    .line 484
    sget v0, Lcom/huawei/plugindevice/R$id;->health_tip:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    .line 485
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 486
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 487
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_hwh_user_health_agreement_china:I

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 489
    :cond_2
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_hwh_user_health_agreement_oversea:I

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(I)V

    .line 493
    :cond_3
    :goto_0
    invoke-virtual {v5, v6}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(Landroid/view/View;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 494
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v5, v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(I)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 495
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_user_permission_ok:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$3;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V

    invoke-virtual {v5, v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->d(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 504
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_common_disagree:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$4;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V

    invoke-virtual {v5, v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 511
    invoke-virtual {v5}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->e()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mCustomAlertDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 512
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mCustomAlertDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->setCancelable(Z)V

    .line 513
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mCustomAlertDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->show()V

    .line 514
    return-void
.end method

.method private declared-synchronized startTimer()V
    .locals 5

    monitor-enter p0

    .line 544
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mConnectTimer:Ljava/util/Timer;

    if-nez v0, :cond_0

    .line 545
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mConnectTimer:Ljava/util/Timer;

    .line 546
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Start the timer connected devices"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 548
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mConnectTimer:Ljava/util/Timer;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$MyTimerTask;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$MyTimerTask;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V

    const-wide/16 v2, 0x3a98

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 550
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method


# virtual methods
.method public createBond(Ljava/lang/Class;Landroid/bluetooth/BluetoothDevice;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 239
    const-string v0, "createBond"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 240
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v2, p2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Boolean;

    .line 241
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public onBackPressed()Z
    .locals 1

    .line 519
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 10

    .line 88
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->interactors:Lo/dnm;

    .line 89
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceBindWaitingFragment onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 93
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mHandler:Landroid/os/Handler;

    .line 94
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->isJump:Z

    .line 97
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v6

    .line 98
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/device/ui/DeviceMainActivity;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a()Ljava/util/ArrayList;

    move-result-object v5

    .line 99
    const-string v0, "productId"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    .line 100
    const-string v0, "position"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->position:I

    .line 101
    const-string v0, "title"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mTitle:Ljava/lang/String;

    .line 103
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBindWaitingFragment productId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBindWaitingFragment position is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->position:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBindWaitingFragment mListItems size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 109
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceBindWaitingFragment destroy activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 111
    return-void

    .line 115
    :cond_0
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->position:I

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acl;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->item:Lo/acl;

    .line 116
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    .line 117
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 118
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->item:Lo/acl;

    move-object v7, v0

    check-cast v7, Lo/acp;

    .line 119
    new-instance v0, Lo/afj;

    invoke-direct {v0}, Lo/afj;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    .line 120
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v1

    invoke-virtual {v7}, Lo/acp;->a()Ljava/lang/String;

    move-result-object v2

    const-string v3, "SHA-256"

    invoke-virtual {v1, v2, v3}, Lo/afq;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afj;->d(Ljava/lang/String;)V

    .line 121
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    const-string v1, "ic_heartrate_devices"

    invoke-virtual {v7}, Lo/acp;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7}, Lo/acp;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/afj;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Lo/afj;->a(Ljava/lang/String;)V

    .line 123
    new-instance v8, Lo/acf$d;

    invoke-direct {v8}, Lo/acf$d;-><init>()V

    .line 124
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lo/acf$d;->b(I)Lo/acf$d;

    .line 125
    const-string v0, "10"

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v8, v0, v1}, Lo/acf$d;->e(ILjava/util/concurrent/TimeUnit;)Lo/acf$d;

    .line 126
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    invoke-virtual {v8}, Lo/acf$d;->d()Lo/acf;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afj;->e(Lo/acf;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->measure_kit:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afj;->b(Ljava/lang/String;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    const-string v1, "scan_kind"

    invoke-virtual {v6, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/acl$a;->valueOf(Ljava/lang/String;)Lo/acl$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afj;->b(Lo/acl$a;)V

    .line 130
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBindWaitingFragment pair is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    iget-object v3, v3, Lo/afj;->f:Lo/acf;

    invoke-virtual {v3}, Lo/acf;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->i()Lo/acf;

    move-result-object v0

    invoke-virtual {v0}, Lo/acf;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "yes"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 132
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    invoke-virtual {v0}, Lo/agc;->b()Z

    move-result v7

    .line 133
    if-eqz v7, :cond_2

    .line 134
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    invoke-virtual {v2}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->item:Lo/acl;

    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mBindingStatusCallback:Lo/aby;

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/afd;->b(Ljava/lang/String;Ljava/lang/String;Lo/acl;Lo/aby;)Z

    goto/16 :goto_0

    .line 136
    :cond_2
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->item:Lo/acl;

    invoke-virtual {v1}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v8

    .line 137
    invoke-virtual {v8}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_3

    .line 139
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NOT BOND_BONDED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0, v8}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->createBond(Ljava/lang/Class;Landroid/bluetooth/BluetoothDevice;)Z

    .line 142
    new-instance v9, Landroid/content/IntentFilter;

    invoke-direct {v9}, Landroid/content/IntentFilter;-><init>()V

    .line 143
    const-string v0, "android.bluetooth.device.action.BOND_STATE_CHANGED"

    invoke-virtual {v9, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 144
    new-instance v0, Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

    invoke-direct {v0, v8}, Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->bleDeviceHelper:Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

    .line 145
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->bleDeviceHelper:Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mBindingStatusCallback:Lo/aby;

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;->a(Lo/aby;)V

    .line 147
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->bleDeviceHelper:Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

    invoke-virtual {v0, v1, v9}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    goto :goto_0

    .line 149
    :catch_0
    move-exception v9

    .line 150
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setPiN failed!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    goto :goto_0

    .line 153
    :cond_3
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    invoke-virtual {v2}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->item:Lo/acl;

    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mBindingStatusCallback:Lo/aby;

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/afd;->b(Ljava/lang/String;Ljava/lang/String;Lo/acl;Lo/aby;)Z

    .line 156
    :goto_0
    goto :goto_1

    .line 157
    :cond_4
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    invoke-virtual {v2}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->item:Lo/acl;

    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mBindingStatusCallback:Lo/aby;

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/afd;->b(Ljava/lang/String;Ljava/lang/String;Lo/acl;Lo/aby;)Z

    .line 159
    :goto_1
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    .line 247
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceBindWaitingFragment onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/ViewGroup;

    .line 249
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_measure_bind_device:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    .line 250
    sget v0, Lcom/huawei/plugindevice/R$id;->device_measure_search_prompt:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 251
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_device_bind_pb:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lhuawei/widget/HwProgressBar;

    .line 252
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 254
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 255
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_plugin_device_weight_device_pair_tip:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/app/Application;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 256
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->startTimer()V

    goto :goto_0

    .line 258
    :cond_0
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_waiting_for_binding:I

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(I)V

    .line 261
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 262
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 263
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 265
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->mTitle:Ljava/lang/String;

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/BaseFragment;->setTitle(Ljava/lang/String;)V

    .line 266
    return-object v5
.end method

.method public onDestroy()V
    .locals 2

    .line 271
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    if-eqz v0, :cond_0

    .line 272
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->productInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->i()Lo/acf;

    move-result-object v0

    invoke-virtual {v0}, Lo/acf;->e()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 273
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->f()Z

    .line 276
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->bleDeviceHelper:Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

    if-eqz v0, :cond_1

    .line 277
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->bleDeviceHelper:Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 280
    :cond_1
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 281
    return-void
.end method
