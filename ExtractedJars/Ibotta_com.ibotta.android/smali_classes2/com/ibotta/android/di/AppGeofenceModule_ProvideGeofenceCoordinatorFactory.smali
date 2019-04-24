.class public final Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceCoordinatorFactory;
.super Ljava/lang/Object;
.source "AppGeofenceModule_ProvideGeofenceCoordinatorFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
        ">;"
    }
.end annotation


# instance fields
.field private final locationStatusDispatcherProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/LocationStatusDispatcher;",
            ">;"
        }
    .end annotation
.end field

.field private final radarGeofenceStatusManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceStatusManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceStatusManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/LocationStatusDispatcher;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceCoordinatorFactory;->radarGeofenceStatusManagerProvider:Ljavax/inject/Provider;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceCoordinatorFactory;->locationStatusDispatcherProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceCoordinatorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceStatusManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/LocationStatusDispatcher;",
            ">;)",
            "Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceCoordinatorFactory;"
        }
    .end annotation

    .line 43
    new-instance v0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceCoordinatorFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceCoordinatorFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/location/geofence/GeofenceCoordinator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceStatusManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/LocationStatusDispatcher;",
            ">;)",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;"
        }
    .end annotation

    .line 37
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/location/geofence/GeofenceStatusManager;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/location/LocationStatusDispatcher;

    .line 36
    invoke-static {p0, p1}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceCoordinatorFactory;->proxyProvideGeofenceCoordinator(Lcom/ibotta/android/location/geofence/GeofenceStatusManager;Lcom/ibotta/android/location/LocationStatusDispatcher;)Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideGeofenceCoordinator(Lcom/ibotta/android/location/geofence/GeofenceStatusManager;Lcom/ibotta/android/location/LocationStatusDispatcher;)Lcom/ibotta/android/location/geofence/GeofenceCoordinator;
    .locals 0

    .line 51
    invoke-static {p0, p1}, Lcom/ibotta/android/di/AppGeofenceModule;->provideGeofenceCoordinator(Lcom/ibotta/android/location/geofence/GeofenceStatusManager;Lcom/ibotta/android/location/LocationStatusDispatcher;)Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 50
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/location/geofence/GeofenceCoordinator;
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceCoordinatorFactory;->radarGeofenceStatusManagerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceCoordinatorFactory;->locationStatusDispatcherProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceCoordinatorFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppGeofenceModule_ProvideGeofenceCoordinatorFactory;->get()Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    move-result-object v0

    return-object v0
.end method
