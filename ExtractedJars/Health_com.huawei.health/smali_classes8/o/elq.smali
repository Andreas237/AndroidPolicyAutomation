.class public Lo/elq;
.super Lo/kz;
.source "SourceFile"


# instance fields
.field protected aa:Landroid/graphics/RectF;

.field private ab:I

.field private ac:Lo/elt;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 30
    invoke-direct {p0, p1}, Lo/kz;-><init>(Landroid/content/Context;)V

    .line 82
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/elq;->aa:Landroid/graphics/RectF;

    .line 31
    invoke-direct {p0}, Lo/elq;->D()V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 35
    invoke-direct {p0, p1, p2}, Lo/kz;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 82
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/elq;->aa:Landroid/graphics/RectF;

    .line 36
    invoke-direct {p0}, Lo/elq;->D()V

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 40
    invoke-direct {p0, p1, p2, p3}, Lo/kz;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 82
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/elq;->aa:Landroid/graphics/RectF;

    .line 41
    invoke-direct {p0}, Lo/elq;->D()V

    .line 42
    return-void
.end method

.method private D()V
    .locals 3

    .line 172
    invoke-virtual {p0}, Lo/elq;->getDescription()Lo/ll;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ll;->d(Z)V

    .line 173
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/elq;->setScaleEnabled(Z)V

    .line 174
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/elq;->setDrawGridBackground(Z)V

    .line 175
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/elq;->setTouchEnabled(Z)V

    .line 176
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/elq;->setDragXEnabled(Z)V

    .line 178
    invoke-virtual {p0}, Lo/elq;->getXAxis()Lo/ln;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ln;->b(Z)V

    .line 179
    invoke-virtual {p0}, Lo/elq;->getXAxis()Lo/ln;

    move-result-object v0

    sget-object v1, Lo/ln$e;->e:Lo/ln$e;

    invoke-virtual {v0, v1}, Lo/ln;->b(Lo/ln$e;)V

    .line 180
    invoke-virtual {p0}, Lo/elq;->getXAxis()Lo/ln;

    move-result-object v0

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lo/ln;->k(F)V

    .line 181
    invoke-virtual {p0}, Lo/elq;->getXAxis()Lo/ln;

    move-result-object v0

    const-string v1, "#80000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ln;->b(I)V

    .line 183
    invoke-virtual {p0}, Lo/elq;->getXAxis()Lo/ln;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ln;->a(Z)V

    .line 185
    invoke-virtual {p0}, Lo/elq;->getLegend()Lo/lm;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lm;->d(Z)V

    .line 186
    invoke-virtual {p0}, Lo/elq;->getAxisLeft()Lo/lp;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lp;->d(Z)V

    .line 187
    invoke-virtual {p0}, Lo/elq;->getAxisLeft()Lo/lp;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lp;->a(Z)V

    .line 188
    invoke-virtual {p0}, Lo/elq;->getAxisRight()Lo/lp;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lp;->a(Z)V

    .line 189
    invoke-virtual {p0}, Lo/elq;->getAxisRight()Lo/lp;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lp;->d(Z)V

    .line 190
    invoke-virtual {p0}, Lo/elq;->getYAxis()Lo/lp;

    move-result-object v2

    .line 191
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Lo/lp;->d(IZ)V

    .line 192
    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v2, v0}, Lo/lp;->k(F)V

    .line 193
    const-string v0, "#80000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/lp;->b(I)V

    .line 194
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/lp;->b(F)V

    .line 195
    const/high16 v0, 0x41400000    # 12.0f

    invoke-virtual {v2, v0}, Lo/lp;->o(F)V

    .line 196
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/lp;->b(Z)V

    .line 215
    return-void
.end method

