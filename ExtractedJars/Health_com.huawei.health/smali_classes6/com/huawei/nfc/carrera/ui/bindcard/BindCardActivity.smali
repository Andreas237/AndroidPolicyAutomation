.class public Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;
.super Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/ui/bindcard/StartBindListener;
.implements Lcom/huawei/nfc/carrera/ui/bindcard/ShownBindSuccessEndListener;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/response/InstallCardResultCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$MyInstallCardResultCallback;
    }
.end annotation


# static fields
.field private static final DIAL_HEAD:Ljava/lang/String; = "tel:"

.field private static final FRAGMENT_TAG_INPUT:Ljava/lang/String; = "input_fragment"

.field private static final FRAGMENT_TAG_PROCESS:Ljava/lang/String; = "process_fragment"


# instance fields
.field private cardNum:Ljava/lang/String;

.field private cardType:I

.field private issuerId:Ljava/lang/String;

.field private issuerMode:I

.field private mRefId:Ljava/lang/String;

.field private reAddFlag:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;-><init>()V

    .line 88
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->reAddFlag:Z

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->setRedId(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->callServicePhone(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;)Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->mRefId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;)Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;)I
    .locals 1

    .line 45
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->cardType:I

    return v0
.end method

.method private callServicePhone(Ljava/lang/String;)V
    .locals 5

    .line 485
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 487
    return-void

    .line 490
    :cond_0
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

    .line 491
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.intent.action.DIAL"

    invoke-direct {v3, v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 494
    :try_start_0
    invoke-virtual {p0, v3}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 499
    goto :goto_0

    .line 496
    :catch_0
    move-exception v4

    .line 498
    const-string v0, "BindCardActivity jump to dial:"

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 500
    :goto_0
    return-void
.end method

.method private contactToServer()V
    .locals 3

    .line 434
    invoke-static {p0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->issuerId:Ljava/lang/String;

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;)V

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryBankIssuerInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;)V

    .line 459
    return-void
.end method

.method private doReaddCard(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)V
    .locals 3

    .line 552
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->mRefId:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 554
    const-string v0, "===123====doReaddCard cardnull == mRefId"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 555
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->issuerId:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->cardType:I

    const/16 v2, -0x63

    invoke-virtual {p1, v2, v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->bindFailed(ILjava/lang/String;I)V

    .line 556
    return-void

    .line 559
    :cond_0
    invoke-static {p0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->mRefId:Ljava/lang/String;

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$2;

    invoke-direct {v2, p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$2;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)V

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryBankCardInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;)V

    .line 577
    return-void
.end method

.method private doRebind()V
    .locals 4

    .line 390
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const-string v1, "process_fragment"

    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    .line 392
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 394
    new-instance v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/ShownBindSuccessEndListener;)V

    .line 396
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123===BindCardActivity doRebind reAddFlag"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->reAddFlag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 397
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->reAddFlag:Z

    if-eqz v0, :cond_1

    .line 399
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->reBind()V

    .line 400
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->binding()V

    .line 401
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->doReaddCard(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)V

    goto :goto_0

    .line 406
    :cond_1
    const-string v0, "===123===BindCardActivity BindCardInputFragment"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 407
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const-string v1, "input_fragment"

    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    .line 409
    const/4 v0, 0x0

    if-ne v0, v3, :cond_2

    .line 411
    const-string v0, "===123===BindCardActivity inputFragment = null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 412
    new-instance v3, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-direct {v3, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/StartBindListener;)V

    .line 415
    :cond_2
    invoke-direct {p0, v2, v3}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->switchFragment(Landroid/app/Fragment;Landroid/app/Fragment;)V

    .line 417
    :goto_0
    return-void
.end method

