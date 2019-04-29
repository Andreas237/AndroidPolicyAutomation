.class public Lorg/webrtc/VideoTrack;
.super Lorg/webrtc/MediaStreamTrack;
.source "VideoTrack.java"


# instance fields
.field private final sinks:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Lorg/webrtc/VideoSink;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2}, Lorg/webrtc/MediaStreamTrack;-><init>(J)V

    .line 19
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Lorg/webrtc/VideoTrack;->sinks:Ljava/util/IdentityHashMap;

    return-void
.end method

.method private static native nativeAddSink(JJ)V
.end method

.method private static native nativeFreeSink(J)V
.end method

.method private static native nativeRemoveSink(JJ)V
.end method

.method private static native nativeWrapSink(Lorg/webrtc/VideoSink;)J
.end method


# virtual methods
.method public addSink(Lorg/webrtc/VideoSink;)V
    .locals 4

    if-nez p1, :cond_0

    .line 35
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The VideoSink is not allowed to be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 39
    :cond_0
    iget-object v0, p0, Lorg/webrtc/VideoTrack;->sinks:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 40
    invoke-static {p1}, Lorg/webrtc/VideoTrack;->nativeWrapSink(Lorg/webrtc/VideoSink;)J

    move-result-wide v0

    .line 41
    iget-object v2, p0, Lorg/webrtc/VideoTrack;->sinks:Ljava/util/IdentityHashMap;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    iget-wide v2, p0, Lorg/webrtc/VideoTrack;->nativeTrack:J

    invoke-static {v2, v3, v0, v1}, Lorg/webrtc/VideoTrack;->nativeAddSink(JJ)V

    :cond_1
    return-void
.end method

.method public dispose()V
    .locals 5

    .line 61
    iget-object v0, p0, Lorg/webrtc/VideoTrack;->sinks:Ljava/util/IdentityHashMap;

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 62
    iget-wide v3, p0, Lorg/webrtc/VideoTrack;->nativeTrack:J

    invoke-static {v3, v4, v1, v2}, Lorg/webrtc/VideoTrack;->nativeRemoveSink(JJ)V

    .line 63
    invoke-static {v1, v2}, Lorg/webrtc/VideoTrack;->nativeFreeSink(J)V

    goto :goto_0

    .line 65
    :cond_0
    iget-object v0, p0, Lorg/webrtc/VideoTrack;->sinks:Ljava/util/IdentityHashMap;

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->clear()V

    .line 66
    invoke-super {p0}, Lorg/webrtc/MediaStreamTrack;->dispose()V

    return-void
.end method

.method public removeSink(Lorg/webrtc/VideoSink;)V
    .locals 4

    .line 52
    iget-object v0, p0, Lorg/webrtc/VideoTrack;->sinks:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_0

    .line 54
    iget-wide v0, p0, Lorg/webrtc/VideoTrack;->nativeTrack:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lorg/webrtc/VideoTrack;->nativeRemoveSink(JJ)V

    .line 55
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lorg/webrtc/VideoTrack;->nativeFreeSink(J)V

    :cond_0
    return-void
.end method
