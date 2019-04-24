.class Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$3;
.super Landroid/animation/AnimatorListenerAdapter;
.source "ShoppingListsScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->hideHeader()V
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

    .line 338
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$3;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 341
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$3;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$400(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 342
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$3;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$600(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 343
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$3;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$802(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;Landroid/animation/ValueAnimator;)Landroid/animation/ValueAnimator;

    return-void
.end method
