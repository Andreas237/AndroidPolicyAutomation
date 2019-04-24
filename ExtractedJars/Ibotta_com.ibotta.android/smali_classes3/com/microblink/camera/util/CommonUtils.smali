.class public final Lcom/microblink/camera/util/CommonUtils;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final absolutizePointCoordinate([FFF)V
    .locals 2

    const/4 v0, 0x0

    aget v1, p0, v0

    mul-float v1, v1, p1

    aput v1, p0, v0

    const/4 p1, 0x1

    aget v0, p0, p1

    mul-float v0, v0, p2

    aput v0, p0, p1

    return-void
.end method

.method public static final clampToUnitRect(Landroid/graphics/RectF;)V
    .locals 3

    iget v0, p0, Landroid/graphics/RectF;->left:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    iput v1, p0, Landroid/graphics/RectF;->left:F

    :cond_0
    iget v0, p0, Landroid/graphics/RectF;->left:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-lez v0, :cond_1

    iput v2, p0, Landroid/graphics/RectF;->left:F

    :cond_1
    iget v0, p0, Landroid/graphics/RectF;->top:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    iput v1, p0, Landroid/graphics/RectF;->top:F

    :cond_2
    iget v0, p0, Landroid/graphics/RectF;->top:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_3

    iput v2, p0, Landroid/graphics/RectF;->top:F

    :cond_3
    iget v0, p0, Landroid/graphics/RectF;->right:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    iput v1, p0, Landroid/graphics/RectF;->right:F

    :cond_4
    iget v0, p0, Landroid/graphics/RectF;->right:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_5

    iput v2, p0, Landroid/graphics/RectF;->right:F

    :cond_5
    iget v0, p0, Landroid/graphics/RectF;->bottom:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_6

    iput v1, p0, Landroid/graphics/RectF;->bottom:F

    :cond_6
    iget v0, p0, Landroid/graphics/RectF;->bottom:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_7

    iput v2, p0, Landroid/graphics/RectF;->bottom:F

    :cond_7
    return-void
.end method

.method public static hostOrientationIsPortrait(Landroid/content/Context;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "window"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/WindowManager;

    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget p0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    if-ge p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final landscapeRightPointToPoint([FIFF)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    sparse-switch p1, :sswitch_data_0

    return-void

    :sswitch_0
    aget p1, p0, v1

    aget p2, p0, v0

    sub-float/2addr p3, p2

    aput p1, p0, v0

    aput p3, p0, v1

    return-void

    :sswitch_1
    aget p1, p0, v0

    sub-float/2addr p2, p1

    aget p1, p0, v1

    sub-float/2addr p3, p1

    aput p2, p0, v0

    aput p3, p0, v1

    return-void

    :sswitch_2
    aget p1, p0, v1

    sub-float/2addr p2, p1

    aget p1, p0, v0

    aput p2, p0, v0

    aput p1, p0, v1

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x1 -> :sswitch_2
        0x8 -> :sswitch_1
        0x9 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final pointToLandscapeRightPoint([FIFF)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    sparse-switch p1, :sswitch_data_0

    return-void

    :sswitch_0
    aget p1, p0, v1

    sub-float/2addr p3, p1

    aget p1, p0, v0

    aput p3, p0, v0

    aput p1, p0, v1

    return-void

    :sswitch_1
    aget p1, p0, v0

    sub-float/2addr p2, p1

    aget p1, p0, v1

    sub-float/2addr p3, p1

    aput p2, p0, v0

    aput p3, p0, v1

    return-void

    :sswitch_2
    aget p1, p0, v1

    aget p3, p0, v0

    sub-float/2addr p2, p3

    aput p1, p0, v0

    aput p2, p0, v1

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x1 -> :sswitch_2
        0x8 -> :sswitch_1
        0x9 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final relativizePointCoordinate([FFF)V
    .locals 2

    const/4 v0, 0x0

    aget v1, p0, v0

    div-float/2addr v1, p1

    aput v1, p0, v0

    const/4 p1, 0x1

    aget v0, p0, p1

    div-float/2addr v0, p2

    aput v0, p0, p1

    return-void
.end method
