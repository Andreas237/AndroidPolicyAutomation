.class public Lo/ela;
.super Lo/eik;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/eik<Lo/ekz;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ekz;>;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0, p1}, Lo/eik;-><init>(Ljava/util/List;)V

    .line 22
    return-void
.end method


# virtual methods
.method public c(FLo/eie;)Lcom/github/mikephil/charting/data/Entry;
    .locals 8

    .line 43
    new-instance v3, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;

    invoke-direct {v3}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;-><init>()V

    .line 44
    iget-object v0, p0, Lo/ela;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ekz;

    .line 46
    invoke-interface {v5, p2}, Lo/ekz;->b(Lo/eie;)Lo/ejq;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ejs;

    .line 47
    invoke-interface {v6, p1}, Lo/ejs;->a(F)Ljava/util/List;

    move-result-object v7

    .line 49
    if-eqz v7, :cond_0

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 51
    :cond_0
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;

    move-object v1, v5

    check-cast v1, Lo/elb;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;-><init>(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;)V

    invoke-virtual {v3, v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->add(Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;)V

    .line 52
    goto :goto_0

    .line 54
    :cond_1
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;

    const/4 v1, 0x0

    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    move-object v2, v5

    check-cast v2, Lo/elb;

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;-><init>(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;)V

    invoke-virtual {v3, v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->add(Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;)V

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    return-object v3
.end method

.method public d(Lo/mh;)Lcom/github/mikephil/charting/data/Entry;
    .locals 7

    .line 30
    new-instance v3, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;

    invoke-direct {v3}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;-><init>()V

    .line 31
    iget-object v0, p0, Lo/ela;->i:Ljava/util/List;

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

    check-cast v5, Lo/ekz;

    .line 32
    invoke-virtual {p1}, Lo/mh;->b()F

    move-result v0

    invoke-interface {v5, v0}, Lo/ekz;->e(F)Ljava/util/List;

    move-result-object v6

    .line 33
    if-eqz v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 34
    :cond_1
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;

    const/4 v1, 0x0

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    move-object v2, v5

    check-cast v2, Lo/elb;

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;-><init>(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;)V

    invoke-virtual {v3, v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->add(Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;)V

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    return-object v3
.end method
