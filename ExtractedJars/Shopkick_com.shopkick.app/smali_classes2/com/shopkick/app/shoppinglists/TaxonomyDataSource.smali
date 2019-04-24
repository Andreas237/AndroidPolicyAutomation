.class public Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;
.super Ljava/lang/Object;
.source "TaxonomyDataSource.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field public static final EVENT_TAXONOMY_LOADED:Ljava/lang/String; = "eventTaxonomyLoaded"

.field public static final PARAM_TAXONOMY_NODE:Ljava/lang/String; = "paramTaxonomyNode"

.field public static final SHOPPING_ITEMS_FAILED_EVENT:Ljava/lang/String; = "shoppingItemsFailedEvent"

.field public static final SHOPPING_ITEMS_UPDATED_EVENT:Ljava/lang/String; = "shoppingItemsUpdatedEvent"

.field public static final TAXONOMY_ID_COMPLETED:Ljava/lang/String; = "clientTaxonomyIdCompleted"


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private getItemIdentifiersForKeywordsRequests:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/GetItemIdentifiersForKeywordsRequest;",
            ">;"
        }
    .end annotation
.end field

.field private keywordIdsToShoppingItems:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingItem;",
            ">;>;"
        }
    .end annotation
.end field

.field private nodeHashMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;",
            ">;"
        }
    .end annotation
