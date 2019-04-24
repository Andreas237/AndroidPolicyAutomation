.class public Lcom/shopkick/app/overlays/controllers/ScanAnimationController;
.super Ljava/lang/Object;
.source "ScanAnimationController.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/overlays/controllers/ScanAnimationController$IScanAnimationControllerCallback;,
        Lcom/shopkick/app/overlays/controllers/ScanAnimationController$SeeMoreScansClickListener;
    }
.end annotation


# static fields
.field private static final BALL_SHRINK_DURATION:I = 0x190

.field private static final BUBBLE_FLOAT_MAX_SPEED:D = 0.018

.field private static final BUBBLE_FLOAT_MIN_SPEED:D = 0.01

.field private static final BUBBLE_LEFT_MIN_CENTER_DELTA_X:I = 0x0

.field private static final BUBBLE_MAX_CENTER_DELTA_X:I = 0x64

.field private static final BUBBLE_MAX_CENTER_Y:I = 0x4b

.field private static final BUBBLE_MAX_IN_SECTION:I = 0x10

.field private static final BUBBLE_MAX_SIZE:I = 0x14

.field private static final BUBBLE_MIN_CENTER_Y:I = 0x0

.field private static final BUBBLE_MIN_IN_SECTION:I = 0xc

.field private static final BUBBLE_MIN_SIZE:I = 0x5

.field private static final BUBBLE_RIGHT_MIN_CENTER_DELTA_X:I = 0xc8

.field private static final BUBBLE_RISE_DECCEL_FACTOR:F = 3.0f

.field private static final BUBBLE_RISE_DISTANCE_OFFSET:I = 0x122

.field private static final BUBBLE_RISE_MAX_DURATION:I = 0x514

.field private static final BUBBLE_RISE_MIN_DURATION:I = 0x384

.field private static final CHECK_PULSE_IN_DURATION:I = 0x4b

.field private static final CHECK_PULSE_MAX_SCALE_FACTOR:F = 1.08f

.field private static final CHECK_PULSE_MIN_SCALE_FACTOR:F = 0.0f

.field private static final CHECK_PULSE_OUT_DURATION:I = 0xc8

.field private static final CHECK_TRANSLATE_DELAY:I = 0x190

.field private static final CHECK_TRANSLATE_DURATION:I = 0x190

.field private static final CONTENT_FADE_IN_OFFSET:I = 0x320

.field private static final FADE_DURATION:I = 0x64

.field private static final FADE_IN_DURATION:I = 0x190

.field public static final SCAN_ANIMATION_SEE_MORE_SCANS_TAPPED_NOTIFICATION:Ljava/lang/String; = "SCAN_ANIMATION_CONTROLLER_SEE_MORE_SCANS_TAPPED_NOTIFCATION"

.field public static final SEE_MORE_SCANS_URL_KEY:Ljava/lang/String; = "SEE_MORE_SCANS_URL_KEY"

.field private static final WHOOSH_SOUND_DELAY:I = 0x64


# instance fields
.field private bubbleFloatAngles:[D

.field private bubbleFloatSpeeds:[D

.field private bubbleViews:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private callback:Lcom/shopkick/app/overlays/controllers/ScanAnimationController$IScanAnimationControllerCallback;

.field private checkmarkEnterAnimation:Landroid/view/animation/AnimationSet;

.field private checkmarkExtendedAnimation:Landroid/view/animation/AnimationSet;

.field private context:Landroid/content/Context;

.field private enteredExtendedAnimation:Z

.field private floatAnimations:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Landroid/view/animation/TranslateAnimation;",
            ">;"
        }
    .end annotation
.end field

.field private foregroundContentFadeInAnimation:Landroid/view/animation/Animation;

.field private handler:Landroid/os/Handler;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

.field private overlayView:Landroid/widget/RelativeLayout;

.field private rand:Ljava/util/Random;

.field private seeMoreScansButton:Lcom/shopkick/app/widget/SKButton;

.field private soundManager:Lcom/shopkick/app/sounds/SoundManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/sounds/SoundManager;Landroid/widget/RelativeLayout;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/controllers/ScanAnimationController$IScanAnimationControllerCallback;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 0

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->context:Landroid/content/Context;

    .line 112
    iput-object p2, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    .line 113
    iput-object p3, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    .line 114
    iput-object p4, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 115
    iput-object p5, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->callback:Lcom/shopkick/app/overlays/controllers/ScanAnimationController$IScanAnimationControllerCallback;

    .line 116
    iput-object p6, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 118
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->bubbleViews:Ljava/util/ArrayList;

    .line 119
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->floatAnimations:Ljava/util/HashMap;

    .line 120
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->rand:Ljava/util/Random;

    .line 122
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/controllers/ScanAnimationController;)Landroid/content/Context;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/overlays/controllers/ScanAnimationController;)Lcom/shopkick/app/sounds/SoundManager;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/overlays/controllers/ScanAnimationController;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->animateForegroundContentFadeIn()V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/app/overlays/controllers/ScanAnimationController;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->animateBubbleFloat()V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/overlays/controllers/ScanAnimationController;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->handleSeeMoreScansTap()V

    return-void
