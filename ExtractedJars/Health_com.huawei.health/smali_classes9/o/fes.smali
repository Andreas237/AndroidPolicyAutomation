.class public Lo/fes;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fes$a;,
        Lo/fes$e;
    }
.end annotation


# instance fields
.field private A:I

.field private B:Z

.field private C:Z

.field private D:I

.field private H:I

.field private a:Z

.field private b:I

.field private c:I

.field private d:I

.field private e:Landroid/content/Context;

.field private f:Z

.field private g:I

.field private h:Z

.field private i:Z

.field private j:Landroid/widget/Scroller;

.field private k:Z

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:Landroid/graphics/Paint;

.field private q:I

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private s:I

.field private t:I

.field private u:I

.field private v:Landroid/support/v4/view/GestureDetectorCompat;

.field private w:F

.field private x:Lo/fes$a;

.field private y:F

.field private z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 85
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/fes;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 86
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 90
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 33
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fes;->a:Z

    .line 37
    const/16 v0, 0x18

    iput v0, p0, Lo/fes;->c:I

    .line 40
    const/16 v0, 0xfb

    const/16 v1, 0x65

    const/16 v2, 0x22

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Lo/fes;->d:I

    .line 41
    const v0, -0x777778

    iput v0, p0, Lo/fes;->b:I

    .line 42
    const/16 v0, 0xa

    iput v0, p0, Lo/fes;->g:I

    .line 44
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fes;->i:Z

    .line 45
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fes;->f:Z

    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fes;->h:Z

    .line 52
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fes;->k:Z

    .line 59
    const/4 v0, 0x0

    iput v0, p0, Lo/fes;->u:I

    .line 61
    const/4 v0, 0x0

    iput v0, p0, Lo/fes;->t:I

    .line 62
    const/4 v0, -0x1

    iput v0, p0, Lo/fes;->q:I

    .line 69
    const/4 v0, 0x0

    iput v0, p0, Lo/fes;->w:F

    .line 78
    const/4 v0, 0x0

    iput v0, p0, Lo/fes;->D:I

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lo/fes;->A:I

    .line 82
    const/16 v0, 0xa

    iput v0, p0, Lo/fes;->H:I

    .line 91
    iput-object p1, p0, Lo/fes;->e:Landroid/content/Context;

    .line 92
    iget-object v0, p0, Lo/fes;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->hw_show_color_text_20_persent_black:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fes;->b:I

    .line 93
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/fes;->p:Landroid/graphics/Paint;

    .line 94
    iget-object v0, p0, Lo/fes;->p:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 95
    iget-object v0, p0, Lo/fes;->p:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 96
    new-instance v0, Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {p0}, Lo/fes;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lo/fes$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lo/fes$e;-><init>(Lo/fes;Lo/fes$4;)V

    invoke-direct {v0, v1, v2}, Landroid/support/v4/view/GestureDetectorCompat;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lo/fes;->v:Landroid/support/v4/view/GestureDetectorCompat;

    .line 98
    new-instance v0, Landroid/widget/Scroller;

    invoke-virtual {p0}, Lo/fes;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/fes;->j:Landroid/widget/Scroller;

    .line 100
    const/16 v4, 0x190

    .line 101
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 102
    const/4 v6, 0x0

    :goto_0
    div-int/lit8 v0, v4, 0xa

    const/16 v0, 0x28

    if-ge v6, v0, :cond_0

    .line 103
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 106
    :cond_0
    const/4 v0, 0x5

    const/16 v1, 0x28

    invoke-direct {p0, v5, v0, v1}, Lo/fes;->d(Ljava/util/List;II)V

    .line 107
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fes;->f:Z

    .line 108
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fes;->h:Z

    .line 109
    return-void
.end method

.method private a()V
    .locals 4

    .line 507
    iget v0, p0, Lo/fes;->q:I

    iget v1, p0, Lo/fes;->o:I

    if-ne v0, v1, :cond_0

    .line 508
    return-void

    .line 510
    :cond_0
    iget v0, p0, Lo/fes;->o:I

    iput v0, p0, Lo/fes;->q:I

    .line 512
    iget-object v0, p0, Lo/fes;->x:Lo/fes$a;

    if-eqz v0, :cond_2

    .line 514
    iget-object v0, p0, Lo/fes;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 515
    iget-object v0, p0, Lo/fes;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget v1, p0, Lo/fes;->H:I

    mul-int v3, v0, v1

    .line 516
    iget-object v0, p0, Lo/fes;->x:Lo/fes$a;

    iget-object v1, p0, Lo/fes;->r:Ljava/util/List;

    iget v2, p0, Lo/fes;->o:I

    sub-int v2, v3, v2

    invoke-interface {v0, v1, v2}, Lo/fes$a;->e(Ljava/util/List;I)V

    .line 517
    goto :goto_0

    .line 518
    :cond_1
    iget-object v0, p0, Lo/fes;->x:Lo/fes$a;

    iget-object v1, p0, Lo/fes;->r:Ljava/util/List;

    iget v2, p0, Lo/fes;->o:I

    invoke-interface {v0, v1, v2}, Lo/fes$a;->e(Ljava/util/List;I)V

    .line 521
    :cond_2
    :goto_0
    return-void
.end method

