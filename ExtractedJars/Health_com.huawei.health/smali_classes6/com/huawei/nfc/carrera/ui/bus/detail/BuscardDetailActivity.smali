.class public Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;
.super Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryOfflineTrafficCardInfoCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardTransferAbilityCallback;


# static fields
.field public static final CARD_INFO_ENTANCE:Ljava/lang/String; = "card_info"

.field public static final CHARGE_ENTRANCE:Ljava/lang/String; = "charge"

.field public static final CLOUD_TRANSFER_ENTERCE:Ljava/lang/String; = "cloud_tranfer"

.field private static final DIAL_HEAD:Ljava/lang/String; = "tel:"

.field public static final EXTRA_KEY_CARD_ISSUERID:Ljava/lang/String; = "traffic_card_issuerId"

.field public static final EXTRA_KEY_CARD_PRODUCTD:Ljava/lang/String; = "traffic_card_productId"

.field public static final HELP_ENTANCE:Ljava/lang/String; = "help"

.field private static final HUAWEI_BJ_AID:Ljava/lang/String; = "9156000014010001"

.field private static final HUAWEI_BJ_FAQ_URL:Ljava/lang/String; = "https://pcpay.vmall.com/agreement/sports-health/sah_bj_faq_cn.html"

.field private static final HUAWEI_BJ_MOT_AID:Ljava/lang/String; = "A00000063201010510009156000014A1"

.field private static final HUAWEI_BJ_MOT_FAQ_URL:Ljava/lang/String; = "https://pcpay.vmall.com/agreement/sports-health/sah_bj_mot_faq_cn.html"

.field private static final HUAWEI_CHANGAN_AID:Ljava/lang/String; = "315041592E5359532E4444463031"

.field private static final HUAWEI_CHANGAN_FAQ_URL:Ljava/lang/String; = "https://pcpay.vmall.com/agreement/sports-health/sah_chan_faq_cn.html"

.field private static final HUAWEI_GUANGXI_AID:Ljava/lang/String; = "A0000006320101054758474D4B"

.field private static final HUAWEI_GUANGXI_FAQ_URL:Ljava/lang/String; = "https://pcpay.vmall.com/agreement/sports-health/sah_gx_faq_cn.html"

.field private static final HUAWEI_HAERBIN_AID:Ljava/lang/String; = "A00000063201010501592610FF000000"

.field private static final HUAWEI_HAERBIN_FAQ_URL:Ljava/lang/String; = "https://pcpay.vmall.com/agreement/sports-health/sah_herb_faq_cn.html"

.field private static final HUAWEI_LN_AID:Ljava/lang/String; = "5943542E55534552"

.field private static final HUAWEI_LN_FAQ_URL:Ljava/lang/String; = "https://pcpay.vmall.com/agreement/sports-health/sah_ln_faq_cn.html"

.field private static final HUAWEI_QINGDAO_AID:Ljava/lang/String; = "A00000000386980700"

.field private static final HUAWEI_QINGDAO_FAQ_URL:Ljava/lang/String; = "https://pcpay.vmall.com/agreement/sports-health/sah_qd_faq_cn.html"

.field private static final HUAWEI_SERVICE_HOTLINE:Ljava/lang/String; = "4008308300"

.field private static final HUAWEI_SH_AID:Ljava/lang/String; = "A00000000386980701"

.field private static final HUAWEI_SH_FAQ_URL:Ljava/lang/String; = "https://pcpay.vmall.com/agreement/sports-health/sah_sh_faq_cn.html"

.field private static final HUAWEI_SUZH_AID:Ljava/lang/String; = "535558494E2E4D46"

.field private static final HUAWEI_SUZH_FAQ_URL:Ljava/lang/String; = "https://pcpay.vmall.com/agreement/sports-health/sah_suzh_faq_cn.html"

.field private static final HUAWEI_SUZH_UNI_AID:Ljava/lang/String; = "A0000006320101054A53535A54"

