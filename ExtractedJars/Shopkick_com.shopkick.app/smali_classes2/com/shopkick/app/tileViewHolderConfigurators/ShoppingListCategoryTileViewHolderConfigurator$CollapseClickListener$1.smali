.class Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener$1;
.super Ljava/lang/Object;
.source "ShoppingListCategoryTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener;->animateArrow(Landroid/view/View;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener;

.field final synthetic val$checkbox:Landroid/view/View;

.field final synthetic val$isSelected:Z


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener;Landroid/view/View;Z)V
    .locals 0

    .line 169
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener$1;->val$checkbox:Landroid/view/View;

    iput-boolean p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener$1;->val$isSelected:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 176
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener$1;->val$checkbox:Landroid/view/View;

    iget-boolean v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener$1;->val$isSelected:Z

    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 177
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener$1;->val$checkbox:Landroid/view/View;

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
