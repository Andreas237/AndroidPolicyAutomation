.class public Lo/cvz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dti;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cvz$d;
    }
.end annotation


# static fields
.field private static b:I

.field private static d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 732
    const/4 v0, 0x0

    sput v0, Lo/cvz;->b:I

    .line 733
    const/4 v0, 0x0

    sput v0, Lo/cvz;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    return-void
.end method

.method private a(ILo/eiv;)I
    .locals 1

    .line 1363
    const v0, 0x9c42

    if-ne p1, v0, :cond_3

    .line 1364
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    if-ne p2, v0, :cond_0

    .line 1365
    const v0, 0x9c42

    return v0

    .line 1366
    :cond_0
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    if-ne p2, v0, :cond_1

    .line 1367
    const v0, 0x9c4b

    return v0

    .line 1368
    :cond_1
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    if-ne p2, v0, :cond_2

    .line 1369
    const v0, 0x9c4c

    return v0

    .line 1370
    :cond_2
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    if-ne p2, v0, :cond_e

    .line 1371
    const v0, 0x9c4d

    return v0

    .line 1374
    :cond_3
    const v0, 0x9c44

    if-ne p1, v0, :cond_8

    .line 1375
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    if-ne p2, v0, :cond_4

    .line 1376
    const v0, 0x9c44

    return v0

    .line 1377
    :cond_4
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    if-ne p2, v0, :cond_5

    .line 1378
    const v0, 0x9c5f

    return v0

    .line 1379
    :cond_5
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    if-ne p2, v0, :cond_6

    .line 1380
    const v0, 0x9c60

    return v0

    .line 1381
    :cond_6
    sget-object v0, Lo/eiv;->c:Lo/eiv;

    if-ne p2, v0, :cond_7

    .line 1382
    const v0, 0x9c61

    return v0

    .line 1383
    :cond_7
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    if-ne p2, v0, :cond_e

    .line 1384
    const v0, 0x9c62

    return v0

    .line 1386
    :cond_8
    const v0, 0x9c43

    if-ne p1, v0, :cond_d

    .line 1387
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    if-ne p2, v0, :cond_9

    .line 1388
    const v0, 0x9c43

    return v0

    .line 1389
    :cond_9
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    if-ne p2, v0, :cond_a

    .line 1390
    const v0, 0x9c55

    return v0

    .line 1391
    :cond_a
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    if-ne p2, v0, :cond_b

    .line 1392
    const v0, 0x9c56

    return v0

    .line 1393
    :cond_b
    sget-object v0, Lo/eiv;->c:Lo/eiv;

    if-ne p2, v0, :cond_c

    .line 1394
    const v0, 0x9c57

    return v0

    .line 1395
    :cond_c
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    if-ne p2, v0, :cond_e

    .line 1396
    const v0, 0x9c58

    return v0

    .line 1398
    :cond_d
    const v0, 0x9c45

    if-ne p1, v0, :cond_e

    .line 1399
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    if-ne p2, v0, :cond_e

    .line 1400
    const v0, 0x9c45

    return v0

    .line 1403
    :cond_e
    const/4 v0, 0x0

    return v0
.end method

