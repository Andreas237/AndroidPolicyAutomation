.class public Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;
.super Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/response/NullifyCardResultCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$DeleteDialogNegativeListener;,
        Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$DeleteDialogOnKeyListener;
    }
.end annotation


# static fields
.field private static final CARDINFO_MASSAGE_DELETE_LOAD:I = 0x4

.field private static final CARDINFO_MASSAGE_DISMSS_LOAD:I = 0x3

.field private static final CARDINFO_MASSAGE_JUMP_TO_DELETE:I = 0x5

.field private static final CARDINFO_MASSAGE_SHOW_DIALOG:I = 0x1

.field private static final CARDINFO_MASSAGE_SHOW_LOAD:I = 0x2

.field private static DELETE_PAGE:I = 0x0

.field private static final DIAL_HEAD:Ljava/lang/String; = "tel:"

.field public static final ISSUER_ID:Ljava/lang/String; = "issuerId"

.field private static final LOCK_SCREEN:I = 0x1

.field private static final LOCK_SCREEN_UNENABLE_LOCK:I = 0x3

.field public static final REFERENCE_ID:Ljava/lang/String; = "referenceId"

.field private static final TAG:Ljava/lang/String; = "CardInfoDetailActivity"


# instance fields
.field private cardDeviceNumTextView:Landroid/widget/TextView;

.field private cardEntityNumTextView:Landroid/widget/TextView;

.field private cardIconImageView:Landroid/widget/ImageView;

.field private cardName:Ljava/lang/String;

.field private cardNameTextView:Landroid/widget/TextView;

.field private cardOpenTextView:Landroid/widget/TextView;

.field private contactNumber:Ljava/lang/String;

.field private currentAppInfo:Lcom/huawei/nfc/carrera/logic/model/AppInfo;

.field private deleteButton:Lo/egd;

.field private helper:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

.field private hotlineView:Landroid/view/View;

.field private isDebitCard:Z

.field private issuerId:Ljava/lang/String;

.field private mBankCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;

.field private mHandler:Landroid/os/Handler;

.field private mMode:I

.field private referenceId:Ljava/lang/String;

.field private webSite:Ljava/lang/String;

.field private websiteView:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 151
    const/16 v0, 0x3e7

    sput v0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->DELETE_PAGE:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 64
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;-><init>()V

    .line 157
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mMode:I

    .line 804
    new-instance v0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$4;-><init>(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->clickDeleteCard()V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)Landroid/os/Handler;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)I
    .locals 1

    .line 64
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mMode:I

    return v0
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->referenceId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->showDialog()V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;I)V
    .locals 0

    .line 64
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->showLoadingDialog(I)V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)V
    .locals 0

    .line 64
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->destroyLoadingDialog()V

    return-void
.end method

.method static synthetic access$700(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;I)V
    .locals 0

    .line 64
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->showLoadingDialog(I)V

    return-void
.end method

