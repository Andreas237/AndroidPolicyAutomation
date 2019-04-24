.class public Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;
.super Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;
.source "SourceFile"


# static fields
.field private static final KEY_ENTERANCE:Ljava/lang/String; = "key_enterance"


# instance fields
.field private final TAG:Ljava/lang/String;

.field private cardType:I

.field private entranceType:I

.field private fPan:Ljava/lang/String;

.field private issuerId:Ljava/lang/String;

.field private issuerMode:I

.field private mCardName:Ljava/lang/String;

.field private mCardRequestId:J

.field private mInstructionUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;-><init>()V

    .line 34
    const-class v0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->TAG:Ljava/lang/String;

    .line 64
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->entranceType:I

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;)Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->mInstructionUrl:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$002(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->mInstructionUrl:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;)Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;Ljava/lang/String;)V
    .locals 0

    .line 30
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->loadWebView(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;)I
    .locals 1

    .line 30
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->cardType:I

    return v0
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;Ljava/lang/String;)V
    .locals 0

    .line 30
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->loadWebView(Ljava/lang/String;)V

    return-void
.end method

.method private agreeLicenceJumpToBind()V
    .locals 5

    .line 231
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 233
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->cardType:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    .line 234
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "agreeLicenceJumpToBind.BindBusCardAddActivity.issuerId."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->issuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 236
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.nfc.carrera.ui.bus.opencard.BindBusCardAddActivity"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 237
    const-string v0, "key_enterance"

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->entranceType:I

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 238
    const-string v0, "traffic_card_issuerId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->issuerId:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 239
    const-string v0, "traffic_card_request_id"

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->mCardRequestId:J

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 240
    const-string v0, "traffic_card_name"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->mCardName:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 241
    invoke-virtual {p0, v3}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->startActivity(Landroid/content/Intent;)V

    .line 242
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->finish()V

    goto :goto_0

    .line 244
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "agreeLicenceJumpToBind.BindCardActivity.issuer_id."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->issuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 246
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.nfc.carrera.ui.bindcard.BindCardActivity"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 247
    const-string v0, "issuer_id"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->issuerId:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 248
    const-string v0, "card_type"

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->cardType:I

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 249
    const-string v0, "issuer_mode"

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->issuerMode:I

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 250
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->fPan:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dtj;->b(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 251
    const-string v0, "card_num"

    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 252
    invoke-virtual {p0, v3}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->startActivity(Landroid/content/Intent;)V

    .line 253
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->finish()V

    .line 256
    :goto_0
    return-void
.end method

.method private initAndLoadCardInstructionUrl()V
    .locals 5

    .line 166
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->cardType:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    .line 167
    sget v0, Lcom/huawei/wallet/R$string;->nfc_open_buscard_instruction:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->setTitle(I)V

    .line 168
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->issuerId:Ljava/lang/String;

    const-string v2, ""

    new-instance v3, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$1;

    invoke-direct {v3, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;)V

    .line 169
    const/4 v4, 0x0

    invoke-interface {v0, v1, v4, v2, v3}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryTrafficCardInfo(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V

    goto :goto_0

    .line 187
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->issuerId:Ljava/lang/String;

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$2;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;)V

    .line 188
    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryBankIssuerInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;)V

    .line 214
    :goto_0
    return-void
.end method

.method private initParams()Z
    .locals 5

    .line 125
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 126
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 127
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->TAG:Ljava/lang/String;

    const-string v1, "initParams intent empty."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    const/4 v0, 0x0

    return v0

    .line 131
    :cond_0
    invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    .line 132
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 133
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->TAG:Ljava/lang/String;

    const-string v1, "bundle empty."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    const/4 v0, 0x0

    return v0

    .line 137
    :cond_1
    const-string v0, "issuer_id"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->issuerId:Ljava/lang/String;

    .line 138
    const-string v0, "card_num"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dtj;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->fPan:Ljava/lang/String;

    .line 139
    const-string v0, "card_type"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->cardType:I

    .line 140
    const-string v0, "issuer_mode"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->issuerMode:I

    .line 142
    const-string v0, "card_request_id"

    const-wide/16 v1, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->mCardRequestId:J

    .line 143
    const-string v0, "card_name"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->mCardName:Ljava/lang/String;

    .line 145
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->issuerId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 146
    const/4 v0, 0x0

    return v0

    .line 149
    :cond_2
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->cardType:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_3

    .line 150
    const/4 v0, 0x1

    return v0

    .line 158
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private startBindBusCardSwitchActivity()V
    .locals 3

    .line 352
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 353
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.nfc.carrera.ui.bus.opencard.BindBusCardSwitchActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 354
    const/high16 v0, 0x10000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 355
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->startActivity(Landroid/content/Intent;)V

    .line 356
    return-void
.end method


# virtual methods
.method public getTitleStrResc()Ljava/lang/String;
    .locals 1

    .line 92
    sget v0, Lcom/huawei/wallet/R$string;->nfc_open_card_instruction:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public loadWebviewFailed()V
    .locals 2

    .line 108
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->TAG:Ljava/lang/String;

    const-string v1, "loadWebviewFailed"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->acceptButton:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 110
    return-void
.end method

.method public loadWebviewSuccess()V
    .locals 2

    .line 97
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->TAG:Ljava/lang/String;

    const-string v1, "loadWebviewSuccess"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->webviewCodeResult:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->acceptButton:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 100
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->acceptButton:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    goto :goto_0

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->acceptButton:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 104
    :goto_0
    return-void
.end method

.method public loadingProgress()V
    .locals 2

    .line 114
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->TAG:Ljava/lang/String;

    const-string v1, "loadingProgress"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->acceptButton:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 116
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->acceptButton:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 117
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 346
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->onBackPressed()V

    .line 348
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->startBindBusCardSwitchActivity()V

    .line 349
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 329
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 330
    sget v0, Lcom/huawei/wallet/R$id;->no_network_tip:I

    if-ne v0, v2, :cond_0

    .line 331
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->TAG:Ljava/lang/String;

    const-string v1, "onClick nfc_no_network_text."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->showLoadingProgress()V

    .line 334
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WebViewActivity : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->mInstructionUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 335
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->mInstructionUrl:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 336
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->mInstructionUrl:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->loadWebView(Ljava/lang/String;)V

    goto :goto_0

    .line 339
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->onClick(Landroid/view/View;)V

    .line 341
    :cond_1
    :goto_0
    return-void
.end method

.method public onClickEvent(Landroid/view/View;)V
    .locals 2

    .line 222
    sget v0, Lcom/huawei/wallet/R$id;->accept_button:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 223
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->agreeLicenceJumpToBind()V

    .line 225
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 80
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/webview/WebViewActivity;->onCreate(Landroid/os/Bundle;)V

    .line 81
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->setRequestedOrientation(I)V

    .line 82
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->initParams()Z

    move-result v0

    if-nez v0, :cond_0

    .line 83
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->finish()V

    .line 84
    return-void

    .line 87
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->initAndLoadCardInstructionUrl()V

    .line 88
    return-void
.end method
