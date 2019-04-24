.class public Lcom/shopkick/app/receipts/CameraControllerV1;
.super Lcom/shopkick/app/receipts/AbstractCameraController;
.source "CameraControllerV1.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;
    }
.end annotation


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "CameraControllerV1"


# instance fields
.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private cameraUISurface:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

.field private currentCameraState:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

.field private volatile isTakingPhoto:Z

.field private final jpegCallback:Landroid/hardware/Camera$PictureCallback;

.field private useNormalCompression:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;Landroid/widget/RelativeLayout;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/receipts/ReceiptScanScreen;",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Landroid/widget/RelativeLayout;",
            "Lcom/shopkick/app/application/ClientFlagsManager;",
            ")V"
        }
    .end annotation

    .line 49
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/receipts/AbstractCameraController;-><init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V

    const/4 p1, 0x0

    .line 34
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 35
    sget-object p3, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->TAKE:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    iput-object p3, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->currentCameraState:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    .line 37
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->cameraUISurface:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    const/4 p1, 0x0

    .line 39
    iput-boolean p1, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->isTakingPhoto:Z

    .line 41
    iput-boolean p1, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->useNormalCompression:Z

    .line 244
    new-instance p3, Lcom/shopkick/app/receipts/CameraControllerV1$2;

    invoke-direct {p3, p0}, Lcom/shopkick/app/receipts/CameraControllerV1$2;-><init>(Lcom/shopkick/app/receipts/CameraControllerV1;)V

    iput-object p3, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->jpegCallback:Landroid/hardware/Camera$PictureCallback;

    .line 50
    iget-object p2, p2, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object p2, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 51
    iget-object p2, p5, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useNormalJpgSize:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iput-boolean p2, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->useNormalCompression:Z

    const p2, 0x7f0900c4

    .line 52
    invoke-virtual {p4, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    iput-object p2, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->cameraUISurface:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    .line 53
    iget-object p2, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->cameraUISurface:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->setVisibility(I)V

    .line 55
    iget-object p2, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->cameraUISurface:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    iget-boolean p3, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->useNormalCompression:Z

    invoke-virtual {p2, p3}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->setUseNormalSize(Z)V

    .line 56
    iput p1, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->scanCount:I

    .line 58
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->cameraUISurface:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    iget-object p2, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->requestedImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->setRequestedImageSize(Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;)V

    .line 59
    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    .line 60
    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {p2}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->clearCache(Landroid/content/Context;)V

    .line 62
    sget-object p1, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->TAKE:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->currentCameraState:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    .line 30
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV1;->LOG_TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100(Lcom/shopkick/app/receipts/CameraControllerV1;[B)I
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/shopkick/app/receipts/CameraControllerV1;->getImageOrientation([B)I

    move-result p0

    return p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/receipts/CameraControllerV1;)Z
    .locals 0

    .line 30
    iget-boolean p0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->useNormalCompression:Z

    return p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/receipts/CameraControllerV1;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/shopkick/app/receipts/CameraControllerV1;->updateUi(I)V

    return-void
.end method

.method static synthetic access$402(Lcom/shopkick/app/receipts/CameraControllerV1;Z)Z
    .locals 0

    .line 30
    iput-boolean p1, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->isTakingPhoto:Z

    return p1
.end method

.method private getImageOrientation([B)I
    .locals 8

    const/4 v0, 0x0

    .line 200
    :try_start_0
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "receipt_scan_tmp_%1$d.jpeg"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v1, v2, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 201
    iget-object v2, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    .line 203
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v2}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    .line 201
    invoke-static {v1, v0, v2}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 204
    :try_start_1
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 207
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 208
    :try_start_2
    invoke-virtual {v2, p1}, Ljava/io/FileOutputStream;->write([B)V

    .line 209
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V

    .line 213
    new-instance p1, Landroid/support/media/ExifInterface;

    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/support/media/ExifInterface;-><init>(Ljava/lang/String;)V

    const-string v0, "Orientation"

    .line 214
    invoke-virtual {p1, v0, v3}, Landroid/support/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 223
    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 227
    sget-object v2, Lcom/shopkick/app/receipts/CameraControllerV1;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Closing the file stream failed"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    if-eqz v1, :cond_0

    .line 233
    :try_start_4
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    .line 236
    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV1;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Deleting the temp file failed"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_1
    return p1

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_2
    move-exception p1

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_5

    :catch_3
    move-exception p1

    move-object v2, v0

    :goto_2
    move-object v0, v1

    goto :goto_3

    :catchall_2
    move-exception p1

    move-object v1, v0

    goto :goto_5

    :catch_4
    move-exception p1

    move-object v2, v0

    .line 217
    :goto_3
    :try_start_5
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception p1

    move-object v1, v0

    :goto_4
    move-object v0, v2

    :goto_5
    if-eqz v0, :cond_1

    .line 223
    :try_start_6
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    goto :goto_6

    :catch_5
    move-exception v0

    .line 227
    sget-object v2, Lcom/shopkick/app/receipts/CameraControllerV1;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Closing the file stream failed"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_6
    if-eqz v1, :cond_2

    .line 233
    :try_start_7
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    goto :goto_7

    :catch_6
    move-exception v0

    .line 236
    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV1;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Deleting the temp file failed"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 237
    :cond_2
    :goto_7
    throw p1
.end method

.method public static rotate(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 7

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    return-object p0

    .line 152
    :cond_0
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    int-to-float p1, p1

    .line 153
    invoke-virtual {v5, p1}, Landroid/graphics/Matrix;->postRotate(F)Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 155
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    .line 147
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'bitmap\' can not be NULL"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private updateUi(I)V
    .locals 2

    .line 130
    invoke-static {}, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->values()[Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    move-result-object v0

    aget-object v0, v0, p1

    iput-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->currentCameraState:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    .line 131
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/CameraControllerV1;->hasValidFragment()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/receipts/CameraControllerV1$1;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/receipts/CameraControllerV1$1;-><init>(Lcom/shopkick/app/receipts/CameraControllerV1;I)V

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public addSection()V
    .locals 2

    .line 91
    iget v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->scanCount:I

    iget v1, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->maxScanCount:I

    if-lt v0, v1, :cond_0

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->showDialogScanCountThreshold()V

    goto :goto_0

    .line 94
    :cond_0
    iget v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->scanCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->scanCount:I

    .line 95
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->cameraUISurface:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->restartPreview()V

    .line 96
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->TAKE_ANOTHER:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->ordinal()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/shopkick/app/receipts/CameraControllerV1;->updateUi(I)V

    :goto_0
    return-void
.end method

.method protected canCancel()Z
    .locals 2

    .line 80
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/CameraControllerV1;->hasValidFragment()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 83
    :cond_0
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->TAKE:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->currentCameraState:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method protected cleanUpAndExit()V
    .locals 3

    .line 387
    invoke-super {p0}, Lcom/shopkick/app/receipts/AbstractCameraController;->cleanUpAndExit()V

    .line 388
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/CameraControllerV1;->hasValidFragment()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 389
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setPreviewImage(Landroid/graphics/Bitmap;)V

    .line 391
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->cameraUISurface:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    if-eqz v0, :cond_1

    const/16 v2, 0x8

    .line 393
    invoke-virtual {v0, v2}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->setVisibility(I)V

    .line 396
    :cond_1
    iput-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->cameraUISurface:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    return-void
.end method

.method public freeResourcesForPause()V
    .locals 1

    .line 180
    iget-boolean v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->isTakingPhoto:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 181
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->isTakingPhoto:Z

    :cond_0
    return-void
.end method

.method public isCameraReady()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public retake()V
    .locals 3

    .line 103
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->lastImageCache:Ljava/io/File;

    if-eqz v0, :cond_0

    .line 105
    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    .line 106
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->lastImageCache:Ljava/io/File;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->deleteImage(Landroid/content/Context;Ljava/io/File;)V

    goto :goto_0

    .line 111
    :cond_0
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV1;->LOG_TAG:Ljava/lang/String;

    const-string v1, "retake() called with no previous image set"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->cameraUISurface:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->restartPreview()V

    .line 116
    iget v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->scanCount:I

    if-nez v0, :cond_1

    .line 117
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->TAKE:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->ordinal()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/shopkick/app/receipts/CameraControllerV1;->updateUi(I)V

    goto :goto_1

    .line 119
    :cond_1
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->TAKE_ANOTHER:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->ordinal()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/shopkick/app/receipts/CameraControllerV1;->updateUi(I)V

    :goto_1
    return-void
.end method

.method public takePhoto()V
    .locals 3

    .line 167
    iget-boolean v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->isTakingPhoto:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 168
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->isTakingPhoto:Z

    .line 170
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->cameraUISurface:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->jpegCallback:Landroid/hardware/Camera$PictureCallback;

    iget-object v2, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->takePhoto(Landroid/hardware/Camera$PictureCallback;Lcom/shopkick/app/application/AppPreferences;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    .line 172
    iput-boolean v1, p0, Lcom/shopkick/app/receipts/CameraControllerV1;->isTakingPhoto:Z

    .line 173
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    :goto_0
    return-void
.end method
