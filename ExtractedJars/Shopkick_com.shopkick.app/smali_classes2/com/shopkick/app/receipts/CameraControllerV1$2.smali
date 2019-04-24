.class Lcom/shopkick/app/receipts/CameraControllerV1$2;
.super Ljava/lang/Object;
.source "CameraControllerV1.java"

# interfaces
.implements Landroid/hardware/Camera$PictureCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/receipts/CameraControllerV1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/CameraControllerV1;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/CameraControllerV1;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPictureTaken([BLandroid/hardware/Camera;)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 247
    iget-object v2, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    const/4 v8, 0x1

    iput-boolean v8, v2, Lcom/shopkick/app/receipts/CameraControllerV1;->isProcessingInitialImage:Z

    .line 250
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v2

    .line 251
    invoke-static {}, Lcom/shopkick/app/receipts/CameraControllerV1;->access$000()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "Beginning JpegCallback with  %1.2fkb JPEG image."

    new-array v6, v8, [Ljava/lang/Object;

    array-length v7, v0

    int-to-float v7, v7

    const/high16 v9, 0x44800000    # 1024.0f

    div-float/2addr v7, v9

    .line 254
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    const/4 v10, 0x0

    aput-object v7, v6, v10

    .line 252
    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 251
    invoke-virtual {v2, v3, v4}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Area;->SCAN:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "Beginning JpegCallback with  %1.2fkb JPEG image."

    new-array v7, v8, [Ljava/lang/Object;

    array-length v11, v0

    int-to-float v11, v11

    div-float/2addr v11, v9

    .line 258
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    aput-object v11, v7, v10

    .line 256
    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-array v6, v10, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    if-eqz v0, :cond_6

    .line 261
    :try_start_0
    array-length v2, v0

    if-gtz v2, :cond_0

    goto/16 :goto_1

    .line 265
    :cond_0
    iget-object v2, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    iget-object v2, v2, Lcom/shopkick/app/receipts/CameraControllerV1;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v2}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->showPreviewImage()V

    .line 270
    iget-object v2, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    invoke-static {v2, v0}, Lcom/shopkick/app/receipts/CameraControllerV1;->access$100(Lcom/shopkick/app/receipts/CameraControllerV1;[B)I

    move-result v2

    const/4 v11, 0x3

    if-eq v2, v11, :cond_3

    const/4 v3, 0x6

    if-eq v2, v3, :cond_2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_1

    move v12, v10

    goto :goto_0

    :cond_1
    const/16 v2, 0x10e

    move v12, v2

    goto :goto_0

    :cond_2
    const/16 v2, 0x5a

    move v12, v2

    goto :goto_0

    :cond_3
    const/16 v2, 0xb4

    move v12, v2

    .line 287
    :goto_0
    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    move-result-object v2

    iget-object v3, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    iget-object v3, v3, Lcom/shopkick/app/receipts/CameraControllerV1;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    .line 288
    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    .line 289
    invoke-virtual {v3}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 290
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    iget v5, v4, Lcom/shopkick/app/receipts/CameraControllerV1;->jpegCompressionLevel:I

    iget-object v4, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    .line 293
    invoke-static {v4}, Lcom/shopkick/app/receipts/CameraControllerV1;->access$200(Lcom/shopkick/app/receipts/CameraControllerV1;)Z

    move-result v7

    move-object/from16 v4, p1

    move v6, v12

    .line 288
    invoke-virtual/range {v2 .. v7}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->addImage(Landroid/content/Context;[BIIZ)Ljava/io/File;

    move-result-object v2

    .line 294
    iget-object v3, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    iput-object v2, v3, Lcom/shopkick/app/receipts/CameraControllerV1;->lastImageCache:Ljava/io/File;

    .line 297
    iget-object v2, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    iget-object v2, v2, Lcom/shopkick/app/receipts/CameraControllerV1;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v2}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getPreviewWidth()I

    move-result v2

    .line 299
    iget-object v3, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    iget-object v3, v3, Lcom/shopkick/app/receipts/CameraControllerV1;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v3}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getPreviewHeight()I

    move-result v3

    .line 302
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 303
    iput-boolean v8, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 304
    array-length v5, v0

    invoke-static {v0, v10, v5, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 305
    iget v5, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-double v5, v5

    .line 306
    iget v7, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-double v13, v7

    .line 307
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v7

    invoke-virtual {v7}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v7

    sget-object v15, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v15}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v15

    sget-object v17, Lcom/shopkick/logging/Area;->SCAN:Lcom/shopkick/logging/Area;

    invoke-virtual/range {v17 .. v17}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v17

    or-long v8, v15, v17

    sget-object v15, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v10, "Captured %1.2f kb JPEG image [%2$dx%3$d]"

    move/from16 v17, v12

    new-array v12, v11, [Ljava/lang/Object;

    array-length v11, v0

    int-to-float v11, v11

    const/high16 v19, 0x44800000    # 1024.0f

    div-float v11, v11, v19

    .line 310
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    const/16 v16, 0x0

    aput-object v11, v12, v16

    iget v11, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 311
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/16 v20, 0x1

    aput-object v11, v12, v20

    iget v11, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 312
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/16 v20, 0x2

    aput-object v11, v12, v20

    .line 308
    invoke-static {v15, v10, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    new-array v12, v11, [Ljava/lang/Object;

    .line 307
    invoke-virtual {v7, v8, v9, v10, v12}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 313
    iget-object v7, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    double-to-int v8, v5

    iput v8, v7, Lcom/shopkick/app/receipts/CameraControllerV1;->lastWidthCache:I

    .line 314
    iget-object v7, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    double-to-int v9, v13

    iput v9, v7, Lcom/shopkick/app/receipts/CameraControllerV1;->lastHeightCache:I

    .line 315
    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    move-result-object v7

    invoke-virtual {v7, v9}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->setLastHeight(I)V

    .line 316
    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    move-result-object v7

    invoke-virtual {v7, v8}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->setLastWidth(I)V

    int-to-double v10, v2

    div-double/2addr v5, v10

    .line 319
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-int v5, v5

    int-to-double v6, v3

    div-double/2addr v13, v6

    .line 320
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-int v6, v6

    .line 319
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 321
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v6

    invoke-virtual {v6}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v6

    sget-object v7, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v7}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v10

    sget-object v7, Lcom/shopkick/logging/Area;->SCAN:Lcom/shopkick/logging/Area;

    invoke-virtual {v7}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v12

    or-long/2addr v10, v12

    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v12, "Beginning option calculations. Image Width: %1d, TargetWidth: %2d, ImageHeight: %3d, TargetHeight: %4d, ScaleFactor: %5d"

    const/4 v13, 0x5

    new-array v13, v13, [Ljava/lang/Object;

    .line 325
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v14, 0x0

    aput-object v8, v13, v14

    .line 326
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v8, 0x1

    aput-object v2, v13, v8

    .line 327
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v13, v20

    .line 328
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v13, v3

    .line 329
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v13, v3

    .line 322
    invoke-static {v7, v12, v13}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x0

    new-array v8, v7, [Ljava/lang/Object;

    .line 321
    invoke-virtual {v6, v10, v11, v2, v8}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 331
    iput-boolean v7, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 332
    iput v5, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 v2, 0x1

    .line 333
    iput-boolean v2, v4, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    .line 334
    iget-object v2, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    invoke-static {v2}, Lcom/shopkick/app/receipts/CameraControllerV1;->access$200(Lcom/shopkick/app/receipts/CameraControllerV1;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 335
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v2, v4, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 337
    :cond_4
    array-length v2, v0

    const/4 v6, 0x0

    invoke-static {v0, v6, v2, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 338
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v2

    invoke-virtual {v0, v2, v6}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 339
    iget-object v4, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    iget-object v4, v4, Lcom/shopkick/app/receipts/CameraControllerV1;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, v4, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableOcrProcessing:Ljava/lang/Boolean;

    const/4 v6, 0x1

    invoke-static {v4, v6}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;Z)Z

    move-result v4

    if-nez v4, :cond_5

    .line 340
    new-instance v4, Ljava/lang/Thread;

    new-instance v6, Lcom/shopkick/app/receipts/CameraControllerV1$2$1;

    invoke-direct {v6, v1, v2}, Lcom/shopkick/app/receipts/CameraControllerV1$2$1;-><init>(Lcom/shopkick/app/receipts/CameraControllerV1$2;Landroid/graphics/Bitmap;)V

    invoke-direct {v4, v6}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 345
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    .line 348
    :cond_5
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v4, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    sget-object v4, Lcom/shopkick/logging/Area;->SCAN:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v8

    or-long/2addr v6, v8

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v8, "Beginning orientation pass for %1.2f kb Preview image [%2$dx%3$d] with scale of %4d"

    new-array v3, v3, [Ljava/lang/Object;

    .line 351
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result v9

    int-to-float v9, v9

    const/high16 v10, 0x44800000    # 1024.0f

    div-float/2addr v9, v10

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v3, v10

    .line 352
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v10, 0x1

    aput-object v9, v3, v10

    .line 353
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v3, v20

    .line 354
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v9, 0x3

    aput-object v5, v3, v9

    .line 349
    invoke-static {v4, v8, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    .line 348
    invoke-virtual {v2, v6, v7, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    move/from16 v2, v17

    .line 356
    invoke-static {v0, v2}, Lcom/shopkick/app/receipts/CameraControllerV1;->rotate(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 364
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    iget-object v3, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    iget-object v3, v3, Lcom/shopkick/app/receipts/CameraControllerV1;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v3}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getAlignHereHeight()I

    move-result v3

    sub-int/2addr v2, v3

    .line 365
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    iget-object v4, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    iget-object v4, v4, Lcom/shopkick/app/receipts/CameraControllerV1;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    .line 366
    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v4}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getAlignHereHeight()I

    move-result v4

    const/4 v5, 0x0

    .line 362
    invoke-static {v0, v5, v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 367
    iget-object v3, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    iget-object v3, v3, Lcom/shopkick/app/receipts/CameraControllerV1;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setTempAlignHerePreviewBitmap(Landroid/graphics/Bitmap;)V

    .line 371
    iget-object v2, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    const/4 v3, 0x0

    iput-boolean v3, v2, Lcom/shopkick/app/receipts/CameraControllerV1;->isProcessingInitialImage:Z

    .line 373
    iget-object v2, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    iget-object v2, v2, Lcom/shopkick/app/receipts/CameraControllerV1;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v2, v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setPreviewImage(Landroid/graphics/Bitmap;)V

    .line 375
    iget-object v0, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    sget-object v2, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->PREVIEW:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    invoke-virtual {v2}, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->ordinal()I

    move-result v2

    invoke-static {v0, v2}, Lcom/shopkick/app/receipts/CameraControllerV1;->access$300(Lcom/shopkick/app/receipts/CameraControllerV1;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 378
    iget-object v0, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/shopkick/app/receipts/CameraControllerV1;->access$402(Lcom/shopkick/app/receipts/CameraControllerV1;Z)Z

    .line 379
    iget-object v0, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    iput-boolean v2, v0, Lcom/shopkick/app/receipts/CameraControllerV1;->isProcessingInitialImage:Z

    return-void

    :catchall_0
    move-exception v0

    .line 378
    iget-object v2, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/shopkick/app/receipts/CameraControllerV1;->access$402(Lcom/shopkick/app/receipts/CameraControllerV1;Z)Z

    .line 379
    iget-object v2, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    iput-boolean v3, v2, Lcom/shopkick/app/receipts/CameraControllerV1;->isProcessingInitialImage:Z

    throw v0

    :cond_6
    :goto_1
    move v3, v10

    .line 378
    iget-object v0, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    invoke-static {v0, v3}, Lcom/shopkick/app/receipts/CameraControllerV1;->access$402(Lcom/shopkick/app/receipts/CameraControllerV1;Z)Z

    .line 379
    iget-object v0, v1, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    iput-boolean v3, v0, Lcom/shopkick/app/receipts/CameraControllerV1;->isProcessingInitialImage:Z

    return-void
.end method
