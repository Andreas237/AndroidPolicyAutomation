.class public Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$a;
    }
.end annotation


# instance fields
.field private a:Lo/aby;

.field private b:Landroid/bluetooth/BluetoothDevice;

.field private c:Landroid/bluetooth/BluetoothProfile$ServiceListener;

.field private d:Landroid/bluetooth/BluetoothDevice;

.field private e:Landroid/bluetooth/BluetoothHeadset;


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 82
    new-instance v0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$2;-><init>(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;)V

    iput-object v0, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->c:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    .line 38
    iput-object p1, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->b:Landroid/bluetooth/BluetoothDevice;

    .line 39
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;)Landroid/bluetooth/BluetoothHeadset;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->e:Landroid/bluetooth/BluetoothHeadset;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;)Landroid/bluetooth/BluetoothDevice;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->d:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;Landroid/bluetooth/BluetoothHeadset;)Landroid/bluetooth/BluetoothHeadset;
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->e:Landroid/bluetooth/BluetoothHeadset;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;)Lo/aby;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->a:Lo/aby;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;Landroid/bluetooth/BluetoothHeadset;Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1

    .line 20
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->e(Landroid/bluetooth/BluetoothHeadset;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    return v0
.end method

.method private e(Landroid/bluetooth/BluetoothHeadset;Landroid/bluetooth/BluetoothDevice;)Z
    .locals 8

    .line 105
    if-eqz p1, :cond_0

    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    .line 107
    const/4 v5, 0x0

    .line 108
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    .line 110
    const-string v0, "connect"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Landroid/bluetooth/BluetoothDevice;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 111
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-virtual {v5, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2

    move-object v6, v0

    .line 118
    goto :goto_0

    .line 112
    :catch_0
    move-exception v7

    .line 113
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/NoSuchMethodException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    goto :goto_0

    .line 114
    :catch_1
    move-exception v7

    .line 115
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    goto :goto_0

    .line 116
    :catch_2
    move-exception v7

    .line 117
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/reflect/InvocationTargetException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    :goto_0
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 121
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClassicDevice connectHSP hsp is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public b(Lo/aby;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->a:Lo/aby;

    .line 35
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 28
    iget-object v0, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 30
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 43
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ClassicDevice receive broadcast "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 45
    const-string v0, "android.bluetooth.device.action.BOND_STATE_CHANGED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 48
    const-string v0, "android.bluetooth.device.extra.DEVICE"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/bluetooth/BluetoothDevice;

    .line 49
    if-nez v5, :cond_0

    .line 50
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClassicDevice BroadcastReceiver device = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    return-void

    .line 54
    :cond_0
    :try_start_1
    invoke-virtual {v5}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 55
    iget-object v0, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->a:Lo/aby;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 56
    invoke-virtual {v5}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_1

    .line 57
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClassicDevice is bonded"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    iget-object v0, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->b:Landroid/bluetooth/BluetoothDevice;

    iput-object v0, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->d:Landroid/bluetooth/BluetoothDevice;

    .line 59
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->c:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothAdapter;->getProfileProxy(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    .line 60
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ClassicDevice getProfileProxy result "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    new-instance v0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$a;-><init>(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$2;)V

    const/16 v1, 0x1f4

    invoke-static {v0, v1}, Lo/ahj;->a(Ljava/lang/Runnable;I)Ljava/util/concurrent/ScheduledFuture;

    .line 64
    goto :goto_0

    :cond_1
    invoke-virtual {v5}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_2

    .line 65
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClassicDevice is bond_none"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    iget-object v0, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->a:Lo/aby;

    const/16 v1, 0x8

    invoke-interface {v0, v1}, Lo/aby;->onStateChanged(I)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 72
    :cond_2
    :goto_0
    goto :goto_1

    .line 70
    :catch_0
    move-exception v5

    .line 71
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    :cond_3
    :goto_1
    return-void
.end method
