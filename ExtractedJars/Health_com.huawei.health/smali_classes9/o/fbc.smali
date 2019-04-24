.class public Lo/fbc;
.super Lo/eld;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fbc$a;,
        Lo/fbc$e;,
        Lo/fbc$b;
    }
.end annotation


# static fields
.field private static d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 28
    const/4 v1, 0x5

    .line 29
    sput v1, Lo/fbc;->d:I

    .line 30
    return-void
.end method

.method public constructor <init>(Lo/eie;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lo/eld;-><init>(Lo/eie;)V

    .line 37
    return-void
.end method

.method private b(Lo/elb;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/elb;Ljava/util/List<Lo/elg;>;)V"
        }
    .end annotation

    .line 403
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 404
    const/4 v3, 0x0

    .line 405
    add-int/lit8 v0, v2, -0x1

    if-ltz v0, :cond_0

    add-int/lit8 v0, v2, -0x1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 406
    add-int/lit8 v0, v2, -0x1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fbc$b;

    .line 409
    :cond_0
    const/4 v4, 0x0

    .line 410
    add-int/lit8 v0, v2, 0x1

    if-ltz v0, :cond_1

    add-int/lit8 v0, v2, 0x1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 411
    add-int/lit8 v0, v2, 0x1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fbc$b;

    .line 414
    :cond_1
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fbc$b;

    .line 417
    if-eqz v3, :cond_2

    .line 418
    invoke-direct {p0, v3, v5}, Lo/fbc;->c(Lo/fbc$b;Lo/fbc$b;)Z

    move-result v0

    invoke-virtual {v5, v0}, Lo/fbc$b;->d(Z)V

    .line 421
    :cond_2
    if-eqz v4, :cond_3

    .line 422
    invoke-direct {p0, v5, v4}, Lo/fbc;->c(Lo/fbc$b;Lo/fbc$b;)Z

    move-result v0

    invoke-virtual {v5, v0}, Lo/fbc$b;->a(Z)V

    .line 403
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 425
    :cond_4
    return-void
.end method

