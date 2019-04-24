.class public Lo/ele;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ele$c;,
        Lo/ele$e;
    }
.end annotation


# instance fields
.field protected c:Lo/ele$e;

.field private d:Lo/nv;

.field protected e:Lo/elh;


# direct methods
.method public constructor <init>(Lo/elh;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Lo/ele$e;

    invoke-direct {v0, p0}, Lo/ele$e;-><init>(Lo/ele;)V

    iput-object v0, p0, Lo/ele;->c:Lo/ele$e;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ele;->d:Lo/nv;

    .line 31
    iput-object p1, p0, Lo/ele;->e:Lo/elh;

    .line 32
    return-void
.end method

.method static synthetic a(Lo/ele;)Z
    .locals 1

    .line 24
    invoke-direct {p0}, Lo/ele;->b()Z

    move-result v0

    return v0
.end method

.method private b()Z
    .locals 2

    .line 471
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

.method private b(Lo/nv;)Z
    .locals 5

    .line 456
    iget-object v0, p0, Lo/ele;->e:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->d()Lo/oa;

    move-result-object v2

    .line 457
    const/4 v0, 0x2

    new-array v3, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v3, v1

    invoke-virtual {v2}, Lo/oa;->e()F

    move-result v0

    const/4 v1, 0x1

    aput v0, v3, v1

    .line 458
    const/4 v0, 0x2

    new-array v4, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v4, v1

    invoke-virtual {v2}, Lo/oa;->i()F

    move-result v0

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 460
    invoke-virtual {p1, v3}, Lo/nv;->d([F)V

    .line 461
    invoke-virtual {p1, v4}, Lo/nv;->d([F)V

    .line 463
    const/4 v0, 0x1

    aget v0, v4, v0

    const/4 v1, 0x1

    aget v1, v3, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 465
    const/4 v0, 0x0

    return v0

    .line 467
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic c(Lo/ele;)Lo/nv;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/ele;->d:Lo/nv;

    return-object v0
.end method

.method private d(Landroid/graphics/Path;Lo/elg;Lo/elg;)V
    .locals 3

    .line 175
    iget-object v0, p0, Lo/ele;->e:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->b()Lo/elh$c;

    move-result-object v2

    .line 176
    invoke-interface {v2}, Lo/elh$c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 177
    invoke-virtual {p3}, Lo/elg;->c()F

    move-result v0

    invoke-virtual {p2}, Lo/elg;->a()F

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 178
    invoke-virtual {p3}, Lo/elg;->c()F

    move-result v0

    invoke-virtual {p3}, Lo/elg;->a()F

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_0

    .line 180
    :cond_0
    invoke-virtual {p3}, Lo/elg;->c()F

    move-result v0

    invoke-virtual {p3}, Lo/elg;->a()F

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 182
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/ele;Lo/nv;)Z
    .locals 1

    .line 24
    invoke-direct {p0, p1}, Lo/ele;->b(Lo/nv;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public b(Landroid/graphics/Canvas;Lo/ejs;Lo/nv;)V
    .locals 19

    .line 38
    move-object/from16 v0, p3

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/ele;->d:Lo/nv;

    .line 48
    invoke-interface/range {p2 .. p2}, Lo/ejs;->c()Ljava/util/List;

    move-result-object v6

    .line 50
    invoke-interface/range {p2 .. p2}, Lo/ejs;->d()Lo/eie;

    move-result-object v7

    .line 51
    invoke-virtual {v7}, Lo/eie;->getLowestVisibleX()F

    move-result v8

    .line 52
    invoke-virtual {v7}, Lo/eie;->getHighestVisibleX()F

    move-result v9

    .line 55
    new-instance v10, Landroid/graphics/Path;

    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 56
    const/4 v11, 0x0

    .line 58
    const/4 v12, 0x0

    .line 60
    const/4 v14, -0x1

    const/4 v15, -0x1

    .line 62
    const/16 v16, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v16

    if-ge v1, v0, :cond_2

    .line 64
    move/from16 v0, v16

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lo/elg;

    .line 66
    invoke-virtual/range {v17 .. v17}, Lo/elg;->c()F

    move-result v0

    cmpl-float v0, v0, v8

    if-ltz v0, :cond_1

    invoke-virtual/range {v17 .. v17}, Lo/elg;->c()F

    move-result v0

    cmpg-float v0, v0, v9

    if-gtz v0, :cond_1

    .line 68
    const/4 v0, -0x1

    if-ne v14, v0, :cond_0

    .line 69
    move/from16 v14, v16

    .line 71
    :cond_0
    add-int/lit8 v15, v16, 0x1

    .line 62
    :cond_1
    add-int/lit8 v16, v16, 0x1

    goto :goto_0

    .line 75
    :cond_2
    const/4 v0, -0x1

    if-eq v14, v0, :cond_3

    const/4 v0, -0x1

    if-ne v15, v0, :cond_4

    .line 76
    :cond_3
    return-void

    .line 79
    :cond_4
    add-int/lit8 v0, v14, -0x1

    if-ltz v0, :cond_5

    .line 81
    add-int/lit8 v14, v14, -0x1

    .line 84
    :cond_5
    add-int/lit8 v0, v15, 0x1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_6

    .line 85
    add-int/lit8 v15, v15, 0x1

    .line 88
    :cond_6
    move/from16 v16, v14

    :goto_1
    move/from16 v0, v16

    if-ge v0, v15, :cond_e

    .line 90
    move/from16 v0, v16

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lo/elg;

    .line 92
    invoke-virtual/range {v17 .. v17}, Lo/elg;->d()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 93
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ele;->c:Lo/ele$e;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/ele;->e:Lo/elh;

    move-object/from16 v2, p1

    move-object/from16 v3, v17

    invoke-virtual {v0, v2, v3, v1}, Lo/ele$e;->c(Landroid/graphics/Canvas;Lo/elg;Lo/elh;)V

    .line 94
    goto/16 :goto_3

    .line 98
    :cond_7
    invoke-virtual {v10}, Landroid/graphics/Path;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual/range {v17 .. v17}, Lo/elg;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 100
    add-int/lit8 v0, v16, -0x1

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lo/elg;

    .line 101
    invoke-virtual/range {v18 .. v18}, Lo/elg;->c()F

    move-result v0

    invoke-virtual/range {v18 .. v18}, Lo/elg;->a()F

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 102
    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, v17

    invoke-direct {v0, v10, v1, v2}, Lo/ele;->d(Landroid/graphics/Path;Lo/elg;Lo/elg;)V

    .line 104
    move-object/from16 v12, v18

    .line 105
    move-object/from16 v13, v17

    .line 107
    goto :goto_2

    :cond_8
    invoke-virtual {v10}, Landroid/graphics/Path;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual/range {v17 .. v17}, Lo/elg;->e()Z

    move-result v0

    if-nez v0, :cond_9

    .line 108
    invoke-virtual/range {v17 .. v17}, Lo/elg;->c()F

    move-result v0

    invoke-virtual/range {v17 .. v17}, Lo/elg;->a()F

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 110
    move-object/from16 v12, v17

    .line 111
    move-object/from16 v13, v17

    goto :goto_2

    .line 114
    :cond_9
    add-int/lit8 v0, v16, -0x1

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lo/elg;

    .line 115
    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, v17

    invoke-direct {v0, v10, v1, v2}, Lo/ele;->d(Landroid/graphics/Path;Lo/elg;Lo/elg;)V

    .line 116
    move-object/from16 v13, v17

    .line 121
    :goto_2
    add-int/lit8 v11, v11, 0x1

    .line 123
    invoke-virtual {v10}, Landroid/graphics/Path;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 124
    goto/16 :goto_3

    .line 130
    :cond_a
    add-int/lit8 v0, v15, -0x1

    move/from16 v1, v16

    if-ne v1, v0, :cond_b

    if-eqz v12, :cond_b

    .line 133
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ele;->c:Lo/ele$e;

    move-object/from16 v1, p1

    move-object v2, v12

    move-object v3, v10

    move-object v4, v13

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/ele;->e:Lo/elh;

    invoke-virtual/range {v0 .. v5}, Lo/ele$e;->e(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;Lo/elh;)V

    .line 134
    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 135
    const/4 v11, 0x0

    .line 136
    const/4 v12, 0x0

    .line 137
    goto :goto_3

    .line 141
    :cond_b
    add-int/lit8 v0, v16, 0x1

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lo/elg;

    .line 144
    invoke-virtual/range {v18 .. v18}, Lo/elg;->e()Z

    move-result v0

    if-nez v0, :cond_c

    if-eqz v12, :cond_c

    .line 146
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ele;->c:Lo/ele$e;

    move-object/from16 v1, p1

    move-object v2, v12

    move-object v3, v10

    move-object v4, v13

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/ele;->e:Lo/elh;

    invoke-virtual/range {v0 .. v5}, Lo/ele$e;->e(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;Lo/elh;)V

    .line 147
    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 148
    const/4 v11, 0x0

    .line 149
    const/4 v12, 0x0

    .line 150
    goto :goto_3

    .line 154
    :cond_c
    const/16 v0, 0x80

    if-lt v11, v0, :cond_d

    if-eqz v12, :cond_d

    .line 155
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ele;->c:Lo/ele$e;

    move-object/from16 v1, p1

    move-object v2, v12

    move-object v3, v10

    move-object v4, v13

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/ele;->e:Lo/elh;

    invoke-virtual/range {v0 .. v5}, Lo/ele$e;->e(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;Lo/elh;)V

    .line 156
    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 157
    const/4 v11, 0x0

    .line 158
    const/4 v12, 0x0

    .line 88
    .line 159
    :cond_d
    :goto_3
    add-int/lit8 v16, v16, 0x1

    goto/16 :goto_1

    .line 164
    :cond_e
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ele;->e:Lo/elh;

    invoke-virtual {v0}, Lo/elh;->b()Lo/elh$c;

    move-result-object v0

    invoke-interface {v0}, Lo/elh$c;->k()Lo/elh$f;

    move-result-object v16

    .line 166
    move-object/from16 v0, v16

    instance-of v0, v0, Lo/elh$d;

    if-eqz v0, :cond_f

    .line 167
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_4
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lo/elg;

    .line 168
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ele;->c:Lo/ele$e;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/ele;->e:Lo/elh;

    move-object/from16 v2, p1

    move-object/from16 v3, v18

    invoke-virtual {v0, v2, v3, v1}, Lo/ele$e;->c(Landroid/graphics/Canvas;Lo/elg;Lo/elh;)V

    .line 169
    goto :goto_4

    .line 172
    :cond_f
    return-void
.end method
