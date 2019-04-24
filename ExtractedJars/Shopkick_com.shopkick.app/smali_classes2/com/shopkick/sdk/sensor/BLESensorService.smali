.class public Lcom/shopkick/sdk/sensor/BLESensorService;
.super Lcom/shopkick/sdk/core/NonStoppingIntentService;
.source "BLESensorService.java"


# static fields
.field private static final ServiceAppStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

.field private static final ServiceLoggingConfiguration:Lcom/shopkick/logging/ConfigurationProvider;

.field private static final ServiceSdkConfiguration:Lcom/shopkick/sdk/core/ConfigurationProvider;


# instance fields
.field private bleSensor:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;

.field private volatile scanning:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 82
    new-instance v0, Lcom/shopkick/sdk/sensor/BLESensorService$1;

    invoke-direct {v0}, Lcom/shopkick/sdk/sensor/BLESensorService$1;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/sensor/BLESensorService;->ServiceAppStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    .line 94
    new-instance v0, Lcom/shopkick/sdk/sensor/BLESensorService$2;

    invoke-direct {v0}, Lcom/shopkick/sdk/sensor/BLESensorService$2;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/sensor/BLESensorService;->ServiceSdkConfiguration:Lcom/shopkick/sdk/core/ConfigurationProvider;

    .line 130
    new-instance v0, Lcom/shopkick/sdk/sensor/BLESensorService$3;

    invoke-direct {v0}, Lcom/shopkick/sdk/sensor/BLESensorService$3;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/sensor/BLESensorService;->ServiceLoggingConfiguration:Lcom/shopkick/logging/ConfigurationProvider;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-string v0, "BLESensorService"

    .line 29
    invoke-direct {p0, v0}, Lcom/shopkick/sdk/core/NonStoppingIntentService;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    .line 34
    invoke-super {p0}, Lcom/shopkick/sdk/core/NonStoppingIntentService;->onCreate()V

    const/4 v0, 0x0

    .line 36
    iput-boolean v0, p0, Lcom/shopkick/sdk/sensor/BLESensorService;->scanning:Z

    .line 39
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 40
    sget-object v0, Lcom/shopkick/sdk/sensor/BLESensorService;->ServiceLoggingConfiguration:Lcom/shopkick/logging/ConfigurationProvider;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lcom/shopkick/logging/LoggerManager;->initialize(Lcom/shopkick/logging/ConfigurationProvider;Landroid/content/Context;Ljava/lang/String;)V

    .line 44
    :cond_0
    invoke-static {p0}, Lcom/shopkick/sdk/api/Environment;->initialize(Landroid/content/Context;)V

    .line 47
    sget-object v0, Lcom/shopkick/sdk/sensor/BLESensorService;->ServiceAppStateProvider:Lcom/shopkick/sdk/presence/AppStateProvider;

    sget-object v1, Lcom/shopkick/sdk/sensor/BLESensorService;->ServiceSdkConfiguration:Lcom/shopkick/sdk/core/ConfigurationProvider;

    invoke-static {p0, v0, v1}, Lcom/shopkick/sdk/sensor/SensorManager;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 48
    invoke-static {}, Lcom/shopkick/sdk/sensor/SensorManager;->getInstance()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/SensorManager;->getBeaconSensorImplementationInternal()Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/BLESensorService;->bleSensor:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;

    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 5

    .line 55
    iget-boolean v0, p0, Lcom/shopkick/sdk/sensor/BLESensorService;->scanning:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 57
    :try_start_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "BLESensorService: Scan service already started"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4, v1}, Lcom/shopkick/logging/DiagnosticLogger;->w(JLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    :catch_0
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/sensor/BLESensorService;->stopSelf(Landroid/content/Intent;)V

    return-void

    .line 64
    :cond_0
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/BLESensorService;->bleSensor:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;

    if-eqz p1, :cond_1

    .line 66
    :try_start_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v0, "BLESensorService: Starting one scan"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, v0, v1}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 68
    :catch_1
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/BLESensorService;->bleSensor:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->startOneScan()V

    goto :goto_0

    .line 71
    :cond_1
    :try_start_2
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v0, "BLESensorService: Cannot start scan"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, v0, v1}, Lcom/shopkick/logging/DiagnosticLogger;->w(JLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :goto_0
    return-void
.end method
