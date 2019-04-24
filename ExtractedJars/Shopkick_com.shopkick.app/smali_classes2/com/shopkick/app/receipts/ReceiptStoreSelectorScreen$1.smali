.class Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$1;
.super Ljava/lang/Object;
.source "ReceiptStoreSelectorScreen.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;

    invoke-static {v0}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->access$100(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)Lcom/shopkick/app/feed/FilterableAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FilterableAdapter;->getFilter()Landroid/widget/Filter;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 88
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->access$000(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    goto :goto_0

    .line 90
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->access$100(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)Lcom/shopkick/app/feed/FilterableAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FilterableAdapter;->getFilter()Landroid/widget/Filter;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 81
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->access$000(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method
