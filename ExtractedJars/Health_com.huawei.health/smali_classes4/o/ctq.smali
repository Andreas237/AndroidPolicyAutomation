.class public Lo/ctq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ctj;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ctq$d;
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/hihealth/HiSyncOption;

.field private b:Lo/czg;

.field private c:I

.field private d:Landroid/content/Context;

.field private e:I

.field private f:Lo/cpw;

.field private g:Lo/csu;

.field private h:Lo/cst;

.field private i:Lo/cqm;

.field private k:Lo/ctf;

.field private l:Lo/csx;

.field private m:I

.field private n:I

.field private o:Lo/csw;

.field private p:Z

.field private final q:[Ljava/lang/String;

.field private final r:[I

.field private final s:[I

.field private final t:[I

.field private final u:[Ljava/lang/String;

.field private final v:[Ljava/lang/String;

.field private final w:[I

.field private final x:[Ljava/lang/String;

.field private final y:[Ljava/lang/String;

.field private final z:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/huawei/hihealth/HiSyncOption;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    const/4 v0, 0x0

    iput v0, p0, Lo/ctq;->e:I

    .line 68
    const/4 v0, 0x0

    iput v0, p0, Lo/ctq;->m:I

    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ctq;->p:Z

    .line 70
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/ctq;->t:[I

    .line 72
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "maxHeartRate"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "minHeartRate"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "avgRestingHeartRate"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "lastHeartRate"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/ctq;->u:[Ljava/lang/String;

    .line 74
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    iput-object v0, p0, Lo/ctq;->s:[I

    .line 76
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "stress_score_count"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "stress_score_max"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "stress_score_min"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "stress_score_avg"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "stress_score_last"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/ctq;->q:[Ljava/lang/String;

    .line 78
    const/16 v0, 0x9

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    iput-object v0, p0, Lo/ctq;->r:[I

    .line 81
    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "STEP"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "RUN"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "CYCLE"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "FITNESS"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "HEART"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "TOTAL"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "CLIMB"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "SWIM"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "UNKNOWHIGH"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/ctq;->x:[Ljava/lang/String;

    .line 84
    const/16 v0, 0x9

    new-array v0, v0, [I

    fill-array-data v0, :array_3

    iput-object v0, p0, Lo/ctq;->z:[I

    .line 88
    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "stat_sleep_deep_duration"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "stat_sleep_shallow_duration"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "stat_sleep_wake_duration"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "stat_sleep_wake_count"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "stat_sleep_duration_sum"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "stat_sleep_start_time"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "stat_sleep_end_time"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "stat_sleep_regular_start_time"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "stat_sleep_regular_end_time"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/ctq;->y:[Ljava/lang/String;

    .line 92
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_4

    iput-object v0, p0, Lo/ctq;->w:[I

    .line 94
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "heart_rate_rise_duration"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "heart_rate_rise_max"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "heart_rate_rise_min"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "heart_rate_rise_alarmtimes"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/ctq;->v:[Ljava/lang/String;

    .line 100
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HiSyncHealthStat create"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ctq;->d:Landroid/content/Context;

    .line 102
    iput-object p2, p0, Lo/ctq;->a:Lcom/huawei/hihealth/HiSyncOption;

    .line 103
    iput p3, p0, Lo/ctq;->c:I

    .line 104
    invoke-direct {p0}, Lo/ctq;->c()V

    .line 105
    return-void

    nop

    :array_0
    .array-data 4
        0xb3c0
        0xb3c1
        0xb3c2
        0xb3c3
    .end array-data

    :array_1
    .array-data 4
        0xad14
        0xad11
        0xad10
        0xad12
        0xad13
    .end array-data

    :array_2
    .array-data 4
        0xb7fe
        0xb7ff
        0xb800
        0xb801
        0xb802
        0xb7fd
        0xb803
        0xb804
        0xb805
    .end array-data

    :array_3
    .array-data 4
        0xabe1
        0xabe2
        0xabe3
        0xabe5
        0xabe4
        0xabe6
        0xabe7
        0xabe8
        0xabe9
    .end array-data

    :array_4
    .array-data 4
        0xb79c
        0xb79b
        0xb79a
        0xb79d
    .end array-data
.end method

.method private a(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 478
    :goto_0
    iget v0, p0, Lo/ctq;->e:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 479
    iget-object v0, p0, Lo/ctq;->s:[I

    iget-object v1, p0, Lo/ctq;->q:[Ljava/lang/String;

    invoke-direct {p0, p1, v0, v1}, Lo/ctq;->c(I[I[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 480
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 481
    goto :goto_1

    .line 483
    :cond_0
    invoke-direct {p0, v2}, Lo/ctq;->k(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 484
    iget-object v0, p0, Lo/ctq;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/ctq;->s:[I

    invoke-static {v0, v2, v1, p1}, Lo/cui;->d(Landroid/content/Context;Ljava/util/List;[II)V

    .line 486
    :cond_1
    goto :goto_0

    .line 487
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ctq;->e:I

    .line 488
    return-void
.end method

.method private a(II)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 178
    if-gt p1, p2, :cond_0

    if-gtz p1, :cond_1

    .line 179
    :cond_0
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadHealthStatByTime the time is not right"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    return-void

    .line 182
    :cond_1
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadHealthStatByTime startTime is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " , endDay is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    invoke-direct {p0, p1, p2}, Lo/ctq;->c(II)Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;

    move-result-object v6

    .line 185
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 186
    return-void

    .line 188
    :cond_2
    iget-object v0, p0, Lo/ctq;->i:Lo/cqm;

    iget v1, p0, Lo/ctq;->c:I

    iget-object v2, p0, Lo/ctq;->a:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v2

    move v3, p2

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cqm;->e(IIIJ)Z

    .line 189
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->getHeartRateTotal()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/ctq;->a(Ljava/util/List;)V

    .line 190
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->getStressTotal()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/ctq;->e(Ljava/util/List;)V

    .line 191
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->getExerciseIntensityTotal()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/ctq;->c(Ljava/util/List;)V

    .line 192
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->getSleepTotal()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/ctq;->d(Ljava/util/List;)V

    .line 193
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->getHeartRateRiseTotal()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/ctq;->b(Ljava/util/List;)V

    .line 194
    return-void
.end method

.method private a(Landroid/util/SparseArray;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 152
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAllStatByTimeSync downloadDaysMap is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 154
    :cond_0
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAllStatByTimeSync() downloadDaysMap is null, stop pullStat"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    return-void

    .line 157
    :cond_1
    invoke-direct {p0, p1}, Lo/ctq;->e(Landroid/util/SparseArray;)V

    .line 158
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;>;)V"
        }
    .end annotation

    .line 215
    if-nez p1, :cond_0

    .line 216
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadHealthStatByTime heartRateStats is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    return-void

    .line 219
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;

    .line 220
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveHeartStatToDB cloudHeartRateStat is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    iget-object v0, p0, Lo/ctq;->h:Lo/cst;

    iget v1, p0, Lo/ctq;->c:I

    invoke-virtual {v0, v5, v1}, Lo/cst;->c(Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;I)Ljava/util/List;

    move-result-object v6

    .line 222
    if-eqz v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 223
    :cond_1
    return-void

    .line 225
    :cond_2
    iget-object v0, p0, Lo/ctq;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/crf;->b(Ljava/util/List;)I

    .line 226
    goto :goto_0

    .line 227
    :cond_3
    return-void
.end method

.method private b(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 464
    :goto_0
    iget v0, p0, Lo/ctq;->e:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 465
    iget-object v0, p0, Lo/ctq;->t:[I

    iget-object v1, p0, Lo/ctq;->u:[Ljava/lang/String;

    invoke-direct {p0, p1, v0, v1}, Lo/ctq;->c(I[I[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 466
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 467
    goto :goto_1

    .line 469
    :cond_0
    invoke-direct {p0, v2}, Lo/ctq;->i(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 470
    iget-object v0, p0, Lo/ctq;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/ctq;->t:[I

    invoke-static {v0, v2, v1, p1}, Lo/cui;->d(Landroid/content/Context;Ljava/util/List;[II)V

    .line 472
    :cond_1
    goto :goto_0

    .line 473
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ctq;->e:I

    .line 474
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;>;)V"
        }
    .end annotation

    .line 275
    if-nez p1, :cond_0

    .line 276
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveHeartRateRiseStat heartRateRiseAlarmTotals is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    return-void

    .line 279
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;

    .line 280
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveHeartRateRiseStat heartRateRiseAlarmTotal is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    iget-object v0, p0, Lo/ctq;->o:Lo/csw;

    iget v1, p0, Lo/ctq;->c:I

    invoke-virtual {v0, v5, v1}, Lo/csw;->e(Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;I)Ljava/util/List;

    move-result-object v6

    .line 282
    if-eqz v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 283
    :cond_1
    return-void

    .line 285
    :cond_2
    iget-object v0, p0, Lo/ctq;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/crf;->b(Ljava/util/List;)I

    .line 286
    goto :goto_0

    .line 287
    :cond_3
    return-void
.end method

.method static synthetic b(Lo/ctq;Landroid/util/SparseArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 51
    invoke-direct {p0, p1}, Lo/ctq;->e(Landroid/util/SparseArray;)V

    return-void
.end method

.method private c(II)Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;
    .locals 6

    .line 197
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;-><init>()V

    .line 198
    invoke-virtual {v4, p1}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->setStartTime(I)V

    .line 199
    invoke-virtual {v4, p2}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->setEndTime(I)V

    .line 200
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->setDataSource(I)V

    .line 201
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 202
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 203
    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 204
    iget-boolean v0, p0, Lo/ctq;->p:Z

    if-nez v0, :cond_0

    .line 205
    const/16 v0, 0xb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 206
    const/16 v0, 0xc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 207
    const/16 v0, 0xd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 209
    :cond_0
    invoke-virtual {v4, v5}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->setTypes(Ljava/util/Set;)V

    .line 210
    const-string v0, "HiH_HiSyncHealthStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthStatRsp req is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    iget-object v0, p0, Lo/ctq;->b:Lo/czg;

    invoke-virtual {v0, v4}, Lo/czg;->e(Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;

    move-result-object v0

    return-object v0
.end method

.method private c(I[I[Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[I[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 518
    iget-object v0, p0, Lo/ctq;->d:Landroid/content/Context;

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    iget-boolean v4, p0, Lo/ctq;->p:Z

    if-eqz v4, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const/16 v4, 0x32

    invoke-static/range {v0 .. v5}, Lo/cui;->c(Landroid/content/Context;I[I[Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private c()V
    .locals 2

    .line 108
    invoke-static {}, Lo/cui;->d()Z

    move-result v0

    iput-boolean v0, p0, Lo/ctq;->p:Z

    .line 109
    iget-object v0, p0, Lo/ctq;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lo/ctq;->b:Lo/czg;

    .line 110
    iget-object v0, p0, Lo/ctq;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cqm;->e(Landroid/content/Context;)Lo/cqm;

    move-result-object v0

    iput-object v0, p0, Lo/ctq;->i:Lo/cqm;

    .line 111
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    iput v0, p0, Lo/ctq;->n:I

    .line 112
    new-instance v0, Lo/cst;

    iget-object v1, p0, Lo/ctq;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/cst;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ctq;->h:Lo/cst;

    .line 113
    iget-object v0, p0, Lo/ctq;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    iput-object v0, p0, Lo/ctq;->f:Lo/cpw;

    .line 114
    new-instance v0, Lo/ctf;

    iget-object v1, p0, Lo/ctq;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/ctf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ctq;->k:Lo/ctf;

    .line 115
    new-instance v0, Lo/csu;

    iget-object v1, p0, Lo/ctq;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/csu;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ctq;->g:Lo/csu;

    .line 116
    new-instance v0, Lo/csx;

    iget-object v1, p0, Lo/ctq;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/csx;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ctq;->l:Lo/csx;

    .line 117
    new-instance v0, Lo/csw;

    iget-object v1, p0, Lo/ctq;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/csw;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ctq;->o:Lo/csw;

    .line 118
    return-void
.end method

.method private c(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 450
    :goto_0
    iget v0, p0, Lo/ctq;->e:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 451
    iget-object v0, p0, Lo/ctq;->z:[I

    iget-object v1, p0, Lo/ctq;->y:[Ljava/lang/String;

    invoke-direct {p0, p1, v0, v1}, Lo/ctq;->c(I[I[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 452
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 453
    goto :goto_1

    .line 455
    :cond_0
    invoke-direct {p0, v2}, Lo/ctq;->h(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 456
    iget-object v0, p0, Lo/ctq;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/ctq;->z:[I

    invoke-static {v0, v2, v1, p1}, Lo/cui;->d(Landroid/content/Context;Ljava/util/List;[II)V

    .line 458
    :cond_1
    goto :goto_0

    .line 459
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ctq;->e:I

    .line 460
    return-void
.end method

.method private c(Landroid/util/SparseArray;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 161
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 162
    :cond_0
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAllStatByTime() downloadDaysMap is null, stop pullDataByVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    return-void

    .line 165
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lo/ctq$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lo/ctq$d;-><init>(Lo/ctq;Landroid/util/SparseArray;Lo/ctq$4;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 166
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;>;)V"
        }
    .end annotation

    .line 245
    if-nez p1, :cond_0

    .line 246
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveIntensityStat intensityTotals is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    return-void

    .line 249
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;

    .line 250
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveIntensityStat cloudIntensityTotal is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    iget-object v0, p0, Lo/ctq;->g:Lo/csu;

    iget v1, p0, Lo/ctq;->c:I

    invoke-virtual {v0, v5, v1}, Lo/csu;->e(Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;I)Ljava/util/List;

    move-result-object v6

    .line 252
    if-eqz v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 253
    :cond_1
    return-void

    .line 255
    :cond_2
    iget-object v0, p0, Lo/ctq;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/crf;->b(Ljava/util/List;)I

    .line 256
    goto :goto_0

    .line 257
    :cond_3
    return-void
.end method

.method private d(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 505
    :goto_0
    iget v0, p0, Lo/ctq;->e:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 506
    iget-object v0, p0, Lo/ctq;->w:[I

    iget-object v1, p0, Lo/ctq;->v:[Ljava/lang/String;

    invoke-direct {p0, p1, v0, v1}, Lo/ctq;->c(I[I[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 507
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 508
    goto :goto_1

    .line 510
    :cond_0
    invoke-direct {p0, v2}, Lo/ctq;->f(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 511
    iget-object v0, p0, Lo/ctq;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/ctq;->w:[I

    invoke-static {v0, v2, v1, p1}, Lo/cui;->d(Landroid/content/Context;Ljava/util/List;[II)V

    .line 513
    :cond_1
    goto :goto_0

    .line 514
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ctq;->e:I

    .line 515
    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;>;)V"
        }
    .end annotation

    .line 260
    if-nez p1, :cond_0

    .line 261
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSleepStat sleepTotals is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    return-void

    .line 264
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;

    .line 265
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSleepStat sleepStat is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    iget-object v0, p0, Lo/ctq;->l:Lo/csx;

    iget v1, p0, Lo/ctq;->c:I

    invoke-virtual {v0, v5, v1}, Lo/csx;->c(Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;I)Ljava/util/List;

    move-result-object v6

    .line 267
    if-eqz v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 268
    :cond_1
    return-void

    .line 270
    :cond_2
    iget-object v0, p0, Lo/ctq;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/crf;->b(Ljava/util/List;)I

    .line 271
    goto :goto_0

    .line 272
    :cond_3
    return-void
.end method

.method private e(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 491
    :goto_0
    iget v0, p0, Lo/ctq;->e:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 492
    iget-object v0, p0, Lo/ctq;->r:[I

    iget-object v1, p0, Lo/ctq;->x:[Ljava/lang/String;

    invoke-direct {p0, p1, v0, v1}, Lo/ctq;->c(I[I[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 493
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 494
    goto :goto_1

    .line 496
    :cond_0
    invoke-direct {p0, v2}, Lo/ctq;->g(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 497
    iget-object v0, p0, Lo/ctq;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/ctq;->r:[I

    invoke-static {v0, v2, v1, p1}, Lo/cui;->d(Landroid/content/Context;Ljava/util/List;[II)V

    .line 499
    :cond_1
    goto :goto_0

    .line 500
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ctq;->e:I

    .line 501
    return-void
.end method

.method private e(Landroid/util/SparseArray;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 169
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v1

    .line 170
    add-int/lit8 v2, v1, -0x1

    :goto_0
    if-ltz v2, :cond_0

    .line 171
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    .line 172
    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 173
    invoke-direct {p0, v3, v4}, Lo/ctq;->a(II)V

    .line 170
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 175
    :cond_0
    return-void
.end method

.method private e(Landroid/util/SparseArray;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/lang/Integer;>;Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 142
    if-eqz p2, :cond_0

    .line 143
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAllStat too much need to download ,start a thread! downloadDaysMap is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    invoke-direct {p0, p1}, Lo/ctq;->c(Landroid/util/SparseArray;)V

    goto :goto_0

    .line 146
    :cond_0
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAllStat do not need to start a thread! downloadDaysMap is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    invoke-direct {p0, p1}, Lo/ctq;->a(Landroid/util/SparseArray;)V

    .line 149
    :goto_0
    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/StressTotal;>;)V"
        }
    .end annotation

    .line 230
    if-nez p1, :cond_0

    .line 231
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadHealthStatByTime stressTotals is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    return-void

    .line 234
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;

    .line 235
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveStressStatToDB cloudStressTotal is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    iget-object v0, p0, Lo/ctq;->k:Lo/ctf;

    iget v1, p0, Lo/ctq;->c:I

    invoke-virtual {v0, v5, v1}, Lo/ctf;->a(Lcom/huawei/hwcloudmodel/model/unite/StressTotal;I)Ljava/util/List;

    move-result-object v6

    .line 237
    if-eqz v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 238
    :cond_1
    return-void

    .line 240
    :cond_2
    iget-object v0, p0, Lo/ctq;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/crf;->b(Ljava/util/List;)I

    .line 241
    goto :goto_0

    .line 242
    :cond_3
    return-void
.end method

.method private f(Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 418
    iget-boolean v0, p0, Lo/ctq;->p:Z

    if-nez v0, :cond_0

    .line 419
    iget v0, p0, Lo/ctq;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->m:I

    iget-object v1, p0, Lo/ctq;->a:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v1

    invoke-static {v0, v1}, Lo/cui;->a(II)V

    goto :goto_0

    .line 421
    :cond_0
    iget v0, p0, Lo/ctq;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->m:I

    const/4 v1, 0x3

    if-ge v1, v0, :cond_1

    .line 422
    iget v0, p0, Lo/ctq;->e:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/ctq;->e:I

    .line 423
    const/4 v0, 0x0

    return v0

    .line 426
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/ctq;->o:Lo/csw;

    invoke-virtual {v0, p1}, Lo/csw;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 427
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 428
    iget v0, p0, Lo/ctq;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->e:I

    .line 429
    const/4 v0, 0x0

    return v0

    .line 431
    :cond_2
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;-><init>()V

    .line 432
    invoke-virtual {v5, v4}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->setHeartRateRiseAlarmTotal(Ljava/util/List;)V

    .line 433
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->setTimeZone(Ljava/lang/String;)V

    .line 435
    :goto_1
    iget v0, p0, Lo/ctq;->e:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_4

    .line 436
    iget-object v0, p0, Lo/ctq;->b:Lo/czg;

    invoke-virtual {v0, v5}, Lo/czg;->a(Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;)Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatRsp;

    move-result-object v6

    .line 438
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 439
    iget v0, p0, Lo/ctq;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->e:I

    .line 440
    goto :goto_1

    .line 442
    :cond_3
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addHeartRateRiseStats success ! uploadCount is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctq;->m:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",stat is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    const/4 v0, 0x1

    return v0

    .line 445
    :cond_4
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addHeartRateRiseStats failed ! uploadCount is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctq;->m:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",stat is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 446
    const/4 v0, 0x0

    return v0
.end method

.method private g(Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 354
    iget-boolean v0, p0, Lo/ctq;->p:Z

    if-nez v0, :cond_0

    .line 355
    iget v0, p0, Lo/ctq;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->m:I

    iget-object v1, p0, Lo/ctq;->a:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v1

    invoke-static {v0, v1}, Lo/cui;->a(II)V

    goto :goto_0

    .line 357
    :cond_0
    iget v0, p0, Lo/ctq;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->m:I

    const/4 v1, 0x3

    if-ge v1, v0, :cond_1

    .line 358
    iget v0, p0, Lo/ctq;->e:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/ctq;->e:I

    .line 359
    const/4 v0, 0x0

    return v0

    .line 362
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/ctq;->g:Lo/csu;

    invoke-virtual {v0, p1}, Lo/csu;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 363
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 364
    iget v0, p0, Lo/ctq;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->e:I

    .line 365
    const/4 v0, 0x0

    return v0

    .line 367
    :cond_2
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;-><init>()V

    .line 368
    invoke-virtual {v5, v4}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->setExerciseIntensityTotal(Ljava/util/List;)V

    .line 369
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->setTimeZone(Ljava/lang/String;)V

    .line 371
    :goto_1
    iget v0, p0, Lo/ctq;->e:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_4

    .line 372
    iget-object v0, p0, Lo/ctq;->b:Lo/czg;

    invoke-virtual {v0, v5}, Lo/czg;->a(Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;)Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatRsp;

    move-result-object v6

    .line 374
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 375
    iget v0, p0, Lo/ctq;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->e:I

    .line 376
    goto :goto_1

    .line 378
    :cond_3
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addExerciseIntensityStats success ! uploadCount is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctq;->m:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",stat is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    const/4 v0, 0x1

    return v0

    .line 381
    :cond_4
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addExerciseIntensityStats failed ! uploadCount is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctq;->m:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",stat is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    const/4 v0, 0x0

    return v0
.end method

.method private h(Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 386
    iget-boolean v0, p0, Lo/ctq;->p:Z

    if-nez v0, :cond_0

    .line 387
    iget v0, p0, Lo/ctq;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->m:I

    iget-object v1, p0, Lo/ctq;->a:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v1

    invoke-static {v0, v1}, Lo/cui;->a(II)V

    goto :goto_0

    .line 389
    :cond_0
    iget v0, p0, Lo/ctq;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->m:I

    const/4 v1, 0x3

    if-ge v1, v0, :cond_1

    .line 390
    iget v0, p0, Lo/ctq;->e:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/ctq;->e:I

    .line 391
    const/4 v0, 0x0

    return v0

    .line 394
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/ctq;->l:Lo/csx;

    invoke-virtual {v0, p1}, Lo/csx;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 395
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 396
    iget v0, p0, Lo/ctq;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->e:I

    .line 397
    const/4 v0, 0x0

    return v0

    .line 399
    :cond_2
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;-><init>()V

    .line 400
    invoke-virtual {v5, v4}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->setSleepTotal(Ljava/util/List;)V

    .line 401
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->setTimeZone(Ljava/lang/String;)V

    .line 403
    :goto_1
    iget v0, p0, Lo/ctq;->e:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_4

    .line 404
    iget-object v0, p0, Lo/ctq;->b:Lo/czg;

    invoke-virtual {v0, v5}, Lo/czg;->a(Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;)Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatRsp;

    move-result-object v6

    .line 406
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 407
    iget v0, p0, Lo/ctq;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->e:I

    .line 408
    goto :goto_1

    .line 410
    :cond_3
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSleepStats success ! uploadCount is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctq;->m:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",stat is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    const/4 v0, 0x1

    return v0

    .line 413
    :cond_4
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSleepStats failed ! uploadCount is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctq;->m:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",stat is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    const/4 v0, 0x0

    return v0
.end method

.method private i(Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 290
    iget-boolean v0, p0, Lo/ctq;->p:Z

    if-nez v0, :cond_0

    .line 291
    iget v0, p0, Lo/ctq;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->m:I

    iget-object v1, p0, Lo/ctq;->a:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v1

    invoke-static {v0, v1}, Lo/cui;->a(II)V

    goto :goto_0

    .line 293
    :cond_0
    iget v0, p0, Lo/ctq;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->m:I

    const/4 v1, 0x3

    if-ge v1, v0, :cond_1

    .line 294
    iget v0, p0, Lo/ctq;->e:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/ctq;->e:I

    .line 295
    const/4 v0, 0x0

    return v0

    .line 298
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/ctq;->h:Lo/cst;

    invoke-virtual {v0, p1}, Lo/cst;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 299
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 300
    iget v0, p0, Lo/ctq;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->e:I

    .line 301
    const/4 v0, 0x0

    return v0

    .line 303
    :cond_2
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;-><init>()V

    .line 304
    invoke-virtual {v5, v4}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->setHeartRateTotal(Ljava/util/List;)V

    .line 305
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->setTimeZone(Ljava/lang/String;)V

    .line 307
    :goto_1
    iget v0, p0, Lo/ctq;->e:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_4

    .line 308
    iget-object v0, p0, Lo/ctq;->b:Lo/czg;

    invoke-virtual {v0, v5}, Lo/czg;->a(Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;)Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatRsp;

    move-result-object v6

    .line 310
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 311
    iget v0, p0, Lo/ctq;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->e:I

    .line 312
    goto :goto_1

    .line 314
    :cond_3
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addHeartRateStat success ! uploadCount is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctq;->m:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",stat is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    const/4 v0, 0x1

    return v0

    .line 317
    :cond_4
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addHeartRateStat failed ! uploadCount is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctq;->m:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",stat is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    const/4 v0, 0x0

    return v0
.end method

.method private k(Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 322
    iget-boolean v0, p0, Lo/ctq;->p:Z

    if-nez v0, :cond_0

    .line 323
    iget v0, p0, Lo/ctq;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->m:I

    iget-object v1, p0, Lo/ctq;->a:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v1

    invoke-static {v0, v1}, Lo/cui;->a(II)V

    goto :goto_0

    .line 325
    :cond_0
    iget v0, p0, Lo/ctq;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->m:I

    const/4 v1, 0x3

    if-ge v1, v0, :cond_1

    .line 326
    iget v0, p0, Lo/ctq;->e:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/ctq;->e:I

    .line 327
    const/4 v0, 0x0

    return v0

    .line 330
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/ctq;->k:Lo/ctf;

    invoke-virtual {v0, p1}, Lo/ctf;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 331
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 332
    iget v0, p0, Lo/ctq;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->e:I

    .line 333
    const/4 v0, 0x0

    return v0

    .line 335
    :cond_2
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;-><init>()V

    .line 336
    invoke-virtual {v5, v4}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->setStressTotal(Ljava/util/List;)V

    .line 337
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->setTimeZone(Ljava/lang/String;)V

    .line 339
    :goto_1
    iget v0, p0, Lo/ctq;->e:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_4

    .line 340
    iget-object v0, p0, Lo/ctq;->b:Lo/czg;

    invoke-virtual {v0, v5}, Lo/czg;->a(Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;)Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatRsp;

    move-result-object v6

    .line 342
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 343
    iget v0, p0, Lo/ctq;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctq;->e:I

    .line 344
    goto :goto_1

    .line 346
    :cond_3
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addStressStats success ! uploadCount is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctq;->m:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",stat is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    const/4 v0, 0x1

    return v0

    .line 349
    :cond_4
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addStressStats failed ! uploadCount is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctq;->m:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",stat is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 524
    const-string v0, "HiH_HiSyncHealthStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() begin!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 525
    invoke-static {}, Lo/csk;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 526
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() dataPrivacy switch is closed ,can not pushData right now ,push end!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 527
    return-void

    .line 529
    :cond_0
    iget-object v0, p0, Lo/ctq;->f:Lo/cpw;

    iget v1, p0, Lo/ctq;->c:I

    invoke-virtual {v0, v1}, Lo/cpw;->b(I)I

    move-result v4

    .line 530
    if-gtz v4, :cond_1

    .line 531
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() no statClient get, maybe no data need to push ,push end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 533
    :cond_1
    invoke-direct {p0, v4}, Lo/ctq;->b(I)V

    .line 534
    iget-boolean v0, p0, Lo/ctq;->p:Z

    if-nez v0, :cond_2

    .line 535
    invoke-direct {p0, v4}, Lo/ctq;->a(I)V

    .line 536
    invoke-direct {p0, v4}, Lo/ctq;->e(I)V

    .line 537
    invoke-direct {p0, v4}, Lo/ctq;->d(I)V

    .line 539
    :cond_2
    invoke-direct {p0, v4}, Lo/ctq;->c(I)V

    .line 541
    :goto_0
    const-string v0, "HiH_HiSyncHealthStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 542
    return-void
.end method

.method public d()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 122
    const-string v0, "HiH_HiSyncHealthStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget v0, p0, Lo/ctq;->n:I

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide v4

    .line 126
    invoke-static {}, Lo/cui;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() first sync pull all stat!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    const/4 v7, 0x1

    .line 130
    const-wide v0, 0x1434998fe80L

    const/16 v2, 0x5a

    invoke-static {v0, v1, v4, v5, v2}, Lo/cui;->e(JJI)Landroid/util/SparseArray;

    move-result-object v6

    goto :goto_0

    .line 133
    :cond_0
    const-string v0, "Debug_HiSyncHealthStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() only pullDataByVersion recent days stat"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    const/4 v7, 0x0

    .line 135
    const-wide/32 v0, 0x337f9800

    sub-long v0, v4, v0

    const/16 v2, 0x5a

    invoke-static {v0, v1, v4, v5, v2}, Lo/cui;->e(JJI)Landroid/util/SparseArray;

    move-result-object v6

    .line 137
    :goto_0
    invoke-direct {p0, v6, v7}, Lo/ctq;->e(Landroid/util/SparseArray;Z)V

    .line 138
    const-string v0, "HiH_HiSyncHealthStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() end!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 575
    new-instance v1, Ljava/lang/StringBuffer;

    const-string v0, "--HiSyncHealthStat{"

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 576
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 577
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
