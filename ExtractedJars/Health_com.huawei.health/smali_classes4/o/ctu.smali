.class public Lo/ctu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ctj;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ctu$c;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Lo/czg;

.field private c:Lcom/huawei/hihealth/HiSyncOption;

.field private d:Landroid/content/Context;

.field private e:Lo/cqm;

.field private f:I

.field private g:Lcom/huawei/hihealth/HiDataReadOption;

.field private k:Lo/cta;


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

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HiSyncSportStat create"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ctu;->d:Landroid/content/Context;

    .line 67
    iput-object p2, p0, Lo/ctu;->c:Lcom/huawei/hihealth/HiSyncOption;

    .line 68
    iput p3, p0, Lo/ctu;->a:I

    .line 69
    invoke-direct {p0}, Lo/ctu;->b()V

    .line 70
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/SportTotalData;>;)V"
        }
    .end annotation

    .line 147
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSportTotalToDB sportsStat size="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    invoke-direct {p0, p1}, Lo/ctu;->d(Ljava/util/List;)V

    .line 149
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSportTotalToDB check after sportsStat size="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcloudmodel/model/SportTotalData;

    .line 151
    invoke-direct {p0, v5}, Lo/ctu;->e(Lcom/huawei/hwcloudmodel/model/SportTotalData;)V

    .line 152
    goto :goto_0

    .line 153
    :cond_0
    return-void
.end method

.method private b()V
    .locals 2

    .line 73
    iget-object v0, p0, Lo/ctu;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lo/ctu;->b:Lo/czg;

    .line 74
    new-instance v0, Lo/cta;

    iget-object v1, p0, Lo/ctu;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/cta;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ctu;->k:Lo/cta;

    .line 75
    iget-object v0, p0, Lo/ctu;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cqm;->e(Landroid/content/Context;)Lo/cqm;

    move-result-object v0

    iput-object v0, p0, Lo/ctu;->e:Lo/cqm;

    .line 76
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    iput v0, p0, Lo/ctu;->f:I

    .line 77
    invoke-direct {p0}, Lo/ctu;->c()Lcom/huawei/hihealth/HiDataReadOption;

    move-result-object v0

    iput-object v0, p0, Lo/ctu;->g:Lcom/huawei/hihealth/HiDataReadOption;

    .line 78
    return-void
.end method

