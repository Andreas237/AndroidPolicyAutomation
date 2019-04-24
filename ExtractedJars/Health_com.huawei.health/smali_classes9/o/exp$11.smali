.class Lo/exp$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exp;->a(JLo/exn$d;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/egg;

.field final synthetic d:Lo/exp;

.field final synthetic e:Lo/exn$d;


# direct methods
.method constructor <init>(Lo/exp;Lo/exn$d;Lo/egg;)V
    .locals 0

    .line 418
    iput-object p1, p0, Lo/exp$11;->d:Lo/exp;

    iput-object p2, p0, Lo/exp$11;->e:Lo/exn$d;

    iput-object p3, p0, Lo/exp$11;->c:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 10

    .line 421
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSleeptDetailHistogramData requestGetSleepDetailData 0001 onResponse start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 422
    sget-object v0, Lo/exp$9;->a:[I

    iget-object v1, p0, Lo/exp$11;->e:Lo/exn$d;

    invoke-virtual {v1}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_4

    .line 424
    :sswitch_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_7

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_7

    .line 425
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 426
    move-object v5, p2

    check-cast v5, Ljava/util/List;

    .line 428
    new-instance v6, Lo/eux;

    invoke-direct {v6}, Lo/eux;-><init>()V

    .line 429
    const/4 v7, 0x0

    .line 430
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_6

    .line 431
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    .line 433
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDeepSleepTime()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 434
    const/16 v7, 0x41

    goto :goto_1

    .line 435
    :cond_0
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getShallowSleepTime()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 436
    const/16 v7, 0x42

    goto :goto_1

    .line 437
    :cond_1
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getWakeupDuration()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 438
    const/16 v7, 0x43

    goto :goto_1

    .line 440
    :cond_2
    const/4 v7, 0x0

    .line 444
    :goto_1
    invoke-virtual {v6}, Lo/eux;->b()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_4

    invoke-virtual {v6}, Lo/eux;->e()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_4

    .line 446
    invoke-virtual {v6}, Lo/eux;->b()I

    move-result v0

    if-eq v7, v0, :cond_3

    .line 447
    invoke-virtual {v6, v8}, Lo/eux;->e(I)V

    .line 448
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 449
    new-instance v6, Lo/eux;

    invoke-direct {v6}, Lo/eux;-><init>()V

    goto :goto_2

    .line 450
    :cond_3
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v8, v0, :cond_4

    .line 451
    invoke-virtual {v6, v8}, Lo/eux;->e(I)V

    .line 452
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 457
    :cond_4
    :goto_2
    invoke-virtual {v6}, Lo/eux;->e()I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_5

    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    .line 458
    invoke-virtual {v6, v8}, Lo/eux;->b(I)V

    .line 459
    invoke-virtual {v6, v7}, Lo/eux;->c(I)V

    .line 430
    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 463
    :cond_6
    iget-object v0, p0, Lo/exp$11;->d:Lo/exp;

    iput-object v4, v0, Lo/exp;->c:Ljava/util/List;

    .line 466
    :cond_7
    iget-object v0, p0, Lo/exp$11;->c:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 467
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestSleepDetailHistogra  mDatamDaySleepHistogramData.size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exp$11;->d:Lo/exp;

    iget-object v3, v3, Lo/exp;->c:Ljava/util/List;

    if-nez v3, :cond_8

    const/4 v3, 0x0

    goto :goto_3

    :cond_8
    iget-object v3, p0, Lo/exp$11;->d:Lo/exp;

    iget-object v3, v3, Lo/exp;->c:Ljava/util/List;

    .line 468
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    :goto_3
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 467
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    iget-object v0, p0, Lo/exp$11;->c:Lo/egg;

    iget-object v1, p0, Lo/exp$11;->d:Lo/exp;

    iget-object v1, v1, Lo/exp;->c:Ljava/util/List;

    invoke-interface {v0, p1, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 475
    :cond_9
    :goto_4
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSleepDetailHistogramData requestGetSleepDetailData 0001 onResponse over"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
