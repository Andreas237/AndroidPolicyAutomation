.class final Lio/fotoapparat/hardware/CameraDeviceKt$takePhoto$1;
.super Ljava/lang/Object;
.source "CameraDevice.kt"

# interfaces
.implements Landroid/hardware/Camera$PictureCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/hardware/CameraDeviceKt;->takePhoto(Landroid/hardware/Camera;I)Lio/fotoapparat/result/Photo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "data",
        "",
        "kotlin.jvm.PlatformType",
        "<anonymous parameter 1>",
        "Landroid/hardware/Camera;",
        "onPictureTaken"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $imageRotation:I

.field final synthetic $latch:Ljava/util/concurrent/CountDownLatch;

.field final synthetic $photoReference:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;ILjava/util/concurrent/CountDownLatch;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/hardware/CameraDeviceKt$takePhoto$1;->$photoReference:Ljava/util/concurrent/atomic/AtomicReference;

    iput p2, p0, Lio/fotoapparat/hardware/CameraDeviceKt$takePhoto$1;->$imageRotation:I

    iput-object p3, p0, Lio/fotoapparat/hardware/CameraDeviceKt$takePhoto$1;->$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPictureTaken([BLandroid/hardware/Camera;)V
    .locals 2

    .line 384
    iget-object p2, p0, Lio/fotoapparat/hardware/CameraDeviceKt$takePhoto$1;->$photoReference:Ljava/util/concurrent/atomic/AtomicReference;

    .line 385
    new-instance v0, Lio/fotoapparat/result/Photo;

    const-string v1, "data"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, p0, Lio/fotoapparat/hardware/CameraDeviceKt$takePhoto$1;->$imageRotation:I

    invoke-direct {v0, p1, v1}, Lio/fotoapparat/result/Photo;-><init>([BI)V

    .line 384
    invoke-virtual {p2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 388
    iget-object p1, p0, Lio/fotoapparat/hardware/CameraDeviceKt$takePhoto$1;->$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method
