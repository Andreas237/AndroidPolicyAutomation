.class Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;
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

    .line 28
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 31
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 32
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 34
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->access$001(Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;Z)V

    .line 35
    .line 39
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
    .end sparse-switch
.end method
