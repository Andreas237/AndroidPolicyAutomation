.class public Lo/byp;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/byp$e;
    }
.end annotation


# instance fields
.field private A:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private B:I

.field private C:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private D:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private a:Ljava/lang/String;

.field private b:Landroid/graphics/Paint;

.field private c:Landroid/graphics/Paint;

.field private d:Landroid/graphics/Paint;

.field private e:I

.field private f:Landroid/graphics/Paint;

.field private g:Landroid/content/Context;

.field private h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/suggestion/model/RunDataResult;>;"
        }
    .end annotation
.end field

.field private i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/graphics/RectF;>;"
        }
    .end annotation
.end field

.field private j:[Landroid/graphics/Point;

.field private k:F

.field private l:I

.field private m:Landroid/util/DisplayMetrics;

.field private n:I

.field private o:I

.field private p:Lo/byp$e;

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 130
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/byp;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 131
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 134
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 40
    const/16 v0, 0x3c

    iput v0, p0, Lo/byp;->e:I

    .line 41
    iget v0, p0, Lo/byp;->e:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/byp;->a:Ljava/lang/String;

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/byp;->h:Ljava/util/ArrayList;

    .line 65
    sget-object v0, Lo/byp$e;->c:Lo/byp$e;

    iput-object v0, p0, Lo/byp;->p:Lo/byp$e;

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lo/byp;->r:I

    .line 81
    const/4 v0, 0x0

    iput v0, p0, Lo/byp;->s:I

    .line 110
    invoke-virtual {p0}, Lo/byp;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/byp;->w:I

    .line 125
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/byp;->D:Ljava/util/ArrayList;

    .line 126
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/byp;->A:Ljava/util/ArrayList;

    .line 135
    iput-object p1, p0, Lo/byp;->g:Landroid/content/Context;

    .line 136
    invoke-direct {p0}, Lo/byp;->d()V

    .line 137
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 5

    .line 284
    iget-object v0, p0, Lo/byp;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/graphics/RectF;

    .line 285
    iget v0, v4, Landroid/graphics/RectF;->bottom:F

    iget v1, p0, Lo/byp;->u:I

    iget v2, p0, Lo/byp;->v:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 286
    iget-object v0, p0, Lo/byp;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    goto :goto_1

    .line 288
    :cond_0
    iget-object v0, p0, Lo/byp;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 290
    :goto_1
    goto :goto_0

    .line 293
    :cond_1
    return-void
.end method

.method private b(F)I
    .locals 2

    .line 431
    iget-object v0, p0, Lo/byp;->m:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, p1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 9

    .line 237
    const/4 v6, 0x0

    :goto_0
    iget v0, p0, Lo/byp;->B:I

    if-ge v6, v0, :cond_2

    .line 239
    const/4 v0, 0x1

    if-le v6, v0, :cond_0

    .line 240
    iget v0, p0, Lo/byp;->z:I

    add-int/lit8 v1, v6, -0x1

    mul-int/2addr v0, v1

    iget v1, p0, Lo/byp;->e:I

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    .line 241
    new-instance v8, Landroid/graphics/Rect;

    invoke-direct {v8}, Landroid/graphics/Rect;-><init>()V

    .line 242
    iget-object v0, p0, Lo/byp;->b:Landroid/graphics/Paint;

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v7, v2, v1, v8}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 243
    iget v0, p0, Lo/byp;->t:I

    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0xa

    iget v1, p0, Lo/byp;->r:I

    iget v2, p0, Lo/byp;->v:I

    mul-int/2addr v2, v6

    sub-int/2addr v1, v2

    iget v2, p0, Lo/byp;->n:I

    add-int/2addr v1, v2

    invoke-virtual {v8}, Landroid/graphics/Rect;->height()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    invoke-direct {p0, v7, v0, v1, p1}, Lo/byp;->c(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 247
    :cond_0
    const/4 v0, 0x1

    if-ne v6, v0, :cond_1

    .line 248
    new-instance v7, Landroid/graphics/Rect;

    invoke-direct {v7}, Landroid/graphics/Rect;-><init>()V

    .line 249
    iget-object v0, p0, Lo/byp;->b:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/byp;->a:Ljava/lang/String;

    iget-object v2, p0, Lo/byp;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2, v7}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 250
    iget-object v0, p0, Lo/byp;->a:Ljava/lang/String;

    iget v1, p0, Lo/byp;->t:I

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v2

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, -0xa

    iget v2, p0, Lo/byp;->r:I

    iget v3, p0, Lo/byp;->v:I

    mul-int/2addr v3, v6

    sub-int/2addr v2, v3

    iget v3, p0, Lo/byp;->n:I

    add-int/2addr v2, v3

    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    invoke-direct {p0, v0, v1, v2, p1}, Lo/byp;->c(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 254
    :cond_1
    move-object v0, p1

    iget v1, p0, Lo/byp;->t:I

    int-to-float v1, v1

    iget v2, p0, Lo/byp;->u:I

    iget v3, p0, Lo/byp;->v:I

    mul-int/2addr v3, v6

    sub-int/2addr v2, v3

    int-to-float v2, v2

    iget v3, p0, Lo/byp;->l:I

    int-to-float v3, v3

    iget v4, p0, Lo/byp;->r:I

    iget v5, p0, Lo/byp;->v:I

    mul-int/2addr v5, v6

    sub-int/2addr v4, v5

    iget v5, p0, Lo/byp;->n:I

    add-int/2addr v4, v5

    int-to-float v4, v4

    iget-object v5, p0, Lo/byp;->f:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 237
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 258
    :cond_2
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 9

    .line 321
    const/4 v8, 0x0

    :goto_0
    iget-object v0, p0, Lo/byp;->j:[Landroid/graphics/Point;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ge v8, v0, :cond_0

    .line 322
    iget-object v0, p0, Lo/byp;->j:[Landroid/graphics/Point;

    aget-object v6, v0, v8

    .line 323
    iget-object v0, p0, Lo/byp;->j:[Landroid/graphics/Point;

    add-int/lit8 v1, v8, 0x1

    aget-object v7, v0, v1

    .line 324
    move-object v0, p1

    iget v1, v6, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v6, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget v3, v7, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget v4, v7, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    iget-object v5, p0, Lo/byp;->f:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 321
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 326
    :cond_0
    return-void
.end method

.method private c(Ljava/lang/String;IILandroid/graphics/Canvas;)V
    .locals 3

    .line 329
    int-to-float v0, p2

    int-to-float v1, p3

    iget-object v2, p0, Lo/byp;->b:Landroid/graphics/Paint;

    invoke-virtual {p4, p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 330
    return-void
.end method

.method private d()V
    .locals 4

    .line 141
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/byp;->f:Landroid/graphics/Paint;

    .line 142
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v0, p0, Lo/byp;->m:Landroid/util/DisplayMetrics;

    .line 143
    iget-object v0, p0, Lo/byp;->g:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/WindowManager;

    .line 144
    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iget-object v1, p0, Lo/byp;->m:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 147
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/byp;->b:Landroid/graphics/Paint;

    .line 148
    iget-object v0, p0, Lo/byp;->b:Landroid/graphics/Paint;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-direct {p0, v1}, Lo/byp;->b(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 149
    iget-object v0, p0, Lo/byp;->b:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/byp;->g:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$color;->common_black_50alpha:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 150
    iget-object v0, p0, Lo/byp;->b:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 153
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/byp;->c:Landroid/graphics/Paint;

    .line 154
    iget-object v0, p0, Lo/byp;->c:Landroid/graphics/Paint;

    const-string v1, "#FB6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 157
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/byp;->d:Landroid/graphics/Paint;

    .line 158
    iget-object v0, p0, Lo/byp;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/byp;->g:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$color;->common_black_20alpha:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 159
    return-void
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 10

    .line 264
    move-object v0, p1

    iget v1, p0, Lo/byp;->t:I

    int-to-float v1, v1

    iget v2, p0, Lo/byp;->n:I

    int-to-float v2, v2

    iget v3, p0, Lo/byp;->t:I

    int-to-float v3, v3

    iget v4, p0, Lo/byp;->r:I

    iget v5, p0, Lo/byp;->n:I

    add-int/2addr v4, v5

    int-to-float v4, v4

    iget-object v5, p0, Lo/byp;->f:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 266
    iget v0, p0, Lo/byp;->s:I

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget-object v1, p0, Lo/byp;->D:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    div-float v6, v0, v1

    .line 267
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lo/byp;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 268
    iget-object v0, p0, Lo/byp;->p:Lo/byp$e;

    sget-object v1, Lo/byp$e;->e:Lo/byp$e;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lo/byp;->p:Lo/byp$e;

    sget-object v1, Lo/byp$e;->d:Lo/byp$e;

    if-ne v0, v1, :cond_1

    .line 269
    :cond_0
    iget-object v0, p0, Lo/byp;->A:Ljava/util/ArrayList;

    iget v1, p0, Lo/byp;->t:I

    iget v2, p0, Lo/byp;->s:I

    iget-object v3, p0, Lo/byp;->C:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    div-int/2addr v2, v3

    mul-int/2addr v2, v7

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    :cond_1
    iget v0, p0, Lo/byp;->t:I

    int-to-float v0, v0

    int-to-float v1, v7

    mul-float/2addr v1, v6

    add-float v8, v0, v1

    .line 273
    const-string v0, "GraphicChartView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startX:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    new-instance v9, Landroid/graphics/Rect;

    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    .line 276
    iget-object v0, p0, Lo/byp;->b:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/byp;->D:Ljava/util/ArrayList;

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lo/byp;->D:Ljava/util/ArrayList;

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2, v9}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 277
    iget-object v0, p0, Lo/byp;->D:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget v1, p0, Lo/byp;->t:I

    iget v2, p0, Lo/byp;->s:I

    iget v3, p0, Lo/byp;->x:I

    div-int/2addr v2, v3

    mul-int/2addr v2, v7

    add-int/2addr v1, v2

    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    iget v2, p0, Lo/byp;->r:I

    invoke-virtual {v9}, Landroid/graphics/Rect;->height()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v2, v2, 0xa

    invoke-direct {p0, v0, v1, v2, p1}, Lo/byp;->c(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 267
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 280
    :cond_2
    return-void
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 14

    .line 299
    const/4 v9, 0x0

    :goto_0
    iget-object v0, p0, Lo/byp;->j:[Landroid/graphics/Point;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ge v9, v0, :cond_0

    .line 300
    iget-object v0, p0, Lo/byp;->j:[Landroid/graphics/Point;

    aget-object v7, v0, v9

    .line 301
    iget-object v0, p0, Lo/byp;->j:[Landroid/graphics/Point;

    add-int/lit8 v1, v9, 0x1

    aget-object v8, v0, v1

    .line 302
    iget v0, v7, Landroid/graphics/Point;->x:I

    iget v1, v8, Landroid/graphics/Point;->x:I

    add-int/2addr v0, v1

    div-int/lit8 v10, v0, 0x2

    .line 303
    new-instance v11, Landroid/graphics/Point;

    invoke-direct {v11}, Landroid/graphics/Point;-><init>()V

    .line 304
    new-instance v12, Landroid/graphics/Point;

    invoke-direct {v12}, Landroid/graphics/Point;-><init>()V

    .line 305
    iget v0, v7, Landroid/graphics/Point;->y:I

    iput v0, v11, Landroid/graphics/Point;->y:I

    .line 306
    iput v10, v11, Landroid/graphics/Point;->x:I

    .line 307
    iget v0, v8, Landroid/graphics/Point;->y:I

    iput v0, v12, Landroid/graphics/Point;->y:I

    .line 308
    iput v10, v12, Landroid/graphics/Point;->x:I

    .line 310
    new-instance v13, Landroid/graphics/Path;

    invoke-direct {v13}, Landroid/graphics/Path;-><init>()V

    .line 311
    iget v0, v7, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, v7, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    invoke-virtual {v13, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 312
    move-object v0, v13

    iget v1, v11, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v11, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget v3, v12, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget v4, v12, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    iget v5, v8, Landroid/graphics/Point;->x:I

    int-to-float v5, v5

    iget v6, v8, Landroid/graphics/Point;->y:I

    int-to-float v6, v6

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 314
    iget-object v0, p0, Lo/byp;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, v13, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 299
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 316
    :cond_0
    return-void
.end method

.method private getYPoint()[Landroid/graphics/Point;
    .locals 10

    .line 333
    iget-object v0, p0, Lo/byp;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v7, v0, [Landroid/graphics/Point;

    .line 334
    const/4 v8, 0x0

    :goto_0
    iget-object v0, p0, Lo/byp;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v8, v0, :cond_0

    .line 335
    iget v0, p0, Lo/byp;->r:I

    iget v1, p0, Lo/byp;->r:I

    int-to-double v1, v1

    iget-object v3, p0, Lo/byp;->C:Ljava/util/ArrayList;

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    iget v5, p0, Lo/byp;->q:I

    int-to-double v5, v5

    div-double/2addr v3, v5

    mul-double/2addr v1, v3

    double-to-int v1, v1

    sub-int v9, v0, v1

    .line 337
    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Lo/byp;->A:Ljava/util/ArrayList;

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget v2, p0, Lo/byp;->n:I

    add-int/2addr v2, v9

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    aput-object v0, v7, v8

    .line 334
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 339
    :cond_0
    return-object v7
.end method


# virtual methods
.method public getHorizontalRectS()Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Landroid/graphics/RectF;>;"
        }
    .end annotation

    .line 344
    new-instance v4, Ljava/util/ArrayList;

    iget-object v0, p0, Lo/byp;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 345
    const-string v0, "getHorizontalRectS"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mRunDataResultssize:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/byp;->h:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    iget v0, p0, Lo/byp;->t:I

    int-to-float v0, v0

    iput v0, p0, Lo/byp;->k:F

    .line 348
    iget v0, p0, Lo/byp;->v:I

    iget v1, p0, Lo/byp;->B:I

    add-int/lit8 v1, v1, -0x1

    mul-int v5, v0, v1

    .line 349
    iget-object v0, p0, Lo/byp;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/suggestion/model/RunDataResult;

    .line 350
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/RunDataResult;->acquartHeatrRateMin()I

    move-result v0

    iget v1, p0, Lo/byp;->e:I

    if-le v0, v1, :cond_0

    .line 351
    iget v0, p0, Lo/byp;->r:I

    int-to-float v0, v0

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/RunDataResult;->acquartHeartRateMax()F

    move-result v1

    iget v2, p0, Lo/byp;->e:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    iget v2, p0, Lo/byp;->q:I

    iget v3, p0, Lo/byp;->e:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    div-float/2addr v1, v2

    iget v2, p0, Lo/byp;->v:I

    sub-int v2, v5, v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lo/byp;->v:I

    int-to-float v1, v1

    sub-float v8, v0, v1

    .line 352
    iget v0, p0, Lo/byp;->k:F

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/RunDataResult;->acquartDuration()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    iget v2, p0, Lo/byp;->y:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    iget v2, p0, Lo/byp;->s:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v9, v0, v1

    .line 354
    iget v0, p0, Lo/byp;->r:I

    int-to-float v0, v0

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/RunDataResult;->acquartHeatrRateMin()I

    move-result v1

    iget v2, p0, Lo/byp;->e:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    iget v2, p0, Lo/byp;->q:I

    iget v3, p0, Lo/byp;->e:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    div-float/2addr v1, v2

    iget v2, p0, Lo/byp;->v:I

    sub-int v2, v5, v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lo/byp;->v:I

    int-to-float v1, v1

    sub-float v10, v0, v1

    .line 356
    const-string v0, "GraphicChartView"

    const/16 v1, 0xc

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLeft:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/byp;->k:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "-bottom:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "top:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, "-right:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, "mMaxXvalue:"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    iget v2, p0, Lo/byp;->y:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, "-acquartDuration:"

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/RunDataResult;->acquartDuration()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    new-instance v11, Landroid/graphics/RectF;

    iget v0, p0, Lo/byp;->k:F

    invoke-direct {v11, v0, v8, v9, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 358
    iput v9, p0, Lo/byp;->k:F

    .line 359
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 361
    :cond_0
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/RunDataResult;->acquartHeatrRateMin()I

    move-result v0

    iget v1, p0, Lo/byp;->e:I

    if-ne v0, v1, :cond_1

    .line 362
    iget v0, p0, Lo/byp;->r:I

    int-to-float v0, v0

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/RunDataResult;->acquartHeartRateMax()F

    move-result v1

    iget v2, p0, Lo/byp;->e:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    iget v2, p0, Lo/byp;->q:I

    iget v3, p0, Lo/byp;->e:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    div-float/2addr v1, v2

    iget v2, p0, Lo/byp;->v:I

    sub-int v2, v5, v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lo/byp;->v:I

    int-to-float v1, v1

    sub-float v8, v0, v1

    .line 363
    iget v0, p0, Lo/byp;->k:F

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/RunDataResult;->acquartDuration()F

    move-result v1

    iget v2, p0, Lo/byp;->y:I

    int-to-float v2, v2

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float/2addr v2, v3

    div-float/2addr v1, v2

    iget v2, p0, Lo/byp;->s:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float v9, v0, v1

    .line 364
    iget v0, p0, Lo/byp;->u:I

    iget v1, p0, Lo/byp;->v:I

    sub-int/2addr v0, v1

    int-to-float v10, v0

    .line 365
    const-string v0, "GraphicChartView"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bottom:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "top:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    new-instance v11, Landroid/graphics/RectF;

    iget v0, p0, Lo/byp;->k:F

    invoke-direct {v11, v0, v8, v9, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 367
    iput v9, p0, Lo/byp;->k:F

    .line 368
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 372
    :cond_1
    goto/16 :goto_0

    .line 373
    :cond_2
    return-object v4
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 196
    iget-object v0, p0, Lo/byp;->f:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/byp;->g:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$color;->black_10alpha:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 198
    invoke-direct {p0, p1}, Lo/byp;->b(Landroid/graphics/Canvas;)V

    .line 200
    invoke-direct {p0, p1}, Lo/byp;->d(Landroid/graphics/Canvas;)V

    .line 202
    iget-object v0, p0, Lo/byp;->p:Lo/byp$e;

    sget-object v1, Lo/byp$e;->c:Lo/byp$e;

    if-ne v0, v1, :cond_0

    .line 203
    const-string v0, "GraphicChartView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tyle == Linestyle.R"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    invoke-virtual {p0}, Lo/byp;->getHorizontalRectS()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lo/byp;->i:Ljava/util/ArrayList;

    .line 205
    invoke-direct {p0, p1}, Lo/byp;->a(Landroid/graphics/Canvas;)V

    .line 206
    return-void

    .line 210
    :cond_0
    invoke-direct {p0}, Lo/byp;->getYPoint()[Landroid/graphics/Point;

    move-result-object v0

    iput-object v0, p0, Lo/byp;->j:[Landroid/graphics/Point;

    .line 211
    iget-object v0, p0, Lo/byp;->f:Landroid/graphics/Paint;

    const/high16 v1, -0x10000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 212
    iget-object v0, p0, Lo/byp;->f:Landroid/graphics/Paint;

    const/high16 v1, 0x40200000    # 2.5f

    invoke-direct {p0, v1}, Lo/byp;->b(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 213
    iget-object v0, p0, Lo/byp;->f:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 214
    iget-object v0, p0, Lo/byp;->p:Lo/byp$e;

    sget-object v1, Lo/byp$e;->e:Lo/byp$e;

    if-ne v0, v1, :cond_1

    .line 215
    const-string v0, "GraphicChartView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Linestyle.Curve"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    invoke-direct {p0, p1}, Lo/byp;->e(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 217
    :cond_1
    iget-object v0, p0, Lo/byp;->p:Lo/byp$e;

    sget-object v1, Lo/byp$e;->d:Lo/byp$e;

    if-ne v0, v1, :cond_2

    .line 218
    invoke-direct {p0, p1}, Lo/byp;->c(Landroid/graphics/Canvas;)V

    .line 221
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/byp;->f:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 222
    const/4 v4, 0x0

    :goto_1
    iget-object v0, p0, Lo/byp;->j:[Landroid/graphics/Point;

    array-length v0, v0

    if-ge v4, v0, :cond_3

    .line 223
    iget-object v0, p0, Lo/byp;->j:[Landroid/graphics/Point;

    aget-object v0, v0, v4

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lo/byp;->j:[Landroid/graphics/Point;

    aget-object v1, v1, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget-object v2, p0, Lo/byp;->f:Landroid/graphics/Paint;

    const/high16 v3, 0x40a00000    # 5.0f

    invoke-virtual {p1, v0, v1, v3, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 222
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 225
    :cond_3
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 7

    .line 163
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 164
    iget-object v0, p0, Lo/byp;->D:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/byp;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 165
    :cond_0
    return-void

    .line 167
    :cond_1
    invoke-virtual {p0}, Lo/byp;->getHeight()I

    move-result v0

    iput v0, p0, Lo/byp;->o:I

    .line 168
    invoke-virtual {p0}, Lo/byp;->getWidth()I

    move-result v0

    iput v0, p0, Lo/byp;->l:I

    .line 169
    iget-object v0, p0, Lo/byp;->D:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/byp;->D:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 170
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 171
    iget-object v0, p0, Lo/byp;->b:Landroid/graphics/Paint;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v2, v1, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 172
    iget v0, p0, Lo/byp;->l:I

    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0xa

    iput v0, p0, Lo/byp;->l:I

    .line 173
    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 174
    iget-object v0, p0, Lo/byp;->b:Landroid/graphics/Paint;

    iget v1, p0, Lo/byp;->q:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lo/byp;->q:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 175
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v0

    add-int/lit8 v0, v0, 0xa

    iput v0, p0, Lo/byp;->t:I

    .line 176
    iget v0, p0, Lo/byp;->r:I

    if-nez v0, :cond_2

    .line 177
    iget v0, p0, Lo/byp;->o:I

    iget v1, p0, Lo/byp;->w:I

    sub-int/2addr v0, v1

    iput v0, p0, Lo/byp;->r:I

    .line 178
    :cond_2
    const-string v0, "GraphicChartView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mViewHeight:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/byp;->r:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    iget v0, p0, Lo/byp;->s:I

    if-nez v0, :cond_3

    .line 180
    iget v0, p0, Lo/byp;->l:I

    iget v1, p0, Lo/byp;->t:I

    sub-int/2addr v0, v1

    iput v0, p0, Lo/byp;->s:I

    .line 182
    :cond_3
    iget v0, p0, Lo/byp;->r:I

    iget v1, p0, Lo/byp;->B:I

    div-int/2addr v0, v1

    iput v0, p0, Lo/byp;->v:I

    .line 183
    iget v0, p0, Lo/byp;->t:I

    int-to-float v0, v0

    iput v0, p0, Lo/byp;->k:F

    .line 184
    iget v0, p0, Lo/byp;->r:I

    iget v1, p0, Lo/byp;->n:I

    add-int/2addr v0, v1

    iput v0, p0, Lo/byp;->u:I

    .line 185
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 189
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 192
    return-void
.end method

.method public setCurveOrLineData(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Double;>;Ljava/util/ArrayList<Ljava/lang/String;>;II)V"
        }
    .end annotation

    .line 377
    iput p3, p0, Lo/byp;->q:I

    .line 378
    iget v0, p0, Lo/byp;->e:I

    sub-int v0, p3, v0

    div-int/2addr v0, p4

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/byp;->B:I

    .line 379
    iput p4, p0, Lo/byp;->z:I

    .line 380
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Landroid/graphics/Point;

    iput-object v0, p0, Lo/byp;->j:[Landroid/graphics/Point;

    .line 381
    iput-object p1, p0, Lo/byp;->C:Ljava/util/ArrayList;

    .line 382
    iput-object p2, p0, Lo/byp;->D:Ljava/util/ArrayList;

    .line 385
    return-void
.end method

.method public setHorizontalRectF(Ljava/util/ArrayList;Ljava/util/ArrayList;IIII)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/suggestion/model/RunDataResult;>;Ljava/util/ArrayList<Ljava/lang/String;>;IIII)V"
        }
    .end annotation

    .line 389
    iput p3, p0, Lo/byp;->q:I

    .line 390
    iget v0, p0, Lo/byp;->e:I

    sub-int v0, p3, v0

    div-int/2addr v0, p4

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/byp;->B:I

    .line 391
    iput p4, p0, Lo/byp;->z:I

    .line 393
    iput p5, p0, Lo/byp;->y:I

    .line 394
    iput-object p2, p0, Lo/byp;->D:Ljava/util/ArrayList;

    .line 395
    iput p6, p0, Lo/byp;->x:I

    .line 398
    iput-object p1, p0, Lo/byp;->h:Ljava/util/ArrayList;

    .line 400
    invoke-virtual {p0}, Lo/byp;->requestLayout()V

    .line 401
    return-void
.end method

.method public setMarginb(I)V
    .locals 0

    .line 416
    iput p1, p0, Lo/byp;->w:I

    .line 417
    return-void
.end method

.method public setMargint(I)V
    .locals 0

    .line 412
    iput p1, p0, Lo/byp;->n:I

    .line 413
    return-void
.end method

.method public setMstyle(Lo/byp$e;)V
    .locals 0

    .line 420
    iput-object p1, p0, Lo/byp;->p:Lo/byp$e;

    .line 421
    return-void
.end method

.method public setPjvalue(I)V
    .locals 0

    .line 408
    iput p1, p0, Lo/byp;->z:I

    .line 409
    return-void
.end method

.method public setSecondLineYValue(I)V
    .locals 1

    .line 229
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/byp;->a:Ljava/lang/String;

    .line 230
    return-void
.end method

.method public setTotalvalue(I)V
    .locals 0

    .line 404
    iput p1, p0, Lo/byp;->q:I

    .line 405
    return-void
.end method

.method public setViewHeight(I)V
    .locals 0

    .line 424
    iput p1, p0, Lo/byp;->r:I

    .line 425
    return-void
.end method
