.class public Lcom/huawei/nfc/NFCEntranceActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/ui/cardlist/listener/EnableNFCListener;


# static fields
.field public static final CARD_PACKAGE_JUMP_TO_ADD_CARD_ACTION:Ljava/lang/String; = "com.huawei.nfc.intent.action.NFC_ADD_CARD"

.field public static final CARD_PACKAGE_JUMP_TO_CARD__DETAIL_ACTION:Ljava/lang/String; = "com.huawei.nfc.intent.action.NFC_ENTER_CARD_DETAIL"

.field public static final OPEN_NFC_SETTING_ACTION:Ljava/lang/String; = "com.huawei.nfc.intent.action.OPEN_NFC_SETTING"

.field public static final OTO_JUMP_TO_SWIPE_ACTION:Ljava/lang/String; = "com.huawei.nfc.intent.action.NFC_SWIPE"


# instance fields
.field private intent:Landroid/content/Intent;

.field private openNFCTimes:I

.field private progress:Lo/yw;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 62
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->openNFCTimes:I

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/NFCEntranceActivity;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->stopProgress()V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/nfc/NFCEntranceActivity;Ljava/lang/String;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/huawei/nfc/NFCEntranceActivity;->startProgress(Ljava/lang/String;)V

    return-void
.end method