.method private initParams()Z
    .locals 4

    .line 160
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 161
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 163
    const-string v0, "initParams intent empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 164
    const/4 v0, 0x0

    return v0

    .line 167
    :cond_0
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 168
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 170
    const-string v0, "bundle empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 171
    const/4 v0, 0x0

    return v0

    .line 174
    :cond_1
    const-string v0, "issuer_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->issuerId:Ljava/lang/String;

    .line 175
    const-string v0, "card_num"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dtj;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->cardNum:Ljava/lang/String;

    .line 176
    const-string v0, "card_type"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->cardType:I

    .line 177
    const-string v0, "issuer_mode"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->issuerMode:I

    .line 178
    const-string v0, "readd_card"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->reAddFlag:Z

    .line 179
    const-string v0, "reference_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->mRefId:Ljava/lang/String;

    .line 181
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->issuerId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->cardNum:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->cardType:I

    if-lez v0, :cond_2

    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->issuerMode:I

    if-gtz v0, :cond_3

    .line 183
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 186
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private setRedId(Ljava/lang/String;)V
    .locals 0

    .line 346
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->mRefId:Ljava/lang/String;

    .line 347
    return-void
.end method

.method private showInputFragment()V
    .locals 4

    .line 463
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const-string v1, "process_fragment"

    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    .line 465
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 467
    new-instance v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/ShownBindSuccessEndListener;)V

    .line 470
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const-string v1, "input_fragment"

    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    .line 472
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 474
    new-instance v3, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-direct {v3, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/StartBindListener;)V

    .line 477
    :cond_1
    invoke-direct {p0, v2, v3}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->switchFragment(Landroid/app/Fragment;Landroid/app/Fragment;)V

    .line 478
    return-void
.end method

