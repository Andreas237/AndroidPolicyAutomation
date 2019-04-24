.class public Lcom/huawei/datatype/RunPlanReminder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private run_plan_reminder_switch:I

.field private run_plan_reminder_time_hour:I

.field private run_plan_reminder_time_minute:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRun_plan_reminder_switch()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/huawei/datatype/RunPlanReminder;->run_plan_reminder_switch:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_reminder_time_hour()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/datatype/RunPlanReminder;->run_plan_reminder_time_hour:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_reminder_time_minute()I
    .locals 1

    .line 41
    iget v0, p0, Lcom/huawei/datatype/RunPlanReminder;->run_plan_reminder_time_minute:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public setRun_plan_reminder_switch(I)V
    .locals 1

    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanReminder;->run_plan_reminder_switch:I

    .line 30
    return-void
.end method

.method public setRun_plan_reminder_time_hour(I)V
    .locals 1

    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanReminder;->run_plan_reminder_time_hour:I

    .line 38
    return-void
.end method

.method public setRun_plan_reminder_time_minute(I)V
    .locals 1

    .line 45
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanReminder;->run_plan_reminder_time_minute:I

    .line 46
    return-void
.end method
