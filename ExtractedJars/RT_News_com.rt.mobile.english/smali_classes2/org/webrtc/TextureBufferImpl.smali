.class public Lorg/webrtc/TextureBufferImpl;
.super Ljava/lang/Object;
.source "TextureBufferImpl.java"

# interfaces
.implements Lorg/webrtc/VideoFrame$TextureBuffer;


# instance fields
.field private final height:I

.field private final id:I

.field private final refCountDelegate:Lorg/webrtc/RefCountDelegate;

.field private final toI420Handler:Landroid/os/Handler;

.field private final transformMatrix:Landroid/graphics/Matrix;

.field private final type:Lorg/webrtc/VideoFrame$TextureBuffer$Type;

.field private final width:I

.field private final yuvConverter:Lorg/webrtc/YuvConverter;


# direct methods
.method public constructor <init>(IILorg/webrtc/VideoFrame$TextureBuffer$Type;ILandroid/graphics/Matrix;Landroid/os/Handler;Lorg/webrtc/YuvConverter;Ljava/lang/Runnable;)V
    .locals 0
    .param p8    # Ljava/lang/Runnable;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput p1, p0, Lorg/webrtc/TextureBufferImpl;->width:I

    .line 34
    iput p2, p0, Lorg/webrtc/TextureBufferImpl;->height:I

    .line 35
    iput-object p3, p0, Lorg/webrtc/TextureBufferImpl;->type:Lorg/webrtc/VideoFrame$TextureBuffer$Type;

    .line 36
    iput p4, p0, Lorg/webrtc/TextureBufferImpl;->id:I

    .line 37
    iput-object p5, p0, Lorg/webrtc/TextureBufferImpl;->transformMatrix:Landroid/graphics/Matrix;

    .line 38
    iput-object p6, p0, Lorg/webrtc/TextureBufferImpl;->toI420Handler:Landroid/os/Handler;

    .line 39
    iput-object p7, p0, Lorg/webrtc/TextureBufferImpl;->yuvConverter:Lorg/webrtc/YuvConverter;

    .line 40
    new-instance p1, Lorg/webrtc/RefCountDelegate;

    invoke-direct {p1, p8}, Lorg/webrtc/RefCountDelegate;-><init>(Ljava/lang/Runnable;)V

    iput-object p1, p0, Lorg/webrtc/TextureBufferImpl;->refCountDelegate:Lorg/webrtc/RefCountDelegate;

    return-void
.end method


