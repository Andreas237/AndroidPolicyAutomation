.class Lcom/shopkick/app/shoppinglists/SLSearchDummyController$1;
.super Ljava/lang/Object;
.source "SLSearchDummyController.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->hideSearchBar()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/SLSearchDummyController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/SLSearchDummyController;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController$1;->this$0:Lcom/shopkick/app/shoppinglists/SLSearchDummyController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 72
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController$1;->this$0:Lcom/shopkick/app/shoppinglists/SLSearchDummyController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->access$000(Lcom/shopkick/app/shoppinglists/SLSearchDummyController;)Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 73
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController$1;->this$0:Lcom/shopkick/app/shoppinglists/SLSearchDummyController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->access$000(Lcom/shopkick/app/shoppinglists/SLSearchDummyController;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

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
