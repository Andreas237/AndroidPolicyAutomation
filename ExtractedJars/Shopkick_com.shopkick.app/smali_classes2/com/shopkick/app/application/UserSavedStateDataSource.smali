.class public abstract Lcom/shopkick/app/application/UserSavedStateDataSource;
.super Ljava/lang/Object;
.source "UserSavedStateDataSource.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;
    }
.end annotation


# static fields
.field public static final ITEM_ID_KEY:Ljava/lang/String; = "itemIdKey"

.field public static final ITEM_SAVE_STATE_KEY:Ljava/lang/String; = "itemSaveStateKey"

.field public static final ITEM_SAVE_STATE_UPDATED_DUE_TO_FAILURE_KEY:Ljava/lang/String; = "itemSaveStateUpdatedDueToFailure"


# instance fields
.field protected apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private itemIdToPendingRequests:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;",
            ">;"
        }
    .end annotation
.end field

.field protected itemIdToSaveState:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field protected notificationCenter:Lcom/shopkick/app/util/NotificationCenter;


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 31
    iput-object p2, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 32
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToSaveState:Ljava/util/HashMap;

    .line 33
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToPendingRequests:Ljava/util/HashMap;

    const-string p1, "UserAccountIdChangedEvent"

    .line 34
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method private maybeNotifyItemSaveCompleted(Ljava/lang/String;)V
    .locals 3

    .line 104
    invoke-virtual {p0}, Lcom/shopkick/app/application/UserSavedStateDataSource;->getSaveRequestCompletedNotificationEvent()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 106
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "itemIdKey"

    .line 107
    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    iget-object p1, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :cond_0
    return-void
.end method

.method private notifyItemSaveStateUpdated(Ljava/lang/String;ZZ)V
    .locals 2

    .line 96
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "itemIdKey"

    .line 97
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "itemSaveStateKey"

    .line 98
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "itemSaveStateUpdatedDueToFailure"

    .line 99
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    iget-object p1, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {p0}, Lcom/shopkick/app/application/UserSavedStateDataSource;->getSaveUpdatedNotificationEvent()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToSaveState:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 39
    iget-object v0, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToPendingRequests:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 3

    .line 140
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/UserSavedStateDataSource;->isSaveOrUnsaveRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 144
    :cond_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/UserSavedStateDataSource;->getRequestItemId(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/String;

    move-result-object v0

    .line 145
    iget-object v1, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToPendingRequests:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;

    .line 146
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/UserSavedStateDataSource;->isRequestSaving(Lcom/shopkick/app/fetchers/api/IAPIObject;)Z

    move-result p1

    .line 147
    iget-boolean v2, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v2, :cond_3

    iget-object v2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v2, :cond_3

    invoke-virtual {p0, p2}, Lcom/shopkick/app/application/UserSavedStateDataSource;->didResponseFail(Lcom/shopkick/fetchers/DataResponse;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 149
    invoke-direct {p0, v0}, Lcom/shopkick/app/application/UserSavedStateDataSource;->maybeNotifyItemSaveCompleted(Ljava/lang/String;)V

    .line 154
    iget-object p2, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToSaveState:Ljava/util/HashMap;

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 155
    iget-object p2, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToSaveState:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    :cond_1
    iget-object p1, v1, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;->queuedRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    iput-object p1, v1, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;->inFlightRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    const/4 p1, 0x0

    .line 158
    iput-object p1, v1, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;->queuedRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 160
    iget-object p1, v1, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;->inFlightRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz p1, :cond_2

    .line 161
    iget-object p1, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object p2, v1, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;->inFlightRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    invoke-virtual {p1, p2, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    goto :goto_0

    .line 163
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToPendingRequests:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 170
    :cond_3
    iget-object p2, v1, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;->queuedRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-nez p2, :cond_4

    const/4 p2, 0x1

    xor-int/2addr p1, p2

    .line 172
    iget-object v1, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToSaveState:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    invoke-direct {p0, v0, p1, p2}, Lcom/shopkick/app/application/UserSavedStateDataSource;->notifyItemSaveStateUpdated(Ljava/lang/String;ZZ)V

    .line 175
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToPendingRequests:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method protected abstract createSaveOrUnsaveRequest(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
.end method

.method protected didResponseFail(Lcom/shopkick/fetchers/DataResponse;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected abstract getRequestItemId(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/String;
.end method

.method protected getSaveRequestCompletedNotificationEvent()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSaveStateForItem(Ljava/lang/String;Z)Z
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToSaveState:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    iget-object p2, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToSaveState:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    :cond_0
    return p2
.end method

.method protected abstract getSaveUpdatedNotificationEvent()Ljava/lang/String;
.end method

.method protected abstract isRequestSaving(Lcom/shopkick/app/fetchers/api/IAPIObject;)Z
.end method

.method protected abstract isSaveOrUnsaveRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)Z
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

    const-string p2, "UserAccountIdChangedEvent"

    .line 118
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 119
    iget-object p1, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToPendingRequests:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 120
    iget-object v0, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToPendingRequests:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;

    .line 121
    iget-object v0, p2, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;->inFlightRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v0, :cond_0

    .line 122
    iget-object v0, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object p2, p2, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;->inFlightRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    invoke-virtual {v0, p2, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    goto :goto_0

    .line 125
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToPendingRequests:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 126
    invoke-virtual {p0}, Lcom/shopkick/app/application/UserSavedStateDataSource;->clear()V

    :cond_2
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public toggleItemSaveState(Ljava/lang/String;Z)V
    .locals 2

    .line 63
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/application/UserSavedStateDataSource;->getSaveStateForItem(Ljava/lang/String;Z)Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToSaveState:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 66
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/application/UserSavedStateDataSource;->notifyItemSaveStateUpdated(Ljava/lang/String;ZZ)V

    .line 68
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/application/UserSavedStateDataSource;->createSaveOrUnsaveRequest(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v0

    .line 69
    iget-object v1, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToPendingRequests:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 70
    iget-object v1, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToPendingRequests:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;

    .line 71
    iget-object v1, p1, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;->queuedRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v1, :cond_0

    .line 74
    iget-object v0, p1, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;->queuedRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/UserSavedStateDataSource;->isRequestSaving(Lcom/shopkick/app/fetchers/api/IAPIObject;)Z

    move-result v0

    if-eq v0, p2, :cond_2

    const/4 p2, 0x0

    .line 75
    iput-object p2, p1, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;->queuedRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    goto :goto_0

    .line 79
    :cond_0
    iput-object v0, p1, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;->queuedRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    goto :goto_0

    .line 82
    :cond_1
    new-instance p2, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;

    invoke-direct {p2}, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;-><init>()V

    .line 83
    iput-object v0, p2, Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;->inFlightRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 84
    iget-object v1, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->itemIdToPendingRequests:Ljava/util/HashMap;

    invoke-virtual {v1, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    iget-object p1, p0, Lcom/shopkick/app/application/UserSavedStateDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_2
    :goto_0
    return-void
.end method
