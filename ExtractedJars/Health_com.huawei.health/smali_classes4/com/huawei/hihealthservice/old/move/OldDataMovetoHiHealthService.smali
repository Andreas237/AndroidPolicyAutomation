.class public Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;
.super Landroid/app/IntentService;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "Debug_OldDataMovetoHiHealthService"


# instance fields
.field private GOALS:Ljava/lang/String;

.field private MOVE_DAY_COUNT:I

.field private READ_LOGBIN_COUNT:I

.field private TYPE_HEALTH_DATA:I

.field private TYPE_USER_DATA:I

.field private USERINFO:Ljava/lang/String;

.field private bloodPressureToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/BloodPressureToHiHealthData;

.field private bloodSugarToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/BloodSugarToHiHealthData;

.field private context:Landroid/content/Context;

.field private currentPercent:F

.field private infoUserCode:Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;

.field private insertStore:Lo/crf;

.field private logBinDataToHiHealthData:Lcom/huawei/hihealthservice/old/logbindata/LogBinDataToHiHealthData;

.field private motionDataToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/MotionDataToHiHealthData;

.field private moveTableCount:I

.field private moveTableSum:I

.field private oldDBHelper:Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

.field private sleepDataToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/SleepDataToHiHealthData;

.field private sportDataToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/SportDataToHiHealthData;

.field private statDataToDayStatData:Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;

.field private userCodeCache:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private userDataToHiUserData:Lcom/huawei/hihealthservice/old/dataswitch/UserDataToHiUserData;

.field private userDeviceClientCache:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Lo/crd;>;"
        }
    .end annotation
.end field

.field private userInfoManager:Lo/cqs;

.field private weightToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/WeightToHiHealthData;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 137
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 82
    const-string v0, "userinfo"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->USERINFO:Ljava/lang/String;

    .line 84
    const-string v0, "goals"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->GOALS:Ljava/lang/String;

    .line 89
    const/4 v0, 0x7

    iput v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->MOVE_DAY_COUNT:I

    .line 92
    const/16 v0, 0xa

    iput v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->READ_LOGBIN_COUNT:I

    .line 95
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->TYPE_HEALTH_DATA:I

    .line 98
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->TYPE_USER_DATA:I

    .line 138
    return-void
.end method

