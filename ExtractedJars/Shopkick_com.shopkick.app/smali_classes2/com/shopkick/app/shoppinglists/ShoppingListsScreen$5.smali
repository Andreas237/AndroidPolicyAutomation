.class Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$5;
.super Landroid/animation/AnimatorListenerAdapter;
.source "ShoppingListsScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->showHeader()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)V
    .locals 0

    .line 382
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$5;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 391
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$5;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$400(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    const/4 v0, -0x2

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 392
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$5;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$600(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 393
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$5;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$600(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 394
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$5;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$802(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;Landroid/animation/ValueAnimator;)Landroid/animation/ValueAnimator;

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 385
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$5;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$400(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 386
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$5;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$600(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
