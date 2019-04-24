.class public Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "HWWorkoutServiceAW70Manager"

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

.field private static getWorkoutDataCallbackList:Ljava/util/List; = null
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

.field private static getWorkoutRecordCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static getWorkoutRecordStatisticCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static instance:Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager; = null

.field private static mGetWorkoutRecordPaceMapListCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static setOperatorCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field


# instance fields
.field private hwDeviceMgr:Lo/dea;

.field private final lockObject:Ljava/lang/Object;

.field private mContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->setOperatorCallbackList:Ljava/util/List;

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getOperatorCallbackList:Ljava/util/List;

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    .line 63
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordCallbackList:Ljava/util/List;

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordStatisticCallbackList:Ljava/util/List;

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutDataCallbackList:Ljava/util/List;

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationStatusCallbackList:Ljava/util/List;

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationSportReminderCallbackList:Ljava/util/List;

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;

    .line 70
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutOperatorRealtimeDataCallbackList:Ljava/util/List;

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->mGetWorkoutRecordPaceMapListCallbackList:Ljava/util/List;

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->lockObject:Ljava/lang/Object;

    .line 82
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->mContext:Landroid/content/Context;

    .line 83
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->hwDeviceMgr:Lo/dea;

    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->hwDeviceMgr:Lo/dea;

    .line 84
    return-void
.end method

.method private getAW70Identify()Ljava/lang/String;
    .locals 2

    .line 243
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0}, Lo/dea;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    .line 244
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 245
    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 247
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static declared-synchronized getGetNotificationGetWorkoutRecordStatisticCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    monitor-enter v1

    .line 1656
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;
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

    const-class v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    monitor-enter v1

    .line 1652
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationSportReminderCallbackList:Ljava/util/List;
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

    const-class v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    monitor-enter v1

    .line 1644
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationStatusCallbackList:Ljava/util/List;
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

    const-class v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    monitor-enter v1

    .line 1648
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;
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

    .line 1668
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    return-object v0
.end method

.method private static declared-synchronized getGetOperatorCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    monitor-enter v1

    .line 1624
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getOperatorCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static declared-synchronized getGetWorkoutDataCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    monitor-enter v1

    .line 1640
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutDataCallbackList:Ljava/util/List;
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

    .line 1660
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutOperatorRealtimeDataCallbackList:Ljava/util/List;

    return-object v0
.end method

.method private static declared-synchronized getGetWorkoutRealTimeInfoCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    monitor-enter v1

    .line 1628
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRealTimeInfoCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static declared-synchronized getGetWorkoutRecordCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    monitor-enter v1

    .line 1632
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static declared-synchronized getGetWorkoutRecordPaceMapListCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    monitor-enter v1

    .line 1664
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->mGetWorkoutRecordPaceMapListCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static declared-synchronized getGetWorkoutRecordStatisticCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    monitor-enter v1

    .line 1636
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordStatisticCallbackList:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static getInstance()Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;
    .locals 2

    .line 75
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->instance:Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 76
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->instance:Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    .line 78
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->instance:Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    return-object v0
.end method

.method private static declared-synchronized getSetOperatorCallbackList()Ljava/lang/Object;
    .locals 3

    const-class v1, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;

    monitor-enter v1

    .line 1620
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->setOperatorCallbackList:Ljava/util/List;
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
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Lcom/huawei/datatype/WorkoutDataInfo;)V"
        }
    .end annotation

    .line 1537
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1539
    new-instance v4, Lcom/huawei/datatype/RunPostureDataInfo;

    invoke-direct {v4}, Lcom/huawei/datatype/RunPostureDataInfo;-><init>()V

    .line 1540
    new-instance v5, Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1541
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1542
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1543
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1544
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmCadence info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1545
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmCadence(I)V

    .line 1547
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1548
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1549
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1550
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1551
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1552
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmStepLength info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1553
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmStepLength(I)V

    .line 1555
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1556
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1557
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1558
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1559
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1560
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmGroundContactTime info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1561
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmGroundContactTime(I)V

    .line 1563
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1564
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1565
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1566
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmGroundImpactAcceleration info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1567
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmGroundImpactAcceleration(I)V

    .line 1569
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1570
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1571
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1572
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1573
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1574
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmSwingAngle info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1575
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmSwingAngle(I)V

    .line 1577
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1578
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1579
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1580
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmForeFootStrikePattern info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1581
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmForeFootStrikePattern(I)V

    .line 1583
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1584
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1585
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1586
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmWholeFootStrikePattern info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1587
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmWholeFootStrikePattern(I)V

    .line 1589
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1590
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1591
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1592
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmHindPawStrikePattern info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1593
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmHindPawStrikePattern(I)V

    .line 1595
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1596
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1597
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo setmEversionExcursion info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1598
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmEversionExcursion(I)V

    .line 1600
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRunPostureDataInfo runPostureDataInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1601
    invoke-virtual {p2, v4}, Lcom/huawei/datatype/WorkoutDataInfo;->setmRunPostureDataInfo(Lcom/huawei/datatype/RunPostureDataInfo;)V

    .line 1602
    return-void
.end method

