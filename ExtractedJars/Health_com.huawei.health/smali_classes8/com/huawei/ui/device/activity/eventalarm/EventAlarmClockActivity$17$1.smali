.class Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$17$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$17;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$17;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$17;)V
    .locals 0

    .line 593
    iput-object p1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$17$1;->d:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$17;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 596
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addAlarm() err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 597
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$17$1;->d:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$17;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$17;->b:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V

    .line 598
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$17$1;->d:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$17;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$17;->b:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->finish()V

    .line 599
    return-void
.end method