# virtual methods
.method public applyTransformMatrix(Landroid/graphics/Matrix;II)Lorg/webrtc/TextureBufferImpl;
    .locals 9

    .line 104
    new-instance v5, Landroid/graphics/Matrix;

    iget-object v0, p0, Lorg/webrtc/TextureBufferImpl;->transformMatrix:Landroid/graphics/Matrix;

    invoke-direct {v5, v0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 105
    invoke-virtual {v5, p1}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 106
    invoke-virtual {p0}, Lorg/webrtc/TextureBufferImpl;->retain()V

    .line 107
    new-instance p1, Lorg/webrtc/TextureBufferImpl;

    iget-object v3, p0, Lorg/webrtc/TextureBufferImpl;->type:Lorg/webrtc/VideoFrame$TextureBuffer$Type;

    iget v4, p0, Lorg/webrtc/TextureBufferImpl;->id:I

    iget-object v6, p0, Lorg/webrtc/TextureBufferImpl;->toI420Handler:Landroid/os/Handler;

    iget-object v7, p0, Lorg/webrtc/TextureBufferImpl;->yuvConverter:Lorg/webrtc/YuvConverter;

    new-instance v8, Lorg/webrtc/TextureBufferImpl$$Lambda$1;

    invoke-direct {v8, p0}, Lorg/webrtc/TextureBufferImpl$$Lambda$1;-><init>(Lorg/webrtc/TextureBufferImpl;)V

    move-object v0, p1

    move v1, p2

    move v2, p3

    invoke-direct/range {v0 .. v8}, Lorg/webrtc/TextureBufferImpl;-><init>(IILorg/webrtc/VideoFrame$TextureBuffer$Type;ILandroid/graphics/Matrix;Landroid/os/Handler;Lorg/webrtc/YuvConverter;Ljava/lang/Runnable;)V

    return-object p1
.end method

.method public cropAndScale(IIIIII)Lorg/webrtc/VideoFrame$Buffer;
    .locals 2

    .line 87
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 90
    iget v1, p0, Lorg/webrtc/TextureBufferImpl;->height:I

    add-int/2addr p2, p4

    sub-int/2addr v1, p2

    int-to-float p1, p1

    .line 91
    iget p2, p0, Lorg/webrtc/TextureBufferImpl;->width:I

    int-to-float p2, p2

    div-float/2addr p1, p2

    int-to-float p2, v1

    iget v1, p0, Lorg/webrtc/TextureBufferImpl;->height:I

    int-to-float v1, v1

    div-float/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    int-to-float p1, p3

    .line 92
    iget p2, p0, Lorg/webrtc/TextureBufferImpl;->width:I

    int-to-float p2, p2

    div-float/2addr p1, p2

    int-to-float p2, p4

    iget p3, p0, Lorg/webrtc/TextureBufferImpl;->height:I

    int-to-float p3, p3

    div-float/2addr p2, p3

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 94
    invoke-virtual {p0, v0, p5, p6}, Lorg/webrtc/TextureBufferImpl;->applyTransformMatrix(Landroid/graphics/Matrix;II)Lorg/webrtc/TextureBufferImpl;

    move-result-object p1

    return-object p1
.end method

.method public getHeight()I
    .locals 1

    .line 65
    iget v0, p0, Lorg/webrtc/TextureBufferImpl;->height:I

    return v0
.end method

.method public getTextureId()I
    .locals 1

    .line 50
    iget v0, p0, Lorg/webrtc/TextureBufferImpl;->id:I

    return v0
.end method

.method public getTransformMatrix()Landroid/graphics/Matrix;
    .locals 1

    .line 55
    iget-object v0, p0, Lorg/webrtc/TextureBufferImpl;->transformMatrix:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public getType()Lorg/webrtc/VideoFrame$TextureBuffer$Type;
    .locals 1

    .line 45
    iget-object v0, p0, Lorg/webrtc/TextureBufferImpl;->type:Lorg/webrtc/VideoFrame$TextureBuffer$Type;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    .line 60
    iget v0, p0, Lorg/webrtc/TextureBufferImpl;->width:I

    return v0
.end method

.method final synthetic lambda$toI420$0$TextureBufferImpl()Lorg/webrtc/VideoFrame$I420Buffer;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 71
    iget-object v0, p0, Lorg/webrtc/TextureBufferImpl;->yuvConverter:Lorg/webrtc/YuvConverter;

    invoke-virtual {v0, p0}, Lorg/webrtc/YuvConverter;->convert(Lorg/webrtc/VideoFrame$TextureBuffer;)Lorg/webrtc/VideoFrame$I420Buffer;

    move-result-object v0

    return-object v0
.end method

.method public release()V
    .locals 1

    .line 81
    iget-object v0, p0, Lorg/webrtc/TextureBufferImpl;->refCountDelegate:Lorg/webrtc/RefCountDelegate;

    invoke-virtual {v0}, Lorg/webrtc/RefCountDelegate;->release()V

    return-void
.end method

.method public retain()V
    .locals 1

    .line 76
    iget-object v0, p0, Lorg/webrtc/TextureBufferImpl;->refCountDelegate:Lorg/webrtc/RefCountDelegate;

    invoke-virtual {v0}, Lorg/webrtc/RefCountDelegate;->retain()V

    return-void
.end method

.method public toI420()Lorg/webrtc/VideoFrame$I420Buffer;
    .locals 2

    .line 70
    iget-object v0, p0, Lorg/webrtc/TextureBufferImpl;->toI420Handler:Landroid/os/Handler;

    new-instance v1, Lorg/webrtc/TextureBufferImpl$$Lambda$0;

    invoke-direct {v1, p0}, Lorg/webrtc/TextureBufferImpl$$Lambda$0;-><init>(Lorg/webrtc/TextureBufferImpl;)V

    invoke-static {v0, v1}, Lorg/webrtc/ThreadUtils;->invokeAtFrontUninterruptibly(Landroid/os/Handler;Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/webrtc/VideoFrame$I420Buffer;

    return-object v0
.end method
