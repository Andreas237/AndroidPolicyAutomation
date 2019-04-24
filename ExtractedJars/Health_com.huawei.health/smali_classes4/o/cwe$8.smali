.class Lo/cwe$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwe;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic c:Lo/cwe;


# direct methods
.method constructor <init>(Lo/cwe;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 1434
    iput-object p1, p0, Lo/cwe$8;->c:Lo/cwe;

    iput-object p2, p0, Lo/cwe$8;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 1438
    if-eqz p1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1439
    :cond_0
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get step distances calories HiAggregateListener onResult data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1440
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwe$8;->c:Lo/cwe;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cwe$8;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1}, Lo/cwe;->e(Lo/cwe;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1441
    return-void

    .line 1444
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1445
    invoke-static {v4, v5}, Lo/cnk;->a(J)I

    move-result v6

    .line 1447
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwe$8;->c:Lo/cwe;

    invoke-static {v0}, Lo/cwe;->d(Lo/cwe;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/operation/adapter/SportSummary;

    .line 1449
    invoke-virtual {v8}, Lcom/huawei/operation/adapter/SportSummary;->getSportUnit()Lcom/huawei/operation/adapter/SportSummary$SportUnit;

    move-result-object v9

    .line 1451
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 1452
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v12

    .line 1453
    invoke-static {v12, v13}, Lo/cnk;->a(J)I

    move-result v14

    .line 1455
    invoke-virtual {v8}, Lcom/huawei/operation/adapter/SportSummary;->getDate()I

    move-result v0

    if-ne v14, v0, :cond_5

    .line 1456
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStepSportData date = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1457
    const/4 v15, 0x0

    .line 1458
    const/16 v16, 0x0

    .line 1459
    const/16 v17, 0x0

    .line 1460
    if-ne v14, v6, :cond_2

    .line 1461
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwe$8;->c:Lo/cwe;

    invoke-static {v0}, Lo/cwe;->e(Lo/cwe;)V

    .line 1462
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwe$8;->c:Lo/cwe;

    invoke-static {v0}, Lo/cwe;->b(Lo/cwe;)I

    move-result v15

    .line 1463
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwe$8;->c:Lo/cwe;

    invoke-static {v0}, Lo/cwe;->c(Lo/cwe;)I

    move-result v16

    .line 1464
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwe$8;->c:Lo/cwe;

    invoke-static {v0}, Lo/cwe;->a(Lo/cwe;)I

    move-result v17

    goto :goto_3

    .line 1466
    :cond_2
    const-string v0, "step_sum"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v15

    .line 1467
    const-string v0, "calorie_sum"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v18

    .line 1468
    const-string v0, "distance_sum"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v19

    .line 1469
    const-string v0, "track_calories_sum"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v20

    .line 1470
    const-string v0, "track_distance_sum"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v21

    .line 1472
    move/from16 v0, v18

    move/from16 v1, v20

    if-le v0, v1, :cond_3

    move/from16 v16, v18

    goto :goto_2

    :cond_3
    move/from16 v16, v20

    .line 1473
    :goto_2
    move/from16 v0, v19

    move/from16 v1, v21

    if-le v0, v1, :cond_4

    move/from16 v17, v19

    goto :goto_3

    :cond_4
    move/from16 v17, v21

    .line 1476
    :goto_3
    invoke-virtual {v9, v15}, Lcom/huawei/operation/adapter/SportSummary$SportUnit;->configSteps(I)V

    .line 1477
    move/from16 v0, v16

    invoke-virtual {v9, v0}, Lcom/huawei/operation/adapter/SportSummary$SportUnit;->configCalorie(I)V

    .line 1478
    move/from16 v0, v17

    invoke-virtual {v9, v0}, Lcom/huawei/operation/adapter/SportSummary$SportUnit;->configDistance(I)V

    .line 1480
    invoke-virtual {v8, v9}, Lcom/huawei/operation/adapter/SportSummary;->configSportUnit(Lcom/huawei/operation/adapter/SportSummary$SportUnit;)V

    .line 1483
    :cond_5
    goto/16 :goto_1

    .line 1484
    :cond_6
    goto/16 :goto_0

    .line 1485
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwe$8;->c:Lo/cwe;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cwe$8;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1}, Lo/cwe;->e(Lo/cwe;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1487
    return-void
.end method
