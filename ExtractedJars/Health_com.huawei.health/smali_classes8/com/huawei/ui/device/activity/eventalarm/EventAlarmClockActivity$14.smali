.class Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V
    .locals 0

    .line 410
    iput-object p1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14;->b:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 413
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteClock()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14;->b:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

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

    .line 414
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteClock() getEventAlarm() err_code = "

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

    .line 415
    if-nez p1, :cond_0

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14;->b:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    move-object v1, p2

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->d(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;Ljava/util/List;)Ljava/util/List;

    .line 418
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14;->b:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14;->b:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14;->b:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->e(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Lo/eoo;

    move-result-object v1

    invoke-virtual {v1}, Lo/eoo;->k()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_2

    .line 419
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14;->b:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14;->b:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->e(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Lo/eoo;

    move-result-object v1

    invoke-virtual {v1}, Lo/eoo;->k()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 421
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14;->b:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 422
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14;->b:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/datatype/EventAlarmInfo;

    .line 423
    add-int/lit8 v0, v4, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmIndex(I)V

    .line 424
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteClock mEventAlarmList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/datatype/EventAlarmInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    goto :goto_1

    .line 427
    :cond_2
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteClock() error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14;->b:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->i(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V

    .line 430
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14;->b:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->f(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Lo/enz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14;->b:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14$4;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14;)V

    invoke-virtual {v0, v1, v2}, Lo/enz;->b(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 455
    return-void
.end method
