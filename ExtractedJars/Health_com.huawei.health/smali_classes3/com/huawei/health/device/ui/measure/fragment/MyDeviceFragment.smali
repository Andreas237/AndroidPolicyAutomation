.class public Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;
.super Lcom/huawei/health/device/ui/measure/fragment/ListFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;,
        Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$onItemReconnectListener;,
        Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$BindIResourceFileListener;
    }
.end annotation


# static fields
.field private static final BLUETOOTH_SWITCH:I = 0x1

.field private static final CLICK_BUTTON_NO:Ljava/lang/String; = "cancelEnableBluetooth"

.field private static final IDENTIFY_FILTER_LEN:I = 0x4

.field private static final SHOW_BINDED:I = 0x0

.field private static final TAG:Ljava/lang/String; = "MyDeviceFragment"

.field private static customTextAlertDialog:Lo/egv; = null

.field private static final mDeviceBatteryReceiver:Landroid/content/BroadcastReceiver;

.field private static mFragment:Ljava/lang/ref/WeakReference; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;>;"
        }
    .end annotation
.end field

.field private static mHandler:Landroid/os/Handler; = null

.field private static final mNonLocalBroadcastReceiver:Landroid/content/BroadcastReceiver;

.field private static final msg_battery:I = 0x4

.field private static final msg_connected:I = 0x0

.field private static final msg_connecting:I = 0x3

.field private static final msg_disconnected:I = 0x2

.field private static final msg_time_out:I = 0x1

.field private static final msg_unavailable:I = 0x5

.field private static reconnectCount:I = 0x0


# instance fields
.field private bindHandler:Landroid/os/Handler;

.field private isFromFitnessAdvice:Z

.field private isShowWiFiDevice:Z

.field private kind:Lo/acl$a;

.field private list_compare:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private lvMarginBottomForToolBaar:I

.field private mCloseBTDialog:Lo/egy;

.field private mContext:Landroid/content/Context;

.field private mDlg:Lo/egv;

.field private mEntryType:Ljava/lang/String;

.field private mProductInfoList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afa;>;"
        }
    .end annotation
.end field

.field private mReconnectDevice:Ljava/lang/String;

.field private notHeartRateDeviceList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private onItemReconnectListener:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$onItemReconnectListener;

.field private productInfoList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afa;>;"
        }
    .end annotation
.end field

.field protected productInfos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afj;>;"
        }
    .end annotation
.end field

.field private productList:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

