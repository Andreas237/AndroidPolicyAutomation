.class public Lo/ctn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ctj;


# instance fields
.field private a:Lo/cqm;

.field private b:I

.field private c:Lcom/huawei/hihealth/HiSyncOption;

.field private d:Landroid/content/Context;

.field private e:Lo/czg;

.field private f:Lo/cqg;

.field private g:Lo/cqh;

.field private h:Lo/crf;

.field private i:Lo/cqn;

.field private k:Lo/cpv;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SyncKey;>;"
        }
    .end annotation
.end field

.field private m:I

.field private n:D

.field private o:Lo/css;

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private t:I

.field private u:Z


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

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ctn;->u:Z

    .line 99
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HiSyncHealthDataByUntie create"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ctn;->d:Landroid/content/Context;

    .line 101
    iput-object p2, p0, Lo/ctn;->c:Lcom/huawei/hihealth/HiSyncOption;

    .line 102
    iput p3, p0, Lo/ctn;->b:I

    .line 103
    invoke-direct {p0}, Lo/ctn;->b()V

    .line 104
    return-void
.end method

.method private a(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 435
    :goto_0
    iget v0, p0, Lo/ctn;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 436
    invoke-direct {p0, p1}, Lo/ctn;->h(I)Ljava/util/List;

    move-result-object v2

    .line 437
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 438
    goto :goto_1

    .line 440
    :cond_0
    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-direct {p0, v2, p1, v0, v1}, Lo/ctn;->e(Ljava/util/List;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 441
    goto :goto_1

    .line 443
    :cond_1
    invoke-direct {p0, v2, p1}, Lo/ctn;->a(Ljava/util/List;I)V

    .line 444
    goto :goto_0

    .line 445
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ctn;->t:I

    .line 446
    return-void
.end method

.method private a(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;J)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 209
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " downloadOneTypeDataWithMaxVersion rep = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ", maxVersion = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    const/4 v9, 0x0

    .line 213
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lo/ctn;->b(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;J)J

    move-result-wide v7

    .line 214
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " downloadOneTypeDataWithMaxVersion downCurrentVersion is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " maxVersion is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    add-int/lit8 v9, v9, 0x1

    .line 216
    const-wide/16 v0, -0x1

    cmp-long v0, v7, v0

    if-gtz v0, :cond_1

    .line 217
    return-void

    .line 219
    :cond_1
    iget-object v0, p0, Lo/ctn;->a:Lo/cqm;

    iget v1, p0, Lo/ctn;->b:I

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->getType()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    move-wide v3, v7

    const-wide/16 v5, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/cqm;->b(IIJJ)Z

    move-result v0

    if-nez v0, :cond_2

    .line 220
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneTypeDataWithMaxVersion saveVersionToDB failed!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    return-void

    .line 223
    :cond_2
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->setVersion(Ljava/lang/Long;)V

    .line 224
    invoke-static {}, Lo/csk;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lo/cui;->e()Z

    move-result v0

    if-nez v0, :cond_3

    .line 226
    const-string v0, "HiH_HiSyncHealthDataByUntie"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " downloadOneTypeDataWithMaxVersion() backgroud is running"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    return-void

    .line 229
    :cond_3
    const/16 v0, 0x14

    if-lt v9, v0, :cond_4

    .line 230
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " downloadOneTypeDataWithMaxVersion() pullDataByVersion too many times"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    return-void

    .line 234
    :cond_4
    cmp-long v0, v7, p2

    if-ltz v0, :cond_0

    .line 235
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 355
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 356
    :cond_0
    return-void

    .line 361
    :cond_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/hihealth/HiHealthData;

    .line 362
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v8

    .line 363
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v10

    .line 364
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v12

    .line 366
    iget-object v0, p0, Lo/ctn;->f:Lo/cqg;

    move v1, v12

    move-wide v2, v8

    move-wide v4, v10

    const/16 v6, 0x7d7

    const/4 v7, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/cqg;->e(IJJII)I

    .line 367
    iget-object v0, p0, Lo/ctn;->f:Lo/cqg;

    move v1, v12

    move-wide v2, v8

    move-wide v4, v10

    const/16 v6, 0x7d6

    const/4 v7, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/cqg;->e(IJJII)I

    .line 368
    goto :goto_0

    .line 369
    :cond_2
    return-void
.end method

.method private a(Ljava/util/List;I)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)V"
        }
    .end annotation

    .line 308
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 309
    :cond_0
    return-void

    .line 312
    :cond_1
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 313
    const/16 v0, 0x7d1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 314
    const/16 v0, 0x7ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 315
    const/16 v0, 0x7f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 316
    const/16 v0, 0x7e6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 317
    const/16 v0, 0x7e7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 318
    const/16 v0, 0x7e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 319
    const/16 v0, 0x7e9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 320
    const/16 v0, 0x7f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 321
    const/16 v0, 0x7ea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 322
    const/16 v0, 0x7eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 323
    const/16 v0, 0x7ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 324
    const/16 v0, 0x7ed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 325
    const/16 v0, 0x7ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 326
    const/16 v0, 0x803

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 327
    const/16 v0, 0x804

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 328
    const/16 v0, 0x805

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 329
    const/16 v0, 0x806

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 330
    const/16 v0, 0x807

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 331
    const/16 v0, 0x808

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 332
    const/16 v0, 0x809

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 333
    const/16 v0, 0x80a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 334
    const/16 v0, 0x80b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 336
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 337
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v14

    .line 338
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v16

    .line 339
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v18

    .line 340
    const/16 v19, 0x0

    .line 341
    const/4 v0, 0x0

    move-object/from16 v1, v18

    if-eq v0, v1, :cond_2

    .line 342
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;

    .line 343
    invoke-virtual/range {v20 .. v20}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->getUserId()Ljava/lang/String;

    move-result-object v19

    .line 345
    :cond_2
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getModifiedTime()J

    move-result-wide v20

    .line 347
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ctn;->f:Lo/cqg;

    move/from16 v1, p2

    move-object/from16 v2, v19

    move-wide v3, v14

    move-wide/from16 v5, v16

    move-wide/from16 v7, v20

    const/16 v9, 0x7d4

    const/4 v10, 0x1

    invoke-virtual/range {v0 .. v10}, Lo/cqg;->c(ILjava/lang/String;JJJII)I

    move-result v22

    .line 348
    if-lez v22, :cond_3

    .line 349
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ctn;->f:Lo/cqg;

    move/from16 v1, p2

    move-object/from16 v2, v19

    move-wide v3, v14

    move-wide/from16 v5, v16

    move-object v7, v11

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v8}, Lo/cqg;->c(ILjava/lang/String;JJLjava/util/List;I)I

    .line 351
    :cond_3
    goto :goto_0

    .line 352
    :cond_4
    return-void
