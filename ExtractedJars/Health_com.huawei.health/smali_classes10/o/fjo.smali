.class public Lo/fjo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fjo$b;
    }
.end annotation


# instance fields
.field private a:Lo/exu;

.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;"
        }
    .end annotation
.end field

.field private c:Lcom/google/android/gms/common/api/GoogleApiClient;

.field d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;"
        }
    .end annotation
.end field

.field private e:Landroid/content/Context;

.field private i:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fjo;->d:Ljava/util/List;

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fjo;->b:Ljava/util/List;

    .line 81
    new-instance v0, Lo/fjo$3;

    invoke-direct {v0, p0}, Lo/fjo$3;-><init>(Lo/fjo;)V

    iput-object v0, p0, Lo/fjo;->i:Landroid/os/Handler;

    .line 52
    iput-object p1, p0, Lo/fjo;->e:Landroid/content/Context;

    .line 53
    iget-object v0, p0, Lo/fjo;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/exu;->e(Landroid/content/Context;)Lo/exu;

    move-result-object v0

    iput-object v0, p0, Lo/fjo;->a:Lo/exu;

    .line 54
    new-instance v3, Lo/fjo$4;

    invoke-direct {v3, p0}, Lo/fjo$4;-><init>(Lo/fjo;)V

    .line 71
    new-instance v0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    iget-object v1, p0, Lo/fjo;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v1, Lcom/google/android/gms/fitness/Fitness;->HISTORY_API:Lcom/google/android/gms/common/api/Api;

    .line 72
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/api/Scope;

    const-string v2, "https://www.googleapis.com/auth/fitness.activity.write"

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    .line 73
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addScope(Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/api/Scope;

    const-string v2, "https://www.googleapis.com/auth/fitness.body.write"

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    .line 74
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addScope(Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/api/Scope;

    const-string v2, "https://www.googleapis.com/auth/fitness.location.write"

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    .line 75
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addScope(Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/api/Scope;

    const-string v2, "https://www.googleapis.com/auth/datastoremobile"

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    .line 76
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addScope(Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 77
    invoke-virtual {v0, v3}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 78
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iput-object v0, p0, Lo/fjo;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 79
    return-void
.end method

.method private a()V
    .locals 4

    .line 146
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===mGoogleApiClient = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fjo;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===mGoogleApiClient.isConnecting = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fjo;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v3}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnecting()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123==mGoogleApiClient.isConnected() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fjo;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v3}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    iget-object v0, p0, Lo/fjo;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/fjo;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 150
    iget-object v0, p0, Lo/fjo;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    .line 152
    :cond_0
    iget-object v0, p0, Lo/fjo;->i:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 153
    return-void
.end method

.method private a(ILcom/google/android/gms/fitness/data/DataSet;JJ)V
    .locals 7

    .line 194
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 196
    :sswitch_0
    move-object v0, p0

    move-object v1, p2

    const-string v2, "walking"

    move-wide v3, p3

    move-wide v5, p5

    invoke-direct/range {v0 .. v6}, Lo/fjo;->d(Lcom/google/android/gms/fitness/data/DataSet;Ljava/lang/String;JJ)V

    .line 197
    goto :goto_0

    .line 199
    :sswitch_1
    move-object v0, p0

    move-object v1, p2

    const-string v2, "running"

    move-wide v3, p3

    move-wide v5, p5

    invoke-direct/range {v0 .. v6}, Lo/fjo;->d(Lcom/google/android/gms/fitness/data/DataSet;Ljava/lang/String;JJ)V

    .line 200
    goto :goto_0

    .line 202
    :sswitch_2
    move-object v0, p0

    move-object v1, p2

    const-string v2, "stair_climbing"

    move-wide v3, p3

    move-wide v5, p5

    invoke-direct/range {v0 .. v6}, Lo/fjo;->d(Lcom/google/android/gms/fitness/data/DataSet;Ljava/lang/String;JJ)V

    .line 203
    goto :goto_0

    .line 205
    :sswitch_3
    move-object v0, p0

    move-object v1, p2

    const-string v2, "biking"

    move-wide v3, p3

    move-wide v5, p5

    invoke-direct/range {v0 .. v6}, Lo/fjo;->d(Lcom/google/android/gms/fitness/data/DataSet;Ljava/lang/String;JJ)V

    .line 206
    goto :goto_0

    .line 209
    :sswitch_4
    move-object v0, p0

    move-object v1, p2

    const-string v2, "sleep.awake"

    move-wide v3, p3

    move-wide v5, p5

    invoke-direct/range {v0 .. v6}, Lo/fjo;->d(Lcom/google/android/gms/fitness/data/DataSet;Ljava/lang/String;JJ)V

    .line 210
    goto :goto_0

    .line 215
    :sswitch_5
    move-object v0, p0

    move-object v1, p2

    const-string v2, "sleep.light"

    move-wide v3, p3

    move-wide v5, p5

    invoke-direct/range {v0 .. v6}, Lo/fjo;->d(Lcom/google/android/gms/fitness/data/DataSet;Ljava/lang/String;JJ)V

    .line 216
    goto :goto_0

    .line 219
    :sswitch_6
    move-object v0, p0

    move-object v1, p2

    const-string v2, "sleep.deep"

    move-wide v3, p3

    move-wide v5, p5

    invoke-direct/range {v0 .. v6}, Lo/fjo;->d(Lcom/google/android/gms/fitness/data/DataSet;Ljava/lang/String;JJ)V

    .line 220
    .line 224
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x4e22 -> :sswitch_0
        0x4e23 -> :sswitch_1
        0x4e24 -> :sswitch_2
        0x4e25 -> :sswitch_3
        0x55f1 -> :sswitch_6
        0x55f2 -> :sswitch_5
        0x55f3 -> :sswitch_4
        0x5655 -> :sswitch_5
        0x5656 -> :sswitch_5
        0x5657 -> :sswitch_6
        0x5658 -> :sswitch_4
        0x5659 -> :sswitch_5
    .end sparse-switch
.end method

.method static synthetic a(Lo/fjo;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lo/fjo;->a()V

    return-void
.end method

.method static synthetic b(Lo/fjo;)Landroid/os/Handler;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/fjo;->i:Landroid/os/Handler;

    return-object v0
.end method

.method private b()V
    .locals 12

    .line 168
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 169
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v8

    .line 170
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    new-instance v0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;-><init>()V

    move-wide v1, v8

    move-wide v3, v6

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 172
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->setTimeInterval(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;

    move-result-object v0

    .line 173
    invoke-virtual {v0}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->deleteAllData()Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;

    move-result-object v0

    .line 174
    invoke-virtual {v0}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->build()Lcom/google/android/gms/fitness/request/DataDeleteRequest;

    move-result-object v10

    .line 175
    sget-object v0, Lcom/google/android/gms/fitness/Fitness;->HistoryApi:Lcom/google/android/gms/fitness/HistoryApi;

    iget-object v1, p0, Lo/fjo;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, v1, v10}, Lcom/google/android/gms/fitness/HistoryApi;->deleteData(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/DataDeleteRequest;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/common/api/PendingResult;->await(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/Result;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/google/android/gms/common/api/Status;

    .line 176
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===deleteStepDataOnGoogleFit status "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    return-void
.end method

.method static synthetic c(Lo/fjo;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lo/fjo;->i()V

    return-void
.end method

.method private d(Lcom/google/android/gms/fitness/data/DataSet;Ljava/lang/String;JJ)V
    .locals 7

    .line 180
    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataSet;->createDataPoint()Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object v0

    move-wide v1, p3

    move-wide v3, p5

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 181
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/fitness/data/DataPoint;->setTimeInterval(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object v6

    .line 182
    sget-object v0, Lcom/google/android/gms/fitness/data/Field;->FIELD_ACTIVITY:Lcom/google/android/gms/fitness/data/Field;

    invoke-virtual {v6, v0}, Lcom/google/android/gms/fitness/data/DataPoint;->getValue(Lcom/google/android/gms/fitness/data/Field;)Lcom/google/android/gms/fitness/data/Value;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/fitness/data/Value;->setActivity(Ljava/lang/String;)V

    .line 183
    invoke-virtual {p1, v6}, Lcom/google/android/gms/fitness/data/DataSet;->add(Lcom/google/android/gms/fitness/data/DataPoint;)V

    .line 184
    return-void
.end method

.method static synthetic d(Lo/fjo;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lo/fjo;->b()V

    return-void
.end method

.method static synthetic e(Lo/fjo;)Lcom/google/android/gms/common/api/GoogleApiClient;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/fjo;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    return-object v0
.end method

.method private e()V
    .locals 4

    .line 113
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===enter requestGoogleFitPonitDatas"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    iget-object v0, p0, Lo/fjo;->a:Lo/exu;

    new-instance v1, Lo/fjo$5;

    invoke-direct {v1, p0}, Lo/fjo$5;-><init>(Lo/fjo;)V

    invoke-virtual {v0, v1}, Lo/exu;->a(Lo/egg;)V

    .line 124
    return-void
.end method

.method private f()V
    .locals 18

    .line 287
    new-instance v0, Lcom/google/android/gms/fitness/data/DataSource$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/DataSource$Builder;-><init>()V

    const-string v1, "com.huawei.health"

    .line 288
    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setAppPackageName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/fitness/data/DataType;->TYPE_STEP_COUNT_DELTA:Lcom/google/android/gms/fitness/data/DataType;

    .line 289
    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setDataType(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    const-string v1, "Huawei + steps dataset"

    .line 290
    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    .line 291
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setType(I)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    .line 292
    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->build()Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v6

    .line 294
    new-instance v0, Lcom/google/android/gms/fitness/data/DataSource$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/DataSource$Builder;-><init>()V

    const-string v1, "com.huawei.health"

    .line 295
    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setAppPackageName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/fitness/data/DataType;->TYPE_DISTANCE_DELTA:Lcom/google/android/gms/fitness/data/DataType;

    .line 296
    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setDataType(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    const-string v1, "Huawei + ditance dataset"

    .line 297
    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    .line 298
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setType(I)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    .line 299
    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->build()Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v7

    .line 300
    new-instance v0, Lcom/google/android/gms/fitness/data/DataSource$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/DataSource$Builder;-><init>()V

    const-string v1, "com.huawei.health"

    .line 301
    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setAppPackageName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/fitness/data/DataType;->TYPE_CALORIES_CONSUMED:Lcom/google/android/gms/fitness/data/DataType;

    .line 302
    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setDataType(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    const-string v1, "Huawei + calories dataset"

    .line 303
    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    .line 304
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setType(I)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    .line 305
    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->build()Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v8

    .line 307
    invoke-static {v6}, Lcom/google/android/gms/fitness/data/DataSet;->create(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataSet;

    move-result-object v9

    .line 308
    invoke-static {v7}, Lcom/google/android/gms/fitness/data/DataSet;->create(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataSet;

    move-result-object v10

    .line 309
    invoke-static {v8}, Lcom/google/android/gms/fitness/data/DataSet;->create(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataSet;

    move-result-object v11

    .line 310
    const/4 v12, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fjo;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_2

    .line 311
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fjo;->d:Ljava/util/List;

    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fjo;->d:Ljava/util/List;

    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 312
    :cond_0
    const/4 v13, 0x0

    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fjo;->d:Ljava/util/List;

    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_1

    .line 313
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fjo;->d:Ljava/util/List;

    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v14

    .line 314
    packed-switch v14, :pswitch_data_0

    goto/16 :goto_2

    .line 316
    :pswitch_0
    invoke-virtual {v9}, Lcom/google/android/gms/fitness/data/DataSet;->createDataPoint()Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fjo;->d:Ljava/util/List;

    .line 317
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/fjo;->d:Ljava/util/List;

    invoke-interface {v3, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v3}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/fitness/data/DataPoint;->setTimeInterval(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object v15

    .line 318
    sget-object v0, Lcom/google/android/gms/fitness/data/Field;->FIELD_STEPS:Lcom/google/android/gms/fitness/data/Field;

    invoke-virtual {v15, v0}, Lcom/google/android/gms/fitness/data/DataPoint;->getValue(Lcom/google/android/gms/fitness/data/Field;)Lcom/google/android/gms/fitness/data/Value;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fjo;->d:Ljava/util/List;

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/Value;->setInt(I)V

    .line 319
    invoke-virtual {v9, v15}, Lcom/google/android/gms/fitness/data/DataSet;->add(Lcom/google/android/gms/fitness/data/DataPoint;)V

    .line 320
    goto/16 :goto_2

    .line 322
    :pswitch_1
    invoke-virtual {v10}, Lcom/google/android/gms/fitness/data/DataSet;->createDataPoint()Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fjo;->d:Ljava/util/List;

    .line 323
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/fjo;->d:Ljava/util/List;

    invoke-interface {v3, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v3}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/fitness/data/DataPoint;->setTimeInterval(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object v16

    .line 324
    sget-object v0, Lcom/google/android/gms/fitness/data/Field;->FIELD_DISTANCE:Lcom/google/android/gms/fitness/data/Field;

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/google/android/gms/fitness/data/DataPoint;->getValue(Lcom/google/android/gms/fitness/data/Field;)Lcom/google/android/gms/fitness/data/Value;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fjo;->d:Ljava/util/List;

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/Value;->setFloat(F)V

    .line 325
    move-object/from16 v0, v16

    invoke-virtual {v10, v0}, Lcom/google/android/gms/fitness/data/DataSet;->add(Lcom/google/android/gms/fitness/data/DataPoint;)V

    .line 326
    goto :goto_2

    .line 328
    :pswitch_2
    invoke-virtual {v11}, Lcom/google/android/gms/fitness/data/DataSet;->createDataPoint()Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fjo;->d:Ljava/util/List;

    .line 329
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/fjo;->d:Ljava/util/List;

    invoke-interface {v3, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v3}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/fitness/data/DataPoint;->setTimeInterval(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object v17

    .line 330
    sget-object v0, Lcom/google/android/gms/fitness/data/Field;->FIELD_CALORIES:Lcom/google/android/gms/fitness/data/Field;

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/google/android/gms/fitness/data/DataPoint;->getValue(Lcom/google/android/gms/fitness/data/Field;)Lcom/google/android/gms/fitness/data/Value;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fjo;->d:Ljava/util/List;

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/Value;->setFloat(F)V

    .line 331
    move-object/from16 v0, v17

    invoke-virtual {v11, v0}, Lcom/google/android/gms/fitness/data/DataSet;->add(Lcom/google/android/gms/fitness/data/DataPoint;)V

    .line 312
    .line 332
    :goto_2
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_1

    .line 310
    :cond_1
    :goto_3
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 338
    :cond_2
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stepsDataSet = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ditanceDataSet = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "caloriesDataSet = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    invoke-virtual {v9}, Lcom/google/android/gms/fitness/data/DataSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 343
    sget-object v0, Lcom/google/android/gms/fitness/Fitness;->HistoryApi:Lcom/google/android/gms/fitness/HistoryApi;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fjo;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, v1, v9}, Lcom/google/android/gms/fitness/HistoryApi;->insertData(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/DataSet;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/common/api/PendingResult;->await(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/Result;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/google/android/gms/common/api/Status;

    .line 344
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "statusStepsDataStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    :cond_3
    invoke-virtual {v10}, Lcom/google/android/gms/fitness/data/DataSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 347
    sget-object v0, Lcom/google/android/gms/fitness/Fitness;->HistoryApi:Lcom/google/android/gms/fitness/HistoryApi;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fjo;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, v1, v10}, Lcom/google/android/gms/fitness/HistoryApi;->insertData(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/DataSet;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/common/api/PendingResult;->await(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/Result;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/google/android/gms/common/api/Status;

    .line 348
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "statusDitanceDataStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    :cond_4
    invoke-virtual {v11}, Lcom/google/android/gms/fitness/data/DataSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 351
    sget-object v0, Lcom/google/android/gms/fitness/Fitness;->HistoryApi:Lcom/google/android/gms/fitness/HistoryApi;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fjo;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, v1, v11}, Lcom/google/android/gms/fitness/HistoryApi;->insertData(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/DataSet;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/common/api/PendingResult;->await(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/Result;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/google/android/gms/common/api/Status;

    .line 352
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "statusCaloriesDataStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    :cond_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private declared-synchronized i()V
    .locals 12

    monitor-enter p0

    .line 231
    :try_start_0
    iget-object v0, p0, Lo/fjo;->b:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/fjo;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 232
    :cond_0
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===healthSegemtDatalist =null or healthSegemtDatalist.size()= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    monitor-exit p0

    return-void

    .line 236
    :cond_1
    iget-object v0, p0, Lo/fjo;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 238
    new-instance v0, Lcom/google/android/gms/fitness/data/DataSource$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/DataSource$Builder;-><init>()V

    const-string v1, "com.huawei.health"

    .line 239
    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setAppPackageName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/fitness/data/DataType;->TYPE_ACTIVITY_SEGMENT:Lcom/google/android/gms/fitness/data/DataType;

    .line 240
    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setDataType(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    const-string v1, "Huawei+ activity segments dataset"

    .line 241
    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    .line 242
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setType(I)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    .line 243
    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->build()Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v7

    .line 245
    invoke-static {v7}, Lcom/google/android/gms/fitness/data/DataSet;->create(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataSet;

    move-result-object v8

    .line 246
    const/4 v9, 0x0

    :goto_0
    iget-object v0, p0, Lo/fjo;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_4

    .line 247
    iget-object v0, p0, Lo/fjo;->b:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/fjo;->b:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    .line 248
    :cond_2
    const/4 v10, 0x0

    :goto_1
    iget-object v0, p0, Lo/fjo;->b:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_3

    .line 249
    iget-object v0, p0, Lo/fjo;->b:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v11

    .line 250
    move-object v0, p0

    move v1, v11

    move-object v2, v8

    iget-object v3, p0, Lo/fjo;->b:Ljava/util/List;

    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v3}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v3

    iget-object v5, p0, Lo/fjo;->b:Ljava/util/List;

    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v5

    invoke-direct/range {v0 .. v6}, Lo/fjo;->a(ILcom/google/android/gms/fitness/data/DataSet;JJ)V

    .line 248
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 246
    :cond_3
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 254
    :cond_4
    invoke-virtual {v8}, Lcom/google/android/gms/fitness/data/DataSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 255
    monitor-exit p0

    return-void

    .line 258
    :cond_5
    sget-object v0, Lcom/google/android/gms/fitness/Fitness;->HistoryApi:Lcom/google/android/gms/fitness/HistoryApi;

    iget-object v1, p0, Lo/fjo;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, v1, v8}, Lcom/google/android/gms/fitness/HistoryApi;->insertData(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/DataSet;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/common/api/PendingResult;->await(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/Result;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/google/android/gms/common/api/Status;

    .line 259
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "activitySegmentDataSetStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    goto :goto_3

    .line 261
    :cond_6
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===mGoogleApiClient=null = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fjo;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 264
    :goto_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v7

    monitor-exit p0

    throw v7
.end method

.method static synthetic i(Lo/fjo;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lo/fjo;->k()V

    return-void
.end method

.method private declared-synchronized k()V
    .locals 5

    monitor-enter p0

    .line 270
    :try_start_0
    iget-object v0, p0, Lo/fjo;->d:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 271
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===healthDetailPonitDatalist =null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    monitor-exit p0

    return-void

    .line 275
    :cond_0
    iget-object v0, p0, Lo/fjo;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 276
    monitor-exit p0

    return-void

    .line 279
    :cond_1
    iget-object v0, p0, Lo/fjo;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 280
    invoke-direct {p0}, Lo/fjo;->f()V

    goto :goto_0

    .line 282
    :cond_2
    const-string v0, "GoogleFitDataManage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mGoogleApiClient=null = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fjo;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 284
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method


# virtual methods
.method public c()V
    .locals 0

    .line 105
    invoke-direct {p0}, Lo/fjo;->e()V

    .line 106
    invoke-virtual {p0}, Lo/fjo;->d()V

    .line 107
    return-void
.end method

.method public d()V
    .locals 2

    .line 130
    iget-object v0, p0, Lo/fjo;->a:Lo/exu;

    new-instance v1, Lo/fjo$1;

    invoke-direct {v1, p0}, Lo/fjo$1;-><init>(Lo/fjo;)V

    invoke-virtual {v0, v1}, Lo/exu;->d(Lo/egg;)V

    .line 140
    return-void
.end method
