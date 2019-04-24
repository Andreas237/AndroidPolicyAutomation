.class public Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;
.super Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;
.source "TrackedBarcodeIndicator.java"


# instance fields
.field private state:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 21
    iput p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;->state:I

    return-void
.end method

.method private pointBetween(Landroid/graphics/Point;Landroid/graphics/Point;F)Landroid/graphics/Point;
    .locals 3

    .line 120
    iget v0, p1, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, p2, Landroid/graphics/Point;->x:I

    iget v2, p1, Landroid/graphics/Point;->x:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    mul-float/2addr v1, p3

    add-float/2addr v0, v1

    float-to-int v0, v0

    .line 121
    iget v1, p1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget p2, p2, Landroid/graphics/Point;->y:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    sub-int/2addr p2, p1

    int-to-float p1, p2

    mul-float/2addr p1, p3

    add-float/2addr v1, p1

    float-to-int p1, v1

    .line 122
    new-instance p2, Landroid/graphics/Point;

    invoke-direct {p2, v0, p1}, Landroid/graphics/Point;-><init>(II)V

    return-object p2
.end method


# virtual methods
.method protected declared-synchronized internalDraw(Landroid/graphics/Canvas;)V
    .locals 0

    monitor-enter p0

    .line 65
    :try_start_0
    invoke-super {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->internalDraw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setLocation(Lcom/scandit/recognition/Quadrilateral;)V
    .locals 0

    .line 33
    invoke-super {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->setLocation(Lcom/scandit/recognition/Quadrilateral;)V

    return-void
.end method

.method public declared-synchronized setState(I)V
    .locals 1

    monitor-enter p0

    .line 37
    :try_start_0
    iput p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;->state:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 40
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;->mPaint:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto :goto_0

    .line 42
    :cond_0
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicator;->mPaint:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
