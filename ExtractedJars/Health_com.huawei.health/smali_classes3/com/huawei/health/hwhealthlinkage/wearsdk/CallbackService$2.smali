.class Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/os/IInterface;

.field final synthetic c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

.field final synthetic e:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Landroid/os/IInterface;Ljava/util/Map;)V
    .locals 0

    .line 1063
    iput-object p1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$2;->c:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    iput-object p2, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$2;->a:Landroid/os/IInterface;

    iput-object p3, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$2;->e:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1066
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$2;->a:Landroid/os/IInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1067
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$2;->a:Landroid/os/IInterface;

    check-cast v0, Lo/aaz;

    iget-object v1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$2;->e:Ljava/util/Map;

    invoke-interface {v0, v1}, Lo/aaz;->requestWearTask(Ljava/util/Map;)V

    goto :goto_0

    .line 1069
    :cond_0
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calling remote callback, item is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 1075
    :goto_0
    goto :goto_1

    .line 1071
    :catch_0
    move-exception v4

    .line 1072
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1075
    goto :goto_1

    .line 1073
    :catch_1
    move-exception v4

    .line 1074
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1076
    :goto_1
    return-void
.end method
