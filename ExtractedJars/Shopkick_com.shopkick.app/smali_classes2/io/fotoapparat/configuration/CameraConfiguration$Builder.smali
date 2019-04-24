.class public final Lio/fotoapparat/configuration/CameraConfiguration$Builder;
.super Ljava/lang/Object;
.source "CameraConfiguration.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fotoapparat/configuration/CameraConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCameraConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraConfiguration.kt\nio/fotoapparat/configuration/CameraConfiguration$Builder\n*L\n1#1,131:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u0008\u0000\u00a2\u0006\u0002\u0010\u0002J+\u0010\u0005\u001a\u00020\u00002#\u0010\u0006\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007j\u0002`\n\u00a2\u0006\u0002\u0008\u000bJ\u0006\u0010\u000c\u001a\u00020\u0004J%\u0010\r\u001a\u00020\u00002\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007j\u0002`\u0010\u00a2\u0006\u0002\u0008\u000bJ+\u0010\u0011\u001a\u00020\u00002#\u0010\u0006\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0007j\u0002`\u0013\u00a2\u0006\u0002\u0008\u000bJ+\u0010\u0014\u001a\u00020\u00002#\u0010\u0006\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0007j\u0002`\u0016\u00a2\u0006\u0002\u0008\u000bJ\u0010\u0010\u0017\u001a\u00020\u00002\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018J%\u0010\u0019\u001a\u00020\u00002\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007j\u0002`\u001a\u00a2\u0006\u0002\u0008\u000bJ+\u0010\u001b\u001a\u00020\u00002#\u0010\u0006\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001c0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0007j\u0002`\u001d\u00a2\u0006\u0002\u0008\u000bJ+\u0010\u001e\u001a\u00020\u00002#\u0010\u0006\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001f0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u0007j\u0002` \u00a2\u0006\u0002\u0008\u000bJ+\u0010!\u001a\u00020\u00002#\u0010\u0006\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001c0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0007j\u0002`\u001d\u00a2\u0006\u0002\u0008\u000bJ+\u0010\"\u001a\u00020\u00002#\u0010\u0006\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007j\u0002`#\u00a2\u0006\u0002\u0008\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"
    }
    d2 = {
        "Lio/fotoapparat/configuration/CameraConfiguration$Builder;",
        "",
        "()V",
        "cameraConfiguration",
        "Lio/fotoapparat/configuration/CameraConfiguration;",
        "antiBandingMode",
        "selector",
        "Lkotlin/Function1;",
        "",
        "Lio/fotoapparat/parameter/AntiBandingMode;",
        "Lio/fotoapparat/selector/AntiBandingModeSelector;",
        "Lkotlin/ExtensionFunctionType;",
        "build",
        "exposureCompensation",
        "Lkotlin/ranges/IntRange;",
        "",
        "Lio/fotoapparat/selector/ExposureSelector;",
        "flash",
        "Lio/fotoapparat/parameter/Flash;",
        "Lio/fotoapparat/selector/FlashSelector;",
        "focusMode",
        "Lio/fotoapparat/parameter/FocusMode;",
        "Lio/fotoapparat/selector/FocusModeSelector;",
        "frameProcessor",
        "Lio/fotoapparat/preview/FrameProcessor;",
        "jpegQuality",
        "Lio/fotoapparat/selector/QualitySelector;",
        "photoResolution",
        "Lio/fotoapparat/parameter/Resolution;",
        "Lio/fotoapparat/selector/ResolutionSelector;",
        "previewFpsRange",
        "Lio/fotoapparat/parameter/FpsRange;",
        "Lio/fotoapparat/selector/FpsRangeSelector;",
        "previewResolution",
        "sensorSensitivity",
        "Lio/fotoapparat/selector/SensorSensitivitySelector;",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    sget-object v0, Lio/fotoapparat/configuration/CameraConfiguration;->Companion:Lio/fotoapparat/configuration/CameraConfiguration$Companion;

    invoke-virtual {v0}, Lio/fotoapparat/configuration/CameraConfiguration$Companion;->default()Lio/fotoapparat/configuration/CameraConfiguration;

    move-result-object v0

    iput-object v0, p0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    return-void
.end method


# virtual methods
.method public final antiBandingMode(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/configuration/CameraConfiguration$Builder;
    .locals 14
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;+",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;)",
            "Lio/fotoapparat/configuration/CameraConfiguration$Builder;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "selector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    move-object v0, p0

    check-cast v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;

    .line 68
    iget-object v1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x3bf

    const/4 v13, 0x0

    move-object v8, p1

    invoke-static/range {v1 .. v13}, Lio/fotoapparat/configuration/CameraConfiguration;->copy$default(Lio/fotoapparat/configuration/CameraConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/fotoapparat/configuration/CameraConfiguration;

    return-object v0
.end method

.method public final build()Lio/fotoapparat/configuration/CameraConfiguration;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 106
    iget-object v0, p0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    return-object v0
.end method

.method public final exposureCompensation(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/configuration/CameraConfiguration$Builder;
    .locals 14
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/ranges/IntRange;",
            "Ljava/lang/Integer;",
            ">;)",
            "Lio/fotoapparat/configuration/CameraConfiguration$Builder;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "selector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    move-object v0, p0

    check-cast v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;

    .line 62
    iget-object v1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x3f7

    const/4 v13, 0x0

    move-object v5, p1

    invoke-static/range {v1 .. v13}, Lio/fotoapparat/configuration/CameraConfiguration;->copy$default(Lio/fotoapparat/configuration/CameraConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/fotoapparat/configuration/CameraConfiguration;

    move-result-object p1

    iput-object p1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    return-object v0
.end method

.method public final flash(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/configuration/CameraConfiguration$Builder;
    .locals 14
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/Flash;",
            ">;+",
            "Lio/fotoapparat/parameter/Flash;",
            ">;)",
            "Lio/fotoapparat/configuration/CameraConfiguration$Builder;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "selector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    move-object v0, p0

    check-cast v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;

    .line 44
    iget-object v1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x3fe

    const/4 v13, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v13}, Lio/fotoapparat/configuration/CameraConfiguration;->copy$default(Lio/fotoapparat/configuration/CameraConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/fotoapparat/configuration/CameraConfiguration;

    move-result-object p1

    iput-object p1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    return-object v0
.end method

.method public final focusMode(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/configuration/CameraConfiguration$Builder;
    .locals 14
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;+",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;)",
            "Lio/fotoapparat/configuration/CameraConfiguration$Builder;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "selector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    move-object v0, p0

    check-cast v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;

    .line 50
    iget-object v1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x3fd

    const/4 v13, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v13}, Lio/fotoapparat/configuration/CameraConfiguration;->copy$default(Lio/fotoapparat/configuration/CameraConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/fotoapparat/configuration/CameraConfiguration;

    move-result-object p1

    iput-object p1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    return-object v0
.end method

.method public final frameProcessor(Lio/fotoapparat/preview/FrameProcessor;)Lio/fotoapparat/configuration/CameraConfiguration$Builder;
    .locals 14
    .param p1    # Lio/fotoapparat/preview/FrameProcessor;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 97
    move-object v0, p0

    check-cast v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;

    .line 98
    iget-object v1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    if-eqz p1, :cond_0

    .line 99
    new-instance v2, Lio/fotoapparat/configuration/CameraConfiguration$Builder$frameProcessor$1$1$1;

    invoke-direct {v2, p1}, Lio/fotoapparat/configuration/CameraConfiguration$Builder$frameProcessor$1$1$1;-><init>(Lio/fotoapparat/preview/FrameProcessor;)V

    check-cast v2, Lkotlin/reflect/KFunction;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    move-object v6, v2

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x3ef

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 98
    invoke-static/range {v1 .. v13}, Lio/fotoapparat/configuration/CameraConfiguration;->copy$default(Lio/fotoapparat/configuration/CameraConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/fotoapparat/configuration/CameraConfiguration;

    move-result-object p1

    iput-object p1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    return-object v0
.end method

.method public final jpegQuality(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/configuration/CameraConfiguration$Builder;
    .locals 14
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/ranges/IntRange;",
            "Ljava/lang/Integer;",
            ">;)",
            "Lio/fotoapparat/configuration/CameraConfiguration$Builder;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "selector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    move-object v0, p0

    check-cast v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;

    .line 74
    iget-object v1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x3fb

    const/4 v13, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v13}, Lio/fotoapparat/configuration/CameraConfiguration;->copy$default(Lio/fotoapparat/configuration/CameraConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/fotoapparat/configuration/CameraConfiguration;

    return-object v0
.end method

.method public final photoResolution(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/configuration/CameraConfiguration$Builder;
    .locals 14
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;)",
            "Lio/fotoapparat/configuration/CameraConfiguration$Builder;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "selector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    move-object v0, p0

    check-cast v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;

    .line 92
    iget-object v1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x2ff

    const/4 v13, 0x0

    move-object v10, p1

    invoke-static/range {v1 .. v13}, Lio/fotoapparat/configuration/CameraConfiguration;->copy$default(Lio/fotoapparat/configuration/CameraConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/fotoapparat/configuration/CameraConfiguration;

    move-result-object p1

    iput-object p1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    return-object v0
.end method

.method public final previewFpsRange(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/configuration/CameraConfiguration$Builder;
    .locals 14
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/FpsRange;",
            ">;",
            "Lio/fotoapparat/parameter/FpsRange;",
            ">;)",
            "Lio/fotoapparat/configuration/CameraConfiguration$Builder;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "selector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    move-object v0, p0

    check-cast v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;

    .line 56
    iget-object v1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x3df

    const/4 v13, 0x0

    move-object v7, p1

    invoke-static/range {v1 .. v13}, Lio/fotoapparat/configuration/CameraConfiguration;->copy$default(Lio/fotoapparat/configuration/CameraConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/fotoapparat/configuration/CameraConfiguration;

    move-result-object p1

    iput-object p1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    return-object v0
.end method

.method public final previewResolution(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/configuration/CameraConfiguration$Builder;
    .locals 14
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;)",
            "Lio/fotoapparat/configuration/CameraConfiguration$Builder;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "selector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    move-object v0, p0

    check-cast v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;

    .line 86
    iget-object v1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v12, 0x1ff

    const/4 v13, 0x0

    move-object v11, p1

    invoke-static/range {v1 .. v13}, Lio/fotoapparat/configuration/CameraConfiguration;->copy$default(Lio/fotoapparat/configuration/CameraConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/fotoapparat/configuration/CameraConfiguration;

    move-result-object p1

    iput-object p1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    return-object v0
.end method

.method public final sensorSensitivity(Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/configuration/CameraConfiguration$Builder;
    .locals 14
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/Integer;",
            ">;)",
            "Lio/fotoapparat/configuration/CameraConfiguration$Builder;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "selector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    move-object v0, p0

    check-cast v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;

    .line 80
    iget-object v1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x37f

    const/4 v13, 0x0

    move-object v9, p1

    invoke-static/range {v1 .. v13}, Lio/fotoapparat/configuration/CameraConfiguration;->copy$default(Lio/fotoapparat/configuration/CameraConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/fotoapparat/configuration/CameraConfiguration;

    move-result-object p1

    iput-object p1, v0, Lio/fotoapparat/configuration/CameraConfiguration$Builder;->cameraConfiguration:Lio/fotoapparat/configuration/CameraConfiguration;

    return-object v0
.end method
