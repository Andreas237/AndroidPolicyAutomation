.class public Lorg/webrtc/VideoEncoderFallback;
.super Lorg/webrtc/WrappedNativeVideoEncoder;
.source "VideoEncoderFallback.java"


# instance fields
.field private final fallback:Lorg/webrtc/VideoEncoder;

.field private final primary:Lorg/webrtc/VideoEncoder;


# direct methods
.method public constructor <init>(Lorg/webrtc/VideoEncoder;Lorg/webrtc/VideoEncoder;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lorg/webrtc/WrappedNativeVideoEncoder;-><init>()V

    .line 21
    iput-object p1, p0, Lorg/webrtc/VideoEncoderFallback;->fallback:Lorg/webrtc/VideoEncoder;

    .line 22
    iput-object p2, p0, Lorg/webrtc/VideoEncoderFallback;->primary:Lorg/webrtc/VideoEncoder;

    return-void
.end method

.method private static native nativeCreateEncoder(Lorg/webrtc/VideoEncoder;Lorg/webrtc/VideoEncoder;)J
.end method


# virtual methods
.method public createNativeVideoEncoder()J
    .locals 2

    .line 27
    iget-object v0, p0, Lorg/webrtc/VideoEncoderFallback;->fallback:Lorg/webrtc/VideoEncoder;

    iget-object v1, p0, Lorg/webrtc/VideoEncoderFallback;->primary:Lorg/webrtc/VideoEncoder;

    invoke-static {v0, v1}, Lorg/webrtc/VideoEncoderFallback;->nativeCreateEncoder(Lorg/webrtc/VideoEncoder;Lorg/webrtc/VideoEncoder;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic encode(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)Lorg/webrtc/VideoCodecStatus;
    .locals 0

    .line 16
    invoke-super {p0, p1, p2}, Lorg/webrtc/WrappedNativeVideoEncoder;->encode(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getImplementationName()Ljava/lang/String;
    .locals 1

    .line 16
    invoke-super {p0}, Lorg/webrtc/WrappedNativeVideoEncoder;->getImplementationName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getScalingSettings()Lorg/webrtc/VideoEncoder$ScalingSettings;
    .locals 1

    .line 16
    invoke-super {p0}, Lorg/webrtc/WrappedNativeVideoEncoder;->getScalingSettings()Lorg/webrtc/VideoEncoder$ScalingSettings;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic initEncode(Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)Lorg/webrtc/VideoCodecStatus;
    .locals 0

    .line 16
    invoke-super {p0, p1, p2}, Lorg/webrtc/WrappedNativeVideoEncoder;->initEncode(Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1

    return-object p1
.end method

.method public isHardwareEncoder()Z
    .locals 1

    .line 32
    iget-object v0, p0, Lorg/webrtc/VideoEncoderFallback;->primary:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0}, Lorg/webrtc/VideoEncoder;->isHardwareEncoder()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic release()Lorg/webrtc/VideoCodecStatus;
    .locals 1

    .line 16
    invoke-super {p0}, Lorg/webrtc/WrappedNativeVideoEncoder;->release()Lorg/webrtc/VideoCodecStatus;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setChannelParameters(SJ)Lorg/webrtc/VideoCodecStatus;
    .locals 0

    .line 16
    invoke-super {p0, p1, p2, p3}, Lorg/webrtc/WrappedNativeVideoEncoder;->setChannelParameters(SJ)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRateAllocation(Lorg/webrtc/VideoEncoder$BitrateAllocation;I)Lorg/webrtc/VideoCodecStatus;
    .locals 0

    .line 16
    invoke-super {p0, p1, p2}, Lorg/webrtc/WrappedNativeVideoEncoder;->setRateAllocation(Lorg/webrtc/VideoEncoder$BitrateAllocation;I)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1

    return-object p1
.end method
