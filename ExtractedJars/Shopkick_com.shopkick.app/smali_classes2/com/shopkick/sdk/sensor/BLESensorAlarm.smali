.class public Lcom/shopkick/sdk/sensor/BLESensorAlarm;
.super Ljava/lang/Object;
.source "BLESensorAlarm.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "BLESensorAlarm"


# instance fields
.field private final alarmManager:Landroid/app/AlarmManager;

.field private final appStatusManager:Lcom/shopkick/app/application/AppStatusManager;

.field private final context:Landroid/content/Context;

.field private final serverFlags:Lcom/shopkick/sdk/core/ServerFlags;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/app/AlarmManager;Lcom/shopkick/app/application/AppStatusManager;Lcom/shopkick/sdk/core/ServerFlags;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/BLESensorAlarm;->context:Landroid/content/Context;

    .line 30
    iput-object p2, p0, Lcom/shopkick/sdk/sensor/BLESensorAlarm;->alarmManager:Landroid/app/AlarmManager;

    .line 31
    iput-object p3, p0, Lcom/shopkick/sdk/sensor/BLESensorAlarm;->appStatusManager:Lcom/shopkick/app/application/AppStatusManager;

    .line 32
    iput-object p4, p0, Lcom/shopkick/sdk/sensor/BLESensorAlarm;->serverFlags:Lcom/shopkick/sdk/core/ServerFlags;

    return-void
.end method

.method private pendingIntent(Z)Landroid/app/PendingIntent;
    .locals 3

    .line 60
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/BLESensorAlarm;->context:Landroid/content/Context;

    const-class v2, Lcom/shopkick/sdk/sensor/BLEScanBroadcastReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 61
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/BLESensorAlarm;->context:Landroid/content/Context;

    if-eqz p1, :cond_0

    const/high16 p1, 0x8000000

    goto :goto_0

    :cond_0
    const/high16 p1, 0x20000000

    :goto_0
    const/4 v2, 0x0

    invoke-static {v1, v2, v0, p1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public startBleSensorAlarm()V
    .locals 14

    const/4 v0, 0x0

    .line 36
    invoke-direct {p0, v0}, Lcom/shopkick/sdk/sensor/BLESensorAlarm;->pendingIntent(Z)Landroid/app/PendingIntent;

    move-result-object v1

    .line 37
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v5, "%1$s Starting scanning"

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/Object;

    sget-object v8, Lcom/shopkick/sdk/sensor/BLESensorAlarm;->TAG:Ljava/lang/String;

    aput-object v8, v7, v0

    invoke-virtual {v2, v3, v4, v5, v7}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 38
    iget-object v2, p0, Lcom/shopkick/sdk/sensor/BLESensorAlarm;->appStatusManager:Lcom/shopkick/app/application/AppStatusManager;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppStatusManager;->isAppInForeground()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/shopkick/sdk/sensor/BLESensorAlarm;->serverFlags:Lcom/shopkick/sdk/core/ServerFlags;

    .line 39
    invoke-virtual {v2}, Lcom/shopkick/sdk/core/ServerFlags;->getServerFlags()Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    move-result-object v2

    iget-object v2, v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->bleScanIntervalSeconds:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/shopkick/sdk/sensor/BLESensorAlarm;->serverFlags:Lcom/shopkick/sdk/core/ServerFlags;

    .line 40
    invoke-virtual {v2}, Lcom/shopkick/sdk/core/ServerFlags;->getServerFlags()Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;

    move-result-object v2

    iget-object v2, v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ServerFlags;->bleScanLengthIntervalBackgroundSeconds:Ljava/lang/Integer;

    .line 38
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-nez v1, :cond_1

    .line 43
    iget-object v7, p0, Lcom/shopkick/sdk/sensor/BLESensorAlarm;->alarmManager:Landroid/app/AlarmManager;

    const/4 v8, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    mul-int/lit16 v2, v2, 0x3e8

    int-to-long v11, v2

    .line 44
    invoke-direct {p0, v6}, Lcom/shopkick/sdk/sensor/BLESensorAlarm;->pendingIntent(Z)Landroid/app/PendingIntent;

    move-result-object v13

    .line 43
    invoke-virtual/range {v7 .. v13}, Landroid/app/AlarmManager;->setInexactRepeating(IJJLandroid/app/PendingIntent;)V

    goto :goto_1

    .line 46
    :cond_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "%1$s Trying to start another sensor alarm"

    new-array v5, v6, [Ljava/lang/Object;

    sget-object v6, Lcom/shopkick/sdk/sensor/BLESensorAlarm;->TAG:Ljava/lang/String;

    aput-object v6, v5, v0

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->w(JLjava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public stopBleSensorAlarm()V
    .locals 8

    const/4 v0, 0x1

    .line 51
    invoke-direct {p0, v0}, Lcom/shopkick/sdk/sensor/BLESensorAlarm;->pendingIntent(Z)Landroid/app/PendingIntent;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 53
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v5, "%1$s Stopping scanning"

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v6, 0x0

    sget-object v7, Lcom/shopkick/sdk/sensor/BLESensorAlarm;->TAG:Ljava/lang/String;

    aput-object v7, v0, v6

    invoke-virtual {v2, v3, v4, v5, v0}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 54
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/BLESensorAlarm;->alarmManager:Landroid/app/AlarmManager;

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 55
    invoke-virtual {v1}, Landroid/app/PendingIntent;->cancel()V

    :cond_0
    return-void
.end method
