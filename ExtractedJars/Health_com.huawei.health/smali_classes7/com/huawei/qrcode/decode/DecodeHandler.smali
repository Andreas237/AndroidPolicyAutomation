.class final Lcom/huawei/qrcode/decode/DecodeHandler;
.super Landroid/os/Handler;


# static fields
.field private static final REGULAR_EXPRESSION:Ljava/lang/String; = "^[0-9]*$"

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final multiFormatReader:Lo/ok;

.field private running:Z

.field private final weakActivity:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/qrcode/CaptureActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/qrcode/decode/DecodeHandler;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/decode/DecodeHandler;->TAG:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/huawei/qrcode/CaptureActivity;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/qrcode/CaptureActivity;Ljava/util/Map<Lo/og;Ljava/lang/Object;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/decode/DecodeHandler;->running:Z

    new-instance v0, Lo/ok;

    invoke-direct {v0}, Lo/ok;-><init>()V

    iput-object v0, p0, Lcom/huawei/qrcode/decode/DecodeHandler;->multiFormatReader:Lo/ok;

    iget-object v0, p0, Lcom/huawei/qrcode/decode/DecodeHandler;->multiFormatReader:Lo/ok;

    invoke-virtual {v0, p2}, Lo/ok;->d(Ljava/util/Map;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/qrcode/decode/DecodeHandler;->weakActivity:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private static bundleThumbnail(Lo/on;Landroid/os/Bundle;)V
    .locals 11

    invoke-virtual {p0}, Lo/on;->d()[I

    move-result-object v6

    invoke-virtual {p0}, Lo/on;->b()I

    move-result v7

    invoke-virtual {p0}, Lo/on;->a()I

    move-result v8

    move-object v0, v6

    move v2, v7

    move v3, v7

    move v4, v8

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Landroid/graphics/Bitmap;->createBitmap([IIIIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v9

    new-instance v10, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V

    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x32

    invoke-virtual {v9, v0, v1, v10}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    const-string v0, "barcode_bitmap"

    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    const-string v0, "barcode_scaled_factor"

    int-to-float v1, v7

    invoke-virtual {p0}, Lo/on;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    return-void
.end method

.method private decode(Lcom/huawei/qrcode/CaptureActivity;[BII)V
    .locals 17

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const/4 v6, 0x0

    move-object/from16 v0, p2

    array-length v0, v0

    new-array v7, v0, [B

    const/4 v8, 0x0

    :goto_0
    move/from16 v0, p4

    if-ge v8, v0, :cond_3

    const/4 v9, 0x0

    :goto_1
    move/from16 v0, p3

    if-ge v9, v0, :cond_2

    mul-int v0, v9, p4

    add-int v0, v0, p4

    sub-int/2addr v0, v8

    add-int/lit8 v10, v0, -0x1

    mul-int v0, v8, p3

    add-int v11, v9, v0

    move-object/from16 v0, p2

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-gt v10, v0, :cond_0

    move-object/from16 v0, p2

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-gt v11, v0, :cond_0

    const/4 v12, 0x1

    goto :goto_2

    :cond_0
    const/4 v12, 0x0

    :goto_2
    if-eqz v12, :cond_1

    aget-byte v0, p2, v11

    aput-byte v0, v7, v10

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_3
    move/from16 v8, p3

    move/from16 p3, p4

    move/from16 p4, v8

    move-object/from16 p2, v7

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/qrcode/CaptureActivity;->getCameraManager()Lcom/huawei/qrcode/camera/CameraManager;

    move-result-object v0

    move-object/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/qrcode/camera/CameraManager;->buildLuminanceSource([BII)Lo/on;

    move-result-object v9

    if-eqz v9, :cond_4

    new-instance v10, Lo/oj;

    new-instance v0, Lo/qt;

    invoke-direct {v0, v9}, Lo/qt;-><init>(Lo/om;)V

    invoke-direct {v10, v0}, Lo/oj;-><init>(Lo/ob;)V

    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/huawei/qrcode/decode/DecodeHandler;->multiFormatReader:Lo/ok;

    invoke-virtual {v0, v10}, Lo/ok;->e(Lo/oj;)Lo/or;
    :try_end_0
    .catch Lo/os; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/qrcode/decode/DecodeHandler;->multiFormatReader:Lo/ok;

    invoke-virtual {v0}, Lo/ok;->c()V

    goto :goto_3

    :catch_0
    move-exception v11

    const-string v0, "DecodeHandler ReaderException."

    const/4 v1, 0x0

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/qrcode/decode/DecodeHandler;->multiFormatReader:Lo/ok;

    invoke-virtual {v0}, Lo/ok;->c()V

    goto :goto_3

    :catchall_0
    move-exception v13

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/qrcode/decode/DecodeHandler;->multiFormatReader:Lo/ok;

    invoke-virtual {v0}, Lo/ok;->c()V

    throw v13

    :cond_4
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/qrcode/CaptureActivity;->getHandler()Landroid/os/Handler;

    move-result-object v10

    if-eqz v6, :cond_7

    const-string v0, "^[0-9]*$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v11

    invoke-virtual {v6}, Lo/or;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v12

    invoke-virtual {v12}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    if-eq v0, v10, :cond_5

    const-string v0, "scan go."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const v0, 0x7f080001

    invoke-static {v10, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v13

    invoke-virtual {v13}, Landroid/os/Message;->sendToTarget()V

    return-void

    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    sget-object v0, Lcom/huawei/qrcode/decode/DecodeHandler;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Found barcode in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sub-long v2, v13, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ms"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v10, :cond_6

    const v0, 0x7f080002

    invoke-static {v10, v0, v6}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v15

    new-instance v16, Landroid/os/Bundle;

    invoke-direct/range {v16 .. v16}, Landroid/os/Bundle;-><init>()V

    move-object/from16 v0, v16

    invoke-static {v9, v0}, Lcom/huawei/qrcode/decode/DecodeHandler;->bundleThumbnail(Lo/on;Landroid/os/Bundle;)V

    move-object/from16 v0, v16

    invoke-virtual {v15, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    invoke-virtual {v15}, Landroid/os/Message;->sendToTarget()V

    :cond_6
    goto :goto_4

    :cond_7
    if-eqz v10, :cond_8

    const v0, 0x7f080001

    invoke-static {v10, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v11

    invoke-virtual {v11}, Landroid/os/Message;->sendToTarget()V

    :cond_8
    :goto_4
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget-boolean v0, p0, Lcom/huawei/qrcode/decode/DecodeHandler;->running:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/decode/DecodeHandler;->weakActivity:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/qrcode/CaptureActivity;

    if-nez v3, :cond_1

    invoke-virtual {p1}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void

    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/high16 v1, 0x7f080000

    if-ne v0, v1, :cond_2

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [B

    check-cast v0, [B

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    invoke-direct {p0, v3, v0, v1, v2}, Lcom/huawei/qrcode/decode/DecodeHandler;->decode(Lcom/huawei/qrcode/CaptureActivity;[BII)V

    goto :goto_0

    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const v1, 0x7f080003

    if-ne v0, v1, :cond_3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/decode/DecodeHandler;->running:Z

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    :cond_3
    :goto_0
    return-void
.end method
