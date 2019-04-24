.class Lo/cgh$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cgh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cgh;


# direct methods
.method constructor <init>(Lo/cgh;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lo/cgh$1;->d:Lo/cgh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5

    .line 69
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onServiceConnected name:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    iget-object v0, p0, Lo/cgh$1;->d:Lo/cgh;

    invoke-static {p2}, Lcom/android/mediacenter/localmusic/IMediaPlaybackService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/android/mediacenter/localmusic/IMediaPlaybackService;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cgh;->e(Lo/cgh;Lcom/android/mediacenter/localmusic/IMediaPlaybackService;)Lcom/android/mediacenter/localmusic/IMediaPlaybackService;

    .line 72
    :try_start_0
    iget-object v0, p0, Lo/cgh$1;->d:Lo/cgh;

    invoke-static {v0}, Lo/cgh;->e(Lo/cgh;)Lcom/android/mediacenter/localmusic/IMediaPlaybackService;

    move-result-object v0

    invoke-interface {v0}, Lcom/android/mediacenter/localmusic/IMediaPlaybackService;->getMediaSessionToken()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v4

    .line 73
    if-nez v4, :cond_0

    .line 74
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Empty token!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    return-void

    .line 77
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/cgh$1;->d:Lo/cgh;

    new-instance v1, Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, v4}, Landroid/support/v4/media/session/MediaControllerCompat;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    invoke-static {v0, v1}, Lo/cgh;->a(Lo/cgh;Landroid/support/v4/media/session/MediaControllerCompat;)Landroid/support/v4/media/session/MediaControllerCompat;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 80
    goto :goto_0

    .line 78
    :catch_0
    move-exception v4

    .line 79
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Make mediaControllerCompat RemoteException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    :goto_0
    iget-object v0, p0, Lo/cgh$1;->d:Lo/cgh;

    invoke-static {v0}, Lo/cgh;->a(Lo/cgh;)Landroid/support/v4/media/session/MediaControllerCompat;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 82
    iget-object v0, p0, Lo/cgh$1;->d:Lo/cgh;

    invoke-static {v0}, Lo/cgh;->a(Lo/cgh;)Landroid/support/v4/media/session/MediaControllerCompat;

    move-result-object v0

    iget-object v1, p0, Lo/cgh$1;->d:Lo/cgh;

    invoke-static {v1}, Lo/cgh;->d(Lo/cgh;)Landroid/support/v4/media/session/MediaControllerCompat$Callback;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaControllerCompat;->registerCallback(Landroid/support/v4/media/session/MediaControllerCompat$Callback;)V

    .line 83
    iget-object v0, p0, Lo/cgh$1;->d:Lo/cgh;

    iget-object v1, p0, Lo/cgh$1;->d:Lo/cgh;

    invoke-static {v1}, Lo/cgh;->a(Lo/cgh;)Landroid/support/v4/media/session/MediaControllerCompat;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getPlaybackState()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cgh;->e(Lo/cgh;Landroid/support/v4/media/session/PlaybackStateCompat;)V

    .line 84
    iget-object v0, p0, Lo/cgh$1;->d:Lo/cgh;

    iget-object v1, p0, Lo/cgh$1;->d:Lo/cgh;

    invoke-static {v1}, Lo/cgh;->a(Lo/cgh;)Landroid/support/v4/media/session/MediaControllerCompat;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaControllerCompat;->getMetadata()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cgh;->b(Lo/cgh;Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 86
    :cond_1
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 4

    .line 90
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onServiceDisconnected name:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    return-void
.end method
