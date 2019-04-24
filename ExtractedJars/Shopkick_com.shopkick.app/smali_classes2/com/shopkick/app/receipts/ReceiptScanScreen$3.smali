.class Lcom/shopkick/app/receipts/ReceiptScanScreen$3;
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

.field final synthetic val$as2:Landroid/animation/AnimatorSet;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;Landroid/animation/AnimatorSet;)V
    .locals 0

    .line 486
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen$3;->this$0:Lcom/shopkick/app/receipts/ReceiptScanScreen;

    iput-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen$3;->val$as2:Landroid/animation/AnimatorSet;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 493
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen$3;->this$0:Lcom/shopkick/app/receipts/ReceiptScanScreen;

    iget-object p1, p1, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageLabel:Lcom/shopkick/app/widget/SKTextView;

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen$3;->this$0:Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f110541

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 494
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen$3;->this$0:Lcom/shopkick/app/receipts/ReceiptScanScreen;

    iget-object p1, p1, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageProgressBar:Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 495
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen$3;->val$as2:Landroid/animation/AnimatorSet;

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

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
