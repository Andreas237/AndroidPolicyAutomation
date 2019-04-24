.class Lcom/shopkick/app/ftue/FTUEAnimationManager$2;
.super Ljava/lang/Object;
.source "FTUEAnimationManager.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateJeanIconToStartPosition()V
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

    .line 315
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager$2;->this$0:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 322
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager$2;->this$0:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-static {p1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->access$100(Lcom/shopkick/app/ftue/FTUEAnimationManager;)Lcom/shopkick/app/widget/RoundImageView;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/RoundImageView;->setVisibility(I)V

    .line 323
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager$2;->this$0:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-static {p1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->access$200(Lcom/shopkick/app/ftue/FTUEAnimationManager;)Lcom/shopkick/app/widget/RoundImageView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/RoundImageView;->setVisibility(I)V

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
