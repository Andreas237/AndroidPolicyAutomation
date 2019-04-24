.class public Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;


# static fields
.field private static final TAG:Ljava/lang/String; = "ExplandCardInstructionToActive"


# instance fields
.field private cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

.field protected cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

.field private confirmButton:Lo/egd;

.field private descTextView:Landroid/widget/TextView;

.field private detailTextView:Landroid/widget/TextView;

.field private mBankCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;

.field private mContext:Landroid/content/Context;

.field protected mLoadingDialog21:Lo/egn;

.field private titleTextView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->confirmButton:Lo/egd;

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->titleTextView:Landroid/widget/TextView;

    .line 77
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->detailTextView:Landroid/widget/TextView;

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->descTextView:Landroid/widget/TextView;

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mLoadingDialog21:Lo/egn;

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    .line 101
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    .line 102
    return-void
.end method

.method private clickDetailAction()V
    .locals 4

    .line 229
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 231
    :cond_0
    const-string v0, "the clicked card info is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 232
    return-void

    .line 234
    :cond_1
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 235
    const-string v0, "cardGroup"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->c()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 236
    const-string v0, "issuerId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    const-string v0, "referenceId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 240
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    const-class v1, Lcom/huawei/nfc/NFCEntranceActivity;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 241
    const-string v0, "com.huawei.nfc.intent.action.NFC_ENTER_CARD_DETAIL"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 242
    const-string v0, "CARD_INFO"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 243
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 244
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 246
    return-void
.end method

.method private getErrorMessage(I)Ljava/lang/String;
    .locals 2

    .line 444
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 449
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_no_network_connection:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 452
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_nfc_not_open:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 456
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_create_order_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 459
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_ssd_install_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 462
    :sswitch_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_open_overcount:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 466
    :sswitch_5
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_get_city_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 469
    :sswitch_6
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_sp_return_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 472
    :sswitch_7
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_sp_out_of_service:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 475
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_sp_return_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x2 -> :sswitch_0
        0xa -> :sswitch_2
        0xb -> :sswitch_0
        0xc -> :sswitch_1
        0x63 -> :sswitch_2
        0x3f0 -> :sswitch_5
        0x3f2 -> :sswitch_7
        0x44d -> :sswitch_4
        0x44e -> :sswitch_6
        0x44f -> :sswitch_5
        0x450 -> :sswitch_3
    .end sparse-switch
.end method

