.class public Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;
.super Ljava/lang/Object;
.source "RedeemedRewardsDatasource.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/offline/IReadOfflineDataEntityFromDiskCallback;
.implements Lcom/shopkick/app/offline/IOfflineDataCategorySyncCallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$GetFulfilledRewardRunnable;,
        Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;
    }
.end annotation


# static fields
.field public static final ALL_CHAINS_REWARD_KEY:Ljava/lang/String; = "ALL_CHAINS_REWARD_KEY"

.field public static final CHAIN_ID_FOR_PAGED_REWARDS:Ljava/lang/String; = "CHAIN_ID_FOR_PAGED_REWARDS"

.field public static final EMAILED_REWARD_REDEMPTION_FAILURE_EVENT:Ljava/lang/String; = "EMAILED_REWARD_REDEMPTION_FAILURE_EVENT"

.field public static final EMAILED_REWARD_REDEMPTION_SUCCESS_EVENT:Ljava/lang/String; = "EMAILED_REWARD_REDEMPTION_SUCCESS_EVENT"

.field public static final PAGED_REWARDS:Ljava/lang/String; = "PAGED_REWARDS"

.field public static final REWARDS_COUNT_TO_DISPLAY_UPDATED_EVENT:Ljava/lang/String; = "REWARDS_COUNT_TO_DISPLAY_UPDATED_EVENT"

.field public static final REWARD_ENTITY_KEY:Ljava/lang/String; = "REWARD_ENTITY_KEY"

.field public static final REWARD_ERROR_MESSAGE:Ljava/lang/String; = "REWARD_ERROR_MESSAGE"

.field public static final REWARD_FETCH_FAILED_EVENT:Ljava/lang/String; = "REWARD_FETCH_FAILED_EVENT"

.field public static final REWARD_FETCH_SUCCEEDED_EVENT:Ljava/lang/String; = "REWARD_FETCH_SUCCEEDED_EVENT"

.field public static final REWARD_ID:Ljava/lang/String; = "REWARD_ID"

.field public static final REWARD_REDEMPTION_FAILURE_EVENT:Ljava/lang/String; = "REWARD_REDEMPTION_FAILURE_EVENT"

.field public static final REWARD_REDEMPTION_RESPONSE:Ljava/lang/String; = "REWARD_REDEMPTION_RESPONSE"

.field public static final REWARD_REDEMPTION_SUCCESS_EVENT:Ljava/lang/String; = "REWARD_REDEMPTION_SUCCESS_EVENT"

.field public static final REWARD_REDEMPTION_WEBVIEW_URL:Ljava/lang/String; = "REWARD_REDEMPTION_WEBVIEW_URL"

.field public static final REWARD_USED_STATUS_UPDATE_FAIL_EVENT:Ljava/lang/String; = "REWARD_USED_STATUS_UPDATE_FAIL_EVENT"

.field public static final REWARD_USED_STATUS_UPDATE_SUCCESS_EVENT:Ljava/lang/String; = "REWARD_USED_STATUS_UPDATE_SUCCESS_EVENT"

.field private static final TEMP_ENTITY_VERSION:Ljava/lang/String; = "temp_entity_version"

.field public static final TOTAL_NUM_REWARDS:Ljava/lang/String; = "TOTAL_NUM_REWARDS"

.field public static final UNUSED_REWARDS_FROM_OFFLINE_DATA_STORE_UPDATED:Ljava/lang/String; = "UNUSED_REWARDS_FROM_OFFLINE_DATA_STORE_UPDATED"

.field public static final UNUSED_REWARDS_PAGE_FAIL_EVENT:Ljava/lang/String; = "UNUSED_REWARDS_PAGE_FAIL_EVENT"

.field public static final UNUSED_REWARDS_PAGE_SUCCESS_EVENT:Ljava/lang/String; = "UNUSED_REWARDS_PAGE_SUCCESS_EVENT"

.field public static final UPDATED_REWARD:Ljava/lang/String; = "updated_reward"

.field public static final USED_REWARDS_PAGE_FAIL_EVENT:Ljava/lang/String; = "USED_REWARDS_PAGE_FAIL_EVENT"

.field public static final USED_REWARDS_PAGE_SUCCESS_EVENT:Ljava/lang/String; = "USED_REWARDS_PAGE_SUCCESS_EVENT"


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private context:Landroid/content/Context;

.field private descendingCreationDateComparator:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;",
            ">;"
        }
    .end annotation
.end field

.field private entityKeyToPollCount:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private getUnusedRewardsRequest:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;",
            ">;"
        }
    .end annotation
.end field

.field private getUsedRewardsRequest:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;",
            ">;"
        }
    .end annotation
.end field

.field private handler:Landroid/os/Handler;

.field private hasMoreUnusedRewardsPages:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private hasMoreUsedRewardsPages:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

.field private pendingUsedStatusUpdate:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;

.field private rewardsCountToDisplay:I

.field private shouldSyncOnRedemption:Z

.field private skLogger:Lcom/shopkick/app/application/SKLogger;

.field private unusedRewardsFromDisk:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;",
            ">;"
        }
    .end annotation
.end field

.field private unusedRewardsFromFetchByChain:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private unusedRewardsLoadedFromDataStore:Z

.field private unusedRewardsPageKey:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private unusedRewardsPendingReads:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private updateUsedStatusRequests:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequestV2;",
            ">;"
        }
    .end annotation
.end field

