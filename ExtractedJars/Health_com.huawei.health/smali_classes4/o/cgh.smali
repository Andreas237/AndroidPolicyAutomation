.class public Lo/cgh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/support/v4/media/session/MediaControllerCompat;

.field private c:Landroid/content/ServiceConnection;

.field private d:Lcom/android/mediacenter/localmusic/IMediaPlaybackService;

.field private e:Landroid/support/v4/media/session/MediaControllerCompat$Callback;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgh;->d:Lcom/android/mediacenter/localmusic/IMediaPlaybackService;

    .line 44
    new-instance v0, Lo/cgh$4;

    invoke-direct {v0, p0}, Lo/cgh$4;-><init>(Lo/cgh;)V

    iput-object v0, p0, Lo/cgh;->e:Landroid/support/v4/media/session/MediaControllerCompat$Callback;

    .line 66
    new-instance v0, Lo/cgh$1;

    invoke-direct {v0, p0}, Lo/cgh$1;-><init>(Lo/cgh;)V

    iput-object v0, p0, Lo/cgh;->c:Landroid/content/ServiceConnection;

    .line 37
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 38
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.android.mediacenter"

    const-string v2, "com.android.mediacenter.localmusic.MediaPlaybackService"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 39
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/cgh;->c:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {v0, v4, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v5

    .line 40
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bind ret = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    return-void
.end method

.method static synthetic a(Lo/cgh;)Landroid/support/v4/media/session/MediaControllerCompat;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/cgh;->a:Landroid/support/v4/media/session/MediaControllerCompat;

    return-object v0
.end method

.method static synthetic a(Lo/cgh;Landroid/support/v4/media/session/MediaControllerCompat;)Landroid/support/v4/media/session/MediaControllerCompat;
    .locals 0

    .line 25
    iput-object p1, p0, Lo/cgh;->a:Landroid/support/v4/media/session/MediaControllerCompat;

    return-object p1
.end method

.method private a(Landroid/support/v4/media/session/PlaybackStateCompat;)Ljava/lang/String;
    .locals 1

    .line 102
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getState()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 104
    :pswitch_0
    const-string v0, "Playing"

    return-object v0

    .line 106
    :pswitch_1
    const-string v0, "Paused"

    return-object v0

    .line 108
    :pswitch_2
    const-string v0, "Stopped"

    return-object v0

    .line 110
    :goto_0
    const-string v0, "Other state, just as Paused"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic b(Lo/cgh;Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/cgh;->e(Landroid/support/v4/media/MediaMetadataCompat;)V

    return-void
.end method

.method static synthetic c(Lo/cgh;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lo/cgh;->e()V

    return-void
.end method

.method static synthetic d(Lo/cgh;)Landroid/support/v4/media/session/MediaControllerCompat$Callback;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/cgh;->e:Landroid/support/v4/media/session/MediaControllerCompat$Callback;

    return-object v0
.end method

.method static synthetic e(Lo/cgh;)Lcom/android/mediacenter/localmusic/IMediaPlaybackService;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/cgh;->d:Lcom/android/mediacenter/localmusic/IMediaPlaybackService;

    return-object v0
.end method

.method static synthetic e(Lo/cgh;Lcom/android/mediacenter/localmusic/IMediaPlaybackService;)Lcom/android/mediacenter/localmusic/IMediaPlaybackService;
    .locals 0

    .line 25
    iput-object p1, p0, Lo/cgh;->d:Lcom/android/mediacenter/localmusic/IMediaPlaybackService;

    return-object p1
.end method

.method private e()V
    .locals 2

    .line 140
    iget-object v0, p0, Lo/cgh;->a:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Lo/cgh;->a:Landroid/support/v4/media/session/MediaControllerCompat;

    iget-object v1, p0, Lo/cgh;->e:Landroid/support/v4/media/session/MediaControllerCompat$Callback;

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaControllerCompat;->unregisterCallback(Landroid/support/v4/media/session/MediaControllerCompat$Callback;)V

    .line 143
    :cond_0
    return-void
.end method

.method private e(I)V
    .locals 4

    .line 121
    iget-object v0, p0, Lo/cgh;->a:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz v0, :cond_0

    .line 122
    iget-object v0, p0, Lo/cgh;->a:Landroid/support/v4/media/session/MediaControllerCompat;

    new-instance v1, Landroid/view/KeyEvent;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaControllerCompat;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    .line 123
    iget-object v0, p0, Lo/cgh;->a:Landroid/support/v4/media/session/MediaControllerCompat;

    new-instance v1, Landroid/view/KeyEvent;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaControllerCompat;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    goto :goto_0

    .line 125
    :cond_0
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendCommand mController is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    :goto_0
    return-void
.end method

.method private e(Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 0

    .line 115
    if-nez p1, :cond_0

    .line 116
    return-void

    .line 118
    :cond_0
    return-void
.end method

.method private e(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .locals 4

    .line 95
    if-nez p1, :cond_0

    .line 96
    return-void

    .line 98
    :cond_0
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, p1}, Lo/cgh;->a(Landroid/support/v4/media/session/PlaybackStateCompat;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    return-void
.end method

.method static synthetic e(Lo/cgh;Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/cgh;->e(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 130
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroyController"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    invoke-direct {p0}, Lo/cgh;->e()V

    .line 132
    iget-object v0, p0, Lo/cgh;->c:Landroid/content/ServiceConnection;

    if-eqz v0, :cond_0

    .line 133
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/cgh;->c:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 134
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unbindService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgh;->d:Lcom/android/mediacenter/localmusic/IMediaPlaybackService;

    .line 137
    return-void
.end method

.method public b(I)V
    .locals 1

    .line 146
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 148
    :pswitch_0
    const/16 v0, 0x7e

    invoke-direct {p0, v0}, Lo/cgh;->e(I)V

    .line 149
    goto :goto_0

    .line 151
    :pswitch_1
    const/16 v0, 0x57

    invoke-direct {p0, v0}, Lo/cgh;->e(I)V

    .line 152
    goto :goto_0

    .line 154
    :pswitch_2
    const/16 v0, 0x56

    invoke-direct {p0, v0}, Lo/cgh;->e(I)V

    .line 155
    goto :goto_0

    .line 157
    :pswitch_3
    const/16 v0, 0x7f

    invoke-direct {p0, v0}, Lo/cgh;->e(I)V

    .line 158
    .line 162
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 5

    .line 179
    if-eqz p1, :cond_0

    .line 180
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "duration = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "duration"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " steprate = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "stepRate"

    .line 181
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " totalSteps = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, "totalSteps"

    .line 182
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 180
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    :cond_0
    iget-object v0, p0, Lo/cgh;->d:Lcom/android/mediacenter/localmusic/IMediaPlaybackService;

    if-eqz v0, :cond_1

    .line 186
    :try_start_0
    iget-object v0, p0, Lo/cgh;->d:Lcom/android/mediacenter/localmusic/IMediaPlaybackService;

    invoke-interface {v0, p1}, Lcom/android/mediacenter/localmusic/IMediaPlaybackService;->stopRunning(Landroid/os/Bundle;)V

    .line 187
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send stop command to music"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 190
    goto :goto_0

    .line 188
    :catch_0
    move-exception v4

    .line 189
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyMusicToStop e "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    goto :goto_0

    .line 193
    :cond_1
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyMusicToStop mMediaPlayerCallBackService is NULL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    :goto_0
    return-void
.end method

.method public d(I)V
    .locals 5

    .line 165
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushStepRate :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    iget-object v0, p0, Lo/cgh;->d:Lcom/android/mediacenter/localmusic/IMediaPlaybackService;

    if-eqz v0, :cond_0

    .line 168
    :try_start_0
    iget-object v0, p0, Lo/cgh;->d:Lcom/android/mediacenter/localmusic/IMediaPlaybackService;

    invoke-interface {v0, p1}, Lcom/android/mediacenter/localmusic/IMediaPlaybackService;->stepFrequency(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    goto :goto_0

    .line 169
    :catch_0
    move-exception v4

    .line 170
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushStepRate e "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    goto :goto_0

    .line 174
    :cond_0
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushStepRate mMediaPlayerCallBackService is NULL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    :goto_0
    return-void
.end method
