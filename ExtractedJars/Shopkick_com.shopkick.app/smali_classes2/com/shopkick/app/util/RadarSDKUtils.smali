.class public Lcom/shopkick/app/util/RadarSDKUtils;
.super Ljava/lang/Object;
.source "RadarSDKUtils.java"


# static fields
.field private static final RADAR_PROD_KEY:Ljava/lang/String; = "org_live_pk_8db3d87ce97bf026df8b0ffeec4feeef46bd9976"

.field private static final RADAR_TEST_KEY:Ljava/lang/String; = "org_test_pk_ffcf1b690e0a454fdc38f17c81c19ed4266b0bd4"

.field private static isSdkInitialized:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static initializeRadarSdk()V
    .locals 1

    .line 42
    invoke-static {}, Lcom/shopkick/app/application/SKApp;->getInstance()Lcom/shopkick/app/application/SKApp;

    move-result-object v0

    .line 43
    invoke-virtual {v0}, Lcom/shopkick/app/application/SKApp;->isProdEnv()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/shopkick/app/util/RadarSDKUtils;->RADAR_PROD_KEY:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/shopkick/app/util/RadarSDKUtils;->RADAR_TEST_KEY:Ljava/lang/String;

    :goto_0
    invoke-static {v0}, Lio/radar/sdk/Radar;->initialize(Ljava/lang/String;)V

    .line 44
    sget-object v0, Lio/radar/sdk/Radar$RadarPlacesProvider;->FACEBOOK:Lio/radar/sdk/Radar$RadarPlacesProvider;

    invoke-static {v0}, Lio/radar/sdk/Radar;->setPlacesProvider(Lio/radar/sdk/Radar$RadarPlacesProvider;)V

    return-void
.end method

.method public static declared-synchronized stopRadarTracking(Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 1

    const-class v0, Lcom/shopkick/app/util/RadarSDKUtils;

    monitor-enter v0

    .line 36
    :try_start_0
    invoke-static {p0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isRadarSDKIntegrationEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-boolean p0, Lcom/shopkick/app/util/RadarSDKUtils;->isSdkInitialized:Z

    if-eqz p0, :cond_0

    invoke-static {}, Lio/radar/sdk/Radar;->isTracking()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 37
    invoke-static {}, Lio/radar/sdk/Radar;->stopTracking()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized updateRadarTracking(Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 2

    const-class v0, Lcom/shopkick/app/util/RadarSDKUtils;

    monitor-enter v0

    .line 18
    :try_start_0
    invoke-static {p1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isRadarSDKIntegrationEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 19
    monitor-exit v0

    return-void

    .line 22
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsRegistered()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 23
    sget-boolean p1, Lcom/shopkick/app/util/RadarSDKUtils;->isSdkInitialized:Z

    if-nez p1, :cond_1

    .line 24
    invoke-static {}, Lcom/shopkick/app/util/RadarSDKUtils;->initializeRadarSdk()V

    const/4 p1, 0x1

    .line 25
    sput-boolean p1, Lcom/shopkick/app/util/RadarSDKUtils;->isSdkInitialized:Z

    .line 28
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserId()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lio/radar/sdk/Radar;->setUserId(Ljava/lang/String;)V

    .line 29
    invoke-static {}, Lio/radar/sdk/Radar;->startTracking()V

    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, Lcom/shopkick/app/util/RadarSDKUtils;->stopRadarTracking(Lcom/shopkick/app/application/ClientFlagsManager;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
