.class public Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;
.super Ljava/lang/Object;
.source "WalkinAnimationController.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;
.implements Landroid/view/View$OnClickListener;
.implements Lcom/shopkick/app/controllers/IFlipCallback;
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;,
        Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$WalkinMessageAnimatorListener;
    }
.end annotation


# static fields
.field private static final BALL_EXIT_DURATION:I = 0x190

.field private static final BALL_OUTER_SPIN_DURATION:I = 0x3e8

.field private static final BALL_PULSE_IN_DURATION:I = 0x64

.field private static final BALL_PULSE_MAX_SCALE_FACTOR:F = 1.06f

.field private static final BALL_PULSE_MIN_SCALE_FACTOR:F = 0.0f

.field private static final BALL_PULSE_OUT_DURATION:I = 0x12c

.field private static final BALL_SHRINK_DURATION:I = 0x12c

.field private static final CHECK_PULSE_IN_DURATION:I = 0x4b

.field private static final CHECK_PULSE_MAX_SCALE_FACTOR:F = 1.06f

.field private static final CHECK_PULSE_MIN_SCALE_FACTOR:F = 0.0f

.field private static final CHECK_PULSE_OUT_DURATION:I = 0xc8

.field private static final CHECK_TRANSLATE_DELAY:I = 0x190

.field private static final CHECK_TRANSLATE_DURATION:I = 0x190

.field private static final FACEBOOK_FADE_DURATION:I = 0x1f4

.field private static final FADE_DURATION:I = 0xc8

.field private static final INITIAL_GREETING_FADE_OUT_DURATION:I = 0x1f4

.field private static final KICKS_PULSE_IN_DURATION:I = 0x64

.field private static final KICKS_PULSE_MAX_SCALE_FACTOR:F = 1.06f

.field private static final KICKS_PULSE_MIN_SCALE_FACTOR:F = 0.0f

.field private static final KICKS_PULSE_OUT_DURATION:I = 0x12c

.field private static final PAUSE_BEFORE_AUTO_DISMISS_DURATION:I = 0x9c4

.field private static final PAUSE_WHILE_DISPLAYING_TEXT_BEFORE_ANIMATION:I = 0x1388

.field private static final PAUSE_WHILE_FADING_DURATION:I = 0x1f4

.field private static final TOTAL_KICKS_BAR_FADE_IN_DURATION:I = 0x320


# instance fields
.field private ballEnterAnim:Landroid/view/animation/AnimationSet;

.field private ballExitAnim:Landroid/view/animation/ScaleAnimation;

.field private ballImage:Landroid/widget/RelativeLayout;

.field private ballOuterSpin:Landroid/view/animation/RotateAnimation;

.field private baseActivity:Lcom/shopkick/app/activities/BaseActivity;

.field private callback:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;

.field private context:Landroid/content/Context;

.field private enableExtraWalkinMsg:Z

.field private enableFacebook:Z

.field private firstFadeOutAnim:Landroid/animation/ObjectAnimator;

.field private firstcheckmarkAnim:Landroid/view/animation/AnimationSet;

.field private flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private handler:Landroid/os/Handler;

.field private initialGreetingFadeOutAnim:Landroid/view/animation/AlphaAnimation;

.field private isOnlineWalkin:Z

.field private overlayView:Landroid/widget/RelativeLayout;

.field private pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

.field private rewardChosen:Z

.field private rewardOverlayController:Lcom/shopkick/app/overlays/controllers/RewardOverlayController;

.field private secondCheckmarkAnim:Landroid/view/animation/AnimationSet;

.field private secondFadeOutAnim:Landroid/animation/ObjectAnimator;

.field private showKicksAnim:Landroid/view/animation/AnimationSet;

.field private soundManager:Lcom/shopkick/app/sounds/SoundManager;

.field private successfulWalkin:Z

.field private updatedWalkinAnim:Landroid/animation/AnimatorSet;

.field private waitingForServer:Z

