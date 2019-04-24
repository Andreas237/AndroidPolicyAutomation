.class public Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryRecordsListCallback;


# static fields
.field private static final ABOUT_QUICK_PASS_WEBVEIW_URL:Ljava/lang/String; = "https://pcpay.vmall.com/agreement/yinlian-cloud-pay.html"

.field private static final TAG:Ljava/lang/String; = "ExplandCardInstruction"


# instance fields
.field private activity:Landroid/app/Activity;

.field private balanceOrConsume:Landroid/widget/TextView;

.field private buacardDetail:Landroid/widget/LinearLayout;

.field private cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

.field private cardInfoManagerApi:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

.field private cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

.field private tradeAmount:Landroid/widget/TextView;

.field private tradeTime:Landroid/widget/TextView;

.field private tv_cardName:Landroid/widget/TextView;

.field private tv_description:Landroid/widget/TextView;

.field private tv_detail_tip:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 113
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 114
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->activity:Landroid/app/Activity;

    .line 115
    invoke-static {p1}, Lcom/huawei/nfc/carrera/logic/LogicApiFactory;->createCardManager(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->cardInfoManagerApi:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    .line 116
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->initView()V

    .line 117
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;)Landroid/widget/TextView;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->tv_cardName:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;)Landroid/app/Activity;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->activity:Landroid/app/Activity;

    return-object v0
.end method

.method private clickDetailAction()V
    .locals 4

    .line 255
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 257
    :cond_0
    const-string v0, "the clicked card info is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 258
    return-void

    .line 260
    :cond_1
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 261
    const-string v0, "cardGroup"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->c()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 262
    const-string v0, "issuerId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    const-string v0, "referenceId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 266
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->activity:Landroid/app/Activity;

    const-class v1, Lcom/huawei/nfc/NFCEntranceActivity;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 267
    const-string v0, "com.huawei.nfc.intent.action.NFC_ENTER_CARD_DETAIL"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 268
    const-string v0, "CARD_INFO"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 269
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 270
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 272
    return-void
.end method

.method private initView()V
    .locals 5

    .line 121
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->activity:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$layout;->card_instruction:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 123
    sget v0, Lcom/huawei/wallet/R$id;->cardinstru_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->tv_cardName:Landroid/widget/TextView;

    .line 124
    sget v0, Lcom/huawei/wallet/R$id;->cardinstru_detail_tv:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->tv_detail_tip:Landroid/widget/TextView;

    .line 125
    sget v0, Lcom/huawei/wallet/R$id;->cardinstru_instruction:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->tv_description:Landroid/widget/TextView;

    .line 126
    sget v0, Lcom/huawei/wallet/R$id;->buscard_detail:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->buacardDetail:Landroid/widget/LinearLayout;

    .line 127
    sget v0, Lcom/huawei/wallet/R$id;->balance_or_consume:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->balanceOrConsume:Landroid/widget/TextView;

    .line 128
    sget v0, Lcom/huawei/wallet/R$id;->trade_amount:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->tradeAmount:Landroid/widget/TextView;

    .line 129
    sget v0, Lcom/huawei/wallet/R$id;->consume_time:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->tradeTime:Landroid/widget/TextView;

    .line 131
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->tv_detail_tip:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v4, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 134
    const/16 v0, 0xe

    iput v0, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 135
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 136
    sget v0, Lcom/huawei/wallet/R$id;->card_brief:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->setId(I)V

    .line 137
    invoke-virtual {p0, v3}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->addView(Landroid/view/View;)V

    .line 138
    return-void
.end method

