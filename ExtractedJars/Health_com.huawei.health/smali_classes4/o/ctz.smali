.class public Lo/ctz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ctj;


# instance fields
.field private a:Landroid/content/Context;

.field private b:J

.field private c:J

.field private d:I

.field private e:Lcom/huawei/hihealth/HiSyncOption;

.field private f:Lo/csv;

.field private g:I

.field private h:Lo/crf;

.field private i:Lo/czg;

.field private k:Lo/cqm;

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SyncKey;>;"
        }
    .end annotation
.end field


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
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HiSyncTrack create"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    .line 67
    iput-object p2, p0, Lo/ctz;->e:Lcom/huawei/hihealth/HiSyncOption;

    .line 68
    iput p3, p0, Lo/ctz;->d:I

    .line 69
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncModel()I

    move-result v0

    iput v0, p0, Lo/ctz;->g:I

    .line 70
    invoke-direct {p0}, Lo/ctz;->b()V

    .line 71
    return-void
.end method

.method private b()V
    .locals 2

    .line 74
    iget-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lo/ctz;->i:Lo/czg;

    .line 75
    new-instance v0, Lo/csv;

    iget-object v1, p0, Lo/ctz;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/csv;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ctz;->f:Lo/csv;

    .line 76
    iget-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqm;->e(Landroid/content/Context;)Lo/cqm;

    move-result-object v0

    iput-object v0, p0, Lo/ctz;->k:Lo/cqm;

    .line 77
    iget-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    iput-object v0, p0, Lo/ctz;->h:Lo/crf;

    .line 79
    return-void
.end method

.method private b(Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;J)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 155
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "performDownloadByVersion req = "

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

    .line 156
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;->getVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lo/ctz;->c:J

    .line 157
    iget-wide v0, p0, Lo/ctz;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 158
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ctz;->c:J

    .line 160
    :cond_0
    iget-wide v0, p0, Lo/ctz;->c:J

    iput-wide v0, p0, Lo/ctz;->b:J

    .line 162
    const/4 v9, 0x0

    .line 164
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lo/ctz;->d(Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;J)J

    move-result-wide v7

    .line 165
    const-string v0, "HiH_HiSyncTrack"

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

    .line 166
    add-int/lit8 v9, v9, 0x1

    .line 167
    const-wide/16 v0, -0x1

    cmp-long v0, v7, v0

    if-gtz v0, :cond_2

    .line 168
    return-void

    .line 170
    :cond_2
    iget-object v0, p0, Lo/ctz;->k:Lo/cqm;

    iget v1, p0, Lo/ctz;->d:I

    iget-object v2, p0, Lo/ctz;->e:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v2

    move-wide v3, v7

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;->getDeviceCode()Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual/range {v0 .. v6}, Lo/cqm;->b(IIJJ)Z

    move-result v0

    if-nez v0, :cond_3

    .line 171
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "performDownloadByVersion saveVersionToDB failed "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    :cond_3
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;->setVersion(Ljava/lang/Long;)V

    .line 176
    const/16 v0, 0x14

    if-lt v9, v0, :cond_4

    .line 177
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "performDownloadByVersion pullDataByVersion too many times."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    :cond_4
    iget-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    invoke-static/range {v0 .. v6}, Lo/cuh;->a(Landroid/content/Context;DDD)V

    .line 182
    iget v0, p0, Lo/ctz;->g:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    cmp-long v0, v7, p2

    if-ltz v0, :cond_1

    .line 183
    return-void
.end method

