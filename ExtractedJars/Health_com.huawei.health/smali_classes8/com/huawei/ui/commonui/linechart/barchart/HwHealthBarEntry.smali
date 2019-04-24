.class public Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;
.super Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;
.source "SourceFile"

# interfaces
.implements Lo/ejt;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field private mBarChartDataStorageModel:Lo/ejp;

.field private mNegativeSum:F

.field private mPositiveSum:F


# direct methods
.method public constructor <init>(FLo/ejp;)V
    .locals 1

    .line 105
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    .line 107
    invoke-static {p2}, Lo/eko;->d(Lo/ejp;)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->setY(F)V

    .line 108
    iput-object p2, p0, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->mBarChartDataStorageModel:Lo/ejp;

    .line 109
    return-void
.end method


# virtual methods
.method public acquireModel()Lo/ejp;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->mBarChartDataStorageModel:Lo/ejp;

    return-object v0
.end method

.method public bridge synthetic copy()Lcom/github/mikephil/charting/data/Entry;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->copy()Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    move-result-object v0

    return-object v0
.end method

.method public copy()Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;
    .locals 3

    .line 166
    new-instance v2, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    invoke-virtual {p0}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getX()F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->mBarChartDataStorageModel:Lo/ejp;

    invoke-direct {v2, v0, v1}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;-><init>(FLo/ejp;)V

    .line 167
    return-object v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 332
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public getNegativeSum()F
    .locals 1

    .line 260
    iget v0, p0, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->mNegativeSum:F

    return v0
.end method

.method public getPositiveSum()F
    .locals 1

    .line 251
    iget v0, p0, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->mPositiveSum:F

    return v0
.end method

.method public getY()F
    .locals 1

    .line 199
    invoke-super {p0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 337
    invoke-super {p0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->hashCode()I

    move-result v0

    return v0
.end method
