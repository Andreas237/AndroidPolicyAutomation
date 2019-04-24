.class public Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;
    }
.end annotation


# static fields
.field public static final BIND_RESULT_REQUESTCODE:I = 0x3e8

.field private static final GET_WIFI_LIST_MSG:I = 0x3e9

.field private static final PERMISSIONS:[Ljava/lang/String;

.field private static final SCAN_INTERVAL_TIME:I = 0x1388

.field private static final SCAN_WIFI_LIST_MSG:I = 0x3ea

.field private static final TAG:Ljava/lang/String; = "WiFiInfoConfirmFragment"

.field private static final UPDATE_WIFI_LIST_MSG:I = 0x3e8

.field private static final WIFI_CONNECT_FAILURE_MSG:I = 0x3ec

.field private static final WIFI_CONNECT_SUCCESS_MSG:I = 0x3eb

.field private static final WIFI_INFO_REFRESH_MSG:I = 0x3ed

.field private static final WIFI_REFRESH_DELAY_TIME:I = 0x1f4


# instance fields
.field private is2_4GWifi:Z

.field private isOpenWifi:Z

.field private isPasswordHide:Z

.field private isShowLrcCache:Z

.field private mBackArrowImg:Landroid/widget/ImageView;

.field private mBackLayout:Landroid/widget/LinearLayout;

.field private mBackStepTv:Landroid/widget/TextView;

.field private mBuilder:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

.field private mConfigMode:I

.field private mConnUtils:Lo/ajy;

.field private mConncecback:Lo/aje;

.field private mDefaultSsid:Ljava/lang/String;

.field private mGpsDialog:Lo/egy;

.field private mLoadingBar:Lhuawei/widget/HwProgressBar;

.field private mNextArrowImg:Landroid/widget/ImageView;

.field private mNextLayout:Landroid/widget/LinearLayout;

.field private mNextStepTv:Landroid/widget/TextView;

.field private mPasswordSwitchBtn:Landroid/widget/ImageButton;

.field private mProductId:Ljava/lang/String;

.field private mProductInfo:Lo/afj;

.field private mPwdMode:I

.field private mReceiver:Landroid/content/BroadcastReceiver;

.field private mScanResult:Landroid/net/wifi/ScanResult;

.field private mShowWifiBtn:Landroid/widget/ImageButton;

.field private mShowWifiList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/net/wifi/ScanResult;>;"
        }
    .end annotation
.end field

.field private mStorageWifiList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/net/wifi/ScanResult;>;"
        }
    .end annotation
.end field

.field private mWifiConnectLayout:Landroid/widget/LinearLayout;

.field private mWifiErrorTv:Landroid/widget/TextView;

.field private mWifiFailMsg:Landroid/widget/TextView;

.field private mWifiFailTitle:Landroid/widget/TextView;

.field private mWifiListAdapter:Lo/agw;

.field private mWifiListDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

.field private mWifiListView:Landroid/widget/ListView;

.field private mWifiLrcCache:Lo/akd;

.field private mWifiNameTv:Landroid/widget/TextView;

.field private mWifiPasswordEdit:Landroid/widget/EditText;

.field private mWifiPasswordLayout:Landroid/widget/LinearLayout;

.field private mWifiPasswordLine:Landroid/view/View;

.field private mWifiPd:Ljava/lang/String;

.field private mWifiPromptTv:Landroid/widget/TextView;

.field private mWifiSelectorLayout:Landroid/widget/LinearLayout;

.field private mWifiShowLayout:Landroid/widget/LinearLayout;

.field private mWifiSsid:Ljava/lang/String;

