.class Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->startMeasure()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 80
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "goback"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "honour_device"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->onBackPressed()Z

    goto :goto_0

    .line 84
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->popupFragment(Ljava/lang/Class;)V

    .line 86
    :goto_0
    return-void
.end method
