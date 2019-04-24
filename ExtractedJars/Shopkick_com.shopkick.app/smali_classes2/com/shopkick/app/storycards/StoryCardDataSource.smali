.class public Lcom/shopkick/app/storycards/StoryCardDataSource;
.super Lcom/shopkick/app/application/UserSavedStateDataSource;
.source "StoryCardDataSource.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field public static final STORY_CARD_ID_KEY:Ljava/lang/String; = "storyCardIdKey"

.field public static final STORY_CARD_KEY:Ljava/lang/String; = "storyCardKey"

.field public static final STORY_CARD_SAVED_STATE_UPDATED_EVENT:Ljava/lang/String; = "storyCardSavedStateUpdated"

.field public static final STORY_CARD_SAVE_REQUEST_COMPLETED_EVENT:Ljava/lang/String; = "storyCardSaveRequestCompleted"

.field public static final STORY_CARD_UPDATE_EVENT:Ljava/lang/String; = "storyCardUpdated"

.field public static final STORY_CARD_UPDATE_FAILED_EVENT:Ljava/lang/String; = "storyCardUpdateFailed"


# instance fields
.field private storyCardIdToRequestMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/GetStoryCardRequest;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/application/UserSavedStateDataSource;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;)V

    .line 31
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/storycards/StoryCardDataSource;->storyCardIdToRequestMap:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public cancelStoryCardFetch(Ljava/lang/String;)V
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/shopkick/app/storycards/StoryCardDataSource;->storyCardIdToRequestMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoryCardRequest;

    .line 107
    iget-object v0, p0, Lcom/shopkick/app/storycards/StoryCardDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v0, p1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 3

    .line 112
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/application/UserSavedStateDataSource;->completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V

    .line 113
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoryCardRequest;

    if-eqz v0, :cond_1

    .line 114
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoryCardRequest;

    .line 115
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v1, "storyCardIdKey"

    .line 116
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoryCardRequest;->storyCardId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    iget-boolean v1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_0

    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v1, :cond_0

    const-string/jumbo v1, "storyCardKey"

    .line 118
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoryCardResponse;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoryCardResponse;->storyCardTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    iget-object p2, p0, Lcom/shopkick/app/storycards/StoryCardDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v1, "storyCardUpdated"

    invoke-virtual {p2, v1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    goto :goto_0

    .line 121
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/storycards/StoryCardDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v1, "storyCardUpdateFailed"

    invoke-virtual {p2, v1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 123
    :goto_0
    iget-object p2, p0, Lcom/shopkick/app/storycards/StoryCardDataSource;->storyCardIdToRequestMap:Ljava/util/HashMap;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoryCardRequest;->storyCardId:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method protected createSaveOrUnsaveRequest(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    if-eqz p2, :cond_0

    .line 41
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryCardRequest;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryCardRequest;-><init>()V

    .line 42
    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryCardRequest;->storyCardId:Ljava/lang/String;

    return-object p2

    .line 45
    :cond_0
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryCardRequest;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryCardRequest;-><init>()V

    .line 46
    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryCardRequest;->storyCardId:Ljava/lang/String;

    return-object p2
.end method

.method protected didResponseFail(Lcom/shopkick/fetchers/DataResponse;)Z
    .locals 3

    .line 83
    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of v0, v0, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryCardResponse;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 84
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryCardResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryCardResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    return v1

    .line 85
    :cond_1
    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of v0, v0, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryCardResponse;

    if-eqz v0, :cond_3

    .line 86
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryCardResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryCardResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    return v1

    :cond_3
    return v2
.end method

.method public fetchStoryCard(Ljava/lang/String;)V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/storycards/StoryCardDataSource;->storyCardIdToRequestMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 99
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoryCardRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoryCardRequest;-><init>()V

    .line 100
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoryCardRequest;->storyCardId:Ljava/lang/String;

    .line 101
    iget-object v1, p0, Lcom/shopkick/app/storycards/StoryCardDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    .line 102
    iget-object v1, p0, Lcom/shopkick/app/storycards/StoryCardDataSource;->storyCardIdToRequestMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method protected getRequestItemId(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/String;
    .locals 1

    .line 58
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryCardRequest;

    if-eqz v0, :cond_0

    .line 59
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryCardRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryCardRequest;->storyCardId:Ljava/lang/String;

    return-object p1

    .line 60
    :cond_0
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryCardRequest;

    if-eqz v0, :cond_1

    .line 61
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryCardRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryCardRequest;->storyCardId:Ljava/lang/String;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected getSaveRequestCompletedNotificationEvent()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "storyCardSaveRequestCompleted"

    return-object v0
.end method

.method protected getSaveUpdatedNotificationEvent()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "storyCardSavedStateUpdated"

    return-object v0
.end method

.method protected isRequestSaving(Lcom/shopkick/app/fetchers/api/IAPIObject;)Z
    .locals 0

    .line 68
    instance-of p1, p1, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryCardRequest;

    return p1
.end method

.method protected isSaveOrUnsaveRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)Z
    .locals 1

    .line 53
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryCardRequest;

    if-nez v0, :cond_1

    instance-of p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryCardRequest;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
