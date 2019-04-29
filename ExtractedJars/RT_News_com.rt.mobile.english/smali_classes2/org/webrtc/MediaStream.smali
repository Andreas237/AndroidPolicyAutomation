.class public Lorg/webrtc/MediaStream;
.super Ljava/lang/Object;
.source "MediaStream.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "MediaStream"


# instance fields
.field public final audioTracks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/webrtc/AudioTrack;",
            ">;"
        }
    .end annotation
.end field

.field final nativeStream:J

.field public final preservedVideoTracks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/webrtc/VideoTrack;",
            ">;"
        }
    .end annotation
.end field

.field public final videoTracks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/webrtc/VideoTrack;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(J)V
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/webrtc/MediaStream;->audioTracks:Ljava/util/List;

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/webrtc/MediaStream;->videoTracks:Ljava/util/List;

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/webrtc/MediaStream;->preservedVideoTracks:Ljava/util/List;

    .line 29
    iput-wide p1, p0, Lorg/webrtc/MediaStream;->nativeStream:J

    return-void
.end method

.method private static native nativeAddAudioTrackToNativeStream(JJ)Z
.end method

.method private static native nativeAddVideoTrackToNativeStream(JJ)Z
.end method

.method private static native nativeGetId(J)Ljava/lang/String;
.end method

.method private static native nativeRemoveAudioTrack(JJ)Z
.end method

.method private static native nativeRemoveVideoTrack(JJ)Z
.end method

