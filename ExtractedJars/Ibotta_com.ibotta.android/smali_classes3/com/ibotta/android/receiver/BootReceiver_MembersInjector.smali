.class public final Lcom/ibotta/android/receiver/BootReceiver_MembersInjector;
.super Ljava/lang/Object;
.source "BootReceiver_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/receiver/BootReceiver;",
        ">;"
    }
.end annotation


# instance fields
.field private final geofenceCoordinatorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            ">;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/receiver/BootReceiver_MembersInjector;->geofenceCoordinatorProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/receiver/BootReceiver;",
            ">;"
        }
    .end annotation

    .line 21
    new-instance v0, Lcom/ibotta/android/receiver/BootReceiver_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/receiver/BootReceiver_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectGeofenceCoordinator(Lcom/ibotta/android/receiver/BootReceiver;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/receiver/BootReceiver;->geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/receiver/BootReceiver;)V
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/receiver/BootReceiver_MembersInjector;->geofenceCoordinatorProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    invoke-static {p1, v0}, Lcom/ibotta/android/receiver/BootReceiver_MembersInjector;->injectGeofenceCoordinator(Lcom/ibotta/android/receiver/BootReceiver;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/receiver/BootReceiver;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/receiver/BootReceiver_MembersInjector;->injectMembers(Lcom/ibotta/android/receiver/BootReceiver;)V

    return-void
.end method
