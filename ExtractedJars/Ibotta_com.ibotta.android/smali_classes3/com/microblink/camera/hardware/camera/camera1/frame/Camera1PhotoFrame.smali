.class public Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PhotoFrame;
.super Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;


# direct methods
.method public constructor <init>(IIILcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;-><init>(IIILcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V

    return-void
.end method


# virtual methods
.method public getFormat()Lcom/microblink/camera/hardware/camera/CameraDataFormat;
    .locals 1

    sget-object v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->JPEG:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    return-object v0
.end method

.method public getFrameQuality()D
    .locals 2

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    return-wide v0
.end method

.method public getNativeCameraFrame()J
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "JPEG frames do not have native part."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public initializeNativePart(J)Z
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "JPEG frames do not have native part."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isPhoto()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public recycle()V
    .locals 0

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PhotoFrame;->finalizePoolObject()V

    return-void
.end method