.end field

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private requestMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/GetTaxonomyNodeRequest;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->nodeHashMap:Ljava/util/HashMap;

    .line 50
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->requestMap:Ljava/util/HashMap;

    .line 63
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 64
    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 65
    iput-object p4, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 68
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;-><init>()V

    const-string p4, "TaxonomyNodeIdOther"

    .line 69
    iput-object p4, p2, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->taxonomyNodeId:Ljava/lang/String;

    const p4, 0x7f1106b4

    .line 70
    invoke-virtual {p1, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->name:Ljava/lang/String;

    .line 71
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->nodeHashMap:Ljava/util/HashMap;

    iget-object p4, p2, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {p1, p4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;-><init>()V

    const-string p2, "clientTaxonomyIdCompleted"

    .line 75
    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->taxonomyNodeId:Ljava/lang/String;

    .line 76
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->nodeHashMap:Ljava/util/HashMap;

    iget-object p4, p1, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {p2, p4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getItemIdentifiersForKeywordsRequests:Ljava/util/ArrayList;

    .line 79
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->keywordIdsToShoppingItems:Ljava/util/Map;

    const-string p1, "AppActivityManagerSessionStartEvent"

    .line 80
    invoke-virtual {p3, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method private addTaxonomyNode(Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->nodeHashMap:Ljava/util/HashMap;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    if-eqz v0, :cond_1

    .line 107
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->name:Ljava/lang/String;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 108
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->nodeHashMap:Ljava/util/HashMap;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->requestMap:Ljava/util/HashMap;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/GetTaxonomyNodeRequest;

    if-eqz v0, :cond_2

    .line 114
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 118
    :cond_2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "paramTaxonomyNode"

    .line 119
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventTaxonomyLoaded"

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :cond_3
    return-void
.end method

.method private fetchTaxonomyNode(Ljava/lang/String;)V
    .locals 9

    .line 206
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->requestMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 208
    :cond_0
    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/GetTaxonomyNodeRequest;

    invoke-direct {v3}, Lcom/shopkick/app/fetchers/api/skapi/GetTaxonomyNodeRequest;-><init>()V

    .line 209
    iput-object p1, v3, Lcom/shopkick/app/fetchers/api/skapi/GetTaxonomyNodeRequest;->taxonomyNodeId:Ljava/lang/String;

    .line 210
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->requestMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    const/4 v5, 0x1

    sget-object v6, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v7, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v8, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    move-object v4, p0

    invoke-virtual/range {v1 .. v8}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method


# virtual methods
.method public addTaxonomyNodes(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;",
            ">;)V"
        }
    .end annotation

    .line 97
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    .line 98
    invoke-direct {p0, v0}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->addTaxonomyNode(Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public clear()V
    .locals 3

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getItemIdentifiersForKeywordsRequests:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetItemIdentifiersForKeywordsRequest;

    .line 90
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v2, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    goto :goto_0

    .line 92
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getItemIdentifiersForKeywordsRequests:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->keywordIdsToShoppingItems:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 3

    .line 231
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetTaxonomyNodeRequest;

    if-eqz v0, :cond_0

    .line 232
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetTaxonomyNodeRequest;

    .line 233
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->requestMap:Ljava/util/HashMap;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetTaxonomyNodeRequest;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_5

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_5

    .line 236
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetTaxonomyNodeResponse;

    .line 237
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetTaxonomyNodeResponse;->taxonomyNode:Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->addTaxonomyNode(Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;)V

    goto :goto_3

    .line 239
    :cond_0
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetItemIdentifiersForKeywordsRequest;

    if-eqz v0, :cond_5

    .line 240
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_4

    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_4

    .line 241
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetItemIdentifiersForKeywordsResponse;

    .line 244
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetItemIdentifiersForKeywordsResponse;->shoppingItemsForKeywords:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingItemsForKeyword;

    .line 245
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->keywordIdsToShoppingItems:Ljava/util/Map;

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingItemsForKeyword;->keywordId:Ljava/lang/String;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingItemsForKeyword;->shoppingItems:Ljava/util/List;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 250
    :cond_1
    move-object p2, p1

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetItemIdentifiersForKeywordsRequest;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetItemIdentifiersForKeywordsRequest;->keywordIds:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 251
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->keywordIdsToShoppingItems:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 252
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->keywordIdsToShoppingItems:Ljava/util/Map;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 255
    :cond_3
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v0, "shoppingItemsUpdatedEvent"

    invoke-virtual {p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_2

    .line 257
    :cond_4
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v0, "shoppingItemsFailedEvent"

    invoke-virtual {p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 259
    :goto_2
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getItemIdentifiersForKeywordsRequests:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_5
    :goto_3
    return-void
.end method

.method public fetchShoppingItems(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 174
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 178
    :cond_0
    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/GetItemIdentifiersForKeywordsRequest;

    invoke-direct {v3}, Lcom/shopkick/app/fetchers/api/skapi/GetItemIdentifiersForKeywordsRequest;-><init>()V

    .line 179
    iput-object p1, v3, Lcom/shopkick/app/fetchers/api/skapi/GetItemIdentifiersForKeywordsRequest;->keywordIds:Ljava/util/List;

    .line 180
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 182
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    .line 183
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->taxonomyKeywordRelatedOffersBucketSizeMeters:Ljava/lang/Integer;

    .line 184
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-double v8, p1

    .line 182
    invoke-static/range {v4 .. v9}, Lcom/shopkick/utilities/GeoUtilities;->roundLatLonForBucketedCaching(DDD)[D

    move-result-object p1

    const/4 v0, 0x0

    .line 186
    aget-wide v0, p1, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, v3, Lcom/shopkick/app/fetchers/api/skapi/GetItemIdentifiersForKeywordsRequest;->latitude:Ljava/lang/Double;

    const/4 v0, 0x1

    .line 187
    aget-wide v0, p1, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v3, Lcom/shopkick/app/fetchers/api/skapi/GetItemIdentifiersForKeywordsRequest;->longitude:Ljava/lang/Double;

    .line 190
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getItemIdentifiersForKeywordsRequests:Ljava/util/ArrayList;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    const/4 v5, 0x0

    sget-object v6, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v7, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v8, Lnet/toddm/comm/CacheBehavior;->SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v4, p0

    invoke-virtual/range {v1 .. v8}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method public getShoppingItemsForKeywordId(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingItem;",
            ">;"
        }
    .end annotation

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->keywordIdsToShoppingItems:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->keywordIdsToShoppingItems:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getShoppingItemsForKeywordIds(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingItem;",
            ">;"
        }
    .end annotation

    .line 146
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 148
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 149
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->keywordIdsToShoppingItems:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 150
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->keywordIdsToShoppingItems:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    .line 157
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    .line 159
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 160
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingItem;

    .line 161
    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingItem;->toString()Ljava/lang/String;

    move-result-object v3

    .line 162
    invoke-virtual {p1, v3}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 163
    invoke-virtual {p1, v3, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 166
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 167
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_4
    return-object v0
.end method

.method public getTaxonomyNode(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;
    .locals 1

    const/4 v0, 0x0

    .line 125
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getTaxonomyNode(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    move-result-object p1

    return-object p1
.end method

.method public getTaxonomyNode(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->nodeHashMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_1

    .line 131
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->fetchTaxonomyNode(Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 269
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, 0x38f602b1

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "AppActivityManagerSessionStartEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    .line 271
    :cond_2
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->clear()V

    :goto_2
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public setApiManagerV2(Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    return-void
.end method
