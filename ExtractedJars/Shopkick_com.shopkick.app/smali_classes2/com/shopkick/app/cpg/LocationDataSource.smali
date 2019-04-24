.class public Lcom/shopkick/app/cpg/LocationDataSource;
.super Ljava/lang/Object;
.source "LocationDataSource.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field public static final EVENT_LOCATIONS_FAILED:Ljava/lang/String; = "EventLocationsFailed"

.field public static final EVENT_LOCATIONS_UPDATED:Ljava/lang/String; = "EventLocationsUpdated"


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private locationsMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private request:Lcom/shopkick/app/fetchers/api/skapi/GetLocationsRequest;


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/cpg/LocationDataSource;->locationsMap:Ljava/util/HashMap;

    .line 29
    iput-object p1, p0, Lcom/shopkick/app/cpg/LocationDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 30
    iput-object p2, p0, Lcom/shopkick/app/cpg/LocationDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-void
.end method

.method private fetchGetLocations(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/shopkick/app/cpg/LocationDataSource;->request:Lcom/shopkick/app/fetchers/api/skapi/GetLocationsRequest;

    if-eqz v0, :cond_0

    return-void

    .line 82
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetLocationsRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetLocationsRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/cpg/LocationDataSource;->request:Lcom/shopkick/app/fetchers/api/skapi/GetLocationsRequest;

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/cpg/LocationDataSource;->request:Lcom/shopkick/app/fetchers/api/skapi/GetLocationsRequest;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetLocationsRequest;->locationIds:Ljava/util/List;

    .line 84
    iget-object p1, p0, Lcom/shopkick/app/cpg/LocationDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method


# virtual methods
.method public addLocationsList(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 34
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 36
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    .line 37
    iget-object v1, p0, Lcom/shopkick/app/cpg/LocationDataSource;->locationsMap:Ljava/util/HashMap;

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    const/4 p1, 0x0

    .line 97
    iput-object p1, p0, Lcom/shopkick/app/cpg/LocationDataSource;->request:Lcom/shopkick/app/fetchers/api/skapi/GetLocationsRequest;

    .line 99
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_0

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_0

    .line 100
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetLocationsResponse;

    .line 101
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetLocationsResponse;->locations:Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/cpg/LocationDataSource;->addLocationsList(Ljava/util/List;)V

    .line 103
    iget-object p1, p0, Lcom/shopkick/app/cpg/LocationDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventLocationsUpdated"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_0

    .line 105
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/cpg/LocationDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventLocationsFailed"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :goto_0
    return-void
.end method

.method public getLocation(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/shopkick/app/cpg/LocationDataSource;->locationsMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/shopkick/app/cpg/LocationDataSource;->locationsMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    return-object p1

    .line 45
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, v0}, Lcom/shopkick/app/cpg/LocationDataSource;->fetchGetLocations(Ljava/util/List;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public getLocationsList(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;",
            ">;"
        }
    .end annotation

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 52
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 54
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 55
    iget-object v3, p0, Lcom/shopkick/app/cpg/LocationDataSource;->locationsMap:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 56
    iget-object v3, p0, Lcom/shopkick/app/cpg/LocationDataSource;->locationsMap:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 58
    :cond_0
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 63
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_2

    .line 64
    invoke-direct {p0, v0}, Lcom/shopkick/app/cpg/LocationDataSource;->fetchGetLocations(Ljava/util/List;)V

    const/4 p1, 0x0

    return-object p1

    :cond_2
    return-object v1
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
