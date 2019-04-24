.class public Lcom/shopkick/app/kicksCenter/KicksCenterScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "KicksCenterScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;
    }
.end annotation


# static fields
.field private static final GLOW_ANIMATION_DURATION:I = 0x320

.field private static final PAYPAL_CARD_NAME:Ljava/lang/String; = "paypal"

.field public static final SHOULD_ANIMATE_KICKS_ACTIVITY:Ljava/lang/String; = "SHOULD_ANIMATE_KICKS_ACTIVITY"


# instance fields
.field private animateNextTime:Z

.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private bottomSectionWithActivity:Landroid/view/View;

.field private bottomSectionWithoutActivity:Landroid/view/View;

.field private dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private glowAnimation:Landroid/animation/ValueAnimator;

.field private handler:Landroid/os/Handler;

.field private kicksActivityArea:Landroid/view/View;

.field private kicksActivityPendingKicksText:Landroid/widget/TextView;

.field private kicksActivitySectionWithPending:Landroid/view/View;

.field private kicksActivitySectionWithoutPending:Landroid/view/View;

.field private kicksAmount:Landroid/widget/TextView;

.field private kicksCenter:Landroid/widget/RelativeLayout;

.field private kicksCenterToast:Landroid/widget/FrameLayout;

.field private kicksCenterToastBodyText:Landroid/widget/TextView;

.field private kicksCenterToastLeftButton:Lcom/shopkick/app/widget/SKButton;

.field private kicksCenterToastRightButton:Lcom/shopkick/app/widget/SKButton;

.field protected kicksCenterWidgetController:Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;

.field private kicksUnit:Landroid/widget/TextView;

.field private lastDisplayedRewardId:Ljava/lang/String;

.field private lastSelectedRewardDenomination:Ljava/lang/Long;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field private profilePoints:Lcom/shopkick/app/points/ProfilePoints;

.field private redeemedRewardImage:Landroid/widget/ImageView;

.field private redeemedRewardsCount:Landroid/widget/TextView;

.field private redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

.field private rewardsCountToDisplay:Ljava/lang/String;

.field private rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

.field private rewardsMallCount:Landroid/widget/TextView;

.field private selectedReward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

.field private selectedRewardDenominationTextView:Lcom/shopkick/app/widget/SKTextView;

.field private shouldAnimateKicksActivity:Z

.field private usingBottomSectionWithActivity:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 67
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 104
    iput-boolean v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->usingBottomSectionWithActivity:Z

    .line 120
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)Landroid/widget/ImageView;
    .locals 0

    .line 67
    iget-object p0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->redeemedRewardImage:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)Landroid/widget/FrameLayout;
    .locals 0

    .line 67
    iget-object p0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterToast:Landroid/widget/FrameLayout;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)Z
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->showNoInternetError()Z

    move-result p0

    return p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->goToRewardPicker()V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->goToCurrentRewardDetails()V

    return-void
.end method

