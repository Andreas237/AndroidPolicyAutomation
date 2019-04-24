.class public Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;
.super Lcom/github/mikephil/charting/data/Entry;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/github/mikephil/charting/data/Entry;Ljava/lang/Comparable<Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    .line 16
    return-void
.end method

.method public constructor <init>(FFLandroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2, p3}, Lcom/github/mikephil/charting/data/Entry;-><init>(FFLandroid/graphics/drawable/Drawable;)V

    .line 24
    return-void
.end method

.method public constructor <init>(FFLandroid/graphics/drawable/Drawable;Ljava/lang/Object;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/github/mikephil/charting/data/Entry;-><init>(FFLandroid/graphics/drawable/Drawable;Ljava/lang/Object;)V

    .line 28
    return-void
.end method

.method public constructor <init>(FFLjava/lang/Object;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2, p3}, Lcom/github/mikephil/charting/data/Entry;-><init>(FFLjava/lang/Object;)V

    .line 20
    return-void
.end method


# virtual methods
.method public compareTo(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;)I
    .locals 2

    .line 32
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 33
    const/4 v0, 0x1

    return v0

    .line 34
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x33d6bf95    # 1.0E-7f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 35
    const/4 v0, 0x0

    return v0

    .line 37
    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 13
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->compareTo(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 42
    instance-of v0, p1, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    if-nez v0, :cond_0

    .line 43
    const/4 v0, 0x0

    return v0

    .line 45
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    move-object v1, p1

    check-cast v1, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v1

    invoke-static {v0, v1}, Lo/ekl;->a(FF)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 46
    const/4 v0, 0x1

    return v0

    .line 48
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 54
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    float-to-int v0, v0

    return v0
.end method
