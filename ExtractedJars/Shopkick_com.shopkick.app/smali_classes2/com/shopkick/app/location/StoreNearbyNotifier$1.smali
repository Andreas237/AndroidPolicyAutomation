.class Lcom/shopkick/app/location/StoreNearbyNotifier$1;
.super Ljava/lang/Object;
.source "StoreNearbyNotifier.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/location/StoreNearbyNotifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/location/StoreNearbyNotifier;


# direct methods
.method constructor <init>(Lcom/shopkick/app/location/StoreNearbyNotifier;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier$1;->this$0:Lcom/shopkick/app/location/StoreNearbyNotifier;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier$1;->this$0:Lcom/shopkick/app/location/StoreNearbyNotifier;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/location/StoreNearbyNotifier;->handleLocationUpdate(Landroid/location/Location;)V

    return-void
.end method
