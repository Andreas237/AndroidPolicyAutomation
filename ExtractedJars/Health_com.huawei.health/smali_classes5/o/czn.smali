.class public Lo/czn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/czn;

.field private static c:Landroid/content/Context;

.field public static final d:Ljava/lang/String;

.field public static final e:Ljavax/net/ssl/HostnameVerifier;


# instance fields
.field private a:Lo/czr;

.field private f:Ljava/lang/String;

.field private g:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 186
    const/4 v0, 0x0

    sput-object v0, Lo/czn;->b:Lo/czn;

    .line 187
    const/4 v0, 0x0

    sput-object v0, Lo/czn;->c:Landroid/content/Context;

    .line 189
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "G510"

    goto :goto_0

    :cond_0
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    :goto_0
    sput-object v0, Lo/czn;->d:Ljava/lang/String;

    .line 4912
    new-instance v0, Lo/czn$13;

    invoke-direct {v0}, Lo/czn$13;-><init>()V

    sput-object v0, Lo/czn;->e:Ljavax/net/ssl/HostnameVerifier;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 275
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 190
    const/4 v0, 0x0

    iput-object v0, p0, Lo/czn;->a:Lo/czr;

    .line 191
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/czn;->g:Ljava/util/concurrent/ExecutorService;

    .line 4111
    const-string v0, "7"

    iput-object v0, p0, Lo/czn;->f:Ljava/lang/String;

    .line 276
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/czn;->c:Landroid/content/Context;

    .line 277
    new-instance v0, Lo/czr;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czr;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/czn;->a:Lo/czr;

    .line 278
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    invoke-virtual {v0}, Lo/czr;->e()V

    .line 280
    return-void
.end method

.method private a(Ljava/lang/String;)I
    .locals 7

    .line 4547
    const/4 v4, 0x0

    .line 4548
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 4549
    :cond_0
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPressureUnitCode  parse other unit\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4550
    return v4

    .line 4552
    :cond_1
    move-object v5, p1

    const/4 v6, -0x1

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "mb"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v6, 0x0

    :cond_2
    :goto_0
    sparse-switch v6, :sswitch_data_1

    goto :goto_1

    .line 4554
    :sswitch_1
    const/4 v4, 0x1

    .line 4555
    goto :goto_2

    .line 4557
    :goto_1
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "default getPressureUnitCode  parse other unit\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4560
    :goto_2
    return v4

    :sswitch_data_0
    .sparse-switch
        0xd95 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x0 -> :sswitch_1
    .end sparse-switch
.end method

.method private a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 432
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;

    if-eqz v0, :cond_0

    .line 434
    const-string v0, "/profile/user/setUserProfile"

    return-object v0

    .line 436
    :cond_0
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileReq;

    if-eqz v0, :cond_1

    .line 438
    const-string v0, "/profile/user/getUserProfile"

    return-object v0

    .line 440
    :cond_1
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteUserProfileReq;

    if-eqz v0, :cond_2

    .line 442
    const-string v0, "/profile/user/deleteUserProfile"

    return-object v0

    .line 444
    :cond_2
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteAllUserProfileReq;

    if-eqz v0, :cond_3

    .line 445
    const-string v0, "/profile/user/deleteAllUserProfile"

    return-object v0

    .line 448
    :cond_3
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;

    if-eqz v0, :cond_4

    .line 450
    const-string v0, "/profile/device/bindDevice"

    return-object v0

    .line 452
    :cond_4
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;

    if-eqz v0, :cond_5

    .line 454
    const-string v0, "/profile/device/getBindDevice"

    return-object v0

    .line 456
    :cond_5
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;

    if-eqz v0, :cond_6

    .line 458
    const-string v0, "/profile/device/updateBindDevice"

    return-object v0

    .line 460
    :cond_6
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;

    if-eqz v0, :cond_7

    .line 462
    const-string v0, "/profile/privacy/addPrivacyRecord"

    return-object v0

    .line 464
    :cond_7
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordReq;

    if-eqz v0, :cond_8

    .line 466
    const-string v0, "/profile/privacy/getPrivacyRecord"

    return-object v0

    .line 468
    :cond_8
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    if-eqz v0, :cond_9

    .line 470
    const-string v0, "/profile/merge/mergeUserAllData"

    return-object v0

    .line 473
    :cond_9
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserMergeInfoReq;

    if-eqz v0, :cond_a

    .line 474
    const-string v0, "/profile/merge/getUserMergeInfo"

    return-object v0

    .line 477
    :cond_a
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateCommentReq;

    if-eqz v0, :cond_b

    .line 478
    const-string v0, "/dataRecommend/common/updateCommentRemainderTimes"

    return-object v0

    .line 481
    :cond_b
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/userprofile/GetCommentReq;

    if-eqz v0, :cond_c

    .line 482
    const-string v0, "/dataRecommend/common/getCommentRemainderTimes"

    return-object v0

    .line 486
    :cond_c
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsReq;

    if-eqz v0, :cond_d

    .line 488
    const-string v0, "/dataQuery/common/getSyncVersions"

    return-object v0

    .line 492
    :cond_d
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/AddSportDataReq;

    if-eqz v0, :cond_e

    .line 494
    const-string v0, "/dataSync/sport/addSportsData"

    return-object v0

    .line 496
    :cond_e
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;

    if-eqz v0, :cond_f

    .line 498
    const-string v0, "/dataQuery/sport/getSportsDataByTime"

    return-object v0

    .line 500
    :cond_f
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;

    if-eqz v0, :cond_10

    .line 502
    const-string v0, "/dataQuery/sport/getSportsDataByVersion"

    return-object v0

    .line 504
    :cond_10
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/DelSportDataReq;

    if-eqz v0, :cond_11

    .line 506
    const-string v0, "/dataSync/sport/deleteSportsData"

    return-object v0

    .line 508
    :cond_11
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/DelAllSportDataReq;

    if-eqz v0, :cond_12

    .line 510
    const-string v0, "/dataSync/sport/deleteAllSportsData"

    return-object v0

    .line 512
    :cond_12
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;

    if-eqz v0, :cond_13

    .line 514
    const-string v0, "/dataSync/sport/addTotalSportsData"

    return-object v0

    .line 516
    :cond_13
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/GetSportStatReq;

    if-eqz v0, :cond_14

    .line 518
    const-string v0, "/dataQuery/sport/getSportsStat"

    return-object v0

    .line 520
    :cond_14
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;

    if-eqz v0, :cond_15

    .line 522
    const-string v0, "/dataQuery/sport/getSportsDimenStat"

    return-object v0

    .line 524
    :cond_15
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/AddSleepStatReq;

    if-eqz v0, :cond_16

    .line 526
    const-string v0, "/dataSync/sport/addSleepStat"

    return-object v0

    .line 528
    :cond_16
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/GetSleepStatReq;

    if-eqz v0, :cond_17

    .line 530
    const-string v0, "/dataQuery/sport/getSleepStat"

    return-object v0

    .line 534
    :cond_17
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;

    if-eqz v0, :cond_18

    .line 536
    const-string v0, "/dataSync/health/addHealthData"

    return-object v0

    .line 538
    :cond_18
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;

    if-eqz v0, :cond_19

    .line 540
    const-string v0, "/dataQuery/health/getHealthData"

    return-object v0

    .line 542
    :cond_19
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;

    if-eqz v0, :cond_1a

    .line 544
    const-string v0, "/dataQuery/health/getHealthDataByVersion"

    return-object v0

    .line 546
    :cond_1a
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataReq;

    if-eqz v0, :cond_1b

    .line 548
    const-string v0, "/dataSync/health/deleteHealthData"

    return-object v0

    .line 550
    :cond_1b
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/DelAllHealthDataReq;

    if-eqz v0, :cond_1c

    .line 552
    const-string v0, "/dataSync/health/deleteAllHealthData"

    return-object v0

    .line 554
    :cond_1c
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;

    if-eqz v0, :cond_1d

    .line 556
    const-string v0, "/dataSync/health/addHealthStat"

    return-object v0

    .line 558
    :cond_1d
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;

    if-eqz v0, :cond_1e

    .line 560
    const-string v0, "/dataQuery/health/getHealthStat"

    return-object v0

    .line 562
    :cond_1e
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/userprofile/LastClearCloudDataTimeReq;

    if-eqz v0, :cond_1f

    .line 564
    const-string v0, "/profile/user/lastDelOperation"

    return-object v0

    .line 568
    :cond_1f
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathReq;

    if-eqz v0, :cond_20

    .line 570
    const-string v0, "/dataSync/path/addMotionPathData"

    return-object v0

    .line 572
    :cond_20
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByTimeReq;

    if-eqz v0, :cond_21

    .line 574
    const-string v0, "/dataQuery/path/getMotionPathData"

    return-object v0

    .line 576
    :cond_21
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;

    if-eqz v0, :cond_22

    .line 578
    const-string v0, "/dataQuery/path/getMotionPathByVersion"

    return-object v0

    .line 580
    :cond_22
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathReq;

    if-eqz v0, :cond_23

    .line 582
    const-string v0, "/dataSync/path/deleteMotionPathData"

    return-object v0

    .line 584
    :cond_23
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/DelAllMotionPathReq;

    if-eqz v0, :cond_24

    .line 586
    const-string v0, "/dataSync/path/deleteAllMotionPathData"

    return-object v0

    .line 590
    :cond_24
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/userprofile/SetAuthorizeReq;

    if-eqz v0, :cond_25

    .line 592
    const-string v0, "/profile/third/authorize"

    return-object v0

    .line 594
    :cond_25
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/userprofile/GetAuthorizeReq;

    if-eqz v0, :cond_26

    .line 596
    const-string v0, "/profile/third/getAuthorizeToken"

    return-object v0

    .line 598
    :cond_26
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/userprofile/DelAuthorizeReq;

    if-eqz v0, :cond_27

    .line 600
    const-string v0, "/profile/third/cancelAuthorize"

    return-object v0

    .line 602
    :cond_27
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/GetThirdSignReq;

    if-eqz v0, :cond_28

    .line 603
    const-string v0, "/dataOpen/third/getThirdSign"

    return-object v0

    .line 606
    :cond_28
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/AddEvaluationResultReq;

    if-eqz v0, :cond_29

    .line 607
    const-string v0, "/profile/evaluation/addEvaluationResult"

    return-object v0

    .line 610
    :cond_29
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/GetEvaluationResultReq;

    if-eqz v0, :cond_2a

    .line 611
    const-string v0, "/profile/evaluation/getEvaluationResult"

    return-object v0

    .line 614
    :cond_2a
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/DelEvaluationResultReq;

    if-eqz v0, :cond_2b

    .line 615
    const-string v0, "/profile/evaluation/deleteEvaluationResult"

    return-object v0

    .line 619
    :cond_2b
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;

    if-eqz v0, :cond_2c

    .line 620
    const-string v0, "/deviceAgent/deviceControl"

    return-object v0

    .line 622
    :cond_2c
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceUnbindReq;

    if-eqz v0, :cond_2d

    .line 623
    const-string v0, "/deviceAgent/unbindDevice"

    return-object v0

    .line 625
    :cond_2d
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;

    if-eqz v0, :cond_2e

    .line 626
    const-string v0, "/deviceAgent/getDeviceInfo"

    return-object v0

    .line 628
    :cond_2e
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;

    if-eqz v0, :cond_2f

    .line 629
    const-string v0, "/deviceAgent/getServiceInfo"

    return-object v0

    .line 631
    :cond_2f
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusReq;

    if-eqz v0, :cond_30

    .line 632
    const-string v0, "/deviceAgent/getDeviceStatus"

    return-object v0

    .line 635
    :cond_30
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;

    if-eqz v0, :cond_31

    .line 637
    const-string v0, "/deviceAgent/startDeviceLinkage"

    return-object v0

    .line 639
    :cond_31
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataReq;

    if-eqz v0, :cond_32

    .line 640
    const-string v0, "/deviceAgent/transDeviceData"

    return-object v0

    .line 642
    :cond_32
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageReq;

    if-eqz v0, :cond_33

    .line 643
    const-string v0, "/deviceAgent/stopDeviceLinkage"

    return-object v0

    .line 645
    :cond_33
    instance-of v0, p1, Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageReq;

    if-eqz v0, :cond_34

    .line 646
    const-string v0, "/deviceAgent/releaseDeviceLinkage"

    return-object v0

    .line 649
    :cond_34
    const/4 v0, 0x0

    return-object v0
