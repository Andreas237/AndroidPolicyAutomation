.class Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout$1;
.super Ljava/lang/Object;
.source "CutoutAnimUserEventConstraintLayout.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->hideWithAnimation(JLandroid/animation/AnimatorListenerAdapter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;


# direct methods
.method constructor <init>(Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout$1;->this$0:Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout$1;->this$0:Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, p1}, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->access$002(Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;F)F

    .line 57
    iget-object p1, p0, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout$1;->this$0:Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->invalidate()V

    return-void
.end method
