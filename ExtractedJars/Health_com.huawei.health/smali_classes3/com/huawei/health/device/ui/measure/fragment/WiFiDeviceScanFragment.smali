.class public Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;,
        Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ScanCallBack;,
        Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;
    }
.end annotation


# static fields
.field private static final MSG_REFRESH_DATA:I = 0x1

.field private static final MSG_SCAN_DEVICE_FINISH:I = 0x3

.field private static final MSG_START_SCAN_DEVICE:I = 0x2

.field private static final TAG:Ljava/lang/String; = "WiFiDeviceScanFragment"

.field private static final mScanCount:I = 0xa


# instance fields
.field private mAdapter:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;

.field private mAnim:Landroid/graphics/drawable/AnimationDrawable;

.field private mConfigMode:I

.field private mDevices:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/ajd;>;"
        }
    .end annotation
.end field

.field private mListView:Landroid/widget/ListView;

.field private mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

.field private mProductId:Ljava/lang/String;

.field private mProductinfo:Lo/afj;

.field private mScanCallBack:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ScanCallBack;

.field private mScanManager:Lo/akj;

.field private mScanTipView:Landroid/widget/TextView;

.field private mScanWaitingView:Landroid/widget/ImageView;

.field private mSearchWattingLayout:Landroid/widget/LinearLayout;

.field private mWiFiSSid:Ljava/lang/String;

.field private mWifiPd:Ljava/lang/String;

.field private myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mDevices:Ljava/util/ArrayList;

    .line 359
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Z
    .locals 1

    .line 42
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->isDestory()Z

    move-result v0

    return v0
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Ljava/util/ArrayList;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->updataListView(Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mWifiPd:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)I
    .locals 1

    .line 42
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mConfigMode:I

    return v0
.end method

.method static synthetic access$1200(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 42
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->startScan()V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Z)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->initAnim(Z)V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Ljava/util/ArrayList;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mDevices:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 42
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 1

    .line 42
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->removeCoapRepeatDevice(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mProductId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mWiFiSSid:Ljava/lang/String;

    return-object v0
.end method

.method private initAnim(Z)V
    .locals 4

    .line 188
    if-nez p1, :cond_1

    .line 189
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mAnim:Landroid/graphics/drawable/AnimationDrawable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 190
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mAnim:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 192
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mSearchWattingLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 194
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mAnim:Landroid/graphics/drawable/AnimationDrawable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 195
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mAnim:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 197
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mSearchWattingLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 199
    :goto_0
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initAnim isStart:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 200
    return-void
.end method

.method private initData()V
    .locals 5

    .line 140
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mProductId:Ljava/lang/String;

    .line 141
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "outhName"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mWiFiSSid:Ljava/lang/String;

    .line 142
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "outhPd"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mWifiPd:Ljava/lang/String;

    .line 143
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "config_mode"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mConfigMode:I

    .line 145
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData mProductId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 147
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onBackPressed()Z

    .line 148
    return-void

    .line 150
    :cond_0
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mProductId:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 151
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mProductinfo:Lo/afj;

    .line 152
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/akj;->b(Landroid/content/Context;)Lo/akj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mScanManager:Lo/akj;

    .line 153
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ScanCallBack;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ScanCallBack;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mScanCallBack:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ScanCallBack;

    .line 154
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;

    .line 155
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_scan_title:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 156
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->setTitle(Ljava/lang/String;)V

    .line 157
    return-void
.end method

.method private initView()V
    .locals 2

    .line 160
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_scanning_img:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mScanWaitingView:Landroid/widget/ImageView;

    .line 161
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_content_listview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mListView:Landroid/widget/ListView;

    .line 162
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_measure_search_prompt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mScanTipView:Landroid/widget/TextView;

    .line 163
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_search_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mSearchWattingLayout:Landroid/widget/LinearLayout;

    .line 165
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mScanTipView:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_device_searching:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 166
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mScanTipView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 167
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mScanWaitingView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mAnim:Landroid/graphics/drawable/AnimationDrawable;

    .line 168
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mDevices:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;

    .line 169
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mListView:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 170
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mListView:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 171
    return-void
.end method

.method private isDestory()Z
    .locals 5

    .line 109
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    .line 110
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 111
    :cond_0
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity is Destroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 112
    const/4 v0, 0x1

    return v0

    .line 114
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_2

    .line 115
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyHandler mFragment is not add"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 116
    const/4 v0, 0x1

    return v0

    .line 118
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private isNeedScanMode(Lo/ajd;)Z
    .locals 2

    .line 311
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mConfigMode:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 312
    const-string v0, "softap"

    invoke-virtual {p1}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 313
    const/4 v0, 0x1

    return v0

    .line 315
    :cond_0
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mConfigMode:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 316
    const-string v0, "coap"

    invoke-virtual {p1}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "wifiap"

    .line 317
    invoke-virtual {p1}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 318
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 321
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private removeCoapRepeatDevice(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/ajd;>;)Ljava/util/ArrayList<Lo/ajd;>;"
        }
    .end annotation

    .line 328
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 329
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 330
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ajd;

    .line 331
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "info.getSourceType() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lo/ajd;->h()Ljava/lang/String;

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
    const-string v0, "coap"

    invoke-virtual {v7}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 333
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 335
    :cond_0
    const-string v0, "wifiap"

    invoke-virtual {v7}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 336
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 338
    :cond_1
    goto :goto_0

    .line 339
    :cond_2
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeRepeatDevice, coap devices size:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 340
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 341
    :cond_3
    return-object p1

    .line 343
    :cond_4
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ajd;

    .line 344
    invoke-virtual {v7}, Lo/ajd;->d()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    .line 345
    goto :goto_1

    .line 347
    :cond_5
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_6
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/ajd;

    .line 348
    invoke-virtual {v9}, Lo/ajd;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v9}, Lo/ajd;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    .line 349
    goto :goto_2

    .line 351
    :cond_7
    invoke-virtual {v9}, Lo/ajd;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lo/ajd;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v9}, Lo/ajd;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lo/ajd;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 352
    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 354
    :cond_8
    goto :goto_2

    .line 355
    :cond_9
    goto :goto_1

    .line 356
    :cond_a
    return-object p1
