.class public Lo/elv;
.super Lo/nm;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/elv$b;
    }
.end annotation


# instance fields
.field private s:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Lo/mz;Lo/elv$b;>;"
        }
    .end annotation
.end field

.field private t:[F


# direct methods
.method public constructor <init>(Lo/mu;Lo/la;Lo/oa;)V
    .locals 1

    .line 35
    invoke-direct {p0, p1, p2, p3}, Lo/nm;-><init>(Lo/mu;Lo/la;Lo/oa;)V

    .line 31
    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lo/elv;->t:[F

    .line 32
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/elv;->s:Ljava/util/HashMap;

    .line 36
    return-void
.end method

.method static synthetic a(Lo/elv;)Landroid/graphics/Paint;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/elv;->b:Landroid/graphics/Paint;

    return-object v0
.end method

.method static synthetic b(Lo/elv;)Landroid/graphics/Paint;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/elv;->h:Landroid/graphics/Paint;

    return-object v0
.end method

.method static synthetic d(Lo/elv;)Landroid/graphics/Paint;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/elv;->h:Landroid/graphics/Paint;

    return-object v0
.end method

.method static synthetic e(Lo/elv;)Landroid/graphics/Paint;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/elv;->h:Landroid/graphics/Paint;

    return-object v0
.end method


# virtual methods
.method protected b(Landroid/graphics/Canvas;)V
    .locals 23

    .line 111
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 112
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->i:Lo/la;

    invoke-virtual {v0}, Lo/la;->d()F

    move-result v5

    .line 113
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->t:[F

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 114
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->t:[F

    const/4 v1, 0x0

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 115
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->c:Lo/mu;

    invoke-interface {v0}, Lo/mu;->getLineData()Lo/lx;

    move-result-object v0

    invoke-virtual {v0}, Lo/lx;->h()Ljava/util/List;

    move-result-object v6

    .line 117
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_a

    .line 118
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/na;

    .line 119
    invoke-interface {v8}, Lo/na;->j()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v8}, Lo/na;->M()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v8}, Lo/na;->C()I

    move-result v0

    if-eqz v0, :cond_9

    .line 120
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->b:Landroid/graphics/Paint;

    invoke-interface {v8}, Lo/na;->K()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 121
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->c:Lo/mu;

    invoke-interface {v8}, Lo/na;->D()Lo/lp$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/mu;->b(Lo/lp$b;)Lo/nv;

    move-result-object v9

    .line 122
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->f:Lo/nk$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/elv;->c:Lo/mu;

    invoke-virtual {v0, v1, v8}, Lo/nk$d;->b(Lo/mn;Lo/mv;)V

    .line 123
    invoke-interface {v8}, Lo/na;->e()F

    move-result v10

    .line 124
    invoke-interface {v8}, Lo/na;->b()F

    move-result v11

    .line 125
    invoke-interface {v8}, Lo/na;->P()Z

    move-result v0

    if-eqz v0, :cond_0

    cmpg-float v0, v11, v10

    if-gez v0, :cond_0

    const/4 v0, 0x0

    cmpl-float v0, v11, v0

    if-lez v0, :cond_0

    const/4 v12, 0x1

    goto :goto_1

    :cond_0
    const/4 v12, 0x0

    .line 126
    :goto_1
    if-eqz v12, :cond_1

    invoke-interface {v8}, Lo/na;->K()I

    move-result v0

    const v1, 0x112233

    if-ne v0, v1, :cond_1

    const/4 v13, 0x1

    goto :goto_2

    :cond_1
    const/4 v13, 0x0

    .line 128
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->s:Ljava/util/HashMap;

    invoke-virtual {v0, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 129
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->s:Ljava/util/HashMap;

    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/elv$b;

    goto :goto_3

    .line 131
    :cond_2
    new-instance v14, Lo/elv$b;

    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-direct {v14, v0, v1}, Lo/elv$b;-><init>(Lo/elv;Lo/elv$4;)V

    .line 132
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->s:Ljava/util/HashMap;

    invoke-virtual {v0, v8, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    :goto_3
    invoke-virtual {v14, v8}, Lo/elv$b;->a(Lo/na;)Z

    move-result v15

    .line 136
    if-eqz v15, :cond_3

    .line 137
    invoke-virtual {v14, v8, v12, v13}, Lo/elv$b;->b(Lo/na;ZZ)V

    .line 140
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->a:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/elv;->f:Lo/nk$d;

    iget v1, v1, Lo/nk$d;->c:I

    add-int v16, v0, v1

    .line 142
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->f:Lo/nk$d;

    iget v1, v0, Lo/nk$d;->c:I

    move/from16 v17, v1

    :goto_4
    move/from16 v0, v17

    move/from16 v1, v16

    if-gt v0, v1, :cond_9

    .line 143
    move/from16 v0, v17

    invoke-interface {v8, v0}, Lo/na;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v18

    .line 144
    if-nez v18, :cond_4

    .line 145
    goto/16 :goto_5

    .line 148
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->t:[F

    invoke-virtual/range {v18 .. v18}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 149
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->t:[F

    invoke-virtual/range {v18 .. v18}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    mul-float/2addr v1, v5

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 150
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->t:[F

    invoke-virtual {v9, v0}, Lo/nv;->e([F)V

    .line 152
    invoke-virtual/range {v18 .. v18}, Lcom/github/mikephil/charting/data/Entry;->getData()Ljava/lang/Object;

    move-result-object v19

    .line 153
    const-string v20, ""

    .line 154
    const/4 v0, 0x0

    move-object/from16 v1, v19

    if-eq v0, v1, :cond_5

    .line 155
    move-object/from16 v20, v19

    check-cast v20, Ljava/lang/String;

    .line 158
    :cond_5
    const-string v0, "LINE_PATH"

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 160
    new-instance v21, Landroid/graphics/Paint;

    invoke-direct/range {v21 .. v21}, Landroid/graphics/Paint;-><init>()V

    .line 161
    const-string v0, "#1A000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 162
    move-object/from16 v0, v21

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 163
    move-object/from16 v0, v21

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 164
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 165
    new-instance v22, Landroid/graphics/Path;

    invoke-direct/range {v22 .. v22}, Landroid/graphics/Path;-><init>()V

    .line 166
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->t:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/elv;->t:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 167
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->t:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/elv;->l:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 168
    move-object/from16 v0, p1

    move-object/from16 v1, v22

    move-object/from16 v2, v21

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 169
    invoke-virtual/range {v22 .. v22}, Landroid/graphics/Path;->reset()V

    .line 172
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->l:Lo/oa;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/elv;->t:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/oa;->k(F)Z

    move-result v0

    if-nez v0, :cond_7

    .line 173
    goto :goto_5

    .line 176
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->l:Lo/oa;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/elv;->t:[F

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/oa;->i(F)Z

    move-result v0

    if-eqz v0, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->l:Lo/oa;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/elv;->t:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/oa;->g(F)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 177
    move/from16 v0, v17

    invoke-virtual {v14, v0}, Lo/elv$b;->c(I)Landroid/graphics/Bitmap;

    move-result-object v21

    .line 178
    if-eqz v21, :cond_8

    .line 179
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->t:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    sub-float/2addr v0, v10

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/elv;->t:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    sub-float/2addr v1, v10

    const/4 v2, 0x0

    move-object/from16 v3, p1

    move-object/from16 v4, v21

    const/4 v2, 0x0

    invoke-virtual {v3, v4, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 142
    :cond_8
    add-int/lit8 v17, v17, 0x1

    goto/16 :goto_4

    .line 117
    :cond_9
    :goto_5
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 186
    :cond_a
    return-void
.end method

.method public e(Landroid/graphics/Canvas;)V
    .locals 25

    .line 41
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->c:Lo/mu;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/elv;->c(Lo/mr;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 42
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->c:Lo/mu;

    invoke-interface {v0}, Lo/mu;->getLineData()Lo/lx;

    move-result-object v0

    invoke-virtual {v0}, Lo/lx;->h()Ljava/util/List;

    move-result-object v11

    .line 44
    const/4 v12, 0x0

    :goto_0
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_b

    .line 45
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/na;

    .line 46
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lo/elv;->c(Lo/mz;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 48
    invoke-interface {v13}, Lo/na;->C()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 49
    goto/16 :goto_5

    .line 52
    :cond_0
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lo/elv;->e(Lo/mz;)V

    .line 53
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->c:Lo/mu;

    invoke-interface {v13}, Lo/na;->D()Lo/lp$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/mu;->b(Lo/lp$b;)Lo/nv;

    move-result-object v14

    .line 54
    invoke-interface {v13}, Lo/na;->e()F

    move-result v0

    const/high16 v1, 0x3fe00000    # 1.75f

    mul-float/2addr v0, v1

    float-to-int v15, v0

    .line 55
    invoke-interface {v13}, Lo/na;->M()Z

    move-result v0

    if-nez v0, :cond_1

    .line 56
    div-int/lit8 v15, v15, 0x2

    .line 59
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->f:Lo/nk$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/elv;->c:Lo/mu;

    invoke-virtual {v0, v1, v13}, Lo/nk$d;->b(Lo/mn;Lo/mv;)V

    .line 60
    move-object v0, v14

    move-object v1, v13

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/elv;->i:Lo/la;

    invoke-virtual {v2}, Lo/la;->b()F

    move-result v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/elv;->i:Lo/la;

    invoke-virtual {v3}, Lo/la;->d()F

    move-result v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/elv;->f:Lo/nk$d;

    iget v4, v4, Lo/nk$d;->c:I

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/elv;->f:Lo/nk$d;

    iget v5, v5, Lo/nk$d;->d:I

    invoke-virtual/range {v0 .. v5}, Lo/nv;->a(Lo/na;FFII)[F

    move-result-object v16

    .line 61
    invoke-interface {v13}, Lo/na;->z()Lo/nz;

    move-result-object v0

    invoke-static {v0}, Lo/nz;->b(Lo/nz;)Lo/nz;

    move-result-object v17

    .line 62
    move-object/from16 v0, v17

    iget v0, v0, Lo/nz;->e:F

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, v17

    iput v0, v1, Lo/nz;->e:F

    .line 63
    move-object/from16 v0, v17

    iget v0, v0, Lo/nz;->c:F

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    move-object/from16 v1, v17

    iput v0, v1, Lo/nz;->c:F

    .line 65
    const/16 v18, 0x0

    :goto_1
    move-object/from16 v0, v16

    array-length v0, v0

    move/from16 v1, v18

    if-ge v1, v0, :cond_9

    .line 66
    aget v19, v16, v18

    .line 67
    add-int/lit8 v0, v18, 0x1

    aget v20, v16, v0

    .line 68
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->l:Lo/oa;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Lo/oa;->k(F)Z

    move-result v0

    if-nez v0, :cond_2

    .line 69
    goto/16 :goto_4

    .line 72
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->l:Lo/oa;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Lo/oa;->i(F)Z

    move-result v0

    if-eqz v0, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/elv;->l:Lo/oa;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Lo/oa;->g(F)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 73
    div-int/lit8 v0, v18, 0x2

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/elv;->f:Lo/nk$d;

    iget v1, v1, Lo/nk$d;->c:I

    add-int/2addr v0, v1

    invoke-interface {v13, v0}, Lo/na;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v21

    .line 74
    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getData()Ljava/lang/Object;

    move-result-object v22

    .line 75
    const-string v23, ""

    .line 76
    const/4 v0, 0x0

    move-object/from16 v1, v22

    if-eq v0, v1, :cond_3

    .line 77
    move-object/from16 v23, v22

    check-cast v23, Ljava/lang/String;

    .line 79
    :cond_3
    invoke-interface {v13}, Lo/na;->v()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 80
    const-string v0, "LINE_PATH_BOLD_START"

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 81
    goto/16 :goto_3

    .line 82
    :cond_4
    const-string v0, "DASH_PATH_END"

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 83
    const/high16 v0, 0x41200000    # 10.0f

    invoke-interface {v13, v0}, Lo/na;->d(F)V

    .line 84
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lo/elv;->e(Lo/mz;)V

    .line 85
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-interface {v13}, Lo/na;->l()Lo/ml;

    move-result-object v2

    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v3

    move-object/from16 v4, v21

    move v5, v12

    move/from16 v6, v19

    const/high16 v7, 0x41700000    # 15.0f

    invoke-static {v7}, Lo/oc;->b(F)F

    move-result v7

    add-float v7, v7, v20

    const-string v8, "#FFFB6522"

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    invoke-virtual/range {v0 .. v8}, Lo/elv;->d(Landroid/graphics/Canvas;Lo/ml;FLcom/github/mikephil/charting/data/Entry;IFFI)V

    goto/16 :goto_2

    .line 86
    :cond_5
    const-string v0, "DASH_PATH"

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 87
    const/high16 v0, 0x41000000    # 8.0f

    invoke-interface {v13, v0}, Lo/na;->d(F)V

    .line 88
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lo/elv;->e(Lo/mz;)V

    .line 89
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-interface {v13}, Lo/na;->l()Lo/ml;

    move-result-object v2

    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v3

    move-object/from16 v4, v21

    move v5, v12

    move/from16 v6, v19

    const/high16 v7, 0x41500000    # 13.0f

    invoke-static {v7}, Lo/oc;->b(F)F

    move-result v7

    add-float v7, v7, v20

    div-int/lit8 v8, v18, 0x2

    invoke-interface {v13, v8}, Lo/na;->b(I)I

    move-result v8

    invoke-virtual/range {v0 .. v8}, Lo/elv;->d(Landroid/graphics/Canvas;Lo/ml;FLcom/github/mikephil/charting/data/Entry;IFFI)V

    goto :goto_2

    .line 91
    :cond_6
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-interface {v13}, Lo/na;->l()Lo/ml;

    move-result-object v2

    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v3

    move-object/from16 v4, v21

    move v5, v12

    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v6

    move-object/from16 v7, v16

    move/from16 v8, v18

    invoke-static {v7, v8, v6}, Lo/elu;->b([FIF)F

    move-result v6

    add-float v6, v6, v19

    const/high16 v7, 0x41000000    # 8.0f

    invoke-static {v7}, Lo/oc;->b(F)F

    move-result v7

    sub-float v7, v20, v7

    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v8

    move-object/from16 v9, v16

    move/from16 v10, v18

    invoke-static {v9, v10, v8}, Lo/elu;->a([FIF)F

    move-result v8

    add-float/2addr v7, v8

    div-int/lit8 v8, v18, 0x2

    invoke-interface {v13, v8}, Lo/na;->b(I)I

    move-result v8

    invoke-virtual/range {v0 .. v8}, Lo/elv;->d(Landroid/graphics/Canvas;Lo/ml;FLcom/github/mikephil/charting/data/Entry;IFFI)V

    .line 95
    :cond_7
    :goto_2
    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-interface {v13}, Lo/na;->x()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 96
    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v24

    .line 97
    move-object/from16 v0, p1

    move-object/from16 v1, v24

    move-object/from16 v2, v17

    iget v2, v2, Lo/nz;->e:F

    add-float v2, v2, v19

    float-to-int v2, v2

    move-object/from16 v3, v17

    iget v3, v3, Lo/nz;->c:F

    add-float v3, v3, v20

    float-to-int v3, v3

    invoke-virtual/range {v24 .. v24}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    invoke-virtual/range {v24 .. v24}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lo/oc;->d(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIII)V

    .line 65
    :cond_8
    :goto_3
    add-int/lit8 v18, v18, 0x2

    goto/16 :goto_1

    .line 102
    :cond_9
    :goto_4
    invoke-static/range {v17 .. v17}, Lo/nz;->c(Lo/nz;)V

    .line 44
    :cond_a
    :goto_5
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 107
    :cond_b
    return-void
.end method
