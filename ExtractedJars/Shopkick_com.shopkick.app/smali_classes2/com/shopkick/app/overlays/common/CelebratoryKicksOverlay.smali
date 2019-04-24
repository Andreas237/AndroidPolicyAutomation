.class public Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "CelebratoryKicksOverlay.java"

# interfaces
.implements Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$BubbleAnimationCallback;
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static ANIM_BUBBZ_SIZE_MAX_H_PIXELS:I = 0x0

.field private static final ANIM_CONTENT_TRANS_Y_DP:I = 0x20

.field private static ANIM_CONTENT_TRANS_Y_PIXELS:I = 0x0

.field private static final ANIM_DURATION_MAX_100:I = 0x320

.field private static final ANIM_DURATION_MAX_50:I = 0x190

.field private static final ANIM_HIDE_MAX_TRANS_Y_DP:I = 0xc4

.field private static ANIM_HIDE_MAX_TRANS_Y_PIXELS:I = 0x0

.field private static final ANIM_INIT_DURATION:I = 0x12c

.field private static final ANIM_INIT_TRANS_Y_DP:I = 0x80

.field private static ANIM_INIT_TRANS_Y_PIXELS:I = 0x0

.field private static ANIM_SURFACE_SIZE_MAX_H_PIXELS:I = 0x0

.field private static final ANIM_SURFACE_SIZE_MAX_W_DP:I = 0x120

.field private static ANIM_SURFACE_SIZE_MAX_W_PIXELS:I = 0x0

.field private static final ANIM_SURFACE_SIZE_MIN_H_DP:I = 0xc8

.field private static ANIM_SURFACE_SIZE_MIN_H_PIXELS:I = 0x0

.field private static final ANIM_SURFACE_SIZE_MIN_W_DP:I = 0x90

.field private static ANIM_SURFACE_SIZE_MIN_W_PIXELS:I = 0x0

.field private static final BALL_CONSTANT_SIZE_DP:I = 0xb4

.field private static BALL_CONSTANT_SIZE_PIXELS:I


# instance fields
.field private animatorBallAlpha:Landroid/animation/ValueAnimator;

.field private animatorBallSize:Landroid/animation/ValueAnimator;

.field private animatorBubbz:Landroid/animation/ValueAnimator;

.field private animatorContentAlphaTransY:Landroid/animation/ValueAnimator;

.field private animatorHide:Landroid/animation/ValueAnimator;

.field private animatorInit:Landroid/animation/ValueAnimator;

.field private animatorSurface:Landroid/animation/ValueAnimator;

.field private ball:Landroid/widget/ImageView;

.field private btnClose:Lcom/shopkick/app/logging/UserEventImageView;

.field private btnPositive:Lcom/shopkick/app/widget/SKButton;

.field private bubblesAnimationController:Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;

.field private bubbzSurface:Landroid/widget/FrameLayout;

.field private desc:Lcom/shopkick/app/widget/SKTextView;

.field private dispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private kicksAmount:Lcom/shopkick/app/widget/SKTextView;

.field private kicksLabel:Lcom/shopkick/app/widget/SKTextView;

.field private layout:Landroid/view/View;

.field private surfaceLayout:Landroid/view/View;

.field private title:Lcom/shopkick/app/widget/SKTextView;

.field private updateAnimatorContentAlphaTransY:Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)Landroid/view/View;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->surfaceLayout:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$100()I
    .locals 1

    .line 39
    sget v0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_SURFACE_SIZE_MIN_W_PIXELS:I

    return v0
.end method

.method static synthetic access$200()I
    .locals 1

    .line 39
    sget v0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_SURFACE_SIZE_MIN_H_PIXELS:I

    return v0
.end method

.method static synthetic access$300(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)Landroid/widget/FrameLayout;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->bubbzSurface:Landroid/widget/FrameLayout;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->startAnimsForShow()V

    return-void
.end method

.method static synthetic access$500(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)Landroid/view/View;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->layout:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->setupTreeObserverBeforeReveal()V

    return-void
.end method

