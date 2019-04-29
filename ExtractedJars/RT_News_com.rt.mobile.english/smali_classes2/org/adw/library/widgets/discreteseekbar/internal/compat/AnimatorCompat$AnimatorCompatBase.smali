.class Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimatorCompatBase;
.super Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;
.source "AnimatorCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "AnimatorCompatBase"
.end annotation


# instance fields
.field private final mEndValue:F

.field private final mListener:Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimationFrameUpdateListener;


# direct methods
.method public constructor <init>(FFLorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimationFrameUpdateListener;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;-><init>()V

    .line 68
    iput-object p3, p0, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimatorCompatBase;->mListener:Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimationFrameUpdateListener;

    .line 69
    iput p2, p0, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimatorCompatBase;->mEndValue:F

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 0

    return-void
.end method

.method public isRunning()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setDuration(I)V
    .locals 0

    return-void
.end method

.method public start()V
    .locals 2

    .line 89
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimatorCompatBase;->mListener:Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimationFrameUpdateListener;

    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimatorCompatBase;->mEndValue:F

    invoke-interface {v0, v1}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimationFrameUpdateListener;->onAnimationFrame(F)V

    return-void
.end method
