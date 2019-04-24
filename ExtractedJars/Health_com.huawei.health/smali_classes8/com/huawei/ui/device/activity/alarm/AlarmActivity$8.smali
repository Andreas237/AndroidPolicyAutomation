.class Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/alarm/AlarmActivity;
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

    .line 1059
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 6

    .line 1062
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== onCheckedChanged isChecked = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1063
    invoke-static {p2}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->b(Z)Z

    .line 1065
    invoke-static {}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1066
    const/4 v4, 0x1

    goto :goto_0

    .line 1068
    :cond_0
    const/4 v4, 0x0

    .line 1070
    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1071
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1072
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mSmartAlarmInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1073
    return-void

    .line 1075
    :cond_1
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== onCheckedChanged mSmartAlarmInfo hour = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_hour()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", Mins = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    .line 1076
    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_mins()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1075
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1077
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmEnable(I)V

    .line 1078
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1080
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-boolean v0, v0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a:Z

    if-eqz v0, :cond_2

    .line 1081
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/enz;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/enz;->a(Ljava/util/List;)V

    .line 1082
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/enz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->q(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8$1;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8;)V

    invoke-virtual {v0, v1, v5, v2}, Lo/enz;->b(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_1

    .line 1088
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->i(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    .line 1089
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8;->d:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->I(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/enz;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8$2;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8;)V

    invoke-virtual {v0, v5, v1}, Lo/enz;->d(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1102
    :goto_1
    return-void
.end method
