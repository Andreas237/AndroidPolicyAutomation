.class public Lcom/shopkick/app/location/NearbyLocationsDataSource;
.super Ljava/lang/Object;
.source "NearbyLocationsDataSource.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field public static final NEARBY_LOCATIONS_FAILED:Ljava/lang/String; = "NearbyLocationsFailed"

.field public static final NEARBY_LOCATIONS_UPDATED:Ljava/lang/String; = "NearbyLocationsUpdated"


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private bucketSize:I

.field private bucketedLatitude:Ljava/lang/Double;

.field private bucketedLongitude:Ljava/lang/Double;

.field private locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

.field private locations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private request:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p2, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 47
    iput-object p3, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 48
    iget-object p2, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    if-eqz p2, :cond_0

    iget-object p2, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->taxonomyKeywordRelatedOffersBucketSizeMeters:Ljava/lang/Integer;

    if-eqz p2, :cond_0

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->taxonomyKeywordRelatedOffersBucketSizeMeters:Ljava/lang/Integer;

    .line 50
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/high16 p1, -0x80000000

    :goto_0
    iput p1, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->bucketSize:I

    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 185
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;

    .line 186
    iget-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->request:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;->latitude:Ljava/lang/Double;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;->latitude:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->request:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;->longitude:Ljava/lang/Double;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;->longitude:Ljava/lang/Double;

    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 189
    iput-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->request:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;

    .line 192
    iget-boolean v1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_1

    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v1, :cond_1

    .line 193
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;->latitude:Ljava/lang/Double;

    iput-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->bucketedLatitude:Ljava/lang/Double;

    .line 194
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;->longitude:Ljava/lang/Double;

    iput-object p1, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->bucketedLongitude:Ljava/lang/Double;

    .line 196
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsResponse;

    .line 197
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsResponse;->locations:Ljava/util/List;

    iput-object p1, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    .line 198
    iget-object p1, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    new-instance p2, Lcom/shopkick/app/location/LocationDistanceComparator;

    iget-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    invoke-direct {p2, v0}, Lcom/shopkick/app/location/LocationDistanceComparator;-><init>(Lcom/shopkick/app/location/LocationNotifier;)V

    invoke-static {p1, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 199
    iget-object p1, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "NearbyLocationsUpdated"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_0

    .line 201
    :cond_1
    iput-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->bucketedLatitude:Ljava/lang/Double;

    .line 202
    iput-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->bucketedLongitude:Ljava/lang/Double;

    .line 203
    iget-object p1, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "NearbyLocationsFailed"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :goto_0
    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method public fetchLocationsIfNeeded(Ljava/util/ArrayList;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 140
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 141
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    .line 142
    iget-object p1, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    new-instance v0, Lcom/shopkick/app/location/LocationDistanceComparator;

    iget-object v1, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    invoke-direct {v0, v1}, Lcom/shopkick/app/location/LocationDistanceComparator;-><init>(Lcom/shopkick/app/location/LocationNotifier;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto/16 :goto_1

    .line 143
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/location/NearbyLocationsDataSource;->isDataLatest()Z

    move-result p1

    if-nez p1, :cond_5

    .line 144
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    if-nez p1, :cond_1

    .line 146
    iget-object p1, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "NearbyLocationsFailed"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_1

    .line 149
    :cond_1
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    .line 150
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    iget p1, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->bucketSize:I

    if-ltz p1, :cond_2

    int-to-double v5, p1

    goto :goto_0

    :cond_2
    const-wide v5, 0x40bf6eb851eb851fL    # 8046.72

    .line 149
    :goto_0
    invoke-static/range {v1 .. v6}, Lcom/shopkick/utilities/GeoUtilities;->roundLatLonForBucketedCaching(DDD)[D

    move-result-object p1

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->request:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    .line 155
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;->latitude:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    aget-wide v5, p1, v2

    cmpl-double v0, v3, v5

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->request:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;->longitude:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    aget-wide v5, p1, v1

    cmpl-double v0, v3, v5

    if-nez v0, :cond_3

    return-void

    .line 158
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v3, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->request:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;

    invoke-virtual {v0, v3, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    const/4 v0, 0x0

    .line 159
    iput-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->request:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;

    .line 164
    :cond_4
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->request:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;

    .line 165
    iget-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->request:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;

    aget-wide v2, p1, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;->latitude:Ljava/lang/Double;

    .line 166
    iget-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->request:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;

    aget-wide v1, p1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;->longitude:Ljava/lang/Double;

    .line 167
    iget-object v1, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v3, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->request:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyChainLocationsRequest;

    const/4 v5, 0x1

    sget-object v6, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v7, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v8, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    move-object v4, p0

    invoke-virtual/range {v1 .. v8}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_5
    :goto_1
    return-void
.end method

.method public getBasicLocationInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;
    .locals 4

    .line 124
    iget-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 125
    invoke-virtual {p0, v1}, Lcom/shopkick/app/location/NearbyLocationsDataSource;->fetchLocationsIfNeeded(Ljava/util/ArrayList;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    .line 129
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_3

    .line 130
    iget-object v2, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->chainId:Ljava/lang/String;

    .line 131
    iget-object v3, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    .line 132
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 133
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    return-object p1

    :cond_3
    return-object v1
.end method

.method public getChainDistance(Ljava/lang/String;Lcom/shopkick/app/account/UserAccount;)Ljava/lang/String;
    .locals 5

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 109
    invoke-virtual {p0, v1}, Lcom/shopkick/app/location/NearbyLocationsDataSource;->fetchLocationsIfNeeded(Ljava/util/ArrayList;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    .line 112
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 113
    iget-object v2, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->chainId:Ljava/lang/String;

    .line 114
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 115
    iget-object p1, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v1, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->latitude:Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    iget-object v3, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    .line 116
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->longitude:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    .line 115
    invoke-virtual {p1, v1, v2, v3, v4}, Lcom/shopkick/app/location/LocationNotifier;->getDistanceInMetersFrom(DD)F

    move-result p1

    float-to-double v0, p1

    invoke-static {v0, v1, p2}, Lcom/shopkick/app/util/NumberFormatter;->formattedDistanceString(DLcom/shopkick/app/account/UserAccount;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public getNearestChain(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 91
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 92
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 95
    invoke-virtual {p0, v1}, Lcom/shopkick/app/location/NearbyLocationsDataSource;->fetchLocationsIfNeeded(Ljava/util/ArrayList;)V

    return-object v1

    .line 99
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    .line 100
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 101
    iget-object p1, v2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->chainId:Ljava/lang/String;

    return-object p1

    :cond_3
    return-object v1
.end method

.method public getNearestLocation(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 76
    invoke-virtual {p0, v1}, Lcom/shopkick/app/location/NearbyLocationsDataSource;->fetchLocationsIfNeeded(Ljava/util/ArrayList;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    .line 79
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 80
    iget-object v2, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->chainId:Ljava/lang/String;

    .line 81
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 82
    iget-object p1, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    return-object p1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public isDataLatest()Z
    .locals 8

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->locations:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->bucketedLatitude:Ljava/lang/Double;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->bucketedLongitude:Ljava/lang/Double;

    if-nez v0, :cond_0

    goto :goto_1

    .line 62
    :cond_0
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    .line 66
    :cond_1
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    .line 67
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    iget v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->bucketSize:I

    if-ltz v0, :cond_2

    int-to-double v6, v0

    goto :goto_0

    :cond_2
    const-wide v6, 0x40bf6eb851eb851fL    # 8046.72

    .line 66
    :goto_0
    invoke-static/range {v2 .. v7}, Lcom/shopkick/utilities/GeoUtilities;->roundLatLonForBucketedCaching(DDD)[D

    move-result-object v0

    .line 70
    aget-wide v2, v0, v1

    iget-object v4, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->bucketedLatitude:Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    cmpl-double v2, v2, v4

    const/4 v3, 0x1

    if-nez v2, :cond_3

    aget-wide v4, v0, v3

    iget-object v0, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->bucketedLongitude:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    cmpl-double v0, v4, v6

    if-nez v0, :cond_3

    move v1, v3

    :cond_3
    return v1

    :cond_4
    :goto_1
    return v1
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public setApiManagerV2(Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/shopkick/app/location/NearbyLocationsDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    return-void
.end method
