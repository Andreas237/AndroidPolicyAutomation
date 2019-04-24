.class public Lcom/shopkick/app/location/LocationDistanceComparator;
.super Ljava/lang/Object;
.source "LocationDistanceComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;",
        ">;"
    }
.end annotation


# instance fields
.field private baseLocation:Landroid/location/Location;

.field private locationNotifier:Lcom/shopkick/app/location/LocationNotifier;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/location/LocationNotifier;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/shopkick/app/location/LocationDistanceComparator;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 17
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/location/LocationDistanceComparator;->baseLocation:Landroid/location/Location;

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/location/LocationNotifier;Landroid/location/Location;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/shopkick/app/location/LocationDistanceComparator;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 22
    iput-object p2, p0, Lcom/shopkick/app/location/LocationDistanceComparator;->baseLocation:Landroid/location/Location;

    return-void
.end method


# virtual methods
.method public compare(Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;)I
    .locals 6

    .line 27
    iget-object v0, p0, Lcom/shopkick/app/location/LocationDistanceComparator;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v1, p0, Lcom/shopkick/app/location/LocationDistanceComparator;->baseLocation:Landroid/location/Location;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->latitude:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->longitude:Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/app/location/LocationNotifier;->getDistanceInMetersFrom(Landroid/location/Location;DD)F

    move-result p1

    .line 28
    iget-object v0, p0, Lcom/shopkick/app/location/LocationDistanceComparator;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v1, p0, Lcom/shopkick/app/location/LocationDistanceComparator;->baseLocation:Landroid/location/Location;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->latitude:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->longitude:Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/app/location/LocationNotifier;->getDistanceInMetersFrom(Landroid/location/Location;DD)F

    move-result p2

    cmpg-float v0, p1, p2

    if-gez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    cmpl-float p1, p1, p2

    if-lez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 10
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/location/LocationDistanceComparator;->compare(Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;)I

    move-result p1

    return p1
.end method