.method private a(I)V
    .locals 4

    .line 268
    iget v2, p0, Lo/fes;->b:I

    .line 270
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_4

    .line 272
    :cond_0
    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    iget v0, p0, Lo/fes;->w:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    iget v0, p0, Lo/fes;->w:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 274
    :cond_2
    iget v2, p0, Lo/fes;->b:I

    goto :goto_0

    .line 276
    :cond_3
    iget v0, p0, Lo/fes;->t:I

    int-to-float v0, v0

    iget v1, p0, Lo/fes;->w:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/fes;->t:I

    int-to-float v1, v1

    div-float v3, v0, v1

    .line 278
    iget v0, p0, Lo/fes;->d:I

    iget v1, p0, Lo/fes;->b:I

    invoke-direct {p0, v0, v1, v3}, Lo/fes;->d(IIF)I

    move-result v2

    .line 279
    goto :goto_0

    .line 280
    :cond_4
    if-nez p1, :cond_5

    .line 281
    iget v0, p0, Lo/fes;->w:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Lo/fes;->t:I

    int-to-float v1, v1

    div-float v3, v0, v1

    .line 282
    iget v0, p0, Lo/fes;->d:I

    iget v1, p0, Lo/fes;->b:I

    invoke-direct {p0, v0, v1, v3}, Lo/fes;->d(IIF)I

    move-result v2

    .line 284
    :cond_5
    :goto_0
    iget-object v0, p0, Lo/fes;->p:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 285
    return-void
.end method

