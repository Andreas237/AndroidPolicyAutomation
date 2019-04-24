.class public Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;
.super Ljava/lang/Object;
.source "ReceiptProcessingMath.java"


# static fields
.field private static final CROP_PAD_PERCENTAGE:F = 0.02f

.field private static final RECEIPT_MIN_WIDTH:I = 0x578

.field private static final RESAMPLE_PERC_OF_MEMORY:D = 0.333


# instance fields
.field private final bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

.field private final maxAvailableMemory:J


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/BitmapUtil;J)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    .line 29
    iput-wide p2, p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->maxAvailableMemory:J

    return-void
.end method


# virtual methods
.method public calculateInSampleSize(IID)I
    .locals 22

    move-object/from16 v0, p0

    .line 41
    iget-object v1, v0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    move/from16 v2, p1

    move/from16 v3, p2

    invoke-virtual {v1, v2, v3}, Lcom/ibotta/android/util/BitmapUtil;->getDimensAsHeightBeingLongSide(II)Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;

    move-result-object v1

    .line 42
    invoke-virtual {v1}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->getWidth()I

    move-result v2

    .line 43
    invoke-virtual {v1}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->getHeight()I

    move-result v1

    .line 46
    iget-wide v3, v0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->maxAvailableMemory:J

    long-to-double v3, v3

    const-wide v5, 0x3fd54fdf3b645a1dL    # 0.333

    mul-double v3, v3, v5

    double-to-int v3, v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    const/4 v6, 0x1

    add-int/2addr v5, v6

    int-to-double v7, v5

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    div-double v11, v9, v7

    const-wide/high16 v13, 0x4000000000000000L    # 2.0

    int-to-double v9, v2

    mul-double v13, v13, v9

    move-wide/from16 v16, v7

    int-to-double v6, v1

    mul-double v13, v13, v6

    mul-double v18, v13, v11

    const-string v8, "Sample size would be: ss=%1$d, size=%2$f"

    const/4 v15, 0x2

    .line 62
    new-array v0, v15, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v21

    aput-object v21, v0, v4

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v21

    const/16 v20, 0x1

    aput-object v21, v0, v20

    invoke-static {v8, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    move v8, v5

    int-to-double v4, v3

    cmpl-double v21, v18, v4

    if-gez v21, :cond_2

    mul-double v9, v9, v11

    mul-double v9, v9, p3

    const/4 v1, 0x0

    :goto_1
    const-wide v2, 0x4095e00000000000L    # 1400.0

    cmpl-double v4, v9, v2

    if-lez v4, :cond_1

    const-string v4, "Calculated final resizedWidth: %1$f"

    const/4 v5, 0x1

    .line 76
    new-array v11, v5, [Ljava/lang/Object;

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    const/4 v0, 0x0

    aput-object v9, v11, v0

    invoke-static {v4, v11}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    int-to-double v9, v1

    add-double v9, v16, v9

    const-wide/high16 v11, 0x3ff0000000000000L    # 1.0

    div-double v9, v11, v9

    mul-double v18, v13, v9

    mul-double v9, v9, v6

    mul-double v9, v9, p3

    cmpg-double v4, v9, v2

    if-gez v4, :cond_0

    if-lez v1, :cond_0

    add-int/lit8 v1, v1, -0x1

    const/4 v0, 0x0

    const/4 v5, 0x1

    goto :goto_2

    :cond_0
    const-string v2, "Sample size would be: ss=%1$d, size=%2$f"

    .line 88
    new-array v3, v15, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v0, 0x0

    aput-object v4, v3, v0

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    const/4 v5, 0x1

    :goto_2
    add-int v2, v8, v1

    const-string v3, "Final sample size: %1$d, forMem=%2$d, forMin=%3$d"

    const/4 v4, 0x3

    .line 93
    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v15

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_2
    const/4 v0, 0x0

    move v5, v8

    move-object/from16 v0, p0

    const/4 v4, 0x0

    goto/16 :goto_0
.end method

.method public calculateInSampleSize(Ljava/io/File;D)I
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/util/BitmapUtil;->decodeBounds(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;

    move-result-object p1

    .line 36
    iget v0, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget p1, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->calculateInSampleSize(IID)I

    move-result p1

    return p1
.end method

.method public enforceZeroDoubleMin(D)D
    .locals 3

    const-wide/16 v0, 0x0

    cmpl-double v2, p1, v0

    if-ltz v2, :cond_0

    goto :goto_0

    :cond_0
    move-wide p1, v0

    :goto_0
    return-wide p1
.end method

.method public enforceZeroMin(I)I
    .locals 0

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public extractJustReceiptFromImage(Landroid/graphics/Bitmap;Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;)Landroid/graphics/Bitmap;
    .locals 19

    move-object/from16 v0, p0

    .line 179
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getOrientation()I

    move-result v1

    .line 180
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptPercDistFromLeft()D

    move-result-wide v2

    .line 181
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptPercDistFromRight()D

    move-result-wide v4

    .line 182
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptPercDistFromTop()D

    move-result-wide v6

    .line 183
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptPercDistFromBottom()D

    move-result-wide v8

    .line 186
    iget-object v10, v0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    move-object/from16 v12, p1

    invoke-virtual {v10, v12}, Lcom/ibotta/android/util/BitmapUtil;->getDimensAsHeightBeingLongSide(Landroid/graphics/Bitmap;)Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;

    move-result-object v10

    .line 187
    invoke-virtual {v10}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->getWidth()I

    move-result v11

    int-to-double v13, v11

    .line 188
    invoke-virtual {v10}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->getHeight()I

    move-result v10

    int-to-double v10, v10

    mul-double v2, v2, v13

    double-to-int v2, v2

    .line 192
    invoke-virtual {v0, v2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->enforceZeroMin(I)I

    move-result v2

    mul-double v6, v6, v10

    double-to-int v3, v6

    .line 193
    invoke-virtual {v0, v3}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->enforceZeroMin(I)I

    move-result v3

    mul-double v4, v4, v13

    sub-double v4, v13, v4

    int-to-double v6, v2

    sub-double/2addr v4, v6

    double-to-int v4, v4

    double-to-int v5, v13

    .line 194
    invoke-virtual {v0, v4, v5}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->useDefaultIfBelowZero(II)I

    move-result v4

    mul-double v8, v8, v10

    sub-double v5, v10, v8

    int-to-double v7, v3

    sub-double/2addr v5, v7

    double-to-int v5, v5

    double-to-int v6, v10

    .line 195
    invoke-virtual {v0, v5, v6}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->useDefaultIfBelowZero(II)I

    move-result v5

    .line 198
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-le v6, v7, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 199
    :goto_0
    iget-object v7, v0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    invoke-virtual {v7}, Lcom/ibotta/android/util/BitmapUtil;->createMatrix()Landroid/graphics/Matrix;

    move-result-object v7

    if-eqz v6, :cond_1

    int-to-float v6, v1

    .line 203
    invoke-virtual {v7, v6}, Landroid/graphics/Matrix;->postRotate(F)Z

    const-string v6, "Will rotate image %1$d degrees"

    .line 204
    new-array v10, v8, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v10, v9

    invoke-static {v6, v10}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    move v14, v2

    move v13, v3

    move/from16 v16, v4

    move v15, v5

    goto :goto_1

    :cond_1
    move v13, v2

    move v14, v3

    move v15, v4

    move/from16 v16, v5

    :goto_1
    const-string v1, "Cropping: x=%1$d, y=%2$d, cropW=%3$d, cropH=%4$d"

    const/4 v2, 0x4

    .line 217
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v9

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v8

    const/4 v3, 0x2

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x3

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    iget-object v11, v0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    const/16 v18, 0x0

    move-object/from16 v12, p1

    move-object/from16 v17, v7

    invoke-virtual/range {v11 .. v18}, Lcom/ibotta/android/util/BitmapUtil;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    return-object v1
.end method

.method public scaleReceiptEdgePercentagesForBitmap(Landroid/graphics/Bitmap;Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;
    .locals 18

    move-object/from16 v0, p0

    .line 121
    iget-object v1, v0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Lcom/ibotta/android/util/BitmapUtil;->getDimensAsHeightBeingLongSide(Landroid/graphics/Bitmap;)Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;

    move-result-object v1

    .line 122
    invoke-virtual {v1}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->getWidth()I

    move-result v2

    int-to-double v2, v2

    .line 123
    invoke-virtual {v1}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->getHeight()I

    move-result v1

    int-to-double v4, v1

    .line 125
    iget-object v1, v0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    .line 126
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getPreviewWidth()I

    move-result v6

    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getPreviewHeight()I

    move-result v7

    .line 125
    invoke-virtual {v1, v6, v7}, Lcom/ibotta/android/util/BitmapUtil;->getDimensAsHeightBeingLongSide(II)Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;

    move-result-object v1

    .line 128
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptSizeWidthPerc()D

    move-result-wide v6

    .line 129
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptSizeHeightPerc()D

    move-result-wide v8

    .line 130
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptPercDistFromTop()D

    move-result-wide v10

    .line 131
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptPercDistFromBottom()D

    move-result-wide v12

    .line 134
    invoke-virtual {v1}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->getHeight()I

    move-result v14

    int-to-double v14, v14

    div-double v14, v4, v14

    .line 137
    invoke-virtual {v1}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->getWidth()I

    move-result v0

    move-wide/from16 v16, v10

    int-to-double v10, v0

    mul-double v6, v6, v10

    mul-double v6, v6, v14

    sub-double v6, v2, v6

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    div-double/2addr v6, v10

    .line 146
    invoke-virtual {v1}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->getHeight()I

    move-result v0

    int-to-double v0, v0

    mul-double v8, v8, v0

    mul-double v8, v8, v14

    sub-double v0, v4, v8

    add-double v10, v16, v12

    div-double v8, v16, v10

    div-double/2addr v12, v10

    mul-double v8, v8, v0

    mul-double v12, v12, v0

    .line 162
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->toBuilder()Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    div-double/2addr v6, v2

    const-wide v1, 0x3f947ae140000000L    # 0.019999999552965164

    sub-double/2addr v6, v1

    move-object/from16 v3, p0

    .line 163
    invoke-virtual {v3, v6, v7}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->enforceZeroDoubleMin(D)D

    move-result-wide v10

    invoke-virtual {v0, v10, v11}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->receiptPercDistFromLeft(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 164
    invoke-virtual {v3, v6, v7}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->enforceZeroDoubleMin(D)D

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->receiptPercDistFromRight(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    div-double/2addr v8, v4

    sub-double/2addr v8, v1

    .line 165
    invoke-virtual {v3, v8, v9}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->enforceZeroDoubleMin(D)D

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->receiptPercDistFromTop(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    div-double/2addr v12, v4

    sub-double/2addr v12, v1

    .line 166
    invoke-virtual {v3, v12, v13}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->enforceZeroDoubleMin(D)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->receiptPercDistFromBottom(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 167
    invoke-virtual {v0}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->build()Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;

    move-result-object v0

    return-object v0
.end method

.method public useDefaultIfBelowZero(II)I
    .locals 0

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    return p1
.end method
