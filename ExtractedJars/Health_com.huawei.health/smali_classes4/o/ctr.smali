.class public Lo/ctr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ctj;


# instance fields
.field private a:I

.field private b:Lo/cqn;

.field private c:Lo/czg;

.field private d:Lcom/huawei/hihealth/HiSyncOption;

.field private e:Landroid/content/Context;

.field private f:Lo/cqc;

.field private g:Lo/cqm;

.field private h:I

.field private i:Lo/cpw;

.field private k:Lo/csz;

.field private l:Lo/cpy;

.field private m:D

.field private n:J

.field private o:J

.field private p:Lo/cqj;

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SyncKey;>;"
        }
    .end annotation
.end field

.field private r:D

.field private s:I

.field private t:Lo/crf;

.field private u:D

.field private v:Lcom/huawei/hihealth/HiDataReadOption;

.field private w:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private x:Z

.field private y:I


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

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    const/4 v0, 0x0

    iput v0, p0, Lo/ctr;->h:I

    .line 77
    const/4 v0, 0x0

    iput v0, p0, Lo/ctr;->y:I

    .line 78
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ctr;->x:Z

    .line 81
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HiSyncSport create"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    .line 83
    iput-object p2, p0, Lo/ctr;->d:Lcom/huawei/hihealth/HiSyncOption;

    .line 84
    iput p3, p0, Lo/ctr;->a:I

    .line 85
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncModel()I

    move-result v0

    iput v0, p0, Lo/ctr;->s:I

    .line 86
    invoke-direct {p0}, Lo/ctr;->e()V

    .line 87
    return-void
.end method

