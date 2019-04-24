.class public Lo/ctm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ctj;


# instance fields
.field a:Lo/crf;

.field private b:I

.field private c:Lcom/huawei/hihealth/HiSyncOption;

.field private d:Lo/czg;

.field private e:Landroid/content/Context;

.field private f:J

.field private g:Lo/cqm;

.field private h:J

.field private i:D

.field private k:Lo/css;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SyncKey;>;"
        }
    .end annotation
.end field

.field private m:D

.field private n:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/huawei/hihealth/HiSyncOption;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HiSyncHealthData create"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ctm;->e:Landroid/content/Context;

    .line 72
    iput-object p2, p0, Lo/ctm;->c:Lcom/huawei/hihealth/HiSyncOption;

    .line 73
    iput p3, p0, Lo/ctm;->b:I

    .line 74
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncModel()I

    move-result v0

    iput v0, p0, Lo/ctm;->n:I

    .line 75
    invoke-direct {p0}, Lo/ctm;->e()V

    .line 76
    return-void
.end method

.method private b()V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 96
    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    iput-wide v0, p0, Lo/ctm;->m:D

    .line 97
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;-><init>()V

    .line 98
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->setQueryType(Ljava/lang/Integer;)V

    .line 99
    iget-object v0, p0, Lo/ctm;->c:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiSyncOption;->getSyncMethod()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->setDataType(Ljava/lang/Integer;)V

    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 101
    const/4 v0, 0x7

    invoke-static {v5, v6, v0}, Lo/cui;->d(JI)I

    move-result v7

    .line 102
    invoke-static {v5, v6}, Lo/cnk;->a(J)I

    move-result v8

    .line 103
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadDataByTime startDay is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " endDay is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    int-to-long v0, v7

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->setStartTime(Ljava/lang/Long;)V

    .line 105
    int-to-long v0, v8

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->setEndTime(Ljava/lang/Long;)V

    .line 106
    if-lt v7, v8, :cond_0

    return-void

    .line 107
    :cond_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    iput-wide v0, p0, Lo/ctm;->i:D

    .line 108
    iget-object v0, p0, Lo/ctm;->d:Lo/czg;

    invoke-virtual {v0, v4}, Lo/czg;->a(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;

    move-result-object v9

    .line 109
    if-nez v9, :cond_1

    .line 110
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadDataByTime pullDataByVersion nothing by time"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    return-void

    .line 113
    :cond_1
    invoke-virtual {v9}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;->getData()Ljava/util/Map;

    move-result-object v10

    .line 114
    if-eqz v10, :cond_2

    invoke-interface {v10}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 115
    :cond_2
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadDataByTime data is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    return-void

    .line 118
    :cond_3
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 119
    invoke-interface {v10}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_4
    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/util/List;

    .line 120
    if-eqz v13, :cond_4

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_0

    .line 121
    :cond_5
    invoke-interface {v11, v13}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 122
    goto :goto_0

    .line 123
    :cond_6
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    .line 124
    :cond_7
    invoke-direct {p0, v11}, Lo/ctm;->c(Ljava/util/List;)V

    .line 125
    return-void
.end method

.method private c(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;J)J
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 191
    invoke-direct {p0, p1}, Lo/ctm;->c(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;

    move-result-object v4

    .line 192
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 193
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downOneDataByVersionOnce getSportDataByVersionRsp is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    const-wide/16 v0, -0x1

    return-wide v0

    .line 196
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_1

    .line 197
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downOneDataByVersionOnce getHealthDataByVersionRsp result code is not 0, result is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    const-wide/16 v0, -0x1

    return-wide v0

    .line 200
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->getDetailInfos()Ljava/util/List;

    move-result-object v5

    .line 201
    if-eqz v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 202
    :cond_2
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downOneDataByVersionOnce healthDetails is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    const-wide/16 v0, -0x1

    return-wide v0

    .line 205
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->getVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    .line 206
    iget-wide v0, p0, Lo/ctm;->h:J

    cmp-long v0, v6, v0

    if-gtz v0, :cond_4

    .line 207
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downOneDataByVersionOnce downloadVersion "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " smaller than currentVersion "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/ctm;->h:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    const-wide/16 v0, -0x1

    return-wide v0

    .line 210
    :cond_4
    iget-wide v0, p0, Lo/ctm;->h:J

    sub-long v0, v6, v0

    long-to-double v0, v0

    iget-wide v2, p0, Lo/ctm;->f:J

    sub-long v2, p2, v2

    long-to-double v2, v2

    div-double/2addr v0, v2

    iput-wide v0, p0, Lo/ctm;->i:D

    .line 211
    iput-wide v6, p0, Lo/ctm;->h:J

    .line 212
    invoke-direct {p0, v5}, Lo/ctm;->c(Ljava/util/List;)V

    .line 213
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->getCurrentVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method private c(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;
    .locals 1

    .line 87
    iget-object v0, p0, Lo/ctm;->d:Lo/czg;

    invoke-virtual {v0, p1}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;

    move-result-object v0

    return-object v0
.end method

.method private c()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 91
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAllData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    iget-object v0, p0, Lo/ctm;->l:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;

    invoke-direct {p0, v0}, Lo/ctm;->c(Lcom/huawei/hwcloudmodel/model/unite/SyncKey;)V

    .line 93
    return-void
.end method

.method private c(Lcom/huawei/hwcloudmodel/model/unite/SyncKey;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 128
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x2711

    if-eq v0, v1, :cond_1

    .line 129
    :cond_0
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneData the key is not right"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    return-void

    .line 132
    :cond_1
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncOneDeviceByVersion key = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getDeviceCode()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 135
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    .line 137
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-gtz v0, :cond_2

    .line 138
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneData the maxVersion is not right , maxVersion is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    return-void

    .line 142
    :cond_2
    iget-object v0, p0, Lo/ctm;->g:Lo/cqm;

    iget v1, p0, Lo/ctm;->b:I

    iget-object v2, p0, Lo/ctm;->c:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v2

    invoke-virtual {v0, v1, v4, v5, v2}, Lo/cqm;->a(IJI)Lo/cnz;

    move-result-object v8

    .line 144
    new-instance v9, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;

    invoke-direct {v9}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;-><init>()V

    .line 145
    iget-object v0, p0, Lo/ctm;->c:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiSyncOption;->getSyncMethod()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->setDataType(Ljava/lang/Integer;)V

    .line 146
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->setDeviceCode(Ljava/lang/Long;)V

    .line 150
    const/4 v0, 0x0

    if-ne v0, v8, :cond_3

    .line 151
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->setVersion(Ljava/lang/Long;)V

    .line 152
    invoke-direct {p0}, Lo/ctm;->b()V

    .line 153
    invoke-direct {p0, v9, v6, v7}, Lo/ctm;->e(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;J)V

    goto :goto_0

    .line 154
    :cond_3
    invoke-virtual {v8}, Lo/cnz;->c()J

    move-result-wide v0

    cmp-long v0, v0, v6

    if-gez v0, :cond_4

    .line 155
    invoke-virtual {v8}, Lo/cnz;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->setVersion(Ljava/lang/Long;)V

    .line 156
    invoke-direct {p0, v9, v6, v7}, Lo/ctm;->e(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;J)V

    goto :goto_0

    .line 158
    :cond_4
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "do not need pullDataByVersion data,DBversion is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lo/cnz;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    :goto_0
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 11
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 217
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v7

    .line 218
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;

    .line 219
    iget-object v0, p0, Lo/ctm;->e:Landroid/content/Context;

    int-to-double v1, v7

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    div-double v1, v3, v1

    iget-wide v3, p0, Lo/ctm;->i:D

    iget-wide v5, p0, Lo/ctm;->m:D

    invoke-static/range {v0 .. v6}, Lo/cuh;->a(Landroid/content/Context;DDD)V

    .line 220
    if-nez v9, :cond_1

    .line 221
    goto :goto_0

    .line 223
    :cond_1
    iget-object v0, p0, Lo/ctm;->k:Lo/css;

    iget v1, p0, Lo/ctm;->b:I

    invoke-virtual {v0, v9, v1}, Lo/css;->c(Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;I)Ljava/util/List;

    move-result-object v10

    .line 224
    const/4 v0, 0x0

    if-eq v0, v10, :cond_0

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 225
    goto :goto_0

    .line 227
    :cond_2
    iget-object v0, p0, Lo/ctm;->a:Lo/crf;

    iget v1, p0, Lo/ctm;->b:I

    invoke-virtual {v0, v10, v1}, Lo/crf;->a(Ljava/util/List;I)I

    .line 228
    goto :goto_0

    .line 229
    :cond_3
    return-void
.end method

.method private e()V
    .locals 2

    .line 79
    iget-object v0, p0, Lo/ctm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lo/ctm;->d:Lo/czg;

    .line 80
    new-instance v0, Lo/css;

    iget-object v1, p0, Lo/ctm;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/css;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ctm;->k:Lo/css;

    .line 81
    iget-object v0, p0, Lo/ctm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqm;->e(Landroid/content/Context;)Lo/cqm;

    move-result-object v0

    iput-object v0, p0, Lo/ctm;->g:Lo/cqm;

    .line 82
    iget-object v0, p0, Lo/ctm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    iput-object v0, p0, Lo/ctm;->a:Lo/crf;

    .line 84
    return-void
.end method

.method private e(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;J)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 163
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downOneDataByVersionAll GetSportDataByVersionReq = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " maxVersion = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->getVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lo/ctm;->f:J

    .line 165
    iget-wide v0, p0, Lo/ctm;->f:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 166
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ctm;->f:J

    .line 168
    :cond_0
    iget-wide v0, p0, Lo/ctm;->f:J

    iput-wide v0, p0, Lo/ctm;->h:J

    .line 170
    const/4 v9, 0x0

    .line 172
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lo/ctm;->c(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;J)J

    move-result-wide v7

    .line 173
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downOneDataByVersionAll downCurrentVersion = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " maxVersion = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    add-int/lit8 v9, v9, 0x1

    .line 175
    const-wide/16 v0, -0x1

    cmp-long v0, v7, v0

    if-gtz v0, :cond_2

    .line 176
    return-void

    .line 178
    :cond_2
    iget-object v0, p0, Lo/ctm;->g:Lo/cqm;

    iget v1, p0, Lo/ctm;->b:I

    iget-object v2, p0, Lo/ctm;->c:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v2

    move-wide v3, v7

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->getDeviceCode()Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual/range {v0 .. v6}, Lo/cqm;->b(IIJJ)Z

    move-result v0

    if-nez v0, :cond_3

    .line 179
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downOneDataByVersionAll saveVersionToDB failed "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    :cond_3
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->setVersion(Ljava/lang/Long;)V

    .line 182
    const/16 v0, 0x14

    if-lt v9, v0, :cond_4

    .line 183
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downOneDataByVersionAll pullDataByVersion too many times."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    return-void

    .line 187
    :cond_4
    iget v0, p0, Lo/ctm;->n:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    cmp-long v0, v7, p2

    if-ltz v0, :cond_1

    .line 188
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 276
    iget-object v0, p0, Lo/ctm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ctp;->b(Landroid/content/Context;)Lo/ctp;

    move-result-object v0

    iget v1, p0, Lo/ctm;->b:I

    iget-object v2, p0, Lo/ctm;->k:Lo/css;

    invoke-virtual {v0, v1, v2}, Lo/ctp;->a(ILo/css;)V

    .line 277
    return-void
.end method

.method public d()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 233
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    const-string v0, "SYNC_HEALTH_DATA_DOWNLOAD_PERCENT_MAX_ALL"

    const-wide/high16 v1, 0x4037000000000000L    # 23.0

    invoke-static {v1, v2, v0}, Lo/cuh;->a(DLjava/lang/String;)V

    .line 237
    iget-object v0, p0, Lo/ctm;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/ctm;->c:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncMethod()I

    move-result v1

    iget-object v2, p0, Lo/ctm;->c:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v2

    invoke-static {v0, v1, v2}, Lo/cui;->d(Landroid/content/Context;II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/ctm;->l:Ljava/util/List;

    .line 239
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() type versions is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ctm;->l:Ljava/util/List;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    iget-object v0, p0, Lo/ctm;->l:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ctm;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 241
    :cond_0
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() end ! type versions is null,stop pullDataByVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    return-void

    .line 244
    :cond_1
    invoke-direct {p0}, Lo/ctm;->c()V

    .line 245
    iget-object v0, p0, Lo/ctm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuh;->b(Landroid/content/Context;)V

    .line 246
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 281
    new-instance v1, Ljava/lang/StringBuffer;

    const-string v0, "--HiSyncHealthData{"

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 282
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 283
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
