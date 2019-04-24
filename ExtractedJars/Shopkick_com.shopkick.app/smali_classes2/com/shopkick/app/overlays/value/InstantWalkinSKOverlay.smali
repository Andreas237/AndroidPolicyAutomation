.class public Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;
.super Lcom/shopkick/app/overlays/common/AwardSKOverlay;
.source "InstantWalkinSKOverlay.java"

# interfaces
.implements Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;


# static fields
.field public static final CHECKMARK_ANIMATION_FINISHED:Ljava/lang/String; = "CHECKMARK_ANIMATION_FINISHED"

.field private static final CHECKMARK_BACKGROUND_FADE_DELAY:I = 0x1f4

.field private static final CHECKMARK_BACKGROUND_FADE_DURATION:I = 0xc8

.field public static final POINTS_EARNED_KEY:Ljava/lang/String; = "POINTS_EARNED_KEY"

.field private static final START_BALL_ENTER_DELAY:I = 0x190

.field public static final WALKIN_FINISHED_OFFLINE:Ljava/lang/String; = "WALKIN_FINISHED_OFFLINE"

.field public static final WALKIN_FINISHED_WITH_ERROR:Ljava/lang/String; = "WALKIN_FINISHED_WITH_ERROR"


# instance fields
.field private awardStoreLogoUrl:Ljava/lang/String;

.field private ballDisplayed:Z

.field private context:Landroid/content/Context;

.field private errMsg:Ljava/lang/String;

.field private extraWalkinMsg:Ljava/lang/String;

.field private hasUpdated:Z

.field private isFailure:Z

.field private isOnline:Z

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private presenceCode:Ljava/lang/String;

.field private showBubble:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/AwardSKOverlay;-><init>()V

    const/4 v0, 0x0

    .line 45
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->hasUpdated:Z

    .line 47
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->isFailure:Z

    .line 123
    new-instance v0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay$1;-><init>(Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;)V

    iput-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->showBubble:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;)Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    return-object p0
.end method

.method static synthetic access$102(Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;Z)Z
    .locals 0

    .line 28
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->ballDisplayed:Z

    return p1
.end method

.method private showFailure(Ljava/lang/String;)V
    .locals 5

    .line 175
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->failureBall:Landroid/widget/RelativeLayout;

    const v1, 0x7f0901d5

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    const v1, 0x7f090479

    .line 176
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f090476

    .line 177
    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 179
    iget-object v3, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f110155

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_0

    .line 181
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 183
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->context:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f11075c

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    const/4 p1, 0x0

    .line 185
    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 186
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->setupFailureWalkinFlip()V

    const/4 p1, 0x1

    .line 187
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->isFailure:Z

    return-void
.end method

.method private showNoReceptionFailure()V
    .locals 2

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->failureBall:Landroid/widget/RelativeLayout;

    const v1, 0x7f0904ac

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->setupFailureWalkinFlip()V

    return-void
.end method

.method private showWelcome(Landroid/content/Context;)V
    .locals 5

    .line 116
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->firstName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->firstName:Ljava/lang/String;

    goto :goto_0

    .line 117
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f110254

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 118
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->nameText:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f11075f

    .line 119
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    .line 118
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    const v1, 0x7f100006

    invoke-virtual {v0, p1, v1}, Lcom/shopkick/app/sounds/SoundManager;->play(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 1

    .line 74
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->presenceCode:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->presenceCode:Ljava/lang/String;

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardStoreLogo:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->awardStoreLogoUrl:Ljava/lang/String;

    .line 78
    iput-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->context:Landroid/content/Context;

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->setCallback(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;)V

    .line 81
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardStoreLogo:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 82
    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardStoreLogo:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->storeLogo:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 85
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public destroy()V
    .locals 5

    .line 61
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "InstantWalkinSKOverlay destroyed. If this line happens before "

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->showBubble:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 63
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->storeLogo:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/content/Context;Landroid/view/View;)V

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 65
    iput-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->awards:Ljava/util/List;

    .line 66
    iput-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->errMsg:Ljava/lang/String;

    .line 67
    iput-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->extraWalkinMsg:Ljava/lang/String;

    .line 69
    invoke-super {p0}, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->destroy()V

    return-void
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 55
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 56
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->logger:Lcom/shopkick/app/application/SKLogger;

    return-void
.end method

