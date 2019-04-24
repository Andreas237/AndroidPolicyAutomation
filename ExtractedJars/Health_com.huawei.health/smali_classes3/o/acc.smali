.class public Lo/acc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lo/aby;

.field c:Landroid/content/BroadcastReceiver;

.field private d:Ljava/util/concurrent/ScheduledFuture;

.field private e:Lo/ace;

.field private f:I

.field private g:Ljava/lang/Runnable;

.field private h:Z

.field private i:Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

.field private final k:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acc;->e:Lo/ace;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acc;->b:Lo/aby;

    .line 33
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/acc;->a:Ljava/lang/Object;

    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/acc;->h:Z

    .line 39
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/acc;->k:Ljava/lang/Object;

    .line 198
    new-instance v0, Lo/acc$1;

    invoke-direct {v0, p0}, Lo/acc$1;-><init>(Lo/acc;)V

    iput-object v0, p0, Lo/acc;->g:Ljava/lang/Runnable;

    .line 211
    new-instance v0, Lo/acc$4;

    invoke-direct {v0, p0}, Lo/acc$4;-><init>(Lo/acc;)V

    iput-object v0, p0, Lo/acc;->i:Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

    .line 234
    new-instance v0, Lo/acc$5;

    invoke-direct {v0, p0}, Lo/acc$5;-><init>(Lo/acc;)V

    iput-object v0, p0, Lo/acc;->c:Landroid/content/BroadcastReceiver;

    .line 44
    return-void
.end method

.method static synthetic a(Lo/acc;)Lo/aby;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/acc;->b:Lo/aby;

    return-object v0
.end method

.method private a()V
    .locals 2

    .line 182
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v1

    .line 183
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 184
    iget-object v0, p0, Lo/acc;->i:Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

    invoke-virtual {v1, v0}, Landroid/bluetooth/BluetoothAdapter;->stopLeScan(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)V

    .line 186
    :cond_0
    return-void
.end method

.method static synthetic a(Lo/acc;Lo/acl;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lo/acc;->d(Lo/acl;)V

    return-void
.end method

.method static synthetic b(Lo/acc;)Ljava/lang/Object;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/acc;->a:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lo/acc;Lo/aby;)Lo/aby;
    .locals 0

    .line 29
    iput-object p1, p0, Lo/acc;->b:Lo/aby;

    return-object p1
.end method

