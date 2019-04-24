.class public Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;
.super Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/response/NullifyCardResultCallback;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public getButtonNameColor()I
    .locals 1

    .line 72
    sget v0, Lcom/huawei/wallet/R$color;->CS_delete_red:I

    return v0
.end method

.method public getButtonNameResId()I
    .locals 1

    .line 30
    sget v0, Lcom/huawei/wallet/R$string;->nfc_nullify_card_title:I

    return v0
.end method

.method public getSmsCode(Ljava/lang/String;I)V
    .locals 2

    .line 87
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->mRefId:Ljava/lang/String;

    invoke-virtual {v0, v1, p2, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->requestNullifySmsCode(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/response/RequestVerifyCodeCallback;)V

    .line 88
    return-void
.end method

.method public getTitleResId()I
    .locals 1

    .line 24
    sget v0, Lcom/huawei/wallet/R$string;->nfc_nullify_card_title:I

    return v0
.end method

.method public nullifyResultCallback(I)V
    .locals 3

    .line 36
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->dismissProgressDialog()V

    .line 37
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 40
    :pswitch_0
    const-string v0, "nullifyResultCallback: Delete card success,go to NFC HomeFragment."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 41
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->stopRetryCountDown()V

    .line 42
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_nullify_card_entrance_success:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->showToast(I)V

    .line 44
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 45
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.wallet.ui.cardholder.CardHolderActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 46
    const/high16 v0, 0x4000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 47
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 48
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->startActivity(Landroid/content/Intent;)V

    .line 49
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->finish()V

    .line 50
    goto :goto_1

    .line 52
    :pswitch_1
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_nullify_card_entrance_network_unable:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->showToast(I)V

    .line 53
    goto :goto_1

    .line 55
    :pswitch_2
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_nullify_card_entrance_smscode_unmatch:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->showToast(I)V

    .line 56
    goto :goto_1

    .line 58
    :pswitch_3
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_nullify_card_entrance_smscode_overtime:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->showToast(I)V

    .line 59
    goto :goto_1

    .line 61
    :pswitch_4
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_nullify_card_entrance_others_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->showToast(I)V

    .line 62
    goto :goto_1

    .line 64
    :goto_0
    :pswitch_5
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_nullify_card_entrance_others_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->showToast(I)V

    .line 67
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch -0x7
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_5
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_0
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 0

    .line 78
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->dismissProgressDialog()V

    .line 80
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->stopRetryCountDown()V

    .line 81
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->onDestroy()V

    .line 82
    return-void
.end method

.method public verifySmsCode(Ljava/lang/String;ILjava/lang/String;)V
    .locals 3

    .line 93
    sget v0, Lcom/huawei/wallet/R$string;->nfc_nullify_card_nullifying:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->showProgressDialog(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 94
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->nullifyCard(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/NullifyCardResultCallback;)V

    .line 95
    return-void
.end method
