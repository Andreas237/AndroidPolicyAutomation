.class public Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;
.super Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;
.source "SourceFile"


# instance fields
.field private btnOpenCard:Lo/egd;

.field private edtPhonenum:Lo/eha;

.field private phoneNum:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;-><init>()V

    .line 48
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->phoneNum:Ljava/lang/String;

    return-void
.end method

.method private initParams()Z
    .locals 5

    .line 116
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 117
    if-nez v3, :cond_0

    .line 119
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    .line 120
    const-string v0, "initParams, intent == null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 121
    const/4 v0, 0x0

    return v0

    .line 124
    :cond_0
    invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    .line 125
    if-nez v4, :cond_1

    .line 127
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    .line 128
    const-string v0, "initParams, bundle == null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 129
    const/4 v0, 0x0

    return v0

    .line 132
    :cond_1
    const-string v0, "traffic_card_issuerId"

    const-string v1, ""

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mIssuerId:Ljava/lang/String;

    .line 133
    const-string v0, "traffic_card_aid"

    const-string v1, ""

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mCardAid:Ljava/lang/String;

    .line 134
    const-string v0, "traffic_card_name"

    const-string v1, ""

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mCardName:Ljava/lang/String;

    .line 135
    const-string v0, "traffic_card_paytypeinfo"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    .line 137
    const-string v0, "traffic_card_issuemoney"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    .line 138
    const-string v0, "traffic_card_request_id"

    const-wide/16 v1, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mCardRequestId:J

    .line 139
    const-string v0, "key_enterance"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->entranceType:I

    .line 140
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mIssuerId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 142
    const-string v0, "initParams, illegal params"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 143
    const/4 v0, 0x0

    return v0

    .line 145
    :cond_2
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public applyPayOrderCallback(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V
    .locals 3

    .line 190
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "applyIssueOrderCallback, mLoadingDialog21 status"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v1}, Lo/egn;->isShowing()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->isVisible:Z

    if-nez v0, :cond_1

    .line 192
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->applyOrderProgressDialog:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->dismissProgress(Lo/egn;)V

    .line 193
    const-string v0, "applyIssueOrderCallback, no need to handle callback"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 194
    return-void

    .line 197
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->applyOrderProgressDialog:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->dismissProgress(Lo/egn;)V

    .line 198
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "applyIssueOrderCallback, resultCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 199
    const/4 v0, 0x0

    if-ne v0, p1, :cond_4

    if-eqz p2, :cond_4

    .line 201
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 203
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->phoneNum:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setPhoneNum(Ljava/lang/String;)V

    .line 205
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getHasUnusedIssueOrder()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 207
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->showProgressDialog()V

    .line 208
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mIssuerId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->issueTrafficCard(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;)V

    .line 210
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->reportCardOpened()V

    goto :goto_0

    .line 213
    :cond_2
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->isDuplicateApply()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 215
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->showProgressDialog()V

    .line 217
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->rechargeAmount:D

    .line 218
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mIssuerId:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->queryAndHandleUnfinfishedOrders(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;)V

    goto :goto_0

    .line 222
    :cond_3
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->startPay(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    goto :goto_0

    .line 227
    :cond_4
    const-string v0, "applyIssueOrderCallback, apply failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 228
    const/4 v0, 0x1

    if-eq v0, p1, :cond_5

    const/16 v0, 0xa

    if-eq v0, p1, :cond_5

    const/16 v0, 0x17

    if-eq v0, p1, :cond_5

    const/16 v0, 0x18

    if-eq v0, p1, :cond_5

    const/16 v0, 0x19

    if-eq v0, p1, :cond_5

    const/16 v0, 0x63

    if-ne v0, p1, :cond_6

    .line 236
    :cond_5
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mIssuerId:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "applyIssueOrderCallback, apply failed"

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    :cond_6
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->showErrorDialog(Ljava/lang/String;)V

    .line 241
    :goto_0
    return-void
.end method

.method public init()V
    .locals 5

    .line 75
    invoke-static {p0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->progressDialog21:Lo/egn;

    .line 76
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->progressDialog21:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCanceledOnTouchOutside(Z)V

    .line 78
    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_beijing_activity_pay_amount:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->textPayAmount:Landroid/widget/TextView;

    .line 79
    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_beijing_activity_open_card_amount_orginal:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->textStdOpenAmount:Landroid/widget/TextView;

    .line 80
    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_beijing_activity_open_card_amount_real:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->textOpenAmount:Landroid/widget/TextView;

    .line 81
    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_beijing_activity_recharge_amount:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->textChargeAmount:Landroid/widget/TextView;

    .line 83
    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_beijing_activity_edt_phonenum:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eha;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->edtPhonenum:Lo/eha;

    .line 84
    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_beijing_activity_open_card_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->btnOpenCard:Lo/egd;

    .line 86
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->btnOpenCard:Lo/egd;

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->btnOpenCard:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 91
    :cond_0
    invoke-static {p0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->applyOrderProgressDialog:Lo/egn;

    .line 92
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->applyOrderProgressDialog:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCanceledOnTouchOutside(Z)V

    .line 95
    sget v0, Lcom/huawei/wallet/R$string;->nfc_money_type:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 99
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueMoney()D

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueStdMoney()D

    move-result-wide v2

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 100
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->textStdOpenAmount:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 101
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->textStdOpenAmount:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueStdMoney()D

    move-result-wide v1

    invoke-static {v4, v1, v2}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->changeIntoDisplayMoney(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->textStdOpenAmount:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setFlags(I)V

    .line 105
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getPayMoney()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->payAmount:D

    .line 106
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->payAmount:D

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueMoney()D

    move-result-wide v2

    sub-double/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->rechargeAmount:D

    .line 107
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->textOpenAmount:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueMoney()D

    move-result-wide v1

    invoke-static {v4, v1, v2}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->changeIntoDisplayMoney(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 108
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->textChargeAmount:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getRechargeMoney()D

    move-result-wide v1

    invoke-static {v4, v1, v2}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->changeIntoDisplayMoney(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->textPayAmount:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getPayMoney()D

    move-result-wide v1

    invoke-static {v4, v1, v2}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->changeIntoDisplayMoney(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    return-void
.end method

.method public isValidMobilePhone(Ljava/lang/String;)Z
    .locals 3

    .line 271
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 273
    const/4 v0, 0x0

    return v0

    .line 276
    :cond_0
    const-string v0, "^1[0-9]{10}$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 277
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 278
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    return v0
.end method

.method public onBackPressed()V
    .locals 0

    .line 255
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->onBackPressed()V

    .line 260
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->finish()V

    .line 261
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 151
    invoke-static {}, Lcom/huawei/nfc/carrera/ui/bus/util/TimeUtil;->isFastDoubleClick()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    const-string v0, "onClick, isFastDoubleClick"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 153
    return-void

    .line 156
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->edtPhonenum:Lo/eha;

    invoke-virtual {v0}, Lo/eha;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->phoneNum:Ljava/lang/String;

    .line 157
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->phoneNum:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 159
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_beijing_phonenum_hint:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->showToast(I)V

    .line 160
    return-void

    .line 162
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->phoneNum:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->isValidMobilePhone(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 164
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_beijing_phonenum_toast:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->showToast(I)V

    .line 165
    return-void

    .line 172
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->requestShOrder()V

    .line 174
    return-void
.end method

.method protected onCreateInit()V
    .locals 1

    .line 58
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->setRequestedOrientation(I)V

    .line 59
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_beijing_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->setTitle(I)V

    .line 60
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_add_bus_card_beijing:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->setContentView(I)V

    .line 61
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->initParams()Z

    move-result v0

    if-nez v0, :cond_0

    .line 63
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->finish()V

    .line 64
    return-void

    .line 66
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->init()V

    .line 67
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 71
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->onStart()V

    .line 72
    return-void
.end method

.method protected reportCardOpened()V
    .locals 3

    .line 249
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mCardAid:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mCardName:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;->mIssuerId:Ljava/lang/String;

    invoke-static {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/util/NfcHianalyticsUtil;->onReportForCardOpenAction(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    return-void
.end method
