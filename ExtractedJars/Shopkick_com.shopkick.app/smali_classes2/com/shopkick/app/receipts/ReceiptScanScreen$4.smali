.class Lcom/shopkick/app/receipts/ReceiptScanScreen$4;
.super Ljava/lang/Object;
.source "ReceiptScanScreen.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/ReceiptScanScreen;->startGoodReceiptAnimation()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/ReceiptScanScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;)V
    .locals 0

    .line 509
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen$4;->this$0:Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 516
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen$4;->this$0:Lcom/shopkick/app/receipts/ReceiptScanScreen;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->updateUIFromState(I)V

    .line 517
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen$4;->this$0:Lcom/shopkick/app/receipts/ReceiptScanScreen;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setProcessingImageIndicatorVisibility(I)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
