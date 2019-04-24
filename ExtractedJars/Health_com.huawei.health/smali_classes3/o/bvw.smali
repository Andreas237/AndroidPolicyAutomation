.class public Lo/bvw;
.super Lo/bvu;
.source "SourceFile"


# instance fields
.field private a:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 27
    invoke-direct {p0, p1}, Lo/bvu;-><init>(Landroid/content/Context;)V

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lo/bvw;->a:I

    .line 28
    return-void
.end method


# virtual methods
.method public varargs b([Ljava/lang/String;)Lo/bvz;
    .locals 1
    .param p1    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 56
    const/4 v0, 0x0

    iput v0, p0, Lo/bvw;->a:I

    .line 57
    invoke-super {p0, p1}, Lo/bvu;->b([Ljava/lang/String;)Lo/bvz;

    move-result-object v0

    return-object v0
.end method

.method public varargs c([Ljava/lang/String;)Lo/bvz;
    .locals 1
    .param p1    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/bvw;->a:I

    .line 46
    invoke-super {p0, p1}, Lo/bvu;->c([Ljava/lang/String;)Lo/bvz;

    move-result-object v0

    return-object v0
.end method

.method public d()Lo/bvz;
    .locals 1

    .line 114
    const/4 v0, 0x0

    iput v0, p0, Lo/bvw;->a:I

    .line 115
    invoke-super {p0}, Lo/bvu;->d()Lo/bvz;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/util/List;)Lo/bvz;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Lo/bvz;"
        }
    .end annotation

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/bvw;->a:I

    .line 52
    invoke-super {p0, p1}, Lo/bvu;->d(Ljava/util/List;)Lo/bvz;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/util/List;)Lo/bvz;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Lo/bvz;"
        }
    .end annotation

    .line 61
    const/4 v0, 0x0

    iput v0, p0, Lo/bvw;->a:I

    .line 62
    invoke-super {p0, p1}, Lo/bvu;->e(Ljava/util/List;)Lo/bvz;

    move-result-object v0

    return-object v0
.end method

.method public i()Lo/bvz;
    .locals 1

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lo/bvw;->a:I

    .line 33
    invoke-super {p0}, Lo/bvu;->i()Lo/bvz;

    move-result-object v0

    return-object v0
.end method

.method public k()Lo/bvz;
    .locals 2

    .line 80
    iget-object v0, p0, Lo/bvw;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 81
    iget-object v0, p0, Lo/bvw;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 82
    iget-object v0, p0, Lo/bvw;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    iput v0, p0, Lo/bvw;->a:I

    .line 84
    :cond_0
    return-object p0
.end method

.method public l()Lo/bvz;
    .locals 5

    .line 89
    const-string v0, "VedioMediaHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "contin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    iget-object v0, p0, Lo/bvw;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 92
    :try_start_0
    invoke-virtual {p0}, Lo/bvw;->s()Ljava/lang/String;

    move-result-object v4

    .line 93
    const-string v0, "VedioMediaHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "contin  currentName == "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    iget-object v0, p0, Lo/bvw;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 95
    iget-object v0, p0, Lo/bvw;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0, v4}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lo/bvw;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 97
    iget-object v0, p0, Lo/bvw;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    .line 98
    const-string v0, "VedioMediaHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "contin  mCurrentPosition = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/bvw;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    iget v0, p0, Lo/bvw;->a:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 100
    iget-object v0, p0, Lo/bvw;->e:Landroid/media/MediaPlayer;

    iget v1, p0, Lo/bvw;->a:I

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 102
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/bvw;->a:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    goto :goto_0

    .line 103
    :catch_0
    move-exception v4

    .line 104
    const-string v0, "VedioMediaHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDataSource fail -- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    :goto_0
    iget-object v0, p0, Lo/bvw;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 108
    :cond_1
    return-object p0
.end method
