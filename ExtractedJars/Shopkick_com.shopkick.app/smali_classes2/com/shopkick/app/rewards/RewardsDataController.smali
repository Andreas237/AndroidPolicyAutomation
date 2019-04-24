.class public Lcom/shopkick/app/rewards/RewardsDataController;
.super Ljava/lang/Object;
.source "RewardsDataController.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;
    }
.end annotation


# static fields
.field public static final COMMUNITY_REWARD_INFO_AVAILABLE:Ljava/lang/String; = "community_reward_info_available"

.field public static final DEFAULT_REWARD_COST_IN_KICKS:Ljava/lang/Long;

.field private static final KICKS_PER_US_DOLLAR:I = 0xfa
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PRICE_PATTERN:Ljava/lang/String; = "^\\$\\d+(,\\d{3})*(\\.\\d{1,2})?$"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final REWARDS_DATA_RESPONSE_ARG:Ljava/lang/String; = "rewards_data_response_arg"

.field public static final REWARDS_MALL_UPDATE_DELAY_MS:I = 0xdbba0

.field public static final REWARDS_RELOAD_COMPLETED:Ljava/lang/String; = "rewards_reload_completed"

.field public static final REWARDS_RELOAD_FAILED:Ljava/lang/String; = "rewards_reload_failed"


# instance fields
.field private almostThereIndex:I

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private communityRewardInfoMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/CommunityRewardInfo;",
            ">;"
        }
    .end annotation
.end field

.field private communityRewardRequest:Lcom/shopkick/app/fetchers/api/skapi/CommunityRewardInfoRequest;

.field private denominationRewardIdsMapping:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private denominationSet:Ljava/util/TreeSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private featuredRewardIds:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private fetchedReward:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;",
            ">;"
        }
    .end annotation
.end field

.field private firstUseRewardIds:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private glideRequests:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bumptech/glide/request/FutureTarget<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field

.field private groupRewardIdsMapping:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private keepEarningIndex:I

.field private loadRewardsMallItemsTask:Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;

.field private nonFeaturedRewardIds:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private nonFeaturedRewardsCount:I

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private profilePoints:Lcom/shopkick/app/points/ProfilePoints;

.field private rewardListMallV2Request:Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Request;

.field private rewardsInfo:Lcom/shopkick/app/rewards/RewardsInfo;

.field private screenDensity:D

