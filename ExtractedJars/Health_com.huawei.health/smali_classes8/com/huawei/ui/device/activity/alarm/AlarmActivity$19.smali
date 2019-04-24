.class Lcom/huawei/ui/device/activity/alarm/AlarmActivity$19;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V
    .locals 0

    .line 519
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$19;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 522
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$19;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    const-class v1, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 523
    const-string v0, "key_to_smart_alarm_activity"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$19;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->x(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v1

    mul-int/lit8 v1, v1, 0x64

    iget-object v2, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$19;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v2}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->B(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 524
    const-string v0, "device_id"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$19;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->q(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 525
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$19;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v3, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 526
    return-void
.end method
