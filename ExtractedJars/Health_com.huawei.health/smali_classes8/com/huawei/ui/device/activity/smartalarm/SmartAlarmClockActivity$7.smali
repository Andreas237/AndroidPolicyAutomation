.class Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V
    .locals 0

    .line 245
    iput-object p1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$7;->b:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 248
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() id = clock_btn_save_sure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$7;->b:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->e(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$7;->b:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->c(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    goto :goto_0

    .line 256
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$7;->b:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->g(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$7;->b:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;I)I

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$7;->b:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->c(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    goto :goto_0

    .line 261
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$7;->b:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->finish()V

    .line 264
    :goto_0
    return-void
.end method
