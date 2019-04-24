.class Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog$2;
.super Ljava/lang/Object;
.source "ReceiptScanThresholdHitDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;-><init>(Landroid/content/Context;ILandroid/view/View$OnClickListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog$2;->this$0:Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 48
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog$2;->this$0:Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;->dismiss()V

    return-void
.end method
