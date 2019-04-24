.class public Lo/djo;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static b:Lo/djo;

.field private static final f:Ljava/lang/Object;


# instance fields
.field private a:Lo/dde;

.field private c:Landroid/content/Context;

.field private d:Lo/dqi;

.field private e:Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil;

.field private g:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 53
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/djo;->f:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 36
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 81
    new-instance v0, Lo/djo$5;

    invoke-direct {v0, p0}, Lo/djo$5;-><init>(Lo/djo;)V

    iput-object v0, p0, Lo/djo;->g:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 37
    iput-object p1, p0, Lo/djo;->c:Landroid/content/Context;

    .line 38
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil;->getInstance()Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil;

    move-result-object v0

    iput-object v0, p0, Lo/djo;->e:Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil;

    .line 39
    invoke-static {p1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/djo;->a:Lo/dde;

    .line 40
    iget-object v0, p0, Lo/djo;->a:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 41
    const-string v0, "HWPressAutoMonitorManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHWDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    return-void

    .line 44
    :cond_0
    iget-object v0, p0, Lo/djo;->a:Lo/dde;

    iget-object v1, p0, Lo/djo;->g:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v2, 0x20

    invoke-virtual {v0, v2, v1}, Lo/dde;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 47
    invoke-static {p1}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lo/djo;->d:Lo/dqi;

    .line 48
    iget-object v0, p0, Lo/djo;->d:Lo/dqi;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 49
    const-string v0, "HWPressAutoMonitorManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHwCombineMigrateMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    :cond_1
    return-void
.end method

.method public static c()Lo/djo;
    .locals 4

    .line 56
    sget-object v2, Lo/djo;->f:Ljava/lang/Object;

    monitor-enter v2

    .line 57
    :try_start_0
    sget-object v0, Lo/djo;->b:Lo/djo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 58
    new-instance v0, Lo/djo;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/djo;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/djo;->b:Lo/djo;

    .line 60
    :cond_0
    sget-object v0, Lo/djo;->b:Lo/djo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 61
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public b(Z)V
    .locals 4

    .line 127
    const-string v0, "HWPressAutoMonitorManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setPressAutoMonitorSwitchStatus,enable-----------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    iget-object v0, p0, Lo/djo;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lo/djo;->d:Lo/dqi;

    .line 130
    iget-object v0, p0, Lo/djo;->d:Lo/dqi;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 131
    const-string v0, "HWPressAutoMonitorManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hWCombineMigrateMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 133
    :cond_0
    iget-object v0, p0, Lo/djo;->d:Lo/dqi;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dqi;->k(Ljava/lang/String;)V

    .line 135
    :goto_0
    return-void
.end method

.method public e(I)V
    .locals 1

    .line 75
    iget-object v0, p0, Lo/djo;->e:Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil;

    invoke-virtual {v0, p1}, Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil;->pushPressAutoMonitor(I)V

    .line 76
    return-void
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 66
    const/16 v0, 0x20

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
