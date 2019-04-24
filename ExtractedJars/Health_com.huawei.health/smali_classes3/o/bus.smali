.class public Lo/bus;
.super Lo/bvu;
.source "SourceFile"

# interfaces
.implements Lo/bvy;
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field private a:Ljava/lang/String;

.field private f:I

.field private g:Ljava/util/List;

.field private h:I

.field private k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 33
    invoke-direct {p0, p1}, Lo/bvu;-><init>(Landroid/content/Context;)V

    .line 24
    const-string v0, "BeatHelper"

    iput-object v0, p0, Lo/bus;->a:Ljava/lang/String;

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lo/bus;->g:Ljava/util/List;

    .line 28
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bus;->k:Z

    .line 34
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bus;->c:Z

    .line 35
    iget-object v0, p0, Lo/bus;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    .line 36
    iget-object v0, p0, Lo/bus;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 37
    iget-object v0, p0, Lo/bus;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 38
    return-void
.end method

.method private g()V
    .locals 5

    .line 120
    iget-object v0, p0, Lo/bus;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 121
    iget-object v0, p0, Lo/bus;->g:Ljava/util/List;

    const-string v1, "B005"

    iget-object v2, p0, Lo/bus;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bus;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    iget-object v0, p0, Lo/bus;->g:Ljava/util/List;

    const-string v1, "B004"

    iget-object v2, p0, Lo/bus;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bus;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    iget-object v0, p0, Lo/bus;->g:Ljava/util/List;

    const-string v1, "B003"

    iget-object v2, p0, Lo/bus;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bus;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    iget-object v0, p0, Lo/bus;->g:Ljava/util/List;

    const-string v1, "B002"

    iget-object v2, p0, Lo/bus;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bus;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    iget-object v0, p0, Lo/bus;->g:Ljava/util/List;

    const-string v1, "B001"

    iget-object v2, p0, Lo/bus;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bus;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 129
    iget-object v0, p0, Lo/bus;->g:Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/bus;->e(Ljava/util/List;)Lo/bvz;

    .line 130
    invoke-virtual {p0}, Lo/bus;->i()Lo/bvz;

    .line 131
    return-void
.end method

.method public b()Lo/bvy;
    .locals 5

    .line 76
    iget-object v0, p0, Lo/bus;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 78
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "E069"

    iget-object v2, p0, Lo/bus;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bus;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lo/bus;->b([Ljava/lang/String;)Lo/bvz;

    .line 79
    invoke-virtual {p0}, Lo/bus;->i()Lo/bvz;

    .line 81
    :cond_0
    return-object p0
.end method

.method public b(I)Lo/bvy;
    .locals 6

    .line 41
    iput p1, p0, Lo/bus;->h:I

    .line 42
    iget-object v0, p0, Lo/bus;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 43
    new-array v4, p1, [Ljava/lang/String;

    .line 44
    const/4 v5, 0x0

    :goto_0
    if-ge v5, p1, :cond_1

    .line 46
    const/16 v0, 0x8

    if-le v5, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "B0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    add-int/lit8 v1, v5, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bus;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bus;->b:Ljava/lang/String;

    const-string v3, ".mp3"

    invoke-static {v0, v1, v2, v3}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "B00"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    add-int/lit8 v1, v5, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bus;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bus;->b:Ljava/lang/String;

    const-string v3, ".mp3"

    invoke-static {v0, v1, v2, v3}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    aput-object v0, v4, v5

    .line 44
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {p0, v4}, Lo/bus;->b([Ljava/lang/String;)Lo/bvz;

    .line 50
    :cond_2
    const/4 v0, -0x1

    iput v0, p0, Lo/bus;->i:I

    .line 51
    return-object p0
.end method

.method public b(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 154
    iget-object v0, p0, Lo/bus;->e:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 155
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lo/bus;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bus;->b:Ljava/lang/String;

    const-string v3, ".mp3"

    invoke-static {p1, v1, v2, v3}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lo/bus;->b([Ljava/lang/String;)Lo/bvz;

    .line 156
    invoke-virtual {p0}, Lo/bus;->i()Lo/bvz;

    .line 158
    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    .line 68
    const/4 v0, -0x1

    iput v0, p0, Lo/bus;->f:I

    .line 69
    iget-object v0, p0, Lo/bus;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 70
    invoke-virtual {p0}, Lo/bus;->n()Lo/bvz;

    .line 72
    :cond_0
    return-void
.end method

.method public d()Lo/bvz;
    .locals 1

    .line 86
    invoke-super {p0}, Lo/bvu;->d()Lo/bvz;

    move-result-object v0

    return-object v0
.end method

.method public e(I)Lo/bvy;
    .locals 1

    .line 110
    const/4 v0, -0x1

    iput v0, p0, Lo/bus;->f:I

    .line 111
    iget-object v0, p0, Lo/bus;->e:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 112
    const/16 v0, 0xa

    iput v0, p0, Lo/bus;->f:I

    .line 113
    invoke-virtual {p0, p1}, Lo/bus;->k(I)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bus;->e(Ljava/util/List;)Lo/bvz;

    .line 114
    invoke-virtual {p0}, Lo/bus;->i()Lo/bvz;

    .line 116
    :cond_0
    return-object p0
.end method

.method public e()V
    .locals 5

    .line 60
    iget-object v0, p0, Lo/bus;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 62
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "D011"

    iget-object v2, p0, Lo/bus;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bus;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lo/bus;->b([Ljava/lang/String;)Lo/bvz;

    .line 63
    invoke-virtual {p0}, Lo/bus;->i()Lo/bvz;

    .line 65
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 167
    invoke-super {p0, p1}, Lo/bvu;->e(Ljava/lang/String;)V

    .line 168
    invoke-direct {p0}, Lo/bus;->g()V

    .line 169
    return-void
.end method

.method public f()Lo/bvy;
    .locals 6

    .line 146
    iget-object v0, p0, Lo/bus;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7ee7\u7eed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    iget-object v0, p0, Lo/bus;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-boolean v0, p0, Lo/bus;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bus;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    int-to-double v0, v0

    iget-object v2, p0, Lo/bus;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v2

    int-to-double v2, v2

    const-wide v4, 0x3fe4cccccccccccdL    # 0.65

    mul-double/2addr v2, v4

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 148
    iget-object v0, p0, Lo/bus;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 150
    :cond_0
    return-object p0
.end method

.method public h()Lo/bvy;
    .locals 4

    .line 134
    iget-object v0, p0, Lo/bus;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6682\u505c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    iget-object v0, p0, Lo/bus;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/bus;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    iget-object v0, p0, Lo/bus;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 137
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bus;->k:Z

    goto :goto_0

    .line 139
    :cond_0
    iget-object v0, p0, Lo/bus;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6682\u505c\u5931\u8d25, \u6ca1\u6709\u6b63\u5728\u64ad\u653e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bus;->k:Z

    .line 142
    :goto_0
    return-object p0
.end method

.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 2

    .line 162
    iget v0, p0, Lo/bus;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/bus;->f:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    .line 163
    invoke-virtual {p0}, Lo/bus;->n()Lo/bvz;

    .line 165
    :cond_0
    return-void
.end method
