.class public Lcom/huawei/exercise/modle/RunPlanReminder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private run_plan_reminder_switch:I

.field private run_plan_reminder_time_hour:I

.field private run_plan_reminder_time_minute:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRun_plan_reminder_switch()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/huawei/exercise/modle/RunPlanReminder;->run_plan_reminder_switch:I

    return v0
.end method

.method public getRun_plan_reminder_time_hour()I
    .locals 1

    .line 24
    iget v0, p0, Lcom/huawei/exercise/modle/RunPlanReminder;->run_plan_reminder_time_hour:I

    return v0
.end method

.method public getRun_plan_reminder_time_minute()I
    .locals 1

    .line 32
    iget v0, p0, Lcom/huawei/exercise/modle/RunPlanReminder;->run_plan_reminder_time_minute:I

    return v0
.end method

.method public setRun_plan_reminder_switch(I)V
    .locals 0

    .line 20
    iput p1, p0, Lcom/huawei/exercise/modle/RunPlanReminder;->run_plan_reminder_switch:I

    .line 21
    return-void
.end method

.method public setRun_plan_reminder_time_hour(I)V
    .locals 0

    .line 28
    iput p1, p0, Lcom/huawei/exercise/modle/RunPlanReminder;->run_plan_reminder_time_hour:I

    .line 29
    return-void
.end method

.method public setRun_plan_reminder_time_minute(I)V
    .locals 0

    .line 36
    iput p1, p0, Lcom/huawei/exercise/modle/RunPlanReminder;->run_plan_reminder_time_minute:I

    .line 37
    return-void
.end method
