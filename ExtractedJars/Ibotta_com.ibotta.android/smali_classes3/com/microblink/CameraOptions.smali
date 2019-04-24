.class public Lcom/microblink/CameraOptions;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/microblink/CameraOptions;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final aspectMode:Lcom/microblink/camera/view/CameraAspectMode;

.field private final optimizeCameraForNearScan:Z

.field private final orientation:Lcom/microblink/camera/hardware/orientation/Orientation;

.field private final scanRegion:Landroid/graphics/RectF;

.field private final videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/microblink/CameraOptions$1;

    invoke-direct {v0}, Lcom/microblink/CameraOptions$1;-><init>()V

    sput-object v0, Lcom/microblink/CameraOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/RectF;Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;Lcom/microblink/camera/view/CameraAspectMode;ZLcom/microblink/camera/hardware/orientation/Orientation;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/CameraOptions;->scanRegion:Landroid/graphics/RectF;

    iput-object p2, p0, Lcom/microblink/CameraOptions;->videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    iput-object p3, p0, Lcom/microblink/CameraOptions;->aspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    iput-boolean p4, p0, Lcom/microblink/CameraOptions;->optimizeCameraForNearScan:Z

    iput-object p5, p0, Lcom/microblink/CameraOptions;->orientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Landroid/graphics/RectF;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/RectF;

    iput-object v0, p0, Lcom/microblink/CameraOptions;->scanRegion:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->values()[Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    move-result-object v3

    aget-object v0, v3, v0

    :goto_0
    iput-object v0, p0, Lcom/microblink/CameraOptions;->videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v2, :cond_1

    move-object v0, v1

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/microblink/camera/view/CameraAspectMode;->values()[Lcom/microblink/camera/view/CameraAspectMode;

    move-result-object v3

    aget-object v0, v3, v0

    :goto_1
    iput-object v0, p0, Lcom/microblink/CameraOptions;->aspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    iput-boolean v0, p0, Lcom/microblink/CameraOptions;->optimizeCameraForNearScan:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-ne p1, v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {}, Lcom/microblink/camera/hardware/orientation/Orientation;->values()[Lcom/microblink/camera/hardware/orientation/Orientation;

    move-result-object v0

    aget-object v1, v0, p1

    :goto_3
    iput-object v1, p0, Lcom/microblink/CameraOptions;->orientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-void
.end method

.method public static create()Lcom/microblink/CameraOptions;
    .locals 3

    new-instance v0, Landroid/graphics/RectF;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object v1, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT:Lcom/microblink/camera/hardware/orientation/Orientation;

    invoke-static {v0, v1}, Lcom/microblink/CameraOptions;->create(Landroid/graphics/RectF;Lcom/microblink/camera/hardware/orientation/Orientation;)Lcom/microblink/CameraOptions;

    move-result-object v0

    return-object v0
.end method

.method public static create(Landroid/graphics/RectF;Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;Lcom/microblink/camera/view/CameraAspectMode;ZLcom/microblink/camera/hardware/orientation/Orientation;)Lcom/microblink/CameraOptions;
    .locals 7

    new-instance v6, Lcom/microblink/CameraOptions;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/microblink/CameraOptions;-><init>(Landroid/graphics/RectF;Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;Lcom/microblink/camera/view/CameraAspectMode;ZLcom/microblink/camera/hardware/orientation/Orientation;)V

    return-object v6
.end method

.method public static create(Landroid/graphics/RectF;Lcom/microblink/camera/hardware/orientation/Orientation;)Lcom/microblink/CameraOptions;
    .locals 3

    invoke-static {}, Lcom/microblink/FrameCharacteristics;->defaultVideoResolution()Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    move-result-object v0

    sget-object v1, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FILL:Lcom/microblink/camera/view/CameraAspectMode;

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Lcom/microblink/CameraOptions;->create(Landroid/graphics/RectF;Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;Lcom/microblink/camera/view/CameraAspectMode;ZLcom/microblink/camera/hardware/orientation/Orientation;)Lcom/microblink/CameraOptions;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public aspectMode()Lcom/microblink/camera/view/CameraAspectMode;
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraOptions;->aspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public optimizeCameraForNearScan()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/CameraOptions;->optimizeCameraForNearScan:Z

    return v0
.end method

.method public orientation()Lcom/microblink/camera/hardware/orientation/Orientation;
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraOptions;->orientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object v0
.end method

.method public scanRegion()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraOptions;->scanRegion:Landroid/graphics/RectF;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CameraOptions{scanRegion="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/CameraOptions;->scanRegion:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", videoResolutionPreset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/CameraOptions;->videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", aspectMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/CameraOptions;->aspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", optimizeCameraForNearScan="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/CameraOptions;->optimizeCameraForNearScan:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", orientation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/CameraOptions;->orientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public videoResolutionPreset()Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraOptions;->videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraOptions;->scanRegion:Landroid/graphics/RectF;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/microblink/CameraOptions;->videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    const/4 v0, -0x1

    if-nez p2, :cond_0

    const/4 p2, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->ordinal()I

    move-result p2

    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/microblink/CameraOptions;->aspectMode:Lcom/microblink/camera/view/CameraAspectMode;

    if-nez p2, :cond_1

    const/4 p2, -0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lcom/microblink/camera/view/CameraAspectMode;->ordinal()I

    move-result p2

    :goto_1
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/microblink/CameraOptions;->optimizeCameraForNearScan:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-object p2, p0, Lcom/microblink/CameraOptions;->orientation:Lcom/microblink/camera/hardware/orientation/Orientation;

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lcom/microblink/camera/hardware/orientation/Orientation;->ordinal()I

    move-result v0

    :goto_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
