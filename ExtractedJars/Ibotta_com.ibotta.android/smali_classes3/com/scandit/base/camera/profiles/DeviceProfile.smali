.class public abstract Lcom/scandit/base/camera/profiles/DeviceProfile;
.super Ljava/lang/Object;
.source "DeviceProfile.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;
    }
.end annotation


# static fields
.field private static final DEFAULT_CONINUOUS_NO_METERING_PROFILE:Ljava/lang/String; = "scandit-default-continuous-custom_metering_disabled"

.field private static final DEFAULT_CONINUOUS_PROFILE:Ljava/lang/String; = "scandit-default-continuous"

.field public static FORCE_SURFACE_VIEW:Z = false

.field public static FORCE_TEXTURE_VIEW:Z = false


# instance fields
.field private mBackCamera:I

.field private mCustomMeteringAndFocusAreaSupported:Z

.field private mDisableContinuous:Z

.field private mDisableMacro:Z

.field private mDisableTorch:Z

.field private mFrontCamera:I

.field private mIsTablet:Z

.field private mMinExposureTargetBias:F

.field private mRequiresCameraRestartOnTorchSwitch:Z

.field private mUseTextureView:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 62
    new-instance v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;

    invoke-direct {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;)V
    .locals 4

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 51
    iput-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mIsTablet:Z

    .line 52
    iput-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableTorch:Z

    .line 53
    iput-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableContinuous:Z

    .line 54
    iput-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableMacro:Z

    .line 55
    iput-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mRequiresCameraRestartOnTorchSwitch:Z

    const/4 v1, 0x0

    .line 56
    iput v1, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mMinExposureTargetBias:F

    const/4 v1, 0x1

    .line 57
    iput-boolean v1, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mCustomMeteringAndFocusAreaSupported:Z

    .line 66
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-lt v2, v3, :cond_0

    .line 67
    invoke-direct {p0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isCyanogenMod()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mUseTextureView:Z

    .line 68
    invoke-static {}, Lcom/scandit/base/camera/profiles/DeviceProfile;->getFirstFrontCamera()I

    move-result v0

    iput v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mFrontCamera:I

    .line 69
    invoke-static {}, Lcom/scandit/base/camera/profiles/DeviceProfile;->getFirstBackCamera()I

    move-result v0

    iput v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mBackCamera:I

    .line 70
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isTabletDevice(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mIsTablet:Z

    .line 71
    iget-boolean p1, p2, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableTorch:Z

    iput-boolean p1, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableTorch:Z

    .line 72
    iget-boolean p1, p2, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableContinuous:Z

    iput-boolean p1, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableContinuous:Z

    .line 73
    iget-boolean p1, p2, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableMacro:Z

    iput-boolean p1, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableMacro:Z

    .line 74
    iget p1, p2, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->minExposureTargetBias:F

    iput p1, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mMinExposureTargetBias:F

    .line 75
    iget-boolean p1, p2, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->customMeteringAreaSupported:Z

    iput-boolean p1, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mCustomMeteringAndFocusAreaSupported:Z

    .line 76
    iget-boolean p1, p2, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->requiresRestartOnTorchSwitch:Z

    iput-boolean p1, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mRequiresCameraRestartOnTorchSwitch:Z

    return-void
.end method

.method public static create(Landroid/content/Context;Ljava/lang/String;)Lcom/scandit/base/camera/profiles/DeviceProfile;
    .locals 4

    .line 124
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "samsung-"

    const-string v1, ""

    .line 125
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 126
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-string v0, "sm-t320"

    .line 129
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 130
    new-instance p1, Lcom/scandit/base/camera/profiles/GalaxyTabProProfile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/GalaxyTabProProfile;-><init>(Landroid/content/Context;)V

    return-object p1

    :cond_0
    const-string v0, "sm-t365"

    .line 132
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 133
    new-instance p1, Lcom/scandit/base/camera/profiles/GalaxyActiveTabProfile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/GalaxyActiveTabProfile;-><init>(Landroid/content/Context;)V

    return-object p1

    :cond_1
    const-string v0, "sm-g388"

    .line 136
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 137
    new-instance p1, Lcom/scandit/base/camera/profiles/Xcover3Profile;

    const/4 v0, -0x2

    invoke-direct {p1, p0, v0}, Lcom/scandit/base/camera/profiles/Xcover3Profile;-><init>(Landroid/content/Context;I)V

    return-object p1

    :cond_2
    const-string v0, "i9000"

    .line 140
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 141
    new-instance p1, Lcom/scandit/base/camera/profiles/Xcover3Profile;

    const/4 v0, -0x1

    invoke-direct {p1, p0, v0}, Lcom/scandit/base/camera/profiles/Xcover3Profile;-><init>(Landroid/content/Context;I)V

    return-object p1

    .line 143
    :cond_3
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS5Like(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 144
    new-instance p1, Lcom/scandit/base/camera/profiles/GalaxySxProfile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/GalaxySxProfile;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 146
    :cond_4
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyCorePlus(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 147
    new-instance p1, Lcom/scandit/base/camera/profiles/GalaxyCorePlusProfile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/GalaxyCorePlusProfile;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 149
    :cond_5
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGlass(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 150
    new-instance v0, Lcom/scandit/base/camera/profiles/GlassProfile;

    invoke-direct {v0, p0, p1}, Lcom/scandit/base/camera/profiles/GlassProfile;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0

    .line 152
    :cond_6
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isNexus5(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1c

    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isNexus6P(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto/16 :goto_5

    .line 155
    :cond_7
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS6Edge(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 156
    new-instance v0, Lcom/scandit/base/camera/profiles/GalaxyS6EdgeProfile;

    invoke-direct {v0, p0, p1}, Lcom/scandit/base/camera/profiles/GalaxyS6EdgeProfile;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0

    .line 158
    :cond_8
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS7(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 159
    new-instance v0, Lcom/scandit/base/camera/profiles/GalaxyS7Profile;

    invoke-direct {v0, p0, p1}, Lcom/scandit/base/camera/profiles/GalaxyS7Profile;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0

    .line 161
    :cond_9
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS7Active(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 162
    new-instance v0, Lcom/scandit/base/camera/profiles/GalaxyS7ActiveProfile;

    invoke-direct {v0, p0, p1}, Lcom/scandit/base/camera/profiles/GalaxyS7ActiveProfile;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0

    .line 164
    :cond_a
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS8(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 165
    new-instance v0, Lcom/scandit/base/camera/profiles/GalaxyS8Profile;

    invoke-direct {v0, p0, p1}, Lcom/scandit/base/camera/profiles/GalaxyS8Profile;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0

    .line 167
    :cond_b
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyJ3(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 168
    new-instance p1, Lcom/scandit/base/camera/profiles/GalaxyJ3Profile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/GalaxyJ3Profile;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 170
    :cond_c
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyY(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 171
    new-instance p1, Lcom/scandit/base/camera/profiles/GalaxyYProfile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/GalaxyYProfile;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 173
    :cond_d
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyNote8(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 174
    new-instance v0, Lcom/scandit/base/camera/profiles/GalaxyNote8Profile;

    invoke-direct {v0, p0, p1}, Lcom/scandit/base/camera/profiles/GalaxyNote8Profile;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0

    :cond_e
    const-string v0, "m100"

    .line 176
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 177
    new-instance p1, Lcom/scandit/base/camera/profiles/VuzixProfile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/VuzixProfile;-><init>(Landroid/content/Context;)V

    return-object p1

    :cond_f
    const-string v0, "moto g (4)"

    .line 179
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    const-string v0, "motog3"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    goto/16 :goto_4

    .line 182
    :cond_10
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isIntegra2(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 183
    new-instance p1, Lcom/scandit/base/camera/profiles/Integra2Profile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/Integra2Profile;-><init>(Landroid/content/Context;)V

    return-object p1

    :cond_11
    const-string v0, "scandit-phase_af"

    .line 186
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    const-string v0, "scandit-phase_af-initial_trigger"

    .line 187
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    goto/16 :goto_3

    .line 192
    :cond_12
    new-instance v0, Lcom/scandit/base/camera/profiles/StandardProfile$Settings;

    invoke-direct {v0}, Lcom/scandit/base/camera/profiles/StandardProfile$Settings;-><init>()V

    const-string v1, "gt-p1000"

    .line 193
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_14

    const-string v1, "htc one x"

    .line 194
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    const-string v1, "sm-g355"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_13

    goto :goto_0

    :cond_13
    const/4 v1, 0x0

    goto :goto_1

    :cond_14
    :goto_0
    const/4 v1, 0x1

    :goto_1
    iput-boolean v1, v0, Lcom/scandit/base/camera/profiles/StandardProfile$Settings;->disableTorch:Z

    .line 197
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isXperiaZ5(Ljava/lang/String;)Z

    move-result v1

    xor-int/2addr v1, v2

    iput-boolean v1, v0, Lcom/scandit/base/camera/profiles/StandardProfile$Settings;->disableContinuous:Z

    .line 201
    iput-boolean v2, v0, Lcom/scandit/base/camera/profiles/StandardProfile$Settings;->disableMacro:Z

    .line 203
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS3(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_15

    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS4(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_15

    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS5Like(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_15

    .line 204
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS6(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_16

    :cond_15
    const/high16 v1, -0x40800000    # -1.0f

    .line 206
    iput v1, v0, Lcom/scandit/base/camera/profiles/StandardProfile$Settings;->minExposureTargetBias:F

    .line 208
    :cond_16
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyJ5(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_17

    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isNexus4(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_17

    .line 209
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyNote5(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_17

    goto :goto_2

    :cond_17
    const/4 v2, 0x0

    :goto_2
    iput-boolean v2, v0, Lcom/scandit/base/camera/profiles/StandardProfile$Settings;->customMeteringAreaSupported:Z

    .line 210
    iput-boolean v3, v0, Lcom/scandit/base/camera/profiles/StandardProfile$Settings;->requiresRestartOnTorchSwitch:Z

    .line 211
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyJ5(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/scandit/base/camera/profiles/StandardProfile$Settings;->useFpsRangeWithBiggestSpread:Z

    const-string v1, "scandit-default-continuous"

    .line 212
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 213
    iput-boolean v3, v0, Lcom/scandit/base/camera/profiles/StandardProfile$Settings;->disableContinuous:Z

    :cond_18
    const-string v1, "scandit-default-continuous-custom_metering_disabled"

    .line 215
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_19

    .line 216
    iput-boolean v3, v0, Lcom/scandit/base/camera/profiles/StandardProfile$Settings;->customMeteringAreaSupported:Z

    .line 218
    :cond_19
    new-instance p1, Lcom/scandit/base/camera/profiles/StandardProfile;

    invoke-direct {p1, p0, v0}, Lcom/scandit/base/camera/profiles/StandardProfile;-><init>(Landroid/content/Context;Lcom/scandit/base/camera/profiles/StandardProfile$Settings;)V

    return-object p1

    .line 189
    :cond_1a
    :goto_3
    new-instance v0, Lcom/scandit/base/camera/profiles/PhaseAfProfile;

    invoke-direct {v0, p0, p1}, Lcom/scandit/base/camera/profiles/PhaseAfProfile;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0

    .line 180
    :cond_1b
    :goto_4
    new-instance p1, Lcom/scandit/base/camera/profiles/MotoGxProfile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/MotoGxProfile;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 153
    :cond_1c
    :goto_5
    new-instance p1, Lcom/scandit/base/camera/profiles/Nexus5Profile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/Nexus5Profile;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method private static getFirstBackCamera()I
    .locals 3

    .line 446
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 449
    :try_start_0
    new-instance v2, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v2}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 450
    invoke-static {v1, v2}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 451
    iget v2, v2, Landroid/hardware/Camera$CameraInfo;->facing:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v2, :cond_0

    return v1

    :catch_0
    move-exception v2

    .line 455
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method private static getFirstFrontCamera()I
    .locals 4

    .line 428
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 431
    :try_start_0
    new-instance v2, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v2}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 432
    invoke-static {v1, v2}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 433
    iget v2, v2, Landroid/hardware/Camera$CameraInfo;->facing:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    return v1

    :catch_0
    move-exception v2

    .line 437
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method private isCyanogenMod()Z
    .locals 2

    const-string v0, "os.version"

    .line 111
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "cyanogenmod"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Landroid/os/Build;->HOST:Ljava/lang/String;

    const-string v1, "cyanogenmod"

    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private static isGalaxyCorePlus(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "sm-g350"

    .line 369
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isGalaxyJ3(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "sm-j3109"

    .line 252
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sm-j320"

    .line 253
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static isGalaxyJ5(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "sm-j50"

    .line 248
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sm-j51"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static isGalaxyJ7(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "sm-j70"

    .line 228
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sm-g3508"

    .line 229
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sm-j71"

    .line 230
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static isGalaxyNote5(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "sm-n920"

    .line 361
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static isGalaxyNote8(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "sm-n950"

    .line 365
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isGalaxyNoteOne(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "gt-n7000"

    .line 541
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gt-n7005"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "shv-e160"

    .line 542
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sgh-i717"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sc-05d"

    .line 543
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sgh-t879"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gt-i9220"

    .line 544
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gt-i9228"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sch-i889"

    .line 545
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static isGalaxyS3(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "sgh-t999"

    .line 279
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sch-i535"

    .line 280
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sph-l710t"

    .line 281
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sgh-i748"

    .line 282
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gravity"

    .line 283
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sch-l710"

    .line 284
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sph-l710"

    .line 285
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sc-06d"

    .line 286
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gravityquad"

    .line 287
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "shv-e210s"

    .line 288
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sch-r530m"

    .line 289
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gt-i9300t"

    .line 290
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "shv-e210k"

    .line 291
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gt-i9300"

    .line 292
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sch-s968c"

    .line 293
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gt-i9305"

    .line 294
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sgh-t999n"

    .line 295
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "shv-e210l"

    .line 296
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sch-i939"

    .line 297
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sgh-t999v"

    .line 298
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sch-r530c"

    .line 299
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sc-03e"

    .line 300
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sch-s960l"

    .line 301
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sgh-t999l"

    .line 302
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sch-r530u"

    .line 303
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sgh-i747m"

    .line 304
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gt-i9308"

    .line 305
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gt-i9305t"

    .line 306
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sch-i939d"

    .line 307
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sch-r530x"

    .line 308
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sgh-i747"

    .line 309
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "shw-m440s"

    .line 310
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sch-i535pp"

    .line 311
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gt-i9305n"

    .line 312
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static isGalaxyS4(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "gt-i9500"

    .line 317
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gt-i9502"

    .line 318
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gt-i9505"

    .line 319
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sc-04e"

    .line 320
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sch-i545"

    .line 321
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sch-i959"

    .line 322
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sch-r970"

    .line 323
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sgh-i337"

    .line 324
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sgh-m919"

    .line 325
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "shv-e300k"

    .line 326
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "shv-e300s"

    .line 327
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sph-l720"

    .line 328
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static isGalaxyS5(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "sm-g900"

    .line 333
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gt-i9600"

    .line 334
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static isGalaxyS5Like(Ljava/lang/String;)Z
    .locals 1

    .line 338
    invoke-static {p0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS5(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sm-g870"

    .line 340
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sm-g800"

    .line 342
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static isGalaxyS6(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "sm-g925"

    .line 346
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sm-g920"

    .line 347
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "scv31"

    .line 348
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "404sc"

    .line 349
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sm-g890a"

    .line 350
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static isGalaxyS6Edge(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "sm-g925"

    .line 354
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "404sc"

    .line 355
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sm-g928"

    .line 356
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sm-g987"

    .line 357
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static isGalaxyS7(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "sm-g930"

    .line 239
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sm-g935"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sm-g891"

    .line 240
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static isGalaxyS7Active(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "sm-g891a"

    .line 244
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isGalaxyS8(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "sm-g950"

    .line 234
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sm-g955"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sm-g892"

    .line 235
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static isGalaxyY(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "gt-s536"

    .line 373
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static isGlass(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "glass"

    .line 377
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static isHuaweiP9Lite(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "huawei vns-l31"

    .line 667
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static isIntegra2(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "scanpal eda50"

    .line 222
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static isNexus4(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "nexus 4"

    .line 225
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static isNexus5(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "nexus 5"

    .line 266
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static isNexus6(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "nexus 6"

    .line 275
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static isNexus6P(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "nexus 6p"

    .line 270
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static isTabletDevice(Landroid/content/Context;)Z
    .locals 4

    .line 464
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v0, v0, 0xf

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x3

    if-lt v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 471
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    const-string v3, "window"

    .line 473
    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/WindowManager;

    .line 474
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 477
    iget p0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    const/16 v3, 0xf0

    if-eq p0, v3, :cond_1

    iget p0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    const/16 v3, 0xa0

    if-eq p0, v3, :cond_1

    iget p0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    const/16 v3, 0xd5

    if-eq p0, v3, :cond_1

    iget p0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    const/16 v0, 0x140

    if-ne p0, v0, :cond_2

    :cond_1
    return v1

    :cond_2
    return v2
.end method

.method private static isXperiaZ5(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "501so"

    .line 257
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "e6603"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "e6653"

    .line 258
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "so-01h"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sov32"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "e5803"

    .line 259
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "e5823"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "so-02h"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "e6853"

    .line 260
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "so-03h"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "e6833"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "e6883"

    .line 261
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "e6633"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "e6683"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V
    .locals 3

    .line 632
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getMinExposureCompensation()I

    move-result v0

    .line 633
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getMaxExposureCompensation()I

    move-result v1

    .line 634
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getExposureCompensationStep()F

    move-result v2

    .line 636
    invoke-static {p1, v2, v0, v1}, Lcom/scandit/base/camera/SbExposureUtils;->convertTargetBiasToExposureStep(FFII)I

    move-result p1

    .line 640
    invoke-virtual {p0, p1}, Landroid/hardware/Camera$Parameters;->setExposureCompensation(I)V

    return-void
.end method

.method protected static setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V
    .locals 7

    .line 564
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewFpsRange()Ljava/util/List;

    move-result-object v0

    .line 565
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 569
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    .line 570
    aget v5, v2, v4

    if-le v5, p1, :cond_2

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    .line 573
    aget v5, v2, v4

    aget v6, v1, v4

    if-gt v5, v6, :cond_3

    aget v5, v2, v4

    aget v4, v1, v4

    if-ne v5, v4, :cond_1

    aget v4, v2, v3

    aget v3, v1, v3

    if-le v4, v3, :cond_1

    :cond_3
    move-object v1, v2

    goto :goto_0

    :cond_4
    if-eqz v1, :cond_6

    if-eqz p2, :cond_5

    .line 580
    aget p1, v1, v4

    aget p2, v1, v4

    invoke-virtual {p0, p1, p2}, Landroid/hardware/Camera$Parameters;->setPreviewFpsRange(II)V

    goto :goto_1

    .line 582
    :cond_5
    aget p1, v1, v3

    aget p2, v1, v4

    invoke-virtual {p0, p1, p2}, Landroid/hardware/Camera$Parameters;->setPreviewFpsRange(II)V

    :cond_6
    :goto_1
    return-void
.end method

.method protected static setPreviewFrameRateWithBiggestSpread(Landroid/hardware/Camera$Parameters;I)V
    .locals 7

    .line 600
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewFpsRange()Ljava/util/List;

    move-result-object v0

    .line 601
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 605
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    .line 606
    aget v5, v2, v4

    if-le v5, p1, :cond_2

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    .line 609
    aget v5, v2, v4

    aget v6, v1, v4

    if-gt v5, v6, :cond_3

    aget v5, v2, v4

    aget v4, v1, v4

    if-ne v5, v4, :cond_1

    aget v4, v2, v3

    aget v3, v1, v3

    if-ge v4, v3, :cond_1

    :cond_3
    move-object v1, v2

    goto :goto_0

    :cond_4
    if-eqz v1, :cond_5

    .line 615
    aget p1, v1, v3

    aget v0, v1, v4

    invoke-virtual {p0, p1, v0}, Landroid/hardware/Camera$Parameters;->setPreviewFpsRange(II)V

    :cond_5
    return-void
.end method

.method public static shouldUseCamera2APIByDefault()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public adjustSettings(Lcom/scandit/barcodepicker/ScanSettings;)V
    .locals 0

    return-void
.end method

.method public createDefaultResolutionStrategy()Lcom/scandit/base/camera/resolution/SbResolutionStrategy;
    .locals 1

    .line 104
    new-instance v0, Lcom/scandit/base/camera/resolution/SbLegacyResolutionStrategy;

    invoke-direct {v0}, Lcom/scandit/base/camera/resolution/SbLegacyResolutionStrategy;-><init>()V

    return-object v0
.end method

.method public getBackCamera()I
    .locals 1

    .line 395
    iget v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mBackCamera:I

    return v0
.end method

.method public getContinuousFocusModeString()Ljava/lang/String;
    .locals 2

    .line 673
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    const-string v0, "continuous-picture"

    return-object v0

    :cond_0
    const-string v0, "continuous-video"

    return-object v0
.end method

.method public getFlashModeForTorch(Landroid/hardware/Camera$Parameters;)Ljava/lang/String;
    .locals 1

    .line 494
    iget-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableTorch:Z

    if-eqz v0, :cond_0

    const-string p1, "off"

    return-object p1

    .line 498
    :cond_0
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string v0, "torch"

    .line 500
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "on"

    .line 501
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    const-string v0, "torch"

    .line 502
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "torch"

    return-object p1

    :cond_2
    const-string p1, "on"

    return-object p1

    :cond_3
    const-string p1, "off"

    return-object p1
.end method

.method public getFrontCamera()I
    .locals 1

    .line 389
    iget v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mFrontCamera:I

    return v0
.end method

.method public getMinExposureTargetBias()F
    .locals 1

    .line 407
    iget v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mMinExposureTargetBias:F

    return v0
.end method

.method public hasBackCamera()Z
    .locals 1

    .line 399
    iget v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mFrontCamera:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasCamera(I)Z
    .locals 0

    if-nez p1, :cond_0

    .line 421
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->hasBackCamera()Z

    move-result p1

    return p1

    .line 423
    :cond_0
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->hasFrontCamera()Z

    move-result p1

    return p1
.end method

.method public hasFrontCamera()Z
    .locals 1

    .line 383
    iget v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mFrontCamera:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isContinuousDisabled()Z
    .locals 1

    .line 523
    iget-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableContinuous:Z

    return v0
.end method

.method public isCustomMeteringAndFocusAreaSupported()Z
    .locals 1

    .line 537
    iget-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mCustomMeteringAndFocusAreaSupported:Z

    return v0
.end method

.method public isInitialFocusRequired()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isMacroDisabled()Z
    .locals 1

    .line 533
    iget-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableMacro:Z

    return v0
.end method

.method public isTablet()Z
    .locals 1

    .line 514
    iget-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mIsTablet:Z

    return v0
.end method

.method public requiresCameraRestartOnTorchSwitch()Z
    .locals 1

    .line 648
    iget-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mRequiresCameraRestartOnTorchSwitch:Z

    return v0
.end method

.method public abstract setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
.end method

.method public final shouldUseTextureView()Z
    .locals 2

    .line 84
    iget-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mUseTextureView:Z

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/scandit/base/camera/profiles/DeviceProfile;->FORCE_SURFACE_VIEW:Z

    if-eqz v0, :cond_1

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_2

    sget-boolean v0, Lcom/scandit/base/camera/profiles/DeviceProfile;->FORCE_TEXTURE_VIEW:Z

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
