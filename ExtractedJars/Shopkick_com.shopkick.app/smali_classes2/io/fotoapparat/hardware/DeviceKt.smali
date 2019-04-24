.class public final Lio/fotoapparat/hardware/DeviceKt;
.super Ljava/lang/Object;
.source "Device.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDevice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Device.kt\nio/fotoapparat/hardware/DeviceKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,195:1\n1288#2:196\n1357#2,3:197\n*E\n*S KotlinDebug\n*F\n+ 1 Device.kt\nio/fotoapparat/hardware/DeviceKt\n*L\n190#1:196\n190#1,3:197\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a=\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00032#\u0010\u0004\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005j\u0002`\u0008\u00a2\u0006\u0002\u0008\tH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "selectCamera",
        "Lio/fotoapparat/hardware/CameraDevice;",
        "availableCameras",
        "",
        "lensPositionSelector",
        "Lkotlin/Function1;",
        "",
        "Lio/fotoapparat/characteristic/LensPosition;",
        "Lio/fotoapparat/selector/LensPositionSelector;",
        "Lkotlin/ExtensionFunctionType;",
        "updateConfiguration",
        "Lio/fotoapparat/configuration/CameraConfiguration;",
        "savedConfiguration",
        "newConfiguration",
        "Lio/fotoapparat/configuration/Configuration;",
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
.method public static final selectCamera(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/hardware/CameraDevice;
    .locals 3
    .param p0    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/fotoapparat/hardware/CameraDevice;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/characteristic/LensPosition;",
            ">;+",
            "Lio/fotoapparat/characteristic/LensPosition;",
            ">;)",
            "Lio/fotoapparat/hardware/CameraDevice;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "availableCameras"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lensPositionSelector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    check-cast p0, Ljava/lang/Iterable;

    .line 196
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 197
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 198
    check-cast v2, Lio/fotoapparat/hardware/CameraDevice;

    .line 190
    invoke-virtual {v2}, Lio/fotoapparat/hardware/CameraDevice;->getCharacteristics()Lio/fotoapparat/characteristic/Characteristics;

    move-result-object v2

    invoke-virtual {v2}, Lio/fotoapparat/characteristic/Characteristics;->getLensPosition()Lio/fotoapparat/characteristic/LensPosition;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 199
    :cond_0
    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 190
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    .line 191
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/fotoapparat/characteristic/LensPosition;

    .line 193
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/fotoapparat/hardware/CameraDevice;

    invoke-virtual {v1}, Lio/fotoapparat/hardware/CameraDevice;->getCharacteristics()Lio/fotoapparat/characteristic/Characteristics;

    move-result-object v1

    invoke-virtual {v1}, Lio/fotoapparat/characteristic/Characteristics;->getLensPosition()Lio/fotoapparat/characteristic/LensPosition;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    check-cast v0, Lio/fotoapparat/hardware/CameraDevice;

    return-object v0
.end method

.method public static final updateConfiguration(Lio/fotoapparat/configuration/CameraConfiguration;Lio/fotoapparat/configuration/Configuration;)Lio/fotoapparat/configuration/CameraConfiguration;
    .locals 14
    .param p0    # Lio/fotoapparat/configuration/CameraConfiguration;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/fotoapparat/configuration/Configuration;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "savedConfiguration"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    new-instance v0, Lio/fotoapparat/configuration/CameraConfiguration;

    .line 168
    invoke-interface {p1}, Lio/fotoapparat/configuration/Configuration;->getFlashMode()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFlashMode()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    :goto_0
    move-object v2, v1

    .line 169
    invoke-interface {p1}, Lio/fotoapparat/configuration/Configuration;->getFocusMode()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFocusMode()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    :goto_1
    move-object v3, v1

    const/4 v4, 0x0

    .line 170
    invoke-interface {p1}, Lio/fotoapparat/configuration/Configuration;->getExposureCompensation()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    if-eqz v1, :cond_2

    move-object v5, v1

    goto :goto_2

    .line 171
    :cond_2
    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getExposureCompensation()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    move-object v5, v1

    .line 172
    :goto_2
    invoke-interface {p1}, Lio/fotoapparat/configuration/Configuration;->getFrameProcessor()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFrameProcessor()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    :goto_3
    move-object v6, v1

    .line 173
    invoke-interface {p1}, Lio/fotoapparat/configuration/Configuration;->getPreviewFpsRange()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    if-eqz v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPreviewFpsRange()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    :goto_4
    move-object v7, v1

    const/4 v8, 0x0

    .line 174
    invoke-interface {p1}, Lio/fotoapparat/configuration/Configuration;->getSensorSensitivity()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    if-eqz v1, :cond_5

    move-object v9, v1

    goto :goto_5

    .line 175
    :cond_5
    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getSensorSensitivity()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    move-object v9, v1

    .line 176
    :goto_5
    invoke-interface {p1}, Lio/fotoapparat/configuration/Configuration;->getPictureResolution()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    if-eqz v1, :cond_6

    move-object v10, v1

    goto :goto_6

    .line 177
    :cond_6
    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPictureResolution()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    move-object v10, v1

    .line 178
    :goto_6
    invoke-interface {p1}, Lio/fotoapparat/configuration/Configuration;->getPreviewResolution()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_7

    move-object v11, p1

    goto :goto_7

    .line 179
    :cond_7
    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPreviewResolution()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    move-object v11, p0

    :goto_7
    const/16 v12, 0x44

    const/4 v13, 0x0

    move-object v1, v0

    .line 167
    invoke-direct/range {v1 .. v13}, Lio/fotoapparat/configuration/CameraConfiguration;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
