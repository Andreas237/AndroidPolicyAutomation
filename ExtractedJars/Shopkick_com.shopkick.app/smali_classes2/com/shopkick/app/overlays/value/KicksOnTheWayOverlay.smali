.class public Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "KicksOnTheWayOverlay.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# static fields
.field private static final BACKGROUND_IMAGE_CORNER_RADIUS_DP:I = 0x5

.field private static final CLOUDS_ANIMATION_DURATION:I = 0x4e20

.field private static final HELICOPTER_ANIMATION_DURATION:I = 0x1f40

.field private static final HELICOPTER_PAUSE_DISTANCE_FACTOR:F = 0.6666667f

.field private static final HELICOPTER_PAUSE_DURATION_FACTOR:F = 0.25f

.field private static final HILL_ANGLE_DEGREES:I = 0x5

.field private static final HILL_BACKGROUND_1X_DP_WIDTH:I = 0x190

.field private static final PALM_TREE_ANIMATION_DURATION:I = 0xfa0

.field private static final SHOPPING_CART_BOUNCE_DURATION:I = 0x96

.field private static final SHOPPING_CART_BOUNCE_HEIGHT_SCALE:F = 0.025f

.field private static final SHOPPING_CART_CART_OVERHANG_SPAN:D = 0.21739130434782608

.field private static final SHOPPING_CART_COLLISION_ANGLE:I = 0xd

.field private static final SHOPPING_CART_FRONT_TO_BACK_WHEEL_SPAN:D = 0.6086956521739131

.field private static final SPEED_BUMP_ANIMATION_DURATION:I = 0x7d0


# instance fields
.field private firstLayoutReceived:Z

.field private mainView:Landroid/view/View;

.field private palmTrees1:Landroid/view/View;

.field private palmTrees2:Landroid/view/View;

.field private shoppingCartCollisionAnimation:Landroid/view/animation/AnimationSet;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->animatePalmTrees(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;)Landroid/view/animation/AnimationSet;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->shoppingCartCollisionAnimation:Landroid/view/animation/AnimationSet;

    return-object p0
.end method

