.class public Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$HWExerciseAdviceMgrHandler;
    }
.end annotation


# static fields
.field private static final EXERCISEADVICE_SYNC_DETAIL_TIMEOUT:I = 0x493e0

.field private static final EXERCISE_MGR_POOL_NUM:I = 0x5

.field private static final HOUR:I = 0xe10

.field private static final MSG_EXERCISEADVICE_SYNC_DETAIL_TIMEOUT:I = 0x0

.field private static final OBTAIN_GPS_ERROR:I = -0x1

.field private static ONE_DAY_SECOND:J = 0x0L

.field private static final Object:Ljava/lang/Object;

.field private static SEVEN_DAY_SECOND:J = 0x0L

.field private static final SWIM_AVG_SWOLF_DEFAULT:I = -0x1

.field private static final SWIM_POOL_LENGTH_DEFAULT:I = -0x1

.field private static final SWIM_PULL_RATE_DEFAULT:I = -0x1

.field private static final SWIM_PULL_TIMES_DEFAULT:I = -0x1

.field private static final SWIM_TRIP_TIMES_DEFAULT:I = -0x1

.field private static final SWIM_TYPE_DEFAULT:I = -0x1

.field private static final TAG:Ljava/lang/String; = "HWExerciseAdviceAW70Manager"

.field public static final WORKOUT_RECORD_SAVE_FINISH:Ljava/lang/String; = "com.huawei.health.workout_record_save_finish"

.field private static getRunPlanRecordCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static getRunPlanRecordInfoCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static hwDeviceMgr:Lo/dea; = null

.field private static instance:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager; = null

.field private static notificationRunPlanRecordInfoCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static runPlanParameterCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static setRunPlanCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static setRunPlanReminderSwitchCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field


# instance fields
.field private currDeviceId:Ljava/lang/String;

.field private currentTime:J

.field private deviceWorkoutDetailCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private getWorkoutRecordPaceMapCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private isDetailSyncing:Z

.field private lastSyncTime:J

.field private final lockObject:Ljava/lang/Object;

.field private lstGPSRunPlanRecordID:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private lstGPSWorkoutRecordID:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private lstWorkoutData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lorg/json/JSONObject;>;"
        }
    .end annotation
.end field

.field private lstWorkoutDetailData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lorg/json/JSONObject;>;"
        }
    .end annotation
.end field

.field private lstWorkoutRecordPaceMapIDList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/PaceIndexStruct;>;"
        }
    .end annotation
.end field

.field private lstWorkoutRecordPaceMapList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lorg/json/JSONObject;>;"
        }
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private mDeviceSupportCapacity:Z

.field private mDeviceSupportPaceMap:Z

.field private mHWExerciseAdviceMgrHandler:Landroid/os/Handler;

.field private mHandlerThread:Landroid/os/HandlerThread;

.field private mManager:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

.field private mRunPlanRecord:Lorg/json/JSONObject;

.field private mRunPlanRecordStatisticIndex:I

.field private mRunPlanRecordsStatistic:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Lorg/json/JSONObject;>;"
        }
    .end annotation
.end field

.field private mSaveDataItemNum:I

.field private mThreadPool:Ljava/util/concurrent/ExecutorService;

.field private mWorkoutRecord:Lorg/json/JSONObject;

.field private mWorkoutRecordStatisticIndex:I

.field private mWorkoutRecordsStatistic:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Lorg/json/JSONObject;>;"
        }
    .end annotation
.end field

.field private mapGPSRunPlan:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Map<Ljava/lang/Long;[D>;>;"
        }
    .end annotation
.end field

.field private mapGPSWorkout:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Map<Ljava/lang/Long;[D>;>;"
        }
    .end annotation
.end field

