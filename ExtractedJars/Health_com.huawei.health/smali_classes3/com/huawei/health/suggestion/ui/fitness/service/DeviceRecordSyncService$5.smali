.class Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$5;->e:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 167
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$5;->e:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->e(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$5;->e:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->b(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dge;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 168
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$5;->e:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->e(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$5;->e:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->c(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$5;->e:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->i(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/dge;->e(II)V

    .line 169
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$5;->e:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->e(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$5;->e:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->c(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$5;->e:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->i(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/dge;->b(II)V

    .line 170
    return-void
.end method
