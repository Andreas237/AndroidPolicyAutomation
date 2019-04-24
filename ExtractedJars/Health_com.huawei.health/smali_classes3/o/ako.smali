.class public Lo/ako;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ako$a;
    }
.end annotation


# instance fields
.field private d:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ako;->d:Z

    .line 39
    return-void
.end method

.method synthetic constructor <init>(Lo/ako$4;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lo/ako;-><init>()V

    return-void
.end method

.method private b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 7

    .line 126
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0}, Lo/aks;->b()Ljava/util/List;

    move-result-object v4

    .line 127
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 128
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

    .line 129
    if-eqz v6, :cond_0

    .line 130
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 131
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 132
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ako;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    const-string v0, "HWhealthLinkage_HealthLibInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getConnectedAw70 find aw70 device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    return-object v6

    .line 137
    :cond_0
    goto :goto_0

    .line 139
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static final e()Lo/ako;
    .locals 1

    .line 42
    invoke-static {}, Lo/ako$a;->a()Lo/ako;

    move-result-object v0

    return-object v0
.end method

.method private e(I)Z
    .locals 4

    .line 143
    const/16 v0, 0x51

    if-eq p1, v0, :cond_0

    const/16 v0, 0x53

    if-ne p1, v0, :cond_1

    .line 144
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 146
    :cond_1
    const-string v0, "HWhealthLinkage_HealthLibInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isAw70Device() == false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public d(Ljava/lang/Object;)V
    .locals 8

    .line 80
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 81
    const-string v0, "HWhealthLinkage_HealthLibInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertRunPostureData null == object"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    return-void

    .line 84
    :cond_0
    instance-of v0, p1, Lorg/json/JSONObject;

    if-nez v0, :cond_1

    .line 85
    const-string v0, "HWhealthLinkage_HealthLibInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertRunPostureData object error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    return-void

    .line 88
    :cond_1
    invoke-direct {p0}, Lo/ako;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 89
    const/4 v0, 0x0

    if-ne v0, v4, :cond_2

    .line 90
    const-string v0, "HWhealthLinkage_HealthLibInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertRunPostureData null == info"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    return-void

    .line 94
    :cond_2
    iget-boolean v0, p0, Lo/ako;->d:Z

    if-nez v0, :cond_3

    .line 95
    const-string v0, "HWhealthLinkage_HealthLibInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertRunPostureData register"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ako;->d:Z

    .line 97
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v5

    .line 98
    new-instance v6, Lcom/huawei/hihealth/HiDeviceInfo;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiDeviceInfo;-><init>()V

    .line 99
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceUniqueCode(Ljava/lang/String;)V

    .line 100
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 101
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/fju;->c(I)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceType(I)V

    .line 102
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 103
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    const/4 v0, 0x0

    invoke-interface {v5, v6, v7, v0}, Lo/clt;->c(Lcom/huawei/hihealth/HiDeviceInfo;Ljava/util/List;Lo/cme;)V

    .line 107
    :cond_3
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    const v0, 0xc352

    invoke-direct {v5, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 109
    const-string v0, "HWhealthLinkage_HealthLibInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertRunPostureData MetaData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 111
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 112
    new-instance v6, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 113
    invoke-virtual {v6, v5}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 114
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecUUID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#ANDROID21"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 115
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setOwnerID(I)V

    .line 116
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v7

    .line 117
    new-instance v0, Lo/ako$5;

    invoke-direct {v0, p0}, Lo/ako$5;-><init>(Lo/ako;)V

    invoke-interface {v7, v6, v0}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 123
    return-void
.end method

.method public e(Lo/acl;II)V
    .locals 7

    .line 47
    const-string v0, "HWhealthLinkage_HealthLibInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerHiHealthLib enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    if-nez p1, :cond_0

    .line 50
    const-string v0, "HWhealthLinkage_HealthLibInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerHiHealthLib device is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    return-void

    .line 54
    :cond_0
    const-string v0, "HWhealthLinkage_HealthLibInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerHiHealthLib device name is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/acl;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " and macAddress: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/acl;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v4, p3}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 58
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 59
    invoke-virtual {v4, p2}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 60
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 62
    new-instance v5, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 63
    invoke-virtual {v5, v4}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 65
    invoke-virtual {p1}, Lo/acl;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 66
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setOwnerID(I)V

    .line 68
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v6

    .line 69
    new-instance v0, Lo/ako$4;

    invoke-direct {v0, p0}, Lo/ako$4;-><init>(Lo/ako;)V

    invoke-interface {v6, v5, v0}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 76
    return-void
.end method
