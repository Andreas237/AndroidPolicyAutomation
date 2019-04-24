.class Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/enh;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;
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

    .line 604
    iput-object p1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$4;->e:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/enm;II)V
    .locals 1

    .line 608
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$4;->e:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->u(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 609
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$4;->e:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->t(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    .line 611
    :cond_0
    return-void
.end method
