.class public Lo/cug;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Landroid/content/Context;II)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;II)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SyncKey;>;"
        }
    .end annotation

    .line 62
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 63
    :cond_0
    new-instance v2, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;

    invoke-direct {v2}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;-><init>()V

    .line 64
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->setDataType(Ljava/lang/Integer;)V

    .line 65
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->setType(Ljava/lang/Integer;)V

    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->setVersion(Ljava/lang/Long;)V

    .line 67
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->setDeviceCode(Ljava/lang/Long;)V

    .line 68
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 69
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    return-object v3
.end method

.method static a(Landroid/content/Context;ILjava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;ILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SyncKey;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 150
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 151
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 152
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Integer;

    .line 153
    new-instance v7, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;

    invoke-direct {v7}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;-><init>()V

    .line 154
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->setDataType(Ljava/lang/Integer;)V

    .line 155
    invoke-virtual {v7, v6}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->setType(Ljava/lang/Integer;)V

    .line 156
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 157
    goto :goto_0

    .line 158
    :cond_2
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsReq;-><init>()V

    .line 159
    invoke-virtual {v5, v4}, Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsReq;->setSyncKeys(Ljava/util/List;)V

    .line 161
    invoke-static {p0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/czg;->b(Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsRsp;

    move-result-object v6

    .line 162
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getVersionByType Rsp is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    const/4 v0, 0x1

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    .line 164
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsRsp;->getVersions()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static c(Landroid/content/Context;J)Lcom/huawei/hihealth/HiDeviceInfo;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 78
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 79
    :cond_1
    new-instance v4, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;-><init>()V

    .line 80
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;->setDeviceCode(Ljava/lang/Long;)V

    .line 82
    invoke-static {p0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/czg;->c(Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;

    move-result-object v5

    .line 83
    const/4 v0, 0x1

    invoke-static {v5, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 84
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOneBindDevice error,no device get from cloud ,deviceCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    invoke-static {}, Lo/cuj;->a()Lo/cuj;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/cuj;->d(J)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v0

    return-object v0

    .line 88
    :cond_2
    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;->getDeviceInfos()Ljava/util/List;

    move-result-object v6

    .line 89
    if-eqz v6, :cond_3

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 90
    :cond_3
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOneBindDevice error,deviceInfos is null or empty ,deviceCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    invoke-static {}, Lo/cuj;->a()Lo/cuj;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/cuj;->d(J)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v0

    return-object v0

    .line 94
    :cond_4
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;

    .line 95
    const/4 v0, 0x0

    if-ne v0, v7, :cond_5

    .line 96
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOneBindDevice error,deviceInfo is null  ,deviceCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    invoke-static {}, Lo/cuj;->a()Lo/cuj;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/cuj;->d(J)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v0

    return-object v0

    .line 100
    :cond_5
    invoke-static {}, Lo/cuj;->a()Lo/cuj;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/cuj;->d(Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method static e(JJI)Landroid/util/SparseArray;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJI)Landroid/util/SparseArray<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 107
    cmp-long v0, p0, p2

    if-gtz v0, :cond_0

    const-wide v0, 0x1434998fe80L

    cmp-long v0, p0, v0

    if-ltz v0, :cond_0

    move/from16 v0, p4

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    .line 108
    :cond_0
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "divideDate error input startTime is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " , endTime is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " , range is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    const/4 v0, 0x0

    return-object v0

    .line 111
    :cond_1
    invoke-static {p0, p1}, Lo/cnk;->a(J)I

    move-result v4

    .line 112
    const v0, 0x1335045

    if-ge v4, v0, :cond_2

    .line 113
    const v0, 0x1335045

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide p0

    .line 115
    :cond_2
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 116
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 117
    invoke-virtual {v5, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 118
    invoke-virtual {v6, p2, p3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 119
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 120
    new-instance v8, Landroid/util/SparseArray;

    invoke-direct {v8}, Landroid/util/SparseArray;-><init>()V

    .line 125
    :goto_0
    :try_start_0
    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 126
    const/4 v0, 0x5

    move/from16 v1, p4

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 127
    invoke-virtual {v5, v6}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 128
    move/from16 v0, p4

    neg-int v0, v0

    const/4 v1, 0x5

    invoke-virtual {v5, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 129
    goto :goto_1

    .line 131
    :cond_3
    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 132
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 133
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v8, v0, v10}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    .line 135
    :goto_1
    invoke-virtual {v6}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 136
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v8, v0, v10}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    goto :goto_2

    .line 138
    :catch_0
    move-exception v11

    .line 139
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "divideDate date change error is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    const/4 v0, 0x0

    return-object v0

    .line 142
    :goto_2
    return-object v8
.end method
