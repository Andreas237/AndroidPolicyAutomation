.class Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/bluetooth/BluetoothProfile$ServiceListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$2;->a:Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(ILandroid/bluetooth/BluetoothProfile;)V
    .locals 5

    .line 85
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClassicDevice onServiceConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 87
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClassicDevice onServiceConnected HEADSET"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    iget-object v0, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$2;->a:Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;

    move-object v1, p2

    check-cast v1, Landroid/bluetooth/BluetoothHeadset;

    invoke-static {v0, v1}, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->b(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;Landroid/bluetooth/BluetoothHeadset;)Landroid/bluetooth/BluetoothHeadset;

    .line 89
    iget-object v0, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$2;->a:Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;

    iget-object v1, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$2;->a:Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;

    invoke-static {v1}, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->a(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;)Landroid/bluetooth/BluetoothHeadset;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$2;->a:Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;

    invoke-static {v2}, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->b(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->d(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;Landroid/bluetooth/BluetoothHeadset;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v4

    .line 90
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ClassicDevice connectHSP returnValue is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    :cond_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$2;->a:Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;

    invoke-static {v1}, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->a(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;)Landroid/bluetooth/BluetoothHeadset;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/bluetooth/BluetoothAdapter;->closeProfileProxy(ILandroid/bluetooth/BluetoothProfile;)V

    .line 94
    return-void
.end method

.method public onServiceDisconnected(I)V
    .locals 2

    .line 98
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$2;->a:Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->b(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;Landroid/bluetooth/BluetoothHeadset;)Landroid/bluetooth/BluetoothHeadset;

    .line 101
    :cond_0
    return-void
.end method
