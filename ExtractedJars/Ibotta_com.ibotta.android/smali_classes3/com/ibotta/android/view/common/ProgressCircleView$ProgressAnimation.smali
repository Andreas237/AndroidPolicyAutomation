.class Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;
.super Landroid/view/animation/Animation;
.source "ProgressCircleView.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/view/common/ProgressCircleView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ProgressAnimation"
.end annotation


# static fields
.field private static final ANIMATION_DURATION:F = 1500.0f

.field private static final ANIMATION_START_OFFSET:J = 0x1f4L


# instance fields
.field private maxSweepAngle:F

.field final synthetic this$0:Lcom/ibotta/android/view/common/ProgressCircleView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/common/ProgressCircleView;)V
    .locals 3

    .line 188
    iput-object p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;->this$0:Lcom/ibotta/android/view/common/ProgressCircleView;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 189
    invoke-static {p1}, Lcom/ibotta/android/view/common/ProgressCircleView;->access$000(Lcom/ibotta/android/view/common/ProgressCircleView;)Lcom/ibotta/android/view/common/ProgressCircleView$Progress;

    move-result-object v0

    const/high16 v1, 0x42c80000    # 100.0f

    if-eqz v0, :cond_0

    .line 190
    invoke-static {p1}, Lcom/ibotta/android/view/common/ProgressCircleView;->access$000(Lcom/ibotta/android/view/common/ProgressCircleView;)Lcom/ibotta/android/view/common/ProgressCircleView$Progress;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->getPercentComplete()F

    move-result v0

    div-float/2addr v0, v1

    const/high16 v2, 0x43b40000    # 360.0f

    mul-float v0, v0, v2

    iput v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;->maxSweepAngle:F

    :cond_0
    const/4 v0, 0x0

    .line 192
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;->setFillAfter(Z)V

    .line 193
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 194
    invoke-virtual {p0, p0}, Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 195
    invoke-static {p1}, Lcom/ibotta/android/view/common/ProgressCircleView;->access$000(Lcom/ibotta/android/view/common/ProgressCircleView;)Lcom/ibotta/android/view/common/ProgressCircleView$Progress;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->getPercentComplete()F

    move-result p1

    div-float/2addr p1, v1

    const-wide/16 v0, 0x1f4

    .line 196
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;->setStartOffset(J)V

    const v0, 0x44bb8000    # 1500.0f

    mul-float p1, p1, v0

    float-to-long v0, p1

    .line 197
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;->setDuration(J)V

    return-void
.end method


# virtual methods
.method protected applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 3

    const-string p2, "applyTransformation: %1$f"

    const/4 v0, 0x1

    .line 210
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    iget-object p2, p0, Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;->this$0:Lcom/ibotta/android/view/common/ProgressCircleView;

    iget v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;->maxSweepAngle:F

    mul-float v0, v0, p1

    invoke-static {p2, v0}, Lcom/ibotta/android/view/common/ProgressCircleView;->access$102(Lcom/ibotta/android/view/common/ProgressCircleView;F)F

    .line 212
    iget-object p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;->this$0:Lcom/ibotta/android/view/common/ProgressCircleView;

    invoke-static {p1, v2}, Lcom/ibotta/android/view/common/ProgressCircleView;->access$302(Lcom/ibotta/android/view/common/ProgressCircleView;Z)Z

    .line 213
    iget-object p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;->this$0:Lcom/ibotta/android/view/common/ProgressCircleView;

    invoke-static {p1}, Lcom/ibotta/android/view/common/ProgressCircleView;->access$400(Lcom/ibotta/android/view/common/ProgressCircleView;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    const-string p1, "onAnimationEnd"

    const/4 v0, 0x0

    .line 202
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    iget-object p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;->this$0:Lcom/ibotta/android/view/common/ProgressCircleView;

    iget v1, p0, Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;->maxSweepAngle:F

    invoke-static {p1, v1}, Lcom/ibotta/android/view/common/ProgressCircleView;->access$102(Lcom/ibotta/android/view/common/ProgressCircleView;F)F

    .line 204
    iget-object p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;->this$0:Lcom/ibotta/android/view/common/ProgressCircleView;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/common/ProgressCircleView;->access$202(Lcom/ibotta/android/view/common/ProgressCircleView;Z)Z

    .line 205
    iget-object p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView$ProgressAnimation;->this$0:Lcom/ibotta/android/view/common/ProgressCircleView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/common/ProgressCircleView;->setAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 1

    const-string p1, "onAnimationStart"

    const/4 v0, 0x0

    .line 218
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
