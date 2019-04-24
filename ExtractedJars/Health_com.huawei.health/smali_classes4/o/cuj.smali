.class public Lo/cuj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cuj$b;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    return-void
.end method

.method synthetic constructor <init>(Lo/cuj$1;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lo/cuj;-><init>()V

    return-void
.end method

.method public static a()Lo/cuj;
    .locals 1

    .line 43
    invoke-static {}, Lo/cuj$b;->b()Lo/cuj;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 0

    .line 244
    invoke-static {p1}, Lo/cuo;->a(Landroid/content/Context;)V

    .line 245
    return-void
.end method

.method public a(Landroid/content/Context;I)V
    .locals 2

    .line 238
    invoke-virtual {p0, p1}, Lo/cuj;->a(Landroid/content/Context;)V

    .line 240
    invoke-static {p1}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/csk;->e(I)V

    .line 241
    return-void
.end method

.method public b(Landroid/content/Context;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 248
    invoke-static {p1, p2}, Lo/cuo;->a(Landroid/content/Context;I)V

    .line 249
    return-void
.end method

.method public c(Landroid/content/Context;Lo/crd;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 115
    invoke-static {p1}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 116
    invoke-static {p1}, Lo/cqa;->a(Landroid/content/Context;)Lo/cqa;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/cqa;->e(Ljava/lang/String;)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v5

    .line 117
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 118
    new-instance v6, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;

    invoke-direct {v6}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;-><init>()V

    .line 119
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceType()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setProductId(Ljava/lang/Integer;)V

    .line 120
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setUniqueId(Ljava/lang/String;)V

    .line 121
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setName(Ljava/lang/String;)V

    .line 122
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setFirmwareVersion(Ljava/lang/String;)V

    .line 123
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getHardwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setHardwareVersion(Ljava/lang/String;)V

    .line 124
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getSoftwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setSoftwareVersion(Ljava/lang/String;)V

    .line 125
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getManufacturer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setManufacturer(Ljava/lang/String;)V

    .line 126
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 127
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "binddevice device uuid is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    :cond_0
    invoke-static {p1}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/czg;->e(Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;

    move-result-object v7

    .line 130
    const/4 v0, 0x0

    invoke-static {v7, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 131
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindDevice error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    const/4 v0, 0x0

    return v0

    .line 134
    :cond_1
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;->getDeviceCode()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    .line 135
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-gtz v0, :cond_2

    .line 136
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindDevice error ans from cloud, deviceCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindDevice error deviceUUID is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    const/4 v0, 0x0

    return v0

    .line 140
    :cond_2
    invoke-virtual {p2, v8, v9}, Lo/crd;->c(J)V

    .line 141
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lo/crd;->c(I)V

    .line 142
    invoke-static {p1}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/cpw;->e(Lo/crd;)J

    .line 143
    const/4 v0, 0x1

    return v0

    .line 145
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public d(J)Lcom/huawei/hihealth/HiDeviceInfo;
    .locals 2

    .line 76
    new-instance v1, Lcom/huawei/hihealth/HiDeviceInfo;

    invoke-direct {v1}, Lcom/huawei/hihealth/HiDeviceInfo;-><init>()V

    .line 77
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceUniqueCode(Ljava/lang/String;)V

    .line 78
    const-string v0, "UNKNOWN"

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 81
    const/16 v0, 0x20

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceType(I)V

    .line 82
    const-string v0, "UNKNOWN"

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setFirmwareVersion(Ljava/lang/String;)V

    .line 83
    const-string v0, "UNKNOWN"

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setHardwareVersion(Ljava/lang/String;)V

    .line 85
    const-string v0, "UNKNOWN"

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setSoftwareVersion(Ljava/lang/String;)V

    .line 87
    return-object v1
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;)Lcom/huawei/hihealth/HiDeviceInfo;
    .locals 7

    .line 47
    new-instance v4, Lcom/huawei/hihealth/HiDeviceInfo;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDeviceInfo;-><init>()V

    .line 48
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;->getUniqueId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceUniqueCode(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;->getProductId()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceType(I)V

    .line 53
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setFirmwareVersion(Ljava/lang/String;)V

    .line 54
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;->getHardwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setHardwareVersion(Ljava/lang/String;)V

    .line 55
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;->getManufacturer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setManufacturer(Ljava/lang/String;)V

    .line 56
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;->getSoftwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setSoftwareVersion(Ljava/lang/String;)V

    .line 57
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;->getDeviceData()Ljava/lang/String;

    move-result-object v5

    .line 58
    invoke-static {v5}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 60
    :try_start_0
    const-class v0, Landroid/content/ContentValues;

    invoke-static {v5, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/content/ContentValues;

    .line 61
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 62
    const-string v0, "model"

    invoke-virtual {v6, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setModel(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    :cond_0
    goto :goto_0

    .line 64
    :catch_0
    move-exception v6

    .line 65
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHiDeviceInfo model is exception e="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;->getModifyTime()Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 70
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;->getModifyTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiDeviceInfo;->setModifyTime(J)V

    .line 72
    :cond_2
    return-object v4
.end method

.method public d(Landroid/content/Context;I)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;I)Ljava/util/List<Lcom/huawei/hihealth/HiDeviceInfo;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 149
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 150
    :cond_0
    move/from16 v0, p2

    invoke-static {p1, v0}, Lo/cuo;->b(Landroid/content/Context;I)Lo/crd;

    move-result-object v4

    .line 152
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 153
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBindPhoneDevice client is not exist!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    const/4 v0, 0x0

    return-object v0

    .line 157
    :cond_1
    invoke-virtual {v4}, Lo/crd;->i()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-nez v0, :cond_2

    .line 159
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBindPhoneDevice devicecode is 0, need bind device!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    invoke-virtual {p0, p1, v4}, Lo/cuj;->c(Landroid/content/Context;Lo/crd;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 162
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBindPhoneDevice binddevice fail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    const/4 v0, 0x0

    return-object v0

    .line 167
    :cond_2
    invoke-virtual {p0, p1, v4}, Lo/cuj;->e(Landroid/content/Context;Lo/crd;)Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;

    move-result-object v5

    .line 168
    const/4 v0, 0x0

    if-ne v0, v5, :cond_3

    .line 169
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "local phone device not found!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    const/4 v0, 0x0

    return-object v0

    .line 173
    :cond_3
    invoke-static {p1}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceRsp;

    move-result-object v6

    .line 174
    const/4 v0, 0x1

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 175
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBindPhoneDevice cloud return error= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceRsp;->getResultDesc()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    :cond_4
    new-instance v7, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;

    invoke-direct {v7}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;-><init>()V

    .line 179
    invoke-static {p1}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/czg;->e(Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;

    move-result-object v8

    .line 180
    const/4 v0, 0x1

    invoke-static {v8, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_5

    .line 181
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBindDeviceSync error="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;->getResultDesc()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    const/4 v0, 0x0

    return-object v0

    .line 185
    :cond_5
    invoke-virtual {v8}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;->getDeviceInfos()Ljava/util/List;

    move-result-object v9

    .line 186
    invoke-static {v9}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 187
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllBindDeviceRsp error,deviceInfos is null or empty ,deviceCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    const/4 v0, 0x0

    return-object v0

    .line 191
    :cond_6
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 192
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;

    .line 193
    const/4 v0, 0x0

    if-eq v0, v12, :cond_8

    .line 194
    invoke-virtual {v12}, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;->getProductId()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x20

    if-eq v1, v0, :cond_7

    .line 195
    goto :goto_0

    .line 197
    :cond_7
    invoke-virtual {p0, v12}, Lo/cuj;->d(Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v13

    .line 198
    invoke-interface {v10, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 200
    :cond_8
    goto :goto_0

    .line 201
    :cond_9
    return-object v10
.end method

.method public e(Landroid/content/Context;I)I
    .locals 12

    .line 205
    const/4 v4, 0x0

    .line 207
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lo/cuj;->d(Landroid/content/Context;I)Ljava/util/List;

    move-result-object v5

    .line 209
    invoke-static {v5}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 211
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get bind device from cloud return error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lo/csq; {:try_start_0 .. :try_end_0} :catch_0

    .line 212
    const/4 v0, -0x1

    return v0

    .line 214
    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 215
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiDeviceInfo;

    .line 216
    const/4 v0, 0x0

    if-eq v0, v9, :cond_2

    .line 217
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiDeviceInfo;->getModifyTime()J

    move-result-wide v10

    .line 219
    sub-long v0, v6, v10

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v2, v0

    if-lez v0, :cond_1

    sub-long v0, v6, v10

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-gez v0, :cond_1

    .line 220
    add-int/lit8 v4, v4, 0x1

    .line 223
    :cond_1
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiDeviceInfo;->getModel()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 224
    invoke-static {p1}, Lo/cqa;->a(Landroid/content/Context;)Lo/cqa;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/cqa;->d(Lcom/huawei/hihealth/HiDeviceInfo;)Z
    :try_end_1
    .catch Lo/csq; {:try_start_1 .. :try_end_1} :catch_0

    .line 227
    :cond_2
    goto :goto_0

    .line 232
    :cond_3
    goto :goto_1

    .line 228
    :catch_0
    move-exception v5

    .line 229
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBindPhoneDevice return error , e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/csq;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    const/4 v0, -0x1

    return v0

    .line 233
    :goto_1
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getbinddevice activity device num="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    return v4
.end method

.method public e(Landroid/content/Context;Lo/crd;)Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;
    .locals 10

    .line 91
    invoke-static {p1}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 92
    invoke-virtual {p2}, Lo/crd;->i()J

    move-result-wide v5

    .line 93
    invoke-static {p1}, Lo/cqa;->a(Landroid/content/Context;)Lo/cqa;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/cqa;->e(Ljava/lang/String;)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v7

    .line 94
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, v0, v5

    if-eqz v0, :cond_1

    .line 95
    new-instance v8, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;

    invoke-direct {v8}, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;-><init>()V

    .line 96
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->setDeviceCode(Ljava/lang/Long;)V

    .line 97
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiDeviceInfo;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->setFirmwareVersion(Ljava/lang/String;)V

    .line 98
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiDeviceInfo;->getHardwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->setHardwareVersion(Ljava/lang/String;)V

    .line 99
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiDeviceInfo;->getManufacturer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->setManufacturer(Ljava/lang/String;)V

    .line 100
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->setName(Ljava/lang/String;)V

    .line 101
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiDeviceInfo;->getSoftwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->setSoftwareVersion(Ljava/lang/String;)V

    .line 102
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiDeviceInfo;->getModel()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 103
    new-instance v9, Landroid/content/ContentValues;

    invoke-direct {v9}, Landroid/content/ContentValues;-><init>()V

    .line 104
    const-string v0, "model"

    invoke-virtual {v7}, Lcom/huawei/hihealth/HiDeviceInfo;->getModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    invoke-static {v9}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;->setDeviceData(Ljava/lang/String;)V

    .line 107
    :cond_0
    return-object v8

    .line 109
    :cond_1
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUpdateBindDeviceReq device or deviceCode is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    const/4 v0, 0x0

    return-object v0
.end method
