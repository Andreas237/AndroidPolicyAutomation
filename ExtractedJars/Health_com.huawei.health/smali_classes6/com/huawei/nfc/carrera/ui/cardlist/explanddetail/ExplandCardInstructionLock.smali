.class public Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

.field private mContext:Landroid/content/Context;

.field private phoneToBank:Lo/egd;

.field private tv_detail_tip:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->mContext:Landroid/content/Context;

    .line 59
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;Ljava/lang/String;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->callServicePhone(Ljava/lang/String;)V

    return-void
.end method

.method private callServicePhone(Ljava/lang/String;)V
    .locals 5

    .line 146
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tel:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 147
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.intent.action.DIAL"

    invoke-direct {v3, v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 150
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 155
    goto :goto_0

    .line 152
    :catch_0
    move-exception v4

    .line 154
    const-string v0, "ExplandCardInstructionLock jump to dial:"

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 156
    :goto_0
    return-void
.end method

.method private clickDetailAction()V
    .locals 4

    .line 122
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 124
    :cond_0
    const-string v0, "the clicked card info is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 125
    return-void

    .line 127
    :cond_1
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 128
    const-string v0, "cardGroup"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->c()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 129
    const-string v0, "issuerId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    const-string v0, "referenceId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 133
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->mContext:Landroid/content/Context;

    const-class v1, Lcom/huawei/nfc/NFCEntranceActivity;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 134
    const-string v0, "com.huawei.nfc.intent.action.NFC_ENTER_CARD_DETAIL"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 135
    const-string v0, "CARD_INFO"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 136
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 137
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 139
    return-void
.end method


# virtual methods
.method public initView(I)Landroid/view/View;
    .locals 5

    .line 63
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$layout;->card_instruction_lock:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 65
    sget v0, Lcom/huawei/wallet/R$id;->cardinstru_detail_tv:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->tv_detail_tip:Landroid/widget/TextView;

    .line 66
    sget v0, Lcom/huawei/wallet/R$id;->cardinstru_phone_to_bank:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->phoneToBank:Lo/egd;

    .line 68
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->tv_detail_tip:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->phoneToBank:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v4, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 72
    iput p1, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 73
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 75
    return-object v3
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 83
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    .line 85
    sget v0, Lcom/huawei/wallet/R$id;->cardinstru_detail_tv:I

    if-ne v0, v3, :cond_0

    .line 87
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->clickDetailAction()V

    goto :goto_0

    .line 89
    :cond_0
    sget v0, Lcom/huawei/wallet/R$id;->cardinstru_phone_to_bank:I

    if-ne v0, v3, :cond_2

    .line 91
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 93
    return-void

    .line 95
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/LogicApiFactory;->createCardManager(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock$1;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock$1;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;)V

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryBankIssuerInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;)V

    .line 112
    :cond_2
    :goto_0
    return-void
.end method

.method public setData(Lcom/huawei/wallet/model/unicard/UniCardInfo;)V
    .locals 1

    .line 160
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 162
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 165
    :cond_0
    return-void
.end method
