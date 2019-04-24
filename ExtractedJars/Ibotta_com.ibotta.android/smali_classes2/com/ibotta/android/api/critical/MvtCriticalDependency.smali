.class public Lcom/ibotta/android/api/critical/MvtCriticalDependency;
.super Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;
.source "MvtCriticalDependency.java"


# instance fields
.field private final authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

.field private final geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

.field private final handler:Landroid/os/Handler;

.field private final mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Landroid/os/Handler;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;-><init>(Lcom/ibotta/android/appcache/AppCache;)V

    .line 35
    iput-object p2, p0, Lcom/ibotta/android/api/critical/MvtCriticalDependency;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 36
    iput-object p3, p0, Lcom/ibotta/android/api/critical/MvtCriticalDependency;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 37
    iput-object p4, p0, Lcom/ibotta/android/api/critical/MvtCriticalDependency;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    .line 38
    iput-object p5, p0, Lcom/ibotta/android/api/critical/MvtCriticalDependency;->geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    .line 39
    iput-object p6, p0, Lcom/ibotta/android/api/critical/MvtCriticalDependency;->handler:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public getApiJobs()Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ">;"
        }
    .end annotation

    .line 44
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 46
    iget-object v1, p0, Lcom/ibotta/android/api/critical/MvtCriticalDependency;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 47
    new-instance v1, Lcom/ibotta/android/api/mvt/TestVariantsJob;

    iget-object v2, p0, Lcom/ibotta/android/api/critical/MvtCriticalDependency;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    iget-object v3, p0, Lcom/ibotta/android/api/critical/MvtCriticalDependency;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    iget-object v4, p0, Lcom/ibotta/android/api/critical/MvtCriticalDependency;->geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    iget-object v5, p0, Lcom/ibotta/android/api/critical/MvtCriticalDependency;->handler:Landroid/os/Handler;

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/ibotta/android/api/mvt/TestVariantsJob;-><init>(ILcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Landroid/os/Handler;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method
