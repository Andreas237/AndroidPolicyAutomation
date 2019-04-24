.class public Lo/fax;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "DrawAllocation"
    }
.end annotation


# instance fields
.field private B:F

.field private C:F

.field private D:F

.field private a:Landroid/content/Context;

.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private f:F

.field private g:F

.field private h:F

.field private i:F

.field private j:F

.field private k:F

.field private l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/faz;>;"
        }
    .end annotation
.end field

.field private m:Lo/ext;

.field private n:F

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private p:F

.field private q:F

.field private r:Landroid/graphics/Paint;

.field private s:Landroid/graphics/Paint;

.field private t:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/fav;>;"
        }
    .end annotation
.end field

.field private u:Z

.field private v:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/fav;>;"
        }
    .end annotation
.end field

.field private w:Landroid/graphics/RectF;

.field private x:Landroid/graphics/Paint;

.field private y:F

.field private z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 61
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lo/fax;->k:F

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lo/fax;->g:F

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/fax;->f:F

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lo/fax;->n:F

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/fax;->p:F

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fax;->l:Ljava/util/ArrayList;

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fax;->o:Ljava/util/List;

    .line 102
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fax;->u:Z

    .line 103
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fax;->r:Landroid/graphics/Paint;

    .line 104
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fax;->s:Landroid/graphics/Paint;

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fax;->t:Ljava/util/ArrayList;

    .line 259
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fax;->v:Ljava/util/ArrayList;

    .line 504
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fax;->x:Landroid/graphics/Paint;

    .line 506
    const/high16 v0, 0x41b80000    # 23.0f

    iput v0, p0, Lo/fax;->y:F

    .line 507
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lo/fax;->z:F

    .line 508
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/fax;->w:Landroid/graphics/RectF;

    .line 509
    const/4 v0, 0x0

    iput v0, p0, Lo/fax;->j:F

    .line 510
    const/4 v0, 0x0

    iput v0, p0, Lo/fax;->D:F

    .line 511
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lo/fax;->C:F

    .line 512
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lo/fax;->B:F

    .line 62
    iput-object p1, p0, Lo/fax;->a:Landroid/content/Context;

    .line 63
    return-void
.end method

.method private a(F)F
    .locals 4

    .line 256
    iget v0, p0, Lo/fax;->g:F

    iget v1, p0, Lo/fax;->e:F

    iget v2, p0, Lo/fax;->g:F

    sub-float/2addr v1, v2

    const/high16 v2, 0x435c0000    # 220.0f

    div-float v2, p1, v2

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v2, v3, v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    return v0
.end method

