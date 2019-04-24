.class public Lme/pushy/sdk/services/PushySocketService;
.super Landroid/app/Service;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lme/pushy/sdk/services/PushySocketService$MqttConnection;,
        Lme/pushy/sdk/services/PushySocketService$SendKeepAliveAsync;,
        Lme/pushy/sdk/services/PushySocketService$ConnectAsync;
    }
.end annotation


# static fields
.field public static final ACTION_KEEP_ALIVE:Ljava/lang/String; = "Pushy.KEEP_ALIVE"

.field public static final ACTION_RECONNECT:Ljava/lang/String; = "Pushy.RECONNECT"

.field public static final ACTION_START:Ljava/lang/String; = "Pushy.START"

.field private static final INITIAL_RETRY_INTERVAL:J = 0x1f4L

.field private static final MAXIMUM_RETRY_INTERVAL:J = 0xea60L

.field private static MQTT_ACK_TIMEOUT:S = 0x3a98s

.field private static MQTT_CONNECT_TIMEOUT:S = 0xfs

.field private static MQTT_DEFAULT_KEEP_ALIVE:S = 0x12cs

.field private static MQTT_QUALITY_OF_SERVICE:I = 0x1

.field private static MQTT_RETAINED_PUBLISH:Z = false


# instance fields
.field private mAlarmManager:Landroid/app/AlarmManager;

.field private mConnectivityListener:Landroid/content/BroadcastReceiver;

.field private mConnectivityManager:Landroid/net/ConnectivityManager;

.field private mIsDestroyed:Z

.field private mRetryInterval:J

.field private mSocket:Lme/pushy/sdk/services/PushySocketService$MqttConnection;

.field private mWifiManager:Landroid/net/wifi/WifiManager;

.field private mWifiWakeLock:Landroid/net/wifi/WifiManager$WifiLock;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const-wide/16 v0, 0x1f4

    iput-wide v0, p0, Lme/pushy/sdk/services/PushySocketService;->mRetryInterval:J

    new-instance v0, Lme/pushy/sdk/services/PushySocketService$1;

    invoke-direct {v0, p0}, Lme/pushy/sdk/services/PushySocketService$1;-><init>(Lme/pushy/sdk/services/PushySocketService;)V

    iput-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mConnectivityListener:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic access$100(Lme/pushy/sdk/services/PushySocketService;)Z
    .locals 0

    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->isNetworkAvailable()Z

    move-result p0

    return p0
.end method

.method static synthetic access$1000(Lme/pushy/sdk/services/PushySocketService;)Z
    .locals 0

    iget-boolean p0, p0, Lme/pushy/sdk/services/PushySocketService;->mIsDestroyed:Z

    return p0
.end method

.method static synthetic access$1100()I
    .locals 1

    sget v0, Lme/pushy/sdk/services/PushySocketService;->MQTT_QUALITY_OF_SERVICE:I

    return v0
.end method

.method static synthetic access$1200()Z
    .locals 1

    sget-boolean v0, Lme/pushy/sdk/services/PushySocketService;->MQTT_RETAINED_PUBLISH:Z

    return v0
.end method

.method static synthetic access$200(Lme/pushy/sdk/services/PushySocketService;)Lme/pushy/sdk/services/PushySocketService$MqttConnection;
    .locals 0

    iget-object p0, p0, Lme/pushy/sdk/services/PushySocketService;->mSocket:Lme/pushy/sdk/services/PushySocketService$MqttConnection;

    return-object p0
.end method

.method static synthetic access$300(Lme/pushy/sdk/services/PushySocketService;)V
    .locals 0

    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->reconnectAsync()V

    return-void
.end method

.method static synthetic access$400(Lme/pushy/sdk/services/PushySocketService;)I
    .locals 0

    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->getConnectedNetwork()I

    move-result p0

    return p0
.end method

