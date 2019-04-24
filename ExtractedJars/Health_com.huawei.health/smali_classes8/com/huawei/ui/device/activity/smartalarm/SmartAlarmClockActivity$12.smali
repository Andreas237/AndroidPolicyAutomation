.class Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->c(Landroid/content/Context;)V
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

    .line 415
    iput-object p1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$12;->e:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 418
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPromptSaveDialog() Yes ..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$12;->e:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->g(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 420
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$12;->e:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->c(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    .line 422
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$12;->e:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->cancel()V

    .line 425
    return-void
.end method
