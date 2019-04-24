.class public Lo/ehq;
.super Lo/eik;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/eik<Lo/ejm;>;"
    }
.end annotation


# instance fields
.field private r:F


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ejm;>;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0, p1}, Lo/eik;-><init>(Ljava/util/List;)V

    .line 61
    const v0, 0x3f59999a    # 0.85f

    iput v0, p0, Lo/ehq;->r:F

    .line 23
    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 74
    iget v0, p0, Lo/ehq;->r:F

    return v0
.end method

.method public c(FLo/eie;)Lcom/github/mikephil/charting/data/Entry;
    .locals 7

    .line 42
    new-instance v3, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;

    invoke-direct {v3}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;-><init>()V

    .line 43
    iget-object v0, p0, Lo/ehq;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ejm;

    .line 44
    invoke-interface {v5, p1}, Lo/ejm;->e(F)Ljava/util/List;

    move-result-object v6

    .line 45
    if-eqz v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 47
    :cond_0
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;

    move-object v1, v5

    check-cast v1, Lo/ehn;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;-><init>(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;)V

    invoke-virtual {v3, v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->add(Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;)V

    .line 48
    goto :goto_0

    .line 50
    :cond_1
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;

    const/4 v1, 0x0

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    move-object v2, v5

    check-cast v2, Lo/ehn;

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;-><init>(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;)V

    invoke-virtual {v3, v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->add(Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;)V

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    return-object v3
.end method

.method public c(Lo/eic;)V
    .locals 1

    .line 162
    invoke-virtual {p1}, Lo/eic;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 164
    const v0, 0x439b8ccd    # 311.1f

    invoke-virtual {p0, v0}, Lo/ehq;->e(F)V

    goto :goto_0

    .line 165
    :cond_0
    invoke-virtual {p1}, Lo/eic;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 167
    const v0, 0x4405a666    # 534.6f

    invoke-virtual {p0, v0}, Lo/ehq;->e(F)V

    goto :goto_0

    .line 168
    :cond_1
    invoke-virtual {p1}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 170
    const v0, 0x467e4001    # 16272.001f

    invoke-virtual {p0, v0}, Lo/ehq;->e(F)V

    goto :goto_0

    .line 171
    :cond_2
    invoke-virtual {p1}, Lo/eic;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 173
    const v0, 0x4149999a    # 12.6f

    invoke-virtual {p0, v0}, Lo/ehq;->e(F)V

    goto :goto_0

    .line 174
    :cond_3
    invoke-virtual {p1}, Lo/eic;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 176
    const v0, 0x479eb429

    invoke-virtual {p0, v0}, Lo/ehq;->e(F)V

    .line 178
    :cond_4
    :goto_0
    return-void
.end method

.method public d(Lo/mh;)Lcom/github/mikephil/charting/data/Entry;
    .locals 7

    .line 31
    new-instance v3, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;

    invoke-direct {v3}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;-><init>()V

    .line 32
    iget-object v0, p0, Lo/ehq;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ejm;

    .line 33
    invoke-virtual {p1}, Lo/mh;->b()F

    move-result v0

    invoke-interface {v5, v0}, Lo/ejm;->e(F)Ljava/util/List;

    move-result-object v6

    .line 34
    if-eqz v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 35
    :cond_1
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;

    const/4 v1, 0x0

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    move-object v2, v5

    check-cast v2, Lo/ehn;

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;-><init>(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;)V

    invoke-virtual {v3, v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->add(Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;)V

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    return-object v3
.end method

.method public e(F)V
    .locals 0

    .line 70
    iput p1, p0, Lo/ehq;->r:F

    .line 71
    return-void
.end method
