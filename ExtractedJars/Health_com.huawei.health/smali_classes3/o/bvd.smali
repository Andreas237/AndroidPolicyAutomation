.class public Lo/bvd;
.super Lo/bvu;
.source "SourceFile"

# interfaces
.implements Lo/bvv;
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field private a:Ljava/lang/String;

.field private f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 21
    invoke-direct {p0, p1}, Lo/bvu;-><init>(Landroid/content/Context;)V

    .line 16
    const-string v0, "DeviceGuideHelper"

    iput-object v0, p0, Lo/bvd;->a:Ljava/lang/String;

    .line 18
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bvd;->f:Z

    .line 22
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bvd;->c:Z

    .line 23
    iget-object v0, p0, Lo/bvd;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    .line 24
    iget-object v0, p0, Lo/bvd;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 25
    iget-object v0, p0, Lo/bvd;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 26
    return-void
.end method


# virtual methods
.method public a()Lo/bvv;
    .locals 4

    .line 107
    iget-object v0, p0, Lo/bvd;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7ee7\u7eed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    iget-object v0, p0, Lo/bvd;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-boolean v0, p0, Lo/bvd;->f:Z

    if-eqz v0, :cond_0

    .line 109
    iget-object v0, p0, Lo/bvd;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 111
    :cond_0
    return-object p0
.end method

.method public b()Lo/bvv;
    .locals 4

    .line 95
    iget-object v0, p0, Lo/bvd;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6682\u505c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    iget-object v0, p0, Lo/bvd;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/bvd;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lo/bvd;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 98
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bvd;->f:Z

    goto :goto_0

    .line 100
    :cond_0
    iget-object v0, p0, Lo/bvd;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6682\u505c\u5931\u8d25, \u6ca1\u6709\u6b63\u5728\u64ad\u653e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bvd;->f:Z

    .line 103
    :goto_0
    return-object p0
.end method

.method public c()Lo/bvv;
    .locals 5

    .line 36
    iget-object v0, p0, Lo/bvd;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8054\u52a8\u6a21\u5f0f\uff0c\u5207\u6362\u666e\u901a\u6a21\u5f0f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    iget-object v0, p0, Lo/bvd;->e:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 38
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "F188"

    iget-object v2, p0, Lo/bvd;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvd;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lo/bvd;->b([Ljava/lang/String;)Lo/bvz;

    .line 39
    invoke-virtual {p0}, Lo/bvd;->i()Lo/bvz;

    .line 41
    :cond_0
    return-object p0
.end method

.method public e()Lo/bvv;
    .locals 5

    .line 46
    iget-object v0, p0, Lo/bvd;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8981\u52a8\u8d77\u6765"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    iget-object v0, p0, Lo/bvd;->e:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 48
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "F181"

    iget-object v2, p0, Lo/bvd;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvd;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lo/bvd;->b([Ljava/lang/String;)Lo/bvz;

    .line 49
    invoke-virtual {p0}, Lo/bvd;->i()Lo/bvz;

    .line 51
    :cond_0
    return-object p0
.end method

.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 0

    .line 32
    return-void
.end method
