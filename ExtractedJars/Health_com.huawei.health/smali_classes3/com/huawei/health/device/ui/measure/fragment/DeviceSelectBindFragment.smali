.class public Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;
.super Lcom/huawei/health/device/ui/measure/fragment/ListFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;,
        Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$MyIResourceFileListener;
    }
.end annotation


# static fields
.field private static final AM16_PRODUCTID:Ljava/lang/String; = "6d5416d9-2167-41df-ab10-c492e152b44f"

.field private static final HONOR_DEVICE:Ljava/lang/String; = "honor"

.field private static final HUAWEI_DEVICE:Ljava/lang/String; = "huawei"

.field private static final HUAWEI_FIT:Ljava/lang/String; = "HUAWEI FIT"

.field private static final METIS_PRODUCTID:Ljava/lang/String; = "9323f6b7-b459-44f4-a698-988d1769832a"

.field private static final TO_FAILED:I = 0x2

.field private static final TO_REFRESH:I = 0x1


# instance fields
.field private getAdapterData:Ljava/lang/Runnable;

.field private isDownDevice:Z

.field private kind:Lo/acl$a;

.field private mBackToFinish:Z

.field private mHandler:Landroid/os/Handler;

.field private mHonor:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afj;>;"
        }
    .end annotation
.end field

.field private mHuawei:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afj;>;"
        }
    .end annotation
.end field

.field private mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

.field private mOther:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afj;>;"
        }
    .end annotation
.end field

.field private mWeightListAdapter:Lo/agt;

.field protected productInfos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afj;>;"
        }
    .end annotation
.end field

.field private productListAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;

