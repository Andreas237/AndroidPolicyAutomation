.class public Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;
.super Ljava/lang/Object;
.source "PostLollipopImageBuffer.java"

# interfaces
.implements Lcom/scandit/base/camera/capturedImage/ImageBuffer;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x13
.end annotation


# instance fields
.field private mFormat:Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

.field private final mInUse:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mInUse:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    sget-object v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;->YCbCr_420:Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mFormat:Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    .line 25
    new-instance v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    invoke-direct {v0}, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;-><init>()V

    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    .line 27
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    new-instance v1, Lcom/scandit/recognition/ImageDescription;

    invoke-direct {v1}, Lcom/scandit/recognition/ImageDescription;-><init>()V

    iput-object v1, v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->description:Lcom/scandit/recognition/ImageDescription;

    return-void
.end method


# virtual methods
.method public assign(Landroid/media/Image;)V
    .locals 13

    .line 31
    invoke-virtual {p1}, Landroid/media/Image;->getFormat()I

    move-result v0

    const/16 v1, 0x23

    if-ne v0, v1, :cond_5

    .line 37
    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result v1

    mul-int v0, v0, v1

    const/4 v1, 0x3

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    .line 38
    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    iget-object v3, v3, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->description:Lcom/scandit/recognition/ImageDescription;

    invoke-virtual {v3}, Lcom/scandit/recognition/ImageDescription;->getWidth()I

    move-result v3

    if-ne v2, v3, :cond_0

    .line 39
    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result v2

    iget-object v3, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    iget-object v3, v3, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->description:Lcom/scandit/recognition/ImageDescription;

    invoke-virtual {v3}, Lcom/scandit/recognition/ImageDescription;->getHeight()I

    move-result v3

    if-eq v2, v3, :cond_1

    .line 40
    :cond_0
    iget-object v2, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    new-array v3, v0, [B

    iput-object v3, v2, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->buffer:[B

    .line 42
    :cond_1
    iget-object v2, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    iget-object v2, v2, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->description:Lcom/scandit/recognition/ImageDescription;

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/scandit/recognition/ImageDescription;->setWidth(I)V

    .line 43
    iget-object v2, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    iget-object v2, v2, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->description:Lcom/scandit/recognition/ImageDescription;

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/scandit/recognition/ImageDescription;->setHeight(I)V

    .line 44
    iget-object v2, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    iget-object v2, v2, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->description:Lcom/scandit/recognition/ImageDescription;

    sget v3, Lcom/scandit/recognition/ImageDescription;->IMAGE_LAYOUT_YPCBCR_8U:I

    invoke-virtual {v2, v3}, Lcom/scandit/recognition/ImageDescription;->setLayout(I)V

    .line 45
    iget-object v2, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    iget-object v2, v2, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->description:Lcom/scandit/recognition/ImageDescription;

    invoke-virtual {v2, v0}, Lcom/scandit/recognition/ImageDescription;->setMemorySize(I)V

    .line 46
    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v0

    const/4 v2, 0x0

    .line 48
    aget-object v3, v0, v2

    invoke-virtual {v3}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v3

    .line 49
    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v4

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result v5

    mul-int v4, v4, v5

    .line 50
    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v5

    aget-object v6, v0, v2

    invoke-virtual {v6}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v6

    if-ne v5, v6, :cond_2

    .line 51
    iget-object v5, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    iget-object v5, v5, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->buffer:[B

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v6

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result v7

    mul-int v6, v6, v7

    invoke-virtual {v3, v5, v2, v6}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    .line 54
    :goto_0
    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result v6

    if-ge v5, v6, :cond_3

    .line 55
    aget-object v6, v0, v2

    invoke-virtual {v6}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v6

    mul-int v6, v6, v5

    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 56
    iget-object v6, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    iget-object v6, v6, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->buffer:[B

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v7

    mul-int v7, v7, v5

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v8

    invoke-virtual {v3, v6, v7, v8}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    const/4 v2, 0x1

    const/4 v3, 0x1

    :goto_2
    if-ge v3, v1, :cond_4

    .line 60
    aget-object v5, v0, v3

    invoke-virtual {v5}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 61
    iget-object v5, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    iget-object v7, v5, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->buffer:[B

    add-int v5, v4, v3

    add-int/lit8 v8, v5, -0x1

    .line 62
    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v5

    div-int/lit8 v9, v5, 0x2

    aget-object v5, v0, v3

    .line 63
    invoke-virtual {v5}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v10

    aget-object v5, v0, v3

    .line 64
    invoke-virtual {v5}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v11

    .line 65
    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result v5

    div-int/lit8 v12, v5, 0x2

    .line 61
    invoke-static/range {v6 .. v12}, Lcom/scandit/recognition/Native;->sc_copy_direct_uv_buffer_plane(Ljava/nio/ByteBuffer;[BIIIII)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 67
    :cond_4
    iget-object p1, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mInUse:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    .line 32
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "only YUV420 images are supported"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getCopy()Lcom/scandit/base/camera/capturedImage/ImageBuffer;
    .locals 4

    .line 106
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    iget-object v0, v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->buffer:[B

    iget-object v1, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    iget-object v1, v1, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->buffer:[B

    array-length v1, v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    .line 108
    new-instance v1, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer$1;

    iget-object v2, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    iget-object v2, v2, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->description:Lcom/scandit/recognition/ImageDescription;

    const/4 v3, 0x0

    invoke-direct {v1, p0, v0, v2, v3}, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer$1;-><init>(Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;[BLcom/scandit/recognition/ImageDescription;Lcom/scandit/base/camera/SbPreLollipopCamera;)V

    return-object v1
.end method

.method public getFormat()Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mFormat:Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    iget-object v0, v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->description:Lcom/scandit/recognition/ImageDescription;

    invoke-virtual {v0}, Lcom/scandit/recognition/ImageDescription;->getHeight()I

    move-result v0

    return v0
.end method

.method public getLegacyRepresentation()Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mLegacyRepr:Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    iget-object v0, v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->description:Lcom/scandit/recognition/ImageDescription;

    invoke-virtual {v0}, Lcom/scandit/recognition/ImageDescription;->getWidth()I

    move-result v0

    return v0
.end method

.method public isInUse()Z
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mInUse:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public isReleased()Z
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mInUse:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public release()V
    .locals 3

    .line 96
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->mInUse:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    return-void
.end method
