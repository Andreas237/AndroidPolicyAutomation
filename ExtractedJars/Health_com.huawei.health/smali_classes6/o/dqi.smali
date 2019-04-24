.class public Lo/dqi;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static d:Lo/dqi;


# instance fields
.field private a:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 53
    const/4 v0, 0x0

    sput-object v0, Lo/dqi;->d:Lo/dqi;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 61
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 58
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dqi;->a:Ljava/util/HashMap;

    .line 62
    return-void
.end method

.method static synthetic b(Lo/dqi;Ljava/lang/String;)Ljava/util/HashMap;
    .locals 1

    .line 49
    invoke-direct {p0, p1}, Lo/dqi;->o(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lo/dqi;
    .locals 4

    .line 65
    const-class v2, Lo/dqi;

    monitor-enter v2

    .line 66
    :try_start_0
    sget-object v0, Lo/dqi;->d:Lo/dqi;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 67
    new-instance v0, Lo/dqi;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dqi;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dqi;->d:Lo/dqi;

    .line 69
    :cond_0
    sget-object v0, Lo/dqi;->d:Lo/dqi;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 70
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private o(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 1017
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hashStringToHashMap str = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1018
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1019
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "str is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1020
    const/4 v0, 0x0

    return-object v0

    .line 1022
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 1023
    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 1024
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "strs = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1025
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 1026
    move-object v6, v4

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_3

    aget-object v9, v6, v8

    .line 1027
    const-string v0, "="

    invoke-virtual {v9, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    .line 1028
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "key = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1029
    const-string v0, "bt_lost_remind"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "auto_light_screen"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "rotate_switch_screen"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "weather_switch_status"

    .line 1030
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "core_sleep_button"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "wlan_auto_update"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "left_or_right_hand_wear_status"

    .line 1031
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "heart_rate_button"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "press_auto_monitor_switch_status"

    .line 1032
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "left_or_right_foot_wear_status"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "continue_heart_rate"

    .line 1033
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gps_files_switch_screen"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "weather_switch_unit_status"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1035
    :cond_1
    const-string v0, "="

    invoke-virtual {v9, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v11, v0, v1

    .line 1036
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1037
    invoke-virtual {v5, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1026
    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 1040
    :cond_3
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "map = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/util/HashMap;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1041
    return-object v5
.end method


# virtual methods
.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 827
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSmartAlarm enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    invoke-static {}, Lo/eer;->d()Lo/eer;

    move-result-object v0

    new-instance v1, Lo/dqi$16;

    invoke-direct {v1, p0, p1}, Lo/dqi$16;-><init>(Lo/dqi;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/eer;->e(Ljava/lang/Runnable;)V

    .line 847
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    .line 139
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateAutoLightScreen enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$20;

    invoke-direct {v1, p0, p1}, Lo/dqi$20;-><init>(Lo/dqi;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 163
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 954
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWearCommonSetting commonSettingKey = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 955
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$19;

    invoke-direct {v1, p0, p1, p2}, Lo/dqi$19;-><init>(Lo/dqi;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 980
    return-void
.end method

.method public a(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/SmartAlarmInfo;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 226
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateSmartAlarm enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    invoke-static {}, Lo/eer;->d()Lo/eer;

    move-result-object v0

    new-instance v1, Lo/dqi$22;

    invoke-direct {v1, p0, p1, p2}, Lo/dqi$22;-><init>(Lo/dqi;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/eer;->e(Ljava/lang/Runnable;)V

    .line 246
    return-void
.end method

.method public b()Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;
    .locals 7

    .line 732
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getActivityReminder enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 733
    new-instance v4, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;

    invoke-direct {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;-><init>()V

    .line 734
    const-string v0, "custom.activity_reminder"

    invoke-virtual {p0, v0}, Lo/dqi;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 735
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 736
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getActivityReminder on HiHealth is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 737
    return-object v4

    .line 739
    :cond_0
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getActivityReminder value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 740
    new-instance v6, Lcom/google/gson/Gson;

    invoke-direct {v6}, Lcom/google/gson/Gson;-><init>()V

    .line 741
    const-class v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;

    invoke-virtual {v6, v5, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;

    .line 742
    return-object v4
.end method

.method public b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 548
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateContinueMeasureHeartRate enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 549
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$7;

    invoke-direct {v1, p0, p1, p2}, Lo/dqi$7;-><init>(Lo/dqi;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 572
    return-void
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 868
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getEventAlarm enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 869
    invoke-static {}, Lo/eer;->d()Lo/eer;

    move-result-object v0

    new-instance v1, Lo/dqi$18;

    invoke-direct {v1, p0, p1}, Lo/dqi$18;-><init>(Lo/dqi;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/eer;->e(Ljava/lang/Runnable;)V

    .line 887
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    .line 170
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateRotateSwitchScreen enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$23;

    invoke-direct {v1, p0, p1}, Lo/dqi$23;-><init>(Lo/dqi;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 194
    return-void
.end method

.method public b(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 366
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateCoreSleepButton enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 367
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$3;

    invoke-direct {v1, p0, p1, p2}, Lo/dqi$3;-><init>(Lo/dqi;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 392
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 630
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateIntelligentHomeButton enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 632
    new-instance v4, Lcom/huawei/hihealth/HiUserPreference;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "intelligent_home_linkage"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0, p1}, Lcom/huawei/hihealth/HiUserPreference;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 633
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiUserPreference;Z)Z

    .line 634
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "intelligent_home_linkage"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v5

    .line 635
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 636
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "migrateHeartRateRaiseRemind value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 637
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p3, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 639
    :cond_0
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 641
    :goto_0
    return-void
.end method

.method public b(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 280
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateAvoidDisturb enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$26;

    invoke-direct {v1, p0, p1, p2}, Lo/dqi$26;-><init>(Lo/dqi;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 301
    return-void
.end method

.method public b(Ljava/util/Map;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 583
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 584
    :cond_0
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == commonSettingMap || commonSettingMap.size() == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    return-void

    .line 587
    :cond_1
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateCommonSetting enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 589
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$8;

    invoke-direct {v1, p0, p1, p2}, Lo/dqi$8;-><init>(Lo/dqi;Ljava/util/Map;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 622
    return-void
.end method

.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 787
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAddressBook enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 788
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$13;

    invoke-direct {v1, p0, p1}, Lo/dqi$13;-><init>(Lo/dqi;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 806
    return-void
.end method

.method public c(Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;)V
    .locals 4

    .line 83
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateActivityReminder enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$1;

    invoke-direct {v1, p0, p1}, Lo/dqi$1;-><init>(Lo/dqi;Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 101
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 4

    .line 338
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateWeatherSwitchUnitStatus enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$5;

    invoke-direct {v1, p0, p1}, Lo/dqi$5;-><init>(Lo/dqi;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 359
    return-void
.end method

.method public d(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 650
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateHeartRateRaiseRemind enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 651
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$9;

    invoke-direct {v1, p0, p1, p2}, Lo/dqi$9;-><init>(Lo/dqi;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 667
    return-void
.end method

.method public d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 692
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartRateRaiseRemindNumber enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 693
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$15;

    invoke-direct {v1, p0, p1}, Lo/dqi$15;-><init>(Lo/dqi;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 709
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 4

    .line 308
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateWeatherSwitchStatus enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$30;

    invoke-direct {v1, p0, p1}, Lo/dqi$30;-><init>(Lo/dqi;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 332
    return-void
.end method

.method public d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 669
    invoke-static {}, Lo/eer;->d()Lo/eer;

    move-result-object v0

    new-instance v1, Lo/dqi$14;

    invoke-direct {v1, p0, p1, p2}, Lo/dqi$14;-><init>(Lo/dqi;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/eer;->e(Ljava/lang/Runnable;)V

    .line 684
    return-void
.end method

.method public d(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/Contact;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 201
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateAddressBook enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$24;

    invoke-direct {v1, p0, p1, p2}, Lo/dqi$24;-><init>(Lo/dqi;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 219
    return-void
.end method

.method public e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 746
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getActivityReminder enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 747
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$12;

    invoke-direct {v1, p0, p1}, Lo/dqi$12;-><init>(Lo/dqi;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 767
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 4

    .line 108
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateBTLostRemind enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$11;

    invoke-direct {v1, p0, p1}, Lo/dqi$11;-><init>(Lo/dqi;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 132
    return-void
.end method

.method public e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 513
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateHeartRateButton enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$6;

    invoke-direct {v1, p0, p1, p2}, Lo/dqi$6;-><init>(Lo/dqi;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 541
    return-void
.end method

.method public e(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 253
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateEventAlarm enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    invoke-static {}, Lo/eer;->d()Lo/eer;

    move-result-object v0

    new-instance v1, Lo/dqi$21;

    invoke-direct {v1, p0, p1, p2}, Lo/dqi$21;-><init>(Lo/dqi;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/eer;->e(Ljava/lang/Runnable;)V

    .line 273
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 4

    .line 455
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateLeftOrRightHandWearStatus enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 456
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$10;

    invoke-direct {v1, p0, p1}, Lo/dqi$10;-><init>(Lo/dqi;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 479
    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 4

    .line 431
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GPSFile enter"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$2;

    invoke-direct {v1, p0, p1}, Lo/dqi$2;-><init>(Lo/dqi;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 447
    return-void
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 75
    const/16 v0, 0x3f8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public h(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 908
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAvoidDisturb enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 909
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$17;

    invoke-direct {v1, p0, p1}, Lo/dqi$17;-><init>(Lo/dqi;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 932
    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 4

    .line 399
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateWLANAutoUpdate enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$4;

    invoke-direct {v1, p0, p1}, Lo/dqi$4;-><init>(Lo/dqi;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 423
    return-void
.end method

.method public i(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 716
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserPreferenceFromHiHealth enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 718
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v4

    .line 719
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 720
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "key = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 721
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserPreferenceFromHiHealth end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 722
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 724
    :cond_0
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserPreferenceFromHiHealth end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 725
    const/4 v0, 0x0

    return-object v0
.end method

.method public k(Ljava/lang/String;)V
    .locals 4

    .line 991
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migratePressAutoMonitorSwitchStatus enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 992
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dqi$25;

    invoke-direct {v1, p0, p1}, Lo/dqi$25;-><init>(Lo/dqi;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 1011
    return-void
.end method
