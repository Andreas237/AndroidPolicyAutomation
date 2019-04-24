.class public Lo/epq;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field private static a:I

.field private static final d:Ljava/lang/String;

.field private static final j:[I


# instance fields
.field private A:F

.field private B:F

.field private C:F

.field private D:F

.field private F:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/graphics/RectF;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private c:I

.field e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private f:F

.field private g:I

.field private h:I

.field private i:Landroid/content/Context;

.field private k:I

.field private l:[F

.field private m:F

.field private n:I

.field private o:Landroid/graphics/Paint;

.field private p:I

.field private q:I

.field private r:I

.field private s:Ljava/lang/String;

.field private t:I

.field private u:I

.field private v:F

.field private w:Landroid/graphics/Typeface;

.field private x:F

.field private y:Landroid/graphics/RectF;

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    const-class v0, Lo/epq;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/epq;->d:Ljava/lang/String;

    .line 44
    const/16 v0, 0x4e20

    sput v0, Lo/epq;->a:I

    .line 92
    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/epq;->j:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x18
        0x24
        0x14
        0x2c
        0x1c
        0x14
        0x1c
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 97
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/epq;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 98
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 101
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epq;->e:Ljava/util/List;

    .line 48
    const/16 v0, 0x18

    iput v0, p0, Lo/epq;->c:I

    .line 50
    const/16 v0, 0x12c

    iput v0, p0, Lo/epq;->k:I

    .line 52
    const/16 v0, 0x64

    iput v0, p0, Lo/epq;->g:I

    .line 53
    const/16 v0, 0x96

    iput v0, p0, Lo/epq;->h:I

    .line 54
    const/high16 v0, 0x41400000    # 12.0f

    iput v0, p0, Lo/epq;->f:F

    .line 56
    const/16 v0, 0x30

    new-array v0, v0, [F

    iput-object v0, p0, Lo/epq;->l:[F

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epq;->o:Landroid/graphics/Paint;

    .line 59
    invoke-direct {p0}, Lo/epq;->getScreenWidth()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/epq;->m:F

    .line 60
    const/4 v0, 0x0

    iput v0, p0, Lo/epq;->n:I

    .line 63
    const/16 v0, 0x2a

    iput v0, p0, Lo/epq;->p:I

    .line 64
    const/4 v0, 0x3

    iput v0, p0, Lo/epq;->q:I

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lo/epq;->u:I

    .line 67
    const-string v0, ""

    iput-object v0, p0, Lo/epq;->s:Ljava/lang/String;

    .line 69
    const/high16 v0, -0x1000000

    iput v0, p0, Lo/epq;->t:I

    .line 71
    const/4 v0, 0x1

    iput v0, p0, Lo/epq;->r:I

    .line 72
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo/epq;->y:Landroid/graphics/RectF;

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lo/epq;->v:F

    .line 76
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epq;->w:Landroid/graphics/Typeface;

    .line 79
    const/16 v0, 0x5a

    iput v0, p0, Lo/epq;->z:I

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lo/epq;->x:F

    .line 82
    const/4 v0, 0x0

    iput v0, p0, Lo/epq;->A:F

    .line 83
    const/high16 v0, 0x42100000    # 36.0f

    iput v0, p0, Lo/epq;->D:F

    .line 85
    const/4 v0, 0x0

    iput v0, p0, Lo/epq;->C:F

    .line 89
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/epq;->B:F

    .line 94
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x30

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lo/epq;->F:Ljava/util/ArrayList;

    .line 103
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/epq;->o:Landroid/graphics/Paint;

    .line 104
    iget-object v0, p0, Lo/epq;->o:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 106
    iput-object p1, p0, Lo/epq;->i:Landroid/content/Context;

    .line 108
    invoke-direct {p0}, Lo/epq;->getScreenWidth()I

    move-result v0

    iget-object v1, p0, Lo/epq;->i:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_32:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lo/epq;->n:I

    .line 109
    iget v0, p0, Lo/epq;->n:I

    int-to-float v0, v0

    const/high16 v1, 0x42400000    # 48.0f

    div-float/2addr v0, v1

    iput v0, p0, Lo/epq;->x:F

    .line 111
    iget-object v0, p0, Lo/epq;->i:Landroid/content/Context;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-direct {p0, v0, v1}, Lo/epq;->d(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/epq;->C:F

    .line 112
    iget-object v0, p0, Lo/epq;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_14:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/epq;->p:I

    .line 113
    iget-object v0, p0, Lo/epq;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/epq;->q:I

    .line 114
    iget-object v0, p0, Lo/epq;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/epq;->f:F

    .line 115
    iget-object v0, p0, Lo/epq;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_40:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/epq;->g:I

    .line 116
    iget-object v0, p0, Lo/epq;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_100:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/epq;->h:I

    .line 117
    iget-object v0, p0, Lo/epq;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_17:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/epq;->D:F

    .line 119
    iget-object v0, p0, Lo/epq;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_8:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/epq;->c:I

    .line 120
    invoke-virtual {p0}, Lo/epq;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_11_sp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/epq;->z:I

    .line 121
    iget-object v0, p0, Lo/epq;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$color;->hw_show_color_text_50_persent_black:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/epq;->t:I

    .line 122
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 7

    .line 162
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 163
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 164
    invoke-virtual {p0}, Lo/epq;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$color;->hw_show_color_text_100_persent_black:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 165
    invoke-virtual {p0}, Lo/epq;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_11_sp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 168
    iget v0, p0, Lo/epq;->A:F

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-direct {p0, v0}, Lo/epq;->d(F)Ljava/lang/String;

    move-result-object v5

    .line 170
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v6

    .line 173
    sget-object v0, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 181
    iget-object v0, p0, Lo/epq;->y:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    iget v1, p0, Lo/epq;->f:F

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/epq;->y:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    iget-object v2, p0, Lo/epq;->i:Landroid/content/Context;

    .line 182
    const/high16 v3, 0x40c00000    # 6.0f

    invoke-direct {p0, v2, v3}, Lo/epq;->d(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    .line 181
    invoke-virtual {p1, v5, v0, v1, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 183
    return-void
.end method

.method private b(Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 3

    .line 232
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    iget v1, p1, Landroid/graphics/RectF;->top:F

    sub-float v2, v0, v1

    .line 233
    const/4 v0, 0x0

    cmpl-float v0, v2, v0

    if-ltz v0, :cond_0

    iget v0, p0, Lo/epq;->q:I

    int-to-float v0, v0

    cmpg-float v0, v2, v0

    if-gez v0, :cond_0

    .line 234
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    iget v1, p0, Lo/epq;->q:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iput v0, p1, Landroid/graphics/RectF;->top:F

    .line 236
    :cond_0
    return-object p1
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 6

    .line 288
    iget-object v0, p0, Lo/epq;->o:Landroid/graphics/Paint;

    iget v1, p0, Lo/epq;->t:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 291
    iget-object v0, p0, Lo/epq;->o:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/epq;->w:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 296
    iget-object v0, p0, Lo/epq;->o:Landroid/graphics/Paint;

    iget v1, p0, Lo/epq;->z:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 297
    iget-object v0, p0, Lo/epq;->o:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 298
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lo/epq;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 301
    iget-object v0, p0, Lo/epq;->e:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 302
    iget-object v0, p0, Lo/epq;->o:Landroid/graphics/Paint;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v5

    .line 303
    iget-object v0, p0, Lo/epq;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 304
    iget v0, p0, Lo/epq;->n:I

    int-to-float v0, v0

    iget v1, p0, Lo/epq;->C:F

    iget v2, p0, Lo/epq;->f:F

    add-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    const/high16 v1, 0x40c00000    # 6.0f

    div-float/2addr v0, v1

    rsub-int/lit8 v1, v3, 0x6

    int-to-float v1, v1

    mul-float/2addr v0, v1

    iget v1, p0, Lo/epq;->C:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/epq;->c:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v5, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/epq;->k:I

    iget v2, p0, Lo/epq;->p:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epq;->o:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 306
    :cond_0
    iget v0, p0, Lo/epq;->n:I

    int-to-float v0, v0

    iget v1, p0, Lo/epq;->C:F

    iget v2, p0, Lo/epq;->f:F

    add-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    const/high16 v1, 0x40c00000    # 6.0f

    div-float/2addr v0, v1

    int-to-float v1, v3

    mul-float/2addr v0, v1

    iget v1, p0, Lo/epq;->C:F

    add-float/2addr v0, v1

    iget v1, p0, Lo/epq;->c:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v5, v1

    sub-float/2addr v0, v1

    iget v1, p0, Lo/epq;->k:I

    iget v2, p0, Lo/epq;->p:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epq;->o:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 298
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 314
    :cond_1
    return-void
.end method

.method private b(Landroid/graphics/Canvas;I)V
    .locals 16

    .line 367
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 368
    invoke-virtual/range {p0 .. p0}, Lo/epq;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$color;->hw_show_public_histogram_empty_start:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    .line 369
    invoke-virtual/range {p0 .. p0}, Lo/epq;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$color;->hw_show_public_histogram_empty_end:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v10

    .line 372
    move/from16 v11, p2

    :goto_0
    const/4 v0, 0x7

    if-ge v11, v0, :cond_2

    .line 373
    move-object/from16 v0, p0

    iget v0, v0, Lo/epq;->u:I

    add-int v12, v0, v11

    .line 375
    sget-object v0, Lo/epq;->j:[I

    array-length v0, v0

    if-ge v12, v0, :cond_1

    .line 376
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epq;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 377
    rsub-int/lit8 v0, v11, 0x6

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/epq;->c(I)Landroid/graphics/RectF;

    move-result-object v13

    goto :goto_1

    .line 380
    :cond_0
    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lo/epq;->c(I)Landroid/graphics/RectF;

    move-result-object v13

    .line 383
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epq;->F:Ljava/util/ArrayList;

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1, v13}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    invoke-virtual {v0, v11, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 384
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 385
    new-instance v0, Landroid/graphics/LinearGradient;

    iget v1, v13, Landroid/graphics/RectF;->left:F

    iget v2, v13, Landroid/graphics/RectF;->bottom:F

    iget v3, v13, Landroid/graphics/RectF;->right:F

    iget v4, v13, Landroid/graphics/RectF;->top:F

    move v5, v9

    move v6, v10

    sget-object v7, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    move-object v14, v0

    .line 386
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 387
    invoke-virtual {v8, v14}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 388
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 389
    move-object/from16 v0, p1

    invoke-virtual {v0, v13, v8}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 391
    new-instance v15, Landroid/graphics/RectF;

    invoke-direct {v15}, Landroid/graphics/RectF;-><init>()V

    .line 392
    iget v0, v13, Landroid/graphics/RectF;->left:F

    iget v1, v13, Landroid/graphics/RectF;->top:F

    move-object/from16 v2, p0

    iget v2, v2, Lo/epq;->f:F

    sub-float/2addr v1, v2

    iget v2, v13, Landroid/graphics/RectF;->right:F

    iget v3, v13, Landroid/graphics/RectF;->top:F

    move-object/from16 v4, p0

    iget v4, v4, Lo/epq;->f:F

    add-float/2addr v3, v4

    invoke-virtual {v15, v0, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 393
    invoke-virtual {v8, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 395
    move-object/from16 v0, p1

    move-object v1, v15

    move-object v5, v8

    const/high16 v2, 0x43340000    # 180.0f

    const/high16 v3, 0x43340000    # 180.0f

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 372
    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 399
    :cond_2
    return-void
.end method

.method private c(I)Landroid/graphics/RectF;
    .locals 7

    .line 402
    const/4 v4, 0x0

    .line 404
    int-to-float v0, p1

    iget v1, p0, Lo/epq;->n:I

    int-to-float v1, v1

    iget v2, p0, Lo/epq;->C:F

    iget v3, p0, Lo/epq;->f:F

    add-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v2, v3

    sub-float/2addr v1, v2

    const/high16 v2, 0x40c00000    # 6.0f

    div-float/2addr v1, v2

    mul-float/2addr v0, v1

    iget v1, p0, Lo/epq;->C:F

    add-float v4, v0, v1

    .line 407
    iget v0, p0, Lo/epq;->k:I

    int-to-float v5, v0

    .line 408
    sget-object v0, Lo/epq;->j:[I

    array-length v0, v0

    if-ge p1, v0, :cond_0

    .line 409
    iget v0, p0, Lo/epq;->k:I

    iget-object v1, p0, Lo/epq;->i:Landroid/content/Context;

    sget-object v2, Lo/epq;->j:[I

    aget v2, v2, p1

    int-to-float v2, v2

    invoke-direct {p0, v1, v2}, Lo/epq;->d(Landroid/content/Context;F)I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lo/epq;->f:F

    add-float v5, v0, v1

    .line 410
    iget v0, p0, Lo/epq;->k:I

    int-to-float v0, v0

    cmpl-float v0, v5, v0

    if-lez v0, :cond_0

    .line 411
    iget v0, p0, Lo/epq;->k:I

    int-to-float v5, v0

    .line 416
    :cond_0
    new-instance v6, Landroid/graphics/RectF;

    invoke-direct {v6}, Landroid/graphics/RectF;-><init>()V

    .line 417
    iput v4, v6, Landroid/graphics/RectF;->left:F

    .line 418
    iput v5, v6, Landroid/graphics/RectF;->top:F

    .line 419
    iget v0, p0, Lo/epq;->c:I

    int-to-float v0, v0

    add-float/2addr v0, v4

    iput v0, v6, Landroid/graphics/RectF;->right:F

    .line 420
    iget v0, p0, Lo/epq;->k:I

    int-to-float v0, v0

    iput v0, v6, Landroid/graphics/RectF;->bottom:F

    .line 422
    invoke-direct {p0, v6}, Lo/epq;->b(Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v6

    .line 424
    return-object v6
.end method

.method private d(Landroid/content/Context;F)I
    .locals 5

    .line 360
    sget-object v0, Lo/epq;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dpToPx() dpValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v4, v0, Landroid/util/DisplayMetrics;->density:F

    .line 362
    mul-float v0, p2, v4

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private d(F)Ljava/lang/String;
    .locals 5

    .line 430
    const/high16 v0, 0x447a0000    # 1000.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    .line 431
    float-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 432
    :cond_0
    const v0, 0x461c4000    # 10000.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    .line 433
    float-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 435
    :cond_1
    float-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 437
    :goto_0
    return-object v4
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 17

    .line 186
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epq;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 187
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 188
    invoke-virtual/range {p0 .. p0}, Lo/epq;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$color;->hw_show_public_histogram_start:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    .line 189
    invoke-virtual/range {p0 .. p0}, Lo/epq;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$color;->hw_show_public_histogram_end:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v10

    .line 192
    const/16 v0, 0x8

    new-array v11, v0, [F

    move-object/from16 v0, p0

    iget v0, v0, Lo/epq;->f:F

    const/4 v1, 0x0

    aput v0, v11, v1

    move-object/from16 v0, p0

    iget v0, v0, Lo/epq;->f:F

    const/4 v1, 0x1

    aput v0, v11, v1

    move-object/from16 v0, p0

    iget v0, v0, Lo/epq;->f:F

    const/4 v1, 0x2

    aput v0, v11, v1

    move-object/from16 v0, p0

    iget v0, v0, Lo/epq;->f:F

    const/4 v1, 0x3

    aput v0, v11, v1

    const/4 v0, 0x0

    const/4 v1, 0x4

    aput v0, v11, v1

    const/4 v0, 0x0

    const/4 v1, 0x5

    aput v0, v11, v1

    const/4 v0, 0x0

    const/4 v1, 0x6

    aput v0, v11, v1

    const/4 v0, 0x0

    const/4 v1, 0x7

    aput v0, v11, v1

    .line 195
    const/4 v12, 0x0

    :goto_0
    const/4 v0, 0x7

    if-ge v12, v0, :cond_3

    .line 196
    move-object/from16 v0, p0

    iget v0, v0, Lo/epq;->u:I

    add-int v13, v0, v12

    .line 198
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epq;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_2

    .line 199
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epq;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 200
    rsub-int/lit8 v0, v12, 0x6

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epq;->b:Ljava/util/List;

    move-object/from16 v2, p0

    iget v2, v2, Lo/epq;->u:I

    add-int/2addr v2, v12

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    move-object/from16 v2, p0

    iget v2, v2, Lo/epq;->v:F

    move-object/from16 v3, p0

    invoke-direct {v3, v0, v1, v2}, Lo/epq;->e(IFF)Landroid/graphics/RectF;

    move-result-object v14

    goto :goto_1

    .line 203
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epq;->b:Ljava/util/List;

    move-object/from16 v1, p0

    iget v1, v1, Lo/epq;->u:I

    add-int/2addr v1, v12

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/epq;->v:F

    move-object/from16 v2, p0

    invoke-direct {v2, v12, v0, v1}, Lo/epq;->e(IFF)Landroid/graphics/RectF;

    move-result-object v14

    .line 206
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epq;->F:Ljava/util/ArrayList;

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1, v14}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    invoke-virtual {v0, v12, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 207
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 208
    new-instance v0, Landroid/graphics/LinearGradient;

    iget v1, v14, Landroid/graphics/RectF;->left:F

    iget v2, v14, Landroid/graphics/RectF;->bottom:F

    iget v3, v14, Landroid/graphics/RectF;->right:F

    iget v4, v14, Landroid/graphics/RectF;->top:F

    move-object/from16 v5, p0

    iget v5, v5, Lo/epq;->f:F

    sub-float/2addr v4, v5

    move v5, v9

    move v6, v10

    sget-object v7, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    move-object v15, v0

    .line 210
    invoke-virtual {v8, v15}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 212
    new-instance v16, Landroid/graphics/Path;

    invoke-direct/range {v16 .. v16}, Landroid/graphics/Path;-><init>()V

    .line 213
    new-instance v0, Landroid/graphics/RectF;

    iget v1, v14, Landroid/graphics/RectF;->left:F

    iget v2, v14, Landroid/graphics/RectF;->top:F

    move-object/from16 v3, p0

    iget v3, v3, Lo/epq;->f:F

    sub-float/2addr v2, v3

    iget v3, v14, Landroid/graphics/RectF;->right:F

    iget v4, v14, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v11, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 214
    move-object/from16 v0, p1

    move-object/from16 v1, v16

    invoke-virtual {v0, v1, v8}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 225
    move-object/from16 v0, p0

    iget v0, v0, Lo/epq;->A:F

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epq;->b:Ljava/util/List;

    move-object/from16 v2, p0

    iget v2, v2, Lo/epq;->u:I

    add-int/2addr v2, v12

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    move-object/from16 v0, p0

    iget v0, v0, Lo/epq;->A:F

    goto :goto_2

    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epq;->b:Ljava/util/List;

    move-object/from16 v1, p0

    iget v1, v1, Lo/epq;->u:I

    add-int/2addr v1, v12

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    :goto_2
    move-object/from16 v1, p0

    iput v0, v1, Lo/epq;->A:F

    .line 195
    :cond_2
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 229
    :cond_3
    return-void
.end method

.method private e(IFF)Landroid/graphics/RectF;
    .locals 8

    .line 254
    const/4 v5, 0x0

    .line 256
    iget v0, p0, Lo/epq;->r:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 257
    int-to-float v0, p1

    const v1, 0x3f839581    # 1.028f

    mul-float/2addr v0, v1

    iget v1, p0, Lo/epq;->x:F

    mul-float v5, v0, v1

    goto :goto_0

    .line 259
    :cond_0
    int-to-float v0, p1

    iget v1, p0, Lo/epq;->n:I

    int-to-float v1, v1

    iget v2, p0, Lo/epq;->C:F

    iget v3, p0, Lo/epq;->f:F

    add-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v2, v3

    sub-float/2addr v1, v2

    const/high16 v2, 0x40c00000    # 6.0f

    div-float/2addr v1, v2

    mul-float/2addr v0, v1

    iget v1, p0, Lo/epq;->C:F

    add-float v5, v0, v1

    .line 263
    :goto_0
    iget v0, p0, Lo/epq;->k:I

    int-to-float v0, v0

    iget v1, p0, Lo/epq;->B:F

    mul-float/2addr v1, p2

    sget v2, Lo/epq;->a:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    iget v2, p0, Lo/epq;->k:I

    int-to-float v2, v2

    iget v3, p0, Lo/epq;->D:F

    sub-float/2addr v2, v3

    mul-float/2addr v1, v2

    sub-float v6, v0, v1

    .line 264
    iget v0, p0, Lo/epq;->D:F

    cmpg-float v0, v6, v0

    if-gez v0, :cond_1

    .line 265
    iget v6, p0, Lo/epq;->D:F

    .line 268
    :cond_1
    new-instance v7, Landroid/graphics/RectF;

    invoke-direct {v7}, Landroid/graphics/RectF;-><init>()V

    .line 269
    iput v5, v7, Landroid/graphics/RectF;->left:F

    .line 270
    iput v6, v7, Landroid/graphics/RectF;->top:F

    .line 271
    iget v0, p0, Lo/epq;->r:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 272
    iget v0, p0, Lo/epq;->x:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40400000    # 3.0f

    div-float/2addr v0, v1

    add-float/2addr v0, v5

    iput v0, v7, Landroid/graphics/RectF;->right:F

    goto :goto_1

    .line 274
    :cond_2
    iget v0, p0, Lo/epq;->c:I

    int-to-float v0, v0

    add-float/2addr v0, v5

    iput v0, v7, Landroid/graphics/RectF;->right:F

    .line 277
    :goto_1
    iget v0, p0, Lo/epq;->k:I

    int-to-float v0, v0

    iput v0, v7, Landroid/graphics/RectF;->bottom:F

    .line 281
    cmpl-float v0, p2, p3

    if-nez v0, :cond_3

    .line 282
    iget-object v0, p0, Lo/epq;->y:Landroid/graphics/RectF;

    iget v1, v7, Landroid/graphics/RectF;->left:F

    iget v2, v7, Landroid/graphics/RectF;->top:F

    iget v3, v7, Landroid/graphics/RectF;->right:F

    iget v4, v7, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 284
    :cond_3
    return-object v7
.end method

.method private getScreenWidth()I
    .locals 4

    .line 240
    new-instance v2, Landroid/util/DisplayMetrics;

    invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V

    .line 241
    invoke-virtual {p0}, Lo/epq;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/WindowManager;

    .line 242
    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 243
    iget v0, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    return v0
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 139
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 140
    iget-object v0, p0, Lo/epq;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/epq;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lo/epq;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/epq;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 141
    const/4 v0, 0x0

    iput v0, p0, Lo/epq;->A:F

    .line 142
    invoke-direct {p0, p1}, Lo/epq;->b(Landroid/graphics/Canvas;)V

    .line 143
    invoke-direct {p0, p1}, Lo/epq;->d(Landroid/graphics/Canvas;)V

    .line 144
    iget-object v0, p0, Lo/epq;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lo/epq;->b(Landroid/graphics/Canvas;I)V

    .line 145
    invoke-direct {p0, p1}, Lo/epq;->a(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 148
    :cond_0
    iget-object v0, p0, Lo/epq;->o:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lo/epq;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_11_sp:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 149
    iget-object v0, p0, Lo/epq;->o:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lo/epq;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->hw_show_color_text_50_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 150
    iget-object v0, p0, Lo/epq;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_no_history_data_tip:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 151
    iget-object v0, p0, Lo/epq;->o:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v4

    .line 152
    iget v0, p0, Lo/epq;->n:I

    int-to-float v0, v0

    sub-float/2addr v0, v4

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/epq;->k:I

    iget v2, p0, Lo/epq;->p:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lo/epq;->o:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 155
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/epq;->b(Landroid/graphics/Canvas;I)V

    .line 158
    :goto_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .line 126
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 128
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 130
    iget-object v0, p0, Lo/epq;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_public_size_17:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    sub-int v0, v2, v0

    iput v0, p0, Lo/epq;->k:I

    .line 131
    return-void
.end method

.method public setRunValue(Ljava/util/ArrayList;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/fdf;>;I)V"
        }
    .end annotation

    .line 317
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 318
    const-wide/16 v2, 0x0

    .line 319
    new-instance v4, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "Md"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 320
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 321
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 322
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 323
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v0, v0, Lo/fdf;->e:D

    cmpl-double v0, v2, v0

    if-lez v0, :cond_0

    move-wide v0, v2

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v0, v0, Lo/fdf;->e:D

    :goto_1
    move-wide v2, v0

    .line 324
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v0, v0, Lo/fdf;->e:D

    double-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 325
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v0, v0, Lo/fdf;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 322
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 328
    :cond_1
    double-to-float v0, v2

    iput v0, p0, Lo/epq;->v:F

    .line 330
    iput-object v5, p0, Lo/epq;->b:Ljava/util/List;

    .line 331
    iput-object v6, p0, Lo/epq;->e:Ljava/util/List;

    .line 332
    goto :goto_2

    .line 333
    :cond_2
    const/4 v0, 0x0

    iput v0, p0, Lo/epq;->v:F

    .line 334
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epq;->b:Ljava/util/List;

    .line 335
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epq;->e:Ljava/util/List;

    .line 337
    :goto_2
    iput p2, p0, Lo/epq;->r:I

    .line 344
    iget v0, p0, Lo/epq;->v:F

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v2, v0

    .line 346
    sget v0, Lo/epq;->a:I

    int-to-float v0, v0

    mul-int/lit16 v1, v2, 0x3e8

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lo/epq;->B:F

    .line 349
    invoke-virtual {p0}, Lo/epq;->invalidate()V

    .line 351
    return-void
.end method
