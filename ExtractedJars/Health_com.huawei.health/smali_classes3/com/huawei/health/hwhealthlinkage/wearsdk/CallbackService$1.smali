.class Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

.field final synthetic d:Ljava/util/Map;

.field final synthetic e:Landroid/os/IInterface;


# direct methods
.method constructor <init>(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Landroid/os/IInterface;Ljava/util/Map;)V
    .locals 0

    .line 1087
    iput-object p1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$1;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    iput-object p2, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$1;->e:Landroid/os/IInterface;

    iput-object p3, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$1;->d:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1090
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$1;->e:Landroid/os/IInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1091
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$1;->e:Landroid/os/IInterface;

    check-cast v0, Lo/aaz;

    iget-object v1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$1;->d:Ljava/util/Map;

    invoke-interface {v0, v1}, Lo/aaz;->requestWearTask(Ljava/util/Map;)V

    goto :goto_0

    .line 1093
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

    .line 1099
    :goto_0
    goto :goto_1

    .line 1095
    :catch_0
    move-exception v4

    .line 1096
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1099
    goto :goto_1

    .line 1097
    :catch_1
    move-exception v4

    .line 1098
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1100
    :goto_1
    return-void
.end method
