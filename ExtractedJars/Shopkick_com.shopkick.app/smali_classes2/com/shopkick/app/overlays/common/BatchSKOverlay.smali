.class public Lcom/shopkick/app/overlays/common/BatchSKOverlay;
.super Lcom/shopkick/app/overlays/common/AwardSKOverlay;
.source "BatchSKOverlay.java"

# interfaces
.implements Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;


# instance fields
.field private extraWalkinMsg:Ljava/lang/String;

.field private logger:Lcom/shopkick/app/application/SKLogger;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/AwardSKOverlay;-><init>()V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 0

    .line 40
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    .line 42
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->setCallback(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;)V

    .line 43
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardExtraMessage:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->extraWalkinMsg:Ljava/lang/String;

    .line 46
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->awards:Ljava/util/List;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->awards:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    .line 47
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->awards:Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->setupAwardCountAndLogo(Ljava/util/List;)V

    .line 50
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 27
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 28
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iput-object p1, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->logger:Lcom/shopkick/app/application/SKLogger;

    return-void
.end method

.method public onCheckmarkAnimatingOut()V
    .locals 0

    return-void
.end method

.method public onCheckmarkAnimationFinished()V
    .locals 0

    return-void
.end method

.method public onInitialGreetingShown()V
    .locals 2

    .line 81
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->enableFacebookPostWalkinFeatureIfNeeded()V

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->extraWalkinMsg:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->extraWalkinView:Landroid/widget/RelativeLayout;

    const v1, 0x7f09026d

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 84
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->extraWalkinMsg:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->extraWalkinView:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 86
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->setupExtraWalkinMsg()V

    :cond_0
    return-void
.end method

.method public onKicksShown()V
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->setupSuccessfulWalkinFlip()V

    return-void
.end method

.method public onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 4

    .line 55
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 56
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->awards:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->awards:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 57
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x7c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 58
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 61
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v2, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    iget-object v3, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 62
    invoke-virtual {v3}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/shopkick/app/rewards/RewardsDataController;->getReward(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v2

    .line 61
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->setupRewardsView(Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->serverReached(Z)V

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    const v1, 0x7f100006

    invoke-virtual {v0, p1, v1}, Lcom/shopkick/app/sounds/SoundManager;->play(Landroid/content/Context;I)V

    .line 66
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    .line 67
    iget-object p2, p0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->handler:Landroid/os/Handler;

    new-instance v0, Lcom/shopkick/app/overlays/common/BatchSKOverlay$1;

    invoke-direct {v0, p0, p1}, Lcom/shopkick/app/overlays/common/BatchSKOverlay$1;-><init>(Lcom/shopkick/app/overlays/common/BatchSKOverlay;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onRewardsShown()V
    .locals 0

    return-void
.end method

.method public onWalkinFinished()V
    .locals 0

    .line 109
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/common/BatchSKOverlay;->dismiss()V

    return-void
.end method
