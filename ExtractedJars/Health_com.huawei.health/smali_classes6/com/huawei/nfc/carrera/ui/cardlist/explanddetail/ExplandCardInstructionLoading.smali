.class public Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

.field private mContext:Landroid/content/Context;

.field private tv_detail_tip:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 39
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->mContext:Landroid/content/Context;

    .line 41
    return-void
.end method

.method private clickDetailAction()V
    .locals 2

    .line 95
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    :cond_0
    const-string v0, "the clicked card info is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 98
    return-void

    .line 101
    :cond_1
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->jumpToDetail()V

    .line 102
    return-void
.end method

.method private jumpToDetail()V
    .locals 3

    .line 106
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 108
    return-void

    .line 112
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->c()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 114
    const-string v0, "jumpToCardDetailActivity : jump to traffic card detail activity"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 116
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->i()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->jumpToTrafficCardDetailActivity(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    return-void

    .line 120
    :cond_1
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 121
    const-string v0, "issuerId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 122
    const-string v0, "referenceId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 123
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->mContext:Landroid/content/Context;

    const-class v1, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 124
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 147
    return-void
.end method

.method private jumpToTrafficCardDetailActivity(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 156
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->mContext:Landroid/content/Context;

    const-class v1, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 157
    const-string v0, "traffic_card_issuerId"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 158
    const-string v0, "traffic_card_productId"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 159
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 160
    return-void
.end method


# virtual methods
.method public initView(I)Landroid/view/View;
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$layout;->nfc_homefragment_card_instruction:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 48
    sget v0, Lcom/huawei/wallet/R$id;->cardinstru_detail_tv:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->tv_detail_tip:Landroid/widget/TextView;

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->tv_detail_tip:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 51
    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v4, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 52
    iput p1, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 53
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 57
    const-string v0, "====test====null != cardDetail"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 58
    sget v0, Lcom/huawei/wallet/R$id;->cardinstru_instruction:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 59
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_instruction_nullifying_desc_new:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    :cond_0
    return-object v3
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 80
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 82
    sget v0, Lcom/huawei/wallet/R$id;->cardinstru_detail_tv:I

    if-ne v0, v1, :cond_0

    .line 84
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->clickDetailAction()V

    .line 86
    :cond_0
    return-void
.end method

.method public setData(Lcom/huawei/wallet/model/unicard/UniCardInfo;)V
    .locals 1

    .line 71
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 73
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLoading;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 75
    :cond_0
    return-void
.end method
