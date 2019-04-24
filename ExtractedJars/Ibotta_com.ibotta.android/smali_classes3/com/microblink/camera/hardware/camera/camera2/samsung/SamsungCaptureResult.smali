.class public Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungCaptureResult;
.super Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungCameraMetadata;


# static fields
.field public static final LENS_OPTICAL_STABILIZATION_OPERATION_MODE:Landroid/hardware/camera2/CaptureResult$Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/hardware/camera2/CaptureResult$Key<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final METERING_MODE:Landroid/hardware/camera2/CaptureResult$Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/hardware/camera2/CaptureResult$Key<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final PHASE_AF_MODE:Landroid/hardware/camera2/CaptureResult$Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/hardware/camera2/CaptureResult$Key<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "samsung.android.control.meteringMode"

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->createCaptureResultKey(Ljava/lang/String;Ljava/lang/Class;)Landroid/hardware/camera2/CaptureResult$Key;

    move-result-object v0

    sput-object v0, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungCaptureResult;->METERING_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    const-string v0, "samsung.android.control.pafMode"

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->createCaptureResultKey(Ljava/lang/String;Ljava/lang/Class;)Landroid/hardware/camera2/CaptureResult$Key;

    move-result-object v0

    sput-object v0, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungCaptureResult;->PHASE_AF_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    const-string v0, "samsung.android.lens.opticalStabilizationOperationMode"

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->createCaptureResultKey(Ljava/lang/String;Ljava/lang/Class;)Landroid/hardware/camera2/CaptureResult$Key;

    move-result-object v0

    sput-object v0, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungCaptureResult;->LENS_OPTICAL_STABILIZATION_OPERATION_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungCameraMetadata;-><init>()V

    return-void
.end method
