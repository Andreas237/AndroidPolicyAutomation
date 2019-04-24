.class public Lcom/shopkick/app/widget/WidgetDataSource;
.super Ljava/lang/Object;
.source "WidgetDataSource.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;
    }
.end annotation


# static fields
.field public static final ENABLE_SEE_ALL_LINK_CPGLOCATIONFEED_REQUEST:Ljava/lang/String; = "ENABLE_SEE_ALL_LINK_CPGLOCATIONFEED_REQUEST"

.field public static final EVENT_MODULE_REQUEST_FAILED:Ljava/lang/String; = "EventModuleRequestFailed"

.field public static final EVENT_MODULE_REQUEST_SUCCESS:Ljava/lang/String; = "EventModuleRequestSuccess"

.field public static final LOAD_STATE_FAILED:I = 0x2

.field public static final LOAD_STATE_NOT_LOADED:I = 0x0

.field public static final LOAD_STATE_SUCCESS:I = 0x1

.field public static final PARAM_MODULE_REQUEST_WIDGET_TYPES:Ljava/lang/String; = "ParamModuleRequestWidgetTypes"


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private requestOnFlyingHashMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;"
        }
    .end annotation
.end field

.field private responseHashMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/fetchers/DataResponse;",
            ">;"
        }
    .end annotation
.end field

.field private widgetTypeHashMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field private widgetTypeToIndividualDataSourceHashMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;",
            ">;"
        }
    .end annotation
.end field

.field private widgetTypeToRequestHashMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->requestOnFlyingHashMap:Ljava/util/HashMap;

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->responseHashMap:Ljava/util/HashMap;

    .line 42
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeHashMap:Ljava/util/HashMap;

    .line 44
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToRequestHashMap:Ljava/util/HashMap;

    .line 45
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToIndividualDataSourceHashMap:Ljava/util/HashMap;

    .line 48
    iput-object p1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 49
    iput-object p2, p0, Lcom/shopkick/app/widget/WidgetDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 51
    iget-object p1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "ScanBCSucceeded"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 52
    iget-object p1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventReceiptScanUploaded"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 53
    iget-object p1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "eventOnlineStoreClickSucceeded"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 54
    iget-object p1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "eventOnlineOfferClickSucceeded"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method private cancelAllRequest()V
    .locals 4

    .line 382
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->requestOnFlyingHashMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 383
    iget-object v2, p0, Lcom/shopkick/app/widget/WidgetDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v3, p0, Lcom/shopkick/app/widget/WidgetDataSource;->requestOnFlyingHashMap:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/IAPIObject;

    invoke-virtual {v2, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    goto :goto_0

    .line 385
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->requestOnFlyingHashMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method private cancelRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 374
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->getRequestId(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/String;

    move-result-object p1

    .line 375
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->requestOnFlyingHashMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 376
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->requestOnFlyingHashMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/IAPIObject;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 377
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->requestOnFlyingHashMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method private createCPGCategoryRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 343
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedRequest;-><init>()V

    .line 344
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedRequest;->productHierarchyId:Ljava/lang/String;

    return-object v0
.end method

.method private createCPGLocationRequest(Ljava/lang/String;DD)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 2

    .line 308
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;-><init>()V

    const/4 v1, 0x0

    .line 309
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->locationId:Ljava/lang/String;

    .line 310
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->chainId:Ljava/lang/String;

    .line 311
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->longitude:Ljava/lang/Double;

    .line 312
    invoke-static {p4, p5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->latitude:Ljava/lang/Double;

    return-object v0
.end method

.method private createCPGLocationRequest(Ljava/lang/String;DDZ)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 2

    .line 333
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;-><init>()V

    const/4 v1, 0x0

    .line 334
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->locationId:Ljava/lang/String;

    .line 335
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->chainId:Ljava/lang/String;

    .line 336
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->longitude:Ljava/lang/Double;

    .line 337
    invoke-static {p4, p5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->latitude:Ljava/lang/Double;

    .line 338
    invoke-static {p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->enableHeaderSklink:Ljava/lang/Boolean;

    return-object v0
.end method

.method private createCPGLocationRequest(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 317
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;-><init>()V

    .line 318
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->locationId:Ljava/lang/String;

    .line 319
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->chainId:Ljava/lang/String;

    return-object v0
.end method

.method private createCPGLocationRequest(Ljava/lang/String;Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 324
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;-><init>()V

    .line 325
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->locationId:Ljava/lang/String;

    .line 326
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->chainId:Ljava/lang/String;

    .line 327
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;->enableHeaderSklink:Ljava/lang/Boolean;

    return-object v0
.end method

.method private createGetOnlineOffersRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 349
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersRequest;-><init>()V

    .line 350
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersRequest;->chainId:Ljava/lang/String;

    return-object v0
.end method

.method private fetch(Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 10

    .line 389
    invoke-direct {p0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->getRequestId(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/String;

    move-result-object v0

    .line 390
    iget-object v1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->requestOnFlyingHashMap:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 392
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->requestOnFlyingHashMap:Ljava/util/HashMap;

    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    iget-object v2, p0, Lcom/shopkick/app/widget/WidgetDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v3, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    const/4 v6, 0x1

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v4, p1

    move-object v5, p0

    invoke-virtual/range {v2 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method private flushWithRequestObject(ILcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 3

    if-nez p2, :cond_0

    return-void

    .line 212
    :cond_0
    invoke-direct {p0, p2}, Lcom/shopkick/app/widget/WidgetDataSource;->getRequestId(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/String;

    move-result-object p2

    .line 214
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToRequestHashMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    .line 215
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 216
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 217
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToRequestHashMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeHashMap:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    if-eqz v0, :cond_3

    .line 222
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 223
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    .line 224
    iget-object v1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->requestOnFlyingHashMap:Ljava/util/HashMap;

    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/IAPIObject;

    invoke-direct {p0, v1}, Lcom/shopkick/app/widget/WidgetDataSource;->cancelRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    .line 225
    iget-object v1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->responseHashMap:Ljava/util/HashMap;

    invoke-virtual {v1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    iget-object v1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeHashMap:Ljava/util/HashMap;

    invoke-virtual {v1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method

.method private getLoadState(Lcom/shopkick/app/fetchers/api/IAPIObject;)I
    .locals 1

    if-eqz p1, :cond_1

    .line 147
    invoke-direct {p0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->getRequestId(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/String;

    move-result-object p1

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->responseHashMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 149
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->responseHashMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/fetchers/DataResponse;

    .line 150
    iget-boolean p1, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private getRequestId(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/String;
    .locals 2

    .line 304
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/IAPIObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getResponse(ILcom/shopkick/app/fetchers/api/IAPIObject;)Lcom/shopkick/fetchers/DataResponse;
    .locals 2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    .line 358
    :cond_0
    invoke-direct {p0, p2}, Lcom/shopkick/app/widget/WidgetDataSource;->getRequestId(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/String;

    move-result-object v1

    .line 359
    invoke-direct {p0, p1, v1}, Lcom/shopkick/app/widget/WidgetDataSource;->registerRequestString(ILjava/lang/String;)V

    .line 361
    iget-object p1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->responseHashMap:Ljava/util/HashMap;

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 362
    iget-object p1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->responseHashMap:Ljava/util/HashMap;

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/fetchers/DataResponse;

    return-object p1

    .line 365
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->requestOnFlyingHashMap:Ljava/util/HashMap;

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 366
    invoke-direct {p0, p2}, Lcom/shopkick/app/widget/WidgetDataSource;->fetch(Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    :cond_2
    return-object v0
.end method

.method private registerRequestString(ILjava/lang/String;)V
    .locals 2

    .line 403
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeHashMap:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    if-nez v0, :cond_0

    .line 405
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 406
    iget-object v1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeHashMap:Ljava/util/HashMap;

    invoke-virtual {v1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 410
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToRequestHashMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    if-nez v0, :cond_1

    .line 412
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 413
    iget-object v1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToRequestHashMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    .line 447
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/widget/WidgetDataSource;->setData(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V

    return-void
.end method

.method public varargs createRequest(I[Ljava/lang/Object;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 10

    const/16 v0, 0xfa1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_1

    const/16 v0, 0xfae

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    .line 270
    :cond_0
    :pswitch_0
    aget-object p1, p2, v1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->createGetOnlineOffersRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    return-object p1

    .line 248
    :cond_1
    array-length p1, p2

    const/4 v0, 0x1

    const/4 v2, 0x2

    packed-switch p1, :pswitch_data_1

    goto :goto_0

    .line 261
    :pswitch_1
    aget-object p1, p2, v1

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    aget-object p1, p2, v0

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    aget-object p1, p2, v2

    check-cast p1, Ljava/lang/Double;

    .line 262
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    const/4 p1, 0x3

    aget-object p1, p2, p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    move-object v3, p0

    .line 261
    invoke-direct/range {v3 .. v9}, Lcom/shopkick/app/widget/WidgetDataSource;->createCPGLocationRequest(Ljava/lang/String;DDZ)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    return-object p1

    .line 252
    :pswitch_2
    aget-object p1, p2, v2

    instance-of p1, p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_2

    .line 253
    aget-object p1, p2, v1

    check-cast p1, Ljava/lang/String;

    aget-object v0, p2, v0

    check-cast v0, Ljava/lang/String;

    aget-object p2, p2, v2

    check-cast p2, Ljava/lang/Boolean;

    .line 254
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 253
    invoke-direct {p0, p1, v0, p2}, Lcom/shopkick/app/widget/WidgetDataSource;->createCPGLocationRequest(Ljava/lang/String;Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    return-object p1

    .line 255
    :cond_2
    aget-object p1, p2, v2

    instance-of p1, p1, Ljava/lang/Double;

    if-eqz p1, :cond_3

    .line 256
    aget-object p1, p2, v1

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    aget-object p1, p2, v0

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    aget-object p1, p2, v2

    check-cast p1, Ljava/lang/Double;

    .line 257
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    move-object v3, p0

    .line 256
    invoke-direct/range {v3 .. v8}, Lcom/shopkick/app/widget/WidgetDataSource;->createCPGLocationRequest(Ljava/lang/String;DD)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    return-object p1

    .line 250
    :pswitch_3
    aget-object p1, p2, v1

    check-cast p1, Ljava/lang/String;

    aget-object p2, p2, v0

    check-cast p2, Ljava/lang/String;

    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/widget/WidgetDataSource;->createCPGLocationRequest(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    return-object p1

    .line 266
    :cond_3
    :goto_0
    :pswitch_4
    aget-object p1, p2, v1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->createCPGCategoryRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0xfa5
        :pswitch_0
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public createRequest(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 8

    .line 277
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xfa1

    if-eq v0, v1, :cond_1

    const/16 v1, 0xfae

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    .line 297
    :cond_0
    :pswitch_0
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->createGetOnlineOffersRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v0, 0x0

    .line 280
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v1

    const-string v2, "ENABLE_SEE_ALL_LINK_CPGLOCATIONFEED_REQUEST"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 281
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "ENABLE_SEE_ALL_LINK_CPGLOCATIONFEED_REQUEST"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v7, v0

    goto :goto_0

    :cond_2
    move v7, v0

    .line 283
    :goto_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->latitude:Ljava/lang/Double;

    if-eqz v0, :cond_3

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->longitude:Ljava/lang/Double;

    if-eqz v0, :cond_3

    .line 284
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->longitude:Ljava/lang/Double;

    .line 285
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->latitude:Ljava/lang/Double;

    .line 286
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    move-object v1, p0

    .line 284
    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/widget/WidgetDataSource;->createCPGLocationRequest(Ljava/lang/String;DDZ)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    return-object p1

    .line 288
    :cond_3
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 289
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-direct {p0, v0, p1, v7}, Lcom/shopkick/app/widget/WidgetDataSource;->createCPGLocationRequest(Ljava/lang/String;Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    return-object p1

    .line 293
    :cond_4
    :pswitch_1
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->createCPGCategoryRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0xfa5
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public destroy()V
    .locals 0

    .line 58
    invoke-virtual {p0}, Lcom/shopkick/app/widget/WidgetDataSource;->flushAll()V

    return-void
.end method

.method public flush(I)V
    .locals 5

    .line 158
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToRequestHashMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    if-eqz v0, :cond_2

    .line 160
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 162
    iget-object v2, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeHashMap:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/HashSet;

    if-eqz v2, :cond_0

    .line 163
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 164
    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    .line 165
    iget-object v3, p0, Lcom/shopkick/app/widget/WidgetDataSource;->requestOnFlyingHashMap:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/IAPIObject;

    invoke-direct {p0, v3}, Lcom/shopkick/app/widget/WidgetDataSource;->cancelRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    .line 166
    iget-object v3, p0, Lcom/shopkick/app/widget/WidgetDataSource;->responseHashMap:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    iget-object v3, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeHashMap:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 175
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToIndividualDataSourceHashMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 176
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToIndividualDataSourceHashMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;

    invoke-interface {p1}, Lcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;->flush()V

    :cond_3
    return-void
.end method

.method public varargs flush(I[Ljava/lang/Object;)V
    .locals 2

    .line 183
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToIndividualDataSourceHashMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 184
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToIndividualDataSourceHashMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;

    invoke-interface {v0, p1, p2}, Lcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;->flush(I[Ljava/lang/Object;)V

    return-void

    .line 188
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToRequestHashMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 190
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/widget/WidgetDataSource;->createRequest(I[Ljava/lang/Object;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p2

    .line 191
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/widget/WidgetDataSource;->flushWithRequestObject(ILcom/shopkick/app/fetchers/api/IAPIObject;)V

    return-void
.end method

.method public flush(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    .line 197
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToIndividualDataSourceHashMap:Ljava/util/HashMap;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 198
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToIndividualDataSourceHashMap:Ljava/util/HashMap;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;

    invoke-interface {v0, p1}, Lcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;->flush(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void

    .line 202
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToRequestHashMap:Ljava/util/HashMap;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 204
    :cond_1
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 205
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->createRequest(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    .line 206
    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->flushWithRequestObject(ILcom/shopkick/app/fetchers/api/IAPIObject;)V

    return-void
.end method

.method public flushAll()V
    .locals 2

    .line 233
    invoke-direct {p0}, Lcom/shopkick/app/widget/WidgetDataSource;->cancelAllRequest()V

    .line 234
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->responseHashMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 235
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeHashMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 236
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToRequestHashMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 239
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToIndividualDataSourceHashMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;

    .line 240
    invoke-interface {v1}, Lcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;->flushAll()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public varargs getData(I[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    .line 73
    aget-object v1, p2, v0

    instance-of v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v1, :cond_0

    .line 74
    aget-object p2, p2, v0

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p0, p2}, Lcom/shopkick/app/widget/WidgetDataSource;->createRequest(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p2

    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/widget/WidgetDataSource;->createRequest(I[Ljava/lang/Object;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p2

    .line 78
    :goto_0
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/widget/WidgetDataSource;->getResponse(ILcom/shopkick/app/fetchers/api/IAPIObject;)Lcom/shopkick/fetchers/DataResponse;

    move-result-object p1

    return-object p1
.end method

.method public getData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/lang/Object;
    .locals 3

    .line 64
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/widget/WidgetDataSource;->getData(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getIndividualDataSource(I)Lcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToIndividualDataSourceHashMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;

    return-object p1
.end method

.method public varargs getLoadState(I[Ljava/lang/Object;)I
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToIndividualDataSourceHashMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToIndividualDataSourceHashMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;

    invoke-interface {v0, p1, p2}, Lcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;->getLoadState(I[Ljava/lang/Object;)I

    move-result p1

    return p1

    .line 134
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/widget/WidgetDataSource;->createRequest(I[Ljava/lang/Object;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->getLoadState(Lcom/shopkick/app/fetchers/api/IAPIObject;)I

    move-result p1

    return p1
.end method

.method public getLoadState(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I
    .locals 2

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToIndividualDataSourceHashMap:Ljava/util/HashMap;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToIndividualDataSourceHashMap:Ljava/util/HashMap;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;

    invoke-interface {v0, p1}, Lcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;->getLoadState(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I

    move-result p1

    return p1

    .line 141
    :cond_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->createRequest(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->getLoadState(Lcom/shopkick/app/fetchers/api/IAPIObject;)I

    move-result p1

    return p1
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

    .line 424
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, -0x57c9a285

    if-eq p2, v0, :cond_1

    const v0, 0x556e6c68

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "eventOnlineOfferClickSucceeded"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const-string p2, "EventReceiptScanUploaded"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    const/16 p1, 0xfa5

    .line 431
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->flush(I)V

    const/16 p1, 0xfae

    .line 432
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->flush(I)V

    goto :goto_2

    :pswitch_1
    const/16 p1, 0xfa1

    .line 427
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->flush(I)V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public putIndividualDataSource(ILcom/shopkick/app/widget/WidgetDataSource$IWidgetDataSource;)V
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeToIndividualDataSourceHashMap:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public setData(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    const/4 v0, 0x1

    .line 97
    invoke-virtual {p0, p1, p2, v0}, Lcom/shopkick/app/widget/WidgetDataSource;->setData(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;Z)V

    return-void
.end method

.method public setData(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;Z)V
    .locals 2

    .line 101
    invoke-direct {p0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->getRequestId(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/String;

    move-result-object p1

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->requestOnFlyingHashMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v0, :cond_0

    .line 104
    iget-object v1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/widget/WidgetDataSource;->responseHashMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p3, :cond_2

    .line 109
    iget-object p3, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeHashMap:Ljava/util/HashMap;

    invoke-virtual {p3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_2

    const-string p3, "ParamModuleRequestWidgetTypes"

    .line 110
    iget-object v1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->widgetTypeHashMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-nez p1, :cond_1

    .line 112
    iget-object p1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventModuleRequestFailed"

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    goto :goto_0

    .line 114
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/widget/WidgetDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventModuleRequestSuccess"

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :cond_2
    :goto_0
    return-void
.end method

.method public setData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    const/4 v0, 0x1

    .line 83
    invoke-virtual {p0, p1, p2, v0}, Lcom/shopkick/app/widget/WidgetDataSource;->setData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/fetchers/DataResponse;Z)V

    return-void
.end method

.method public setData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/fetchers/DataResponse;Z)V
    .locals 2

    .line 87
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/WidgetDataSource;->createRequest(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 90
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {p0, v0}, Lcom/shopkick/app/widget/WidgetDataSource;->getRequestId(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lcom/shopkick/app/widget/WidgetDataSource;->registerRequestString(ILjava/lang/String;)V

    .line 92
    invoke-virtual {p0, v0, p2, p3}, Lcom/shopkick/app/widget/WidgetDataSource;->setData(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;Z)V

    :cond_0
    return-void
.end method
