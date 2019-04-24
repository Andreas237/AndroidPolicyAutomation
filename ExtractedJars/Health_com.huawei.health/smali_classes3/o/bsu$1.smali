.class final Lo/bsu$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsu;->d(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;)V
    .locals 0

    .line 350
    iput-object p1, p0, Lo/bsu$1;->c:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 353
    move-object v1, p2

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$e;

    .line 354
    new-instance v0, Lo/bsu$1$1;

    invoke-direct {v0, p0}, Lo/bsu$1$1;-><init>(Lo/bsu$1;)V

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$e;->d(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;)V

    .line 367
    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$e;->d()V

    .line 368
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 5

    .line 373
    :try_start_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 376
    goto :goto_0

    .line 374
    :catch_0
    move-exception v4

    .line 375
    const-string v0, "DataImplHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startDeviceRecordSyncService "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    :goto_0
    return-void
.end method
