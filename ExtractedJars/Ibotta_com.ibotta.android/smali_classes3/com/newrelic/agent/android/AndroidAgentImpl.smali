.class public Lcom/newrelic/agent/android/AndroidAgentImpl;
.super Ljava/lang/Object;
.source "AndroidAgentImpl.java"

# interfaces
.implements Lcom/newrelic/agent/android/AgentImpl;
.implements Lcom/newrelic/agent/android/api/v1/ConnectionListener;
.implements Lcom/newrelic/agent/android/api/v2/TraceMachineInterface;
.implements Lcom/newrelic/agent/android/background/ApplicationStateListener;


# static fields
.field private static final LOCATION_ACCURACY_THRESHOLD:F = 500.0f

.field private static final catFacade:Lcom/newrelic/agent/android/connectivity/CatFacade;

.field private static final cmp:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/newrelic/agent/android/api/common/TransactionData;",
            ">;"
        }
    .end annotation
.end field

.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private final agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

.field private applicationInformation:Lcom/newrelic/agent/android/harvest/ApplicationInformation;

.field private final context:Landroid/content/Context;

.field private deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

.field private final encoder:Lcom/newrelic/agent/android/util/Encoder;

.field private locationListener:Landroid/location/LocationListener;

.field private final lock:Ljava/util/concurrent/locks/Lock;

.field private machineMeasurementConsumer:Lcom/newrelic/agent/android/sample/MachineMeasurementConsumer;

