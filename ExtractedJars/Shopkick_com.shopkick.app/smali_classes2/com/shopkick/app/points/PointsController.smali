.class public Lcom/shopkick/app/points/PointsController;
.super Ljava/lang/Object;
.source "PointsController.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private profilePoints:Lcom/shopkick/app/points/ProfilePoints;

.field private req:Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsRequestV2;

.field private userAcct:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/points/ProfilePoints;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/shopkick/app/points/PointsController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 33
    iput-object p2, p0, Lcom/shopkick/app/points/PointsController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 34
    iput-object p3, p0, Lcom/shopkick/app/points/PointsController;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 35
    iput-object p4, p0, Lcom/shopkick/app/points/PointsController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    const-string p1, "UserAccountIdChangedEvent"

    .line 37
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "LogoutRequestSuccess"

    .line 38
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/points/PointsController;->req:Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsRequestV2;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 63
    iput-object p1, p0, Lcom/shopkick/app/points/PointsController;->req:Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsRequestV2;

    .line 64
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_0

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_0

    .line 65
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsV2Response;

    .line 66
    iget-object p2, p0, Lcom/shopkick/app/points/PointsController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/points/ProfilePoints;->updateWithProfilesPointsResponse(Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsV2Response;)V

    :cond_0
    return-void
.end method

.method public destroy()V
    .locals 2

    .line 42
    iget-object v0, p0, Lcom/shopkick/app/points/PointsController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 43
    iget-object v0, p0, Lcom/shopkick/app/points/PointsController;->req:Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsRequestV2;

    if-eqz v0, :cond_0

    .line 44
    iget-object v1, p0, Lcom/shopkick/app/points/PointsController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lcom/shopkick/app/points/PointsController;->req:Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsRequestV2;

    :cond_0
    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
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

    const-string p2, "UserAccountIdChangedEvent"

    if-ne p1, p2, :cond_0

    .line 80
    invoke-virtual {p0}, Lcom/shopkick/app/points/PointsController;->update()V

    goto :goto_0

    :cond_0
    const-string p2, "LogoutRequestSuccess"

    if-ne p1, p2, :cond_1

    .line 82
    iget-object p1, p0, Lcom/shopkick/app/points/PointsController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {p1}, Lcom/shopkick/app/points/ProfilePoints;->clear()V

    :cond_1
    :goto_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public update()V
    .locals 9

    .line 51
    iget-object v0, p0, Lcom/shopkick/app/points/PointsController;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->accountExists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/points/PointsController;->req:Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsRequestV2;

    if-nez v0, :cond_0

    .line 53
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsRequestV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsRequestV2;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/points/PointsController;->req:Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsRequestV2;

    .line 54
    iget-object v1, p0, Lcom/shopkick/app/points/PointsController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v3, p0, Lcom/shopkick/app/points/PointsController;->req:Lcom/shopkick/app/fetchers/api/skapi/ProfilesPointsRequestV2;

    const/4 v5, 0x0

    sget-object v6, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v7, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v8, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v4, p0

    invoke-virtual/range {v1 .. v8}, Lcom/shopkick/fetchers/api/APIManager;->fetchInBackground(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_0
    return-void
.end method
