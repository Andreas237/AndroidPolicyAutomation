.class public Lo/els;
.super Lo/lf;
.source "SourceFile"


# instance fields
.field private a:I

.field private aa:I

.field private ab:I

.field private ac:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 41
    invoke-direct {p0, p1}, Lo/lf;-><init>(Landroid/content/Context;)V

    .line 35
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/els;->a:I

    .line 36
    const-string v0, "#FFFDB290"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/els;->aa:I

    .line 37
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/els;->ab:I

    .line 38
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->report_line_chart_shadow:I

    iput v0, p0, Lo/els;->ac:I

    .line 42
    invoke-direct {p0}, Lo/els;->e()V

    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 46
    invoke-direct {p0, p1, p2}, Lo/lf;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/els;->a:I

    .line 36
    const-string v0, "#FFFDB290"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/els;->aa:I

    .line 37
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/els;->ab:I

    .line 38
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->report_line_chart_shadow:I

    iput v0, p0, Lo/els;->ac:I

    .line 47
    invoke-direct {p0}, Lo/els;->e()V

    .line 48
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 51
    invoke-direct {p0, p1, p2, p3}, Lo/lf;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 35
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/els;->a:I

    .line 36
    const-string v0, "#FFFDB290"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/els;->aa:I

    .line 37
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/els;->ab:I

    .line 38
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->report_line_chart_shadow:I

    iput v0, p0, Lo/els;->ac:I

    .line 52
    invoke-direct {p0}, Lo/els;->e()V

    .line 53
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Lcom/github/mikephil/charting/data/Entry;>;Ljava/util/ArrayList<Lcom/github/mikephil/charting/data/Entry;>;Ljava/util/ArrayList<Lcom/github/mikephil/charting/data/Entry;>;)V"
        }
    .end annotation

    .line 218
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 219
    const/4 v5, 0x0

    .line 220
    const/4 v0, 0x0

    if-ne v0, p4, :cond_0

    .line 221
    const/4 v5, 0x1

    .line 223
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2, v5}, Lo/els;->d(Landroid/content/Context;ILjava/util/List;Z)Lo/ly;

    move-result-object v6

    .line 224
    const/4 v0, 0x2

    invoke-direct {p0, p1, v0, p3, v5}, Lo/els;->d(Landroid/content/Context;ILjava/util/List;Z)Lo/ly;

    move-result-object v7

    .line 225
    const/4 v0, 0x3

    invoke-direct {p0, p1, v0, p4, v5}, Lo/els;->d(Landroid/content/Context;ILjava/util/List;Z)Lo/ly;

    move-result-object v8

    .line 226
    invoke-static {p1}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 227
    if-eqz v8, :cond_1

    .line 228
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    :cond_1
    if-eqz v7, :cond_2

    .line 231
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 233
    :cond_2
    if-eqz v6, :cond_6

    .line 234
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 237
    :cond_3
    if-eqz v6, :cond_4

    .line 238
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    :cond_4
    if-eqz v7, :cond_5

    .line 241
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    :cond_5
    if-eqz v8, :cond_6

    .line 244
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    :cond_6
    :goto_0
    const-string v0, "dataSets"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    new-instance v9, Lo/lx;

    invoke-direct {v9, v4}, Lo/lx;-><init>(Ljava/util/List;)V

    .line 251
    invoke-virtual {p0, v9}, Lo/els;->setData(Lo/ma;)V

    .line 252
    return-void
.end method

.method private b(Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/github/mikephil/charting/data/Entry;>;Ljava/util/ArrayList<Lcom/github/mikephil/charting/data/Entry;>;)Ljava/util/ArrayList<Lcom/github/mikephil/charting/data/Entry;>;"
        }
    .end annotation

    .line 122
    const/4 v3, 0x0

    .line 123
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 124
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v3, v0, -0x1

    .line 126
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 128
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 129
    new-instance v5, Lcom/github/mikephil/charting/data/Entry;

    add-int v0, v3, v6

    int-to-float v0, v0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v6

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/mikephil/charting/data/Entry;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    invoke-direct {v5, v0, v1}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    .line 130
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v6

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/data/Entry;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/Entry;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/github/mikephil/charting/data/Entry;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 131
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v6

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/data/Entry;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/Entry;->getData()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/github/mikephil/charting/data/Entry;->setData(Ljava/lang/Object;)V

    .line 132
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 134
    :cond_1
    return-object v4
.end method