.end method

.method private startScan()V
    .locals 4

    .line 228
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mProductinfo:Lo/afj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 229
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mScanManager:Lo/akj;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mProductinfo:Lo/afj;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mScanCallBack:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ScanCallBack;

    const/16 v3, 0xa

    invoke-virtual {v0, v1, v3, v2}, Lo/akj;->d(Lo/afj;ILo/ajn;)V

    goto :goto_0

    .line 231
    :cond_0
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScan Get device infomation is fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 233
    :goto_0
    return-void
.end method

.method private stopScan()V
    .locals 1

    .line 223
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->initAnim(Z)V

    .line 224
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mScanManager:Lo/akj;

    invoke-virtual {v0}, Lo/akj;->d()V

    .line 225
    return-void
.end method

.method private updataListView(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/ajd;>;)V"
        }
    .end annotation

    .line 100
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updataListView "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mDevices:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 103
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mDevices:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 104
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mDevices:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;->refreshData(Ljava/util/ArrayList;)V

    .line 106
    :cond_0
    return-void
.end method


# virtual methods
.method public onBackPressed()Z
    .locals 1

    .line 204
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->stopScan()V

    .line 205
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->popupFragment(Ljava/lang/Class;)V

    .line 206
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 123
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 124
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 125
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 129
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    .line 130
    sget v0, Lcom/huawei/plugindevice/R$layout;->wifi_device_search_layout:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->child:Landroid/view/View;

    .line 131
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->initData()V

    .line 132
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->initView()V

    .line 133
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 134
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->child:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 136
    :cond_0
    return-object v2
.end method

.method public onDestroy()V
    .locals 4

    .line 218
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 219
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 220
    return-void
.end method

.method public onStart()V
    .locals 5

    .line 175
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 176
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onStart()V

    .line 177
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mDevices:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 178
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;

    if-eqz v0, :cond_0

    .line 179
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$ProductListAdapter;->notifyDataSetChanged()V

    .line 181
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->initAnim(Z)V

    .line 182
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->mainActivity:Landroid/app/Activity;

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/net/wifi/WifiManager;

    .line 183
    invoke-virtual {v4}, Landroid/net/wifi/WifiManager;->startScan()Z

    .line 184
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;

    const/4 v1, 0x2

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$MyHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 185
    return-void
.end method

.method public onStop()V
    .locals 4

    .line 211
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStop"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 212
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onStop()V

    .line 213
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->stopScan()V

    .line 214
    return-void
.end method

.method public removeRepeatDevice(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ajd;>;)Ljava/util/ArrayList<Lo/ajd;>;"
        }
    .end annotation

    .line 278
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 279
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

    .line 280
    invoke-virtual {v6}, Lo/ajd;->c()Ljava/lang/String;

    move-result-object v7

    .line 281
    invoke-virtual {v6}, Lo/ajd;->a()Ljava/lang/String;

    move-result-object v8

    .line 282
    invoke-virtual {v6}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v9

    .line 283
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 284
    :cond_0
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeRepeatDevice ssid or productId or type is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 285
    goto :goto_0

    .line 287
    :cond_1
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeRepeatDevice ssid,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 288
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeRepeatDevice productId,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 289
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeRepeatDevice type,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 290
    const/4 v10, 0x1

    .line 291
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 292
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/ajd;

    .line 293
    if-eqz v12, :cond_2

    invoke-virtual {v12}, Lo/ajd;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v12}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 294
    const/4 v10, 0x0

    .line 295
    goto :goto_2

    .line 297
    :cond_2
    goto :goto_1

    .line 299
    :cond_3
    :goto_2
    if-nez v10, :cond_4

    .line 300
    goto/16 :goto_0

    .line 302
    :cond_4
    if-eqz v10, :cond_5

    invoke-direct {p0, v6}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->isNeedScanMode(Lo/ajd;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 303
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 305
    :cond_5
    goto/16 :goto_0

    .line 306
    :cond_6
    const-string v0, "WiFiDeviceScanFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeRepeatDevice all add info is:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 307
    return-object v4
.end method
