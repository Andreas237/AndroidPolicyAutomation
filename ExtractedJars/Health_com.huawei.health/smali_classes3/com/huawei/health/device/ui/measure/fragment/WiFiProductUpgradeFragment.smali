.class public Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;
    }
.end annotation


# static fields
.field private static final MSG_CHECKING_VERSION:I = 0xa

.field private static final MSG_EXIST_NEW_VERSION:I = 0x3

.field private static final MSG_GET_VERSION_FAIL:I = 0x2

.field private static final MSG_GET_VERSION_SUCCESS:I = 0x1

.field private static final MSG_NOT_EXIST_DEVICE:I = 0x4

.field private static final TAG:Ljava/lang/String; = "WiFiProductUpgradeFragment"


# instance fields
.field private isFromProductView:Z

.field private mCheckVersionUpdate:Lo/egd;

.field private mHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;

.field private mIsExistNewVer:Z

.field private mLatestVersionLayout:Landroid/widget/LinearLayout;

.field private mNewVer:Ljava/lang/String;

.field private mNewVersionTV:Landroid/widget/TextView;

.field private mNoNewVersionTV:Landroid/widget/TextView;

.field private mNowVersion:Ljava/lang/String;

.field private mNowVersionTV:Landroid/widget/TextView;

.field private mProductId:Ljava/lang/String;

.field private mReleaseNote:Ljava/lang/String;

.field private mRoundProgress:Lo/ahc;

.field private mVersionLogo:Landroid/widget/ImageView;

.field private mWiFiDevice:Lo/aja;

