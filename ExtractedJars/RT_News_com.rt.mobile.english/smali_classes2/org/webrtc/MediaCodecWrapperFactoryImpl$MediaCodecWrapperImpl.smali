.class Lorg/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;
.super Ljava/lang/Object;
.source "MediaCodecWrapperFactoryImpl.java"

# interfaces
.implements Lorg/webrtc/MediaCodecWrapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/MediaCodecWrapperFactoryImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "MediaCodecWrapperImpl"
.end annotation


# instance fields
.field private final mediaCodec:Landroid/media/MediaCodec;


# direct methods
.method public constructor <init>(Landroid/media/MediaCodec;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lorg/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;->mediaCodec:Landroid/media/MediaCodec;

    return-void
.end method


# virtual methods
.method public configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    .locals 1

    .line 37
    iget-object v0, p0, Lorg/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;->mediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    return-void
.end method

.method public createInputSurface()Landroid/view/Surface;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x12
    .end annotation

    .line 99
    iget-object v0, p0, Lorg/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;->mediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    move-result-object v0

    return-object v0
.end method

.method public dequeueInputBuffer(J)I
    .locals 1

    .line 62
    iget-object v0, p0, Lorg/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;->mediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result p1

    return p1
.end method

.method public dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I
    .locals 1

    .line 73
    iget-object v0, p0, Lorg/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;->mediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2, p3}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result p1

    return p1
.end method

.method public flush()V
    .locals 1

    .line 47
    iget-object v0, p0, Lorg/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;->mediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->flush()V

    return-void
.end method

.method public getInputBuffers()[Ljava/nio/ByteBuffer;
    .locals 1

    .line 88
    iget-object v0, p0, Lorg/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;->mediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public getOutputBuffers()[Ljava/nio/ByteBuffer;
    .locals 1

    .line 93
    iget-object v0, p0, Lorg/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;->mediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public getOutputFormat()Landroid/media/MediaFormat;
    .locals 1

    .line 83
    iget-object v0, p0, Lorg/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;->mediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v0

    return-object v0
.end method

.method public queueInputBuffer(IIIJI)V
    .locals 7

    .line 68
    iget-object v0, p0, Lorg/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;->mediaCodec:Landroid/media/MediaCodec;

    move v1, p1

    move v2, p2

    move v3, p3

    move-wide v4, p4

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    return-void
.end method

.method public release()V
    .locals 1

    .line 57
    iget-object v0, p0, Lorg/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;->mediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    return-void
.end method

.method public releaseOutputBuffer(IZ)V
    .locals 1

    .line 78
    iget-object v0, p0, Lorg/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;->mediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    return-void
.end method

.method public setParameters(Landroid/os/Bundle;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    .line 105
    iget-object v0, p0, Lorg/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;->mediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    return-void
.end method

.method public start()V
    .locals 1

    .line 42
    iget-object v0, p0, Lorg/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;->mediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V

    return-void
.end method

.method public stop()V
    .locals 1

    .line 52
    iget-object v0, p0, Lorg/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;->mediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    return-void
.end method
