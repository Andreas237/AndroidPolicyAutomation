.class public Lcom/scandit/base/geometry/SbRectFUtils;
.super Ljava/lang/Object;
.source "SbRectFUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static centerOfRect(Landroid/graphics/RectF;)Landroid/graphics/PointF;
    .locals 4

    .line 17
    new-instance v0, Landroid/graphics/PointF;

    iget v1, p0, Landroid/graphics/RectF;->right:F

    iget v2, p0, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget v3, p0, Landroid/graphics/RectF;->bottom:F

    iget p0, p0, Landroid/graphics/RectF;->top:F

    add-float/2addr v3, p0

    div-float/2addr v3, v2

    invoke-direct {v0, v1, v3}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method public static rectWithSameCenter(Landroid/graphics/RectF;FF)Landroid/graphics/RectF;
    .locals 4

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float/2addr p1, v0

    mul-float/2addr p2, v0

    .line 23
    invoke-static {p0}, Lcom/scandit/base/geometry/SbRectFUtils;->centerOfRect(Landroid/graphics/RectF;)Landroid/graphics/PointF;

    move-result-object p0

    .line 24
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Landroid/graphics/PointF;->x:F

    sub-float/2addr v1, p1

    iget v2, p0, Landroid/graphics/PointF;->y:F

    sub-float/2addr v2, p2

    iget v3, p0, Landroid/graphics/PointF;->x:F

    add-float/2addr v3, p1

    iget p0, p0, Landroid/graphics/PointF;->y:F

    add-float/2addr p0, p2

    invoke-direct {v0, v1, v2, v3, p0}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v0
.end method

.method public static rectWithUpdatedCenter(Landroid/graphics/RectF;Landroid/graphics/PointF;)Landroid/graphics/RectF;
    .locals 5

    .line 28
    iget v0, p0, Landroid/graphics/RectF;->right:F

    iget v1, p0, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    .line 29
    iget v2, p0, Landroid/graphics/RectF;->bottom:F

    iget p0, p0, Landroid/graphics/RectF;->top:F

    sub-float/2addr v2, p0

    div-float/2addr v2, v1

    .line 30
    new-instance p0, Landroid/graphics/RectF;

    iget v1, p1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v1, v0

    iget v3, p1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v3, v2

    iget v4, p1, Landroid/graphics/PointF;->x:F

    add-float/2addr v4, v0

    iget p1, p1, Landroid/graphics/PointF;->y:F

    add-float/2addr p1, v2

    invoke-direct {p0, v1, v3, v4, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object p0
.end method