.end method

.method private a(DD)Lo/czm;
    .locals 18

    .line 4421
    new-instance v5, Lo/czm;

    invoke-direct {v5}, Lo/czm;-><init>()V

    .line 4422
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-----getAtmosphereInfo------ Enter latitude = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, p1

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "longitude = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, p3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4424
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v0, "https://api.accuweather.com"

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4425
    invoke-direct/range {p0 .. p0}, Lo/czn;->b()Ljava/lang/String;

    move-result-object v7

    .line 4426
    const-string v0, "/locations/v1/cities/geoposition/search.json?q="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-wide/from16 v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-wide/from16 v1, p3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "language="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "apikey=7f8c4da3ce9849ffb2134f075201c45a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 4427
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cityKeyUrl :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4428
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lo/czn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 4429
    invoke-static {v9}, Lo/czt;->k(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4430
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "%s \u94fe\u63a5\u4e0d\u652f\u6301 %s \u8bed\u8a00\uff0c\u5207\u6362\u4e3a\u82f1\u8beden\u8bf7\u6c42\u6570\u636e"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v8, v3, v4

    const/4 v4, 0x1

    aput-object v7, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4431
    const-string v7, "en"

    .line 4432
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v0, "https://api.accuweather.com"

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4433
    const-string v0, "/locations/v1/cities/geoposition/search.json?q="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-wide/from16 v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-wide/from16 v1, p3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "language="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "apikey=7f8c4da3ce9849ffb2134f075201c45a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 4434
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cityKeyUrl :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4435
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lo/czn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 4437
    :cond_0
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "jsonString\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4438
    const-string v0, "Key"

    invoke-static {v9, v0}, Lo/czt;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result v10

    .line 4439
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KeyID\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4441
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v0, "https://api.accuweather.com"

    invoke-direct {v11, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4442
    const-string v0, "/currentconditions/v1/"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".json?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "apikey=7f8c4da3ce9849ffb2134f075201c45a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&language="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&details=true"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 4443
    move-object/from16 v0, p0

    invoke-direct {v0, v12}, Lo/czn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 4445
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AtmosphereJsonString\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4446
    invoke-static {v13}, Lo/czt;->a(Ljava/lang/String;)D

    move-result-wide v14

    .line 4447
    invoke-static {v13}, Lo/czt;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 4448
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-direct {v0, v1}, Lo/czn;->a(Ljava/lang/String;)I

    move-result v17

    .line 4449
    invoke-virtual {v5, v14, v15}, Lo/czm;->b(D)V

    .line 4450
    move/from16 v0, v17

    invoke-virtual {v5, v0}, Lo/czm;->d(I)V

    .line 4452
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "atmosphere info is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/czm;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4453
    return-object v5
.end method

.method static synthetic a(Lo/czn;DD)Lo/czm;
    .locals 1

    .line 185
    invoke-direct {p0, p1, p2, p3, p4}, Lo/czn;->a(DD)Lo/czm;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/Object;Ljava/util/HashMap;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 5284
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    .line 5285
    move-object v2, v1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    .line 5287
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v6

    .line 5289
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->isAccessible()Z

    move-result v8

    .line 5290
    if-nez v8, :cond_0

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 5291
    :cond_0
    invoke-virtual {v5, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 5292
    if-nez v8, :cond_1

    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 5294
    :cond_1
    if-eqz v7, :cond_2

    .line 5296
    invoke-virtual {p2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5285
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 5299
    :cond_3
    return-void
.end method

.method private b()Ljava/lang/String;
    .locals 6

    .line 5855
    const-string v1, "en"

    .line 5856
    const/4 v2, 0x0

    .line 5857
    const/4 v3, 0x0

    .line 5858
    const/4 v4, 0x0

    .line 5859
    const/4 v5, 0x0

    .line 5860
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    .line 5861
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 5862
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 5863
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 5864
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    .line 5865
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 5866
    iget-object v5, v4, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 5867
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 5868
    invoke-virtual {v5}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 5873
    :cond_0
    return-object v1
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 4564
    const/4 v4, 0x0

    .line 4565
    const/4 v5, 0x0

    .line 4566
    const-string v6, ""

    .line 4569
    :try_start_0
    new-instance v5, Ljava/net/URL;

    invoke-direct {v5, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 4570
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4572
    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljavax/net/ssl/HttpsURLConnection;

    .line 4574
    invoke-static {}, Ljavax/net/ssl/HttpsURLConnection;->getDefaultSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 4575
    sget-object v0, Lo/czn;->e:Ljavax/net/ssl/HostnameVerifier;

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 4576
    const-string v0, "Charset"

    const-string v1, "UTF-8"

    invoke-virtual {v4, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 4577
    const/16 v0, 0x2710

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    .line 4578
    const/16 v0, 0x2710

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setReadTimeout(I)V

    .line 4579
    const-string v0, "GET"

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 4580
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->connect()V

    .line 4581
    new-instance v7, Lcom/huawei/hwcloudmodel/model/RequestResult;

    invoke-direct {v7, v4}, Lcom/huawei/hwcloudmodel/model/RequestResult;-><init>(Ljava/net/HttpURLConnection;)V

    .line 4582
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "result.Code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/RequestResult;->asString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4583
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/RequestResult;->getStatusCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_0

    .line 4585
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "-----getWeatherInfo---- result"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4586
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/RequestResult;->asString()Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    .line 4587
    :cond_0
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/RequestResult;->getStatusCode()I

    move-result v0

    const/16 v1, 0x190

    if-ne v0, v1, :cond_1

    .line 4588
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NOT_SUPPORTED_LANGUAGE "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4589
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/RequestResult;->asString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    move-object v6, v0

    .line 4603
    :cond_1
    :goto_0
    goto :goto_1

    .line 4592
    :catch_0
    move-exception v7

    .line 4594
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MalformedURLException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4603
    goto :goto_1

    .line 4596
    :catch_1
    move-exception v7

    .line 4598
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4603
    goto :goto_1

    .line 4600
    :catch_2
    move-exception v7

    .line 4602
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4604
    :goto_1
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JSON weather is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4605
    return-object v6
.end method

.method private c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/String;)Z"
        }
    .end annotation

    .line 5268
    if-nez p1, :cond_0

    .line 5270
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " unknown url"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5271
    const/4 v0, 0x0

    return v0

    .line 5274
    :cond_0
    if-nez p2, :cond_1

    .line 5276
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " invalidate param"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5277
    const/4 v0, 0x0

    return v0

    .line 5280
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static e(Landroid/content/Context;)Lo/czn;
    .locals 2

    .line 284
    sget-object v0, Lo/czn;->b:Lo/czn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 286
    new-instance v0, Lo/czn;

    invoke-direct {v0}, Lo/czn;-><init>()V

    sput-object v0, Lo/czn;->b:Lo/czn;

    .line 288
    :cond_0
    sget-object v0, Lo/czn;->b:Lo/czn;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathReq;)Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathRsp;
    .locals 14

    .line 3889
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 3890
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EnteraddMotionPathSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3893
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 3895
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 3896
    const-string v0, "addMotionPathSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3897
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addMotionPathSync url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3898
    const/4 v0, 0x0

    return-object v0

    .line 3902
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathRsp;-><init>()V

    .line 3905
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 3908
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathRsp;

    move-object v10, v0

    .line 3909
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 3910
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addMotionPathSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 3911
    return-object v10

    .line 3913
    :catch_0
    move-exception v12

    .line 3915
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addMotionPathSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3916
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3917
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 3925
    goto :goto_0

    .line 3920
    :catch_1
    move-exception v11

    .line 3922
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addMotionPathSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3923
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3924
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathRsp;->setResultDesc(Ljava/lang/String;)V

    .line 3927
    :goto_0
    return-object v10
.end method

.method public a(Lcom/huawei/hwcloudmodel/model/unite/AddSportDataReq;)Lcom/huawei/hwcloudmodel/model/unite/AddSportDataRsp;
    .locals 14

    .line 3214
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 3215
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EnteraddSportDataSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3218
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 3220
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 3221
    const-string v0, "addSportDataSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3222
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSportDataSync url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3223
    const/4 v0, 0x0

    return-object v0

    .line 3227
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/unite/AddSportDataRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/unite/AddSportDataRsp;-><init>()V

    .line 3230
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 3233
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/unite/AddSportDataRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/AddSportDataRsp;

    move-object v10, v0

    .line 3234
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 3235
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addSportDataSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 3236
    return-object v10

    .line 3238
    :catch_0
    move-exception v12

    .line 3240
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addSportDataSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3241
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddSportDataRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3242
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddSportDataRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 3250
    goto :goto_0

    .line 3245
    :catch_1
    move-exception v11

    .line 3247
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addSportDataSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3248
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddSportDataRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3249
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddSportDataRsp;->setResultDesc(Ljava/lang/String;)V

    .line 3252
    :goto_0
    return-object v10
.end method

.method public a(Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceRsp;
    .locals 14

    .line 2988
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 2989
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EnterupdateBindDeviceSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2992
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 2994
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 2995
    const-string v0, "updateBindDeviceSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2996
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBindDeviceSync url or params invalidete"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2997
    const/4 v0, 0x0

    return-object v0

    .line 3001
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceRsp;-><init>()V

    .line 3004
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 3007
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceRsp;

    move-object v10, v0

    .line 3008
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 3009
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBindDeviceSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 3010
    return-object v10

    .line 3012
    :catch_0
    move-exception v12

    .line 3014
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBindDeviceSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3015
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3016
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 3024
    goto :goto_0

    .line 3019
    :catch_1
    move-exception v11

    .line 3021
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBindDeviceSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3022
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3023
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceRsp;->setResultDesc(Ljava/lang/String;)V

    .line 3026
    :goto_0
    return-object v10
.end method

.method public a(Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataRsq;>;)V"
        }
    .end annotation

    .line 5703
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter transDeviceData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5705
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 5707
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5710
    goto :goto_0

    .line 5708
    :catch_0
    move-exception v5

    .line 5709
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "transDeviceData  EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5713
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 5714
    if-nez v5, :cond_0

    .line 5716
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transDeviceData   unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5717
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 5718
    return-void

    .line 5720
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$30;

    invoke-direct {v1, p0, p2}, Lo/czn$30;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->e(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 5749
    return-void
.end method

.method public a(Lcom/huawei/hwcloudmodel/model/unite/AddEvaluationResultReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/AddEvaluationResultReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;>;)V"
        }
    .end annotation

    .line 5077
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter addEvaluationResult  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5080
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 5082
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5085
    goto :goto_0

    .line 5083
    :catch_0
    move-exception v5

    .line 5084
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addEvaluationResult  EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5088
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 5089
    if-nez v5, :cond_0

    .line 5091
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addEvaluationResult   unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5092
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 5093
    return-void

    .line 5097
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$18;

    invoke-direct {v1, p0, p2}, Lo/czn$18;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 5137
    return-void
.end method

.method public a(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoRsp;>;)V"
        }
    .end annotation

    .line 5521
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getWifiDeviceServiceInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5523
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 5525
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5528
    goto :goto_0

    .line 5526
    :catch_0
    move-exception v5

    .line 5527
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWifiDeviceServiceInfo  EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5531
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 5532
    if-nez v5, :cond_0

    .line 5534
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWifiDeviceServiceInfo   unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5535
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 5536
    return-void

    .line 5538
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$29;

    invoke-direct {v1, p0, p2}, Lo/czn$29;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->e(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 5567
    return-void
.end method

.method public a(Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordRsp;>;)V"
        }
    .end annotation

    .line 1311
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter addPrivacyRecord "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1314
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1316
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1319
    goto :goto_0

    .line 1317
    :catch_0
    move-exception v5

    .line 1318
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addPrivacyRecord EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1322
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1323
    if-nez v5, :cond_0

    .line 1325
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addPrivacyRecord  unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1326
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 1327
    return-void

    .line 1331
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$4;

    invoke-direct {v1, p0, p2}, Lo/czn$4;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 1371
    return-void
.end method

.method public a(Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataRsp;>;)V"
        }
    .end annotation

    .line 1441
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter mergeUserAllData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1444
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1446
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1449
    goto :goto_0

    .line 1447
    :catch_0
    move-exception v5

    .line 1448
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mergeUserAllData EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1452
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1453
    if-nez v5, :cond_0

    .line 1455
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mergeUserAllData  unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1456
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 1457
    return-void

    .line 1461
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$5;

    invoke-direct {v1, p0, p2}, Lo/czn$5;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 1501
    return-void
.end method

.method public a(Lo/cyx;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cyx<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 4329
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter cancelAuthorize"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4330
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 4331
    const-string v0, "thirdAccountType"

    iget-object v1, p0, Lo/czn;->f:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4332
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    const-string v1, "/profile/third/cancelAuthorize"

    new-instance v2, Lo/czn$10;

    invoke-direct {v2, p0, p1}, Lo/czn$10;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v1, v4, v2}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 4360
    return-void
.end method

.method public b(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;
    .locals 14

    .line 3754
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 3755
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EntergetHealthDataByVersionSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3758
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 3760
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 3761
    const-string v0, "getHealthDataByVersionSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3762
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthDataByVersionSync url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3763
    const/4 v0, 0x0

    return-object v0

    .line 3767
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;-><init>()V

    .line 3770
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 3773
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;

    move-object v10, v0

    .line 3774
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 3775
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHealthDataByVersionSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 3776
    return-object v10

    .line 3778
    :catch_0
    move-exception v12

    .line 3780
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHealthDataByVersionSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3781
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3782
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 3790
    goto :goto_0

    .line 3785
    :catch_1
    move-exception v11

    .line 3787
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHealthDataByVersionSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3788
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3789
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->setResultDesc(Ljava/lang/String;)V

    .line 3792
    :goto_0
    return-object v10
.end method

.method public b(Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;
    .locals 14

    .line 4752
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 4753
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EntergetHealthStatSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4756
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 4758
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 4760
    const-string v0, "getHealthStatSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4761
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthStatSync url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4762
    const/4 v0, 0x0

    return-object v0

    .line 4766
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;-><init>()V

    .line 4769
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 4772
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;

    move-object v10, v0

    .line 4773
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 4774
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHealthStatSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 4775
    return-object v10

    .line 4777
    :catch_0
    move-exception v12

    .line 4779
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHealthStatSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4780
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 4781
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 4789
    goto :goto_0

    .line 4784
    :catch_1
    move-exception v11

    .line 4786
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHealthStatSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4787
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 4788
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->setResultDesc(Ljava/lang/String;)V

    .line 4791
    :goto_0
    return-object v10
.end method

.method public b(Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsRsp;
    .locals 14

    .line 3169
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 3170
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EntergetSyncVersionsSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3173
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 3175
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 3176
    const-string v0, "getSyncVersionsSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3177
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSyncVersionsSync url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3178
    const/4 v0, 0x0

    return-object v0

    .line 3182
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsRsp;-><init>()V

    .line 3185
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 3188
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsRsp;

    move-object v10, v0

    .line 3189
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 3190
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSyncVersionsSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 3191
    return-object v10

    .line 3193
    :catch_0
    move-exception v12

    .line 3195
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSyncVersionsSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3196
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3197
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 3205
    goto :goto_0

    .line 3200
    :catch_1
    move-exception v11

    .line 3202
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSyncVersionsSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3203
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3204
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsRsp;->setResultDesc(Ljava/lang/String;)V

    .line 3207
    :goto_0
    return-object v10
.end method

.method public b(Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;
    .locals 14

    .line 2898
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 2899
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EntergetBindDeviceSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2902
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 2904
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 2905
    const-string v0, "getBindDeviceSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2906
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBindDeviceSync url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2907
    const/4 v0, 0x0

    return-object v0

    .line 2911
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;-><init>()V

    .line 2914
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 2917
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;

    move-object v10, v0

    .line 2918
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 2919
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBindDeviceSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 2920
    return-object v10

    .line 2922
    :catch_0
    move-exception v12

    .line 2924
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBindDeviceSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2925
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 2926
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 2934
    goto :goto_0

    .line 2929
    :catch_1
    move-exception v11

    .line 2931
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBindDeviceSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2932
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 2933
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;->setResultDesc(Ljava/lang/String;)V

    .line 2936
    :goto_0
    return-object v10
.end method

.method public b(Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;)Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;
    .locals 14

    .line 3033
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 3034
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EntersetUserProfileSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3037
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 3039
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 3040
    const-string v0, "setUserProfileSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3041
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserProfileSync url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3042
    const/4 v0, 0x0

    return-object v0

    .line 3046
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;-><init>()V

    .line 3049
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 3052
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;

    move-object v10, v0

    .line 3053
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 3054
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setUserProfileSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 3055
    return-object v10

    .line 3057
    :catch_0
    move-exception v12

    .line 3059
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setUserProfileSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3060
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3061
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 3069
    goto :goto_0

    .line 3064
    :catch_1
    move-exception v11

    .line 3066
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setUserProfileSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3067
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3068
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;->setResultDesc(Ljava/lang/String;)V

    .line 3071
    :goto_0
    return-object v10
.end method

.method public b(DD)Lo/czo;
    .locals 25

    .line 4462
    new-instance v5, Lo/czo;

    invoke-direct {v5}, Lo/czo;-><init>()V

    .line 4464
    const/16 v0, -0x63

    invoke-virtual {v5, v0}, Lo/czo;->d(I)V

    .line 4465
    const/16 v0, -0x63

    invoke-virtual {v5, v0}, Lo/czo;->e(I)V

    .line 4466
    const/16 v0, -0x63

    invoke-virtual {v5, v0}, Lo/czo;->i(I)V

    .line 4467
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-----getWeatherInfo------ Enter latitude = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, p1

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "longitude = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, p3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4469
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v0, "https://api.accuweather.com"

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4470
    invoke-direct/range {p0 .. p0}, Lo/czn;->b()Ljava/lang/String;

    move-result-object v7

    .line 4471
    const-string v0, "/locations/v1/cities/geoposition/search.json?q="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-wide/from16 v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-wide/from16 v1, p3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "language="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "apikey=7f8c4da3ce9849ffb2134f075201c45a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 4472
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cityKeyUrl :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4473
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lo/czn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 4474
    invoke-static {v9}, Lo/czt;->k(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4475
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "%s \u94fe\u63a5\u4e0d\u652f\u6301 %s \u8bed\u8a00\uff0c\u5207\u6362\u4e3a\u82f1\u8beden\u8bf7\u6c42\u6570\u636e"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v8, v3, v4

    const/4 v4, 0x1

    aput-object v7, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4476
    const-string v7, "en"

    .line 4477
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v0, "https://api.accuweather.com"

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4478
    const-string v0, "/locations/v1/cities/geoposition/search.json?q="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-wide/from16 v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-wide/from16 v1, p3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "language="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "apikey=7f8c4da3ce9849ffb2134f075201c45a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 4479
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cityKeyUrl :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4480
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lo/czn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 4482
    :cond_0
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "jsonString\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4483
    const-string v0, "Key"

    invoke-static {v9, v0}, Lo/czt;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result v10

    .line 4484
    invoke-static {v9}, Lo/czt;->e(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    .line 4485
    const/4 v0, 0x0

    aget-object v0, v11, v0

    invoke-virtual {v5, v0}, Lo/czo;->b(Ljava/lang/String;)V

    .line 4486
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cityKeyID :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4487
    const/4 v0, -0x1

    if-ne v10, v0, :cond_1

    .line 4488
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get cityKeyID error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4489
    return-object v5

    .line 4492
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "https://api.accuweather.com"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v12, v0

    .line 4493
    const-string v0, "/currentconditions/v1/"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".json?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "apikey=7f8c4da3ce9849ffb2134f075201c45a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&language="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 4494
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "temUrl :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4495
    move-object/from16 v0, p0

    invoke-direct {v0, v13}, Lo/czn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 4496
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4497
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weatherjson is empty!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4498
    return-object v5

    .line 4500
    :cond_2
    invoke-static {v14}, Lo/czt;->d(Ljava/lang/String;)I

    move-result v15

    .line 4501
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WeatherIcon :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4502
    const/16 v0, -0x63

    if-ne v15, v0, :cond_3

    .line 4503
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeatherIcon parse error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4504
    return-object v5

    .line 4506
    :cond_3
    invoke-static {v14}, Lo/czt;->c(Ljava/lang/String;)I

    move-result v16

    .line 4507
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "temp :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v16

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4509
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "https://api.accuweather.com"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v17, v0

    .line 4510
    const-string v0, "/forecasts/v1/daily/1day/"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".json?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "apikey=7f8c4da3ce9849ffb2134f075201c45a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&language="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 4511
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lowHighURL :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v18

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4512
    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-direct {v0, v1}, Lo/czn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Maximum"

    invoke-static {v0, v1}, Lo/czt;->c(Ljava/lang/String;Ljava/lang/String;)I

    move-result v19

    .line 4513
    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-direct {v0, v1}, Lo/czn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Minimum"

    invoke-static {v0, v1}, Lo/czt;->c(Ljava/lang/String;Ljava/lang/String;)I

    move-result v20

    .line 4514
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "High :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v19

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "Low:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4516
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "https://api.accuweather.com"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v21, v0

    .line 4517
    const-string v0, "/airquality/v1/global/observations/"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".json?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "apikey=7f8c4da3ce9849ffb2134f075201c45a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&language="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    .line 4518
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pm25URL :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v22

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4519
    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v1}, Lo/czn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ParticulateMatter2_5"

    invoke-static {v0, v1}, Lo/czt;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result v23

    .line 4520
    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v1}, Lo/czn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Index"

    invoke-static {v0, v1}, Lo/czt;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result v24

    .line 4521
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pm25 :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v23

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",aqi:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v24

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4522
    move/from16 v0, v23

    invoke-virtual {v5, v0}, Lo/czo;->b(I)V

    .line 4523
    move/from16 v0, v24

    invoke-virtual {v5, v0}, Lo/czo;->a(I)V

    .line 4524
    move/from16 v0, v16

    invoke-virtual {v5, v0}, Lo/czo;->d(I)V

    .line 4525
    move/from16 v0, v19

    invoke-virtual {v5, v0}, Lo/czo;->i(I)V

    .line 4526
    move/from16 v0, v20

    invoke-virtual {v5, v0}, Lo/czo;->e(I)V

    .line 4527
    invoke-static {}, Lo/czl;->c()Ljava/util/Map;

    move-result-object v0

    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 4528
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WeatherIcon(to device) :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/czl;->c()Ljava/util/Map;

    move-result-object v3

    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4529
    invoke-static {}, Lo/czl;->c()Ljava/util/Map;

    move-result-object v0

    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v5, v0}, Lo/czo;->g(I)V

    goto :goto_0

    .line 4531
    :cond_4
    const/16 v0, 0x63

    invoke-virtual {v5, v0}, Lo/czo;->g(I)V

    .line 4533
    :goto_0
    move/from16 v0, v23

    const/16 v1, 0xc8

    if-le v0, v1, :cond_5

    .line 4534
    const/16 v0, 0x35

    invoke-virtual {v5, v0}, Lo/czo;->g(I)V

    .line 4536
    :cond_5
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "weatherInfo :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/czo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4537
    return-object v5
.end method

.method public b(DDLo/cyx;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDLo/cyx<Lo/czo;>;)V"
        }
    .end annotation

    .line 4387
    iget-object v0, p0, Lo/czn;->g:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/czn$11;

    move-object v2, p0

    move-wide v3, p1

    move-wide v5, p3

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lo/czn$11;-><init>(Lo/czn;DDLo/cyx;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 4399
    return-void
.end method

.method public b(Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageRsq;>;)V"
        }
    .end annotation

    .line 5655
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter stopDeviceLinkage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5657
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 5659
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5662
    goto :goto_0

    .line 5660
    :catch_0
    move-exception v5

    .line 5661
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stopDeviceLinkage  EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5665
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 5666
    if-nez v5, :cond_0

    .line 5668
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopDeviceLinkage   unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5669
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 5670
    return-void

    .line 5672
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$27;

    invoke-direct {v1, p0, p2}, Lo/czn$27;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->e(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 5701
    return-void
.end method

.method public b(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;>;)V"
        }
    .end annotation

    .line 5801
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getWifiDeviceStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5803
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 5805
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5808
    goto :goto_0

    .line 5806
    :catch_0
    move-exception v5

    .line 5807
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWifiDeviceStatus  EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5811
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 5812
    if-nez v5, :cond_0

    .line 5814
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWifiDeviceStatus   unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5815
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 5816
    return-void

    .line 5818
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$34;

    invoke-direct {v1, p0, p2}, Lo/czn$34;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->e(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 5847
    return-void
.end method

.method public b(Lo/cyx;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cyx<Lcom/huawei/up/model/UserInfomation;>;)V"
        }
    .end annotation

    .line 689
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getUserInfoFromUP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 692
    new-instance v4, Lcom/huawei/up/api/UpApi;

    sget-object v0, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v4, v0}, Lcom/huawei/up/api/UpApi;-><init>(Landroid/content/Context;)V

    .line 693
    sget-object v0, Lo/czn;->c:Landroid/content/Context;

    new-instance v1, Lo/czn$2;

    invoke-direct {v1, p0, p1}, Lo/czn$2;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v4, v0, v1}, Lcom/huawei/up/api/UpApi;->getUserInfo(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 756
    return-void
.end method

.method public c(Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;
    .locals 14

    .line 2853
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 2854
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EnterbindDeviceSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2857
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 2859
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 2860
    const-string v0, "bindDeviceSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2861
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindDeviceSync url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2862
    const/4 v0, 0x0

    return-object v0

    .line 2866
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;-><init>()V

    .line 2869
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 2872
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;

    move-object v10, v0

    .line 2873
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 2874
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bindDeviceSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 2875
    return-object v10

    .line 2877
    :catch_0
    move-exception v12

    .line 2879
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bindDeviceSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2880
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 2881
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 2889
    goto :goto_0

    .line 2884
    :catch_1
    move-exception v11

    .line 2886
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bindDeviceSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2887
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 2888
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;->setResultDesc(Ljava/lang/String;)V

    .line 2891
    :goto_0
    return-object v10
.end method

.method public c(Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileReq;)Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;
    .locals 14

    .line 3078
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 3079
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EntergetUserProfileSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3082
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 3084
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 3085
    const-string v0, "getUserProfileSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3086
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserProfileSync url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3087
    const/4 v0, 0x0

    return-object v0

    .line 3091
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;-><init>()V

    .line 3094
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 3097
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;

    move-object v10, v0

    .line 3098
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 3099
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserProfileSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 3100
    return-object v10

    .line 3102
    :catch_0
    move-exception v12

    .line 3104
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserProfileSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3105
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3106
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 3114
    goto :goto_0

    .line 3109
    :catch_1
    move-exception v11

    .line 3111
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserProfileSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3112
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3113
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->setResultDesc(Ljava/lang/String;)V

    .line 3116
    :goto_0
    return-object v10
.end method

.method public c()V
    .locals 14

    .line 5302
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 5303
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EnternotifyUserEcopySync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5306
    const-string v8, "/profile/user/notifyUserEcopy"

    .line 5307
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 5309
    new-instance v10, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;-><init>()V

    .line 5312
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 5315
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;

    move-object v10, v0

    .line 5316
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 5317
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notifyUserEcopySync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 5324
    goto :goto_0

    .line 5319
    :catch_0
    move-exception v12

    .line 5321
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notifyUserEcopySync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5322
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 5323
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 5331
    :goto_0
    goto :goto_1

    .line 5326
    :catch_1
    move-exception v11

    .line 5328
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notifyUserEcopySync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5329
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 5330
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;->setResultDesc(Ljava/lang/String;)V

    .line 5332
    :goto_1
    return-void
.end method

.method public c(Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageRsq;>;)V"
        }
    .end annotation

    .line 5752
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter releaseDeviceLinkage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5754
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 5756
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5759
    goto :goto_0

    .line 5757
    :catch_0
    move-exception v5

    .line 5758
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "releaseDeviceLinkage  EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5762
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 5763
    if-nez v5, :cond_0

    .line 5765
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "releaseDeviceLinkage   unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5766
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 5767
    return-void

    .line 5769
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$35;

    invoke-direct {v1, p0, p2}, Lo/czn$35;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->e(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 5798
    return-void
.end method

.method public c(Lcom/huawei/hwcloudmodel/model/unite/DelEvaluationResultReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/DelEvaluationResultReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;>;)V"
        }
    .end annotation

    .line 5205
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter delEvaluationResult  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5208
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 5210
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5213
    goto :goto_0

    .line 5211
    :catch_0
    move-exception v5

    .line 5212
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delEvaluationResult  EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5216
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 5217
    if-nez v5, :cond_0

    .line 5219
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delEvaluationResult   unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5220
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 5221
    return-void

    .line 5225
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$16;

    invoke-direct {v1, p0, p2}, Lo/czn$16;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 5265
    return-void
.end method

.method public c(Lcom/huawei/hwcloudmodel/model/unite/GetEvaluationResultReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/GetEvaluationResultReq;Lo/cyx<Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;>;)V"
        }
    .end annotation

    .line 5141
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getEvaluationResult  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5144
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 5146
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5149
    goto :goto_0

    .line 5147
    :catch_0
    move-exception v5

    .line 5148
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getEvaluationResult  EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5152
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 5153
    if-nez v5, :cond_0

    .line 5155
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getEvaluationResult   unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5156
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 5157
    return-void

    .line 5161
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$20;

    invoke-direct {v1, p0, p2}, Lo/czn$20;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 5201
    return-void
.end method

.method public c(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;>;)V"
        }
    .end annotation

    .line 5336
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter syncWifiDeviceControl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5338
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 5340
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5343
    goto :goto_0

    .line 5341
    :catch_0
    move-exception v5

    .line 5342
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncWifiDeviceControl  EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5346
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 5347
    if-nez v5, :cond_0

    .line 5349
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncWifiDeviceControl   unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5350
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 5351
    return-void

    .line 5353
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$25;

    invoke-direct {v1, p0, p2}, Lo/czn$25;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->e(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 5382
    return-void
.end method

.method public c(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;>;)V"
        }
    .end annotation

    .line 5434
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getWifiDeviceInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5436
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 5438
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5441
    goto :goto_0

    .line 5439
    :catch_0
    move-exception v5

    .line 5440
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWifiDeviceInfo  EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5444
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 5445
    if-nez v5, :cond_0

    .line 5447
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWifiDeviceInfo   unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5448
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 5449
    return-void

    .line 5451
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$23;

    invoke-direct {v1, p0, p2}, Lo/czn$23;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->e(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 5480
    return-void
.end method

.method public c(Lcom/huawei/hwcloudmodel/model/userprofile/DeleteAllUserProfileReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/userprofile/DeleteAllUserProfileReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/userprofile/DeleteAllUserProfileRsp;>;)V"
        }
    .end annotation

    .line 854
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter deleteAllUserProfile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 857
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 859
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 862
    goto :goto_0

    .line 860
    :catch_0
    move-exception v5

    .line 861
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteAllUserProfileEXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 865
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 866
    if-nez v5, :cond_0

    .line 868
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteAllUserProfile unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 869
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 870
    return-void

    .line 874
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$12;

    invoke-direct {v1, p0, p2}, Lo/czn$12;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 914
    return-void
