.class public Lcom/shopkick/app/lookbooks/InstantBonusAwarder;
.super Ljava/lang/Object;
.source "InstantBonusAwarder.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field public static final INSTANT_BONUS_AWARDED_EVENT:Ljava/lang/String; = "instantBonusAwardedEvent"

.field public static final INSTANT_BONUS_ERROR_MESSAGE_KEY:Ljava/lang/String; = "instantBonusErrorMessageKey"

.field public static final INSTANT_BONUS_FAILED_EVENT:Ljava/lang/String; = "instantBonusFailed"

.field public static final INSTANT_BONUS_ID:Ljava/lang/String; = "instantBonusId"

.field public static final INSTANT_BONUS_LARGE_KEY:Ljava/lang/String; = "instantBonusLargeKey"

.field public static final INSTANT_BONUS_SMALL_KEY:Ljava/lang/String; = "instantBonusSmallKey"


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private awardInstantBonusRequest:Lcom/shopkick/app/fetchers/api/skapi/AwardInstantBonusRequestV2;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/shopkick/app/lookbooks/InstantBonusAwarder;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 28
    iput-object p2, p0, Lcom/shopkick/app/lookbooks/InstantBonusAwarder;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-void
.end method


# virtual methods
.method public awardBonus(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/lang/String;)V
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/InstantBonusAwarder;->awardInstantBonusRequest:Lcom/shopkick/app/fetchers/api/skapi/AwardInstantBonusRequestV2;

    if-eqz v0, :cond_0

    return-void

    .line 35
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->hasCollectedInstantBonus:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 36
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/AwardInstantBonusRequestV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/AwardInstantBonusRequestV2;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/lookbooks/InstantBonusAwarder;->awardInstantBonusRequest:Lcom/shopkick/app/fetchers/api/skapi/AwardInstantBonusRequestV2;

    .line 37
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/InstantBonusAwarder;->awardInstantBonusRequest:Lcom/shopkick/app/fetchers/api/skapi/AwardInstantBonusRequestV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->instantBonusId:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/AwardInstantBonusRequestV2;->entityId:Ljava/lang/String;

    .line 38
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/InstantBonusAwarder;->awardInstantBonusRequest:Lcom/shopkick/app/fetchers/api/skapi/AwardInstantBonusRequestV2;

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/AwardInstantBonusRequestV2;->storyId:Ljava/lang/String;

    .line 39
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/InstantBonusAwarder;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p2, p1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_1
    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 53
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/AwardInstantBonusRequestV2;

    .line 54
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "instantBonusId"

    .line 55
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/AwardInstantBonusRequestV2;->entityId:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_1

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_1

    .line 57
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/AwardInstantBonusV2Response;

    .line 58
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/AwardInstantBonusV2Response;->errorMsg:Ljava/lang/String;

    if-eqz p2, :cond_0

    const-string p2, "instantBonusErrorMessageKey"

    .line 59
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/AwardInstantBonusV2Response;->errorMsg:Ljava/lang/String;

    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/InstantBonusAwarder;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "instantBonusFailed"

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void

    :cond_0
    const-string p2, "instantBonusLargeKey"

    .line 63
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/AwardInstantBonusV2Response;->updatedLargeTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "instantBonusSmallKey"

    .line 64
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/AwardInstantBonusV2Response;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/InstantBonusAwarder;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "instantBonusAwardedEvent"

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    goto :goto_0

    .line 67
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/InstantBonusAwarder;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "instantBonusFailed"

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :goto_0
    const/4 p1, 0x0

    .line 69
    iput-object p1, p0, Lcom/shopkick/app/lookbooks/InstantBonusAwarder;->awardInstantBonusRequest:Lcom/shopkick/app/fetchers/api/skapi/AwardInstantBonusRequestV2;

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