.field private wear_info_list:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/ahh;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 99
    const/4 v0, 0x0

    sput v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->reconnectCount:I

    .line 1113
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->customTextAlertDialog:Lo/egv;

    .line 1210
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$10;

    invoke-direct {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$10;-><init>()V

    sput-object v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mHandler:Landroid/os/Handler;

    .line 1343
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$11;

    invoke-direct {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$11;-><init>()V

    sput-object v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mNonLocalBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 1442
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$13;

    invoke-direct {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$13;-><init>()V

    sput-object v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mDeviceBatteryReceiver:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;-><init>()V

    .line 94
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfos:Ljava/util/ArrayList;

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfoList:Ljava/util/ArrayList;

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mProductInfoList:Ljava/util/ArrayList;

    .line 97
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mEntryType:Ljava/lang/String;

    .line 104
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->list_compare:Ljava/util/ArrayList;

    .line 105
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->wear_info_list:Ljava/util/ArrayList;

    .line 108
    sget-object v0, Lo/acl$a;->b:Lo/acl$a;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->kind:Lo/acl$a;

    .line 109
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mCloseBTDialog:Lo/egy;

    .line 111
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->isFromFitnessAdvice:Z

    .line 114
    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->lvMarginBottomForToolBaar:I

    .line 124
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->bindHandler:Landroid/os/Handler;

    .line 1385
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mDlg:Lo/egv;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Ljava/util/ArrayList;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfoList:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$002(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfoList:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productList:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/afj;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->entryTypeEqualsPick(Lo/afj;)V

    return-void
.end method

.method static synthetic access$1100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->openWearHome(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1200(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lcom/huawei/health/device/ui/BaseFragment;Ljava/lang/String;)V
    .locals 0

    .line 92
    invoke-virtual {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1300(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 92
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method static synthetic access$1400(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lcom/huawei/health/device/ui/BaseFragment;Ljava/lang/String;)V
    .locals 0

    .line 92
    invoke-virtual {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1500(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 92
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method static synthetic access$1600(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/afj;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->sendMessageInMyDeviceFragment(Lo/afj;)V

    return-void
.end method

.method static synthetic access$1700(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)V
    .locals 0

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showEmpty()V

    return-void
.end method

.method static synthetic access$1800(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Ljava/util/ArrayList;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->list_compare:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$1900(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Landroid/os/Handler;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->bindHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$2000(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$onItemReconnectListener;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->onItemReconnectListener:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$onItemReconnectListener;

    return-object v0
.end method

.method static synthetic access$2002(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$onItemReconnectListener;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$onItemReconnectListener;
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->onItemReconnectListener:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$onItemReconnectListener;

    return-object p1
.end method

.method static synthetic access$2102(I)I
    .locals 0

    .line 92
    sput p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->reconnectCount:I

    return p0
.end method

.method static synthetic access$2200(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lo/egy;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mCloseBTDialog:Lo/egy;

    return-object v0
.end method

.method static synthetic access$2202(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/egy;)Lo/egy;
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mCloseBTDialog:Lo/egy;

    return-object p1
.end method

.method static synthetic access$2400(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lo/acl$a;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->kind:Lo/acl$a;

    return-object v0
.end method

.method static synthetic access$2500(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/acl$a;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->initList(Lo/acl$a;)V

    return-void
.end method

.method static synthetic access$2600(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)V
    .locals 0

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showTipDialog()V

    return-void
.end method

.method static synthetic access$2700(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/ahh;Lo/egd;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->startReconnect(Lo/ahh;Lo/egd;Landroid/widget/LinearLayout;)V

    return-void
.end method

.method static synthetic access$2800()Ljava/lang/ref/WeakReference;
    .locals 1

    .line 92
    sget-object v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mFragment:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method static synthetic access$2900(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Landroid/content/Context;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showBandUnavailableDialog(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$300()Landroid/os/Handler;
    .locals 1

    .line 92
    sget-object v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mReconnectDevice:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$502(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mReconnectDevice:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mEntryType:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;ILo/afj;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->entryTypeEqualsList(ILo/afj;)V

    return-void
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Landroid/content/Context;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/afj;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->entryTypeEqualsMeasure(Lo/afj;)V

    return-void
.end method

.method private creatAlertDialog(Ljava/lang/String;)V
    .locals 4

    .line 1115
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_can_not_connect:I

    .line 1116
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 1117
    invoke-virtual {v0, p1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 1118
    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->c(Ljava/lang/Boolean;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$9;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$9;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)V

    .line 1119
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 1128
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->customTextAlertDialog:Lo/egv;

    .line 1129
    sget-object v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->customTextAlertDialog:Lo/egv;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 1130
    sget-object v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->customTextAlertDialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1131
    return-void
.end method

.method private entryTypeEqualsList(ILo/afj;)V
    .locals 7

    .line 640
    invoke-virtual {p2}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 642
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyDeviceFragment Disassociate this device?"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 644
    new-instance v6, Lo/egy$b;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {v6, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 646
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_cancel_unbind_device:I

    invoke-virtual {v6, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    .line 647
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_yes:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$7;

    invoke-direct {v1, p0, p2, p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$7;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/afj;I)V

    invoke-virtual {v6, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 658
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_no:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$8;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$8;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)V

    invoke-virtual {v6, v0, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 674
    invoke-virtual {v6}, Lo/egy$b;->a()Lo/egy;

    move-result-object v5

    .line 675
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egy;->setCancelable(Z)V

    .line 676
    invoke-virtual {v5}, Lo/egy;->show()V

    .line 678
    goto :goto_1

    .line 679
    :cond_0
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 680
    const-string v0, "productId"

    invoke-virtual {p2}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 681
    invoke-virtual {p2}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ahd;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 682
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;-><init>()V

    goto :goto_0

    .line 683
    :cond_1
    invoke-static {p2}, Lo/ake;->d(Lo/afj;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 684
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;-><init>()V

    goto :goto_0

    .line 686
    :cond_2
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;-><init>()V

    .line 688
    :goto_0
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 689
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 691
    :goto_1
    return-void
.end method

.method private entryTypeEqualsMeasure(Lo/afj;)V
    .locals 10

    .line 565
    invoke-virtual {p1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/agd;->d(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v4

    .line 566
    if-eqz v4, :cond_0

    .line 567
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 568
    const-string v0, "view"

    const-string v1, "measure"

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 569
    const-string v0, "productId"

    invoke-virtual {p1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 570
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 571
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 572
    goto/16 :goto_1

    .line 574
    :cond_0
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {p1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 575
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {p1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->d(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v5

    .line 581
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {p1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v6

    .line 582
    const-string v0, "01"

    iget-object v1, v6, Lo/afj;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    .line 583
    if-eqz v5, :cond_3

    .line 584
    if-eqz v7, :cond_1

    .line 585
    new-instance v8, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;

    invoke-direct {v8}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;-><init>()V

    .line 586
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 587
    const-string v0, "view"

    const-string v1, "bond"

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 588
    const-string v0, "productId"

    invoke-virtual {p1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 589
    invoke-virtual {v8, v9}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->setArguments(Landroid/os/Bundle;)V

    .line 590
    invoke-virtual {p0, v8}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 591
    goto :goto_0

    .line 592
    :cond_1
    invoke-virtual {p1}, Lo/afj;->k()Lo/acl$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/agd;->d(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v8

    .line 593
    if-eqz v8, :cond_2

    .line 594
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 595
    const-string v0, "view"

    const-string v1, "measure"

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 596
    const-string v0, "kind"

    invoke-virtual {p1}, Lo/afj;->k()Lo/acl$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 597
    const-string v0, "productId"

    invoke-virtual {p1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 598
    invoke-virtual {v8, v9}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 599
    invoke-virtual {p0, v8}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 601
    :cond_2
    goto :goto_0

    .line 603
    :cond_3
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the device is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 605
    :goto_0
    goto/16 :goto_1

    .line 606
    :cond_4
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {p1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/acp;

    .line 611
    const-string v0, "01"

    invoke-virtual {p1}, Lo/afj;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    .line 612
    if-eqz v5, :cond_7

    .line 613
    invoke-virtual {v5}, Lo/acp;->i()Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz v6, :cond_5

    .line 614
    new-instance v7, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;

    invoke-direct {v7}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;-><init>()V

    .line 615
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 616
    const-string v0, "view"

    const-string v1, "bond"

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 617
    const-string v0, "productId"

    invoke-virtual {p1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 618
    invoke-virtual {v7, v8}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->setArguments(Landroid/os/Bundle;)V

    .line 619
    invoke-virtual {p0, v7}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 620
    goto :goto_1

    .line 621
    :cond_5
    invoke-virtual {p1}, Lo/afj;->k()Lo/acl$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/agd;->d(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v7

    .line 622
    if-eqz v7, :cond_6

    .line 623
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 624
    const-string v0, "view"

    const-string v1, "measure"

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 625
    const-string v0, "productId"

    invoke-virtual {p1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 626
    const-string v0, "kind"

    invoke-virtual {p1}, Lo/afj;->k()Lo/acl$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 627
    invoke-virtual {v7, v8}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 628
    invoke-virtual {p0, v7}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 630
    :cond_6
    goto :goto_1

    .line 632
    :cond_7
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 636
    :goto_1
    return-void
.end method

.method private entryTypeEqualsPick(Lo/afj;)V
    .locals 6

    .line 530
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result v0

    const/16 v1, 0xa

    if-ne v1, v0, :cond_0

    .line 532
    new-instance v5, Lo/egy$b;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {v5, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 534
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_bluetooth_open_request:I

    invoke-virtual {v5, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    .line 535
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_yes:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$5;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$5;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/afj;)V

    invoke-virtual {v5, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 542
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_no:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$6;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$6;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)V

    invoke-virtual {v5, v0, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 553
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 554
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egy;->setCancelable(Z)V

    .line 555
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 557
    goto :goto_0

    .line 558
    :cond_0
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyDeviceFragment sendMessage with bluetooth open"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->sendMessageInMyDeviceFragment(Lo/afj;)V

    .line 561
    :goto_0
    return-void
.end method

.method private getWiFiDevice()V
    .locals 6

    .line 399
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->d()Ljava/util/ArrayList;

    move-result-object v2

    .line 400
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 401
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 402
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lo/ajq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 403
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 404
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v5

    .line 405
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 406
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfos:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 401
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 411
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfos:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/aex;->d(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 412
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfoList:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfos:Ljava/util/ArrayList;

    invoke-static {v1}, Lo/aex;->d(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 414
    :cond_2
    return-void
.end method

.method private init(Landroid/view/View;)V
    .locals 10

    .line 188
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v5

    .line 189
    const-string v6, ""

    .line 190
    if-eqz v5, :cond_0

    const-string v0, "root_in_me"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 191
    const-string v0, "root_in_me"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 193
    :cond_0
    move-object v7, v6

    .line 195
    if-eqz v5, :cond_1

    const-string v0, "kind"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 196
    const-string v0, "kind"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/acl$a;->valueOf(Ljava/lang/String;)Lo/acl$a;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->kind:Lo/acl$a;

    .line 197
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====the kind is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->kind:Lo/acl$a;

    invoke-virtual {v3}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 201
    const-string v0, "isFromFitnessAdvice"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->isFromFitnessAdvice:Z

    .line 202
    const-string v0, "notHeartRateDeviceList"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->notHeartRateDeviceList:Ljava/util/ArrayList;

    .line 205
    :cond_2
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 207
    new-instance v8, Landroid/content/IntentFilter;

    invoke-direct {v8}, Landroid/content/IntentFilter;-><init>()V

    .line 209
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v8, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 210
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mNonLocalBroadcastReceiver:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v8, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 212
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->registerBatteryBroadcast()V

    .line 214
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->kind:Lo/acl$a;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->initList(Lo/acl$a;)V

    .line 215
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfoList:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productList:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    .line 216
    if-eqz v5, :cond_4

    const-string v0, "EntryType"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 217
    const-string v0, "EntryType"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mEntryType:Ljava/lang/String;

    .line 218
    const-string v0, "WiFiDevice"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mEntryType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->isShowWiFiDevice:Z

    .line 221
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_list_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->myDevicesListview:Landroid/widget/ListView;

    .line 222
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->myDevicesListview:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 223
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->lvMarginBottomForToolBaar:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v8, v1, v2, v3, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 224
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->myDevicesListview:Landroid/widget/ListView;

    invoke-virtual {v0, v8}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 225
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->myDevicesListview:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productList:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 226
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productList:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)V

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->setOnItemReconnectListener(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$onItemReconnectListener;)V

    .line 344
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mEntryType:Ljava/lang/String;

    const-string v1, "List"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 345
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_show_operate_my_device:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->setTitle(Ljava/lang/String;)V

    .line 346
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showEmpty()V

    .line 347
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$3;

    invoke-direct {v0, p0, v7}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$3;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showMoreButton(ZLandroid/view/View$OnClickListener;)V

    .line 357
    invoke-direct {p0, v7}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->setAddButton(Ljava/lang/String;)V

    goto :goto_0

    .line 359
    :cond_5
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->c()Lo/aey;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->kind:Lo/acl$a;

    invoke-virtual {v0, v1}, Lo/aey;->c(Lo/acl$a;)Lo/afk;

    move-result-object v9

    .line 360
    if-eqz v9, :cond_6

    .line 361
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_show_device_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v9}, Lo/afk;->c()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lo/afo;->c(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->setTitle(Ljava/lang/String;)V

    .line 362
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showButton(ZLandroid/view/View$OnClickListener;)V

    .line 363
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showMoreButton(ZLandroid/view/View$OnClickListener;)V

    .line 366
    :cond_6
    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showButton(ZLandroid/view/View$OnClickListener;)V

    .line 367
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyDeviceFragment init finished"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    return-void
.end method

.method private initList(Lo/acl$a;)V
    .locals 9

    .line 416
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 418
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mProductInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 419
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 420
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->list_compare:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 421
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->wear_info_list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 422
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->isShowWiFiDevice:Z

    if-eqz v0, :cond_0

    .line 423
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->getWiFiDevice()V

    .line 424
    return-void

    .line 426
    :cond_0
    const/4 v4, 0x0

    .line 428
    sget-object v0, Lo/acl$a;->b:Lo/acl$a;

    if-eq p1, v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->isFromFitnessAdvice:Z

    if-eqz v0, :cond_7

    sget-object v0, Lo/acl$a;->g:Lo/acl$a;

    if-ne p1, v0, :cond_7

    .line 430
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->isFromFitnessAdvice:Z

    if-eqz v0, :cond_3

    sget-object v0, Lo/acl$a;->g:Lo/acl$a;

    if-ne p1, v0, :cond_3

    .line 431
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->notHeartRateDeviceList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/ahg;->c(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v5

    .line 432
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 433
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " has wear device getWearInfoHeartRate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    iput-object v5, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->wear_info_list:Ljava/util/ArrayList;

    .line 436
    :cond_2
    goto :goto_0

    .line 437
    :cond_3
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->c()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 438
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " has wear device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 439
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->c()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->wear_info_list:Ljava/util/ArrayList;

    .line 443
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->wear_info_list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ahh;

    .line 444
    new-instance v7, Lo/afa;

    invoke-direct {v7}, Lo/afa;-><init>()V

    .line 445
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lo/afa;->e(I)V

    .line 446
    invoke-virtual {v7, v6}, Lo/afa;->a(Ljava/lang/Object;)V

    .line 447
    invoke-virtual {v6}, Lo/ahh;->e()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_5

    .line 448
    add-int/lit8 v4, v4, 0x1

    .line 449
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mProductInfoList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_2

    .line 451
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mProductInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 453
    :goto_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productList:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productList:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->getConnecting()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mReconnectDevice:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mReconnectDevice:Ljava/lang/String;

    invoke-virtual {v6}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 454
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/ahh;->a(I)V

    .line 456
    :cond_6
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " has wear device  name :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lo/ahh;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " has wear device  state :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lo/ahh;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 458
    goto/16 :goto_1

    .line 460
    :cond_7
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " has wear DEVICE_CONNECTED  :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afd;->e(Lo/acl$a;)Ljava/util/ArrayList;

    move-result-object v5

    .line 462
    const/4 v6, 0x0

    :goto_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_a

    .line 463
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v7

    .line 464
    if-eqz v7, :cond_8

    invoke-virtual {v7}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 465
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfos:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 466
    :cond_8
    if-eqz v7, :cond_9

    invoke-virtual {v7}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 467
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyDeviceFragment list_compare add productid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->list_compare:Ljava/util/ArrayList;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 462
    :cond_9
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_3

    .line 471
    :cond_a
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfos:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/aex;->d(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_b

    .line 472
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mProductInfoList:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfos:Ljava/util/ArrayList;

    invoke-static {v1}, Lo/aex;->d(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 474
    :cond_b
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyDeviceFragment mProductInfoList size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mProductInfoList:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 475
    if-lez v4, :cond_e

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mProductInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v4, :cond_e

    .line 476
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mProductInfoList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v4}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v6

    .line 477
    const/4 v7, 0x0

    :goto_5
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_d

    .line 478
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/afa;

    .line 479
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v7, v0, :cond_c

    .line 480
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lo/afa;->c(Z)V

    goto :goto_6

    .line 482
    :cond_c
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lo/afa;->c(Z)V

    .line 484
    :goto_6
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 477
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    .line 486
    :cond_d
    new-instance v7, Lo/afa;

    invoke-direct {v7}, Lo/afa;-><init>()V

    .line 487
    const/4 v0, 0x3

    invoke-virtual {v7, v0}, Lo/afa;->e(I)V

    .line 488
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v7, v0}, Lo/afa;->a(Ljava/lang/Object;)V

    .line 489
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 490
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfoList:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mProductInfoList:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mProductInfoList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v4, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 491
    goto :goto_7

    .line 492
    :cond_e
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfoList:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mProductInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 494
    :goto_7
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyDeviceFragment productInfos size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfoList:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "list_compare size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->list_compare:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    return-void
.end method

.method private openWearHome(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1280
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter openWearHome "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1282
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dpb;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1283
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dpa;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1284
    :cond_0
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter openWearHome other device is OTAing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1285
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showTipDialog()V

    .line 1286
    return-void

    .line 1289
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dpb;->g(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1290
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter openWearHome wear device is OTAing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1291
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1292
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    const-string v1, "com.huawei.ui.device.activity.update.UpdateVersionActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 1293
    const-string v0, "device_id"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1294
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1295
    return-void

    .line 1296
    :cond_2
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dpa;->d(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1297
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter openWearHome AW70 is OTAing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1298
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1299
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    const-string v1, "com.huawei.ui.device.activity.update.UpdateVersionActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 1300
    const-string v0, "device_id"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1301
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1302
    return-void

    .line 1305
    :cond_3
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dpb;->k(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1306
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wear device is Forced Update"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1308
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, p2, v0, p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showForcedDialog(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    .line 1309
    return-void

    .line 1312
    :cond_4
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dpa;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1313
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aw70 device is Forced Update"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1315
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, p2, v0, p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showForcedDialog(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    .line 1316
    return-void

    .line 1320
    :cond_5
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1321
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    const-string v1, "com.huawei.ui.homewear21.home.WearHomeActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 1322
    const-string v0, "device_id"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1323
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1325
    return-void
.end method

.method private registerBatteryBroadcast()V
    .locals 5

    .line 1436
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter registerBatteryBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1437
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.BATTERY_LEVEL"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 1438
    const-string v0, "com.huawei.bone.action.BATTERY_LEVEL"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1439
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mDeviceBatteryReceiver:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 1440
    return-void
.end method

.method private sendMessageInMyDeviceFragment(Lo/afj;)V
    .locals 2

    .line 694
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 695
    iget-object v0, p1, Lo/afj;->b:Ljava/lang/String;

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 696
    const/4 v0, 0x1

    iput v0, v1, Landroid/os/Message;->what:I

    .line 697
    const-string v0, "MyDeviceFragment"

    invoke-static {v0, v1}, Lo/ahj;->d(Ljava/lang/String;Landroid/os/Message;)V

    .line 698
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 699
    return-void
.end method

.method private setAddButton(Ljava/lang/String;)V
    .locals 4

    .line 371
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->buttomview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ems;

    .line 372
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/ems;->setVisibility(I)V

    .line 373
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$layout;->hw_toolbar_bottomview:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/ems;->d(Landroid/view/View;)V

    .line 374
    const/4 v0, 0x0

    const/16 v1, 0x8

    invoke-virtual {v3, v0, v1}, Lo/ems;->setIconVisible(II)V

    .line 375
    sget v0, Lcom/huawei/plugindevice/R$drawable;->ic_addition_create_group:I

    const/4 v1, 0x1

    invoke-virtual {v3, v1, v0}, Lo/ems;->setIcon(II)V

    .line 376
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_contact_add:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v3, v1, v0}, Lo/ems;->setIconTitle(ILjava/lang/CharSequence;)V

    .line 377
    const/4 v0, 0x2

    const/16 v1, 0x8

    invoke-virtual {v3, v0, v1}, Lo/ems;->setIconVisible(II)V

    .line 378
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$4;

    invoke-direct {v0, p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$4;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Lo/ems;->setOnSingleTapListener(Lo/ems$d;)V

    .line 395
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v3, v0}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 396
    return-void
.end method

.method public static setFragment(Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/ref/WeakReference<Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;>;)V"
        }
    .end annotation

    .line 122
    sput-object p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mFragment:Ljava/lang/ref/WeakReference;

    .line 123
    return-void
.end method

.method private showAlertDialogB3()V
    .locals 11

    .line 1169
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1170
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1171
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_press_restart4:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 1172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1173
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1174
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 1175
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 1176
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1177
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->creatAlertDialog(Ljava/lang/String;)V

    .line 1179
    return-void
.end method

.method private showAlertDialogB5()V
    .locals 11

    .line 1157
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1158
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1159
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_press_restart3:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 1160
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1161
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1162
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 1163
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 1164
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1165
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->creatAlertDialog(Ljava/lang/String;)V

    .line 1167
    return-void
.end method

.method private showAlertDialogCrius()V
    .locals 11

    .line 1181
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1182
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1183
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_press_restart2:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 1184
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1185
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1186
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 1187
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 1188
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1189
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->creatAlertDialog(Ljava/lang/String;)V

    .line 1190
    return-void
.end method

.method private showAlertDialogS1()V
    .locals 11

    .line 1193
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1194
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1195
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_press_restart5:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 1196
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1197
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1198
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 1199
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 1200
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1201
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->creatAlertDialog(Ljava/lang/String;)V

    .line 1202
    return-void
.end method

.method private showAlertDialogTalos()V
    .locals 11

    .line 1145
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1146
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1147
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_press_restart1:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 1148
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1150
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 1151
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 1152
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1153
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->creatAlertDialog(Ljava/lang/String;)V

    .line 1155
    return-void
.end method

.method private showBandUnavailableDialog(Landroid/content/Context;)V
    .locals 7

    .line 1390
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBandUnavailableDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1392
    const-string v0, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-static {p1, v0}, Lo/dbf;->h(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    .line 1393
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isForeground : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1394
    if-nez v4, :cond_0

    .line 1395
    return-void

    .line 1397
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mDlg:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1398
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mDlg:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1399
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBandUnavailableDialog Already show!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1400
    return-void

    .line 1404
    :cond_1
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_band_is_unavailable_tip_string_newphone:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 1405
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_service_area_notice_title:I

    .line 1406
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 1407
    invoke-virtual {v0, v5}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$12;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$12;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)V

    .line 1408
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v6

    .line 1413
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mDlg:Lo/egv;

    .line 1414
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mDlg:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 1415
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mDlg:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1416
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mDlg:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1418
    :cond_2
    return-void
.end method

.method private showDefualtAlertDialog()V
    .locals 9

    .line 1134
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1135
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1136
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 1137
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 1138
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 1139
    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1140
    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->creatAlertDialog(Ljava/lang/String;)V

    .line 1141
    return-void
.end method

.method private showEmpty()V
    .locals 11

    .line 160
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->list_compare:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 161
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->hw_no_bonded_device_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 162
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 165
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v7

    .line 166
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v8, v0, Landroid/util/DisplayMetrics;->density:F

    .line 167
    int-to-float v0, v7

    div-float/2addr v0, v8

    const/high16 v1, 0x3f000000    # 0.5f

    add-float v9, v0, v1

    .line 168
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyDeviceFragment heightInDp is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    invoke-virtual {v6}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/FrameLayout$LayoutParams;

    .line 171
    int-to-double v0, v7

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    div-double/2addr v0, v2

    float-to-double v2, v8

    const-wide v4, 0x4052200000000000L    # 72.5

    mul-double/2addr v2, v4

    sub-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, v10, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 172
    invoke-virtual {v6, v10}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 174
    :cond_0
    return-void
.end method

.method private showForcedDialog(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 3

    .line 1332
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 1333
    const-string v0, "deviceName"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1334
    const-string v0, "isForced"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1335
    const-string v0, "isAW70"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 1336
    const-string v0, "mac"

    invoke-virtual {v2, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1337
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    const-string v1, "com.huawei.ui.device.activity.update.BandUpdateDialogActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 1338
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1339
    return-void
.end method

.method private showTipDialog()V
    .locals 5

    .line 1459
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    .line 1460
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_main_device_ota_error_message:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_user_permission_know:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$14;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$14;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)V

    .line 1461
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v3

    .line 1467
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 1468
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egy;->setCancelable(Z)V

    .line 1469
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 1470
    return-void
.end method

.method private startReconnect(Lo/ahh;Lo/egd;Landroid/widget/LinearLayout;)V
    .locals 5

    .line 1070
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startReconnect reconnectCount \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->reconnectCount:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1072
    sget v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->reconnectCount:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 1073
    invoke-virtual {p1}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mReconnectDevice:Ljava/lang/String;

    .line 1074
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productList:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->setConnecting(Z)V

    .line 1075
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->onItemReconnectListener:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$onItemReconnectListener;

    invoke-interface {v0, p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$onItemReconnectListener;->onReconnect(Lo/ahh;)V

    .line 1076
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productList:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->setConnecting(Z)V

    .line 1077
    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Lo/egd;->setVisibility(I)V

    .line 1078
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1080
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productList:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->startLoading()V

    .line 1081
    sget v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->reconnectCount:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->reconnectCount:I

    goto/16 :goto_2

    .line 1084
    :cond_0
    invoke-virtual {p1}, Lo/ahh;->b()I

    move-result v4

    .line 1085
    packed-switch v4, :pswitch_data_0

    goto :goto_0

    .line 1088
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showAlertDialogTalos()V

    .line 1089
    goto :goto_1

    .line 1092
    :pswitch_1
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showAlertDialogCrius()V

    .line 1093
    goto :goto_1

    .line 1095
    :pswitch_2
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showAlertDialogS1()V

    .line 1096
    goto :goto_1

    .line 1098
    :pswitch_3
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showAlertDialogB5()V

    .line 1099
    goto :goto_1

    .line 1102
    :pswitch_4
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showAlertDialogB3()V

    .line 1103
    goto :goto_1

    .line 1105
    :goto_0
    :pswitch_5
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showDefualtAlertDialog()V

    .line 1109
    :goto_1
    const/4 v0, 0x0

    sput v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->reconnectCount:I

    .line 1111
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_4
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private unRegisterBatteryBroadcast()V
    .locals 5

    .line 1425
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    sget-object v1, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mDeviceBatteryReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1430
    goto :goto_0

    .line 1426
    :catch_0
    move-exception v4

    .line 1427
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unRegisterBatteryBroadcast Exception: "

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1430
    goto :goto_0

    .line 1428
    :catch_1
    move-exception v4

    .line 1429
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unRegisterBatteryBroadcast Exception:"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1431
    :goto_0
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 178
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 179
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    .line 180
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mContext:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 181
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityCreated mContext== null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    return-void

    .line 184
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 151
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyDeviceFragment onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->setFragment(Ljava/lang/ref/WeakReference;)V

    .line 153
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v4

    .line 154
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$BindIResourceFileListener;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$BindIResourceFileListener;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$1;)V

    invoke-virtual {v0, v1}, Lo/afq;->a(Lo/aff;)V

    .line 155
    invoke-direct {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->init(Landroid/view/View;)V

    .line 156
    return-object v4
.end method

.method public onDestroy()V
    .locals 5

    .line 511
    invoke-super {p0}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->onDestroy()V

    .line 512
    sget-object v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mFragment:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 513
    sget-object v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V

    .line 515
    :cond_0
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->d()V

    .line 516
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 517
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->unRegisterBatteryBroadcast()V

    .line 519
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterWearBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 520
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->mNonLocalBroadcastReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 525
    goto :goto_0

    .line 521
    :catch_0
    move-exception v4

    .line 522
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 525
    goto :goto_0

    .line 523
    :catch_1
    move-exception v4

    .line 524
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 527
    :cond_1
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 499
    invoke-super {p0}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->onResume()V

    .line 500
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->kind:Lo/acl$a;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->initList(Lo/acl$a;)V

    .line 501
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productList:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->notifyDataSetChanged()V

    .line 502
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->showEmpty()V

    .line 503
    invoke-static {}, Lo/dke;->a()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 504
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->productList:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->notifyDataSetChanged()V

    .line 505
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBatteryInfo.battery is not -1 , battery is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/dke;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    :cond_0
    return-void
.end method
