.class Lcom/shopkick/app/receipts/AbstractCameraController$3;
.super Ljava/lang/Object;
.source "AbstractCameraController.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/AbstractCameraController;->showConfirmCancelDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/AbstractCameraController;

.field final synthetic val$receiptScanActivity:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/AbstractCameraController;Landroid/app/Activity;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController$3;->this$0:Lcom/shopkick/app/receipts/AbstractCameraController;

    iput-object p2, p0, Lcom/shopkick/app/receipts/AbstractCameraController$3;->val$receiptScanActivity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 159
    iget-object p2, p0, Lcom/shopkick/app/receipts/AbstractCameraController$3;->this$0:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-virtual {p2}, Lcom/shopkick/app/receipts/AbstractCameraController;->cleanUpAndExit()V

    .line 160
    iget-object p2, p0, Lcom/shopkick/app/receipts/AbstractCameraController$3;->val$receiptScanActivity:Landroid/app/Activity;

    if-eqz p2, :cond_0

    .line 161
    invoke-virtual {p2}, Landroid/app/Activity;->finish()V

    .line 163
    :cond_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
