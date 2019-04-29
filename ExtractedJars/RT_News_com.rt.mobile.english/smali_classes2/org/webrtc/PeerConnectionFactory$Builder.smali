.class public Lorg/webrtc/PeerConnectionFactory$Builder;
.super Ljava/lang/Object;
.source "PeerConnectionFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/PeerConnectionFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private audioDeviceModule:Lorg/webrtc/audio/AudioDeviceModule;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private audioProcessingFactory:Lorg/webrtc/AudioProcessingFactory;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private decoderFactory:Lorg/webrtc/VideoDecoderFactory;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private encoderFactory:Lorg/webrtc/VideoEncoderFactory;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private fecControllerFactoryFactory:Lorg/webrtc/FecControllerFactoryFactoryInterface;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private options:Lorg/webrtc/PeerConnectionFactory$Options;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 156
    new-instance v0, Lorg/webrtc/audio/LegacyAudioDeviceModule;

    invoke-direct {v0}, Lorg/webrtc/audio/LegacyAudioDeviceModule;-><init>()V

    iput-object v0, p0, Lorg/webrtc/PeerConnectionFactory$Builder;->audioDeviceModule:Lorg/webrtc/audio/AudioDeviceModule;

    return-void
.end method

.method synthetic constructor <init>(Lorg/webrtc/PeerConnectionFactory$1;)V
    .locals 0

    .line 154
    invoke-direct {p0}, Lorg/webrtc/PeerConnectionFactory$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public createPeerConnectionFactory()Lorg/webrtc/PeerConnectionFactory;
    .locals 9

    .line 200
    new-instance v8, Lorg/webrtc/PeerConnectionFactory;

    iget-object v1, p0, Lorg/webrtc/PeerConnectionFactory$Builder;->options:Lorg/webrtc/PeerConnectionFactory$Options;

    iget-object v2, p0, Lorg/webrtc/PeerConnectionFactory$Builder;->audioDeviceModule:Lorg/webrtc/audio/AudioDeviceModule;

    iget-object v3, p0, Lorg/webrtc/PeerConnectionFactory$Builder;->encoderFactory:Lorg/webrtc/VideoEncoderFactory;

    iget-object v4, p0, Lorg/webrtc/PeerConnectionFactory$Builder;->decoderFactory:Lorg/webrtc/VideoDecoderFactory;

    iget-object v5, p0, Lorg/webrtc/PeerConnectionFactory$Builder;->audioProcessingFactory:Lorg/webrtc/AudioProcessingFactory;

    iget-object v6, p0, Lorg/webrtc/PeerConnectionFactory$Builder;->fecControllerFactoryFactory:Lorg/webrtc/FecControllerFactoryFactoryInterface;

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lorg/webrtc/PeerConnectionFactory;-><init>(Lorg/webrtc/PeerConnectionFactory$Options;Lorg/webrtc/audio/AudioDeviceModule;Lorg/webrtc/VideoEncoderFactory;Lorg/webrtc/VideoDecoderFactory;Lorg/webrtc/AudioProcessingFactory;Lorg/webrtc/FecControllerFactoryFactoryInterface;Lorg/webrtc/PeerConnectionFactory$1;)V

    return-object v8
.end method

.method public setAudioDeviceModule(Lorg/webrtc/audio/AudioDeviceModule;)Lorg/webrtc/PeerConnectionFactory$Builder;
    .locals 0

    .line 170
    iput-object p1, p0, Lorg/webrtc/PeerConnectionFactory$Builder;->audioDeviceModule:Lorg/webrtc/audio/AudioDeviceModule;

    return-object p0
.end method

.method public setAudioProcessingFactory(Lorg/webrtc/AudioProcessingFactory;)Lorg/webrtc/PeerConnectionFactory$Builder;
    .locals 1

    if-nez p1, :cond_0

    .line 186
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "PeerConnectionFactory builder does not accept a null AudioProcessingFactory."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 189
    :cond_0
    iput-object p1, p0, Lorg/webrtc/PeerConnectionFactory$Builder;->audioProcessingFactory:Lorg/webrtc/AudioProcessingFactory;

    return-object p0
.end method

.method public setFecControllerFactoryFactoryInterface(Lorg/webrtc/FecControllerFactoryFactoryInterface;)Lorg/webrtc/PeerConnectionFactory$Builder;
    .locals 0

    .line 195
    iput-object p1, p0, Lorg/webrtc/PeerConnectionFactory$Builder;->fecControllerFactoryFactory:Lorg/webrtc/FecControllerFactoryFactoryInterface;

    return-object p0
.end method

.method public setOptions(Lorg/webrtc/PeerConnectionFactory$Options;)Lorg/webrtc/PeerConnectionFactory$Builder;
    .locals 0

    .line 165
    iput-object p1, p0, Lorg/webrtc/PeerConnectionFactory$Builder;->options:Lorg/webrtc/PeerConnectionFactory$Options;

    return-object p0
.end method

.method public setVideoDecoderFactory(Lorg/webrtc/VideoDecoderFactory;)Lorg/webrtc/PeerConnectionFactory$Builder;
    .locals 0

    .line 180
    iput-object p1, p0, Lorg/webrtc/PeerConnectionFactory$Builder;->decoderFactory:Lorg/webrtc/VideoDecoderFactory;

    return-object p0
.end method

.method public setVideoEncoderFactory(Lorg/webrtc/VideoEncoderFactory;)Lorg/webrtc/PeerConnectionFactory$Builder;
    .locals 0

    .line 175
    iput-object p1, p0, Lorg/webrtc/PeerConnectionFactory$Builder;->encoderFactory:Lorg/webrtc/VideoEncoderFactory;

    return-object p0
.end method
