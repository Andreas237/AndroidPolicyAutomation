.class public Lo/anb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lo/anb;


# instance fields
.field private a:Landroid/content/Context;

.field private final b:Ljava/lang/Object;

.field private d:Lo/ani;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 19
    const/4 v0, 0x0

    sput-object v0, Lo/anb;->e:Lo/anb;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 11

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/anb;->b:Ljava/lang/Object;

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/anb;->a:Landroid/content/Context;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/anb;->d:Lo/ani;

    .line 54
    iget-object v4, p0, Lo/anb;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 55
    :try_start_0
    iput-object p1, p0, Lo/anb;->a:Landroid/content/Context;

    .line 56
    new-instance v0, Lo/ani;

    iget-object v1, p0, Lo/anb;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/ani;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/anb;->d:Lo/ani;

    .line 59
    iget-object v0, p0, Lo/anb;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/anc;->e(Landroid/content/Context;)J

    move-result-wide v5

    .line 61
    const/4 v7, 0x0

    .line 63
    const-wide/32 v0, 0x493e0

    cmp-long v0, v5, v0

    if-ltz v0, :cond_0

    .line 64
    const-string v0, "Step_ProcessAliveMonitor"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deathMills("

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ") >= DEATH_LONG_TIME_MILLS("

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-wide/32 v2, 0x493e0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "),think proc unexpect death long time"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    const/4 v7, 0x1

    .line 70
    :cond_0
    if-nez v7, :cond_1

    .line 71
    const-string v0, "Step_ProcessAliveMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDeathLongTime false,working correct"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    iget-object v0, p0, Lo/anb;->d:Lo/ani;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ani;->a(Z)V

    .line 76
    invoke-virtual {p0}, Lo/anb;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    monitor-exit v4

    return-void

    .line 79
    :cond_1
    const-string v0, "Step_ProcessAliveMonitor"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "death long time,working unusuall!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    invoke-static {}, Lo/dbf;->d()Z

    move-result v8

    .line 83
    const-string v0, "Step_ProcessAliveMonitor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isEmui:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    if-nez v8, :cond_2

    .line 87
    const-string v0, "Step_ProcessAliveMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDeathLongTime(notEmui) true,need prompt"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    iget-object v0, p0, Lo/anb;->d:Lo/ani;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ani;->a(Z)V

    .line 92
    invoke-virtual {p0}, Lo/anb;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    monitor-exit v4

    return-void

    .line 97
    :cond_2
    :try_start_2
    iget-object v0, p0, Lo/anb;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cbg;->e(Landroid/content/Context;)Z

    move-result v9

    .line 98
    const-string v0, "Step_ProcessAliveMonitor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hasThirdMobileMgr(isEmui) :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    if-nez v9, :cond_3

    .line 103
    const-string v0, "Step_ProcessAliveMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDeathLongTime(Emui) true and hasThirdMobileMgr(Emui) false,not need prompt"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    iget-object v0, p0, Lo/anb;->d:Lo/ani;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ani;->a(Z)V

    .line 108
    invoke-virtual {p0}, Lo/anb;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 109
    monitor-exit v4

    return-void

    .line 112
    :cond_3
    const-string v0, "Step_ProcessAliveMonitor"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDeathLongTime(Emui) true and hasThirdMobileMgr(Emui) true,Can Prompt Tips!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    iget-object v0, p0, Lo/anb;->d:Lo/ani;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ani;->a(Z)V

    .line 117
    invoke-virtual {p0}, Lo/anb;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 118
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v10

    monitor-exit v4

    throw v10

    .line 119
    :goto_0
    return-void
.end method

.method public static c(Landroid/content/Context;)Lo/anb;
    .locals 8

    .line 31
    const-class v4, Lo/anb;

    monitor-enter v4

    .line 32
    if-nez p0, :cond_0

    .line 33
    const-string v0, "Step_ProcessAliveMonitor"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance context null,return null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 36
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    .line 38
    const/4 v6, 0x0

    .line 39
    if-eqz v5, :cond_1

    .line 40
    move-object v6, v5

    goto :goto_0

    .line 43
    :cond_1
    move-object v6, p0

    .line 44
    const-string v0, "Step_ProcessAliveMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "appContext null,use context(not null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    :goto_0
    sget-object v0, Lo/anb;->e:Lo/anb;

    if-nez v0, :cond_2

    .line 47
    new-instance v0, Lo/anb;

    invoke-direct {v0, v6}, Lo/anb;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/anb;->e:Lo/anb;

    .line 49
    :cond_2
    sget-object v0, Lo/anb;->e:Lo/anb;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v4

    return-object v0

    .line 50
    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7
.end method

.method private k()V
    .locals 1

    .line 181
    iget-object v0, p0, Lo/anb;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/anc;->b(Landroid/content/Context;)V

    .line 182
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 160
    iget-object v1, p0, Lo/anb;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 161
    :try_start_0
    iget-object v0, p0, Lo/anb;->d:Lo/ani;

    invoke-virtual {v0}, Lo/ani;->e()V

    .line 162
    invoke-direct {p0}, Lo/anb;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 164
    :goto_0
    return-void
.end method

.method public b()Z
    .locals 3

    .line 139
    iget-object v1, p0, Lo/anb;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 140
    :try_start_0
    iget-object v0, p0, Lo/anb;->d:Lo/ani;

    invoke-virtual {v0}, Lo/ani;->a()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v1

    return v0

    .line 141
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public final c()V
    .locals 3

    .line 129
    iget-object v1, p0, Lo/anb;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 130
    :try_start_0
    iget-object v0, p0, Lo/anb;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/anc;->c(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 132
    :goto_0
    return-void
.end method

.method public d()V
    .locals 3

    .line 150
    iget-object v1, p0, Lo/anb;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 151
    :try_start_0
    iget-object v0, p0, Lo/anb;->d:Lo/ani;

    invoke-virtual {v0}, Lo/ani;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 153
    :goto_0
    return-void
.end method

.method public e()V
    .locals 3

    .line 171
    iget-object v1, p0, Lo/anb;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 172
    :try_start_0
    iget-object v0, p0, Lo/anb;->d:Lo/ani;

    invoke-virtual {v0}, Lo/ani;->c()V

    .line 173
    invoke-direct {p0}, Lo/anb;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 175
    :goto_0
    return-void
.end method
