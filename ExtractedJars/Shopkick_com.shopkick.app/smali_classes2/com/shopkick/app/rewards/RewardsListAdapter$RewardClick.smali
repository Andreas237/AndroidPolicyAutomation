.class Lcom/shopkick/app/rewards/RewardsListAdapter$RewardClick;
.super Ljava/lang/Object;
.source "RewardsListAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/rewards/RewardsListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "RewardClick"
.end annotation


# instance fields
.field private adapterRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/rewards/RewardsListAdapter;",
            ">;"
        }
    .end annotation
.end field

.field private reward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;


# direct methods
.method constructor <init>(Lcom/shopkick/app/rewards/RewardsListAdapter;Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;)V
    .locals 1

    .line 311
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 312
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardClick;->adapterRef:Ljava/lang/ref/WeakReference;

    .line 313
    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardClick;->reward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 318
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardClick;->adapterRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/rewards/RewardsListAdapter;

    if-eqz p1, :cond_1

    .line 321
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardClick;->reward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->skLink:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 322
    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardsListAdapter;->access$000(Lcom/shopkick/app/rewards/RewardsListAdapter;)Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardClick;->reward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->skLink:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    goto :goto_0

    .line 324
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "redeemed_reward_entity_key"

    .line 325
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardClick;->reward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardsListAdapter;->access$100(Lcom/shopkick/app/rewards/RewardsListAdapter;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;

    if-eqz p1, :cond_1

    .line 328
    const-class v1, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    :cond_1
    :goto_0
    return-void
.end method
