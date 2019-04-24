.class Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$2;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "ReceiptStoreSelectorScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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

    .line 125
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrolled(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 0

    .line 130
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;

    invoke-static {p2}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->access$200(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 131
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    .line 133
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->access$300(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 135
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;->access$300(Lcom/shopkick/app/receipts/ReceiptStoreSelectorScreen;)Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void
.end method
