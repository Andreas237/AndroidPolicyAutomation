.class public Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;
.super Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RechargeCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RefundCallback;
.implements Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;
.implements Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;
.implements Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment$PayMethodCallback;
.implements Lcom/huawei/nfc/carrera/logic/wxpay/WXPayCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardNoticeCallback;


# static fields
.field static final EXTRA_KEY_CARD_ISSUERID:Ljava/lang/String; = "traffic_card_issuerId"

.field static final EXTRA_KEY_CARD_PRODUCTD:Ljava/lang/String; = "traffic_card_productId"

.field private static final EXTRA_RESULT:Ljava/lang/String; = "intent.extra.RESULT"

.field private static FRAGMENT_TAG_SELECT:Ljava/lang/String; = null

.field private static final GET_PAY_TYPE_SCENE_CLICK_OPEN_CARD:I = 0x2

.field private static final GET_PAY_TYPE_SCENE_ENTRY_TO_ACTIVITY:I = 0x1

.field private static final HANDLER_EVENT_PAY_NOT_CONNECTED:I = 0x67

.field protected static final HANDLER_EVENT_PAY_RESULT:I = 0x65

.field protected static final HANDLER_EVENT_PAY_START:I = 0x64

.field private static final HANDLER_ONWINDOW_FOCUSCHANGED_WAIT:I = 0x68

.field private static final PACKAGE_NAME_WECHAT:Ljava/lang/String; = "com.tencent.mm"

.field protected static final RECHARGE_FAIL_REQUESTCODE:I = 0x69

.field private static final REQUEST_RESOLVE_ERROR:I = 0x66

.field private static final TAG:Ljava/lang/String; = "PluginPay BuscardRechargeAcitvity"

.field private static sErrorCodeTable:Landroid/util/SparseIntArray; = null

.field private static threadPool:Ljava/util/concurrent/ExecutorService; = null


# instance fields
.field private autoScrollTextView:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

.field private btnDoRecharge:Lo/egd;

.field private btnRechargeList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/egd;>;"
        }
    .end annotation
.end field

.field private dialogBuilder:Lo/egs$b;

.field getPayTypeHandler:Landroid/os/Handler;

.field getPayTypeRunable:Ljava/lang/Runnable;

.field private getPayTypeScene:I

.field private isFinish:Z

.field private isFromWindow:Z

.field private isGetPayTypeSuccess:Z

.field private isHasUnfinfishedOrders:Z

.field protected isMultiPayMode:Z

.field private isRechargeable:Z

.field protected isSptHwOnline:Z

.field private mCardImageView:Landroid/widget/ImageView;

.field private mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

.field private mIssuerId:Ljava/lang/String;

.field private mMoneyLabel:Ljava/lang/String;

.field private mNormalRechargeAmountTextColor:I

.field private mNoticeList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;>;"
        }
    .end annotation
.end field

.field private mProductId:Ljava/lang/String;

.field private mResolvingError:Z

.field private mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

.field private mSelectedRechargeAmountTextColor:I

.field private mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

.field protected mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

.field private noteDialog:Lo/egs;

.field private noticeLayout:Landroid/widget/RelativeLayout;

.field private payAmount:D

.field private payhandler:Landroid/os/Handler;

.field private promotionInfoList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;>;"
        }
    .end annotation
.end field

.field private rechargeMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;

.field private rechargeWidth:I

.field private textPayAmount:Landroid/widget/TextView;

.field private trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 178
    const-string v0, "select_fragment_recharge"

    sput-object v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->FRAGMENT_TAG_SELECT:Ljava/lang/String;

    .line 228
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->threadPool:Ljava/util/concurrent/ExecutorService;

    .line 779
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->sErrorCodeTable:Landroid/util/SparseIntArray;

    .line 783
    sget-object v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->sErrorCodeTable:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_card_recharge_failed_balance_is_minus:I

    const/16 v2, 0x3eb

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->append(II)V

    .line 785
    sget-object v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->sErrorCodeTable:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_card_balance_reach_limit:I

    const/16 v2, 0x3e9

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->append(II)V

    .line 787
    sget-object v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->sErrorCodeTable:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_offline_card_after_expire_date_error:I

    const/16 v2, 0x3ed

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->append(II)V

    .line 789
    sget-object v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->sErrorCodeTable:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_offline_card_date_error:I

    const/16 v2, 0x3ec

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->append(II)V

    .line 791
    sget-object v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->sErrorCodeTable:Landroid/util/SparseIntArray;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_offline_card_date_error:I

    const/16 v2, 0x3ee

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->append(II)V

    .line 793
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 94
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;-><init>()V

    .line 160
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->dialogBuilder:Lo/egs$b;

    .line 161
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->noteDialog:Lo/egs;

    .line 175
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mResolvingError:Z

    .line 179
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isFinish:Z

    .line 180
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isFromWindow:Z

    .line 186
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isHasUnfinfishedOrders:Z

    .line 190
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isGetPayTypeSuccess:Z

    .line 205
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    .line 221
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getPayTypeScene:I

    .line 226
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isSptHwOnline:Z

    .line 612
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$4;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$4;-><init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->payhandler:Landroid/os/Handler;

    .line 1190
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$6;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$6;-><init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getPayTypeRunable:Ljava/lang/Runnable;

    .line 1212
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$7;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$7;-><init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getPayTypeHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)V
    .locals 0

    .line 94
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->onWindowFocusChangedWait()V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)Ljava/util/ArrayList;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->promotionInfoList:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$302(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->promotionInfoList:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic access$402(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;Z)Z
    .locals 0

    .line 94
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isGetPayTypeSuccess:Z

    return p1
.end method

.method static synthetic access$500(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)I
    .locals 1

    .line 94
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getPayTypeScene:I

    return v0
.end method

.method static synthetic access$600(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)Lo/egn;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->progressDialog21:Lo/egn;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;Lo/egn;)V
    .locals 0

    .line 94
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->dismissProgress(Lo/egn;)V

    return-void
