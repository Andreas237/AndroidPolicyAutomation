.class public Lcom/shopkick/app/overlays/common/BallSKOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "BallSKOverlay.java"

# interfaces
.implements Lcom/shopkick/app/url/IURLDispatcherFinishedCallback;
.implements Lcom/shopkick/app/overlays/controllers/ScanAnimationController$IScanAnimationControllerCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/overlays/common/BallSKOverlay$PostToFacebookClick;,
        Lcom/shopkick/app/overlays/common/BallSKOverlay$PauseCompleteRunnable;,
        Lcom/shopkick/app/overlays/common/BallSKOverlay$BallAnimationListener;
    }
.end annotation


# static fields
.field private static final BALL_ELEMENT_IDS:[I

.field private static final BALL_EXIT_DURATION:I = 0x1f4

.field private static final BALL_PULSE_IN_DURATION:I = 0x64

.field private static final BALL_PULSE_MAX_SCALE_FACTOR:F = 1.06f

.field private static final BALL_PULSE_MIN_SCALE_FACTOR:F = 0.0f

.field private static final BALL_PULSE_OUT_DURATION:I = 0x12c

.field public static final EVENT_M_COMMERCE_BUBBLE_FINISHED:Ljava/lang/String; = "eventMCommerceBubbleFinished"

.field private static final LOG_TAG:Ljava/lang/String; = "BallSKOverlay"

.field public static MILLIS_TO_PAUSE:J = 0x0L

.field private static final SHOULD_PLAY_SOUND:Z = true

.field private static final TOTAL_KICKS_BAR_FADE_IN_DURATION:I = 0x190

.field private static final TOTAL_KICKS_BAR_FADE_OUT_DURATION:I = 0x1f4


# instance fields
.field private animations:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/animation/Animation;",
            ">;"
        }
    .end annotation
.end field

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private context:Landroid/content/Context;

.field private destroyed:Z

.field private enterAnimation:Landroid/view/animation/AnimationSet;

.field private exitAnimation:Landroid/view/animation/Animation;

.field private handler:Landroid/os/Handler;

.field private iconView:Landroid/widget/ImageView;

.field private mainView:Landroid/view/ViewGroup;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private pauseCompleteRunnable:Ljava/lang/Runnable;

.field private savedTapToDismissValue:Z

.field private scanAnimationController:Lcom/shopkick/app/overlays/controllers/ScanAnimationController;

.field private soundManager:Lcom/shopkick/app/sounds/SoundManager;

