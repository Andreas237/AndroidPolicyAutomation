.class public Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;,
        Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;
    }
.end annotation


# static fields
.field private static final MSG_UPDATE_END:I = 0x4

.field private static final MSG_UPDATE_FAIL:I = 0x3

.field private static final MSG_UPDATE_SUCCESS:I = 0x2

.field private static final MSG_UPDATING:I = 0x1

.field private static final TAG:Ljava/lang/String; = "WiFiOtaUpdateFragment"


# instance fields
.field private mBaseCallback:Lo/ajm;

.field private mCheckVersionUpdate:Lo/egd;

.field private mFromProductView:Z

.field private mHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;

.field private mLatestVersionLayout:Landroid/widget/LinearLayout;

.field private mNewVer:Ljava/lang/String;

.field private mNewVersionTV:Landroid/widget/TextView;

.field private mNoNewVersionTV:Landroid/widget/TextView;

.field private mNowVersion:Ljava/lang/String;

.field private mNowVersionLayout:Landroid/widget/LinearLayout;

.field private mNowVersionTV:Landroid/widget/TextView;

.field private mProductId:Ljava/lang/String;

.field private mReleaseNote:Ljava/lang/String;

.field private mRoundProgress:Lo/ahc;

.field private mVersionLogo:Landroid/widget/ImageView;

.field private mWiFiDevice:Lo/aja;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 56
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mProductId:Ljava/lang/String;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNewVer:Ljava/lang/String;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mReleaseNote:Ljava/lang/String;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNowVersion:Ljava/lang/String;

    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mFromProductView:Z

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNowVersionTV:Landroid/widget/TextView;

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNoNewVersionTV:Landroid/widget/TextView;

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNewVersionTV:Landroid/widget/TextView;

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mLatestVersionLayout:Landroid/widget/LinearLayout;

    .line 76
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNowVersionLayout:Landroid/widget/LinearLayout;

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mRoundProgress:Lo/ahc;

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mCheckVersionUpdate:Lo/egd;

    .line 81
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mWiFiDevice:Lo/aja;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Z
    .locals 1

    .line 56
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->isDestroy()Z

    move-result v0

    return v0
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Landroid/app/Activity;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Landroid/app/Activity;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$1200(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Landroid/app/Activity;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mLatestVersionLayout:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Lo/ahc;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mRoundProgress:Lo/ahc;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;I)V
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->setCheckVersionUpdateEnable(I)V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->checkUpdateResult()V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Lo/aja;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mWiFiDevice:Lo/aja;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNewVer:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Landroid/widget/TextView;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNowVersionTV:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Z
    .locals 1

    .line 56
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->isDestory()Z

    move-result v0

    return v0
.end method

.method private checkUpdateResult()V
    .locals 3

    .line 366
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/aki;->b(Landroid/content/Context;)Lo/aki;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mBaseCallback:Lo/ajm;

    invoke-virtual {v0, v1, v2}, Lo/aki;->b(Ljava/lang/String;Lo/ajm;)V

    .line 367
    return-void
.end method

