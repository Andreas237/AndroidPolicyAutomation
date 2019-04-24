.class public Lcom/huawei/datatype/RunPlanInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private runPlanStructList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/RunPlanStruct;>;"
        }
    .end annotation
.end field

.field private run_plan_sign:Ljava/lang/String;

.field private run_plan_start_date:J

.field private run_plan_total_sign:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRunPlanStructList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/datatype/RunPlanStruct;>;"
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/huawei/datatype/RunPlanInfo;->runPlanStructList:Ljava/util/List;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getRun_plan_sign()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/datatype/RunPlanInfo;->run_plan_sign:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRun_plan_start_date()J
    .locals 2

    .line 45
    iget-wide v0, p0, Lcom/huawei/datatype/RunPlanInfo;->run_plan_start_date:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getRun_plan_total_sign()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/datatype/RunPlanInfo;->run_plan_total_sign:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public setRunPlanStructList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/RunPlanStruct;>;)V"
        }
    .end annotation

    .line 57
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/datatype/RunPlanInfo;->runPlanStructList:Ljava/util/List;

    .line 58
    return-void
.end method

.method public setRun_plan_sign(Ljava/lang/String;)V
    .locals 1

    .line 41
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/datatype/RunPlanInfo;->run_plan_sign:Ljava/lang/String;

    .line 42
    return-void
.end method

.method public setRun_plan_start_date(J)V
    .locals 2

    .line 49
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/datatype/RunPlanInfo;->run_plan_start_date:J

    .line 50
    return-void
.end method

.method public setRun_plan_total_sign(Ljava/lang/String;)V
    .locals 1

    .line 33
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/datatype/RunPlanInfo;->run_plan_total_sign:Ljava/lang/String;

    .line 34
    return-void
.end method
