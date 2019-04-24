.class public Lcom/microblink/camera/hardware/camera/camera1/strategy/TargetPixelsPhotoCameraStrategy;
.super Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;


# instance fields
.field private mTargetPixels:I


# direct methods
.method public constructor <init>(Landroid/hardware/Camera;ILcom/microblink/camera/hardware/DeviceManager;)V
    .locals 1

    const/16 v0, 0x1000

    invoke-direct {p0, p1, v0, p3}, Lcom/microblink/camera/hardware/camera/camera1/strategy/PhotoPreviewCameraStrategy;-><init>(Landroid/hardware/Camera;ILcom/microblink/camera/hardware/DeviceManager;)V

    iput p2, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/TargetPixelsPhotoCameraStrategy;->mTargetPixels:I

    return-void
.end method


# virtual methods
.method public getOptimalPhotoSize(IILcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;
    .locals 7

    const-string v0, "surface size is: {}x{}"

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v2, p2

    invoke-static {p0, v0, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, p3}, Lcom/microblink/camera/hardware/camera/camera1/strategy/TargetPixelsPhotoCameraStrategy;->getDeviceSpecificOptimalPhotoSize(Lcom/microblink/camera/hardware/camera/CameraType;)Landroid/hardware/Camera$Size;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/TargetPixelsPhotoCameraStrategy;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p1

    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedPictureSizes()Ljava/util/List;

    move-result-object p1

    const/4 p3, 0x0

    const v0, 0x7fffffff

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/Camera$Size;

    const-string v4, "Considering size {}x{}"

    new-array v5, v1, [Ljava/lang/Object;

    iget v6, v2, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v3

    iget v6, v2, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, p2

    invoke-static {p0, v4, v5}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget v4, v2, Landroid/hardware/Camera$Size;->width:I

    iget v5, v2, Landroid/hardware/Camera$Size;->height:I

    mul-int v4, v4, v5

    iget v5, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/TargetPixelsPhotoCameraStrategy;->mTargetPixels:I

    sub-int/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    if-ge v4, v0, :cond_1

    move-object p3, v2

    move v0, v4

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_3

    const-string p1, "Chosen photo size is {}x{}"

    new-array v0, v1, [Ljava/lang/Object;

    iget v1, p3, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v3

    iget v1, p3, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, p2

    invoke-static {p3, p1, v0}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    return-object p3
.end method
