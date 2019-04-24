.class Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SLFirstUseAnimationController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->startAnimation()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$2;->this$0:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 163
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 164
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$2;->this$0:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->access$000(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