.method private initData()V
    .locals 7

    .line 116
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;

    invoke-direct {v0, p0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mBaseCallback:Lo/ajm;

    .line 117
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;

    .line 118
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 119
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mProductId:Ljava/lang/String;

    .line 120
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "version"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNewVer:Ljava/lang/String;

    .line 121
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "cer_version"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNowVersion:Ljava/lang/String;

    .line 122
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "update_nodes"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mReleaseNote:Ljava/lang/String;

    .line 123
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNewVersionTV:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNewVer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNowVersionTV:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNowVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mProductId:Ljava/lang/String;

    .line 126
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "fromProductView"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mFromProductView:Z

    .line 127
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 128
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    check-cast v0, Lo/aja;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mWiFiDevice:Lo/aja;

    goto :goto_0

    .line 130
    :cond_0
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "productId is empty, can\'t get WiFiDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 132
    :goto_0
    const-string v0, "a8ba095d-4123-43c4-a30a-0240011c58de"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 133
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mVersionLogo:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->wifi_device_honor_ota_logo:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 136
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mFromProductView:Z

    if-eqz v0, :cond_5

    .line 137
    invoke-static {}, Lo/ahs;->e()Lo/ahs;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mWiFiDevice:Lo/aja;

    invoke-virtual {v1}, Lo/aja;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ahs;->f(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    .line 138
    const/4 v5, 0x0

    .line 139
    if-eqz v4, :cond_2

    .line 140
    const-string v0, "status"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 142
    :cond_2
    const-string v0, "3"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 143
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v6

    .line 144
    const/4 v0, 0x4

    iput v0, v6, Landroid/os/Message;->what:I

    .line 145
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;

    invoke-virtual {v0, v6}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;->sendMessage(Landroid/os/Message;)Z

    .line 146
    return-void

    .line 147
    :cond_3
    const-string v0, "2"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 148
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start update"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 149
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mLatestVersionLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 150
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->setBIWifiDeviceOTAUpgrade()V

    .line 151
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->setCheckVersionUpdateEnable(I)V

    .line 152
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/aki;->b(Landroid/content/Context;)Lo/aki;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mBaseCallback:Lo/ajm;

    invoke-virtual {v0, v1}, Lo/aki;->c(Lo/ajm;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mRoundProgress:Lo/ahc;

    invoke-virtual {v0}, Lo/ahc;->c()V

    .line 155
    :cond_4
    goto :goto_1

    .line 156
    :cond_5
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->startUpgrade()V

    .line 159
    :cond_6
    :goto_1
    return-void
.end method

.method private initView()V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_ota_update_band_update:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->setTitle(Ljava/lang/String;)V

    .line 98
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->now_version_nodes_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNowVersionTV:Landroid/widget/TextView;

    .line 99
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->no_new_version_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNoNewVersionTV:Landroid/widget/TextView;

    .line 100
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->new_version_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNewVersionTV:Landroid/widget/TextView;

    .line 101
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->image_logo:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mVersionLogo:Landroid/widget/ImageView;

    .line 102
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->latest_version_button:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mLatestVersionLayout:Landroid/widget/LinearLayout;

    .line 103
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->version_update_anim:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ahc;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mRoundProgress:Lo/ahc;

    .line 104
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->check_version_update:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mCheckVersionUpdate:Lo/egd;

    .line 105
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->now_version_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNowVersionLayout:Landroid/widget/LinearLayout;

    .line 107
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNowVersionLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 108
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mLatestVersionLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 109
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mCheckVersionUpdate:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mLatestVersionLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 112
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mCheckVersionUpdate:Lo/egd;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_update_new_version_ok:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 113
    return-void
.end method

.method private isDestory()Z
    .locals 5

    .line 422
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    .line 423
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 424
    :cond_0
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity is Destroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 425
    const/4 v0, 0x1

    return v0

    .line 427
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_2

    .line 428
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyHandler mFragment is not add"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 429
    const/4 v0, 0x0

    return v0

    .line 431
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private isDestroy()Z
    .locals 5

    .line 224
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    .line 225
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 226
    :cond_0
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity is Destroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 227
    const/4 v0, 0x1

    return v0

    .line 229
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private setBIWifiDeviceOTAUpgrade()V
    .locals 5

    .line 357
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 358
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->fX:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 360
    return-void
.end method

.method private setCheckVersionUpdateEnable(I)V
    .locals 4

    .line 267
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 269
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNoNewVersionTV:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_app_update_updating:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 270
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mCheckVersionUpdate:Lo/egd;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 271
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mCheckVersionUpdate:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 272
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mCheckVersionUpdate:Lo/egd;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_ota_update_state_upgrading:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 273
    goto :goto_1

    .line 275
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNoNewVersionTV:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_settings_firmware_upgrade_talk_band_failed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 276
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mCheckVersionUpdate:Lo/egd;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 277
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mCheckVersionUpdate:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 278
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mCheckVersionUpdate:Lo/egd;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_retry:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 279
    goto :goto_1

    .line 281
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNoNewVersionTV:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_settings_firmware_upgrade_talk_band_succeed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 282
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mCheckVersionUpdate:Lo/egd;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 283
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mCheckVersionUpdate:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 284
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mCheckVersionUpdate:Lo/egd;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_show_complete:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 285
    goto :goto_1

    .line 287
    :goto_0
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 290
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mCheckVersionUpdate:Lo/egd;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setTag(Ljava/lang/Object;)V

    .line 291
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private startUpgrade()V
    .locals 4

    .line 165
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start update"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 166
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mLatestVersionLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 167
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->setBIWifiDeviceOTAUpgrade()V

    .line 168
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->setCheckVersionUpdateEnable(I)V

    .line 169
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mRoundProgress:Lo/ahc;

    invoke-virtual {v0}, Lo/ahc;->c()V

    .line 170
    const-string v0, "CH"

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->updatingVersion(Ljava/lang/String;)V

    .line 171
    return-void
.end method

.method private updatingVersion(Ljava/lang/String;)V
    .locals 8

    .line 179
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;-><init>()V

    .line 180
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 181
    new-instance v6, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;

    invoke-direct {v6}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;-><init>()V

    .line 182
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 183
    invoke-virtual {v4, v5}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;->setDeviceServiceInfo(Ljava/util/List;)V

    .line 184
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mWiFiDevice:Lo/aja;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mWiFiDevice:Lo/aja;

    iget-object v0, v0, Lo/aja;->c:Lo/aja$a;

    if-eqz v0, :cond_0

    .line 185
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mWiFiDevice:Lo/aja;

    iget-object v0, v0, Lo/aja;->c:Lo/aja$a;

    iget-object v0, v0, Lo/aja$a;->e:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;->setDevId(Ljava/lang/String;)V

    .line 186
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unbind device id: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mWiFiDevice:Lo/aja;

    iget-object v3, v3, Lo/aja;->c:Lo/aja$a;

    iget-object v3, v3, Lo/aja$a;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 188
    :cond_0
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unbind device id is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 192
    :goto_0
    const-string v0, "event"

    const-string v1, "2"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    const-string v0, "version"

    invoke-interface {v7, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    invoke-virtual {v6, v7}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;->setData(Ljava/util/Map;)V

    .line 196
    const-string v0, "setDevParam"

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;->setSid(Ljava/lang/String;)V

    .line 197
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 199
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "version: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "version"

    invoke-interface {v7, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", event: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "event"

    .line 200
    invoke-interface {v7, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", sid: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 201
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;->getSid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 199
    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 203
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)V

    invoke-virtual {v0, v4, v1}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;Lo/cyx;)V

    .line 217
    return-void
.end method


# virtual methods
.method public onBackPressed()Z
    .locals 4

    .line 347
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 348
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    new-instance v3, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-direct {v3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;-><init>()V

    .line 350
    invoke-virtual {v3, v2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->setArguments(Landroid/os/Bundle;)V

    .line 351
    invoke-virtual {p0, v3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 352
    const/4 v0, 0x0

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 234
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->latest_version_button:I

    if-ne v0, v1, :cond_0

    .line 235
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;-><init>()V

    .line 236
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 237
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    const-string v0, "version"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNewVer:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    const-string v0, "cer_version"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mNowVersion:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    const-string v0, "update_nodes"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->mReleaseNote:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiVersionDetailsFragment;->setArguments(Landroid/os/Bundle;)V

    .line 242
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 243
    goto/16 :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->check_version_update:I

    if-ne v0, v1, :cond_4

    .line 244
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 245
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 246
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updating..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 247
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_2

    .line 248
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update fail..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 249
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->startUpgrade()V

    goto :goto_0

    .line 250
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_5

    .line 251
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update success..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 252
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->onBackPressed()Z

    goto :goto_0

    .line 255
    :cond_3
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->startUpgrade()V

    goto :goto_0

    .line 258
    :cond_4
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "--------no click------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 260
    :cond_5
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 85
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    .line 86
    sget v0, Lcom/huawei/plugindevice/R$layout;->wifi_upgrade_layout:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->child:Landroid/view/View;

    .line 87
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->initView()V

    .line 88
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->initData()V

    .line 89
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 90
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->child:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 92
    :cond_0
    return-object v2
.end method
