.class public Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final HUAWEI_FIT:Ljava/lang/String; = "HUAWEI FIT"

.field private static final METIS_PRODUCTID:Ljava/lang/String; = "9323f6b7-b459-44f4-a698-988d1769832a"

.field public static final TAG:Ljava/lang/String; = "HonourDeviceFragment"


# instance fields
.field private mAdapter:Lo/agp;

.field private mBtnMeasure:Lo/egd;

.field private mBtnUnbind:Lo/egd;

.field private mDeviceImg:Landroid/widget/ImageView;

.field private mGoto:Ljava/lang/String;

.field private mInteractor:Lo/ago;

.field private mItemListView:Landroid/widget/ListView;

.field private mProductId:Ljava/lang/String;

.field private mProductInfo:Lo/afj;

.field private serviceControl:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

.field private serviceList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Lo/agp;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mAdapter:Lo/agp;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;Ljava/lang/String;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->openHuaFenClubActivity(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->callHotline()V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;Ljava/lang/String;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->openAppHelpActivity(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Lo/ago;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mInteractor:Lo/ago;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->openHeartIndexActivity()V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->openSleepDecompression()V

    return-void
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    return-object v0
.end method

.method private callHotline()V
    .locals 5

    .line 171
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.DIAL"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tel:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/plugindevice/R$string;->IDS_main_sns_member_service_call_number_item_2:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 173
    return-void
.end method

.method private createSettingItem(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/agy;
    .locals 1

    .line 505
    new-instance v0, Lo/agy;

    invoke-direct {v0}, Lo/agy;-><init>()V

    .line 506
    invoke-virtual {v0, p3}, Lo/agy;->b(I)V

    .line 507
    invoke-virtual {v0, p4}, Lo/agy;->e(Ljava/lang/String;)V

    .line 508
    invoke-virtual {v0, p5}, Lo/agy;->a(Ljava/lang/String;)V

    .line 509
    invoke-virtual {v0, p2}, Lo/agy;->a(I)V

    .line 510
    invoke-virtual {v0, p1}, Lo/agy;->b(Z)V

    .line 511
    invoke-virtual {v0, p6}, Lo/agy;->b(Ljava/lang/String;)V

    .line 512
    return-object v0
.end method

.method private init()V
    .locals 5

    .line 222
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    .line 223
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "goto"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mGoto:Ljava/lang/String;

    .line 224
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductInfo:Lo/afj;

    .line 225
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/afq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v3}, Lo/afj;->m()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/acq;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->initView()V

    .line 227
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->initData()V

    .line 228
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v0

    const-string v1, "54C9739F-CA5C-4347-9F00-75B9DDF2C649"

    invoke-virtual {v0, v1}, Lo/acq;->b(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/MeasureKit;

    .line 229
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->initOpenService()V

    .line 230
    return-void
.end method

.method private initData()V
    .locals 6

    .line 234
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 237
    invoke-direct {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->initItemList(Ljava/util/List;)V

    .line 239
    new-instance v0, Lo/agp;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lo/agp;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mAdapter:Lo/agp;

    .line 240
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mAdapter:Lo/agp;

    invoke-virtual {v0, v5}, Lo/agp;->c(Ljava/util/List;)V

    .line 241
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mItemListView:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mAdapter:Lo/agp;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 243
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 244
    new-instance v0, Lo/agn;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->child:Landroid/view/View;

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mAdapter:Lo/agp;

    invoke-direct {v0, v1, v2, v3, v4}, Lo/agn;-><init>(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;Lo/agp;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mInteractor:Lo/ago;

    .line 245
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mBtnMeasure:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    goto :goto_0

    .line 246
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 247
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mInteractor:Lo/ago;

    if-nez v0, :cond_1

    .line 248
    new-instance v0, Lo/agm;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lo/agm;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mInteractor:Lo/ago;

    .line 250
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mInteractor:Lo/ago;

    check-cast v0, Lo/agm;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->child:Landroid/view/View;

    invoke-virtual {v0, v1}, Lo/agm;->b(Landroid/view/View;)V

    .line 251
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->getDeviceMainActivity()Lcom/huawei/health/device/ui/DeviceMainActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->e(Ljava/lang/Class;)V

    .line 253
    const-string v0, "33123f39-7fc1-420b-9882-a4b0d6c61100"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 254
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mDeviceImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->device_abroad_huawei_weight:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 255
    :cond_2
    const-string v0, "ccd1f0f8-8c57-4bd7-a884-0ef38482f15f"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 256
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mDeviceImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->device_honour_weight:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 258
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mDeviceImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->img_home_body_fat_scales:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 263
    :cond_4
    :goto_0
    return-void
.end method

.method private initItemList(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/agy;>;)V"
        }
    .end annotation

    .line 266
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 267
    move-object v0, p0

    sget v2, Lcom/huawei/plugindevice/R$mipmap;->ic_heartindex:I

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    sget v3, Lcom/huawei/plugindevice/R$string;->IDS_hw_heart_index:I

    invoke-virtual {v1, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    const-string v6, ""

    const/4 v1, 0x1

    const/4 v3, 0x7

    invoke-direct/range {v0 .. v6}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->createSettingItem(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/agy;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    move-object v0, p0

    sget v2, Lcom/huawei/plugindevice/R$mipmap;->ic_sleeprelax:I

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    sget v3, Lcom/huawei/plugindevice/R$string;->IDS_hw_sleep_relax:I

    invoke-virtual {v1, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    const-string v6, ""

    const/4 v1, 0x1

    const/16 v3, 0x8

    invoke-direct/range {v0 .. v6}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->createSettingItem(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/agy;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 269
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 270
    move-object v0, p0

    sget v2, Lcom/huawei/plugindevice/R$mipmap;->ic_list_help:I

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    sget v3, Lcom/huawei/plugindevice/R$string;->IDS_main_discovery_tab_service_help:I

    invoke-virtual {v1, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "https://health.vmall.com/help/AM16/app8.0/zh-CN/index.html"

    const-string v6, ""

    const/4 v1, 0x1

    const/4 v3, 0x1

    invoke-direct/range {v0 .. v6}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->createSettingItem(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/agy;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 272
    :cond_0
    move-object v0, p0

    sget v2, Lcom/huawei/plugindevice/R$mipmap;->ic_list_help:I

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    sget v3, Lcom/huawei/plugindevice/R$string;->IDS_main_discovery_tab_service_help:I

    invoke-virtual {v1, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "https://health.vmall.com/help/AM16/app8.0/en-US/index.html"

    const-string v6, ""

    const/4 v1, 0x1

    const/4 v3, 0x1

    invoke-direct/range {v0 .. v6}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->createSettingItem(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/agy;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 274
    :goto_0
    move-object v0, p0

    sget v2, Lcom/huawei/plugindevice/R$mipmap;->ic_drawer_huaweiclub:I

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    sget v3, Lcom/huawei/plugindevice/R$string;->IDS_main_discovery_tab_service_huawei_club:I

    invoke-virtual {v1, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "https://club.huawei.com/forum-3683-1.html"

    const-string v6, ""

    const/4 v1, 0x1

    const/4 v3, 0x3

    invoke-direct/range {v0 .. v6}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->createSettingItem(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/agy;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 275
    move-object v0, p0

    sget v2, Lcom/huawei/plugindevice/R$mipmap;->home_ic_list_hotline:I

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    sget v3, Lcom/huawei/plugindevice/R$string;->IDS_settings_service_call_item:I

    invoke-virtual {v1, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    const-string v6, "400-830-8300"

    const/4 v1, 0x1

    const/4 v3, 0x4

    invoke-direct/range {v0 .. v6}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->createSettingItem(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/agy;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 277
    :cond_1
    move-object v0, p0

    sget v2, Lcom/huawei/plugindevice/R$mipmap;->ic_cancel_body_fat_scales_data:I

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    sget v3, Lcom/huawei/plugindevice/R$string;->IDS_plugin_device_clear_user_data:I

    invoke-virtual {v1, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    const-string v6, ""

    const/4 v1, 0x1

    const/4 v3, 0x5

    invoke-direct/range {v0 .. v6}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->createSettingItem(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/agy;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 278
    move-object v0, p0

    sget v2, Lcom/huawei/plugindevice/R$drawable;->home_ic_list_device_update:I

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    sget v3, Lcom/huawei/plugindevice/R$string;->IDS_ota_update_band_update:I

    invoke-virtual {v1, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    const-string v6, ""

    const/4 v1, 0x1

    const/4 v3, 0x6

    invoke-direct/range {v0 .. v6}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->createSettingItem(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/agy;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 280
    :goto_1
    return-void
.end method

.method private initListener()V
    .locals 2

    .line 116
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mBtnUnbind:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 117
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mBtnMeasure:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 118
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mItemListView:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 153
    return-void
.end method

.method private initOpenService()V
    .locals 6

    .line 314
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->serviceList:Ljava/util/List;

    .line 315
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->serviceControl:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    .line 316
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->serviceControl:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryAllService()Ljava/util/List;

    move-result-object v4

    .line 317
    if-eqz v4, :cond_0

    .line 318
    const-string v0, "HonourDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "serviceList size is == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 320
    :cond_0
    const-string v0, "HonourDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "serviceList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 323
    const/4 v5, 0x0

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 324
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "A_shumian"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 325
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->serviceList:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 326
    :cond_1
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "xinqing"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 327
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->serviceList:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 323
    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 331
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->serviceList:Ljava/util/List;

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->orderOpenService(Ljava/util/List;)V

    .line 332
    const-string v0, "HonourDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "serviceList selected size is == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->serviceList:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    return-void
.end method

.method private initView()V
    .locals 4

    .line 283
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->btn_device_unbind:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mBtnUnbind:Lo/egd;

    .line 284
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->list_device_setting:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mItemListView:Landroid/widget/ListView;

    .line 285
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_img:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mDeviceImg:Landroid/widget/ImageView;

    .line 286
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->hw_device_start_measure:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mBtnMeasure:Lo/egd;

    .line 289
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductInfo:Lo/afj;

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->setTitle(Ljava/lang/String;Lo/afj;)V

    .line 290
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mDeviceImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->pic_am16_headset:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 291
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 292
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mBtnUnbind:Lo/egd;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_hw_health_wear_connect_device_unpair_button:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 294
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ProductIntroductionFragment productid is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    return-void
.end method

.method private isNetWorkActive()Z
    .locals 4

    .line 336
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 337
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    .line 338
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isNoneBondedDevice()Z
    .locals 2

    .line 444
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 445
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->d(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 447
    :cond_1
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private openAppHelpActivity(Ljava/lang/String;)V
    .locals 5

    .line 159
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    const-class v1, Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 160
    const-string v0, "HonourDeviceFragment"

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

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    const-string v0, "WebViewActivity.REQUEST_URL_KEY"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 162
    const-string v0, "WebViewActivity.JUMP_MODE_KEY"

    const/4 v1, 0x4

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 163
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 164
    return-void
.end method

.method private openHeartIndexActivity()V
    .locals 5

    .line 190
    const-string v0, "HonourDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start xinqing service"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->serviceList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 192
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->serviceList:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->startService(Lcom/huawei/ui/openservice/db/model/OpenService;)V

    goto :goto_0

    .line 194
    :cond_0
    const-string v0, "HonourDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xinqing service is null , create OpenService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    new-instance v4, Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-direct {v4}, Lcom/huawei/ui/openservice/db/model/OpenService;-><init>()V

    .line 196
    const-string v0, "https://healthrecommend.hicloud.com/heartIndex/index.html"

    invoke-virtual {v4, v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->setServiceUrl(Ljava/lang/String;)V

    .line 197
    const-string v0, "xinqing"

    invoke-virtual {v4, v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->setServiceID(Ljava/lang/String;)V

    .line 198
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_hw_heart_index:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->setProductName(Ljava/lang/String;)V

    .line 199
    invoke-direct {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->startService(Lcom/huawei/ui/openservice/db/model/OpenService;)V

    .line 201
    :goto_0
    return-void
.end method

.method private openHuaFenClubActivity(Ljava/lang/String;)V
    .locals 5

    .line 179
    const-string v0, "HonourDeviceFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startWebViewActivity() -> url = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ", jumpModeKey = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    const-class v1, Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 181
    const-string v0, "WebViewActivity.REQUEST_URL_KEY"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 182
    const-string v0, "WebViewActivity.JUMP_MODE_KEY"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 183
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 184
    return-void
.end method

.method private openSleepDecompression()V
    .locals 5

    .line 207
    const-string v0, "HonourDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start shumian service"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->serviceList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 209
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->serviceList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->startService(Lcom/huawei/ui/openservice/db/model/OpenService;)V

    goto :goto_0

    .line 211
    :cond_0
    const-string v0, "HonourDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shumian service is null , create OpenService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    new-instance v4, Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-direct {v4}, Lcom/huawei/ui/openservice/db/model/OpenService;-><init>()V

    .line 213
    const-string v0, "https://www.heartide.com/huawei/"

    invoke-virtual {v4, v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->setServiceUrl(Ljava/lang/String;)V

    .line 214
    const-string v0, "A_shumian"

    invoke-virtual {v4, v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->setServiceID(Ljava/lang/String;)V

    .line 215
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_hw_sleep_relax:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->setProductName(Ljava/lang/String;)V

    .line 216
    invoke-direct {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->startService(Lcom/huawei/ui/openservice/db/model/OpenService;)V

    .line 218
    :goto_0
    return-void
.end method

.method private setTitle(Ljava/lang/String;Lo/afj;)V
    .locals 2

    .line 298
    invoke-virtual {p2}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj$a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 299
    const-string v0, "9323f6b7-b459-44f4-a698-988d1769832a"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 300
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->l(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 301
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 302
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 303
    const-string v1, "HUAWEI FIT"

    .line 306
    :cond_0
    invoke-virtual {p0, v1}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->setTitle(Ljava/lang/String;)V

    .line 307
    return-void
.end method

.method private startService(Lcom/huawei/ui/openservice/db/model/OpenService;)V
    .locals 6

    .line 412
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mInteractor:Lo/ago;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mInteractor:Lo/ago;

    instance-of v0, v0, Lo/agn;

    if-eqz v0, :cond_0

    .line 413
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mInteractor:Lo/ago;

    check-cast v0, Lo/agn;

    invoke-virtual {v0}, Lo/agn;->b()V

    .line 415
    :cond_0
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 416
    const-string v0, "url"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 417
    const-string v0, "EXTRA_BI_ID"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 418
    const-string v0, "EXTRA_BI_NAME"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getProductName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 419
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "OpenService"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 420
    const-string v0, "IS_START_FROM_HEART_KAN_BAN"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 421
    const-string v0, "type"

    const-string v1, "OPEN_SERVICE_TYPE"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 422
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 423
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 424
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    const-string v0, "id"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    const-string v0, "name"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getProductName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    sget-object v2, Lo/dae;->ga:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 428
    return-void
.end method

.method private unbindDevice(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 342
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->isNoneBondedDevice()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 345
    new-instance v3, Lo/egy$b;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 347
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_cancel_unbind_device:I

    invoke-virtual {v3, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    .line 348
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_yes:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;Ljava/util/Map;)V

    invoke-virtual {v3, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 398
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_no:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$3;-><init>(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)V

    invoke-virtual {v3, v0, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 404
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v2

    .line 405
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/egy;->setCancelable(Z)V

    .line 406
    invoke-virtual {v2}, Lo/egy;->show()V

    .line 409
    :cond_0
    return-void
.end method


# virtual methods
.method public onBackPressed()Z
    .locals 2

    .line 484
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mInteractor:Lo/ago;

    if-eqz v0, :cond_0

    .line 485
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mInteractor:Lo/ago;

    invoke-virtual {v0}, Lo/ago;->c()V

    .line 487
    :cond_0
    const-string v0, "devicebind"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mGoto:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 488
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setResult(I)V

    .line 489
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 490
    const/4 v0, 0x0

    return v0

    .line 492
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 453
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 454
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    const-string v0, "device_name"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mBtnUnbind:Lo/egd;

    if-ne p1, v0, :cond_0

    .line 458
    invoke-direct {p0, v2}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->unbindDevice(Ljava/util/Map;)V

    goto/16 :goto_0

    .line 459
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mBtnMeasure:Lo/egd;

    if-ne p1, v0, :cond_3

    .line 460
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->k()Lo/acl$a;

    move-result-object v3

    .line 461
    invoke-virtual {v3}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/agd;->d(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v4

    .line 462
    if-eqz v4, :cond_3

    .line 463
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mInteractor:Lo/ago;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 464
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mInteractor:Lo/ago;

    invoke-virtual {v0}, Lo/ago;->e()V

    .line 466
    :cond_1
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 467
    const-string v0, "view"

    const-string v1, "measure"

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 468
    const-string v0, "kind"

    invoke-virtual {v3}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 470
    const-string v0, "goback"

    const-string v1, "honour_device"

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 471
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mInteractor:Lo/ago;

    instance-of v0, v0, Lo/agm;

    if-eqz v0, :cond_2

    .line 472
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mInteractor:Lo/ago;

    check-cast v0, Lo/agm;

    invoke-virtual {v0}, Lo/agm;->d()Z

    move-result v6

    .line 473
    const-string v0, "status"

    invoke-virtual {v5, v0, v6}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 475
    :cond_2
    const-string v0, "type"

    const/4 v1, -0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 476
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 477
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 480
    :cond_3
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 95
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 96
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 100
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    .line 101
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    sget v0, Lcom/huawei/plugindevice/R$layout;->fragment_honour_device_setting_cd:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->child:Landroid/view/View;

    goto :goto_0

    .line 104
    :cond_0
    sget v0, Lcom/huawei/plugindevice/R$layout;->fragment_honour_device_setting:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->child:Landroid/view/View;

    .line 107
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->init()V

    .line 108
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->initListener()V

    .line 109
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 110
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->child:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 112
    :cond_1
    return-object v2
.end method

.method public onDestroy()V
    .locals 0

    .line 440
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 441
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 432
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onResume()V

    .line 433
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mInteractor:Lo/ago;

    if-eqz v0, :cond_0

    .line 434
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->mInteractor:Lo/ago;

    invoke-virtual {v0}, Lo/ago;->a()V

    .line 436
    :cond_0
    return-void
.end method
