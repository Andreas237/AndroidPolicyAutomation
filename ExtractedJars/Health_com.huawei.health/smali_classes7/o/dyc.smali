.class public Lo/dyc;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)Landroid/view/animation/AnimationSet;
    .locals 12

    .line 26
    new-instance v9, Landroid/view/animation/AnimationSet;

    const/4 v0, 0x1

    invoke-direct {v9, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 27
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, 0x40000000    # 2.0f

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x40000000    # 2.0f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    move-object v10, v0

    .line 30
    int-to-long v0, p0

    invoke-virtual {v10, v0, v1}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 31
    new-instance v11, Landroid/view/animation/AlphaAnimation;

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-direct {v11, v0, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 32
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 33
    int-to-long v0, p0

    invoke-virtual {v11, v0, v1}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 35
    invoke-virtual {v9, v10}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 36
    invoke-virtual {v9, v11}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 40
    return-object v9
.end method

.method public static b(II)Landroid/view/animation/AnimationSet;
    .locals 12

    .line 51
    new-instance v9, Landroid/view/animation/AnimationSet;

    const/4 v0, 0x1

    invoke-direct {v9, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 53
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    const/high16 v1, 0x40000000    # 2.0f

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v3, 0x40000000    # 2.0f

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    move-object v10, v0

    .line 56
    int-to-long v0, p0

    invoke-virtual {v10, v0, v1}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 57
    new-instance v11, Landroid/view/animation/AlphaAnimation;

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v11, v0, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 58
    int-to-long v0, p1

    invoke-virtual {v11, v0, v1}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 59
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 61
    invoke-virtual {v9, v10}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 62
    invoke-virtual {v9, v11}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 65
    return-object v9
.end method

.method public static d(I)Landroid/view/animation/AnimationSet;
    .locals 4

    .line 70
    new-instance v2, Landroid/view/animation/AnimationSet;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 71
    new-instance v3, Landroid/view/animation/AlphaAnimation;

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v3, v0, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 72
    int-to-long v0, p0

    invoke-virtual {v3, v0, v1}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 73
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 74
    invoke-virtual {v2, v3}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 75
    return-object v2
.end method
