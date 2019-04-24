.class public Lcom/tencent/connect/avatar/c;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field final a:Ljava/lang/String;

.field public b:Z

.field private c:Landroid/graphics/Matrix;

.field private d:Landroid/graphics/Matrix;

.field private e:I

.field private f:F

.field private g:F

.field private h:Landroid/graphics/Bitmap;

.field private i:Z

.field private j:F

.field private k:F

.field private l:Landroid/graphics/PointF;

.field private m:Landroid/graphics/PointF;

.field private n:F

.field private o:F

.field private p:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 51
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 26
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    .line 27
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/tencent/connect/avatar/c;->d:Landroid/graphics/Matrix;

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/connect/avatar/c;->e:I

    .line 29
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/tencent/connect/avatar/c;->f:F

    .line 30
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/tencent/connect/avatar/c;->g:F

    .line 32
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/connect/avatar/c;->i:Z

    .line 34
    const-string v0, "TouchView"

    iput-object v0, p0, Lcom/tencent/connect/avatar/c;->a:Ljava/lang/String;

    .line 36
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/tencent/connect/avatar/c;->l:Landroid/graphics/PointF;

    .line 37
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;

    .line 38
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/tencent/connect/avatar/c;->n:F

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/connect/avatar/c;->o:F

    .line 41
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/connect/avatar/c;->b:Z

    .line 43
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    .line 52
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/c;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 53
    invoke-direct {p0}, Lcom/tencent/connect/avatar/c;->a()V

    .line 54
    return-void
.end method

.method private a(Landroid/view/MotionEvent;)F
    .locals 4

    .line 90
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 91
    const/4 v0, 0x0

    return v0

    .line 93
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    sub-float v2, v0, v1

    .line 94
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    sub-float v3, v0, v1

    .line 95
    mul-float v0, v2, v2

    mul-float v1, v3, v3

    add-float/2addr v0, v1

    invoke-static {v0}, Landroid/util/FloatMath;->sqrt(F)F

    move-result v0

    return v0
.end method

.method private a()V
    .locals 0

    .line 99
    return-void
.end method

