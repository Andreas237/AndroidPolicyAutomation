.class Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$CancelOnClickListener;
.super Ljava/lang/Object;
.source "ReceiptStoreSelectorScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "CancelOnClickListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;Landroid/widget/EditText;)V
    .locals 0

    .line 319
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$CancelOnClickListener;->this$0:Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 320
    invoke-static {p1, p2}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->access$002(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;Landroid/widget/EditText;)Landroid/widget/EditText;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 326
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$CancelOnClickListener;->this$0:Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->access$000(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_0

    .line 327
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$CancelOnClickListener;->this$0:Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->access$000(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)Landroid/widget/EditText;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 329
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$CancelOnClickListener;->this$0:Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    :goto_0
    return-void
.end method
