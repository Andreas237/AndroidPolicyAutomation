.class public Lo/cti;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ctj;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cti$e;
    }
.end annotation


# instance fields
.field private a:Lo/czg;

.field private b:Landroid/content/Context;

.field private c:I

.field private d:I

.field private e:Lcom/huawei/hihealth/HiSyncOption;

.field private f:Lo/cpw;

.field private g:I

.field private h:Lo/cta;

.field private i:I

.field private k:Lo/cqm;

.field private o:Z


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

    .line 53
    const/4 v0, 0x0

    iput v0, p0, Lo/cti;->c:I

    .line 63
    const/4 v0, 0x0

    iput v0, p0, Lo/cti;->g:I

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cti;->o:Z

    .line 70
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HiSyncSportStat create"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/cti;->b:Landroid/content/Context;

    .line 72
    iput-object p2, p0, Lo/cti;->e:Lcom/huawei/hihealth/HiSyncOption;

    .line 73
    iput p3, p0, Lo/cti;->d:I

    .line 74
    invoke-direct {p0}, Lo/cti;->c()V

    .line 75
    invoke-static {}, Lo/cui;->d()Z

    move-result v0

    iput-boolean v0, p0, Lo/cti;->o:Z

    .line 76
    return-void
.end method

.method private a(Landroid/util/SparseArray;)V
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

    .line 101
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAllStatByTimeSync downloadDaysMap is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 103
    :cond_0
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAllStatByTimeSync() downloadDaysMap is null, stop pullStat!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    return-void

    .line 106
    :cond_1
    invoke-direct {p0, p1}, Lo/cti;->d(Landroid/util/SparseArray;)V

    .line 107
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/SportTotalData;>;)V"
        }
    .end annotation

    .line 151
    iget-object v0, p0, Lo/cti;->h:Lo/cta;

    invoke-virtual {v0, p1}, Lo/cta;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 152
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hwcloudmodel/model/SportTotalData;

    .line 153
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 154
    goto :goto_0

    .line 156
    :cond_0
    invoke-direct {p0, v3}, Lo/cti;->d(Lcom/huawei/hwcloudmodel/model/SportTotalData;)V

    .line 157
    goto :goto_0

    .line 158
    :cond_1
    return-void
.end method

