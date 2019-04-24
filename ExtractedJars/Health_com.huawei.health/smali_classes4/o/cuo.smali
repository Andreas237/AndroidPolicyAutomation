.class Lo/cuo;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(Landroid/content/Context;)V
    .locals 8

    .line 169
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    return-void

    .line 170
    :cond_0
    invoke-static {p0}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 171
    invoke-static {p0}, Lo/cqa;->a(Landroid/content/Context;)Lo/cqa;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/cqa;->e(Ljava/lang/String;)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v5

    .line 172
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 173
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateLocalPhoneModel device "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, "is not exist!"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    return-void

    .line 176
    :cond_1
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 177
    invoke-static {p0}, Lo/cpo;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    .line 178
    const-string v0, "model"

    invoke-virtual {v6, v0, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    invoke-static {p0}, Lo/cqa;->a(Landroid/content/Context;)Lo/cqa;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceID()I

    move-result v1

    invoke-virtual {v0, v1, v6}, Lo/cqa;->a(ILandroid/content/ContentValues;)I

    .line 180
    return-void
.end method

.method static a(Landroid/content/Context;I)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 124
    invoke-static {p0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cpw;->k(I)Ljava/util/List;

    move-result-object v4

    .line 125
    invoke-static {v4}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    return-void

    .line 129
    :cond_0
    new-instance v5, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;-><init>()V

    .line 130
    invoke-static {p0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/czg;->e(Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;

    move-result-object v6

    .line 131
    const/4 v0, 0x1

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 132
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reBindUnknowDevice error="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;->getResultDesc()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    return-void

    .line 136
    :cond_1
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;->getDeviceInfos()Ljava/util/List;

    move-result-object v7

    .line 137
    invoke-static {v7}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 138
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reBindUnknowDevice cloud deviceInfos is null or empty, need rebind all device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/crd;

    .line 141
    invoke-static {p0, v9}, Lo/cuo;->c(Landroid/content/Context;Lo/crd;)V

    .line 142
    invoke-static {p0, v9}, Lo/cuo;->e(Landroid/content/Context;Lo/crd;)Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;

    move-result-object v10

    .line 143
    const/4 v0, 0x0

    if-eq v0, v10, :cond_2

    .line 144
    invoke-static {p0, v9, v10}, Lo/cuo;->a(Landroid/content/Context;Lo/crd;Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;)V

    .line 146
    :cond_2
    goto :goto_0

    .line 147
    :cond_3
    return-void

    .line 150
    :cond_4
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/crd;

    .line 151
    const/4 v10, 0x1

    .line 152
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;

    .line 153
    invoke-virtual {v9}, Lo/crd;->i()J

    move-result-wide v0

    invoke-virtual {v12}, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;->getDeviceCode()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_5

    .line 154
    const/4 v10, 0x0

    .line 155
    goto :goto_3

    .line 157
    :cond_5
    goto :goto_2

    .line 158
    :cond_6
    :goto_3
    if-eqz v10, :cond_7

    .line 159
    invoke-static {p0, v9}, Lo/cuo;->c(Landroid/content/Context;Lo/crd;)V

    .line 160
    invoke-static {p0, v9}, Lo/cuo;->e(Landroid/content/Context;Lo/crd;)Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;

    move-result-object v11

    .line 161
    const/4 v0, 0x0

    if-eq v0, v11, :cond_7

    .line 162
    invoke-static {p0, v9, v11}, Lo/cuo;->a(Landroid/content/Context;Lo/crd;Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;)V

    .line 165
    :cond_7
    goto :goto_1

    .line 166
    :cond_8
    return-void
.end method

.method static a(Landroid/content/Context;Lo/crd;Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 69
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reBindUnknowDevice bindDevice start bindDevice , device name is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " product is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->getProductId()Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    invoke-static {p0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/czg;->e(Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;

    move-result-object v4

    .line 71
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 72
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reBindUnknowDevice bindDevice error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    return-void

    .line 75
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;->getDeviceCode()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 76
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-gtz v0, :cond_1

    .line 77
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reBindUnknowDevice bindDevice error ans from cloud, deviceCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " client is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    return-void

    .line 80
    :cond_1
    invoke-virtual {p1, v5, v6}, Lo/crd;->c(J)V

    .line 81
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/crd;->c(I)V

    .line 82
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/crd;->f(I)V

    .line 83
    invoke-static {p0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cpw;->e(Lo/crd;)J

    .line 84
    return-void
.end method

.method private static a(I)Z
    .locals 1

    .line 120
    const/16 v0, 0x15

    if-le v0, p0, :cond_0

    const/4 v0, 0x1

    if-eq v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static b(Landroid/content/Context;I)Lo/crd;
    .locals 7

    .line 43
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 44
    :cond_0
    invoke-static {p0}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 45
    invoke-static {p0}, Lo/cqa;->a(Landroid/content/Context;)Lo/cqa;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/cqa;->e(Ljava/lang/String;)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v5

    .line 46
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 47
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBindPhoneDevice device "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, "is not exist!"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    const/4 v0, 0x0

    return-object v0

    .line 50
    :cond_1
    invoke-static {p0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v0

    const-string v1, "com.huawei.health"

    invoke-virtual {v0, v1}, Lo/cpu;->a(Ljava/lang/String;)I

    move-result v6

    .line 51
    const/4 v0, 0x0

    if-lt v0, v6, :cond_2

    .line 52
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBindPhoneDevice appID "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "is not exist!"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    const/4 v0, 0x0

    return-object v0

    .line 55
    :cond_2
    invoke-static {p0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceID()I

    move-result v1

    invoke-virtual {v0, p1, v6, v1}, Lo/cpw;->d(III)Lo/crd;

    move-result-object v0

    return-object v0
.end method

.method static c(Landroid/content/Context;Lo/crd;)V
    .locals 2

    .line 59
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 60
    return-void

    .line 62
    :cond_0
    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lo/crd;->c(J)V

    .line 63
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/crd;->c(I)V

    .line 64
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/crd;->f(I)V

    .line 65
    invoke-static {p0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cpw;->e(Lo/crd;)J

    .line 66
    return-void
.end method

.method static e(Landroid/content/Context;Lo/crd;)Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;
    .locals 7

    .line 87
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 88
    :cond_0
    invoke-static {p0}, Lo/cqa;->a(Landroid/content/Context;)Lo/cqa;

    move-result-object v0

    invoke-virtual {p1}, Lo/crd;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cqa;->d(I)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v4

    .line 89
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 90
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reBindUnknowDevice createBindDeviceReq get no hiDeviceInfo from DB"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    const/4 v0, 0x0

    return-object v0

    .line 93
    :cond_1
    new-instance v5, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;-><init>()V

    .line 96
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceType()I

    move-result v0

    invoke-static {v0}, Lo/cuo;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 97
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reBindUnknowDevice createBindDeviceReq device productid is error, productid="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    const/4 v0, 0x0

    return-object v0

    .line 100
    :cond_2
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getModel()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 101
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 102
    const-string v0, "model"

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    invoke-static {v6}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setDeviceData(Ljava/lang/String;)V

    .line 105
    :cond_3
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceType()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setProductId(Ljava/lang/Integer;)V

    .line 106
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setUniqueId(Ljava/lang/String;)V

    .line 107
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setName(Ljava/lang/String;)V

    .line 108
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setFirmwareVersion(Ljava/lang/String;)V

    .line 109
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getHardwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setHardwareVersion(Ljava/lang/String;)V

    .line 110
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getSoftwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setSoftwareVersion(Ljava/lang/String;)V

    .line 111
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getManufacturer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setManufacturer(Ljava/lang/String;)V

    .line 113
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 114
    const-string v0, "HiH_HiSyncUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reBindUnknowDevice binddevice deviceUUID is null !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    :cond_4
    return-object v5
.end method