.method private c(Lo/fbc$b;Lo/fbc$b;)Z
    .locals 4

    .line 428
    invoke-virtual {p1}, Lo/fbc$b;->k()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v2

    .line 429
    invoke-virtual {p2}, Lo/fbc$b;->i()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v3

    .line 431
    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v3}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    float-to-int v1, v1

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/16 v1, 0x23

    if-le v0, v1, :cond_0

    .line 432
    const/4 v0, 0x0

    return v0

    .line 434
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private e(Lo/fbc$a;I)Z
    .locals 9

    .line 153
    invoke-static {p1}, Lo/fbc$a;->a(Lo/fbc$a;)V

    .line 155
    const/high16 v4, -0x40800000    # -1.0f

    .line 158
    const/4 v6, 0x0

    .line 159
    const/4 v7, 0x0

    .line 161
    :goto_0
    invoke-virtual {p1}, Lo/fbc$a;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 162
    invoke-virtual {p1}, Lo/fbc$a;->c()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v8

    .line 164
    if-nez v8, :cond_0

    .line 165
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "report error,is that OOM"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 168
    :cond_0
    invoke-virtual {v8}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    float-to-int v0, v0

    int-to-float v5, v0

    .line 170
    const-string v0, "HwHRDatasContainer"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataSetsByBoundsIterator.next,entry x:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " y:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    const/high16 v0, -0x40800000    # -1.0f

    invoke-static {v4, v0}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-nez v0, :cond_1

    .line 173
    move v4, v5

    .line 174
    goto :goto_0

    .line 177
    :cond_1
    sub-float v0, v5, v4

    int-to-float v1, p2

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-gtz v0, :cond_2

    .line 178
    const-string v0, "HwHRDatasContainer"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "(think newData)currentUnixTime - lastUnixTime :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-float v2, v5, v4

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 181
    :cond_2
    const-string v0, "HwHRDatasContainer"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "(think oldData)currentUnixTime - lastUnixTime :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-float v2, v5, v4

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    add-int/lit8 v7, v7, 0x1

    .line 185
    :goto_1
    move v4, v5

    .line 186
    goto/16 :goto_0

    .line 188
    :cond_3
    if-lt v6, v7, :cond_4

    .line 189
    const/4 v0, 0x1

    return v0

    .line 191
    :cond_4
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public e(Lo/elb;)V
    .locals 17

    .line 43
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fbc;->b:Lo/eie;

    instance-of v0, v0, Lo/eih;

    if-nez v0, :cond_0

    .line 44
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-super {v0, v1}, Lo/eld;->e(Lo/elb;)V

    .line 45
    return-void

    .line 48
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fbc;->b:Lo/eie;

    move-object v4, v0

    check-cast v4, Lo/eih;

    .line 51
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fbc;->e:Lo/eld$b;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fbc;->b:Lo/eie;

    move-object/from16 v2, p1

    invoke-virtual {v0, v1, v2}, Lo/eld$b;->d(Lo/mn;Lo/elb;)V

    .line 52
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/fbc;->a:Lo/elb;

    .line 60
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fbc;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 64
    invoke-virtual {v4}, Lo/eih;->getLowestVisibleX()F

    move-result v0

    invoke-virtual {v4}, Lo/eih;->getHighestVisibleX()F

    move-result v1

    add-float/2addr v0, v1

    float-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x2

    div-long v6, v0, v2

    .line 66
    invoke-static {v6, v7}, Lo/ekg;->a(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v8, v0

    .line 72
    new-instance v9, Lo/fbc$e;

    sget v0, Lo/fbc;->d:I

    const v1, 0x7fffffff

    invoke-direct {v9, v8, v1, v0}, Lo/fbc$e;-><init>(III)V

    .line 73
    new-instance v10, Lo/fbc$a;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fbc;->e:Lo/eld$b;

    move-object/from16 v1, p1

    invoke-direct {v10, v1, v0}, Lo/fbc$a;-><init>(Lo/elb;Lo/eld$b;)V

    .line 76
    move-object/from16 v0, p0

    const/4 v1, 0x2

    invoke-direct {v0, v10, v1}, Lo/fbc;->e(Lo/fbc$a;I)Z

    move-result v11

    .line 77
    invoke-static {v10}, Lo/fbc$a;->a(Lo/fbc$a;)V

    .line 79
    if-nez v11, :cond_1

    .line 81
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-super {v0, v1}, Lo/eld;->e(Lo/elb;)V

    .line 82
    return-void

    .line 85
    :cond_1
    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 88
    :goto_0
    invoke-virtual {v9}, Lo/fbc$e;->b()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 89
    invoke-virtual {v9}, Lo/fbc$e;->d()Z

    .line 91
    invoke-virtual {v9}, Lo/fbc$e;->e()I

    move-result v14

    .line 92
    invoke-virtual {v9}, Lo/fbc$e;->a()I

    move-result v15

    .line 95
    const/16 v16, 0x0

    .line 97
    :goto_1
    invoke-virtual {v10}, Lo/fbc$a;->d()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 98
    invoke-virtual {v10}, Lo/fbc$a;->e()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v5

    .line 99
    if-nez v5, :cond_2

    .line 100
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "report error,is that OOM"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 102
    :cond_2
    invoke-virtual {v5}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    int-to-float v1, v14

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_5

    invoke-virtual {v5}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    int-to-float v1, v15

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_3

    .line 104
    goto :goto_2

    .line 107
    :cond_3
    invoke-virtual {v10}, Lo/fbc$a;->c()Lcom/github/mikephil/charting/data/Entry;

    .line 109
    if-nez v16, :cond_4

    .line 110
    new-instance v0, Lo/fbc$b;

    move v1, v14

    move v2, v15

    invoke-direct {v0, v1, v2}, Lo/fbc$b;-><init>(II)V

    move-object/from16 v16, v0

    .line 111
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fbc;->c:Ljava/util/List;

    move-object/from16 v1, v16

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    :cond_4
    move-object/from16 v0, v16

    invoke-virtual {v0, v5}, Lo/fbc$b;->e(Lcom/github/mikephil/charting/data/Entry;)V

    goto :goto_1

    .line 117
    :cond_5
    :goto_2
    if-eqz v16, :cond_a

    .line 118
    if-nez v12, :cond_6

    .line 119
    move-object/from16 v12, v16

    goto :goto_3

    .line 120
    :cond_6
    invoke-virtual/range {v16 .. v16}, Lo/fbc$b;->f()F

    move-result v0

    invoke-virtual {v12}, Lo/fbc$b;->f()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    .line 121
    move-object/from16 v12, v16

    .line 124
    :cond_7
    :goto_3
    if-nez v13, :cond_8

    .line 125
    move-object/from16 v13, v16

    goto :goto_4

    .line 126
    :cond_8
    invoke-virtual/range {v16 .. v16}, Lo/fbc$b;->n()F

    move-result v0

    invoke-virtual {v13}, Lo/fbc$b;->n()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_9

    .line 127
    move-object/from16 v13, v16

    .line 130
    :cond_9
    :goto_4
    invoke-virtual/range {v16 .. v16}, Lo/fbc$b;->h()V

    .line 134
    :cond_a
    invoke-virtual {v10}, Lo/fbc$a;->d()Z

    move-result v0

    if-nez v0, :cond_b

    .line 135
    goto :goto_5

    .line 137
    :cond_b
    goto/16 :goto_0

    .line 139
    :cond_c
    :goto_5
    if-eqz v13, :cond_d

    .line 140
    invoke-virtual {v13}, Lo/fbc$b;->l()V

    .line 144
    :cond_d
    if-eqz v12, :cond_e

    .line 145
    invoke-virtual {v12}, Lo/fbc$b;->m()V

    .line 149
    :cond_e
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fbc;->c:Ljava/util/List;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v1, v2, v0}, Lo/fbc;->b(Lo/elb;Ljava/util/List;)V

    .line 150
    return-void
.end method
