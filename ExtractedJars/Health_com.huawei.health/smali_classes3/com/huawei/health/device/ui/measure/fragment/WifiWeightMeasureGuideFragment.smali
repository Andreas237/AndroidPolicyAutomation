.class public Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;
    }
.end annotation


# static fields
.field private static final AGGREGATE_COUNT_ONE:I = 0x1

.field private static final MSG_GET_NEW_WEIGHT_VALUE_FAILURE:I = 0x65

.field private static final MSG_GET_NEW_WEIGHT_VALUE_SUCCESS:I = 0x64

.field private static final MSG_NOT_EXIST_DEVICE:I = 0x68

.field private static final MSG_UPDATE_NEW_WEIGHT_VALUE:I = 0x67

.field private static final QUERY_OPPORTUNITY_FOUR:I = 0x1adb0

.field private static final QUERY_OPPORTUNITY_ONE:I = 0x2710

.field private static final QUERY_OPPORTUNITY_THREE:I = 0x13880

.field private static final QUERY_OPPORTUNITY_TWO:I = 0x7530

.field private static final TAG:Ljava/lang/String; = "WifiWeightMeasureGuideFragment"

.field private static final TIMEOUT:I = 0x1d4c0


# instance fields
.field private mAnimationHandler:Lo/agf;

.field private mEndTime:J

.field private mProductId:Ljava/lang/String;

.field private mProductInfo:Lo/afj;

.field private mStartTime:J

.field private final mWeightPushInfoReceiver:Landroid/content/BroadcastReceiver;

.field private myHandler:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;

.field private negativeListener:Landroid/view/View$OnClickListener;

