.class public final Lio/fotoapparat/hardware/CameraDeviceKt;
.super Ljava/lang/Object;
.source "CameraDevice.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCameraDevice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraDevice.kt\nio/fotoapparat/hardware/CameraDeviceKt\n*L\n1#1,425:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000<\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a\u000c\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0002\u001a\u0014\u0010\n\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\u000c\u001a\u00020\rH\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000*\n\u0010\u0012\"\u00020\u00062\u00020\u0006\u00a8\u0006\u0013"
    }
    d2 = {
        "AUTOFOCUS_TIMEOUT_SECONDS",
        "",
        "canSetFocusingAreas",
        "",
        "Lio/fotoapparat/capability/Capabilities;",
        "getPreviewResolution",
        "Lio/fotoapparat/parameter/Resolution;",
        "Landroid/hardware/Camera;",
        "previewOrientation",
        "Lio/fotoapparat/hardware/orientation/Orientation;",
        "setDisplaySurface",
        "Landroid/view/Surface;",
        "preview",
        "Lio/fotoapparat/view/Preview;",
        "takePhoto",
        "Lio/fotoapparat/result/Photo;",
        "imageRotation",
        "",
        "PreviewSize",
        "fotoapparat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final AUTOFOCUS_TIMEOUT_SECONDS:J = 0x3L


# direct methods
.method public static final synthetic access$canSetFocusingAreas(Lio/fotoapparat/capability/Capabilities;)Z
    .locals 0
    .param p0    # Lio/fotoapparat/capability/Capabilities;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0}, Lio/fotoapparat/hardware/CameraDeviceKt;->canSetFocusingAreas(Lio/fotoapparat/capability/Capabilities;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getPreviewResolution(Landroid/hardware/Camera;Lio/fotoapparat/hardware/orientation/Orientation;)Lio/fotoapparat/parameter/Resolution;
    .locals 0
    .param p0    # Landroid/hardware/Camera;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/fotoapparat/hardware/orientation/Orientation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lio/fotoapparat/hardware/CameraDeviceKt;->getPreviewResolution(Landroid/hardware/Camera;Lio/fotoapparat/hardware/orientation/Orientation;)Lio/fotoapparat/parameter/Resolution;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setDisplaySurface(Landroid/hardware/Camera;Lio/fotoapparat/view/Preview;)Landroid/view/Surface;
    .locals 0
    .param p0    # Landroid/hardware/Camera;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/fotoapparat/view/Preview;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lio/fotoapparat/hardware/CameraDeviceKt;->setDisplaySurface(Landroid/hardware/Camera;Lio/fotoapparat/view/Preview;)Landroid/view/Surface;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$takePhoto(Landroid/hardware/Camera;I)Lio/fotoapparat/result/Photo;
    .locals 0
    .param p0    # Landroid/hardware/Camera;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lio/fotoapparat/hardware/CameraDeviceKt;->takePhoto(Landroid/hardware/Camera;I)Lio/fotoapparat/result/Photo;

    move-result-object p0

    return-object p0
.end method

.method private static final canSetFocusingAreas(Lio/fotoapparat/capability/Capabilities;)Z
    .locals 1
    .param p0    # Lio/fotoapparat/capability/Capabilities;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 424
    invoke-virtual {p0}, Lio/fotoapparat/capability/Capabilities;->getMaxMeteringAreas()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-virtual {p0}, Lio/fotoapparat/capability/Capabilities;->getMaxFocusAreas()I

    move-result p0

    if-lez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static final getPreviewResolution(Landroid/hardware/Camera;Lio/fotoapparat/hardware/orientation/Orientation;)Lio/fotoapparat/parameter/Resolution;
    .locals 2
    .param p0    # Landroid/hardware/Camera;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 411
    invoke-virtual {p0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p0

    const-string v0, "parameters"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object p0

    .line 413
    new-instance v0, Lio/fotoapparat/parameter/Resolution;

    iget v1, p0, Landroid/hardware/Camera$Size;->width:I

    iget p0, p0, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v0, v1, p0}, Lio/fotoapparat/parameter/Resolution;-><init>(II)V

    .line 417
    instance-of p0, p1, Lio/fotoapparat/hardware/orientation/Orientation$Vertical;

    if-eqz p0, :cond_0

    goto :goto_0

    .line 418
    :cond_0
    instance-of p0, p1, Lio/fotoapparat/hardware/orientation/Orientation$Horizontal;

    if-eqz p0, :cond_1

    invoke-virtual {v0}, Lio/fotoapparat/parameter/Resolution;->flipDimensions()Lio/fotoapparat/parameter/Resolution;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final setDisplaySurface(Landroid/hardware/Camera;Lio/fotoapparat/view/Preview;)Landroid/view/Surface;
    .locals 1
    .param p0    # Landroid/hardware/Camera;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 401
    instance-of v0, p1, Lio/fotoapparat/view/Preview$Texture;

    if-eqz v0, :cond_0

    check-cast p1, Lio/fotoapparat/view/Preview$Texture;

    invoke-virtual {p1}, Lio/fotoapparat/view/Preview$Texture;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object p1

    .line 402
    invoke-virtual {p0, p1}, Landroid/hardware/Camera;->setPreviewTexture(Landroid/graphics/SurfaceTexture;)V

    .line 403
    new-instance p0, Landroid/view/Surface;

    invoke-direct {p0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    goto :goto_0

    .line 405
    :cond_0
    instance-of v0, p1, Lio/fotoapparat/view/Preview$Surface;

    if-eqz v0, :cond_1

    check-cast p1, Lio/fotoapparat/view/Preview$Surface;

    invoke-virtual {p1}, Lio/fotoapparat/view/Preview$Surface;->getSurfaceHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    .line 406
    invoke-virtual {p0, p1}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p0

    const-string p1, "preview.surfaceHolder\n  \u2026lay)\n            .surface"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final takePhoto(Landroid/hardware/Camera;I)Lio/fotoapparat/result/Photo;
    .locals 3
    .param p0    # Landroid/hardware/Camera;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 376
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 377
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 383
    new-instance v2, Lio/fotoapparat/hardware/CameraDeviceKt$takePhoto$1;

    invoke-direct {v2, v1, p1, v0}, Lio/fotoapparat/hardware/CameraDeviceKt$takePhoto$1;-><init>(Ljava/util/concurrent/atomic/AtomicReference;ILjava/util/concurrent/CountDownLatch;)V

    check-cast v2, Landroid/hardware/Camera$PictureCallback;

    const/4 p1, 0x0

    .line 379
    invoke-virtual {p0, p1, p1, p1, v2}, Landroid/hardware/Camera;->takePicture(Landroid/hardware/Camera$ShutterCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;)V

    .line 392
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 394
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    const-string p1, "photoReference.get()"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lio/fotoapparat/result/Photo;

    return-object p0
.end method
