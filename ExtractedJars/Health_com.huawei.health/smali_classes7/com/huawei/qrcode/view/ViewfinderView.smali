.class public final Lcom/huawei/qrcode/view/ViewfinderView;
.super Landroid/view/View;


# static fields
.field private static final CURRENT_POINT_OPACITY:I = 0xa0


# instance fields
.field private cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

.field private final frameColor:I

.field private linewidth:I

.field private final maskColor:I

.field private offSet:I

.field private final paint:Landroid/graphics/Paint;

.field private resultBitmap:Landroid/graphics/Bitmap;

.field private final resultColor:I

.field private x:I

.field private y:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/qrcode/view/ViewfinderView;->paint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/huawei/qrcode/view/ViewfinderView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/qrcode/view/ViewfinderView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "scanqrcode_sdk_viewfinder_mask"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getColorId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/qrcode/view/ViewfinderView;->maskColor:I

    invoke-virtual {p0}, Lcom/huawei/qrcode/view/ViewfinderView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "scanqrcode_sdk_result_view"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getColorId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/qrcode/view/ViewfinderView;->resultColor:I

    invoke-virtual {p0}, Lcom/huawei/qrcode/view/ViewfinderView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "scanqrcode_sdk_viewfinder_five"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getColorId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/qrcode/view/ViewfinderView;->frameColor:I

    const/high16 v0, 0x40000000    # 2.0f

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/view/ViewfinderView;->dip2px(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/qrcode/view/ViewfinderView;->linewidth:I

    const/high16 v0, -0x40000000    # -2.0f

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/view/ViewfinderView;->dip2px(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    const/high16 v0, 0x41b00000    # 22.0f

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/view/ViewfinderView;->dip2px(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/qrcode/view/ViewfinderView;->x:I

    const/high16 v0, 0x41b00000    # 22.0f

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/view/ViewfinderView;->dip2px(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/qrcode/view/ViewfinderView;->y:I

    return-void
.end method

.method private dip2px(F)I
    .locals 3

    invoke-virtual {p0}, Lcom/huawei/qrcode/view/ViewfinderView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method


# virtual methods
.method public addPossibleResultPoint(Lo/ou;)V
    .locals 0

    return-void
.end method

.method public drawResultBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/view/ViewfinderView;->resultBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lcom/huawei/qrcode/view/ViewfinderView;->invalidate()V

    return-void
.end method

.method public drawViewfinder()V
    .locals 2

    iget-object v1, p0, Lcom/huawei/qrcode/view/ViewfinderView;->resultBitmap:Landroid/graphics/Bitmap;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/view/ViewfinderView;->resultBitmap:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/qrcode/view/ViewfinderView;->invalidate()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 11

    iget-object v0, p0, Lcom/huawei/qrcode/view/ViewfinderView;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/view/ViewfinderView;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraManager;->getFramingRect()Landroid/graphics/Rect;

    move-result-object v8

    if-nez v8, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v9

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v10

    iget-object v0, p0, Lcom/huawei/qrcode/view/ViewfinderView;->paint:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/huawei/qrcode/view/ViewfinderView;->resultBitmap:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_2

    iget v1, p0, Lcom/huawei/qrcode/view/ViewfinderView;->resultColor:I

    goto :goto_0

    :cond_2
    iget v1, p0, Lcom/huawei/qrcode/view/ViewfinderView;->maskColor:I

    :goto_0
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object v0, p1

    int-to-float v3, v9

    iget v1, v8, Landroid/graphics/Rect;->top:I

    int-to-float v4, v1

    iget-object v5, p0, Lcom/huawei/qrcode/view/ViewfinderView;->paint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move-object v0, p1

    iget v1, v8, Landroid/graphics/Rect;->top:I

    int-to-float v2, v1

    iget v1, v8, Landroid/graphics/Rect;->left:I

    int-to-float v3, v1

    iget v1, v8, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v1, v1, 0x1

    int-to-float v4, v1

    iget-object v5, p0, Lcom/huawei/qrcode/view/ViewfinderView;->paint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move-object v0, p1

    iget v1, v8, Landroid/graphics/Rect;->right:I

    add-int/lit8 v1, v1, 0x1

    int-to-float v1, v1

    iget v2, v8, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    int-to-float v3, v9

    iget v4, v8, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v4, v4, 0x1

    int-to-float v4, v4

    iget-object v5, p0, Lcom/huawei/qrcode/view/ViewfinderView;->paint:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move-object v0, p1

    iget v1, v8, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v1, v1, 0x1

    int-to-float v2, v1

    int-to-float v3, v9

    int-to-float v4, v10

    iget-object v5, p0, Lcom/huawei/qrcode/view/ViewfinderView;->paint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/huawei/qrcode/view/ViewfinderView;->resultBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/qrcode/view/ViewfinderView;->paint:Landroid/graphics/Paint;

    const/16 v1, 0xa0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/view/ViewfinderView;->resultBitmap:Landroid/graphics/Bitmap;

    iget v1, v8, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget v2, v8, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/huawei/qrcode/view/ViewfinderView;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto/16 :goto_1

    :cond_3
    iget-object v0, p0, Lcom/huawei/qrcode/view/ViewfinderView;->paint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/huawei/qrcode/view/ViewfinderView;->frameColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object v0, p1

    iget v1, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    iget v2, v8, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    iget v3, v8, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v3

    int-to-float v2, v2

    iget v3, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    iget v4, p0, Lcom/huawei/qrcode/view/ViewfinderView;->linewidth:I

    iget v5, v8, Landroid/graphics/Rect;->left:I

    add-int/2addr v4, v5

    add-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    iget v5, p0, Lcom/huawei/qrcode/view/ViewfinderView;->x:I

    iget v6, v8, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v6

    add-int/2addr v4, v5

    int-to-float v4, v4

    iget-object v5, p0, Lcom/huawei/qrcode/view/ViewfinderView;->paint:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move-object v0, p1

    iget v1, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    iget v2, v8, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    iget v3, v8, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v3

    int-to-float v2, v2

    iget v3, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    iget v4, p0, Lcom/huawei/qrcode/view/ViewfinderView;->x:I

    iget v5, v8, Landroid/graphics/Rect;->left:I

    add-int/2addr v4, v5

    add-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    iget v5, p0, Lcom/huawei/qrcode/view/ViewfinderView;->linewidth:I

    iget v6, v8, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v6

    add-int/2addr v4, v5

    int-to-float v4, v4

    iget-object v5, p0, Lcom/huawei/qrcode/view/ViewfinderView;->paint:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move-object v0, p1

    iget v1, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    neg-int v1, v1

    iget v2, p0, Lcom/huawei/qrcode/view/ViewfinderView;->linewidth:I

    rsub-int/lit8 v2, v2, 0x0

    iget v3, v8, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    iget v3, v8, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v3

    int-to-float v2, v2

    iget v3, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    neg-int v3, v3

    iget v4, v8, Landroid/graphics/Rect;->right:I

    add-int/lit8 v4, v4, 0x1

    add-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    iget v5, p0, Lcom/huawei/qrcode/view/ViewfinderView;->x:I

    iget v6, v8, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v6

    add-int/2addr v4, v5

    int-to-float v4, v4

    iget-object v5, p0, Lcom/huawei/qrcode/view/ViewfinderView;->paint:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move-object v0, p1

    iget v1, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    neg-int v1, v1

    iget v2, p0, Lcom/huawei/qrcode/view/ViewfinderView;->x:I

    neg-int v2, v2

    iget v3, v8, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    iget v3, v8, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v3

    int-to-float v2, v2

    iget v3, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    neg-int v3, v3

    iget v4, v8, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    iget v5, p0, Lcom/huawei/qrcode/view/ViewfinderView;->linewidth:I

    iget v6, v8, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v6

    add-int/2addr v4, v5

    int-to-float v4, v4

    iget-object v5, p0, Lcom/huawei/qrcode/view/ViewfinderView;->paint:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move-object v0, p1

    iget v1, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    iget v2, v8, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    neg-int v2, v2

    iget v3, p0, Lcom/huawei/qrcode/view/ViewfinderView;->y:I

    neg-int v3, v3

    iget v4, v8, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v4

    add-int/2addr v2, v3

    int-to-float v2, v2

    iget v3, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    iget v4, p0, Lcom/huawei/qrcode/view/ViewfinderView;->linewidth:I

    iget v5, v8, Landroid/graphics/Rect;->left:I

    add-int/2addr v4, v5

    add-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    neg-int v4, v4

    iget v5, v8, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v5, v5, 0x1

    add-int/2addr v4, v5

    int-to-float v4, v4

    iget-object v5, p0, Lcom/huawei/qrcode/view/ViewfinderView;->paint:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move-object v0, p1

    iget v1, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    iget v2, v8, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    neg-int v2, v2

    iget v3, p0, Lcom/huawei/qrcode/view/ViewfinderView;->linewidth:I

    rsub-int/lit8 v3, v3, 0x0

    iget v4, v8, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v4

    add-int/2addr v2, v3

    int-to-float v2, v2

    iget v3, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    iget v4, p0, Lcom/huawei/qrcode/view/ViewfinderView;->x:I

    iget v5, v8, Landroid/graphics/Rect;->left:I

    add-int/2addr v4, v5

    add-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    neg-int v4, v4

    iget v5, v8, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v5, v5, 0x1

    add-int/2addr v4, v5

    int-to-float v4, v4

    iget-object v5, p0, Lcom/huawei/qrcode/view/ViewfinderView;->paint:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move-object v0, p1

    iget v1, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    neg-int v1, v1

    iget v2, p0, Lcom/huawei/qrcode/view/ViewfinderView;->linewidth:I

    rsub-int/lit8 v2, v2, 0x0

    iget v3, v8, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    neg-int v2, v2

    iget v3, p0, Lcom/huawei/qrcode/view/ViewfinderView;->y:I

    neg-int v3, v3

    iget v4, v8, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v4

    add-int/2addr v2, v3

    int-to-float v2, v2

    iget v3, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    neg-int v3, v3

    iget v4, v8, Landroid/graphics/Rect;->right:I

    add-int/lit8 v4, v4, 0x1

    add-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    neg-int v4, v4

    iget v5, v8, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v5, v5, 0x1

    add-int/2addr v4, v5

    int-to-float v4, v4

    iget-object v5, p0, Lcom/huawei/qrcode/view/ViewfinderView;->paint:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move-object v0, p1

    iget v1, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    neg-int v1, v1

    iget v2, p0, Lcom/huawei/qrcode/view/ViewfinderView;->x:I

    neg-int v2, v2

    iget v3, v8, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    neg-int v2, v2

    iget v3, p0, Lcom/huawei/qrcode/view/ViewfinderView;->linewidth:I

    rsub-int/lit8 v3, v3, 0x0

    iget v4, v8, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v4

    add-int/2addr v2, v3

    int-to-float v2, v2

    iget v3, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    neg-int v3, v3

    iget v4, v8, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Lcom/huawei/qrcode/view/ViewfinderView;->offSet:I

    neg-int v4, v4

    iget v5, p0, Lcom/huawei/qrcode/view/ViewfinderView;->linewidth:I

    iget v6, p0, Lcom/huawei/qrcode/view/ViewfinderView;->linewidth:I

    add-int/lit8 v6, v6, -0x1

    sub-int/2addr v5, v6

    iget v6, v8, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v5, v6

    add-int/2addr v4, v5

    int-to-float v4, v4

    iget-object v5, p0, Lcom/huawei/qrcode/view/ViewfinderView;->paint:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_1
    return-void
.end method

.method public setCameraManager(Lcom/huawei/qrcode/camera/CameraManager;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/view/ViewfinderView;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    return-void
.end method
