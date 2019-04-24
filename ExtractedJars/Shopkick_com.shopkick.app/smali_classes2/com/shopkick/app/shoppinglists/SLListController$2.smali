.class Lcom/shopkick/app/shoppinglists/SLListController$2;
.super Ljava/lang/Object;
.source "SLListController.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


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


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/SLListController;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController$2;->this$0:Lcom/shopkick/app/shoppinglists/SLListController;

    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListController$2;->val$buttonView:Landroid/view/View;

    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/SLListController$2;->val$buttonItem:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .line 141
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController$2;->this$0:Lcom/shopkick/app/shoppinglists/SLListController;

    new-instance v0, Lcom/shopkick/app/shoppinglists/SLListController$2$1;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLListController;->access$300(Lcom/shopkick/app/shoppinglists/SLListController;)Lcom/shopkick/app/util/NotificationCenter;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLListController$2;->val$buttonItem:Landroid/view/View;

    invoke-direct {v0, p0, v1, v2}, Lcom/shopkick/app/shoppinglists/SLListController$2$1;-><init>(Lcom/shopkick/app/shoppinglists/SLListController$2;Lcom/shopkick/app/util/NotificationCenter;Landroid/view/View;)V

    invoke-static {p1, v0}, Lcom/shopkick/app/shoppinglists/SLListController;->access$202(Lcom/shopkick/app/shoppinglists/SLListController;Lcom/shopkick/app/shoppinglists/SLNamingDialog;)Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    .line 156
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController$2;->this$0:Lcom/shopkick/app/shoppinglists/SLListController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLListController;->access$200(Lcom/shopkick/app/shoppinglists/SLListController;)Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->show()V

    .line 157
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController$2;->val$buttonView:Landroid/view/View;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 135
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController$2;->val$buttonView:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 136
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController$2;->this$0:Lcom/shopkick/app/shoppinglists/SLListController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLListController;->access$100(Lcom/shopkick/app/shoppinglists/SLListController;)Landroid/widget/ListView;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListController$2;->this$0:Lcom/shopkick/app/shoppinglists/SLListController;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/SLListController;->access$000(Lcom/shopkick/app/shoppinglists/SLListController;)Lcom/shopkick/app/shoppinglists/SLListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLListAdapter;->getButtonRowPosition()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setSelection(I)V

    return-void
.end method