.field private walkinIconCoordinates:[I

.field private walkinIconDimensions:[I

.field private woohooGreetingShown:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/sounds/SoundManager;Landroid/widget/RelativeLayout;Lcom/shopkick/app/points/ProfilePoints;Lcom/shopkick/app/activities/BaseActivity;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 1

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 79
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->isOnlineWalkin:Z

    .line 123
    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->context:Landroid/content/Context;

    .line 124
    iput-object p2, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    .line 125
    iput-object p3, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const p2, 0x7f09005c

    .line 126
    invoke-virtual {p3, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/RelativeLayout;

    iput-object p2, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    .line 127
    new-instance p2, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;

    iget-object p3, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    invoke-direct {p2, p1, p4, p3}, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;-><init>(Landroid/content/Context;Lcom/shopkick/app/points/ProfilePoints;Landroid/widget/RelativeLayout;)V

    iput-object p2, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->rewardOverlayController:Lcom/shopkick/app/overlays/controllers/RewardOverlayController;

    .line 128
    iput-object p6, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 129
    iput-object p5, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->baseActivity:Lcom/shopkick/app/activities/BaseActivity;

    const/4 p1, 0x1

    .line 131
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->successfulWalkin:Z

    .line 132
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->waitingForServer:Z

    .line 133
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->woohooGreetingShown:Z

    .line 134
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)Landroid/widget/RelativeLayout;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)Landroid/animation/ObjectAnimator;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->firstFadeOutAnim:Landroid/animation/ObjectAnimator;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)Landroid/animation/ObjectAnimator;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->secondFadeOutAnim:Landroid/animation/ObjectAnimator;

    return-object p0
.end method

