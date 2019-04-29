.class Lorg/webrtc/VideoFrameDrawer$YuvUploader;
.super Ljava/lang/Object;
.source "VideoFrameDrawer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/VideoFrameDrawer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "YuvUploader"
.end annotation


# instance fields
.field private copyBuffer:Ljava/nio/ByteBuffer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private yuvTextures:[I
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/webrtc/VideoFrameDrawer$1;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lorg/webrtc/VideoFrameDrawer$YuvUploader;-><init>()V

    return-void
.end method


# virtual methods
.method public getYuvTextures()[I
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 119
    iget-object v0, p0, Lorg/webrtc/VideoFrameDrawer$YuvUploader;->yuvTextures:[I

    return-object v0
.end method

.method public release()V
    .locals 4

    const/4 v0, 0x0

    .line 127
    iput-object v0, p0, Lorg/webrtc/VideoFrameDrawer$YuvUploader;->copyBuffer:Ljava/nio/ByteBuffer;

    .line 128
    iget-object v1, p0, Lorg/webrtc/VideoFrameDrawer$YuvUploader;->yuvTextures:[I

    if-eqz v1, :cond_0

    const/4 v1, 0x3

    .line 129
    iget-object v2, p0, Lorg/webrtc/VideoFrameDrawer$YuvUploader;->yuvTextures:[I

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 130
    iput-object v0, p0, Lorg/webrtc/VideoFrameDrawer$YuvUploader;->yuvTextures:[I

    :cond_0
    return-void
.end method

.method public uploadFromBuffer(Lorg/webrtc/VideoFrame$I420Buffer;)[I
    .locals 6
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x3

    .line 112
    new-array v1, v0, [I

    invoke-interface {p1}, Lorg/webrtc/VideoFrame$I420Buffer;->getStrideY()I

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-interface {p1}, Lorg/webrtc/VideoFrame$I420Buffer;->getStrideU()I

    move-result v2

    const/4 v4, 0x1

    aput v2, v1, v4

    invoke-interface {p1}, Lorg/webrtc/VideoFrame$I420Buffer;->getStrideV()I

    move-result v2

    const/4 v5, 0x2

    aput v2, v1, v5

    .line 113
    new-array v0, v0, [Ljava/nio/ByteBuffer;

    invoke-interface {p1}, Lorg/webrtc/VideoFrame$I420Buffer;->getDataY()Ljava/nio/ByteBuffer;

    move-result-object v2

    aput-object v2, v0, v3

    invoke-interface {p1}, Lorg/webrtc/VideoFrame$I420Buffer;->getDataU()Ljava/nio/ByteBuffer;

    move-result-object v2

    aput-object v2, v0, v4

    invoke-interface {p1}, Lorg/webrtc/VideoFrame$I420Buffer;->getDataV()Ljava/nio/ByteBuffer;

    move-result-object v2

    aput-object v2, v0, v5

    .line 114
    invoke-interface {p1}, Lorg/webrtc/VideoFrame$I420Buffer;->getWidth()I

    move-result v2

    invoke-interface {p1}, Lorg/webrtc/VideoFrame$I420Buffer;->getHeight()I

    move-result p1

    invoke-virtual {p0, v2, p1, v1, v0}, Lorg/webrtc/VideoFrameDrawer$YuvUploader;->uploadYuvData(II[I[Ljava/nio/ByteBuffer;)[I

    move-result-object p1

    return-object p1
.end method

.method public uploadYuvData(II[I[Ljava/nio/ByteBuffer;)[I
    .locals 16
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    move-object/from16 v0, p0

    const/4 v3, 0x3

    .line 69
    new-array v4, v3, [I

    const/4 v5, 0x0

    aput p1, v4, v5

    const/4 v6, 0x2

    div-int/lit8 v1, p1, 0x2

    const/4 v7, 0x1

    aput v1, v4, v7

    aput v1, v4, v6

    .line 70
    new-array v1, v3, [I

    aput p2, v1, v5

    div-int/lit8 v2, p2, 0x2

    aput v2, v1, v7

    aput v2, v1, v6

    move v2, v5

    move v6, v2

    :goto_0
    if-ge v2, v3, :cond_1

    .line 74
    aget v7, p3, v2

    aget v8, v4, v2

    if-le v7, v8, :cond_0

    .line 75
    aget v7, v4, v2

    aget v8, v1, v2

    mul-int/2addr v7, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-lez v6, :cond_3

    .line 79
    iget-object v2, v0, Lorg/webrtc/VideoFrameDrawer$YuvUploader;->copyBuffer:Ljava/nio/ByteBuffer;

    if-eqz v2, :cond_2

    iget-object v2, v0, Lorg/webrtc/VideoFrameDrawer$YuvUploader;->copyBuffer:Ljava/nio/ByteBuffer;

    .line 80
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v2

    if-ge v2, v6, :cond_3

    .line 81
    :cond_2
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Lorg/webrtc/VideoFrameDrawer$YuvUploader;->copyBuffer:Ljava/nio/ByteBuffer;

    .line 84
    :cond_3
    iget-object v2, v0, Lorg/webrtc/VideoFrameDrawer$YuvUploader;->yuvTextures:[I

    const/16 v6, 0xde1

    if-nez v2, :cond_4

    .line 85
    new-array v2, v3, [I

    iput-object v2, v0, Lorg/webrtc/VideoFrameDrawer$YuvUploader;->yuvTextures:[I

    move v2, v5

    :goto_1
    if-ge v2, v3, :cond_4

    .line 87
    iget-object v7, v0, Lorg/webrtc/VideoFrameDrawer$YuvUploader;->yuvTextures:[I

    invoke-static {v6}, Lorg/webrtc/GlUtil;->generateTexture(I)I

    move-result v8

    aput v8, v7, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    if-ge v5, v3, :cond_6

    const v2, 0x84c0

    add-int/2addr v2, v5

    .line 92
    invoke-static {v2}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 93
    iget-object v2, v0, Lorg/webrtc/VideoFrameDrawer$YuvUploader;->yuvTextures:[I

    aget v2, v2, v5

    invoke-static {v6, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 96
    aget v2, p3, v5

    aget v7, v4, v5

    if-ne v2, v7, :cond_5

    .line 98
    aget-object v2, p4, v5

    :goto_3
    move-object v15, v2

    goto :goto_4

    .line 100
    :cond_5
    aget-object v7, p4, v5

    aget v8, p3, v5

    iget-object v9, v0, Lorg/webrtc/VideoFrameDrawer$YuvUploader;->copyBuffer:Ljava/nio/ByteBuffer;

    aget v10, v4, v5

    aget v11, v4, v5

    aget v12, v1, v5

    invoke-static/range {v7 .. v12}, Lorg/webrtc/YuvHelper;->copyPlane(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;III)V

    .line 102
    iget-object v2, v0, Lorg/webrtc/VideoFrameDrawer$YuvUploader;->copyBuffer:Ljava/nio/ByteBuffer;

    goto :goto_3

    :goto_4
    const/16 v7, 0xde1

    const/4 v8, 0x0

    const/16 v9, 0x1909

    .line 104
    aget v10, v4, v5

    aget v11, v1, v5

    const/4 v12, 0x0

    const/16 v13, 0x1909

    const/16 v14, 0x1401

    invoke-static/range {v7 .. v15}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 107
    :cond_6
    iget-object v1, v0, Lorg/webrtc/VideoFrameDrawer$YuvUploader;->yuvTextures:[I

    return-object v1
.end method
