.class public Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;
.super Ljava/lang/Object;
.source "RebateIndicatorView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BadgeStatus"
.end annotation


# instance fields
.field private combo:Z

.field private multipleRedemptions:Z

.field private multiples:Z

.field private multiplesCount:S

.field private redemptionMax:S

.field private showQuantityBadge:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getMultiplesCount()S
    .locals 1

    .line 57
    iget-short v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->multiplesCount:S

    return v0
.end method

.method public getRedemptionMax()S
    .locals 1

    .line 65
    iget-short v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->redemptionMax:S

    return v0
.end method

.method public isCombo()Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->combo:Z

    return v0
.end method

.method public isMultipleRedemptions()Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->multipleRedemptions:Z

    return v0
.end method

.method public isMultiples()Z
    .locals 1

    .line 33
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->multiples:Z

    return v0
.end method

.method public isShowQuantityBadge()Z
    .locals 1

    .line 49
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->showQuantityBadge:Z

    return v0
.end method

.method public setCombo(Z)V
    .locals 0

    .line 45
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->combo:Z

    return-void
.end method

.method public setMultipleRedemptions(Z)V
    .locals 0

    .line 29
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->multipleRedemptions:Z

    return-void
.end method

.method public setMultiples(Z)V
    .locals 0

    .line 37
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->multiples:Z

    return-void
.end method

.method public setMultiplesCount(S)V
    .locals 0

    .line 61
    iput-short p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->multiplesCount:S

    return-void
.end method

.method public setRedemptionMax(S)S
    .locals 0

    .line 69
    iput-short p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->redemptionMax:S

    return p1
.end method

.method public setShowQuantityBadge(Z)V
    .locals 0

    .line 53
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->showQuantityBadge:Z

    return-void
.end method
