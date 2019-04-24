.class public Lcom/shopkick/app/animation/PulseAnimationSet;
.super Ljava/lang/Object;
.source "PulseAnimationSet.java"


# instance fields
.field private maxX:F

.field private maxY:F

.field private minX:F

.field private minY:F

.field private pulseInDuration:I

.field private pulseOutDuration:I


# direct methods
.method public constructor <init>(FFFFII)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput p1, p0, Lcom/shopkick/app/animation/PulseAnimationSet;->minX:F

    .line 24
    iput p2, p0, Lcom/shopkick/app/animation/PulseAnimationSet;->maxX:F

    .line 25
    iput p3, p0, Lcom/shopkick/app/animation/PulseAnimationSet;->minY:F

    .line 26
    iput p4, p0, Lcom/shopkick/app/animation/PulseAnimationSet;->maxY:F

    .line 27
    iput p5, p0, Lcom/shopkick/app/animation/PulseAnimationSet;->pulseOutDuration:I

    .line 28
    iput p6, p0, Lcom/shopkick/app/animation/PulseAnimationSet;->pulseInDuration:I

    return-void
.end method


# virtual methods
.method public getPulseAnimationSet()Landroid/view/animation/AnimationSet;
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    .line 32
    invoke-virtual {p0, v0, v0, v1}, Lcom/shopkick/app/animation/PulseAnimationSet;->getPulseAnimationSet(FFI)Landroid/view/animation/AnimationSet;

    move-result-object v0

    return-object v0
.end method

.method public getPulseAnimationSet(FFI)Landroid/view/animation/AnimationSet;
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p3

    .line 36
    new-instance v11, Landroid/view/animation/ScaleAnimation;

    iget v3, v0, Lcom/shopkick/app/animation/PulseAnimationSet;->minX:F

    iget v4, v0, Lcom/shopkick/app/animation/PulseAnimationSet;->maxX:F

    iget v5, v0, Lcom/shopkick/app/animation/PulseAnimationSet;->minY:F

    iget v6, v0, Lcom/shopkick/app/animation/PulseAnimationSet;->maxY:F

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    const/4 v9, 0x1

    const/high16 v10, 0x3f000000    # 0.5f

    move-object v2, v11

    invoke-direct/range {v2 .. v10}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    int-to-long v2, v1

    .line 44
    invoke-virtual {v11, v2, v3}, Landroid/view/animation/ScaleAnimation;->setStartOffset(J)V

    .line 45
    iget v2, v0, Lcom/shopkick/app/animation/PulseAnimationSet;->pulseOutDuration:I

    int-to-long v2, v2

    invoke-virtual {v11, v2, v3}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 46
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v11, v2}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    const/4 v2, 0x1

    .line 47
    invoke-virtual {v11, v2}, Landroid/view/animation/ScaleAnimation;->setFillAfter(Z)V

    .line 49
    new-instance v3, Landroid/view/animation/ScaleAnimation;

    iget v13, v0, Lcom/shopkick/app/animation/PulseAnimationSet;->maxX:F

    iget v15, v0, Lcom/shopkick/app/animation/PulseAnimationSet;->maxY:F

    const/16 v17, 0x1

    const/high16 v18, 0x3f000000    # 0.5f

    const/16 v19, 0x1

    const/high16 v20, 0x3f000000    # 0.5f

    move-object v12, v3

    move/from16 v14, p1

    move/from16 v16, p2

    invoke-direct/range {v12 .. v20}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 57
    iget v4, v0, Lcom/shopkick/app/animation/PulseAnimationSet;->pulseOutDuration:I

    add-int/2addr v1, v4

    int-to-long v4, v1

    invoke-virtual {v3, v4, v5}, Landroid/view/animation/ScaleAnimation;->setStartOffset(J)V

    .line 58
    iget v1, v0, Lcom/shopkick/app/animation/PulseAnimationSet;->pulseInDuration:I

    int-to-long v4, v1

    invoke-virtual {v3, v4, v5}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 59
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v3, v1}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 60
    invoke-virtual {v3, v2}, Landroid/view/animation/ScaleAnimation;->setFillAfter(Z)V

    .line 62
    new-instance v1, Landroid/view/animation/AnimationSet;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 63
    invoke-virtual {v1, v11}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 64
    invoke-virtual {v1, v3}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    return-object v1
.end method
