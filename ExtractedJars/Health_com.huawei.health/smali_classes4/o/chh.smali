.class public Lo/chh;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/chh$e;,
        Lo/chh$c;
    }
.end annotation


# instance fields
.field private a:Landroid/graphics/Bitmap;

.field private b:Landroid/graphics/Paint;

.field private c:Landroid/graphics/Bitmap;

.field private d:F

.field private e:Landroid/graphics/Paint;

.field private f:I

.field private g:Landroid/graphics/Matrix;

.field private h:F

.field private i:Z

.field private k:F

.field private l:I

.field private m:Lo/chh$e;

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Landroid/graphics/RectF;

.field private r:Z

.field private s:Lo/chh$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 68
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/chh;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 69
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 72
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/chh;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 73
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 13

    .line 76
    move/from16 v0, p3

    invoke-direct {p0, p1, p2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 58
    const/16 v0, 0xa

    iput v0, p0, Lo/chh;->l:I

    .line 191
    new-instance v0, Lo/chh$c;

    invoke-direct {v0, p0}, Lo/chh$c;-><init>(Lo/chh;)V

    iput-object v0, p0, Lo/chh;->s:Lo/chh$c;

    .line 77
    invoke-virtual {p0}, Lo/chh;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_sport_control_button_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lo/chh;->f:I

    .line 78
    invoke-virtual {p0}, Lo/chh;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_sport_control_button_padding:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v6

    .line 79
    const/high16 v0, 0x40000000    # 2.0f

    div-float v7, v6, v0

    .line 80
    const/high16 v0, 0x40000000    # 2.0f

    div-float v8, v6, v0

    .line 81
    invoke-virtual {p0}, Lo/chh;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_sporting_stop_normal:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/chh;->a:Landroid/graphics/Bitmap;

    .line 82
    invoke-virtual {p0}, Lo/chh;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_sporting_stop_pressed:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/chh;->c:Landroid/graphics/Bitmap;

    .line 83
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chh;->e:Landroid/graphics/Paint;

    .line 84
    iget-object v0, p0, Lo/chh;->e:Landroid/graphics/Paint;

    const-string v1, "#F3301E"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 85
    iget-object v0, p0, Lo/chh;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 86
    iget-object v0, p0, Lo/chh;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 87
    iget-object v0, p0, Lo/chh;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 89
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/chh;->b:Landroid/graphics/Paint;

    .line 90
    iget-object v0, p0, Lo/chh;->b:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 91
    iget-object v0, p0, Lo/chh;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 92
    iget-object v0, p0, Lo/chh;->b:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 93
    iget-object v0, p0, Lo/chh;->b:Landroid/graphics/Paint;

    const-string v1, "#33F3301E"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 95
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v7, v0

    iput v0, p0, Lo/chh;->k:F

    .line 96
    iget v0, p0, Lo/chh;->f:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v8

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v7

    sub-float/2addr v0, v1

    float-to-int v9, v0

    .line 97
    iget v0, p0, Lo/chh;->f:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v8

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v7

    sub-float/2addr v0, v1

    float-to-int v10, v0

    .line 98
    div-int/lit8 v11, v10, 0x2

    .line 99
    new-instance v0, Landroid/graphics/RectF;

    neg-int v1, v11

    int-to-float v1, v1

    sub-float/2addr v1, v8

    iget v2, p0, Lo/chh;->k:F

    sub-float/2addr v1, v2

    neg-int v2, v11

    int-to-float v2, v2

    sub-float/2addr v2, v8

    iget v3, p0, Lo/chh;->k:F

    sub-float/2addr v2, v3

    int-to-float v3, v11

    add-float/2addr v3, v8

    iget v4, p0, Lo/chh;->k:F

    add-float/2addr v3, v4

    int-to-float v4, v11

    add-float/2addr v4, v8

    iget v5, p0, Lo/chh;->k:F

    add-float/2addr v4, v5

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/chh;->q:Landroid/graphics/RectF;

    .line 101
    int-to-float v0, v9

    iget-object v1, p0, Lo/chh;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float v12, v0, v1

    .line 102
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo/chh;->g:Landroid/graphics/Matrix;

    .line 103
    iget-object v0, p0, Lo/chh;->g:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/chh;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget-object v2, p0, Lo/chh;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 104
    iget-object v0, p0, Lo/chh;->g:Landroid/graphics/Matrix;

    invoke-virtual {v0, v12, v12}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 105
    return-void
.end method

.method static synthetic a(Lo/chh;F)F
    .locals 0

    .line 22
    iput p1, p0, Lo/chh;->d:F

    return p1
.end method

.method static synthetic a(Lo/chh;)I
    .locals 1

    .line 22
    iget v0, p0, Lo/chh;->l:I

    return v0
.end method

.method static synthetic a(Lo/chh;Z)Z
    .locals 0

    .line 22
    iput-boolean p1, p0, Lo/chh;->p:Z

    return p1
.end method

.method static synthetic b(Lo/chh;F)F
    .locals 0

    .line 22
    iput p1, p0, Lo/chh;->h:F

    return p1
.end method

.method static synthetic b(Lo/chh;)Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lo/chh;->i:Z

    return v0
.end method

.method static synthetic c(Lo/chh;)Lo/chh$e;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/chh;->m:Lo/chh$e;

    return-object v0
.end method

.method static synthetic c(Lo/chh;Z)Z
    .locals 0

    .line 22
    iput-boolean p1, p0, Lo/chh;->i:Z

    return p1
.end method

.method static synthetic d(Lo/chh;)Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lo/chh;->o:Z

    return v0
.end method

.method static synthetic d(Lo/chh;Z)Z
    .locals 0

    .line 22
    iput-boolean p1, p0, Lo/chh;->n:Z

    return p1
.end method

.method static synthetic e(Lo/chh;)F
    .locals 1

    .line 22
    iget v0, p0, Lo/chh;->d:F

    return v0
.end method

.method static synthetic e(Lo/chh;Z)Z
    .locals 0

    .line 22
    iput-boolean p1, p0, Lo/chh;->o:Z

    return p1
.end method

.method static synthetic f(Lo/chh;)F
    .locals 1

    .line 22
    iget v0, p0, Lo/chh;->k:F

    return v0
.end method

.method static synthetic h(Lo/chh;)Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lo/chh;->p:Z

    return v0
.end method

.method static synthetic i(Lo/chh;)F
    .locals 1

    .line 22
    iget v0, p0, Lo/chh;->h:F

    return v0
.end method

.method static synthetic k(Lo/chh;)Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lo/chh;->n:Z

    return v0
.end method


# virtual methods
.method public a(Lo/chh$e;)V
    .locals 0

    .line 266
    iput-object p1, p0, Lo/chh;->m:Lo/chh$e;

    .line 267
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 283
    iput-boolean p1, p0, Lo/chh;->r:Z

    .line 284
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 249
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 250
    iget v0, p0, Lo/chh;->f:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/chh;->f:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 252
    iget v0, p0, Lo/chh;->h:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 253
    iget-object v0, p0, Lo/chh;->a:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lo/chh;->g:Landroid/graphics/Matrix;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    goto :goto_0

    .line 255
    :cond_0
    iget-object v0, p0, Lo/chh;->c:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lo/chh;->g:Landroid/graphics/Matrix;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 257
    :goto_0
    iget v0, p0, Lo/chh;->d:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    .line 259
    move-object v0, p1

    iget-object v1, p0, Lo/chh;->q:Landroid/graphics/RectF;

    iget-object v5, p0, Lo/chh;->b:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 260
    move-object v0, p1

    iget-object v1, p0, Lo/chh;->q:Landroid/graphics/RectF;

    iget v3, p0, Lo/chh;->d:F

    iget-object v5, p0, Lo/chh;->e:Landroid/graphics/Paint;

    const/high16 v2, -0x3d4c0000    # -90.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 263
    :cond_1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 109
    iget v0, p0, Lo/chh;->f:I

    iget v1, p0, Lo/chh;->f:I

    invoke-virtual {p0, v0, v1}, Lo/chh;->setMeasuredDimension(II)V

    .line 111
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 195
    iget-boolean v0, p0, Lo/chh;->r:Z

    if-eqz v0, :cond_0

    .line 196
    const/4 v0, 0x1

    return v0

    .line 198
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    .line 199
    packed-switch v2, :pswitch_data_0

    goto/16 :goto_0

    .line 203
    :pswitch_0
    iget-boolean v0, p0, Lo/chh;->i:Z

    if-eqz v0, :cond_1

    .line 204
    const/4 v0, 0x0

    iput v0, p0, Lo/chh;->d:F

    .line 207
    :cond_1
    iget-boolean v0, p0, Lo/chh;->p:Z

    if-nez v0, :cond_2

    .line 208
    iget-object v0, p0, Lo/chh;->s:Lo/chh$c;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/chh$c;->sendEmptyMessage(I)Z

    .line 210
    :cond_2
    iget-object v0, p0, Lo/chh;->s:Lo/chh$c;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/chh$c;->sendEmptyMessage(I)Z

    .line 212
    iget-boolean v0, p0, Lo/chh;->o:Z

    if-nez v0, :cond_3

    .line 213
    iget-object v0, p0, Lo/chh;->s:Lo/chh$c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/chh$c;->removeMessages(I)V

    .line 215
    :cond_3
    iget-object v0, p0, Lo/chh;->m:Lo/chh$e;

    if-eqz v0, :cond_4

    .line 216
    iget-object v0, p0, Lo/chh;->m:Lo/chh$e;

    invoke-interface {v0}, Lo/chh$e;->d()V

    .line 218
    :cond_4
    iget-object v0, p0, Lo/chh;->s:Lo/chh$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chh$c;->sendEmptyMessage(I)Z

    .line 220
    goto :goto_0

    .line 224
    :pswitch_1
    iget-boolean v0, p0, Lo/chh;->n:Z

    if-nez v0, :cond_5

    .line 225
    iget-object v0, p0, Lo/chh;->s:Lo/chh$c;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/chh$c;->sendEmptyMessage(I)Z

    .line 227
    :cond_5
    iget-object v0, p0, Lo/chh;->s:Lo/chh$c;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/chh$c;->sendEmptyMessage(I)Z

    .line 229
    iget-boolean v0, p0, Lo/chh;->i:Z

    if-nez v0, :cond_7

    .line 230
    iget-object v0, p0, Lo/chh;->m:Lo/chh$e;

    if-eqz v0, :cond_6

    .line 231
    iget-object v0, p0, Lo/chh;->m:Lo/chh$e;

    invoke-interface {v0}, Lo/chh$e;->c()V

    .line 233
    :cond_6
    iget-object v0, p0, Lo/chh;->s:Lo/chh$c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/chh$c;->sendEmptyMessage(I)Z

    .line 236
    :cond_7
    iget-object v0, p0, Lo/chh;->s:Lo/chh$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chh$c;->removeMessages(I)V

    .line 238
    .line 243
    :goto_0
    :pswitch_2
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setProgressZero()V
    .locals 1

    .line 278
    const/4 v0, 0x0

    iput v0, p0, Lo/chh;->d:F

    .line 279
    invoke-virtual {p0}, Lo/chh;->invalidate()V

    .line 280
    return-void
.end method