.end method

.method private animateBubbleFloat()V
    .locals 2

    const/4 v0, 0x0

    .line 371
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->bubbleViews:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 372
    invoke-direct {p0, v0}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->animateFloat(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private animateBubbleRise()V
    .locals 6

    .line 356
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->bubbleViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 357
    new-instance v2, Landroid/view/animation/TranslateAnimation;

    const/16 v3, 0x122

    .line 359
    invoke-static {v3, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v3

    int-to-float v3, v3

    const/4 v4, 0x0

    invoke-direct {v2, v4, v4, v3, v4}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 361
    iget-object v3, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->rand:Ljava/util/Random;

    const/16 v4, 0x190

    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    add-int/lit16 v3, v3, 0x384

    rsub-int v4, v3, 0x514

    int-to-long v4, v4

    .line 362
    invoke-virtual {v2, v4, v5}, Landroid/view/animation/TranslateAnimation;->setStartOffset(J)V

    int-to-long v3, v3

    .line 363
    invoke-virtual {v2, v3, v4}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 364
    new-instance v3, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v4, 0x40400000    # 3.0f

    invoke-direct {v3, v4}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    invoke-virtual {v2, v3}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 365
    invoke-virtual {v1, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 v2, 0x0

    .line 366
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private animateBubbles()V
    .locals 4

    .line 246
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v1, 0x7f09005c

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 247
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v2, 0x7f0904f4

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 248
    iget-object v2, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v3, 0x7f0901f9

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    .line 249
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 250
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x0

    .line 251
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 252
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->placeBubbles()V

    .line 253
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->animateBubbleRise()V

    .line 255
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/overlays/controllers/ScanAnimationController$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController$2;-><init>(Lcom/shopkick/app/overlays/controllers/ScanAnimationController;)V

    const-wide/16 v2, 0x320

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 261
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/overlays/controllers/ScanAnimationController$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController$3;-><init>(Lcom/shopkick/app/overlays/controllers/ScanAnimationController;)V

    const-wide/16 v2, 0x514

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private animateCheckMarkIn()V
    .locals 10

    .line 151
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v1, 0x7f0900fe

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 152
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v2, 0x7f09005d

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 153
    new-instance v9, Lcom/shopkick/app/animation/PulseAnimationSet;

    const/4 v3, 0x0

    const v4, 0x3f8a3d71    # 1.08f

    const/4 v5, 0x0

    const v6, 0x3f8a3d71    # 1.08f

    const/16 v7, 0xc8

    const/16 v8, 0x4b

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/app/animation/PulseAnimationSet;-><init>(FFFFII)V

    .line 158
    invoke-virtual {v9}, Lcom/shopkick/app/animation/PulseAnimationSet;->getPulseAnimationSet()Landroid/view/animation/AnimationSet;

    move-result-object v2

    iput-object v2, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->checkmarkEnterAnimation:Landroid/view/animation/AnimationSet;

    .line 160
    iget-object v2, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->checkmarkEnterAnimation:Landroid/view/animation/AnimationSet;

    invoke-virtual {v2, p0}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 161
    new-instance v2, Landroid/view/animation/AlphaAnimation;

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v3, 0xc8

    .line 162
    invoke-virtual {v2, v3, v4}, Landroid/view/animation/AlphaAnimation;->setStartOffset(J)V

    const-wide/16 v3, 0x1

    .line 163
    invoke-virtual {v2, v3, v4}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    const/4 v3, 0x1

    .line 164
    invoke-virtual {v2, v3}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 166
    iget-object v3, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->checkmarkEnterAnimation:Landroid/view/animation/AnimationSet;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 v3, 0x0

    .line 167
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 168
    invoke-virtual {v1, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->callback:Lcom/shopkick/app/overlays/controllers/ScanAnimationController$IScanAnimationControllerCallback;

    invoke-interface {v0}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController$IScanAnimationControllerCallback;->onCheckmarkAnimationStarted()V

    return-void
.end method

.method private animateCheckmarkExtendedAnimation()V
    .locals 24

    move-object/from16 v0, p0

    const/4 v1, 0x1

    .line 173
    iput-boolean v1, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->enteredExtendedAnimation:Z

    .line 174
    iget-object v2, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v3, 0x7f09065c

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/SKButton;

    iput-object v2, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->seeMoreScansButton:Lcom/shopkick/app/widget/SKButton;

    .line 175
    iget-object v2, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->seeMoreScansButton:Lcom/shopkick/app/widget/SKButton;

    new-instance v3, Lcom/shopkick/app/overlays/controllers/ScanAnimationController$SeeMoreScansClickListener;

    invoke-direct {v3, v0}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController$SeeMoreScansClickListener;-><init>(Lcom/shopkick/app/overlays/controllers/ScanAnimationController;)V

    invoke-virtual {v2, v3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 177
    new-instance v2, Landroid/view/animation/AnimationSet;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    iput-object v2, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->checkmarkExtendedAnimation:Landroid/view/animation/AnimationSet;

    .line 178
    iget-object v2, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v4, 0x7f09005c

    invoke-virtual {v2, v4}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const v4, 0x7f09005e

    .line 179
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 180
    iget-object v5, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v6, 0x7f090603

    invoke-virtual {v5, v6}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 183
    iget-object v6, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v7, 0x7f0900fe

    invoke-virtual {v6, v7}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout;

    .line 184
    iget-object v7, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v8, 0x7f0901f9

    invoke-virtual {v7, v8}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/FrameLayout;

    const/4 v8, 0x2

    .line 185
    new-array v9, v8, [I

    .line 186
    new-array v8, v8, [I

    .line 188
    invoke-virtual {v2, v9}, Landroid/view/View;->getLocationInWindow([I)V

    .line 189
    invoke-virtual {v6, v8}, Landroid/widget/RelativeLayout;->getLocationInWindow([I)V

    .line 190
    invoke-virtual {v7}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v10

    .line 191
    invoke-virtual {v7}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v11

    .line 192
    invoke-virtual {v7}, Landroid/widget/FrameLayout;->getLeft()I

    move-result v12

    .line 193
    invoke-virtual {v7}, Landroid/widget/FrameLayout;->getTop()I

    move-result v7

    .line 194
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v13

    int-to-float v10, v10

    .line 195
    invoke-virtual {v6}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v14

    int-to-float v14, v14

    div-float v19, v10, v14

    .line 196
    new-instance v14, Landroid/view/animation/ScaleAnimation;

    const/high16 v16, 0x3f800000    # 1.0f

    const/high16 v18, 0x3f800000    # 1.0f

    const/16 v20, 0x1

    const/high16 v21, 0x3f000000    # 0.5f

    const/16 v22, 0x1

    const/high16 v23, 0x3f000000    # 0.5f

    move-object v15, v14

    move/from16 v17, v19

    invoke-direct/range {v15 .. v23}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    move-object/from16 v16, v2

    const-wide/16 v1, 0x190

    .line 204
    invoke-virtual {v14, v1, v2}, Landroid/view/animation/ScaleAnimation;->setStartOffset(J)V

    .line 205
    invoke-virtual {v14, v1, v2}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 206
    new-instance v15, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v15}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v14, v15}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 207
    new-instance v15, Landroid/view/animation/TranslateAnimation;

    int-to-float v12, v12

    const/high16 v18, 0x40000000    # 2.0f

    div-float v10, v10, v18

    add-float/2addr v12, v10

    aget v9, v9, v3

    int-to-float v9, v9

    int-to-float v10, v13

    div-float v10, v10, v18

    add-float/2addr v9, v10

    sub-float/2addr v12, v9

    int-to-float v7, v7

    int-to-float v9, v11

    div-float v9, v9, v18

    add-float/2addr v7, v9

    const/4 v9, 0x1

    aget v8, v8, v9

    move-object v9, v15

    int-to-float v8, v8

    .line 210
    invoke-virtual {v6}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v6

    int-to-float v6, v6

    div-float v6, v6, v18

    add-float/2addr v8, v6

    sub-float/2addr v7, v8

    const/4 v6, 0x0

    invoke-direct {v9, v6, v12, v6, v7}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 211
    new-instance v7, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v7}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v9, v7}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 212
    invoke-virtual {v9, v1, v2}, Landroid/view/animation/TranslateAnimation;->setStartOffset(J)V

    .line 213
    invoke-virtual {v9, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 215
    new-instance v7, Landroid/view/animation/AlphaAnimation;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct {v7, v8, v6}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 216
    invoke-virtual {v7, v1, v2}, Landroid/view/animation/AlphaAnimation;->setStartOffset(J)V

    const-wide/16 v10, 0x64

    .line 217
    invoke-virtual {v7, v10, v11}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 218
    new-instance v12, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v12}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v7, v12}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    const/4 v12, 0x1

    .line 219
    invoke-virtual {v7, v12}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 221
    iget-object v12, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->checkmarkExtendedAnimation:Landroid/view/animation/AnimationSet;

    invoke-virtual {v12, v14}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 222
    iget-object v12, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->checkmarkExtendedAnimation:Landroid/view/animation/AnimationSet;

    invoke-virtual {v12, v9}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 223
    iget-object v9, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->checkmarkExtendedAnimation:Landroid/view/animation/AnimationSet;

    invoke-virtual {v9, v3}, Landroid/view/animation/AnimationSet;->setFillAfter(Z)V

    .line 225
    iget-object v9, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->checkmarkExtendedAnimation:Landroid/view/animation/AnimationSet;

    invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 227
    new-instance v9, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v9, v6, v8}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 228
    invoke-virtual {v9, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 229
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v9, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    const/4 v1, 0x1

    .line 230
    invoke-virtual {v9, v1}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 232
    iget-object v1, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->checkmarkExtendedAnimation:Landroid/view/animation/AnimationSet;

    move-object/from16 v2, v16

    invoke-virtual {v2, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 233
    invoke-virtual {v4, v7}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 234
    invoke-virtual {v5, v9}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 235
    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 237
    iget-object v1, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->handler:Landroid/os/Handler;

    new-instance v2, Lcom/shopkick/app/overlays/controllers/ScanAnimationController$1;

    invoke-direct {v2, v0}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController$1;-><init>(Lcom/shopkick/app/overlays/controllers/ScanAnimationController;)V

    invoke-virtual {v1, v2, v10, v11}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private animateFloat(I)V
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 377
    iget-object v2, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->bubbleViews:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    const/16 v3, 0x12c

    .line 379
    invoke-static {v3, v2}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v3

    int-to-double v3, v3

    const/16 v5, 0x4b

    .line 382
    invoke-static {v5, v2}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v5

    int-to-double v5, v5

    .line 383
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 385
    iget v8, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    int-to-double v8, v8

    iget v10, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    div-int/lit8 v10, v10, 0x2

    int-to-double v10, v10

    const-wide/16 v12, 0x0

    sub-double v10, v12, v10

    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    add-double/2addr v10, v14

    cmpg-double v8, v8, v10

    if-gez v8, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    .line 386
    :goto_0
    iget v11, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    int-to-double v9, v11

    iget v11, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    div-int/lit8 v11, v11, 0x2

    int-to-double v12, v11

    sub-double v11, v3, v12

    sub-double/2addr v11, v14

    cmpl-double v9, v9, v11

    if-lez v9, :cond_1

    const/4 v9, 0x1

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    .line 387
    :goto_1
    iget v10, v7, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    int-to-double v10, v10

    iget v12, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    div-int/lit8 v12, v12, 0x2

    int-to-double v12, v12

    const-wide/16 v17, 0x0

    sub-double v12, v17, v12

    add-double/2addr v12, v14

    cmpg-double v10, v10, v12

    if-gez v10, :cond_2

    const/4 v10, 0x1

    goto :goto_2

    :cond_2
    const/4 v10, 0x0

    .line 388
    :goto_2
    iget v11, v7, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    int-to-double v11, v11

    iget v13, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    div-int/lit8 v13, v13, 0x2

    move-object/from16 v19, v2

    int-to-double v1, v13

    sub-double v1, v5, v1

    sub-double/2addr v1, v14

    cmpl-double v1, v11, v1

    if-lez v1, :cond_3

    const/16 v16, 0x1

    goto :goto_3

    :cond_3
    const/16 v16, 0x0

    :goto_3
    if-nez v8, :cond_4

    if-eqz v9, :cond_6

    :cond_4
    if-eqz v8, :cond_5

    .line 393
    iget v1, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    div-int/lit8 v1, v1, 0x2

    int-to-double v1, v1

    const-wide/16 v8, 0x0

    sub-double v12, v8, v1

    double-to-int v1, v12

    iput v1, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    goto :goto_4

    .line 396
    :cond_5
    iget v1, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    div-int/lit8 v1, v1, 0x2

    int-to-double v1, v1

    sub-double v1, v3, v1

    double-to-int v1, v1

    iput v1, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 399
    :goto_4
    iget-object v1, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->bubbleFloatAngles:[D

    const-wide v8, 0x400921fb60000000L    # 3.1415927410125732

    aget-wide v11, v1, p1

    sub-double/2addr v8, v11

    aput-wide v8, v1, p1

    :cond_6
    const-wide v1, 0x401921fb54442d18L    # 6.283185307179586

    if-nez v10, :cond_7

    if-eqz v16, :cond_9

    :cond_7
    if-eqz v10, :cond_8

    .line 404
    iget v8, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    div-int/lit8 v8, v8, 0x2

    int-to-double v8, v8

    const-wide/16 v10, 0x0

    sub-double v12, v10, v8

    double-to-int v8, v12

    iput v8, v7, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    goto :goto_5

    .line 407
    :cond_8
    iget v8, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    div-int/lit8 v8, v8, 0x2

    int-to-double v8, v8

    sub-double v8, v5, v8

    double-to-int v8, v8

    iput v8, v7, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 410
    :goto_5
    iget-object v8, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->bubbleFloatAngles:[D

    aget-wide v9, v8, p1

    sub-double v9, v1, v9

    aput-wide v9, v8, p1

    .line 412
    :cond_9
    iget-object v8, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->bubbleFloatAngles:[D

    aget-wide v9, v8, p1

    const-wide/16 v11, 0x0

    cmpg-double v9, v9, v11

    if-gez v9, :cond_a

    .line 414
    aget-wide v9, v8, p1

    add-double/2addr v9, v1

    aput-wide v9, v8, p1

    .line 417
    :cond_a
    iget-object v1, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->bubbleFloatAngles:[D

    aget-wide v8, v1, p1

    .line 418
    iget-object v1, v0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->bubbleFloatSpeeds:[D

    aget-wide v10, v1, p1

    .line 421
    invoke-static {v8, v9}, Ljava/lang/Math;->tan(D)D

    move-result-wide v1

    .line 422
    iget v12, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iget v13, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    div-int/lit8 v13, v13, 0x2

    add-int/2addr v12, v13

    int-to-double v12, v12

    .line 423
    iget v14, v7, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iget v15, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    div-int/lit8 v15, v15, 0x2

    add-int/2addr v14, v15

    int-to-double v14, v14

    const-wide v22, 0x3ff921fb54442d18L    # 1.5707963267948966

    cmpg-double v16, v8, v22

    if-gez v16, :cond_b

    div-double v8, v14, v1

    const-wide/high16 v20, 0x3ff0000000000000L    # 1.0

    add-double v8, v8, v20

    sub-double v22, v12, v3

    mul-double v22, v22, v1

    sub-double v22, v22, v20

    goto :goto_6

    :cond_b
    const-wide/high16 v20, 0x3ff0000000000000L    # 1.0

    const-wide v22, 0x400921fb54442d18L    # Math.PI

    cmpg-double v16, v8, v22

    if-gez v16, :cond_c

    div-double v8, v14, v1

    sub-double v8, v8, v20

    mul-double/2addr v1, v12

    sub-double v22, v1, v20

    goto :goto_6

    :cond_c
    const-wide v22, 0x4012d97c7f3321d2L    # 4.71238898038469

    cmpg-double v8, v8, v22

    if-gez v8, :cond_d

    sub-double v8, v14, v5

    div-double/2addr v8, v1

    sub-double v8, v8, v20

    mul-double/2addr v1, v12

    add-double v22, v1, v20

    goto :goto_6

    :cond_d
    sub-double v8, v14, v5

    div-double/2addr v8, v1

    add-double v8, v8, v20

    sub-double v22, v12, v3

    mul-double v22, v22, v1

    add-double v22, v22, v20

    .line 442
    :goto_6
    iget v1, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    int-to-double v1, v1

    add-double/2addr v1, v8

    iget v0, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    div-int/lit8 v0, v0, 0x2

    move-wide/from16 v20, v10

    int-to-double v10, v0

    const-wide/16 v17, 0x0

    sub-double v10, v17, v10

    cmpg-double v0, v1, v10

    if-gez v0, :cond_e

    neg-double v8, v12

    move-wide/from16 v0, v22

    goto :goto_7

    .line 445
    :cond_e
    iget v0, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    int-to-double v0, v0

    add-double/2addr v0, v8

    iget v2, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    div-int/lit8 v2, v2, 0x2

    int-to-double v10, v2

    sub-double v10, v3, v10

    cmpl-double v0, v0, v10

    if-lez v0, :cond_f

    sub-double v8, v3, v12

    move-wide/from16 v0, v22

    goto :goto_7

    .line 448
    :cond_f
    iget v0, v7, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    int-to-double v0, v0

    add-double v0, v0, v22

    iget v2, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    div-int/lit8 v2, v2, 0x2

    int-to-double v2, v2

    const-wide/16 v10, 0x0

    sub-double v12, v10, v2

    cmpg-double v0, v0, v12

    if-gez v0, :cond_10

    neg-double v0, v14

    goto :goto_7

    :cond_10
    sub-double v22, v5, v14

    move-wide/from16 v0, v22

    .line 456
    :goto_7
    new-instance v2, Landroid/view/animation/TranslateAnimation;

    neg-double v3, v8

    double-to-float v3, v3

    neg-double v4, v0

    double-to-float v4, v4

    const/4 v5, 0x0

    invoke-direct {v2, v3, v5, v4, v5}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 457
    invoke-static {v8, v9, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    add-double/2addr v5, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    div-double v3, v3, v20

    double-to-int v3, v3

    int-to-long v3, v3

    .line 458
    invoke-virtual {v2, v3, v4}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 459
    new-instance v3, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v3}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v2, v3}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    move-object/from16 v3, p0

    .line 460
    invoke-virtual {v2, v3}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    const/4 v4, 0x1

    .line 461
    invoke-virtual {v2, v4}, Landroid/view/animation/TranslateAnimation;->setFillAfter(Z)V

    .line 462
    iget v4, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    int-to-double v4, v4

    add-double/2addr v4, v8

    double-to-int v4, v4

    iput v4, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 463
    iget v4, v7, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    int-to-double v4, v4

    add-double/2addr v4, v0

    double-to-int v0, v4

    iput v0, v7, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    move-object/from16 v0, v19

    .line 464
    invoke-virtual {v0, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 466
    invoke-virtual {v0, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 467
    iget-object v0, v3, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->floatAnimations:Ljava/util/HashMap;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private animateForegroundContentFadeIn()V
    .locals 4

    .line 271
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090295

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 272
    new-instance v1, Landroid/view/animation/AlphaAnimation;

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v1, v2, v3}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v2, 0x190

    .line 273
    invoke-virtual {v1, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 274
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    const/4 v2, 0x1

    .line 275
    invoke-virtual {v1, v2}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 276
    invoke-virtual {v1, p0}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 277
    iput-object v1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->foregroundContentFadeInAnimation:Landroid/view/animation/Animation;

    .line 278
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->foregroundContentFadeInAnimation:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 v1, 0x0

    .line 279
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private getRandBubbleColorForInt(I)I
    .locals 3

    const/4 v0, 0x4

    const/16 v1, 0x8

    if-ge p1, v1, :cond_0

    .line 333
    rem-int/2addr p1, v0

    goto :goto_0

    .line 335
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->rand:Ljava/util/Random;

    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    :goto_0
    const/16 v0, 0xff

    const/16 v1, 0xcc

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    .line 351
    invoke-static {p1, p1, p1}, Landroid/graphics/Color;->rgb(III)I

    move-result p1

    return p1

    :pswitch_0
    const/16 p1, 0x96

    const/16 v0, 0x37

    const/16 v2, 0xa0

    .line 349
    invoke-static {v1, p1, v0, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1

    :pswitch_1
    const/16 p1, 0x5a

    const/16 v2, 0x64

    .line 346
    invoke-static {v1, v0, p1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1

    :pswitch_2
    const/16 p1, 0x46

    const/16 v0, 0xeb

    .line 343
    invoke-static {v1, p1, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1

    :pswitch_3
    const/16 p1, 0xbe

    const/16 v2, 0x3c

    .line 340
    invoke-static {v1, v0, p1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private handleSeeMoreScansTap()V
    .locals 3

    .line 283
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->seeAllScansSkUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 284
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "SEE_MORE_SCANS_URL_KEY"

    .line 285
    iget-object v2, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->seeAllScansSkUrl:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "SCAN_ANIMATION_CONTROLLER_SEE_MORE_SCANS_TAPPED_NOTIFCATION"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 287
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->callback:Lcom/shopkick/app/overlays/controllers/ScanAnimationController$IScanAnimationControllerCallback;

    invoke-interface {v0}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController$IScanAnimationControllerCallback;->onSeeMoreScansTapped()V

    :cond_0
    return-void
.end method

.method private placeBubbles()V
    .locals 13

    .line 293
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090603

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 295
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->rand:Ljava/util/Random;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    add-int/lit8 v1, v1, 0xc

    .line 296
    iget-object v3, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->rand:Ljava/util/Random;

    invoke-virtual {v3, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    add-int/lit8 v2, v2, 0xc

    add-int/2addr v2, v1

    .line 298
    new-array v3, v2, [D

    iput-object v3, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->bubbleFloatAngles:[D

    .line 299
    new-array v3, v2, [D

    iput-object v3, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->bubbleFloatSpeeds:[D

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v4, v2, :cond_2

    if-ne v4, v1, :cond_0

    const/16 v5, 0xc8

    :cond_0
    if-lt v4, v1, :cond_1

    sub-int v6, v4, v1

    goto :goto_1

    :cond_1
    move v6, v4

    .line 309
    :goto_1
    new-instance v7, Landroid/view/View;

    iget-object v8, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->context:Landroid/content/Context;

    invoke-direct {v7, v8}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 310
    iget-object v8, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->rand:Ljava/util/Random;

    const/16 v9, 0xf

    invoke-virtual {v8, v9}, Ljava/util/Random;->nextInt(I)I

    move-result v8

    add-int/lit8 v8, v8, 0x5

    .line 311
    new-instance v9, Landroid/widget/FrameLayout$LayoutParams;

    invoke-static {v8, v7}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v10

    .line 312
    invoke-static {v8, v7}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v11

    const/16 v12, 0x33

    invoke-direct {v9, v10, v11, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 313
    iget-object v10, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->rand:Ljava/util/Random;

    div-int/lit8 v8, v8, 0x2

    rsub-int/lit8 v11, v8, 0x64

    .line 314
    invoke-virtual {v10, v11}, Ljava/util/Random;->nextInt(I)I

    move-result v10

    add-int/2addr v10, v5

    .line 313
    invoke-static {v10, v7}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v10

    iput v10, v9, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 315
    iget-object v10, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->rand:Ljava/util/Random;

    rsub-int/lit8 v8, v8, 0x4b

    .line 316
    invoke-virtual {v10, v8}, Ljava/util/Random;->nextInt(I)I

    move-result v8

    add-int/2addr v8, v3

    .line 315
    invoke-static {v8, v7}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v8

    iput v8, v9, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 317
    invoke-virtual {v7, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 318
    new-instance v8, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v9, Landroid/graphics/drawable/shapes/OvalShape;

    invoke-direct {v9}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    invoke-direct {v8, v9}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 319
    invoke-virtual {v8}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v9

    invoke-direct {p0, v6}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->getRandBubbleColorForInt(I)I

    move-result v6

    invoke-virtual {v9, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 320
    invoke-virtual {v7, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v6, 0x8

    .line 321
    invoke-virtual {v7, v6}, Landroid/view/View;->setVisibility(I)V

    .line 322
    iget-object v6, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->bubbleViews:Ljava/util/ArrayList;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 323
    invoke-virtual {v0, v7}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 324
    iget-object v6, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->bubbleFloatAngles:[D

    iget-object v7, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->rand:Ljava/util/Random;

    invoke-virtual {v7}, Ljava/util/Random;->nextFloat()F

    move-result v7

    const/high16 v8, 0x40000000    # 2.0f

    mul-float/2addr v7, v8

    float-to-double v7, v7

    const-wide v9, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v7, v9

    aput-wide v7, v6, v4

    .line 325
    iget-object v6, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->bubbleFloatSpeeds:[D

    const-wide v7, 0x3f847ae147ae147bL    # 0.01

    iget-object v9, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->rand:Ljava/util/Random;

    invoke-virtual {v9}, Ljava/util/Random;->nextDouble()D

    move-result-wide v9

    const-wide v11, 0x3f80624dd2f1a9fbL    # 0.007999999999999998

    mul-double/2addr v9, v11

    add-double/2addr v9, v7

    aput-wide v9, v6, v4

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_2
    return-void
.end method

.method public static willEnterExtendedScanAnimation(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Z
    .locals 2

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDeltaType:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->showFirstScanAnimation:Ljava/lang/Boolean;

    .line 102
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public didEnterExtendedAnimation()Z
    .locals 1

    .line 126
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->enteredExtendedAnimation:Z

    return v0
.end method

.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 4

    .line 473
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->checkmarkEnterAnimation:Landroid/view/animation/AnimationSet;

    if-ne p1, v0, :cond_1

    .line 474
    iget-object p1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->showFirstScanAnimation:Ljava/lang/Boolean;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 475
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->animateCheckmarkExtendedAnimation()V

    goto :goto_2

    .line 477
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->callback:Lcom/shopkick/app/overlays/controllers/ScanAnimationController$IScanAnimationControllerCallback;

    invoke-interface {p1}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController$IScanAnimationControllerCallback;->onScanAnimationFinished()V

    goto :goto_2

    .line 479
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->checkmarkExtendedAnimation:Landroid/view/animation/AnimationSet;

    if-ne p1, v0, :cond_2

    .line 480
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->animateBubbles()V

    goto :goto_2

    .line 481
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->foregroundContentFadeInAnimation:Landroid/view/animation/Animation;

    if-ne p1, v0, :cond_3

    .line 482
    iget-object p1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->callback:Lcom/shopkick/app/overlays/controllers/ScanAnimationController$IScanAnimationControllerCallback;

    invoke-interface {p1}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController$IScanAnimationControllerCallback;->onScanAnimationFinished()V

    goto :goto_2

    :cond_3
    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 485
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->floatAnimations:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    if-ge v1, v2, :cond_5

    .line 486
    iget-object v2, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->floatAnimations:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p1, :cond_4

    move v0, v1

    goto :goto_1

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    if-ltz v0, :cond_6

    .line 492
    invoke-virtual {p1}, Landroid/view/animation/Animation;->cancel()V

    .line 493
    invoke-direct {p0, v0}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->animateFloat(I)V

    :cond_6
    :goto_2
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

.method public startScanAnimation()V
    .locals 2

    .line 130
    invoke-direct {p0}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->animateCheckMarkIn()V

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->overlayView:Landroid/widget/RelativeLayout;

    const v1, 0x7f0901f9

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    const/4 v1, 0x4

    .line 132
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void
.end method

.method public stopScanAnimation()V
    .locals 2

    .line 136
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->checkmarkExtendedAnimation:Landroid/view/animation/AnimationSet;

    if-eqz v0, :cond_0

    .line 137
    invoke-virtual {v0}, Landroid/view/animation/AnimationSet;->cancel()V

    .line 139
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->checkmarkEnterAnimation:Landroid/view/animation/AnimationSet;

    if-eqz v0, :cond_1

    .line 140
    invoke-virtual {v0}, Landroid/view/animation/AnimationSet;->cancel()V

    .line 142
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->foregroundContentFadeInAnimation:Landroid/view/animation/Animation;

    if-eqz v0, :cond_2

    .line 143
    invoke-virtual {v0}, Landroid/view/animation/Animation;->cancel()V

    .line 145
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->bubbleViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 146
    invoke-virtual {v1}, Landroid/view/View;->clearAnimation()V

    goto :goto_0

    :cond_3
    return-void
.end method
