.class public Lo/cbr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/Object;

.field private static c:Lo/cbp;

.field private static d:Lo/cbr;


# instance fields
.field private a:I

.field private e:Z

.field private f:Landroid/app/job/JobInfo;

.field private g:Z

.field private k:Landroid/app/job/JobScheduler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cbr;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lo/cbr;->a:I

    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbr;->e:Z

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbr;->g:Z

    .line 45
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lo/cbr;->g:Z

    .line 46
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 6

    .line 135
    const-string v0, "Track_TrackAliveUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "restart track"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 137
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 138
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 139
    const-string v0, "com.huawei.health.track.broadcast"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 140
    const-string v0, "track_msg"

    const-string v1, "com.huawei.track.restart"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 141
    const-string v0, "com.huawei.health.INTERNAL_PERMISSION"

    invoke-virtual {p0, v5, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 142
    return-void
.end method

.method public static c()Lo/cbr;
    .locals 3

    .line 49
    sget-object v1, Lo/cbr;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 50
    :try_start_0
    sget-object v0, Lo/cbr;->d:Lo/cbr;

    if-nez v0, :cond_0

    .line 51
    new-instance v0, Lo/cbr;

    invoke-direct {v0}, Lo/cbr;-><init>()V

    sput-object v0, Lo/cbr;->d:Lo/cbr;

    .line 54
    :cond_0
    sget-object v0, Lo/cbr;->c:Lo/cbp;

    if-nez v0, :cond_1

    .line 55
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->c()Lo/cbp;

    move-result-object v0

    sput-object v0, Lo/cbr;->c:Lo/cbp;

    .line 57
    :cond_1
    sget-object v0, Lo/cbr;->d:Lo/cbr;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 58
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static c(Landroid/content/Context;)V
    .locals 3

    .line 149
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    return-void

    .line 152
    :cond_0
    new-instance v0, Lo/egw$c;

    invoke-direct {v0, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_crash_dialog:I

    const/4 v2, 0x0

    invoke-static {p0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_track_crash_dialog_confirm:I

    new-instance v2, Lo/cbr$5;

    invoke-direct {v2}, Lo/cbr$5;-><init>()V

    .line 153
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 158
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 159
    return-void
.end method

.method private f(Landroid/content/Context;)V
    .locals 4

    .line 116
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 117
    const-string v0, "Track_TrackAliveUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "track jobservice stop"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    const-string v0, "jobscheduler"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobScheduler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/job/JobScheduler;->cancel(I)V

    .line 120
    :cond_0
    return-void
.end method

.method private k(Landroid/content/Context;)V
    .locals 5

    .line 74
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 75
    const-string v0, "Track_TrackAliveUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "track jobservice start , isForceCircle "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/cbr;->g:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    new-instance v0, Landroid/app/job/JobInfo$Builder;

    new-instance v1, Landroid/content/ComponentName;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lcom/huawei/healthcloud/plugintrack/manager/service/TrackJobService;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    .line 77
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    move-result-object v0

    .line 78
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    move-result-object v4

    .line 79
    iget-boolean v0, p0, Lo/cbr;->g:Z

    if-eqz v0, :cond_0

    .line 80
    const-wide/16 v0, 0x61a8

    invoke-virtual {v4, v0, v1}, Landroid/app/job/JobInfo$Builder;->setOverrideDeadline(J)Landroid/app/job/JobInfo$Builder;

    move-result-object v0

    .line 81
    const-wide/16 v1, 0x4e20

    invoke-virtual {v0, v1, v2}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object v0

    iput-object v0, p0, Lo/cbr;->f:Landroid/app/job/JobInfo;

    goto :goto_0

    .line 83
    :cond_0
    const-wide/16 v0, 0x1388

    invoke-virtual {v4, v0, v1}, Landroid/app/job/JobInfo$Builder;->setPeriodic(J)Landroid/app/job/JobInfo$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object v0

    iput-object v0, p0, Lo/cbr;->f:Landroid/app/job/JobInfo;

    .line 85
    :goto_0
    const-string v0, "jobscheduler"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobScheduler;

    iput-object v0, p0, Lo/cbr;->k:Landroid/app/job/JobScheduler;

    .line 86
    invoke-virtual {p0}, Lo/cbr;->e()V

    .line 88
    :cond_1
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 4

    .line 62
    iget-boolean v0, p0, Lo/cbr;->e:Z

    if-nez v0, :cond_1

    .line 63
    const-string v0, "Track_TrackAliveUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start KeepAlive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cbr;->e:Z

    .line 65
    sget-object v0, Lo/cbr;->c:Lo/cbp;

    if-eqz v0, :cond_0

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lo/cbr;->a:I

    .line 67
    sget-object v0, Lo/cbr;->c:Lo/cbp;

    invoke-interface {v0}, Lo/cbp;->e()V

    .line 69
    :cond_0
    invoke-direct {p0, p1}, Lo/cbr;->k(Landroid/content/Context;)V

    .line 71
    :cond_1
    return-void
.end method

.method public a()Z
    .locals 1

    .line 97
    iget-boolean v0, p0, Lo/cbr;->g:Z

    return v0
.end method

.method public b()V
    .locals 2

    .line 127
    sget-object v0, Lo/cbr;->c:Lo/cbp;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/cbr;->e:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lo/cbr;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cbr;->a:I

    const/16 v1, 0x14

    if-ne v0, v1, :cond_0

    .line 128
    const/4 v0, 0x0

    iput v0, p0, Lo/cbr;->a:I

    .line 129
    sget-object v0, Lo/cbr;->c:Lo/cbp;

    invoke-interface {v0}, Lo/cbp;->k()V

    .line 131
    :cond_0
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 145
    iput-boolean p1, p0, Lo/cbr;->e:Z

    .line 146
    return-void
.end method

.method public d(Landroid/content/Context;)V
    .locals 4

    .line 101
    iget-boolean v0, p0, Lo/cbr;->e:Z

    if-eqz v0, :cond_0

    .line 102
    const-string v0, "Track_TrackAliveUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stop KeepAlive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    invoke-virtual {p0, p1}, Lo/cbr;->e(Landroid/content/Context;)V

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbr;->e:Z

    .line 106
    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    .line 123
    iget-boolean v0, p0, Lo/cbr;->e:Z

    return v0
.end method

.method public e()V
    .locals 2

    .line 91
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lo/cbr;->k:Landroid/app/job/JobScheduler;

    if-eqz v0, :cond_0

    .line 92
    iget-object v0, p0, Lo/cbr;->k:Landroid/app/job/JobScheduler;

    iget-object v1, p0, Lo/cbr;->f:Landroid/app/job/JobInfo;

    invoke-virtual {v0, v1}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    .line 94
    :cond_0
    return-void
.end method

.method public e(Landroid/content/Context;)V
    .locals 1

    .line 109
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cbr;->f(Landroid/content/Context;)V

    .line 110
    sget-object v0, Lo/cbr;->c:Lo/cbp;

    if-eqz v0, :cond_0

    .line 111
    sget-object v0, Lo/cbr;->c:Lo/cbp;

    invoke-interface {v0}, Lo/cbp;->f()V

    .line 113
    :cond_0
    return-void
.end method
