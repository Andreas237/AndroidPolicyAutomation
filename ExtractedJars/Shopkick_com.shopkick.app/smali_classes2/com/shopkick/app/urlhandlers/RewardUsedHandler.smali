.class public Lcom/shopkick/app/urlhandlers/RewardUsedHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "RewardUsedHandler.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "update_reward_used"

.field public static final EVENT:Ljava/lang/String; = "REWARD_UPDATED_USED_STATUS"

.field private static final PARAM_CALLBACK:Ljava/lang/String; = "callback"

.field public static final PARAM_REWARD_ID:Ljava/lang/String; = "reward_id"

.field public static final PARAM_USED:Ljava/lang/String; = "used"


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private request:Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequest;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 38
    iput-object p2, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 39
    iput-object p3, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 40
    iput-object p4, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 p1, 0x1

    .line 41
    iput-boolean p1, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->isAsync:Z

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 0

    .line 51
    invoke-super {p0}, Lcom/shopkick/app/url/URLHandler;->cancel()V

    return-void
.end method

.method public clone()Lcom/shopkick/app/url/URLHandler;
    .locals 5

    .line 46
    new-instance v0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v3, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v4, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 19
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->clone()Lcom/shopkick/app/url/URLHandler;

    move-result-object v0

    return-object v0
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 3

    .line 89
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    .line 90
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequest;

    const-string p2, "callback"

    const/4 v0, 0x1

    .line 91
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequest;->used:Ljava/lang/Boolean;

    aput-object v2, v0, v1

    invoke-virtual {p0, p2, v0}, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->finishWithWebViewCallback(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "reward_id"

    .line 93
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequest;->rewardId:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v0, "used"

    .line 94
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequest;->used:Ljava/lang/Boolean;

    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    iget-object p1, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "REWARD_UPDATED_USED_STATUS"

    invoke-virtual {p1, v0, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    goto :goto_0

    .line 97
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    :goto_0
    return-void
.end method

.method public execute()V
    .locals 3

    .line 56
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 58
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->finish()V

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 64
    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->params:Ljava/util/Map;

    if-eqz v2, :cond_1

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->params:Ljava/util/Map;

    const-string v1, "reward_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 66
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->params:Ljava/util/Map;

    const-string/jumbo v2, "used"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v1

    :cond_1
    if-eqz v0, :cond_2

    .line 70
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequest;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequest;-><init>()V

    iput-object v2, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->request:Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequest;

    .line 71
    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->request:Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequest;

    iput-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequest;->rewardId:Ljava/lang/String;

    .line 72
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequest;->used:Ljava/lang/Boolean;

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/RewardUsedHandler;->request:Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_2
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

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
