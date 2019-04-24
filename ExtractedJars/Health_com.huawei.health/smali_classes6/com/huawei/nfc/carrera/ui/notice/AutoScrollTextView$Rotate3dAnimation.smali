.class Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "Rotate3dAnimation"
.end annotation


# instance fields
.field f:F

.field private mCamera:Landroid/graphics/Camera;

.field private mCenterX:F

.field private mCenterY:F

.field private final mFromDegrees:F

.field private final mToDegrees:F

.field private final mTurnIn:Z

.field private final mTurnUp:Z

.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;FFZZ)V
    .locals 1

    .line 242
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 249
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->f:F

    .line 243
    iput p2, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->mFromDegrees:F

    .line 244
    iput p3, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->mToDegrees:F

    .line 245
    iput-boolean p4, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->mTurnIn:Z

    .line 246
    iput-boolean p5, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->mTurnUp:Z

    .line 247
    return-void
.end method


# virtual methods
.method protected applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 10

    .line 263
    iget v3, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->mFromDegrees:F

    .line 264
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->mToDegrees:F

    sub-float/2addr v0, v3

    mul-float/2addr v0, p1

    add-float v4, v3, v0

    .line 266
    iget v5, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->mCenterX:F

    .line 267
    iget v6, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->mCenterY:F

    .line 268
    iget-object v7, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->mCamera:Landroid/graphics/Camera;

    .line 269
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->mTurnUp:Z

    if-eqz v0, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, -0x1

    .line 271
    :goto_0
    invoke-virtual {p2}, Landroid/view/animation/Transformation;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v9

    .line 273
    invoke-virtual {v7}, Landroid/graphics/Camera;->save()V

    .line 274
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->mTurnIn:Z

    if-eqz v0, :cond_1

    .line 276
    int-to-float v0, v8

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->mCenterY:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v1, p1, v1

    mul-float/2addr v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v7, v1, v0, v2}, Landroid/graphics/Camera;->translate(FFF)V

    goto :goto_1

    .line 280
    :cond_1
    int-to-float v0, v8

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->mCenterY:F

    mul-float/2addr v0, v1

    mul-float/2addr v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v7, v1, v0, v2}, Landroid/graphics/Camera;->translate(FFF)V

    .line 282
    :goto_1
    invoke-virtual {v7, v4}, Landroid/graphics/Camera;->rotateX(F)V

    .line 283
    invoke-virtual {v7, v9}, Landroid/graphics/Camera;->getMatrix(Landroid/graphics/Matrix;)V

    .line 284
    invoke-virtual {v7}, Landroid/graphics/Camera;->restore()V

    .line 286
    neg-float v0, v5

    neg-float v1, v6

    invoke-virtual {v9, v0, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 287
    invoke-virtual {v9, v5, v6}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 288
    return-void
.end method

.method public initialize(IIII)V
    .locals 2

    .line 254
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/animation/Animation;->initialize(IIII)V

    .line 255
    new-instance v0, Landroid/graphics/Camera;

    invoke-direct {v0}, Landroid/graphics/Camera;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->mCamera:Landroid/graphics/Camera;

    .line 256
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->f:F

    div-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->mCenterY:F

    .line 257
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->this$0:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->f:F

    div-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView$Rotate3dAnimation;->mCenterX:F

    .line 258
    return-void
.end method
