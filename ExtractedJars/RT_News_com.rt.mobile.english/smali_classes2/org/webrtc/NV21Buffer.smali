.class public Lorg/webrtc/NV21Buffer;
.super Ljava/lang/Object;
.source "NV21Buffer.java"

# interfaces
.implements Lorg/webrtc/VideoFrame$Buffer;


# instance fields
.field private final data:[B

.field private final height:I

.field private final refCountDelegate:Lorg/webrtc/RefCountDelegate;

.field private final width:I


# direct methods
.method public constructor <init>([BIILjava/lang/Runnable;)V
    .locals 0
    .param p4    # Ljava/lang/Runnable;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lorg/webrtc/NV21Buffer;->data:[B

    .line 25
    iput p2, p0, Lorg/webrtc/NV21Buffer;->width:I

    .line 26
    iput p3, p0, Lorg/webrtc/NV21Buffer;->height:I

    .line 27
    new-instance p1, Lorg/webrtc/RefCountDelegate;

    invoke-direct {p1, p4}, Lorg/webrtc/RefCountDelegate;-><init>(Ljava/lang/Runnable;)V

    iput-object p1, p0, Lorg/webrtc/NV21Buffer;->refCountDelegate:Lorg/webrtc/RefCountDelegate;

    return-void
.end method

.method private static native nativeCropAndScale(IIIIII[BIILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;I)V
.end method


# virtual methods
.method public cropAndScale(IIIIII)Lorg/webrtc/VideoFrame$Buffer;
    .locals 17

    move-object/from16 v0, p0

    .line 60
    invoke-static/range {p5 .. p6}, Lorg/webrtc/JavaI420Buffer;->allocate(II)Lorg/webrtc/JavaI420Buffer;

    move-result-object v1

    .line 61
    iget-object v8, v0, Lorg/webrtc/NV21Buffer;->data:[B

    iget v9, v0, Lorg/webrtc/NV21Buffer;->width:I

    iget v10, v0, Lorg/webrtc/NV21Buffer;->height:I

    .line 62
    invoke-virtual {v1}, Lorg/webrtc/JavaI420Buffer;->getDataY()Ljava/nio/ByteBuffer;

    move-result-object v11

    invoke-virtual {v1}, Lorg/webrtc/JavaI420Buffer;->getStrideY()I

    move-result v12

    invoke-virtual {v1}, Lorg/webrtc/JavaI420Buffer;->getDataU()Ljava/nio/ByteBuffer;

    move-result-object v13

    .line 63
    invoke-virtual {v1}, Lorg/webrtc/JavaI420Buffer;->getStrideU()I

    move-result v14

    invoke-virtual {v1}, Lorg/webrtc/JavaI420Buffer;->getDataV()Ljava/nio/ByteBuffer;

    move-result-object v15

    invoke-virtual {v1}, Lorg/webrtc/JavaI420Buffer;->getStrideV()I

    move-result v16

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    .line 61
    invoke-static/range {v2 .. v16}, Lorg/webrtc/NV21Buffer;->nativeCropAndScale(IIIIII[BIILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;I)V

    return-object v1
.end method

.method public getHeight()I
    .locals 1

    .line 37
    iget v0, p0, Lorg/webrtc/NV21Buffer;->height:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 32
    iget v0, p0, Lorg/webrtc/NV21Buffer;->width:I

    return v0
.end method

.method public release()V
    .locals 1

    .line 54
    iget-object v0, p0, Lorg/webrtc/NV21Buffer;->refCountDelegate:Lorg/webrtc/RefCountDelegate;

    invoke-virtual {v0}, Lorg/webrtc/RefCountDelegate;->release()V

    return-void
.end method

.method public retain()V
    .locals 1

    .line 49
    iget-object v0, p0, Lorg/webrtc/NV21Buffer;->refCountDelegate:Lorg/webrtc/RefCountDelegate;

    invoke-virtual {v0}, Lorg/webrtc/RefCountDelegate;->retain()V

    return-void
.end method

.method public toI420()Lorg/webrtc/VideoFrame$I420Buffer;
    .locals 7

    .line 43
    iget v3, p0, Lorg/webrtc/NV21Buffer;->width:I

    iget v4, p0, Lorg/webrtc/NV21Buffer;->height:I

    iget v5, p0, Lorg/webrtc/NV21Buffer;->width:I

    iget v6, p0, Lorg/webrtc/NV21Buffer;->height:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lorg/webrtc/NV21Buffer;->cropAndScale(IIIIII)Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v0

    check-cast v0, Lorg/webrtc/VideoFrame$I420Buffer;

    return-object v0
.end method