.method private b(Ljava/util/List;Z)V
    .locals 11
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;>;Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 226
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 227
    iget-object v0, p0, Lo/ctz;->f:Lo/csv;

    iget v1, p0, Lo/ctz;->d:I

    iget v2, p0, Lo/ctz;->g:I

    invoke-virtual {v0, p1, v1, v2}, Lo/csv;->c(Ljava/util/List;II)Ljava/util/List;

    move-result-object v6

    .line 228
    if-eqz v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 229
    :cond_0
    return-void

    .line 231
    :cond_1
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveData cloudTracks is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    :try_start_0
    iget-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->b()V

    .line 234
    iget-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    iget v1, p0, Lo/ctz;->d:I

    invoke-virtual {v0, v1}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v7

    .line 235
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 236
    :cond_2
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveData() null == clients ||clients.isEmpty ()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    iget-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 237
    return-void

    .line 239
    :cond_3
    :try_start_1
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 240
    iget-object v0, p0, Lo/ctz;->h:Lo/crf;

    iget v1, p0, Lo/ctz;->d:I

    invoke-virtual {v0, v9, v1, v7}, Lo/crf;->b(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 241
    goto :goto_0

    .line 245
    :cond_4
    iget-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 246
    goto :goto_1

    .line 242
    :catch_0
    move-exception v7

    .line 243
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveData e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 245
    iget-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 246
    goto :goto_1

    .line 245
    :catchall_0
    move-exception v10

    iget-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 246
    throw v10

    .line 247
    :goto_1
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveData end saveDetailTime =  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    if-eqz p2, :cond_5

    .line 249
    iget-object v0, p0, Lo/ctz;->h:Lo/crf;

    invoke-virtual {v0, v6}, Lo/crf;->c(Ljava/util/List;)V

    .line 250
    iget-object v0, p0, Lo/ctz;->h:Lo/crf;

    invoke-virtual {v0}, Lo/crf;->e()V

    goto :goto_2

    .line 252
    :cond_5
    iget-object v0, p0, Lo/ctz;->h:Lo/crf;

    invoke-virtual {v0, v6}, Lo/crf;->d(Ljava/util/List;)V

    .line 253
    iget-object v0, p0, Lo/ctz;->h:Lo/crf;

    invoke-virtual {v0}, Lo/crf;->c()V

    .line 255
    :goto_2
    return-void
.end method

.method private c()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lo/ctz;->p:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;

    invoke-direct {p0, v0}, Lo/ctz;->c(Lcom/huawei/hwcloudmodel/model/unite/SyncKey;)V

    .line 87
    return-void
.end method

.method private c(Lcom/huawei/hwcloudmodel/model/unite/SyncKey;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 90
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneByVersion key = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 92
    :cond_0
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneByVersion the key is not right"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    return-void

    .line 96
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getDeviceCode()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 97
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    .line 99
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-gtz v0, :cond_2

    .line 100
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneByVersion the maxVersion is not right , maxVersion is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    return-void

    .line 103
    :cond_2
    iget-object v0, p0, Lo/ctz;->k:Lo/cqm;

    iget v1, p0, Lo/ctz;->d:I

    iget-object v2, p0, Lo/ctz;->e:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v2

    invoke-virtual {v0, v1, v4, v5, v2}, Lo/cqm;->a(IJI)Lo/cnz;

    move-result-object v8

    .line 105
    new-instance v9, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;

    invoke-direct {v9}, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;-><init>()V

    .line 106
    iget-object v0, p0, Lo/ctz;->e:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiSyncOption;->getSyncMethod()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;->setDataType(Ljava/lang/Integer;)V

    .line 107
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;->setDeviceCode(Ljava/lang/Long;)V

    .line 108
    const-string v0, "all"

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;->setCondition(Ljava/lang/String;)V

    .line 112
    const/4 v0, 0x0

    if-ne v0, v8, :cond_3

    .line 113
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;->setVersion(I)V

    .line 114
    invoke-direct {p0, v9, v6, v7}, Lo/ctz;->b(Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;J)V

    goto :goto_0

    .line 115
    :cond_3
    invoke-virtual {v8}, Lo/cnz;->c()J

    move-result-wide v0

    cmp-long v0, v0, v6

    if-gez v0, :cond_4

    .line 116
    invoke-virtual {v8}, Lo/cnz;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;->setVersion(Ljava/lang/Long;)V

    .line 117
    invoke-direct {p0, v9, v6, v7}, Lo/ctz;->b(Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;J)V

    goto :goto_0

    .line 119
    :cond_4
    const-string v0, "HiH_HiSyncTrack"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    :goto_0
    return-void
.end method

.method private d(Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;J)J
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 186
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/ctz;->d(Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionRsp;

    move-result-object v4

    .line 187
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 188
    const-wide/16 v0, -0x1

    return-wide v0

    .line 190
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionRsp;->getDetailInfos()Ljava/util/List;

    move-result-object v5

    .line 191
    if-eqz v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 192
    :cond_1
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadTrack cloudTracks is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    const-wide/16 v0, -0x1

    return-wide v0

    .line 196
    :cond_2
    const-wide/high16 v8, -0x8000000000000000L

    .line 197
    const-wide v10, 0x7fffffffffffffffL

    .line 198
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionRsp;->getCurrentVersion()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_7

    .line 199
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;

    .line 200
    if-nez v13, :cond_3

    goto :goto_0

    .line 201
    :cond_3
    invoke-virtual {v13}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    .line 202
    cmp-long v0, v14, v8

    if-ltz v0, :cond_4

    .line 203
    move-wide v8, v14

    .line 205
    :cond_4
    cmp-long v0, v14, v10

    if-gez v0, :cond_5

    .line 206
    move-wide v10, v14

    .line 208
    :cond_5
    goto :goto_0

    .line 209
    :cond_6
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadTrack maxTempVersion is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " minTempVersion is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    move-wide v6, v8

    goto :goto_1

    .line 212
    :cond_7
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionRsp;->getCurrentVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    .line 215
    :goto_1
    move-object/from16 v0, p0

    iget-wide v0, v0, Lo/ctz;->b:J

    cmp-long v0, v6, v0

    if-gtz v0, :cond_8

    .line 216
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadTrack downloadVersion <= currentVersion , downloadVersion is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 217
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " currentVersion is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget-wide v2, v2, Lo/ctz;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 216
    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    const-wide/16 v0, -0x1

    return-wide v0

    .line 220
    :cond_8
    move-object/from16 v0, p0

    iput-wide v6, v0, Lo/ctz;->b:J

    .line 221
    move-object/from16 v0, p0

    const/4 v1, 0x1

    invoke-direct {v0, v5, v1}, Lo/ctz;->b(Ljava/util/List;Z)V

    .line 222
    return-wide v6
.end method

.method private d(Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionRsp;
    .locals 1

    .line 82
    iget-object v0, p0, Lo/ctz;->i:Lo/czg;

    invoke-virtual {v0, p1}, Lo/czg;->c(Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionRsp;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 308
    iget-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/ctx;->a(Landroid/content/Context;)Lo/ctx;

    move-result-object v0

    iget v1, p0, Lo/ctz;->d:I

    iget-object v2, p0, Lo/ctz;->e:Lcom/huawei/hihealth/HiSyncOption;

    iget v3, p0, Lo/ctz;->g:I

    iget-object v4, p0, Lo/ctz;->f:Lo/csv;

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ctx;->c(ILcom/huawei/hihealth/HiSyncOption;ILo/csv;)V

    .line 310
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "second downLoad() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    iget v0, p0, Lo/ctz;->g:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 312
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "second downLoad 3.0 model"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    iget-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/ctz;->e:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncMethod()I

    move-result v1

    iget-object v2, p0, Lo/ctz;->e:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v2

    invoke-static {v0, v1, v2}, Lo/cui;->d(Landroid/content/Context;II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/ctz;->p:Ljava/util/List;

    goto :goto_0

    .line 314
    :cond_0
    iget v0, p0, Lo/ctz;->g:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 315
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "second downLoad 2.0 model"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 318
    iget-object v0, p0, Lo/ctz;->e:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 319
    iget-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/ctz;->e:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncMethod()I

    move-result v1

    invoke-static {v0, v1, v5}, Lo/cui;->a(Landroid/content/Context;ILjava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/ctz;->p:Ljava/util/List;

    .line 321
    :cond_1
    :goto_0
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "second downLoad() syncKeys is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ctz;->p:Ljava/util/List;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    iget-object v0, p0, Lo/ctz;->p:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/ctz;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 323
    :cond_2
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "second pullDataByVersion() end ! versions is null,stop pullDataByVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 325
    :cond_3
    invoke-direct {p0}, Lo/ctz;->c()V

    .line 327
    :goto_1
    return-void
.end method

.method public d()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 259
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downLoad() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    const-string v0, "SYNC_TRACK_DOWNLOAD_PERCENT_MAX_ALL"

    const-wide v1, 0x4041800000000000L    # 35.0

    invoke-static {v1, v2, v0}, Lo/cuh;->a(DLjava/lang/String;)V

    .line 263
    iget v0, p0, Lo/ctz;->g:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 264
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downLoad 3.0 model"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    iget-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/ctz;->e:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncMethod()I

    move-result v1

    iget-object v2, p0, Lo/ctz;->e:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v2

    invoke-static {v0, v1, v2}, Lo/cui;->d(Landroid/content/Context;II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/ctz;->p:Ljava/util/List;

    goto :goto_0

    .line 266
    :cond_0
    iget v0, p0, Lo/ctz;->g:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 267
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downLoad 2.0 model"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    iget-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/ctw;->e(Landroid/content/Context;)Lo/ctw;

    move-result-object v0

    iget-object v1, p0, Lo/ctz;->e:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ctw;->d(I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/ctz;->p:Ljava/util/List;

    .line 270
    :cond_1
    :goto_0
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() end ! syncKeys is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ctz;->p:Ljava/util/List;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    iget-object v0, p0, Lo/ctz;->p:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/ctz;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 272
    :cond_2
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() end ! versions is null,stop pullDataByVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 274
    :cond_3
    invoke-direct {p0}, Lo/ctz;->c()V

    .line 276
    :goto_1
    iget-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cuh;->b(Landroid/content/Context;)V

    .line 277
    iget-object v0, p0, Lo/ctz;->a:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/cnt;->a(Landroid/content/Context;I)V

    .line 278
    invoke-static {}, Lo/cun;->e()Lo/cun;

    move-result-object v0

    const-string v1, "HiSyncTrack"

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/cun;->d(ILjava/lang/String;Lo/crd;)V

    .line 279
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 331
    new-instance v1, Ljava/lang/StringBuffer;

    const-string v0, "--HiSyncTrack{"

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 332
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 333
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
