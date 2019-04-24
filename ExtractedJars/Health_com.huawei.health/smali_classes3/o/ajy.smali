.class public Lo/ajy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ajy$e;
    }
.end annotation


# static fields
.field private static c:Lo/ajy;

.field private static e:Ljava/lang/Object;


# instance fields
.field private a:I

.field private b:Landroid/content/Context;

.field private d:Landroid/net/wifi/WifiManager;

.field private f:I

.field private g:Ljava/lang/String;

.field private h:Z

.field private i:Lo/ajy$e;

.field private k:Lo/ajj;

.field private p:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 41
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/ajy;->e:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    const/4 v0, -0x1

    iput v0, p0, Lo/ajy;->a:I

    .line 47
    const/16 v0, 0x2710

    iput v0, p0, Lo/ajy;->f:I

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ajy;->h:Z

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ajy;->i:Lo/ajy$e;

    .line 324
    new-instance v0, Lo/ajy$1;

    invoke-direct {v0, p0}, Lo/ajy$1;-><init>(Lo/ajy;)V

    iput-object v0, p0, Lo/ajy;->p:Landroid/content/BroadcastReceiver;

    .line 97
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ajy;->b:Landroid/content/Context;

    .line 98
    new-instance v0, Lo/ajy$e;

    invoke-direct {v0, p0}, Lo/ajy$e;-><init>(Lo/ajy;)V

    iput-object v0, p0, Lo/ajy;->i:Lo/ajy$e;

    .line 99
    iget-object v0, p0, Lo/ajy;->b:Landroid/content/Context;

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    iput-object v0, p0, Lo/ajy;->d:Landroid/net/wifi/WifiManager;

    .line 100
    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/ajy;
    .locals 4

    .line 124
    sget-object v2, Lo/ajy;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 125
    :try_start_0
    sget-object v0, Lo/ajy;->c:Lo/ajy;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 126
    new-instance v0, Lo/ajy;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ajy;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/ajy;->c:Lo/ajy;

    .line 128
    :cond_0
    sget-object v0, Lo/ajy;->c:Lo/ajy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 129
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;IZ)Z
    .locals 9

    .line 143
    iget-object v0, p0, Lo/ajy;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 144
    const/16 v0, 0x67

    invoke-direct {p0, v0}, Lo/ajy;->c(I)V

    .line 147
    :cond_0
    invoke-direct {p0}, Lo/ajy;->d()V

    .line 148
    invoke-virtual {p0, p1, p3}, Lo/ajy;->e(Ljava/lang/String;I)Landroid/net/wifi/WifiConfiguration;

    move-result-object v5

    .line 149
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 150
    new-instance v0, Landroid/net/wifi/WifiConfiguration;

    invoke-direct {v0}, Landroid/net/wifi/WifiConfiguration;-><init>()V

    invoke-virtual {p0, p3, p1, p2, v0}, Lo/ajy;->e(ILjava/lang/String;Ljava/lang/String;Landroid/net/wifi/WifiConfiguration;)Landroid/net/wifi/WifiConfiguration;

    move-result-object v5

    .line 151
    iget-object v0, p0, Lo/ajy;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0, v5}, Landroid/net/wifi/WifiManager;->addNetwork(Landroid/net/wifi/WifiConfiguration;)I

    move-result v4

    goto :goto_0

    .line 153
    :cond_1
    if-eqz p4, :cond_2

    .line 154
    invoke-virtual {p0, p3, p1, p2, v5}, Lo/ajy;->e(ILjava/lang/String;Ljava/lang/String;Landroid/net/wifi/WifiConfiguration;)Landroid/net/wifi/WifiConfiguration;

    move-result-object v5

    .line 155
    iget-object v0, p0, Lo/ajy;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0, v5}, Landroid/net/wifi/WifiManager;->addNetwork(Landroid/net/wifi/WifiConfiguration;)I

    move-result v4

    goto :goto_0

    .line 157
    :cond_2
    iget v4, v5, Landroid/net/wifi/WifiConfiguration;->networkId:I

    .line 160
    :goto_0
    const-string v0, "WiFiConnectUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connect networkId is:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 161
    iget-object v0, p0, Lo/ajy;->i:Lo/ajy$e;

    iget v1, p0, Lo/ajy;->f:I

    int-to-long v1, v1

    const/16 v3, 0x65

    invoke-virtual {v0, v3, v1, v2}, Lo/ajy$e;->sendEmptyMessageDelayed(IJ)Z

    .line 162
    iput-object p1, p0, Lo/ajy;->g:Ljava/lang/String;

    .line 163
    iput v4, p0, Lo/ajy;->a:I

    .line 164
    if-ltz v4, :cond_4

    .line 165
    iget-object v0, p0, Lo/ajy;->d:Landroid/net/wifi/WifiManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v4, v1}, Landroid/net/wifi/WifiManager;->enableNetwork(IZ)Z

    move-result v6

    .line 166
    const-string v0, "WiFiConnectUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "connect enableNetwork is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 167
    if-eqz v6, :cond_3

    .line 168
    iget-object v0, p0, Lo/ajy;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->saveConfiguration()Z

    move-result v7

    .line 169
    iget-object v0, p0, Lo/ajy;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->reconnect()Z

    move-result v8

    .line 170
    const-string v0, "WiFiConnectUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "connect saveConfiguration:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--reconnect:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 171
    const/4 v0, 0x1

    return v0

    .line 173
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 176
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method private c(I)V
    .locals 3

    .line 83
    iget-object v0, p0, Lo/ajy;->k:Lo/ajj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 84
    iget-object v0, p0, Lo/ajy;->k:Lo/ajj;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, p1, v1, v2}, Lo/ajj;->onResult(ILjava/lang/String;Ljava/lang/Object;)V

    .line 86
    :cond_0
    iget-object v0, p0, Lo/ajy;->i:Lo/ajy$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 87
    iget-object v0, p0, Lo/ajy;->i:Lo/ajy$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ajy$e;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 89
    :cond_1
    invoke-virtual {p0}, Lo/ajy;->b()V

    .line 90
    return-void