.method private instantiateAnimatorsForReveal()V
    .locals 10

    const/4 v0, 0x2

    .line 178
    new-array v1, v0, [F

    fill-array-data v1, :array_0

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorInit:Landroid/animation/ValueAnimator;

    .line 179
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorInit:Landroid/animation/ValueAnimator;

    const-wide/16 v2, 0x12c

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 180
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorInit:Landroid/animation/ValueAnimator;

    new-instance v4, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;

    invoke-direct {v4}, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;-><init>()V

    invoke-virtual {v1, v4}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 181
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorInit:Landroid/animation/ValueAnimator;

    new-instance v4, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$1;

    invoke-direct {v4, p0}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$1;-><init>(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)V

    invoke-virtual {v1, v4}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 202
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorInit:Landroid/animation/ValueAnimator;

    new-instance v4, Lcom/shopkick/app/overlays/common/-$$Lambda$CelebratoryKicksOverlay$9vmnsSSxPFshRww38LAezHvCjmY;

    invoke-direct {v4, p0}, Lcom/shopkick/app/overlays/common/-$$Lambda$CelebratoryKicksOverlay$9vmnsSSxPFshRww38LAezHvCjmY;-><init>(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)V

    invoke-virtual {v1, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 212
    new-array v1, v0, [F

    fill-array-data v1, :array_1

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorSurface:Landroid/animation/ValueAnimator;

    .line 213
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorSurface:Landroid/animation/ValueAnimator;

    const-wide/16 v4, 0x320

    invoke-virtual {v1, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 214
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorSurface:Landroid/animation/ValueAnimator;

    new-instance v6, Landroid/view/animation/OvershootInterpolator;

    const/high16 v7, 0x40000000    # 2.0f

    invoke-direct {v6, v7}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    invoke-virtual {v1, v6}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 215
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorSurface:Landroid/animation/ValueAnimator;

    new-instance v6, Lcom/shopkick/app/overlays/common/-$$Lambda$CelebratoryKicksOverlay$0-qteJP6BxiEtnss0hFUEpZjEjg;

    invoke-direct {v6, p0}, Lcom/shopkick/app/overlays/common/-$$Lambda$CelebratoryKicksOverlay$0-qteJP6BxiEtnss0hFUEpZjEjg;-><init>(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)V

    invoke-virtual {v1, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 231
    new-array v1, v0, [F

    fill-array-data v1, :array_2

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBubbz:Landroid/animation/ValueAnimator;

    .line 232
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBubbz:Landroid/animation/ValueAnimator;

    invoke-virtual {v1, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 233
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBubbz:Landroid/animation/ValueAnimator;

    new-instance v4, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;

    invoke-direct {v4}, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;-><init>()V

    invoke-virtual {v1, v4}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 234
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBubbz:Landroid/animation/ValueAnimator;

    new-instance v4, Lcom/shopkick/app/overlays/common/-$$Lambda$CelebratoryKicksOverlay$MQgK7KYc8l7j41jHsXAI0BWLNT8;

    invoke-direct {v4, p0}, Lcom/shopkick/app/overlays/common/-$$Lambda$CelebratoryKicksOverlay$MQgK7KYc8l7j41jHsXAI0BWLNT8;-><init>(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)V

    invoke-virtual {v1, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 253
    new-array v1, v0, [F

    fill-array-data v1, :array_3

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallAlpha:Landroid/animation/ValueAnimator;

    .line 254
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallAlpha:Landroid/animation/ValueAnimator;

    const-wide/16 v4, 0x190

    invoke-virtual {v1, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 255
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 256
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallAlpha:Landroid/animation/ValueAnimator;

    new-instance v6, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;

    invoke-direct {v6}, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;-><init>()V

    invoke-virtual {v1, v6}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 257
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallAlpha:Landroid/animation/ValueAnimator;

    new-instance v6, Lcom/shopkick/app/overlays/common/-$$Lambda$CelebratoryKicksOverlay$kWLmCf6YOEV-4T7d6ILACky4RVM;

    invoke-direct {v6, p0}, Lcom/shopkick/app/overlays/common/-$$Lambda$CelebratoryKicksOverlay$kWLmCf6YOEV-4T7d6ILACky4RVM;-><init>(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)V

    invoke-virtual {v1, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 263
    new-array v1, v0, [I

    sget v6, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->BALL_CONSTANT_SIZE_PIXELS:I

    div-int/lit8 v8, v6, 0x2

    const/4 v9, 0x0

    aput v8, v1, v9

    const/4 v8, 0x1

    aput v6, v1, v8

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallSize:Landroid/animation/ValueAnimator;

    .line 264
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallSize:Landroid/animation/ValueAnimator;

    invoke-virtual {v1, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 265
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallSize:Landroid/animation/ValueAnimator;

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 266
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallSize:Landroid/animation/ValueAnimator;

    new-instance v2, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v2, v7}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 267
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallSize:Landroid/animation/ValueAnimator;

    new-instance v2, Lcom/shopkick/app/overlays/common/-$$Lambda$CelebratoryKicksOverlay$9Ypmk5RegsHql-AXvTvp_D7EJ0U;

    invoke-direct {v2, p0}, Lcom/shopkick/app/overlays/common/-$$Lambda$CelebratoryKicksOverlay$9Ypmk5RegsHql-AXvTvp_D7EJ0U;-><init>(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 277
    new-array v0, v0, [F

    fill-array-data v0, :array_4

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorContentAlphaTransY:Landroid/animation/ValueAnimator;

    .line 278
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorContentAlphaTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 279
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorContentAlphaTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v4, v5}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 280
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorContentAlphaTransY:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;

    invoke-direct {v1}, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 281
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorContentAlphaTransY:Landroid/animation/ValueAnimator;

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->updateAnimatorContentAlphaTransY:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
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

    :array_4
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private instantiateViews()V
    .locals 2

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->layout:Landroid/view/View;

    const v1, 0x7f0904f0

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->surfaceLayout:Landroid/view/View;

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->layout:Landroid/view/View;

    const v1, 0x7f0904ec

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->bubbzSurface:Landroid/widget/FrameLayout;

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->layout:Landroid/view/View;

    const v1, 0x7f0904e7

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ball:Landroid/widget/ImageView;

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->layout:Landroid/view/View;

    const v1, 0x7f0904ee

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->kicksAmount:Lcom/shopkick/app/widget/SKTextView;

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->layout:Landroid/view/View;

    const v1, 0x7f0904ef

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->kicksLabel:Lcom/shopkick/app/widget/SKTextView;

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->layout:Landroid/view/View;

    const v1, 0x7f0904f1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->title:Lcom/shopkick/app/widget/SKTextView;

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->layout:Landroid/view/View;

    const v1, 0x7f0904ed

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->desc:Lcom/shopkick/app/widget/SKTextView;

    .line 146
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->layout:Landroid/view/View;

    const v1, 0x7f0904e9

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/UserEventImageView;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->btnClose:Lcom/shopkick/app/logging/UserEventImageView;

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->layout:Landroid/view/View;

    const v1, 0x7f0904ea

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->btnPositive:Lcom/shopkick/app/widget/SKButton;

    return-void
.end method

.method public static synthetic lambda$instantiateAnimatorsForReveal$153(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 203
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->surfaceLayout:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, p1

    sget v2, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_INIT_TRANS_Y_PIXELS:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 206
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->surfaceLayout:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 208
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->surfaceLayout:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public static synthetic lambda$instantiateAnimatorsForReveal$154(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 218
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    .line 221
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->surfaceLayout:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    sget v1, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_SURFACE_SIZE_MIN_W_PIXELS:I

    int-to-float v2, v1

    sget v3, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_SURFACE_SIZE_MAX_W_PIXELS:I

    sub-int/2addr v3, v1

    int-to-float v1, v3

    mul-float/2addr v1, p1

    add-float/2addr v2, v1

    float-to-int v1, v2

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 224
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->surfaceLayout:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    sget v1, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_SURFACE_SIZE_MIN_H_PIXELS:I

    int-to-float v2, v1

    sget v3, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_SURFACE_SIZE_MAX_H_PIXELS:I

    sub-int/2addr v3, v1

    int-to-float v1, v3

    mul-float/2addr p1, v1

    add-float/2addr v2, p1

    float-to-int p1, v2

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 227
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->surfaceLayout:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public static synthetic lambda$instantiateAnimatorsForReveal$155(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;Landroid/animation/ValueAnimator;)V
    .locals 5

    .line 235
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    .line 239
    sget v0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_SURFACE_SIZE_MIN_H_PIXELS:I

    int-to-float v1, v0

    sget v2, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_BUBBZ_SIZE_MAX_H_PIXELS:I

    sub-int/2addr v2, v0

    int-to-float v0, v2

    mul-float/2addr v0, p1

    add-float/2addr v1, v0

    float-to-int v0, v1

    .line 242
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->bubbzSurface:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    sget v2, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_SURFACE_SIZE_MIN_W_PIXELS:I

    int-to-float v3, v2

    sget v4, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_SURFACE_SIZE_MAX_W_PIXELS:I

    sub-int/2addr v4, v2

    int-to-float v2, v4

    mul-float/2addr p1, v2

    add-float/2addr v3, p1

    float-to-int p1, v3

    iput p1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 245
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->bubbzSurface:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    sget v1, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_BUBBZ_SIZE_MAX_H_PIXELS:I

    if-le v0, v1, :cond_0

    move v0, v1

    :cond_0
    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 249
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->bubbzSurface:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method

.method public static synthetic lambda$instantiateAnimatorsForReveal$156(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 258
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    .line 259
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ball:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setAlpha(F)V

    return-void
.end method

.method public static synthetic lambda$instantiateAnimatorsForReveal$157(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 269
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 270
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ball:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 271
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ball:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 273
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ball:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->requestLayout()V

    return-void
.end method

.method public static synthetic lambda$setupAnimatorVars$152(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 165
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    .line 166
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->btnClose:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventImageView;->setAlpha(F)V

    .line 167
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->kicksAmount:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 168
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->kicksLabel:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->title:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->desc:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->btnPositive:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKButton;->setAlpha(F)V

    return-void
.end method

.method public static synthetic lambda$setupAnimatorsForHide$158(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 366
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 367
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->surfaceLayout:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 368
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->surfaceLayout:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, p1

    sget p1, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_HIDE_MAX_TRANS_Y_PIXELS:I

    int-to-float p1, p1

    mul-float/2addr v1, p1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method private setupAnimatorVars(Landroid/content/Context;)V
    .locals 1

    const/16 v0, 0x80

    .line 152
    invoke-static {v0, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v0

    sput v0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_INIT_TRANS_Y_PIXELS:I

    const/16 v0, 0x90

    .line 154
    invoke-static {v0, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v0

    sput v0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_SURFACE_SIZE_MIN_W_PIXELS:I

    const/16 v0, 0xc8

    .line 155
    invoke-static {v0, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v0

    sput v0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_SURFACE_SIZE_MIN_H_PIXELS:I

    const/16 v0, 0x120

    .line 156
    invoke-static {v0, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v0

    sput v0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_SURFACE_SIZE_MAX_W_PIXELS:I

    const/16 v0, 0xb4

    .line 158
    invoke-static {v0, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v0

    sput v0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->BALL_CONSTANT_SIZE_PIXELS:I

    const/16 v0, 0x20

    .line 160
    invoke-static {v0, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v0

    sput v0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_CONTENT_TRANS_Y_PIXELS:I

    const/16 v0, 0xc4

    .line 162
    invoke-static {v0, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result p1

    sput p1, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_HIDE_MAX_TRANS_Y_PIXELS:I

    .line 164
    new-instance p1, Lcom/shopkick/app/overlays/common/-$$Lambda$CelebratoryKicksOverlay$4Dsm69KOI7xOyVkvbI1U37UTlt8;

    invoke-direct {p1, p0}, Lcom/shopkick/app/overlays/common/-$$Lambda$CelebratoryKicksOverlay$4Dsm69KOI7xOyVkvbI1U37UTlt8;-><init>(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)V

    iput-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->updateAnimatorContentAlphaTransY:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    return-void
.end method

.method private setupAnimatorsForHide()V
    .locals 2

    const/4 v0, 0x2

    .line 349
    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorHide:Landroid/animation/ValueAnimator;

    .line 350
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorHide:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/support/v4/view/animation/FastOutLinearInInterpolator;

    invoke-direct {v1}, Landroid/support/v4/view/animation/FastOutLinearInInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 351
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorHide:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$3;-><init>(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 365
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorHide:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/overlays/common/-$$Lambda$CelebratoryKicksOverlay$_E5vyB5llMbXsnn2Jw1OD6cmrkQ;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/common/-$$Lambda$CelebratoryKicksOverlay$_E5vyB5llMbXsnn2Jw1OD6cmrkQ;-><init>(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 371
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->startAnimsForHide()V

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private setupTreeObserverBeforeReveal()V
    .locals 2

    .line 307
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->surfaceLayout:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->surfaceLayout:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 316
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->surfaceLayout:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    sput v0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_SURFACE_SIZE_MAX_H_PIXELS:I

    .line 317
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->surfaceLayout:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    sput v0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->ANIM_BUBBZ_SIZE_MAX_H_PIXELS:I

    .line 318
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->startAnimsForInit()V

    goto :goto_1

    .line 308
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->surfaceLayout:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$2;-><init>(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :goto_1
    return-void
.end method

.method private setupViews()V
    .locals 3

    .line 286
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->btnClose:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 287
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->btnPositive:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 289
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->numKicks:Ljava/lang/Integer;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->numKicks:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 290
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->kicksAmount:Lcom/shopkick/app/widget/SKTextView;

    const/4 v2, 0x1

    if-ge v0, v2, :cond_1

    const-string v0, "--"

    goto :goto_1

    :cond_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 291
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->title:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 292
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->desc:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 295
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonTitle:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 296
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->btnPositive:Lcom/shopkick/app/widget/SKButton;

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 299
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->setupTreeObserverBeforeReveal()V

    return-void
.end method

.method private startAnimsForHide()V
    .locals 3

    .line 375
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorHide:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x190

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 376
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorHide:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private startAnimsForInit()V
    .locals 2

    .line 330
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorInit:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 331
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->bubblesAnimationController:Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->bubbzSurface:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->animateBackgroundBubbles(Landroid/widget/FrameLayout;Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$BubbleAnimationCallback;)V

    return-void
.end method

.method private startAnimsForShow()V
    .locals 4

    .line 335
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v1, 0x5

    .line 336
    new-array v1, v1, [Landroid/animation/Animator;

    iget-object v2, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorSurface:Landroid/animation/ValueAnimator;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBubbz:Landroid/animation/ValueAnimator;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallAlpha:Landroid/animation/ValueAnimator;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallSize:Landroid/animation/ValueAnimator;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorContentAlphaTransY:Landroid/animation/ValueAnimator;

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 343
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 1

    .line 125
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->layout:Landroid/view/View;

    .line 128
    new-instance v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;

    invoke-direct {v0, p1}, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;->build()Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->bubblesAnimationController:Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;

    .line 130
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->instantiateViews()V

    .line 131
    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->setupAnimatorVars(Landroid/content/Context;)V

    .line 132
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->instantiateAnimatorsForReveal()V

    .line 133
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->setupViews()V

    .line 135
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->layout:Landroid/view/View;

    return-object p1
.end method

.method public dismiss()V
    .locals 2

    .line 395
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 396
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->dispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    .line 398
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->dismiss()V

    return-void
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c005d

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->layout:Landroid/view/View;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 101
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 102
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->dispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method

.method protected obliterateAnimators()V
    .locals 3

    .line 403
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->obliterateAnimators()V

    .line 405
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorInit:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 406
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorInit:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    :cond_0
    const/4 v0, 0x0

    .line 408
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorInit:Landroid/animation/ValueAnimator;

    .line 410
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorSurface:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 411
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorSurface:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 413
    :cond_1
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorSurface:Landroid/animation/ValueAnimator;

    .line 415
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBubbz:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 416
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBubbz:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 418
    :cond_2
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBubbz:Landroid/animation/ValueAnimator;

    .line 420
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallAlpha:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 421
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 423
    :cond_3
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallAlpha:Landroid/animation/ValueAnimator;

    .line 425
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallSize:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 426
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallSize:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 428
    :cond_4
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorBallSize:Landroid/animation/ValueAnimator;

    .line 430
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorContentAlphaTransY:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 431
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->updateAnimatorContentAlphaTransY:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    if-eqz v1, :cond_5

    .line 432
    iget-object v2, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorContentAlphaTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v2, v1}, Landroid/animation/ValueAnimator;->removeUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 434
    :cond_5
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorContentAlphaTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 436
    :cond_6
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorInit:Landroid/animation/ValueAnimator;

    .line 438
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorHide:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 439
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorHide:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 441
    :cond_7
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->animatorHide:Landroid/animation/ValueAnimator;

    return-void
.end method

.method public onBubbleRiseEnd()V
    .locals 0

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 383
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 386
    :pswitch_0
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->setupAnimatorsForHide()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x7f0904e9
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 107
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayFlowType:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 109
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayFlowType:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOverlayFlowType(Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method