.method public onCheckmarkAnimatingOut()V
    .locals 3

    .line 219
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0x1f4

    .line 220
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setStartOffset(J)V

    const-wide/16 v1, 0xc8

    .line 221
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 222
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    const/4 v1, 0x1

    .line 223
    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 224
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public onCheckmarkAnimationFinished()V
    .locals 3

    .line 229
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "POINTS_EARNED_KEY"

    .line 230
    iget-object v2, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDelta:Ljava/lang/Integer;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "CHECKMARK_ANIMATION_FINISHED"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void
.end method

.method public onInitialGreetingShown()V
    .locals 2

    .line 195
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->enableFacebookPostWalkinFeatureIfNeeded()V

    .line 196
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->extraWalkinMsg:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 197
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->extraWalkinView:Landroid/widget/RelativeLayout;

    const v1, 0x7f09026d

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 198
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->extraWalkinMsg:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 199
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->extraWalkinView:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 200
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->setupExtraWalkinMsg()V

    :cond_0
    return-void
.end method

.method public onKicksShown()V
    .locals 1

    .line 206
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->isOnline:Z

    if-eqz v0, :cond_0

    .line 207
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->awards:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->setupSuccessfulWalkinFlip()V

    :cond_0
    return-void
.end method

.method public onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 4

    .line 90
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 91
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->ballDisplayed:Z

    if-nez v0, :cond_0

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->showBubble:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 95
    :cond_0
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awards:Ljava/util/List;

    iput-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->awards:Ljava/util/List;

    .line 96
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardIsOnline:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->isOnline:Z

    .line 97
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardErrorMessage:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->errMsg:Ljava/lang/String;

    .line 98
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardExtraMessage:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->extraWalkinMsg:Ljava/lang/String;

    .line 100
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x7a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 101
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->presenceCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPresenceCode(Ljava/lang/String;)V

    .line 102
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 104
    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->showWelcome(Landroid/content/Context;)V

    .line 106
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->showBubble:Ljava/lang/Runnable;

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 107
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardOverlayState:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 108
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f11075b

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->showFailure(Ljava/lang/String;)V

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->serverReached(Z)V

    goto :goto_0

    .line 110
    :cond_1
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardOverlayState:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 111
    invoke-virtual {p0, p1}, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->onOverlayUpdated(Landroid/content/Context;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onOverlayUpdated(Landroid/content/Context;)V
    .locals 3

    .line 133
    iget-boolean p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->hasUpdated:Z

    if-eqz p1, :cond_0

    return-void

    .line 137
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awards:Ljava/util/List;

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->awards:Ljava/util/List;

    .line 138
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardIsOnline:Ljava/lang/Boolean;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->isOnline:Z

    .line 139
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardErrorMessage:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->errMsg:Ljava/lang/String;

    .line 140
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardExtraMessage:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->extraWalkinMsg:Ljava/lang/String;

    .line 142
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    iget-object v2, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 143
    invoke-virtual {v2}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/rewards/RewardsDataController;->getReward(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v1

    .line 142
    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->setupRewardsView(Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V

    .line 145
    iget-boolean p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->isOnline:Z

    if-nez p1, :cond_1

    .line 146
    invoke-direct {p0}, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->showNoReceptionFailure()V

    goto :goto_0

    .line 147
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->awards:Ljava/util/List;

    if-nez p1, :cond_2

    .line 148
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->errMsg:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->showFailure(Ljava/lang/String;)V

    .line 151
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    iget-boolean v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->isOnline:Z

    invoke-virtual {p1, v0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->serverReached(Z)V

    const/4 p1, 0x1

    .line 153
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->hasUpdated:Z

    .line 154
    iget-boolean p1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->isOnline:Z

    if-eqz p1, :cond_3

    .line 155
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->updateOnlineDisplay()V

    :cond_3
    return-void
.end method

.method public onRewardsShown()V
    .locals 0

    return-void
.end method

.method public onWalkinFinished()V
    .locals 2

    .line 237
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->isFailure:Z

    if-eqz v0, :cond_0

    .line 238
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "WALKIN_FINISHED_WITH_ERROR"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_0

    .line 239
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->isOnline:Z

    if-nez v0, :cond_1

    .line 240
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "WALKIN_FINISHED_OFFLINE"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 242
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->dismiss()V

    return-void
.end method

.method public updateOnlineDisplay()V
    .locals 2

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->awards:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->awards:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 161
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x7c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 162
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->presenceCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPresenceCode(Ljava/lang/String;)V

    .line 163
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 165
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->awards:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;->setupAwardCountAndLogo(Ljava/util/List;)V

    :cond_0
    return-void
.end method
