.class public Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$SingletonHolder;
    }
.end annotation


# static fields
.field private static final ACCOUNT_NULL:I = -0x2

.field private static final ALL_SQL_TYPE:I = 0x4

.field private static final CALORIE:Ljava/lang/String; = "calorie"

.field private static final DATE:Ljava/lang/String; = "date"

.field private static final DAY_SQL_TYPE:I = 0x0

.field private static final DURING:Ljava/lang/String; = "during"

.field private static final FITNESS_RECORD_TYPE:I = 0x1

.field private static final HAS_MORE_DATA:I = 0x3e8

.field private static final INTERFACE_NOT_AVAILABLE:I = -0x3

.field private static final MONTH_SQL_TYPE:I = 0x2

.field private static final NO_MORE_DATA:I = 0x3e9

.field private static final ONE_SECOND_IN_MILLISECOND:J = 0x3e8L

.field private static final PARAMETER_INVALID:I = -0x1

.field private static final RECEIVE_DATA:I = 0x3ea

.field private static final SUCCESS_CODE:I = 0x0

.field private static final TAG:Ljava/lang/String; = "Suggestion_FitnessHistoryModel"

.field private static final TIMES:Ljava/lang/String; = "times"

.field private static final WEAR_DEVICE_TYPE:I = 0x2

.field private static final WEEK_SQL_TYPE:I = 0x1

.field private static final YEAR_SQL_TYPE:I = 0x3


# instance fields
.field private accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

.field private cloudData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation
.end field

.field private downloadingWorkoutRecords:Z

.field private localData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation
.end field

.field private mCloudDataNumber:Lorg/json/JSONArray;

.field private mDeletingRecord:J

.field private mHandler:Landroid/os/Handler;

.field private mHandlerThread:Landroid/os/HandlerThread;

.field private mIsNeedAdd:Z

.field private mResultCallback:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

.field private userInfo:Lcom/huawei/health/suggestion/model/Userinfo;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->downloadingWorkoutRecords:Z

    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mIsNeedAdd:Z

    .line 70
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mDeletingRecord:J

    .line 71
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "fitnessRecordSync"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mHandlerThread:Landroid/os/HandlerThread;

    .line 85
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    .line 86
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->g()Lcom/huawei/health/suggestion/model/Userinfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->userInfo:Lcom/huawei/health/suggestion/model/Userinfo;

    .line 88
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->cloudData:Ljava/util/List;

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->localData:Ljava/util/List;

    .line 102
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    .line 103
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 105
    :cond_0
    new-instance v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;-><init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mHandler:Landroid/os/Handler;

    .line 168
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;-><init>()V

    return-void
.end method

.method static synthetic access$1002(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Z)Z
    .locals 0

    .line 49
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->downloadingWorkoutRecords:Z

    return p1
.end method

