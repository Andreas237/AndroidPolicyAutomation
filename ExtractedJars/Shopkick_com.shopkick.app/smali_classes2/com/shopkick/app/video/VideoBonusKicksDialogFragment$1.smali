.class Lcom/shopkick/app/video/VideoBonusKicksDialogFragment$1;
.super Ljava/lang/Object;
.source "VideoBonusKicksDialogFragment.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->animateProgressOneSecond()V
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

    .line 290
    iput-object p1, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment$1;->this$0:Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 293
    iget-object v0, p0, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment$1;->this$0:Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;

    invoke-static {v0}, Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;->access$000(Lcom/shopkick/app/video/VideoBonusKicksDialogFragment;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    return-void
.end method
