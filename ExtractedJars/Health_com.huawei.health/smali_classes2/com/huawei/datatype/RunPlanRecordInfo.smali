.class public Lcom/huawei/datatype/RunPlanRecordInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private run_plan_record_info_Epoc:I

.field private run_plan_record_info_HrABS_max:I

.field private run_plan_record_info_HrABS_min:I

.field private run_plan_record_info_achieve_percent:I

.field private run_plan_record_info_calorie:I

.field private run_plan_record_info_climb:I

.field private run_plan_record_info_daily_score:I

.field private run_plan_record_info_date_info:I

.field private run_plan_record_info_distance:I

.field private run_plan_record_info_end_time:J

.field private run_plan_record_info_etraining_effect:I

.field private run_plan_record_info_exercise_duration:J

.field private run_plan_record_info_id:I

.field private run_plan_record_info_load_peak:I

.field private run_plan_record_info_maxMET:I

.field private run_plan_record_info_recovery_time:I

.field private run_plan_record_info_speed:F

.field private run_plan_record_info_start_time:J

.field private run_plan_record_info_status:I

.field private run_plan_record_info_step:I

.field private run_plan_record_info_total_time:I

.field private run_plan_record_info_wourkout_id:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRun_plan_record_info_Epoc()I
    .locals 1

    .line 253
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_Epoc:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_HrABS_max()I
    .locals 1

    .line 221
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_HrABS_max:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_HrABS_min()I
    .locals 1

    .line 213
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_HrABS_min:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_achieve_percent()I
    .locals 1

    .line 245
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_achieve_percent:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_calorie()I
    .locals 1

    .line 165
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_calorie:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_climb()I
    .locals 1

    .line 205
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_climb:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_daily_score()I
    .locals 1

    .line 277
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_daily_score:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_date_info()I
    .locals 1

    .line 293
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_date_info:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_distance()I
    .locals 1

    .line 173
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_distance:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_end_time()J
    .locals 2

    .line 157
    iget-wide v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_end_time:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getRun_plan_record_info_etraining_effect()I
    .locals 1

    .line 237
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_etraining_effect:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_exercise_duration()J
    .locals 2

    .line 285
    iget-wide v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_exercise_duration:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getRun_plan_record_info_id()I
    .locals 1

    .line 125
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_id:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_load_peak()I
    .locals 1

    .line 229
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_load_peak:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_maxMET()I
    .locals 1

    .line 261
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_maxMET:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_recovery_time()I
    .locals 1

    .line 269
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_recovery_time:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_speed()F
    .locals 1

    .line 197
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_speed:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_start_time()J
    .locals 2

    .line 149
    iget-wide v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_start_time:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getRun_plan_record_info_status()I
    .locals 1

    .line 141
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_status:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_step()I
    .locals 1

    .line 181
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_step:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_total_time()I
    .locals 1

    .line 189
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_total_time:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_info_wourkout_id()I
    .locals 1

    .line 133
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_wourkout_id:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public setRun_plan_record_info_Epoc(I)V
    .locals 1

    .line 257
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_Epoc:I

    .line 258
    return-void
.end method

.method public setRun_plan_record_info_HrABS_max(I)V
    .locals 1

    .line 225
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_HrABS_max:I

    .line 226
    return-void
.end method

.method public setRun_plan_record_info_HrABS_min(I)V
    .locals 1

    .line 217
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_HrABS_min:I

    .line 218
    return-void
.end method

.method public setRun_plan_record_info_achieve_percent(I)V
    .locals 1

    .line 249
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_achieve_percent:I

    .line 250
    return-void
.end method

.method public setRun_plan_record_info_calorie(I)V
    .locals 1

    .line 169
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_calorie:I

    .line 170
    return-void
.end method

.method public setRun_plan_record_info_climb(I)V
    .locals 1

    .line 209
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_climb:I

    .line 210
    return-void
.end method

.method public setRun_plan_record_info_daily_score(I)V
    .locals 1

    .line 281
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_daily_score:I

    .line 282
    return-void
.end method

.method public setRun_plan_record_info_date_info(I)V
    .locals 1

    .line 297
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_date_info:I

    .line 298
    return-void
.end method

.method public setRun_plan_record_info_distance(I)V
    .locals 1

    .line 177
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_distance:I

    .line 178
    return-void
.end method

.method public setRun_plan_record_info_end_time(J)V
    .locals 2

    .line 161
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_end_time:J

    .line 162
    return-void
.end method

.method public setRun_plan_record_info_etraining_effect(I)V
    .locals 1

    .line 241
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_etraining_effect:I

    .line 242
    return-void
.end method

.method public setRun_plan_record_info_exercise_duration(J)V
    .locals 2

    .line 289
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_exercise_duration:J

    .line 290
    return-void
.end method

.method public setRun_plan_record_info_id(I)V
    .locals 1

    .line 129
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_id:I

    .line 130
    return-void
.end method

.method public setRun_plan_record_info_load_peak(I)V
    .locals 1

    .line 233
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_load_peak:I

    .line 234
    return-void
.end method

.method public setRun_plan_record_info_maxMET(I)V
    .locals 1

    .line 265
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_maxMET:I

    .line 266
    return-void
.end method

.method public setRun_plan_record_info_recovery_time(I)V
    .locals 1

    .line 273
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_recovery_time:I

    .line 274
    return-void
.end method

.method public setRun_plan_record_info_speed(F)V
    .locals 1

    .line 201
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_speed:F

    .line 202
    return-void
.end method

.method public setRun_plan_record_info_start_time(J)V
    .locals 2

    .line 153
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_start_time:J

    .line 154
    return-void
.end method

.method public setRun_plan_record_info_status(I)V
    .locals 1

    .line 145
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_status:I

    .line 146
    return-void
.end method

.method public setRun_plan_record_info_step(I)V
    .locals 1

    .line 185
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_step:I

    .line 186
    return-void
.end method

.method public setRun_plan_record_info_total_time(I)V
    .locals 1

    .line 193
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_total_time:I

    .line 194
    return-void
.end method

.method public setRun_plan_record_info_wourkout_id(I)V
    .locals 1

    .line 137
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordInfo;->run_plan_record_info_wourkout_id:I

    .line 138
    return-void
.end method
