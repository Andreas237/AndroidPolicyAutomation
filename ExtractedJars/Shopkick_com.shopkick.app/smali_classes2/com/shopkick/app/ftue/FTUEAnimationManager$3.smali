.class Lcom/shopkick/app/ftue/FTUEAnimationManager$3;
.super Ljava/lang/Object;
.source "FTUEAnimationManager.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateJeanIconToEndPosition(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/ftue/FTUEAnimationManager;


# direct methods
.method constructor <init>(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V
    .locals 0

    .line 358
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager$3;->this$0:Lcom/shopkick/app/ftue/FTUEAnimationManager;

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

    .line 368
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager$3;->this$0:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-static {p1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->access$500(Lcom/shopkick/app/ftue/FTUEAnimationManager;)Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 369
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager$3;->this$0:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-static {p1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->access$500(Lcom/shopkick/app/ftue/FTUEAnimationManager;)Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;->onOverlayDismiss()V

    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 361
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager$3;->this$0:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-static {p1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->access$300(Lcom/shopkick/app/ftue/FTUEAnimationManager;)Lcom/shopkick/app/ftue/DragConstraintLayout;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 362
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager$3;->this$0:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-static {p1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->access$400(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V

    :cond_0
    return-void
.end method