.field private positiveListener:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 53
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mProductId:Ljava/lang/String;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNewVer:Ljava/lang/String;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNowVersionTV:Landroid/widget/TextView;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNoNewVersionTV:Landroid/widget/TextView;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNewVersionTV:Landroid/widget/TextView;

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mLatestVersionLayout:Landroid/widget/LinearLayout;

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNowVersion:Ljava/lang/String;

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mReleaseNote:Ljava/lang/String;

    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mRoundProgress:Lo/ahc;

    .line 76
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mCheckVersionUpdate:Lo/egd;

    .line 77
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mWiFiDevice:Lo/aja;

    .line 79
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mIsExistNewVer:Z

    .line 80
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->isFromProductView:Z

    .line 147
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->positiveListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Ljava/lang/Class;)Landroid/support/v4/app/Fragment;
    .locals 1

    .line 53
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->getSelectFragment(Ljava/lang/Class;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Landroid/widget/TextView;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNowVersionTV:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;
    .locals 1

    .line 53
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->getDevId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1200(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Lo/ahc;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mRoundProgress:Lo/ahc;

    return-object v0
.end method

.method static synthetic access$1300(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;I)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->setCheckVersionUpdateEnable(I)V

    return-void
.end method

.method static synthetic access$1400(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Landroid/widget/TextView;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNewVersionTV:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$1500(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Z)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->showLatestVersionLayout(Z)V

    return-void
.end method

.method static synthetic access$1602(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Z)Z
    .locals 0

    .line 53
    iput-boolean p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mIsExistNewVer:Z

    return p1
.end method

.method static synthetic access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->showNoDeviceDialog()V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Z
    .locals 1

    .line 53
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->isFromProductView:Z

    return v0
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Ljava/util/ArrayList;Ljava/lang/String;)Lo/afk;
    .locals 1

    .line 53
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->switchProductGroupItem(Ljava/util/ArrayList;Ljava/lang/String;)Lo/afk;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Landroid/app/Activity;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 53
    invoke-virtual {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNewVer:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$602(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNewVer:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNowVersion:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$702(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNowVersion:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mReleaseNote:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$802(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mReleaseNote:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Z
    .locals 1

    .line 53
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->isDestroy()Z

    move-result v0

    return v0
.end method

.method private checkDevice()V
    .locals 5

    .line 115
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mWiFiDevice:Lo/aja;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 116
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDevice() mWiFiDevice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 117
    return-void

    .line 119
    :cond_0
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;-><init>()V

    .line 120
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mWiFiDevice:Lo/aja;

    iget-object v0, v0, Lo/aja;->c:Lo/aja$a;

    iget-object v0, v0, Lo/aja$a;->e:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;->setDevId(Ljava/lang/String;)V

    .line 121
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)V

    invoke-virtual {v0, v4, v1}, Lo/czg;->b(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;Lo/cyx;)V

    .line 145
    return-void
.end method

.method private detectionExistNewVersion()V
    .locals 3

    .line 224
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mRoundProgress:Lo/ahc;

    invoke-virtual {v0}, Lo/ahc;->c()V

    .line 225
    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->setCheckVersionUpdateEnable(I)V

    .line 226
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/ajw;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 227
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 228
    const/4 v0, 0x2

    iput v0, v2, Landroid/os/Message;->what:I

    .line 229
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;

    invoke-virtual {v0, v2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;->sendMessage(Landroid/os/Message;)Z

    .line 230
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_not_network:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 231
    return-void

    .line 233
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->getDeviceStatus()V

    .line 234
    return-void
.end method

.method private getDevId()Ljava/lang/String;
    .locals 4

    .line 241
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mWiFiDevice:Lo/aja;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mWiFiDevice:Lo/aja;

    iget-object v0, v0, Lo/aja;->c:Lo/aja$a;

    if-eqz v0, :cond_0

    .line 242
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device info: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mWiFiDevice:Lo/aja;

    iget-object v3, v3, Lo/aja;->c:Lo/aja$a;

    invoke-virtual {v3}, Lo/aja$a;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 243
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mWiFiDevice:Lo/aja;

    iget-object v0, v0, Lo/aja;->c:Lo/aja$a;

    iget-object v0, v0, Lo/aja$a;->e:Ljava/lang/String;

    return-object v0

    .line 245
    :cond_0
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device id is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 246
    const/4 v0, 0x0

    return-object v0
.end method

.method private getDeviceStatus()V
    .locals 3

    .line 261
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->showLatestVersionLayout(Z)V

    .line 262
    new-instance v2, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;

    invoke-direct {v2}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;-><init>()V

    .line 263
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->getDevId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;->setDevId(Ljava/lang/String;)V

    .line 264
    const-string v0, "devOtaInfo"

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;->setSid(Ljava/lang/String;)V

    .line 265
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$3;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)V

    invoke-virtual {v0, v2, v1}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;Lo/cyx;)V

    .line 312
    return-void
.end method

.method private initData()V
    .locals 5

    .line 188
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;

    .line 189
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mProductId:Ljava/lang/String;

    .line 190
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 191
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    check-cast v0, Lo/aja;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mWiFiDevice:Lo/aja;

    goto :goto_0

    .line 193
    :cond_0
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "productId is empty, can\'t get WiFiDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 195
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mWiFiDevice:Lo/aja;

    if-nez v0, :cond_1

    .line 196
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wifi device is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 197
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;->sendEmptyMessage(I)Z

    .line 199
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "fromProductView"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->isFromProductView:Z

    .line 200
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mIsExistNewVer:Z

    if-eqz v0, :cond_2

    .line 201
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->checkDevice()V

    .line 202
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mProductId:Ljava/lang/String;

    .line 203
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "version"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNewVer:Ljava/lang/String;

    .line 204
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "cer_version"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNowVersion:Ljava/lang/String;

    .line 205
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "update_nodes"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mReleaseNote:Ljava/lang/String;

    .line 206
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 207
    const/4 v0, 0x3

    iput v0, v4, Landroid/os/Message;->what:I

    .line 208
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;

    invoke-virtual {v0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$WifiHandler;->sendMessage(Landroid/os/Message;)Z

    .line 209
    goto :goto_1

    .line 211
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->detectionExistNewVersion()V

    .line 213
    :goto_1
    const-string v0, "a8ba095d-4123-43c4-a30a-0240011c58de"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 214
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mVersionLogo:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->wifi_device_honor_ota_logo:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 216
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/aki;->b(Landroid/content/Context;)Lo/aki;

    move-result-object v0

    invoke-virtual {v0}, Lo/aki;->c()V

    .line 217
    return-void
.end method

.method private initView()V
    .locals 2

    .line 95
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_ota_update_band_update:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->setTitle(Ljava/lang/String;)V

    .line 97
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->now_version_nodes_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNowVersionTV:Landroid/widget/TextView;

    .line 98
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->no_new_version_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNoNewVersionTV:Landroid/widget/TextView;

    .line 99
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->new_version_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNewVersionTV:Landroid/widget/TextView;

    .line 100
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->latest_version_button:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mLatestVersionLayout:Landroid/widget/LinearLayout;

    .line 101
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->version_update_anim:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ahc;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mRoundProgress:Lo/ahc;

    .line 102
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->check_version_update:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mCheckVersionUpdate:Lo/egd;

    .line 103
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->image_logo:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mVersionLogo:Landroid/widget/ImageView;

    .line 105
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mLatestVersionLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mCheckVersionUpdate:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 107
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mIsExistNewVer:Z

    if-eqz v0, :cond_0

    .line 108
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->showLatestVersionLayout(Z)V

    goto :goto_0

    .line 110
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->showLatestVersionLayout(Z)V

    .line 112
    :goto_0
    return-void
.end method

.method private isDestroy()Z
    .locals 5

    .line 319
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    .line 320
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 321
    :cond_0
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity is Destroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 322
    const/4 v0, 0x1

    return v0

    .line 324
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private setCheckVersionUpdateEnable(I)V
    .locals 4

    .line 363
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 365
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mCheckVersionUpdate:Lo/egd;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 366
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mCheckVersionUpdate:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 367
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mCheckVersionUpdate:Lo/egd;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_ota_update_button_check_version:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 368
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNoNewVersionTV:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_ota_update_state_checking:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 369
    goto :goto_1

    .line 371
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mCheckVersionUpdate:Lo/egd;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 372
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mCheckVersionUpdate:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 373
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mCheckVersionUpdate:Lo/egd;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_manager_update_health:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 374
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNoNewVersionTV:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_ota_update_state_check_new_version:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 375
    goto :goto_1

    .line 377
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mCheckVersionUpdate:Lo/egd;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 378
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mCheckVersionUpdate:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 379
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNoNewVersionTV:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_ota_check_fail:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 380
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mCheckVersionUpdate:Lo/egd;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_retry:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 381
    goto :goto_1

    .line 383
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mCheckVersionUpdate:Lo/egd;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 384
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mCheckVersionUpdate:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 385
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNoNewVersionTV:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_hwh_me_settings_app_update:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 386
    goto :goto_1

    .line 388
    :goto_0
    :pswitch_4
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 391
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mCheckVersionUpdate:Lo/egd;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setTag(Ljava/lang/Object;)V

    .line 392
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method private showLatestVersionLayout(Z)V
    .locals 2

    .line 254
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mLatestVersionLayout:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 255
    return-void
.end method

.method private showNoDeviceDialog()V
    .locals 4

    .line 184
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mainActivity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mWiFiDevice:Lo/aja;

    const/4 v2, 0x0

    if-ne v2, v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mWiFiDevice:Lo/aja;

    invoke-virtual {v1}, Lo/aja;->g()Ljava/lang/String;

    move-result-object v1

    :goto_0
    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->positiveListener:Landroid/view/View$OnClickListener;

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->positiveListener:Landroid/view/View$OnClickListener;

    invoke-static {v0, v1, v2, v3}, Lo/ahu;->d(Landroid/content/Context;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    .line 185
    return-void
.end method

.method private switchProductGroupItem(Ljava/util/ArrayList;Ljava/lang/String;)Lo/afk;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/afk;>;Ljava/lang/String;)Lo/afk;"
        }
    .end annotation

    .line 173
    const/4 v4, 0x0

    .line 174
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

    .line 175
    const-string v0, "WiFiProductUpgradeFragment"

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

    .line 176
    iget-object v0, v6, Lo/afk;->b:Lo/acl$a;

    invoke-virtual {v0}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 177
    move-object v4, v6

    .line 179
    :cond_0
    goto :goto_0

    .line 180
    :cond_1
    return-object v4
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 329
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->latest_version_button:I

    if-ne v0, v1, :cond_0

    .line 330
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;-><init>()V

    .line 331
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 332
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    const-string v0, "version"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNewVer:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    const-string v0, "cer_version"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNowVersion:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    const-string v0, "update_nodes"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mReleaseNote:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    const-string v0, "show_update"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 337
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->setArguments(Landroid/os/Bundle;)V

    .line 338
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 339
    goto/16 :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->check_version_update:I

    if-ne v0, v1, :cond_3

    .line 340
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "check version update tag: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 341
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x3

    if-eq v1, v0, :cond_2

    .line 342
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->detectionExistNewVersion()V

    goto :goto_0

    .line 344
    :cond_2
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;-><init>()V

    .line 345
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 346
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    const-string v0, "version"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNewVer:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    const-string v0, "cer_version"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mNowVersion:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    const-string v0, "update_nodes"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mReleaseNote:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->setArguments(Landroid/os/Bundle;)V

    .line 351
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 352
    goto :goto_0

    .line 354
    :cond_3
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "--------no click------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 356
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 82
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 83
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreateView child: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->child:Landroid/view/View;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 84
    sget v0, Lcom/huawei/plugindevice/R$layout;->wifi_upgrade_layout:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->child:Landroid/view/View;

    .line 85
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "is_exist_new_version"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->mIsExistNewVer:Z

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->initView()V

    .line 87
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->initData()V

    .line 88
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 89
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->child:Landroid/view/View;

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 91
    :cond_0
    return-object v4
.end method
