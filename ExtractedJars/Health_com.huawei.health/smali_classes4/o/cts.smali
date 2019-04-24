.class public Lo/cts;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ctj;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cts$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Landroid/content/Context;

.field private c:Lo/czg;

.field private d:Lo/cqm;

.field private e:Lcom/huawei/hihealth/HiSyncOption;

.field private g:I

.field private h:Lo/csr;

.field private k:Lo/csx;


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

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HiSyncSleepStat create"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/cts;->b:Landroid/content/Context;

    .line 65
    iput-object p2, p0, Lo/cts;->e:Lcom/huawei/hihealth/HiSyncOption;

    .line 66
    iput p3, p0, Lo/cts;->a:I

    .line 67
    invoke-direct {p0}, Lo/cts;->e()V

    .line 68
    return-void
.end method

.method private a(Landroid/util/SparseArray;)V
    .locals 8
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

    .line 106
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " performDownloadByTime "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v4

    .line 108
    add-int/lit8 v5, v4, -0x1

    :goto_0
    if-ltz v5, :cond_0

    .line 109
    invoke-virtual {p1, v5}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v6

    .line 110
    invoke-virtual {p1, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 112
    invoke-direct {p0, v6, v7}, Lo/cts;->d(II)V

    .line 108
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    .line 114
    :cond_0
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

    .line 79
    if-eqz p2, :cond_0

    .line 80
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " downloadAllStat too much need to download, start a thread! downloadDaysMap is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    invoke-direct {p0, p1}, Lo/cts;->e(Landroid/util/SparseArray;)V

    goto :goto_0

    .line 83
    :cond_0
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " downloadAllStat don\'t need to start a thread! downloadDaysMap = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    invoke-direct {p0, p1}, Lo/cts;->c(Landroid/util/SparseArray;)V

    .line 86
    :goto_0
    return-void
.end method

.method private b(Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;)V
    .locals 3

    .line 199
    iget-object v0, p0, Lo/cts;->h:Lo/csr;

    iget v1, p0, Lo/cts;->a:I

    invoke-virtual {v0, p1, v1}, Lo/csr;->e(Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;I)Ljava/util/List;

    move-result-object v2

    .line 200
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 201
    :cond_0
    return-void

    .line 203
    :cond_1
    iget-object v0, p0, Lo/cts;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/crf;->b(Ljava/util/List;)I

    .line 204
    return-void
.end method

.method private c(Landroid/util/SparseArray;)V
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

    .line 89
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " downloadAllStatByTimeSync() downloadDaysMap = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 91
    :cond_0
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " downloadAllStatByTimeSync() downloadDaysMap is null or empty, stop pullStat"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    return-void

    .line 94
    :cond_1
    invoke-direct {p0, p1}, Lo/cts;->a(Landroid/util/SparseArray;)V

    .line 95
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;>;)V"
        }
    .end annotation

    .line 192
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;

    .line 193
    invoke-direct {p0, v2}, Lo/cts;->b(Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;)V

    .line 194
    goto :goto_0

    .line 195
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/cts;Landroid/util/SparseArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 39
    invoke-direct {p0, p1}, Lo/cts;->a(Landroid/util/SparseArray;)V

    return-void
.end method

.method private d(II)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 137
    if-gt p1, p2, :cond_0

    if-gtz p1, :cond_1

    .line 138
    :cond_0
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadCoreSleepStatByTime the time is not right"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    return-void

    .line 141
    :cond_1
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadCoreSleepStatByTime startTime is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " , endDay is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    invoke-direct {p0, p1, p2}, Lo/cts;->e(II)Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;

    move-result-object v6

    .line 144
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 145
    return-void

    .line 147
    :cond_2
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->getProfessionalSleepTotal()Ljava/util/List;

    move-result-object v7

    .line 148
    iget-object v0, p0, Lo/cts;->d:Lo/cqm;

    iget v1, p0, Lo/cts;->a:I

    move v3, p2

    const/16 v2, 0x2719

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cqm;->e(IIIJ)Z

    .line 149
    if-eqz v7, :cond_3

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 150
    :cond_3
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadSleepStatByTime coreSleepStats is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    return-void

    .line 153
    :cond_4
    invoke-direct {p0, v7}, Lo/cts;->c(Ljava/util/List;)V

    .line 154
    return-void
