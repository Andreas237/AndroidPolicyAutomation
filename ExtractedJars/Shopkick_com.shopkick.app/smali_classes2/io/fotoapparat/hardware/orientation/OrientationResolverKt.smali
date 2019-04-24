.class public final Lio/fotoapparat/hardware/orientation/OrientationResolverKt;
.super Ljava/lang/Object;
.source "OrientationResolver.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001e\u0010\u0008\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\t"
    }
    d2 = {
        "computeDisplayOrientation",
        "Lio/fotoapparat/hardware/orientation/Orientation;",
        "screenOrientation",
        "cameraOrientation",
        "cameraIsMirrored",
        "",
        "computeImageOrientation",
        "deviceOrientation",
        "computePreviewOrientation",
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
.method public static final computeDisplayOrientation(Lio/fotoapparat/hardware/orientation/Orientation;Lio/fotoapparat/hardware/orientation/Orientation;Z)Lio/fotoapparat/hardware/orientation/Orientation;
    .locals 1
    .param p0    # Lio/fotoapparat/hardware/orientation/Orientation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/fotoapparat/hardware/orientation/Orientation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "screenOrientation"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraOrientation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-virtual {p0}, Lio/fotoapparat/hardware/orientation/Orientation;->getDegrees()I

    move-result p0

    .line 65
    invoke-virtual {p1}, Lio/fotoapparat/hardware/orientation/Orientation;->getDegrees()I

    move-result p1

    if-eqz p2, :cond_0

    add-int/2addr p1, p0

    .line 68
    rem-int/lit16 p1, p1, 0x168

    rsub-int p0, p1, 0x168

    rem-int/lit16 p0, p0, 0x168

    goto :goto_0

    :cond_0
    sub-int/2addr p1, p0

    add-int/lit16 p1, p1, 0x168

    .line 70
    rem-int/lit16 p0, p1, 0x168

    .line 73
    :goto_0
    invoke-static {p0}, Lio/fotoapparat/hardware/orientation/OrientationKt;->toOrientation(I)Lio/fotoapparat/hardware/orientation/Orientation;

    move-result-object p0

    return-object p0
.end method

.method public static final computeImageOrientation(Lio/fotoapparat/hardware/orientation/Orientation;Lio/fotoapparat/hardware/orientation/Orientation;Z)Lio/fotoapparat/hardware/orientation/Orientation;
    .locals 1
    .param p0    # Lio/fotoapparat/hardware/orientation/Orientation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/fotoapparat/hardware/orientation/Orientation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "deviceOrientation"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraOrientation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-virtual {p0}, Lio/fotoapparat/hardware/orientation/Orientation;->getDegrees()I

    move-result p0

    .line 40
    invoke-virtual {p1}, Lio/fotoapparat/hardware/orientation/Orientation;->getDegrees()I

    move-result p1

    if-eqz p2, :cond_0

    sub-int/2addr p1, p0

    add-int/lit16 p1, p1, 0x168

    .line 43
    rem-int/lit16 p1, p1, 0x168

    rsub-int p0, p1, 0x168

    goto :goto_0

    :cond_0
    add-int/2addr p1, p0

    .line 45
    rem-int/lit16 p1, p1, 0x168

    rsub-int p0, p1, 0x168

    .line 48
    :goto_0
    invoke-static {p0}, Lio/fotoapparat/hardware/orientation/OrientationKt;->toOrientation(I)Lio/fotoapparat/hardware/orientation/Orientation;

    move-result-object p0

    return-object p0
.end method

.method public static final computePreviewOrientation(Lio/fotoapparat/hardware/orientation/Orientation;Lio/fotoapparat/hardware/orientation/Orientation;Z)Lio/fotoapparat/hardware/orientation/Orientation;
    .locals 1
    .param p0    # Lio/fotoapparat/hardware/orientation/Orientation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/fotoapparat/hardware/orientation/Orientation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "screenOrientation"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraOrientation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    const/4 p2, -0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    .line 19
    :goto_0
    invoke-virtual {p0}, Lio/fotoapparat/hardware/orientation/Orientation;->getDegrees()I

    move-result p0

    mul-int/2addr p2, p0

    add-int/lit16 p2, p2, 0x2d0

    .line 20
    invoke-virtual {p1}, Lio/fotoapparat/hardware/orientation/Orientation;->getDegrees()I

    move-result p0

    sub-int/2addr p2, p0

    .line 21
    rem-int/lit16 p2, p2, 0x168

    .line 23
    invoke-static {p2}, Lio/fotoapparat/hardware/orientation/OrientationKt;->toOrientation(I)Lio/fotoapparat/hardware/orientation/Orientation;

    move-result-object p0

    return-object p0
.end method
