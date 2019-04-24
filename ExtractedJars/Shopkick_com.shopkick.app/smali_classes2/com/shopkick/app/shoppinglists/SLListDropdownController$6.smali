.class Lcom/shopkick/app/shoppinglists/SLListDropdownController$6;
.super Lcom/shopkick/app/shoppinglists/SLNamingDialog;
.source "SLListDropdownController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/SLListDropdownController;->onDialogItemClick(Landroid/view/View;Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;Ljava/util/HashMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/SLListDropdownController;Lcom/shopkick/app/util/NotificationCenter;Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 381
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$6;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-direct {p0, p2, p3, p4}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;-><init>(Lcom/shopkick/app/util/NotificationCenter;Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 384
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 385
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7f090192

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$6;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->access$800(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$6;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->access$700(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->getCurrentText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 386
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$6;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->access$400(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$6;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->access$900(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$6;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-static {v1}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->access$700(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->getCurrentText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->renameShoppingList(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$6;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->access$700(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Lcom/shopkick/app/shoppinglists/SLNamingDialog;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->dismiss()V

    return-void
.end method
