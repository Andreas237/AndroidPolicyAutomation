.class public Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;
.super Lcom/unionpay/tsmservice/ITsmCallback$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unionpay/tsmservice/UPTsmAddon;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TsmCallback"
.end annotation


# instance fields
.field private mCallbackId:I

.field final synthetic this$0:Lcom/unionpay/tsmservice/UPTsmAddon;


# direct methods
.method public constructor <init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V
    .locals 0

    .line 1433
    iput-object p1, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;-><init>()V

    .line 1434
    iput p2, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->mCallbackId:I

    .line 1435
    return-void
.end method

.method private getCallbackDecryptResultData(ILandroid/os/Bundle;)Landroid/os/Bundle;
    .locals 35

    .line 1464
    const-string v0, "BLETEST"

    const-string v1, "=====getCallbackDecryptResultData"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1465
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 1466
    const-string v0, "errorCode"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1467
    const-string v0, "result"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1468
    invoke-static {v4}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->adM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1469
    const/4 v0, 0x0

    invoke-static {v5, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v6

    .line 1470
    const-string v0, "errorCode"

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1471
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v7

    .line 1472
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    array-length v0, v6

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1473
    array-length v0, v6

    const/4 v1, 0x0

    invoke-virtual {v7, v6, v1, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 1474
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1476
    :cond_0
    invoke-virtual {v7}, Landroid/os/Parcel;->dataSize()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1477
    invoke-virtual {v7}, Landroid/os/Parcel;->recycle()V

    .line 1478
    return-object v2

    .line 1480
    :cond_1
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 1482
    :sswitch_0
    const-class v0, Lcom/unionpay/tsmservice/result/InitResult;

    .line 1483
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/unionpay/tsmservice/result/InitResult;

    .line 1484
    const-string v0, "result"

    invoke-virtual {v2, v0, v8}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1485
    goto/16 :goto_1

    .line 1487
    :sswitch_1
    const-class v0, Lcom/unionpay/tsmservice/result/GetSupportedCardTypeListResult;

    .line 1489
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1488
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/unionpay/tsmservice/result/GetSupportedCardTypeListResult;

    .line 1490
    const-string v0, "result"

    invoke-virtual {v2, v0, v9}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1492
    goto/16 :goto_1

    .line 1494
    :sswitch_2
    const-class v0, Lcom/unionpay/tsmservice/result/CheckBinCodeResult;

    .line 1496
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1495
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/unionpay/tsmservice/result/CheckBinCodeResult;

    .line 1497
    const-string v0, "result"

    invoke-virtual {v2, v0, v10}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1498
    goto/16 :goto_1

    .line 1500
    :sswitch_3
    const-class v0, Lcom/unionpay/tsmservice/result/GetAssociatedAppResult;

    .line 1502
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1501
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/unionpay/tsmservice/result/GetAssociatedAppResult;

    .line 1503
    const-string v0, "result"

    invoke-virtual {v2, v0, v11}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1505
    goto/16 :goto_1

    .line 1507
    :sswitch_4
    const-class v0, Lcom/unionpay/tsmservice/result/GetSeAppListResult;

    .line 1509
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1508
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/unionpay/tsmservice/result/GetSeAppListResult;

    .line 1510
    const-string v0, "result"

    invoke-virtual {v2, v0, v12}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1511
    goto/16 :goto_1

    .line 1513
    :sswitch_5
    const-class v0, Lcom/unionpay/tsmservice/result/GetAppListResult;

    .line 1515
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1514
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/unionpay/tsmservice/result/GetAppListResult;

    .line 1516
    const-string v0, "result"

    invoke-virtual {v2, v0, v13}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1517
    goto/16 :goto_1

    .line 1519
    :sswitch_6
    const-class v0, Lcom/unionpay/tsmservice/result/GetUniteAppListResult;

    .line 1521
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1520
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/unionpay/tsmservice/result/GetUniteAppListResult;

    .line 1522
    const-string v0, "result"

    invoke-virtual {v2, v0, v14}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1524
    goto/16 :goto_1

    .line 1526
    :sswitch_7
    const-class v0, Lcom/unionpay/tsmservice/result/GetAppDetailResult;

    .line 1528
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1527
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/unionpay/tsmservice/result/GetAppDetailResult;

    .line 1529
    const-string v0, "result"

    invoke-virtual {v2, v0, v15}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1530
    goto/16 :goto_1

    .line 1532
    :sswitch_8
    const-class v0, Lcom/unionpay/tsmservice/result/GetTransElementsResult;

    .line 1534
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1533
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/unionpay/tsmservice/result/GetTransElementsResult;

    .line 1535
    const-string v0, "result"

    move-object/from16 v1, v16

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1537
    goto/16 :goto_1

    .line 1539
    :sswitch_9
    const-class v0, Lcom/unionpay/tsmservice/result/AppDownloadApplyResult;

    .line 1541
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1540
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lcom/unionpay/tsmservice/result/AppDownloadApplyResult;

    .line 1542
    const-string v0, "result"

    move-object/from16 v1, v17

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1544
    goto/16 :goto_1

    .line 1546
    :sswitch_a
    const-class v0, Lcom/unionpay/tsmservice/result/GetSMSAuthCodeResult;

    .line 1548
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1547
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/unionpay/tsmservice/result/GetSMSAuthCodeResult;

    .line 1549
    const-string v0, "result"

    move-object/from16 v1, v18

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1550
    goto/16 :goto_1

    .line 1553
    :sswitch_b
    const-class v0, Lcom/unionpay/tsmservice/result/GetSMSAuthCodeResult;

    .line 1555
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1554
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lcom/unionpay/tsmservice/result/GetSMSAuthCodeResult;

    .line 1556
    const-string v0, "result"

    move-object/from16 v1, v19

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1557
    goto/16 :goto_1

    .line 1559
    :sswitch_c
    const-class v0, Lcom/unionpay/tsmservice/result/UniteCardActiveResult;

    .line 1561
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1560
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lcom/unionpay/tsmservice/result/UniteCardActiveResult;

    .line 1562
    const-string v0, "result"

    move-object/from16 v1, v20

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1564
    goto/16 :goto_1

    .line 1566
    :sswitch_d
    const-class v0, Lcom/unionpay/tsmservice/result/GetAccountInfoResult;

    .line 1568
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1567
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lcom/unionpay/tsmservice/result/GetAccountInfoResult;

    .line 1569
    const-string v0, "result"

    move-object/from16 v1, v21

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1570
    goto/16 :goto_1

    .line 1572
    :sswitch_e
    const-class v0, Lcom/unionpay/tsmservice/result/GetAccountBalanceResult;

    .line 1574
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1573
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lcom/unionpay/tsmservice/result/GetAccountBalanceResult;

    .line 1575
    const-string v0, "result"

    move-object/from16 v1, v22

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1577
    goto/16 :goto_1

    .line 1579
    :sswitch_f
    const-class v0, Lcom/unionpay/tsmservice/result/GetCardInfoResult;

    .line 1581
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1580
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v23, v0

    check-cast v23, Lcom/unionpay/tsmservice/result/GetCardInfoResult;

    .line 1582
    const-string v0, "result"

    move-object/from16 v1, v23

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1583
    goto/16 :goto_1

    .line 1585
    :sswitch_10
    const-class v0, Lcom/unionpay/tsmservice/result/GetDefaultCardResult;

    .line 1587
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1586
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Lcom/unionpay/tsmservice/result/GetDefaultCardResult;

    .line 1588
    const-string v0, "result"

    move-object/from16 v1, v24

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1589
    goto/16 :goto_1

    .line 1591
    :sswitch_11
    const-class v0, Lcom/unionpay/tsmservice/result/GetSeIdResult;

    .line 1592
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v25, v0

    check-cast v25, Lcom/unionpay/tsmservice/result/GetSeIdResult;

    .line 1593
    const-string v0, "result"

    move-object/from16 v1, v25

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1594
    goto/16 :goto_1

    .line 1596
    :sswitch_12
    const-class v0, Lcom/unionpay/tsmservice/result/GetTransRecordResult;

    .line 1598
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1597
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Lcom/unionpay/tsmservice/result/GetTransRecordResult;

    .line 1599
    const-string v0, "result"

    move-object/from16 v1, v26

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1600
    goto/16 :goto_1

    .line 1602
    :sswitch_13
    const-class v0, Lcom/unionpay/tsmservice/result/ECashTopUpResult;

    .line 1604
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1603
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v27, v0

    check-cast v27, Lcom/unionpay/tsmservice/result/ECashTopUpResult;

    .line 1605
    const-string v0, "result"

    move-object/from16 v1, v27

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1606
    goto/16 :goto_1

    .line 1608
    :sswitch_14
    const-class v0, Lcom/unionpay/tsmservice/result/EncryptDataResult;

    .line 1610
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1609
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v28, v0

    check-cast v28, Lcom/unionpay/tsmservice/result/EncryptDataResult;

    .line 1611
    const-string v0, "result"

    move-object/from16 v1, v28

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1612
    goto/16 :goto_1

    .line 1614
    :sswitch_15
    const-class v0, Lcom/unionpay/tsmservice/result/OpenChannelResult;

    .line 1616
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1615
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v29, v0

    check-cast v29, Lcom/unionpay/tsmservice/result/OpenChannelResult;

    .line 1617
    const-string v0, "result"

    move-object/from16 v1, v29

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1618
    goto/16 :goto_1

    .line 1620
    :sswitch_16
    const-class v0, Lcom/unionpay/tsmservice/result/SendApduResult;

    .line 1621
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v30, v0

    check-cast v30, Lcom/unionpay/tsmservice/result/SendApduResult;

    .line 1622
    const-string v0, "result"

    move-object/from16 v1, v30

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1623
    goto/16 :goto_1

    .line 1625
    :sswitch_17
    move-object/from16 v2, p2

    .line 1626
    goto/16 :goto_1

    .line 1629
    :sswitch_18
    const-string v0, "BLETEST"

    const-string v1, "====CALLBACK_BLE_KEY_EXCHANGE"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1630
    const-class v0, Lcom/unionpay/tsmservice/result/BleKeyExchangeResult;

    .line 1632
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1631
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v31, v0

    check-cast v31, Lcom/unionpay/tsmservice/result/BleKeyExchangeResult;

    .line 1633
    const-string v0, "BLETEST"

    const-string v1, "====CALLBACK_BLE_KEY_EXCHANGE"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1634
    const-string v0, "result"

    move-object/from16 v1, v31

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1635
    goto :goto_1

    .line 1637
    :sswitch_19
    const-class v0, Lcom/unionpay/tsmservice/result/GetActivityApplyDeleteResult;

    .line 1639
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1638
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v32, v0

    check-cast v32, Lcom/unionpay/tsmservice/result/GetActivityApplyDeleteResult;

    .line 1640
    const-string v0, "result"

    move-object/from16 v1, v32

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1642
    const-string v0, "BLETEST"

    const-string v1, "1028"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1644
    goto :goto_1

    .line 1646
    :sswitch_1a
    const-class v0, Lcom/unionpay/tsmservice/result/GetActivityUniteApplyResult;

    .line 1648
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1647
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v33, v0

    check-cast v33, Lcom/unionpay/tsmservice/result/GetActivityUniteApplyResult;

    .line 1649
    const-string v0, "result"

    move-object/from16 v1, v33

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1651
    const-string v0, "BLETEST"

    const-string v1, "1031"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1653
    goto :goto_1

    .line 1655
    :sswitch_1b
    const-class v0, Lcom/unionpay/tsmservice/result/GetEncryptDataResult;

    .line 1657
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 1656
    invoke-virtual {v7, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v34, v0

    check-cast v34, Lcom/unionpay/tsmservice/result/GetEncryptDataResult;

    .line 1658
    const-string v0, "result"

    move-object/from16 v1, v34

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1659
    goto :goto_1

    .line 1661
    :goto_0
    move-object/from16 v2, p2

    .line 1665
    :goto_1
    invoke-virtual {v7}, Landroid/os/Parcel;->recycle()V

    .line 1666
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x2a -> :sswitch_1b
        0x3e8 -> :sswitch_0
        0x3e9 -> :sswitch_3
        0x3ea -> :sswitch_8
        0x3eb -> :sswitch_a
        0x3ec -> :sswitch_d
        0x3ed -> :sswitch_e
        0x3ee -> :sswitch_9
        0x3f1 -> :sswitch_5
        0x3f2 -> :sswitch_7
        0x3f3 -> :sswitch_15
        0x3f4 -> :sswitch_16
        0x3f6 -> :sswitch_4
        0x3f7 -> :sswitch_10
        0x3f9 -> :sswitch_12
        0x3fa -> :sswitch_13
        0x3fb -> :sswitch_11
        0x3ff -> :sswitch_14
        0x400 -> :sswitch_f
        0x402 -> :sswitch_17
        0x403 -> :sswitch_18
        0x404 -> :sswitch_19
        0x406 -> :sswitch_2
        0x407 -> :sswitch_1a
        0x408 -> :sswitch_6
        0x409 -> :sswitch_b
        0x40a -> :sswitch_c
        0x40d -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public onError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1451
    const-string v0, "UPTsmAddon"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "errorCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", errorDesc:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1452
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 1453
    const-string v0, "errorCode"

    invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1454
    const-string v0, "errorDesc"

    if-nez p2, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object v1, p2

    :goto_0
    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1456
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget v2, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->mCallbackId:I

    invoke-static {v1, v2}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$300(Lcom/unionpay/tsmservice/UPTsmAddon;I)Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-static {v2}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$200(Lcom/unionpay/tsmservice/UPTsmAddon;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/unionpay/tsmservice/ITsmCallback;

    invoke-static {v0, v1, v3}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$500(Lcom/unionpay/tsmservice/UPTsmAddon;Lcom/unionpay/tsmservice/ITsmCallback;Landroid/os/Bundle;)V

    .line 1459
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget v1, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->mCallbackId:I

    invoke-static {v0, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$300(Lcom/unionpay/tsmservice/UPTsmAddon;I)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-static {v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$200(Lcom/unionpay/tsmservice/UPTsmAddon;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1460
    return-void
.end method

.method public onResult(Landroid/os/Bundle;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1440
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 1441
    iget v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->mCallbackId:I

    invoke-direct {p0, v0, p1}, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->getCallbackDecryptResultData(ILandroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v3

    .line 1442
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget v2, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->mCallbackId:I

    invoke-static {v1, v2}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$300(Lcom/unionpay/tsmservice/UPTsmAddon;I)Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-static {v2}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$200(Lcom/unionpay/tsmservice/UPTsmAddon;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/unionpay/tsmservice/ITsmCallback;

    invoke-static {v0, v1, v3}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$500(Lcom/unionpay/tsmservice/UPTsmAddon;Lcom/unionpay/tsmservice/ITsmCallback;Landroid/os/Bundle;)V

    .line 1445
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget v1, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->mCallbackId:I

    invoke-static {v0, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$300(Lcom/unionpay/tsmservice/UPTsmAddon;I)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-static {v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$200(Lcom/unionpay/tsmservice/UPTsmAddon;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1446
    return-void
.end method
