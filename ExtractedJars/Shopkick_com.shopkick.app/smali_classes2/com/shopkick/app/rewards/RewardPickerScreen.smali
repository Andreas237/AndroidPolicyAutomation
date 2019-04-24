.class public Lcom/shopkick/app/rewards/RewardPickerScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "RewardPickerScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/rewards/RewardPickerScreen$ReadRewardsDataFromDiskTask;,
        Lcom/shopkick/app/rewards/RewardPickerScreen$ClickListener;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private buttonUrl:Ljava/lang/String;

.field private diskRewards:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;",
            ">;"
        }
    .end annotation
.end field

.field private firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

.field private listView:Landroid/widget/ListView;

.field private listViewAdapter:Lcom/shopkick/app/rewards/RewardPickerAdapter;

.field private nextButton:Lcom/shopkick/app/widget/SKButton;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field private progressBar:Landroid/widget/ProgressBar;

.field private rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/rewards/RewardPickerScreen;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardPickerScreen;->handleNextButtonTap()V

    return-void
.end method

.method static synthetic access$102(Lcom/shopkick/app/rewards/RewardPickerScreen;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->diskRewards:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic access$200(Lcom/shopkick/app/rewards/RewardPickerScreen;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardPickerScreen;->populateRewardCells()V

    return-void
.end method

.method private executeTask(Lcom/shopkick/app/rewards/RewardPickerScreen$ReadRewardsDataFromDiskTask;)V
    .locals 2

    .line 262
    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/rewards/RewardPickerScreen$ReadRewardsDataFromDiskTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method private handleNextButtonTap()V
    .locals 3

    .line 227
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x3f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x1a

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 228
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listViewAdapter:Lcom/shopkick/app/rewards/RewardPickerAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSelectedRewardId(Ljava/lang/String;)V

    .line 229
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listViewAdapter:Lcom/shopkick/app/rewards/RewardPickerAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->getSelectedRewardName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSelectedRewardName(Ljava/lang/String;)V

    .line 230
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 232
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listViewAdapter:Lcom/shopkick/app/rewards/RewardPickerAdapter;

    invoke-direct {p0, v0}, Lcom/shopkick/app/rewards/RewardPickerScreen;->setRewardIdAndDenominationFromListAdapter(Lcom/shopkick/app/rewards/RewardPickerAdapter;)V

    .line 234
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->isInFirstUse()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 235
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->buttonUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 236
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    .line 237
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->buttonUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    goto :goto_0

    .line 240
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 242
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->gotoNextScreen()Z

    move-result v0

    if-nez v0, :cond_2

    .line 243
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    goto :goto_0

    .line 247
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardPickerScreen;->popScreen()V

    :cond_2
    :goto_0
    return-void
.end method

.method private populateRewardCells()V
    .locals 7

    .line 150
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->progressBar:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 151
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 152
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {v1}, Lcom/shopkick/app/rewards/RewardsDataController;->getSelectableRewardIds()Ljava/util/LinkedHashSet;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 154
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 155
    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/rewards/RewardsDataController;->getReward(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 156
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    if-eqz v3, :cond_0

    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->thumbnailImageUrl:Ljava/lang/String;

    if-nez v3, :cond_1

    goto :goto_0

    .line 161
    :cond_1
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const v4, 0x7fffffff

    move v5, v4

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    .line 162
    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    goto :goto_1

    :cond_2
    if-ne v5, v4, :cond_3

    .line 163
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->rewardMallItemId:Ljava/lang/String;

    iget-object v4, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 164
    invoke-virtual {v4}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_3
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 166
    :cond_4
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v1}, Lcom/shopkick/app/launch/FirstUseControllerV2;->isInFirstUse()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 167
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->diskRewards:Ljava/util/ArrayList;

    .line 169
    :cond_5
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listViewAdapter:Lcom/shopkick/app/rewards/RewardPickerAdapter;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->setRewards(Ljava/util/List;)V

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listViewAdapter:Lcom/shopkick/app/rewards/RewardPickerAdapter;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->setSelectedRewardId(Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listViewAdapter:Lcom/shopkick/app/rewards/RewardPickerAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->notifyDataSetChanged()V

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 174
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "ProfileInfoUpdatedEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 175
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "SelectedRewardIdUpdated"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method private readRewardsDataFromDisk()V
    .locals 3

    .line 255
    new-instance v0, Lcom/shopkick/app/rewards/RewardPickerScreen$ReadRewardsDataFromDiskTask;

    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardPickerScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 257
    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v0, v1, p0, v2}, Lcom/shopkick/app/rewards/RewardPickerScreen$ReadRewardsDataFromDiskTask;-><init>(Landroid/content/res/Resources;Lcom/shopkick/app/rewards/RewardPickerScreen;I)V

    .line 258
    invoke-direct {p0, v0}, Lcom/shopkick/app/rewards/RewardPickerScreen;->executeTask(Lcom/shopkick/app/rewards/RewardPickerScreen$ReadRewardsDataFromDiskTask;)V

    return-void
.end method

.method private setRewardIdAndDenominationFromListAdapter(Lcom/shopkick/app/rewards/RewardPickerAdapter;)V
    .locals 2

    .line 217
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->isInFirstUse()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 219
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 220
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {p1}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/rewards/RewardsDataController;->getReward(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v0

    .line 221
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/rewards/RewardsDataController;->getHighestAffordableRewardCostInKicks(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)Ljava/lang/Long;

    move-result-object v0

    .line 222
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {p1}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->getSelectedRewardId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Lcom/shopkick/app/application/ProfileInfo;->setSelectedRewardId(Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_1

    .line 218
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {p1}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->getSelectedRewardId()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/shopkick/app/application/ProfileInfo;->setSelectedRewardId(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const p3, 0x7f1105f0

    .line 98
    invoke-virtual {p0, p3}, Lcom/shopkick/app/rewards/RewardPickerScreen;->setAppScreenTitle(I)V

    const/4 p3, 0x0

    const v0, 0x7f0c018a

    .line 99
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    const v0, 0x7f0905d8

    .line 100
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->progressBar:Landroid/widget/ProgressBar;

    const v0, 0x7f0905d4

    .line 102
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    .line 103
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    new-instance v1, Lcom/shopkick/app/rewards/RewardPickerScreen$ClickListener;

    invoke-direct {v1, p0}, Lcom/shopkick/app/rewards/RewardPickerScreen$ClickListener;-><init>(Lcom/shopkick/app/rewards/RewardPickerScreen;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p3}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    const v0, 0x7f0905d5

    .line 106
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    const v1, 0x7f0905da

    .line 107
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    .line 108
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v2}, Lcom/shopkick/app/launch/FirstUseControllerV2;->isInFirstUse()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 109
    invoke-virtual {v0, p3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 110
    invoke-virtual {v1, p3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    .line 112
    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 113
    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    :goto_0
    const v0, 0x7f0905d6

    .line 116
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listView:Landroid/widget/ListView;

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listView:Landroid/widget/ListView;

    const v1, 0x7f0c0189

    invoke-virtual {p1, v1, v0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V

    .line 118
    new-instance p1, Lcom/shopkick/app/rewards/RewardPickerAdapter;

    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardPickerScreen;->getContext()Landroid/content/Context;

    move-result-object p3

    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listView:Landroid/widget/ListView;

    invoke-direct {p1, p3, v0, p0}, Lcom/shopkick/app/rewards/RewardPickerAdapter;-><init>(Landroid/content/Context;Landroid/widget/ListView;Lcom/shopkick/app/rewards/RewardPickerScreen;)V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listViewAdapter:Lcom/shopkick/app/rewards/RewardPickerAdapter;

    .line 119
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listView:Landroid/widget/ListView;

    iget-object p3, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listViewAdapter:Lcom/shopkick/app/rewards/RewardPickerAdapter;

    invoke-virtual {p1, p3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 121
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {p1}, Lcom/shopkick/app/rewards/RewardsDataController;->isRewardsDataReady()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 122
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardPickerScreen;->populateRewardCells()V

    goto :goto_1

    .line 123
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {p1}, Lcom/shopkick/app/launch/FirstUseControllerV2;->isInFirstUse()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 124
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardPickerScreen;->readRewardsDataFromDisk()V

    goto :goto_1

    .line 126
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "rewards_reload_completed"

    invoke-virtual {p1, p0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 127
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "rewards_reload_failed"

    invoke-virtual {p1, p0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 128
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {p1}, Lcom/shopkick/app/rewards/RewardsDataController;->fetchRewardsMallData()V

    :goto_1
    return-object p2
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

    .line 75
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    .line 76
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    .line 77
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 78
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 79
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 80
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 81
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RewardPickerScreen;->addResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 1

    .line 322
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->isInFirstUse()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 323
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->PERFORM_ACTIVITY_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0

    .line 324
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listViewAdapter:Lcom/shopkick/app/rewards/RewardPickerAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 325
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listViewAdapter:Lcom/shopkick/app/rewards/RewardPickerAdapter;

    invoke-direct {p0, v0}, Lcom/shopkick/app/rewards/RewardPickerScreen;->setRewardIdAndDenominationFromListAdapter(Lcom/shopkick/app/rewards/RewardPickerAdapter;)V

    .line 327
    :cond_1
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    move-result-object v0

    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listViewAdapter:Lcom/shopkick/app/rewards/RewardPickerAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->destroyAdapter()V

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 146
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

    const-string p2, "ProfileInfoUpdatedEvent"

    if-eq p1, p2, :cond_2

    const-string p2, "SelectedRewardIdUpdated"

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "rewards_reload_completed"

    .line 186
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 187
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardPickerScreen;->populateRewardCells()V

    goto :goto_1

    :cond_1
    const-string p2, "rewards_reload_failed"

    .line 188
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 189
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardPickerScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    const v0, 0x7f110142

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_1

    .line 181
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {p1}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 183
    iget-object p2, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listViewAdapter:Lcom/shopkick/app/rewards/RewardPickerAdapter;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->setSelectedRewardId(Ljava/lang/String;)V

    .line 184
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listView:Landroid/widget/ListView;

    invoke-virtual {p1}, Landroid/widget/ListView;->invalidate()V

    :cond_3
    :goto_1
    return-void
.end method

.method protected onScreenDidHide()V
    .locals 1

    .line 136
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidHide()V

    .line 137
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listViewAdapter:Lcom/shopkick/app/rewards/RewardPickerAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->listViewAdapter:Lcom/shopkick/app/rewards/RewardPickerAdapter;

    invoke-direct {p0, v0}, Lcom/shopkick/app/rewards/RewardPickerScreen;->setRewardIdAndDenominationFromListAdapter(Lcom/shopkick/app/rewards/RewardPickerAdapter;)V

    :cond_0
    return-void
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 3

    .line 86
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->isInFirstUse()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->params:Ljava/util/Map;

    const-string v1, "flow_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 89
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->params:Ljava/util/Map;

    const-string v2, "button_url"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerScreen;->buttonUrl:Ljava/lang/String;

    .line 90
    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 91
    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
