.class public Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;
.super Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static final PROGRESS_MAX:I = 0x64

.field private static final TAG:Ljava/lang/String; = "DownloadPluginPayActivity"


# instance fields
.field private flag:I

.field private mDownloadPluginBtn:Lo/egd;

.field private mDownloadPluginImg:Landroid/widget/ImageView;

.field private mDownloadPluginProgress:Landroid/widget/ProgressBar;

.field private mDownloadPluginTv:Landroid/widget/TextView;

.field private mSetNetworkTv:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;-><init>()V

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->flag:I

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;Ljava/lang/String;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->updateView(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->setDownloadingUI(I)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;IZ)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->showFailMsg(IZ)V

    return-void
.end method

.method private downloadPluginPay()V
    .locals 1

    .line 174
    new-instance v0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;-><init>(Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;)V

    invoke-static {v0}, Lcom/huawei/nfc/util/WalletPluginClassUtil;->updatePlugin(Lo/eaz;)V

    .line 222
    return-void
.end method

.method private initData()V
    .locals 1

    .line 89
    new-instance v0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;)V

    invoke-static {v0}, Lcom/huawei/nfc/util/WalletPluginClassUtil;->updateDescription(Lo/eaz;)V

    .line 111
    return-void
.end method

.method private initPluginDefectiveView()V
    .locals 2

    .line 76
    sget v0, Lcom/huawei/wallet/R$string;->nfc_download_plugin_pay_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->showHead(I)V

    .line 77
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginBtn:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 78
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginProgress:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 79
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginBtn:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_restart_download_plugin_pay_btn:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 80
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginTv:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_download_plugin_pay_unavailable:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 81
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/wallet/R$drawable;->ic_error:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 82
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginBtn:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    return-void
.end method

.method private initView()V
    .locals 4

    .line 131
    const-string v0, "DownloadPluginPayActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginTv:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 133
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginProgress:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 134
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mSetNetworkTv:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_set_network_tv:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 135
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mSetNetworkTv:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 136
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginBtn:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 137
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginBtn:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_download_plugin_pay_btn:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 138
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginBtn:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 139
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/wallet/R$drawable;->img_wallet_walletic:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 141
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mSetNetworkTv:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 142
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginBtn:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    sget v0, Lcom/huawei/wallet/R$string;->pocket_icon_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->showHead(I)V

    .line 145
    return-void
.end method

.method private setDownloadFailUI()V
    .locals 2

    .line 242
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginProgress:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 243
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginBtn:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 244
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginBtn:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_restart_download_plugin_pay_btn:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 245
    return-void
.end method

.method private setDownloadingUI(I)V
    .locals 9

    .line 158
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_download_plugin_pay_progress:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 159
    const-string v0, "DownloadPluginPayActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processText:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    const-string v0, "DownloadPluginPayActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UnitUtil.getNumberFormat(process, 2, 0):"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    int-to-double v3, p1

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    int-to-double v1, p1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v7, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 162
    const-string v0, "DownloadPluginPayActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadPluginPayProgress:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginTv:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginProgress:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 165
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginProgress:Landroid/widget/ProgressBar;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 166
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 167
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginBtn:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 168
    return-void
.end method

.method private showFailMsg(IZ)V
    .locals 2

    .line 225
    sget v0, Lcom/huawei/wallet/R$string;->nfc_download_plugin_pay_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->showHead(I)V

    .line 226
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->setDownloadFailUI()V

    .line 227
    if-eqz p2, :cond_0

    .line 228
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/wallet/R$drawable;->ic_wifi:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 229
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginTv:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 230
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mSetNetworkTv:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 232
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/wallet/R$drawable;->ic_error:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 233
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginTv:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 234
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mSetNetworkTv:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 235
    sget v0, Lcom/huawei/wallet/R$string;->nfc_download_plugin_pay_unused:I

    if-ne v0, p1, :cond_1

    .line 236
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginBtn:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 239
    :cond_1
    :goto_0
    return-void
.end method

.method private updateView(Ljava/lang/String;)V
    .locals 6

    .line 122
    const-string v0, "DownloadPluginPayActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginTv:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 124
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_download_plugin_pay_tips:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 125
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 126
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginTv:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginBtn:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 128
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 149
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 150
    sget v0, Lcom/huawei/wallet/R$id;->btn_download_plugin:I

    if-ne v1, v0, :cond_0

    .line 151
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->downloadPluginPay()V

    goto :goto_0

    .line 152
    :cond_0
    sget v0, Lcom/huawei/wallet/R$id;->tv_set_network:I

    if-ne v1, v0, :cond_1

    .line 153
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/wallet/utils/BaseLibUtil;->c(Landroid/content/Context;)V

    .line 155
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 49
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 50
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_activity_download_plugin_pay:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->setContentView(I)V

    .line 52
    sget v0, Lcom/huawei/wallet/R$id;->tv_download_plugin:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginTv:Landroid/widget/TextView;

    .line 53
    sget v0, Lcom/huawei/wallet/R$id;->progress_horizontal:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginProgress:Landroid/widget/ProgressBar;

    .line 54
    sget v0, Lcom/huawei/wallet/R$id;->tv_set_network:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mSetNetworkTv:Landroid/widget/TextView;

    .line 55
    sget v0, Lcom/huawei/wallet/R$id;->btn_download_plugin:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginBtn:Lo/egd;

    .line 56
    sget v0, Lcom/huawei/wallet/R$id;->img_wallet:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mDownloadPluginImg:Landroid/widget/ImageView;

    .line 59
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->mContext:Landroid/content/Context;

    .line 60
    const/16 v1, 0x4e2a

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_PLUGIN_DOWNLOADED_FLAG"

    .line 59
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 61
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 62
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->flag:I

    .line 63
    const-string v0, "DownloadPluginPayActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate flag:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->flag:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    :cond_0
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->flag:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 67
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->initPluginDefectiveView()V

    goto :goto_0

    .line 70
    :cond_1
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->initView()V

    .line 71
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->initData()V

    .line 73
    :goto_0
    return-void
.end method

.method public setSize(I)Ljava/lang/String;
    .locals 5

    .line 115
    const/high16 v2, 0x100000

    .line 116
    new-instance v3, Ljava/text/DecimalFormat;

    const-string v0, "0.00"

    invoke-direct {v3, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 117
    int-to-float v0, p1

    const/high16 v1, 0x49800000    # 1048576.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-virtual {v3, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v4

    .line 118
    return-object v4
.end method
