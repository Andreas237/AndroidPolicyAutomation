.class Lcom/shopkick/app/view/FinderView$1;
.super Ljava/lang/Object;
.source "FinderView.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/view/FinderView;->startAnimation(FFJLandroid/animation/TimeInterpolator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/view/FinderView;

.field final synthetic val$dstHeightPercent:F

.field final synthetic val$dstWidthPercent:F


# direct methods
.method constructor <init>(Lcom/shopkick/app/view/FinderView;FF)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/shopkick/app/view/FinderView$1;->this$0:Lcom/shopkick/app/view/FinderView;

    iput p2, p0, Lcom/shopkick/app/view/FinderView$1;->val$dstWidthPercent:F

    iput p3, p0, Lcom/shopkick/app/view/FinderView$1;->val$dstHeightPercent:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 82
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/view/FinderView$1;->this$0:Lcom/shopkick/app/view/FinderView;

    invoke-static {v0}, Lcom/shopkick/app/view/FinderView;->access$100(Lcom/shopkick/app/view/FinderView;)F

    move-result v1

    iget v2, p0, Lcom/shopkick/app/view/FinderView$1;->val$dstWidthPercent:F

    iget-object v3, p0, Lcom/shopkick/app/view/FinderView$1;->this$0:Lcom/shopkick/app/view/FinderView;

    invoke-static {v3}, Lcom/shopkick/app/view/FinderView;->access$100(Lcom/shopkick/app/view/FinderView;)F

    move-result v3

    sub-float/2addr v2, v3

    mul-float/2addr v2, p1

    add-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/shopkick/app/view/FinderView;->access$002(Lcom/shopkick/app/view/FinderView;F)F

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/view/FinderView$1;->this$0:Lcom/shopkick/app/view/FinderView;

    invoke-static {v0}, Lcom/shopkick/app/view/FinderView;->access$300(Lcom/shopkick/app/view/FinderView;)F

    move-result v1

    iget v2, p0, Lcom/shopkick/app/view/FinderView$1;->val$dstHeightPercent:F

    iget-object v3, p0, Lcom/shopkick/app/view/FinderView$1;->this$0:Lcom/shopkick/app/view/FinderView;

    invoke-static {v3}, Lcom/shopkick/app/view/FinderView;->access$300(Lcom/shopkick/app/view/FinderView;)F

    move-result v3

    sub-float/2addr v2, v3

    mul-float/2addr v2, p1

    add-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/shopkick/app/view/FinderView;->access$202(Lcom/shopkick/app/view/FinderView;F)F

    .line 85
    iget-object p1, p0, Lcom/shopkick/app/view/FinderView$1;->this$0:Lcom/shopkick/app/view/FinderView;

    invoke-virtual {p1}, Lcom/shopkick/app/view/FinderView;->invalidate()V

    return-void
.end method
