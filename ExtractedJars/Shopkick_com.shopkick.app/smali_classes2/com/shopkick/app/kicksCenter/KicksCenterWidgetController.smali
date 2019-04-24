.class public Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;
.super Ljava/lang/Object;
.source "KicksCenterWidgetController.java"


# static fields
.field private static final DEFAULT_REWARD_COST_IN_KICKS:I = 0x4e2


# instance fields
.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private changeRewardButton:Lcom/shopkick/app/widget/SKButton;

.field private context:Landroid/content/Context;

.field private defaultNoRewardImage:Landroid/widget/ImageView;

.field private kicksCenter:Landroid/widget/RelativeLayout;

.field private kicksCenterToast:Landroid/widget/FrameLayout;

.field private kicksUntilRewardCount:Landroid/widget/TextView;

.field private kicksUntilRewardUnit:Landroid/widget/TextView;

.field private profilePoints:Lcom/shopkick/app/points/ProfilePoints;

.field private progressBar:Landroid/widget/ProgressBar;

.field private rewardCostInKicks:I

.field private rewardImage:Landroid/widget/ImageView;

.field private selectedRewardInfo:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/widget/RelativeLayout;Lcom/shopkick/app/points/ProfilePoints;Lcom/shopkick/app/application/AppPreferences;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->context:Landroid/content/Context;

    .line 54
    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->kicksCenter:Landroid/widget/RelativeLayout;

    .line 55
    iput-object p3, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 56
    iput-object p4, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const p1, 0x7f0905db

    .line 58
    invoke-virtual {p2, p1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->progressBar:Landroid/widget/ProgressBar;

    .line 59
    iget-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->progressBar:Landroid/widget/ProgressBar;

    const/16 p3, 0x64

    invoke-virtual {p1, p3}, Landroid/widget/ProgressBar;->setMax(I)V

    const p1, 0x7f0901d6

    .line 61
    invoke-virtual {p2, p1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->defaultNoRewardImage:Landroid/widget/ImageView;

    const p1, 0x7f090666

    .line 62
    invoke-virtual {p2, p1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->selectedRewardInfo:Landroid/widget/RelativeLayout;

    const p1, 0x7f090380

    .line 63
    invoke-virtual {p2, p1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->kicksUntilRewardCount:Landroid/widget/TextView;

    const p1, 0x7f090381

    .line 64
    invoke-virtual {p2, p1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->kicksUntilRewardUnit:Landroid/widget/TextView;

    const p1, 0x7f09037d

    .line 65
    invoke-virtual {p2, p1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    iput-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->changeRewardButton:Lcom/shopkick/app/widget/SKButton;

    const p1, 0x7f0903d7

    .line 66
    invoke-virtual {p2, p1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->kicksCenterToast:Landroid/widget/FrameLayout;

    const p1, 0x7f090665

    .line 67
    invoke-virtual {p2, p1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->rewardImage:Landroid/widget/ImageView;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->showSelectedRewardInfo()V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;)Landroid/widget/FrameLayout;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->kicksCenterToast:Landroid/widget/FrameLayout;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;)Landroid/content/Context;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->context:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic lambda$startProgressAnim$115(Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;)V
    .locals 1

    const/4 v0, 0x1

    .line 122
    invoke-virtual {p0, v0}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->showRewardProgress(Z)V

    return-void
.end method

.method private showDefaultNoRewardImage()V
    .locals 2

    .line 163
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->defaultNoRewardImage:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->selectedRewardInfo:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 165
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->changeRewardButton:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x7f1103a4

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    return-void
.end method

.method private showSelectedRewardInfo()V
    .locals 2

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->defaultNoRewardImage:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->selectedRewardInfo:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->changeRewardButton:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x7f11039b

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    return-void
.end method


# virtual methods
.method protected clearRewardProgress()V
    .locals 2

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->progressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    return-void
.end method

.method public displayRewardImage(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;Ljava/lang/Long;)V
    .locals 2

    const/16 v0, 0x4e2

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 74
    invoke-virtual {p2}, Ljava/lang/Long;->intValue()I

    move-result p2

    iput p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->rewardCostInKicks:I

    goto :goto_0

    .line 77
    :cond_0
    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardsDataController;->getRewardCostInKicks(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)I

    move-result p2

    iput p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->rewardCostInKicks:I

    goto :goto_0

    .line 80
    :cond_1
    iput v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->rewardCostInKicks:I

    .line 83
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->showDefaultNoRewardImage()V

    .line 86
    iget p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->rewardCostInKicks:I

    const v1, 0x7fffffff

    if-ne p2, v1, :cond_2

    .line 87
    iput v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->rewardCostInKicks:I

    :cond_2
    if-eqz p1, :cond_3

    .line 91
    invoke-virtual {p0, p1}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->populateReward(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V

    .line 94
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->kicksUntilRewardCount:Landroid/widget/TextView;

    iget p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->rewardCostInKicks:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    iget-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->kicksUntilRewardUnit:Landroid/widget/TextView;

    iget-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->context:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f0f000e

    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 97
    invoke-virtual {v1}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v1

    .line 96
    invoke-virtual {p2, v0, v1}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object p2

    .line 95
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public maybeClearToastFlag()V
    .locals 2

    .line 155
    iget v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->rewardCostInKicks:I

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v0}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v0

    iget v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->rewardCostInKicks:I

    if-ge v0, v1, :cond_0

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setShownKicksCenterToast(Z)V

    :cond_0
    return-void
.end method

.method public populateReward(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 101
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->thumbnailImageUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 102
    new-instance v0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController$1;

    invoke-direct {v0, p0, p1}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController$1;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V

    .line 117
    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->context:Landroid/content/Context;

    invoke-static {v1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->thumbnailImageUrl:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->rewardImage:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_0
    return-void
.end method

.method public shouldDisplayToast()Z
    .locals 3

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getShownKicksCenterToast()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 151
    :cond_0
    iget v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->rewardCostInKicks:I

    const v2, 0x7fffffff

    if-eq v0, v2, :cond_1

    iget-object v2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v2, v0}, Lcom/shopkick/app/points/ProfilePoints;->getCurrentProgress(I)I

    move-result v0

    const/16 v2, 0x64

    if-ne v0, v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method protected showRewardProgress(Z)V
    .locals 2

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    iget v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->rewardCostInKicks:I

    invoke-virtual {v0, v1}, Lcom/shopkick/app/points/ProfilePoints;->getCurrentProgress(I)I

    move-result v0

    if-nez p1, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    if-eqz p1, :cond_1

    .line 136
    new-instance p1, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;

    iget-object v1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->progressBar:Landroid/widget/ProgressBar;

    invoke-direct {p1, v1}, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;-><init>(Landroid/widget/ProgressBar;)V

    const/4 v1, 0x0

    .line 137
    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;->moveProgress(II)V

    goto :goto_0

    .line 139
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    :goto_0
    return-void
.end method

.method protected startProgressAnim()V
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->kicksCenter:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/shopkick/app/kicksCenter/-$$Lambda$KicksCenterWidgetController$C5FpVUEqea_4RGzqfY61dUY1zf8;

    invoke-direct {v1, p0}, Lcom/shopkick/app/kicksCenter/-$$Lambda$KicksCenterWidgetController$C5FpVUEqea_4RGzqfY61dUY1zf8;-><init>(Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
