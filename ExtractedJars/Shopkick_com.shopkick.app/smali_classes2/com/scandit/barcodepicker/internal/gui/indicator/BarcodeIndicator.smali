.class public Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;
.super Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;
.source "BarcodeIndicator.java"


# instance fields
.field private final mPath:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 22
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;-><init>(Landroid/content/Context;)V

    .line 24
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->mPath:Landroid/graphics/Path;

    const/16 p1, 0x39

    const/16 v0, 0xc0

    const/16 v1, 0xcc

    .line 25
    invoke-static {p1, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->setColor(I)V

    const/4 p1, 0x1

    .line 26
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->setLineWidth(I)V

    return-void
.end method

.method private updatePath()V
    .locals 3

    .line 40
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->mPath:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 41
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->location:Lcom/scandit/recognition/Quadrilateral;

    if-eqz v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->mPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->location:Lcom/scandit/recognition/Quadrilateral;

    iget-object v1, v1, Lcom/scandit/recognition/Quadrilateral;->top_left:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->location:Lcom/scandit/recognition/Quadrilateral;

    iget-object v2, v2, Lcom/scandit/recognition/Quadrilateral;->top_left:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 43
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->mPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->location:Lcom/scandit/recognition/Quadrilateral;

    iget-object v1, v1, Lcom/scandit/recognition/Quadrilateral;->top_right:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->location:Lcom/scandit/recognition/Quadrilateral;

    iget-object v2, v2, Lcom/scandit/recognition/Quadrilateral;->top_right:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 44
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->mPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->location:Lcom/scandit/recognition/Quadrilateral;

    iget-object v1, v1, Lcom/scandit/recognition/Quadrilateral;->bottom_right:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->location:Lcom/scandit/recognition/Quadrilateral;

    iget-object v2, v2, Lcom/scandit/recognition/Quadrilateral;->bottom_right:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 45
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->mPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->location:Lcom/scandit/recognition/Quadrilateral;

    iget-object v1, v1, Lcom/scandit/recognition/Quadrilateral;->bottom_left:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->location:Lcom/scandit/recognition/Quadrilateral;

    iget-object v2, v2, Lcom/scandit/recognition/Quadrilateral;->bottom_left:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 46
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->mPath:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    :cond_0
    return-void
.end method


# virtual methods
.method protected internalDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 52
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->mPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public setLineWidth(I)V
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->pxFromDp(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public setLocation(Lcom/scandit/recognition/Quadrilateral;)V
    .locals 0

    .line 35
    invoke-super {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->setLocation(Lcom/scandit/recognition/Quadrilateral;)V

    .line 36
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->updatePath()V

    return-void
.end method
