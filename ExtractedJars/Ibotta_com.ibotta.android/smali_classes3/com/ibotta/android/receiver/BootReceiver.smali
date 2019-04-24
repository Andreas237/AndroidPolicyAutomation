.class public Lcom/ibotta/android/receiver/BootReceiver;
.super Landroid/content/BroadcastReceiver;
.source "BootReceiver.java"


# instance fields
.field protected geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    const-string p1, "onReceive"

    const/4 p2, 0x0

    .line 24
    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/receiver/BootReceiver;)V

    .line 28
    iget-object p1, p0, Lcom/ibotta/android/receiver/BootReceiver;->geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    invoke-interface {p1}, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;->onBoot()V

    return-void
.end method