.method private c()V
    .locals 2

    .line 77
    invoke-virtual {p0}, Lo/els;->getDescription()Lo/ll;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ll;->d(Z)V

    .line 80
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/els;->setPinchZoom(Z)V

    .line 81
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/els;->setDrawBorders(Z)V

    .line 83
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/els;->setTouchEnabled(Z)V

    .line 86
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/els;->setDragEnabled(Z)V

    .line 88
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/els;->setScaleEnabled(Z)V

    .line 91
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/els;->setLogEnabled(Z)V

    .line 94
    invoke-virtual {p0}, Lo/els;->getLegend()Lo/lm;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lm;->d(Z)V

    .line 100
    return-void
.end method

.method private d(Landroid/content/Context;ILjava/util/List;Z)Lo/ly;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;ILjava/util/List<Lcom/github/mikephil/charting/data/Entry;>;Z)Lo/ly;"
        }
    .end annotation

    .line 255
    if-eqz p3, :cond_0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 256
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 258
    :cond_1
    new-instance v3, Lo/ly;

    const-string v0, ""

    invoke-direct {v3, p3, v0}, Lo/ly;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 260
    invoke-virtual {v3}, Lo/ly;->c()V

    .line 261
    if-eqz p4, :cond_2

    .line 262
    new-instance v0, Lo/els$3;

    invoke-direct {v0, p0}, Lo/els$3;-><init>(Lo/els;)V

    invoke-virtual {v3, v0}, Lo/ly;->b(Lo/ml;)V

    .line 269
    :cond_2
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 271
    :pswitch_0
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v3, v0}, Lo/ly;->c(F)V

    .line 272
    iget v0, p0, Lo/els;->a:I

    invoke-virtual {v3, v0}, Lo/ly;->c(I)V

    .line 274
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/ly;->a(Z)V

    .line 276
    iget v0, p0, Lo/els;->a:I

    invoke-virtual {v3, v0}, Lo/ly;->i(I)V

    .line 278
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/ly;->b(Z)V

    .line 279
    const/high16 v0, 0x41000000    # 8.0f

    invoke-virtual {v3, v0}, Lo/ly;->d(F)V

    .line 280
    const-string v0, "#801A1A1A"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lo/ly;->a(I)V

    .line 283
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/ly;->d(Z)V

    .line 284
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lo/els;->ac:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/ly;->d(Landroid/graphics/drawable/Drawable;)V

    .line 286
    goto/16 :goto_0

    .line 288
    :pswitch_1
    iget v0, p0, Lo/els;->aa:I

    invoke-virtual {v3, v0}, Lo/ly;->c(I)V

    .line 289
    const/high16 v0, 0x40400000    # 3.0f

    invoke-virtual {v3, v0}, Lo/ly;->c(F)V

    .line 290
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/ly;->a(Z)V

    .line 292
    iget v0, p0, Lo/els;->aa:I

    invoke-virtual {v3, v0}, Lo/ly;->i(I)V

    .line 294
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/ly;->b(Z)V

    .line 295
    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v3, v0}, Lo/ly;->d(F)V

    .line 297
    const-string v0, "#FF1A1A1A"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lo/ly;->a(I)V

    .line 300
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/ly;->d(Z)V

    .line 301
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lo/els;->ac:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/ly;->d(Landroid/graphics/drawable/Drawable;)V

    .line 303
    goto :goto_0

    .line 305
    :pswitch_2
    iget v0, p0, Lo/els;->ab:I

    invoke-virtual {v3, v0}, Lo/ly;->c(I)V

    .line 306
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v3, v0}, Lo/ly;->c(F)V

    .line 308
    const/high16 v0, 0x41200000    # 10.0f

    const/high16 v1, 0x41200000    # 10.0f

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v1, v2}, Lo/ly;->d(FFF)V

    .line 309
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/ly;->a(Z)V

    .line 311
    iget v0, p0, Lo/els;->ab:I

    invoke-virtual {v3, v0}, Lo/ly;->i(I)V

    .line 313
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/ly;->b(Z)V

    .line 314
    const/high16 v0, 0x41000000    # 8.0f

    invoke-virtual {v3, v0}, Lo/ly;->d(F)V

    .line 315
    const-string v0, "#801A1A1A"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lo/ly;->a(I)V

    .line 317
    .line 322
    :goto_0
    return-object v3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private e(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/github/mikephil/charting/data/Entry;>;)Ljava/util/ArrayList<Lcom/github/mikephil/charting/data/Entry;>;"
        }
    .end annotation

    .line 110
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 112
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 113
    new-instance v4, Lcom/github/mikephil/charting/data/Entry;

    int-to-float v0, v5

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v5

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/mikephil/charting/data/Entry;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    invoke-direct {v4, v0, v1}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    .line 114
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v5

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/data/Entry;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/Entry;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/github/mikephil/charting/data/Entry;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 115
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v5

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/data/Entry;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/Entry;->getData()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/github/mikephil/charting/data/Entry;->setData(Ljava/lang/Object;)V

    .line 116
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 118
    :cond_0
    return-object v3
