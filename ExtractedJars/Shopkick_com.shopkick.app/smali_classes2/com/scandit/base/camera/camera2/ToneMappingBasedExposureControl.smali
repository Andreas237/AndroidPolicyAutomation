.class Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl;
.super Ljava/lang/Object;
.source "ToneMappingBasedExposureControl.java"

# interfaces
.implements Lcom/scandit/base/camera/camera2/ExposureControl;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl;F)[F
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl;->getRemappedGammaCurve(F)[F

    move-result-object p0

    return-object p0
.end method

.method private getRemappedGammaCurve(F)[F
    .locals 17

    .line 72
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "HUAWEI VNS-L31"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const v1, 0x3e4ccccd    # 0.2f

    const/4 v2, 0x6

    const v3, 0x3ecce704    # 0.4002f

    const/4 v4, 0x5

    const v5, 0x3e087fcc    # 0.1333f

    const/4 v6, 0x4

    const v7, 0x3e958106    # 0.292f

    const/4 v8, 0x3

    const v9, 0x3d889a02    # 0.0667f

    const/4 v10, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/16 v13, 0x20

    const/4 v14, 0x0

    const/high16 v15, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    const/16 v0, 0x22

    .line 74
    new-array v0, v0, [F

    mul-float v16, p1, v14

    aput v16, v0, v12

    aput v14, v0, v11

    mul-float v9, v9, p1

    aput v9, v0, v10

    aput v7, v0, v8

    mul-float v5, v5, p1

    aput v5, v0, v6

    aput v3, v0, v4

    mul-float v1, v1, p1

    aput v1, v0, v2

    const/4 v1, 0x7

    const v2, 0x3ef65fd9    # 0.4812f

    aput v2, v0, v1

    const/16 v1, 0x8

    const v2, 0x3e888ce7    # 0.2667f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0x9

    const v2, 0x3f0c63f1    # 0.5484f

    aput v2, v0, v1

    const/16 v1, 0xa

    const v2, 0x3eaaa64c    # 0.3333f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0xb

    const v2, 0x3f1b5dcc    # 0.6069f

    aput v2, v0, v1

    const/16 v1, 0xc

    const v2, 0x3ecccccd    # 0.4f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0xd

    const v2, 0x3f28ce70    # 0.6594f

    aput v2, v0, v1

    const/16 v1, 0xe

    const v2, 0x3eeef34d    # 0.4667f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0xf

    const v2, 0x3f350b0f    # 0.7072f

    aput v2, v0, v1

    const/16 v1, 0x10

    const v2, 0x3f088659    # 0.5333f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0x11

    const v2, 0x3f40624e    # 0.7515f

    aput v2, v0, v1

    const/16 v1, 0x12

    const v2, 0x3f19999a    # 0.6f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0x13

    const v2, 0x3f4af4f1    # 0.7928f

    aput v2, v0, v1

    const/16 v1, 0x14

    const v2, 0x3f2aacda    # 0.6667f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0x15

    const v2, 0x3f54ea4b    # 0.8317f

    aput v2, v0, v1

    const/16 v1, 0x16

    const v2, 0x3f3bb98c    # 0.7333f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0x17

    const v2, 0x3f5e5604    # 0.8685f

    aput v2, v0, v1

    const/16 v1, 0x18

    const v2, 0x3f4ccccd    # 0.8f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0x19

    const v2, 0x3f674bc7    # 0.9035f

    aput v2, v0, v1

    const/16 v1, 0x1a

    const v2, 0x3f5de00d    # 0.8667f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0x1b

    const v2, 0x3f6fdf3b    # 0.937f

    aput v2, v0, v1

    const/16 v1, 0x1c

    const v2, 0x3f6eecc0    # 0.9333f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0x1d

    const v2, 0x3f7816f0    # 0.9691f

    aput v2, v0, v1

    const/16 v1, 0x1e

    mul-float v2, p1, v15

    aput v2, v0, v1

    const/16 v1, 0x1f

    aput v15, v0, v1

    aput v15, v0, v13

    const/16 v1, 0x21

    aput v15, v0, v1

    return-object v0

    .line 99
    :cond_0
    new-array v0, v13, [F

    mul-float v13, p1, v14

    aput v13, v0, v12

    aput v14, v0, v11

    mul-float v9, v9, p1

    aput v9, v0, v10

    aput v7, v0, v8

    mul-float v5, v5, p1

    aput v5, v0, v6

    aput v3, v0, v4

    mul-float v1, v1, p1

    aput v1, v0, v2

    const/4 v1, 0x7

    const v2, 0x3ef65fd9    # 0.4812f

    aput v2, v0, v1

    const/16 v1, 0x8

    const v2, 0x3e888ce7    # 0.2667f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0x9

    const v2, 0x3f0c63f1    # 0.5484f

    aput v2, v0, v1

    const/16 v1, 0xa

    const v2, 0x3eaaa64c    # 0.3333f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0xb

    const v2, 0x3f1b5dcc    # 0.6069f

    aput v2, v0, v1

    const/16 v1, 0xc

    const v2, 0x3ecccccd    # 0.4f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0xd

    const v2, 0x3f28ce70    # 0.6594f

    aput v2, v0, v1

    const/16 v1, 0xe

    const v2, 0x3eeef34d    # 0.4667f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0xf

    const v2, 0x3f350b0f    # 0.7072f

    aput v2, v0, v1

    const/16 v1, 0x10

    const v2, 0x3f088659    # 0.5333f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0x11

    const v2, 0x3f40624e    # 0.7515f

    aput v2, v0, v1

    const/16 v1, 0x12

    const v2, 0x3f19999a    # 0.6f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0x13

    const v2, 0x3f4af4f1    # 0.7928f

    aput v2, v0, v1

    const/16 v1, 0x14

    const v2, 0x3f2aacda    # 0.6667f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0x15

    const v2, 0x3f54ea4b    # 0.8317f

    aput v2, v0, v1

    const/16 v1, 0x16

    const v2, 0x3f3bb98c    # 0.7333f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0x17

    const v2, 0x3f5e5604    # 0.8685f

    aput v2, v0, v1

    const/16 v1, 0x18

    const v2, 0x3f4ccccd    # 0.8f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0x19

    const v2, 0x3f674bc7    # 0.9035f

    aput v2, v0, v1

    const/16 v1, 0x1a

    const v2, 0x3f5de00d    # 0.8667f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0x1b

    const v2, 0x3f6fdf3b    # 0.937f

    aput v2, v0, v1

    const/16 v1, 0x1c

    const v2, 0x3f6eecc0    # 0.9333f

    mul-float v2, v2, p1

    aput v2, v0, v1

    const/16 v1, 0x1d

    const v2, 0x3f7816f0    # 0.9691f

    aput v2, v0, v1

    const/16 v1, 0x1e

    mul-float v2, p1, v15

    aput v2, v0, v1

    const/16 v1, 0x1f

    aput v15, v0, v1

    return-object v0
.end method

.method static isSupported(Landroid/hardware/camera2/CameraCharacteristics;)Z
    .locals 3

    .line 47
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_COMPENSATION_RANGE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 48
    invoke-virtual {p0, v0}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Range;

    .line 49
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_COMPENSATION_STEP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Rational;

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    if-nez v1, :cond_0

    goto :goto_1

    .line 55
    :cond_0
    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v2

    .line 67
    :cond_2
    invoke-static {p0}, Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl;->supportsCurveBasedToneMapping(Landroid/hardware/camera2/CameraCharacteristics;)Z

    move-result p0

    return p0

    :cond_3
    :goto_0
    return v2

    :cond_4
    :goto_1
    return v2
.end method

.method private static supportsCurveBasedToneMapping(Landroid/hardware/camera2/CameraCharacteristics;)Z
    .locals 4

    .line 29
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->TONEMAP_AVAILABLE_TONE_MAP_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, v0}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 33
    :cond_0
    array-length v1, p0

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_2

    aget v3, p0, v2

    if-nez v3, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method


# virtual methods
.method public onCaptureRequestApplied(Landroid/hardware/camera2/CaptureRequest;J)V
    .locals 0

    return-void
.end method

.method public onImageAvailable(Lcom/scandit/base/camera/camera2/SbCamera2;JLjava/nio/ByteBuffer;IILandroid/hardware/camera2/TotalCaptureResult;)V
    .locals 0

    return-void
.end method

.method public setup(Lcom/scandit/base/camera/camera2/SbCamera2;Ljava/lang/Float;)V
    .locals 1

    .line 121
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS7(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    goto :goto_0

    :cond_0
    const/high16 v0, -0x40000000    # -2.0f

    :goto_0
    if-eqz p2, :cond_1

    .line 123
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result v0

    .line 124
    :cond_1
    new-instance p2, Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl$1;

    invoke-direct {p2, p0, p1, v0}, Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl$1;-><init>(Lcom/scandit/base/camera/camera2/ToneMappingBasedExposureControl;Lcom/scandit/base/camera/camera2/SbCamera2;F)V

    invoke-virtual {p1, p2}, Lcom/scandit/base/camera/camera2/SbCamera2;->modifyCaptureRequestAsync(Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)V

    return-void
.end method