.end method

.method private a(Ljava/util/List;IZ)Z
    .locals 13
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

    .line 256
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " saveData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    int-to-double v7, v0

    .line 258
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 259
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_0
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;

    .line 260
    if-nez v11, :cond_1

    .line 261
    goto :goto_0

    .line 264
    :cond_1
    iget-object v0, p0, Lo/ctn;->o:Lo/css;

    iget v1, p0, Lo/ctn;->b:I

    invoke-virtual {v0, v11, v1}, Lo/css;->c(Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;I)Ljava/util/List;

    move-result-object v12

    .line 265
    const/4 v0, 0x0

    if-eq v0, v12, :cond_0

    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 266
    goto :goto_0

    .line 268
    :cond_2
    iget-object v0, p0, Lo/ctn;->d:Landroid/content/Context;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    div-double/2addr v1, v7

    iget-wide v3, p0, Lo/ctn;->n:D

    const-wide/high16 v5, 0x4034000000000000L    # 20.0

    invoke-static/range {v0 .. v6}, Lo/cuh;->a(Landroid/content/Context;DDD)V

    .line 273
    invoke-static {}, Lo/cui;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez p3, :cond_3

    invoke-direct {p0, p2}, Lo/ctn;->l(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 274
    iget-object v0, p0, Lo/ctn;->d:Landroid/content/Context;

    iget v1, p0, Lo/ctn;->b:I

    const/16 v2, 0x2711

    invoke-static {v0, v12, v2, v1}, Lo/cth;->b(Landroid/content/Context;Ljava/util/List;II)V

    .line 275
    goto :goto_0

    .line 277
    :cond_3
    iget-object v0, p0, Lo/ctn;->h:Lo/crf;

    iget v1, p0, Lo/ctn;->b:I

    invoke-virtual {v0, v12, v1}, Lo/crf;->a(Ljava/util/List;I)I

    .line 278
    const/4 v0, 0x7

    if-eq p2, v0, :cond_4

    const/4 v0, 0x3

    if-eq p2, v0, :cond_4

    const/16 v0, 0x9

    if-eq p2, v0, :cond_4

    const/16 v0, 0xa

    if-eq p2, v0, :cond_4

    const/16 v0, 0xd

    if-ne p2, v0, :cond_5

    .line 280
    :cond_4
    invoke-interface {v9, v12}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 282
    :cond_5
    goto/16 :goto_0

    .line 285
    :cond_6
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 286
    iget-object v0, p0, Lo/ctn;->h:Lo/crf;

    invoke-virtual {v0, v9}, Lo/crf;->c(Ljava/util/List;)V

    .line 287
    iget-object v0, p0, Lo/ctn;->h:Lo/crf;

    invoke-virtual {v0}, Lo/crf;->e()V

    .line 289
    :cond_7
    const/4 v0, 0x1

    return v0
.end method

.method private b(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;J)J
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 238
    iget-object v0, p0, Lo/ctn;->e:Lo/czg;

    invoke-virtual {v0, p1}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;

    move-result-object v4

    .line 239
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 240
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downOneTypeDataOnce() SyncError checkCloudRsp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    const-wide/16 v0, -0x1

    return-wide v0

    .line 243
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->getDetailInfos()Ljava/util/List;

    move-result-object v5

    .line 244
    if-eqz v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 245
    :cond_1
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " downOneTypeDataOnce() detailInfos is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    const-wide/16 v0, -0x1

    return-wide v0

    .line 248
    :cond_2
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->getCurrentVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    .line 249
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->getType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, v5, v0, v1}, Lo/ctn;->a(Ljava/util/List;IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 250
    return-wide v6

    .line 252
    :cond_3
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method private b(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 507
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 508
    const/16 v0, 0x7e3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 509
    const/16 v0, 0x7e4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 510
    const/16 v0, 0x7e5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 511
    iget-object v0, p0, Lo/ctn;->g:Lo/cqh;

    const/16 v1, 0x32

    invoke-virtual {v0, p1, v2, v1}, Lo/cqh;->a(ILjava/util/List;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private b()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 107
    invoke-static {}, Lo/cui;->d()Z

    move-result v0

    iput-boolean v0, p0, Lo/ctn;->u:Z

    .line 108
    iget-object v0, p0, Lo/ctn;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lo/ctn;->e:Lo/czg;

    .line 109
    iget-object v0, p0, Lo/ctn;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cqm;->e(Landroid/content/Context;)Lo/cqm;

    move-result-object v0

    iput-object v0, p0, Lo/ctn;->a:Lo/cqm;

    .line 110
    iget-object v0, p0, Lo/ctn;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cqg;->c(Landroid/content/Context;)Lo/cqg;

    move-result-object v0

    iput-object v0, p0, Lo/ctn;->f:Lo/cqg;

    .line 111
    iget-object v0, p0, Lo/ctn;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    iput-object v0, p0, Lo/ctn;->h:Lo/crf;

    .line 112
    iget-object v0, p0, Lo/ctn;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cqn;->a(Landroid/content/Context;)Lo/cqn;

    move-result-object v0

    iput-object v0, p0, Lo/ctn;->i:Lo/cqn;

    .line 113
    iget-object v0, p0, Lo/ctn;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cpv;->c(Landroid/content/Context;)Lo/cpv;

    move-result-object v0

    iput-object v0, p0, Lo/ctn;->k:Lo/cpv;

    .line 114
    iget-object v0, p0, Lo/ctn;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cqh;->d(Landroid/content/Context;)Lo/cqh;

    move-result-object v0

    iput-object v0, p0, Lo/ctn;->g:Lo/cqh;

    .line 115
    new-instance v0, Lo/css;

    iget-object v1, p0, Lo/ctn;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/css;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ctn;->o:Lo/css;

    .line 116
    invoke-direct {p0}, Lo/ctn;->c()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/ctn;->p:Ljava/util/List;

    .line 117
    iget-object v0, p0, Lo/ctn;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/ctw;->e(Landroid/content/Context;)Lo/ctw;

    move-result-object v0

    iget-object v1, p0, Lo/ctn;->p:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/ctw;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/ctn;->l:Ljava/util/List;

    .line 118
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init syncKeys is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ctn;->l:Ljava/util/List;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 479
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 480
    :cond_0
    return-void

    .line 484
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

    .line 485
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v8

    .line 486
    const-string v0, "modified_time"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 488
    iget-object v0, p0, Lo/ctn;->g:Lo/cqh;

    move-wide v1, v8

    move-wide v3, v6

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/cqh;->a(JJI)I

    .line 489
    goto :goto_0

    .line 490
    :cond_2
    return-void
.end method

.method private c()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 122
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 123
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    const/16 v0, 0x8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    const/16 v0, 0xa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    const/16 v0, 0xd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    return-object v1
.end method

.method private c(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 465
    :goto_0
    iget v0, p0, Lo/ctn;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 466
    invoke-direct {p0, p1}, Lo/ctn;->k(I)Ljava/util/List;

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
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-direct {p0, v2, p1, v0, v1}, Lo/ctn;->e(Ljava/util/List;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 471
    goto :goto_1

    .line 473
    :cond_1
    invoke-direct {p0, v2}, Lo/ctn;->e(Ljava/util/List;)V

    .line 474
    goto :goto_0

    .line 475
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ctn;->t:I

    .line 476
    return-void
.end method

.method private c(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 843
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Integer;

    .line 844
    packed-switch p1, :pswitch_data_0

    goto :goto_1

    .line 846
    :pswitch_0
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctn;->d(I)V

    .line 847
    goto :goto_1

    .line 849
    :pswitch_1
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctn;->a(I)V

    .line 850
    goto :goto_1

    .line 852
    :pswitch_2
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctn;->i(I)V

    .line 853
    goto :goto_1

    .line 855
    :pswitch_3
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctn;->e(I)V

    .line 856
    goto :goto_1

    .line 858
    :pswitch_4
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctn;->c(I)V

    .line 859
    .line 863
    :goto_1
    :pswitch_5
    goto :goto_0

    .line 864
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/ctn;->m:I

    .line 865
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method private c(Lcom/huawei/hwcloudmodel/model/unite/SyncKey;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 180
    if-nez p1, :cond_0

    .line 181
    return-void

    .line 183
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 184
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 185
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneTypeDataByVersion type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", maxVersion is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-gtz v0, :cond_1

    .line 187
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneTypeDataByVersion cloud has no such data, type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    return-void

    .line 190
    :cond_1
    new-instance v7, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;

    invoke-direct {v7}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;-><init>()V

    .line 191
    iget-object v0, p0, Lo/ctn;->c:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiSyncOption;->getSyncMethod()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->setDataType(Ljava/lang/Integer;)V

    .line 192
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->setType(Ljava/lang/Integer;)V

    .line 193
    iget-object v0, p0, Lo/ctn;->a:Lo/cqm;

    iget v1, p0, Lo/ctn;->b:I

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cqm;->a(IJI)Lo/cnz;

    move-result-object v8

    .line 194
    const/4 v0, 0x0

    if-ne v0, v8, :cond_2

    .line 195
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " syncAnchorTable is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->setVersion(Ljava/lang/Long;)V

    .line 197
    invoke-direct {p0, v7, v5, v6}, Lo/ctn;->a(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;J)V

    goto :goto_0

    .line 199
    :cond_2
    invoke-virtual {v8}, Lo/cnz;->c()J

    move-result-wide v0

    cmp-long v0, v0, v5

    if-gez v0, :cond_3

    .line 200
    invoke-virtual {v8}, Lo/cnz;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;->setVersion(Ljava/lang/Long;)V

    .line 201
    invoke-direct {p0, v7, v5, v6}, Lo/ctn;->a(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;J)V

    goto :goto_0

    .line 203
    :cond_3
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " do not need downloadOneTypeDataByVersion data, type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", DBversion is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lo/cnz;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", maxVersion is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 204
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 203
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    :goto_0
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 293
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 294
    :cond_0
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " uploadPointsOK() hiHealthDatas is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    return-void

    .line 299
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

    .line 300
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v6

    .line 301
    const-string v0, "modified_time"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v8

    .line 303
    iget-object v0, p0, Lo/ctn;->f:Lo/cqg;

    move-wide v1, v6

    move-wide v3, v8

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/cqg;->a(JJI)I

    .line 304
    goto :goto_0

    .line 305
    :cond_2
    return-void
.end method

.method private d(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 420
    :goto_0
    iget v0, p0, Lo/ctn;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 421
    invoke-direct {p0, p1}, Lo/ctn;->g(I)Ljava/util/List;

    move-result-object v2

    .line 422
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 423
    goto :goto_1

    .line 425
    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v2, p1, v0, v1}, Lo/ctn;->e(Ljava/util/List;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 426
    goto :goto_1

    .line 428
    :cond_1
    invoke-direct {p0, v2}, Lo/ctn;->c(Ljava/util/List;)V

    .line 429
    goto :goto_0

    .line 430
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ctn;->t:I

    .line 431
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

    .line 741
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

    .line 742
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctn;->o(I)V

    .line 743
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctn;->n(I)V

    .line 744
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctn;->m(I)V

    .line 745
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctn;->t(I)V

    .line 746
    goto :goto_0

    .line 747
    :cond_0
    return-void
.end method

.method private e()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 159
    iget-object v0, p0, Lo/ctn;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    div-double v0, v2, v0

    iput-wide v0, p0, Lo/ctn;->n:D

    .line 160
    iget-object v0, p0, Lo/ctn;->l:Ljava/util/List;

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

    .line 161
    invoke-direct {p0, v5}, Lo/ctn;->c(Lcom/huawei/hwcloudmodel/model/unite/SyncKey;)V

    .line 162
    goto :goto_0

    .line 163
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

    .line 450
    :goto_0
    iget v0, p0, Lo/ctn;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 451
    invoke-direct {p0, p1}, Lo/ctn;->b(I)Ljava/util/List;

    move-result-object v2

    .line 452
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 453
    goto :goto_1

    .line 455
    :cond_0
    const/16 v0, 0xa

    const/4 v1, 0x0

    invoke-direct {p0, v2, p1, v0, v1}, Lo/ctn;->e(Ljava/util/List;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 456
    goto :goto_1

    .line 458
    :cond_1
    invoke-direct {p0, v2}, Lo/ctn;->b(Ljava/util/List;)V

    .line 459
    goto :goto_0

    .line 460
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ctn;->t:I

    .line 461
    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 493
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 494
    :cond_0
    return-void

    .line 498
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

    .line 499
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v8

    .line 500
    const-string v0, "modified_time"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 502
    iget-object v0, p0, Lo/ctn;->f:Lo/cqg;

    move-wide v1, v8

    move-wide v3, v6

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/cqg;->a(JJI)I

    .line 503
    goto :goto_0

    .line 504
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

    .line 387
    if-nez p4, :cond_0

    iget-boolean v0, p0, Lo/ctn;->u:Z

    if-nez v0, :cond_1

    .line 388
    :cond_0
    iget v0, p0, Lo/ctn;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctn;->m:I

    iget-object v1, p0, Lo/ctn;->c:Lcom/huawei/hihealth/HiSyncOption;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v1

    invoke-static {v0, v1}, Lo/cui;->a(II)V

    goto :goto_0

    .line 390
    :cond_1
    iget v0, p0, Lo/ctn;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctn;->m:I

    const/4 v1, 0x5

    if-ge v1, v0, :cond_2

    .line 391
    iget v0, p0, Lo/ctn;->t:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/ctn;->t:I

    .line 392
    const/4 v0, 0x0

    return v0

    .line 395
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/ctn;->o:Lo/css;

    invoke-virtual {v0, p1, p2, p3}, Lo/css;->d(Ljava/util/List;II)Ljava/util/List;

    move-result-object v4

    .line 396
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 397
    :cond_3
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " addHealthData() healthDetails is null or empty cloudType is "

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

    .line 398
    const/4 v0, 0x0

    return v0

    .line 400
    :cond_4
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;-><init>()V

    .line 401
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;->setTimeZone(Ljava/lang/String;)V

    .line 402
    invoke-virtual {v5, v4}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;->setDetailInfo(Ljava/util/List;)V

    .line 404
    :goto_1
    iget v0, p0, Lo/ctn;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_6

    .line 405
    iget-object v0, p0, Lo/ctn;->e:Lo/czg;

    invoke-virtual {v0, v5}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;)Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;

    move-result-object v6

    .line 407
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_5

    .line 408
    iget v0, p0, Lo/ctn;->t:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctn;->t:I

    .line 409
    goto :goto_1

    .line 411
    :cond_5
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDataToCloud OK ! uploadCount is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctn;->m:I

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

    .line 412
    const/4 v0, 0x1

    return v0

    .line 414
    :cond_6
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDataToCloud failed ! uploadCount is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctn;->m:I

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

    .line 415
    const/4 v0, 0x0

    return v0
.end method

.method private f(I)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 581
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 582
    const/16 v0, 0x7d4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 583
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 584
    invoke-static {v8, v9}, Lo/cnk;->d(J)J

    move-result-wide v10

    .line 585
    invoke-static {v8, v9}, Lo/cnk;->i(J)J

    move-result-wide v12

    .line 586
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ctn;->f:Lo/cqg;

    move/from16 v1, p1

    move-object v2, v7

    move-wide v3, v10

    move-wide v5, v12

    invoke-virtual/range {v0 .. v6}, Lo/cqg;->d(ILjava/util/List;JJ)Ljava/util/List;

    move-result-object v14

    .line 587
    const/4 v0, 0x0

    if-eq v0, v14, :cond_2

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 588
    invoke-interface {v7}, Ljava/util/List;->clear()V

    .line 589
    const/16 v0, 0x7d1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 590
    const/16 v0, 0x7ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 591
    const/16 v0, 0x7f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 592
    const/16 v0, 0x7e6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 593
    const/16 v0, 0x7e7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 594
    const/16 v0, 0x7e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 595
    const/16 v0, 0x7e9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 596
    const/16 v0, 0x7f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 597
    const/16 v0, 0x7ea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 598
    const/16 v0, 0x7eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 599
    const/16 v0, 0x7ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 600
    const/16 v0, 0x7ed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 601
    const/16 v0, 0x7ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 602
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/huawei/hihealth/HiHealthData;

    .line 603
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ctn;->f:Lo/cqg;

    move/from16 v1, p1

    move-object/from16 v2, v16

    invoke-virtual {v0, v1, v7, v2}, Lo/cqg;->a(ILjava/util/List;Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;

    move-result-object v17

    .line 604
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-ne v0, v1, :cond_0

    .line 605
    new-instance v17, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;

    invoke-direct/range {v17 .. v17}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;-><init>()V

    .line 607
    :cond_0
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 608
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setUserid(Ljava/lang/String;)V

    .line 610
    :cond_1
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    move-object/from16 v2, v17

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setWeight(D)V

    .line 611
    invoke-static/range {v17 .. v17}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 612
    goto :goto_0

    .line 614
    :cond_2
    return-object v14
.end method

.method private g(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 522
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 524
    const/16 v0, 0x7df

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 525
    const/16 v0, 0x7d8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 526
    const/16 v0, 0x7d9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 527
    const/16 v0, 0x7da

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 528
    const/16 v0, 0x7db

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 529
    const/16 v0, 0x7dc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 530
    const/16 v0, 0x7dd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 531
    const/16 v0, 0x7de

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 532
    iget-object v0, p0, Lo/ctn;->f:Lo/cqg;

    const/16 v1, 0x32

    invoke-virtual {v0, p1, v2, v1}, Lo/cqg;->d(ILjava/util/List;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private h(I)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 537
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 538
    const/16 v0, 0x7d4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 539
    iget-object v0, p0, Lo/ctn;->f:Lo/cqg;

    const/16 v1, 0x32

    invoke-virtual {v0, p1, v2, v1}, Lo/cqg;->d(ILjava/util/List;I)Ljava/util/List;

    move-result-object v3

    .line 540
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 541
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 542
    const/16 v0, 0x7d1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 543
    const/16 v0, 0x7ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 544
    const/16 v0, 0x7f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 545
    const/16 v0, 0x7e6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 546
    const/16 v0, 0x7e7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 547
    const/16 v0, 0x7e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 548
    const/16 v0, 0x7e9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 549
    const/16 v0, 0x7f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 550
    const/16 v0, 0x7ea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 551
    const/16 v0, 0x7eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 552
    const/16 v0, 0x7ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 553
    const/16 v0, 0x7ed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 554
    const/16 v0, 0x7ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 555
    const/16 v0, 0x803

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 556
    const/16 v0, 0x804

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 557
    const/16 v0, 0x805

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 558
    const/16 v0, 0x806

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 559
    const/16 v0, 0x807

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 560
    const/16 v0, 0x808

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 561
    const/16 v0, 0x809

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 562
    const/16 v0, 0x80a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 563
    const/16 v0, 0x80b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 564
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 565
    iget-object v0, p0, Lo/ctn;->f:Lo/cqg;

    invoke-virtual {v0, p1, v2, v5}, Lo/cqg;->a(ILjava/util/List;Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;

    move-result-object v6

    .line 566
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 567
    new-instance v6, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;

    invoke-direct {v6}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;-><init>()V

    .line 569
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 570
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setUserid(Ljava/lang/String;)V

    .line 572
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setWeight(D)V

    .line 573
    invoke-static {v6}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 574
    goto :goto_0

    .line 577
    :cond_2
    return-object v3
.end method

.method private h(Ljava/util/List;)V
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

    .line 833
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

    .line 834
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctn;->d(I)V

    .line 835
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctn;->a(I)V

    .line 836
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctn;->i(I)V

    .line 837
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctn;->e(I)V

    .line 838
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctn;->c(I)V

    .line 839
    goto :goto_0

    .line 840
    :cond_0
    return-void
.end method

.method private i(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 619
    :goto_0
    iget v0, p0, Lo/ctn;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 620
    invoke-direct {p0, p1}, Lo/ctn;->p(I)Ljava/util/List;

    move-result-object v2

    .line 621
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 622
    goto :goto_1

    .line 624
    :cond_0
    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-direct {p0, v2, p1, v0, v1}, Lo/ctn;->e(Ljava/util/List;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 625
    goto :goto_1

    .line 627
    :cond_1
    invoke-direct {p0, v2}, Lo/ctn;->a(Ljava/util/List;)V

    .line 628
    goto :goto_0

    .line 629
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ctn;->t:I

    .line 630
    return-void
.end method

.method private k(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 515
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 516
    const/16 v0, 0x835

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 517
    iget-object v0, p0, Lo/ctn;->f:Lo/cqg;

    const/16 v1, 0x32

    invoke-virtual {v0, p1, v2, v1}, Lo/cqg;->d(ILjava/util/List;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private l(I)Z
    .locals 1

    .line 640
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 642
    :sswitch_0
    const/4 v0, 0x1

    return v0

    .line 644
    :goto_0
    const/4 v0, 0x0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_0
    .end sparse-switch
.end method

.method private m(I)V
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 791
    :goto_0
    move-object/from16 v0, p0

    iget v0, v0, Lo/ctn;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 792
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 793
    invoke-static {v9, v10}, Lo/cnk;->d(J)J

    move-result-wide v11

    .line 794
    invoke-static {v9, v10}, Lo/cnk;->i(J)J

    move-result-wide v13

    .line 795
    const/4 v0, 0x2

    new-array v15, v0, [Ljava/lang/String;

    const-string v0, "bloodpressure_diastolic"

    const/4 v1, 0x0

    aput-object v0, v15, v1

    const-string v0, "bloodpressure_systolic"

    const/4 v1, 0x1

    aput-object v0, v15, v1

    .line 796
    const/16 v16, 0x2

    move/from16 v0, v16

    new-array v0, v0, [I

    move-object/from16 v16, v0

    fill-array-data v16, :array_0

    .line 798
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ctn;->i:Lo/cqn;

    move/from16 v1, p1

    move-object/from16 v2, v16

    move-object v3, v15

    move-wide v5, v11

    move-wide v7, v13

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v8}, Lo/cqn;->e(I[I[Ljava/lang/String;IJJ)Ljava/util/List;

    move-result-object v17

    .line 799
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-eq v0, v1, :cond_2

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 800
    goto :goto_1

    .line 802
    :cond_0
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    move/from16 v2, p1

    const/4 v3, 0x5

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lo/ctn;->e(Ljava/util/List;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 803
    goto :goto_1

    .line 805
    :cond_1
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lo/ctn;->a(Ljava/util/List;)V

    .line 806
    goto :goto_0

    .line 807
    :cond_2
    :goto_1
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lo/ctn;->t:I

    .line 808
    return-void

    :array_0
    .array-data 4
        0x7d7
        0x7d6
    .end array-data
.end method

.method private n(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 777
    :goto_0
    iget v0, p0, Lo/ctn;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 778
    invoke-direct {p0, p1}, Lo/ctn;->f(I)Ljava/util/List;

    move-result-object v2

    .line 779
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 780
    goto :goto_1

    .line 782
    :cond_0
    const/4 v0, 0x6

    const/4 v1, 0x1

    invoke-direct {p0, v2, p1, v0, v1}, Lo/ctn;->e(Ljava/util/List;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 783
    goto :goto_1

    .line 785
    :cond_1
    invoke-direct {p0, v2, p1}, Lo/ctn;->a(Ljava/util/List;I)V

    .line 786
    goto :goto_0

    .line 787
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ctn;->t:I

    .line 788
    return-void
.end method

.method private o(I)V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 750
    :goto_0
    iget v0, p0, Lo/ctn;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 751
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 753
    const/16 v0, 0x7df

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 754
    const/16 v0, 0x7d8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 755
    const/16 v0, 0x7d9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 756
    const/16 v0, 0x7da

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 757
    const/16 v0, 0x7db

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 758
    const/16 v0, 0x7dc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 759
    const/16 v0, 0x7dd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 760
    const/16 v0, 0x7de

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 761
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 762
    invoke-static {v8, v9}, Lo/cnk;->d(J)J

    move-result-wide v10

    .line 763
    invoke-static {v8, v9}, Lo/cnk;->i(J)J

    move-result-wide v12

    .line 764
    iget-object v0, p0, Lo/ctn;->f:Lo/cqg;

    move/from16 v1, p1

    move-object v2, v7

    move-wide v3, v10

    move-wide v5, v12

    invoke-virtual/range {v0 .. v6}, Lo/cqg;->d(ILjava/util/List;JJ)Ljava/util/List;

    move-result-object v14

    .line 765
    const/4 v0, 0x0

    if-eq v0, v14, :cond_2

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 766
    goto :goto_1

    .line 768
    :cond_0
    move/from16 v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v14, v0, v1, v2}, Lo/ctn;->e(Ljava/util/List;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 769
    goto :goto_1

    .line 771
    :cond_1
    invoke-direct {p0, v14}, Lo/ctn;->c(Ljava/util/List;)V

    .line 772
    goto/16 :goto_0

    .line 773
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ctn;->t:I

    .line 774
    return-void
.end method

.method private p(I)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 633
    const/4 v0, 0x2

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "bloodpressure_diastolic"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    const-string v0, "bloodpressure_systolic"

    const/4 v1, 0x1

    aput-object v0, v6, v1

    .line 634
    const/4 v7, 0x2

    new-array v7, v7, [I

    fill-array-data v7, :array_0

    .line 636
    iget-object v0, p0, Lo/ctn;->i:Lo/cqn;

    move v1, p1

    move-object v3, v7

    move-object v4, v6

    const/16 v2, 0x32

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/cqn;->d(II[I[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    return-object v0

    :array_0
    .array-data 4
        0x7d7
        0x7d6
    .end array-data
.end method

.method private t(I)V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 811
    :goto_0
    iget v0, p0, Lo/ctn;->t:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 812
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 813
    invoke-static {v7, v8}, Lo/cnk;->d(J)J

    move-result-wide v9

    .line 814
    invoke-static {v7, v8}, Lo/cnk;->i(J)J

    move-result-wide v11

    .line 815
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 816
    const/16 v0, 0x7e3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 817
    const/16 v0, 0x7e4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 818
    const/16 v0, 0x7e5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 819
    iget-object v0, p0, Lo/ctn;->g:Lo/cqh;

    move/from16 v1, p1

    move-object v2, v13

    move-wide v3, v9

    move-wide v5, v11

    invoke-virtual/range {v0 .. v6}, Lo/cqh;->a(ILjava/util/List;JJ)Ljava/util/List;

    move-result-object v14

    .line 820
    const/4 v0, 0x0

    if-eq v0, v14, :cond_2

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 821
    goto :goto_1

    .line 823
    :cond_0
    move/from16 v0, p1

    const/16 v1, 0xa

    const/4 v2, 0x1

    invoke-direct {p0, v14, v0, v1, v2}, Lo/ctn;->e(Ljava/util/List;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 824
    goto :goto_1

    .line 826
    :cond_1
    invoke-direct {p0, v14}, Lo/ctn;->b(Ljava/util/List;)V

    .line 827
    goto/16 :goto_0

    .line 828
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ctn;->t:I

    .line 829
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadStressAndRelaxationData upLoadFailCount = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctn;->t:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 830
    return-void
.end method


# virtual methods
.method public a()V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 688
    const-string v0, "HiH_HiSyncHealthDataByUntie"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 689
    invoke-static {}, Lo/csk;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 690
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() dataPrivacy switch is closed ,can not pushData right now ,push end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 691
    return-void

    .line 693
    :cond_0
    const/4 v7, 0x0

    .line 694
    const-string v0, "SYNC_HEALTH_DATA_UPLOAD_PERCENT_MAX"

    const-wide/high16 v1, 0x4014000000000000L    # 5.0

    invoke-static {v1, v2, v0}, Lo/cuh;->a(DLjava/lang/String;)V

    .line 695
    iget-object v0, p0, Lo/ctn;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    iget v1, p0, Lo/ctn;->b:I

    invoke-virtual {v0, v1}, Lo/cpw;->a(I)Ljava/util/List;

    move-result-object v8

    .line 696
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 697
    const-string v0, "HiH_HiSyncHealthDataByUntie"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clientid list size ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 698
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v7

    .line 713
    iget-boolean v0, p0, Lo/ctn;->u:Z

    if-nez v0, :cond_1

    .line 714
    invoke-direct {p0, v8}, Lo/ctn;->h(Ljava/util/List;)V

    goto :goto_0

    .line 716
    :cond_1
    invoke-direct {p0, v8}, Lo/ctn;->d(Ljava/util/List;)V

    .line 717
    const/4 v0, 0x0

    iput v0, p0, Lo/ctn;->m:I

    .line 718
    const/4 v0, 0x1

    invoke-direct {p0, v0, v8}, Lo/ctn;->c(ILjava/util/List;)V

    .line 719
    const/4 v0, 0x2

    invoke-direct {p0, v0, v8}, Lo/ctn;->c(ILjava/util/List;)V

    .line 720
    const/4 v0, 0x3

    invoke-direct {p0, v0, v8}, Lo/ctn;->c(ILjava/util/List;)V

    .line 721
    const/4 v0, 0x4

    invoke-direct {p0, v0, v8}, Lo/ctn;->c(ILjava/util/List;)V

    .line 722
    const/4 v0, 0x6

    invoke-direct {p0, v0, v8}, Lo/ctn;->c(ILjava/util/List;)V

    goto :goto_0

    .line 726
    :cond_2
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() end ! no client get, maybe no data need to pushData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 733
    :goto_0
    iget-object v0, p0, Lo/ctn;->d:Landroid/content/Context;

    iget v1, p0, Lo/ctn;->b:I

    invoke-static {v0, v1}, Lo/cub;->e(Landroid/content/Context;I)V

    .line 734
    iget-object v0, p0, Lo/ctn;->d:Landroid/content/Context;

    iget v1, p0, Lo/ctn;->b:I

    iget-object v2, p0, Lo/ctn;->f:Lo/cqg;

    invoke-static {v0, v1, v2}, Lo/cub;->e(Landroid/content/Context;ILo/cqg;)V

    .line 735
    iget-object v0, p0, Lo/ctn;->d:Landroid/content/Context;

    int-to-double v1, v7

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    div-double/2addr v3, v1

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v5, 0x4014000000000000L    # 5.0

    invoke-static/range {v0 .. v6}, Lo/cuh;->a(Landroid/content/Context;DDD)V

    .line 736
    iget-object v0, p0, Lo/ctn;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cuh;->b(Landroid/content/Context;)V

    .line 737
    const-string v0, "HiH_HiSyncHealthDataByUntie"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 738
    return-void
.end method

.method public d()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 650
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 651
    const-string v0, "SYNC_HEALTH_DATA_DOWNLOAD_PERCENT_MAX_ALL"

    const-wide/high16 v1, 0x4034000000000000L    # 20.0

    invoke-static {v1, v2, v0}, Lo/cuh;->a(DLjava/lang/String;)V

    .line 652
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() keys is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ctn;->l:Ljava/util/List;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 653
    iget-object v0, p0, Lo/ctn;->l:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ctn;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 654
    :cond_0
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() keys is null,stop pullDataByVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 656
    :cond_1
    invoke-direct {p0}, Lo/ctn;->e()V

    .line 659
    :goto_0
    iget-object v0, p0, Lo/ctn;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cuh;->b(Landroid/content/Context;)V

    .line 660
    const-string v0, "Debug_HiSyncHealthDataByUntie"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullDataByVersion() end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 661
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 869
    new-instance v1, Ljava/lang/StringBuffer;

    const-string v0, "--HiSyncHealthDataByUntie{"

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 870
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 871
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
