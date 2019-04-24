.class public Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# instance fields
.field private mCamera2Manager:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

.field private mDeviceMoving:Z

.field private mFocused:Z

.field private mID:J

.field private mImage:Landroid/media/Image;

.field private mNativeContext:J

.field private mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

.field private mOwner:Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;

.field private mQuality:D

.field private mVisiblePart:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->loadNativeLibrary()Z

    return-void
.end method

.method public constructor <init>(Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mNativeContext:J

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mQuality:D

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mOwner:Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;

    return-void
.end method

.method private static native initializeNativeCamera2Frame(IIZZIFFFFLjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)J
.end method

.method private static native terminateNativeCamera2Frame(J)V
.end method


# virtual methods
.method public finalizePoolObject()V
    .locals 4

    const-string v0, "Finalizing frame ID: {}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-wide v2, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mID:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mNativeContext:J

    invoke-static {v0, v1}, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->terminateNativeCamera2Frame(J)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mNativeContext:J

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mImage:Landroid/media/Image;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mCamera2Manager:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-virtual {v1, v0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;->closeImage(Landroid/media/Image;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mCamera2Manager:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    :cond_0
    return-void
.end method

.method public getFormat()Lcom/microblink/camera/hardware/camera/CameraDataFormat;
    .locals 1

    sget-object v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->MULTI_PLANAR_YUV_420_888:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    return-object v0
.end method

.method public getFrameID()J
    .locals 2

    iget-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mID:J

    return-wide v0
.end method

.method public getFrameQuality()D
    .locals 2

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    return-wide v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mImage:Landroid/media/Image;

    invoke-virtual {v0}, Landroid/media/Image;->getHeight()I

    move-result v0

    return v0
.end method

.method public getNativeCameraFrame()J
    .locals 2

    iget-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mNativeContext:J

    return-wide v0
.end method

.method public getOrientation()Lcom/microblink/camera/hardware/orientation/Orientation;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object v0
.end method

.method public getVisiblePart()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mVisiblePart:Landroid/graphics/RectF;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mImage:Landroid/media/Image;

    invoke-virtual {v0}, Landroid/media/Image;->getWidth()I

    move-result v0

    return v0
.end method

.method public initializeNativePart(J)Z
    .locals 24

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mNativeContext:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    iget-object v1, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mImage:Landroid/media/Image;

    invoke-virtual {v1}, Landroid/media/Image;->getWidth()I

    move-result v5

    iget-object v1, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mImage:Landroid/media/Image;

    invoke-virtual {v1}, Landroid/media/Image;->getHeight()I

    move-result v6

    iget-boolean v7, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mFocused:Z

    iget-boolean v8, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mDeviceMoving:Z

    iget-object v1, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/orientation/Orientation;->intValue()I

    move-result v9

    iget-object v1, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mVisiblePart:Landroid/graphics/RectF;

    iget v10, v1, Landroid/graphics/RectF;->left:F

    iget-object v1, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mVisiblePart:Landroid/graphics/RectF;

    iget v11, v1, Landroid/graphics/RectF;->top:F

    iget-object v1, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mVisiblePart:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v12

    iget-object v1, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mVisiblePart:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v13

    iget-object v1, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mImage:Landroid/media/Image;

    invoke-virtual {v1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v14

    iget-object v1, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mImage:Landroid/media/Image;

    invoke-virtual {v1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v1

    aget-object v1, v1, v2

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v15

    iget-object v1, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mImage:Landroid/media/Image;

    invoke-virtual {v1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v1

    aget-object v1, v1, v2

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v16

    iget-object v1, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mImage:Landroid/media/Image;

    invoke-virtual {v1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v1

    const/16 v23, 0x1

    aget-object v1, v1, v23

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v17

    iget-object v1, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mImage:Landroid/media/Image;

    invoke-virtual {v1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v1

    aget-object v1, v1, v23

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v18

    iget-object v1, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mImage:Landroid/media/Image;

    invoke-virtual {v1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v1

    aget-object v1, v1, v23

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v19

    iget-object v1, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mImage:Landroid/media/Image;

    invoke-virtual {v1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v1

    const/16 v22, 0x2

    aget-object v1, v1, v22

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v20

    iget-object v1, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mImage:Landroid/media/Image;

    invoke-virtual {v1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v1

    aget-object v1, v1, v22

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v21

    iget-object v1, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mImage:Landroid/media/Image;

    invoke-virtual {v1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v1

    aget-object v1, v1, v22

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v22

    invoke-static/range {v5 .. v22}, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->initializeNativeCamera2Frame(IIZZIFFFFLjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)J

    move-result-wide v5

    iput-wide v5, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mNativeContext:J

    iget-wide v5, v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mNativeContext:J

    cmp-long v1, v5, v3

    if-eqz v1, :cond_0

    return v23

    :cond_0
    return v2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Native part is already initialized!"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public initializePoolObject()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mImage:Landroid/media/Image;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mCamera2Manager:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mVisiblePart:Landroid/graphics/RectF;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mQuality:D

    return-void
.end method

.method public isDeviceMoving()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mDeviceMoving:Z

    return v0
.end method

.method public isFocused()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mFocused:Z

    return v0
.end method

.method public isPhoto()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public recycle()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mOwner:Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;

    invoke-virtual {v0, p0}, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;->recycle(Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;)V

    return-void
.end method

.method public final setDeviceMoving(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mDeviceMoving:Z

    return-void
.end method

.method public final setFocused(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mFocused:Z

    return-void
.end method

.method public setFrameID(J)V
    .locals 0

    iput-wide p1, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mID:J

    return-void
.end method

.method public setImage(Landroid/media/Image;Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mImage:Landroid/media/Image;

    iput-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mCamera2Manager:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    return-void
.end method

.method public setOrientation(Lcom/microblink/camera/hardware/orientation/Orientation;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-void
.end method

.method public setVisiblePart(Landroid/graphics/RectF;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mVisiblePart:Landroid/graphics/RectF;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;->mVisiblePart:Landroid/graphics/RectF;

    invoke-static {p1}, Lcom/microblink/camera/util/CommonUtils;->clampToUnitRect(Landroid/graphics/RectF;)V

    return-void
.end method
