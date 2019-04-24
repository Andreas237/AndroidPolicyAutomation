.class public final Lio/fotoapparat/parameter/camera/apply/CameraParametersApplicatorKt;
.super Ljava/lang/Object;
.source "CameraParametersApplicator.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCameraParametersApplicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraParametersApplicator.kt\nio/fotoapparat/parameter/camera/apply/CameraParametersApplicatorKt\n*L\n1#1,79:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000@\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007R\u00020\u0008H\u0082\u0004\u001a\u0019\u0010\t\u001a\u00020\u0004*\u00020\n2\n\u0010\u0006\u001a\u00060\u0007R\u00020\u0008H\u0082\u0004\u001a\u0019\u0010\t\u001a\u00020\u0004*\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0007R\u00020\u0008H\u0082\u0004\u001a\u0019\u0010\t\u001a\u00020\u0004*\u00020\u000c2\n\u0010\u0006\u001a\u00060\u0007R\u00020\u0008H\u0082\u0004\u001a\u0019\u0010\t\u001a\u00020\u0004*\u00020\r2\n\u0010\u0006\u001a\u00060\u0007R\u00020\u0008H\u0082\u0004\u001a\u001c\u0010\t\u001a\u00060\u0007R\u00020\u0008*\u00020\u000e2\n\u0010\u0006\u001a\u00060\u0007R\u00020\u0008H\u0000\u001a\u0019\u0010\u000f\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007R\u00020\u0008H\u0082\u0004\u001a\u0019\u0010\u0010\u001a\u00020\u0004*\u00020\u00112\n\u0010\u0006\u001a\u00060\u0007R\u00020\u0008H\u0082\u0004\u001a\u0019\u0010\u0012\u001a\u00020\u0004*\u00020\u00112\n\u0010\u0006\u001a\u00060\u0007R\u00020\u0008H\u0082\u0004\u001a \u0010\u0013\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\n\u0010\u0006\u001a\u00060\u0007R\u00020\u0008H\u0082\u0004\u00a2\u0006\u0002\u0010\u0014\u001a\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002*\u00060\u0007R\u00020\u0008H\u0002\u001a\u0019\u0010\u0016\u001a\u00020\u0004*\u00020\u000e2\n\u0010\u0006\u001a\u00060\u0007R\u00020\u0008H\u0082\u0004\"\u0014\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "currentSensitivityKeys",
        "",
        "",
        "applyExposureCompensationInto",
        "",
        "",
        "parameters",
        "Landroid/hardware/Camera$Parameters;",
        "Landroid/hardware/Camera;",
        "applyInto",
        "Lio/fotoapparat/parameter/AntiBandingMode;",
        "Lio/fotoapparat/parameter/Flash;",
        "Lio/fotoapparat/parameter/FocusMode;",
        "Lio/fotoapparat/parameter/FpsRange;",
        "Lio/fotoapparat/parameter/camera/CameraParameters;",
        "applyJpegQualityInto",
        "applyPictureResolutionInto",
        "Lio/fotoapparat/parameter/Resolution;",
        "applyPreviewInto",
        "applySensitivityInto",
        "(Ljava/lang/Integer;Landroid/hardware/Camera$Parameters;)V",
        "findSensitivityKey",
        "tryApplyInto",
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
.field private static final currentSensitivityKeys:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "iso"

    const-string v1, "iso-speed"

    const-string v2, "nv-picture-iso"

    .line 78
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lio/fotoapparat/parameter/camera/apply/CameraParametersApplicatorKt;->currentSensitivityKeys:Ljava/util/List;

    return-void
.end method

.method private static final applyExposureCompensationInto(ILandroid/hardware/Camera$Parameters;)V
    .locals 0

    .line 49
    invoke-virtual {p1, p0}, Landroid/hardware/Camera$Parameters;->setExposureCompensation(I)V

    return-void
.end method

.method public static final applyInto(Lio/fotoapparat/parameter/camera/CameraParameters;Landroid/hardware/Camera$Parameters;)Landroid/hardware/Camera$Parameters;
    .locals 1
    .param p0    # Lio/fotoapparat/parameter/camera/CameraParameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/hardware/Camera$Parameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-static {p0, p1}, Lio/fotoapparat/parameter/camera/apply/CameraParametersApplicatorKt;->tryApplyInto(Lio/fotoapparat/parameter/camera/CameraParameters;Landroid/hardware/Camera$Parameters;)V

    return-object p1
