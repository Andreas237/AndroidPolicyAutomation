.class public Lo/dja;
.super Lo/dit;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dja$e;
    }
.end annotation


# static fields
.field private static c:Lo/dja;


# instance fields
.field private a:I

.field private b:Landroid/media/AudioManager;

.field private d:Lo/dju;

.field private e:Lo/dja$e;

.field private f:Landroid/os/Handler;

.field private g:Lo/djq$b;

.field private h:Landroid/content/ServiceConnection;

.field private i:Lo/dir$e;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 54
    invoke-direct {p0}, Lo/dit;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dja;->d:Lo/dju;

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lo/dja;->a:I

    .line 73
    new-instance v0, Lo/dja$2;

    invoke-direct {v0, p0}, Lo/dja$2;-><init>(Lo/dja;)V

    iput-object v0, p0, Lo/dja;->h:Landroid/content/ServiceConnection;

    .line 133
    new-instance v0, Lo/dja$3;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/dja$3;-><init>(Lo/dja;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/dja;->f:Landroid/os/Handler;

    .line 154
    new-instance v0, Lo/dja$5;

    invoke-direct {v0, p0}, Lo/dja$5;-><init>(Lo/dja;)V

    iput-object v0, p0, Lo/dja;->g:Lo/djq$b;

    .line 55
    invoke-direct {p0}, Lo/dja;->e()V

    .line 56
    invoke-direct {p0}, Lo/dja;->k()V

    .line 57
    return-void
.end method

.method static synthetic a(Lo/dja;)Lo/dir$e;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/dja;->i:Lo/dir$e;

    return-object v0
.end method

.method public static a()Lo/dja;
    .locals 4

    .line 46
    sget-object v0, Lo/dja;->c:Lo/dja;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 47
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance() instance is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    new-instance v0, Lo/dja;

    invoke-direct {v0}, Lo/dja;-><init>()V

    sput-object v0, Lo/dja;->c:Lo/dja;

    .line 50
    :cond_0
    sget-object v0, Lo/dja;->c:Lo/dja;

    return-object v0
.end method

.method static synthetic b(Lo/dja;)I
    .locals 1

    .line 27
    iget v0, p0, Lo/dja;->a:I

    return v0
.end method

.method static synthetic c(Lo/dja;)Lo/dju;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/dja;->d:Lo/dju;

    return-object v0
.end method

.method static synthetic d(Lo/dja;I)I
    .locals 0

    .line 27
    iput p1, p0, Lo/dja;->a:I

    return p1
.end method

.method static synthetic d(Lo/dja;)Lo/djq$b;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/dja;->g:Lo/djq$b;

    return-object v0
.end method

.method static synthetic d(Lo/dja;Lo/dju;)Lo/dju;
    .locals 0

    .line 27
    iput-object p1, p0, Lo/dja;->d:Lo/dju;

    return-object p1
.end method

.method static synthetic e(Lo/dja;)Landroid/os/Handler;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/dja;->f:Landroid/os/Handler;

    return-object v0
.end method

.method private e()V
    .locals 6

    .line 62
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initRemoteControl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    new-instance v4, Landroid/content/Intent;

    const-string v0, "health"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 65
    new-instance v0, Landroid/content/ComponentName;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.huawei.bone.ui.setting.NotificationPushListener"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 66
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/dja;->h:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {v0, v4, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v5

    .line 67
    const-string v0, "MusicRemoteController"

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

    .line 68
    return-void
.end method

.method private k()V
    .locals 4

    .line 97
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initVolume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lo/dja;->b:Landroid/media/AudioManager;

    .line 99
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerVolumeChangeReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    new-instance v0, Lo/dja$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    invoke-direct {v0, p0, v1, v2}, Lo/dja$e;-><init>(Lo/dja;Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lo/dja;->e:Lo/dja$e;

    .line 101
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/Settings$System;->CONTENT_URI:Landroid/net/Uri;

    iget-object v2, p0, Lo/dja;->e:Lo/dja$e;

    .line 102
    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 103
    return-void
.end method


# virtual methods
.method public b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;
    .locals 6

    .line 228
    new-instance v4, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    invoke-direct {v4}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;-><init>()V

    .line 230
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMusicInfo Remote Controller"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    iget-object v0, p0, Lo/dja;->d:Lo/dju;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 233
    :try_start_0
    iget-object v0, p0, Lo/dja;->d:Lo/dju;

    invoke-interface {v0}, Lo/dju;->b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    move-result-object v0

    move-object v4, v0

    .line 234
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMusicInfo Remote Controller musicinfo:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v3, v4, :cond_0

    const-string v3, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 237
    goto :goto_1

    .line 235
    :catch_0
    move-exception v5

    .line 236
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMusicInfo Remote Controller error "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    goto :goto_1

    .line 239
    :cond_1
    invoke-direct {p0}, Lo/dja;->e()V

    .line 241
    :goto_1
    return-object v4
.end method

.method public c()V
    .locals 5

    .line 187
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter unRegistMusicCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dja;->i:Lo/dir$e;

    .line 190
    iget-object v0, p0, Lo/dja;->d:Lo/dju;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 192
    :try_start_0
    iget-object v0, p0, Lo/dja;->d:Lo/dju;

    invoke-interface {v0}, Lo/dju;->a()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    goto :goto_0

    .line 193
    :catch_0
    move-exception v4

    .line 194
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unRegistMusicCallback Remote Controller error "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    :cond_0
    :goto_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lo/dja;->e:Lo/dja$e;

    .line 198
    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 199
    iget-object v0, p0, Lo/dja;->f:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 200
    iget-object v0, p0, Lo/dja;->f:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 203
    :cond_1
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "end unRegistMusicCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    return-void
.end method

.method public c(Z)V
    .locals 4

    .line 249
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ControlVolume remote controller"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    iget-object v0, p0, Lo/dja;->b:Landroid/media/AudioManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 251
    if-eqz p1, :cond_0

    .line 252
    iget-object v0, p0, Lo/dja;->b:Landroid/media/AudioManager;

    const/4 v1, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioManager;->adjustStreamVolume(III)V

    goto :goto_0

    .line 254
    :cond_0
    iget-object v0, p0, Lo/dja;->b:Landroid/media/AudioManager;

    const/4 v1, 0x3

    const/4 v2, -0x1

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioManager;->adjustStreamVolume(III)V

    .line 256
    :goto_0
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "end raiseVoice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    :cond_1
    return-void
.end method

.method public e(I)V
    .locals 5

    .line 211
    iget-object v0, p0, Lo/dja;->d:Lo/dju;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 213
    :try_start_0
    iget-object v0, p0, Lo/dja;->d:Lo/dju;

    invoke-interface {v0, p1}, Lo/dju;->d(I)V

    .line 214
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Remote ControlMusic end!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 217
    goto :goto_0

    .line 215
    :catch_0
    move-exception v4

    .line 216
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ControlMusic Remote Controller error "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    goto :goto_0

    .line 219
    :cond_0
    invoke-direct {p0}, Lo/dja;->e()V

    .line 221
    :goto_0
    return-void
.end method

.method public e(Lo/dir$e;)V
    .locals 5

    .line 167
    iget-object v0, p0, Lo/dja;->i:Lo/dir$e;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 168
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registMusicCallback need to init "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    iget-object v0, p0, Lo/dja;->d:Lo/dju;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 171
    :try_start_0
    iget-object v0, p0, Lo/dja;->d:Lo/dju;

    invoke-interface {v0}, Lo/dju;->e()V

    .line 172
    iget-object v0, p0, Lo/dja;->d:Lo/dju;

    iget-object v1, p0, Lo/dja;->g:Lo/djq$b;

    invoke-interface {v0, v1}, Lo/dju;->d(Lo/djq;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    goto :goto_0

    .line 173
    :catch_0
    move-exception v4

    .line 174
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unRegistMusicCallback Remote Controller error "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    :cond_0
    :goto_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/Settings$System;->CONTENT_URI:Landroid/net/Uri;

    iget-object v2, p0, Lo/dja;->e:Lo/dja$e;

    .line 178
    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 180
    :cond_1
    iput-object p1, p0, Lo/dja;->i:Lo/dir$e;

    .line 181
    return-void
.end method
