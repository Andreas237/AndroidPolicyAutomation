.class public Lcom/huawei/datatype/RunPlanRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private runPlanRecordStructList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/RunPlanRecordStruct;>;"
        }
    .end annotation
.end field

.field private run_plan_record_count:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRunPlanRecordStructList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/datatype/RunPlanRecordStruct;>;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/huawei/datatype/RunPlanRecord;->runPlanRecordStructList:Ljava/util/List;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getRun_plan_record_count()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecord;->run_plan_record_count:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public setRunPlanRecordStructList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/RunPlanRecordStruct;>;)V"
        }
    .end annotation

    .line 34
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/datatype/RunPlanRecord;->runPlanRecordStructList:Ljava/util/List;

    .line 35
    return-void
.end method

.method public setRun_plan_record_count(I)V
    .locals 1

    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecord;->run_plan_record_count:I

    .line 27
    return-void
.end method
