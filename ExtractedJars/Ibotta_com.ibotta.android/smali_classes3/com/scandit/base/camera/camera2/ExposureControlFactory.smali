.class Lcom/scandit/base/camera/camera2/ExposureControlFactory;
.super Ljava/lang/Object;
.source "ExposureControlFactory.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Landroid/hardware/camera2/CameraCharacteristics;)Lcom/scandit/base/camera/camera2/ExposureControl;
    .locals 0

    .line 15
    invoke-static {p0}, Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl;->isSupported(Landroid/hardware/camera2/CameraCharacteristics;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 16
    new-instance p0, Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl;

    invoke-direct {p0}, Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl;-><init>()V

    return-object p0

    .line 18
    :cond_0
    new-instance p0, Lcom/scandit/base/camera/camera2/DefaultExposureControl;

    invoke-direct {p0}, Lcom/scandit/base/camera/camera2/DefaultExposureControl;-><init>()V

    return-object p0
.end method
