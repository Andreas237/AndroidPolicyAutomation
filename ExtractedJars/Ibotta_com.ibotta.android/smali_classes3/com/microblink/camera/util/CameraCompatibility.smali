.class public Lcom/microblink/camera/util/CameraCompatibility;
.super Ljava/lang/Object;


# static fields
.field private static displayOrientation:I

.field private static setDisplayOrientationSupported:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getDisplayOrientation()I
    .locals 1

    sget v0, Lcom/microblink/camera/util/CameraCompatibility;->displayOrientation:I

    return v0
.end method

.method public static initCompatibility(ILcom/microblink/camera/hardware/DeviceManager;)V
    .locals 6

    const-class v0, Lcom/microblink/camera/util/CameraCompatibility;

    const-string v1, "Initializing default orientation to: {}"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v0, v1, v3}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/DeviceManager;->isDisplayOrientationBlacklisted()Z

    move-result p1

    if-nez p1, :cond_0

    sput p0, Lcom/microblink/camera/util/CameraCompatibility;->displayOrientation:I

    sput-boolean v2, Lcom/microblink/camera/util/CameraCompatibility;->setDisplayOrientationSupported:Z

    goto :goto_0

    :cond_0
    const-class p0, Lcom/microblink/camera/util/CameraCompatibility;

    const-string p1, "Display orientation is blacklisted!"

    new-array v0, v5, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    sput v5, Lcom/microblink/camera/util/CameraCompatibility;->displayOrientation:I

    sput-boolean v5, Lcom/microblink/camera/util/CameraCompatibility;->setDisplayOrientationSupported:Z

    :goto_0
    const-class p0, Lcom/microblink/camera/util/CameraCompatibility;

    const-string p1, "Default orientation initialized to: {}"

    new-array v0, v2, [Ljava/lang/Object;

    sget v1, Lcom/microblink/camera/util/CameraCompatibility;->displayOrientation:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v5

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static isPortraitCameraSupported()Z
    .locals 1

    sget-boolean v0, Lcom/microblink/camera/util/CameraCompatibility;->setDisplayOrientationSupported:Z

    return v0
.end method

.method public static setDisplayOrientation(Landroid/hardware/Camera;IIZ)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    if-eqz p0, :cond_2

    sget-boolean v0, Lcom/microblink/camera/util/CameraCompatibility;->setDisplayOrientationSupported:Z

    if-eqz v0, :cond_1

    if-eqz p3, :cond_0

    add-int/lit16 p2, p2, -0x10e

    goto :goto_0

    :cond_0
    add-int/lit8 p2, p2, -0x5a

    :goto_0
    add-int/2addr p2, p1

    add-int/lit16 p2, p2, 0x168

    rem-int/lit16 p2, p2, 0x168

    invoke-virtual {p0, p2}, Landroid/hardware/Camera;->setDisplayOrientation(I)V

    return-void

    :cond_1
    const-class p0, Lcom/microblink/camera/util/CameraCompatibility;

    const-string p1, "Set DisplayOrientationMethod not supported."

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
