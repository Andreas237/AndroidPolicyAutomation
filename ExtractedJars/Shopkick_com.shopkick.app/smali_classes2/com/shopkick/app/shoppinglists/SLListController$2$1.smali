.class Lcom/shopkick/app/shoppinglists/SLListController$2$1;
.super Lcom/shopkick/app/shoppinglists/SLNamingDialog;
.source "SLListController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/SLListController$2;->onAnimationEnd(Landroid/animation/Animator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/app/shoppinglists/SLListController$2;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/SLListController$2;Lcom/shopkick/app/util/NotificationCenter;Landroid/view/View;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController$2$1;->this$1:Lcom/shopkick/app/shoppinglists/SLListController$2;

    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;-><init>(Lcom/shopkick/app/util/NotificationCenter;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 144
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 145
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7f090192

    if-ne p1, v0, :cond_0

    .line 147
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0xf5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListController$2$1;->this$1:Lcom/shopkick/app/shoppinglists/SLListController$2;

    iget-object v0, v0, Lcom/shopkick/app/shoppinglists/SLListController$2;->this$0:Lcom/shopkick/app/shoppinglists/SLListController;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/SLListController;->access$400(Lcom/shopkick/app/shoppinglists/SLListController;)Lcom/shopkick/app/logging/UserEventLogger;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 150
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController$2$1;->this$1:Lcom/shopkick/app/shoppinglists/SLListController$2;

    iget-object p1, p1, Lcom/shopkick/app/shoppinglists/SLListController$2;->this$0:Lcom/shopkick/app/shoppinglists/SLListController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLListController;->access$500(Lcom/shopkick/app/shoppinglists/SLListController;)Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListController$2$1;->this$1:Lcom/shopkick/app/shoppinglists/SLListController$2;

    iget-object v0, v0, Lcom/shopkick/app/shoppinglists/SLListController$2;->this$0:Lcom/shopkick/app/shoppinglists/SLListController;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/SLListController;->access$200(Lcom/shopkick/app/shoppinglists/SLListController;)Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->getCurrentText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->createShoppingList(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    .line 153
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListController$2$1;->this$1:Lcom/shopkick/app/shoppinglists/SLListController$2;

    iget-object p1, p1, Lcom/shopkick/app/shoppinglists/SLListController$2;->this$0:Lcom/shopkick/app/shoppinglists/SLListController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLListController;->access$200(Lcom/shopkick/app/shoppinglists/SLListController;)Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->dismiss()V

    return-void
.end method
