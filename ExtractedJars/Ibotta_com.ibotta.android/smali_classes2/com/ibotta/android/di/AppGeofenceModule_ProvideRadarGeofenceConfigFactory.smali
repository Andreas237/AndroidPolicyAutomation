.class public final Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;
.super Ljava/lang/Object;
.source "AppGeofenceModule_ProvideRadarGeofenceConfigFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;",
        ">;"
    }
.end annotation


# instance fields
.field private final appConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final buildProfileProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;"
        }
    .end annotation
.end field

.field private final debugStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;"
        }
    .end annotation
.end field

.field private final geofenceConfigHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;->geofenceConfigHelperProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;->buildProfileProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;->debugStateProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;)",
            "Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;"
        }
    .end annotation

    .line 61
    new-instance v0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;)",
            "Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;"
        }
    .end annotation

    .line 50
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 51
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;

    .line 52
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/profile/BuildProfile;

    .line 53
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 49
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;->proxyProvideRadarGeofenceConfig(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/debug/DebugState;)Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideRadarGeofenceConfig(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/debug/DebugState;)Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;
    .locals 0

    .line 71
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/AppGeofenceModule;->provideRadarGeofenceConfig(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/location/geofence/GeofenceConfigHelper;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/debug/DebugState;)Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 70
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;
    .locals 4

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;->geofenceConfigHelperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;->buildProfileProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;->debugStateProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceConfigFactory;->get()Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;

    move-result-object v0

    return-object v0
.end method
