.class public Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;
.super Lcom/huawei/health/device/ui/measure/fragment/ListFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;,
        Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$onItemReconnectListener;
    }
.end annotation


# static fields
.field private static final IDENTIFY_FILTER_LEN:I = 0x4

.field private static final TAG:Ljava/lang/String; = "DeviceBindingFragment"

.field private static final mDeviceBatteryReceiver:Landroid/content/BroadcastReceiver;

.field private static mFragment:Ljava/lang/ref/WeakReference; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;>;"
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


# instance fields
.field private adapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

.field private deviceList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afa;>;"
        }
    .end annotation
.end field

.field private groupList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afk;>;"
        }
    .end annotation
.end field

.field private isDiscover:Z

.field private isFromFitnessAdvice:Z

.field private isHeartRateDevice:I

.field private mCloseBTDialog:Lo/egy;

.field private mContext:Landroid/content/Context;

.field private mDlg:Lo/egv;

.field private mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

.field private mReconnectDevice:Ljava/lang/String;

.field private onItemReconnectListener:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$onItemReconnectListener;

.field private productInfos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afj;>;"
        }
    .end annotation
.end field

.field private reconnectCount:I

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

    .line 1196
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$5;

    invoke-direct {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$5;-><init>()V

    sput-object v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mHandler:Landroid/os/Handler;

    .line 1274
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$6;

    invoke-direct {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$6;-><init>()V

    sput-object v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mNonLocalBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 1377
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$8;

    invoke-direct {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$8;-><init>()V

    sput-object v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mDeviceBatteryReceiver:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 80
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;-><init>()V

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->productInfos:Ljava/util/ArrayList;

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->groupList:Ljava/util/ArrayList;

    .line 85
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->wear_info_list:Ljava/util/ArrayList;

    .line 90
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->reconnectCount:I

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mCloseBTDialog:Lo/egy;

    .line 92
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->isDiscover:Z

    .line 93
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->isFromFitnessAdvice:Z

    .line 94
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->isHeartRateDevice:I

    .line 576
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$4;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    .line 1320
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mDlg:Lo/egv;

    return-void
.end method

.method static synthetic access$000()Landroid/os/Handler;
    .locals 1

    .line 80
    sget-object v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lo/egy;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mCloseBTDialog:Lo/egy;

    return-object v0
.end method

.method static synthetic access$1002(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;Lo/egy;)Lo/egy;
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mCloseBTDialog:Lo/egy;

    return-object p1
.end method

.method static synthetic access$1200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)V
    .locals 0

    .line 80
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->setAdapterData()V

    return-void
.end method

.method static synthetic access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->adapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    return-object v0
.end method

.method static synthetic access$1500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mReconnectDevice:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1502(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mReconnectDevice:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$1600()Ljava/lang/ref/WeakReference;
    .locals 1

    .line 80
    sget-object v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mFragment:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method static synthetic access$1700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Landroid/content/Context;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$1800(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;Landroid/content/Context;)V
    .locals 0

    .line 80
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->showBandUnavailableDialog(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;I)V
    .locals 0

    .line 80
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->onProductItemClick(I)V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;I)V
    .locals 0

    .line 80
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->onGroupItemClick(I)V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;I)V
    .locals 0

    .line 80
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->onWearItemClick(I)V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;I)V
    .locals 0

    .line 80
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->onWearDeviceClick(I)V

    return-void
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$onItemReconnectListener;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->onItemReconnectListener:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$onItemReconnectListener;

    return-object v0
.end method

.method static synthetic access$702(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$onItemReconnectListener;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$onItemReconnectListener;
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->onItemReconnectListener:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$onItemReconnectListener;

    return-object p1
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)I
    .locals 1

    .line 80
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->reconnectCount:I

    return v0
.end method

.method static synthetic access$902(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;I)I
    .locals 0

    .line 80
    iput p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->reconnectCount:I

    return p1
.end method

.method static synthetic access$908(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)I
    .locals 2

    .line 80
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->reconnectCount:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->reconnectCount:I

    return v0
.end method

.method private addBindTitle(Ljava/lang/String;)V
    .locals 3

    .line 121
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->productInfos:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    const-string v0, "me"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 122
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->productInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->c()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 123
    :cond_0
    new-instance v2, Lo/afa;

    invoke-direct {v2}, Lo/afa;-><init>()V

    .line 124
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_user_profile_health_show_paried:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/afa;->a(Ljava/lang/Object;)V

    .line 125
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Lo/afa;->e(I)V

    .line 126
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    :cond_1
    return-void
