.class public Lo/eky;
.super Lo/eku;
.source "SourceFile"

# interfaces
.implements Lo/eiu;


# instance fields
.field protected q:[F

.field private r:Z

.field private s:Z

.field protected t:[F

.field private u:I

.field private v:Landroid/graphics/Path;

.field private w:Landroid/graphics/Path;

.field private y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eib;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/ejh;Lo/la;Lo/oa;Landroid/content/Context;)V
    .locals 1

    .line 55
    invoke-direct {p0, p1, p2, p3}, Lo/eku;-><init>(Lo/ejh;Lo/la;Lo/oa;)V

    .line 46
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eky;->r:Z

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lo/eky;->u:I

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eky;->s:Z

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eky;->y:Ljava/util/List;

    .line 52
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/eky;->w:Landroid/graphics/Path;

    .line 119
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/eky;->v:Landroid/graphics/Path;

    .line 280
    const/4 v0, 0x4

    new-array v0, v0, [F

    iput-object v0, p0, Lo/eky;->q:[F

    .line 283
    const/4 v0, 0x4

    new-array v0, v0, [F

    iput-object v0, p0, Lo/eky;->t:[F

    .line 57
    return-void
.end method

.method private a(Landroid/graphics/Canvas;ILjava/util/List;Lo/ekz;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/graphics/Canvas;ILjava/util/List<Landroid/graphics/PointF;>;Lo/ekz;)V"
        }
    .end annotation

    .line 806
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 807
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 813
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v3

    .line 816
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    instance-of v0, v0, Lo/ehv;

    if-eqz v0, :cond_0

    .line 817
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    invoke-interface {v0}, Lo/ejh;->getData()Lo/lt;

    move-result-object v0

    invoke-virtual {v0}, Lo/lt;->h()Ljava/util/List;

    move-result-object v4

    .line 818
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/ehn;

    if-eqz v0, :cond_0

    .line 819
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    check-cast v0, Lo/ehv;

    invoke-virtual {v0}, Lo/ehv;->getBarData()Lo/ehq;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 820
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    check-cast v0, Lo/ehv;

    invoke-virtual {v0}, Lo/ehv;->getBarData()Lo/ehq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ehq;->a()F

    move-result v5

    .line 821
    const/4 v0, 0x4

    new-array v6, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v6, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v6, v1

    const/4 v0, 0x2

    aput v5, v6, v0

    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v6, v1

    .line 822
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    invoke-interface {p4}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v7

    .line 823
    invoke-virtual {v7, v6}, Lo/nv;->e([F)V

    .line 824
    const/4 v0, 0x2

    aget v0, v6, v0

    const/4 v1, 0x0

    aget v1, v6, v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, v0, v1

    .line 829
    :cond_0
    iget v0, p0, Lo/eky;->u:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 831
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 832
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    new-array v4, v0, [F

    .line 833
    const/4 v5, 0x0

    .line 834
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/graphics/PointF;

    .line 835
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    iget v1, v7, Landroid/graphics/PointF;->x:F

    aput v1, v4, v0

    .line 836
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    iget v1, v7, Landroid/graphics/PointF;->y:F

    aput v1, v4, v0

    .line 837
    goto :goto_0

    .line 839
    :cond_1
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    invoke-interface {p4}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v6

    .line 840
    invoke-virtual {v6, v4}, Lo/nv;->e([F)V

    .line 841
    const/4 v7, 0x0

    :goto_1
    array-length v0, v4

    if-ge v7, v0, :cond_2

    .line 842
    aget v8, v4, v7

    .line 843
    add-int/lit8 v0, v7, 0x1

    aget v9, v4, v0

    .line 845
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 846
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 847
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 848
    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 850
    invoke-virtual {p1, v8, v9, v3, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 853
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 854
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v3, v0

    invoke-virtual {p1, v8, v9, v0, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 856
    add-int/lit8 v7, v7, 0x2

    .line 857
    goto :goto_1

    .line 861
    :cond_2
    return-void
.end method

.method private a()Z
    .locals 2

    .line 1155
    invoke-static {}, Lo/oc;->a()I

    move-result v0

    const/16 v1, 0x12

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private c(Lo/ekz;)I
    .locals 1

    .line 1216
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/eky;->c(Lo/ekz;Z)I

    move-result v0

    return v0
.end method

.method private c(Lo/ekz;Z)I
    .locals 4

    .line 1221
    if-eqz p2, :cond_0

    .line 1222
    invoke-interface {p1}, Lo/ekz;->m()I

    move-result v0

    return v0

    .line 1225
    :cond_0
    iget-boolean v0, p0, Lo/eky;->r:Z

    if-eqz v0, :cond_1

    .line 1226
    const/16 v0, 0x33

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0

    .line 1229
    :cond_1
    iget-boolean v0, p0, Lo/eky;->s:Z

    if-eqz v0, :cond_2

    .line 1230
    const/16 v0, 0x33

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0

    .line 1232
    :cond_2
    invoke-interface {p1}, Lo/ekz;->m()I

    move-result v0

    return v0
.end method

.method private c(FF)Z
    .locals 2

    .line 864
    sub-float v0, p1, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x33d6bf95    # 1.0E-7f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 865
    const/4 v0, 0x1

    return v0

    .line 867
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private d(Lo/ekz;ILandroid/graphics/Path;ILo/eid;)I
    .locals 19

    .line 948
    invoke-virtual/range {p5 .. p5}, Lo/eid;->a()Z

    move-result v4

    .line 949
    move-object/from16 v0, p1

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->ak()F

    move-result v5

    .line 951
    const/16 v6, 0x80

    .line 952
    move/from16 v0, p2

    add-int/lit16 v7, v0, 0x80

    .line 954
    move/from16 v0, p4

    if-le v7, v0, :cond_0

    move/from16 v0, p4

    goto :goto_0

    :cond_0
    move v0, v7

    :goto_0
    move v7, v0

    .line 958
    const/4 v0, 0x2

    new-array v8, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v8, v1

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->c:Lo/ejh;

    invoke-interface {v0}, Lo/ejh;->getContentRect()Landroid/graphics/RectF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->c:Lo/ejh;

    invoke-interface {v1}, Lo/ejh;->getXAxis()Lo/ln;

    move-result-object v1

    invoke-virtual {v1}, Lo/ln;->y()F

    move-result v1

    add-float/2addr v0, v1

    const/4 v1, 0x1

    aput v0, v8, v1

    .line 959
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->c:Lo/ejh;

    sget-object v1, Lo/eit$b;->e:Lo/eit$b;

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/eim;->d([F)V

    .line 961
    const/4 v0, 0x1

    aget v9, v8, v0

    .line 962
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->i:Lo/la;

    invoke-virtual {v0}, Lo/la;->d()F

    move-result v10

    .line 965
    move-object/from16 v11, p3

    .line 966
    invoke-virtual {v11}, Landroid/graphics/Path;->reset()V

    .line 968
    move-object/from16 v0, p1

    move/from16 v1, p2

    invoke-interface {v0, v1}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v12

    .line 970
    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    invoke-virtual {v11, v0, v9}, Landroid/graphics/Path;->moveTo(FF)V

    .line 971
    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    mul-float/2addr v1, v10

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 974
    const/4 v13, 0x0

    .line 976
    const/4 v14, 0x0

    .line 978
    move-object v15, v12

    .line 980
    move/from16 v16, p2

    .line 983
    add-int/lit8 v17, p2, 0x1

    :goto_1
    move/from16 v0, v17

    if-gt v0, v7, :cond_5

    .line 985
    move-object/from16 v0, p1

    move/from16 v1, v17

    invoke-interface {v0, v1}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v13

    .line 994
    move-object/from16 v0, p1

    check-cast v0, Lo/elb;

    invoke-virtual {v15}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Lo/elb;->e(II)Z

    move-result v18

    .line 996
    if-nez v18, :cond_2

    .line 999
    if-eqz v4, :cond_1

    .line 1000
    invoke-virtual {v15}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    add-float/2addr v0, v5

    invoke-virtual {v15}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    mul-float/2addr v1, v10

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1003
    :cond_1
    move/from16 v16, v17

    .line 1004
    move-object v14, v15

    .line 1005
    goto :goto_3

    .line 1008
    :cond_2
    if-nez v4, :cond_3

    .line 1009
    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    mul-float/2addr v1, v10

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_2

    .line 1011
    :cond_3
    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    invoke-virtual {v15}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    mul-float/2addr v1, v10

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1012
    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    mul-float/2addr v1, v10

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1015
    :goto_2
    move-object v15, v13

    .line 1017
    move/from16 v16, v17

    .line 1019
    move-object v14, v15

    .line 1021
    move/from16 v0, v16

    move/from16 v1, p4

    if-ne v0, v1, :cond_4

    .line 1024
    add-int/lit8 v16, p4, 0x1

    .line 1025
    goto :goto_3

    .line 983
    :cond_4
    add-int/lit8 v17, v17, 0x1

    goto/16 :goto_1

    .line 1030
    :cond_5
    :goto_3
    if-eqz v14, :cond_7

    .line 1032
    if-nez v4, :cond_6

    .line 1033
    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    invoke-virtual {v11, v0, v9}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_4

    .line 1036
    :cond_6
    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    add-float/2addr v0, v5

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    mul-float/2addr v1, v10

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1037
    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    add-float/2addr v0, v5

    invoke-virtual {v11, v0, v9}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1041
    :cond_7
    :goto_4
    invoke-virtual {v11}, Landroid/graphics/Path;->close()V

    .line 1043
    return v16
.end method

.method private e(Lo/ekz;ILandroid/graphics/Path;Lo/nv;Lo/eid;)V
    .locals 13

    .line 1054
    invoke-virtual/range {p5 .. p5}, Lo/eid;->a()Z

    move-result v2

    .line 1055
    move-object v0, p1

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->ak()F

    move-result v3

    .line 1059
    const/4 v0, 0x2

    new-array v4, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v4, v1

    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    invoke-interface {v0}, Lo/ejh;->getContentRect()Landroid/graphics/RectF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, Lo/eky;->c:Lo/ejh;

    invoke-interface {v1}, Lo/ejh;->getXAxis()Lo/ln;

    move-result-object v1

    invoke-virtual {v1}, Lo/ln;->y()F

    move-result v1

    add-float/2addr v0, v1

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 1060
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    sget-object v1, Lo/eit$b;->e:Lo/eit$b;

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/eim;->d([F)V

    .line 1062
    const/4 v0, 0x1

    aget v5, v4, v0

    .line 1063
    iget-object v0, p0, Lo/eky;->i:Lo/la;

    invoke-virtual {v0}, Lo/la;->d()F

    move-result v6

    .line 1065
    move-object/from16 v7, p3

    .line 1066
    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    .line 1068
    move-object v0, p1

    check-cast v0, Lo/elb;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/elb;->h(Z)F

    move-result v8

    .line 1070
    invoke-interface {p1, p2}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v9

    .line 1072
    const/4 v0, 0x2

    new-array v10, v0, [F

    invoke-virtual {v9}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    const/4 v1, 0x0

    aput v0, v10, v1

    const/4 v0, 0x1

    aput v5, v10, v0

    .line 1073
    const/4 v0, 0x2

    new-array v11, v0, [F

    invoke-virtual {v9}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    const/4 v1, 0x0

    aput v0, v11, v1

    invoke-virtual {v9}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v0

    mul-float/2addr v0, v6

    const/4 v1, 0x1

    aput v0, v11, v1

    .line 1075
    const/4 v0, 0x2

    new-array v12, v0, [F

    invoke-virtual {v9}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    add-float/2addr v0, v3

    const/4 v1, 0x0

    aput v0, v12, v1

    invoke-virtual {v9}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v0

    mul-float/2addr v0, v6

    const/4 v1, 0x1

    aput v0, v12, v1

    .line 1077
    move-object/from16 v0, p4

    invoke-virtual {v0, v10}, Lo/nv;->e([F)V

    .line 1078
    move-object/from16 v0, p4

    invoke-virtual {v0, v11}, Lo/nv;->e([F)V

    .line 1079
    move-object/from16 v0, p4

    invoke-virtual {v0, v12}, Lo/nv;->e([F)V

    .line 1081
    if-nez v2, :cond_0

    .line 1082
    const/4 v0, 0x0

    aget v0, v11, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v8, v1

    sub-float/2addr v0, v1

    const/4 v1, 0x1

    aget v1, v10, v1

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 1083
    const/4 v0, 0x0

    aget v0, v11, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v8, v1

    sub-float/2addr v0, v1

    const/4 v1, 0x1

    aget v1, v11, v1

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1084
    const/4 v0, 0x0

    aget v0, v11, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v8, v1

    add-float/2addr v0, v1

    const/4 v1, 0x1

    aget v1, v11, v1

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1085
    const/4 v0, 0x0

    aget v0, v11, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v8, v1

    add-float/2addr v0, v1

    const/4 v1, 0x1

    aget v1, v10, v1

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_0

    .line 1087
    :cond_0
    const/4 v0, 0x0

    aget v0, v11, v0

    const/4 v1, 0x1

    aget v1, v10, v1

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 1088
    const/4 v0, 0x0

    aget v0, v11, v0

    const/4 v1, 0x1

    aget v1, v11, v1

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1089
    const/4 v0, 0x0

    aget v0, v12, v0

    const/4 v1, 0x1

    aget v1, v12, v1

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1090
    const/4 v0, 0x0

    aget v0, v12, v0

    const/4 v1, 0x1

    aget v1, v10, v1

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1093
    :goto_0
    invoke-virtual {v7}, Landroid/graphics/Path;->close()V

    .line 1094
    return-void
.end method

.method private k()V
    .locals 11

    .line 1284
    iget-boolean v0, p0, Lo/eky;->s:Z

    if-nez v0, :cond_0

    .line 1285
    return-void

    .line 1288
    :cond_0
    iget-object v0, p0, Lo/eky;->w:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 1290
    iget-object v0, p0, Lo/eky;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/eib;

    .line 1291
    const/4 v0, 0x4

    new-array v8, v0, [F

    iget v0, v7, Lo/eib;->a:F

    const/4 v1, 0x0

    aput v0, v8, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v8, v1

    iget v0, v7, Lo/eib;->b:F

    const/4 v1, 0x2

    aput v0, v8, v1

    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v8, v1

    .line 1292
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    iget-object v1, p0, Lo/eky;->c:Lo/ejh;

    check-cast v1, Lo/eie;

    invoke-virtual {v1}, Lo/eie;->getAxisFirstParty()Lo/eit;

    move-result-object v1

    invoke-virtual {v1}, Lo/eit;->P()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v9

    .line 1293
    invoke-virtual {v9, v8}, Lo/nv;->e([F)V

    .line 1295
    iget-object v0, p0, Lo/eky;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->i()F

    move-result v0

    iget-object v1, p0, Lo/eky;->c:Lo/ejh;

    invoke-interface {v1}, Lo/ejh;->getXAxis()Lo/ln;

    move-result-object v1

    invoke-virtual {v1}, Lo/ln;->y()F

    move-result v1

    add-float/2addr v0, v1

    float-to-int v10, v0

    .line 1297
    iget-object v0, p0, Lo/eky;->w:Landroid/graphics/Path;

    const/4 v1, 0x0

    aget v1, v8, v1

    iget-object v2, p0, Lo/eky;->l:Lo/oa;

    .line 1298
    invoke-virtual {v2}, Lo/oa;->e()F

    move-result v2

    const/4 v3, 0x2

    aget v3, v8, v3

    int-to-float v4, v10

    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 1297
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 1302
    goto :goto_0

    .line 1303
    :cond_1
    return-void
.end method


# virtual methods
.method protected a(Lo/mw;)I
    .locals 4

    .line 183
    iget-boolean v0, p0, Lo/eky;->r:Z

    if-eqz v0, :cond_0

    .line 184
    const/16 v0, 0xff

    const/16 v1, 0xf2

    const/16 v2, 0xf2

    const/16 v3, 0xf2

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0

    .line 186
    :cond_0
    invoke-interface {p1}, Lo/mw;->m()I

    move-result v0

    return v0
.end method

.method protected a(Lo/ekz;)V
    .locals 21

    .line 203
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->i:Lo/la;

    invoke-virtual {v0}, Lo/la;->d()F

    move-result v7

    .line 205
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->c:Lo/ejh;

    move-object/from16 v1, p1

    check-cast v1, Lo/elb;

    invoke-virtual {v1}, Lo/elb;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v8

    .line 208
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->f:Lo/nk$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->c:Lo/ejh;

    move-object/from16 v2, p1

    invoke-virtual {v0, v1, v2}, Lo/nk$d;->b(Lo/mn;Lo/mv;)V

    .line 210
    invoke-interface/range {p1 .. p1}, Lo/ekz;->L()F

    move-result v9

    .line 212
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->p:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 214
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->a:I

    const/4 v1, 0x1

    if-lt v0, v1, :cond_3

    .line 216
    const/4 v10, 0x0

    .line 217
    const/4 v11, 0x0

    .line 218
    const/4 v12, 0x0

    .line 219
    const/4 v13, 0x0

    .line 226
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->c:I

    add-int/lit8 v14, v0, 0x1

    .line 229
    add-int/lit8 v0, v14, -0x2

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v16

    .line 230
    add-int/lit8 v0, v14, -0x1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v17

    .line 231
    move-object/from16 v18, v17

    .line 232
    const/16 v19, -0x1

    .line 234
    if-nez v17, :cond_0

    return-void

    .line 237
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->p:Landroid/graphics/Path;

    invoke-virtual/range {v17 .. v17}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual/range {v17 .. v17}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v7

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 239
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->c:I

    add-int/lit8 v20, v0, 0x1

    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->a:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->f:Lo/nk$d;

    iget v1, v1, Lo/nk$d;->c:I

    add-int/2addr v0, v1

    move/from16 v1, v20

    if-gt v1, v0, :cond_3

    .line 241
    move-object/from16 v15, v16

    .line 242
    move-object/from16 v16, v17

    .line 243
    move/from16 v0, v19

    move/from16 v1, v20

    if-ne v0, v1, :cond_1

    move-object/from16 v17, v18

    goto :goto_1

    :cond_1
    move-object/from16 v0, p1

    move/from16 v1, v20

    invoke-interface {v0, v1}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v17

    .line 245
    :goto_1
    add-int/lit8 v0, v20, 0x1

    invoke-interface/range {p1 .. p1}, Lo/ekz;->C()I

    move-result v1

    if-ge v0, v1, :cond_2

    add-int/lit8 v19, v20, 0x1

    goto :goto_2

    :cond_2
    move/from16 v19, v20

    .line 246
    :goto_2
    move-object/from16 v0, p1

    move/from16 v1, v19

    invoke-interface {v0, v1}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v18

    .line 248
    invoke-virtual/range {v17 .. v17}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    invoke-virtual {v15}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    sub-float/2addr v0, v1

    mul-float v10, v0, v9

    .line 249
    invoke-virtual/range {v17 .. v17}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v0

    invoke-virtual {v15}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    sub-float/2addr v0, v1

    mul-float v11, v0, v9

    .line 250
    invoke-virtual/range {v18 .. v18}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    invoke-virtual/range {v16 .. v16}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    sub-float/2addr v0, v1

    mul-float v12, v0, v9

    .line 251
    invoke-virtual/range {v18 .. v18}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v0

    invoke-virtual/range {v16 .. v16}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    sub-float/2addr v0, v1

    mul-float v13, v0, v9

    .line 253
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->p:Landroid/graphics/Path;

    invoke-virtual/range {v16 .. v16}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    add-float/2addr v1, v10

    invoke-virtual/range {v16 .. v16}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    add-float/2addr v2, v11

    mul-float/2addr v2, v7

    .line 254
    invoke-virtual/range {v17 .. v17}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v3

    sub-float/2addr v3, v12

    .line 255
    invoke-virtual/range {v17 .. v17}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v4

    sub-float/2addr v4, v13

    mul-float/2addr v4, v7

    invoke-virtual/range {v17 .. v17}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v5

    invoke-virtual/range {v17 .. v17}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v6

    mul-float/2addr v6, v7

    .line 253
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 239
    add-int/lit8 v20, v20, 0x1

    goto/16 :goto_0

    .line 259
    :cond_3
    invoke-interface/range {p1 .. p1}, Lo/ekz;->V()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 261
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->m:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 262
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->m:Landroid/graphics/Path;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->p:Landroid/graphics/Path;

    invoke-virtual {v0, v1}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 264
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->a:Landroid/graphics/Canvas;

    move-object/from16 v2, p1

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/eky;->m:Landroid/graphics/Path;

    move-object v4, v8

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/eky;->f:Lo/nk$d;

    invoke-virtual/range {v0 .. v5}, Lo/eky;->e(Landroid/graphics/Canvas;Lo/ekz;Landroid/graphics/Path;Lo/nv;Lo/nk$d;)V

    .line 267
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v1, v2}, Lo/eky;->c(Lo/ekz;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 269
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 271
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->p:Landroid/graphics/Path;

    invoke-virtual {v8, v0}, Lo/nv;->a(Landroid/graphics/Path;)V

    .line 273
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->a:Landroid/graphics/Canvas;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->p:Landroid/graphics/Path;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/eky;->h:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 275
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 276
    return-void
.end method

.method protected b(Landroid/graphics/Canvas;Lo/ekz;Lo/eid;)V
    .locals 35

    .line 546
    invoke-interface/range {p2 .. p2}, Lo/ekz;->aa()Z

    move-result v0

    if-nez v0, :cond_0

    .line 547
    return-void

    .line 551
    :cond_0
    move-object/from16 v0, p0

    iget-boolean v6, v0, Lo/eky;->s:Z

    .line 553
    invoke-interface/range {p2 .. p2}, Lo/ekz;->C()I

    move-result v7

    .line 555
    invoke-interface/range {p2 .. p2}, Lo/ekz;->Y()Z

    move-result v8

    .line 556
    if-eqz v8, :cond_1

    const/4 v9, 0x4

    goto :goto_0

    :cond_1
    const/4 v9, 0x2

    .line 558
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->c:Lo/ejh;

    invoke-interface/range {p2 .. p2}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v10

    .line 560
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->i:Lo/la;

    invoke-virtual {v0}, Lo/la;->d()F

    move-result v11

    .line 562
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 566
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 568
    move-object/from16 v0, p0

    iget-object v12, v0, Lo/eky;->a:Landroid/graphics/Canvas;

    .line 570
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->f:Lo/nk$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->c:Lo/ejh;

    move-object/from16 v2, p2

    invoke-virtual {v0, v1, v2}, Lo/nk$d;->b(Lo/mn;Lo/mv;)V

    .line 573
    invoke-interface/range {p2 .. p2}, Lo/ekz;->V()Z

    move-result v0

    if-eqz v0, :cond_2

    if-lez v7, :cond_2

    .line 574
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->a:Landroid/graphics/Canvas;

    move-object/from16 v2, p2

    move-object v3, v10

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/eky;->f:Lo/nk$d;

    move-object/from16 v5, p3

    invoke-virtual/range {v0 .. v5}, Lo/eky;->d(Landroid/graphics/Canvas;Lo/ekz;Lo/nv;Lo/nk$d;Lo/eid;)V

    .line 578
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    array-length v0, v0

    mul-int v1, v7, v9

    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    if-ge v0, v1, :cond_3

    .line 579
    mul-int v0, v7, v9

    invoke-static {v0, v9}, Ljava/lang/Math;->max(II)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    new-array v0, v0, [F

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/eky;->q:[F

    .line 581
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->t:[F

    array-length v0, v0

    mul-int v1, v7, v9

    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    if-ge v0, v1, :cond_4

    .line 582
    mul-int v0, v7, v9

    invoke-static {v0, v9}, Ljava/lang/Math;->max(II)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    new-array v0, v0, [F

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/eky;->t:[F

    .line 586
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->c:I

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v13

    .line 588
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    .line 590
    if-eqz v13, :cond_17

    .line 592
    const/16 v18, 0x0

    .line 593
    const/16 v19, 0x0

    .line 594
    const/16 v20, 0x0

    .line 598
    const/16 v21, 0x0

    .line 600
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->f:Lo/nk$d;

    iget v1, v0, Lo/nk$d;->c:I

    move/from16 v22, v1

    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->a:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->f:Lo/nk$d;

    iget v1, v1, Lo/nk$d;->c:I

    add-int/2addr v0, v1

    move/from16 v1, v22

    if-gt v1, v0, :cond_e

    .line 602
    const/4 v14, 0x0

    .line 603
    if-eqz v22, :cond_5

    .line 604
    add-int/lit8 v0, v22, -0x1

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v14

    .line 608
    :cond_5
    move-object/from16 v0, p2

    move/from16 v1, v22

    invoke-interface {v0, v1}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v15

    .line 610
    const/16 v16, 0x0

    .line 611
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->a:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->f:Lo/nk$d;

    iget v1, v1, Lo/nk$d;->c:I

    add-int/2addr v0, v1

    move/from16 v1, v22

    if-eq v1, v0, :cond_6

    .line 612
    add-int/lit8 v0, v22, 0x1

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v16

    .line 616
    :cond_6
    if-nez v15, :cond_7

    goto/16 :goto_2

    .line 618
    :cond_7
    move-object/from16 v0, p0

    iget v0, v0, Lo/eky;->u:I

    if-eqz v0, :cond_8

    .line 619
    new-instance v0, Landroid/graphics/PointF;

    invoke-virtual {v15}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual {v15}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v11

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    move-object/from16 v1, v17

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 623
    :cond_8
    const/16 v23, 0x0

    .line 624
    if-eqz v14, :cond_9

    .line 625
    move-object/from16 v0, p2

    check-cast v0, Lo/elb;

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v15}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Lo/elb;->e(II)Z

    move-result v23

    .line 627
    :cond_9
    const/16 v24, 0x0

    .line 628
    if-eqz v16, :cond_a

    .line 629
    move-object/from16 v0, p2

    check-cast v0, Lo/elb;

    invoke-virtual {v15}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual/range {v16 .. v16}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Lo/elb;->e(II)Z

    move-result v24

    .line 632
    :cond_a
    if-nez v23, :cond_b

    if-nez v24, :cond_b

    .line 635
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->t:[F

    move/from16 v1, v19

    add-int/lit8 v19, v19, 0x1

    invoke-virtual {v15}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    aput v2, v0, v1

    .line 636
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->t:[F

    move/from16 v1, v19

    add-int/lit8 v19, v19, 0x1

    invoke-virtual {v15}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v11

    aput v2, v0, v1

    .line 637
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->t:[F

    move/from16 v1, v19

    add-int/lit8 v19, v19, 0x1

    invoke-virtual {v15}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    aput v2, v0, v1

    .line 638
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->t:[F

    move/from16 v1, v19

    add-int/lit8 v19, v19, 0x1

    invoke-virtual {v15}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v11

    aput v2, v0, v1

    .line 639
    add-int/lit8 v20, v20, 0x1

    .line 643
    :cond_b
    if-eqz v14, :cond_d

    if-nez v23, :cond_c

    .line 644
    goto :goto_2

    .line 647
    :cond_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v18

    add-int/lit8 v18, v18, 0x1

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    aput v2, v0, v1

    .line 648
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v18

    add-int/lit8 v18, v18, 0x1

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v11

    aput v2, v0, v1

    .line 650
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v18

    add-int/lit8 v18, v18, 0x1

    invoke-virtual {v15}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    aput v2, v0, v1

    .line 651
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v18

    add-int/lit8 v18, v18, 0x1

    invoke-virtual {v15}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v11

    aput v2, v0, v1

    .line 652
    add-int/lit8 v21, v21, 0x1

    .line 600
    :cond_d
    :goto_2
    add-int/lit8 v22, v22, 0x1

    goto/16 :goto_1

    .line 655
    :cond_e
    if-lez v18, :cond_15

    .line 658
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 659
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 661
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    invoke-virtual {v10, v0}, Lo/nv;->e([F)V

    .line 666
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v1, v2}, Lo/eky;->c(Lo/ekz;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 672
    mul-int v0, v21, v9

    invoke-static {v0, v9}, Ljava/lang/Math;->max(II)I

    move-result v22

    .line 675
    new-instance v23, Landroid/graphics/Path;

    invoke-direct/range {v23 .. v23}, Landroid/graphics/Path;-><init>()V

    .line 678
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->q:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    move-object/from16 v2, v23

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 679
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    const/4 v1, 0x0

    aget v24, v0, v1

    .line 680
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    const/4 v1, 0x0

    aget v25, v0, v1

    .line 681
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    const/4 v1, 0x0

    aget v26, v0, v1

    .line 682
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    const/4 v1, 0x1

    aget v27, v0, v1

    .line 684
    const/16 v28, 0x0

    :goto_3
    mul-int/lit8 v0, v28, 0x2

    add-int/lit8 v0, v0, 0x1

    move/from16 v1, v22

    if-ge v0, v1, :cond_12

    .line 686
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    mul-int/lit8 v1, v28, 0x2

    mul-int/lit8 v1, v1, 0x2

    aget v29, v0, v1

    .line 687
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    mul-int/lit8 v1, v28, 0x2

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    aget v30, v0, v1

    .line 689
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    mul-int/lit8 v1, v28, 0x2

    add-int/lit8 v1, v1, 0x1

    mul-int/lit8 v1, v1, 0x2

    aget v31, v0, v1

    .line 690
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    mul-int/lit8 v1, v28, 0x2

    add-int/lit8 v1, v1, 0x1

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    aget v32, v0, v1

    .line 692
    move-object/from16 v0, p0

    move/from16 v1, v26

    move/from16 v2, v29

    invoke-direct {v0, v1, v2}, Lo/eky;->c(FF)Z

    move-result v0

    if-eqz v0, :cond_f

    move-object/from16 v0, p0

    move/from16 v1, v27

    move/from16 v2, v30

    invoke-direct {v0, v1, v2}, Lo/eky;->c(FF)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 694
    move-object/from16 v0, v23

    move/from16 v1, v31

    move/from16 v2, v32

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 696
    move/from16 v25, v31

    .line 697
    move/from16 v26, v31

    .line 698
    move/from16 v27, v32

    .line 699
    goto/16 :goto_4

    .line 702
    :cond_f
    invoke-virtual {v12}, Landroid/graphics/Canvas;->save()I

    move-result v33

    .line 703
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->l:Lo/oa;

    .line 704
    invoke-virtual {v0}, Lo/oa;->e()F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->l:Lo/oa;

    .line 706
    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    .line 703
    move/from16 v2, v24

    move/from16 v3, v25

    invoke-virtual {v12, v2, v0, v3, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 707
    if-eqz v6, :cond_10

    .line 708
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->w:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 710
    :cond_10
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move-object/from16 v1, v23

    invoke-virtual {v12, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 711
    move/from16 v0, v33

    invoke-virtual {v12, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 714
    if-eqz v6, :cond_11

    .line 715
    invoke-virtual {v12}, Landroid/graphics/Canvas;->save()I

    move-result v33

    .line 716
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->l:Lo/oa;

    .line 717
    invoke-virtual {v0}, Lo/oa;->e()F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->l:Lo/oa;

    .line 719
    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    .line 716
    move/from16 v2, v24

    move/from16 v3, v25

    invoke-virtual {v12, v2, v0, v3, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 720
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v34

    .line 721
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lo/eky;->c(Lo/ekz;Z)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 722
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->w:Landroid/graphics/Path;

    invoke-virtual {v12, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 723
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move-object/from16 v1, v23

    invoke-virtual {v12, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 724
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move/from16 v1, v34

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 725
    move/from16 v0, v33

    invoke-virtual {v12, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 729
    :cond_11
    invoke-virtual/range {v23 .. v23}, Landroid/graphics/Path;->reset()V

    .line 731
    move/from16 v24, v29

    .line 733
    move-object/from16 v0, v23

    move/from16 v1, v29

    move/from16 v2, v30

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 734
    move-object/from16 v0, v23

    move/from16 v1, v31

    move/from16 v2, v32

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 736
    move/from16 v25, v31

    .line 737
    move/from16 v26, v31

    .line 738
    move/from16 v27, v32

    .line 684
    :goto_4
    add-int/lit8 v28, v28, 0x1

    goto/16 :goto_3

    .line 742
    :cond_12
    invoke-virtual {v12}, Landroid/graphics/Canvas;->save()I

    move-result v28

    .line 743
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->l:Lo/oa;

    .line 744
    invoke-virtual {v0}, Lo/oa;->e()F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->l:Lo/oa;

    .line 746
    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    .line 743
    move/from16 v2, v24

    move/from16 v3, v25

    invoke-virtual {v12, v2, v0, v3, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 747
    if-eqz v6, :cond_13

    .line 748
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->w:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 750
    :cond_13
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move-object/from16 v1, v23

    invoke-virtual {v12, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 751
    move/from16 v0, v28

    invoke-virtual {v12, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 754
    if-eqz v6, :cond_14

    .line 755
    invoke-virtual {v12}, Landroid/graphics/Canvas;->save()I

    move-result v28

    .line 756
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->l:Lo/oa;

    .line 757
    invoke-virtual {v0}, Lo/oa;->e()F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->l:Lo/oa;

    .line 759
    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    .line 756
    move/from16 v2, v24

    move/from16 v3, v25

    invoke-virtual {v12, v2, v0, v3, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 760
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v29

    .line 761
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lo/eky;->c(Lo/ekz;Z)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 762
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->w:Landroid/graphics/Path;

    invoke-virtual {v12, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 763
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move-object/from16 v1, v23

    invoke-virtual {v12, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 764
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 765
    move/from16 v0, v28

    invoke-virtual {v12, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 769
    :cond_14
    invoke-virtual/range {v23 .. v23}, Landroid/graphics/Path;->reset()V

    .line 773
    :cond_15
    if-lez v19, :cond_16

    .line 775
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 777
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v22

    .line 778
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->t:[F

    invoke-virtual {v10, v0}, Lo/nv;->e([F)V

    .line 779
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v1, v2}, Lo/eky;->c(Lo/ekz;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 782
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p2

    check-cast v1, Lo/elb;

    invoke-interface/range {p2 .. p2}, Lo/ekz;->V()Z

    move-result v2

    invoke-virtual {v1, v2}, Lo/elb;->h(Z)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 784
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->t:[F

    mul-int/lit8 v1, v20, 0x2

    mul-int/lit8 v1, v1, 0x2

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/eky;->h:Landroid/graphics/Paint;

    const/4 v3, 0x0

    invoke-virtual {v12, v0, v3, v1, v2}, Landroid/graphics/Canvas;->drawLines([FIILandroid/graphics/Paint;)V

    .line 786
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 789
    :cond_16
    move-object/from16 v0, p0

    iget v0, v0, Lo/eky;->u:I

    if-eqz v0, :cond_17

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_17

    .line 790
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lo/eky;->c(Lo/ekz;)I

    move-result v0

    move-object/from16 v1, p0

    move-object/from16 v2, v17

    move-object/from16 v3, p2

    invoke-direct {v1, v12, v0, v2, v3}, Lo/eky;->a(Landroid/graphics/Canvas;ILjava/util/List;Lo/ekz;)V

    .line 795
    :cond_17
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 796
    return-void
.end method

.method public b()Z
    .locals 1

    .line 1212
    iget-boolean v0, p0, Lo/eky;->r:Z

    return v0
.end method

.method public c()V
    .locals 1

    .line 1275
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eky;->s:Z

    .line 1276
    iget-object v0, p0, Lo/eky;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1277
    iget-object v0, p0, Lo/eky;->w:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 1279
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    check-cast v0, Lo/eie;

    invoke-virtual {v0}, Lo/eie;->invalidate()V

    .line 1280
    return-void
.end method

.method protected c(Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/drawable/Drawable;FZ)V
    .locals 7

    .line 1098
    invoke-direct {p0}, Lo/eky;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1101
    iget-boolean v4, p0, Lo/eky;->s:Z

    .line 1103
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v5

    .line 1104
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 1107
    if-eqz v4, :cond_0

    .line 1108
    iget-object v0, p0, Lo/eky;->w:Landroid/graphics/Path;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 1111
    :cond_0
    if-eqz p5, :cond_1

    .line 1112
    iget-object v0, p0, Lo/eky;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->f()F

    move-result v0

    float-to-int v0, v0

    iget-object v1, p0, Lo/eky;->l:Lo/oa;

    .line 1113
    invoke-virtual {v1}, Lo/oa;->e()F

    move-result v1

    float-to-int v1, v1

    iget-object v2, p0, Lo/eky;->l:Lo/oa;

    .line 1114
    invoke-virtual {v2}, Lo/oa;->h()F

    move-result v2

    float-to-int v2, v2

    float-to-int v3, p4

    .line 1112
    invoke-virtual {p3, v0, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    goto :goto_0

    .line 1117
    :cond_1
    iget-object v0, p0, Lo/eky;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->i()F

    move-result v0

    iget-object v1, p0, Lo/eky;->c:Lo/ejh;

    invoke-interface {v1}, Lo/ejh;->getXAxis()Lo/ln;

    move-result-object v1

    invoke-virtual {v1}, Lo/ln;->y()F

    move-result v1

    add-float/2addr v0, v1

    float-to-int v6, v0

    .line 1118
    iget-object v0, p0, Lo/eky;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->f()F

    move-result v0

    float-to-int v0, v0

    float-to-int v1, p4

    iget-object v2, p0, Lo/eky;->l:Lo/oa;

    .line 1120
    invoke-virtual {v2}, Lo/oa;->h()F

    move-result v2

    float-to-int v2, v2

    .line 1118
    invoke-virtual {p3, v0, v1, v2, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1123
    :goto_0
    invoke-virtual {p3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 1125
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 1126
    goto :goto_1

    .line 1127
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fill-drawables not (yet) supported below API level 18, this code was run on API level "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1128
    invoke-static {}, Lo/oc;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1130
    :goto_1
    return-void
.end method

.method protected c(Landroid/graphics/Canvas;Lo/ekz;)V
    .locals 3

    .line 287
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    invoke-interface {p2}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->e(Lo/eit$b;)Lo/eid;

    move-result-object v2

    .line 289
    invoke-direct {p0}, Lo/eky;->k()V

    .line 291
    if-eqz v2, :cond_1

    .line 292
    invoke-virtual {v2}, Lo/eid;->a()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 293
    invoke-virtual {p0, p1, p2, v2}, Lo/eky;->d(Landroid/graphics/Canvas;Lo/ekz;Lo/eid;)V

    goto :goto_0

    .line 295
    :cond_0
    invoke-virtual {p0, p1, p2, v2}, Lo/eky;->b(Landroid/graphics/Canvas;Lo/ekz;Lo/eid;)V

    .line 298
    :cond_1
    :goto_0
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 1207
    iput-boolean p1, p0, Lo/eky;->r:Z

    .line 1208
    return-void
.end method

.method protected d(Ljava/util/List;I)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ekz;>;I)I"
        }
    .end annotation

    .line 194
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 195
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ekz;

    invoke-interface {v0}, Lo/ekz;->m()I

    move-result v0

    return v0

    .line 198
    :cond_0
    const/16 v0, 0x7f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0
.end method

.method protected d(Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/drawable/Drawable;)V
    .locals 5

    .line 1134
    invoke-direct {p0}, Lo/eky;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1136
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    .line 1137
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 1139
    iget-object v0, p0, Lo/eky;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->i()F

    move-result v0

    iget-object v1, p0, Lo/eky;->c:Lo/ejh;

    invoke-interface {v1}, Lo/ejh;->getXAxis()Lo/ln;

    move-result-object v1

    invoke-virtual {v1}, Lo/ln;->y()F

    move-result v1

    add-float/2addr v0, v1

    float-to-int v4, v0

    .line 1140
    iget-object v0, p0, Lo/eky;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->f()F

    move-result v0

    float-to-int v0, v0

    iget-object v1, p0, Lo/eky;->l:Lo/oa;

    .line 1141
    invoke-virtual {v1}, Lo/oa;->e()F

    move-result v1

    float-to-int v1, v1

    iget-object v2, p0, Lo/eky;->l:Lo/oa;

    .line 1142
    invoke-virtual {v2}, Lo/oa;->h()F

    move-result v2

    float-to-int v2, v2

    .line 1140
    invoke-virtual {p3, v0, v1, v2, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1145
    invoke-virtual {p3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 1147
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 1148
    goto :goto_0

    .line 1149
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fill-drawables not (yet) supported below API level 18, this code was run on API level "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1150
    invoke-static {}, Lo/oc;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1152
    :goto_0
    return-void
.end method

.method protected d(Landroid/graphics/Canvas;Lo/ekz;Lo/eid;)V
    .locals 33

    .line 302
    invoke-interface/range {p2 .. p2}, Lo/ekz;->aa()Z

    move-result v0

    if-nez v0, :cond_0

    .line 303
    return-void

    .line 306
    :cond_0
    move-object/from16 v0, p2

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->ai()Z

    move-result v6

    .line 307
    if-nez v6, :cond_1

    .line 308
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "drawLadderLinear needs displayIntervalSeted"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 311
    :cond_1
    invoke-interface/range {p2 .. p2}, Lo/ekz;->C()I

    move-result v7

    .line 313
    const/4 v8, 0x2

    .line 315
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->c:Lo/ejh;

    invoke-interface/range {p2 .. p2}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v9

    .line 317
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->i:Lo/la;

    invoke-virtual {v0}, Lo/la;->d()F

    move-result v10

    .line 319
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 323
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 325
    move-object/from16 v0, p0

    iget-object v11, v0, Lo/eky;->a:Landroid/graphics/Canvas;

    .line 327
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->f:Lo/nk$d;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->c:Lo/ejh;

    move-object/from16 v2, p2

    invoke-virtual {v0, v1, v2}, Lo/nk$d;->b(Lo/mn;Lo/mv;)V

    .line 330
    invoke-interface/range {p2 .. p2}, Lo/ekz;->V()Z

    move-result v0

    if-eqz v0, :cond_2

    if-lez v7, :cond_2

    .line 331
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->a:Landroid/graphics/Canvas;

    move-object/from16 v2, p2

    move-object v3, v9

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/eky;->f:Lo/nk$d;

    move-object/from16 v5, p3

    invoke-virtual/range {v0 .. v5}, Lo/eky;->d(Landroid/graphics/Canvas;Lo/ekz;Lo/nv;Lo/nk$d;Lo/eid;)V

    .line 336
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    array-length v0, v0

    mul-int/lit8 v1, v7, 0x8

    const/16 v2, 0x8

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 337
    mul-int/lit8 v0, v7, 0x8

    const/16 v1, 0x8

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-array v0, v0, [F

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/eky;->q:[F

    .line 339
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->t:[F

    array-length v0, v0

    mul-int/lit8 v1, v7, 0x8

    const/16 v2, 0x8

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 340
    mul-int/lit8 v0, v7, 0x8

    const/16 v1, 0x8

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-array v0, v0, [F

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/eky;->t:[F

    .line 344
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->c:I

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v12

    .line 346
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 348
    if-eqz v12, :cond_14

    .line 350
    const/16 v17, 0x0

    .line 351
    const/16 v18, 0x0

    .line 352
    const/16 v19, 0x0

    .line 356
    const/16 v20, 0x0

    .line 358
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->f:Lo/nk$d;

    iget v1, v0, Lo/nk$d;->c:I

    move/from16 v21, v1

    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->a:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->f:Lo/nk$d;

    iget v1, v1, Lo/nk$d;->c:I

    add-int/2addr v0, v1

    move/from16 v1, v21

    if-gt v1, v0, :cond_f

    .line 360
    const/4 v13, 0x0

    .line 361
    if-eqz v21, :cond_5

    .line 362
    add-int/lit8 v0, v21, -0x1

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v13

    .line 366
    :cond_5
    move-object/from16 v0, p2

    move/from16 v1, v21

    invoke-interface {v0, v1}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v14

    .line 368
    const/4 v15, 0x0

    .line 369
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->f:Lo/nk$d;

    iget v0, v0, Lo/nk$d;->a:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->f:Lo/nk$d;

    iget v1, v1, Lo/nk$d;->c:I

    add-int/2addr v0, v1

    move/from16 v1, v21

    if-eq v1, v0, :cond_6

    .line 370
    add-int/lit8 v0, v21, 0x1

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lo/ekz;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v15

    .line 374
    :cond_6
    if-nez v14, :cond_7

    goto/16 :goto_1

    .line 376
    :cond_7
    move-object/from16 v0, p0

    iget v0, v0, Lo/eky;->u:I

    if-eqz v0, :cond_8

    .line 377
    new-instance v0, Landroid/graphics/PointF;

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v10

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    move-object/from16 v1, v16

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 380
    :cond_8
    move-object/from16 v0, p2

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->ak()F

    move-result v22

    .line 383
    const/16 v23, 0x0

    .line 384
    if-eqz v13, :cond_9

    .line 385
    move-object/from16 v0, p2

    check-cast v0, Lo/elb;

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Lo/elb;->e(II)Z

    move-result v23

    .line 387
    :cond_9
    const/16 v24, 0x0

    .line 388
    if-eqz v15, :cond_a

    .line 389
    move-object/from16 v0, p2

    check-cast v0, Lo/elb;

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v15}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Lo/elb;->e(II)Z

    move-result v24

    .line 392
    :cond_a
    if-nez v23, :cond_b

    if-nez v24, :cond_b

    if-eqz v6, :cond_b

    .line 395
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->t:[F

    move/from16 v1, v18

    add-int/lit8 v18, v18, 0x1

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    aput v2, v0, v1

    .line 396
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->t:[F

    move/from16 v1, v18

    add-int/lit8 v18, v18, 0x1

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v10

    aput v2, v0, v1

    .line 399
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->t:[F

    move/from16 v1, v18

    add-int/lit8 v18, v18, 0x1

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    add-float v2, v2, v22

    aput v2, v0, v1

    .line 400
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->t:[F

    move/from16 v1, v18

    add-int/lit8 v18, v18, 0x1

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v10

    aput v2, v0, v1

    .line 401
    add-int/lit8 v19, v19, 0x1

    .line 405
    :cond_b
    if-eqz v13, :cond_c

    if-nez v23, :cond_d

    .line 406
    :cond_c
    if-eqz v13, :cond_e

    .line 408
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    aput v2, v0, v1

    .line 409
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v10

    aput v2, v0, v1

    .line 410
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    add-float v2, v2, v22

    aput v2, v0, v1

    .line 411
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v10

    aput v2, v0, v1

    .line 412
    add-int/lit8 v20, v20, 0x1

    goto/16 :goto_1

    .line 420
    :cond_d
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    aput v2, v0, v1

    .line 421
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v10

    aput v2, v0, v1

    .line 422
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    aput v2, v0, v1

    .line 423
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v10

    aput v2, v0, v1

    .line 426
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    aput v2, v0, v1

    .line 427
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v10

    aput v2, v0, v1

    .line 428
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    aput v2, v0, v1

    .line 429
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v10

    aput v2, v0, v1

    .line 431
    add-int/lit8 v20, v20, 0x2

    .line 433
    if-nez v15, :cond_e

    .line 435
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    aput v2, v0, v1

    .line 436
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v10

    aput v2, v0, v1

    .line 437
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    add-float v2, v2, v22

    aput v2, v0, v1

    .line 438
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    mul-float/2addr v2, v10

    aput v2, v0, v1

    .line 439
    add-int/lit8 v20, v20, 0x1

    .line 358
    :cond_e
    :goto_1
    add-int/lit8 v21, v21, 0x1

    goto/16 :goto_0

    .line 443
    :cond_f
    if-lez v17, :cond_12

    .line 446
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 447
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 449
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    invoke-virtual {v9, v0}, Lo/nv;->e([F)V

    .line 451
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v1, v2}, Lo/eky;->c(Lo/ekz;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 454
    mul-int/lit8 v0, v20, 0x2

    invoke-static {v0, v8}, Ljava/lang/Math;->max(II)I

    move-result v21

    .line 457
    new-instance v22, Landroid/graphics/Path;

    invoke-direct/range {v22 .. v22}, Landroid/graphics/Path;-><init>()V

    .line 460
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->q:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 461
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    const/4 v1, 0x0

    aget v23, v0, v1

    .line 462
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    const/4 v1, 0x0

    aget v24, v0, v1

    .line 463
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    const/4 v1, 0x0

    aget v25, v0, v1

    .line 464
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    const/4 v1, 0x1

    aget v26, v0, v1

    .line 466
    const/16 v27, 0x0

    :goto_2
    mul-int/lit8 v0, v27, 0x2

    add-int/lit8 v0, v0, 0x1

    move/from16 v1, v21

    if-ge v0, v1, :cond_11

    .line 468
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    mul-int/lit8 v1, v27, 0x2

    mul-int/lit8 v1, v1, 0x2

    aget v28, v0, v1

    .line 469
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    mul-int/lit8 v1, v27, 0x2

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    aget v29, v0, v1

    .line 471
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    mul-int/lit8 v1, v27, 0x2

    add-int/lit8 v1, v1, 0x1

    mul-int/lit8 v1, v1, 0x2

    aget v30, v0, v1

    .line 472
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->q:[F

    mul-int/lit8 v1, v27, 0x2

    add-int/lit8 v1, v1, 0x1

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    aget v31, v0, v1

    .line 474
    move-object/from16 v0, p0

    move/from16 v1, v25

    move/from16 v2, v28

    invoke-direct {v0, v1, v2}, Lo/eky;->c(FF)Z

    move-result v0

    if-eqz v0, :cond_10

    move-object/from16 v0, p0

    move/from16 v1, v26

    move/from16 v2, v29

    invoke-direct {v0, v1, v2}, Lo/eky;->c(FF)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 476
    move-object/from16 v0, v22

    move/from16 v1, v30

    move/from16 v2, v31

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 478
    move/from16 v24, v30

    .line 479
    move/from16 v25, v30

    .line 480
    move/from16 v26, v31

    .line 481
    goto :goto_3

    .line 484
    :cond_10
    invoke-virtual {v11}, Landroid/graphics/Canvas;->save()I

    move-result v32

    .line 485
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->l:Lo/oa;

    .line 486
    invoke-virtual {v0}, Lo/oa;->e()F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->l:Lo/oa;

    .line 488
    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    .line 485
    move/from16 v2, v23

    move/from16 v3, v24

    invoke-virtual {v11, v2, v0, v3, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 489
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move-object/from16 v1, v22

    invoke-virtual {v11, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 490
    move/from16 v0, v32

    invoke-virtual {v11, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 493
    invoke-virtual/range {v22 .. v22}, Landroid/graphics/Path;->reset()V

    .line 495
    move/from16 v23, v28

    .line 497
    move-object/from16 v0, v22

    move/from16 v1, v28

    move/from16 v2, v29

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 498
    move-object/from16 v0, v22

    move/from16 v1, v30

    move/from16 v2, v31

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 500
    move/from16 v24, v30

    .line 501
    move/from16 v25, v30

    .line 502
    move/from16 v26, v31

    .line 466
    :goto_3
    add-int/lit8 v27, v27, 0x1

    goto/16 :goto_2

    .line 506
    :cond_11
    invoke-virtual {v11}, Landroid/graphics/Canvas;->save()I

    move-result v27

    .line 507
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->l:Lo/oa;

    .line 508
    invoke-virtual {v0}, Lo/oa;->e()F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eky;->l:Lo/oa;

    .line 510
    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    .line 507
    move/from16 v2, v23

    move/from16 v3, v24

    invoke-virtual {v11, v2, v0, v3, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 511
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move-object/from16 v1, v22

    invoke-virtual {v11, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 512
    move/from16 v0, v27

    invoke-virtual {v11, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 515
    invoke-virtual/range {v22 .. v22}, Landroid/graphics/Path;->reset()V

    .line 520
    :cond_12
    if-lez v18, :cond_13

    .line 522
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 524
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v21

    .line 525
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->t:[F

    invoke-virtual {v9, v0}, Lo/nv;->e([F)V

    .line 526
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v1, v2}, Lo/eky;->c(Lo/ekz;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 529
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move-object/from16 v1, p2

    check-cast v1, Lo/elb;

    invoke-interface/range {p2 .. p2}, Lo/ekz;->V()Z

    move-result v2

    invoke-virtual {v1, v2}, Lo/elb;->h(Z)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 531
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->t:[F

    mul-int/lit8 v1, v19, 0x2

    mul-int/lit8 v1, v1, 0x2

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/eky;->h:Landroid/graphics/Paint;

    const/4 v3, 0x0

    invoke-virtual {v11, v0, v3, v1, v2}, Landroid/graphics/Canvas;->drawLines([FIILandroid/graphics/Paint;)V

    .line 533
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 536
    :cond_13
    move-object/from16 v0, p0

    iget v0, v0, Lo/eky;->u:I

    if-eqz v0, :cond_14

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_14

    .line 537
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lo/eky;->c(Lo/ekz;)I

    move-result v0

    move-object/from16 v1, p0

    move-object/from16 v2, v16

    move-object/from16 v3, p2

    invoke-direct {v1, v11, v0, v2, v3}, Lo/eky;->a(Landroid/graphics/Canvas;ILjava/util/List;Lo/ekz;)V

    .line 541
    :cond_14
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->h:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 542
    return-void
.end method

.method protected d(Landroid/graphics/Canvas;Lo/ekz;Lo/nv;Lo/nk$d;Lo/eid;)V
    .locals 19

    .line 873
    move-object/from16 v0, p0

    iget-object v6, v0, Lo/eky;->o:Landroid/graphics/Path;

    .line 875
    move-object/from16 v0, p4

    iget v7, v0, Lo/nk$d;->c:I

    .line 876
    move-object/from16 v0, p4

    iget v0, v0, Lo/nk$d;->a:I

    move-object/from16 v1, p4

    iget v1, v1, Lo/nk$d;->c:I

    add-int v8, v0, v1

    .line 879
    move v9, v7

    .line 884
    :goto_0
    if-gt v9, v8, :cond_6

    .line 885
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->c:Lo/ejh;

    check-cast v0, Lo/ekw;

    invoke-virtual {v0}, Lo/ekw;->getAxisFirstParty()Lo/eit;

    move-result-object v0

    iget-object v10, v0, Lo/eit;->a:[F

    .line 887
    array-length v0, v10

    add-int/lit8 v0, v0, -0x2

    aget v11, v10, v0

    .line 889
    const/4 v0, 0x2

    new-array v12, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v12, v1

    const/4 v0, 0x1

    aput v11, v12, v0

    .line 890
    move-object/from16 v0, p3

    invoke-virtual {v0, v12}, Lo/nv;->e([F)V

    .line 892
    move v13, v9

    .line 893
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move v2, v9

    move-object v3, v6

    move v4, v8

    move-object/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lo/eky;->d(Lo/ekz;ILandroid/graphics/Path;ILo/eid;)I

    move-result v14

    .line 895
    move-object/from16 v0, p3

    invoke-virtual {v0, v6}, Lo/nv;->a(Landroid/graphics/Path;)V

    .line 899
    add-int/lit8 v0, v13, 0x1

    if-ne v0, v14, :cond_0

    .line 902
    move-object/from16 v0, p2

    check-cast v0, Lo/elb;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/elb;->k(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 904
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move v2, v13

    move-object v3, v6

    move-object/from16 v4, p3

    move-object/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lo/eky;->e(Lo/ekz;ILandroid/graphics/Path;Lo/nv;Lo/eid;)V

    .line 910
    :cond_0
    move-object/from16 v0, p2

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->ag()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 911
    move-object/from16 v0, p2

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->ad()Landroid/graphics/drawable/GradientDrawable;

    move-result-object v15

    .line 912
    move-object/from16 v0, p2

    check-cast v0, Lo/elb;

    invoke-virtual {v0}, Lo/elb;->aj()Landroid/graphics/drawable/GradientDrawable;

    move-result-object v16

    .line 913
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eky;->r:Z

    if-eqz v0, :cond_1

    .line 914
    const/4 v0, 0x2

    new-array v0, v0, [I

    move-object/from16 v17, v0

    const/16 v0, 0x80

    const/16 v1, 0xcc

    const/16 v2, 0xcc

    const/16 v3, 0xcc

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v17, v1

    .line 915
    const/16 v0, 0x80

    const/16 v1, 0xcc

    const/16 v2, 0xcc

    const/16 v3, 0xcc

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v1, 0x1

    aput v0, v17, v1

    .line 916
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    sget-object v1, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    move-object/from16 v2, v17

    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    move-object/from16 v18, v0

    .line 917
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v18

    invoke-virtual {v0, v1, v6, v2}, Lo/eky;->d(Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/drawable/Drawable;)V

    .line 918
    goto :goto_1

    :cond_1
    if-eqz v15, :cond_2

    if-eqz v16, :cond_2

    .line 919
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v6

    move-object v3, v15

    const/4 v4, 0x1

    aget v4, v12, v4

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/eky;->c(Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/drawable/Drawable;FZ)V

    .line 920
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v6

    move-object/from16 v3, v16

    const/4 v4, 0x1

    aget v4, v12, v4

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/eky;->c(Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/drawable/Drawable;FZ)V

    .line 922
    :cond_2
    :goto_1
    goto :goto_2

    .line 924
    :cond_3
    invoke-interface/range {p2 .. p2}, Lo/ekz;->Q()Landroid/graphics/drawable/Drawable;

    move-result-object v15

    .line 925
    if-eqz v15, :cond_4

    .line 926
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v6, v15}, Lo/eky;->d(Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/drawable/Drawable;)V

    .line 931
    :cond_4
    :goto_2
    if-ne v14, v9, :cond_5

    .line 933
    goto :goto_3

    .line 935
    :cond_5
    move v9, v14

    .line 936
    goto/16 :goto_0

    .line 938
    :cond_6
    :goto_3
    return-void
.end method

.method public d(Landroid/graphics/Canvas;[Lo/mh;)V
    .locals 22

    .line 62
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->c:Lo/ejh;

    invoke-interface {v0}, Lo/ejh;->getLineData()Lo/ela;

    move-result-object v8

    .line 63
    if-eqz p2, :cond_0

    move-object/from16 v0, p2

    array-length v0, v0

    if-gtz v0, :cond_1

    .line 64
    :cond_0
    return-void

    .line 66
    :cond_1
    move-object/from16 v9, p2

    array-length v10, v9

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v10, :cond_9

    aget-object v12, v9, v11

    .line 68
    invoke-virtual {v8}, Lo/ela;->h()Ljava/util/List;

    move-result-object v13

    .line 70
    if-eqz v13, :cond_8

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 71
    goto/16 :goto_2

    .line 73
    :cond_2
    const/4 v14, 0x0

    .line 75
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v15

    .line 76
    move-object/from16 v0, p0

    invoke-virtual {v0, v13, v15}, Lo/eky;->d(Ljava/util/List;I)I

    move-result v16

    .line 79
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v16

    .line 81
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 82
    const/4 v0, 0x0

    invoke-interface {v13, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ekz;

    invoke-virtual {v12}, Lo/mh;->b()F

    move-result v1

    invoke-interface {v0, v1}, Lo/ekz;->e(F)Ljava/util/List;

    move-result-object v17

    .line 83
    if-eqz v17, :cond_8

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_2

    .line 85
    :cond_3
    move-object/from16 v0, v17

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/github/mikephil/charting/data/Entry;

    .line 87
    const/16 v19, 0x1

    .line 88
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/eky;->r:Z

    if-eqz v0, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->c:Lo/ejh;

    check-cast v0, Lo/eie;

    invoke-virtual {v0}, Lo/eie;->P()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 90
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v12}, Lo/mh;->b()F

    move-result v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/eky;->c:Lo/ejh;

    check-cast v2, Lo/eie;

    invoke-virtual {v2}, Lo/eie;->getManualReferenceLineValue()I

    move-result v2

    int-to-float v2, v2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    move-object/from16 v18, v0

    .line 91
    const/16 v19, 0x0

    .line 94
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->c:Lo/ejh;

    .line 95
    const/4 v1, 0x0

    invoke-interface {v13, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ekz;

    invoke-interface {v1}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    .line 94
    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    .line 95
    invoke-virtual/range {v18 .. v18}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    .line 96
    invoke-virtual/range {v18 .. v18}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/eky;->i:Lo/la;

    invoke-virtual {v3}, Lo/la;->d()F

    move-result v3

    mul-float/2addr v2, v3

    .line 95
    invoke-virtual {v0, v1, v2}, Lo/eim;->d(FF)Lo/nw;

    move-result-object v20

    .line 97
    move-object/from16 v0, v20

    iget-wide v0, v0, Lo/nw;->b:D

    double-to-float v0, v0

    move-object/from16 v1, v20

    iget-wide v1, v1, Lo/nw;->c:D

    double-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Lo/mh;->e(FF)V

    .line 99
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v20

    iget-wide v2, v2, Lo/nw;->b:D

    double-to-float v2, v2

    move-object/from16 v3, v20

    iget-wide v3, v3, Lo/nw;->c:D

    double-to-float v3, v3

    const/4 v4, 0x0

    invoke-interface {v13, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/mw;

    move/from16 v6, v19

    move/from16 v7, v16

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/eky;->e(Landroid/graphics/Canvas;FFLo/mw;ZZI)V

    .line 100
    goto/16 :goto_2

    .line 101
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->c:Lo/ejh;

    const/4 v1, 0x0

    invoke-interface {v13, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ekz;

    invoke-interface {v1}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual {v12}, Lo/mh;->b()F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/eim;->d(FF)Lo/nw;

    move-result-object v17

    .line 103
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    iget-wide v2, v2, Lo/nw;->b:D

    double-to-float v2, v2

    move-object/from16 v3, v17

    iget-wide v3, v3, Lo/nw;->c:D

    double-to-float v3, v3

    const/4 v4, 0x0

    invoke-interface {v13, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/mw;

    move/from16 v7, v16

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/eky;->e(Landroid/graphics/Canvas;FFLo/mw;ZZI)V

    .line 105
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :cond_6
    :goto_1
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lo/ekz;

    .line 106
    invoke-virtual {v12}, Lo/mh;->b()F

    move-result v0

    move-object/from16 v1, v19

    invoke-interface {v1, v0}, Lo/ekz;->e(F)Ljava/util/List;

    move-result-object v20

    .line 107
    if-eqz v20, :cond_6

    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_7

    goto :goto_1

    .line 108
    :cond_7
    move-object/from16 v0, v20

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lcom/github/mikephil/charting/data/Entry;

    .line 109
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eky;->c:Lo/ejh;

    invoke-interface/range {v19 .. v19}, Lo/ekz;->e()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    invoke-virtual/range {v21 .. v21}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/eky;->i:Lo/la;

    .line 110
    invoke-virtual {v3}, Lo/la;->d()F

    move-result v3

    mul-float/2addr v2, v3

    .line 109
    invoke-virtual {v0, v1, v2}, Lo/eim;->d(FF)Lo/nw;

    move-result-object v17

    .line 111
    move-object/from16 v0, v17

    iget-wide v0, v0, Lo/nw;->b:D

    double-to-float v0, v0

    move-object/from16 v1, v17

    iget-wide v1, v1, Lo/nw;->c:D

    double-to-float v1, v1

    invoke-virtual {v12, v0, v1}, Lo/mh;->e(FF)V

    .line 113
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    iget-wide v2, v2, Lo/nw;->b:D

    double-to-float v2, v2

    move-object/from16 v3, v17

    iget-wide v3, v3, Lo/nw;->c:D

    double-to-float v3, v3

    move-object/from16 v4, v19

    move/from16 v7, v16

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/eky;->e(Landroid/graphics/Canvas;FFLo/mw;ZZI)V

    .line 114
    goto/16 :goto_1

    .line 66
    :cond_8
    :goto_2
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 117
    :cond_9
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eib;>;)V"
        }
    .end annotation

    .line 1246
    const/4 v2, 0x0

    .line 1247
    iget-boolean v0, p0, Lo/eky;->s:Z

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 1248
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eky;->s:Z

    .line 1249
    const/4 v2, 0x1

    .line 1251
    :cond_0
    if-eqz p1, :cond_4

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lo/eky;->y:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 1253
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lo/eky;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    .line 1254
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eib;

    iget v0, v0, Lo/eib;->a:F

    iget-object v1, p0, Lo/eky;->y:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eib;

    iget v1, v1, Lo/eib;->a:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    .line 1255
    or-int/lit8 v2, v2, 0x1

    .line 1256
    goto :goto_1

    .line 1258
    :cond_1
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eib;

    iget v0, v0, Lo/eib;->b:F

    iget-object v1, p0, Lo/eky;->y:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eib;

    iget v1, v1, Lo/eib;->b:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_2

    .line 1259
    or-int/lit8 v2, v2, 0x1

    .line 1260
    goto :goto_1

    .line 1253
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1263
    :cond_3
    :goto_1
    if-nez v2, :cond_4

    .line 1264
    return-void

    .line 1268
    :cond_4
    iget-object v0, p0, Lo/eky;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1269
    iget-object v0, p0, Lo/eky;->y:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1271
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    check-cast v0, Lo/eie;

    invoke-virtual {v0}, Lo/eie;->invalidate()V

    .line 1272
    return-void
.end method

.method public d()Z
    .locals 2

    .line 1237
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    invoke-interface {v0}, Lo/ejh;->getLineData()Lo/ela;

    move-result-object v1

    .line 1238
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lo/ela;->h()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lo/ela;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected e(Landroid/graphics/Canvas;FFLo/mw;ZZI)V
    .locals 12

    .line 125
    iget-object v0, p0, Lo/eky;->k:Landroid/graphics/Paint;

    invoke-interface/range {p4 .. p4}, Lo/mw;->W()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 126
    iget-object v0, p0, Lo/eky;->k:Landroid/graphics/Paint;

    move/from16 v1, p7

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 129
    iget-object v0, p0, Lo/eky;->k:Landroid/graphics/Paint;

    invoke-interface/range {p4 .. p4}, Lo/mw;->Z()Landroid/graphics/DashPathEffect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 130
    invoke-interface/range {p4 .. p4}, Lo/mw;->T()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p5, :cond_0

    .line 132
    iget-object v0, p0, Lo/eky;->v:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 133
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    check-cast v0, Lo/ld;

    invoke-virtual {v0}, Lo/ld;->getMarker()Lo/lk;

    move-result-object v0

    check-cast v0, Lo/lr;

    invoke-virtual {v0}, Lo/lr;->getHeight()I

    move-result v0

    int-to-float v6, v0

    .line 134
    iget-object v0, p0, Lo/eky;->v:Landroid/graphics/Path;

    invoke-virtual {v0, p2, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 135
    iget-object v0, p0, Lo/eky;->v:Landroid/graphics/Path;

    iget-object v1, p0, Lo/eky;->l:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->i()F

    move-result v1

    iget-object v2, p0, Lo/eky;->c:Lo/ejh;

    invoke-interface {v2}, Lo/ejh;->getXAxis()Lo/ln;

    move-result-object v2

    invoke-virtual {v2}, Lo/ln;->y()F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 136
    iget-object v0, p0, Lo/eky;->v:Landroid/graphics/Path;

    iget-object v1, p0, Lo/eky;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 139
    :cond_0
    if-eqz p6, :cond_2

    .line 140
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v6

    .line 141
    const/high16 v0, 0x40c00000    # 6.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v7

    .line 144
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    instance-of v0, v0, Lo/ehv;

    if-eqz v0, :cond_1

    .line 145
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    invoke-interface {v0}, Lo/ejh;->getData()Lo/lt;

    move-result-object v0

    invoke-virtual {v0}, Lo/lt;->h()Ljava/util/List;

    move-result-object v8

    .line 146
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/ehn;

    if-eqz v0, :cond_1

    .line 147
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    check-cast v0, Lo/ehv;

    invoke-virtual {v0}, Lo/ehv;->getBarData()Lo/ehq;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 148
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    check-cast v0, Lo/ehv;

    invoke-virtual {v0}, Lo/ehv;->getBarData()Lo/ehq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ehq;->a()F

    move-result v9

    .line 149
    const/4 v0, 0x4

    new-array v10, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v10, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v10, v1

    const/4 v0, 0x2

    aput v9, v10, v0

    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v10, v1

    .line 150
    iget-object v0, p0, Lo/eky;->c:Lo/ejh;

    iget-object v1, p0, Lo/eky;->c:Lo/ejh;

    check-cast v1, Lo/ehv;

    invoke-virtual {v1}, Lo/ehv;->getAxisFirstParty()Lo/eit;

    move-result-object v1

    invoke-virtual {v1}, Lo/eit;->P()Lo/eit$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/ejh;->b(Lo/eit$b;)Lo/eim;

    move-result-object v11

    .line 151
    invoke-virtual {v11, v10}, Lo/nv;->e([F)V

    .line 152
    const/4 v0, 0x2

    aget v0, v10, v0

    const/4 v1, 0x0

    aget v1, v10, v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v6, v0, v1

    .line 153
    const/high16 v0, 0x3fc00000    # 1.5f

    mul-float v7, v6, v0

    .line 158
    :cond_1
    iget-object v0, p0, Lo/eky;->k:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 159
    iget-object v0, p0, Lo/eky;->k:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 160
    iget-object v0, p0, Lo/eky;->k:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    const/16 v2, 0x7f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v3, v4, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 161
    iget-object v0, p0, Lo/eky;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 162
    iget-object v0, p0, Lo/eky;->k:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 164
    iget-object v0, p0, Lo/eky;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, v7, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 167
    iget-object v0, p0, Lo/eky;->k:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 168
    iget-object v0, p0, Lo/eky;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 171
    iget-object v0, p0, Lo/eky;->k:Landroid/graphics/Paint;

    move-object/from16 v1, p4

    invoke-virtual {p0, v1}, Lo/eky;->a(Lo/mw;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 172
    iget-object v0, p0, Lo/eky;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, v6, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 175
    iget-object v0, p0, Lo/eky;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 177
    :cond_2
    return-void
.end method
