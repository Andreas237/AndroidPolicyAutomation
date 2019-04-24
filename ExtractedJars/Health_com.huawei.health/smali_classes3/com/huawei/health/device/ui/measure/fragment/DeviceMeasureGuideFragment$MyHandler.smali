.class Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MyHandler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/health/device/ui/DeviceMainActivity;>;"
    }
.end annotation


# instance fields
.field private mWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lcom/huawei/health/device/ui/DeviceMainActivity;Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;)V
    .locals 1

    .line 469
    invoke-direct {p0, p1, p2}, Lo/dbb;-><init>(Landroid/os/Looper;Ljava/lang/Object;)V

    .line 467
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;->mWeakReference:Ljava/lang/ref/WeakReference;

    .line 470
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;->mWeakReference:Ljava/lang/ref/WeakReference;

    .line 471
    return-void
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;)Ljava/lang/ref/WeakReference;
    .locals 1

    .line 465
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;->mWeakReference:Ljava/lang/ref/WeakReference;

    return-object v0
.end method


# virtual methods
.method protected handleMessageWhenReferenceNotNull(Lcom/huawei/health/device/ui/DeviceMainActivity;Landroid/os/Message;)V
    .locals 6

    .line 475
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 478
    :sswitch_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment prepareStartTimer receive msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    new-instance v5, Lo/egy$b;

    invoke-direct {v5, p1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 482
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_overtime:I

    invoke-virtual {v5, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    .line 483
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_permisson:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;Lcom/huawei/health/device/ui/DeviceMainActivity;)V

    invoke-virtual {v5, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 499
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 500
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egy;->setCancelable(Z)V

    .line 501
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 503
    .line 507
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
    .end sparse-switch
.end method

.method public bridge synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 465
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/DeviceMainActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;->handleMessageWhenReferenceNotNull(Lcom/huawei/health/device/ui/DeviceMainActivity;Landroid/os/Message;)V

    return-void
.end method