.end method

.method private e(II)Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;
    .locals 4

    .line 165
    new-instance v2, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;

    invoke-direct {v2}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;-><init>()V

    .line 166
    invoke-virtual {v2, p1}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->setStartTime(I)V

    .line 167
    invoke-virtual {v2, p2}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->setEndTime(I)V

    .line 168
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->setDataSource(I)V

    .line 169
    const-wide/16 v0, 0x0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->setDeviceCode(J)V

    .line 170
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 171
    const/16 v0, 0x9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 172
    invoke-virtual {v2, v3}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->setTypes(Ljava/util/Set;)V

    .line 173
    iget-object v0, p0, Lo/cts;->c:Lo/czg;

    invoke-virtual {v0, v2}, Lo/czg;->e(Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;

    move-result-object v0

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 71
    iget-object v0, p0, Lo/cts;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lo/cts;->c:Lo/czg;

    .line 72
    iget-object v0, p0, Lo/cts;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cqm;->e(Landroid/content/Context;)Lo/cqm;

    move-result-object v0

    iput-object v0, p0, Lo/cts;->d:Lo/cqm;

    .line 73
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    iput v0, p0, Lo/cts;->g:I

    .line 74
    new-instance v0, Lo/csx;

    iget-object v1, p0, Lo/cts;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/csx;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/cts;->k:Lo/csx;

    .line 75
    new-instance v0, Lo/csr;

    iget-object v1, p0, Lo/cts;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/csr;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/cts;->h:Lo/csr;

    .line 76
    return-void
.end method

.method private e(Landroid/util/SparseArray;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 98
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 99
    :cond_0
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " downloadAllStatByTime() downloadDaysMap is null or empty, stop pullDataByVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    return-void

    .line 102
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lo/cts$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lo/cts$a;-><init>(Lo/cts;Landroid/util/SparseArray;Lo/cts$5;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 103
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

    .line 246
    iget-object v0, p0, Lo/cts;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ctv;->a(Landroid/content/Context;)Lo/ctv;

    move-result-object v0

    iget v1, p0, Lo/cts;->a:I

    iget-object v2, p0, Lo/cts;->e:Lcom/huawei/hihealth/HiSyncOption;

    iget-object v3, p0, Lo/cts;->k:Lo/csx;

    iget-object v4, p0, Lo/cts;->h:Lo/csr;

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ctv;->d(ILcom/huawei/hihealth/HiSyncOption;Lo/csx;Lo/csr;)V

    .line 247
    return-void
.end method

.method public d()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 208
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    iget v0, p0, Lo/cts;->g:I

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide v4

    .line 212
    invoke-static {}, Lo/cui;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() first sync pull all stat!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    const/4 v7, 0x1

    .line 217
    const-wide v0, 0x1434998fe80L

    const/16 v2, 0x5a

    invoke-static {v0, v1, v4, v5, v2}, Lo/cui;->e(JJI)Landroid/util/SparseArray;

    move-result-object v6

    goto :goto_0

    .line 221
    :cond_0
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() only pullDataByVersion recent days stat"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    const/4 v7, 0x0

    .line 223
    const-wide/32 v0, 0x337f9800

    sub-long v0, v4, v0

    const/16 v2, 0x5a

    invoke-static {v0, v1, v4, v5, v2}, Lo/cui;->e(JJI)Landroid/util/SparseArray;

    move-result-object v6

    .line 226
    :goto_0
    invoke-direct {p0, v6, v7}, Lo/cts;->b(Landroid/util/SparseArray;Z)V

    .line 227
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() end!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 280
    new-instance v1, Ljava/lang/StringBuffer;

    const-string v0, "--HiSyncSleepStat{"

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 281
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 282
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
