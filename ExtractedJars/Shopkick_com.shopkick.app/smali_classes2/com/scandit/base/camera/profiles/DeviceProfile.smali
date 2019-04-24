.class public abstract Lcom/scandit/base/camera/profiles/DeviceProfile;
.super Ljava/lang/Object;
.source "DeviceProfile.java"


# static fields
.field public static FORCE_SURFACE_VIEW:Z = false

.field public static FORCE_TEXTURE_VIEW:Z = false


# instance fields
.field private mBackCamera:I

.field protected mCustomMeteringAndFocusAreaSupported:Z

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
    .locals 8

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 51
    invoke-direct/range {v0 .. v7}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;ZZZFZZ)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Z)V
    .locals 8

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    .line 47
    invoke-direct/range {v0 .. v7}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;ZZZFZZ)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;ZZZF)V
    .locals 8

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    .line 56
    invoke-direct/range {v0 .. v7}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;ZZZFZZ)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;ZZZFZZ)V
    .locals 4

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 36
    iput-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mIsTablet:Z

    .line 37
    iput-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableTorch:Z

    .line 38
    iput-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableContinuous:Z

    .line 39
    iput-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableMacro:Z

    .line 40
    iput-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mRequiresCameraRestartOnTorchSwitch:Z

    const/4 v1, 0x0

    .line 41
    iput v1, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mMinExposureTargetBias:F

    const/4 v1, 0x1

    .line 42
    iput-boolean v1, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mCustomMeteringAndFocusAreaSupported:Z

    .line 63
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-lt v2, v3, :cond_0

    .line 64
    invoke-direct {p0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isCyanogenMod()Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    :cond_0
    iput-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mUseTextureView:Z

    .line 65
    invoke-static {}, Lcom/scandit/base/camera/profiles/DeviceProfile;->getFirstFrontCamera()I

    move-result v0

    iput v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mFrontCamera:I

    .line 66
    invoke-static {}, Lcom/scandit/base/camera/profiles/DeviceProfile;->getFirstBackCamera()I

    move-result v0

    iput v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mBackCamera:I

    .line 67
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isTabletDevice(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mIsTablet:Z

    .line 68
    iput-boolean p2, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableTorch:Z

    .line 69
    iput-boolean p3, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableContinuous:Z

    .line 70
    iput-boolean p4, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableMacro:Z

    .line 71
    iput p5, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mMinExposureTargetBias:F

    .line 72
    iput-boolean p6, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mCustomMeteringAndFocusAreaSupported:Z

    .line 73
    iput-boolean p7, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mRequiresCameraRestartOnTorchSwitch:Z

    return-void
.end method

.method public static create(Landroid/content/Context;Ljava/lang/String;)Lcom/scandit/base/camera/profiles/DeviceProfile;
    .locals 12

    const-string v0, "SM-T320"

    .line 122
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    new-instance p1, Lcom/scandit/base/camera/profiles/GalaxyTabProProfile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/GalaxyTabProProfile;-><init>(Landroid/content/Context;)V

    return-object p1

    :cond_0
    const-string v0, "SM-T365"

    .line 125
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 126
    new-instance p1, Lcom/scandit/base/camera/profiles/GalaxyActiveTabProfile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/GalaxyActiveTabProfile;-><init>(Landroid/content/Context;)V

    return-object p1

    :cond_1
    const-string v0, "SM-G388"

    .line 129
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 130
    new-instance p1, Lcom/scandit/base/camera/profiles/Xcover3Profile;

    const/4 v0, -0x2

    invoke-direct {p1, p0, v0}, Lcom/scandit/base/camera/profiles/Xcover3Profile;-><init>(Landroid/content/Context;I)V

    return-object p1

    :cond_2
    const-string v0, "i9000"

    .line 133
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 134
    new-instance p1, Lcom/scandit/base/camera/profiles/Xcover3Profile;

    const/4 v0, -0x1

    invoke-direct {p1, p0, v0}, Lcom/scandit/base/camera/profiles/Xcover3Profile;-><init>(Landroid/content/Context;I)V

    return-object p1

    .line 136
    :cond_3
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS5Like(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 137
    new-instance p1, Lcom/scandit/base/camera/profiles/GalaxySxProfile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/GalaxySxProfile;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 139
    :cond_4
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyCorePlus(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 140
    new-instance p1, Lcom/scandit/base/camera/profiles/GalaxyCorePlusProfile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/GalaxyCorePlusProfile;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 142
    :cond_5
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGlass(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 143
    new-instance p1, Lcom/scandit/base/camera/profiles/GlassProfile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/GlassProfile;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 145
    :cond_6
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isNexus5(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_17

    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isNexus6P(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto/16 :goto_6

    .line 148
    :cond_7
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS6Edge(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 149
    new-instance p1, Lcom/scandit/base/camera/profiles/GalaxyS6EdgeProfile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/GalaxyS6EdgeProfile;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 151
    :cond_8
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS7(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 152
    new-instance v0, Lcom/scandit/base/camera/profiles/GalaxyS7Profile;

    invoke-direct {v0, p0, p1}, Lcom/scandit/base/camera/profiles/GalaxyS7Profile;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0

    .line 154
    :cond_9
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS7Active(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 155
    new-instance p1, Lcom/scandit/base/camera/profiles/GalaxyS7ActiveProfile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/GalaxyS7ActiveProfile;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 157
    :cond_a
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS8(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 158
    new-instance p1, Lcom/scandit/base/camera/profiles/GalaxyS8Profile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/GalaxyS8Profile;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 160
    :cond_b
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyJ3(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 161
    new-instance p1, Lcom/scandit/base/camera/profiles/GalaxyJ3Profile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/GalaxyJ3Profile;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 163
    :cond_c
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyY(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 164
    new-instance p1, Lcom/scandit/base/camera/profiles/GalaxyYProfile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/GalaxyYProfile;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 166
    :cond_d
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyNote8(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 167
    new-instance v0, Lcom/scandit/base/camera/profiles/GalaxyNote8Profile;

    invoke-direct {v0, p0, p1}, Lcom/scandit/base/camera/profiles/GalaxyNote8Profile;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0

    :cond_e
    const-string v0, "M100"

    .line 169
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 170
    new-instance p1, Lcom/scandit/base/camera/profiles/VuzixProfile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/VuzixProfile;-><init>(Landroid/content/Context;)V

    return-object p1

    :cond_f
    const-string v0, "Moto G (4)"

    .line 173
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    const-string v0, "MotoG3"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    goto/16 :goto_5

    :cond_10
    const-string v0, "GT-P1000"

    .line 177
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_12

    const-string v0, "HTC One X"

    .line 178
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    const-string v0, "SM-G355"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_0

    :cond_11
    move v5, v1

    goto :goto_1

    :cond_12
    :goto_0
    move v5, v2

    .line 181
    :goto_1
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isXperiaZ5(Ljava/lang/String;)Z

    move-result v0

    xor-int/lit8 v6, v0, 0x1

    const/4 v7, 0x1

    const/4 v0, 0x0

    .line 188
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS3(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_14

    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS4(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_14

    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS5Like(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_14

    .line 189
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS6(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_13

    goto :goto_2

    :cond_13
    move v8, v0

    goto :goto_3

    :cond_14
    :goto_2
    const/high16 v0, -0x40800000    # -1.0f

    move v8, v0

    .line 193
    :goto_3
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyJ5(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_15

    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isNexus4(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_15

    .line 194
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyNote5(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_15

    move v9, v2

    goto :goto_4

    :cond_15
    move v9, v1

    :goto_4
    const/4 v10, 0x0

    .line 196
    invoke-static {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyJ5(Ljava/lang/String;)Z

    move-result v11

    .line 197
    new-instance p1, Lcom/scandit/base/camera/profiles/StandardProfile;

    move-object v3, p1

    move-object v4, p0

    invoke-direct/range {v3 .. v11}, Lcom/scandit/base/camera/profiles/StandardProfile;-><init>(Landroid/content/Context;ZZZFZZZ)V

    return-object p1

    .line 174
    :cond_16
    :goto_5
    new-instance p1, Lcom/scandit/base/camera/profiles/MotoGxProfile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/MotoGxProfile;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 146
    :cond_17
    :goto_6
    new-instance p1, Lcom/scandit/base/camera/profiles/Nexus5Profile;

    invoke-direct {p1, p0}, Lcom/scandit/base/camera/profiles/Nexus5Profile;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method private static getFirstBackCamera()I
    .locals 3

    .line 432
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 435
    :try_start_0
    new-instance v2, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v2}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 436
    invoke-static {v1, v2}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 437
    iget v2, v2, Landroid/hardware/Camera$CameraInfo;->facing:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v2, :cond_0

    return v1

    :catch_0
    move-exception v2

    .line 441
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

    .line 414
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 417
    :try_start_0
    new-instance v2, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v2}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 418
    invoke-static {v1, v2}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 419
    iget v2, v2, Landroid/hardware/Camera$CameraInfo;->facing:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    return v1

    :catch_0
    move-exception v2

    .line 423
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

    .line 108
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "cyanogenmod"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Landroid/os/Build;->HOST:Ljava/lang/String;

    const-string v1, "cyanogenmod"

    .line 109
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

    const-string v0, "SM-G350"

    .line 355
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isGalaxyJ3(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "SM-J3109"

    .line 231
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SM-J320"

    .line 232
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

    const-string v0, "SM-J50"

    .line 227
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SM-J51"

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

    const-string v0, "SM-J70"

    .line 206
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SM-G3508"

    .line 207
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SM-J71"

    .line 208
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

    const-string v0, "SM-N920"

    .line 347
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static isGalaxyNote8(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "SM-N950"

    .line 351
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isGalaxyNoteOne(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "GT-N7000"

    .line 527
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "GT-N7005"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SHV-E160"

    .line 528
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SGH-I717"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SC-05D"

    .line 529
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SGH-T879"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "GT-I9220"

    .line 530
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "GT-I9228"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SCH-I889"

    .line 531
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

    const-string v0, "SGH-T999"

    .line 258
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SCH-I535"

    .line 259
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SPH-L710T"

    .line 260
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SGH-I748"

    .line 261
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Gravity"

    .line 262
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SCH-L710"

    .line 263
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SPH-L710"

    .line 264
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SC-06D"

    .line 265
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "GravityQuad"

    .line 266
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SHV-E210S"

    .line 267
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SCH-R530M"

    .line 268
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "GT-I9300T"

    .line 269
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SHV-E210K"

    .line 270
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "GT-I9300"

    .line 271
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SCH-S968C"

    .line 272
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "GT-I9305"

    .line 273
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SGH-T999N"

    .line 274
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SHV-E210L"

    .line 275
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SCH-I939"

    .line 276
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SGH-T999V"

    .line 277
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SCH-R530C"

    .line 278
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SC-03E"

    .line 279
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SCH-S960L"

    .line 280
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SGH-T999L"

    .line 281
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SCH-R530U"

    .line 282
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SGH-I747M"

    .line 283
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "GT-I9308"

    .line 284
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "GT-I9305T"

    .line 285
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SCH-I939D"

    .line 286
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SCH-R530X"

    .line 287
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SAMSUNG-SGH-I747"

    .line 288
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SHW-M440S"

    .line 289
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SCH-I535PP"

    .line 290
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "GT-I9305N"

    .line 291
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

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

    const-string v0, "GT-I9500"

    .line 296
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "GT-I9502"

    .line 297
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "GT-I9505"

    .line 298
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SC-04E"

    .line 299
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SCH-I545"

    .line 300
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SCH-I959"

    .line 301
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SCH-R970"

    .line 302
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SGH-I337"

    .line 303
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SGH-M919"

    .line 304
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SHV-E300K"

    .line 305
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SHV-E300S"

    .line 306
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SPH-L720"

    .line 307
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

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

    const-string v0, "SM-G900"

    .line 312
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "GT-I9600"

    .line 313
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SAMSUNG-SM-G900"

    .line 314
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

    .line 318
    invoke-static {p0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isGalaxyS5(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SAMSUNG-SM-G870A"

    .line 320
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SM-G870"

    .line 321
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SM-G800"

    .line 323
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SAMSUNG-SM-G800A"

    .line 324
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

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

    const-string v0, "SM-G925"

    .line 328
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SM-G920"

    .line 329
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SCV31"

    .line 330
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SAMSUNG-SM-G925A"

    .line 331
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "404SC"

    .line 332
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SAMSUNG-SM-G920AZ"

    .line 333
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SAMSUNG-SM-G920A"

    .line 334
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SAMSUNG-SM-G890A"

    .line 335
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

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

    const-string v0, "SM-G925"

    .line 339
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "404SC"

    .line 340
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SM-G928"

    .line 341
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SM-G987"

    .line 342
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SAMSUNG-SM-G928"

    .line 343
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

    const-string v0, "SM-G930"

    .line 218
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SM-G935"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SAMSUNG-SM-G891"

    .line 219
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SAMSUNG-SM-G935"

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

.method public static isGalaxyS7Active(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "SAMSUNG-SM-G891A"

    .line 223
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isGalaxyS8(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "SAMSUNG-"

    const-string v1, ""

    .line 212
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "Samsung-"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "SM-G950"

    .line 213
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SM-G955"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SM-G892"

    .line 214
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

    const-string v0, "GT-S536"

    .line 359
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static isGlass(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Glass"

    .line 363
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static isHuaweiP9Lite(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "HUAWEI VNS-L31"

    .line 653
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static isNexus4(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Nexus 4"

    .line 203
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static isNexus5(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Nexus 5"

    .line 245
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static isNexus6(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Nexus 6"

    .line 254
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static isNexus6P(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Nexus 6P"

    .line 249
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static isTabletDevice(Landroid/content/Context;)Z
    .locals 4

    .line 450
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

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_2

    .line 457
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    const-string/jumbo v3, "window"

    .line 459
    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/WindowManager;

    .line 460
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 463
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

    const-string v0, "501SO"

    .line 236
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "E6603"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "E6653"

    .line 237
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SO-01H"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SOV32"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "E5803"

    .line 238
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "E5823"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SO-02H"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "E6853"

    .line 239
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SO-03H"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "E6833"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "E6883"

    .line 240
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "E6633"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "E6683"

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

    .line 618
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getMinExposureCompensation()I

    move-result v0

    .line 619
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getMaxExposureCompensation()I

    move-result v1

    .line 620
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getExposureCompensationStep()F

    move-result v2

    .line 622
    invoke-static {p1, v2, v0, v1}, Lcom/scandit/base/camera/SbExposureUtils;->convertTargetBiasToExposureStep(FFII)I

    move-result p1

    .line 626
    invoke-virtual {p0, p1}, Landroid/hardware/Camera$Parameters;->setExposureCompensation(I)V

    return-void
.end method

.method protected static setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V
    .locals 7

    .line 550
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewFpsRange()Ljava/util/List;

    move-result-object v0

    .line 551
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 555
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

    .line 556
    aget v5, v2, v4

    if-le v5, p1, :cond_2

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    .line 559
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

    .line 566
    aget p1, v1, v4

    aget p2, v1, v4

    invoke-virtual {p0, p1, p2}, Landroid/hardware/Camera$Parameters;->setPreviewFpsRange(II)V

    goto :goto_1

    .line 568
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

    .line 586
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewFpsRange()Ljava/util/List;

    move-result-object v0

    .line 587
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 591
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

    .line 592
    aget v5, v2, v4

    if-le v5, p1, :cond_2

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    .line 595
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

    .line 601
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

    .line 101
    new-instance v0, Lcom/scandit/base/camera/resolution/SbLegacyResolutionStrategy;

    invoke-direct {v0}, Lcom/scandit/base/camera/resolution/SbLegacyResolutionStrategy;-><init>()V

    return-object v0
.end method

.method public getBackCamera()I
    .locals 1

    .line 381
    iget v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mBackCamera:I

    return v0
.end method

.method public getContinuousFocusModeString()Ljava/lang/String;
    .locals 2

    .line 659
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

    .line 480
    iget-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableTorch:Z

    if-eqz v0, :cond_0

    const-string p1, "off"

    return-object p1

    .line 484
    :cond_0
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string/jumbo v0, "torch"

    .line 486
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "on"

    .line 487
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    const-string/jumbo v0, "torch"

    .line 488
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string/jumbo p1, "torch"

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

    .line 375
    iget v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mFrontCamera:I

    return v0
.end method

.method public getMinExposureTargetBias()F
    .locals 1

    .line 393
    iget v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mMinExposureTargetBias:F

    return v0
.end method

.method public hasBackCamera()Z
    .locals 1

    .line 385
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

    .line 407
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->hasBackCamera()Z

    move-result p1

    return p1

    .line 409
    :cond_0
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->hasFrontCamera()Z

    move-result p1

    return p1
.end method

.method public hasFrontCamera()Z
    .locals 1

    .line 369
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

    .line 509
    iget-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableContinuous:Z

    return v0
.end method

.method public isCustomMeteringAndFocusAreaSupported()Z
    .locals 1

    .line 523
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

    .line 519
    iget-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mDisableMacro:Z

    return v0
.end method

.method public isTablet()Z
    .locals 1

    .line 500
    iget-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mIsTablet:Z

    return v0
.end method

.method public requiresCameraRestartOnTorchSwitch()Z
    .locals 1

    .line 634
    iget-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile;->mRequiresCameraRestartOnTorchSwitch:Z

    return v0
.end method

.method public abstract setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
.end method

.method public final shouldUseTextureView()Z
    .locals 2

    .line 81
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
