.class Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$4;
.super Ljava/lang/Object;
.source "ReceiptScanInstructionsScreen.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->setupThirdAnimation(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)V
    .locals 0

    .line 425
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$4;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

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

    .line 432
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$4;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$600(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)[Landroid/animation/AnimatorSet;

    move-result-object p1

    const/4 v0, 0x2

    aget-object p1, p1, v0

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