.end method

.method static synthetic c(Lo/ajy;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lo/ajy;->c(I)V

    return-void
.end method

.method static synthetic d(Lo/ajy;)Lo/ajy$e;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/ajy;->i:Lo/ajy$e;

    return-object v0
.end method

.method private d()V
    .locals 5

    .line 103
    const-string v0, "initData isRegisterReceiver,"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-boolean v2, p0, Lo/ajy;->h:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 104
    iget-boolean v0, p0, Lo/ajy;->h:Z

    if-nez v0, :cond_0

    .line 105
    const-string v0, "initData Register wifi Receiver,"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 106
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 107
    const-string v0, "android.net.wifi.STATE_CHANGE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 108
    iget-object v0, p0, Lo/ajy;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/ajy;->p:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 109
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ajy;->h:Z

    .line 111
    :cond_0
    return-void
.end method

.method public static e(Landroid/net/wifi/ScanResult;)I
    .locals 2

    .line 312
    iget-object v0, p0, Landroid/net/wifi/ScanResult;->capabilities:Ljava/lang/String;

    const-string v1, "WEP"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/net/wifi/ScanResult;->capabilities:Ljava/lang/String;

    const-string v1, "wep"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 313
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 314
    :cond_1
    iget-object v0, p0, Landroid/net/wifi/ScanResult;->capabilities:Ljava/lang/String;

    const-string v1, "PSK"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 315
    const/4 v0, 0x2

    return v0

    .line 316
    :cond_2
    iget-object v0, p0, Landroid/net/wifi/ScanResult;->capabilities:Ljava/lang/String;

    const-string v1, "EAP"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 317
    const/4 v0, 0x3

    return v0

    .line 319
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Landroid/net/wifi/WifiConfiguration;)I
    .locals 2

    .line 300
    iget-object v0, p0, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 301
    const/4 v0, 0x2

    return v0

    .line 303
    :cond_0
    iget-object v0, p0, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    .line 304
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 305
    :cond_1
    const/4 v0, 0x3

    return v0

    .line 307
    :cond_2
    iget-object v0, p0, Landroid/net/wifi/WifiConfiguration;->wepKeys:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e()V
    .locals 5

    .line 341
    iget-object v0, p0, Lo/ajy;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/akf;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 342
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 343
    invoke-static {v4}, Lo/akf;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 344
    const-string v0, "WiFiConnectUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "compareConnect current ssid "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|mConnSSID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ajy;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 345
    iget-object v0, p0, Lo/ajy;->g:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ajy;->g:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 346
    iget-object v0, p0, Lo/ajy;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/akf;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 347
    const-string v0, "WiFiConnectUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "compareConnect connect success..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 348
    iget-object v0, p0, Lo/ajy;->i:Lo/ajy$e;

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Lo/ajy$e;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 351
    :cond_0
    invoke-virtual {p0}, Lo/ajy;->a()Z

    goto :goto_0

    .line 354
    :cond_1
    const-string v0, "WiFiConnectUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "compareConnect not connect wifi..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 356
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/ajy;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/ajy;->e()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 271
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a()Z
    .locals 4

    .line 193
    iget v0, p0, Lo/ajy;->a:I

    if-lez v0, :cond_0

    .line 194
    invoke-virtual {p0}, Lo/ajy;->c()V

    .line 195
    const-string v0, "WiFiConnectUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "reConnectLastConfig mLastNetid is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ajy;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 196
    iget-object v0, p0, Lo/ajy;->d:Landroid/net/wifi/WifiManager;

    iget v1, p0, Lo/ajy;->a:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/net/wifi/WifiManager;->enableNetwork(IZ)Z

    .line 197
    iget-object v0, p0, Lo/ajy;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->reassociate()Z

    move-result v0

    return v0

    .line 199
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 2

    .line 114
    const/16 v0, 0x2710

    iput v0, p0, Lo/ajy;->f:I

    .line 115
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ajy;->g:Ljava/lang/String;

    .line 116
    const/4 v0, -0x1

    iput v0, p0, Lo/ajy;->a:I

    .line 117
    iget-boolean v0, p0, Lo/ajy;->h:Z

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lo/ajy;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/ajy;->p:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 119
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ajy;->h:Z

    .line 121
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;IZLo/ajj;)V
    .locals 1

    .line 138
    iput-object p5, p0, Lo/ajy;->k:Lo/ajj;

    .line 139
    invoke-direct {p0, p1, p2, p3, p4}, Lo/ajy;->a(Ljava/lang/String;Ljava/lang/String;IZ)Z

    .line 140
    return-void
