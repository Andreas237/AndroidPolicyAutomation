.class public Lo/ekn;
.super Lo/lb;
.source "SourceFile"


# direct methods
.method public constructor <init>(IIZ)V
    .locals 0

    .line 14
    invoke-direct {p0, p1, p2, p3}, Lo/lb;-><init>(IIZ)V

    .line 15
    return-void
.end method


# virtual methods
.method public a(Lo/ejm;)V
    .locals 12

    .line 19
    invoke-interface {p1}, Lo/ejm;->C()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lo/ekn;->c:F

    mul-float v2, v0, v1

    .line 20
    iget v0, p0, Lo/ekn;->l:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, v0, v1

    .line 22
    const/4 v4, 0x0

    :goto_0
    int-to-float v0, v4

    cmpg-float v0, v0, v2

    if-gez v0, :cond_2

    .line 24
    invoke-interface {p1, v4}, Lo/ejm;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 26
    if-nez v5, :cond_0

    .line 27
    goto :goto_2

    .line 29
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getX()F

    move-result v6

    .line 30
    invoke-virtual {v5}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->acquireModel()Lo/ejp;

    move-result-object v7

    .line 33
    sub-float v8, v6, v3

    .line 34
    add-float v9, v6, v3

    .line 37
    invoke-static {v7}, Lo/eko;->d(Lo/ejp;)F

    move-result v11

    .line 38
    invoke-static {v7}, Lo/eko;->c(Lo/ejp;)F

    move-result v10

    .line 41
    const/4 v0, 0x0

    cmpl-float v0, v11, v0

    if-lez v0, :cond_1

    .line 42
    iget v0, p0, Lo/ekn;->a:F

    mul-float/2addr v11, v0

    goto :goto_1

    .line 44
    :cond_1
    iget v0, p0, Lo/ekn;->a:F

    mul-float/2addr v10, v0

    .line 46
    :goto_1
    invoke-virtual {p0, v8, v11, v9, v10}, Lo/ekn;->e(FFFF)V

    .line 22
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 95
    :cond_2
    invoke-virtual {p0}, Lo/ekn;->e()V

    .line 96
    return-void
.end method
