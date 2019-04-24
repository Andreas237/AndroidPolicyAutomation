.class Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;>;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V
    .locals 1

    .line 130
    iput-object p1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$e;->b:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 131
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$e;->a:Ljava/lang/ref/WeakReference;

    .line 132
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 135
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    .line 137
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 138
    return-void

    .line 140
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 142
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$e;->b:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    .line 143
    .line 147
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
