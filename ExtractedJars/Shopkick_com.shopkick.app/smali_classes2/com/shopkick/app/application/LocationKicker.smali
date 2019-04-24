.class final Lcom/shopkick/app/application/LocationKicker;
.super Ljava/lang/Object;
.source "LocationKicker.java"


# static fields
.field private static volatile LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

.field private static final LocationServicesReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

.field private static final LocationServicesStatusListener:Lcom/shopkick/sdk/sensor/StatusListener;

.field private static final StopHighAccuracyExecutor:Ljava/util/concurrent/ScheduledExecutorService;

.field private static final StopHighAccuracyRunnable:Ljava/lang/Runnable;

.field private static final WorkLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    .line 31
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/application/LocationKicker;->StopHighAccuracyExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 33
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/app/application/LocationKicker;->WorkLock:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 34
    sput-object v0, Lcom/shopkick/app/application/LocationKicker;->LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    .line 59
    new-instance v0, Lcom/shopkick/app/application/LocationKicker$1;

    invoke-direct {v0}, Lcom/shopkick/app/application/LocationKicker$1;-><init>()V

    sput-object v0, Lcom/shopkick/app/application/LocationKicker;->StopHighAccuracyRunnable:Ljava/lang/Runnable;

    .line 83
    new-instance v0, Lcom/shopkick/app/application/LocationKicker$2;

    invoke-direct {v0}, Lcom/shopkick/app/application/LocationKicker$2;-><init>()V

    sput-object v0, Lcom/shopkick/app/application/LocationKicker;->LocationServicesReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 101
    new-instance v0, Lcom/shopkick/app/application/LocationKicker$3;

    invoke-direct {v0}, Lcom/shopkick/app/application/LocationKicker$3;-><init>()V

    sput-object v0, Lcom/shopkick/app/application/LocationKicker;->LocationServicesStatusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static Log(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 128
    invoke-static {p0, v0}, Lcom/shopkick/app/application/LocationKicker;->Log(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method private static Log(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 8

    .line 133
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 135
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v1, v2, p0, v0}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 137
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    new-array v7, v0, [Ljava/lang/Object;

    move-object v5, p1

    move-object v6, p0

    invoke-virtual/range {v2 .. v7}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic access$000()Lcom/shopkick/sdk/sensor/LocationServicesSensor;
    .locals 1

    .line 23
    sget-object v0, Lcom/shopkick/app/application/LocationKicker;->LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    return-object v0
.end method

.method static synthetic access$002(Lcom/shopkick/sdk/sensor/LocationServicesSensor;)Lcom/shopkick/sdk/sensor/LocationServicesSensor;
    .locals 0

    .line 23
    sput-object p0, Lcom/shopkick/app/application/LocationKicker;->LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    return-object p0
.end method

.method static synthetic access$100()Ljava/lang/Object;
    .locals 1

    .line 23
    sget-object v0, Lcom/shopkick/app/application/LocationKicker;->WorkLock:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$200(Ljava/lang/String;)V
    .locals 0

    .line 23
    invoke-static {p0}, Lcom/shopkick/app/application/LocationKicker;->Log(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 23
    invoke-static {p0, p1}, Lcom/shopkick/app/application/LocationKicker;->Log(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method static kickLocationServices()V
    .locals 6

    .line 38
    sget-object v0, Lcom/shopkick/app/application/LocationKicker;->LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    if-nez v0, :cond_1

    .line 39
    sget-object v0, Lcom/shopkick/app/application/LocationKicker;->WorkLock:Ljava/lang/Object;

    monitor-enter v0

    .line 40
    :try_start_0
    sget-object v1, Lcom/shopkick/app/application/LocationKicker;->LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    if-nez v1, :cond_0

    const-string v1, "LocationKicker.kickLocationServices() Starting high accuracy readings"

    .line 43
    invoke-static {v1}, Lcom/shopkick/app/application/LocationKicker;->Log(Ljava/lang/String;)V

    .line 44
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/SDKClient;->getSensorManager()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v1

    const-class v2, Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    sget-object v3, Lcom/shopkick/app/application/LocationKicker;->LocationServicesReadingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    sget-object v4, Lcom/shopkick/app/application/LocationKicker;->LocationServicesStatusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    invoke-virtual {v1, v2, v3, v4}, Lcom/shopkick/sdk/sensor/SensorManager;->open(Ljava/lang/Class;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    sput-object v1, Lcom/shopkick/app/application/LocationKicker;->LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    .line 48
    sget-object v1, Lcom/shopkick/app/application/LocationKicker;->LocationSensor:Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    sget-object v2, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->HIGH:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    invoke-virtual {v1, v2}, Lcom/shopkick/sdk/sensor/LocationServicesSensor;->setPowerAndAccuracyProfile(Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;)V

    .line 49
    sget-object v1, Lcom/shopkick/app/application/LocationKicker;->StopHighAccuracyExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v2, Lcom/shopkick/app/application/LocationKicker;->StopHighAccuracyRunnable:Ljava/lang/Runnable;

    const-wide/16 v3, 0x28

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 51
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    return-void
.end method
