.class public final Lcom/huawei/qrcode/decode/CaptureActivityHandler;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

.field private final decodeThread:Lcom/huawei/qrcode/decode/DecodeThread;

.field private state:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

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

    const-class v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/qrcode/CaptureActivity;Ljava/util/Collection;Ljava/util/Map;Ljava/lang/String;Lcom/huawei/qrcode/camera/CameraManager;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/qrcode/CaptureActivity;Ljava/util/Collection<Lo/od;>;Ljava/util/Map<Lo/og;*>;Ljava/lang/String;Lcom/huawei/qrcode/camera/CameraManager;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->weakActivity:Ljava/lang/ref/WeakReference;

    new-instance v0, Lcom/huawei/qrcode/decode/DecodeThread;

    new-instance v5, Lcom/huawei/qrcode/view/ViewfinderResultPointCallback;

    invoke-virtual {p1}, Lcom/huawei/qrcode/CaptureActivity;->getViewfinderView()Lcom/huawei/qrcode/view/ViewfinderView;

    move-result-object v1

    invoke-direct {v5, v1}, Lcom/huawei/qrcode/view/ViewfinderResultPointCallback;-><init>(Lcom/huawei/qrcode/view/ViewfinderView;)V

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/huawei/qrcode/decode/DecodeThread;-><init>(Lcom/huawei/qrcode/CaptureActivity;Ljava/util/Collection;Ljava/util/Map;Ljava/lang/String;Lo/oy;)V

    iput-object v0, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->decodeThread:Lcom/huawei/qrcode/decode/DecodeThread;

    iget-object v0, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->decodeThread:Lcom/huawei/qrcode/decode/DecodeThread;

    invoke-virtual {v0}, Lcom/huawei/qrcode/decode/DecodeThread;->start()V

    sget-object v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;->SUCCESS:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    iput-object v0, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->state:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    iput-object p5, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    invoke-virtual {p5}, Lcom/huawei/qrcode/camera/CameraManager;->startPreview()V

    invoke-direct {p0}, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->restartPreviewAndDecode()V

    return-void
.end method

.method private restartPreviewAndDecode()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->state:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    sget-object v1, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;->SUCCESS:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;->PREVIEW:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    iput-object v0, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->state:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    iget-object v0, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    iget-object v1, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->decodeThread:Lcom/huawei/qrcode/decode/DecodeThread;

    invoke-virtual {v1}, Lcom/huawei/qrcode/decode/DecodeThread;->getHandler()Landroid/os/Handler;

    move-result-object v1

    const/high16 v2, 0x7f080000

    invoke-virtual {v0, v1, v2}, Lcom/huawei/qrcode/camera/CameraManager;->requestPreviewFrame(Landroid/os/Handler;I)V

    iget-object v0, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->weakActivity:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/qrcode/CaptureActivity;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/qrcode/CaptureActivity;->drawViewfinder()V

    :cond_0
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget-object v0, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->weakActivity:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/qrcode/CaptureActivity;

    if-nez v3, :cond_0

    invoke-virtual {p1}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const v1, 0x7f080004

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->TAG:Ljava/lang/String;

    const-string v1, "Got restart preview message"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->restartPreviewAndDecode()V

    goto/16 :goto_0

    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const v1, 0x7f080002

    if-ne v0, v1, :cond_3

    sget-object v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->TAG:Ljava/lang/String;

    const-string v1, "Got decode succeeded message"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;->SUCCESS:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    iput-object v0, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->state:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    if-eqz v4, :cond_2

    const-string v0, "barcode_scaled_factor"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v6

    const-string v0, "barcode_bitmap"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v7

    if-eqz v7, :cond_2

    array-length v0, v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v7, v1, v0, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v5

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v5

    :cond_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lo/or;

    invoke-virtual {v3, v0, v5, v6}, Lcom/huawei/qrcode/CaptureActivity;->handleDecode(Lo/or;Landroid/graphics/Bitmap;F)V

    goto :goto_0

    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    const v1, 0x7f080001

    if-ne v0, v1, :cond_4

    sget-object v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;->PREVIEW:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    iput-object v0, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->state:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    iget-object v0, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    iget-object v1, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->decodeThread:Lcom/huawei/qrcode/decode/DecodeThread;

    invoke-virtual {v1}, Lcom/huawei/qrcode/decode/DecodeThread;->getHandler()Landroid/os/Handler;

    move-result-object v1

    const/high16 v2, 0x7f080000

    invoke-virtual {v0, v1, v2}, Lcom/huawei/qrcode/camera/CameraManager;->requestPreviewFrame(Landroid/os/Handler;I)V

    :cond_4
    :goto_0
    return-void
.end method

.method public quitSynchronously()V
    .locals 5

    sget-object v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;->DONE:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    iput-object v0, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->state:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    iget-object v0, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraManager;->stopPreview()V

    iget-object v0, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->decodeThread:Lcom/huawei/qrcode/decode/DecodeThread;

    invoke-virtual {v0}, Lcom/huawei/qrcode/decode/DecodeThread;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const v1, 0x7f080003

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v3

    invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V

    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->decodeThread:Lcom/huawei/qrcode/decode/DecodeThread;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Lcom/huawei/qrcode/decode/DecodeThread;->join(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    :goto_0
    const v0, 0x7f080002

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->removeMessages(I)V

    const v0, 0x7f080001

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->removeMessages(I)V

    return-void
.end method
