.class public Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;
.super Lo/cwz;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwservicesmgr/remote/parser/IParser;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$SyncWorkoutBroadcastReceiver;,
        Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;,
        Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;,
        Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$HWExerciseAdviceMgrHandler;
    }
.end annotation


# static fields
.field public static final COM_HUAWEI_BONE:Ljava/lang/String; = "com.huawei.bone"

.field private static final DEV_HEART_RATE_TYPE_DEFAULT_TYPE:I = -0x1

.field private static final DEV_HEART_RATE_TYPE_MAX_TYPE:I = 0x0

.field private static final DEV_HEART_RATE_TYPE_REVERSE_TYPE:I = 0x1

.field private static final EIGHT_MINUTES_PACE:I = 0x1e0

.field private static final ERROR_DETAIL:I = 0x3

.field private static final ERROR_PACE:I = 0x4

.field private static final ERROR_SECTION:I = 0x2

.field private static final ERROR_STATISTIC:I = 0x1

.field private static final ERROR_TRACK:I = 0x5

.field private static final EXERCISEADVICE_BLUETOOTH_PINGPONG_TIMEOUT:I = 0x493e0

.field private static final EXERCISEADVICE_SYNC_DETAIL_TIMEOUT:I = 0x927c0

.field private static final EXERCISE_MGR_POOL_NUM:I = 0x5

.field private static final FIVE_MINUTES_PACE:I = 0x12c

.field private static final HEART_RATE_TYPE_DEFAULT_TYPE:I = 0x0

.field private static final HEART_RATE_TYPE_MAX_TYPE:I = 0x2

.field private static final HEART_RATE_TYPE_REVERSE_TYPE:I = 0x1

.field private static final HOUR:I = 0xe10

.field private static final MSG_EXERCISEADVICE_BT_DISCONNECTED:I = 0x1

.field private static final MSG_EXERCISEADVICE_DEVICE_STOP_APP_TRACK_CHECK:I = 0x4

.field private static final MSG_EXERCISEADVICE_ETE_REPORT_DELAYTIME:I = 0x1388

.field private static final MSG_EXERCISEADVICE_ETE_REPORT_TIMEOUT:I = 0x2

.field private static final MSG_EXERCISEADVICE_SYNC_DETAIL_TIMEOUT:I = 0x0

.field private static final MSG_GET_LOCATION_GPS:I = 0x3

.field private static final NINE_MINUTES_PACE:I = 0x21c

.field private static final OBTAIN_GPS_ERROR:I = -0x1

.field private static final ONE_DAY_SECOND:J = 0x5265c00L

.field private static final Object:Ljava/lang/Object;

.field private static final PLANSHAKEY:Ljava/lang/String; = "planshakey"

.field private static final RESULT_OK:I = 0x0

.field private static final SEVEN_DAY_SECOND:J = 0x240c8400L

.field private static final SEVEN_MINUTES_PACE:I = 0x1a4

.field private static final SIX_MINUTES_PACE:I = 0x168

.field private static final SWIM_AVG_SWOLF_DEFAULT:I = -0x1

.field private static final SWIM_POOL_LENGTH_DEFAULT:I = -0x1

.field private static final SWIM_PULL_RATE_DEFAULT:I = -0x1

.field private static final SWIM_PULL_TIMES_DEFAULT:I = -0x1

.field private static final SWIM_TRIP_TIMES_DEFAULT:I = -0x1

.field private static final SWIM_TYPE_DEFAULT:I = -0x1

.field private static final TAG:Ljava/lang/String; = "HWExerciseAdviceManager"

.field private static final TEN_DAY_SECOND:J = 0x337f9800L

.field public static final TRACK_RUN_CURRENT_TIME:Ljava/lang/String; = "track_run_curenttime"

.field public static final TRACK_RUN_PRE_TIME:Ljava/lang/String; = "track_run_pretime"

.field private static final TYPE_GAODE_MAP:I = 0x0

.field private static final TYPE_GOOGLE_MAP:I = 0x1

.field public static final WORKOUT_RECORD_SAVE_FINISH:Ljava/lang/String; = "com.huawei.health.workout_record_save_finish"

.field static deviceSportRemindCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback; = null

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

.field private static instance:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager; = null

.field private static mDevicePlanSha:Ljava/lang/String; = null

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

.field private deviceIndentify:Ljava/lang/String;

.field private getAdviceParamCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private gson:Lcom/google/gson/Gson;

.field private huid:Ljava/lang/String;

.field private iCallbackInterface:Lo/aau;

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

.field private lstSwimSectionIndex:Ljava/util/List;
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

.field private lstWorkoutRecordSectionMapList:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lorg/json/JSONArray;>;>;"
        }
    .end annotation
.end field

.field private mConnectStateChangedReceiver:Landroid/content/BroadcastReceiver;

.field private mContext:Landroid/content/Context;

.field private mDeviceStopAppTrackFlag:Z

.field private mDeviceSupportCapacity:Z

.field private mDeviceSupportPaceMap:Z

.field private mHWExerciseAdviceMgrHandler:Landroid/os/Handler;

.field private mHandlerThread:Landroid/os/HandlerThread;

.field private mIsUsingETE:Z

.field private mPlanSha:Ljava/lang/String;

.field private mRunPlanETEResultFlag:Z

.field private mRunPlanExecuteState:I

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

.field private mSectionListdStatisticIndex:I

.field private mSectionRecordsStatisticJsonObjects:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lorg/json/JSONArray;>;"
        }
    .end annotation
.end field

.field private mSyncPlanSize:[I

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

.field private mplanID:Ljava/lang/String;

.field private notificationGPSParaEnable:Z

.field private sectionIndex:I

.field private succeedRecordMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lo/dkg;>;>;"
        }
    .end annotation
.end field

.field private syncObject:Ljava/lang/Object;

