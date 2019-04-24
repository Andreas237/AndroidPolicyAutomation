.class public Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;
.super Landroid/support/v7/widget/AppCompatImageView;
.source "BarcodeImageView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;,
        Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;
    }
.end annotation


# instance fields
.field private barcode:Landroid/graphics/Bitmap;

.field private data:Ljava/lang/String;

.field private dirty:Z

.field private format:Lcom/ibotta/android/barcode/Format;

.field private generateTask:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;

.field private renderedHeight:I

.field private renderedWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Landroid/support/v7/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    .line 26
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->initLayout()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->onBarcodeGenerated(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private initLayout()V
    .locals 1

    .line 63
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f0800aa

    .line 64
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->setImageResource(I)V

    :cond_0
    return-void
.end method

.method private onBarcodeGenerated(Landroid/graphics/Bitmap;)V
    .locals 3

    const-string v0, "onBarcodeGenerated: %1$s"

    const/4 v1, 0x1

    .line 134
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->generateTask:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;

    const/4 v1, 0x0

    .line 136
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->generateTask:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;

    if-eqz v0, :cond_0

    .line 138
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Barcode generation task was cancelled, ignoring."

    .line 139
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 143
    :cond_0
    iput-boolean v2, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->dirty:Z

    .line 144
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method


# virtual methods
.method public freeBitmap()V
    .locals 2

    const-string v0, "freeBitmap"

    const/4 v1, 0x0

    .line 123
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 124
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 126
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->barcode:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_0

    .line 127
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 128
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->barcode:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 129
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->barcode:Landroid/graphics/Bitmap;

    :cond_0
    return-void
.end method

.method public getRenderedHeight()I
    .locals 1

    .line 44
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->renderedHeight:I

    return v0
.end method

.method public getRenderedWidth()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->renderedWidth:I

    return v0
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 118
    invoke-super {p0}, Landroid/support/v7/widget/AppCompatImageView;->onDetachedFromWindow()V

    .line 119
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->freeBitmap()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 6

    .line 81
    invoke-super/range {p0 .. p5}, Landroid/support/v7/widget/AppCompatImageView;->onLayout(ZIIII)V

    sub-int/2addr p4, p2

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->getPaddingLeft()I

    move-result p2

    sub-int/2addr p4, p2

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->getPaddingRight()I

    move-result p2

    sub-int v4, p4, p2

    sub-int/2addr p5, p3

    .line 83
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->getPaddingTop()I

    move-result p2

    sub-int/2addr p5, p2

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->getPaddingBottom()I

    move-result p2

    sub-int v5, p5, p2

    if-lez v4, :cond_7

    if-gtz v5, :cond_0

    goto :goto_2

    .line 89
    :cond_0
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->data:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->format:Lcom/ibotta/android/barcode/Format;

    move-object v0, p2

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;-><init>(Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;Ljava/lang/String;Lcom/ibotta/android/barcode/Format;II)V

    if-nez p1, :cond_1

    .line 90
    iget-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->dirty:Z

    if-eqz p1, :cond_6

    :cond_1
    const-string p1, "Deciding whether to generate a barcode."

    const/4 p3, 0x0

    .line 91
    new-array p4, p3, [Ljava/lang/Object;

    invoke-static {p1, p4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->barcode:Landroid/graphics/Bitmap;

    const/4 p4, 0x1

    if-nez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    .line 96
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->generateTask:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->getBarcodeInfo()Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->isSame(Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;)Z

    move-result p1

    if-nez p1, :cond_3

    const/4 p1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_6

    const p1, 0x7f0801a8

    .line 101
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->setImageResource(I)V

    .line 103
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->generateTask:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;

    if-eqz p1, :cond_4

    .line 104
    invoke-virtual {p1, p4}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->cancel(Z)Z

    .line 107
    :cond_4
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->getWidth()I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->renderedWidth:I

    .line 108
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;->getHeight()I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->renderedHeight:I

    .line 110
    new-instance p1, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;

    invoke-direct {p1, p0, p2}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;-><init>(Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$BarcodeInfo;)V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->generateTask:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;

    .line 111
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->generateTask:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;

    new-array p2, p3, [Ljava/lang/Void;

    instance-of p3, p1, Landroid/os/AsyncTask;

    if-nez p3, :cond_5

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView$GenerateBarcodeTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_1

    :cond_5
    check-cast p1, Landroid/os/AsyncTask;

    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_6
    :goto_1
    return-void

    :cond_7
    :goto_2
    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 70
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/AppCompatImageView;->onMeasure(II)V

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 76
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->getMeasuredWidth()I

    move-result p1

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->format:Lcom/ibotta/android/barcode/Format;

    invoke-virtual {p2}, Lcom/ibotta/android/barcode/Format;->getHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->setMeasuredDimension(II)V

    return-void
.end method

.method public setup(Ljava/lang/String;Lcom/ibotta/android/barcode/Format;)V
    .locals 1

    .line 48
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->dirty:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->data:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->format:Lcom/ibotta/android/barcode/Format;

    if-eqz v0, :cond_1

    if-eq v0, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->dirty:Z

    .line 50
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->data:Ljava/lang/String;

    .line 51
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->format:Lcom/ibotta/android/barcode/Format;

    if-eqz p2, :cond_2

    .line 54
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    invoke-virtual {p2}, Lcom/ibotta/android/barcode/Format;->getWidth()I

    move-result v0

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 55
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    invoke-virtual {p2}, Lcom/ibotta/android/barcode/Format;->getHeight()I

    move-result p2

    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 56
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 59
    :cond_2
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->invalidate()V

    return-void
.end method
