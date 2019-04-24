.class Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$d;
.super Lo/aat$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;


# direct methods
.method public constructor <init>(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)V
    .locals 0

    .line 108
    invoke-direct {p0}, Lo/aat$e;-><init>()V

    .line 109
    iput-object p1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$d;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    .line 110
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)Landroid/os/IBinder;
    .locals 6

    .line 114
    invoke-static {}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->k()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 115
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getNameForUid(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "callingApp is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/cwo;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$d;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lo/aau$e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v4

    return-object v0

    .line 119
    :cond_0
    const-string v0, "com.huawei.health"

    :try_start_1
    invoke-static {}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 120
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$d;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lo/aau$e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit v4

    return-object v0

    .line 122
    :cond_1
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 124
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method
