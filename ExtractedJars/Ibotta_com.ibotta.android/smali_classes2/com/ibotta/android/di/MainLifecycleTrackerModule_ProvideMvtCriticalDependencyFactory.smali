.class public final Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;
.super Ljava/lang/Object;
.source "MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/api/critical/CriticalDependency;",
        ">;"
    }
.end annotation


# instance fields
.field private final appCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;"
        }
    .end annotation
.end field

.field private final authManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;"
        }
    .end annotation
.end field

.field private final geofenceCoordinatorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            ">;"
        }
    .end annotation
.end field

.field private final handlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field private final mvtTestsHolderProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)V"
        }
    .end annotation

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;->appCacheProvider:Ljavax/inject/Provider;

    .line 41
    iput-object p2, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 42
    iput-object p3, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;->authManagerProvider:Ljavax/inject/Provider;

    .line 43
    iput-object p4, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;->mvtTestsHolderProvider:Ljavax/inject/Provider;

    .line 44
    iput-object p5, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;->geofenceCoordinatorProvider:Ljavax/inject/Provider;

    .line 45
    iput-object p6, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;->handlerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)",
            "Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;"
        }
    .end annotation

    .line 82
    new-instance v7, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v7
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/api/critical/CriticalDependency;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)",
            "Lcom/ibotta/android/api/critical/CriticalDependency;"
        }
    .end annotation

    .line 67
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/appcache/AppCache;

    .line 68
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/ibotta/android/state/user/UserState;

    .line 69
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 70
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    .line 71
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    .line 72
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Landroid/os/Handler;

    .line 66
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;->proxyProvideMvtCriticalDependency(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Landroid/os/Handler;)Lcom/ibotta/android/api/critical/CriticalDependency;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideMvtCriticalDependency(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Landroid/os/Handler;)Lcom/ibotta/android/api/critical/CriticalDependency;
    .locals 0

    .line 99
    invoke-static/range {p0 .. p5}, Lcom/ibotta/android/di/MainLifecycleTrackerModule;->provideMvtCriticalDependency(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Landroid/os/Handler;)Lcom/ibotta/android/api/critical/CriticalDependency;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 98
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/api/critical/CriticalDependency;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/api/critical/CriticalDependency;
    .locals 6

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;->appCacheProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;->authManagerProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;->mvtTestsHolderProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;->geofenceCoordinatorProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;->handlerProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/api/critical/CriticalDependency;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideMvtCriticalDependencyFactory;->get()Lcom/ibotta/android/api/critical/CriticalDependency;

    move-result-object v0

    return-object v0
.end method
