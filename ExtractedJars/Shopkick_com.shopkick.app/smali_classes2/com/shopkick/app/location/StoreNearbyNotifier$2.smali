.class Lcom/shopkick/app/location/StoreNearbyNotifier$2;
.super Ljava/lang/Object;
.source "StoreNearbyNotifier.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/location/StoreNearbyNotifier;->fetchNearbyCheckinLocations()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/location/StoreNearbyNotifier;

.field final synthetic val$request:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsRequest;


# direct methods
.method constructor <init>(Lcom/shopkick/app/location/StoreNearbyNotifier;Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsRequest;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier$2;->this$0:Lcom/shopkick/app/location/StoreNearbyNotifier;

    iput-object p2, p0, Lcom/shopkick/app/location/StoreNearbyNotifier$2;->val$request:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier$2;->this$0:Lcom/shopkick/app/location/StoreNearbyNotifier;

    invoke-static {v0}, Lcom/shopkick/app/location/StoreNearbyNotifier;->access$000(Lcom/shopkick/app/location/StoreNearbyNotifier;)Lcom/shopkick/fetchers/api/APIManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier$2;->val$request:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCheckinLocationsRequest;

    iget-object v2, p0, Lcom/shopkick/app/location/StoreNearbyNotifier$2;->this$0:Lcom/shopkick/app/location/StoreNearbyNotifier;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method