.method private a(Landroid/graphics/Canvas;FIIZ)V
    .locals 12

    .line 186
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Lo/fes;->b(F)I

    move-result v6

    .line 187
    new-instance v7, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {v7, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 188
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 189
    int-to-float v0, v6

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 193
    packed-switch p3, :pswitch_data_0

    goto/16 :goto_0

    .line 195
    :pswitch_0
    iget v0, p0, Lo/fes;->b:I

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 196
    new-instance v8, Landroid/graphics/Point;

    float-to-int v0, p2

    const/high16 v1, 0x42040000    # 33.0f

    invoke-direct {p0, v1}, Lo/fes;->b(F)I

    move-result v1

    div-int/lit8 v2, v6, 0x2

    add-int/2addr v1, v2

    invoke-direct {v8, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 197
    new-instance v9, Landroid/graphics/Point;

    float-to-int v0, p2

    const/high16 v1, 0x422c0000    # 43.0f

    invoke-direct {p0, v1}, Lo/fes;->b(F)I

    move-result v1

    div-int/lit8 v2, v6, 0x2

    sub-int/2addr v1, v2

    invoke-direct {v9, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 201
    move-object v0, p1

    iget v1, v8, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v8, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget v3, v9, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget v4, v9, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    move-object v5, v7

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 202
    goto/16 :goto_0

    .line 204
    :pswitch_1
    iget v0, p0, Lo/fes;->d:I

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 205
    const/4 v6, 0x5

    .line 206
    const/high16 v0, 0x40a00000    # 5.0f

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 207
    new-instance v8, Landroid/graphics/Point;

    float-to-int v0, p2

    const/high16 v1, 0x42000000    # 32.0f

    invoke-direct {p0, v1}, Lo/fes;->b(F)I

    move-result v1

    div-int/lit8 v2, v6, 0x2

    add-int/lit8 v1, v1, 0x2

    invoke-direct {v8, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 208
    new-instance v9, Landroid/graphics/Point;

    float-to-int v0, p2

    const/high16 v1, 0x422c0000    # 43.0f

    invoke-direct {p0, v1}, Lo/fes;->b(F)I

    move-result v1

    div-int/lit8 v2, v6, 0x2

    add-int/lit8 v1, v1, -0x2

    invoke-direct {v9, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 210
    iget v0, v8, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, v8, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v4

    const/high16 v2, 0x40200000    # 2.5f

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 211
    iget v0, v9, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, v9, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v4

    const/high16 v2, 0x40200000    # 2.5f

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 212
    move-object v0, p1

    iget v1, v8, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v8, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget v3, v9, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget v4, v9, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    move-object v5, v7

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 213
    goto/16 :goto_0

    .line 215
    :pswitch_2
    iget v0, p0, Lo/fes;->d:I

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 216
    const/4 v6, 0x6

    .line 217
    const/high16 v0, 0x40c00000    # 6.0f

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 218
    new-instance v8, Landroid/graphics/Point;

    float-to-int v0, p2

    const/high16 v1, 0x41f00000    # 30.0f

    invoke-direct {p0, v1}, Lo/fes;->b(F)I

    move-result v1

    div-int/lit8 v2, v6, 0x2

    add-int/lit8 v1, v1, 0x3

    invoke-direct {v8, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 219
    new-instance v9, Landroid/graphics/Point;

    float-to-int v0, p2

    const/high16 v1, 0x422c0000    # 43.0f

    invoke-direct {p0, v1}, Lo/fes;->b(F)I

    move-result v1

    div-int/lit8 v2, v6, 0x2

    add-int/lit8 v1, v1, -0x3

    invoke-direct {v9, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 221
    iget v0, v8, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, v8, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    const-wide/high16 v2, 0x4018000000000000L    # 6.0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v4

    const/high16 v2, 0x40400000    # 3.0f

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 222
    iget v0, v9, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, v9, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    const-wide/high16 v2, 0x4018000000000000L    # 6.0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v4

    const/high16 v2, 0x40400000    # 3.0f

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 223
    move-object v0, p1

    iget v1, v8, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v8, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget v3, v9, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget v4, v9, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    move-object v5, v7

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 224
    goto/16 :goto_0

    .line 226
    :pswitch_3
    iget v0, p0, Lo/fes;->d:I

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 227
    const/4 v6, 0x7

    .line 228
    const/high16 v0, 0x40e00000    # 7.0f

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 229
    new-instance v8, Landroid/graphics/Point;

    float-to-int v0, p2

    const/high16 v1, 0x41e00000    # 28.0f

    invoke-direct {p0, v1}, Lo/fes;->b(F)I

    move-result v1

    div-int/lit8 v2, v6, 0x2

    add-int/lit8 v1, v1, 0x3

    invoke-direct {v8, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 230
    new-instance v9, Landroid/graphics/Point;

    float-to-int v0, p2

    const/high16 v1, 0x422c0000    # 43.0f

    invoke-direct {p0, v1}, Lo/fes;->b(F)I

    move-result v1

    div-int/lit8 v2, v6, 0x2

    add-int/lit8 v1, v1, -0x3

    invoke-direct {v9, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 232
    iget v0, v8, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, v8, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    const-wide/high16 v2, 0x401c000000000000L    # 7.0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v4

    const/high16 v2, 0x40600000    # 3.5f

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 233
    iget v0, v9, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, v9, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    const-wide/high16 v2, 0x401c000000000000L    # 7.0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v4

    const/high16 v2, 0x40600000    # 3.5f

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 234
    move-object v0, p1

    iget v1, v8, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v8, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget v3, v9, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget v4, v9, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    move-object v5, v7

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 235
    goto/16 :goto_0

    .line 237
    :pswitch_4
    iget v0, p0, Lo/fes;->d:I

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 238
    const/16 v6, 0xa

    .line 239
    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 240
    new-instance v8, Landroid/graphics/Point;

    float-to-int v0, p2

    const/high16 v1, 0x41c80000    # 25.0f

    invoke-direct {p0, v1}, Lo/fes;->b(F)I

    move-result v1

    div-int/lit8 v2, v6, 0x2

    add-int/lit8 v1, v1, 0x5

    invoke-direct {v8, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 241
    new-instance v9, Landroid/graphics/Point;

    float-to-int v0, p2

    const/high16 v1, 0x422c0000    # 43.0f

    invoke-direct {p0, v1}, Lo/fes;->b(F)I

    move-result v1

    div-int/lit8 v2, v6, 0x2

    add-int/lit8 v1, v1, -0x5

    invoke-direct {v9, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 243
    iget v0, v8, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, v8, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v4

    const/high16 v2, 0x40a00000    # 5.0f

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 244
    iget v0, v9, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, v9, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v4

    const/high16 v2, 0x40a00000    # 5.0f

    invoke-virtual {p1, v0, v1, v2, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 245
    move-object v0, p1

    iget v1, v8, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v8, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    iget v3, v9, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    iget v4, v9, Landroid/graphics/Point;->y:I

    int-to-float v4, v4

    move-object v5, v7

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 246
    .line 253
    :goto_0
    const/high16 v0, 0x41b80000    # 23.0f

    invoke-direct {p0, v0}, Lo/fes;->b(F)I

    move-result v10

    .line 254
    iget-object v0, p0, Lo/fes;->r:Ljava/util/List;

    iget v1, p0, Lo/fes;->H:I

    div-int v1, p4, v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/String;

    .line 255
    iget v0, p0, Lo/fes;->H:I

    rem-int v0, p4, v0

    if-nez v0, :cond_0

    if-eqz p5, :cond_0

    .line 256
    iget-object v0, p0, Lo/fes;->p:Landroid/graphics/Paint;

    const/high16 v1, 0x41300000    # 11.0f

    invoke-direct {p0, v1}, Lo/fes;->b(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 257
    int-to-float v0, v10

    iget-object v1, p0, Lo/fes;->p:Landroid/graphics/Paint;

    invoke-virtual {p1, v11, p2, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 259
    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private a(Landroid/graphics/Canvas;IIIZ)V
    .locals 7

    .line 176
    iget-object v0, p0, Lo/fes;->p:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 177
    iget-object v0, p0, Lo/fes;->p:Landroid/graphics/Paint;

    iget v1, p0, Lo/fes;->c:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 179
    iget v0, p0, Lo/fes;->s:I

    iget v1, p0, Lo/fes;->t:I

    mul-int/2addr v1, p3

    add-int/2addr v0, v1

    iget v1, p0, Lo/fes;->t:I

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lo/fes;->w:F

    add-float v6, v0, v1

    .line 180
    invoke-direct {p0, p3}, Lo/fes;->a(I)V

    .line 181
    move-object v0, p0

    move-object v1, p1

    move v2, v6

    move v3, p4

    move v4, p2

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lo/fes;->a(Landroid/graphics/Canvas;FIIZ)V

    .line 182
    return-void
.end method

.method static synthetic a(Lo/fes;)Z
    .locals 1

    .line 32
    iget-boolean v0, p0, Lo/fes;->a:Z

    return v0
.end method

.method private b(F)I
    .locals 3

    .line 695
    iget-object v0, p0, Lo/fes;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 696
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private b(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 620
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 622
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v3, v0, -0x1

    :goto_0
    if-ltz v3, :cond_0

    .line 623
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 622
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    .line 626
    :cond_0
    return-object v2
.end method

.method private b()V
    .locals 3

    .line 387
    const/4 v2, 0x0

    .line 388
    iget-boolean v0, p0, Lo/fes;->a:Z

    if-eqz v0, :cond_0

    .line 389
    iget v2, p0, Lo/fes;->t:I

    goto :goto_0

    .line 391
    :cond_0
    iget v2, p0, Lo/fes;->u:I

    .line 393
    :goto_0
    iget v0, p0, Lo/fes;->w:F

    int-to-float v1, v2

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_4

    .line 394
    iget v0, p0, Lo/fes;->o:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fes;->o:I

    .line 395
    iget v0, p0, Lo/fes;->o:I

    if-gez v0, :cond_3

    .line 396
    iget-boolean v0, p0, Lo/fes;->f:Z

    if-eqz v0, :cond_1

    .line 397
    iget v0, p0, Lo/fes;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fes;->o:I

    .line 398
    const/4 v0, 0x0

    iput v0, p0, Lo/fes;->w:F

    goto/16 :goto_1

    .line 400
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lo/fes;->o:I

    .line 401
    int-to-float v0, v2

    iput v0, p0, Lo/fes;->w:F

    .line 402
    iget-boolean v0, p0, Lo/fes;->B:Z

    if-eqz v0, :cond_2

    .line 403
    iget-object v0, p0, Lo/fes;->j:Landroid/widget/Scroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 405
    :cond_2
    iget-boolean v0, p0, Lo/fes;->C:Z

    if-eqz v0, :cond_8

    .line 406
    iget v0, p0, Lo/fes;->w:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/fes;->d(FI)V

    goto :goto_1

    .line 410
    :cond_3
    const/4 v0, 0x0

    iput v0, p0, Lo/fes;->w:F

    goto :goto_1

    .line 413
    :cond_4
    iget v0, p0, Lo/fes;->w:F

    neg-int v1, v2

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_8

    .line 414
    iget v0, p0, Lo/fes;->o:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fes;->o:I

    .line 415
    iget v0, p0, Lo/fes;->o:I

    iget v1, p0, Lo/fes;->m:I

    if-lt v0, v1, :cond_7

    .line 416
    iget-boolean v0, p0, Lo/fes;->f:Z

    if-eqz v0, :cond_5

    .line 417
    const/4 v0, 0x0

    iput v0, p0, Lo/fes;->o:I

    .line 418
    const/4 v0, 0x0

    iput v0, p0, Lo/fes;->w:F

    goto :goto_1

    .line 420
    :cond_5
    iget v0, p0, Lo/fes;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fes;->o:I

    .line 421
    neg-int v0, v2

    int-to-float v0, v0

    iput v0, p0, Lo/fes;->w:F

    .line 422
    iget-boolean v0, p0, Lo/fes;->B:Z

    if-eqz v0, :cond_6

    .line 423
    iget-object v0, p0, Lo/fes;->j:Landroid/widget/Scroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 425
    :cond_6
    iget-boolean v0, p0, Lo/fes;->C:Z

    if-eqz v0, :cond_8

    .line 426
    iget v0, p0, Lo/fes;->w:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/fes;->d(FI)V

    goto :goto_1

    .line 430
    :cond_7
    const/4 v0, 0x0

    iput v0, p0, Lo/fes;->w:F

    .line 433
    :cond_8
    :goto_1
    invoke-direct {p0}, Lo/fes;->a()V

    .line 434
    return-void
.end method

.method private b(FF)V
    .locals 9

    .line 489
    iget-boolean v0, p0, Lo/fes;->a:Z

    if-eqz v0, :cond_0

    .line 490
    float-to-int v0, p1

    iput v0, p0, Lo/fes;->A:I

    .line 491
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fes;->B:Z

    .line 493
    iget-object v0, p0, Lo/fes;->j:Landroid/widget/Scroller;

    float-to-int v1, p1

    float-to-int v3, p2

    iget v2, p0, Lo/fes;->t:I

    mul-int/lit16 v5, v2, -0x3e8

    iget v2, p0, Lo/fes;->t:I

    mul-int/lit16 v6, v2, 0x3e8

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 495
    invoke-virtual {p0}, Lo/fes;->invalidate()V

    goto :goto_0

    .line 497
    :cond_0
    float-to-int v0, p1

    iput v0, p0, Lo/fes;->D:I

    .line 498
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fes;->B:Z

    .line 500
    iget-object v0, p0, Lo/fes;->j:Landroid/widget/Scroller;

    float-to-int v2, p1

    float-to-int v4, p2

    iget v1, p0, Lo/fes;->u:I

    mul-int/lit8 v7, v1, -0xa

    iget v1, p0, Lo/fes;->u:I

    mul-int/lit8 v8, v1, 0xa

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 502
    invoke-virtual {p0}, Lo/fes;->invalidate()V

    .line 504
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/fes;)Z
    .locals 1

    .line 32
    iget-boolean v0, p0, Lo/fes;->i:Z

    return v0
.end method

.method static synthetic c(Lo/fes;)F
    .locals 1

    .line 32
    iget v0, p0, Lo/fes;->w:F

    return v0
.end method

.method static synthetic c(Lo/fes;FF)V
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2}, Lo/fes;->b(FF)V

    return-void
.end method

.method private d(IIF)I
    .locals 9

    .line 672
    const/4 v0, 0x0

    cmpg-float v0, p3, v0

    if-gez v0, :cond_0

    .line 673
    const/4 p3, 0x0

    .line 675
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p3, v0

    if-lez v0, :cond_1

    .line 676
    const/high16 p3, 0x3f800000    # 1.0f

    .line 679
    :cond_1
    invoke-static {p2}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    sub-int v5, v0, v1

    .line 680
    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v1

    sub-int v6, v0, v1

    .line 681
    invoke-static {p2}, Landroid/graphics/Color;->green(I)I

    move-result v0

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    sub-int v7, v0, v1

    .line 682
    invoke-static {p2}, Landroid/graphics/Color;->blue(I)I

    move-result v0

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    sub-int v8, v0, v1

    .line 684
    .line 685
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    int-to-float v0, v0

    int-to-float v1, v5

    mul-float/2addr v1, p3

    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 686
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v1

    int-to-float v1, v1

    int-to-float v2, v6

    mul-float/2addr v2, p3

    add-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 687
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v2

    int-to-float v2, v2

    int-to-float v3, v7

    mul-float/2addr v3, p3

    add-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 688
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    int-to-float v3, v3

    int-to-float v4, v8

    mul-float/2addr v4, p3

    add-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 684
    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0
.end method

.method private d()V
    .locals 1

    .line 381
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fes;->C:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fes;->B:Z

    .line 382
    iget-object v0, p0, Lo/fes;->j:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 383
    return-void
.end method

.method private d(FI)V
    .locals 5

    .line 471
    iget-boolean v0, p0, Lo/fes;->a:Z

    if-eqz v0, :cond_0

    .line 472
    float-to-int v0, p1

    iput v0, p0, Lo/fes;->A:I

    .line 473
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fes;->C:Z

    .line 474
    iget-object v0, p0, Lo/fes;->j:Landroid/widget/Scroller;

    float-to-int v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/Scroller;->startScroll(IIII)V

    .line 475
    iget-object v0, p0, Lo/fes;->j:Landroid/widget/Scroller;

    invoke-virtual {v0, p2}, Landroid/widget/Scroller;->setFinalX(I)V

    .line 477
    invoke-virtual {p0}, Lo/fes;->invalidate()V

    goto :goto_0

    .line 479
    :cond_0
    float-to-int v0, p1

    iput v0, p0, Lo/fes;->D:I

    .line 480
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fes;->C:Z

    .line 481
    iget-object v0, p0, Lo/fes;->j:Landroid/widget/Scroller;

    float-to-int v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/widget/Scroller;->startScroll(IIII)V

    .line 482
    iget-object v0, p0, Lo/fes;->j:Landroid/widget/Scroller;

    invoke-virtual {v0, p2}, Landroid/widget/Scroller;->setFinalY(I)V

    .line 483
    invoke-virtual {p0}, Lo/fes;->invalidate()V

    .line 485
    :goto_0
    return-void
.end method

.method private d(Ljava/util/List;II)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;II)V"
        }
    .end annotation

    .line 553
    if-nez p1, :cond_0

    .line 554
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fes;->r:Ljava/util/List;

    .line 556
    :cond_0
    const-string v0, "InputWeightActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ratio = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; avaliablecount="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 558
    iget-object v0, p0, Lo/fes;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 559
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 560
    invoke-direct {p0, p1}, Lo/fes;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/fes;->r:Ljava/util/List;

    .line 562
    :cond_1
    const-string v0, "InputWeightActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "This language is a mirror language"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 564
    :cond_2
    iput-object p1, p0, Lo/fes;->r:Ljava/util/List;

    .line 566
    :goto_0
    iput p2, p0, Lo/fes;->H:I

    .line 567
    iget-object v0, p0, Lo/fes;->r:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/fes;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 568
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fes;->r:Ljava/util/List;

    .line 569
    const/4 v0, 0x0

    iput v0, p0, Lo/fes;->m:I

    goto :goto_1

    .line 571
    :cond_4
    iget-object v0, p0, Lo/fes;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    mul-int/2addr v0, p2

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fes;->m:I

    .line 573
    :goto_1
    const-string v0, "InputWeightActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mSumScale=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/fes;->m:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 575
    iput p3, p0, Lo/fes;->g:I

    .line 576
    iget v0, p0, Lo/fes;->g:I

    if-gez v0, :cond_5

    .line 577
    const/4 v0, 0x0

    iput v0, p0, Lo/fes;->g:I

    .line 579
    :cond_5
    invoke-virtual {p0}, Lo/fes;->invalidate()V

    .line 580
    return-void
.end method

.method static synthetic d(Lo/fes;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lo/fes;->d()V

    return-void
.end method

.method private e()V
    .locals 6

    .line 439
    iget-object v0, p0, Lo/fes;->j:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/fes;->B:Z

    if-eqz v0, :cond_1

    .line 440
    :cond_0
    return-void

    .line 442
    :cond_1
    invoke-direct {p0}, Lo/fes;->d()V

    .line 444
    const/4 v5, 0x0

    .line 445
    iget-boolean v0, p0, Lo/fes;->a:Z

    if-eqz v0, :cond_2

    .line 446
    iget v5, p0, Lo/fes;->t:I

    goto :goto_0

    .line 448
    :cond_2
    iget v5, p0, Lo/fes;->u:I

    .line 450
    :goto_0
    const-string v0, "value"

    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 453
    iget v0, p0, Lo/fes;->w:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_4

    .line 454
    iget v0, p0, Lo/fes;->w:F

    int-to-double v1, v5

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    div-double/2addr v1, v3

    double-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 455
    iget v0, p0, Lo/fes;->w:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/fes;->d(FI)V

    goto :goto_1

    .line 457
    :cond_3
    iget v0, p0, Lo/fes;->w:F

    invoke-direct {p0, v0, v5}, Lo/fes;->d(FI)V

    goto :goto_1

    .line 460
    :cond_4
    iget v0, p0, Lo/fes;->w:F

    neg-float v0, v0

    int-to-double v1, v5

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    div-double/2addr v1, v3

    double-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_5

    .line 461
    iget v0, p0, Lo/fes;->w:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/fes;->d(FI)V

    goto :goto_1

    .line 463
    :cond_5
    iget v0, p0, Lo/fes;->w:F

    neg-int v1, v5

    invoke-direct {p0, v0, v1}, Lo/fes;->d(FI)V

    .line 466
    :goto_1
    return-void
.end method


# virtual methods
.method public computeScroll()V
    .locals 2

    .line 356
    iget-object v0, p0, Lo/fes;->j:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 358
    iget-boolean v0, p0, Lo/fes;->a:Z

    if-eqz v0, :cond_0

    .line 359
    iget v0, p0, Lo/fes;->w:F

    iget-object v1, p0, Lo/fes;->j:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrX()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    iget v1, p0, Lo/fes;->A:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/fes;->w:F

    .line 360
    iget-object v0, p0, Lo/fes;->j:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I

    move-result v0

    iput v0, p0, Lo/fes;->A:I

    goto :goto_0

    .line 362
    :cond_0
    iget v0, p0, Lo/fes;->w:F

    iget-object v1, p0, Lo/fes;->j:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrY()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    iget v1, p0, Lo/fes;->D:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iput v0, p0, Lo/fes;->w:F

    .line 363
    iget-object v0, p0, Lo/fes;->j:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    move-result v0

    iput v0, p0, Lo/fes;->D:I

    .line 366
    :goto_0
    invoke-direct {p0}, Lo/fes;->b()V

    .line 367
    invoke-virtual {p0}, Lo/fes;->invalidate()V

    goto :goto_1

    .line 369
    :cond_1
    iget-boolean v0, p0, Lo/fes;->B:Z

    if-eqz v0, :cond_2

    .line 370
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fes;->B:Z

    .line 371
    invoke-direct {p0}, Lo/fes;->e()V

    goto :goto_1

    .line 372
    :cond_2
    iget-boolean v0, p0, Lo/fes;->C:Z

    if-eqz v0, :cond_3

    .line 373
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fes;->C:Z

    .line 374
    invoke-direct {p0}, Lo/fes;->a()V

    .line 378
    :cond_3
    :goto_1
    return-void
.end method

.method public getListener()Lo/fes$a;
    .locals 1

    .line 651
    iget-object v0, p0, Lo/fes;->x:Lo/fes$a;

    return-object v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 115
    iget v0, p0, Lo/fes;->g:I

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v6, v0, 0x1

    .line 118
    const/4 v8, 0x1

    :goto_0
    if-gt v8, v6, :cond_6

    iget v0, p0, Lo/fes;->m:I

    div-int/lit8 v0, v0, 0x2

    if-gt v8, v0, :cond_6

    .line 121
    iget v0, p0, Lo/fes;->o:I

    sub-int/2addr v0, v8

    if-gez v0, :cond_0

    iget v0, p0, Lo/fes;->m:I

    iget v1, p0, Lo/fes;->o:I

    add-int/2addr v0, v1

    sub-int v7, v0, v8

    goto :goto_1

    :cond_0
    iget v0, p0, Lo/fes;->o:I

    sub-int v7, v0, v8

    .line 123
    :goto_1
    iget-boolean v0, p0, Lo/fes;->f:Z

    if-eqz v0, :cond_1

    .line 124
    move-object v0, p0

    move-object v1, p1

    move v2, v7

    neg-int v3, v8

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/fes;->a(Landroid/graphics/Canvas;IIIZ)V

    goto :goto_2

    .line 125
    :cond_1
    iget v0, p0, Lo/fes;->o:I

    sub-int/2addr v0, v8

    if-ltz v0, :cond_2

    .line 126
    move-object v0, p0

    move-object v1, p1

    move v2, v7

    neg-int v3, v8

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/fes;->a(Landroid/graphics/Canvas;IIIZ)V

    .line 130
    :cond_2
    :goto_2
    iget v0, p0, Lo/fes;->o:I

    add-int/2addr v0, v8

    iget v1, p0, Lo/fes;->m:I

    if-lt v0, v1, :cond_3

    iget v0, p0, Lo/fes;->o:I

    add-int/2addr v0, v8

    iget v1, p0, Lo/fes;->m:I

    sub-int v7, v0, v1

    goto :goto_3

    :cond_3
    iget v0, p0, Lo/fes;->o:I

    add-int v7, v0, v8

    .line 132
    :goto_3
    iget-boolean v0, p0, Lo/fes;->f:Z

    if-eqz v0, :cond_4

    .line 133
    move-object v0, p0

    move-object v1, p1

    move v2, v7

    move v3, v8

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/fes;->a(Landroid/graphics/Canvas;IIIZ)V

    goto :goto_4

    .line 134
    :cond_4
    iget v0, p0, Lo/fes;->o:I

    add-int/2addr v0, v8

    iget v1, p0, Lo/fes;->m:I

    if-ge v0, v1, :cond_5

    .line 135
    move-object v0, p0

    move-object v1, p1

    move v2, v7

    move v3, v8

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/fes;->a(Landroid/graphics/Canvas;IIIZ)V

    .line 118
    :cond_5
    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 140
    :cond_6
    iget v0, p0, Lo/fes;->o:I

    add-int/lit8 v0, v0, -0x3

    if-lez v0, :cond_7

    .line 141
    move-object v0, p0

    move-object v1, p1

    iget v2, p0, Lo/fes;->o:I

    const/4 v3, -0x3

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/fes;->a(Landroid/graphics/Canvas;IIIZ)V

    .line 143
    :cond_7
    iget v0, p0, Lo/fes;->o:I

    add-int/lit8 v0, v0, -0x2

    if-lez v0, :cond_8

    .line 144
    move-object v0, p0

    move-object v1, p1

    iget v2, p0, Lo/fes;->o:I

    const/4 v3, -0x2

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/fes;->a(Landroid/graphics/Canvas;IIIZ)V

    .line 146
    :cond_8
    iget v0, p0, Lo/fes;->o:I

    add-int/lit8 v0, v0, -0x1

    if-lez v0, :cond_9

    .line 147
    move-object v0, p0

    move-object v1, p1

    iget v2, p0, Lo/fes;->o:I

    const/4 v3, -0x1

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/fes;->a(Landroid/graphics/Canvas;IIIZ)V

    .line 149
    :cond_9
    move-object v0, p0

    move-object v1, p1

    iget v2, p0, Lo/fes;->o:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/fes;->a(Landroid/graphics/Canvas;IIIZ)V

    .line 150
    iget v0, p0, Lo/fes;->o:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lo/fes;->m:I

    if-ge v0, v1, :cond_a

    .line 151
    move-object v0, p0

    move-object v1, p1

    iget v2, p0, Lo/fes;->o:I

    const/4 v3, 0x1

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/fes;->a(Landroid/graphics/Canvas;IIIZ)V

    .line 153
    :cond_a
    iget v0, p0, Lo/fes;->o:I

    add-int/lit8 v0, v0, 0x2

    iget v1, p0, Lo/fes;->m:I

    if-ge v0, v1, :cond_b

    .line 154
    move-object v0, p0

    move-object v1, p1

    iget v2, p0, Lo/fes;->o:I

    const/4 v3, 0x2

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/fes;->a(Landroid/graphics/Canvas;IIIZ)V

    .line 156
    :cond_b
    iget v0, p0, Lo/fes;->o:I

    add-int/lit8 v0, v0, 0x3

    iget v1, p0, Lo/fes;->m:I

    if-ge v0, v1, :cond_c

    .line 157
    move-object v0, p0

    move-object v1, p1

    iget v2, p0, Lo/fes;->o:I

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/fes;->a(Landroid/graphics/Canvas;IIIZ)V

    .line 159
    :cond_c
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 289
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 290
    invoke-virtual {p0}, Lo/fes;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lo/fes;->n:I

    .line 291
    invoke-virtual {p0}, Lo/fes;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lo/fes;->l:I

    .line 292
    iget v0, p0, Lo/fes;->l:I

    iget v1, p0, Lo/fes;->g:I

    div-int/2addr v0, v1

    iput v0, p0, Lo/fes;->u:I

    .line 293
    iget v0, p0, Lo/fes;->n:I

    iget v1, p0, Lo/fes;->g:I

    div-int/2addr v0, v1

    iput v0, p0, Lo/fes;->t:I

    .line 294
    iget v0, p0, Lo/fes;->g:I

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lo/fes;->t:I

    mul-int/2addr v0, v1

    iput v0, p0, Lo/fes;->s:I

    .line 296
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 301
    iget-object v0, p0, Lo/fes;->v:Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/GestureDetectorCompat;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 302
    iget-boolean v0, p0, Lo/fes;->k:Z

    if-nez v0, :cond_0

    .line 303
    const/4 v0, 0x0

    return v0

    .line 305
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 307
    :pswitch_0
    iget-boolean v0, p0, Lo/fes;->h:Z

    if-eqz v0, :cond_1

    .line 308
    invoke-virtual {p0}, Lo/fes;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    .line 309
    if-eqz v3, :cond_1

    .line 310
    const/4 v0, 0x1

    invoke-interface {v3, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 314
    :cond_1
    invoke-direct {p0}, Lo/fes;->d()V

    .line 315
    iget-boolean v0, p0, Lo/fes;->a:Z

    if-eqz v0, :cond_2

    .line 316
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lo/fes;->z:F

    goto/16 :goto_2

    .line 318
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/fes;->y:F

    .line 321
    goto/16 :goto_2

    .line 323
    :pswitch_1
    iget-boolean v0, p0, Lo/fes;->a:Z

    if-eqz v0, :cond_4

    .line 324
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Lo/fes;->z:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x3dcccccd    # 0.1f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 325
    const/4 v0, 0x1

    return v0

    .line 327
    :cond_3
    iget v0, p0, Lo/fes;->w:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iget v2, p0, Lo/fes;->z:F

    sub-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/fes;->w:F

    .line 328
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lo/fes;->z:F

    goto :goto_0

    .line 330
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget v1, p0, Lo/fes;->y:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x3dcccccd    # 0.1f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_5

    .line 331
    const/4 v0, 0x1

    return v0

    .line 333
    :cond_5
    iget v0, p0, Lo/fes;->w:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget v2, p0, Lo/fes;->y:F

    sub-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lo/fes;->w:F

    .line 334
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/fes;->y:F

    .line 337
    :goto_0
    invoke-direct {p0}, Lo/fes;->b()V

    .line 338
    invoke-virtual {p0}, Lo/fes;->invalidate()V

    .line 339
    goto :goto_2

    .line 341
    :pswitch_2
    iget-boolean v0, p0, Lo/fes;->a:Z

    if-eqz v0, :cond_6

    .line 342
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lo/fes;->z:F

    goto :goto_1

    .line 344
    :cond_6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/fes;->y:F

    .line 346
    :goto_1
    invoke-direct {p0}, Lo/fes;->e()V

    .line 347
    .line 351
    :goto_2
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setData(Ljava/util/List;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;II)V"
        }
    .end annotation

    .line 590
    if-nez p1, :cond_0

    .line 591
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fes;->r:Ljava/util/List;

    .line 594
    :cond_0
    iget-object v0, p0, Lo/fes;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 596
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 597
    invoke-direct {p0, p1}, Lo/fes;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/fes;->r:Ljava/util/List;

    goto :goto_0

    .line 601
    :cond_1
    iput-object p1, p0, Lo/fes;->r:Ljava/util/List;

    .line 604
    :cond_2
    :goto_0
    iput p2, p0, Lo/fes;->H:I

    .line 605
    iget-object v0, p0, Lo/fes;->r:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/fes;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 606
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fes;->r:Ljava/util/List;

    .line 607
    const/4 v0, 0x0

    iput v0, p0, Lo/fes;->m:I

    goto :goto_1

    .line 609
    :cond_4
    iget-object v0, p0, Lo/fes;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    mul-int/2addr v0, p2

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fes;->m:I

    .line 612
    :goto_1
    iput p3, p0, Lo/fes;->g:I

    .line 613
    iget v0, p0, Lo/fes;->g:I

    if-gez v0, :cond_5

    .line 614
    const/4 v0, 0x0

    iput v0, p0, Lo/fes;->g:I

    .line 616
    :cond_5
    invoke-virtual {p0}, Lo/fes;->invalidate()V

    .line 617
    return-void
.end method

.method public setNoScroll(Z)V
    .locals 3

    .line 161
    iput-boolean p1, p0, Lo/fes;->k:Z

    .line 162
    if-eqz p1, :cond_0

    .line 163
    const/16 v0, 0xfb

    const/16 v1, 0x65

    const/16 v2, 0x22

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Lo/fes;->d:I

    goto :goto_0

    .line 165
    :cond_0
    const v0, -0x777778

    iput v0, p0, Lo/fes;->d:I

    .line 167
    :goto_0
    invoke-virtual {p0}, Lo/fes;->invalidate()V

    .line 168
    return-void
.end method

.method public setOnSelectedListener(Lo/fes$a;)V
    .locals 0

    .line 647
    iput-object p1, p0, Lo/fes;->x:Lo/fes$a;

    .line 648
    return-void
.end method

.method public setSelectedPosition(I)V
    .locals 3

    .line 632
    iget-object v0, p0, Lo/fes;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 633
    iget-object v0, p0, Lo/fes;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget v1, p0, Lo/fes;->H:I

    mul-int v2, v0, v1

    .line 634
    sub-int p1, v2, p1

    .line 637
    :cond_0
    if-ltz p1, :cond_1

    iget v0, p0, Lo/fes;->m:I

    add-int/lit8 v0, v0, -0x1

    if-gt p1, v0, :cond_1

    iget v0, p0, Lo/fes;->o:I

    if-ne p1, v0, :cond_2

    .line 639
    :cond_1
    return-void

    .line 641
    :cond_2
    iput p1, p0, Lo/fes;->o:I

    .line 642
    invoke-virtual {p0}, Lo/fes;->invalidate()V

    .line 643
    invoke-direct {p0}, Lo/fes;->a()V

    .line 644
    return-void
.end method
