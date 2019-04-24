.class Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;
.super Ljava/lang/Object;
.source "ReceiptScanInstructionsScreen.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private isScrolledByUser:Z

.field private previousPosition:I

.field private previousState:I

.field final synthetic this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 98
    iput p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;->previousState:I

    .line 99
    iput p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;->previousPosition:I

    .line 100
    iput-boolean p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;->isScrolledByUser:Z

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 3

    .line 120
    iget v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;->previousState:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    if-ne p1, v1, :cond_0

    .line 121
    iput-boolean v2, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;->isScrolledByUser:Z

    goto :goto_0

    .line 122
    :cond_0
    iget v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;->previousState:I

    if-ne v0, v1, :cond_1

    if-nez p1, :cond_1

    const/4 v0, 0x0

    .line 123
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;->isScrolledByUser:Z

    .line 125
    :cond_1
    :goto_0
    iput p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;->previousState:I

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    .line 109
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {v1, v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$102(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;Z)Z

    .line 111
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {v1}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$200(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Lcom/shopkick/app/widget/PageIndicator;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/shopkick/app/widget/PageIndicator;->selectIndicator(I)V

    .line 112
    iget v1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;->previousPosition:I

    if-eq p1, v1, :cond_1

    iget-boolean v1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;->isScrolledByUser:Z

    if-eqz v1, :cond_1

    .line 113
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {v1, v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$102(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;Z)Z

    .line 115
    :cond_1
    iput p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;->previousPosition:I

    return-void
.end method