.method private a(JJI)Lcom/huawei/hihealth/HiAggregateOption;
    .locals 5

    .line 670
    new-instance v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 672
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 673
    invoke-virtual {v2, p1, p2}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 674
    invoke-virtual {v2, p3, p4}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 675
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 676
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 677
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 681
    packed-switch p5, :pswitch_data_0

    goto/16 :goto_0

    .line 683
    :pswitch_0
    const/4 v3, 0x5

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 685
    const/4 v0, 0x5

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "Track_Run_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "Track_Run_Duration_Sum"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "Track_Run_Count_Sum"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    const-string v0, "sport_walk_step_sum"

    const/4 v1, 0x3

    aput-object v0, v4, v1

    const-string v0, "Track_Run_Abnormal_Count_Sum"

    const/4 v1, 0x4

    aput-object v0, v4, v1

    .line 687
    goto/16 :goto_1

    .line 689
    :pswitch_1
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_1

    .line 690
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "Track_Walk_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 691
    goto/16 :goto_1

    .line 693
    :pswitch_2
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_2

    .line 694
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "Track_Ride_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 695
    goto :goto_1

    .line 697
    :pswitch_3
    const/4 v3, 0x3

    new-array v3, v3, [I

    fill-array-data v3, :array_3

    .line 700
    const/4 v0, 0x3

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "Track_Run_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "Track_Run_Count_Sum"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "Track_Run_Abnormal_Count_Sum"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    .line 703
    goto :goto_1

    .line 705
    :pswitch_4
    const/4 v3, 0x3

    new-array v3, v3, [I

    fill-array-data v3, :array_4

    .line 708
    const/4 v0, 0x3

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "Track_Ride_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "Track_Ride_Count_Sum"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "Track_Ride_Abnormal_Count_Sum"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    .line 711
    goto :goto_1

    .line 713
    :pswitch_5
    const/4 v3, 0x6

    new-array v3, v3, [I

    fill-array-data v3, :array_5

    .line 716
    const/4 v0, 0x6

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "Track_Run_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "Track_Ride_Distance_Sum"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "Track_Run_Count_Sum"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    const-string v0, "Track_Ride_Count_Sum"

    const/4 v1, 0x3

    aput-object v0, v4, v1

    const-string v0, "Track_Run_Abnormal_Count_Sum"

    const/4 v1, 0x4

    aput-object v0, v4, v1

    const-string v0, "Track_Ride_Abnormal_Count_Sum"

    const/4 v1, 0x5

    aput-object v0, v4, v1

    .line 719
    goto :goto_1

    .line 721
    :goto_0
    :pswitch_6
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_6

    .line 722
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "Track_Run_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 725
    :goto_1
    invoke-virtual {v2, v4}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 726
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 728
    return-object v2

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch

    :array_0
    .array-data 4
        0xa476
        0xa478    # 5.9E-41f
        0xa479
        0x9c42
        0xa47a
    .end array-data

    :array_1
    .array-data 4
        0xa444
    .end array-data

    :array_2
    .array-data 4
        0xa4a8
    .end array-data

    :array_3
    .array-data 4
        0xa476
        0xa479
        0xa47a
    .end array-data

    :array_4
    .array-data 4
        0xa4a8
        0xa4ab
        0xa4ac
    .end array-data

    :array_5
    .array-data 4
        0xa476
        0xa4a8
        0xa479
        0xa4ab
        0xa47a
        0xa4ac
    .end array-data

    :array_6
    .array-data 4
        0xa476
    .end array-data
.end method

.method private b(Lcom/huawei/ui/openservice/db/control/OpenServiceControl;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1685
    new-instance v1, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    invoke-direct {v1}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;-><init>()V

    .line 1686
    invoke-virtual {v1, p3}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configHuid(Ljava/lang/String;)V

    .line 1687
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configAuthType(I)V

    .line 1688
    invoke-virtual {v1, p2}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configServiceID(Ljava/lang/String;)V

    .line 1689
    invoke-virtual {p1, v1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->insertOrUpdateUserAuth(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Z

    .line 1690
    return-void
.end method

.method private b(Lcom/huawei/ui/openservice/db/model/OpenService;Landroid/content/Context;)V
    .locals 3

    .line 1673
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v2, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1674
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1675
    const-string v0, "url"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1676
    const-string v0, "EXTRA_BI_ID"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1677
    const-string v0, "EXTRA_BI_NAME"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getProductName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1678
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "OpenService"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1679
    const-string v0, "type"

    const-string v1, "OPEN_SERVICE_TYPE"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1680
    invoke-virtual {p2, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1681
    return-void
.end method

.method private b(ILo/eiv;)Z
    .locals 1

    .line 1427
    const v0, 0x9c42

    if-ne p1, v0, :cond_4

    .line 1428
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    if-ne p2, v0, :cond_0

    .line 1429
    const/4 v0, 0x1

    return v0

    .line 1430
    :cond_0
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    if-ne p2, v0, :cond_1

    .line 1431
    const/4 v0, 0x1

    return v0

    .line 1432
    :cond_1
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    if-ne p2, v0, :cond_2

    .line 1433
    const/4 v0, 0x1

    return v0

    .line 1434
    :cond_2
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    if-ne p2, v0, :cond_3

    .line 1435
    const/4 v0, 0x1

    return v0

    .line 1437
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 1440
    :cond_4
    const v0, 0x9c44

    if-ne p1, v0, :cond_a

    .line 1441
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    if-ne p2, v0, :cond_5

    .line 1442
    const/4 v0, 0x1

    return v0

    .line 1443
    :cond_5
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    if-ne p2, v0, :cond_6

    .line 1444
    const/4 v0, 0x1

    return v0

    .line 1445
    :cond_6
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    if-ne p2, v0, :cond_7

    .line 1446
    const/4 v0, 0x1

    return v0

    .line 1447
    :cond_7
    sget-object v0, Lo/eiv;->c:Lo/eiv;

    if-ne p2, v0, :cond_8

    .line 1448
    const/4 v0, 0x1

    return v0

    .line 1449
    :cond_8
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    if-ne p2, v0, :cond_9

    .line 1450
    const/4 v0, 0x1

    return v0

    .line 1452
    :cond_9
    const/4 v0, 0x0

    return v0

    .line 1455
    :cond_a
    const v0, 0x9c43

    if-ne p1, v0, :cond_10

    .line 1456
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    if-ne p2, v0, :cond_b

    .line 1457
    const/4 v0, 0x1

    return v0

    .line 1458
    :cond_b
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    if-ne p2, v0, :cond_c

    .line 1459
    const/4 v0, 0x1

    return v0

    .line 1460
    :cond_c
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    if-ne p2, v0, :cond_d

    .line 1461
    const/4 v0, 0x1

    return v0

    .line 1462
    :cond_d
    sget-object v0, Lo/eiv;->c:Lo/eiv;

    if-ne p2, v0, :cond_e

    .line 1463
    const/4 v0, 0x1

    return v0

    .line 1464
    :cond_e
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    if-ne p2, v0, :cond_f

    .line 1465
    const/4 v0, 0x1

    return v0

    .line 1467
    :cond_f
    const/4 v0, 0x0

    return v0

    .line 1470
    :cond_10
    const/4 v0, 0x0

    return v0
.end method

.method private b(I)[I
    .locals 4

    .line 1340
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1341
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/cvz;->a(ILo/eiv;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1343
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/cvz;->b(ILo/eiv;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1344
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/cvz;->a(ILo/eiv;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1346
    :cond_0
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/cvz;->b(ILo/eiv;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1347
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/cvz;->a(ILo/eiv;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1349
    :cond_1
    sget-object v0, Lo/eiv;->c:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/cvz;->b(ILo/eiv;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1350
    sget-object v0, Lo/eiv;->c:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/cvz;->a(ILo/eiv;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1352
    :cond_2
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/cvz;->b(ILo/eiv;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1353
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/cvz;->a(ILo/eiv;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1355
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    new-array v2, v0, [I

    .line 1356
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    if-ge v3, v0, :cond_4

    .line 1357
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v2, v3

    .line 1356
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1359
    :cond_4
    return-object v2
.end method

.method private c(I)I
    .locals 2

    .line 478
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 480
    :pswitch_0
    const/16 v1, 0x7536

    .line 481
    goto :goto_1

    .line 483
    :pswitch_1
    const/16 v1, 0x7535

    .line 484
    goto :goto_1

    .line 486
    :pswitch_2
    const/16 v1, 0x7537

    .line 487
    goto :goto_1

    .line 489
    :goto_0
    const/16 v1, 0x7534

    .line 492
    :goto_1
    return v1

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic c(Lo/cvz;Lcom/huawei/ui/openservice/db/control/OpenServiceControl;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 88
    invoke-direct {p0, p1, p2, p3}, Lo/cvz;->b(Lcom/huawei/ui/openservice/db/control/OpenServiceControl;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lo/cvz;Lo/duh;)V
    .locals 0

    .line 88
    invoke-direct {p0, p1}, Lo/cvz;->c(Lo/duh;)V

    return-void
.end method

.method private c(Lo/duh;)V
    .locals 6

    .line 551
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->d(J)J

    move-result-wide v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Lo/cnk;->i(J)J

    move-result-wide v3

    new-instance v5, Lo/cvz$17;

    invoke-direct {v5, p0, p1}, Lo/cvz$17;-><init>(Lo/cvz;Lo/duh;)V

    invoke-virtual/range {v0 .. v5}, Lo/dgu;->d(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 577
    return-void
.end method

.method static synthetic d(Lo/cvz;I)I
    .locals 1

    .line 88
    invoke-direct {p0, p1}, Lo/cvz;->c(I)I

    move-result v0

    return v0
.end method

.method private d(JJI)Lcom/huawei/hihealth/HiAggregateOption;
    .locals 5

    .line 504
    new-instance v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 506
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 507
    invoke-virtual {v2, p1, p2}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 508
    invoke-virtual {v2, p3, p4}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 509
    const/4 v0, 0x7

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 510
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 511
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 515
    packed-switch p5, :pswitch_data_0

    goto :goto_0

    .line 517
    :pswitch_0
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 518
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "Track_Run_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 519
    goto :goto_1

    .line 521
    :pswitch_1
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_1

    .line 522
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "Track_Walk_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 523
    goto :goto_1

    .line 525
    :pswitch_2
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_2

    .line 526
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "Track_Ride_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 527
    goto :goto_1

    .line 529
    :pswitch_3
    const/4 v3, 0x3

    new-array v3, v3, [I

    fill-array-data v3, :array_3

    .line 533
    const/4 v0, 0x3

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "Track_Run_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "Track_Walk_Distance_Sum"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "Track_Ride_Distance_Sum"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    .line 537
    goto :goto_1

    .line 539
    :goto_0
    :pswitch_4
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_4

    .line 540
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "Track_Run_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 543
    :goto_1
    invoke-virtual {v2, v4}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 544
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 546
    return-object v2

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :array_0
    .array-data 4
        0xa476
    .end array-data

    :array_1
    .array-data 4
        0xa444
    .end array-data

    :array_2
    .array-data 4
        0xa4a8
    .end array-data

    :array_3
    .array-data 4
        0xa476
        0xa444
        0xa4a8
    .end array-data

    :array_4
    .array-data 4
        0xa476
    .end array-data
.end method

.method public static d(I)V
    .locals 5

    .line 736
    sget v0, Lo/cvz;->d:I

    if-ge p0, v0, :cond_0

    .line 737
    const/4 v0, 0x0

    sput v0, Lo/cvz;->d:I

    .line 739
    :cond_0
    sget v0, Lo/cvz;->d:I

    sub-int v0, p0, v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_1

    .line 740
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "steps ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 741
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 742
    const-string v0, "step"

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 743
    sput p0, Lo/cvz;->d:I

    .line 744
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const v2, 0x33464

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v4}, Lo/dth;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I

    .line 746
    :cond_1
    sput p0, Lo/cvz;->b:I

    .line 747
    return-void
.end method

.method private e(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 10

    .line 1090
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 1091
    const/4 v0, 0x0

    invoke-virtual {v4, p2, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v5

    .line 1092
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_1

    .line 1093
    :cond_0
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the activity to jump to is not found or found more than one!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1094
    const/4 v0, 0x0

    return-object v0

    .line 1096
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 1097
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v7, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 1098
    new-instance v8, Landroid/content/ComponentName;

    invoke-direct {v8, v6, v7}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1099
    new-instance v9, Landroid/content/Intent;

    invoke-direct {v9, p2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 1100
    invoke-virtual {v9, v8}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 1101
    return-object v9
.end method

.method private e(JJI)Lcom/huawei/hihealth/HiAggregateOption;
    .locals 5

    .line 623
    new-instance v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 625
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 626
    invoke-virtual {v2, p1, p2}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 627
    invoke-virtual {v2, p3, p4}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 628
    const/4 v0, 0x6

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 629
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 630
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 634
    packed-switch p5, :pswitch_data_0

    goto :goto_0

    .line 636
    :pswitch_0
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 637
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "totalCalorie"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 638
    goto :goto_1

    .line 640
    :pswitch_1
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_1

    .line 641
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "totalDistance"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 642
    goto :goto_1

    .line 644
    :pswitch_2
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_2

    .line 645
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "totalStep"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 646
    goto :goto_1

    .line 648
    :pswitch_3
    const/4 v3, 0x3

    new-array v3, v3, [I

    fill-array-data v3, :array_3

    .line 649
    const/4 v0, 0x3

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "totalCalorie"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "totalDistance"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "totalStep"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    .line 650
    goto :goto_1

    .line 652
    :goto_0
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_4

    .line 653
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "totalCalorie"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 656
    :goto_1
    invoke-virtual {v2, v4}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 657
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 658
    return-object v2

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :array_0
    .array-data 4
        0x9c43
    .end array-data

    :array_1
    .array-data 4
        0x9c44
    .end array-data

    :array_2
    .array-data 4
        0x9c42
    .end array-data

    :array_3
    .array-data 4
        0x9c43
        0x9c44
        0x9c42
    .end array-data

    :array_4
    .array-data 4
        0x9c42
    .end array-data
.end method

.method private e(I)[Ljava/lang/String;
    .locals 3

    .line 1407
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1408
    const-string v0, "sum"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1410
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/cvz;->b(ILo/eiv;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1411
    const-string v0, "walk"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1413
    :cond_0
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/cvz;->b(ILo/eiv;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1414
    const-string v0, "run"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1416
    :cond_1
    sget-object v0, Lo/eiv;->c:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/cvz;->b(ILo/eiv;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1417
    const-string v0, "bike"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1419
    :cond_2
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/cvz;->b(ILo/eiv;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1420
    const-string v0, "climb"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1422
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    new-array v2, v0, [Ljava/lang/String;

    .line 1423
    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/Date;Ljava/util/Date;)I
    .locals 9

    .line 268
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startDate="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "endDate="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/brt;->c(Ljava/util/Date;Ljava/util/Date;)Ljava/util/List;

    move-result-object v4

    .line 270
    const/4 v5, 0x0

    .line 271
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 272
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 273
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 274
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map;

    .line 275
    const-string v0, "totalduration"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 277
    const-string v0, "totalduration"

    :try_start_0
    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 278
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    add-int/2addr v0, v5

    move v5, v0

    .line 281
    goto :goto_1

    .line 279
    :catch_0
    move-exception v8

    .line 280
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTotalFitDuration NumberFormatException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    :cond_0
    :goto_1
    goto :goto_0

    .line 285
    :cond_1
    return v5
.end method

.method public a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 1112
    :try_start_0
    invoke-static {p2}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1}, Lo/dec;->c(ILjava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 1113
    :catch_0
    move-exception v4

    .line 1114
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1116
    const-string v0, "default"

    return-object v0
.end method

.method public a(Landroid/content/Context;)V
    .locals 5

    .line 1078
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.ui.thirdpartservice.activity.ThirdPartServiceActivity"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1079
    invoke-direct {p0, p1, v4}, Lo/cvz;->e(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v4

    .line 1080
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1081
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the intent to Health share data is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1082
    return-void

    .line 1084
    :cond_0
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1085
    invoke-virtual {p1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1086
    return-void
.end method

.method public a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 133
    new-instance v1, Lo/dav;

    invoke-direct {v1, p2}, Lo/dav;-><init>(I)V

    .line 134
    invoke-virtual {v1, p3}, Lo/dav;->e(Ljava/lang/String;)V

    .line 135
    invoke-virtual {v1, p4}, Lo/dav;->c(Ljava/lang/String;)V

    .line 136
    invoke-virtual {v1, p5}, Lo/dav;->e(Landroid/graphics/Bitmap;)V

    .line 137
    invoke-virtual {v1, p6}, Lo/dav;->a(Ljava/lang/String;)V

    .line 138
    invoke-virtual {v1, p9}, Lo/dav;->d(Ljava/lang/String;)V

    .line 139
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/dav;->d(Z)V

    .line 140
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/dav;->e(I)V

    .line 141
    sget-object v0, Lo/dae;->W:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    const/4 v0, 0x5

    invoke-virtual {v1, v0}, Lo/dav;->a(I)V

    .line 144
    :cond_0
    invoke-virtual {v1, p10}, Lo/dav;->c(Ljava/util/Map;)V

    .line 145
    invoke-static {p1, v1, p7, p8}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 146
    return-void
.end method

.method public a(Landroid/content/Context;JJ)V
    .locals 2

    .line 1145
    cmp-long v0, p4, p2

    if-ltz v0, :cond_0

    const-wide/16 v0, 0x1

    add-long/2addr v0, p2

    cmp-long v0, p4, v0

    if-nez v0, :cond_1

    .line 1146
    :cond_0
    invoke-virtual/range {p0 .. p5}, Lo/cvz;->c(Landroid/content/Context;JJ)V

    goto :goto_0

    .line 1148
    :cond_1
    invoke-virtual/range {p0 .. p5}, Lo/cvz;->e(Landroid/content/Context;JJ)V

    .line 1150
    :goto_0
    return-void
.end method

.method public a(Landroid/content/Context;JJILo/duh;)V
    .locals 6

    .line 439
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getTrackListData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    new-instance v4, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 442
    invoke-virtual {v4, p2, p3, p4, p5}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 443
    const/4 v0, 0x1

    new-array v5, v0, [I

    .line 444
    invoke-direct {p0, p6}, Lo/cvz;->c(I)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v5, v1

    .line 446
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 447
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setSortOrder(I)V

    .line 448
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cvz$18;

    invoke-direct {v1, p0, p7, p6}, Lo/cvz$18;-><init>(Lo/cvz;Lo/duh;I)V

    invoke-interface {v0, v4, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 473
    return-void
.end method

.method public a(Landroid/content/Context;JJLo/duh;)V
    .locals 10

    .line 1212
    const/4 v9, 0x3

    .line 1213
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move v6, v9

    new-instance v7, Lo/cvz$5;

    move-object/from16 v8, p6

    invoke-direct {v7, p0, v8}, Lo/cvz$5;-><init>(Lo/cvz;Lo/duh;)V

    const/4 v6, 0x3

    invoke-virtual/range {v0 .. v7}, Lo/cvz;->c(Landroid/content/Context;JJILo/duh;)V

    .line 1226
    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 864
    invoke-virtual {p0, p2}, Lo/cvz;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 865
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 866
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 867
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 868
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 870
    const-string v0, "kind"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 871
    const-string v0, "view"

    const-string v1, "MeasureDevice"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 872
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 873
    goto :goto_0

    .line 874
    :cond_0
    invoke-virtual {p0, p1, p2}, Lo/cvz;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 876
    :goto_0
    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 5

    .line 1035
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1036
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1037
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1038
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.main.stories.history.SportHistoryActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1040
    invoke-virtual {p1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1043
    goto :goto_0

    .line 1041
    :catch_0
    move-exception v4

    .line 1042
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1045
    :goto_0
    return-void
.end method

.method public b(Landroid/content/Context;JJILo/duh;)V
    .locals 7

    .line 590
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getSumYearData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 593
    move-object v0, p0

    move-wide v1, p2

    move-wide v3, p4

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lo/cvz;->e(JJI)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v6

    .line 595
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cvz$19;

    invoke-direct {v1, p0, p7}, Lo/cvz$19;-><init>(Lo/cvz;Lo/duh;)V

    invoke-interface {v0, v6, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 612
    return-void
.end method

.method public b(Landroid/content/Context;JJLo/duh;)V
    .locals 7

    .line 392
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getWeightData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 396
    const/4 v5, 0x1

    new-array v5, v5, [I

    fill-array-data v5, :array_0

    .line 398
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 399
    invoke-virtual {v4, p2, p3}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 400
    invoke-virtual {v4, p4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 401
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 402
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 403
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 404
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 405
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "weight"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 406
    invoke-virtual {v4, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 408
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cvz$16;

    invoke-direct {v1, p0, p6}, Lo/cvz$16;-><init>(Lo/cvz;Lo/duh;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 426
    return-void

    nop

    :array_0
    .array-data 4
        0x7d4
    .end array-data
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 842
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 843
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 844
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 845
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 847
    const-string v0, "kind"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 848
    const-string v0, "view"

    const-string v1, "BondDevice"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 849
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 850
    return-void
.end method

.method public b(Lo/duh;Landroid/content/Context;)V
    .locals 4

    .line 234
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 235
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "flush stepCOunt!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    invoke-static {}, Lo/cwa;->d()Lo/cmj;

    move-result-object v0

    new-instance v1, Lo/cvz$2;

    invoke-direct {v1, p0, p1}, Lo/cvz$2;-><init>(Lo/cvz;Lo/duh;)V

    invoke-virtual {v0, v1}, Lo/cmj;->b(Lo/cms;)V

    goto :goto_0

    .line 256
    :cond_0
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mApplicationContext is null!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    .line 904
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afd;->c(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public c(Lo/dwc;)Ljava/lang/String;
    .locals 5

    .line 186
    if-nez p1, :cond_0

    .line 187
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateMessage == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    const-string v0, ""

    return-object v0

    .line 190
    :cond_0
    new-instance v4, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-direct {v4}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;-><init>()V

    .line 192
    invoke-virtual {p1}, Lo/dwc;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgId(Ljava/lang/String;)V

    .line 193
    invoke-virtual {p1}, Lo/dwc;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setModule(Ljava/lang/String;)V

    .line 194
    invoke-virtual {p1}, Lo/dwc;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setType(Ljava/lang/String;)V

    .line 195
    invoke-virtual {p1}, Lo/dwc;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgTitle(Ljava/lang/String;)V

    .line 196
    invoke-virtual {p1}, Lo/dwc;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgContent(Ljava/lang/String;)V

    .line 197
    invoke-virtual {p1}, Lo/dwc;->a()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgType(I)V

    .line 198
    invoke-virtual {p1}, Lo/dwc;->p()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setCreateTime(J)V

    .line 199
    invoke-virtual {p1}, Lo/dwc;->n()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setExpireTime(J)V

    .line 200
    invoke-virtual {p1}, Lo/dwc;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setDetailUri(Ljava/lang/String;)V

    .line 201
    invoke-virtual {p1}, Lo/dwc;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setDetailUriExt(Ljava/lang/String;)V

    .line 202
    invoke-virtual {p1}, Lo/dwc;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMetadata(Ljava/lang/String;)V

    .line 203
    invoke-virtual {p1}, Lo/dwc;->h()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setFlag(I)V

    .line 204
    invoke-virtual {p1}, Lo/dwc;->q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setHuid(Ljava/lang/String;)V

    .line 205
    invoke-virtual {p1}, Lo/dwc;->t()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setImei(Ljava/lang/String;)V

    .line 206
    invoke-virtual {p1}, Lo/dwc;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setImgUri(Ljava/lang/String;)V

    .line 207
    invoke-virtual {p1}, Lo/dwc;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgFrom(Ljava/lang/String;)V

    .line 208
    invoke-virtual {p1}, Lo/dwc;->s()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setNotified(I)V

    .line 209
    invoke-virtual {p1}, Lo/dwc;->u()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setPosition(I)V

    .line 210
    invoke-virtual {p1}, Lo/dwc;->i()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setReadFlag(I)V

    .line 211
    invoke-virtual {p1}, Lo/dwc;->f()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setWeight(I)V

    .line 212
    invoke-static {v4}, Lo/fjy;->e(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c([Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 114
    invoke-static {p1}, Lo/fjy;->c([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 2

    .line 920
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    const-string v1, "otherModel"

    invoke-virtual {v0, v1}, Lo/brt;->c(Ljava/lang/String;)V

    .line 921
    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 3
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x4
    .end annotation

    .line 811
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 812
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 813
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 814
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.main.stories.me.activity.MyTargetActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 816
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 817
    return-void
.end method

.method public c(Landroid/content/Context;JJ)V
    .locals 4

    .line 1161
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 1162
    invoke-virtual {v2, p2, p3, p4, p5}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 1163
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 1164
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 1165
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cvz$3;

    invoke-direct {v1, p0, p1, p2, p3}, Lo/cvz$3;-><init>(Lo/cvz;Landroid/content/Context;J)V

    invoke-interface {v0, v2, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 1200
    return-void

    :array_0
    .array-data 4
        0x7532
    .end array-data
.end method

.method public c(Landroid/content/Context;JJILo/duh;)V
    .locals 10

    .line 1265
    const v4, 0x9c42

    .line 1266
    new-instance v5, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 1267
    invoke-virtual {v5, p2, p3}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 1268
    invoke-virtual {v5, p4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 1269
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 1271
    move/from16 v0, p6

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    .line 1272
    const/4 v6, 0x5

    goto :goto_0

    .line 1274
    :cond_0
    move/from16 v6, p6

    .line 1276
    :goto_0
    invoke-direct {p0, v4}, Lo/cvz;->e(I)[Ljava/lang/String;

    move-result-object v7

    .line 1277
    invoke-direct {p0, v4}, Lo/cvz;->b(I)[I

    move-result-object v8

    .line 1278
    invoke-virtual {v5, v7}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 1279
    invoke-virtual {v5, v8}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 1281
    invoke-virtual {v5, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 1282
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 1284
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1285
    invoke-interface {v9, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1287
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cvz$7;

    move-object/from16 v2, p7

    move/from16 v3, p6

    invoke-direct {v1, p0, v2, v3}, Lo/cvz$7;-><init>(Lo/cvz;Lo/duh;I)V

    invoke-interface {v0, v9, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 1329
    return-void
.end method

.method public c(Landroid/content/Context;JJLo/duh;)V
    .locals 2

    .line 1475
    cmp-long v0, p4, p2

    if-ltz v0, :cond_0

    const-wide/16 v0, 0x1

    add-long/2addr v0, p2

    cmp-long v0, p4, v0

    if-nez v0, :cond_1

    .line 1476
    :cond_0
    invoke-virtual/range {p0 .. p6}, Lo/cvz;->e(Landroid/content/Context;JJLo/duh;)V

    goto :goto_0

    .line 1478
    :cond_1
    invoke-virtual/range {p0 .. p6}, Lo/cvz;->g(Landroid/content/Context;JJLo/duh;)V

    .line 1480
    :goto_0
    return-void
.end method

.method public c(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7

    .line 975
    invoke-static {p1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v4

    .line 976
    const-string v0, "A_bububao"

    invoke-virtual {v4, v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryServiceByID(Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/OpenService;

    move-result-object v5

    .line 977
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 978
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoShumianService openService is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 979
    return-void

    .line 981
    :cond_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    .line 982
    new-instance v0, Lo/cvz$1;

    invoke-direct {v0, p0, v4, p2, v5}, Lo/cvz$1;-><init>(Lo/cvz;Lcom/huawei/ui/openservice/db/control/OpenServiceControl;Ljava/lang/String;Lcom/huawei/ui/openservice/db/model/OpenService;)V

    invoke-interface {v6, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 992
    invoke-direct {p0, v5, p1}, Lo/cvz;->b(Lcom/huawei/ui/openservice/db/model/OpenService;Landroid/content/Context;)V

    .line 993
    invoke-interface {v6}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 994
    return-void
.end method

.method public d(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 1130
    :try_start_0
    invoke-static {p2}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1}, Lo/dec;->a(ILjava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 1131
    :catch_0
    move-exception v4

    .line 1132
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1134
    const-string v0, "default"

    return-object v0
.end method

.method public d(Landroid/content/Context;)V
    .locals 3
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x4
    .end annotation

    .line 794
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 795
    const-string v0, "SWITCH_PLUGINDEVICE"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 796
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 797
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 798
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 800
    const-string v0, "kind"

    const-string v1, "HDK_UNKNOWN"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 801
    const-string v0, "arg1"

    const-string v1, "DeviceList"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 802
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 803
    return-void
.end method

.method public d(Landroid/content/Context;JJILo/duh;)V
    .locals 8

    .line 360
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getSumData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 363
    move-object v0, p0

    move-wide v1, p2

    move-wide v3, p4

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lo/cvz;->a(JJI)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v7

    .line 365
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 367
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cvz$13;

    invoke-direct {v1, p0, p7}, Lo/cvz$13;-><init>(Lo/cvz;Lo/duh;)V

    invoke-interface {v0, v6, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 380
    return-void
.end method

.method public d(Landroid/content/Context;JJLo/duh;)V
    .locals 10

    .line 1237
    const/4 v9, 0x5

    .line 1238
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move v6, v9

    new-instance v7, Lo/cvz$9;

    move-object/from16 v8, p6

    invoke-direct {v7, p0, v8}, Lo/cvz$9;-><init>(Lo/cvz;Lo/duh;)V

    const/4 v6, 0x5

    invoke-virtual/range {v0 .. v7}, Lo/cvz;->c(Landroid/content/Context;JJILo/duh;)V

    .line 1251
    return-void
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 174
    invoke-static {p1, p2}, Lo/fjy;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 175
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 4

    .line 223
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "msgId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    invoke-static {p1}, Lo/fjy;->d(Ljava/lang/String;)V

    .line 225
    return-void
.end method

.method public d(Lo/duh;)V
    .locals 2

    .line 757
    sget v0, Lo/cvz;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 760
    return-void
.end method

.method public e()V
    .locals 1

    .line 912
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->h()V

    .line 913
    return-void
.end method

.method public e(Landroid/content/Context;)V
    .locals 5

    .line 1057
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1058
    const-string v0, "today_current_steps_total"

    sget v1, Lo/cvz;->b:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1059
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1060
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1062
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1063
    invoke-virtual {p1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1066
    goto :goto_0

    .line 1064
    :catch_0
    move-exception v4

    .line 1065
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1068
    :goto_0
    return-void
.end method

.method public e(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 150
    new-instance v1, Lo/dav;

    invoke-direct {v1, p2}, Lo/dav;-><init>(I)V

    .line 151
    invoke-virtual {v1, p3}, Lo/dav;->e(Ljava/lang/String;)V

    .line 152
    invoke-virtual {v1, p4}, Lo/dav;->c(Ljava/lang/String;)V

    .line 153
    invoke-virtual {v1, p5}, Lo/dav;->b(Ljava/lang/String;)V

    .line 154
    invoke-virtual {v1, p6}, Lo/dav;->a(Ljava/lang/String;)V

    .line 155
    invoke-virtual {v1, p9}, Lo/dav;->d(Ljava/lang/String;)V

    .line 156
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/dav;->d(Z)V

    .line 157
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/dav;->e(I)V

    .line 158
    sget-object v0, Lo/dae;->W:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 159
    const/4 v0, 0x5

    invoke-virtual {v1, v0}, Lo/dav;->a(I)V

    .line 161
    :cond_0
    invoke-virtual {v1, p10}, Lo/dav;->c(Ljava/util/Map;)V

    .line 162
    invoke-static {p1, v1, p7, p8}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 163
    return-void
.end method

.method public e(Landroid/content/Context;JJ)V
    .locals 4

    .line 1608
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 1609
    invoke-virtual {v2, p2, p3, p4, p5}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 1610
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 1611
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 1612
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cvz$6;

    invoke-direct {v1, p0}, Lo/cvz$6;-><init>(Lo/cvz;)V

    invoke-interface {v0, v2, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 1659
    return-void

    :array_0
    .array-data 4
        0x7533
    .end array-data
.end method

.method public e(Landroid/content/Context;JJILo/duh;)V
    .locals 8

    .line 328
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getTrackSumDistanceData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 331
    move-object v0, p0

    move-wide v1, p2

    move-wide v3, p4

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lo/cvz;->d(JJI)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v7

    .line 333
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 335
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cvz$12;

    invoke-direct {v1, p0, p7}, Lo/cvz$12;-><init>(Lo/cvz;Lo/duh;)V

    invoke-interface {v0, v6, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 348
    return-void
.end method

.method public e(Landroid/content/Context;JJLo/duh;)V
    .locals 9

    .line 1491
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getTrackMetadata"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1492
    new-instance v7, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v7}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 1493
    invoke-virtual {v7, p2, p3, p4, p5}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 1494
    const/4 v8, 0x1

    new-array v8, v8, [I

    fill-array-data v8, :array_0

    .line 1495
    invoke-virtual {v7, v8}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 1496
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cvz$10;

    move-object v2, p0

    move-object v3, p6

    move-object v4, p1

    move-wide v5, p2

    invoke-direct/range {v1 .. v6}, Lo/cvz$10;-><init>(Lo/cvz;Lo/duh;Landroid/content/Context;J)V

    invoke-interface {v0, v7, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 1538
    return-void

    nop

    :array_0
    .array-data 4
        0x7532
    .end array-data
.end method

.method public e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7

    .line 946
    invoke-static {p1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v4

    .line 947
    const-string v0, "A_shumian"

    invoke-virtual {v4, v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryServiceByID(Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/OpenService;

    move-result-object v5

    .line 948
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 949
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoShumianService openService is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 950
    return-void

    .line 952
    :cond_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    .line 953
    new-instance v0, Lo/cvz$20;

    invoke-direct {v0, p0, v4, p2, v5}, Lo/cvz$20;-><init>(Lo/cvz;Lcom/huawei/ui/openservice/db/control/OpenServiceControl;Ljava/lang/String;Lcom/huawei/ui/openservice/db/model/OpenService;)V

    invoke-interface {v6, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 963
    invoke-direct {p0, v5, p1}, Lo/cvz;->b(Lcom/huawei/ui/openservice/db/model/OpenService;Landroid/content/Context;)V

    .line 964
    invoke-interface {v6}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 965
    return-void
.end method

.method public e(Lo/duh;Landroid/content/Context;JJ)V
    .locals 5

    .line 290
    new-instance v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 291
    const/4 v3, 0x2

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 292
    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "step_sum"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "calories_sum"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 293
    const/4 v0, 0x7

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 294
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 295
    invoke-virtual {v2, v4}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 296
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 297
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 298
    invoke-virtual {v2, p3, p4, p5, p6}, Lcom/huawei/hihealth/HiAggregateOption;->setTimeRange(JJ)V

    .line 299
    invoke-static {p2}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cvz$15;

    invoke-direct {v1, p0, p1}, Lo/cvz$15;-><init>(Lo/cvz;Lo/duh;)V

    invoke-interface {v0, v2, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 314
    return-void

    :array_0
    .array-data 4
        0x9c42
        0x9c43
    .end array-data
.end method

.method public f(Landroid/content/Context;JJLo/duh;)V
    .locals 7

    .line 1702
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAnnualSleepReport with startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "endTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1704
    const/16 v4, 0x12

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    .line 1724
    const/16 v0, 0x12

    new-array v5, v0, [Ljava/lang/String;

    const-string v0, "core_sleep_deep_key"

    const/4 v1, 0x0

    aput-object v0, v5, v1

    const-string v0, "core_sleep_shallow_key"

    const/4 v1, 0x1

    aput-object v0, v5, v1

    const-string v0, "core_sleep_wake_dream_key"

    const/4 v1, 0x2

    aput-object v0, v5, v1

    const-string v0, "core_sleep_wake_count_key"

    const/4 v1, 0x3

    aput-object v0, v5, v1

    const-string v0, "core_sleep_score_key"

    const/4 v1, 0x4

    aput-object v0, v5, v1

    const-string v0, "core_sleep_fall_key"

    const/4 v1, 0x5

    aput-object v0, v5, v1

    const-string v0, "core_sleep_wake_up_key"

    const/4 v1, 0x6

    aput-object v0, v5, v1

    const-string v0, "core_sleep_snore_freq_key"

    const/4 v1, 0x7

    aput-object v0, v5, v1

    const-string v0, "core_sleep_deep_sleep_part_key"

    const/16 v1, 0x8

    aput-object v0, v5, v1

    const-string v0, "core_sleep_total_sleep_time_key"

    const/16 v1, 0x9

    aput-object v0, v5, v1

    const-string v0, "core_sleep_day_sleep_time_key"

    const/16 v1, 0xa

    aput-object v0, v5, v1

    const-string v0, "sleep_deep_key"

    const/16 v1, 0xb

    aput-object v0, v5, v1

    const-string v0, "sleep_shallow_key"

    const/16 v1, 0xc

    aput-object v0, v5, v1

    const-string v0, "sleep_wake_key"

    const/16 v1, 0xd

    aput-object v0, v5, v1

    const-string v0, "core_sleep_wake_key"

    const/16 v1, 0xe

    aput-object v0, v5, v1

    const-string v0, "sleep_wake_count_key"

    const/16 v1, 0xf

    aput-object v0, v5, v1

    const-string v0, "core_sleep_valid_data_key"

    const/16 v1, 0x10

    aput-object v0, v5, v1

    const-string v0, "common_sleep_duration_sleep_sum_key"

    const/16 v1, 0x11

    aput-object v0, v5, v1

    .line 1744
    new-instance v6, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 1745
    invoke-virtual {v6, p2, p3}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 1746
    invoke-virtual {v6, p4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 1747
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 1748
    invoke-virtual {v6, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 1749
    invoke-virtual {v6, v4}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 1750
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitSize(I)V

    .line 1751
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 1752
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 1754
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cvz$11;

    invoke-direct {v1, p0, p6}, Lo/cvz$11;-><init>(Lo/cvz;Lo/duh;)V

    invoke-interface {v0, v6, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 1807
    return-void

    nop

    :array_0
    .array-data 4
        0xac46
        0xac47
        0xac45
        0xac4b
        0xacab
        0xaca9
        0xacaa
        0xacb0
        0xac4a
        0xac49
        0xac4c
        0xabe1
        0xabe2
        0xabe3
        0xac48
        0xabe5
        0xacae
        0xabe4
    .end array-data
.end method

.method public g(Landroid/content/Context;JJLo/duh;)V
    .locals 6

    .line 1547
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getTrackDetail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1548
    new-instance v4, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 1549
    invoke-virtual {v4, p2, p3, p4, p5}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 1550
    const/4 v5, 0x1

    new-array v5, v5, [I

    fill-array-data v5, :array_0

    .line 1551
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 1552
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cvz$8;

    invoke-direct {v1, p0, p6}, Lo/cvz$8;-><init>(Lo/cvz;Lo/duh;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 1598
    return-void

    nop

    :array_0
    .array-data 4
        0x7533
    .end array-data
.end method

.method public h(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7

    .line 1005
    invoke-static {p1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v4

    .line 1006
    const-string v0, "dongbao"

    invoke-virtual {v4, v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryServiceByID(Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/OpenService;

    move-result-object v5

    .line 1007
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 1008
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoSecIBaoService openService is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1009
    return-void

    .line 1011
    :cond_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    .line 1012
    new-instance v0, Lo/cvz$4;

    invoke-direct {v0, p0, v4, p2, v5}, Lo/cvz$4;-><init>(Lo/cvz;Lcom/huawei/ui/openservice/db/control/OpenServiceControl;Ljava/lang/String;Lcom/huawei/ui/openservice/db/model/OpenService;)V

    invoke-interface {v6, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1022
    invoke-direct {p0, v5, p1}, Lo/cvz;->b(Lcom/huawei/ui/openservice/db/model/OpenService;Landroid/content/Context;)V

    .line 1023
    invoke-interface {v6}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 1024
    return-void
.end method

.method public k(Landroid/content/Context;JJLo/duh;)V
    .locals 8

    .line 1819
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAnnualFitnessReport with startTime ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "enTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1820
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cwi;->a(Landroid/content/Context;)Lo/cwi;

    move-result-object v0

    new-instance v1, Lo/cvz$14;

    move-object v2, p0

    move-object v3, p6

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lo/cvz$14;-><init>(Lo/cvz;Lo/duh;JJ)V

    invoke-virtual {v0, v1}, Lo/cwi;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1855
    return-void
.end method
