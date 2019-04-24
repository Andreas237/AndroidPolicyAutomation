.class Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;
.super Ljava/lang/Object;
.source "RewardsListAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/rewards/RewardsListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "RewardRowData"
.end annotation


# instance fields
.field public info:[Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

.field rowType:I

.field final synthetic this$0:Lcom/shopkick/app/rewards/RewardsListAdapter;


# direct methods
.method private constructor <init>(Lcom/shopkick/app/rewards/RewardsListAdapter;)V
    .locals 0

    .line 461
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;->this$0:Lcom/shopkick/app/rewards/RewardsListAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 463
    invoke-static {}, Lcom/shopkick/app/rewards/RewardsListAdapter;->access$600()[I

    move-result-object p1

    array-length p1, p1

    new-array p1, p1, [Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;->info:[Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/rewards/RewardsListAdapter;Lcom/shopkick/app/rewards/RewardsListAdapter$1;)V
    .locals 0

    .line 461
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;-><init>(Lcom/shopkick/app/rewards/RewardsListAdapter;)V

    return-void
.end method