.method private a(FF)F
    .locals 1

    .line 215
    cmpl-float v0, p2, p1

    if-ltz v0, :cond_0

    .line 216
    return p1

    .line 218
    :cond_0
    return p2
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 20

    .line 113
    const/4 v6, 0x0

    .line 114
    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 115
    const/4 v9, 0x0

    .line 117
    move-object/from16 v0, p0

    iget v0, v0, Lo/fax;->d:F

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fax;->l:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/fax;->q:F

    .line 118
    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 119
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 120
    const/4 v12, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v12, v0, :cond_5

    .line 121
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/faz;

    .line 122
    invoke-virtual {v9}, Lo/faz;->e()F

    move-result v13

    .line 123
    invoke-virtual {v9}, Lo/faz;->a()F

    move-result v14

    .line 125
    move-object/from16 v0, p0

    iget v0, v0, Lo/fax;->k:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/fax;->q:F

    int-to-float v2, v12

    mul-float/2addr v1, v2

    add-float v6, v0, v1

    .line 126
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    move-object/from16 v0, p0

    iget v0, v0, Lo/fax;->n:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/fax;->d:F

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fax;->q:F

    int-to-float v2, v12

    mul-float/2addr v1, v2

    sub-float v6, v0, v1

    .line 129
    :cond_0
    const/4 v0, 0x0

    cmpl-float v0, v0, v13

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    cmpl-float v0, v0, v14

    if-eqz v0, :cond_1

    cmpl-float v0, v13, v14

    if-nez v0, :cond_2

    .line 131
    :cond_1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v13, v14, v6}, Lo/fax;->e(Landroid/graphics/Canvas;FFF)V

    .line 132
    goto/16 :goto_2

    .line 135
    :cond_2
    const/4 v15, 0x0

    .line 136
    cmpg-float v0, v13, v14

    if-gez v0, :cond_3

    .line 137
    move v15, v13

    .line 138
    move v13, v14

    .line 139
    move v14, v15

    .line 140
    invoke-virtual {v9, v13}, Lo/faz;->d(F)V

    .line 141
    invoke-virtual {v9, v14}, Lo/faz;->c(F)V

    .line 143
    :cond_3
    move-object/from16 v0, p0

    invoke-direct {v0, v13}, Lo/fax;->a(F)F

    move-result v7

    .line 144
    move-object/from16 v0, p0

    invoke-direct {v0, v14}, Lo/fax;->a(F)F

    move-result v8

    .line 147
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->s:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 148
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->s:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    invoke-direct {v1, v13}, Lo/fax;->e(F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 149
    move-object/from16 v0, p0

    iget v0, v0, Lo/fax;->i:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fax;->s:Landroid/graphics/Paint;

    move-object/from16 v2, p1

    invoke-virtual {v2, v6, v7, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 151
    new-instance v10, Lo/fav;

    invoke-direct {v10}, Lo/fav;-><init>()V

    .line 152
    const/4 v0, 0x1

    iput v0, v10, Lo/fav;->c:I

    .line 153
    new-instance v0, Landroid/graphics/PointF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fax;->i:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v1, v7, v1

    move-object/from16 v2, p0

    iget v2, v2, Lo/fax;->z:F

    sub-float/2addr v1, v2

    invoke-direct {v0, v6, v1}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, v10, Lo/fav;->b:Landroid/graphics/PointF;

    .line 154
    float-to-double v0, v13

    iput-wide v0, v10, Lo/fav;->a:D

    .line 155
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    float-to-double v1, v13

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fax;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v10, Lo/fav;->e:Ljava/lang/String;

    .line 156
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fax;->h:F

    sub-float v1, v6, v1

    move-object/from16 v2, p0

    iget v2, v2, Lo/fax;->h:F

    sub-float v2, v7, v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fax;->h:F

    add-float/2addr v3, v6

    move-object/from16 v4, p0

    iget v4, v4, Lo/fax;->h:F

    add-float/2addr v4, v7

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, v10, Lo/fav;->d:Landroid/graphics/RectF;

    .line 157
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->s:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    invoke-direct {v1, v14}, Lo/fax;->e(F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 160
    move-object/from16 v0, p0

    iget v0, v0, Lo/fax;->i:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fax;->s:Landroid/graphics/Paint;

    move-object/from16 v2, p1

    invoke-virtual {v2, v6, v8, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 162
    new-instance v11, Lo/fav;

    invoke-direct {v11}, Lo/fav;-><init>()V

    .line 163
    const/4 v0, 0x2

    iput v0, v11, Lo/fav;->c:I

    .line 164
    new-instance v0, Landroid/graphics/PointF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fax;->i:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v1, v8

    move-object/from16 v2, p0

    iget v2, v2, Lo/fax;->z:F

    add-float/2addr v1, v2

    invoke-direct {v0, v6, v1}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, v11, Lo/fav;->b:Landroid/graphics/PointF;

    .line 165
    float-to-double v0, v14

    iput-wide v0, v11, Lo/fav;->a:D

    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    float-to-double v1, v14

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fax;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v11, Lo/fav;->e:Ljava/lang/String;

    .line 167
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fax;->h:F

    sub-float v1, v6, v1

    move-object/from16 v2, p0

    iget v2, v2, Lo/fax;->h:F

    sub-float v2, v8, v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fax;->h:F

    add-float/2addr v3, v6

    move-object/from16 v4, p0

    iget v4, v4, Lo/fax;->h:F

    add-float/2addr v4, v8

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, v11, Lo/fav;->d:Landroid/graphics/RectF;

    .line 168
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    move/from16 v16, v14

    .line 171
    move-object/from16 v0, p0

    invoke-direct {v0, v13, v14}, Lo/fax;->c(FF)F

    move-result v17

    .line 172
    :goto_1
    cmpg-float v0, v16, v13

    if-gtz v0, :cond_4

    .line 174
    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-direct {v0, v1}, Lo/fax;->a(F)F

    move-result v18

    .line 175
    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-direct {v0, v1}, Lo/fax;->a(F)F

    move-result v19

    .line 176
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->r:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    move/from16 v2, v16

    invoke-direct {v1, v2}, Lo/fax;->e(F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 177
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fax;->i:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v1, v6, v1

    move/from16 v2, v19

    move-object/from16 v3, p0

    iget v3, v3, Lo/fax;->i:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v3, v6

    move/from16 v4, v18

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/fax;->r:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 178
    move/from16 v16, v17

    .line 179
    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-direct {v0, v13, v1}, Lo/fax;->c(FF)F

    move-result v17

    .line 180
    goto :goto_1

    .line 120
    :cond_4
    :goto_2
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 182
    :cond_5
    return-void
.end method

.method private b()V
    .locals 10

    .line 266
    iget-object v0, p0, Lo/fax;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 268
    iget-object v0, p0, Lo/fax;->l:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lo/fax;->e(Ljava/util/ArrayList;)Lo/faz;

    move-result-object v5

    .line 269
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    iget v0, v5, Lo/faz;->d:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 270
    iget v0, p0, Lo/fax;->k:F

    iget v1, p0, Lo/fax;->q:F

    iget v2, v5, Lo/faz;->c:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v6, v0, v1

    .line 271
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 272
    iget v0, p0, Lo/fax;->b:F

    sub-float v6, v0, v6

    .line 275
    :cond_0
    iget v0, v5, Lo/faz;->d:F

    invoke-direct {p0, v0}, Lo/fax;->a(F)F

    move-result v7

    .line 276
    new-instance v8, Lo/fav;

    invoke-direct {v8}, Lo/fav;-><init>()V

    .line 277
    new-instance v0, Landroid/graphics/PointF;

    iget v1, p0, Lo/fax;->i:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v1, v7, v1

    iget v2, p0, Lo/fax;->z:F

    sub-float/2addr v1, v2

    invoke-direct {v0, v6, v1}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, v8, Lo/fav;->b:Landroid/graphics/PointF;

    .line 278
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, v5, Lo/faz;->d:F

    float-to-int v1, v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fax;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v8, Lo/fav;->e:Ljava/lang/String;

    .line 279
    const/4 v0, 0x1

    iput v0, v8, Lo/fav;->c:I

    .line 280
    iget v0, v5, Lo/faz;->d:F

    float-to-double v0, v0

    iput-wide v0, v8, Lo/fav;->a:D

    .line 281
    iget-object v0, p0, Lo/fax;->v:Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    goto :goto_0

    .line 283
    :cond_1
    const-string v0, "HeartRateDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addMaxMinAnchor(),max is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    :goto_0
    iget-object v0, p0, Lo/fax;->l:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lo/fax;->c(Ljava/util/ArrayList;)Lo/faz;

    move-result-object v6

    .line 288
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 289
    iget v0, p0, Lo/fax;->k:F

    iget v1, p0, Lo/fax;->q:F

    iget v2, v6, Lo/faz;->c:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v7, v0, v1

    .line 290
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 291
    iget v0, p0, Lo/fax;->b:F

    sub-float v7, v0, v7

    .line 293
    :cond_2
    iget v0, v6, Lo/faz;->b:F

    invoke-direct {p0, v0}, Lo/fax;->a(F)F

    move-result v8

    .line 295
    new-instance v9, Lo/fav;

    invoke-direct {v9}, Lo/fav;-><init>()V

    .line 296
    new-instance v0, Landroid/graphics/PointF;

    iget v1, p0, Lo/fax;->i:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v1, v8

    iget v2, p0, Lo/fax;->z:F

    add-float/2addr v1, v2

    invoke-direct {v0, v7, v1}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, v9, Lo/fav;->b:Landroid/graphics/PointF;

    .line 297
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, v6, Lo/faz;->b:F

    float-to-int v1, v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fax;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v9, Lo/fav;->e:Ljava/lang/String;

    .line 298
    const/4 v0, 0x2

    iput v0, v9, Lo/fav;->c:I

    .line 299
    iget v0, v6, Lo/faz;->b:F

    float-to-double v0, v0

    iput-wide v0, v9, Lo/fav;->a:D

    .line 300
    iget-object v0, p0, Lo/fax;->v:Ljava/util/ArrayList;

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 301
    goto :goto_1

    .line 302
    :cond_3
    const-string v0, "HeartRateDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addMaxMinAnchor(),min is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    :goto_1
    return-void
.end method

.method private b(FF)V
    .locals 7

    .line 659
    const/4 v4, 0x0

    .line 660
    const/4 v5, 0x0

    .line 661
    iget-object v0, p0, Lo/fax;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 663
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lo/fax;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 664
    iget-object v0, p0, Lo/fax;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fav;

    .line 665
    iget-object v5, v4, Lo/fav;->d:Landroid/graphics/RectF;

    .line 666
    const-string v0, "HeartRateDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "triggerClick x = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " y = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  data.rect = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lo/fav;->d:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    const-string v0, "HeartRateDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isPointInRect = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-direct {p0, p1, p2, v5}, Lo/fax;->d(FFLandroid/graphics/RectF;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 669
    invoke-direct {p0, p1, p2, v5}, Lo/fax;->d(FFLandroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 670
    iget-object v0, p0, Lo/fax;->v:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 671
    goto :goto_1

    .line 663
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 675
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lo/fax;->invalidate()V

    .line 676
    return-void
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 7

    .line 446
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 447
    iget-object v0, p0, Lo/fax;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->hw_steps_share_line_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 448
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 449
    move-object v0, p1

    iget v2, p0, Lo/fax;->e:F

    iget v3, p0, Lo/fax;->b:F

    iget v4, p0, Lo/fax;->e:F

    move-object v5, v6

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 450
    return-void
.end method

.method private b(Landroid/graphics/Canvas;Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/graphics/Canvas;Ljava/util/ArrayList<Lo/fav;>;)V"
        }
    .end annotation

    .line 519
    iget-object v0, p0, Lo/fax;->x:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 520
    iget-object v0, p0, Lo/fax;->x:Landroid/graphics/Paint;

    const/4 v1, 0x1

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 522
    const/4 v4, 0x0

    .line 523
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 524
    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fav;

    .line 525
    iget-wide v0, v4, Lo/fav;->a:D

    const-wide/16 v2, 0x0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    .line 527
    goto :goto_1

    .line 529
    :cond_0
    invoke-direct {p0, v4, p1}, Lo/fax;->c(Lo/fav;Landroid/graphics/Canvas;)V

    .line 523
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 531
    :cond_1
    return-void
.end method

.method private c(FF)F
    .locals 1

    .line 191
    cmpl-float v0, p1, p2

    if-nez v0, :cond_0

    .line 192
    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr v0, p1

    return v0

    .line 194
    :cond_0
    iget-object v0, p0, Lo/fax;->m:Lo/ext;

    iget v0, v0, Lo/ext;->d:F

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_1

    .line 195
    return p1

    .line 196
    :cond_1
    iget-object v0, p0, Lo/fax;->m:Lo/ext;

    iget v0, v0, Lo/ext;->e:F

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_2

    .line 197
    iget-object v0, p0, Lo/fax;->m:Lo/ext;

    iget v0, v0, Lo/ext;->d:F

    invoke-direct {p0, p1, v0}, Lo/fax;->a(FF)F

    move-result v0

    return v0

    .line 198
    :cond_2
    iget-object v0, p0, Lo/fax;->m:Lo/ext;

    iget v0, v0, Lo/ext;->a:F

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_3

    .line 199
    iget-object v0, p0, Lo/fax;->m:Lo/ext;

    iget v0, v0, Lo/ext;->e:F

    invoke-direct {p0, p1, v0}, Lo/fax;->a(FF)F

    move-result v0

    return v0

    .line 200
    :cond_3
    iget-object v0, p0, Lo/fax;->m:Lo/ext;

    iget v0, v0, Lo/ext;->f:F

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_4

    .line 201
    iget-object v0, p0, Lo/fax;->m:Lo/ext;

    iget v0, v0, Lo/ext;->a:F

    invoke-direct {p0, p1, v0}, Lo/fax;->a(FF)F

    move-result v0

    return v0

    .line 202
    :cond_4
    iget-object v0, p0, Lo/fax;->m:Lo/ext;

    iget v0, v0, Lo/ext;->c:F

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_5

    .line 203
    iget-object v0, p0, Lo/fax;->m:Lo/ext;

    iget v0, v0, Lo/ext;->f:F

    invoke-direct {p0, p1, v0}, Lo/fax;->a(FF)F

    move-result v0

    return v0

    .line 205
    :cond_5
    iget-object v0, p0, Lo/fax;->m:Lo/ext;

    iget v0, v0, Lo/ext;->c:F

    invoke-direct {p0, p1, v0}, Lo/fax;->a(FF)F

    move-result v0

    return v0
.end method

.method private c(Ljava/util/ArrayList;)Lo/faz;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/faz;>;)Lo/faz;"
        }
    .end annotation

    .line 353
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 354
    :cond_0
    const-string v0, "HeartRateDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMinData null == dataList || 0 == dataList.size()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    const/4 v0, 0x0

    return-object v0

    .line 358
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/faz;

    .line 359
    const/4 v0, 0x0

    iput v0, v4, Lo/faz;->c:I

    .line 360
    const/4 v5, 0x0

    .line 361
    const/4 v6, 0x1

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 362
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/faz;

    .line 363
    const-string v0, "HeartRateDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMinData temp v1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v5, Lo/faz;->d:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  temp v2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v5, Lo/faz;->b:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    iget v0, v5, Lo/faz;->b:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    iget v0, v5, Lo/faz;->b:F

    iget v1, v4, Lo/faz;->b:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 365
    move-object v4, v5

    .line 366
    iput v6, v4, Lo/faz;->c:I

    .line 361
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 369
    :cond_3
    const-string v0, "HeartRateDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMinData dataList size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "min.index = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v4, Lo/faz;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", min.v2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v4, Lo/faz;->b:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    return-object v4
.end method

.method private c(Lo/faz;Lo/faz;I)Lo/faz;
    .locals 2

    .line 340
    iget v0, p2, Lo/faz;->d:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget v0, p2, Lo/faz;->d:F

    iget v1, p1, Lo/faz;->d:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 341
    move-object p1, p2

    .line 342
    iput p3, p1, Lo/faz;->c:I

    .line 344
    :cond_0
    return-object p1
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 14

    .line 402
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 403
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 404
    const v0, -0x525151

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 405
    new-instance v5, Landroid/graphics/Path;

    invoke-direct {v5}, Landroid/graphics/Path;-><init>()V

    .line 406
    new-instance v6, Landroid/graphics/DashPathEffect;

    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v6, v0, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 407
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 409
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 410
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 411
    const v0, -0x525151

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 412
    new-instance v8, Landroid/graphics/CornerPathEffect;

    const/high16 v0, 0x41200000    # 10.0f

    invoke-direct {v8, v0}, Landroid/graphics/CornerPathEffect;-><init>(F)V

    .line 413
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 415
    const/high16 v0, 0x43020000    # 130.0f

    invoke-direct {p0, v0}, Lo/fax;->a(F)F

    move-result v9

    .line 417
    iget v0, p0, Lo/fax;->f:F

    const/4 v1, 0x0

    invoke-virtual {v5, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 418
    iget v0, p0, Lo/fax;->b:F

    iget v1, p0, Lo/fax;->f:F

    invoke-virtual {v5, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 419
    invoke-virtual {p1, v5, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 421
    const/4 v0, 0x0

    invoke-virtual {v5, v0, v9}, Landroid/graphics/Path;->moveTo(FF)V

    .line 422
    iget v0, p0, Lo/fax;->b:F

    invoke-virtual {v5, v0, v9}, Landroid/graphics/Path;->lineTo(FF)V

    .line 423
    invoke-virtual {p1, v5, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 426
    new-instance v10, Landroid/graphics/Paint;

    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    .line 427
    iget-object v0, p0, Lo/fax;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_black_50alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 428
    iget-object v0, p0, Lo/fax;->a:Landroid/content/Context;

    .line 429
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->fitness_details_bar_chart_view_text_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 428
    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 430
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 431
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v4, v1}, Lo/eyh;->b(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v0

    const/high16 v1, 0x40a00000    # 5.0f

    add-float v11, v0, v1

    .line 432
    const/4 v12, 0x0

    .line 433
    const-wide v0, 0x4060400000000000L    # 130.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v13

    .line 434
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 435
    iget v0, p0, Lo/fax;->b:F

    invoke-virtual {v4, v13}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x42480000    # 50.0f

    sub-float v12, v0, v1

    .line 437
    :cond_0
    iget v0, p0, Lo/fax;->d:F

    iget v1, p0, Lo/fax;->n:F

    add-float/2addr v0, v1

    sub-float/2addr v0, v12

    invoke-virtual {v4, v13}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    sub-float/2addr v0, v1

    add-float v1, v9, v11

    const/high16 v2, 0x41a00000    # 20.0f

    add-float/2addr v1, v2

    invoke-virtual {p1, v13, v0, v1, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 439
    return-void

    nop

    :array_0
    .array-data 4
        0x40800000    # 4.0f
        0x40000000    # 2.0f
        0x40800000    # 4.0f
        0x40000000    # 2.0f
    .end array-data
.end method

.method private c(Lo/fav;Landroid/graphics/Canvas;)V
    .locals 21

    .line 537
    const-string v6, ""

    .line 538
    const/4 v7, -0x1

    .line 539
    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 540
    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 541
    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 542
    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    .line 544
    move-object/from16 v0, p1

    iget-object v6, v0, Lo/fav;->e:Ljava/lang/String;

    .line 545
    move-object/from16 v0, p1

    iget v7, v0, Lo/fav;->c:I

    .line 546
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/fav;->b:Landroid/graphics/PointF;

    iget v8, v0, Landroid/graphics/PointF;->x:F

    .line 547
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/fav;->b:Landroid/graphics/PointF;

    iget v9, v0, Landroid/graphics/PointF;->y:F

    .line 549
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fax;->x:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Lo/eyh;->b(Landroid/graphics/Paint;)F

    move-result v10

    .line 550
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fax;->x:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v6}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fax;->y:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/fax;->j:F

    .line 551
    move-object/from16 v0, p0

    iget v0, v0, Lo/fax;->z:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    add-float/2addr v0, v10

    move-object/from16 v1, p0

    iput v0, v1, Lo/fax;->D:F

    .line 552
    move-object/from16 v0, p0

    iget v0, v0, Lo/fax;->j:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v11, v0, v1

    .line 554
    const/4 v0, 0x1

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v12

    .line 556
    const/16 v18, 0x0

    .line 557
    sparse-switch v7, :sswitch_data_0

    goto/16 :goto_0

    .line 559
    :sswitch_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    sub-float v1, v8, v11

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 560
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    add-float v1, v8, v11

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 561
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fax;->D:F

    sub-float v1, v9, v1

    sub-float/2addr v1, v12

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 562
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    iput v9, v0, Landroid/graphics/RectF;->bottom:F

    .line 564
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->top:F

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float/2addr v2, v12

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 565
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float/2addr v2, v12

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 566
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fax;->w:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v1, v2

    add-float v13, v0, v1

    .line 567
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    iget v14, v0, Landroid/graphics/RectF;->bottom:F

    .line 568
    new-instance v18, Landroid/graphics/Path;

    invoke-direct/range {v18 .. v18}, Landroid/graphics/Path;-><init>()V

    .line 569
    add-float v0, v13, v12

    move-object/from16 v1, v18

    invoke-virtual {v1, v0, v14}, Landroid/graphics/Path;->moveTo(FF)V

    .line 570
    const/high16 v0, 0x3fc00000    # 1.5f

    mul-float/2addr v0, v12

    add-float/2addr v0, v14

    move-object/from16 v1, v18

    invoke-virtual {v1, v13, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 571
    sub-float v0, v13, v12

    move-object/from16 v1, v18

    invoke-virtual {v1, v0, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 572
    invoke-virtual/range {v18 .. v18}, Landroid/graphics/Path;->close()V

    .line 573
    goto/16 :goto_0

    .line 575
    :sswitch_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    sub-float v1, v8, v11

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 576
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    add-float v1, v8, v11

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 578
    move-object/from16 v0, p0

    iget v0, v0, Lo/fax;->e:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/fax;->D:F

    sub-float/2addr v0, v1

    sub-float/2addr v0, v12

    cmpl-float v0, v9, v0

    if-lez v0, :cond_0

    .line 579
    move-object/from16 v0, p0

    iget v0, v0, Lo/fax;->e:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/fax;->D:F

    sub-float/2addr v0, v1

    sub-float v9, v0, v12

    .line 582
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    iput v9, v0, Landroid/graphics/RectF;->top:F

    .line 583
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fax;->D:F

    add-float/2addr v1, v9

    add-float/2addr v1, v12

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 585
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->top:F

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float/2addr v2, v12

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 586
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float/2addr v2, v12

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 588
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fax;->w:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v1, v2

    add-float v13, v0, v1

    .line 589
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    iget v14, v0, Landroid/graphics/RectF;->top:F

    .line 590
    new-instance v18, Landroid/graphics/Path;

    invoke-direct/range {v18 .. v18}, Landroid/graphics/Path;-><init>()V

    .line 591
    move-object/from16 v0, v18

    invoke-virtual {v0, v8, v9}, Landroid/graphics/Path;->moveTo(FF)V

    .line 592
    add-float v0, v13, v12

    move-object/from16 v1, v18

    invoke-virtual {v1, v0, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 593
    sub-float v0, v13, v12

    move-object/from16 v1, v18

    invoke-virtual {v1, v0, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 594
    invoke-virtual/range {v18 .. v18}, Landroid/graphics/Path;->close()V

    .line 595
    .line 601
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fax;->b:F

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lo/fax;->e(Landroid/graphics/RectF;F)V

    .line 602
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->x:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    iget-wide v1, v1, Lo/fav;->a:D

    double-to-int v1, v1

    int-to-float v1, v1

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lo/fax;->e(F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 603
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fax;->C:F

    move-object/from16 v2, p0

    iget v2, v2, Lo/fax;->B:F

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/fax;->x:Landroid/graphics/Paint;

    move-object/from16 v4, p2

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 606
    if-eqz v18, :cond_1

    .line 607
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->x:Landroid/graphics/Paint;

    move-object/from16 v1, p2

    move-object/from16 v2, v18

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 608
    invoke-virtual/range {v18 .. v18}, Landroid/graphics/Path;->reset()V

    .line 610
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->x:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 611
    move-object/from16 v0, p2

    sub-float v1, v13, v12

    move v2, v14

    add-float v3, v13, v12

    move v4, v14

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/fax;->x:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 613
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/fax;->y:F

    add-float v15, v0, v1

    .line 614
    move/from16 v17, v15

    .line 615
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->x:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 616
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->x:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v19

    .line 617
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->w:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    move-object/from16 v1, p0

    iget v1, v1, Lo/fax;->D:F

    move-object/from16 v2, v19

    iget v2, v2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    move-object/from16 v2, v19

    iget v2, v2, Landroid/graphics/Paint$FontMetricsInt;->top:I

    int-to-float v2, v2

    add-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    move-object/from16 v1, v19

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    int-to-float v1, v1

    sub-float v20, v0, v1

    .line 618
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fax;->x:Landroid/graphics/Paint;

    move-object/from16 v1, p2

    move/from16 v2, v17

    move/from16 v3, v20

    invoke-virtual {v1, v6, v2, v3, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 620
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method private d(FFLandroid/graphics/RectF;)Z
    .locals 1

    .line 686
    iget v0, p3, Landroid/graphics/RectF;->left:F

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    iget v0, p3, Landroid/graphics/RectF;->right:F

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    iget v0, p3, Landroid/graphics/RectF;->top:F

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_0

    iget v0, p3, Landroid/graphics/RectF;->bottom:F

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_0

    .line 687
    const/4 v0, 0x1

    return v0

    .line 689
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private e(FF)F
    .locals 2

    .line 490
    const/4 v0, 0x0

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    .line 491
    const/4 p2, 0x0

    .line 494
    :cond_0
    add-float v0, p2, p1

    iget v1, p0, Lo/fax;->b:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 495
    iget v0, p0, Lo/fax;->b:F

    sub-float p2, v0, p1

    .line 498
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 499
    iget v0, p0, Lo/fax;->b:F

    sub-float/2addr v0, p2

    sub-float p2, v0, p1

    .line 501
    :cond_2
    return p2
.end method

.method private e(F)I
    .locals 2

    .line 380
    const/4 v1, 0x0

    .line 381
    iget-object v0, p0, Lo/fax;->m:Lo/ext;

    iget v0, v0, Lo/ext;->d:F

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    .line 382
    const v1, -0xcce0

    goto :goto_0

    .line 383
    :cond_0
    iget-object v0, p0, Lo/fax;->m:Lo/ext;

    iget v0, v0, Lo/ext;->e:F

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_1

    .line 384
    const v1, -0x49ade

    goto :goto_0

    .line 385
    :cond_1
    iget-object v0, p0, Lo/fax;->m:Lo/ext;

    iget v0, v0, Lo/ext;->a:F

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_2

    .line 386
    const/16 v1, -0x45e5

    goto :goto_0

    .line 387
    :cond_2
    iget-object v0, p0, Lo/fax;->m:Lo/ext;

    iget v0, v0, Lo/ext;->f:F

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_3

    .line 388
    const v1, -0xff29a7

    goto :goto_0

    .line 389
    :cond_3
    iget-object v0, p0, Lo/fax;->m:Lo/ext;

    iget v0, v0, Lo/ext;->c:F

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_4

    .line 390
    const v1, -0xc26301

    goto :goto_0

    .line 392
    :cond_4
    const v1, -0x222223

    .line 394
    :goto_0
    return v1
.end method

.method private e(Ljava/util/ArrayList;)Lo/faz;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/faz;>;)Lo/faz;"
        }
    .end annotation

    .line 312
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 313
    :cond_0
    const-string v0, "HeartRateDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMaxData null == dataList || 0 == dataList.size()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    const/4 v0, 0x0

    return-object v0

    .line 316
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/faz;

    .line 317
    const/4 v0, 0x0

    iput v0, v4, Lo/faz;->c:I

    .line 318
    const/4 v5, 0x0

    .line 319
    const/4 v6, 0x1

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 320
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/faz;

    .line 321
    const-string v0, "HeartRateDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMaxData temp v1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v5, Lo/faz;->d:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  temp v2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v5, Lo/faz;->b:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    invoke-direct {p0, v4, v5, v6}, Lo/fax;->c(Lo/faz;Lo/faz;I)Lo/faz;

    move-result-object v4

    .line 319
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 328
    :cond_2
    const-string v0, "HeartRateDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMaxData dataList size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  max.index = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v4, Lo/faz;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", max.v1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v4, Lo/faz;->d:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    return-object v4
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 10

    .line 457
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 458
    iget-object v0, p0, Lo/fax;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->common_black_50alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 459
    iget-object v0, p0, Lo/fax;->a:Landroid/content/Context;

    .line 460
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->fitness_details_bar_chart_date_text_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 459
    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 461
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 462
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lo/fax;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 463
    iget-object v0, p0, Lo/fax;->o:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 464
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v4, v6, v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v0

    float-to-int v0, v0

    int-to-float v7, v0

    .line 465
    iget v0, p0, Lo/fax;->k:F

    iget v1, p0, Lo/fax;->d:F

    iget-object v2, p0, Lo/fax;->o:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    int-to-float v2, v2

    div-float/2addr v1, v2

    int-to-float v2, v5

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v7, v1

    sub-float v8, v0, v1

    .line 477
    invoke-direct {p0, v7, v8}, Lo/fax;->e(FF)F

    move-result v8

    .line 478
    iget v0, p0, Lo/fax;->c:F

    iget v1, p0, Lo/fax;->p:F

    const/high16 v2, 0x40400000    # 3.0f

    div-float/2addr v1, v2

    sub-float v9, v0, v1

    .line 479
    invoke-virtual {p1, v6, v8, v9, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 462
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 481
    :cond_0
    return-void
.end method

.method private e(Landroid/graphics/Canvas;FFF)V
    .locals 7

    .line 227
    new-instance v6, Lo/fav;

    invoke-direct {v6}, Lo/fav;-><init>()V

    .line 228
    const/4 v0, 0x0

    cmpl-float v0, v0, p2

    if-eqz v0, :cond_0

    .line 229
    invoke-direct {p0, p2}, Lo/fax;->a(F)F

    move-result v5

    .line 230
    iget-object v0, p0, Lo/fax;->s:Landroid/graphics/Paint;

    invoke-direct {p0, p2}, Lo/fax;->e(F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 231
    float-to-double v0, p2

    iput-wide v0, v6, Lo/fav;->a:D

    goto :goto_0

    .line 232
    :cond_0
    const/4 v0, 0x0

    cmpl-float v0, v0, p3

    if-eqz v0, :cond_1

    .line 233
    invoke-direct {p0, p3}, Lo/fax;->a(F)F

    move-result v5

    .line 234
    iget-object v0, p0, Lo/fax;->s:Landroid/graphics/Paint;

    invoke-direct {p0, p3}, Lo/fax;->e(F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 235
    float-to-double v0, p3

    iput-wide v0, v6, Lo/fav;->a:D

    goto :goto_0

    .line 237
    :cond_1
    return-void

    .line 240
    :goto_0
    iget-object v0, p0, Lo/fax;->s:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 241
    iget v0, p0, Lo/fax;->i:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v1, p0, Lo/fax;->s:Landroid/graphics/Paint;

    invoke-virtual {p1, p4, v5, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 243
    const/4 v0, 0x1

    iput v0, v6, Lo/fav;->c:I

    .line 244
    new-instance v0, Landroid/graphics/PointF;

    iget v1, p0, Lo/fax;->i:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float v1, v5, v1

    iget v2, p0, Lo/fax;->z:F

    sub-float/2addr v1, v2

    invoke-direct {v0, p4, v1}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, v6, Lo/fav;->b:Landroid/graphics/PointF;

    .line 245
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, v6, Lo/fav;->a:D

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fax;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v6, Lo/fav;->e:Ljava/lang/String;

    .line 246
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/fax;->h:F

    sub-float v1, p4, v1

    iget v2, p0, Lo/fax;->h:F

    sub-float v2, v5, v2

    iget v3, p0, Lo/fax;->h:F

    add-float/2addr v3, p4

    iget v4, p0, Lo/fax;->h:F

    add-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, v6, Lo/fav;->d:Landroid/graphics/RectF;

    .line 247
    iget-object v0, p0, Lo/fax;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    return-void
.end method

.method private e(Landroid/graphics/RectF;F)V
    .locals 4

    .line 629
    iget v0, p1, Landroid/graphics/RectF;->right:F

    cmpl-float v0, v0, p2

    if-lez v0, :cond_0

    .line 630
    iget v0, p1, Landroid/graphics/RectF;->left:F

    iget v1, p1, Landroid/graphics/RectF;->right:F

    sub-float/2addr v1, p2

    sub-float/2addr v0, v1

    iput v0, p1, Landroid/graphics/RectF;->left:F

    .line 631
    iput p2, p1, Landroid/graphics/RectF;->right:F

    goto :goto_0

    .line 633
    :cond_0
    const-string v0, "HeartRateDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setRect right"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 635
    :goto_0
    iget v0, p1, Landroid/graphics/RectF;->left:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 636
    iget v0, p1, Landroid/graphics/RectF;->right:F

    iget v1, p1, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v1

    iput v0, p1, Landroid/graphics/RectF;->right:F

    .line 637
    const/4 v0, 0x0

    iput v0, p1, Landroid/graphics/RectF;->left:F

    goto :goto_1

    .line 639
    :cond_1
    const-string v0, "HeartRateDetailView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "left > 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 642
    :goto_1
    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Ljava/util/ArrayList<Lo/faz;>;)V"
        }
    .end annotation

    .line 705
    iget-object v0, p0, Lo/fax;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 706
    iput-object p1, p0, Lo/fax;->o:Ljava/util/List;

    .line 707
    iput-object p2, p0, Lo/fax;->l:Ljava/util/ArrayList;

    .line 708
    invoke-virtual {p0}, Lo/fax;->invalidate()V

    .line 709
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 91
    invoke-direct {p0, p1}, Lo/fax;->b(Landroid/graphics/Canvas;)V

    .line 92
    invoke-direct {p0, p1}, Lo/fax;->e(Landroid/graphics/Canvas;)V

    .line 93
    invoke-direct {p0, p1}, Lo/fax;->c(Landroid/graphics/Canvas;)V

    .line 94
    invoke-direct {p0, p1}, Lo/fax;->a(Landroid/graphics/Canvas;)V

    .line 95
    iget-boolean v0, p0, Lo/fax;->u:Z

    if-eqz v0, :cond_0

    .line 96
    invoke-direct {p0}, Lo/fax;->b()V

    .line 97
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fax;->u:Z

    .line 99
    :cond_0
    iget-object v0, p0, Lo/fax;->v:Ljava/util/ArrayList;

    invoke-direct {p0, p1, v0}, Lo/fax;->b(Landroid/graphics/Canvas;Ljava/util/ArrayList;)V

    .line 100
    return-void
.end method

.method protected onMeasure(II)V
    .locals 5

    .line 67
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 68
    invoke-virtual {p0}, Lo/fax;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Lo/fax;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fax;->b:F

    .line 69
    invoke-virtual {p0}, Lo/fax;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v0, p2}, Lo/fax;->getDefaultSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/fax;->c:F

    .line 71
    const/4 v0, 0x1

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    iput v0, p0, Lo/fax;->f:F

    .line 72
    const/4 v0, 0x1

    const/high16 v1, 0x42200000    # 40.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    iput v0, p0, Lo/fax;->g:F

    .line 73
    const/4 v0, 0x1

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    iput v0, p0, Lo/fax;->p:F

    .line 75
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 76
    iget-object v0, p0, Lo/fax;->a:Landroid/content/Context;

    .line 77
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->fitness_details_bar_chart_view_text_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 76
    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 78
    const-string v3, "00000"

    .line 79
    const-string v4, "00"

    .line 80
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lo/fax;->k:F

    .line 81
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lo/fax;->n:F

    .line 82
    iget v0, p0, Lo/fax;->b:F

    iget v1, p0, Lo/fax;->k:F

    sub-float/2addr v0, v1

    iget v1, p0, Lo/fax;->n:F

    sub-float/2addr v0, v1

    iput v0, p0, Lo/fax;->d:F

    .line 83
    iget v0, p0, Lo/fax;->c:F

    iget v1, p0, Lo/fax;->p:F

    sub-float/2addr v0, v1

    iput v0, p0, Lo/fax;->e:F

    .line 85
    const/4 v0, 0x1

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    iput v0, p0, Lo/fax;->i:F

    .line 86
    const/4 v0, 0x1

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    iput v0, p0, Lo/fax;->h:F

    .line 87
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 646
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 647
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-direct {p0, v0, v1}, Lo/fax;->b(FF)V

    .line 649
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public setHeartRateZone(Lo/ext;)V
    .locals 0

    .line 696
    iput-object p1, p0, Lo/fax;->m:Lo/ext;

    .line 697
    return-void
.end method

.method public setIsShowMax(Z)V
    .locals 0

    .line 712
    iput-boolean p1, p0, Lo/fax;->u:Z

    .line 713
    return-void
.end method
