.class public Lcom/shopkick/app/rewards/RewardsInfo;
.super Ljava/lang/Object;
.source "RewardsInfo.java"


# static fields
.field private static final REWARDS_PREFS_FILE_NAME:Ljava/lang/String; = "rewards_prefs_file"

.field public static final REWARD_MALL_ITEM_IDS_HEADER:Ljava/lang/String; = "reward_mall_ids"


# instance fields
.field private prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    const-string v0, "rewards_prefs_file"

    const/4 v1, 0x0

    .line 28
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsInfo;->prefs:Landroid/content/SharedPreferences;

    return-void

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The argument \'context\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getRewardItem(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;
    .locals 2

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsInfo;->prefs:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 75
    invoke-static {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v1
.end method

.method public getRewardsMallItemIds()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsInfo;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "reward_mall_ids"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-object v2

    .line 57
    :cond_0
    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->toList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public putRewardItem(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V
    .locals 1

    .line 62
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->toString()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsInfo;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 66
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 67
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method

.method public putRewardsMallItemIds(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 33
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsInfo;->getRewardsMallItemIds()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 34
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 35
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 36
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 38
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->removeAll(Ljava/util/Collection;)Z

    .line 39
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsInfo;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 40
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 41
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 43
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_1
    const-string v0, ","

    .line 46
    invoke-static {v0, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    .line 47
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsInfo;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "reward_mall_ids"

    .line 48
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 49
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
