.class final Lcom/shopkick/app/activities/KicksCounterController$JumpAnimationSet;
.super Landroid/view/animation/AnimationSet;
.source "KicksCounterController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/activities/KicksCounterController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "JumpAnimationSet"
.end annotation


# direct methods
.method public constructor <init>(IIF)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v2, 0x0

    .line 142
    invoke-direct {v0, v2}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 145
    new-instance v2, Landroid/view/animation/TranslateAnimation;

    move/from16 v12, p3

    neg-float v11, v12

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v3, v2

    invoke-direct/range {v3 .. v11}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    int-to-long v3, v1

    .line 153
    invoke-virtual {v2, v3, v4}, Landroid/view/animation/TranslateAnimation;->setStartOffset(J)V

    .line 154
    div-int/lit8 v13, p2, 0x2

    int-to-long v14, v13

    invoke-virtual {v2, v14, v15}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 155
    new-instance v3, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v3}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v2, v3}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 156
    invoke-virtual {v0, v2}, Lcom/shopkick/app/activities/KicksCounterController$JumpAnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 159
    new-instance v2, Landroid/view/animation/TranslateAnimation;

    const/4 v4, 0x1

    move-object v3, v2

    move/from16 v11, p3

    invoke-direct/range {v3 .. v11}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    add-int/2addr v1, v13

    int-to-long v3, v1

    .line 167
    invoke-virtual {v2, v3, v4}, Landroid/view/animation/TranslateAnimation;->setStartOffset(J)V

    .line 168
    invoke-virtual {v2, v14, v15}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 169
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v2, v1}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 170
    invoke-virtual {v0, v2}, Lcom/shopkick/app/activities/KicksCounterController$JumpAnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method
