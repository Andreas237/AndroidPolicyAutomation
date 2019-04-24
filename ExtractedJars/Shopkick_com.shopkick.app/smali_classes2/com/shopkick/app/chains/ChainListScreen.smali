.class public Lcom/shopkick/app/chains/ChainListScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "ChainListScreen.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private chainId:Ljava/lang/String;

.field private chainListAdapter:Lcom/shopkick/app/chains/ChainListAdapter;

.field private chainName:Ljava/lang/String;

.field private getNearbyLocationsForChainRequest:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyLocationsForChainRequest;

.field private listView:Landroid/widget/ListView;

.field private locationId:Ljava/lang/String;

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

.field private progressBar:Landroid/widget/ProgressBar;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;

.field private userLocation:Landroid/location/Location;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private fetchNearbyLocationsForChain()V
    .locals 4

    .line 107
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyLocationsForChainRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyLocationsForChainRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/chains/ChainListScreen;->getNearbyLocationsForChainRequest:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyLocationsForChainRequest;

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainListScreen;->userLocation:Landroid/location/Location;

    if-eqz v0, :cond_0

    .line 109
    iget-object v1, p0, Lcom/shopkick/app/chains/ChainListScreen;->getNearbyLocationsForChainRequest:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyLocationsForChainRequest;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyLocationsForChainRequest;->latitude:Ljava/lang/Double;

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainListScreen;->getNearbyLocationsForChainRequest:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyLocationsForChainRequest;

    iget-object v1, p0, Lcom/shopkick/app/chains/ChainListScreen;->userLocation:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyLocationsForChainRequest;->longitude:Ljava/lang/Double;

    .line 112
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainListScreen;->getNearbyLocationsForChainRequest:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyLocationsForChainRequest;

    iget-object v1, p0, Lcom/shopkick/app/chains/ChainListScreen;->chainId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyLocationsForChainRequest;->chainId:Ljava/lang/String;

    .line 113
    iget-object v1, p0, Lcom/shopkick/app/chains/ChainListScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainListScreen;->getNearbyLocationsForChainRequest:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyLocationsForChainRequest;

    if-ne p1, v0, :cond_3

    .line 123
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_1

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_1

    .line 124
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyLocationsForChainResponse;

    .line 126
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyLocationsForChainResponse;->locations:Ljava/util/List;

    iput-object p1, p0, Lcom/shopkick/app/chains/ChainListScreen;->locations:Ljava/util/List;

    .line 127
    iget-object p1, p0, Lcom/shopkick/app/chains/ChainListScreen;->chainListAdapter:Lcom/shopkick/app/chains/ChainListAdapter;

    iget-object p2, p0, Lcom/shopkick/app/chains/ChainListScreen;->locations:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/chains/ChainListAdapter;->addLocations(Ljava/util/List;)V

    .line 128
    iget-object p1, p0, Lcom/shopkick/app/chains/ChainListScreen;->locations:Ljava/util/List;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 129
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/chains/ChainListScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const p2, 0x7f1100fd

    invoke-virtual {p0, p2}, Lcom/shopkick/app/chains/ChainListScreen;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_0

    .line 132
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/chains/ChainListScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    .line 134
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/chains/ChainListScreen;->progressBar:Landroid/widget/ProgressBar;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    const p3, 0x7f1100fe

    .line 82
    invoke-virtual {p0, p3}, Lcom/shopkick/app/chains/ChainListScreen;->setAppScreenTitle(I)V

    const/4 p3, 0x0

    const v0, 0x7f0c005f

    .line 84
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 86
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/chains/ChainListScreen;->userLocation:Landroid/location/Location;

    const p2, 0x7f090420

    .line 87
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ListView;

    iput-object p2, p0, Lcom/shopkick/app/chains/ChainListScreen;->listView:Landroid/widget/ListView;

    .line 88
    new-instance p2, Lcom/shopkick/app/chains/ChainListAdapter;

    invoke-virtual {p0}, Lcom/shopkick/app/chains/ChainListScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v3, p0, Lcom/shopkick/app/chains/ChainListScreen;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v4, p0, Lcom/shopkick/app/chains/ChainListScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v5, p0, Lcom/shopkick/app/chains/ChainListScreen;->locationId:Ljava/lang/String;

    iget-object v6, p0, Lcom/shopkick/app/chains/ChainListScreen;->chainName:Ljava/lang/String;

    iget-object v7, p0, Lcom/shopkick/app/chains/ChainListScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    move-object v0, p2

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, Lcom/shopkick/app/chains/ChainListAdapter;-><init>(Landroid/content/Context;Lcom/shopkick/app/chains/ChainListScreen;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object p2, p0, Lcom/shopkick/app/chains/ChainListScreen;->chainListAdapter:Lcom/shopkick/app/chains/ChainListAdapter;

    .line 95
    iget-object p2, p0, Lcom/shopkick/app/chains/ChainListScreen;->listView:Landroid/widget/ListView;

    iget-object v0, p0, Lcom/shopkick/app/chains/ChainListScreen;->chainListAdapter:Lcom/shopkick/app/chains/ChainListAdapter;

    invoke-virtual {p2, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    const p2, 0x7f0900e3

    .line 96
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/shopkick/app/chains/ChainListScreen;->progressBar:Landroid/widget/ProgressBar;

    .line 98
    iget-object p2, p0, Lcom/shopkick/app/chains/ChainListScreen;->locations:Ljava/util/List;

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 99
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/chains/ChainListScreen;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p2, p3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 100
    invoke-direct {p0}, Lcom/shopkick/app/chains/ChainListScreen;->fetchNearbyLocationsForChain()V

    :cond_1
    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "chain_id"

    .line 62
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/chains/ChainListScreen;->chainId:Ljava/lang/String;

    const-string v0, "location_id"

    .line 63
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/chains/ChainListScreen;->locationId:Ljava/lang/String;

    const-string v0, "chain_name"

    .line 64
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/chains/ChainListScreen;->chainName:Ljava/lang/String;

    .line 65
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/chains/ChainListScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 66
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iput-object p2, p0, Lcom/shopkick/app/chains/ChainListScreen;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 67
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object p2, p0, Lcom/shopkick/app/chains/ChainListScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 68
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p1, p0, Lcom/shopkick/app/chains/ChainListScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    return-void
.end method

.method public locationMapSelected(Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;)V
    .locals 5

    if-eqz p1, :cond_1

    .line 150
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "district_id"

    const/4 v2, 0x0

    .line 151
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "location_id"

    .line 152
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "chain_id"

    .line 153
    iget-object v3, p0, Lcom/shopkick/app/chains/ChainListScreen;->locationId:Ljava/lang/String;

    if-eqz v3, :cond_0

    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    .line 154
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v2, p0, Lcom/shopkick/app/chains/ChainListScreen;->chainId:Ljava/lang/String;

    .line 153
    :cond_0
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "latitude"

    .line 155
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->latitude:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "longitude"

    .line 156
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->longitude:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "location_name"

    .line 157
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->name:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "location_address"

    .line 158
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->address:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    const-class p1, Lcom/shopkick/app/location/LocationMapScreen;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/chains/ChainListScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method public logChainDistanceTap(ILjava/lang/String;)V
    .locals 3

    .line 164
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x73

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 165
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 166
    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSelectedLocationId(Ljava/lang/String;)V

    .line 167
    iget-object p1, p0, Lcom/shopkick/app/chains/ChainListScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainListScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    if-eqz v0, :cond_0

    .line 74
    iget-object v1, p0, Lcom/shopkick/app/chains/ChainListScreen;->getNearbyLocationsForChainRequest:Lcom/shopkick/app/fetchers/api/skapi/GetNearbyLocationsForChainRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 76
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainListScreen;->chainListAdapter:Lcom/shopkick/app/chains/ChainListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/chains/ChainListAdapter;->destroyAdapter()V

    .line 77
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public storeDetailsSelected(Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 140
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "location_id"

    .line 141
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "location_name"

    .line 142
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->name:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "origin_element"

    const/16 v1, 0x88

    .line 143
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    const-class p1, Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/chains/ChainListScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    :cond_0
    return-void
.end method
