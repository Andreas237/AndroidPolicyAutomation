.class public Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;
.super Landroid/app/Dialog;
.source "ReceiptScanThresholdHitDialog.java"


# instance fields
.field private contentView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILandroid/view/View$OnClickListener;)V
    .locals 3

    const v0, 0x7f12022d

    .line 26
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 29
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0178

    const/4 v2, 0x0

    .line 30
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;->contentView:Landroid/view/View;

    const v0, 0x7f11054c

    .line 33
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 34
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v1, 0x0

    aput-object p2, v0, v1

    .line 33
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 35
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;->contentView:Landroid/view/View;

    const v0, 0x7f090476

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;->contentView:Landroid/view/View;

    const p2, 0x7f0900aa

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog$1;

    invoke-direct {p2, p0, p3}, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog$1;-><init>(Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;->contentView:Landroid/view/View;

    const p2, 0x7f0900a9

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog$2;

    invoke-direct {p2, p0}, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog$2;-><init>(Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 56
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 57
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;->contentView:Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;->setContentView(Landroid/view/View;)V

    return-void
.end method