.field private toDownloadList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 58
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;-><init>()V

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->productInfos:Ljava/util/ArrayList;

    .line 63
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mHuawei:Ljava/util/ArrayList;

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mHonor:Ljava/util/ArrayList;

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mOther:Ljava/util/ArrayList;

    .line 68
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->isDownDevice:Z

    .line 76
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->toDownloadList:Ljava/util/ArrayList;

    .line 77
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mBackToFinish:Z

    .line 78
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mHandler:Landroid/os/Handler;

    .line 338
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$3;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->getAdapterData:Ljava/lang/Runnable;

    .line 483
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$5;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)Lo/acl$a;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->kind:Lo/acl$a;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;Ljava/util/ArrayList;Lo/afj;Ljava/lang/String;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->sort(Ljava/util/ArrayList;Lo/afj;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;ILcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->handleClickEvent(ILcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)Lo/agt;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mWeightListAdapter:Lo/agt;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->productListAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 58
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;Lo/acl$a;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->initAdapterData(Lo/acl$a;)V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->switchDeviceScanningFragment()V

    return-void
.end method

.method static synthetic access$702(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;Z)Z
    .locals 0

    .line 58
    iput-boolean p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->isDownDevice:Z

    return p1
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)Ljava/lang/Runnable;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->getAdapterData:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)Landroid/os/Handler;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method private handleClickEvent(ILcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;)V
    .locals 9

    .line 491
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 492
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    sget-object v0, Lo/dae;->fC:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 494
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 495
    invoke-virtual {p2, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/afa;

    .line 496
    invoke-virtual {v5}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 497
    invoke-virtual {v5}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/afj;

    .line 498
    new-instance v7, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-direct {v7}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;-><init>()V

    .line 499
    invoke-static {v6}, Lo/ake;->d(Lo/afj;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 500
    new-instance v7, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-direct {v7}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;-><init>()V

    .line 502
    :cond_0
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 503
    const-string v0, "productId"

    invoke-virtual {v6}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 504
    invoke-virtual {v7, v8}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 505
    invoke-virtual {p0, v7}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 507
    :cond_1
    return-void
.end method

.method private init()V
    .locals 6

    .line 293
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DevcieSelectBindFragment-init"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "kind"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 295
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "back_to_finish"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mBackToFinish:Z

    .line 296
    invoke-static {v4}, Lo/acl$a;->valueOf(Ljava/lang/String;)Lo/acl$a;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->kind:Lo/acl$a;

    .line 297
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DevcieSelectBindFragment-------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->showMoreButton(ZLandroid/view/View$OnClickListener;)V

    .line 299
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->productInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 300
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_list_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->myDevicesListview:Landroid/widget/ListView;

    .line 301
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->kind:Lo/acl$a;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->initView(Lo/acl$a;)V

    .line 302
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->kind:Lo/acl$a;

    sget-object v1, Lo/acl$a;->c:Lo/acl$a;

    if-ne v0, v1, :cond_0

    .line 303
    new-instance v0, Lo/agt;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mainActivity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->productInfos:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Lo/agt;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mWeightListAdapter:Lo/agt;

    .line 304
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->myDevicesListview:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mWeightListAdapter:Lo/agt;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 305
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->myDevicesListview:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    goto :goto_0

    .line 327
    :cond_0
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mainActivity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->productInfos:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->productListAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;

    .line 328
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->myDevicesListview:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->productListAdapter:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 329
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->myDevicesListview:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 331
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "deviceType"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 332
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 333
    invoke-super {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->setTitle(Ljava/lang/String;)V

    .line 335
    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-super {p0, v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->showButton(ZLandroid/view/View$OnClickListener;)V

    .line 336
    return-void
.end method

.method private initAdapterData(Lo/acl$a;)V
    .locals 9

    .line 346
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->c()Lo/aey;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/aey;->c(Lo/acl$a;)Lo/afk;

    move-result-object v4

    .line 347
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->toDownloadList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 348
    if-eqz v4, :cond_3

    .line 349
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "home size="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lo/afk;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " more size="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lo/afk;->d:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    const/4 v5, 0x0

    :goto_0
    iget-object v0, v4, Lo/afk;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 351
    iget-object v0, v4, Lo/afk;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/afl;

    .line 352
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fileInfo.id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v6, Lo/afl;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lo/agx;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v6, Lo/afl;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afq;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, v6, Lo/afl;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 354
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, v6, Lo/afl;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v7

    .line 355
    if-eqz v7, :cond_0

    .line 356
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v8

    .line 357
    const/4 v0, 0x1

    iput v0, v8, Landroid/os/Message;->what:I

    .line 358
    iput-object v7, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 359
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 361
    :cond_0
    goto :goto_1

    .line 362
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->toDownloadList:Ljava/util/ArrayList;

    invoke-virtual {v6}, Lo/afl;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 363
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceSelectBindFragment file is not Exists "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lo/afl;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_2
    goto :goto_2

    .line 367
    :cond_3
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the productGroup is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    :goto_2
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->f()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->k()Z

    move-result v0

    if-nez v0, :cond_4

    .line 370
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceSelectBindFragment toDownloadList"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->toDownloadList:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->toDownloadList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->isDownDevice:Z

    if-nez v0, :cond_5

    .line 372
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->toDownloadList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/afq;->b(Ljava/util/ArrayList;)V

    goto :goto_3

    .line 375
    :cond_4
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->a()V

    .line 377
    :cond_5
    :goto_3
    return-void
.end method

.method private productInfosSort(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/afj;>;)V"
        }
    .end annotation

    .line 233
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 234
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mHonor:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 235
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mOther:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 236
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/afj;

    .line 237
    invoke-virtual {v2}, Lo/afj;->n()Lo/afj$a;

    move-result-object v3

    .line 238
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 239
    iget-object v4, v3, Lo/afj$a;->a:Ljava/lang/String;

    .line 240
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 241
    const-string v0, "huawei"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 242
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 243
    :cond_0
    const-string v0, "honor"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 244
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mHonor:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 247
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mOther:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    :cond_2
    :goto_1
    goto :goto_0

    .line 251
    :cond_3
    return-void
.end method

.method private query(Ljava/util/ArrayList;Lo/afj;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/afj;>;Lo/afj;)I"
        }
    .end annotation

    .line 260
    invoke-virtual {p2}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    .line 261
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/afj;

    .line 262
    invoke-virtual {v3}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v4

    .line 263
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 264
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 265
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0

    .line 268
    :cond_0
    goto :goto_0

    .line 269
    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method private sort(Ljava/util/ArrayList;Lo/afj;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/afj;>;Lo/afj;Ljava/lang/String;)V"
        }
    .end annotation

    .line 135
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 136
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sort null == getActivity()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    return-void

    .line 140
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 142
    new-instance v4, Lo/afj;

    const/4 v0, 0x1

    invoke-direct {v4, v0}, Lo/afj;-><init>(I)V

    .line 143
    const-string v0, "huawei"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 144
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_huawei_band:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/afj;->c(Ljava/lang/String;)V

    .line 145
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/afj;->a(Z)V

    .line 147
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/afj;->b(Z)V

    goto :goto_0

    .line 148
    :cond_1
    const-string v0, "honor"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 149
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_honor_band:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/afj;->c(Ljava/lang/String;)V

    .line 150
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/afj;->a(Z)V

    .line 152
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/afj;->b(Z)V

    goto :goto_0

    .line 154
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_user_profile_more:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/afj;->c(Ljava/lang/String;)V

    .line 155
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/afj;->a(Z)V

    .line 157
    :goto_0
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    goto/16 :goto_2

    .line 161
    :cond_3
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->productInfosSort(Ljava/util/ArrayList;)V

    .line 163
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->query(Ljava/util/ArrayList;Lo/afj;)I

    move-result v4

    .line 164
    const-string v0, "huawei"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 166
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_4

    .line 167
    new-instance v5, Lo/afj;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Lo/afj;-><init>(I)V

    .line 168
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_huawei_band:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/afj;->c(Ljava/lang/String;)V

    .line 169
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/afj;->a(Z)V

    .line 170
    const/4 v0, 0x0

    invoke-virtual {p1, v0, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 172
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/afj;->b(Z)V

    .line 174
    :cond_4
    const/4 v0, -0x1

    if-ne v0, v4, :cond_5

    .line 176
    const/4 v0, 0x1

    invoke-virtual {p1, v0, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_2

    .line 179
    :cond_5
    invoke-virtual {p1, v4, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    .line 181
    :cond_6
    const-string v0, "honor"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 183
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mHonor:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_8

    .line 184
    new-instance v5, Lo/afj;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Lo/afj;-><init>(I)V

    .line 185
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_honor_band:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/afj;->c(Ljava/lang/String;)V

    .line 186
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/afj;->a(Z)V

    .line 187
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_7

    .line 189
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1, v0, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 192
    :cond_7
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 195
    :goto_1
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/afj;->b(Z)V

    .line 197
    :cond_8
    const/4 v0, -0x1

    if-ne v0, v4, :cond_a

    .line 198
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_9

    .line 200
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_2

    .line 203
    :cond_9
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p1, v0, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_2

    .line 207
    :cond_a
    invoke-virtual {p1, v4, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 211
    :cond_b
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mOther:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_c

    .line 212
    new-instance v5, Lo/afj;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Lo/afj;-><init>(I)V

    .line 213
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_user_profile_more:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/afj;->c(Ljava/lang/String;)V

    .line 214
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/afj;->a(Z)V

    .line 215
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1, v0, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 217
    :cond_c
    const/4 v0, -0x1

    if-ne v0, v4, :cond_d

    .line 219
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1, v0, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_2

    .line 222
    :cond_d
    invoke-virtual {p1, v4, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 226
    :goto_2
    return-void
.end method

.method private switchDeviceScanningFragment()V
    .locals 5

    .line 429
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_search_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->setTitle(Ljava/lang/String;)V

    .line 430
    new-instance v3, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-direct {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;-><init>()V

    .line 431
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 432
    const-string v0, "productId"

    const-string v1, "aa:bb:cc:dd"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 433
    const-string v0, "scan_kind"

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    const-string v0, "title"

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_search_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    invoke-virtual {v3, v4}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 436
    invoke-virtual {p0, v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 437
    return-void
.end method


# virtual methods
.method public initView(Lo/acl$a;)V
    .locals 4

    .line 381
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceSelectBindFragment initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    sget-object v0, Lo/acl$a;->g:Lo/acl$a;

    if-ne p1, v0, :cond_0

    .line 385
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$4;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->showMoreButton(ZLandroid/view/View$OnClickListener;)V

    .line 423
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->isDownDevice:Z

    .line 424
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->getAdapterData:Ljava/lang/Runnable;

    invoke-static {v0}, Lo/ahj;->c(Ljava/lang/Runnable;)V

    .line 425
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceSelectBindFragment initview finished"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    return-void
.end method

.method public onBackPressed()Z
    .locals 1

    .line 644
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mBackToFinish:Z

    if-eqz v0, :cond_0

    .line 645
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 646
    const/4 v0, 0x0

    return v0

    .line 648
    :cond_0
    invoke-super {p0}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->onBackPressed()Z

    move-result v0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 274
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->onCreate(Landroid/os/Bundle;)V

    .line 275
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 279
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceSelectBindFragment onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v4

    .line 281
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "--DevcieSelectBindFragment-oncreatview"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$MyIResourceFileListener;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$MyIResourceFileListener;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)V

    invoke-virtual {v0, v1}, Lo/afq;->a(Lo/aff;)V

    .line 283
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->init()V

    .line 284
    return-object v4
.end method

.method public onDestroy()V
    .locals 1

    .line 441
    invoke-super {p0}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->onDestroy()V

    .line 442
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->d()V

    .line 443
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 289
    invoke-super {p0}, Lcom/huawei/health/device/ui/measure/fragment/ListFragment;->onResume()V

    .line 290
    return-void
.end method
