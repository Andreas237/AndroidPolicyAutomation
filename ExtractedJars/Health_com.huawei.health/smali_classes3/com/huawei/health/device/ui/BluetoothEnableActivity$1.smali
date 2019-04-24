.class Lcom/huawei/health/device/ui/BluetoothEnableActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/BluetoothEnableActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/device/ui/BluetoothEnableActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/BluetoothEnableActivity;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/health/device/ui/BluetoothEnableActivity$1;->b:Lcom/huawei/health/device/ui/BluetoothEnableActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 50
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 51
    const/4 v0, 0x1

    iput v0, v1, Landroid/os/Message;->what:I

    .line 52
    const-string v0, "cancelEnableBluetooth"

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 53
    const-string v0, "PluginDevice_PluginDevice"

    invoke-static {v0, v1}, Lo/ahj;->d(Ljava/lang/String;Landroid/os/Message;)V

    .line 54
    iget-object v0, p0, Lcom/huawei/health/device/ui/BluetoothEnableActivity$1;->b:Lcom/huawei/health/device/ui/BluetoothEnableActivity;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/BluetoothEnableActivity;->finish()V

    .line 55
    return-void
.end method
