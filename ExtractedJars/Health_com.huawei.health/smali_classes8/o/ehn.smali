.class public abstract Lo/ehn;
.super Lo/ehs;
.source "SourceFile"

# interfaces
.implements Lo/ejo;
.implements Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;


# instance fields
.field private q:Lo/eks;

.field private t:Z

.field private u:F

.field private v:I

.field private w:Z

.field private z:Lo/eit$b;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;>;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0, p1, p3}, Lo/ehs;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 56
    new-instance v0, Lo/eks;

    invoke-direct {v0}, Lo/eks;-><init>()V

    iput-object v0, p0, Lo/ehn;->q:Lo/eks;

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehn;->t:Z

    .line 66
    const/high16 v0, 0x43960000    # 300.0f

    iput v0, p0, Lo/ehn;->u:F

    .line 103
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehn;->w:Z

    .line 104
    const/4 v0, 0x0

    iput v0, p0, Lo/ehn;->v:I

    .line 35
    invoke-direct {p0, p2, p4}, Lo/ehn;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 39
    iget-object v0, p0, Lo/ehn;->q:Lo/eks;

    iput-object p1, v0, Lo/eks;->e:Ljava/lang/String;

    .line 40
    iget-object v0, p0, Lo/ehn;->q:Lo/eks;

    iput-object p2, v0, Lo/eks;->a:Ljava/lang/String;

    .line 42
    const v0, -0xffff01

    invoke-virtual {p0, v0}, Lo/ehn;->c(I)V

    .line 43
    const/high16 v0, 0x41100000    # 9.0f

    invoke-virtual {p0, v0}, Lo/ehn;->d(F)V

    .line 45
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lo/ehn;->a(F)V

    .line 46
    new-instance v0, Landroid/graphics/DashPathEffect;

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-virtual {p0, v0}, Lo/ehn;->b(Landroid/graphics/DashPathEffect;)V

    .line 47
    const/high16 v0, 0x41700000    # 15.0f

    invoke-virtual {p0, v0}, Lo/ehn;->b(F)V

    .line 48
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ehn;->e(Z)V

    .line 49
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/ehn;->e(Lo/eit$b;)V

    .line 50
    const v0, -0x777778

    invoke-virtual {p0, v0}, Lo/ehn;->d(I)V

    .line 52
    sget-object v0, Lo/lm$c;->a:Lo/lm$c;

    invoke-virtual {p0, v0}, Lo/ehn;->c(Lo/lm$c;)V

    .line 53
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ehn;->c(Z)V

    .line 54
    return-void

    nop

    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x40a00000    # 5.0f
    .end array-data
.end method

.method private d(FLcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;)Z
    .locals 3

    .line 262
    invoke-virtual {p2}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lo/ehn;->k(I)I

    move-result v1

    .line 263
    invoke-virtual {p2}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lo/ehn;->h(I)I

    move-result v2

    .line 264
    int-to-float v0, v1

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    int-to-float v0, v2

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    .line 265
    const/4 v0, 0x1

    return v0

    .line 267
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public J()I
    .locals 3

    .line 163
    iget-object v2, p0, Lo/ehn;->q:Lo/eks;

    .line 165
    iget-boolean v0, v2, Lo/eks;->b:Z

    if-eqz v0, :cond_0

    .line 166
    iget v1, v2, Lo/eks;->c:I

    goto :goto_0

    .line 168
    :cond_0
    iget v1, v2, Lo/eks;->h:I

    .line 171
    :goto_0
    return v1
.end method

.method protected M()V
    .locals 0

    .line 270
    return-void
.end method

.method public N()I
    .locals 1

    .line 157
    const/4 v0, 0x0

    return v0
.end method

.method public a()I
    .locals 2

    .line 134
    iget-object v0, p0, Lo/ehn;->q:Lo/eks;

    .line 135
    iget v1, v0, Lo/eks;->c:I

    .line 136
    return v1
.end method

.method public b()I
    .locals 1

    .line 107
    iget v0, p0, Lo/ehn;->v:I

    return v0
.end method

.method public b(Lo/eie;)Lo/ejq;
    .locals 1

    .line 272
    const/4 v0, 0x0

    return-object v0
.end method

.method public c()F
    .locals 1

    .line 92
    iget v0, p0, Lo/ehn;->u:F

    return v0
.end method

