.class public Lo/dgh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z

.field private static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const/4 v0, 0x0

    sput-boolean v0, Lo/dgh;->b:Z

    .line 36
    const/4 v0, 0x0

    sput-boolean v0, Lo/dgh;->a:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Z
    .locals 1

    .line 39
    sget-boolean v0, Lo/dgh;->a:Z

    return v0
.end method

.method private static b()V
    .locals 4

    .line 183
    const-string v0, "StressUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "star download Period_RRI file from device 6.17.2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->getmInstance()Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->getPeriodRRIFileFromDevice()V

    .line 185
    return-void
.end method

.method public static c()V
    .locals 5

    .line 171
    const-string v0, "StressUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " sending broadcast to notify UI thread ..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_COMPLETED"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 173
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 174
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 175
    invoke-static {}, Lo/dgh;->b()V

    .line 176
    return-void
.end method

.method public static declared-synchronized c(Landroid/content/Context;)V
    .locals 10

    const-class v9, Lo/dgh;

    monitor-enter v9

    .line 106
    const-string v0, "StressUtil"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSyncCoreSleep"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    const/4 v4, 0x0

    .line 108
    invoke-static {p0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 109
    invoke-static {p0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 112
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    .line 113
    :cond_1
    const-string v0, "StressUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_CORE_SLEEP_SYNC get device info error or DEVICE_DISCONNECTED return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    monitor-exit v9

    return-void

    .line 117
    :cond_2
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 118
    const/4 v6, 0x1

    .line 119
    const/16 v0, 0xb

    invoke-virtual {v5, v0}, Ljava/util/Calendar;->get(I)I

    move-result v7

    .line 120
    const-string v0, "StressUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleWhenGetDetailDataSuccessDelayTodu coreSleepDataSync localHour = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    const/4 v0, 0x0

    if-gt v0, v7, :cond_4

    const/4 v0, 0x6

    if-ge v7, v0, :cond_4

    .line 123
    const-string v0, "StressUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "it\'s 0 - 6 hour, isManualSync = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v3, Lo/dgh;->a:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    invoke-static {}, Lo/dgh;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 126
    const/4 v6, 0x1

    goto :goto_0

    .line 129
    :cond_3
    const/4 v6, 0x0

    .line 133
    :cond_4
    :goto_0
    const-string v0, "StressUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start to sync core sleep.isSyncCoreSleepData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "    isManualSync = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v3, Lo/dgh;->a:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v8

    .line 135
    const/4 v0, 0x0

    if-eq v0, v8, :cond_7

    .line 136
    const-string v0, "StressUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "capability.isSupportCoreSleep(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCoreSleep()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    const-string v0, "StressUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "capability.isSupportQueryDeviceCoreSleepSwitch(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryDeviceCoreSleepSwitch()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCoreSleep()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryDeviceCoreSleepSwitch()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    if-eqz v6, :cond_6

    .line 140
    invoke-static {}, Lo/dgh;->d()V

    goto :goto_1

    .line 142
    :cond_6
    const-string v0, "StressUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "don\'t satisfy coreSleep sync condition! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dca;->d(Landroid/content/Context;)Lo/dca;

    move-result-object v0

    const/16 v1, 0x520a

    invoke-virtual {v0, v1}, Lo/dca;->e(I)V

    .line 144
    invoke-static {}, Lo/dgh;->c()V

    goto :goto_1

    .line 147
    :cond_7
    const-string v0, "StressUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "capability is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dca;->d(Landroid/content/Context;)Lo/dca;

    move-result-object v0

    const/16 v1, 0x5209

    invoke-virtual {v0, v1}, Lo/dca;->e(I)V

    .line 149
    invoke-static {}, Lo/dgh;->c()V

    .line 152
    :goto_1
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dgh;->d(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    monitor-exit v9

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v9

    throw p0
.end method

.method private static d()V
    .locals 4

    .line 157
    const-string v0, "StressUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter refreshCoreSleepData():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dca;->d(Landroid/content/Context;)Lo/dca;

    move-result-object v0

    new-instance v1, Lo/dgh$3;

    invoke-direct {v1}, Lo/dgh$3;-><init>()V

    invoke-virtual {v0, v1}, Lo/dca;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 167
    return-void
.end method

.method public static d(Z)V
    .locals 0

    .line 43
    sput-boolean p0, Lo/dgh;->a:Z

    .line 44
    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 6

    .line 50
    const-string v0, "StressUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSyncStressData() enter from:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mSyncStressState:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v3, Lo/dgh;->b:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    sget-boolean v0, Lo/dgh;->b:Z

    if-eqz v0, :cond_0

    .line 54
    const-string v0, "StressUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startSyncStressData() return mSyncStressState: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v3, Lo/dgh;->b:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    return-void

    .line 58
    :cond_0
    const/4 v4, 0x0

    .line 59
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 60
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 62
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 63
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 64
    const-string v0, "StressUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AW70device info != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->getInstance()Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;

    move-result-object v0

    invoke-static {}, Lo/fju;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->updateDetailLastTime(Ljava/lang/String;)V

    goto :goto_0

    .line 67
    :cond_2
    const-string v0, "StressUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AW70device info == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    .line 71
    :cond_3
    const-string v0, "StressUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSyncStressData DEVICE_CONNECTED return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    return-void

    .line 75
    :cond_4
    const/4 v0, 0x1

    sput-boolean v0, Lo/dgh;->b:Z

    .line 77
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dms;->b(Landroid/content/Context;)Lo/dms;

    move-result-object v0

    new-instance v1, Lo/dgh$5;

    invoke-direct {v1}, Lo/dgh$5;-><init>()V

    invoke-virtual {v0, v1}, Lo/dms;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 98
    return-void
.end method

.method static synthetic e(Z)Z
    .locals 0

    .line 30
    sput-boolean p0, Lo/dgh;->b:Z

    return p0
.end method
