.class public final Lio/fotoapparat/characteristic/CameraInfoProviderKt;
.super Ljava/lang/Object;
.source "CameraInfoProvider.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "getCharacteristics",
        "Lio/fotoapparat/characteristic/Characteristics;",
        "cameraId",
        "",
        "fotoapparat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final getCharacteristics(I)Lio/fotoapparat/characteristic/Characteristics;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 12
    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 13
    invoke-static {p0, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 14
    iget v1, v0, Landroid/hardware/Camera$CameraInfo;->facing:I

    invoke-static {v1}, Lio/fotoapparat/characteristic/LensPositionCharacteristicKt;->toLensPosition(I)Lio/fotoapparat/characteristic/LensPosition;

    move-result-object v1

    .line 15
    new-instance v2, Lio/fotoapparat/characteristic/Characteristics;

    .line 18
    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    invoke-static {v0}, Lio/fotoapparat/hardware/orientation/OrientationKt;->toOrientation(I)Lio/fotoapparat/hardware/orientation/Orientation;

    move-result-object v0

    .line 19
    sget-object v3, Lio/fotoapparat/characteristic/LensPosition$Front;->INSTANCE:Lio/fotoapparat/characteristic/LensPosition$Front;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    .line 15
    invoke-direct {v2, p0, v1, v0, v3}, Lio/fotoapparat/characteristic/Characteristics;-><init>(ILio/fotoapparat/characteristic/LensPosition;Lio/fotoapparat/hardware/orientation/Orientation;Z)V

    return-object v2
.end method