.method private jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZ)V
    .locals 4

    .line 356
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    const-class v1, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 357
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 358
    const-string v0, "fail_desc"

    invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    const-string v0, "fail_reason"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    const-string v0, "opr_type"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 361
    const-string v0, "issuerId"

    invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    const-string v0, "card_aid"

    invoke-virtual {v3, v0, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    const-string v0, "need_retry"

    invoke-virtual {v3, v0, p6}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 364
    const-string v0, "open_card"

    invoke-virtual {v3, v0, p7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 365
    invoke-virtual {v2, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 366
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 367
    return-void
.end method

.method private openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 433
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->init(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 434
    return-void
.end method

.method private showOpenCardProgressDialog()V
    .locals 3

    .line 221
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_opening_card_new:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->showLoadingDialog(Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 222
    return-void
.end method

.method private upLoadLog(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V
    .locals 4

    .line 398
    if-eqz p1, :cond_2

    .line 400
    const/4 v0, 0x1

    if-eq v0, p1, :cond_0

    const/16 v0, 0xa

    if-eq v0, p1, :cond_0

    const/16 v0, 0x17

    if-eq v0, p1, :cond_0

    const/16 v0, 0x18

    if-eq v0, p1, :cond_0

    const/16 v0, 0x19

    if-eq v0, p1, :cond_0

    const/16 v0, 0x63

    if-ne v0, p1, :cond_1

    .line 407
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "queryAndHandleUnfinishedOrderCallback, query Unfinished Order fail"

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 410
    :cond_1
    return-void

    .line 413
    :cond_2
    const/16 v0, 0x2712

    if-ne p2, v0, :cond_3

    if-eqz p3, :cond_3

    .line 414
    invoke-virtual {p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getIssueCardOrderCnt()I

    move-result v0

    if-lez v0, :cond_3

    .line 416
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    const-string v2, ""

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 420
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryAndHandleUnfinishedOrderCallback, resultType : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    :goto_0
    return-void
.end method


# virtual methods
.method protected destroyLoadingDialog()V
    .locals 4

    .line 386
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mLoadingDialog21:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 387
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 388
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mLoadingDialog21:Lo/egn;

    .line 389
    const-string v0, "ExplandCardInstructionToActive"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroy mLoadingDialog21"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    :cond_0
    return-void
.end method

.method public initView(I)Landroid/view/View;
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 107
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$layout;->nfc_homefragment_card_instruction_to_active:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 109
    sget v0, Lcom/huawei/wallet/R$id;->delete_card_confirm_btn:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->confirmButton:Lo/egd;

    .line 110
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->confirmButton:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 111
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->confirmButton:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 113
    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v4, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 114
    iput p1, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 115
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 117
    sget v0, Lcom/huawei/wallet/R$id;->cardinstru_title_delete:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->titleTextView:Landroid/widget/TextView;

    .line 119
    sget v0, Lcom/huawei/wallet/R$id;->cardinstru_detail:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->detailTextView:Landroid/widget/TextView;

    .line 120
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->detailTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 122
    sget v0, Lcom/huawei/wallet/R$id;->cardinstru_desc:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->descTextView:Landroid/widget/TextView;

    .line 124
    return-object v3
.end method

.method public issueTrafficCardCallback(I)V
    .locals 8

    .line 273
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->destroyLoadingDialog()V

    .line 275
    if-nez p1, :cond_0

    .line 277
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    const-string v2, ""

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_success:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v3, Lcom/huawei/wallet/R$string;->nfc_bind_bus_success_decribe_text:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 279
    invoke-virtual {v3}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v4

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v3}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->e()Ljava/lang/String;

    move-result-object v5

    .line 278
    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-direct/range {v0 .. v7}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZ)V

    goto :goto_0

    .line 285
    :cond_0
    const/4 v0, 0x1

    if-eq v0, p1, :cond_1

    const/16 v0, 0xa

    if-eq v0, p1, :cond_1

    const/16 v0, 0x17

    if-eq v0, p1, :cond_1

    const/16 v0, 0x18

    if-eq v0, p1, :cond_1

    const/16 v0, 0x19

    if-eq v0, p1, :cond_1

    const/16 v0, 0x63

    if-ne v0, p1, :cond_2

    .line 292
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "issueTrafficCardCallback, issue Traffic Card fail"

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    :cond_2
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_fail:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 296
    invoke-virtual {v3}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v4

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v3}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->e()Ljava/lang/String;

    move-result-object v5

    .line 295
    const/4 v3, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x1

    invoke-direct/range {v0 .. v7}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZ)V

    .line 300
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 165
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 167
    return-void

    .line 170
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 171
    sget v0, Lcom/huawei/wallet/R$id;->cardinstru_detail:I

    if-ne v4, v0, :cond_1

    .line 173
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->clickDetailAction()V

    .line 174
    return-void

    .line 176
    :cond_1
    sget v0, Lcom/huawei/wallet/R$id;->delete_card_confirm_btn:I

    if-ne v4, v0, :cond_5

    .line 179
    invoke-static {}, Lcom/huawei/nfc/carrera/ui/bus/util/TimeUtil;->isFastDoubleClick()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 180
    const-string v0, "onClick, isFastDoubleClick"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 181
    return-void

    .line 184
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->c()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 187
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mBankCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 189
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    const-class v1, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 190
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 191
    const-string v0, "refId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    const-string v0, "issuerMode"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mBankCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->getMode()I

    move-result v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 193
    invoke-virtual {v5, v6}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 194
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 195
    goto :goto_0

    .line 198
    :sswitch_1
    const-string v0, "ExplandCardInstructionToActive"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClick(),CARD_GROUP_TYPE_BUS!,cardListItem.getCardStatus()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v3}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/16 v1, 0xb

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 200
    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_4

    .line 202
    :cond_3
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->showOpenCardProgressDialog()V

    .line 203
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->queryAndHandleUnfinfishedOrders(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;)V

    goto :goto_0

    .line 206
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_5

    .line 208
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->showOpenCardProgressDialog()V

    .line 209
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->issueTrafficCard(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;)V

    .line 218
    :cond_5
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public queryAndHandleUnfinishedOrderCallback(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V
    .locals 9

    .line 305
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->upLoadLog(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 306
    if-eqz p1, :cond_0

    .line 309
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->destroyLoadingDialog()V

    .line 310
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_fail:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 311
    invoke-virtual {v3}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v4

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v3}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->e()Ljava/lang/String;

    move-result-object v5

    .line 310
    const/4 v3, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x1

    invoke-direct/range {v0 .. v7}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZ)V

    .line 313
    return-void

    .line 316
    :cond_0
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 320
    :pswitch_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->destroyLoadingDialog()V

    .line 321
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getIssueCardOrderCnt()I

    move-result v0

    if-lez v0, :cond_1

    .line 323
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_success:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v3, Lcom/huawei/wallet/R$string;->nfc_bind_bus_success_decribe_text:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 324
    invoke-virtual {v3}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v4

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v3}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->e()Ljava/lang/String;

    move-result-object v5

    .line 323
    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-direct/range {v0 .. v7}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZ)V

    .line 326
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/LogicApiFactory;->createCardManager(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v8

    .line 327
    invoke-interface {v8}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 328
    return-void

    .line 332
    :cond_1
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_fail:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 333
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 334
    invoke-virtual {v3}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v4

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v3}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->e()Ljava/lang/String;

    move-result-object v5

    .line 332
    const/4 v3, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x1

    invoke-direct/range {v0 .. v7}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZ)V

    .line 337
    goto :goto_0

    .line 340
    :pswitch_1
    goto :goto_0

    .line 342
    :pswitch_2
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->destroyLoadingDialog()V

    .line 343
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_fail:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 344
    invoke-virtual {v3}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v4

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v3}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->e()Ljava/lang/String;

    move-result-object v5

    .line 343
    const/4 v3, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-direct/range {v0 .. v7}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZ)V

    .line 346
    .line 351
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2710
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public queryBankCardInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;)V
    .locals 2

    .line 251
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryBankCardInfo result is: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 252
    if-nez p1, :cond_0

    if-eqz p2, :cond_0

    .line 254
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mBankCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;

    goto :goto_0

    .line 256
    :cond_0
    const/4 v0, -0x2

    if-ne p1, v0, :cond_1

    .line 259
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bindcard_error_no_network_failed:I

    invoke-static {v0, v1}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;I)V

    goto :goto_0

    .line 261
    :cond_1
    const/4 v0, -0x1

    if-ne p1, v0, :cond_2

    .line 264
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bindcard_error_connection_failed:I

    invoke-static {v0, v1}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;I)V

    .line 266
    :cond_2
    :goto_0
    return-void
.end method

.method public setData(Lcom/huawei/wallet/model/unicard/UniCardInfo;)V
    .locals 3

    .line 134
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 136
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 138
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->c()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 141
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/LogicApiFactory;->createCardManager(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v2

    .line 142
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardListItem:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0, p0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryBankCardInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;)V

    .line 143
    goto :goto_0

    .line 146
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->titleTextView:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_not_available_to_use:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 147
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->confirmButton:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_status_continue:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 148
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->descTextView:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_instruction_buscard_reopen:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 150
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    .line 152
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->initEseInfo()V

    .line 153
    .line 160
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method protected showLoadingDialog(Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V
    .locals 4

    .line 374
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mLoadingDialog21:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 375
    new-instance v0, Lo/egn;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lo/egn;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mContext:Landroid/content/Context;

    .line 376
    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mLoadingDialog21:Lo/egn;

    .line 377
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0, p1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 378
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0, p3}, Lo/egn;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 379
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0, p2}, Lo/egn;->setCancelable(Z)V

    .line 380
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 382
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToActive;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 383
    const-string v0, "ExplandCardInstructionToActive"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    return-void
.end method