.method private setXAxisValueFormatter(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 134
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 135
    return-void

    .line 137
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 138
    invoke-virtual {p0}, Lo/elq;->getXAxis()Lo/ln;

    move-result-object v0

    new-instance v1, Lo/elq$4;

    invoke-direct {v1, p0, v2, p1}, Lo/elq$4;-><init>(Lo/elq;ILjava/util/List;)V

    invoke-virtual {v0, v1}, Lo/ln;->b(Lo/mf;)V

    .line 151
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .line 163
    invoke-super {p0}, Lo/kz;->a()V

    .line 164
    new-instance v0, Lo/elt;

    iget-object v1, p0, Lo/elq;->P:Lo/la;

    iget-object v2, p0, Lo/elq;->O:Lo/oa;

    invoke-direct {v0, p0, v1, v2}, Lo/elt;-><init>(Lo/mo;Lo/la;Lo/oa;)V

    iput-object v0, p0, Lo/elq;->ac:Lo/elt;

    .line 165
    iget-object v0, p0, Lo/elq;->ac:Lo/elt;

    iput-object v0, p0, Lo/elq;->S:Lo/nj;

    .line 166
    new-instance v0, Lo/mk;

    invoke-direct {v0, p0}, Lo/mk;-><init>(Lo/mo;)V

    invoke-virtual {p0, v0}, Lo/elq;->setHighlighter(Lo/mi;)V

    .line 168
    return-void
.end method

.method public f()V
    .locals 10

    .line 86
    const/4 v5, 0x0

    .line 87
    const/4 v6, 0x0

    .line 88
    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v7

    .line 89
    const/4 v8, 0x0

    .line 90
    iget-object v0, p0, Lo/elq;->aa:Landroid/graphics/RectF;

    invoke-virtual {p0, v0}, Lo/elq;->e(Landroid/graphics/RectF;)V

    .line 91
    iget-object v0, p0, Lo/elq;->aa:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    add-float/2addr v5, v0

    .line 92
    iget-object v0, p0, Lo/elq;->aa:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    add-float/2addr v7, v0

    .line 93
    iget-object v0, p0, Lo/elq;->aa:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    add-float/2addr v6, v0

    .line 94
    iget-object v0, p0, Lo/elq;->aa:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v8, v0

    .line 95
    iget-object v0, p0, Lo/elq;->l:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    iget-object v0, p0, Lo/elq;->l:Lo/lp;

    iget-object v1, p0, Lo/elq;->s:Lo/nt;

    invoke-virtual {v1}, Lo/nt;->e()Landroid/graphics/Paint;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/lp;->d(Landroid/graphics/Paint;)F

    move-result v0

    add-float/2addr v5, v0

    .line 99
    :cond_0
    iget-object v0, p0, Lo/elq;->r:Lo/lp;

    invoke-virtual {v0}, Lo/lp;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 100
    iget-object v0, p0, Lo/elq;->r:Lo/lp;

    iget-object v1, p0, Lo/elq;->t:Lo/nt;

    invoke-virtual {v1}, Lo/nt;->e()Landroid/graphics/Paint;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/lp;->d(Landroid/graphics/Paint;)F

    move-result v0

    add-float/2addr v6, v0

    .line 104
    :cond_1
    iget-object v0, p0, Lo/elq;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->B()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/elq;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 105
    iget-object v0, p0, Lo/elq;->H:Lo/ln;

    iget v0, v0, Lo/ln;->I:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/elq;->H:Lo/ln;

    invoke-virtual {v1}, Lo/ln;->y()F

    move-result v1

    add-float v9, v0, v1

    .line 106
    iget-object v0, p0, Lo/elq;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->j()Lo/ln$e;

    move-result-object v0

    sget-object v1, Lo/ln$e;->e:Lo/ln$e;

    if-ne v0, v1, :cond_2

    .line 107
    add-float/2addr v8, v9

    goto :goto_0

    .line 108
    :cond_2
    iget-object v0, p0, Lo/elq;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->j()Lo/ln$e;

    move-result-object v0

    sget-object v1, Lo/ln$e;->d:Lo/ln$e;

    if-ne v0, v1, :cond_3

    .line 109
    add-float/2addr v7, v9

    goto :goto_0

    .line 110
    :cond_3
    iget-object v0, p0, Lo/elq;->H:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->j()Lo/ln$e;

    move-result-object v0

    sget-object v1, Lo/ln$e;->a:Lo/ln$e;

    if-ne v0, v1, :cond_4

    .line 111
    add-float/2addr v8, v9

    .line 112
    add-float/2addr v7, v9

    .line 116
    :cond_4
    :goto_0
    invoke-virtual {p0}, Lo/elq;->getExtraTopOffset()F

    move-result v0

    add-float/2addr v7, v0

    .line 117
    invoke-virtual {p0}, Lo/elq;->getExtraRightOffset()F

    move-result v0

    add-float/2addr v6, v0

    .line 118
    invoke-virtual {p0}, Lo/elq;->getExtraBottomOffset()F

    move-result v0

    add-float/2addr v8, v0

    .line 119
    invoke-virtual {p0}, Lo/elq;->getExtraLeftOffset()F

    move-result v0

    add-float/2addr v5, v0

    .line 120
    iget v0, p0, Lo/elq;->o:F

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v9

    .line 121
    iget-object v0, p0, Lo/elq;->O:Lo/oa;

    invoke-static {v9, v5}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v9, v7}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-static {v9, v6}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-static {v9, v8}, Ljava/lang/Math;->max(FF)F

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/oa;->a(FFFF)V

    .line 123
    invoke-virtual {p0}, Lo/elq;->g()V

    .line 124
    invoke-virtual {p0}, Lo/elq;->i()V

    .line 125
    return-void
