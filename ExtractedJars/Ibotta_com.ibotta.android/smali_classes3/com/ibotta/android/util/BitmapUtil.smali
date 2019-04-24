.class public Lcom/ibotta/android/util/BitmapUtil;
.super Ljava/lang/Object;
.source "BitmapUtil.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public calculateTargetSampleSize(ILcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;)I
    .locals 9

    const/4 v0, 0x1

    if-lez p1, :cond_6

    .line 96
    invoke-virtual {p2}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->getWidth()I

    move-result v1

    if-lez v1, :cond_6

    invoke-virtual {p2}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->getHeight()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_3

    .line 101
    :cond_0
    invoke-virtual {p2}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->getWidth()I

    move-result v1

    invoke-virtual {p2}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->getHeight()I

    move-result p2

    .line 100
    invoke-virtual {p0, v1, p2}, Lcom/ibotta/android/util/BitmapUtil;->getDimensAsHeightBeingLongSide(II)Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;

    move-result-object p2

    const/4 v1, 0x0

    :cond_1
    add-int/2addr v1, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    int-to-double v4, v1

    div-double/2addr v2, v4

    .line 111
    invoke-virtual {p2}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->getWidth()I

    move-result v4

    int-to-double v4, v4

    mul-double v4, v4, v2

    .line 112
    invoke-virtual {p2}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->getHeight()I

    move-result v6

    int-to-double v6, v6

    mul-double v6, v6, v2

    int-to-double v2, p1

    cmpg-double v8, v4, v2

    if-ltz v8, :cond_3

    const-wide/16 v2, 0x0

    cmpg-double v8, v4, v2

    if-lez v8, :cond_3

    cmpg-double v8, v6, v2

    if-gtz v8, :cond_2

    goto :goto_0

    :cond_2
    cmpl-double v8, v4, v2

    if-lez v8, :cond_4

    cmpl-double v4, v6, v2

    if-gtz v4, :cond_1

    goto :goto_1

    :cond_3
    :goto_0
    add-int/lit8 v1, v1, -0x1

    :cond_4
    :goto_1
    if-gtz v1, :cond_5

    goto :goto_2

    :cond_5
    move v0, v1

    :goto_2
    return v0

    :cond_6
    :goto_3
    return v0
.end method

.method public compress(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;I)V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 65
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {p1, p3, p4, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    return-void
.end method

.method public createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    .locals 0

    .line 52
    invoke-static/range {p1 .. p7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public createMatrix()Landroid/graphics/Matrix;
    .locals 1

    .line 56
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    return-object v0
.end method

.method public decodeBounds(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 36
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v1, 0x1

    .line 37
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 39
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/util/BitmapUtil;->decodeFileToBitmap(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public decodeFileToBitmap(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 0
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 31
    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public getDimensAsHeightBeingLongSide(II)Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;
    .locals 1

    .line 89
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 90
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 92
    invoke-static {v0, p1}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->create(II)Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;

    move-result-object p1

    return-object p1
.end method

.method public getDimensAsHeightBeingLongSide(Landroid/graphics/Bitmap;)Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;
    .locals 1

    .line 85
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/util/BitmapUtil;->getDimensAsHeightBeingLongSide(II)Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;

    move-result-object p1

    return-object p1
.end method

.method public recycle(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 24
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 25
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_0
    return-void
.end method

.method public toByteArrayOutputStream([B)Ljava/io/ByteArrayOutputStream;
    .locals 3

    .line 69
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 72
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Failed to save image data to ByteArrayOutputStream."

    const/4 v2, 0x0

    .line 76
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-object v0
.end method