.method private initAction()V
    .locals 2

    .line 76
    invoke-virtual {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->intent:Landroid/content/Intent;

    .line 78
    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->intent:Landroid/content/Intent;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->intent:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->finish()V

    .line 81
    return-void

    .line 87
    :cond_1
    invoke-direct {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->jumpByAction()V

    .line 89
    return-void
.end method

.method private jumpByAction()V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->intent:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 97
    const-string v0, "com.huawei.nfc.intent.action.NFC_SWIPE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    invoke-direct {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->preparJumpToSwipeactivity()V

    goto :goto_0

    .line 101
    :cond_0
    const-string v0, "com.huawei.nfc.intent.action.NFC_ADD_CARD"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 103
    invoke-direct {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->preparjumpToAddcardActivity()V

    goto :goto_0

    .line 106
    :cond_1
    const-string v0, "com.huawei.nfc.intent.action.NFC_ENTER_CARD_DETAIL"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 108
    invoke-direct {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->preparjumpToCardDetaiActivity()V

    goto :goto_0

    .line 110
    :cond_2
    const-string v0, "com.huawei.nfc.intent.action.OPEN_NFC_SETTING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 112
    invoke-virtual {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->finish()V

    .line 114
    :cond_3
    :goto_0
    return-void
.end method

.method private jumpToAddcardActivity()V
    .locals 2

    .line 255
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 256
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/NFCEntranceActivity;->startActivity(Landroid/content/Intent;)V

    .line 257
    invoke-virtual {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->finish()V

    .line 258
    return-void
.end method

.method private jumpToBankCardDetailActivity(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 240
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 241
    const-string v0, "issuerId"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 242
    const-string v0, "referenceId"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 243
    const-class v0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 244
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/NFCEntranceActivity;->startActivity(Landroid/content/Intent;)V

    .line 245
    invoke-virtual {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->finish()V

    .line 246
    return-void
.end method

.method private jumpToTrafficCardDetailActivity(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 226
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 227
    const-string v0, "traffic_card_issuerId"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 228
    const-string v0, "traffic_card_productId"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 229
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/NFCEntranceActivity;->startActivity(Landroid/content/Intent;)V

    .line 230
    invoke-virtual {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->finish()V

    .line 231
    return-void
.end method

.method private preparJumpToSwipeactivity()V
    .locals 0

    .line 216
    return-void
.end method

.method private preparjumpToAddcardActivity()V
    .locals 0

    .line 211
    invoke-direct {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->jumpToAddcardActivity()V

    .line 212
    return-void
.end method

.method private preparjumpToCardDetaiActivity()V
    .locals 7

    .line 124
    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->intent:Landroid/content/Intent;

    const-string v1, "CARD_INFO"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    .line 126
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 128
    const-string v0, " preparjumpToCardDetaiActivity  fail  "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 129
    invoke-virtual {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->finish()V

    .line 130
    return-void

    .line 132
    :cond_0
    const-string v0, "cardGroup"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 133
    const-string v0, "issuerId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 134
    const-string v0, "productId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 135
    const-string v0, "referenceId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 137
    const/4 v0, 0x2

    if-ne v0, v3, :cond_3

    .line 139
    const-string v0, "preparjumpToCardDetaiActivity : jump to traffic card detail activity"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 141
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 143
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->finish()V

    .line 144
    return-void

    .line 146
    :cond_2
    invoke-direct {p0, v4, v5}, Lcom/huawei/nfc/NFCEntranceActivity;->jumpToTrafficCardDetailActivity(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    return-void

    .line 150
    :cond_3
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x1

    invoke-static {v6, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 152
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->finish()V

    .line 153
    return-void

    .line 155
    :cond_5
    invoke-direct {p0, v4, v6}, Lcom/huawei/nfc/NFCEntranceActivity;->jumpToBankCardDetailActivity(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    return-void
.end method

.method private showOpenNFCDialog()V
    .locals 4

    .line 348
    const-string v0, "showOpenNFCDialog"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 349
    invoke-static {p0}, Lo/yk;->e(Landroid/content/Context;)Lo/yr;

    move-result-object v3

    .line 350
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    invoke-interface {v3, v0}, Lo/yr;->setTitle(I)V

    .line 351
    const/4 v0, 0x0

    invoke-interface {v3, v0}, Lo/yr;->setCancelable(Z)V

    .line 352
    sget v0, Lcom/huawei/wallet/R$string;->nfc_open_swipe_setting_dialogTip:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/NFCEntranceActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Lo/yr;->c(Ljava/lang/String;)Lo/yr;

    .line 353
    sget v0, Lcom/huawei/wallet/R$string;->nfc_ok:I

    new-instance v1, Lcom/huawei/nfc/NFCEntranceActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/NFCEntranceActivity$2;-><init>(Lcom/huawei/nfc/NFCEntranceActivity;)V

    invoke-interface {v3, v0, v1}, Lo/yr;->e(ILandroid/content/DialogInterface$OnClickListener;)Lo/yr;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_cancel:I

    new-instance v2, Lcom/huawei/nfc/NFCEntranceActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/NFCEntranceActivity$1;-><init>(Lcom/huawei/nfc/NFCEntranceActivity;)V

    .line 364
    invoke-interface {v0, v1, v2}, Lo/yr;->d(ILandroid/content/DialogInterface$OnClickListener;)Lo/yr;

    .line 375
    const/4 v0, 0x0

    invoke-interface {v3, v0}, Lo/yr;->setCanceledOnTouchOutside(Z)V

    .line 376
    invoke-interface {v3}, Lo/yr;->show()V

    .line 377
    return-void
.end method

.method private startProgress(Ljava/lang/String;)V
    .locals 2

    .line 324
    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->progress:Lo/yw;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->progress:Lo/yw;

    invoke-interface {v0}, Lo/yw;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 326
    return-void

    .line 328
    :cond_0
    invoke-static {p0}, Lo/yk;->c(Landroid/content/Context;)Lo/yw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->progress:Lo/yw;

    .line 329
    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->progress:Lo/yw;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/yw;->b(I)V

    .line 330
    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->progress:Lo/yw;

    invoke-interface {v0, p1}, Lo/yw;->a(Ljava/lang/CharSequence;)V

    .line 331
    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->progress:Lo/yw;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/yw;->setCanceledOnTouchOutside(Z)V

    .line 332
    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->progress:Lo/yw;

    invoke-interface {v0}, Lo/yw;->show()V

    .line 333
    return-void
.end method

.method private stopProgress()V
    .locals 1

    .line 337
    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->progress:Lo/yw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->progress:Lo/yw;

    invoke-interface {v0}, Lo/yw;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 339
    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->progress:Lo/yw;

    invoke-interface {v0}, Lo/yw;->dismiss()V

    .line 341
    :cond_0
    return-void
.end method


# virtual methods
.method public checkNFC()Z
    .locals 1

    .line 299
    invoke-static {p0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isSupportNFCSwipe(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 301
    invoke-static {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->registEnableListener(Lcom/huawei/nfc/carrera/ui/cardlist/listener/EnableNFCListener;)V

    .line 303
    invoke-static {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->isAutoOpenNFC()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 305
    sget v0, Lcom/huawei/wallet/R$string;->nfc_open_swipe_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/NFCEntranceActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/NFCEntranceActivity;->startProgress(Ljava/lang/String;)V

    .line 307
    invoke-static {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->openNFCEnvironment(Landroid/app/Activity;)V

    goto :goto_0

    .line 312
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->showOpenNFCDialog()V

    .line 314
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 316
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public dealDefaultPay()V
    .locals 0

    .line 383
    invoke-direct {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->stopProgress()V

    .line 384
    return-void
.end method

.method public enableNFCFailed()V
    .locals 2

    .line 389
    invoke-direct {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->stopProgress()V

    .line 391
    iget v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->openNFCTimes:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 393
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_list_cancel_tip:I

    invoke-static {p0, v0}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;I)V

    .line 394
    invoke-virtual {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->finish()V

    goto :goto_0

    .line 398
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->showOpenNFCDialog()V

    .line 399
    iget v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->openNFCTimes:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/nfc/NFCEntranceActivity;->openNFCTimes:I

    .line 401
    :goto_0
    return-void
.end method

.method public enableNFCSuccess()V
    .locals 0

    .line 406
    invoke-direct {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->stopProgress()V

    .line 407
    invoke-direct {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->initAction()V

    .line 408
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 271
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 273
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NFCEntanceActivity requestCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", resultCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 275
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 277
    if-nez p2, :cond_0

    .line 280
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_list_cancel_tip:I

    invoke-static {p0, v0}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;I)V

    .line 281
    invoke-virtual {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->finish()V

    goto :goto_0

    .line 283
    :cond_0
    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    .line 285
    invoke-virtual {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->enableNFCSuccess()V

    goto :goto_0

    .line 289
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->enableNFCFailed()V

    .line 292
    :cond_2
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 67
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 68
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/NFCEntranceActivity;->setRequestedOrientation(I)V

    .line 69
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/NFCEntranceActivity;->requestWindowFeature(I)Z

    .line 71
    invoke-direct {p0}, Lcom/huawei/nfc/NFCEntranceActivity;->initAction()V

    .line 72
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 413
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 414
    const-string v0, "NFCEntranceActivity  onDestroy"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 415
    invoke-static {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->unRegistEnableListener(Lcom/huawei/nfc/carrera/ui/cardlist/listener/EnableNFCListener;)V

    .line 416
    return-void
.end method

.method protected onPause()V
    .locals 1

    .line 421
    const-string v0, "NFCEntranceActivity  onPause"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 422
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 423
    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 264
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 265
    const-string v0, "NFCEntranceActivity  onResume."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 266
    return-void
.end method

.method protected onStop()V
    .locals 1

    .line 428
    const-string v0, "NFCEntranceActivity  onStop"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 429
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 430
    return-void
.end method
