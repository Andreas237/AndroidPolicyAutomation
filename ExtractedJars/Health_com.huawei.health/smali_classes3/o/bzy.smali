.class public Lo/bzy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cbk;


# static fields
.field private static a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const-string v0, "HWDeviceManager"

    sput-object v0, Lo/bzy;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Z
    .locals 5

    .line 103
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dde;->b(Ljava/util/List;)Z

    move-result v4

    .line 104
    sget-object v0, Lo/bzy;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isBindedHeartRateDeviceWear()="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    return v4
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 5

    .line 218
    if-nez p0, :cond_0

    .line 219
    sget-object v0, Lo/bzy;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isIndependentSportDevice context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    const/4 v0, 0x0

    return v0

    .line 222
    :cond_0
    invoke-static {p0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 223
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 226
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dat;->e(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 227
    sget-object v0, Lo/bzy;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isIndependentSportDevice()=true, isSupportHeartRate Wear=true, realtime_hearrate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    const/4 v0, 0x1

    return v0

    .line 233
    :cond_1
    sget-object v0, Lo/bzy;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isIndependentSportDevice()=false, failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 5

    .line 137
    const/4 v3, 0x0

    .line 138
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 139
    const-string v0, "SWITCH_PLUGINDEVICE"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 140
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 141
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 143
    const-string v0, "kind"

    const-string v1, "HDK_HEART_RATE"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 144
    const-string v0, "view"

    const-string v1, "ListDevice"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 145
    const-string v0, "notHeartRateDeviceList"

    invoke-virtual {v4, v0, v3}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 146
    const-string v0, "isHeartRateDevice"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 147
    const-string v0, "isFromFitnessAdvice"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 148
    const-string v0, "title"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_run_workout_selection_devices:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 149
    invoke-virtual {p0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 150
    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 4

    .line 124
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 125
    const-string v0, "SWITCH_PLUGINDEVICE"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 126
    const-string v0, "com.huawei.health"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 127
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 129
    const-string v0, "isHeartRateDevice"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 130
    const-string v0, "arg1"

    const-string v1, "DeviceList"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 131
    const-string v0, "isFromFitnessAdvice"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 132
    const-string v0, "title"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_run_workout_selection_devices:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 133
    invoke-virtual {p0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 134
    return-void
.end method

.method public static c()Z
    .locals 6

    .line 110
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dde;->b(Ljava/util/List;)Z

    move-result v4

    .line 111
    sget-object v0, Lo/bzy;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isBindedHeartRateDeviceAll() wear="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    if-eqz v4, :cond_0

    .line 113
    const/4 v0, 0x1

    return v0

    .line 115
    :cond_0
    invoke-static {}, Lo/bzy;->e()Z

    move-result v5

    .line 116
    sget-object v0, Lo/bzy;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isBindedHeartRateDeviceAll() other="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    if-eqz v5, :cond_1

    .line 118
    const/4 v0, 0x1

    return v0

    .line 120
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static c(Landroid/content/Context;Z)Z
    .locals 5

    .line 82
    if-nez p1, :cond_0

    .line 83
    sget-object v0, Lo/bzy;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isConnectedHeartRateDeviceWear()=false, bluetoothIsEnabled=false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    const/4 v0, 0x0

    return v0

    .line 87
    :cond_0
    invoke-static {p0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 88
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 91
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dat;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 92
    sget-object v0, Lo/bzy;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isConnectedHeartRateDeviceWear()=true, isSupportHeartRate Wear=true, realtime_hearrate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    const/4 v0, 0x1

    return v0

    .line 98
    :cond_1
    sget-object v0, Lo/bzy;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isConnectedHeartRateDeviceWear()=false, failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Landroid/content/Context;Z)Z
    .locals 6

    .line 35
    if-nez p1, :cond_0

    .line 36
    sget-object v0, Lo/bzy;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isConnectedHeartRateDeviceAll()=false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "bluetoothIsEnabled = false"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    const/4 v0, 0x0

    return v0

    .line 40
    :cond_0
    invoke-static {p0, p1}, Lo/bzy;->c(Landroid/content/Context;Z)Z

    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    const/4 v0, 0x1

    return v0

    .line 45
    :cond_1
    invoke-static {}, Lo/bzy;->e()Z

    move-result v5

    .line 46
    if-eqz v5, :cond_2

    .line 47
    const/4 v0, 0x1

    return v0

    .line 50
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static e()Z
    .locals 5

    .line 54
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    invoke-virtual {v0, v1}, Lo/afd;->b(Lo/acl$a;)Ljava/util/ArrayList;

    move-result-object v4

    .line 72
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 73
    sget-object v0, Lo/bzy;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isConnectedHeartRateDeviceOther() = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    const/4 v0, 0x1

    return v0

    .line 77
    :cond_0
    sget-object v0, Lo/bzy;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isConnectedHeartRateDeviceOther() = fale"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public b()Z
    .locals 2

    .line 153
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 154
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    return v0

    .line 156
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()Landroid/os/Bundle;
    .locals 7

    .line 161
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 162
    const/4 v5, 0x0

    .line 163
    const/4 v6, 0x0

    .line 164
    invoke-static {}, Lo/bzy;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    const/4 v5, 0x1

    .line 167
    :cond_0
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lo/bzy;->b()Z

    move-result v1

    invoke-static {v0, v1}, Lo/bzy;->d(Landroid/content/Context;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 168
    const/4 v6, 0x1

    .line 170
    :cond_1
    const-string v0, "isBindedHeartRateDeviceAll"

    invoke-virtual {v4, v0, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 171
    const-string v0, "isConnectedHeartRateDeviceAll"

    invoke-virtual {v4, v0, v6}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 172
    sget-object v0, Lo/bzy;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartRateDeviceState , bundle = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    return-object v4
.end method
