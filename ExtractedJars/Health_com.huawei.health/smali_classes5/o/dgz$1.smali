.class Lo/dgz$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgz;->e(JIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dgz;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/dgz;IJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 378
    iput-object p1, p0, Lo/dgz$1;->a:Lo/dgz;

    iput p2, p0, Lo/dgz$1;->c:I

    iput-wide p3, p0, Lo/dgz$1;->e:J

    iput p5, p0, Lo/dgz$1;->b:I

    iput-object p6, p0, Lo/dgz$1;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 14

    .line 382
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 383
    move-object v5, p1

    check-cast v5, Landroid/util/SparseArray;

    .line 384
    const/4 v6, 0x0

    .line 386
    const/4 v7, 0x1

    .line 387
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 388
    :cond_0
    const/4 v7, 0x0

    goto :goto_0

    .line 390
    :cond_1
    const/16 v0, 0x55f0

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 391
    move-object v6, v8

    check-cast v6, Ljava/util/List;

    .line 394
    :goto_0
    const/4 v8, 0x0

    .line 395
    const-wide/16 v9, 0x0

    .line 396
    const/4 v11, 0x0

    :goto_1
    iget v0, p0, Lo/dgz$1;->c:I

    if-ge v11, v0, :cond_6

    .line 397
    new-instance v12, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-direct {v12}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;-><init>()V

    .line 398
    if-eqz v7, :cond_5

    .line 399
    iget-wide v0, p0, Lo/dgz$1;->e:J

    iget v2, p0, Lo/dgz$1;->b:I

    mul-int/2addr v2, v11

    mul-int/lit8 v2, v2, 0x3c

    int-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long v9, v0, v2

    .line 400
    if-eqz v6, :cond_5

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v8, :cond_5

    .line 401
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    const-wide/32 v2, 0xea60

    div-long v2, v9, v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_5

    .line 402
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 403
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const/16 v1, 0x55f1

    if-ne v1, v0, :cond_2

    .line 404
    const/4 v0, 0x7

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setType(I)V

    .line 405
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepTime(I)V

    goto :goto_2

    .line 407
    :cond_2
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const/16 v1, 0x55f2

    if-ne v1, v0, :cond_3

    .line 408
    const/4 v0, 0x6

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setType(I)V

    .line 409
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setShallowSleepTime(I)V

    goto :goto_2

    .line 411
    :cond_3
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const/16 v1, 0x55f3

    if-ne v1, v0, :cond_4

    .line 412
    const/16 v0, 0xea

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setType(I)V

    .line 413
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupDuration(I)V

    .line 416
    :cond_4
    :goto_2
    add-int/lit8 v8, v8, 0x1

    .line 419
    :cond_5
    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 396
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_1

    .line 422
    :cond_6
    iget-object v0, p0, Lo/dgz$1;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 423
    invoke-static {}, Lo/dgz;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSleepDailyDetail back success sleepTotalDatas.size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    iget-object v0, p0, Lo/dgz$1;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v4}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 426
    :cond_7
    return-void
.end method
