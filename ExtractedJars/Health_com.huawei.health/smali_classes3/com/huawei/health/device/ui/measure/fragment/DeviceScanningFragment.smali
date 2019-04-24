.class public Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$BindCallback;,
        Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;
    }
.end annotation


# static fields
.field private static final DEVICE_SCAN_REFRESH:I = 0x0

.field private static final DEVICE_SCAN_TIMEOUT:I = 0x1


# instance fields
.field private mAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;

.field private mHandler:Landroid/os/Handler;

.field private mHandlerCallback:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$BindCallback;

.field private mHwProgressBar:Lhuawei/widget/HwProgressBar;

.field private mListItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/acl;>;"
        }
    .end annotation
.end field

.field private mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

.field private mProductId:Ljava/lang/String;

.field private mSearchLayout:Landroid/widget/LinearLayout;

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

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mListItems:Ljava/util/ArrayList;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->searchMoreDeviceText:Landroid/widget/TextView;

    .line 49
    sget-object v0, Lo/acl$a;->b:Lo/acl$a;

    invoke-virtual {v0}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->scan_kind:Ljava/lang/String;

    .line 58
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mHandler:Landroid/os/Handler;

    .line 164
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Ljava/util/ArrayList;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mListItems:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;Lo/acl;)Z
    .locals 1

    .line 42
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->isDeviceExistInmListItems(Lo/acl;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Landroid/os/Handler;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mProductId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 42
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;Ljava/lang/String;)V
    .locals 0

    .line 42
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->setTitle(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;)Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->scan_kind:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 42
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method private isDeviceExistInmListItems(Lo/acl;)Z
    .locals 4

    .line 97
    const/4 v2, 0x0

    .line 100
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mListItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 101
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mListItems:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acl;

    invoke-virtual {v0}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    const/4 v2, 0x1

    .line 103
    return v2

    .line 100
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 107
    :cond_1
    return v2
.end method


# virtual methods
.method public onBackPressed()Z
    .locals 1

    .line 316
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->stopScan()V

    .line 317
    const/4 v0, 0x1

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 113
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanningFragment onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 115
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v4

    .line 116
    const-string v0, "productId"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mProductId:Ljava/lang/String;

    .line 117
    const-string v0, "scan_kind"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->scan_kind:Ljava/lang/String;

    .line 118
    const-string v0, "title"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mTitle:Ljava/lang/String;

    .line 119
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    .line 123
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanningFragment onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 125
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_measure_search_device:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 127
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_device_search_layout:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mSearchLayout:Landroid/widget/LinearLayout;

    .line 128
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mProductId:Ljava/lang/String;

    const-string v1, "9bf158ba-49b0-46aa-9fdf-ed75da1569cf"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 129
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mSearchLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 130
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mSearchLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 132
    :cond_0
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_device_scanning_pb:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mHwProgressBar:Lhuawei/widget/HwProgressBar;

    .line 133
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mHwProgressBar:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 135
    sget v0, Lcom/huawei/plugindevice/R$id;->device_measure_search_prompt:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 136
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_device_searching:I

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(I)V

    .line 137
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 139
    sget v0, Lcom/huawei/plugindevice/R$id;->divider_line:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    .line 142
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 143
    goto :goto_0

    .line 144
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mSearchLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 145
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mSearchLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 149
    :cond_2
    :goto_0
    sget v0, Lcom/huawei/plugindevice/R$id;->device_more_search_text:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->searchMoreDeviceText:Landroid/widget/TextView;

    .line 150
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->searchMoreDeviceText:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 152
    sget v0, Lcom/huawei/plugindevice/R$id;->data_source_activity_content_listview:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ListView;

    .line 153
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mListItems:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;

    .line 154
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$BindCallback;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$BindCallback;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$1;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mHandlerCallback:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$BindCallback;

    .line 155
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;

    invoke-virtual {v6, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v6, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 157
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 158
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 160
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mTitle:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->setTitle(Ljava/lang/String;)V

    .line 161
    return-object v4
.end method

.method public onDestroy()V
    .locals 6

    .line 349
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanningFragment onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 351
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->stopScan()V

    .line 352
    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mListItems:Ljava/util/ArrayList;

    monitor-enter v4

    .line 353
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;

    if-eqz v0, :cond_0

    .line 354
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 356
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 357
    :goto_0
    return-void
.end method

.method public onStart()V
    .locals 6

    .line 302
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanningFragment onStart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onStart()V

    .line 305
    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mListItems:Ljava/util/ArrayList;

    monitor-enter v4

    .line 306
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mListItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 307
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;

    if-eqz v0, :cond_0

    .line 308
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mListItems:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$ProductListAdapter;->refreshData(Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 310
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 311
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->startBinding()V

    .line 312
    return-void
.end method

.method public startBinding()V
    .locals 7

    .line 321
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mProductId:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 322
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceScanningFragment startBinding mProductId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v4

    .line 324
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 325
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->searchMoreDeviceText:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 326
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanningFragment productInfo is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 327
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, v4, Lo/afj;->f:Lo/acf;

    iget-object v2, v4, Lo/afj;->h:Lo/ace;

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mHandlerCallback:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$BindCallback;

    invoke-virtual {v0, v1, v2, v3}, Lo/afd;->c(Lo/acf;Lo/ace;Lo/aby;)Z

    goto :goto_0

    .line 330
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->searchMoreDeviceText:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 331
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanningFragment for more heart rate device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    new-instance v5, Lo/acf$d;

    invoke-direct {v5}, Lo/acf$d;-><init>()V

    .line 333
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/acf$d;->b(I)Lo/acf$d;

    .line 334
    const-string v0, "10"

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, v0, v1}, Lo/acf$d;->e(ILjava/util/concurrent/TimeUnit;)Lo/acf$d;

    .line 335
    const-string v0, "moredevice"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->scan_kind:Ljava/lang/String;

    sget-object v2, Lo/ace$e;->b:Lo/ace$e;

    invoke-static {v0, v1, v2}, Lo/ace;->e(Ljava/lang/String;Ljava/lang/String;Lo/ace$e;)Lo/ace;

    move-result-object v6

    .line 336
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v5}, Lo/acf$d;->d()Lo/acf;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mHandlerCallback:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$BindCallback;

    invoke-virtual {v0, v1, v6, v2}, Lo/afd;->c(Lo/acf;Lo/ace;Lo/aby;)Z

    .line 340
    :cond_1
    :goto_0
    return-void
.end method

.method public stopScan()V
    .locals 1

    .line 343
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->a()V

    .line 344
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->mHandlerCallback:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment$BindCallback;

    .line 345
    return-void
.end method
