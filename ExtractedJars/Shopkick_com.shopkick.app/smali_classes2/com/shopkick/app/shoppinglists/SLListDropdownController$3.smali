.class Lcom/shopkick/app/shoppinglists/SLListDropdownController$3;
.super Ljava/lang/Object;
.source "SLListDropdownController.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/SLListDropdownController;->hideDropdown()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)V
    .locals 0

    .line 206
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$3;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 213
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$3;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->access$100(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 214
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$3;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->access$100(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 215
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$3;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->access$200(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Landroid/view/View;

    move-result-object p1

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
