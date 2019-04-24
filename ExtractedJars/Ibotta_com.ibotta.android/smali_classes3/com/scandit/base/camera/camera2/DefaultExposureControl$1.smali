.class Lcom/scandit/base/camera/camera2/DefaultExposureControl$1;
.super Ljava/lang/Object;
.source "DefaultExposureControl.java"

# interfaces
.implements Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/camera2/DefaultExposureControl;->setup(Lcom/scandit/base/camera/camera2/SbCamera2;Ljava/lang/Float;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/camera2/DefaultExposureControl;

.field final synthetic val$actualTargetBias:F

.field final synthetic val$camera:Lcom/scandit/base/camera/camera2/SbCamera2;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/camera2/DefaultExposureControl;Lcom/scandit/base/camera/camera2/SbCamera2;F)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/DefaultExposureControl$1;->this$0:Lcom/scandit/base/camera/camera2/DefaultExposureControl;

    iput-object p2, p0, Lcom/scandit/base/camera/camera2/DefaultExposureControl$1;->val$camera:Lcom/scandit/base/camera/camera2/SbCamera2;

    iput p3, p0, Lcom/scandit/base/camera/camera2/DefaultExposureControl$1;->val$actualTargetBias:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 4

    .line 28
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/DefaultExposureControl$1;->val$camera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v0

    .line 29
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_COMPENSATION_RANGE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 30
    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Range;

    .line 31
    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_COMPENSATION_STEP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Rational;

    if-eqz v1, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v0}, Landroid/util/Rational;->floatValue()F

    move-result v0

    .line 39
    iget v2, p0, Lcom/scandit/base/camera/camera2/DefaultExposureControl$1;->val$actualTargetBias:F

    .line 42
    invoke-virtual {v1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 43
    invoke-virtual {v1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 40
    invoke-static {v2, v0, v3, v1}, Lcom/scandit/base/camera/SbExposureUtils;->convertTargetBiasToExposureStep(FFII)I

    move-result v0

    .line 44
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_EXPOSURE_COMPENSATION:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 45
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 44
    invoke-virtual {p1, v1, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method