.field private positiveListener:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 70
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 86
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    .line 87
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mStartTime:J

    .line 88
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mEndTime:J

    .line 125
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->negativeListener:Landroid/view/View$OnClickListener;

    .line 132
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->positiveListener:Landroid/view/View$OnClickListener;

    .line 335
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$4;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mWeightPushInfoReceiver:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)Z
    .locals 1

    .line 70
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->isDestroy()Z

    move-result v0

    return v0
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;Lo/agg;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->goToResultPage(Lo/agg;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->getMeasureWeightData()V

    return-void
.end method

.method static synthetic access$1100(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)Landroid/app/Activity;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;Landroid/content/Context;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->showMeasureTimeoutDialog(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->syncNewWeightData()V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;Ljava/lang/String;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->showNoDeviceDialog(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)Landroid/app/Activity;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;Ljava/util/ArrayList;Ljava/lang/String;)Lo/afk;
    .locals 1

    .line 70
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->switchProductGroupItem(Ljava/util/ArrayList;Ljava/lang/String;)Lo/afk;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)Landroid/app/Activity;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 70
    invoke-virtual {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method private checkDevice()V
    .locals 6

    .line 459
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDevice() checkDevice mProductId:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 460
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ajq;->b(Ljava/lang/String;)Lo/aja;

    move-result-object v4

    .line 461
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 462
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDevice() mWiFiDevice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 463
    new-instance v5, Landroid/os/Message;

    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 464
    const/16 v0, 0x68

    iput v0, v5, Landroid/os/Message;->what:I

    .line 465
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;

    invoke-virtual {v0, v5}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 466
    return-void

    .line 468
    :cond_0
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;-><init>()V

    .line 469
    iget-object v0, v4, Lo/aja;->c:Lo/aja$a;

    iget-object v0, v0, Lo/aja$a;->e:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;->setDevId(Ljava/lang/String;)V

    .line 470
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$6;

    invoke-direct {v1, p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$6;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;Lo/aja;)V

    invoke-virtual {v0, v5, v1}, Lo/czg;->b(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;Lo/cyx;)V

    .line 500
    return-void
.end method

.method private getMeasureWeightData()V
    .locals 14

    .line 354
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMeasureWeightData mProductId is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 355
    const-wide/16 v5, 0x0

    .line 356
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ajq;->b(Ljava/lang/String;)Lo/aja;

    move-result-object v7

    .line 357
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 358
    invoke-virtual {v7}, Lo/aja;->f()J

    move-result-wide v5

    .line 360
    :cond_0
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMeasureWeightData deviceCode is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 362
    const/4 v8, 0x0

    .line 363
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v5

    if-nez v0, :cond_1

    .line 364
    return-void

    .line 366
    :cond_1
    new-instance v9, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;

    invoke-direct {v9}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;-><init>()V

    .line 367
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;->setDeviceCode(Ljava/lang/Long;)V

    .line 368
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/czg;->c(Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;

    move-result-object v10

    .line 370
    const/4 v0, 0x1

    :try_start_0
    invoke-static {v10, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 371
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMeasureWeightData checkCloudRsp Errorr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lo/csq; {:try_start_0 .. :try_end_0} :catch_0

    .line 372
    return-void

    .line 374
    :cond_2
    :try_start_1
    invoke-virtual {v10}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;->getDeviceInfos()Ljava/util/List;

    move-result-object v11

    .line 375
    if-eqz v11, :cond_3

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 376
    :cond_3
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMeasureWeightData deviceInfos is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lo/csq; {:try_start_1 .. :try_end_1} :catch_0

    .line 377
    return-void

    .line 379
    :cond_4
    const/4 v0, 0x0

    :try_start_2
    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;

    .line 380
    invoke-virtual {v12}, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;->getUniqueId()Ljava/lang/String;

    move-result-object v8

    .line 381
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMeasureWeightData deviceUUID is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Lo/csq; {:try_start_2 .. :try_end_2} :catch_0

    .line 385
    goto :goto_0

    .line 382
    :catch_0
    move-exception v11

    .line 383
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMeasureWeightData Sync data error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lo/csq;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 384
    return-void

    .line 387
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v8, :cond_5

    .line 388
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMeasureWeightData error, deviceUUID is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 389
    return-void

    .line 391
    :cond_5
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mStartTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mStartTime:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|mEndTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mEndTime:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 393
    const/4 v11, 0x1

    new-array v11, v11, [I

    fill-array-data v11, :array_0

    .line 394
    const/4 v0, 0x1

    new-array v12, v0, [Ljava/lang/String;

    const-string v0, "test"

    const/4 v1, 0x0

    aput-object v0, v12, v1

    .line 395
    new-instance v13, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v13}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 396
    iget-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mStartTime:J

    iget-wide v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mEndTime:J

    invoke-virtual {v13, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setTimeRange(JJ)V

    .line 397
    invoke-virtual {v13, v11}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 398
    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 399
    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 400
    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 401
    const-string v0, ""

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    .line 402
    invoke-virtual {v13, v12}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 403
    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setCount(I)V

    .line 404
    invoke-virtual {v13, v8}, Lcom/huawei/hihealth/HiAggregateOption;->setDeviceUUID(Ljava/lang/String;)V

    .line 405
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$5;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)V

    invoke-interface {v0, v13, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 444
    return-void

    nop

    :array_0
    .array-data 4
        0x2716
    .end array-data
.end method

.method private getMode()Lo/aha;
    .locals 5

    .line 271
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getmode()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 272
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mProductInfo:Lo/afj;

    .line 273
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mProductInfo:Lo/afj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mProductInfo:Lo/afj;

    iget-object v0, v0, Lo/afj;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 274
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 276
    :cond_1
    new-instance v4, Lo/aha;

    invoke-direct {v4}, Lo/aha;-><init>()V

    .line 277
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mProductInfo:Lo/afj;

    iget-object v1, v1, Lo/afj;->n:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/afj$b;

    iget-object v1, v1, Lo/afj$b;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/aha;->e(Ljava/lang/String;)V

    .line 278
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/BaseFragment;->setTitle(Ljava/lang/String;)V

    .line 279
    return-object v4
.end method

.method private goToResultPage(Lo/agg;)V
    .locals 6

    .line 300
    if-eqz p1, :cond_1

    .line 301
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/agd;->a(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v4

    .line 302
    if-nez v4, :cond_0

    .line 303
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightMeasureGuideFragment handleDataChangedInUiThread fragment = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 304
    return-void

    .line 306
    :cond_0
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 307
    const-string v0, "HealthData"

    invoke-virtual {v5, v0, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 308
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 310
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 313
    :cond_1
    return-void
.end method

.method private initView(Ljava/lang/Object;)V
    .locals 6

    .line 254
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->lightTheScreen()V

    .line 255
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->child:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 256
    instance-of v0, p1, Lo/aha;

    if-eqz v0, :cond_0

    .line 257
    move-object v4, p1

    check-cast v4, Lo/aha;

    .line 258
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 259
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->hw_wifi_device_measure_prompt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 260
    invoke-virtual {v4}, Lo/aha;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 263
    :cond_0
    return-void
.end method

.method private isDestroy()Z
    .locals 5

    .line 245
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    .line 246
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 247
    :cond_0
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity is Destroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 248
    const/4 v0, 0x1

    return v0

    .line 250
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private lightTheScreen()V
    .locals 3

    .line 266
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    const/16 v2, 0x80

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 268
    return-void
.end method

.method private registerPushInfoBroadcast()V
    .locals 5

    .line 317
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerPushInfoBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 318
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.health.action.ACTION_PUSH_DATA_DONE_ACTION"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 319
    const-string v0, "com.huawei.health.action.ACTION_PUSH_DATA_DONE_ACTION"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 320
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mainActivity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mWeightPushInfoReceiver:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 321
    return-void
.end method

.method private showMeasureTimeoutDialog(Landroid/content/Context;)V
    .locals 5

    .line 284
    const/4 v3, 0x0

    .line 285
    new-instance v4, Lo/egy$b;

    invoke-direct {v4, p1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 286
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_measure_timeout_prompt_msg:I

    invoke-virtual {v4, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_result_confirm:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$3;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$3;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)V

    .line 287
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 293
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 294
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/egy;->setCancelable(Z)V

    .line 295
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 296
    return-void
.end method

.method private showNoDeviceDialog(Ljava/lang/String;)V
    .locals 3

    .line 163
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 164
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mainActivity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->negativeListener:Landroid/view/View$OnClickListener;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->positiveListener:Landroid/view/View$OnClickListener;

    invoke-static {v0, p1, v1, v2}, Lo/ahu;->d(Landroid/content/Context;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    .line 165
    return-void
.end method

.method private switchProductGroupItem(Ljava/util/ArrayList;Ljava/lang/String;)Lo/afk;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/afk;>;Ljava/lang/String;)Lo/afk;"
        }
    .end annotation

    .line 152
    const/4 v4, 0x0

    .line 153
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/afk;

    .line 154
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " item.kind.name() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v6, Lo/afk;->b:Lo/acl$a;

    invoke-virtual {v3}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " device_Type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 155
    iget-object v0, v6, Lo/afk;->b:Lo/acl$a;

    invoke-virtual {v0}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    move-object v4, v6

    .line 158
    :cond_0
    goto :goto_0

    .line 159
    :cond_1
    return-object v4
.end method

.method private syncNewWeightData()V
    .locals 5

    .line 448
    new-instance v4, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 449
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 450
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 451
    const/16 v0, 0x4e20

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 452
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncScope(I)V

    .line 453
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 454
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processPushMsg, startSync,time:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-static {v3}, Lo/dbu;->n(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 455
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Lo/clq;->c(Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V

    .line 456
    return-void
.end method

.method private unRegisterPushInfoBroadcast()V
    .locals 5

    .line 325
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterPushInfoBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 327
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mainActivity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mWeightPushInfoReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 332
    goto :goto_0

    .line 328
    :catch_0
    move-exception v4

    .line 329
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unRegisterPushInfoBroadcast "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 332
    goto :goto_0

    .line 330
    :catch_1
    move-exception v4

    .line 331
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unRegisterPushInfoBroadcast "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 333
    :goto_0
    return-void
.end method


# virtual methods
.method public onBackPressed()Z
    .locals 1

    .line 240
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->popupFragment(Ljava/lang/Class;)V

    .line 241
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    .line 169
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 170
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 171
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;

    .line 173
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mainActivity:Landroid/app/Activity;

    const-string v1, "wifi_weight_device"

    const-string v2, "weight_notify_key"

    const-string v3, "false"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 175
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 176
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "currentTime == == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 178
    const-wide/16 v0, 0x3a98

    sub-long v0, v5, v0

    iput-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mStartTime:J

    .line 179
    const-wide/32 v0, 0x1d4c0

    add-long/2addr v0, v5

    iput-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mEndTime:J

    .line 181
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .line 184
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 185
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 186
    sget v0, Lcom/huawei/plugindevice/R$layout;->wifi_weight_measure_layout:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->child:Landroid/view/View;

    .line 187
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mProductId:Ljava/lang/String;

    .line 188
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->getMode()Lo/aha;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 189
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMode() is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 190
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "DeviceMeasureOperateModel"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v5

    .line 191
    if-nez v5, :cond_0

    .line 192
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView serializable = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 194
    :cond_0
    invoke-direct {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->initView(Ljava/lang/Object;)V

    .line 196
    :goto_0
    goto :goto_1

    .line 197
    :cond_1
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMode() is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 198
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->getMode()Lo/aha;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->initView(Ljava/lang/Object;)V

    .line 200
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 201
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->child:Landroid/view/View;

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 203
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->checkDevice()V

    .line 204
    return-object v4
.end method

.method public onDestroy()V
    .locals 5

    .line 227
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mainActivity:Landroid/app/Activity;

    const-string v1, "wifi_weight_device"

    const-string v2, "weight_notify_key"

    const-string v3, "true"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 229
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 230
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;

    if-eqz v0, :cond_0

    .line 231
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 233
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mAnimationHandler:Lo/agf;

    if-eqz v0, :cond_1

    .line 234
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->mAnimationHandler:Lo/agf;

    .line 236
    :cond_1
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 219
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onPause()V

    .line 220
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 221
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->unRegisterPushInfoBroadcast()V

    .line 222
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 209
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onResume()V

    .line 210
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->registerPushInfoBroadcast()V

    .line 211
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;

    const/16 v1, 0x67

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 212
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;

    const/16 v1, 0x67

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 213
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;

    const/16 v1, 0x67

    const-wide/32 v2, 0x13880

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 214
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;

    const/16 v1, 0x67

    const-wide/32 v2, 0x1adb0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 215
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;

    const/16 v1, 0x65

    const-wide/32 v2, 0x1d4c0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 216
    return-void
.end method
