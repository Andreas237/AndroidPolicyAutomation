.class Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl$1;
.super Ljava/lang/Object;
.source "ToneMappingBasedExposureControl.java"

# interfaces
.implements Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl;->setup(Lcom/scandit/base/camera/camera2/SbCamera2;Ljava/lang/Float;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl;

.field final synthetic val$camera:Lcom/scandit/base/camera/camera2/SbCamera2;

.field final synthetic val$targetBias:F


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl;Lcom/scandit/base/camera/camera2/SbCamera2;F)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl$1;->this$0:Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl;

    iput-object p2, p0, Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl$1;->val$camera:Lcom/scandit/base/camera/camera2/SbCamera2;

    iput p3, p0, Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl$1;->val$targetBias:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 4

    .line 127
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl$1;->val$camera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v0

    .line 128
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_COMPENSATION_RANGE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 129
    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Range;

    .line 130
    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_COMPENSATION_STEP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Rational;

    if-eqz v1, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    .line 137
    :cond_0
    invoke-virtual {v0}, Landroid/util/Rational;->floatValue()F

    move-result v0

    .line 138
    iget v2, p0, Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl$1;->val$targetBias:F

    .line 141
    invoke-virtual {v1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 142
    invoke-virtual {v1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 139
    invoke-static {v2, v0, v3, v1}, Lcom/scandit/base/camera/SbExposureUtils;->convertTargetBiasToExposureStep(FFII)I

    move-result v1

    int-to-float v2, v1

    mul-float/2addr v2, v0

    .line 145
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_EXPOSURE_COMPENSATION:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 146
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 145
    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    float-to-double v2, v2

    .line 147
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-float v0, v0

    .line 148
    iget-object v1, p0, Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl$1;->this$0:Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl;

    invoke-static {v1, v0}, Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl;->access$000(Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl;F)[F

    move-result-object v0

    .line 149
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->TONEMAP_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x0

    .line 150
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 149
    invoke-virtual {p1, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 151
    new-instance v1, Landroid/hardware/camera2/params/TonemapCurve;

    invoke-direct {v1, v0, v0, v0}, Landroid/hardware/camera2/params/TonemapCurve;-><init>([F[F[F)V

    .line 152
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->TONEMAP_CURVE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method
