.class public Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;
.super Ljava/lang/Object;
.source "ApiJobEnvironmentImpl.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobEnvironment;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

.field private final cacheFetchStrategyFactory:Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;

.field private final context:Landroid/content/Context;

.field private final handler:Landroid/os/Handler;

.field private final hardware:Lcom/ibotta/android/hardware/Hardware;

.field private final locationUpdateManager:Lcom/ibotta/android/service/location/LocationUpdateManager;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Landroid/os/Handler;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;Lcom/ibotta/android/service/location/LocationUpdateManager;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->context:Landroid/content/Context;

    .line 45
    iput-object p2, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 46
    iput-object p3, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->hardware:Lcom/ibotta/android/hardware/Hardware;

    .line 47
    iput-object p4, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->handler:Landroid/os/Handler;

    .line 48
    iput-object p5, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 49
    iput-object p6, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 50
    iput-object p7, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->cacheFetchStrategyFactory:Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;

    .line 51
    iput-object p8, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->locationUpdateManager:Lcom/ibotta/android/service/location/LocationUpdateManager;

    return-void
.end method


# virtual methods
.method public createGeocoder()Landroid/location/Geocoder;
    .locals 2

    .line 121
    new-instance v0, Landroid/location/Geocoder;

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public getAuthToken()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/auth/AuthManager;->getAuthToken()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCacheFetchStrategy(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->cacheFetchStrategyFactory:Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategyFactory;->fromApiCall(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy;

    move-result-object p1

    return-object p1
.end method

.method public getContentResolver()Landroid/content/ContentResolver;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentTime()J
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public getCustomerId()I
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v0

    return v0
.end method

.method public getCustomerZip()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getCustomerZip()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLastLocation()Landroid/location/Location;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public isCoarseLocationAvailable()Z
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v0}, Lcom/ibotta/android/hardware/Hardware;->isCoarseLocationAvailable()Z

    move-result v0

    return v0
.end method

.method public isFineLocationAvailable()Z
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v0}, Lcom/ibotta/android/hardware/Hardware;->isFineLocationAvailable()Z

    move-result v0

    return v0
.end method

.method public isNetworkConnected()Z
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v0}, Lcom/ibotta/android/hardware/Hardware;->isNetworkConnected()Z

    move-result v0

    return v0
.end method

.method public postDelayed(Ljava/lang/Runnable;J)V
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->handler:Landroid/os/Handler;

    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public removeCallbacks(Ljava/lang/Runnable;)V
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->handler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public requestUpdate(J)V
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->locationUpdateManager:Lcom/ibotta/android/service/location/LocationUpdateManager;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/service/location/LocationUpdateManager;->requestUpdate(J)V

    return-void
.end method

.method public setAuthToken(Ljava/lang/String;)V
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/user/auth/AuthManager;->setAuthToken(Ljava/lang/String;)V

    return-void
.end method

.method public waitForFreshLocation(JJJ)Landroid/location/Location;
    .locals 7

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ApiJobEnvironmentImpl;->locationUpdateManager:Lcom/ibotta/android/service/location/LocationUpdateManager;

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    invoke-interface/range {v0 .. v6}, Lcom/ibotta/android/service/location/LocationUpdateManager;->waitForFreshLocation(JJJ)Landroid/location/Location;

    move-result-object p1

    return-object p1
.end method
