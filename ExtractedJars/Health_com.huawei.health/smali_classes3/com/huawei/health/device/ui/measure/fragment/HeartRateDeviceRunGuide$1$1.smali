.class Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 68
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enable bluetooth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->enable()Z

    .line 70
    invoke-static {}, Lo/aca;->e()Lo/aca;

    move-result-object v0

    invoke-virtual {v0}, Lo/aca;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/abw;

    .line 71
    if-nez v4, :cond_0

    .line 72
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginDeviceAdapter can not be null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    return-void

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-interface {v4, v0}, Lo/abw;->d(Landroid/content/Context;)V

    .line 76
    return-void
.end method
