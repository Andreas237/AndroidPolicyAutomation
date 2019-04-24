.class public Lo/cto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ctj;


# instance fields
.field private a:I

.field private b:Lo/cqm;

.field private c:Landroid/content/Context;

.field private d:Lo/czg;

.field private e:Lcom/huawei/hihealth/HiSyncOption;

.field private f:Lo/csz;

.field private g:Lo/crf;

.field private h:Lo/cpv;

.field private i:Lo/cqg;

.field private k:Lo/css;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SyncKey;>;"
        }
    .end annotation
.end field

.field private m:I

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private o:Lo/cqh;

.field private p:Lo/cpy;

.field private s:Z

.field private t:I


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
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cto;->s:Z

    .line 86
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HiSyncMultiHealth create"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/cto;->c:Landroid/content/Context;

    .line 88
    iput-object p2, p0, Lo/cto;->e:Lcom/huawei/hihealth/HiSyncOption;

    .line 89
    iput p3, p0, Lo/cto;->a:I

    .line 90
    invoke-direct {p0}, Lo/cto;->f()V

    .line 91
    return-void
.end method

.method private a(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 443
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 444
    const/16 v0, 0x7f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 445
    const/16 v0, 0x7f5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 446
    const/16 v0, 0x7f4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 447
    const/16 v0, 0x7f3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 448
    iget-object v0, p0, Lo/cto;->o:Lo/cqh;

    const/16 v1, 0x32

    invoke-virtual {v0, p1, v2, v1}, Lo/cqh;->a(ILjava/util/List;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/huawei/hwcloudmodel/model/unite/SyncKey;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 812
    iget-object v0, p0, Lo/cto;->b:Lo/cqm;

    iget v1, p0, Lo/cto;->a:I

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getType()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/cqm;->b(IIJJ)Z

    .line 813
    invoke-direct {p0, p1}, Lo/cto;->e(Lcom/huawei/hwcloudmodel/model/unite/SyncKey;)V

    .line 814
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 389
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 390
    :cond_0
    return-void

    .line 394
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

    .line 395
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v8

    .line 396
    const-string v0, "modified_time"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 398
    iget-object v0, p0, Lo/cto;->h:Lo/cpv;

    move-wide v1, v8

    move-wide v3, v6

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/cpv;->a(JJI)I

    .line 399
    goto :goto_0

    .line 400
    :cond_2
    return-void
.end method

.method private b(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;J)J
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 322
    iget-object v0, p0, Lo/cto;->d:Lo/czg;

    invoke-virtual {v0, p1}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;

    move-result-object v4

    .line 323
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 324
    const-wide/16 v0, -0x1

    return-wide v0

    .line 326
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->getDetailInfos()Ljava/util/List;

    move-result-object v5

    .line 327
    if-eqz v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 328
    :cond_1
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downOneTypeDataOnce detailInfos is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    const-wide/16 v0, -0x1

    return-wide v0

    .line 332
    :cond_2
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->getCurrentVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    .line 333
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->getType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, v5, v0, v1}, Lo/cto;->e(Ljava/util/List;IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 335
    return-wide v6

    .line 337
    :cond_3
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method private b(I)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 479
    :goto_0
    iget v0, p0, Lo/cto;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 480
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 481
    const/16 v0, 0x7f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 482
    const/16 v0, 0x7f5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 483
    const/16 v0, 0x7f4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 484
    const/16 v0, 0x7f3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 485
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 486
    iget-object v0, p0, Lo/cto;->o:Lo/cqh;

    move v1, p1

    move-object v2, v7

    invoke-static {v8, v9}, Lo/cnk;->d(J)J

    move-result-wide v3

    invoke-static {v8, v9}, Lo/cnk;->i(J)J

    move-result-wide v5

    invoke-virtual/range {v0 .. v6}, Lo/cqh;->a(ILjava/util/List;JJ)Ljava/util/List;

    move-result-object v10

    .line 487
    const/4 v0, 0x0

    if-eq v0, v10, :cond_2

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 488
    :cond_0
    const/16 v0, 0xb

    const/4 v1, 0x1

    invoke-direct {p0, v10, p1, v0, v1}, Lo/cto;->e(Ljava/util/List;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 489
    :cond_1
    invoke-direct {p0, v10}, Lo/cto;->c(Ljava/util/List;)V

    .line 490
    goto/16 :goto_0

    .line 491
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/cto;->t:I

    .line 492
    return-void
.end method

.method private b(JJIZ)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 165
    invoke-direct {p0, p1, p2, p3, p4}, Lo/cto;->c(JJ)Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;

    move-result-object v6

    .line 166
    iget-object v0, p0, Lo/cto;->d:Lo/czg;

    invoke-virtual {v0, v6}, Lo/czg;->a(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;

    move-result-object v7

    .line 167
    const/4 v0, 0x0

    invoke-static {v7, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 168
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadSportDataByTime warning"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    return-void

    .line 171
    :cond_0
    if-eqz p6, :cond_1

    .line 173
    iget-object v0, p0, Lo/cto;->b:Lo/cqm;

    iget v1, p0, Lo/cto;->a:I

    move v2, p5

    invoke-static {p1, p2}, Lo/cnk;->a(J)I

    move-result v3

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cqm;->e(IIIJ)Z

    .line 175
    :cond_1
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;->getData()Ljava/util/Map;

    move-result-object v8

    .line 176
    if-eqz v8, :cond_2

    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 177
    :cond_2
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneByTime stringListMap is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    return-void

    .line 180
    :cond_3
    const/4 v0, 0x1

    invoke-direct {p0, v8, v0}, Lo/cto;->c(Ljava/util/Map;Z)V

    .line 181
    iget-object v0, p0, Lo/cto;->g:Lo/crf;

    invoke-virtual {v0}, Lo/crf;->e()V

    .line 182
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 501
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 502
    :cond_0
    return-void

    .line 506
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

    .line 507
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v8

    .line 508
    const-string v0, "modified_time"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 509
    iget-object v0, p0, Lo/cto;->p:Lo/cpy;

    move-wide v1, v8

    move-wide v3, v6

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/cpy;->d(JJI)I

    .line 510
    goto :goto_0

    .line 511
    :cond_2
    return-void
.end method

.method private c(IJJ)Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;
    .locals 2

    .line 229
    new-instance v1, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;

    invoke-direct {v1}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;-><init>()V

    .line 230
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->setQueryType(Ljava/lang/Integer;)V

    .line 231
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->setDataType(Ljava/lang/Integer;)V

    .line 232
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->setStartTime(Ljava/lang/Long;)V

    .line 233
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->setEndTime(Ljava/lang/Long;)V

    .line 234
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;->setType(Ljava/lang/Integer;)V

    .line 235
    return-object v1
.end method

.method private c(JJ)Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;
    .locals 4

    .line 239
    new-instance v2, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;

    invoke-direct {v2}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;-><init>()V

    .line 240
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->setQueryType(Ljava/lang/Integer;)V

    .line 241
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->setDataType(Ljava/lang/Integer;)V

    .line 242
    invoke-static {p1, p2}, Lo/cnk;->a(J)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->setStartTime(Ljava/lang/Long;)V

    .line 243
    invoke-static {p3, p4}, Lo/cnk;->a(J)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->setEndTime(Ljava/lang/Long;)V

    .line 244
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 245
    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 246
    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 247
    const/16 v0, 0x8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 248
    invoke-virtual {v2, v3}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->setSportTypes(Ljava/util/Set;)V

    .line 249
    return-object v2
.end method

.method private c(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 514
    :goto_0
    iget v0, p0, Lo/cto;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 515
    invoke-direct {p0, p1}, Lo/cto;->d(I)Ljava/util/List;

    move-result-object v2

    .line 516
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 517
    goto :goto_1

    .line 519
    :cond_0
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-direct {p0, v2, p1, v0, v1}, Lo/cto;->e(Ljava/util/List;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 520
    goto :goto_1

    .line 522
    :cond_1
    invoke-direct {p0, v2}, Lo/cto;->b(Ljava/util/List;)V

    .line 523
    goto :goto_0

    .line 524
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/cto;->t:I

    .line 525
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 452
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 453
    :cond_0
    return-void

    .line 457
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

    .line 458
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v8

    .line 459
    const-string v0, "modified_time"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 460
    iget-object v0, p0, Lo/cto;->o:Lo/cqh;

    move-wide v1, v8

    move-wide v3, v6

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/cqh;->a(JJI)I

    .line 461
    goto :goto_0

    .line 462
    :cond_2
    return-void
.end method

.method private c(Ljava/util/Map;Z)V
    .locals 6
    .param p1    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportDetail;>;>;Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 203
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 204
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 205
    goto :goto_0

    .line 207
    :cond_1
    iget-object v0, p0, Lo/cto;->f:Lo/csz;

    iget v1, p0, Lo/cto;->a:I

    const/4 v2, 0x2

    invoke-virtual {v0, v4, v1, v2}, Lo/csz;->b(Ljava/util/List;II)Ljava/util/List;

    move-result-object v5

    .line 208
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 209
    goto :goto_0

    .line 212
    :cond_2
    invoke-static {}, Lo/cui;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez p2, :cond_3

    .line 213
    iget-object v0, p0, Lo/cto;->c:Landroid/content/Context;

    iget v1, p0, Lo/cto;->a:I

    const/4 v2, 0x1

    invoke-static {v0, v5, v2, v1}, Lo/cth;->b(Landroid/content/Context;Ljava/util/List;II)V

    .line 214
    goto :goto_0

    .line 216
    :cond_3
    iget-object v0, p0, Lo/cto;->g:Lo/crf;

    iget v1, p0, Lo/cto;->a:I

    invoke-virtual {v0, v5, v1}, Lo/crf;->a(Ljava/util/List;I)I

    .line 218
    if-eqz p2, :cond_4

    .line 219
    iget-object v0, p0, Lo/cto;->g:Lo/crf;

    invoke-virtual {v0, v5}, Lo/crf;->c(Ljava/util/List;)V

    .line 220
    iget-object v0, p0, Lo/cto;->g:Lo/crf;

    invoke-virtual {v0}, Lo/crf;->e()V

    goto :goto_1

    .line 223
    :cond_4
    iget-object v0, p0, Lo/cto;->g:Lo/crf;

    invoke-virtual {v0, v5}, Lo/crf;->d(Ljava/util/List;)V

    .line 225
    :goto_1
    goto/16 :goto_0

    .line 226
    :cond_5
    return-void
.end method

.method private d(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 495
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 496
    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 497
    iget-object v0, p0, Lo/cto;->p:Lo/cpy;

    const/16 v1, 0x32

    invoke-virtual {v0, p1, v2, v1}, Lo/cpy;->b(ILjava/util/List;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private d(IJJZ)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 120
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadEachTypeByTime type is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " startTime is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " endTime is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    iget-boolean v0, p0, Lo/cto;->s:Z

    if-eqz v0, :cond_0

    const/16 v0, 0xc

    if-ne p1, v0, :cond_0

    .line 126
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadEachTypeByTime failed ! overSea  do not support exercise intensity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    return-void

    .line 130
    :cond_0
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 133
    :pswitch_0
    const/16 v8, 0x271f

    .line 134
    goto :goto_1

    .line 136
    :pswitch_1
    const/16 v8, 0x2720

    .line 137
    goto :goto_1

    .line 139
    :pswitch_2
    const/16 v8, 0x2721

    .line 140
    goto :goto_1

    .line 142
    :pswitch_3
    const/16 v8, 0x2724

    .line 143
    goto :goto_1

    .line 145
    :pswitch_4
    const/16 v8, 0x2726

    .line 146
    goto :goto_1

    .line 148
    :goto_0
    :pswitch_5
    move v8, p1

    .line 151
    :goto_1
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "  endTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    if-eqz p6, :cond_1

    .line 153
    iget-object v0, p0, Lo/cto;->b:Lo/cqm;

    iget v1, p0, Lo/cto;->a:I

    move v2, v8

    invoke-static {p4, p5}, Lo/cnk;->a(J)I

    move-result v3

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cqm;->e(IIIJ)Z

    .line 155
    :cond_1
    const/16 v0, 0x271f

    if-ne v0, v8, :cond_2

    .line 157
    move-object v0, p0

    move-wide v1, p2

    move-wide v3, p4

    move v5, v8

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lo/cto;->b(JJIZ)V

    goto :goto_2

    .line 160
    :cond_2
    move-object v0, p0

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move v6, v8

    move v7, p6

    invoke-direct/range {v0 .. v7}, Lo/cto;->e(IJJIZ)V

    .line 162
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_2
        :pswitch_5
        :pswitch_1
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private d(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;J)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 298
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneTypeDataWithMaxVersion rep = "

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

    .line 300
    const/4 v9, 0x0

    .line 302
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lo/cto;->b(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;J)J

    move-result-wide v7

    .line 303
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneTypeDataWithMaxVersion downCurrentVersion = "

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

    .line 304
    add-int/lit8 v9, v9, 0x1

    .line 305
    const-wide/16 v0, -0x1

    cmp-long v0, v7, v0

    if-gtz v0, :cond_1

    .line 306
    return-void

    .line 308
    :cond_1
    iget-object v0, p0, Lo/cto;->b:Lo/cqm;

    iget v1, p0, Lo/cto;->a:I

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->getType()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    move-wide v3, v7

    const-wide/16 v5, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/cqm;->b(IIJJ)Z

    move-result v0

    if-nez v0, :cond_2

    .line 309
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneTypeDataWithMaxVersion saveVersionToDB failed "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    return-void

    .line 312
    :cond_2
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->setVersion(Ljava/lang/Long;)V

    .line 313
    const/16 v0, 0x14

    if-lt v9, v0, :cond_3

    .line 314
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneTypeDataWithMaxVersion pullDataByVersion too many times."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    return-void

    .line 318
    :cond_3
    cmp-long v0, v7, p2

    if-ltz v0, :cond_0

    .line 319
    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 740
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Integer;

    .line 741
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/cto;->i(I)V

    .line 742
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/cto;->l(I)V

    .line 743
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/cto;->b(I)V

    .line 744
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/cto;->f(I)V

    .line 745
    goto :goto_0

    .line 746
    :cond_0
    return-void
.end method

.method private e(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 465
    :goto_0
    iget v0, p0, Lo/cto;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 466
    invoke-direct {p0, p1}, Lo/cto;->a(I)Ljava/util/List;

    move-result-object v2

    .line 467
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 468
    goto :goto_1

    .line 470
    :cond_0
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-direct {p0, v2, p1, v0, v1}, Lo/cto;->e(Ljava/util/List;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 471
    goto :goto_1

    .line 473
    :cond_1
    invoke-direct {p0, v2}, Lo/cto;->c(Ljava/util/List;)V

    .line 474
    goto :goto_0

    .line 475
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/cto;->t:I

    .line 476
    return-void
.end method

.method private e(IJJIZ)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 185
    invoke-direct/range {p0 .. p5}, Lo/cto;->c(IJJ)Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;

    move-result-object v6

    .line 186
    iget-object v0, p0, Lo/cto;->d:Lo/czg;

    invoke-virtual {v0, v6}, Lo/czg;->a(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;

    move-result-object v7

    .line 187
    const/4 v0, 0x0

    invoke-static {v7, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 188
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadHealthDataByTime error type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    return-void

    .line 191
    :cond_0
    if-eqz p7, :cond_1

    .line 192
    iget-object v0, p0, Lo/cto;->b:Lo/cqm;

    iget v1, p0, Lo/cto;->a:I

    move v2, p6

    invoke-static {p2, p3}, Lo/cnk;->a(J)I

    move-result v3

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cqm;->e(IIIJ)Z

    .line 194
    :cond_1
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;->getDetailInfos()Ljava/util/List;

    move-result-object v8

    .line 195
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 196
    :cond_2
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadHealthDataByTime data error type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    return-void

    .line 199
    :cond_3
    const/4 v0, 0x1

    invoke-direct {p0, v8, p1, v0}, Lo/cto;->e(Ljava/util/List;IZ)Z

    .line 200
    return-void
.end method

.method private e(Lcom/huawei/hwcloudmodel/model/unite/SyncKey;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 272
    if-nez p1, :cond_0

    return-void

    .line 273
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 274
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 275
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneTypeDataByVersion type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " maxVersion is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-gtz v0, :cond_1

    .line 277
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneTypeDataByVersion cloud has no such data ,type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    return-void

    .line 280
    :cond_1
    new-instance v7, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;

    invoke-direct {v7}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;-><init>()V

    .line 281
    iget-object v0, p0, Lo/cto;->e:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiSyncOption;->getSyncMethod()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->setDataType(Ljava/lang/Integer;)V

    .line 282
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->setType(Ljava/lang/Integer;)V

    .line 283
    iget-object v0, p0, Lo/cto;->b:Lo/cqm;

    iget v1, p0, Lo/cto;->a:I

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cqm;->a(IJI)Lo/cnz;

    move-result-object v8

    .line 284
    const/4 v0, 0x0

    if-ne v0, v8, :cond_2

    .line 285
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->setVersion(Ljava/lang/Long;)V

    .line 286
    invoke-direct {p0, v7, v5, v6}, Lo/cto;->d(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;J)V

    goto :goto_0

    .line 288
    :cond_2
    invoke-virtual {v8}, Lo/cnz;->c()J

    move-result-wide v0

    cmp-long v0, v0, v5

    if-gez v0, :cond_3

    .line 289
    invoke-virtual {v8}, Lo/cnz;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->setVersion(Ljava/lang/Long;)V

    .line 290
    invoke-direct {p0, v7, v5, v6}, Lo/cto;->d(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;J)V

    goto :goto_0

    .line 292
    :cond_3
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "do not need downloadOneTypeDataByVersion data,type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " DBversion is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lo/cnz;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " maxVersion is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 293
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 292
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    :goto_0
    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 375
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 376
    :cond_0
    return-void

    .line 380
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

    .line 381
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v8

    .line 382
    const-string v0, "modified_time"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 384
    iget-object v0, p0, Lo/cto;->i:Lo/cqg;

    move-wide v1, v8

    move-wide v3, v6

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/cqg;->a(JJI)I

    .line 385
    goto :goto_0

    .line 386
    :cond_2
    return-void
.end method

.method private e(Ljava/util/List;IIZ)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;IIZ)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 407
    iget-boolean v0, p0, Lo/cto;->s:Z

    if-eqz v0, :cond_0

    const/16 v0, 0xc

    if-ne p3, v0, :cond_0

    .line 408
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addHealthData failed ! overSea do not support exercise intensity upload"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 409
    const/4 v0, 0x0

    return v0

    .line 411
    :cond_0
    if-nez p4, :cond_1

    iget-boolean v0, p0, Lo/cto;->s:Z

    if-nez v0, :cond_2

    .line 412
    :cond_1
    iget v0, p0, Lo/cto;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cto;->m:I

    iget-object v1, p0, Lo/cto;->e:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v1

    invoke-static {v0, v1}, Lo/cui;->a(II)V

    goto :goto_0

    .line 414
    :cond_2
    iget v0, p0, Lo/cto;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cto;->m:I

    const/16 v1, 0x14

    if-ge v1, v0, :cond_3

    .line 415
    iget v0, p0, Lo/cto;->t:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/cto;->t:I

    .line 416
    const/4 v0, 0x0

    return v0

    .line 419
    :cond_3
    :goto_0
    iget-object v0, p0, Lo/cto;->k:Lo/css;

    invoke-virtual {v0, p1, p2, p3}, Lo/css;->d(Ljava/util/List;II)Ljava/util/List;

    move-result-object v4

    .line 420
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 421
    :cond_4
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addHealthData healthDetails is null or empty cloudType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " clientId is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 422
    const/4 v0, 0x0

    return v0

    .line 424
    :cond_5
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;-><init>()V

    .line 425
    invoke-virtual {v5, v4}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;->setDetailInfo(Ljava/util/List;)V

    .line 426
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;->setTimeZone(Ljava/lang/String;)V

    .line 428
    :goto_1
    iget v0, p0, Lo/cto;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_7

    .line 429
    iget-object v0, p0, Lo/cto;->d:Lo/czg;

    invoke-virtual {v0, v5}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;)Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;

    move-result-object v6

    .line 431
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_6

    .line 432
    iget v0, p0, Lo/cto;->t:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cto;->t:I

    .line 433
    goto :goto_1

    .line 435
    :cond_6
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDataToCloud OK ! uploadCount is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/cto;->m:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " type is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", date size = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 436
    const/4 v0, 0x1

    return v0

    .line 438
    :cond_7
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDataToCloud failed ! uploadCount is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/cto;->m:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " type is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", date size = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 439
    const/4 v0, 0x0

    return v0
.end method

.method private e(Ljava/util/List;IZ)Z
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;>;IZ)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 341
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 342
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;

    .line 343
    if-nez v5, :cond_1

    .line 344
    goto :goto_0

    .line 347
    :cond_1
    iget-object v0, p0, Lo/cto;->k:Lo/css;

    iget v1, p0, Lo/cto;->a:I

    invoke-virtual {v0, v5, v1}, Lo/css;->c(Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;I)Ljava/util/List;

    move-result-object v6

    .line 348
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 349
    goto :goto_0

    .line 355
    :cond_2
    invoke-static {}, Lo/cui;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez p3, :cond_3

    invoke-direct {p0, p2}, Lo/cto;->o(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 356
    iget-object v0, p0, Lo/cto;->c:Landroid/content/Context;

    iget v1, p0, Lo/cto;->a:I

    const/16 v2, 0x2711

    invoke-static {v0, v6, v2, v1}, Lo/cth;->b(Landroid/content/Context;Ljava/util/List;II)V

    .line 357
    goto :goto_0

    .line 359
    :cond_3
    iget-object v0, p0, Lo/cto;->g:Lo/crf;

    iget v1, p0, Lo/cto;->a:I

    invoke-virtual {v0, v6, v1}, Lo/crf;->a(Ljava/util/List;I)I

    .line 360
    const/4 v0, 0x7

    if-eq p2, v0, :cond_4

    const/4 v0, 0x3

    if-eq p2, v0, :cond_4

    const/16 v0, 0x9

    if-eq p2, v0, :cond_4

    const/16 v0, 0xb

    if-eq p2, v0, :cond_4

    const/16 v0, 0xc

    if-ne p2, v0, :cond_5

    .line 362
    :cond_4
    invoke-interface {v3, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 364
    :cond_5
    goto/16 :goto_0

    .line 367
    :cond_6
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 368
    iget-object v0, p0, Lo/cto;->g:Lo/crf;

    invoke-virtual {v0, v3}, Lo/crf;->c(Ljava/util/List;)V

    .line 369
    iget-object v0, p0, Lo/cto;->g:Lo/crf;

    invoke-virtual {v0}, Lo/crf;->e()V

    .line 371
    :cond_7
    const/4 v0, 0x1

    return v0
.end method

.method private f()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 94
    invoke-static {}, Lo/cui;->d()Z

    move-result v0

    iput-boolean v0, p0, Lo/cto;->s:Z

    .line 95
    iget-object v0, p0, Lo/cto;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lo/cto;->d:Lo/czg;

    .line 96
    iget-object v0, p0, Lo/cto;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqm;->e(Landroid/content/Context;)Lo/cqm;

    move-result-object v0

    iput-object v0, p0, Lo/cto;->b:Lo/cqm;

    .line 97
    new-instance v0, Lo/csz;

    iget-object v1, p0, Lo/cto;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/csz;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/cto;->f:Lo/csz;

    .line 98
    iget-object v0, p0, Lo/cto;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqg;->c(Landroid/content/Context;)Lo/cqg;

    move-result-object v0

    iput-object v0, p0, Lo/cto;->i:Lo/cqg;

    .line 99
    iget-object v0, p0, Lo/cto;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    iput-object v0, p0, Lo/cto;->g:Lo/crf;

    .line 100
    iget-object v0, p0, Lo/cto;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cpv;->c(Landroid/content/Context;)Lo/cpv;

    move-result-object v0

    iput-object v0, p0, Lo/cto;->h:Lo/cpv;

    .line 101
    new-instance v0, Lo/css;

    iget-object v1, p0, Lo/cto;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/css;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/cto;->k:Lo/css;

    .line 102
    iget-object v0, p0, Lo/cto;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqh;->d(Landroid/content/Context;)Lo/cqh;

    move-result-object v0

    iput-object v0, p0, Lo/cto;->o:Lo/cqh;

    .line 103
    iget-object v0, p0, Lo/cto;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cpy;->d(Landroid/content/Context;)Lo/cpy;

    move-result-object v0

    iput-object v0, p0, Lo/cto;->p:Lo/cpy;

    .line 104
    invoke-direct {p0}, Lo/cto;->h()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/cto;->n:Ljava/util/List;

    .line 105
    return-void
.end method

.method private f(I)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 528
    :goto_0
    iget v0, p0, Lo/cto;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 529
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 530
    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 531
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 532
    iget-object v0, p0, Lo/cto;->p:Lo/cpy;

    move v1, p1

    move-object v2, v7

    invoke-static {v8, v9}, Lo/cnk;->d(J)J

    move-result-wide v3

    invoke-static {v8, v9}, Lo/cnk;->i(J)J

    move-result-wide v5

    invoke-virtual/range {v0 .. v6}, Lo/cpy;->a(ILjava/util/List;JJ)Ljava/util/List;

    move-result-object v10

    .line 533
    const/4 v0, 0x0

    if-eq v0, v10, :cond_2

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 534
    :cond_0
    const/16 v0, 0xc

    const/4 v1, 0x1

    invoke-direct {p0, v10, p1, v0, v1}, Lo/cto;->e(Ljava/util/List;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 535
    :cond_1
    invoke-direct {p0, v10}, Lo/cto;->b(Ljava/util/List;)V

    .line 536
    goto :goto_0

    .line 537
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/cto;->t:I

    .line 538
    return-void
.end method

.method private g(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 542
    :goto_0
    iget v0, p0, Lo/cto;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 543
    invoke-direct {p0, p1}, Lo/cto;->h(I)Ljava/util/List;

    move-result-object v2

    .line 544
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 545
    goto :goto_1

    .line 547
    :cond_0
    const/16 v0, 0x9

    const/4 v1, 0x0

    invoke-direct {p0, v2, p1, v0, v1}, Lo/cto;->e(Ljava/util/List;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 548
    goto :goto_1

    .line 550
    :cond_1
    invoke-direct {p0, v2}, Lo/cto;->a(Ljava/util/List;)V

    .line 551
    goto :goto_0

    .line 552
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/cto;->t:I

    .line 553
    return-void
.end method

.method private h()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 108
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 109
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    const/16 v0, 0x9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    const/16 v0, 0xb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    iget-boolean v0, p0, Lo/cto;->s:Z

    if-nez v0, :cond_0

    .line 114
    const/16 v0, 0xc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    :cond_0
    return-object v1
.end method

.method private h(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 579
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 580
    const/16 v0, 0x5655

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 581
    const/16 v0, 0x5656

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 582
    const/16 v0, 0x5657

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 583
    const/16 v0, 0x5658

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 584
    const/16 v0, 0x5659

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 585
    iget-object v0, p0, Lo/cto;->h:Lo/cpv;

    const/16 v1, 0xc8

    invoke-virtual {v0, p1, v2, v1}, Lo/cpv;->c(ILjava/util/List;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private i(I)V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 556
    :goto_0
    iget v0, p0, Lo/cto;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 557
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 558
    const/16 v0, 0x5655

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 559
    const/16 v0, 0x5656

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 560
    const/16 v0, 0x5657

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 561
    const/16 v0, 0x5658

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 562
    const/16 v0, 0x5659

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 563
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 564
    invoke-static {v8, v9}, Lo/cnk;->m(J)J

    move-result-wide v10

    .line 565
    invoke-static {v8, v9}, Lo/cnk;->p(J)J

    move-result-wide v12

    .line 566
    iget-object v0, p0, Lo/cto;->h:Lo/cpv;

    move/from16 v1, p1

    move-object v2, v7

    move-wide v3, v10

    move-wide v5, v12

    invoke-virtual/range {v0 .. v6}, Lo/cpv;->d(ILjava/util/List;JJ)Ljava/util/List;

    move-result-object v14

    .line 567
    const/4 v0, 0x0

    if-eq v0, v14, :cond_2

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 568
    goto :goto_1

    .line 570
    :cond_0
    move/from16 v0, p1

    const/16 v1, 0x9

    const/4 v2, 0x1

    invoke-direct {p0, v14, v0, v1, v2}, Lo/cto;->e(Ljava/util/List;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 571
    goto :goto_1

    .line 573
    :cond_1
    invoke-direct {p0, v14}, Lo/cto;->a(Ljava/util/List;)V

    .line 574
    goto/16 :goto_0

    .line 575
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/cto;->t:I

    .line 576
    return-void
.end method

.method private k(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 590
    :goto_0
    iget v0, p0, Lo/cto;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 591
    invoke-direct {p0, p1}, Lo/cto;->n(I)Ljava/util/List;

    move-result-object v2

    .line 592
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 593
    goto :goto_1

    .line 595
    :cond_0
    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-direct {p0, v2, p1, v0, v1}, Lo/cto;->e(Ljava/util/List;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 596
    goto :goto_1

    .line 598
    :cond_1
    invoke-direct {p0, v2}, Lo/cto;->e(Ljava/util/List;)V

    .line 599
    goto :goto_0

    .line 600
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/cto;->t:I

    .line 601
    return-void
.end method

.method private l(I)V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 604
    :goto_0
    iget v0, p0, Lo/cto;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 605
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 606
    const/16 v0, 0x7d2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 607
    const/16 v0, 0x7e2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 608
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 609
    invoke-static {v8, v9}, Lo/cnk;->d(J)J

    move-result-wide v10

    .line 610
    invoke-static {v8, v9}, Lo/cnk;->i(J)J

    move-result-wide v12

    .line 611
    iget-object v0, p0, Lo/cto;->i:Lo/cqg;

    move/from16 v1, p1

    move-object v2, v7

    move-wide v3, v10

    move-wide v5, v12

    invoke-virtual/range {v0 .. v6}, Lo/cqg;->d(ILjava/util/List;JJ)Ljava/util/List;

    move-result-object v14

    .line 612
    const/4 v0, 0x0

    if-eq v0, v14, :cond_2

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 613
    goto :goto_1

    .line 615
    :cond_0
    move/from16 v0, p1

    const/4 v1, 0x7

    const/4 v2, 0x1

    invoke-direct {p0, v14, v0, v1, v2}, Lo/cto;->e(Ljava/util/List;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 616
    goto :goto_1

    .line 618
    :cond_1
    invoke-direct {p0, v14}, Lo/cto;->e(Ljava/util/List;)V

    .line 619
    goto :goto_0

    .line 620
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/cto;->t:I

    .line 621
    return-void
.end method

.method private m()Z
    .locals 1

    .line 808
    iget-object v0, p0, Lo/cto;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqd;->d(Landroid/content/Context;)Lo/cqd;

    move-result-object v0

    invoke-virtual {v0}, Lo/cqd;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private n(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 624
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 626
    const/16 v0, 0x7d2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 627
    const/16 v0, 0x7e2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 628
    iget-object v0, p0, Lo/cto;->i:Lo/cqg;

    const/16 v1, 0xc8

    invoke-virtual {v0, p1, v2, v1}, Lo/cqg;->d(ILjava/util/List;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private o(I)Z
    .locals 1

    .line 817
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 819
    :sswitch_0
    const/4 v0, 0x1

    return v0

    .line 821
    :goto_0
    const/4 v0, 0x0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_0
    .end sparse-switch
.end method

.method private p()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 253
    iget-object v0, p0, Lo/cto;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;

    .line 254
    invoke-direct {p0, v2}, Lo/cto;->e(Lcom/huawei/hwcloudmodel/model/unite/SyncKey;)V

    .line 255
    goto :goto_0

    .line 256
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 682
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 683
    invoke-static {}, Lo/csk;->e()Z

    move-result v4

    .line 684
    if-nez v4, :cond_0

    .line 685
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() healthDataPrivacy switch is closed, can not pushData right now, push end!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 686
    return-void

    .line 688
    :cond_0
    iget-object v0, p0, Lo/cto;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    iget v1, p0, Lo/cto;->a:I

    invoke-virtual {v0, v1}, Lo/cpw;->a(I)Ljava/util/List;

    move-result-object v5

    .line 689
    const/4 v0, 0x0

    if-eq v0, v5, :cond_7

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 690
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clientid list size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 691
    iget-boolean v0, p0, Lo/cto;->s:Z

    if-nez v0, :cond_2

    .line 692
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    .line 693
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/cto;->g(I)V

    .line 694
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/cto;->k(I)V

    .line 695
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/cto;->e(I)V

    .line 696
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/cto;->c(I)V

    .line 697
    goto :goto_0

    :cond_1
    goto/16 :goto_5

    .line 699
    :cond_2
    invoke-direct {p0, v5}, Lo/cto;->d(Ljava/util/List;)V

    .line 700
    const/4 v0, 0x0

    iput v0, p0, Lo/cto;->m:I

    .line 701
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    .line 702
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/cto;->g(I)V

    .line 703
    goto :goto_1

    .line 704
    :cond_3
    const/4 v0, 0x0

    iput v0, p0, Lo/cto;->m:I

    .line 705
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    .line 706
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/cto;->k(I)V

    .line 707
    goto :goto_2

    .line 708
    :cond_4
    const/4 v0, 0x0

    iput v0, p0, Lo/cto;->m:I

    .line 709
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    .line 710
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/cto;->e(I)V

    .line 711
    goto :goto_3

    .line 712
    :cond_5
    const/4 v0, 0x0

    iput v0, p0, Lo/cto;->m:I

    .line 713
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    .line 714
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/cto;->c(I)V

    .line 715
    goto :goto_4

    :cond_6
    goto :goto_5

    .line 719
    :cond_7
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() end ! no client get, maybe no data need to pushData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 721
    :goto_5
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 722
    const/16 v0, 0x9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 723
    const/16 v0, 0xb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 724
    iget-boolean v0, p0, Lo/cto;->s:Z

    if-nez v0, :cond_8

    .line 725
    const/16 v0, 0xc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 727
    :cond_8
    iget-object v0, p0, Lo/cto;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/cto;->e:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncMethod()I

    move-result v1

    invoke-static {v0, v1, v6}, Lo/cui;->a(Landroid/content/Context;ILjava/util/List;)Ljava/util/List;

    move-result-object v7

    .line 728
    invoke-static {v7}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 729
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadTwice error keys"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 730
    return-void

    .line 732
    :cond_9
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadTwice begin version="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 733
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;

    .line 734
    invoke-direct {p0, v9}, Lo/cto;->e(Lcom/huawei/hwcloudmodel/model/unite/SyncKey;)V

    .line 735
    goto :goto_6

    .line 736
    :cond_a
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 737
    return-void
.end method

.method public b()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 784
    iget-object v0, p0, Lo/cto;->b:Lo/cqm;

    iget v1, p0, Lo/cto;->a:I

    const-wide/16 v2, 0x0

    const/16 v4, 0x2721

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cqm;->c(IJI)Lo/cnz;

    move-result-object v7

    .line 785
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 786
    invoke-virtual {v7}, Lo/cnz;->d()I

    move-result v0

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v8

    .line 787
    move-object v0, p0

    const/4 v1, 0x7

    invoke-static {v8, v9, v1}, Lo/cui;->c(JI)J

    move-result-wide v2

    move-wide v4, v8

    const/4 v1, 0x7

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v6}, Lo/cto;->d(IJJZ)V

    .line 789
    :cond_0
    return-void
.end method

.method public b(JJI)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 849
    invoke-direct {p0, p1, p2, p3, p4}, Lo/cto;->c(JJ)Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;

    move-result-object v4

    .line 850
    iget-object v0, p0, Lo/cto;->d:Lo/czg;

    invoke-virtual {v0, v4}, Lo/czg;->a(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;

    move-result-object v5

    .line 851
    const/4 v0, 0x0

    invoke-static {v5, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 852
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadSportDataByTimeNoUpdateTime warning"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 853
    return-void

    .line 855
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;->getData()Ljava/util/Map;

    move-result-object v6

    .line 856
    if-eqz v6, :cond_1

    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 857
    :cond_1
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadSportDataByTimeNoUpdateTime stringListMap is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 858
    return-void

    .line 860
    :cond_2
    const/4 v0, 0x1

    invoke-direct {p0, v6, v0}, Lo/cto;->c(Ljava/util/Map;Z)V

    .line 861
    iget-object v0, p0, Lo/cto;->g:Lo/crf;

    invoke-virtual {v0}, Lo/crf;->e()V

    .line 862
    return-void
.end method

.method public c()V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 756
    iget-object v0, p0, Lo/cto;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/cto;->e:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncMethod()I

    move-result v1

    iget-object v2, p0, Lo/cto;->n:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lo/cui;->a(Landroid/content/Context;ILjava/util/List;)Ljava/util/List;

    move-result-object v7

    .line 757
    if-eqz v7, :cond_0

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 758
    :cond_0
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() keys is null,stop pullDataByVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 760
    :cond_1
    const/4 v8, 0x0

    :goto_0
    iget-object v0, p0, Lo/cto;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_2

    .line 761
    iget-object v0, p0, Lo/cto;->b:Lo/cqm;

    iget v1, p0, Lo/cto;->a:I

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;

    invoke-virtual {v2}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getType()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;

    invoke-virtual {v3}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getVersion()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/cqm;->b(IIJJ)Z

    .line 760
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 764
    :cond_2
    :goto_1
    return-void
.end method

.method public d()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 633
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 635
    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 636
    const/16 v0, 0x9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 637
    const/16 v0, 0xb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 638
    iget-boolean v0, p0, Lo/cto;->s:Z

    if-nez v0, :cond_0

    .line 639
    const/16 v0, 0xc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 641
    :cond_0
    iget-object v0, p0, Lo/cto;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/ctw;->e(Landroid/content/Context;)Lo/ctw;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/ctw;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/cto;->l:Ljava/util/List;

    .line 642
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() syncKeys is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cto;->l:Ljava/util/List;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 643
    iget-object v0, p0, Lo/cto;->l:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/cto;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 644
    :cond_1
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() keys is null,stop pullDataByVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 646
    :cond_2
    invoke-direct {p0}, Lo/cto;->p()V

    .line 648
    :goto_0
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 649
    return-void
.end method

.method public e()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 771
    iget-object v0, p0, Lo/cto;->b:Lo/cqm;

    iget v1, p0, Lo/cto;->a:I

    const-wide/16 v2, 0x0

    const/16 v4, 0x2720

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cqm;->c(IJI)Lo/cnz;

    move-result-object v7

    .line 772
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 773
    invoke-virtual {v7}, Lo/cnz;->d()I

    move-result v0

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v8

    .line 774
    move-object v0, p0

    const/4 v1, 0x7

    invoke-static {v8, v9, v1}, Lo/cui;->c(JI)J

    move-result-wide v2

    move-wide v4, v8

    const/16 v1, 0x9

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v6}, Lo/cto;->d(IJJZ)V

    .line 776
    :cond_0
    iget-object v0, p0, Lo/cto;->b:Lo/cqm;

    iget v1, p0, Lo/cto;->a:I

    const-wide/16 v2, 0x0

    const/16 v4, 0x271f

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cqm;->c(IJI)Lo/cnz;

    move-result-object v8

    .line 777
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    .line 778
    invoke-virtual {v8}, Lo/cnz;->d()I

    move-result v0

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v9

    .line 779
    move-object v0, p0

    const/4 v1, 0x7

    invoke-static {v9, v10, v1}, Lo/cui;->c(JI)J

    move-result-wide v2

    move-wide v4, v9

    const/4 v1, 0x3

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v6}, Lo/cto;->d(IJJZ)V

    .line 781
    :cond_1
    return-void
.end method

.method public e(II)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 767
    move-object v0, p0

    invoke-static {p1}, Lo/cnk;->b(I)J

    move-result-wide v2

    invoke-static {p2}, Lo/cnk;->b(I)J

    move-result-wide v4

    const/4 v1, 0x1

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v6}, Lo/cto;->d(IJJZ)V

    .line 768
    return-void
.end method

.method public e(IJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 865
    move-object v0, p0

    move v1, p1

    const/4 v2, 0x1

    invoke-static {p2, p3, v2}, Lo/cui;->c(JI)J

    move-result-wide v2

    move-wide v4, p2

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lo/cto;->d(IJJZ)V

    .line 866
    return-void
.end method

.method public e(J)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 869
    move-object v0, p0

    const/4 v1, 0x2

    invoke-static {p1, p2, v1}, Lo/cui;->c(JI)J

    move-result-wide v2

    move-wide v4, p1

    const/16 v1, 0x9

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lo/cto;->d(IJJZ)V

    .line 870
    move-object v0, p0

    const/4 v1, 0x2

    invoke-static {p1, p2, v1}, Lo/cui;->c(JI)J

    move-result-wide v2

    move-wide v4, p1

    const/4 v1, 0x3

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lo/cto;->d(IJJZ)V

    .line 871
    return-void
.end method

.method public e(JJ)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 653
    iget-object v0, p0, Lo/cto;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/ctw;->e(Landroid/content/Context;)Lo/ctw;

    move-result-object v0

    iget-object v1, p0, Lo/cto;->n:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/ctw;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/cto;->l:Ljava/util/List;

    .line 654
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByTime syncKeys is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cto;->l:Ljava/util/List;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 655
    iget-object v0, p0, Lo/cto;->l:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cto;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 656
    :cond_0
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByTime() keys is null,stop pullDataByVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 657
    return-void

    .line 659
    :cond_1
    iget-object v0, p0, Lo/cto;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;

    .line 660
    invoke-virtual {v8}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 661
    invoke-virtual {v8}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    .line 662
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByTime type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " maxVersion is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 663
    const-wide/16 v0, 0x0

    cmp-long v0, v10, v0

    if-gtz v0, :cond_2

    .line 664
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByTime cloud has no such data ,type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 666
    goto :goto_0

    .line 668
    :cond_2
    invoke-static {}, Lo/cui;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 669
    const/4 v0, 0x7

    if-ne v0, v9, :cond_3

    .line 670
    invoke-direct {p0}, Lo/cto;->m()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 671
    invoke-direct {p0, v8}, Lo/cto;->a(Lcom/huawei/hwcloudmodel/model/unite/SyncKey;)V

    .line 672
    goto/16 :goto_0

    .line 676
    :cond_3
    move-object v0, p0

    move v1, v9

    invoke-static {p1, p2}, Lo/cnk;->d(J)J

    move-result-wide v2

    move-wide v4, p3

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v6}, Lo/cto;->d(IJJZ)V

    .line 677
    goto/16 :goto_0

    .line 678
    :cond_4
    return-void
.end method

.method public g()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 792
    iget-object v0, p0, Lo/cto;->b:Lo/cqm;

    iget v1, p0, Lo/cto;->a:I

    const-wide/16 v2, 0x0

    const/16 v4, 0x2726

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cqm;->c(IJI)Lo/cnz;

    move-result-object v7

    .line 793
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 794
    invoke-virtual {v7}, Lo/cnz;->d()I

    move-result v0

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v8

    .line 795
    move-object v0, p0

    const/4 v1, 0x7

    invoke-static {v8, v9, v1}, Lo/cui;->c(JI)J

    move-result-wide v2

    move-wide v4, v8

    const/16 v1, 0xc

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v6}, Lo/cto;->d(IJJZ)V

    .line 797
    :cond_0
    return-void
.end method

.method public i()Z
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 826
    iget-object v0, p0, Lo/cto;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/ctv;->a(Landroid/content/Context;)Lo/ctv;

    move-result-object v0

    iget v1, p0, Lo/cto;->a:I

    invoke-virtual {v0, v1}, Lo/ctv;->a(I)Ljava/util/List;

    move-result-object v6

    .line 827
    invoke-static {v6}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 829
    const/4 v0, 0x1

    return v0

    .line 831
    :cond_0
    iget-object v0, p0, Lo/cto;->b:Lo/cqm;

    iget v1, p0, Lo/cto;->a:I

    const-wide/16 v2, 0x0

    const/16 v4, 0x271f

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cqm;->c(IJI)Lo/cnz;

    move-result-object v7

    .line 832
    const/4 v0, 0x0

    if-ne v0, v7, :cond_1

    .line 834
    const/4 v0, 0x1

    return v0

    .line 836
    :cond_1
    invoke-virtual {v7}, Lo/cnz;->d()I

    move-result v8

    .line 837
    const-string v0, "HiH_HiSyncMultiHealth"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadSevenSleepDetailData days="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", already download day="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 838
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/Integer;

    .line 839
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ge v0, v8, :cond_2

    .line 840
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide v11

    .line 841
    const/16 v13, 0x271f

    .line 842
    move-object v0, p0

    invoke-static {v11, v12}, Lo/cnk;->b(J)J

    move-result-wide v1

    invoke-static {v11, v12}, Lo/cnk;->i(J)J

    move-result-wide v3

    move v5, v13

    const/16 v5, 0x271f

    invoke-virtual/range {v0 .. v5}, Lo/cto;->b(JJI)V

    .line 844
    :cond_2
    goto :goto_0

    .line 845
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public k()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 800
    iget-object v0, p0, Lo/cto;->b:Lo/cqm;

    iget v1, p0, Lo/cto;->a:I

    const-wide/16 v2, 0x0

    const/16 v4, 0x2724

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cqm;->c(IJI)Lo/cnz;

    move-result-object v7

    .line 801
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 802
    invoke-virtual {v7}, Lo/cnz;->d()I

    move-result v0

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v8

    .line 803
    move-object v0, p0

    const/4 v1, 0x7

    invoke-static {v8, v9, v1}, Lo/cui;->c(JI)J

    move-result-wide v2

    move-wide v4, v8

    const/16 v1, 0xb

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v6}, Lo/cto;->d(IJJZ)V

    .line 805
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 750
    new-instance v1, Ljava/lang/StringBuffer;

    const-string v0, "--HiSyncHealthDataByUntie{"

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 751
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 752
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
