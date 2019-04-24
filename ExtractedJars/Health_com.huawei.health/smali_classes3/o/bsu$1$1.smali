.class Lo/bsu$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsu$1;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/bsu$1;


# direct methods
.method constructor <init>(Lo/bsu$1;)V
    .locals 0

    .line 354
    iput-object p1, p0, Lo/bsu$1$1;->c:Lo/bsu$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 2

    .line 357
    iget-object v0, p0, Lo/bsu$1$1;->c:Lo/bsu$1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bsu$1;->onServiceDisconnected(Landroid/content/ComponentName;)V

    .line 358
    iget-object v0, p0, Lo/bsu$1$1;->c:Lo/bsu$1;

    iget-object v0, v0, Lo/bsu$1;->c:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;

    invoke-interface {v0, p1, p2}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;->b(ILjava/lang/String;)V

    .line 359
    return-void
.end method

.method public e()V
    .locals 2

    .line 363
    iget-object v0, p0, Lo/bsu$1$1;->c:Lo/bsu$1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bsu$1;->onServiceDisconnected(Landroid/content/ComponentName;)V

    .line 364
    iget-object v0, p0, Lo/bsu$1$1;->c:Lo/bsu$1;

    iget-object v0, v0, Lo/bsu$1;->c:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;

    invoke-interface {v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;->e()V

    .line 365
    return-void
.end method
