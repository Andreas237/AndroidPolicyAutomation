.class public final Lio/fotoapparat/preview/PreviewStreamKt;
.super Ljava/lang/Object;
.source "PreviewStream.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u0005*\u00060\u0006R\u00020\u0003H\u0002\u00a8\u0006\u0007"
    }
    d2 = {
        "bytesPerFrame",
        "",
        "Landroid/hardware/Camera$Size;",
        "Landroid/hardware/Camera;",
        "ensureNv21Format",
        "",
        "Landroid/hardware/Camera$Parameters;",
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
.method public static final synthetic access$bytesPerFrame(Landroid/hardware/Camera$Size;)I
    .locals 0
    .param p0    # Landroid/hardware/Camera$Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0}, Lio/fotoapparat/preview/PreviewStreamKt;->bytesPerFrame(Landroid/hardware/Camera$Size;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$ensureNv21Format(Landroid/hardware/Camera$Parameters;)V
    .locals 0
    .param p0    # Landroid/hardware/Camera$Parameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0}, Lio/fotoapparat/preview/PreviewStreamKt;->ensureNv21Format(Landroid/hardware/Camera$Parameters;)V

    return-void
.end method

.method private static final bytesPerFrame(Landroid/hardware/Camera$Size;)I
    .locals 1
    .param p0    # Landroid/hardware/Camera$Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 126
    iget v0, p0, Landroid/hardware/Camera$Size;->width:I

    iget p0, p0, Landroid/hardware/Camera$Size;->height:I

    mul-int/2addr v0, p0

    const/16 p0, 0x11

    invoke-static {p0}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result p0

    mul-int/2addr v0, p0

    div-int/lit8 v0, v0, 0x8

    return v0
.end method

.method private static final ensureNv21Format(Landroid/hardware/Camera$Parameters;)V
    .locals 1
    .param p0    # Landroid/hardware/Camera$Parameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 129
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getPreviewFormat()I

    move-result p0

    const/16 v0, 0x11

    if-ne p0, v0, :cond_0

    return-void

    .line 130
    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Only NV21 preview format is supported"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    throw p0
.end method