.method private a(Landroid/graphics/PointF;)V
    .locals 20

    .line 110
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 111
    return-void

    .line 113
    :cond_0
    const/16 v0, 0x9

    new-array v2, v0, [F

    .line 114
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 115
    const/4 v0, 0x2

    aget v3, v2, v0

    .line 116
    const/4 v0, 0x5

    aget v4, v2, v0

    .line 117
    const/4 v0, 0x0

    aget v5, v2, v0

    .line 118
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v6, v0

    .line 119
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v7, v0

    .line 120
    mul-float v8, v6, v5

    .line 121
    mul-float v9, v7, v5

    .line 122
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    sub-float v10, v0, v3

    .line 123
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, v10, v0

    if-gtz v0, :cond_1

    .line 124
    const/high16 v10, 0x3f800000    # 1.0f

    .line 126
    :cond_1
    add-float v0, v3, v8

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    sub-float v11, v0, v1

    .line 127
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, v11, v0

    if-gtz v0, :cond_2

    .line 128
    const/high16 v11, 0x3f800000    # 1.0f

    .line 130
    :cond_2
    add-float v12, v10, v11

    .line 131
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v10

    div-float v13, v0, v12

    .line 132
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    add-float v14, v13, v0

    .line 133
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    sub-float v15, v0, v4

    .line 134
    add-float v0, v4, v9

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    int-to-float v1, v1

    sub-float v16, v0, v1

    .line 135
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, v15, v0

    if-gtz v0, :cond_3

    .line 136
    const/high16 v15, 0x3f800000    # 1.0f

    .line 138
    :cond_3
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, v16, v0

    if-gtz v0, :cond_4

    .line 139
    const/high16 v16, 0x3f800000    # 1.0f

    .line 141
    :cond_4
    add-float v17, v15, v16

    .line 142
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v15

    div-float v18, v0, v17

    .line 143
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    add-float v19, v18, v0

    .line 144
    move-object/from16 v0, p1

    move/from16 v1, v19

    invoke-virtual {v0, v14, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 145
    return-void
.end method

.method static synthetic a(Lcom/tencent/connect/avatar/c;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/tencent/connect/avatar/c;->b()V

    return-void
.end method

.method static synthetic a(Lcom/tencent/connect/avatar/c;Z)Z
    .locals 0

    .line 18
    iput-boolean p1, p0, Lcom/tencent/connect/avatar/c;->i:Z

    return p1
.end method

.method private b()V
    .locals 23

    .line 202
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 203
    return-void

    .line 205
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v7, v0

    .line 206
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v8, v0

    .line 208
    const/16 v0, 0x9

    new-array v9, v0, [F

    .line 209
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, v9}, Landroid/graphics/Matrix;->getValues([F)V

    .line 210
    const/4 v0, 0x2

    aget v10, v9, v0

    .line 211
    const/4 v0, 0x5

    aget v11, v9, v0

    .line 212
    const/4 v0, 0x0

    aget v12, v9, v0

    .line 213
    const/4 v13, 0x0

    .line 214
    move-object/from16 v0, p0

    iget v0, v0, Lcom/tencent/connect/avatar/c;->f:F

    cmpl-float v0, v12, v0

    if-lez v0, :cond_1

    .line 215
    move-object/from16 v0, p0

    iget v0, v0, Lcom/tencent/connect/avatar/c;->f:F

    div-float/2addr v0, v12

    move-object/from16 v1, p0

    iput v0, v1, Lcom/tencent/connect/avatar/c;->o:F

    .line 216
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/tencent/connect/avatar/c;->o:F

    move-object/from16 v2, p0

    iget v2, v2, Lcom/tencent/connect/avatar/c;->o:F

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 217
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/tencent/connect/avatar/c;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 218
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/tencent/connect/avatar/c;->o:F

    const/high16 v2, 0x3f800000    # 1.0f

    div-float v1, v2, v1

    move-object/from16 v2, p0

    iget v2, v2, Lcom/tencent/connect/avatar/c;->o:F

    const/high16 v3, 0x3f800000    # 1.0f

    div-float/2addr v3, v2

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;

    iget v5, v2, Landroid/graphics/PointF;->x:F

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;

    iget v6, v2, Landroid/graphics/PointF;->y:F

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V

    move-object v13, v0

    goto/16 :goto_0

    .line 221
    :cond_1
    move-object/from16 v0, p0

    iget v0, v0, Lcom/tencent/connect/avatar/c;->g:F

    cmpg-float v0, v12, v0

    if-gez v0, :cond_2

    .line 222
    move-object/from16 v0, p0

    iget v0, v0, Lcom/tencent/connect/avatar/c;->g:F

    div-float/2addr v0, v12

    move-object/from16 v1, p0

    iput v0, v1, Lcom/tencent/connect/avatar/c;->o:F

    .line 223
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/tencent/connect/avatar/c;->o:F

    move-object/from16 v2, p0

    iget v2, v2, Lcom/tencent/connect/avatar/c;->o:F

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 224
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    move-object/from16 v1, p0

    iget v2, v1, Lcom/tencent/connect/avatar/c;->o:F

    move-object/from16 v1, p0

    iget v4, v1, Lcom/tencent/connect/avatar/c;->o:F

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;

    iget v5, v1, Landroid/graphics/PointF;->x:F

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;

    iget v6, v1, Landroid/graphics/PointF;->y:F

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V

    move-object v13, v0

    goto/16 :goto_0

    .line 227
    :cond_2
    const/4 v14, 0x0

    .line 228
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float v15, v0, v12

    .line 229
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    mul-float v16, v0, v12

    .line 230
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    sub-float v17, v0, v10

    .line 231
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    sub-float v18, v0, v11

    .line 232
    const/4 v0, 0x0

    cmpg-float v0, v17, v0

    if-gez v0, :cond_3

    .line 233
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    int-to-float v10, v0

    .line 234
    const/4 v14, 0x1

    .line 236
    :cond_3
    const/4 v0, 0x0

    cmpg-float v0, v18, v0

    if-gez v0, :cond_4

    .line 237
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v11, v0

    .line 238
    const/4 v14, 0x1

    .line 240
    :cond_4
    sub-float v19, v15, v17

    .line 241
    sub-float v20, v16, v18

    .line 243
    cmpg-float v0, v19, v7

    if-gez v0, :cond_5

    .line 244
    sub-float v17, v15, v7

    .line 245
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    sub-float v10, v0, v17

    .line 246
    const/4 v14, 0x1

    .line 248
    :cond_5
    cmpg-float v0, v20, v8

    if-gez v0, :cond_6

    .line 249
    sub-float v18, v16, v8

    .line 250
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    sub-float v11, v0, v18

    .line 251
    const/4 v14, 0x1

    .line 253
    :cond_6
    if-eqz v14, :cond_7

    .line 254
    const/4 v0, 0x2

    aget v0, v9, v0

    sub-float v21, v0, v10

    .line 255
    const/4 v0, 0x5

    aget v0, v9, v0

    sub-float v22, v0, v11

    .line 256
    const/4 v0, 0x2

    aput v10, v9, v0

    .line 257
    const/4 v0, 0x5

    aput v11, v9, v0

    .line 258
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, v9}, Landroid/graphics/Matrix;->setValues([F)V

    .line 259
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/tencent/connect/avatar/c;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 260
    new-instance v13, Landroid/view/animation/TranslateAnimation;

    move/from16 v0, v21

    const/4 v1, 0x0

    move/from16 v2, v22

    const/4 v3, 0x0

    invoke-direct {v13, v0, v1, v2, v3}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 261
    goto :goto_0

    .line 263
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/tencent/connect/avatar/c;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 267
    :goto_0
    if-eqz v13, :cond_8

    .line 268
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/tencent/connect/avatar/c;->i:Z

    .line 269
    const-wide/16 v0, 0x12c

    invoke-virtual {v13, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 270
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lcom/tencent/connect/avatar/c;->startAnimation(Landroid/view/animation/Animation;)V

    .line 272
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/tencent/connect/avatar/c$1;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lcom/tencent/connect/avatar/c$1;-><init>(Lcom/tencent/connect/avatar/c;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 291
    :cond_8
    return-void
.end method

.method private c()V
    .locals 5

    .line 294
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 295
    return-void

    .line 297
    :cond_0
    const/16 v0, 0x9

    new-array v3, v0, [F

    .line 298
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->getValues([F)V

    .line 299
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v4

    .line 302
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v4

    iget-object v2, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/tencent/connect/avatar/c;->j:F

    .line 304
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v4

    iget-object v2, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/tencent/connect/avatar/c;->k:F

    .line 306
    iget v0, p0, Lcom/tencent/connect/avatar/c;->j:F

    const/4 v1, 0x2

    aput v0, v3, v1

    .line 307
    iget v0, p0, Lcom/tencent/connect/avatar/c;->k:F

    const/4 v1, 0x5

    aput v0, v3, v1

    .line 308
    const/4 v0, 0x4

    aput v4, v3, v0

    const/4 v0, 0x0

    aput v4, v3, v0

    .line 309
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->setValues([F)V

    .line 310
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x45000000    # 2048.0f

    div-float v0, v1, v0

    iget-object v1, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x45000000    # 2048.0f

    div-float v1, v2, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/tencent/connect/avatar/c;->f:F

    .line 315
    iput v4, p0, Lcom/tencent/connect/avatar/c;->g:F

    .line 316
    iget v0, p0, Lcom/tencent/connect/avatar/c;->f:F

    iget v1, p0, Lcom/tencent/connect/avatar/c;->g:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 317
    iget v0, p0, Lcom/tencent/connect/avatar/c;->g:F

    iput v0, p0, Lcom/tencent/connect/avatar/c;->f:F

    .line 319
    :cond_1
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/c;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 320
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Rect;)V
    .locals 1

    .line 102
    iput-object p1, p0, Lcom/tencent/connect/avatar/c;->p:Landroid/graphics/Rect;

    .line 103
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 104
    invoke-direct {p0}, Lcom/tencent/connect/avatar/c;->c()V

    .line 106
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 150
    iget-boolean v0, p0, Lcom/tencent/connect/avatar/c;->i:Z

    if-eqz v0, :cond_0

    .line 151
    const/4 v0, 0x1

    return v0

    .line 153
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 156
    :pswitch_0
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lcom/tencent/connect/avatar/c;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 157
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->d:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 158
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->l:Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/PointF;->set(FF)V

    .line 159
    const/4 v0, 0x1

    iput v0, p0, Lcom/tencent/connect/avatar/c;->e:I

    .line 161
    goto/16 :goto_0

    .line 163
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/tencent/connect/avatar/c;->a(Landroid/view/MotionEvent;)F

    move-result v0

    iput v0, p0, Lcom/tencent/connect/avatar/c;->n:F

    .line 164
    iget v0, p0, Lcom/tencent/connect/avatar/c;->n:F

    const/high16 v1, 0x41200000    # 10.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 165
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->d:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 166
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;

    invoke-direct {p0, v0}, Lcom/tencent/connect/avatar/c;->a(Landroid/graphics/PointF;)V

    .line 167
    const/4 v0, 0x2

    iput v0, p0, Lcom/tencent/connect/avatar/c;->e:I

    goto/16 :goto_0

    .line 173
    :pswitch_2
    invoke-direct {p0}, Lcom/tencent/connect/avatar/c;->b()V

    .line 175
    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/connect/avatar/c;->e:I

    .line 176
    goto/16 :goto_0

    .line 178
    :pswitch_3
    iget v0, p0, Lcom/tencent/connect/avatar/c;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 179
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/tencent/connect/avatar/c;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 180
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lcom/tencent/connect/avatar/c;->l:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    sub-float v3, v0, v1

    .line 181
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v1, p0, Lcom/tencent/connect/avatar/c;->l:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    sub-float v4, v0, v1

    .line 182
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, v3, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 183
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/c;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 184
    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/tencent/connect/avatar/c;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 185
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 186
    invoke-direct {p0, p1}, Lcom/tencent/connect/avatar/c;->a(Landroid/view/MotionEvent;)F

    move-result v3

    .line 187
    const/high16 v0, 0x41200000    # 10.0f

    cmpl-float v0, v3, v0

    if-lez v0, :cond_2

    .line 188
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/tencent/connect/avatar/c;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 189
    iget v0, p0, Lcom/tencent/connect/avatar/c;->n:F

    div-float v4, v3, v0

    .line 190
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/tencent/connect/avatar/c;->m:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v4, v4, v1, v2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 192
    :cond_2
    iget-object v0, p0, Lcom/tencent/connect/avatar/c;->c:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/c;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 196
    :cond_3
    :goto_0
    :pswitch_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/connect/avatar/c;->b:Z

    .line 197
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 81
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 82
    iput-object p1, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;

    .line 83
    if-eqz p1, :cond_0

    .line 84
    iput-object p1, p0, Lcom/tencent/connect/avatar/c;->h:Landroid/graphics/Bitmap;

    .line 86
    :cond_0
    return-void
.end method
