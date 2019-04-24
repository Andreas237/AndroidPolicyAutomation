.class Lcom/shopkick/app/shoppinglists/SLListDropdownController$4;
.super Lcom/shopkick/app/shoppinglists/SLOptionsDialog;
.source "SLListDropdownController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/SLListDropdownController;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/SLListDropdownController;Landroid/view/View;Ljava/util/ArrayList;Ljava/util/HashMap;)V
    .locals 0

    .line 300
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$4;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-direct {p0, p2, p3, p4}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;-><init>(Landroid/view/View;Ljava/util/ArrayList;Ljava/util/HashMap;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 303
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$4;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->access$300(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Lcom/shopkick/app/application/dialog/DialogsManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$4;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-static {v1}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->access$400(Lcom/shopkick/app/shoppinglists/SLListDropdownController;)Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/shoppinglists/SLUtils;->isNewModificationCreatable(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 306
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListDropdownController$4;->this$0:Lcom/shopkick/app/shoppinglists/SLListDropdownController;

    invoke-static {v0, p1, p2, p3}, Lcom/shopkick/app/shoppinglists/SLListDropdownController;->access$500(Lcom/shopkick/app/shoppinglists/SLListDropdownController;Landroid/view/View;Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;Ljava/util/HashMap;)V

    return-void
.end method
