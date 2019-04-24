.class public Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;
.super Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitCUPCardOperatorCallback;


# static fields
.field private static final ADD_BANK_REQUESTCODE:I = 0x378

.field private static final ADD_BUS_REQUESTCODE:I = 0x379

.field private static final CARDINFO_JUMPTOADDCARDACTIVITY:I = 0x5

.field private static final CARDINFO_JUMPTOTRAFFICCARDACTIVITY:I = 0x7

.field private static final CARDINFO_MASSAGE_DISMSS_LOAD:I = 0x4

.field private static final CARDINFO_MASSAGE_SHOW_LOAD:I = 0x3

.field private static final CARDINFO_SHOWCARDOUTOFNUMBERDIALOG:I = 0x6

.field private static final CARDINFO_SUPPORT_BUSINESS:I = 0x8

.field private static final HANDLER_MASSAGE_SHOW_DIALOG:I = 0x1

.field private static final HANDLER_MASSAGE_SHOW_RETRY_DIALOG:I = 0x2

.field private static final OPEN_CARD_NUMBER_LIMIT:I = 0x8

.field private static final SUPPORT_CARD_LIST:Ljava/lang/String; = "SUPPORT_CARD_LIST"

.field private static final SUPPROT_BANK_TYPE:Ljava/lang/String; = "0010"

.field private static final SUPPROT_BUS_AND_BANK_TYPE:Ljava/lang/String; = "0011"

.field private static final TAG:Ljava/lang/String; = "PluginPay AddBankOrBusCardActivity"


# instance fields
.field private addBankCard:Lo/egd;

.field private addBusCard:Lo/egd;

.field private addCardTisps:Landroid/widget/TextView;

.field private addCardTispsInfo:Ljava/lang/String;

.field private cardInfoManagerApi:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

.field private currentOnclickButtonType:I

.field private mHandler:Landroid/os/Handler;

.field private mIconImg:Landroid/widget/ImageView;

.field private mIdImgRely:Landroid/widget/RelativeLayout;

.field private mSupportBusiness:Ljava/lang/String;

.field private supportList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 63
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;-><init>()V

    .line 110
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->supportList:Ljava/util/ArrayList;

    .line 653
    new-instance v0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$9;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$9;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)Landroid/os/Handler;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;Z)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->showDialog(Z)V

    return-void
.end method

