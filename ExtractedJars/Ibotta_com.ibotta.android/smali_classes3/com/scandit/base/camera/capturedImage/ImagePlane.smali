.class public Lcom/scandit/base/camera/capturedImage/ImagePlane;
.super Ljava/lang/Object;
.source "ImagePlane.java"


# instance fields
.field private mBitsPerSample:I

.field private mBuffer:Ljava/nio/ByteBuffer;

.field private mPixelStride:I

.field private mRowStride:I


# direct methods
.method constructor <init>(Ljava/nio/ByteBuffer;III)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/scandit/base/camera/capturedImage/ImagePlane;->mBuffer:Ljava/nio/ByteBuffer;

    .line 21
    iput p2, p0, Lcom/scandit/base/camera/capturedImage/ImagePlane;->mPixelStride:I

    .line 22
    iput p3, p0, Lcom/scandit/base/camera/capturedImage/ImagePlane;->mRowStride:I

    .line 23
    iput p4, p0, Lcom/scandit/base/camera/capturedImage/ImagePlane;->mBitsPerSample:I

    return-void
.end method


# virtual methods
.method public getBitsPerSample()I
    .locals 1

    .line 44
    iget v0, p0, Lcom/scandit/base/camera/capturedImage/ImagePlane;->mBitsPerSample:I

    return v0
.end method

.method public getBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImagePlane;->mBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 32
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImagePlane;->mBuffer:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public getPixelStride()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/scandit/base/camera/capturedImage/ImagePlane;->mPixelStride:I

    return v0
.end method

.method public getRowStride()I
    .locals 1

    .line 36
    iget v0, p0, Lcom/scandit/base/camera/capturedImage/ImagePlane;->mRowStride:I

    return v0
.end method

.method public setBuffer(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/scandit/base/camera/capturedImage/ImagePlane;->mBuffer:Ljava/nio/ByteBuffer;

    return-void
.end method