.field private myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 102
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->PERMISSIONS:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 91
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 128
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mShowWifiList:Ljava/util/List;

    .line 129
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mStorageWifiList:Ljava/util/List;

    .line 130
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isPasswordHide:Z

    .line 134
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiSsid:Ljava/lang/String;

    .line 135
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPd:Ljava/lang/String;

    .line 136
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mPwdMode:I

    .line 137
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mProductId:Ljava/lang/String;

    .line 138
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mDefaultSsid:Ljava/lang/String;

    .line 139
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mConfigMode:I

    .line 141
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isShowLrcCache:Z

    .line 142
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->is2_4GWifi:Z

    .line 143
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isOpenWifi:Z

    .line 707
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$5;

    invoke-direct {v0, p0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$5;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mConncecback:Lo/aje;

    .line 971
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$11;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$11;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mReceiver:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Z
    .locals 1

    .line 91
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isDestroy()Z

    move-result v0

    return v0
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->refreshView()V

    return-void
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->goToNextView()V

    return-void
.end method

.method static synthetic access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->setConnectFailMsg()V

    return-void
.end method

.method static synthetic access$1200(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->checkWifiInfoContent()V

    return-void
.end method

.method static synthetic access$1300(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Ljava/util/List;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mShowWifiList:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$1400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/net/wifi/ScanResult;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mScanResult:Landroid/net/wifi/ScanResult;

    return-object v0
.end method

.method static synthetic access$1402(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;Landroid/net/wifi/ScanResult;)Landroid/net/wifi/ScanResult;
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mScanResult:Landroid/net/wifi/ScanResult;

    return-object p1
.end method

.method static synthetic access$1500(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Lo/agw;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListAdapter:Lo/agw;

    return-object v0
.end method

.method static synthetic access$1600(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiSsid:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1602(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiSsid:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/widget/TextView;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiNameTv:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$1800(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/widget/EditText;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic access$1900(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;Landroid/net/wifi/ScanResult;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->checkWifiLegal(Landroid/net/wifi/ScanResult;)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->getWifiListInfo()V

    return-void
.end method

.method static synthetic access$2000(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;Z)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->checkWifiOpenMode(Z)V

    return-void
.end method

.method static synthetic access$2102(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPd:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$2202(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;I)I
    .locals 0

    .line 91
    iput p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mPwdMode:I

    return p1
.end method

.method static synthetic access$2300(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    return-object v0
.end method

.method static synthetic access$2400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Ljava/util/List;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mStorageWifiList:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$2500(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/app/Activity;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$2600(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/app/Activity;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$2700(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/app/Activity;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$2800(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/app/Activity;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$2900(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/app/Activity;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/app/Activity;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$3000(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->goBackPressed()V

    return-void
.end method

.method static synthetic access$3100(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/app/Activity;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->refreshWifiInfo()V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/widget/TextView;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiFailTitle:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/widget/TextView;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiFailMsg:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/app/Activity;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/widget/TextView;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPromptTv:Landroid/widget/TextView;

    return-object v0
.end method

.method private calculateDialogHeight()I
    .locals 8

    .line 510
    const/4 v2, 0x0

    .line 511
    const/4 v3, 0x0

    .line 512
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListView:Landroid/widget/ListView;

    invoke-static {v0}, Lo/ahf;->a(Landroid/widget/ListView;)I

    move-result v4

    .line 513
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/WindowManager;

    .line 514
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v6

    .line 515
    invoke-virtual {v6}, Landroid/view/Display;->getHeight()I

    move-result v0

    div-int/lit8 v7, v0, 0x2

    .line 516
    if-ge v4, v7, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v7

    .line 517
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mShowWifiList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    add-int v3, v2, v0

    .line 518
    return v3
.end method

.method private checkHavePermission()V
    .locals 5

    .line 907
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    .line 909
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    sget-object v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->PERMISSIONS:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 910
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    .line 911
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkHavePermission checkWifiStatus localion_permission "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 912
    if-nez v4, :cond_0

    .line 913
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_hwh_motiontrack_permission_guide_location:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$9;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$9;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    invoke-static {v0, v1, v2}, Lo/ajw;->b(Landroid/content/Context;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    .line 921
    :cond_0
    return-void

    .line 924
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    sget-object v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->PERMISSIONS:[Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->checkHavePermission(Landroid/app/Activity;[Ljava/lang/String;)V

    .line 925
    return-void
.end method

.method private checkHavePermission(Landroid/app/Activity;[Ljava/lang/String;)V
    .locals 8

    .line 931
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkHavePermission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 932
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 933
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkHavePermission SDK_INT "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 934
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;

    const/16 v1, 0x3ea

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;->sendEmptyMessage(I)Z

    .line 935
    return-void

    .line 937
    :cond_0
    invoke-static {p1, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 938
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkHavePermission isHasPermissions false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 939
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$10;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$10;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    invoke-static {p1, p2, v0}, Lo/dbe;->a(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    .line 950
    move-object v4, p2

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    aget-object v7, v4, v6

    .line 951
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 952
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p1, v0}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 950
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    goto :goto_1

    .line 956
    :cond_3
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkHavePermission isHasPermissions true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 957
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;

    const/16 v1, 0x3ea

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;->sendEmptyMessage(I)Z

    .line 959
    :goto_1
    return-void
.end method

.method private checkWifiInfoContent()V
    .locals 6

    .line 574
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkWifiInfoContent()...isOpenWifi = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isOpenWifi:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 575
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiNameTv:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    .line 576
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 578
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isOpenWifi:Z

    if-eqz v0, :cond_1

    .line 579
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mDefaultSsid:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 580
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isClickNextStep(Z)Z

    goto :goto_0

    .line 582
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isClickNextStep(Z)Z

    goto :goto_0

    .line 585
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mDefaultSsid:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 586
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isClickNextStep(Z)Z

    goto :goto_0

    .line 588
    :cond_2
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isClickNextStep(Z)Z

    .line 591
    :goto_0
    invoke-direct {p0, v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->setWifiInfoProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 592
    return-void
.end method

.method private checkWifiLegal(Landroid/net/wifi/ScanResult;)V
    .locals 1

    .line 532
    if-eqz p1, :cond_0

    .line 533
    invoke-static {p1}, Lo/akf;->d(Landroid/net/wifi/ScanResult;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->is2_4GWifi:Z

    goto :goto_0

    .line 535
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akf;->c(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->is2_4GWifi:Z

    .line 537
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->is2_4GWifi:Z

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->showWifiErrorView(Z)V

    .line 538
    return-void
.end method

.method private checkWifiOpenMode(Z)V
    .locals 4

    .line 611
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkWifiOpenMode()...isOpen = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 612
    iput-boolean p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isOpenWifi:Z

    .line 613
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isOpenWifi:Z

    if-eqz v0, :cond_0

    .line 614
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 615
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordLine:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 616
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPromptTv:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 618
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 619
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordLine:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 620
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPromptTv:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 622
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->checkWifiInfoContent()V

    .line 623
    return-void
.end method

.method private clearData()V
    .locals 2

    .line 851
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;

    if-eqz v0, :cond_0

    .line 852
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 854
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mGpsDialog:Lo/egy;

    if-eqz v0, :cond_1

    .line 855
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mGpsDialog:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 856
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mGpsDialog:Lo/egy;

    .line 858
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    if-eqz v0, :cond_2

    .line 859
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->dismiss()V

    .line 860
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 862
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiLrcCache:Lo/akd;

    if-eqz v0, :cond_3

    .line 863
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiLrcCache:Lo/akd;

    .line 865
    :cond_3
    return-void
.end method

.method private connectNewWifi()V
    .locals 6

    .line 697
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connectNewWifi()..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 698
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->handleWifiConnecting(Z)V

    .line 699
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mScanResult:Landroid/net/wifi/ScanResult;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 700
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mConnUtils:Lo/ajy;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mScanResult:Landroid/net/wifi/ScanResult;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPd:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mConncecback:Lo/aje;

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/ajy;->c(Landroid/net/wifi/ScanResult;Ljava/lang/String;ZLo/ajj;)V

    goto :goto_0

    .line 701
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiSsid:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 702
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiSsid:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0, v1}, Lo/akf;->e(Ljava/lang/String;Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mPwdMode:I

    .line 703
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mConnUtils:Lo/ajy;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiSsid:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPd:Ljava/lang/String;

    iget v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mPwdMode:I

    iget-object v5, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mConncecback:Lo/aje;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/ajy;->b(Ljava/lang/String;Ljava/lang/String;IZLo/ajj;)V

    .line 705
    :cond_1
    :goto_0
    return-void
.end method

.method private getConnectWifiPosition()I
    .locals 4

    .line 812
    const/4 v1, -0x1

    .line 813
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akf;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 814
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akf;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/akf;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 815
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mStorageWifiList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 816
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mStorageWifiList:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 817
    move v1, v3

    .line 815
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 821
    :cond_1
    return v1
.end method

.method private getWifiListInfo()V
    .locals 4

    .line 787
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWifiListInfo()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 788
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$6;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$6;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 806
    return-void
.end method

.method private goBackPressed()V
    .locals 4

    .line 738
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goBackPressed "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 739
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->onBackPressed()V

    .line 740
    return-void
.end method

.method private goNextStep()V
    .locals 4

    .line 668
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "goNextStep()...is2_4GWifi = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->is2_4GWifi:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 669
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiNameTv:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiSsid:Ljava/lang/String;

    .line 670
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPd:Ljava/lang/String;

    .line 672
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isOpenWifi:Z

    if-eqz v0, :cond_0

    .line 673
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPd:Ljava/lang/String;

    .line 676
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiLrcCache:Lo/akd;

    invoke-virtual {v0}, Lo/akd;->c()V

    .line 677
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiLrcCache:Lo/akd;

    const-string v1, "wifi_ssid_key"

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiSsid:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/akd;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 678
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiLrcCache:Lo/akd;

    const-string v1, "wifi_pwd_key"

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPd:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/akd;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 679
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiLrcCache:Lo/akd;

    const-string v1, "wifi_frequency"

    iget-boolean v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->is2_4GWifi:Z

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/akd;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 680
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiLrcCache:Lo/akd;

    const-string v1, "wifi_security"

    iget-boolean v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isOpenWifi:Z

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/akd;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 684
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akf;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 685
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiSsid:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/akf;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 686
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->connectNewWifi()V

    goto :goto_0

    .line 688
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->goToNextView()V

    goto :goto_0

    .line 691
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->connectNewWifi()V

    .line 693
    :goto_0
    return-void
.end method

.method private goToNextView()V
    .locals 6

    .line 748
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "goToNextView()...mConfigMode == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mConfigMode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 749
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mConfigMode:I

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->setBIWifiDeviceBindType(I)V

    .line 750
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 751
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 752
    const-string v0, "outhName"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiSsid:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 753
    const-string v0, "outhPd"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPd:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 754
    const-string v0, "config_mode"

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mConfigMode:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 755
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->o()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 756
    new-instance v5, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;

    invoke-direct {v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;-><init>()V

    .line 757
    invoke-virtual {v5, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->setArguments(Landroid/os/Bundle;)V

    .line 758
    invoke-virtual {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 759
    goto :goto_0

    .line 760
    :cond_0
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mConfigMode:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 761
    new-instance v5, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-direct {v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;-><init>()V

    .line 762
    invoke-virtual {v5, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->setArguments(Landroid/os/Bundle;)V

    .line 763
    invoke-virtual {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 764
    goto :goto_0

    .line 765
    :cond_1
    new-instance v5, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-direct {v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;-><init>()V

    .line 766
    invoke-virtual {v5, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->setArguments(Landroid/os/Bundle;)V

    .line 767
    invoke-virtual {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 770
    :goto_0
    return-void
.end method

.method private handleWifiConnecting(Z)V
    .locals 2

    .line 727
    if-eqz p1, :cond_0

    .line 728
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiShowLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 729
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiConnectLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 731
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiShowLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 732
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiConnectLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 734
    :goto_0
    return-void
.end method

.method private initData()V
    .locals 5

    .line 246
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 247
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 248
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "config_mode"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mConfigMode:I

    .line 249
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mProductId:Ljava/lang/String;

    .line 251
    :cond_0
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mProductInfo:Lo/afj;

    .line 252
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mProductInfo:Lo/afj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 253
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData mProductInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 254
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->onBackPressed()V

    .line 255
    return-void

    .line 258
    :cond_1
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 259
    const-string v0, "android.net.wifi.STATE_CHANGE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 260
    const-string v0, "android.net.wifi.SCAN_RESULTS"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 261
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v4}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 262
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiLrcCache:Lo/akd;

    if-nez v0, :cond_2

    .line 263
    invoke-static {}, Lo/akd;->b()Lo/akd;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiLrcCache:Lo/akd;

    .line 265
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/ajy;->a(Landroid/content/Context;)Lo/ajy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mConnUtils:Lo/ajy;

    .line 266
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->initWifiInfo()V

    .line 267
    return-void
.end method

.method private initView()V
    .locals 4

    .line 384
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 385
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_show_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiShowLayout:Landroid/widget/LinearLayout;

    .line 386
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_connect_load_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiConnectLayout:Landroid/widget/LinearLayout;

    .line 387
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_name_select_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiSelectorLayout:Landroid/widget/LinearLayout;

    .line 388
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_password_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordLayout:Landroid/widget/LinearLayout;

    .line 389
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_name_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiNameTv:Landroid/widget/TextView;

    .line 390
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_network_error_prompt_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiErrorTv:Landroid/widget/TextView;

    .line 391
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_connect_prompt_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPromptTv:Landroid/widget/TextView;

    .line 392
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_connect_prompt_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiFailTitle:Landroid/widget/TextView;

    .line 393
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_connect_prompt_msg_1:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiFailMsg:Landroid/widget/TextView;

    .line 394
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->back_step_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mBackStepTv:Landroid/widget/TextView;

    .line 395
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->next_step_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mNextStepTv:Landroid/widget/TextView;

    .line 396
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_password_edit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    .line 397
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_password_divide_line:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordLine:Landroid/view/View;

    .line 398
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->show_wifi_list_btn:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mShowWifiBtn:Landroid/widget/ImageButton;

    .line 399
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->password_switch_btn:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mPasswordSwitchBtn:Landroid/widget/ImageButton;

    .line 400
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->back_step_button_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mBackLayout:Landroid/widget/LinearLayout;

    .line 401
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->next_step_button_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mNextLayout:Landroid/widget/LinearLayout;

    .line 402
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->back_step_arrow_img:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mBackArrowImg:Landroid/widget/ImageView;

    .line 403
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->next_step_arrow_img:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mNextArrowImg:Landroid/widget/ImageView;

    .line 405
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_connect_loading_bar:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mLoadingBar:Lhuawei/widget/HwProgressBar;

    .line 406
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mLoadingBar:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 409
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 410
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mBackArrowImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->wifi_device_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 411
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mNextArrowImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->wifi_device_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 412
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mShowWifiBtn:Landroid/widget/ImageButton;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->wifi_device_public_next_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 414
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->initWifiListDialog()V

    .line 416
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setLongClickable(Z)V

    .line 417
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTextIsSelectable(Z)V

    .line 419
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 420
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 436
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 450
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiSelectorLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 451
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mPasswordSwitchBtn:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 452
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mBackLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 453
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mNextLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 454
    return-void
.end method

.method private initWifiForMulticast()V
    .locals 9

    .line 286
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initWifiForMulticast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 287
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiLrcCache:Lo/akd;

    const-string v1, "wifi_ssid_key"

    invoke-virtual {v0, v1}, Lo/akd;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 288
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiLrcCache:Lo/akd;

    const-string v1, "wifi_pwd_key"

    invoke-virtual {v0, v1}, Lo/akd;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 289
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiLrcCache:Lo/akd;

    const-string v1, "wifi_frequency"

    invoke-virtual {v0, v1}, Lo/akd;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    .line 290
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiLrcCache:Lo/akd;

    const-string v1, "wifi_security"

    invoke-virtual {v0, v1}, Lo/akd;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 291
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akf;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 292
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akf;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/akf;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 293
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 294
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 295
    invoke-direct {p0, v4, v5, v6, v7}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->showLrcCacheWifiInfo(Ljava/lang/String;Ljava/lang/String;ZZ)V

    goto :goto_0

    .line 297
    :cond_0
    invoke-direct {p0, v8}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->showConnectedWifiView(Ljava/lang/String;)V

    goto :goto_0

    .line 300
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->showSelectWifiView()V

    .line 302
    :goto_0
    goto :goto_1

    .line 303
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->showSelectWifiView()V

    .line 305
    :goto_1
    return-void
.end method

.method private initWifiForSoftAp()V
    .locals 9

    .line 309
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initWifiForSoftAp()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 310
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiLrcCache:Lo/akd;

    const-string v1, "wifi_ssid_key"

    invoke-virtual {v0, v1}, Lo/akd;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 311
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiLrcCache:Lo/akd;

    const-string v1, "wifi_pwd_key"

    invoke-virtual {v0, v1}, Lo/akd;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 312
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiLrcCache:Lo/akd;

    const-string v1, "wifi_frequency"

    invoke-virtual {v0, v1}, Lo/akd;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    .line 313
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiLrcCache:Lo/akd;

    const-string v1, "wifi_security"

    invoke-virtual {v0, v1}, Lo/akd;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 314
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 315
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akf;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 316
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akf;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/akf;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 317
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 318
    invoke-direct {p0, v8}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->showConnectedWifiView(Ljava/lang/String;)V

    goto :goto_0

    .line 320
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->showSelectWifiView()V

    .line 322
    :goto_0
    goto :goto_1

    .line 323
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->showSelectWifiView()V

    goto :goto_1

    .line 326
    :cond_2
    invoke-direct {p0, v4, v5, v6, v7}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->showLrcCacheWifiInfo(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 328
    :goto_1
    return-void
.end method

.method private initWifiInfo()V
    .locals 4

    .line 271
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initWifiInfo()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 272
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_select_msg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mDefaultSsid:Ljava/lang/String;

    .line 273
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mConfigMode:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 274
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mBackStepTv:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 275
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->initWifiForMulticast()V

    goto :goto_0

    .line 276
    :cond_0
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mConfigMode:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 277
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mBackStepTv:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_startup_last:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 278
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->initWifiForSoftAp()V

    .line 280
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiNameTv:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiSsid:Ljava/lang/String;

    .line 281
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPd:Ljava/lang/String;

    .line 282
    return-void
.end method

.method private initWifiListDialog()V
    .locals 5

    .line 458
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initWifiListDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 459
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$layout;->scan_wifi_list_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 460
    sget v0, Lcom/huawei/plugindevice/R$id;->wifi_list:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListView:Landroid/widget/ListView;

    .line 461
    new-instance v0, Lo/agw;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mShowWifiList:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lo/agw;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListAdapter:Lo/agw;

    .line 462
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListView:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListAdapter:Lo/agw;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 463
    new-instance v0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mBuilder:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 464
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mBuilder:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_select_msg:I

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(I)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    move-result-object v0

    .line 465
    invoke-virtual {v0, v4}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(Landroid/view/View;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$3;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$3;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    .line 466
    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    move-result-object v0

    .line 472
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->b(Z)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 473
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mBuilder:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->e()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 474
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListView:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$4;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 504
    return-void
.end method

.method private isClickNextStep(Z)Z
    .locals 3

    .line 551
    if-eqz p1, :cond_1

    .line 552
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mNextLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 553
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mNextStepTv:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->wifi_device_menu_text_right_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 554
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 555
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mNextArrowImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->wifi_device_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 557
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mNextArrowImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->wifi_device_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 559
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 561
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mNextLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 562
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mNextStepTv:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->common_black_30alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 563
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 564
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mNextArrowImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->wifi_device_arrow_disable_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 566
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mNextArrowImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->wifi_device_arrow_disable_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 568
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method private isDestroy()Z
    .locals 5

    .line 825
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    .line 826
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 827
    :cond_0
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity is Destroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 828
    const/4 v0, 0x1

    return v0

    .line 830
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private refreshView()V
    .locals 4

    .line 523
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshView()..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 524
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mShowWifiList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 525
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mShowWifiList:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mStorageWifiList:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 526
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListAdapter:Lo/agw;

    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->getConnectWifiPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/agw;->e(I)V

    .line 527
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListAdapter:Lo/agw;

    invoke-virtual {v0}, Lo/agw;->notifyDataSetChanged()V

    .line 528
    return-void
.end method

.method private refreshWifiInfo()V
    .locals 5

    .line 361
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshWifiInfo()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 362
    const-string v4, ""

    .line 363
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akf;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 364
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akf;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/akf;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 366
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiNameTv:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mDefaultSsid:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiNameTv:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 367
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiNameTv:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 368
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 369
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->checkWifiLegal(Landroid/net/wifi/ScanResult;)V

    .line 370
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akf;->m(Landroid/content/Context;)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->checkWifiOpenMode(Z)V

    goto :goto_0

    .line 372
    :cond_1
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshWifiInfo() don\'t need to refresh wifi info..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 374
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiNameTv:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    if-eqz v0, :cond_2

    .line 375
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiNameTv:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiSsid:Ljava/lang/String;

    .line 376
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPd:Ljava/lang/String;

    .line 379
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListAdapter:Lo/agw;

    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->getConnectWifiPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/agw;->e(I)V

    .line 380
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListAdapter:Lo/agw;

    invoke-virtual {v0}, Lo/agw;->notifyDataSetChanged()V

    .line 381
    return-void
.end method

.method private setBIWifiDeviceBindType(I)V
    .locals 5

    .line 1021
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1022
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1023
    const-string v0, "type"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1024
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->ge:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1025
    return-void
.end method

.method private setConnectFailClick()V
    .locals 11

    .line 991
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setConnectFailClick()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 992
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 993
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_connect_failure_msg_2:I

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v5, v2, v3

    const-string v3, "%2$s"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, "%3$s"

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 994
    const-string v0, "%2$s"

    invoke-virtual {v6, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    .line 995
    const-string v0, "%3$s"

    invoke-virtual {v6, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    .line 996
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$color;->wifi_device_confirm_wifi_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    .line 997
    new-instance v10, Landroid/text/SpannableStringBuilder;

    invoke-direct {v10, v6}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 998
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v0, v9}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v1, 0x21

    invoke-virtual {v10, v0, v7, v8, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 999
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$12;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$12;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    const/16 v1, 0x21

    invoke-virtual {v10, v0, v7, v8, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 1011
    const-string v0, "%2$s"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v7

    invoke-virtual {v10, v7, v0}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 1012
    invoke-virtual {v10}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "%3$s"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    .line 1013
    const-string v0, "%3$s"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v10, v8, v0}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 1014
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPromptTv:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 1015
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPromptTv:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x106000d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHighlightColor(I)V

    .line 1016
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPromptTv:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1017
    return-void
.end method

.method private setConnectFailMsg()V
    .locals 6

    .line 197
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 198
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiFailMsg:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_connect_failure_msg_1:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiFailTitle:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 200
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiFailMsg:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 201
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPromptTv:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 202
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->handleWifiConnecting(Z)V

    .line 203
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->setConnectFailClick()V

    .line 204
    return-void
.end method

.method private setLection()V
    .locals 3

    .line 776
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 777
    if-eqz v1, :cond_0

    .line 778
    move-object v2, v1

    check-cast v2, Landroid/text/Spannable;

    .line 779
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {v2, v0}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    .line 781
    :cond_0
    return-void
.end method

.method private setWifiInfoProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 596
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mDefaultSsid:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 597
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiNameTv:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->wifi_device_menu_text_right_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 599
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiNameTv:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->common_black_30alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 602
    :goto_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 603
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->wifi_device_menu_text_right_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTextColor(I)V

    goto :goto_1

    .line 605
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->common_black_30alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTextColor(I)V

    .line 607
    :goto_1
    return-void
.end method

.method private showConnectedWifiView(Ljava/lang/String;)V
    .locals 2

    .line 332
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiNameTv:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 333
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 334
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->checkWifiLegal(Landroid/net/wifi/ScanResult;)V

    .line 335
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akf;->m(Landroid/content/Context;)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->checkWifiOpenMode(Z)V

    .line 336
    return-void
.end method

.method private showGpsDialog()V
    .locals 4

    .line 869
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mGpsDialog:Lo/egy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mGpsDialog:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 870
    return-void

    .line 872
    :cond_0
    new-instance v3, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v3, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 873
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_gps_service_prompt_msg:I

    invoke-virtual {v3, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$8;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$8;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    .line 874
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_common_enable_button:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$7;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$7;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    .line 880
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 898
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mGpsDialog:Lo/egy;

    .line 899
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mGpsDialog:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 900
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mGpsDialog:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 901
    return-void
.end method

.method private showLrcCacheWifiInfo(Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 4

    .line 349
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is2_4G = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " |isOpen = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 350
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiNameTv:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 351
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    invoke-virtual {v0, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 352
    invoke-direct {p0, p3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->showWifiErrorView(Z)V

    .line 353
    invoke-direct {p0, p4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->checkWifiOpenMode(Z)V

    .line 354
    iput-boolean p3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->is2_4GWifi:Z

    .line 355
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isClickNextStep(Z)Z

    .line 356
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isShowLrcCache:Z

    .line 357
    return-void
.end method

.method private showSelectWifiView()V
    .locals 3

    .line 340
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiNameTv:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_select_msg:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 341
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 342
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->showWifiErrorView(Z)V

    .line 343
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->checkWifiOpenMode(Z)V

    .line 344
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isClickNextStep(Z)Z

    .line 345
    return-void
.end method

.method private showWifiErrorView(Z)V
    .locals 2

    .line 542
    if-eqz p1, :cond_0

    .line 543
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiErrorTv:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 545
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiErrorTv:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 547
    :goto_0
    return-void
.end method

.method private showWifiList()V
    .locals 2

    .line 643
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mShowWifiList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 644
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mBuilder:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->calculateDialogHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->b(I)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 645
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiListDialog:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->show()V

    .line 647
    :cond_0
    return-void
.end method

.method private switchPassword()V
    .locals 3

    .line 653
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isPasswordHide:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isPasswordHide:Z

    .line 654
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->isPasswordHide:Z

    if-eqz v0, :cond_1

    .line 655
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 656
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mPasswordSwitchBtn:Landroid/widget/ImageButton;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$drawable;->wifi_device_password_unvisible:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 658
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    invoke-static {}, Landroid/text/method/HideReturnsTransformationMethod;->getInstance()Landroid/text/method/HideReturnsTransformationMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 659
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mPasswordSwitchBtn:Landroid/widget/ImageButton;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$drawable;->wifi_device_password_visible:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 661
    :goto_1
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->setLection()V

    .line 662
    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 1028
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 1029
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",requestCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1030
    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 1031
    return-void

    .line 1033
    :cond_0
    const/16 v0, 0x3e8

    if-ne p1, v0, :cond_1

    .line 1034
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->setArguments(Landroid/os/Bundle;)V

    .line 1037
    :cond_1
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 627
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 628
    sget v0, Lcom/huawei/plugindevice/R$id;->wifi_name_select_layout:I

    if-ne v1, v0, :cond_0

    .line 629
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->showWifiList()V

    goto :goto_0

    .line 630
    :cond_0
    sget v0, Lcom/huawei/plugindevice/R$id;->password_switch_btn:I

    if-ne v1, v0, :cond_1

    .line 631
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->switchPassword()V

    goto :goto_0

    .line 632
    :cond_1
    sget v0, Lcom/huawei/plugindevice/R$id;->back_step_button_layout:I

    if-ne v1, v0, :cond_2

    .line 633
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->goBackPressed()V

    goto :goto_0

    .line 634
    :cond_2
    sget v0, Lcom/huawei/plugindevice/R$id;->next_step_button_layout:I

    if-ne v1, v0, :cond_3

    .line 635
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->goNextStep()V

    .line 637
    :cond_3
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 207
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 208
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 209
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;

    .line 210
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 225
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    .line 226
    sget v0, Lcom/huawei/plugindevice/R$layout;->wifi_info_confirm_fragment_layout:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    .line 227
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_device_pair_guide_note:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->setTitle(Ljava/lang/String;)V

    .line 228
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->initView()V

    .line 229
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->initData()V

    .line 230
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 231
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->child:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 233
    :cond_0
    return-object v2
.end method

.method public onDestroy()V
    .locals 0

    .line 835
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->clearData()V

    .line 836
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 837
    return-void
.end method

.method public onDestroyView()V
    .locals 2

    .line 841
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroyView()V

    .line 842
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mConnUtils:Lo/ajy;

    invoke-virtual {v0}, Lo/ajy;->b()V

    .line 844
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 845
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 847
    :cond_0
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    .line 962
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onRequestPermissionsResult(),permissions:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 963
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/dbn;->c([Ljava/lang/String;[I)V

    .line 964
    sget-object v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->PERMISSIONS:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const/4 v1, 0x0

    aget-object v1, p2, v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_0

    .line 965
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestPermissionsResult go to bind device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 966
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;

    const/16 v1, 0x3ea

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;->sendEmptyMessage(I)Z

    .line 968
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 214
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onResume()V

    .line 216
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mainActivity:Landroid/app/Activity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ajw;->d(Landroid/content/Context;Landroid/location/LocationManager;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 217
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->showGpsDialog()V

    goto :goto_0

    .line 219
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->checkHavePermission()V

    .line 221
    :goto_0
    return-void
.end method

.method public onViewStateRestored(Landroid/os/Bundle;)V
    .locals 4

    .line 238
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onViewStateRestored(Landroid/os/Bundle;)V

    .line 239
    const-string v0, "WiFiInfoConfirmFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 242
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPasswordEdit:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->mWifiPd:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 243
    return-void
.end method
