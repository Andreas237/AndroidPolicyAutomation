.class Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$5;
.super Lcom/shopkick/app/widget/ToolTipView;
.source "SLFirstUseAnimationController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->showTooltipOnSearchBar()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;Landroid/view/ViewGroup;Landroid/view/View;I)V
    .locals 0

    .line 231
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$5;->this$0:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    invoke-direct {p0, p2, p3, p4}, Lcom/shopkick/app/widget/ToolTipView;-><init>(Landroid/view/ViewGroup;Landroid/view/View;I)V

    return-void
.end method


# virtual methods
.method public after(Lcom/shopkick/app/widget/ToolTipView;)V
    .locals 1

    .line 235
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$5;->this$0:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    const/4 v0, 0x2

    invoke-static {p1, v0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->access$400(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;I)V

    .line 236
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController$5;->this$0:Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->access$200(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;)I

    move-result v0

    invoke-static {p1, v0}, Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;->access$300(Lcom/shopkick/app/shoppinglists/SLFirstUseAnimationController;I)V

    return-void
.end method