.field private mapGPSWorkoutAndRunPlanType:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private syncSuccessCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 110
    const-wide/32 v0, 0x5265c00

    sput-wide v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->ONE_DAY_SECOND:J

    .line 111
    sget-wide v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->ONE_DAY_SECOND:J

    const-wide/16 v2, 0x7

    mul-long/2addr v0, v2

    sput-wide v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->SEVEN_DAY_SECOND:J

    .line 125
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->runPlanParameterCallbackList:Ljava/util/List;

    .line 126
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->setRunPlanCallbackList:Ljava/util/List;

    .line 127
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->setRunPlanReminderSwitchCallbackList:Ljava/util/List;

    .line 128
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordCallbackList:Ljava/util/List;

    .line 129
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;

    .line 130
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->notificationRunPlanRecordInfoCallbackList:Ljava/util/List;

    .line 176
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->Object:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V
    .locals 2

    .line 193
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mDeviceSupportCapacity:Z

    .line 137
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mDeviceSupportPaceMap:Z

    .line 139
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecordsStatistic:Landroid/util/SparseArray;

    .line 140
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecordsStatistic:Landroid/util/SparseArray;

    .line 141
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutDetailData:Ljava/util/List;

    .line 142
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutData:Ljava/util/List;

    .line 144
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstGPSWorkoutRecordID:Ljava/util/List;

    .line 145
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstGPSRunPlanRecordID:Ljava/util/List;

    .line 147
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutRecordPaceMapIDList:Ljava/util/List;

    .line 148
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutRecordPaceMapList:Ljava/util/List;

    .line 150
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mapGPSWorkout:Ljava/util/Map;

    .line 151
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mapGPSRunPlan:Ljava/util/Map;

    .line 153
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mapGPSWorkoutAndRunPlanType:Ljava/util/Map;

    .line 155
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mSaveDataItemNum:I

    .line 156
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecordStatisticIndex:I

    .line 157
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecordStatisticIndex:I

    .line 158
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->isDetailSyncing:Z

    .line 161
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mHandlerThread:Landroid/os/HandlerThread;

    .line 162
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->currentTime:J

    .line 163
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lastSyncTime:J

    .line 164
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->currDeviceId:Ljava/lang/String;

    .line 167
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->syncSuccessCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 177
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lockObject:Ljava/lang/Object;

    .line 1879
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$4;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$4;-><init>(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getWorkoutRecordPaceMapCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 2236
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$9;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$9;-><init>(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->deviceWorkoutDetailCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 194
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mContext:Landroid/content/Context;

    .line 195
    iput-object p2, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mManager:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    .line 196
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->hwDeviceMgr:Lo/dea;

    .line 197
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->initDeviceInfo()V

    .line 198
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 199
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;ILjava/lang/String;)V
    .locals 0

    .line 108
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->notifyDetailSyncComplete(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Ljava/lang/String;
    .locals 1

    .line 108
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getCurrDeviceId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1000()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 1

    .line 108
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1100(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Z
    .locals 1

    .line 108
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mDeviceSupportCapacity:Z

    return v0
.end method

.method static synthetic access$1200(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)V
    .locals 0

    .line 108
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->notifyToSyncStressData()V

    return-void
.end method

.method static synthetic access$1300(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)J
    .locals 2

    .line 108
    iget-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lastSyncTime:J

    return-wide v0
.end method

.method static synthetic access$1302(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;J)J
    .locals 0

    .line 108
    iput-wide p1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lastSyncTime:J

    return-wide p1
.end method

.method static synthetic access$1400(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)J
    .locals 2

    .line 108
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getLastSyncTime()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic access$1500()J
    .locals 2

    .line 108
    sget-wide v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->SEVEN_DAY_SECOND:J

    return-wide v0
.end method

.method static synthetic access$1600(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Landroid/os/Handler;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mHWExerciseAdviceMgrHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$1700(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Ljava/util/List;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutDetailData:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$1800(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Ljava/util/List;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutRecordPaceMapIDList:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$1900(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Ljava/util/List;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutRecordPaceMapList:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->currDeviceId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$2000(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;Lorg/json/JSONObject;)V
    .locals 0

    .line 108
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getDeviceWorkoutRecordIdList(Lorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic access$202(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->currDeviceId:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$2100(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;Lcom/huawei/datatype/PaceIndexStruct;)V
    .locals 0

    .line 108
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getWorkoutRecordPaceMap(Lcom/huawei/datatype/PaceIndexStruct;)V

    return-void
.end method

.method static synthetic access$2200(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)I
    .locals 1

    .line 108
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecordStatisticIndex:I

    return v0
.end method

.method static synthetic access$2202(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;I)I
    .locals 0

    .line 108
    iput p1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecordStatisticIndex:I

    return p1
.end method

.method static synthetic access$2208(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)I
    .locals 2

    .line 108
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecordStatisticIndex:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecordStatisticIndex:I

    return v0
.end method

.method static synthetic access$2300(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Landroid/util/SparseArray;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecordsStatistic:Landroid/util/SparseArray;

    return-object v0
.end method

.method static synthetic access$2400(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Ljava/util/List;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstGPSWorkoutRecordID:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$2500(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)V
    .locals 0

    .line 108
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getDeviceWorkoutRecordStatistic()V

    return-void
.end method

.method static synthetic access$2600(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)I
    .locals 1

    .line 108
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecordStatisticIndex:I

    return v0
.end method

.method static synthetic access$2602(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;I)I
    .locals 0

    .line 108
    iput p1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecordStatisticIndex:I

    return p1
.end method

.method static synthetic access$2608(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)I
    .locals 2

    .line 108
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecordStatisticIndex:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecordStatisticIndex:I

    return v0
.end method

.method static synthetic access$2700(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Lorg/json/JSONObject;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecord:Lorg/json/JSONObject;

    return-object v0
.end method

.method static synthetic access$2702(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecord:Lorg/json/JSONObject;

    return-object p1
.end method

.method static synthetic access$2800(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Landroid/util/SparseArray;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecordsStatistic:Landroid/util/SparseArray;

    return-object v0
.end method

.method static synthetic access$2900(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Ljava/util/List;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstGPSRunPlanRecordID:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)V
    .locals 0

    .line 108
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->saveData()V

    return-void
.end method

.method static synthetic access$3000(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)V
    .locals 0

    .line 108
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getDeviceRunPlanRecordStatistic()V

    return-void
.end method

.method static synthetic access$3100(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Lorg/json/JSONObject;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecord:Lorg/json/JSONObject;

    return-object v0
.end method

.method static synthetic access$3102(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecord:Lorg/json/JSONObject;

    return-object p1
.end method

.method static synthetic access$3200(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;II)V
    .locals 0

    .line 108
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getPaceIndexArray(II)V

    return-void
.end method

.method static synthetic access$3300(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;Lorg/json/JSONObject;)V
    .locals 0

    .line 108
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getDeviceRunPlanRecordIdList(Lorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic access$3400(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)V
    .locals 0

    .line 108
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getDetailData()V

    return-void
.end method

.method static synthetic access$3500(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Ljava/util/List;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutData:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$3600(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;Lorg/json/JSONObject;)V
    .locals 0

    .line 108
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getWorkoutDetailData(Lorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic access$3700(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Z
    .locals 1

    .line 108
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mDeviceSupportPaceMap:Z

    return v0
.end method

.method static synthetic access$400(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)J
    .locals 2

    .line 108
    iget-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->currentTime:J

    return-wide v0
.end method

.method static synthetic access$402(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;J)J
    .locals 0

    .line 108
    iput-wide p1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->currentTime:J

    return-wide p1
.end method

.method static synthetic access$500(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;J)V
    .locals 0

    .line 108
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->setLastSyncTime(J)V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Z
    .locals 1

    .line 108
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->isDetailSyncing:Z

    return v0
.end method

.method static synthetic access$602(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;Z)Z
    .locals 0

    .line 108
    iput-boolean p1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->isDetailSyncing:Z

    return p1
.end method

.method static synthetic access$700(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->syncSuccessCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic access$702(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->syncSuccessCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object p1
.end method

.method static synthetic access$800(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)I
    .locals 1

    .line 108
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mSaveDataItemNum:I

    return v0
.end method

.method static synthetic access$810(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)I
    .locals 2

    .line 108
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mSaveDataItemNum:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mSaveDataItemNum:I

    return v0
.end method

.method static synthetic access$900(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Landroid/content/Context;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method private static calculateBestPace(Ljava/util/Map;)F
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)F"
        }
    .end annotation

    .line 860
    const/4 v4, 0x0

    .line 861
    const/4 v0, 0x0

    if-eq v0, p0, :cond_3

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 862
    invoke-static {p0}, Lo/cdl;->e(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    .line 863
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 864
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calculateBestPace,valid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 865
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 866
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 867
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    cmpl-float v0, v4, v0

    if-lez v0, :cond_0

    .line 868
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v4

    .line 870
    :cond_0
    goto :goto_0

    .line 871
    :cond_1
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calculateBestPace,setBestPace:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 873
    :cond_2
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calculateBestPace,no valadePacemap "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 875
    :goto_1
    goto :goto_2

    .line 876
    :cond_3
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calculateBestPace no pacemap"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 878
    :goto_2
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calculateBestPace,bestValue:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 879
    return v4
.end method

.method private changePaceMapStruct(Lorg/json/JSONArray;I)Ljava/util/Map;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;I)Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 575
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 576
    const/4 v0, 0x0

    return-object v0

    .line 578
    :cond_0
    new-instance v4, Ljava/util/TreeMap;

    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 580
    const/4 v5, 0x0

    :goto_0
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_a

    .line 581
    move-object/from16 v0, p1

    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lorg/json/JSONObject;

    .line 582
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "paceMapList="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "paceMapList"

    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 583
    const-string v0, "paceMapList"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    .line 584
    const/4 v8, 0x0

    .line 585
    const/4 v0, 0x0

    move/from16 v1, p2

    if-ne v0, v1, :cond_5

    .line 586
    const/4 v9, 0x0

    :goto_1
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_4

    .line 587
    invoke-virtual {v7, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    .line 588
    const-string v0, "unit_type"

    const/4 v1, -0x1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 589
    goto/16 :goto_2

    .line 591
    :cond_1
    const-string v0, "isLastLessDistance"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v11

    .line 592
    const-string v0, "pace"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v12

    .line 593
    const-string v0, "point_index"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v13

    .line 594
    if-nez v11, :cond_2

    .line 595
    const-string v0, "distance"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v14

    .line 596
    mul-int/lit8 v0, v14, 0x64

    const v1, 0x186a0

    mul-int/2addr v0, v1

    add-int/2addr v0, v13

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    int-to-float v1, v12

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 597
    move v8, v14

    .line 598
    goto :goto_2

    .line 599
    :cond_2
    const-string v0, "lastLessDistance"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v14, v0

    .line 600
    const/4 v0, 0x0

    if-ne v0, v14, :cond_3

    .line 601
    goto :goto_2

    .line 603
    :cond_3
    mul-int/lit8 v0, v8, 0x64

    add-int/2addr v0, v14

    const v1, 0x186a0

    mul-int/2addr v0, v1

    add-int/2addr v0, v13

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    int-to-float v1, v12

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_1

    :cond_4
    goto/16 :goto_5

    .line 607
    :cond_5
    const/4 v9, 0x0

    :goto_3
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_9

    .line 608
    invoke-virtual {v7, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    .line 609
    const-string v0, "unit_type"

    const/4 v1, -0x1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_6

    .line 610
    goto/16 :goto_4

    .line 612
    :cond_6
    const-string v0, "isLastLessDistance"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v11

    .line 613
    const-string v0, "pace"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v12

    .line 614
    const-string v0, "point_index"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v13

    .line 615
    if-nez v11, :cond_7

    .line 616
    const-string v0, "distance"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v14

    .line 617
    mul-int/lit8 v0, v14, 0x64

    const v1, 0x186a0

    mul-int/2addr v0, v1

    add-int/2addr v0, v13

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    int-to-float v1, v12

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 618
    move v8, v14

    .line 619
    goto :goto_4

    .line 620
    :cond_7
    const-string v0, "lastLessDistance"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v14, v0

    .line 621
    const/4 v0, 0x0

    if-ne v0, v14, :cond_8

    .line 622
    goto :goto_4

    .line 624
    :cond_8
    mul-int/lit8 v0, v8, 0x64

    add-int/2addr v0, v14

    const v1, 0x186a0

    mul-int/2addr v0, v1

    add-int/2addr v0, v13

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    int-to-float v1, v12

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 607
    :goto_4
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_3

    .line 580
    :cond_9
    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 632
    :cond_a
    goto :goto_6

    .line 629
    :catch_0
    move-exception v5

    .line 630
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "changePaceMapStruct error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    const/4 v0, 0x0

    return-object v0

    .line 633
    :goto_6
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "changePaceMapStruct paceMap size="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    return-object v4
.end method

.method private changePartTimePaceMapStruct(Lorg/json/JSONArray;II)Ljava/util/Map;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;II)Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;"
        }
    .end annotation

    .line 645
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 646
    const/4 v0, 0x0

    return-object v0

    .line 648
    :cond_0
    new-instance v4, Ljava/util/TreeMap;

    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 649
    const/4 v5, 0x0

    .line 651
    const/4 v6, 0x0

    :goto_0
    :try_start_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_5

    .line 652
    invoke-virtual {p1, v6}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lorg/json/JSONObject;

    .line 653
    new-instance v8, Lorg/json/JSONArray;

    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    .line 654
    const-string v0, "paceMapList"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    .line 655
    const/4 v10, 0x0

    :goto_1
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v10, v0, :cond_2

    .line 656
    invoke-virtual {v9, v10}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lorg/json/JSONObject;

    .line 657
    const-string v0, "unit_type"

    const/4 v1, -0x1

    invoke-virtual {v11, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    move/from16 v1, p2

    if-ne v1, v0, :cond_1

    .line 658
    invoke-virtual {v8, v11}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 655
    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 661
    :cond_2
    const/4 v10, 0x0

    .line 662
    const/4 v11, 0x0

    :goto_2
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v11, v0, :cond_4

    .line 663
    invoke-virtual {v8, v11}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    .line 664
    const-string v0, "isLastLessDistance"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v13

    .line 665
    if-nez v13, :cond_3

    .line 666
    const-string v0, "distance"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit16 v10, v0, 0x2710

    .line 667
    const-string v0, "pace"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v5, v0

    .line 668
    int-to-double v0, v10

    const-wide v2, 0x40c3880000000000L    # 10000.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    int-to-double v1, v5

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 662
    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 651
    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 675
    :cond_5
    goto :goto_3

    .line 672
    :catch_0
    move-exception v6

    .line 673
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "changePartTimePaceMapStruct error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 674
    const/4 v0, 0x0

    return-object v0

    .line 676
    :goto_3
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "changePartTimePaceMapStruct paceMap size="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 677
    return-object v4
.end method

.method private checkSupportWorkoutType(I)Z
    .locals 1

    .line 682
    const/4 v0, 0x1

    if-eq v0, p1, :cond_0

    const/4 v0, 0x2

    if-eq v0, p1, :cond_0

    const/4 v0, 0x3

    if-ne v0, p1, :cond_1

    .line 685
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 688
    :cond_1
    const/16 v0, 0x9

    if-eq v0, p1, :cond_2

    const/16 v0, 0xa

    if-ne v0, p1, :cond_3

    .line 690
    :cond_2
    const/4 v0, 0x1

    return v0

    .line 695
    :cond_3
    const/4 v0, 0x6

    if-eq v0, p1, :cond_4

    const/16 v0, 0x8

    if-eq v0, p1, :cond_4

    const/4 v0, 0x5

    if-ne v0, p1, :cond_5

    .line 699
    :cond_4
    const/4 v0, 0x1

    return v0

    .line 706
    :cond_5
    const/4 v0, 0x7

    if-eq v0, p1, :cond_6

    const/16 v0, 0xff

    if-ne v0, p1, :cond_7

    .line 709
    :cond_6
    const/4 v0, 0x1

    return v0

    .line 715
    :cond_7
    const/4 v0, 0x0

    return v0
.end method

.method private checkWorkoutDisplayInfo(ILjava/util/Map;Lcom/huawei/datatype/WorkoutDisplayInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/Map<Ljava/lang/Long;[D>;Lcom/huawei/datatype/WorkoutDisplayInfo;)V"
        }
    .end annotation

    .line 720
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    .line 721
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setHasTrackPoint(Z)V

    goto :goto_0

    .line 723
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setHasTrackPoint(Z)V

    .line 726
    :goto_0
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_1

    .line 730
    :sswitch_0
    const/16 v0, 0x102

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 731
    goto :goto_2

    .line 733
    :sswitch_1
    const/16 v0, 0x101

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 734
    goto :goto_2

    .line 736
    :sswitch_2
    const/16 v0, 0x103

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 737
    goto :goto_2

    .line 739
    :sswitch_3
    const/16 v0, 0x106

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 740
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setChiefSportDataType(I)V

    .line 741
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setFreeMotion(Z)V

    .line 742
    goto :goto_2

    .line 744
    :sswitch_4
    const/16 v0, 0x10a

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 745
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setChiefSportDataType(I)V

    .line 746
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setFreeMotion(Z)V

    .line 747
    goto :goto_2

    .line 749
    :sswitch_5
    const/16 v0, 0x108

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 752
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setFreeMotion(Z)V

    .line 753
    goto :goto_2

    .line 755
    :sswitch_6
    const/16 v0, 0x109

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 757
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setChiefSportDataType(I)V

    .line 758
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setFreeMotion(Z)V

    .line 759
    goto :goto_2

    .line 761
    :sswitch_7
    const/16 v0, 0x117

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 762
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setChiefSportDataType(I)V

    .line 763
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setFreeMotion(Z)V

    .line 764
    goto :goto_2

    .line 766
    :goto_1
    const/16 v0, 0x102

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 769
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x5 -> :sswitch_5
        0x6 -> :sswitch_3
        0x7 -> :sswitch_6
        0x8 -> :sswitch_4
        0x9 -> :sswitch_0
        0xa -> :sswitch_0
        0xff -> :sswitch_7
    .end sparse-switch
.end method

.method private static convertHealthTrackDataToHiData(Lcom/huawei/datatype/MotionPathSimplify;Lcom/huawei/datatype/MotionPath;Lcom/huawei/hihealth/HiDataInsertOption;)V
    .locals 13

    .line 774
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->calculateBestPace(Ljava/util/Map;)F

    move-result v4

    .line 775
    invoke-virtual {p0, v4}, Lcom/huawei/datatype/MotionPathSimplify;->setBestPace(F)V

    .line 776
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "convertHealthTrackDataToHiData, simplifyData "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 777
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "convertHealthTrackDataToHiData, motionData "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/datatype/MotionPath;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 779
    new-instance v5, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-direct {v5}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;-><init>()V

    .line 780
    const/4 v6, 0x0

    .line 781
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getMapType()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 782
    const-string v6, "AMAP"

    goto :goto_0

    .line 783
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getMapType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 784
    const-string v6, "GOOGLE"

    .line 786
    :cond_1
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 787
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "convertHealthTrackDataToHiData, null != vendor ,vendor="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 788
    invoke-virtual {v5, v6}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setVendor(Ljava/lang/String;)V

    .line 790
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getAvgStepRate()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgStepRate(I)V

    .line 791
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getAvgHeartRate()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgHeartRate(I)V

    .line 792
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getAvgPace()F

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgPace(F)V

    .line 794
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getBestPace()F

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBestPace(F)V

    .line 795
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getBestStepRate()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBestStepRate(I)V

    .line 796
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getMaxHeartRate()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setMaxHeartRate(I)V

    .line 797
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getSportType()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSportType(I)V

    .line 798
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalCalories()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalCalories(I)V

    .line 799
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalDistance()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalDistance(I)V

    .line 800
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalSteps()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalSteps(I)V

    .line 801
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalTime()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalTime(J)V

    .line 802
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getSportData()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setWearSportData(Ljava/util/Map;)V

    .line 803
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getCreepingWave()F

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setCreepingWave(F)V

    .line 804
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getMinHeartRate()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setMinHeartRate(I)V

    .line 805
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTrackType()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTrackType(I)V

    .line 806
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getSportData()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setWearSportData(Ljava/util/Map;)V

    .line 807
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getIsFreeMotion()Z

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setIsFreeMotion(Z)V

    .line 808
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getSportDataSource()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSportDataSource(I)V

    .line 809
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getChiefSportDataType()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setChiefSportDataType(I)V

    .line 810
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getHasTrackPoint()Z

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setHasTrackPoint(Z)V

    .line 811
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setPaceMap(Ljava/util/Map;)V

    .line 812
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getPartTimeMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setPartTimeMap(Ljava/util/Map;)V

    .line 813
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getBritishPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBritishPaceMap(Ljava/util/Map;)V

    .line 814
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getBritishPartTimeMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBritishPartTimeMap(Ljava/util/Map;)V

    .line 816
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->requestAvgGroundContactTime()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgGroundContactTime(I)V

    .line 817
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->requestAvgGroundImpactAcceleration()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgGroundImpactAcceleration(I)V

    .line 818
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->requestAvgEversionExcursion()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgEversionExcursion(I)V

    .line 819
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->requestAvgSwingAngle()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgSwingAngle(I)V

    .line 820
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->requestAvgForeFootStrikePattern()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgForeFootStrikePattern(I)V

    .line 821
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->requestAvgWholeFootStrikePattern()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgWholeFootStrikePattern(I)V

    .line 822
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->requestAvgHindFootStrikePattern()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgHindFootStrikePattern(I)V

    .line 824
    new-instance v7, Lo/cvp;

    invoke-direct {v7}, Lo/cvp;-><init>()V

    .line 825
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getSportType()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cvp;->c(I)V

    .line 826
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/cvp;->b(Ljava/util/Map;)V

    .line 827
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getAvgPace()F

    move-result v0

    invoke-virtual {v7, v0}, Lo/cvp;->c(F)V

    .line 828
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalDistance()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cvp;->d(I)V

    .line 829
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalSteps()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cvp;->a(I)V

    .line 830
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lo/cvp;->e(Z)V

    .line 831
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTrackType()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cvp;->e(I)V

    .line 832
    invoke-static {v7}, Lo/cvr;->b(Lo/cvp;)I

    move-result v8

    .line 834
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mAbnormalTrack:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", abnormalData"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lo/cvp;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 835
    invoke-virtual {p0, v8}, Lcom/huawei/datatype/MotionPathSimplify;->saveAbnormalTrack(I)V

    .line 836
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->requestAbnormalTrack()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAbnormalTrack(I)V

    .line 838
    new-instance v9, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 839
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 840
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 842
    const/16 v0, 0x7531

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 843
    invoke-virtual {p1}, Lcom/huawei/datatype/MotionPath;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 844
    new-instance v10, Lcom/google/gson/Gson;

    invoke-direct {v10}, Lcom/google/gson/Gson;-><init>()V

    .line 845
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-virtual {v10, v5, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 848
    const-string v11, ""

    .line 849
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v12

    .line 850
    const/4 v0, 0x0

    if-eq v0, v12, :cond_3

    .line 851
    invoke-virtual {v12}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecUUID()Ljava/lang/String;

    move-result-object v11

    goto :goto_1

    .line 853
    :cond_3
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "convertHealthTrackDataToHiData, deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 855
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#ANDROID21"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 856
    invoke-virtual {p2, v9}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 857
    return-void
.end method

.method private getAW70Identify()Ljava/lang/String;
    .locals 2

    .line 1221
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0}, Lo/dea;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    .line 1222
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 1223
    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1225
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private getCurrDeviceId()Ljava/lang/String;
    .locals 3

    .line 236
    const-string v1, ""

    .line 237
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v2

    .line 239
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 240
    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v1

    .line 242
    :cond_0
    return-object v1
.end method

.method private static getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 7

    .line 250
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0}, Lo/dea;->a()Ljava/util/List;

    move-result-object v4

    .line 251
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 252
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentDeviceInfo() deviceInfoList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 254
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 255
    return-object v6

    .line 257
    :cond_0
    goto :goto_0

    .line 258
    :cond_1
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() deviceInfo\'s ActiveState not DeviceActiveState.DEVICE_ACTIVE_ENABLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    const/4 v0, 0x0

    return-object v0

    .line 261
    :cond_2
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() deviceInfoList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    const/4 v0, 0x0

    return-object v0
.end method

.method private getDetailData()V
    .locals 2

    .line 1861
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1862
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecord:Lorg/json/JSONObject;

    invoke-direct {p0, v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->syncWorkoutDetailData(Lorg/json/JSONObject;)V

    .line 1863
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecord:Lorg/json/JSONObject;

    invoke-direct {p0, v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->syncRunPlanDetailData(Lorg/json/JSONObject;)V

    .line 1864
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1866
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutData:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    invoke-direct {p0, v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getWorkoutDetailData(Lorg/json/JSONObject;)V

    goto :goto_0

    .line 1870
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mDeviceSupportPaceMap:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutRecordPaceMapIDList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 1871
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutRecordPaceMapIDList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/PaceIndexStruct;

    invoke-direct {p0, v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getWorkoutRecordPaceMap(Lcom/huawei/datatype/PaceIndexStruct;)V

    goto :goto_0

    .line 1873
    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->notifyDetailSyncComplete(ILjava/lang/String;)V

    .line 1876
    :goto_0
    return-void
.end method

.method private getDeviceRunPlanRecordIdList(Lorg/json/JSONObject;)V
    .locals 5

    .line 2100
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecord:Lorg/json/JSONObject;

    .line 2102
    :try_start_0
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$8;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$8;-><init>(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)V

    invoke-virtual {p0, p1, v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecord(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2141
    goto :goto_0

    .line 2139
    :catch_0
    move-exception v4

    .line 2140
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2143
    :goto_0
    return-void
.end method

.method private getDeviceRunPlanRecordStatistic()V
    .locals 7

    .line 1986
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecord:Lorg/json/JSONObject;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1987
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecord:Lorg/json/JSONObject;

    const-string v1, "runPlanRecordStructList"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 1988
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecordStatisticIndex:I

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecord:Lorg/json/JSONObject;

    const-string v2, "runPlanRecordStructList"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 1989
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecordStatisticIndex:I

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "run_plan_record_id"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 1990
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getRunPlanRecordStatistic id size="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1991
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 1992
    const-string v0, "id"

    invoke-virtual {v6, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1993
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$6;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$6;-><init>(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)V

    invoke-virtual {p0, v6, v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordInfo(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2029
    goto :goto_0

    .line 2030
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->testRunPlanRecordInfoDebug()V

    .line 2031
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getDetailData()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2036
    :cond_1
    :goto_0
    goto :goto_1

    .line 2034
    :catch_0
    move-exception v4

    .line 2035
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2038
    :goto_1
    return-void
.end method

.method private getDeviceSupportCapacity()V
    .locals 7

    .line 2164
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0}, Lo/dea;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 2165
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2166
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0}, Lo/dea;->h()Ljava/util/Map;

    move-result-object v5

    .line 2167
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 2168
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 2169
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 2170
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdvice()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mDeviceSupportCapacity:Z

    .line 2171
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutRecordPaceMap()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mDeviceSupportPaceMap:Z

    .line 2175
    :cond_0
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get Device Support runplan Capacity, capacity="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mDeviceSupportCapacity:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",paceMapSupport="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mDeviceSupportPaceMap:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2176
    return-void
.end method

.method private getDeviceWorkoutRecordIdList(Lorg/json/JSONObject;)V
    .locals 5

    .line 2042
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecord:Lorg/json/JSONObject;

    .line 2044
    :try_start_0
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getInstance()Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$7;

    invoke-direct {v1, p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$7;-><init>(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)V

    invoke-virtual {v0, p1, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecord(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2094
    goto :goto_0

    .line 2092
    :catch_0
    move-exception v4

    .line 2093
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2096
    :goto_0
    return-void
.end method

.method private getDeviceWorkoutRecordStatistic()V
    .locals 8

    .line 1930
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecord:Lorg/json/JSONObject;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1931
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecord:Lorg/json/JSONObject;

    const-string v1, "workoutRecordStructList"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 1932
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecordStatisticIndex:I

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 1933
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecordStatisticIndex:I

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 1934
    const-string v0, "workout_record_id"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 1935
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWorkoutRecord id size="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1936
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 1937
    const-string v0, "id"

    invoke-virtual {v7, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1938
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getInstance()Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$5;

    invoke-direct {v1, p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$5;-><init>(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)V

    invoke-virtual {v0, v7, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordStatistic(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1969
    goto :goto_0

    .line 1970
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->printWorkoutRecordInfo()V

    .line 1972
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 1973
    const-string v0, "startTime"

    iget-wide v1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lastSyncTime:J

    invoke-virtual {v5, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1974
    const-string v0, "endTime"

    iget-wide v1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->currentTime:J

    invoke-virtual {v5, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1975
    invoke-direct {p0, v5}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getDeviceRunPlanRecordIdList(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1980
    :cond_1
    :goto_0
    goto :goto_1

    .line 1978
    :catch_0
    move-exception v4

    .line 1979
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1981
    :goto_1
    return-void
.end method

.method private static declared-synchronized getGetRunPlanRecordCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    monitor-enter v1

    .line 2300
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static declared-synchronized getGetRunPlanRecordInfoCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    monitor-enter v1

    .line 2304
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static getInstance(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;
    .locals 4

    .line 185
    sget-object v2, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->Object:Ljava/lang/Object;

    monitor-enter v2

    .line 186
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->instance:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 187
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;-><init>(Landroid/content/Context;Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->instance:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    .line 189
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->instance:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 190
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private getLastSyncTime()J
    .locals 5

    .line 279
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastSyncTime enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    new-instance v4, Lcom/huawei/hwservicesmgr/remote/LastSyncTimeStampDB;

    invoke-direct {v4}, Lcom/huawei/hwservicesmgr/remote/LastSyncTimeStampDB;-><init>()V

    .line 281
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mManager:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getCurrDeviceId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hwservicesmgr/remote/LastSyncTimeStampDB;->getLastTimeStamp(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method private static declared-synchronized getNotificationRunPlanRecordInfoCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    monitor-enter v1

    .line 2308
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->notificationRunPlanRecordInfoCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private getPaceIndexArray(II)V
    .locals 3

    .line 2146
    const/4 v0, -0x1

    if-ne v0, p2, :cond_0

    .line 2147
    new-instance v1, Lcom/huawei/datatype/PaceIndexStruct;

    invoke-direct {v1}, Lcom/huawei/datatype/PaceIndexStruct;-><init>()V

    .line 2148
    invoke-virtual {v1, p1}, Lcom/huawei/datatype/PaceIndexStruct;->setRecordId(I)V

    .line 2149
    const/4 v0, -0x1

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/PaceIndexStruct;->setPaceIndex(I)V

    .line 2150
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutRecordPaceMapIDList:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2151
    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    if-ge v0, p2, :cond_1

    .line 2152
    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_1

    .line 2153
    new-instance v2, Lcom/huawei/datatype/PaceIndexStruct;

    invoke-direct {v2}, Lcom/huawei/datatype/PaceIndexStruct;-><init>()V

    .line 2154
    invoke-virtual {v2, p1}, Lcom/huawei/datatype/PaceIndexStruct;->setRecordId(I)V

    .line 2155
    invoke-virtual {v2, v1}, Lcom/huawei/datatype/PaceIndexStruct;->setPaceIndex(I)V

    .line 2156
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutRecordPaceMapIDList:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2152
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2159
    :cond_1
    :goto_1
    return-void
.end method

.method private static declared-synchronized getRunPlanParameterCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    monitor-enter v1

    .line 2288
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->runPlanParameterCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static declared-synchronized getSetRunPlanCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    monitor-enter v1

    .line 2292
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->setRunPlanCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static declared-synchronized getSetRunPlanReminderSwitchCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    monitor-enter v1

    .line 2296
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->setRunPlanReminderSwitchCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private getWorkoutDetailData(Lorg/json/JSONObject;)V
    .locals 5

    .line 2227
    :try_start_0
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getInstance()Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->deviceWorkoutDetailCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, p1, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutData(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2232
    goto :goto_0

    .line 2230
    :catch_0
    move-exception v4

    .line 2231
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2233
    :goto_0
    return-void
.end method

.method private getWorkoutRecordPaceMap(Lcom/huawei/datatype/PaceIndexStruct;)V
    .locals 2

    .line 1924
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getInstance()Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getWorkoutRecordPaceMapCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, p1, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordPaceMap(Lcom/huawei/datatype/PaceIndexStruct;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1925
    return-void
.end method

.method private initDeviceInfo()V
    .locals 2

    .line 204
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "HWExerciseAdviceAW70Manager"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mHandlerThread:Landroid/os/HandlerThread;

    .line 205
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 206
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$HWExerciseAdviceMgrHandler;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$HWExerciseAdviceMgrHandler;-><init>(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mHWExerciseAdviceMgrHandler:Landroid/os/Handler;

    .line 207
    return-void
.end method

.method private notifyDetailSyncComplete(ILjava/lang/String;)V
    .locals 4

    .line 285
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notifyDetailSyncComplete errCode="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mHWExerciseAdviceMgrHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 287
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mHWExerciseAdviceMgrHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 289
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    const/4 v0, -0x1

    if-ne v0, p1, :cond_2

    .line 290
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$1;-><init>(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 308
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 311
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->isDetailSyncing:Z

    .line 312
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notifyDetailSyncComplete fail for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    :goto_0
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->notifyToSyncStressData()V

    .line 315
    return-void
.end method

.method private notifyToSyncStressData()V
    .locals 6

    .line 318
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyToSyncStressData() enter.workOutCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 323
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 324
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.CORE_DFX_BROADCAST"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 325
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 326
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 329
    :cond_0
    return-void
.end method

.method private packTrackData(Lorg/json/JSONArray;Lcom/huawei/datatype/MotionPath;Lcom/huawei/datatype/MotionPathSimplify;)V
    .locals 50

    .line 1036
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1037
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1038
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1039
    const/4 v10, 0x0

    .line 1040
    const-wide/16 v11, 0x0

    .line 1041
    const/4 v13, 0x0

    .line 1042
    const/4 v14, 0x0

    .line 1043
    const-wide/16 v15, 0x0

    .line 1044
    const/16 v17, 0x0

    .line 1045
    const/16 v18, 0x0

    .line 1046
    const/16 v19, 0x0

    .line 1048
    const-wide/16 v20, 0x0

    .line 1049
    const/16 v22, 0x0

    .line 1050
    const/16 v23, 0x0

    .line 1051
    const-wide/16 v24, 0x0

    .line 1052
    const/16 v26, 0x1

    .line 1054
    invoke-virtual/range {p1 .. p1}, Lorg/json/JSONArray;->length()I

    move-result v27

    .line 1055
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v27

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1056
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the detail is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1058
    :try_start_0
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalSteps()I

    move-result v0

    move/from16 v22, v0

    .line 1059
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalTime()J

    move-result-wide v0

    move-wide/from16 v24, v0

    .line 1060
    const/16 v28, 0x0

    :goto_0
    move/from16 v0, v28

    move/from16 v1, v27

    if-ge v0, v1, :cond_4

    .line 1061
    move-object/from16 v0, p1

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v29

    .line 1062
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz=====detailID"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_id"

    move-object/from16 v4, v29

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===index:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_data_index"

    move-object/from16 v4, v29

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1063
    const-string v0, "dataHeader"

    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "time"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v30

    .line 1064
    const-string v0, "dataHeader"

    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "timeInterval"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v32

    .line 1066
    const-string v0, "dataHeader"

    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "workoutDataInfoList"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v33

    .line 1067
    add-int v0, v17, v33

    move/from16 v17, v0

    .line 1068
    const/16 v34, 0x0

    :goto_1
    move/from16 v0, v34

    move/from16 v1, v33

    if-ge v0, v1, :cond_3

    .line 1069
    const-string v0, "dataHeader"

    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "workoutDataInfoList"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    move/from16 v1, v34

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v35

    .line 1071
    mul-int v0, v32, v34

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    add-long v20, v30, v0

    .line 1074
    const-string v0, "data1"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v36

    .line 1075
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz======== heart value :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v36

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1077
    const-string v0, "data2"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v37

    .line 1078
    move/from16 v0, v37

    if-le v0, v10, :cond_0

    .line 1079
    move/from16 v10, v37

    .line 1081
    :cond_0
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========time:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    mul-int v3, v32, v34

    int-to-long v3, v3

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    add-long v3, v3, v30

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===\u8be6\u7ec6\u6570\u636e== \u901f\u5ea6="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v37

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1082
    move/from16 v0, v37

    int-to-long v0, v0

    add-long/2addr v0, v11

    move-wide v11, v0

    .line 1086
    const-string v0, "mRunPostureDataInfo"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "mCadence"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v19

    .line 1087
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========time:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    mul-int v3, v32, v34

    int-to-long v3, v3

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    add-long v3, v3, v30

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===\u8be6\u7ec6\u6570\u636e== \u6b65\u9891(data3)="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v19

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1088
    add-int v0, v14, v19

    move v14, v0

    .line 1090
    const/4 v0, 0x0

    move/from16 v1, v36

    if-eq v0, v1, :cond_1

    const/16 v0, 0xff

    move/from16 v1, v36

    if-eq v0, v1, :cond_1

    .line 1091
    new-instance v38, Lcom/huawei/datatype/HeartRateData;

    invoke-direct/range {v38 .. v38}, Lcom/huawei/datatype/HeartRateData;-><init>()V

    .line 1092
    mul-int v0, v32, v34

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    add-long v0, v0, v30

    move-object/from16 v2, v38

    invoke-virtual {v2, v0, v1}, Lcom/huawei/datatype/HeartRateData;->setTime(J)V

    .line 1093
    move-object/from16 v0, v38

    move/from16 v1, v36

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/HeartRateData;->setHeartRate(I)V

    .line 1094
    move/from16 v0, v36

    int-to-long v0, v0

    add-long/2addr v0, v15

    move-wide v15, v0

    .line 1095
    add-int/lit8 v18, v18, 0x1

    .line 1097
    move-object/from16 v0, v38

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1102
    :cond_1
    new-instance v38, Lcom/huawei/datatype/StepRateData;

    invoke-direct/range {v38 .. v38}, Lcom/huawei/datatype/StepRateData;-><init>()V

    .line 1103
    move-object/from16 v0, v38

    move-wide/from16 v1, v20

    invoke-virtual {v0, v1, v2}, Lcom/huawei/datatype/StepRateData;->setTime(J)V

    .line 1104
    move-object/from16 v0, v38

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/StepRateData;->setStepRate(I)V

    .line 1105
    move-object/from16 v0, v38

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1106
    move/from16 v0, v19

    if-le v0, v13, :cond_2

    .line 1107
    move/from16 v13, v19

    .line 1108
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move/from16 v23, v0

    .line 1110
    :cond_2
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========time:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v20

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===\u8be6\u7ec6\u6570\u636e== \u6b65\u9891="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v19

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1111
    const/16 v19, 0x0

    .line 1114
    const-string v0, "mRunPostureDataInfo"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v39

    .line 1115
    const-string v0, "mGroundContactTime"

    move-object/from16 v1, v39

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v40

    .line 1116
    const-string v0, "mGroundImpactAcceleration"

    move-object/from16 v1, v39

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v41

    .line 1117
    const-string v0, "mSwingAngle"

    move-object/from16 v1, v39

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v42

    .line 1118
    const-string v0, "mEversionExcursion"

    move-object/from16 v1, v39

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v43

    .line 1119
    const-string v0, "mForeFootStrikePattern"

    move-object/from16 v1, v39

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v44

    .line 1120
    const-string v0, "mWholeFootStrikePattern"

    move-object/from16 v1, v39

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v45

    .line 1121
    const-string v0, "mHindPawStrikePattern"

    move-object/from16 v1, v39

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v46

    .line 1122
    move/from16 v0, v32

    int-to-long v0, v0

    move/from16 v2, v26

    int-to-long v2, v2

    mul-long v47, v0, v2

    .line 1123
    new-instance v49, Lo/cvv;

    invoke-direct/range {v49 .. v49}, Lo/cvv;-><init>()V

    .line 1124
    move-object/from16 v0, v49

    move-wide/from16 v1, v47

    invoke-virtual {v0, v1, v2}, Lo/cvv;->c(J)V

    .line 1125
    move-object/from16 v0, v49

    move/from16 v1, v43

    invoke-virtual {v0, v1}, Lo/cvv;->c(I)V

    .line 1126
    move-object/from16 v0, v49

    move/from16 v1, v40

    invoke-virtual {v0, v1}, Lo/cvv;->a(I)V

    .line 1127
    move-object/from16 v0, v49

    move/from16 v1, v41

    invoke-virtual {v0, v1}, Lo/cvv;->b(I)V

    .line 1128
    move-object/from16 v0, v49

    move/from16 v1, v42

    invoke-virtual {v0, v1}, Lo/cvv;->e(I)V

    .line 1129
    move-object/from16 v0, v49

    move/from16 v1, v44

    invoke-virtual {v0, v1}, Lo/cvv;->d(I)V

    .line 1130
    move-object/from16 v0, v49

    move/from16 v1, v45

    invoke-virtual {v0, v1}, Lo/cvv;->k(I)V

    .line 1131
    move-object/from16 v0, v49

    move/from16 v1, v46

    invoke-virtual {v0, v1}, Lo/cvv;->i(I)V

    .line 1132
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========runningPosture:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v49 .. v49}, Lo/cvv;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1133
    move-object/from16 v0, v49

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1134
    add-int/lit8 v26, v26, 0x1

    .line 1068
    add-int/lit8 v34, v34, 0x1

    goto/16 :goto_1

    .line 1060
    :cond_3
    add-int/lit8 v28, v28, 0x1

    goto/16 :goto_0

    .line 1150
    :cond_4
    goto :goto_2

    .line 1148
    :catch_0
    move-exception v28

    .line 1149
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v28 .. v28}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1151
    :goto_2
    div-int/lit8 v14, v14, 0xc

    .line 1152
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "summaryTotalStep="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v22

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", iTotalStep="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", totaltime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-wide/16 v3, 0x3e8

    div-long v3, v24, v3

    const-wide/16 v5, 0x3c

    div-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1154
    move/from16 v0, v22

    if-le v0, v14, :cond_6

    sub-int v0, v22, v14

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    div-long v2, v24, v2

    const-wide/16 v4, 0x3c

    div-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_6

    .line 1155
    sub-int v0, v22, v14

    int-to-float v0, v0

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v1, v0

    move/from16 v28, v1

    .line 1156
    const/16 v29, 0x0

    :goto_3
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    move/from16 v1, v29

    if-ge v1, v0, :cond_5

    .line 1157
    move/from16 v0, v29

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/StepRateData;

    move/from16 v1, v29

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/StepRateData;

    invoke-virtual {v1}, Lcom/huawei/datatype/StepRateData;->getStepRate()I

    move-result v1

    add-int v1, v1, v28

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/StepRateData;->setStepRate(I)V

    .line 1156
    add-int/lit8 v29, v29, 0x1

    goto :goto_3

    .line 1159
    :cond_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    move/from16 v1, v23

    if-ge v1, v0, :cond_6

    .line 1160
    move/from16 v0, v23

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/StepRateData;

    invoke-virtual {v0}, Lcom/huawei/datatype/StepRateData;->getStepRate()I

    move-result v13

    .line 1164
    :cond_6
    move-object/from16 v0, p2

    invoke-virtual {v0, v7}, Lcom/huawei/datatype/MotionPath;->setHeartRateList(Ljava/util/ArrayList;)V

    .line 1165
    move-object/from16 v0, p2

    invoke-virtual {v0, v8}, Lcom/huawei/datatype/MotionPath;->setStepRateList(Ljava/util/ArrayList;)V

    .line 1166
    move-object/from16 v0, p2

    invoke-virtual {v0, v9}, Lcom/huawei/datatype/MotionPath;->saveRunningPostureList(Ljava/util/ArrayList;)V

    .line 1169
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gps_maptracking_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    const-string v2, "yyyyMMddHHmmssSSS"

    invoke-static {v1, v2}, Lo/dbu;->e(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    .line 1170
    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setSportId(Ljava/lang/String;)V

    .line 1171
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========sportId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v28

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1174
    move-object/from16 v0, p3

    const/16 v1, 0x102

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setSportType(I)V

    .line 1176
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v11

    if-nez v0, :cond_7

    .line 1177
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgPace(F)V

    goto :goto_4

    .line 1179
    :cond_7
    long-to-float v0, v11

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    move/from16 v1, v17

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x45610000    # 3600.0f

    div-float v0, v1, v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgPace(F)V

    .line 1181
    :goto_4
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz=====avg Pace:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/datatype/MotionPathSimplify;->getAvgPace()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1183
    const/4 v0, 0x0

    if-ne v0, v10, :cond_8

    .line 1184
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setBestPace(F)V

    goto :goto_5

    .line 1186
    :cond_8
    int-to-float v0, v10

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x45610000    # 3600.0f

    div-float v0, v1, v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setBestPace(F)V

    .line 1188
    :goto_5
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz=====best pace:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/datatype/MotionPathSimplify;->getBestPace()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1190
    const/4 v0, 0x0

    move/from16 v1, v18

    if-ne v0, v1, :cond_9

    .line 1191
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgHeartRate(I)V

    goto :goto_6

    .line 1193
    :cond_9
    move/from16 v0, v18

    int-to-long v0, v0

    div-long v0, v15, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v29

    .line 1194
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Long;->intValue()I

    move-result v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgHeartRate(I)V

    .line 1196
    :goto_6
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz====="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, v15

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===avgHear:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/datatype/MotionPathSimplify;->getAvgHeartRate()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1198
    int-to-float v0, v14

    move/from16 v1, v17

    int-to-float v1, v1

    const/high16 v2, 0x40a00000    # 5.0f

    mul-float/2addr v1, v2

    div-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    mul-float/2addr v0, v1

    float-to-int v1, v0

    move/from16 v29, v1

    .line 1199
    move-object/from16 v0, p3

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgStepRate(I)V

    .line 1200
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========avgStep:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v29

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1202
    move-object/from16 v0, p3

    invoke-virtual {v0, v13}, Lcom/huawei/datatype/MotionPathSimplify;->setBestStepRate(I)V

    .line 1203
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========BestStep:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1205
    invoke-static {v9}, Lo/cvy;->b(Ljava/util/ArrayList;)Landroid/os/Bundle;

    move-result-object v30

    .line 1206
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========AvgRunningPosture:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v30 .. v30}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1207
    const-string v0, "avgGroundContactTime"

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/MotionPathSimplify;->saveAvgGroundContactTime(I)V

    .line 1208
    const-string v0, "avgGroundImpactAcceleration"

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/MotionPathSimplify;->saveAvgGroundImpactAcceleration(I)V

    .line 1209
    const-string v0, "avgSwingAngle"

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/MotionPathSimplify;->saveAvgSwingAngle(I)V

    .line 1210
    const-string v0, "avgEversionExcursion"

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/MotionPathSimplify;->saveAvgEversionExcursion(I)V

    .line 1211
    const-string v0, "foreFootStrikePatternPercentage"

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/MotionPathSimplify;->saveAvgForeFootStrikePattern(I)V

    .line 1212
    const-string v0, "wholeFootStrikePatternPercentage"

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/MotionPathSimplify;->saveAvgWholeFootStrikePattern(I)V

    .line 1213
    const-string v0, "hindFootStrikePatternPercentage"

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/MotionPathSimplify;->saveAvgHindFootStrikePattern(I)V

    .line 1216
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->hwDeviceMgr:Lo/dea;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->getTrackTypeByClassification(Lo/dea;)I

    move-result v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTrackType(I)V

    .line 1218
    return-void
.end method

.method private printWorkoutRecordInfo()V
    .locals 6

    .line 1825
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "printWorkoutRecordInfo enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1827
    const/4 v4, 0x0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecordsStatistic:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 1828
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecordsStatistic:Landroid/util/SparseArray;

    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lorg/json/JSONObject;

    .line 1829
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "printWorkoutRecordInfo ==zz=workout id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_id"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",workout statuc="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_status"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",startime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_start_time"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",endtime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_end_time"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "calorie="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_calorie"

    .line 1830
    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",distance="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_distance"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",step="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_step"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",time="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_total_time"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",speed="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_speed"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",climb="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_climb"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HrMax="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_HrABS_peak_max"

    .line 1831
    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",HrMin="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_HrABS_peak_min"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",loadPeak="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_load_peak"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",effect="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_etraining_effect"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",epoc="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_Epoc"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "MET="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_maxMET"

    .line 1832
    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",revoeryTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_recovery_time"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",duration="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_exercise_duration"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",date="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_date_Info"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "totalTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_total_time"

    .line 1833
    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",workout_type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_type"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim, swim_type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_type"

    .line 1834
    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",swim_pull_times="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_pull_times"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",swim_pull_rate="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_pull_rate"

    .line 1835
    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",swim_pool_length="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_pool_length"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",swim_trip_times="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_trip_times"

    .line 1836
    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",swim_avg_swolf="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_avg_swolf"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1829
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1827
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 1840
    :cond_0
    goto :goto_1

    .line 1838
    :catch_0
    move-exception v4

    .line 1839
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1841
    :goto_1
    return-void
.end method

.method private saveData()V
    .locals 17

    .line 336
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->e(I)V

    .line 337
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mSaveDataItemNum:I

    .line 339
    const/4 v7, 0x0

    .line 340
    const/4 v8, 0x0

    .line 341
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecord:Lorg/json/JSONObject;

    if-eqz v0, :cond_9

    .line 343
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecord:Lorg/json/JSONObject;

    const-string v1, "workoutRecordStructList"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    .line 345
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_0

    .line 346
    const/4 v7, 0x1

    .line 349
    :cond_0
    const/4 v10, 0x0

    :goto_0
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v10, v0, :cond_9

    .line 350
    invoke-virtual {v9, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "workout_record_id"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v11

    .line 351
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz======== "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  \u4fdd\u5b58\uff1a=recordid"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mWorkoutRecordsStatistic:Landroid/util/SparseArray;

    invoke-virtual {v0, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lorg/json/JSONObject;

    .line 354
    const/4 v0, 0x0

    if-ne v0, v12, :cond_1

    .line 355
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz======== "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "error : can\'t get the total value ,with id :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    goto/16 :goto_3

    .line 359
    :cond_1
    new-instance v13, Lorg/json/JSONArray;

    invoke-direct {v13}, Lorg/json/JSONArray;-><init>()V

    .line 360
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutDetailData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lorg/json/JSONObject;

    .line 361
    const-string v0, "workout_record_id"

    invoke-virtual {v15, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-ne v11, v0, :cond_2

    .line 362
    invoke-virtual {v13, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 364
    :cond_2
    goto :goto_1

    .line 365
    :cond_3
    new-instance v14, Lorg/json/JSONArray;

    invoke-direct {v14}, Lorg/json/JSONArray;-><init>()V

    .line 366
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutRecordPaceMapList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lorg/json/JSONObject;

    .line 367
    const-string v0, "workout_record_id"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-ne v11, v0, :cond_4

    .line 369
    move-object/from16 v0, v16

    invoke-virtual {v14, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 371
    :cond_4
    goto :goto_2

    .line 373
    :cond_5
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz=========DetailData size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", workout type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_type"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mapGPSWorkout:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 375
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz=========mapGPSWorkout size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mapGPSWorkout:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    :cond_6
    const-string v0, "workout_type"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->checkSupportWorkoutType(I)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 379
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mSaveDataItemNum:I

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mSaveDataItemNum:I

    .line 380
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mapGPSWorkoutAndRunPlanType:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ljava/lang/Integer;

    .line 381
    const/16 v16, -0x1

    .line 382
    const/4 v0, 0x0

    if-eq v0, v15, :cond_7

    .line 383
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v16

    .line 385
    :cond_7
    move-object/from16 v0, p0

    move-object v1, v12

    move-object v2, v13

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mapGPSWorkout:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    move/from16 v4, v16

    move-object v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->saveDatatoTrack(Lorg/json/JSONObject;Lorg/json/JSONArray;Ljava/util/Map;ILorg/json/JSONArray;)V

    .line 386
    goto :goto_3

    .line 387
    :cond_8
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "workout type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_type"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",is not support, do not save!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    .line 388
    :goto_3
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 394
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecord:Lorg/json/JSONObject;

    if-eqz v0, :cond_11

    .line 395
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecord:Lorg/json/JSONObject;

    const-string v1, "runPlanRecordStructList"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    .line 397
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_a

    .line 398
    const/4 v8, 0x1

    .line 401
    :cond_a
    const/4 v10, 0x0

    :goto_4
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v10, v0, :cond_11

    .line 402
    invoke-virtual {v9, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "run_plan_record_id"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v11

    .line 405
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecordsStatistic:Landroid/util/SparseArray;

    invoke-virtual {v0, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lorg/json/JSONObject;

    .line 406
    new-instance v13, Lorg/json/JSONArray;

    invoke-direct {v13}, Lorg/json/JSONArray;-><init>()V

    .line 407
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutDetailData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_5
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lorg/json/JSONObject;

    .line 408
    const-string v0, "workout_record_id"

    invoke-virtual {v15, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-ne v11, v0, :cond_b

    .line 409
    invoke-virtual {v13, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 411
    :cond_b
    goto :goto_5

    .line 413
    :cond_c
    new-instance v14, Lorg/json/JSONArray;

    invoke-direct {v14}, Lorg/json/JSONArray;-><init>()V

    .line 414
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutRecordPaceMapList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_6
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lorg/json/JSONObject;

    .line 415
    const-string v0, "workout_record_id"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-ne v11, v0, :cond_d

    .line 416
    move-object/from16 v0, v16

    invoke-virtual {v14, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 418
    :cond_d
    goto :goto_6

    .line 420
    :cond_e
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz=========runplan_workout_id:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "run_plan_workout_id"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz=========DetailData size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 422
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mapGPSRunPlan:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_f

    .line 423
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz=========mapGPSRunPlan size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mapGPSRunPlan:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 425
    :cond_f
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mSaveDataItemNum:I

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mSaveDataItemNum:I

    .line 427
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mapGPSWorkoutAndRunPlanType:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ljava/lang/Integer;

    .line 428
    const/16 v16, -0x1

    .line 429
    const/4 v0, 0x0

    if-eq v0, v15, :cond_10

    .line 430
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v16

    .line 432
    :cond_10
    move-object/from16 v0, p0

    move-object v1, v12

    move-object v2, v13

    invoke-virtual {v9, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "run_plan_workout_id"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mapGPSRunPlan:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    move/from16 v5, v16

    move-object v6, v14

    invoke-direct/range {v0 .. v6}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->saveDatatoTrack(Lorg/json/JSONObject;Lorg/json/JSONArray;ILjava/util/Map;ILorg/json/JSONArray;)V

    .line 401
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_4

    .line 435
    :cond_11
    if-nez v8, :cond_12

    if-eqz v7, :cond_13

    .line 436
    :cond_12
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->currentTime:J

    invoke-static {v0, v1}, Lo/ddn;->e(J)V

    .line 437
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateExerciseInsertTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-wide v3, v3, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->currentTime:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 441
    :cond_13
    goto :goto_7

    .line 439
    :catch_0
    move-exception v7

    .line 440
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    :goto_7
    return-void
.end method

.method private saveDatatoTrack(Lorg/json/JSONObject;Lorg/json/JSONArray;ILjava/util/Map;ILorg/json/JSONArray;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONObject;Lorg/json/JSONArray;ILjava/util/Map<Ljava/lang/Long;[D>;ILorg/json/JSONArray;)V"
        }
    .end annotation

    .line 447
    new-instance v5, Lcom/huawei/datatype/MotionPath;

    invoke-direct {v5}, Lcom/huawei/datatype/MotionPath;-><init>()V

    .line 449
    new-instance v6, Lcom/huawei/datatype/MotionPathSimplify;

    invoke-direct {v6}, Lcom/huawei/datatype/MotionPathSimplify;-><init>()V

    .line 451
    const/4 v0, 0x0

    move-object/from16 v1, p4

    if-eq v0, v1, :cond_0

    .line 452
    move-object/from16 v0, p4

    invoke-virtual {v5, v0}, Lcom/huawei/datatype/MotionPath;->setLbsDataMap(Ljava/util/Map;)V

    .line 455
    :cond_0
    const-string v0, "run_plan_record_info_exercise_duration"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    long-to-int v7, v0

    .line 456
    const/4 v0, 0x0

    move-object/from16 v1, p6

    if-eq v0, v1, :cond_1

    .line 457
    move-object/from16 v0, p6

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->changePaceMapStruct(Lorg/json/JSONArray;I)Ljava/util/Map;

    move-result-object v8

    .line 458
    invoke-virtual {v5, v8}, Lcom/huawei/datatype/MotionPath;->setPaceMap(Ljava/util/Map;)V

    .line 459
    invoke-virtual {v6, v8}, Lcom/huawei/datatype/MotionPathSimplify;->setPaceMap(Ljava/util/Map;)V

    .line 460
    move-object/from16 v0, p6

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->changePaceMapStruct(Lorg/json/JSONArray;I)Ljava/util/Map;

    move-result-object v9

    .line 461
    invoke-virtual {v5, v9}, Lcom/huawei/datatype/MotionPath;->setBritishPaceMap(Ljava/util/Map;)V

    .line 462
    invoke-virtual {v6, v9}, Lcom/huawei/datatype/MotionPathSimplify;->setBritishPaceMap(Ljava/util/Map;)V

    .line 464
    div-int/lit16 v0, v7, 0x3e8

    move-object/from16 v1, p6

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->changePartTimePaceMapStruct(Lorg/json/JSONArray;II)Ljava/util/Map;

    move-result-object v10

    .line 465
    invoke-virtual {v6, v10}, Lcom/huawei/datatype/MotionPathSimplify;->setPartTimeMap(Ljava/util/Map;)V

    .line 466
    div-int/lit16 v0, v7, 0x3e8

    move-object/from16 v1, p6

    const/4 v2, 0x1

    invoke-direct {p0, v1, v2, v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->changePartTimePaceMapStruct(Lorg/json/JSONArray;II)Ljava/util/Map;

    move-result-object v11

    .line 467
    invoke-virtual {v6, v11}, Lcom/huawei/datatype/MotionPathSimplify;->setBritishPartTimeMap(Ljava/util/Map;)V

    .line 471
    :cond_1
    const-string v0, "run_plan_record_info_step"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalSteps(I)V

    .line 473
    int-to-long v0, v7

    invoke-virtual {v6, v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalTime(J)V

    .line 476
    invoke-direct {p0, p2, v5, v6}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->packTrackData(Lorg/json/JSONArray;Lcom/huawei/datatype/MotionPath;Lcom/huawei/datatype/MotionPathSimplify;)V

    .line 478
    new-instance v8, Lcom/huawei/datatype/WorkoutDisplayInfo;

    invoke-direct {v8}, Lcom/huawei/datatype/WorkoutDisplayInfo;-><init>()V

    .line 479
    const/4 v0, 0x1

    move-object/from16 v1, p4

    invoke-direct {p0, v0, v1, v8}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->checkWorkoutDisplayInfo(ILjava/util/Map;Lcom/huawei/datatype/WorkoutDisplayInfo;)V

    .line 480
    invoke-virtual {v8}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getChiefSportDataType()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setChiefSportDataType(I)V

    .line 481
    invoke-virtual {v8}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getFreeMotion()Z

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setIsFreeMotion(Z)V

    .line 482
    invoke-virtual {v8}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getWorkoutType()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setSportType(I)V

    .line 483
    invoke-virtual {v8}, Lcom/huawei/datatype/WorkoutDisplayInfo;->isHasTrackPoint()Z

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setHasTrackPoint(Z)V

    .line 484
    invoke-virtual {v8}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getSportDataSource()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setSportDataSource(I)V

    .line 487
    const-string v0, "run_plan_record_info_start_time"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setStartTime(J)V

    .line 488
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========startTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_start_time"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    const-string v0, "run_plan_record_info_end_time"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setEndTime(J)V

    .line 491
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========endTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_end_time"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 493
    const-string v0, "run_plan_record_info_HrABS_max"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setMaxHeartRate(I)V

    .line 495
    const-string v0, "run_plan_record_info_HrABS_min"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setMinHeartRate(I)V

    .line 497
    const-string v0, "run_plan_record_info_distance"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalDistance(I)V

    .line 499
    const-string v0, "run_plan_record_info_calorie"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalCalories(I)V

    .line 502
    const-string v0, "run_plan_record_info_climb"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setCreepingWave(F)V

    .line 505
    const-string v0, "run_plan_record_info_distance"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 506
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========run record speed:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_speed"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgPace(F)V

    goto :goto_0

    .line 509
    :cond_2
    const-string v0, "run_plan_record_info_distance"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    const-string v1, "run_plan_record_info_exercise_duration"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float v0, v1, v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgPace(F)V

    .line 512
    :goto_0
    const-string v0, "run_plan_record_info_step"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    int-to-float v0, v0

    const-string v1, "run_plan_record_info_exercise_duration"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgStepRate(I)V

    .line 517
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 518
    const-string v0, "record_id"

    const-string v1, "run_plan_record_info_id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 519
    const-string v0, "status"

    const-string v1, "run_plan_record_info_status"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    const-string v0, "load_peak"

    const-string v1, "run_plan_record_info_load_peak"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 521
    const-string v0, "etraining_effect"

    const-string v1, "run_plan_record_info_etraining_effect"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    const-string v0, "extra_poc"

    const-string v1, "run_plan_record_info_Epoc"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 523
    const-string v0, "max_met"

    const-string v1, "run_plan_record_info_maxMET"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 524
    const-string v0, "recovery_time"

    const-string v1, "run_plan_record_info_recovery_time"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 525
    const-string v0, "achieve_percent"

    const-string v1, "run_plan_record_info_achieve_percent"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 526
    invoke-virtual {v6, v9}, Lcom/huawei/datatype/MotionPathSimplify;->setSportData(Ljava/util/Map;)V

    .line 527
    invoke-virtual {v6, v9}, Lcom/huawei/datatype/MotionPathSimplify;->setSportData(Ljava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 530
    goto :goto_1

    .line 528
    :catch_0
    move-exception v7

    .line 529
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    :goto_1
    invoke-direct {p0, v6, v5}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->saveTrackData(Lcom/huawei/datatype/MotionPathSimplify;Lcom/huawei/datatype/MotionPath;)I

    .line 536
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save runPlan Record DatatoTrack finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 538
    return-void
.end method

.method private saveDatatoTrack(Lorg/json/JSONObject;Lorg/json/JSONArray;Ljava/util/Map;ILorg/json/JSONArray;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONObject;Lorg/json/JSONArray;Ljava/util/Map<Ljava/lang/Long;[D>;ILorg/json/JSONArray;)V"
        }
    .end annotation

    .line 884
    new-instance v5, Lcom/huawei/datatype/MotionPath;

    invoke-direct {v5}, Lcom/huawei/datatype/MotionPath;-><init>()V

    .line 885
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    .line 886
    invoke-virtual {v5, p3}, Lcom/huawei/datatype/MotionPath;->setLbsDataMap(Ljava/util/Map;)V

    .line 889
    :cond_0
    new-instance v6, Lcom/huawei/datatype/MotionPathSimplify;

    invoke-direct {v6}, Lcom/huawei/datatype/MotionPathSimplify;-><init>()V

    .line 891
    const-string v0, "workout_exercise_duration"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    long-to-int v7, v0

    .line 892
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_1

    .line 893
    move-object/from16 v0, p5

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->changePaceMapStruct(Lorg/json/JSONArray;I)Ljava/util/Map;

    move-result-object v8

    .line 894
    invoke-virtual {v5, v8}, Lcom/huawei/datatype/MotionPath;->setPaceMap(Ljava/util/Map;)V

    .line 895
    invoke-virtual {v6, v8}, Lcom/huawei/datatype/MotionPathSimplify;->setPaceMap(Ljava/util/Map;)V

    .line 896
    move-object/from16 v0, p5

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->changePaceMapStruct(Lorg/json/JSONArray;I)Ljava/util/Map;

    move-result-object v9

    .line 897
    invoke-virtual {v5, v9}, Lcom/huawei/datatype/MotionPath;->setBritishPaceMap(Ljava/util/Map;)V

    .line 898
    invoke-virtual {v6, v9}, Lcom/huawei/datatype/MotionPathSimplify;->setBritishPaceMap(Ljava/util/Map;)V

    .line 900
    div-int/lit16 v0, v7, 0x3e8

    move-object/from16 v1, p5

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->changePartTimePaceMapStruct(Lorg/json/JSONArray;II)Ljava/util/Map;

    move-result-object v10

    .line 901
    invoke-virtual {v6, v10}, Lcom/huawei/datatype/MotionPathSimplify;->setPartTimeMap(Ljava/util/Map;)V

    .line 902
    div-int/lit16 v0, v7, 0x3e8

    move-object/from16 v1, p5

    const/4 v2, 0x1

    invoke-direct {p0, v1, v2, v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->changePartTimePaceMapStruct(Lorg/json/JSONArray;II)Ljava/util/Map;

    move-result-object v11

    .line 903
    invoke-virtual {v6, v11}, Lcom/huawei/datatype/MotionPathSimplify;->setBritishPartTimeMap(Ljava/util/Map;)V

    .line 908
    :cond_1
    int-to-long v0, v7

    invoke-virtual {v6, v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalTime(J)V

    .line 910
    const-string v0, "workout_record_step"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalSteps(I)V

    .line 912
    invoke-direct {p0, p2, v5, v6}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->packTrackData(Lorg/json/JSONArray;Lcom/huawei/datatype/MotionPath;Lcom/huawei/datatype/MotionPathSimplify;)V

    .line 914
    new-instance v8, Lcom/huawei/datatype/WorkoutDisplayInfo;

    invoke-direct {v8}, Lcom/huawei/datatype/WorkoutDisplayInfo;-><init>()V

    .line 915
    const-string v0, "workout_type"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0, v0, p3, v8}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->checkWorkoutDisplayInfo(ILjava/util/Map;Lcom/huawei/datatype/WorkoutDisplayInfo;)V

    .line 916
    invoke-virtual {v8}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getChiefSportDataType()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setChiefSportDataType(I)V

    .line 917
    invoke-virtual {v8}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getFreeMotion()Z

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setIsFreeMotion(Z)V

    .line 918
    invoke-virtual {v8}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getWorkoutType()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setSportType(I)V

    .line 919
    invoke-virtual {v8}, Lcom/huawei/datatype/WorkoutDisplayInfo;->isHasTrackPoint()Z

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setHasTrackPoint(Z)V

    .line 921
    invoke-virtual {v8}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getSportDataSource()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setSportDataSource(I)V

    .line 922
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========workout_type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getWorkoutType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 924
    const-string v0, "workout_record_start_time"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setStartTime(J)V

    .line 925
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========startTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_start_time"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 927
    const-string v0, "workout_record_end_time"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setEndTime(J)V

    .line 928
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========endTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_end_time"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 930
    const-string v0, "workout_HrABS_peak_max"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setMaxHeartRate(I)V

    .line 932
    const-string v0, "workout_HrABS_peak_min"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setMinHeartRate(I)V

    .line 934
    const-string v0, "workout_record_distance"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalDistance(I)V

    .line 936
    const-string v0, "workout_record_calorie"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalCalories(I)V

    .line 938
    const-string v0, "workout_exercise_duration"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalTime(J)V

    .line 939
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========exercise_duration:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_exercise_duration"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 941
    const-string v0, "workout_climb"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-float v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setCreepingWave(F)V

    .line 943
    const-string v0, "workout_record_step"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalSteps(I)V

    .line 945
    const-string v0, "workout_record_distance"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 946
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========record speed:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_speed"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 947
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgPace(F)V

    goto :goto_0

    .line 949
    :cond_2
    const-string v0, "workout_record_distance"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    const-string v1, "workout_exercise_duration"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    long-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float v0, v1, v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgPace(F)V

    .line 952
    :goto_0
    const-string v0, "workout_record_step"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    int-to-float v0, v0

    const-string v1, "workout_exercise_duration"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    long-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgStepRate(I)V

    .line 955
    invoke-virtual {v8}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getWorkoutType()I

    move-result v0

    const/16 v1, 0x106

    if-eq v1, v0, :cond_3

    .line 956
    invoke-virtual {v8}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getWorkoutType()I

    move-result v0

    const/16 v1, 0x10a

    if-ne v1, v0, :cond_6

    .line 958
    :cond_3
    const-string v0, "workout_record_speed"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 959
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, speed:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 960
    const/4 v0, 0x0

    if-eq v0, v9, :cond_4

    .line 961
    int-to-float v0, v9

    const v1, 0x461c4000    # 10000.0f

    div-float v10, v1, v0

    .line 962
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, speed_float:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 963
    invoke-virtual {v6, v10}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgPace(F)V

    .line 964
    goto :goto_1

    .line 965
    :cond_4
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, speed:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 966
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgPace(F)V

    .line 970
    :goto_1
    const-string v0, "workout_record_distance"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 971
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, distance_swim:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 972
    const/4 v0, 0x0

    if-ne v0, v10, :cond_5

    .line 973
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setChiefSportDataType(I)V

    goto :goto_2

    .line 975
    :cond_5
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setChiefSportDataType(I)V

    .line 982
    :cond_6
    :goto_2
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 984
    const-string v0, "record_id"

    const-string v1, "workout_record_id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 985
    const-string v0, "status"

    const-string v1, "workout_record_status"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 986
    const-string v0, "load_peak"

    const-string v1, "workout_load_peak"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 987
    const-string v0, "etraining_effect"

    const-string v1, "workout_etraining_effect"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 988
    const-string v0, "extra_poc"

    const-string v1, "workout_Epoc"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 989
    const-string v0, "max_met"

    const-string v1, "workout_maxMET"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 990
    const-string v0, "recovery_time"

    const-string v1, "workout_recovery_time"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 992
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, swim_type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_type"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 993
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, swim_pull_times:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_pull_times"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 994
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, swim_pull_rate:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_pull_rate"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 995
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, swim_pool_length:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_pool_length"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 996
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, swim_trip_times:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_trip_times"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 997
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, swim_avg_swolf:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_avg_swolf"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 999
    const-string v0, "swim_type"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_7

    .line 1000
    const-string v0, "swim_stroke"

    const-string v1, "swim_type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1003
    :cond_7
    const-string v0, "swim_pull_times"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_8

    .line 1004
    const-string v0, "swim_pull_times"

    const-string v1, "swim_pull_times"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1006
    :cond_8
    const-string v0, "swim_pull_rate"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_9

    .line 1007
    const-string v0, "swim_pull_freq"

    const-string v1, "swim_pull_rate"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1010
    :cond_9
    const-string v0, "swim_pool_length"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_a

    .line 1011
    const-string v0, "swim_pool_length"

    const-string v1, "swim_pool_length"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1013
    :cond_a
    const-string v0, "swim_trip_times"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_b

    .line 1014
    const-string v0, "swim_laps"

    const-string v1, "swim_trip_times"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1016
    :cond_b
    const-string v0, "swim_avg_swolf"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_c

    .line 1017
    const-string v0, "swim_avg_swolf"

    const-string v1, "swim_avg_swolf"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1020
    :cond_c
    invoke-virtual {v6, v9}, Lcom/huawei/datatype/MotionPathSimplify;->setSportData(Ljava/util/Map;)V

    .line 1026
    invoke-direct {p0, v6, v5}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->saveTrackData(Lcom/huawei/datatype/MotionPathSimplify;Lcom/huawei/datatype/MotionPath;)I

    .line 1028
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save workout Record DatatoTrack finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1031
    goto :goto_3

    .line 1029
    :catch_0
    move-exception v7

    .line 1030
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JSONException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1032
    :goto_3
    return-void
.end method

.method private saveTrackData(Lcom/huawei/datatype/MotionPathSimplify;Lcom/huawei/datatype/MotionPath;)I
    .locals 6

    .line 541
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackData MotionPath is enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 543
    new-instance v4, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 544
    invoke-static {p1, p2, v4}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->convertHealthTrackDataToHiData(Lcom/huawei/datatype/MotionPathSimplify;Lcom/huawei/datatype/MotionPath;Lcom/huawei/hihealth/HiDataInsertOption;)V

    .line 545
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 546
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 547
    invoke-static {v5}, Lo/fju;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 549
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$2;

    invoke-direct {v1, p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$2;-><init>(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 564
    const/4 v0, 0x1

    return v0
.end method

.method private setLastSyncTime(J)V
    .locals 5

    .line 270
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setLastSyncTime time="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    new-instance v4, Lcom/huawei/hwservicesmgr/remote/LastSyncTimeStampDB;

    invoke-direct {v4}, Lcom/huawei/hwservicesmgr/remote/LastSyncTimeStampDB;-><init>()V

    .line 272
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mManager:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getCurrDeviceId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1, p1, p2}, Lcom/huawei/hwservicesmgr/remote/LastSyncTimeStampDB;->setLastTimeStamp(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Ljava/lang/String;J)V

    .line 273
    return-void
.end method

.method private syncRunPlanDetailData(Lorg/json/JSONObject;)V
    .locals 9

    .line 2207
    const-string v0, "runPlanRecordStructList"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 2209
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 2210
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 2212
    const/4 v7, 0x0

    :goto_1
    const-string v0, "run_plan_index_count"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-ge v7, v0, :cond_0

    .line 2213
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 2214
    const-string v0, "workout_record_id"

    const-string v1, "run_plan_record_id"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2215
    const-string v0, "workout_data_index"

    invoke-virtual {v8, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 2216
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutData:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2212
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 2209
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 2221
    :cond_1
    goto :goto_2

    .line 2219
    :catch_0
    move-exception v4

    .line 2220
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2222
    :goto_2
    return-void
.end method

.method private syncWorkoutDetailData(Lorg/json/JSONObject;)V
    .locals 9

    .line 2182
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 2183
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncWorkoutDetailData wr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2184
    return-void

    .line 2186
    :cond_0
    const-string v0, "workoutRecordStructList"

    :try_start_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 2188
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 2189
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 2191
    const/4 v7, 0x0

    :goto_1
    const-string v0, "workout_index_count"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 2192
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 2193
    const-string v0, "workout_record_id"

    const-string v1, "workout_record_id"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2194
    const-string v0, "workout_data_index"

    invoke-virtual {v8, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 2195
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lstWorkoutData:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 2191
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 2188
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 2200
    :cond_2
    goto :goto_2

    .line 2198
    :catch_0
    move-exception v4

    .line 2199
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2201
    :goto_2
    return-void
.end method

.method private testRunPlanRecordInfoDebug()V
    .locals 6

    .line 1844
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "testRunPlanRecordInfoDebug enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1846
    const/4 v4, 0x0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecordsStatistic:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 1847
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mRunPlanRecordsStatistic:Landroid/util/SparseArray;

    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lorg/json/JSONObject;

    .line 1848
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "workout id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_id"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",workout statuc="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_status"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",startime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_start_time"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",endtime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_end_time"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1849
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calorie="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_calorie"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",distance="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_distance"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",step="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_step"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",time="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_total_time"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",speed="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_speed"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",climb="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_climb"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1850
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HrMax="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_HrABS_max"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",HrMin="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_HrABS_min"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",loadPeak="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_load_peak"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",effect="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_etraining_effect"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",epoc="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_Epoc"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1851
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MET="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_maxMET"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", finishRate="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_achieve_percent"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",revoeryTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_recovery_time"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",duration="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_exercise_duration"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",date="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_date_info"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1852
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==zz=totalTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_total_time"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1846
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 1856
    :cond_0
    goto :goto_1

    .line 1854
    :catch_0
    move-exception v4

    .line 1855
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1858
    :goto_1
    return-void
.end method


# virtual methods
.method public getResult([B)V
    .locals 24

    .line 1339
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWExerciseAdviceManager getResult(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static/range {p1 .. p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1340
    invoke-static/range {p1 .. p1}, Lo/daz;->c([B)Z

    move-result v0

    if-nez v0, :cond_19

    .line 1341
    invoke-static/range {p1 .. p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 1342
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v1, v0, :cond_18

    .line 1343
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 1345
    :try_start_0
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    invoke-virtual {v0, v4}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v5

    .line 1346
    invoke-virtual {v5}, Lo/dba;->a()Ljava/util/List;

    move-result-object v6

    .line 1347
    invoke-virtual {v5}, Lo/dba;->d()Ljava/util/List;

    move-result-object v7

    .line 1348
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1d

    .line 1350
    :pswitch_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_1

    .line 1351
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_1

    .line 1352
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanParameterCallbackList()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_1

    .line 1353
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->runPlanParameterCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1354
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 1355
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->runPlanParameterCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getRunPlanParameterforhealth"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v9, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1356
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->runPlanParameterCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1358
    :cond_0
    monitor-exit v8

    goto :goto_0

    :catchall_0
    move-exception v10

    monitor-exit v8

    :try_start_2
    throw v10

    .line 1359
    :goto_0
    goto/16 :goto_1d

    .line 1362
    :cond_1
    new-instance v8, Lcom/huawei/datatype/RunPlanParameter;

    invoke-direct {v8}, Lcom/huawei/datatype/RunPlanParameter;-><init>()V

    .line 1363
    if-eqz v7, :cond_3

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 1364
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 1365
    invoke-virtual {v10}, Lo/dba;->a()Ljava/util/List;

    move-result-object v11

    .line 1366
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/daw;

    .line 1367
    invoke-virtual {v13}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_1

    goto :goto_3

    .line 1369
    :pswitch_1
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/RunPlanParameter;->setRun_plan_total_sign(Ljava/lang/String;)V

    .line 1370
    goto :goto_3

    .line 1373
    :pswitch_2
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/RunPlanParameter;->setRun_plan_sign(Ljava/lang/String;)V

    .line 1374
    goto :goto_3

    .line 1377
    :pswitch_3
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/RunPlanParameter;->setRun_plan_algorithm_type(I)V

    .line 1378
    goto :goto_3

    .line 1381
    :pswitch_4
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/RunPlanParameter;->setRun_plan_algorithm_version(Ljava/lang/String;)V

    .line 1382
    goto :goto_3

    .line 1385
    :pswitch_5
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/RunPlanParameter;->setRun_plan_sync_size(I)V

    .line 1386
    .line 1392
    :goto_3
    goto/16 :goto_2

    .line 1393
    :cond_2
    goto/16 :goto_1

    .line 1396
    :cond_3
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanParameterCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_2
    .catch Lo/day; {:try_start_2 .. :try_end_2} :catch_1

    .line 1397
    :try_start_3
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->runPlanParameterCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1398
    invoke-virtual {v8}, Lcom/huawei/datatype/RunPlanParameter;->getRun_plan_sync_size()I

    move-result v10

    .line 1399
    div-int/lit16 v11, v10, 0x100

    .line 1400
    rem-int/lit16 v12, v10, 0x100

    .line 1401
    invoke-virtual {v8, v11}, Lcom/huawei/datatype/RunPlanParameter;->setRun_plan_sync_size_pre(I)V

    .line 1402
    invoke-virtual {v8, v12}, Lcom/huawei/datatype/RunPlanParameter;->setRun_plan_sync_size_sub(I)V

    .line 1403
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->runPlanParameterCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getRunPlanParameterforhealth"

    invoke-static {v8, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1404
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->runPlanParameterCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1406
    :cond_4
    monitor-exit v9

    goto :goto_4

    :catchall_1
    move-exception v14

    monitor-exit v9

    :try_start_4
    throw v14

    .line 1407
    :goto_4
    goto/16 :goto_1d

    .line 1410
    :pswitch_6
    const/4 v8, 0x0

    .line 1411
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/daw;

    .line 1412
    invoke-virtual {v10}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_6

    .line 1414
    :sswitch_0
    invoke-virtual {v10}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v8

    .line 1415
    .line 1420
    :goto_6
    goto :goto_5

    .line 1421
    :cond_5
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getSetRunPlanCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_4
    .catch Lo/day; {:try_start_4 .. :try_end_4} :catch_1

    .line 1422
    :try_start_5
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->setRunPlanCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 1423
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->setRunPlanCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "setRunPlan"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v8, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1424
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->setRunPlanCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1426
    :cond_6
    monitor-exit v9

    goto :goto_7

    :catchall_2
    move-exception v15

    monitor-exit v9

    :try_start_6
    throw v15

    .line 1427
    :goto_7
    goto/16 :goto_1d

    .line 1430
    :pswitch_7
    const/4 v8, 0x0

    .line 1431
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/daw;

    .line 1432
    invoke-virtual {v10}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_9

    .line 1434
    :sswitch_1
    invoke-virtual {v10}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v8

    .line 1435
    .line 1440
    :goto_9
    goto :goto_8

    .line 1441
    :cond_7
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getSetRunPlanReminderSwitchCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_6
    .catch Lo/day; {:try_start_6 .. :try_end_6} :catch_1

    .line 1442
    :try_start_7
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->setRunPlanReminderSwitchCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 1443
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->setRunPlanReminderSwitchCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "setRunPlanReminderSwitch"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v8, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1444
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->setRunPlanReminderSwitchCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 1446
    :cond_8
    monitor-exit v9

    goto :goto_a

    :catchall_3
    move-exception v16

    monitor-exit v9

    :try_start_8
    throw v16

    .line 1447
    :goto_a
    goto/16 :goto_1d

    .line 1450
    :pswitch_8
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_a

    .line 1451
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_a

    .line 1452
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getGetRunPlanRecordCallbackList()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8
    :try_end_8
    .catch Lo/day; {:try_start_8 .. :try_end_8} :catch_1

    .line 1453
    :try_start_9
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 1454
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 1455
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getRunPlanRecord"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v9, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1456
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 1458
    :cond_9
    monitor-exit v8

    goto :goto_b

    :catchall_4
    move-exception v17

    monitor-exit v8

    :try_start_a
    throw v17

    .line 1459
    :goto_b
    goto/16 :goto_1d

    .line 1462
    :cond_a
    new-instance v8, Lcom/huawei/datatype/RunPlanRecord;

    invoke-direct {v8}, Lcom/huawei/datatype/RunPlanRecord;-><init>()V

    .line 1463
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1464
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dba;

    .line 1465
    invoke-virtual {v11}, Lo/dba;->a()Ljava/util/List;

    move-result-object v12

    .line 1466
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_d
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/daw;

    .line 1467
    invoke-virtual {v14}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_2

    goto :goto_e

    .line 1469
    :sswitch_2
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/RunPlanRecord;->setRun_plan_record_count(I)V

    .line 1470
    .line 1476
    :goto_e
    goto :goto_d

    .line 1477
    :cond_b
    invoke-virtual {v11}, Lo/dba;->d()Ljava/util/List;

    move-result-object v13

    .line 1478
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_f
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/dba;

    .line 1479
    new-instance v16, Lcom/huawei/datatype/RunPlanRecordStruct;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/datatype/RunPlanRecordStruct;-><init>()V

    .line 1480
    invoke-virtual {v15}, Lo/dba;->a()Ljava/util/List;

    move-result-object v17

    .line 1481
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_10
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lo/daw;

    .line 1482
    invoke-virtual/range {v19 .. v19}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_2

    goto :goto_11

    .line 1484
    :pswitch_9
    invoke-virtual/range {v19 .. v19}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/RunPlanRecordStruct;->setRun_plan_workout_id(I)V

    .line 1485
    goto :goto_11

    .line 1488
    :pswitch_a
    invoke-virtual/range {v19 .. v19}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/RunPlanRecordStruct;->setRun_plan_record_id(I)V

    .line 1489
    goto :goto_11

    .line 1492
    :pswitch_b
    invoke-virtual/range {v19 .. v19}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/RunPlanRecordStruct;->setRun_plan_index_count(I)V

    .line 1493
    goto :goto_11

    .line 1496
    :pswitch_c
    invoke-virtual/range {v19 .. v19}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/RunPlanRecordStruct;->setPaceIndextCount(I)V

    .line 1497
    .line 1503
    :goto_11
    goto/16 :goto_10

    .line 1504
    :cond_c
    move-object/from16 v0, v16

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1505
    goto/16 :goto_f

    .line 1506
    :cond_d
    goto/16 :goto_c

    .line 1507
    :cond_e
    invoke-virtual {v8, v9}, Lcom/huawei/datatype/RunPlanRecord;->setRunPlanRecordStructList(Ljava/util/List;)V

    .line 1508
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getGetRunPlanRecordCallbackList()Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10
    :try_end_a
    .catch Lo/day; {:try_start_a .. :try_end_a} :catch_1

    .line 1509
    :try_start_b
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_f

    .line 1510
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getRunPlanRecord"

    invoke-static {v8, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1511
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 1513
    :cond_f
    monitor-exit v10

    goto :goto_12

    :catchall_5
    move-exception v20

    monitor-exit v10

    :try_start_c
    throw v20

    .line 1514
    :goto_12
    goto/16 :goto_1d

    .line 1517
    :pswitch_d
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_11

    .line 1518
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_11

    .line 1519
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getGetRunPlanRecordInfoCallbackList()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8
    :try_end_c
    .catch Lo/day; {:try_start_c .. :try_end_c} :catch_1

    .line 1520
    :try_start_d
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_10

    .line 1521
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 1522
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getRunPlanRecordInfo"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v9, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1523
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 1525
    :cond_10
    monitor-exit v8

    goto :goto_13

    :catchall_6
    move-exception v21

    monitor-exit v8

    :try_start_e
    throw v21

    .line 1526
    :goto_13
    goto/16 :goto_1d

    .line 1529
    :cond_11
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1530
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_14
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 1531
    invoke-virtual {v10}, Lo/dba;->a()Ljava/util/List;

    move-result-object v11

    .line 1532
    new-instance v12, Lcom/huawei/datatype/RunPlanRecordInfo;

    invoke-direct {v12}, Lcom/huawei/datatype/RunPlanRecordInfo;-><init>()V

    .line 1533
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_15
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/daw;

    .line 1534
    invoke-virtual {v14}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_3

    goto/16 :goto_16

    .line 1536
    :pswitch_e
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_id(I)V

    .line 1537
    goto/16 :goto_16

    .line 1540
    :pswitch_f
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_status(I)V

    .line 1541
    goto/16 :goto_16

    .line 1544
    :pswitch_10
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v12, v0, v1}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_start_time(J)V

    .line 1545
    goto/16 :goto_16

    .line 1548
    :pswitch_11
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v12, v0, v1}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_end_time(J)V

    .line 1549
    goto/16 :goto_16

    .line 1552
    :pswitch_12
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_calorie(I)V

    .line 1553
    goto/16 :goto_16

    .line 1556
    :pswitch_13
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_distance(I)V

    .line 1557
    goto/16 :goto_16

    .line 1560
    :pswitch_14
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_step(I)V

    .line 1561
    goto/16 :goto_16

    .line 1564
    :pswitch_15
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_total_time(I)V

    .line 1565
    goto/16 :goto_16

    .line 1568
    :pswitch_16
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_speed(F)V

    .line 1569
    goto/16 :goto_16

    .line 1572
    :pswitch_17
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_climb(I)V

    .line 1573
    goto/16 :goto_16

    .line 1576
    :pswitch_18
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_HrABS_min(I)V

    .line 1577
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_HrABS_max(I)V

    .line 1578
    goto/16 :goto_16

    .line 1581
    :pswitch_19
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_load_peak(I)V

    .line 1582
    goto/16 :goto_16

    .line 1585
    :pswitch_1a
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_etraining_effect(I)V

    .line 1586
    goto :goto_16

    .line 1589
    :pswitch_1b
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_achieve_percent(I)V

    .line 1590
    goto :goto_16

    .line 1593
    :pswitch_1c
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_Epoc(I)V

    .line 1594
    goto :goto_16

    .line 1597
    :pswitch_1d
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_maxMET(I)V

    .line 1598
    goto :goto_16

    .line 1601
    :pswitch_1e
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_recovery_time(I)V

    .line 1602
    goto :goto_16

    .line 1606
    :pswitch_1f
    goto :goto_16

    .line 1609
    :pswitch_20
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    invoke-virtual {v12, v0, v1}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_exercise_duration(J)V

    .line 1610
    goto :goto_16

    .line 1613
    :pswitch_21
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_date_info(I)V

    .line 1614
    .line 1620
    :goto_16
    goto/16 :goto_15

    .line 1621
    :cond_12
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1622
    goto/16 :goto_14

    .line 1623
    :cond_13
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getGetRunPlanRecordInfoCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_e
    .catch Lo/day; {:try_start_e .. :try_end_e} :catch_1

    .line 1624
    :try_start_f
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_14

    .line 1625
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getRunPlanRecordInfo"

    invoke-static {v8, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1627
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 1629
    :cond_14
    monitor-exit v9

    goto :goto_17

    :catchall_7
    move-exception v22

    monitor-exit v9

    :try_start_10
    throw v22

    .line 1630
    :goto_17
    goto/16 :goto_1d

    .line 1633
    :pswitch_22
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V
    :try_end_10
    .catch Lo/day; {:try_start_10 .. :try_end_10} :catch_1

    .line 1635
    :try_start_11
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_18
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 1636
    invoke-virtual {v10}, Lo/dba;->a()Ljava/util/List;

    move-result-object v11

    .line 1637
    new-instance v12, Lcom/huawei/datatype/RunPlanRecordInfo;

    invoke-direct {v12}, Lcom/huawei/datatype/RunPlanRecordInfo;-><init>()V

    .line 1638
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_19
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/daw;

    .line 1639
    invoke-virtual {v14}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_4

    goto/16 :goto_1a

    .line 1641
    :pswitch_23
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_wourkout_id(I)V

    .line 1642
    goto/16 :goto_1a

    .line 1645
    :pswitch_24
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_status(I)V

    .line 1646
    goto/16 :goto_1a

    .line 1649
    :pswitch_25
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v12, v0, v1}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_start_time(J)V

    .line 1650
    goto/16 :goto_1a

    .line 1653
    :pswitch_26
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v12, v0, v1}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_end_time(J)V

    .line 1654
    goto/16 :goto_1a

    .line 1657
    :pswitch_27
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_calorie(I)V

    .line 1658
    goto/16 :goto_1a

    .line 1661
    :pswitch_28
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_distance(I)V

    .line 1662
    goto/16 :goto_1a

    .line 1665
    :pswitch_29
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_step(I)V

    .line 1666
    goto/16 :goto_1a

    .line 1669
    :pswitch_2a
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_total_time(I)V

    .line 1670
    goto/16 :goto_1a

    .line 1673
    :pswitch_2b
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_speed(F)V

    .line 1674
    goto/16 :goto_1a

    .line 1677
    :pswitch_2c
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_climb(I)V

    .line 1678
    goto/16 :goto_1a

    .line 1681
    :pswitch_2d
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_HrABS_min(I)V

    .line 1682
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_HrABS_max(I)V

    .line 1683
    goto/16 :goto_1a

    .line 1686
    :pswitch_2e
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_load_peak(I)V

    .line 1687
    goto/16 :goto_1a

    .line 1690
    :pswitch_2f
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_etraining_effect(I)V

    .line 1691
    goto/16 :goto_1a

    .line 1694
    :pswitch_30
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_achieve_percent(I)V

    .line 1695
    goto :goto_1a

    .line 1698
    :pswitch_31
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_Epoc(I)V

    .line 1699
    goto :goto_1a

    .line 1702
    :pswitch_32
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_maxMET(I)V

    .line 1703
    goto :goto_1a

    .line 1706
    :pswitch_33
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_recovery_time(I)V

    .line 1707
    goto :goto_1a

    .line 1710
    :pswitch_34
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_daily_score(I)V

    .line 1711
    goto :goto_1a

    .line 1714
    :pswitch_35
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    invoke-virtual {v12, v0, v1}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_exercise_duration(J)V

    .line 1715
    goto :goto_1a

    .line 1718
    :pswitch_36
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_date_info(I)V

    .line 1719
    .line 1725
    :goto_1a
    goto/16 :goto_19

    .line 1726
    :cond_15
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_11
    .catch Ljava/lang/NumberFormatException; {:try_start_11 .. :try_end_11} :catch_0
    .catch Lo/day; {:try_start_11 .. :try_end_11} :catch_1

    .line 1727
    goto/16 :goto_18

    .line 1730
    :cond_16
    goto :goto_1b

    .line 1728
    :catch_0
    move-exception v9

    .line 1729
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x2

    :try_start_12
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NOTIFICATION_RUN_PLAN_RECORD_INFO"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1731
    :goto_1b
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getNotificationRunPlanRecordInfoCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_12
    .catch Lo/day; {:try_start_12 .. :try_end_12} :catch_1

    .line 1732
    :try_start_13
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->notificationRunPlanRecordInfoCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1733
    const-string v0, "registerNotificationRunPlanRecordInfoCallbackList"

    .line 1734
    invoke-static {v8, v0}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 1733
    const v1, 0x186a0

    invoke-interface {v11, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    .line 1735
    goto :goto_1c

    .line 1736
    :cond_17
    monitor-exit v9

    goto :goto_1d

    :catchall_8
    move-exception v23

    monitor-exit v9

    :try_start_14
    throw v23
    :try_end_14
    .catch Lo/day; {:try_start_14 .. :try_end_14} :catch_1

    .line 1737
    .line 1745
    :goto_1d
    goto :goto_1e

    .line 1743
    :catch_1
    move-exception v5

    .line 1744
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u63a5\u6536\u547d\u4ee4\u9519\u8bef e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1745
    goto :goto_1e

    .line 1747
    :cond_18
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u63a5\u6536\u547d\u4ee4\u9519\u8bef!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1750
    :cond_19
    :goto_1e
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_d
        :pswitch_22
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x7f -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x7f -> :sswitch_1
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x2 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x6
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
        :pswitch_20
        :pswitch_21
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x2
        :pswitch_23
        :pswitch_24
        :pswitch_25
        :pswitch_26
        :pswitch_27
        :pswitch_28
        :pswitch_29
        :pswitch_2a
        :pswitch_2b
        :pswitch_2c
        :pswitch_2d
        :pswitch_2e
        :pswitch_2f
        :pswitch_30
        :pswitch_31
        :pswitch_32
        :pswitch_33
        :pswitch_34
        :pswitch_35
        :pswitch_36
    .end packed-switch
.end method

.method public getRunPlanRecord(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1235
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 1236
    :try_start_0
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1237
    const/16 v0, 0x16

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1238
    const/4 v0, 0x4

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1239
    invoke-direct/range {p0 .. p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getAW70Identify()Ljava/lang/String;

    move-result-object v6

    .line 1240
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1241
    invoke-virtual {v5, v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 1245
    :cond_0
    const/16 v0, 0xc

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v7

    .line 1247
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 1249
    const-string v0, "startTime"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v9, v0

    .line 1251
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    shr-int/lit8 v1, v9, 0x18

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v9, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 1252
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v9, 0x8

    and-int/lit16 v1, v1, 0xff

    .line 1253
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    and-int/lit16 v1, v9, 0xff

    .line 1254
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 1256
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v11

    .line 1258
    const/4 v0, 0x3

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v12

    .line 1260
    const-string v0, "endTime"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v13, v0

    .line 1262
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    shr-int/lit8 v1, v13, 0x18

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v13, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 1263
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v13, 0x8

    and-int/lit16 v1, v1, 0xff

    .line 1264
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    and-int/lit16 v1, v13, 0xff

    .line 1265
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 1267
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v15

    .line 1269
    const/4 v0, 0x4

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v16

    .line 1272
    new-instance v17, Ljava/lang/StringBuilder;

    invoke-direct/range {v17 .. v17}, Ljava/lang/StringBuilder;-><init>()V

    .line 1273
    move-object/from16 v0, v17

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1274
    move-object/from16 v0, v17

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1275
    move-object/from16 v0, v17

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1276
    move-object/from16 v0, v17

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1277
    move-object/from16 v0, v17

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1278
    move-object/from16 v0, v17

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1279
    move-object/from16 v0, v17

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1280
    move-object/from16 v0, v17

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1282
    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 1283
    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 1285
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 1287
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getGetRunPlanRecordCallbackList()Ljava/lang/Object;

    move-result-object v18

    monitor-enter v18
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1288
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordCallbackList:Ljava/util/List;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1289
    monitor-exit v18

    goto :goto_0

    :catchall_0
    move-exception v19

    monitor-exit v18

    :try_start_2
    throw v19
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1290
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_1
    move-exception v20

    monitor-exit v4

    throw v20

    .line 1291
    :goto_1
    return-void
.end method

.method public getRunPlanRecordInfo(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1299
    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->lockObject:Ljava/lang/Object;

    monitor-enter v2

    .line 1300
    :try_start_0
    new-instance v3, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v3}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1301
    const/16 v0, 0x16

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1302
    const/4 v0, 0x5

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1303
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getAW70Identify()Ljava/lang/String;

    move-result-object v4

    .line 1304
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1305
    invoke-virtual {v3, v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 1309
    :cond_0
    const-string v0, "id"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 1311
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v6

    .line 1313
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 1316
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1318
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v9

    .line 1320
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v10

    .line 1322
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 1323
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1324
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1325
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1327
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 1328
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 1330
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v3}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 1332
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getGetRunPlanRecordInfoCallbackList()Ljava/lang/Object;

    move-result-object v12

    monitor-enter v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1333
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1334
    monitor-exit v12

    goto :goto_0

    :catchall_0
    move-exception v13

    monitor-exit v12

    :try_start_2
    throw v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1335
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_1
    move-exception v14

    monitor-exit v2

    throw v14

    .line 1336
    :goto_1
    return-void
.end method

.method public syncDeviceWorkoutRecordInfo(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 1758
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getDeviceSupportCapacity()V

    .line 1759
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$3;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$3;-><init>(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1819
    return-void
.end method
