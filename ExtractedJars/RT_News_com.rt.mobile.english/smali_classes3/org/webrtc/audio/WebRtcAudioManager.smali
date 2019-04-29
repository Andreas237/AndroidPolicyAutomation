.class Lorg/webrtc/audio/WebRtcAudioManager;
.super Ljava/lang/Object;
.source "WebRtcAudioManager.java"


# static fields
.field private static final BITS_PER_SAMPLE:I = 0x10

.field private static final DEFAULT_FRAME_PER_BUFFER:I = 0x100

.field private static final DEFAULT_SAMPLE_RATE_HZ:I = 0x3e80

.field private static final TAG:Ljava/lang/String; = "WebRtcAudioManagerExternal"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static getAudioManager(Landroid/content/Context;)Landroid/media/AudioManager;
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    const-string v0, "audio"

    .line 39
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/media/AudioManager;

    return-object p0
.end method

.method static getInputBufferSize(Landroid/content/Context;Landroid/media/AudioManager;II)I
    .locals 0
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 53
    invoke-static {p0}, Lorg/webrtc/audio/WebRtcAudioManager;->isLowLatencyInputSupported(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 54
    invoke-static {p1}, Lorg/webrtc/audio/WebRtcAudioManager;->getLowLatencyFramesPerBuffer(Landroid/media/AudioManager;)I

    move-result p0

    goto :goto_0

    .line 55
    :cond_0
    invoke-static {p2, p3}, Lorg/webrtc/audio/WebRtcAudioManager;->getMinInputFrameSize(II)I

    move-result p0

    :goto_0
    return p0
.end method

.method private static getLowLatencyFramesPerBuffer(Landroid/media/AudioManager;)I
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    .line 98
    invoke-static {}, Lorg/webrtc/audio/WebRtcAudioUtils;->runningOnJellyBeanMR1OrHigher()Z

    move-result v0

    const/16 v1, 0x100

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-string v0, "android.media.property.OUTPUT_FRAMES_PER_BUFFER"

    .line 102
    invoke-virtual {p0, v0}, Landroid/media/AudioManager;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_0

    .line 103
    :cond_1
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    :goto_0
    return v1
.end method

.method private static getMinInputFrameSize(II)I
    .locals 2

    mul-int/lit8 v0, p1, 0x2

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    const/16 p1, 0x10

    goto :goto_0

    :cond_0
    const/16 p1, 0xc

    :goto_0
    const/4 v1, 0x2

    .line 125
    invoke-static {p0, p1, v1}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result p0

    div-int/2addr p0, v0

    return p0
.end method

.method private static getMinOutputFrameSize(II)I
    .locals 2

    mul-int/lit8 v0, p1, 0x2

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/16 p1, 0xc

    :goto_0
    const/4 v1, 0x2

    .line 113
    invoke-static {p0, p1, v1}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result p0

    div-int/2addr p0, v0

    return p0
.end method

.method static getOutputBufferSize(Landroid/content/Context;Landroid/media/AudioManager;II)I
    .locals 0
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 45
    invoke-static {p0}, Lorg/webrtc/audio/WebRtcAudioManager;->isLowLatencyOutputSupported(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 46
    invoke-static {p1}, Lorg/webrtc/audio/WebRtcAudioManager;->getLowLatencyFramesPerBuffer(Landroid/media/AudioManager;)I

    move-result p0

    goto :goto_0

    .line 47
    :cond_0
    invoke-static {p2, p3}, Lorg/webrtc/audio/WebRtcAudioManager;->getMinOutputFrameSize(II)I

    move-result p0

    :goto_0
    return p0
.end method

.method static getSampleRate(Landroid/media/AudioManager;)I
    .locals 3
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 77
    invoke-static {}, Lorg/webrtc/audio/WebRtcAudioUtils;->runningOnEmulator()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "WebRtcAudioManagerExternal"

    const-string v0, "Running emulator, overriding sample rate to 8 kHz."

    .line 78
    invoke-static {p0, v0}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p0, 0x1f40

    return p0

    .line 82
    :cond_0
    invoke-static {}, Lorg/webrtc/audio/WebRtcAudioUtils;->runningOnJellyBeanMR1OrHigher()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 83
    invoke-static {p0}, Lorg/webrtc/audio/WebRtcAudioManager;->getSampleRateOnJellyBeanMR10OrHigher(Landroid/media/AudioManager;)I

    move-result p0

    goto :goto_0

    :cond_1
    const/16 p0, 0x3e80

    :goto_0
    const-string v0, "WebRtcAudioManagerExternal"

    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sample rate is set to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " Hz"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    return p0
.end method

.method private static getSampleRateOnJellyBeanMR10OrHigher(Landroid/media/AudioManager;)I
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    const-string v0, "android.media.property.OUTPUT_SAMPLE_RATE"

    .line 91
    invoke-virtual {p0, v0}, Landroid/media/AudioManager;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const/16 p0, 0x3e80

    goto :goto_0

    .line 92
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    :goto_0
    return p0
.end method

.method private static isLowLatencyInputSupported(Landroid/content/Context;)Z
    .locals 1

    .line 67
    invoke-static {}, Lorg/webrtc/audio/WebRtcAudioUtils;->runningOnLollipopOrHigher()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lorg/webrtc/audio/WebRtcAudioManager;->isLowLatencyOutputSupported(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static isLowLatencyOutputSupported(Landroid/content/Context;)Z
    .locals 1

    .line 59
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v0, "android.hardware.audio.low_latency"

    invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method