.method public c(I)V
    .locals 1

    .line 176
    iget-object v0, p0, Lo/ehn;->q:Lo/eks;

    iput p1, v0, Lo/eks;->c:I

    .line 177
    invoke-super {p0, p1}, Lo/ehs;->c(I)V

    .line 178
    return-void
.end method

.method public d(IZ)V
    .locals 0

    .line 113
    iput-boolean p2, p0, Lo/ehn;->w:Z

    .line 114
    iput p1, p0, Lo/ehn;->v:I

    .line 115
    return-void
.end method

.method public d()Z
    .locals 1

    .line 85
    iget-boolean v0, p0, Lo/ehn;->t:Z

    return v0
.end method

.method public e(F)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)Ljava/util/List<Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;>;"
        }
    .end annotation

    .line 192
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 194
    iget-object v0, p0, Lo/ehn;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 195
    return-object v3

    .line 198
    :cond_0
    const/4 v4, 0x0

    .line 199
    iget-object v0, p0, Lo/ehn;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    .line 201
    :goto_0
    if-gt v4, v5, :cond_4

    .line 202
    add-int v0, v5, v4

    div-int/lit8 v6, v0, 0x2

    .line 203
    iget-object v0, p0, Lo/ehn;->l:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 206
    invoke-virtual {v7}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getX()F

    move-result v0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_2

    .line 207
    :goto_1
    if-lez v6, :cond_1

    iget-object v0, p0, Lo/ehn;->l:Ljava/util/List;

    add-int/lit8 v1, v6, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getX()F

    move-result v0

    cmpl-float v0, v0, p1

    if-nez v0, :cond_1

    .line 208
    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    .line 210
    :cond_1
    iget-object v0, p0, Lo/ehn;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    .line 213
    :goto_2
    if-ge v6, v5, :cond_4

    .line 214
    iget-object v0, p0, Lo/ehn;->l:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 215
    invoke-virtual {v7}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getX()F

    move-result v0

    cmpl-float v0, v0, p1

    if-nez v0, :cond_4

    .line 216
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 213
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 224
    :cond_2
    invoke-virtual {v7}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getX()F

    move-result v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_3

    .line 225
    add-int/lit8 v4, v6, 0x1

    goto :goto_3

    .line 227
    :cond_3
    add-int/lit8 v5, v6, -0x1

    .line 229
    :goto_3
    goto/16 :goto_0

    .line 231
    :cond_4
    if-le v4, v5, :cond_7

    .line 234
    if-ltz v4, :cond_5

    iget-object v0, p0, Lo/ehn;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gt v4, v0, :cond_5

    if-ltz v5, :cond_5

    iget-object v0, p0, Lo/ehn;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le v5, v0, :cond_6

    .line 235
    :cond_5
    iget-object v0, p0, Lo/ehn;->l:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 236
    iget-object v0, p0, Lo/ehn;->l:Ljava/util/List;

    iget-object v1, p0, Lo/ehn;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 238
    :cond_6
    iget-object v0, p0, Lo/ehn;->l:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 239
    iget-object v0, p0, Lo/ehn;->l:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 240
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 241
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 246
    :cond_7
    :goto_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_8

    .line 247
    return-object v3

    .line 250
    :cond_8
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 252
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 253
    invoke-direct {p0, p1, v8}, Lo/ehn;->d(FLcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 254
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 256
    :cond_9
    goto :goto_5

    .line 258
    :cond_a
    return-object v6
.end method

.method public e()Lo/eit$b;
    .locals 1

    .line 125
    iget-object v0, p0, Lo/ehn;->z:Lo/eit$b;

    return-object v0
.end method

.method public e(Lo/eit$b;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lo/ehn;->z:Lo/eit$b;

    .line 130
    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 2

    .line 141
    iget-object v1, p0, Lo/ehn;->q:Lo/eks;

    .line 142
    iget-object v0, v1, Lo/eks;->a:Ljava/lang/String;

    return-object v0
.end method

.method public g(I)V
    .locals 1

    .line 181
    iget-object v0, p0, Lo/ehn;->q:Lo/eks;

    iput p1, v0, Lo/eks;->d:I

    .line 182
    return-void
.end method

.method public h()I
    .locals 1

    .line 146
    iget-object v0, p0, Lo/ehn;->q:Lo/eks;

    iget v0, v0, Lo/eks;->d:I

    return v0
.end method
