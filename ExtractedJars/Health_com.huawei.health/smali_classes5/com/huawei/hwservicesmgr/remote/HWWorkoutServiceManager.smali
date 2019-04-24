.class public Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;
.super Lo/cwz;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwservicesmgr/remote/parser/IParser;


# static fields
.field private static final TAG:Ljava/lang/String; = "HWWorkoutServiceManager"

.field private static getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static getNotificationSportReminderCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static getNotificationStatusCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static getOperatorCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static getWorkoutOperatorRealtimeDataCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static getWorkoutRealTimeInfoCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static instance:Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager; = null

.field private static setOperatorCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field


# instance fields
.field private getWorkoutDataCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private getWorkoutRecordCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private getWorkoutRecordStatisticCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private hwDeviceMgr:Lo/dea;

.field private final lockObject:Ljava/lang/Object;

.field private mContext:Landroid/content/Context;

.field private mGetSectionListCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private mGetWorkoutRecordPaceMapListCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->setOperatorCallbackList:Ljava/util/List;

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getOperatorCallbackList:Ljava/util/List;

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationStatusCallbackList:Ljava/util/List;

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    .line 70
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationSportReminderCallbackList:Ljava/util/List;

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutOperatorRealtimeDataCallbackList:Ljava/util/List;

    .line 73
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 92
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 64
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->lockObject:Ljava/lang/Object;

    .line 93
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->mContext:Landroid/content/Context;

    .line 94
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->hwDeviceMgr:Lo/dea;

    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->hwDeviceMgr:Lo/dea;

    .line 102
    return-void
.end method

.method private static declared-synchronized getGetNotificationGetWorkoutRecordStatisticCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    monitor-enter v1

    .line 2165
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static declared-synchronized getGetNotificationSportReminderCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    monitor-enter v1

    .line 2161
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationSportReminderCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static declared-synchronized getGetNotificationStatusCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    monitor-enter v1

    .line 2153
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationStatusCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static declared-synchronized getGetNotificationWorkoutRealTimeInfoCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    monitor-enter v1

    .line 2157
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static getGetNotificationWorkoutRecordSpeechPlayCallbackList()Ljava/lang/Object;
    .locals 1

    .line 2173
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    return-object v0
.end method

.method private static declared-synchronized getGetOperatorCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    monitor-enter v1

    .line 2145
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getOperatorCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static getGetWorkoutOperatorRealtimeDataCallbackList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation

    .line 2169
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutOperatorRealtimeDataCallbackList:Ljava/util/List;

    return-object v0
.end method

.method private static declared-synchronized getGetWorkoutRealTimeInfoCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    monitor-enter v1

    .line 2149
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRealTimeInfoCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static getInstance()Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;
    .locals 2

    .line 85
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->instance:Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 86
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->instance:Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    .line 88
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->instance:Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    return-object v0
.end method

.method private static declared-synchronized getSetOperatorCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    monitor-enter v1

    .line 2141
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->setOperatorCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private parseRunPostureDataInfo(Ljava/util/List;Lcom/huawei/datatype/WorkoutDataInfo;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Lcom/huawei/datatype/WorkoutDataInfo;)V"
        }
    .end annotation

    .line 2026
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2029
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 2031
    new-instance v5, Lcom/huawei/datatype/RunPostureDataInfo;

    invoke-direct {v5}, Lcom/huawei/datatype/RunPostureDataInfo;-><init>()V

    .line 2032
    new-instance v6, Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2033
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2034
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2035
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2036
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmCadence info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2038
    const-string v0, "mCadence"

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 2040
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2041
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2042
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2043
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2044
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2045
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmStepLength info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2047
    const-string v0, "mStepLength"

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 2049
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2050
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2051
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2052
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2053
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2054
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmGroundContactTime info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2056
    const-string v0, "mGroundContactTime"

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 2058
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2059
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2060
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2061
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmGroundImpactAcceleration info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2063
    const-string v0, "mGroundImpactAcceleration"

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 2065
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2066
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2067
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2068
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2069
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2070
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmSwingAngle info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2072
    const-string v0, "mSwingAngle"

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 2074
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2075
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2076
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2077
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmForeFootStrikePattern info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2079
    const-string v0, "mForeFootStrikePattern"

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 2081
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2082
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2083
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2084
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmWholeFootStrikePattern info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2086
    const-string v0, "mWholeFootStrikePattern"

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 2088
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2089
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2090
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2091
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmHindPawStrikePattern info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2093
    const-string v0, "mHindPawStrikePattern"

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 2095
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2096
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2097
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmEversionExcursion info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2099
    const-string v0, "mEversionExcursion"

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 2101
    invoke-virtual {v5, v4}, Lcom/huawei/datatype/RunPostureDataInfo;->setBundle(Landroid/os/Bundle;)V

    .line 2103
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo runPostureDataInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2104
    invoke-virtual {p2, v5}, Lcom/huawei/datatype/WorkoutDataInfo;->setmRunPostureDataInfo(Lcom/huawei/datatype/RunPostureDataInfo;)V

    .line 2105
    return-void
.end method

.method private transSportType(I)I
    .locals 1

    .line 2116
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 2118
    :pswitch_0
    const/4 v0, 0x2

    return v0

    .line 2120
    :pswitch_1
    const/4 v0, 0x1

    return v0

    .line 2122
    :pswitch_2
    const/4 v0, 0x3

    return v0

    .line 2124
    :pswitch_3
    const/4 v0, 0x5

    return v0

    .line 2126
    :goto_0
    :pswitch_4
    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 2137
    const/16 v0, 0x17

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getOperator(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 13

    .line 309
    iget-object v4, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 310
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOperator called"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->hwDeviceMgr:Lo/dea;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 312
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwDeviceMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    const v0, 0x186a1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "getOperator"

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 314
    monitor-exit v4

    return-void

    .line 316
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0}, Lo/dea;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 317
    if-nez v5, :cond_1

    .line 318
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no device is connected."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    const v0, 0x186a1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "getOperator"

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 320
    monitor-exit v4

    return-void

    .line 322
    :cond_1
    :try_start_2
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 323
    const/16 v0, 0x17

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 324
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 326
    const/4 v0, 0x0

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v7

    .line 328
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 330
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 331
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 335
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 337
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v6}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 339
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetOperatorCallbackList()Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 340
    :try_start_3
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getOperatorCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 341
    monitor-exit v10

    goto :goto_0

    :catchall_0
    move-exception v11

    monitor-exit v10

    :try_start_4
    throw v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 342
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_1
    move-exception v12

    monitor-exit v4

    throw v12

    .line 343
    :goto_1
    return-void
.end method

