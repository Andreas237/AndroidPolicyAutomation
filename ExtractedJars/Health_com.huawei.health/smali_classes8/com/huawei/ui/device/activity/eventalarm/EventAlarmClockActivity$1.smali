.class Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;I)V
    .locals 0

    .line 689
    iput-object p1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    iput p2, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 692
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateEventAlarm() getEventAlarm() err_code = "

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

    .line 693
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateEventAlarm()---AlarmListItem"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->e(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Lo/eoo;

    move-result-object v3

    invoke-virtual {v3}, Lo/eoo;->k()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 694
    if-nez p1, :cond_0

    .line 695
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    move-object v1, p2

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->d(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;Ljava/util/List;)Ljava/util/List;

    .line 698
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->e(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Lo/eoo;

    move-result-object v1

    invoke-virtual {v1}, Lo/eoo;->k()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_1

    .line 699
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->e(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Lo/eoo;

    move-result-object v1

    invoke-virtual {v1}, Lo/eoo;->k()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 701
    :cond_1
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateEventAlarm() error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 703
    :goto_0
    const/4 v4, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 704
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addAlarm() ++ i  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 705
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/datatype/EventAlarmInfo;

    .line 707
    add-int/lit8 v0, v4, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmIndex(I)V

    .line 708
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->p(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 703
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 710
    :cond_2
    new-instance v4, Lcom/huawei/datatype/EventAlarmInfo;

    invoke-direct {v4}, Lcom/huawei/datatype/EventAlarmInfo;-><init>()V

    .line 711
    iget v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->d:I

    div-int/lit8 v0, v0, 0x64

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmStartTime_hour(I)V

    .line 712
    iget v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->d:I

    rem-int/lit8 v0, v0, 0x64

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmStartTime_mins(I)V

    .line 713
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmRepeat(I)V

    .line 714
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->o(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmName(Ljava/lang/String;)V

    .line 715
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmEnable(I)V

    .line 717
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmIndex(I)V

    .line 719
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->p(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1, v4}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 720
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateEventAlarm() mNewEventAlarmList"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->p(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 721
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->i(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V

    .line 722
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->f(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Lo/enz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;->c:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->p(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1$1;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;)V

    invoke-virtual {v0, v1, v2}, Lo/enz;->b(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 738
    return-void
.end method
