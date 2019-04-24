.class Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "ReceiptScanInstructionsScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ReceiptInstructionScreenAdapter"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;


# direct methods
.method private constructor <init>(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)V
    .locals 0

    .line 446
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;)V
    .locals 0

    .line 446
    invoke-direct {p0, p1}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;-><init>(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)V

    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 2

    .line 482
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$600(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)[Landroid/animation/AnimatorSet;

    move-result-object v0

    aget-object v0, v0, p2

    if-eqz v0, :cond_0

    .line 484
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->removeAllListeners()V

    .line 485
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 486
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$600(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)[Landroid/animation/AnimatorSet;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v1, v0, p2

    .line 488
    :cond_0
    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public finishUpdate(Landroid/view/ViewGroup;)V
    .locals 3

    .line 498
    invoke-super {p0, p1}, Landroid/support/v4/view/PagerAdapter;->finishUpdate(Landroid/view/ViewGroup;)V

    .line 499
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$600(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)[Landroid/animation/AnimatorSet;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$400(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Lcom/shopkick/app/widget/SKViewPager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKViewPager;->getCurrentItem()I

    move-result v0

    aget-object p1, p1, v0

    if-eqz p1, :cond_1

    .line 501
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$400(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Lcom/shopkick/app/widget/SKViewPager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKViewPager;->getCurrentItem()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$800(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 502
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {v0, v1}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$802(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;Z)Z

    .line 503
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    goto :goto_0

    .line 504
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$400(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Lcom/shopkick/app/widget/SKViewPager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKViewPager;->getCurrentItem()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$900(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 505
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {v0, v1}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$902(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;Z)Z

    .line 506
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    .line 509
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$400(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Lcom/shopkick/app/widget/SKViewPager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKViewPager;->getCurrentItem()I

    move-result v0

    invoke-static {p1, v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$1000(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;I)V

    return-void
.end method

.method public getCount()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 4

    .line 450
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    .line 451
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    const/4 v1, 0x0

    packed-switch p2, :pswitch_data_0

    move v2, v1

    goto :goto_0

    :pswitch_0
    const v2, 0x7f0c0174

    goto :goto_0

    :pswitch_1
    const v2, 0x7f0c0173

    goto :goto_0

    :pswitch_2
    const v2, 0x7f0c0171

    :goto_0
    const/4 v3, 0x0

    .line 466
    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 467
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "screen"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 468
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 470
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;->this$0:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-static {p1, v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->access$700(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;Landroid/view/View;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public startUpdate(Landroid/view/ViewGroup;)V
    .locals 0

    .line 514
    invoke-super {p0, p1}, Landroid/support/v4/view/PagerAdapter;->startUpdate(Landroid/view/ViewGroup;)V

    return-void
.end method
