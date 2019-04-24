.class public Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungCameraCharacteristics;
.super Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungCameraMetadata;


# static fields
.field public static final LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION_OPERATION_MODE:Landroid/hardware/camera2/CameraCharacteristics$Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/hardware/camera2/CameraCharacteristics$Key<",
            "[I>;"
        }
    .end annotation
.end field

.field public static final METERING_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/hardware/camera2/CameraCharacteristics$Key<",
            "[I>;"
        }
    .end annotation
.end field

.field public static final PHASE_AF_INFO_AVAILABLE:Landroid/hardware/camera2/CameraCharacteristics$Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/hardware/camera2/CameraCharacteristics$Key<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "samsung.android.control.meteringAvailableMode"

    const-class v1, [I

    invoke-static {v0, v1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->createCameraCharacteristicsKey(Ljava/lang/String;Ljava/lang/Class;)Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-result-object v0

    sput-object v0, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungCameraCharacteristics;->METERING_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    const-string v0, "samsung.android.control.pafAvailableMode"

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->createCameraCharacteristicsKey(Ljava/lang/String;Ljava/lang/Class;)Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-result-object v0

    sput-object v0, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungCameraCharacteristics;->PHASE_AF_INFO_AVAILABLE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    const-string v0, "samsung.android.lens.info.availableOpticalStabilizationOperationMode"

    const-class v1, [I

    invoke-static {v0, v1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->createCameraCharacteristicsKey(Ljava/lang/String;Ljava/lang/Class;)Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-result-object v0

    sput-object v0, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungCameraCharacteristics;->LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION_OPERATION_MODE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungCameraMetadata;-><init>()V

    return-void
.end method