.method static synthetic access$800(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->jumpToDeleteCard()V

    return-void
.end method

.method private allowClickEventForCard()V
    .locals 2

    .line 272
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->deleteButton:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 273
    return-void
.end method

.method private allowClickEventForIssuer()V
    .locals 2

    .line 277
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->hotlineView:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 278
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->websiteView:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 279
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->cardOpenTextView:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 280
    return-void
.end method

.method private bindViewsForCard(Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 655
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->getCardName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->cardName:Ljava/lang/String;

    .line 656
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->isCardType()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->isDebitCard:Z

    .line 658
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->cardEntityNumTextView:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_num_show:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->getFpanFour()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 659
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->cardDeviceNumTextView:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_num_show:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->getDpanFour()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 662
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->allowClickEventForCard()V

    .line 664
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->checkCardStatus()V

    .line 665
    return-void
.end method

.method private bindViewsForIssuer(Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 670
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->isDebitCard:Z

    invoke-direct {p0, v0, p1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->getCurrentAppInfo(ZLcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;)Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->currentAppInfo:Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    .line 671
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->isDebitCard:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getDebitWebsite()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getCreditWebsite()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->webSite:Ljava/lang/String;

    .line 672
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->isDebitCard:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getDebitContactNumber()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getCrebitContactNumber()Ljava/lang/String;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->contactNumber:Ljava/lang/String;

    .line 673
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->contactNumber:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 675
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getContactNumber()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->contactNumber:Ljava/lang/String;

    .line 677
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->currentAppInfo:Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->currentAppInfo:Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->getApkIcon()Landroid/graphics/Bitmap;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 679
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->cardIconImageView:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->currentAppInfo:Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->getApkIcon()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 681
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->currentAppInfo:Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->currentAppInfo:Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->getApkName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 683
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->cardNameTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->currentAppInfo:Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->getApkName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 685
    :cond_4
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->allowClickEventForIssuer()V

    .line 686
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->updateLookupOrOpenShow()V

    .line 687
    return-void
.end method

.method private bindViewsForNetError()V
    .locals 6

    .line 644
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->referenceId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v5

    .line 645
    if-eqz v5, :cond_0

    .line 647
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->cardEntityNumTextView:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_num_show:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 648
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->cardDeviceNumTextView:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_num_show:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanFour:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 650
    :cond_0
    return-void
.end method

.method private callServicePhone()V
    .locals 5

    .line 455
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->contactNumber:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 457
    return-void

    .line 460
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tel:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->contactNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 461
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.intent.action.DIAL"

    invoke-direct {v3, v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 464
    :try_start_0
    invoke-virtual {p0, v3}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 469
    goto :goto_0

    .line 466
    :catch_0
    move-exception v4

    .line 468
    const-string v0, "CardInfoDetailActivity jump to dial:"

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 470
    :goto_0
    return-void
.end method

.method private checkCardStatus()V
    .locals 2

    .line 429
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->deleteButton:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 430
    return-void
.end method

.method private checkWatchStatus()V
    .locals 2

    .line 769
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;-><init>(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 801
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 802
    return-void
.end method

.method private clickDeleteCard()V
    .locals 2

    .line 437
    const-string v0, "com.unionpay.tsmbleuniteservice"

    invoke-static {p0, v0}, Lcom/huawei/wallet/utils/PackageUtil;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "com.unionpay.tsmbleuniteservice"

    invoke-static {p0, v0}, Lcom/huawei/wallet/utils/PackageUtil;->d(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    .line 441
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->checkWatchStatus()V

    goto :goto_0

    .line 446
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->jumpToDownload()V

    .line 448
    :goto_0
    return-void
.end method

.method private forbidClickEvent()V
    .locals 2

    .line 264
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->hotlineView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 265
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->websiteView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 266
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->deleteButton:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 267
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->cardOpenTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 268
    return-void
.end method

.method private getCurrentAppInfo(ZLcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;)Lcom/huawei/nfc/carrera/logic/model/AppInfo;
    .locals 6

    .line 607
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getAppInfos()Ljava/util/List;

    move-result-object v2

    .line 608
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 610
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 612
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 614
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    return-object v0

    .line 616
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    .line 618
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->getSupportType()I

    move-result v5

    .line 619
    if-eqz p1, :cond_4

    .line 621
    const/4 v0, 0x2

    if-eq v5, v0, :cond_3

    const/4 v0, 0x4

    if-ne v5, v0, :cond_6

    .line 624
    :cond_3
    return-object v4

    .line 629
    :cond_4
    const/4 v0, 0x3

    if-eq v5, v0, :cond_5

    const/4 v0, 0x4

    if-ne v5, v0, :cond_6

    .line 632
    :cond_5
    return-object v4

    .line 635
    :cond_6
    goto :goto_0

    .line 636
    :cond_7
    const/4 v0, 0x0

    return-object v0
.end method

.method private goIntoWebsite()V
    .locals 4

    .line 392
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->webSite:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 394
    return-void

    .line 398
    :cond_0
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 399
    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 400
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->webSite:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 401
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 402
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 407
    goto :goto_0

    .line 404
    :catch_0
    move-exception v2

    .line 406
    const-string v0, "CardInfoDetailActivity goIntoWebsite:"

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 408
    :goto_0
    return-void
.end method

.method private initParams()Z
    .locals 4

    .line 213
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 214
    if-nez v2, :cond_0

    .line 216
    const/4 v0, 0x0

    return v0

    .line 219
    :cond_0
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 220
    if-nez v3, :cond_1

    .line 222
    const-string v0, "bundle is null."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 223
    const/4 v0, 0x0

    return v0

    .line 226
    :cond_1
    const-string v0, "referenceId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->referenceId:Ljava/lang/String;

    .line 227
    const-string v0, "issuerId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->issuerId:Ljava/lang/String;

    .line 228
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->referenceId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->issuerId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 230
    :cond_2
    const-string v0, "params is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 231
    const/4 v0, 0x0

    return v0

    .line 233
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private initView()V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 239
    sget v0, Lcom/huawei/wallet/R$string;->nfc_cardlist_detail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->setTitle(I)V

    .line 240
    sget v0, Lcom/huawei/wallet/R$id;->bankcard_detail_icon_iv:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->cardIconImageView:Landroid/widget/ImageView;

    .line 241
    sget v0, Lcom/huawei/wallet/R$id;->bankcard_detail_name_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->cardNameTextView:Landroid/widget/TextView;

    .line 243
    sget v0, Lcom/huawei/wallet/R$id;->bankcard_detail_open_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->cardOpenTextView:Landroid/widget/TextView;

    .line 244
    sget v0, Lcom/huawei/wallet/R$id;->bankcard_detail_hotline_rl:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->hotlineView:Landroid/view/View;

    .line 245
    sget v0, Lcom/huawei/wallet/R$id;->bankcard_detail_website_rl:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->websiteView:Landroid/view/View;

    .line 246
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->hotlineView:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 247
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->websiteView:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 248
    sget v0, Lcom/huawei/wallet/R$id;->bankcard_detail_entity_num_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->cardEntityNumTextView:Landroid/widget/TextView;

    .line 250
    sget v0, Lcom/huawei/wallet/R$id;->bankcard_detail_device_num_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->cardDeviceNumTextView:Landroid/widget/TextView;

    .line 252
    sget v0, Lcom/huawei/wallet/R$id;->card_info_delete_applet:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->deleteButton:Lo/egd;

    .line 253
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->deleteButton:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 255
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->cardOpenTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 257
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->updateLookupOrOpenShow()V

    .line 259
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->forbidClickEvent()V

    .line 260
    return-void
.end method

.method private jumpToDeleteCard()V
    .locals 3

    .line 486
    const-string v0, "===123===Enter jumpToDeleteCard"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 487
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->referenceId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 488
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 490
    const-string v0, "===123===null == info"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 491
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_nullify_card_entrance_success:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->showToast(I)V

    .line 492
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->finish()V

    goto :goto_0

    .line 497
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->toDeleteCard()V

    .line 499
    :goto_0
    return-void
.end method

.method private jumpToDownload()V
    .locals 2

    .line 477
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 478
    sget v0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->DELETE_PAGE:I

    invoke-virtual {p0, v1, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 479
    return-void
.end method

.method private showDialog()V
    .locals 6

    .line 342
    const-string v0, "CardInfoDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAccount showDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mContext:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 344
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_not_available_to_use_delete_card:I

    invoke-virtual {v4, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 345
    sget v0, Lcom/huawei/wallet/R$string;->nfc_delete_bankcard_dialog_message:I

    invoke-virtual {v4, v0}, Lo/egv$b;->e(I)Lo/egv$b;

    .line 346
    sget v0, Lcom/huawei/wallet/R$string;->nfc_ok:I

    new-instance v1, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$2;-><init>(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)V

    invoke-virtual {v4, v0, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_cancel:I

    new-instance v2, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)V

    .line 351
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 358
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v5

    .line 359
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egv;->setCancelable(Z)V

    .line 360
    invoke-virtual {v5}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 361
    invoke-virtual {v5}, Lo/egv;->show()V

    .line 363
    :cond_0
    return-void
.end method

.method private showToast()V
    .locals 1

    .line 574
    invoke-static {p0}, Lo/dtc;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 576
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bindcard_error_connection_failed:I

    invoke-static {p0, v0}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;I)V

    goto :goto_0

    .line 580
    :cond_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bindcard_error_no_network_failed:I

    invoke-static {p0, v0}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;I)V

    .line 582
    :goto_0
    return-void
.end method

.method private startOpenOrDownload()V
    .locals 3

    .line 412
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->currentAppInfo:Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->currentAppInfo:Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->getIssuerAppPkg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->currentAppInfo:Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    .line 413
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->getIssuerAppMarketId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 415
    :cond_0
    return-void

    .line 417
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->helper:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 419
    new-instance v0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->currentAppInfo:Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->getIssuerAppPkg()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->currentAppInfo:Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->getIssuerAppMarketId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->helper:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    .line 421
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->helper:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->startOpenOrDown()V

    .line 422
    return-void
.end method

.method private toNullifyCardActivity(I)V
    .locals 3

    .line 534
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/nullifycard/NullifyCardActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 535
    const-string v0, "refId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->referenceId:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 536
    const-string v0, "issuerMode"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 537
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 538
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->finish()V

    .line 539
    return-void
.end method

.method private updateLookupOrOpenShow()V
    .locals 3

    .line 287
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->currentAppInfo:Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 289
    return-void

    .line 291
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->currentAppInfo:Lcom/huawei/nfc/carrera/logic/model/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/model/AppInfo;->getIssuerAppPkg()Ljava/lang/String;

    move-result-object v2

    .line 293
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 295
    return-void

    .line 298
    :cond_1
    invoke-static {p0, v2}, Lcom/huawei/wallet/utils/PackageUtil;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 300
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->cardOpenTextView:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->hwpay_open:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 304
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->cardOpenTextView:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->hwpay_lookup:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 306
    :goto_0
    return-void
.end method


# virtual methods
.method public nullifyResultCallback(I)V
    .locals 3

    .line 702
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 703
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 706
    :pswitch_0
    const-string v0, "nullifyResultCallback: Delete card success,go to NFC HomeFragment."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 709
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 710
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.wallet.ui.cardholder.CardHolderActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 711
    const/high16 v0, 0x4000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 712
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 713
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 715
    goto :goto_1

    .line 717
    :pswitch_1
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_instruction_delete_desc_new:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->showToast(I)V

    .line 718
    goto :goto_1

    .line 720
    :pswitch_2
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bindcard_error_connection_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->showToast(I)V

    .line 721
    goto :goto_1

    .line 723
    :pswitch_3
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_nullify_card_entrance_smscode_unmatch:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->showToast(I)V

    .line 724
    goto :goto_1

    .line 726
    :pswitch_4
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_nullify_card_entrance_smscode_overtime:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->showToast(I)V

    .line 727
    goto :goto_1

    .line 729
    :goto_0
    :pswitch_5
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_nullify_card_entrance_others_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->showToast(I)V

    .line 732
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->finish()V

    .line 733
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x6
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_0
    .end packed-switch
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 544
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 545
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryBankCardInfo result is: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ; resultCode \uff1a "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 546
    sget v0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->DELETE_PAGE:I

    if-ne p1, v0, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 548
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->checkWatchStatus()V

    .line 553
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 318
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 320
    sget v0, Lcom/huawei/wallet/R$id;->card_info_delete_applet:I

    if-ne v0, v2, :cond_0

    .line 324
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 326
    :cond_0
    sget v0, Lcom/huawei/wallet/R$id;->bankcard_detail_website_rl:I

    if-ne v0, v2, :cond_1

    .line 328
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->goIntoWebsite()V

    goto :goto_0

    .line 330
    :cond_1
    sget v0, Lcom/huawei/wallet/R$id;->bankcard_detail_hotline_rl:I

    if-ne v0, v2, :cond_2

    .line 332
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->callServicePhone()V

    goto :goto_0

    .line 334
    :cond_2
    sget v0, Lcom/huawei/wallet/R$id;->bankcard_detail_open_tv:I

    if-ne v0, v2, :cond_3

    .line 336
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->startOpenOrDownload()V

    .line 338
    :cond_3
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 190
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 191
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->setRequestedOrientation(I)V

    .line 192
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->initParams()Z

    move-result v0

    if-nez v0, :cond_0

    .line 194
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->finish()V

    .line 195
    return-void

    .line 198
    :cond_0
    invoke-static {p0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v1

    .line 199
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->referenceId:Ljava/lang/String;

    invoke-interface {v1, v0, p0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryBankCardInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;)V

    .line 200
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->issuerId:Ljava/lang/String;

    invoke-interface {v1, v0, p0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryBankIssuerInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;)V

    .line 201
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_cardinfo_detail_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->setContentView(I)V

    .line 203
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->initView()V

    .line 204
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 692
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onDestroy()V

    .line 693
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->helper:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 695
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->helper:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->onDestroy()V

    .line 697
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 311
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onResume()V

    .line 312
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->updateLookupOrOpenShow()V

    .line 313
    return-void
.end method

.method public queryBankCardInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;)V
    .locals 2

    .line 558
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

    .line 559
    if-nez p1, :cond_0

    if-eqz p2, :cond_0

    .line 561
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mBankCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;

    .line 562
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mBankCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->getMode()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mMode:I

    .line 563
    invoke-direct {p0, p2}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->bindViewsForCard(Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;)V

    goto :goto_0

    .line 567
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->bindViewsForNetError()V

    .line 568
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->showToast()V

    .line 570
    :goto_0
    return-void
.end method

.method public queryBankIssuerInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;)V
    .locals 2

    .line 587
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryBankIssuerInfoCallback result is: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 588
    if-nez p1, :cond_0

    if-eqz p2, :cond_0

    .line 590
    invoke-direct {p0, p2}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->bindViewsForIssuer(Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;)V

    goto :goto_0

    .line 594
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->showToast()V

    .line 596
    :goto_0
    return-void
.end method

.method public refreshView(Z)V
    .locals 2

    .line 823
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->refreshView(Z)V

    .line 825
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->deleteButton:Lo/egd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 826
    return-void

    .line 828
    :cond_0
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mDevicesConnecteStatus:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mNetConnected:Z

    if-eqz v0, :cond_1

    .line 832
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->deleteButton:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    goto :goto_0

    .line 836
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->deleteButton:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 839
    :goto_0
    return-void
.end method

.method protected toDeleteCard()V
    .locals 5

    .line 504
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mBankCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->getMode()I

    move-result v3

    .line 505
    const/4 v0, -0x1

    if-eq v3, v0, :cond_1

    .line 507
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 508
    const/16 v0, 0xb

    if-ne v0, v3, :cond_0

    .line 510
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->referenceId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v4

    .line 511
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    const-string v0, "A0000003330101020063020000000301"

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 513
    const-string v0, "CITIC Nullify Card"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 514
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->toNullifyCardActivity(I)V

    .line 515
    return-void

    .line 518
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->referenceId:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v3, v2, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->nullifyCard(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/NullifyCardResultCallback;)V

    goto :goto_0

    .line 520
    :cond_1
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_nullify_card_entrance_others_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->showToast(I)V

    .line 523
    :goto_0
    return-void
.end method
