.class public final Lio/fotoapparat/configuration/CameraConfiguration;
.super Ljava/lang/Object;
.source "CameraConfiguration.kt"

# interfaces
.implements Lio/fotoapparat/configuration/Configuration;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fotoapparat/configuration/CameraConfiguration$Builder;,
        Lio/fotoapparat/configuration/CameraConfiguration$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u0000 C2\u00020\u0001:\u0002BCB\u0089\u0003\u0012%\u0008\u0002\u0010\u0002\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006\u00a2\u0006\u0002\u0008\u0007\u0012%\u0008\u0002\u0010\u0008\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003j\u0002`\n\u00a2\u0006\u0002\u0008\u0007\u0012\u001f\u0008\u0002\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003j\u0002`\u000e\u00a2\u0006\u0002\u0008\u0007\u0012\u001f\u0008\u0002\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003j\u0002`\u0010\u00a2\u0006\u0002\u0008\u0007\u0012+\u0008\u0002\u0010\u0011\u001a%\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0008(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0003j\u0004\u0018\u0001`\u0017\u0012%\u0008\u0002\u0010\u0018\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00190\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0003j\u0002`\u001a\u00a2\u0006\u0002\u0008\u0007\u0012%\u0008\u0002\u0010\u001b\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001c0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0003j\u0002`\u001d\u00a2\u0006\u0002\u0008\u0007\u0012)\u0008\u0002\u0010\u001e\u001a#\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0003j\u0004\u0018\u0001`\u001f\u00a2\u0006\u0002\u0008\u0007\u0012%\u0008\u0002\u0010 \u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0\u0004\u0012\u0006\u0012\u0004\u0018\u00010!0\u0003j\u0002`\"\u00a2\u0006\u0002\u0008\u0007\u0012%\u0008\u0002\u0010#\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0\u0004\u0012\u0006\u0012\u0004\u0018\u00010!0\u0003j\u0002`\"\u00a2\u0006\u0002\u0008\u0007\u00a2\u0006\u0002\u0010$J&\u00100\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006\u00a2\u0006\u0002\u0008\u0007H\u00c6\u0003J&\u00101\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0\u0004\u0012\u0006\u0012\u0004\u0018\u00010!0\u0003j\u0002`\"\u00a2\u0006\u0002\u0008\u0007H\u00c6\u0003J&\u00102\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003j\u0002`\n\u00a2\u0006\u0002\u0008\u0007H\u00c6\u0003J \u00103\u001a\u0019\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003j\u0002`\u000e\u00a2\u0006\u0002\u0008\u0007H\u00c6\u0003J \u00104\u001a\u0019\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003j\u0002`\u0010\u00a2\u0006\u0002\u0008\u0007H\u00c6\u0003J,\u00105\u001a%\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0008(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0003j\u0004\u0018\u0001`\u0017H\u00c6\u0003J&\u00106\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00190\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0003j\u0002`\u001a\u00a2\u0006\u0002\u0008\u0007H\u00c6\u0003J&\u00107\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001c0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0003j\u0002`\u001d\u00a2\u0006\u0002\u0008\u0007H\u00c6\u0003J*\u00108\u001a#\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0003j\u0004\u0018\u0001`\u001f\u00a2\u0006\u0002\u0008\u0007H\u00c6\u0003J&\u00109\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0\u0004\u0012\u0006\u0012\u0004\u0018\u00010!0\u0003j\u0002`\"\u00a2\u0006\u0002\u0008\u0007H\u00c6\u0003J\u008d\u0003\u0010:\u001a\u00020\u00002%\u0008\u0002\u0010\u0002\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006\u00a2\u0006\u0002\u0008\u00072%\u0008\u0002\u0010\u0008\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003j\u0002`\n\u00a2\u0006\u0002\u0008\u00072\u001f\u0008\u0002\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003j\u0002`\u000e\u00a2\u0006\u0002\u0008\u00072\u001f\u0008\u0002\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003j\u0002`\u0010\u00a2\u0006\u0002\u0008\u00072+\u0008\u0002\u0010\u0011\u001a%\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0008(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0003j\u0004\u0018\u0001`\u00172%\u0008\u0002\u0010\u0018\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00190\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0003j\u0002`\u001a\u00a2\u0006\u0002\u0008\u00072%\u0008\u0002\u0010\u001b\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001c0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0003j\u0002`\u001d\u00a2\u0006\u0002\u0008\u00072)\u0008\u0002\u0010\u001e\u001a#\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0003j\u0004\u0018\u0001`\u001f\u00a2\u0006\u0002\u0008\u00072%\u0008\u0002\u0010 \u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0\u0004\u0012\u0006\u0012\u0004\u0018\u00010!0\u0003j\u0002`\"\u00a2\u0006\u0002\u0008\u00072%\u0008\u0002\u0010#\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0\u0004\u0012\u0006\u0012\u0004\u0018\u00010!0\u0003j\u0002`\"\u00a2\u0006\u0002\u0008\u0007H\u00c6\u0001J\u0013\u0010;\u001a\u00020<2\u0008\u0010=\u001a\u0004\u0018\u00010>H\u00d6\u0003J\t\u0010?\u001a\u00020\rH\u00d6\u0001J\t\u0010@\u001a\u00020AH\u00d6\u0001R1\u0010\u001b\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001c0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0003j\u0002`\u001d\u00a2\u0006\u0002\u0008\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R+\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003j\u0002`\u0010\u00a2\u0006\u0002\u0008\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010&R1\u0010\u0002\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006\u00a2\u0006\u0002\u0008\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010&R1\u0010\u0008\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003j\u0002`\n\u00a2\u0006\u0002\u0008\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010&R7\u0010\u0011\u001a%\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0008(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0003j\u0004\u0018\u0001`\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010&R+\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0003j\u0002`\u000e\u00a2\u0006\u0002\u0008\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010&R1\u0010 \u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0\u0004\u0012\u0006\u0012\u0004\u0018\u00010!0\u0003j\u0002`\"\u00a2\u0006\u0002\u0008\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010&R1\u0010\u0018\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00190\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0003j\u0002`\u001a\u00a2\u0006\u0002\u0008\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010&R1\u0010#\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0\u0004\u0012\u0006\u0012\u0004\u0018\u00010!0\u0003j\u0002`\"\u00a2\u0006\u0002\u0008\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010&R5\u0010\u001e\u001a#\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0003j\u0004\u0018\u0001`\u001f\u00a2\u0006\u0002\u0008\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010&\u00a8\u0006D"
    }
    d2 = {
        "Lio/fotoapparat/configuration/CameraConfiguration;",
        "Lio/fotoapparat/configuration/Configuration;",
        "flashMode",
        "Lkotlin/Function1;",
        "",
        "Lio/fotoapparat/parameter/Flash;",
        "Lio/fotoapparat/selector/FlashSelector;",
        "Lkotlin/ExtensionFunctionType;",
        "focusMode",
        "Lio/fotoapparat/parameter/FocusMode;",
        "Lio/fotoapparat/selector/FocusModeSelector;",
        "jpegQuality",
        "Lkotlin/ranges/IntRange;",
        "",
        "Lio/fotoapparat/selector/QualitySelector;",
        "exposureCompensation",
        "Lio/fotoapparat/selector/ExposureSelector;",
        "frameProcessor",
        "Lio/fotoapparat/preview/Frame;",
        "Lkotlin/ParameterName;",
        "name",
        "frame",
        "",
        "Lio/fotoapparat/util/FrameProcessor;",
        "previewFpsRange",
        "Lio/fotoapparat/parameter/FpsRange;",
        "Lio/fotoapparat/selector/FpsRangeSelector;",
        "antiBandingMode",
        "Lio/fotoapparat/parameter/AntiBandingMode;",
        "Lio/fotoapparat/selector/AntiBandingModeSelector;",
        "sensorSensitivity",
        "Lio/fotoapparat/selector/SensorSensitivitySelector;",
        "pictureResolution",
        "Lio/fotoapparat/parameter/Resolution;",
        "Lio/fotoapparat/selector/ResolutionSelector;",
        "previewResolution",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "getAntiBandingMode",
        "()Lkotlin/jvm/functions/Function1;",
        "getExposureCompensation",
        "getFlashMode",
        "getFocusMode",
        "getFrameProcessor",
        "getJpegQuality",
        "getPictureResolution",
        "getPreviewFpsRange",
        "getPreviewResolution",
        "getSensorSensitivity",
        "component1",
        "component10",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "Builder",
        "Companion",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lio/fotoapparat/configuration/CameraConfiguration$Companion;


# instance fields
.field private final antiBandingMode:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final exposureCompensation:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/ranges/IntRange;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final flashMode:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/Flash;",
            ">;",
            "Lio/fotoapparat/parameter/Flash;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final focusMode:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final frameProcessor:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lio/fotoapparat/preview/Frame;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final jpegQuality:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/ranges/IntRange;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final pictureResolution:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final previewFpsRange:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/FpsRange;",
            ">;",
            "Lio/fotoapparat/parameter/FpsRange;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final previewResolution:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final sensorSensitivity:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/fotoapparat/configuration/CameraConfiguration$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/fotoapparat/configuration/CameraConfiguration$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/fotoapparat/configuration/CameraConfiguration;->Companion:Lio/fotoapparat/configuration/CameraConfiguration$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x3ff

    const/4 v12, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lio/fotoapparat/configuration/CameraConfiguration;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lkotlin/jvm/functions/Function1;
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
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;+",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/ranges/IntRange;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/ranges/IntRange;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/fotoapparat/preview/Frame;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/FpsRange;",
            ">;",
            "Lio/fotoapparat/parameter/FpsRange;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;+",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;)V"
        }
    .end annotation

    const-string v0, "flashMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "focusMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jpegQuality"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exposureCompensation"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previewFpsRange"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "antiBandingMode"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pictureResolution"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previewResolution"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/fotoapparat/configuration/CameraConfiguration;->flashMode:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lio/fotoapparat/configuration/CameraConfiguration;->focusMode:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lio/fotoapparat/configuration/CameraConfiguration;->jpegQuality:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lio/fotoapparat/configuration/CameraConfiguration;->exposureCompensation:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lio/fotoapparat/configuration/CameraConfiguration;->frameProcessor:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lio/fotoapparat/configuration/CameraConfiguration;->previewFpsRange:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lio/fotoapparat/configuration/CameraConfiguration;->antiBandingMode:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lio/fotoapparat/configuration/CameraConfiguration;->sensorSensitivity:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lio/fotoapparat/configuration/CameraConfiguration;->pictureResolution:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Lio/fotoapparat/configuration/CameraConfiguration;->previewResolution:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 14
    invoke-static {}, Lio/fotoapparat/selector/FlashSelectorsKt;->off()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_1

    .line 15
    new-array v2, v5, [Lkotlin/jvm/functions/Function1;

    .line 16
    invoke-static {}, Lio/fotoapparat/selector/FocusModeSelectorsKt;->continuousFocusPicture()Lkotlin/jvm/functions/Function1;

    move-result-object v8

    aput-object v8, v2, v4

    .line 17
    invoke-static {}, Lio/fotoapparat/selector/FocusModeSelectorsKt;->autoFocus()Lkotlin/jvm/functions/Function1;

    move-result-object v8

    aput-object v8, v2, v7

    .line 18
    invoke-static {}, Lio/fotoapparat/selector/FocusModeSelectorsKt;->fixed()Lkotlin/jvm/functions/Function1;

    move-result-object v8

    aput-object v8, v2, v6

    .line 19
    invoke-static {}, Lio/fotoapparat/selector/FocusModeSelectorsKt;->infinity()Lkotlin/jvm/functions/Function1;

    move-result-object v8

    aput-object v8, v2, v3

    .line 15
    invoke-static {v2}, Lio/fotoapparat/selector/SelectorsKt;->firstAvailable([Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v8, v0, 0x4

    if-eqz v8, :cond_2

    const/16 v8, 0x5a

    .line 21
    invoke-static {v8}, Lio/fotoapparat/selector/JpegQualitySelectorsKt;->manualJpegQuality(I)Lkotlin/jvm/functions/Function1;

    move-result-object v8

    goto :goto_2

    :cond_2
    move-object/from16 v8, p3

    :goto_2
    and-int/lit8 v9, v0, 0x8

    if-eqz v9, :cond_3

    .line 22
    invoke-static {v4}, Lio/fotoapparat/selector/ExposureCompensationSelectorsKt;->manualExposure(I)Lkotlin/jvm/functions/Function1;

    move-result-object v9

    goto :goto_3

    :cond_3
    move-object/from16 v9, p4

    :goto_3
    and-int/lit8 v10, v0, 0x10

    const/4 v11, 0x0

    if-eqz v10, :cond_4

    .line 23
    move-object v10, v11

    check-cast v10, Lkotlin/jvm/functions/Function1;

    goto :goto_4

    :cond_4
    move-object/from16 v10, p5

    :goto_4
    and-int/lit8 v12, v0, 0x20

    if-eqz v12, :cond_5

    .line 24
    invoke-static {}, Lio/fotoapparat/selector/PreviewFpsRangeSelectorsKt;->highestFps()Lkotlin/jvm/functions/Function1;

    move-result-object v12

    goto :goto_5

    :cond_5
    move-object/from16 v12, p6

    :goto_5
    and-int/lit8 v13, v0, 0x40

    if-eqz v13, :cond_6

    .line 25
    new-array v5, v5, [Lkotlin/jvm/functions/Function1;

    .line 26
    invoke-static {}, Lio/fotoapparat/selector/AntiBandingModeSelectorsKt;->auto()Lkotlin/jvm/functions/Function1;

    move-result-object v13

    aput-object v13, v5, v4

    .line 27
    invoke-static {}, Lio/fotoapparat/selector/AntiBandingModeSelectorsKt;->hz50()Lkotlin/jvm/functions/Function1;

    move-result-object v4

    aput-object v4, v5, v7

    .line 28
    invoke-static {}, Lio/fotoapparat/selector/AntiBandingModeSelectorsKt;->hz60()Lkotlin/jvm/functions/Function1;

    move-result-object v4

    aput-object v4, v5, v6

    .line 29
    invoke-static {}, Lio/fotoapparat/selector/AntiBandingModeSelectorsKt;->none()Lkotlin/jvm/functions/Function1;

    move-result-object v4

    aput-object v4, v5, v3

    .line 25
    invoke-static {v5}, Lio/fotoapparat/selector/SelectorsKt;->firstAvailable([Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;

    move-result-object v3

    goto :goto_6

    :cond_6
    move-object/from16 v3, p7

    :goto_6
    and-int/lit16 v4, v0, 0x80

    if-eqz v4, :cond_7

    .line 31
    move-object v4, v11

    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_7
    move-object/from16 v4, p8

    :goto_7
    and-int/lit16 v5, v0, 0x100

    if-eqz v5, :cond_8

    .line 32
    invoke-static {}, Lio/fotoapparat/selector/ResolutionSelectorsKt;->highestResolution()Lkotlin/jvm/functions/Function1;

    move-result-object v5

    goto :goto_8

    :cond_8
    move-object/from16 v5, p9

    :goto_8
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    .line 33
    invoke-static {}, Lio/fotoapparat/selector/ResolutionSelectorsKt;->highestResolution()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    goto :goto_9

    :cond_9
    move-object/from16 v0, p10

    :goto_9
    move-object p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v8

    move-object/from16 p5, v9

    move-object/from16 p6, v10

    move-object/from16 p7, v12

    move-object/from16 p8, v3

    move-object/from16 p9, v4

    move-object/from16 p10, v5

    move-object/from16 p11, v0

    invoke-direct/range {p1 .. p11}, Lio/fotoapparat/configuration/CameraConfiguration;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final builder()Lio/fotoapparat/configuration/CameraConfiguration$Builder;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lio/fotoapparat/configuration/CameraConfiguration;->Companion:Lio/fotoapparat/configuration/CameraConfiguration$Companion;

    invoke-virtual {v0}, Lio/fotoapparat/configuration/CameraConfiguration$Companion;->builder()Lio/fotoapparat/configuration/CameraConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lio/fotoapparat/configuration/CameraConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/fotoapparat/configuration/CameraConfiguration;
    .locals 10
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFlashMode()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFocusMode()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getJpegQuality()Lkotlin/jvm/functions/Function1;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getExposureCompensation()Lkotlin/jvm/functions/Function1;

    move-result-object v4

    goto :goto_3

    :cond_3
    move-object v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFrameProcessor()Lkotlin/jvm/functions/Function1;

    move-result-object v5

    goto :goto_4

    :cond_4
    move-object v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPreviewFpsRange()Lkotlin/jvm/functions/Function1;

    move-result-object v6

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getAntiBandingMode()Lkotlin/jvm/functions/Function1;

    move-result-object v7

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getSensorSensitivity()Lkotlin/jvm/functions/Function1;

    move-result-object v8

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPictureResolution()Lkotlin/jvm/functions/Function1;

    move-result-object v9

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPreviewResolution()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    goto :goto_9

    :cond_9
    move-object/from16 v0, p10

    :goto_9
    move-object p1, v1

    move-object p2, v2

    move-object p3, v3

    move-object p4, v4

    move-object p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v0

    invoke-virtual/range {p0 .. p10}, Lio/fotoapparat/configuration/CameraConfiguration;->copy(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/configuration/CameraConfiguration;

    move-result-object v0

    return-object v0
.end method

.method public static final default()Lio/fotoapparat/configuration/CameraConfiguration;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lio/fotoapparat/configuration/CameraConfiguration;->Companion:Lio/fotoapparat/configuration/CameraConfiguration$Companion;

    invoke-virtual {v0}, Lio/fotoapparat/configuration/CameraConfiguration$Companion;->default()Lio/fotoapparat/configuration/CameraConfiguration;

    move-result-object v0

    return-object v0
.end method

.method public static final standard()Lio/fotoapparat/configuration/CameraConfiguration;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lio/fotoapparat/configuration/CameraConfiguration;->Companion:Lio/fotoapparat/configuration/CameraConfiguration$Companion;

    invoke-virtual {v0}, Lio/fotoapparat/configuration/CameraConfiguration$Companion;->standard()Lio/fotoapparat/configuration/CameraConfiguration;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/Flash;",
            ">;",
            "Lio/fotoapparat/parameter/Flash;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFlashMode()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final component10()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPreviewResolution()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final component2()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFocusMode()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final component3()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/ranges/IntRange;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getJpegQuality()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final component4()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/ranges/IntRange;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getExposureCompensation()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final component5()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lio/fotoapparat/preview/Frame;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFrameProcessor()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final component6()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/FpsRange;",
            ">;",
            "Lio/fotoapparat/parameter/FpsRange;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPreviewFpsRange()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final component7()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getAntiBandingMode()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final component8()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getSensorSensitivity()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final component9()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPictureResolution()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final copy(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lio/fotoapparat/configuration/CameraConfiguration;
    .locals 12
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lkotlin/jvm/functions/Function1;
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
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;+",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/ranges/IntRange;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/ranges/IntRange;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/fotoapparat/preview/Frame;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/FpsRange;",
            ">;",
            "Lio/fotoapparat/parameter/FpsRange;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;+",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;)",
            "Lio/fotoapparat/configuration/CameraConfiguration;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "flashMode"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "focusMode"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jpegQuality"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exposureCompensation"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previewFpsRange"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "antiBandingMode"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pictureResolution"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previewResolution"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/fotoapparat/configuration/CameraConfiguration;

    move-object v1, v0

    move-object/from16 v6, p5

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v11}, Lio/fotoapparat/configuration/CameraConfiguration;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lio/fotoapparat/configuration/CameraConfiguration;

    if-eqz v0, :cond_0

    check-cast p1, Lio/fotoapparat/configuration/CameraConfiguration;

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFlashMode()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-virtual {p1}, Lio/fotoapparat/configuration/CameraConfiguration;->getFlashMode()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFocusMode()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-virtual {p1}, Lio/fotoapparat/configuration/CameraConfiguration;->getFocusMode()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getJpegQuality()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-virtual {p1}, Lio/fotoapparat/configuration/CameraConfiguration;->getJpegQuality()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getExposureCompensation()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-virtual {p1}, Lio/fotoapparat/configuration/CameraConfiguration;->getExposureCompensation()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFrameProcessor()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-virtual {p1}, Lio/fotoapparat/configuration/CameraConfiguration;->getFrameProcessor()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPreviewFpsRange()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-virtual {p1}, Lio/fotoapparat/configuration/CameraConfiguration;->getPreviewFpsRange()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getAntiBandingMode()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-virtual {p1}, Lio/fotoapparat/configuration/CameraConfiguration;->getAntiBandingMode()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getSensorSensitivity()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-virtual {p1}, Lio/fotoapparat/configuration/CameraConfiguration;->getSensorSensitivity()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPictureResolution()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-virtual {p1}, Lio/fotoapparat/configuration/CameraConfiguration;->getPictureResolution()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPreviewResolution()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-virtual {p1}, Lio/fotoapparat/configuration/CameraConfiguration;->getPreviewResolution()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public getAntiBandingMode()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 25
    iget-object v0, p0, Lio/fotoapparat/configuration/CameraConfiguration;->antiBandingMode:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public getExposureCompensation()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/ranges/IntRange;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 22
    iget-object v0, p0, Lio/fotoapparat/configuration/CameraConfiguration;->exposureCompensation:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public getFlashMode()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/Flash;",
            ">;",
            "Lio/fotoapparat/parameter/Flash;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 14
    iget-object v0, p0, Lio/fotoapparat/configuration/CameraConfiguration;->flashMode:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public getFocusMode()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 15
    iget-object v0, p0, Lio/fotoapparat/configuration/CameraConfiguration;->focusMode:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public getFrameProcessor()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lio/fotoapparat/preview/Frame;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 23
    iget-object v0, p0, Lio/fotoapparat/configuration/CameraConfiguration;->frameProcessor:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public getJpegQuality()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/ranges/IntRange;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 21
    iget-object v0, p0, Lio/fotoapparat/configuration/CameraConfiguration;->jpegQuality:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public getPictureResolution()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 32
    iget-object v0, p0, Lio/fotoapparat/configuration/CameraConfiguration;->pictureResolution:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public getPreviewFpsRange()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/FpsRange;",
            ">;",
            "Lio/fotoapparat/parameter/FpsRange;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 24
    iget-object v0, p0, Lio/fotoapparat/configuration/CameraConfiguration;->previewFpsRange:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public getPreviewResolution()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 33
    iget-object v0, p0, Lio/fotoapparat/configuration/CameraConfiguration;->previewResolution:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public getSensorSensitivity()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 31
    iget-object v0, p0, Lio/fotoapparat/configuration/CameraConfiguration;->sensorSensitivity:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFlashMode()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFocusMode()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getJpegQuality()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getExposureCompensation()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_3
    move v2, v1

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFrameProcessor()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_4

    :cond_4
    move v2, v1

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPreviewFpsRange()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_5

    :cond_5
    move v2, v1

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getAntiBandingMode()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_6

    :cond_6
    move v2, v1

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getSensorSensitivity()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_7

    :cond_7
    move v2, v1

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPictureResolution()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_8

    :cond_8
    move v2, v1

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPreviewResolution()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_9
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CameraConfiguration(flashMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFlashMode()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", focusMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFocusMode()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", jpegQuality="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getJpegQuality()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", exposureCompensation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getExposureCompensation()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", frameProcessor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getFrameProcessor()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", previewFpsRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPreviewFpsRange()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", antiBandingMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getAntiBandingMode()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sensorSensitivity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getSensorSensitivity()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pictureResolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPictureResolution()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", previewResolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/fotoapparat/configuration/CameraConfiguration;->getPreviewResolution()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method