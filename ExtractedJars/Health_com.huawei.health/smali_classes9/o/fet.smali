.class public Lo/fet;
.super Lo/ekw;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fet$d;,
        Lo/fet$e;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private aB:I

.field private ab:Lo/fet$e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 40
    invoke-direct {p0, p1}, Lo/ekw;-><init>(Landroid/content/Context;)V

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fet;->a:Landroid/content/Context;

    .line 37
    new-instance v0, Lo/fet$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/fet$e;-><init>(Lo/fet$1;)V

    iput-object v0, p0, Lo/fet;->ab:Lo/fet$e;

    .line 38
    const/16 v0, 0xff

    const/4 v1, 0x0

    const/16 v2, 0x7d

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/fet;->aB:I

    .line 41
    const-string v0, "WeightLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "construct chart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    new-instance v0, Lo/fdp;

    iget-object v1, p0, Lo/fet;->P:Lo/la;

    iget-object v2, p0, Lo/fet;->O:Lo/oa;

    invoke-direct {v0, p0, v1, v2, p1}, Lo/fdp;-><init>(Lo/ejh;Lo/la;Lo/oa;Landroid/content/Context;)V

    iput-object v0, p0, Lo/fet;->S:Lo/nj;

    .line 43
    iput-object p1, p0, Lo/fet;->a:Landroid/content/Context;

    .line 44
    invoke-direct {p0}, Lo/fet;->ao()V

    .line 45
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 71
    invoke-direct {p0, p1, p2}, Lo/ekw;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fet;->a:Landroid/content/Context;

    .line 37
    new-instance v0, Lo/fet$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/fet$e;-><init>(Lo/fet$1;)V

    iput-object v0, p0, Lo/fet;->ab:Lo/fet$e;

    .line 38
    const/16 v0, 0xff

    const/4 v1, 0x0

    const/16 v2, 0x7d

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/fet;->aB:I

    .line 72
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 67
    invoke-direct {p0, p1, p2, p3}, Lo/ekw;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fet;->a:Landroid/content/Context;

    .line 37
    new-instance v0, Lo/fet$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/fet$e;-><init>(Lo/fet$1;)V

    iput-object v0, p0, Lo/fet;->ab:Lo/fet$e;

    .line 38
    const/16 v0, 0xff

    const/4 v1, 0x0

    const/16 v2, 0x7d

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lo/fet;->aB:I

    .line 68
    return-void
.end method

.method private ao()V
    .locals 7

    .line 77
    new-instance v0, Lo/fdq;

    iget-object v1, p0, Lo/fet;->a:Landroid/content/Context;

    iget-object v2, p0, Lo/fet;->O:Lo/oa;

    iget-object v3, p0, Lo/fet;->ad:Lo/eit;

    iget-object v4, p0, Lo/fet;->aj:Lo/eim;

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lo/fdq;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    iput-object v0, p0, Lo/fet;->ae:Lo/eir;

    .line 79
    new-instance v0, Lo/fdq;

    iget-object v1, p0, Lo/fet;->a:Landroid/content/Context;

    iget-object v2, p0, Lo/fet;->O:Lo/oa;

    iget-object v3, p0, Lo/fet;->af:Lo/eit;

    iget-object v4, p0, Lo/fet;->al:Lo/eim;

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lo/fdq;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    iput-object v0, p0, Lo/fet;->am:Lo/eir;

    .line 81
    new-instance v0, Lo/fdq;

    iget-object v1, p0, Lo/fet;->a:Landroid/content/Context;

    iget-object v2, p0, Lo/fet;->O:Lo/oa;

    iget-object v3, p0, Lo/fet;->ah:Lo/eit;

    iget-object v4, p0, Lo/fet;->ak:Lo/eim;

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lo/fdq;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    iput-object v0, p0, Lo/fet;->ai:Lo/eir;

    .line 82
    iget-object v0, p0, Lo/fet;->N:Lo/lm;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lm;->d(Z)V

    .line 83
    invoke-virtual {p0}, Lo/fet;->getDescription()Lo/ll;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ll;->d(Z)V

    .line 85
    invoke-virtual {p0}, Lo/fet;->getXAxis()Lo/ln;

    move-result-object v6

    .line 86
    new-instance v0, Lo/fet$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/fet$d;-><init>(Lo/fet$1;)V

    invoke-virtual {v6, v0}, Lo/ln;->b(Lo/mf;)V

    .line 88
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/ln;->b(F)V

    .line 89
    const/high16 v0, 0x44b40000    # 1440.0f

    invoke-virtual {v6, v0}, Lo/ln;->a(F)V

    .line 91
    const/high16 v0, 0x40a00000    # 5.0f

    invoke-virtual {p0, v0}, Lo/fet;->setExtraTopOffset(F)V

    .line 92
    const/high16 v0, 0x40e00000    # 7.0f

    invoke-virtual {p0, v0}, Lo/fet;->setExtraBottomOffset(F)V

    .line 97
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/fet;->d(Z)V

    .line 99
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/fet;->e(Z)V

    .line 100
    return-void
