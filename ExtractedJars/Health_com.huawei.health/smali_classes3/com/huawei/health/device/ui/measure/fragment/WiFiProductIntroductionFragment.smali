.class public Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$ResoureDownCallBack;,
        Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;
    }
.end annotation


# static fields
.field private static final CHANGE_MEASURE_WEIGHT_HINT_NUM:I = 0x4

.field private static final DEFAULT_MARGIN_ADAPTER_BGCD:I = 0x8d

.field private static final MSG_FACTORY_DATA_RESET_FAIL:I = 0x5

.field private static final MSG_FACTORY_DATA_RESET_SUCCESS:I = 0x2

.field private static final MSG_REFRESH_RESOURCE:I = 0x1

.field private static final MSG_REFRESH_RESOURCE_FAIL:I = 0x3

.field private static final TAG:Ljava/lang/String; = "WiFiProductIntroductionFragment"

.field private static final UNDERLINE_CHAR:Ljava/lang/String; = "_"

.field private static final URL_USER_GUIDE:Ljava/lang/String; = "https://resourcephs2.vmall.com/handbook/CH19/EMUI9.0/C001B001/en-US/index.html"

.field private static final URL_USER_GUIDE_CN:Ljava/lang/String; = "https://resourcephs1.vmall.com/CH19/EMUI9.0/C001B001/zh-CN/index.html"

.field private static final URL_USER_GUIDE_CN_HORON:Ljava/lang/String; = "https://resourcephs1.vmall.com/AH110/EMUI9.0/C001B001/zh-CN/index.html"

.field private static final URL_USER_GUIDE_HORON:Ljava/lang/String; = "https://resourcephs2.vmall.com/handbook/AH110/EMUI9.0/C001B001/en-US/index.html"


# instance fields
.field private bindOtherDialog:Lo/egv;

.field private commBaseCallback:Lo/aje;

.field private dialog:Lo/egv;

.field private health_data_status:Z

.field private interactors:Lo/dnm;

.field private isBind:Z

.field private isBindComeInThePage:Z

.field private isBindOtherDevice:Z

.field private isDownResoure:Z

.field private mBindBtn:Lo/egd;

.field private mBindLayout:Landroid/widget/LinearLayout;

.field private mBindProductId:Ljava/lang/String;

.field private mBindProductName:Ljava/lang/String;

.field private mBindTipImg:Landroid/widget/ImageView;

.field private mBuyButton:Landroid/widget/TextView;

.field private mCancelDataDialog:Lo/egv;

.field private mClaimDataBtn:Landroid/widget/LinearLayout;

.field private mClaimDataNumTv:Landroid/widget/TextView;

.field private mDeviceUpgradeBtn:Landroid/widget/LinearLayout;

.field private mExistNewVersion:Landroid/widget/ImageView;

.field private mIntroducedPager:Landroid/support/v4/view/ViewPager;

.field private mIntroductionPromptTv:Landroid/widget/TextView;

.field private mLoadImageView:Lhuawei/widget/HwProgressBar;

.field private mMacAddress:Landroid/widget/TextView;

.field private mMavigationSpotLayout:Landroid/widget/LinearLayout;

.field private mMeasureBtn:Lo/egd;

.field private mNavigation:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/widget/ImageView;>;"
        }
    .end annotation
.end field

.field private mNetWorkSettingLayout:Landroid/widget/LinearLayout;

.field private mNoNetWorkTipLayout:Landroid/widget/LinearLayout;

.field private mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

.field private mProductId:Ljava/lang/String;

.field private mProductInfo:Lo/afj;

.field private mPrompts:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private mRestoreFactoryBtn:Landroid/widget/LinearLayout;

.field private mTopViewTipTv:Landroid/widget/TextView;

.field private mTvWIFIDevicetext:Landroid/widget/TextView;

.field private mUnBindBtn:Lo/egd;

.field private mUnBindLayout:Landroid/widget/LinearLayout;

.field private mUnbindDialog:Lo/egv;

.field private mUserClearBtn:Landroid/widget/LinearLayout;

.field private mUserGuideBtn:Landroid/widget/LinearLayout;

.field private mViewAdapter:Lo/ags;

.field private mWiFiDevice:Lo/aja;

.field private myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;

.field private personal_info_status:Z