.method private animateClouds()V
    .locals 11

    .line 246
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f090114

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 248
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f0901fb

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v4, v1

    .line 249
    new-instance v1, Landroid/view/animation/TranslateAnimation;

    .line 252
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    neg-int v2, v2

    int-to-float v6, v2

    const/4 v9, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v2, v1

    move v3, v9

    move v5, v9

    move v7, v9

    invoke-direct/range {v2 .. v10}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    const-wide/16 v2, 0x4e20

    .line 257
    invoke-virtual {v1, v2, v3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 258
    new-instance v2, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    const/4 v2, -0x1

    .line 259
    invoke-virtual {v1, v2}, Landroid/view/animation/TranslateAnimation;->setRepeatCount(I)V

    .line 260
    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private animateHelicopter()V
    .locals 10

    .line 212
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f0902db

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 214
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f0901fb

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const v2, 0x3f2aaaab

    mul-float/2addr v2, v1

    .line 216
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    neg-int v3, v3

    int-to-float v3, v3

    const-string/jumbo v4, "x"

    const/4 v5, 0x2

    .line 220
    new-array v6, v5, [F

    const/4 v7, 0x0

    aput v1, v6, v7

    const/4 v1, 0x1

    aput v2, v6, v1

    invoke-static {v0, v4, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    const-wide/16 v8, 0x7d0

    .line 221
    invoke-virtual {v4, v8, v9}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 222
    new-instance v6, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v6}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v4, v6}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-string/jumbo v6, "x"

    .line 224
    new-array v5, v5, [F

    aput v2, v5, v7

    aput v3, v5, v1

    invoke-static {v0, v6, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    const-wide/16 v2, 0x1770

    .line 225
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 226
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 228
    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    .line 229
    invoke-virtual {v2, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 230
    new-instance v1, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$2;

    invoke-direct {v1, p0, v0, v2}, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$2;-><init>(Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;Landroid/view/View;Landroid/animation/AnimatorSet;)V

    invoke-virtual {v2, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 242
    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->start()V

    return-void
.end method

.method private animatePalmTrees(Landroid/view/View;Landroid/view/View;)V
    .locals 21

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    .line 170
    new-instance v11, Landroid/view/animation/TranslateAnimation;

    const/4 v4, 0x0

    const/high16 v6, -0x40800000    # -1.0f

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v9, 0x1

    move-object v2, v11

    move v3, v9

    move v5, v9

    move v7, v9

    invoke-direct/range {v2 .. v10}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    const-wide/16 v2, 0xfa0

    .line 178
    invoke-virtual {v11, v2, v3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 179
    new-instance v4, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v4}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v11, v4}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 182
    new-instance v4, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$1;

    move-object/from16 v5, p0

    invoke-direct {v4, v5, v1, v0}, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$1;-><init>(Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v11, v4}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 196
    new-instance v4, Landroid/view/animation/TranslateAnimation;

    const/16 v19, 0x1

    const/high16 v14, 0x3f800000    # 1.0f

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    move-object v12, v4

    move/from16 v13, v19

    move/from16 v15, v19

    move/from16 v17, v19

    invoke-direct/range {v12 .. v20}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 204
    invoke-virtual {v4, v2, v3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 205
    new-instance v2, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v4, v2}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 207
    invoke-virtual {v0, v11}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 208
    invoke-virtual {v1, v4}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private animateShoppingCart()V
    .locals 15

    .line 264
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f090692

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 267
    new-instance v10, Landroid/view/animation/TranslateAnimation;

    const/4 v8, 0x1

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const v9, -0x43333333    # -0.025f

    move-object v1, v10

    move v2, v8

    move v4, v8

    move v6, v8

    invoke-direct/range {v1 .. v9}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    const-wide/16 v1, 0x96

    .line 275
    invoke-virtual {v10, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    const/4 v1, 0x2

    .line 276
    invoke-virtual {v10, v1}, Landroid/view/animation/TranslateAnimation;->setRepeatMode(I)V

    const/4 v1, -0x1

    .line 277
    invoke-virtual {v10, v1}, Landroid/view/animation/TranslateAnimation;->setRepeatCount(I)V

    .line 278
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v10, v1}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 280
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f0906be

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 281
    iget-object v2, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v3, 0x7f0901fb

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    .line 282
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 283
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v4

    .line 284
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    add-int/2addr v1, v2

    int-to-double v5, v1

    const-wide v7, 0x409f400000000000L    # 2000.0

    div-double/2addr v5, v7

    .line 285
    div-int/lit8 v1, v2, 0x2

    div-int/lit8 v7, v3, 0x2

    add-int/2addr v1, v7

    int-to-double v7, v1

    int-to-double v11, v3

    const-wide v13, 0x3fcbd37a6f4de9bdL    # 0.21739130434782608

    mul-double/2addr v13, v11

    sub-double/2addr v7, v13

    int-to-double v1, v2

    sub-double/2addr v1, v7

    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    div-double/2addr v7, v5

    mul-double/2addr v1, v7

    double-to-long v1, v1

    const-wide v5, 0x3fe37a6f4de9bd38L    # 0.6086956521739131

    mul-double/2addr v11, v5

    int-to-double v3, v4

    add-double/2addr v11, v3

    mul-double/2addr v11, v7

    .line 292
    invoke-direct {p0, v11, v12, v1, v2}, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->getSpeedBumpCollisionAnimation(DJ)Landroid/view/animation/AnimationSet;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->shoppingCartCollisionAnimation:Landroid/view/animation/AnimationSet;

    .line 294
    new-instance v1, Landroid/view/animation/AnimationSet;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 295
    invoke-virtual {v1, v10}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 296
    iget-object v2, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->shoppingCartCollisionAnimation:Landroid/view/animation/AnimationSet;

    invoke-virtual {v1, v2}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 297
    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private animateSpeedBump()V
    .locals 23

    move-object/from16 v0, p0

    .line 335
    iget-object v1, v0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f0906be

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    .line 336
    invoke-virtual {v1, v2}, Landroid/view/View;->setPivotX(F)V

    .line 337
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setPivotY(F)V

    const/high16 v2, 0x40a00000    # 5.0f

    .line 338
    invoke-virtual {v1, v2}, Landroid/view/View;->setRotation(F)V

    .line 340
    iget-object v2, v0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v3, 0x7f0903b4

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x190

    .line 341
    invoke-static {v3, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v3

    .line 342
    iget-object v4, v0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v5, 0x7f0901fb

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    .line 343
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    sub-int/2addr v3, v4

    .line 347
    div-int/lit8 v3, v3, 0x2

    const-wide/high16 v6, 0x4014000000000000L    # 5.0

    .line 350
    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    .line 351
    invoke-static {v6, v7}, Ljava/lang/Math;->tan(D)D

    move-result-wide v8

    int-to-double v10, v3

    mul-double/2addr v8, v10

    .line 352
    invoke-static {v6, v7}, Ljava/lang/Math;->tan(D)D

    move-result-wide v10

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v12

    int-to-double v12, v12

    mul-double/2addr v10, v12

    .line 354
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v12

    int-to-double v12, v12

    sub-double/2addr v12, v8

    float-to-double v8, v5

    sub-double/2addr v12, v8

    add-double/2addr v12, v10

    double-to-float v5, v12

    add-int/2addr v3, v4

    .line 357
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v12

    add-int/2addr v3, v12

    .line 359
    invoke-static {v6, v7}, Ljava/lang/Math;->tan(D)D

    move-result-wide v6

    int-to-double v12, v3

    mul-double/2addr v6, v12

    .line 361
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-double v2, v2

    sub-double/2addr v2, v6

    sub-double/2addr v2, v8

    add-double/2addr v2, v10

    double-to-float v2, v2

    .line 366
    new-instance v3, Landroid/view/animation/TranslateAnimation;

    int-to-float v4, v4

    .line 369
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v6

    neg-int v6, v6

    int-to-float v6, v6

    const/16 v21, 0x0

    move-object v14, v3

    move/from16 v15, v21

    move/from16 v16, v4

    move/from16 v17, v21

    move/from16 v18, v6

    move/from16 v19, v21

    move/from16 v20, v5

    move/from16 v22, v2

    invoke-direct/range {v14 .. v22}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    const-wide/16 v4, 0x7d0

    .line 374
    invoke-virtual {v3, v4, v5}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 375
    new-instance v2, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v3, v2}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    const/4 v2, -0x1

    .line 376
    invoke-virtual {v3, v2}, Landroid/view/animation/TranslateAnimation;->setRepeatCount(I)V

    .line 377
    invoke-virtual {v3, v4, v5}, Landroid/view/animation/TranslateAnimation;->setStartOffset(J)V

    .line 378
    new-instance v2, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$3;

    invoke-direct {v2, v0}, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$3;-><init>(Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;)V

    invoke-virtual {v3, v2}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 392
    invoke-virtual {v1, v3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private getSpeedBumpCollisionAnimation(DJ)Landroid/view/animation/AnimationSet;
    .locals 10

    .line 301
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f090692

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-wide/high16 v1, 0x4010000000000000L    # 4.0

    div-double/2addr p1, v1

    double-to-int p1, p1

    .line 304
    new-instance p2, Landroid/view/animation/RotateAnimation;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, -0x3eb00000    # -13.0f

    const/4 v3, 0x0

    invoke-direct {p2, v3, v2, v3, v1}, Landroid/view/animation/RotateAnimation;-><init>(FFFF)V

    int-to-long v4, p1

    .line 305
    invoke-virtual {p2, v4, v5}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    .line 306
    invoke-virtual {p2, p3, p4}, Landroid/view/animation/RotateAnimation;->setStartOffset(J)V

    .line 307
    new-instance v1, Landroid/view/animation/RotateAnimation;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v6, v6

    const/high16 v7, 0x41500000    # 13.0f

    invoke-direct {v1, v3, v7, v3, v6}, Landroid/view/animation/RotateAnimation;-><init>(FFFF)V

    .line 308
    invoke-virtual {v1, v4, v5}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    add-long v8, p3, v4

    .line 309
    invoke-virtual {v1, v8, v9}, Landroid/view/animation/RotateAnimation;->setStartOffset(J)V

    .line 310
    new-instance v6, Landroid/view/animation/RotateAnimation;

    .line 312
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v8

    int-to-float v8, v8

    .line 313
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v9

    int-to-float v9, v9

    invoke-direct {v6, v3, v7, v8, v9}, Landroid/view/animation/RotateAnimation;-><init>(FFFF)V

    .line 314
    invoke-virtual {v6, v4, v5}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    mul-int/lit8 v7, p1, 0x2

    int-to-long v7, v7

    add-long/2addr v7, p3

    .line 315
    invoke-virtual {v6, v7, v8}, Landroid/view/animation/RotateAnimation;->setStartOffset(J)V

    .line 316
    new-instance v7, Landroid/view/animation/RotateAnimation;

    .line 318
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v8

    int-to-float v8, v8

    .line 319
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-direct {v7, v3, v2, v8, v0}, Landroid/view/animation/RotateAnimation;-><init>(FFFF)V

    .line 320
    invoke-virtual {v7, v4, v5}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    mul-int/lit8 p1, p1, 0x3

    int-to-long v2, p1

    add-long/2addr p3, v2

    .line 321
    invoke-virtual {v7, p3, p4}, Landroid/view/animation/RotateAnimation;->setStartOffset(J)V

    .line 323
    new-instance p1, Landroid/view/animation/AnimationSet;

    const/4 p3, 0x1

    invoke-direct {p1, p3}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 324
    invoke-virtual {p1, p2}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 325
    invoke-virtual {p1, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 326
    invoke-virtual {p1, v6}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 327
    invoke-virtual {p1, v7}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 328
    new-instance p2, Landroid/view/animation/LinearInterpolator;

    invoke-direct {p2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {p1, p2}, Landroid/view/animation/AnimationSet;->setInterpolator(Landroid/view/animation/Interpolator;)V

    const-wide/16 p2, 0x7d0

    .line 329
    invoke-virtual {p1, p2, p3}, Landroid/view/animation/AnimationSet;->setStartOffset(J)V

    return-object p1
.end method

.method public static synthetic lambda$createView$165(Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;Landroid/view/View;)V
    .locals 3

    .line 91
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 93
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v1, Lcom/shopkick/app/activities/HomeActivity;

    const-class v2, Lcom/shopkick/app/store/EarnScreen;

    invoke-direct {v0, v1, v2, p1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 95
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 97
    invoke-virtual {p1, v0}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    .line 99
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->dismiss()V

    return-void
.end method

.method public static synthetic lambda$createView$166(Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;Landroid/view/View;)V
    .locals 0

    .line 101
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->dismiss()V

    return-void
.end method

.method private roundBackgroundImageTopCorners()V
    .locals 12

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080239

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 145
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f0901fb

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 148
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v2

    if-lez v2, :cond_0

    .line 149
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    if-ge v3, v2, :cond_1

    .line 151
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    .line 155
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    div-int/lit8 v4, v2, 0x2

    sub-int/2addr v3, v4

    const/4 v4, 0x0

    .line 158
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    .line 154
    invoke-static {v0, v3, v4, v2, v5}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 159
    new-instance v0, Lcom/shopkick/app/drawables/RoundedImageDrawable;

    .line 160
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    .line 161
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    const/4 v2, 0x5

    .line 162
    invoke-static {v2, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    int-to-float v10, v1

    sget-object v11, Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;->ROUND_TOP_CORNERS:Lcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;

    move-object v6, v0

    invoke-direct/range {v6 .. v11}, Lcom/shopkick/app/drawables/RoundedImageDrawable;-><init>(Landroid/graphics/Bitmap;IIFLcom/shopkick/app/drawables/RoundedImageDrawable$RoundedImageDrawableType;)V

    .line 164
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f0903b4

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 165
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 1

    .line 84
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    .line 85
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f090500

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->palmTrees1:Landroid/view/View;

    .line 86
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f090501

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->palmTrees2:Landroid/view/View;

    .line 88
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f09047a

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f090477

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f0902c3

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/overlays/value/-$$Lambda$KicksOnTheWayOverlay$BOhCm4CwAAUx1Trrj-9pPNt9_6w;

    invoke-direct {v0, p0}, Lcom/shopkick/app/overlays/value/-$$Lambda$KicksOnTheWayOverlay$BOhCm4CwAAUx1Trrj-9pPNt9_6w;-><init>(Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f0900c6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/overlays/value/-$$Lambda$KicksOnTheWayOverlay$ITeDU2ZaCv9adXZyx98NA6eBoQk;

    invoke-direct {v0, p0}, Lcom/shopkick/app/overlays/value/-$$Lambda$KicksOnTheWayOverlay$ITeDU2ZaCv9adXZyx98NA6eBoQk;-><init>(Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    .line 103
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 104
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    return-object p1
.end method

.method public dismiss()V
    .locals 1

    .line 124
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->dismiss()V

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->palmTrees2:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->palmTrees1:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    return-void
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f12022d

    return v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c0152

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->mainView:Landroid/view/View;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 70
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 71
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method

.method public onGlobalLayout()V
    .locals 2

    .line 131
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->firstLayoutReceived:Z

    if-nez v0, :cond_0

    .line 132
    invoke-direct {p0}, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->roundBackgroundImageTopCorners()V

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->palmTrees1:Landroid/view/View;

    iget-object v1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->palmTrees2:Landroid/view/View;

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->animatePalmTrees(Landroid/view/View;Landroid/view/View;)V

    .line 134
    invoke-direct {p0}, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->animateHelicopter()V

    .line 135
    invoke-direct {p0}, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->animateClouds()V

    .line 136
    invoke-direct {p0}, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->animateShoppingCart()V

    .line 137
    invoke-direct {p0}, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->animateSpeedBump()V

    const/4 v0, 0x1

    .line 138
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->firstLayoutReceived:Z

    :cond_0
    return-void
.end method

.method public updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 76
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayFlowType:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 78
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayFlowType:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOverlayFlowType(Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method
