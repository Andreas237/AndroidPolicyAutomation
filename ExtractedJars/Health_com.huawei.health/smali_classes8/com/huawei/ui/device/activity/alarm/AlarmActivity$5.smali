.class Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V
    .locals 0

    .line 786
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 9

    .line 789
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    move-object v1, p2

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->b(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Ljava/util/List;)Ljava/util/List;

    .line 790
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mSmartAlarmList.objData"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 791
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->t(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->t(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 792
    :cond_0
    new-instance v5, Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-direct {v5}, Lcom/huawei/datatype/SmartAlarmInfo;-><init>()V

    .line 793
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->b(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Ljava/util/List;)Ljava/util/List;

    .line 794
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->t(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 796
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 797
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mSmartAlarmList.size()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->t(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

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

    .line 798
    const/4 v6, 0x0

    .line 799
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->t(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 800
    new-instance v7, Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-direct {v7}, Lcom/huawei/datatype/SmartAlarmInfo;-><init>()V

    .line 801
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->t(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Lcom/huawei/datatype/SmartAlarmInfo;)Lcom/huawei/datatype/SmartAlarmInfo;

    .line 802
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmIndex()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->d(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I

    .line 803
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->v(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmIndex(I)V

    .line 804
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmEnable()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I

    .line 805
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->w(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmEnable(I)V

    .line 806
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_hour()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->b(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I

    .line 807
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->x(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmStartTime_hour(I)V

    .line 808
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_mins()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I

    .line 809
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->B(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmStartTime_mins(I)V

    .line 810
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmRepeat()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I

    .line 811
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->y(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmRepeat(I)V

    .line 812
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmAheadTime()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->k(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I

    .line 813
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->A(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmAheadTime(I)V

    .line 815
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->y(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->w(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 816
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v2}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->d(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Lcom/huawei/datatype/SmartAlarmInfo;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I

    .line 817
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->w(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmEnable(I)V

    .line 818
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->w(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 819
    const/4 v6, 0x1

    .line 822
    :cond_2
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 823
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmIndex ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->v(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 824
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmEnable ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->w(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 825
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmStartTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->x(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v3

    mul-int/lit8 v3, v3, 0x64

    iget-object v4, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v4}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->B(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 826
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmRepeat ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->y(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 827
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmAheadTime ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->A(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v8

    .line 829
    const/16 v0, 0x64

    iput v0, v8, Landroid/os/Message;->what:I

    .line 830
    iput-object v5, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 831
    iput v6, v8, Landroid/os/Message;->arg1:I

    .line 832
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;->b:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 833
    goto :goto_0

    .line 834
    :cond_3
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSmartAlarm() mSmartAlarmList == null or size = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 836
    :goto_0
    return-void
.end method
