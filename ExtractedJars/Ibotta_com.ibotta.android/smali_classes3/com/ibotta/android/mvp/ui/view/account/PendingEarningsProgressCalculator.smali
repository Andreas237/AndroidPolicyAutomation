.class public Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;
.super Ljava/lang/Object;
.source "PendingEarningsProgressCalculator.java"


# static fields
.field private static final NINETY_EIGHT_PERCENT:F = 0.98f


# instance fields
.field private balanceAmount:F

.field private gravity:I

.field private pendingAmount:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private handleHighBalance(FIIII)F
    .locals 1

    const v0, 0x800005

    .line 124
    iput v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->gravity:I

    const v0, 0x3f7ae148    # 0.98f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    int-to-float p2, p2

    mul-float p2, p2, p1

    sub-int/2addr p4, p3

    int-to-float p1, p4

    sub-float/2addr p2, p1

    return p2

    :cond_0
    sub-int/2addr p2, p4

    add-int/2addr p2, p5

    int-to-float p1, p2

    return p1
.end method

.method private handleLowBalance(FII)F
    .locals 3

    .line 100
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->balanceAmount:F

    const/4 v1, 0x1

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-nez v0, :cond_0

    .line 101
    iput v1, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->gravity:I

    goto :goto_0

    :cond_0
    const v0, 0x800003

    .line 103
    iput v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->gravity:I

    .line 106
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->getProgress()I

    move-result v0

    if-lt v0, v1, :cond_1

    int-to-float p2, p2

    sub-float/2addr p1, p2

    return p1

    :cond_1
    neg-int p1, p3

    int-to-float p1, p1

    return p1
.end method

.method private handleMediumBalance(FI)F
    .locals 1

    const/4 v0, 0x1

    .line 140
    iput v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->gravity:I

    .line 141
    div-int/lit8 p2, p2, 0x2

    int-to-float p2, p2

    sub-float/2addr p1, p2

    return p1
.end method


# virtual methods
.method public calculateAmountToEarn(I)I
    .locals 2

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->getProgress()I

    move-result v0

    iget v1, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->pendingAmount:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-int/2addr v0, v1

    :goto_0
    if-lt v0, p1, :cond_0

    mul-int/lit8 p1, p1, 0x2

    goto :goto_0

    :cond_0
    return p1
.end method

.method public calculateXValue(ILcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;)F
    .locals 7

    .line 37
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;->getProgressBarStartMargin()I

    move-result v0

    .line 38
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;->getProgressBarEndMargin()I

    move-result v6

    .line 39
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;->getDeviceWidth()I

    move-result v1

    add-int v2, v0, v6

    sub-int v3, v1, v2

    .line 41
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->getProgress()I

    move-result v1

    int-to-float v1, v1

    int-to-float v2, p1

    div-float v2, v1, v2

    .line 42
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;->getBottomArrowWidth()I

    move-result v1

    div-int/lit8 v4, v1, 0x2

    .line 43
    div-int/lit8 p1, p1, 0x8

    int-to-float p1, p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    mul-int/lit8 v1, p1, 0x7

    .line 46
    iget v5, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->balanceAmount:F

    int-to-float p1, p1

    cmpg-float p1, v5, p1

    if-gez p1, :cond_0

    int-to-float p1, v3

    mul-float p1, p1, v2

    .line 47
    invoke-direct {p0, p1, v4, v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->handleLowBalance(FII)F

    move-result p1

    return p1

    :cond_0
    int-to-float p1, v1

    cmpl-float p1, v5, p1

    if-lez p1, :cond_1

    .line 49
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;->getProgressPointerContainerWidth()I

    move-result v5

    move-object v1, p0

    .line 51
    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->handleHighBalance(FIIII)F

    move-result p1

    return p1

    :cond_1
    int-to-float p1, v3

    mul-float p1, p1, v2

    .line 53
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;->getProgressPointerContainerWidth()I

    move-result p2

    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->handleMediumBalance(FI)F

    move-result p1

    return p1
.end method

.method public getBottomArrowGravity()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->gravity:I

    return v0
.end method

.method public getProgress()I
    .locals 1

    .line 15
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->balanceAmount:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method public getSecondaryProgress()I
    .locals 2

    .line 19
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->pendingAmount:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    if-lez v0, :cond_0

    .line 21
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->getProgress()I

    move-result v1

    add-int/2addr v1, v0

    return v1

    :cond_0
    return v0
.end method

.method public setAmounts(FF)V
    .locals 3

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v2, p1, v0

    if-lez v2, :cond_0

    cmpg-float v2, p1, v1

    if-gez v2, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    :cond_0
    cmpl-float v0, p2, v0

    if-lez v0, :cond_1

    cmpg-float v0, p2, v1

    if-gez v0, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    .line 71
    :cond_1
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->balanceAmount:F

    .line 72
    iput p2, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->pendingAmount:F

    return-void
.end method
