.class public Lorg/webrtc/EncodedImage;
.super Ljava/lang/Object;
.source "EncodedImage.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/EncodedImage$Builder;,
        Lorg/webrtc/EncodedImage$FrameType;
    }
.end annotation


# instance fields
.field public final buffer:Ljava/nio/ByteBuffer;

.field public final captureTimeMs:J

.field public final captureTimeNs:J

.field public final completeFrame:Z

.field public final encodedHeight:I

.field public final encodedWidth:I

.field public final frameType:Lorg/webrtc/EncodedImage$FrameType;

.field public final qp:Ljava/lang/Integer;

.field public final rotation:I


# direct methods
.method private constructor <init>(Ljava/nio/ByteBuffer;IIJLorg/webrtc/EncodedImage$FrameType;IZLjava/lang/Integer;)V
    .locals 0
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lorg/webrtc/EncodedImage;->buffer:Ljava/nio/ByteBuffer;

    .line 62
    iput p2, p0, Lorg/webrtc/EncodedImage;->encodedWidth:I

    .line 63
    iput p3, p0, Lorg/webrtc/EncodedImage;->encodedHeight:I

    .line 64
    sget-object p1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, p4, p5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    iput-wide p1, p0, Lorg/webrtc/EncodedImage;->captureTimeMs:J

    .line 65
    iput-wide p4, p0, Lorg/webrtc/EncodedImage;->captureTimeNs:J

    .line 66
    iput-object p6, p0, Lorg/webrtc/EncodedImage;->frameType:Lorg/webrtc/EncodedImage$FrameType;

    .line 67
    iput p7, p0, Lorg/webrtc/EncodedImage;->rotation:I

    .line 68
    iput-boolean p8, p0, Lorg/webrtc/EncodedImage;->completeFrame:Z

    .line 69
    iput-object p9, p0, Lorg/webrtc/EncodedImage;->qp:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Ljava/nio/ByteBuffer;IIJLorg/webrtc/EncodedImage$FrameType;IZLjava/lang/Integer;Lorg/webrtc/EncodedImage$1;)V
    .locals 0

    .line 20
    invoke-direct/range {p0 .. p9}, Lorg/webrtc/EncodedImage;-><init>(Ljava/nio/ByteBuffer;IIJLorg/webrtc/EncodedImage$FrameType;IZLjava/lang/Integer;)V

    return-void
.end method

.method public static builder()Lorg/webrtc/EncodedImage$Builder;
    .locals 2

    .line 73
    new-instance v0, Lorg/webrtc/EncodedImage$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/webrtc/EncodedImage$Builder;-><init>(Lorg/webrtc/EncodedImage$1;)V

    return-object v0
.end method
