.class public Lo/fbx;
.super Lo/ekw;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fbx$e;,
        Lo/fbx$c;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private ab:Lo/fbx$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 68
    invoke-direct {p0, p1, p2}, Lo/ekw;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fbx;->a:Landroid/content/Context;

    .line 32
    new-instance v0, Lo/fbx$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/fbx$c;-><init>(Lo/fbx$2;)V

    iput-object v0, p0, Lo/fbx;->ab:Lo/fbx$c;

    .line 69
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 64
    invoke-direct {p0, p1, p2, p3}, Lo/ekw;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fbx;->a:Landroid/content/Context;

    .line 32
    new-instance v0, Lo/fbx$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/fbx$c;-><init>(Lo/fbx$2;)V

    iput-object v0, p0, Lo/fbx;->ab:Lo/fbx$c;

    .line 65
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/eic;)V
    .locals 6

    .line 56
    invoke-direct {p0, p1}, Lo/ekw;-><init>(Landroid/content/Context;)V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fbx;->a:Landroid/content/Context;

    .line 32
    new-instance v0, Lo/fbx$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/fbx$c;-><init>(Lo/fbx$2;)V

    iput-object v0, p0, Lo/fbx;->ab:Lo/fbx$c;

    .line 57
    const-string v0, "PressureLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "construct chart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    new-instance v0, Lo/evu;

    iget-object v2, p0, Lo/fbx;->P:Lo/la;

    iget-object v3, p0, Lo/fbx;->O:Lo/oa;

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lo/evu;-><init>(Lo/ejh;Lo/la;Lo/oa;Landroid/content/Context;Lo/eic;)V

    iput-object v0, p0, Lo/fbx;->S:Lo/nj;

    .line 59
    iput-object p1, p0, Lo/fbx;->a:Landroid/content/Context;

    .line 60
    invoke-direct {p0}, Lo/fbx;->D()V

    .line 61
    return-void
.end method

.method private D()V
    .locals 7

    .line 72
    iget-object v0, p0, Lo/fbx;->N:Lo/lm;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lm;->d(Z)V

    .line 73
    invoke-virtual {p0}, Lo/fbx;->getDescription()Lo/ll;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ll;->d(Z)V

    .line 75
    invoke-virtual {p0}, Lo/fbx;->getXAxis()Lo/ln;

    move-result-object v6

    .line 76
    new-instance v0, Lo/fbx$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/fbx$e;-><init>(Lo/fbx$2;)V

    invoke-virtual {v6, v0}, Lo/ln;->b(Lo/mf;)V

    .line 78
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/ln;->b(F)V

    .line 79
    const/high16 v0, 0x44b40000    # 1440.0f

    invoke-virtual {v6, v0}, Lo/ln;->a(F)V

    .line 83
    new-instance v0, Lo/ewb;

    iget-object v1, p0, Lo/fbx;->a:Landroid/content/Context;

    iget-object v2, p0, Lo/fbx;->O:Lo/oa;

    iget-object v3, p0, Lo/fbx;->ad:Lo/eit;

    iget-object v4, p0, Lo/fbx;->aj:Lo/eim;

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lo/ewb;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    iput-object v0, p0, Lo/fbx;->ae:Lo/eir;

    .line 85
    new-instance v0, Lo/ewb;

    iget-object v1, p0, Lo/fbx;->a:Landroid/content/Context;

    iget-object v2, p0, Lo/fbx;->O:Lo/oa;

    iget-object v3, p0, Lo/fbx;->af:Lo/eit;

    iget-object v4, p0, Lo/fbx;->al:Lo/eim;

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lo/ewb;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    iput-object v0, p0, Lo/fbx;->am:Lo/eir;

    .line 87
    new-instance v0, Lo/ewb;

    iget-object v1, p0, Lo/fbx;->a:Landroid/content/Context;

    iget-object v2, p0, Lo/fbx;->O:Lo/oa;

    iget-object v3, p0, Lo/fbx;->ah:Lo/eit;

    iget-object v4, p0, Lo/fbx;->ak:Lo/eim;

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lo/ewb;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    iput-object v0, p0, Lo/fbx;->ai:Lo/eir;

    .line 90
    const/high16 v0, 0x40a00000    # 5.0f

    invoke-virtual {p0, v0}, Lo/fbx;->setExtraTopOffset(F)V

    .line 91
    const/high16 v0, 0x40e00000    # 7.0f

    invoke-virtual {p0, v0}, Lo/fbx;->setExtraBottomOffset(F)V

    .line 94
    const/16 v0, 0xff

    const/16 v1, 0xf2

    const/16 v2, 0xf2

    const/16 v3, 0xf2

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/fbx;->setBackgroundColor(I)V

    .line 97
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/fbx;->d(Z)V

    .line 99
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/fbx;->e(Z)V

    .line 100
    return-void