.end method

.method private e()V
    .locals 0

    .line 71
    invoke-direct {p0}, Lo/els;->c()V

    .line 72
    return-void
.end method

.method public static setXAxisValueFormatter(Lo/ln;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/ln;Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 198
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 199
    return-void

    .line 201
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    .line 202
    new-instance v0, Lo/els$1;

    invoke-direct {v0, v1, p1}, Lo/els$1;-><init>(ILjava/util/List;)V

    invoke-virtual {p0, v0}, Lo/ln;->b(Lo/mf;)V

    .line 215
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .line 57
    invoke-super {p0}, Lo/lf;->a()V

    .line 58
    new-instance v0, Lo/elv;

    iget-object v1, p0, Lo/els;->P:Lo/la;

    iget-object v2, p0, Lo/els;->O:Lo/oa;

    invoke-direct {v0, p0, v1, v2}, Lo/elv;-><init>(Lo/mu;Lo/la;Lo/oa;)V

    iput-object v0, p0, Lo/els;->S:Lo/nj;

    .line 59
    return-void
.end method

.method public a(IIII)V
    .locals 0

    .line 103
    iput p1, p0, Lo/els;->a:I

    .line 104
    iput p2, p0, Lo/els;->aa:I

    .line 105
    iput p3, p0, Lo/els;->ab:I

    .line 106
    iput p4, p0, Lo/els;->ac:I

    .line 107
    return-void
.end method

.method public e(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 333
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 334
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 335
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 334
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 337
    :cond_0
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 63
    invoke-super {p0, p1}, Lo/lf;->onDraw(Landroid/graphics/Canvas;)V

    .line 64
    return-void
.end method

.method public setChartData(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Ljava/lang/String;>;Ljava/util/ArrayList<Lcom/github/mikephil/charting/data/Entry;>;Ljava/util/ArrayList<Lcom/github/mikephil/charting/data/Entry;>;Ljava/util/ArrayList<Lcom/github/mikephil/charting/data/Entry;>;)V"
        }
    .end annotation

    .line 139
    invoke-static {p1}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 140
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    .line 141
    invoke-direct {p0, p3, p4}, Lo/els;->b(Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p3

    .line 143
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p4, :cond_1

    .line 144
    invoke-direct {p0, p4}, Lo/els;->e(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p4

    .line 146
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p5, :cond_2

    .line 147
    invoke-direct {p0, p5}, Lo/els;->e(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p5

    .line 152
    :cond_2
    invoke-virtual {p0}, Lo/els;->getXAxis()Lo/ln;

    move-result-object v2

    .line 156
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v2, v0}, Lo/ln;->d(F)V

    .line 157
    sget-object v0, Lo/ln$e;->e:Lo/ln$e;

    invoke-virtual {v2, v0}, Lo/ln;->b(Lo/ln$e;)V

    .line 159
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/ln;->b(Z)V

    .line 160
    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {v2, v0}, Lo/ln;->e(F)V

    .line 164
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/ln;->c(Z)V

    .line 167
    const-string v0, "#80000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/ln;->b(I)V

    .line 168
    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v2, v0}, Lo/ln;->k(F)V

    .line 169
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/ln;->a(Z)V

    .line 170
    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v2, v0}, Lo/ln;->g(F)V

    .line 172
    invoke-virtual {p0}, Lo/els;->getAxisRight()Lo/lp;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lp;->d(Z)V

    .line 174
    invoke-virtual {p0}, Lo/els;->getAxisLeft()Lo/lp;

    move-result-object v3

    .line 175
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/lp;->d(Z)V

    .line 176
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/lp;->e(Z)V

    .line 177
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/lp;->i(Z)V

    .line 178
    const/high16 v0, 0x41400000    # 12.0f

    invoke-virtual {v3, v0}, Lo/lp;->o(F)V

    .line 183
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/lp;->b(Z)V

    .line 184
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 185
    invoke-virtual {p0, v4, p2}, Lo/els;->e(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 186
    invoke-static {v2, v4}, Lo/els;->setXAxisValueFormatter(Lo/ln;Ljava/util/List;)V

    .line 187
    invoke-direct {p0, p1, p3, p4, p5}, Lo/els;->a(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 188
    return-void
.end method
