.class public Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;
.super Ljava/lang/Object;
.source "PreLollipopImageBuffer.java"

# interfaces
.implements Lcom/scandit/base/camera/capturedImage/ImageBuffer;


# instance fields
.field mBuffer:[B

.field mCamera:Lcom/scandit/base/camera/SbPreLollipopCamera;

.field mDescription:Lcom/scandit/recognition/ImageDescription;

.field mReleased:Z


# direct methods
.method public constructor <init>([BLcom/scandit/recognition/ImageDescription;Lcom/scandit/base/camera/SbPreLollipopCamera;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mReleased:Z

    .line 25
    iput-object p1, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mBuffer:[B

    .line 26
    iput-object p2, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mDescription:Lcom/scandit/recognition/ImageDescription;

    .line 27
    iput-object p3, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mCamera:Lcom/scandit/base/camera/SbPreLollipopCamera;

    .line 28
    iput-boolean v0, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mReleased:Z

    return-void
.end method

.method private getByteBuffer(I)Ljava/nio/ByteBuffer;
    .locals 3

    if-nez p1, :cond_0

    .line 54
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mDescription:Lcom/scandit/recognition/ImageDescription;

    invoke-virtual {v0}, Lcom/scandit/recognition/ImageDescription;->getFirstPlaneOffset()I

    move-result v0

    .line 55
    iget-object v1, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mDescription:Lcom/scandit/recognition/ImageDescription;

    invoke-virtual {v1}, Lcom/scandit/recognition/ImageDescription;->getSecondPlaneOffset()I

    move-result v1

    iget-object v2, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mDescription:Lcom/scandit/recognition/ImageDescription;

    invoke-virtual {v2}, Lcom/scandit/recognition/ImageDescription;->getFirstPlaneOffset()I

    move-result v2

    sub-int/2addr v1, v2

    goto :goto_0

    .line 57
    :cond_0
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mDescription:Lcom/scandit/recognition/ImageDescription;

    invoke-virtual {v0}, Lcom/scandit/recognition/ImageDescription;->getSecondPlaneOffset()I

    move-result v0

    .line 58
    iget-object v1, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mDescription:Lcom/scandit/recognition/ImageDescription;

    invoke-virtual {v1}, Lcom/scandit/recognition/ImageDescription;->getMemorySize()J

    move-result-wide v1

    long-to-int v2, v1

    iget-object v1, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mDescription:Lcom/scandit/recognition/ImageDescription;

    invoke-virtual {v1}, Lcom/scandit/recognition/ImageDescription;->getSecondPlaneOffset()I

    move-result v1

    sub-int v1, v2, v1

    :goto_0
    const/4 v2, 0x2

    if-ne p1, v2, :cond_1

    add-int/lit8 v0, v0, 0x1

    .line 65
    :cond_1
    iget-object p1, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mBuffer:[B

    invoke-static {p1, v0, v1}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public getCopy()Lcom/scandit/base/camera/capturedImage/ImageBuffer;
    .locals 4

    .line 90
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mBuffer:[B

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    .line 92
    new-instance v1, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer$1;

    iget-object v2, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mDescription:Lcom/scandit/recognition/ImageDescription;

    const/4 v3, 0x0

    invoke-direct {v1, p0, v0, v2, v3}, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer$1;-><init>(Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;[BLcom/scandit/recognition/ImageDescription;Lcom/scandit/base/camera/SbPreLollipopCamera;)V

    return-object v1
.end method

.method public getFormat()Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;
    .locals 2

    .line 33
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mDescription:Lcom/scandit/recognition/ImageDescription;

    invoke-virtual {v0}, Lcom/scandit/recognition/ImageDescription;->getLayout()I

    move-result v0

    sget v1, Lcom/scandit/recognition/ImageDescription;->IMAGE_LAYOUT_YPCRCB_8U:I

    if-ne v0, v1, :cond_0

    .line 34
    sget-object v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;->YCrCb_420:Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    return-object v0

    .line 37
    :cond_0
    sget-object v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;->UNKNOWN:Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mDescription:Lcom/scandit/recognition/ImageDescription;

    invoke-virtual {v0}, Lcom/scandit/recognition/ImageDescription;->getHeight()I

    move-result v0

    return v0
.end method

.method public getLegacyRepresentation()Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;
    .locals 2

    .line 71
    new-instance v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    invoke-direct {v0}, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;-><init>()V

    .line 72
    iget-object v1, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mBuffer:[B

    iput-object v1, v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->buffer:[B

    .line 73
    iget-object v1, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mDescription:Lcom/scandit/recognition/ImageDescription;

    iput-object v1, v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->description:Lcom/scandit/recognition/ImageDescription;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mDescription:Lcom/scandit/recognition/ImageDescription;

    invoke-virtual {v0}, Lcom/scandit/recognition/ImageDescription;->getWidth()I

    move-result v0

    return v0
.end method

.method public isReleased()Z
    .locals 1

    .line 85
    iget-boolean v0, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mReleased:Z

    return v0
.end method

.method public release()V
    .locals 2

    .line 79
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mCamera:Lcom/scandit/base/camera/SbPreLollipopCamera;

    iget-object v1, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mBuffer:[B

    invoke-virtual {v0, v1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->reuseCallbackBuffer([B)V

    const/4 v0, 0x1

    .line 80
    iput-boolean v0, p0, Lcom/scandit/base/camera/capturedImage/PreLollipopImageBuffer;->mReleased:Z

    return-void
.end method
