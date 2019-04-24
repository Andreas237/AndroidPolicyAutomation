.class Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog$1;
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

.field final synthetic val$submitListener:Landroid/view/View$OnClickListener;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog$1;->this$0:Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;

    iput-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog$1;->val$submitListener:Landroid/view/View$OnClickListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog$1;->this$0:Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;->dismiss()V

    .line 42
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog$1;->val$submitListener:Landroid/view/View$OnClickListener;

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    return-void
.end method
