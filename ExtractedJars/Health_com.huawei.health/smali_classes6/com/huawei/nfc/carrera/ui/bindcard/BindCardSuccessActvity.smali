.class public Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;
.super Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;
.source "SourceFile"


# static fields
.field private static final PERCENT_MARGIN_TOP:F = 0.3f


# instance fields
.field private isSetDefaultTag:Z

.field private mSuccessDesText:Landroid/widget/TextView;

.field private nextButton:Lo/egd;

.field private setDefaultView:Landroid/widget/ImageView;

.field private successView:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;-><init>()V

    .line 43
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->isSetDefaultTag:Z

    return-void
.end method

.method private initViews()V
    .locals 8

    .line 75
    sget v0, Lcom/huawei/wallet/R$id;->bind_success_imageview:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->successView:Landroid/widget/ImageView;

    .line 76
    sget v0, Lcom/huawei/wallet/R$id;->nfc_set_default:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->setDefaultView:Landroid/widget/ImageView;

    .line 77
    sget v0, Lcom/huawei/wallet/R$id;->nfc_next_step_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->nextButton:Lo/egd;

    .line 78
    sget v0, Lcom/huawei/wallet/R$id;->nfc_bind_success_textview:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->mSuccessDesText:Landroid/widget/TextView;

    .line 81
    new-instance v3, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity$1;

    invoke-direct {v3, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity$1;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;)V

    .line 90
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bank_success_decribe_text:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 91
    const-string v0, "%1$s"

    invoke-virtual {v4, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    .line 92
    const/4 v0, 0x0

    invoke-virtual {v4, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 93
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->mSuccessDesText:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->mSuccessDesText:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<img src=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$drawable;->ic_huawei_watch_guide:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'/>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v3, v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;Landroid/text/Html$ImageGetter;Landroid/text/Html$TagHandler;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 95
    add-int/lit8 v0, v5, 0x4

    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 96
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->mSuccessDesText:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 110
    return-void
.end method

.method private toHomeFragment()V
    .locals 3

    .line 194
    const-string v0, "toHomeFragment"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 195
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 196
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.wallet.ui.cardholder.CardHolderActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 197
    const/high16 v0, 0x4000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 198
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 199
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->startActivity(Landroid/content/Intent;)V

    .line 200
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->finish()V

    .line 201
    return-void
.end method


# virtual methods
.method public onClickEvent(Landroid/view/View;)V
    .locals 3

    .line 117
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 118
    sget v0, Lcom/huawei/wallet/R$id;->nfc_set_default:I

    if-ne v0, v2, :cond_3

    .line 120
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->isSetDefaultTag:Z

    if-eqz v0, :cond_0

    .line 123
    const-string v0, "\u5f00\u901a\u7684\u7b2c\u4e00\u5f20\u5361\u7247\uff0c\u9ed8\u8ba4\u5361\u4e0d\u53ef\u53d6\u6d88"

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->showToast(Ljava/lang/String;)V

    .line 124
    return-void

    .line 127
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->isSetDefaultTag:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->isSetDefaultTag:Z

    .line 128
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->isSetDefaultTag:Z

    if-eqz v0, :cond_2

    .line 130
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->setDefaultView:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/wallet/R$drawable;->nfc_button_check_on:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 134
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->setDefaultView:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/wallet/R$drawable;->nfc_button_check_off:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 137
    :cond_3
    sget v0, Lcom/huawei/wallet/R$id;->nfc_next_step_button:I

    if-ne v0, v2, :cond_4

    .line 162
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->toHomeFragment()V

    .line 165
    :cond_4
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 62
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 63
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->setRequestedOrientation(I)V

    .line 65
    sget v0, Lcom/huawei/wallet/R$string;->nfc_add_bank_card:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->setTitle(I)V

    .line 66
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_activity_bind_success_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->setContentView(I)V

    .line 67
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->initViews()V

    .line 68
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 206
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 208
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;->toHomeFragment()V

    .line 219
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method