.method private b()Z
    .locals 10

    .line 120
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v4

    .line 122
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 123
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanner begin scan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "bluetooth"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/bluetooth/BluetoothManager;

    .line 126
    const/4 v0, 0x7

    invoke-virtual {v5, v0}, Landroid/bluetooth/BluetoothManager;->getConnectedDevices(I)Ljava/util/List;

    move-result-object v6

    .line 128
    if-eqz v6, :cond_1

    .line 129
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getConnectedDevices = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 132
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/bluetooth/BluetoothDevice;

    .line 133
    if-eqz v8, :cond_0

    iget-object v0, p0, Lo/acc;->e:Lo/ace;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/acc;->e:Lo/ace;

    invoke-virtual {v0, v8}, Lo/ace;->d(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    invoke-static {v8}, Lo/acg;->c(Landroid/bluetooth/BluetoothDevice;)Lo/acg;

    move-result-object v9

    .line 135
    invoke-virtual {v9}, Lo/acg;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 136
    invoke-direct {p0, v9}, Lo/acc;->d(Lo/acl;)V

    .line 131
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 142
    :cond_1
    iget-object v0, p0, Lo/acc;->i:Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

    invoke-virtual {v4, v0}, Landroid/bluetooth/BluetoothAdapter;->startLeScan(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z

    move-result v0

    return v0

    .line 144
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private c()Z
    .locals 6

    .line 148
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v4

    .line 149
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 151
    const-string v0, "android.bluetooth.device.action.FOUND"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 152
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "scanClassicDevice registerReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/acc;->c:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v5}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 155
    new-instance v0, Lo/acc$3;

    invoke-direct {v0, p0}, Lo/acc$3;-><init>(Lo/acc;)V

    invoke-static {v0}, Lo/ahj;->c(Ljava/lang/Runnable;)V

    .line 176
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothAdapter;->startDiscovery()Z

    move-result v0

    return v0

    .line 178
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private d()V
    .locals 4

    .line 93
    iget-object v2, p0, Lo/acc;->k:Ljava/lang/Object;

    monitor-enter v2

    .line 95
    :try_start_0
    iget-boolean v0, p0, Lo/acc;->h:Z

    if-eqz v0, :cond_2

    .line 97
    iget v0, p0, Lo/acc;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 98
    invoke-direct {p0}, Lo/acc;->a()V

    goto :goto_0

    .line 99
    :cond_0
    iget v0, p0, Lo/acc;->f:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 100
    invoke-direct {p0}, Lo/acc;->i()V

    .line 103
    :cond_1
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/acc;->h:Z

    .line 105
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acc;->e:Lo/ace;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    :cond_2
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 108
    :goto_1
    return-void
.end method

.method static synthetic d(Lo/acc;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lo/acc;->d()V

    return-void
.end method

.method private d(Lo/acl;)V
    .locals 6

    .line 111
    iget-object v4, p0, Lo/acc;->a:Ljava/lang/Object;

    monitor-enter v4

    .line 112
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceScanner onDeviceFound: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/acl;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    iget-object v0, p0, Lo/acc;->b:Lo/aby;

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lo/acc;->b:Lo/aby;

    invoke-interface {v0, p1}, Lo/aby;->onDeviceFound(Lo/acl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 117
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/acc;)Lo/ace;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/acc;->e:Lo/ace;

    return-object v0
.end method

.method private i()V
    .locals 5

    .line 189
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v4

    .line 190
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothAdapter;->isDiscovering()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 191
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "scanClassicDevice unregisterReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothAdapter;->cancelDiscovery()Z

    .line 193
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/acc;->c:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 196
    :cond_0
    return-void
.end method


# virtual methods
.method public c(Lo/acf;Lo/ace;Lo/aby;)Ljava/lang/Boolean;
    .locals 7

    .line 48
    iput-object p2, p0, Lo/acc;->e:Lo/ace;

    .line 49
    iget-object v4, p0, Lo/acc;->a:Ljava/lang/Object;

    monitor-enter v4

    .line 50
    :try_start_0
    iput-object p3, p0, Lo/acc;->b:Lo/aby;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 53
    :goto_0
    invoke-virtual {p1}, Lo/acf;->e()I

    move-result v0

    iput v0, p0, Lo/acc;->f:I

    .line 55
    iget v0, p0, Lo/acc;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 56
    invoke-direct {p0}, Lo/acc;->b()Z

    goto :goto_1

    .line 57
    :cond_0
    iget v0, p0, Lo/acc;->f:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 58
    invoke-direct {p0}, Lo/acc;->c()Z

    goto :goto_1

    .line 59
    :cond_1
    iget v0, p0, Lo/acc;->f:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 60
    if-eqz p3, :cond_2

    .line 61
    new-instance v4, Lo/ach;

    invoke-direct {v4}, Lo/ach;-><init>()V

    .line 62
    invoke-interface {p3, v4}, Lo/aby;->onDeviceFound(Lo/acl;)V

    .line 66
    :cond_2
    :goto_1
    iget-object v4, p0, Lo/acc;->k:Ljava/lang/Object;

    monitor-enter v4

    .line 67
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lo/acc;->h:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 68
    monitor-exit v4

    goto :goto_2

    :catchall_1
    move-exception v6

    monitor-exit v4

    throw v6

    .line 70
    :goto_2
    iget-object v0, p0, Lo/acc;->d:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_3

    .line 71
    iget-object v0, p0, Lo/acc;->d:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    move-result v4

    .line 72
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cancel the existing task result is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    :cond_3
    invoke-virtual {p1}, Lo/acf;->c()I

    move-result v0

    if-lez v0, :cond_4

    .line 76
    iget-object v0, p0, Lo/acc;->g:Ljava/lang/Runnable;

    invoke-virtual {p1}, Lo/acf;->c()I

    move-result v1

    invoke-static {v0, v1}, Lo/ahj;->a(Ljava/lang/Runnable;I)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lo/acc;->d:Ljava/util/concurrent/ScheduledFuture;

    .line 80
    :cond_4
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 3

    .line 84
    invoke-direct {p0}, Lo/acc;->d()V

    .line 85
    iget-object v0, p0, Lo/acc;->g:Ljava/lang/Runnable;

    invoke-static {v0}, Lo/ahj;->a(Ljava/lang/Runnable;)Z

    .line 86
    iget-object v1, p0, Lo/acc;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 87
    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lo/acc;->b:Lo/aby;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 89
    :goto_0
    return-void
.end method
