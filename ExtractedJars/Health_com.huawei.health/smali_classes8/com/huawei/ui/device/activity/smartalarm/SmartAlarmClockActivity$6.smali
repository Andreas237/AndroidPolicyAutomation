.class Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$6;->e:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 212
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceSmartAlarm() err_code ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",objData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$6;->e:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$6;->e:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->a(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Lo/enz;

    move-result-object v1

    invoke-virtual {v1, p2}, Lo/enz;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->e(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;Ljava/util/List;)Ljava/util/List;

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$6;->e:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->d(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    .line 215
    return-void
.end method
