.class public Lo/alo;
.super Lo/aba$e;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/os/Handler;

.field private c:Z

.field private d:Lcom/huawei/health/manager/DaemonService;

.field private e:Landroid/os/HandlerThread;

.field private f:Z

.field private g:Lo/amt;

.field private h:Z


# direct methods
.method public constructor <init>(Lcom/huawei/health/manager/DaemonService;)V
    .locals 4

    .line 38
    invoke-direct {p0}, Lo/aba$e;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alo;->d:Lcom/huawei/health/manager/DaemonService;

    .line 20
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/alo;->c:Z

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/alo;->f:Z

    .line 31
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/alo;->h:Z

    .line 39
    const-string v0, "HealthDeviceOper_RemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceOperRemoteProxy is Set Up"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    iput-object p1, p0, Lo/alo;->d:Lcom/huawei/health/manager/DaemonService;

    .line 41
    new-instance v0, Lo/amt;

    invoke-direct {v0, p1}, Lo/amt;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/alo;->g:Lo/amt;

    .line 42
    return-void
.end method

.method static synthetic a(Lo/alo;)Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lo/alo;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lo/alo;Z)Z
    .locals 0

    .line 16
    iput-boolean p1, p0, Lo/alo;->f:Z

    return p1
.end method

.method static synthetic c(Lo/alo;)Lcom/huawei/health/manager/DaemonService;
    .locals 1

    .line 16
    iget-object v0, p0, Lo/alo;->d:Lcom/huawei/health/manager/DaemonService;

    return-object v0
.end method

.method private d()V
    .locals 4

    .line 45
    const-string v0, "HealthDeviceOper_RemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceOperRemoteProxy create thread"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "Timer"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/alo;->e:Landroid/os/HandlerThread;

    .line 48
    const-string v0, "HealthDeviceOper_RemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceOperRemoteProxy start thread"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    iget-object v0, p0, Lo/alo;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 51
    new-instance v0, Lo/alo$4;

    iget-object v1, p0, Lo/alo;->e:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/alo$4;-><init>(Lo/alo;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/alo;->b:Landroid/os/Handler;

    .line 68
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/alo;->h:Z

    .line 69
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 113
    if-nez p1, :cond_0

    .line 114
    const-string v0, "HealthDeviceOper_RemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "macAddress is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    return-void

    .line 118
    :cond_0
    const-string v0, "HealthDeviceOper_RemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDeviceOperRemoteProxy releaseDevice macAddress = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/alo;->f:Z

    .line 124
    iget-object v0, p0, Lo/alo;->b:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 126
    iget-boolean v0, p0, Lo/alo;->c:Z

    if-eqz v0, :cond_1

    .line 127
    iget-object v0, p0, Lo/alo;->d:Lcom/huawei/health/manager/DaemonService;

    invoke-static {v0}, Lo/alm;->e(Landroid/content/Context;)Lo/alm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/alm;->d(Ljava/lang/String;)Z

    .line 128
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/alo;->c:Z

    .line 131
    :cond_1
    iget-object v0, p0, Lo/alo;->e:Landroid/os/HandlerThread;

    if-eqz v0, :cond_2

    .line 132
    const-string v0, "HealthDeviceOper_RemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceOperRemoteProxy finish thread"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    iget-object v0, p0, Lo/alo;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 134
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alo;->e:Landroid/os/HandlerThread;

    .line 135
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alo;->b:Landroid/os/Handler;

    .line 136
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/alo;->h:Z

    .line 138
    :cond_2
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 81
    if-nez p1, :cond_0

    .line 82
    const-string v0, "HealthDeviceOper_RemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    return-void

    .line 85
    :cond_0
    const-string v0, "HealthDeviceOper_RemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDeviceOperRemoteProxy holdDevice() deviceInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    iput-object p1, p0, Lo/alo;->a:Ljava/lang/String;

    .line 88
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/alo;->c:Z

    .line 90
    iget-boolean v0, p0, Lo/alo;->h:Z

    if-nez v0, :cond_1

    .line 91
    invoke-direct {p0}, Lo/alo;->d()V

    .line 94
    :cond_1
    iget-boolean v0, p0, Lo/alo;->f:Z

    if-nez v0, :cond_2

    .line 95
    iget-object v0, p0, Lo/alo;->d:Lcom/huawei/health/manager/DaemonService;

    invoke-static {v0}, Lo/alm;->e(Landroid/content/Context;)Lo/alm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/alm;->e(Ljava/lang/String;)V

    .line 96
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/alo;->f:Z

    .line 105
    :cond_2
    iget-object v0, p0, Lo/alo;->b:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 106
    iget-object v0, p0, Lo/alo;->b:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 108
    :cond_3
    iget-object v0, p0, Lo/alo;->b:Landroid/os/Handler;

    const/4 v1, 0x1

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 109
    return-void
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lo/alo;->g:Lo/amt;

    invoke-virtual {v0}, Lo/amt;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 74
    new-instance v0, Landroid/os/RemoteException;

    const-string v1, "hw permission check failed"

    invoke-direct {v0, v1}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lo/aba$e;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0
.end method
