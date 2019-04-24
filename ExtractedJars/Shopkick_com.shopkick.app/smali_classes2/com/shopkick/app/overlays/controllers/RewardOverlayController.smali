.class public Lcom/shopkick/app/overlays/controllers/RewardOverlayController;
.super Ljava/lang/Object;
.source "RewardOverlayController.java"


# static fields
.field private static final DEFAULT_REWARD_COST_IN_KICKS:I = 0x4e2


# instance fields
.field private contentView:Landroid/widget/RelativeLayout;

.field private context:Landroid/content/Context;

.field private defaultNoRewardImage:Landroid/widget/ImageView;

.field private imageReceived:Z

.field private pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

.field private profilePoints:Lcom/shopkick/app/points/ProfilePoints;

.field private rewardCostInKicks:I

.field private selectedRewardInfo:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/points/ProfilePoints;Landroid/widget/RelativeLayout;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p2, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 54
    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->context:Landroid/content/Context;

    .line 55
    iput-object p3, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->contentView:Landroid/widget/RelativeLayout;

    const/4 p1, 0x0

    .line 56
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->imageReceived:Z

    const p1, 0x7f0901d6

    .line 57
    invoke-virtual {p3, p1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->defaultNoRewardImage:Landroid/widget/ImageView;

    const p1, 0x7f090666

    .line 58
    invoke-virtual {p3, p1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->selectedRewardInfo:Landroid/widget/RelativeLayout;

    return-void
.end method

.method static synthetic access$002(Lcom/shopkick/app/overlays/controllers/RewardOverlayController;Z)Z
    .locals 0

    .line 24
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->imageReceived:Z

    return p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/overlays/controllers/RewardOverlayController;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->showSelectedRewardInfo()V

    return-void
.end method

.method private populateReward(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V
    .locals 3

    .line 83
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->thumbnailImageUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->contentView:Landroid/widget/RelativeLayout;

    const v1, 0x7f0905d3

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 85
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailScreenDetails:Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;->detailTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->contentView:Landroid/widget/RelativeLayout;

    const v1, 0x7f0905d2

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 87
    new-instance v1, Lcom/shopkick/app/overlays/controllers/RewardOverlayController$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/controllers/RewardOverlayController$1;-><init>(Lcom/shopkick/app/overlays/controllers/RewardOverlayController;)V

    .line 100
    iget-object v2, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->context:Landroid/content/Context;

    invoke-static {v2}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v2

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->thumbnailImageUrl:Ljava/lang/String;

    invoke-virtual {v2, p1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_0
    return-void
.end method

.method private showDefaultNoRewardImage()V
    .locals 2

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->defaultNoRewardImage:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->selectedRewardInfo:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    return-void
.end method

.method private showSelectedRewardInfo()V
    .locals 2

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->defaultNoRewardImage:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->selectedRewardInfo:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public calculateProgress()V
    .locals 5

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->contentView:Landroid/widget/RelativeLayout;

    const v1, 0x7f0905d1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    const/16 v1, 0x64

    .line 106
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 107
    new-instance v1, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;

    invoke-direct {v1, v0}, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;-><init>(Landroid/widget/ProgressBar;)V

    .line 109
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    iget v2, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->rewardCostInKicks:I

    invoke-virtual {v0, v2}, Lcom/shopkick/app/points/ProfilePoints;->getCurrentProgress(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/points/ProfilePoints;->roundProgress(I)I

    move-result v0

    .line 111
    iget-object v2, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsBalance:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget v4, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->rewardCostInKicks:I

    invoke-virtual {v0, v2, v4}, Lcom/shopkick/app/points/ProfilePoints;->getProgress(II)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/points/ProfilePoints;->roundProgress(I)I

    move-result v0

    .line 114
    invoke-virtual {v1, v3, v0}, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;->moveProgress(II)V

    goto :goto_0

    .line 116
    :cond_0
    invoke-virtual {v1, v3, v0}, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;->moveProgress(II)V

    :goto_0
    return-void
.end method

.method public destroy()V
    .locals 2

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->contentView:Landroid/widget/RelativeLayout;

    const v1, 0x7f0905d2

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 63
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->context:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/content/Context;Landroid/view/View;)V

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->context:Landroid/content/Context;

    return-void
.end method

.method public isImageReceived()Z
    .locals 1

    .line 122
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->imageReceived:Z

    return v0
.end method

.method public setupView(Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V
    .locals 1

    .line 71
    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    const/16 p1, 0x4e2

    .line 72
    iput p1, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->rewardCostInKicks:I

    if-eqz p2, :cond_0

    .line 74
    invoke-static {p2}, Lcom/shopkick/app/rewards/RewardsDataController;->getRewardCostInKicks(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->rewardCostInKicks:I

    .line 76
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->showDefaultNoRewardImage()V

    if-eqz p2, :cond_1

    .line 77
    iget p1, p0, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->rewardCostInKicks:I

    const v0, 0x7fffffff

    if-eq p1, v0, :cond_1

    .line 78
    invoke-direct {p0, p2}, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->populateReward(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V

    :cond_1
    return-void
.end method
