.class Lcom/nineoldandroids/view/ViewPropertyAnimatorICS$1;
.super Ljava/lang/Object;
.source "ViewPropertyAnimatorICS.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nineoldandroids/view/ViewPropertyAnimatorICS;->setListener(Lcom/nineoldandroids/animation/Animator$AnimatorListener;)Lcom/nineoldandroids/view/ViewPropertyAnimator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nineoldandroids/view/ViewPropertyAnimatorICS;

.field final synthetic val$listener:Lcom/nineoldandroids/animation/Animator$AnimatorListener;


# direct methods
.method constructor <init>(Lcom/nineoldandroids/view/ViewPropertyAnimatorICS;Lcom/nineoldandroids/animation/Animator$AnimatorListener;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorICS$1;->this$0:Lcom/nineoldandroids/view/ViewPropertyAnimatorICS;

    iput-object p2, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorICS$1;->val$listener:Lcom/nineoldandroids/animation/Animator$AnimatorListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 95
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorICS$1;->val$listener:Lcom/nineoldandroids/animation/Animator$AnimatorListener;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/nineoldandroids/animation/Animator$AnimatorListener;->onAnimationCancel(Lcom/nineoldandroids/animation/Animator;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 90
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorICS$1;->val$listener:Lcom/nineoldandroids/animation/Animator$AnimatorListener;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/nineoldandroids/animation/Animator$AnimatorListener;->onAnimationEnd(Lcom/nineoldandroids/animation/Animator;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 1

    .line 85
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorICS$1;->val$listener:Lcom/nineoldandroids/animation/Animator$AnimatorListener;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/nineoldandroids/animation/Animator$AnimatorListener;->onAnimationRepeat(Lcom/nineoldandroids/animation/Animator;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 80
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorICS$1;->val$listener:Lcom/nineoldandroids/animation/Animator$AnimatorListener;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/nineoldandroids/animation/Animator$AnimatorListener;->onAnimationStart(Lcom/nineoldandroids/animation/Animator;)V

    return-void
.end method
