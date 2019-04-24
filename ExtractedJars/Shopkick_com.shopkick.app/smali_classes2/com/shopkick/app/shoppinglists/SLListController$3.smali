.class Lcom/shopkick/app/shoppinglists/SLListController$3;
.super Ljava/lang/Object;
.source "SLListController.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/SLListController;->afterDismissCreateDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/SLListController;

.field final synthetic val$buttonItem:Landroid/view/View;

.field final synthetic val$buttonView:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/SLListController;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 179
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController$3;->this$0:Lcom/shopkick/app/shoppinglists/SLListController;

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListController$3;->val$buttonItem:Landroid/view/View;

    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/SLListController$3;->val$buttonView:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListController$3;->val$buttonItem:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 183
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListController$3;->val$buttonView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 184
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController$3;->val$buttonItem:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method