.method static synthetic access$102(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mSupportBusiness:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$1100(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;I)V
    .locals 0

    .line 63
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->showLoadingDialog(I)V

    return-void
.end method

.method static synthetic access$1200(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V
    .locals 0

    .line 63
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->destroyLoadingDialog()V

    return-void
.end method

.method static synthetic access$1300(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->jumpToAddCardActivity()V

    return-void
.end method

.method static synthetic access$1400(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;I)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->showCardOutOfNumberDialog(I)V

    return-void
.end method

.method static synthetic access$1500(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;Ljava/util/ArrayList;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->jumpToAddTrafficCardActivity(Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic access$1600(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->showOrHideBankInfo()V

    return-void
.end method

.method static synthetic access$1700(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;Z)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->getClearCardResult(Z)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->supportList:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$202(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->supportList:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->gotoLockScreenActivity()V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->goToBankCardCaptureActivity()V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->goToInputCardNumActivity(Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;)V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)I
    .locals 1

    .line 63
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->currentOnclickButtonType:I

    return v0
.end method

.method static synthetic access$700(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;I)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->doAddCard(I)V

    return-void
.end method

.method static synthetic access$800(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->initCupService()V

    return-void
.end method

.method static synthetic access$900(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;I)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->jumpToDownload(I)V

    return-void
.end method

.method private checkUnionPayPackageInstalled()V
    .locals 2

    .line 206
    const-string v0, "com.unionpay.tsmbleuniteservice"

    invoke-static {p0, v0}, Lcom/huawei/wallet/utils/PackageUtil;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "com.unionpay.tsmbleuniteservice"

    invoke-static {p0, v0}, Lcom/huawei/wallet/utils/PackageUtil;->d(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    .line 209
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->prepareToAddBankCard()V

    goto :goto_0

    .line 213
    :cond_0
    const/16 v0, 0x378

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->jumpToDownload(I)V

    .line 215
    :goto_0
    return-void
.end method

.method private cleanLocalBankCard()V
    .locals 4

    .line 771
    sget v0, Lcom/huawei/wallet/R$string;->nfc_cleaning:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->showLoadingDialog(I)V

    .line 773
    const-string v0, "PluginPay AddBankOrBusCardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AddBankOrBusCardActivity start clear card"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 774
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->deleteLocalBankCards(Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeleteLocalCardsCallback;)V

    .line 786
    return-void
.end method

.method private doAddCard(I)V
    .locals 3

    .line 218
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->cardInfoManagerApi:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->checkAvaiableCard()I

    move-result v2

    .line 219
    const/16 v0, 0x8

    if-ge v2, v0, :cond_0

    .line 223
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->enterAddCard(I)V

    goto :goto_0

    .line 227
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 228
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 230
    :goto_0
    return-void
.end method

.method private enterAddCard(I)V
    .locals 2

    .line 289
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 290
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 291
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->getLockScreenStatus()V

    goto :goto_0

    .line 294
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 296
    :goto_0
    return-void
.end method

.method private getClearCardResult(Z)V
    .locals 4

    .line 581
    const-string v0, "PluginPay AddBankOrBusCardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getClearCardResult isSuccess "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 582
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->destroyLoadingDialog()V

    .line 584
    if-eqz p1, :cond_0

    .line 586
    sget v0, Lcom/huawei/wallet/R$string;->nfc_clean_done:I

    invoke-static {p0, v0}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;I)V

    .line 587
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->currentOnclickButtonType:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->doAddCard(I)V

    goto :goto_0

    .line 590
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 592
    :goto_0
    return-void
.end method

.method private getLockScreenStatus()V
    .locals 2

    .line 324
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$2;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 343
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 344
    return-void
.end method

.method private getWalletSupport()V
    .locals 2

    .line 301
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 320
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 321
    return-void
.end method

.method private goToBankCardCaptureActivity()V
    .locals 2

    .line 393
    new-instance v1, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;

    invoke-direct {v1}, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;-><init>()V

    .line 394
    new-instance v0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$4;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V

    invoke-virtual {v1, p0, v0}, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;->b(Landroid/app/Activity;Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;)V

    .line 413
    return-void
.end method

.method private goToInputCardNumActivity(Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;)V
    .locals 3

    .line 422
    invoke-static {}, Lcom/huawei/nfc/carrera/server/card/model/CaptureMethod;->setCameraMode()V

    .line 424
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 425
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 427
    const-string v0, "card_num"

    invoke-virtual {p1}, Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 428
    const-string v0, "card_img"

    invoke-virtual {p1}, Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;->e()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 431
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    const-class v1, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 432
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->startActivity(Landroid/content/Intent;)V

    .line 433
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->finish()V

    .line 434
    return-void
.end method

.method private gotoLockScreenActivity()V
    .locals 3

    .line 382
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 383
    const-class v0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-virtual {v2, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 384
    const-string v0, "LOCKSCREENSTATUS"

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mLockscreenStatus:I

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 385
    const-string v0, "FROM_ADD_CARD_PAGE"

    const-string v1, "AddBankOrBusCardActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 386
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->startActivity(Landroid/content/Intent;)V

    .line 387
    return-void
.end method

.method private initCupService()V
    .locals 5

    .line 570
    const-string v0, "PluginPay AddBankOrBusCardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initCupService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 571
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v4

    .line 572
    if-eqz v4, :cond_0

    .line 573
    sget v0, Lcom/huawei/wallet/R$string;->CS_waiting_progress_message:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->showLoadingDialog(I)V

    .line 575
    invoke-interface {v4, p0}, Lcom/huawei/nfc/carrera/logic/BankCardOperateLogicApi;->initCUPCardOperator(Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitCUPCardOperatorCallback;)V

    .line 577
    :cond_0
    return-void
.end method

.method private jumpToAddCardActivity()V
    .locals 5

    .line 357
    invoke-static {p0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 359
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bindcard_error_no_network_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->showToast(I)V

    .line 360
    return-void

    .line 363
    :cond_0
    invoke-static {}, Lo/dsx;->e()Lo/dsx;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dsx;->d(Landroid/content/Context;)V

    .line 365
    invoke-static {}, Lo/dsx;->e()Lo/dsx;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$3;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "android.permission.CAMERA"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, p0, v2}, Lo/dsx;->e(Lo/dsx$a;Landroid/app/Activity;[Ljava/lang/String;)V

    .line 377
    return-void
.end method

.method private jumpToAddTrafficCardActivity(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 440
    invoke-static {p0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 441
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bindcard_error_no_network_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->showToast(I)V

    .line 442
    return-void

    .line 445
    :cond_0
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 446
    const-string v0, "SUPPORT_CARD_LIST"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 447
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->startActivity(Landroid/content/Intent;)V

    .line 448
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->finish()V

    .line 449
    return-void
.end method

.method private jumpToDownload(I)V
    .locals 2

    .line 471
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 472
    invoke-virtual {p0, v1, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 473
    return-void
.end method

.method private prepareToAddBankCard()V
    .locals 2

    .line 494
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 531
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 532
    return-void
.end method

.method private showBindFailDialog()V
    .locals 5

    .line 737
    new-instance v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mContext:Landroid/content/Context;

    .line 738
    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->createNotice(Landroid/content/Context;)Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    move-result-object v4

    .line 739
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->setNoticeTitle(Ljava/lang/String;)V

    .line 740
    sget v0, Lcom/huawei/wallet/R$string;->nfc_security_manager_setting_swich_message:I

    sget v1, Lcom/huawei/wallet/R$string;->nfc_security_manager_setting_swich_message1:I

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mContext:Landroid/content/Context;

    sget v3, Lcom/huawei/wallet/R$string;->nfc_security_manager_setting_swich_message_more:I

    .line 742
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 740
    invoke-virtual {v4, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->setNoticeMessage(IILjava/lang/String;)V

    .line 743
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_dialog_getlocation_service_positive_text:I

    .line 744
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$10;

    invoke-direct {v1, p0, v4}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$10;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;)V

    .line 743
    invoke-virtual {v4, v0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->setPositiveButton(Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    .line 757
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_cancel:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$11;

    invoke-direct {v1, p0, v4}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$11;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;)V

    invoke-virtual {v4, v0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->setNegativeButton(Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    .line 766
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->startNotice()V

    .line 767
    return-void
.end method

.method private showCardOutOfNumberDialog(I)V
    .locals 4

    .line 455
    new-instance v2, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 456
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    invoke-virtual {v2, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 457
    invoke-virtual {v2, p1}, Lo/egv$b;->e(I)Lo/egv$b;

    .line 458
    sget v0, Lcom/huawei/wallet/R$string;->nfc_quick_pass_button_text:I

    new-instance v1, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$5;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V

    invoke-virtual {v2, v0, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 463
    invoke-virtual {v2}, Lo/egv$b;->b()Lo/egv;

    move-result-object v3

    .line 464
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/egv;->setCancelable(Z)V

    .line 465
    invoke-virtual {v3}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 466
    invoke-virtual {v3}, Lo/egv;->show()V

    .line 468
    :cond_0
    return-void
.end method

.method private showDialog(Z)V
    .locals 6

    .line 535
    const-string v0, "PluginPay AddBankOrBusCardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAccount showDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 536
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mContext:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 537
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    invoke-virtual {v4, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 538
    if-eqz p1, :cond_0

    .line 539
    sget v0, Lcom/huawei/wallet/R$string;->nfc_retry_clean:I

    invoke-virtual {v4, v0}, Lo/egv$b;->e(I)Lo/egv$b;

    goto :goto_0

    .line 541
    :cond_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bt_lock_clean_bankcard_message:I

    invoke-virtual {v4, v0}, Lo/egv$b;->e(I)Lo/egv$b;

    .line 544
    :goto_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_clear_empty:I

    sget v1, Lcom/huawei/wallet/R$color;->nfc_tip_titile_text:I

    new-instance v2, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$8;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$8;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V

    invoke-virtual {v4, v0, v1, v2}, Lo/egv$b;->d(IILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->hwpay_dialog_no:I

    new-instance v2, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$7;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V

    .line 554
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 562
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v5

    .line 563
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egv;->setCancelable(Z)V

    .line 564
    invoke-virtual {v5}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 565
    invoke-virtual {v5}, Lo/egv;->show()V

    .line 567
    :cond_1
    return-void
.end method

.method private showOrHideBankInfo()V
    .locals 4

    .line 679
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mSupportBusiness:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mSupportBusiness:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 680
    :cond_0
    const-string v0, "PluginPay AddBankOrBusCardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " SupportBusiness is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 681
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mContext:Landroid/content/Context;

    .line 682
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_add_buscard_or_bankcard_tip_new:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addCardTispsInfo:Ljava/lang/String;

    .line 683
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addCardTisps:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addCardTispsInfo:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 684
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addBankCard:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 685
    return-void

    .line 688
    :cond_1
    const-string v0, "PluginPay AddBankOrBusCardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " mSupportBusiness "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mSupportBusiness:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 690
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mSupportBusiness:Ljava/lang/String;

    const-string v1, "0010"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mSupportBusiness:Ljava/lang/String;

    const-string v1, "0011"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 692
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addBankCard:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 693
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mContext:Landroid/content/Context;

    .line 694
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->nfc_add_buscard_or_bankcard_tip_new:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mContext:Landroid/content/Context;

    .line 695
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->nfc_add_buscard_or_bankcard_tip_new_add:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addCardTispsInfo:Ljava/lang/String;

    goto :goto_0

    .line 697
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mContext:Landroid/content/Context;

    .line 698
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_add_buscard_or_bankcard_tip_new:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addCardTispsInfo:Ljava/lang/String;

    .line 699
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addBankCard:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 701
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addCardTisps:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addCardTispsInfo:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 703
    return-void
.end method


# virtual methods
.method protected dismissProgress(Lo/yw;)V
    .locals 1

    .line 641
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 643
    const-string v0, "PluginPay AddBankOrBusCardActivitydismissProgress, activity is finishing"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 644
    return-void

    .line 647
    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, Lo/yw;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 649
    invoke-interface {p1}, Lo/yw;->dismiss()V

    .line 651
    :cond_1
    return-void
.end method

.method public initCUPCardOperatorResult(I)V
    .locals 4

    .line 708
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->destroyLoadingDialog()V

    .line 709
    const-string v0, "PluginPay AddBankOrBusCardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====init bank apk resultCode =  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 710
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 713
    :sswitch_0
    const-string v0, "PluginPay AddBankOrBusCardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init bank apk SUCCESS "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 714
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->cleanLocalBankCard()V

    .line 715
    goto :goto_1

    .line 717
    :sswitch_1
    const-string v0, "PluginPay AddBankOrBusCardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init bank apk FAILED_CUP_TSM_SERVICE_UNREACHABLE "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 718
    sget v0, Lcom/huawei/wallet/R$string;->error_no_network_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->showToast(I)V

    .line 719
    goto :goto_1

    .line 724
    :sswitch_2
    const-string v0, "PluginPay AddBankOrBusCardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init bank apk FAILED_CANNOT_BIND_CUP_SERVICE "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 726
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->showBindFailDialog()V

    .line 727
    goto :goto_1

    .line 729
    :goto_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->showDialog(Z)V

    .line 730
    const-string v0, "PluginPay AddBankOrBusCardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init bank apk unknow "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 733
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x5 -> :sswitch_2
        -0x3 -> :sswitch_1
        0x0 -> :sswitch_0
    .end sparse-switch
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 477
    const-string v0, "PluginPay AddBankOrBusCardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult requestCode : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; currentOnclickButtonType : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->currentOnclickButtonType:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 478
    const/16 v0, 0x378

    if-ne v0, p1, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 479
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 480
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->getLockScreenStatus()V

    goto :goto_0

    .line 481
    :cond_0
    const/16 v0, 0x379

    if-ne v0, p1, :cond_1

    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    .line 483
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->initCupService()V

    goto :goto_0

    .line 485
    :cond_1
    const-string v0, "PluginPay AddBankOrBusCardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No this resultCode in onActivityResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 487
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 168
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 173
    sget v0, Lcom/huawei/wallet/R$id;->nfc_add_bus_card:I

    if-ne v0, v2, :cond_0

    .line 176
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->currentOnclickButtonType:I

    .line 177
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->prepareToAddBankCard()V

    goto :goto_0

    .line 179
    :cond_0
    sget v0, Lcom/huawei/wallet/R$id;->nfc_add_bank_card:I

    if-ne v0, v2, :cond_3

    .line 180
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 181
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceProtocol()I

    move-result v3

    .line 182
    const/16 v0, 0xa

    if-ne v3, v0, :cond_1

    .line 183
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->isInRuleLEO(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 184
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_open_overcount_leo:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->showCardOutOfNumberDialog(I)V

    .line 185
    return-void

    .line 188
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->isInRule4NewDevice(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 189
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_open_overcount_other:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->showCardOutOfNumberDialog(I)V

    .line 190
    return-void

    .line 194
    :cond_2
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->currentOnclickButtonType:I

    .line 195
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->checkUnionPayPackageInstalled()V

    .line 199
    :cond_3
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 125
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 126
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->setRequestedOrientation(I)V

    .line 127
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_first_enter_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->setContentView(I)V

    .line 128
    sget v0, Lcom/huawei/wallet/R$string;->nfc_name1:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->showHead(I)V

    .line 131
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->getWalletSupport()V

    .line 132
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/LogicApiFactory;->createCardManager(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->cardInfoManagerApi:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    .line 134
    sget v0, Lcom/huawei/wallet/R$id;->nfc_add_bank_card:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addBankCard:Lo/egd;

    .line 135
    sget v0, Lcom/huawei/wallet/R$id;->nfc_add_bus_card:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addBusCard:Lo/egd;

    .line 139
    sget v0, Lcom/huawei/wallet/R$id;->txt_add_card_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addCardTisps:Landroid/widget/TextView;

    .line 142
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addBankCard:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addBusCard:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 145
    sget v0, Lcom/huawei/wallet/R$id;->imge_icon:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mIconImg:Landroid/widget/ImageView;

    .line 146
    sget v0, Lcom/huawei/wallet/R$id;->mid_img_rely:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mIdImgRely:Landroid/widget/RelativeLayout;

    .line 148
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/PluginPayAdapter;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    .line 150
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 151
    return-void

    .line 153
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceProtocol()I

    move-result v4

    .line 154
    const-string v0, "PluginPay AddBankOrBusCardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceType"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0, v4}, Lcom/huawei/nfc/PluginPayAdapter;->isDeviceBand(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 156
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mIdImgRely:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/wallet/R$drawable;->nfc_bt_bg_band:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 157
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mIconImg:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 159
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mIdImgRely:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/wallet/R$drawable;->nfc_bt_bg_watch:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 160
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mIconImg:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 161
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mIconImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/wallet/R$drawable;->ic_card:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 164
    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 804
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 805
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onDestroy()V

    .line 806
    return-void
.end method

.method public refreshView(Z)V
    .locals 2

    .line 596
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->refreshView(Z)V

    .line 598
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addBankCard:Lo/egd;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addBusCard:Lo/egd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 599
    :cond_0
    return-void

    .line 601
    :cond_1
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mDevicesConnecteStatus:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mNetConnected:Z

    if-eqz v0, :cond_2

    .line 605
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addBankCard:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 609
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addBusCard:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 612
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->getWalletSupport()V

    goto :goto_0

    .line 618
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addBankCard:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 622
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->addBusCard:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 625
    :goto_0
    return-void
.end method

.method protected showProgress(Lo/yw;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V
    .locals 1

    .line 630
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/yw;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 632
    invoke-interface {p1, p2}, Lo/yw;->a(Ljava/lang/CharSequence;)V

    .line 633
    invoke-interface {p1, p3}, Lo/yw;->setCancelable(Z)V

    .line 634
    invoke-interface {p1, p4}, Lo/yw;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 635
    invoke-interface {p1}, Lo/yw;->show()V

    .line 637
    :cond_0
    return-void
.end method
