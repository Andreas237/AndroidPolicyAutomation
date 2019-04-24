.class Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$2;
.super Ljava/lang/Object;
.source "ReceiptProductSelectorScreen.java"

# interfaces
.implements Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter$IItemStateCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isSelected(Ljava/lang/String;Z)Z
    .locals 0

    if-eqz p2, :cond_0

    .line 177
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-static {p2}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->access$500(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Ljava/util/HashSet;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 179
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-static {p2}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->access$600(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Ljava/util/HashMap;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-static {p2}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->access$600(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Ljava/util/HashMap;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-lez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public preSelectRetailerReceipt()V
    .locals 3

    .line 185
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->access$702(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;Z)Z

    .line 186
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-static {v0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->access$800(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 187
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-static {v0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->access$800(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    const v2, 0x7f1104e9

    invoke-virtual {v1, v2}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 188
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-static {v0}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->access$800(Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setAlpha(F)V

    return-void
.end method

.method public toggle(Ljava/lang/String;Z)Z
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    invoke-virtual {v0, p1, p2}, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;->toggleItem(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method
