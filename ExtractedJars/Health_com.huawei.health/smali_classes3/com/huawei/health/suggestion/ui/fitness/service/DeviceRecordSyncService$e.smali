.class public Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$e;
.super Landroid/os/Binder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field a:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;

.field final synthetic c:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$e;->c:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$e;->a:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;

    return-object v0
.end method

.method public d()V
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$e;->c:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->d(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$d;->sendEmptyMessage(I)Z

    .line 88
    return-void
.end method

.method public d(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$e;->a:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;

    .line 84
    return-void
.end method
