.class Lcom/shopkick/app/receipts/CameraControllerV2$4;
.super Ljava/lang/Object;
.source "CameraControllerV2.java"

# interfaces
.implements Landroid/media/ImageReader$OnImageAvailableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/receipts/CameraControllerV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/CameraControllerV2;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/CameraControllerV2;)V
    .locals 0

    .line 262
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onImageAvailable(Landroid/media/ImageReader;)V
    .locals 13

    .line 266
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/shopkick/app/receipts/CameraControllerV2;->isProcessingInitialImage:Z

    .line 268
    invoke-virtual {p1}, Landroid/media/ImageReader;->acquireLatestImage()Landroid/media/Image;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 271
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v2

    iput v2, v0, Lcom/shopkick/app/receipts/CameraControllerV2;->lastWidthCache:I

    .line 272
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result v2

    iput v2, v0, Lcom/shopkick/app/receipts/CameraControllerV2;->lastHeightCache:I

    .line 273
    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    move-result-object v0

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->setLastHeight(I)V

    .line 274
    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    move-result-object v0

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->setLastWidth(I)V

    .line 275
    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 277
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    new-array v5, v2, [B

    .line 278
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 279
    invoke-virtual {p1}, Landroid/media/Image;->close()V

    .line 280
    array-length p1, v5

    invoke-static {v5, v1, p1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 281
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object p1

    invoke-virtual {v6, p1, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 282
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    iget-object v0, v0, Lcom/shopkick/app/receipts/CameraControllerV2;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableOcrProcessing:Ljava/lang/Boolean;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 283
    new-instance v0, Ljava/lang/Thread;

    new-instance v2, Lcom/shopkick/app/receipts/CameraControllerV2$4$1;

    invoke-direct {v2, p0, p1}, Lcom/shopkick/app/receipts/CameraControllerV2$4$1;-><init>(Lcom/shopkick/app/receipts/CameraControllerV2$4;Landroid/graphics/Bitmap;)V

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 288
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 291
    :cond_0
    invoke-static {}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$600()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Decoded image into byte array. Some numbers:\nCamera Surface: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    .line 292
    invoke-static {v2}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1000(Lcom/shopkick/app/receipts/CameraControllerV2;)Lcom/shopkick/app/receipts/AutoScaleSurface;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/receipts/AutoScaleSurface;->getWidth()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string/jumbo v2, "x"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    .line 293
    invoke-static {v2}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1000(Lcom/shopkick/app/receipts/CameraControllerV2;)Lcom/shopkick/app/receipts/AutoScaleSurface;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/receipts/AutoScaleSurface;->getHeight()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\nPreviewImage: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string/jumbo v2, "x"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 291
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 296
    new-instance v11, Landroid/graphics/Matrix;

    invoke-direct {v11}, Landroid/graphics/Matrix;-><init>()V

    .line 297
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1000(Lcom/shopkick/app/receipts/CameraControllerV2;)Lcom/shopkick/app/receipts/AutoScaleSurface;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/AutoScaleSurface;->getWidth()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    .line 298
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1000(Lcom/shopkick/app/receipts/CameraControllerV2;)Lcom/shopkick/app/receipts/AutoScaleSurface;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/AutoScaleSurface;->getHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v2

    .line 299
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    if-le v2, v3, :cond_1

    .line 300
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1000(Lcom/shopkick/app/receipts/CameraControllerV2;)Lcom/shopkick/app/receipts/AutoScaleSurface;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/AutoScaleSurface;->getWidth()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    .line 301
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1000(Lcom/shopkick/app/receipts/CameraControllerV2;)Lcom/shopkick/app/receipts/AutoScaleSurface;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/AutoScaleSurface;->getHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v2

    .line 303
    :cond_1
    invoke-static {}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$600()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Scale detected. Width is scaled by: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v4, ". Height is scaled by:  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 308
    iget-object v2, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v2}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1100(Lcom/shopkick/app/receipts/CameraControllerV2;)I

    move-result v2

    if-eqz v2, :cond_4

    .line 309
    iget-object v2, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    iget-object v2, v2, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    .line 310
    invoke-virtual {v2}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 311
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    .line 312
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    .line 313
    invoke-virtual {v2}, Landroid/view/Display;->getRotation()I

    move-result v2

    .line 317
    iget-object v3, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v3}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1100(Lcom/shopkick/app/receipts/CameraControllerV2;)I

    move-result v3

    rem-int/lit16 v3, v3, 0xb4

    const/16 v4, 0x5a

    if-ne v3, v4, :cond_2

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    if-le v3, v4, :cond_2

    .line 318
    iget-object v3, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v3}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1100(Lcom/shopkick/app/receipts/CameraControllerV2;)I

    move-result v3

    goto :goto_0

    .line 322
    :cond_2
    iget-object v3, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v3}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1100(Lcom/shopkick/app/receipts/CameraControllerV2;)I

    move-result v3

    rem-int/lit16 v3, v3, 0xb4

    if-nez v3, :cond_3

    .line 323
    iget-object v3, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v3}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1100(Lcom/shopkick/app/receipts/CameraControllerV2;)I

    move-result v3

    goto :goto_0

    :cond_3
    move v3, v1

    .line 325
    :goto_0
    invoke-static {}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$600()Ljava/lang/String;

    move-result-object v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Rotating image by: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ". Display rotation: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    int-to-float v2, v3

    .line 326
    invoke-virtual {v11, v2}, Landroid/graphics/Matrix;->postRotate(F)Z

    move v2, v3

    goto :goto_1

    :cond_4
    move v2, v1

    .line 333
    :goto_1
    invoke-virtual {v11, p1, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 339
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    .line 340
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v10

    const/4 v12, 0x1

    .line 336
    invoke-static/range {v6 .. v12}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 345
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1300(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1202(Lcom/shopkick/app/receipts/CameraControllerV2;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 346
    invoke-static {}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$600()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cutting image down, from "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " to: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    iget-object v6, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    iget-object v6, v6, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v6}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v6}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getAlignHereHeight()I

    move-result v6

    sub-int/2addr v4, v6

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 346
    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 348
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    .line 350
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    iget-object v4, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    iget-object v4, v4, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v4}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getAlignHereHeight()I

    move-result v4

    sub-int/2addr v3, v4

    iget-object v4, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    .line 351
    invoke-static {v4}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1000(Lcom/shopkick/app/receipts/CameraControllerV2;)Lcom/shopkick/app/receipts/AutoScaleSurface;

    move-result-object v4

    invoke-virtual {v4}, Lcom/shopkick/app/receipts/AutoScaleSurface;->getWidth()I

    move-result v4

    iget-object v6, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    iget-object v6, v6, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    .line 352
    invoke-virtual {v6}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v6}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getAlignHereHeight()I

    move-result v6

    .line 348
    invoke-static {p1, v1, v3, v4, v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1302(Lcom/shopkick/app/receipts/CameraControllerV2;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 354
    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    move-result-object v3

    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    iget-object p1, p1, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    .line 355
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    .line 356
    invoke-virtual {p1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 357
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    iget v6, p1, Lcom/shopkick/app/receipts/CameraControllerV2;->jpegCompressionLevel:I

    const/4 v8, 0x1

    move v7, v2

    .line 355
    invoke-virtual/range {v3 .. v8}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->addImage(Landroid/content/Context;[BIIZ)Ljava/io/File;

    move-result-object p1

    .line 361
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    iput-object p1, v0, Lcom/shopkick/app/receipts/CameraControllerV2;->lastImageCache:Ljava/io/File;

    .line 362
    invoke-static {v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1500(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/media/ImageReader;

    move-result-object p1

    const/4 v0, 0x0

    iget-object v2, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v2}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1400(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    .line 363
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1, v1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1602(Lcom/shopkick/app/receipts/CameraControllerV2;Z)Z

    .line 366
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    iput-boolean v1, p1, Lcom/shopkick/app/receipts/CameraControllerV2;->isProcessingInitialImage:Z

    .line 367
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_PICTURE_TAKEN:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->ordinal()I

    move-result v0

    invoke-static {p1, v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1700(Lcom/shopkick/app/receipts/CameraControllerV2;I)V

    .line 370
    :cond_5
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$4;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    iput-boolean v1, p1, Lcom/shopkick/app/receipts/CameraControllerV2;->isProcessingInitialImage:Z

    return-void
.end method