.field private selectableRewardIds:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0x4e2

    .line 52
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/rewards/RewardsDataController;->DEFAULT_REWARD_COST_IN_KICKS:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/points/ProfilePoints;Landroid/content/Context;D)V
    .locals 1

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->rewardListMallV2Request:Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Request;

    .line 108
    iput-object p6, p0, Lcom/shopkick/app/rewards/RewardsDataController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 109
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 110
    iput-object p4, p0, Lcom/shopkick/app/rewards/RewardsDataController;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 111
    iput-object p5, p0, Lcom/shopkick/app/rewards/RewardsDataController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 112
    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardsDataController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 113
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->fetchedReward:Ljava/util/HashMap;

    .line 114
    iput-object p3, p0, Lcom/shopkick/app/rewards/RewardsDataController;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 116
    new-instance p1, Lcom/shopkick/app/rewards/RewardsInfo;

    invoke-direct {p1, p7}, Lcom/shopkick/app/rewards/RewardsInfo;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->rewardsInfo:Lcom/shopkick/app/rewards/RewardsInfo;

    .line 117
    iput-wide p8, p0, Lcom/shopkick/app/rewards/RewardsDataController;->screenDensity:D

    .line 119
    new-instance p1, Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;

    invoke-direct {p1, p0}, Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;-><init>(Lcom/shopkick/app/rewards/RewardsDataController;)V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->loadRewardsMallItemsTask:Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;

    .line 120
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->loadRewardsMallItemsTask:Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;

    const/4 p3, 0x0

    new-array p3, p3, [Ljava/lang/Object;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    const-string p1, "UserAccountIdChangedEvent"

    .line 122
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "ProfilePointsChangedEvent"

    .line 123
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/rewards/RewardsDataController;)Ljava/util/List;
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardsDataController;->getRewardItemOrder()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/rewards/RewardsDataController;Ljava/util/List;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RewardsDataController;->createRewardGrouping(Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$202(Lcom/shopkick/app/rewards/RewardsDataController;Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;)Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->loadRewardsMallItemsTask:Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;

    return-object p1
.end method

.method private clear()V
    .locals 3

    .line 228
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsDataController;->cancel()V

    const/4 v0, 0x0

    .line 229
    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->firstUseRewardIds:Ljava/util/ArrayList;

    .line 230
    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->selectableRewardIds:Ljava/util/LinkedHashSet;

    .line 231
    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->featuredRewardIds:Ljava/util/ArrayList;

    .line 232
    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->nonFeaturedRewardIds:Ljava/util/ArrayList;

    .line 233
    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->groupRewardIdsMapping:Ljava/util/HashMap;

    .line 234
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/AppPreferences;->setLastRewardUpdatedTimestamp(J)V

    return-void
.end method

.method private createRewardGrouping(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 375
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->loadRewardsMallItemsTask:Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 376
    invoke-virtual {v0, v1}, Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;->cancel(Z)Z

    const/4 v0, 0x0

    .line 377
    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->loadRewardsMallItemsTask:Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;

    .line 379
    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->selectableRewardIds:Ljava/util/LinkedHashSet;

    .line 380
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->firstUseRewardIds:Ljava/util/ArrayList;

    .line 381
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->featuredRewardIds:Ljava/util/ArrayList;

    .line 382
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->groupRewardIdsMapping:Ljava/util/HashMap;

    .line 383
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->denominationSet:Ljava/util/TreeSet;

    .line 384
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->denominationRewardIdsMapping:Ljava/util/HashMap;

    .line 385
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 386
    invoke-virtual {p0, v0}, Lcom/shopkick/app/rewards/RewardsDataController;->getReward(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 388
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->isShownInFirstUse:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-direct {p0, v1}, Lcom/shopkick/app/rewards/RewardsDataController;->isSelectable(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 389
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsDataController;->firstUseRewardIds:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 391
    :cond_2
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->elementType:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_3

    .line 393
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->featuredRewardIds:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 394
    :cond_3
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->elementType:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x7

    if-eq v2, v3, :cond_6

    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->elementType:Ljava/lang/Integer;

    .line 395
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x3

    if-eq v2, v3, :cond_6

    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->elementType:Ljava/lang/Integer;

    .line 396
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_4

    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->groupDetails:Lcom/shopkick/app/fetchers/api/skapi/GroupDetails;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GroupDetails;->isThumbnailElement:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    .line 412
    :cond_4
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->elementType:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v3, :cond_1

    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->groupDetails:Lcom/shopkick/app/fetchers/api/skapi/GroupDetails;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/GroupDetails;->isThumbnailElement:Ljava/lang/Boolean;

    .line 413
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_1

    .line 415
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->groupDetails:Lcom/shopkick/app/fetchers/api/skapi/GroupDetails;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GroupDetails;->groupType:Ljava/lang/String;

    .line 416
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsDataController;->groupRewardIdsMapping:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 417
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsDataController;->groupRewardIdsMapping:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    goto :goto_1

    .line 419
    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 421
    :goto_1
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 422
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->groupRewardIdsMapping:Ljava/util/HashMap;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 397
    :cond_6
    :goto_2
    invoke-direct {p0, v1}, Lcom/shopkick/app/rewards/RewardsDataController;->isSelectable(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 398
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsDataController;->selectableRewardIds:Ljava/util/LinkedHashSet;

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    .line 402
    :cond_7
    invoke-static {v1}, Lcom/shopkick/app/rewards/RewardsDataController;->getRewardCostInKicks(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 403
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsDataController;->denominationRewardIdsMapping:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 404
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsDataController;->denominationRewardIdsMapping:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    goto :goto_3

    .line 406
    :cond_8
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 407
    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardsDataController;->denominationSet:Ljava/util/TreeSet;

    invoke-virtual {v3, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 409
    :goto_3
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->denominationRewardIdsMapping:Ljava/util/HashMap;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 427
    :cond_9
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsDataController;->sortNonFeaturedRewardIds()V

    return-void
.end method

.method public static getNumKicksAwayFromReward(ILcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)I
    .locals 0

    .line 581
    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardsDataController;->getRewardCostInKicks(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)I

    move-result p1

    sub-int/2addr p1, p0

    return p1
.end method

.method public static getRewardCostInKicks(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)I
    .locals 6

    const v0, 0x7fffffff

    if-nez p0, :cond_0

    return v0

    .line 567
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    move v1, v2

    .line 568
    :goto_0
    iget-object v4, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-le v4, v3, :cond_2

    move v4, v3

    goto :goto_1

    :cond_2
    move v4, v2

    :goto_1
    const/4 v5, 0x0

    if-eqz v1, :cond_3

    .line 569
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    goto :goto_2

    :cond_3
    move-object v1, v5

    :goto_2
    if-eqz v4, :cond_4

    .line 570
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    :cond_4
    if-eqz v5, :cond_5

    .line 571
    iget-object p0, v5, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    if-eqz p0, :cond_5

    .line 572
    iget-object p0, v5, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_5
    if-eqz v1, :cond_6

    .line 574
    iget-object p0, v1, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    if-eqz p0, :cond_6

    .line 575
    iget-object p0, v1, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_6
    return v0
.end method

.method private getRewardHash(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 292
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_1

    .line 294
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 296
    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RewardsDataController;->getReward(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 297
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->rewardElementHash:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 298
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->rewardElementHash:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private getRewardItemOrder()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 285
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->rewardsInfo:Lcom/shopkick/app/rewards/RewardsInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardsInfo;->getRewardsMallItemIds()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private isSelectable(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 359
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    if-eqz v1, :cond_3

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->elementType:Ljava/lang/Integer;

    .line 360
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const v1, 0x7fffffff

    .line 364
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    .line 365
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    .line 367
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->rewardsPickerMinimumDenominationValue:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-le v1, p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0

    :cond_3
    :goto_1
    return v0
.end method

.method public static kicksToCurrency(I)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 620
    div-int/lit16 p0, p0, 0xfa

    return p0
.end method

.method private loadRewardsMallId(Ljava/util/List;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 311
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardsDataController;->getRewardItemOrder()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 316
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RewardsDataController;->createRewardGrouping(Ljava/util/List;)V

    .line 319
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardsDataController;->prefetchImageHack()V

    const/4 p1, 0x1

    return p1
.end method

.method private prefetchImageHack()V
    .locals 6

    .line 347
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->glideRequests:Ljava/util/List;

    .line 348
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->featuredRewardIds:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 349
    iget-object v4, p0, Lcom/shopkick/app/rewards/RewardsDataController;->glideRequests:Ljava/util/List;

    invoke-static {}, Lcom/shopkick/app/application/SKApp;->getInstance()Lcom/shopkick/app/application/SKApp;

    move-result-object v5

    invoke-virtual {v5}, Lcom/shopkick/app/application/SKApp;->getBaseContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v5

    invoke-virtual {v5}, Lcom/shopkick/app/util/GlideRequests;->asBitmap()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v5

    invoke-virtual {p0, v3}, Lcom/shopkick/app/rewards/RewardsDataController;->getReward(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v3

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailImageUrls:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v5, v3}, Lcom/shopkick/app/util/GlideRequest;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/app/util/GlideRequest;->submit()Lcom/bumptech/glide/request/FutureTarget;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    const/4 v3, 0x4

    if-lt v2, v3, :cond_0

    return-void

    :cond_1
    return-void
.end method

.method private processRewardsMallData(Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Response;)V
    .locals 4

    .line 328
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Response;->rewardItemElements:Ljava/util/List;

    .line 329
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Response;->rewardMallItemIdOrder:Ljava/util/List;

    .line 331
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    .line 332
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsDataController;->rewardsInfo:Lcom/shopkick/app/rewards/RewardsInfo;

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->rewardMallItemId:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Lcom/shopkick/app/rewards/RewardsInfo;->putRewardItem(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V

    goto :goto_0

    .line 336
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->rewardsInfo:Lcom/shopkick/app/rewards/RewardsInfo;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/rewards/RewardsInfo;->putRewardsMallItemIds(Ljava/util/List;)V

    return-void
.end method

.method private shouldCombineRewardsWithNextDenomination(Ljava/util/ArrayList;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 491
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 492
    invoke-virtual {p0, v0}, Lcom/shopkick/app/rewards/RewardsDataController;->getReward(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v0

    .line 493
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->disableNewThumbnailSubgroupCreation:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public cancel()V
    .locals 4

    .line 520
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->glideRequests:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 522
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bumptech/glide/request/FutureTarget;

    .line 523
    invoke-static {}, Lcom/shopkick/app/application/SKApp;->getInstance()Lcom/shopkick/app/application/SKApp;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/app/application/SKApp;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/shopkick/app/util/GlideRequests;->clear(Lcom/bumptech/glide/request/target/Target;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 529
    :catch_0
    :cond_0
    iput-object v1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->glideRequests:Ljava/util/List;

    .line 532
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->rewardListMallV2Request:Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Request;

    if-eqz v0, :cond_2

    .line 533
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsDataController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v2, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 534
    iput-object v1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->rewardListMallV2Request:Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Request;

    .line 536
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->communityRewardRequest:Lcom/shopkick/app/fetchers/api/skapi/CommunityRewardInfoRequest;

    if-eqz v0, :cond_3

    .line 537
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsDataController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v2, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 538
    iput-object v1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->communityRewardRequest:Lcom/shopkick/app/fetchers/api/skapi/CommunityRewardInfoRequest;

    :cond_3
    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 4

    .line 250
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->rewardListMallV2Request:Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Request;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    .line 252
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_0

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_0

    .line 253
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Response;

    .line 254
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RewardsDataController;->processRewardsMallData(Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Response;)V

    .line 255
    iget-object p2, p0, Lcom/shopkick/app/rewards/RewardsDataController;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, Lcom/shopkick/app/application/AppPreferences;->setLastRewardUpdatedTimestamp(J)V

    .line 256
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Response;->rewardMallItemIdOrder:Ljava/util/List;

    goto :goto_0

    .line 258
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "rewards_data_response_arg"

    .line 259
    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    iget-object p2, p0, Lcom/shopkick/app/rewards/RewardsDataController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "rewards_reload_failed"

    invoke-virtual {p2, v0, p1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    move-object p1, v1

    .line 262
    :goto_0
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardsDataController;->fetchedReward:Ljava/util/HashMap;

    .line 263
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RewardsDataController;->loadRewardsMallId(Ljava/util/List;)Z

    move-result p1

    .line 264
    iput-object v1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->rewardListMallV2Request:Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Request;

    if-eqz p1, :cond_4

    .line 266
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "rewards_reload_completed"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_2

    .line 268
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->communityRewardRequest:Lcom/shopkick/app/fetchers/api/skapi/CommunityRewardInfoRequest;

    if-ne p1, v0, :cond_4

    .line 269
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_3

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_3

    .line 270
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->communityRewardInfoMap:Ljava/util/HashMap;

    .line 271
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/CommunityRewardInfoResponse;

    .line 272
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommunityRewardInfoResponse;->communityRewardInfos:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/CommunityRewardInfo;

    .line 273
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->communityRewardInfoMap:Ljava/util/HashMap;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/CommunityRewardInfo;->rewardMallItemId:Ljava/lang/String;

    invoke-virtual {v0, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 275
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "community_reward_info_available"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 277
    :cond_3
    iput-object v1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->communityRewardRequest:Lcom/shopkick/app/fetchers/api/skapi/CommunityRewardInfoRequest;

    :cond_4
    :goto_2
    return-void
.end method

.method public fetchCommunityReward()V
    .locals 9

    .line 506
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->communityRewardInfoMap:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 507
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "community_reward_info_available"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_0

    .line 509
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->communityRewardRequest:Lcom/shopkick/app/fetchers/api/skapi/CommunityRewardInfoRequest;

    if-nez v0, :cond_1

    .line 510
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/CommunityRewardInfoRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommunityRewardInfoRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->communityRewardRequest:Lcom/shopkick/app/fetchers/api/skapi/CommunityRewardInfoRequest;

    .line 511
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->communityRewardRequest:Lcom/shopkick/app/fetchers/api/skapi/CommunityRewardInfoRequest;

    iget-wide v1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->screenDensity:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/CommunityRewardInfoRequest;->scale:Ljava/lang/Double;

    const/4 v0, 0x0

    .line 512
    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->communityRewardInfoMap:Ljava/util/HashMap;

    .line 513
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardsDataController;->communityRewardRequest:Lcom/shopkick/app/fetchers/api/skapi/CommunityRewardInfoRequest;

    const/4 v5, 0x0

    sget-object v6, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v7, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v8, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v4, p0

    invoke-virtual/range {v1 .. v8}, Lcom/shopkick/fetchers/api/APIManager;->fetchInBackground(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_1
    :goto_0
    return-void
.end method

.method public fetchRewardsMallData()V
    .locals 3

    .line 209
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->rewardListMallV2Request:Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Request;

    if-nez v0, :cond_0

    .line 210
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Request;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Request;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->rewardListMallV2Request:Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Request;

    .line 211
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardsDataController;->getRewardItemOrder()Ljava/util/List;

    move-result-object v0

    .line 212
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->rewardListMallV2Request:Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Request;

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Request;->rewardMallItemIds:Ljava/util/List;

    .line 213
    invoke-direct {p0, v0}, Lcom/shopkick/app/rewards/RewardsDataController;->getRewardHash(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Request;->rewardHashes:Ljava/util/List;

    .line 214
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->rewardListMallV2Request:Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Request;

    iget-wide v1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->screenDensity:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Request;->scale:Ljava/lang/Double;

    const/4 v0, 0x0

    .line 215
    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->firstUseRewardIds:Ljava/util/ArrayList;

    .line 216
    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->selectableRewardIds:Ljava/util/LinkedHashSet;

    .line 217
    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->featuredRewardIds:Ljava/util/ArrayList;

    .line 218
    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->nonFeaturedRewardIds:Ljava/util/ArrayList;

    const/4 v1, 0x0

    .line 219
    iput v1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->nonFeaturedRewardsCount:I

    .line 220
    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->groupRewardIdsMapping:Ljava/util/HashMap;

    const/4 v0, -0x1

    .line 221
    iput v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->almostThereIndex:I

    .line 222
    iput v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->keepEarningIndex:I

    .line 223
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->rewardListMallV2Request:Lcom/shopkick/app/fetchers/api/skapi/RewardListMallV2Request;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_0
    return-void
.end method

.method public getAlmostThereIndex()I
    .locals 1

    .line 180
    iget v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->almostThereIndex:I

    return v0
.end method

.method public getFeaturedRewardIds()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 159
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->featuredRewardIds:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getGroupRewardIdsMapping()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 194
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->groupRewardIdsMapping:Ljava/util/HashMap;

    return-object v0
.end method

.method public getHighestAffordableRewardCostInKicks(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)Ljava/lang/Long;
    .locals 4

    if-eqz p1, :cond_3

    .line 543
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 548
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_2

    .line 549
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    .line 550
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsDataController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v2}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v2

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lt v2, v3, :cond_1

    .line 551
    iget-object p1, v1, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 555
    :cond_2
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 544
    :cond_3
    :goto_1
    sget-object p1, Lcom/shopkick/app/rewards/RewardsDataController;->DEFAULT_REWARD_COST_IN_KICKS:Ljava/lang/Long;

    return-object p1
.end method

.method public getKeepEarningIndex()I
    .locals 1

    .line 187
    iget v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->keepEarningIndex:I

    return v0
.end method

.method public getNonFeaturedRewardIds()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 166
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->nonFeaturedRewardIds:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getNonFeaturedRewardsCount()I
    .locals 1

    .line 173
    iget v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->nonFeaturedRewardsCount:I

    return v0
.end method

.method public getReward(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;
    .locals 2

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->fetchedReward:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->rewardsInfo:Lcom/shopkick/app/rewards/RewardsInfo;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/rewards/RewardsInfo;->getRewardItem(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 142
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->fetchedReward:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->fetchedReward:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    return-object p1
.end method

.method public getSelectableRewardIds()Ljava/util/LinkedHashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 152
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->selectableRewardIds:Ljava/util/LinkedHashSet;

    return-object v0
.end method

.method public isRewardsDataReady()Z
    .locals 3

    .line 130
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->featuredRewardIds:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->nonFeaturedRewardIds:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return v1

    .line 132
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->featuredRewardIds:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsDataController;->nonFeaturedRewardIds:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/2addr v0, v2

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
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

    .line 586
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, -0xc4b42ca

    const/4 v1, 0x0

    if-eq p2, v0, :cond_2

    const v0, 0x44e6563

    if-eq p2, v0, :cond_1

    const v0, 0x783d1232

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "ProfilePointsChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move p1, v1

    goto :goto_1

    :cond_2
    const-string p2, "firstUseCompletedByUser"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 603
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "firstUseCompletedByUser"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 604
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsDataController;->fetchRewardsMallData()V

    goto :goto_2

    .line 597
    :pswitch_1
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsDataController;->isRewardsDataReady()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 598
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsDataController;->sortNonFeaturedRewardIds()V

    goto :goto_2

    .line 588
    :pswitch_2
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardsDataController;->clear()V

    .line 589
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getFirstUseCompleted()Z

    move-result p1

    if-nez p1, :cond_4

    .line 590
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsDataController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "firstUseCompletedByUser"

    invoke-virtual {p1, p0, p2, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    goto :goto_2

    .line 592
    :cond_4
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsDataController;->fetchRewardsMallData()V

    :cond_5
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public sortNonFeaturedRewardIds()V
    .locals 8

    .line 431
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->denominationSet:Ljava/util/TreeSet;

    if-nez v0, :cond_0

    .line 432
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsDataController;->fetchRewardsMallData()V

    return-void

    .line 436
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 437
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 438
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 439
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 440
    iget-object v4, p0, Lcom/shopkick/app/rewards/RewardsDataController;->denominationSet:Ljava/util/TreeSet;

    invoke-virtual {v4}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    .line 441
    new-instance v6, Ljava/util/ArrayList;

    iget-object v7, p0, Lcom/shopkick/app/rewards/RewardsDataController;->denominationRewardIdsMapping:Ljava/util/HashMap;

    invoke-virtual {v7, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 442
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_1

    const/4 v7, 0x0

    .line 443
    invoke-virtual {v6, v7, v3}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 444
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 446
    :cond_1
    invoke-direct {p0, v6}, Lcom/shopkick/app/rewards/RewardsDataController;->shouldCombineRewardsWithNextDenomination(Ljava/util/ArrayList;)Z

    move-result v7

    if-eqz v7, :cond_2

    iget-object v7, p0, Lcom/shopkick/app/rewards/RewardsDataController;->denominationSet:Ljava/util/TreeSet;

    invoke-virtual {v7}, Ljava/util/TreeSet;->last()Ljava/lang/Object;

    move-result-object v7

    if-eq v5, v7, :cond_2

    .line 448
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 451
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v7, p0, Lcom/shopkick/app/rewards/RewardsDataController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v7}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v7

    if-gt v5, v7, :cond_3

    .line 453
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 456
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 459
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 463
    :cond_4
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 467
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/2addr v3, v4

    iput v3, p0, Lcom/shopkick/app/rewards/RewardsDataController;->nonFeaturedRewardsCount:I

    .line 469
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    sget v4, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->NUM_COLS:I

    rem-int/2addr v3, v4

    const/4 v4, 0x0

    if-eqz v3, :cond_6

    .line 470
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 472
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    iput v3, p0, Lcom/shopkick/app/rewards/RewardsDataController;->almostThereIndex:I

    .line 474
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    sget v5, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->NUM_COLS:I

    rem-int/2addr v3, v5

    if-eqz v3, :cond_7

    .line 475
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 477
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/2addr v3, v5

    iput v3, p0, Lcom/shopkick/app/rewards/RewardsDataController;->keepEarningIndex:I

    .line 479
    :goto_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    sget v5, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->NUM_COLS:I

    rem-int/2addr v3, v5

    if-eqz v3, :cond_8

    .line 480
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 484
    :cond_8
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lcom/shopkick/app/rewards/RewardsDataController;->nonFeaturedRewardIds:Ljava/util/ArrayList;

    .line 485
    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardsDataController;->nonFeaturedRewardIds:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 486
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->nonFeaturedRewardIds:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 487
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->nonFeaturedRewardIds:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public tryFetchRewardsMallData()V
    .locals 4

    .line 201
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->accountExists()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 202
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getLastRewardUpdatedTimestamp()J

    move-result-wide v0

    const-wide/32 v2, 0xdbba0

    add-long/2addr v0, v2

    .line 203
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 204
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsDataController;->fetchRewardsMallData()V

    :cond_0
    return-void
.end method