.method private transSportType(I)I
    .locals 1

    .line 1605
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1607
    :pswitch_0
    const/4 v0, 0x2

    return v0

    .line 1609
    :pswitch_1
    const/4 v0, 0x1

    return v0

    .line 1611
    :pswitch_2
    const/4 v0, 0x3

    return v0

    .line 1613
    :pswitch_3
    const/4 v0, 0x5

    return v0

    .line 1615
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
.method public getResult([B)V
    .locals 32

    .line 686
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult(): "

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

    .line 687
    invoke-static/range {p1 .. p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 688
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v1, v0, :cond_36

    .line 689
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 691
    :try_start_0
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    invoke-virtual {v0, v4}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v5

    .line 692
    iget-object v6, v5, Lo/dba;->e:Ljava/util/List;

    .line 693
    iget-object v7, v5, Lo/dba;->b:Ljava/util/List;

    .line 694
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_41

    .line 698
    :pswitch_0
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v8

    .line 700
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getSetOperatorCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 701
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->setOperatorCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 702
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->setOperatorCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 703
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "setOperator"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 702
    invoke-interface {v0, v8, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 704
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->setOperatorCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 706
    :cond_0
    monitor-exit v9

    goto :goto_0

    :catchall_0
    move-exception v10

    monitor-exit v9

    :try_start_2
    throw v10

    .line 707
    :goto_0
    goto/16 :goto_41

    .line 711
    :pswitch_1
    new-instance v8, Lcom/huawei/datatype/OperatorStatus;

    invoke-direct {v8}, Lcom/huawei/datatype/OperatorStatus;-><init>()V

    .line 712
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 713
    iget-object v11, v10, Lo/dba;->e:Ljava/util/List;

    .line 714
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/daw;

    .line 715
    invoke-virtual {v13}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_3

    .line 717
    :pswitch_2
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/OperatorStatus;->setSport_type(I)V

    .line 718
    goto :goto_3

    .line 721
    :pswitch_3
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/OperatorStatus;->setWorkout_type(I)V

    .line 722
    goto :goto_3

    .line 725
    :pswitch_4
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/OperatorStatus;->setRun_plan_date(J)V

    .line 726
    goto :goto_3

    .line 729
    :pswitch_5
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/OperatorStatus;->setOperator_type(I)V

    .line 730
    goto :goto_3

    .line 733
    :pswitch_6
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/OperatorStatus;->setOperation_time(J)V

    .line 734
    .line 740
    :goto_3
    goto/16 :goto_2

    .line 741
    :cond_1
    goto/16 :goto_1

    .line 742
    :cond_2
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetNotificationStatusCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_2
    .catch Lo/day; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 743
    :try_start_3
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationStatusCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 744
    const-string v0, "notificationStatus"

    .line 745
    invoke-static {v8, v0}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 744
    const v1, 0x186a0

    invoke-interface {v11, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 746
    goto :goto_4

    .line 747
    :cond_3
    monitor-exit v9

    goto :goto_5

    :catchall_1
    move-exception v14

    monitor-exit v9

    :try_start_4
    throw v14

    .line 748
    :goto_5
    goto/16 :goto_41

    .line 752
    :pswitch_7
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_4

    .line 753
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

    if-ne v1, v0, :cond_4

    .line 755
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetOperatorCallbackList()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8
    :try_end_4
    .catch Lo/day; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 756
    const/4 v0, 0x0

    :try_start_5
    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 757
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getOperatorCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 758
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getOperator"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 757
    invoke-interface {v0, v9, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 759
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getOperatorCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 760
    monitor-exit v8

    goto :goto_6

    :catchall_2
    move-exception v15

    monitor-exit v8

    :try_start_6
    throw v15

    .line 761
    :goto_6
    goto/16 :goto_41

    .line 764
    :cond_4
    new-instance v8, Lcom/huawei/datatype/OperatorStatus;

    invoke-direct {v8}, Lcom/huawei/datatype/OperatorStatus;-><init>()V

    .line 765
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 766
    iget-object v11, v10, Lo/dba;->e:Ljava/util/List;

    .line 767
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_8
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/daw;

    .line 768
    invoke-virtual {v13}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_2

    goto/16 :goto_9

    .line 770
    :pswitch_8
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/OperatorStatus;->setTrain_monitor_state(I)V

    .line 771
    goto :goto_9

    .line 774
    :pswitch_9
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/OperatorStatus;->setOperator_type(I)V

    .line 775
    goto :goto_9

    .line 778
    :pswitch_a
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/OperatorStatus;->setSport_type(I)V

    .line 779
    goto :goto_9

    .line 782
    :pswitch_b
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/OperatorStatus;->setRun_plan_date(J)V

    .line 783
    goto :goto_9

    .line 786
    :pswitch_c
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/OperatorStatus;->setWorkout_type(I)V

    .line 787
    .line 793
    :goto_9
    goto/16 :goto_8

    .line 794
    :cond_5
    goto/16 :goto_7

    .line 795
    :cond_6
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetOperatorCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_6
    .catch Lo/day; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 796
    :try_start_7
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getOperatorCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getOperator"

    .line 797
    invoke-static {v8, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 796
    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 798
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getOperatorCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 799
    monitor-exit v9

    goto :goto_a

    :catchall_3
    move-exception v16

    monitor-exit v9

    :try_start_8
    throw v16

    .line 800
    :goto_a
    goto/16 :goto_41

    .line 804
    :pswitch_d
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_7

    .line 805
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

    if-ne v1, v0, :cond_7

    .line 806
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetWorkoutRealTimeInfoCallbackList()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8
    :try_end_8
    .catch Lo/day; {:try_start_8 .. :try_end_8} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    .line 807
    const/4 v0, 0x0

    :try_start_9
    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 808
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 809
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getWorkoutRealTimeInfo"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 808
    invoke-interface {v0, v9, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 810
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 811
    monitor-exit v8

    goto :goto_b

    :catchall_4
    move-exception v17

    monitor-exit v8

    :try_start_a
    throw v17

    .line 812
    :goto_b
    goto/16 :goto_41

    .line 815
    :cond_7
    new-instance v8, Lcom/huawei/datatype/WorkoutRealTimeInfo;

    invoke-direct {v8}, Lcom/huawei/datatype/WorkoutRealTimeInfo;-><init>()V

    .line 816
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 817
    iget-object v11, v10, Lo/dba;->e:Ljava/util/List;

    .line 818
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_d
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/daw;

    .line 819
    invoke-virtual {v13}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_3

    goto :goto_e

    .line 824
    :pswitch_e
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setSport_type(I)V

    .line 825
    goto :goto_e

    .line 828
    :pswitch_f
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setClime_info(J)V

    .line 829
    goto :goto_e

    .line 832
    :pswitch_10
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setDistance_info(J)V

    .line 833
    goto :goto_e

    .line 836
    :pswitch_11
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setClime_info(J)V

    .line 837
    .line 843
    :goto_e
    goto/16 :goto_d

    .line 844
    :cond_8
    goto/16 :goto_c

    .line 845
    :cond_9
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetWorkoutRealTimeInfoCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_a
    .catch Lo/day; {:try_start_a .. :try_end_a} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    .line 846
    :try_start_b
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getWorkoutRealTimeInfo"

    .line 847
    invoke-static {v8, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 846
    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 848
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 849
    monitor-exit v9

    goto :goto_f

    :catchall_5
    move-exception v18

    monitor-exit v9

    :try_start_c
    throw v18

    .line 850
    :goto_f
    goto/16 :goto_41

    .line 854
    :pswitch_12
    new-instance v8, Lcom/huawei/datatype/WorkoutRealTimeInfo;

    invoke-direct {v8}, Lcom/huawei/datatype/WorkoutRealTimeInfo;-><init>()V

    .line 855
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_10
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 856
    iget-object v11, v10, Lo/dba;->e:Ljava/util/List;

    .line 857
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_11
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/daw;

    .line 858
    invoke-virtual {v13}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_4

    goto/16 :goto_12

    .line 860
    :pswitch_13
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setSport_type(I)V

    .line 861
    goto :goto_12

    .line 864
    :pswitch_14
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setSpeed_info(F)V

    .line 865
    goto :goto_12

    .line 868
    :pswitch_15
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setSport_type(I)V

    .line 869
    goto :goto_12

    .line 872
    :pswitch_16
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setClime_info(J)V

    .line 873
    goto :goto_12

    .line 876
    :pswitch_17
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setCalorie_info(J)V

    .line 877
    goto :goto_12

    .line 880
    :pswitch_18
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setDistance_info(J)V

    .line 881
    goto :goto_12

    .line 884
    :pswitch_19
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRealTimeInfo;->setClime_info(J)V

    .line 885
    .line 891
    :goto_12
    goto/16 :goto_11

    .line 892
    :cond_a
    goto/16 :goto_10

    .line 893
    :cond_b
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetNotificationWorkoutRealTimeInfoCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_c
    .catch Lo/day; {:try_start_c .. :try_end_c} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_2

    .line 894
    :try_start_d
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_13
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 895
    const-string v0, "notificationWorkoutRealTimeInfo"

    .line 896
    invoke-static {v8, v0}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 895
    const v1, 0x186a0

    invoke-interface {v11, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 897
    goto :goto_13

    .line 898
    :cond_c
    monitor-exit v9

    goto :goto_14

    :catchall_6
    move-exception v19

    monitor-exit v9

    :try_start_e
    throw v19

    .line 899
    :goto_14
    goto/16 :goto_41

    .line 903
    :pswitch_1a
    new-instance v8, Lcom/huawei/datatype/SportReminder;

    invoke-direct {v8}, Lcom/huawei/datatype/SportReminder;-><init>()V

    .line 904
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_15
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 905
    iget-object v11, v10, Lo/dba;->e:Ljava/util/List;

    .line 906
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_16
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/daw;

    .line 907
    invoke-virtual {v13}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_5

    goto/16 :goto_17

    .line 909
    :pswitch_1b
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/SportReminder;->setReminder_type(I)V

    .line 910
    goto/16 :goto_17

    .line 913
    :pswitch_1c
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/SportReminder;->setRun_phrase_number(I)V

    .line 914
    goto/16 :goto_17

    .line 917
    :pswitch_1d
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 918
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

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

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 919
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

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

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 920
    invoke-virtual {v8, v14}, Lcom/huawei/datatype/SportReminder;->setRun_phrase_variable(Ljava/util/List;)V

    .line 921
    goto :goto_17

    .line 924
    :pswitch_1e
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/SportReminder;->setDistance_info(J)V

    .line 925
    goto :goto_17

    .line 928
    :pswitch_1f
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/SportReminder;->setTime_info(J)V

    .line 929
    goto :goto_17

    .line 932
    :pswitch_20
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/SportReminder;->setHr_value_info(I)V

    .line 933
    goto :goto_17

    .line 936
    :pswitch_21
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/SportReminder;->setHr_status_info(I)V

    .line 937
    .line 943
    :goto_17
    goto/16 :goto_16

    .line 944
    :cond_d
    goto/16 :goto_15

    .line 945
    :cond_e
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetNotificationSportReminderCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_e
    .catch Lo/day; {:try_start_e .. :try_end_e} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_2

    .line 946
    :try_start_f
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationSportReminderCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_18
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 947
    const-string v0, "notificationSportReminder"

    .line 948
    invoke-static {v8, v0}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 947
    const v1, 0x186a0

    invoke-interface {v11, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 949
    goto :goto_18

    .line 950
    :cond_f
    monitor-exit v9

    goto :goto_19

    :catchall_7
    move-exception v20

    monitor-exit v9

    :try_start_10
    throw v20

    .line 951
    :goto_19
    goto/16 :goto_41

    .line 955
    :pswitch_22
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_11

    .line 956
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

    .line 957
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetWorkoutRecordCallbackList()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8
    :try_end_10
    .catch Lo/day; {:try_start_10 .. :try_end_10} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_10 .. :try_end_10} :catch_1
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_2

    .line 958
    :try_start_11
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_10

    .line 959
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 960
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getWorkoutRecord"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v9, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 961
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 963
    :cond_10
    monitor-exit v8

    goto :goto_1a

    :catchall_8
    move-exception v21

    monitor-exit v8

    :try_start_12
    throw v21

    .line 964
    :goto_1a
    goto/16 :goto_41

    .line 967
    :cond_11
    new-instance v8, Lcom/huawei/datatype/WorkoutRecord;

    invoke-direct {v8}, Lcom/huawei/datatype/WorkoutRecord;-><init>()V

    .line 968
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 969
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dba;

    .line 970
    iget-object v12, v11, Lo/dba;->e:Ljava/util/List;

    .line 971
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1c
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/daw;

    .line 972
    invoke-virtual {v14}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1d

    .line 974
    :sswitch_0
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecord;->setWorkout_record_count(I)V

    .line 975
    .line 981
    :goto_1d
    goto :goto_1c

    .line 982
    :cond_12
    iget-object v13, v11, Lo/dba;->b:Ljava/util/List;

    .line 983
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_1e
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/dba;

    .line 984
    iget-object v0, v15, Lo/dba;->e:Ljava/util/List;

    move-object/from16 v16, v0

    .line 985
    new-instance v17, Lcom/huawei/datatype/WorkoutRecordStruct;

    invoke-direct/range {v17 .. v17}, Lcom/huawei/datatype/WorkoutRecordStruct;-><init>()V

    .line 986
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_1f
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lo/daw;

    .line 987
    invoke-virtual/range {v19 .. v19}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_6

    goto :goto_20

    .line 989
    :pswitch_23
    invoke-virtual/range {v19 .. v19}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutRecordStruct;->setWorkout_record_id(I)V

    .line 990
    goto :goto_20

    .line 993
    :pswitch_24
    invoke-virtual/range {v19 .. v19}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutRecordStruct;->setWorkout_index_count(I)V

    .line 994
    goto :goto_20

    .line 997
    :pswitch_25
    invoke-virtual/range {v19 .. v19}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutRecordStruct;->setPaceIndexCount(I)V

    .line 998
    .line 1004
    :goto_20
    goto :goto_1f

    .line 1005
    :cond_13
    move-object/from16 v0, v17

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1006
    goto/16 :goto_1e

    .line 1007
    :cond_14
    goto/16 :goto_1b

    .line 1008
    :cond_15
    invoke-virtual {v8, v9}, Lcom/huawei/datatype/WorkoutRecord;->setWorkoutRecordStructList(Ljava/util/List;)V

    .line 1009
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetWorkoutRecordCallbackList()Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10
    :try_end_12
    .catch Lo/day; {:try_start_12 .. :try_end_12} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_12 .. :try_end_12} :catch_1
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_2

    .line 1010
    :try_start_13
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_16

    .line 1011
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getWorkoutRecord"

    .line 1012
    invoke-static {v8, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 1011
    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1013
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 1015
    :cond_16
    monitor-exit v10

    goto :goto_21

    :catchall_9
    move-exception v22

    monitor-exit v10

    :try_start_14
    throw v22

    .line 1016
    :goto_21
    goto/16 :goto_41

    .line 1020
    :pswitch_26
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_18

    .line 1021
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

    if-ne v1, v0, :cond_18

    .line 1022
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetWorkoutRecordStatisticCallbackList()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8
    :try_end_14
    .catch Lo/day; {:try_start_14 .. :try_end_14} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_14 .. :try_end_14} :catch_1
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_2

    .line 1023
    :try_start_15
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordStatisticCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_17

    .line 1024
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 1025
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordStatisticCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getWorkoutRecordStatistic"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v9, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1026
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordStatisticCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 1028
    :cond_17
    monitor-exit v8

    goto :goto_22

    :catchall_a
    move-exception v23

    monitor-exit v8

    :try_start_16
    throw v23

    .line 1029
    :goto_22
    goto/16 :goto_41

    .line 1032
    :cond_18
    new-instance v8, Lcom/huawei/datatype/WorkoutRecordStatistic;

    invoke-direct {v8}, Lcom/huawei/datatype/WorkoutRecordStatistic;-><init>()V

    .line 1033
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_23
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 1034
    iget-object v11, v10, Lo/dba;->e:Ljava/util/List;

    .line 1035
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_24
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/daw;

    .line 1036
    invoke-virtual {v13}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_7

    goto/16 :goto_25

    .line 1038
    :pswitch_27
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_id(I)V

    .line 1039
    goto/16 :goto_25

    .line 1042
    :pswitch_28
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_status(I)V

    .line 1043
    goto/16 :goto_25

    .line 1046
    :pswitch_29
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_start_time(J)V

    .line 1047
    goto/16 :goto_25

    .line 1050
    :pswitch_2a
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_end_time(J)V

    .line 1051
    goto/16 :goto_25

    .line 1054
    :pswitch_2b
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_calorie(I)V

    .line 1055
    goto/16 :goto_25

    .line 1058
    :pswitch_2c
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_distance(I)V

    .line 1059
    goto/16 :goto_25

    .line 1062
    :pswitch_2d
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_step(J)V

    .line 1063
    goto/16 :goto_25

    .line 1066
    :pswitch_2e
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_total_time(J)V

    .line 1067
    goto/16 :goto_25

    .line 1070
    :pswitch_2f
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_speed(I)V

    .line 1071
    goto/16 :goto_25

    .line 1074
    :pswitch_30
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_climb(J)V

    .line 1075
    goto/16 :goto_25

    .line 1078
    :pswitch_31
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_HrABS_peak_min(I)V

    .line 1079
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_HrABS_peak_max(I)V

    .line 1080
    goto/16 :goto_25

    .line 1083
    :pswitch_32
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_load_peak(I)V

    .line 1084
    goto/16 :goto_25

    .line 1087
    :pswitch_33
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_etraining_effect(I)V

    .line 1088
    goto/16 :goto_25

    .line 1091
    :pswitch_34
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_Epoc(I)V

    .line 1092
    goto/16 :goto_25

    .line 1095
    :pswitch_35
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_maxMET(I)V

    .line 1096
    goto/16 :goto_25

    .line 1099
    :pswitch_36
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_recovery_time(I)V

    .line 1100
    goto/16 :goto_25

    .line 1103
    :pswitch_37
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_exercise_duration(J)V

    .line 1104
    goto/16 :goto_25

    .line 1107
    :pswitch_38
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_date_Info(J)V

    .line 1108
    goto/16 :goto_25

    .line 1111
    :pswitch_39
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_type(I)V

    .line 1112
    goto :goto_25

    .line 1115
    :pswitch_3a
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setSwim_type(I)V

    .line 1116
    goto :goto_25

    .line 1119
    :pswitch_3b
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setSwim_pull_times(I)V

    .line 1120
    goto :goto_25

    .line 1123
    :pswitch_3c
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setSwim_pull_rate(I)V

    .line 1124
    goto :goto_25

    .line 1127
    :pswitch_3d
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setSwim_pool_length(I)V

    .line 1128
    goto :goto_25

    .line 1131
    :pswitch_3e
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setSwim_trip_times(I)V

    .line 1132
    goto :goto_25

    .line 1135
    :pswitch_3f
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setSwim_avg_swolf(I)V

    .line 1136
    .line 1142
    :goto_25
    goto/16 :goto_24

    .line 1143
    :cond_19
    goto/16 :goto_23

    .line 1144
    :cond_1a
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetWorkoutRecordStatisticCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_16
    .catch Lo/day; {:try_start_16 .. :try_end_16} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_16 .. :try_end_16} :catch_1
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_2

    .line 1145
    :try_start_17
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordStatisticCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1b

    .line 1146
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordStatisticCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getWorkoutRecordStatistic"

    .line 1147
    invoke-static {v8, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 1146
    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1148
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordStatisticCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_b

    .line 1150
    :cond_1b
    monitor-exit v9

    goto :goto_26

    :catchall_b
    move-exception v24

    monitor-exit v9

    :try_start_18
    throw v24

    .line 1151
    :goto_26
    goto/16 :goto_41

    .line 1155
    :pswitch_40
    new-instance v8, Lcom/huawei/datatype/WorkoutRecordStatistic;

    invoke-direct {v8}, Lcom/huawei/datatype/WorkoutRecordStatistic;-><init>()V

    .line 1156
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_27
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 1157
    iget-object v11, v10, Lo/dba;->e:Ljava/util/List;

    .line 1158
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_28
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/daw;

    .line 1159
    invoke-virtual {v13}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_8

    goto/16 :goto_29

    .line 1161
    :pswitch_41
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_id(I)V

    .line 1162
    goto/16 :goto_29

    .line 1165
    :pswitch_42
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_status(I)V

    .line 1166
    goto/16 :goto_29

    .line 1169
    :pswitch_43
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_start_time(J)V

    .line 1170
    goto/16 :goto_29

    .line 1173
    :pswitch_44
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_end_time(J)V

    .line 1174
    goto/16 :goto_29

    .line 1177
    :pswitch_45
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_calorie(I)V

    .line 1178
    goto/16 :goto_29

    .line 1181
    :pswitch_46
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_distance(I)V

    .line 1182
    goto/16 :goto_29

    .line 1185
    :pswitch_47
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_step(J)V

    .line 1186
    goto/16 :goto_29

    .line 1189
    :pswitch_48
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_total_time(J)V

    .line 1190
    goto/16 :goto_29

    .line 1193
    :pswitch_49
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_record_speed(I)V

    .line 1194
    goto/16 :goto_29

    .line 1197
    :pswitch_4a
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_climb(J)V

    .line 1198
    goto/16 :goto_29

    .line 1201
    :pswitch_4b
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_HrABS_peak_max(I)V

    .line 1202
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_HrABS_peak_min(I)V

    .line 1203
    goto/16 :goto_29

    .line 1206
    :pswitch_4c
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_load_peak(I)V

    .line 1207
    goto :goto_29

    .line 1210
    :pswitch_4d
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_etraining_effect(I)V

    .line 1211
    goto :goto_29

    .line 1214
    :pswitch_4e
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_Epoc(I)V

    .line 1215
    goto :goto_29

    .line 1218
    :pswitch_4f
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_maxMET(I)V

    .line 1219
    goto :goto_29

    .line 1222
    :pswitch_50
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_recovery_time(I)V

    .line 1223
    goto :goto_29

    .line 1226
    :pswitch_51
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_exercise_duration(J)V

    .line 1227
    goto :goto_29

    .line 1230
    :pswitch_52
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/WorkoutRecordStatistic;->setWorkout_date_Info(J)V

    .line 1231
    .line 1237
    :goto_29
    goto/16 :goto_28

    .line 1238
    :cond_1c
    goto/16 :goto_27

    .line 1239
    :cond_1d
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetNotificationGetWorkoutRecordStatisticCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_18
    .catch Lo/day; {:try_start_18 .. :try_end_18} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_18 .. :try_end_18} :catch_1
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_2

    .line 1240
    :try_start_19
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1241
    const-string v0, "notificationGetWorkoutRecordStatistic"

    .line 1242
    invoke-static {v8, v0}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 1241
    const v1, 0x186a0

    invoke-interface {v11, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_c

    .line 1243
    goto :goto_2a

    .line 1244
    :cond_1e
    monitor-exit v9

    goto :goto_2b

    :catchall_c
    move-exception v25

    monitor-exit v9

    :try_start_1a
    throw v25

    .line 1245
    :goto_2b
    goto/16 :goto_41

    .line 1249
    :pswitch_53
    const/4 v0, 0x0

    if-eq v0, v6, :cond_20

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_20

    .line 1250
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

    if-ne v1, v0, :cond_20

    .line 1251
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetWorkoutDataCallbackList()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8
    :try_end_1a
    .catch Lo/day; {:try_start_1a .. :try_end_1a} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1a .. :try_end_1a} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_2

    .line 1252
    :try_start_1b
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutDataCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1f

    .line 1253
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 1254
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutDataCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getWorkoutData"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v9, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1255
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutDataCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_d

    .line 1257
    :cond_1f
    monitor-exit v8

    goto :goto_2c

    :catchall_d
    move-exception v26

    monitor-exit v8

    :try_start_1c
    throw v26

    .line 1258
    :goto_2c
    goto/16 :goto_41

    .line 1261
    :cond_20
    new-instance v8, Lcom/huawei/datatype/WorkoutDataStruct;

    invoke-direct {v8}, Lcom/huawei/datatype/WorkoutDataStruct;-><init>()V

    .line 1262
    if-eqz v7, :cond_28

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_28

    .line 1263
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 1264
    iget-object v11, v10, Lo/dba;->e:Ljava/util/List;

    .line 1265
    new-instance v12, Lcom/huawei/datatype/DataHeader;

    invoke-direct {v12}, Lcom/huawei/datatype/DataHeader;-><init>()V

    .line 1266
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1268
    const/4 v14, 0x0

    .line 1270
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 1271
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_2e
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lo/daw;

    .line 1272
    invoke-virtual/range {v17 .. v17}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_9

    goto/16 :goto_35

    .line 1274
    :pswitch_54
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutDataStruct;->setWorkout_record_id(I)V

    .line 1275
    goto/16 :goto_35

    .line 1278
    :pswitch_55
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutDataStruct;->setWorkout_data_index(I)V

    .line 1279
    goto/16 :goto_35

    .line 1282
    :pswitch_56
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/DataHeader;->setSportID(I)V

    .line 1283
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/DataHeader;->setFrameID(I)V

    .line 1284
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

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

    invoke-virtual {v12, v0, v1}, Lcom/huawei/datatype/DataHeader;->setTime(J)V

    .line 1285
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    const/16 v2, 0x12

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/DataHeader;->setTimeInterval(I)V

    .line 1286
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x12

    const/16 v2, 0x16

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v14

    .line 1287
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

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

    move-result-object v18

    .line 1288
    const/16 v19, 0x0

    :goto_2f
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v0

    move/from16 v1, v19

    if-ge v1, v0, :cond_22

    .line 1289
    add-int/lit8 v0, v19, 0x1

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v0, v1, :cond_21

    .line 1290
    add-int/lit8 v0, v19, 0x1

    move-object/from16 v1, v18

    move/from16 v2, v19

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_30

    .line 1292
    :cond_21
    const-string v0, "0"

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1288
    :goto_30
    add-int/lit8 v19, v19, 0x1

    goto :goto_2f

    .line 1295
    :cond_22
    goto/16 :goto_35

    .line 1298
    :pswitch_57
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 1299
    const/16 v19, 0x0

    :goto_31
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    move/from16 v1, v19

    if-ge v1, v0, :cond_23

    .line 1300
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v19, 0x2

    move/from16 v2, v19

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1299
    add-int/lit8 v19, v19, 0x2

    goto :goto_31

    .line 1302
    :cond_23
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_26

    .line 1303
    const/16 v19, 0x0

    :goto_32
    move/from16 v0, v19

    if-ge v0, v14, :cond_26

    .line 1304
    new-instance v20, Lcom/huawei/datatype/WorkoutDataInfo;

    invoke-direct/range {v20 .. v20}, Lcom/huawei/datatype/WorkoutDataInfo;-><init>()V

    .line 1305
    const/16 v21, 0x0

    :goto_33
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v21

    if-ge v1, v0, :cond_25

    .line 1306
    const-string v0, "1"

    move/from16 v1, v21

    invoke-interface {v15, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_24

    .line 1307
    packed-switch v21, :pswitch_data_a

    goto/16 :goto_34

    .line 1310
    :pswitch_58
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutDataInfo;->setData1(I)V

    .line 1311
    goto/16 :goto_34

    .line 1315
    :pswitch_59
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Ljava/lang/String;

    .line 1316
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1317
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v18

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutDataInfo;->setData2(I)V

    .line 1318
    goto/16 :goto_34

    .line 1322
    :pswitch_5a
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutDataInfo;->setData3(I)V

    .line 1323
    goto/16 :goto_34

    .line 1328
    :pswitch_5b
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Ljava/lang/String;

    .line 1329
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1330
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v18

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutDataInfo;->setData4(I)V

    .line 1331
    goto/16 :goto_34

    .line 1335
    :pswitch_5c
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Ljava/lang/String;

    .line 1336
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1337
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v18

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutDataInfo;->setData5(I)V

    .line 1338
    goto/16 :goto_34

    .line 1342
    :pswitch_5d
    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v22, v0

    .line 1343
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1344
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1345
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1346
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1347
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1348
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1349
    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v23

    .line 1350
    move-wide/from16 v0, v23

    long-to-int v0, v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutDataInfo;->setData6(I)V

    .line 1351
    goto/16 :goto_34

    .line 1355
    :pswitch_5e
    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, v20

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->parseRunPostureDataInfo(Ljava/util/List;Lcom/huawei/datatype/WorkoutDataInfo;)V

    .line 1356
    goto/16 :goto_34

    .line 1359
    :pswitch_5f
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutDataInfo;->setData8(I)V

    .line 1360
    goto/16 :goto_34

    .line 1363
    :pswitch_60
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutDataInfo;->setData9(I)V

    .line 1364
    goto/16 :goto_34

    .line 1367
    :pswitch_61
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutDataInfo;->setData10(I)V

    .line 1368
    goto/16 :goto_34

    .line 1371
    :pswitch_62
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutDataInfo;->setData11(I)V

    .line 1372
    goto :goto_34

    .line 1375
    :pswitch_63
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutDataInfo;->setData12(I)V

    .line 1376
    goto :goto_34

    .line 1379
    :pswitch_64
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutDataInfo;->setData13(I)V

    .line 1380
    goto :goto_34

    .line 1383
    :pswitch_65
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutDataInfo;->setData14(I)V

    .line 1384
    goto :goto_34

    .line 1387
    :pswitch_66
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutDataInfo;->setData15(I)V

    .line 1388
    goto :goto_34

    .line 1391
    :pswitch_67
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/WorkoutDataInfo;->setData16(I)V

    .line 1392
    .line 1398
    :goto_34
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1305
    :cond_24
    add-int/lit8 v21, v21, 0x1

    goto/16 :goto_33

    .line 1401
    :cond_25
    move-object/from16 v0, v20

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1303
    add-int/lit8 v19, v19, 0x1

    goto/16 :goto_32

    .line 1404
    :cond_26
    invoke-virtual {v12, v13}, Lcom/huawei/datatype/DataHeader;->setWorkoutDataInfoList(Ljava/util/List;)V

    .line 1405
    invoke-virtual {v8, v12}, Lcom/huawei/datatype/WorkoutDataStruct;->setDataHeader(Lcom/huawei/datatype/DataHeader;)V

    .line 1406
    .line 1413
    :goto_35
    goto/16 :goto_2e

    .line 1414
    :cond_27
    goto/16 :goto_2d

    .line 1416
    :cond_28
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetWorkoutDataCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_1c
    .catch Lo/day; {:try_start_1c .. :try_end_1c} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1c .. :try_end_1c} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_2

    .line 1417
    :try_start_1d
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutDataCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_29

    .line 1418
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutDataCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getWorkoutData"

    .line 1419
    invoke-static {v8, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 1418
    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1420
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutDataCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_e

    .line 1422
    :cond_29
    monitor-exit v9

    goto :goto_36

    :catchall_e
    move-exception v27

    monitor-exit v9

    :try_start_1e
    throw v27

    .line 1423
    :goto_36
    goto/16 :goto_41

    .line 1427
    :pswitch_68
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetWorkoutOperatorRealtimeDataCallbackList()Ljava/util/List;

    move-result-object v8

    monitor-enter v8
    :try_end_1e
    .catch Lo/day; {:try_start_1e .. :try_end_1e} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1e .. :try_end_1e} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_2

    .line 1428
    :try_start_1f
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutOperatorRealtimeDataCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2a

    .line 1429
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 1430
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutOperatorRealtimeDataCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "workoutOperateRealtimeData"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v9, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1431
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutOperatorRealtimeDataCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_f

    .line 1433
    :cond_2a
    monitor-exit v8

    goto :goto_37

    :catchall_f
    move-exception v28

    monitor-exit v8

    :try_start_20
    throw v28

    .line 1434
    :goto_37
    goto/16 :goto_41

    .line 1438
    :pswitch_69
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_2c

    .line 1439
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

    if-ne v1, v0, :cond_2c

    .line 1440
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetWorkoutRecordPaceMapListCallbackList()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8
    :try_end_20
    .catch Lo/day; {:try_start_20 .. :try_end_20} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_20 .. :try_end_20} :catch_1
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_2

    .line 1441
    :try_start_21
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->mGetWorkoutRecordPaceMapListCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2b

    .line 1442
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 1443
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->mGetWorkoutRecordPaceMapListCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getWorkoutRecordPaceMap"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v9, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1444
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->mGetWorkoutRecordPaceMapListCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_10

    .line 1446
    :cond_2b
    monitor-exit v8

    goto :goto_38

    :catchall_10
    move-exception v29

    monitor-exit v8

    :try_start_22
    throw v29

    .line 1447
    :goto_38
    goto/16 :goto_41

    .line 1450
    :cond_2c
    new-instance v8, Lcom/huawei/datatype/WorkRecordIndexPaceMapList;

    invoke-direct {v8}, Lcom/huawei/datatype/WorkRecordIndexPaceMapList;-><init>()V

    .line 1451
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1453
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v0, v0, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_39
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/daw;

    .line 1454
    invoke-virtual {v11}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2d

    .line 1455
    invoke-virtual {v11}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkRecordIndexPaceMapList;->setWorkout_record_id(I)V

    goto :goto_3a

    .line 1456
    :cond_2d
    invoke-virtual {v11}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x8

    if-ne v1, v0, :cond_2e

    .line 1457
    invoke-virtual {v11}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkRecordIndexPaceMapList;->setPaceIndex(I)V

    .line 1459
    :cond_2e
    :goto_3a
    goto :goto_39

    .line 1460
    :cond_2f
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v0, v0, Lo/dba;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dba;

    .line 1461
    new-instance v12, Lcom/huawei/datatype/WorkoutRecordPaceMap;

    invoke-direct {v12}, Lcom/huawei/datatype/WorkoutRecordPaceMap;-><init>()V

    .line 1462
    iget-object v13, v11, Lo/dba;->e:Ljava/util/List;

    .line 1463
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_3c
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_30

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/daw;

    .line 1464
    invoke-virtual {v15}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_b

    goto/16 :goto_3d

    .line 1466
    :pswitch_6a
    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/WorkoutRecordPaceMap;->setDistance(I)V

    .line 1467
    goto :goto_3d

    .line 1470
    :pswitch_6b
    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/WorkoutRecordPaceMap;->setUnit_type(I)V

    .line 1471
    goto :goto_3d

    .line 1474
    :pswitch_6c
    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/WorkoutRecordPaceMap;->setPace(I)V

    .line 1475
    goto :goto_3d

    .line 1478
    :pswitch_6d
    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/WorkoutRecordPaceMap;->setPoint_index(I)V

    .line 1479
    goto :goto_3d

    .line 1482
    :pswitch_6e
    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/WorkoutRecordPaceMap;->setLastLessDistance(I)V

    .line 1483
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lcom/huawei/datatype/WorkoutRecordPaceMap;->setIsLastLessDistance(Z)V

    .line 1484
    .line 1490
    :goto_3d
    :pswitch_6f
    goto/16 :goto_3c

    .line 1491
    :cond_30
    invoke-interface {v9, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1492
    goto/16 :goto_3b

    .line 1493
    :cond_31
    invoke-virtual {v8, v9}, Lcom/huawei/datatype/WorkRecordIndexPaceMapList;->setPaceMapList(Ljava/util/List;)V

    .line 1494
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetWorkoutRecordPaceMapListCallbackList()Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10
    :try_end_22
    .catch Lo/day; {:try_start_22 .. :try_end_22} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_22 .. :try_end_22} :catch_1
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_2

    .line 1495
    :try_start_23
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->mGetWorkoutRecordPaceMapListCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_32

    .line 1496
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->mGetWorkoutRecordPaceMapListCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "getWorkoutRecordPaceMap"

    .line 1497
    invoke-static {v8, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 1496
    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1498
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->mGetWorkoutRecordPaceMapListCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_11

    .line 1500
    :cond_32
    monitor-exit v10

    goto :goto_3e

    :catchall_11
    move-exception v30

    monitor-exit v10

    :try_start_24
    throw v30

    .line 1501
    :goto_3e
    goto/16 :goto_41

    .line 1505
    :pswitch_70
    new-instance v8, Lcom/huawei/datatype/WorkoutRecordSpeechPlay;

    invoke-direct {v8}, Lcom/huawei/datatype/WorkoutRecordSpeechPlay;-><init>()V

    .line 1507
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_3f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_34

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/daw;

    .line 1508
    invoke-virtual {v10}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_33

    .line 1509
    invoke-virtual {v10}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WorkoutRecordSpeechPlay;->setWorkout_record_speech_play_request_report(I)V

    .line 1511
    :cond_33
    goto :goto_3f

    .line 1512
    :cond_34
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetNotificationWorkoutRecordSpeechPlayCallbackList()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_24
    .catch Lo/day; {:try_start_24 .. :try_end_24} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_24 .. :try_end_24} :catch_1
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_2

    .line 1513
    :try_start_25
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_40
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_35

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1514
    const-string v0, "notificationWorkoutRecordSpeechPlay"

    .line 1515
    invoke-static {v8, v0}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 1514
    const v1, 0x186a0

    invoke-interface {v11, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_12

    .line 1516
    goto :goto_40

    .line 1517
    :cond_35
    monitor-exit v9

    goto :goto_41

    :catchall_12
    move-exception v31

    monitor-exit v9

    :try_start_26
    throw v31
    :try_end_26
    .catch Lo/day; {:try_start_26 .. :try_end_26} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_26 .. :try_end_26} :catch_1
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_2

    .line 1518
    .line 1530
    :goto_41
    goto/16 :goto_42

    .line 1524
    :catch_0
    move-exception v5

    .line 1525
    const-string v0, "HWWorkoutServiceAW70Manager"

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

    .line 1530
    goto :goto_42

    .line 1526
    :catch_1
    move-exception v5

    .line 1527
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u63a5\u6536\u547d\u4ee4\u9519\u8bef IndexOutOfBoundsException ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1530
    goto :goto_42

    .line 1528
    :catch_2
    move-exception v5

    .line 1529
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u63a5\u6536\u547d\u4ee4\u9519\u8bef Exception ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1530
    goto :goto_42

    .line 1532
    :cond_36
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u63a5\u6536\u547d\u4ee4\u9519\u8bef data lenth less 4"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1534
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
        :pswitch_26
        :pswitch_40
        :pswitch_53
        :pswitch_68
        :pswitch_69
        :pswitch_70
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
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x2
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
        :pswitch_37
        :pswitch_38
        :pswitch_39
        :pswitch_3a
        :pswitch_3b
        :pswitch_3c
        :pswitch_3d
        :pswitch_3e
        :pswitch_3f
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x2
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
        :pswitch_4c
        :pswitch_4d
        :pswitch_4e
        :pswitch_4f
        :pswitch_50
        :pswitch_51
        :pswitch_52
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0x2
        :pswitch_54
        :pswitch_55
        :pswitch_56
        :pswitch_57
    .end packed-switch

    :pswitch_data_a
    .packed-switch 0x0
        :pswitch_58
        :pswitch_59
        :pswitch_5a
        :pswitch_5b
        :pswitch_5c
        :pswitch_5d
        :pswitch_5e
        :pswitch_5f
        :pswitch_60
        :pswitch_61
        :pswitch_62
        :pswitch_63
        :pswitch_64
        :pswitch_65
        :pswitch_66
        :pswitch_67
    .end packed-switch

    :pswitch_data_b
    .packed-switch 0x4
        :pswitch_6a
        :pswitch_6b
        :pswitch_6c
        :pswitch_6d
        :pswitch_6f
        :pswitch_6e
    .end packed-switch
.end method

.method public getWorkoutData(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 256
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 257
    :try_start_0
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 258
    const/16 v0, 0x17

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 259
    const/16 v0, 0xa

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 260
    invoke-direct/range {p0 .. p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getAW70Identify()Ljava/lang/String;

    move-result-object v6

    .line 261
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 262
    invoke-virtual {v5, v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 266
    :cond_0
    const/16 v0, 0x8

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v7

    .line 268
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 271
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get getWorkoutData id "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    const-string v0, "HWWorkoutServiceAW70Manager"

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

    .line 273
    const-string v0, "workout_record_id"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v9

    .line 275
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v10

    .line 277
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v11

    .line 280
    const-string v0, "workout_data_index"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v12

    .line 282
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v13

    .line 284
    const/4 v0, 0x3

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v14

    .line 286
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 287
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 297
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 299
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 301
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetWorkoutDataCallbackList()Ljava/lang/Object;

    move-result-object v16

    monitor-enter v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 302
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutDataCallbackList:Ljava/util/List;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 303
    monitor-exit v16

    goto :goto_0

    :catchall_0
    move-exception v17

    monitor-exit v16

    :try_start_2
    throw v17
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 304
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_1
    move-exception v18

    monitor-exit v4

    throw v18

    .line 305
    :goto_1
    return-void
.end method

.method public getWorkoutRealTimeInfo(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 93
    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->lockObject:Ljava/lang/Object;

    monitor-enter v2

    .line 94
    :try_start_0
    new-instance v3, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v3}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 95
    const/16 v0, 0x17

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 96
    const/4 v0, 0x4

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 97
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getAW70Identify()Ljava/lang/String;

    move-result-object v4

    .line 98
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 99
    invoke-virtual {v3, v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 102
    :cond_0
    const/4 v0, 0x3

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v5

    .line 104
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 107
    const-string v0, "sport_type"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 109
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v8

    .line 111
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v9

    .line 114
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 122
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 124
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v3}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 126
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetWorkoutRealTimeInfoCallbackList()Ljava/lang/Object;

    move-result-object v11

    monitor-enter v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 127
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    monitor-exit v11

    goto :goto_0

    :catchall_0
    move-exception v12

    monitor-exit v11

    :try_start_2
    throw v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 129
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_1
    move-exception v13

    monitor-exit v2

    throw v13

    .line 130
    :goto_1
    return-void
.end method

.method public getWorkoutRecord(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 138
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 139
    :try_start_0
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 140
    const/16 v0, 0x17

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 141
    const/4 v0, 0x7

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 142
    invoke-direct/range {p0 .. p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getAW70Identify()Ljava/lang/String;

    move-result-object v6

    .line 143
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 144
    invoke-virtual {v5, v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 148
    :cond_0
    const/16 v0, 0xc

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v7

    .line 150
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 152
    const-string v0, "startTime"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v9, v0

    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    shr-int/lit8 v1, v9, 0x18

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v9, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 155
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v9, 0x8

    and-int/lit16 v1, v1, 0xff

    .line 156
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    and-int/lit16 v1, v9, 0xff

    .line 157
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 159
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v11

    .line 161
    const/4 v0, 0x3

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v12

    .line 163
    const-string v0, "endTime"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v13, v0

    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    shr-int/lit8 v1, v13, 0x18

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v13, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 166
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v13, 0x8

    and-int/lit16 v1, v1, 0xff

    .line 167
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    and-int/lit16 v1, v13, 0xff

    .line 168
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 170
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v15

    .line 172
    const/4 v0, 0x4

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v16

    .line 175
    new-instance v17, Ljava/lang/StringBuilder;

    invoke-direct/range {v17 .. v17}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    move-object/from16 v0, v17

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    move-object/from16 v0, v17

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    move-object/from16 v0, v17

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    move-object/from16 v0, v17

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    move-object/from16 v0, v17

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    move-object/from16 v0, v17

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    move-object/from16 v0, v17

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    move-object/from16 v0, v17

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 186
    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 188
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 190
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetWorkoutRecordCallbackList()Ljava/lang/Object;

    move-result-object v18

    monitor-enter v18
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 191
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordCallbackList:Ljava/util/List;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 192
    monitor-exit v18

    goto :goto_0

    :catchall_0
    move-exception v19

    monitor-exit v18

    :try_start_2
    throw v19
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 193
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_1
    move-exception v20

    monitor-exit v4

    throw v20

    .line 194
    :goto_1
    return-void
.end method

.method public getWorkoutRecordPaceMap(Lcom/huawei/datatype/PaceIndexStruct;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 17

    .line 561
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->lockObject:Ljava/lang/Object;

    monitor-enter v2

    .line 562
    :try_start_0
    new-instance v3, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v3}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 563
    const/16 v0, 0x17

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 564
    const/16 v0, 0xc

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 565
    invoke-direct/range {p0 .. p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getAW70Identify()Ljava/lang/String;

    move-result-object v4

    .line 566
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 567
    invoke-virtual {v3, v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 571
    :cond_0
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v5

    .line 572
    const/4 v0, 0x4

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v6

    .line 575
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/datatype/PaceIndexStruct;->getRecordId()I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 576
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v8

    .line 578
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v9

    .line 582
    const-string v10, ""

    .line 583
    const-string v11, ""

    .line 585
    const-string v12, ""

    .line 586
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/datatype/PaceIndexStruct;->getPaceIndex()I

    move-result v0

    const/4 v1, 0x0

    if-gt v1, v0, :cond_1

    .line 587
    const/16 v0, 0x8

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v6

    .line 588
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/datatype/PaceIndexStruct;->getPaceIndex()I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 589
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v11

    .line 591
    const/16 v0, 0x8

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v12

    .line 594
    :cond_1
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 595
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 596
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/datatype/PaceIndexStruct;->getPaceIndex()I

    move-result v0

    const/4 v1, 0x0

    if-gt v1, v0, :cond_2

    .line 601
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 602
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 603
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 606
    :cond_2
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 607
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 609
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v3}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 611
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetWorkoutRecordPaceMapListCallbackList()Ljava/lang/Object;

    move-result-object v14

    monitor-enter v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 612
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->mGetWorkoutRecordPaceMapListCallbackList:Ljava/util/List;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 613
    monitor-exit v14

    goto :goto_0

    :catchall_0
    move-exception v15

    monitor-exit v14

    :try_start_2
    throw v15
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 614
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_1
    move-exception v16

    monitor-exit v2

    throw v16

    .line 615
    :goto_1
    return-void
.end method

.method public getWorkoutRecordStatistic(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 202
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 203
    :try_start_0
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 204
    const/16 v0, 0x17

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 205
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 206
    invoke-direct/range {p0 .. p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getAW70Identify()Ljava/lang/String;

    move-result-object v6

    .line 207
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 208
    invoke-virtual {v5, v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 212
    :cond_0
    const/4 v0, 0x4

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v7

    .line 214
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 217
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get getWorkoutRecordStatistic id "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    const-string v0, "id"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v9

    .line 220
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v10

    .line 222
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v11

    .line 224
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 232
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 234
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 236
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetWorkoutRecordStatisticCallbackList()Ljava/lang/Object;

    move-result-object v13

    monitor-enter v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 237
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutRecordStatisticCallbackList:Ljava/util/List;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 238
    monitor-exit v13

    goto :goto_0

    :catchall_0
    move-exception v14

    monitor-exit v13

    :try_start_2
    throw v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 239
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_1
    move-exception v15

    monitor-exit v4

    throw v15

    .line 240
    :goto_1
    return-void
.end method

.method public notificationWorkoutRecordSpeechPlayReportStatus(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 13

    .line 650
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ENTER notificationWorkoutRecordSpeechPlayReportStatus... "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 651
    iget-object v4, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 653
    if-eqz p1, :cond_1

    .line 654
    const-string v0, "result"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    .line 655
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 656
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 657
    const/16 v0, 0x17

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 658
    const/16 v0, 0xd

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 659
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getAW70Identify()Ljava/lang/String;

    move-result-object v7

    .line 660
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 661
    invoke-virtual {v6, v7}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 665
    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 667
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v9

    .line 669
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v10

    .line 671
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 672
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 673
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 674
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 676
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 677
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 679
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v6}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 682
    :cond_1
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v12

    monitor-exit v4

    throw v12

    .line 683
    :goto_0
    return-void
.end method

.method public registerNotificationGetWorkoutRecordStatisticCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 533
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetNotificationGetWorkoutRecordStatisticCallbackList()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 534
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 535
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 536
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 539
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 541
    :cond_1
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 542
    :goto_1
    return-void
.end method

.method public registerNotificationSportReminderCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 505
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetNotificationSportReminderCallbackList()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 506
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationSportReminderCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 507
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationSportReminderCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 508
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationSportReminderCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 511
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationSportReminderCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 513
    :cond_1
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 514
    :goto_1
    return-void
.end method

.method public registerNotificationStatusCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 411
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetNotificationStatusCallbackList()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 412
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationStatusCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 413
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationStatusCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 414
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationStatusCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 417
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationStatusCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 419
    :cond_1
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 420
    :goto_1
    return-void
.end method

.method public registerNotificationWorkoutRealTimeInfoCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 477
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetNotificationWorkoutRealTimeInfoCallbackList()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 478
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 479
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 480
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 483
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 485
    :cond_1
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 486
    :goto_1
    return-void
.end method

.method public registerNotificationWorkoutRecordSpeechPlayCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 623
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetNotificationWorkoutRecordSpeechPlayCallbackList()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 624
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 625
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 626
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 629
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 631
    :cond_1
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 632
    :goto_1
    return-void
.end method

.method public setNotificationStatusResponse(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 12

    .line 437
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "response of NotificationStatus info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    iget-object v4, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 439
    :try_start_0
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 440
    const/16 v0, 0x17

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 441
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 442
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getAW70Identify()Ljava/lang/String;

    move-result-object v6

    .line 443
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 444
    invoke-virtual {v5, v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 448
    :cond_0
    const-string v0, "notification_status_response"

    :try_start_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v7

    .line 450
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 452
    const/16 v0, 0x7f

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v9

    .line 454
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 455
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 460
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 462
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 463
    const-string v0, "success"

    const-string v1, "setNotificationStatusResponse"

    .line 464
    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 463
    const v1, 0x186a0

    invoke-interface {p2, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 467
    goto :goto_0

    .line 465
    :catch_0
    move-exception v7

    .line 466
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 468
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v11

    monitor-exit v4

    throw v11

    .line 469
    :goto_1
    return-void
.end method

.method public unRegisterNotificationGetWorkoutRecordStatisticCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 548
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetNotificationGetWorkoutRecordStatisticCallbackList()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 549
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 550
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationGetWorkoutRecordStatisticCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 552
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 553
    :goto_0
    return-void
.end method

.method public unRegisterNotificationSportReminderCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 520
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetNotificationSportReminderCallbackList()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 521
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationSportReminderCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 522
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationSportReminderCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 524
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 525
    :goto_0
    return-void
.end method

.method public unRegisterNotificationStatusCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 426
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetNotificationStatusCallbackList()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 427
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationStatusCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 428
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationStatusCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 430
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 431
    :goto_0
    return-void
.end method

.method public unRegisterNotificationWorkoutRealTimeInfoCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 492
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetNotificationWorkoutRealTimeInfoCallbackList()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 493
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 494
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRealTimeInfoCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 496
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 497
    :goto_0
    return-void
.end method

.method public unRegisterNotificationWorkoutRecordSpeechPlayCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 638
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetNotificationWorkoutRecordSpeechPlayCallbackList()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 639
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 640
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getNotificationWorkoutRecordSpeechPlayCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 642
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 643
    :goto_0
    return-void
.end method

.method public workoutOperateRealtimeData(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 28
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 313
    const-string v0, "HWWorkoutServiceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setRealTimeData enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 315
    :try_start_0
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 316
    const/16 v0, 0x17

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 317
    const/16 v0, 0xb

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 318
    invoke-direct/range {p0 .. p0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getAW70Identify()Ljava/lang/String;

    move-result-object v6

    .line 319
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 320
    invoke-virtual {v5, v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 327
    :cond_0
    const/16 v0, 0x81

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v9

    .line 328
    const-string v0, "pace"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 329
    const/16 v0, 0x1a

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 331
    :cond_1
    const/16 v0, 0x16

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v8

    .line 335
    :goto_0
    const-string v0, "exercise_duration"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v10

    .line 337
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v11

    .line 339
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v12

    .line 342
    const-string v0, "distance"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0xa

    int-to-long v0, v0

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v13

    .line 344
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v14

    .line 346
    const/4 v0, 0x3

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v15

    .line 349
    const-string v0, "calorie"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v16

    .line 351
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v17

    .line 353
    const/4 v0, 0x4

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v18

    .line 356
    const-string v0, "speed"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v19

    .line 358
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v20

    .line 360
    const/4 v0, 0x5

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v21

    .line 362
    new-instance v22, Ljava/lang/StringBuilder;

    invoke-direct/range {v22 .. v22}, Ljava/lang/StringBuilder;-><init>()V

    .line 363
    move-object/from16 v0, v22

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    move-object/from16 v0, v22

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    move-object/from16 v0, v22

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    move-object/from16 v0, v22

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    move-object/from16 v0, v22

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    move-object/from16 v0, v22

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    move-object/from16 v0, v22

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    move-object/from16 v0, v22

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    move-object/from16 v0, v22

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    move-object/from16 v0, v22

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    move-object/from16 v0, v22

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    move-object/from16 v0, v22

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    move-object/from16 v0, v22

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    const-string v0, "pace"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 384
    const-string v0, "pace"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v23

    .line 386
    invoke-virtual/range {v23 .. v23}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v24

    .line 388
    const/4 v0, 0x6

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v25

    .line 389
    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    move-object/from16 v0, v22

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    :cond_2
    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 395
    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 397
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 399
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getGetWorkoutOperatorRealtimeDataCallbackList()Ljava/util/List;

    move-result-object v23

    monitor-enter v23
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 400
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/multisync/HWWorkoutServiceAW70Manager;->getWorkoutOperatorRealtimeDataCallbackList:Ljava/util/List;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 401
    monitor-exit v23

    goto :goto_1

    :catchall_0
    move-exception v26

    monitor-exit v23

    :try_start_2
    throw v26
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 402
    :goto_1
    monitor-exit v4

    goto :goto_2

    :catchall_1
    move-exception v27

    monitor-exit v4

    throw v27

    .line 403
    :goto_2
    return-void
.end method
