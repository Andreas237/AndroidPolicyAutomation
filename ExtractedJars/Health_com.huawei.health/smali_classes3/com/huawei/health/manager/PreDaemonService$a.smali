.class Lcom/huawei/health/manager/PreDaemonService$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/manager/PreDaemonService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/manager/PreDaemonService;


# direct methods
.method private constructor <init>(Lcom/huawei/health/manager/PreDaemonService;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/huawei/health/manager/PreDaemonService$a;->c:Lcom/huawei/health/manager/PreDaemonService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/manager/PreDaemonService;Lcom/huawei/health/manager/PreDaemonService$4;)V
    .locals 0

    .line 116
    invoke-direct {p0, p1}, Lcom/huawei/health/manager/PreDaemonService$a;-><init>(Lcom/huawei/health/manager/PreDaemonService;)V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5

    .line 119
    iget-object v0, p0, Lcom/huawei/health/manager/PreDaemonService$a;->c:Lcom/huawei/health/manager/PreDaemonService;

    invoke-static {p2}, Lo/akm$b;->b(Landroid/os/IBinder;)Lo/akm;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/manager/PreDaemonService;->e(Lcom/huawei/health/manager/PreDaemonService;Lo/akm;)Lo/akm;

    .line 120
    iget-object v0, p0, Lcom/huawei/health/manager/PreDaemonService$a;->c:Lcom/huawei/health/manager/PreDaemonService;

    invoke-static {v0}, Lcom/huawei/health/manager/PreDaemonService;->e(Lcom/huawei/health/manager/PreDaemonService;)Lo/akm;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 122
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/manager/PreDaemonService$a;->c:Lcom/huawei/health/manager/PreDaemonService;

    invoke-static {v0}, Lcom/huawei/health/manager/PreDaemonService;->e(Lcom/huawei/health/manager/PreDaemonService;)Lo/akm;

    move-result-object v0

    invoke-interface {v0}, Lo/akm;->c()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    goto :goto_0

    .line 123
    :catch_0
    move-exception v4

    .line 124
    const-string v0, "Step_PreD"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    :cond_0
    :goto_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 132
    iget-object v0, p0, Lcom/huawei/health/manager/PreDaemonService$a;->c:Lcom/huawei/health/manager/PreDaemonService;

    invoke-static {v0}, Lcom/huawei/health/manager/PreDaemonService;->e(Lcom/huawei/health/manager/PreDaemonService;)Lo/akm;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/huawei/health/manager/PreDaemonService$a;->c:Lcom/huawei/health/manager/PreDaemonService;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/manager/PreDaemonService;->e(Lcom/huawei/health/manager/PreDaemonService;Lo/akm;)Lo/akm;

    .line 135
    :cond_0
    return-void
.end method
