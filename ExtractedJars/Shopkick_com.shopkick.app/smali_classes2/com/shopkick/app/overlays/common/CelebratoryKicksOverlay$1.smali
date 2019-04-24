.class Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$1;
.super Ljava/lang/Object;
.source "CelebratoryKicksOverlay.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->instantiateAnimatorsForReveal()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$1;->this$0:Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 195
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$1;->this$0:Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;

    invoke-static {p1}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->access$400(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 184
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$1;->this$0:Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;

    invoke-static {p1}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->access$000(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    invoke-static {}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->access$100()I

    move-result v0

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 185
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$1;->this$0:Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;

    invoke-static {p1}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->access$000(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    invoke-static {}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->access$200()I

    move-result v0

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 187
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$1;->this$0:Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;

    invoke-static {p1}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->access$300(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    invoke-static {}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->access$100()I

    move-result v0

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 188
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$1;->this$0:Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;

    invoke-static {p1}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->access$300(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    invoke-static {}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->access$200()I

    move-result v0

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 190
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$1;->this$0:Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;

    invoke-static {p1}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->access$000(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 191
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$1;->this$0:Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;

    invoke-static {p1}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->access$300(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method
