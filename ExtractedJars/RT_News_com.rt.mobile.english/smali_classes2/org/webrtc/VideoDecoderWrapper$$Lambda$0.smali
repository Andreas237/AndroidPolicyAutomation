.class final synthetic Lorg/webrtc/VideoDecoderWrapper$$Lambda$0;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/webrtc/VideoDecoder$Callback;


# instance fields
.field private final arg$1:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lorg/webrtc/VideoDecoderWrapper$$Lambda$0;->arg$1:J

    return-void
.end method


# virtual methods
.method public onDecodedFrame(Lorg/webrtc/VideoFrame;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 2

    iget-wide v0, p0, Lorg/webrtc/VideoDecoderWrapper$$Lambda$0;->arg$1:J

    invoke-static {v0, v1, p1, p2, p3}, Lorg/webrtc/VideoDecoderWrapper;->lambda$createDecoderCallback$0$VideoDecoderWrapper(JLorg/webrtc/VideoFrame;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method
