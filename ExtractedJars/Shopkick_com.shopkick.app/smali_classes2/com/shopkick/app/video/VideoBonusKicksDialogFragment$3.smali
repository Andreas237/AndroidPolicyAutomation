.class Lcom/shopkick/app/video/VideoBonusKicksDialogFragment$3;
.super Ljava/lang/Object;
.source "VideoBonusKicksDialogFragment.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animateForHide()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;


# direct methods
.method constructor <init>(Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;)V
    .locals 0

    .line 525
    iput-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment$3;->this$0:Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;

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

    .line 530
    iget-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment$3;->this$0:Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 531
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_0

    .line 532
    iget-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment$3;->this$0:Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->dismiss()V

    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
