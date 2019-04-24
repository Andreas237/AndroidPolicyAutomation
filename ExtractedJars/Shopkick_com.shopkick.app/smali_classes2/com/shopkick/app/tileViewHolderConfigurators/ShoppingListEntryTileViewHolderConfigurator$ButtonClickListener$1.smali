.class Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$1;
.super Lcom/shopkick/app/shoppinglists/SLOptionsDialog;
.source "ShoppingListEntryTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;Landroid/view/View;Ljava/util/ArrayList;Ljava/util/HashMap;)V
    .locals 0

    .line 292
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;

    invoke-direct {p0, p2, p3, p4}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;-><init>(Landroid/view/View;Ljava/util/ArrayList;Ljava/util/HashMap;)V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 5

    .line 300
    invoke-super {p0}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog;->dismiss()V

    .line 303
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;

    iget-object v0, v0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->shoppingListEntryRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 304
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;

    iget-object v1, v1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    .line 306
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;

    iget-object v2, v2, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->quantity:Ljava/lang/Double;

    if-nez v2, :cond_0

    goto :goto_0

    .line 309
    :cond_0
    iget-object v1, v1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;

    iget-object v2, v2, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->shoppingListId:Ljava/lang/String;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;

    iget-object v3, v3, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->quantity:Ljava/lang/Double;

    .line 311
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    .line 309
    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->updateShoppingListEntryQuantity(Ljava/lang/String;Ljava/lang/String;D)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;Ljava/util/HashMap;)V
    .locals 1
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

    .line 295
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;

    invoke-static {v0, p1, p2, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;Landroid/view/View;Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;Ljava/util/HashMap;)V

    return-void
.end method
