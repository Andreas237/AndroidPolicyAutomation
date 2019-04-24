.class public Lcom/shopkick/app/activities/BackgroundService;
.super Landroid/app/Service;
.source "BackgroundService.java"


# static fields
.field public static SERVICE_START_SOURCE_KEY:Ljava/lang/String; = "serviceStartSource"


# instance fields
.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private started:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lcom/shopkick/app/activities/BackgroundService;->started:Z

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 1

    .line 29
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BackgroundService;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/SKApp;

    .line 30
    iget-object v0, v0, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iput-object v0, p0, Lcom/shopkick/app/activities/BackgroundService;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 32
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    const/4 v0, 0x0

    .line 74
    iput-boolean v0, p0, Lcom/shopkick/app/activities/BackgroundService;->started:Z

    .line 75
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    const/4 p2, 0x3

    if-eqz p1, :cond_0

    .line 44
    sget-object p3, Lcom/shopkick/app/activities/BackgroundService;->SERVICE_START_SOURCE_KEY:Ljava/lang/String;

    const/4 v0, -0x1

    invoke-virtual {p1, p3, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, p2

    .line 51
    :goto_0
    iget-boolean p3, p0, Lcom/shopkick/app/activities/BackgroundService;->started:Z

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-nez p3, :cond_3

    .line 52
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BackgroundService;->getApplication()Landroid/app/Application;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/application/SKApp;

    .line 53
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v3, 0x389

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 54
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBackgroundServiceStartSource(Ljava/lang/Integer;)V

    .line 55
    iget-object v3, p0, Lcom/shopkick/app/activities/BackgroundService;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    if-eq p1, v1, :cond_2

    if-ne p1, p2, :cond_1

    goto :goto_1

    :cond_1
    if-ne p1, v0, :cond_3

    .line 63
    iget-object p1, p3, Lcom/shopkick/app/application/SKApp;->geofenceManager:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-virtual {p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->sessionEnded()V

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "Geofencing"

    const-string p2, "Starting geofenceManager from BackgroundService"

    .line 60
    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    iget-object p1, p3, Lcom/shopkick/app/application/SKApp;->geofenceManager:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-virtual {p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->sessionEnded()V

    .line 67
    :cond_3
    :goto_2
    iput-boolean v1, p0, Lcom/shopkick/app/activities/BackgroundService;->started:Z

    return v0
.end method

.method public onTaskRemoved(Landroid/content/Intent;)V
    .locals 6

    .line 82
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BackgroundService;->getApplication()Landroid/app/Application;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 84
    check-cast p1, Lcom/shopkick/app/application/SKApp;

    .line 85
    iget-object v0, p1, Lcom/shopkick/app/application/SKApp;->bleCampaignController:Lcom/shopkick/app/campaigns/BLECampaignController;

    if-eqz v0, :cond_0

    .line 87
    :try_start_0
    iget-object p1, p1, Lcom/shopkick/app/application/SKApp;->bleCampaignController:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-virtual {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->cancelBleNotification()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    move-object v3, p1

    .line 92
    :try_start_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object p1, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v4, "BackgroundService.onTaskRemoved() failed"

    const/4 p1, 0x0

    new-array v5, p1, [Ljava/lang/Object;

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 94
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method
