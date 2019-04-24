.class public abstract Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyTimerTask;,
        Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;
    }
.end annotation


# static fields
.field private static final DEVICE_AVAILABLE:Ljava/lang/String; = "com.huawei.health.action.DEVICE_AVAILABLE"

.field private static final MEASURE_TIME_UPPER_LIMIT:J = 0x1d4c0L

.field private static final OVERTIME_MEASURE:I = 0x0

.field private static handler:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler; = null


# instance fields
.field iHealthDeviceCallback:Lo/abx;

.field private mAnimationHandler:Lo/agf;

.field protected mArgs:Landroid/os/Bundle;

.field mControl:Lo/afv;

.field private mCurrentImg:I

.field mHealthDevice:Lo/acl;

.field private mImgArray:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Object;>;"
        }
    .end annotation
.end field

.field private mImgGuide:Landroid/widget/ImageView;

.field protected mKind:Ljava/lang/String;

.field protected mProductId:Ljava/lang/String;

.field protected mStatus:Z

.field protected mType:I

.field private timer:Ljava/util/Timer;

.field private timerTask:Ljava/util/TimerTask;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 57
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 63
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mCurrentImg:I

    .line 70
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mArgs:Landroid/os/Bundle;

    .line 364
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->iHealthDeviceCallback:Lo/abx;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->restartTimer()V

    return-void
.end method

.method static synthetic access$200()Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;
    .locals 1

    .line 57
    sget-object v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->handler:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;

    return-object v0
.end method

.method private cancelGuideImgAnimation()V
    .locals 4

    .line 247
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment cancelGuideImgAnimation()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mCurrentImg:I

    .line 249
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mAnimationHandler:Lo/agf;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mAnimationHandler:Lo/agf;

    const/16 v1, 0x3e2

    invoke-virtual {v0, v1}, Lo/agf;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 250
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mAnimationHandler:Lo/agf;

    const/16 v1, 0x3e2

    invoke-virtual {v0, v1}, Lo/agf;->removeMessages(I)V

    .line 252
    :cond_0
    return-void
.end method

.method private doStartMeasure(Z)V
    .locals 5

    .line 345
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mControl:Lo/afv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 347
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mType:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 348
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mArgs:Landroid/os/Bundle;

    const-string v1, "type"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    .line 350
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mArgs:Landroid/os/Bundle;

    const-string v1, "type"

    const/4 v2, -0x4

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 353
    :goto_0
    if-eqz p1, :cond_2

    .line 354
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->iHealthDeviceCallback:Lo/abx;

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mArgs:Landroid/os/Bundle;

    invoke-virtual {v3}, Landroid/os/Bundle;->size()I

    move-result v3

    if-lez v3, :cond_1

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mArgs:Landroid/os/Bundle;

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/afd;->c(Ljava/lang/String;Lo/abx;Landroid/os/Bundle;Z)Z

    goto :goto_3

    .line 356
    :cond_2
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->iHealthDeviceCallback:Lo/abx;

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mArgs:Landroid/os/Bundle;

    invoke-virtual {v3}, Landroid/os/Bundle;->size()I

    move-result v3

    if-lez v3, :cond_3

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mArgs:Landroid/os/Bundle;

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    invoke-virtual {v0, v1, v2, v3}, Lo/afd;->a(Ljava/lang/String;Lo/abx;Landroid/os/Bundle;)Z

    .line 358
    :goto_3
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment doStartMeasure prepare is:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_5

    .line 360
    :cond_4
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->iHealthDeviceCallback:Lo/abx;

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mArgs:Landroid/os/Bundle;

    invoke-virtual {v3}, Landroid/os/Bundle;->size()I

    move-result v3

    if-lez v3, :cond_5

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mArgs:Landroid/os/Bundle;

    goto :goto_4

    :cond_5
    const/4 v3, 0x0

    :goto_4
    invoke-virtual {v0, v1, v2, v3}, Lo/afd;->a(Ljava/lang/String;Lo/abx;Landroid/os/Bundle;)Z

    .line 362
    :goto_5
    return-void
.end method

.method private doStartMeasureUniversal()V
    .locals 4

    .line 276
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;)V

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mArgs:Landroid/os/Bundle;

    .line 337
    invoke-virtual {v3}, Landroid/os/Bundle;->size()I

    move-result v3

    if-lez v3, :cond_0

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mArgs:Landroid/os/Bundle;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 276
    :goto_0
    invoke-virtual {v0, v1, v2, v3}, Lo/afd;->a(Ljava/lang/String;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Landroid/os/Bundle;)Z

    .line 338
    return-void
.end method

