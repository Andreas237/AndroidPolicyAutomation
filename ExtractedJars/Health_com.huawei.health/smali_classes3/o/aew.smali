.class public Lo/aew;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Lo/aby;

.field private c:Lo/acl;

.field private d:Ljava/lang/String;

.field private e:J

.field private f:Lo/aby;

.field private g:Landroid/os/Handler;

.field private h:Landroid/content/BroadcastReceiver;

.field private k:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lo/aby;Landroid/content/Context;)V
    .locals 2

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aew;->a:Z

    .line 32
    const-wide/16 v0, 0xbb8

    iput-wide v0, p0, Lo/aew;->e:J

    .line 37
    new-instance v0, Lo/aew$1;

    invoke-direct {v0, p0}, Lo/aew$1;-><init>(Lo/aew;)V

    iput-object v0, p0, Lo/aew;->g:Landroid/os/Handler;

    .line 58
    new-instance v0, Lo/aew$5;

    invoke-direct {v0, p0}, Lo/aew$5;-><init>(Lo/aew;)V

    iput-object v0, p0, Lo/aew;->f:Lo/aby;

    .line 188
    new-instance v0, Lo/aew$4;

    invoke-direct {v0, p0}, Lo/aew$4;-><init>(Lo/aew;)V

    iput-object v0, p0, Lo/aew;->h:Landroid/content/BroadcastReceiver;

    .line 92
    iput-object p1, p0, Lo/aew;->b:Lo/aby;

    .line 93
    iput-object p2, p0, Lo/aew;->k:Landroid/content/Context;

    .line 94
    return-void
.end method

.method static synthetic a(Lo/aew;)Lo/acl;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/aew;->c:Lo/acl;

    return-object v0
.end method

.method private b()V
    .locals 1

    .line 136
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aew;->a:Z

    .line 137
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->a()V

    .line 138
    return-void
.end method

.method static synthetic b(Lo/aew;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lo/aew;->c()V

    return-void
.end method

.method static synthetic b(Lo/aew;Ljava/lang/String;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/aew;->e(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lo/aew;)Lo/aby;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/aew;->b:Lo/aby;

    return-object v0
.end method

.method private c()V
    .locals 5

    .line 144
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendScannerMessage mScanTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/aew;->e:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    iget-object v0, p0, Lo/aew;->g:Landroid/os/Handler;

    iget-wide v1, p0, Lo/aew;->e:J

    const/16 v3, 0x2711

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 146
    return-void
.end method

.method static synthetic d(Lo/aew;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lo/aew;->b()V

    return-void
.end method

.method static synthetic e(Lo/aew;)Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/aew;->d:Ljava/lang/String;

    return-object v0
.end method

.method private e(Ljava/lang/String;)V
    .locals 6

    .line 153
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startScanner mProductId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v4

    .line 155
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 156
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScanner productInfo is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, v4, Lo/afj;->f:Lo/acf;

    iget-object v2, v4, Lo/afj;->h:Lo/ace;

    iget-object v3, p0, Lo/aew;->f:Lo/aby;

    invoke-virtual {v0, v1, v2, v3}, Lo/afd;->c(Lo/acf;Lo/ace;Lo/aby;)Z

    move-result v5

    .line 159
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startScanner isScanner:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    if-nez v5, :cond_0

    .line 161
    invoke-direct {p0}, Lo/aew;->c()V

    .line 164
    :cond_0
    return-void
.end method

.method static synthetic h(Lo/aew;)Landroid/os/Handler;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/aew;->g:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 126
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopScan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aew;->c:Lo/acl;

    .line 128
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aew;->d:Ljava/lang/String;

    .line 129
    invoke-direct {p0}, Lo/aew;->b()V

    .line 130
    return-void
.end method

.method public c(Ljava/lang/String;Lo/acl;)V
    .locals 4

    .line 102
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 103
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScan mProductId is null device is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    return-void

    .line 106
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startScan mProductId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startScan isScanning:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/aew;->a:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    iget-boolean v0, p0, Lo/aew;->a:Z

    if-nez v0, :cond_3

    .line 109
    iput-object p2, p0, Lo/aew;->c:Lo/acl;

    .line 110
    iput-object p1, p0, Lo/aew;->d:Ljava/lang/String;

    .line 111
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result v0

    const/16 v1, 0xc

    if-eq v1, v0, :cond_2

    .line 112
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScan Bluetooth not open"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    return-void

    .line 115
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aew;->a:Z

    .line 116
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/aew;->e:J

    .line 117
    invoke-direct {p0}, Lo/aew;->c()V

    .line 118
    const-wide/16 v0, 0xbb8

    iput-wide v0, p0, Lo/aew;->e:J

    .line 120
    :cond_3
    return-void
.end method

.method public d()V
    .locals 5

    .line 178
    iget-object v0, p0, Lo/aew;->k:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 179
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerBluetootMonitor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 181
    iget-object v0, p0, Lo/aew;->k:Landroid/content/Context;

    iget-object v1, p0, Lo/aew;->h:Landroid/content/BroadcastReceiver;

    const-string v2, "com.cn.customview.permissions.MY_BROADCAST"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 183
    :cond_0
    return-void
.end method

.method public e()V
    .locals 5

    .line 167
    iget-object v0, p0, Lo/aew;->k:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 168
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterBluetoothMonitor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    :try_start_0
    iget-object v0, p0, Lo/aew;->k:Landroid/content/Context;

    iget-object v1, p0, Lo/aew;->h:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 173
    goto :goto_0

    .line 171
    :catch_0
    move-exception v4

    .line 172
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BluetoothScanUtil Receiver not registered :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    :cond_0
    :goto_0
    return-void
.end method
