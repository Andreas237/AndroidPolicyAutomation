.class public abstract Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;
.super Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/response/RequestVerifyCodeCallback;


# static fields
.field public static final ISSUER_MODE:Ljava/lang/String; = "issuerMode"

.field public static final REF_ID:Ljava/lang/String; = "refId"

.field private static final SMS_LENGTH_LIMIT:I = 0x4


# instance fields
.field private getVerifyCodeButton:Landroid/widget/TextView;

.field protected mRefId:Ljava/lang/String;

.field private mode:I

.field private nextStepButton:Lo/egd;

.field private verifyCodeGetTimer:Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;

.field private verifyCodeInputView:Lo/eha;

.field private verifyPhoneNumTip:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;)Lo/egd;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->nextStepButton:Lo/egd;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->jumpToHomeActivity()V

    return-void
.end method

.method private hideSoftInputWindow(Landroid/widget/EditText;)V
    .locals 3

    .line 413
    const-string v0, "input_method"

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 414
    invoke-virtual {p1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 415
    return-void
.end method

.method private initParams()Z
    .locals 4

    .line 109
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 110
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 112
    const-string v0, "initParams intent empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 113
    const/4 v0, 0x0

    return v0

    .line 116
    :cond_0
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 117
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 119
    const-string v0, "bundle empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 120
    const/4 v0, 0x0

    return v0

    .line 123
    :cond_1
    const-string v0, "refId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->mRefId:Ljava/lang/String;

    .line 124
    const-string v0, "issuerMode"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->mode:I

    .line 125
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->mRefId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->mode:I

    if-gtz v0, :cond_3

    .line 127
    :cond_2
    const-string v0, "params is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 128
    const/4 v0, 0x0

    return v0

    .line 131
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private initViews()V
    .locals 3

    .line 139
    sget v0, Lcom/huawei/wallet/R$id;->verify_phone_num_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyPhoneNumTip:Landroid/widget/TextView;

    .line 140
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyPhoneNumTip:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_verify_phone_tip:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    sget v0, Lcom/huawei/wallet/R$id;->sms_code_input:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eha;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyCodeInputView:Lo/eha;

    .line 143
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyCodeInputView:Lo/eha;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;)V

    invoke-virtual {v0, v1}, Lo/eha;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 171
    sget v0, Lcom/huawei/wallet/R$id;->get_sms_code:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getVerifyCodeButton:Landroid/widget/TextView;

    .line 172
    sget v0, Lcom/huawei/wallet/R$id;->get_sms_next_step:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->nextStepButton:Lo/egd;

    .line 173
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->nextStepButton:Lo/egd;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getButtonNameResId()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 174
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getButtonNameColor()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getButtonNameColor() ::"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getButtonNameColor()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 177
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->nextStepButton:Lo/egd;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getButtonNameColor()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 180
    :cond_0
    invoke-static {p0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 182
    sget v0, Lcom/huawei/wallet/R$string;->no_network:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->showToast(I)V

    .line 183
    return-void

    .line 186
    :cond_1
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->startRetryCountDown()V

    .line 187
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->mRefId:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->mode:I

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getSmsCode(Ljava/lang/String;I)V

    .line 188
    return-void
.end method

.method private jumpToHomeActivity()V
    .locals 3

    .line 398
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 399
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.wallet.ui.cardholder.CardHolderActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 401
    const/high16 v0, 0x4000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 403
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 404
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->startActivity(Landroid/content/Intent;)V

    .line 405
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->finish()V

    .line 406
    return-void
.end method

.method private startRetryCountDown()V
    .locals 4

    .line 273
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyCodeGetTimer:Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 275
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getVerifyCodeButton:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyPhoneNumTip:Landroid/widget/TextView;

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;-><init>(Landroid/content/Context;Landroid/widget/TextView;Landroid/widget/TextView;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyCodeGetTimer:Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;

    .line 278
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyCodeGetTimer:Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->startTimer()V

    .line 279
    return-void
.end method


# virtual methods
.method protected getButtonNameColor()I
    .locals 1

    .line 197
    const/4 v0, -0x1

    return v0
.end method

.method protected abstract getButtonNameResId()I
.end method

.method protected abstract getSmsCode(Ljava/lang/String;I)V
.end method

.method protected abstract getTitleResId()I
.end method

.method public onClickEvent(Landroid/view/View;)V
    .locals 4

    .line 242
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    .line 243
    sget v0, Lcom/huawei/wallet/R$id;->get_sms_code:I

    if-ne v0, v3, :cond_1

    .line 245
    invoke-static {p0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 247
    sget v0, Lcom/huawei/wallet/R$string;->no_network:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->showToast(I)V

    .line 248
    return-void

    .line 251
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->startRetryCountDown()V

    .line 252
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->mRefId:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->mode:I

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getSmsCode(Ljava/lang/String;I)V

    goto :goto_0

    .line 254
    :cond_1
    sget v0, Lcom/huawei/wallet/R$id;->get_sms_next_step:I

    if-ne v0, v3, :cond_3

    .line 256
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyCodeInputView:Lo/eha;

    invoke-virtual {v0}, Lo/eha;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 258
    sget v0, Lcom/huawei/wallet/R$string;->nfc_input_legal_sms_code_toast:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->showToast(I)V

    .line 259
    return-void

    .line 262
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyCodeInputView:Lo/eha;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->hideSoftInputWindow(Landroid/widget/EditText;)V

    .line 264
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->mRefId:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->mode:I

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyCodeInputView:Lo/eha;

    invoke-virtual {v2}, Lo/eha;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifySmsCode(Ljava/lang/String;ILjava/lang/String;)V

    .line 266
    :cond_3
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 89
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 90
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->setRequestedOrientation(I)V

    .line 91
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->initParams()Z

    move-result v0

    if-nez v0, :cond_0

    .line 93
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->finish()V

    .line 94
    return-void

    .line 97
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getTitleResId()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->setTitle(I)V

    .line 98
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_activity_verify_sms:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->setContentView(I)V

    .line 99
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->initViews()V

    .line 100
    return-void
.end method

.method public requestResultCallback(ILjava/lang/String;)V
    .locals 2

    .line 295
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 297
    return-void

    .line 299
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123=== resultCode"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 300
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 303
    :pswitch_0
    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 305
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->showVerifyNumTip(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 309
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyPhoneNumTip:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_verify_phone_tip_without_phone_num:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 311
    goto :goto_1

    .line 313
    :pswitch_1
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->stopRetryCountDown()V

    .line 314
    sget v0, Lcom/huawei/wallet/R$string;->nfc_request_sms_code_overcount:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->showToast(I)V

    .line 315
    goto :goto_1

    .line 317
    :pswitch_2
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->stopRetryCountDown()V

    .line 318
    sget v0, Lcom/huawei/wallet/R$string;->nfc_request_sms_code_servererror:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->showToast(I)V

    .line 319
    goto :goto_1

    .line 321
    :pswitch_3
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->stopRetryCountDown()V

    .line 322
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->showVerifyDialog()V

    .line 323
    goto :goto_1

    .line 325
    :pswitch_4
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->stopRetryCountDown()V

    .line 326
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyCodeInputView:Lo/eha;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->hideSoftInputWindow(Landroid/widget/EditText;)V

    .line 327
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_allready_activited:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->showToast(I)V

    .line 328
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->finish()V

    .line 329
    goto :goto_1

    .line 331
    :pswitch_5
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->stopRetryCountDown()V

    .line 332
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyCodeInputView:Lo/eha;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->hideSoftInputWindow(Landroid/widget/EditText;)V

    .line 334
    goto :goto_1

    .line 336
    :pswitch_6
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->stopRetryCountDown()V

    .line 337
    sget v0, Lcom/huawei/wallet/R$string;->nfc_request_sms_fail_retry_later_or_contact_bank:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->showToast(I)V

    .line 338
    goto :goto_1

    .line 340
    :pswitch_7
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->stopRetryCountDown()V

    .line 341
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_contact_bank:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->showToast(I)V

    .line 342
    goto :goto_1

    .line 344
    :goto_0
    :pswitch_8
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->stopRetryCountDown()V

    .line 345
    sget v0, Lcom/huawei/wallet/R$string;->nfc_request_sms_code_otherreason:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->showToast(I)V

    .line 348
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch -0x9
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_8
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected showVerifyDialog()V
    .locals 3

    .line 380
    invoke-static {p0}, Lo/yk;->e(Landroid/content/Context;)Lo/yr;

    move-result-object v2

    .line 381
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    invoke-interface {v2, v0}, Lo/yr;->setTitle(I)V

    .line 382
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_active_card_entrance_delete:I

    invoke-interface {v2, v0}, Lo/yr;->c(I)Lo/yr;

    .line 383
    sget v0, Lcom/huawei/wallet/R$string;->nfc_ok:I

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity$2;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;)V

    invoke-interface {v2, v0, v1}, Lo/yr;->e(ILandroid/content/DialogInterface$OnClickListener;)Lo/yr;

    .line 392
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Lo/yr;->setCanceledOnTouchOutside(Z)V

    .line 393
    invoke-interface {v2}, Lo/yr;->show()V

    .line 394
    return-void
.end method

.method protected showVerifyNumTip(Ljava/lang/String;)V
    .locals 4

    .line 231
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyPhoneNumTip:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_verify_phone_tip_content:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {p0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyPhoneNumTip:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 233
    return-void
.end method

.method protected stopRetryCountDown()V
    .locals 2

    .line 286
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyCodeGetTimer:Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 288
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifySmsCodeActivity;->verifyCodeGetTimer:Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->stopTimer()V

    .line 290
    :cond_0
    return-void
.end method

.method protected abstract verifySmsCode(Ljava/lang/String;ILjava/lang/String;)V
.end method
