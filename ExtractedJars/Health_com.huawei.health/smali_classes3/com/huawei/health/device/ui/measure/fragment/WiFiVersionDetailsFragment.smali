.class public Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "WiFiVersionDetailsFragment"


# instance fields
.field private mNewVer:Ljava/lang/String;

.field private mNowVersion:Ljava/lang/String;

.field private mProductId:Ljava/lang/String;

.field private mProductInfo:Lo/afj;

.field private mReleaseNote:Ljava/lang/String;

.field private mUpdateNodesTv:Landroid/widget/TextView;

.field private mUpgradeBtn:Lo/egd;

.field private mVersionLogo:Landroid/widget/ImageView;

.field private mVersionTv:Landroid/widget/TextView;

.field private mWiFiDevice:Lo/aja;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mProductInfo:Lo/afj;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mProductId:Ljava/lang/String;

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mNewVer:Ljava/lang/String;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mReleaseNote:Ljava/lang/String;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mNowVersion:Ljava/lang/String;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mVersionTv:Landroid/widget/TextView;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mUpdateNodesTv:Landroid/widget/TextView;

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mUpgradeBtn:Lo/egd;

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mWiFiDevice:Lo/aja;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;)Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mProductId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;)Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mNewVer:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;)Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mNowVersion:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;)Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mReleaseNote:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 27
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method private initData()V
    .locals 4

    .line 83
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 84
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mProductId:Ljava/lang/String;

    .line 85
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 86
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    check-cast v0, Lo/aja;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mWiFiDevice:Lo/aja;

    .line 87
    const-string v0, "WiFiVersionDetailsFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mWiFiDevice is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mWiFiDevice:Lo/aja;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ". mProductId: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 88
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mProductInfo:Lo/afj;

    .line 89
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mProductInfo:Lo/afj;

    if-nez v0, :cond_1

    .line 90
    const-string v0, "WiFiVersionDetailsFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductInfo is null, can\'t get version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 93
    :cond_0
    const-string v0, "WiFiVersionDetailsFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "productId is empty, can\'t get ProductInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 95
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "version"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mNewVer:Ljava/lang/String;

    .line 96
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "cer_version"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mNowVersion:Ljava/lang/String;

    .line 97
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "update_nodes"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mReleaseNote:Ljava/lang/String;

    .line 98
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mVersionTv:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mainActivity:Landroid/app/Activity;

    sget v3, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_ota_latest_version:I

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mNewVer:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mUpdateNodesTv:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mReleaseNote:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "show_update"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 101
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mUpgradeBtn:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    goto :goto_1

    .line 103
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mUpgradeBtn:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 105
    :goto_1
    const-string v0, "a8ba095d-4123-43c4-a30a-0240011c58de"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 106
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mVersionLogo:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->wifi_device_honor_ota_logo:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 109
    :cond_3
    const-string v0, "WiFiVersionDetailsFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Arguments is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 111
    :cond_4
    :goto_2
    return-void
.end method

.method private initView()V
    .locals 2

    .line 61
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_ota_update_band_update:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->setTitle(Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->version_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mVersionTv:Landroid/widget/TextView;

    .line 64
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->update_nodes_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mUpdateNodesTv:Landroid/widget/TextView;

    .line 65
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->upgrade_btn:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mUpgradeBtn:Lo/egd;

    .line 66
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->image_logo:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mVersionLogo:Landroid/widget/ImageView;

    .line 67
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->mUpgradeBtn:Lo/egd;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 80
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 46
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 47
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 50
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    .line 51
    sget v0, Lcom/huawei/plugindevice/R$layout;->wifi_version_details_layout:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->child:Landroid/view/View;

    .line 52
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->initView()V

    .line 53
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->initData()V

    .line 54
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 55
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->child:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 57
    :cond_0
    return-object v2
.end method
