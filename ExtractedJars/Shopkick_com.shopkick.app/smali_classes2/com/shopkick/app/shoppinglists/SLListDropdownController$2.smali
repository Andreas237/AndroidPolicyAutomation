.class Lcom/shopkick/app/shoppinglists/SLListDropdownController$2;
.super Ljava/lang/Object;
.source "SLListDropdownController.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/SLListDropdownController;->showDropdown()V
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

    .line 165
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$2;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 172
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$2;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->access$000(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Landroid/widget/ListView;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setEnabled(Z)V

    .line 173
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$2;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->access$100(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Landroid/view/View;

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
