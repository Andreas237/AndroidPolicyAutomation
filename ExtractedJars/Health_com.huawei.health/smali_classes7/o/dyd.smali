.class public Lo/dyd;
.super Lo/kz;
.source "SourceFile"


# instance fields
.field private aa:Lo/dye;

.field private ab:Lo/dyb;

.field private ac:I

.field private ad:[F

.field private ae:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 34
    invoke-direct {p0, p1}, Lo/kz;-><init>(Landroid/content/Context;)V

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dyd;->ae:Z

    .line 31
    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lo/dyd;->ad:[F

    .line 35
    invoke-direct {p0, p1}, Lo/dyd;->c(Landroid/content/Context;)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 39
    invoke-direct {p0, p1, p2}, Lo/kz;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dyd;->ae:Z

    .line 31
    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lo/dyd;->ad:[F

    .line 40
    invoke-direct {p0, p1}, Lo/dyd;->c(Landroid/content/Context;)V

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 44
    invoke-direct {p0, p1, p2, p3}, Lo/kz;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dyd;->ae:Z

    .line 31
    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lo/dyd;->ad:[F

    .line 45
    invoke-direct {p0, p1}, Lo/dyd;->c(Landroid/content/Context;)V

    .line 46
    return-void
.end method

.method private c(Landroid/content/Context;)V
    .locals 3

    .line 121
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/dyd;->setDrawMarkers(Z)V

    .line 122
    new-instance v0, Lo/dye;

    sget v1, Lcom/huawei/pluginachievement/R$layout;->pop_maekerview:I

    invoke-direct {v0, p1, v1}, Lo/dye;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lo/dyd;->aa:Lo/dye;

    .line 123
    iget-object v0, p0, Lo/dyd;->aa:Lo/dye;

    invoke-virtual {v0, p0}, Lo/dye;->setChartView(Lo/ld;)V

    .line 124
    iget-object v0, p0, Lo/dyd;->aa:Lo/dye;

    invoke-virtual {p0, v0}, Lo/dyd;->setMarker(Lo/lk;)V

    .line 126
    invoke-virtual {p0}, Lo/dyd;->getDescription()Lo/ll;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ll;->d(Z)V

    .line 127
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dyd;->setScaleEnabled(Z)V

    .line 128
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dyd;->setDrawGridBackground(Z)V

    .line 129
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dyd;->setTouchEnabled(Z)V

    .line 130
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dyd;->setDragXEnabled(Z)V

    .line 132
    invoke-virtual {p0}, Lo/dyd;->getXAxis()Lo/ln;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ln;->b(Z)V

    .line 133
    invoke-virtual {p0}, Lo/dyd;->getXAxis()Lo/ln;

    move-result-object v0

    sget-object v1, Lo/ln$e;->e:Lo/ln$e;

    invoke-virtual {v0, v1}, Lo/ln;->b(Lo/ln$e;)V

    .line 134
    invoke-virtual {p0}, Lo/dyd;->getXAxis()Lo/ln;

    move-result-object v0

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lo/ln;->k(F)V

    .line 135
    invoke-virtual {p0}, Lo/dyd;->getXAxis()Lo/ln;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$color;->color_reprot_frg_lebal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ln;->b(I)V

    .line 137
    invoke-virtual {p0}, Lo/dyd;->getXAxis()Lo/ln;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ln;->a(Z)V

    .line 139
    invoke-virtual {p0}, Lo/dyd;->getLegend()Lo/lm;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lm;->d(Z)V

    .line 141
    invoke-virtual {p0}, Lo/dyd;->getAxisLeft()Lo/lp;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lp;->d(Z)V

    .line 142
    invoke-virtual {p0}, Lo/dyd;->getAxisLeft()Lo/lp;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lp;->a(Z)V

    .line 143
    invoke-virtual {p0}, Lo/dyd;->getAxisRight()Lo/lp;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lp;->a(Z)V

    .line 144
    invoke-virtual {p0}, Lo/dyd;->getAxisRight()Lo/lp;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lp;->d(Z)V

    .line 145
    invoke-virtual {p0}, Lo/dyd;->getAxisLeft()Lo/lp;

    move-result-object v0

    const/4 v1, 0x5

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/lp;->d(IZ)V

    .line 146
    invoke-virtual {p0}, Lo/dyd;->getAxisLeft()Lo/lp;

    move-result-object v0

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lo/lp;->k(F)V

    .line 147
    invoke-virtual {p0}, Lo/dyd;->getAxisLeft()Lo/lp;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$color;->color_reprot_frg_lebal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/lp;->b(I)V

    .line 148
    invoke-virtual {p0}, Lo/dyd;->getAxisLeft()Lo/lp;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lp;->b(F)V

    .line 149
    invoke-virtual {p0}, Lo/dyd;->getAxisLeft()Lo/lp;

    move-result-object v0

    const/high16 v1, 0x41b00000    # 22.0f

    invoke-virtual {v0, v1}, Lo/lp;->o(F)V

    .line 151
    invoke-virtual {p0}, Lo/dyd;->getAxisLeft()Lo/lp;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/lp;->b(Z)V

    .line 153
    return-void
.end method

.method private setXAxisValueFormatter(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 70
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 71
    return-void

    .line 73
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 74
    invoke-virtual {p0}, Lo/dyd;->getXAxis()Lo/ln;

    move-result-object v0

    new-instance v1, Lo/dyd$2;

    invoke-direct {v1, p0, v2, p1}, Lo/dyd$2;-><init>(Lo/dyd;ILjava/util/List;)V

    invoke-virtual {v0, v1}, Lo/ln;->b(Lo/mf;)V

    .line 87
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .line 112
    invoke-super {p0}, Lo/kz;->a()V

    .line 113
    new-instance v0, Lo/dyb;

    iget-object v1, p0, Lo/dyd;->P:Lo/la;

    iget-object v2, p0, Lo/dyd;->O:Lo/oa;

    invoke-direct {v0, p0, v1, v2}, Lo/dyb;-><init>(Lo/mo;Lo/la;Lo/oa;)V

    iput-object v0, p0, Lo/dyd;->ab:Lo/dyb;

    .line 114
    iget-object v0, p0, Lo/dyd;->ab:Lo/dyb;

    iput-object v0, p0, Lo/dyd;->S:Lo/nj;

    .line 115
    new-instance v0, Lo/mk;

    invoke-direct {v0, p0}, Lo/mk;-><init>(Lo/mo;)V

    invoke-virtual {p0, v0}, Lo/dyd;->setHighlighter(Lo/mi;)V

    .line 117
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 92
    invoke-super {p0, p1}, Lo/kz;->onDraw(Landroid/graphics/Canvas;)V

    .line 93
    iget-object v0, p0, Lo/dyd;->ab:Lo/dyb;

    invoke-virtual {v0, p1}, Lo/dyb;->c(Landroid/graphics/Canvas;)V

    .line 95
    iget-object v0, p0, Lo/dyd;->ab:Lo/dyb;

    iget-object v3, v0, Lo/dyb;->o:Lo/nv;

    .line 96
    const/4 v0, 0x2

    new-array v4, v0, [F

    .line 97
    iget-object v0, p0, Lo/dyd;->ad:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    const/4 v1, 0x0

    aput v0, v4, v1

    .line 98
    iget-object v0, p0, Lo/dyd;->ad:[F

    const/4 v1, 0x1

    aget v0, v0, v1

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 100
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 101
    const-string v0, "WisdomBarChart"

    const-string v1, "onDraw() trans = null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    return-void

    .line 104
    :cond_0
    invoke-virtual {v3, v4}, Lo/nv;->e([F)V

    .line 105
    iget-object v0, p0, Lo/dyd;->aa:Lo/dye;

    iget-boolean v1, p0, Lo/dyd;->ae:Z

    invoke-virtual {v0, v1}, Lo/dye;->setIsRun(Z)V

    .line 106
    iget-object v0, p0, Lo/dyd;->aa:Lo/dye;

    const/4 v1, 0x0

    aget v1, v4, v1

    const/4 v2, 0x1

    aget v2, v4, v2

    invoke-virtual {v0, p1, v1, v2}, Lo/dye;->b(Landroid/graphics/Canvas;FF)V

    .line 107
    return-void
.end method

.method public setCustomValue(Landroid/content/Context;Ljava/util/ArrayList;IFFFZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Ljava/lang/String;>;IFFFZ)V"
        }
    .end annotation

    .line 49
    iput p3, p0, Lo/dyd;->ac:I

    .line 50
    iput-boolean p7, p0, Lo/dyd;->ae:Z

    .line 51
    iget-object v0, p0, Lo/dyd;->ab:Lo/dyb;

    move-object v1, p1

    iget v2, p0, Lo/dyd;->ac:I

    move v3, p4

    move v4, p5

    invoke-static {p6}, Lo/oc;->b(F)F

    move-result v5

    move v6, p7

    invoke-virtual/range {v0 .. v6}, Lo/dyb;->a(Landroid/content/Context;IFFFZ)V

    .line 52
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 53
    invoke-direct {p0, p2}, Lo/dyd;->setXAxisValueFormatter(Ljava/util/List;)V

    .line 54
    invoke-virtual {p0}, Lo/dyd;->getXAxis()Lo/ln;

    move-result-object v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ln;->c(I)V

    .line 56
    :cond_0
    return-void
.end method

.method public setMarkerViewData(IF)V
    .locals 3

    .line 59
    iget-object v0, p0, Lo/dyd;->ad:[F

    int-to-float v1, p1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 60
    iget-object v0, p0, Lo/dyd;->ad:[F

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 61
    return-void
.end method