.field private savedState:Lcom/newrelic/agent/android/SavedState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 75
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    .line 91
    invoke-static {}, Lcom/newrelic/agent/android/connectivity/CatFacade;->getInstance()Lcom/newrelic/agent/android/connectivity/CatFacade;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/AndroidAgentImpl;->catFacade:Lcom/newrelic/agent/android/connectivity/CatFacade;

    .line 627
    new-instance v0, Lcom/newrelic/agent/android/AndroidAgentImpl$1;

    invoke-direct {v0}, Lcom/newrelic/agent/android/AndroidAgentImpl$1;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/AndroidAgentImpl;->cmp:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/newrelic/agent/android/AgentConfiguration;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/newrelic/agent/android/AgentInitializationException;
        }
    .end annotation

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->lock:Ljava/util/concurrent/locks/Lock;

    .line 83
    new-instance v0, Lcom/newrelic/agent/android/util/AndroidEncoder;

    invoke-direct {v0}, Lcom/newrelic/agent/android/util/AndroidEncoder;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->encoder:Lcom/newrelic/agent/android/util/Encoder;

    .line 98
    invoke-static {p1}, Lcom/newrelic/agent/android/AndroidAgentImpl;->appContext(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->context:Landroid/content/Context;

    .line 99
    iput-object p2, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    .line 101
    new-instance v0, Lcom/newrelic/agent/android/SavedState;

    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/newrelic/agent/android/SavedState;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    .line 103
    invoke-virtual {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->isDisabled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 107
    invoke-virtual {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->initApplicationInformation()V

    .line 109
    invoke-virtual {p2}, Lcom/newrelic/agent/android/AgentConfiguration;->useLocationService()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    invoke-virtual {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->getApplicationInformation()Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    move-result-object v2

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->getPackageId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    .line 110
    sget-object v0, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Location stats enabled"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 111
    invoke-direct {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->addLocationListener()V

    .line 115
    :cond_0
    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->setTraceMachineInterface(Lcom/newrelic/agent/android/api/v2/TraceMachineInterface;)V

    .line 117
    new-instance v0, Lcom/newrelic/agent/android/stores/SharedPrefsCrashStore;

    invoke-direct {v0, p1}, Lcom/newrelic/agent/android/stores/SharedPrefsCrashStore;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Lcom/newrelic/agent/android/AgentConfiguration;->setCrashStore(Lcom/newrelic/agent/android/crash/CrashStore;)V

    .line 118
    new-instance v0, Lcom/newrelic/agent/android/stores/SharedPrefsPayloadStore;

    invoke-direct {v0, p1}, Lcom/newrelic/agent/android/stores/SharedPrefsPayloadStore;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Lcom/newrelic/agent/android/AgentConfiguration;->setPayloadStore(Lcom/newrelic/agent/android/payload/PayloadStore;)V

    .line 119
    new-instance v0, Lcom/newrelic/agent/android/stores/SharedPrefsAnalyticAttributeStore;

    invoke-direct {v0, p1}, Lcom/newrelic/agent/android/stores/SharedPrefsAnalyticAttributeStore;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Lcom/newrelic/agent/android/AgentConfiguration;->setAnalyticAttributeStore(Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;)V

    .line 121
    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object p2

    invoke-virtual {p2, p0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->addApplicationStateListener(Lcom/newrelic/agent/android/background/ApplicationStateListener;)V

    .line 123
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0xe

    if-lt p2, v0, :cond_3

    .line 127
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getUnityInstrumentationFlag()Ljava/lang/String;

    move-result-object p2

    const-string v0, "YES"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 128
    new-instance p2, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;

    invoke-direct {p2}, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;-><init>()V

    .line 129
    instance-of v0, p2, Landroid/app/Application$ActivityLifecycleCallbacks;

    if-eqz v0, :cond_2

    .line 131
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Application;

    if-eqz v0, :cond_2

    .line 132
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    .line 133
    move-object v1, p2

    check-cast v1, Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {v0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 140
    :cond_1
    new-instance p2, Lcom/newrelic/agent/android/util/UiBackgroundListener;

    invoke-direct {p2}, Lcom/newrelic/agent/android/util/UiBackgroundListener;-><init>()V

    .line 143
    :catch_0
    :cond_2
    :goto_0
    invoke-virtual {p1, p2}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 146
    :cond_3
    invoke-virtual {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->setupSession()V

    return-void

    .line 104
    :cond_4
    new-instance p1, Lcom/newrelic/agent/android/AgentInitializationException;

    const-string p2, "This version of the agent has been disabled"

    invoke-direct {p1, p2}, Lcom/newrelic/agent/android/AgentInitializationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$000(Lcom/newrelic/agent/android/AndroidAgentImpl;Landroid/location/Location;)Z
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/AndroidAgentImpl;->isAccurate(Landroid/location/Location;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$100(Lcom/newrelic/agent/android/AndroidAgentImpl;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->removeLocationListener()V

    return-void
.end method

.method private addLocationListener()V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 642
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->context:Landroid/content/Context;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/location/LocationManager;

    if-nez v1, :cond_0

    .line 644
    sget-object v0, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Unable to retrieve reference to LocationManager. Disabling location listener."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return-void

    .line 648
    :cond_0
    new-instance v0, Lcom/newrelic/agent/android/AndroidAgentImpl$2;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/AndroidAgentImpl$2;-><init>(Lcom/newrelic/agent/android/AndroidAgentImpl;)V

    iput-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->locationListener:Landroid/location/LocationListener;

    const-string v2, "passive"

    const-wide/16 v3, 0x3e8

    const/4 v5, 0x0

    .line 673
    iget-object v6, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->locationListener:Landroid/location/LocationListener;

    invoke-virtual/range {v1 .. v6}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    return-void
.end method

.method private static appContext(Landroid/content/Context;)Landroid/content/Context;
    .locals 1

    .line 381
    instance-of v0, p0, Landroid/app/Application;

    if-nez v0, :cond_0

    .line 382
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p0
.end method

.method private static deviceForm(Landroid/content/Context;)Lcom/newrelic/agent/android/api/v1/DeviceForm;
    .locals 1

    .line 356
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 p0, p0, 0xf

    packed-switch p0, :pswitch_data_0

    const/4 v0, 0x3

    if-le p0, v0, :cond_0

    .line 372
    sget-object p0, Lcom/newrelic/agent/android/api/v1/DeviceForm;->XLARGE:Lcom/newrelic/agent/android/api/v1/DeviceForm;

    return-object p0

    .line 365
    :pswitch_0
    sget-object p0, Lcom/newrelic/agent/android/api/v1/DeviceForm;->LARGE:Lcom/newrelic/agent/android/api/v1/DeviceForm;

    return-object p0

    .line 362
    :pswitch_1
    sget-object p0, Lcom/newrelic/agent/android/api/v1/DeviceForm;->NORMAL:Lcom/newrelic/agent/android/api/v1/DeviceForm;

    return-object p0

    .line 359
    :pswitch_2
    sget-object p0, Lcom/newrelic/agent/android/api/v1/DeviceForm;->SMALL:Lcom/newrelic/agent/android/api/v1/DeviceForm;

    return-object p0

    .line 374
    :cond_0
    sget-object p0, Lcom/newrelic/agent/android/api/v1/DeviceForm;->UNKNOWN:Lcom/newrelic/agent/android/api/v1/DeviceForm;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private getUUID()Ljava/lang/String;
    .locals 2

    .line 714
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/SavedState;->getConnectInformation()Lcom/newrelic/agent/android/harvest/ConnectInformation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/ConnectInformation;->getDeviceInformation()Lcom/newrelic/agent/android/harvest/DeviceInformation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    .line 715
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 716
    new-instance v0, Lcom/newrelic/agent/android/util/PersistentUUID;

    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/newrelic/agent/android/util/PersistentUUID;-><init>(Landroid/content/Context;)V

    .line 717
    invoke-virtual {v0}, Lcom/newrelic/agent/android/util/PersistentUUID;->getPersistentUUID()Ljava/lang/String;

    move-result-object v0

    .line 718
    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    invoke-virtual {v1, v0}, Lcom/newrelic/agent/android/SavedState;->saveDeviceId(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method private getUnhandledExceptionHandlerName()Ljava/lang/String;
    .locals 1

    .line 725
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, "unknown"

    return-object v0
.end method

.method public static init(Landroid/content/Context;Lcom/newrelic/agent/android/AgentConfiguration;)V
    .locals 2

    .line 532
    :try_start_0
    new-instance v0, Lcom/newrelic/agent/android/AndroidAgentImpl;

    invoke-direct {v0, p0, p1}, Lcom/newrelic/agent/android/AndroidAgentImpl;-><init>(Landroid/content/Context;Lcom/newrelic/agent/android/AgentConfiguration;)V

    invoke-static {v0}, Lcom/newrelic/agent/android/Agent;->setImpl(Lcom/newrelic/agent/android/AgentImpl;)V

    .line 533
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->start()V
    :try_end_0
    .catch Lcom/newrelic/agent/android/AgentInitializationException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 535
    sget-object p1, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to initialize the agent: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/AgentInitializationException;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return-void
.end method

.method private isAccurate(Landroid/location/Location;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/high16 v1, 0x43fa0000    # 500.0f

    .line 705
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result p1

    cmpl-float p1, v1, p1

    if-ltz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method private pokeCanary()V
    .locals 0

    .line 754
    invoke-static {}, Lproguard/canary/NewRelicCanary;->canaryMethod()V

    return-void
.end method

.method private removeLocationListener()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 678
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->locationListener:Landroid/location/LocationListener;

    if-nez v0, :cond_0

    return-void

    .line 683
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->context:Landroid/content/Context;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    if-nez v0, :cond_1

    .line 685
    sget-object v0, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Unable to retrieve reference to LocationManager. Can\'t unregister location listener."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return-void

    .line 689
    :cond_1
    monitor-enter v0

    .line 690
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->locationListener:Landroid/location/LocationListener;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    const/4 v1, 0x0

    .line 691
    iput-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->locationListener:Landroid/location/LocationListener;

    .line 692
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public addTransactionData(Lcom/newrelic/agent/android/api/common/TransactionData;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public applicationBackgrounded(Lcom/newrelic/agent/android/background/ApplicationStateEvent;)V
    .locals 1

    .line 571
    sget-object p1, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "AndroidAgentImpl: application backgrounded"

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 572
    invoke-virtual {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->stop()V

    return-void
.end method

.method public applicationForegrounded(Lcom/newrelic/agent/android/background/ApplicationStateEvent;)V
    .locals 1

    .line 565
    sget-object p1, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "AndroidAgentImpl: application foregrounded"

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 566
    invoke-virtual {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->start()V

    return-void
.end method

.method public connected(Lcom/newrelic/agent/android/api/v1/ConnectionEvent;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 548
    sget-object p1, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "AndroidAgentImpl: connected "

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return-void
.end method

.method public disable()V
    .locals 3

    .line 500
    sget-object v0, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PERMANENTLY DISABLING AGENT v"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 502
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/SavedState;->saveDisabledVersion(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 505
    :try_start_1
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->stop(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 507
    sget-object v0, Lcom/newrelic/agent/android/NullAgentImpl;->instance:Lcom/newrelic/agent/android/NullAgentImpl;

    invoke-static {v0}, Lcom/newrelic/agent/android/Agent;->setImpl(Lcom/newrelic/agent/android/AgentImpl;)V

    return-void

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/newrelic/agent/android/NullAgentImpl;->instance:Lcom/newrelic/agent/android/NullAgentImpl;

    invoke-static {v1}, Lcom/newrelic/agent/android/Agent;->setImpl(Lcom/newrelic/agent/android/AgentImpl;)V

    throw v0

    :catchall_1
    move-exception v1

    .line 505
    :try_start_2
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->stop(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 507
    sget-object v0, Lcom/newrelic/agent/android/NullAgentImpl;->instance:Lcom/newrelic/agent/android/NullAgentImpl;

    invoke-static {v0}, Lcom/newrelic/agent/android/Agent;->setImpl(Lcom/newrelic/agent/android/AgentImpl;)V

    throw v1

    :catchall_2
    move-exception v0

    sget-object v1, Lcom/newrelic/agent/android/NullAgentImpl;->instance:Lcom/newrelic/agent/android/NullAgentImpl;

    invoke-static {v1}, Lcom/newrelic/agent/android/Agent;->setImpl(Lcom/newrelic/agent/android/AgentImpl;)V

    throw v0
.end method

.method public disconnected(Lcom/newrelic/agent/android/api/v1/ConnectionEvent;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 559
    iget-object p1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    invoke-virtual {p1}, Lcom/newrelic/agent/android/SavedState;->clear()V

    return-void
.end method

.method protected finalizeSession()V
    .locals 0

    return-void
.end method

.method public getAndClearTransactionData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/api/common/TransactionData;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getApplicationInformation()Lcom/newrelic/agent/android/harvest/ApplicationInformation;
    .locals 1

    .line 347
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->applicationInformation:Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    return-object v0
.end method

.method public getCatFacade()Lcom/newrelic/agent/android/connectivity/CatFacade;
    .locals 1

    .line 419
    sget-object v0, Lcom/newrelic/agent/android/AndroidAgentImpl;->catFacade:Lcom/newrelic/agent/android/connectivity/CatFacade;

    return-object v0
.end method

.method public getCrossProcessId()Ljava/lang/String;
    .locals 2

    .line 409
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 411
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/SavedState;->getCrossProcessId()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 413
    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public getCurrentThreadId()J
    .locals 2

    .line 740
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    return-wide v0
.end method

.method public getCurrentThreadName()Ljava/lang/String;
    .locals 1

    .line 750
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceInformation()Lcom/newrelic/agent/android/harvest/DeviceInformation;
    .locals 3

    .line 224
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

    if-eqz v0, :cond_0

    return-object v0

    .line 227
    :cond_0
    new-instance v0, Lcom/newrelic/agent/android/harvest/DeviceInformation;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/DeviceInformation;-><init>()V

    const-string v1, "Android"

    .line 229
    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setOsName(Ljava/lang/String;)V

    .line 230
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setOsVersion(Ljava/lang/String;)V

    .line 231
    sget-object v1, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setOsBuild(Ljava/lang/String;)V

    .line 232
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setModel(Ljava/lang/String;)V

    const-string v1, "AndroidAgent"

    .line 233
    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setAgentName(Ljava/lang/String;)V

    .line 234
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setAgentVersion(Ljava/lang/String;)V

    .line 235
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setManufacturer(Ljava/lang/String;)V

    .line 236
    invoke-direct {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->getUUID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setDeviceId(Ljava/lang/String;)V

    const-string v1, "os.arch"

    .line 237
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setArchitecture(Ljava/lang/String;)V

    const-string v1, "java.vm.version"

    .line 238
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setRunTime(Ljava/lang/String;)V

    .line 239
    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->context:Landroid/content/Context;

    invoke-static {v1}, Lcom/newrelic/agent/android/AndroidAgentImpl;->deviceForm(Landroid/content/Context;)Lcom/newrelic/agent/android/api/v1/DeviceForm;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/agent/android/api/v1/DeviceForm;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setSize(Ljava/lang/String;)V

    .line 240
    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/AgentConfiguration;->getApplicationPlatform()Lcom/newrelic/agent/android/ApplicationPlatform;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setApplicationPlatform(Lcom/newrelic/agent/android/ApplicationPlatform;)V

    .line 241
    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/AgentConfiguration;->getApplicationPlatformVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setApplicationPlatformVersion(Ljava/lang/String;)V

    .line 243
    iput-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

    .line 245
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

    return-object v0
.end method

.method public getEncoder()Lcom/newrelic/agent/android/util/Encoder;
    .locals 1

    .line 732
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->encoder:Lcom/newrelic/agent/android/util/Encoder;

    return-object v0
.end method

.method public getEnvironmentInformation()Lcom/newrelic/agent/android/harvest/EnvironmentInformation;
    .locals 13

    .line 250
    new-instance v0, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;-><init>()V

    .line 251
    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->context:Landroid/content/Context;

    const-string v2, "activity"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager;

    const/4 v2, 0x2

    .line 253
    new-array v2, v2, [J

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    .line 255
    :try_start_0
    new-instance v7, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    move-result-object v8

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 257
    new-instance v8, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v9

    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 259
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x12

    if-lt v9, v10, :cond_0

    .line 260
    invoke-virtual {v7}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v9

    invoke-virtual {v7}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v11

    mul-long v9, v9, v11

    aput-wide v9, v2, v4

    .line 261
    invoke-virtual {v8}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v8

    invoke-virtual {v7}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v10

    mul-long v8, v8, v10

    aput-wide v8, v2, v3

    goto :goto_0

    .line 263
    :cond_0
    invoke-virtual {v7}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v9

    invoke-virtual {v7}, Landroid/os/StatFs;->getBlockSize()I

    move-result v7

    mul-int v9, v9, v7

    int-to-long v9, v9

    aput-wide v9, v2, v4

    .line 264
    invoke-virtual {v8}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v7

    invoke-virtual {v8}, Landroid/os/StatFs;->getBlockSize()I

    move-result v8

    mul-int v7, v7, v8

    int-to-long v7, v7

    aput-wide v7, v2, v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 270
    :goto_0
    aget-wide v7, v2, v4

    cmp-long v9, v7, v5

    if-gez v9, :cond_1

    aput-wide v5, v2, v4

    .line 272
    :cond_1
    aget-wide v7, v2, v3

    cmp-long v4, v7, v5

    if-gez v4, :cond_3

    aput-wide v5, v2, v3

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v7

    .line 267
    :try_start_1
    invoke-static {v7}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 270
    aget-wide v7, v2, v4

    cmp-long v9, v7, v5

    if-gez v9, :cond_2

    aput-wide v5, v2, v4

    .line 272
    :cond_2
    aget-wide v7, v2, v3

    cmp-long v4, v7, v5

    if-gez v4, :cond_3

    aput-wide v5, v2, v3

    .line 275
    :cond_3
    :goto_1
    invoke-virtual {v0, v2}, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->setDiskAvailable([J)V

    .line 277
    invoke-static {v1}, Lcom/newrelic/agent/android/sample/Sampler;->sampleMemory(Landroid/app/ActivityManager;)Lcom/newrelic/agent/android/tracing/Sample;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/agent/android/tracing/Sample;->getSampleValue()Lcom/newrelic/agent/android/tracing/SampleValue;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/agent/android/tracing/SampleValue;->asLong()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->setMemoryUsage(J)V

    .line 278
    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->setOrientation(I)V

    .line 279
    invoke-virtual {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->getNetworkCarrier()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->setNetworkStatus(Ljava/lang/String;)V

    .line 280
    invoke-virtual {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->getNetworkWanType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->setNetworkWanType(Ljava/lang/String;)V

    return-object v0

    .line 270
    :goto_2
    aget-wide v7, v2, v4

    cmp-long v9, v7, v5

    if-gez v9, :cond_4

    aput-wide v5, v2, v4

    .line 272
    :cond_4
    aget-wide v7, v2, v3

    cmp-long v4, v7, v5

    if-gez v4, :cond_5

    aput-wide v5, v2, v3

    .line 275
    :cond_5
    invoke-virtual {v0, v2}, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->setDiskAvailable([J)V

    throw v1
.end method

.method public getNetworkCarrier()Ljava/lang/String;
    .locals 1

    .line 517
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/newrelic/agent/android/util/Connectivity;->carrierNameFromContext(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getNetworkWanType()Ljava/lang/String;
    .locals 1

    .line 521
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/newrelic/agent/android/util/Connectivity;->wanType(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getResponseBodyLimit()I
    .locals 2

    .line 434
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 436
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/SavedState;->getHarvestConfiguration()Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getResponse_body_limit()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 438
    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method protected getSavedState()Lcom/newrelic/agent/android/SavedState;
    .locals 1

    .line 758
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    return-object v0
.end method

.method public getSessionDurationMillis()J
    .locals 2

    .line 352
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->getMillisSinceStart()J

    move-result-wide v0

    return-wide v0
.end method

.method public getStackTraceLimit()I
    .locals 2

    .line 424
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 426
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/SavedState;->getStackTraceLimit()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 428
    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public hasReachableNetworkConnection(Ljava/lang/String;)Z
    .locals 1

    .line 766
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->context:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/newrelic/agent/android/util/Reachability;->hasReachableNetworkConnection(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public initApplicationInformation()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/newrelic/agent/android/AgentInitializationException;
        }
    .end annotation

    .line 286
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->applicationInformation:Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    if-eqz v0, :cond_0

    .line 287
    sget-object v0, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "attempted to reinitialize ApplicationInformation."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    return-void

    .line 291
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 292
    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    .line 296
    :try_start_0
    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 301
    iget-object v4, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v4}, Lcom/newrelic/agent/android/AgentConfiguration;->getCustomApplicationVersion()Ljava/lang/String;

    move-result-object v4

    .line 302
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    if-eqz v3, :cond_1

    .line 303
    iget-object v4, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-eqz v4, :cond_1

    iget-object v4, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_1

    .line 304
    iget-object v4, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    goto :goto_0

    .line 306
    :cond_1
    new-instance v0, Lcom/newrelic/agent/android/AgentInitializationException;

    const-string v1, "Your app doesn\'t appear to have a version defined. Ensure you have defined \'versionName\' in your manifest."

    invoke-direct {v0, v1}, Lcom/newrelic/agent/android/AgentInitializationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 310
    :cond_2
    :goto_0
    sget-object v5, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Using application version "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 314
    :try_start_1
    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 316
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_3
    move-object v1, v0

    goto :goto_2

    :catch_0
    move-exception v1

    .line 324
    sget-object v2, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    invoke-virtual {v1}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v1

    .line 321
    sget-object v2, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    :goto_1
    move-object v1, v0

    .line 327
    :goto_2
    sget-object v2, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Using application name "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 329
    iget-object v2, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/AgentConfiguration;->getCustomBuildIdentifier()Ljava/lang/String;

    move-result-object v2

    .line 330
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_5

    if-eqz v3, :cond_4

    .line 333
    iget v2, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :cond_4
    const-string v2, ""

    .line 336
    sget-object v5, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v6, "Your app doesn\'t appear to have a version code defined. Ensure you have defined \'versionCode\' in your manifest."

    invoke-interface {v5, v6}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    .line 339
    :cond_5
    :goto_3
    sget-object v5, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Using build "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 341
    new-instance v5, Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    invoke-direct {v5, v1, v4, v0, v2}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v5, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->applicationInformation:Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    .line 342
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->applicationInformation:Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    iget v1, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->setVersionCode(I)V

    return-void

    :catch_2
    move-exception v0

    .line 298
    new-instance v1, Lcom/newrelic/agent/android/AgentInitializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not determine package version: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/newrelic/agent/android/AgentInitializationException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected initialize()V
    .locals 6

    .line 151
    invoke-virtual {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->setupSession()V

    .line 155
    invoke-static {}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getInstance()Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-static {v0, p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->initialize(Lcom/newrelic/agent/android/AgentConfiguration;Lcom/newrelic/agent/android/AgentImpl;)V

    .line 157
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/Harvest;->addHarvestListener(Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;)V

    .line 158
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/Harvest;->initialize(Lcom/newrelic/agent/android/AgentConfiguration;)V

    .line 159
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/SavedState;->getHarvestConfiguration()Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    move-result-object v0

    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/Harvest;->setHarvestConfiguration(Lcom/newrelic/agent/android/harvest/HarvestConfiguration;)V

    .line 160
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/SavedState;->getConnectInformation()Lcom/newrelic/agent/android/harvest/ConnectInformation;

    move-result-object v0

    invoke-static {v0}, Lcom/newrelic/agent/android/harvest/Harvest;->setHarvestConnectInformation(Lcom/newrelic/agent/android/harvest/ConnectInformation;)V

    .line 162
    invoke-static {}, Lcom/newrelic/agent/android/Measurements;->initialize()V

    .line 163
    sget-object v0, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "New Relic Agent v{0}"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getVersion()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v3}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 164
    sget-object v0, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Application token: {0}"

    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v4}, Lcom/newrelic/agent/android/AgentConfiguration;->getApplicationToken()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v1, v3}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 166
    new-instance v0, Lcom/newrelic/agent/android/sample/MachineMeasurementConsumer;

    invoke-direct {v0}, Lcom/newrelic/agent/android/sample/MachineMeasurementConsumer;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->machineMeasurementConsumer:Lcom/newrelic/agent/android/sample/MachineMeasurementConsumer;

    .line 167
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->machineMeasurementConsumer:Lcom/newrelic/agent/android/sample/MachineMeasurementConsumer;

    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->addMeasurementConsumer(Lcom/newrelic/agent/android/measurement/consumer/MeasurementConsumer;)V

    .line 169
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Supportability/AgentHealth/UncaughtExceptionHandler/"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->getUnhandledExceptionHandlerName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/stats/StatsEngine;->inc(Ljava/lang/String;)V

    .line 170
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-static {v0}, Lcom/newrelic/agent/android/payload/PayloadController;->initialize(Lcom/newrelic/agent/android/AgentConfiguration;)Lcom/newrelic/agent/android/payload/PayloadController;

    .line 173
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/newrelic/agent/android/sample/Sampler;->init(Landroid/content/Context;)V

    .line 175
    invoke-virtual {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->isInstantApp()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 176
    sget-object v0, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "This appears to be an Instant App"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 177
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v1, "instantApp"

    invoke-direct {v0, v1, v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Z)V

    .line 178
    invoke-static {}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getInstance()Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    move-result-object v1

    invoke-virtual {v1, v0, v5}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->addAttributeUnchecked(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;Z)Z

    :cond_0
    return-void
.end method

.method public isDisabled()Z
    .locals 2

    .line 513
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getVersion()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/SavedState;->getDisabledVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isInstantApp()Z
    .locals 1

    .line 771
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/newrelic/agent/android/InstantApps;->isInstantApp(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public isUIThread()Z
    .locals 2

    .line 745
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public mergeTransactionData(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/api/common/TransactionData;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setLocation(Landroid/location/Location;)V
    .locals 7

    if-eqz p1, :cond_4

    .line 596
    new-instance v0, Landroid/location/Geocoder;

    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x0

    .line 599
    :try_start_0
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Landroid/location/Geocoder;->getFromLocation(DDI)Ljava/util/List;

    move-result-object v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 601
    sget-object v0, Lcom/newrelic/agent/android/AndroidAgentImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to geocode location: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :goto_0
    if-eqz v6, :cond_3

    .line 604
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    .line 609
    invoke-interface {v6, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/Address;

    if-nez p1, :cond_1

    return-void

    .line 615
    :cond_1
    invoke-virtual {p1}, Landroid/location/Address;->getCountryCode()Ljava/lang/String;

    move-result-object v0

    .line 616
    invoke-virtual {p1}, Landroid/location/Address;->getAdminArea()Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    .line 619
    invoke-virtual {p0, v0, p1}, Lcom/newrelic/agent/android/AndroidAgentImpl;->setLocation(Ljava/lang/String;Ljava/lang/String;)V

    .line 620
    invoke-direct {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->removeLocationListener()V

    :cond_2
    return-void

    :cond_3
    :goto_1
    return-void

    .line 593
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Location must not be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setLocation(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    return-void

    .line 578
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Country code and administrative region are required."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected setSavedState(Lcom/newrelic/agent/android/SavedState;)V
    .locals 0

    .line 762
    iput-object p1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    return-void
.end method

.method protected setupSession()V
    .locals 1

    .line 184
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->clearActivityHistory()V

    .line 185
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/AgentConfiguration;->provideSessionId()Ljava/lang/String;

    return-void
.end method

.method public start()V
    .locals 2

    .line 444
    invoke-virtual {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->isDisabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 445
    invoke-virtual {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->initialize()V

    .line 446
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->start()V

    .line 447
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->DistributedTracing:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 449
    invoke-static {}, Lcom/newrelic/agent/android/connectivity/UserActionFacade;->getInstance()Lcom/newrelic/agent/android/connectivity/UserActionFacade;

    move-result-object v0

    sget-object v1, Lcom/newrelic/agent/android/connectivity/UserActionType;->AppLaunch:Lcom/newrelic/agent/android/connectivity/UserActionType;

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/connectivity/UserActionFacade;->recordUserAction(Lcom/newrelic/agent/android/connectivity/UserActionType;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 456
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->stop(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public stop()V
    .locals 1

    const/4 v0, 0x1

    .line 462
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->stop(Z)V

    return-void
.end method

.method stop(Z)V
    .locals 10

    .line 467
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->DistributedTracing:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 469
    invoke-static {}, Lcom/newrelic/agent/android/connectivity/UserActionFacade;->getInstance()Lcom/newrelic/agent/android/connectivity/UserActionFacade;

    move-result-object v0

    sget-object v1, Lcom/newrelic/agent/android/connectivity/UserActionType;->AppBackground:Lcom/newrelic/agent/android/connectivity/UserActionType;

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/connectivity/UserActionFacade;->recordUserAction(Lcom/newrelic/agent/android/connectivity/UserActionType;)V

    .line 473
    :cond_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->finalizeSession()V

    .line 475
    invoke-static {}, Lcom/newrelic/agent/android/sample/Sampler;->shutdown()V

    .line 476
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->haltTracing()V

    .line 480
    invoke-static {}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getInstance()Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getEventManager()Lcom/newrelic/agent/android/analytics/EventManager;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/analytics/EventManager;->getEventsRecorded()I

    move-result v3

    .line 481
    invoke-static {}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getInstance()Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getEventManager()Lcom/newrelic/agent/android/analytics/EventManager;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/analytics/EventManager;->getEventsEjected()I

    move-result v0

    const-string v1, "Supportability/Events/Recorded"

    .line 482
    sget-object v2, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->NONE:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->name()Ljava/lang/String;

    move-result-object v2

    int-to-double v6, v0

    sget-object v8, Lcom/newrelic/agent/android/metric/MetricUnit;->OPERATIONS:Lcom/newrelic/agent/android/metric/MetricUnit;

    sget-object v9, Lcom/newrelic/agent/android/metric/MetricUnit;->OPERATIONS:Lcom/newrelic/agent/android/metric/MetricUnit;

    move-wide v4, v6

    invoke-static/range {v1 .. v9}, Lcom/newrelic/agent/android/Measurements;->addCustomMetric(Ljava/lang/String;Ljava/lang/String;IDDLcom/newrelic/agent/android/metric/MetricUnit;Lcom/newrelic/agent/android/metric/MetricUnit;)V

    if-eqz p1, :cond_2

    .line 485
    invoke-virtual {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->isUIThread()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 486
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object p1

    const-string v0, "Supportability/AgentHealth/HarvestOnMainThread"

    invoke-virtual {p1, v0}, Lcom/newrelic/agent/android/stats/StatsEngine;->inc(Ljava/lang/String;)V

    .line 488
    :cond_1
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->harvestNow()V

    .line 491
    :cond_2
    invoke-static {}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->shutdown()V

    .line 492
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->clearActivityHistory()V

    .line 493
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->shutdown()V

    .line 494
    invoke-static {}, Lcom/newrelic/agent/android/Measurements;->shutdown()V

    .line 495
    invoke-static {}, Lcom/newrelic/agent/android/payload/PayloadController;->shutdown()V

    return-void
.end method

.method public updateSavedConnectInformation()Z
    .locals 5

    .line 196
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/SavedState;->getConnectInformation()Lcom/newrelic/agent/android/harvest/ConnectInformation;

    move-result-object v0

    .line 197
    new-instance v1, Lcom/newrelic/agent/android/harvest/ConnectInformation;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->getApplicationInformation()Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    move-result-object v2

    invoke-virtual {p0}, Lcom/newrelic/agent/android/AndroidAgentImpl;->getDeviceInformation()Lcom/newrelic/agent/android/harvest/DeviceInformation;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/newrelic/agent/android/harvest/ConnectInformation;-><init>(Lcom/newrelic/agent/android/harvest/ApplicationInformation;Lcom/newrelic/agent/android/harvest/DeviceInformation;)V

    .line 198
    iget-object v2, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/SavedState;->getAppToken()Ljava/lang/String;

    move-result-object v2

    .line 200
    invoke-virtual {v1, v0}, Lcom/newrelic/agent/android/harvest/ConnectInformation;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v3}, Lcom/newrelic/agent/android/AgentConfiguration;->getApplicationToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    return v4

    .line 204
    :cond_1
    :goto_0
    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/ConnectInformation;->getApplicationInformation()Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    move-result-object v2

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/ConnectInformation;->getApplicationInformation()Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->isAppUpgrade(Lcom/newrelic/agent/android/harvest/ApplicationInformation;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 205
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object v2

    const-string v3, "Mobile/App/Upgrade"

    invoke-virtual {v2, v3}, Lcom/newrelic/agent/android/stats/StatsEngine;->inc(Ljava/lang/String;)V

    .line 207
    new-instance v2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v3, "upgradeFrom"

    .line 208
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/ConnectInformation;->getApplicationInformation()Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->getAppVersion()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    invoke-static {}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getInstance()Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    move-result-object v0

    invoke-virtual {v0, v2, v4}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->addAttributeUnchecked(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;Z)Z

    .line 212
    :cond_2
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/SavedState;->clear()V

    .line 213
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/SavedState;->saveConnectInformation(Lcom/newrelic/agent/android/harvest/ConnectInformation;)V

    .line 214
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->savedState:Lcom/newrelic/agent/android/SavedState;

    iget-object v1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/AgentConfiguration;->getApplicationToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/SavedState;->saveAppToken(Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0
.end method
