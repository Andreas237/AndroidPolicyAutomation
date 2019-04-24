.class public Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;
.super Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;
.source "RebateIndicatorView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 78
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 82
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private initForCombo()V
    .locals 2

    const/4 v0, 0x0

    .line 118
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setVisibility(I)V

    .line 119
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setImage(I)V

    const v0, 0x7f11049c

    .line 120
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setText(I)V

    .line 121
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f11049d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initForMultipleRedemptions(S)V
    .locals 3

    const/4 v0, 0x0

    .line 101
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setVisibility(I)V

    const v1, 0x7f08023d

    .line 102
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setImage(I)V

    .line 103
    invoke-virtual {p0, v0, v0, v0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setImagePadding(IIII)V

    .line 104
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 105
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    aput-object p1, v2, v0

    const p1, 0x7f11049e

    .line 104
    invoke-virtual {v1, p1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initForMultiples(S)V
    .locals 5

    const/4 v0, 0x0

    .line 109
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setVisibility(I)V

    .line 110
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setImage(I)V

    .line 111
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    .line 112
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    aput-object v4, v3, v0

    const v4, 0x7f11049f

    .line 111
    invoke-virtual {v1, v4, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setText(Ljava/lang/String;)V

    .line 113
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    .line 114
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    aput-object p1, v2, v0

    const p1, 0x7f1104a0

    .line 113
    invoke-virtual {v1, p1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initForStandard()V
    .locals 1

    const/16 v0, 0x8

    .line 125
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public setup(Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;)V
    .locals 1

    const/16 v0, 0x8

    .line 87
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setVisibility(I)V

    .line 89
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->isMultipleRedemptions()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->isShowQuantityBadge()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->getRedemptionMax()S

    move-result p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->initForMultipleRedemptions(S)V

    goto :goto_0

    .line 91
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->isMultiples()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 92
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->getMultiplesCount()S

    move-result p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->initForMultiples(S)V

    goto :goto_0

    .line 93
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->isCombo()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 94
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->initForCombo()V

    goto :goto_0

    .line 96
    :cond_2
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->initForStandard()V

    :goto_0
    return-void
.end method
