.class public final Lio/fotoapparat/capability/provide/CapabilitiesProviderKt;
.super Ljava/lang/Object;
.source "CapabilitiesProvider.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCapabilitiesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapabilitiesProvider.kt\nio/fotoapparat/capability/provide/CapabilitiesProviderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1340#2,9:36\n1561#2,2:45\n1349#2:47\n1288#2:48\n1357#2,3:49\n*E\n*S KotlinDebug\n*F\n+ 1 CapabilitiesProvider.kt\nio/fotoapparat/capability/provide/CapabilitiesProviderKt\n*L\n33#1,9:36\n33#1,2:45\n33#1:47\n35#1:48\n35#1,3:49\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00006\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\u001a>\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0008\u0008\u0000\u0010\u0002*\u00020\u0003\"\u0004\u0008\u0001\u0010\u0004*\u0008\u0012\u0004\u0012\u0002H\u00040\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0007H\u0002\u001a\u000c\u0010\u0008\u001a\u00020\t*\u00020\nH\u0000\u001a\u000c\u0010\u0008\u001a\u00020\t*\u00020\u000bH\u0002\u001a\u001c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0001*\u000c\u0012\u0008\u0012\u00060\u000fR\u00020\n0\u000eH\u0002\u00a8\u0006\u0010"
    }
    d2 = {
        "extract",
        "",
        "Parameter",
        "",
        "Code",
        "",
        "converter",
        "Lkotlin/Function1;",
        "getCapabilities",
        "Lio/fotoapparat/capability/Capabilities;",
        "Landroid/hardware/Camera;",
        "Lio/fotoapparat/parameter/SupportedParameters;",
        "mapSizes",
        "Lio/fotoapparat/parameter/Resolution;",
        "",
        "Landroid/hardware/Camera$Size;",
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
.method private static final extract(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .locals 2
    .param p0    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Parameter:",
            "Ljava/lang/Object;",
            "Code:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TCode;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-TCode;+TParameter;>;)",
            "Ljava/util/Set<",
            "TParameter;>;"
        }
    .end annotation

    .line 33
    check-cast p0, Ljava/lang/Iterable;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 45
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 33
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 44
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 47
    :cond_1
    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 33
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static final getCapabilities(Landroid/hardware/Camera;)Lio/fotoapparat/capability/Capabilities;
    .locals 2
    .param p0    # Landroid/hardware/Camera;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v0, Lio/fotoapparat/parameter/SupportedParameters;

    invoke-virtual {p0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p0

    const-string v1, "parameters"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lio/fotoapparat/parameter/SupportedParameters;-><init>(Landroid/hardware/Camera$Parameters;)V

    invoke-static {v0}, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt;->getCapabilities(Lio/fotoapparat/parameter/SupportedParameters;)Lio/fotoapparat/capability/Capabilities;

    move-result-object p0

    return-object p0
.end method

.method private static final getCapabilities(Lio/fotoapparat/parameter/SupportedParameters;)Lio/fotoapparat/capability/Capabilities;
    .locals 15
    .param p0    # Lio/fotoapparat/parameter/SupportedParameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 16
    new-instance v14, Lio/fotoapparat/capability/Capabilities;

    .line 17
    invoke-virtual {p0}, Lio/fotoapparat/parameter/SupportedParameters;->getSupportedZoom()Lio/fotoapparat/parameter/Zoom;

    move-result-object v1

    .line 18
    invoke-virtual {p0}, Lio/fotoapparat/parameter/SupportedParameters;->getFlashModes()Ljava/util/List;

    move-result-object v0

    sget-object v2, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$1;->INSTANCE:Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$1;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2}, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt;->extract(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    move-result-object v2

    .line 19
    invoke-virtual {p0}, Lio/fotoapparat/parameter/SupportedParameters;->getFocusModes()Ljava/util/List;

    move-result-object v0

    sget-object v3, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$2;->INSTANCE:Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$2;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v3}, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt;->extract(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    move-result-object v3

    .line 20
    invoke-virtual {p0}, Lio/fotoapparat/parameter/SupportedParameters;->getMaxNumFocusAreas()I

    move-result v5

    .line 21
    invoke-virtual {p0}, Lio/fotoapparat/parameter/SupportedParameters;->getSupportedSmoothZoom()Z

    move-result v4

    .line 22
    invoke-virtual {p0}, Lio/fotoapparat/parameter/SupportedParameters;->getMaxNumMeteringAreas()I

    move-result v6

    .line 23
    invoke-virtual {p0}, Lio/fotoapparat/parameter/SupportedParameters;->getJpegQualityRange()Lkotlin/ranges/IntRange;

    move-result-object v7

    .line 24
    invoke-virtual {p0}, Lio/fotoapparat/parameter/SupportedParameters;->getExposureCompensationRange()Lkotlin/ranges/IntRange;

    move-result-object v8

    .line 25
    invoke-virtual {p0}, Lio/fotoapparat/parameter/SupportedParameters;->getSupportedAutoBandingModes()Ljava/util/List;

    move-result-object v0

    sget-object v9, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$3;->INSTANCE:Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$3;

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v9}, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt;->extract(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    move-result-object v10

    .line 26
    invoke-virtual {p0}, Lio/fotoapparat/parameter/SupportedParameters;->getSensorSensitivities()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v13

    .line 27
    invoke-virtual {p0}, Lio/fotoapparat/parameter/SupportedParameters;->getSupportedPreviewFpsRanges()Ljava/util/List;

    move-result-object v0

    sget-object v9, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$4;->INSTANCE:Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$4;

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v9}, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt;->extract(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    move-result-object v9

    .line 28
    invoke-virtual {p0}, Lio/fotoapparat/parameter/SupportedParameters;->getPictureResolutions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt;->mapSizes(Ljava/util/Collection;)Ljava/util/Set;

    move-result-object v11

    .line 29
    invoke-virtual {p0}, Lio/fotoapparat/parameter/SupportedParameters;->getPreviewResolutions()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt;->mapSizes(Ljava/util/Collection;)Ljava/util/Set;

    move-result-object v12

    move-object v0, v14

    .line 16
    invoke-direct/range {v0 .. v13}, Lio/fotoapparat/capability/Capabilities;-><init>(Lio/fotoapparat/parameter/Zoom;Ljava/util/Set;Ljava/util/Set;ZIILkotlin/ranges/IntRange;Lkotlin/ranges/IntRange;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V

    return-object v14
.end method

.method private static final mapSizes(Ljava/util/Collection;)Ljava/util/Set;
    .locals 2
    .param p0    # Ljava/util/Collection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Landroid/hardware/Camera$Size;",
            ">;)",
            "Ljava/util/Set<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;"
        }
    .end annotation

    .line 35
    check-cast p0, Ljava/lang/Iterable;

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 49
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 50
    check-cast v1, Landroid/hardware/Camera$Size;

    .line 35
    invoke-static {v1}, Lio/fotoapparat/parameter/camera/convert/ResolutionConverterKt;->toResolution(Landroid/hardware/Camera$Size;)Lio/fotoapparat/parameter/Resolution;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 51
    :cond_0
    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 35
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method
