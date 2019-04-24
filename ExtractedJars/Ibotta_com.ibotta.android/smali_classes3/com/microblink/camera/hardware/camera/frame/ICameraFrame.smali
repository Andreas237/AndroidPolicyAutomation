.class public interface abstract Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/util/pool/PoolObject;


# virtual methods
.method public abstract getFormat()Lcom/microblink/camera/hardware/camera/CameraDataFormat;
.end method

.method public abstract getFrameID()J
.end method

.method public abstract getFrameQuality()D
.end method

.method public abstract getHeight()I
.end method

.method public abstract getNativeCameraFrame()J
.end method

.method public abstract getOrientation()Lcom/microblink/camera/hardware/orientation/Orientation;
.end method

.method public abstract getVisiblePart()Landroid/graphics/RectF;
.end method

.method public abstract getWidth()I
.end method

.method public abstract initializeNativePart(J)Z
.end method

.method public abstract isDeviceMoving()Z
.end method

.method public abstract isFocused()Z
.end method

.method public abstract isPhoto()Z
.end method

.method public abstract recycle()V
.end method

.method public abstract setOrientation(Lcom/microblink/camera/hardware/orientation/Orientation;)V
.end method

.method public abstract setVisiblePart(Landroid/graphics/RectF;)V
.end method
