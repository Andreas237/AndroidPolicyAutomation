.class synthetic Lcom/scandit/base/camera/SbICamera$1;
.super Ljava/lang/Object;
.source "SbICamera.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/base/camera/SbICamera;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$scandit$base$camera$SbICamera$CameraApiVersion:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 374
    invoke-static {}, Lcom/scandit/base/camera/SbICamera$CameraApiVersion;->values()[Lcom/scandit/base/camera/SbICamera$CameraApiVersion;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/scandit/base/camera/SbICamera$1;->$SwitchMap$com$scandit$base$camera$SbICamera$CameraApiVersion:[I

    :try_start_0
    sget-object v0, Lcom/scandit/base/camera/SbICamera$1;->$SwitchMap$com$scandit$base$camera$SbICamera$CameraApiVersion:[I

    sget-object v1, Lcom/scandit/base/camera/SbICamera$CameraApiVersion;->CAMERA1:Lcom/scandit/base/camera/SbICamera$CameraApiVersion;

    invoke-virtual {v1}, Lcom/scandit/base/camera/SbICamera$CameraApiVersion;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/scandit/base/camera/SbICamera$1;->$SwitchMap$com$scandit$base$camera$SbICamera$CameraApiVersion:[I

    sget-object v1, Lcom/scandit/base/camera/SbICamera$CameraApiVersion;->CAMERA2:Lcom/scandit/base/camera/SbICamera$CameraApiVersion;

    invoke-virtual {v1}, Lcom/scandit/base/camera/SbICamera$CameraApiVersion;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