.end method

.method private addMoreTitle()V
    .locals 3

    .line 165
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->productInfos:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->productInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->wear_info_list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 166
    :cond_1
    new-instance v2, Lo/afa;

    invoke-direct {v2}, Lo/afa;-><init>()V

    .line 167
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_common_ui_navigation_bar_more:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/afa;->a(Ljava/lang/Object;)V

    .line 168
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Lo/afa;->e(I)V

    .line 169
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    :cond_2
    return-void
.end method

.method private addProductData()V
    .locals 4

    .line 154
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->productInfos:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 155
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->productInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 156
    new-instance v3, Lo/afa;

    invoke-direct {v3}, Lo/afa;-><init>()V

    .line 157
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->productInfos:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/afa;->a(Ljava/lang/Object;)V

    .line 158
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/afa;->e(I)V

    .line 159
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 162
    :cond_0
    return-void
.end method

.method private addWearTitle()V
    .locals 7

    .line 132
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->c()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 133
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " has wear device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->c()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->wear_info_list:Ljava/util/ArrayList;

    .line 135
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " has wear device size :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->wear_info_list:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->wear_info_list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ahh;

    .line 137
    new-instance v6, Lo/afa;

    invoke-direct {v6}, Lo/afa;-><init>()V

    .line 138
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/afa;->e(I)V

    .line 139
    invoke-virtual {v6, v5}, Lo/afa;->a(Ljava/lang/Object;)V

    .line 140
    invoke-virtual {v5}, Lo/ahh;->e()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 143
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->adapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->adapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->getConnecting()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mReconnectDevice:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mReconnectDevice:Ljava/lang/String;

    invoke-virtual {v5}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 146
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/ahh;->a(I)V

    .line 148
    :cond_1
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " has wear device  name :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/ahh;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " has wear device  state :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/ahh;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    goto/16 :goto_0

    .line 152
    :cond_2
    return-void
.end method

.method private getBindDevice()V
    .locals 6

    .line 371
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->productInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 372
    sget-object v2, Lo/acl$a;->b:Lo/acl$a;

    .line 373
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/afd;->e(Lo/acl$a;)Ljava/util/ArrayList;

    move-result-object v3

    .line 374
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 375
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v5

    .line 376
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

    .line 377
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->productInfos:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 380
    :cond_1
    return-void
.end method

