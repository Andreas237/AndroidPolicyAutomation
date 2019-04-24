.class public abstract Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView$IEventListener;
    }
.end annotation


# static fields
.field static g:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

.field private static final p:[I


# instance fields
.field protected a:I

.field protected b:I

.field protected c:I

.field protected d:F

.field protected e:I

.field private f:Landroid/graphics/Rect;

.field private h:Landroid/graphics/Paint;

.field private i:F

.field private k:Landroid/graphics/Rect;

.field private l:Landroid/graphics/Rect;

.field private m:I

.field private n:I

.field private o:I

.field private r:Landroid/graphics/RectF;

.field private t:Landroid/graphics/PorterDuffXfermode;

.field private u:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView$IEventListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 67
    const/16 v0, 0x8

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->p:[I

    return-void

    :array_0
    .array-data 4
        0x0
        0x40
        0x80
        0xc0
        0xff
        0xc0
        0x80
        0x40
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 93
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 48
    const v0, 0x3d888889

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->i:F

    .line 62
    const/high16 v0, 0x60000000

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->m:I

    .line 95
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c()V

    .line 96
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    .line 97
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->t:Landroid/graphics/PorterDuffXfermode;

    .line 98
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->r:Landroid/graphics/RectF;

    .line 99
    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->n:I

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->u:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView$IEventListener;

    .line 101
    invoke-static {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->setBaseOverlayView(Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;)V

    .line 102
    return-void
.end method

.method private a(IIII)Landroid/graphics/Rect;
    .locals 4

    .line 206
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->a:I

    div-int/lit8 v3, v0, 0x2

    .line 207
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 209
    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr v0, v3

    iput v0, v2, Landroid/graphics/Rect;->left:I

    .line 210
    invoke-static {p1, p3}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, v3

    iput v0, v2, Landroid/graphics/Rect;->right:I

    .line 212
    invoke-static {p2, p4}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr v0, v3

    iput v0, v2, Landroid/graphics/Rect;->top:I

    .line 213
    invoke-static {p2, p4}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, v3

    iput v0, v2, Landroid/graphics/Rect;->bottom:I

    .line 215
    return-object v2
.end method

.method private b(IIII)Landroid/graphics/RectF;
    .locals 4

    .line 231
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->a:I

    div-int/lit8 v3, v0, 0x2

    .line 232
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 234
    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr v0, v3

    int-to-float v0, v0

    iput v0, v2, Landroid/graphics/RectF;->left:F

    .line 235
    invoke-static {p1, p3}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, v3

    int-to-float v0, v0

    iput v0, v2, Landroid/graphics/RectF;->right:F

    .line 237
    invoke-static {p2, p4}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr v0, v3

    int-to-float v0, v0

    iput v0, v2, Landroid/graphics/RectF;->top:F

    .line 238
    invoke-static {p2, p4}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, v3

    int-to-float v0, v0

    iput v0, v2, Landroid/graphics/RectF;->bottom:F

    .line 239
    return-object v2
.end method

.method public static e(Z)Landroid/graphics/Rect;
    .locals 1

    .line 171
    if-eqz p0, :cond_0

    .line 173
    sget-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->g:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    iget-object v0, v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->k:Landroid/graphics/Rect;

    return-object v0

    .line 177
    :cond_0
    sget-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->g:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    iget-object v0, v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->l:Landroid/graphics/Rect;

    return-object v0
.end method

.method public static setBaseOverlayView(Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;)V
    .locals 0

    .line 89
    sput-object p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->g:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    .line 90
    return-void
.end method

.method private setGuideAndRotation(Landroid/graphics/Rect;)V
    .locals 2

    .line 189
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setGuideAndRotation: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 190
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    .line 191
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->invalidate()V

    .line 192
    return-void
.end method


# virtual methods
.method protected abstract a(II)Landroid/graphics/Rect;
.end method

.method protected c()V
    .locals 2

    .line 111
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {p0, v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->d(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->a:I

    .line 112
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-virtual {p0, v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->d(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->e:I

    .line 113
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41000000    # 8.0f

    invoke-virtual {p0, v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->d(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    .line 114
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {p0, v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->d(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->b:I

    .line 115
    const v0, 0x3f19999a    # 0.6f

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->d:F

    .line 116
    return-void
.end method

.method protected d(Landroid/content/Context;F)I
    .locals 3

    .line 380
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    .line 381
    const/4 v0, 0x1

    invoke-static {v0, p2, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public d(Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView$IEventListener;)V
    .locals 0

    .line 432
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->u:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView$IEventListener;

    .line 433
    return-void
.end method

.method public e()V
    .locals 1

    .line 437
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->u:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView$IEventListener;

    .line 438
    return-void
.end method

.method public getGuideColor()I
    .locals 1

    .line 399
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->o:I

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 245
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    .line 247
    return-void

    .line 251
    :cond_0
    iget v7, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->e:I

    .line 252
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 254
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->m:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 256
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->clearShadowLayer()V

    .line 257
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 258
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 259
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->t:Landroid/graphics/PorterDuffXfermode;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 260
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->r:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    iget-object v4, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 261
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->r:Landroid/graphics/RectF;

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    int-to-float v1, v1

    iget v2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 262
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 264
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    if-eqz v0, :cond_1

    .line 267
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->clearShadowLayer()V

    .line 268
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->o:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 269
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 270
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->a:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 271
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->a:I

    div-int/lit8 v1, v1, 0x2

    sub-int v8, v0, v1

    .line 272
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    add-int v9, v0, v1

    .line 273
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    add-int v10, v0, v1

    .line 274
    move-object v0, p1

    sub-int v1, v9, v8

    sub-int v2, v10, v8

    add-int v3, v9, v8

    add-int v4, v10, v8

    invoke-direct {p0, v1, v2, v3, v4}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->b(IIII)Landroid/graphics/RectF;

    move-result-object v1

    iget-object v5, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    const/high16 v2, 0x43340000    # 180.0f

    const/high16 v3, 0x42b40000    # 90.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 275
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    add-int v9, v0, v1

    .line 276
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    sub-int v10, v0, v1

    .line 277
    move-object v0, p1

    sub-int v1, v9, v8

    add-int v2, v10, v8

    add-int v3, v9, v8

    sub-int v4, v10, v8

    invoke-direct {p0, v1, v2, v3, v4}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->b(IIII)Landroid/graphics/RectF;

    move-result-object v1

    iget-object v5, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    const/high16 v2, 0x42b40000    # 90.0f

    const/high16 v3, 0x42b40000    # 90.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 278
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    sub-int v9, v0, v1

    .line 279
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    add-int v10, v0, v1

    .line 280
    move-object v0, p1

    sub-int v1, v9, v8

    add-int v2, v10, v8

    add-int v3, v9, v8

    sub-int v4, v10, v8

    invoke-direct {p0, v1, v2, v3, v4}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->b(IIII)Landroid/graphics/RectF;

    move-result-object v1

    iget-object v5, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    const/high16 v2, 0x43870000    # 270.0f

    const/high16 v3, 0x42b40000    # 90.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 281
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    sub-int v9, v0, v1

    .line 282
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    sub-int v10, v0, v1

    .line 283
    move-object v0, p1

    sub-int v1, v9, v8

    add-int v2, v10, v8

    add-int v3, v9, v8

    sub-int v4, v10, v8

    invoke-direct {p0, v1, v2, v3, v4}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->b(IIII)Landroid/graphics/RectF;

    move-result-object v1

    iget-object v5, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/high16 v3, 0x42b40000    # 90.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 287
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->clearShadowLayer()V

    .line 288
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->o:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 289
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 291
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    iget-object v2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v2, v7

    iget-object v3, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->a(IIII)Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 292
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, v7

    iget-object v2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    iget-object v3, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    iget v4, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    add-int/2addr v3, v4

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->a(IIII)Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 294
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    iget-object v2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v2, v7

    iget-object v3, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->a(IIII)Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 296
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v1, v7

    iget-object v2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    iget-object v3, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    iget v4, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    sub-int/2addr v3, v4

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->a(IIII)Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 300
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    iget-object v2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, v7

    iget-object v3, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->a(IIII)Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 301
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, v7

    iget-object v2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    iget-object v3, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    iget v4, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    add-int/2addr v3, v4

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->a(IIII)Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 303
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    iget-object v2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, v7

    iget-object v3, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->a(IIII)Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 305
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v1, v7

    iget-object v2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    iget-object v3, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    iget v4, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->c:I

    sub-int/2addr v3, v4

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->a(IIII)Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 309
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 310
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->o:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 311
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    sget-object v1, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->p:[I

    iget v2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->n:I

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 312
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->n:I

    add-int/lit8 v0, v0, 0x1

    sget-object v1, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->p:[I

    array-length v1, v1

    rem-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->n:I

    .line 314
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v8, v0, Landroid/graphics/Rect;->left:I

    .line 315
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v10, v0, Landroid/graphics/Rect;->right:I

    .line 316
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->d:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->f:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->b:I

    div-int/lit8 v1, v1, 0x2

    sub-int v9, v0, v1

    .line 317
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->b:I

    add-int v11, v9, v0

    .line 318
    move-object v0, p1

    int-to-float v1, v8

    int-to-float v2, v9

    int-to-float v3, v10

    int-to-float v4, v11

    iget-object v5, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->h:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 320
    move-object v0, p0

    move v3, v8

    move v4, v9

    move v5, v10

    move v6, v11

    const-wide/16 v1, 0x64

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->postInvalidateDelayed(JIIII)V

    .line 322
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 329
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v2, v0, 0xff

    .line 330
    if-nez v2, :cond_0

    .line 333
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->u:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView$IEventListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 335
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->u:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView$IEventListener;

    invoke-interface {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView$IEventListener;->b()V

    .line 339
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setGuideColor(I)V
    .locals 0

    .line 404
    iput p1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->o:I

    .line 405
    return-void
.end method

.method public setGuideFrame(IIIII)V
    .locals 5

    .line 130
    move v2, p1

    .line 131
    if-gt p3, p4, :cond_0

    .line 133
    move v2, p2

    .line 135
    :cond_0
    invoke-virtual {p0, p3, p4}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->a(II)Landroid/graphics/Rect;

    move-result-object v3

    .line 136
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/graphics/Rect;->offset(II)V

    .line 137
    iput-object v3, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->l:Landroid/graphics/Rect;

    .line 138
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->l:Landroid/graphics/Rect;

    invoke-direct {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->setGuideAndRotation(Landroid/graphics/Rect;)V

    .line 140
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, v3}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->k:Landroid/graphics/Rect;

    .line 141
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->k:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->k:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, p5

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 142
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->k:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->k:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v1, p5

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 143
    int-to-float v0, v2

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, p3

    div-float v4, v0, v1

    .line 144
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->k:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->k:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    mul-float/2addr v1, v4

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 145
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->k:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->k:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    mul-float/2addr v1, v4

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 146
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->k:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->k:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    mul-float/2addr v1, v4

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 147
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->k:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->k:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    int-to-float v1, v1

    mul-float/2addr v1, v4

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 148
    return-void
.end method

.method public setScannerAlpha(I)V
    .locals 2

    .line 409
    iput p1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->n:I

    .line 410
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->n:I

    add-int/lit8 v0, v0, 0x1

    sget-object v1, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->p:[I

    array-length v1, v1

    rem-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->n:I

    .line 411
    return-void
.end method
