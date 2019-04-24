.class public Lcom/shopkick/app/rewards/RewardsMallScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "RewardsMallScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# instance fields
.field private alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field mainView:Landroid/view/View;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field private profilePoints:Lcom/shopkick/app/points/ProfilePoints;

.field rewardListView:Landroid/widget/ListView;

.field private rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

.field private rewardsMallListAdapter:Lcom/shopkick/app/rewards/RewardsMallListAdapter;

.field private viewBuilder:Lcom/shopkick/app/util/ViewBuilder;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private setUpKicksHeader()V
    .locals 4

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->mainView:Landroid/view/View;

    const v1, 0x7f0903df

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 72
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->mainView:Landroid/view/View;

    const v2, 0x7f0903e1

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 75
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v2}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsMallScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 78
    invoke-virtual {v2}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v2

    const v3, 0x7f0f000e

    .line 77
    invoke-virtual {v0, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v0

    .line 76
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    const/4 p3, 0x0

    const v0, 0x7f0c018e

    .line 83
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->mainView:Landroid/view/View;

    .line 85
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardsMallScreen;->setUpKicksHeader()V

    .line 86
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->mainView:Landroid/view/View;

    const p2, 0x7f0905cc

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ListView;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardListView:Landroid/widget/ListView;

    .line 87
    new-instance p1, Lcom/shopkick/app/rewards/RewardsMallListAdapter;

    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsMallScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardListView:Landroid/widget/ListView;

    iget-object v4, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    iget-object v5, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    iget-object v6, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    move-object v0, p1

    move-object v3, p0

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/rewards/RewardsMallListAdapter;-><init>(Landroid/content/Context;Landroid/widget/ListView;Lcom/shopkick/app/rewards/RewardsMallScreen;Lcom/shopkick/app/rewards/RewardsDataController;Lcom/shopkick/app/util/ViewBuilder;Lcom/shopkick/app/points/ProfilePoints;)V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardsMallListAdapter:Lcom/shopkick/app/rewards/RewardsMallListAdapter;

    .line 93
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardListView:Landroid/widget/ListView;

    iget-object p2, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardsMallListAdapter:Lcom/shopkick/app/rewards/RewardsMallListAdapter;

    invoke-virtual {p1, p2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 95
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "rewards_reload_completed"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 96
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "rewards_reload_failed"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {p1}, Lcom/shopkick/app/rewards/RewardsDataController;->isRewardsDataReady()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 99
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsMallScreen;->displayMall()V

    goto :goto_0

    .line 101
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {p1}, Lcom/shopkick/app/rewards/RewardsDataController;->fetchRewardsMallData()V

    :goto_0
    const p1, 0x7f110602

    .line 104
    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RewardsMallScreen;->setAppScreenTitle(I)V

    .line 105
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    if-eqz p1, :cond_1

    iget-object p1, p1, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object p1, p1, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->numberOfRewards:Ljava/lang/Integer;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object p1, p1, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->numberOfRewards:Ljava/lang/Integer;

    .line 107
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-lez p1, :cond_1

    const/4 p3, 0x1

    .line 105
    :cond_1
    invoke-virtual {p0, p3}, Lcom/shopkick/app/rewards/RewardsMallScreen;->setHasOptionsMenu(Z)V

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->mainView:Landroid/view/View;

    return-object p1
.end method

.method public displayMall()V
    .locals 2

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardListView:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardsMallListAdapter:Lcom/shopkick/app/rewards/RewardsMallListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->updateData()V

    .line 130
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardsMallListAdapter:Lcom/shopkick/app/rewards/RewardsMallListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 60
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    .line 61
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 62
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    .line 63
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 64
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 65
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 66
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RewardsMallScreen;->addResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    .line 158
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/screens/AppScreen;->onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    const v0, 0x7f0d0005

    .line 159
    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardsMallListAdapter:Lcom/shopkick/app/rewards/RewardsMallListAdapter;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 115
    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->destroyAdapter()V

    .line 116
    iput-object v1, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardsMallListAdapter:Lcom/shopkick/app/rewards/RewardsMallListAdapter;

    .line 118
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 119
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardListView:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 120
    iput-object v1, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardListView:Landroid/widget/ListView;

    .line 121
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
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

    const-string v0, "rewards_reload_completed"

    if-ne p1, v0, :cond_0

    .line 140
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsMallScreen;->displayMall()V

    goto :goto_0

    :cond_0
    const-string v0, "rewards_reload_failed"

    if-ne p1, v0, :cond_1

    if-eqz p2, :cond_1

    const-string p1, "rewards_data_response_arg"

    .line 143
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/fetchers/DataResponse;

    if-eqz p1, :cond_1

    .line 145
    iget-object p2, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 164
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f090023

    if-ne v0, v1, :cond_0

    .line 165
    const-class p1, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/rewards/RewardsMallScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    const/4 p1, 0x1

    return p1

    .line 168
    :cond_0
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onScreenDidHide()V
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardListView:Landroid/widget/ListView;

    if-eqz v0, :cond_0

    .line 54
    invoke-static {v0}, Lcom/shopkick/app/util/ImagePruner;->detachImageBitmaps(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public onScreenDidShow()V
    .locals 2

    .line 45
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardsMallListAdapter:Lcom/shopkick/app/rewards/RewardsMallListAdapter;

    if-eqz v0, :cond_0

    .line 46
    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->notifyDataSetChanged()V

    .line 47
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallScreen;->rewardsMallListAdapter:Lcom/shopkick/app/rewards/RewardsMallListAdapter;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->setDetailsLoading(Z)V

    :cond_0
    return-void
.end method
