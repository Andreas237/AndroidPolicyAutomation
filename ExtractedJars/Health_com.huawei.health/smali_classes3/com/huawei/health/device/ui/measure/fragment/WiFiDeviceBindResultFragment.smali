.class public Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$ScanCallBack;,
        Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$NetWorkCallBack;,
        Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;
    }
.end annotation


# static fields
.field private static final DEVICE_WORK_TIMEOUT:I = 0x2bf20

.field private static final MSG_DEVICE_START_CONFIG:I = 0xf

.field private static final MSG_DEVICE_WORK_SET_UNIT:I = 0xc

.field private static final MSG_DEVICE_WORK_STATUS_BINDING:I = 0xd

.field private static final MSG_DEVICE_WORK_STATUS_FAIL:I = 0x5

.field private static final MSG_DEVICE_WORK_STATUS_INIT:I = 0xe

.field private static final MSG_DEVICE_WORK_STATUS_PAIR_STATUS:I = 0x7

.field private static final MSG_DEVICE_WORK_STATUS_START:I = 0x4

.field private static final MSG_DEVICE_WORK_STATUS_SUCCESS:I = 0x6

.field private static final MSG_DEVICE_WORK_STATUS_TIMEOUT:I = 0x8

.field private static final TAG:Ljava/lang/String; = "WiFiDeviceBindResultFragment"

.field private static final mScanCount:I = 0x2


# instance fields
.field private StageLoading:[Ljava/lang/String;

.field private anim:Landroid/graphics/drawable/AnimationDrawable;

.field private configMode:I

.field private currentStatus:I

.field private isBleScale:Z

.field private isHonourDevice:Z

.field private mAddDeviceInfo:Lo/ajd;

.field private mAddDeviceManager:Lo/akg;

.field private mBaseCallback:Lo/ajh;

.field private mContext:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

.field private mDialog:Lo/egy;

.field private mOuthName:Ljava/lang/String;

.field private mOuthPd:Ljava/lang/String;

.field private mProductId:Ljava/lang/String;

.field private mProductinfo:Lo/afj;

.field private mProgressView:Landroid/widget/ImageView;

.field private mScanCallBack:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$ScanCallBack;

.field private mScanManager:Lo/akj;

.field private mTitle:Ljava/lang/String;

.field private mValueAnimator:Landroid/animation/ValueAnimator;

.field private m_BindFailBtn:Landroid/widget/LinearLayout;

.field private m_BindFailLayout:Landroid/widget/LinearLayout;

.field private m_BindFailLayoutButton:Landroid/widget/LinearLayout;

.field private m_BindFailText:Lo/egb;

.field private m_BindRetryBtn:Landroid/widget/LinearLayout;

.field private m_BindSuccessLayout:Landroid/widget/LinearLayout;

.field private m_BindSuccessLayoutButton:Landroid/widget/LinearLayout;

.field private m_BindingLayout:Landroid/widget/LinearLayout;

.field private m_ConsumUserinfoBtn:Lo/egd;

.field private m_ErrorImg:Landroid/widget/ImageView;

.field private m_FailNext:Lo/egb;

.field private m_PairingStage:Lo/egb;

.field private m_PairingStageAnim:Lo/egb;

.field private myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 83
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 137
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    .line 140
    const/16 v0, 0xe

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->currentStatus:I

    .line 144
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "."

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, ".."

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "..."

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->StageLoading:[Ljava/lang/String;

    .line 146
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->isBleScale:Z

    .line 147
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->isHonourDevice:Z

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Z
    .locals 1

    .line 83
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->isDestory()Z

    move-result v0

    return v0
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)I
    .locals 1

    .line 83
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    return v0
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;IILjava/lang/Object;)V
    .locals 0

    .line 83
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->processingLogicEvent(IILjava/lang/Object;)V

    return-void
.end method

.method static synthetic access$102(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;I)I
    .locals 0

    .line 83
    iput p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    return p1
