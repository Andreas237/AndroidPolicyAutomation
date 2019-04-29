.class public Lorg/webrtc/VideoDecoderFallback;
.super Lorg/webrtc/WrappedNativeVideoDecoder;
.source "VideoDecoderFallback.java"


# instance fields
.field private final fallback:Lorg/webrtc/VideoDecoder;

.field private final primary:Lorg/webrtc/VideoDecoder;


# direct methods
.method public constructor <init>(Lorg/webrtc/VideoDecoder;Lorg/webrtc/VideoDecoder;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lorg/webrtc/WrappedNativeVideoDecoder;-><init>()V

    .line 21
    iput-object p1, p0, Lorg/webrtc/VideoDecoderFallback;->fallback:Lorg/webrtc/VideoDecoder;

    .line 22
    iput-object p2, p0, Lorg/webrtc/VideoDecoderFallback;->primary:Lorg/webrtc/VideoDecoder;

    return-void
.end method

.method private static native nativeCreateDecoder(Lorg/webrtc/VideoDecoder;Lorg/webrtc/VideoDecoder;)J
.end method


# virtual methods
.method public createNativeVideoDecoder()J
    .locals 2

    .line 27
    iget-object v0, p0, Lorg/webrtc/VideoDecoderFallback;->fallback:Lorg/webrtc/VideoDecoder;

    iget-object v1, p0, Lorg/webrtc/VideoDecoderFallback;->primary:Lorg/webrtc/VideoDecoder;

    invoke-static {v0, v1}, Lorg/webrtc/VideoDecoderFallback;->nativeCreateDecoder(Lorg/webrtc/VideoDecoder;Lorg/webrtc/VideoDecoder;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic decode(Lorg/webrtc/EncodedImage;Lorg/webrtc/VideoDecoder$DecodeInfo;)Lorg/webrtc/VideoCodecStatus;
    .locals 0

    .line 16
    invoke-super {p0, p1, p2}, Lorg/webrtc/WrappedNativeVideoDecoder;->decode(Lorg/webrtc/EncodedImage;Lorg/webrtc/VideoDecoder$DecodeInfo;)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getImplementationName()Ljava/lang/String;
    .locals 1

    .line 16
    invoke-super {p0}, Lorg/webrtc/WrappedNativeVideoDecoder;->getImplementationName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getPrefersLateDecoding()Z
    .locals 1

    .line 16
    invoke-super {p0}, Lorg/webrtc/WrappedNativeVideoDecoder;->getPrefersLateDecoding()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic initDecode(Lorg/webrtc/VideoDecoder$Settings;Lorg/webrtc/VideoDecoder$Callback;)Lorg/webrtc/VideoCodecStatus;
    .locals 0

    .line 16
    invoke-super {p0, p1, p2}, Lorg/webrtc/WrappedNativeVideoDecoder;->initDecode(Lorg/webrtc/VideoDecoder$Settings;Lorg/webrtc/VideoDecoder$Callback;)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic release()Lorg/webrtc/VideoCodecStatus;
    .locals 1

    .line 16
    invoke-super {p0}, Lorg/webrtc/WrappedNativeVideoDecoder;->release()Lorg/webrtc/VideoCodecStatus;

    move-result-object v0

    return-object v0
.end method
