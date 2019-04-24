.class public abstract Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;
.super Ljava/lang/Object;
.source "BaseBarcodeIndicator.java"


# instance fields
.field public location:Lcom/scandit/recognition/Quadrilateral;

.field private mActive:Z

.field protected final mContext:Landroid/content/Context;

.field protected final mPaint:Landroid/graphics/Paint;

.field private mVisible:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->mContext:Landroid/content/Context;

    .line 31
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->mPaint:Landroid/graphics/Paint;

    .line 32
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->mPaint:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 33
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->mPaint:Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 34
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 35
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 36
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 38
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->mVisible:Z

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 72
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->mVisible:Z

    if-eqz v0, :cond_0

    .line 73
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->internalDraw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method protected abstract internalDraw(Landroid/graphics/Canvas;)V
.end method

.method protected isActive()Z
    .locals 1

    .line 53
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->mActive:Z

    return v0
.end method

.method protected pxFromDp(I)I
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result p1

    return p1
.end method

.method public setActive(Z)V
    .locals 0

    .line 60
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->mActive:Z

    return-void
.end method

.method public setColor(I)V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setLocation(Lcom/scandit/recognition/Quadrilateral;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->location:Lcom/scandit/recognition/Quadrilateral;

    return-void
.end method

.method public setVisible(Z)V
    .locals 0

    .line 46
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->mVisible:Z

    return-void
.end method
