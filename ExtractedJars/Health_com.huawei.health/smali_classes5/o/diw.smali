.class public Lo/diw;
.super Lo/dit;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation

.annotation build Landroid/support/annotation/RequiresApi;
    api = 0x15
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/diw$b;
    }
.end annotation


# static fields
.field private static c:Lo/diw;


# instance fields
.field private a:Landroid/media/AudioManager;

.field private b:Ljava/lang/String;

.field private d:Landroid/media/session/MediaController;

.field private e:Landroid/media/session/MediaSessionManager;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:Z

.field private i:Lo/diw$b;

.field private k:I

.field private l:Landroid/media/session/MediaController$Callback;

.field private m:Landroid/os/Handler;

.field private n:Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;

.field private p:Lo/dir$e;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 71
    invoke-direct {p0}, Lo/dit;-><init>()V

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    .line 62
    const-string v0, ""

    iput-object v0, p0, Lo/diw;->b:Ljava/lang/String;

    .line 65
    const/4 v0, 0x0

    iput v0, p0, Lo/diw;->k:I

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lo/diw;->g:I

    .line 67
    const-string v0, ""

    iput-object v0, p0, Lo/diw;->f:Ljava/lang/String;

    .line 68
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/diw;->h:Z

    .line 117
    new-instance v0, Lo/diw$5;

    invoke-direct {v0, p0}, Lo/diw$5;-><init>(Lo/diw;)V

    iput-object v0, p0, Lo/diw;->l:Landroid/media/session/MediaController$Callback;

    .line 224
    new-instance v0, Lo/diw$3;

    invoke-direct {v0, p0}, Lo/diw$3;-><init>(Lo/diw;)V

    iput-object v0, p0, Lo/diw;->n:Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;

    .line 271
    new-instance v0, Lo/diw$2;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/diw$2;-><init>(Lo/diw;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/diw;->m:Landroid/os/Handler;

    .line 72
    invoke-direct {p0}, Lo/diw;->e()V

    .line 73
    invoke-direct {p0}, Lo/diw;->h()V

    .line 74
    return-void
.end method

.method static synthetic a(Lo/diw;)I
    .locals 1

    .line 39
    iget v0, p0, Lo/diw;->g:I

    return v0
.end method

.method static synthetic a(Lo/diw;Landroid/media/session/MediaController;)Landroid/media/session/MediaController;
    .locals 0

    .line 39
    iput-object p1, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    return-object p1
.end method

.method static synthetic a(Lo/diw;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 39
    iput-object p1, p0, Lo/diw;->f:Ljava/lang/String;

    return-object p1
.end method

.method public static a()Lo/diw;
    .locals 4

    .line 54
    sget-object v0, Lo/diw;->c:Lo/diw;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 55
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance() instance is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    new-instance v0, Lo/diw;

    invoke-direct {v0}, Lo/diw;-><init>()V

    sput-object v0, Lo/diw;->c:Lo/diw;

    .line 58
    :cond_0
    sget-object v0, Lo/diw;->c:Lo/diw;

    return-object v0
.end method

.method static synthetic b(Lo/diw;)I
    .locals 1

    .line 39
    iget v0, p0, Lo/diw;->k:I

    return v0
.end method

.method static synthetic b(Lo/diw;Z)Z
    .locals 0

    .line 39
    iput-boolean p1, p0, Lo/diw;->h:Z

    return p1
.end method

.method static synthetic c(Lo/diw;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/diw;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lo/diw;I)I
    .locals 0

    .line 39
    iput p1, p0, Lo/diw;->g:I

    return p1
.end method

.method static synthetic d(Lo/diw;)Landroid/media/session/MediaController;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    return-object v0
.end method

.method static synthetic e(Lo/diw;I)I
    .locals 0

    .line 39
    iput p1, p0, Lo/diw;->k:I

    return p1
.end method

.method static synthetic e(Lo/diw;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 39
    iput-object p1, p0, Lo/diw;->b:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic e(Lo/diw;)Lo/dir$e;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/diw;->p:Lo/dir$e;

    return-object v0
.end method

.method private e()V
    .locals 6
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 77
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initMediaSession"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "media_session"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/session/MediaSessionManager;

    iput-object v0, p0, Lo/diw;->e:Landroid/media/session/MediaSessionManager;

    .line 79
    iget-object v0, p0, Lo/diw;->e:Landroid/media/session/MediaSessionManager;

    new-instance v1, Landroid/content/ComponentName;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "com.huawei.bone.ui.setting.NotificationPushListener"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/media/session/MediaSessionManager;->getActiveSessions(Landroid/content/ComponentName;)Ljava/util/List;

    move-result-object v5

    .line 80
    iget-object v0, p0, Lo/diw;->e:Landroid/media/session/MediaSessionManager;

    iget-object v1, p0, Lo/diw;->n:Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;

    new-instance v2, Landroid/content/ComponentName;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "com.huawei.bone.ui.setting.NotificationPushListener"

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/media/session/MediaSessionManager;->addOnActiveSessionsChangedListener(Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;Landroid/content/ComponentName;)V

    .line 81
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 82
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "controllers.size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 84
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/session/MediaController;

    iput-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    .line 85
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/diw;->b:Ljava/lang/String;

    .line 86
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    iget-object v1, p0, Lo/diw;->l:Landroid/media/session/MediaController$Callback;

    invoke-virtual {v0, v1}, Landroid/media/session/MediaController;->registerCallback(Landroid/media/session/MediaController$Callback;)V

    .line 87
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getPlaybackInfo()Landroid/media/session/MediaController$PlaybackInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 89
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Maxvolume:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v3}, Landroid/media/session/MediaController;->getPlaybackInfo()Landroid/media/session/MediaController$PlaybackInfo;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/session/MediaController$PlaybackInfo;->getMaxVolume()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  currentvolume : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/diw;->d:Landroid/media/session/MediaController;

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

    .line 91
    :cond_0
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 92
    iget-object v0, p0, Lo/diw;->l:Landroid/media/session/MediaController$Callback;

    iget-object v1, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v1}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/session/MediaController$Callback;->onPlaybackStateChanged(Landroid/media/session/PlaybackState;)V

    .line 93
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "play state:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v3}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/session/PlaybackState;->getState()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    :cond_1
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getMetadata()Landroid/media/MediaMetadata;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 96
    iget-object v0, p0, Lo/diw;->l:Landroid/media/session/MediaController$Callback;

    iget-object v1, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v1}, Landroid/media/session/MediaController;->getMetadata()Landroid/media/MediaMetadata;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/session/MediaController$Callback;->onMetadataChanged(Landroid/media/MediaMetadata;)V

    .line 97
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMetadata:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v3}, Landroid/media/session/MediaController;->getMetadata()Landroid/media/MediaMetadata;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/MediaMetadata;->getDescription()Landroid/media/MediaDescription;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMetadata getSubtitle:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v3}, Landroid/media/session/MediaController;->getMetadata()Landroid/media/MediaMetadata;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/MediaMetadata;->getDescription()Landroid/media/MediaDescription;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/MediaDescription;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMetadata getTitle:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v3}, Landroid/media/session/MediaController;->getMetadata()Landroid/media/MediaMetadata;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/MediaMetadata;->getDescription()Landroid/media/MediaDescription;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/MediaDescription;->getTitle()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 105
    :cond_2
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "controllers is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    :cond_3
    :goto_0
    return-void