.end method

.method private H()Z
    .locals 5

    .line 121
    iget-object v0, p0, Lo/fbx;->A:Lo/ma;

    check-cast v0, Lo/ela;

    invoke-virtual {v0}, Lo/ela;->h()Ljava/util/List;

    move-result-object v4

    .line 122
    const-string v0, "PressureLineChart"

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

    .line 123
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 124
    const/4 v0, 0x1

    return v0

    .line 126
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method protected I()F
    .locals 4

    .line 158
    iget-object v0, p0, Lo/fbx;->ad:Lo/eit;

    iget-object v0, v0, Lo/eit;->a:[F

    const/4 v1, 0x1

    aget v0, v0, v1

    iget-object v1, p0, Lo/fbx;->ad:Lo/eit;

    iget-object v1, v1, Lo/eit;->a:[F

    const/4 v2, 0x2

    aget v1, v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, v0, v1

    .line 159
    return v3
.end method

.method public c()V
    .locals 4

    .line 115
    const-string v0, "PressureLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh chart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    invoke-super {p0}, Lo/ekw;->c()V

    .line 117
    return-void
.end method

.method public d(Lo/eih$k;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eih<Lo/ela;>.k;)V"
        }
    .end annotation

    .line 168
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fbx;->ab:Lo/fbx$c;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/fbx$c;->c(Lo/eih$k;)V

    .line 171
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fbx;->ao:Lo/eie$a;

    sget-object v1, Lo/fbx;->an:Lo/eie$a;

    if-ne v0, v1, :cond_0

    .line 172
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 173
    return-void

    .line 177
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lo/fbx;->getData()Lo/ma;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eik;

    .line 178
    invoke-virtual {v4}, Lo/eik;->h()Ljava/util/List;

    move-result-object v5

    .line 180
    const/4 v6, 0x0

    .line 182
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

    .line 183
    instance-of v0, v8, Lo/evs;

    if-eqz v0, :cond_1

    .line 184
    move-object v6, v8

    check-cast v6, Lo/evs;

    .line 185
    goto :goto_1

    .line 187
    :cond_1
    goto :goto_0

    .line 189
    :cond_2
    :goto_1
    if-nez v6, :cond_3

    .line 191
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 192
    return-void

    .line 195
    :cond_3
    iget-object v0, v6, Lo/evs;->x:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 197
    return-void

    .line 200
    :cond_4
    const/4 v0, 0x2

    new-array v7, v0, [F

    invoke-virtual/range {p0 .. p0}, Lo/fbx;->N()F

    move-result v0

    const/4 v1, 0x0

    aput v0, v7, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v7, v1

    .line 201
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/fbx;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/eim;->d([F)V

    .line 203
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fbx;->ao:Lo/eie$a;

    sget-object v1, Lo/fbx;->an:Lo/eie$a;

    if-ne v0, v1, :cond_5

    .line 205
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 206
    return-void

    .line 208
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fbx;->ao:Lo/eie$a;

    const/4 v1, 0x0

    aget v1, v7, v1

    invoke-virtual {v0, v1}, Lo/eie$a;->d(F)V

    .line 210
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 211
    new-instance v0, Lo/mh;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fbx;->ao:Lo/eie$a;

    invoke-virtual {v1}, Lo/eie$a;->a()F

    move-result v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, v3}, Lo/mh;-><init>(FII)V

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 213
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fbx;->A:Lo/ma;

    check-cast v0, Lo/ela;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fbx;->Q:[Lo/mh;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v1}, Lo/mh;->b()F

    move-result v1

    move-object/from16 v2, p0

    invoke-virtual {v0, v1, v2}, Lo/ela;->c(FLo/eie;)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v9

    .line 216
    if-nez v9, :cond_6

    .line 217
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "adsorb2SelectedDataByDataArea:entryForXValue must not be null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :cond_6
    move-object v0, v9

    check-cast v0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->getEntries()Ljava/util/List;

    move-result-object v10

    .line 222
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_7

    .line 223
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 224
    return-void

    .line 226
    :cond_7
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/mh;

    .line 229
    const/4 v0, 0x2

    new-array v12, v0, [F

    invoke-virtual {v11}, Lo/mh;->b()F

    move-result v0

    const/4 v1, 0x0

    aput v0, v12, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v12, v1

    .line 230
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fbx;->aj:Lo/eim;

    invoke-virtual {v0, v12}, Lo/eim;->e([F)V

    .line 232
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fbx;->O:Lo/oa;

    const/4 v1, 0x0

    aget v1, v12, v1

    invoke-virtual {v0, v1}, Lo/oa;->c(F)Z

    move-result v0

    if-nez v0, :cond_8

    .line 233
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 235
    return-void

    .line 238
    :cond_8
    const/4 v13, 0x0

    .line 240
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

    .line 241
    iget-object v0, v15, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    if-ne v0, v6, :cond_9

    .line 242
    move-object v13, v15

    .line 243
    goto :goto_3

    .line 245
    :cond_9
    goto :goto_2

    .line 247
    :cond_a
    :goto_3
    if-nez v13, :cond_b

    .line 249
    invoke-virtual/range {p1 .. p1}, Lo/eih$k;->e()V

    .line 250
    return-void

    .line 253
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fbx;->ao:Lo/eie$a;

    invoke-virtual {v0}, Lo/eie$a;->a()F

    move-result v0

    float-to-int v14, v0

    .line 255
    move-object/from16 v0, p0

    iget v0, v0, Lo/fbx;->aA:F

    float-to-int v0, v0

    add-int/lit8 v0, v0, -0xa

    if-lt v14, v0, :cond_c

    .line 257
    add-int/lit8 v14, v14, -0xa

    .line 260
    :cond_c
    int-to-float v0, v14

    move-object/from16 v1, p0

    iget v1, v1, Lo/fbx;->aw:F

    const/high16 v2, 0x41200000    # 10.0f

    add-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_d

    .line 262
    add-int/lit8 v14, v14, 0xa

    .line 265
    :cond_d
    invoke-virtual {v6, v14}, Lo/evs;->p(I)I

    move-result v15

    .line 268
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v15, v1}, Lo/fbx;->d(ILo/eih$k;)V

    .line 269
    return-void
.end method

.method protected e()V
    .locals 3

    .line 135
    invoke-direct {p0}, Lo/fbx;->H()Z

    move-result v2

    .line 137
    if-nez v2, :cond_0

    .line 138
    invoke-super {p0}, Lo/ekw;->e()V

    .line 139
    return-void

    .line 142
    :cond_0
    iget-object v0, p0, Lo/fbx;->ad:Lo/eit;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eit;->d(Z)V

    .line 143
    iget-object v0, p0, Lo/fbx;->af:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->d(Z)V

    .line 144
    iget-object v0, p0, Lo/fbx;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->d(Z)V

    .line 147
    iget-object v0, p0, Lo/fbx;->ad:Lo/eit;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 148
    iget-object v0, p0, Lo/fbx;->af:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 149
    iget-object v0, p0, Lo/fbx;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 150
    return-void
.end method
