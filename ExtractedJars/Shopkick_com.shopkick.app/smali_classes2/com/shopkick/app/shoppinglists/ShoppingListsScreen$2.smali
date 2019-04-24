.class Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$2;
.super Ljava/lang/Object;
.source "ShoppingListsScreen.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


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

    .line 329
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$2;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 332
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 333
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$2;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$400(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$2;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-static {v1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$500(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 334
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$2;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$600(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$2;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-static {v1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$700(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    float-to-int p1, p1

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 335
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen$2;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;->access$600(Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method