.end method

.method static synthetic f(Lo/diw;)Landroid/os/Handler;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/diw;->m:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic g(Lo/diw;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/diw;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic h(Lo/diw;)Landroid/media/session/MediaSessionManager;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/diw;->e:Landroid/media/session/MediaSessionManager;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 110
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initVolume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lo/diw;->a:Landroid/media/AudioManager;

    .line 112
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerVolumeChangeReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    new-instance v0, Lo/diw$b;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    invoke-direct {v0, p0, v1, v2}, Lo/diw$b;-><init>(Lo/diw;Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lo/diw;->i:Lo/diw$b;

    .line 114
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/Settings$System;->CONTENT_URI:Landroid/net/Uri;

    iget-object v2, p0, Lo/diw;->i:Lo/diw$b;

    .line 115
    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 116
    return-void
.end method

.method static synthetic i(Lo/diw;)Landroid/media/session/MediaController$Callback;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/diw;->l:Landroid/media/session/MediaController$Callback;

    return-object v0
.end method

.method static synthetic k(Lo/diw;)Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/diw;->n:Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;

    return-object v0
.end method


# virtual methods
.method public b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;
    .locals 5

    .line 294
    new-instance v4, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    invoke-direct {v4}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;-><init>()V

    .line 295
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 296
    const/4 v0, 0x0

    return-object v0

    .line 298
    :cond_0
    iget-boolean v0, p0, Lo/diw;->h:Z

    if-eqz v0, :cond_1

    .line 300
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMusicInfo isMusicAppDied"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    const/4 v0, 0x0

    iput v0, p0, Lo/diw;->k:I

    .line 302
    return-object v4

    .line 305
    :cond_1
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getMetadata()Landroid/media/MediaMetadata;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getMetadata()Landroid/media/MediaMetadata;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaMetadata;->getDescription()Landroid/media/MediaDescription;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 306
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getMetadata()Landroid/media/MediaMetadata;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaMetadata;->getDescription()Landroid/media/MediaDescription;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaDescription;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 307
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getMetadata()Landroid/media/MediaMetadata;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaMetadata;->getDescription()Landroid/media/MediaDescription;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaDescription;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setSinger_Name(Ljava/lang/String;)V

    .line 309
    :cond_2
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getMetadata()Landroid/media/MediaMetadata;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaMetadata;->getDescription()Landroid/media/MediaDescription;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaDescription;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 310
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getMetadata()Landroid/media/MediaMetadata;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaMetadata;->getDescription()Landroid/media/MediaDescription;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaDescription;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setSong_Name(Ljava/lang/String;)V

    goto :goto_0

    .line 313
    :cond_3
    const-string v0, ""

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setSinger_Name(Ljava/lang/String;)V

    .line 314
    const-string v0, ""

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setSong_Name(Ljava/lang/String;)V

    .line 316
    :cond_4
    :goto_0
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getPlaybackInfo()Landroid/media/session/MediaController$PlaybackInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 317
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getPlaybackInfo()Landroid/media/session/MediaController$PlaybackInfo;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/session/MediaController$PlaybackInfo;->getMaxVolume()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setMax_Volume(I)V

    .line 318
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getPlaybackInfo()Landroid/media/session/MediaController$PlaybackInfo;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/session/MediaController$PlaybackInfo;->getCurrentVolume()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setCurrent_Volume(I)V

    goto :goto_1

    .line 320
    :cond_5
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setMax_Volume(I)V

    .line 321
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setCurrent_Volume(I)V

    .line 323
    :goto_1
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 324
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/session/PlaybackState;->getState()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setPlay_State(I)V

    goto :goto_2

    .line 326
    :cond_6
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->setPlay_State(I)V

    .line 329
    :goto_2
    return-object v4
.end method

.method public c()V
    .locals 4

    .line 400
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter unRegistMusicCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 401
    const/4 v0, 0x0

    iput-object v0, p0, Lo/diw;->p:Lo/dir$e;

    .line 403
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 404
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    iget-object v1, p0, Lo/diw;->l:Landroid/media/session/MediaController$Callback;

    invoke-virtual {v0, v1}, Landroid/media/session/MediaController;->unregisterCallback(Landroid/media/session/MediaController$Callback;)V

    .line 407
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lo/diw;->i:Lo/diw$b;

    .line 408
    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 409
    iget-object v0, p0, Lo/diw;->m:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 410
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "end unRegistMusicCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    return-void
.end method

.method public c(Z)V
    .locals 4

    .line 349
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 350
    if-eqz p1, :cond_0

    .line 351
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/media/session/MediaController;->adjustVolume(II)V

    goto :goto_1

    .line 353
    :cond_0
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/media/session/MediaController;->adjustVolume(II)V

    goto :goto_1

    .line 356
    :cond_1
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ControlVolume mControllerTest is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    iget-object v0, p0, Lo/diw;->a:Landroid/media/AudioManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 358
    if-eqz p1, :cond_2

    .line 359
    iget-object v0, p0, Lo/diw;->a:Landroid/media/AudioManager;

    const/4 v1, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioManager;->adjustStreamVolume(III)V

    goto :goto_0

    .line 361
    :cond_2
    iget-object v0, p0, Lo/diw;->a:Landroid/media/AudioManager;

    const/4 v1, 0x3

    const/4 v2, -0x1

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioManager;->adjustStreamVolume(III)V

    .line 363
    :goto_0
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "end raiseVoice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    :cond_3
    :goto_1
    return-void
.end method

.method public e(I)V
    .locals 4

    .line 337
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 338
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    new-instance v1, Landroid/view/KeyEvent;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/media/session/MediaController;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    .line 339
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    new-instance v1, Landroid/view/KeyEvent;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/media/session/MediaController;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    .line 340
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ControlMusic end!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    :cond_0
    return-void
.end method

.method public e(Lo/dir$e;)V
    .locals 6

    .line 374
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter registMusicCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    iget-object v0, p0, Lo/diw;->p:Lo/dir$e;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 377
    iget-object v0, p0, Lo/diw;->e:Landroid/media/session/MediaSessionManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 378
    iget-object v0, p0, Lo/diw;->e:Landroid/media/session/MediaSessionManager;

    new-instance v1, Landroid/content/ComponentName;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "com.huawei.bone.ui.setting.NotificationPushListener"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/media/session/MediaSessionManager;->getActiveSessions(Landroid/content/ComponentName;)Ljava/util/List;

    move-result-object v5

    .line 379
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 380
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/session/MediaController;

    iput-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    .line 381
    iget-object v0, p0, Lo/diw;->d:Landroid/media/session/MediaController;

    iget-object v1, p0, Lo/diw;->l:Landroid/media/session/MediaController$Callback;

    invoke-virtual {v0, v1}, Landroid/media/session/MediaController;->registerCallback(Landroid/media/session/MediaController$Callback;)V

    .line 384
    :cond_0
    iget-object v0, p0, Lo/diw;->e:Landroid/media/session/MediaSessionManager;

    iget-object v1, p0, Lo/diw;->n:Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;

    invoke-virtual {v0, v1}, Landroid/media/session/MediaSessionManager;->removeOnActiveSessionsChangedListener(Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;)V

    .line 385
    iget-object v0, p0, Lo/diw;->e:Landroid/media/session/MediaSessionManager;

    iget-object v1, p0, Lo/diw;->n:Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;

    new-instance v2, Landroid/content/ComponentName;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "com.huawei.bone.ui.setting.NotificationPushListener"

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/media/session/MediaSessionManager;->addOnActiveSessionsChangedListener(Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;Landroid/content/ComponentName;)V

    .line 388
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/Settings$System;->CONTENT_URI:Landroid/net/Uri;

    iget-object v2, p0, Lo/diw;->i:Lo/diw$b;

    .line 389
    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 391
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "musicChangeCallback is null ,do registCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    :cond_2
    iput-object p1, p0, Lo/diw;->p:Lo/dir$e;

    .line 394
    return-void
.end method
