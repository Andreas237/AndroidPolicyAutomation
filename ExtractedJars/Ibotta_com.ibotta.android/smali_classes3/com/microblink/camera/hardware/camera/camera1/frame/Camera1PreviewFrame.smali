.class public Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;
.super Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;


# instance fields
.field private mOwner:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

.field private mQuality:D


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->loadNativeLibrary()Z

    return-void
.end method

.method public constructor <init>(IIILcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p5}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;-><init>(IIILcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V

    const-wide/high16 p1, -0x4010000000000000L    # -1.0

    iput-wide p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mQuality:D

    iput-object p4, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mOwner:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    return-void
.end method

.method private static native initializeNativeCamera1Frame(II[BZZIFFFF)J
.end method

.method private static native terminateNativeCamera1Frame(J)V
.end method


# virtual methods
.method public dispose()V
    .locals 1

    invoke-super {p0}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->dispose()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mOwner:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    return-void
.end method

.method public finalizePoolObject()V
    .locals 4

    const-string v0, "Finalizing frame ID: {}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-wide v2, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mID:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mNativeContext:J

    invoke-static {v0, v1}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->terminateNativeCamera1Frame(J)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mNativeContext:J

    invoke-super {p0}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->finalizePoolObject()V

    return-void
.end method

.method public final getFormat()Lcom/microblink/camera/hardware/camera/CameraDataFormat;
    .locals 1

    sget-object v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->YUV_NV21:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    return-object v0
.end method

.method public getFrameQuality()D
    .locals 2

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    return-wide v0
.end method

.method public initializeNativePart(J)Z
    .locals 13

    iget-wide p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mNativeContext:J

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_1

    iget v3, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mImgWidth:I

    iget v4, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mImgHeight:I

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mImgBuffer:[B

    iget-boolean v6, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mFocused:Z

    iget-boolean v7, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mDeviceMoving:Z

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/orientation/Orientation;->intValue()I

    move-result v8

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mVisiblePart:Landroid/graphics/RectF;

    iget v9, p1, Landroid/graphics/RectF;->left:F

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mVisiblePart:Landroid/graphics/RectF;

    iget v10, p1, Landroid/graphics/RectF;->top:F

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mVisiblePart:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v11

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mVisiblePart:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v12

    invoke-static/range {v3 .. v12}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->initializeNativeCamera1Frame(II[BZZIFFFF)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mNativeContext:J

    iget-wide p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mNativeContext:J

    cmp-long v2, p1, v0

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Native part is already initialized!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public initializePoolObject()V
    .locals 2

    invoke-super {p0}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->initializePoolObject()V

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mQuality:D

    return-void
.end method

.method public isPhoto()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public recycle()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;->mOwner:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;->recycle(Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;)V

    :cond_0
    return-void
.end method