.end method

.method public c(Lcom/huawei/hwcloudmodel/model/userprofile/LastClearCloudDataTimeReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/userprofile/LastClearCloudDataTimeReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/userprofile/LastClearCloudDataTimeRsp;>;)V"
        }
    .end annotation

    .line 918
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getLastClearCloudDataTime"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 921
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 923
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 926
    goto :goto_0

    .line 924
    :catch_0
    move-exception v5

    .line 925
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getLastClearCloudDataTimeEXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 929
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 930
    if-nez v5, :cond_0

    .line 932
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastClearCloudDataTime unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 933
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 934
    return-void

    .line 938
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$24;

    invoke-direct {v1, p0, p2}, Lo/czn$24;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 978
    return-void
.end method

.method public c(Lo/cyx;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cyx<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 4252
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getAuthorizeToken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4253
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 4254
    const-string v0, "thirdAccountType"

    iget-object v1, p0, Lo/czn;->f:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4255
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    const-string v1, "/profile/third/getAuthorizeToken"

    new-instance v2, Lo/czn$9;

    invoke-direct {v2, p0, p1}, Lo/czn$9;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v1, v4, v2}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 4283
    return-void
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;)Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatRsp;
    .locals 14

    .line 4801
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 4802
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EnteraddHealthStatSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4805
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 4807
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 4808
    const-string v0, "addHealthStatSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4809
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addHealthStatSync url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4810
    const/4 v0, 0x0

    return-object v0

    .line 4814
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatRsp;-><init>()V

    .line 4817
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 4820
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatRsp;

    move-object v10, v0

    .line 4821
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 4822
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addHealthStatSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 4823
    return-object v10

    .line 4825
    :catch_0
    move-exception v12

    .line 4827
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addHealthStatSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4828
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 4829
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 4837
    goto :goto_0

    .line 4832
    :catch_1
    move-exception v11

    .line 4834
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addHealthStatSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4835
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 4836
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatRsp;->setResultDesc(Ljava/lang/String;)V

    .line 4839
    :goto_0
    return-object v10
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;)Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalRsp;
    .locals 14

    .line 3439
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 3440
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EnteraddSportTotalSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3443
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 3445
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 3446
    const-string v0, "addSportTotalSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3447
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSportTotalSync url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3448
    const/4 v0, 0x0

    return-object v0

    .line 3452
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalRsp;-><init>()V

    .line 3455
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 3458
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalRsp;

    move-object v10, v0

    .line 3459
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 3460
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addSportTotalSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 3461
    return-object v10

    .line 3463
    :catch_0
    move-exception v12

    .line 3465
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addSportTotalSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3466
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3467
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 3475
    goto :goto_0

    .line 3470
    :catch_1
    move-exception v11

    .line 3472
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addSportTotalSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3473
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3474
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalRsp;->setResultDesc(Ljava/lang/String;)V

    .line 3477
    :goto_0
    return-object v10
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataReq;)Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataRsp;
    .locals 14

    .line 3799
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 3800
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EnterdelHealthDataSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3803
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 3805
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 3806
    const-string v0, "delHealthDataSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3807
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delHealthDataSync url or parms invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3808
    const/4 v0, 0x0

    return-object v0

    .line 3812
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataRsp;-><init>()V

    .line 3815
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 3818
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataRsp;

    move-object v10, v0

    .line 3819
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 3820
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delHealthDataSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 3821
    return-object v10

    .line 3823
    :catch_0
    move-exception v12

    .line 3825
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delHealthDataSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3826
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3827
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 3835
    goto :goto_0

    .line 3830
    :catch_1
    move-exception v11

    .line 3832
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delHealthDataSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3833
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3834
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataRsp;->setResultDesc(Ljava/lang/String;)V

    .line 3837
    :goto_0
    return-object v10
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathReq;)Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathRsp;
    .locals 14

    .line 4024
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 4025
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EnterdelMotionPathSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4028
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 4030
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 4031
    const-string v0, "delMotionPathSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4032
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delMotionPathSync url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4033
    const/4 v0, 0x0

    return-object v0

    .line 4037
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathRsp;-><init>()V

    .line 4040
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 4043
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathRsp;

    move-object v10, v0

    .line 4044
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 4045
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delMotionPathSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 4046
    return-object v10

    .line 4048
    :catch_0
    move-exception v12

    .line 4050
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delMotionPathSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4051
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 4052
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 4060
    goto :goto_0

    .line 4055
    :catch_1
    move-exception v11

    .line 4057
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delMotionPathSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4058
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 4059
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathRsp;->setResultDesc(Ljava/lang/String;)V

    .line 4062
    :goto_0
    return-object v10
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;
    .locals 14

    .line 3304
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 3305
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EntergetSportDataByVersionSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3308
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 3310
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 3311
    const-string v0, "getSportDataByVersionSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3312
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportDataByVersionSync url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3313
    const/4 v0, 0x0

    return-object v0

    .line 3317
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;-><init>()V

    .line 3320
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 3323
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;

    move-object v10, v0

    .line 3324
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 3325
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSportDataByVersionSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 3326
    return-object v10

    .line 3328
    :catch_0
    move-exception v12

    .line 3330
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSportDataByVersionSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3331
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3332
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 3340
    goto :goto_0

    .line 3335
    :catch_1
    move-exception v11

    .line 3337
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSportDataByVersionSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3338
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3339
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;->setResultDesc(Ljava/lang/String;)V

    .line 3342
    :goto_0
    return-object v10