.end method

.method public getYAxis()Lo/lp;
    .locals 1

    .line 221
    invoke-virtual {p0}, Lo/elq;->getAxisLeft()Lo/lp;

    move-result-object v0

    return-object v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 156
    invoke-super {p0, p1}, Lo/kz;->onDraw(Landroid/graphics/Canvas;)V

    .line 157
    iget-object v0, p0, Lo/elq;->ac:Lo/elt;

    invoke-virtual {v0, p1}, Lo/elt;->c(Landroid/graphics/Canvas;)V

    .line 158
    return-void
.end method

.method public setCustomValue(Landroid/content/Context;Ljava/util/ArrayList;IFFFZ)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Ljava/lang/String;>;IFFFZ)V"
        }
    .end annotation

    .line 45
    iput p3, p0, Lo/elq;->ab:I

    .line 47
    const/4 v7, 0x1

    .line 48
    invoke-virtual {p0}, Lo/elq;->getData()Lo/ma;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 49
    invoke-virtual {p0}, Lo/elq;->getData()Lo/ma;

    move-result-object v0

    check-cast v0, Lo/lo;

    invoke-virtual {v0}, Lo/lo;->h()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 50
    invoke-virtual {p0}, Lo/elq;->getData()Lo/ma;

    move-result-object v0

    check-cast v0, Lo/lo;

    invoke-virtual {v0}, Lo/lo;->h()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/mt;

    .line 54
    invoke-virtual {p0}, Lo/elq;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    invoke-interface {v8}, Lo/mt;->H()F

    move-result v0

    invoke-interface {v8, v0}, Lo/mt;->e(F)Ljava/util/List;

    move-result-object v9

    goto :goto_0

    .line 57
    :cond_0
    invoke-interface {v8}, Lo/mt;->I()F

    move-result v0

    invoke-interface {v8, v0}, Lo/mt;->e(F)Ljava/util/List;

    move-result-object v9

    .line 60
    :goto_0
    if-eqz v9, :cond_2

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 61
    const/4 v10, 0x0

    :goto_1
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_2

    .line 62
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/github/mikephil/charting/data/BarEntry;

    .line 63
    invoke-virtual {v11}, Lcom/github/mikephil/charting/data/BarEntry;->getY()F

    move-result v0

    cmpl-float v0, v0, p5

    if-eqz v0, :cond_1

    .line 64
    const/4 v7, 0x0

    .line 65
    goto :goto_2

    .line 61
    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 71
    :cond_2
    :goto_2
    iget-object v0, p0, Lo/elq;->ac:Lo/elt;

    invoke-virtual {v0, v7}, Lo/elt;->b(Z)V

    .line 72
    iget-object v0, p0, Lo/elq;->ac:Lo/elt;

    move-object v1, p1

    iget v2, p0, Lo/elq;->ab:I

    move/from16 v3, p4

    move/from16 v4, p5

    invoke-static/range {p6 .. p6}, Lo/oc;->b(F)F

    move-result v5

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Lo/elt;->e(Landroid/content/Context;IFFFZ)V

    .line 73
    invoke-static {p1}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 74
    invoke-static {p2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 76
    :cond_3
    const/4 v0, 0x0

    if-eq v0, p2, :cond_4

    .line 77
    invoke-direct {p0, p2}, Lo/elq;->setXAxisValueFormatter(Ljava/util/List;)V

    .line 78
    invoke-virtual {p0}, Lo/elq;->getXAxis()Lo/ln;

    move-result-object v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ln;->c(I)V

    .line 80
    :cond_4
    return-void
.end method
