.class Lcom/shopkick/app/shoppinglists/SLListController$1;
.super Ljava/lang/Object;
.source "SLListController.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/SLListController;->beforeShowCreateDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/SLListController;

.field final synthetic val$buttonItem:Landroid/view/View;

.field final synthetic val$buttonView:Landroid/view/View;

.field final synthetic val$scrollPosition:I


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/SLListController;ILandroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController$1;->this$0:Lcom/shopkick/app/shoppinglists/SLListController;

    iput p2, p0, Lcom/shopkick/app/shoppinglists/SLListController$1;->val$scrollPosition:I

    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/SLListController$1;->val$buttonItem:Landroid/view/View;

    iput-object p4, p0, Lcom/shopkick/app/shoppinglists/SLListController$1;->val$buttonView:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 118
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 119
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, p1

    .line 122
    iget p1, p0, Lcom/shopkick/app/shoppinglists/SLListController$1;->val$scrollPosition:I

    if-eqz p1, :cond_0

    .line 123
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController$1;->this$0:Lcom/shopkick/app/shoppinglists/SLListController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLListController;->access$100(Lcom/shopkick/app/shoppinglists/SLListController;)Landroid/widget/ListView;

    move-result-object p1

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLListController$1;->this$0:Lcom/shopkick/app/shoppinglists/SLListController;

    invoke-static {v2}, Lcom/shopkick/app/shoppinglists/SLListController;->access$000(Lcom/shopkick/app/shoppinglists/SLListController;)Lcom/shopkick/app/shoppinglists/SLListAdapter;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/shoppinglists/SLListAdapter;->getButtonRowPosition()I

    move-result v2

    iget v3, p0, Lcom/shopkick/app/shoppinglists/SLListController$1;->val$scrollPosition:I

    int-to-float v3, v3

    mul-float/2addr v3, v1

    float-to-int v3, v3

    invoke-virtual {p1, v2, v3}, Landroid/widget/ListView;->setSelectionFromTop(II)V

    .line 127
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController$1;->val$buttonItem:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 128
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController$1;->val$buttonView:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 129
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController$1;->val$buttonItem:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method
