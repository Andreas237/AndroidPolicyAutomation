.class public final Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusListenerFactory;
.super Ljava/lang/Object;
.source "AppGeofenceModule_ProvideRadarGeofenceStatusListenerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;",
        ">;"
    }
.end annotation


# instance fields
.field private final authManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;"
        }
    .end annotation
.end field

.field private final radarGeofenceConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final userStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusListenerFactory;->radarGeofenceConfigProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusListenerFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusListenerFactory;->authManagerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusListenerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;)",
            "Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusListenerFactory;"
        }
    .end annotation

    .line 50
    new-instance v0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusListenerFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusListenerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;)",
            "Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;"
        }
    .end annotation

    .line 43
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/user/UserState;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 42
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusListenerFactory;->proxyProvideRadarGeofenceStatusListener(Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;)Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideRadarGeofenceStatusListener(Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;)Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;
    .locals 0

    .line 57
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/AppGeofenceModule;->provideRadarGeofenceStatusListener(Lcom/ibotta/android/location/geofence/radar/RadarGeofenceConfig;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;)Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 56
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusListenerFactory;->radarGeofenceConfigProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusListenerFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusListenerFactory;->authManagerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusListenerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideRadarGeofenceStatusListenerFactory;->get()Lcom/ibotta/android/location/geofence/radar/RadarGeofenceStatusListener;

    move-result-object v0

    return-object v0
.end method