.method static synthetic access$500(Lme/pushy/sdk/services/PushySocketService;)I
    .locals 0

    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->getKeepAliveInterval()I

    move-result p0

    return p0
.end method

.method static synthetic access$600()S
    .locals 1

    sget-short v0, Lme/pushy/sdk/services/PushySocketService;->MQTT_ACK_TIMEOUT:S

    return v0
.end method

.method static synthetic access$700()S
    .locals 1

    sget-short v0, Lme/pushy/sdk/services/PushySocketService;->MQTT_CONNECT_TIMEOUT:S

    return v0
.end method

.method static synthetic access$800(Lme/pushy/sdk/services/PushySocketService;)V
    .locals 0

    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->startKeepAliveTimerAndWifiLock()V

    return-void
.end method

.method static synthetic access$902(Lme/pushy/sdk/services/PushySocketService;J)J
    .locals 0

    iput-wide p1, p0, Lme/pushy/sdk/services/PushySocketService;->mRetryInterval:J

    return-wide p1
.end method

.method private acquireWifiLock()V
    .locals 3

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mWifiWakeLock:Landroid/net/wifi/WifiManager$WifiLock;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "pushyWifiPolicyCompliance"

    const/4 v1, 0x0

    invoke-static {v0, v1, p0}, Lme/pushy/sdk/util/PushyPreferences;->getBoolean(Ljava/lang/String;ZLandroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lme/pushy/sdk/services/PushySocketService;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "wifi_sleep_policy"

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    if-eq v0, v2, :cond_1

    const-string v0, "Pushy"

    const-string v1, "Complying with device Wi-Fi sleep policy"

    :goto_0
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mWifiManager:Landroid/net/wifi/WifiManager;

    const/4 v1, 0x1

    const-string v2, "Pushy"

    invoke-virtual {v0, v1, v2}, Landroid/net/wifi/WifiManager;->createWifiLock(ILjava/lang/String;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v0

    iput-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mWifiWakeLock:Landroid/net/wifi/WifiManager$WifiLock;

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mWifiWakeLock:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->acquire()V

    const-string v0, "Pushy"

    const-string v1, "Wi-Fi lock acquired"

    goto :goto_0
.end method

.method private getConnectedNetwork()I
    .locals 4

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mConnectivityManager:Landroid/net/ConnectivityManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v0

    iget-object v2, p0, Lme/pushy/sdk/services/PushySocketService;->mConnectivityManager:Landroid/net/ConnectivityManager;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v2

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    return v3

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method private getKeepAliveInterval()I
    .locals 2

    const-string v0, "pushyKeepAliveInterval"

    sget-short v1, Lme/pushy/sdk/services/PushySocketService;->MQTT_DEFAULT_KEEP_ALIVE:S

    invoke-static {v0, v1, p0}, Lme/pushy/sdk/util/PushyPreferences;->getInt(Ljava/lang/String;ILandroid/content/Context;)I

    move-result v0

    return v0
.end method

.method private handleCrashedService()V
    .locals 0

    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->stopKeepAliveTimerAndWifiLock()V

    invoke-virtual {p0}, Lme/pushy/sdk/services/PushySocketService;->cancelReconnect()V

    return-void
.end method

.method private isNetworkAvailable()Z
    .locals 2

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mConnectivityManager:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private reconnectAsync()V
    .locals 2

    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->stopKeepAliveTimerAndWifiLock()V

    iget-boolean v0, p0, Lme/pushy/sdk/services/PushySocketService;->mIsDestroyed:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->isNetworkAvailable()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mSocket:Lme/pushy/sdk/services/PushySocketService$MqttConnection;

    invoke-virtual {v0}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    const-string v0, "Pushy"

    const-string v1, "Reconnecting..."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lme/pushy/sdk/services/PushySocketService$ConnectAsync;

    invoke-direct {v0, p0}, Lme/pushy/sdk/services/PushySocketService$ConnectAsync;-><init>(Lme/pushy/sdk/services/PushySocketService;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lme/pushy/sdk/services/PushySocketService$ConnectAsync;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method private releaseWifiLock()V
    .locals 2

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mWifiWakeLock:Landroid/net/wifi/WifiManager$WifiLock;

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mWifiWakeLock:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->release()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "Pushy"

    const-string v1, "Wi-Fi lock release failed"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mWifiWakeLock:Landroid/net/wifi/WifiManager$WifiLock;

    const-string v0, "Pushy"

    const-string v1, "Wi-Fi lock released"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private sendKeepAlive()V
    .locals 2

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mSocket:Lme/pushy/sdk/services/PushySocketService$MqttConnection;

    invoke-virtual {v0}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lme/pushy/sdk/services/PushySocketService$SendKeepAliveAsync;

    invoke-direct {v0, p0}, Lme/pushy/sdk/services/PushySocketService$SendKeepAliveAsync;-><init>(Lme/pushy/sdk/services/PushySocketService;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lme/pushy/sdk/services/PushySocketService$SendKeepAliveAsync;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method

.method private start()V
    .locals 2

    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->isNetworkAvailable()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mSocket:Lme/pushy/sdk/services/PushySocketService$MqttConnection;

    invoke-virtual {v0}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mSocket:Lme/pushy/sdk/services/PushySocketService$MqttConnection;

    invoke-virtual {v0}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Lme/pushy/sdk/services/PushySocketService$ConnectAsync;

    invoke-direct {v0, p0}, Lme/pushy/sdk/services/PushySocketService$ConnectAsync;-><init>(Lme/pushy/sdk/services/PushySocketService;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lme/pushy/sdk/services/PushySocketService$ConnectAsync;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_2
    return-void
.end method

.method private startKeepAliveTimerAndWifiLock()V
    .locals 8

    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->getKeepAliveInterval()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v5, v0

    const-string v0, "Pushy.KEEP_ALIVE"

    invoke-virtual {p0, v0}, Lme/pushy/sdk/services/PushySocketService;->getAlarmPendingIntent(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v7

    iget-object v1, p0, Lme/pushy/sdk/services/PushySocketService;->mAlarmManager:Landroid/app/AlarmManager;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    add-long v3, v2, v5

    const/4 v2, 0x0

    invoke-virtual/range {v1 .. v7}, Landroid/app/AlarmManager;->setRepeating(IJJLandroid/app/PendingIntent;)V

    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->acquireWifiLock()V

    return-void
.end method

.method private stop()V
    .locals 1

    invoke-virtual {p0}, Lme/pushy/sdk/services/PushySocketService;->cancelReconnect()V

    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->stopKeepAliveTimerAndWifiLock()V

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mConnectivityListener:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lme/pushy/sdk/services/PushySocketService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mSocket:Lme/pushy/sdk/services/PushySocketService$MqttConnection;

    invoke-virtual {v0}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;->disconnectExistingClient()V

    return-void
.end method

.method private stopKeepAliveTimerAndWifiLock()V
    .locals 2

    const-string v0, "Pushy.KEEP_ALIVE"

    invoke-virtual {p0, v0}, Lme/pushy/sdk/services/PushySocketService;->getAlarmPendingIntent(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v0

    iget-object v1, p0, Lme/pushy/sdk/services/PushySocketService;->mAlarmManager:Landroid/app/AlarmManager;

    invoke-virtual {v1, v0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->releaseWifiLock()V

    return-void
.end method


# virtual methods
.method public cancelReconnect()V
    .locals 2

    const-string v0, "Pushy.RECONNECT"

    invoke-virtual {p0, v0}, Lme/pushy/sdk/services/PushySocketService;->getAlarmPendingIntent(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v0

    iget-object v1, p0, Lme/pushy/sdk/services/PushySocketService;->mAlarmManager:Landroid/app/AlarmManager;

    invoke-virtual {v1, v0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    return-void
.end method

.method getAlarmPendingIntent(Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-class v1, Lme/pushy/sdk/services/PushySocketService;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, 0x0

    invoke-static {p0, p1, v0, p1}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 3

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    const-string v0, "Pushy"

    const-string v1, "Creating service"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "wifi"

    invoke-virtual {p0, v0}, Lme/pushy/sdk/services/PushySocketService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    iput-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mWifiManager:Landroid/net/wifi/WifiManager;

    const-string v0, "alarm"

    invoke-virtual {p0, v0}, Lme/pushy/sdk/services/PushySocketService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    iput-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mAlarmManager:Landroid/app/AlarmManager;

    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Lme/pushy/sdk/services/PushySocketService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    iput-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mConnectivityManager:Landroid/net/ConnectivityManager;

    new-instance v0, Lme/pushy/sdk/services/PushySocketService$MqttConnection;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lme/pushy/sdk/services/PushySocketService$MqttConnection;-><init>(Lme/pushy/sdk/services/PushySocketService;Lme/pushy/sdk/services/PushySocketService$1;)V

    iput-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mSocket:Lme/pushy/sdk/services/PushySocketService$MqttConnection;

    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->handleCrashedService()V

    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->start()V

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mConnectivityListener:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lme/pushy/sdk/services/PushySocketService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    const-string v0, "Pushy"

    const-string v1, "Service destroyed"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lme/pushy/sdk/services/PushySocketService;->mIsDestroyed:Z

    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->stop()V

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Pushy.START"

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Pushy.KEEP_ALIVE"

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->sendKeepAlive()V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Pushy.RECONNECT"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->reconnectAsync()V

    goto :goto_1

    :cond_3
    :goto_0
    invoke-direct {p0}, Lme/pushy/sdk/services/PushySocketService;->start()V

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public onTaskRemoved(Landroid/content/Intent;)V
    .locals 5

    const-string p1, "Pushy"

    const-string v0, "Task removed, attempting restart in 3 seconds"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Lme/pushy/sdk/services/PushySocketService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0}, Lme/pushy/sdk/services/PushySocketService;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lme/pushy/sdk/services/PushySocketService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v0, v1, p1, v2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    iget-object v0, p0, Lme/pushy/sdk/services/PushySocketService;->mAlarmManager:Landroid/app/AlarmManager;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    const-wide/16 v3, 0xbb8

    add-long/2addr v1, v3

    const/4 v3, 0x3

    invoke-virtual {v0, v3, v1, v2, p1}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    return-void
.end method

.method public scheduleReconnect()V
    .locals 8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lme/pushy/sdk/services/PushySocketService;->mRetryInterval:J

    const-wide/32 v4, 0xea60

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    const-wide/16 v2, 0x1f4

    iput-wide v2, p0, Lme/pushy/sdk/services/PushySocketService;->mRetryInterval:J

    :cond_0
    iget-wide v2, p0, Lme/pushy/sdk/services/PushySocketService;->mRetryInterval:J

    const-wide/16 v6, 0x2

    mul-long v2, v2, v6

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    iput-wide v2, p0, Lme/pushy/sdk/services/PushySocketService;->mRetryInterval:J

    const-string v2, "Pushy"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Reconnecting in "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lme/pushy/sdk/services/PushySocketService;->mRetryInterval:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "ms."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v2, "Pushy.RECONNECT"

    invoke-virtual {p0, v2}, Lme/pushy/sdk/services/PushySocketService;->getAlarmPendingIntent(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v2

    iget-object v3, p0, Lme/pushy/sdk/services/PushySocketService;->mAlarmManager:Landroid/app/AlarmManager;

    const/4 v4, 0x0

    iget-wide v5, p0, Lme/pushy/sdk/services/PushySocketService;->mRetryInterval:J

    add-long/2addr v0, v5

    invoke-virtual {v3, v4, v0, v1, v2}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    return-void
.end method