.end method

.method static synthetic access$800(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)V
    .locals 0

    .line 94
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->onClickRechargedButton()V

    return-void
.end method

.method private asyncCallPay(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V
    .locals 7

    .line 590
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getPayInfo()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    move-result-object v4

    .line 591
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->makePayReq()Lcom/huawei/hms/support/api/entity/pay/PayReq;

    move-result-object v5

    .line 592
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "payReq="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 593
    sget-object v0, Lcom/huawei/hms/support/api/pay/HuaweiPay;->HuaweiPayApi:Lcom/huawei/hms/support/api/pay/HuaweiPayApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-interface {v0, v1, v5}, Lcom/huawei/hms/support/api/pay/HuaweiPayApi;->pay(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/PayReq;)Lcom/huawei/hms/support/api/client/PendingResult;

    move-result-object v6

    .line 594
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$3;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$3;-><init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)V

    invoke-virtual {v6, v0}, Lcom/huawei/hms/support/api/client/PendingResult;->setResultCallback(Lcom/huawei/hms/support/api/client/ResultCallback;)V

    .line 611
    return-void
.end method

.method private bindViews()V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 732
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 734
    return-void

    .line 736
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getCardIcon()Landroid/graphics/Bitmap;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 738
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mCardImageView:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getCardIcon()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 741
    :cond_1
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notice mTrafficCardInfo.getRechargeSupport() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getRechargeSupport()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 742
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getRechargeSupport()Z

    move-result v0

    if-nez v0, :cond_2

    .line 744
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnDoRecharge:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 746
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getRechargeAmounts()Ljava/util/List;

    move-result-object v4

    .line 747
    if-eqz v4, :cond_5

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 749
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 750
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_4

    .line 752
    if-ge v6, v5, :cond_3

    .line 754
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->getStringForRechargeMoney()Ljava/lang/String;

    move-result-object v7

    .line 756
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mMoneyLabel:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 757
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setTag(Ljava/lang/Object;)V

    .line 758
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 760
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 761
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->rechargeWidth:I

    iput v0, v8, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 762
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    invoke-virtual {v0, v8}, Lo/egd;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 763
    goto :goto_1

    .line 766
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 750
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 769
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    invoke-virtual {v0}, Lo/egd;->callOnClick()Z

    .line 771
    :cond_5
    return-void
.end method