.method private b(Landroid/util/SparseArray;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 110
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 111
    :cond_0
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAllStatByTime() downloadDaysMap is null, stop pullDataByVersion!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    return-void

    .line 114
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lo/cti$e;

    invoke-direct {v1, p0, p1}, Lo/cti$e;-><init>(Lo/cti;Landroid/util/SparseArray;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 115
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 116
    return-void
.end method

.method private b(Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 170
    iget-boolean v0, p0, Lo/cti;->o:Z

    if-nez v0, :cond_0

    .line 171
    iget v0, p0, Lo/cti;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cti;->g:I

    iget-object v1, p0, Lo/cti;->e:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v1

    invoke-static {v0, v1}, Lo/cui;->a(II)V

    goto :goto_0

    .line 173
    :cond_0
    iget v0, p0, Lo/cti;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cti;->g:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    .line 174
    iget v0, p0, Lo/cti;->c:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/cti;->c:I

    .line 175
    const/4 v0, 0x0

    return v0

    .line 178
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/cti;->h:Lo/cta;

    invoke-virtual {v0, p1}, Lo/cta;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 179
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 180
    iget v0, p0, Lo/cti;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cti;->c:I

    .line 181
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDimenSportStat sportTotals is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    const/4 v0, 0x0

    return v0

    .line 184
    :cond_2
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;-><init>()V

    .line 185
    invoke-virtual {v5, v4}, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;->setTotalInfo(Ljava/util/List;)V

    .line 186
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;->setTimeZone(Ljava/lang/String;)V

    .line 188
    :goto_1
    iget v0, p0, Lo/cti;->c:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_4

    .line 189
    iget-object v0, p0, Lo/cti;->a:Lo/czg;

    invoke-virtual {v0, v5}, Lo/czg;->b(Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;)Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalRsp;

    move-result-object v6

    .line 191
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 192
    iget v0, p0, Lo/cti;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cti;->c:I

    .line 193
    goto :goto_1

    .line 195
    :cond_3
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDimenSportStat success ! uploadCount is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/cti;->g:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",stat is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    const/4 v0, 0x1

    return v0

    .line 198
    :cond_4
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDimenSportStat failed ! uploadCount is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/cti;->g:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    const/4 v0, 0x0

    return v0
.end method

.method private c()V
    .locals 2

    .line 79
    iget-object v0, p0, Lo/cti;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lo/cti;->a:Lo/czg;

    .line 80
    new-instance v0, Lo/cta;

    iget-object v1, p0, Lo/cti;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/cta;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/cti;->h:Lo/cta;

    .line 81
    iget-object v0, p0, Lo/cti;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    iput-object v0, p0, Lo/cti;->f:Lo/cpw;

    .line 82
    iget-object v0, p0, Lo/cti;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cqm;->e(Landroid/content/Context;)Lo/cqm;

    move-result-object v0

    iput-object v0, p0, Lo/cti;->k:Lo/cqm;

    .line 83
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    iput v0, p0, Lo/cti;->i:I

    .line 84
    return-void
.end method

.method static synthetic c(Lo/cti;Landroid/util/SparseArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 41
    invoke-direct {p0, p1}, Lo/cti;->d(Landroid/util/SparseArray;)V

    return-void
.end method

.method private d(Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatRsp;
    .locals 1

    .line 87
    iget-object v0, p0, Lo/cti;->a:Lo/czg;

    invoke-virtual {v0, p1}, Lo/czg;->b(Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatRsp;

    move-result-object v0

    return-object v0
.end method

.method private d(I)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 217
    iget-boolean v0, p0, Lo/cti;->o:Z

    if-nez v0, :cond_0

    .line 218
    iget-object v0, p0, Lo/cti;->b:Landroid/content/Context;

    move v1, p1

    invoke-static {}, Lo/cmk;->b()[I

    move-result-object v2

    .line 219
    invoke-static {}, Lo/clv;->e()[Ljava/lang/String;

    move-result-object v3

    .line 218
    const/16 v4, 0x32

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/cui;->c(Landroid/content/Context;I[I[Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 221
    :cond_0
    iget-object v0, p0, Lo/cti;->b:Landroid/content/Context;

    move v1, p1

    invoke-static {}, Lo/cmk;->b()[I

    move-result-object v2

    .line 222
    invoke-static {}, Lo/clv;->e()[Ljava/lang/String;

    move-result-object v3

    .line 221
    const/16 v4, 0x32

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/cui;->c(Landroid/content/Context;I[I[Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private d(II)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 128
    if-gt p1, p2, :cond_0

    if-gtz p1, :cond_1

    .line 129
    :cond_0
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneStatByTime the time is not right!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    return-void

    .line 132
    :cond_1
    const-string v0, "Debug_HiSyncDimenSportStat"

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

    .line 134
    new-instance v6, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;

    invoke-direct {v6}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;-><init>()V

    .line 135
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;->setStartTime(Ljava/lang/Integer;)V

    .line 136
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;->setEndTime(Ljava/lang/Integer;)V

    .line 137
    invoke-direct {p0, v6}, Lo/cti;->d(Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatRsp;

    move-result-object v7

    .line 138
    const/4 v0, 0x0

    invoke-static {v7, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 139
    return-void

    .line 141
    :cond_2
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatRsp;->getSportStat()Ljava/util/List;

    move-result-object v8

    .line 142
    iget-object v0, p0, Lo/cti;->k:Lo/cqm;

    iget v1, p0, Lo/cti;->d:I

    iget-object v2, p0, Lo/cti;->e:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v2

    move v3, p2

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cqm;->e(IIIJ)Z

    .line 143
    if-eqz v8, :cond_3

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 144
    :cond_3
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneStatByTime stringListMap is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    return-void

    .line 147
    :cond_4
    invoke-direct {p0, v8}, Lo/cti;->a(Ljava/util/List;)V

    .line 148
    return-void
.end method

.method private d(Landroid/util/SparseArray;)V
    .locals 5
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

    .line 119
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v1

    .line 120
    add-int/lit8 v2, v1, -0x1

    :goto_0
    if-ltz v2, :cond_0

    .line 121
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    .line 122
    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 123
    invoke-direct {p0, v3, v4}, Lo/cti;->d(II)V

    .line 120
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 125
    :cond_0
    return-void
.end method

.method private d(Lcom/huawei/hwcloudmodel/model/SportTotalData;)V
    .locals 5

    .line 161
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveStatToDB cloudDimenTotalStat is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    iget-object v0, p0, Lo/cti;->h:Lo/cta;

    iget v1, p0, Lo/cti;->d:I

    invoke-virtual {v0, p1, v1}, Lo/cta;->b(Lcom/huawei/hwcloudmodel/model/SportTotalData;I)Ljava/util/List;

    move-result-object v4

    .line 163
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 164
    :cond_0
    return-void

    .line 166
    :cond_1
    iget-object v0, p0, Lo/cti;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/crf;->b(Ljava/util/List;)I

    .line 167
    return-void
.end method

.method private e(Landroid/util/SparseArray;Z)V
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

    .line 91
    if-eqz p2, :cond_0

    .line 92
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAllStat too much need to download ,start a thread ! downloadDaysMap is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    invoke-direct {p0, p1}, Lo/cti;->b(Landroid/util/SparseArray;)V

    goto :goto_0

    .line 95
    :cond_0
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAllStat do not need to start a thread ! downloadDaysMap is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    invoke-direct {p0, p1}, Lo/cti;->a(Landroid/util/SparseArray;)V

    .line 98
    :goto_0
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

    .line 250
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    invoke-static {}, Lo/csk;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 252
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() dataPrivacy switch is closed ,can not pushData right now ,push end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    return-void

    .line 255
    :cond_0
    const-string v0, "SYNC_SPORT_STAT_DOWNLOAD_PERCENT_MAX"

    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    invoke-static {v1, v2, v0}, Lo/cuh;->a(DLjava/lang/String;)V

    .line 256
    iget-object v0, p0, Lo/cti;->f:Lo/cpw;

    iget v1, p0, Lo/cti;->d:I

    invoke-virtual {v0, v1}, Lo/cpw;->b(I)I

    move-result v4

    .line 257
    if-gtz v4, :cond_1

    .line 258
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() no statClient get, maybe no data need to pushData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 260
    :cond_1
    invoke-virtual {p0, v4}, Lo/cti;->a(I)V

    .line 262
    :goto_0
    iget-object v0, p0, Lo/cti;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cuh;->b(Landroid/content/Context;)V

    .line 263
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    return-void
.end method

.method public a(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 204
    :goto_0
    iget v0, p0, Lo/cti;->c:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 205
    invoke-direct {p0, p1}, Lo/cti;->d(I)Ljava/util/List;

    move-result-object v2

    .line 206
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 207
    goto :goto_1

    .line 209
    :cond_0
    invoke-direct {p0, v2}, Lo/cti;->b(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 210
    iget-object v0, p0, Lo/cti;->b:Landroid/content/Context;

    invoke-static {}, Lo/cmk;->b()[I

    move-result-object v1

    invoke-static {v0, v2, v1, p1}, Lo/cui;->d(Landroid/content/Context;Ljava/util/List;[II)V

    .line 212
    :cond_1
    goto :goto_0

    .line 213
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/cti;->c:I

    .line 214
    return-void
.end method

.method public d()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 228
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    iget v0, p0, Lo/cti;->i:I

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide v4

    .line 232
    invoke-static {}, Lo/cui;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 234
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() first sync pull all stat"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    const/4 v7, 0x1

    .line 236
    const-wide v0, 0x1434998fe80L

    const/16 v2, 0x5a

    invoke-static {v0, v1, v4, v5, v2}, Lo/cui;->e(JJI)Landroid/util/SparseArray;

    move-result-object v6

    goto :goto_0

    .line 239
    :cond_0
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() only pullDataByVersion recent stat"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    const/4 v7, 0x0

    .line 241
    const-wide/32 v0, 0x337f9800

    sub-long v0, v4, v0

    const/16 v2, 0x5a

    invoke-static {v0, v1, v4, v5, v2}, Lo/cui;->e(JJI)Landroid/util/SparseArray;

    move-result-object v6

    .line 244
    :goto_0
    invoke-direct {p0, v6, v7}, Lo/cti;->e(Landroid/util/SparseArray;Z)V

    .line 245
    const-string v0, "Debug_HiSyncDimenSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 298
    new-instance v1, Ljava/lang/StringBuffer;

    const-string v0, "--HiSyncSportStat{"

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 299
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 300
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
