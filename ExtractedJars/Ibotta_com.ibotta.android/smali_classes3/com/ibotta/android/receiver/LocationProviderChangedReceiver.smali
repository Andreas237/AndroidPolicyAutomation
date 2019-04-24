.class public Lcom/ibotta/android/receiver/LocationProviderChangedReceiver;
.super Landroid/content/BroadcastReceiver;
.source "LocationProviderChangedReceiver.java"


# instance fields
.field protected locationStatusDispatcher:Lcom/ibotta/android/location/LocationStatusDispatcher;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tracker:Lcom/ibotta/android/tracking/Tracker;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    const-string p2, "onReceive"

    const/4 v0, 0x0

    .line 28
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p2, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object p2

    invoke-interface {p2, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/receiver/LocationProviderChangedReceiver;)V

    const-string p2, "location"

    .line 33
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/LocationManager;

    if-eqz p1, :cond_0

    const-string p2, "network"

    .line 36
    invoke-virtual {p1, p2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 37
    iget-object p1, p0, Lcom/ibotta/android/receiver/LocationProviderChangedReceiver;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string p2, "location_status"

    const-string v0, "on"

    invoke-interface {p1, p2, v0}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    goto :goto_0

    .line 40
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/receiver/LocationProviderChangedReceiver;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string p2, "location_status"

    const-string v1, "off"

    invoke-interface {p1, p2, v1}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/receiver/LocationProviderChangedReceiver;->locationStatusDispatcher:Lcom/ibotta/android/location/LocationStatusDispatcher;

    invoke-interface {p1, v0}, Lcom/ibotta/android/location/LocationStatusDispatcher;->onLocationStatusChanged(Z)V

    .line 46
    sget-object p1, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {p1}, Lcom/ibotta/api/ApiContext;->getUserLocation()Lcom/ibotta/api/UserLocation;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ibotta/api/UserLocation;->update(Z)Ljava/lang/String;

    return-void
.end method
