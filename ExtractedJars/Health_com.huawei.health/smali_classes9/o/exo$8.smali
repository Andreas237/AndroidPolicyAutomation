.class Lo/exo$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exo;->e(JLo/exn$d;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/egg;

.field final synthetic d:Lo/exn$d;

.field final synthetic e:Lo/exo;


# direct methods
.method constructor <init>(Lo/exo;Lo/exn$d;Lo/egg;)V
    .locals 0

    .line 1330
    iput-object p1, p0, Lo/exo$8;->e:Lo/exo;

    iput-object p2, p0, Lo/exo$8;->d:Lo/exn$d;

    iput-object p3, p0, Lo/exo$8;->b:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 11

    .line 1333
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateSummary onResponse resultcode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1334
    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 1335
    const/4 v5, -0x1

    .line 1336
    const/4 v0, 0x0

    if-ne v0, p1, :cond_4

    .line 1337
    const/4 v5, 0x0

    .line 1338
    sget-object v0, Lo/exo$25;->c:[I

    iget-object v1, p0, Lo/exo$8;->d:Lo/exn$d;

    invoke-virtual {v1}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 1343
    :pswitch_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestHeartRateSummary onResponse resultcode is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1344
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1345
    invoke-interface {v6}, Ljava/util/List;->clear()V

    .line 1346
    move-object v7, p2

    check-cast v7, Ljava/util/List;

    .line 1347
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 1348
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;

    .line 1349
    new-instance v10, Lo/eux;

    invoke-direct {v10}, Lo/eux;-><init>()V

    .line 1350
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getMaxHeartRate()I

    move-result v0

    invoke-virtual {v10, v0}, Lo/eux;->a(I)V

    .line 1351
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getMinHeartRate()I

    move-result v0

    invoke-virtual {v10, v0}, Lo/eux;->d(I)V

    .line 1352
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getAvgRestHeartRate()I

    move-result v0

    invoke-virtual {v10, v0}, Lo/eux;->i(I)V

    .line 1353
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1354
    goto :goto_0

    .line 1357
    :cond_0
    move-object v4, v6

    .line 1358
    goto/16 :goto_2

    .line 1360
    :pswitch_1
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter FITNESS_TYPE_DAY_STATISTIC"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1361
    move-object v8, p2

    check-cast v8, Ljava/util/List;

    .line 1362
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 1363
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "FITNESS_TYPE_DAY_STATISTIC == heartRateSummaryList.size() == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1364
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;

    .line 1365
    const/4 v10, 0x1

    :goto_1
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_3

    .line 1366
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getAvgRestHeartRate()I

    move-result v0

    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getAvgRestHeartRate()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->setAvgRestHeartRate(I)V

    .line 1367
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getMaxHeartRate()I

    move-result v0

    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getMaxHeartRate()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 1368
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getMaxHeartRate()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->setMaxHeartRate(I)V

    .line 1370
    :cond_1
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getMinHeartRate()I

    move-result v0

    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getMinHeartRate()I

    move-result v1

    if-le v0, v1, :cond_2

    .line 1371
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getMinHeartRate()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->setMinHeartRate(I)V

    .line 1365
    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 1375
    :cond_3
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getAvgRestHeartRate()I

    move-result v0

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v1

    div-int/2addr v0, v1

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->setAvgRestHeartRate(I)V

    .line 1376
    move-object v4, v9

    .line 1377
    .line 1384
    :cond_4
    :goto_2
    :pswitch_2
    iget-object v0, p0, Lo/exo$8;->b:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 1385
    const-string v0, "HeartRateStatistic"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateSummary onResponse sucess! resultData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " resultCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1387
    iget-object v0, p0, Lo/exo$8;->b:Lo/egg;

    invoke-interface {v0, v5, v4}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 1389
    :cond_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