.method private setDesInfo()V
    .locals 10

    .line 187
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->activity:Landroid/app/Activity;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_instruction_quick_pass:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 189
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->activity:Landroid/app/Activity;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_instruction_normal_desc:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 191
    new-instance v6, Landroid/text/SpannableString;

    invoke-direct {v6, v5}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 194
    invoke-virtual {v5, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    .line 195
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    add-int v8, v7, v0

    .line 198
    const/4 v0, -0x1

    if-ne v7, v0, :cond_0

    .line 200
    const/4 v7, 0x0

    .line 201
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    .line 204
    :cond_0
    new-instance v9, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction$2;

    invoke-direct {v9, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction$2;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;)V

    .line 229
    const/16 v0, 0x21

    invoke-virtual {v6, v9, v7, v8, v0}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 232
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->tv_description:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 234
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->tv_description:Landroid/widget/TextView;

    invoke-static {}, Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod;->getInstance()Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 236
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 242
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 244
    sget v0, Lcom/huawei/wallet/R$id;->cardinstru_detail_tv:I

    if-ne v0, v1, :cond_0

    .line 246
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->clickDetailAction()V

    .line 248
    :cond_0
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 2

    .line 348
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onWindowFocusChanged(Z)V

    .line 349
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ExplandCardInstruction   onWindowFocusChanged  is :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 358
    return-void
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 2

    .line 363
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onWindowVisibilityChanged(I)V

    .line 365
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ExplandCardInstruction   onWindowVisibilityChanged  is :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 376
    return-void
.end method

.method public queryRecordsListCallback(IILjava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;>;)V"
        }
    .end annotation

    .line 277
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 279
    return-void

    .line 282
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 284
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->tv_description:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 285
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->buacardDetail:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 287
    const/4 v0, 0x0

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;

    .line 288
    const-string v5, "yyyy-MM-dd hh:mm:ss"

    .line 289
    const-string v6, "yyyy/MM/dd HH:mm:ss"

    .line 293
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NumberFormatException "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->getRecordTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 294
    const-string v0, "5943542E55534552"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 295
    const-string v0, "MM-dd hh:mm:ss"

    move-object v5, v0

    .line 296
    const-string v0, "MM/dd HH:mm:ss"

    move-object v6, v0

    goto :goto_0

    .line 298
    :cond_1
    const-string v0, "yyyy-MM-dd hh:mm:ss"

    move-object v5, v0

    .line 299
    const-string v0, "yyyy/MM/dd HH:mm:ss"

    move-object v6, v0

    .line 302
    :goto_0
    new-instance v7, Ljava/text/SimpleDateFormat;

    invoke-direct {v7, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 303
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->getRecordTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v8

    .line 304
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v8, v0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->getRecordAmount()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_2

    .line 305
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 306
    const/4 v0, 0x1

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_2

    move-object v4, v0

    .line 318
    :cond_2
    goto :goto_1

    .line 310
    :catch_0
    move-exception v7

    .line 311
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NumberFormatException "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v7}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 318
    goto :goto_1

    .line 313
    :catch_1
    move-exception v7

    .line 314
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IllegalArgumentException "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v7}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 318
    goto :goto_1

    .line 316
    :catch_2
    move-exception v7

    .line 317
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ParseException "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v7}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 321
    :goto_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->activity:Landroid/app/Activity;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_money_type:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 322
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->tradeAmount:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->getRecordAmount()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 324
    .line 325
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->getRecordTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lcom/huawei/nfc/carrera/ui/bus/util/TimeUtil;->parseString2Date(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 324
    invoke-static {v0, v6}, Lcom/huawei/nfc/carrera/ui/bus/util/TimeUtil;->formatDate2String(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 326
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->tradeTime:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 327
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->tradeTime:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->getRecordType()I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_3

    .line 331
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->balanceOrConsume:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_card_trade_details_consume:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_2

    .line 333
    :cond_3
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->getRecordType()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_4

    .line 335
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->balanceOrConsume:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_card_trade_details_recharge:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 337
    :cond_4
    :goto_2
    goto :goto_3

    .line 340
    :cond_5
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->tv_description:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_instruction_unable_query_record:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 343
    :goto_3
    return-void
.end method

.method public setData(Lcom/huawei/wallet/model/unicard/UniCardInfo;)V
    .locals 4

    .line 148
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 150
    const-string v0, "ExplandCardInstruction"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setData(),item.getCardGroup()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->cardDetail:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 152
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->c()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 155
    :sswitch_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->setDesInfo()V

    .line 156
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->cardInfoManagerApi:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction$1;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction$1;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;)V

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryBankCardInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;)V

    .line 168
    goto :goto_0

    .line 170
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->tv_cardName:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_instruction_recent_consume:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 171
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->tv_description:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_instruction_quering_trade_record_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 173
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    .line 174
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->queryRecords(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryRecordsListCallback;)V

    .line 176
    .line 182
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
