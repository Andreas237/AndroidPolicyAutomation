.class Lcom/huawei/ui/device/activity/alarm/AlarmActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V
    .locals 0

    .line 667
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$1;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 12

    .line 671
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getEventAlarm() err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",objData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v3, p2, :cond_0

    const-string v3, "null"

    goto :goto_0

    :cond_0
    move-object v3, p2

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 672
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 673
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 674
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$1;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    move-object v1, p2

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Ljava/util/List;)Ljava/util/List;

    .line 676
    :cond_1
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getEventAlarm() mEventAlarmDBList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$1;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 677
    const/4 v8, 0x0

    .line 678
    const/4 v9, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$1;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_3

    .line 679
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$1;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/datatype/EventAlarmInfo;

    .line 709
    new-instance v11, Lo/eoo;

    invoke-direct {v11}, Lo/eoo;-><init>()V

    .line 710
    move-object v0, v11

    move-object v1, v11

    move-object v2, v10

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$1;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->u(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/enx;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$1;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v4}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->o(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$1;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v5}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v5

    move v6, v9

    invoke-virtual/range {v0 .. v6}, Lo/eoo;->e(Lo/eoo;Lcom/huawei/datatype/EventAlarmInfo;Lo/enx;Landroid/content/Context;Ljava/util/List;I)Lo/eoo;

    move-result-object v11

    .line 711
    if-nez v8, :cond_2

    .line 712
    invoke-virtual {v11}, Lo/eoo;->f()I

    move-result v8

    .line 714
    :cond_2
    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 678
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 716
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$1;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v9

    .line 717
    const/16 v0, 0x66

    iput v0, v9, Landroid/os/Message;->what:I

    .line 718
    iput-object v7, v9, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 719
    iput v8, v9, Landroid/os/Message;->arg1:I

    .line 720
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$1;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 721
    return-void
.end method
