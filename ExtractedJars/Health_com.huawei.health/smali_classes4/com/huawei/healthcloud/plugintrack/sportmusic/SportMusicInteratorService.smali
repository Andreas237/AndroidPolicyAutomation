.class public Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$d;,
        Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;
    }
.end annotation


# instance fields
.field a:Landroid/support/v4/content/LocalBroadcastManager;

.field private b:Lo/cgh;

.field private c:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;

.field private d:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 25
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->b:Lo/cgh;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->c:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;

    .line 40
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$d;-><init>(Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$4;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->d:Landroid/os/Handler;

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->a:Landroid/support/v4/content/LocalBroadcastManager;

    return-void
.end method

.method public static b()V
    .locals 6

    .line 226
    const-string v0, "Track_SportMusicInteratorService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopSportMusicService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    new-instance v4, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 229
    const-string v0, "action_stop_sport_music_interator_service"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 231
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 235
    goto :goto_0

    .line 233
    :catch_0
    move-exception v5

    .line 234
    const-string v0, "Track_SportMusicInteratorService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopSportMusicService "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;)Lo/cgh;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->b:Lo/cgh;

    return-object v0
.end method

.method public static d()V
    .locals 6

    .line 214
    const-string v0, "Track_SportMusicInteratorService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSportMusicService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    new-instance v4, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 217
    const-string v0, "action_start_sport_music_interator_service"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 219
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 222
    goto :goto_0

    .line 220
    :catch_0
    move-exception v5

    .line 221
    const-string v0, "Track_SportMusicInteratorService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSportMusicService "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    :goto_0
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 57
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 5

    .line 78
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 80
    new-instance v0, Lo/cgh;

    invoke-direct {v0}, Lo/cgh;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->b:Lo/cgh;

    .line 81
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->d:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->c:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;

    .line 83
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 84
    const-string v0, "action_stop_play_sport_music"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 85
    const-string v0, "action_send_steprate_to_hwmusic"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 86
    const-string v0, "action_next_song"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 87
    const-string v0, "action_pause_song"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 88
    const-string v0, "action_play_song"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 89
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->a:Landroid/support/v4/content/LocalBroadcastManager;

    .line 90
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->a:Landroid/support/v4/content/LocalBroadcastManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->a:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->c:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;

    invoke-virtual {v0, v1, v4}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    goto :goto_0

    .line 93
    :cond_0
    const-string v0, "Track_SportMusicInteratorService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate localBroadcastManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    :goto_0
    const-string v0, "Track_SportMusicInteratorService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    return-void
.end method

.method public onDestroy()V
    .locals 5

    .line 62
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 64
    :try_start_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->a:Landroid/support/v4/content/LocalBroadcastManager;

    if-eqz v0, :cond_0

    .line 65
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->a:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->c:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    goto :goto_0

    .line 67
    :cond_0
    const-string v0, "Track_SportMusicInteratorService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy localBroadcastManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    :goto_0
    goto :goto_1

    .line 69
    :catch_0
    move-exception v4

    .line 70
    const-string v0, "Track_SportMusicInteratorService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    :goto_1
    const-string v0, "Track_SportMusicInteratorService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .line 48
    const-string v0, "Track_SportMusicInteratorService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onStartCommand "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method
