.class Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private final e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)V
    .locals 1

    .line 94
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 95
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$d;->e:Ljava/lang/ref/WeakReference;

    .line 96
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 101
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$d;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    .line 102
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 103
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 104
    return-void

    .line 106
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 108
    :sswitch_0
    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->a(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)V

    .line 109
    .line 113
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
    .end sparse-switch
.end method