.method private switchFragment(Landroid/app/Fragment;Landroid/app/Fragment;)V
    .locals 1

    .line 504
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/FragmentTransaction;->hide(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/app/FragmentTransaction;->show(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 505
    return-void
.end method

.method private toHomeFragment()V
    .locals 3

    .line 423
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 424
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.wallet.ui.cardholder.CardHolderActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 425
    const/high16 v0, 0x4000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 427
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 428
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->startActivity(Landroid/content/Intent;)V

    .line 429
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->finish()V

    .line 430
    return-void
.end method


# virtual methods
.method public bindSuccess(I)V
    .locals 3

    .line 353
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123===BIND_CARD  bindResult = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 354
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 357
    :pswitch_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 358
    const-class v0, Lcom/huawei/nfc/carrera/ui/bindcard/ActiveCardActivity;

    invoke-virtual {v2, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 359
    const-string v0, "refId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->mRefId:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 360
    const-string v0, "issuerMode"

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->issuerMode:I

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 361
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->startActivity(Landroid/content/Intent;)V

    .line 362
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->finish()V

    .line 363
    goto :goto_1

    .line 365
    :pswitch_1
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->showInputFragment()V

    .line 366
    goto :goto_1

    .line 368
    :pswitch_2
    const-string v0, "===123===BIND_FAIL_REBIND"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 369
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->doRebind()V

    .line 370
    goto :goto_1

    .line 372
    :pswitch_3
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->contactToServer()V

    .line 373
    goto :goto_1

    .line 375
    :pswitch_4
    const-string v0, "95516"

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->callServicePhone(Ljava/lang/String;)V

    .line 376
    goto :goto_1

    .line 379
    :pswitch_5
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->toHomeFragment()V

    .line 380
    goto :goto_1

    .line 382
    :goto_0
    const-string v0, "error operate type, jump to card list"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 383
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->toHomeFragment()V

    .line 386
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_5
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method public getIntent()Landroid/content/Intent;
    .locals 1

    .line 510
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public installResultCallback(ILjava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 517
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const-string v1, "process_fragment"

    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    .line 519
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 521
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 523
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->issuerId:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->cardType:I

    invoke-virtual {v4, v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->showBindSuccessView(Ljava/lang/String;I)V

    .line 525
    :cond_0
    return-void

    .line 528
    :cond_1
    const/16 v0, -0x63

    if-ne v0, p1, :cond_2

    .line 530
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 531
    const-string v0, "fail_reason"

    const-string v1, "bind card fail"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 532
    const-string v0, "productId"

    invoke-interface {v5, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    const-string v0, "fail_code"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 534
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "processBindCard result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x3611a444

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v5, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 536
    goto :goto_0

    .line 539
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "installResultCallback bind card fail resultCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 542
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 544
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123====processFragment resultCode"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 545
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->reBind()V

    .line 546
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->issuerId:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->cardType:I

    invoke-virtual {v4, p1, v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->bindFailed(ILjava/lang/String;I)V

    .line 548
    :cond_3
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 94
    const-string v0, "===123===BindCardActivity onCreate"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 95
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->requestWindowFeature(I)Z

    .line 96
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 97
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->setRequestedOrientation(I)V

    .line 98
    sget v0, Lcom/huawei/wallet/R$string;->nfc_fill_in_card_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->setTitle(I)V

    .line 99
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_activity_bind_card_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->setContentView(I)V

    .line 102
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->initParams()Z

    move-result v0

    if-nez v0, :cond_0

    .line 104
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->finish()V

    .line 105
    return-void

    .line 108
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->reAddFlag:Z

    if-eqz v0, :cond_2

    .line 111
    const-string v0, "onCreate rebind card."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 113
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_add_bank_card:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->setTitle(Ljava/lang/String;)V

    .line 115
    new-instance v3, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-direct {v3, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/ShownBindSuccessEndListener;)V

    .line 117
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 119
    const-string v0, "show progressfragment rebind card."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 120
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$id;->bind_container:I

    const-string v2, "process_fragment"

    invoke-virtual {v0, v1, v3, v2}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    .line 121
    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 123
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->binding()V

    .line 126
    :cond_1
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->doReaddCard(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)V

    .line 128
    goto :goto_0

    .line 131
    :cond_2
    const-string v0, "onCreate inputcardfragment add card."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 132
    new-instance v3, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-direct {v3, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/StartBindListener;)V

    .line 133
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->setArguments(Landroid/os/Bundle;)V

    .line 136
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_3

    .line 138
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$id;->bind_container:I

    const-string v2, "input_fragment"

    invoke-virtual {v0, v1, v3, v2}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    .line 139
    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_0

    .line 143
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const-string v1, "process_fragment"

    .line 144
    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    .line 145
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 147
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/app/FragmentTransaction;->hide(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/FragmentTransaction;->show(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 151
    :cond_4
    :goto_0
    return-void
.end method

.method public startBind(Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;)V
    .locals 7

    .line 192
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_add_bank_card:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->setTitle(Ljava/lang/String;)V

    .line 194
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const-string v1, "process_fragment"

    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    .line 196
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 198
    const-string v0, "===123====processFragment=null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 199
    new-instance v5, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-direct {v5, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/ShownBindSuccessEndListener;)V

    .line 202
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const-string v1, "input_fragment"

    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    .line 205
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_2

    .line 207
    const-string v0, "===123====.isAdded()"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 208
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 210
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$id;->bind_container:I

    const-string v2, "process_fragment"

    invoke-virtual {v0, v1, v5, v2}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    .line 211
    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_0

    .line 215
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$id;->bind_container:I

    const-string v2, "process_fragment"

    invoke-virtual {v0, v1, v5, v2}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    .line 216
    invoke-virtual {v0, v6}, Landroid/app/FragmentTransaction;->hide(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 219
    :goto_0
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->binding()V

    goto :goto_2

    .line 223
    :cond_2
    const-string v0, "===123====!processFragment.isAdded()"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 224
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 226
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/app/FragmentTransaction;->hide(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/app/FragmentTransaction;->show(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_1

    .line 230
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/app/FragmentTransaction;->show(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 233
    :goto_1
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->reBind()V

    .line 234
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->binding()V

    .line 236
    :goto_2
    const-string v0, "===123====!createCardOperateApi."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 240
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->issuerMode:I

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$MyInstallCardResultCallback;

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->issuerId:Ljava/lang/String;

    iget v4, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->cardType:I

    invoke-direct {v2, p0, v3, v4}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$MyInstallCardResultCallback;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;Ljava/lang/String;I)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->openCard(ILcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/response/InstallCardResultCallback;)V

    .line 273
    return-void
.end method