.field private workOutCallback:Lo/djs;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 171
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->runPlanParameterCallbackList:Ljava/util/List;

    .line 172
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->setRunPlanCallbackList:Ljava/util/List;

    .line 173
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->setRunPlanReminderSwitchCallbackList:Ljava/util/List;

    .line 174
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordCallbackList:Ljava/util/List;

    .line 175
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;

    .line 176
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notificationRunPlanRecordInfoCallbackList:Ljava/util/List;

    .line 183
    const-string v0, ""

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDevicePlanSha:Ljava/lang/String;

    .line 272
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->Object:Ljava/lang/Object;

    .line 2865
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$4;

    invoke-direct {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$4;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->deviceSportRemindCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 309
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 181
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mPlanSha:Ljava/lang/String;

    .line 182
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mplanID:Ljava/lang/String;

    .line 188
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSyncPlanSize:[I

    .line 190
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDeviceSupportCapacity:Z

    .line 191
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDeviceSupportPaceMap:Z

    .line 194
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notificationGPSParaEnable:Z

    .line 198
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordsStatistic:Landroid/util/SparseArray;

    .line 199
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecordsStatistic:Landroid/util/SparseArray;

    .line 202
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutRecordSectionMapList:Ljava/util/Map;

    .line 206
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutDetailData:Ljava/util/List;

    .line 207
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutData:Ljava/util/List;

    .line 209
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstGPSWorkoutRecordID:Ljava/util/List;

    .line 210
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstGPSRunPlanRecordID:Ljava/util/List;

    .line 211
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstSwimSectionIndex:Ljava/util/List;

    .line 213
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutRecordPaceMapIDList:Ljava/util/List;

    .line 215
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutRecordPaceMapList:Ljava/util/List;

    .line 217
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mapGPSWorkout:Ljava/util/Map;

    .line 218
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mapGPSRunPlan:Ljava/util/Map;

    .line 220
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mapGPSWorkoutAndRunPlanType:Ljava/util/Map;

    .line 222
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSaveDataItemNum:I

    .line 223
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordStatisticIndex:I

    .line 224
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecordStatisticIndex:I

    .line 225
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSectionListdStatisticIndex:I

    .line 226
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->isDetailSyncing:Z

    .line 229
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mHandlerThread:Landroid/os/HandlerThread;

    .line 230
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->currentTime:J

    .line 231
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lastSyncTime:J

    .line 233
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->currDeviceId:Ljava/lang/String;

    .line 237
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanExecuteState:I

    .line 240
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanETEResultFlag:Z

    .line 246
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mIsUsingETE:Z

    .line 253
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDeviceStopAppTrackFlag:Z

    .line 257
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->deviceIndentify:Ljava/lang/String;

    .line 273
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lockObject:Ljava/lang/Object;

    .line 275
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->gson:Lcom/google/gson/Gson;

    .line 282
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->sectionIndex:I

    .line 284
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->syncObject:Ljava/lang/Object;

    .line 287
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->succeedRecordMap:Ljava/util/Map;

    .line 290
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->huid:Ljava/lang/String;

    .line 2793
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$3;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mConnectStateChangedReceiver:Landroid/content/BroadcastReceiver;

    .line 3821
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$13;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$13;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getAdviceParamCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 310
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mContext:Landroid/content/Context;

    .line 311
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->hwDeviceMgr:Lo/dea;

    .line 312
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->initDeviceInfo()V

    .line 313
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 314
    new-instance v4, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$SyncWorkoutBroadcastReceiver;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$SyncWorkoutBroadcastReceiver;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$1;)V

    .line 315
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 316
    const-string v0, "com.huawei.bone.action.FITNESS_DATA_DETAIL_SYNC"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 317
    const-string v0, "com.huawei.phoneservice.sync_workout_broadcast_action"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 318
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWExerciseAdviceManager to register broadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mContext:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v5, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 320
    return-void

    nop

    :array_0
    .array-data 4
        0x5
        0x7
    .end array-data
.end method

.method static synthetic access$100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;ILjava/lang/String;)V
    .locals 0

    .line 118
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notifyDetailSyncComplete(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Z
    .locals 1

    .line 118
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDeviceSupportCapacity:Z

    return v0
.end method

.method static synthetic access$1100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/lang/String;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->deviceIndentify:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1102(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->deviceIndentify:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$1200(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Z
    .locals 1

    .line 118
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mIsUsingETE:Z

    return v0
.end method

.method static synthetic access$1202(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Z)Z
    .locals 0

    .line 118
    iput-boolean p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mIsUsingETE:Z

    return p1
.end method

.method static synthetic access$1300(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I
    .locals 1

    .line 118
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanExecuteState:I

    return v0
.end method

.method static synthetic access$1402(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Z)Z
    .locals 0

    .line 118
    iput-boolean p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->isDetailSyncing:Z

    return p1
.end method

.method static synthetic access$1500()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 1

    .line 118
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V
    .locals 0

    .line 118
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notifyToSyncStressData()V

    return-void
.end method

.method static synthetic access$1700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)J
    .locals 2

    .line 118
    iget-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->currentTime:J

    return-wide v0
.end method

.method static synthetic access$1702(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;J)J
    .locals 0

    .line 118
    iput-wide p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->currentTime:J

    return-wide p1
.end method

.method static synthetic access$1802(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->huid:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$1900(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)J
    .locals 2

    .line 118
    iget-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lastSyncTime:J

    return-wide v0
.end method

.method static synthetic access$1902(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;J)J
    .locals 0

    .line 118
    iput-wide p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lastSyncTime:J

    return-wide p1
.end method

.method static synthetic access$200(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V
    .locals 0

    .line 118
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->btDisconnectMsgProcess()V

    return-void
.end method

.method static synthetic access$2000(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)J
    .locals 2

    .line 118
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getLastSyncTime()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic access$2100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutRecordPaceMapIDList:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$2200(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/Map;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutRecordSectionMapList:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$2300(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Lorg/json/JSONObject;)V
    .locals 0

    .line 118
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getDeviceWorkoutRecordIdList(Lorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic access$2400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 118
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRecordKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$2500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/Map;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->succeedRecordMap:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$2600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Landroid/util/SparseArray;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordsStatistic:Landroid/util/SparseArray;

    return-object v0
.end method

.method static synthetic access$2700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Landroid/util/SparseArray;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecordsStatistic:Landroid/util/SparseArray;

    return-object v0
.end method

.method static synthetic access$2800(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/Map;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mapGPSWorkoutAndRunPlanType:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$2900(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/Map;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mapGPSWorkout:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Z
    .locals 1

    .line 118
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDeviceStopAppTrackFlag:Z

    return v0
.end method

.method static synthetic access$3000(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutRecordPaceMapList:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$3100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0

    .line 118
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getPacePointForDistance(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method static synthetic access$3200(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;IILjava/lang/String;)V
    .locals 0

    .line 118
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notifySaveData(IILjava/lang/String;)V

    return-void
.end method

.method static synthetic access$3300(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I
    .locals 1

    .line 118
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordStatisticIndex:I

    return v0
.end method

.method static synthetic access$3302(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)I
    .locals 0

    .line 118
    iput p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordStatisticIndex:I

    return p1
.end method

.method static synthetic access$3308(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I
    .locals 2

    .line 118
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordStatisticIndex:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordStatisticIndex:I

    return v0
.end method

.method static synthetic access$3400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V
    .locals 0

    .line 118
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getDeviceWorkoutRecordStatistic(I)V

    return-void
.end method

.method static synthetic access$3500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;II)V
    .locals 0

    .line 118
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getWorkoutRecordPaceMap(II)V

    return-void
.end method

.method static synthetic access$3600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;II)V
    .locals 0

    .line 118
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getWorkOutDetailFromDevice(II)V

    return-void
.end method

.method static synthetic access$3700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstGPSRunPlanRecordID:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$3800(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/Map;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mapGPSRunPlan:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$3900(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstGPSWorkoutRecordID:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/lang/String;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->currDeviceId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$4000(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I
    .locals 1

    .line 118
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->sectionIndex:I

    return v0
.end method

.method static synthetic access$402(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->currDeviceId:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$4100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSectionRecordsStatisticJsonObjects:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$4102(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSectionRecordsStatisticJsonObjects:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$4200(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;III)V
    .locals 0

    .line 118
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getSectionList(III)V

    return-void
.end method

.method static synthetic access$4300(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;II)V
    .locals 0

    .line 118
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getDetailData(II)V

    return-void
.end method

.method static synthetic access$4400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I
    .locals 1

    .line 118
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSectionListdStatisticIndex:I

    return v0
.end method

.method static synthetic access$4408(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I
    .locals 2

    .line 118
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSectionListdStatisticIndex:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSectionListdStatisticIndex:I

    return v0
.end method

.method static synthetic access$4500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I
    .locals 1

    .line 118
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecordStatisticIndex:I

    return v0
.end method

.method static synthetic access$4502(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)I
    .locals 0

    .line 118
    iput p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecordStatisticIndex:I

    return p1
.end method

.method static synthetic access$4600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Lorg/json/JSONObject;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecord:Lorg/json/JSONObject;

    return-object v0
.end method

.method static synthetic access$4602(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecord:Lorg/json/JSONObject;

    return-object p1
.end method

.method static synthetic access$4700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;II)V
    .locals 0

    .line 118
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanDetailData(II)V

    return-void
.end method

.method static synthetic access$4800(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Lorg/json/JSONObject;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecord:Lorg/json/JSONObject;

    return-object v0
.end method

.method static synthetic access$4802(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecord:Lorg/json/JSONObject;

    return-object p1
.end method

.method static synthetic access$4900(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;II)V
    .locals 0

    .line 118
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getPaceIndexArray(II)V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V
    .locals 0

    .line 118
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->saveData(I)V

    return-void
.end method

.method static synthetic access$5000(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;ILorg/json/JSONObject;)V
    .locals 0

    .line 118
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getDeviceRunPlanRecordIdList(ILorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic access$5100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V
    .locals 0

    .line 118
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getDeviceRunPlanRecordStatistic(I)V

    return-void
.end method

.method static synthetic access$5200(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)[I
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSyncPlanSize:[I

    return-object v0
.end method

.method static synthetic access$5300()Ljava/lang/String;
    .locals 1

    .line 118
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDevicePlanSha:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$5302(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 118
    sput-object p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDevicePlanSha:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$5400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutDetailData:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$5500(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutData:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$5600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Lorg/json/JSONObject;I)V
    .locals 0

    .line 118
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getWorkoutDetailData(Lorg/json/JSONObject;I)V

    return-void
.end method

.method static synthetic access$5700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Z
    .locals 1

    .line 118
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDeviceSupportPaceMap:Z

    return v0
.end method

.method static synthetic access$600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I
    .locals 1

    .line 118
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSaveDataItemNum:I

    return v0
.end method

.method static synthetic access$610(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I
    .locals 2

    .line 118
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSaveDataItemNum:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSaveDataItemNum:I

    return v0
.end method

.method static synthetic access$700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Landroid/content/Context;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V
    .locals 0

    .line 118
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getDeviceSupportCapacity()V

    return-void
.end method

.method static synthetic access$900(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Landroid/os/Handler;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mHWExerciseAdviceMgrHandler:Landroid/os/Handler;

    return-object v0
.end method

.method private btDisconnectMsgProcess()V
    .locals 4

    .line 397
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notificationGPSParaEnable:Z

    if-eqz v0, :cond_0

    .line 398
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterLocationCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notificationGPSParaEnable:Z

    .line 405
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mIsUsingETE:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanExecuteState:I

    const/4 v1, 0x3

    if-eq v1, v0, :cond_1

    .line 410
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mIsUsingETE:Z

    .line 412
    :cond_1
    return-void
.end method

.method private static calculateBestPace(Ljava/util/Map;)F
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)F"
        }
    .end annotation

    .line 1400
    const/4 v4, 0x0

    .line 1401
    const/4 v0, 0x0

    if-eq v0, p0, :cond_3

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 1402
    invoke-static {p0}, Lo/cdl;->e(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    .line 1403
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1404
    const-string v0, "HWExerciseAdviceManager"

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

    .line 1405
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 1406
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

    .line 1407
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    cmpl-float v0, v4, v0

    if-lez v0, :cond_0

    .line 1408
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v4

    .line 1410
    :cond_0
    goto :goto_0

    .line 1411
    :cond_1
    const-string v0, "HWExerciseAdviceManager"

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

    .line 1413
    :cond_2
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calculateBestPace,no valadePacemap "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1415
    :goto_1
    goto :goto_2

    .line 1416
    :cond_3
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calculateBestPace no pacemap"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1418
    :goto_2
    const-string v0, "HWExerciseAdviceManager"

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

    .line 1419
    return v4
.end method

.method private changePaceMapStruct(Lorg/json/JSONArray;I)Ljava/util/Map;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;I)Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 1092
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 1093
    const/4 v0, 0x0

    return-object v0

    .line 1095
    :cond_0
    new-instance v4, Ljava/util/TreeMap;

    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 1097
    const/4 v5, 0x0

    :goto_0
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_a

    .line 1098
    move-object/from16 v0, p1

    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lorg/json/JSONObject;

    .line 1099
    const-string v0, "HWExerciseAdviceManager"

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

    .line 1100
    const-string v0, "paceMapList"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    .line 1101
    const/4 v8, 0x0

    .line 1102
    const/4 v0, 0x0

    move/from16 v1, p2

    if-ne v0, v1, :cond_5

    .line 1103
    const/4 v9, 0x0

    :goto_1
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_4

    .line 1104
    invoke-virtual {v7, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    .line 1105
    const-string v0, "unit_type"

    const/4 v1, -0x1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1106
    goto/16 :goto_2

    .line 1108
    :cond_1
    const-string v0, "isLastLessDistance"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v11

    .line 1109
    const-string v0, "pace"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v12

    .line 1110
    const-string v0, "point_index"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v13

    .line 1111
    if-nez v11, :cond_2

    .line 1112
    const-string v0, "distance"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v14

    .line 1113
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

    .line 1114
    move v8, v14

    .line 1115
    goto :goto_2

    .line 1116
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

    .line 1117
    const/4 v0, 0x0

    if-ne v0, v14, :cond_3

    .line 1118
    goto :goto_2

    .line 1120
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

    .line 1103
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_1

    :cond_4
    goto/16 :goto_5

    .line 1124
    :cond_5
    const/4 v9, 0x0

    :goto_3
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_9

    .line 1125
    invoke-virtual {v7, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    .line 1126
    const-string v0, "unit_type"

    const/4 v1, -0x1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_6

    .line 1127
    goto/16 :goto_4

    .line 1129
    :cond_6
    const-string v0, "isLastLessDistance"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v11

    .line 1130
    const-string v0, "pace"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v12

    .line 1131
    const-string v0, "point_index"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v13

    .line 1132
    if-nez v11, :cond_7

    .line 1133
    const-string v0, "distance"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v14

    .line 1134
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

    .line 1135
    move v8, v14

    .line 1136
    goto :goto_4

    .line 1138
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

    .line 1139
    const/4 v0, 0x0

    if-ne v0, v14, :cond_8

    .line 1140
    goto :goto_4

    .line 1142
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

    .line 1124
    :goto_4
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_3

    .line 1097
    :cond_9
    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 1150
    :cond_a
    goto :goto_6

    .line 1147
    :catch_0
    move-exception v5

    .line 1148
    const-string v0, "HWExerciseAdviceManager"

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

    .line 1149
    const/4 v0, 0x0

    return-object v0

    .line 1151
    :goto_6
    const-string v0, "HWExerciseAdviceManager"

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

    .line 1152
    return-object v4
.end method

.method private changePartTimePaceMapStruct(Lorg/json/JSONArray;II)Ljava/util/Map;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;II)Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;"
        }
    .end annotation

    .line 1163
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1164
    const/4 v0, 0x0

    return-object v0

    .line 1166
    :cond_0
    new-instance v4, Ljava/util/TreeMap;

    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 1167
    const/4 v5, 0x0

    .line 1169
    const/4 v6, 0x0

    :goto_0
    :try_start_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_5

    .line 1170
    invoke-virtual {p1, v6}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lorg/json/JSONObject;

    .line 1171
    new-instance v8, Lorg/json/JSONArray;

    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    .line 1172
    const-string v0, "paceMapList"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    .line 1173
    const/4 v10, 0x0

    :goto_1
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v10, v0, :cond_2

    .line 1174
    invoke-virtual {v9, v10}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lorg/json/JSONObject;

    .line 1175
    const-string v0, "unit_type"

    const/4 v1, -0x1

    invoke-virtual {v11, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    move/from16 v1, p2

    if-ne v1, v0, :cond_1

    .line 1176
    invoke-virtual {v8, v11}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1173
    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 1179
    :cond_2
    const/4 v10, 0x0

    .line 1180
    const/4 v11, 0x0

    :goto_2
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v11, v0, :cond_4

    .line 1181
    invoke-virtual {v8, v11}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    .line 1182
    const-string v0, "isLastLessDistance"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v13

    .line 1183
    if-nez v13, :cond_3

    .line 1184
    const-string v0, "distance"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit16 v10, v0, 0x2710

    .line 1185
    const-string v0, "pace"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v5, v0

    .line 1186
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

    .line 1180
    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 1169
    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 1193
    :cond_5
    goto :goto_3

    .line 1190
    :catch_0
    move-exception v6

    .line 1191
    const-string v0, "HWExerciseAdviceManager"

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

    .line 1192
    const/4 v0, 0x0

    return-object v0

    .line 1194
    :goto_3
    const-string v0, "HWExerciseAdviceManager"

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

    .line 1195
    return-object v4
.end method

.method private checkSupportWorkoutType(I)Z
    .locals 1

    .line 1200
    const/4 v0, 0x1

    if-eq v0, p1, :cond_0

    const/4 v0, 0x2

    if-eq v0, p1, :cond_0

    const/4 v0, 0x3

    if-eq v0, p1, :cond_0

    const/4 v0, 0x4

    if-ne v0, p1, :cond_1

    .line 1204
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 1207
    :cond_1
    const/16 v0, 0x9

    if-eq v0, p1, :cond_2

    const/16 v0, 0xa

    if-eq v0, p1, :cond_2

    const/16 v0, 0xb

    if-ne v0, p1, :cond_3

    .line 1210
    :cond_2
    const/4 v0, 0x1

    return v0

    .line 1215
    :cond_3
    const/4 v0, 0x6

    if-eq v0, p1, :cond_4

    const/16 v0, 0x8

    if-eq v0, p1, :cond_4

    const/4 v0, 0x5

    if-ne v0, p1, :cond_5

    .line 1219
    :cond_4
    const/4 v0, 0x1

    return v0

    .line 1226
    :cond_5
    const/4 v0, 0x7

    if-eq v0, p1, :cond_6

    const/16 v0, 0xff

    if-ne v0, p1, :cond_7

    .line 1229
    :cond_6
    const/4 v0, 0x1

    return v0

    .line 1235
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

    .line 1240
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    .line 1241
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setHasTrackPoint(Z)V

    goto :goto_0

    .line 1243
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setHasTrackPoint(Z)V

    .line 1246
    :goto_0
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_1

    .line 1250
    :sswitch_0
    const/16 v0, 0x102

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 1251
    goto/16 :goto_2

    .line 1253
    :sswitch_1
    const/16 v0, 0x101

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 1254
    goto/16 :goto_2

    .line 1256
    :sswitch_2
    const/16 v0, 0x103

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 1257
    goto/16 :goto_2

    .line 1259
    :sswitch_3
    const/16 v0, 0x104

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 1260
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setChiefSportDataType(I)V

    .line 1261
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setFreeMotion(Z)V

    .line 1262
    goto :goto_2

    .line 1264
    :sswitch_4
    const/16 v0, 0x106

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 1265
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setChiefSportDataType(I)V

    .line 1266
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setFreeMotion(Z)V

    .line 1267
    goto :goto_2

    .line 1269
    :sswitch_5
    const/16 v0, 0x10a

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 1270
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setChiefSportDataType(I)V

    .line 1271
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setFreeMotion(Z)V

    .line 1272
    goto :goto_2

    .line 1274
    :sswitch_6
    const/16 v0, 0x108

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 1277
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setFreeMotion(Z)V

    .line 1278
    goto :goto_2

    .line 1280
    :sswitch_7
    const/16 v0, 0x109

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 1282
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setChiefSportDataType(I)V

    .line 1283
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setFreeMotion(Z)V

    .line 1284
    goto :goto_2

    .line 1286
    :sswitch_8
    const/16 v0, 0x118

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 1287
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setChiefSportDataType(I)V

    .line 1288
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setFreeMotion(Z)V

    .line 1289
    goto :goto_2

    .line 1291
    :sswitch_9
    const/16 v0, 0x117

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 1292
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setChiefSportDataType(I)V

    .line 1293
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setFreeMotion(Z)V

    .line 1294
    goto :goto_2

    .line 1296
    :goto_1
    const/16 v0, 0x102

    invoke-virtual {p3, v0}, Lcom/huawei/datatype/WorkoutDisplayInfo;->setWorkoutType(I)V

    .line 1299
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x4 -> :sswitch_3
        0x5 -> :sswitch_6
        0x6 -> :sswitch_4
        0x7 -> :sswitch_7
        0x8 -> :sswitch_5
        0x9 -> :sswitch_0
        0xa -> :sswitch_0
        0xb -> :sswitch_8
        0xff -> :sswitch_9
    .end sparse-switch
.end method

.method public static convertHealthTrackDataToHiData(Lcom/huawei/datatype/MotionPathSimplify;Lcom/huawei/datatype/MotionPath;Lcom/huawei/hihealth/HiDataInsertOption;)V
    .locals 13

    .line 1304
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->calculateBestPace(Ljava/util/Map;)F

    move-result v4

    .line 1305
    invoke-virtual {p0, v4}, Lcom/huawei/datatype/MotionPathSimplify;->setBestPace(F)V

    .line 1306
    const-string v0, "HWExerciseAdviceManager"

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

    .line 1307
    const-string v0, "HWExerciseAdviceManager"

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

    .line 1309
    new-instance v5, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-direct {v5}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;-><init>()V

    .line 1310
    const/4 v6, 0x0

    .line 1311
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getMapType()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1312
    const-string v6, "AMAP"

    goto :goto_0

    .line 1313
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getMapType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 1314
    const-string v6, "GOOGLE"

    .line 1316
    :cond_1
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 1317
    const-string v0, "HWExerciseAdviceManager"

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

    .line 1318
    invoke-virtual {v5, v6}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setVendor(Ljava/lang/String;)V

    .line 1320
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getAvgStepRate()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgStepRate(I)V

    .line 1321
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getAvgHeartRate()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgHeartRate(I)V

    .line 1322
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getAvgPace()F

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgPace(F)V

    .line 1324
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getBestPace()F

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBestPace(F)V

    .line 1325
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getBestStepRate()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBestStepRate(I)V

    .line 1326
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getMaxHeartRate()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setMaxHeartRate(I)V

    .line 1327
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getSportType()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSportType(I)V

    .line 1328
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalCalories()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalCalories(I)V

    .line 1329
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalDistance()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalDistance(I)V

    .line 1330
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalSteps()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalSteps(I)V

    .line 1331
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalTime()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalTime(J)V

    .line 1332
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getSportData()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setWearSportData(Ljava/util/Map;)V

    .line 1333
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getCreepingWave()F

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setCreepingWave(F)V

    .line 1334
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getMinHeartRate()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setMinHeartRate(I)V

    .line 1335
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTrackType()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTrackType(I)V

    .line 1336
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getSportData()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setWearSportData(Ljava/util/Map;)V

    .line 1337
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getIsFreeMotion()Z

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setIsFreeMotion(Z)V

    .line 1338
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getSportDataSource()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSportDataSource(I)V

    .line 1339
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getChiefSportDataType()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setChiefSportDataType(I)V

    .line 1340
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getHasTrackPoint()Z

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setHasTrackPoint(Z)V

    .line 1341
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setPaceMap(Ljava/util/Map;)V

    .line 1342
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getPartTimeMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setPartTimeMap(Ljava/util/Map;)V

    .line 1343
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getBritishPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBritishPaceMap(Ljava/util/Map;)V

    .line 1344
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getBritishPartTimeMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBritishPartTimeMap(Ljava/util/Map;)V

    .line 1346
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getSwolfBase()F

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSwolfBase(F)V

    .line 1347
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getBritishSwolfBase()F

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBritishSwolfBase(F)V

    .line 1348
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "--SwolfBase:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getSwolfBase()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " BritishSwolfBase:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getBritishSwolfBase()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1350
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getMaxAlti()F

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setMaxAlti(F)V

    .line 1351
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getMinAlti()F

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setMinAlti(F)V

    .line 1352
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalDescent()F

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalDescent(F)V

    .line 1353
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "--mMaxAlti:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getMaxAlti()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mMinAlti:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getMinAlti()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " TotalDistance:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalDescent()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1355
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWorkoutHeartRateType : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getmHeartrateZoneType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " getWorkoutExerciseId : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getRuncourseId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1356
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getmHeartrateZoneType()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setHeartrateZoneType(I)V

    .line 1357
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getRuncourseId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setRuncourseId(Ljava/lang/String;)V

    .line 1358
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getSwimSegments()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1359
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getSwimSegments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSwimSegments(Ljava/util/List;)V

    .line 1360
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getBritishSwimSegments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setBritishSwimSegments(Ljava/util/List;)V

    .line 1361
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "--SwimSegments.size():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getSwimSegments()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " BritishSwimSegments.size():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getBritishSwimSegments()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1364
    :cond_3
    new-instance v7, Lo/cvp;

    invoke-direct {v7}, Lo/cvp;-><init>()V

    .line 1365
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getSportType()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cvp;->c(I)V

    .line 1366
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/cvp;->b(Ljava/util/Map;)V

    .line 1367
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getAvgPace()F

    move-result v0

    invoke-virtual {v7, v0}, Lo/cvp;->c(F)V

    .line 1368
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalDistance()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cvp;->d(I)V

    .line 1369
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalSteps()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cvp;->a(I)V

    .line 1370
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lo/cvp;->e(Z)V

    .line 1371
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getTrackType()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cvp;->e(I)V

    .line 1372
    invoke-static {v7}, Lo/cvr;->b(Lo/cvp;)I

    move-result v8

    .line 1374
    const-string v0, "HWExerciseAdviceManager"

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

    .line 1375
    invoke-virtual {p0, v8}, Lcom/huawei/datatype/MotionPathSimplify;->saveAbnormalTrack(I)V

    .line 1376
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->requestAbnormalTrack()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAbnormalTrack(I)V

    .line 1378
    new-instance v9, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 1379
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 1380
    invoke-virtual {p0}, Lcom/huawei/datatype/MotionPathSimplify;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 1382
    const/16 v0, 0x7531

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 1383
    invoke-virtual {p1}, Lcom/huawei/datatype/MotionPath;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 1384
    new-instance v10, Lcom/google/gson/Gson;

    invoke-direct {v10}, Lcom/google/gson/Gson;-><init>()V

    .line 1385
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-virtual {v10, v5, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 1388
    const-string v11, ""

    .line 1389
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v12

    .line 1390
    const/4 v0, 0x0

    if-eq v0, v12, :cond_4

    .line 1391
    invoke-virtual {v12}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecUUID()Ljava/lang/String;

    move-result-object v11

    goto :goto_1

    .line 1393
    :cond_4
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "convertHealthTrackDataToHiData, deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1395
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

    .line 1396
    invoke-virtual {p2, v9}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 1397
    return-void
.end method

.method private getConncetedDeviceType()I
    .locals 9

    .line 3376
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0}, Lo/dea;->a()Ljava/util/List;

    move-result-object v4

    .line 3377
    const/4 v5, 0x0

    .line 3378
    const/4 v6, -0x1

    .line 3379
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getConncetedDeviceType() deviceList.size() = "

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

    .line 3380
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 3381
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 3382
    move-object v5, v8

    .line 3383
    goto :goto_1

    .line 3385
    :cond_0
    goto :goto_0

    .line 3386
    :cond_1
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 3387
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v6

    .line 3389
    :cond_2
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getConncetedDeviceType() deviceType "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3390
    return v6
.end method

.method private static getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 7

    .line 439
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0}, Lo/dea;->a()Ljava/util/List;

    move-result-object v4

    .line 440
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 441
    const-string v0, "HWExerciseAdviceManager"

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

    .line 442
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

    .line 443
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 444
    return-object v6

    .line 446
    :cond_0
    goto :goto_0

    .line 447
    :cond_1
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() deviceInfo\'s ActiveState not DeviceActiveState.DEVICE_ACTIVE_ENABLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    const/4 v0, 0x0

    return-object v0

    .line 450
    :cond_2
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() deviceInfoList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    const/4 v0, 0x0

    return-object v0
.end method

.method private getCurrentDeviceState()I
    .locals 3

    .line 3859
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->hwDeviceMgr:Lo/dea;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 3860
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v2

    .line 3861
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 3862
    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    return v0

    .line 3865
    :cond_0
    const/4 v0, 0x3

    return v0
.end method

.method private getDetailData(II)V
    .locals 2

    .line 3031
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3033
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecord:Lorg/json/JSONObject;

    invoke-direct {p0, p1, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->syncWorkoutDetailData(ILorg/json/JSONObject;)V

    .line 3035
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 3037
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutData:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    invoke-direct {p0, v0, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getWorkoutDetailData(Lorg/json/JSONObject;I)V

    goto :goto_0

    .line 3041
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDeviceSupportPaceMap:Z

    if-eqz v0, :cond_1

    .line 3042
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getWorkoutRecordPaceMap(II)V

    goto :goto_0

    .line 3045
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getWorkOutDetailFromDevice(II)V

    .line 3048
    :goto_0
    return-void
.end method

.method private getDeviceRunPlanRecordIdList(ILorg/json/JSONObject;)V
    .locals 5

    .line 3741
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecord:Lorg/json/JSONObject;

    .line 3743
    :try_start_0
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;

    invoke-direct {v0, p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$12;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V

    invoke-virtual {p0, p2, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecord(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3788
    goto :goto_0

    .line 3784
    :catch_0
    move-exception v4

    .line 3785
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3786
    const-string v0, "getDeviceRunPlanRecordIdList"

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notifyDetailSyncComplete(ILjava/lang/String;)V

    .line 3787
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notifyToSyncStressData()V

    .line 3790
    :goto_0
    return-void
.end method

.method private getDeviceRunPlanRecordStatistic(I)V
    .locals 7

    .line 3604
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecord:Lorg/json/JSONObject;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 3605
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecord:Lorg/json/JSONObject;

    const-string v1, "runPlanRecordStructList"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 3606
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecordStatisticIndex:I

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecord:Lorg/json/JSONObject;

    const-string v2, "runPlanRecordStructList"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 3607
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecordStatisticIndex:I

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "run_plan_record_id"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 3608
    const-string v0, "HWExerciseAdviceManager"

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

    .line 3609
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 3610
    const-string v0, "id"

    invoke-virtual {v6, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 3611
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;

    invoke-direct {v0, p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$10;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V

    invoke-virtual {p0, v6, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordInfo(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3667
    goto :goto_0

    .line 3668
    :cond_0
    const-string v0, "getRunPlanCompleted"

    invoke-direct {p0, p1, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notifyDetailSyncComplete(ILjava/lang/String;)V

    .line 3669
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notifyToSyncStressData()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3676
    :cond_1
    :goto_0
    goto :goto_1

    .line 3672
    :catch_0
    move-exception v4

    .line 3673
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3674
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordStatisticIndex:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordStatisticIndex:I

    .line 3675
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getDeviceWorkoutRecordStatistic(I)V

    .line 3678
    :goto_1
    return-void
.end method

.method private getDeviceSupportCapacity()V
    .locals 5

    .line 3811
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0}, Lo/dea;->c()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v4

    .line 3812
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 3813
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdvice()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDeviceSupportCapacity:Z

    .line 3814
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutRecordPaceMap()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDeviceSupportPaceMap:Z

    .line 3816
    :cond_0
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get Device Support runplan Capacity, capacity="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDeviceSupportCapacity:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",paceMapSupport="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDeviceSupportPaceMap:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3817
    return-void
.end method

.method private getDeviceWorkoutRecordIdList(Lorg/json/JSONObject;)V
    .locals 5

    .line 3682
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecord:Lorg/json/JSONObject;

    .line 3684
    :try_start_0
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$11;

    invoke-direct {v1, p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$11;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V

    invoke-virtual {v0, p1, v1}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRecord(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3734
    goto :goto_0

    .line 3732
    :catch_0
    move-exception v4

    .line 3733
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3736
    :goto_0
    return-void
.end method

.method private getDeviceWorkoutRecordStatistic(I)V
    .locals 8

    .line 3444
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceWorkoutRecordStatistic().mWorkoutRecordStatisticIndex ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordStatisticIndex:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3446
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecord:Lorg/json/JSONObject;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 3447
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecord:Lorg/json/JSONObject;

    const-string v1, "workoutRecordStructList"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 3448
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordStatisticIndex:I

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 3449
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordStatisticIndex:I

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 3450
    const-string v0, "workout_record_id"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 3451
    const-string v0, "workout_section_index"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->sectionIndex:I

    .line 3452
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceWorkoutRecordStatistic() sectionIndex = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->sectionIndex:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3453
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstSwimSectionIndex:Ljava/util/List;

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->sectionIndex:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3454
    const-string v0, "HWExerciseAdviceManager"

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

    .line 3455
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 3456
    const-string v0, "id"

    invoke-virtual {v7, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 3457
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$8;

    invoke-direct {v1, p0, p1, v6}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$8;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;II)V

    invoke-virtual {v0, v7, v1}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRecordStatistic(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3522
    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordStatisticIndex:I

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 3524
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->printWorkoutRecordInfo()V

    .line 3525
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecordStatisticIndex:I

    .line 3527
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 3528
    const-string v0, "startTime"

    iget-wide v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lastSyncTime:J

    invoke-virtual {v5, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 3529
    const-string v0, "endTime"

    iget-wide v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->currentTime:J

    invoke-virtual {v5, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 3530
    invoke-direct {p0, p1, v5}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getDeviceRunPlanRecordIdList(ILorg/json/JSONObject;)V

    .line 3531
    goto :goto_0

    .line 3533
    :cond_1
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecordStatisticIndex:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecordStatisticIndex:I

    .line 3534
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getDeviceRunPlanRecordStatistic(I)V

    .line 3536
    :goto_0
    goto :goto_1

    .line 3538
    :cond_2
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecordStatisticIndex:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecordStatisticIndex:I

    .line 3539
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getDeviceRunPlanRecordStatistic(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3543
    :goto_1
    goto :goto_2

    .line 3541
    :catch_0
    move-exception v4

    .line 3542
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3544
    :goto_2
    return-void
.end method

.method private static declared-synchronized getGetRunPlanRecordCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    monitor-enter v1

    .line 4133
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordCallbackList:Ljava/util/List;
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

    const-class v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    monitor-enter v1

    .line 4137
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private getHeartDistribution(Lcom/huawei/datatype/MotionPath;I)Ljava/lang/String;
    .locals 19

    .line 1008
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartDistribution enter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1009
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 1010
    const/4 v5, 0x0

    :goto_0
    const/4 v0, 0x6

    if-ge v5, v0, :cond_0

    .line 1011
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 1010
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1013
    :cond_0
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_3

    .line 1014
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1016
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/datatype/MotionPath;->getHeartRateList()Ljava/util/ArrayList;

    move-result-object v5

    .line 1017
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1019
    invoke-static {v5}, Lo/fjz;->d(Ljava/util/List;)[I

    move-result-object v6

    .line 1021
    const/4 v0, 0x0

    aget v7, v6, v0

    .line 1022
    const/4 v0, 0x1

    aget v8, v6, v0

    .line 1023
    const/4 v0, 0x2

    aget v9, v6, v0

    .line 1024
    const/4 v0, 0x3

    aget v10, v6, v0

    .line 1025
    const/4 v0, 0x4

    aget v11, v6, v0

    .line 1026
    add-int v0, v7, v8

    add-int/2addr v0, v9

    add-int/2addr v0, v10

    add-int v12, v0, v11

    .line 1028
    move/from16 v0, p2

    if-ge v12, v0, :cond_1

    .line 1029
    move/from16 v12, p2

    .line 1031
    :cond_1
    mul-int/lit8 v0, v7, 0x64

    div-int v13, v0, v12

    .line 1032
    mul-int/lit8 v0, v8, 0x64

    div-int v14, v0, v12

    .line 1033
    mul-int/lit8 v0, v9, 0x64

    div-int v15, v0, v12

    .line 1034
    mul-int/lit8 v0, v10, 0x64

    div-int v16, v0, v12

    .line 1035
    mul-int/lit8 v0, v11, 0x64

    div-int v17, v0, v12

    .line 1036
    rsub-int/lit8 v0, v13, 0x64

    sub-int/2addr v0, v14

    sub-int/2addr v0, v15

    sub-int v0, v0, v16

    sub-int v18, v0, v17

    .line 1037
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 1038
    move/from16 v0, v17

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 1039
    move/from16 v0, v16

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 1040
    invoke-virtual {v4, v15}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 1041
    invoke-virtual {v4, v14}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 1042
    invoke-virtual {v4, v13}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 1043
    move/from16 v0, v18

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 1045
    invoke-virtual {v4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1047
    :cond_2
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartDistribution mHeartRateList = null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1050
    :cond_3
    invoke-virtual {v4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getInstance()Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;
    .locals 4

    .line 300
    sget-object v2, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->Object:Ljava/lang/Object;

    monitor-enter v2

    .line 301
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->instance:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 302
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->instance:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    .line 304
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->instance:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 305
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private getLastSyncTime()J
    .locals 5

    .line 468
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastSyncTime enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    new-instance v4, Lcom/huawei/hwservicesmgr/remote/LastSyncTimeStampDB;

    invoke-direct {v4}, Lcom/huawei/hwservicesmgr/remote/LastSyncTimeStampDB;-><init>()V

    .line 470
    invoke-virtual {v4, p0}, Lcom/huawei/hwservicesmgr/remote/LastSyncTimeStampDB;->getLastTimeStamp(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)J

    move-result-wide v0

    return-wide v0
.end method

.method private static declared-synchronized getNotificationRunPlanRecordInfoCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    monitor-enter v1

    .line 4141
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notificationRunPlanRecordInfoCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private getOneRecordSuccess(II)V
    .locals 6

    .line 3210
    new-instance v2, Lo/dkg;

    invoke-direct {v2}, Lo/dkg;-><init>()V

    .line 3211
    invoke-virtual {p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getCurrDeviceId()Ljava/lang/String;

    move-result-object v3

    .line 3213
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->succeedRecordMap:Ljava/util/Map;

    invoke-direct {p0, v3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRecordKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 3214
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    .line 3216
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->succeedRecordMap:Ljava/util/Map;

    invoke-direct {p0, v3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRecordKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 3218
    :goto_0
    invoke-virtual {v2, p1}, Lo/dkg;->a(I)V

    .line 3220
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordsStatistic:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lorg/json/JSONObject;

    .line 3221
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 3222
    const-string v0, "workout_record_start_time"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/dkg;->b(J)V

    .line 3224
    :cond_1
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3225
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->succeedRecordMap:Ljava/util/Map;

    invoke-direct {p0, v3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRecordKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3226
    const-string v0, "get track ok"

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notifySaveData(IILjava/lang/String;)V

    .line 3228
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordStatisticIndex:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordStatisticIndex:I

    .line 3229
    invoke-direct {p0, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getDeviceWorkoutRecordStatistic(I)V

    .line 3230
    return-void
.end method

.method private getPaceIndexArray(II)V
    .locals 3

    .line 3793
    const/4 v0, -0x1

    if-ne v0, p2, :cond_0

    .line 3794
    new-instance v1, Lcom/huawei/datatype/PaceIndexStruct;

    invoke-direct {v1}, Lcom/huawei/datatype/PaceIndexStruct;-><init>()V

    .line 3795
    invoke-virtual {v1, p1}, Lcom/huawei/datatype/PaceIndexStruct;->setRecordId(I)V

    .line 3796
    const/4 v0, -0x1

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/PaceIndexStruct;->setPaceIndex(I)V

    .line 3797
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutRecordPaceMapIDList:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3798
    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    if-ge v0, p2, :cond_1

    .line 3799
    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_1

    .line 3800
    new-instance v2, Lcom/huawei/datatype/PaceIndexStruct;

    invoke-direct {v2}, Lcom/huawei/datatype/PaceIndexStruct;-><init>()V

    .line 3801
    invoke-virtual {v2, p1}, Lcom/huawei/datatype/PaceIndexStruct;->setRecordId(I)V

    .line 3802
    invoke-virtual {v2, v1}, Lcom/huawei/datatype/PaceIndexStruct;->setPaceIndex(I)V

    .line 3803
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutRecordPaceMapIDList:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3799
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 3806
    :cond_1
    :goto_1
    return-void
.end method

.method private getPacePointForDistance(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lorg/json/JSONObject;>;Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Map<Ljava/lang/Long;[D>;>;Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Long;>;>;)V"
        }
    .end annotation

    .line 4164
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getTimeStampForDistance(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;I)V

    .line 4165
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getTimeStampForDistance(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;I)V

    .line 4166
    return-void
.end method

.method private getRecordKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 3547
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->huid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getRunPlanDetailData(II)V
    .locals 2

    .line 3051
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3053
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecord:Lorg/json/JSONObject;

    invoke-direct {p0, p1, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->syncRunPlanDetailData(ILorg/json/JSONObject;)V

    .line 3055
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 3057
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutData:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    invoke-direct {p0, v0, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getWorkoutDetailData(Lorg/json/JSONObject;I)V

    goto :goto_0

    .line 3061
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDeviceSupportPaceMap:Z

    if-eqz v0, :cond_1

    .line 3062
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getWorkoutRecordPaceMap(II)V

    goto :goto_0

    .line 3065
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getWorkOutDetailFromDevice(II)V

    .line 3068
    :goto_0
    return-void
.end method

.method private getRunPlanDetailFromDevice(Z)V
    .locals 4

    .line 3394
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mapGPSRunPlan:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 3395
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getConncetedDeviceType()I

    move-result v0

    const/16 v1, 0x8

    if-ne v1, v0, :cond_0

    .line 3396
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "metis not need track file"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3397
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notifyDetailSyncComplete(ILjava/lang/String;)V

    .line 3398
    return-void

    .line 3401
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstGPSRunPlanRecordID:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 3402
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRunPlanDetailFromDevice() id is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3403
    if-eqz p1, :cond_1

    .line 3404
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notifyDetailSyncComplete(ILjava/lang/String;)V

    goto :goto_0

    .line 3406
    :cond_1
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notifyDetailSyncComplete(ILjava/lang/String;)V

    .line 3408
    :goto_0
    return-void

    .line 3410
    :cond_2
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstGPSRunPlanRecordID:Ljava/util/List;

    new-instance v2, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;

    invoke-direct {v2, p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$7;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Z)V

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;->getRunPlanDetailFromDevice(Ljava/util/List;Lo/yg;)V

    .line 3440
    return-void
.end method

.method private static declared-synchronized getRunPlanParameterCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    monitor-enter v1

    .line 4121
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->runPlanParameterCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private getSectionList(III)V
    .locals 5

    .line 3553
    :try_start_0
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSectionListdStatisticIndex:I

    if-ge v0, p2, :cond_0

    .line 3554
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 3555
    const-string v0, "id"

    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 3556
    const-string v0, "sectionIndex"

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSectionListdStatisticIndex:I

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 3557
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSectionList. workout_record_id = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "sectionIndex = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSectionListdStatisticIndex:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3558
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;

    invoke-direct {v1, p0, p2, p1, p3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;III)V

    invoke-virtual {v0, v4, v1}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getSectionListStatistic(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3581
    goto :goto_0

    .line 3583
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->printWorkoutRecordSectionInfo()V

    .line 3584
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutRecordSectionMapList:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSectionRecordsStatisticJsonObjects:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3585
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lstWorkoutRecordSectionMapList.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutRecordSectionMapList:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3586
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->sectionIndex:I

    .line 3588
    invoke-direct {p0, p1, p3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getDetailData(II)V

    .line 3589
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSectionListdStatisticIndex:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3598
    :goto_0
    goto :goto_1

    .line 3593
    :catch_0
    move-exception v4

    .line 3594
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3596
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordStatisticIndex:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordStatisticIndex:I

    .line 3597
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getDeviceWorkoutRecordStatistic(I)V

    .line 3599
    :goto_1
    return-void
.end method

.method private static declared-synchronized getSetRunPlanCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    monitor-enter v1

    .line 4125
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->setRunPlanCallbackList:Ljava/util/List;
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

    const-class v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    monitor-enter v1

    .line 4129
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->setRunPlanReminderSwitchCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private getSportSpeedDistribution(Ljava/util/List;)Ljava/lang/String;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 967
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportSpeedDistribution enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 968
    const/4 v4, 0x6

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    .line 969
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 971
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 972
    const-string v0, "paceMap"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    .line 974
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 975
    invoke-virtual {v8}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v9

    .line 976
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 977
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    .line 978
    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v11

    .line 979
    const-wide v0, 0x4072c00000000000L    # 300.0

    cmpg-double v0, v11, v0

    if-gez v0, :cond_0

    .line 980
    const/4 v0, 0x0

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    aput v0, v4, v1

    goto :goto_1

    .line 981
    :cond_0
    const-wide v0, 0x4076800000000000L    # 360.0

    cmpg-double v0, v11, v0

    if-gez v0, :cond_1

    .line 982
    const/4 v0, 0x1

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    aput v0, v4, v1

    goto :goto_1

    .line 983
    :cond_1
    const-wide v0, 0x407a400000000000L    # 420.0

    cmpg-double v0, v11, v0

    if-gez v0, :cond_2

    .line 984
    const/4 v0, 0x2

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x2

    aput v0, v4, v1

    goto :goto_1

    .line 985
    :cond_2
    const-wide/high16 v0, 0x407e000000000000L    # 480.0

    cmpg-double v0, v11, v0

    if-gez v0, :cond_3

    .line 986
    const/4 v0, 0x3

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x3

    aput v0, v4, v1

    goto :goto_1

    .line 987
    :cond_3
    const-wide v0, 0x4080e00000000000L    # 540.0

    cmpg-double v0, v11, v0

    if-gez v0, :cond_4

    .line 988
    const/4 v0, 0x4

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x4

    aput v0, v4, v1

    goto :goto_1

    .line 990
    :cond_4
    const/4 v0, 0x5

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x5

    aput v0, v4, v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 992
    :goto_1
    goto/16 :goto_0

    .line 995
    :cond_5
    goto :goto_2

    .line 993
    :catch_0
    move-exception v6

    .line 994
    invoke-virtual {v6}, Lorg/json/JSONException;->printStackTrace()V

    .line 996
    :goto_2
    const/4 v0, 0x0

    aget v0, v4, v0

    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 997
    const/4 v0, 0x1

    aget v0, v4, v0

    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 998
    const/4 v0, 0x2

    aget v0, v4, v0

    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 999
    const/4 v0, 0x3

    aget v0, v4, v0

    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 1000
    const/4 v0, 0x4

    aget v0, v4, v0

    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 1001
    const/4 v0, 0x5

    aget v0, v4, v0

    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 1003
    invoke-virtual {v5}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method

.method private getSportStartGPS(Lcom/huawei/datatype/MotionPath;)Ljava/lang/String;
    .locals 11

    .line 1054
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportStartGPS enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1055
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 1058
    invoke-virtual {p1}, Lcom/huawei/datatype/MotionPath;->getLbsDataMap()Ljava/util/Map;

    move-result-object v4

    .line 1059
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1060
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportStartGPS ,lbsDataMap = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1061
    const/4 v0, 0x0

    return-object v0

    .line 1063
    :cond_0
    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1064
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportStartGPS No GPS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1065
    const/4 v0, 0x0

    return-object v0

    .line 1068
    :cond_1
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, [D

    .line 1071
    const/4 v0, 0x0

    aget-wide v6, v5, v0

    .line 1072
    const/4 v0, 0x1

    aget-wide v8, v5, v0

    .line 1076
    new-instance v10, Lorg/json/JSONArray;

    invoke-direct {v10}, Lorg/json/JSONArray;-><init>()V

    .line 1077
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1078
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1079
    invoke-virtual {v10}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1081
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private getTimeStampForDistance(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;I)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lorg/json/JSONObject;>;Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Map<Ljava/lang/Long;[D>;>;Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Long;>;>;I)V"
        }
    .end annotation

    .line 4176
    const/4 v0, 0x0

    move-object/from16 v1, p3

    if-eq v0, v1, :cond_0

    :try_start_0
    invoke-interface/range {p3 .. p3}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 4177
    :cond_0
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pointTimeMap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4178
    return-void

    .line 4180
    :cond_1
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-ne v0, v1, :cond_2

    .line 4181
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gpsInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 4182
    return-void

    .line 4184
    :cond_2
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_3

    .line 4185
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "paceMapList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 4186
    return-void

    .line 4188
    :cond_3
    :try_start_3
    invoke-interface/range {p3 .. p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    .line 4189
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 4191
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 4192
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 4194
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_4
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lorg/json/JSONObject;

    .line 4195
    const-string v0, "workout_record_id"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    if-ne v6, v0, :cond_4

    .line 4197
    const-string v0, "paceMapList"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    .line 4198
    const/4 v12, 0x0

    :goto_2
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v12, v0, :cond_6

    .line 4199
    invoke-virtual {v11, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v13

    .line 4200
    const-string v0, "unit_type"

    const/4 v1, -0x1

    invoke-virtual {v13, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    move/from16 v1, p4

    if-ne v1, v0, :cond_5

    .line 4201
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4202
    const-string v0, "point_index"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4198
    :cond_5
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 4209
    :cond_6
    goto :goto_1

    .line 4212
    :cond_7
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 4213
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/List;

    .line 4214
    const/4 v0, 0x0

    if-ne v0, v10, :cond_8

    .line 4215
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "oldGpsRecord is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 4216
    return-void

    .line 4218
    :cond_8
    :try_start_4
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/Integer;

    .line 4219
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_9

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_9

    .line 4220
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 4222
    :cond_9
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4224
    :goto_4
    goto :goto_3

    .line 4227
    :cond_a
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/util/Map;

    .line 4228
    const/4 v0, 0x0

    if-ne v0, v11, :cond_b

    .line 4229
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gpsRecord is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 4230
    return-void

    .line 4233
    :cond_b
    :try_start_5
    invoke-interface {v11}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v12

    .line 4234
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    move-object v13, v0

    .line 4235
    invoke-interface {v13, v12}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 4236
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v14, v0

    .line 4237
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_5
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v16

    .line 4238
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    .line 4239
    const-wide/16 v19, 0x0

    .line 4240
    const-wide/16 v21, 0x0

    .line 4241
    invoke-interface {v13}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v23

    :goto_6
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Ljava/lang/Long;

    .line 4242
    move-object/from16 v0, v24

    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v25, v0

    check-cast v25, [D

    .line 4243
    move-object/from16 v26, v24

    .line 4244
    const/4 v0, 0x3

    aget-wide v27, v25, v0

    .line 4247
    cmpl-double v0, v16, v27

    if-lez v0, :cond_c

    .line 4248
    sub-double v19, v16, v27

    .line 4249
    move-object/from16 v18, v26

    .line 4251
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-interface {v11}, Ljava/util/Map;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_f

    .line 4252
    move-object/from16 v0, v26

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4253
    goto :goto_7

    .line 4255
    :cond_c
    cmpl-double v0, v16, v27

    if-nez v0, :cond_d

    .line 4256
    move-object/from16 v0, v26

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4257
    goto :goto_7

    .line 4260
    :cond_d
    sub-double v21, v27, v16

    .line 4261
    cmpg-double v0, v19, v21

    if-gez v0, :cond_e

    .line 4262
    move-object/from16 v0, v18

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 4264
    :cond_e
    move-object/from16 v0, v26

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4266
    goto :goto_7

    .line 4268
    :cond_f
    goto/16 :goto_6

    .line 4269
    :cond_10
    :goto_7
    goto/16 :goto_5

    .line 4272
    :cond_11
    const/4 v15, 0x0

    :goto_8
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v15, v0, :cond_13

    .line 4273
    invoke-virtual {v7, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lorg/json/JSONObject;

    .line 4274
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v15, v0, :cond_12

    .line 4275
    const-string v0, "point_index"

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 4276
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pointindex:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 4272
    :cond_12
    add-int/lit8 v15, v15, 0x1

    goto :goto_8

    .line 4279
    :cond_13
    goto/16 :goto_0

    .line 4283
    :cond_14
    goto :goto_9

    .line 4281
    :catch_0
    move-exception v4

    .line 4282
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getTimeStampForDistance "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4284
    :goto_9
    return-void
.end method

.method private getTrackDataToODMF(Lcom/huawei/datatype/MotionPathSimplify;Lcom/huawei/datatype/MotionPath;)Ljava/lang/String;
    .locals 17

    .line 926
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTrackDataToODMF MotionPath is enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 927
    new-instance v4, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 928
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-static {v0, v1, v4}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->convertHealthTrackDataToHiData(Lcom/huawei/datatype/MotionPathSimplify;Lcom/huawei/datatype/MotionPath;Lcom/huawei/hihealth/HiDataInsertOption;)V

    .line 929
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDataInsertOption;->getDatas()Ljava/util/List;

    move-result-object v5

    .line 931
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/datatype/MotionPathSimplify;->getSportType()I

    move-result v6

    .line 933
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->o(J)Ljava/lang/String;

    move-result-object v7

    .line 935
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v8

    .line 938
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v9, v0, v2

    .line 941
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalCalories()I

    move-result v0

    div-int/lit16 v11, v0, 0x3e8

    .line 943
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getSportStartGPS(Lcom/huawei/datatype/MotionPath;)Ljava/lang/String;

    move-result-object v12

    .line 945
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getSportSpeedDistribution(Ljava/util/List;)Ljava/lang/String;

    move-result-object v13

    .line 946
    long-to-int v0, v9

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v1, v2, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getHeartDistribution(Lcom/huawei/datatype/MotionPath;I)Ljava/lang/String;

    move-result-object v14

    .line 947
    new-instance v15, Lorg/json/JSONObject;

    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    .line 949
    const-string v0, "SportType"

    :try_start_0
    invoke-virtual {v15, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 950
    const-string v0, "SportStartTime"

    invoke-virtual {v15, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 951
    const-string v0, "DeviceID"

    invoke-virtual {v15, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 952
    const-string v0, "SportStartGPS"

    invoke-virtual {v15, v0, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 953
    const-string v0, "SportDuration"

    invoke-virtual {v15, v0, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 954
    const-string v0, "HeartDistribution"

    invoke-virtual {v15, v0, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 955
    const-string v0, "SportSpeedDistribution"

    invoke-virtual {v15, v0, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 956
    const-string v0, "HeatQuantity"

    invoke-virtual {v15, v0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 958
    invoke-virtual {v15}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 959
    :catch_0
    move-exception v16

    .line 960
    invoke-virtual/range {v16 .. v16}, Lorg/json/JSONException;->printStackTrace()V

    .line 962
    const/4 v0, 0x0

    return-object v0
.end method

.method private getWorkOutDetailFromDevice(II)V
    .locals 6

    .line 3110
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mapGPSWorkout:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 3111
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mapGPSWorkoutAndRunPlanType:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 3112
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getConncetedDeviceType()I

    move-result v0

    const/16 v1, 0x8

    if-ne v1, v0, :cond_0

    .line 3113
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "metis not need track file workout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3114
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getOneRecordSuccess(II)V

    .line 3116
    return-void

    .line 3123
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 3124
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3125
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getWorkoutType(I)I

    move-result v5

    .line 3126
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$6;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;II)V

    invoke-virtual {v0, v5, v4, v1}, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;->getWorkOutDetailFromDevice(ILjava/util/List;Lo/yg;)V

    .line 3201
    return-void
.end method

.method private getWorkoutDetailData(Lorg/json/JSONObject;I)V
    .locals 5

    .line 3928
    const-string v0, "workout_data_index"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 3929
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutDetailData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3931
    :cond_0
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;

    invoke-direct {v1, p0, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$WorkoutDetailCallback;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V

    invoke-virtual {v0, p1, v1}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutData(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3936
    goto :goto_0

    .line 3934
    :catch_0
    move-exception v4

    .line 3935
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3937
    :goto_0
    return-void
.end method

.method private getWorkoutRecordPaceMap(II)V
    .locals 4

    .line 3362
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutRecordPaceMapIDList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/datatype/PaceIndexStruct;

    .line 3363
    invoke-virtual {v3}, Lcom/huawei/datatype/PaceIndexStruct;->getRecordId()I

    move-result v0

    if-ne p1, v0, :cond_1

    .line 3364
    invoke-virtual {v3}, Lcom/huawei/datatype/PaceIndexStruct;->getPaceIndex()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 3365
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutRecordPaceMapList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3367
    :cond_0
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$PaceMapCallback;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;II)V

    invoke-virtual {v0, v3, v1}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRecordPaceMap(Lcom/huawei/datatype/PaceIndexStruct;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3368
    return-void

    .line 3370
    :cond_1
    goto :goto_0

    .line 3372
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getWorkOutDetailFromDevice(II)V

    .line 3373
    return-void
.end method

.method private getWorkoutType(I)I
    .locals 8

    .line 3093
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecord:Lorg/json/JSONObject;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 3094
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecord:Lorg/json/JSONObject;

    const-string v1, "runPlanRecordStructList"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 3095
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 3096
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lorg/json/JSONObject;

    .line 3097
    const-string v0, "run_plan_record_id"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v7

    .line 3098
    if-ne v7, p1, :cond_0

    .line 3099
    const/4 v0, 0x2

    return v0

    .line 3095
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 3105
    :cond_1
    goto :goto_1

    .line 3103
    :catch_0
    move-exception v4

    .line 3104
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3106
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method private initDeviceInfo()V
    .locals 6

    .line 324
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getDeviceSupportCapacity()V

    .line 327
    new-instance v4, Lcom/huawei/hwservicesmgr/remote/LastSyncTimeStampDB;

    invoke-direct {v4}, Lcom/huawei/hwservicesmgr/remote/LastSyncTimeStampDB;-><init>()V

    .line 328
    invoke-virtual {v4, p0}, Lcom/huawei/hwservicesmgr/remote/LastSyncTimeStampDB;->createDBTable(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V

    .line 336
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "HWExerciseAdviceManager"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mHandlerThread:Landroid/os/HandlerThread;

    .line 337
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 339
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$HWExerciseAdviceMgrHandler;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$HWExerciseAdviceMgrHandler;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mHWExerciseAdviceMgrHandler:Landroid/os/Handler;

    .line 341
    const-string v0, "planshakey"

    invoke-virtual {p0, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mPlanSha:Ljava/lang/String;

    .line 343
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====advice===initDeviceInfo planSHA="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mPlanSha:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    new-instance v5, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v5, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 356
    const-string v0, "com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 357
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mConnectStateChangedReceiver:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v5, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 359
    return-void
.end method

.method private isRunPlanRecord(I)Z
    .locals 8

    .line 687
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecord:Lorg/json/JSONObject;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 688
    const/4 v0, 0x0

    return v0

    .line 691
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecord:Lorg/json/JSONObject;

    const-string v1, "runPlanRecordStructList"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 692
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 693
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lorg/json/JSONObject;

    .line 694
    const-string v0, "run_plan_record_id"

    const/4 v1, -0x1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v7

    .line 695
    const/4 v0, -0x1

    if-eq v0, v7, :cond_1

    if-ne p1, v7, :cond_1

    .line 696
    const/4 v0, 0x1

    return v0

    .line 692
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 699
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 700
    :catch_0
    move-exception v4

    .line 701
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isRunPlanRecord exception:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 702
    const/4 v0, 0x0

    return v0
.end method

.method private notifyDetailSyncComplete(ILjava/lang/String;)V
    .locals 4

    .line 474
    const-string v0, "HWExerciseAdviceManager"

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

    .line 475
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mHWExerciseAdviceMgrHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 476
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mHWExerciseAdviceMgrHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 478
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->isDetailSyncing:Z

    .line 479
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 480
    iget-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->currentTime:J

    invoke-direct {p0, v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->setLastSyncTime(J)V

    .line 482
    :cond_1
    return-void
.end method

.method private notifySaveData(IILjava/lang/String;)V
    .locals 4

    .line 486
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notifySaveData errCode="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";recordid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 488
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$1;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 513
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 522
    return-void
.end method

.method private notifyToSyncStressData()V
    .locals 6

    .line 530
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->workOutCallback:Lo/djs;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 531
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyToSyncStressData() enter.workOutCallback is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 533
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->workOutCallback:Lo/djs;

    const-string v1, "notifyToSyncStressData"

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lo/djs;->d(ILjava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 539
    goto :goto_0

    .line 534
    :catch_0
    move-exception v4

    .line 535
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyToSyncStressData() RemoteException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 536
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.stress_and_relax_sync"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 537
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 538
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 539
    goto :goto_0

    .line 541
    :cond_0
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyToSyncStressData() enter.workOutCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 542
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.stress_and_relax_sync"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 543
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 544
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 547
    :goto_0
    return-void
.end method

.method private packTrackData(Lorg/json/JSONArray;Lcom/huawei/datatype/MotionPath;Lcom/huawei/datatype/MotionPathSimplify;Lorg/json/JSONObject;)V
    .locals 49

    .line 1685
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1686
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1687
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1688
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1689
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1690
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 1691
    const/4 v13, 0x0

    .line 1692
    const-wide/16 v14, 0x0

    .line 1693
    const/16 v16, 0x0

    .line 1694
    const/16 v17, 0x0

    .line 1695
    const-wide/16 v18, 0x0

    .line 1696
    const/16 v20, 0x0

    .line 1697
    const/16 v21, 0x0

    .line 1698
    const/16 v22, 0x0

    .line 1699
    const/16 v23, 0x0

    .line 1700
    const-wide/16 v24, 0x0

    .line 1701
    const/16 v26, 0x0

    .line 1702
    const/16 v27, 0x0

    .line 1703
    const-wide/16 v28, 0x0

    .line 1705
    invoke-virtual/range {p1 .. p1}, Lorg/json/JSONArray;->length()I

    move-result v30

    .line 1706
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v30

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1707
    const-string v0, "HWExerciseAdviceManager"

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

    .line 1709
    const/16 v31, 0x0

    .line 1711
    :try_start_0
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalSteps()I

    move-result v0

    move/from16 v26, v0

    .line 1712
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/datatype/MotionPathSimplify;->getTotalTime()J

    move-result-wide v0

    move-wide/from16 v28, v0

    .line 1713
    const/16 v32, 0x0

    :goto_0
    move/from16 v0, v32

    move/from16 v1, v30

    if-ge v0, v1, :cond_9

    .line 1714
    move-object/from16 v0, p1

    move/from16 v1, v32

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v33

    .line 1715
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz=====detailID"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_id"

    move-object/from16 v4, v33

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===index:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_data_index"

    move-object/from16 v4, v33

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

    .line 1716
    const-string v0, "dataHeader"

    move-object/from16 v1, v33

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "time"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v34

    .line 1717
    const-string v0, "dataHeader"

    move-object/from16 v1, v33

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "timeInterval"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v36

    .line 1718
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz=====timeInterval = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v36

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v34

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1719
    const-string v0, "dataHeader"

    move-object/from16 v1, v33

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "workoutDataInfoList"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v37

    .line 1720
    const-string v0, "dataHeader"

    move-object/from16 v1, v33

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "capacityBitMap"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v38

    .line 1721
    add-int v0, v20, v37

    move/from16 v20, v0

    .line 1722
    const/16 v39, 0x0

    :goto_1
    move/from16 v0, v39

    move/from16 v1, v37

    if-ge v0, v1, :cond_8

    .line 1723
    const-string v0, "dataHeader"

    move-object/from16 v1, v33

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "workoutDataInfoList"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    move/from16 v1, v39

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v40

    .line 1724
    rem-int/lit8 v0, v23, 0xc

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1725
    mul-int v0, v36, v39

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    add-long v24, v34, v0

    .line 1728
    :cond_0
    const-string v0, "data1"

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v41

    .line 1729
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz======== heart value :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v41

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1731
    const-string v0, "data2"

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v42

    .line 1732
    move/from16 v0, v42

    if-le v0, v13, :cond_1

    .line 1733
    move/from16 v13, v42

    .line 1735
    :cond_1
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========time:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    mul-int v3, v36, v39

    int-to-long v3, v3

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    add-long v3, v3, v34

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===\u8be6\u7ec6\u6570\u636e== (\u5343\u7c73/\u5c0f\u65f6)\u901f\u5ea6="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v42

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1736
    move/from16 v0, v42

    int-to-long v0, v0

    add-long/2addr v0, v14

    move-wide v14, v0

    .line 1739
    const-string v0, "data3"

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v43

    .line 1740
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========time:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    mul-int v3, v36, v39

    int-to-long v3, v3

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    add-long v3, v3, v34

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===\u8be6\u7ec6\u6570\u636e== \u6b65\u9891(data3)="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v43

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1741
    add-int v0, v17, v43

    move/from16 v17, v0

    .line 1742
    add-int v22, v22, v43

    .line 1743
    const/4 v0, 0x0

    move/from16 v1, v41

    if-ge v0, v1, :cond_2

    const/16 v0, 0xff

    move/from16 v1, v41

    if-le v0, v1, :cond_2

    .line 1744
    new-instance v44, Lcom/huawei/datatype/HeartRateData;

    invoke-direct/range {v44 .. v44}, Lcom/huawei/datatype/HeartRateData;-><init>()V

    .line 1745
    mul-int v0, v36, v39

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    add-long v0, v0, v34

    move-object/from16 v2, v44

    invoke-virtual {v2, v0, v1}, Lcom/huawei/datatype/HeartRateData;->setTime(J)V

    .line 1746
    move-object/from16 v0, v44

    move/from16 v1, v41

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/HeartRateData;->setHeartRate(I)V

    .line 1747
    move/from16 v0, v41

    int-to-long v0, v0

    add-long v0, v0, v18

    move-wide/from16 v18, v0

    .line 1748
    add-int/lit8 v21, v21, 0x1

    .line 1750
    move-object/from16 v0, v44

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1753
    :cond_2
    add-int/lit8 v23, v23, 0x1

    .line 1754
    rem-int/lit8 v0, v23, 0xc

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 1755
    new-instance v44, Lcom/huawei/datatype/StepRateData;

    invoke-direct/range {v44 .. v44}, Lcom/huawei/datatype/StepRateData;-><init>()V

    .line 1756
    move-object/from16 v0, v44

    move-wide/from16 v1, v24

    invoke-virtual {v0, v1, v2}, Lcom/huawei/datatype/StepRateData;->setTime(J)V

    .line 1757
    move-object/from16 v0, v44

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/StepRateData;->setStepRate(I)V

    .line 1758
    move-object/from16 v0, v44

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1759
    move/from16 v0, v22

    move/from16 v1, v16

    if-le v0, v1, :cond_3

    .line 1760
    move/from16 v16, v22

    .line 1761
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move/from16 v27, v0

    .line 1763
    :cond_3
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========time:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v24

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===\u8be6\u7ec6\u6570\u636e== \u6b65\u9891="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v22

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1764
    const/16 v22, 0x0

    .line 1767
    :cond_4
    const-string v0, "data2"

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v44

    .line 1768
    new-instance v45, Lcom/huawei/datatype/TrackSpeedData;

    invoke-direct/range {v45 .. v45}, Lcom/huawei/datatype/TrackSpeedData;-><init>()V

    .line 1769
    mul-int v0, v31, v36

    int-to-long v0, v0

    move-object/from16 v2, v45

    invoke-virtual {v2, v0, v1}, Lcom/huawei/datatype/TrackSpeedData;->setTime(J)V

    .line 1770
    move-object/from16 v0, v45

    move/from16 v1, v44

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/TrackSpeedData;->setRTSpeed(I)V

    .line 1771
    move-object/from16 v0, v45

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1772
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========time:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    mul-int v3, v31, v36

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===\u8be6\u7ec6\u6570\u636e== \u901f\u5ea6="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v44

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1773
    const/16 v46, -0x1

    .line 1774
    const-string v0, "workout_type"

    move-object/from16 v1, p4

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1775
    const-string v0, "workout_type"

    move-object/from16 v1, p4

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v46

    .line 1777
    :cond_5
    packed-switch v46, :pswitch_data_0

    goto/16 :goto_2

    .line 1784
    :pswitch_0
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz=====capacityBitMap \u6d77\u62d4= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v38

    const/4 v4, 0x5

    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1785
    const-string v0, "1"

    move-object/from16 v1, v38

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1786
    const-string v0, "data6"

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v47

    .line 1787
    new-instance v48, Lcom/huawei/datatype/TrackAltitudeData;

    invoke-direct/range {v48 .. v48}, Lcom/huawei/datatype/TrackAltitudeData;-><init>()V

    .line 1788
    mul-int v0, v36, v39

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    add-long v0, v0, v34

    move-object/from16 v2, v48

    invoke-virtual {v2, v0, v1}, Lcom/huawei/datatype/TrackAltitudeData;->setTime(J)V

    .line 1789
    move/from16 v0, v47

    int-to-double v0, v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    div-double/2addr v0, v2

    move-object/from16 v2, v48

    invoke-virtual {v2, v0, v1}, Lcom/huawei/datatype/TrackAltitudeData;->setAltitude(D)V

    .line 1790
    move-object/from16 v0, v48

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1791
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========time:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    mul-int v3, v36, v39

    int-to-long v3, v3

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    add-long v3, v3, v34

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===\u8be6\u7ec6\u6570\u636e== \u6d77\u62d4="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v47

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1792
    goto/16 :goto_3

    .line 1797
    :pswitch_1
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz=====capacityBitMap Swolf= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v38

    const/4 v4, 0x3

    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1798
    const-string v0, "1"

    move-object/from16 v1, v38

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1799
    const-string v0, "data4"

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v47

    .line 1800
    new-instance v48, Lcom/huawei/datatype/TrackSwolfData;

    invoke-direct/range {v48 .. v48}, Lcom/huawei/datatype/TrackSwolfData;-><init>()V

    .line 1801
    mul-int v0, v31, v36

    int-to-long v0, v0

    move-object/from16 v2, v48

    invoke-virtual {v2, v0, v1}, Lcom/huawei/datatype/TrackSwolfData;->setTime(J)V

    .line 1802
    move-object/from16 v0, v48

    move/from16 v1, v47

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/TrackSwolfData;->setSwolf(I)V

    .line 1803
    move-object/from16 v0, v48

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1804
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========time:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    mul-int v3, v31, v36

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===\u8be6\u7ec6\u6570\u636e== Swolf="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v47

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1808
    :cond_6
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz=====capacityBitMap \u5212\u6c34\u9891\u7387= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v38

    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1809
    const-string v0, "1"

    move-object/from16 v1, v38

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1810
    const-string v0, "data5"

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v47

    .line 1811
    new-instance v48, Lcom/huawei/datatype/TrackPullFreqData;

    invoke-direct/range {v48 .. v48}, Lcom/huawei/datatype/TrackPullFreqData;-><init>()V

    .line 1812
    mul-int v0, v31, v36

    int-to-long v0, v0

    move-object/from16 v2, v48

    invoke-virtual {v2, v0, v1}, Lcom/huawei/datatype/TrackPullFreqData;->setTime(J)V

    .line 1813
    move-object/from16 v0, v48

    move/from16 v1, v47

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/TrackPullFreqData;->setPullFreq(I)V

    .line 1814
    move-object/from16 v0, v48

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1815
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========time:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    mul-int v3, v31, v36

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===\u8be6\u7ec6\u6570\u636e== \u5212\u6c34\u9891\u7387="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v47

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1816
    goto :goto_3

    .line 1819
    :goto_2
    :pswitch_2
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "in default!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1822
    :cond_7
    :goto_3
    add-int/lit8 v31, v31, 0x1

    .line 1722
    add-int/lit8 v39, v39, 0x1

    goto/16 :goto_1

    .line 1713
    :cond_8
    add-int/lit8 v32, v32, 0x1

    goto/16 :goto_0

    .line 1825
    :cond_9
    rem-int/lit8 v0, v23, 0xc

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 1826
    new-instance v32, Lcom/huawei/datatype/StepRateData;

    invoke-direct/range {v32 .. v32}, Lcom/huawei/datatype/StepRateData;-><init>()V

    .line 1827
    move-object/from16 v0, v32

    move-wide/from16 v1, v24

    invoke-virtual {v0, v1, v2}, Lcom/huawei/datatype/StepRateData;->setTime(J)V

    .line 1828
    move-object/from16 v0, v32

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/StepRateData;->setStepRate(I)V

    .line 1829
    move-object/from16 v0, v32

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1830
    move/from16 v0, v22

    move/from16 v1, v16

    if-le v0, v1, :cond_a

    .line 1831
    move/from16 v16, v22

    .line 1832
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move/from16 v27, v0

    .line 1834
    :cond_a
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========time:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v24

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===\u8be6\u7ec6\u6570\u636e== \u6b65\u9891="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v22

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1838
    :cond_b
    goto :goto_4

    .line 1836
    :catch_0
    move-exception v32

    .line 1837
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v32 .. v32}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1840
    :goto_4
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "summaryTotalStep="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v26

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", iTotalStep="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v17

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", totaltime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-wide/16 v3, 0x3e8

    div-long v3, v28, v3

    const-wide/16 v5, 0x3c

    div-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1842
    move/from16 v0, v26

    move/from16 v1, v17

    if-le v0, v1, :cond_d

    sub-int v0, v26, v17

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    div-long v2, v28, v2

    const-wide/16 v4, 0x3c

    div-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_d

    .line 1843
    sub-int v0, v26, v17

    int-to-float v0, v0

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v1, v0

    move/from16 v32, v1

    .line 1844
    const/16 v33, 0x0

    :goto_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    move/from16 v1, v33

    if-ge v1, v0, :cond_c

    .line 1845
    move/from16 v0, v33

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/StepRateData;

    move/from16 v1, v33

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/StepRateData;

    invoke-virtual {v1}, Lcom/huawei/datatype/StepRateData;->getStepRate()I

    move-result v1

    add-int v1, v1, v32

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/StepRateData;->setStepRate(I)V

    .line 1844
    add-int/lit8 v33, v33, 0x1

    goto :goto_5

    .line 1847
    :cond_c
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    move/from16 v1, v27

    if-ge v1, v0, :cond_d

    .line 1848
    move/from16 v0, v27

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/StepRateData;

    invoke-virtual {v0}, Lcom/huawei/datatype/StepRateData;->getStepRate()I

    move-result v16

    .line 1852
    :cond_d
    move-object/from16 v0, p2

    invoke-virtual {v0, v7}, Lcom/huawei/datatype/MotionPath;->setHeartRateList(Ljava/util/ArrayList;)V

    .line 1853
    move-object/from16 v0, p2

    invoke-virtual {v0, v8}, Lcom/huawei/datatype/MotionPath;->setStepRateList(Ljava/util/ArrayList;)V

    .line 1854
    move-object/from16 v0, p2

    invoke-virtual {v0, v9}, Lcom/huawei/datatype/MotionPath;->setAltitudeList(Ljava/util/ArrayList;)V

    .line 1855
    move-object/from16 v0, p2

    invoke-virtual {v0, v10}, Lcom/huawei/datatype/MotionPath;->setSwolfList(Ljava/util/ArrayList;)V

    .line 1856
    move-object/from16 v0, p2

    invoke-virtual {v0, v11}, Lcom/huawei/datatype/MotionPath;->setPullFreqList(Ljava/util/ArrayList;)V

    .line 1857
    move-object/from16 v0, p2

    invoke-virtual {v0, v12}, Lcom/huawei/datatype/MotionPath;->setSpeedList(Ljava/util/ArrayList;)V

    .line 1861
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

    move-result-object v32

    .line 1862
    move-object/from16 v0, p3

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setSportId(Ljava/lang/String;)V

    .line 1863
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========sportId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v32

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

    .line 1866
    move-object/from16 v0, p3

    const/16 v1, 0x102

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setSportType(I)V

    .line 1868
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v14

    if-nez v0, :cond_e

    .line 1869
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgPace(F)V

    goto :goto_6

    .line 1871
    :cond_e
    long-to-float v0, v14

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    move/from16 v1, v20

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x45610000    # 3600.0f

    div-float v0, v1, v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgPace(F)V

    .line 1873
    :goto_6
    const-string v0, "HWExerciseAdviceManager"

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

    .line 1875
    const/4 v0, 0x0

    if-ne v0, v13, :cond_f

    .line 1876
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setBestPace(F)V

    goto :goto_7

    .line 1878
    :cond_f
    int-to-float v0, v13

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x45610000    # 3600.0f

    div-float v0, v1, v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setBestPace(F)V

    .line 1880
    :goto_7
    const-string v0, "HWExerciseAdviceManager"

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

    .line 1882
    const/4 v0, 0x0

    move/from16 v1, v21

    if-ne v0, v1, :cond_10

    .line 1883
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgHeartRate(I)V

    goto :goto_8

    .line 1885
    :cond_10
    move/from16 v0, v21

    int-to-long v0, v0

    div-long v0, v18, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v33

    .line 1886
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Long;->intValue()I

    move-result v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgHeartRate(I)V

    .line 1888
    :goto_8
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz====="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v18

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

    .line 1890
    move/from16 v0, v17

    int-to-float v0, v0

    move/from16 v1, v20

    int-to-float v1, v1

    const/high16 v2, 0x40a00000    # 5.0f

    mul-float/2addr v1, v2

    div-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    mul-float/2addr v0, v1

    float-to-int v1, v0

    move/from16 v33, v1

    .line 1891
    move-object/from16 v0, p3

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgStepRate(I)V

    .line 1892
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========avgStep:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v33

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

    .line 1894
    move-object/from16 v0, p3

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setBestStepRate(I)V

    .line 1895
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========BestStep:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v16

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

    .line 1897
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->hwDeviceMgr:Lo/dea;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->getTrackTypeByClassification(Lo/dea;)I

    move-result v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTrackType(I)V

    .line 1899
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method private printWorkoutRecordInfo()V
    .locals 6

    .line 2984
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "printWorkoutRecordInfo enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2986
    const/4 v4, 0x0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordsStatistic:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 2987
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordsStatistic:Landroid/util/SparseArray;

    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lorg/json/JSONObject;

    .line 2988
    const-string v0, "HWExerciseAdviceManager"

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

    .line 2989
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

    .line 2990
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

    .line 2991
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

    .line 2992
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

    .line 2993
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

    .line 2994
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

    .line 2995
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

    .line 2988
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2986
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 2999
    :cond_0
    goto :goto_1

    .line 2997
    :catch_0
    move-exception v4

    .line 2998
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3000
    :goto_1
    return-void
.end method

.method private printWorkoutRecordSectionInfo()V
    .locals 8

    .line 3006
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "printWorkoutRecordSectionInfo enter. mSectionRecordsStatisticJsonObjects.size="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSectionRecordsStatisticJsonObjects:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3008
    const/4 v4, 0x0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSectionRecordsStatisticJsonObjects:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 3009
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSectionRecordsStatisticJsonObjects:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lorg/json/JSONArray;

    .line 3010
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "printWorkoutRecordSectionInfo ==zz=,section_struct.length() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 3011
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 3010
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3012
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 3013
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 3014
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ",distance="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "distance"

    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",unit="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "unit"

    .line 3015
    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",pace="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "pace"

    .line 3016
    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",point_index="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "point_index"

    .line 3017
    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",section_num="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "section_num"

    .line 3018
    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",swim_type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_type"

    .line 3019
    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",swim_pull_times="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_pull_times"

    .line 3020
    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",swim_avg_swolf="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_avg_swolf"

    .line 3021
    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",swim_time="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_time"

    .line 3022
    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 3014
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3012
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_1

    .line 3008
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 3027
    :cond_1
    goto :goto_2

    .line 3025
    :catch_0
    move-exception v4

    .line 3026
    invoke-virtual {v4}, Lorg/json/JSONException;->printStackTrace()V

    .line 3028
    :goto_2
    return-void
.end method

.method private saveData(I)V
    .locals 20

    .line 554
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->e(I)V

    .line 555
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSaveDataItemNum:I

    .line 557
    const/4 v8, 0x0

    .line 558
    const/4 v9, 0x0

    .line 559
    move-object/from16 v0, p0

    move/from16 v1, p1

    :try_start_0
    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->isRunPlanRecord(I)Z

    move-result v0

    if-nez v0, :cond_9

    .line 560
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecord:Lorg/json/JSONObject;

    if-eqz v0, :cond_13

    .line 562
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecord:Lorg/json/JSONObject;

    const-string v1, "workoutRecordStructList"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v10

    .line 564
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_0

    .line 565
    const/4 v8, 0x1

    .line 569
    :cond_0
    move/from16 v11, p1

    .line 571
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========   \u4fdd\u5b58\uff1a=recordid"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mWorkoutRecordsStatistic:Landroid/util/SparseArray;

    invoke-virtual {v0, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lorg/json/JSONObject;

    .line 579
    new-instance v13, Lorg/json/JSONArray;

    invoke-direct {v13}, Lorg/json/JSONArray;-><init>()V

    .line 580
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutDetailData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lorg/json/JSONObject;

    .line 581
    const-string v0, "workout_record_id"

    invoke-virtual {v15, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-ne v11, v0, :cond_1

    .line 582
    invoke-virtual {v13, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 584
    :cond_1
    goto :goto_0

    .line 586
    :cond_2
    new-instance v14, Lorg/json/JSONArray;

    invoke-direct {v14}, Lorg/json/JSONArray;-><init>()V

    .line 587
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutRecordPaceMapList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lorg/json/JSONObject;

    .line 588
    const-string v0, "workout_record_id"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-ne v11, v0, :cond_3

    .line 590
    move-object/from16 v0, v16

    invoke-virtual {v14, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 592
    :cond_3
    goto :goto_1

    .line 593
    :cond_4
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 594
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutRecordSectionMapList:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 595
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutRecordSectionMapList:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-interface {v15, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 596
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz=========fenduan sectionArrayList size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v15}, Ljava/util/List;->size()I

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 599
    :cond_5
    const-string v0, "HWExerciseAdviceManager"

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

    .line 600
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mapGPSWorkout:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 601
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz=========mapGPSWorkout size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mapGPSWorkout:Ljava/util/Map;

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

    .line 604
    :cond_6
    const-string v0, "workout_type"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->checkSupportWorkoutType(I)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 605
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSaveDataItemNum:I

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSaveDataItemNum:I

    .line 606
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mapGPSWorkoutAndRunPlanType:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Ljava/lang/Integer;

    .line 607
    const/16 v17, -0x1

    .line 608
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_7

    .line 609
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v17

    .line 611
    :cond_7
    move-object/from16 v0, p0

    move-object v1, v12

    move-object v2, v13

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mapGPSWorkout:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    move/from16 v4, v17

    move-object v5, v14

    move-object v6, v15

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->saveDatatoTrack(Lorg/json/JSONObject;Lorg/json/JSONArray;Ljava/util/Map;ILorg/json/JSONArray;Ljava/util/List;Ljava/lang/String;)V

    .line 613
    :cond_8
    goto/16 :goto_6

    .line 616
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecord:Lorg/json/JSONObject;

    if-eqz v0, :cond_13

    .line 617
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecord:Lorg/json/JSONObject;

    const-string v1, "runPlanRecordStructList"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v10

    .line 619
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_a

    .line 620
    const/4 v9, 0x1

    .line 625
    :cond_a
    move/from16 v11, p1

    .line 628
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanRecordsStatistic:Landroid/util/SparseArray;

    invoke-virtual {v0, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lorg/json/JSONObject;

    .line 629
    new-instance v13, Lorg/json/JSONArray;

    invoke-direct {v13}, Lorg/json/JSONArray;-><init>()V

    .line 630
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutDetailData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lorg/json/JSONObject;

    .line 631
    const-string v0, "workout_record_id"

    invoke-virtual {v15, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-ne v11, v0, :cond_b

    .line 632
    invoke-virtual {v13, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 634
    :cond_b
    goto :goto_2

    .line 636
    :cond_c
    new-instance v14, Lorg/json/JSONArray;

    invoke-direct {v14}, Lorg/json/JSONArray;-><init>()V

    .line 637
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutRecordPaceMapList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_3
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lorg/json/JSONObject;

    .line 638
    const-string v0, "workout_record_id"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-ne v11, v0, :cond_d

    .line 639
    move-object/from16 v0, v16

    invoke-virtual {v14, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 641
    :cond_d
    goto :goto_3

    .line 643
    :cond_e
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz=========runplan_workout_id:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 644
    const-string v0, "HWExerciseAdviceManager"

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

    .line 645
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mapGPSWorkout:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_f

    .line 646
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz=========mapGPSWorkout size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mapGPSWorkout:Ljava/util/Map;

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

    .line 648
    :cond_f
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSaveDataItemNum:I

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mSaveDataItemNum:I

    .line 650
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mapGPSWorkoutAndRunPlanType:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ljava/lang/Integer;

    .line 651
    const/16 v16, -0x1

    .line 652
    const/4 v0, 0x0

    if-eq v0, v15, :cond_10

    .line 653
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v16

    .line 657
    :cond_10
    const/16 v17, 0x0

    .line 658
    const/16 v18, 0x0

    :goto_4
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v0

    move/from16 v1, v18

    if-ge v1, v0, :cond_12

    .line 659
    move/from16 v0, v18

    invoke-virtual {v10, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "run_plan_record_id"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v19

    .line 660
    move/from16 v0, v19

    if-ne v11, v0, :cond_11

    .line 661
    move/from16 v0, v18

    invoke-virtual {v10, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "run_plan_workout_id"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v17

    .line 662
    goto :goto_5

    .line 658
    :cond_11
    add-int/lit8 v18, v18, 0x1

    goto :goto_4

    .line 665
    :cond_12
    :goto_5
    move-object/from16 v0, p0

    move-object v1, v12

    move-object v2, v13

    move/from16 v3, v17

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mapGPSWorkout:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    move/from16 v5, v16

    move-object v6, v14

    invoke-direct/range {v0 .. v6}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->saveDatatoTrack(Lorg/json/JSONObject;Lorg/json/JSONArray;ILjava/util/Map;ILorg/json/JSONArray;)V

    .line 669
    :cond_13
    :goto_6
    if-nez v9, :cond_14

    if-eqz v8, :cond_15

    .line 670
    :cond_14
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->currentTime:J

    invoke-static {v0, v1}, Lo/ddn;->e(J)V

    .line 671
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateExerciseInsertTime"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-wide v3, v3, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->currentTime:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 677
    :cond_15
    goto :goto_7

    .line 673
    :catch_0
    move-exception v8

    .line 674
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 677
    goto :goto_7

    .line 675
    :catch_1
    move-exception v8

    .line 676
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save data error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 678
    :goto_7
    return-void
.end method

.method private saveDatatoTrack(Lorg/json/JSONObject;Lorg/json/JSONArray;ILjava/util/Map;ILorg/json/JSONArray;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONObject;Lorg/json/JSONArray;ILjava/util/Map<Ljava/lang/Long;[D>;ILorg/json/JSONArray;)V"
        }
    .end annotation

    .line 738
    new-instance v5, Lcom/huawei/datatype/MotionPath;

    invoke-direct {v5}, Lcom/huawei/datatype/MotionPath;-><init>()V

    .line 740
    new-instance v6, Lcom/huawei/datatype/MotionPathSimplify;

    invoke-direct {v6}, Lcom/huawei/datatype/MotionPathSimplify;-><init>()V

    .line 742
    move-object/from16 v0, p0

    move/from16 v1, p5

    move-object/from16 v2, p4

    invoke-direct {v0, v1, v6, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->setMapType(ILcom/huawei/datatype/MotionPathSimplify;Ljava/util/Map;)V

    .line 744
    const/4 v0, 0x0

    move-object/from16 v1, p4

    if-eq v0, v1, :cond_0

    .line 745
    move-object/from16 v0, p4

    invoke-virtual {v5, v0}, Lcom/huawei/datatype/MotionPath;->setLbsDataMap(Ljava/util/Map;)V

    .line 748
    :cond_0
    const-string v0, "run_plan_record_info_exercise_duration"

    move-object/from16 v1, p1

    :try_start_0
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    long-to-int v7, v0

    .line 749
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 750
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 751
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDatatoTrack paceArray"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 752
    const/4 v0, 0x0

    move-object/from16 v1, p6

    if-eq v0, v1, :cond_1

    .line 753
    move-object/from16 v0, p0

    move-object/from16 v1, p6

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->changePaceMapStruct(Lorg/json/JSONArray;I)Ljava/util/Map;

    move-result-object v10

    .line 754
    invoke-virtual {v5, v10}, Lcom/huawei/datatype/MotionPath;->setPaceMap(Ljava/util/Map;)V

    .line 755
    invoke-virtual {v6, v10}, Lcom/huawei/datatype/MotionPathSimplify;->setPaceMap(Ljava/util/Map;)V

    .line 756
    move-object/from16 v0, p0

    move-object/from16 v1, p6

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->changePaceMapStruct(Lorg/json/JSONArray;I)Ljava/util/Map;

    move-result-object v11

    .line 757
    invoke-virtual {v5, v11}, Lcom/huawei/datatype/MotionPath;->setBritishPaceMap(Ljava/util/Map;)V

    .line 758
    invoke-virtual {v6, v11}, Lcom/huawei/datatype/MotionPathSimplify;->setBritishPaceMap(Ljava/util/Map;)V

    .line 760
    div-int/lit16 v0, v7, 0x3e8

    move-object/from16 v1, p0

    move-object/from16 v2, p6

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->changePartTimePaceMapStruct(Lorg/json/JSONArray;II)Ljava/util/Map;

    move-result-object v8

    .line 761
    div-int/lit16 v0, v7, 0x3e8

    move-object/from16 v1, p0

    move-object/from16 v2, p6

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->changePartTimePaceMapStruct(Lorg/json/JSONArray;II)Ljava/util/Map;

    move-result-object v9

    .line 765
    :cond_1
    const-string v0, "half_marathon_time"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v10

    .line 766
    const-string v0, "total_marathon_time"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v12

    .line 767
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RunPlan--halg_marathon:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",marathon "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 768
    const-wide/16 v0, 0x0

    cmpg-double v0, v0, v10

    if-gez v0, :cond_2

    .line 769
    const-wide v0, 0x403518f5c28f5c29L    # 21.0975

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 770
    const-wide v0, 0x402a3850268900c5L    # 13.1099865

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 772
    :cond_2
    const-wide/16 v0, 0x0

    cmpg-double v0, v0, v12

    if-gez v0, :cond_3

    .line 773
    const-wide v0, 0x404518f5c28f5c29L    # 42.195

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 774
    const-wide v0, 0x403a3850268900c5L    # 26.219973

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 776
    :cond_3
    invoke-virtual {v6, v8}, Lcom/huawei/datatype/MotionPathSimplify;->setPartTimeMap(Ljava/util/Map;)V

    .line 777
    invoke-virtual {v6, v9}, Lcom/huawei/datatype/MotionPathSimplify;->setBritishPartTimeMap(Ljava/util/Map;)V

    .line 780
    const-string v0, "run_plan_record_info_step"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalSteps(I)V

    .line 782
    int-to-long v0, v7

    invoke-virtual {v6, v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalTime(J)V

    .line 785
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p1

    invoke-direct {v0, v1, v5, v6, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->packTrackData(Lorg/json/JSONArray;Lcom/huawei/datatype/MotionPath;Lcom/huawei/datatype/MotionPathSimplify;Lorg/json/JSONObject;)V

    .line 787
    new-instance v14, Lcom/huawei/datatype/WorkoutDisplayInfo;

    invoke-direct {v14}, Lcom/huawei/datatype/WorkoutDisplayInfo;-><init>()V

    .line 788
    move-object/from16 v0, p0

    const/4 v1, 0x1

    move-object/from16 v2, p4

    invoke-direct {v0, v1, v2, v14}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->checkWorkoutDisplayInfo(ILjava/util/Map;Lcom/huawei/datatype/WorkoutDisplayInfo;)V

    .line 789
    invoke-virtual {v14}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getChiefSportDataType()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setChiefSportDataType(I)V

    .line 790
    invoke-virtual {v14}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getFreeMotion()Z

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setIsFreeMotion(Z)V

    .line 791
    invoke-virtual {v14}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getWorkoutType()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setSportType(I)V

    .line 792
    invoke-virtual {v14}, Lcom/huawei/datatype/WorkoutDisplayInfo;->isHasTrackPoint()Z

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setHasTrackPoint(Z)V

    .line 793
    invoke-virtual {v14}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getSportDataSource()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setSportDataSource(I)V

    .line 796
    const-string v0, "run_plan_record_info_start_time"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setStartTime(J)V

    .line 797
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========startTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_start_time"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

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

    .line 799
    const-string v0, "run_plan_record_info_end_time"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setEndTime(J)V

    .line 800
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========endTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_end_time"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

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

    .line 802
    const-string v0, "run_plan_record_info_HrABS_max"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setMaxHeartRate(I)V

    .line 804
    const-string v0, "run_plan_record_info_HrABS_min"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setMinHeartRate(I)V

    .line 806
    const-string v0, "run_plan_record_info_distance"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalDistance(I)V

    .line 808
    const-string v0, "run_plan_record_info_calorie"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalCalories(I)V

    .line 811
    const-string v0, "run_plan_record_info_climb"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setCreepingWave(F)V

    .line 814
    const-string v0, "run_plan_record_info_distance"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 815
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========run record speed:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "run_plan_record_info_speed"

    move-object/from16 v4, p1

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

    .line 816
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgPace(F)V

    goto :goto_0

    .line 818
    :cond_4
    const-string v0, "run_plan_record_info_distance"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    const-string v1, "run_plan_record_info_exercise_duration"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    long-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float v0, v1, v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgPace(F)V

    .line 821
    :goto_0
    const-string v0, "run_plan_record_info_step"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    int-to-float v0, v0

    const-string v1, "run_plan_record_info_exercise_duration"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    long-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgStepRate(I)V

    .line 822
    const-string v0, "swolf_base_km"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "swolf_base_mile"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 824
    const-string v0, "swolf_base_km"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setSwolfBase(F)V

    .line 826
    const-string v0, "swolf_base_mile"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setBritishSwolfBase(F)V

    .line 828
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========run record setSwolfBase:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swolf_base_km"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x41200000    # 10.0f

    div-float/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " setBritishSwolfBase:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swolf_base_mile"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x41200000    # 10.0f

    div-float/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 830
    :cond_5
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=====zz========run record no swolf"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 833
    :goto_1
    const-string v0, "highest_altitude"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 835
    const-string v0, "highest_altitude"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setMaxAlti(F)V

    .line 837
    :cond_6
    const-string v0, "lowest_altitude"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 839
    const-string v0, "lowest_altitude"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setMinAlti(F)V

    .line 841
    :cond_7
    const-string v0, "accumulative_drop_height"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 843
    const-string v0, "accumulative_drop_height"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalDescent(F)V

    .line 848
    :cond_8
    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    .line 849
    const-string v0, "record_id"

    const-string v1, "run_plan_record_info_id"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 850
    const-string v0, "status"

    const-string v1, "run_plan_record_info_status"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 851
    const-string v0, "load_peak"

    const-string v1, "run_plan_record_info_load_peak"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 852
    const-string v0, "etraining_effect"

    const-string v1, "run_plan_record_info_etraining_effect"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 853
    const-string v0, "extra_poc"

    const-string v1, "run_plan_record_info_Epoc"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 854
    const-string v0, "max_met"

    const-string v1, "run_plan_record_info_maxMET"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 855
    const-string v0, "recovery_time"

    const-string v1, "run_plan_record_info_recovery_time"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 856
    const-string v0, "achieve_percent"

    const-string v1, "run_plan_record_info_achieve_percent"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 857
    invoke-virtual {v6, v15}, Lcom/huawei/datatype/MotionPathSimplify;->setSportData(Ljava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 859
    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->iCallbackInterface:Lo/aau;

    if-eqz v0, :cond_a

    .line 860
    new-instance v16, Lcom/google/gson/Gson;

    invoke-direct/range {v16 .. v16}, Lcom/google/gson/Gson;-><init>()V

    .line 861
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->iCallbackInterface:Lo/aau;

    move-object/from16 v1, v16

    invoke-virtual {v1, v6}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move/from16 v2, p3

    invoke-interface {v0, v1, v2}, Lo/aau;->a(Ljava/lang/String;I)Ljava/util/Map;

    move-result-object v17

    .line 862
    const-string v0, "track_run_curenttime"

    move-object/from16 v1, v17

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 863
    const-string v0, "track_run_curenttime"

    const-string v1, "track_run_curenttime"

    move-object/from16 v2, v17

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 865
    :cond_9
    const-string v0, "track_run_pretime"

    move-object/from16 v1, v17

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 866
    const-string v0, "track_run_pretime"

    const-string v1, "track_run_pretime"

    move-object/from16 v2, v17

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 871
    :cond_a
    goto :goto_2

    .line 869
    :catch_0
    move-exception v16

    .line 870
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v16 .. v16}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 872
    :goto_2
    invoke-virtual {v6, v15}, Lcom/huawei/datatype/MotionPathSimplify;->setSportData(Ljava/util/Map;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 876
    goto :goto_3

    .line 873
    :catch_1
    move-exception v7

    .line 874
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 879
    :goto_3
    move-object/from16 v0, p0

    invoke-virtual {v0, v6, v5}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->saveTrackData(Lcom/huawei/datatype/MotionPathSimplify;Lcom/huawei/datatype/MotionPath;)I

    .line 881
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save runPlan Record DatatoTrack finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 883
    return-void
.end method

.method private saveDatatoTrack(Lorg/json/JSONObject;Lorg/json/JSONArray;Ljava/util/Map;ILorg/json/JSONArray;Ljava/util/List;Ljava/lang/String;)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONObject;Lorg/json/JSONArray;Ljava/util/Map<Ljava/lang/Long;[D>;ILorg/json/JSONArray;Ljava/util/List<Lorg/json/JSONArray;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 1424
    new-instance v5, Lcom/huawei/datatype/MotionPath;

    invoke-direct {v5}, Lcom/huawei/datatype/MotionPath;-><init>()V

    .line 1425
    const/4 v0, 0x0

    move-object/from16 v1, p3

    if-eq v0, v1, :cond_0

    .line 1426
    move-object/from16 v0, p3

    invoke-virtual {v5, v0}, Lcom/huawei/datatype/MotionPath;->setLbsDataMap(Ljava/util/Map;)V

    .line 1429
    :cond_0
    new-instance v6, Lcom/huawei/datatype/MotionPathSimplify;

    invoke-direct {v6}, Lcom/huawei/datatype/MotionPathSimplify;-><init>()V

    .line 1430
    move-object/from16 v0, p0

    move/from16 v1, p4

    move-object/from16 v2, p3

    invoke-direct {v0, v1, v6, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->setMapType(ILcom/huawei/datatype/MotionPathSimplify;Ljava/util/Map;)V

    .line 1432
    const-string v0, "workout_exercise_duration"

    move-object/from16 v1, p1

    :try_start_0
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    long-to-int v7, v0

    .line 1433
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 1434
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 1435
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDatatoTrack  workout paceArray"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1436
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_1

    .line 1437
    move-object/from16 v0, p0

    move-object/from16 v1, p5

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->changePaceMapStruct(Lorg/json/JSONArray;I)Ljava/util/Map;

    move-result-object v10

    .line 1438
    invoke-virtual {v5, v10}, Lcom/huawei/datatype/MotionPath;->setPaceMap(Ljava/util/Map;)V

    .line 1439
    invoke-virtual {v6, v10}, Lcom/huawei/datatype/MotionPathSimplify;->setPaceMap(Ljava/util/Map;)V

    .line 1440
    move-object/from16 v0, p0

    move-object/from16 v1, p5

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->changePaceMapStruct(Lorg/json/JSONArray;I)Ljava/util/Map;

    move-result-object v11

    .line 1441
    invoke-virtual {v5, v11}, Lcom/huawei/datatype/MotionPath;->setBritishPaceMap(Ljava/util/Map;)V

    .line 1442
    invoke-virtual {v6, v11}, Lcom/huawei/datatype/MotionPathSimplify;->setBritishPaceMap(Ljava/util/Map;)V

    .line 1444
    div-int/lit16 v0, v7, 0x3e8

    move-object/from16 v1, p0

    move-object/from16 v2, p5

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->changePartTimePaceMapStruct(Lorg/json/JSONArray;II)Ljava/util/Map;

    move-result-object v8

    .line 1445
    div-int/lit16 v0, v7, 0x3e8

    move-object/from16 v1, p0

    move-object/from16 v2, p5

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->changePartTimePaceMapStruct(Lorg/json/JSONArray;II)Ljava/util/Map;

    move-result-object v9

    .line 1448
    :cond_1
    const-string v0, "half_marathon_time"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v10

    .line 1449
    const-string v0, "total_marathon_time"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v12

    .line 1450
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "halg_marathon:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",marathon "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1451
    const-wide/16 v0, 0x0

    cmpg-double v0, v0, v10

    if-gez v0, :cond_2

    .line 1452
    const-wide v0, 0x403518f5c28f5c29L    # 21.0975

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1453
    const-wide v0, 0x402a3850268900c5L    # 13.1099865

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1455
    :cond_2
    const-wide/16 v0, 0x0

    cmpg-double v0, v0, v12

    if-gez v0, :cond_3

    .line 1456
    const-wide v0, 0x404518f5c28f5c29L    # 42.195

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1457
    const-wide v0, 0x403a3850268900c5L    # 26.219973

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1459
    :cond_3
    invoke-virtual {v6, v8}, Lcom/huawei/datatype/MotionPathSimplify;->setPartTimeMap(Ljava/util/Map;)V

    .line 1460
    invoke-virtual {v6, v9}, Lcom/huawei/datatype/MotionPathSimplify;->setBritishPartTimeMap(Ljava/util/Map;)V

    .line 1464
    int-to-long v0, v7

    invoke-virtual {v6, v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalTime(J)V

    .line 1466
    const-string v0, "workout_record_step"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalSteps(I)V

    .line 1468
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p1

    invoke-direct {v0, v1, v5, v6, v2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->packTrackData(Lorg/json/JSONArray;Lcom/huawei/datatype/MotionPath;Lcom/huawei/datatype/MotionPathSimplify;Lorg/json/JSONObject;)V

    .line 1470
    new-instance v14, Lcom/huawei/datatype/WorkoutDisplayInfo;

    invoke-direct {v14}, Lcom/huawei/datatype/WorkoutDisplayInfo;-><init>()V

    .line 1471
    const-string v0, "workout_type"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    invoke-direct {v1, v0, v2, v14}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->checkWorkoutDisplayInfo(ILjava/util/Map;Lcom/huawei/datatype/WorkoutDisplayInfo;)V

    .line 1472
    invoke-virtual {v14}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getChiefSportDataType()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setChiefSportDataType(I)V

    .line 1473
    invoke-virtual {v14}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getFreeMotion()Z

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setIsFreeMotion(Z)V

    .line 1474
    invoke-virtual {v14}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getWorkoutType()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setSportType(I)V

    .line 1475
    invoke-virtual {v14}, Lcom/huawei/datatype/WorkoutDisplayInfo;->isHasTrackPoint()Z

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setHasTrackPoint(Z)V

    .line 1478
    const-string v0, "record_flag"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v15

    .line 1479
    const/4 v0, 0x1

    if-ne v0, v15, :cond_4

    .line 1480
    const/4 v0, 0x4

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setSportDataSource(I)V

    goto :goto_0

    .line 1482
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setSportDataSource(I)V

    .line 1484
    :goto_0
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========workout_type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getWorkoutType()I

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

    .line 1486
    const-string v0, "workout_heart_rate_type"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v16

    .line 1487
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========workout_heart_rate_type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v16

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1488
    const/4 v0, 0x1

    move/from16 v1, v16

    if-ne v0, v1, :cond_5

    .line 1489
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setHeartrateZoneType(I)V

    goto :goto_1

    .line 1490
    :cond_5
    const/4 v0, 0x0

    move/from16 v1, v16

    if-ne v0, v1, :cond_6

    .line 1491
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setHeartrateZoneType(I)V

    goto :goto_1

    .line 1493
    :cond_6
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setHeartrateZoneType(I)V

    .line 1496
    :goto_1
    const-string v0, "workout_exercise_id"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1498
    const-string v0, "workout_exercise_id"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 1499
    move-object/from16 v0, v17

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setRuncourseId(Ljava/lang/String;)V

    .line 1500
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========workout_exercise_id:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v17

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

    .line 1504
    :cond_7
    const-string v0, "workout_record_start_time"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setStartTime(J)V

    .line 1505
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========startTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_start_time"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

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

    .line 1507
    const-string v0, "workout_record_end_time"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setEndTime(J)V

    .line 1508
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========endTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_end_time"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

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

    .line 1510
    const-string v0, "workout_HrABS_peak_max"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setMaxHeartRate(I)V

    .line 1512
    const-string v0, "workout_HrABS_peak_min"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setMinHeartRate(I)V

    .line 1514
    const-string v0, "workout_record_distance"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalDistance(I)V

    .line 1516
    const-string v0, "workout_record_calorie"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalCalories(I)V

    .line 1518
    const-string v0, "workout_exercise_duration"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalTime(J)V

    .line 1519
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========exercise_duration:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_exercise_duration"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

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

    .line 1521
    const-string v0, "workout_climb"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-float v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setCreepingWave(F)V

    .line 1523
    const-string v0, "workout_record_step"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalSteps(I)V

    .line 1525
    const-string v0, "workout_record_distance"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_8

    .line 1526
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========record speed:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "workout_record_speed"

    move-object/from16 v4, p1

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

    .line 1527
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgPace(F)V

    goto :goto_2

    .line 1529
    :cond_8
    const-string v0, "workout_record_distance"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    const-string v1, "workout_exercise_duration"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    long-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float v0, v1, v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgPace(F)V

    .line 1532
    :goto_2
    const-string v0, "workout_record_step"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    int-to-float v0, v0

    const-string v1, "workout_exercise_duration"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    long-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgStepRate(I)V

    .line 1535
    invoke-virtual {v14}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getWorkoutType()I

    move-result v0

    const/16 v1, 0x106

    if-eq v1, v0, :cond_9

    .line 1536
    invoke-virtual {v14}, Lcom/huawei/datatype/WorkoutDisplayInfo;->getWorkoutType()I

    move-result v0

    const/16 v1, 0x10a

    if-ne v1, v0, :cond_c

    .line 1540
    :cond_9
    const-string v0, "workout_record_distance"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v17

    .line 1542
    const/4 v0, 0x0

    move/from16 v1, v17

    if-eq v0, v1, :cond_a

    .line 1543
    int-to-float v0, v7

    move/from16 v1, v17

    int-to-float v1, v1

    div-float v18, v0, v1

    .line 1544
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, speed_float:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v18

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1545
    move/from16 v0, v18

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgPace(F)V

    .line 1546
    goto :goto_3

    .line 1547
    :cond_a
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, speed: distance is 0,distance/totaltime (\u5355\u4f4d\u4e3a\u79d2/\u516c\u91cc)= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    int-to-float v3, v7

    move/from16 v4, v17

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1548
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setAvgPace(F)V

    .line 1552
    :goto_3
    const-string v0, "workout_record_distance"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v18

    .line 1553
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, distance_swim:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v18

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1554
    const/4 v0, 0x0

    move/from16 v1, v18

    if-ne v0, v1, :cond_b

    .line 1555
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setChiefSportDataType(I)V

    goto :goto_4

    .line 1557
    :cond_b
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setChiefSportDataType(I)V

    .line 1562
    :cond_c
    :goto_4
    const-string v0, "swolf_base_km"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setSwolfBase(F)V

    .line 1564
    const-string v0, "swolf_base_mile"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setBritishSwolfBase(F)V

    .line 1566
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========record setSwolfBase:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swolf_base_km"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x41200000    # 10.0f

    div-float/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " setBritishSwolfBase:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swolf_base_mile"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x41200000    # 10.0f

    div-float/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1569
    const-string v0, "highest_altitude"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setMaxAlti(F)V

    .line 1571
    const-string v0, "lowest_altitude"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setMinAlti(F)V

    .line 1573
    const-string v0, "accumulative_drop_height"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setTotalDescent(F)V

    .line 1575
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====zz========record setmMaxAlti:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "highest_altitude"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x41200000    # 10.0f

    div-float/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " setmMinAlti:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "lowest_altitude"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x41200000    # 10.0f

    div-float/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " setTotalDistance:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "accumulative_drop_height"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1578
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    .line 1579
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 1580
    const/16 v19, 0x0

    :goto_5
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v19

    if-ge v1, v0, :cond_f

    .line 1581
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter fori sectionArrayList.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface/range {p6 .. p6}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v19

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1582
    move-object/from16 v0, p6

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lorg/json/JSONArray;

    .line 1583
    const/16 v21, 0x0

    :goto_6
    invoke-virtual/range {v20 .. v20}, Lorg/json/JSONArray;->length()I

    move-result v0

    move/from16 v1, v21

    if-ge v1, v0, :cond_e

    .line 1584
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter fori section_struct.length() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v20 .. v20}, Lorg/json/JSONArray;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", j = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v21

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1585
    move-object/from16 v0, v20

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v22

    .line 1586
    const/16 v23, 0x0

    .line 1587
    new-instance v23, Lcom/huawei/hihealth/data/model/TrackSwimSegment;

    invoke-direct/range {v23 .. v23}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;-><init>()V

    .line 1588
    const-string v0, "section_num"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->saveSegmentIndex(I)V

    .line 1589
    const-string v0, "distance"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v24

    .line 1590
    const-string v0, "swim_time"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->saveDuration(I)V

    .line 1591
    const-string v0, "pace"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->savePace(I)V

    .line 1592
    const-string v0, "swim_pull_times"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->savePullTimes(I)V

    .line 1593
    const-string v0, "swim_avg_swolf"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->saveSwolf(I)V

    .line 1594
    const-string v0, "swim_type"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->saveStrokeType(I)V

    .line 1595
    const-string v0, "point_index"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->saveLocationIndex(I)V

    .line 1598
    const-string v0, "unit"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_d

    .line 1599
    move-object/from16 v0, v23

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->saveDistance(I)V

    .line 1600
    move-object/from16 v0, v17

    move-object/from16 v1, v23

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1601
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mSwimSegments.add"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_7

    .line 1603
    :cond_d
    new-instance v0, Ljava/math/BigDecimal;

    move/from16 v1, v24

    int-to-double v1, v1

    const/4 v3, 0x2

    invoke-static {v1, v2, v3}, Lo/cxh;->a(DI)D

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/math/BigDecimal;-><init>(D)V

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v25

    .line 1604
    invoke-virtual/range {v25 .. v25}, Ljava/math/BigDecimal;->intValue()I

    move-result v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->saveDistance(I)V

    .line 1605
    move-object/from16 v0, v18

    move-object/from16 v1, v23

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1606
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBritishSwimSegments.add"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1609
    :goto_7
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-1157-saveSegmentIndex:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "section_num"

    move-object/from16 v4, v22

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " saveDistance:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "distance"

    .line 1610
    move-object/from16 v4, v22

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " saveDuration:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_time"

    .line 1611
    move-object/from16 v4, v22

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " savePace:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "pace"

    .line 1612
    move-object/from16 v4, v22

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " savePullTimes:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_pull_times"

    .line 1613
    move-object/from16 v4, v22

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " saveSwolf:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_avg_swolf"

    .line 1614
    move-object/from16 v4, v22

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " saveStrokeType:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_type"

    .line 1615
    move-object/from16 v4, v22

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " saveLocationIndex:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "point_index"

    .line 1616
    move-object/from16 v4, v22

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1609
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1583
    add-int/lit8 v21, v21, 0x1

    goto/16 :goto_6

    .line 1580
    :cond_e
    add-int/lit8 v19, v19, 0x1

    goto/16 :goto_5

    .line 1620
    :cond_f
    move-object/from16 v0, v17

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setSwimSegments(Ljava/util/List;)V

    .line 1621
    move-object/from16 v0, v18

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setBritishSwimSegments(Ljava/util/List;)V

    .line 1623
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mSwimSegments.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " , mBritishSwimSegments.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1629
    new-instance v19, Ljava/util/HashMap;

    invoke-direct/range {v19 .. v19}, Ljava/util/HashMap;-><init>()V

    .line 1631
    const-string v0, "record_id"

    const-string v1, "workout_record_id"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1632
    const-string v0, "status"

    const-string v1, "workout_record_status"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1633
    const-string v0, "load_peak"

    const-string v1, "workout_load_peak"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1634
    const-string v0, "etraining_effect"

    const-string v1, "workout_etraining_effect"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1635
    const-string v0, "extra_poc"

    const-string v1, "workout_Epoc"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1636
    const-string v0, "max_met"

    const-string v1, "workout_maxMET"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1637
    const-string v0, "recovery_time"

    const-string v1, "workout_recovery_time"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1640
    const-string v0, "swim_type"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_10

    .line 1641
    const-string v0, "swim_stroke"

    const-string v1, "swim_type"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1644
    :cond_10
    const-string v0, "swim_pull_times"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_11

    .line 1645
    const-string v0, "swim_pull_times"

    const-string v1, "swim_pull_times"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1647
    :cond_11
    const-string v0, "swim_pull_rate"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_12

    .line 1648
    const-string v0, "swim_pull_freq"

    const-string v1, "swim_pull_rate"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1651
    :cond_12
    const-string v0, "swim_pool_length"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_13

    .line 1652
    const-string v0, "swim_pool_length"

    const-string v1, "swim_pool_length"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1654
    :cond_13
    const-string v0, "swim_trip_times"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_14

    .line 1655
    const-string v0, "swim_laps"

    const-string v1, "swim_trip_times"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1657
    :cond_14
    const-string v0, "swim_avg_swolf"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_15

    .line 1658
    const-string v0, "swim_avg_swolf"

    const-string v1, "swim_avg_swolf"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1661
    :cond_15
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, swim_type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_type"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1662
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, swim_pull_times:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_pull_times"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1663
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, swim_pull_rate:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_pull_rate"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1664
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, swim_pool_length:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_pool_length"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1665
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, swim_trip_times:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_trip_times"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1666
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "swim, swim_avg_swolf:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "swim_avg_swolf"

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1668
    const-string v0, "anaerobic_exercise_etraining_effect"

    const-string v1, "anaerobic_training_effect"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1669
    move-object/from16 v0, v19

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setSportData(Ljava/util/Map;)V

    .line 1675
    move-object/from16 v0, p0

    invoke-virtual {v0, v6, v5}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->saveTrackData(Lcom/huawei/datatype/MotionPathSimplify;Lcom/huawei/datatype/MotionPath;)I

    .line 1677
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save workout Record DatatoTrack finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1680
    goto :goto_8

    .line 1678
    :catch_0
    move-exception v7

    .line 1679
    const-string v0, "HWExerciseAdviceManager"

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

    .line 1681
    :goto_8
    return-void
.end method

.method private setLastSyncTime(J)V
    .locals 5

    .line 459
    const-string v0, "HWExerciseAdviceManager"

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

    .line 460
    new-instance v4, Lcom/huawei/hwservicesmgr/remote/LastSyncTimeStampDB;

    invoke-direct {v4}, Lcom/huawei/hwservicesmgr/remote/LastSyncTimeStampDB;-><init>()V

    .line 461
    invoke-virtual {v4, p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/LastSyncTimeStampDB;->setLastTimeStamp(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;J)V

    .line 462
    return-void
.end method

.method private setMapType(ILcom/huawei/datatype/MotionPathSimplify;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/huawei/datatype/MotionPathSimplify;Ljava/util/Map<Ljava/lang/Long;[D>;)V"
        }
    .end annotation

    .line 710
    const/4 v0, -0x1

    if-ne v0, p1, :cond_5

    .line 711
    const/4 v0, 0x0

    if-eq v0, p3, :cond_4

    invoke-interface {p3}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_4

    .line 712
    const/4 v4, 0x0

    .line 713
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 714
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, [D

    .line 715
    if-eqz v4, :cond_0

    .line 716
    goto :goto_1

    .line 718
    :cond_0
    goto :goto_0

    .line 719
    :cond_1
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 720
    const/4 v0, 0x0

    aget-wide v0, v4, v0

    const/4 v2, 0x1

    aget-wide v2, v4, v2

    invoke-static {v0, v1, v2, v3}, Lo/dhk;->e(DD)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 721
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setMapType(I)V

    goto :goto_2

    .line 723
    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/huawei/datatype/MotionPathSimplify;->setMapType(I)V

    goto :goto_2

    .line 726
    :cond_3
    invoke-virtual {p2, p1}, Lcom/huawei/datatype/MotionPathSimplify;->setMapType(I)V

    .line 728
    :goto_2
    goto :goto_3

    .line 729
    :cond_4
    invoke-virtual {p2, p1}, Lcom/huawei/datatype/MotionPathSimplify;->setMapType(I)V

    goto :goto_3

    .line 732
    :cond_5
    invoke-virtual {p2, p1}, Lcom/huawei/datatype/MotionPathSimplify;->setMapType(I)V

    .line 734
    :goto_3
    return-void
.end method

.method private syncRunPlanDetailData(ILorg/json/JSONObject;)V
    .locals 10

    .line 3901
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 3902
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncRunPlanDetailData wr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3903
    return-void

    .line 3905
    :cond_0
    const-string v0, "runPlanRecordStructList"

    :try_start_1
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 3907
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 3908
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 3910
    const/4 v7, 0x0

    :goto_1
    const-string v0, "run_plan_index_count"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 3911
    const-string v0, "run_plan_record_id"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Integer;

    .line 3912
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p1, :cond_1

    .line 3913
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 3914
    const-string v0, "workout_record_id"

    const-string v1, "run_plan_record_id"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3915
    const-string v0, "workout_data_index"

    invoke-virtual {v9, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 3916
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutData:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 3910
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 3907
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 3922
    :cond_3
    goto :goto_2

    .line 3920
    :catch_0
    move-exception v4

    .line 3921
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3923
    :goto_2
    return-void
.end method

.method private syncWorkoutDetailData(ILorg/json/JSONObject;)V
    .locals 10

    .line 3873
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 3874
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncWorkoutDetailData wr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3875
    return-void

    .line 3877
    :cond_0
    const-string v0, "workoutRecordStructList"

    :try_start_1
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 3879
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 3880
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 3882
    const/4 v7, 0x0

    :goto_1
    const-string v0, "workout_index_count"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 3883
    const-string v0, "workout_record_id"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Integer;

    .line 3884
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p1, :cond_1

    .line 3885
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 3886
    const-string v0, "workout_record_id"

    const-string v1, "workout_record_id"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 3887
    const-string v0, "workout_data_index"

    invoke-virtual {v9, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 3888
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lstWorkoutData:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 3882
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 3879
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 3894
    :cond_3
    goto :goto_2

    .line 3892
    :catch_0
    move-exception v4

    .line 3893
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3895
    :goto_2
    return-void
.end method


# virtual methods
.method public getCurrDeviceId()Ljava/lang/String;
    .locals 3

    .line 425
    const-string v1, ""

    .line 426
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v2

    .line 428
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 429
    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v1

    .line 431
    :cond_0
    return-object v1
.end method

.method public getDeviceRunPlanETEResult()Lcom/huawei/datatype/RunPlanRecordInfo;
    .locals 6

    .line 2881
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDeviceSupportCapacity:Z

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getCurrentDeviceState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 2882
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mIsUsingETE:Z

    if-eqz v0, :cond_2

    .line 2884
    const/4 v4, 0x0

    .line 2885
    :goto_0
    const/16 v0, 0x1388

    if-ge v4, v0, :cond_1

    .line 2886
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceRunPlanETEResult checktime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2887
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mRunPlanETEResultFlag:Z

    if-eqz v0, :cond_0

    .line 2888
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceRunPlanETEResult return runplan record"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2890
    const/4 v0, 0x0

    return-object v0

    .line 2893
    :cond_0
    const-wide/16 v0, 0x1f4

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2897
    goto :goto_1

    .line 2894
    :catch_0
    move-exception v5

    .line 2895
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceRunPlanETEResult exception e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2896
    const/4 v0, 0x0

    return-object v0

    .line 2898
    :goto_1
    add-int/lit16 v4, v4, 0x1f4

    goto :goto_0

    .line 2901
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mIsUsingETE:Z

    .line 2904
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 4117
    const/16 v0, 0x16

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getResult(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 24

    .line 2368
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWExerciseAdviceManager getResult(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static/range {p2 .. p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2369
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2370
    invoke-static/range {p0 .. p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getInstance(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getResult([B)V

    .line 2371
    return-void

    .line 2373
    :cond_0
    invoke-static/range {p2 .. p2}, Lo/daz;->c([B)Z

    move-result v0

    if-nez v0, :cond_1a

    .line 2374
    invoke-static/range {p2 .. p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 2375
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v1, v0, :cond_19

    .line 2376
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 2378
    :try_start_0
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    invoke-virtual {v0, v4}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v5

    .line 2379
    invoke-virtual {v5}, Lo/dba;->a()Ljava/util/List;

    move-result-object v6

    .line 2380
    invoke-virtual {v5}, Lo/dba;->d()Ljava/util/List;

    move-result-object v7

    .line 2381
    const/4 v0, 0x1

    aget-byte v0, p2, v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1d

    .line 2383
    :pswitch_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_2

    .line 2384
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

    if-ne v1, v0, :cond_2

    .line 2385
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanParameterCallbackList()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_1

    .line 2386
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->runPlanParameterCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 2387
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 2388
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->runPlanParameterCallbackList:Ljava/util/List;

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

    .line 2389
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->runPlanParameterCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2391
    :cond_1
    monitor-exit v8

    goto :goto_0

    :catchall_0
    move-exception v10

    monitor-exit v8

    :try_start_2
    throw v10

    .line 2392
    :goto_0
    goto/16 :goto_1d

    .line 2395
    :cond_2
    new-instance v8, Lcom/huawei/datatype/RunPlanParameter;

    invoke-direct {v8}, Lcom/huawei/datatype/RunPlanParameter;-><init>()V

    .line 2396
    if-eqz v7, :cond_4

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 2397
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 2398
    invoke-virtual {v10}, Lo/dba;->a()Ljava/util/List;

    move-result-object v11

    .line 2399
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/daw;

    .line 2400
    invoke-virtual {v13}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_1

    goto :goto_3

    .line 2402
    :pswitch_1
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/RunPlanParameter;->setRun_plan_total_sign(Ljava/lang/String;)V

    .line 2403
    goto :goto_3

    .line 2406
    :pswitch_2
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/RunPlanParameter;->setRun_plan_sign(Ljava/lang/String;)V

    .line 2407
    goto :goto_3

    .line 2410
    :pswitch_3
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/RunPlanParameter;->setRun_plan_algorithm_type(I)V

    .line 2411
    goto :goto_3

    .line 2414
    :pswitch_4
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/RunPlanParameter;->setRun_plan_algorithm_version(Ljava/lang/String;)V

    .line 2415
    goto :goto_3

    .line 2418
    :pswitch_5
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/RunPlanParameter;->setRun_plan_sync_size(I)V

    .line 2419
    .line 2425
    :goto_3
    goto/16 :goto_2

    .line 2426
    :cond_3
    goto/16 :goto_1

    .line 2429
    :cond_4
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanParameterCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_2
    .catch Lo/day; {:try_start_2 .. :try_end_2} :catch_1

    .line 2430
    :try_start_3
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->runPlanParameterCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 2431
    invoke-virtual {v8}, Lcom/huawei/datatype/RunPlanParameter;->getRun_plan_sync_size()I

    move-result v10

    .line 2432
    div-int/lit16 v11, v10, 0x100

    .line 2433
    rem-int/lit16 v12, v10, 0x100

    .line 2434
    invoke-virtual {v8, v11}, Lcom/huawei/datatype/RunPlanParameter;->setRun_plan_sync_size_pre(I)V

    .line 2435
    invoke-virtual {v8, v12}, Lcom/huawei/datatype/RunPlanParameter;->setRun_plan_sync_size_sub(I)V

    .line 2436
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->runPlanParameterCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getRunPlanParameterforhealth"

    invoke-static {v8, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2437
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->runPlanParameterCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 2439
    :cond_5
    monitor-exit v9

    goto :goto_4

    :catchall_1
    move-exception v14

    monitor-exit v9

    :try_start_4
    throw v14

    .line 2440
    :goto_4
    goto/16 :goto_1d

    .line 2443
    :pswitch_6
    const/4 v8, 0x0

    .line 2444
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/daw;

    .line 2445
    invoke-virtual {v10}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_6

    .line 2447
    :sswitch_0
    invoke-virtual {v10}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v8

    .line 2448
    .line 2453
    :goto_6
    goto :goto_5

    .line 2454
    :cond_6
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getSetRunPlanCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_4
    .catch Lo/day; {:try_start_4 .. :try_end_4} :catch_1

    .line 2455
    :try_start_5
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->setRunPlanCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 2456
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->setRunPlanCallbackList:Ljava/util/List;

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

    .line 2457
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->setRunPlanCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 2459
    :cond_7
    monitor-exit v9

    goto :goto_7

    :catchall_2
    move-exception v15

    monitor-exit v9

    :try_start_6
    throw v15

    .line 2460
    :goto_7
    goto/16 :goto_1d

    .line 2463
    :pswitch_7
    const/4 v8, 0x0

    .line 2464
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/daw;

    .line 2465
    invoke-virtual {v10}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_9

    .line 2467
    :sswitch_1
    invoke-virtual {v10}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v8

    .line 2468
    .line 2473
    :goto_9
    goto :goto_8

    .line 2474
    :cond_8
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getSetRunPlanReminderSwitchCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_6
    .catch Lo/day; {:try_start_6 .. :try_end_6} :catch_1

    .line 2475
    :try_start_7
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->setRunPlanReminderSwitchCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 2476
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->setRunPlanReminderSwitchCallbackList:Ljava/util/List;

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

    .line 2477
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->setRunPlanReminderSwitchCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 2479
    :cond_9
    monitor-exit v9

    goto :goto_a

    :catchall_3
    move-exception v16

    monitor-exit v9

    :try_start_8
    throw v16

    .line 2480
    :goto_a
    goto/16 :goto_1d

    .line 2483
    :pswitch_8
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_b

    .line 2484
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

    if-ne v1, v0, :cond_b

    .line 2485
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getGetRunPlanRecordCallbackList()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8
    :try_end_8
    .catch Lo/day; {:try_start_8 .. :try_end_8} :catch_1

    .line 2486
    :try_start_9
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    .line 2487
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 2488
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordCallbackList:Ljava/util/List;

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

    .line 2489
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 2491
    :cond_a
    monitor-exit v8

    goto :goto_b

    :catchall_4
    move-exception v17

    monitor-exit v8

    :try_start_a
    throw v17

    .line 2492
    :goto_b
    goto/16 :goto_1d

    .line 2495
    :cond_b
    new-instance v8, Lcom/huawei/datatype/RunPlanRecord;

    invoke-direct {v8}, Lcom/huawei/datatype/RunPlanRecord;-><init>()V

    .line 2496
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 2497
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dba;

    .line 2498
    invoke-virtual {v11}, Lo/dba;->a()Ljava/util/List;

    move-result-object v12

    .line 2499
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_d
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/daw;

    .line 2500
    invoke-virtual {v14}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_2

    goto :goto_e

    .line 2502
    :sswitch_2
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/RunPlanRecord;->setRun_plan_record_count(I)V

    .line 2503
    .line 2509
    :goto_e
    goto :goto_d

    .line 2510
    :cond_c
    invoke-virtual {v11}, Lo/dba;->d()Ljava/util/List;

    move-result-object v13

    .line 2511
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_f
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/dba;

    .line 2512
    new-instance v16, Lcom/huawei/datatype/RunPlanRecordStruct;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/datatype/RunPlanRecordStruct;-><init>()V

    .line 2513
    invoke-virtual {v15}, Lo/dba;->a()Ljava/util/List;

    move-result-object v17

    .line 2514
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_10
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lo/daw;

    .line 2515
    invoke-virtual/range {v19 .. v19}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_2

    goto :goto_11

    .line 2517
    :pswitch_9
    invoke-virtual/range {v19 .. v19}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/RunPlanRecordStruct;->setRun_plan_workout_id(I)V

    .line 2518
    goto :goto_11

    .line 2521
    :pswitch_a
    invoke-virtual/range {v19 .. v19}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/RunPlanRecordStruct;->setRun_plan_record_id(I)V

    .line 2522
    goto :goto_11

    .line 2525
    :pswitch_b
    invoke-virtual/range {v19 .. v19}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/RunPlanRecordStruct;->setRun_plan_index_count(I)V

    .line 2526
    goto :goto_11

    .line 2529
    :pswitch_c
    invoke-virtual/range {v19 .. v19}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/RunPlanRecordStruct;->setPaceIndextCount(I)V

    .line 2530
    .line 2536
    :goto_11
    goto/16 :goto_10

    .line 2537
    :cond_d
    move-object/from16 v0, v16

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2538
    goto/16 :goto_f

    .line 2539
    :cond_e
    goto/16 :goto_c

    .line 2540
    :cond_f
    invoke-virtual {v8, v9}, Lcom/huawei/datatype/RunPlanRecord;->setRunPlanRecordStructList(Ljava/util/List;)V

    .line 2541
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getGetRunPlanRecordCallbackList()Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10
    :try_end_a
    .catch Lo/day; {:try_start_a .. :try_end_a} :catch_1

    .line 2542
    :try_start_b
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_10

    .line 2543
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getRunPlanRecord"

    invoke-static {v8, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2544
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 2546
    :cond_10
    monitor-exit v10

    goto :goto_12

    :catchall_5
    move-exception v20

    monitor-exit v10

    :try_start_c
    throw v20

    .line 2547
    :goto_12
    goto/16 :goto_1d

    .line 2550
    :pswitch_d
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_12

    .line 2551
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

    if-ne v1, v0, :cond_12

    .line 2552
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getGetRunPlanRecordInfoCallbackList()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8
    :try_end_c
    .catch Lo/day; {:try_start_c .. :try_end_c} :catch_1

    .line 2553
    :try_start_d
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_11

    .line 2554
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 2555
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;

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

    .line 2556
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 2558
    :cond_11
    monitor-exit v8

    goto :goto_13

    :catchall_6
    move-exception v21

    monitor-exit v8

    :try_start_e
    throw v21

    .line 2559
    :goto_13
    goto/16 :goto_1d

    .line 2562
    :cond_12
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 2563
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_14
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 2564
    invoke-virtual {v10}, Lo/dba;->a()Ljava/util/List;

    move-result-object v11

    .line 2565
    new-instance v12, Lcom/huawei/datatype/RunPlanRecordInfo;

    invoke-direct {v12}, Lcom/huawei/datatype/RunPlanRecordInfo;-><init>()V

    .line 2566
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_15
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/daw;

    .line 2567
    invoke-virtual {v14}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_3

    goto/16 :goto_16

    .line 2569
    :pswitch_e
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_id(I)V

    .line 2570
    goto/16 :goto_16

    .line 2573
    :pswitch_f
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_status(I)V

    .line 2574
    goto/16 :goto_16

    .line 2577
    :pswitch_10
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v12, v0, v1}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_start_time(J)V

    .line 2578
    goto/16 :goto_16

    .line 2581
    :pswitch_11
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v12, v0, v1}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_end_time(J)V

    .line 2582
    goto/16 :goto_16

    .line 2585
    :pswitch_12
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_calorie(I)V

    .line 2586
    goto/16 :goto_16

    .line 2589
    :pswitch_13
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_distance(I)V

    .line 2590
    goto/16 :goto_16

    .line 2593
    :pswitch_14
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_step(I)V

    .line 2594
    goto/16 :goto_16

    .line 2597
    :pswitch_15
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_total_time(I)V

    .line 2598
    goto/16 :goto_16

    .line 2601
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

    .line 2602
    goto/16 :goto_16

    .line 2605
    :pswitch_17
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_climb(I)V

    .line 2606
    goto/16 :goto_16

    .line 2609
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

    .line 2610
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

    .line 2611
    goto/16 :goto_16

    .line 2614
    :pswitch_19
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_load_peak(I)V

    .line 2615
    goto/16 :goto_16

    .line 2618
    :pswitch_1a
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_etraining_effect(I)V

    .line 2619
    goto :goto_16

    .line 2622
    :pswitch_1b
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_achieve_percent(I)V

    .line 2623
    goto :goto_16

    .line 2626
    :pswitch_1c
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_Epoc(I)V

    .line 2627
    goto :goto_16

    .line 2630
    :pswitch_1d
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_maxMET(I)V

    .line 2631
    goto :goto_16

    .line 2634
    :pswitch_1e
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_recovery_time(I)V

    .line 2635
    goto :goto_16

    .line 2639
    :pswitch_1f
    goto :goto_16

    .line 2642
    :pswitch_20
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    invoke-virtual {v12, v0, v1}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_exercise_duration(J)V

    .line 2643
    goto :goto_16

    .line 2646
    :pswitch_21
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_date_info(I)V

    .line 2647
    .line 2653
    :goto_16
    goto/16 :goto_15

    .line 2654
    :cond_13
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2655
    goto/16 :goto_14

    .line 2656
    :cond_14
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getGetRunPlanRecordInfoCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_e
    .catch Lo/day; {:try_start_e .. :try_end_e} :catch_1

    .line 2657
    :try_start_f
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_15

    .line 2658
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getRunPlanRecordInfo"

    invoke-static {v8, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2660
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 2662
    :cond_15
    monitor-exit v9

    goto :goto_17

    :catchall_7
    move-exception v22

    monitor-exit v9

    :try_start_10
    throw v22

    .line 2663
    :goto_17
    goto/16 :goto_1d

    .line 2666
    :pswitch_22
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V
    :try_end_10
    .catch Lo/day; {:try_start_10 .. :try_end_10} :catch_1

    .line 2668
    :try_start_11
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_18
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 2669
    invoke-virtual {v10}, Lo/dba;->a()Ljava/util/List;

    move-result-object v11

    .line 2670
    new-instance v12, Lcom/huawei/datatype/RunPlanRecordInfo;

    invoke-direct {v12}, Lcom/huawei/datatype/RunPlanRecordInfo;-><init>()V

    .line 2671
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_19
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/daw;

    .line 2672
    invoke-virtual {v14}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_4

    goto/16 :goto_1a

    .line 2674
    :pswitch_23
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_wourkout_id(I)V

    .line 2675
    goto/16 :goto_1a

    .line 2678
    :pswitch_24
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_status(I)V

    .line 2679
    goto/16 :goto_1a

    .line 2682
    :pswitch_25
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v12, v0, v1}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_start_time(J)V

    .line 2683
    goto/16 :goto_1a

    .line 2686
    :pswitch_26
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v12, v0, v1}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_end_time(J)V

    .line 2687
    goto/16 :goto_1a

    .line 2690
    :pswitch_27
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_calorie(I)V

    .line 2691
    goto/16 :goto_1a

    .line 2694
    :pswitch_28
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_distance(I)V

    .line 2695
    goto/16 :goto_1a

    .line 2698
    :pswitch_29
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_step(I)V

    .line 2699
    goto/16 :goto_1a

    .line 2702
    :pswitch_2a
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_total_time(I)V

    .line 2703
    goto/16 :goto_1a

    .line 2706
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

    .line 2707
    goto/16 :goto_1a

    .line 2710
    :pswitch_2c
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_climb(I)V

    .line 2711
    goto/16 :goto_1a

    .line 2714
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

    .line 2715
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

    .line 2716
    goto/16 :goto_1a

    .line 2719
    :pswitch_2e
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_load_peak(I)V

    .line 2720
    goto/16 :goto_1a

    .line 2723
    :pswitch_2f
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_etraining_effect(I)V

    .line 2724
    goto/16 :goto_1a

    .line 2727
    :pswitch_30
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_achieve_percent(I)V

    .line 2728
    goto :goto_1a

    .line 2731
    :pswitch_31
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_Epoc(I)V

    .line 2732
    goto :goto_1a

    .line 2735
    :pswitch_32
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_maxMET(I)V

    .line 2736
    goto :goto_1a

    .line 2739
    :pswitch_33
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_recovery_time(I)V

    .line 2740
    goto :goto_1a

    .line 2743
    :pswitch_34
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_daily_score(I)V

    .line 2744
    goto :goto_1a

    .line 2747
    :pswitch_35
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    invoke-virtual {v12, v0, v1}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_exercise_duration(J)V

    .line 2748
    goto :goto_1a

    .line 2751
    :pswitch_36
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/RunPlanRecordInfo;->setRun_plan_record_info_date_info(I)V

    .line 2752
    .line 2758
    :goto_1a
    goto/16 :goto_19

    .line 2759
    :cond_16
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_11
    .catch Ljava/lang/NumberFormatException; {:try_start_11 .. :try_end_11} :catch_0
    .catch Lo/day; {:try_start_11 .. :try_end_11} :catch_1

    .line 2760
    goto/16 :goto_18

    .line 2763
    :cond_17
    goto :goto_1b

    .line 2761
    :catch_0
    move-exception v9

    .line 2762
    const-string v0, "HWExerciseAdviceManager"

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

    .line 2764
    :goto_1b
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getNotificationRunPlanRecordInfoCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_12
    .catch Lo/day; {:try_start_12 .. :try_end_12} :catch_1

    .line 2765
    :try_start_13
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notificationRunPlanRecordInfoCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 2766
    const-string v0, "registerNotificationRunPlanRecordInfoCallbackList"

    .line 2767
    invoke-static {v8, v0}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 2766
    const v1, 0x186a0

    invoke-interface {v11, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    .line 2768
    goto :goto_1c

    .line 2769
    :cond_18
    monitor-exit v9

    goto :goto_1d

    :catchall_8
    move-exception v23

    monitor-exit v9

    :try_start_14
    throw v23
    :try_end_14
    .catch Lo/day; {:try_start_14 .. :try_end_14} :catch_1

    .line 2770
    .line 2778
    :goto_1d
    goto :goto_1e

    .line 2776
    :catch_1
    move-exception v5

    .line 2777
    const-string v0, "HWExerciseAdviceManager"

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

    .line 2778
    goto :goto_1e

    .line 2780
    :cond_19
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u63a5\u6536\u547d\u4ee4\u9519\u8bef!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2783
    :cond_1a
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

.method public getRunPlanParameter(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 12

    .line 1905
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getRunPlanParameterforhealth .."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1906
    iget-object v4, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 1907
    :try_start_0
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1908
    const/16 v0, 0x16

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1909
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1912
    const/4 v0, 0x0

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v6

    .line 1914
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 1916
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 1917
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1918
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1920
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 1921
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 1923
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 1924
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanParameterCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1925
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->runPlanParameterCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1926
    monitor-exit v9

    goto :goto_0

    :catchall_0
    move-exception v10

    monitor-exit v9

    :try_start_2
    throw v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1927
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_1
    move-exception v11

    monitor-exit v4

    throw v11

    .line 1928
    :goto_1
    return-void
.end method

.method public getRunPlanRecord(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 2244
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 2245
    :try_start_0
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 2246
    const/16 v0, 0x16

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 2247
    const/4 v0, 0x4

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 2250
    const/16 v0, 0xc

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v6

    .line 2252
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 2254
    const-string v0, "startTime"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v8, v0

    .line 2256
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    shr-int/lit8 v1, v8, 0x18

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v8, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 2257
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v8, 0x8

    and-int/lit16 v1, v1, 0xff

    .line 2258
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    and-int/lit16 v1, v8, 0xff

    .line 2259
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 2261
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v10

    .line 2263
    const/4 v0, 0x3

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v11

    .line 2265
    const-string v0, "endTime"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v12, v0

    .line 2267
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    shr-int/lit8 v1, v12, 0x18

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v12, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 2268
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v12, 0x8

    and-int/lit16 v1, v1, 0xff

    .line 2269
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    and-int/lit16 v1, v12, 0xff

    .line 2270
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 2272
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v14

    .line 2274
    const/4 v0, 0x4

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v15

    .line 2277
    new-instance v16, Ljava/lang/StringBuilder;

    invoke-direct/range {v16 .. v16}, Ljava/lang/StringBuilder;-><init>()V

    .line 2278
    move-object/from16 v0, v16

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2279
    move-object/from16 v0, v16

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2280
    move-object/from16 v0, v16

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2281
    move-object/from16 v0, v16

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2282
    move-object/from16 v0, v16

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2283
    move-object/from16 v0, v16

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2284
    move-object/from16 v0, v16

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2285
    move-object/from16 v0, v16

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2287
    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 2288
    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 2290
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 2292
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getGetRunPlanRecordCallbackList()Ljava/lang/Object;

    move-result-object v17

    monitor-enter v17
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2293
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordCallbackList:Ljava/util/List;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2294
    monitor-exit v17

    goto :goto_0

    :catchall_0
    move-exception v18

    monitor-exit v17

    :try_start_2
    throw v18
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 2295
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_1
    move-exception v19

    monitor-exit v4

    throw v19

    .line 2296
    :goto_1
    return-void
.end method

.method public getRunPlanRecordInfo(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 2304
    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lockObject:Ljava/lang/Object;

    monitor-enter v2

    .line 2305
    :try_start_0
    new-instance v3, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v3}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 2306
    const/16 v0, 0x16

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 2307
    const/4 v0, 0x5

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 2310
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 2312
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v5

    .line 2314
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 2317
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 2319
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v8

    .line 2321
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v9

    .line 2323
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 2324
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2325
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2326
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2328
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 2329
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 2331
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v3}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 2333
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getGetRunPlanRecordInfoCallbackList()Ljava/lang/Object;

    move-result-object v11

    monitor-enter v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2334
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanRecordInfoCallbackList:Ljava/util/List;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2335
    monitor-exit v11

    goto :goto_0

    :catchall_0
    move-exception v12

    monitor-exit v11

    :try_start_2
    throw v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 2336
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_1
    move-exception v13

    monitor-exit v2

    throw v13

    .line 2337
    :goto_1
    return-void
.end method

.method public initLogin()V
    .locals 3

    .line 4080
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_receive_push_relogin"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 4081
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 4082
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mContext:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 4083
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 4111
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 4112
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OnDestroy!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4113
    return-void
.end method

.method public planReminderChange()V
    .locals 1

    .line 3854
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mplanID:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->setRunPlanReminder(Ljava/lang/String;)V

    .line 3855
    return-void
.end method

.method public registerForTrackCallback(Lo/yd;)V
    .locals 4

    .line 3838
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "======trace registerForTrackCallback enter======="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3840
    return-void
.end method

.method public registerNotificationRunPlanRecordInfoCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 2345
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getNotificationRunPlanRecordInfoCallbackList()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 2346
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notificationRunPlanRecordInfoCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2347
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 2348
    :goto_0
    return-void
.end method

.method public registerWorkOutCallback(Lo/djs;)V
    .locals 4

    .line 4153
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerWorkOutCallback callback:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v3, p1, :cond_0

    const-string v3, "null"

    goto :goto_0

    :cond_0
    move-object v3, p1

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4154
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->workOutCallback:Lo/djs;

    .line 4155
    return-void
.end method

.method public saveTrackData(Lcom/huawei/datatype/MotionPathSimplify;Lcom/huawei/datatype/MotionPath;)I
    .locals 7

    .line 886
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackData MotionPath is enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 894
    new-instance v4, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 895
    invoke-static {p1, p2, v4}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->convertHealthTrackDataToHiData(Lcom/huawei/datatype/MotionPathSimplify;Lcom/huawei/datatype/MotionPath;Lcom/huawei/hihealth/HiDataInsertOption;)V

    .line 897
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getTrackDataToODMF(Lcom/huawei/datatype/MotionPathSimplify;Lcom/huawei/datatype/MotionPath;)Ljava/lang/String;

    move-result-object v5

    .line 898
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mContext:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/dnn;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 901
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    .line 902
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 903
    invoke-static {v6}, Lo/fju;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 905
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$2;

    invoke-direct {v1, p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$2;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 921
    const/4 v0, 0x1

    return v0
.end method

.method public sendRunPlanToDevice()V
    .locals 1

    .line 2786
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDeviceSupportCapacity:Z

    if-eqz v0, :cond_0

    .line 2787
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getAdviceParamCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {p0, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getRunPlanParameter(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2789
    :cond_0
    return-void
.end method

.method public setMetricUnit(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 4086
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 4088
    const-string v0, "unit"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4089
    const-string v0, "unit"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    .line 4090
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "imperail unit is set to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4091
    const/4 v5, 0x0

    .line 4092
    if-eqz v4, :cond_0

    .line 4093
    const/4 v5, 0x1

    .line 4095
    :cond_0
    new-instance v6, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.health_refresh_imperial_unit"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 4096
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 4097
    const-string v0, "unit"

    invoke-virtual {v6, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 4098
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mContext:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v6, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4102
    :cond_1
    goto :goto_0

    .line 4100
    :catch_0
    move-exception v4

    .line 4101
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setMetricUnit json error e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4104
    :cond_2
    :goto_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_3

    .line 4105
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 4107
    :cond_3
    return-void
.end method

.method public setRunPlanForHealth(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 39
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1936
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 1937
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->gson:Lcom/google/gson/Gson;

    const-string v1, "runPlanInfo"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/datatype/RunPlanInfo;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/datatype/RunPlanInfo;

    .line 1938
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setRunPlanForHealth called~~~~~~"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1939
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v2, v5}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1940
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1941
    const/16 v0, 0x16

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1942
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1944
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1946
    invoke-virtual {v5}, Lcom/huawei/datatype/RunPlanInfo;->getRunPlanStructList()Ljava/util/List;

    move-result-object v8

    .line 1948
    const/4 v0, 0x0

    if-ne v0, v8, :cond_0

    .line 1949
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setRunPlanForHealth runPlanStructList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1950
    monitor-exit v4

    return-void

    .line 1953
    :cond_0
    const/4 v9, 0x0

    :goto_0
    :try_start_1
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_3

    .line 1955
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1957
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/RunPlanStruct;

    invoke-virtual {v0}, Lcom/huawei/datatype/RunPlanStruct;->getTrainingStructList()Ljava/util/List;

    move-result-object v11

    .line 1958
    const/4 v0, 0x0

    if-eq v0, v11, :cond_1

    .line 1959
    const/4 v12, 0x0

    :goto_1
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_1

    .line 1961
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/TrainingStruct;

    invoke-virtual {v0}, Lcom/huawei/datatype/TrainingStruct;->getTraining_type()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v13

    .line 1963
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v14

    .line 1965
    const/16 v0, 0xd

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v15

    .line 1968
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/TrainingStruct;

    invoke-virtual {v0}, Lcom/huawei/datatype/TrainingStruct;->getTraining_speed_limit_high()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v16

    .line 1970
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/TrainingStruct;

    invoke-virtual {v0}, Lcom/huawei/datatype/TrainingStruct;->getTraining_speed_limit_low()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v17

    .line 1972
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 1974
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v19

    .line 1976
    const/16 v0, 0xe

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v20

    .line 1979
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/TrainingStruct;

    invoke-virtual {v0}, Lcom/huawei/datatype/TrainingStruct;->getTraining_hr_limit_high()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v21

    .line 1981
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/TrainingStruct;

    invoke-virtual {v0}, Lcom/huawei/datatype/TrainingStruct;->getTraining_hr_limit_low()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v22

    .line 1983
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v23

    .line 1985
    invoke-virtual/range {v23 .. v23}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v24

    .line 1987
    const/16 v0, 0xf

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v25

    .line 1990
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/TrainingStruct;

    invoke-virtual {v0}, Lcom/huawei/datatype/TrainingStruct;->getTraining_intensity_limit_high()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v26

    .line 1992
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/TrainingStruct;

    invoke-virtual {v0}, Lcom/huawei/datatype/TrainingStruct;->getTraining_intensity_limit_low()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v27

    .line 1994
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    .line 1996
    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v29

    .line 1998
    const/16 v0, 0x10

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v30

    .line 2001
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/TrainingStruct;

    invoke-virtual {v0}, Lcom/huawei/datatype/TrainingStruct;->getTraining_duration()I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v31

    .line 2003
    invoke-virtual/range {v31 .. v31}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v32

    .line 2005
    const/16 v0, 0x11

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v33

    .line 2008
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v34

    .line 2014
    invoke-virtual/range {v34 .. v34}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v35

    .line 2016
    const/16 v0, 0x8c

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v36

    .line 2019
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1959
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_1

    .line 2023
    :cond_1
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 2024
    const/4 v13, 0x0

    :goto_2
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_2

    .line 2025
    invoke-interface {v10, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2024
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    .line 2028
    :cond_2
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v13

    .line 2030
    const/16 v0, 0x8b

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v14

    .line 2033
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/RunPlanStruct;

    invoke-virtual {v0}, Lcom/huawei/datatype/RunPlanStruct;->getRun_plan_name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 2035
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v16

    .line 2037
    const/4 v0, 0x6

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v17

    .line 2040
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/RunPlanStruct;

    invoke-virtual {v0}, Lcom/huawei/datatype/RunPlanStruct;->getRun_plan_date()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v2, v0

    move/from16 v18, v2

    .line 2041
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    shr-int/lit8 v1, v18, 0x18

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v18, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 2042
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v18, 0x8

    and-int/lit16 v1, v1, 0xff

    .line 2043
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v18

    and-int/lit16 v1, v1, 0xff

    .line 2044
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    .line 2046
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v20

    .line 2048
    const/4 v0, 0x7

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v21

    .line 2052
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/RunPlanStruct;

    invoke-virtual {v0}, Lcom/huawei/datatype/RunPlanStruct;->getRun_plan_workout_id()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v22

    .line 2054
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v23

    .line 2056
    const/16 v0, 0x12

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v24

    .line 2060
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/RunPlanStruct;

    invoke-virtual {v0}, Lcom/huawei/datatype/RunPlanStruct;->getRun_plan_train_effect()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v25

    .line 2062
    invoke-virtual/range {v25 .. v25}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v26

    .line 2064
    const/16 v0, 0x8

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v27

    .line 2067
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/RunPlanStruct;

    invoke-virtual {v0}, Lcom/huawei/datatype/RunPlanStruct;->getRun_plan_repeats()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v28

    .line 2069
    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v29

    .line 2071
    const/16 v0, 0x9

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v30

    .line 2075
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/RunPlanStruct;

    invoke-virtual {v0}, Lcom/huawei/datatype/RunPlanStruct;->getRun_plan_distance()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v31

    .line 2077
    invoke-virtual/range {v31 .. v31}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v32

    .line 2079
    const/16 v0, 0xa

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v33

    .line 2082
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v34

    .line 2090
    invoke-virtual/range {v34 .. v34}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v35

    .line 2092
    const/16 v0, 0x85

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v36

    .line 2094
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1953
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 2101
    :cond_3
    invoke-virtual {v5}, Lcom/huawei/datatype/RunPlanInfo;->getRun_plan_total_sign()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    invoke-virtual {v5}, Lcom/huawei/datatype/RunPlanInfo;->getRun_plan_total_sign()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 2102
    invoke-virtual {v5}, Lcom/huawei/datatype/RunPlanInfo;->getRun_plan_total_sign()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 2103
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_3

    .line 2105
    :cond_4
    const/4 v9, 0x0

    .line 2106
    const/4 v0, 0x0

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v10

    .line 2111
    :goto_3
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v11

    .line 2117
    invoke-virtual {v5}, Lcom/huawei/datatype/RunPlanInfo;->getRun_plan_sign()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    invoke-virtual {v5}, Lcom/huawei/datatype/RunPlanInfo;->getRun_plan_sign()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 2118
    invoke-virtual {v5}, Lcom/huawei/datatype/RunPlanInfo;->getRun_plan_sign()Ljava/lang/String;

    move-result-object v12

    .line 2119
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v13

    goto :goto_4

    .line 2121
    :cond_5
    const/4 v12, 0x0

    .line 2122
    const/4 v0, 0x0

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v13

    .line 2127
    :goto_4
    const/4 v0, 0x3

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v14

    .line 2129
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 2130
    const/16 v16, 0x0

    :goto_5
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v16

    if-ge v1, v0, :cond_6

    .line 2131
    move/from16 v0, v16

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2130
    add-int/lit8 v16, v16, 0x1

    goto :goto_5

    .line 2137
    :cond_6
    const/4 v0, 0x0

    if-eq v0, v9, :cond_7

    const-string v0, ""

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 2138
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    goto :goto_6

    .line 2140
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    .line 2143
    :goto_6
    const/4 v0, 0x0

    if-eq v0, v12, :cond_8

    const-string v0, ""

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 2144
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    goto :goto_7

    .line 2146
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    .line 2150
    :goto_7
    invoke-virtual {v5}, Lcom/huawei/datatype/RunPlanInfo;->getRun_plan_start_date()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v2, v0

    move/from16 v17, v2

    .line 2151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    shr-int/lit8 v1, v17, 0x18

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v17, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 2152
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v17, 0x8

    and-int/lit16 v1, v1, 0xff

    .line 2153
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v17

    and-int/lit16 v1, v1, 0xff

    .line 2154
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 2156
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v19

    .line 2158
    const/4 v0, 0x4

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v20

    .line 2160
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    .line 2163
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v21

    .line 2165
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v22

    .line 2167
    new-instance v23, Ljava/lang/StringBuilder;

    invoke-direct/range {v23 .. v23}, Ljava/lang/StringBuilder;-><init>()V

    .line 2168
    move-object/from16 v0, v23

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2169
    move-object/from16 v0, v23

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2170
    move-object/from16 v0, v23

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2173
    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 2174
    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 2175
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setRunPlanForHealth parsing has been finished~~~~"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2177
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v6}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 2179
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getSetRunPlanCallbackList()Ljava/lang/Object;

    move-result-object v24

    monitor-enter v24
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 2180
    :try_start_2
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->setRunPlanCallbackList:Ljava/util/List;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 2181
    monitor-exit v24

    goto :goto_8

    :catchall_0
    move-exception v37

    monitor-exit v24

    :try_start_3
    throw v37
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 2182
    :goto_8
    monitor-exit v4

    goto :goto_9

    :catchall_1
    move-exception v38

    monitor-exit v4

    throw v38

    .line 2184
    :goto_9
    return-void
.end method

.method public setRunPlanReminder(Ljava/lang/String;)V
    .locals 0

    .line 3849
    return-void
.end method

.method public setRunPlanReminderSwitch(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 2193
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->lockObject:Ljava/lang/Object;

    monitor-enter v3

    .line 2194
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->gson:Lcom/google/gson/Gson;

    const-string v1, "runPlanReminder"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/datatype/RunPlanReminder;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/datatype/RunPlanReminder;

    .line 2196
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 2197
    const/16 v0, 0x16

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 2198
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 2201
    invoke-virtual {v4}, Lcom/huawei/datatype/RunPlanReminder;->getRun_plan_reminder_switch()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 2203
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v7

    .line 2205
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 2208
    invoke-virtual {v4}, Lcom/huawei/datatype/RunPlanReminder;->getRun_plan_reminder_time_hour()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v9

    .line 2210
    invoke-virtual {v4}, Lcom/huawei/datatype/RunPlanReminder;->getRun_plan_reminder_time_minute()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v10

    .line 2212
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 2214
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v12

    .line 2216
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v13

    .line 2218
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 2219
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2220
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2221
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2222
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2223
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2224
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2226
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 2227
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 2229
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 2231
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getSetRunPlanReminderSwitchCallbackList()Ljava/lang/Object;

    move-result-object v15

    monitor-enter v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2232
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->setRunPlanReminderSwitchCallbackList:Ljava/util/List;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2233
    monitor-exit v15

    goto :goto_0

    :catchall_0
    move-exception v16

    monitor-exit v15

    :try_start_2
    throw v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 2234
    :goto_0
    monitor-exit v3

    goto :goto_1

    :catchall_1
    move-exception v17

    monitor-exit v3

    throw v17

    .line 2235
    :goto_1
    return-void
.end method

.method public setiCallbackInterface(Lo/aau;)V
    .locals 0

    .line 296
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->iCallbackInterface:Lo/aau;

    .line 297
    return-void
.end method

.method public syncDeviceWorkoutRecordInfo(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 2913
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mDeviceSupportCapacity:Z

    if-eqz v0, :cond_2

    .line 2914
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncDeviceWorkoutRecordInfo isDetailSyncing:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->isDetailSyncing:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2915
    iget-object v4, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->syncObject:Ljava/lang/Object;

    monitor-enter v4

    .line 2916
    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->isDetailSyncing:Z

    if-eqz v0, :cond_1

    .line 2917
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is syning detail, please wait"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2918
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 2919
    const v0, 0x186a5

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2921
    :cond_0
    monitor-exit v4

    return-void

    .line 2923
    :cond_1
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->isDetailSyncing:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2924
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 2925
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$5;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$5;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 2970
    :cond_2
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 2971
    .line 2972
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "syncDeviceWorkoutRecordInfo"

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 2971
    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2975
    :cond_3
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notifyToSyncStressData()V

    .line 2977
    :goto_1
    invoke-static {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->getInstance(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->syncDeviceWorkoutRecordInfo(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2978
    return-void
.end method

.method public syncFitnessDetailData(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 4077
    return-void
.end method

.method public triggerHiHealthCloutSync()V
    .locals 4

    .line 4059
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "triggerHiHealthCloutSync "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4061
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$14;

    invoke-direct {v1, p0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$14;-><init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 4073
    return-void
.end method

.method public unRegisterForTrackCallback()V
    .locals 0

    .line 3845
    return-void
.end method

.method public unRegisterNotificationRunPlanRecordInfoCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 2356
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getNotificationRunPlanRecordInfoCallbackList()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 2357
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notificationRunPlanRecordInfoCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2358
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notificationRunPlanRecordInfoCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2359
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->notificationRunPlanRecordInfoCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2362
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 2363
    :goto_0
    return-void
.end method
