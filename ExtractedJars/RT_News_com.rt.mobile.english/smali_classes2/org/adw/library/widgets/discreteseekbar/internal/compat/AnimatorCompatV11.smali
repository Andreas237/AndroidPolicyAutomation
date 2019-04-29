.class public Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompatV11;
.super Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;
.source "AnimatorCompatV11.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation


# instance fields
.field animator:Landroid/animation/ValueAnimator;


# direct methods
.method public constructor <init>(FFLorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimationFrameUpdateListener;)V
    .locals 2

    .line 36
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;-><init>()V

    const/4 v0, 0x2

    .line 37
    new-array v0, v0, [F

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 p1, 0x1

    aput p2, v0, p1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    iput-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompatV11;->animator:Landroid/animation/ValueAnimator;

    .line 38
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompatV11;->animator:Landroid/animation/ValueAnimator;

    new-instance p2, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompatV11$1;

    invoke-direct {p2, p0, p3}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompatV11$1;-><init>(Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompatV11;Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimationFrameUpdateListener;)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 48
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompatV11;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    return-void
.end method

.method public isRunning()Z
    .locals 1

    .line 53
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompatV11;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    return v0
.end method

.method public setDuration(I)V
    .locals 3

    .line 58
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompatV11;->animator:Landroid/animation/ValueAnimator;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    return-void
.end method

.method public start()V
    .locals 1

    .line 63
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompatV11;->animator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method
