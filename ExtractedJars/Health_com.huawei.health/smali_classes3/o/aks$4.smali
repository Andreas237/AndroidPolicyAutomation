.class Lo/aks$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aks;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/aks;


# direct methods
.method constructor <init>(Lo/aks;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lo/aks$4;->b:Lo/aks;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5

    .line 62
    :try_start_0
    iget-object v0, p0, Lo/aks$4;->b:Lo/aks;

    move-object v1, p2

    check-cast v1, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    invoke-virtual {v1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->d()Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    move-result-object v1

    invoke-static {v0, v1}, Lo/aks;->b(Lo/aks;Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    .line 63
    iget-object v0, p0, Lo/aks$4;->b:Lo/aks;

    move-object v1, p2

    check-cast v1, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    invoke-static {v0, v1}, Lo/aks;->b(Lo/aks;Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;)Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    .line 64
    iget-object v0, p0, Lo/aks$4;->b:Lo/aks;

    invoke-static {v0}, Lo/aks;->a(Lo/aks;)Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;

    move-result-object v0

    iget-object v1, p0, Lo/aks$4;->b:Lo/aks;

    invoke-static {v1}, Lo/aks;->e(Lo/aks;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 65
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onServiceConnected notified"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    iget-object v0, p0, Lo/aks$4;->b:Lo/aks;

    iget-object v1, p0, Lo/aks$4;->b:Lo/aks;

    invoke-static {v1}, Lo/aks;->b(Lo/aks;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lo/aks;->a(Lo/aks;Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    goto :goto_0

    .line 68
    :catch_0
    move-exception v4

    .line 69
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    :goto_0
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLocalCallbackConn has been connected!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 78
    const-string v0, "HWhealthLinkage_WearSDK"

    const-string v1, "Service has unexpectedly disconnected"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    return-void
.end method
