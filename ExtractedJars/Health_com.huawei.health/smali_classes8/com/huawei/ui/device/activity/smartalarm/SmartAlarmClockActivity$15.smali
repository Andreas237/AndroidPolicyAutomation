.class Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/egh;

.field final synthetic d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;Lo/egh;)V
    .locals 0

    .line 388
    iput-object p1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$15;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    iput-object p2, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$15;->b:Lo/egh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 391
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$15;->b:Lo/egh;

    invoke-virtual {v0}, Lo/egh;->d()[Z

    move-result-object v3

    .line 392
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$15;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$15;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->i(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Lo/eoh;

    move-result-object v1

    invoke-virtual {v1, v3}, Lo/eoh;->c([Z)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->a(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;I)I

    .line 393
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$15;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$15;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->i(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Lo/eoh;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$15;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v2}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->i(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Lo/eoh;

    move-result-object v2

    invoke-virtual {v2, v3}, Lo/eoh;->c([Z)I

    move-result v2

    invoke-virtual {v1, v2}, Lo/eoh;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 394
    return-void
.end method