.field private totalKicksBarShown:Z

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private viewBuilder:Lcom/shopkick/app/util/ViewBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x2

    .line 53
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->BALL_ELEMENT_IDS:[I

    const-wide/16 v0, 0x7d0

    .line 56
    sput-wide v0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->MILLIS_TO_PAUSE:J

    return-void

    nop

    :array_0
    .array-data 4
        0x7f090060
        0x7f09026b
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 47
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->animations:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 72
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->enterAnimation:Landroid/view/animation/AnimationSet;

    .line 73
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->exitAnimation:Landroid/view/animation/Animation;

    .line 77
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    .line 78
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    .line 79
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 86
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    .line 87
    iput-boolean v1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->destroyed:Z

    .line 88
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->pauseCompleteRunnable:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/common/BallSKOverlay;Landroid/view/animation/Animation;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->onAnimationEndBall(Landroid/view/animation/Animation;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/overlays/common/BallSKOverlay;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->onPauseCompleted()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/overlays/common/BallSKOverlay;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->cancelPauseCompleteRunnable()V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/app/overlays/common/BallSKOverlay;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->handlePostToFacebookClick()V

    return-void
.end method

.method private animateKicksBarOut()V
    .locals 4

    const/4 v0, 0x0

    .line 393
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->totalKicksBarShown:Z

    .line 394
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f0907a5

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 395
    new-instance v1, Landroid/view/animation/AlphaAnimation;

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v2, 0x1f4

    .line 396
    invoke-virtual {v1, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    const/4 v2, 0x1

    .line 397
    invoke-virtual {v1, v2}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 398
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private animateRegularExit()V
    .locals 9

    .line 379
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09005c

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 380
    new-instance v8, Landroid/view/animation/ScaleAnimation;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v6, v1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v7, v0

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V

    iput-object v8, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->exitAnimation:Landroid/view/animation/Animation;

    .line 381
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->exitAnimation:Landroid/view/animation/Animation;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 382
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->exitAnimation:Landroid/view/animation/Animation;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 383
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->exitAnimation:Landroid/view/animation/Animation;

    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 384
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->exitAnimation:Landroid/view/animation/Animation;

    new-instance v1, Lcom/shopkick/app/overlays/common/BallSKOverlay$BallAnimationListener;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay$BallAnimationListener;-><init>(Lcom/shopkick/app/overlays/common/BallSKOverlay;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 385
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->getBallView()Landroid/widget/RelativeLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->exitAnimation:Landroid/view/animation/Animation;

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->startAnimation(Landroid/view/View;Landroid/view/animation/Animation;)V

    .line 386
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->totalKicksBarShown:Z

    if-eqz v0, :cond_0

    .line 387
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->animateKicksBarOut()V

    :cond_0
    const v0, 0x7f10000d

    .line 389
    invoke-direct {p0, v0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->playSound(I)V

    return-void
.end method

.method private cancelAllAnimations()V
    .locals 2

    .line 243
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->animations:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 244
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/animation/Animation;

    .line 245
    invoke-virtual {v1}, Landroid/view/animation/Animation;->cancel()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 247
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->animations:Ljava/util/ArrayList;

    .line 248
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->enterAnimation:Landroid/view/animation/AnimationSet;

    .line 249
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->exitAnimation:Landroid/view/animation/Animation;

    :cond_1
    return-void
.end method

.method private cancelPauseCompleteRunnable()V
    .locals 2

    .line 280
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->destroyed:Z

    if-eqz v0, :cond_0

    return-void

    .line 284
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->pauseCompleteRunnable:Ljava/lang/Runnable;

    if-nez v0, :cond_1

    return-void

    .line 288
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 289
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->pauseCompleteRunnable:Ljava/lang/Runnable;

    return-void
.end method

.method private getBallView()Landroid/widget/RelativeLayout;
    .locals 2

    .line 451
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09005c

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private getImageView(I)Landroid/widget/ImageView;
    .locals 1

    .line 455
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    return-object p1
.end method

.method private getMainImageView()Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f09005b

    .line 467
    invoke-direct {p0, v0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    return-object v0
.end method

.method public static getPreloadUrlsFromOverlaySpec(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 526
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 527
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->ballViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->ballViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;->views:Ljava/util/List;

    if-eqz v1, :cond_1

    .line 528
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->ballViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;->views:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/View;

    .line 529
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/View;->imageUrl:Ljava/lang/String;

    if-eqz v3, :cond_0

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/View;->imageUrl:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 532
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->extraViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->extraViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;->views:Ljava/util/List;

    if-eqz v1, :cond_3

    .line 533
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->extraViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;->views:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/View;

    .line 534
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/View;->imageUrl:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/View;->imageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 538
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p0
.end method

.method private getShareFacebookButton()Lcom/shopkick/app/widget/UserEventRelativeLayout;
    .locals 2

    .line 463
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09067e

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    return-object v0
.end method

.method private handlePostToFacebookClick()V
    .locals 2

    .line 547
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/url/URLDispatcher;->setUrlDispatcherFinishedCallback(Lcom/shopkick/app/url/IURLDispatcherFinishedCallback;)V

    .line 548
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->sharingSkLink:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method

.method private isMCommerceBubbleOverlay()Z
    .locals 2

    .line 369
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMCommerceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    if-eqz v0, :cond_1

    const/16 v0, 0x12

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDeltaType:Ljava/lang/Integer;

    .line 370
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq v0, v1, :cond_0

    const/16 v0, 0x13

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDeltaType:Ljava/lang/Integer;

    .line 371
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private onAnimationEndBall(Landroid/view/animation/Animation;)V
    .locals 4

    .line 415
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->destroyed:Z

    if-eqz v0, :cond_0

    return-void

    .line 419
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->contextRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_1

    return-void

    .line 424
    :cond_1
    invoke-virtual {p0, p1}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->endAnimation(Landroid/view/animation/Animation;)V

    .line 426
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->enterAnimation:Landroid/view/animation/AnimationSet;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_4

    .line 427
    iput-object v1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->enterAnimation:Landroid/view/animation/AnimationSet;

    const/4 p1, 0x0

    .line 428
    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->setBallElementsVisibility(I)V

    .line 429
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->soundFile:Ljava/lang/String;

    if-eqz p1, :cond_2

    .line 430
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->soundFile:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->playSound(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const p1, 0x7f100001

    .line 432
    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->playSound(I)V

    .line 434
    :goto_0
    sget-wide v0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->MILLIS_TO_PAUSE:J

    .line 435
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->getShareFacebookButton()Lcom/shopkick/app/widget/UserEventRelativeLayout;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->getVisibility()I

    move-result p1

    if-nez p1, :cond_3

    .line 436
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->shareOverlayDelayOverride:Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    double-to-long v0, v0

    .line 438
    :cond_3
    new-instance p1, Lcom/shopkick/app/overlays/common/BallSKOverlay$PauseCompleteRunnable;

    invoke-direct {p1, p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay$PauseCompleteRunnable;-><init>(Lcom/shopkick/app/overlays/common/BallSKOverlay;)V

    iput-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->pauseCompleteRunnable:Ljava/lang/Runnable;

    .line 439
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->pauseCompleteRunnable:Ljava/lang/Runnable;

    invoke-direct {p0, p1, v0, v1}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->postDelayed(Ljava/lang/Runnable;J)V

    goto :goto_1

    .line 440
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->exitAnimation:Landroid/view/animation/Animation;

    if-ne p1, v0, :cond_5

    .line 441
    iput-object v1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->exitAnimation:Landroid/view/animation/Animation;

    .line 442
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->dismiss()V

    :cond_5
    :goto_1
    return-void
.end method

.method private onPauseCompleted()V
    .locals 2

    .line 321
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->destroyed:Z

    if-eqz v0, :cond_0

    return-void

    .line 325
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->contextRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_1

    return-void

    .line 330
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->isMCommerceBubbleOverlay()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 331
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "eventMCommerceBubbleFinished"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void

    :cond_2
    const/16 v0, 0x8

    .line 335
    invoke-direct {p0, v0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->setBallElementsVisibility(I)V

    .line 337
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDeltaType:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xe

    if-ne v0, v1, :cond_3

    .line 338
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EventReceiptScanAwarded"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 340
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->animateRegularExit()V

    return-void
.end method

.method private playSound(I)V
    .locals 2

    .line 307
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->destroyed:Z

    if-eqz v0, :cond_0

    return-void

    .line 311
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->contextRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_1

    .line 313
    sget-object p1, Lcom/shopkick/app/overlays/common/BallSKOverlay;->LOG_TAG:Ljava/lang/String;

    const-string v0, "playSound: invalid context"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 317
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    invoke-virtual {v1, v0, p1}, Lcom/shopkick/app/sounds/SoundManager;->play(Landroid/content/Context;I)V

    return-void
.end method

.method private playSound(Ljava/lang/String;)V
    .locals 2

    .line 293
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->destroyed:Z

    if-eqz v0, :cond_0

    return-void

    .line 297
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->contextRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_1

    .line 299
    sget-object p1, Lcom/shopkick/app/overlays/common/BallSKOverlay;->LOG_TAG:Ljava/lang/String;

    const-string v0, "playSound: invalid context"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 303
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    invoke-virtual {v1, v0, p1}, Lcom/shopkick/app/sounds/SoundManager;->play(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private postDelayed(Ljava/lang/Runnable;J)V
    .locals 1

    .line 272
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->destroyed:Z

    if-eqz v0, :cond_0

    return-void

    .line 276
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->handler:Landroid/os/Handler;

    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private setAssetForView(Ljava/lang/String;Landroid/view/View;)V
    .locals 1

    .line 254
    instance-of v0, p2, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 255
    check-cast p2, Landroid/widget/ImageView;

    .line 256
    invoke-static {p2}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_0
    return-void
.end method

.method private setBallElementsVisibility(I)V
    .locals 1

    .line 261
    sget-object v0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->BALL_ELEMENT_IDS:[I

    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->setElementsVisibility([II)V

    return-void
.end method

.method private setElementsVisibility([II)V
    .locals 4

    .line 265
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p1, v1

    .line 266
    iget-object v3, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 267
    invoke-virtual {v2, p2}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private showTotalKicksBar(Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;Ljava/lang/Integer;)V
    .locals 5

    if-nez p2, :cond_0

    if-eqz p1, :cond_3

    .line 344
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsBalance:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    :cond_0
    const/4 v0, 0x1

    .line 345
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->totalKicksBarShown:Z

    .line 346
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    const v2, 0x7f0907a5

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    const/4 v2, 0x0

    .line 347
    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    const v2, 0x7f0907a8

    .line 348
    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0907a7

    .line 349
    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-eqz p2, :cond_1

    .line 352
    invoke-virtual {p2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v2, 0x7f11070d

    .line 353
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 355
    :cond_1
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsBalance:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    const v2, 0x7f0907a6

    .line 357
    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 358
    iget-object v3, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0f0010

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsBalance:Ljava/lang/Integer;

    .line 360
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 359
    invoke-virtual {v3, v4, p1}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object p1

    .line 358
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 361
    new-instance p1, Landroid/view/animation/AlphaAnimation;

    const/4 p2, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {p1, p2, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v2, 0x190

    .line 362
    invoke-virtual {p1, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 363
    invoke-virtual {p1, v0}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 364
    invoke-virtual {v1, p1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 7

    .line 123
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    .line 124
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f090680

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->iconView:Landroid/widget/ImageView;

    .line 125
    iput-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->context:Landroid/content/Context;

    .line 127
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->ballViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 131
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->backgroundColor:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 132
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->backgroundColor:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/SKColor;->parseString(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 136
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    const v0, 0x7f0904f4

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 137
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 138
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 140
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 144
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    const v0, 0x7f090060

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    .line 146
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    const v3, 0x7f09026b

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 148
    iget-object v3, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->ballViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    if-eqz v3, :cond_5

    iget-object v3, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->ballViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;->views:Ljava/util/List;

    if-eqz v3, :cond_5

    .line 149
    iget-object v3, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->ballViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;->views:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/View;

    .line 150
    iget-object v5, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Lcom/shopkick/app/util/ViewBuilder;->createView(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/View;)Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;

    move-result-object v5

    .line 151
    iget-object v6, v4, Lcom/shopkick/app/fetchers/api/skapi/View;->imageUrl:Ljava/lang/String;

    if-eqz v6, :cond_3

    .line 152
    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/View;->imageUrl:Ljava/lang/String;

    iget-object v6, v5, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->view:Landroid/view/View;

    invoke-direct {p0, v4, v6}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->setAssetForView(Ljava/lang/String;Landroid/view/View;)V

    .line 154
    :cond_3
    iget-boolean v4, v5, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->usesSpecialCoordinates:Z

    if-eqz v4, :cond_4

    .line 155
    iget-object v4, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    iget-object v5, v5, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->view:Landroid/view/View;

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_1

    .line 157
    :cond_4
    iget-object v4, v5, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->view:Landroid/view/View;

    invoke-virtual {p1, v4}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    goto :goto_1

    .line 161
    :cond_5
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->extraViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->extraViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;->views:Ljava/util/List;

    if-eqz p1, :cond_8

    .line 162
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->extraViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;->views:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/View;

    .line 163
    iget-object v4, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Lcom/shopkick/app/util/ViewBuilder;->createView(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/View;)Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;

    move-result-object v4

    .line 164
    iget-object v5, v3, Lcom/shopkick/app/fetchers/api/skapi/View;->imageUrl:Ljava/lang/String;

    if-eqz v5, :cond_6

    .line 165
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/View;->imageUrl:Ljava/lang/String;

    iget-object v5, v4, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->view:Landroid/view/View;

    invoke-direct {p0, v3, v5}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->setAssetForView(Ljava/lang/String;Landroid/view/View;)V

    .line 167
    :cond_6
    iget-boolean v3, v4, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->usesSpecialCoordinates:Z

    if-eqz v3, :cond_7

    .line 168
    iget-object v3, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    iget-object v4, v4, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->view:Landroid/view/View;

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_2

    .line 170
    :cond_7
    iget-object v3, v4, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->view:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    goto :goto_2

    .line 174
    :cond_8
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->sharingTeaserText:Ljava/lang/String;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->sharingSkLink:Ljava/lang/String;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->sharingPlatformImageUrl:Ljava/lang/String;

    if-eqz p1, :cond_9

    .line 175
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->getShareFacebookButton()Lcom/shopkick/app/widget/UserEventRelativeLayout;

    move-result-object p1

    .line 176
    new-instance v0, Lcom/shopkick/app/overlays/common/BallSKOverlay$PostToFacebookClick;

    invoke-direct {v0, p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay$PostToFacebookClick;-><init>(Lcom/shopkick/app/overlays/common/BallSKOverlay;)V

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 177
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    const v0, 0x7f090681

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 178
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->sharingTeaserText:Ljava/lang/String;

    sget-object v1, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {p1, v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 179
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->sharingPlatformImageUrl:Ljava/lang/String;

    if-eqz p1, :cond_a

    .line 181
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->iconView:Landroid/widget/ImageView;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->sharingPlatformImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->iconView:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    goto :goto_3

    .line 184
    :cond_9
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->getShareFacebookButton()Lcom/shopkick/app/widget/UserEventRelativeLayout;

    move-result-object p1

    .line 185
    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setVisibility(I)V

    .line 189
    :cond_a
    :goto_3
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->isMCommerceBubbleOverlay()Z

    move-result p1

    if-eqz p1, :cond_b

    .line 190
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->tapToDismiss:Ljava/lang/Boolean;

    .line 194
    :cond_b
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMOATLookbookEnabled()Z

    move-result p1

    const/4 v0, 0x6

    if-nez p1, :cond_c

    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    if-eqz p1, :cond_c

    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDeltaType:Ljava/lang/Integer;

    .line 195
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v0, :cond_c

    goto :goto_4

    .line 197
    :cond_c
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMOATScanEnabled()Z

    move-result p1

    const/16 v1, 0xd

    const/4 v3, 0x3

    if-nez p1, :cond_d

    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    if-eqz p1, :cond_d

    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDeltaType:Ljava/lang/Integer;

    .line 198
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq p1, v3, :cond_10

    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDeltaType:Ljava/lang/Integer;

    .line 199
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v1, :cond_d

    goto :goto_4

    .line 203
    :cond_d
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    if-eqz p1, :cond_f

    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDeltaType:Ljava/lang/Integer;

    .line 204
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq p1, v0, :cond_e

    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDeltaType:Ljava/lang/Integer;

    .line 205
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq p1, v3, :cond_e

    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDeltaType:Ljava/lang/Integer;

    .line 206
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v1, :cond_f

    :cond_e
    const/4 v2, 0x1

    .line 207
    :cond_f
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v3, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/shopkick/app/logging/IUserEventView;->setupMoatTracking(Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;Lcom/shopkick/app/application/ClientFlagsManager;ZLcom/shopkick/app/logging/UserEventLogger;)V

    .line 210
    :cond_10
    :goto_4
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    return-object p1
.end method

.method public destroy()V
    .locals 2

    .line 106
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 107
    check-cast v0, Lcom/shopkick/app/logging/IUserEventView;

    invoke-interface {v0}, Lcom/shopkick/app/logging/IUserEventView;->stopMoatTracking()V

    :cond_0
    const/4 v0, 0x1

    .line 109
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->destroyed:Z

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 111
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->cancelAllAnimations()V

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->iconView:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/content/Context;Landroid/view/View;)V

    .line 113
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    return-void
.end method

.method public dispatcherDidFinish()V
    .locals 0

    .line 572
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->onPauseCompleted()V

    return-void
.end method

.method public endAnimation(Landroid/view/animation/Animation;)V
    .locals 1

    .line 409
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->animations:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 410
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public getExtraViewsContainerView()Landroid/view/View;
    .locals 2

    .line 459
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09026b

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c0028

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->mainView:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 95
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 97
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    .line 98
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    .line 99
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 100
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p2}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 101
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-void
.end method

.method public onCheckmarkAnimationStarted()V
    .locals 1

    .line 588
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->totalKicksBarShown:Z

    if-eqz v0, :cond_0

    .line 589
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->animateKicksBarOut()V

    :cond_0
    return-void
.end method

.method public onOverlayDismissed(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 239
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayDismissed(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    return-void
.end method

.method public onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 8

    .line 220
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 221
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->getBallView()Landroid/widget/RelativeLayout;

    move-result-object p1

    .line 222
    new-instance v7, Lcom/shopkick/app/animation/PulseAnimationSet;

    const/4 v1, 0x0

    const v2, 0x3f87ae14    # 1.06f

    const/4 v3, 0x0

    const v4, 0x3f87ae14    # 1.06f

    const/16 v5, 0x12c

    const/16 v6, 0x64

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/animation/PulseAnimationSet;-><init>(FFFFII)V

    .line 227
    invoke-virtual {v7}, Lcom/shopkick/app/animation/PulseAnimationSet;->getPulseAnimationSet()Landroid/view/animation/AnimationSet;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->enterAnimation:Landroid/view/animation/AnimationSet;

    .line 228
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->enterAnimation:Landroid/view/animation/AnimationSet;

    new-instance v1, Lcom/shopkick/app/overlays/common/BallSKOverlay$BallAnimationListener;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay$BallAnimationListener;-><init>(Lcom/shopkick/app/overlays/common/BallSKOverlay;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 229
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->enterAnimation:Landroid/view/animation/AnimationSet;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->startAnimation(Landroid/view/View;Landroid/view/animation/Animation;)V

    .line 230
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->totalKicksThisTrip:Ljava/lang/Integer;

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->showTotalKicksBar(Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;Ljava/lang/Integer;)V

    .line 231
    invoke-static {p2}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->willEnterExtendedScanAnimation(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 232
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->tapToDismiss:Ljava/lang/Boolean;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->savedTapToDismissValue:Z

    const/4 p1, 0x0

    .line 233
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->tapToDismiss:Ljava/lang/Boolean;

    :cond_0
    return-void
.end method

.method public onScanAnimationFinished()V
    .locals 0

    .line 578
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->animateRegularExit()V

    return-void
.end method

.method public onSeeMoreScansTapped()V
    .locals 0

    .line 583
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->dismiss()V

    return-void
.end method

.method public startAnimation(Landroid/view/View;Landroid/view/animation/Animation;)V
    .locals 1

    .line 402
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;->animations:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 403
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 404
    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_0
    return-void
.end method
