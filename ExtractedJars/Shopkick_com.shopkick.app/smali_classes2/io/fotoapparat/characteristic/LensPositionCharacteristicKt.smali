.class public final Lio/fotoapparat/characteristic/LensPositionCharacteristicKt;
.super Ljava/lang/Object;
.source "LensPositionCharacteristic.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLensPositionCharacteristic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LensPositionCharacteristic.kt\nio/fotoapparat/characteristic/LensPositionCharacteristicKt\n*L\n1#1,40:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0003\u001a\u000c\u0010\u0004\u001a\u00020\u0003*\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"
    }
    d2 = {
        "CAMERA_FACING_EXTERNAL",
        "",
        "toCameraId",
        "Lio/fotoapparat/characteristic/LensPosition;",
        "toLensPosition",
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
.field private static final CAMERA_FACING_EXTERNAL:I = 0x2


# direct methods
.method public static final toCameraId(Lio/fotoapparat/characteristic/LensPosition;)I
    .locals 4
    .param p0    # Lio/fotoapparat/characteristic/LensPosition;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 36
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 37
    invoke-static {v3}, Lio/fotoapparat/characteristic/CameraInfoProviderKt;->getCharacteristics(I)Lio/fotoapparat/characteristic/Characteristics;

    move-result-object v3

    invoke-virtual {v3}, Lio/fotoapparat/characteristic/Characteristics;->getLensPosition()Lio/fotoapparat/characteristic/LensPosition;

    move-result-object v3

    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    .line 36
    :goto_0
    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    .line 39
    :cond_2
    new-instance p0, Lio/fotoapparat/exception/camera/CameraException;

    const/4 v0, 0x2

    const-string v1, "Device has no camera for the desired lens position(s)."

    invoke-direct {p0, v1, v2, v0, v2}, Lio/fotoapparat/exception/camera/CameraException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p0, Ljava/lang/Throwable;

    throw p0
.end method

.method public static final toLensPosition(I)Lio/fotoapparat/characteristic/LensPosition;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    packed-switch p0, :pswitch_data_0

    .line 25
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Lens position "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " is not supported."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 24
    :pswitch_0
    sget-object p0, Lio/fotoapparat/characteristic/LensPosition$External;->INSTANCE:Lio/fotoapparat/characteristic/LensPosition$External;

    check-cast p0, Lio/fotoapparat/characteristic/LensPosition;

    goto :goto_0

    .line 22
    :pswitch_1
    sget-object p0, Lio/fotoapparat/characteristic/LensPosition$Front;->INSTANCE:Lio/fotoapparat/characteristic/LensPosition$Front;

    check-cast p0, Lio/fotoapparat/characteristic/LensPosition;

    goto :goto_0

    .line 23
    :pswitch_2
    sget-object p0, Lio/fotoapparat/characteristic/LensPosition$Back;->INSTANCE:Lio/fotoapparat/characteristic/LensPosition$Back;

    check-cast p0, Lio/fotoapparat/characteristic/LensPosition;

    :goto_0
    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