.end method

.method private static final applyInto(Lio/fotoapparat/parameter/AntiBandingMode;Landroid/hardware/Camera$Parameters;)V
    .locals 0
    .param p0    # Lio/fotoapparat/parameter/AntiBandingMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 53
    invoke-static {p0}, Lio/fotoapparat/parameter/camera/convert/AntiBandingConverterKt;->toCode(Lio/fotoapparat/parameter/AntiBandingMode;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/hardware/Camera$Parameters;->setAntibanding(Ljava/lang/String;)V

    return-void
.end method

.method private static final applyInto(Lio/fotoapparat/parameter/Flash;Landroid/hardware/Camera$Parameters;)V
    .locals 0
    .param p0    # Lio/fotoapparat/parameter/Flash;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 37
    invoke-static {p0}, Lio/fotoapparat/parameter/camera/convert/FlashConverterKt;->toCode(Lio/fotoapparat/parameter/Flash;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    return-void
.end method

.method private static final applyInto(Lio/fotoapparat/parameter/FocusMode;Landroid/hardware/Camera$Parameters;)V
    .locals 0
    .param p0    # Lio/fotoapparat/parameter/FocusMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 41
    invoke-static {p0}, Lio/fotoapparat/parameter/camera/convert/FocusModeConverterKt;->toCode(Lio/fotoapparat/parameter/FocusMode;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    return-void
.end method

.method private static final applyInto(Lio/fotoapparat/parameter/FpsRange;Landroid/hardware/Camera$Parameters;)V
    .locals 1
    .param p0    # Lio/fotoapparat/parameter/FpsRange;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 57
    invoke-virtual {p0}, Lio/fotoapparat/parameter/FpsRange;->getMin()I

    move-result v0

    invoke-virtual {p0}, Lio/fotoapparat/parameter/FpsRange;->getMax()I

    move-result p0

    invoke-virtual {p1, v0, p0}, Landroid/hardware/Camera$Parameters;->setPreviewFpsRange(II)V

    return-void
.end method

.method private static final applyJpegQualityInto(ILandroid/hardware/Camera$Parameters;)V
    .locals 0

    .line 45
    invoke-virtual {p1, p0}, Landroid/hardware/Camera$Parameters;->setJpegQuality(I)V

    return-void
.end method

.method private static final applyPictureResolutionInto(Lio/fotoapparat/parameter/Resolution;Landroid/hardware/Camera$Parameters;)V
    .locals 1
    .param p0    # Lio/fotoapparat/parameter/Resolution;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 73
    iget v0, p0, Lio/fotoapparat/parameter/Resolution;->width:I

    iget p0, p0, Lio/fotoapparat/parameter/Resolution;->height:I

    invoke-virtual {p1, v0, p0}, Landroid/hardware/Camera$Parameters;->setPictureSize(II)V

    return-void
.end method

.method private static final applyPreviewInto(Lio/fotoapparat/parameter/Resolution;Landroid/hardware/Camera$Parameters;)V
    .locals 1
    .param p0    # Lio/fotoapparat/parameter/Resolution;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 69
    iget v0, p0, Lio/fotoapparat/parameter/Resolution;->width:I

    iget p0, p0, Lio/fotoapparat/parameter/Resolution;->height:I

    invoke-virtual {p1, v0, p0}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    return-void
.end method

.method private static final applySensitivityInto(Ljava/lang/Integer;Landroid/hardware/Camera$Parameters;)V
    .locals 1
    .param p0    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p0, :cond_0

    .line 61
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    .line 62
    invoke-static {p1}, Lio/fotoapparat/parameter/camera/apply/CameraParametersApplicatorKt;->findSensitivityKey(Landroid/hardware/Camera$Parameters;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 63
    invoke-virtual {p1, v0, p0}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method private static final findSensitivityKey(Landroid/hardware/Camera$Parameters;)Ljava/lang/String;
    .locals 3
    .param p0    # Landroid/hardware/Camera$Parameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 76
    sget-object v0, Lio/fotoapparat/parameter/camera/apply/CameraParametersApplicatorKt;->currentSensitivityKeys:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_0

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    check-cast v1, Ljava/lang/String;

    return-object v1
.end method

.method private static final tryApplyInto(Lio/fotoapparat/parameter/camera/CameraParameters;Landroid/hardware/Camera$Parameters;)V
    .locals 1
    .param p0    # Lio/fotoapparat/parameter/camera/CameraParameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 25
    invoke-virtual {p0}, Lio/fotoapparat/parameter/camera/CameraParameters;->getFlashMode()Lio/fotoapparat/parameter/Flash;

    move-result-object v0

    invoke-static {v0, p1}, Lio/fotoapparat/parameter/camera/apply/CameraParametersApplicatorKt;->applyInto(Lio/fotoapparat/parameter/Flash;Landroid/hardware/Camera$Parameters;)V

    .line 26
    invoke-virtual {p0}, Lio/fotoapparat/parameter/camera/CameraParameters;->getFocusMode()Lio/fotoapparat/parameter/FocusMode;

    move-result-object v0

    invoke-static {v0, p1}, Lio/fotoapparat/parameter/camera/apply/CameraParametersApplicatorKt;->applyInto(Lio/fotoapparat/parameter/FocusMode;Landroid/hardware/Camera$Parameters;)V

    .line 27
    invoke-virtual {p0}, Lio/fotoapparat/parameter/camera/CameraParameters;->getJpegQuality()I

    move-result v0

    invoke-static {v0, p1}, Lio/fotoapparat/parameter/camera/apply/CameraParametersApplicatorKt;->applyJpegQualityInto(ILandroid/hardware/Camera$Parameters;)V

    .line 28
    invoke-virtual {p0}, Lio/fotoapparat/parameter/camera/CameraParameters;->getExposureCompensation()I

    move-result v0

    invoke-static {v0, p1}, Lio/fotoapparat/parameter/camera/apply/CameraParametersApplicatorKt;->applyExposureCompensationInto(ILandroid/hardware/Camera$Parameters;)V

    .line 29
    invoke-virtual {p0}, Lio/fotoapparat/parameter/camera/CameraParameters;->getAntiBandingMode()Lio/fotoapparat/parameter/AntiBandingMode;

    move-result-object v0

    invoke-static {v0, p1}, Lio/fotoapparat/parameter/camera/apply/CameraParametersApplicatorKt;->applyInto(Lio/fotoapparat/parameter/AntiBandingMode;Landroid/hardware/Camera$Parameters;)V

    .line 30
    invoke-virtual {p0}, Lio/fotoapparat/parameter/camera/CameraParameters;->getPreviewFpsRange()Lio/fotoapparat/parameter/FpsRange;

    move-result-object v0

    invoke-static {v0, p1}, Lio/fotoapparat/parameter/camera/apply/CameraParametersApplicatorKt;->applyInto(Lio/fotoapparat/parameter/FpsRange;Landroid/hardware/Camera$Parameters;)V

    .line 31
    invoke-virtual {p0}, Lio/fotoapparat/parameter/camera/CameraParameters;->getPreviewResolution()Lio/fotoapparat/parameter/Resolution;

    move-result-object v0

    invoke-static {v0, p1}, Lio/fotoapparat/parameter/camera/apply/CameraParametersApplicatorKt;->applyPreviewInto(Lio/fotoapparat/parameter/Resolution;Landroid/hardware/Camera$Parameters;)V

    .line 32
    invoke-virtual {p0}, Lio/fotoapparat/parameter/camera/CameraParameters;->getSensorSensitivity()Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0, p1}, Lio/fotoapparat/parameter/camera/apply/CameraParametersApplicatorKt;->applySensitivityInto(Ljava/lang/Integer;Landroid/hardware/Camera$Parameters;)V

    .line 33
    invoke-virtual {p0}, Lio/fotoapparat/parameter/camera/CameraParameters;->getPictureResolution()Lio/fotoapparat/parameter/Resolution;

    move-result-object p0

    invoke-static {p0, p1}, Lio/fotoapparat/parameter/camera/apply/CameraParametersApplicatorKt;->applyPictureResolutionInto(Lio/fotoapparat/parameter/Resolution;Landroid/hardware/Camera$Parameters;)V

    return-void
.end method