.field private wifiDialog:Lo/egy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 136
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->health_data_status:Z

    .line 137
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->personal_info_status:Z

    .line 141
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBindOtherDevice:Z

    .line 229
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$1;

    invoke-direct {v0, p0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->commBaseCallback:Lo/aje;

    .line 589
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Z
    .locals 1

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isDestory()Z

    move-result v0

    return v0
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;Lo/afj;)V
    .locals 0

    .line 86
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->updataProduct(Lo/afj;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/app/Activity;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/widget/TextView;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mClaimDataNumTv:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$1200(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/app/Activity;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$1300(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/app/Activity;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$1400(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;

    return-object v0
.end method

.method static synthetic access$1500(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/widget/TextView;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mIntroductionPromptTv:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$1600(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;ILandroid/widget/TextView;)V
    .locals 0

    .line 86
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->setPromptText(ILandroid/widget/TextView;)V

    return-void
.end method

.method static synthetic access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Ljava/util/ArrayList;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mNavigation:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$1800(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/app/Activity;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$1900(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Z
    .locals 1

    .line 86
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBind:Z

    return v0
.end method

.method static synthetic access$2000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Lo/egv;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mCancelDataDialog:Lo/egv;

    return-object v0
.end method

.method static synthetic access$202(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;Z)Z
    .locals 0

    .line 86
    iput-boolean p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBind:Z

    return p1
.end method

.method static synthetic access$2100(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->onClickUnBind()V

    return-void
.end method

.method static synthetic access$2200(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->openHealthDataDialog()V

    return-void
.end method

.method static synthetic access$2300(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Z
    .locals 1

    .line 86
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->health_data_status:Z

    return v0
.end method

.method static synthetic access$2400(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Lo/dnm;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->interactors:Lo/dnm;

    return-object v0
.end method

.method static synthetic access$2500(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/app/Activity;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$2600(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->openPersonalInfomationDialog()V

    return-void
.end method

.method static synthetic access$2700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->onClickBind()V

    return-void
.end method

.method static synthetic access$2800(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Z
    .locals 1

    .line 86
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->personal_info_status:Z

    return v0
.end method

.method static synthetic access$2900(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->unBindLocalDevice()V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Z
    .locals 1

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBindDevice()Z

    move-result v0

    return v0
.end method

.method static synthetic access$3000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/app/Activity;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$3100(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->showUnBindFail()V

    return-void
.end method

.method static synthetic access$3200(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/app/Activity;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$3300(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->gotoWiFiInfoDevice()V

    return-void
.end method

.method static synthetic access$3400(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Lo/egv;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUnbindDialog:Lo/egv;

    return-object v0
.end method

.method static synthetic access$3402(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;Lo/egv;)Lo/egv;
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUnbindDialog:Lo/egv;

    return-object p1
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->initViewData()V

    return-void
.end method

.method static synthetic access$502(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;Z)Z
    .locals 0

    .line 86
    iput-boolean p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isDownResoure:Z

    return p1
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->loadAnimation()V

    return-void
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mClaimDataBtn:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/app/Activity;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/widget/TextView;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mTvWIFIDevicetext:Landroid/widget/TextView;

    return-object v0
.end method

.method private checkWiFiIsOpen()Z
    .locals 4

    .line 985
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akf;->i(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 986
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkWiFiIsOpen checkWifiStatus false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 987
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->showWiFiEnableDialog(Landroid/content/Context;)V

    .line 988
    const/4 v0, 0x0

    return v0

    .line 990
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private downloadResoure()V
    .locals 8

    .line 382
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v2}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    invoke-virtual {v2}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 383
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 384
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->c()Lo/aey;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/aey;->a(Ljava/lang/String;)Lo/afl;

    move-result-object v6

    .line 385
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-virtual {v6}, Lo/afl;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isDownResoure:Z

    .line 386
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isDownResoure:Z

    if-eqz v0, :cond_3

    .line 387
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 388
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-virtual {v6}, Lo/afl;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 389
    invoke-virtual {v6}, Lo/afl;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/afq;->b(Ljava/util/ArrayList;)V

    goto :goto_1

    .line 392
    :cond_2
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->a()V

    .line 395
    :cond_3
    :goto_1
    return-void
.end method

.method private gePersonalInfoStatus()Z
    .locals 4

    .line 1137
    const/4 v3, 0x0

    .line 1138
    const-string v0, "true"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->interactors:Lo/dnm;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lo/dnm;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1139
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->personal_info_status:Z

    goto :goto_0

    .line 1141
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->personal_info_status:Z

    .line 1144
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->personal_info_status:Z

    if-nez v0, :cond_1

    .line 1145
    const/4 v3, 0x1

    .line 1147
    :cond_1
    return v3
.end method

.method private getBindOtherDevice()V
    .locals 5

    .line 1050
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBind:Z

    if-nez v0, :cond_1

    .line 1052
    const-string v0, "a8ba095d-4123-43c4-a30a-0240011c58de"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1053
    const-string v0, "e4b0b1d5-2003-4d88-8b5f-c4f64542040b"

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBindTheOtherDevice(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBindOtherDevice:Z

    .line 1054
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBindOtherDevice:Z

    if-eqz v0, :cond_1

    .line 1055
    const-string v0, "e4b0b1d5-2003-4d88-8b5f-c4f64542040b"

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindProductId:Ljava/lang/String;

    goto :goto_0

    .line 1058
    :cond_0
    const-string v0, "e4b0b1d5-2003-4d88-8b5f-c4f64542040b"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1059
    const-string v0, "a8ba095d-4123-43c4-a30a-0240011c58de"

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBindTheOtherDevice(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBindOtherDevice:Z

    .line 1060
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBindOtherDevice:Z

    if-eqz v0, :cond_1

    .line 1061
    const-string v0, "a8ba095d-4123-43c4-a30a-0240011c58de"

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindProductId:Ljava/lang/String;

    .line 1065
    :cond_1
    :goto_0
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBindOtherDevice isBindOtherDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBindOtherDevice:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1066
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBindOtherDevice:Z

    if-eqz v0, :cond_2

    .line 1067
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v4

    .line 1068
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindProductId:Ljava/lang/String;

    invoke-virtual {v4}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindProductName:Ljava/lang/String;

    .line 1069
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->showBindOtherDeviceDialog(Landroid/content/Context;)V

    .line 1070
    goto :goto_1

    .line 1071
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->showOuthDialog()V

    .line 1073
    :goto_1
    return-void
.end method

.method private getDataStatus()Z
    .locals 4

    .line 1123
    const/4 v3, 0x0

    .line 1124
    const-string v0, "true"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->interactors:Lo/dnm;

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lo/dnm;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1125
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->health_data_status:Z

    goto :goto_0

    .line 1127
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->health_data_status:Z

    .line 1130
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->health_data_status:Z

    if-nez v0, :cond_1

    .line 1131
    const/4 v3, 0x1

    .line 1133
    :cond_1
    return v3
.end method

.method private gotoMeasure()V
    .locals 4

    .line 1208
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/agd;->d(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v2

    .line 1209
    if-eqz v2, :cond_0

    .line 1210
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 1211
    const-string v0, "view"

    const-string v1, "measure"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1212
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1213
    invoke-virtual {v2, v3}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 1214
    invoke-virtual {p0, v2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 1216
    :cond_0
    return-void
.end method

.method private gotoScaleManagerFragment()V
    .locals 7

    .line 1179
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoScaleManagerFragment"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1180
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mWiFiDevice:Lo/aja;

    invoke-virtual {v0}, Lo/aja;->g()Ljava/lang/String;

    move-result-object v4

    .line 1181
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 1182
    const-string v0, "deviceId"

    invoke-virtual {v5, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1183
    new-instance v6, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;

    invoke-direct {v6}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;-><init>()V

    .line 1184
    invoke-virtual {v6, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->setArguments(Landroid/os/Bundle;)V

    .line 1185
    invoke-virtual {p0, v6}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 1186
    return-void
.end method

.method private gotoWiFiInfoDevice()V
    .locals 6

    .line 1075
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoWiFiInfoDevice mProductId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1076
    invoke-static {}, Lo/akd;->b()Lo/akd;

    move-result-object v0

    invoke-virtual {v0}, Lo/akd;->c()V

    .line 1077
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_0

    .line 1078
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akf;->k(Landroid/content/Context;)Z

    .line 1080
    :cond_0
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;-><init>()V

    .line 1081
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 1082
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1083
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->setArguments(Landroid/os/Bundle;)V

    .line 1084
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 1085
    return-void
.end method

.method private initBindViewData()V
    .locals 3

    .line 398
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindBtn:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 399
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUnBindBtn:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 400
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mMeasureBtn:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 401
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBuyButton:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 402
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mClaimDataBtn:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 403
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mClaimDataBtn:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 404
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mTvWIFIDevicetext:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->wifi_device_menu_text_right_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 405
    const-string v0, "a8ba095d-4123-43c4-a30a-0240011c58de"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 406
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindTipImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->honor_wifi_device_bind_tip_img:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 408
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->setTopViewText()V

    .line 409
    return-void
.end method

.method private initData()V
    .locals 4

    .line 280
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    .line 281
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 282
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData mProductId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 283
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->onBackPressed()V

    .line 284
    return-void

    .line 286
    :cond_0
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    .line 287
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 288
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData mProductInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 289
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->onBackPressed()V

    .line 290
    return-void

    .line 292
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBindDevice()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBind:Z

    .line 294
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData is Bind Device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBind:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 295
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBind:Z

    if-eqz v0, :cond_2

    .line 296
    sget-object v0, Lo/ahw;->e:Lo/ahw;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->commBaseCallback:Lo/aje;

    invoke-virtual {v0, v1, v2}, Lo/ahw;->d(Ljava/lang/String;Lo/ajj;)V

    .line 298
    :cond_2
    return-void
.end method

.method private initListener()V
    .locals 2

    .line 254
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mClaimDataBtn:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 255
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mDeviceUpgradeBtn:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 256
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindBtn:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 257
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUnBindBtn:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 258
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mMeasureBtn:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 259
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mRestoreFactoryBtn:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 260
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUserGuideBtn:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 261
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUserClearBtn:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 262
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBuyButton:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 263
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mNetWorkSettingLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 264
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mIntroducedPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->clearOnPageChangeListeners()V

    .line 265
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mIntroducedPager:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 266
    return-void
.end method

.method private initNavigation()V
    .locals 8

    .line 516
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initNavigation() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 517
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 518
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mMavigationSpotLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 519
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mMavigationSpotLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 521
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mNavigation:Ljava/util/ArrayList;

    .line 522
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_4

    .line 523
    new-instance v6, Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v6, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 524
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lo/ahf;->b(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    const/high16 v2, 0x40c00000    # 6.0f

    invoke-static {v1, v2}, Lo/ahf;->b(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {v7, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 525
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/ahf;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 526
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lo/ahf;->b(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v7, v1, v2, v0, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 527
    add-int/lit8 v0, v4, -0x1

    if-ne v0, v5, :cond_1

    .line 528
    sget v0, Lcom/huawei/plugindevice/R$drawable;->btn_health_point_orange_sel:I

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 529
    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    .line 531
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lo/ahf;->b(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v7, v1, v2, v0, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 532
    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 533
    sget v0, Lcom/huawei/plugindevice/R$drawable;->btn_health_point_gray_nor:I

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 536
    :cond_2
    const/4 v0, 0x0

    if-ne v0, v5, :cond_3

    .line 537
    sget v0, Lcom/huawei/plugindevice/R$drawable;->btn_health_point_orange_sel:I

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 538
    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    .line 540
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lo/ahf;->b(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v7, v0, v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 541
    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 542
    sget v0, Lcom/huawei/plugindevice/R$drawable;->btn_health_point_gray_nor:I

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 545
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mMavigationSpotLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 546
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mNavigation:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 522
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 548
    :cond_4
    return-void
.end method

.method private initNetWorkTipView()V
    .locals 2

    .line 554
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ajw;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isDownResoure:Z

    if-eqz v0, :cond_0

    .line 555
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mNoNetWorkTipLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 557
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mNoNetWorkTipLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 559
    :goto_0
    return-void
.end method

.method private initUnBindButton()V
    .locals 2

    .line 472
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->setBuyButton()V

    .line 473
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindBtn:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 474
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUnBindBtn:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 475
    return-void
.end method

.method private initUnBindViewData()V
    .locals 4

    .line 448
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->loadAnimation()V

    .line 449
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->initNetWorkTipView()V

    .line 450
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mMeasureBtn:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 451
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 452
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initUnBindViewData() deviceInfo size is zero"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 453
    return-void

    .line 455
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mIntroductionPromptTv:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/ScrollingMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 456
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->initNavigation()V

    .line 457
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->initViewAdapter()V

    .line 458
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->initUnBindButton()V

    .line 459
    return-void
.end method

.method private initView()V
    .locals 4

    .line 316
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_nfc_tip_title_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mNoNetWorkTipLayout:Landroid/widget/LinearLayout;

    .line 317
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_info_img_pager:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mIntroducedPager:Landroid/support/v4/view/ViewPager;

    .line 318
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_network_setting_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mNetWorkSettingLayout:Landroid/widget/LinearLayout;

    .line 319
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_unbind_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUnBindLayout:Landroid/widget/LinearLayout;

    .line 320
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_bind_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindLayout:Landroid/widget/LinearLayout;

    .line 321
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_loading_image:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mLoadImageView:Lhuawei/widget/HwProgressBar;

    .line 322
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_introduction_prompt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mIntroductionPromptTv:Landroid/widget/TextView;

    .line 323
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_navigation_spot:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mMavigationSpotLayout:Landroid/widget/LinearLayout;

    .line 324
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_claim_data_button:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mClaimDataBtn:Landroid/widget/LinearLayout;

    .line 325
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_upgrade_button:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mDeviceUpgradeBtn:Landroid/widget/LinearLayout;

    .line 326
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_claim_data_num_text:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mClaimDataNumTv:Landroid/widget/TextView;

    .line 327
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_restore_factory_button:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mRestoreFactoryBtn:Landroid/widget/LinearLayout;

    .line 328
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_user_guide_button:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUserGuideBtn:Landroid/widget/LinearLayout;

    .line 329
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_user_clear_button:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUserClearBtn:Landroid/widget/LinearLayout;

    .line 330
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_bind_btn:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindBtn:Lo/egd;

    .line 331
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_unbind_btn:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUnBindBtn:Lo/egd;

    .line 332
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_buy_btn:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBuyButton:Landroid/widget/TextView;

    .line 333
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mLoadImageView:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 334
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_bind_top_view_text:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mTopViewTipTv:Landroid/widget/TextView;

    .line 335
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_wifi_device_claim_data:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mTvWIFIDevicetext:Landroid/widget/TextView;

    .line 336
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_exist_new_version:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mExistNewVersion:Landroid/widget/ImageView;

    .line 337
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_mac_address:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mMacAddress:Landroid/widget/TextView;

    .line 338
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_bind_tip_img_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindTipImg:Landroid/widget/ImageView;

    .line 339
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_bind_measure:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mMeasureBtn:Lo/egd;

    .line 340
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 341
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindTipImg:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 342
    const/16 v0, 0x8d

    iput v0, v3, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 343
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindTipImg:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 344
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mTopViewTipTv:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 345
    const/16 v0, 0x8d

    iput v0, v3, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 346
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mTopViewTipTv:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 348
    :cond_0
    return-void
.end method

.method private initViewAdapter()V
    .locals 6

    .line 478
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mPrompts:Ljava/util/ArrayList;

    .line 479
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 480
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 481
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v2}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    invoke-virtual {v2}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 482
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mPrompts:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v2}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    invoke-virtual {v2}, Lo/afj$b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 483
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mIntroductionPromptTv:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->setPromptText(ILandroid/widget/TextView;)V

    .line 480
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 485
    :cond_0
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initViewAdapter imgPathList size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 487
    new-instance v0, Lo/ags;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v0, v4, v1}, Lo/ags;-><init>(Ljava/util/ArrayList;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mViewAdapter:Lo/ags;

    .line 488
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mIntroducedPager:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mViewAdapter:Lo/ags;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 489
    return-void
.end method

.method private initViewData()V
    .locals 2

    .line 356
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 357
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->setTitle()V

    .line 358
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBind:Z

    if-eqz v0, :cond_0

    .line 359
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 360
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUnBindLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 361
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->initBindViewData()V

    goto :goto_0

    .line 363
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUnBindLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 364
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 365
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->initUnBindViewData()V

    .line 369
    :cond_1
    :goto_0
    invoke-static {}, Lo/ahs;->e()Lo/ahs;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mWiFiDevice:Lo/aja;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mWiFiDevice:Lo/aja;

    invoke-virtual {v1}, Lo/aja;->g()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    const-string v1, ""

    :goto_1
    invoke-virtual {v0, v1}, Lo/ahs;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 370
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mExistNewVersion:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 372
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mExistNewVersion:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 376
    :goto_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mWiFiDevice:Lo/aja;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mWiFiDevice:Lo/aja;

    invoke-virtual {v0}, Lo/aja;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 377
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mMacAddress:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mWiFiDevice:Lo/aja;

    invoke-virtual {v1}, Lo/aja;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 379
    :cond_4
    return-void
.end method

.method private isBindDevice()Z
    .locals 2

    .line 270
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    check-cast v0, Lo/aja;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mWiFiDevice:Lo/aja;

    .line 271
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mWiFiDevice:Lo/aja;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isBindTheOtherDevice(Ljava/lang/String;)Z
    .locals 2

    .line 275
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/aja;

    .line 276
    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isDestory()Z
    .locals 5

    .line 562
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    .line 563
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 564
    :cond_0
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity is Destroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 565
    const/4 v0, 0x1

    return v0

    .line 567
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private isShowOuthDialog()Z
    .locals 1

    .line 1151
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->getDataStatus()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1152
    const/4 v0, 0x1

    return v0

    .line 1154
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private isShowPersonalDialog()Z
    .locals 1

    .line 1158
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->gePersonalInfoStatus()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1159
    const/4 v0, 0x1

    return v0

    .line 1161
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private loadAnimation()V
    .locals 2

    .line 438
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ajw;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isDownResoure:Z

    if-eqz v0, :cond_0

    .line 439
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mLoadImageView:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 440
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mIntroducedPager:Landroid/support/v4/view/ViewPager;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    goto :goto_0

    .line 442
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mLoadImageView:Lhuawei/widget/HwProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 443
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mIntroducedPager:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 445
    :goto_0
    return-void
.end method

.method private onClickBind()V
    .locals 4

    .line 864
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClickBind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 865
    sget-object v0, Lo/dae;->fF:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->setBIModelInformation(Ljava/lang/String;)V

    .line 866
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->checkWiFiIsOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 867
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClickBind gotoWiFiInfoDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 868
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->gotoWiFiInfoDevice()V

    goto :goto_0

    .line 870
    :cond_0
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClickBind not permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 872
    :goto_0
    return-void
.end method

.method private onClickBuyButton()V
    .locals 6

    .line 963
    sget-object v0, Lo/dae;->fD:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->setBIModelInformation(Ljava/lang/String;)V

    .line 964
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    const-string v1, "miaomall_url"

    invoke-virtual {v0, v1}, Lo/afj;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 966
    if-nez v4, :cond_0

    .line 967
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClickBuyButton haven\'t get miaomall url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 968
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    const-string v1, "buy_url"

    invoke-virtual {v0, v1}, Lo/afj;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 971
    :cond_0
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 972
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 973
    const-string v0, "com.huawei.health"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 974
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.operation.activity.WebViewActivity"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 975
    const-string v0, "url"

    invoke-virtual {v5, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 976
    const-string v0, "EXTRA_BI_ID"

    const-string v1, ""

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 977
    const-string v0, "EXTRA_BI_NAME"

    const-string v1, ""

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 978
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "Device"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 979
    invoke-virtual {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->startActivity(Landroid/content/Intent;)V

    .line 980
    goto :goto_0

    .line 981
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_datasourceactivity_no_vmall:I

    invoke-static {v0, v1}, Lo/agh;->e(Landroid/content/Context;I)V

    .line 983
    :goto_0
    return-void
.end method

.method private onClickUnBind()V
    .locals 6

    .line 875
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/ajw;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 876
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_not_network:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 877
    return-void

    .line 880
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBindOtherDevice:Z

    if-eqz v0, :cond_2

    .line 881
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onClickUnBind other WiFiDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 882
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aja;

    .line 883
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lo/aja;->g()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    .line 884
    :goto_0
    invoke-direct {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->proccessUnbind(Ljava/lang/String;)V

    .line 885
    goto :goto_1

    .line 886
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mWiFiDevice:Lo/aja;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 887
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mWiFiDevice:Lo/aja;

    invoke-virtual {v0}, Lo/aja;->g()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->proccessUnbind(Ljava/lang/String;)V

    goto :goto_1

    .line 889
    :cond_3
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onClickUnBind WiFiDevice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 892
    :goto_1
    return-void
.end method

.method private openAppHelpActivity(Ljava/lang/String;)V
    .locals 5

    .line 1167
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    const-class v1, Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1168
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openAppHelpActivity url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1169
    const-string v0, "WebViewActivity.REQUEST_URL_KEY"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1170
    const-string v0, "WebViewActivity.JUMP_MODE_KEY"

    const/4 v1, 0x4

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1171
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 1172
    return-void
.end method

.method private openHealthDataDialog()V
    .locals 4

    .line 798
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isShowOuthDialog()Z

    move-result v0

    if-nez v0, :cond_1

    .line 799
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/dbf;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 800
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->openPersonalInfomationDialog()V

    goto :goto_0

    .line 802
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->onClickBind()V

    .line 804
    :goto_0
    return-void

    .line 807
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_user_permission_ok:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    .line 808
    new-instance v3, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v3, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 809
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_user_permission_dialog_health_data_message:I

    invoke-virtual {v3, v0}, Lo/egv$b;->e(I)Lo/egv$b;

    .line 810
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_hwh_health_privacy_switch_change_title:I

    invoke-virtual {v3, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 811
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$7;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$7;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    invoke-virtual {v3, v2, v0}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 824
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$8;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$8;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    invoke-virtual {v3, v0, v1}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 829
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->dialog:Lo/egv;

    .line 830
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->dialog:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 831
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->dialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 832
    return-void
.end method

.method private openPersonalInfomationDialog()V
    .locals 4

    .line 835
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isShowPersonalDialog()Z

    move-result v0

    if-nez v0, :cond_0

    .line 836
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->onClickBind()V

    .line 837
    return-void

    .line 840
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_user_permission_ok:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    .line 841
    new-instance v3, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v3, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 842
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_user_permission_dialog_personal_infomation_message:I

    invoke-virtual {v3, v0}, Lo/egv$b;->e(I)Lo/egv$b;

    .line 843
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_hwh_info_privacy_switch_change_title:I

    invoke-virtual {v3, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 844
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$9;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$9;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    invoke-virtual {v3, v2, v0}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 853
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$10;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$10;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    invoke-virtual {v3, v0, v1}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 858
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->dialog:Lo/egv;

    .line 859
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->dialog:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 860
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->dialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 861
    return-void
.end method

.method private proccessUnbind(Ljava/lang/String;)V
    .locals 5

    .line 895
    if-nez p1, :cond_0

    .line 896
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " proccessUnbind deviceId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 897
    return-void

    .line 899
    :cond_0
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceUnbindReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceUnbindReq;-><init>()V

    .line 900
    invoke-virtual {v4, p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceUnbindReq;->setDevId(Ljava/lang/String;)V

    .line 901
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClickUnBind :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 902
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$11;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$11;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    invoke-virtual {v0, v4, v1}, Lo/czg;->e(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceUnbindReq;Lo/cyx;)V

    .line 930
    return-void
.end method

.method private reFreshDevData()V
    .locals 6

    .line 1192
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "into reFreshDevData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1193
    const-string v5, ""

    .line 1194
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_is_wificlear"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1195
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isClearCome:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1197
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "false"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1198
    :cond_0
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reFreshDevData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1199
    invoke-static {}, Lo/ahu;->c()V

    .line 1202
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_is_wificlear"

    const-string v3, "false"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1205
    return-void
.end method

.method private setBIModelInformation(Ljava/lang/String;)V
    .locals 4

    .line 956
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 957
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 958
    const-string v0, "device_name"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 959
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 960
    return-void
.end method

.method private setBuyButton()V
    .locals 3

    .line 462
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    const-string v1, "buy_url"

    invoke-virtual {v0, v1}, Lo/afj;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 463
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 465
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBuyButton:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 467
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBuyButton:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 469
    :goto_0
    return-void
.end method

.method private setPromptText(ILandroid/widget/TextView;)V
    .locals 9

    .line 492
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setScrollY(I)V

    .line 493
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_scale_description_1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 494
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_scale_description_2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 495
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 496
    if-ltz p1, :cond_1

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 497
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afj$b;

    invoke-virtual {v0}, Lo/afj$b;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    .line 498
    const-string v0, "IDS_device_wifi_scale_description_1"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 499
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setScrollY(I)V

    .line 500
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-wide/high16 v1, 0x4031000000000000L    # 17.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v5, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 501
    invoke-virtual {p2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 502
    return-void

    .line 503
    :cond_0
    const-string v0, "IDS_device_wifi_scale_description_2"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 504
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v6, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 505
    invoke-virtual {p2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 506
    return-void

    .line 510
    :cond_1
    if-ltz p1, :cond_2

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mPrompts:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_2

    .line 511
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mPrompts:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 513
    :cond_2
    return-void
.end method

.method private setTitle()V
    .locals 3

    .line 351
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 352
    invoke-virtual {p0, v2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->setTitle(Ljava/lang/String;)V

    .line 353
    return-void
.end method

.method private setTopViewText()V
    .locals 14

    .line 412
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/WindowManager;

    .line 413
    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v7

    .line 414
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mTopViewTipTv:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    .line 415
    int-to-double v0, v7

    const-wide v2, 0x3fd999999999999aL    # 0.4

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, v8, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 416
    const/4 v0, -0x2

    iput v0, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 417
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mTopViewTipTv:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 418
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_bind_top_view_tip:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 419
    const-string v0, "%1$s"

    invoke-virtual {v9, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    .line 420
    const-string v0, "%2$s"

    invoke-virtual {v9, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v11

    .line 421
    const-string v0, "\n"

    invoke-virtual {v9, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v12

    .line 422
    if-ltz v10, :cond_0

    if-ltz v11, :cond_0

    if-ltz v12, :cond_0

    .line 423
    new-instance v13, Landroid/text/SpannableStringBuilder;

    invoke-direct {v13, v9}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 424
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    const/16 v1, 0xf

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    const/16 v1, 0x21

    invoke-virtual {v13, v0, v10, v11, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 425
    const-string v0, "%1$s"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v10

    invoke-virtual {v13, v10, v0}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 426
    invoke-virtual {v13}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "%2$s"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v11

    .line 427
    const-string v0, "%2$s"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v11

    invoke-virtual {v13, v11, v0}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 428
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mTopViewTipTv:Landroid/widget/TextView;

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 429
    goto :goto_0

    .line 430
    :cond_0
    if-ltz v10, :cond_1

    if-ltz v11, :cond_1

    .line 431
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mTopViewTipTv:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_bind_top_view_tip:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, ""

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-string v4, ""

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 433
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mTopViewTipTv:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 436
    :goto_0
    return-void
.end method

.method private showBindOtherDeviceDialog(Landroid/content/Context;)V
    .locals 6

    .line 1029
    new-instance v5, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v5, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 1030
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_bind_other_device_message:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindProductName:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    .line 1031
    invoke-virtual {v4}, Lo/afj;->n()Lo/afj$a;

    move-result-object v4

    invoke-virtual {v4}, Lo/afj$a;->e()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 1030
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    .line 1032
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_hwh_open_service_pop_up_notification_note:I

    invoke-virtual {v5, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 1033
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_bind_other_device_relieved:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$14;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$14;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    invoke-virtual {v5, v0, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 1039
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$15;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$15;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    invoke-virtual {v5, v0, v1}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 1044
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->bindOtherDialog:Lo/egv;

    .line 1045
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->bindOtherDialog:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 1046
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->bindOtherDialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1047
    return-void
.end method

.method private showOuthDialog()V
    .locals 4

    .line 772
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->dialog:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->dialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 773
    return-void

    .line 776
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_user_permission_ok:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    .line 777
    new-instance v3, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v3, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 779
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_user_permission_dialog_message:I

    invoke-virtual {v3, v0}, Lo/egv$b;->e(I)Lo/egv$b;

    .line 780
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_user_permission_dialog_title:I

    invoke-virtual {v3, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 781
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$5;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    invoke-virtual {v3, v2, v0}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 787
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$6;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$6;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    invoke-virtual {v3, v0, v1}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 792
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->dialog:Lo/egv;

    .line 793
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->dialog:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 794
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->dialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 795
    return-void
.end method

.method private showUnBindFail()V
    .locals 2

    .line 933
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_update_server_bussy:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 934
    return-void
.end method

.method private showUnbindDialog()V
    .locals 4

    .line 1088
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUnbindDialog:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUnbindDialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1089
    return-void

    .line 1091
    :cond_0
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_hw_health_wear_connect_device_unpair_button:I

    .line 1092
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_unbind_device_wear_home:I

    .line 1093
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_hw_health_wear_connect_device_unpair_button:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$17;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$17;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    .line 1094
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$16;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$16;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    .line 1103
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 1110
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUnbindDialog:Lo/egv;

    .line 1111
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUnbindDialog:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 1112
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mUnbindDialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1113
    return-void
.end method

.method private showWiFiEnableDialog(Landroid/content/Context;)V
    .locals 4

    .line 997
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->wifiDialog:Lo/egy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->wifiDialog:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 998
    return-void

    .line 1000
    :cond_0
    new-instance v3, Lo/egy$b;

    invoke-direct {v3, p1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 1001
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_open_wifi_tip_msg:I

    invoke-virtual {v3, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$13;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$13;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    .line 1002
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_common_enable_button:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$12;

    invoke-direct {v2, p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$12;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;Landroid/content/Context;)V

    .line 1008
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 1020
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->wifiDialog:Lo/egy;

    .line 1021
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->wifiDialog:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 1022
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->wifiDialog:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 1023
    return-void
.end method

.method private unBindLocalDevice()V
    .locals 6

    .line 936
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBindOtherDevice:Z

    if-eqz v0, :cond_0

    .line 937
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " unBindLocalDevice otherDevice mBindProductId::"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindProductId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 938
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mBindProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->i(Ljava/lang/String;)Z

    .line 939
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBindOtherDevice:Z

    .line 940
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->showOuthDialog()V

    goto/16 :goto_0

    .line 942
    :cond_0
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " unBindLocalDevice currentDevice mBindProductId::"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 943
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->i(Ljava/lang/String;)Z

    .line 944
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 945
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 946
    const/4 v0, 0x2

    iput v0, v5, Landroid/os/Message;->what:I

    .line 947
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;

    invoke-virtual {v0, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 949
    :cond_1
    sget-object v0, Lo/ahw;->e:Lo/ahw;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ahw;->b(Ljava/lang/String;)V

    .line 951
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pressure_calibrate_hrv_userinfo_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 954
    :goto_0
    return-void
.end method

.method private updataProduct(Lo/afj;)V
    .locals 4

    .line 206
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBind:Z

    if-eqz v0, :cond_0

    .line 207
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "this is bind status,not updata view"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 208
    return-void

    .line 210
    :cond_0
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductInfo:Lo/afj;

    .line 211
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isDownResoure:Z

    .line 212
    iget-object v0, p1, Lo/afj;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 213
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updataProduct.descriptions.size() is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 214
    return-void

    .line 216
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->loadAnimation()V

    .line 217
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->initNavigation()V

    .line 218
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->initViewAdapter()V

    .line 219
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->setBuyButton()V

    .line 220
    return-void
.end method


# virtual methods
.method public onBackPressed()Z
    .locals 1

    .line 1116
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBind:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBindComeInThePage:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    if-eqz v0, :cond_1

    .line 1117
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 1119
    :cond_1
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onBackPressed()Z

    move-result v0

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 677
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick ID"

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

    .line 678
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_network_setting_layout:I

    if-ne v0, v1, :cond_0

    .line 679
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/ajw;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_11

    .line 680
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akf;->b(Landroid/content/Context;)V

    goto/16 :goto_1

    .line 682
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_buy_btn:I

    if-ne v0, v1, :cond_1

    .line 683
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->onClickBuyButton()V

    goto/16 :goto_1

    .line 684
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_bind_measure:I

    if-ne v0, v1, :cond_2

    .line 685
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->gotoMeasure()V

    goto/16 :goto_1

    .line 686
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_bind_btn:I

    if-ne v0, v1, :cond_3

    .line 687
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClick isBind:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBind:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 688
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->getBindOtherDevice()V

    goto/16 :goto_1

    .line 689
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_unbind_btn:I

    if-ne v0, v1, :cond_4

    .line 690
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClick unbind_btn isBind:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBind:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 691
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->showUnbindDialog()V

    goto/16 :goto_1

    .line 692
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_claim_data_button:I

    if-ne v0, v1, :cond_5

    .line 693
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 694
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    const-string v1, "com.huawei.ui.main.stories.health.activity.healthdata.ClaimMeasureDataActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 695
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 696
    goto/16 :goto_1

    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_upgrade_button:I

    if-ne v0, v1, :cond_a

    .line 697
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick upgrade_button"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 698
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mWiFiDevice:Lo/aja;

    if-nez v0, :cond_6

    .line 699
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick upgrade_button mWiFiDevice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 700
    return-void

    .line 702
    :cond_6
    invoke-static {}, Lo/ahs;->e()Lo/ahs;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mWiFiDevice:Lo/aja;

    invoke-virtual {v1}, Lo/aja;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ahs;->f(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    .line 703
    const/4 v5, 0x0

    .line 704
    if-eqz v4, :cond_7

    .line 705
    const-string v0, "status"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 707
    :cond_7
    const-string v0, "2"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "3"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 708
    :cond_8
    new-instance v6, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;

    invoke-direct {v6}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;-><init>()V

    .line 709
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 710
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 711
    const-string v0, "fromProductView"

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 712
    const-string v0, "version"

    const-string v1, "fwNewVer"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 713
    const-string v0, "cer_version"

    const-string v1, "fwCurVer"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 714
    const-string v0, "update_nodes"

    const-string v1, "releaseNote"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 715
    invoke-virtual {v6, v7}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->setArguments(Landroid/os/Bundle;)V

    .line 716
    invoke-virtual {p0, v6}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 717
    goto :goto_0

    .line 718
    :cond_9
    invoke-static {}, Lo/ahs;->e()Lo/ahs;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mWiFiDevice:Lo/aja;

    invoke-virtual {v1}, Lo/aja;->g()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ahs;->c(Ljava/lang/String;Z)V

    .line 719
    new-instance v6, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-direct {v6}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;-><init>()V

    .line 720
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 721
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 722
    const-string v0, "fromProductView"

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 723
    invoke-virtual {v6, v7}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->setArguments(Landroid/os/Bundle;)V

    .line 724
    invoke-virtual {p0, v6}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 726
    :goto_0
    goto/16 :goto_1

    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_restore_factory_button:I

    if-ne v0, v1, :cond_b

    .line 727
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 728
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_bluetooth_open:I

    invoke-virtual {v4, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 729
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_factory_data_reset_msg:I

    invoke-virtual {v4, v0}, Lo/egv$b;->e(I)Lo/egv$b;

    .line 730
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_ok:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$3;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    invoke-virtual {v4, v0, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 739
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$4;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    invoke-virtual {v4, v0, v1}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 746
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mCancelDataDialog:Lo/egv;

    .line 747
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mCancelDataDialog:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 748
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mCancelDataDialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 749
    goto/16 :goto_1

    :cond_b
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_user_guide_button:I

    if-ne v0, v1, :cond_f

    .line 750
    const-string v0, "a8ba095d-4123-43c4-a30a-0240011c58de"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 751
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/dbf;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 752
    const-string v0, "https://resourcephs1.vmall.com/AH110/EMUI9.0/C001B001/zh-CN/index.html"

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->openAppHelpActivity(Ljava/lang/String;)V

    goto :goto_1

    .line 754
    :cond_c
    const-string v0, "https://resourcephs2.vmall.com/handbook/AH110/EMUI9.0/C001B001/en-US/index.html"

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->openAppHelpActivity(Ljava/lang/String;)V

    goto :goto_1

    .line 756
    :cond_d
    const-string v0, "e4b0b1d5-2003-4d88-8b5f-c4f64542040b"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 757
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/dbf;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 758
    const-string v0, "https://resourcephs1.vmall.com/CH19/EMUI9.0/C001B001/zh-CN/index.html"

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->openAppHelpActivity(Ljava/lang/String;)V

    goto :goto_1

    .line 760
    :cond_e
    const-string v0, "https://resourcephs2.vmall.com/handbook/CH19/EMUI9.0/C001B001/en-US/index.html"

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->openAppHelpActivity(Ljava/lang/String;)V

    goto :goto_1

    .line 763
    :cond_f
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_user_clear_button:I

    if-ne v0, v1, :cond_10

    .line 765
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->gotoScaleManagerFragment()V

    goto :goto_1

    .line 767
    :cond_10
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick view id is other "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 769
    :cond_11
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 223
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 224
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;

    .line 225
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->interactors:Lo/dnm;

    .line 226
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$ResoureDownCallBack;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$ResoureDownCallBack;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    invoke-virtual {v0, v1}, Lo/afq;->a(Lo/aff;)V

    .line 227
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 240
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 241
    sget v0, Lcom/huawei/plugindevice/R$layout;->wifi_product_introduction_layout:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    .line 242
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 243
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->initView()V

    .line 244
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->initData()V

    .line 245
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->initViewData()V

    .line 246
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->initListener()V

    .line 247
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 248
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->child:Landroid/view/View;

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 250
    :cond_0
    return-object v4
.end method

.method public onDestroy()V
    .locals 2

    .line 582
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 583
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 584
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 585
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;

    .line 587
    :cond_0
    return-void
.end method

.method public onDestroyView()V
    .locals 4

    .line 572
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroyView()V

    .line 573
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->d()V

    .line 574
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBind:Z

    if-eqz v0, :cond_0

    .line 575
    sget-object v0, Lo/ahw;->e:Lo/ahw;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ahw;->b(Ljava/lang/String;)V

    .line 577
    :cond_0
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroyView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 578
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 302
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onResume()V

    .line 304
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->reFreshDevData()V

    .line 305
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;->sendEmptyMessage(I)Z

    .line 306
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBind:Z

    if-eqz v0, :cond_0

    .line 307
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume is bind "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 308
    sget-object v0, Lo/ahw;->e:Lo/ahw;

    invoke-virtual {v0}, Lo/ahw;->f()V

    .line 309
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBindComeInThePage:Z

    goto :goto_0

    .line 311
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isBindComeInThePage:Z

    .line 313
    :goto_0
    return-void
.end method