.end method

.method public c()V
    .locals 6

    .line 181
    iget-object v0, p0, Lo/ajy;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 182
    iget-object v0, p0, Lo/ajy;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v4

    .line 183
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 184
    invoke-virtual {v4}, Landroid/net/wifi/WifiInfo;->getNetworkId()I

    move-result v5

    .line 185
    iget-object v0, p0, Lo/ajy;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0, v5}, Landroid/net/wifi/WifiManager;->disableNetwork(I)Z

    .line 186
    const-string v0, "WiFiConnectUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " disableCurrentNetwork current netid is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 189
    :cond_0
    return-void
.end method

.method public c(Landroid/net/wifi/ScanResult;Ljava/lang/String;ZLo/ajj;)V
    .locals 2

    .line 133
    iput-object p4, p0, Lo/ajy;->k:Lo/ajj;

    .line 134
    iget-object v0, p1, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    invoke-static {p1}, Lo/ajy;->e(Landroid/net/wifi/ScanResult;)I

    move-result v1

    invoke-direct {p0, v0, p2, v1, p3}, Lo/ajy;->a(Ljava/lang/String;Ljava/lang/String;IZ)Z

    .line 135
    return-void
.end method

.method public e(ILjava/lang/String;Ljava/lang/String;Landroid/net/wifi/WifiConfiguration;)Landroid/net/wifi/WifiConfiguration;
    .locals 4

    .line 208
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedAuthAlgorithms:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->clear()V

    .line 209
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedGroupCiphers:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->clear()V

    .line 210
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->clear()V

    .line 211
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedPairwiseCiphers:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->clear()V

    .line 212
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedProtocols:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->clear()V

    .line 213
    invoke-virtual {p0, p2}, Lo/ajy;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p4, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;

    .line 214
    const/4 v0, 0x1

    iput-boolean v0, p4, Landroid/net/wifi/WifiConfiguration;->hiddenSSID:Z

    .line 215
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    .line 217
    :pswitch_0
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->wepKeys:[Ljava/lang/String;

    const-string v1, "\"\""

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 218
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 219
    const/4 v0, 0x0

    iput v0, p4, Landroid/net/wifi/WifiConfiguration;->wepTxKeyIndex:I

    .line 220
    goto/16 :goto_2

    .line 222
    :pswitch_1
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->wepKeys:[Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 223
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedGroupCiphers:Ljava/util/BitSet;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 224
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedGroupCiphers:Ljava/util/BitSet;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 225
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedGroupCiphers:Ljava/util/BitSet;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 226
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedGroupCiphers:Ljava/util/BitSet;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 227
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 228
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedAuthAlgorithms:Ljava/util/BitSet;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 229
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedAuthAlgorithms:Ljava/util/BitSet;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 230
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v3

    .line 232
    const/16 v0, 0xa

    if-eq v3, v0, :cond_0

    const/16 v0, 0x1a

    if-eq v3, v0, :cond_0

    const/16 v0, 0x3a

    if-ne v3, v0, :cond_1

    :cond_0
    const-string v0, "[0-9A-Fa-f]*"

    .line 233
    invoke-virtual {p3, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 234
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->wepKeys:[Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p3, v0, v1

    goto :goto_0

    .line 236
    :cond_1
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->wepKeys:[Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 238
    :goto_0
    const/4 v0, 0x0

    iput v0, p4, Landroid/net/wifi/WifiConfiguration;->wepTxKeyIndex:I

    .line 239
    goto/16 :goto_2

    .line 241
    :pswitch_2
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedAuthAlgorithms:Ljava/util/BitSet;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 242
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedGroupCiphers:Ljava/util/BitSet;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 243
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedPairwiseCiphers:Ljava/util/BitSet;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 244
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedGroupCiphers:Ljava/util/BitSet;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 245
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedPairwiseCiphers:Ljava/util/BitSet;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 246
    const/4 v0, 0x2

    iput v0, p4, Landroid/net/wifi/WifiConfiguration;->status:I

    .line 247
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 248
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_3

    .line 249
    const-string v0, "[0-9A-Fa-f]{64}"

    invoke-virtual {p3, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 250
    iput-object p3, p4, Landroid/net/wifi/WifiConfiguration;->preSharedKey:Ljava/lang/String;

    goto :goto_2

    .line 252
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p4, Landroid/net/wifi/WifiConfiguration;->preSharedKey:Ljava/lang/String;

    goto :goto_2

    .line 259
    :pswitch_3
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 260
    iget-object v0, p4, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 261
    goto :goto_2

    .line 263
    :goto_1
    const/4 v0, 0x0

    return-object v0

    .line 266
    :cond_3
    :goto_2
    return-object p4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public e(Ljava/lang/String;I)Landroid/net/wifi/WifiConfiguration;
    .locals 7

    .line 278
    iget-object v0, p0, Lo/ajy;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConfiguredNetworks()Ljava/util/List;

    move-result-object v4

    .line 279
    if-nez v4, :cond_0

    .line 280
    const-string v0, "WiFiConnectUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "configs == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 281
    const/4 v0, 0x0

    return-object v0

    .line 283
    :cond_0
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/net/wifi/WifiConfiguration;

    .line 284
    const-string v0, "WiFiConnectUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isExsitsConfiguration=>"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, v6, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 285
    iget-object v0, v6, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 286
    invoke-static {v6}, Lo/ajy;->e(Landroid/net/wifi/WifiConfiguration;)I

    move-result v0

    if-ne p2, v0, :cond_1

    .line 287
    return-object v6

    .line 290
    :cond_1
    goto :goto_0

    .line 291
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method
