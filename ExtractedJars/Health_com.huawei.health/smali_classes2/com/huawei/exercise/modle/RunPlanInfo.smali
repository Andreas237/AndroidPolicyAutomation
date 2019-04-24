.class public Lcom/huawei/exercise/modle/RunPlanInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private runPlanStructList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/exercise/modle/RunPlanStruct;>;"
        }
    .end annotation
.end field

.field private run_plan_sign:Ljava/lang/String;

.field private run_plan_start_date:J

.field private run_plan_total_sign:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRunPlanStructList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/exercise/modle/RunPlanStruct;>;"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/huawei/exercise/modle/RunPlanInfo;->runPlanStructList:Ljava/util/List;

    return-object v0
.end method

.method public getRun_plan_sign()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/exercise/modle/RunPlanInfo;->run_plan_sign:Ljava/lang/String;

    return-object v0
.end method

.method public getRun_plan_start_date()J
    .locals 2

    .line 43
    iget-wide v0, p0, Lcom/huawei/exercise/modle/RunPlanInfo;->run_plan_start_date:J

    return-wide v0
.end method

.method public getRun_plan_total_sign()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/exercise/modle/RunPlanInfo;->run_plan_total_sign:Ljava/lang/String;

    return-object v0
.end method

.method public setRunPlanStructList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/exercise/modle/RunPlanStruct;>;)V"
        }
    .end annotation

    .line 55
    iput-object p1, p0, Lcom/huawei/exercise/modle/RunPlanInfo;->runPlanStructList:Ljava/util/List;

    .line 56
    return-void
.end method

.method public setRun_plan_sign(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/exercise/modle/RunPlanInfo;->run_plan_sign:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public setRun_plan_start_date(J)V
    .locals 0

    .line 47
    iput-wide p1, p0, Lcom/huawei/exercise/modle/RunPlanInfo;->run_plan_start_date:J

    .line 48
    return-void
.end method

.method public setRun_plan_total_sign(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/exercise/modle/RunPlanInfo;->run_plan_total_sign:Ljava/lang/String;

    .line 32
    return-void
.end method