.field private static final HUAWEI_SUZH_UNI_FAQ_URL:Ljava/lang/String; = "https://pcpay.vmall.com/agreement/sports-health/sah_js_suzh_faq_cn.html"

.field private static final HUAWEI_SZ_AID:Ljava/lang/String; = "535A542E57414C4C45542E454E56"

.field private static final HUAWEI_SZ_FAQ_URL:Ljava/lang/String; = "https://pcpay.vmall.com/agreement/sports-health/sah_sz_faq_cn.html"

.field private static final HUAWEI_WN_FAQ_URL:Ljava/lang/String; = "https://pcpay.vmall.com/agreement/sports-health/sah_wh_faq_cn.html"

.field private static final HUAWEI_WUHANTONG_AID:Ljava/lang/String; = "A0000053425748544B"

.field private static final HUAWEI_XIAMEN_AID:Ljava/lang/String; = "D1560001360103887789847501000001"

.field private static final HUAWEI_XIAMEN_FAQ_URL:Ljava/lang/String; = "https://pcpay.vmall.com/agreement/sports-health/sah_xm_faq_cn.html"

.field private static final RECHARGE_REQUEST_CODE:I = 0x64

.field private static final TAG:Ljava/lang/String; = "PluginPay BuscardDetailActivity "

.field public static final TRADE_HISTORY_ENTRANCE:Ljava/lang/String; = "trade_history"

.field public static final TRANSFER_ENTERCE:Ljava/lang/String; = "tranfer"


# instance fields
.field private cardAgUrl:Ljava/lang/String;

.field private cardAidTrasToUrlMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private cardLogo:Landroid/graphics/Bitmap;

.field private cardName:Ljava/lang/String;

.field private cardProUrl:Ljava/lang/String;

.field private cardStatus:I

.field private isRechargeSuccess:Z

.field private mAgreementTv:Landroid/widget/TextView;

.field private mAid:Ljava/lang/String;

.field private mBusCardRelativeEnterancesMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Boolean;>;"
        }
    .end annotation
.end field

.field private mBuscardNameTv:Landroid/widget/TextView;

.field private mBuscardRes:Landroid/widget/ImageView;

.field private mDealUnfinishedProgressDialog:Lo/yw;

.field private mEventId:Ljava/lang/String;

.field private mIsSupportCloudTransferOut:Z

.field private mIssuerId:Ljava/lang/String;

.field private mLayoutProblem:Landroid/widget/RelativeLayout;

.field private mLayoutServiceHotline:Landroid/widget/RelativeLayout;

.field private mLayoutTradeDetails:Landroid/widget/RelativeLayout;

.field private mMoneyLabel:Ljava/lang/String;

.field private mProductId:Ljava/lang/String;

.field private mReadCardInfoType:I

.field private mRecharge:Lo/egd;

.field private mServiceHotlineNumber:Ljava/lang/String;

.field private mShowBalance:Landroid/widget/TextView;

.field private mShowCardNum:Landroid/widget/TextView;

.field private mShowCardValidity:Landroid/widget/TextView;

.field private mTransferAbility:Ljava/lang/String;

.field private mTransferInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;

.field private mTransferStatus:Ljava/lang/String;

.field private progress21:Lo/egn;

.field private removeBuscard:Lo/egd;

.field private transferUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 62
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;-><init>()V

    .line 170
    const/4 v0, 0x7

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mReadCardInfoType:I

    .line 214
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mBusCardRelativeEnterancesMap:Ljava/util/Map;

    .line 223
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mIsSupportCloudTransferOut:Z

    .line 281
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->isRechargeSuccess:Z

    .line 637
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$2;-><init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardAidTrasToUrlMap:Ljava/util/HashMap;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->stopProgress()V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->deleteBusCard()V

    return-void
.end method

.method private bindViews(Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;)V
    .locals 5

    .line 657
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 659
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mBuscardNameTv:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 661
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardLogo:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 663
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mBuscardRes:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardLogo:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 669
    :cond_1
    const/4 v4, 0x1

    .line 670
    const-string v0, "PluginPay BuscardDetailActivity "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " is release : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 671
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->removeBuscard:Lo/egd;

    nop

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 683
    return-void