.end method

.method public d(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 765
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter setUserInfoToUP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 767
    new-instance v4, Lcom/huawei/up/api/UpApi;

    sget-object v0, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v4, v0}, Lcom/huawei/up/api/UpApi;-><init>(Landroid/content/Context;)V

    .line 768
    new-instance v0, Lo/czn$8;

    invoke-direct {v0, p0, p3}, Lo/czn$8;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v4, p1, p2, v0}, Lcom/huawei/up/api/UpApi;->updateUserInfo(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/callback/CommonCallback;)V

    .line 783
    return-void
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/ThirdUserToken;Lo/cyx;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/ThirdUserToken;Lo/cyx<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 4290
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter authorize"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4291
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 4292
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 4293
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "authorize thirdUserToken :***"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4295
    :cond_0
    const-string v0, "thirdUserToken"

    invoke-virtual {v4, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4296
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    const-string v1, "/profile/third/authorize"

    new-instance v2, Lo/czn$6;

    invoke-direct {v2, p0, p2}, Lo/czn$6;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v1, v4, v2}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 4324
    return-void
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;>;)V"
        }
    .end annotation

    .line 5607
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter startDeviceLinkage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5609
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 5611
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5614
    goto :goto_0

    .line 5612
    :catch_0
    move-exception v5

    .line 5613
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startDeviceLinkage  EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5617
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 5618
    if-nez v5, :cond_0

    .line 5620
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startDeviceLinkage   unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5621
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 5622
    return-void

    .line 5624
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$28;

    invoke-direct {v1, p0, p2}, Lo/czn$28;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->e(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 5653
    return-void
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/userprofile/UpdateCommentReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/userprofile/UpdateCommentReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;>;)V"
        }
    .end annotation

    .line 1247
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateCommentRemainderTimes "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1250
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1252
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1255
    goto :goto_0

    .line 1253
    :catch_0
    move-exception v5

    .line 1254
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateCommentRemainderTimes EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1257
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1258
    if-nez v5, :cond_0

    .line 1260
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateCommentRemainderTimes  unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1261
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 1262
    return-void

    .line 1266
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$3;

    invoke-direct {v1, p0, p2}, Lo/czn$3;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 1306
    return-void
