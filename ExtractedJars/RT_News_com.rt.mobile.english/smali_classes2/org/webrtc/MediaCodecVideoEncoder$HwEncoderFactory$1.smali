.class Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory$1;
.super Lorg/webrtc/WrappedNativeVideoEncoder;
.source "MediaCodecVideoEncoder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory;->createEncoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoEncoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory;

.field final synthetic val$info:Lorg/webrtc/VideoCodecInfo;


# direct methods
.method constructor <init>(Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory;Lorg/webrtc/VideoCodecInfo;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory$1;->this$0:Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory;

    iput-object p2, p0, Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory$1;->val$info:Lorg/webrtc/VideoCodecInfo;

    invoke-direct {p0}, Lorg/webrtc/WrappedNativeVideoEncoder;-><init>()V

    return-void
.end method


# virtual methods
.method public createNativeVideoEncoder()J
    .locals 2

    .line 126
    iget-object v0, p0, Lorg/webrtc/MediaCodecVideoEncoder$HwEncoderFactory$1;->val$info:Lorg/webrtc/VideoCodecInfo;

    .line 127
    invoke-static {}, Lorg/webrtc/MediaCodecVideoEncoder;->access$000()Lorg/webrtc/EglBase;

    move-result-object v1

    instance-of v1, v1, Lorg/webrtc/EglBase14;

    .line 126
    invoke-static {v0, v1}, Lorg/webrtc/MediaCodecVideoEncoder;->access$100(Lorg/webrtc/VideoCodecInfo;Z)J

    move-result-wide v0

    return-wide v0
.end method

.method public isHardwareEncoder()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
