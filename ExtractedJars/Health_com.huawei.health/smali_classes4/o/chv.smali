.class public Lo/chv;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:F

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/graphics/PointF;>;"
        }
    .end annotation
.end field

.field private d:F

.field private e:F

.field private f:Z

.field private g:F

.field private h:Z

.field private i:Landroid/graphics/Path;

.field private k:Landroid/graphics/Path;

.field private l:I

.field private m:I

.field private n:Landroid/graphics/Paint;

.field private o:Landroid/graphics/Paint;

.field private p:Landroid/graphics/Paint;

.field private q:I

.field private r:Landroid/graphics/Bitmap;

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private z:Landroid/graphics/Canvas;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 37
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 24
    const/high16 v0, 0x40a00000    # 5.0f

    iput v0, p0, Lo/chv;->b:F

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lo/chv;->q:I

    .line 38
    invoke-direct {p0}, Lo/chv;->d()V

    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 42
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    const/high16 v0, 0x40a00000    # 5.0f

    iput v0, p0, Lo/chv;->b:F

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lo/chv;->q:I

    .line 43
    invoke-direct {p0}, Lo/chv;->d()V

    .line 44
    return-void
.end method

.method private a(F)F
    .locals 4

    .line 169
    iget-boolean v0, p0, Lo/chv;->f:Z

    if-eqz v0, :cond_0

    .line 170
    iget v0, p0, Lo/chv;->q:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 174
    :pswitch_0
    iget v0, p0, Lo/chv;->t:I

    int-to-float v0, v0

    return v0

    .line 177
    :goto_0
    :pswitch_1
    iget v0, p0, Lo/chv;->s:I

    int-to-float v0, v0

    iget v1, p0, Lo/chv;->t:I

    iget v2, p0, Lo/chv;->s:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    return v0

    .line 180
    :cond_0
    iget v0, p0, Lo/chv;->t:I

    int-to-float v0, v0

    iget v1, p0, Lo/chv;->t:I

    iget v2, p0, Lo/chv;->s:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lo/chv;->d:F

    sub-float v2, p1, v2

    mul-float/2addr v1, v2

    iget v2, p0, Lo/chv;->g:F

    iget v3, p0, Lo/chv;->d:F

    sub-float/2addr v2, v3

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private a()V
    .locals 14

    .line 127
    invoke-virtual {p0}, Lo/chv;->getWidth()I

    move-result v0

    if-nez v0, :cond_0

    .line 128
    return-void

    .line 130
    :cond_0
    iget-object v0, p0, Lo/chv;->c:Ljava/util/List;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lo/chv;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 131
    invoke-direct {p0}, Lo/chv;->c()V

    .line 132
    iget-object v0, p0, Lo/chv;->i:Landroid/graphics/Path;

    if-nez v0, :cond_1

    .line 133
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/chv;->i:Landroid/graphics/Path;

    goto :goto_0

    .line 135
    :cond_1
    iget-object v0, p0, Lo/chv;->i:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 137
    :goto_0
    iget-object v0, p0, Lo/chv;->k:Landroid/graphics/Path;

    if-nez v0, :cond_2

    .line 138
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/chv;->k:Landroid/graphics/Path;

    goto :goto_1

    .line 140
    :cond_2
    iget-object v0, p0, Lo/chv;->k:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 142
    :goto_1
    iget-object v0, p0, Lo/chv;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/graphics/PointF;

    .line 143
    iget v0, v4, Landroid/graphics/PointF;->x:F

    invoke-direct {p0, v0}, Lo/chv;->c(F)F

    move-result v5

    .line 144
    iget v0, v4, Landroid/graphics/PointF;->y:F

    invoke-direct {p0, v0}, Lo/chv;->a(F)F

    move-result v6

    .line 145
    iget-object v0, p0, Lo/chv;->i:Landroid/graphics/Path;

    invoke-virtual {v0, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 146
    const/4 v7, 0x0

    .line 147
    iget-object v0, p0, Lo/chv;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/graphics/PointF;

    .line 148
    iget v0, v9, Landroid/graphics/PointF;->x:F

    invoke-direct {p0, v0}, Lo/chv;->c(F)F

    move-result v10

    .line 149
    iget v0, v9, Landroid/graphics/PointF;->y:F

    invoke-direct {p0, v0}, Lo/chv;->a(F)F

    move-result v11

    .line 150
    if-eqz v7, :cond_3

    .line 151
    iget-object v0, p0, Lo/chv;->k:Landroid/graphics/Path;

    invoke-virtual {v0, v10, v11}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_3

    .line 153
    :cond_3
    sub-float v0, v5, v10

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v12

    .line 154
    sub-float v0, v6, v11

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v13

    .line 155
    mul-float v0, v12, v12

    mul-float v1, v13, v13

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iget v2, p0, Lo/chv;->b:F

    const/high16 v3, 0x3fc00000    # 1.5f

    mul-float/2addr v2, v3

    float-to-double v2, v2

    cmpl-double v0, v0, v2

    if-lez v0, :cond_4

    .line 156
    iget-object v0, p0, Lo/chv;->i:Landroid/graphics/Path;

    invoke-virtual {v0, v10, v11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 157
    iget-object v0, p0, Lo/chv;->k:Landroid/graphics/Path;

    invoke-virtual {v0, v10, v11}, Landroid/graphics/Path;->moveTo(FF)V

    .line 158
    const/4 v7, 0x1

    goto :goto_3

    .line 160
    :cond_4
    iget-object v0, p0, Lo/chv;->i:Landroid/graphics/Path;

    invoke-virtual {v0, v10, v11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 163
    :goto_3
    goto/16 :goto_2

    .line 166
    :cond_5
    return-void
.end method

.method private b()V
    .locals 7

    .line 112
    iget-object v0, p0, Lo/chv;->n:Landroid/graphics/Paint;

    iget v1, p0, Lo/chv;->u:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 113
    iget-object v0, p0, Lo/chv;->o:Landroid/graphics/Paint;

    iget v1, p0, Lo/chv;->u:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 114
    iget-object v0, p0, Lo/chv;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    invoke-direct {p0, v0}, Lo/chv;->c(F)F

    move-result v3

    .line 115
    iget-object v0, p0, Lo/chv;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    invoke-direct {p0, v0}, Lo/chv;->a(F)F

    move-result v4

    .line 116
    iget-object v0, p0, Lo/chv;->c:Ljava/util/List;

    iget-object v1, p0, Lo/chv;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    invoke-direct {p0, v0}, Lo/chv;->c(F)F

    move-result v5

    .line 117
    iget-object v0, p0, Lo/chv;->c:Ljava/util/List;

    iget-object v1, p0, Lo/chv;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    invoke-direct {p0, v0}, Lo/chv;->a(F)F

    move-result v6

    .line 118
    iget-object v0, p0, Lo/chv;->z:Landroid/graphics/Canvas;

    iget-object v1, p0, Lo/chv;->i:Landroid/graphics/Path;

    iget-object v2, p0, Lo/chv;->o:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 119
    iget-object v0, p0, Lo/chv;->z:Landroid/graphics/Canvas;

    iget v1, p0, Lo/chv;->b:F

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float/2addr v1, v2

    iget-object v2, p0, Lo/chv;->n:Landroid/graphics/Paint;

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 120
    iget-object v0, p0, Lo/chv;->z:Landroid/graphics/Canvas;

    iget v1, p0, Lo/chv;->b:F

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    iget-object v2, p0, Lo/chv;->p:Landroid/graphics/Paint;

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 121
    iget-object v0, p0, Lo/chv;->z:Landroid/graphics/Canvas;

    iget-object v1, p0, Lo/chv;->k:Landroid/graphics/Path;

    iget-object v2, p0, Lo/chv;->o:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 122
    iget-object v0, p0, Lo/chv;->z:Landroid/graphics/Canvas;

    iget v1, p0, Lo/chv;->b:F

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float/2addr v1, v2

    iget-object v2, p0, Lo/chv;->n:Landroid/graphics/Paint;

    invoke-virtual {v0, v5, v6, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 123
    iget-object v0, p0, Lo/chv;->z:Landroid/graphics/Canvas;

    iget v1, p0, Lo/chv;->b:F

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    iget-object v2, p0, Lo/chv;->p:Landroid/graphics/Paint;

    invoke-virtual {v0, v5, v6, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 124
    return-void
.end method

.method private c(F)F
    .locals 4

    .line 185
    iget-boolean v0, p0, Lo/chv;->h:Z

    if-eqz v0, :cond_0

    .line 186
    iget v0, p0, Lo/chv;->q:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 188
    :pswitch_0
    iget v0, p0, Lo/chv;->m:I

    int-to-float v0, v0

    return v0

    .line 190
    :pswitch_1
    iget v0, p0, Lo/chv;->l:I

    int-to-float v0, v0

    return v0

    .line 194
    :goto_0
    :pswitch_2
    iget v0, p0, Lo/chv;->m:I

    int-to-float v0, v0

    iget v1, p0, Lo/chv;->l:I

    iget v2, p0, Lo/chv;->m:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    return v0

    .line 197
    :cond_0
    iget v0, p0, Lo/chv;->m:I

    int-to-float v0, v0

    iget v1, p0, Lo/chv;->l:I

    iget v2, p0, Lo/chv;->m:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lo/chv;->a:F

    sub-float v2, p1, v2

    mul-float/2addr v1, v2

    iget v2, p0, Lo/chv;->e:F

    iget v3, p0, Lo/chv;->a:F

    sub-float/2addr v2, v3

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private c()V
    .locals 7

    .line 202
    iget-object v0, p0, Lo/chv;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/graphics/PointF;

    .line 203
    iget v0, v4, Landroid/graphics/PointF;->x:F

    iput v0, p0, Lo/chv;->a:F

    .line 204
    iget v0, v4, Landroid/graphics/PointF;->x:F

    iput v0, p0, Lo/chv;->e:F

    .line 205
    iget v0, v4, Landroid/graphics/PointF;->y:F

    iput v0, p0, Lo/chv;->d:F

    .line 206
    iget v0, v4, Landroid/graphics/PointF;->y:F

    iput v0, p0, Lo/chv;->g:F

    .line 207
    iget-object v0, p0, Lo/chv;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/graphics/PointF;

    .line 208
    iget v0, v6, Landroid/graphics/PointF;->x:F

    iget v1, p0, Lo/chv;->a:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 209
    iget v0, v6, Landroid/graphics/PointF;->x:F

    iput v0, p0, Lo/chv;->a:F

    goto :goto_1

    .line 210
    :cond_0
    iget v0, v6, Landroid/graphics/PointF;->x:F

    iget v1, p0, Lo/chv;->e:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 211
    iget v0, v6, Landroid/graphics/PointF;->x:F

    iput v0, p0, Lo/chv;->e:F

    .line 214
    :cond_1
    :goto_1
    iget v0, v6, Landroid/graphics/PointF;->y:F

    iget v1, p0, Lo/chv;->d:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 215
    iget v0, v6, Landroid/graphics/PointF;->y:F

    iput v0, p0, Lo/chv;->d:F

    goto :goto_2

    .line 216
    :cond_2
    iget v0, v6, Landroid/graphics/PointF;->y:F

    iget v1, p0, Lo/chv;->g:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 217
    iget v0, v6, Landroid/graphics/PointF;->y:F

    iput v0, p0, Lo/chv;->g:F

    .line 219
    :cond_3
    :goto_2
    goto :goto_0

    .line 220
    :cond_4
    iget v0, p0, Lo/chv;->a:F

    iget v1, p0, Lo/chv;->e:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_5

    const/4 v0, 0x1

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_3
    iput-boolean v0, p0, Lo/chv;->h:Z

    .line 221
    iget v0, p0, Lo/chv;->d:F

    iget v1, p0, Lo/chv;->g:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_6

    const/4 v0, 0x1

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    :goto_4
    iput-boolean v0, p0, Lo/chv;->f:Z

    .line 222
    iget v0, p0, Lo/chv;->e:F

    iget v1, p0, Lo/chv;->a:F

    sub-float/2addr v0, v1

    iget v1, p0, Lo/chv;->g:F

    iget v2, p0, Lo/chv;->d:F

    sub-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    .line 223
    iget v0, p0, Lo/chv;->e:F

    iget v1, p0, Lo/chv;->a:F

    sub-float/2addr v0, v1

    iget v1, p0, Lo/chv;->g:F

    iget v2, p0, Lo/chv;->d:F

    sub-float/2addr v1, v2

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v5, v0, v1

    .line 224
    invoke-direct {p0, v5}, Lo/chv;->e(F)V

    .line 225
    goto :goto_5

    .line 226
    :cond_7
    iget v0, p0, Lo/chv;->g:F

    iget v1, p0, Lo/chv;->d:F

    sub-float/2addr v0, v1

    iget v1, p0, Lo/chv;->e:F

    iget v2, p0, Lo/chv;->a:F

    sub-float/2addr v1, v2

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v5, v0, v1

    .line 227
    invoke-direct {p0, v5}, Lo/chv;->d(F)V

    .line 229
    :goto_5
    invoke-virtual {p0}, Lo/chv;->getPaddingLeft()I

    move-result v0

    iput v0, p0, Lo/chv;->m:I

    .line 230
    invoke-virtual {p0}, Lo/chv;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lo/chv;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lo/chv;->l:I

    .line 231
    invoke-virtual {p0}, Lo/chv;->getPaddingTop()I

    move-result v0

    iput v0, p0, Lo/chv;->s:I

    .line 232
    invoke-virtual {p0}, Lo/chv;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lo/chv;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lo/chv;->t:I

    .line 233
    return-void
.end method

.method private d()V
    .locals 3

    .line 63
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chv;->o:Landroid/graphics/Paint;

    .line 64
    iget-object v0, p0, Lo/chv;->o:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 65
    iget-object v0, p0, Lo/chv;->o:Landroid/graphics/Paint;

    iget v1, p0, Lo/chv;->b:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 66
    iget-object v0, p0, Lo/chv;->o:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 68
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chv;->n:Landroid/graphics/Paint;

    .line 69
    iget-object v0, p0, Lo/chv;->n:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 70
    iget-object v0, p0, Lo/chv;->n:Landroid/graphics/Paint;

    iget v1, p0, Lo/chv;->b:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 72
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chv;->p:Landroid/graphics/Paint;

    .line 73
    iget-object v0, p0, Lo/chv;->p:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 74
    iget-object v0, p0, Lo/chv;->p:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 75
    iget-object v0, p0, Lo/chv;->p:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 77
    const/4 v0, -0x1

    iput v0, p0, Lo/chv;->u:I

    .line 78
    iget v0, p0, Lo/chv;->u:I

    iput v0, p0, Lo/chv;->v:I

    .line 79
    return-void
.end method

.method private d(F)V
    .locals 2

    .line 236
    iget v0, p0, Lo/chv;->q:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 238
    :pswitch_0
    iget v0, p0, Lo/chv;->e:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    iput v0, p0, Lo/chv;->e:F

    .line 239
    goto :goto_1

    .line 241
    :pswitch_1
    iget v0, p0, Lo/chv;->a:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/chv;->a:F

    .line 242
    goto :goto_1

    .line 246
    :goto_0
    :pswitch_2
    iget v0, p0, Lo/chv;->e:F

    add-float/2addr v0, p1

    iput v0, p0, Lo/chv;->e:F

    .line 247
    iget v0, p0, Lo/chv;->a:F

    sub-float/2addr v0, p1

    iput v0, p0, Lo/chv;->a:F

    .line 250
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private e(F)V
    .locals 2

    .line 253
    iget v0, p0, Lo/chv;->q:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 257
    :pswitch_0
    iget v0, p0, Lo/chv;->g:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    iput v0, p0, Lo/chv;->g:F

    .line 258
    goto :goto_1

    .line 261
    :goto_0
    :pswitch_1
    iget v0, p0, Lo/chv;->g:F

    add-float/2addr v0, p1

    iput v0, p0, Lo/chv;->g:F

    .line 262
    iget v0, p0, Lo/chv;->d:F

    sub-float/2addr v0, p1

    iput v0, p0, Lo/chv;->d:F

    .line 266
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Landroid/graphics/PointF;>;)V"
        }
    .end annotation

    .line 270
    iput-object p1, p0, Lo/chv;->c:Ljava/util/List;

    .line 271
    invoke-direct {p0}, Lo/chv;->a()V

    .line 272
    invoke-virtual {p0}, Lo/chv;->invalidate()V

    .line 273
    return-void
.end method

.method public a(Ljava/util/List;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Landroid/graphics/PointF;>;I)V"
        }
    .end annotation

    .line 276
    iput p2, p0, Lo/chv;->q:I

    .line 277
    invoke-virtual {p0, p1}, Lo/chv;->a(Ljava/util/List;)V

    .line 278
    return-void
.end method

.method public b(F)V
    .locals 2

    .line 57
    iput p1, p0, Lo/chv;->b:F

    .line 58
    iget-object v0, p0, Lo/chv;->o:Landroid/graphics/Paint;

    iget v1, p0, Lo/chv;->b:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 59
    iget-object v0, p0, Lo/chv;->n:Landroid/graphics/Paint;

    iget v1, p0, Lo/chv;->b:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 60
    return-void
.end method

.method public d(I)V
    .locals 6

    .line 47
    iput p1, p0, Lo/chv;->u:I

    .line 48
    iget v0, p0, Lo/chv;->u:I

    iget v1, p0, Lo/chv;->v:I

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lo/chv;->r:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lo/chv;->z:Landroid/graphics/Canvas;

    invoke-virtual {p0}, Lo/chv;->getWidth()I

    move-result v1

    int-to-float v3, v1

    invoke-virtual {p0}, Lo/chv;->getHeight()I

    move-result v1

    int-to-float v4, v1

    iget-object v5, p0, Lo/chv;->p:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 50
    invoke-direct {p0}, Lo/chv;->b()V

    .line 51
    invoke-virtual {p0}, Lo/chv;->invalidate()V

    .line 53
    :cond_0
    iget v0, p0, Lo/chv;->u:I

    iput v0, p0, Lo/chv;->v:I

    .line 54
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 98
    iget-object v0, p0, Lo/chv;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/chv;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 99
    :cond_0
    return-void

    .line 101
    :cond_1
    iget-object v0, p0, Lo/chv;->r:Landroid/graphics/Bitmap;

    if-nez v0, :cond_2

    .line 102
    invoke-virtual {p0}, Lo/chv;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lo/chv;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/chv;->r:Landroid/graphics/Bitmap;

    .line 103
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lo/chv;->r:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lo/chv;->z:Landroid/graphics/Canvas;

    .line 104
    invoke-direct {p0}, Lo/chv;->b()V

    .line 106
    :cond_2
    iget-object v0, p0, Lo/chv;->r:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 109
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 89
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    .line 90
    invoke-super {p0, p1, p1}, Landroid/view/View;->onMeasure(II)V

    goto :goto_0

    .line 92
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 94
    :goto_0
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 83
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 84
    invoke-direct {p0}, Lo/chv;->a()V

    .line 85
    return-void
.end method