.method private a(IIII)Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;
    .locals 4

    .line 200
    new-instance v2, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;

    invoke-direct {v2}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;-><init>()V

    .line 201
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->setQueryType(Ljava/lang/Integer;)V

    .line 202
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->setDataType(Ljava/lang/Integer;)V

    .line 203
    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->setStartTime(Ljava/lang/Long;)V

    .line 204
    int-to-long v0, p2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->setEndTime(Ljava/lang/Long;)V

    .line 205
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 206
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 207
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 208
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 209
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 210
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 211
    invoke-virtual {v2, v3}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->setSportTypes(Ljava/util/Set;)V

    .line 212
    iget-object v0, p0, Lo/ctr;->c:Lo/czg;

    invoke-virtual {v0, v2}, Lo/czg;->a(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;
    .locals 1

    .line 105
    iget-object v0, p0, Lo/ctr;->c:Lo/czg;

    invoke-virtual {v0, p1}, Lo/czg;->a(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;

    move-result-object v0

    return-object v0
.end method

.method private a(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 530
    iget-object v0, p0, Lo/ctr;->b:Lo/cqn;

    iget-object v1, p0, Lo/ctr;->v:Lcom/huawei/hihealth/HiDataReadOption;

    const/16 v2, 0x3e8

    invoke-virtual {v0, p1, v1, v2}, Lo/cqn;->b(ILcom/huawei/hihealth/HiDataReadOption;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private a(JJZ)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 149
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "performDownloadByTime startTime is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " endTime is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    const/16 v0, 0x9

    invoke-static {p1, p2, p3, p4, v0}, Lo/cui;->e(JJI)Landroid/util/SparseArray;

    move-result-object v0

    iput-object v0, p0, Lo/ctr;->w:Landroid/util/SparseArray;

    .line 151
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "performDownloadByTime downloadDaysMap is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ctr;->w:Landroid/util/SparseArray;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    iget-object v0, p0, Lo/ctr;->w:Landroid/util/SparseArray;

    if-nez v0, :cond_0

    .line 153
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "performDownloadByTime downloadDaysMap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    return-void

    .line 156
    :cond_0
    iget-object v0, p0, Lo/ctr;->w:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v4

    .line 157
    if-gtz v4, :cond_1

    .line 158
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "performDownloadByTime downloadDaysMap size is wrong, size is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    return-void

    .line 161
    :cond_1
    int-to-double v0, v4

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    div-double v0, v2, v0

    iput-wide v0, p0, Lo/ctr;->m:D

    .line 162
    add-int/lit8 v5, v4, -0x1

    :goto_0
    if-ltz v5, :cond_2

    .line 163
    iget-object v0, p0, Lo/ctr;->w:Landroid/util/SparseArray;

    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v6

    .line 164
    iget-object v0, p0, Lo/ctr;->w:Landroid/util/SparseArray;

    invoke-virtual {v0, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 165
    invoke-direct {p0, v6, v7, p5}, Lo/ctr;->b(IIZ)Ljava/util/Map;

    move-result-object v8

    .line 166
    invoke-direct {p0, v8}, Lo/ctr;->d(Ljava/util/Map;)V

    .line 162
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    .line 168
    :cond_2
    return-void
.end method

.method private a(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;J)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 216
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "performDownloadByVersion GetSportDataByVersionReq = "

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;->getVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lo/ctr;->o:J

    .line 218
    iget-wide v0, p0, Lo/ctr;->o:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 219
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ctr;->o:J

    .line 221
    :cond_0
    iget-wide v0, p0, Lo/ctr;->o:J

    iput-wide v0, p0, Lo/ctr;->n:J

    .line 223
    const/4 v9, 0x0

    .line 225
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lo/ctr;->d(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;J)J

    move-result-wide v7

    .line 226
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "performDownloadByVersion downCurrentVersion = "

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    add-int/lit8 v9, v9, 0x1

    .line 228
    const-wide/16 v0, -0x1

    cmp-long v0, v7, v0

    if-gtz v0, :cond_2

    .line 229
    return-void

    .line 231
    :cond_2
    iget-object v0, p0, Lo/ctr;->g:Lo/cqm;

    iget v1, p0, Lo/ctr;->a:I

    move-wide v3, v7

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;->getDeviceCode()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v6}, Lo/cqm;->b(IIJJ)Z

    move-result v0

    if-nez v0, :cond_3

    .line 232
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "performDownloadByVersion saveVersionToDB failed "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    :cond_3
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;->setVersion(Ljava/lang/Long;)V

    .line 235
    invoke-static {}, Lo/csk;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lo/cui;->e()Z

    move-result v0

    if-nez v0, :cond_4

    .line 237
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "performDownloadByVersion backgroud is running"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    return-void

    .line 240
    :cond_4
    const/16 v0, 0x14

    if-lt v9, v0, :cond_5

    .line 241
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "performDownloadByVersion pullDataByVersion too many times."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    return-void

    .line 245
    :cond_5
    iget v0, p0, Lo/ctr;->s:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    cmp-long v0, v7, p2

    if-ltz v0, :cond_1

    .line 246
    return-void
.end method

.method private b(IIZ)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIZ)Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportDetail;>;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 171
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneByTime startDay is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " endDay is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    if-le p1, p2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 173
    :cond_0
    if-eqz p3, :cond_1

    .line 174
    iget-object v0, p0, Lo/ctr;->g:Lo/cqm;

    iget v1, p0, Lo/ctr;->a:I

    move v3, p2

    const/16 v2, 0x271e

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cqm;->e(IIIJ)Z

    .line 177
    :cond_1
    iget-object v0, p0, Lo/ctr;->d:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiSyncOption;->getSyncMethod()I

    move-result v0

    const/4 v1, 0x1

    invoke-direct {p0, p1, p2, v1, v0}, Lo/ctr;->a(IIII)Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;

    move-result-object v6

    .line 178
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 179
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneByTime warning"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    const/4 v0, 0x0

    return-object v0

    .line 182
    :cond_2
    if-eqz p3, :cond_3

    .line 184
    iget-object v0, p0, Lo/ctr;->g:Lo/cqm;

    iget v1, p0, Lo/ctr;->a:I

    move v3, p1

    const/16 v2, 0x271e

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cqm;->e(IIIJ)Z

    .line 187
    :cond_3
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;->getData()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private b(I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 535
    :goto_0
    iget v0, p0, Lo/ctr;->h:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_3

    .line 536
    invoke-direct {p0, p1}, Lo/ctr;->g(I)Ljava/util/List;

    move-result-object v4

    .line 537
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 538
    goto :goto_2

    .line 540
    :cond_0
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUploadSleepData size ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 541
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {p0, v4, v0, v1}, Lo/ctr;->c(Ljava/util/List;IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 543
    invoke-direct {p0, v4}, Lo/ctr;->e(Ljava/util/List;)V

    goto :goto_1

    .line 545
    :cond_1
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadSleepData upload failed\uff0cclientId is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    goto :goto_2

    .line 549
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x3e8

    if-ge v0, v1, :cond_2

    .line 550
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadSleepData the size is smaller than HiSyncUtil.UPLOAD_SPORT_DATA_MAX, size is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 551
    goto :goto_2

    .line 553
    :cond_2
    goto/16 :goto_0

    .line 554
    :cond_3
    :goto_2
    const/4 v0, 0x0

    iput v0, p0, Lo/ctr;->h:I

    .line 555
    return-void
.end method

.method private b(Ljava/util/List;ZZ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;ZZ)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 712
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Integer;

    .line 714
    if-eqz p2, :cond_0

    .line 715
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctr;->c(I)V

    .line 717
    :cond_0
    if-eqz p3, :cond_1

    .line 718
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctr;->e(I)V

    .line 720
    :cond_1
    goto :goto_0

    .line 721
    :cond_2
    return-void
.end method

.method private c(I)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 463
    :goto_0
    iget v0, p0, Lo/ctr;->h:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_3

    .line 464
    new-instance v4, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 465
    const/4 v5, 0x4

    new-array v5, v5, [I

    fill-array-data v5, :array_0

    .line 467
    const/4 v0, 0x4

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "step"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    const-string v0, "calorie"

    const/4 v1, 0x1

    aput-object v0, v6, v1

    const-string v0, "distance"

    const/4 v1, 0x2

    aput-object v0, v6, v1

    const-string v0, "altitude_offset"

    const/4 v1, 0x3

    aput-object v0, v6, v1

    .line 469
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 470
    invoke-static {v7, v8}, Lo/cnk;->d(J)J

    move-result-wide v9

    .line 471
    invoke-static {v7, v8}, Lo/cnk;->i(J)J

    move-result-wide v11

    .line 472
    invoke-virtual {v4, v9, v10, v11, v12}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 473
    invoke-virtual {v4, v6}, Lcom/huawei/hihealth/HiDataReadOption;->setConstantsKey([Ljava/lang/String;)V

    .line 474
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 475
    const/16 v0, 0x4e21

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setAlignType(I)V

    .line 476
    iget-object v0, p0, Lo/ctr;->b:Lo/cqn;

    invoke-virtual {v0, p1, v4}, Lo/cqn;->c(ILcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;

    move-result-object v13

    .line 477
    const/4 v0, 0x0

    if-eq v0, v13, :cond_3

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 478
    goto :goto_2

    .line 480
    :cond_0
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadTodaySportData size ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 481
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-direct {p0, v13, v0, v1}, Lo/ctr;->c(Ljava/util/List;IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 483
    invoke-direct {p0, v13}, Lo/ctr;->c(Ljava/util/List;)V

    goto :goto_1

    .line 486
    :cond_1
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadTodaySportData upload failed\uff0cclientId is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 487
    goto :goto_2

    .line 490
    :goto_1
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x3e8

    if-ge v0, v1, :cond_2

    .line 491
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadTodaySportData the size is smaller than HiSyncUtil.UPLOAD_SPORT_DATA_MAX, size is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 492
    goto :goto_2

    .line 494
    :cond_2
    goto/16 :goto_0

    .line 495
    :cond_3
    :goto_2
    const/4 v0, 0x0

    iput v0, p0, Lo/ctr;->h:I

    .line 496
    return-void

    nop

    :array_0
    .array-data 4
        0x2
        0x4
        0x3
        0x5
    .end array-data
.end method

.method private c(Lcom/huawei/hwcloudmodel/model/unite/SyncKey;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 118
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadByKey key = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 120
    :cond_0
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadByKey the key is not right"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    return-void

    .line 124
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getDeviceCode()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 125
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    .line 127
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-gtz v0, :cond_2

    .line 128
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadByKey the maxVersion is not right , wrong key is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    return-void

    .line 132
    :cond_2
    new-instance v8, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;

    invoke-direct {v8}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;-><init>()V

    .line 133
    iget-object v0, p0, Lo/ctr;->d:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiSyncOption;->getSyncMethod()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;->setDataType(Ljava/lang/Integer;)V

    .line 134
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;->setDeviceCode(Ljava/lang/Long;)V

    .line 136
    iget-object v0, p0, Lo/ctr;->g:Lo/cqm;

    iget v1, p0, Lo/ctr;->a:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v4, v5, v2}, Lo/cqm;->a(IJI)Lo/cnz;

    move-result-object v9

    .line 137
    const/4 v0, 0x0

    if-ne v0, v9, :cond_3

    .line 138
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;->setVersion(I)V

    .line 139
    invoke-direct {p0, v8, v6, v7}, Lo/ctr;->a(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;J)V

    goto :goto_0

    .line 140
    :cond_3
    invoke-virtual {v9}, Lo/cnz;->c()J

    move-result-wide v0

    cmp-long v0, v0, v6

    if-gez v0, :cond_4

    .line 141
    invoke-virtual {v9}, Lo/cnz;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;->setVersion(Ljava/lang/Long;)V

    .line 142
    invoke-direct {p0, v8, v6, v7}, Lo/ctr;->a(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;J)V

    goto :goto_0

    .line 144
    :cond_4
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "do not need download data,DB version is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lo/cnz;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", max version is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    :goto_0
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 362
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 363
    :cond_0
    return-void

    .line 371
    :cond_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_0
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lcom/huawei/hihealth/HiHealthData;

    .line 372
    invoke-virtual/range {v19 .. v19}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v14

    .line 373
    const-string v0, "modified_time"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v12

    .line 375
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ctr;->f:Lo/cqc;

    move-wide v1, v14

    move-wide v3, v12

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/cqc;->b(JJI)I

    move-result v16

    .line 376
    if-lez v16, :cond_2

    .line 377
    invoke-virtual/range {v19 .. v19}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v8

    .line 378
    invoke-virtual/range {v19 .. v19}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v10

    .line 379
    invoke-virtual/range {v19 .. v19}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v17

    .line 380
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ctr;->l:Lo/cpy;

    move/from16 v1, v17

    move-wide v2, v8

    move-wide v4, v10

    const/4 v6, 0x2

    const/4 v7, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/cpy;->c(IJJII)I

    .line 381
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ctr;->l:Lo/cpy;

    move/from16 v1, v17

    move-wide v2, v8

    move-wide v4, v10

    const/4 v6, 0x4

    const/4 v7, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/cpy;->c(IJJII)I

    .line 382
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ctr;->l:Lo/cpy;

    move/from16 v1, v17

    move-wide v2, v8

    move-wide v4, v10

    const/4 v6, 0x3

    const/4 v7, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/cpy;->c(IJJII)I

    .line 385
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ctr;->l:Lo/cpy;

    move/from16 v1, v17

    move-wide v2, v8

    move-wide v4, v10

    const/4 v6, 0x5

    const/4 v7, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/cpy;->c(IJJII)I

    .line 387
    :cond_2
    goto/16 :goto_0

    .line 388
    :cond_3
    return-void
.end method

.method private c(Ljava/util/List;IZ)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;IZ)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 406
    if-nez p3, :cond_0

    iget-boolean v0, p0, Lo/ctr;->x:Z

    if-nez v0, :cond_1

    .line 407
    :cond_0
    iget v0, p0, Lo/ctr;->y:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctr;->y:I

    iget-object v1, p0, Lo/ctr;->d:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v1

    invoke-static {v0, v1}, Lo/cui;->d(II)V

    goto :goto_0

    .line 409
    :cond_1
    iget v0, p0, Lo/ctr;->y:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctr;->y:I

    const/4 v1, 0x5

    if-ge v1, v0, :cond_2

    .line 410
    const/4 v0, 0x0

    return v0

    .line 413
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/ctr;->k:Lo/csz;

    iget v1, p0, Lo/ctr;->s:I

    invoke-virtual {v0, p1, p2, v1}, Lo/csz;->c(Ljava/util/List;II)Ljava/util/List;

    move-result-object v4

    .line 414
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 415
    :cond_3
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDataToCloud sportDetails is null or empty dataType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    const/4 v0, 0x0

    return v0

    .line 418
    :cond_4
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/AddSportDataReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/AddSportDataReq;-><init>()V

    .line 419
    invoke-virtual {v5, v4}, Lcom/huawei/hwcloudmodel/model/unite/AddSportDataReq;->setDetailInfo(Ljava/util/List;)V

    .line 420
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddSportDataReq;->setTimeZone(Ljava/lang/String;)V

    .line 422
    :goto_1
    iget v0, p0, Lo/ctr;->h:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_6

    .line 423
    iget-object v0, p0, Lo/ctr;->c:Lo/czg;

    invoke-virtual {v0, v5}, Lo/czg;->e(Lcom/huawei/hwcloudmodel/model/unite/AddSportDataReq;)Lcom/huawei/hwcloudmodel/model/unite/AddSportDataRsp;

    move-result-object v6

    .line 424
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_5

    .line 425
    iget v0, p0, Lo/ctr;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctr;->h:I

    .line 426
    goto :goto_1

    .line 428
    :cond_5
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDataToCloud OK ! uploadCount is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctr;->y:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " dataType is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    const-string v0, "HiH_"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDataToCloud OK ! uploadCount is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctr;->y:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " dataType is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    const/4 v0, 0x1

    return v0

    .line 432
    :cond_6
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDataToCloud failed ! uploadCount is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctr;->y:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " dataType is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    const-string v0, "HiH_"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDataToCloud failed ! uploadCount is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctr;->y:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " dataType is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    const/4 v0, 0x0

    return v0
.end method

.method private c(Ljava/util/Map;Z)Z
    .locals 12
    .param p1    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportDetail;>;>;Z)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 327
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    int-to-double v7, v0

    .line 328
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_0
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/List;

    .line 330
    invoke-static {}, Lo/csk;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/cui;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 331
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    div-double/2addr v1, v7

    iget-wide v5, p0, Lo/ctr;->r:D

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    invoke-static/range {v0 .. v6}, Lo/cuh;->a(Landroid/content/Context;DDD)V

    goto :goto_1

    .line 333
    :cond_1
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    div-double/2addr v1, v7

    iget-wide v3, p0, Lo/ctr;->m:D

    iget-wide v5, p0, Lo/ctr;->r:D

    invoke-static/range {v0 .. v6}, Lo/cuh;->a(Landroid/content/Context;DDD)V

    .line 335
    :goto_1
    if-eqz v10, :cond_0

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 336
    goto :goto_0

    .line 338
    :cond_2
    iget-object v0, p0, Lo/ctr;->k:Lo/csz;

    iget v1, p0, Lo/ctr;->a:I

    iget v2, p0, Lo/ctr;->s:I

    invoke-virtual {v0, v10, v1, v2}, Lo/csz;->b(Ljava/util/List;II)Ljava/util/List;

    move-result-object v11

    .line 339
    const/4 v0, 0x0

    if-eq v0, v11, :cond_0

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 340
    goto :goto_0

    .line 343
    :cond_3
    invoke-static {}, Lo/cui;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    if-nez p2, :cond_4

    .line 344
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    iget v1, p0, Lo/ctr;->a:I

    const/4 v2, 0x1

    invoke-static {v0, v11, v2, v1}, Lo/cth;->b(Landroid/content/Context;Ljava/util/List;II)V

    .line 345
    goto/16 :goto_0

    .line 347
    :cond_4
    iget-object v0, p0, Lo/ctr;->t:Lo/crf;

    iget v1, p0, Lo/ctr;->a:I

    invoke-virtual {v0, v11, v1}, Lo/crf;->a(Ljava/util/List;I)I

    .line 349
    if-eqz p2, :cond_5

    .line 350
    iget-object v0, p0, Lo/ctr;->t:Lo/crf;

    invoke-virtual {v0, v11}, Lo/crf;->c(Ljava/util/List;)V

    .line 351
    iget-object v0, p0, Lo/ctr;->t:Lo/crf;

    invoke-virtual {v0}, Lo/crf;->e()V

    goto :goto_2

    .line 354
    :cond_5
    iget-object v0, p0, Lo/ctr;->t:Lo/crf;

    invoke-virtual {v0, v11}, Lo/crf;->d(Ljava/util/List;)V

    .line 356
    :goto_2
    goto/16 :goto_0

    .line 357
    :cond_6
    const/4 v0, 0x1

    return v0
.end method

.method private d(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;J)J
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 249
    invoke-direct {p0, p1}, Lo/ctr;->a(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;

    move-result-object v4

    .line 250
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 251
    const-wide/16 v0, -0x1

    return-wide v0

    .line 253
    :cond_0
    invoke-direct {p0, v4}, Lo/ctr;->e(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;)Ljava/util/Map;

    move-result-object v5

    .line 255
    if-eqz v5, :cond_1

    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 256
    :cond_1
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadByVersionOnce stringListMap is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    const-wide/16 v0, -0x1

    return-wide v0

    .line 261
    :cond_2
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;->getCurrentVersion()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_3

    .line 262
    invoke-direct {p0, v5}, Lo/ctr;->e(Ljava/util/Map;)J

    move-result-wide v6

    goto :goto_0

    .line 264
    :cond_3
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;->getCurrentVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    .line 267
    :goto_0
    iget-wide v0, p0, Lo/ctr;->n:J

    cmp-long v0, v6, v0

    if-gtz v0, :cond_4

    .line 268
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadByVersionOnce downloadVersion is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " smaller than currentVersion "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/ctr;->n:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    const-wide/16 v0, -0x1

    return-wide v0

    .line 271
    :cond_4
    iget-wide v0, p0, Lo/ctr;->n:J

    sub-long v0, v6, v0

    long-to-double v0, v0

    iget-wide v2, p0, Lo/ctr;->o:J

    sub-long v2, p2, v2

    long-to-double v2, v2

    div-double/2addr v0, v2

    iput-wide v0, p0, Lo/ctr;->m:D

    .line 272
    iput-wide v6, p0, Lo/ctr;->n:J

    .line 274
    const/4 v8, 0x0

    .line 276
    invoke-static {}, Lo/cui;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 278
    :try_start_0
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->b()V

    .line 279
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadByVersionOnce first sync ,save data to temp ,downloadVersion is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    const/4 v0, 0x0

    invoke-direct {p0, v5, v0}, Lo/ctr;->c(Ljava/util/Map;Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    move v8, v0

    .line 284
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 285
    goto :goto_1

    .line 281
    :catch_0
    move-exception v9

    .line 282
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadByVersionOnce() e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 284
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 285
    goto :goto_1

    .line 284
    :catchall_0
    move-exception v10

    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 285
    throw v10

    :goto_1
    goto :goto_2

    .line 287
    :cond_5
    const/4 v0, 0x1

    invoke-direct {p0, v5, v0}, Lo/ctr;->c(Ljava/util/Map;Z)Z

    move-result v8

    .line 289
    :goto_2
    if-nez v8, :cond_6

    .line 290
    const-wide/16 v0, -0x1

    return-wide v0

    .line 292
    :cond_6
    return-wide v6
.end method

.method private d(I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 439
    :goto_0
    iget v0, p0, Lo/ctr;->h:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_3

    .line 440
    invoke-direct {p0, p1}, Lo/ctr;->a(I)Ljava/util/List;

    move-result-object v4

    .line 441
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 442
    goto :goto_2

    .line 444
    :cond_0
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUploadSportData size ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v4, v0, v1}, Lo/ctr;->c(Ljava/util/List;IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 447
    invoke-direct {p0, v4}, Lo/ctr;->c(Ljava/util/List;)V

    goto :goto_1

    .line 450
    :cond_1
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadSportData upload failed\uff0cclientId is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    goto :goto_2

    .line 454
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x3e8

    if-ge v0, v1, :cond_2

    .line 455
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadSportData the size is smaller than HiSyncUtil.UPLOAD_SPORT_DATA_MAX, size is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 456
    goto :goto_2

    .line 458
    :cond_2
    goto/16 :goto_0

    .line 459
    :cond_3
    :goto_2
    const/4 v0, 0x0

    iput v0, p0, Lo/ctr;->h:I

    .line 460
    return-void
.end method

.method private d(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportDetail;>;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 191
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 192
    :cond_0
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneByTime stringListMap is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    return-void

    .line 195
    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lo/ctr;->c(Ljava/util/Map;Z)Z

    .line 196
    iget-object v0, p0, Lo/ctr;->t:Lo/crf;

    invoke-virtual {v0}, Lo/crf;->e()V

    .line 197
    return-void
.end method

.method private e(Ljava/util/Map;)J
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportDetail;>;>;)J"
        }
    .end annotation

    .line 309
    const-wide/high16 v2, -0x8000000000000000L

    .line 310
    const-wide v4, 0x7fffffffffffffffL

    .line 311
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/List;

    .line 312
    if-eqz v7, :cond_0

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 313
    :cond_1
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;

    .line 314
    invoke-virtual {v9}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->getVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    .line 315
    cmp-long v0, v10, v2

    if-ltz v0, :cond_2

    .line 316
    move-wide v2, v10

    .line 318
    :cond_2
    cmp-long v0, v10, v4

    if-gez v0, :cond_3

    .line 319
    move-wide v4, v10

    .line 321
    :cond_3
    goto :goto_1

    .line 322
    :cond_4
    goto :goto_0

    .line 323
    :cond_5
    return-wide v2
.end method

.method private e(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;)Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportDetail;>;>;"
        }
    .end annotation

    .line 297
    iget v0, p0, Lo/ctr;->s:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 298
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 299
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;->getDetailInfos()Ljava/util/List;

    move-result-object v3

    .line 300
    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 301
    :cond_1
    const-string v0, "one"

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    goto :goto_0

    .line 303
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;->getData()Ljava/util/Map;

    move-result-object v2

    .line 305
    :goto_0
    return-object v2
.end method

.method private e()V
    .locals 2

    .line 90
    invoke-static {}, Lo/cui;->d()Z

    move-result v0

    iput-boolean v0, p0, Lo/ctr;->x:Z

    .line 91
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lo/ctr;->c:Lo/czg;

    .line 92
    new-instance v0, Lo/csz;

    iget-object v1, p0, Lo/ctr;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/csz;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ctr;->k:Lo/csz;

    .line 93
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqn;->a(Landroid/content/Context;)Lo/cqn;

    move-result-object v0

    iput-object v0, p0, Lo/ctr;->b:Lo/cqn;

    .line 94
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    iput-object v0, p0, Lo/ctr;->i:Lo/cpw;

    .line 95
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqm;->e(Landroid/content/Context;)Lo/cqm;

    move-result-object v0

    iput-object v0, p0, Lo/ctr;->g:Lo/cqm;

    .line 96
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqc;->e(Landroid/content/Context;)Lo/cqc;

    move-result-object v0

    iput-object v0, p0, Lo/ctr;->f:Lo/cqc;

    .line 97
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cpy;->d(Landroid/content/Context;)Lo/cpy;

    move-result-object v0

    iput-object v0, p0, Lo/ctr;->l:Lo/cpy;

    .line 98
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqj;->d(Landroid/content/Context;)Lo/cqj;

    move-result-object v0

    iput-object v0, p0, Lo/ctr;->p:Lo/cqj;

    .line 99
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    iput-object v0, p0, Lo/ctr;->t:Lo/crf;

    .line 100
    invoke-direct {p0}, Lo/ctr;->f()Lcom/huawei/hihealth/HiDataReadOption;

    move-result-object v0

    iput-object v0, p0, Lo/ctr;->v:Lcom/huawei/hihealth/HiDataReadOption;

    .line 102
    return-void
.end method

.method private e(I)V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 500
    :goto_0
    iget v0, p0, Lo/ctr;->h:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_3

    .line 501
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 502
    const/16 v0, 0x55f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 503
    const/16 v0, 0x55f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 504
    const/16 v0, 0x55f3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 505
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 506
    invoke-static {v8, v9}, Lo/cnk;->m(J)J

    move-result-wide v10

    .line 507
    invoke-static {v8, v9}, Lo/cnk;->p(J)J

    move-result-wide v12

    .line 508
    iget-object v0, p0, Lo/ctr;->p:Lo/cqj;

    move/from16 v1, p1

    move-object v2, v7

    move-wide v3, v10

    move-wide v5, v12

    invoke-virtual/range {v0 .. v6}, Lo/cqj;->d(ILjava/util/List;JJ)Ljava/util/List;

    move-result-object v14

    .line 509
    const/4 v0, 0x0

    if-eq v0, v14, :cond_3

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 510
    goto :goto_2

    .line 512
    :cond_0
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadTodaySleepData size ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 513
    const/4 v0, 0x3

    const/4 v1, 0x1

    invoke-direct {p0, v14, v0, v1}, Lo/ctr;->c(Ljava/util/List;IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 515
    invoke-direct {p0, v14}, Lo/ctr;->e(Ljava/util/List;)V

    goto :goto_1

    .line 517
    :cond_1
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadTodaySleepData upload failed\uff0cclientId is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 518
    goto :goto_2

    .line 521
    :goto_1
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x3e8

    if-ge v0, v1, :cond_2

    .line 522
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadTodaySleepData the size is smaller than HiSyncUtil.UPLOAD_SPORT_DATA_MAX, size is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    goto :goto_2

    .line 525
    :cond_2
    goto/16 :goto_0

    .line 526
    :cond_3
    :goto_2
    const/4 v0, 0x0

    iput v0, p0, Lo/ctr;->h:I

    .line 527
    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 392
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 393
    :cond_0
    return-void

    .line 398
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 399
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v8

    .line 400
    const-string v0, "modified_time"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 401
    iget-object v0, p0, Lo/ctr;->p:Lo/cqj;

    move-wide v1, v8

    move-wide v3, v6

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/cqj;->e(JJI)I

    .line 402
    goto :goto_0

    .line 403
    :cond_2
    return-void
.end method

.method private f()Lcom/huawei/hihealth/HiDataReadOption;
    .locals 5

    .line 603
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 605
    const/4 v3, 0x4

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 607
    const/4 v0, 0x4

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "step"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "calorie"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "distance"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    const-string v0, "altitude_offset"

    const/4 v1, 0x3

    aput-object v0, v4, v1

    .line 609
    invoke-virtual {v2, v4}, Lcom/huawei/hihealth/HiDataReadOption;->setConstantsKey([Ljava/lang/String;)V

    .line 610
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 611
    const/16 v0, 0x4e21

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setAlignType(I)V

    .line 612
    return-object v2

    :array_0
    .array-data 4
        0x2
        0x4
        0x3
        0x5
    .end array-data
.end method

.method private g(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 559
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 560
    const/16 v0, 0x55f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 561
    const/16 v0, 0x55f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 562
    const/16 v0, 0x55f3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 563
    iget-object v0, p0, Lo/ctr;->p:Lo/cqj;

    const/16 v1, 0x3e8

    invoke-virtual {v0, p1, v2, v1}, Lo/cqj;->e(ILjava/util/List;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private g()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 621
    iget v0, p0, Lo/ctr;->s:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 622
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion 3.0 model"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 624
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/ctr;->d:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncMethod()I

    move-result v1

    iget-object v2, p0, Lo/ctr;->d:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v2

    invoke-static {v0, v1, v2}, Lo/cui;->d(Landroid/content/Context;II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/ctr;->q:Ljava/util/List;

    goto :goto_0

    .line 625
    :cond_0
    iget v0, p0, Lo/ctr;->s:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 626
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion 2.0 model"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 627
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ctw;->e(Landroid/content/Context;)Lo/ctw;

    move-result-object v0

    iget-object v1, p0, Lo/ctr;->d:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ctw;->d(I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/ctr;->q:Ljava/util/List;

    .line 629
    :cond_1
    :goto_0
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() syncKeys is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ctr;->q:Ljava/util/List;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 630
    return-void
.end method

.method private i()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 109
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadByVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    iget-object v0, p0, Lo/ctr;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;

    .line 113
    invoke-direct {p0, v5}, Lo/ctr;->c(Lcom/huawei/hwcloudmodel/model/unite/SyncKey;)V

    .line 114
    goto :goto_0

    .line 115
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 649
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 650
    invoke-static {}, Lo/csk;->d()Z

    move-result v7

    .line 651
    invoke-static {}, Lo/csk;->e()Z

    move-result v8

    .line 652
    if-nez v7, :cond_0

    if-nez v8, :cond_0

    .line 653
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() sportDataPrivacy switch is closed and healthDataPrivacy switch is closed ,can not pushData right now ,push end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 654
    return-void

    .line 656
    :cond_0
    const-string v0, "SYNC_SPORT_UPLOAD_PERCENT_MAX"

    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    invoke-static {v1, v2, v0}, Lo/cuh;->a(DLjava/lang/String;)V

    .line 658
    iget-object v0, p0, Lo/ctr;->i:Lo/cpw;

    iget v1, p0, Lo/ctr;->a:I

    invoke-virtual {v0, v1}, Lo/cpw;->a(I)Ljava/util/List;

    move-result-object v9

    .line 659
    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 660
    :cond_1
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() no client get, maybe no data need to pushData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_3

    .line 662
    :cond_2
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clientid list size ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 663
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    div-double v0, v2, v0

    iput-wide v0, p0, Lo/ctr;->u:D

    .line 664
    iget-boolean v0, p0, Lo/ctr;->x:Z

    if-nez v0, :cond_6

    .line 665
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/Integer;

    .line 667
    if-eqz v7, :cond_3

    .line 668
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctr;->d(I)V

    .line 670
    :cond_3
    if-eqz v8, :cond_4

    .line 671
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctr;->b(I)V

    .line 673
    :cond_4
    goto :goto_0

    :cond_5
    goto :goto_3

    .line 675
    :cond_6
    invoke-direct {p0, v9, v7, v8}, Lo/ctr;->b(Ljava/util/List;ZZ)V

    .line 676
    const/4 v0, 0x0

    iput v0, p0, Lo/ctr;->y:I

    .line 677
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/Integer;

    .line 679
    if-eqz v7, :cond_7

    .line 680
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctr;->d(I)V

    .line 682
    :cond_7
    goto :goto_1

    .line 683
    :cond_8
    const/4 v0, 0x0

    iput v0, p0, Lo/ctr;->y:I

    .line 684
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/Integer;

    .line 686
    if-eqz v8, :cond_9

    .line 687
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctr;->b(I)V

    .line 689
    :cond_9
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    iget-wide v3, p0, Lo/ctr;->u:D

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v5, 0x4024000000000000L    # 10.0

    invoke-static/range {v0 .. v6}, Lo/cuh;->a(Landroid/content/Context;DDD)V

    .line 690
    goto :goto_2

    .line 693
    :cond_a
    :goto_3
    invoke-virtual {p0}, Lo/ctr;->d()V

    .line 694
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuh;->b(Landroid/content/Context;)V

    .line 695
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 696
    return-void
.end method

.method public a(J)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 744
    move-object v0, p0

    const/4 v1, 0x1

    invoke-static {p1, p2, v1}, Lo/cui;->c(JI)J

    move-result-wide v1

    move-wide v3, p1

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/ctr;->a(JJZ)V

    .line 745
    return-void
.end method

.method public a(JJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 700
    iget-wide v0, p0, Lo/ctr;->r:D

    const-string v2, "SYNC_SPORT_DOWNLOAD_PERCENT_BY_TIME"

    invoke-static {v0, v1, v2}, Lo/cuh;->a(DLjava/lang/String;)V

    .line 701
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/ctr;->a(JJZ)V

    .line 702
    return-void
.end method

.method public b()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 735
    iget-object v0, p0, Lo/ctr;->g:Lo/cqm;

    iget v1, p0, Lo/ctr;->a:I

    const-wide/16 v2, 0x0

    const/16 v4, 0x271e

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cqm;->c(IJI)Lo/cnz;

    move-result-object v6

    .line 736
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 737
    invoke-virtual {v6}, Lo/cnz;->d()I

    move-result v7

    .line 738
    invoke-static {v7}, Lo/cnk;->b(I)J

    move-result-wide v8

    .line 739
    move-object v0, p0

    const/4 v1, 0x7

    invoke-static {v8, v9, v1}, Lo/cui;->c(JI)J

    move-result-wide v1

    move-wide v3, v8

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/ctr;->a(JJZ)V

    .line 741
    :cond_0
    return-void
.end method

.method public c()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 724
    invoke-direct {p0}, Lo/ctr;->g()V

    .line 725
    iget-object v0, p0, Lo/ctr;->q:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ctr;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 726
    :cond_0
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() syncKeys is null,stop pullDataByVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 727
    return-void

    .line 729
    :cond_1
    iget-object v0, p0, Lo/ctr;->q:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;

    invoke-virtual {v0}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    .line 730
    iget-object v0, p0, Lo/ctr;->q:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;

    invoke-virtual {v0}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getDeviceCode()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    .line 731
    iget-object v0, p0, Lo/ctr;->g:Lo/cqm;

    iget v1, p0, Lo/ctr;->a:I

    move-wide v3, v7

    move-wide v5, v9

    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v6}, Lo/cqm;->b(IIJJ)Z

    .line 732
    return-void
.end method

.method public d()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 634
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 635
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    iput-wide v0, p0, Lo/ctr;->r:D

    .line 636
    iget-wide v0, p0, Lo/ctr;->r:D

    const-string v2, "SYNC_SPORT_DOWNLOAD_PERCENT_MAX_ALL"

    invoke-static {v0, v1, v2}, Lo/cuh;->a(DLjava/lang/String;)V

    .line 637
    invoke-direct {p0}, Lo/ctr;->g()V

    .line 638
    iget-object v0, p0, Lo/ctr;->q:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ctr;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 639
    :cond_0
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() syncKeys is null,stop pullDataByVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 640
    return-void

    .line 642
    :cond_1
    invoke-direct {p0}, Lo/ctr;->i()V

    .line 643
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuh;->b(Landroid/content/Context;)V

    .line 644
    const-string v0, "HiH_HiSyncSport"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 645
    return-void
.end method

.method public e(D)V
    .locals 1

    .line 748
    const-string v0, "SYNC_SPORT_DOWNLOAD_PERCENT_MAX_ALL"

    invoke-static {p1, p2, v0}, Lo/cuh;->a(DLjava/lang/String;)V

    .line 749
    iget-object v0, p0, Lo/ctr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuh;->b(Landroid/content/Context;)V

    .line 750
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 706
    new-instance v1, Ljava/lang/StringBuffer;

    const-string v0, "--HiSyncSport{"

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 707
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 708
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
