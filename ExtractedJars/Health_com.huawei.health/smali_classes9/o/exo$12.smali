.class Lo/exo$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exo;->c(JLo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/exo;

.field final synthetic c:Lo/egg;


# direct methods
.method constructor <init>(Lo/exo;Lo/egg;)V
    .locals 0

    .line 1490
    iput-object p1, p0, Lo/exo$12;->b:Lo/exo;

    iput-object p2, p0, Lo/exo$12;->c:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 16

    .line 1494
    move-object/from16 v4, p2

    check-cast v4, Ljava/util/List;

    .line 1495
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1497
    if-eqz v4, :cond_8

    .line 1498
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthClient;

    .line 1499
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "======K=====getDeviceUUID==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthClient;->getDeviceUUID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1500
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthClient;->getHiDeviceInfo()Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1501
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====K=====NAME==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthClient;->getHiDeviceInfo()Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1502
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====K=====Model==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthClient;->getHiDeviceInfo()Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hihealth/HiDeviceInfo;->getModel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1503
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====K====DeviceType==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthClient;->getHiDeviceInfo()Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1504
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====K====DeviceUniqueCode==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthClient;->getHiDeviceInfo()Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1507
    :cond_1
    new-instance v8, Lo/eut;

    invoke-direct {v8}, Lo/eut;-><init>()V

    .line 1510
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthClient;->getHiDeviceInfo()Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 1511
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthClient;->getHiDeviceInfo()Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceType()I

    move-result v9

    .line 1512
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthClient;->getHiDeviceInfo()Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v10

    .line 1513
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthClient;->getHiDeviceInfo()Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiDeviceInfo;->getModel()Ljava/lang/String;

    move-result-object v11

    .line 1514
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthClient;->getHiDeviceInfo()Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v12

    .line 1515
    const/4 v13, 0x0

    .line 1517
    const/16 v0, 0x1e

    if-ne v9, v0, :cond_2

    .line 1518
    const/16 v9, 0x20

    .line 1522
    :cond_2
    const/16 v0, 0x20

    if-ne v9, v0, :cond_3

    .line 1523
    if-eqz v11, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1524
    goto/16 :goto_0

    .line 1529
    :cond_3
    const/16 v0, 0x33

    if-ne v9, v0, :cond_4

    .line 1530
    const/16 v9, 0x17

    .line 1533
    :cond_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/eut;

    .line 1534
    iget v0, v15, Lo/eut;->b:I

    if-ne v0, v9, :cond_5

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exo$12;->b:Lo/exo;

    iget-object v1, v15, Lo/eut;->e:Ljava/lang/String;

    invoke-static {v0, v1, v12}, Lo/exo;->d(Lo/exo;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1535
    const/4 v13, 0x1

    .line 1536
    goto :goto_2

    .line 1538
    :cond_5
    goto :goto_1

    .line 1541
    :cond_6
    :goto_2
    if-nez v13, :cond_7

    iget v0, v8, Lo/eut;->b:I

    const/16 v1, 0x2710

    if-ge v0, v1, :cond_7

    .line 1542
    iput v9, v8, Lo/eut;->b:I

    .line 1543
    iput-object v10, v8, Lo/eut;->c:Ljava/lang/String;

    .line 1544
    iput-object v11, v8, Lo/eut;->a:Ljava/lang/String;

    .line 1545
    iput-object v12, v8, Lo/eut;->e:Ljava/lang/String;

    .line 1546
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1550
    :cond_7
    goto/16 :goto_0

    .line 1554
    :cond_8
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_9

    .line 1555
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 1556
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Step data origin is only phone."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1558
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exo$12;->c:Lo/egg;

    move/from16 v1, p1

    invoke-interface {v0, v1, v5}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 1559
    return-void
.end method
