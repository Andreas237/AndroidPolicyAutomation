.class final synthetic Lorg/webrtc/VideoEncoderWrapper$$Lambda$0;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/webrtc/VideoEncoder$Callback;


# instance fields
.field private final arg$1:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lorg/webrtc/VideoEncoderWrapper$$Lambda$0;->arg$1:J

    return-void
.end method


# virtual methods
.method public onEncodedFrame(Lorg/webrtc/EncodedImage;Lorg/webrtc/VideoEncoder$CodecSpecificInfo;)V
    .locals 2

    iget-wide v0, p0, Lorg/webrtc/VideoEncoderWrapper$$Lambda$0;->arg$1:J

    invoke-static {v0, v1, p1, p2}, Lorg/webrtc/VideoEncoderWrapper;->lambda$createEncoderCallback$0$VideoEncoderWrapper(JLorg/webrtc/EncodedImage;Lorg/webrtc/VideoEncoder$CodecSpecificInfo;)V

    return-void
.end method
