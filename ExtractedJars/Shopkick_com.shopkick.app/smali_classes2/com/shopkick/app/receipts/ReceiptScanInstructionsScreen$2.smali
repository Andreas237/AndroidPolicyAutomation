.class Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$2;
.super Ljava/lang/Object;
.source "ReceiptScanInstructionsScreen.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->setupFirstAnimation(Landroid/view/View;)V
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

    .line 286
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic lambda$onAnimationEnd$210(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$2;)V
    .locals 2

    .line 296
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$400(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Lcom/shopkick/app/widget/SKViewPager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {v1}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$400(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Lcom/shopkick/app/widget/SKViewPager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/widget/SKViewPager;->getCurrentItem()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKViewPager;->setCurrentItem(I)V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .line 293
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$100(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 296
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$300(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptScanInstructionsScreen$2$NCbgLQqoWfwBkmYUzk3XJK8ce2w;

    invoke-direct {v0, p0}, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptScanInstructionsScreen$2$NCbgLQqoWfwBkmYUzk3XJK8ce2w;-><init>(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$2;)V

    const-wide/16 v1, 0x9c4

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