.method private animateCheckMarkIn()V
    .locals 9

    .line 297
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const v1, 0x7f0900fe

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 298
    new-instance v8, Lcom/shopkick/app/animation/PulseAnimationSet;

    const/4 v2, 0x0

    const v3, 0x3f87ae14    # 1.06f

    const/4 v4, 0x0

    const v5, 0x3f87ae14    # 1.06f

    const/16 v6, 0xc8

    const/16 v7, 0x4b

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/animation/PulseAnimationSet;-><init>(FFFFII)V

    .line 303
    invoke-virtual {v8}, Lcom/shopkick/app/animation/PulseAnimationSet;->getPulseAnimationSet()Landroid/view/animation/AnimationSet;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->firstcheckmarkAnim:Landroid/view/animation/AnimationSet;

    .line 305
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->firstcheckmarkAnim:Landroid/view/animation/AnimationSet;

    invoke-virtual {v1, p0}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 306
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->firstcheckmarkAnim:Landroid/view/animation/AnimationSet;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 v1, 0x0

    .line 307
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 309
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->enableExtraWalkinMsg:Z

    if-eqz v0, :cond_0

    .line 310
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v1, 0x7f09026c

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    const/16 v1, 0xc8

    .line 311
    invoke-direct {p0, v1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->getFadeOutAnimation(I)Landroid/view/animation/AlphaAnimation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 v1, 0x4

    .line 312
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private animateCheckmarkOut()V
    .locals 18

    move-object/from16 v0, p0

    .line 317
    new-instance v1, Landroid/view/animation/AnimationSet;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    iput-object v1, v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->secondCheckmarkAnim:Landroid/view/animation/AnimationSet;

    .line 318
    iget-object v1, v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const v3, 0x7f09005e

    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 320
    iget-object v3, v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->walkinIconCoordinates:[I

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->walkinIconDimensions:[I

    if-nez v3, :cond_0

    goto/16 :goto_0

    .line 324
    :cond_0
    iget-object v3, v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const v4, 0x7f0900fe

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    const/4 v4, 0x2

    .line 325
    new-array v5, v4, [I

    .line 326
    new-array v4, v4, [I

    .line 328
    iget-object v6, v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    invoke-virtual {v6, v5}, Landroid/widget/RelativeLayout;->getLocationInWindow([I)V

    .line 329
    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->getLocationInWindow([I)V

    .line 330
    iget-object v6, v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    invoke-virtual {v6}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v6

    .line 331
    iget-object v7, v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->walkinIconDimensions:[I

    aget v7, v7, v2

    int-to-float v7, v7

    int-to-float v6, v6

    div-float/2addr v7, v6

    const v8, 0x3f59999a    # 0.85f

    mul-float v13, v7, v8

    .line 333
    new-instance v7, Landroid/view/animation/ScaleAnimation;

    const/high16 v10, 0x3f800000    # 1.0f

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v14, 0x1

    const/high16 v15, 0x3f000000    # 0.5f

    const/16 v16, 0x1

    const/high16 v17, 0x3f000000    # 0.5f

    move-object v9, v7

    move v11, v13

    invoke-direct/range {v9 .. v17}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    const-wide/16 v8, 0x190

    .line 341
    invoke-virtual {v7, v8, v9}, Landroid/view/animation/ScaleAnimation;->setStartOffset(J)V

    const-wide/16 v10, 0x12c

    .line 342
    invoke-virtual {v7, v10, v11}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 343
    new-instance v10, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v10}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v7, v10}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 345
    new-instance v10, Landroid/view/animation/TranslateAnimation;

    iget-object v11, v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->walkinIconCoordinates:[I

    aget v12, v11, v2

    int-to-float v12, v12

    iget-object v13, v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->walkinIconDimensions:[I

    aget v14, v13, v2

    int-to-float v14, v14

    const/high16 v15, 0x40000000    # 2.0f

    div-float/2addr v14, v15

    add-float/2addr v12, v14

    aget v2, v5, v2

    int-to-float v2, v2

    div-float/2addr v6, v15

    add-float/2addr v2, v6

    sub-float/2addr v12, v2

    const/4 v2, 0x1

    aget v6, v11, v2

    int-to-float v6, v6

    aget v11, v13, v2

    int-to-float v11, v11

    div-float/2addr v11, v15

    add-float/2addr v6, v11

    aget v11, v4, v2

    int-to-float v11, v11

    .line 350
    invoke-virtual {v3}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v15

    add-float/2addr v11, v3

    sub-float/2addr v6, v11

    aget v3, v4, v2

    aget v4, v5, v2

    sub-int/2addr v3, v4

    int-to-float v3, v3

    sub-float/2addr v6, v3

    const/4 v3, 0x0

    invoke-direct {v10, v3, v12, v3, v6}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 351
    new-instance v4, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v4}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v10, v4}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 352
    invoke-virtual {v10, v8, v9}, Landroid/view/animation/TranslateAnimation;->setStartOffset(J)V

    .line 353
    invoke-virtual {v10, v8, v9}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 355
    new-instance v4, Landroid/view/animation/AlphaAnimation;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v4, v5, v3}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 356
    invoke-virtual {v4, v8, v9}, Landroid/view/animation/AlphaAnimation;->setStartOffset(J)V

    const-wide/16 v5, 0xc8

    .line 357
    invoke-virtual {v4, v5, v6}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 358
    new-instance v3, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v3}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v4, v3}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 359
    invoke-virtual {v4, v2}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 361
    iget-object v3, v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->secondCheckmarkAnim:Landroid/view/animation/AnimationSet;

    invoke-virtual {v3, v7}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 362
    iget-object v3, v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->secondCheckmarkAnim:Landroid/view/animation/AnimationSet;

    invoke-virtual {v3, v10}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 363
    iget-object v3, v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->secondCheckmarkAnim:Landroid/view/animation/AnimationSet;

    invoke-virtual {v3, v2}, Landroid/view/animation/AnimationSet;->setFillAfter(Z)V

    .line 365
    iget-object v2, v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->secondCheckmarkAnim:Landroid/view/animation/AnimationSet;

    invoke-virtual {v2, v0}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 367
    iget-object v2, v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    iget-object v3, v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->secondCheckmarkAnim:Landroid/view/animation/AnimationSet;

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 368
    invoke-virtual {v1, v4}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 369
    iget-object v1, v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->handler:Landroid/os/Handler;

    new-instance v2, Lcom/shopkick/app/overlays/controllers/-$$Lambda$WalkinAnimationController$jHJv7IhxaRK73obJPoUpFcaLifM;

    invoke-direct {v2, v0}, Lcom/shopkick/app/overlays/controllers/-$$Lambda$WalkinAnimationController$jHJv7IhxaRK73obJPoUpFcaLifM;-><init>(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)V

    const-wide/16 v3, 0x64

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    .line 321
    :cond_1
    :goto_0
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballExit()V

    :goto_1
    return-void
.end method

.method private ballExit()V
    .locals 9

    .line 402
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 403
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v7, v1

    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v8, v1

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V

    iput-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballExitAnim:Landroid/view/animation/ScaleAnimation;

    .line 404
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballExitAnim:Landroid/view/animation/ScaleAnimation;

    const-wide/16 v1, 0x190

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 405
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballExitAnim:Landroid/view/animation/ScaleAnimation;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setFillAfter(Z)V

    .line 406
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballExitAnim:Landroid/view/animation/ScaleAnimation;

    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 407
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballExitAnim:Landroid/view/animation/ScaleAnimation;

    invoke-virtual {v0, p0}, Landroid/view/animation/ScaleAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 409
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballExitAnim:Landroid/view/animation/ScaleAnimation;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 410
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->context:Landroid/content/Context;

    const v2, 0x7f10000d

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/sounds/SoundManager;->play(Landroid/content/Context;I)V

    .line 411
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->successfulWalkin:Z

    if-eqz v0, :cond_0

    .line 412
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v1, 0x7f0907a5

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    const/16 v1, 0x190

    .line 413
    invoke-direct {p0, v1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->getFadeOutAnimation(I)Landroid/view/animation/AlphaAnimation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_0
    return-void
.end method

.method private fadeHelper(FFI)Landroid/view/animation/AlphaAnimation;
    .locals 1

    .line 427
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, p1, p2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    int-to-long p1, p3

    .line 428
    invoke-virtual {v0, p1, p2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    const/4 p1, 0x1

    .line 429
    invoke-virtual {v0, p1}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    return-object v0
.end method

.method private fadeOutInitialGreeting()V
    .locals 2

    .line 235
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->woohooGreetingShown:Z

    if-eqz v0, :cond_0

    .line 236
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const v1, 0x7f090850

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 238
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const v1, 0x7f090311

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    :goto_0
    const/16 v1, 0x1f4

    .line 240
    invoke-direct {p0, v1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->getFadeOutAnimation(I)Landroid/view/animation/AlphaAnimation;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->initialGreetingFadeOutAnim:Landroid/view/animation/AlphaAnimation;

    .line 241
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->initialGreetingFadeOutAnim:Landroid/view/animation/AlphaAnimation;

    invoke-virtual {v1, p0}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 242
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->initialGreetingFadeOutAnim:Landroid/view/animation/AlphaAnimation;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private flipToError()V
    .locals 3

    .line 374
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const v1, 0x7f09005d

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 375
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const v2, 0x7f090273

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 377
    iget-object v2, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->updatedWalkinAnim:Landroid/animation/AnimatorSet;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 378
    iget-object v2, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->updatedWalkinAnim:Landroid/animation/AnimatorSet;

    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->cancel()V

    .line 381
    :cond_0
    new-instance v2, Lcom/shopkick/app/animation/FlipViews;

    invoke-direct {v2, v0, v1, p0}, Lcom/shopkick/app/animation/FlipViews;-><init>(Landroid/widget/RelativeLayout;Landroid/widget/RelativeLayout;Lcom/shopkick/app/controllers/IFlipCallback;)V

    .line 382
    invoke-virtual {v2}, Lcom/shopkick/app/animation/FlipViews;->startFlip()V

    return-void
.end method

.method private flipToReward()V
    .locals 3

    .line 273
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const v1, 0x7f09005d

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 274
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const v2, 0x7f0905d0

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 276
    new-instance v2, Lcom/shopkick/app/animation/FlipViews;

    invoke-direct {v2, v0, v1, p0}, Lcom/shopkick/app/animation/FlipViews;-><init>(Landroid/widget/RelativeLayout;Landroid/widget/RelativeLayout;Lcom/shopkick/app/controllers/IFlipCallback;)V

    .line 277
    invoke-virtual {v2}, Lcom/shopkick/app/animation/FlipViews;->startFlip()V

    .line 278
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->context:Landroid/content/Context;

    const v2, 0x7f10000c

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/sounds/SoundManager;->play(Landroid/content/Context;I)V

    .line 280
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->updatedWalkinAnim:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 281
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->updatedWalkinAnim:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 284
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->enableFacebook:Z

    const/4 v1, 0x4

    if-eqz v0, :cond_1

    .line 285
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v2, 0x7f090535

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    const/16 v2, 0x1f4

    .line 286
    invoke-direct {p0, v2}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->getFadeOutAnimation(I)Landroid/view/animation/AlphaAnimation;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 287
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 289
    :cond_1
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->enableExtraWalkinMsg:Z

    if-eqz v0, :cond_2

    .line 290
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v2, 0x7f09026c

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    const/16 v2, 0xc8

    .line 291
    invoke-direct {p0, v2}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->getFadeOutAnimation(I)Landroid/view/animation/AlphaAnimation;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 292
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method private getFadeInAnimation(I)Landroid/view/animation/AlphaAnimation;
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 419
    invoke-direct {p0, v0, v1, p1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->fadeHelper(FFI)Landroid/view/animation/AlphaAnimation;

    move-result-object p1

    return-object p1
.end method

.method private getFadeOutAnimation(I)Landroid/view/animation/AlphaAnimation;
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    .line 423
    invoke-direct {p0, v0, v1, p1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->fadeHelper(FFI)Landroid/view/animation/AlphaAnimation;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic lambda$Nl2TWJBa4EOfXul-PYuQam_akb0(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)V
    .locals 0

    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballExit()V

    return-void
.end method

.method public static synthetic lambda$animateCheckmarkOut$149(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)V
    .locals 3

    .line 369
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->context:Landroid/content/Context;

    const v2, 0x7f10000c

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/sounds/SoundManager;->play(Landroid/content/Context;I)V

    return-void
.end method

.method public static synthetic lambda$flipViewFinished$151(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)V
    .locals 2

    .line 590
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->showTotalKicksBar()V

    .line 591
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/shopkick/app/overlays/controllers/-$$Lambda$WalkinAnimationController$jA-gAr2pIp9ZYQwm6rijpVdSI1M;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/controllers/-$$Lambda$WalkinAnimationController$jA-gAr2pIp9ZYQwm6rijpVdSI1M;-><init>(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic lambda$jA-gAr2pIp9ZYQwm6rijpVdSI1M(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)V
    .locals 0

    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->showRewardProgress()V

    return-void
.end method

.method public static synthetic lambda$onAnimationEnd$150(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)V
    .locals 6

    .line 470
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 471
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 472
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "WalkinAnimationController about to call onWalkinFinished on a callback. Watch for an error message."

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 475
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->callback:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;

    if-eqz v0, :cond_0

    .line 476
    invoke-interface {v0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;->onWalkinFinished()V

    goto :goto_0

    .line 478
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 479
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "WalkinAnimationController attempted to call onWalkinFinished on a null callback."

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method static synthetic lambda$showKicks$148(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method private playUpdatedWalkinAnimationSet()V
    .locals 6

    .line 168
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->woohooGreetingShown:Z

    if-nez v0, :cond_1

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->updatedWalkinAnim:Landroid/animation/AnimatorSet;

    if-nez v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const v1, 0x7f090311

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 173
    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->updatedWalkinAnim:Landroid/animation/AnimatorSet;

    const-string v1, "alpha"

    const/4 v2, 0x2

    .line 175
    new-array v3, v2, [F

    fill-array-data v3, :array_0

    invoke-static {v0, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->firstFadeOutAnim:Landroid/animation/ObjectAnimator;

    const-string v1, "alpha"

    .line 176
    new-array v3, v2, [F

    fill-array-data v3, :array_1

    invoke-static {v0, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->secondFadeOutAnim:Landroid/animation/ObjectAnimator;

    .line 180
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->firstFadeOutAnim:Landroid/animation/ObjectAnimator;

    const-wide/16 v3, 0x1388

    invoke-virtual {v1, v3, v4}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    .line 181
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->secondFadeOutAnim:Landroid/animation/ObjectAnimator;

    invoke-virtual {v1, v3, v4}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    .line 183
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->firstFadeOutAnim:Landroid/animation/ObjectAnimator;

    const-wide/16 v3, 0x1f4

    invoke-virtual {v1, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 184
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->secondFadeOutAnim:Landroid/animation/ObjectAnimator;

    invoke-virtual {v1, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 187
    new-instance v1, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$WalkinMessageAnimatorListener;

    const/4 v5, 0x0

    invoke-direct {v1, p0, v5}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$WalkinMessageAnimatorListener;-><init>(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$1;)V

    .line 188
    iget-object v5, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->firstFadeOutAnim:Landroid/animation/ObjectAnimator;

    invoke-virtual {v5, v1}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 189
    iget-object v5, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->secondFadeOutAnim:Landroid/animation/ObjectAnimator;

    invoke-virtual {v5, v1}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    const-string v1, "alpha"

    .line 191
    new-array v5, v2, [F

    fill-array-data v5, :array_2

    invoke-static {v0, v1, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    const-string v5, "alpha"

    .line 192
    new-array v2, v2, [F

    fill-array-data v2, :array_3

    invoke-static {v0, v5, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 195
    invoke-virtual {v1, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 196
    invoke-virtual {v0, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 198
    iget-object v2, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->updatedWalkinAnim:Landroid/animation/AnimatorSet;

    iget-object v3, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->firstFadeOutAnim:Landroid/animation/ObjectAnimator;

    invoke-virtual {v2, v3}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 199
    iget-object v2, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->updatedWalkinAnim:Landroid/animation/AnimatorSet;

    invoke-virtual {v2, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->firstFadeOutAnim:Landroid/animation/ObjectAnimator;

    invoke-virtual {v2, v3}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 200
    iget-object v2, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->updatedWalkinAnim:Landroid/animation/AnimatorSet;

    iget-object v3, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->secondFadeOutAnim:Landroid/animation/ObjectAnimator;

    invoke-virtual {v2, v3}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 201
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->updatedWalkinAnim:Landroid/animation/AnimatorSet;

    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->secondFadeOutAnim:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 203
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->updatedWalkinAnim:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    :cond_1
    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_3
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private showKicks()V
    .locals 9

    .line 246
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const v1, 0x7f0903e5

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 247
    new-instance v8, Lcom/shopkick/app/animation/PulseAnimationSet;

    const/4 v2, 0x0

    const v3, 0x3f87ae14    # 1.06f

    const/4 v4, 0x0

    const v5, 0x3f87ae14    # 1.06f

    const/16 v6, 0x12c

    const/16 v7, 0x64

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/animation/PulseAnimationSet;-><init>(FFFFII)V

    .line 252
    invoke-virtual {v8}, Lcom/shopkick/app/animation/PulseAnimationSet;->getPulseAnimationSet()Landroid/view/animation/AnimationSet;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->showKicksAnim:Landroid/view/animation/AnimationSet;

    .line 253
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->showKicksAnim:Landroid/view/animation/AnimationSet;

    invoke-virtual {v1, p0}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 254
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const v2, 0x7f0904a1

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 255
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const v3, 0x7f0906f0

    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 256
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->showKicksAnim:Landroid/view/animation/AnimationSet;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 v1, 0x0

    .line 257
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 258
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->context:Landroid/content/Context;

    const v2, 0x7f100001

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/sounds/SoundManager;->play(Landroid/content/Context;I)V

    .line 259
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->enableFacebook:Z

    if-eqz v0, :cond_0

    .line 260
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090535

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 261
    sget-object v1, Lcom/shopkick/app/overlays/controllers/-$$Lambda$WalkinAnimationController$Aa_K24slR8E6XahoS2F1yXm3-Vs;->INSTANCE:Lcom/shopkick/app/overlays/controllers/-$$Lambda$WalkinAnimationController$Aa_K24slR8E6XahoS2F1yXm3-Vs;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/16 v1, 0x1f4

    .line 264
    invoke-direct {p0, v1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->getFadeInAnimation(I)Landroid/view/animation/AlphaAnimation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 266
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->enableExtraWalkinMsg:Z

    if-eqz v0, :cond_1

    .line 267
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v1, 0x7f09026c

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    const/16 v1, 0xc8

    .line 268
    invoke-direct {p0, v1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->getFadeInAnimation(I)Landroid/view/animation/AlphaAnimation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_1
    return-void
.end method

.method private showRewardProgress()V
    .locals 1

    .line 386
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->rewardOverlayController:Lcom/shopkick/app/overlays/controllers/RewardOverlayController;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->calculateProgress()V

    return-void
.end method

.method private showTotalKicksBar()V
    .locals 5

    .line 390
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v1, 0x7f0907a5

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    const v1, 0x7f0907a8

    .line 391
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 392
    iget-object v2, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsBalance:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f0907a6

    .line 393
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 394
    iget-object v2, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsBalance:Ljava/lang/Integer;

    .line 395
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const v4, 0x7f0f0010

    invoke-virtual {v2, v4, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v2

    .line 394
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v1, 0x320

    .line 397
    invoke-direct {p0, v1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->getFadeInAnimation(I)Landroid/view/animation/AlphaAnimation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 v1, 0x0

    .line 398
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    return-void
.end method

.method private spinBallOuter()V
    .locals 6

    .line 224
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const v1, 0x7f09005e

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 225
    new-instance v1, Landroid/view/animation/RotateAnimation;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    const/4 v4, 0x0

    const/high16 v5, 0x43b40000    # 360.0f

    invoke-direct {v1, v4, v5, v2, v3}, Landroid/view/animation/RotateAnimation;-><init>(FFFF)V

    iput-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballOuterSpin:Landroid/view/animation/RotateAnimation;

    .line 226
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballOuterSpin:Landroid/view/animation/RotateAnimation;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    .line 227
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballOuterSpin:Landroid/view/animation/RotateAnimation;

    new-instance v2, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/animation/RotateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 229
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballOuterSpin:Landroid/view/animation/RotateAnimation;

    invoke-virtual {v1, p0}, Landroid/view/animation/RotateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 230
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballOuterSpin:Landroid/view/animation/RotateAnimation;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method


# virtual methods
.method public backViewWillShow()V
    .locals 0

    return-void
.end method

.method public destroy()V
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->firstFadeOutAnim:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    .line 140
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->removeAllListeners()V

    .line 142
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->secondFadeOutAnim:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_1

    .line 143
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->removeAllListeners()V

    :cond_1
    return-void
.end method

.method public flipViewFinished()V
    .locals 4

    .line 585
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 588
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->successfulWalkin:Z

    if-eqz v0, :cond_0

    .line 589
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/shopkick/app/overlays/controllers/-$$Lambda$WalkinAnimationController$n0VF9rSaRiAPyk0_qcv3IMHs0sM;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/controllers/-$$Lambda$WalkinAnimationController$n0VF9rSaRiAPyk0_qcv3IMHs0sM;-><init>(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 595
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/shopkick/app/overlays/controllers/-$$Lambda$WalkinAnimationController$Nl2TWJBa4EOfXul-PYuQam_akb0;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/controllers/-$$Lambda$WalkinAnimationController$Nl2TWJBa4EOfXul-PYuQam_akb0;-><init>(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)V

    const-wide/16 v2, 0x9c4

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/RelativeLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    return-void
.end method

.method public frontViewWillShow()V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .line 436
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballEnterAnim:Landroid/view/animation/AnimationSet;

    if-ne p1, v0, :cond_0

    .line 437
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->spinBallOuter()V

    goto/16 :goto_0

    .line 438
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballOuterSpin:Landroid/view/animation/RotateAnimation;

    if-ne p1, v0, :cond_5

    .line 439
    iget-boolean p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->waitingForServer:Z

    if-eqz p1, :cond_1

    .line 440
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->spinBallOuter()V

    goto :goto_0

    .line 442
    :cond_1
    iget-boolean p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->successfulWalkin:Z

    if-nez p1, :cond_2

    .line 444
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->flipToError()V

    goto :goto_0

    .line 445
    :cond_2
    iget-boolean p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->rewardChosen:Z

    if-eqz p1, :cond_4

    .line 447
    iget-object p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->rewardOverlayController:Lcom/shopkick/app/overlays/controllers/RewardOverlayController;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->isImageReceived()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 448
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->fadeOutInitialGreeting()V

    goto :goto_0

    .line 450
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->spinBallOuter()V

    goto :goto_0

    .line 454
    :cond_4
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->fadeOutInitialGreeting()V

    goto :goto_0

    .line 457
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->initialGreetingFadeOutAnim:Landroid/view/animation/AlphaAnimation;

    if-ne p1, v0, :cond_6

    .line 458
    iget-object p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->callback:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;

    invoke-interface {p1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;->onInitialGreetingShown()V

    .line 459
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->showKicks()V

    goto :goto_0

    .line 460
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->showKicksAnim:Landroid/view/animation/AnimationSet;

    if-ne p1, v0, :cond_7

    .line 461
    iget-object p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->callback:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;

    invoke-interface {p1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;->onKicksShown()V

    goto :goto_0

    .line 462
    :cond_7
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballExitAnim:Landroid/view/animation/ScaleAnimation;

    if-ne p1, v0, :cond_8

    .line 463
    iget-object p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->callback:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;

    invoke-interface {p1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;->onWalkinFinished()V

    goto :goto_0

    .line 464
    :cond_8
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->firstcheckmarkAnim:Landroid/view/animation/AnimationSet;

    if-ne p1, v0, :cond_9

    .line 465
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->animateCheckmarkOut()V

    .line 466
    iget-object p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->callback:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;

    invoke-interface {p1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;->onCheckmarkAnimatingOut()V

    goto :goto_0

    .line 467
    :cond_9
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->secondCheckmarkAnim:Landroid/view/animation/AnimationSet;

    if-ne p1, v0, :cond_a

    .line 468
    iget-object p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->callback:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;

    invoke-interface {p1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;->onCheckmarkAnimationFinished()V

    .line 469
    iget-object p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->handler:Landroid/os/Handler;

    new-instance v0, Lcom/shopkick/app/overlays/controllers/-$$Lambda$WalkinAnimationController$sqMPuw3659LLsUVJRP2g3oVabfQ;

    invoke-direct {v0, p0}, Lcom/shopkick/app/overlays/controllers/-$$Lambda$WalkinAnimationController$sqMPuw3659LLsUVJRP2g3oVabfQ;-><init>(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;)V

    const-wide/16 v1, 0x32

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_a
    :goto_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 497
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_0

    .line 498
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballExit()V

    :cond_0
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    .line 504
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090727

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 505
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 506
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 508
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eqz v1, :cond_4

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-ne v1, v4, :cond_1

    goto :goto_0

    .line 516
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p2

    if-ne p2, v3, :cond_5

    const/16 p2, 0x8

    .line 517
    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 518
    iget-object p2, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 519
    iget-object p2, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    if-ne p1, p2, :cond_5

    .line 520
    iget-boolean p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->successfulWalkin:Z

    if-eqz p1, :cond_5

    .line 521
    iget-object p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useStoreDetailsScreen:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 522
    iget-object p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->baseActivity:Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p1

    .line 523
    iget-boolean p2, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->isOnlineWalkin:Z

    if-eqz p2, :cond_2

    .line 524
    instance-of p2, p1, Lcom/shopkick/app/store/StoreDetailsScreen;

    if-eqz p2, :cond_2

    .line 525
    check-cast p1, Lcom/shopkick/app/store/StoreDetailsScreen;

    .line 526
    invoke-virtual {p1}, Lcom/shopkick/app/store/StoreDetailsScreen;->walkinCheckmarkCoordinates()[I

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->walkinIconCoordinates:[I

    .line 527
    invoke-virtual {p1}, Lcom/shopkick/app/store/StoreDetailsScreen;->walkinCheckmarkDimensions()[I

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->walkinIconDimensions:[I

    .line 530
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->animateCheckMarkIn()V

    goto :goto_1

    .line 532
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->flipToReward()V

    goto :goto_1

    .line 509
    :cond_4
    :goto_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v1

    div-int/2addr v1, v4

    sub-int/2addr p1, v1

    .line 510
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    float-to-int p2, p2

    invoke-virtual {v0}, Landroid/widget/ImageView;->getHeight()I

    move-result v1

    div-int/2addr v1, v4

    sub-int/2addr p2, v1

    .line 511
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v4, -0x2

    invoke-direct {v1, v4, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 514
    invoke-virtual {v1, p1, p2, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 515
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_5
    :goto_1
    return v3
.end method

.method public serverReached(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 562
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->waitingForServer:Z

    .line 563
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->isOnlineWalkin:Z

    return-void
.end method

.method public setCallback(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->callback:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;

    return-void
.end method

.method public setupExtraWalkinMsg()V
    .locals 1

    const/4 v0, 0x1

    .line 550
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->enableExtraWalkinMsg:Z

    return-void
.end method

.method public setupFacebookButton()V
    .locals 1

    const/4 v0, 0x1

    .line 558
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->enableFacebook:Z

    return-void
.end method

.method public setupFailureWalkinFlip()V
    .locals 1

    const/4 v0, 0x0

    .line 554
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->successfulWalkin:Z

    return-void
.end method

.method public setupRewardsView(Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V
    .locals 1

    .line 568
    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 569
    :goto_0
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->rewardChosen:Z

    .line 570
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->rewardOverlayController:Lcom/shopkick/app/overlays/controllers/RewardOverlayController;

    invoke-virtual {v0, p1, p2}, Lcom/shopkick/app/overlays/controllers/RewardOverlayController;->setupView(Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V

    return-void
.end method

.method public setupSuccessfulWalkinFlip()V
    .locals 1

    const/4 v0, 0x1

    .line 541
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->successfulWalkin:Z

    .line 542
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public startBallEnterAnim()V
    .locals 8

    .line 152
    new-instance v7, Lcom/shopkick/app/animation/PulseAnimationSet;

    const/4 v1, 0x0

    const v2, 0x3f87ae14    # 1.06f

    const/4 v3, 0x0

    const v4, 0x3f87ae14    # 1.06f

    const/16 v5, 0x12c

    const/16 v6, 0x64

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/animation/PulseAnimationSet;-><init>(FFFFII)V

    .line 157
    invoke-virtual {v7}, Lcom/shopkick/app/animation/PulseAnimationSet;->getPulseAnimationSet()Landroid/view/animation/AnimationSet;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballEnterAnim:Landroid/view/animation/AnimationSet;

    .line 158
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballEnterAnim:Landroid/view/animation/AnimationSet;

    invoke-virtual {v0, p0}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 159
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballEnterAnim:Landroid/view/animation/AnimationSet;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 162
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->flagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isUpdatedWalkinGreetingEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->playUpdatedWalkinAnimationSet()V

    :cond_0
    return-void
.end method

.method public startWoohooBallEnterAnim(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x1

    .line 208
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->woohooGreetingShown:Z

    .line 209
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const v1, 0x7f090311

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 211
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->ballImage:Landroid/widget/RelativeLayout;

    const v1, 0x7f090850

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    const v1, 0x7f090479

    .line 212
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f090476

    .line 213
    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 215
    iget-object v3, p0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f110159

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 216
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x0

    .line 218
    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 220
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->startBallEnterAnim()V

    return-void
.end method
