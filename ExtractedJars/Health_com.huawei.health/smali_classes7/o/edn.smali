.class public final Lo/edn;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Landroid/graphics/Paint;

.field private c:I

.field private final d:I

.field private e:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<Lo/ou;>;"
        }
    .end annotation
.end field

.field private i:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<Lo/ou;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 43
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lo/edn;->c:I

    .line 45
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/edn;->b:Landroid/graphics/Paint;

    .line 46
    invoke-virtual {p0}, Lo/edn;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 47
    sget v0, Lcom/huawei/sim/R$color;->sim_qrcode_result_view:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/edn;->a:I

    .line 48
    sget v0, Lcom/huawei/sim/R$color;->sim_qrcode_possible_result_points:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/edn;->d:I

    .line 49
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lo/edn;->i:Ljava/util/Collection;

    .line 51
    return-void
.end method


# virtual methods
.method public b()V
    .locals 0

    .line 132
    invoke-virtual {p0}, Lo/edn;->invalidate()V

    .line 133
    return-void
.end method

.method public d(Lo/ou;)V
    .locals 1

    .line 128
    iget-object v0, p0, Lo/edn;->i:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 129
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 20

    .line 56
    const/16 v7, 0x32

    .line 58
    invoke-static {}, Lo/edg;->a()Lo/edg;

    move-result-object v0

    invoke-virtual {v0}, Lo/edg;->i()Landroid/graphics/Rect;

    move-result-object v8

    .line 59
    if-nez v8, :cond_0

    .line 60
    return-void

    .line 62
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v9

    .line 63
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v10

    .line 66
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/edn;->b:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/edn;->a:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 67
    move-object/from16 v0, p1

    int-to-float v3, v9

    iget v1, v8, Landroid/graphics/Rect;->top:I

    add-int/lit8 v1, v1, 0x32

    int-to-float v4, v1

    move-object/from16 v1, p0

    iget-object v5, v1, Lo/edn;->b:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 68
    move-object/from16 v0, p1

    iget v1, v8, Landroid/graphics/Rect;->top:I

    add-int/lit8 v1, v1, 0x32

    int-to-float v2, v1

    iget v1, v8, Landroid/graphics/Rect;->left:I

    add-int/lit8 v1, v1, 0x32

    int-to-float v3, v1

    iget v1, v8, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v1, v1, -0x32

    int-to-float v4, v1

    move-object/from16 v1, p0

    iget-object v5, v1, Lo/edn;->b:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 69
    move-object/from16 v0, p1

    iget v1, v8, Landroid/graphics/Rect;->right:I

    add-int/lit8 v1, v1, -0x32

    int-to-float v1, v1

    iget v2, v8, Landroid/graphics/Rect;->top:I

    add-int/lit8 v2, v2, 0x32

    int-to-float v2, v2

    int-to-float v3, v9

    iget v4, v8, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v4, v4, -0x32

    int-to-float v4, v4

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/edn;->b:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 70
    move-object/from16 v0, p1

    iget v1, v8, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v1, v1, -0x32

    int-to-float v2, v1

    int-to-float v3, v9

    int-to-float v4, v10

    move-object/from16 v1, p0

    iget-object v5, v1, Lo/edn;->b:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 74
    new-instance v11, Landroid/graphics/Rect;

    iget v0, v8, Landroid/graphics/Rect;->left:I

    add-int/lit8 v0, v0, 0x32

    iget v1, v8, Landroid/graphics/Rect;->top:I

    add-int/lit8 v1, v1, 0x32

    iget v2, v8, Landroid/graphics/Rect;->right:I

    add-int/lit8 v2, v2, -0x32

    iget v3, v8, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v3, v3, -0x32

    invoke-direct {v11, v0, v1, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 75
    invoke-virtual/range {p0 .. p0}, Lo/edn;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$drawable;->kw_pic_qrcode_codemask:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v12

    .line 77
    const/4 v0, 0x0

    if-eq v0, v12, :cond_1

    .line 78
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/edn;->b:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v12, v2, v11, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 79
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 83
    :cond_1
    iget v0, v8, Landroid/graphics/Rect;->top:I

    add-int/lit8 v13, v0, 0x32

    .line 84
    move-object/from16 v0, p0

    iget v0, v0, Lo/edn;->c:I

    add-int/2addr v13, v0

    .line 87
    invoke-virtual/range {p0 .. p0}, Lo/edn;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$drawable;->qrcode_scan:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v14

    .line 89
    new-instance v15, Landroid/graphics/Rect;

    iget v0, v8, Landroid/graphics/Rect;->left:I

    add-int/lit8 v0, v0, -0x5

    add-int/lit8 v1, v13, -0x6

    iget v2, v8, Landroid/graphics/Rect;->right:I

    add-int/lit8 v2, v2, 0x5

    add-int/lit8 v3, v13, 0x23

    invoke-direct {v15, v0, v1, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 90
    const/4 v0, 0x0

    if-eq v0, v14, :cond_2

    .line 91
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/edn;->b:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v14, v2, v15, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 93
    :cond_2
    move-object/from16 v0, p0

    iget v0, v0, Lo/edn;->c:I

    add-int/lit8 v0, v0, 0x6

    move-object/from16 v1, p0

    iput v0, v1, Lo/edn;->c:I

    .line 95
    iget v0, v8, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v0, v0, -0x32

    add-int/lit8 v0, v0, -0x19

    if-le v13, v0, :cond_3

    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lo/edn;->c:I

    .line 97
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/edn;->i:Ljava/util/Collection;

    move-object/from16 v16, v0

    .line 98
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/edn;->e:Ljava/util/Collection;

    move-object/from16 v17, v0

    .line 99
    invoke-interface/range {v16 .. v16}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 100
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/edn;->e:Ljava/util/Collection;

    goto :goto_1

    .line 102
    :cond_4
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/edn;->i:Ljava/util/Collection;

    .line 103
    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/edn;->e:Ljava/util/Collection;

    .line 104
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/edn;->b:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 105
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/edn;->b:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/edn;->d:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 106
    invoke-interface/range {v16 .. v16}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_0
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lo/ou;

    .line 107
    iget v0, v8, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    invoke-virtual/range {v19 .. v19}, Lo/ou;->b()F

    move-result v1

    add-float/2addr v0, v1

    iget v1, v8, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    invoke-virtual/range {v19 .. v19}, Lo/ou;->e()F

    move-result v2

    add-float/2addr v1, v2

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/edn;->b:Landroid/graphics/Paint;

    move-object/from16 v3, p1

    const/high16 v4, 0x40c00000    # 6.0f

    invoke-virtual {v3, v0, v1, v4, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 108
    goto :goto_0

    .line 110
    :cond_5
    :goto_1
    if-eqz v17, :cond_6

    .line 111
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/edn;->b:Landroid/graphics/Paint;

    const/16 v1, 0x7f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 112
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/edn;->b:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/edn;->d:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 113
    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_2
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lo/ou;

    .line 114
    iget v0, v8, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    invoke-virtual/range {v19 .. v19}, Lo/ou;->b()F

    move-result v1

    add-float/2addr v0, v1

    iget v1, v8, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    invoke-virtual/range {v19 .. v19}, Lo/ou;->e()F

    move-result v2

    add-float/2addr v1, v2

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/edn;->b:Landroid/graphics/Paint;

    move-object/from16 v3, p1

    const/high16 v4, 0x40400000    # 3.0f

    invoke-virtual {v3, v0, v1, v4, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 115
    goto :goto_2

    .line 117
    :cond_6
    const/4 v0, 0x0

    if-eq v0, v14, :cond_7

    .line 118
    invoke-virtual {v14}, Landroid/graphics/Bitmap;->recycle()V

    .line 120
    :cond_7
    const/4 v0, 0x0

    if-eq v0, v12, :cond_8

    .line 121
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->recycle()V

    .line 124
    :cond_8
    move-object/from16 v0, p0

    iget v3, v8, Landroid/graphics/Rect;->left:I

    iget v4, v8, Landroid/graphics/Rect;->top:I

    iget v5, v8, Landroid/graphics/Rect;->right:I

    iget v6, v8, Landroid/graphics/Rect;->bottom:I

    const-wide/16 v1, 0x14

    invoke-virtual/range {v0 .. v6}, Lo/edn;->postInvalidateDelayed(JIIII)V

    .line 125
    return-void
.end method