.field private usedRewardsFromFetchByChain:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private usedRewardsPageKey:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/SKLogger;Landroid/content/Context;)V
    .locals 1

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    new-instance v0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$1;-><init>(Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;)V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->descendingCreationDateComparator:Ljava/util/Comparator;

    .line 110
    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    .line 111
    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 112
    iput-object p3, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 113
    iput-object p4, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 114
    iput-object p5, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->skLogger:Lcom/shopkick/app/application/SKLogger;

    .line 115
    iput-object p6, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->context:Landroid/content/Context;

    .line 116
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    .line 117
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromFetchByChain:Ljava/util/HashMap;

    .line 118
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->usedRewardsFromFetchByChain:Ljava/util/HashMap;

    .line 119
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->updateUsedStatusRequests:Ljava/util/HashMap;

    .line 120
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUnusedRewardsRequest:Ljava/util/HashMap;

    .line 121
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUsedRewardsRequest:Ljava/util/HashMap;

    .line 122
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsPageKey:Ljava/util/HashMap;

    .line 123
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->usedRewardsPageKey:Ljava/util/HashMap;

    .line 124
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->hasMoreUnusedRewardsPages:Ljava/util/HashMap;

    .line 125
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->hasMoreUsedRewardsPages:Ljava/util/HashMap;

    const-string p1, "UserAccountIdChangedEvent"

    const/4 p2, 0x0

    .line 127
    invoke-virtual {p3, p0, p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    const-string p1, "REWARD_UPDATED_USED_STATUS"

    .line 128
    invoke-virtual {p3, p0, p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    const-string p1, "AppActivityManagerAppBackgroundedEvent"

    .line 129
    invoke-virtual {p3, p0, p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 131
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->entityKeyToPollCount:Ljava/util/HashMap;

    .line 132
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->handler:Landroid/os/Handler;

    const/4 p1, -0x1

    .line 133
    iput p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->rewardsCountToDisplay:I

    .line 134
    iput-boolean p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsLoadedFromDataStore:Z

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;Ljava/lang/String;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->makeGetFulfilledRewardRequest(Ljava/lang/String;)V

    return-void
.end method

.method private addRedeemedReward(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;)V
    .locals 2

    .line 447
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->removeStaleRedeemedReward(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;)V

    .line 449
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->used:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 450
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 451
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->sortRewardsArray(Ljava/util/ArrayList;)V

    .line 452
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->maybeIncrementRewardsCountToDisplay()V

    .line 453
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "REWARDS_COUNT_TO_DISPLAY_UPDATED_EVENT"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 456
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->addRewardToMapForAllSpendableChains(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;Z)V

    .line 458
    :goto_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->addRewardToOfflineDataStore(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;)V

    return-void
.end method

.method private addRewardToMapByChain(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;ZLjava/lang/String;)V
    .locals 3

    if-eqz p2, :cond_0

    .line 816
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->usedRewardsFromFetchByChain:Ljava/util/HashMap;

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromFetchByChain:Ljava/util/HashMap;

    .line 819
    :goto_0
    invoke-virtual {p2, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 820
    invoke-virtual {p2, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    goto :goto_1

    .line 822
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 823
    invoke-virtual {p2, p3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p2, v0

    :goto_1
    if-eqz p1, :cond_4

    .line 826
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 827
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redeemedRewardId:Ljava/lang/String;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redeemedRewardId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 828
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 832
    :cond_3
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 833
    invoke-direct {p0, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->sortRewardsArray(Ljava/util/ArrayList;)V

    :cond_4
    return-void
.end method

.method private addRewardToMapForAllSpendableChains(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;Z)V
    .locals 2

    .line 804
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 805
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->chainsSpendableAt:Ljava/util/List;

    if-eqz v1, :cond_0

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->chainsSpendableAt:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 806
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->chainsSpendableAt:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_0
    const-string v1, "ALL_CHAINS_REWARD_KEY"

    .line 808
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 810
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 811
    invoke-direct {p0, p1, p2, v1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->addRewardToMapByChain(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;ZLjava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private addRewardToOfflineDataStore(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;)V
    .locals 2

    .line 865
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;-><init>()V

    const/4 v1, 0x2

    .line 866
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->dataCategory:Ljava/lang/Integer;

    .line 867
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityKey:Ljava/lang/String;

    const-string/jumbo v1, "temp_entity_version"

    .line 868
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityVersion:Ljava/lang/String;

    .line 869
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->rewardInfo:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 870
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/offline/OfflineDataStore;->setEntity(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    return-void
.end method

.method private fetchUnusedRewardsFromOfflineDataStore()V
    .locals 4

    .line 199
    iget-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsLoadedFromDataStore:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsPendingReads:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 200
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 204
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    const/4 v1, 0x2

    .line 206
    invoke-virtual {v0, v1}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntityKeysForDataCategory(I)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 207
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 211
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsPendingReads:Ljava/util/ArrayList;

    .line 212
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 213
    iget-object v3, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-virtual {v3, v2, v1, p0}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntityForOfflineDataCategory(Ljava/lang/String;ILcom/shopkick/app/offline/IReadOfflineDataEntityFromDiskCallback;)V

    goto :goto_0

    :cond_2
    return-void

    .line 208
    :cond_3
    :goto_1
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notifyOfflineRewardsLoaded()V

    return-void

    :cond_4
    :goto_2
    return-void
.end method

.method private handleGetUnusedRewardsResponse(Lcom/shopkick/fetchers/DataResponse;Ljava/lang/String;)V
    .locals 5

    .line 618
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_a

    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-nez v0, :cond_0

    goto/16 :goto_7

    .line 623
    :cond_0
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsResponse;

    .line 624
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsPageKey:Ljava/util/HashMap;

    if-eqz p2, :cond_1

    move-object v1, p2

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_0
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsResponse;->pageKey:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 625
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsResponse;->redeemedRewardInfos:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 627
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    move-object v3, p2

    goto :goto_1

    .line 628
    :cond_2
    sget-object v3, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_1
    invoke-direct {p0, v1, v2, v3}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->addRewardToMapByChain(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;ZLjava/lang/String;)V

    goto :goto_4

    .line 630
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    if-eqz p2, :cond_4

    move-object v4, p2

    goto :goto_3

    .line 632
    :cond_4
    sget-object v4, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_3
    invoke-direct {p0, v3, v2, v4}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->addRewardToMapByChain(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;ZLjava/lang/String;)V

    goto :goto_2

    .line 636
    :cond_5
    :goto_4
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->hasMoreUnusedRewardsPages:Ljava/util/HashMap;

    if-eqz p2, :cond_6

    move-object v3, p2

    goto :goto_5

    :cond_6
    sget-object v3, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_5
    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsResponse;->pageKey:Ljava/lang/String;

    if-eqz v4, :cond_7

    const/4 v2, 0x1

    .line 637
    :cond_7
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 636
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 638
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsResponse;->numRewards:Ljava/lang/Integer;

    if-eqz v1, :cond_8

    if-nez p2, :cond_8

    .line 639
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsResponse;->numRewards:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->rewardsCountToDisplay:I

    .line 640
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "REWARDS_COUNT_TO_DISPLAY_UPDATED_EVENT"

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 643
    :cond_8
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "PAGED_REWARDS"

    .line 644
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "TOTAL_NUM_REWARDS"

    .line 645
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsResponse;->numRewards:Ljava/lang/Integer;

    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "CHAIN_ID_FOR_PAGED_REWARDS"

    if-eqz p2, :cond_9

    goto :goto_6

    .line 646
    :cond_9
    sget-object p2, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_6
    invoke-virtual {v1, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 647
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UNUSED_REWARDS_PAGE_SUCCESS_EVENT"

    invoke-virtual {p1, p2, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void

    .line 619
    :cond_a
    :goto_7
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->hasMoreUnusedRewardsPages:Ljava/util/HashMap;

    if-eqz p2, :cond_b

    goto :goto_8

    :cond_b
    sget-object p2, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_8
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 620
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UNUSED_REWARDS_PAGE_FAIL_EVENT"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

.method private handleGetUsedRewardsResponse(Lcom/shopkick/fetchers/DataResponse;Ljava/lang/String;)V
    .locals 5

    .line 651
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_9

    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-nez v0, :cond_0

    goto/16 :goto_8

    .line 656
    :cond_0
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsResponse;

    .line 657
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->usedRewardsPageKey:Ljava/util/HashMap;

    if-eqz p2, :cond_1

    move-object v1, p2

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_0
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsResponse;->pageKey:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 658
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsResponse;->redeemedRewardInfos:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 660
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    move-object v3, p2

    goto :goto_1

    .line 661
    :cond_2
    sget-object v3, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_1
    invoke-direct {p0, v1, v2, v3}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->addRewardToMapByChain(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;ZLjava/lang/String;)V

    goto :goto_4

    .line 663
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    if-eqz p2, :cond_4

    move-object v4, p2

    goto :goto_3

    .line 665
    :cond_4
    sget-object v4, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_3
    invoke-direct {p0, v3, v2, v4}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->addRewardToMapByChain(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;ZLjava/lang/String;)V

    goto :goto_2

    .line 669
    :cond_5
    :goto_4
    invoke-direct {p0, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->removeUsedRewardsFromUnusedArrayByChain(Ljava/lang/String;)V

    .line 670
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->hasMoreUsedRewardsPages:Ljava/util/HashMap;

    if-eqz p2, :cond_6

    move-object v3, p2

    goto :goto_5

    :cond_6
    sget-object v3, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_5
    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsResponse;->pageKey:Ljava/lang/String;

    if-eqz v4, :cond_7

    goto :goto_6

    :cond_7
    const/4 v2, 0x0

    .line 671
    :goto_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 670
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 673
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "PAGED_REWARDS"

    .line 674
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "TOTAL_NUM_REWARDS"

    .line 675
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsResponse;->numRewards:Ljava/lang/Integer;

    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "CHAIN_ID_FOR_PAGED_REWARDS"

    if-eqz p2, :cond_8

    goto :goto_7

    .line 676
    :cond_8
    sget-object p2, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_7
    invoke-virtual {v1, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 677
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "USED_REWARDS_PAGE_SUCCESS_EVENT"

    invoke-virtual {p1, p2, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void

    .line 652
    :cond_9
    :goto_8
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->hasMoreUsedRewardsPages:Ljava/util/HashMap;

    if-eqz p2, :cond_a

    goto :goto_9

    :cond_a
    sget-object p2, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_9
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 653
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "USED_REWARDS_PAGE_FAIL_EVENT"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

.method private handleRewardRedeemRequestV2(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 7

    .line 681
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_3

    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_3

    .line 682
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponseV2;

    .line 683
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponseV2;->errorMessage:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 684
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "REWARD_ERROR_MESSAGE"

    .line 685
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponseV2;->errorMessage:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 686
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EMAILED_REWARD_REDEMPTION_FAILURE_EVENT"

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void

    .line 689
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponseV2;->redeemedRewardInfos:Ljava/util/List;

    if-eqz v0, :cond_4

    .line 691
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    .line 692
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 693
    invoke-direct {p0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->addRedeemedReward(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;)V

    .line 694
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->status:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-nez v2, :cond_1

    .line 695
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->pollServerForRedeemedReward(Ljava/lang/String;)V

    goto :goto_0

    .line 698
    :cond_2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "reward_image_url"

    .line 699
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponseV2;->rewardImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v1, "share_url"

    .line 701
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponseV2;->shareUrl:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "reward_details_url"

    .line 702
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponseV2;->rewardDetailsUrl:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 704
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getEventLogger()Lcom/shopkick/logging/EventLogger;

    move-result-object v1

    sget-object p1, Lcom/shopkick/logging/Area;->REDEEM:Lcom/shopkick/logging/Area;

    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const/4 v4, 0x0

    const p1, 0x927c5

    .line 705
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    .line 704
    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/logging/EventLogger;->log(JLjava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V

    .line 706
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EMAILED_REWARD_REDEMPTION_SUCCESS_EVENT"

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    goto :goto_1

    .line 709
    :cond_3
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "REWARD_ERROR_MESSAGE"

    .line 710
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->context:Landroid/content/Context;

    const v2, 0x7f110142

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 711
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EMAILED_REWARD_REDEMPTION_FAILURE_EVENT"

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :cond_4
    :goto_1
    return-void
.end method

.method private makeGetFulfilledRewardRequest(Ljava/lang/String;)V
    .locals 1

    .line 517
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetFulfilledRewardRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetFulfilledRewardRequest;-><init>()V

    .line 518
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetFulfilledRewardRequest;->entityKey:Ljava/lang/String;

    .line 519
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method private maybeDecrementRewardsCountToDisplay()V
    .locals 2

    .line 195
    iget v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->rewardsCountToDisplay:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->rewardsCountToDisplay:I

    :cond_0
    return-void
.end method

.method private maybeIncrementRewardsCountToDisplay()V
    .locals 2

    .line 191
    iget v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->rewardsCountToDisplay:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->rewardsCountToDisplay:I

    :cond_0
    return-void
.end method

.method private maybePollServerForRedeemedReward(Ljava/lang/String;)V
    .locals 3

    .line 523
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->entityKeyToPollCount:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 524
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->entityKeyToPollCount:Ljava/util/HashMap;

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 525
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->rewardRedemptionMaxPolls:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 526
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->setupGetFulfilledRewardRunnable(Ljava/lang/String;)V

    goto :goto_0

    .line 528
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x4baf0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 529
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 531
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->entityKeyToPollCount:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method private notifyOfflineRewardsLoaded()V
    .locals 2

    const/4 v0, 0x1

    .line 906
    iput-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsLoadedFromDataStore:Z

    .line 907
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "UNUSED_REWARDS_FROM_OFFLINE_DATA_STORE_UPDATED"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 908
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "REWARDS_COUNT_TO_DISPLAY_UPDATED_EVENT"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 909
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->pendingUsedStatusUpdate:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;

    if-eqz v0, :cond_0

    .line 910
    invoke-static {v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;->access$100(Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->pendingUsedStatusUpdate:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;

    invoke-static {v1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;->access$200(Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;)Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->setRewardUpdateUsedStateRequest(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    .line 911
    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->pendingUsedStatusUpdate:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;

    :cond_0
    return-void
.end method

.method private pollServerForRedeemedReward(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 502
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->entityKeyToPollCount:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 503
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->entityKeyToPollCount:Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->setupGetFulfilledRewardRunnable(Ljava/lang/String;)V

    return-void
.end method

.method private removeRewardFromMapForAllSpendableChains(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;Z)Z
    .locals 8

    if-eqz p2, :cond_0

    .line 838
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->usedRewardsFromFetchByChain:Ljava/util/HashMap;

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromFetchByChain:Ljava/util/HashMap;

    .line 840
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 842
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->chainsSpendableAt:Ljava/util/List;

    if-eqz v2, :cond_1

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->chainsSpendableAt:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 843
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->chainsSpendableAt:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_1
    const-string v2, "ALL_CHAINS_REWARD_KEY"

    .line 845
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 847
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 848
    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    if-eqz v3, :cond_2

    .line 850
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 851
    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redeemedRewardId:Ljava/lang/String;

    iget-object v7, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redeemedRewardId:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 852
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const-string v3, "ALL_CHAINS_REWARD_KEY"

    .line 853
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_4
    return v1
.end method

.method private removeStaleRedeemedReward(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;)V
    .locals 8

    .line 463
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->used:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 464
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 465
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 466
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 467
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->maybeDecrementRewardsCountToDisplay()V

    .line 468
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "REWARDS_COUNT_TO_DISPLAY_UPDATED_EVENT"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 475
    :cond_1
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->used:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->usedRewardsFromFetchByChain:Ljava/util/HashMap;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromFetchByChain:Ljava/util/HashMap;

    .line 477
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 478
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->chainsSpendableAt:Ljava/util/List;

    if-eqz v2, :cond_3

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->chainsSpendableAt:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    .line 479
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->chainsSpendableAt:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_3
    const-string v2, "ALL_CHAINS_REWARD_KEY"

    .line 481
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 483
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 484
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    if-eqz v3, :cond_4

    .line 485
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_4

    .line 486
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 487
    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    iget-object v7, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 488
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 489
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->used:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "ALL_CHAINS_REWARD_KEY"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 490
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->maybeDecrementRewardsCountToDisplay()V

    .line 491
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v3, "REWARDS_COUNT_TO_DISPLAY_UPDATED_EVENT"

    invoke-virtual {v2, v3}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_1

    :cond_6
    return-void
.end method

.method private removeUsedRewardsFromUnusedArrayByChain(Ljava/lang/String;)V
    .locals 6

    .line 717
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->usedRewardsFromFetchByChain:Ljava/util/HashMap;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    if-nez p1, :cond_1

    return-void

    .line 725
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 728
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 729
    iget-object v4, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    iget-object v5, v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 730
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 731
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->maybeDecrementRewardsCountToDisplay()V

    .line 732
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "REWARDS_COUNT_TO_DISPLAY_UPDATED_EVENT"

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 734
    invoke-direct {p0, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->addRewardToOfflineDataStore(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;)V

    const/4 v1, 0x1

    goto :goto_2

    :cond_4
    move v1, v3

    :goto_2
    if-nez v1, :cond_2

    .line 741
    invoke-direct {p0, v0, v3}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->removeRewardFromMapForAllSpendableChains(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 742
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->maybeDecrementRewardsCountToDisplay()V

    .line 743
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "REWARDS_COUNT_TO_DISPLAY_UPDATED_EVENT"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_1

    :cond_5
    return-void
.end method

.method private setRewardUpdateUsedStateRequest(Ljava/lang/String;Z)V
    .locals 2

    .line 426
    iget-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsLoadedFromDataStore:Z

    if-nez v0, :cond_0

    .line 427
    new-instance v0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;-><init>(Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$1;)V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->pendingUsedStatusUpdate:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;

    .line 428
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->pendingUsedStatusUpdate:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;

    invoke-static {v0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;->access$102(Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;Ljava/lang/String;)Ljava/lang/String;

    .line 429
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->pendingUsedStatusUpdate:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;

    invoke-static {p1, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;->access$202(Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;Z)Z

    .line 430
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->fetchUnusedRewardsFromOfflineDataStore()V

    return-void

    .line 433
    :cond_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getRedeemedRewardInfo(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    move-result-object v0

    .line 434
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->updateUsedStatusRequests:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    if-eqz v0, :cond_2

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->used:Ljava/lang/Boolean;

    .line 435
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-ne v0, p2, :cond_1

    goto :goto_0

    .line 438
    :cond_1
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequestV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequestV2;-><init>()V

    .line 439
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequestV2;->rewardEntityKey:Ljava/lang/String;

    .line 440
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequestV2;->used:Ljava/lang/Boolean;

    .line 441
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->updateUsedStatusRequests:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method private setupGetFulfilledRewardRunnable(Ljava/lang/String;)V
    .locals 7

    .line 508
    new-instance v0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$GetFulfilledRewardRunnable;

    invoke-direct {v0, p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$GetFulfilledRewardRunnable;-><init>(Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;Ljava/lang/String;)V

    .line 509
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->rewardRedemptionPollingInterval:Ljava/lang/Integer;

    .line 510
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->rewardRedemptionPollingIntervalMultiplier:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 512
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-double v3, v1

    int-to-double v1, v2

    iget-object v5, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->entityKeyToPollCount:Ljava/util/HashMap;

    invoke-virtual {v5, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-double v5, p1

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    mul-double/2addr v3, v1

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    .line 513
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->handler:Landroid/os/Handler;

    invoke-virtual {p1}, Ljava/lang/Double;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private sortRewardsArray(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;",
            ">;)V"
        }
    .end annotation

    .line 874
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->descendingCreationDateComparator:Ljava/util/Comparator;

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method private updateRewardUsedStatus(Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequestV2;)V
    .locals 1

    .line 750
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequestV2;->rewardEntityKey:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getRedeemedRewardInfo(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    move-result-object v0

    .line 751
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequestV2;->used:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->updateRewardUsedStatusHelper(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;Z)V

    return-void
.end method

.method private updateRewardUsedStatus(Ljava/lang/String;Z)V
    .locals 3

    if-eqz p2, :cond_1

    .line 757
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 758
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redeemedRewardId:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 759
    invoke-direct {p0, v1, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->updateRewardUsedStatusHelper(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;Z)V

    return-void

    :cond_1
    if-eqz p2, :cond_2

    .line 765
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromFetchByChain:Ljava/util/HashMap;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->usedRewardsFromFetchByChain:Ljava/util/HashMap;

    :goto_0
    const-string v1, "ALL_CHAINS_REWARD_KEY"

    .line 767
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 768
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redeemedRewardId:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 769
    invoke-direct {p0, v1, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->updateRewardUsedStatusHelper(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;Z)V

    return-void

    :cond_4
    return-void
.end method

.method private updateRewardUsedStatusHelper(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;Z)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 777
    :cond_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->used:Ljava/lang/Boolean;

    const/4 v0, 0x1

    if-eqz p2, :cond_3

    .line 780
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 781
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redeemedRewardId:Ljava/lang/String;

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redeemedRewardId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 782
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_2
    const/4 p2, 0x0

    .line 786
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->removeRewardFromMapForAllSpendableChains(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;Z)Z

    .line 787
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->addRewardToMapForAllSpendableChains(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;Z)V

    .line 788
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->maybeDecrementRewardsCountToDisplay()V

    goto :goto_0

    .line 791
    :cond_3
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->removeRewardFromMapForAllSpendableChains(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;Z)Z

    .line 792
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 793
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-direct {p0, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->sortRewardsArray(Ljava/util/ArrayList;)V

    .line 794
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->maybeIncrementRewardsCountToDisplay()V

    .line 796
    :goto_0
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v0, "updated_reward"

    .line 797
    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 798
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "REWARD_USED_STATUS_UPDATE_SUCCESS_EVENT"

    invoke-virtual {v0, v1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 799
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "REWARDS_COUNT_TO_DISPLAY_UPDATED_EVENT"

    invoke-virtual {p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 800
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->addRewardToOfflineDataStore(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;)V

    return-void
.end method

.method private updateUnusedRewardsRequests(Ljava/lang/String;)V
    .locals 1

    .line 899
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsPendingReads:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 900
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsPendingReads:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_0

    .line 901
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notifyOfflineRewardsLoaded()V

    :cond_0
    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 7

    .line 542
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUnusedRewardsRequest:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 543
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;->chainId:Ljava/lang/String;

    .line 544
    invoke-direct {p0, p2, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->handleGetUnusedRewardsResponse(Lcom/shopkick/fetchers/DataResponse;Ljava/lang/String;)V

    .line 545
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUnusedRewardsRequest:Ljava/util/HashMap;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_0
    invoke-virtual {p2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_6

    .line 546
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUsedRewardsRequest:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 547
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;->chainId:Ljava/lang/String;

    .line 548
    invoke-direct {p0, p2, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->handleGetUsedRewardsResponse(Lcom/shopkick/fetchers/DataResponse;Ljava/lang/String;)V

    .line 549
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUsedRewardsRequest:Ljava/util/HashMap;

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    sget-object p1, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_1
    invoke-virtual {p2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_6

    .line 550
    :cond_3
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequestV2;

    if-eqz v0, :cond_5

    .line 551
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequestV2;

    .line 552
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequestV2;->rewardEntityKey:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getRedeemedRewardInfo(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    move-result-object v0

    .line 553
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v2, "updated_reward"

    .line 554
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 555
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_4

    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p2, :cond_4

    .line 556
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->updateRewardUsedStatus(Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequestV2;)V

    goto :goto_2

    .line 558
    :cond_4
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "REWARD_USED_STATUS_UPDATE_FAIL_EVENT"

    invoke-virtual {p2, v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 560
    :goto_2
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->updateUsedStatusRequests:Ljava/util/HashMap;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardUpdateUsedStatusRequestV2;->rewardEntityKey:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_6

    .line 561
    :cond_5
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequest;

    if-eqz v0, :cond_a

    .line 562
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "REWARD_ID"

    .line 563
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequest;->rewardId:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 564
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_9

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-nez p1, :cond_6

    goto :goto_4

    .line 569
    :cond_6
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponse;

    const-string p2, "REWARD_REDEMPTION_WEBVIEW_URL"

    .line 570
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponse;->resultWebviewData:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->url:Ljava/lang/String;

    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getEventLogger()Lcom/shopkick/logging/EventLogger;

    move-result-object v1

    sget-object p2, Lcom/shopkick/logging/Area;->REDEEM:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const/4 v4, 0x0

    const p2, 0x927c4

    .line 572
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    .line 571
    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/logging/EventLogger;->log(JLjava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V

    .line 573
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "REWARD_REDEMPTION_SUCCESS_EVENT"

    invoke-virtual {p2, v1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 574
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponse;->redeemedRewardInfos:Ljava/util/List;

    if-eqz p2, :cond_f

    .line 575
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponse;->redeemedRewardInfos:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-eqz p2, :cond_8

    .line 576
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponse;->redeemedRewardInfos:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 577
    invoke-direct {p0, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->addRedeemedReward(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;)V

    .line 578
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->status:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_7

    .line 579
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->pollServerForRedeemedReward(Ljava/lang/String;)V

    goto :goto_3

    .line 582
    :cond_8
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponse;->resultWebviewData:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->url:Ljava/lang/String;

    if-eqz p2, :cond_f

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponse;->resultWebviewData:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->url:Ljava/lang/String;

    .line 583
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_f

    const/4 p1, 0x1

    .line 585
    iput-boolean p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->shouldSyncOnRedemption:Z

    goto :goto_6

    :cond_9
    :goto_4
    const-string p1, "REWARD_REDEMPTION_RESPONSE"

    .line 565
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "REWARD_REDEMPTION_FAILURE_EVENT"

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void

    .line 588
    :cond_a
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetFulfilledRewardRequest;

    if-eqz v0, :cond_e

    .line 589
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetFulfilledRewardRequest;

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetFulfilledRewardRequest;->entityKey:Ljava/lang/String;

    .line 590
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "REWARD_ENTITY_KEY"

    .line 591
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetFulfilledRewardRequest;->entityKey:Ljava/lang/String;

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 592
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_d

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-nez p1, :cond_b

    goto :goto_5

    .line 599
    :cond_b
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetFulfilledRewardResponse;

    .line 600
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetFulfilledRewardResponse;->fulfilledReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    if-eqz p2, :cond_c

    .line 602
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetFulfilledRewardResponse;->fulfilledReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    invoke-direct {p0, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->addRedeemedReward(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;)V

    .line 603
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "REWARD_FETCH_SUCCEEDED_EVENT"

    invoke-virtual {p2, v2, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 604
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetFulfilledRewardResponse;->fulfilledReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->status:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eqz p1, :cond_c

    .line 606
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->entityKeyToPollCount:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 611
    :cond_c
    invoke-direct {p0, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->maybePollServerForRedeemedReward(Ljava/lang/String;)V

    goto :goto_6

    .line 595
    :cond_d
    :goto_5
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "REWARD_FETCH_FAILED_EVENT"

    invoke-virtual {p1, p2, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 596
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->entityKeyToPollCount:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 612
    :cond_e
    instance-of p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequestV2;

    if-eqz p1, :cond_f

    .line 613
    invoke-direct {p0, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->handleRewardRedeemRequestV2(Lcom/shopkick/fetchers/DataResponse;)V

    :cond_f
    :goto_6
    return-void
.end method

.method public fetchNextUnusedRewardsPage(Ljava/lang/String;)V
    .locals 5

    .line 218
    iget-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsLoadedFromDataStore:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUnusedRewardsRequest:Ljava/util/HashMap;

    if-eqz p1, :cond_0

    move-object v1, p1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    .line 219
    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    goto/16 :goto_6

    .line 223
    :cond_1
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;-><init>()V

    const/4 v1, 0x0

    .line 226
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;->used:Ljava/lang/Boolean;

    .line 227
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->homeScreenFeedTilesPageSize:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;->pageSize:Ljava/lang/Integer;

    .line 228
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsPageKey:Ljava/util/HashMap;

    if-eqz p1, :cond_2

    move-object v2, p1

    goto :goto_1

    :cond_2
    sget-object v2, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_1
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_7

    .line 231
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 232
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 233
    iget-object v3, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    if-eqz v3, :cond_3

    .line 234
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 236
    :cond_3
    iget-object v3, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromFetchByChain:Ljava/util/HashMap;

    if-eqz p1, :cond_4

    move-object v4, p1

    goto :goto_2

    :cond_4
    sget-object v4, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_2
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    if-eqz v3, :cond_5

    .line 239
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 241
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_6

    .line 242
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 243
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 246
    :cond_6
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;->clientEntityKeys:Ljava/util/List;

    goto :goto_4

    .line 248
    :cond_7
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;->previousPageKey:Ljava/lang/String;

    .line 250
    :goto_4
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;->chainId:Ljava/lang/String;

    .line 251
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUnusedRewardsRequest:Ljava/util/HashMap;

    if-eqz p1, :cond_8

    goto :goto_5

    :cond_8
    sget-object p1, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_5
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void

    :cond_9
    :goto_6
    return-void
.end method

.method public fetchNextUsedRewardsPage(Ljava/lang/String;)V
    .locals 5

    .line 260
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUsedRewardsRequest:Ljava/util/HashMap;

    if-eqz p1, :cond_0

    move-object v1, p1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    return-void

    .line 262
    :cond_1
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;-><init>()V

    const/4 v1, 0x1

    .line 264
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;->used:Ljava/lang/Boolean;

    .line 265
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->homeScreenFeedTilesPageSize:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;->pageSize:Ljava/lang/Integer;

    .line 266
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->usedRewardsPageKey:Ljava/util/HashMap;

    if-eqz p1, :cond_2

    move-object v2, p1

    goto :goto_1

    :cond_2
    sget-object v2, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_1
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_6

    .line 268
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 269
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 270
    iget-object v3, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->usedRewardsFromFetchByChain:Ljava/util/HashMap;

    if-eqz p1, :cond_3

    move-object v4, p1

    goto :goto_2

    :cond_3
    sget-object v4, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_2
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    if-eqz v3, :cond_4

    .line 273
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 275
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    .line 276
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 277
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 280
    :cond_5
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;->clientEntityKeys:Ljava/util/List;

    goto :goto_4

    .line 282
    :cond_6
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;->previousPageKey:Ljava/lang/String;

    .line 284
    :goto_4
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;->chainId:Ljava/lang/String;

    .line 285
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUsedRewardsRequest:Ljava/util/HashMap;

    if-eqz p1, :cond_7

    goto :goto_5

    :cond_7
    sget-object p1, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_5
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method public fetchReward(Ljava/lang/String;)V
    .locals 2

    .line 294
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->entityKeyToPollCount:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 295
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->entityKeyToPollCount:Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetFulfilledRewardRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetFulfilledRewardRequest;-><init>()V

    .line 297
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetFulfilledRewardRequest;->entityKey:Ljava/lang/String;

    const/4 p1, 0x1

    .line 298
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetFulfilledRewardRequest;->allowUnfulfilledReward:Ljava/lang/Boolean;

    .line 299
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method public getRedeemedRewardInfo(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;
    .locals 4

    .line 303
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 304
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 305
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .line 310
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromFetchByChain:Ljava/util/HashMap;

    if-eqz v0, :cond_4

    .line 311
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 312
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 313
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    return-object v2

    .line 319
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->usedRewardsFromFetchByChain:Ljava/util/HashMap;

    if-eqz v0, :cond_7

    .line 320
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 321
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 322
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    return-object v2

    :cond_7
    const/4 p1, 0x0

    return-object p1
.end method

.method public getRewardsCountToDisplay()Ljava/lang/String;
    .locals 3

    .line 169
    iget v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->rewardsCountToDisplay:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 172
    iget-boolean v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsLoadedFromDataStore:Z

    if-nez v1, :cond_0

    .line 173
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->fetchUnusedRewardsFromOfflineDataStore()V

    .line 175
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    const/4 v2, 0x2

    .line 176
    invoke-virtual {v1, v2}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntityKeysForDataCategory(I)Ljava/util/ArrayList;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    .line 177
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 178
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxOfflineUnusedRewards:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lt v1, v2, :cond_2

    .line 181
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->context:Landroid/content/Context;

    const v2, 0x7f11057b

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    return-object v0

    .line 186
    :cond_3
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUnusedRewards(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;",
            ">;"
        }
    .end annotation

    .line 332
    iget-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsLoadedFromDataStore:Z

    if-nez v0, :cond_0

    .line 334
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->fetchUnusedRewardsFromOfflineDataStore()V

    .line 338
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_1

    .line 340
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 342
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 343
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->chainsSpendableAt:Ljava/util/List;

    if-eqz v3, :cond_2

    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->chainsSpendableAt:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 345
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 350
    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromFetchByChain:Ljava/util/HashMap;

    if-eqz p1, :cond_4

    move-object v2, p1

    goto :goto_2

    :cond_4
    sget-object v2, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_2
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 351
    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->fetchNextUnusedRewardsPage(Ljava/lang/String;)V

    .line 352
    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->fetchNextUsedRewardsPage(Ljava/lang/String;)V

    goto :goto_4

    .line 354
    :cond_5
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromFetchByChain:Ljava/util/HashMap;

    if-eqz p1, :cond_6

    move-object v2, p1

    goto :goto_3

    :cond_6
    sget-object v2, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_3
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-eqz v1, :cond_7

    .line 356
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    .line 357
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 359
    :cond_7
    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->fetchNextUnusedRewardsPage(Ljava/lang/String;)V

    .line 360
    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->fetchNextUsedRewardsPage(Ljava/lang/String;)V

    :goto_4
    return-object v0
.end method

.method public getUsedRewards(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;",
            ">;"
        }
    .end annotation

    .line 366
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->usedRewardsFromFetchByChain:Ljava/util/HashMap;

    if-eqz p1, :cond_0

    move-object v1, p1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 369
    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->fetchNextUsedRewardsPage(Ljava/lang/String;)V

    .line 371
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 373
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->usedRewardsFromFetchByChain:Ljava/util/HashMap;

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    sget-object p1, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_1
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    return-object p1
.end method

.method public hasMoreUnusedRewardsPages(Ljava/lang/String;)Z
    .locals 2

    .line 256
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->hasMoreUnusedRewardsPages:Ljava/util/HashMap;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_0
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hasMoreUsedRewardsPages(Ljava/lang/String;)Z
    .locals 2

    .line 290
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->hasMoreUsedRewardsPages:Ljava/util/HashMap;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->ALL_CHAINS_REWARD_KEY:Ljava/lang/String;

    :goto_0
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public markRewardAsUnused(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 415
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->setRewardUpdateUsedStateRequest(Ljava/lang/String;Z)V

    return-void
.end method

.method public markRewardAsUsed(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 411
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->setRewardUpdateUsedStateRequest(Ljava/lang/String;Z)V

    return-void
.end method

.method public maybeSyncOnRedemption()V
    .locals 1

    .line 419
    iget-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->shouldSyncOnRedemption:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    .line 420
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->syncUnusedRewards(Ljava/lang/Integer;)V

    :cond_0
    const/4 v0, 0x0

    .line 422
    iput-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->shouldSyncOnRedemption:Z

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 4
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

    .line 929
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x55930ad7

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-eq v0, v1, :cond_2

    const v1, 0x44e6563

    if-eq v0, v1, :cond_1

    const v1, 0x7ae9bc00

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "REWARD_UPDATED_USED_STATUS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const-string v0, "UserAccountIdChangedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move p1, v2

    goto :goto_1

    :cond_2
    const-string v0, "AppActivityManagerAppBackgroundedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_1

    :cond_3
    :goto_0
    move p1, v3

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 940
    :pswitch_0
    iput v3, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->rewardsCountToDisplay:I

    .line 941
    iput-boolean v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsLoadedFromDataStore:Z

    .line 942
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    goto :goto_2

    :pswitch_1
    const-string p1, "reward_id"

    .line 935
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string/jumbo v0, "used"

    .line 936
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    .line 937
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->updateRewardUsedStatus(Ljava/lang/String;Z)V

    goto :goto_2

    .line 931
    :pswitch_2
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->reset()V

    const/4 p1, 0x4

    .line 932
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->syncUnusedRewards(Ljava/lang/Integer;)V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onOfflineDataEntityReadFailed(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 895
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->updateUnusedRewardsRequests(Ljava/lang/String;)V

    return-void
.end method

.method public onOfflineDataEntityReadFromDisk(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V
    .locals 2

    if-eqz p1, :cond_2

    .line 882
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->rewardInfo:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->used:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 883
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->rewardInfo:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 884
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->sortRewardsArray(Ljava/util/ArrayList;)V

    .line 886
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->rewardInfo:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->status:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_1

    .line 887
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->rewardInfo:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->fetchReward(Ljava/lang/String;)V

    .line 889
    :cond_1
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityKey:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->updateUnusedRewardsRequests(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public onSyncFailed(I)V
    .locals 0

    return-void
.end method

.method public onSyncFinished(IZ)V
    .locals 0

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    .line 918
    iput-boolean p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsLoadedFromDataStore:Z

    .line 919
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->fetchUnusedRewardsFromOfflineDataStore()V

    :cond_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public redeemEmailedReward(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 400
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequestV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequestV2;-><init>()V

    .line 401
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequestV2;->rewardId:Ljava/lang/String;

    .line 402
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequestV2;->denominationId:Ljava/lang/String;

    const/4 p1, 0x1

    .line 404
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequestV2;->quantity:Ljava/lang/Integer;

    .line 405
    iput-object p3, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequestV2;->userEmail:Ljava/lang/String;

    .line 407
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method public redeemReward(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 385
    invoke-virtual {p0, p1, p2, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->redeemReward(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public redeemReward(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 390
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequest;-><init>()V

    .line 391
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequest;->rewardId:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 392
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequest;->denominationId:Ljava/lang/String;

    .line 393
    :cond_0
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequest;->quantity:Ljava/lang/Integer;

    .line 395
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method public reset()V
    .locals 5

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUnusedRewardsRequest:Ljava/util/HashMap;

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

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;

    .line 139
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v2, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    goto :goto_0

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUsedRewardsRequest:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetRewardsRequest;

    .line 142
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v2, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    goto :goto_1

    .line 144
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUnusedRewardsRequest:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUsedRewardsRequest:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    .line 146
    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsPendingReads:Ljava/util/ArrayList;

    .line 147
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->usedRewardsFromFetchByChain:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 148
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromFetchByChain:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 149
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsFromDisk:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 150
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->updateUsedStatusRequests:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 151
    iget-object v3, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v4, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->updateUsedStatusRequests:Ljava/util/HashMap;

    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/IAPIObject;

    invoke-virtual {v3, v2, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    goto :goto_2

    .line 153
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->updateUsedStatusRequests:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 154
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/offline/OfflineDataStore;->clearCategory(I)V

    .line 155
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->entityKeyToPollCount:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 156
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 157
    iput-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->shouldSyncOnRedemption:Z

    const/4 v1, -0x1

    .line 158
    iput v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->rewardsCountToDisplay:I

    .line 159
    iput-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->unusedRewardsLoadedFromDataStore:Z

    return-void
.end method

.method public syncUnusedRewards(Ljava/lang/Integer;)V
    .locals 2

    .line 163
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x2

    .line 164
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-virtual {v1, v0, p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->syncOfflineDataCategories(Ljava/util/List;Lcom/shopkick/app/offline/IOfflineDataCategorySyncCallback;Ljava/lang/Integer;)V

    return-void
.end method
