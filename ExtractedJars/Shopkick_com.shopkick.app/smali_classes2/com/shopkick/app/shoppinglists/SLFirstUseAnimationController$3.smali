.class Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$3;
.super Ljava/lang/Object;
.source "SLFirstUseAnimationController.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->lambda$startAnimation$227()V
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

    .line 174
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$3;->this$0:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 180
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$3;->this$0:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->access$700(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

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
