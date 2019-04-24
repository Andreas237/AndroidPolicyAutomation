.class public Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;
.super Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/response/ActiveCardCallback;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public activeResultCallback(I)V
    .locals 3

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "active card result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 70
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->destroyLoadingDialog()V

    .line 71
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 74
    :pswitch_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_active_card_entrance_success:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->showToast(I)V

    goto :goto_1

    .line 80
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->stopRetryCountDown()V

    .line 81
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->destroyLoadingDialog()V

    .line 82
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardSuccessActvity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 83
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->startActivity(Landroid/content/Intent;)V

    .line 84
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->finish()V

    .line 86
    goto :goto_1

    .line 88
    :pswitch_1
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_active_card_entrance_auth_overtime:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->showToast(I)V

    .line 89
    goto :goto_1

    .line 91
    :pswitch_2
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_active_card_entrance_auto_notmatch:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->showToast(I)V

    .line 92
    goto :goto_1

    .line 94
    :pswitch_3
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->stopRetryCountDown()V

    .line 96
    goto :goto_1

    .line 98
    :pswitch_4
    sget v0, Lcom/huawei/wallet/R$string;->nfc_activate_card_fail_retry_later_or_contact_bank:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->showToast(I)V

    .line 99
    goto :goto_1

    .line 101
    :pswitch_5
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->stopRetryCountDown()V

    .line 102
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->showVerifyDialog()V

    .line 103
    goto :goto_1

    .line 105
    :goto_0
    :pswitch_6
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_active_card_entrance_unknown_errors:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->showToast(I)V

    .line 108
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x9
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_6
        :pswitch_6
        :pswitch_2
        :pswitch_1
        :pswitch_6
        :pswitch_6
        :pswitch_0
    .end packed-switch
.end method

.method protected getButtonNameResId()I
    .locals 1

    .line 45
    sget v0, Lcom/huawei/wallet/R$string;->nfc_next_step:I

    return v0
.end method

.method protected getSmsCode(Ljava/lang/String;I)V
    .locals 1

    .line 56
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->requestActiveSmsCode(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/response/RequestVerifyCodeCallback;)V

    .line 57
    return-void
.end method

.method protected getTitleResId()I
    .locals 1

    .line 33
    sget v0, Lcom/huawei/wallet/R$string;->nfc_active_card_title:I

    return v0
.end method

.method public onDestroy()V
    .locals 0

    .line 113
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->destroyLoadingDialog()V

    .line 115
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->stopRetryCountDown()V

    .line 116
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->onDestroy()V

    .line 117
    return-void
.end method

.method protected verifySmsCode(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 62
    sget v0, Lcom/huawei/wallet/R$string;->nfc_waiting_for_active_card:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->showLoadingDialog(I)V

    .line 63
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->activeCard(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/ActiveCardCallback;)V

    .line 64
    return-void
.end method