.method private onGroupItemClick(I)V
    .locals 9

    .line 453
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-virtual {v0}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 454
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 455
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    sget-object v0, Lo/dae;->fG:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 457
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 468
    new-instance v5, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-direct {v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;-><init>()V

    .line 469
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 471
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-virtual {v0}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/afk;

    .line 472
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v7}, Lo/afk;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/afo;->c(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 473
    const-string v0, "device_kind"

    invoke-virtual {v6, v0, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    const-string v0, "device_type"

    invoke-virtual {v7}, Lo/afk;->b()Lo/acl$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    invoke-virtual {v5, v6}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->setArguments(Landroid/os/Bundle;)V

    .line 477
    invoke-virtual {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 479
    :cond_0
    return-void
.end method

.method private onProductItemClick(I)V
    .locals 7

    .line 409
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->adapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mReconnectDevice:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 410
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "other device is connecting."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    return-void

    .line 413
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-virtual {v0}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 414
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-virtual {v0}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/afj;

    .line 415
    invoke-virtual {v4}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 417
    new-instance v6, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mContext:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 419
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_cancel_unbind_device:I

    invoke-virtual {v6, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    .line 420
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_yes:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$2;

    invoke-direct {v1, p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;Lo/afj;)V

    invoke-virtual {v6, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 429
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_no:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$3;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)V

    invoke-virtual {v6, v0, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 435
    invoke-virtual {v6}, Lo/egy$b;->a()Lo/egy;

    move-result-object v5

    .line 436
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egy;->setCancelable(Z)V

    .line 437
    invoke-virtual {v5}, Lo/egy;->show()V

    .line 438
    goto :goto_1

    .line 439
    :cond_1
    new-instance v5, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-direct {v5}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;-><init>()V

    .line 440
    invoke-virtual {v4}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ahd;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 441
    new-instance v5, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-direct {v5}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;-><init>()V

    goto :goto_0

    .line 442
    :cond_2
    invoke-static {v4}, Lo/ake;->d(Lo/afj;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 443
    new-instance v5, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-direct {v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;-><init>()V

    .line 445
    :cond_3
    :goto_0
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 446
    const-string v0, "productId"

    invoke-virtual {v4}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 447
    invoke-virtual {v5, v6}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 448
    invoke-virtual {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 451
    :cond_4
    :goto_1
    return-void
.end method

.method private onWearDeviceClick(I)V
    .locals 8

    .line 541
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-virtual {v0}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ahh;

    .line 542
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->adapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mReconnectDevice:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mReconnectDevice:Ljava/lang/String;

    invoke-virtual {v4}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Lo/ahh;->e()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 543
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "other devices is connection,can not start activity."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 544
    return-void

    .line 546
    :cond_0
    invoke-virtual {v4}, Lo/ahh;->e()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 547
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click onWearDeviceClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 548
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 549
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mContext:Landroid/content/Context;

    const-string v1, "com.huawei.ui.homewear21.home.WearHomeActivity"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 550
    const-string v0, "device_id"

    invoke-virtual {v4}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 551
    invoke-virtual {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->startActivity(Landroid/content/Intent;)V

    .line 552
    goto/16 :goto_0

    .line 553
    :cond_1
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->c()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 554
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 555
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mContext:Landroid/content/Context;

    const-string v1, "com.huawei.ui.homewear21.home.WearHomeActivity"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 556
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->c()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ahh;

    .line 557
    const-string v7, ""

    .line 558
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 559
    invoke-virtual {v6}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v7

    .line 561
    :cond_2
    const-string v0, "device_id"

    invoke-virtual {v5, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 562
    invoke-virtual {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->startActivity(Landroid/content/Intent;)V

    .line 563
    goto :goto_0

    .line 565
    :cond_3
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 566
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mContext:Landroid/content/Context;

    const-string v1, "com.huawei.ui.homehealth.deviceManagerCard.DeviceManagerWearNoConnect"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 567
    const-string v0, "device_name"

    invoke-virtual {v4}, Lo/ahh;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 568
    const-string v0, "device_identify"

    invoke-virtual {v4}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 569
    const-string v0, "device_picID"

    invoke-virtual {v4}, Lo/ahh;->g()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 570
    const-string v0, "device_type"

    invoke-virtual {v4}, Lo/ahh;->b()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 571
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 572
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onclick wear not connected name:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/ahh;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "identify:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 575
    :goto_0
    return-void
.end method

.method private onWearItemClick(I)V
    .locals 8

    .line 486
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-virtual {v0}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 488
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 489
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click wear device group start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-virtual {v0}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aez;

    .line 491
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "click wear device group name:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/aez;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 492
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 493
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    sget-object v0, Lo/dae;->fG:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 497
    invoke-virtual {v4}, Lo/aez;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_add_device_smart_band:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 499
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 500
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 501
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mContext:Landroid/content/Context;

    const-string v1, "com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity"

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 502
    const-string v0, "style"

    const/4 v1, 0x2

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 503
    const-string v0, "isHeartRateDevice"

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->isHeartRateDevice:I

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 504
    const/4 v0, 0x1

    invoke-virtual {p0, v7, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 505
    goto/16 :goto_0

    :cond_0
    invoke-virtual {v4}, Lo/aez;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_add_device_smart_watch:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 507
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 508
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 509
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mContext:Landroid/content/Context;

    const-string v1, "com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity"

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 510
    const-string v0, "style"

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 511
    const-string v0, "isHeartRateDevice"

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->isHeartRateDevice:I

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 512
    const/4 v0, 0x1

    invoke-virtual {p0, v7, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 513
    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Lo/aez;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_add_device_smart_headphones:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 515
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 516
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 517
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mContext:Landroid/content/Context;

    const-string v1, "com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity"

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 518
    const-string v0, "style"

    const/4 v1, 0x4

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 519
    const-string v0, "isHeartRateDevice"

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->isHeartRateDevice:I

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 520
    const/4 v0, 0x1

    invoke-virtual {p0, v7, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 524
    :cond_2
    :goto_0
    return-void
.end method

.method private registerBatteryBroadcast()V
    .locals 5

    .line 1360
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter registerBattery"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1361
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.BATTERY_LEVEL"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 1362
    const-string v0, "com.huawei.bone.action.BATTERY_LEVEL"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1363
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mDeviceBatteryReceiver:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 1364
    return-void
.end method

.method private setAdapterData()V
    .locals 12

    .line 173
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v4

    .line 174
    const-string v5, ""

    .line 175
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    const-string v0, "root_in_me"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 176
    const-string v0, "root_in_me"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 178
    :cond_0
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "source = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->isFromFitnessAdvice:Z

    if-nez v0, :cond_1

    .line 180
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getBindDevice()V

    .line 181
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->isDiscover:Z

    if-eqz v0, :cond_1

    .line 182
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setAdapterData isFromDiscover"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    invoke-direct {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->addBindTitle(Ljava/lang/String;)V

    .line 184
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->addWearTitle()V

    .line 185
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->addProductData()V

    .line 186
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->addMoreTitle()V

    .line 189
    :cond_1
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 191
    new-instance v6, Lo/aez;

    invoke-direct {v6}, Lo/aez;-><init>()V

    .line 192
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_add_device_smart_watch:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/aez;->b(Ljava/lang/String;)V

    .line 193
    sget v0, Lcom/huawei/plugindevice/R$drawable;->hw_health_device_binding_watch_list:I

    invoke-virtual {v6, v0}, Lo/aez;->a(I)V

    .line 195
    new-instance v7, Lo/aez;

    invoke-direct {v7}, Lo/aez;-><init>()V

    .line 196
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_add_device_smart_band:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/aez;->b(Ljava/lang/String;)V

    .line 197
    sget v0, Lcom/huawei/plugindevice/R$drawable;->hw_health_device_binding_band_list:I

    invoke-virtual {v7, v0}, Lo/aez;->a(I)V

    .line 199
    new-instance v8, Lo/aez;

    invoke-direct {v8}, Lo/aez;-><init>()V

    .line 200
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_add_device_smart_headphones:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/aez;->b(Ljava/lang/String;)V

    .line 201
    sget v0, Lcom/huawei/plugindevice/R$drawable;->hw_health_device_binding_headset_list:I

    invoke-virtual {v8, v0}, Lo/aez;->a(I)V

    .line 203
    new-instance v9, Lo/afa;

    invoke-direct {v9}, Lo/afa;-><init>()V

    .line 204
    invoke-virtual {v9, v7}, Lo/afa;->a(Ljava/lang/Object;)V

    .line 205
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lo/afa;->e(I)V

    .line 207
    new-instance v10, Lo/afa;

    invoke-direct {v10}, Lo/afa;-><init>()V

    .line 208
    invoke-virtual {v10, v6}, Lo/afa;->a(Ljava/lang/Object;)V

    .line 209
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lo/afa;->e(I)V

    .line 211
    new-instance v11, Lo/afa;

    invoke-direct {v11}, Lo/afa;-><init>()V

    .line 212
    invoke-virtual {v11, v8}, Lo/afa;->a(Ljava/lang/Object;)V

    .line 213
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lo/afa;->e(I)V

    .line 215
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 218
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    :cond_2
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->groupList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 223
    new-instance v7, Lo/afa;

    invoke-direct {v7}, Lo/afa;-><init>()V

    .line 224
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->groupList:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/afa;->a(Ljava/lang/Object;)V

    .line 225
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/afa;->e(I)V

    .line 226
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 228
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->adapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->notifyDataSetChanged()V

    .line 229
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setAdapterData deviceList.size"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    return-void
.end method

.method public static setFragment(Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/ref/WeakReference<Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;>;)V"
        }
    .end annotation

    .line 103
    sput-object p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mFragment:Ljava/lang/ref/WeakReference;

    .line 104
    return-void
.end method

.method private showBandUnavailableDialog(Landroid/content/Context;)V
    .locals 7

    .line 1325
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBandUnavailableDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1327
    const-string v0, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-static {p1, v0}, Lo/dbf;->h(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    .line 1328
    const-string v0, "DeviceBindingFragment"

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

    .line 1329
    if-nez v4, :cond_0

    .line 1330
    return-void

    .line 1332
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mDlg:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1333
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mDlg:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1334
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBandUnavailableDialog Already show!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1335
    return-void

    .line 1339
    :cond_1
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_band_is_unavailable_tip_string_newphone:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 1340
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_service_area_notice_title:I

    .line 1341
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 1342
    invoke-virtual {v0, v5}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$7;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$7;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)V

    .line 1343
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v6

    .line 1348
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mDlg:Lo/egv;

    .line 1349
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mDlg:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 1350
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mDlg:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1351
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mDlg:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1353
    :cond_2
    return-void
.end method

.method private unRegisterBatteryBroadcast()V
    .locals 5

    .line 1370
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mContext:Landroid/content/Context;

    sget-object v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mDeviceBatteryReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1375
    goto :goto_0

    .line 1371
    :catch_0
    move-exception v4

    .line 1372
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unRegisterBatteryBroadcast "

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

    .line 1375
    goto :goto_0

    .line 1373
    :catch_1
    move-exception v4

    .line 1374
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unRegisterBatteryBroadcast "

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

    .line 1376
    :goto_0
    return-void
.end method


# virtual methods
.method protected init()V
    .locals 6

    .line 233
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter init()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getBundleFromDeviceMainActivity()Landroid/os/Bundle;

    move-result-object v4

    .line 236
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 237
    const-string v0, "isFromFitnessAdvice"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->isFromFitnessAdvice:Z

    .line 238
    const-string v0, "isHeartRateDevice"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->isHeartRateDevice:I

    .line 242
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 243
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init deviceList.size"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->isFromFitnessAdvice:Z

    if-eqz v0, :cond_2

    .line 245
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->groupList:Ljava/util/ArrayList;

    .line 246
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->c()Lo/aey;

    move-result-object v0

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    invoke-virtual {v0, v1}, Lo/aey;->c(Lo/acl$a;)Lo/afk;

    move-result-object v5

    .line 247
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 248
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->groupList:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    :cond_1
    goto :goto_0

    .line 251
    :cond_2
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->c()Lo/aey;

    move-result-object v0

    invoke-virtual {v0}, Lo/aey;->d()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->groupList:Ljava/util/ArrayList;

    .line 256
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_list_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->myDevicesListview:Landroid/widget/ListView;

    .line 257
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mContext:Landroid/content/Context;

    invoke-direct {v0, p0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;Ljava/util/ArrayList;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->adapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    .line 258
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->myDevicesListview:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->adapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 259
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->adapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)V

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->setOnItemReconnectListener(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$onItemReconnectListener;)V

    .line 339
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->myDevicesListview:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 342
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->isFromFitnessAdvice:Z

    if-eqz v0, :cond_4

    .line 343
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_user_profile_health_show_all_devices:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 344
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 345
    const-string v0, "title"

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_user_profile_health_show_all_devices:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 347
    :cond_3
    invoke-super {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->setTitle(Ljava/lang/String;)V

    .line 348
    goto :goto_1

    .line 349
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_user_profile_health_show_all_devices:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->setTitle(Ljava/lang/String;)V

    .line 352
    :goto_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->showButton(ZLandroid/view/View$OnClickListener;)V

    .line 353
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->showMoreButton(ZLandroid/view/View$OnClickListener;)V

    .line 354
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->setAdapterData()V

    .line 355
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 357
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 359
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 360
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mNonLocalBroadcastReceiver:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v5, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 362
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->registerBatteryBroadcast()V

    .line 364
    :cond_5
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getBundleFromDeviceMainActivity()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 365
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getBundleFromDeviceMainActivity()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "isFromDiscover"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->isDiscover:Z

    .line 366
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isDiscover :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->isDiscover:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    :cond_6
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 528
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult requestCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "resultCode"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    const/4 v0, 0x2

    if-ne v0, p2, :cond_0

    .line 530
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult wear pair success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 533
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 534
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 108
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->onCreate(Landroid/os/Bundle;)V

    .line 109
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mainActivity:Landroid/app/Activity;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mContext:Landroid/content/Context;

    .line 110
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->setFragment(Ljava/lang/ref/WeakReference;)V

    .line 111
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 115
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    .line 116
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->init()V

    .line 117
    return-object v0
.end method

.method public onDestroy()V
    .locals 5

    .line 391
    invoke-super {p0}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->onDestroy()V

    .line 392
    sget-object v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mFragment:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 393
    sget-object v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V

    .line 395
    :cond_0
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 396
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->unRegisterBatteryBroadcast()V

    .line 398
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterWearBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 399
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->mNonLocalBroadcastReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 404
    goto :goto_0

    .line 400
    :catch_0
    move-exception v4

    .line 401
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    goto :goto_0

    .line 402
    :catch_1
    move-exception v4

    .line 403
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 406
    :cond_1
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 384
    invoke-super {p0}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->onResume()V

    .line 385
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 386
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume deviceList.size"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->deviceList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->setAdapterData()V

    .line 388
    return-void
.end method
