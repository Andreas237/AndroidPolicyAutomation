.class Lcom/shopkick/app/shoppinglists/SLEntryPickerController$6;
.super Ljava/util/TimerTask;
.source "SLEntryPickerController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->afterTextChanged(Landroid/text/Editable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)V
    .locals 0

    .line 485
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$6;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 488
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$6;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->access$400(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$6;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->access$400(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$6;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->access$400(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$6;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-static {v1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->access$500(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 489
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$6;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->access$700(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$6;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-static {v1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->access$600(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$6;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    .line 490
    invoke-static {v2}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->access$400(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Ljava/lang/String;

    move-result-object v2

    .line 489
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getSuggestionsForList(Ljava/lang/String;Ljava/lang/String;)V

    .line 491
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerController$6;->this$0:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->access$400(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->access$502(Lcom/shopkick/app/shoppinglists/SLEntryPickerController;Ljava/lang/String;)Ljava/lang/String;

    return-void

    :cond_1
    :goto_0
    return-void
.end method
