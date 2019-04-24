.class public Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureResultActivity;
.super Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;
.source "SourceFile"


# instance fields
.field private g:Z

.field private i:Lo/emr;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    .line 52
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureResultActivity;->g:Z

    if-eqz v0, :cond_0

    .line 54
    const/4 v0, 0x0

    return v0

    .line 58
    :cond_0
    invoke-super {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->c()Z

    move-result v0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 35
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureResultActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 36
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 38
    const-string v0, "isSupportHorVerSwitch"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureResultActivity;->g:Z

    .line 40
    :cond_0
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->b()Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureResultActivity;->k:Landroid/graphics/Bitmap;

    .line 41
    invoke-super {p0, p1}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->onCreate(Landroid/os/Bundle;)V

    .line 42
    sget v0, Lcom/huawei/base/R$string;->wallet_camera_confirm_card_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureResultActivity;->e(I)V

    .line 43
    sget v0, Lcom/huawei/base/R$id;->card_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 44
    sget v0, Lcom/huawei/base/R$string;->wallet_camera_confirm_card_tips:I

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(I)V

    .line 45
    sget v0, Lcom/huawei/base/R$id;->ocr_result_title_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureResultActivity;->i:Lo/emr;

    .line 46
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureResultActivity;->i:Lo/emr;

    sget v1, Lcom/huawei/base/R$string;->wallet_camera_confirm_card_info:I

    invoke-virtual {p0, v1}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 47
    return-void
.end method