.end method

.method private ar()Z
    .locals 5

    .line 132
    iget-object v0, p0, Lo/fet;->A:Lo/ma;

    check-cast v0, Lo/ela;

    invoke-virtual {v0}, Lo/ela;->h()Ljava/util/List;

    move-result-object v4

    .line 133
    const-string v0, "WeightLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fillOriginalData mLineData size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 135
    const/4 v0, 0x1

    return v0

    .line 137
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public D()V
    .locals 1

    .line 110
    iget-object v0, p0, Lo/fet;->ae:Lo/eir;

    invoke-virtual {v0}, Lo/eir;->c()V

    .line 111
    invoke-virtual {p0}, Lo/fet;->c()V

    .line 112
    return-void
.end method

.method public H()V
    .locals 1

    .line 163
    iget-object v0, p0, Lo/fet;->A:Lo/ma;

    check-cast v0, Lo/ela;

    invoke-virtual {v0}, Lo/ela;->k()V

    .line 164
    return-void
.end method

.method public c()V
    .locals 4

    .line 126
    const-string v0, "WeightLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh chart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    invoke-super {p0}, Lo/ekw;->c()V

    .line 128
    return-void
.end method

.method public d(Lo/eih$k;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eih<Lo/ela;>.k;)V"
        }
    .end annotation

    .line 171
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fet;->ab:Lo/fet$e;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/fet$e;->d(Lo/eih$k;)V

    .line 174
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fet;->ao:Lo/eie$a;

    sget-object v1, Lo/fet;->an:Lo/eie$a;

    if-ne v0, v1, :cond_0

    .line 175
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 176
    return-void

    .line 180
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lo/fet;->getData()Lo/ma;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eik;

    .line 181
    invoke-virtual {v4}, Lo/eik;->h()Ljava/util/List;

    move-result-object v5

    .line 183
    const/4 v6, 0x0

    .line 185
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/eii;

    .line 186
    instance-of v0, v8, Lo/fdo;

    if-eqz v0, :cond_1

    .line 187
    move-object v6, v8

    check-cast v6, Lo/fdo;

    .line 188
    goto :goto_1

    .line 190
    :cond_1
    goto :goto_0

    .line 192
    :cond_2
    :goto_1
    if-nez v6, :cond_3

    .line 194
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 195
    return-void

    .line 198
    :cond_3
    iget-object v0, v6, Lo/fdo;->z:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 200
    return-void

    .line 203
    :cond_4
    const/4 v0, 0x2

    new-array v7, v0, [F

    invoke-virtual/range {p0 .. p0}, Lo/fet;->N()F

    move-result v0

    const/4 v1, 0x0

    aput v0, v7, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v7, v1

    .line 204
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/fet;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/eim;->d([F)V

    .line 206
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fet;->ao:Lo/eie$a;

    sget-object v1, Lo/fet;->an:Lo/eie$a;

    if-ne v0, v1, :cond_5

    .line 208
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 209
    return-void

    .line 211
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fet;->ao:Lo/eie$a;

    const/4 v1, 0x0

    aget v1, v7, v1

    invoke-virtual {v0, v1}, Lo/eie$a;->d(F)V

    .line 213
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 214
    new-instance v0, Lo/mh;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fet;->ao:Lo/eie$a;

    invoke-virtual {v1}, Lo/eie$a;->a()F

    move-result v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, v3}, Lo/mh;-><init>(FII)V

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fet;->A:Lo/ma;

    check-cast v0, Lo/ela;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fet;->Q:[Lo/mh;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v1}, Lo/mh;->b()F

    move-result v1

    move-object/from16 v2, p0

    invoke-virtual {v0, v1, v2}, Lo/ela;->c(FLo/eie;)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v9

    .line 219
    if-nez v9, :cond_6

    .line 220
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "adsorb2SelectedDataByDataArea:entryForXValue must not be null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 223
    :cond_6
    move-object v0, v9

    check-cast v0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->getEntries()Ljava/util/List;

    move-result-object v10

    .line 225
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_7

    .line 226
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 227
    return-void

    .line 229
    :cond_7
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/mh;

    .line 232
    const/4 v0, 0x2

    new-array v12, v0, [F

    invoke-virtual {v11}, Lo/mh;->b()F

    move-result v0

    const/4 v1, 0x0

    aput v0, v12, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v12, v1

    .line 233
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fet;->aj:Lo/eim;

    invoke-virtual {v0, v12}, Lo/eim;->e([F)V

    .line 235
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fet;->O:Lo/oa;

    const/4 v1, 0x0

    aget v1, v12, v1

    invoke-virtual {v0, v1}, Lo/oa;->c(F)Z

    move-result v0

    if-nez v0, :cond_8

    .line 236
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 238
    return-void

    .line 241
    :cond_8
    const/4 v13, 0x0

    .line 243
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;

    .line 244
    iget-object v0, v15, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    if-ne v0, v6, :cond_9

    .line 245
    move-object v13, v15

    .line 246
    goto :goto_3

    .line 248
    :cond_9
    goto :goto_2

    .line 250
    :cond_a
    :goto_3
    if-nez v13, :cond_b

    .line 252
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 253
    return-void

    .line 256
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fet;->ao:Lo/eie$a;

    invoke-virtual {v0}, Lo/eie$a;->a()F

    move-result v0

    float-to-int v14, v0

    .line 258
    move-object/from16 v0, p0

    iget v0, v0, Lo/fet;->aA:F

    float-to-int v0, v0

    add-int/lit8 v0, v0, -0xa

    if-lt v14, v0, :cond_c

    .line 260
    add-int/lit8 v14, v14, -0xa

    .line 263
    :cond_c
    int-to-float v0, v14

    move-object/from16 v1, p0

    iget v1, v1, Lo/fet;->aw:F

    const/high16 v2, 0x41200000    # 10.0f

    add-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_d

    .line 265
    add-int/lit8 v14, v14, 0xa

    .line 268
    :cond_d
    invoke-virtual {v6, v14}, Lo/fdo;->p(I)I

    move-result v15

    .line 271
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v15, v1}, Lo/fet;->d(ILo/eih$k;)V

    .line 272
    return-void
.end method

.method protected e()V
    .locals 3

    .line 146
    invoke-direct {p0}, Lo/fet;->ar()Z

    move-result v2

    .line 148
    if-nez v2, :cond_0

    .line 149
    invoke-super {p0}, Lo/ekw;->e()V

    .line 150
    return-void

    .line 153
    :cond_0
    iget-object v0, p0, Lo/fet;->ad:Lo/eit;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eit;->d(Z)V

    .line 154
    iget-object v0, p0, Lo/fet;->af:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->d(Z)V

    .line 155
    iget-object v0, p0, Lo/fet;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->d(Z)V

    .line 157
    iget-object v0, p0, Lo/fet;->ad:Lo/eit;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 158
    iget-object v0, p0, Lo/fet;->af:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 159
    iget-object v0, p0, Lo/fet;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 160
    return-void
.end method

.method public i(I)V
    .locals 2

    .line 103
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    int-to-double v0, p1

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-int p1, v0

    .line 106
    :cond_0
    iget-object v0, p0, Lo/fet;->ae:Lo/eir;

    iget v1, p0, Lo/fet;->aB:I

    invoke-virtual {v0, p1, v1}, Lo/eir;->a(II)V

    .line 107
    invoke-virtual {p0}, Lo/fet;->c()V

    .line 108
    return-void
.end method
