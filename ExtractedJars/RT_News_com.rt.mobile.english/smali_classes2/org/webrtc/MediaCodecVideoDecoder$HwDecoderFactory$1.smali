.class Lorg/webrtc/MediaCodecVideoDecoder$HwDecoderFactory$1;
.super Lorg/webrtc/WrappedNativeVideoDecoder;
.source "MediaCodecVideoDecoder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/webrtc/MediaCodecVideoDecoder$HwDecoderFactory;->createDecoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/webrtc/MediaCodecVideoDecoder$HwDecoderFactory;

.field final synthetic val$codec:Lorg/webrtc/VideoCodecInfo;


# direct methods
.method constructor <init>(Lorg/webrtc/MediaCodecVideoDecoder$HwDecoderFactory;Lorg/webrtc/VideoCodecInfo;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lorg/webrtc/MediaCodecVideoDecoder$HwDecoderFactory$1;->this$0:Lorg/webrtc/MediaCodecVideoDecoder$HwDecoderFactory;

    iput-object p2, p0, Lorg/webrtc/MediaCodecVideoDecoder$HwDecoderFactory$1;->val$codec:Lorg/webrtc/VideoCodecInfo;

    invoke-direct {p0}, Lorg/webrtc/WrappedNativeVideoDecoder;-><init>()V

    return-void
.end method


# virtual methods
.method public createNativeVideoDecoder()J
    .locals 2

    .line 122
    iget-object v0, p0, Lorg/webrtc/MediaCodecVideoDecoder$HwDecoderFactory$1;->val$codec:Lorg/webrtc/VideoCodecInfo;

    iget-object v0, v0, Lorg/webrtc/VideoCodecInfo;->name:Ljava/lang/String;

    invoke-static {}, Lorg/webrtc/MediaCodecVideoDecoder;->useSurface()Z

    move-result v1

    invoke-static {v0, v1}, Lorg/webrtc/MediaCodecVideoDecoder;->access$000(Ljava/lang/String;Z)J

    move-result-wide v0

    return-wide v0
.end method
