.class public Lorg/webrtc/EncodedImage$Builder;
.super Ljava/lang/Object;
.source "EncodedImage.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/EncodedImage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private buffer:Ljava/nio/ByteBuffer;

.field private captureTimeNs:J

.field private completeFrame:Z

.field private encodedHeight:I

.field private encodedWidth:I

.field private frameType:Lorg/webrtc/EncodedImage$FrameType;

.field private qp:Ljava/lang/Integer;

.field private rotation:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/webrtc/EncodedImage$1;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Lorg/webrtc/EncodedImage$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public createEncodedImage()Lorg/webrtc/EncodedImage;
    .locals 12

    .line 135
    new-instance v11, Lorg/webrtc/EncodedImage;

    iget-object v1, p0, Lorg/webrtc/EncodedImage$Builder;->buffer:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/webrtc/EncodedImage$Builder;->encodedWidth:I

    iget v3, p0, Lorg/webrtc/EncodedImage$Builder;->encodedHeight:I

    iget-wide v4, p0, Lorg/webrtc/EncodedImage$Builder;->captureTimeNs:J

    iget-object v6, p0, Lorg/webrtc/EncodedImage$Builder;->frameType:Lorg/webrtc/EncodedImage$FrameType;

    iget v7, p0, Lorg/webrtc/EncodedImage$Builder;->rotation:I

    iget-boolean v8, p0, Lorg/webrtc/EncodedImage$Builder;->completeFrame:Z

    iget-object v9, p0, Lorg/webrtc/EncodedImage$Builder;->qp:Ljava/lang/Integer;

    const/4 v10, 0x0

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Lorg/webrtc/EncodedImage;-><init>(Ljava/nio/ByteBuffer;IIJLorg/webrtc/EncodedImage$FrameType;IZLjava/lang/Integer;Lorg/webrtc/EncodedImage$1;)V

    return-object v11
.end method

.method public setBuffer(Ljava/nio/ByteBuffer;)Lorg/webrtc/EncodedImage$Builder;
    .locals 0

    .line 89
    iput-object p1, p0, Lorg/webrtc/EncodedImage$Builder;->buffer:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method public setCaptureTimeMs(J)Lorg/webrtc/EncodedImage$Builder;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 105
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    iput-wide p1, p0, Lorg/webrtc/EncodedImage$Builder;->captureTimeNs:J

    return-object p0
.end method

.method public setCaptureTimeNs(J)Lorg/webrtc/EncodedImage$Builder;
    .locals 0

    .line 110
    iput-wide p1, p0, Lorg/webrtc/EncodedImage$Builder;->captureTimeNs:J

    return-object p0
.end method

.method public setCompleteFrame(Z)Lorg/webrtc/EncodedImage$Builder;
    .locals 0

    .line 125
    iput-boolean p1, p0, Lorg/webrtc/EncodedImage$Builder;->completeFrame:Z

    return-object p0
.end method

.method public setEncodedHeight(I)Lorg/webrtc/EncodedImage$Builder;
    .locals 0

    .line 99
    iput p1, p0, Lorg/webrtc/EncodedImage$Builder;->encodedHeight:I

    return-object p0
.end method

.method public setEncodedWidth(I)Lorg/webrtc/EncodedImage$Builder;
    .locals 0

    .line 94
    iput p1, p0, Lorg/webrtc/EncodedImage$Builder;->encodedWidth:I

    return-object p0
.end method

.method public setFrameType(Lorg/webrtc/EncodedImage$FrameType;)Lorg/webrtc/EncodedImage$Builder;
    .locals 0

    .line 115
    iput-object p1, p0, Lorg/webrtc/EncodedImage$Builder;->frameType:Lorg/webrtc/EncodedImage$FrameType;

    return-object p0
.end method

.method public setQp(Ljava/lang/Integer;)Lorg/webrtc/EncodedImage$Builder;
    .locals 0

    .line 130
    iput-object p1, p0, Lorg/webrtc/EncodedImage$Builder;->qp:Ljava/lang/Integer;

    return-object p0
.end method

.method public setRotation(I)Lorg/webrtc/EncodedImage$Builder;
    .locals 0

    .line 120
    iput p1, p0, Lorg/webrtc/EncodedImage$Builder;->rotation:I

    return-object p0
.end method
