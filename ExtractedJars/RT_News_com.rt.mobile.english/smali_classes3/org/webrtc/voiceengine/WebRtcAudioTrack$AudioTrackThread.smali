.class Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;
.super Ljava/lang/Thread;
.source "WebRtcAudioTrack.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/voiceengine/WebRtcAudioTrack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AudioTrackThread"
.end annotation


# instance fields
.field private volatile keepAlive:Z

.field final synthetic this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;


# direct methods
.method public constructor <init>(Lorg/webrtc/voiceengine/WebRtcAudioTrack;Ljava/lang/String;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    .line 135
    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 132
    iput-boolean p1, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->keepAlive:Z

    return-void
.end method

.method private writeOnLollipop(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    const/4 v0, 0x0

    .line 203
    invoke-virtual {p1, p2, p3, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p1

    return p1
.end method

.method private writePreLollipop(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I
    .locals 1

    .line 207
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p2

    invoke-virtual {p1, v0, p2, p3}, Landroid/media/AudioTrack;->write([BII)I

    move-result p1

    return p1
.end method


# virtual methods
.method public run()V
    .locals 7

    const/16 v0, -0x13

    .line 140
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    const-string v0, "WebRtcAudioTrack"

    .line 141
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AudioTrackThread"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lorg/webrtc/voiceengine/WebRtcAudioUtils;->getThreadInfo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    iget-object v0, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    invoke-static {v0}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$000(Lorg/webrtc/voiceengine/WebRtcAudioTrack;)Landroid/media/AudioTrack;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x3

    if-ne v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$100(Z)V

    .line 146
    iget-object v0, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    invoke-static {v0}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$200(Lorg/webrtc/voiceengine/WebRtcAudioTrack;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    .line 148
    :goto_1
    iget-boolean v3, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->keepAlive:Z

    if-eqz v3, :cond_5

    .line 152
    iget-object v3, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    iget-object v4, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    invoke-static {v4}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$300(Lorg/webrtc/voiceengine/WebRtcAudioTrack;)J

    move-result-wide v4

    invoke-static {v3, v0, v4, v5}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$400(Lorg/webrtc/voiceengine/WebRtcAudioTrack;IJ)V

    .line 156
    iget-object v3, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    invoke-static {v3}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$200(Lorg/webrtc/voiceengine/WebRtcAudioTrack;)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v3

    if-gt v0, v3, :cond_1

    move v3, v1

    goto :goto_2

    :cond_1
    move v3, v2

    :goto_2
    invoke-static {v3}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$100(Z)V

    .line 157
    invoke-static {}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$500()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 158
    iget-object v3, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    invoke-static {v3}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$200(Lorg/webrtc/voiceengine/WebRtcAudioTrack;)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 159
    iget-object v3, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    invoke-static {v3}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$200(Lorg/webrtc/voiceengine/WebRtcAudioTrack;)Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-object v4, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    invoke-static {v4}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$600(Lorg/webrtc/voiceengine/WebRtcAudioTrack;)[B

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 160
    iget-object v3, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    invoke-static {v3}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$200(Lorg/webrtc/voiceengine/WebRtcAudioTrack;)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 163
    :cond_2
    invoke-static {}, Lorg/webrtc/voiceengine/WebRtcAudioUtils;->runningOnLollipopOrHigher()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 164
    iget-object v3, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    invoke-static {v3}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$000(Lorg/webrtc/voiceengine/WebRtcAudioTrack;)Landroid/media/AudioTrack;

    move-result-object v3

    iget-object v4, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    invoke-static {v4}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$200(Lorg/webrtc/voiceengine/WebRtcAudioTrack;)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-direct {p0, v3, v4, v0}, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->writeOnLollipop(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    move-result v3

    goto :goto_3

    .line 166
    :cond_3
    iget-object v3, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    invoke-static {v3}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$000(Lorg/webrtc/voiceengine/WebRtcAudioTrack;)Landroid/media/AudioTrack;

    move-result-object v3

    iget-object v4, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    invoke-static {v4}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$200(Lorg/webrtc/voiceengine/WebRtcAudioTrack;)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-direct {p0, v3, v4, v0}, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->writePreLollipop(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    move-result v3

    :goto_3
    if-eq v3, v0, :cond_4

    const-string v4, "WebRtcAudioTrack"

    .line 169
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AudioTrack.write played invalid number of bytes: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-gez v3, :cond_4

    .line 173
    iput-boolean v2, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->keepAlive:Z

    .line 174
    iget-object v4, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AudioTrack.write failed: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$700(Lorg/webrtc/voiceengine/WebRtcAudioTrack;Ljava/lang/String;)V

    .line 180
    :cond_4
    iget-object v3, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    invoke-static {v3}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$200(Lorg/webrtc/voiceengine/WebRtcAudioTrack;)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    goto/16 :goto_1

    .line 190
    :cond_5
    iget-object v0, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    invoke-static {v0}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$000(Lorg/webrtc/voiceengine/WebRtcAudioTrack;)Landroid/media/AudioTrack;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v0, "WebRtcAudioTrack"

    const-string v1, "Calling AudioTrack.stop..."

    .line 191
    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    :try_start_0
    iget-object v0, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioTrack;

    invoke-static {v0}, Lorg/webrtc/voiceengine/WebRtcAudioTrack;->access$000(Lorg/webrtc/voiceengine/WebRtcAudioTrack;)Landroid/media/AudioTrack;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    const-string v0, "WebRtcAudioTrack"

    const-string v1, "AudioTrack.stop is done."

    .line 194
    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    const-string v1, "WebRtcAudioTrack"

    .line 196
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AudioTrack.stop failed: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_4
    return-void
.end method

.method public stopThread()V
    .locals 2

    const-string v0, "WebRtcAudioTrack"

    const-string v1, "stopThread"

    .line 213
    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 214
    iput-boolean v0, p0, Lorg/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->keepAlive:Z

    return-void
.end method
