.class public Lcom/shopkick/app/receipts/ReceiptScanImageCache;
.super Ljava/lang/Object;
.source "ReceiptScanImageCache.java"


# static fields
.field private static final CACHE_FOLDER_NAME:Ljava/lang/String; = "receipt_scan_cache"

.field private static Instance:Lcom/shopkick/app/receipts/ReceiptScanImageCache; = null

.field private static final LOG_TAG:Ljava/lang/String;

.field private static final MAX_FILE_SIZE:I = 0x4c4b40

.field private static final MAX_RESIZE_COUNT:I = 0x5


# instance fields
.field private final cacheLock:Ljava/lang/Object;

.field private lastHeight:I

.field private lastWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    new-instance v0, Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    invoke-direct {v0}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;-><init>()V

    sput-object v0, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->Instance:Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    .line 53
    const-class v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->LOG_TAG:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->cacheLock:Ljava/lang/Object;

    return-void
.end method

.method private addImage(Landroid/content/Context;Landroid/graphics/Bitmap;[BIIZ)Ljava/io/File;
    .locals 21

    move-object/from16 v0, p3

    move/from16 v1, p4

    move/from16 v2, p5

    if-eqz p1, :cond_a

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-lez v1, :cond_9

    const/16 v5, 0x64

    if-gt v1, v5, :cond_9

    move-object/from16 v5, p0

    .line 138
    iget-object v6, v5, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->cacheLock:Ljava/lang/Object;

    monitor-enter v6

    const/4 v7, 0x0

    .line 145
    :try_start_0
    invoke-direct/range {p0 .. p1}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getCacheFolder(Landroid/content/Context;)Ljava/io/File;

    move-result-object v8

    .line 146
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v10, "%1$d_%2$d.jpeg"

    const/4 v11, 0x2

    new-array v12, v11, [Ljava/lang/Object;

    .line 148
    invoke-virtual {v8}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v13

    array-length v13, v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v12, v4

    .line 149
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    aput-object v13, v12, v3

    .line 146
    invoke-static {v9, v10, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 150
    invoke-static {v9, v7, v8}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v8
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_9
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    if-nez p2, :cond_1

    .line 160
    :try_start_1
    new-instance v10, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v10}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    if-nez p6, :cond_0

    .line 162
    sget-object v12, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v12, v10, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 165
    :cond_0
    array-length v12, v0

    invoke-static {v0, v4, v12, v10}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v10, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object/from16 v10, p2

    goto/16 :goto_d

    :catch_0
    move-exception v0

    move-object/from16 v10, p2

    goto/16 :goto_c

    :cond_1
    move-object/from16 v10, p2

    .line 169
    :goto_0
    :try_start_2
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    sget-object v12, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->LOG_TAG:Ljava/lang/String;

    sget-object v13, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v14, "Decompressed image into a  %1.2f kb bitmap. GC hook here."

    new-array v15, v3, [Ljava/lang/Object;

    .line 170
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result v7

    int-to-float v7, v7

    const/high16 v20, 0x44800000    # 1024.0f

    div-float v7, v7, v20

    .line 169
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    aput-object v7, v15, v4

    invoke-static {v13, v14, v15}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v12, v7}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    if-lez v2, :cond_2

    .line 176
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    int-to-float v2, v2

    .line 177
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->postRotate(F)Z

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 181
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v15

    .line 182
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v16

    const/16 v18, 0x1

    move-object v12, v10

    move-object/from16 v17, v0

    .line 178
    invoke-static/range {v12 .. v18}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_8
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 187
    :try_start_3
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    sget-object v7, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->LOG_TAG:Ljava/lang/String;

    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v12, "Rotated image bitmap into a  %1.2f kb bitmap. GC hook here."

    new-array v13, v3, [Ljava/lang/Object;

    .line 188
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result v14

    int-to-float v14, v14

    div-float v14, v14, v20

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    aput-object v14, v13, v4

    .line 187
    invoke-static {v10, v12, v13}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v7, v10}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object v10, v2

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v1, v0

    move-object v10, v2

    goto/16 :goto_a

    :catch_1
    move-exception v0

    move-object v10, v2

    goto/16 :goto_b

    :cond_2
    :goto_1
    move v0, v4

    const/4 v7, 0x0

    :goto_2
    add-int/lit8 v2, v0, 0x1

    const/4 v12, 0x5

    if-ge v0, v12, :cond_4

    .line 198
    :try_start_4
    new-instance v12, Ljava/io/FileOutputStream;

    invoke-direct {v12, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_7
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    .line 199
    :try_start_5
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v10, v0, v1, v12}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 201
    invoke-virtual {v8}, Ljava/io/File;->length()J

    move-result-wide v13
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    const-wide/32 v15, 0x4c4b40

    cmp-long v0, v13, v15

    if-gez v0, :cond_3

    move-object v7, v12

    goto/16 :goto_5

    :cond_3
    const-wide v13, 0x415312d000000000L    # 5000000.0

    move-object/from16 p2, v12

    .line 203
    :try_start_6
    invoke-virtual {v8}, Ljava/io/File;->length()J

    move-result-wide v11

    long-to-double v11, v11

    div-double/2addr v13, v11

    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v11

    const-wide v13, 0x3feccccccccccccdL    # 0.9

    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->min(DD)D

    move-result-wide v11

    .line 204
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-double v13, v0

    mul-double/2addr v13, v11

    invoke-static {v13, v14}, Ljava/lang/Math;->round(D)J

    move-result-wide v13

    long-to-int v0, v13

    .line 205
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    int-to-double v13, v7

    mul-double/2addr v13, v11

    invoke-static {v13, v14}, Ljava/lang/Math;->round(D)J

    move-result-wide v13

    long-to-int v7, v13

    .line 207
    sget-object v13, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v14, "Image size is bigger than expected: %1.2f kb "

    new-array v15, v3, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/File;->length()J

    move-result-wide v3

    long-to-float v3, v3

    div-float v3, v3, v20

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v15, v4

    invoke-static {v13, v14, v15}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 208
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v13, "Trying resize to %1.2f%%: %d x %d"

    const/4 v14, 0x3

    new-array v14, v14, [Ljava/lang/Object;

    const-wide/high16 v18, 0x4059000000000000L    # 100.0

    mul-double v11, v11, v18

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    const/4 v12, 0x0

    aput-object v11, v14, v12

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v12, 0x1

    aput-object v11, v14, v12

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v12, 0x2

    aput-object v11, v14, v12

    invoke-static {v4, v13, v14}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 211
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v11

    sget-object v13, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->LOG_TAG:Ljava/lang/String;

    invoke-virtual {v11, v13, v3}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v3

    sget-object v11, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->LOG_TAG:Ljava/lang/String;

    invoke-virtual {v3, v11, v4}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x0

    .line 219
    invoke-static {v10, v0, v7, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 220
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 224
    :try_start_7
    invoke-virtual/range {p2 .. p2}, Ljava/io/FileOutputStream;->flush()V

    .line 225
    invoke-virtual/range {p2 .. p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    move-object/from16 v7, p2

    move v0, v2

    move-object v10, v4

    move v11, v12

    const/4 v3, 0x1

    const/4 v4, 0x0

    goto/16 :goto_2

    :catchall_2
    move-exception v0

    move-object/from16 v7, p2

    move-object v1, v0

    move-object v10, v4

    goto/16 :goto_e

    :catch_2
    move-exception v0

    move-object/from16 v7, p2

    move-object v10, v4

    goto/16 :goto_c

    :catchall_3
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    goto :goto_4

    :catchall_4
    move-exception v0

    move-object/from16 p2, v12

    :goto_3
    move-object/from16 v7, p2

    goto/16 :goto_d

    :catch_4
    move-exception v0

    move-object/from16 p2, v12

    :goto_4
    move-object/from16 v7, p2

    goto/16 :goto_c

    .line 229
    :cond_4
    :goto_5
    :try_start_8
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    sget-object v1, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->LOG_TAG:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "Image data sent to a %1.2fkb file. GC Hook here."

    const/4 v4, 0x1

    new-array v11, v4, [Ljava/lang/Object;

    .line 233
    invoke-virtual {v8}, Ljava/io/File;->length()J

    move-result-wide v12

    long-to-float v4, v12

    div-float v4, v4, v20

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/4 v12, 0x0

    aput-object v4, v11, v12

    .line 231
    invoke-static {v2, v3, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 230
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    sget-object v1, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->LOG_TAG:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "Cache entry added [%1$s]"

    const/4 v4, 0x1

    new-array v11, v4, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v9, v11, v4

    invoke-static {v2, v3, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->SCAN:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "Cache entry added [%1$s]"

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    aput-object v9, v11, v12

    invoke-static {v3, v4, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-array v4, v12, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    if-eqz v10, :cond_5

    .line 253
    :try_start_9
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_7

    :catchall_5
    move-exception v0

    goto :goto_6

    :catch_5
    move-exception v0

    move-object v1, v0

    .line 255
    :try_start_a
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    sget-object v2, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Nulling the Image failed."

    invoke-virtual {v0, v2, v3}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    invoke-static {v1}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    goto :goto_7

    .line 258
    :goto_6
    :try_start_b
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    :cond_5
    :goto_7
    if-eqz v7, :cond_6

    .line 264
    :try_start_c
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->flush()V

    .line 265
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_6
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    goto :goto_8

    :catch_6
    move-exception v0

    .line 271
    :try_start_d
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v1

    sget-object v2, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Closing file stream failed."

    invoke-virtual {v1, v2, v3}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    .line 277
    :cond_6
    :goto_8
    monitor-exit v6
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    return-object v8

    :catch_7
    move-exception v0

    goto :goto_c

    :catchall_6
    move-exception v0

    goto :goto_9

    :catch_8
    move-exception v0

    goto :goto_b

    :catchall_7
    move-exception v0

    move-object/from16 v10, p2

    :goto_9
    move-object v1, v0

    :goto_a
    const/4 v7, 0x0

    goto :goto_e

    :catch_9
    move-exception v0

    move-object/from16 v10, p2

    :goto_b
    const/4 v7, 0x0

    .line 245
    :goto_c
    :try_start_e
    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    .line 247
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    :catchall_8
    move-exception v0

    :goto_d
    move-object v1, v0

    :goto_e
    if-eqz v10, :cond_7

    .line 253
    :try_start_f
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_a
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    goto :goto_10

    :catchall_9
    move-exception v0

    goto :goto_f

    :catch_a
    move-exception v0

    move-object v2, v0

    .line 255
    :try_start_10
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    sget-object v3, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->LOG_TAG:Ljava/lang/String;

    const-string v4, "Nulling the Image failed."

    invoke-virtual {v0, v3, v4}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    invoke-static {v2}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    goto :goto_10

    .line 258
    :goto_f
    :try_start_11
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    :cond_7
    :goto_10
    if-eqz v7, :cond_8

    .line 264
    :try_start_12
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->flush()V

    .line 265
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_b
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    goto :goto_11

    :catch_b
    move-exception v0

    .line 271
    :try_start_13
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v2

    sget-object v3, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->LOG_TAG:Ljava/lang/String;

    const-string v4, "Closing file stream failed."

    invoke-virtual {v2, v3, v4}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    .line 274
    :cond_8
    :goto_11
    throw v1

    :catchall_a
    move-exception v0

    .line 277
    monitor-exit v6
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    throw v0

    :cond_9
    move-object/from16 v5, p0

    .line 132
    new-instance v0, Ljava/lang/IllegalArgumentException;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 134
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const-string v1, "Invalid JPEG compression value specified: %1$d"

    .line 132
    invoke-static {v2, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    move-object/from16 v5, p0

    .line 130
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'context\' can not be NULL"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private getCacheFolder(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    .line 61
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    const-string v1, "receipt_scan_cache"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 62
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    return-object v0
.end method

.method public static getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;
    .locals 1

    .line 49
    sget-object v0, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->Instance:Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    return-object v0
.end method


# virtual methods
.method public addImage(Landroid/content/Context;Landroid/graphics/Bitmap;IIZ)Ljava/io/File;
    .locals 7

    if-eqz p2, :cond_0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p3

    move v5, p4

    move v6, p5

    .line 125
    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->addImage(Landroid/content/Context;Landroid/graphics/Bitmap;[BIIZ)Ljava/io/File;

    move-result-object p1

    return-object p1

    .line 123
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'bitmap\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addImage(Landroid/content/Context;[BIIZ)Ljava/io/File;
    .locals 9

    if-eqz p2, :cond_0

    .line 112
    array-length v0, p2

    if-lez v0, :cond_0

    .line 115
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v4, Lcom/shopkick/logging/Area;->SCAN:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v1, v4

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "Beginning addImage with a  %1.2f kb byte array. GC hook here."

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    array-length v7, p2

    int-to-float v7, v7

    const/high16 v8, 0x44800000    # 1024.0f

    div-float/2addr v7, v8

    .line 116
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    const/4 v8, 0x0

    aput-object v7, v6, v8

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-array v5, v8, [Ljava/lang/Object;

    .line 115
    invoke-virtual {v0, v1, v2, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    .line 118
    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->addImage(Landroid/content/Context;Landroid/graphics/Bitmap;[BIIZ)Ljava/io/File;

    move-result-object v0

    return-object v0

    .line 113
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'data\' can not be NULL or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public clearCache(Landroid/content/Context;)V
    .locals 9

    if-eqz p1, :cond_2

    .line 284
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->cacheLock:Ljava/lang/Object;

    monitor-enter v0

    .line 285
    :try_start_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getCacheFolder(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    .line 286
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p1, v3

    .line 287
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_0

    .line 291
    :try_start_1
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 292
    sget-object v5, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->LOG_TAG:Ljava/lang/String;

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v7, "Cache entry deleted [%1$s]"

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v8, v2

    invoke-static {v6, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v4

    .line 297
    :try_start_2
    sget-object v5, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->LOG_TAG:Ljava/lang/String;

    const-string v6, "Failed to delete cache file"

    invoke-static {v5, v6, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 301
    :cond_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 302
    iput v2, p0, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->lastHeight:I

    .line 303
    iput v2, p0, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->lastWidth:I

    return-void

    :catchall_0
    move-exception p1

    .line 301
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    .line 283
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'context\' can not be NULL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public deleteImage(Landroid/content/Context;Ljava/io/File;)V
    .locals 5

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    .line 99
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->cacheLock:Ljava/lang/Object;

    monitor-enter p1

    .line 100
    :try_start_0
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    sget-object v0, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->LOG_TAG:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "Cache entry deleted [%1$s]"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    aput-object p2, v3, v4

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    :cond_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    .line 97
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'file\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 96
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'context\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getImages(Landroid/content/Context;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 73
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 75
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->cacheLock:Ljava/lang/Object;

    monitor-enter v1

    .line 76
    :try_start_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getCacheFolder(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    .line 77
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 79
    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, p1, v3

    .line 80
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 81
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 85
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v0

    :catchall_0
    move-exception p1

    .line 85
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 72
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'context\' can not be NULL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getLastHeight()I
    .locals 1

    .line 312
    iget v0, p0, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->lastHeight:I

    return v0
.end method

.method public getLastWidth()I
    .locals 1

    .line 321
    iget v0, p0, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->lastWidth:I

    return v0
.end method

.method public setLastHeight(I)V
    .locals 0

    .line 332
    iput p1, p0, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->lastHeight:I

    return-void
.end method

.method public setLastWidth(I)V
    .locals 0

    .line 343
    iput p1, p0, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->lastWidth:I

    return-void
.end method