.end method

.method static synthetic access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->startConfig()V

    return-void
.end method

.method static synthetic access$1200(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Landroid/app/Activity;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$1300(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Landroid/app/Activity;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$1400(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lo/afj;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductinfo:Lo/afj;

    return-object v0
.end method

.method static synthetic access$1500(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;Lo/ace;Ljava/lang/String;)Z
    .locals 1

    .line 83
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->compareDevice(Lo/ace;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$1600(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;Ljava/lang/String;)V
    .locals 0

    .line 83
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->unBindDevice(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    return-object v0
.end method

.method static synthetic access$1800(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1900(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Z
    .locals 1

    .line 83
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->isBleScale:Z

    return v0
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lo/akj;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mScanManager:Lo/akj;

    return-object v0
.end method

.method static synthetic access$2000(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->jumpToHonourDeviceFragment()V

    return-void
.end method

.method static synthetic access$2100(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)[Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->StageLoading:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$2200(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lo/egb;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_PairingStageAnim:Lo/egb;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;II)V
    .locals 0

    .line 83
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->updateStatus(II)V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mOuthName:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mOuthPd:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lo/ajd;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mAddDeviceInfo:Lo/ajd;

    return-object v0
.end method

.method static synthetic access$602(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;Lo/ajd;)Lo/ajd;
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mAddDeviceInfo:Lo/ajd;

    return-object p1
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lo/akg;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mAddDeviceManager:Lo/akg;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->setBIWifiDeviceBindSuccessCount()V

    return-void
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Landroid/app/Activity;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method private checkHavePermission()Z
    .locals 5

    .line 306
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mainActivity:Landroid/app/Activity;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/location/LocationManager;

    .line 307
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0, v2}, Lo/ajw;->d(Landroid/content/Context;Landroid/location/LocationManager;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 308
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mDialog:Lo/egy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mDialog:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 309
    const/4 v0, 0x0

    return v0

    .line 311
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_gps_service_prompt_msg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 312
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 313
    invoke-virtual {v4, v3}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    .line 314
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_common_enable_button:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V

    invoke-virtual {v4, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 333
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V

    invoke-virtual {v4, v0, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 340
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mDialog:Lo/egy;

    .line 341
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mDialog:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 342
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mDialog:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 343
    const/4 v0, 0x0

    return v0

    .line 345
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private compareDevice(Lo/ace;Ljava/lang/String;)Z
    .locals 4

    .line 625
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 626
    :cond_0
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "compareDevice null == scanFilter || TextUtils.isEmpty(proID)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 627
    const/4 v0, 0x0

    return v0

    .line 629
    :cond_1
    invoke-virtual {p1, p2}, Lo/ace;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 630
    const/4 v0, 0x1

    return v0

    .line 632
    :cond_2
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "compareDevice proid error :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 633
    const/4 v0, 0x0

    return v0
.end method

.method private getCloudDevice()V
    .locals 2

    .line 359
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$3;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V

    invoke-virtual {v0, v1}, Lo/czg;->b(Lo/cyx;)V

    .line 396
    return-void
.end method

.method private getWiFiDevice(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;)Ljava/lang/String;
    .locals 5

    .line 428
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;->getDeviceDetailInfoList()Ljava/util/List;

    move-result-object v1

    .line 429
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductinfo:Lo/afj;

    iget-object v2, v0, Lo/afj;->h:Lo/ace;

    .line 430
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 431
    const/4 v0, 0x0

    return-object v0

    .line 433
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 434
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 436
    :cond_2
    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_4

    .line 437
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    iget-object v0, v0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devInfo:Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    iget-object v4, v0, Lcom/huawei/hwcloudmodel/model/unite/DevInfo;->prodId:Ljava/lang/String;

    .line 438
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v2, v4}, Lo/ace;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 439
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    iget-object v0, v0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devId:Ljava/lang/String;

    return-object v0

    .line 436
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 442
    :cond_4
    const/4 v0, 0x0

    return-object v0
.end method

.method private initData()V
    .locals 4

    .line 271
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 272
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductId:Ljava/lang/String;

    .line 273
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "outhName"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mOuthName:Ljava/lang/String;

    .line 274
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "outhPd"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mOuthPd:Ljava/lang/String;

    .line 275
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "isBleScale"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->isBleScale:Z

    .line 276
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mTitle:Ljava/lang/String;

    .line 277
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "isHonourDevice"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->isHonourDevice:Z

    .line 278
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "add_device_info"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lo/ajd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mAddDeviceInfo:Lo/ajd;

    .line 279
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "config_mode"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    .line 281
    :cond_0
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductinfo:Lo/afj;

    .line 282
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/akg;->a(Landroid/content/Context;)Lo/akg;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mAddDeviceManager:Lo/akg;

    .line 283
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$NetWorkCallBack;

    invoke-direct {v0, p0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$NetWorkCallBack;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mBaseCallback:Lo/ajh;

    .line 284
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akj;->b(Landroid/content/Context;)Lo/akj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mScanManager:Lo/akj;

    .line 285
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$ScanCallBack;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$ScanCallBack;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mScanCallBack:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$ScanCallBack;

    .line 286
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v3

    .line 287
    const/16 v0, 0x8

    iput v0, v3, Landroid/os/Message;->what:I

    .line 288
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    iput v0, v3, Landroid/os/Message;->arg1:I

    .line 289
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    const-wide/32 v1, 0x2bf20

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 290
    return-void
.end method

.method private initListener()V
    .locals 1

    .line 265
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_ConsumUserinfoBtn:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 266
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindRetryBtn:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 267
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindFailBtn:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 268
    return-void
.end method

.method private initView()V
    .locals 2

    .line 242
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->id_device_wifi_binding_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindingLayout:Landroid/widget/LinearLayout;

    .line 243
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->id_device_bind_success_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindSuccessLayout:Landroid/widget/LinearLayout;

    .line 244
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->id_device_bind_fail_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindFailLayout:Landroid/widget/LinearLayout;

    .line 245
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->id_device_bind_success_button:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindSuccessLayoutButton:Landroid/widget/LinearLayout;

    .line 246
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->id_device_bind_fail_button:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindFailLayoutButton:Landroid/widget/LinearLayout;

    .line 248
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->id_btn_consum_userinfo:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_ConsumUserinfoBtn:Lo/egd;

    .line 249
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_bind_fail_next:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_FailNext:Lo/egb;

    .line 250
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->id_btn_retry:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindRetryBtn:Landroid/widget/LinearLayout;

    .line 251
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->id_btn_bind_fail:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindFailBtn:Landroid/widget/LinearLayout;

    .line 252
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->id_tv_bind_fail:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindFailText:Lo/egb;

    .line 253
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->IDS_device_wifi_binding_promt_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_PairingStage:Lo/egb;

    .line 254
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->IDS_device_wifi_binding_promt_anim:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_PairingStageAnim:Lo/egb;

    .line 255
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->pair_result_device_show_img:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_ErrorImg:Landroid/widget/ImageView;

    .line 256
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_pair_guide_progress_anim:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProgressView:Landroid/widget/ImageView;

    .line 257
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProgressView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->anim:Landroid/graphics/drawable/AnimationDrawable;

    .line 258
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->anim:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 259
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_ErrorImg:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 260
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->setBackNavigationVisibility(I)V

    .line 261
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_device_pair_guide_note:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->setTitle(Ljava/lang/String;)V

    .line 262
    return-void
.end method

.method private isBindeSuccess(Lo/aja;)Z
    .locals 5

    .line 638
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mAddDeviceInfo:Lo/ajd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 639
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductinfo:Lo/afj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 640
    :cond_0
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isBindeSuccess proid is null or mDevice is null:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    if-eq v2, p1, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 641
    const/4 v0, 0x0

    return v0

    .line 643
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductinfo:Lo/afj;

    iget-object v4, v0, Lo/afj;->h:Lo/ace;

    .line 644
    iget-object v0, p1, Lo/aja;->c:Lo/aja$a;

    iget-object v0, v0, Lo/aja$a;->h:Ljava/lang/String;

    invoke-direct {p0, v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->compareDevice(Lo/ace;Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 647
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private isDestory()Z
    .locals 5

    .line 808
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    .line 809
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 810
    :cond_0
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity is Destroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 811
    const/4 v0, 0x1

    return v0

    .line 813
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_2

    .line 814
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyHandler mFragment is not add"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 815
    const/4 v0, 0x0

    return v0

    .line 817
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private jumpToHonourDeviceFragment()V
    .locals 4

    .line 900
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->isHonourDevice:Z

    if-eqz v0, :cond_0

    .line 901
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->popupFragment(Ljava/lang/Class;)V

    goto :goto_0

    .line 903
    :cond_0
    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-direct {v2}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;-><init>()V

    .line 904
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 905
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 907
    const-string v0, "goto"

    const-string v1, "devicebind"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 908
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mTitle:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 909
    invoke-virtual {v2, v3}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 910
    invoke-virtual {p0, v2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 912
    :goto_0
    return-void
.end method

.method private onClickBindFail()V
    .locals 6

    .line 514
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClickBindFail mProductId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 515
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akf;->k(Landroid/content/Context;)Z

    .line 516
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 517
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 518
    const-string v0, "config_mode"

    const/4 v1, 0x2

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    .line 519
    :cond_0
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 520
    const-string v0, "config_mode"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 522
    :cond_1
    :goto_0
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 524
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getSelectFragment(Ljava/lang/Class;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    .line 525
    if-eqz v5, :cond_2

    .line 526
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x3e8

    const/4 v2, -0x1

    invoke-virtual {v5, v1, v2, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 527
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->popupFragment(Ljava/lang/Class;)V

    goto :goto_1

    .line 529
    :cond_2
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get WiFiInfoConfirmFragment fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 531
    :goto_1
    return-void
.end method

.method private onClickBleScaleUserInfo()V
    .locals 5

    .line 479
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClickBleScaleUserInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 481
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mContext:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 482
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 483
    const-string v0, "device"

    const-string v1, "wifi"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 484
    const-string v0, "isBleScale"

    iget-boolean v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->isBleScale:Z

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 485
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 486
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.main.stories.me.activity.UserInfoActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 487
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->jumpToHonourDeviceFragment()V

    .line 488
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mContext:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-virtual {v0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->startActivity(Landroid/content/Intent;)V

    .line 491
    :cond_0
    return-void
.end method

.method private onClickConsumUserinfo()V
    .locals 5

    .line 494
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClickConsumUserinfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 496
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mContext:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 497
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 498
    const-string v0, "device"

    const-string v1, "wifi"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 499
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 500
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.main.stories.me.activity.UserInfoActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 501
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->popupFragment(Ljava/lang/Class;)V

    .line 502
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mContext:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-virtual {v0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->startActivity(Landroid/content/Intent;)V

    .line 504
    :cond_0
    return-void
.end method

.method private onClickRetry()V
    .locals 4

    .line 507
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClickRetry"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 508
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->popupFragment(Ljava/lang/Class;)V

    .line 509
    return-void
.end method

.method private processingLogicEvent(IILjava/lang/Object;)V
    .locals 6

    .line 656
    const/16 v0, 0xd

    if-ne p2, v0, :cond_1

    .line 657
    move-object v4, p3

    check-cast v4, Lo/aja;

    .line 658
    if-eqz v4, :cond_1

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductId:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 659
    invoke-direct {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->isBindeSuccess(Lo/aja;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 660
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processingLogicEvent bind device is not need device :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, v4, Lo/aja;->c:Lo/aja$a;

    invoke-virtual {v2}, Lo/aja$a;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 661
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 662
    const/4 v0, 0x5

    iput v0, v5, Landroid/os/Message;->what:I

    .line 663
    iput p1, v5, Landroid/os/Message;->arg1:I

    .line 664
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    invoke-virtual {v0, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 665
    invoke-virtual {v4}, Lo/aja;->g()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->unBindDevice(Ljava/lang/String;)V

    .line 666
    return-void

    .line 668
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductId:Ljava/lang/String;

    iput-object v0, v4, Lo/aja;->e:Ljava/lang/String;

    .line 669
    sget-object v0, Lo/acl$a;->c:Lo/acl$a;

    invoke-virtual {v4, v0}, Lo/aja;->d(Lo/acl$a;)V

    .line 670
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processingLogicEvent deviceDetailInfo:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/aja;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 671
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductinfo:Lo/afj;

    invoke-virtual {v2}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$5;

    invoke-direct {v3, p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$5;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;I)V

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/afd;->b(Ljava/lang/String;Ljava/lang/String;Lo/acl;Lo/aby;)Z

    .line 699
    :cond_1
    return-void
.end method

.method private setBIWifiDeviceBindSuccessCount()V
    .locals 7

    .line 848
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aja;

    .line 849
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 850
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 851
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lo/aja;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 852
    invoke-virtual {v4}, Lo/aja;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ahb;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 854
    if-eqz v6, :cond_0

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x18

    if-le v0, v1, :cond_0

    .line 855
    const-string v0, "macAddress"

    const/4 v1, 0x0

    const/16 v2, 0x18

    invoke-virtual {v6, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 858
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->fY:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 859
    return-void
.end method

.method private showConfirmInfoAndDisplay()V
    .locals 6

    .line 865
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showConfirmInfoAndDisplay() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 867
    new-instance v5, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v5, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 868
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_confirm_info_and_display:I

    invoke-virtual {v5, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$7;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$7;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V

    .line 869
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_apphelp_pwindows_back_button:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$6;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$6;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V

    .line 878
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 894
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 895
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 896
    return-void
.end method

.method private showStage(Ljava/lang/String;)V
    .locals 3

    .line 919
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_PairingStage:Lo/egb;

    invoke-virtual {v0, p1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 920
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mValueAnimator:Landroid/animation/ValueAnimator;

    if-nez v0, :cond_0

    .line 921
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mValueAnimator:Landroid/animation/ValueAnimator;

    .line 922
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mValueAnimator:Landroid/animation/ValueAnimator;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 923
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mValueAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$8;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$8;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 930
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-nez v0, :cond_1

    .line 931
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    goto :goto_0

    .line 934
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mValueAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$9;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$9;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 941
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-nez v0, :cond_1

    .line 942
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 945
    :cond_1
    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3
    .end array-data
.end method

.method private startConfig()V
    .locals 3

    .line 446
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->currentStatus:I

    const/16 v1, 0xe

    if-ne v0, v1, :cond_1

    .line 447
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 448
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    const/16 v1, 0xe

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->updateStatus(II)V

    .line 449
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->startScanDevice()V

    goto :goto_0

    .line 450
    :cond_0
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 451
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 452
    const/4 v0, 0x4

    iput v0, v2, Landroid/os/Message;->what:I

    .line 453
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    iput v0, v2, Landroid/os/Message;->arg1:I

    .line 454
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    invoke-virtual {v0, v2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 457
    :cond_1
    :goto_0
    return-void
.end method

.method private startScanDevice()V
    .locals 4

    .line 295
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->checkHavePermission()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 296
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductinfo:Lo/afj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 297
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mScanManager:Lo/akj;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductinfo:Lo/afj;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mScanCallBack:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$ScanCallBack;

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v3, v2}, Lo/akj;->d(Lo/afj;ILo/ajn;)V

    goto :goto_0

    .line 299
    :cond_0
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScan Get device infomation is fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 302
    :cond_1
    :goto_0
    return-void
.end method

.method private unBindDevice(Ljava/lang/String;)V
    .locals 5

    .line 399
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 400
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unBindDevice deviceid is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 401
    return-void

    .line 403
    :cond_0
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceUnbindReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceUnbindReq;-><init>()V

    .line 404
    invoke-virtual {v4, p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceUnbindReq;->setDevId(Ljava/lang/String;)V

    .line 405
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unBindDevice :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 406
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$4;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V

    invoke-virtual {v0, v4, v1}, Lo/czg;->e(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceUnbindReq;Lo/cyx;)V

    .line 426
    return-void
.end method

.method private updateStatus(II)V
    .locals 11

    .line 540
    iput p2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->currentStatus:I

    .line 541
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateStatus\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", configMode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 542
    const/4 v0, 0x7

    if-ne p2, v0, :cond_0

    .line 543
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->setBackNavigationVisibility(I)V

    .line 544
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_device_pair_guide_note:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->setTitle(Ljava/lang/String;)V

    .line 545
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindingLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 546
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindSuccessLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 547
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindFailLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 548
    const/4 v0, 0x3

    if-ne p1, v0, :cond_b

    .line 549
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_binding_stage3:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 550
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 551
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 549
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 552
    invoke-direct {p0, v7}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->showStage(Ljava/lang/String;)V

    .line 553
    goto/16 :goto_1

    .line 554
    :cond_0
    const/4 v0, 0x5

    if-ne p2, v0, :cond_6

    .line 555
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->setBackNavigationVisibility(I)V

    .line 556
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_bind_fail:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->setTitle(Ljava/lang/String;)V

    .line 557
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindingLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 558
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindSuccessLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 559
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindFailLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 560
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindFailLayoutButton:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 561
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_ErrorImg:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 562
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_ErrorImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->ic_health_equipment_bind_failed:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 563
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_FailNext:Lo/egb;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 564
    const/4 v0, 0x1

    if-eq v0, p1, :cond_1

    const/4 v0, 0x3

    if-ne v0, p1, :cond_2

    .line 565
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_bind_manual_fail_prompt_1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 566
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 565
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 567
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_bind_auto_fail_prompt_2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 568
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 567
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 569
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_bind_auto_fail_prompt_3:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 570
    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 569
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 571
    new-instance v10, Landroid/text/SpannableStringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_bind_fail_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 573
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindFailText:Lo/egb;

    invoke-virtual {v0, v10}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 574
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_FailNext:Lo/egb;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 575
    goto/16 :goto_0

    :cond_2
    const/4 v0, 0x2

    if-ne v0, p1, :cond_3

    .line 576
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_bind_manual_fail_prompt_1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 577
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 576
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 578
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_bind_auto_fail_prompt_2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 579
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 578
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 580
    new-instance v9, Landroid/text/SpannableStringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_bind_fail_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 582
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindFailText:Lo/egb;

    invoke-virtual {v0, v9}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 583
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_FailNext:Lo/egb;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_bind_auto:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 585
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mValueAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_4

    .line 586
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    .line 588
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->anim:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_5

    .line 589
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->anim:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 591
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProgressView:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 592
    :cond_6
    const/4 v0, 0x6

    if-ne p2, v0, :cond_9

    .line 593
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->setBackNavigationVisibility(I)V

    .line 594
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_blite_guide_paire_completed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->setTitle(Ljava/lang/String;)V

    .line 595
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindingLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 596
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindSuccessLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 597
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindSuccessLayoutButton:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 598
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_BindFailLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 599
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_ErrorImg:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 600
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_ErrorImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->device_jabra_bind_success_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 601
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mValueAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_7

    .line 602
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    .line 604
    :cond_7
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->anim:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_8

    .line 605
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->anim:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 607
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProgressView:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 610
    :cond_9
    const/16 v0, 0xe

    if-ne p2, v0, :cond_b

    .line 611
    const/4 v0, 0x1

    if-ne p1, v0, :cond_a

    .line 612
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_binding_stage2:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 613
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 614
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 612
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 615
    invoke-direct {p0, v7}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->showStage(Ljava/lang/String;)V

    .line 616
    goto :goto_1

    :cond_a
    const/4 v0, 0x2

    if-ne p1, v0, :cond_b

    .line 617
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_binding_stage2:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 618
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 619
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 617
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 620
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->m_PairingStage:Lo/egb;

    invoke-virtual {v0, v7}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 623
    :cond_b
    :goto_1
    return-void
.end method


# virtual methods
.method public onBackPressed()Z
    .locals 2

    .line 822
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->currentStatus:I

    const/4 v1, 0x6

    if-ne v1, v0, :cond_0

    .line 823
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->showConfirmInfoAndDisplay()V

    goto :goto_0

    .line 825
    :cond_0
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->popupFragment(Ljava/lang/Class;)V

    .line 827
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 460
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onclick ID"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 461
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->id_btn_consum_userinfo:I

    if-ne v0, v1, :cond_1

    .line 463
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->isBleScale:Z

    if-eqz v0, :cond_0

    .line 464
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->onClickBleScaleUserInfo()V

    goto :goto_0

    .line 466
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->onClickConsumUserinfo()V

    goto :goto_0

    .line 468
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->id_btn_retry:I

    if-ne v0, v1, :cond_2

    .line 470
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->onClickRetry()V

    goto :goto_0

    .line 471
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->id_btn_bind_fail:I

    if-ne v0, v1, :cond_3

    .line 473
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->onBackPressed()Z

    .line 476
    :cond_3
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 214
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 215
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 216
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    .line 217
    iput-object p0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mContext:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    .line 218
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 223
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 224
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 225
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_wifi_bind_result_layout:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->child:Landroid/view/View;

    .line 226
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->initView()V

    .line 227
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->initData()V

    .line 228
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->initListener()V

    .line 229
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 230
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->child:Landroid/view/View;

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 232
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->isBleScale:Z

    if-eqz v0, :cond_1

    .line 233
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 234
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    const/4 v1, 0x6

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->updateStatus(II)V

    goto :goto_0

    .line 236
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->getCloudDevice()V

    .line 238
    :goto_0
    return-object v4
.end method

.method public onDestroy()V
    .locals 2

    .line 831
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/aii;->b(Landroid/content/Context;)Z

    .line 832
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 833
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mAddDeviceManager:Lo/akg;

    if-eqz v0, :cond_0

    .line 834
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mAddDeviceManager:Lo/akg;

    invoke-virtual {v0}, Lo/akg;->e()V

    .line 835
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    if-eqz v0, :cond_1

    .line 836
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 837
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mScanManager:Lo/akj;

    if-eqz v0, :cond_2

    .line 838
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mScanManager:Lo/akj;

    invoke-virtual {v0}, Lo/akj;->d()V

    .line 839
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mValueAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_3

    .line 840
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 842
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->anim:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_4

    .line 843
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->anim:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 845
    :cond_4
    return-void
.end method

.method public onStart()V
    .locals 5

    .line 350
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onStart:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->currentStatus:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 351
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onStart()V

    .line 352
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 353
    const/16 v0, 0xf

    iput v0, v4, Landroid/os/Message;->what:I

    .line 354
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 355
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    invoke-virtual {v0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 356
    return-void
.end method

.method public removeRepeatDevice(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ajd;>;)Ljava/util/ArrayList<Lo/ajd;>;"
        }
    .end annotation

    .line 997
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 998
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ajd;

    .line 999
    invoke-virtual {v6}, Lo/ajd;->c()Ljava/lang/String;

    move-result-object v7

    .line 1000
    invoke-virtual {v6}, Lo/ajd;->d()Ljava/lang/String;

    move-result-object v8

    .line 1001
    invoke-virtual {v6}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v9

    .line 1002
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeRepeatDevice ssid,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1003
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeRepeatDevice proId,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1004
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeRepeatDevice type,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1005
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1006
    :cond_0
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeRepeatDevice ssid,productId,type is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1007
    goto/16 :goto_0

    .line 1009
    :cond_1
    const-string v0, "wifiap"

    invoke-virtual {v6}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1010
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeRepeatDevice source type is other "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1011
    goto/16 :goto_0

    .line 1013
    :cond_2
    const/4 v10, 0x1

    .line 1014
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 1015
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/ajd;

    .line 1016
    if-eqz v12, :cond_3

    invoke-virtual {v12}, Lo/ajd;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v12}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1017
    const/4 v10, 0x0

    .line 1018
    goto :goto_2

    .line 1020
    :cond_3
    goto :goto_1

    .line 1022
    :cond_4
    :goto_2
    if-eqz v10, :cond_5

    .line 1023
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1025
    :cond_5
    goto/16 :goto_0

    .line 1026
    :cond_6
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeRepeatDevice all add info is:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1027
    return-object v4
.end method

.method public startConfigNetWork(Ljava/lang/String;Ljava/lang/String;Lo/ajd;)V
    .locals 6

    .line 775
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 776
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startConfigNetWork SOFTAP_MODE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 777
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mAddDeviceManager:Lo/akg;

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    iget-object v5, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mBaseCallback:Lo/ajh;

    invoke-virtual/range {v0 .. v5}, Lo/akg;->c(ILjava/lang/String;Ljava/lang/String;Lo/ajd;Lo/ajh;)V

    .line 778
    return-void

    .line 780
    :cond_0
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 781
    const/4 v0, 0x0

    if-ne v0, p3, :cond_3

    .line 782
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 783
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startConfigNetWork mProductId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 784
    return-void

    .line 786
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductinfo:Lo/afj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 787
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startConfigNetWork mProductinfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 788
    return-void

    .line 790
    :cond_2
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startConfigNetWork HAND_ADD_WIFIAP_MODE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 791
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mAddDeviceManager:Lo/akg;

    move-object v1, p1

    move-object v2, p2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductinfo:Lo/afj;

    iget-object v3, v3, Lo/afj;->h:Lo/ace;

    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mProductId:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mBaseCallback:Lo/ajh;

    invoke-virtual/range {v0 .. v5}, Lo/akg;->d(Ljava/lang/String;Ljava/lang/String;Lo/ace;Ljava/lang/String;Lo/ajh;)V

    goto :goto_0

    .line 793
    :cond_3
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startConfigNetWork MULTCAST_MODE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 794
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mAddDeviceManager:Lo/akg;

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    iget-object v5, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mBaseCallback:Lo/ajh;

    invoke-virtual/range {v0 .. v5}, Lo/akg;->c(ILjava/lang/String;Ljava/lang/String;Lo/ajd;Lo/ajh;)V

    .line 796
    :goto_0
    return-void

    .line 798
    :cond_4
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 799
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startConfigNetWork REGISTER_MODE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 800
    iput-object p3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mAddDeviceInfo:Lo/ajd;

    .line 801
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mAddDeviceManager:Lo/akg;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mAddDeviceInfo:Lo/ajd;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->mBaseCallback:Lo/ajh;

    invoke-virtual {v0, v1, v2}, Lo/akg;->e(Lo/ajd;Lo/ajh;)V

    .line 802
    return-void

    .line 804
    :cond_5
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startConfigNetWork config mode is error mode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->configMode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 805
    return-void
.end method
