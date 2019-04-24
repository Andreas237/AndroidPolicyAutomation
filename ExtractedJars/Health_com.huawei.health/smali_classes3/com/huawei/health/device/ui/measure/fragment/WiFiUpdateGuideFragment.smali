.class public Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$WifiHandler;
    }
.end annotation


# static fields
.field private static final MSG_GET_DEVICE_STATUS_FAIL:I = 0x2

.field private static final MSG_GET_DEVICE_STATUS_SUCCESS:I = 0x1

.field private static final TAG:Ljava/lang/String; = "WiFiUpdateGuideFragment"


# instance fields
.field private mDialog:Lo/egy;

.field private mGuideLogo:Landroid/widget/ImageView;

.field private mGuideNode:Landroid/widget/TextView;

.field private mNewVer:Ljava/lang/String;

.field private mNextBtn:Lo/egd;

.field private mNowVersion:Ljava/lang/String;

.field private mProductId:Ljava/lang/String;

.field private mReleaseNote:Ljava/lang/String;

.field private mWiFiDevice:Lo/aja;

.field private mWiFiHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mProductId:Ljava/lang/String;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mWiFiDevice:Lo/aja;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mWiFiHandler:Landroid/os/Handler;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mNewVer:Ljava/lang/String;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mReleaseNote:Ljava/lang/String;

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mNowVersion:Ljava/lang/String;

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mGuideNode:Landroid/widget/TextView;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mNextBtn:Lo/egd;

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mDialog:Lo/egy;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Lo/egd;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mNextBtn:Lo/egd;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Ljava/lang/String;
    .locals 1

    .line 35
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->getDevId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Landroid/app/Activity;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Lo/egy;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mDialog:Lo/egy;

    return-object v0
.end method

.method static synthetic access$1102(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;Lo/egy;)Lo/egy;
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mDialog:Lo/egy;

    return-object p1
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Landroid/os/Handler;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mWiFiHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Landroid/app/Activity;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Z
    .locals 1

    .line 35
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->isDestroy()Z

    move-result v0

    return v0
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mProductId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mNewVer:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mNowVersion:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mReleaseNote:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 35
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method private getDevId()Ljava/lang/String;
    .locals 4

    .line 107
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mWiFiDevice:Lo/aja;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mWiFiDevice:Lo/aja;

    iget-object v0, v0, Lo/aja;->c:Lo/aja$a;

    if-eqz v0, :cond_0

    .line 108
    const-string v0, "WiFiUpdateGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device info: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mWiFiDevice:Lo/aja;

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

    .line 109
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mWiFiDevice:Lo/aja;

    iget-object v0, v0, Lo/aja;->c:Lo/aja$a;

    iget-object v0, v0, Lo/aja$a;->e:Ljava/lang/String;

    return-object v0

    .line 111
    :cond_0
    const-string v0, "WiFiUpdateGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device id is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 112
    const/4 v0, 0x0

    return-object v0
.end method

.method private initData()V
    .locals 4

    .line 117
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$WifiHandler;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$WifiHandler;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mWiFiHandler:Landroid/os/Handler;

    .line 118
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 119
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "version"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mNewVer:Ljava/lang/String;

    .line 120
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "cer_version"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mNowVersion:Ljava/lang/String;

    .line 121
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "update_nodes"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mReleaseNote:Ljava/lang/String;

    .line 122
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mProductId:Ljava/lang/String;

    .line 123
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 124
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    check-cast v0, Lo/aja;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mWiFiDevice:Lo/aja;

    goto :goto_0

    .line 126
    :cond_0
    const-string v0, "WiFiUpdateGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "productId is empty, can\'t get WiFiDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 129
    :cond_1
    const-string v0, "WiFiUpdateGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Arguments is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 131
    :goto_0
    const-string v0, "a8ba095d-4123-43c4-a30a-0240011c58de"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 132
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mGuideLogo:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->wifi_device_honor_ota_guide_img:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 134
    :cond_2
    return-void
.end method

.method private initView()V
    .locals 2

    .line 72
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_ota_update_band_update:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->setTitle(Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_guide_node:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mGuideNode:Landroid/widget/TextView;

    .line 75
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mGuideNode:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_ota_update_prompt_msg:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 76
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->next_btn:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mNextBtn:Lo/egd;

    .line 77
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_logo:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mGuideLogo:Landroid/widget/ImageView;

    .line 78
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->mNextBtn:Lo/egd;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 100
    return-void
.end method

.method private isDestroy()Z
    .locals 5

    .line 141
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    .line 142
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 143
    :cond_0
    const-string v0, "WiFiUpdateGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity is Destroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 144
    const/4 v0, 0x1

    return v0

    .line 146
    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 57
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 58
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 61
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    .line 62
    sget v0, Lcom/huawei/plugindevice/R$layout;->wifi_update_guide_layout:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->child:Landroid/view/View;

    .line 63
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->initView()V

    .line 64
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->initData()V

    .line 65
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 66
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->child:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 68
    :cond_0
    return-object v2
.end method
