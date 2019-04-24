.class public Lcom/ibotta/android/service/location/LocationUpdateService;
.super Landroid/support/v4/app/JobIntentService;
.source "LocationUpdateService.java"


# static fields
.field private static final FASTEST_INTERVAL:J = 0x7530L

.field static final KEY_MAX_AGE:Ljava/lang/String; = "max_age"

.field private static final LOCATION_EXPIRATION:J = 0x927c0L


# instance fields
.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected permissionsState:Lcom/ibotta/android/state/app/permissions/PermissionsState;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected userState:Lcom/ibotta/android/state/user/UserState;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Landroid/support/v4/app/JobIntentService;-><init>()V

    return-void
.end method

.method private getDefaultLocationRequest()Lcom/google/android/gms/location/LocationRequest;
    .locals 3

    .line 76
    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->create()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v0

    const-wide/32 v1, 0x927c0

    .line 77
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->setExpirationDuration(J)Lcom/google/android/gms/location/LocationRequest;

    const-wide/16 v1, 0x7530

    .line 78
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->setFastestInterval(J)Lcom/google/android/gms/location/LocationRequest;

    const/4 v1, 0x1

    .line 79
    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->setNumUpdates(I)Lcom/google/android/gms/location/LocationRequest;

    const/16 v1, 0x66

    .line 80
    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->setPriority(I)Lcom/google/android/gms/location/LocationRequest;

    return-object v0
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    .line 42
    invoke-super {p0}, Landroid/support/v4/app/JobIntentService;->onCreate()V

    .line 43
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/service/location/LocationUpdateService;)V

    return-void
.end method

.method protected onHandleWork(Landroid/content/Intent;)V
    .locals 8
    .param p1    # Landroid/content/Intent;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "onHandleWork"

    const/4 v1, 0x0

    .line 48
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/service/location/LocationUpdateService;->permissionsState:Lcom/ibotta/android/state/app/permissions/PermissionsState;

    sget-object v2, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-interface {v0, p0, v2}, Lcom/ibotta/android/state/app/permissions/PermissionsState;->isPermissionGranted(Landroid/content/Context;Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v0, "max_age"

    const-wide/16 v2, 0x0

    .line 55
    invoke-virtual {p1, v0, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    .line 56
    iget-object p1, p0, Lcom/ibotta/android/service/location/LocationUpdateService;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {p1}, Lcom/ibotta/android/state/user/UserState;->getLastLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 58
    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v4

    iget-object v0, p0, Lcom/ibotta/android/service/location/LocationUpdateService;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v6

    sub-long/2addr v6, v2

    cmp-long v0, v4, v6

    if-gez v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "Broadcasting last known location."

    .line 65
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    invoke-static {p1}, Lcom/ibotta/android/receiver/LocationChangeReceiver;->broadcast(Landroid/location/Location;)V

    goto :goto_1

    :cond_2
    :goto_0
    const-string p1, "Last location is null or expired, requesting a new one."

    .line 59
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    invoke-static {p0}, Lcom/google/android/gms/location/LocationServices;->getFusedLocationProviderClient(Landroid/content/Context;)Lcom/google/android/gms/location/FusedLocationProviderClient;

    move-result-object p1

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/service/location/LocationUpdateService;->getDefaultLocationRequest()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v0

    .line 63
    invoke-static {p0}, Lcom/ibotta/android/receiver/LocationChangeReceiver;->newPendingIntent(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v2

    .line 62
    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/location/FusedLocationProviderClient;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string v0, "Failed to complete onHandleWork."

    .line 70
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
