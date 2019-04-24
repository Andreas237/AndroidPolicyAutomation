.class public final Lio/fotoapparat/routine/photo/TakePhotoRoutineKt;
.super Ljava/lang/Object;
.source "TakePhotoRoutine.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u000c\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "startPreviewSafely",
        "",
        "Lio/fotoapparat/hardware/CameraDevice;",
        "takePhoto",
        "Lio/fotoapparat/result/Photo;",
        "Lio/fotoapparat/hardware/Device;",
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
.method public static final synthetic access$startPreviewSafely(Lio/fotoapparat/hardware/CameraDevice;)V
    .locals 0
    .param p0    # Lio/fotoapparat/hardware/CameraDevice;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0}, Lio/fotoapparat/routine/photo/TakePhotoRoutineKt;->startPreviewSafely(Lio/fotoapparat/hardware/CameraDevice;)V

    return-void
.end method

.method private static final startPreviewSafely(Lio/fotoapparat/hardware/CameraDevice;)V
    .locals 0
    .param p0    # Lio/fotoapparat/hardware/CameraDevice;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 22
    :try_start_0
    invoke-virtual {p0}, Lio/fotoapparat/hardware/CameraDevice;->startPreview()V
    :try_end_0
    .catch Lio/fotoapparat/exception/camera/CameraException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static final takePhoto(Lio/fotoapparat/hardware/Device;)Lio/fotoapparat/result/Photo;
    .locals 2
    .param p0    # Lio/fotoapparat/hardware/Device;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    new-instance v0, Lio/fotoapparat/routine/photo/TakePhotoRoutineKt$takePhoto$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/fotoapparat/routine/photo/TakePhotoRoutineKt$takePhoto$1;-><init>(Lio/fotoapparat/hardware/Device;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 p0, 0x1

    invoke-static {v1, v0, p0, v1}, Lkotlinx/coroutines/BuildersKt;->runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/fotoapparat/result/Photo;

    return-object p0
.end method
