.class Lo/diw$b;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/diw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic d:Lo/diw;

.field e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lo/diw;Landroid/content/Context;Landroid/os/Handler;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lo/diw$b;->d:Lo/diw;

    .line 194
    invoke-direct {p0, p3}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 195
    iput-object p2, p0, Lo/diw$b;->e:Landroid/content/Context;

    .line 196
    return-void
.end method


# virtual methods
.method public deliverSelfNotifications()Z
    .locals 1

    .line 200
    invoke-super {p0}, Landroid/database/ContentObserver;->deliverSelfNotifications()Z

    move-result v0

    return v0
.end method

.method public onChange(Z)V
    .locals 6

    .line 205
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onChange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    .line 207
    iget-object v0, p0, Lo/diw$b;->e:Landroid/content/Context;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/media/AudioManager;

    .line 208
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v5

    .line 209
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u97f3\u91cf\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    iget-object v0, p0, Lo/diw$b;->d:Lo/diw;

    invoke-static {v0}, Lo/diw;->d(Lo/diw;)Landroid/media/session/MediaController;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/diw$b;->d:Lo/diw;

    invoke-static {v0}, Lo/diw;->d(Lo/diw;)Landroid/media/session/MediaController;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getPlaybackInfo()Landroid/media/session/MediaController$PlaybackInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 212
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onChange Maxvolume:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/diw$b;->d:Lo/diw;

    invoke-static {v3}, Lo/diw;->d(Lo/diw;)Landroid/media/session/MediaController;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/session/MediaController;->getPlaybackInfo()Landroid/media/session/MediaController$PlaybackInfo;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/session/MediaController$PlaybackInfo;->getMaxVolume()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  currentvolume : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/diw$b;->d:Lo/diw;

    invoke-static {v3}, Lo/diw;->d(Lo/diw;)Landroid/media/session/MediaController;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/session/MediaController;->getPlaybackInfo()Landroid/media/session/MediaController$PlaybackInfo;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/session/MediaController$PlaybackInfo;->getCurrentVolume()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    iget-object v0, p0, Lo/diw$b;->d:Lo/diw;

    invoke-static {v0}, Lo/diw;->a(Lo/diw;)I

    move-result v0

    if-eq v5, v0, :cond_1

    .line 215
    iget-object v0, p0, Lo/diw$b;->d:Lo/diw;

    invoke-static {v0}, Lo/diw;->e(Lo/diw;)Lo/dir$e;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 216
    iget-object v0, p0, Lo/diw$b;->d:Lo/diw;

    invoke-static {v0}, Lo/diw;->e(Lo/diw;)Lo/dir$e;

    move-result-object v0

    invoke-interface {v0}, Lo/dir$e;->d()V

    .line 218
    :cond_0
    iget-object v0, p0, Lo/diw$b;->d:Lo/diw;

    invoke-static {v0, v5}, Lo/diw;->d(Lo/diw;I)I

    .line 221
    :cond_1
    return-void
.end method
