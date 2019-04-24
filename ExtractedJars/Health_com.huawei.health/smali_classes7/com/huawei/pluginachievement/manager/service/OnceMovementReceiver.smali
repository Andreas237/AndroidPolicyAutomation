.class public Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/concurrent/ExecutorService;

.field private static final e:Ljava/lang/Object;


# instance fields
.field private c:Lo/dwr;

.field private d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->a:Ljava/util/concurrent/ExecutorService;

    .line 40
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 45
    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;Lcom/huawei/pluginachievement/manager/model/TrackData;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->d(Lcom/huawei/pluginachievement/manager/model/TrackData;)V

    return-void
.end method

.method private c(Landroid/content/Intent;)V
    .locals 4

    .line 75
    iget-object v0, p0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->d:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 76
    :cond_0
    const-string v0, "PLGACHIEVE_OnceMovementReceiver"

    const-string v1, "onReceive null == context || null == intent"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    return-void

    .line 79
    :cond_1
    invoke-static {}, Lo/dth;->g()Z

    move-result v0

    if-nez v0, :cond_2

    .line 80
    const-string v0, "PLGACHIEVE_OnceMovementReceiver"

    const-string v1, "isSupportAchieve is not"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    return-void

    .line 84
    :cond_2
    const-string v0, "com.huawei.healthcloud.action.sendSportTrackDistance"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 85
    const-string v0, "PLGACHIEVE_OnceMovementReceiver"

    const-string v1, "Action is Invalid!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    return-void

    .line 88
    :cond_3
    const-string v0, "share_key"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 89
    const/4 v0, -0x1

    if-eq v0, v2, :cond_4

    .line 90
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->d(Landroid/content/Intent;)V

    .line 91
    return-void

    .line 94
    :cond_4
    const-string v0, "track"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 96
    invoke-virtual {p0, v3}, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->a(Ljava/util/ArrayList;)V

    .line 97
    invoke-direct {p0, v3}, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->e(Ljava/util/ArrayList;)V

    .line 98
    return-void
.end method

.method private d(Landroid/content/Intent;)V
    .locals 4

    .line 63
    const-string v0, "share_key"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 64
    const-string v0, "PLGACHIEVE_OnceMovementReceiver"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "key is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/dwo;->b(I)V

    .line 67
    return-void
.end method

.method private d(Lcom/huawei/pluginachievement/manager/model/TrackData;)V
    .locals 3

    .line 156
    const-string v0, "PLGACHIEVE_OnceMovementReceiver"

    const-string v1, "enter movementRunnable:"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v2

    .line 158
    invoke-virtual {v2}, Lo/dwr;->a()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Lo/dwr;->a()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 159
    :cond_0
    const-string v0, "PLGACHIEVE_OnceMovementReceiver"

    const-string v1, "dealTrack userprofile or uid is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    invoke-virtual {v2}, Lo/dwr;->e()V

    .line 161
    invoke-virtual {v2}, Lo/dwr;->a()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Lo/dwr;->a()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 162
    :cond_1
    return-void

    .line 166
    :cond_2
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_3

    .line 167
    iget-object v0, p0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->c:Lo/dwr;

    iget-object v1, p0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->d:Landroid/content/Context;

    invoke-static {p1, v0, v1}, Lo/dwx;->a(Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;Landroid/content/Context;)V

    .line 171
    :cond_3
    iget-object v0, p0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->c:Lo/dwr;

    iget-object v1, p0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->d:Landroid/content/Context;

    invoke-static {p1, v0, v1}, Lo/dxa;->c(Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;Landroid/content/Context;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->c:Lo/dwr;

    iget-object v1, p0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->d:Landroid/content/Context;

    invoke-static {p1, v0, v1}, Lo/dwy;->d(Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;Landroid/content/Context;)V

    .line 176
    return-void
.end method

.method private d(Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/pluginachievement/manager/model/TrackData;>;)V"
        }
    .end annotation

    .line 134
    sget-object v2, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 135
    const-string v0, "PLGACHIEVE_OnceMovementReceiver"

    const-string v1, "enter processGpsMovement():"

    :try_start_0
    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    sget-object v0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->a:Ljava/util/concurrent/ExecutorService;

    .line 139
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 140
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/pluginachievement/manager/model/TrackData;

    .line 141
    sget-object v0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver$5;

    invoke-direct {v1, p0, v4}, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver$5;-><init>(Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;Lcom/huawei/pluginachievement/manager/model/TrackData;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    goto :goto_0

    .line 148
    :cond_1
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 149
    :goto_1
    return-void
.end method

.method private e(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/pluginachievement/manager/model/TrackData;>;)V"
        }
    .end annotation

    .line 123
    sget-object v2, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 124
    const-string v0, "PLGACHIEVE_OnceMovementReceiver"

    const-string v1, "getData()"

    :try_start_0
    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    iget-object v0, p0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->c:Lo/dwr;

    .line 126
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->d(Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 128
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/pluginachievement/manager/model/TrackData;>;)V"
        }
    .end annotation

    .line 105
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 106
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 107
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginachievement/manager/model/TrackData;

    .line 108
    invoke-virtual {v5}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireType()I

    move-result v0

    invoke-static {v0}, Lo/dxc;->d(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 109
    goto :goto_0

    .line 111
    :cond_0
    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 112
    const-string v0, "trackTime"

    invoke-virtual {v5}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireEndTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    const-string v0, "trackDistance"

    invoke-virtual {v5}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireDistance()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    iget-object v0, p0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    const/16 v1, 0x578

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Lo/dwo;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 115
    goto :goto_0

    .line 117
    :cond_1
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 49
    const-string v0, "PLGACHIEVE_OnceMovementReceiver"

    const-string v1, "onReceive"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    sget-object v2, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 51
    :try_start_0
    iput-object p1, p0, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->d:Landroid/content/Context;

    .line 52
    invoke-direct {p0, p2}, Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;->c(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 54
    :goto_0
    return-void
.end method