.method static synthetic access$1100(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Lcom/huawei/health/suggestion/model/AccountInfo;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    return-object v0
.end method

.method static synthetic access$1200(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->filterMonthData(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$1300(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->onDownloadFail()V

    return-void
.end method

.method static synthetic access$1402(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Z)Z
    .locals 0

    .line 49
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mIsNeedAdd:Z

    return p1
.end method

.method static synthetic access$200(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Ljava/util/List;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->localData:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$202(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->localData:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$300(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;J)Ljava/util/List;
    .locals 1

    .line 49
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getWorkoutRecordsSyncByMonth(J)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Ljava/util/List;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->cloudData:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->compareData(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Landroid/os/Handler;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Lorg/json/JSONArray;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mCloudDataNumber:Lorg/json/JSONArray;

    return-object v0
.end method

.method static synthetic access$702(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Lorg/json/JSONArray;)Lorg/json/JSONArray;
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mCloudDataNumber:Lorg/json/JSONArray;

    return-object p1
.end method

.method static synthetic access$800(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Lorg/json/JSONObject;)Z
    .locals 1

    .line 49
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->compareFitnessRecordCount(Lorg/json/JSONObject;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$900(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Lcom/huawei/health/suggestion/model/fitness/IResultCallback;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mResultCallback:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    return-object v0
.end method

.method private checkParameters(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)Z
    .locals 4

    .line 498
    const/4 v0, 0x0

    if-ne v0, p5, :cond_0

    .line 499
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkParameters null == callback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 500
    const/4 v0, 0x0

    return v0

    .line 503
    :cond_0
    cmp-long v0, p1, p3

    if-gtz v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_2

    .line 504
    :cond_1
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkParameters startTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ". endTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 505
    const-string v0, "startTime > endTime"

    const/4 v1, -0x1

    invoke-interface {p5, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 506
    const/4 v0, 0x0

    return v0

    .line 509
    :cond_2
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    .line 510
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 511
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkParameters null == accountInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    const-string v0, "null == accountInfo"

    const/4 v1, -0x2

    invoke-interface {p5, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 513
    const/4 v0, 0x0

    return v0

    .line 516
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private compareData(Ljava/util/List;Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)V"
        }
    .end annotation

    .line 171
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "compareData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    if-nez p2, :cond_0

    .line 173
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cloud has no fitness history record"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    return-void

    .line 177
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    .line 179
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 180
    :cond_1
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "compareData() accountInfo or huid is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    return-void

    .line 184
    :cond_2
    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 185
    :cond_3
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "local has no fitness history record"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    invoke-virtual {p0, p2}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->addExercisedRecord(Ljava/util/List;)Z

    goto/16 :goto_4

    .line 188
    :cond_4
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " cloudData size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " and localData is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    const/4 v6, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_a

    .line 190
    invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 191
    if-nez v7, :cond_5

    .line 192
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "waring cloudData.get(i) == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    goto/16 :goto_3

    .line 196
    :cond_5
    const/4 v8, 0x0

    .line 198
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireId()I

    move-result v9

    .line 199
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "local has same history record webId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mIsNeedAdd:Z

    if-eqz v0, :cond_6

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    iget-wide v2, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mDeletingRecord:J

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-nez v0, :cond_6

    .line 201
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "compareData webId = 0 but need to delete this record"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    .line 203
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 202
    const/16 v4, 0x9

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/bsz;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Z

    .line 204
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mIsNeedAdd:Z

    .line 205
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mDeletingRecord:J

    .line 207
    const/4 v8, 0x1

    .line 210
    :cond_6
    const/4 v10, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_8

    .line 212
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 213
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    invoke-virtual {v11}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-nez v0, :cond_7

    .line 214
    const/4 v8, 0x1

    .line 215
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v11, v9}, Lo/btw;->d(Ljava/lang/String;Lcom/huawei/health/suggestion/model/WorkoutRecord;I)Z

    .line 216
    goto :goto_2

    .line 210
    :cond_7
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 220
    :cond_8
    :goto_2
    if-nez v8, :cond_9

    .line 221
    invoke-virtual {p0, v7}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->addExercisedRecord(Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z

    .line 189
    :cond_9
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 225
    :cond_a
    :goto_4
    return-void
.end method

.method private compareFitnessRecordCount(Lorg/json/JSONObject;)Z
    .locals 19

    .line 987
    const-string v6, "01000000"

    .line 988
    const-string v0, "months"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 989
    const-string v0, "count"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 991
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 992
    :cond_0
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 993
    const/4 v0, 0x1

    return v0

    .line 996
    :cond_1
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    .line 998
    new-instance v10, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmmss"

    invoke-direct {v10, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 999
    const/4 v11, 0x0

    .line 1001
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v11, v0

    .line 1004
    goto :goto_0

    .line 1002
    :catch_0
    move-exception v12

    .line 1003
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "compareFitnessRecordCount "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1006
    :goto_0
    if-nez v11, :cond_2

    .line 1007
    const/4 v0, 0x1

    return v0

    .line 1010
    :cond_2
    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    .line 1011
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "compareFitnessRecordCount time is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1013
    move-object/from16 v0, p0

    invoke-direct {v0, v12, v13}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getWorkoutRecordsSyncByMonth(J)Ljava/util/List;

    move-result-object v14

    .line 1014
    if-nez v14, :cond_3

    .line 1015
    const/4 v0, 0x0

    return v0

    .line 1018
    :cond_3
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWorkoutRecordsSyncByMonth(time) size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1019
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v9, :cond_4

    .line 1020
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "compareFitnessRecordCount cloud data number equals local data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 1021
    :cond_4
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    if-eq v0, v9, :cond_5

    .line 1022
    invoke-static {v12, v13}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentMonthZeroTimeStamp(J)J

    move-result-wide v15

    .line 1023
    invoke-static {v12, v13}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentMonthLastTimestamp(J)J

    move-result-wide v17

    .line 1024
    move-object/from16 v0, p0

    const-wide/16 v1, 0x3e8

    div-long v1, v15, v1

    const-wide/16 v3, 0x3e8

    div-long v3, v17, v3

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->postFitnessHistoryRequest(JJI)V

    .line 1025
    const/4 v0, 0x0

    return v0

    .line 1028
    :cond_5
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method private filterMonthData(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;>;)V"
        }
    .end annotation

    .line 444
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 445
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->acquireMonthDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    .line 446
    :goto_1
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->acquireMonthDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    const/4 v6, 0x1

    goto :goto_2

    :cond_1
    const/4 v6, 0x0

    .line 447
    :goto_2
    if-eqz v5, :cond_2

    if-eqz v6, :cond_2

    .line 448
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "filterMonthData MonthDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->acquireMonthDate()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 450
    :cond_2
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remove:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->acquireMonthDate()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    invoke-interface {p3, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 444
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 454
    :cond_3
    return-void
.end method

.method private getData(Lcom/huawei/hwbasemgr/IBaseResponseCallback;JJLjava/lang/String;Ljava/lang/String;I)V
    .locals 11

    .line 313
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;

    move-object v2, p0

    move-object/from16 v3, p6

    move-wide v4, p2

    move-wide v6, p4

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object v10, p1

    invoke-direct/range {v1 .. v10}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;-><init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Ljava/lang/String;JJLjava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 376
    return-void
.end method

.method private getFitnessHistoryByMonth()V
    .locals 5

    .line 946
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 947
    new-instance v4, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v4, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 948
    const-string v0, "iVersion"

    const-string v1, "2"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 949
    invoke-static {v3, v4}, Lo/bsa;->b(Lorg/json/JSONObject;Ljava/util/Map;)V

    .line 951
    invoke-static {}, Lo/bsc;->b()Lo/bsc;

    move-result-object v0

    invoke-static {}, Lo/bsl;->w()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$8;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$8;-><init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)V

    invoke-virtual {v0, v1, v3, v2}, Lo/bsc;->b(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsf;)V

    .line 972
    return-void
.end method

.method public static final getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;
    .locals 1

    .line 98
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$SingletonHolder;->access$100()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    return-object v0
.end method

.method private getWorkoutRecords(Ljava/lang/String;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
    .locals 4

    .line 721
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    if-nez v0, :cond_0

    .line 722
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutRecords accountInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 723
    return-void

    .line 725
    :cond_0
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$6;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$6;-><init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Ljava/lang/String;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 743
    return-void
.end method

.method private getWorkoutRecordsSyncByMonth(J)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation

    .line 746
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutRecordsSyncByMonth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 747
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    .line 748
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    if-nez v0, :cond_0

    .line 749
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutRecordsSyncByMonth accountInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 750
    const/4 v0, 0x0

    return-object v0

    .line 753
    :cond_0
    invoke-static {p1, p2}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentMonthZeroTimeStamp(J)J

    move-result-wide v4

    .line 754
    invoke-static {p1, p2}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentMonthLastTimestamp(J)J

    move-result-wide v6

    .line 756
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 757
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "workout_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " GLOB ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " between "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " order by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " desc"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 764
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 765
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "[A-Z][0-9][0-9][0-9]*"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    .line 768
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 765
    const/4 v2, 0x1

    invoke-virtual {v0, v2, v8, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 769
    if-eqz v10, :cond_2

    .line 770
    :goto_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 771
    invoke-static {v10}, Lo/btw;->c(Landroid/database/Cursor;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 773
    :cond_1
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 775
    :cond_2
    return-object v9
.end method

.method private onDownloadFail()V
    .locals 4

    .line 975
    move-object v2, p0

    monitor-enter v2

    .line 976
    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->downloadingWorkoutRecords:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 977
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 978
    :goto_0
    const/16 v2, -0x3e5

    .line 979
    const-string v3, "download fail"

    .line 980
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mResultCallback:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 981
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mResultCallback:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    invoke-interface {v0, v2, v3}, Lcom/huawei/health/suggestion/model/fitness/IResultCallback;->onResult(ILjava/lang/Object;)V

    .line 983
    :cond_0
    return-void
.end method


# virtual methods
.method public acquireDetailFitnessRecord(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 463
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireDetailFitnessRecord"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    invoke-direct/range {p0 .. p5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->checkParameters(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 465
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSummaryFitnessRecordByMonth checkParameters fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    return-void

    .line 469
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 470
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "workout_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " GLOB ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " between "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " order by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " desc"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 477
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$4;

    invoke-direct {v1, p0, v4, p5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$4;-><init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 495
    return-void
.end method

.method public acquireExerciseRecordByAll(Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
    .locals 5

    .line 234
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireExerciseRecordByAll"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    .line 236
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 237
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "workout_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " GLOB ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ?  order by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " desc"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 241
    invoke-direct {p0, v4, p1}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getWorkoutRecords(Ljava/lang/String;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V

    .line 242
    return-void
.end method

.method public acquireExerciseRecordByDay(JLcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
    .locals 9

    .line 630
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireExerciseRecordByDay"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    .line 633
    invoke-static {p1, p2}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v4

    .line 634
    invoke-static {p1, p2}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayLastTimeStamp(J)J

    move-result-wide v6

    .line 636
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 637
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "workout_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " GLOB ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " between "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " order by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " desc"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 644
    invoke-direct {p0, v8, p3}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getWorkoutRecords(Ljava/lang/String;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V

    .line 645
    return-void
.end method

.method public acquireExerciseRecordByMonth(JLcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
    .locals 9

    .line 678
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireExerciseRecordByMonth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 679
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    .line 681
    invoke-static {p1, p2}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentMonthZeroTimeStamp(J)J

    move-result-wide v4

    .line 682
    invoke-static {p1, p2}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentMonthLastTimestamp(J)J

    move-result-wide v6

    .line 684
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 685
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "workout_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " GLOB ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " between "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " order by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " desc"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 692
    invoke-direct {p0, v8, p3}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getWorkoutRecords(Ljava/lang/String;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V

    .line 693
    return-void
.end method

.method public acquireExerciseRecordByWeek(JLcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
    .locals 9

    .line 654
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireExerciseRecordByWeek"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 655
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    .line 657
    invoke-static {p1, p2}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentWeekZeroTimeStamp(J)J

    move-result-wide v4

    .line 658
    invoke-static {p1, p2}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentWeekLastTimeStamp(J)J

    move-result-wide v6

    .line 660
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 661
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "workout_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " GLOB ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " between "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " order by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " desc"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 668
    invoke-direct {p0, v8, p3}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getWorkoutRecords(Ljava/lang/String;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V

    .line 669
    return-void
.end method

.method public acquireExerciseRecordByYear(JLcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
    .locals 9

    .line 703
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireExerciseRecordByYear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 704
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    .line 706
    invoke-static {p1, p2}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentYearZeroTimeStamp(J)J

    move-result-wide v4

    .line 707
    invoke-static {p1, p2}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentYearLastTimeStamp(J)J

    move-result-wide v6

    .line 709
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 710
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "workout_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " GLOB ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " between "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " order by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " desc"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 717
    invoke-direct {p0, v8, p3}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getWorkoutRecords(Ljava/lang/String;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V

    .line 718
    return-void
.end method

.method public acquireRecentExerciseRecord(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 1082
    invoke-direct/range {p0 .. p5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->checkParameters(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1083
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireRecentExerciseRecord checkParameters fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1084
    return-void

    .line 1087
    :cond_0
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1088
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireRecentExerciseRecord isFitnessCourseDisplay"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1089
    const-string v0, "fitness mode do not display"

    const/4 v1, -0x3

    invoke-interface {p5, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1090
    return-void

    .line 1093
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "workout_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " GLOB ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " between "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " order by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " DESC  limit 1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1100
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$9;

    invoke-direct {v1, p0, p5, v4}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$9;-><init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 1124
    return-void
.end method

.method public acquireRecentExerciseRecord(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1128
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1129
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireRecentExerciseRecord null == callback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1130
    return-void

    .line 1133
    :cond_0
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1134
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireRecentExerciseRecord isFitnessCourseDisplay"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1135
    const-string v0, "fitness mode do not display"

    const/4 v1, -0x3

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1136
    return-void

    .line 1139
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select max(exerciseTime) as newestRecord from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1141
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "workout_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " GLOB ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1144
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$10;

    invoke-direct {v1, p0, p1, v4}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$10;-><init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 1184
    return-void
.end method

.method public acquireSummaryFitnessRecord(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10

    .line 560
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSummaryFitnessRecord"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 561
    invoke-direct/range {p0 .. p5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->checkParameters(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 562
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteFitnessRecord checkParameters fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 563
    return-void

    .line 566
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select sum(actualCalorie) as sumCalorie , sum(during) as sumDuring,  count(workoutId) as sumCount from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 569
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "workout_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " GLOB ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " between "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 574
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$5;

    move-object v2, p0

    move-object v3, v9

    move-wide v4, p1

    move-wide v6, p3

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$5;-><init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Ljava/lang/String;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 600
    return-void
.end method

.method public acquireSummaryFitnessRecordByAll(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10

    .line 303
    invoke-direct/range {p0 .. p5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->checkParameters(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 304
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSummaryFitnessRecordByMonth checkParameters fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    return-void

    .line 307
    :cond_0
    move-object v0, p0

    move-wide v2, p1

    move-wide v4, p3

    const/4 v1, 0x4

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getSql(IJJ)Ljava/lang/String;

    move-result-object v9

    .line 308
    move-object v0, p0

    move-object v1, p5

    move-wide v2, p1

    move-wide v4, p3

    const-string v6, "yyyy"

    move-object v7, v9

    const/4 v8, 0x4

    invoke-direct/range {v0 .. v8}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getData(Lcom/huawei/hwbasemgr/IBaseResponseCallback;JJLjava/lang/String;Ljava/lang/String;I)V

    .line 309
    return-void
.end method

.method public acquireSummaryFitnessRecordByDay(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10

    .line 253
    invoke-direct/range {p0 .. p5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->checkParameters(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 254
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSummaryFitnessRecordByMonth checkParameters fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    return-void

    .line 257
    :cond_0
    move-object v0, p0

    move-wide v2, p1

    move-wide v4, p3

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getSql(IJJ)Ljava/lang/String;

    move-result-object v9

    .line 258
    move-object v0, p0

    move-object v1, p5

    move-wide v2, p1

    move-wide v4, p3

    const-string v6, "yyyyMMdd"

    move-object v7, v9

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getData(Lcom/huawei/hwbasemgr/IBaseResponseCallback;JJLjava/lang/String;Ljava/lang/String;I)V

    .line 259
    return-void
.end method

.method public acquireSummaryFitnessRecordByMonth(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10

    .line 386
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSummaryFitnessRecordByMonth start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    invoke-direct/range {p0 .. p5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->checkParameters(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 388
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSummaryFitnessRecordByMonth checkParameters fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    return-void

    .line 392
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select substr(exerciseDate, 1, 6) as monthDate,sum(round(actualCalorie/1000)) as monthCalorie ,sum(during) as monthDuring, count(workoutId) as monthTimes  from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 395
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "workout_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " GLOB ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " between "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " group by substr("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseDate"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", 1, 6) order by monthDate desc"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 402
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSummaryFitnessRecordByMonth sql = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$3;

    move-object v2, p0

    move-wide v3, p1

    move-wide v5, p3

    move-object v7, v9

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$3;-><init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;JJLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 441
    return-void
.end method

.method public acquireSummaryFitnessRecordByWeek(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10

    .line 269
    invoke-direct/range {p0 .. p5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->checkParameters(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 270
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSummaryFitnessRecordByMonth checkParameters fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    return-void

    .line 273
    :cond_0
    move-object v0, p0

    move-wide v2, p1

    move-wide v4, p3

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getSql(IJJ)Ljava/lang/String;

    move-result-object v9

    .line 275
    move-object v0, p0

    move-object v1, p5

    move-wide v2, p1

    move-wide v4, p3

    const-string v6, "yyyyMMdd"

    move-object v7, v9

    const/4 v8, 0x1

    invoke-direct/range {v0 .. v8}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getData(Lcom/huawei/hwbasemgr/IBaseResponseCallback;JJLjava/lang/String;Ljava/lang/String;I)V

    .line 276
    return-void
.end method

.method public acquireSummaryFitnessRecordByYear(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10

    .line 287
    invoke-direct/range {p0 .. p5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->checkParameters(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 288
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSummaryFitnessRecordByMonth checkParameters fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    return-void

    .line 291
    :cond_0
    move-object v0, p0

    move-wide v2, p1

    move-wide v4, p3

    const/4 v1, 0x3

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getSql(IJJ)Ljava/lang/String;

    move-result-object v9

    .line 292
    move-object v0, p0

    move-object v1, p5

    move-wide v2, p1

    move-wide v4, p3

    const-string v6, "yyyy"

    move-object v7, v9

    const/4 v8, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getData(Lcom/huawei/hwbasemgr/IBaseResponseCallback;JJLjava/lang/String;Ljava/lang/String;I)V

    .line 293
    return-void
.end method

.method public acquireUserGender()I
    .locals 1

    .line 1190
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->userInfo:Lcom/huawei/health/suggestion/model/Userinfo;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Userinfo;->getGender()I

    move-result v0

    return v0
.end method

.method public acquireUserName()Ljava/lang/String;
    .locals 1

    .line 1197
    const-string v0, ""

    return-object v0
.end method

.method public acquireUserWeight()F
    .locals 1

    .line 1204
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->userInfo:Lcom/huawei/health/suggestion/model/Userinfo;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Userinfo;->acquireWeight()F

    move-result v0

    return v0
.end method

.method public acquireWorkoutRecordByRecordId(I)Lcom/huawei/health/suggestion/model/WorkoutRecord;
    .locals 7

    .line 603
    const/4 v4, 0x0

    .line 604
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 605
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "workout_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " GLOB ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "recordId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 609
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "[A-Z][0-9][0-9][0-9]*"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    .line 612
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 609
    const/4 v2, 0x1

    invoke-virtual {v0, v2, v5, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 613
    if-eqz v6, :cond_1

    .line 614
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 615
    invoke-static {v6}, Lo/btw;->c(Landroid/database/Cursor;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v4

    goto :goto_0

    .line 617
    :cond_0
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 620
    :cond_1
    return-object v4
.end method

.method public addExercisedRecord(Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z
    .locals 8

    .line 807
    if-nez p1, :cond_0

    .line 808
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addExercisedRecord record is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 809
    const/4 v0, 0x0

    return v0

    .line 812
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    if-eqz v0, :cond_1

    .line 813
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/btw;->c(Ljava/lang/String;Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z

    .line 814
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->r()Lo/btc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v4

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v5

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/btc;->c(Ljava/lang/String;JFILjava/lang/String;Z)V

    goto :goto_0

    .line 816
    :cond_1
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountInfo == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 819
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public addExercisedRecord(Ljava/util/List;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)Z"
        }
    .end annotation

    .line 782
    if-nez p1, :cond_0

    .line 783
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addExercisedRecord records are null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 784
    const/4 v0, 0x0

    return v0

    .line 786
    :cond_0
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addExercisedRecord multiple records "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 788
    const/4 v6, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 789
    const/4 v7, 0x0

    .line 790
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireId()I

    move-result v8

    .line 791
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mIsNeedAdd:Z

    if-eqz v0, :cond_1

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    iget-wide v2, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mDeletingRecord:J

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 792
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->i()Lo/bsz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    .line 793
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 792
    const/16 v4, 0x9

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/bsz;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Z

    .line 794
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mIsNeedAdd:Z

    .line 795
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mDeletingRecord:J

    .line 797
    const/4 v7, 0x1

    .line 799
    :cond_1
    if-nez v7, :cond_2

    .line 800
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->addExercisedRecord(Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z

    .line 788
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 803
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public deleteFitnessRecord(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 12

    .line 521
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 522
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteFitnessRecord null == callback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    return-void

    .line 525
    :cond_0
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteFitnessRecord recordId = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 526
    invoke-virtual {p0, p1}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireWorkoutRecordByRecordId(I)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v6

    .line 527
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 528
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteFitnessRecord null == record"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    const-string v0, "deleteFitnessRecord null == record"

    const/4 v1, -0x1

    invoke-interface {p2, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 530
    return-void

    .line 533
    :cond_1
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireId()I

    move-result v7

    .line 534
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteFitnessRecord webId = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 536
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWearType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 538
    const-string v0, "deleteFitnessRecord record is device record, not support delete"

    const/4 v1, -0x1

    invoke-interface {p2, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 542
    :cond_2
    :try_start_0
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireId()I

    move-result v0

    invoke-static {v0}, Lo/btw;->e(I)V

    .line 543
    if-nez v7, :cond_3

    .line 544
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteFitnessRecord this record has no web Id"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v8

    .line 547
    const-wide/16 v0, 0x3e8

    div-long v10, v8, v0

    .line 548
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    const-wide/16 v1, 0x1

    sub-long v1, v10, v1

    const-wide/16 v3, 0x1

    add-long/2addr v3, v10

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->postFitnessHistoryRequest(JJI)V

    .line 549
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mDeletingRecord:J

    .line 550
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mIsNeedAdd:Z

    .line 551
    goto :goto_0

    .line 552
    :cond_3
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireId()I

    move-result v1

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2, p2}, Lo/bsp;->a(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 556
    :goto_0
    goto :goto_1

    .line 554
    :catch_0
    move-exception v8

    .line 555
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteFitnessRecord "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 557
    :goto_1
    return-void
.end method

.method public declared-synchronized downloadFitnessRecordFromCloud(Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
    .locals 7

    monitor-enter p0

    .line 856
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadFitnessRecordFromCloud start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 857
    if-nez p1, :cond_0

    .line 858
    monitor-exit p0

    return-void

    .line 861
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->downloadingWorkoutRecords:Z

    if-eqz v0, :cond_1

    .line 862
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadFitnessRecordFromCloud is downloading"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 863
    const/16 v4, -0x3e6

    .line 864
    const-string v5, "repeat downloading"

    .line 865
    invoke-interface {p1, v4, v5}, Lcom/huawei/health/suggestion/model/fitness/IResultCallback;->onResult(ILjava/lang/Object;)V

    .line 866
    monitor-exit p0

    return-void

    .line 869
    :cond_1
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 870
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    invoke-interface {v0}, Lo/brr;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 871
    :goto_0
    if-eqz v4, :cond_3

    .line 872
    const/16 v5, -0x3e7

    .line 873
    const-string v6, "this is oversea version"

    .line 874
    invoke-interface {p1, v5, v6}, Lcom/huawei/health/suggestion/model/fitness/IResultCallback;->onResult(ILjava/lang/Object;)V

    .line 875
    monitor-exit p0

    return-void

    .line 878
    :cond_3
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->downloadingWorkoutRecords:Z

    .line 880
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    .line 882
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadFitnessRecordFromCloud "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->accountInfo:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 884
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mResultCallback:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    .line 886
    invoke-direct {p0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getFitnessHistoryByMonth()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 887
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public getSql(IJJ)Ljava/lang/String;
    .locals 5

    .line 1032
    const-string v4, ""

    .line 1033
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1034
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select substr(exerciseDate, 1, 8) as date,sum(round(actualCalorie/1000)) as calorie ,sum(during) as during, count(workoutId) as times from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1037
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "workout_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " GLOB ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " between "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " group by substr("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseDate"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", 1, 8) order by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "date"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " desc"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_0

    .line 1044
    :cond_0
    const/4 v0, 0x3

    if-ne v0, p1, :cond_1

    .line 1045
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select substr(exerciseDate, 1, 4) as date,sum(round(actualCalorie/1000)) as calorie ,sum(during) as during, count(workoutId) as times from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1048
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "workout_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " GLOB ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " between "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " group by substr("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseDate"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", 1, 4) order by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "date"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " desc"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 1067
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select substr(exerciseDate, 1, 4) as date,sum(round(actualCalorie/1000)) as calorie ,sum(during) as during, count(workoutId) as times from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1071
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "workout_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " GLOB ?  and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "exerciseTime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " between "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1077
    :goto_0
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "type:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "-sql:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1078
    return-object v4
.end method

.method public postFitnessHistoryRequest(JJI)V
    .locals 11

    .line 894
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postFitnessHistoryRequest"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 896
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 898
    const/4 v0, 0x0

    :try_start_0
    invoke-static {v9, v0}, Lo/bsa;->b(Lorg/json/JSONObject;Ljava/util/Map;)V

    .line 899
    const-string v0, "iVersion"

    const-string v1, "2"

    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 900
    const-string v0, "startTime"

    invoke-virtual {v9, v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 901
    const-string v0, "endTime"

    invoke-virtual {v9, v0, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 902
    const-string v0, "pageNum"

    move/from16 v1, p5

    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 905
    goto :goto_0

    .line 903
    :catch_0
    move-exception v10

    .line 904
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "postFitnessHistoryRequest "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 907
    :goto_0
    invoke-static {}, Lo/bsc;->b()Lo/bsc;

    move-result-object v0

    invoke-static {}, Lo/bsl;->y()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$7;

    move-object v3, p0

    move-wide v4, p1

    move-wide v6, p3

    move-object v8, v9

    invoke-direct/range {v2 .. v8}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$7;-><init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;JJLorg/json/JSONObject;)V

    invoke-virtual {v0, v1, v9, v2}, Lo/bsc;->b(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsf;)V

    .line 943
    return-void
.end method

.method public postLocalFitnessRecordToCloud(Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z
    .locals 4

    .line 840
    if-nez p1, :cond_0

    .line 841
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postLocalFitnessRecordToCloud record is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 842
    const/4 v0, 0x0

    return v0

    .line 845
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/bsp;->a(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 847
    const/4 v0, 0x1

    return v0
.end method

.method public postLocalFitnessRecordToCloud(Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)Z"
        }
    .end annotation

    .line 828
    if-nez p1, :cond_0

    .line 829
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postLocalFitnessRecordToCloud records is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 830
    const/4 v0, 0x0

    return v0

    .line 833
    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 834
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->postLocalFitnessRecordToCloud(Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z

    .line 833
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 836
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public unregResultCallback()V
    .locals 1

    .line 890
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->mResultCallback:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    .line 891
    return-void
.end method