.method private b(Landroid/util/SparseArray;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 104
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 105
    :cond_0
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAllStatByTime() downloadDaysMap is null,stop pullDataByVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    return-void

    .line 108
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lo/ctu$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lo/ctu$c;-><init>(Lo/ctu;Landroid/util/SparseArray;Lo/ctu$3;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 109
    return-void
.end method

.method private b(Landroid/util/SparseArray;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/lang/Integer;>;Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 81
    if-eqz p2, :cond_0

    .line 82
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAllStat too much need to download ,start a thread ! downloadDaysMap is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    invoke-direct {p0, p1}, Lo/ctu;->b(Landroid/util/SparseArray;)V

    goto :goto_0

    .line 85
    :cond_0
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAllStat do not need to start a thread ! downloadDaysMap is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    invoke-direct {p0, p1}, Lo/ctu;->e(Landroid/util/SparseArray;)V

    .line 88
    iget-object v0, p0, Lo/ctu;->d:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cnt;->a(Landroid/content/Context;I)V

    .line 89
    iget-object v0, p0, Lo/ctu;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->k(Landroid/content/Context;)V

    .line 90
    invoke-static {}, Lo/cun;->e()Lo/cun;

    move-result-object v0

    const-string v1, "HiSyncTotalSportStat"

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/cun;->d(ILjava/lang/String;Lo/crd;)V

    .line 92
    :goto_0
    return-void
.end method

.method private c()Lcom/huawei/hihealth/HiDataReadOption;
    .locals 5

    .line 232
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 233
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 234
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "deviceStat"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 235
    invoke-virtual {v2, v4}, Lcom/huawei/hihealth/HiDataReadOption;->setConstantsKey([Ljava/lang/String;)V

    .line 236
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 237
    return-object v2

    :array_0
    .array-data 4
        0x385
    .end array-data
.end method

.method private c(Landroid/util/SparseArray;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 112
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v7

    .line 113
    add-int/lit8 v8, v7, -0x1

    :goto_0
    if-ltz v8, :cond_0

    .line 114
    invoke-virtual {p1, v8}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v9

    .line 115
    invoke-virtual {p1, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v10

    .line 116
    invoke-direct {p0, v9, v10}, Lo/ctu;->d(II)V

    .line 117
    iget-object v0, p0, Lo/ctu;->d:Landroid/content/Context;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    invoke-static/range {v0 .. v6}, Lo/cuh;->a(Landroid/content/Context;DDD)V

    .line 113
    add-int/lit8 v8, v8, -0x1

    goto :goto_0

    .line 119
    :cond_0
    return-void
.end method

.method private d(II)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 122
    if-gt p1, p2, :cond_0

    if-gtz p1, :cond_1

    .line 123
    :cond_0
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneStatByTime the time is not right"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    return-void

    .line 126
    :cond_1
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneStatByTime startTime is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " , endTime is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    new-instance v6, Lcom/huawei/hwcloudmodel/model/unite/GetSportStatReq;

    invoke-direct {v6}, Lcom/huawei/hwcloudmodel/model/unite/GetSportStatReq;-><init>()V

    .line 129
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportStatReq;->setStartTime(Ljava/lang/Integer;)V

    .line 130
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportStatReq;->setEndTime(Ljava/lang/Integer;)V

    .line 132
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportStatReq;->setDataSource(Ljava/lang/Integer;)V

    .line 133
    iget-object v0, p0, Lo/ctu;->b:Lo/czg;

    invoke-virtual {v0, v6}, Lo/czg;->a(Lcom/huawei/hwcloudmodel/model/unite/GetSportStatReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportStatRsp;

    move-result-object v7

    .line 134
    const/4 v0, 0x0

    invoke-static {v7, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 135
    return-void

    .line 137
    :cond_2
    iget-object v0, p0, Lo/ctu;->e:Lo/cqm;

    iget v1, p0, Lo/ctu;->a:I

    iget-object v2, p0, Lo/ctu;->c:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v2

    move v3, p2

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cqm;->e(IIIJ)Z

    .line 138
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/unite/GetSportStatRsp;->getSportStat()Ljava/util/List;

    move-result-object v8

    .line 139
    invoke-static {v8}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 140
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneStatByTime sportsStat is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    return-void

    .line 143
    :cond_3
    invoke-direct {p0, v8}, Lo/ctu;->a(Ljava/util/List;)V

    .line 144
    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/SportTotalData;>;)V"
        }
    .end annotation

    .line 156
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 157
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 158
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcloudmodel/model/SportTotalData;

    .line 159
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 160
    goto :goto_0

    .line 162
    :cond_0
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_1

    .line 163
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSportTotalToDB the sport stat type is not right ,type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportType()Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    goto :goto_0

    .line 166
    :cond_1
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getDeviceCode()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-eqz v0, :cond_2

    .line 167
    goto :goto_0

    .line 169
    :cond_2
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getDataSource()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 170
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 172
    :cond_3
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    :goto_1
    goto :goto_0

    .line 176
    :cond_4
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcloudmodel/model/SportTotalData;

    .line 177
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcloudmodel/model/SportTotalData;

    .line 178
    invoke-virtual {v9}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getRecordDay()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getRecordDay()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 180
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSportTotalToDB app and cloud has same day stat, day= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getRecordDay()Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    invoke-interface {p1, v7}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 182
    goto :goto_4

    .line 184
    :cond_5
    goto :goto_3

    .line 185
    :cond_6
    :goto_4
    goto :goto_2

    .line 186
    :cond_7
    return-void
.end method

.method static synthetic d(Lo/ctu;Landroid/util/SparseArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 42
    invoke-direct {p0, p1}, Lo/ctu;->c(Landroid/util/SparseArray;)V

    return-void
.end method

.method private e(Landroid/util/SparseArray;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 95
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAllStatByTimeSync downloadDaysMap is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 97
    :cond_0
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAllStatByTimeSync() downloadDaysMap is null,stop pullStat"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    return-void

    .line 100
    :cond_1
    invoke-direct {p0, p1}, Lo/ctu;->c(Landroid/util/SparseArray;)V

    .line 101
    return-void
.end method

.method private e(Lcom/huawei/hwcloudmodel/model/SportTotalData;)V
    .locals 5

    .line 189
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveStatToDB cloudSportTotalStat is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    iget-object v0, p0, Lo/ctu;->k:Lo/cta;

    iget v1, p0, Lo/ctu;->a:I

    invoke-virtual {v0, p1, v1}, Lo/cta;->b(Lcom/huawei/hwcloudmodel/model/SportTotalData;I)Ljava/util/List;

    move-result-object v4

    .line 191
    invoke-static {v4}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 192
    return-void

    .line 194
    :cond_0
    iget-object v0, p0, Lo/ctu;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/crf;->b(Ljava/util/List;)I

    .line 195
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 228
    iget-object v0, p0, Lo/ctu;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/ctt;->e(Landroid/content/Context;)Lo/ctt;

    move-result-object v0

    iget v1, p0, Lo/ctu;->a:I

    iget-object v2, p0, Lo/ctu;->g:Lcom/huawei/hihealth/HiDataReadOption;

    iget-object v3, p0, Lo/ctu;->c:Lcom/huawei/hihealth/HiSyncOption;

    iget-object v4, p0, Lo/ctu;->k:Lo/cta;

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ctt;->d(ILcom/huawei/hihealth/HiDataReadOption;Lcom/huawei/hihealth/HiSyncOption;Lo/cta;)V

    .line 229
    return-void
.end method

.method public d()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 199
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    const-string v0, "SYNC_SPORT_STAT_DOWNLOAD_PERCENT_MAX"

    const-wide/high16 v1, 0x4014000000000000L    # 5.0

    invoke-static {v1, v2, v0}, Lo/cuh;->a(DLjava/lang/String;)V

    .line 201
    iget v0, p0, Lo/ctu;->f:I

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide v4

    .line 204
    invoke-static {}, Lo/cui;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() first sync pull all stat!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    const/4 v7, 0x1

    .line 208
    const-wide v0, 0x1434998fe80L

    const/16 v2, 0x5a

    invoke-static {v0, v1, v4, v5, v2}, Lo/cui;->e(JJI)Landroid/util/SparseArray;

    move-result-object v6

    goto :goto_0

    .line 211
    :cond_0
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() only pullDataByVersion recent stat!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    const/4 v7, 0x0

    .line 213
    const-wide/32 v0, 0x337f9800

    sub-long v0, v4, v0

    const/16 v2, 0x5a

    invoke-static {v0, v1, v4, v5, v2}, Lo/cui;->e(JJI)Landroid/util/SparseArray;

    move-result-object v6

    .line 216
    :goto_0
    invoke-direct {p0, v6, v7}, Lo/ctu;->b(Landroid/util/SparseArray;Z)V

    .line 217
    iget-object v0, p0, Lo/ctu;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cuh;->b(Landroid/content/Context;)V

    .line 218
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() end!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    return-void
.end method

.method public d(JJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 223
    const/16 v0, 0x5a

    invoke-static {p1, p2, p3, p4, v0}, Lo/cui;->e(JJI)Landroid/util/SparseArray;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ctu;->b(Landroid/util/SparseArray;Z)V

    .line 224
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 266
    new-instance v1, Ljava/lang/StringBuffer;

    const-string v0, "--HiSyncTotalSportStat{"

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 267
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 268
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