.method public getResult(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 32

    .line 967
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult(): "

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

    .line 968
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 969
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getInstance()Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getResult([B)V

    .line 970
    return-void

    .line 972
    :cond_0
    invoke-static/range {p2 .. p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 973
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v1, v0, :cond_35

    .line 974
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 976
    :try_start_0
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    invoke-virtual {v0, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 977
    iget-object v7, v6, Lo/dba;->e:Ljava/util/List;

    .line 978
    iget-object v8, v6, Lo/dba;->b:Ljava/util/List;

    .line 979
    const/4 v0, 0x1

    aget-byte v0, p2, v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_41

    .line 983
    :pswitch_0
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 985
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getSetOperatorCallbackList()Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 986
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->setOperatorCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 987
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->setOperatorCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 988
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "setOperator"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 987
    invoke-interface {v0, v9, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 989
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->setOperatorCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 991
    :cond_1
    monitor-exit v10

    goto :goto_0

    :catchall_0
    move-exception v11

    monitor-exit v10

    :try_start_2
    throw v11

    .line 992
    :goto_0
    goto/16 :goto_41

    .line 996
    :pswitch_1
    new-instance v9, Lcom/huawei/datatype/OperatorStatus;

    invoke-direct {v9}, Lcom/huawei/datatype/OperatorStatus;-><init>()V

    .line 997
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dba;

    .line 998
    iget-object v12, v11, Lo/dba;->e:Ljava/util/List;

    .line 999
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/daw;

    .line 1000
    invoke-virtual {v14}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_3

    .line 1002
    :pswitch_2
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/OperatorStatus;->setSport_type(I)V

    .line 1003
    goto :goto_3

    .line 1006
    :pswitch_3
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/OperatorStatus;->setWorkout_type(I)V

    .line 1007
    goto :goto_3

    .line 1010
    :pswitch_4
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v9, v0, v1}, Lcom/huawei/datatype/OperatorStatus;->setRun_plan_date(J)V

    .line 1011
    goto :goto_3

    .line 1014
    :pswitch_5
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/OperatorStatus;->setOperator_type(I)V

    .line 1015
    goto :goto_3

    .line 1018
    :pswitch_6
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/datatype/OperatorStatus;->setOperation_time(J)V

    .line 1019
    .line 1025
    :goto_3
    goto/16 :goto_2

    .line 1026
    :cond_2
    goto/16 :goto_1

    .line 1027
    :cond_3
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetNotificationStatusCallbackList()Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10
    :try_end_2
    .catch Lo/day; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 1028
    :try_start_3
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationStatusCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1029
    const-string v0, "notificationStatus"

    .line 1030
    invoke-static {v9, v0}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 1029
    const v1, 0x186a0

    invoke-interface {v12, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1031
    goto :goto_4

    .line 1032
    :cond_4
    monitor-exit v10

    goto :goto_5

    :catchall_1
    move-exception v15

    monitor-exit v10

    :try_start_4
    throw v15

    .line 1033
    :goto_5
    goto/16 :goto_41

    .line 1037
    :pswitch_7
    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_5

    .line 1038
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_5

    .line 1040
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetOperatorCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_4
    .catch Lo/day; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 1041
    const/4 v0, 0x0

    :try_start_5
    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v10

    .line 1042
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getOperatorCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1043
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getOperator"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 1042
    invoke-interface {v0, v10, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1044
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getOperatorCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1045
    monitor-exit v9

    goto :goto_6

    :catchall_2
    move-exception v16

    monitor-exit v9

    :try_start_6
    throw v16

    .line 1046
    :goto_6
    goto/16 :goto_41

    .line 1049
    :cond_5
    new-instance v9, Lcom/huawei/datatype/OperatorStatus;

    invoke-direct {v9}, Lcom/huawei/datatype/OperatorStatus;-><init>()V

    .line 1050
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dba;

    .line 1051
    iget-object v12, v11, Lo/dba;->e:Ljava/util/List;

    .line 1052
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/daw;

    .line 1053
    invoke-virtual {v14}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_2

    goto/16 :goto_9

    .line 1055
    :pswitch_8
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/OperatorStatus;->setTrain_monitor_state(I)V

    .line 1056
    goto :goto_9

    .line 1059
    :pswitch_9
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/OperatorStatus;->setOperator_type(I)V

    .line 1060
    goto :goto_9

    .line 1063
    :pswitch_a
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/OperatorStatus;->setSport_type(I)V

    .line 1064
    goto :goto_9

    .line 1067
    :pswitch_b
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v9, v0, v1}, Lcom/huawei/datatype/OperatorStatus;->setRun_plan_date(J)V

    .line 1068
    goto :goto_9

    .line 1071
    :pswitch_c
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/OperatorStatus;->setWorkout_type(I)V

    .line 1072
    .line 1078
    :goto_9
    goto/16 :goto_8

    .line 1079
    :cond_6
    goto/16 :goto_7

    .line 1080
    :cond_7
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetOperatorCallbackList()Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10
    :try_end_6
    .catch Lo/day; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 1081
    :try_start_7
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getOperatorCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getOperator"

    .line 1082
    invoke-static {v9, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 1081
    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1083
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getOperatorCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 1084
    monitor-exit v10

    goto :goto_a

    :catchall_3
    move-exception v17

    monitor-exit v10

    :try_start_8
    throw v17

    .line 1085
    :goto_a
    goto/16 :goto_41

    .line 1089
    :pswitch_d
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_8

    .line 1090
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_8

    .line 1091
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetWorkoutRealTimeInfoCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_8
    .catch Lo/day; {:try_start_8 .. :try_end_8} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    .line 1092
    const/4 v0, 0x0

    :try_start_9
    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v10

    .line 1093
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1094
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getWorkoutRealTimeInfo"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 1093
    invoke-interface {v0, v10, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1095
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 1096
    monitor-exit v9

    goto :goto_b

    :catchall_4
    move-exception v18

    monitor-exit v9

    :try_start_a
    throw v18

    .line 1097
    :goto_b
    goto/16 :goto_41

    .line 1100
    :cond_8
    new-instance v9, Lcom/huawei/datatype/WorkoutRealTimeInfo;

    invoke-direct {v9}, Lcom/huawei/datatype/WorkoutRealTimeInfo;-><init>()V

    .line 1101
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dba;

    .line 1102
    iget-object v12, v11, Lo/dba;->e:Ljava/util/List;

    .line 1103
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_d
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/daw;

    .line 1104
    invoke-virtual {v14}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_3

    goto :goto_e

    .line 1109
    :pswitch_e
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setSport_type(I)V

    .line 1110
    goto :goto_e

    .line 1113
    :pswitch_f
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v9, v0, v1}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setClime_info(J)V

    .line 1114
    goto :goto_e

    .line 1117
    :pswitch_10
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setDistance_info(J)V

    .line 1118
    goto :goto_e

    .line 1121
    :pswitch_11
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setClime_info(J)V

    .line 1122
    .line 1128
    :goto_e
    goto/16 :goto_d

    .line 1129
    :cond_9
    goto/16 :goto_c

    .line 1130
    :cond_a
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetWorkoutRealTimeInfoCallbackList()Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10
    :try_end_a
    .catch Lo/day; {:try_start_a .. :try_end_a} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    .line 1131
    :try_start_b
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getWorkoutRealTimeInfo"

    .line 1132
    invoke-static {v9, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 1131
    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1133
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 1134
    monitor-exit v10

    goto :goto_f

    :catchall_5
    move-exception v19

    monitor-exit v10

    :try_start_c
    throw v19

    .line 1135
    :goto_f
    goto/16 :goto_41

    .line 1139
    :pswitch_12
    new-instance v9, Lcom/huawei/datatype/WorkoutRealTimeInfo;

    invoke-direct {v9}, Lcom/huawei/datatype/WorkoutRealTimeInfo;-><init>()V

    .line 1140
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_10
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dba;

    .line 1141
    iget-object v12, v11, Lo/dba;->e:Ljava/util/List;

    .line 1142
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_11
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/daw;

    .line 1143
    invoke-virtual {v14}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_4

    goto/16 :goto_12

    .line 1145
    :pswitch_13
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setSport_type(I)V

    .line 1146
    goto :goto_12

    .line 1149
    :pswitch_14
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setSpeed_info(F)V

    .line 1150
    goto :goto_12

    .line 1153
    :pswitch_15
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setSport_type(I)V

    .line 1154
    goto :goto_12

    .line 1157
    :pswitch_16
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v9, v0, v1}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setClime_info(J)V

    .line 1158
    goto :goto_12

    .line 1161
    :pswitch_17
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setCalorie_info(J)V

    .line 1162
    goto :goto_12

    .line 1165
    :pswitch_18
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setDistance_info(J)V

    .line 1166
    goto :goto_12

    .line 1169
    :pswitch_19
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setClime_info(J)V

    .line 1170
    .line 1176
    :goto_12
    goto/16 :goto_11

    .line 1177
    :cond_b
    goto/16 :goto_10

    .line 1178
    :cond_c
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetNotificationWorkoutRealTimeInfoCallbackList()Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10
    :try_end_c
    .catch Lo/day; {:try_start_c .. :try_end_c} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_2

    .line 1179
    :try_start_d
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_13
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1180
    const-string v0, "notificationWorkoutRealTimeInfo"

    .line 1181
    invoke-static {v9, v0}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 1180
    const v1, 0x186a0

    invoke-interface {v12, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 1182
    goto :goto_13

    .line 1183
    :cond_d
    monitor-exit v10

    goto :goto_14

    :catchall_6
    move-exception v20

    monitor-exit v10

    :try_start_e
    throw v20

    .line 1184
    :goto_14
    goto/16 :goto_41

    .line 1188
    :pswitch_1a
    new-instance v9, Lcom/huawei/datatype/SportReminder;

    invoke-direct {v9}, Lcom/huawei/datatype/SportReminder;-><init>()V

    .line 1189
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_15
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dba;

    .line 1190
    iget-object v12, v11, Lo/dba;->e:Ljava/util/List;

    .line 1191
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_16
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/daw;

    .line 1192
    invoke-virtual {v14}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_5

    goto/16 :goto_17

    .line 1194
    :pswitch_1b
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/SportReminder;->setReminder_type(I)V

    .line 1195
    goto/16 :goto_17

    .line 1198
    :pswitch_1c
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/SportReminder;->setRun_phrase_number(I)V

    .line 1199
    goto/16 :goto_17

    .line 1202
    :pswitch_1d
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 1203
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1204
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1205
    invoke-virtual {v9, v15}, Lcom/huawei/datatype/SportReminder;->setRun_phrase_variable(Ljava/util/List;)V

    .line 1206
    goto :goto_17

    .line 1209
    :pswitch_1e
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/datatype/SportReminder;->setDistance_info(J)V

    .line 1210
    goto :goto_17

    .line 1213
    :pswitch_1f
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/datatype/SportReminder;->setTime_info(J)V

    .line 1214
    goto :goto_17

    .line 1217
    :pswitch_20
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/SportReminder;->setHr_value_info(I)V

    .line 1218
    goto :goto_17

    .line 1221
    :pswitch_21
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/SportReminder;->setHr_status_info(I)V

    .line 1222
    .line 1228
    :goto_17
    goto/16 :goto_16

    .line 1229
    :cond_e
    goto/16 :goto_15

    .line 1230
    :cond_f
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetNotificationSportReminderCallbackList()Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10
    :try_end_e
    .catch Lo/day; {:try_start_e .. :try_end_e} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_2

    .line 1231
    :try_start_f
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationSportReminderCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_18
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1232
    const-string v0, "notificationSportReminder"

    .line 1233
    invoke-static {v9, v0}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 1232
    const v1, 0x186a0

    invoke-interface {v12, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 1234
    goto :goto_18

    .line 1235
    :cond_10
    monitor-exit v10

    goto :goto_19

    :catchall_7
    move-exception v21

    monitor-exit v10

    :try_start_10
    throw v21

    .line 1236
    :goto_19
    goto/16 :goto_41

    .line 1240
    :pswitch_22
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_11

    .line 1241
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_11

    .line 1242
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRecordCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_34

    .line 1243
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 1244
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRecordCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getWorkoutRecord"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v9, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1245
    goto/16 :goto_41

    .line 1249
    :cond_11
    new-instance v9, Lcom/huawei/datatype/WorkoutRecord;

    invoke-direct {v9}, Lcom/huawei/datatype/WorkoutRecord;-><init>()V

    .line 1250
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1251
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1a
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/dba;

    .line 1252
    iget-object v13, v12, Lo/dba;->e:Ljava/util/List;

    .line 1253
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_1b
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/daw;

    .line 1254
    invoke-virtual {v15}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1c

    .line 1256
    :sswitch_0
    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/WorkoutRecord;->setWorkout_record_count(I)V

    .line 1257
    .line 1263
    :goto_1c
    goto :goto_1b

    .line 1264
    :cond_12
    iget-object v14, v12, Lo/dba;->b:Ljava/util/List;

    .line 1265
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1d
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lo/dba;

    .line 1266
    move-object/from16 v0, v16

    iget-object v0, v0, Lo/dba;->e:Ljava/util/List;

    move-object/from16 v17, v0

    .line 1267
    new-instance v18, Lcom/huawei/datatype/WorkoutRecordStruct;

    invoke-direct/range {v18 .. v18}, Lcom/huawei/datatype/WorkoutRecordStruct;-><init>()V

    .line 1268
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_1e
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lo/daw;

    .line 1269
    invoke-virtual/range {v20 .. v20}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_6

    goto :goto_1f

    .line 1271
    :pswitch_23
    invoke-virtual/range {v20 .. v20}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutRecordStruct;->setWorkout_record_id(I)V

    .line 1272
    goto :goto_1f

    .line 1275
    :pswitch_24
    invoke-virtual/range {v20 .. v20}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutRecordStruct;->setWorkout_index_count(I)V

    .line 1276
    goto :goto_1f

    .line 1279
    :pswitch_25
    invoke-virtual/range {v20 .. v20}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutRecordStruct;->setPaceIndexCount(I)V

    .line 1280
    goto :goto_1f

    .line 1283
    :pswitch_26
    invoke-virtual/range {v20 .. v20}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutRecordStruct;->setWorkout_section_index(I)V

    .line 1284
    .line 1290
    :goto_1f
    goto/16 :goto_1e

    .line 1291
    :cond_13
    move-object/from16 v0, v18

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1292
    goto/16 :goto_1d

    .line 1293
    :cond_14
    goto/16 :goto_1a

    .line 1294
    :cond_15
    invoke-virtual {v9, v10}, Lcom/huawei/datatype/WorkoutRecord;->setWorkoutRecordStructList(Ljava/util/List;)V

    .line 1295
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRecordCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_34

    .line 1296
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRecordCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getWorkoutRecord"

    .line 1297
    invoke-static {v9, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 1296
    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto/16 :goto_41

    .line 1303
    :pswitch_27
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_16

    .line 1304
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_16

    .line 1305
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRecordStatisticCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_34

    .line 1306
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 1307
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRecordStatisticCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getWorkoutRecordStatistic"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v9, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1308
    goto/16 :goto_41

    .line 1312
    :cond_16
    new-instance v9, Lcom/huawei/datatype/WorkoutRecordStatistic;

    invoke-direct {v9}, Lcom/huawei/datatype/WorkoutRecordStatistic;-><init>()V

    .line 1313
    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 1314
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_20
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/dba;

    .line 1315
    iget-object v13, v12, Lo/dba;->e:Ljava/util/List;

    .line 1316
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_21
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/daw;

    .line 1317
    invoke-virtual {v15}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_7

    goto/16 :goto_22

    .line 1320
    :pswitch_28
    const-string v0, "workout_record_id"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1321
    goto/16 :goto_22

    .line 1325
    :pswitch_29
    const-string v0, "workout_record_status"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1326
    goto/16 :goto_22

    .line 1330
    :pswitch_2a
    const-string v0, "workout_record_start_time"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-virtual {v10, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1331
    goto/16 :goto_22

    .line 1335
    :pswitch_2b
    const-string v0, "workout_record_end_time"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-virtual {v10, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1336
    goto/16 :goto_22

    .line 1340
    :pswitch_2c
    const-string v0, "workout_record_calorie"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1341
    goto/16 :goto_22

    .line 1345
    :pswitch_2d
    const-string v0, "workout_record_distance"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1346
    goto/16 :goto_22

    .line 1350
    :pswitch_2e
    const-string v0, "workout_record_step"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    invoke-virtual {v10, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1351
    goto/16 :goto_22

    .line 1355
    :pswitch_2f
    const-string v0, "workout_record_total_time"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    invoke-virtual {v10, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1356
    goto/16 :goto_22

    .line 1360
    :pswitch_30
    const-string v0, "workout_record_speed"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1361
    goto/16 :goto_22

    .line 1365
    :pswitch_31
    const-string v0, "workout_climb"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    invoke-virtual {v10, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1366
    goto/16 :goto_22

    .line 1370
    :pswitch_32
    const-string v0, "workout_HrABS_peak_min"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1372
    const-string v0, "workout_HrABS_peak_max"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x4

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1373
    goto/16 :goto_22

    .line 1377
    :pswitch_33
    const-string v0, "workout_load_peak"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1378
    goto/16 :goto_22

    .line 1382
    :pswitch_34
    const-string v0, "workout_etraining_effect"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1383
    goto/16 :goto_22

    .line 1387
    :pswitch_35
    const-string v0, "workout_Epoc"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1388
    goto/16 :goto_22

    .line 1392
    :pswitch_36
    const-string v0, "workout_maxMET"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1393
    goto/16 :goto_22

    .line 1397
    :pswitch_37
    const-string v0, "workout_recovery_time"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1398
    goto/16 :goto_22

    .line 1402
    :pswitch_38
    const-string v0, "workout_exercise_duration"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-virtual {v10, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1403
    goto/16 :goto_22

    .line 1407
    :pswitch_39
    const-string v0, "workout_date_Info"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    invoke-virtual {v10, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1408
    goto/16 :goto_22

    .line 1412
    :pswitch_3a
    const-string v0, "workout_type"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1413
    goto/16 :goto_22

    .line 1417
    :pswitch_3b
    const-string v0, "swim_type"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1418
    goto/16 :goto_22

    .line 1422
    :pswitch_3c
    const-string v0, "swim_pull_times"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1423
    goto/16 :goto_22

    .line 1427
    :pswitch_3d
    const-string v0, "swim_pull_rate"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1428
    goto/16 :goto_22

    .line 1432
    :pswitch_3e
    const-string v0, "swim_pool_length"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1433
    goto/16 :goto_22

    .line 1437
    :pswitch_3f
    const-string v0, "swim_trip_times"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1438
    goto/16 :goto_22

    .line 1442
    :pswitch_40
    const-string v0, "swim_avg_swolf"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1443
    goto/16 :goto_22

    .line 1447
    :pswitch_41
    const-string v0, "accumulative_drop_height"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1448
    goto/16 :goto_22

    .line 1452
    :pswitch_42
    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v16

    .line 1453
    const-string v0, "highest_altitude"

    move-wide/from16 v1, v16

    long-to-int v1, v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1454
    goto/16 :goto_22

    .line 1458
    :pswitch_43
    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v16

    .line 1459
    const-string v0, "lowest_altitude"

    move-wide/from16 v1, v16

    long-to-int v1, v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1460
    goto/16 :goto_22

    .line 1464
    :pswitch_44
    const-string v0, "swolf_base_km"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1465
    goto/16 :goto_22

    .line 1469
    :pswitch_45
    const-string v0, "swolf_base_mile"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1470
    goto :goto_22

    .line 1474
    :pswitch_46
    const-string v0, "anaerobic_training_effect"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1475
    goto :goto_22

    .line 1479
    :pswitch_47
    const-string v0, "half_marathon_time"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1480
    goto :goto_22

    .line 1484
    :pswitch_48
    const-string v0, "total_marathon_time"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1485
    goto :goto_22

    .line 1488
    :pswitch_49
    const-string v0, "record_flag"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1489
    goto :goto_22

    .line 1492
    :pswitch_4a
    const-string v0, "workout_heart_rate_type"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1493
    goto :goto_22

    .line 1496
    :pswitch_4b
    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 1497
    const-string v0, "workout_exercise_id"

    move-object/from16 v1, v16

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1498
    .line 1504
    :goto_22
    goto/16 :goto_21

    .line 1505
    :cond_17
    goto/16 :goto_20

    .line 1506
    :cond_18
    invoke-virtual {v9, v10}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setBundle(Landroid/os/Bundle;)V

    .line 1507
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRecordStatisticCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_34

    .line 1508
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRecordStatisticCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getWorkoutRecordStatistic"

    .line 1509
    invoke-static {v9, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 1508
    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto/16 :goto_41

    .line 1515
    :pswitch_4c
    new-instance v9, Lcom/huawei/datatype/WorkoutRecordStatistic;

    invoke-direct {v9}, Lcom/huawei/datatype/WorkoutRecordStatistic;-><init>()V

    .line 1516
    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 1517
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_23
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/dba;

    .line 1518
    iget-object v13, v12, Lo/dba;->e:Ljava/util/List;

    .line 1519
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_24
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/daw;

    .line 1520
    invoke-virtual {v15}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_8

    goto/16 :goto_25

    .line 1523
    :pswitch_4d
    const-string v0, "workout_record_id"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1524
    goto/16 :goto_25

    .line 1528
    :pswitch_4e
    const-string v0, "workout_record_status"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1529
    goto/16 :goto_25

    .line 1533
    :pswitch_4f
    const-string v0, "workout_record_start_time"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-virtual {v10, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1534
    goto/16 :goto_25

    .line 1538
    :pswitch_50
    const-string v0, "workout_record_end_time"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-virtual {v10, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1539
    goto/16 :goto_25

    .line 1543
    :pswitch_51
    const-string v0, "workout_record_calorie"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1544
    goto/16 :goto_25

    .line 1547
    :pswitch_52
    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_distance(I)V

    .line 1548
    const-string v0, ""

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1549
    goto/16 :goto_25

    .line 1553
    :pswitch_53
    const-string v0, "workout_record_distance"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    invoke-virtual {v10, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1554
    goto/16 :goto_25

    .line 1558
    :pswitch_54
    const-string v0, "workout_record_total_time"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    invoke-virtual {v10, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1559
    goto/16 :goto_25

    .line 1563
    :pswitch_55
    const-string v0, "workout_record_speed"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1564
    goto/16 :goto_25

    .line 1568
    :pswitch_56
    const-string v0, "workout_climb"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    invoke-virtual {v10, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1569
    goto/16 :goto_25

    .line 1573
    :pswitch_57
    const-string v0, "workout_HrABS_peak_max"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1575
    const-string v0, "workout_HrABS_peak_min"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x4

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1576
    goto/16 :goto_25

    .line 1580
    :pswitch_58
    const-string v0, "workout_load_peak"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1581
    goto :goto_25

    .line 1585
    :pswitch_59
    const-string v0, "workout_etraining_effect"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1586
    goto :goto_25

    .line 1590
    :pswitch_5a
    const-string v0, "workout_Epoc"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1591
    goto :goto_25

    .line 1595
    :pswitch_5b
    const-string v0, "workout_maxMET"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1596
    goto :goto_25

    .line 1600
    :pswitch_5c
    const-string v0, "workout_recovery_time"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1601
    goto :goto_25

    .line 1605
    :pswitch_5d
    const-string v0, "workout_exercise_duration"

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    invoke-virtual {v10, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1606
    goto :goto_25

    .line 1610
    :pswitch_5e
    const-string v0, ""

    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    invoke-virtual {v10, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1611
    .line 1617
    :goto_25
    goto/16 :goto_24

    .line 1618
    :cond_19
    goto/16 :goto_23

    .line 1619
    :cond_1a
    invoke-virtual {v9, v10}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setBundle(Landroid/os/Bundle;)V

    .line 1620
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetNotificationGetWorkoutRecordStatisticCallbackList()Ljava/lang/Object;

    move-result-object v11

    monitor-enter v11
    :try_end_10
    .catch Lo/day; {:try_start_10 .. :try_end_10} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_10 .. :try_end_10} :catch_1
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_2

    .line 1621
    :try_start_11
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_26
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1622
    const-string v0, "notificationGetWorkoutRecordStatistic"

    .line 1623
    invoke-static {v9, v0}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 1622
    const v1, 0x186a0

    invoke-interface {v13, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 1624
    goto :goto_26

    .line 1625
    :cond_1b
    monitor-exit v11

    goto :goto_27

    :catchall_8
    move-exception v22

    monitor-exit v11

    :try_start_12
    throw v22

    .line 1626
    :goto_27
    goto/16 :goto_41

    .line 1630
    :pswitch_5f
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1c

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_1c

    .line 1631
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_1c

    .line 1632
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutDataCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_34

    .line 1633
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 1634
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutDataCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getWorkoutData"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v9, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1635
    goto/16 :goto_41

    .line 1639
    :cond_1c
    new-instance v9, Lcom/huawei/datatype/WorkoutDataStruct;

    invoke-direct {v9}, Lcom/huawei/datatype/WorkoutDataStruct;-><init>()V

    .line 1640
    if-eqz v8, :cond_24

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_24

    .line 1641
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_28
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_24

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dba;

    .line 1642
    iget-object v12, v11, Lo/dba;->e:Ljava/util/List;

    .line 1643
    new-instance v13, Lcom/huawei/datatype/DataHeader;

    invoke-direct {v13}, Lcom/huawei/datatype/DataHeader;-><init>()V

    .line 1644
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 1646
    const/4 v15, 0x0

    .line 1648
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 1649
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_29
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lo/daw;

    .line 1650
    invoke-virtual/range {v18 .. v18}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_9

    goto/16 :goto_30

    .line 1652
    :pswitch_60
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/WorkoutDataStruct;->setWorkout_record_id(I)V

    .line 1653
    goto/16 :goto_30

    .line 1656
    :pswitch_61
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/WorkoutDataStruct;->setWorkout_data_index(I)V

    .line 1657
    goto/16 :goto_30

    .line 1660
    :pswitch_62
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/DataHeader;->setSportID(I)V

    .line 1661
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/DataHeader;->setFrameID(I)V

    .line 1662
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    const/16 v2, 0x10

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v13, v0, v1}, Lcom/huawei/datatype/DataHeader;->setTime(J)V

    .line 1663
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    const/16 v2, 0x12

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/DataHeader;->setTimeInterval(I)V

    .line 1664
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x12

    const/16 v2, 0x16

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v15

    .line 1665
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x18

    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->reverse()Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v19

    .line 1666
    const/16 v20, 0x0

    :goto_2a
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v0

    move/from16 v1, v20

    if-ge v1, v0, :cond_1e

    .line 1667
    add-int/lit8 v0, v20, 0x1

    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v0, v1, :cond_1d

    .line 1668
    add-int/lit8 v0, v20, 0x1

    move-object/from16 v1, v19

    move/from16 v2, v20

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2b

    .line 1670
    :cond_1d
    const-string v0, "0"

    move-object/from16 v1, v16

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1666
    :goto_2b
    add-int/lit8 v20, v20, 0x1

    goto :goto_2a

    .line 1673
    :cond_1e
    move-object/from16 v0, v16

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/DataHeader;->setBitMap(Ljava/util/List;)V

    .line 1674
    goto/16 :goto_30

    .line 1677
    :pswitch_63
    new-instance v19, Ljava/util/ArrayList;

    invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V

    .line 1678
    const/16 v20, 0x0

    :goto_2c
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    move/from16 v1, v20

    if-ge v1, v0, :cond_1f

    .line 1679
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v20, 0x2

    move/from16 v2, v20

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1678
    add-int/lit8 v20, v20, 0x2

    goto :goto_2c

    .line 1681
    :cond_1f
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_22

    .line 1682
    const/16 v20, 0x0

    :goto_2d
    move/from16 v0, v20

    if-ge v0, v15, :cond_22

    .line 1683
    new-instance v21, Lcom/huawei/datatype/WorkoutDataInfo;

    invoke-direct/range {v21 .. v21}, Lcom/huawei/datatype/WorkoutDataInfo;-><init>()V

    .line 1684
    new-instance v22, Landroid/os/Bundle;

    invoke-direct/range {v22 .. v22}, Landroid/os/Bundle;-><init>()V

    .line 1685
    const/16 v23, 0x0

    :goto_2e
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v23

    if-ge v1, v0, :cond_21

    .line 1686
    const-string v0, "1"

    move-object/from16 v1, v16

    move/from16 v2, v23

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 1687
    packed-switch v23, :pswitch_data_a

    goto/16 :goto_2f

    .line 1691
    :pswitch_64
    const-string v0, "data1"

    move-object/from16 v1, v19

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1692
    goto/16 :goto_2f

    .line 1696
    :pswitch_65
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Ljava/lang/String;

    .line 1697
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1699
    const-string v0, "data2"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, v24

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, v19

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1700
    goto/16 :goto_2f

    .line 1705
    :pswitch_66
    const-string v0, "data3"

    move-object/from16 v1, v19

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1706
    goto/16 :goto_2f

    .line 1710
    :pswitch_67
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Ljava/lang/String;

    .line 1711
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1713
    const-string v0, "data4"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, v24

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, v19

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1714
    goto/16 :goto_2f

    .line 1718
    :pswitch_68
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Ljava/lang/String;

    .line 1719
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1721
    const-string v0, "data5"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, v24

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, v19

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1722
    goto/16 :goto_2f

    .line 1726
    :pswitch_69
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Ljava/lang/String;

    .line 1727
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1728
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v25, v0

    check-cast v25, Ljava/lang/String;

    .line 1729
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1730
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Ljava/lang/String;

    .line 1731
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1733
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v19

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v27

    .line 1734
    move-object/from16 v0, v27

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v28

    .line 1735
    const-string v0, "data6"

    move-wide/from16 v1, v28

    long-to-int v1, v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1736
    goto/16 :goto_2f

    .line 1740
    :pswitch_6a
    move-object/from16 v0, p0

    move-object/from16 v1, v19

    move-object/from16 v2, v21

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->parseRunPostureDataInfo(Ljava/util/List;Lcom/huawei/datatype/WorkoutDataInfo;)V

    .line 1741
    goto/16 :goto_2f

    .line 1745
    :pswitch_6b
    const-string v0, "data8"

    move-object/from16 v1, v19

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1746
    goto/16 :goto_2f

    .line 1750
    :pswitch_6c
    const-string v0, "data9"

    move-object/from16 v1, v19

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1751
    goto/16 :goto_2f

    .line 1755
    :pswitch_6d
    const-string v0, "data10"

    move-object/from16 v1, v19

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1756
    goto/16 :goto_2f

    .line 1760
    :pswitch_6e
    const-string v0, "data11"

    move-object/from16 v1, v19

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1761
    goto/16 :goto_2f

    .line 1765
    :pswitch_6f
    const-string v0, "data12"

    move-object/from16 v1, v19

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1766
    goto :goto_2f

    .line 1770
    :pswitch_70
    const-string v0, "data13"

    move-object/from16 v1, v19

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1771
    goto :goto_2f

    .line 1775
    :pswitch_71
    const-string v0, "data14"

    move-object/from16 v1, v19

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1776
    goto :goto_2f

    .line 1780
    :pswitch_72
    const-string v0, "data15"

    move-object/from16 v1, v19

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1781
    goto :goto_2f

    .line 1785
    :pswitch_73
    const-string v0, "data16"

    move-object/from16 v1, v19

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1786
    .line 1792
    :goto_2f
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1685
    :cond_20
    add-int/lit8 v23, v23, 0x1

    goto/16 :goto_2e

    .line 1795
    :cond_21
    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/WorkoutDataInfo;->setBundle(Landroid/os/Bundle;)V

    .line 1796
    move-object/from16 v0, v21

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1682
    add-int/lit8 v20, v20, 0x1

    goto/16 :goto_2d

    .line 1799
    :cond_22
    invoke-virtual {v13, v14}, Lcom/huawei/datatype/DataHeader;->setWorkoutDataInfoList(Ljava/util/List;)V

    .line 1800
    invoke-virtual {v9, v13}, Lcom/huawei/datatype/WorkoutDataStruct;->setDataHeader(Lcom/huawei/datatype/DataHeader;)V

    .line 1801
    .line 1808
    :goto_30
    goto/16 :goto_29

    .line 1809
    :cond_23
    goto/16 :goto_28

    .line 1811
    :cond_24
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutDataCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_34

    .line 1812
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutDataCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getWorkoutData"

    .line 1813
    invoke-static {v9, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 1812
    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto/16 :goto_41

    .line 1819
    :pswitch_74
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetWorkoutOperatorRealtimeDataCallbackList()Ljava/util/List;

    move-result-object v9

    monitor-enter v9
    :try_end_12
    .catch Lo/day; {:try_start_12 .. :try_end_12} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_12 .. :try_end_12} :catch_1
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_2

    .line 1820
    :try_start_13
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutOperatorRealtimeDataCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_25

    .line 1821
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v10

    .line 1822
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutOperatorRealtimeDataCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "workoutOperateRealtimeData"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v10, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1823
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutOperatorRealtimeDataCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 1825
    :cond_25
    monitor-exit v9

    goto :goto_31

    :catchall_9
    move-exception v30

    monitor-exit v9

    :try_start_14
    throw v30

    .line 1826
    :goto_31
    goto/16 :goto_41

    .line 1830
    :pswitch_75
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_26

    .line 1831
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_26

    .line 1832
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->mGetWorkoutRecordPaceMapListCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_34

    .line 1833
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 1834
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->mGetWorkoutRecordPaceMapListCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getWorkoutRecordPaceMap"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v9, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1835
    goto/16 :goto_41

    .line 1839
    :cond_26
    new-instance v9, Lcom/huawei/datatype/WorkRecordIndexPaceMapList;

    invoke-direct {v9}, Lcom/huawei/datatype/WorkRecordIndexPaceMapList;-><init>()V

    .line 1840
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1842
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v0, v0, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_32
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_29

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/daw;

    .line 1843
    invoke-virtual {v12}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_27

    .line 1844
    invoke-virtual {v12}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/WorkRecordIndexPaceMapList;->setWorkout_record_id(I)V

    goto :goto_33

    .line 1845
    :cond_27
    invoke-virtual {v12}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x8

    if-ne v1, v0, :cond_28

    .line 1846
    invoke-virtual {v12}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/WorkRecordIndexPaceMapList;->setPaceIndex(I)V

    .line 1848
    :cond_28
    :goto_33
    goto :goto_32

    .line 1849
    :cond_29
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v0, v0, Lo/dba;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_34
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2b

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/dba;

    .line 1850
    new-instance v13, Lcom/huawei/datatype/WorkoutRecordPaceMap;

    invoke-direct {v13}, Lcom/huawei/datatype/WorkoutRecordPaceMap;-><init>()V

    .line 1851
    iget-object v14, v12, Lo/dba;->e:Ljava/util/List;

    .line 1852
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_35
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2a

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lo/daw;

    .line 1853
    invoke-virtual/range {v16 .. v16}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_b

    goto/16 :goto_36

    .line 1855
    :pswitch_76
    invoke-virtual/range {v16 .. v16}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/WorkoutRecordPaceMap;->setDistance(I)V

    .line 1856
    goto :goto_36

    .line 1859
    :pswitch_77
    invoke-virtual/range {v16 .. v16}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/WorkoutRecordPaceMap;->setUnit_type(I)V

    .line 1860
    goto :goto_36

    .line 1863
    :pswitch_78
    invoke-virtual/range {v16 .. v16}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/WorkoutRecordPaceMap;->setPace(I)V

    .line 1864
    goto :goto_36

    .line 1867
    :pswitch_79
    invoke-virtual/range {v16 .. v16}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/WorkoutRecordPaceMap;->setPoint_index(I)V

    .line 1868
    goto :goto_36

    .line 1871
    :pswitch_7a
    invoke-virtual/range {v16 .. v16}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/WorkoutRecordPaceMap;->setLastLessDistance(I)V

    .line 1872
    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/WorkoutRecordPaceMap;->setIsLastLessDistance(Z)V

    .line 1873
    .line 1879
    :goto_36
    :pswitch_7b
    goto/16 :goto_35

    .line 1880
    :cond_2a
    invoke-interface {v10, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1881
    goto/16 :goto_34

    .line 1882
    :cond_2b
    invoke-virtual {v9, v10}, Lcom/huawei/datatype/WorkRecordIndexPaceMapList;->setPaceMapList(Ljava/util/List;)V

    .line 1883
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->mGetWorkoutRecordPaceMapListCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_34

    .line 1884
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->mGetWorkoutRecordPaceMapListCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getWorkoutRecordPaceMap"

    .line 1885
    invoke-static {v9, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 1884
    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto/16 :goto_41

    .line 1891
    :pswitch_7c
    new-instance v9, Lcom/huawei/datatype/WorkoutRecordSpeechPlay;

    invoke-direct {v9}, Lcom/huawei/datatype/WorkoutRecordSpeechPlay;-><init>()V

    .line 1893
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_37
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/daw;

    .line 1894
    invoke-virtual {v11}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2c

    .line 1895
    invoke-virtual {v11}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/WorkoutRecordSpeechPlay;->setWorkout_record_speech_play_request_report(I)V

    .line 1897
    :cond_2c
    goto :goto_37

    .line 1898
    :cond_2d
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetNotificationWorkoutRecordSpeechPlayCallbackList()Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10
    :try_end_14
    .catch Lo/day; {:try_start_14 .. :try_end_14} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_14 .. :try_end_14} :catch_1
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_2

    .line 1899
    :try_start_15
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_38
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1900
    const-string v0, "notificationWorkoutRecordSpeechPlay"

    .line 1901
    invoke-static {v9, v0}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 1900
    const v1, 0x186a0

    invoke-interface {v12, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 1902
    goto :goto_38

    .line 1903
    :cond_2e
    monitor-exit v10

    goto :goto_39

    :catchall_a
    move-exception v31

    monitor-exit v10

    :try_start_16
    throw v31

    .line 1904
    :goto_39
    goto/16 :goto_41

    .line 1908
    :pswitch_7d
    new-instance v9, Lcom/huawei/datatype/SectionList;

    invoke-direct {v9}, Lcom/huawei/datatype/SectionList;-><init>()V

    .line 1909
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_30

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dba;

    .line 1910
    iget-object v0, v11, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_3b
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/daw;

    .line 1911
    invoke-virtual {v13}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_3c

    .line 1913
    :sswitch_1
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/SectionList;->setWorkout_record_id(I)V

    .line 1914
    goto :goto_3c

    .line 1917
    :sswitch_2
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/SectionList;->setSection_index(I)V

    .line 1918
    .line 1924
    :goto_3c
    goto :goto_3b

    .line 1925
    :cond_2f
    goto/16 :goto_3a

    .line 1926
    :cond_30
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1927
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_3d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_33

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/dba;

    .line 1929
    iget-object v0, v12, Lo/dba;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_3e
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_32

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/dba;

    .line 1931
    new-instance v15, Lcom/huawei/datatype/SectionInfo;

    invoke-direct {v15}, Lcom/huawei/datatype/SectionInfo;-><init>()V

    .line 1932
    new-instance v16, Landroid/os/Bundle;

    invoke-direct/range {v16 .. v16}, Landroid/os/Bundle;-><init>()V

    .line 1933
    iget-object v0, v14, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_3f
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lo/daw;

    .line 1934
    invoke-virtual/range {v18 .. v18}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_c

    goto/16 :goto_40

    .line 1939
    :pswitch_7e
    const-string v0, "distance"

    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1940
    goto/16 :goto_40

    .line 1945
    :pswitch_7f
    const-string v0, "unit"

    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1946
    goto/16 :goto_40

    .line 1951
    :pswitch_80
    const-string v0, "pace"

    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    move-object/from16 v3, v16

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1952
    goto :goto_40

    .line 1957
    :pswitch_81
    const-string v0, "point_index"

    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1958
    goto :goto_40

    .line 1963
    :pswitch_82
    const-string v0, "section_num"

    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1964
    goto :goto_40

    .line 1969
    :pswitch_83
    const-string v0, "swim_type"

    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1970
    goto :goto_40

    .line 1975
    :pswitch_84
    const-string v0, "swim_pull_times"

    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1976
    goto :goto_40

    .line 1981
    :pswitch_85
    const-string v0, "swim_avg_swolf"

    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1982
    goto :goto_40

    .line 1987
    :pswitch_86
    const-string v0, "swim_time"

    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    move-object/from16 v3, v16

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1988
    .line 1996
    :goto_40
    :pswitch_87
    goto/16 :goto_3f

    .line 1997
    :cond_31
    move-object/from16 v0, v16

    invoke-virtual {v15, v0}, Lcom/huawei/datatype/SectionInfo;->setBundle(Landroid/os/Bundle;)V

    .line 1998
    invoke-interface {v10, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1999
    goto/16 :goto_3e

    .line 2000
    :cond_32
    goto/16 :goto_3d

    .line 2001
    :cond_33
    invoke-virtual {v9, v10}, Lcom/huawei/datatype/SectionList;->setSectionInfos(Ljava/util/List;)V

    .line 2002
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->mGetSectionListCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_34

    .line 2003
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->mGetSectionListCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getWorkoutRecordSectionList"

    .line 2004
    invoke-static {v9, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 2003
    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_16
    .catch Lo/day; {:try_start_16 .. :try_end_16} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_16 .. :try_end_16} :catch_1
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_2

    .line 2019
    :cond_34
    :goto_41
    goto/16 :goto_42

    .line 2013
    :catch_0
    move-exception v6

    .line 2014
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u63a5\u6536\u547d\u4ee4\u9519\u8bef e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2019
    goto :goto_42

    .line 2015
    :catch_1
    move-exception v6

    .line 2016
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u63a5\u6536\u547d\u4ee4\u9519\u8bef IndexOutOfBoundsException ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2019
    goto :goto_42

    .line 2017
    :catch_2
    move-exception v6

    .line 2018
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u63a5\u6536\u547d\u4ee4\u9519\u8bef Exception ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2019
    goto :goto_42

    .line 2021
    :cond_35
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u63a5\u6536\u547d\u4ee4\u9519\u8bef data lenth less 4"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2023
    :goto_42
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_7
        :pswitch_d
        :pswitch_12
        :pswitch_1a
        :pswitch_22
        :pswitch_27
        :pswitch_4c
        :pswitch_5f
        :pswitch_74
        :pswitch_75
        :pswitch_7c
        :pswitch_7d
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_5
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_6
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_f
        :pswitch_e
        :pswitch_10
        :pswitch_11
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x2
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_18
        :pswitch_19
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x3
        :pswitch_1b
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
        :pswitch_20
        :pswitch_21
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_6
    .packed-switch 0x6
        :pswitch_23
        :pswitch_24
        :pswitch_25
        :pswitch_26
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x2
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
        :pswitch_37
        :pswitch_38
        :pswitch_39
        :pswitch_3a
        :pswitch_3b
        :pswitch_3c
        :pswitch_3d
        :pswitch_3e
        :pswitch_3f
        :pswitch_40
        :pswitch_41
        :pswitch_42
        :pswitch_43
        :pswitch_44
        :pswitch_45
        :pswitch_46
        :pswitch_47
        :pswitch_48
        :pswitch_49
        :pswitch_4a
        :pswitch_4b
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x2
        :pswitch_4d
        :pswitch_4e
        :pswitch_4f
        :pswitch_50
        :pswitch_51
        :pswitch_52
        :pswitch_53
        :pswitch_54
        :pswitch_55
        :pswitch_56
        :pswitch_57
        :pswitch_58
        :pswitch_59
        :pswitch_5a
        :pswitch_5b
        :pswitch_5c
        :pswitch_5d
        :pswitch_5e
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0x2
        :pswitch_60
        :pswitch_61
        :pswitch_62
        :pswitch_63
    .end packed-switch

    :pswitch_data_a
    .packed-switch 0x0
        :pswitch_64
        :pswitch_65
        :pswitch_66
        :pswitch_67
        :pswitch_68
        :pswitch_69
        :pswitch_6a
        :pswitch_6b
        :pswitch_6c
        :pswitch_6d
        :pswitch_6e
        :pswitch_6f
        :pswitch_70
        :pswitch_71
        :pswitch_72
        :pswitch_73
    .end packed-switch

    :pswitch_data_b
    .packed-switch 0x4
        :pswitch_76
        :pswitch_77
        :pswitch_78
        :pswitch_79
        :pswitch_7b
        :pswitch_7a
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x2 -> :sswitch_1
        0x8 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_c
    .packed-switch 0x4
        :pswitch_7e
        :pswitch_7f
        :pswitch_80
        :pswitch_81
        :pswitch_87
        :pswitch_82
        :pswitch_83
        :pswitch_84
        :pswitch_85
        :pswitch_86
    .end packed-switch
.end method

.method public getSectionListStatistic(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 637
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setRealTimeData enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 638
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 639
    :try_start_0
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 640
    const/16 v0, 0x17

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 641
    const/16 v0, 0xe

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 646
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 650
    const-string v0, "id"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 652
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v9

    .line 654
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v10

    .line 657
    const-string v0, "sectionIndex"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v11

    .line 659
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v12

    .line 661
    const/16 v0, 0x8

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v13

    .line 663
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    .line 664
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    .line 663
    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 666
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 667
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 668
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 670
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 671
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 672
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 674
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 676
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 679
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 680
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 682
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 684
    move-object/from16 v0, p2

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->mGetSectionListCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 686
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v15

    monitor-exit v4

    throw v15

    .line 687
    :goto_0
    return-void
.end method

.method public getWorkoutData(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 493
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 494
    :try_start_0
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 495
    const/16 v0, 0x17

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 496
    const/16 v0, 0xa

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 499
    const/16 v0, 0x8

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v6

    .line 501
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 504
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get getWorkoutData id "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 505
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the parameters are "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 506
    const-string v0, "workout_record_id"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 508
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v9

    .line 510
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v10

    .line 513
    const-string v0, "workout_data_index"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v11

    .line 515
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v12

    .line 517
    const/4 v0, 0x3

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v13

    .line 519
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 520
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 522
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 525
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 527
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 530
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 532
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 534
    move-object/from16 v0, p2

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutDataCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 535
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v15

    monitor-exit v4

    throw v15

    .line 536
    :goto_0
    return-void
.end method

.method public getWorkoutRealTimeInfo(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 353
    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->lockObject:Ljava/lang/Object;

    monitor-enter v2

    .line 354
    :try_start_0
    new-instance v3, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v3}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 355
    const/16 v0, 0x17

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 356
    const/4 v0, 0x4

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 359
    const/4 v0, 0x3

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v4

    .line 361
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v5

    .line 364
    const-string v0, "sport_type"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 366
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v7

    .line 368
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 371
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 372
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 379
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 381
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v3}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 383
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetWorkoutRealTimeInfoCallbackList()Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 384
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 385
    monitor-exit v10

    goto :goto_0

    :catchall_0
    move-exception v11

    monitor-exit v10

    :try_start_2
    throw v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 386
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_1
    move-exception v12

    monitor-exit v2

    throw v12

    .line 387
    :goto_1
    return-void
.end method

.method public getWorkoutRecord(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 395
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 396
    :try_start_0
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 397
    const/16 v0, 0x17

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 398
    const/4 v0, 0x7

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 401
    const/16 v0, 0xc

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v6

    .line 403
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 405
    const-string v0, "startTime"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v8, v0

    .line 407
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    shr-int/lit8 v1, v8, 0x18

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v8, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 408
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v8, 0x8

    and-int/lit16 v1, v1, 0xff

    .line 409
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    and-int/lit16 v1, v8, 0xff

    .line 410
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 412
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v10

    .line 414
    const/4 v0, 0x3

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v11

    .line 416
    const-string v0, "endTime"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v12, v0

    .line 418
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    shr-int/lit8 v1, v12, 0x18

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v12, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 419
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v12, 0x8

    and-int/lit16 v1, v1, 0xff

    .line 420
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    and-int/lit16 v1, v12, 0xff

    .line 421
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 423
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v14

    .line 425
    const/4 v0, 0x4

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v15

    .line 428
    new-instance v16, Ljava/lang/StringBuilder;

    invoke-direct/range {v16 .. v16}, Ljava/lang/StringBuilder;-><init>()V

    .line 429
    move-object/from16 v0, v16

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    move-object/from16 v0, v16

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    move-object/from16 v0, v16

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    move-object/from16 v0, v16

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    move-object/from16 v0, v16

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    move-object/from16 v0, v16

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    move-object/from16 v0, v16

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    move-object/from16 v0, v16

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 439
    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 441
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 443
    move-object/from16 v0, p2

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRecordCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 444
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v17

    monitor-exit v4

    throw v17

    .line 445
    :goto_0
    return-void
.end method

.method public getWorkoutRecordPaceMap(Lcom/huawei/datatype/PaceIndexStruct;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 14

    .line 851
    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->lockObject:Ljava/lang/Object;

    monitor-enter v2

    .line 852
    :try_start_0
    new-instance v3, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v3}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 853
    const/16 v0, 0x17

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 854
    const/16 v0, 0xc

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 857
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v4

    .line 858
    const/4 v0, 0x4

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v5

    .line 861
    invoke-virtual {p1}, Lcom/huawei/datatype/PaceIndexStruct;->getRecordId()I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 862
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v7

    .line 864
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 868
    const-string v9, ""

    .line 869
    const-string v10, ""

    .line 871
    const-string v11, ""

    .line 872
    invoke-virtual {p1}, Lcom/huawei/datatype/PaceIndexStruct;->getPaceIndex()I

    move-result v0

    const/4 v1, 0x0

    if-gt v1, v0, :cond_0

    .line 873
    const/16 v0, 0x8

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v5

    .line 874
    invoke-virtual {p1}, Lcom/huawei/datatype/PaceIndexStruct;->getPaceIndex()I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v9

    .line 875
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v10

    .line 877
    const/16 v0, 0x8

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v11

    .line 880
    :cond_0
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 881
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 882
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 883
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 884
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 885
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 886
    invoke-virtual {p1}, Lcom/huawei/datatype/PaceIndexStruct;->getPaceIndex()I

    move-result v0

    const/4 v1, 0x0

    if-gt v1, v0, :cond_1

    .line 887
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 888
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 889
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 892
    :cond_1
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 893
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 895
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v3}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 897
    move-object/from16 v0, p2

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->mGetWorkoutRecordPaceMapListCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 898
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v13

    monitor-exit v2

    throw v13

    .line 899
    :goto_0
    return-void
.end method

.method public getWorkoutRecordStatistic(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 453
    iget-object v4, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 454
    :try_start_0
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 455
    const/16 v0, 0x17

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 456
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 459
    const/4 v0, 0x4

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v6

    .line 461
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 464
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get getWorkoutRecordStatistic id "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 465
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 467
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v9

    .line 469
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v10

    .line 471
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 472
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 476
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 478
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 479
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 481
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 483
    iput-object p2, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutRecordStatisticCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 484
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v12

    monitor-exit v4

    throw v12

    .line 485
    :goto_0
    return-void
.end method

.method public notificationWorkoutRecordSpeechPlayReportStatus(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 12

    .line 934
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ENTER notificationWorkoutRecordSpeechPlayReportStatus... "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 935
    iget-object v4, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 937
    if-eqz p1, :cond_0

    .line 938
    const-string v0, "result"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    .line 939
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 940
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 941
    const/16 v0, 0x17

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 942
    const/16 v0, 0xd

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 945
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 947
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v8

    .line 949
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v9

    .line 951
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 952
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 953
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 954
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 956
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 957
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 959
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v6}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 962
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v11

    monitor-exit v4

    throw v11

    .line 963
    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 2132
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 2133
    return-void
.end method

.method public registerNotificationGetWorkoutRecordStatisticCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 813
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetNotificationGetWorkoutRecordStatisticCallbackList()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 814
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 815
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 816
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 819
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 821
    :cond_1
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 822
    :goto_1
    return-void
.end method

.method public registerNotificationSportReminderCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 785
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetNotificationSportReminderCallbackList()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 786
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationSportReminderCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 787
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationSportReminderCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 788
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationSportReminderCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 791
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationSportReminderCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 793
    :cond_1
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 794
    :goto_1
    return-void
.end method

.method public registerNotificationStatusCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 695
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetNotificationStatusCallbackList()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 696
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationStatusCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 697
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationStatusCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 698
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationStatusCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 701
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationStatusCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 703
    :cond_1
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 704
    :goto_1
    return-void
.end method

.method public registerNotificationWorkoutRealTimeInfoCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 757
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetNotificationWorkoutRealTimeInfoCallbackList()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 758
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 759
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 760
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 763
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 765
    :cond_1
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 766
    :goto_1
    return-void
.end method

.method public registerNotificationWorkoutRecordSpeechPlayCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 907
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetNotificationWorkoutRecordSpeechPlayCallbackList()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 908
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 909
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 910
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 913
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 915
    :cond_1
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 916
    :goto_1
    return-void
.end method

.method public setNotificationStatusResponse(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 11

    .line 721
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "response of NotificationStatus info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 722
    iget-object v4, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 723
    :try_start_0
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 724
    const/16 v0, 0x17

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 725
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 728
    const-string v0, "notification_status_response"

    :try_start_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v6

    .line 730
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 732
    const/16 v0, 0x7f

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 734
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 735
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 736
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 737
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 739
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 740
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 742
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 743
    const-string v0, "success"

    const-string v1, "setNotificationStatusResponse"

    .line 744
    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 743
    const v1, 0x186a0

    invoke-interface {p2, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 747
    goto :goto_0

    .line 745
    :catch_0
    move-exception v6

    .line 746
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 748
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v10

    monitor-exit v4

    throw v10

    .line 749
    :goto_1
    return-void
.end method

.method public setOperator(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 47
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 108
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 109
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->hwDeviceMgr:Lo/dea;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 110
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwDeviceMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    const v0, 0x186a1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "setOperator"

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 112
    monitor-exit v4

    return-void

    .line 114
    :cond_0
    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0}, Lo/dea;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 115
    if-nez v5, :cond_1

    .line 116
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no device is connected."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    const v0, 0x186a1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "setOperator"

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 118
    monitor-exit v4

    return-void

    .line 120
    :cond_1
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOperator enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 122
    const/16 v0, 0x17

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 123
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 129
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 132
    const-string v0, "sport_type"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v9

    .line 134
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v10

    .line 136
    const/4 v0, 0x3

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v11

    .line 139
    const/16 v12, 0x102

    .line 140
    const-string v0, "workout_type"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 141
    const-string v0, "workout_type"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v12

    .line 143
    :cond_2
    move-object/from16 v0, p0

    invoke-direct {v0, v12}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->transSportType(I)I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v13

    .line 145
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v14

    .line 147
    const/4 v0, 0x5

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v15

    .line 150
    const/16 v16, 0x0

    .line 151
    const-string v0, "run_plan_date"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 152
    const-string v0, "run_plan_date"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v2, v0

    move/from16 v16, v2

    .line 154
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    shr-int/lit8 v1, v16, 0x18

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v16, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 155
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v16, 0x8

    and-int/lit16 v1, v1, 0xff

    .line 156
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v16

    and-int/lit16 v1, v1, 0xff

    .line 157
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 159
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v18

    .line 161
    const/4 v0, 0x4

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v19

    .line 164
    const-string v0, "operator_type"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v20

    .line 166
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v21

    .line 168
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v22

    .line 171
    const-string v0, "operation_time"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v2, v0

    move/from16 v23, v2

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    shr-int/lit8 v1, v23, 0x18

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v23, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 173
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v23, 0x8

    and-int/lit16 v1, v1, 0xff

    .line 174
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v23

    and-int/lit16 v1, v1, 0xff

    .line 175
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    .line 177
    invoke-virtual/range {v24 .. v24}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v25

    .line 179
    const/4 v0, 0x6

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v26

    .line 182
    const/16 v0, 0x87

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v27

    .line 184
    const/16 v28, 0x0

    .line 186
    const/16 v29, 0x0

    .line 187
    const-string v0, "distance"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 188
    const-string v0, "distance"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v29

    .line 191
    :cond_4
    move/from16 v0, v29

    int-to-long v0, v0

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v30

    .line 193
    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v31

    .line 195
    const/16 v0, 0x8

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v32

    .line 197
    const/16 v33, 0x0

    .line 198
    const-string v0, "calorie"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 199
    const-string v0, "calorie"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v33

    .line 202
    :cond_5
    move/from16 v0, v33

    int-to-long v0, v0

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v34

    .line 204
    invoke-virtual/range {v34 .. v34}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v35

    .line 206
    const/16 v0, 0x9

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v36

    .line 208
    const/16 v37, 0x0

    .line 209
    const-string v0, "duration"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 210
    const-string v0, "duration"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v37

    .line 213
    :cond_6
    move/from16 v0, v37

    int-to-long v0, v0

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v38

    .line 215
    invoke-virtual/range {v38 .. v38}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v39

    .line 217
    const/16 v0, 0xa

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v40

    .line 219
    const/4 v0, 0x0

    move/from16 v1, v29

    if-ne v0, v1, :cond_7

    const/4 v0, 0x0

    move/from16 v1, v33

    if-ne v0, v1, :cond_7

    const/4 v0, 0x0

    move/from16 v1, v37

    if-eq v0, v1, :cond_a

    .line 220
    :cond_7
    const/4 v0, 0x0

    move/from16 v1, v29

    if-eq v0, v1, :cond_8

    .line 221
    invoke-virtual/range {v32 .. v32}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual/range {v31 .. v31}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v28, v0, 0x0

    .line 223
    :cond_8
    const/4 v0, 0x0

    move/from16 v1, v33

    if-eq v0, v1, :cond_9

    .line 224
    invoke-virtual/range {v36 .. v36}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual/range {v35 .. v35}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {v34 .. v34}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    add-int v28, v28, v0

    .line 226
    :cond_9
    const/4 v0, 0x0

    move/from16 v1, v37

    if-eq v0, v1, :cond_a

    .line 227
    invoke-virtual/range {v40 .. v40}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual/range {v39 .. v39}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {v38 .. v38}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    add-int v28, v28, v0

    .line 230
    :cond_a
    div-int/lit8 v0, v28, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v41

    .line 232
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    .line 233
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    .line 234
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    .line 235
    invoke-virtual/range {v26 .. v26}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {v25 .. v25}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {v24 .. v24}, Ljava/lang/String;->length()I

    move-result v1

    add-int v42, v0, v1

    .line 237
    const/4 v0, 0x0

    move/from16 v1, v28

    if-eq v0, v1, :cond_b

    .line 238
    invoke-virtual/range {v27 .. v27}, Ljava/lang/String;->length()I

    move-result v0

    add-int v0, v0, v28

    invoke-virtual/range {v41 .. v41}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    add-int v42, v42, v0

    .line 241
    :cond_b
    const-string v0, "sport_type"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_c

    .line 242
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v0

    add-int v0, v0, v42

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 244
    :cond_c
    div-int/lit8 v0, v42, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v7

    .line 247
    :goto_0
    new-instance v43, Ljava/lang/StringBuilder;

    invoke-direct/range {v43 .. v43}, Ljava/lang/StringBuilder;-><init>()V

    .line 248
    move-object/from16 v0, v43

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    move-object/from16 v0, v43

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    move-object/from16 v0, v43

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    move-object/from16 v0, v43

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    move-object/from16 v0, v43

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    move-object/from16 v0, v43

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    move-object/from16 v0, v43

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    move-object/from16 v0, v43

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    const-string v0, "sport_type"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_d

    .line 260
    move-object/from16 v0, v43

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    move-object/from16 v0, v43

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    move-object/from16 v0, v43

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    :cond_d
    move-object/from16 v0, v43

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    move-object/from16 v0, v43

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    move-object/from16 v0, v43

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    move-object/from16 v0, v43

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    move-object/from16 v0, v43

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    move-object/from16 v0, v43

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    const/4 v0, 0x0

    move/from16 v1, v42

    if-eq v0, v1, :cond_10

    .line 274
    move-object/from16 v0, v43

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    move-object/from16 v0, v43

    move-object/from16 v1, v41

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    const/4 v0, 0x0

    move/from16 v1, v29

    if-eq v0, v1, :cond_e

    .line 277
    move-object/from16 v0, v43

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    move-object/from16 v0, v43

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    move-object/from16 v0, v43

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    :cond_e
    const/4 v0, 0x0

    move/from16 v1, v33

    if-eq v0, v1, :cond_f

    .line 282
    move-object/from16 v0, v43

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    move-object/from16 v0, v43

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    move-object/from16 v0, v43

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    :cond_f
    const/4 v0, 0x0

    move/from16 v1, v37

    if-eq v0, v1, :cond_10

    .line 287
    move-object/from16 v0, v43

    move-object/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    move-object/from16 v0, v43

    move-object/from16 v1, v39

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    move-object/from16 v0, v43

    move-object/from16 v1, v38

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    :cond_10
    invoke-virtual/range {v43 .. v43}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 294
    invoke-virtual/range {v43 .. v43}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 296
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v6}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 297
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getSetOperatorCallbackList()Ljava/lang/Object;

    move-result-object v44

    monitor-enter v44
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 298
    :try_start_3
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->setOperatorCallbackList:Ljava/util/List;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 299
    monitor-exit v44

    goto :goto_1

    :catchall_0
    move-exception v45

    monitor-exit v44

    :try_start_4
    throw v45
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 300
    :goto_1
    monitor-exit v4

    goto :goto_2

    :catchall_1
    move-exception v46

    monitor-exit v4

    throw v46

    .line 301
    :goto_2
    return-void
.end method

.method public unRegisterNotificationGetWorkoutRecordStatisticCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 828
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetNotificationGetWorkoutRecordStatisticCallbackList()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 829
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 830
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 832
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 833
    :goto_0
    return-void
.end method

.method public unRegisterNotificationSportReminderCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 800
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetNotificationSportReminderCallbackList()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 801
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationSportReminderCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 802
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationSportReminderCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 804
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 805
    :goto_0
    return-void
.end method

.method public unRegisterNotificationStatusCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 710
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetNotificationStatusCallbackList()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 711
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationStatusCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 712
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationStatusCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 714
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 715
    :goto_0
    return-void
.end method

.method public unRegisterNotificationWorkoutRealTimeInfoCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 772
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetNotificationWorkoutRealTimeInfoCallbackList()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 773
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 774
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 776
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 777
    :goto_0
    return-void
.end method

.method public unRegisterNotificationWorkoutRecordSpeechPlayCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 922
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetNotificationWorkoutRecordSpeechPlayCallbackList()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 923
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 924
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 926
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 927
    :goto_0
    return-void
.end method

.method public workoutOperateRealtimeData(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 27
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 544
    const-string v0, "HWWorkoutServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setRealTimeData enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 545
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 546
    :try_start_0
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 547
    const/16 v0, 0x17

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 548
    const/16 v0, 0xb

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 554
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 555
    const-string v0, "pace"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 556
    const/16 v0, 0x1a

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 558
    :cond_0
    const/16 v0, 0x16

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v7

    .line 562
    :goto_0
    const-string v0, "exercise_duration"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v9

    .line 564
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v10

    .line 566
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v11

    .line 569
    const-string v0, "distance"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0xa

    int-to-long v0, v0

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v12

    .line 571
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v13

    .line 573
    const/4 v0, 0x3

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v14

    .line 576
    const-string v0, "calorie"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v15

    .line 578
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v16

    .line 580
    const/4 v0, 0x4

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v17

    .line 583
    const-string v0, "speed"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v18

    .line 585
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v19

    .line 587
    const/4 v0, 0x5

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v20

    .line 589
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    .line 590
    move-object/from16 v0, v21

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 591
    move-object/from16 v0, v21

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    move-object/from16 v0, v21

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    move-object/from16 v0, v21

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    move-object/from16 v0, v21

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    move-object/from16 v0, v21

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    move-object/from16 v0, v21

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    move-object/from16 v0, v21

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 601
    move-object/from16 v0, v21

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 602
    move-object/from16 v0, v21

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 603
    move-object/from16 v0, v21

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 605
    move-object/from16 v0, v21

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 606
    move-object/from16 v0, v21

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 607
    move-object/from16 v0, v21

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 609
    const-string v0, "pace"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 611
    const-string v0, "pace"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v22

    .line 613
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v23

    .line 615
    const/4 v0, 0x6

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v24

    .line 616
    move-object/from16 v0, v21

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    move-object/from16 v0, v21

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    :cond_1
    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 622
    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 624
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 626
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getGetWorkoutOperatorRealtimeDataCallbackList()Ljava/util/List;

    move-result-object v22

    monitor-enter v22
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 627
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getWorkoutOperatorRealtimeDataCallbackList:Ljava/util/List;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 628
    monitor-exit v22

    goto :goto_1

    :catchall_0
    move-exception v25

    monitor-exit v22

    :try_start_2
    throw v25
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 629
    :goto_1
    monitor-exit v4

    goto :goto_2

    :catchall_1
    move-exception v26

    monitor-exit v4

    throw v26

    .line 630
    :goto_2
    return-void
.end method
