.class Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V
    .locals 0

    .line 497
    iput-object p1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 10

    .line 500
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSmartAlarm() err_code = "

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

    .line 501
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    move-object v1, p2

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->e(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;Ljava/util/List;)Ljava/util/List;

    .line 502
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->h(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->h(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 503
    :cond_0
    new-instance v4, Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-direct {v4}, Lcom/huawei/datatype/SmartAlarmInfo;-><init>()V

    .line 504
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->e(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;Ljava/util/List;)Ljava/util/List;

    .line 505
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->h(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 509
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->p(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Lo/fez;

    move-result-object v0

    invoke-virtual {v0}, Lo/fez;->getSelectedHour()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->p(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Lo/fez;

    move-result-object v1

    invoke-virtual {v1}, Lo/fez;->getSelectedMinute()I

    move-result v1

    add-int v4, v0, v1

    .line 511
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->o(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)I

    move-result v5

    .line 512
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->h(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/datatype/SmartAlarmInfo;

    .line 514
    const/4 v7, 0x1

    .line 515
    div-int/lit8 v0, v4, 0x64

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmStartTime_hour(I)V

    .line 516
    rem-int/lit8 v0, v4, 0x64

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmStartTime_mins(I)V

    .line 517
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveUIData!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    div-int/lit8 v3, v4, 0x64

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    rem-int/lit8 v3, v4, 0x64

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 518
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->m(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmRepeat(I)V

    .line 519
    invoke-virtual {v6, v5}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmAheadTime(I)V

    .line 520
    invoke-virtual {v6, v7}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmEnable(I)V

    .line 521
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 522
    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 524
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->n(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v9

    .line 525
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->l(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/env;->b(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    .line 526
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    new-instance v1, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11$4;-><init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 534
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;->d:Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->a(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Lo/enz;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11$5;-><init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;)V

    invoke-virtual {v0, v8, v1}, Lo/enz;->d(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 548
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveUIData() setDBAlarmClock()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/datatype/SmartAlarmInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 549
    return-void
.end method