.end method

.method public d(Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cyx<Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceRegisterVerifyCodeInfoRsp;>;)V"
        }
    .end annotation

    .line 5484
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EntergetDeviceRegisterVerifyCode"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5487
    const-string v4, "/deviceAgent/deviceRegister"

    .line 5488
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 5489
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$21;

    invoke-direct {v1, p0, p1}, Lo/czn$21;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v4, v5, v1}, Lo/czr;->e(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 5518
    return-void
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;)Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;
    .locals 14

    .line 3664
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 3665
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EnteraddHealthDataSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3668
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 3670
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 3671
    const-string v0, "addHealthDataSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3672
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addHealthDataSync url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3673
    const/4 v0, 0x0

    return-object v0

    .line 3677
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;-><init>()V

    .line 3680
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 3683
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;

    move-object v10, v0

    .line 3684
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 3685
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addHealthDataSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 3686
    return-object v10

    .line 3688
    :catch_0
    move-exception v12

    .line 3690
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addHealthDataSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3691
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3692
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 3700
    goto :goto_0

    .line 3695
    :catch_1
    move-exception v11

    .line 3697
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addHealthDataSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3698
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3699
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;->setResultDesc(Ljava/lang/String;)V

    .line 3702
    :goto_0
    return-object v10
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;
    .locals 14

    .line 3709
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 3710
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EntergetHealthDataByTimeSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3713
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 3715
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 3716
    const-string v0, "getHealthDataByTimeSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3717
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthDataByTimeSync url or parms invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3718
    const/4 v0, 0x0

    return-object v0

    .line 3722
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;-><init>()V

    .line 3725
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 3728
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;

    move-object v10, v0

    .line 3729
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 3730
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHealthDataByTimeSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 3731
    return-object v10

    .line 3733
    :catch_0
    move-exception v12

    .line 3735
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHealthDataByTimeSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3736
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3737
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 3745
    goto :goto_0

    .line 3740
    :catch_1
    move-exception v11

    .line 3742
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHealthDataByTimeSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3743
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3744
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;->setResultDesc(Ljava/lang/String;)V

    .line 3747
    :goto_0
    return-object v10
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionRsp;
    .locals 14

    .line 3979
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 3980
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EntergetMotionPathByVersionSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3983
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 3985
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 3986
    const-string v0, "getMotionPathByVersionSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3987
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMotionPathByVersionSync, url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3988
    const/4 v0, 0x0

    return-object v0

    .line 3992
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionRsp;-><init>()V

    .line 3995
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 3998
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionRsp;

    move-object v10, v0

    .line 3999
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 4000
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMotionPathByVersionSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 4001
    return-object v10

    .line 4003
    :catch_0
    move-exception v12

    .line 4005
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMotionPathByVersionSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4006
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 4007
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 4015
    goto :goto_0

    .line 4010
    :catch_1
    move-exception v11

    .line 4012
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMotionPathByVersionSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4013
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 4014
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionRsp;->setResultDesc(Ljava/lang/String;)V

    .line 4017
    :goto_0
    return-object v10
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;
    .locals 14

    .line 3259
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 3260
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EntergetSportDataByTimeSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3263
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 3265
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 3266
    const-string v0, "getSportDataByTimeSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3267
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportDataByTimeSync url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3268
    const/4 v0, 0x0

    return-object v0

    .line 3272
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;-><init>()V

    .line 3275
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 3278
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;

    move-object v10, v0

    .line 3279
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 3280
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSportDataByTimeSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 3281
    return-object v10

    .line 3283
    :catch_0
    move-exception v12

    .line 3285
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSportDataByTimeSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3286
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3287
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 3295
    goto :goto_0

    .line 3290
    :catch_1
    move-exception v11

    .line 3292
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSportDataByTimeSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3293
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3294
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;->setResultDesc(Ljava/lang/String;)V

    .line 3297
    :goto_0
    return-object v10
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatRsp;
    .locals 14

    .line 3529
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 3530
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EntergetSportDimenStatSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3533
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 3535
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 3536
    const-string v0, "getSportDimenStatSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3537
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportDimenStatSync url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3538
    const/4 v0, 0x0

    return-object v0

    .line 3542
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatRsp;-><init>()V

    .line 3545
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 3548
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatRsp;

    move-object v10, v0

    .line 3549
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 3550
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSportDimenStatSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 3551
    return-object v10

    .line 3553
    :catch_0
    move-exception v12

    .line 3555
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSportDimenStatSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3556
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3557
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 3565
    goto :goto_0

    .line 3560
    :catch_1
    move-exception v11

    .line 3562
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSportDimenStatSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3563
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3564
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatRsp;->setResultDesc(Ljava/lang/String;)V

    .line 3567
    :goto_0
    return-object v10
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/unite/GetSportStatReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportStatRsp;
    .locals 14

    .line 3484
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 3485
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EntergetSportStatSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3488
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 3490
    invoke-virtual {p0, p1}, Lo/czn;->e(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v9

    .line 3491
    const-string v0, "getSportStatSync"

    invoke-direct {p0, v8, v9, v0}, Lo/czn;->c(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3492
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportStatSync url or params invalidate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3493
    const/4 v0, 0x0

    return-object v0

    .line 3497
    :cond_0
    new-instance v10, Lcom/huawei/hwcloudmodel/model/unite/GetSportStatRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/unite/GetSportStatRsp;-><init>()V

    .line 3500
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 3503
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/unite/GetSportStatRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/GetSportStatRsp;

    move-object v10, v0

    .line 3504
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 3505
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSportStatSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 3506
    return-object v10

    .line 3508
    :catch_0
    move-exception v12

    .line 3510
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSportStatSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3511
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportStatRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3512
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportStatRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 3520
    goto :goto_0

    .line 3515
    :catch_1
    move-exception v11

    .line 3517
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSportStatSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3518
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportStatRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 3519
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/unite/GetSportStatRsp;->setResultDesc(Ljava/lang/String;)V

    .line 3522
    :goto_0
    return-object v10
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;
    .locals 14

    .line 2942
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 2943
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EntergetAllBindDeviceSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2946
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 2947
    if-nez v8, :cond_0

    .line 2949
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllBindDeviceSync unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2950
    const/4 v0, 0x0

    return-object v0

    .line 2954
    :cond_0
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 2957
    new-instance v10, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;

    invoke-direct {v10}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;-><init>()V

    .line 2960
    :try_start_0
    new-instance v0, Lo/czq;

    sget-object v1, Lo/czn;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/czq;-><init>(Landroid/content/Context;)V

    move-object v1, v8

    move-object v2, v9

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/czq;->e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 2963
    :try_start_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;

    invoke-virtual {v0, v11, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;

    move-object v10, v0

    .line 2964
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 2965
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAllBindDeviceSync totalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v12, v6

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_1 .. :try_end_1} :catch_1

    .line 2966
    return-object v10

    .line 2968
    :catch_0
    move-exception v12

    .line 2970
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAllBindDeviceSync fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2971
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 2972
    invoke-virtual {v12}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;->setResultDesc(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_2 .. :try_end_2} :catch_1

    .line 2980
    goto :goto_0

    .line 2975
    :catch_1
    move-exception v11

    .line 2977
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAllBindDeviceSync nspClient exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2978
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;->setResultCode(Ljava/lang/Integer;)V

    .line 2979
    invoke-virtual {v11}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;->setResultDesc(Ljava/lang/String;)V

    .line 2982
    :goto_0
    return-object v10
.end method

.method e(Ljava/lang/Object;)Ljava/util/HashMap;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;)Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 656
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 657
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v5

    .line 658
    move-object v6, v5

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_3

    aget-object v9, v6, v8

    .line 660
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    .line 661
    const/4 v11, 0x0

    .line 664
    :try_start_0
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->isAccessible()Z

    move-result v12

    .line 665
    if-nez v12, :cond_0

    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 666
    :cond_0
    invoke-virtual {v9, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    .line 667
    if-nez v12, :cond_1

    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 673
    :cond_1
    goto :goto_1

    .line 669
    :catch_0
    move-exception v12

    .line 671
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " get obj"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 672
    const/4 v0, 0x0

    return-object v0

    .line 675
    :goto_1
    if-eqz v11, :cond_2

    .line 677
    invoke-virtual {v4, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 658
    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 680
    :cond_3
    return-object v4
.end method

.method public e(DDLo/cyx;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDLo/cyx<Lo/czm;>;)V"
        }
    .end annotation

    .line 4402
    iget-object v0, p0, Lo/czn;->g:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/czn$15;

    move-object v2, p0

    move-wide v3, p1

    move-wide v5, p3

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lo/czn$15;-><init>(Lo/czn;DDLo/cyx;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 4413
    return-void
.end method

.method public e(ILo/cyx;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/cyx<Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 4961
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter cancelThirdAuthorization = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4962
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 4963
    const-string v0, "thirdAccountType"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4964
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "URL_CANCELTHIRDAUTHORIZATION = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "/dataOpen/third/cancelThirdAuthorization"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4965
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    const-string v1, "/dataOpen/third/cancelThirdAuthorization"

    new-instance v2, Lo/czn$19;

    invoke-direct {v2, p0, p2}, Lo/czn$19;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v1, v4, v2}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 4993
    return-void
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;Lo/cyx;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;Lo/cyx<Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 4849
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter thirdAuthorization = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4850
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 4851
    const-string v0, "thirdAuthToken"

    invoke-virtual {v4, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4852
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "URL_THIRDAUTHORIZATION = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "/dataOpen/third/thirdAuthorization"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4853
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    const-string v1, "/dataOpen/third/thirdAuthorization"

    new-instance v2, Lo/czn$14;

    invoke-direct {v2, p0, p2}, Lo/czn$14;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v1, v4, v2}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 4881
    return-void
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceUnbindReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceUnbindReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;>;)V"
        }
    .end annotation

    .line 5385
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unBindWifiDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5387
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 5389
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5392
    goto :goto_0

    .line 5390
    :catch_0
    move-exception v5

    .line 5391
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unBindWifiDevice  EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5395
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 5396
    if-nez v5, :cond_0

    .line 5398
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unBindWifiDevice   unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5399
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 5400
    return-void

    .line 5402
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$22;

    invoke-direct {v1, p0, p2}, Lo/czn$22;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->e(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 5431
    return-void
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/userprofile/GetCommentReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/userprofile/GetCommentReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/userprofile/GetCommentRsp;>;)V"
        }
    .end annotation

    .line 1184
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getCommentRemainderTimes "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1187
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1189
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1192
    goto :goto_0

    .line 1190
    :catch_0
    move-exception v5

    .line 1191
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCommentRemainderTimes EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1194
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1195
    if-nez v5, :cond_0

    .line 1197
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCommentRemainderTimes  unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1198
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 1199
    return-void

    .line 1203
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$33;

    invoke-direct {v1, p0, p2}, Lo/czn$33;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 1243
    return-void
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordRsp;>;)V"
        }
    .end annotation

    .line 1376
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getPrivacyRecord "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1379
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1381
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1384
    goto :goto_0

    .line 1382
    :catch_0
    move-exception v5

    .line 1383
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPrivacyRecord EXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1387
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1388
    if-nez v5, :cond_0

    .line 1390
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPrivacyRecord  unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1391
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 1392
    return-void

    .line 1396
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$1;

    invoke-direct {v1, p0, p2}, Lo/czn$1;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 1436
    return-void
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/userprofile/GetUserMergeInfoReq;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/userprofile/GetUserMergeInfoReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/userprofile/GetUserMergeInfoRsp;>;)V"
        }
    .end annotation

    .line 1507
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getUserMergeInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1510
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1512
    :try_start_0
    invoke-direct {p0, p1, v4}, Lo/czn;->a(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1515
    goto :goto_0

    .line 1513
    :catch_0
    move-exception v5

    .line 1514
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserMergeInfoEXCEPTION E:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1518
    :goto_0
    invoke-direct {p0, p1}, Lo/czn;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1519
    if-nez v5, :cond_0

    .line 1521
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserMergeInfo unknown url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1522
    const-string v0, "unknown url"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v1, v0, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 1523
    return-void

    .line 1527
    :cond_0
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$7;

    invoke-direct {v1, p0, p2}, Lo/czn$7;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v5, v4, v1}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 1569
    return-void
.end method

.method public e(Lo/cyx;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cyx<Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 4922
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getThirdAuthorization"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4923
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 4924
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "URL_GETTHIRDAUTHORIZATION = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "/dataOpen/third/getThirdAuthorization"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4925
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    const-string v1, "/dataOpen/third/getThirdAuthorization"

    new-instance v2, Lo/czn$17;

    invoke-direct {v2, p0, p1}, Lo/czn$17;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v1, v4, v2}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 4953
    return-void
.end method

.method public g(Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cyx<Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;>;)V"
        }
    .end annotation

    .line 5570
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EntergetUserAllWifiDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5573
    const-string v4, "/deviceAgent/getUserDevice"

    .line 5574
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 5575
    iget-object v0, p0, Lo/czn;->a:Lo/czr;

    new-instance v1, Lo/czn$26;

    invoke-direct {v1, p0, p1}, Lo/czn$26;-><init>(Lo/czn;Lo/cyx;)V

    invoke-virtual {v0, v4, v5, v1}, Lo/czr;->e(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V

    .line 5604
    return-void
.end method
