.class public Lo/fkf;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/Map;Lcom/huawei/exercise/modle/RunPlanRecordInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;Lcom/huawei/exercise/modle/RunPlanRecordInfo;)V"
        }
    .end annotation

    .line 19
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 20
    const-string v0, "record_id"

    invoke-virtual {p1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->getRun_plan_record_info_id()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    const-string v0, "status"

    invoke-virtual {p1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->getRun_plan_record_info_status()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    const-string v0, "load_peak"

    invoke-virtual {p1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->getRun_plan_record_info_load_peak()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    const-string v0, "etraining_effect"

    invoke-virtual {p1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->getRun_plan_record_info_etraining_effect()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    const-string v0, "anaerobic_exercise_etraining_effect"

    invoke-virtual {p1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->getRun_plan_record_info_anaerobic_exercise_etraining_effect()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    const-string v0, "extra_poc"

    invoke-virtual {p1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->getRun_plan_record_info_Epoc()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    const-string v0, "max_met"

    invoke-virtual {p1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->getRun_plan_record_info_maxMET()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    const-string v0, "recovery_time"

    invoke-virtual {p1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->getRun_plan_record_info_recovery_time()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    const-string v0, "achieve_percent"

    invoke-virtual {p1}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->getRun_plan_record_info_achieve_percent()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    :cond_0
    return-void
.end method

.method public static c(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 34
    const-string v0, "track_run_curenttime"

    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v1

    invoke-virtual {v1}, Lo/brt;->s()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    const-string v0, "track_run_pretime"

    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v1

    invoke-virtual {v1}, Lo/brt;->n()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    return-void
.end method
