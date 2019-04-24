.class public Lo/bri;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;

.field private c:J

.field private d:Ljava/lang/String;

.field e:Landroid/media/MediaRecorder;

.field private f:Landroid/os/Handler;

.field private h:Ljava/io/File;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bri;->a:Z

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bri;->d:Ljava/lang/String;

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bri;->b:Ljava/lang/String;

    .line 46
    iput-object p1, p0, Lo/bri;->f:Landroid/os/Handler;

    .line 47
    return-void
.end method

.method static synthetic b(Lo/bri;)Z
    .locals 1

    .line 23
    iget-boolean v0, p0, Lo/bri;->a:Z

    return v0
.end method

.method static synthetic c(Lo/bri;)J
    .locals 2

    .line 23
    iget-wide v0, p0, Lo/bri;->c:J

    return-wide v0
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 181
    new-instance v4, Landroid/text/format/Time;

    invoke-direct {v4}, Landroid/text/format/Time;-><init>()V

    .line 182
    invoke-virtual {v4}, Landroid/text/format/Time;->setToNow()V

    .line 183
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Landroid/text/format/Time;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0xf

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".amr"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lo/bri;)Landroid/os/Handler;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/bri;->f:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 5

    .line 150
    const-string v0, "VoiceRecorderUtil"

    const-string v1, "stopRecoding()"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_4

    .line 152
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bri;->a:Z

    .line 153
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->stop()V

    .line 154
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    .line 155
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    .line 157
    iget-object v0, p0, Lo/bri;->h:Ljava/io/File;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bri;->h:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bri;->h:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-nez v0, :cond_1

    .line 158
    :cond_0
    const/4 v0, -0x1

    return v0

    .line 160
    :cond_1
    iget-object v0, p0, Lo/bri;->h:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    .line 161
    iget-object v0, p0, Lo/bri;->h:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_2

    .line 162
    const-string v0, "VoiceRecorderUtil"

    const-string v1, "file.delete() error"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    :cond_2
    const/4 v0, -0x1

    return v0

    .line 166
    :cond_3
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iget-wide v2, p0, Lo/bri;->c:J

    sub-long/2addr v0, v2

    long-to-int v0, v0

    div-int/lit16 v4, v0, 0x3e8

    .line 167
    const-string v0, "VoiceRecorderUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "voice recording finished. seconds:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " file length:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bri;->h:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    return v4

    .line 170
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 192
    iget-object v0, p0, Lo/bri;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b(Landroid/content/Context;Landroid/view/View;)Ljava/lang/String;
    .locals 4

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bri;->h:Ljava/io/File;

    .line 57
    :try_start_0
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_0

    .line 58
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    .line 61
    :cond_0
    new-instance v0, Landroid/media/MediaRecorder;

    invoke-direct {v0}, Landroid/media/MediaRecorder;-><init>()V

    iput-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    .line 62
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_1

    .line 63
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setAudioSource(I)V

    .line 64
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setOutputFormat(I)V

    .line 65
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setAudioEncoder(I)V

    .line 66
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setAudioChannels(I)V

    .line 67
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    const/16 v1, 0x1f40

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setAudioSamplingRate(I)V

    .line 68
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setAudioEncodingBitRate(I)V

    .line 74
    const-string v0, "voice"

    invoke-direct {p0, v0}, Lo/bri;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bri;->b:Ljava/lang/String;

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bri;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bri;->d:Ljava/lang/String;

    .line 76
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lo/bri;->d:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/bri;->h:Ljava/io/File;

    .line 77
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    iget-object v1, p0, Lo/bri;->h:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setOutputFile(Ljava/lang/String;)V

    .line 78
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->prepare()V

    .line 79
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bri;->a:Z

    .line 80
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->start()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    :cond_1
    goto :goto_0

    .line 82
    :catch_0
    move-exception v3

    .line 83
    const-string v0, "VoiceRecorderUtil"

    const-string v1, "prepare() failed"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    :goto_0
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iput-wide v0, p0, Lo/bri;->c:J

    .line 86
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lo/bri$1;

    invoke-direct {v1, p0, p2}, Lo/bri$1;-><init>(Lo/bri;Landroid/view/View;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 117
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 118
    const-string v0, "VoiceRecorderUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "start voice recording to file:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bri;->h:Ljava/io/File;

    if-nez v2, :cond_2

    const-string v2, "null"

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lo/bri;->h:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    iget-object v0, p0, Lo/bri;->h:Ljava/io/File;

    if-nez v0, :cond_3

    const/4 v0, 0x0

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lo/bri;->h:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method public c()V
    .locals 5

    .line 129
    const-string v0, "VoiceRecorderUtil"

    const-string v1, "discardRecording()"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_1

    .line 132
    :try_start_0
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->stop()V

    .line 133
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    .line 134
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    .line 135
    iget-object v0, p0, Lo/bri;->h:Ljava/io/File;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bri;->h:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bri;->h:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_0

    .line 136
    iget-object v0, p0, Lo/bri;->h:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 137
    const-string v0, "VoiceRecorderUtil"

    const-string v1, "file.delete() error"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 144
    :cond_0
    goto :goto_0

    .line 140
    :catch_0
    move-exception v4

    .line 141
    const-string v0, "VoiceRecorderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IllegalStateException e.getMessage(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    goto :goto_0

    .line 142
    :catch_1
    move-exception v4

    .line 143
    const-string v0, "VoiceRecorderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RuntimeException e.getMessage(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bri;->a:Z

    .line 147
    :cond_1
    return-void
.end method

.method public d()Z
    .locals 1

    .line 187
    iget-boolean v0, p0, Lo/bri;->a:Z

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 196
    iget-object v0, p0, Lo/bri;->b:Ljava/lang/String;

    return-object v0
.end method

.method protected finalize()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 174
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 175
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_0

    .line 176
    iget-object v0, p0, Lo/bri;->e:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    .line 178
    :cond_0
    return-void
.end method
