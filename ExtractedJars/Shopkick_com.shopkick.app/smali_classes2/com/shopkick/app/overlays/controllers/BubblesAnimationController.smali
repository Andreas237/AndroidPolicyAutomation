.class public Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;
.super Ljava/lang/Object;
.source "BubblesAnimationController.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$Builder;,
        Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$BubbleAnimationCallback;
    }
.end annotation


# instance fields
.field private final bubbleCountMax:I

.field private final bubbleCountMin:I

.field private bubbleFloatAngles:[D

.field private final bubbleFloatSpeedMax:D

.field private final bubbleFloatSpeedMin:D

.field private bubbleFloatSpeeds:[D

.field private final bubbleRiseDecelerationFactor:F

.field private final bubbleRiseDurationMillisecondsMax:I

.field private final bubbleRiseDurationMillisecondsMin:I

.field private final bubbleSizeDipMax:I

.field private final bubbleSizeDipMin:I

.field private final bubbleViews:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private final dialogMarginDip:I

.field private final doRiseAnimation:Z

.field private final floatAnimations:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Landroid/view/animation/TranslateAnimation;",
            ">;"
        }
    .end annotation
.end field

.field private final handler:Landroid/os/Handler;

.field private final rand:Ljava/util/Random;


# direct methods
.method private constructor <init>(Landroid/content/Context;ZIIFIIIIIDD)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->rand:Ljava/util/Random;

    .line 43
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->handler:Landroid/os/Handler;

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleViews:Ljava/util/ArrayList;

    .line 45
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->floatAnimations:Ljava/util/HashMap;

    .line 68
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->context:Landroid/content/Context;

    .line 69
    iput-boolean p2, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->doRiseAnimation:Z

    .line 70
    iput p3, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleRiseDurationMillisecondsMin:I

    .line 71
    iput p4, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleRiseDurationMillisecondsMax:I

    .line 72
    iput p5, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleRiseDecelerationFactor:F

    .line 73
    iput p6, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->dialogMarginDip:I

    .line 74
    iput p7, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleCountMin:I

    .line 75
    iput p8, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleCountMax:I

    .line 76
    iput p9, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleSizeDipMin:I

    .line 77
    iput p10, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleSizeDipMax:I

    .line 78
    iput-wide p11, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleFloatSpeedMin:D

    .line 79
    iput-wide p13, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleFloatSpeedMax:D

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;ZIIFIIIIIDDLcom/shopkick/app/overlays/controllers/BubblesAnimationController$1;)V
    .locals 0

    .line 27
    invoke-direct/range {p0 .. p14}, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;-><init>(Landroid/content/Context;ZIIFIIIIIDD)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;Landroid/widget/FrameLayout;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->animateBubbleFloat(Landroid/widget/FrameLayout;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;Landroid/widget/FrameLayout;Landroid/view/animation/Animation;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleFloatAnimationEnd(Landroid/widget/FrameLayout;Landroid/view/animation/Animation;)V

    return-void
.end method

.method private animateBubbleFloat(Landroid/widget/FrameLayout;)V
    .locals 2

    const/4 v0, 0x0

    .line 144
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleViews:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 145
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->animateFloat(Landroid/widget/FrameLayout;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private animateBubbleRise(Landroid/widget/FrameLayout;)V
    .locals 6

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 127
    iget v2, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->dialogMarginDip:I

    invoke-static {v2, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v2

    .line 128
    iget-object v3, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->context:Landroid/content/Context;

    invoke-static {v3}, Lcom/shopkick/app/util/FrameConfigurator;->screenHeightWithoutStatusBar(Landroid/content/Context;)I

    move-result v3

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v3, v2

    .line 129
    new-instance v2, Landroid/view/animation/TranslateAnimation;

    iget v4, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleSizeDipMax:I

    sub-int/2addr v3, v4

    .line 131
    invoke-static {v3, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v3

    int-to-float v3, v3

    const/4 v4, 0x0

    invoke-direct {v2, v4, v4, v3, v4}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 133
    iget v3, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleRiseDurationMillisecondsMin:I

    iget-object v4, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->rand:Ljava/util/Random;

    iget v5, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleRiseDurationMillisecondsMax:I

    sub-int/2addr v5, v3

    invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    add-int/2addr v3, v4

    .line 135
    iget v4, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleRiseDurationMillisecondsMax:I

    sub-int/2addr v4, v3

    int-to-long v4, v4

    invoke-virtual {v2, v4, v5}, Landroid/view/animation/TranslateAnimation;->setStartOffset(J)V

    int-to-long v3, v3

    .line 136
    invoke-virtual {v2, v3, v4}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 137
    new-instance v3, Landroid/view/animation/DecelerateInterpolator;

    iget v4, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleRiseDecelerationFactor:F

    invoke-direct {v3, v4}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    invoke-virtual {v2, v3}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 138
    invoke-virtual {v1, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private animateFloat(Landroid/widget/FrameLayout;I)V
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p2

    .line 152
    invoke-virtual/range {p1 .. p1}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v2

    int-to-double v2, v2

    .line 154
    invoke-virtual/range {p1 .. p1}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v4

    int-to-double v4, v4

    .line 155
    iget-object v6, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleViews:Ljava/util/ArrayList;

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    .line 156
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 158
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

    .line 159
    :goto_0
    iget v11, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    int-to-double v9, v11

    iget v11, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    div-int/lit8 v11, v11, 0x2

    int-to-double v12, v11

    sub-double v11, v2, v12

    sub-double/2addr v11, v14

    cmpl-double v9, v9, v11

    if-lez v9, :cond_1

    const/4 v9, 0x1

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    .line 160
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

    .line 161
    :goto_2
    iget v11, v7, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    int-to-double v11, v11

    iget v13, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    div-int/lit8 v13, v13, 0x2

    int-to-double v0, v13

    sub-double v0, v4, v0

    sub-double/2addr v0, v14

    cmpl-double v0, v11, v0

    if-lez v0, :cond_3

    const/16 v16, 0x1

    goto :goto_3

    :cond_3
    const/16 v16, 0x0

    :goto_3
    if-nez v8, :cond_5

    if-eqz v9, :cond_4

    goto :goto_4

    :cond_4
    move-object/from16 v0, p0

    goto :goto_6

    :cond_5
    :goto_4
    if-eqz v8, :cond_6

    .line 166
    iget v0, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    div-int/lit8 v0, v0, 0x2

    int-to-double v0, v0

    const-wide/16 v8, 0x0

    sub-double v12, v8, v0

    double-to-int v0, v12

    iput v0, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    move-object/from16 v0, p0

    goto :goto_5

    .line 169
    :cond_6
    iget v0, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    div-int/lit8 v0, v0, 0x2

    int-to-double v0, v0

    sub-double v0, v2, v0

    double-to-int v0, v0

    iput v0, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    move-object/from16 v0, p0

    .line 172
    :goto_5
    iget-object v1, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleFloatAngles:[D

    const-wide v8, 0x400921fb60000000L    # 3.1415927410125732

    aget-wide v11, v1, p2

    sub-double/2addr v8, v11

    aput-wide v8, v1, p2

    :goto_6
    const-wide v8, 0x401921fb54442d18L    # 6.283185307179586

    if-nez v10, :cond_7

    if-eqz v16, :cond_9

    :cond_7
    if-eqz v10, :cond_8

    .line 177
    iget v1, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    div-int/lit8 v1, v1, 0x2

    int-to-double v10, v1

    const-wide/16 v12, 0x0

    sub-double v10, v12, v10

    double-to-int v1, v10

    iput v1, v7, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    goto :goto_7

    .line 180
    :cond_8
    iget v1, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    div-int/lit8 v1, v1, 0x2

    int-to-double v10, v1

    sub-double v10, v4, v10

    double-to-int v1, v10

    iput v1, v7, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 183
    :goto_7
    iget-object v1, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleFloatAngles:[D

    aget-wide v10, v1, p2

    sub-double v10, v8, v10

    aput-wide v10, v1, p2

    .line 185
    :cond_9
    iget-object v1, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleFloatAngles:[D

    aget-wide v10, v1, p2

    const-wide/16 v12, 0x0

    cmpg-double v10, v10, v12

    if-gez v10, :cond_a

    .line 187
    aget-wide v10, v1, p2

    add-double/2addr v10, v8

    aput-wide v10, v1, p2

    .line 190
    :cond_a
    iget-object v1, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleFloatAngles:[D

    aget-wide v8, v1, p2

    .line 191
    iget-object v1, v0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleFloatSpeeds:[D

    aget-wide v10, v1, p2

    .line 194
    invoke-static {v8, v9}, Ljava/lang/Math;->tan(D)D

    move-result-wide v12

    .line 195
    iget v1, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iget v14, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    div-int/lit8 v14, v14, 0x2

    add-int/2addr v1, v14

    int-to-double v14, v1

    .line 196
    iget v1, v7, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    move-object/from16 v16, v6

    iget v6, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    div-int/lit8 v6, v6, 0x2

    add-int/2addr v1, v6

    int-to-double v0, v1

    const-wide v21, 0x3ff921fb54442d18L    # 1.5707963267948966

    cmpg-double v6, v8, v21

    if-gez v6, :cond_b

    div-double v8, v0, v12

    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    add-double v8, v8, v19

    sub-double v21, v14, v2

    mul-double v21, v21, v12

    sub-double v21, v21, v19

    goto :goto_8

    :cond_b
    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    const-wide v21, 0x400921fb54442d18L    # Math.PI

    cmpg-double v6, v8, v21

    if-gez v6, :cond_c

    div-double v8, v0, v12

    sub-double v8, v8, v19

    mul-double/2addr v12, v14

    sub-double v21, v12, v19

    goto :goto_8

    :cond_c
    const-wide v21, 0x4012d97c7f3321d2L    # 4.71238898038469

    cmpg-double v6, v8, v21

    if-gez v6, :cond_d

    sub-double v8, v0, v4

    div-double/2addr v8, v12

    sub-double v8, v8, v19

    mul-double/2addr v12, v14

    add-double v21, v12, v19

    goto :goto_8

    :cond_d
    sub-double v8, v0, v4

    div-double/2addr v8, v12

    add-double v8, v8, v19

    sub-double v21, v14, v2

    mul-double v21, v21, v12

    add-double v21, v21, v19

    .line 214
    :goto_8
    iget v6, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    int-to-double v12, v6

    add-double/2addr v12, v8

    iget v6, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    div-int/lit8 v6, v6, 0x2

    move-wide/from16 v19, v10

    int-to-double v10, v6

    const-wide/16 v17, 0x0

    sub-double v10, v17, v10

    cmpg-double v6, v12, v10

    if-gez v6, :cond_e

    neg-double v8, v14

    move-wide/from16 v0, v21

    goto :goto_9

    .line 217
    :cond_e
    iget v6, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    int-to-double v10, v6

    add-double/2addr v10, v8

    iget v6, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    div-int/lit8 v6, v6, 0x2

    int-to-double v12, v6

    sub-double v12, v2, v12

    cmpl-double v6, v10, v12

    if-lez v6, :cond_f

    sub-double v8, v2, v14

    move-wide/from16 v0, v21

    goto :goto_9

    .line 220
    :cond_f
    iget v2, v7, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    int-to-double v2, v2

    add-double v2, v2, v21

    iget v6, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    div-int/lit8 v6, v6, 0x2

    int-to-double v10, v6

    const-wide/16 v12, 0x0

    sub-double/2addr v12, v10

    cmpg-double v2, v2, v12

    if-gez v2, :cond_10

    neg-double v0, v0

    goto :goto_9

    :cond_10
    sub-double v21, v4, v0

    move-wide/from16 v0, v21

    .line 228
    :goto_9
    new-instance v2, Landroid/view/animation/TranslateAnimation;

    neg-double v3, v8

    double-to-float v3, v3

    neg-double v4, v0

    double-to-float v4, v4

    const/4 v5, 0x0

    invoke-direct {v2, v3, v5, v4, v5}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 229
    invoke-static {v8, v9, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    add-double/2addr v5, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    div-double v3, v3, v19

    double-to-int v3, v3

    int-to-long v3, v3

    .line 230
    invoke-virtual {v2, v3, v4}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 231
    new-instance v3, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v3}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v2, v3}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 232
    new-instance v3, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$2;

    move-object/from16 v5, p1

    move-object/from16 v4, p0

    invoke-direct {v3, v4, v5}, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$2;-><init>(Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;Landroid/widget/FrameLayout;)V

    invoke-virtual {v2, v3}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    const/4 v3, 0x1

    .line 244
    invoke-virtual {v2, v3}, Landroid/view/animation/TranslateAnimation;->setFillAfter(Z)V

    .line 245
    iget v3, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    int-to-double v5, v3

    add-double/2addr v5, v8

    double-to-int v3, v5

    iput v3, v7, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 246
    iget v3, v7, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    int-to-double v5, v3

    add-double/2addr v5, v0

    double-to-int v0, v5

    iput v0, v7, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    move-object/from16 v6, v16

    .line 247
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 249
    invoke-virtual {v6, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 250
    iget-object v0, v4, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->floatAnimations:Ljava/util/HashMap;

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private bubbleFloatAnimationEnd(Landroid/widget/FrameLayout;Landroid/view/animation/Animation;)V
    .locals 3

    const/4 v0, 0x0

    .line 255
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->floatAnimations:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 256
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->floatAnimations:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_1
    if-ltz v0, :cond_2

    .line 262
    invoke-virtual {p2}, Landroid/view/animation/Animation;->cancel()V

    .line 263
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->animateFloat(Landroid/widget/FrameLayout;I)V

    :cond_2
    return-void
.end method

.method private getRandBubbleColorForInt(I)I
    .locals 3

    const/4 v0, 0x4

    const/16 v1, 0x8

    if-ge p1, v1, :cond_0

    .line 271
    rem-int/2addr p1, v0

    goto :goto_0

    .line 273
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->rand:Ljava/util/Random;

    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    :goto_0
    const/16 v0, 0xff

    const/16 v1, 0xcc

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    .line 289
    invoke-static {p1, p1, p1}, Landroid/graphics/Color;->rgb(III)I

    move-result p1

    return p1

    :pswitch_0
    const/16 p1, 0x96

    const/16 v0, 0x37

    const/16 v2, 0xa0

    .line 287
    invoke-static {v1, p1, v0, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1

    :pswitch_1
    const/16 p1, 0x5a

    const/16 v2, 0x64

    .line 284
    invoke-static {v1, v0, p1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1

    :pswitch_2
    const/16 p1, 0x46

    const/16 v0, 0xeb

    .line 281
    invoke-static {v1, p1, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1

    :pswitch_3
    const/16 p1, 0xbe

    const/16 v2, 0x3c

    .line 278
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

.method private placeBubbles(Landroid/widget/FrameLayout;)V
    .locals 12

    .line 99
    iget v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleCountMin:I

    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->rand:Ljava/util/Random;

    iget v2, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleCountMax:I

    sub-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 100
    new-array v1, v0, [D

    iput-object v1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleFloatAngles:[D

    .line 101
    new-array v1, v0, [D

    iput-object v1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleFloatSpeeds:[D

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    .line 103
    new-instance v3, Landroid/view/View;

    iget-object v4, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->context:Landroid/content/Context;

    invoke-direct {v3, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 104
    iget v4, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleSizeDipMin:I

    iget-object v5, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->rand:Ljava/util/Random;

    iget v6, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleSizeDipMax:I

    sub-int/2addr v6, v4

    invoke-virtual {v5, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    add-int/2addr v4, v5

    .line 105
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-static {v4, v3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v6

    .line 106
    invoke-static {v4, v3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v7

    const/16 v8, 0x33

    invoke-direct {v5, v6, v7, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 107
    iget v6, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->dialogMarginDip:I

    invoke-static {v6, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v6

    .line 108
    iget-object v7, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->context:Landroid/content/Context;

    invoke-static {v7}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenWidth(Landroid/content/Context;)I

    move-result v7

    mul-int/lit8 v6, v6, 0x2

    sub-int/2addr v7, v6

    .line 109
    iget-object v8, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->context:Landroid/content/Context;

    invoke-static {v8}, Lcom/shopkick/app/util/FrameConfigurator;->screenHeightWithoutStatusBar(Landroid/content/Context;)I

    move-result v8

    sub-int/2addr v8, v6

    .line 110
    iget-object v6, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->rand:Ljava/util/Random;

    sub-int/2addr v7, v4

    invoke-virtual {v6, v7}, Ljava/util/Random;->nextInt(I)I

    move-result v6

    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 111
    iget-object v6, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->rand:Ljava/util/Random;

    sub-int/2addr v8, v4

    invoke-virtual {v6, v8}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    iput v4, v5, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 112
    invoke-virtual {v3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 113
    new-instance v4, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v5, Landroid/graphics/drawable/shapes/OvalShape;

    invoke-direct {v5}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    invoke-direct {v4, v5}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 114
    invoke-virtual {v4}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v5

    invoke-direct {p0, v2}, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->getRandBubbleColorForInt(I)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 115
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 116
    iget-object v4, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleViews:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    invoke-virtual {p1, v3, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;I)V

    .line 118
    iget-object v3, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleFloatAngles:[D

    iget-object v4, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->rand:Ljava/util/Random;

    invoke-virtual {v4}, Ljava/util/Random;->nextFloat()F

    move-result v4

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v4, v5

    float-to-double v4, v4

    const-wide v6, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v4, v6

    aput-wide v4, v3, v2

    .line 119
    iget-object v3, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleFloatSpeeds:[D

    iget-wide v4, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleFloatSpeedMin:D

    iget-object v6, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->rand:Ljava/util/Random;

    invoke-virtual {v6}, Ljava/util/Random;->nextDouble()D

    move-result-wide v6

    iget-wide v8, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleFloatSpeedMax:D

    iget-wide v10, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleFloatSpeedMin:D

    sub-double/2addr v8, v10

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    aput-wide v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public animateBackgroundBubbles(Landroid/widget/FrameLayout;Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$BubbleAnimationCallback;)V
    .locals 2

    .line 84
    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->placeBubbles(Landroid/widget/FrameLayout;)V

    .line 85
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->doRiseAnimation:Z

    if-eqz v0, :cond_0

    .line 86
    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->animateBubbleRise(Landroid/widget/FrameLayout;)V

    .line 88
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$1;

    invoke-direct {v1, p0, p2, p1}, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$1;-><init>(Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$BubbleAnimationCallback;Landroid/widget/FrameLayout;)V

    iget p1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->bubbleRiseDurationMillisecondsMax:I

    add-int/lit16 p1, p1, -0x12c

    int-to-long p1, p1

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