.end method

.method private callServiceHotLine()V
    .locals 5

    .line 472
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mServiceHotlineNumber:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 474
    return-void

    .line 477
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tel:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mServiceHotlineNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 478
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.intent.action.DIAL"

    invoke-direct {v3, v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 481
    :try_start_0
    invoke-virtual {p0, v3}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 486
    goto :goto_0

    .line 483
    :catch_0
    move-exception v4

    .line 485
    const-string v0, "PluginPay BuscardDetailActivity BuscardDetailActivity go to dial:"

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 487
    :goto_0
    return-void
.end method

.method private cardEventTopUp()V
    .locals 3

    .line 404
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mIssuerId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 405
    invoke-static {p0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mIssuerId:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v2

    .line 406
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 407
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 408
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$1;

    invoke-direct {v1, p0, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 413
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 418
    :cond_0
    return-void
.end method

.method private deleteBusCard()V
    .locals 5

    .line 736
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_deleting:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->startProgress(Ljava/lang/String;)V

    .line 737
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mIssuerId:Ljava/lang/String;

    const-string v2, "1"

    new-instance v3, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$3;

    invoke-direct {v3, p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$3;-><init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;)V

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v4, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->uninstallTrafficCard(Ljava/lang/String;ZLjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/UninstallTrafficCardCallback;)V

    .line 768
    return-void
.end method

.method private dismissDealUnfinishedOrderProgress()V
    .locals 1

    .line 546
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 548
    const-string v0, "PluginPay BuscardDetailActivity dismissDealUnfinishedOrderProgress, activity is finishing"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 549
    return-void

    .line 552
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mDealUnfinishedProgressDialog:Lo/yw;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mDealUnfinishedProgressDialog:Lo/yw;

    invoke-interface {v0}, Lo/yw;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 554
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mDealUnfinishedProgressDialog:Lo/yw;

    invoke-interface {v0}, Lo/yw;->dismiss()V

    .line 556
    :cond_1
    return-void
.end method

.method private doReChargeButton()V
    .locals 4

    .line 603
    invoke-static {p0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mIssuerId:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v2

    .line 604
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 605
    return-void

    .line 607
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PluginPay BuscardDetailActivity doReChargeButton  aid ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 608
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v3

    .line 609
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 610
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mRecharge:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    goto :goto_0

    .line 612
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mRecharge:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 614
    :goto_0
    return-void
.end method

.method private goIntoWebview(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 493
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 494
    const-class v0, Lcom/huawei/nfc/carrera/ui/webview/PolicyActivity;

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 495
    const-string v0, "webview_title"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 496
    const-string v0, "webview_url"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 497
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 502
    goto :goto_0

    .line 499
    :catch_0
    move-exception v1

    .line 501
    const-string v0, "PluginPay BuscardDetailActivity BusCard Detail goInto Agreement failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 503
    :goto_0
    return-void
.end method

.method private initParams()Z
    .locals 3

    .line 300
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 301
    if-nez v2, :cond_0

    .line 303
    const/4 v0, 0x0

    return v0

    .line 306
    :cond_0
    const-string v0, "traffic_card_issuerId"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mIssuerId:Ljava/lang/String;

    .line 307
    const-string v0, "traffic_card_productId"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mProductId:Ljava/lang/String;

    .line 308
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mIssuerId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mProductId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 310
    :cond_1
    const-string v0, "PluginPay BuscardDetailActivity initParams, illegal params"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 311
    const/4 v0, 0x0

    return v0

    .line 314
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private showDialog()V
    .locals 3

    .line 852
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    .line 853
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_delete_buscard_tip:I

    .line 854
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_hcoin_use_flow_cancel:I

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$5;-><init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;)V

    .line 857
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_hcoin_use_flow_sure:I

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$4;-><init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;)V

    .line 866
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    .line 875
    invoke-virtual {v0}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    .line 876
    invoke-virtual {v0}, Lo/egv;->show()V

    .line 877
    return-void
.end method

.method private showErrorDialog(Ljava/lang/String;)V
    .locals 5

    .line 880
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    .line 881
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 882
    invoke-virtual {v0, p1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_cvv_code_introduction_ok:I

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$6;-><init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;)V

    .line 883
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 893
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 894
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egv;->setCancelable(Z)V

    .line 895
    invoke-virtual {v4}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 896
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 898
    :cond_0
    return-void
.end method

.method private startProgress(Ljava/lang/String;)V
    .locals 2

    .line 796
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->progress21:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->progress21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 798
    return-void

    .line 800
    :cond_0
    invoke-static {p0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->progress21:Lo/egn;

    .line 801
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->progress21:Lo/egn;

    invoke-virtual {v0, p1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 802
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->progress21:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCanceledOnTouchOutside(Z)V

    .line 803
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->progress21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 804
    return-void
.end method

.method private stopProgress()V
    .locals 1

    .line 819
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->progress21:Lo/egn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->progress21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 821
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->progress21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 822
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->progress21:Lo/egn;

    .line 824
    :cond_0
    return-void
.end method


# virtual methods
.method public getCardProUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 624
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PluginPay BuscardDetailActivity queryTrafficCardInfoCallback  aid ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 626
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardAidTrasToUrlMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 627
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardAidTrasToUrlMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    goto :goto_0

    .line 629
    :cond_0
    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardProUrl:Ljava/lang/String;

    .line 631
    :goto_0
    return-object v2
.end method

.method public init()V
    .locals 4

    .line 320
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->init()V

    .line 321
    sget v0, Lcom/huawei/wallet/R$string;->nfc_cardlist_detail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->setTitle(I)V

    .line 322
    sget v0, Lcom/huawei/wallet/R$id;->buscard_detail_icon_iv:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mBuscardRes:Landroid/widget/ImageView;

    .line 323
    sget v0, Lcom/huawei/wallet/R$id;->buscard_detail_card_name_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mBuscardNameTv:Landroid/widget/TextView;

    .line 324
    sget v0, Lcom/huawei/wallet/R$id;->buscard_detail_trade_detail_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mLayoutTradeDetails:Landroid/widget/RelativeLayout;

    .line 325
    sget v0, Lcom/huawei/wallet/R$id;->buscard_detail_problem_rl:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mLayoutProblem:Landroid/widget/RelativeLayout;

    .line 326
    sget v0, Lcom/huawei/wallet/R$id;->buscard_detail_card_charge:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mRecharge:Lo/egd;

    .line 327
    sget v0, Lcom/huawei/wallet/R$id;->buscard_detail_card_balance:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mShowBalance:Landroid/widget/TextView;

    .line 328
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mShowBalance:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_card_querying:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 329
    sget v0, Lcom/huawei/wallet/R$id;->buscard_detail_entity_num_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mShowCardNum:Landroid/widget/TextView;

    .line 330
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mShowCardNum:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_card_querying:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 331
    sget v0, Lcom/huawei/wallet/R$id;->buscard_detail_entity_validity_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mShowCardValidity:Landroid/widget/TextView;

    .line 332
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mShowCardValidity:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_card_querying:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 334
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mBusCardRelativeEnterancesMap:Ljava/util/Map;

    const-string v1, "charge"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mBusCardRelativeEnterancesMap:Ljava/util/Map;

    const-string v1, "tranfer"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mBusCardRelativeEnterancesMap:Ljava/util/Map;

    const-string v1, "cloud_tranfer"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mBusCardRelativeEnterancesMap:Ljava/util/Map;

    const-string v1, "trade_history"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mBusCardRelativeEnterancesMap:Ljava/util/Map;

    const-string v1, "card_info"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mBusCardRelativeEnterancesMap:Ljava/util/Map;

    const-string v1, "help"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mLayoutProblem:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 342
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mLayoutTradeDetails:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 343
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mRecharge:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 345
    sget v0, Lcom/huawei/wallet/R$id;->buscard_detail_hotline_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mLayoutServiceHotline:Landroid/widget/RelativeLayout;

    .line 346
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mLayoutServiceHotline:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 348
    sget v0, Lcom/huawei/wallet/R$id;->buscard_detail_agreement_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mAgreementTv:Landroid/widget/TextView;

    .line 349
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mAgreementTv:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 351
    sget v0, Lcom/huawei/wallet/R$id;->card_info_delete_buscard:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->removeBuscard:Lo/egd;

    .line 352
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->removeBuscard:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 354
    invoke-static {p0}, Lo/yk;->c(Landroid/content/Context;)Lo/yw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mDealUnfinishedProgressDialog:Lo/yw;

    .line 355
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mDealUnfinishedProgressDialog:Lo/yw;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/yw;->setCanceledOnTouchOutside(Z)V

    .line 357
    sget v0, Lcom/huawei/wallet/R$string;->nfc_money_type:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mMoneyLabel:Ljava/lang/String;

    .line 360
    sget v0, Lcom/huawei/wallet/R$string;->nfc_loading:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->showLoadingDialog(IZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 362
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardInfoManager:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mIssuerId:Ljava/lang/String;

    const-string v2, ""

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryTrafficCardInfo(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V

    .line 364
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mIssuerId:Ljava/lang/String;

    iget v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mReadCardInfoType:I

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->queryOfflineTrafficCardInfo(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryOfflineTrafficCardInfoCallback;)V

    .line 365
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mIssuerId:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->queryAndHandleUnfinfishedOrders(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;)V

    .line 367
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->doReChargeButton()V

    .line 368
    return-void
.end method

.method public jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZZ)V
    .locals 3

    .line 389
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 390
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 391
    const-string v0, "fail_desc"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 392
    const-string v0, "fail_reason"

    invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    const-string v0, "opr_type"

    invoke-virtual {v2, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 394
    const-string v0, "issuerId"

    invoke-virtual {v2, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 395
    const-string v0, "card_aid"

    invoke-virtual {v2, v0, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 396
    const-string v0, "key_enterance"

    invoke-virtual {v2, v0, p6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 397
    const-string v0, "need_retry"

    invoke-virtual {v2, v0, p7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 398
    const-string v0, "open_card"

    invoke-virtual {v2, v0, p8}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 399
    invoke-virtual {v1, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 400
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 401
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .line 373
    const/16 v0, 0x64

    if-ne p1, v0, :cond_0

    .line 375
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 377
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mShowBalance:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_card_querying:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 379
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mIssuerId:Ljava/lang/String;

    iget v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mReadCardInfoType:I

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->queryOfflineTrafficCardInfo(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryOfflineTrafficCardInfoCallback;)V

    .line 380
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->isRechargeSuccess:Z

    .line 384
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 423
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 424
    sget v0, Lcom/huawei/wallet/R$id;->buscard_detail_card_charge:I

    if-ne v0, v2, :cond_0

    .line 426
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->isRechargeSuccess:Z

    .line 428
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    invoke-direct {v3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 429
    const-string v0, "traffic_card_issuerId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mIssuerId:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 430
    const-string v0, "traffic_card_productId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mProductId:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 431
    const/16 v0, 0x64

    invoke-virtual {p0, v3, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 432
    goto/16 :goto_0

    .line 433
    :cond_0
    sget v0, Lcom/huawei/wallet/R$id;->buscard_detail_hotline_layout:I

    if-ne v0, v2, :cond_1

    .line 435
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->callServiceHotLine()V

    goto/16 :goto_0

    .line 437
    :cond_1
    sget v0, Lcom/huawei/wallet/R$id;->buscard_detail_trade_detail_layout:I

    if-ne v0, v2, :cond_2

    .line 439
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BusCardTradeDetailActivity;

    invoke-direct {v3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 440
    const-string v0, "enter_type"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 442
    const-string v0, "traffic_card_issuerId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mIssuerId:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 443
    const-string v0, "traffic_card_service_hotline"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mServiceHotlineNumber:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 444
    invoke-virtual {p0, v3}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 445
    goto :goto_0

    .line 446
    :cond_2
    sget v0, Lcom/huawei/wallet/R$id;->buscard_detail_problem_rl:I

    if-ne v0, v2, :cond_3

    .line 449
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardProUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 451
    sget v0, Lcom/huawei/wallet/R$string;->nfc_detail_scene_problem_entrance:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardProUrl:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->goIntoWebview(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 454
    :cond_3
    sget v0, Lcom/huawei/wallet/R$id;->buscard_detail_agreement_tv:I

    if-ne v0, v2, :cond_4

    .line 456
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardAgUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 458
    sget v0, Lcom/huawei/wallet/R$string;->nfc_open_buscard_instruction:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardAgUrl:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->goIntoWebview(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 461
    :cond_4
    sget v0, Lcom/huawei/wallet/R$id;->card_info_delete_buscard:I

    if-ne v0, v2, :cond_5

    .line 463
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->showDialog()V

    .line 465
    :cond_5
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 286
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 287
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->setRequestedOrientation(I)V

    .line 288
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_activity_buscard_detail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->setContentView(I)V

    .line 289
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->initParams()Z

    move-result v0

    if-nez v0, :cond_0

    .line 291
    const-string v0, "PluginPay BuscardDetailActivity BuscardDetailActivity, initParams failed!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 292
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->finish()V

    .line 293
    return-void

    .line 295
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->init()V

    .line 296
    return-void
.end method

.method public queryAndHandleUnfinishedOrderCallback(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V
    .locals 3

    .line 508
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->handleCommonErrorCode(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 510
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->dismissDealUnfinishedOrderProgress()V

    .line 511
    return-void

    .line 513
    :cond_0
    if-eqz p3, :cond_1

    .line 515
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PluginPay BuscardDetailActivity queryAndHandleUnfinishedOrderCallback total cnt : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getTotalOrderCnt()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " rechargeCnt : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 516
    invoke-virtual {p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getRechargeOrderCnt()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " issueCnt : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getIssueCardOrderCnt()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " refund : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 517
    invoke-virtual {p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getRefundOrderCnt()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 515
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 519
    :cond_1
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 523
    :sswitch_0
    goto :goto_0

    .line 526
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mIssuerId:Ljava/lang/String;

    iget v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mReadCardInfoType:I

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->queryOfflineTrafficCardInfo(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryOfflineTrafficCardInfoCallback;)V

    .line 527
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->isRechargeSuccess:Z

    .line 528
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->dismissDealUnfinishedOrderProgress()V

    .line 529
    goto :goto_0

    .line 532
    :sswitch_2
    goto :goto_0

    .line 535
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mIssuerId:Ljava/lang/String;

    iget v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mReadCardInfoType:I

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->queryOfflineTrafficCardInfo(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryOfflineTrafficCardInfoCallback;)V

    .line 536
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->dismissDealUnfinishedOrderProgress()V

    .line 537
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_card_balance_reach_limit:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->showToast(I)V

    .line 538
    .line 542
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x4b1 -> :sswitch_3
        0x2710 -> :sswitch_2
        0x2711 -> :sswitch_0
        0x2712 -> :sswitch_1
    .end sparse-switch
.end method

.method public queryCardTransferAbilityCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;)V
    .locals 2

    .line 926
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->progressDialog:Lo/yw;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->dismissProgress(Lo/yw;)V

    .line 927
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mTransferInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;

    .line 928
    if-nez p1, :cond_0

    if-eqz p2, :cond_0

    .line 930
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryCardTransferAbilityCallback "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 931
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->getTransferAbility()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mTransferAbility:Ljava/lang/String;

    .line 932
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->getEventId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mEventId:Ljava/lang/String;

    .line 933
    const-string v0, "3"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mTransferAbility:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 935
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->getTransferStatus()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mTransferStatus:Ljava/lang/String;

    .line 948
    :cond_0
    return-void
.end method

.method public queryOfflineTrafficCardInfoCallback(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;)V
    .locals 6

    .line 688
    const-string v0, "PluginPay BuscardDetailActivity "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryOfflineTrafficCardInfoCallback  resultCode : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 690
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->isRechargeSuccess:Z

    if-eqz v0, :cond_0

    .line 691
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardEventTopUp()V

    .line 693
    :cond_0
    if-nez p1, :cond_5

    .line 695
    if-nez p2, :cond_1

    .line 697
    return-void

    .line 699
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mShowBalance:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mMoneyLabel:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->getBalance()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 700
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->getCardNo()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 702
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mShowCardNum:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->getCardNo()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 705
    :cond_2
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->getExpireDate()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 707
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mShowCardValidity:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->getExpireDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 709
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->getExpireDate()Ljava/lang/String;

    move-result-object v0

    const-string v1, "yyyy/MM/dd"

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/TimeUtil;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 710
    const-string v0, "PluginPay BuscardDetailActivity "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryOfflineTrafficCardInfoCallback getCardBalance isOverdue : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",cardInfo.expireDate="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->getExpireDate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 711
    invoke-static {p0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mIssuerId:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v5

    .line 712
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    const-string v0, "9156000014010001"

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    .line 713
    const/16 v0, 0x1c

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->handleCommonErrorCode(I)Z

    .line 718
    :cond_3
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->getStartdate()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6

    .line 720
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->getStartdate()Ljava/lang/String;

    move-result-object v0

    const-string v1, "yyyy/MM/dd"

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/TimeUtil;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 721
    const-string v0, "PluginPay BuscardDetailActivity "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryOfflineTrafficCardInfoCallback getCardBalance notEnabled : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",cardInfo.startdate="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->getStartdate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 722
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 723
    const/16 v0, 0x1a

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->handleCommonErrorCode(I)Z

    .line 725
    :cond_4
    goto :goto_0

    .line 730
    :cond_5
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->handleCommonErrorCode(I)Z

    .line 732
    :cond_6
    :goto_0
    return-void
.end method

.method public queryTrafficCardInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;)V
    .locals 3

    .line 561
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 563
    const-string v0, "PluginPay BuscardDetailActivity queryTrafficCardInfoCallback, activity is finishing"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 564
    return-void

    .line 567
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->destroyLoadingDialog()V

    .line 568
    if-nez p1, :cond_1

    if-nez p2, :cond_2

    .line 570
    :cond_1
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->handleCommonErrorCode(I)Z

    .line 571
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->finish()V

    .line 572
    return-void

    .line 574
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PluginPay BuscardDetailActivity queryTrafficCardInfoCallback, info.toString :  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 576
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardName:Ljava/lang/String;

    .line 577
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getAgreementUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardAgUrl:Ljava/lang/String;

    .line 578
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getProUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardProUrl:Ljava/lang/String;

    .line 579
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getTransferUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->transferUrl:Ljava/lang/String;

    .line 580
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getCardStatus()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardStatus:I

    .line 581
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getAid()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mAid:Ljava/lang/String;

    .line 582
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getCardLogo()Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardLogo:Landroid/graphics/Bitmap;

    .line 584
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getContactHuaweiNum()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mServiceHotlineNumber:Ljava/lang/String;

    .line 585
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mServiceHotlineNumber:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 587
    const-string v0, "4008308300"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mServiceHotlineNumber:Ljava/lang/String;

    .line 590
    :cond_3
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getCardStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 592
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mBusCardRelativeEnterancesMap:Ljava/util/Map;

    const-string v1, "tranfer"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 593
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardInfoManager:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->mIssuerId:Ljava/lang/String;

    invoke-interface {v0, v1, p0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryCardTransferAbility(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardTransferAbilityCallback;)V

    .line 597
    :cond_4
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->getCardProUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardProUrl:Ljava/lang/String;

    .line 598
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PluginPay BuscardDetailActivity queryTrafficCardInfoCallback  cardProUrl ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardProUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 599
    invoke-direct {p0, p2}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->bindViews(Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;)V

    .line 600
    return-void
.end method
