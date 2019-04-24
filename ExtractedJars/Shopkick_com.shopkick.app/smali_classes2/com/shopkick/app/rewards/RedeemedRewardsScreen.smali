.class public Lcom/shopkick/app/rewards/RedeemedRewardsScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "RedeemedRewardsScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private chainId:Ljava/lang/String;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private listView:Lcom/shopkick/app/view/SKListView;

.field private listViewCoordinator:Lcom/shopkick/app/logging/UserEventListViewCoordinator;

.field private mainView:Landroid/view/View;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private numRewards:I

.field private numUsedRewards:I

.field private redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

.field private rewardsListAdapter:Lcom/shopkick/app/rewards/RewardsListAdapter;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private usedRewards:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private incrementOrDecrementRewardCount(Z)V
    .locals 1

    .line 194
    iget-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->usedRewards:Z

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->usedRewards:Z

    if-nez v0, :cond_2

    if-nez p1, :cond_2

    .line 197
    :cond_1
    iget p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->numRewards:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->numRewards:I

    goto :goto_0

    .line 200
    :cond_2
    iget p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->numRewards:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->numRewards:I

    :goto_0
    return-void
.end method

.method private refreshRewards()V
    .locals 3

    .line 181
    iget-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->usedRewards:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUsedRewards(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    .line 182
    invoke-virtual {v0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUnusedRewards(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 184
    :goto_0
    iget-boolean v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->usedRewards:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->hasMoreUsedRewardsPages(Ljava/lang/String;)Z

    move-result v1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    .line 185
    invoke-virtual {v1, v2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->hasMoreUnusedRewardsPages(Ljava/lang/String;)Z

    move-result v1

    .line 186
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    iput v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->numRewards:I

    .line 187
    iget-boolean v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->usedRewards:Z

    if-eqz v2, :cond_2

    .line 188
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->updateHeaderTitle()V

    .line 190
    :cond_2
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->rewardsListAdapter:Lcom/shopkick/app/rewards/RewardsListAdapter;

    invoke-virtual {v2, v0, v1}, Lcom/shopkick/app/rewards/RewardsListAdapter;->refreshWithRewards(Ljava/util/ArrayList;Z)V

    return-void
.end method

.method private updateHeaderTitle()V
    .locals 5

    const v0, 0x7f11057c

    .line 205
    invoke-virtual {p0, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 206
    iget-boolean v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->usedRewards:Z

    if-eqz v1, :cond_0

    const v0, 0x7f0f0036

    .line 207
    iget v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->numRewards:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {p0, v0, v1, v2}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 209
    :cond_0
    invoke-virtual {p0, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->setAppScreenTitle(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    const/4 p3, 0x0

    const v0, 0x7f0c018f

    .line 82
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->mainView:Landroid/view/View;

    .line 83
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->mainView:Landroid/view/View;

    const p2, 0x7f09042b

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKListView;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->listView:Lcom/shopkick/app/view/SKListView;

    .line 84
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "connectivity"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    .line 85
    new-instance v5, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    invoke-direct {v5, p1}, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;-><init>(Landroid/net/ConnectivityManager;)V

    .line 86
    new-instance p1, Lcom/shopkick/app/rewards/RewardsListAdapter;

    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->mainView:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v3, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->listView:Lcom/shopkick/app/view/SKListView;

    iget-object v4, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v6, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-boolean v7, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->usedRewards:Z

    iget-object v8, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->listViewCoordinator:Lcom/shopkick/app/logging/UserEventListViewCoordinator;

    iget-object v9, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    move-object v0, p1

    move-object v2, p0

    invoke-direct/range {v0 .. v9}, Lcom/shopkick/app/rewards/RewardsListAdapter;-><init>(Landroid/content/Context;Lcom/shopkick/app/rewards/RedeemedRewardsScreen;Lcom/shopkick/app/view/SKListView;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/fetchers/network/SKConnectivityManager;Lcom/shopkick/app/application/dialog/DialogsManager;ZLcom/shopkick/app/logging/UserEventListViewCoordinator;Lcom/shopkick/app/url/URLDispatcher;)V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->rewardsListAdapter:Lcom/shopkick/app/rewards/RewardsListAdapter;

    .line 95
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->rewardsListAdapter:Lcom/shopkick/app/rewards/RewardsListAdapter;

    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p2, p2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->homeScreenFeedTilesRemainingBeforeNextFetch:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/rewards/RewardsListAdapter;->setPageRequestOffset(I)V

    .line 96
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->listView:Lcom/shopkick/app/view/SKListView;

    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->rewardsListAdapter:Lcom/shopkick/app/rewards/RewardsListAdapter;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 97
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->listView:Lcom/shopkick/app/view/SKListView;

    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->listViewCoordinator:Lcom/shopkick/app/logging/UserEventListViewCoordinator;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKListView;->addModule(Lcom/shopkick/app/view/ISKListViewModule;)V

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->listView:Lcom/shopkick/app/view/SKListView;

    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKListView;->addModule(Lcom/shopkick/app/view/ISKListViewModule;)V

    .line 100
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "REWARD_USED_STATUS_UPDATE_SUCCESS_EVENT"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 102
    iget-boolean p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->usedRewards:Z

    if-eqz p1, :cond_0

    .line 103
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "USED_REWARDS_PAGE_SUCCESS_EVENT"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 104
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "USED_REWARDS_PAGE_FAIL_EVENT"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    goto :goto_0

    .line 106
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UNUSED_REWARDS_FROM_OFFLINE_DATA_STORE_UPDATED"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 108
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UNUSED_REWARDS_PAGE_SUCCESS_EVENT"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UNUSED_REWARDS_PAGE_FAIL_EVENT"

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 111
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->updateHeaderTitle()V

    .line 112
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->mainView:Landroid/view/View;

    return-object p1
.end method

.method public fetchNextPage()V
    .locals 2

    .line 173
    iget-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->usedRewards:Z

    if-eqz v0, :cond_0

    .line 174
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->fetchNextUsedRewardsPage(Ljava/lang/String;)V

    goto :goto_0

    .line 176
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->fetchNextUnusedRewardsPage(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public getChainId()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
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

    const-string/jumbo v0, "used_rewards"

    .line 54
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->usedRewards:Z

    const-string v0, "chain_id"

    .line 55
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    .line 56
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    .line 57
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 58
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 59
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p2}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 60
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 61
    new-instance p1, Lcom/shopkick/app/logging/UserEventListViewCoordinator;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/shopkick/app/logging/UserEventListViewCoordinator;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->listViewCoordinator:Lcom/shopkick/app/logging/UserEventListViewCoordinator;

    .line 62
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->listViewCoordinator:Lcom/shopkick/app/logging/UserEventListViewCoordinator;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/logging/UserEventLogger;->addUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    .line 63
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->addResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    .line 64
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUsedRewards(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->numUsedRewards:I

    return-void
.end method

.method public onDestroy()V
    .locals 2

    const/4 v0, 0x0

    .line 128
    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->mainView:Landroid/view/View;

    .line 129
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v1, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 130
    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->listView:Lcom/shopkick/app/view/SKListView;

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->rewardsListAdapter:Lcom/shopkick/app/rewards/RewardsListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardsListAdapter;->destroyAdapter()V

    .line 132
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
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

    const-string v0, "UNUSED_REWARDS_FROM_OFFLINE_DATA_STORE_UPDATED"

    .line 141
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->hasMoreUnusedRewardsPages(Ljava/lang/String;)Z

    move-result p1

    .line 144
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUnusedRewards(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p2

    .line 145
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->numRewards:I

    .line 146
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->rewardsListAdapter:Lcom/shopkick/app/rewards/RewardsListAdapter;

    invoke-virtual {v0, p2, p1}, Lcom/shopkick/app/rewards/RewardsListAdapter;->refreshWithRewards(Ljava/util/ArrayList;Z)V

    .line 147
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->fetchNextPage()V

    goto/16 :goto_1

    :cond_0
    const-string v0, "UNUSED_REWARDS_PAGE_SUCCESS_EVENT"

    .line 148
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "USED_REWARDS_PAGE_SUCCESS_EVENT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    const-string v0, "CHAIN_ID_FOR_PAGED_REWARDS"

    .line 150
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "ALL_CHAINS_REWARD_KEY"

    .line 151
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 152
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->refreshRewards()V

    goto :goto_1

    :cond_3
    const-string v0, "UNUSED_REWARDS_PAGE_FAIL_EVENT"

    .line 153
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const v1, 0x7f11057f

    if-eqz v0, :cond_5

    .line 156
    iget-boolean p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->usedRewards:Z

    if-nez p1, :cond_4

    iget p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->numRewards:I

    if-nez p1, :cond_8

    .line 157
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_1

    :cond_5
    const-string v0, "USED_REWARDS_PAGE_FAIL_EVENT"

    .line 159
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 160
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_1

    :cond_6
    const-string v0, "REWARD_USED_STATUS_UPDATE_SUCCESS_EVENT"

    .line 161
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    const-string/jumbo p1, "updated_reward"

    .line 162
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 163
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    if-eqz p2, :cond_7

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->chainsSpendableAt:Ljava/util/List;

    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    .line 164
    :cond_7
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->used:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->incrementOrDecrementRewardCount(Z)V

    .line 165
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->refreshRewards()V

    .line 168
    :cond_8
    :goto_1
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUsedRewards(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->numUsedRewards:I

    .line 169
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->rewardsListAdapter:Lcom/shopkick/app/rewards/RewardsListAdapter;

    iget p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->numUsedRewards:I

    invoke-virtual {p1, p2}, Lcom/shopkick/app/rewards/RewardsListAdapter;->updateArchivedRewardsTextView(I)V

    return-void
.end method

.method protected onScreenDidHide()V
    .locals 0

    .line 123
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidHide()V

    return-void
.end method

.method protected onScreenDidShow()V
    .locals 0

    .line 117
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 118
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->clearAllPayPalScreens()V

    .line 119
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->refreshRewards()V

    return-void
.end method

.method public setParams(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 69
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->setParams(Ljava/util/Map;)V

    const-string v0, "chain_id"

    .line 70
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    if-nez v0, :cond_0

    if-eqz p1, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 72
    :cond_1
    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->chainId:Ljava/lang/String;

    .line 73
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->rewardsListAdapter:Lcom/shopkick/app/rewards/RewardsListAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/rewards/RewardsListAdapter;->clearRewards()V

    .line 74
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->listView:Lcom/shopkick/app/view/SKListView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKListView;->setSelection(I)V

    .line 75
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->refreshRewards()V

    :cond_2
    return-void
.end method