.method private lightTheScreen()V
    .locals 3

    .line 205
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    const/16 v2, 0x80

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 207
    return-void
.end method

.method private prepareStartTimer()V
    .locals 6

    .line 529
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    check-cast v2, Lcom/huawei/health/device/ui/DeviceMainActivity;

    invoke-direct {v0, v1, v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;-><init>(Landroid/os/Looper;Lcom/huawei/health/device/ui/DeviceMainActivity;Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;)V

    sput-object v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->handler:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;

    .line 531
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyTimerTask;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyTimerTask;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->timerTask:Ljava/util/TimerTask;

    .line 532
    const-class v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    monitor-enter v4

    .line 533
    :try_start_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->timer:Ljava/util/Timer;

    .line 534
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment start Timer"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 535
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->timer:Ljava/util/Timer;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->timerTask:Ljava/util/TimerTask;

    const-wide/32 v2, 0x1d4c0

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 536
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 537
    :goto_0
    return-void
.end method

.method private restartTimer()V
    .locals 6

    .line 554
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->timerTask:Ljava/util/TimerTask;

    if-eqz v0, :cond_1

    .line 555
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->timerTask:Ljava/util/TimerTask;

    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 557
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyTimerTask;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyTimerTask;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->timerTask:Ljava/util/TimerTask;

    .line 558
    const-class v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    monitor-enter v4
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 559
    :try_start_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->timer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 560
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->timer:Ljava/util/Timer;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->timerTask:Ljava/util/TimerTask;

    const-wide/32 v2, 0x1d4c0

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 562
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    :try_start_2
    throw v5
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    .line 567
    :cond_1
    :goto_0
    goto :goto_1

    .line 564
    :catch_0
    move-exception v4

    .line 565
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "restartTimer IllegalStateException "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 566
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->prepareStartTimer()V

    .line 568
    :goto_1
    return-void
.end method

.method private showGuideImgAnimation()V
    .locals 7

    .line 210
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment showGuideImgAnimation()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 214
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mImgArray:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mImgArray:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 215
    :cond_0
    return-void

    .line 218
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mImgArray:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mCurrentImg:I

    if-ne v0, v1, :cond_2

    .line 219
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mCurrentImg:I

    .line 221
    :cond_2
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMeasureGuideFragment showGuideImgAnimation() mImgArray size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mImgArray:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mImgArray:Ljava/util/ArrayList;

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mCurrentImg:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 223
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mCurrentImg:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mCurrentImg:I

    .line 224
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMeasureGuideFragment showGuideImgAnimation() mCurrentImgId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    instance-of v0, v6, Ljava/lang/Integer;

    if-eqz v0, :cond_3

    .line 227
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mImgGuide:Landroid/widget/ImageView;

    move-object v1, v6

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 229
    :cond_3
    instance-of v0, v6, Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 230
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mImgGuide:Landroid/widget/ImageView;

    move-object v1, v6

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lo/afo;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 233
    :cond_4
    new-instance v0, Lo/agf;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mainActivity:Landroid/app/Activity;

    iget v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mCurrentImg:I

    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mImgGuide:Landroid/widget/ImageView;

    iget-object v5, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mImgArray:Ljava/util/ArrayList;

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lo/agf;-><init>(Landroid/app/Activity;Ljava/lang/Object;ILandroid/widget/ImageView;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mAnimationHandler:Lo/agf;

    .line 234
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mAnimationHandler:Lo/agf;

    const/16 v1, 0x3e2

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Lo/agf;->sendEmptyMessageDelayed(IJ)Z

    .line 235
    return-void
.end method


# virtual methods
.method protected getMode()Lo/aha;
    .locals 1

    .line 173
    const/4 v0, 0x0

    return-object v0
.end method

.method protected getOnClickListener()Landroid/view/View$OnClickListener;
    .locals 1

    .line 238
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;)V

    return-object v0
.end method

.method protected abstract handleDataChangedInUiThread(Lo/acl;Lo/afz;Z)V
.end method

.method protected abstract handleDataChangedInUiThreadUniversal(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;Z)V
.end method

.method protected abstract handleFailedEventInUiThread(Lo/acl;I)V
.end method

.method protected abstract handleStatusChangedInUiThread(Lo/acl;I)V
.end method

.method protected abstract handleStatusChangedInUiThreadUniversal(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
.end method

.method protected initView(Ljava/lang/Object;)V
    .locals 7

    .line 177
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->lightTheScreen()V

    .line 179
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->child:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 180
    instance-of v0, p1, Lo/aha;

    if-eqz v0, :cond_1

    .line 181
    move-object v4, p1

    check-cast v4, Lo/aha;

    .line 182
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_guide_img_prompt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mImgGuide:Landroid/widget/ImageView;

    .line 184
    invoke-virtual {v4}, Lo/aha;->c()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mImgArray:Ljava/util/ArrayList;

    .line 186
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_measure_guide_tv_prompt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 187
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 188
    invoke-virtual {v4}, Lo/aha;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    const/16 v0, 0x11

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 191
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->bt_device_measure_guide_next:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/egd;

    .line 192
    invoke-virtual {v4}, Lo/aha;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 193
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/egd;->setVisibility(I)V

    .line 194
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->getOnClickListener()Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 196
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Lo/egd;->setVisibility(I)V

    .line 199
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->showGuideImgAnimation()V

    .line 202
    :cond_1
    return-void
.end method

.method public onBackPressed()Z
    .locals 5

    .line 150
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mControl:Lo/afv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 151
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 152
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    const-string v0, "type"

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mType:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 154
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment onDestroy mControl is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mControl:Lo/afv;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mHealthDevice:Lo/acl;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v4}, Lo/afv;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z

    .line 159
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 160
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    iget v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mType:I

    invoke-virtual {v0, v1, v2}, Lo/afd;->e(Ljava/lang/String;I)V

    .line 162
    :cond_1
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->popupFragment(Ljava/lang/Class;)V

    .line 163
    const/4 v0, 0x0

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .line 89
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 91
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_operation_guide:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->child:Landroid/view/View;

    .line 92
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    .line 93
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "kind"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mKind:Ljava/lang/String;

    .line 94
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mType:I

    .line 95
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "status"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mStatus:Z

    .line 98
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->getMode()Lo/aha;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 99
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment getMode() is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "DeviceMeasureOperateModel"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v5

    .line 101
    if-nez v5, :cond_0

    .line 102
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment onCreateView serializable = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 104
    :cond_0
    invoke-virtual {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->initView(Ljava/lang/Object;)V

    .line 106
    :goto_0
    goto :goto_1

    .line 107
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment getMode() is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->getMode()Lo/aha;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->initView(Ljava/lang/Object;)V

    .line 110
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 111
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mHealthDevice:Lo/acl;

    .line 112
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v5

    .line 113
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/afd;->a(Ljava/lang/String;)Lo/afx;

    move-result-object v6

    .line 114
    invoke-virtual {v6}, Lo/afx;->e()Lo/afv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mControl:Lo/afv;

    .line 116
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 117
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->child:Landroid/view/View;

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 119
    :cond_3
    return-object v4
.end method

.method public onDestroy()V
    .locals 4

    .line 130
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment stop Timer"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->stopTimer()V

    .line 133
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    const-string v2, "com.huawei.health.action.DEVICE_AVAILABLE"

    invoke-virtual {v0, v1, v2}, Lo/afd;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 136
    :cond_0
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    const-string v2, "com.huawei.health.action.DEVICE_AVAILABLE"

    invoke-virtual {v0, v1, v2}, Lo/afd;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    :goto_0
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->iHealthDeviceCallback:Lo/abx;

    invoke-virtual {v0, v1}, Lo/adn;->b(Lo/abx;)V

    .line 140
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 141
    return-void
.end method

.method public onPause()V
    .locals 0

    .line 123
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onPause()V

    .line 124
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->cancelGuideImgAnimation()V

    .line 125
    return-void
.end method

.method public release()V
    .locals 0

    .line 145
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->release()V

    .line 146
    return-void
.end method

.method public saveResultData()V
    .locals 0

    .line 168
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->saveResultData()V

    .line 169
    return-void
.end method

.method protected startMeasure()V
    .locals 1

    .line 255
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->startMeasure(Z)V

    .line 256
    return-void
.end method

.method protected startMeasure(Z)V
    .locals 2

    .line 259
    invoke-static {}, Lo/agl;->e()Lo/agl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/agl;->c(Ljava/lang/String;)V

    .line 260
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 262
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->prepareStartTimer()V

    .line 263
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 265
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->doStartMeasureUniversal()V

    goto :goto_0

    .line 267
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->doStartMeasure(Z)V

    .line 270
    :cond_1
    :goto_0
    return-void
.end method

.method protected stopTimer()V
    .locals 3

    .line 540
    const-class v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    monitor-enter v1

    .line 541
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->timer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 542
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 543
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->timer:Ljava/util/Timer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 545
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 546
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->timerTask:Ljava/util/TimerTask;

    if-eqz v0, :cond_1

    .line 547
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->timerTask:Ljava/util/TimerTask;

    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 548
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->timerTask:Ljava/util/TimerTask;

    .line 550
    :cond_1
    return-void
.end method