.method private declared-synchronized getAPPID(I)I
    .locals 5

    monitor-enter p0

    .line 756
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-static {v0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v3

    .line 757
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->isHealthAppData(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 758
    const-string v0, "com.huawei.health"

    invoke-virtual {v3, v0}, Lo/cpu;->a(Ljava/lang/String;)I

    move-result v2

    .line 759
    if-gtz v2, :cond_1

    .line 760
    new-instance v4, Lcom/huawei/hihealth/HiAppInfo;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAppInfo;-><init>()V

    .line 761
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAppInfo;->setPackageName(Ljava/lang/String;)V

    .line 762
    const-string v0, "\u8fd0\u52a8\u5065\u5eb7"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAppInfo;->setAppName(Ljava/lang/String;)V

    .line 763
    const/4 v0, 0x0

    invoke-virtual {v3, v4, v0}, Lo/cpu;->b(Lcom/huawei/hihealth/HiAppInfo;I)J

    move-result-wide v0

    long-to-int v2, v0

    .line 764
    goto :goto_0

    .line 766
    :cond_0
    const-string v0, "com.huawei.bone"

    invoke-virtual {v3, v0}, Lo/cpu;->a(Ljava/lang/String;)I

    move-result v2

    .line 768
    if-gtz v2, :cond_1

    .line 769
    new-instance v4, Lcom/huawei/hihealth/HiAppInfo;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAppInfo;-><init>()V

    .line 770
    const-string v0, "com.huawei.bone"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAppInfo;->setPackageName(Ljava/lang/String;)V

    .line 771
    const-string v0, "\u534e\u4e3a\u7a7f\u6234"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAppInfo;->setAppName(Ljava/lang/String;)V

    .line 772
    const/4 v0, 0x0

    invoke-virtual {v3, v4, v0}, Lo/cpu;->b(Lcom/huawei/hihealth/HiAppInfo;I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    long-to-int v2, v0

    .line 775
    :cond_1
    :goto_0
    monitor-exit p0

    return v2

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private getCurrentLoginHuid()Ljava/lang/String;
    .locals 3

    .line 816
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-static {v0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cpu;->a(Ljava/lang/String;)I

    move-result v2

    .line 817
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-static {v0}, Lo/cpr;->b(Landroid/content/Context;)Lo/cpr;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private declared-synchronized getDeviceID(Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;)I
    .locals 7

    monitor-enter p0

    .line 782
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getProductId()I

    move-result v2

    .line 783
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getDeviceId()Ljava/lang/String;

    move-result-object v3

    .line 784
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-static {v0}, Lo/cqa;->a(Landroid/content/Context;)Lo/cqa;

    move-result-object v4

    .line 785
    invoke-virtual {v4, v3}, Lo/cqa;->d(Ljava/lang/String;)I

    move-result v5

    .line 786
    if-gtz v5, :cond_0

    .line 787
    new-instance v6, Lcom/huawei/hihealth/HiDeviceInfo;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiDeviceInfo;-><init>()V

    .line 788
    invoke-static {v2}, Lo/cmf;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 789
    invoke-virtual {v6, v2}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceType(I)V

    .line 790
    invoke-virtual {v6, v3}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceUniqueCode(Ljava/lang/String;)V

    .line 791
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getDeviceVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setSoftwareVersion(Ljava/lang/String;)V

    .line 792
    invoke-virtual {v4, v6}, Lo/cqa;->b(Lcom/huawei/hihealth/HiDeviceInfo;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    long-to-int v5, v0

    .line 794
    :cond_0
    monitor-exit p0

    return v5

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private getHiHealthClientID(I)Lo/crd;
    .locals 12

    .line 864
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userDeviceClientCache:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/crd;

    .line 865
    if-eqz v3, :cond_0

    .line 866
    return-object v3

    .line 868
    :cond_0
    new-instance v4, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-direct {v4, v0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;-><init>(Landroid/content/Context;)V

    .line 870
    int-to-long v0, p1

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->get(J)Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;

    move-result-object v5

    .line 871
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 872
    const/4 v0, 0x0

    return-object v0

    .line 874
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getProductId()I

    move-result v6

    .line 876
    invoke-direct {p0, v6}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->getAPPID(I)I

    move-result v7

    .line 877
    invoke-direct {p0, v5}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->getDeviceID(Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;)I

    move-result v8

    .line 880
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->infoUserCode:Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;

    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getLocalUserCode()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->getHuid(J)J

    move-result-wide v9

    .line 881
    invoke-direct {p0, v9, v10}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->getUserIDByHuid(J)I

    move-result v11

    .line 882
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    invoke-virtual {v0, v7, v11, v8}, Lo/cqz;->e(III)Lo/crd;

    move-result-object v3

    .line 883
    const/4 v0, 0x0

    if-ne v0, v3, :cond_2

    .line 884
    const/4 v0, 0x0

    return-object v0

    .line 886
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userDeviceClientCache:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 887
    return-object v3
.end method

.method private getHiHealthContext(I)Lo/crd;
    .locals 12

    .line 835
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userDeviceClientCache:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/crd;

    .line 836
    if-eqz v3, :cond_0

    .line 837
    return-object v3

    .line 839
    :cond_0
    new-instance v4, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-direct {v4, v0}, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;-><init>(Landroid/content/Context;)V

    .line 841
    int-to-long v0, p1

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/InfoDevice;->get(J)Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;

    move-result-object v5

    .line 842
    if-nez v5, :cond_1

    .line 843
    const/4 v0, 0x0

    return-object v0

    .line 845
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getProductId()I

    move-result v6

    .line 846
    invoke-direct {p0, v5}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->getDeviceID(Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;)I

    move-result v7

    .line 848
    invoke-direct {p0, v6}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->getAPPID(I)I

    move-result v8

    .line 850
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->infoUserCode:Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;

    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->getLocalUserCode()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->getHuid(J)J

    move-result-wide v9

    .line 851
    invoke-direct {p0, v9, v10}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->getUserIDByHuid(J)I

    move-result v11

    .line 852
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    invoke-virtual {v0, v8, v11, v7}, Lo/cqz;->e(III)Lo/crd;

    move-result-object v3

    .line 853
    const/4 v0, 0x0

    if-ne v0, v3, :cond_2

    .line 854
    const/4 v0, 0x0

    return-object v0

    .line 856
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userDeviceClientCache:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 857
    return-object v3
.end method

.method private getLogDataBaseType(I)I
    .locals 2

    .line 949
    const/4 v1, 0x0

    .line 950
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 960
    :sswitch_0
    iget v1, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->TYPE_HEALTH_DATA:I

    .line 961
    goto :goto_0

    .line 963
    :sswitch_1
    iget v1, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->TYPE_USER_DATA:I

    .line 964
    .line 968
    :goto_0
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x100 -> :sswitch_0
        0x200 -> :sswitch_0
        0x400 -> :sswitch_0
        0x500 -> :sswitch_0
        0x600 -> :sswitch_0
        0x700 -> :sswitch_0
        0x800 -> :sswitch_0
        0xc00 -> :sswitch_0
        0x1000 -> :sswitch_1
    .end sparse-switch
.end method

.method private declared-synchronized getUserIDByHuid(J)I
    .locals 4

    monitor-enter p0

    .line 803
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    .line 804
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->getCurrentLoginHuid()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 806
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    .line 808
    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userInfoManager:Lo/cqs;

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Lo/cqs;->e(Ljava/lang/String;I)I

    move-result v3

    .line 809
    if-gtz v3, :cond_1

    .line 810
    invoke-direct {p0, v2}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->insertUserInfo(Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v3

    .line 812
    :cond_1
    monitor-exit p0

    return v3

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private getUserIDByUserCode(I)I
    .locals 7

    .line 894
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userCodeCache:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Integer;

    .line 895
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 896
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    .line 898
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->infoUserCode:Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->getHuid(J)J

    move-result-wide v4

    .line 899
    invoke-direct {p0, v4, v5}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->getUserIDByHuid(J)I

    move-result v6

    .line 900
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userCodeCache:Landroid/util/SparseArray;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 901
    return v6
.end method

.method private hasBeenSync(I)Z
    .locals 1

    .line 972
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 977
    :sswitch_0
    const/4 v0, 0x1

    return v0

    .line 981
    :goto_0
    const/4 v0, 0x0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x100 -> :sswitch_0
        0x200 -> :sswitch_0
        0x400 -> :sswitch_0
        0x700 -> :sswitch_0
    .end sparse-switch
.end method

.method private init()V
    .locals 2

    .line 182
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    .line 183
    new-instance v0, Lcom/huawei/hihealthservice/old/dataswitch/SportDataToHiHealthData;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/dataswitch/SportDataToHiHealthData;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->sportDataToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/SportDataToHiHealthData;

    .line 184
    new-instance v0, Lcom/huawei/hihealthservice/old/dataswitch/BloodPressureToHiHealthData;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/dataswitch/BloodPressureToHiHealthData;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->bloodPressureToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/BloodPressureToHiHealthData;

    .line 185
    new-instance v0, Lcom/huawei/hihealthservice/old/dataswitch/BloodSugarToHiHealthData;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/dataswitch/BloodSugarToHiHealthData;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->bloodSugarToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/BloodSugarToHiHealthData;

    .line 186
    new-instance v0, Lcom/huawei/hihealthservice/old/dataswitch/MotionDataToHiHealthData;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/dataswitch/MotionDataToHiHealthData;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->motionDataToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/MotionDataToHiHealthData;

    .line 187
    new-instance v0, Lcom/huawei/hihealthservice/old/dataswitch/SleepDataToHiHealthData;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/dataswitch/SleepDataToHiHealthData;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->sleepDataToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/SleepDataToHiHealthData;

    .line 188
    new-instance v0, Lcom/huawei/hihealthservice/old/dataswitch/UserDataToHiUserData;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/dataswitch/UserDataToHiUserData;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userDataToHiUserData:Lcom/huawei/hihealthservice/old/dataswitch/UserDataToHiUserData;

    .line 189
    new-instance v0, Lcom/huawei/hihealthservice/old/dataswitch/WeightToHiHealthData;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/dataswitch/WeightToHiHealthData;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->weightToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/WeightToHiHealthData;

    .line 190
    new-instance v0, Lcom/huawei/hihealthservice/old/logbindata/LogBinDataToHiHealthData;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/logbindata/LogBinDataToHiHealthData;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->logBinDataToHiHealthData:Lcom/huawei/hihealthservice/old/logbindata/LogBinDataToHiHealthData;

    .line 191
    new-instance v0, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->statDataToDayStatData:Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;

    .line 192
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->insertStore:Lo/crf;

    .line 193
    new-instance v0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->infoUserCode:Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;

    .line 194
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-static {v0}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userInfoManager:Lo/cqs;

    .line 195
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->oldDBHelper:Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    .line 196
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userDeviceClientCache:Landroid/util/SparseArray;

    .line 197
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userCodeCache:Landroid/util/SparseArray;

    .line 198
    return-void
.end method

.method private insertUserInfo(Ljava/lang/String;)I
    .locals 3

    .line 824
    new-instance v2, Lcom/huawei/hihealth/HiUserInfo;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiUserInfo;-><init>()V

    .line 825
    invoke-virtual {v2, p1}, Lcom/huawei/hihealth/HiUserInfo;->setHuid(Ljava/lang/String;)V

    .line 826
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserInfo;->setRelateType(I)V

    .line 827
    const-wide/16 v0, 0x1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setCreateTime(J)V

    .line 828
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userInfoManager:Lo/cqs;

    const/4 v1, 0x1

    invoke-virtual {v0, v2, v1}, Lo/cqs;->b(Lcom/huawei/hihealth/HiUserInfo;I)J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method private isHealthAppData(I)Z
    .locals 2

    .line 909
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 910
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 916
    :sswitch_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 917
    .line 921
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x15 -> :sswitch_0
        0x16 -> :sswitch_0
        0x17 -> :sswitch_0
        0x23 -> :sswitch_0
        0x24 -> :sswitch_0
    .end sparse-switch
.end method

.method private isMoveALL(I)Z
    .locals 1

    .line 984
    const/16 v0, 0x100

    if-eq p1, v0, :cond_0

    const/16 v0, 0x200

    if-ne p1, v0, :cond_1

    .line 985
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 987
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private moveDeviceDetailHealthData(Ljava/lang/String;)V
    .locals 18

    .line 401
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 402
    return-void

    .line 404
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 405
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveDeviceDetailHealthData()  tableName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 406
    const-string v0, "_"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 407
    const/4 v0, 0x2

    aget-object v7, v6, v0

    .line 408
    invoke-static {v7}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil;->getDetailDataType(Ljava/lang/String;)I

    move-result v8

    .line 409
    if-gtz v8, :cond_1

    .line 410
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveDeviceDetailHealthData()  dataType <= 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    return-void

    .line 414
    :cond_1
    new-instance v9, Lcom/huawei/hihealthservice/old/db/dao/Data;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    move-object/from16 v1, p1

    invoke-direct {v9, v0, v1, v8}, Lcom/huawei/hihealthservice/old/db/dao/Data;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 417
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->isMoveALL(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 418
    invoke-virtual {v9}, Lcom/huawei/hihealthservice/old/db/dao/Data;->getAll()Ljava/util/List;

    move-result-object v10

    .line 419
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->hasBeenSync(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 420
    const/4 v11, 0x1

    goto :goto_0

    .line 422
    :cond_2
    const/4 v11, 0x0

    goto :goto_0

    .line 425
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 426
    invoke-static {v12, v13}, Lo/cnk;->a(J)I

    move-result v14

    .line 427
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->MOVE_DAY_COUNT:I

    invoke-static {v12, v13, v0}, Lo/cnk;->b(JI)I

    move-result v15

    .line 428
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveDeviceDetailHealthData()  today = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",daysAgo =  "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    invoke-virtual {v9, v15, v14}, Lcom/huawei/hihealthservice/old/db/dao/Data;->getDaysData(II)Ljava/util/List;

    move-result-object v10

    .line 430
    const/4 v11, 0x1

    .line 432
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v10, :cond_4

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 433
    :cond_4
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveDeviceDetailHealthData()  datas = null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    invoke-virtual {v9}, Lcom/huawei/hihealthservice/old/db/dao/Data;->deletTable()V

    .line 435
    return-void

    .line 437
    :cond_5
    const/4 v0, 0x1

    aget-object v0, v6, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v12

    .line 438
    move-object/from16 v0, p0

    invoke-direct {v0, v12}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->getHiHealthContext(I)Lo/crd;

    move-result-object v13

    .line 439
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveDeviceDetailHealthData()  healthContext = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v13, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    const/4 v0, 0x0

    if-ne v0, v13, :cond_6

    .line 441
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveDeviceDetailHealthData()  healthContext = null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 442
    invoke-virtual {v9}, Lcom/huawei/hihealthservice/old/db/dao/Data;->deletTable()V

    .line 443
    return-void

    .line 445
    :cond_6
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v14

    .line 446
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveDeviceDetailHealthData()  datas  size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 447
    const/4 v15, 0x0

    :goto_1
    if-ge v15, v14, :cond_c

    .line 448
    invoke-interface {v10, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, [Lcom/huawei/hihealthservice/old/model/HealthData;

    .line 450
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_b

    move-object/from16 v0, v16

    array-length v0, v0

    if-gtz v0, :cond_7

    .line 451
    goto/16 :goto_3

    .line 454
    :cond_7
    move-object/from16 v0, v16

    array-length v0, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 455
    const/4 v0, 0x0

    aget-object v0, v16, v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v8, v11}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->switchHealthDatas(Lcom/huawei/hihealthservice/old/model/HealthData;II)Ljava/util/List;

    move-result-object v17

    goto :goto_2

    .line 457
    :cond_8
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-direct {v0, v1, v8, v11}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->switchHealthDatas([Lcom/huawei/hihealthservice/old/model/HealthData;II)Ljava/util/List;

    move-result-object v17

    .line 459
    :goto_2
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-eq v0, v1, :cond_9

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 460
    :cond_9
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveDeviceDetailHealthData()  hiHealthDatas = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    return-void

    .line 463
    :cond_a
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveDeviceDetailHealthData()  hiHealthDatas size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    move-object/from16 v0, v17

    invoke-static {v0, v13}, Lo/crd;->a(Ljava/util/List;Lo/crd;)V

    .line 465
    invoke-virtual {v13}, Lo/crd;->f()I

    move-result v0

    move-object/from16 v1, p0

    move-object/from16 v2, v17

    invoke-direct {v1, v2, v0}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->saveDetailHiHealthDatas(Ljava/util/List;I)V

    .line 466
    const/16 v0, 0x400

    if-ne v8, v0, :cond_b

    .line 467
    move-object/from16 v0, v17

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/crd;->b(Ljava/util/List;I)V

    .line 468
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->insertStore:Lo/crf;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/crf;->c(Ljava/util/List;)V

    .line 447
    :cond_b
    :goto_3
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_1

    .line 471
    :cond_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->insertStore:Lo/crf;

    invoke-virtual {v0}, Lo/crf;->e()V

    .line 472
    invoke-virtual {v9}, Lcom/huawei/hihealthservice/old/db/dao/Data;->deletTable()V

    .line 473
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveDeviceDetailHealthData deletTable tableName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 474
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveDeviceDetailHealthData end tableName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ", totalTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 475
    return-void
.end method

.method private moveNoSynData(Ljava/lang/String;)V
    .locals 12

    .line 482
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveNoSynData() name = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    new-instance v4, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-direct {v4, v0, p1}, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 484
    iget v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->READ_LOGBIN_COUNT:I

    invoke-virtual {v4, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->getMore(I)Ljava/util/List;

    move-result-object v5

    .line 485
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 486
    :cond_0
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveNoSynData() binlog datas = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 487
    invoke-virtual {v4}, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->deletTable()V

    .line 488
    return-void

    .line 490
    :cond_1
    const-string v0, "_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 491
    const/4 v0, 0x1

    aget-object v0, v6, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 492
    const/4 v8, 0x1

    .line 493
    :goto_0
    if-eqz v8, :cond_5

    .line 494
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveNoSynData() binlog datas size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    .line 496
    const/4 v10, 0x0

    :goto_1
    if-ge v10, v9, :cond_2

    .line 497
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealthservice/old/db/dao/LogTable;

    .line 498
    int-to-long v0, v7

    invoke-direct {p0, v11, v0, v1}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->moveOneLogBin(Lcom/huawei/hihealthservice/old/db/dao/LogTable;J)V

    .line 499
    invoke-virtual {v4, v11}, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->delet(Lcom/huawei/hihealthservice/old/db/dao/LogTable;)I

    .line 496
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 501
    :cond_2
    iget v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->READ_LOGBIN_COUNT:I

    invoke-virtual {v4, v0}, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->getMore(I)Ljava/util/List;

    move-result-object v5

    .line 502
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 503
    :cond_3
    const/4 v8, 0x0

    .line 505
    :cond_4
    goto :goto_0

    .line 506
    :cond_5
    invoke-virtual {v4}, Lcom/huawei/hihealthservice/old/db/dao/LogBinBase;->deletTable()V

    .line 507
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveNoSynData deletTable name = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 508
    return-void
.end method

.method private moveOldData()V
    .locals 22

    .line 205
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveOldData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 209
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->oldDBHelper:Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getTableName()Ljava/util/List;

    move-result-object v6

    .line 210
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveOldData() tableNames = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveOldData() tableNames =  null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    return-void

    .line 217
    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 219
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 221
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 223
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 225
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 228
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/String;

    .line 229
    const-string v0, "user_preference_data"

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 230
    invoke-interface {v7, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 232
    :cond_1
    const-string v0, "user_"

    invoke-virtual {v13, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "_stat"

    invoke-virtual {v13, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 233
    invoke-interface {v8, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 235
    :cond_2
    const-string v0, "device_"

    invoke-virtual {v13, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "_data"

    invoke-virtual {v13, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 236
    invoke-interface {v9, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 238
    :cond_3
    const-string v0, "user_"

    invoke-virtual {v13, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "_data"

    invoke-virtual {v13, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 239
    invoke-interface {v10, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 241
    :cond_4
    const-string v0, "user_"

    invoke-virtual {v13, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "_binlog"

    invoke-virtual {v13, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 242
    invoke-interface {v11, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 244
    :cond_5
    goto/16 :goto_0

    .line 247
    :cond_6
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->moveTableSum:I

    .line 248
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/16 v1, 0xb

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveOldData() moveTableSum = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->moveTableSum:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", userDataTables = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v7, v1, v2

    const-string v2, ", userStatTables = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v8, v1, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ",deviceDataTables ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const-string v2, ", binlogTables = "

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const/16 v2, 0x8

    aput-object v11, v1, v2

    const-string v2, ",userHealthDataTables = "

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const/16 v2, 0xa

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 257
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveOldData() moveAccountInfo totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-long v2, v12, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 261
    invoke-direct/range {p0 .. p0}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->moveUserData()V

    .line 262
    invoke-direct/range {p0 .. p0}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->sendPercentBroadcast()V

    .line 265
    :cond_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    .line 266
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveOldData() moveUserData totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-long v2, v14, v12

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Ljava/lang/String;

    .line 270
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->moveUserHealthStat(Ljava/lang/String;)V

    .line 271
    invoke-direct/range {p0 .. p0}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->sendPercentBroadcast()V

    .line 272
    goto :goto_1

    .line 274
    :cond_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    .line 275
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveOldData() moveUserStat totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-long v2, v16, v14

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_2
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Ljava/lang/String;

    .line 279
    move-object/from16 v0, p0

    move-object/from16 v1, v19

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->moveNoSynData(Ljava/lang/String;)V

    .line 280
    invoke-direct/range {p0 .. p0}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->sendPercentBroadcast()V

    .line 281
    goto :goto_2

    .line 283
    :cond_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    .line 284
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveOldData() moveNoSynData totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-long v2, v18, v16

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_3
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Ljava/lang/String;

    .line 288
    if-nez v21, :cond_a

    .line 289
    goto :goto_3

    .line 291
    :cond_a
    move-object/from16 v0, p0

    move-object/from16 v1, v21

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->moveDeviceDetailHealthData(Ljava/lang/String;)V

    .line 292
    invoke-direct/range {p0 .. p0}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->sendPercentBroadcast()V

    .line 293
    goto :goto_3

    .line 294
    :cond_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v20

    .line 295
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveOldData() moveDeviceHealthData totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-long v2, v20, v18

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    return-void
.end method

.method private moveOneLogBin(Lcom/huawei/hihealthservice/old/db/dao/LogTable;J)V
    .locals 19

    .line 515
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveNoSynData() TYPE_HEALTH_DATA ADD logTable = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 516
    if-nez p1, :cond_0

    .line 517
    return-void

    .line 519
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getDataType()I

    move-result v7

    .line 521
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->getLogDataBaseType(I)I

    move-result v8

    .line 523
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->TYPE_HEALTH_DATA:I

    if-ne v0, v8, :cond_a

    .line 525
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getActionCode()I

    move-result v9

    .line 526
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getLocalUserDeviceCode()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->getHiHealthClientID(I)Lo/crd;

    move-result-object v10

    .line 527
    const/4 v0, 0x0

    if-ne v0, v10, :cond_1

    .line 528
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveNoSynData() TYPE_HEALTH_DATA clientID <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    return-void

    .line 531
    :cond_1
    const/4 v0, 0x1

    if-eq v9, v0, :cond_2

    const/4 v0, 0x3

    if-ne v9, v0, :cond_9

    .line 532
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->logBinDataToHiHealthData:Lcom/huawei/hihealthservice/old/logbindata/LogBinDataToHiHealthData;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/logbindata/LogBinDataToHiHealthData;->switchLogBinToHealthDatas(Lcom/huawei/hihealthservice/old/db/dao/LogTable;)[Lcom/huawei/hihealthservice/old/model/HealthData;

    move-result-object v11

    .line 533
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveNoSynData() TYPE_HEALTH_DATA ADD healthDatas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    const/4 v0, 0x0

    if-eq v0, v11, :cond_3

    array-length v0, v11

    if-gtz v0, :cond_4

    .line 535
    :cond_3
    return-void

    .line 538
    :cond_4
    array-length v0, v11

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 539
    const/4 v0, 0x0

    aget-object v0, v11, v0

    move-object/from16 v1, p0

    const/4 v2, 0x0

    invoke-direct {v1, v0, v7, v2}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->switchHealthDatas(Lcom/huawei/hihealthservice/old/model/HealthData;II)Ljava/util/List;

    move-result-object v12

    goto :goto_0

    .line 541
    :cond_5
    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-direct {v0, v11, v7, v1}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->switchHealthDatas([Lcom/huawei/hihealthservice/old/model/HealthData;II)Ljava/util/List;

    move-result-object v12

    .line 543
    :goto_0
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveNoSynData() TYPE_HEALTH_DATA ADD hiHealthDatas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 544
    const/4 v0, 0x0

    if-eq v0, v12, :cond_6

    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 545
    :cond_6
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveNoSynData()  hiHealthDatas = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    return-void

    .line 548
    :cond_7
    invoke-static {v12, v10}, Lo/crd;->a(Ljava/util/List;Lo/crd;)V

    .line 549
    invoke-virtual {v10}, Lo/crd;->f()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v12, v0}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->saveDetailHiHealthDatas(Ljava/util/List;I)V

    .line 550
    const/16 v0, 0x200

    if-eq v7, v0, :cond_8

    .line 551
    return-void

    .line 553
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->insertStore:Lo/crf;

    invoke-virtual {v0, v12}, Lo/crf;->c(Ljava/util/List;)V

    .line 554
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->insertStore:Lo/crf;

    invoke-virtual {v0}, Lo/crf;->e()V

    .line 555
    goto/16 :goto_1

    :cond_9
    const/4 v0, 0x2

    if-ne v9, v0, :cond_a

    .line 556
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->getReferData()Ljava/lang/String;

    move-result-object v11

    .line 557
    new-instance v12, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;

    invoke-direct {v12, v11}, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;-><init>(Ljava/lang/String;)V

    .line 558
    invoke-virtual {v12}, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->getSubType()I

    move-result v13

    .line 559
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveNoSynData() TYPE_HEALTH_DATA DELETE subType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    const/16 v0, 0x700

    if-ne v13, v0, :cond_a

    .line 561
    invoke-virtual {v12}, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->getStartTime()J

    move-result-wide v14

    .line 562
    const/16 v16, 0x2

    .line 563
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-static {v0}, Lo/cpy;->d(Landroid/content/Context;)Lo/cpy;

    move-result-object v17

    .line 564
    move-object/from16 v0, v17

    move-wide v1, v14

    .line 565
    invoke-virtual {v10}, Lo/crd;->a()I

    move-result v4

    move/from16 v6, v16

    .line 564
    const/16 v3, 0x7d4

    const/4 v5, 0x2

    const/4 v6, 0x2

    invoke-virtual/range {v0 .. v6}, Lo/cpy;->a(JIIII)I

    move-result v18

    .line 566
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveNoSynData() delete weight DELETE update = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    move-object/from16 v0, v17

    move-wide v1, v14

    .line 568
    invoke-virtual {v10}, Lo/crd;->a()I

    move-result v4

    move/from16 v6, v16

    .line 567
    const/16 v3, 0x7d1

    const/4 v5, 0x2

    const/4 v6, 0x2

    invoke-virtual/range {v0 .. v6}, Lo/cpy;->a(JIIII)I

    move-result v18

    .line 569
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveNoSynData() delete bodyFat DELETE update = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 591
    :cond_a
    :goto_1
    return-void
.end method

.method private moveUserData()V
    .locals 14

    .line 312
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveUserData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    new-instance v6, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-direct {v6, v0}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;-><init>(Landroid/content/Context;)V

    .line 315
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->getAll()Ljava/util/List;

    move-result-object v7

    .line 316
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 318
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;

    .line 319
    const/4 v0, 0x0

    if-ne v0, v9, :cond_0

    .line 320
    goto :goto_0

    .line 322
    :cond_0
    invoke-virtual {v9}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->getHuid()J

    move-result-wide v10

    .line 323
    invoke-virtual {v9}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->getType()Ljava/lang/String;

    move-result-object v12

    .line 324
    invoke-virtual {v9}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->getData()Ljava/lang/String;

    move-result-object v13

    .line 325
    move-object v0, p0

    move-object v1, v12

    move-object v2, v13

    move-wide v3, v10

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->saveUserData(Ljava/lang/String;Ljava/lang/String;JI)V

    .line 326
    goto :goto_0

    .line 328
    :cond_1
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceData;->deletTable()V

    .line 329
    return-void
.end method

.method private moveUserHealthStat(Ljava/lang/String;)V
    .locals 18

    .line 354
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 355
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveUserStat()  tableName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    const-string v0, "_"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 357
    const/4 v0, 0x2

    aget-object v7, v6, v0

    .line 358
    invoke-static {v7}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil;->getDataStatType(Ljava/lang/String;)I

    move-result v8

    .line 359
    if-gtz v8, :cond_0

    .line 360
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveUserStat()  dataType <= 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    return-void

    .line 363
    :cond_0
    new-instance v9, Lcom/huawei/hihealthservice/old/db/dao/Stat;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    move-object/from16 v1, p1

    invoke-direct {v9, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/Stat;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 364
    invoke-virtual {v9}, Lcom/huawei/hihealthservice/old/db/dao/Stat;->getDayStaAll()Ljava/util/List;

    move-result-object v10

    .line 365
    const/4 v0, 0x0

    if-eq v0, v10, :cond_1

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 366
    :cond_1
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveUserStat()  statTables = null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 367
    invoke-virtual {v9}, Lcom/huawei/hihealthservice/old/db/dao/Stat;->deletTable()V

    .line 368
    return-void

    .line 370
    :cond_2
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveUserStat()  oldStatTables size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    const/4 v0, 0x1

    aget-object v0, v6, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    .line 372
    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->getUserIDByUserCode(I)I

    move-result v12

    .line 373
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v12, v2}, Lo/cqz;->e(III)Lo/crd;

    move-result-object v13

    .line 374
    const/4 v0, 0x0

    if-ne v0, v13, :cond_3

    .line 375
    invoke-virtual {v9}, Lcom/huawei/hihealthservice/old/db/dao/Stat;->deletTable()V

    .line 376
    return-void

    .line 378
    :cond_3
    invoke-virtual {v13}, Lo/crd;->a()I

    move-result v14

    .line 379
    if-gtz v14, :cond_4

    .line 380
    invoke-virtual {v9}, Lcom/huawei/hihealthservice/old/db/dao/Stat;->deletTable()V

    .line 381
    return-void

    .line 383
    :cond_4
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :cond_5
    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/huawei/hihealthservice/old/db/dao/StatTable;

    .line 384
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->statDataToDayStatData:Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1, v8, v14, v12}, Lcom/huawei/hihealthservice/old/dataswitch/StatDataToDayStatData;->switchStatTable(Lcom/huawei/hihealthservice/old/db/dao/StatTable;III)Ljava/util/List;

    move-result-object v17

    .line 385
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-eq v0, v1, :cond_5

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 386
    goto :goto_0

    .line 388
    :cond_6
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveUserStat()  newStatTables size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->saveStatData(Ljava/util/List;)V

    .line 390
    goto :goto_0

    .line 392
    :cond_7
    invoke-virtual {v9}, Lcom/huawei/hihealthservice/old/db/dao/Stat;->deletTable()V

    .line 393
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveUserStat end tableName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ", totalTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    return-void
.end method

.method private saveDetailHiHealthDatas(Ljava/util/List;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)V"
        }
    .end annotation

    .line 729
    if-gtz p2, :cond_0

    .line 730
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDetailHiHealthDatas clientID <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 731
    return-void

    .line 733
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 734
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDetailHiHealthDatas() hiHealthDatas size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",userID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 735
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->insertStore:Lo/crf;

    invoke-virtual {v0, p1, p2}, Lo/crf;->b(Ljava/util/List;I)I

    .line 736
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDetailHiHealthDatas() end totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 737
    return-void
.end method

.method private saveStatData(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cob;>;)V"
        }
    .end annotation

    .line 741
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 742
    :cond_0
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveStatData statTables = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 743
    return-void

    .line 745
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 746
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveStatData() statTables size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 747
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->insertStore:Lo/crf;

    invoke-virtual {v0, p1}, Lo/crf;->b(Ljava/util/List;)I

    .line 748
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveStatData() end totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 749
    return-void
.end method

.method private declared-synchronized saveUserData(Ljava/lang/String;Ljava/lang/String;JI)V
    .locals 10

    monitor-enter p0

    .line 597
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/16 v1, 0x8

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserData() type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ",data = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    const-string v2, ", huid = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ", syncType = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 598
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-static {v0}, Lo/cqi;->b(Landroid/content/Context;)Lo/cqi;

    move-result-object v4

    .line 599
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->USERINFO:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 600
    const-class v0, Lcom/huawei/hihealthservice/old/model/UserInfo;

    invoke-static {p2, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealthservice/old/model/UserInfo;

    .line 601
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userDataToHiUserData:Lcom/huawei/hihealthservice/old/dataswitch/UserDataToHiUserData;

    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->getCurrentLoginHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, p3, p4, v1}, Lcom/huawei/hihealthservice/old/dataswitch/UserDataToHiUserData;->swtichUserInfo(Lcom/huawei/hihealthservice/old/model/UserInfo;JLjava/lang/String;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v6

    .line 602
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 603
    monitor-exit p0

    return-void

    .line 605
    :cond_0
    const-wide/16 v0, 0x1

    invoke-virtual {v6, v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setCreateTime(J)V

    .line 606
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userInfoManager:Lo/cqs;

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getHuid()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/cqs;->c(Ljava/lang/String;I)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v7

    .line 608
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 609
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userInfoManager:Lo/cqs;

    invoke-virtual {v7}, Lcom/huawei/hihealth/HiUserInfo;->getOwerID()I

    move-result v1

    invoke-virtual {v0, v6, v1, p5}, Lo/cqs;->e(Lcom/huawei/hihealth/HiUserInfo;II)I

    move-result v0

    int-to-long v8, v0

    .line 610
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserData() update userInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 612
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userInfoManager:Lo/cqs;

    invoke-virtual {v0, v6, p5}, Lo/cqs;->b(Lcom/huawei/hihealth/HiUserInfo;I)J

    move-result-wide v8

    .line 613
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserData() insert userInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 615
    :goto_0
    goto/16 :goto_1

    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->GOALS:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 616
    invoke-direct {p0, p3, p4}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->getUserIDByHuid(J)I

    move-result v5

    .line 617
    const-class v0, Lcom/huawei/hihealthservice/old/model/Goal;

    invoke-static {p2, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealthservice/old/model/Goal;

    .line 618
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userDataToHiUserData:Lcom/huawei/hihealthservice/old/dataswitch/UserDataToHiUserData;

    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/model/Goal;->getSport_day_steps_sum()I

    move-result v1

    invoke-virtual {v0, v1, v5}, Lcom/huawei/hihealthservice/old/dataswitch/UserDataToHiUserData;->switchStepGoal(II)Lcom/huawei/hihealth/HiGoalInfo;

    move-result-object v7

    .line 619
    invoke-virtual {v4, v7, p5}, Lo/cqi;->b(Lcom/huawei/hihealth/HiGoalInfo;I)Z

    move-result v8

    .line 620
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserData() change goal step = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 621
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->userDataToHiUserData:Lcom/huawei/hihealthservice/old/dataswitch/UserDataToHiUserData;

    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/model/Goal;->getWeight_month_weight_recommend()F

    move-result v1

    invoke-virtual {v0, v1, v5}, Lcom/huawei/hihealthservice/old/dataswitch/UserDataToHiUserData;->switchWeightGoal(FI)Lcom/huawei/hihealth/HiGoalInfo;

    move-result-object v7

    .line 622
    invoke-virtual {v4, v7, p5}, Lo/cqi;->b(Lcom/huawei/hihealth/HiGoalInfo;I)Z

    move-result v8

    .line 623
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserData() change goal weight = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 625
    :cond_3
    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private sendPercentBroadcast()V
    .locals 4

    .line 302
    iget v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->moveTableCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->moveTableCount:I

    .line 303
    iget v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->moveTableCount:I

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    iget v1, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->moveTableSum:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->currentPercent:F

    .line 304
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendPercentBroadcast() moveTableCount = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->moveTableCount:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", moveTableSum = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->moveTableSum:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",currentPercent = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->currentPercent:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->currentPercent:F

    invoke-static {v0, v1}, Lo/cnt;->b(Landroid/content/Context;F)V

    .line 306
    return-void
.end method

.method private switchHealthDatas(Lcom/huawei/hihealthservice/old/model/HealthData;II)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealthservice/old/model/HealthData;II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 679
    const/4 v2, 0x0

    .line 680
    sparse-switch p2, :sswitch_data_0

    goto/16 :goto_0

    .line 682
    :sswitch_0
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/model/SportData;

    if-eqz v0, :cond_0

    .line 683
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->sportDataToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/SportDataToHiHealthData;

    move-object v1, p1

    check-cast v1, Lcom/huawei/hihealthservice/old/model/SportData;

    invoke-virtual {v0, v1, p3}, Lcom/huawei/hihealthservice/old/dataswitch/SportDataToHiHealthData;->switchSportData(Lcom/huawei/hihealthservice/old/model/SportData;I)Ljava/util/List;

    move-result-object v2

    goto/16 :goto_0

    .line 688
    :sswitch_1
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/model/Weight;

    if-eqz v0, :cond_0

    .line 689
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->weightToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/WeightToHiHealthData;

    move-object v1, p1

    check-cast v1, Lcom/huawei/hihealthservice/old/model/Weight;

    invoke-virtual {v0, v1, p3}, Lcom/huawei/hihealthservice/old/dataswitch/WeightToHiHealthData;->switchWeight(Lcom/huawei/hihealthservice/old/model/Weight;I)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    .line 694
    :sswitch_2
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/model/MotionPath;

    if-eqz v0, :cond_0

    .line 695
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 696
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->motionDataToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/MotionDataToHiHealthData;

    move-object v1, p1

    check-cast v1, Lcom/huawei/hihealthservice/old/model/MotionPath;

    invoke-virtual {v0, v1, p3}, Lcom/huawei/hihealthservice/old/dataswitch/MotionDataToHiHealthData;->switchMotionPath(Lcom/huawei/hihealthservice/old/model/MotionPath;I)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 701
    :sswitch_3
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/model/BloodPresure;

    if-eqz v0, :cond_0

    .line 702
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->bloodPressureToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/BloodPressureToHiHealthData;

    move-object v1, p1

    check-cast v1, Lcom/huawei/hihealthservice/old/model/BloodPresure;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/dataswitch/BloodPressureToHiHealthData;->switchBloodPressure(Lcom/huawei/hihealthservice/old/model/BloodPresure;)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    .line 707
    :sswitch_4
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/model/BloodSugar;

    if-eqz v0, :cond_0

    .line 708
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 709
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->bloodSugarToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/BloodSugarToHiHealthData;

    move-object v1, p1

    check-cast v1, Lcom/huawei/hihealthservice/old/model/BloodSugar;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/dataswitch/BloodSugarToHiHealthData;->switchBloodSugar(Lcom/huawei/hihealthservice/old/model/BloodSugar;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 714
    :sswitch_5
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/model/SleepData;

    if-eqz v0, :cond_0

    .line 715
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->sleepDataToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/SleepDataToHiHealthData;

    move-object v1, p1

    check-cast v1, Lcom/huawei/hihealthservice/old/model/SleepData;

    invoke-virtual {v0, v1, p3}, Lcom/huawei/hihealthservice/old/dataswitch/SleepDataToHiHealthData;->switchSleepData(Lcom/huawei/hihealthservice/old/model/SleepData;I)Ljava/util/List;

    move-result-object v2

    .line 722
    :cond_0
    :goto_0
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x100 -> :sswitch_0
        0x200 -> :sswitch_5
        0x400 -> :sswitch_2
        0x500 -> :sswitch_4
        0x600 -> :sswitch_3
        0x700 -> :sswitch_1
    .end sparse-switch
.end method

.method private switchHealthDatas([Lcom/huawei/hihealthservice/old/model/HealthData;II)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Lcom/huawei/hihealthservice/old/model/HealthData;II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 631
    const/4 v2, 0x0

    .line 632
    sparse-switch p2, :sswitch_data_0

    goto/16 :goto_0

    .line 634
    :sswitch_0
    instance-of v0, p1, [Lcom/huawei/hihealthservice/old/model/SportData;

    if-eqz v0, :cond_0

    .line 635
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->sportDataToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/SportDataToHiHealthData;

    move-object v1, p1

    check-cast v1, [Lcom/huawei/hihealthservice/old/model/SportData;

    check-cast v1, [Lcom/huawei/hihealthservice/old/model/SportData;

    invoke-virtual {v0, v1, p3}, Lcom/huawei/hihealthservice/old/dataswitch/SportDataToHiHealthData;->switchSportDatas([Lcom/huawei/hihealthservice/old/model/SportData;I)Ljava/util/List;

    move-result-object v2

    goto/16 :goto_0

    .line 640
    :sswitch_1
    instance-of v0, p1, [Lcom/huawei/hihealthservice/old/model/Weight;

    if-eqz v0, :cond_0

    .line 641
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->weightToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/WeightToHiHealthData;

    move-object v1, p1

    check-cast v1, [Lcom/huawei/hihealthservice/old/model/Weight;

    check-cast v1, [Lcom/huawei/hihealthservice/old/model/Weight;

    invoke-virtual {v0, v1, p3}, Lcom/huawei/hihealthservice/old/dataswitch/WeightToHiHealthData;->switchWeights([Lcom/huawei/hihealthservice/old/model/Weight;I)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    .line 646
    :sswitch_2
    instance-of v0, p1, [Lcom/huawei/hihealthservice/old/model/MotionPath;

    if-eqz v0, :cond_0

    .line 647
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->motionDataToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/MotionDataToHiHealthData;

    move-object v1, p1

    check-cast v1, [Lcom/huawei/hihealthservice/old/model/MotionPath;

    check-cast v1, [Lcom/huawei/hihealthservice/old/model/MotionPath;

    invoke-virtual {v0, v1, p3}, Lcom/huawei/hihealthservice/old/dataswitch/MotionDataToHiHealthData;->switchMotionPaths([Lcom/huawei/hihealthservice/old/model/MotionPath;I)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    .line 652
    :sswitch_3
    instance-of v0, p1, [Lcom/huawei/hihealthservice/old/model/BloodPresure;

    if-eqz v0, :cond_0

    .line 653
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->bloodPressureToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/BloodPressureToHiHealthData;

    move-object v1, p1

    check-cast v1, [Lcom/huawei/hihealthservice/old/model/BloodPresure;

    check-cast v1, [Lcom/huawei/hihealthservice/old/model/BloodPresure;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/dataswitch/BloodPressureToHiHealthData;->switchBloodPressures([Lcom/huawei/hihealthservice/old/model/BloodPresure;)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    .line 658
    :sswitch_4
    instance-of v0, p1, [Lcom/huawei/hihealthservice/old/model/BloodSugar;

    if-eqz v0, :cond_0

    .line 659
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->bloodSugarToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/BloodSugarToHiHealthData;

    move-object v1, p1

    check-cast v1, [Lcom/huawei/hihealthservice/old/model/BloodSugar;

    check-cast v1, [Lcom/huawei/hihealthservice/old/model/BloodSugar;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/dataswitch/BloodSugarToHiHealthData;->switchBloodSugars([Lcom/huawei/hihealthservice/old/model/BloodSugar;)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    .line 664
    :sswitch_5
    instance-of v0, p1, [Lcom/huawei/hihealthservice/old/model/SleepData;

    if-eqz v0, :cond_0

    .line 665
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->sleepDataToHiHealthData:Lcom/huawei/hihealthservice/old/dataswitch/SleepDataToHiHealthData;

    move-object v1, p1

    check-cast v1, [Lcom/huawei/hihealthservice/old/model/SleepData;

    check-cast v1, [Lcom/huawei/hihealthservice/old/model/SleepData;

    invoke-virtual {v0, v1, p3}, Lcom/huawei/hihealthservice/old/dataswitch/SleepDataToHiHealthData;->switchSleepDatas([Lcom/huawei/hihealthservice/old/model/SleepData;I)Ljava/util/List;

    move-result-object v2

    .line 672
    :cond_0
    :goto_0
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x100 -> :sswitch_0
        0x200 -> :sswitch_5
        0x400 -> :sswitch_2
        0x500 -> :sswitch_4
        0x600 -> :sswitch_3
        0x700 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public onDestroy()V
    .locals 5

    .line 993
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->oldDBHelper:Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    if-eqz v0, :cond_0

    .line 994
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->oldDBHelper:Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->close()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 999
    :cond_0
    goto :goto_0

    .line 996
    :catch_0
    move-exception v4

    .line 998
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IllegalStateException during onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1000
    :goto_0
    invoke-super {p0}, Landroid/app/IntentService;->onDestroy()V

    .line 1001
    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 9

    .line 143
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onHandleIntent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->init()V

    .line 150
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cnt;->b(Landroid/content/Context;F)V

    .line 151
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 154
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->moveOldData()V

    .line 157
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v6, v0, v4

    .line 158
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onHandleIntent moveTotalTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    const-string v1, "health_cloud.db"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v8

    .line 162
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onHandleIntent delete db file = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->a(Landroid/content/Context;)V

    .line 166
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cnt;->a(Landroid/content/Context;I)V

    .line 167
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->k(Landroid/content/Context;)V

    .line 168
    invoke-static {}, Lo/cun;->e()Lo/cun;

    move-result-object v0

    const-string v1, "OldDataMovetoHiHealthService"

    new-instance v2, Lo/crd;

    iget-object v3, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lo/crd;-><init>(Ljava/lang/String;)V

    const/16 v3, 0xc8

    invoke-virtual {v0, v3, v1, v2}, Lo/cun;->d(ILjava/lang/String;Lo/crd;)V

    .line 170
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "is_database_update_success"

    const-string v2, "1"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    goto :goto_0

    .line 172
    :catch_0
    move-exception v4

    .line 174
    const-string v0, "Debug_OldDataMovetoHiHealthService"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    const-string v2, "onHandleIntent Exception e = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/move/OldDataMovetoHiHealthService;->context:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->c(Landroid/content/Context;)V

    .line 178
    :goto_0
    return-void
.end method
