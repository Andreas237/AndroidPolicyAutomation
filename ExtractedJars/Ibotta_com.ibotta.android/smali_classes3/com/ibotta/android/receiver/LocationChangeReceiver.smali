.class public Lcom/ibotta/android/receiver/LocationChangeReceiver;
.super Landroid/content/BroadcastReceiver;
.source "LocationChangeReceiver.java"


# static fields
.field private static final KEY_LOCATION_CHANGED:Ljava/lang/String; = "location_changed"


# instance fields
.field protected locationStatusDispatcher:Lcom/ibotta/android/location/LocationStatusDispatcher;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static broadcast(Landroid/location/Location;)V
    .locals 2

    .line 30
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v1

    invoke-static {v1, p0}, Lcom/ibotta/android/receiver/LocationChangeReceiver;->newIntent(Landroid/content/Context;Landroid/location/Location;)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/App;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 46
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/receiver/LocationChangeReceiver;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method private static newIntent(Landroid/content/Context;Landroid/location/Location;)Landroid/content/Intent;
    .locals 1

    .line 50
    invoke-static {p0}, Lcom/ibotta/android/receiver/LocationChangeReceiver;->newIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    const-string v0, "location_changed"

    .line 53
    invoke-virtual {p0, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method

.method public static newPendingIntent(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 38
    invoke-static {p0}, Lcom/ibotta/android/receiver/LocationChangeReceiver;->newIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v1

    const/high16 v2, 0x8000000

    invoke-static {p0, v0, v1, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    const-string p1, "onReceive"

    const/4 v0, 0x0

    .line 63
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/receiver/LocationChangeReceiver;)V

    const/4 p1, 0x0

    :try_start_0
    const-string v1, "location_changed"

    .line 75
    invoke-virtual {p2, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, "location_changed"

    .line 76
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/location/Location;

    goto :goto_0

    .line 78
    :cond_0
    invoke-static {p2}, Lcom/google/android/gms/location/LocationResult;->extractResult(Landroid/content/Intent;)Lcom/google/android/gms/location/LocationResult;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 80
    invoke-virtual {p2}, Lcom/google/android/gms/location/LocationResult;->getLastLocation()Landroid/location/Location;

    move-result-object p1

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    const-string p2, "Received location -- Lat: %s Lon: %s"

    const/4 v1, 0x2

    .line 85
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v1, v0

    const/4 v0, 0x1

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v1, v0

    invoke-static {p2, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    iget-object p2, p0, Lcom/ibotta/android/receiver/LocationChangeReceiver;->locationStatusDispatcher:Lcom/ibotta/android/location/LocationStatusDispatcher;

    invoke-interface {p2, p1}, Lcom/ibotta/android/location/LocationStatusDispatcher;->onLocationChanged(Landroid/location/Location;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 89
    sget-object p2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    return-void
.end method