.method private static removeMediaStreamTrack(Ljava/util/List;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/webrtc/MediaStreamTrack;",
            ">;J)V"
        }
    .end annotation

    .line 121
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 122
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 123
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/webrtc/MediaStreamTrack;

    .line 124
    iget-wide v1, v0, Lorg/webrtc/MediaStreamTrack;->nativeTrack:J

    cmp-long v3, v1, p1

    if-nez v3, :cond_0

    .line 125
    invoke-virtual {v0}, Lorg/webrtc/MediaStreamTrack;->dispose()V

    .line 126
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    return-void

    :cond_1
    const-string p0, "MediaStream"

    const-string p1, "Couldn\'t not find track"

    .line 130
    invoke-static {p0, p1}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method addNativeAudioTrack(J)V
    .locals 2
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 101
    iget-object v0, p0, Lorg/webrtc/MediaStream;->audioTracks:Ljava/util/List;

    new-instance v1, Lorg/webrtc/AudioTrack;

    invoke-direct {v1, p1, p2}, Lorg/webrtc/AudioTrack;-><init>(J)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method addNativeVideoTrack(J)V
    .locals 2
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 106
    iget-object v0, p0, Lorg/webrtc/MediaStream;->videoTracks:Ljava/util/List;

    new-instance v1, Lorg/webrtc/VideoTrack;

    invoke-direct {v1, p1, p2}, Lorg/webrtc/VideoTrack;-><init>(J)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addPreservedTrack(Lorg/webrtc/VideoTrack;)Z
    .locals 4

    .line 52
    iget-wide v0, p0, Lorg/webrtc/MediaStream;->nativeStream:J

    iget-wide v2, p1, Lorg/webrtc/VideoTrack;->nativeTrack:J

    invoke-static {v0, v1, v2, v3}, Lorg/webrtc/MediaStream;->nativeAddVideoTrackToNativeStream(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lorg/webrtc/MediaStream;->preservedVideoTracks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public addTrack(Lorg/webrtc/AudioTrack;)Z
    .locals 4

    .line 33
    iget-wide v0, p0, Lorg/webrtc/MediaStream;->nativeStream:J

    iget-wide v2, p1, Lorg/webrtc/AudioTrack;->nativeTrack:J

    invoke-static {v0, v1, v2, v3}, Lorg/webrtc/MediaStream;->nativeAddAudioTrackToNativeStream(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 34
    iget-object v0, p0, Lorg/webrtc/MediaStream;->audioTracks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public addTrack(Lorg/webrtc/VideoTrack;)Z
    .locals 4

    .line 41
    iget-wide v0, p0, Lorg/webrtc/MediaStream;->nativeStream:J

    iget-wide v2, p1, Lorg/webrtc/VideoTrack;->nativeTrack:J

    invoke-static {v0, v1, v2, v3}, Lorg/webrtc/MediaStream;->nativeAddVideoTrackToNativeStream(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    iget-object v0, p0, Lorg/webrtc/MediaStream;->videoTracks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public dispose()V
    .locals 2
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 73
    :goto_0
    iget-object v0, p0, Lorg/webrtc/MediaStream;->audioTracks:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 74
    iget-object v0, p0, Lorg/webrtc/MediaStream;->audioTracks:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/webrtc/AudioTrack;

    .line 75
    invoke-virtual {p0, v0}, Lorg/webrtc/MediaStream;->removeTrack(Lorg/webrtc/AudioTrack;)Z

    .line 76
    invoke-virtual {v0}, Lorg/webrtc/AudioTrack;->dispose()V

    goto :goto_0

    .line 78
    :cond_0
    :goto_1
    iget-object v0, p0, Lorg/webrtc/MediaStream;->videoTracks:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 79
    iget-object v0, p0, Lorg/webrtc/MediaStream;->videoTracks:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/webrtc/VideoTrack;

    .line 80
    invoke-virtual {p0, v0}, Lorg/webrtc/MediaStream;->removeTrack(Lorg/webrtc/VideoTrack;)Z

    .line 81
    invoke-virtual {v0}, Lorg/webrtc/VideoTrack;->dispose()V

    goto :goto_1

    .line 84
    :cond_1
    :goto_2
    iget-object v0, p0, Lorg/webrtc/MediaStream;->preservedVideoTracks:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 85
    iget-object v0, p0, Lorg/webrtc/MediaStream;->preservedVideoTracks:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/webrtc/VideoTrack;

    invoke-virtual {p0, v0}, Lorg/webrtc/MediaStream;->removeTrack(Lorg/webrtc/VideoTrack;)Z

    goto :goto_2

    .line 87
    :cond_2
    iget-wide v0, p0, Lorg/webrtc/MediaStream;->nativeStream:J

    invoke-static {v0, v1}, Lorg/webrtc/JniCommon;->nativeReleaseRef(J)V

    return-void
.end method

.method public getId()Ljava/lang/String;
    .locals 2

    .line 91
    iget-wide v0, p0, Lorg/webrtc/MediaStream;->nativeStream:J

    invoke-static {v0, v1}, Lorg/webrtc/MediaStream;->nativeGetId(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method removeAudioTrack(J)V
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 111
    iget-object v0, p0, Lorg/webrtc/MediaStream;->audioTracks:Ljava/util/List;

    invoke-static {v0, p1, p2}, Lorg/webrtc/MediaStream;->removeMediaStreamTrack(Ljava/util/List;J)V

    return-void
.end method

.method public removeTrack(Lorg/webrtc/AudioTrack;)Z
    .locals 4

    .line 60
    iget-object v0, p0, Lorg/webrtc/MediaStream;->audioTracks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 61
    iget-wide v0, p0, Lorg/webrtc/MediaStream;->nativeStream:J

    iget-wide v2, p1, Lorg/webrtc/AudioTrack;->nativeTrack:J

    invoke-static {v0, v1, v2, v3}, Lorg/webrtc/MediaStream;->nativeRemoveAudioTrack(JJ)Z

    move-result p1

    return p1
.end method

.method public removeTrack(Lorg/webrtc/VideoTrack;)Z
    .locals 4

    .line 65
    iget-object v0, p0, Lorg/webrtc/MediaStream;->videoTracks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 66
    iget-object v0, p0, Lorg/webrtc/MediaStream;->preservedVideoTracks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 67
    iget-wide v0, p0, Lorg/webrtc/MediaStream;->nativeStream:J

    iget-wide v2, p1, Lorg/webrtc/VideoTrack;->nativeTrack:J

    invoke-static {v0, v1, v2, v3}, Lorg/webrtc/MediaStream;->nativeRemoveVideoTrack(JJ)Z

    move-result p1

    return p1
.end method

.method removeVideoTrack(J)V
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 116
    iget-object v0, p0, Lorg/webrtc/MediaStream;->videoTracks:Ljava/util/List;

    invoke-static {v0, p1, p2}, Lorg/webrtc/MediaStream;->removeMediaStreamTrack(Ljava/util/List;J)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":A="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/webrtc/MediaStream;->audioTracks:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":V="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/webrtc/MediaStream;->videoTracks:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
