.class Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V
    .locals 0

    .line 390
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 392
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "err_code ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/enz;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/enz;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 395
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmList"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--mSmartAlarmList="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->t(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 398
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/enz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->q(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v2}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->t(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v2

    new-instance v3, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11$5;

    invoke-direct {v3, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11$5;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/enz;->b(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto/16 :goto_0

    .line 404
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0, v5}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->b(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Ljava/util/List;)Ljava/util/List;

    .line 405
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/enz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->t(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/enz;->a(Ljava/util/List;)V

    .line 406
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mSmartAlarmList.size()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

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

    .line 407
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->t(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 408
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->t(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Lcom/huawei/datatype/SmartAlarmInfo;)Lcom/huawei/datatype/SmartAlarmInfo;

    .line 409
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmIndex()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->d(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I

    .line 410
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmEnable()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I

    .line 411
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_hour()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->b(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I

    .line 412
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_mins()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I

    .line 413
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmRepeat()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I

    .line 414
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmAheadTime()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->k(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->y(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->w(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 417
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v2}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->d(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Lcom/huawei/datatype/SmartAlarmInfo;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I

    .line 419
    :cond_2
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmIndex ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->v(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmEnable ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->w(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmStartTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->x(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v3

    mul-int/lit8 v3, v3, 0x64

    iget-object v4, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

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

    .line 422
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmRepeat ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->y(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmAheadTime ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->A(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    .line 425
    const/16 v0, 0x64

    iput v0, v6, Landroid/os/Message;->what:I

    .line 426
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 427
    goto :goto_0

    .line 428
    :cond_3
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSmartAlarmUI() deviceSmartAlarmList == null or size = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 431
    :goto_0
    return-void
.end method