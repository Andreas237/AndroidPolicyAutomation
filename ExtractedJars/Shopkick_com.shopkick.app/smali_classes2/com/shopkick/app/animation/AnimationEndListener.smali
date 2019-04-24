.class public Lcom/shopkick/app/animation/AnimationEndListener;
.super Ljava/lang/Object;
.source "AnimationEndListener.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field private view:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/shopkick/app/animation/AnimationEndListener;->view:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .line 22
    iget-object v0, p0, Lcom/shopkick/app/animation/AnimationEndListener;->view:Landroid/view/View;

    new-instance v1, Lcom/shopkick/app/animation/AnimationEndListener$1;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/animation/AnimationEndListener$1;-><init>(Lcom/shopkick/app/animation/AnimationEndListener;Landroid/view/animation/Animation;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method protected onAnimationEnded(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