.method private fmPay()V
    .locals 4

    .line 1095
    sget v0, Lcom/huawei/wallet/R$string;->huaweipay_channel_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->setTitle(I)V

    .line 1096
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1098
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->rechargeMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->getPayMoney()D

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-static {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->newSelectPayMethodFragment(IDLjava/lang/String;)Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    .line 1101
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1103
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$id;->recharge_container:I

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    sget-object v3, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->FRAGMENT_TAG_SELECT:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    .line 1104
    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    goto :goto_0

    .line 1108
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->rechargeMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->getPayMoney()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->setPayAmount(D)V

    .line 1109
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-virtual {v0, v1}, Landroid/app/FragmentTransaction;->show(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 1111
    :goto_0
    return-void
.end method

.method private getFromOrder(I)V
    .locals 3

    .line 1036
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->rechargeMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;

    const/4 v1, 0x2

    invoke-direct {v2, v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;-><init>(ILcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;)V

    .line 1037
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->rechargeMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->setRechargePayment(Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;)V

    .line 1038
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->setPayType(I)V

    .line 1039
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->applyPayOrder(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;)V

    .line 1040
    return-void
.end method

.method private goIntoWebview(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1265
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1267
    :cond_0
    const-string v0, "BuscardRechargeAcitvity goIntoWebview, title or url is empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1268
    return-void

    .line 1272
    :cond_1
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 1273
    const-class v0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1274
    const-string v0, "title"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1275
    const-string v0, "intent_bundle_url"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1276
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1281
    goto :goto_0

    .line 1278
    :catch_0
    move-exception v1

    .line 1280
    const-string v0, "BusCard add goInto notice failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 1282
    :goto_0
    return-void
.end method

.method private initParams()Z
    .locals 3

    .line 289
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 290
    if-nez v2, :cond_0

    .line 292
    const/4 v0, 0x0

    return v0

    .line 295
    :cond_0
    const-string v0, "traffic_card_issuerId"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    .line 296
    const-string v0, "traffic_card_productId"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mProductId:Ljava/lang/String;

    .line 297
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mProductId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 299
    :cond_1
    const-string v0, "PluginPay BuscardRechargeAcitvityinitParams, illegal params"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 300
    const/4 v0, 0x0

    return v0

    .line 302
    :cond_2
    sget-object v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->threadPool:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getPayTypeRunable:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 303
    const/4 v0, 0x1

    return v0
.end method

.method private onClickRechargedButton()V
    .locals 9

    .line 405
    invoke-static {}, Lcom/huawei/nfc/carrera/ui/bus/util/TimeUtil;->isFastDoubleClick()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 406
    const-string v0, "PluginPay BuscardRechargeAcitvityonClick, isFastDoubleClick"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 407
    return-void

    .line 410
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isRechargeable:Z

    if-nez v0, :cond_1

    .line 412
    sget v0, Lcom/huawei/wallet/R$string;->nfc_get_recharge_amount_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showErrorDialog(Ljava/lang/String;)V

    .line 413
    return-void

    .line 415
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getMode()I

    move-result v0

    const/16 v1, 0x16

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getMode()I

    move-result v0

    const/16 v1, 0x14

    if-ne v1, v0, :cond_3

    :cond_2
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isGetPayTypeSuccess:Z

    if-nez v0, :cond_3

    .line 417
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->progressDialog21:Lo/egn;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_loading:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showProgress(Lo/egn;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 419
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getPayTypeScene:I

    .line 420
    sget-object v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->threadPool:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getPayTypeRunable:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 421
    return-void

    .line 423
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->isWxPaySupport()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getMode()I

    move-result v0

    const/16 v1, 0xe

    if-ne v1, v0, :cond_4

    const/4 v8, 0x1

    goto :goto_0

    :cond_4
    const/4 v8, 0x0

    .line 424
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onClick, recharge card isSh : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ; TrafficCardInfo : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 425
    if-eqz v8, :cond_5

    .line 426
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->fmPay()V

    .line 427
    return-void

    .line 429
    :cond_5
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getMode()I

    move-result v0

    const/16 v1, 0x16

    if-eq v1, v0, :cond_6

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getMode()I

    move-result v0

    const/16 v1, 0x14

    if-ne v1, v0, :cond_7

    :cond_6
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->getPrePaytypes()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    const/4 v0, 0x1

    goto :goto_1

    :cond_7
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isMultiPayMode:Z

    .line 430
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isMultiPayMode:Z

    if-eqz v0, :cond_8

    .line 431
    const-string v0, "applyIssueOrder isMultiPayMode is ok"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 432
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->requestShOrder()V

    .line 433
    return-void

    .line 435
    :cond_8
    sget v0, Lcom/huawei/wallet/R$string;->nfc_loading:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showLoadingDialog(IZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 436
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    iget-wide v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->payAmount:D

    const-string v6, ""

    move-object v7, p0

    const/4 v4, 0x2

    const/4 v5, 0x1

    invoke-interface/range {v0 .. v7}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->applyPayOrder(Ljava/lang/String;DIILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;)V

    .line 438
    return-void
.end method

.method private onSelectHWPay()V
    .locals 1

    .line 1030
    const-string v0, "enter onSelectHWPay"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1031
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getFromOrder(I)V

    .line 1032
    return-void
.end method

.method private onSelectWXPay()V
    .locals 9

    .line 1017
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->isWxPaySupport()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getMode()I

    move-result v0

    const/16 v1, 0xe

    if-ne v1, v0, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    .line 1018
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSelectWXPay isSh ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1019
    if-eqz v8, :cond_1

    .line 1020
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    iget-wide v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->payAmount:D

    const-string v6, ""

    move-object v7, p0

    const/4 v4, 0x2

    const/4 v5, 0x2

    invoke-interface/range {v0 .. v7}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->applyPayOrder(Ljava/lang/String;DIILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;)V

    goto :goto_1

    .line 1022
    :cond_1
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getFromOrder(I)V

    .line 1024
    :goto_1
    return-void
.end method

.method private onWindowFocusChangedWait()V
    .locals 5

    .line 1171
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->isRequest()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 1172
    :goto_0
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter onWindowFocusChangedWait isToFun : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1173
    if-eqz v4, :cond_1

    .line 1174
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->setRequest(Z)V

    .line 1175
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isFinish:Z

    .line 1176
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isFromWindow:Z

    .line 1177
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user recharge to function"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1178
    sget v0, Lcom/huawei/wallet/R$string;->nfc_loading:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showLoadingDialog(IZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 1179
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->queryAndHandleUnfinfishedOrders(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;)V

    .line 1181
    :cond_1
    return-void
.end method

.method private refreshRechargeBtn(I)V
    .locals 3

    .line 442
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 444
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/egd;

    .line 445
    invoke-virtual {v2}, Lo/egd;->getId()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 447
    sget v0, Lcom/huawei/wallet/R$drawable;->nfc_buscard_recharge_bg:I

    invoke-virtual {v2, v0}, Lo/egd;->setBackgroundResource(I)V

    .line 448
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectedRechargeAmountTextColor:I

    invoke-virtual {v2, v0}, Lo/egd;->setTextColor(I)V

    goto :goto_1

    .line 452
    :cond_0
    sget v0, Lcom/huawei/wallet/R$drawable;->nfc_buscard_recharge_normal_bg:I

    invoke-virtual {v2, v0}, Lo/egd;->setBackgroundResource(I)V

    .line 453
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mNormalRechargeAmountTextColor:I

    invoke-virtual {v2, v0}, Lo/egd;->setTextColor(I)V

    .line 442
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 457
    :cond_1
    return-void
.end method

.method private requestShOrder()V
    .locals 4

    .line 1114
    sget v0, Lcom/huawei/wallet/R$string;->huaweipay_channel_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->setTitle(I)V

    .line 1115
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1116
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->payAmount:D

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->setPremount(D)V

    .line 1117
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->setPreOrderType(I)V

    .line 1118
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    iget-boolean v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isSptHwOnline:Z

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->setSptonline(Z)V

    .line 1119
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->newSelectPayMethodFragment(Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;)Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    .line 1122
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1123
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$id;->recharge_container:I

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    sget-object v3, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->FRAGMENT_TAG_SELECT:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    .line 1124
    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    goto :goto_0

    .line 1126
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    iget-boolean v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isSptHwOnline:Z

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->setSptHwOnline(Z)V

    .line 1127
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->payAmount:D

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->setPayAmount(D)V

    .line 1128
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-virtual {v0, v1}, Landroid/app/FragmentTransaction;->show(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 1130
    :goto_0
    return-void
.end method

.method private showErrorDialog(Ljava/lang/String;)V
    .locals 5

    .line 526
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    .line 527
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 528
    invoke-virtual {v0, p1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_cvv_code_introduction_ok:I

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$2;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$2;-><init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)V

    .line 529
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 539
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 540
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egv;->setCancelable(Z)V

    .line 541
    invoke-virtual {v4}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 542
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 544
    :cond_0
    return-void
.end method

.method private showNoNetDialog()V
    .locals 5

    .line 800
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    .line 801
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bus_no_net_dialog:I

    .line 802
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_cvv_code_introduction_ok:I

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$5;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$5;-><init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)V

    .line 803
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 813
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 814
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egv;->setCancelable(Z)V

    .line 815
    invoke-virtual {v4}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 816
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 819
    :cond_0
    return-void
.end method

.method private showNoteHwidRunBackDialog()V
    .locals 4

    .line 845
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showNoteHwidRunBackDialog:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 846
    new-instance v0, Lo/egs$b;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egs$b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->dialogBuilder:Lo/egs$b;

    .line 847
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->dialogBuilder:Lo/egs$b;

    invoke-virtual {v0}, Lo/egs$b;->d()Lo/egs;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->noteDialog:Lo/egs;

    .line 848
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->noteDialog:Lo/egs;

    invoke-virtual {v0}, Lo/egs;->show()V

    .line 849
    return-void
.end method

.method private startHWPay(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V
    .locals 4

    .line 579
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 580
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->asyncCallPay(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    goto :goto_0

    .line 582
    :cond_0
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Connect failed, please connect first."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 584
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->payhandler:Landroid/os/Handler;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 586
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0, p0}, Lcom/huawei/hms/api/HuaweiApiClient;->connect(Landroid/app/Activity;)V

    .line 588
    :goto_0
    return-void
.end method


# virtual methods
.method public applyPayOrderCallback(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V
    .locals 2

    .line 509
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->destroyLoadingDialog()V

    .line 510
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PluginPay BuscardRechargeAcitvityapplyRechargeOrderCallback, resultCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 511
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    if-eqz p2, :cond_0

    .line 513
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 514
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->payhandler:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 518
    :cond_0
    const-string v0, "PluginPay BuscardRechargeAcitvityapplyRechargeOrderCallback, apply failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 520
    const-string v0, "PluginPay BuscardRechargeAcitvityapplyRechargeOrderCallback, apply failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 521
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showErrorDialog(Ljava/lang/String;)V

    .line 523
    :goto_0
    return-void
.end method

.method protected getErrorMessage(I)Ljava/lang/String;
    .locals 3

    .line 864
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PluginPay BuscardRechargeAcitvityapplyRechargeOrderCallback, apply failed errorCode"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 865
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->getCommonErrorMessage(I)Ljava/lang/String;

    move-result-object v2

    .line 866
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 868
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 874
    :sswitch_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_offline_read_card_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 877
    :sswitch_1
    sget v0, Lcom/huawei/wallet/R$string;->nfc_repeat_order:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 880
    :sswitch_2
    sget v0, Lcom/huawei/wallet/R$string;->nfc_balance_reach_limit:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 884
    :sswitch_3
    sget v0, Lcom/huawei/wallet/R$string;->nfc_recharge_fail_customer_service:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 888
    :sswitch_4
    sget v0, Lcom/huawei/wallet/R$string;->nfc_recharge_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 891
    :sswitch_5
    sget v0, Lcom/huawei/wallet/R$string;->nfc_sp_return_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 894
    :sswitch_6
    sget v0, Lcom/huawei/wallet/R$string;->nfc_recharge_amount_less_than_overdraft:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 897
    :sswitch_7
    sget v0, Lcom/huawei/wallet/R$string;->nfc_recharge_amount_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 901
    :sswitch_8
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_offline_card_in_blacklist:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 904
    :sswitch_9
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_offline_card_balance_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 909
    :sswitch_a
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_offline_card_date_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 912
    :sswitch_b
    sget v0, Lcom/huawei/wallet/R$string;->nfc_overdraft_negative:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 916
    :sswitch_c
    sget v0, Lcom/huawei/wallet/R$string;->nfc_get_city_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 919
    :sswitch_d
    sget v0, Lcom/huawei/wallet/R$string;->nfc_sp_out_of_service:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 922
    :sswitch_e
    sget v0, Lcom/huawei/wallet/R$string;->nfc_sp_recharge_reach_limit:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 925
    :goto_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_sp_return_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 928
    :cond_0
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0x14 -> :sswitch_0
        0x15 -> :sswitch_8
        0x16 -> :sswitch_8
        0x17 -> :sswitch_9
        0x18 -> :sswitch_b
        0x63 -> :sswitch_0
        0x3e9 -> :sswitch_2
        0x3ea -> :sswitch_1
        0x3eb -> :sswitch_6
        0x3ec -> :sswitch_a
        0x3ed -> :sswitch_a
        0x3ee -> :sswitch_a
        0x3ef -> :sswitch_7
        0x3f0 -> :sswitch_c
        0x3f2 -> :sswitch_d
        0x44e -> :sswitch_5
        0x44f -> :sswitch_c
        0x515 -> :sswitch_3
        0x516 -> :sswitch_4
        0x517 -> :sswitch_4
        0x518 -> :sswitch_3
        0x519 -> :sswitch_e
    .end sparse-switch
.end method

.method public handleCommonErrorCode(I)Z
    .locals 3

    .line 549
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->handleCommonErrorCode(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 551
    const/4 v0, 0x1

    return v0

    .line 553
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->sErrorCodeTable:Landroid/util/SparseIntArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v2

    .line 554
    if-eqz v2, :cond_1

    .line 556
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showToast(I)V

    .line 557
    const/4 v0, 0x1

    return v0

    .line 561
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public init()V
    .locals 8

    .line 309
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->init()V

    .line 310
    sget v0, Lcom/huawei/wallet/R$string;->nfc_buscard_recharge_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->setTitle(I)V

    .line 312
    sget v0, Lcom/huawei/wallet/R$id;->buscard_recharge_card_res:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mCardImageView:Landroid/widget/ImageView;

    .line 313
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    .line 314
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/wallet/R$id;->buscard_recharge_amount_1:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 315
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/wallet/R$id;->buscard_recharge_amount_2:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/wallet/R$id;->buscard_recharge_amount_3:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/wallet/R$id;->buscard_recharge_amount_4:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/wallet/R$id;->buscard_recharge_amount_5:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/wallet/R$id;->buscard_recharge_amount_6:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 321
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    .line 322
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 323
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$dimen;->nfc_bus_recharge_margin:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v6, v0

    .line 326
    mul-int/lit8 v0, v6, 0x6

    sub-int v0, v5, v0

    div-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->rechargeWidth:I

    .line 328
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_0

    .line 330
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 331
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnRechargeList:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 328
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 334
    :cond_0
    sget v0, Lcom/huawei/wallet/R$id;->buscard_recharge_do_recharge:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnDoRecharge:Lo/egd;

    .line 335
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->btnDoRecharge:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 338
    sget v0, Lcom/huawei/wallet/R$id;->buscard_recharge_pay_amount_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->textPayAmount:Landroid/widget/TextView;

    .line 340
    sget v0, Lcom/huawei/wallet/R$string;->nfc_money_type:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mMoneyLabel:Ljava/lang/String;

    .line 341
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$color;->white:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectedRechargeAmountTextColor:I

    .line 342
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$color;->buscard_money_text_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mNormalRechargeAmountTextColor:I

    .line 344
    sget v0, Lcom/huawei/wallet/R$id;->astv_notice_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->autoScrollTextView:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    .line 345
    sget v0, Lcom/huawei/wallet/R$id;->rl_recharge_notice:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->noticeLayout:Landroid/widget/RelativeLayout;

    .line 346
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->noticeLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 347
    sget v0, Lcom/huawei/wallet/R$string;->nfc_loading:I

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$1;-><init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)V

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showLoadingDialog(IZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 358
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->setRequest(Z)V

    .line 359
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->cardInfoManager:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    const-string v2, ""

    const/4 v3, 0x2

    invoke-interface {v0, v1, v3, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryTrafficCardInfo(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V

    .line 363
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getNoticeIssueId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 364
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BuscardRechargeAcitvity noticeIssuerId =  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 365
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->cardInfoManager:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    const-string v1, "1"

    invoke-interface {v0, v7, v1, p0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryCardNotice(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardNoticeCallback;)V

    .line 366
    return-void
.end method

.method public initHMS()V
    .locals 2

    .line 284
    new-instance v0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v1, Lcom/huawei/hms/support/api/pay/HuaweiPay;->PAY_API:Lcom/huawei/hms/api/Api;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->addApi(Lcom/huawei/hms/api/Api;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->addConnectionCallbacks(Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->addOnConnectionFailedListener(Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->build()Lcom/huawei/hms/api/HuaweiApiClient;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    .line 285
    return-void
.end method

.method public jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZZ)V
    .locals 3

    .line 934
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 935
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 936
    const-string v0, "fail_desc"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 937
    const-string v0, "fail_reason"

    invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 938
    const-string v0, "opr_type"

    invoke-virtual {v2, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 939
    const-string v0, "issuerId"

    invoke-virtual {v2, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 940
    const-string v0, "card_aid"

    invoke-virtual {v2, v0, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 941
    const-string v0, "key_enterance"

    invoke-virtual {v2, v0, p6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 942
    const-string v0, "need_retry"

    invoke-virtual {v2, v0, p7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 943
    const-string v0, "open_card"

    invoke-virtual {v2, v0, p8}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 944
    invoke-virtual {v1, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 945
    const/16 v0, 0x69

    invoke-virtual {p0, v1, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 946
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 7

    .line 635
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 637
    const/16 v0, 0x65

    if-ne v0, p1, :cond_4

    .line 638
    const-string v4, "Payment failed"

    .line 639
    sget-object v0, Lcom/huawei/hms/support/api/pay/HuaweiPay;->HuaweiPayApi:Lcom/huawei/hms/support/api/pay/HuaweiPayApi;

    invoke-interface {v0, p3}, Lcom/huawei/hms/support/api/pay/HuaweiPayApi;->getPayResultInfoFromIntent(Landroid/content/Intent;)Lcom/huawei/hms/support/api/pay/PayResultInfo;

    move-result-object v5

    .line 640
    if-eqz v5, :cond_2

    .line 641
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 642
    const-string v0, "returnCode"

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getReturnCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 643
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult returnCode : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getReturnCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 644
    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getReturnCode()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 645
    const-string v0, "returnCode"

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getReturnCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 646
    const-string v0, "userName"

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getUserName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 647
    const-string v0, "orderID"

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getOrderID()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 648
    const-string v0, "amount"

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getAmount()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 649
    const-string v0, "errMsg"

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getErrMsg()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 650
    const-string v0, "time"

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getTime()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 651
    const-string v0, "requestId"

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getRequestId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_card_recharge:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showLoadingDialog(IZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 658
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->recharge(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RechargeCallback;)V

    goto :goto_0

    .line 659
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getReturnCode()I

    move-result v0

    const/16 v1, 0x7530

    if-ne v1, v0, :cond_1

    .line 660
    const-string v4, "Payment is canceled."

    .line 662
    const-string v0, "PluginPay BuscardRechargeAcitvityuser canceled"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 664
    :cond_1
    :goto_0
    goto :goto_2

    .line 665
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getMode()I

    move-result v0

    const/16 v1, 0xe

    if-ne v1, v0, :cond_3

    .line 666
    sget v0, Lcom/huawei/wallet/R$string;->huaweipay_channel_pay_not_support_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showToast(I)V

    goto :goto_1

    .line 668
    :cond_3
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_card_pay_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showToast(I)V

    .line 670
    :goto_1
    const-string v0, "PluginPay BuscardRechargeAcitvityonActivityResult, pay failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 672
    :goto_2
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Payment result "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 673
    goto/16 :goto_4

    :cond_4
    const/16 v0, 0x66

    if-ne v0, p1, :cond_a

    .line 674
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult, ResultCode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", Intent: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 675
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mResolvingError:Z

    .line 676
    const/4 v0, -0x1

    if-ne p2, v0, :cond_9

    .line 678
    const-string v0, "intent.extra.RESULT"

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 680
    if-nez v4, :cond_5

    .line 681
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_8

    .line 682
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0, p0}, Lcom/huawei/hms/api/HuaweiApiClient;->connect(Landroid/app/Activity;)V

    goto :goto_3

    .line 684
    :cond_5
    const/16 v0, 0xd

    if-ne v4, v0, :cond_6

    .line 685
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u89e3\u51b3\u9519\u8bef\u8fc7\u7a0b\u88ab\u7528\u6237\u53d6\u6d88"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 686
    :cond_6
    const/16 v0, 0x8

    if-ne v4, v0, :cond_7

    .line 687
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u53d1\u751f\u5185\u90e8\u9519\u8bef\uff0c\u91cd\u8bd5\u53ef\u4ee5\u89e3\u51b3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 690
    :cond_7
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u672a\u77e5\u8fd4\u56de\u7801"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 692
    :cond_8
    :goto_3
    goto :goto_4

    .line 693
    :cond_9
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8c03\u7528\u89e3\u51b3\u65b9\u6848\u53d1\u751f\u9519\u8bef"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    .line 696
    :cond_a
    const/16 v0, 0x69

    if-ne v0, p1, :cond_b

    .line 697
    const/4 v0, -0x1

    if-ne p2, v0, :cond_b

    .line 700
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->setResult(I)V

    .line 701
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->finish()V

    .line 704
    :cond_b
    :goto_4
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 1135
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1137
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-virtual {v0, v1}, Landroid/app/FragmentTransaction;->hide(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 1138
    sget v0, Lcom/huawei/wallet/R$string;->nfc_buscard_recharge_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->setTitle(I)V

    .line 1139
    return-void

    .line 1141
    :cond_0
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onBackPressed()V

    .line 1142
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 371
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 372
    sget v0, Lcom/huawei/wallet/R$id;->buscard_recharge_amount_1:I

    if-eq v0, v4, :cond_0

    sget v0, Lcom/huawei/wallet/R$id;->buscard_recharge_amount_2:I

    if-eq v0, v4, :cond_0

    sget v0, Lcom/huawei/wallet/R$id;->buscard_recharge_amount_3:I

    if-eq v0, v4, :cond_0

    sget v0, Lcom/huawei/wallet/R$id;->buscard_recharge_amount_4:I

    if-eq v0, v4, :cond_0

    sget v0, Lcom/huawei/wallet/R$id;->buscard_recharge_amount_5:I

    if-eq v0, v4, :cond_0

    sget v0, Lcom/huawei/wallet/R$id;->buscard_recharge_amount_6:I

    if-ne v0, v4, :cond_2

    .line 376
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->rechargeMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;

    .line 378
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->rechargeMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->getPayMoney()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isRechargeable:Z

    .line 379
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->textPayAmount:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mMoneyLabel:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->rechargeMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->getPayMoney()D

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->changeIntoDisplayMoney(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 381
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->rechargeMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->getPayMoney()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->payAmount:D

    .line 382
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->refreshRechargeBtn(I)V

    goto :goto_1

    .line 384
    :cond_2
    sget v0, Lcom/huawei/wallet/R$id;->buscard_recharge_do_recharge:I

    if-ne v0, v4, :cond_3

    .line 386
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->onClickRechargedButton()V

    goto :goto_1

    .line 388
    :cond_3
    sget v0, Lcom/huawei/wallet/R$id;->rl_recharge_notice:I

    if-ne v0, v4, :cond_5

    .line 390
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->autoScrollTextView:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->getCurrentPosition()I

    move-result v5

    .line 391
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mNoticeList:Ljava/util/List;

    if-eqz v0, :cond_4

    .line 393
    if-ltz v5, :cond_5

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mNoticeList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_5

    .line 394
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mNoticeList:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->getTitle()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mNoticeList:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->getClickUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->goIntoWebview(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 399
    :cond_4
    const-string v0, "BusCardRechargeAcitvity, mNoticeList is null!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 402
    :cond_5
    :goto_1
    return-void
.end method

.method public onConnected()V
    .locals 4

    .line 824
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onConnected, IsConnected: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v3}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnected()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 825
    return-void
.end method

.method public onConnectionFailed(Lcom/huawei/hms/api/ConnectionResult;)V
    .locals 6

    .line 828
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onConnectionFailed, ErrorCode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hms/api/ConnectionResult;->getErrorCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 829
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mResolvingError:Z

    if-eqz v0, :cond_0

    .line 830
    return-void

    .line 833
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hms/api/ConnectionResult;->getErrorCode()I

    move-result v4

    .line 834
    const/4 v0, 0x6

    if-ne v0, v4, :cond_1

    .line 835
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showNoteHwidRunBackDialog()V

    goto :goto_0

    .line 837
    :cond_1
    invoke-static {}, Lcom/huawei/hms/api/HuaweiApiAvailability;->getInstance()Lcom/huawei/hms/api/HuaweiApiAvailability;

    move-result-object v5

    .line 838
    invoke-virtual {v5, v4}, Lcom/huawei/hms/api/HuaweiApiAvailability;->isUserResolvableError(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 839
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mResolvingError:Z

    .line 840
    const/16 v0, 0x66

    invoke-virtual {v5, p0, v4, v0}, Lcom/huawei/hms/api/HuaweiApiAvailability;->resolveError(Landroid/app/Activity;II)V

    .line 843
    :cond_2
    :goto_0
    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 4

    .line 853
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onConnectionSuspended, cause: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", IsConnected: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v3}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnected()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 854
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 249
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 250
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->setRequestedOrientation(I)V

    .line 251
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_activity_buscard_recharge:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->setContentView(I)V

    .line 252
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->initParams()Z

    move-result v0

    if-nez v0, :cond_0

    .line 254
    const-string v0, "PluginPay BuscardRechargeAcitvityinitParams failed!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 255
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->finish()V

    .line 256
    return-void

    .line 258
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->init()V

    .line 259
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1147
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v1, v0, :cond_0

    .line 1149
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1150
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-virtual {v0, v1}, Landroid/app/FragmentTransaction;->hide(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 1151
    sget v0, Lcom/huawei/wallet/R$string;->nfc_buscard_recharge_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->setTitle(I)V

    .line 1152
    const/4 v0, 0x1

    return v0

    .line 1155
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onPause()V
    .locals 1

    .line 1186
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isFinish:Z

    .line 1187
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onPause()V

    .line 1188
    return-void
.end method

.method public onSelectedCallback(I)V
    .locals 4

    .line 984
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 986
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-virtual {v0, v1}, Landroid/app/FragmentTransaction;->hide(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 987
    sget v0, Lcom/huawei/wallet/R$string;->nfc_buscard_recharge_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->setTitle(I)V

    .line 989
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 990
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->setRequest(Z)V

    .line 991
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isFinish:Z

    .line 992
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isFromWindow:Z

    .line 993
    sget v0, Lcom/huawei/wallet/R$string;->nfc_loading:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showLoadingDialog(IZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 995
    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    :cond_1
    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    .line 996
    :goto_0
    if-nez v3, :cond_3

    .line 997
    const-string v0, "onSelectedCallback paymethod is not ok"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 998
    return-void

    .line 1001
    :cond_3
    const/4 v0, 0x2

    if-ne p1, v0, :cond_5

    .line 1002
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mContext:Landroid/content/Context;

    const-string v1, "com.tencent.mm"

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/PackageUtil;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1003
    sget v0, Lcom/huawei/wallet/R$string;->huaweipay_wechat_pay_err_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showErrorDialog(Ljava/lang/String;)V

    .line 1004
    return-void

    .line 1006
    :cond_4
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->onSelectWXPay()V

    goto :goto_1

    .line 1008
    :cond_5
    const/4 v0, 0x1

    if-ne p1, v0, :cond_6

    .line 1009
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->onSelectHWPay()V

    .line 1011
    :cond_6
    :goto_1
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 263
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onStart()V

    .line 264
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->initHMS()V

    .line 265
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 266
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_1

    .line 267
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0, p0}, Lcom/huawei/hms/api/HuaweiApiClient;->connect(Landroid/app/Activity;)V

    goto :goto_0

    .line 270
    :cond_0
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHuaweiApiClient is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    :cond_1
    :goto_0
    return-void
.end method

.method public onStop()V
    .locals 2

    .line 276
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onStop()V

    .line 277
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->noteDialog:Lo/egs;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 278
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->noteDialog:Lo/egs;

    invoke-virtual {v0}, Lo/egs;->dismiss()V

    .line 279
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->dialogBuilder:Lo/egs$b;

    .line 280
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->noteDialog:Lo/egs;

    .line 282
    :cond_0
    return-void
.end method

.method public onWXPayCancel()V
    .locals 1

    .line 978
    const-string v0, "user canceled"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 979
    return-void
.end method

.method public onWXPayFail(I)V
    .locals 1

    .line 971
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_card_pay_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showToast(I)V

    .line 972
    const-string v0, "user pay failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 973
    return-void
.end method

.method public onWXPaySuccess()V
    .locals 3

    .line 951
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isFromWindow:Z

    if-eqz v0, :cond_0

    .line 952
    return-void

    .line 954
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 955
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->setRequest(Z)V

    .line 956
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isFinish:Z

    .line 957
    const-string v0, "onWXPaySuccess:trafficOrder is null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 958
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_card_recharge:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showLoadingDialog(IZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 959
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->queryAndHandleUnfinfishedOrders(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;)V

    goto :goto_0

    .line 962
    :cond_1
    const-string v0, "user success"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 963
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_card_recharge:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showLoadingDialog(IZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 964
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->recharge(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RechargeCallback;)V

    .line 967
    :goto_0
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 5

    .line 1160
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onWindowFocusChanged hasFocus : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1161
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isFinish:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->isRequest()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 1162
    :goto_0
    if-eqz v4, :cond_1

    .line 1163
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->payhandler:Landroid/os/Handler;

    const/16 v1, 0x68

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1165
    :cond_1
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onWindowFocusChanged(Z)V

    .line 1166
    return-void
.end method

.method public queryAndHandleUnfinishedOrderCallback(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V
    .locals 9

    .line 1044
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 1046
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 1047
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->destroyLoadingDialog()V

    .line 1048
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isHasUnfinfishedOrders:Z

    if-eqz v0, :cond_0

    .line 1049
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryAndHandleUnfinishedOrderCallback isHasUnfinfishedOrders : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isHasUnfinfishedOrders:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1050
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showToast(Ljava/lang/String;)V

    .line 1052
    :cond_0
    return-void

    .line 1055
    :cond_1
    if-eqz p3, :cond_2

    .line 1056
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryAndHandleUnfinishedOrderCallback total cnt : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1058
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryAndHandleUnfinishedOrderCallback resultType : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1059
    sparse-switch p2, :sswitch_data_0

    goto/16 :goto_0

    .line 1062
    :sswitch_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isHasUnfinfishedOrders:Z

    .line 1064
    goto :goto_1

    .line 1067
    :sswitch_1
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->destroyLoadingDialog()V

    .line 1068
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_card_recharge_success:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showToast(I)V

    .line 1069
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isHasUnfinfishedOrders:Z

    .line 1070
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->setResult(I)V

    .line 1071
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->finish()V

    .line 1072
    goto :goto_1

    .line 1075
    :sswitch_2
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->destroyLoadingDialog()V

    .line 1076
    goto :goto_1

    .line 1079
    :sswitch_3
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->destroyLoadingDialog()V

    .line 1080
    move-object v0, p0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_card_recharge_fail_dialog_content:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bus_card_balance_reach_limit:I

    .line 1081
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getAid()Ljava/lang/String;

    move-result-object v5

    .line 1080
    const/4 v3, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZZ)V

    .line 1083
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->finish()V

    .line 1084
    goto :goto_1

    .line 1086
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryAndHandleUnfinishedOrderCallback err, return resultType : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 1087
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->destroyLoadingDialog()V

    .line 1090
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x4b1 -> :sswitch_3
        0x2710 -> :sswitch_2
        0x2711 -> :sswitch_0
        0x2712 -> :sswitch_1
    .end sparse-switch
.end method

.method public queryCardNoticeCallback(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;>;)V"
        }
    .end annotation

    .line 1239
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1241
    const-string v0, "dismissQueryCardNoticeCallbackProgress, activity is finishing"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 1242
    return-void

    .line 1245
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 1246
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryCardNoticeCallback, noticeList size : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1248
    if-nez v2, :cond_1

    .line 1250
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->noticeLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1251
    return-void

    .line 1255
    :cond_1
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mNoticeList:Ljava/util/List;

    .line 1256
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->noticeLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1259
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->autoScrollTextView:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->setData(Ljava/util/List;)V

    .line 1260
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->autoScrollTextView:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->startAutoRun()V

    .line 1261
    return-void
.end method

.method public queryTrafficCardInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;)V
    .locals 2

    .line 710
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 712
    const-string v0, "PluginPay BuscardRechargeAcitvityqueryRechargeMoneyCallback, activity is finishing"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 713
    return-void

    .line 716
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->destroyLoadingDialog()V

    .line 717
    if-nez p1, :cond_1

    if-nez p2, :cond_2

    .line 719
    :cond_1
    const-string v0, "PluginPay BuscardRechargeAcitvityqueryRechargeMoneyCallback, query failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 720
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showNoNetDialog()V

    .line 721
    return-void

    .line 723
    :cond_2
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    .line 724
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getMode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->setPreMode(I)V

    .line 725
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->setPrename(Ljava/lang/String;)V

    .line 726
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->bindViews()V

    .line 727
    return-void
.end method

.method public rechargeCallback(I)V
    .locals 10

    .line 462
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 464
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const-string v1, "rechargeCallback failed. activity finished."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 465
    return-void

    .line 468
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->destroyLoadingDialog()V

    .line 469
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "rechargeCallback, resultCode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 470
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 473
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_card_recharge_success:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showToast(I)V

    .line 475
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->setResult(I)V

    .line 476
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->finish()V

    goto :goto_0

    .line 480
    :cond_1
    const-string v0, "PluginPay BuscardRechargeAcitvityrechargeCallback, recharge failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 481
    const-string v9, ""

    .line 482
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 484
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getAid()Ljava/lang/String;

    move-result-object v9

    .line 486
    :cond_2
    const/16 v0, 0x515

    if-eq p1, v0, :cond_3

    const/16 v0, 0x518

    if-eq p1, v0, :cond_3

    const/16 v0, 0x519

    if-ne p1, v0, :cond_4

    .line 490
    :cond_3
    move-object v0, p0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_card_recharge_fail_dialog_content:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 491
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    move-object v5, v9

    .line 490
    const/4 v3, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZZ)V

    goto :goto_0

    .line 496
    :cond_4
    move-object v0, p0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_card_recharge_fail_dialog_content:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->nfc_recharge_fail:I

    .line 497
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->mIssuerId:Ljava/lang/String;

    move-object v5, v9

    .line 496
    const/4 v3, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZZ)V

    .line 501
    :goto_0
    return-void
.end method

.method public refundCallback(I)V
    .locals 0

    .line 777
    return-void
.end method

.method protected startPay(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V
    .locals 5

    .line 566
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " order PayType  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getPayType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; order WxPayInfo : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getWxPayInfo()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getPayType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getWxPayInfo()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 568
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getWxPayInfo()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->pay(Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;Lcom/huawei/nfc/carrera/logic/wxpay/WXPayCallback;)Z

    move-result v4

    .line 569
    if-nez v4, :cond_0

    .line 570
    const-string v0, "applyRechargeOrderCallback, wxpay is fail"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 571
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->setRequest(Z)V

    .line 573
    :cond_0
    goto :goto_0

    .line 574
    :cond_1
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->startHWPay(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 576
    :goto_0
    return-void
.end method
