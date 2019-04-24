.class public Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$BindUniversalCallback;,
        Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$BindCallback;,
        Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$ProductListAdapter;
    }
.end annotation


# static fields
.field private static final DEVICE_SCAN_REFRESH:I = 0x0

.field private static final DEVICE_SCAN_TIMEOUT:I = 0x1


# instance fields
.field private mAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$ProductListAdapter;

.field private mHandler:Landroid/os/Handler;

.field private mHandlerUniversalCallback:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$BindUniversalCallback;

.field private mHwProgressBar:Lhuawei/widget/HwProgressBar;

.field private mListItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/hihealth/device/open/HealthDevice;>;"
        }
    .end annotation
.end field

.field private mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

.field private mProductId:Ljava/lang/String;

.field private mTitle:Ljava/lang/String;

.field private scan_kind:Ljava/lang/String;

.field private searchMoreDeviceText:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mListItems:Ljava/util/ArrayList;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->searchMoreDeviceText:Landroid/widget/TextView;

    .line 49
    sget-object v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->HDK_UNKNOWN:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    invoke-virtual {v0}, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->scan_kind:Ljava/lang/String;

    .line 57
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mHandler:Landroid/os/Handler;

    .line 149
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Ljava/util/ArrayList;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mListItems:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;Lcom/huawei/hihealth/device/open/HealthDevice;)Z
    .locals 1

    .line 42
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->isDeviceExistInmListItems(Lcom/huawei/hihealth/device/open/HealthDevice;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Landroid/os/Handler;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$ProductListAdapter;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$ProductListAdapter;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mProductId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 42
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;Ljava/lang/String;)V
    .locals 0

    .line 42
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->setTitle(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->scan_kind:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 42
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method private isDeviceExistInmListItems(Lcom/huawei/hihealth/device/open/HealthDevice;)Z
    .locals 4

    .line 95
    const/4 v2, 0x0

    .line 98
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mListItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_2

    .line 99
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mListItems:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/device/open/HealthDevice;

    invoke-virtual {v0}, Lcom/huawei/hihealth/device/open/HealthDevice;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hihealth/device/open/HealthDevice;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mListItems:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/device/open/HealthDevice;

    invoke-virtual {v0}, Lcom/huawei/hihealth/device/open/HealthDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hihealth/device/open/HealthDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 100
    :cond_0
    const/4 v2, 0x1

    .line 101
    return v2

    .line 98
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 105
    :cond_2
    return v2
.end method


# virtual methods
.method public onBackPressed()Z
    .locals 1

    .line 292
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->stopScan()V

    .line 293
    const/4 v0, 0x1

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 111
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanningUniversalFragment onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 113
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v4

    .line 114
    const-string v0, "productId"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mProductId:Ljava/lang/String;

    .line 115
    const-string v0, "scan_kind"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->scan_kind:Ljava/lang/String;

    .line 116
    const-string v0, "title"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mTitle:Ljava/lang/String;

    .line 117
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    .line 121
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanningUniversalFragment onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 123
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_measure_search_device:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 124
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_device_scanning_pb:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mHwProgressBar:Lhuawei/widget/HwProgressBar;

    .line 125
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mHwProgressBar:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 127
    sget v0, Lcom/huawei/plugindevice/R$id;->device_measure_search_prompt:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 128
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_device_searching:I

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(I)V

    .line 129
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 131
    sget v0, Lcom/huawei/plugindevice/R$id;->device_more_search_text:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->searchMoreDeviceText:Landroid/widget/TextView;

    .line 132
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->searchMoreDeviceText:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 134
    sget v0, Lcom/huawei/plugindevice/R$id;->divider_line:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    .line 135
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 137
    sget v0, Lcom/huawei/plugindevice/R$id;->data_source_activity_content_listview:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ListView;

    .line 138
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$ProductListAdapter;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mListItems:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$ProductListAdapter;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$ProductListAdapter;

    .line 139
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$BindUniversalCallback;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$BindUniversalCallback;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$1;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mHandlerUniversalCallback:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$BindUniversalCallback;

    .line 140
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$ProductListAdapter;

    invoke-virtual {v8, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 141
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v8, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 142
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 143
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mTitle:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->setTitle(Ljava/lang/String;)V

    .line 146
    return-object v4
.end method

.method public onDestroy()V
    .locals 4

    .line 320
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanningFragment onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 322
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->stopScan()V

    .line 323
    return-void
.end method

.method public onStart()V
    .locals 6

    .line 278
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanningFragment onStart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onStart()V

    .line 281
    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mListItems:Ljava/util/ArrayList;

    monitor-enter v4

    .line 282
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mListItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 283
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$ProductListAdapter;

    if-eqz v0, :cond_0

    .line 284
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$ProductListAdapter;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mListItems:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$ProductListAdapter;->refreshData(Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 286
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 287
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->startBinding()V

    .line 288
    return-void
.end method

.method public startBinding()V
    .locals 6

    .line 297
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mProductId:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 298
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceScanningFragment startBinding mProductId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v4

    .line 300
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v5

    .line 301
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 302
    invoke-virtual {v4}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lo/afq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lo/afj;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lo/acq;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->searchMoreDeviceText:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 304
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanningFragment productInfo is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v4}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->mHandlerUniversalCallback:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$BindUniversalCallback;

    invoke-virtual {v0, v1, v2}, Lo/afd;->d(Ljava/lang/String;Lcom/huawei/hihealth/device/open/IDeviceEventHandler;)Z

    goto :goto_0

    .line 307
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->searchMoreDeviceText:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 308
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanningFragment for more heart rate device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanningFragment prductinfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    :cond_1
    :goto_0
    return-void
.end method

.method public stopScan()V
    .locals 1

    .line 315
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->c()V

    .line 316
    return-void
.end method