.method static synthetic access$500(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->goToTutorialHomeScreen()V

    return-void
.end method

.method static synthetic access$600(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->goToRedeemedRewards()V

    return-void
.end method

.method static synthetic access$700(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->goToRewardsMall()V

    return-void
.end method

.method private animateWidget()V
    .locals 4

    .line 278
    iget-boolean v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->animateNextTime:Z

    if-eqz v0, :cond_0

    .line 279
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterWidgetController:Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;

    invoke-virtual {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->startProgressAnim()V

    const/4 v0, 0x0

    .line 280
    iput-boolean v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->animateNextTime:Z

    .line 282
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->selectedReward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterWidgetController:Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;

    invoke-virtual {v0}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->shouldDisplayToast()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 283
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/kicksCenter/-$$Lambda$G5jL9kmaoLc57QHR1MSJytb-UQM;

    invoke-direct {v1, p0}, Lcom/shopkick/app/kicksCenter/-$$Lambda$G5jL9kmaoLc57QHR1MSJytb-UQM;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    const-wide/16 v2, 0x834

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method private displayCurrentReward()V
    .locals 8

    .line 382
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 383
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    iget-object v2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/rewards/RewardsDataController;->getReward(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->selectedReward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    goto :goto_0

    .line 385
    :cond_0
    iput-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->selectedReward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    .line 393
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardDenominationInKicks()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 397
    iget-object v2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->selectedReward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    if-eqz v2, :cond_2

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    if-eqz v2, :cond_2

    .line 398
    iget-object v2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->selectedReward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    .line 399
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->longValue()J

    move-result-wide v4

    iget-object v6, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v6}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardDenominationInKicks()Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-nez v4, :cond_1

    move-object v1, v3

    :cond_2
    if-eqz v1, :cond_4

    .line 408
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->displayName:Ljava/lang/String;

    invoke-static {v2}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->displayName:Ljava/lang/String;

    goto :goto_2

    :cond_4
    :goto_1
    const-string v1, ""

    :goto_2
    const-string v2, "^\\$\\d+(,\\d{3})*(\\.\\d{1,2})?$"

    .line 413
    invoke-virtual {v1, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_5

    .line 414
    iget-object v2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->selectedRewardDenominationTextView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    if-eqz v0, :cond_6

    .line 417
    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v1

    .line 418
    iget-object v2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->selectedRewardDenominationTextView:Lcom/shopkick/app/widget/SKTextView;

    const v5, 0x7f110221

    new-array v6, v4, [Ljava/lang/Object;

    invoke-static {v1}, Lcom/shopkick/app/rewards/RewardsDataController;->kicksToCurrency(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v6, v3

    invoke-virtual {p0, v5, v6}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    goto :goto_3

    .line 420
    :cond_6
    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->selectedRewardDenominationTextView:Lcom/shopkick/app/widget/SKTextView;

    const-string v2, ""

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 423
    :goto_3
    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterWidgetController:Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;

    iget-object v2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->selectedReward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->displayRewardImage(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;Ljava/lang/Long;)V

    .line 425
    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->lastDisplayedRewardId:Ljava/lang/String;

    if-nez v1, :cond_7

    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->selectedReward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    if-nez v1, :cond_7

    iget-boolean v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->animateNextTime:Z

    if-eqz v1, :cond_8

    :cond_7
    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->lastDisplayedRewardId:Ljava/lang/String;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->selectedReward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    if-eqz v1, :cond_9

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->rewardMallItemId:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->lastDisplayedRewardId:Ljava/lang/String;

    .line 426
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    if-eqz v0, :cond_9

    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->lastSelectedRewardDenomination:Ljava/lang/Long;

    if-ne v0, v1, :cond_9

    .line 430
    :cond_8
    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterWidgetController:Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;

    invoke-virtual {v1, v3}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->showRewardProgress(Z)V

    goto :goto_4

    .line 433
    :cond_9
    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterWidgetController:Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;

    invoke-virtual {v1}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->clearRewardProgress()V

    .line 434
    iput-boolean v4, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->animateNextTime:Z

    .line 437
    :goto_4
    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->selectedReward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    if-eqz v1, :cond_a

    .line 438
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->rewardMallItemId:Ljava/lang/String;

    iput-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->lastDisplayedRewardId:Ljava/lang/String;

    .line 439
    iput-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->lastSelectedRewardDenomination:Ljava/lang/Long;

    :cond_a
    return-void
.end method

.method private displayRewardLinks()V
    .locals 6

    .line 469
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->rewardsCountToDisplay:Ljava/lang/String;

    const/4 v1, 0x1

    const v2, 0x7f1103a1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    const-string v4, "0"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 470
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUnusedRewards(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 472
    iget-object v4, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->redeemedRewardsCount:Landroid/widget/TextView;

    if-eqz v4, :cond_0

    .line 473
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->rewardsCountToDisplay:Ljava/lang/String;

    aput-object v5, v1, v3

    invoke-virtual {p0, v2, v1}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 477
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 478
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    if-eqz v0, :cond_1

    .line 481
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->giftCardTileImageUrl:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 483
    invoke-static {p0}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/support/v4/app/Fragment;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/util/GlideRequest;->fitCenter()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$1;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->redeemedRewardImage:Landroid/widget/ImageView;

    .line 492
    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 498
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->updateRewardsMallUi()V

    goto :goto_0

    .line 500
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->numberOfRewards:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->numberOfRewards:Ljava/lang/Integer;

    .line 501
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_4

    .line 502
    iget-boolean v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->usingBottomSectionWithActivity:Z

    if-eqz v0, :cond_3

    .line 504
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->redeemedRewardsCount:Landroid/widget/TextView;

    new-array v1, v1, [Ljava/lang/Object;

    .line 505
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v3

    .line 504
    invoke-virtual {p0, v2, v1}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 508
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->redeemedRewardImage:Landroid/widget/ImageView;

    const v1, 0x7f0801cf

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 511
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->updateRewardsMallUi()V

    goto :goto_0

    .line 515
    :cond_4
    iget-boolean v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->usingBottomSectionWithActivity:Z

    if-eqz v0, :cond_5

    .line 516
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->redeemedRewardsCount:Landroid/widget/TextView;

    new-array v1, v1, [Ljava/lang/Object;

    .line 517
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v3

    .line 516
    invoke-virtual {p0, v2, v1}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 522
    :cond_5
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->updateRewardsMallUi()V

    :goto_0
    return-void
.end method

.method private goToCurrentRewardDetails()V
    .locals 3

    .line 614
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "reward_id"

    .line 615
    iget-object v2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "origin_element"

    const/16 v2, 0x3f

    .line 616
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 617
    const-class v1, Lcom/shopkick/app/activities/RewardActivity;

    const-class v2, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

    invoke-virtual {p0, v1, v2, v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method private goToRedeemedRewards()V
    .locals 3

    .line 608
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "origin_element"

    const/16 v2, 0x53

    .line 609
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 610
    const-class v1, Lcom/shopkick/app/activities/RewardActivity;

    const-class v2, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;

    invoke-virtual {p0, v1, v2, v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method private goToRewardPicker()V
    .locals 3

    .line 600
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "origin_screen"

    const/16 v2, 0x6c

    .line 602
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 601
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "origin_element"

    const/16 v2, 0x7c

    .line 603
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    const-class v1, Lcom/shopkick/app/activities/RewardActivity;

    const-class v2, Lcom/shopkick/app/rewards/RewardPickerScreen;

    invoke-virtual {p0, v1, v2, v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method private goToRewardsMall()V
    .locals 3

    .line 592
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "origin_screen"

    const/16 v2, 0x6c

    .line 594
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 593
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "origin_element"

    const/16 v2, 0x9a

    .line 595
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 596
    const-class v1, Lcom/shopkick/app/activities/RewardActivity;

    const-class v2, Lcom/shopkick/app/rewards/RewardsMallScreen;

    invoke-virtual {p0, v1, v2, v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method private goToTutorialHomeScreen()V
    .locals 3

    .line 588
    const-class v0, Lcom/shopkick/app/activities/RewardActivity;

    const-class v1, Lcom/shopkick/app/tutorials/TutorialHomeScreen;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic lambda$updateKicksActivityUI$113(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;Landroid/view/View;)V
    .locals 2

    .line 351
    const-class p1, Lcom/shopkick/app/activities/KicksActivity;

    const-class v0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic lambda$updateKicksActivityUI$114(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 356
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksActivityArea:Landroid/view/View;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method private refreshKicks()V
    .locals 4

    .line 570
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksAmount:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v1}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 571
    invoke-virtual {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 573
    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksUnit:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0f000e

    iget-object v3, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 575
    invoke-virtual {v3}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v3

    .line 574
    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v0

    .line 573
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 578
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->updateBottomSectionUiState()V

    .line 581
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->updateKicksActivityUI()V

    .line 582
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->displayRewardLinks()V

    return-void
.end method

.method private setUpLogging(Lcom/shopkick/app/logging/IUserEventView;I)V
    .locals 1

    const/4 v0, 0x0

    .line 625
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->setUpLogging(Lcom/shopkick/app/logging/IUserEventView;IZ)V

    return-void
.end method

.method private setUpLogging(Lcom/shopkick/app/logging/IUserEventView;IZ)V
    .locals 2

    .line 633
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 635
    new-instance p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    const/4 v1, 0x1

    .line 636
    iput-boolean v1, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    if-eqz p3, :cond_0

    .line 638
    iget-object p3, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    if-eqz p3, :cond_0

    iget-object p3, p3, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object p3, p3, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->numberOfRewards:Ljava/lang/Integer;

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object p3, p3, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->numberOfRewards:Ljava/lang/Integer;

    .line 642
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    if-lez p3, :cond_0

    .line 643
    iget-object p3, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object p3, p3, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->numberOfRewards:Ljava/lang/Integer;

    invoke-virtual {v0, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setRewardsCount(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 645
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {v0, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setRewardsCount(Ljava/lang/Integer;)V

    .line 648
    :goto_0
    iget-object p3, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p1, v0, p3, p2}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method private setUpPendingKicksLogging(Lcom/shopkick/app/logging/IUserEventView;I)V
    .locals 2

    .line 656
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 657
    iget-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {p2}, Lcom/shopkick/app/points/ProfilePoints;->getEscrowCoins()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCount(Ljava/lang/Integer;)V

    .line 658
    iget-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v1, 0x0

    invoke-interface {p1, v0, p2, v1}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method private showNoInternetError()Z
    .locals 10

    .line 737
    invoke-virtual {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 738
    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    const-string v1, "connectivity"

    .line 740
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_2

    .line 741
    new-instance v1, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    invoke-direct {v1, v0}, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;-><init>(Landroid/net/ConnectivityManager;)V

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;->isNetworkConnected()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return v2

    .line 742
    :cond_2
    :goto_0
    iget-object v3, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v0, 0x7f11039c

    .line 745
    invoke-virtual {p0, v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getString(I)Ljava/lang/String;

    move-result-object v6

    const v0, 0x7f11014f

    .line 746
    invoke-virtual {p0, v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getString(I)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lcom/shopkick/app/kicksCenter/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/kicksCenter/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v9, 0x0

    .line 742
    invoke-virtual/range {v3 .. v9}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    const/4 v0, 0x1

    return v0
.end method

.method private updateBottomSectionUiState()V
    .locals 5

    .line 291
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v0}, Lcom/shopkick/app/points/ProfilePoints;->getLifetimeCoins()I

    move-result v0

    const/4 v1, 0x1

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->usingBottomSectionWithActivity:Z

    .line 292
    iget-boolean v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->usingBottomSectionWithActivity:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->bottomSectionWithActivity:Landroid/view/View;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->bottomSectionWithoutActivity:Landroid/view/View;

    :goto_1
    const v2, 0x7f0903c0

    .line 296
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 297
    new-instance v3, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;

    invoke-direct {v3, p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 301
    iget-boolean v2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->usingBottomSectionWithActivity:Z

    const/16 v3, 0x9a

    if-nez v2, :cond_2

    const v2, 0x7f0903b5

    .line 303
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    .line 304
    invoke-direct {p0, v2, v3, v1}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->setUpLogging(Lcom/shopkick/app/logging/IUserEventView;IZ)V

    .line 305
    new-instance v4, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;

    invoke-direct {v4, p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    invoke-virtual {v2, v4}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 310
    :cond_2
    iget-boolean v2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->usingBottomSectionWithActivity:Z

    if-eqz v2, :cond_3

    const v2, 0x7f0903cc

    .line 312
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    const/16 v4, 0x53

    .line 313
    invoke-direct {p0, v2, v4}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->setUpLogging(Lcom/shopkick/app/logging/IUserEventView;I)V

    .line 314
    new-instance v4, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;

    invoke-direct {v4, p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    invoke-virtual {v2, v4}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0903b8

    .line 317
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    .line 318
    invoke-direct {p0, v2, v3, v1}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->setUpLogging(Lcom/shopkick/app/logging/IUserEventView;IZ)V

    .line 319
    new-instance v1, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;

    invoke-direct {v1, p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    invoke-virtual {v2, v1}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0903cd

    .line 321
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->redeemedRewardImage:Landroid/widget/ImageView;

    const v1, 0x7f0903ce

    .line 322
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->redeemedRewardsCount:Landroid/widget/TextView;

    const v1, 0x7f0903ba

    .line 323
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->rewardsMallCount:Landroid/widget/TextView;

    const v1, 0x7f0903c5

    .line 327
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksActivityArea:Landroid/view/View;

    .line 328
    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksActivityArea:Landroid/view/View;

    check-cast v1, Lcom/shopkick/app/logging/IUserEventView;

    const/16 v2, 0xb2

    invoke-direct {p0, v1, v2}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->setUpPendingKicksLogging(Lcom/shopkick/app/logging/IUserEventView;I)V

    const v1, 0x7f0903cf

    .line 329
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksActivityPendingKicksText:Landroid/widget/TextView;

    const v1, 0x7f0903c8

    .line 330
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksActivitySectionWithPending:Landroid/view/View;

    const v1, 0x7f0903c7

    .line 332
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksActivitySectionWithoutPending:Landroid/view/View;

    :cond_3
    return-void
.end method

.method private updateKicksActivityUI()V
    .locals 6

    .line 339
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->bottomSectionWithActivity:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 340
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->bottomSectionWithoutActivity:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 343
    iget-boolean v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->usingBottomSectionWithActivity:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 346
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->bottomSectionWithActivity:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 347
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksActivitySectionWithPending:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 348
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksActivitySectionWithoutPending:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 351
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksActivityArea:Landroid/view/View;

    new-instance v1, Lcom/shopkick/app/kicksCenter/-$$Lambda$KicksCenterScreen$jRWRoLPmnQ4h6Kxeu5MxzKJjbLw;

    invoke-direct {v1, p0}, Lcom/shopkick/app/kicksCenter/-$$Lambda$KicksCenterScreen$jRWRoLPmnQ4h6Kxeu5MxzKJjbLw;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 352
    iget-boolean v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->shouldAnimateKicksActivity:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->glowAnimation:Landroid/animation/ValueAnimator;

    if-nez v0, :cond_0

    .line 353
    new-instance v0, Landroid/animation/ArgbEvaluator;

    invoke-direct {v0}, Landroid/animation/ArgbEvaluator;-><init>()V

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/Object;

    const v5, 0x7f06013b

    .line 354
    invoke-virtual {p0, v5}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getResourceColor(I)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    const v5, 0x7f060027

    .line 355
    invoke-virtual {p0, v5}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getResourceColor(I)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    .line 353
    invoke-static {v0, v4}, Landroid/animation/ValueAnimator;->ofObject(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->glowAnimation:Landroid/animation/ValueAnimator;

    .line 356
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->glowAnimation:Landroid/animation/ValueAnimator;

    new-instance v4, Lcom/shopkick/app/kicksCenter/-$$Lambda$KicksCenterScreen$UakxjLR4LybpPXG6XBobeFperKw;

    invoke-direct {v4, p0}, Lcom/shopkick/app/kicksCenter/-$$Lambda$KicksCenterScreen$UakxjLR4LybpPXG6XBobeFperKw;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    invoke-virtual {v0, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 357
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->glowAnimation:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    .line 358
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->glowAnimation:Landroid/animation/ValueAnimator;

    const-wide/16 v3, 0x320

    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 359
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->glowAnimation:Landroid/animation/ValueAnimator;

    const/4 v3, -0x1

    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 360
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->glowAnimation:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 364
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v0}, Lcom/shopkick/app/points/ProfilePoints;->getEscrowCoins()I

    move-result v0

    if-lez v0, :cond_1

    .line 366
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksActivitySectionWithPending:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 367
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksActivityPendingKicksText:Landroid/widget/TextView;

    const v3, 0x7f1103a3

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 368
    invoke-virtual {v4}, Lcom/shopkick/app/points/ProfilePoints;->getEscrowCoins()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v2

    .line 367
    invoke-virtual {p0, v3, v1}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 371
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksActivitySectionWithoutPending:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 376
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->bottomSectionWithoutActivity:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private updateRewardsMallUi()V
    .locals 5

    .line 446
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardsDataController;->isRewardsDataReady()Z

    move-result v0

    if-nez v0, :cond_0

    .line 448
    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {v1}, Lcom/shopkick/app/rewards/RewardsDataController;->fetchRewardsMallData()V

    .line 451
    :cond_0
    iget-boolean v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->usingBottomSectionWithActivity:Z

    if-eqz v1, :cond_2

    if-nez v0, :cond_1

    .line 457
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->rewardsMallCount:Landroid/widget/TextView;

    const v1, 0x7f11039a

    invoke-virtual {p0, v1}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 460
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardsDataController;->getFeaturedRewardIds()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    .line 461
    invoke-virtual {v1}, Lcom/shopkick/app/rewards/RewardsDataController;->getNonFeaturedRewardsCount()I

    move-result v1

    add-int/2addr v0, v1

    .line 462
    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->rewardsMallCount:Landroid/widget/TextView;

    const v2, 0x7f110399

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    .line 463
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    .line 462
    invoke-virtual {p0, v2, v3}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    const/4 p3, 0x0

    const v0, 0x7f0c0106

    .line 145
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0903d4

    .line 148
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    .line 149
    new-instance v0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;

    invoke-direct {v0, p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/high16 v0, 0x41a00000    # 20.0f

    .line 150
    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setWidthToTextWidth(F)V

    const p2, 0x7f090665

    .line 153
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/logging/UserEventImageView;

    const/16 v0, 0x3f

    .line 154
    invoke-direct {p0, p2, v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->setUpLogging(Lcom/shopkick/app/logging/IUserEventView;I)V

    .line 155
    new-instance v0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;

    invoke-direct {v0, p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090664

    .line 157
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->selectedRewardDenominationTextView:Lcom/shopkick/app/widget/SKTextView;

    const p2, 0x7f0901d6

    .line 159
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    .line 160
    new-instance v0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;

    invoke-direct {v0, p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f09037d

    .line 162
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    const/16 v0, 0x7c

    .line 163
    invoke-direct {p0, p2, v0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->setUpLogging(Lcom/shopkick/app/logging/IUserEventView;I)V

    .line 164
    new-instance v0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;

    invoke-direct {v0, p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0903bb

    .line 167
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksAmount:Landroid/widget/TextView;

    const p2, 0x7f0903d8

    .line 168
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksUnit:Landroid/widget/TextView;

    const p2, 0x7f0903d3

    .line 170
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/RelativeLayout;

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenter:Landroid/widget/RelativeLayout;

    .line 172
    iget-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenter:Landroid/widget/RelativeLayout;

    const v0, 0x7f0903d7

    invoke-virtual {p2, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout;

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterToast:Landroid/widget/FrameLayout;

    .line 173
    iget-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterToast:Landroid/widget/FrameLayout;

    const v0, 0x7f090375

    invoke-virtual {p2, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterToastBodyText:Landroid/widget/TextView;

    const p2, 0x7f0903bd

    .line 175
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->bottomSectionWithActivity:Landroid/view/View;

    const p2, 0x7f0903be

    .line 176
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->bottomSectionWithoutActivity:Landroid/view/View;

    .line 179
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->updateBottomSectionUiState()V

    const p2, 0x7f090379

    .line 182
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterToastLeftButton:Lcom/shopkick/app/widget/SKButton;

    .line 183
    iget-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterToastLeftButton:Lcom/shopkick/app/widget/SKButton;

    new-instance v0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;

    invoke-direct {v0, p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f09037a

    .line 185
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterToastRightButton:Lcom/shopkick/app/widget/SKButton;

    .line 186
    iget-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterToastRightButton:Lcom/shopkick/app/widget/SKButton;

    new-instance v0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;

    invoke-direct {v0, p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090374

    .line 188
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout;

    .line 189
    new-instance v0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;

    invoke-direct {v0, p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    invoke-virtual {p2, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090376

    .line 192
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout;

    .line 193
    new-instance v0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;

    invoke-direct {v0, p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    invoke-virtual {p2, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f09037b

    .line 197
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    .line 198
    new-instance v0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;

    invoke-direct {v0, p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen$KicksCenterButtonClick;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterScreen;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 201
    new-instance p2, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;

    invoke-virtual {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenter:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    iget-object v3, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-direct {p2, v0, v1, v2, v3}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;-><init>(Landroid/content/Context;Landroid/widget/RelativeLayout;Lcom/shopkick/app/points/ProfilePoints;Lcom/shopkick/app/application/AppPreferences;)V

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterWidgetController:Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;

    .line 206
    iget-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "UNUSED_REWARDS_FROM_OFFLINE_DATA_STORE_UPDATED"

    invoke-virtual {p2, p0, v0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 207
    iget-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "ProfilePointsChangedEvent"

    invoke-virtual {p2, p0, v0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 208
    iget-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "rewards_reload_completed"

    invoke-virtual {p2, p0, v0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 209
    iget-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "UserAccountIdChangedEvent"

    invoke-virtual {p2, p0, v0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 210
    iget-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "SelectedRewardIdUpdated"

    invoke-virtual {p2, p0, v0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 212
    iget-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {p2}, Lcom/shopkick/app/rewards/RewardsDataController;->isRewardsDataReady()Z

    move-result p2

    if-nez p2, :cond_0

    .line 213
    iget-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {p2}, Lcom/shopkick/app/rewards/RewardsDataController;->fetchRewardsMallData()V

    :cond_0
    const/4 p2, 0x0

    .line 216
    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->lastDisplayedRewardId:Ljava/lang/String;

    const/4 p2, 0x1

    .line 217
    iput-boolean p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->animateNextTime:Z

    return-object p1
.end method

.method displayToast()V
    .locals 6

    .line 528
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterToast:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 529
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterWidgetController:Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;

    iget-object v2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->selectedReward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->populateReward(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V

    .line 530
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->selectedReward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailScreenDetails:Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;->detailTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, "paypal"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 531
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterToastBodyText:Landroid/widget/TextView;

    const v3, 0x7f110393

    new-array v4, v2, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->selectedReward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailScreenDetails:Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;->detailTitle:Ljava/lang/String;

    aput-object v5, v4, v1

    invoke-virtual {p0, v3, v4}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 533
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterToastLeftButton:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x7f110391

    .line 534
    invoke-virtual {p0, v1}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 533
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 535
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterToastRightButton:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x7f110394

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    goto :goto_0

    .line 538
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterToastBodyText:Landroid/widget/TextView;

    const v3, 0x7f110390

    new-array v4, v2, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->selectedReward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailScreenDetails:Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;->detailTitle:Ljava/lang/String;

    aput-object v5, v4, v1

    invoke-virtual {p0, v3, v4}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 540
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterToastLeftButton:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x7f110392

    .line 541
    invoke-virtual {p0, v1}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 540
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 542
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterToastRightButton:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x7f110395

    .line 543
    invoke-virtual {p0, v1}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 542
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 545
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/application/AppPreferences;->setShownKicksCenterToast(Z)V

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

    .line 124
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 125
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 126
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    .line 127
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    .line 128
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 129
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const-string p2, "0"

    .line 130
    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->rewardsCountToDisplay:Ljava/lang/String;

    .line 131
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 560
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->redeemedRewardImage:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 561
    invoke-static {p0, v0}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/support/v4/app/Fragment;Landroid/view/View;)V

    .line 563
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 564
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 565
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

    .line 255
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const/4 v0, 0x0

    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string p2, "ProfilePointsChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_1

    :sswitch_1
    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_1

    :sswitch_2
    const-string p2, "SelectedRewardIdUpdated"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_1

    :sswitch_3
    const-string p2, "UNUSED_REWARDS_FROM_OFFLINE_DATA_STORE_UPDATED"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_1

    :sswitch_4
    const-string p2, "rewards_reload_completed"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 270
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setShownKicksCenterToast(Z)V

    goto :goto_2

    .line 264
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksCenterWidgetController:Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;

    invoke-virtual {p1}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->maybeClearToastFlag()V

    .line 265
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->refreshKicks()V

    .line 266
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->animateWidget()V

    goto :goto_2

    .line 261
    :pswitch_2
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->displayRewardLinks()V

    goto :goto_2

    .line 257
    :pswitch_3
    iget-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    invoke-virtual {p1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getRewardsCountToDisplay()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->rewardsCountToDisplay:Ljava/lang/String;

    .line 258
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->displayRewardLinks()V

    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x783e8120 -> :sswitch_4
        -0x3f4419ab -> :sswitch_3
        -0x7894f8a -> :sswitch_2
        0x44e6563 -> :sswitch_1
        0x783d1232 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onScreenDidShow()V
    .locals 0

    .line 242
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->animateWidget()V

    return-void
.end method

.method public onScreenWillHide()V
    .locals 2

    .line 247
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->glowAnimation:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 248
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->kicksActivityArea:Landroid/view/View;

    const v1, 0x7f060139

    invoke-virtual {p0, v1}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->getResourceColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 249
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->glowAnimation:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    return-void
.end method

.method public onScreenWillShow()V
    .locals 2

    .line 225
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->params:Ljava/util/Map;

    const-string v1, "SHOULD_ANIMATE_KICKS_ACTIVITY"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->shouldAnimateKicksActivity:Z

    .line 227
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getRewardsCountToDisplay()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->rewardsCountToDisplay:Ljava/lang/String;

    .line 229
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->refreshKicks()V

    .line 231
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->displayCurrentReward()V

    .line 234
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->displayRewardLinks()V

    .line 237
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->updateKicksActivityUI()V

    return-void
.end method

.method public shouldDisplayAppScreenHeader()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shouldHideBack()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 136
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    if-eqz v0, :cond_0

    .line 139
    invoke-virtual {v0}, Lcom/shopkick/app/points/ProfilePoints;->getEscrowCoins()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCount(Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method
