.class public Lcom/huawei/ui/commonui/linechart/model/HwHealthLineEntry;
.super Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;
.source "SourceFile"

# interfaces
.implements Lo/ejt;


# instance fields
.field private mLineChartDataStorageModel:Lo/ejp;


# direct methods
.method public constructor <init>(FLo/ejp;)V
    .locals 1

    .line 17
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    .line 19
    invoke-static {p2}, Lo/eko;->b(Lo/ejp;)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/commonui/linechart/model/HwHealthLineEntry;->setY(F)V

    .line 20
    iput-object p2, p0, Lcom/huawei/ui/commonui/linechart/model/HwHealthLineEntry;->mLineChartDataStorageModel:Lo/ejp;

    .line 21
    return-void
.end method


# virtual methods
.method public acquireModel()Lo/ejp;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/ui/commonui/linechart/model/HwHealthLineEntry;->mLineChartDataStorageModel:Lo/ejp;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 29
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 35
    invoke-super {p0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->hashCode()I

    move-result v0

    return v0
.end method
