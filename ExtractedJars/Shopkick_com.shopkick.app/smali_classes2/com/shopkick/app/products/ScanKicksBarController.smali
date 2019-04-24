.class public Lcom/shopkick/app/products/ScanKicksBarController;
.super Ljava/lang/Object;
.source "ScanKicksBarController.java"


# static fields
.field private static final BLUE_TOAST_HEIGHT:I = 0x32

.field private static final BLUE_TOAST_REMAIN_TIME_MS:I = 0x1b58

.field private static final BLUE_TOAST_SLIDE_ANIMATION_TIME_MS:I = 0x3e8

.field private static final MAX_TEXT_ANIMATION_TIME_MS:I = 0x5dc

.field private static final TEXT_ANIMATION_INTERVAL_MS:I = 0x32


# instance fields
.field private availableReceiptKicks:Ljava/lang/Integer;

.field private feedRecyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private isCountingAnimationDone:Z

.field private isReceiptScanAvailable:Z

.field private isReceiptScanAvailableForAnyItem:Z

.field private kicksEarned:Ljava/lang/Integer;

.field private receiptKicksBar:Landroid/widget/FrameLayout;

.field private totalTripKicks:Ljava/lang/Integer;

.field private totalTripKicksBar:Landroid/widget/FrameLayout;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p2, p0, Lcom/shopkick/app/products/ScanKicksBarController;->feedRecyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    const p2, 0x7f0907aa

    .line 41
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout;

    iput-object p2, p0, Lcom/shopkick/app/products/ScanKicksBarController;->totalTripKicksBar:Landroid/widget/FrameLayout;

    const p2, 0x7f09058d

    .line 42
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/shopkick/app/products/ScanKicksBarController;->receiptKicksBar:Landroid/widget/FrameLayout;

    return-void
.end method


# virtual methods
.method public maybeAnimateTotalTripKicks()V
    .locals 9

    .line 78
    iget-boolean v0, p0, Lcom/shopkick/app/products/ScanKicksBarController;->isCountingAnimationDone:Z

    if-eqz v0, :cond_0

    return-void

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ScanKicksBarController;->totalTripKicks:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/products/ScanKicksBarController;->kicksEarned:Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    .line 87
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/products/ScanKicksBarController;->totalTripKicksBar:Landroid/widget/FrameLayout;

    const v1, 0x7f0907ab

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 88
    new-instance v0, Lcom/shopkick/app/animation/KicksEarnedTimer;

    const/16 v1, 0x5dc

    iget-object v2, p0, Lcom/shopkick/app/products/ScanKicksBarController;->kicksEarned:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    mul-int/lit8 v2, v2, 0x32

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    int-to-long v2, v1

    const-wide/16 v4, 0x32

    iget-object v1, p0, Lcom/shopkick/app/products/ScanKicksBarController;->kicksEarned:Ljava/lang/Integer;

    .line 91
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lcom/shopkick/app/products/ScanKicksBarController;->totalTripKicks:Ljava/lang/Integer;

    .line 92
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v8

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/shopkick/app/animation/KicksEarnedTimer;-><init>(JJLandroid/widget/TextView;II)V

    .line 94
    invoke-virtual {v0}, Lcom/shopkick/app/animation/KicksEarnedTimer;->start()Landroid/os/CountDownTimer;

    const/4 v0, 0x0

    .line 95
    iput-object v0, p0, Lcom/shopkick/app/products/ScanKicksBarController;->availableReceiptKicks:Ljava/lang/Integer;

    .line 96
    iput-object v0, p0, Lcom/shopkick/app/products/ScanKicksBarController;->totalTripKicks:Ljava/lang/Integer;

    .line 97
    iput-object v0, p0, Lcom/shopkick/app/products/ScanKicksBarController;->kicksEarned:Ljava/lang/Integer;

    const/4 v0, 0x1

    .line 98
    iput-boolean v0, p0, Lcom/shopkick/app/products/ScanKicksBarController;->isCountingAnimationDone:Z

    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method public prepareBlueToast(Ljava/util/HashMap;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string/jumbo v0, "totalTripKicks"

    .line 50
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanKicksBarController;->totalTripKicks:Ljava/lang/Integer;

    const-string v0, "kicksEarned"

    .line 51
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanKicksBarController;->kicksEarned:Ljava/lang/Integer;

    const-string v0, "availableReceiptKicks"

    .line 52
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/shopkick/app/products/ScanKicksBarController;->availableReceiptKicks:Ljava/lang/Integer;

    const-string v0, "receiptScanAvailable"

    .line 54
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/products/ScanKicksBarController;->isReceiptScanAvailable:Z

    const/4 p1, 0x0

    .line 55
    iput-boolean p1, p0, Lcom/shopkick/app/products/ScanKicksBarController;->isCountingAnimationDone:Z

    .line 57
    iget-object v0, p0, Lcom/shopkick/app/products/ScanKicksBarController;->receiptKicksBar:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 58
    iget-object v0, p0, Lcom/shopkick/app/products/ScanKicksBarController;->totalTripKicksBar:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 61
    iget-object v0, p0, Lcom/shopkick/app/products/ScanKicksBarController;->totalTripKicks:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, p1

    .line 64
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/products/ScanKicksBarController;->kicksEarned:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    .line 65
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 67
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/products/ScanKicksBarController;->totalTripKicksBar:Landroid/widget/FrameLayout;

    const v2, 0x7f0907ab

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    sub-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    iget-object p1, p0, Lcom/shopkick/app/products/ScanKicksBarController;->feedRecyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getDividerItemDecoration()Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->clearRule()V

    .line 73
    new-instance v0, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;

    iget-object v1, p0, Lcom/shopkick/app/products/ScanKicksBarController;->feedRecyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/16 v2, 0x32

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;-><init>(II)V

    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;->addRule(Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration$DividerRule;)V

    return-void
.end method

.method public setReceiptScanAvailableForAnyItem(Z)V
    .locals 0

    .line 46
    iput-boolean p1, p0, Lcom/shopkick/app/products/ScanKicksBarController;->isReceiptScanAvailableForAnyItem:Z

    return-void
.end method
