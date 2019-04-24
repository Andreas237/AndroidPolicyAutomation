.class Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyTimerTask;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MyTimerTask"
.end annotation


# instance fields
.field productId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 514
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 515
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyTimerTask;->productId:Ljava/lang/String;

    .line 516
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 520
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment prepareStartTimer send msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    invoke-static {}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->access$200()Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;->sendEmptyMessage(I)Z

    .line 524
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyTimerTask;->productId:Ljava/lang/String;

    const-string v2, "com.huawei.health.action.DEVICE_AVAILABLE"

    invoke-virtual {v0, v1, v2}, Lo/afd;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 525
    return-void
.end method
