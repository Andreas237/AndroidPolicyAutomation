.class public abstract Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;


# instance fields
.field protected mCamera1Manager:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

.field protected mDeviceMoving:Z

.field protected mFocused:Z

.field protected mID:J

.field protected mImgBuffer:[B

.field protected mImgHeight:I

.field protected mImgWidth:I

.field protected mNativeContext:J

.field protected mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

.field protected mVisiblePart:Landroid/graphics/RectF;


# direct methods
.method protected constructor <init>(IIILcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mImgBuffer:[B

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mNativeContext:J

    iput p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mImgWidth:I

    iput p2, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mImgHeight:I

    iput-object p4, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mCamera1Manager:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    if-lez p3, :cond_0

    new-array p1, p3, [B

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mImgBuffer:[B

    :cond_0
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mImgBuffer:[B

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mCamera1Manager:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mVisiblePart:Landroid/graphics/RectF;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-void
.end method

.method public finalizePoolObject()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mCamera1Manager:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->recycleFrame(Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mVisiblePart:Landroid/graphics/RectF;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-void
.end method

.method public getFrameID()J
    .locals 2

    iget-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mID:J

    return-wide v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mImgHeight:I

    return v0
.end method

.method public getImgBuffer()[B
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mImgBuffer:[B

    return-object v0
.end method

.method public getNativeCameraFrame()J
    .locals 2

    iget-wide v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mNativeContext:J

    return-wide v0
.end method

.method public getOrientation()Lcom/microblink/camera/hardware/orientation/Orientation;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object v0
.end method

.method public final getVisiblePart()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mVisiblePart:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mImgWidth:I

    return v0
.end method

.method public initializePoolObject()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mVisiblePart:Landroid/graphics/RectF;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-void
.end method

.method public final isDeviceMoving()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mDeviceMoving:Z

    return v0
.end method

.method public final isFocused()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mFocused:Z

    return v0
.end method

.method public final setDeviceMoving(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mDeviceMoving:Z

    return-void
.end method

.method public final setFocused(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mFocused:Z

    return-void
.end method

.method public setFrameID(J)V
    .locals 0

    iput-wide p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mID:J

    return-void
.end method

.method public final setImgBuffer([B)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mImgBuffer:[B

    return-void
.end method

.method public setOrientation(Lcom/microblink/camera/hardware/orientation/Orientation;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mOrientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-void
.end method

.method public final setVisiblePart(Landroid/graphics/RectF;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mVisiblePart:Landroid/graphics/RectF;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1AbstractFrame;->mVisiblePart:Landroid/graphics/RectF;

    invoke-static {p1}, Lcom/microblink/camera/util/CommonUtils;->clampToUnitRect(Landroid/graphics/RectF;)V

    return-void
.end method
