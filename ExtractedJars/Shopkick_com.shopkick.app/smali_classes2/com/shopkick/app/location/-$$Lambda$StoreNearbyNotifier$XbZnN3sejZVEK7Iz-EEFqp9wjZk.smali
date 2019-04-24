.class public final synthetic Lcom/shopkick/app/location/-$$Lambda$StoreNearbyNotifier$XbZnN3sejZVEK7Iz-EEFqp9wjZk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/location/StoreNearbyNotifier;

.field private final synthetic f$1:Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;

.field private final synthetic f$2:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/location/StoreNearbyNotifier;Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/location/-$$Lambda$StoreNearbyNotifier$XbZnN3sejZVEK7Iz-EEFqp9wjZk;->f$0:Lcom/shopkick/app/location/StoreNearbyNotifier;

    iput-object p2, p0, Lcom/shopkick/app/location/-$$Lambda$StoreNearbyNotifier$XbZnN3sejZVEK7Iz-EEFqp9wjZk;->f$1:Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;

    iput-object p3, p0, Lcom/shopkick/app/location/-$$Lambda$StoreNearbyNotifier$XbZnN3sejZVEK7Iz-EEFqp9wjZk;->f$2:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/shopkick/app/location/-$$Lambda$StoreNearbyNotifier$XbZnN3sejZVEK7Iz-EEFqp9wjZk;->f$0:Lcom/shopkick/app/location/StoreNearbyNotifier;

    iget-object v1, p0, Lcom/shopkick/app/location/-$$Lambda$StoreNearbyNotifier$XbZnN3sejZVEK7Iz-EEFqp9wjZk;->f$1:Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;

    iget-object v2, p0, Lcom/shopkick/app/location/-$$Lambda$StoreNearbyNotifier$XbZnN3sejZVEK7Iz-EEFqp9wjZk;->f$2:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/location/StoreNearbyNotifier;->lambda$triggerWalkin$19(Lcom/shopkick/app/location/StoreNearbyNotifier;Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;)V

    return-void
.end method
